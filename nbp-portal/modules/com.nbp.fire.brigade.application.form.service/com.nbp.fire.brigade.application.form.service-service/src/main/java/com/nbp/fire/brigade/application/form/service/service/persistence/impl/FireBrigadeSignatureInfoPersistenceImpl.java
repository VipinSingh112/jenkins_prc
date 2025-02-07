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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.fire.brigade.application.form.service.exception.NoSuchFireBrigadeSignatureInfoException;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeSignatureInfo;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeSignatureInfoTable;
import com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeSignatureInfoImpl;
import com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeSignatureInfoModelImpl;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeSignatureInfoPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeSignatureInfoUtil;
import com.nbp.fire.brigade.application.form.service.service.persistence.impl.constants.FIRE_BRIGADEPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the fire brigade signature info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FireBrigadeSignatureInfoPersistence.class)
public class FireBrigadeSignatureInfoPersistenceImpl
	extends BasePersistenceImpl<FireBrigadeSignatureInfo>
	implements FireBrigadeSignatureInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FireBrigadeSignatureInfoUtil</code> to access the fire brigade signature info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FireBrigadeSignatureInfoImpl.class.getName();

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
	 * Returns the fire brigade signature info where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeSignatureInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade signature info
	 * @throws NoSuchFireBrigadeSignatureInfoException if a matching fire brigade signature info could not be found
	 */
	@Override
	public FireBrigadeSignatureInfo findBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeSignatureInfoException {

		FireBrigadeSignatureInfo fireBrigadeSignatureInfo =
			fetchBygetFireBrigadeByAppId(fireBrigadeApplicationId);

		if (fireBrigadeSignatureInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("fireBrigadeApplicationId=");
			sb.append(fireBrigadeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFireBrigadeSignatureInfoException(sb.toString());
		}

		return fireBrigadeSignatureInfo;
	}

	/**
	 * Returns the fire brigade signature info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade signature info, or <code>null</code> if a matching fire brigade signature info could not be found
	 */
	@Override
	public FireBrigadeSignatureInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId) {

		return fetchBygetFireBrigadeByAppId(fireBrigadeApplicationId, true);
	}

	/**
	 * Returns the fire brigade signature info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade signature info, or <code>null</code> if a matching fire brigade signature info could not be found
	 */
	@Override
	public FireBrigadeSignatureInfo fetchBygetFireBrigadeByAppId(
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

		if (result instanceof FireBrigadeSignatureInfo) {
			FireBrigadeSignatureInfo fireBrigadeSignatureInfo =
				(FireBrigadeSignatureInfo)result;

			if (fireBrigadeApplicationId !=
					fireBrigadeSignatureInfo.getFireBrigadeApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FIREBRIGADESIGNATUREINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETFIREBRIGADEBYAPPID_FIREBRIGADEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(fireBrigadeApplicationId);

				List<FireBrigadeSignatureInfo> list = query.list();

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
								"FireBrigadeSignatureInfoPersistenceImpl.fetchBygetFireBrigadeByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FireBrigadeSignatureInfo fireBrigadeSignatureInfo =
						list.get(0);

					result = fireBrigadeSignatureInfo;

					cacheResult(fireBrigadeSignatureInfo);
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
			return (FireBrigadeSignatureInfo)result;
		}
	}

	/**
	 * Removes the fire brigade signature info where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade signature info that was removed
	 */
	@Override
	public FireBrigadeSignatureInfo removeBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeSignatureInfoException {

		FireBrigadeSignatureInfo fireBrigadeSignatureInfo =
			findBygetFireBrigadeByAppId(fireBrigadeApplicationId);

		return remove(fireBrigadeSignatureInfo);
	}

	/**
	 * Returns the number of fire brigade signature infos where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade signature infos
	 */
	@Override
	public int countBygetFireBrigadeByAppId(long fireBrigadeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFireBrigadeByAppId;

		Object[] finderArgs = new Object[] {fireBrigadeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADESIGNATUREINFO_WHERE);

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
			"fireBrigadeSignatureInfo.fireBrigadeApplicationId = ?";

	public FireBrigadeSignatureInfoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("date", "date_");

		setDBColumnNames(dbColumnNames);

		setModelClass(FireBrigadeSignatureInfo.class);

		setModelImplClass(FireBrigadeSignatureInfoImpl.class);
		setModelPKClass(long.class);

		setTable(FireBrigadeSignatureInfoTable.INSTANCE);
	}

	/**
	 * Caches the fire brigade signature info in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeSignatureInfo the fire brigade signature info
	 */
	@Override
	public void cacheResult(FireBrigadeSignatureInfo fireBrigadeSignatureInfo) {
		entityCache.putResult(
			FireBrigadeSignatureInfoImpl.class,
			fireBrigadeSignatureInfo.getPrimaryKey(), fireBrigadeSignatureInfo);

		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeByAppId,
			new Object[] {
				fireBrigadeSignatureInfo.getFireBrigadeApplicationId()
			},
			fireBrigadeSignatureInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the fire brigade signature infos in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeSignatureInfos the fire brigade signature infos
	 */
	@Override
	public void cacheResult(
		List<FireBrigadeSignatureInfo> fireBrigadeSignatureInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fireBrigadeSignatureInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FireBrigadeSignatureInfo fireBrigadeSignatureInfo :
				fireBrigadeSignatureInfos) {

			if (entityCache.getResult(
					FireBrigadeSignatureInfoImpl.class,
					fireBrigadeSignatureInfo.getPrimaryKey()) == null) {

				cacheResult(fireBrigadeSignatureInfo);
			}
		}
	}

	/**
	 * Clears the cache for all fire brigade signature infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FireBrigadeSignatureInfoImpl.class);

		finderCache.clearCache(FireBrigadeSignatureInfoImpl.class);
	}

	/**
	 * Clears the cache for the fire brigade signature info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FireBrigadeSignatureInfo fireBrigadeSignatureInfo) {
		entityCache.removeResult(
			FireBrigadeSignatureInfoImpl.class, fireBrigadeSignatureInfo);
	}

	@Override
	public void clearCache(
		List<FireBrigadeSignatureInfo> fireBrigadeSignatureInfos) {

		for (FireBrigadeSignatureInfo fireBrigadeSignatureInfo :
				fireBrigadeSignatureInfos) {

			entityCache.removeResult(
				FireBrigadeSignatureInfoImpl.class, fireBrigadeSignatureInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FireBrigadeSignatureInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FireBrigadeSignatureInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FireBrigadeSignatureInfoModelImpl fireBrigadeSignatureInfoModelImpl) {

		Object[] args = new Object[] {
			fireBrigadeSignatureInfoModelImpl.getFireBrigadeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFireBrigadeByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeByAppId, args,
			fireBrigadeSignatureInfoModelImpl);
	}

	/**
	 * Creates a new fire brigade signature info with the primary key. Does not add the fire brigade signature info to the database.
	 *
	 * @param fireBrigadeSignatureInfoId the primary key for the new fire brigade signature info
	 * @return the new fire brigade signature info
	 */
	@Override
	public FireBrigadeSignatureInfo create(long fireBrigadeSignatureInfoId) {
		FireBrigadeSignatureInfo fireBrigadeSignatureInfo =
			new FireBrigadeSignatureInfoImpl();

		fireBrigadeSignatureInfo.setNew(true);
		fireBrigadeSignatureInfo.setPrimaryKey(fireBrigadeSignatureInfoId);

		fireBrigadeSignatureInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return fireBrigadeSignatureInfo;
	}

	/**
	 * Removes the fire brigade signature info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeSignatureInfoId the primary key of the fire brigade signature info
	 * @return the fire brigade signature info that was removed
	 * @throws NoSuchFireBrigadeSignatureInfoException if a fire brigade signature info with the primary key could not be found
	 */
	@Override
	public FireBrigadeSignatureInfo remove(long fireBrigadeSignatureInfoId)
		throws NoSuchFireBrigadeSignatureInfoException {

		return remove((Serializable)fireBrigadeSignatureInfoId);
	}

	/**
	 * Removes the fire brigade signature info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fire brigade signature info
	 * @return the fire brigade signature info that was removed
	 * @throws NoSuchFireBrigadeSignatureInfoException if a fire brigade signature info with the primary key could not be found
	 */
	@Override
	public FireBrigadeSignatureInfo remove(Serializable primaryKey)
		throws NoSuchFireBrigadeSignatureInfoException {

		Session session = null;

		try {
			session = openSession();

			FireBrigadeSignatureInfo fireBrigadeSignatureInfo =
				(FireBrigadeSignatureInfo)session.get(
					FireBrigadeSignatureInfoImpl.class, primaryKey);

			if (fireBrigadeSignatureInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFireBrigadeSignatureInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(fireBrigadeSignatureInfo);
		}
		catch (NoSuchFireBrigadeSignatureInfoException noSuchEntityException) {
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
	protected FireBrigadeSignatureInfo removeImpl(
		FireBrigadeSignatureInfo fireBrigadeSignatureInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fireBrigadeSignatureInfo)) {
				fireBrigadeSignatureInfo =
					(FireBrigadeSignatureInfo)session.get(
						FireBrigadeSignatureInfoImpl.class,
						fireBrigadeSignatureInfo.getPrimaryKeyObj());
			}

			if (fireBrigadeSignatureInfo != null) {
				session.delete(fireBrigadeSignatureInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (fireBrigadeSignatureInfo != null) {
			clearCache(fireBrigadeSignatureInfo);
		}

		return fireBrigadeSignatureInfo;
	}

	@Override
	public FireBrigadeSignatureInfo updateImpl(
		FireBrigadeSignatureInfo fireBrigadeSignatureInfo) {

		boolean isNew = fireBrigadeSignatureInfo.isNew();

		if (!(fireBrigadeSignatureInfo instanceof
				FireBrigadeSignatureInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(fireBrigadeSignatureInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					fireBrigadeSignatureInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in fireBrigadeSignatureInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FireBrigadeSignatureInfo implementation " +
					fireBrigadeSignatureInfo.getClass());
		}

		FireBrigadeSignatureInfoModelImpl fireBrigadeSignatureInfoModelImpl =
			(FireBrigadeSignatureInfoModelImpl)fireBrigadeSignatureInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (fireBrigadeSignatureInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				fireBrigadeSignatureInfo.setCreateDate(date);
			}
			else {
				fireBrigadeSignatureInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!fireBrigadeSignatureInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				fireBrigadeSignatureInfo.setModifiedDate(date);
			}
			else {
				fireBrigadeSignatureInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(fireBrigadeSignatureInfo);
			}
			else {
				fireBrigadeSignatureInfo =
					(FireBrigadeSignatureInfo)session.merge(
						fireBrigadeSignatureInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FireBrigadeSignatureInfoImpl.class,
			fireBrigadeSignatureInfoModelImpl, false, true);

		cacheUniqueFindersCache(fireBrigadeSignatureInfoModelImpl);

		if (isNew) {
			fireBrigadeSignatureInfo.setNew(false);
		}

		fireBrigadeSignatureInfo.resetOriginalValues();

		return fireBrigadeSignatureInfo;
	}

	/**
	 * Returns the fire brigade signature info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fire brigade signature info
	 * @return the fire brigade signature info
	 * @throws NoSuchFireBrigadeSignatureInfoException if a fire brigade signature info with the primary key could not be found
	 */
	@Override
	public FireBrigadeSignatureInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFireBrigadeSignatureInfoException {

		FireBrigadeSignatureInfo fireBrigadeSignatureInfo = fetchByPrimaryKey(
			primaryKey);

		if (fireBrigadeSignatureInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFireBrigadeSignatureInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return fireBrigadeSignatureInfo;
	}

	/**
	 * Returns the fire brigade signature info with the primary key or throws a <code>NoSuchFireBrigadeSignatureInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeSignatureInfoId the primary key of the fire brigade signature info
	 * @return the fire brigade signature info
	 * @throws NoSuchFireBrigadeSignatureInfoException if a fire brigade signature info with the primary key could not be found
	 */
	@Override
	public FireBrigadeSignatureInfo findByPrimaryKey(
			long fireBrigadeSignatureInfoId)
		throws NoSuchFireBrigadeSignatureInfoException {

		return findByPrimaryKey((Serializable)fireBrigadeSignatureInfoId);
	}

	/**
	 * Returns the fire brigade signature info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeSignatureInfoId the primary key of the fire brigade signature info
	 * @return the fire brigade signature info, or <code>null</code> if a fire brigade signature info with the primary key could not be found
	 */
	@Override
	public FireBrigadeSignatureInfo fetchByPrimaryKey(
		long fireBrigadeSignatureInfoId) {

		return fetchByPrimaryKey((Serializable)fireBrigadeSignatureInfoId);
	}

	/**
	 * Returns all the fire brigade signature infos.
	 *
	 * @return the fire brigade signature infos
	 */
	@Override
	public List<FireBrigadeSignatureInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade signature infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeSignatureInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade signature infos
	 * @param end the upper bound of the range of fire brigade signature infos (not inclusive)
	 * @return the range of fire brigade signature infos
	 */
	@Override
	public List<FireBrigadeSignatureInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade signature infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeSignatureInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade signature infos
	 * @param end the upper bound of the range of fire brigade signature infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade signature infos
	 */
	@Override
	public List<FireBrigadeSignatureInfo> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeSignatureInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade signature infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeSignatureInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade signature infos
	 * @param end the upper bound of the range of fire brigade signature infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade signature infos
	 */
	@Override
	public List<FireBrigadeSignatureInfo> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeSignatureInfo> orderByComparator,
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

		List<FireBrigadeSignatureInfo> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeSignatureInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FIREBRIGADESIGNATUREINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FIREBRIGADESIGNATUREINFO;

				sql = sql.concat(
					FireBrigadeSignatureInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FireBrigadeSignatureInfo>)QueryUtil.list(
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
	 * Removes all the fire brigade signature infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FireBrigadeSignatureInfo fireBrigadeSignatureInfo : findAll()) {
			remove(fireBrigadeSignatureInfo);
		}
	}

	/**
	 * Returns the number of fire brigade signature infos.
	 *
	 * @return the number of fire brigade signature infos
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
					_SQL_COUNT_FIREBRIGADESIGNATUREINFO);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "fireBrigadeSignatureInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FIREBRIGADESIGNATUREINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FireBrigadeSignatureInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the fire brigade signature info persistence.
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

		FireBrigadeSignatureInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FireBrigadeSignatureInfoUtil.setPersistence(null);

		entityCache.removeCache(FireBrigadeSignatureInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_FIREBRIGADESIGNATUREINFO =
		"SELECT fireBrigadeSignatureInfo FROM FireBrigadeSignatureInfo fireBrigadeSignatureInfo";

	private static final String _SQL_SELECT_FIREBRIGADESIGNATUREINFO_WHERE =
		"SELECT fireBrigadeSignatureInfo FROM FireBrigadeSignatureInfo fireBrigadeSignatureInfo WHERE ";

	private static final String _SQL_COUNT_FIREBRIGADESIGNATUREINFO =
		"SELECT COUNT(fireBrigadeSignatureInfo) FROM FireBrigadeSignatureInfo fireBrigadeSignatureInfo";

	private static final String _SQL_COUNT_FIREBRIGADESIGNATUREINFO_WHERE =
		"SELECT COUNT(fireBrigadeSignatureInfo) FROM FireBrigadeSignatureInfo fireBrigadeSignatureInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"fireBrigadeSignatureInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FireBrigadeSignatureInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FireBrigadeSignatureInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FireBrigadeSignatureInfoPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"date"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}