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

import com.nbp.fire.brigade.application.form.service.exception.NoSuchFireBrigadeMultFloorInfoException;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeMultFloorInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeMultFloorInfoTable;
import com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeMultFloorInfoImpl;
import com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeMultFloorInfoModelImpl;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeMultFloorInfoPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeMultFloorInfoUtil;
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
 * The persistence implementation for the fire brigade mult floor info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FireBrigadeMultFloorInfoPersistence.class)
public class FireBrigadeMultFloorInfoPersistenceImpl
	extends BasePersistenceImpl<FireBrigadeMultFloorInfo>
	implements FireBrigadeMultFloorInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FireBrigadeMultFloorInfoUtil</code> to access the fire brigade mult floor info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FireBrigadeMultFloorInfoImpl.class.getName();

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
	 * Returns the fire brigade mult floor info where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeMultFloorInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade mult floor info
	 * @throws NoSuchFireBrigadeMultFloorInfoException if a matching fire brigade mult floor info could not be found
	 */
	@Override
	public FireBrigadeMultFloorInfo findBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeMultFloorInfoException {

		FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo =
			fetchBygetFireBrigadeByAppId(fireBrigadeApplicationId);

		if (fireBrigadeMultFloorInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("fireBrigadeApplicationId=");
			sb.append(fireBrigadeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFireBrigadeMultFloorInfoException(sb.toString());
		}

		return fireBrigadeMultFloorInfo;
	}

	/**
	 * Returns the fire brigade mult floor info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade mult floor info, or <code>null</code> if a matching fire brigade mult floor info could not be found
	 */
	@Override
	public FireBrigadeMultFloorInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId) {

		return fetchBygetFireBrigadeByAppId(fireBrigadeApplicationId, true);
	}

	/**
	 * Returns the fire brigade mult floor info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade mult floor info, or <code>null</code> if a matching fire brigade mult floor info could not be found
	 */
	@Override
	public FireBrigadeMultFloorInfo fetchBygetFireBrigadeByAppId(
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

		if (result instanceof FireBrigadeMultFloorInfo) {
			FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo =
				(FireBrigadeMultFloorInfo)result;

			if (fireBrigadeApplicationId !=
					fireBrigadeMultFloorInfo.getFireBrigadeApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FIREBRIGADEMULTFLOORINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETFIREBRIGADEBYAPPID_FIREBRIGADEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(fireBrigadeApplicationId);

				List<FireBrigadeMultFloorInfo> list = query.list();

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
								"FireBrigadeMultFloorInfoPersistenceImpl.fetchBygetFireBrigadeByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo =
						list.get(0);

					result = fireBrigadeMultFloorInfo;

					cacheResult(fireBrigadeMultFloorInfo);
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
			return (FireBrigadeMultFloorInfo)result;
		}
	}

	/**
	 * Removes the fire brigade mult floor info where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade mult floor info that was removed
	 */
	@Override
	public FireBrigadeMultFloorInfo removeBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeMultFloorInfoException {

		FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo =
			findBygetFireBrigadeByAppId(fireBrigadeApplicationId);

		return remove(fireBrigadeMultFloorInfo);
	}

	/**
	 * Returns the number of fire brigade mult floor infos where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade mult floor infos
	 */
	@Override
	public int countBygetFireBrigadeByAppId(long fireBrigadeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFireBrigadeByAppId;

		Object[] finderArgs = new Object[] {fireBrigadeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEMULTFLOORINFO_WHERE);

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
			"fireBrigadeMultFloorInfo.fireBrigadeApplicationId = ?";

	public FireBrigadeMultFloorInfoPersistenceImpl() {
		setModelClass(FireBrigadeMultFloorInfo.class);

		setModelImplClass(FireBrigadeMultFloorInfoImpl.class);
		setModelPKClass(long.class);

		setTable(FireBrigadeMultFloorInfoTable.INSTANCE);
	}

	/**
	 * Caches the fire brigade mult floor info in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeMultFloorInfo the fire brigade mult floor info
	 */
	@Override
	public void cacheResult(FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo) {
		entityCache.putResult(
			FireBrigadeMultFloorInfoImpl.class,
			fireBrigadeMultFloorInfo.getPrimaryKey(), fireBrigadeMultFloorInfo);

		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeByAppId,
			new Object[] {
				fireBrigadeMultFloorInfo.getFireBrigadeApplicationId()
			},
			fireBrigadeMultFloorInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the fire brigade mult floor infos in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeMultFloorInfos the fire brigade mult floor infos
	 */
	@Override
	public void cacheResult(
		List<FireBrigadeMultFloorInfo> fireBrigadeMultFloorInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fireBrigadeMultFloorInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo :
				fireBrigadeMultFloorInfos) {

			if (entityCache.getResult(
					FireBrigadeMultFloorInfoImpl.class,
					fireBrigadeMultFloorInfo.getPrimaryKey()) == null) {

				cacheResult(fireBrigadeMultFloorInfo);
			}
		}
	}

	/**
	 * Clears the cache for all fire brigade mult floor infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FireBrigadeMultFloorInfoImpl.class);

		finderCache.clearCache(FireBrigadeMultFloorInfoImpl.class);
	}

	/**
	 * Clears the cache for the fire brigade mult floor info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo) {
		entityCache.removeResult(
			FireBrigadeMultFloorInfoImpl.class, fireBrigadeMultFloorInfo);
	}

	@Override
	public void clearCache(
		List<FireBrigadeMultFloorInfo> fireBrigadeMultFloorInfos) {

		for (FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo :
				fireBrigadeMultFloorInfos) {

			entityCache.removeResult(
				FireBrigadeMultFloorInfoImpl.class, fireBrigadeMultFloorInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FireBrigadeMultFloorInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FireBrigadeMultFloorInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FireBrigadeMultFloorInfoModelImpl fireBrigadeMultFloorInfoModelImpl) {

		Object[] args = new Object[] {
			fireBrigadeMultFloorInfoModelImpl.getFireBrigadeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFireBrigadeByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeByAppId, args,
			fireBrigadeMultFloorInfoModelImpl);
	}

	/**
	 * Creates a new fire brigade mult floor info with the primary key. Does not add the fire brigade mult floor info to the database.
	 *
	 * @param fireBrigadeMultFloorInfoId the primary key for the new fire brigade mult floor info
	 * @return the new fire brigade mult floor info
	 */
	@Override
	public FireBrigadeMultFloorInfo create(long fireBrigadeMultFloorInfoId) {
		FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo =
			new FireBrigadeMultFloorInfoImpl();

		fireBrigadeMultFloorInfo.setNew(true);
		fireBrigadeMultFloorInfo.setPrimaryKey(fireBrigadeMultFloorInfoId);

		fireBrigadeMultFloorInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return fireBrigadeMultFloorInfo;
	}

	/**
	 * Removes the fire brigade mult floor info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeMultFloorInfoId the primary key of the fire brigade mult floor info
	 * @return the fire brigade mult floor info that was removed
	 * @throws NoSuchFireBrigadeMultFloorInfoException if a fire brigade mult floor info with the primary key could not be found
	 */
	@Override
	public FireBrigadeMultFloorInfo remove(long fireBrigadeMultFloorInfoId)
		throws NoSuchFireBrigadeMultFloorInfoException {

		return remove((Serializable)fireBrigadeMultFloorInfoId);
	}

	/**
	 * Removes the fire brigade mult floor info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fire brigade mult floor info
	 * @return the fire brigade mult floor info that was removed
	 * @throws NoSuchFireBrigadeMultFloorInfoException if a fire brigade mult floor info with the primary key could not be found
	 */
	@Override
	public FireBrigadeMultFloorInfo remove(Serializable primaryKey)
		throws NoSuchFireBrigadeMultFloorInfoException {

		Session session = null;

		try {
			session = openSession();

			FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo =
				(FireBrigadeMultFloorInfo)session.get(
					FireBrigadeMultFloorInfoImpl.class, primaryKey);

			if (fireBrigadeMultFloorInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFireBrigadeMultFloorInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(fireBrigadeMultFloorInfo);
		}
		catch (NoSuchFireBrigadeMultFloorInfoException noSuchEntityException) {
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
	protected FireBrigadeMultFloorInfo removeImpl(
		FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fireBrigadeMultFloorInfo)) {
				fireBrigadeMultFloorInfo =
					(FireBrigadeMultFloorInfo)session.get(
						FireBrigadeMultFloorInfoImpl.class,
						fireBrigadeMultFloorInfo.getPrimaryKeyObj());
			}

			if (fireBrigadeMultFloorInfo != null) {
				session.delete(fireBrigadeMultFloorInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (fireBrigadeMultFloorInfo != null) {
			clearCache(fireBrigadeMultFloorInfo);
		}

		return fireBrigadeMultFloorInfo;
	}

	@Override
	public FireBrigadeMultFloorInfo updateImpl(
		FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo) {

		boolean isNew = fireBrigadeMultFloorInfo.isNew();

		if (!(fireBrigadeMultFloorInfo instanceof
				FireBrigadeMultFloorInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(fireBrigadeMultFloorInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					fireBrigadeMultFloorInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in fireBrigadeMultFloorInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FireBrigadeMultFloorInfo implementation " +
					fireBrigadeMultFloorInfo.getClass());
		}

		FireBrigadeMultFloorInfoModelImpl fireBrigadeMultFloorInfoModelImpl =
			(FireBrigadeMultFloorInfoModelImpl)fireBrigadeMultFloorInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (fireBrigadeMultFloorInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				fireBrigadeMultFloorInfo.setCreateDate(date);
			}
			else {
				fireBrigadeMultFloorInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!fireBrigadeMultFloorInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				fireBrigadeMultFloorInfo.setModifiedDate(date);
			}
			else {
				fireBrigadeMultFloorInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(fireBrigadeMultFloorInfo);
			}
			else {
				fireBrigadeMultFloorInfo =
					(FireBrigadeMultFloorInfo)session.merge(
						fireBrigadeMultFloorInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FireBrigadeMultFloorInfoImpl.class,
			fireBrigadeMultFloorInfoModelImpl, false, true);

		cacheUniqueFindersCache(fireBrigadeMultFloorInfoModelImpl);

		if (isNew) {
			fireBrigadeMultFloorInfo.setNew(false);
		}

		fireBrigadeMultFloorInfo.resetOriginalValues();

		return fireBrigadeMultFloorInfo;
	}

	/**
	 * Returns the fire brigade mult floor info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fire brigade mult floor info
	 * @return the fire brigade mult floor info
	 * @throws NoSuchFireBrigadeMultFloorInfoException if a fire brigade mult floor info with the primary key could not be found
	 */
	@Override
	public FireBrigadeMultFloorInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFireBrigadeMultFloorInfoException {

		FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo = fetchByPrimaryKey(
			primaryKey);

		if (fireBrigadeMultFloorInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFireBrigadeMultFloorInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return fireBrigadeMultFloorInfo;
	}

	/**
	 * Returns the fire brigade mult floor info with the primary key or throws a <code>NoSuchFireBrigadeMultFloorInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeMultFloorInfoId the primary key of the fire brigade mult floor info
	 * @return the fire brigade mult floor info
	 * @throws NoSuchFireBrigadeMultFloorInfoException if a fire brigade mult floor info with the primary key could not be found
	 */
	@Override
	public FireBrigadeMultFloorInfo findByPrimaryKey(
			long fireBrigadeMultFloorInfoId)
		throws NoSuchFireBrigadeMultFloorInfoException {

		return findByPrimaryKey((Serializable)fireBrigadeMultFloorInfoId);
	}

	/**
	 * Returns the fire brigade mult floor info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeMultFloorInfoId the primary key of the fire brigade mult floor info
	 * @return the fire brigade mult floor info, or <code>null</code> if a fire brigade mult floor info with the primary key could not be found
	 */
	@Override
	public FireBrigadeMultFloorInfo fetchByPrimaryKey(
		long fireBrigadeMultFloorInfoId) {

		return fetchByPrimaryKey((Serializable)fireBrigadeMultFloorInfoId);
	}

	/**
	 * Returns all the fire brigade mult floor infos.
	 *
	 * @return the fire brigade mult floor infos
	 */
	@Override
	public List<FireBrigadeMultFloorInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade mult floor infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeMultFloorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade mult floor infos
	 * @param end the upper bound of the range of fire brigade mult floor infos (not inclusive)
	 * @return the range of fire brigade mult floor infos
	 */
	@Override
	public List<FireBrigadeMultFloorInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade mult floor infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeMultFloorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade mult floor infos
	 * @param end the upper bound of the range of fire brigade mult floor infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade mult floor infos
	 */
	@Override
	public List<FireBrigadeMultFloorInfo> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeMultFloorInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade mult floor infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeMultFloorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade mult floor infos
	 * @param end the upper bound of the range of fire brigade mult floor infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade mult floor infos
	 */
	@Override
	public List<FireBrigadeMultFloorInfo> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeMultFloorInfo> orderByComparator,
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

		List<FireBrigadeMultFloorInfo> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeMultFloorInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FIREBRIGADEMULTFLOORINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FIREBRIGADEMULTFLOORINFO;

				sql = sql.concat(
					FireBrigadeMultFloorInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FireBrigadeMultFloorInfo>)QueryUtil.list(
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
	 * Removes all the fire brigade mult floor infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo : findAll()) {
			remove(fireBrigadeMultFloorInfo);
		}
	}

	/**
	 * Returns the number of fire brigade mult floor infos.
	 *
	 * @return the number of fire brigade mult floor infos
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
					_SQL_COUNT_FIREBRIGADEMULTFLOORINFO);

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
		return "fireBrigadeMultFloorInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FIREBRIGADEMULTFLOORINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FireBrigadeMultFloorInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the fire brigade mult floor info persistence.
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

		FireBrigadeMultFloorInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FireBrigadeMultFloorInfoUtil.setPersistence(null);

		entityCache.removeCache(FireBrigadeMultFloorInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_FIREBRIGADEMULTFLOORINFO =
		"SELECT fireBrigadeMultFloorInfo FROM FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo";

	private static final String _SQL_SELECT_FIREBRIGADEMULTFLOORINFO_WHERE =
		"SELECT fireBrigadeMultFloorInfo FROM FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo WHERE ";

	private static final String _SQL_COUNT_FIREBRIGADEMULTFLOORINFO =
		"SELECT COUNT(fireBrigadeMultFloorInfo) FROM FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo";

	private static final String _SQL_COUNT_FIREBRIGADEMULTFLOORINFO_WHERE =
		"SELECT COUNT(fireBrigadeMultFloorInfo) FROM FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"fireBrigadeMultFloorInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FireBrigadeMultFloorInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FireBrigadeMultFloorInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FireBrigadeMultFloorInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}