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

import com.nbp.healthcare.application.form.service.exception.NoSuchHealthCareApplicantInfoException;
import com.nbp.healthcare.application.form.service.model.HealthCareApplicantInfo;
import com.nbp.healthcare.application.form.service.model.HealthCareApplicantInfoTable;
import com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicantInfoImpl;
import com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicantInfoModelImpl;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareApplicantInfoPersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareApplicantInfoUtil;
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
 * The persistence implementation for the health care applicant info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HealthCareApplicantInfoPersistence.class)
public class HealthCareApplicantInfoPersistenceImpl
	extends BasePersistenceImpl<HealthCareApplicantInfo>
	implements HealthCareApplicantInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HealthCareApplicantInfoUtil</code> to access the health care applicant info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HealthCareApplicantInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetHealthCareById;
	private FinderPath _finderPathCountBygetHealthCareById;

	/**
	 * Returns the health care applicant info where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareApplicantInfoException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care applicant info
	 * @throws NoSuchHealthCareApplicantInfoException if a matching health care applicant info could not be found
	 */
	@Override
	public HealthCareApplicantInfo findBygetHealthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareApplicantInfoException {

		HealthCareApplicantInfo healthCareApplicantInfo =
			fetchBygetHealthCareById(healthCareApplicationId);

		if (healthCareApplicantInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("healthCareApplicationId=");
			sb.append(healthCareApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHealthCareApplicantInfoException(sb.toString());
		}

		return healthCareApplicantInfo;
	}

	/**
	 * Returns the health care applicant info where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care applicant info, or <code>null</code> if a matching health care applicant info could not be found
	 */
	@Override
	public HealthCareApplicantInfo fetchBygetHealthCareById(
		long healthCareApplicationId) {

		return fetchBygetHealthCareById(healthCareApplicationId, true);
	}

	/**
	 * Returns the health care applicant info where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care applicant info, or <code>null</code> if a matching health care applicant info could not be found
	 */
	@Override
	public HealthCareApplicantInfo fetchBygetHealthCareById(
		long healthCareApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {healthCareApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHealthCareById, finderArgs, this);
		}

		if (result instanceof HealthCareApplicantInfo) {
			HealthCareApplicantInfo healthCareApplicantInfo =
				(HealthCareApplicantInfo)result;

			if (healthCareApplicationId !=
					healthCareApplicantInfo.getHealthCareApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HEALTHCAREAPPLICANTINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETHEALTHCAREBYID_HEALTHCAREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(healthCareApplicationId);

				List<HealthCareApplicantInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHealthCareById, finderArgs,
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
								"HealthCareApplicantInfoPersistenceImpl.fetchBygetHealthCareById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HealthCareApplicantInfo healthCareApplicantInfo = list.get(
						0);

					result = healthCareApplicantInfo;

					cacheResult(healthCareApplicantInfo);
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
			return (HealthCareApplicantInfo)result;
		}
	}

	/**
	 * Removes the health care applicant info where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care applicant info that was removed
	 */
	@Override
	public HealthCareApplicantInfo removeBygetHealthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareApplicantInfoException {

		HealthCareApplicantInfo healthCareApplicantInfo =
			findBygetHealthCareById(healthCareApplicationId);

		return remove(healthCareApplicantInfo);
	}

	/**
	 * Returns the number of health care applicant infos where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care applicant infos
	 */
	@Override
	public int countBygetHealthCareById(long healthCareApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHealthCareById;

		Object[] finderArgs = new Object[] {healthCareApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HEALTHCAREAPPLICANTINFO_WHERE);

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
			"healthCareApplicantInfo.healthCareApplicationId = ?";

	public HealthCareApplicantInfoPersistenceImpl() {
		setModelClass(HealthCareApplicantInfo.class);

		setModelImplClass(HealthCareApplicantInfoImpl.class);
		setModelPKClass(long.class);

		setTable(HealthCareApplicantInfoTable.INSTANCE);
	}

	/**
	 * Caches the health care applicant info in the entity cache if it is enabled.
	 *
	 * @param healthCareApplicantInfo the health care applicant info
	 */
	@Override
	public void cacheResult(HealthCareApplicantInfo healthCareApplicantInfo) {
		entityCache.putResult(
			HealthCareApplicantInfoImpl.class,
			healthCareApplicantInfo.getPrimaryKey(), healthCareApplicantInfo);

		finderCache.putResult(
			_finderPathFetchBygetHealthCareById,
			new Object[] {healthCareApplicantInfo.getHealthCareApplicationId()},
			healthCareApplicantInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the health care applicant infos in the entity cache if it is enabled.
	 *
	 * @param healthCareApplicantInfos the health care applicant infos
	 */
	@Override
	public void cacheResult(
		List<HealthCareApplicantInfo> healthCareApplicantInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (healthCareApplicantInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HealthCareApplicantInfo healthCareApplicantInfo :
				healthCareApplicantInfos) {

			if (entityCache.getResult(
					HealthCareApplicantInfoImpl.class,
					healthCareApplicantInfo.getPrimaryKey()) == null) {

				cacheResult(healthCareApplicantInfo);
			}
		}
	}

	/**
	 * Clears the cache for all health care applicant infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HealthCareApplicantInfoImpl.class);

		finderCache.clearCache(HealthCareApplicantInfoImpl.class);
	}

	/**
	 * Clears the cache for the health care applicant info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HealthCareApplicantInfo healthCareApplicantInfo) {
		entityCache.removeResult(
			HealthCareApplicantInfoImpl.class, healthCareApplicantInfo);
	}

	@Override
	public void clearCache(
		List<HealthCareApplicantInfo> healthCareApplicantInfos) {

		for (HealthCareApplicantInfo healthCareApplicantInfo :
				healthCareApplicantInfos) {

			entityCache.removeResult(
				HealthCareApplicantInfoImpl.class, healthCareApplicantInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HealthCareApplicantInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				HealthCareApplicantInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		HealthCareApplicantInfoModelImpl healthCareApplicantInfoModelImpl) {

		Object[] args = new Object[] {
			healthCareApplicantInfoModelImpl.getHealthCareApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHealthCareById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHealthCareById, args,
			healthCareApplicantInfoModelImpl);
	}

	/**
	 * Creates a new health care applicant info with the primary key. Does not add the health care applicant info to the database.
	 *
	 * @param healthCareApplicantInfoId the primary key for the new health care applicant info
	 * @return the new health care applicant info
	 */
	@Override
	public HealthCareApplicantInfo create(long healthCareApplicantInfoId) {
		HealthCareApplicantInfo healthCareApplicantInfo =
			new HealthCareApplicantInfoImpl();

		healthCareApplicantInfo.setNew(true);
		healthCareApplicantInfo.setPrimaryKey(healthCareApplicantInfoId);

		healthCareApplicantInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return healthCareApplicantInfo;
	}

	/**
	 * Removes the health care applicant info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareApplicantInfoId the primary key of the health care applicant info
	 * @return the health care applicant info that was removed
	 * @throws NoSuchHealthCareApplicantInfoException if a health care applicant info with the primary key could not be found
	 */
	@Override
	public HealthCareApplicantInfo remove(long healthCareApplicantInfoId)
		throws NoSuchHealthCareApplicantInfoException {

		return remove((Serializable)healthCareApplicantInfoId);
	}

	/**
	 * Removes the health care applicant info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the health care applicant info
	 * @return the health care applicant info that was removed
	 * @throws NoSuchHealthCareApplicantInfoException if a health care applicant info with the primary key could not be found
	 */
	@Override
	public HealthCareApplicantInfo remove(Serializable primaryKey)
		throws NoSuchHealthCareApplicantInfoException {

		Session session = null;

		try {
			session = openSession();

			HealthCareApplicantInfo healthCareApplicantInfo =
				(HealthCareApplicantInfo)session.get(
					HealthCareApplicantInfoImpl.class, primaryKey);

			if (healthCareApplicantInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHealthCareApplicantInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(healthCareApplicantInfo);
		}
		catch (NoSuchHealthCareApplicantInfoException noSuchEntityException) {
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
	protected HealthCareApplicantInfo removeImpl(
		HealthCareApplicantInfo healthCareApplicantInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(healthCareApplicantInfo)) {
				healthCareApplicantInfo = (HealthCareApplicantInfo)session.get(
					HealthCareApplicantInfoImpl.class,
					healthCareApplicantInfo.getPrimaryKeyObj());
			}

			if (healthCareApplicantInfo != null) {
				session.delete(healthCareApplicantInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (healthCareApplicantInfo != null) {
			clearCache(healthCareApplicantInfo);
		}

		return healthCareApplicantInfo;
	}

	@Override
	public HealthCareApplicantInfo updateImpl(
		HealthCareApplicantInfo healthCareApplicantInfo) {

		boolean isNew = healthCareApplicantInfo.isNew();

		if (!(healthCareApplicantInfo instanceof
				HealthCareApplicantInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(healthCareApplicantInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					healthCareApplicantInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in healthCareApplicantInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HealthCareApplicantInfo implementation " +
					healthCareApplicantInfo.getClass());
		}

		HealthCareApplicantInfoModelImpl healthCareApplicantInfoModelImpl =
			(HealthCareApplicantInfoModelImpl)healthCareApplicantInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (healthCareApplicantInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				healthCareApplicantInfo.setCreateDate(date);
			}
			else {
				healthCareApplicantInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!healthCareApplicantInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				healthCareApplicantInfo.setModifiedDate(date);
			}
			else {
				healthCareApplicantInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(healthCareApplicantInfo);
			}
			else {
				healthCareApplicantInfo =
					(HealthCareApplicantInfo)session.merge(
						healthCareApplicantInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HealthCareApplicantInfoImpl.class, healthCareApplicantInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(healthCareApplicantInfoModelImpl);

		if (isNew) {
			healthCareApplicantInfo.setNew(false);
		}

		healthCareApplicantInfo.resetOriginalValues();

		return healthCareApplicantInfo;
	}

	/**
	 * Returns the health care applicant info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the health care applicant info
	 * @return the health care applicant info
	 * @throws NoSuchHealthCareApplicantInfoException if a health care applicant info with the primary key could not be found
	 */
	@Override
	public HealthCareApplicantInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHealthCareApplicantInfoException {

		HealthCareApplicantInfo healthCareApplicantInfo = fetchByPrimaryKey(
			primaryKey);

		if (healthCareApplicantInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHealthCareApplicantInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return healthCareApplicantInfo;
	}

	/**
	 * Returns the health care applicant info with the primary key or throws a <code>NoSuchHealthCareApplicantInfoException</code> if it could not be found.
	 *
	 * @param healthCareApplicantInfoId the primary key of the health care applicant info
	 * @return the health care applicant info
	 * @throws NoSuchHealthCareApplicantInfoException if a health care applicant info with the primary key could not be found
	 */
	@Override
	public HealthCareApplicantInfo findByPrimaryKey(
			long healthCareApplicantInfoId)
		throws NoSuchHealthCareApplicantInfoException {

		return findByPrimaryKey((Serializable)healthCareApplicantInfoId);
	}

	/**
	 * Returns the health care applicant info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareApplicantInfoId the primary key of the health care applicant info
	 * @return the health care applicant info, or <code>null</code> if a health care applicant info with the primary key could not be found
	 */
	@Override
	public HealthCareApplicantInfo fetchByPrimaryKey(
		long healthCareApplicantInfoId) {

		return fetchByPrimaryKey((Serializable)healthCareApplicantInfoId);
	}

	/**
	 * Returns all the health care applicant infos.
	 *
	 * @return the health care applicant infos
	 */
	@Override
	public List<HealthCareApplicantInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the health care applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applicant infos
	 * @param end the upper bound of the range of health care applicant infos (not inclusive)
	 * @return the range of health care applicant infos
	 */
	@Override
	public List<HealthCareApplicantInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the health care applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applicant infos
	 * @param end the upper bound of the range of health care applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care applicant infos
	 */
	@Override
	public List<HealthCareApplicantInfo> findAll(
		int start, int end,
		OrderByComparator<HealthCareApplicantInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the health care applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applicant infos
	 * @param end the upper bound of the range of health care applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care applicant infos
	 */
	@Override
	public List<HealthCareApplicantInfo> findAll(
		int start, int end,
		OrderByComparator<HealthCareApplicantInfo> orderByComparator,
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

		List<HealthCareApplicantInfo> list = null;

		if (useFinderCache) {
			list = (List<HealthCareApplicantInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HEALTHCAREAPPLICANTINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HEALTHCAREAPPLICANTINFO;

				sql = sql.concat(
					HealthCareApplicantInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HealthCareApplicantInfo>)QueryUtil.list(
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
	 * Removes all the health care applicant infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HealthCareApplicantInfo healthCareApplicantInfo : findAll()) {
			remove(healthCareApplicantInfo);
		}
	}

	/**
	 * Returns the number of health care applicant infos.
	 *
	 * @return the number of health care applicant infos
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
					_SQL_COUNT_HEALTHCAREAPPLICANTINFO);

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
		return "healthCareApplicantInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HEALTHCAREAPPLICANTINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HealthCareApplicantInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the health care applicant info persistence.
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

		_finderPathFetchBygetHealthCareById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHealthCareById",
			new String[] {Long.class.getName()},
			new String[] {"healthCareApplicationId"}, true);

		_finderPathCountBygetHealthCareById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHealthCareById", new String[] {Long.class.getName()},
			new String[] {"healthCareApplicationId"}, false);

		HealthCareApplicantInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HealthCareApplicantInfoUtil.setPersistence(null);

		entityCache.removeCache(HealthCareApplicantInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_HEALTHCAREAPPLICANTINFO =
		"SELECT healthCareApplicantInfo FROM HealthCareApplicantInfo healthCareApplicantInfo";

	private static final String _SQL_SELECT_HEALTHCAREAPPLICANTINFO_WHERE =
		"SELECT healthCareApplicantInfo FROM HealthCareApplicantInfo healthCareApplicantInfo WHERE ";

	private static final String _SQL_COUNT_HEALTHCAREAPPLICANTINFO =
		"SELECT COUNT(healthCareApplicantInfo) FROM HealthCareApplicantInfo healthCareApplicantInfo";

	private static final String _SQL_COUNT_HEALTHCAREAPPLICANTINFO_WHERE =
		"SELECT COUNT(healthCareApplicantInfo) FROM HealthCareApplicantInfo healthCareApplicantInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"healthCareApplicantInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HealthCareApplicantInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HealthCareApplicantInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HealthCareApplicantInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}