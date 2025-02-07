/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.fire.brigade.application.form.service.exception.NoSuchFireBrigadeCerPurposeInfoException;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeCerPurposeInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeCerPurposeInfoTable;
import com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeCerPurposeInfoImpl;
import com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeCerPurposeInfoModelImpl;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeCerPurposeInfoPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeCerPurposeInfoUtil;
import com.nbp.fire.brigade.application.form.service.service.persistence.impl.constants.FIRE_BRIGADEPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the fire brigade cer purpose info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FireBrigadeCerPurposeInfoPersistence.class)
public class FireBrigadeCerPurposeInfoPersistenceImpl
	extends BasePersistenceImpl<FireBrigadeCerPurposeInfo>
	implements FireBrigadeCerPurposeInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FireBrigadeCerPurposeInfoUtil</code> to access the fire brigade cer purpose info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FireBrigadeCerPurposeInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetFireBrigadeByAppId;
	private FinderPath _finderPathCountBygetFireBrigadeByAppId;

	/**
	 * Returns the fire brigade cer purpose info where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeCerPurposeInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade cer purpose info
	 * @throws NoSuchFireBrigadeCerPurposeInfoException if a matching fire brigade cer purpose info could not be found
	 */
	@Override
	public FireBrigadeCerPurposeInfo findBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeCerPurposeInfoException {

		FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo =
			fetchBygetFireBrigadeByAppId(fireBrigadeApplicationId);

		if (fireBrigadeCerPurposeInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("fireBrigadeApplicationId=");
			sb.append(fireBrigadeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFireBrigadeCerPurposeInfoException(sb.toString());
		}

		return fireBrigadeCerPurposeInfo;
	}

	/**
	 * Returns the fire brigade cer purpose info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade cer purpose info, or <code>null</code> if a matching fire brigade cer purpose info could not be found
	 */
	@Override
	public FireBrigadeCerPurposeInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId) {

		return fetchBygetFireBrigadeByAppId(fireBrigadeApplicationId, true);
	}

	/**
	 * Returns the fire brigade cer purpose info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade cer purpose info, or <code>null</code> if a matching fire brigade cer purpose info could not be found
	 */
	@Override
	public FireBrigadeCerPurposeInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {fireBrigadeApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFireBrigadeByAppId, finderArgs, this);
		}

		if (result instanceof FireBrigadeCerPurposeInfo) {
			FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo =
				(FireBrigadeCerPurposeInfo)result;

			if (fireBrigadeApplicationId !=
					fireBrigadeCerPurposeInfo.getFireBrigadeApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FIREBRIGADECERPURPOSEINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETFIREBRIGADEBYAPPID_FIREBRIGADEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(fireBrigadeApplicationId);

				List<FireBrigadeCerPurposeInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFireBrigadeByAppId, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									fireBrigadeApplicationId
								};
							}

							_log.warn(
								"FireBrigadeCerPurposeInfoPersistenceImpl.fetchBygetFireBrigadeByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo =
						list.get(0);

					result = fireBrigadeCerPurposeInfo;

					cacheResult(fireBrigadeCerPurposeInfo);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (FireBrigadeCerPurposeInfo)result;
		}
	}

	/**
	 * Removes the fire brigade cer purpose info where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade cer purpose info that was removed
	 */
	@Override
	public FireBrigadeCerPurposeInfo removeBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeCerPurposeInfoException {

		FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo =
			findBygetFireBrigadeByAppId(fireBrigadeApplicationId);

		return remove(fireBrigadeCerPurposeInfo);
	}

	/**
	 * Returns the number of fire brigade cer purpose infos where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade cer purpose infos
	 */
	@Override
	public int countBygetFireBrigadeByAppId(long fireBrigadeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFireBrigadeByAppId;

		Object[] finderArgs = new Object[] {fireBrigadeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADECERPURPOSEINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETFIREBRIGADEBYAPPID_FIREBRIGADEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(fireBrigadeApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETFIREBRIGADEBYAPPID_FIREBRIGADEAPPLICATIONID_2 =
			"fireBrigadeCerPurposeInfo.fireBrigadeApplicationId = ?";

	public FireBrigadeCerPurposeInfoPersistenceImpl() {
		setModelClass(FireBrigadeCerPurposeInfo.class);

		setModelImplClass(FireBrigadeCerPurposeInfoImpl.class);
		setModelPKClass(long.class);

		setTable(FireBrigadeCerPurposeInfoTable.INSTANCE);
	}

	/**
	 * Caches the fire brigade cer purpose info in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeCerPurposeInfo the fire brigade cer purpose info
	 */
	@Override
	public void cacheResult(
		FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo) {

		entityCache.putResult(
			FireBrigadeCerPurposeInfoImpl.class,
			fireBrigadeCerPurposeInfo.getPrimaryKey(),
			fireBrigadeCerPurposeInfo);

		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeByAppId,
			new Object[] {
				fireBrigadeCerPurposeInfo.getFireBrigadeApplicationId()
			},
			fireBrigadeCerPurposeInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the fire brigade cer purpose infos in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeCerPurposeInfos the fire brigade cer purpose infos
	 */
	@Override
	public void cacheResult(
		List<FireBrigadeCerPurposeInfo> fireBrigadeCerPurposeInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fireBrigadeCerPurposeInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo :
				fireBrigadeCerPurposeInfos) {

			if (entityCache.getResult(
					FireBrigadeCerPurposeInfoImpl.class,
					fireBrigadeCerPurposeInfo.getPrimaryKey()) == null) {

				cacheResult(fireBrigadeCerPurposeInfo);
			}
		}
	}

	/**
	 * Clears the cache for all fire brigade cer purpose infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FireBrigadeCerPurposeInfoImpl.class);

		finderCache.clearCache(FireBrigadeCerPurposeInfoImpl.class);
	}

	/**
	 * Clears the cache for the fire brigade cer purpose info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo) {

		entityCache.removeResult(
			FireBrigadeCerPurposeInfoImpl.class, fireBrigadeCerPurposeInfo);
	}

	@Override
	public void clearCache(
		List<FireBrigadeCerPurposeInfo> fireBrigadeCerPurposeInfos) {

		for (FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo :
				fireBrigadeCerPurposeInfos) {

			entityCache.removeResult(
				FireBrigadeCerPurposeInfoImpl.class, fireBrigadeCerPurposeInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FireBrigadeCerPurposeInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FireBrigadeCerPurposeInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FireBrigadeCerPurposeInfoModelImpl fireBrigadeCerPurposeInfoModelImpl) {

		Object[] args = new Object[] {
			fireBrigadeCerPurposeInfoModelImpl.getFireBrigadeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFireBrigadeByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeByAppId, args,
			fireBrigadeCerPurposeInfoModelImpl);
	}

	/**
	 * Creates a new fire brigade cer purpose info with the primary key. Does not add the fire brigade cer purpose info to the database.
	 *
	 * @param fireBrigadeCerPurposeInfoId the primary key for the new fire brigade cer purpose info
	 * @return the new fire brigade cer purpose info
	 */
	@Override
	public FireBrigadeCerPurposeInfo create(long fireBrigadeCerPurposeInfoId) {
		FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo =
			new FireBrigadeCerPurposeInfoImpl();

		fireBrigadeCerPurposeInfo.setNew(true);
		fireBrigadeCerPurposeInfo.setPrimaryKey(fireBrigadeCerPurposeInfoId);

		fireBrigadeCerPurposeInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return fireBrigadeCerPurposeInfo;
	}

	/**
	 * Removes the fire brigade cer purpose info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeCerPurposeInfoId the primary key of the fire brigade cer purpose info
	 * @return the fire brigade cer purpose info that was removed
	 * @throws NoSuchFireBrigadeCerPurposeInfoException if a fire brigade cer purpose info with the primary key could not be found
	 */
	@Override
	public FireBrigadeCerPurposeInfo remove(long fireBrigadeCerPurposeInfoId)
		throws NoSuchFireBrigadeCerPurposeInfoException {

		return remove((Serializable)fireBrigadeCerPurposeInfoId);
	}

	/**
	 * Removes the fire brigade cer purpose info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fire brigade cer purpose info
	 * @return the fire brigade cer purpose info that was removed
	 * @throws NoSuchFireBrigadeCerPurposeInfoException if a fire brigade cer purpose info with the primary key could not be found
	 */
	@Override
	public FireBrigadeCerPurposeInfo remove(Serializable primaryKey)
		throws NoSuchFireBrigadeCerPurposeInfoException {

		Session session = null;

		try {
			session = openSession();

			FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo =
				(FireBrigadeCerPurposeInfo)session.get(
					FireBrigadeCerPurposeInfoImpl.class, primaryKey);

			if (fireBrigadeCerPurposeInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFireBrigadeCerPurposeInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(fireBrigadeCerPurposeInfo);
		}
		catch (NoSuchFireBrigadeCerPurposeInfoException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected FireBrigadeCerPurposeInfo removeImpl(
		FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fireBrigadeCerPurposeInfo)) {
				fireBrigadeCerPurposeInfo =
					(FireBrigadeCerPurposeInfo)session.get(
						FireBrigadeCerPurposeInfoImpl.class,
						fireBrigadeCerPurposeInfo.getPrimaryKeyObj());
			}

			if (fireBrigadeCerPurposeInfo != null) {
				session.delete(fireBrigadeCerPurposeInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (fireBrigadeCerPurposeInfo != null) {
			clearCache(fireBrigadeCerPurposeInfo);
		}

		return fireBrigadeCerPurposeInfo;
	}

	@Override
	public FireBrigadeCerPurposeInfo updateImpl(
		FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo) {

		boolean isNew = fireBrigadeCerPurposeInfo.isNew();

		if (!(fireBrigadeCerPurposeInfo instanceof
				FireBrigadeCerPurposeInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(fireBrigadeCerPurposeInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					fireBrigadeCerPurposeInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in fireBrigadeCerPurposeInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FireBrigadeCerPurposeInfo implementation " +
					fireBrigadeCerPurposeInfo.getClass());
		}

		FireBrigadeCerPurposeInfoModelImpl fireBrigadeCerPurposeInfoModelImpl =
			(FireBrigadeCerPurposeInfoModelImpl)fireBrigadeCerPurposeInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (fireBrigadeCerPurposeInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				fireBrigadeCerPurposeInfo.setCreateDate(date);
			}
			else {
				fireBrigadeCerPurposeInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!fireBrigadeCerPurposeInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				fireBrigadeCerPurposeInfo.setModifiedDate(date);
			}
			else {
				fireBrigadeCerPurposeInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(fireBrigadeCerPurposeInfo);
			}
			else {
				fireBrigadeCerPurposeInfo =
					(FireBrigadeCerPurposeInfo)session.merge(
						fireBrigadeCerPurposeInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FireBrigadeCerPurposeInfoImpl.class,
			fireBrigadeCerPurposeInfoModelImpl, false, true);

		cacheUniqueFindersCache(fireBrigadeCerPurposeInfoModelImpl);

		if (isNew) {
			fireBrigadeCerPurposeInfo.setNew(false);
		}

		fireBrigadeCerPurposeInfo.resetOriginalValues();

		return fireBrigadeCerPurposeInfo;
	}

	/**
	 * Returns the fire brigade cer purpose info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fire brigade cer purpose info
	 * @return the fire brigade cer purpose info
	 * @throws NoSuchFireBrigadeCerPurposeInfoException if a fire brigade cer purpose info with the primary key could not be found
	 */
	@Override
	public FireBrigadeCerPurposeInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFireBrigadeCerPurposeInfoException {

		FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo = fetchByPrimaryKey(
			primaryKey);

		if (fireBrigadeCerPurposeInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFireBrigadeCerPurposeInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return fireBrigadeCerPurposeInfo;
	}

	/**
	 * Returns the fire brigade cer purpose info with the primary key or throws a <code>NoSuchFireBrigadeCerPurposeInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeCerPurposeInfoId the primary key of the fire brigade cer purpose info
	 * @return the fire brigade cer purpose info
	 * @throws NoSuchFireBrigadeCerPurposeInfoException if a fire brigade cer purpose info with the primary key could not be found
	 */
	@Override
	public FireBrigadeCerPurposeInfo findByPrimaryKey(
			long fireBrigadeCerPurposeInfoId)
		throws NoSuchFireBrigadeCerPurposeInfoException {

		return findByPrimaryKey((Serializable)fireBrigadeCerPurposeInfoId);
	}

	/**
	 * Returns the fire brigade cer purpose info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeCerPurposeInfoId the primary key of the fire brigade cer purpose info
	 * @return the fire brigade cer purpose info, or <code>null</code> if a fire brigade cer purpose info with the primary key could not be found
	 */
	@Override
	public FireBrigadeCerPurposeInfo fetchByPrimaryKey(
		long fireBrigadeCerPurposeInfoId) {

		return fetchByPrimaryKey((Serializable)fireBrigadeCerPurposeInfoId);
	}

	/**
	 * Returns all the fire brigade cer purpose infos.
	 *
	 * @return the fire brigade cer purpose infos
	 */
	@Override
	public List<FireBrigadeCerPurposeInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade cer purpose infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeCerPurposeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade cer purpose infos
	 * @param end the upper bound of the range of fire brigade cer purpose infos (not inclusive)
	 * @return the range of fire brigade cer purpose infos
	 */
	@Override
	public List<FireBrigadeCerPurposeInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade cer purpose infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeCerPurposeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade cer purpose infos
	 * @param end the upper bound of the range of fire brigade cer purpose infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade cer purpose infos
	 */
	@Override
	public List<FireBrigadeCerPurposeInfo> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeCerPurposeInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade cer purpose infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeCerPurposeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade cer purpose infos
	 * @param end the upper bound of the range of fire brigade cer purpose infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade cer purpose infos
	 */
	@Override
	public List<FireBrigadeCerPurposeInfo> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeCerPurposeInfo> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<FireBrigadeCerPurposeInfo> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeCerPurposeInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FIREBRIGADECERPURPOSEINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FIREBRIGADECERPURPOSEINFO;

				sql = sql.concat(
					FireBrigadeCerPurposeInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FireBrigadeCerPurposeInfo>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the fire brigade cer purpose infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo : findAll()) {
			remove(fireBrigadeCerPurposeInfo);
		}
	}

	/**
	 * Returns the number of fire brigade cer purpose infos.
	 *
	 * @return the number of fire brigade cer purpose infos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_FIREBRIGADECERPURPOSEINFO);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "fireBrigadeCerPurposeInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FIREBRIGADECERPURPOSEINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FireBrigadeCerPurposeInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the fire brigade cer purpose info persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathFetchBygetFireBrigadeByAppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFireBrigadeByAppId",
			new String[] {Long.class.getName()},
			new String[] {"fireBrigadeApplicationId"}, true);

		_finderPathCountBygetFireBrigadeByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFireBrigadeByAppId", new String[] {Long.class.getName()},
			new String[] {"fireBrigadeApplicationId"}, false);

		FireBrigadeCerPurposeInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FireBrigadeCerPurposeInfoUtil.setPersistence(null);

		entityCache.removeCache(FireBrigadeCerPurposeInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FIREBRIGADECERPURPOSEINFO =
		"SELECT fireBrigadeCerPurposeInfo FROM FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo";

	private static final String _SQL_SELECT_FIREBRIGADECERPURPOSEINFO_WHERE =
		"SELECT fireBrigadeCerPurposeInfo FROM FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo WHERE ";

	private static final String _SQL_COUNT_FIREBRIGADECERPURPOSEINFO =
		"SELECT COUNT(fireBrigadeCerPurposeInfo) FROM FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo";

	private static final String _SQL_COUNT_FIREBRIGADECERPURPOSEINFO_WHERE =
		"SELECT COUNT(fireBrigadeCerPurposeInfo) FROM FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"fireBrigadeCerPurposeInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FireBrigadeCerPurposeInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FireBrigadeCerPurposeInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FireBrigadeCerPurposeInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}