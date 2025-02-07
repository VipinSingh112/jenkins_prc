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

import com.nbp.fire.brigade.application.form.service.exception.NoSuchFireBrigadeHazardousSubInfoException;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeHazardousSubInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeHazardousSubInfoTable;
import com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeHazardousSubInfoImpl;
import com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeHazardousSubInfoModelImpl;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeHazardousSubInfoPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeHazardousSubInfoUtil;
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
 * The persistence implementation for the fire brigade hazardous sub info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FireBrigadeHazardousSubInfoPersistence.class)
public class FireBrigadeHazardousSubInfoPersistenceImpl
	extends BasePersistenceImpl<FireBrigadeHazardousSubInfo>
	implements FireBrigadeHazardousSubInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FireBrigadeHazardousSubInfoUtil</code> to access the fire brigade hazardous sub info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FireBrigadeHazardousSubInfoImpl.class.getName();

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
	 * Returns the fire brigade hazardous sub info where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeHazardousSubInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade hazardous sub info
	 * @throws NoSuchFireBrigadeHazardousSubInfoException if a matching fire brigade hazardous sub info could not be found
	 */
	@Override
	public FireBrigadeHazardousSubInfo findBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeHazardousSubInfoException {

		FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo =
			fetchBygetFireBrigadeByAppId(fireBrigadeApplicationId);

		if (fireBrigadeHazardousSubInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("fireBrigadeApplicationId=");
			sb.append(fireBrigadeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFireBrigadeHazardousSubInfoException(sb.toString());
		}

		return fireBrigadeHazardousSubInfo;
	}

	/**
	 * Returns the fire brigade hazardous sub info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade hazardous sub info, or <code>null</code> if a matching fire brigade hazardous sub info could not be found
	 */
	@Override
	public FireBrigadeHazardousSubInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId) {

		return fetchBygetFireBrigadeByAppId(fireBrigadeApplicationId, true);
	}

	/**
	 * Returns the fire brigade hazardous sub info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade hazardous sub info, or <code>null</code> if a matching fire brigade hazardous sub info could not be found
	 */
	@Override
	public FireBrigadeHazardousSubInfo fetchBygetFireBrigadeByAppId(
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

		if (result instanceof FireBrigadeHazardousSubInfo) {
			FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo =
				(FireBrigadeHazardousSubInfo)result;

			if (fireBrigadeApplicationId !=
					fireBrigadeHazardousSubInfo.getFireBrigadeApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FIREBRIGADEHAZARDOUSSUBINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETFIREBRIGADEBYAPPID_FIREBRIGADEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(fireBrigadeApplicationId);

				List<FireBrigadeHazardousSubInfo> list = query.list();

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
								"FireBrigadeHazardousSubInfoPersistenceImpl.fetchBygetFireBrigadeByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo =
						list.get(0);

					result = fireBrigadeHazardousSubInfo;

					cacheResult(fireBrigadeHazardousSubInfo);
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
			return (FireBrigadeHazardousSubInfo)result;
		}
	}

	/**
	 * Removes the fire brigade hazardous sub info where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade hazardous sub info that was removed
	 */
	@Override
	public FireBrigadeHazardousSubInfo removeBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeHazardousSubInfoException {

		FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo =
			findBygetFireBrigadeByAppId(fireBrigadeApplicationId);

		return remove(fireBrigadeHazardousSubInfo);
	}

	/**
	 * Returns the number of fire brigade hazardous sub infos where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade hazardous sub infos
	 */
	@Override
	public int countBygetFireBrigadeByAppId(long fireBrigadeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFireBrigadeByAppId;

		Object[] finderArgs = new Object[] {fireBrigadeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEHAZARDOUSSUBINFO_WHERE);

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
			"fireBrigadeHazardousSubInfo.fireBrigadeApplicationId = ?";

	public FireBrigadeHazardousSubInfoPersistenceImpl() {
		setModelClass(FireBrigadeHazardousSubInfo.class);

		setModelImplClass(FireBrigadeHazardousSubInfoImpl.class);
		setModelPKClass(long.class);

		setTable(FireBrigadeHazardousSubInfoTable.INSTANCE);
	}

	/**
	 * Caches the fire brigade hazardous sub info in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeHazardousSubInfo the fire brigade hazardous sub info
	 */
	@Override
	public void cacheResult(
		FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo) {

		entityCache.putResult(
			FireBrigadeHazardousSubInfoImpl.class,
			fireBrigadeHazardousSubInfo.getPrimaryKey(),
			fireBrigadeHazardousSubInfo);

		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeByAppId,
			new Object[] {
				fireBrigadeHazardousSubInfo.getFireBrigadeApplicationId()
			},
			fireBrigadeHazardousSubInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the fire brigade hazardous sub infos in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeHazardousSubInfos the fire brigade hazardous sub infos
	 */
	@Override
	public void cacheResult(
		List<FireBrigadeHazardousSubInfo> fireBrigadeHazardousSubInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fireBrigadeHazardousSubInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo :
				fireBrigadeHazardousSubInfos) {

			if (entityCache.getResult(
					FireBrigadeHazardousSubInfoImpl.class,
					fireBrigadeHazardousSubInfo.getPrimaryKey()) == null) {

				cacheResult(fireBrigadeHazardousSubInfo);
			}
		}
	}

	/**
	 * Clears the cache for all fire brigade hazardous sub infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FireBrigadeHazardousSubInfoImpl.class);

		finderCache.clearCache(FireBrigadeHazardousSubInfoImpl.class);
	}

	/**
	 * Clears the cache for the fire brigade hazardous sub info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo) {

		entityCache.removeResult(
			FireBrigadeHazardousSubInfoImpl.class, fireBrigadeHazardousSubInfo);
	}

	@Override
	public void clearCache(
		List<FireBrigadeHazardousSubInfo> fireBrigadeHazardousSubInfos) {

		for (FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo :
				fireBrigadeHazardousSubInfos) {

			entityCache.removeResult(
				FireBrigadeHazardousSubInfoImpl.class,
				fireBrigadeHazardousSubInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FireBrigadeHazardousSubInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FireBrigadeHazardousSubInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FireBrigadeHazardousSubInfoModelImpl
			fireBrigadeHazardousSubInfoModelImpl) {

		Object[] args = new Object[] {
			fireBrigadeHazardousSubInfoModelImpl.getFireBrigadeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFireBrigadeByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeByAppId, args,
			fireBrigadeHazardousSubInfoModelImpl);
	}

	/**
	 * Creates a new fire brigade hazardous sub info with the primary key. Does not add the fire brigade hazardous sub info to the database.
	 *
	 * @param fireBrigadeHazardousSubInfoId the primary key for the new fire brigade hazardous sub info
	 * @return the new fire brigade hazardous sub info
	 */
	@Override
	public FireBrigadeHazardousSubInfo create(
		long fireBrigadeHazardousSubInfoId) {

		FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo =
			new FireBrigadeHazardousSubInfoImpl();

		fireBrigadeHazardousSubInfo.setNew(true);
		fireBrigadeHazardousSubInfo.setPrimaryKey(
			fireBrigadeHazardousSubInfoId);

		fireBrigadeHazardousSubInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return fireBrigadeHazardousSubInfo;
	}

	/**
	 * Removes the fire brigade hazardous sub info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeHazardousSubInfoId the primary key of the fire brigade hazardous sub info
	 * @return the fire brigade hazardous sub info that was removed
	 * @throws NoSuchFireBrigadeHazardousSubInfoException if a fire brigade hazardous sub info with the primary key could not be found
	 */
	@Override
	public FireBrigadeHazardousSubInfo remove(
			long fireBrigadeHazardousSubInfoId)
		throws NoSuchFireBrigadeHazardousSubInfoException {

		return remove((Serializable)fireBrigadeHazardousSubInfoId);
	}

	/**
	 * Removes the fire brigade hazardous sub info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fire brigade hazardous sub info
	 * @return the fire brigade hazardous sub info that was removed
	 * @throws NoSuchFireBrigadeHazardousSubInfoException if a fire brigade hazardous sub info with the primary key could not be found
	 */
	@Override
	public FireBrigadeHazardousSubInfo remove(Serializable primaryKey)
		throws NoSuchFireBrigadeHazardousSubInfoException {

		Session session = null;

		try {
			session = openSession();

			FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo =
				(FireBrigadeHazardousSubInfo)session.get(
					FireBrigadeHazardousSubInfoImpl.class, primaryKey);

			if (fireBrigadeHazardousSubInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFireBrigadeHazardousSubInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(fireBrigadeHazardousSubInfo);
		}
		catch (NoSuchFireBrigadeHazardousSubInfoException
					noSuchEntityException) {

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
	protected FireBrigadeHazardousSubInfo removeImpl(
		FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fireBrigadeHazardousSubInfo)) {
				fireBrigadeHazardousSubInfo =
					(FireBrigadeHazardousSubInfo)session.get(
						FireBrigadeHazardousSubInfoImpl.class,
						fireBrigadeHazardousSubInfo.getPrimaryKeyObj());
			}

			if (fireBrigadeHazardousSubInfo != null) {
				session.delete(fireBrigadeHazardousSubInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (fireBrigadeHazardousSubInfo != null) {
			clearCache(fireBrigadeHazardousSubInfo);
		}

		return fireBrigadeHazardousSubInfo;
	}

	@Override
	public FireBrigadeHazardousSubInfo updateImpl(
		FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo) {

		boolean isNew = fireBrigadeHazardousSubInfo.isNew();

		if (!(fireBrigadeHazardousSubInfo instanceof
				FireBrigadeHazardousSubInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					fireBrigadeHazardousSubInfo.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					fireBrigadeHazardousSubInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in fireBrigadeHazardousSubInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FireBrigadeHazardousSubInfo implementation " +
					fireBrigadeHazardousSubInfo.getClass());
		}

		FireBrigadeHazardousSubInfoModelImpl
			fireBrigadeHazardousSubInfoModelImpl =
				(FireBrigadeHazardousSubInfoModelImpl)
					fireBrigadeHazardousSubInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (fireBrigadeHazardousSubInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				fireBrigadeHazardousSubInfo.setCreateDate(date);
			}
			else {
				fireBrigadeHazardousSubInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!fireBrigadeHazardousSubInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				fireBrigadeHazardousSubInfo.setModifiedDate(date);
			}
			else {
				fireBrigadeHazardousSubInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(fireBrigadeHazardousSubInfo);
			}
			else {
				fireBrigadeHazardousSubInfo =
					(FireBrigadeHazardousSubInfo)session.merge(
						fireBrigadeHazardousSubInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FireBrigadeHazardousSubInfoImpl.class,
			fireBrigadeHazardousSubInfoModelImpl, false, true);

		cacheUniqueFindersCache(fireBrigadeHazardousSubInfoModelImpl);

		if (isNew) {
			fireBrigadeHazardousSubInfo.setNew(false);
		}

		fireBrigadeHazardousSubInfo.resetOriginalValues();

		return fireBrigadeHazardousSubInfo;
	}

	/**
	 * Returns the fire brigade hazardous sub info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fire brigade hazardous sub info
	 * @return the fire brigade hazardous sub info
	 * @throws NoSuchFireBrigadeHazardousSubInfoException if a fire brigade hazardous sub info with the primary key could not be found
	 */
	@Override
	public FireBrigadeHazardousSubInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFireBrigadeHazardousSubInfoException {

		FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo =
			fetchByPrimaryKey(primaryKey);

		if (fireBrigadeHazardousSubInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFireBrigadeHazardousSubInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return fireBrigadeHazardousSubInfo;
	}

	/**
	 * Returns the fire brigade hazardous sub info with the primary key or throws a <code>NoSuchFireBrigadeHazardousSubInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeHazardousSubInfoId the primary key of the fire brigade hazardous sub info
	 * @return the fire brigade hazardous sub info
	 * @throws NoSuchFireBrigadeHazardousSubInfoException if a fire brigade hazardous sub info with the primary key could not be found
	 */
	@Override
	public FireBrigadeHazardousSubInfo findByPrimaryKey(
			long fireBrigadeHazardousSubInfoId)
		throws NoSuchFireBrigadeHazardousSubInfoException {

		return findByPrimaryKey((Serializable)fireBrigadeHazardousSubInfoId);
	}

	/**
	 * Returns the fire brigade hazardous sub info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeHazardousSubInfoId the primary key of the fire brigade hazardous sub info
	 * @return the fire brigade hazardous sub info, or <code>null</code> if a fire brigade hazardous sub info with the primary key could not be found
	 */
	@Override
	public FireBrigadeHazardousSubInfo fetchByPrimaryKey(
		long fireBrigadeHazardousSubInfoId) {

		return fetchByPrimaryKey((Serializable)fireBrigadeHazardousSubInfoId);
	}

	/**
	 * Returns all the fire brigade hazardous sub infos.
	 *
	 * @return the fire brigade hazardous sub infos
	 */
	@Override
	public List<FireBrigadeHazardousSubInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade hazardous sub infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeHazardousSubInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade hazardous sub infos
	 * @param end the upper bound of the range of fire brigade hazardous sub infos (not inclusive)
	 * @return the range of fire brigade hazardous sub infos
	 */
	@Override
	public List<FireBrigadeHazardousSubInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade hazardous sub infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeHazardousSubInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade hazardous sub infos
	 * @param end the upper bound of the range of fire brigade hazardous sub infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade hazardous sub infos
	 */
	@Override
	public List<FireBrigadeHazardousSubInfo> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeHazardousSubInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade hazardous sub infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeHazardousSubInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade hazardous sub infos
	 * @param end the upper bound of the range of fire brigade hazardous sub infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade hazardous sub infos
	 */
	@Override
	public List<FireBrigadeHazardousSubInfo> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeHazardousSubInfo> orderByComparator,
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

		List<FireBrigadeHazardousSubInfo> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeHazardousSubInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FIREBRIGADEHAZARDOUSSUBINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FIREBRIGADEHAZARDOUSSUBINFO;

				sql = sql.concat(
					FireBrigadeHazardousSubInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FireBrigadeHazardousSubInfo>)QueryUtil.list(
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
	 * Removes all the fire brigade hazardous sub infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo :
				findAll()) {

			remove(fireBrigadeHazardousSubInfo);
		}
	}

	/**
	 * Returns the number of fire brigade hazardous sub infos.
	 *
	 * @return the number of fire brigade hazardous sub infos
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
					_SQL_COUNT_FIREBRIGADEHAZARDOUSSUBINFO);

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
		return "fireBrigadeHazardousSubInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FIREBRIGADEHAZARDOUSSUBINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FireBrigadeHazardousSubInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the fire brigade hazardous sub info persistence.
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

		FireBrigadeHazardousSubInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FireBrigadeHazardousSubInfoUtil.setPersistence(null);

		entityCache.removeCache(
			FireBrigadeHazardousSubInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_FIREBRIGADEHAZARDOUSSUBINFO =
		"SELECT fireBrigadeHazardousSubInfo FROM FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo";

	private static final String _SQL_SELECT_FIREBRIGADEHAZARDOUSSUBINFO_WHERE =
		"SELECT fireBrigadeHazardousSubInfo FROM FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo WHERE ";

	private static final String _SQL_COUNT_FIREBRIGADEHAZARDOUSSUBINFO =
		"SELECT COUNT(fireBrigadeHazardousSubInfo) FROM FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo";

	private static final String _SQL_COUNT_FIREBRIGADEHAZARDOUSSUBINFO_WHERE =
		"SELECT COUNT(fireBrigadeHazardousSubInfo) FROM FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"fireBrigadeHazardousSubInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FireBrigadeHazardousSubInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FireBrigadeHazardousSubInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FireBrigadeHazardousSubInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}