/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence.impl;

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

import com.nbp.healthcare.application.form.service.exception.NoSuchHealthCareBussinessInfoException;
import com.nbp.healthcare.application.form.service.model.HealthCareBussinessInfo;
import com.nbp.healthcare.application.form.service.model.HealthCareBussinessInfoTable;
import com.nbp.healthcare.application.form.service.model.impl.HealthCareBussinessInfoImpl;
import com.nbp.healthcare.application.form.service.model.impl.HealthCareBussinessInfoModelImpl;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareBussinessInfoPersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareBussinessInfoUtil;
import com.nbp.healthcare.application.form.service.service.persistence.impl.constants.HEALTHPersistenceConstants;

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
 * The persistence implementation for the health care bussiness info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HealthCareBussinessInfoPersistence.class)
public class HealthCareBussinessInfoPersistenceImpl
	extends BasePersistenceImpl<HealthCareBussinessInfo>
	implements HealthCareBussinessInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HealthCareBussinessInfoUtil</code> to access the health care bussiness info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HealthCareBussinessInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetHealthCareByid;
	private FinderPath _finderPathCountBygetHealthCareByid;

	/**
	 * Returns the health care bussiness info where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareBussinessInfoException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care bussiness info
	 * @throws NoSuchHealthCareBussinessInfoException if a matching health care bussiness info could not be found
	 */
	@Override
	public HealthCareBussinessInfo findBygetHealthCareByid(
			long healthCareApplicationId)
		throws NoSuchHealthCareBussinessInfoException {

		HealthCareBussinessInfo healthCareBussinessInfo =
			fetchBygetHealthCareByid(healthCareApplicationId);

		if (healthCareBussinessInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("healthCareApplicationId=");
			sb.append(healthCareApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHealthCareBussinessInfoException(sb.toString());
		}

		return healthCareBussinessInfo;
	}

	/**
	 * Returns the health care bussiness info where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care bussiness info, or <code>null</code> if a matching health care bussiness info could not be found
	 */
	@Override
	public HealthCareBussinessInfo fetchBygetHealthCareByid(
		long healthCareApplicationId) {

		return fetchBygetHealthCareByid(healthCareApplicationId, true);
	}

	/**
	 * Returns the health care bussiness info where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care bussiness info, or <code>null</code> if a matching health care bussiness info could not be found
	 */
	@Override
	public HealthCareBussinessInfo fetchBygetHealthCareByid(
		long healthCareApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {healthCareApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHealthCareByid, finderArgs, this);
		}

		if (result instanceof HealthCareBussinessInfo) {
			HealthCareBussinessInfo healthCareBussinessInfo =
				(HealthCareBussinessInfo)result;

			if (healthCareApplicationId !=
					healthCareBussinessInfo.getHealthCareApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HEALTHCAREBUSSINESSINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETHEALTHCAREBYID_HEALTHCAREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(healthCareApplicationId);

				List<HealthCareBussinessInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHealthCareByid, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									healthCareApplicationId
								};
							}

							_log.warn(
								"HealthCareBussinessInfoPersistenceImpl.fetchBygetHealthCareByid(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HealthCareBussinessInfo healthCareBussinessInfo = list.get(
						0);

					result = healthCareBussinessInfo;

					cacheResult(healthCareBussinessInfo);
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
			return (HealthCareBussinessInfo)result;
		}
	}

	/**
	 * Removes the health care bussiness info where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care bussiness info that was removed
	 */
	@Override
	public HealthCareBussinessInfo removeBygetHealthCareByid(
			long healthCareApplicationId)
		throws NoSuchHealthCareBussinessInfoException {

		HealthCareBussinessInfo healthCareBussinessInfo =
			findBygetHealthCareByid(healthCareApplicationId);

		return remove(healthCareBussinessInfo);
	}

	/**
	 * Returns the number of health care bussiness infos where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care bussiness infos
	 */
	@Override
	public int countBygetHealthCareByid(long healthCareApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHealthCareByid;

		Object[] finderArgs = new Object[] {healthCareApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HEALTHCAREBUSSINESSINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETHEALTHCAREBYID_HEALTHCAREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(healthCareApplicationId);

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
		_FINDER_COLUMN_GETHEALTHCAREBYID_HEALTHCAREAPPLICATIONID_2 =
			"healthCareBussinessInfo.healthCareApplicationId = ?";

	public HealthCareBussinessInfoPersistenceImpl() {
		setModelClass(HealthCareBussinessInfo.class);

		setModelImplClass(HealthCareBussinessInfoImpl.class);
		setModelPKClass(long.class);

		setTable(HealthCareBussinessInfoTable.INSTANCE);
	}

	/**
	 * Caches the health care bussiness info in the entity cache if it is enabled.
	 *
	 * @param healthCareBussinessInfo the health care bussiness info
	 */
	@Override
	public void cacheResult(HealthCareBussinessInfo healthCareBussinessInfo) {
		entityCache.putResult(
			HealthCareBussinessInfoImpl.class,
			healthCareBussinessInfo.getPrimaryKey(), healthCareBussinessInfo);

		finderCache.putResult(
			_finderPathFetchBygetHealthCareByid,
			new Object[] {healthCareBussinessInfo.getHealthCareApplicationId()},
			healthCareBussinessInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the health care bussiness infos in the entity cache if it is enabled.
	 *
	 * @param healthCareBussinessInfos the health care bussiness infos
	 */
	@Override
	public void cacheResult(
		List<HealthCareBussinessInfo> healthCareBussinessInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (healthCareBussinessInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HealthCareBussinessInfo healthCareBussinessInfo :
				healthCareBussinessInfos) {

			if (entityCache.getResult(
					HealthCareBussinessInfoImpl.class,
					healthCareBussinessInfo.getPrimaryKey()) == null) {

				cacheResult(healthCareBussinessInfo);
			}
		}
	}

	/**
	 * Clears the cache for all health care bussiness infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HealthCareBussinessInfoImpl.class);

		finderCache.clearCache(HealthCareBussinessInfoImpl.class);
	}

	/**
	 * Clears the cache for the health care bussiness info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HealthCareBussinessInfo healthCareBussinessInfo) {
		entityCache.removeResult(
			HealthCareBussinessInfoImpl.class, healthCareBussinessInfo);
	}

	@Override
	public void clearCache(
		List<HealthCareBussinessInfo> healthCareBussinessInfos) {

		for (HealthCareBussinessInfo healthCareBussinessInfo :
				healthCareBussinessInfos) {

			entityCache.removeResult(
				HealthCareBussinessInfoImpl.class, healthCareBussinessInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HealthCareBussinessInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				HealthCareBussinessInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		HealthCareBussinessInfoModelImpl healthCareBussinessInfoModelImpl) {

		Object[] args = new Object[] {
			healthCareBussinessInfoModelImpl.getHealthCareApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHealthCareByid, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHealthCareByid, args,
			healthCareBussinessInfoModelImpl);
	}

	/**
	 * Creates a new health care bussiness info with the primary key. Does not add the health care bussiness info to the database.
	 *
	 * @param healthCareBussinessInfoId the primary key for the new health care bussiness info
	 * @return the new health care bussiness info
	 */
	@Override
	public HealthCareBussinessInfo create(long healthCareBussinessInfoId) {
		HealthCareBussinessInfo healthCareBussinessInfo =
			new HealthCareBussinessInfoImpl();

		healthCareBussinessInfo.setNew(true);
		healthCareBussinessInfo.setPrimaryKey(healthCareBussinessInfoId);

		healthCareBussinessInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return healthCareBussinessInfo;
	}

	/**
	 * Removes the health care bussiness info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareBussinessInfoId the primary key of the health care bussiness info
	 * @return the health care bussiness info that was removed
	 * @throws NoSuchHealthCareBussinessInfoException if a health care bussiness info with the primary key could not be found
	 */
	@Override
	public HealthCareBussinessInfo remove(long healthCareBussinessInfoId)
		throws NoSuchHealthCareBussinessInfoException {

		return remove((Serializable)healthCareBussinessInfoId);
	}

	/**
	 * Removes the health care bussiness info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the health care bussiness info
	 * @return the health care bussiness info that was removed
	 * @throws NoSuchHealthCareBussinessInfoException if a health care bussiness info with the primary key could not be found
	 */
	@Override
	public HealthCareBussinessInfo remove(Serializable primaryKey)
		throws NoSuchHealthCareBussinessInfoException {

		Session session = null;

		try {
			session = openSession();

			HealthCareBussinessInfo healthCareBussinessInfo =
				(HealthCareBussinessInfo)session.get(
					HealthCareBussinessInfoImpl.class, primaryKey);

			if (healthCareBussinessInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHealthCareBussinessInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(healthCareBussinessInfo);
		}
		catch (NoSuchHealthCareBussinessInfoException noSuchEntityException) {
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
	protected HealthCareBussinessInfo removeImpl(
		HealthCareBussinessInfo healthCareBussinessInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(healthCareBussinessInfo)) {
				healthCareBussinessInfo = (HealthCareBussinessInfo)session.get(
					HealthCareBussinessInfoImpl.class,
					healthCareBussinessInfo.getPrimaryKeyObj());
			}

			if (healthCareBussinessInfo != null) {
				session.delete(healthCareBussinessInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (healthCareBussinessInfo != null) {
			clearCache(healthCareBussinessInfo);
		}

		return healthCareBussinessInfo;
	}

	@Override
	public HealthCareBussinessInfo updateImpl(
		HealthCareBussinessInfo healthCareBussinessInfo) {

		boolean isNew = healthCareBussinessInfo.isNew();

		if (!(healthCareBussinessInfo instanceof
				HealthCareBussinessInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(healthCareBussinessInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					healthCareBussinessInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in healthCareBussinessInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HealthCareBussinessInfo implementation " +
					healthCareBussinessInfo.getClass());
		}

		HealthCareBussinessInfoModelImpl healthCareBussinessInfoModelImpl =
			(HealthCareBussinessInfoModelImpl)healthCareBussinessInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (healthCareBussinessInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				healthCareBussinessInfo.setCreateDate(date);
			}
			else {
				healthCareBussinessInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!healthCareBussinessInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				healthCareBussinessInfo.setModifiedDate(date);
			}
			else {
				healthCareBussinessInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(healthCareBussinessInfo);
			}
			else {
				healthCareBussinessInfo =
					(HealthCareBussinessInfo)session.merge(
						healthCareBussinessInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HealthCareBussinessInfoImpl.class, healthCareBussinessInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(healthCareBussinessInfoModelImpl);

		if (isNew) {
			healthCareBussinessInfo.setNew(false);
		}

		healthCareBussinessInfo.resetOriginalValues();

		return healthCareBussinessInfo;
	}

	/**
	 * Returns the health care bussiness info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the health care bussiness info
	 * @return the health care bussiness info
	 * @throws NoSuchHealthCareBussinessInfoException if a health care bussiness info with the primary key could not be found
	 */
	@Override
	public HealthCareBussinessInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHealthCareBussinessInfoException {

		HealthCareBussinessInfo healthCareBussinessInfo = fetchByPrimaryKey(
			primaryKey);

		if (healthCareBussinessInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHealthCareBussinessInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return healthCareBussinessInfo;
	}

	/**
	 * Returns the health care bussiness info with the primary key or throws a <code>NoSuchHealthCareBussinessInfoException</code> if it could not be found.
	 *
	 * @param healthCareBussinessInfoId the primary key of the health care bussiness info
	 * @return the health care bussiness info
	 * @throws NoSuchHealthCareBussinessInfoException if a health care bussiness info with the primary key could not be found
	 */
	@Override
	public HealthCareBussinessInfo findByPrimaryKey(
			long healthCareBussinessInfoId)
		throws NoSuchHealthCareBussinessInfoException {

		return findByPrimaryKey((Serializable)healthCareBussinessInfoId);
	}

	/**
	 * Returns the health care bussiness info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareBussinessInfoId the primary key of the health care bussiness info
	 * @return the health care bussiness info, or <code>null</code> if a health care bussiness info with the primary key could not be found
	 */
	@Override
	public HealthCareBussinessInfo fetchByPrimaryKey(
		long healthCareBussinessInfoId) {

		return fetchByPrimaryKey((Serializable)healthCareBussinessInfoId);
	}

	/**
	 * Returns all the health care bussiness infos.
	 *
	 * @return the health care bussiness infos
	 */
	@Override
	public List<HealthCareBussinessInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the health care bussiness infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareBussinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care bussiness infos
	 * @param end the upper bound of the range of health care bussiness infos (not inclusive)
	 * @return the range of health care bussiness infos
	 */
	@Override
	public List<HealthCareBussinessInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the health care bussiness infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareBussinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care bussiness infos
	 * @param end the upper bound of the range of health care bussiness infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care bussiness infos
	 */
	@Override
	public List<HealthCareBussinessInfo> findAll(
		int start, int end,
		OrderByComparator<HealthCareBussinessInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the health care bussiness infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareBussinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care bussiness infos
	 * @param end the upper bound of the range of health care bussiness infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care bussiness infos
	 */
	@Override
	public List<HealthCareBussinessInfo> findAll(
		int start, int end,
		OrderByComparator<HealthCareBussinessInfo> orderByComparator,
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

		List<HealthCareBussinessInfo> list = null;

		if (useFinderCache) {
			list = (List<HealthCareBussinessInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HEALTHCAREBUSSINESSINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HEALTHCAREBUSSINESSINFO;

				sql = sql.concat(
					HealthCareBussinessInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HealthCareBussinessInfo>)QueryUtil.list(
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
	 * Removes all the health care bussiness infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HealthCareBussinessInfo healthCareBussinessInfo : findAll()) {
			remove(healthCareBussinessInfo);
		}
	}

	/**
	 * Returns the number of health care bussiness infos.
	 *
	 * @return the number of health care bussiness infos
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
					_SQL_COUNT_HEALTHCAREBUSSINESSINFO);

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
		return "healthCareBussinessInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HEALTHCAREBUSSINESSINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HealthCareBussinessInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the health care bussiness info persistence.
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

		_finderPathFetchBygetHealthCareByid = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHealthCareByid",
			new String[] {Long.class.getName()},
			new String[] {"healthCareApplicationId"}, true);

		_finderPathCountBygetHealthCareByid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHealthCareByid", new String[] {Long.class.getName()},
			new String[] {"healthCareApplicationId"}, false);

		HealthCareBussinessInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HealthCareBussinessInfoUtil.setPersistence(null);

		entityCache.removeCache(HealthCareBussinessInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = HEALTHPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HEALTHPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HEALTHPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_HEALTHCAREBUSSINESSINFO =
		"SELECT healthCareBussinessInfo FROM HealthCareBussinessInfo healthCareBussinessInfo";

	private static final String _SQL_SELECT_HEALTHCAREBUSSINESSINFO_WHERE =
		"SELECT healthCareBussinessInfo FROM HealthCareBussinessInfo healthCareBussinessInfo WHERE ";

	private static final String _SQL_COUNT_HEALTHCAREBUSSINESSINFO =
		"SELECT COUNT(healthCareBussinessInfo) FROM HealthCareBussinessInfo healthCareBussinessInfo";

	private static final String _SQL_COUNT_HEALTHCAREBUSSINESSINFO_WHERE =
		"SELECT COUNT(healthCareBussinessInfo) FROM HealthCareBussinessInfo healthCareBussinessInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"healthCareBussinessInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HealthCareBussinessInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HealthCareBussinessInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HealthCareBussinessInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}