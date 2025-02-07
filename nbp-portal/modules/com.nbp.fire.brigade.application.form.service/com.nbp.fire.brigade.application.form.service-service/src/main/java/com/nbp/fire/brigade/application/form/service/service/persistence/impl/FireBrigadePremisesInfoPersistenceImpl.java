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

import com.nbp.fire.brigade.application.form.service.exception.NoSuchFireBrigadePremisesInfoException;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadePremisesInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadePremisesInfoTable;
import com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadePremisesInfoImpl;
import com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadePremisesInfoModelImpl;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadePremisesInfoPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadePremisesInfoUtil;
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
 * The persistence implementation for the fire brigade premises info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FireBrigadePremisesInfoPersistence.class)
public class FireBrigadePremisesInfoPersistenceImpl
	extends BasePersistenceImpl<FireBrigadePremisesInfo>
	implements FireBrigadePremisesInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FireBrigadePremisesInfoUtil</code> to access the fire brigade premises info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FireBrigadePremisesInfoImpl.class.getName();

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
	 * Returns the fire brigade premises info where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadePremisesInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade premises info
	 * @throws NoSuchFireBrigadePremisesInfoException if a matching fire brigade premises info could not be found
	 */
	@Override
	public FireBrigadePremisesInfo findBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadePremisesInfoException {

		FireBrigadePremisesInfo fireBrigadePremisesInfo =
			fetchBygetFireBrigadeByAppId(fireBrigadeApplicationId);

		if (fireBrigadePremisesInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("fireBrigadeApplicationId=");
			sb.append(fireBrigadeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFireBrigadePremisesInfoException(sb.toString());
		}

		return fireBrigadePremisesInfo;
	}

	/**
	 * Returns the fire brigade premises info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade premises info, or <code>null</code> if a matching fire brigade premises info could not be found
	 */
	@Override
	public FireBrigadePremisesInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId) {

		return fetchBygetFireBrigadeByAppId(fireBrigadeApplicationId, true);
	}

	/**
	 * Returns the fire brigade premises info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade premises info, or <code>null</code> if a matching fire brigade premises info could not be found
	 */
	@Override
	public FireBrigadePremisesInfo fetchBygetFireBrigadeByAppId(
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

		if (result instanceof FireBrigadePremisesInfo) {
			FireBrigadePremisesInfo fireBrigadePremisesInfo =
				(FireBrigadePremisesInfo)result;

			if (fireBrigadeApplicationId !=
					fireBrigadePremisesInfo.getFireBrigadeApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FIREBRIGADEPREMISESINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETFIREBRIGADEBYAPPID_FIREBRIGADEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(fireBrigadeApplicationId);

				List<FireBrigadePremisesInfo> list = query.list();

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
								"FireBrigadePremisesInfoPersistenceImpl.fetchBygetFireBrigadeByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FireBrigadePremisesInfo fireBrigadePremisesInfo = list.get(
						0);

					result = fireBrigadePremisesInfo;

					cacheResult(fireBrigadePremisesInfo);
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
			return (FireBrigadePremisesInfo)result;
		}
	}

	/**
	 * Removes the fire brigade premises info where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade premises info that was removed
	 */
	@Override
	public FireBrigadePremisesInfo removeBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadePremisesInfoException {

		FireBrigadePremisesInfo fireBrigadePremisesInfo =
			findBygetFireBrigadeByAppId(fireBrigadeApplicationId);

		return remove(fireBrigadePremisesInfo);
	}

	/**
	 * Returns the number of fire brigade premises infos where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade premises infos
	 */
	@Override
	public int countBygetFireBrigadeByAppId(long fireBrigadeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFireBrigadeByAppId;

		Object[] finderArgs = new Object[] {fireBrigadeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEPREMISESINFO_WHERE);

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
			"fireBrigadePremisesInfo.fireBrigadeApplicationId = ?";

	public FireBrigadePremisesInfoPersistenceImpl() {
		setModelClass(FireBrigadePremisesInfo.class);

		setModelImplClass(FireBrigadePremisesInfoImpl.class);
		setModelPKClass(long.class);

		setTable(FireBrigadePremisesInfoTable.INSTANCE);
	}

	/**
	 * Caches the fire brigade premises info in the entity cache if it is enabled.
	 *
	 * @param fireBrigadePremisesInfo the fire brigade premises info
	 */
	@Override
	public void cacheResult(FireBrigadePremisesInfo fireBrigadePremisesInfo) {
		entityCache.putResult(
			FireBrigadePremisesInfoImpl.class,
			fireBrigadePremisesInfo.getPrimaryKey(), fireBrigadePremisesInfo);

		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeByAppId,
			new Object[] {
				fireBrigadePremisesInfo.getFireBrigadeApplicationId()
			},
			fireBrigadePremisesInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the fire brigade premises infos in the entity cache if it is enabled.
	 *
	 * @param fireBrigadePremisesInfos the fire brigade premises infos
	 */
	@Override
	public void cacheResult(
		List<FireBrigadePremisesInfo> fireBrigadePremisesInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fireBrigadePremisesInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FireBrigadePremisesInfo fireBrigadePremisesInfo :
				fireBrigadePremisesInfos) {

			if (entityCache.getResult(
					FireBrigadePremisesInfoImpl.class,
					fireBrigadePremisesInfo.getPrimaryKey()) == null) {

				cacheResult(fireBrigadePremisesInfo);
			}
		}
	}

	/**
	 * Clears the cache for all fire brigade premises infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FireBrigadePremisesInfoImpl.class);

		finderCache.clearCache(FireBrigadePremisesInfoImpl.class);
	}

	/**
	 * Clears the cache for the fire brigade premises info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FireBrigadePremisesInfo fireBrigadePremisesInfo) {
		entityCache.removeResult(
			FireBrigadePremisesInfoImpl.class, fireBrigadePremisesInfo);
	}

	@Override
	public void clearCache(
		List<FireBrigadePremisesInfo> fireBrigadePremisesInfos) {

		for (FireBrigadePremisesInfo fireBrigadePremisesInfo :
				fireBrigadePremisesInfos) {

			entityCache.removeResult(
				FireBrigadePremisesInfoImpl.class, fireBrigadePremisesInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FireBrigadePremisesInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FireBrigadePremisesInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FireBrigadePremisesInfoModelImpl fireBrigadePremisesInfoModelImpl) {

		Object[] args = new Object[] {
			fireBrigadePremisesInfoModelImpl.getFireBrigadeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFireBrigadeByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeByAppId, args,
			fireBrigadePremisesInfoModelImpl);
	}

	/**
	 * Creates a new fire brigade premises info with the primary key. Does not add the fire brigade premises info to the database.
	 *
	 * @param fireBrigadePremisesInfoId the primary key for the new fire brigade premises info
	 * @return the new fire brigade premises info
	 */
	@Override
	public FireBrigadePremisesInfo create(long fireBrigadePremisesInfoId) {
		FireBrigadePremisesInfo fireBrigadePremisesInfo =
			new FireBrigadePremisesInfoImpl();

		fireBrigadePremisesInfo.setNew(true);
		fireBrigadePremisesInfo.setPrimaryKey(fireBrigadePremisesInfoId);

		fireBrigadePremisesInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return fireBrigadePremisesInfo;
	}

	/**
	 * Removes the fire brigade premises info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadePremisesInfoId the primary key of the fire brigade premises info
	 * @return the fire brigade premises info that was removed
	 * @throws NoSuchFireBrigadePremisesInfoException if a fire brigade premises info with the primary key could not be found
	 */
	@Override
	public FireBrigadePremisesInfo remove(long fireBrigadePremisesInfoId)
		throws NoSuchFireBrigadePremisesInfoException {

		return remove((Serializable)fireBrigadePremisesInfoId);
	}

	/**
	 * Removes the fire brigade premises info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fire brigade premises info
	 * @return the fire brigade premises info that was removed
	 * @throws NoSuchFireBrigadePremisesInfoException if a fire brigade premises info with the primary key could not be found
	 */
	@Override
	public FireBrigadePremisesInfo remove(Serializable primaryKey)
		throws NoSuchFireBrigadePremisesInfoException {

		Session session = null;

		try {
			session = openSession();

			FireBrigadePremisesInfo fireBrigadePremisesInfo =
				(FireBrigadePremisesInfo)session.get(
					FireBrigadePremisesInfoImpl.class, primaryKey);

			if (fireBrigadePremisesInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFireBrigadePremisesInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(fireBrigadePremisesInfo);
		}
		catch (NoSuchFireBrigadePremisesInfoException noSuchEntityException) {
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
	protected FireBrigadePremisesInfo removeImpl(
		FireBrigadePremisesInfo fireBrigadePremisesInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fireBrigadePremisesInfo)) {
				fireBrigadePremisesInfo = (FireBrigadePremisesInfo)session.get(
					FireBrigadePremisesInfoImpl.class,
					fireBrigadePremisesInfo.getPrimaryKeyObj());
			}

			if (fireBrigadePremisesInfo != null) {
				session.delete(fireBrigadePremisesInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (fireBrigadePremisesInfo != null) {
			clearCache(fireBrigadePremisesInfo);
		}

		return fireBrigadePremisesInfo;
	}

	@Override
	public FireBrigadePremisesInfo updateImpl(
		FireBrigadePremisesInfo fireBrigadePremisesInfo) {

		boolean isNew = fireBrigadePremisesInfo.isNew();

		if (!(fireBrigadePremisesInfo instanceof
				FireBrigadePremisesInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(fireBrigadePremisesInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					fireBrigadePremisesInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in fireBrigadePremisesInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FireBrigadePremisesInfo implementation " +
					fireBrigadePremisesInfo.getClass());
		}

		FireBrigadePremisesInfoModelImpl fireBrigadePremisesInfoModelImpl =
			(FireBrigadePremisesInfoModelImpl)fireBrigadePremisesInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (fireBrigadePremisesInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				fireBrigadePremisesInfo.setCreateDate(date);
			}
			else {
				fireBrigadePremisesInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!fireBrigadePremisesInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				fireBrigadePremisesInfo.setModifiedDate(date);
			}
			else {
				fireBrigadePremisesInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(fireBrigadePremisesInfo);
			}
			else {
				fireBrigadePremisesInfo =
					(FireBrigadePremisesInfo)session.merge(
						fireBrigadePremisesInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FireBrigadePremisesInfoImpl.class, fireBrigadePremisesInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(fireBrigadePremisesInfoModelImpl);

		if (isNew) {
			fireBrigadePremisesInfo.setNew(false);
		}

		fireBrigadePremisesInfo.resetOriginalValues();

		return fireBrigadePremisesInfo;
	}

	/**
	 * Returns the fire brigade premises info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fire brigade premises info
	 * @return the fire brigade premises info
	 * @throws NoSuchFireBrigadePremisesInfoException if a fire brigade premises info with the primary key could not be found
	 */
	@Override
	public FireBrigadePremisesInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFireBrigadePremisesInfoException {

		FireBrigadePremisesInfo fireBrigadePremisesInfo = fetchByPrimaryKey(
			primaryKey);

		if (fireBrigadePremisesInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFireBrigadePremisesInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return fireBrigadePremisesInfo;
	}

	/**
	 * Returns the fire brigade premises info with the primary key or throws a <code>NoSuchFireBrigadePremisesInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadePremisesInfoId the primary key of the fire brigade premises info
	 * @return the fire brigade premises info
	 * @throws NoSuchFireBrigadePremisesInfoException if a fire brigade premises info with the primary key could not be found
	 */
	@Override
	public FireBrigadePremisesInfo findByPrimaryKey(
			long fireBrigadePremisesInfoId)
		throws NoSuchFireBrigadePremisesInfoException {

		return findByPrimaryKey((Serializable)fireBrigadePremisesInfoId);
	}

	/**
	 * Returns the fire brigade premises info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadePremisesInfoId the primary key of the fire brigade premises info
	 * @return the fire brigade premises info, or <code>null</code> if a fire brigade premises info with the primary key could not be found
	 */
	@Override
	public FireBrigadePremisesInfo fetchByPrimaryKey(
		long fireBrigadePremisesInfoId) {

		return fetchByPrimaryKey((Serializable)fireBrigadePremisesInfoId);
	}

	/**
	 * Returns all the fire brigade premises infos.
	 *
	 * @return the fire brigade premises infos
	 */
	@Override
	public List<FireBrigadePremisesInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade premises infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePremisesInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade premises infos
	 * @param end the upper bound of the range of fire brigade premises infos (not inclusive)
	 * @return the range of fire brigade premises infos
	 */
	@Override
	public List<FireBrigadePremisesInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade premises infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePremisesInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade premises infos
	 * @param end the upper bound of the range of fire brigade premises infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade premises infos
	 */
	@Override
	public List<FireBrigadePremisesInfo> findAll(
		int start, int end,
		OrderByComparator<FireBrigadePremisesInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade premises infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePremisesInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade premises infos
	 * @param end the upper bound of the range of fire brigade premises infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade premises infos
	 */
	@Override
	public List<FireBrigadePremisesInfo> findAll(
		int start, int end,
		OrderByComparator<FireBrigadePremisesInfo> orderByComparator,
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

		List<FireBrigadePremisesInfo> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadePremisesInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FIREBRIGADEPREMISESINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FIREBRIGADEPREMISESINFO;

				sql = sql.concat(
					FireBrigadePremisesInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FireBrigadePremisesInfo>)QueryUtil.list(
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
	 * Removes all the fire brigade premises infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FireBrigadePremisesInfo fireBrigadePremisesInfo : findAll()) {
			remove(fireBrigadePremisesInfo);
		}
	}

	/**
	 * Returns the number of fire brigade premises infos.
	 *
	 * @return the number of fire brigade premises infos
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
					_SQL_COUNT_FIREBRIGADEPREMISESINFO);

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
		return "fireBrigadePremisesInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FIREBRIGADEPREMISESINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FireBrigadePremisesInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the fire brigade premises info persistence.
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

		FireBrigadePremisesInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FireBrigadePremisesInfoUtil.setPersistence(null);

		entityCache.removeCache(FireBrigadePremisesInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_FIREBRIGADEPREMISESINFO =
		"SELECT fireBrigadePremisesInfo FROM FireBrigadePremisesInfo fireBrigadePremisesInfo";

	private static final String _SQL_SELECT_FIREBRIGADEPREMISESINFO_WHERE =
		"SELECT fireBrigadePremisesInfo FROM FireBrigadePremisesInfo fireBrigadePremisesInfo WHERE ";

	private static final String _SQL_COUNT_FIREBRIGADEPREMISESINFO =
		"SELECT COUNT(fireBrigadePremisesInfo) FROM FireBrigadePremisesInfo fireBrigadePremisesInfo";

	private static final String _SQL_COUNT_FIREBRIGADEPREMISESINFO_WHERE =
		"SELECT COUNT(fireBrigadePremisesInfo) FROM FireBrigadePremisesInfo fireBrigadePremisesInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"fireBrigadePremisesInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FireBrigadePremisesInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FireBrigadePremisesInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FireBrigadePremisesInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}