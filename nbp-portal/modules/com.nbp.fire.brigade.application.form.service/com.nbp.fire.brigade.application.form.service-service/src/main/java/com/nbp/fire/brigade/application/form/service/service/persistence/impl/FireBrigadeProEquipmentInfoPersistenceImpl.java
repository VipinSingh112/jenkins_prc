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

import com.nbp.fire.brigade.application.form.service.exception.NoSuchFireBrigadeProEquipmentInfoException;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeProEquipmentInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeProEquipmentInfoTable;
import com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeProEquipmentInfoImpl;
import com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeProEquipmentInfoModelImpl;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeProEquipmentInfoPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeProEquipmentInfoUtil;
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
 * The persistence implementation for the fire brigade pro equipment info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FireBrigadeProEquipmentInfoPersistence.class)
public class FireBrigadeProEquipmentInfoPersistenceImpl
	extends BasePersistenceImpl<FireBrigadeProEquipmentInfo>
	implements FireBrigadeProEquipmentInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FireBrigadeProEquipmentInfoUtil</code> to access the fire brigade pro equipment info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FireBrigadeProEquipmentInfoImpl.class.getName();

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
	 * Returns the fire brigade pro equipment info where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeProEquipmentInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade pro equipment info
	 * @throws NoSuchFireBrigadeProEquipmentInfoException if a matching fire brigade pro equipment info could not be found
	 */
	@Override
	public FireBrigadeProEquipmentInfo findBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeProEquipmentInfoException {

		FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo =
			fetchBygetFireBrigadeByAppId(fireBrigadeApplicationId);

		if (fireBrigadeProEquipmentInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("fireBrigadeApplicationId=");
			sb.append(fireBrigadeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFireBrigadeProEquipmentInfoException(sb.toString());
		}

		return fireBrigadeProEquipmentInfo;
	}

	/**
	 * Returns the fire brigade pro equipment info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade pro equipment info, or <code>null</code> if a matching fire brigade pro equipment info could not be found
	 */
	@Override
	public FireBrigadeProEquipmentInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId) {

		return fetchBygetFireBrigadeByAppId(fireBrigadeApplicationId, true);
	}

	/**
	 * Returns the fire brigade pro equipment info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade pro equipment info, or <code>null</code> if a matching fire brigade pro equipment info could not be found
	 */
	@Override
	public FireBrigadeProEquipmentInfo fetchBygetFireBrigadeByAppId(
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

		if (result instanceof FireBrigadeProEquipmentInfo) {
			FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo =
				(FireBrigadeProEquipmentInfo)result;

			if (fireBrigadeApplicationId !=
					fireBrigadeProEquipmentInfo.getFireBrigadeApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FIREBRIGADEPROEQUIPMENTINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETFIREBRIGADEBYAPPID_FIREBRIGADEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(fireBrigadeApplicationId);

				List<FireBrigadeProEquipmentInfo> list = query.list();

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
								"FireBrigadeProEquipmentInfoPersistenceImpl.fetchBygetFireBrigadeByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo =
						list.get(0);

					result = fireBrigadeProEquipmentInfo;

					cacheResult(fireBrigadeProEquipmentInfo);
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
			return (FireBrigadeProEquipmentInfo)result;
		}
	}

	/**
	 * Removes the fire brigade pro equipment info where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade pro equipment info that was removed
	 */
	@Override
	public FireBrigadeProEquipmentInfo removeBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeProEquipmentInfoException {

		FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo =
			findBygetFireBrigadeByAppId(fireBrigadeApplicationId);

		return remove(fireBrigadeProEquipmentInfo);
	}

	/**
	 * Returns the number of fire brigade pro equipment infos where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade pro equipment infos
	 */
	@Override
	public int countBygetFireBrigadeByAppId(long fireBrigadeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFireBrigadeByAppId;

		Object[] finderArgs = new Object[] {fireBrigadeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEPROEQUIPMENTINFO_WHERE);

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
			"fireBrigadeProEquipmentInfo.fireBrigadeApplicationId = ?";

	public FireBrigadeProEquipmentInfoPersistenceImpl() {
		setModelClass(FireBrigadeProEquipmentInfo.class);

		setModelImplClass(FireBrigadeProEquipmentInfoImpl.class);
		setModelPKClass(long.class);

		setTable(FireBrigadeProEquipmentInfoTable.INSTANCE);
	}

	/**
	 * Caches the fire brigade pro equipment info in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeProEquipmentInfo the fire brigade pro equipment info
	 */
	@Override
	public void cacheResult(
		FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo) {

		entityCache.putResult(
			FireBrigadeProEquipmentInfoImpl.class,
			fireBrigadeProEquipmentInfo.getPrimaryKey(),
			fireBrigadeProEquipmentInfo);

		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeByAppId,
			new Object[] {
				fireBrigadeProEquipmentInfo.getFireBrigadeApplicationId()
			},
			fireBrigadeProEquipmentInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the fire brigade pro equipment infos in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeProEquipmentInfos the fire brigade pro equipment infos
	 */
	@Override
	public void cacheResult(
		List<FireBrigadeProEquipmentInfo> fireBrigadeProEquipmentInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fireBrigadeProEquipmentInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo :
				fireBrigadeProEquipmentInfos) {

			if (entityCache.getResult(
					FireBrigadeProEquipmentInfoImpl.class,
					fireBrigadeProEquipmentInfo.getPrimaryKey()) == null) {

				cacheResult(fireBrigadeProEquipmentInfo);
			}
		}
	}

	/**
	 * Clears the cache for all fire brigade pro equipment infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FireBrigadeProEquipmentInfoImpl.class);

		finderCache.clearCache(FireBrigadeProEquipmentInfoImpl.class);
	}

	/**
	 * Clears the cache for the fire brigade pro equipment info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo) {

		entityCache.removeResult(
			FireBrigadeProEquipmentInfoImpl.class, fireBrigadeProEquipmentInfo);
	}

	@Override
	public void clearCache(
		List<FireBrigadeProEquipmentInfo> fireBrigadeProEquipmentInfos) {

		for (FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo :
				fireBrigadeProEquipmentInfos) {

			entityCache.removeResult(
				FireBrigadeProEquipmentInfoImpl.class,
				fireBrigadeProEquipmentInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FireBrigadeProEquipmentInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FireBrigadeProEquipmentInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FireBrigadeProEquipmentInfoModelImpl
			fireBrigadeProEquipmentInfoModelImpl) {

		Object[] args = new Object[] {
			fireBrigadeProEquipmentInfoModelImpl.getFireBrigadeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFireBrigadeByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeByAppId, args,
			fireBrigadeProEquipmentInfoModelImpl);
	}

	/**
	 * Creates a new fire brigade pro equipment info with the primary key. Does not add the fire brigade pro equipment info to the database.
	 *
	 * @param fireBrigadeProEquipmentInfoId the primary key for the new fire brigade pro equipment info
	 * @return the new fire brigade pro equipment info
	 */
	@Override
	public FireBrigadeProEquipmentInfo create(
		long fireBrigadeProEquipmentInfoId) {

		FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo =
			new FireBrigadeProEquipmentInfoImpl();

		fireBrigadeProEquipmentInfo.setNew(true);
		fireBrigadeProEquipmentInfo.setPrimaryKey(
			fireBrigadeProEquipmentInfoId);

		fireBrigadeProEquipmentInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return fireBrigadeProEquipmentInfo;
	}

	/**
	 * Removes the fire brigade pro equipment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeProEquipmentInfoId the primary key of the fire brigade pro equipment info
	 * @return the fire brigade pro equipment info that was removed
	 * @throws NoSuchFireBrigadeProEquipmentInfoException if a fire brigade pro equipment info with the primary key could not be found
	 */
	@Override
	public FireBrigadeProEquipmentInfo remove(
			long fireBrigadeProEquipmentInfoId)
		throws NoSuchFireBrigadeProEquipmentInfoException {

		return remove((Serializable)fireBrigadeProEquipmentInfoId);
	}

	/**
	 * Removes the fire brigade pro equipment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fire brigade pro equipment info
	 * @return the fire brigade pro equipment info that was removed
	 * @throws NoSuchFireBrigadeProEquipmentInfoException if a fire brigade pro equipment info with the primary key could not be found
	 */
	@Override
	public FireBrigadeProEquipmentInfo remove(Serializable primaryKey)
		throws NoSuchFireBrigadeProEquipmentInfoException {

		Session session = null;

		try {
			session = openSession();

			FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo =
				(FireBrigadeProEquipmentInfo)session.get(
					FireBrigadeProEquipmentInfoImpl.class, primaryKey);

			if (fireBrigadeProEquipmentInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFireBrigadeProEquipmentInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(fireBrigadeProEquipmentInfo);
		}
		catch (NoSuchFireBrigadeProEquipmentInfoException
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
	protected FireBrigadeProEquipmentInfo removeImpl(
		FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fireBrigadeProEquipmentInfo)) {
				fireBrigadeProEquipmentInfo =
					(FireBrigadeProEquipmentInfo)session.get(
						FireBrigadeProEquipmentInfoImpl.class,
						fireBrigadeProEquipmentInfo.getPrimaryKeyObj());
			}

			if (fireBrigadeProEquipmentInfo != null) {
				session.delete(fireBrigadeProEquipmentInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (fireBrigadeProEquipmentInfo != null) {
			clearCache(fireBrigadeProEquipmentInfo);
		}

		return fireBrigadeProEquipmentInfo;
	}

	@Override
	public FireBrigadeProEquipmentInfo updateImpl(
		FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo) {

		boolean isNew = fireBrigadeProEquipmentInfo.isNew();

		if (!(fireBrigadeProEquipmentInfo instanceof
				FireBrigadeProEquipmentInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					fireBrigadeProEquipmentInfo.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					fireBrigadeProEquipmentInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in fireBrigadeProEquipmentInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FireBrigadeProEquipmentInfo implementation " +
					fireBrigadeProEquipmentInfo.getClass());
		}

		FireBrigadeProEquipmentInfoModelImpl
			fireBrigadeProEquipmentInfoModelImpl =
				(FireBrigadeProEquipmentInfoModelImpl)
					fireBrigadeProEquipmentInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (fireBrigadeProEquipmentInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				fireBrigadeProEquipmentInfo.setCreateDate(date);
			}
			else {
				fireBrigadeProEquipmentInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!fireBrigadeProEquipmentInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				fireBrigadeProEquipmentInfo.setModifiedDate(date);
			}
			else {
				fireBrigadeProEquipmentInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(fireBrigadeProEquipmentInfo);
			}
			else {
				fireBrigadeProEquipmentInfo =
					(FireBrigadeProEquipmentInfo)session.merge(
						fireBrigadeProEquipmentInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FireBrigadeProEquipmentInfoImpl.class,
			fireBrigadeProEquipmentInfoModelImpl, false, true);

		cacheUniqueFindersCache(fireBrigadeProEquipmentInfoModelImpl);

		if (isNew) {
			fireBrigadeProEquipmentInfo.setNew(false);
		}

		fireBrigadeProEquipmentInfo.resetOriginalValues();

		return fireBrigadeProEquipmentInfo;
	}

	/**
	 * Returns the fire brigade pro equipment info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fire brigade pro equipment info
	 * @return the fire brigade pro equipment info
	 * @throws NoSuchFireBrigadeProEquipmentInfoException if a fire brigade pro equipment info with the primary key could not be found
	 */
	@Override
	public FireBrigadeProEquipmentInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFireBrigadeProEquipmentInfoException {

		FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo =
			fetchByPrimaryKey(primaryKey);

		if (fireBrigadeProEquipmentInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFireBrigadeProEquipmentInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return fireBrigadeProEquipmentInfo;
	}

	/**
	 * Returns the fire brigade pro equipment info with the primary key or throws a <code>NoSuchFireBrigadeProEquipmentInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeProEquipmentInfoId the primary key of the fire brigade pro equipment info
	 * @return the fire brigade pro equipment info
	 * @throws NoSuchFireBrigadeProEquipmentInfoException if a fire brigade pro equipment info with the primary key could not be found
	 */
	@Override
	public FireBrigadeProEquipmentInfo findByPrimaryKey(
			long fireBrigadeProEquipmentInfoId)
		throws NoSuchFireBrigadeProEquipmentInfoException {

		return findByPrimaryKey((Serializable)fireBrigadeProEquipmentInfoId);
	}

	/**
	 * Returns the fire brigade pro equipment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeProEquipmentInfoId the primary key of the fire brigade pro equipment info
	 * @return the fire brigade pro equipment info, or <code>null</code> if a fire brigade pro equipment info with the primary key could not be found
	 */
	@Override
	public FireBrigadeProEquipmentInfo fetchByPrimaryKey(
		long fireBrigadeProEquipmentInfoId) {

		return fetchByPrimaryKey((Serializable)fireBrigadeProEquipmentInfoId);
	}

	/**
	 * Returns all the fire brigade pro equipment infos.
	 *
	 * @return the fire brigade pro equipment infos
	 */
	@Override
	public List<FireBrigadeProEquipmentInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade pro equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeProEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade pro equipment infos
	 * @param end the upper bound of the range of fire brigade pro equipment infos (not inclusive)
	 * @return the range of fire brigade pro equipment infos
	 */
	@Override
	public List<FireBrigadeProEquipmentInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade pro equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeProEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade pro equipment infos
	 * @param end the upper bound of the range of fire brigade pro equipment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade pro equipment infos
	 */
	@Override
	public List<FireBrigadeProEquipmentInfo> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeProEquipmentInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade pro equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeProEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade pro equipment infos
	 * @param end the upper bound of the range of fire brigade pro equipment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade pro equipment infos
	 */
	@Override
	public List<FireBrigadeProEquipmentInfo> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeProEquipmentInfo> orderByComparator,
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

		List<FireBrigadeProEquipmentInfo> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeProEquipmentInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FIREBRIGADEPROEQUIPMENTINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FIREBRIGADEPROEQUIPMENTINFO;

				sql = sql.concat(
					FireBrigadeProEquipmentInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FireBrigadeProEquipmentInfo>)QueryUtil.list(
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
	 * Removes all the fire brigade pro equipment infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo :
				findAll()) {

			remove(fireBrigadeProEquipmentInfo);
		}
	}

	/**
	 * Returns the number of fire brigade pro equipment infos.
	 *
	 * @return the number of fire brigade pro equipment infos
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
					_SQL_COUNT_FIREBRIGADEPROEQUIPMENTINFO);

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
		return "fireBrigadeProEquipmentInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FIREBRIGADEPROEQUIPMENTINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FireBrigadeProEquipmentInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the fire brigade pro equipment info persistence.
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

		FireBrigadeProEquipmentInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FireBrigadeProEquipmentInfoUtil.setPersistence(null);

		entityCache.removeCache(
			FireBrigadeProEquipmentInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_FIREBRIGADEPROEQUIPMENTINFO =
		"SELECT fireBrigadeProEquipmentInfo FROM FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo";

	private static final String _SQL_SELECT_FIREBRIGADEPROEQUIPMENTINFO_WHERE =
		"SELECT fireBrigadeProEquipmentInfo FROM FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo WHERE ";

	private static final String _SQL_COUNT_FIREBRIGADEPROEQUIPMENTINFO =
		"SELECT COUNT(fireBrigadeProEquipmentInfo) FROM FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo";

	private static final String _SQL_COUNT_FIREBRIGADEPROEQUIPMENTINFO_WHERE =
		"SELECT COUNT(fireBrigadeProEquipmentInfo) FROM FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"fireBrigadeProEquipmentInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FireBrigadeProEquipmentInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FireBrigadeProEquipmentInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FireBrigadeProEquipmentInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}