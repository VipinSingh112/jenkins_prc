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

import com.nbp.healthcare.application.form.service.exception.NoSuchHealthCareDescriptionOfServiceException;
import com.nbp.healthcare.application.form.service.model.HealthCareDescriptionOfService;
import com.nbp.healthcare.application.form.service.model.HealthCareDescriptionOfServiceTable;
import com.nbp.healthcare.application.form.service.model.impl.HealthCareDescriptionOfServiceImpl;
import com.nbp.healthcare.application.form.service.model.impl.HealthCareDescriptionOfServiceModelImpl;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareDescriptionOfServicePersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareDescriptionOfServiceUtil;
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
 * The persistence implementation for the health care description of service service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HealthCareDescriptionOfServicePersistence.class)
public class HealthCareDescriptionOfServicePersistenceImpl
	extends BasePersistenceImpl<HealthCareDescriptionOfService>
	implements HealthCareDescriptionOfServicePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HealthCareDescriptionOfServiceUtil</code> to access the health care description of service persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HealthCareDescriptionOfServiceImpl.class.getName();

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
	 * Returns the health care description of service where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareDescriptionOfServiceException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care description of service
	 * @throws NoSuchHealthCareDescriptionOfServiceException if a matching health care description of service could not be found
	 */
	@Override
	public HealthCareDescriptionOfService findBygetHealthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareDescriptionOfServiceException {

		HealthCareDescriptionOfService healthCareDescriptionOfService =
			fetchBygetHealthCareById(healthCareApplicationId);

		if (healthCareDescriptionOfService == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("healthCareApplicationId=");
			sb.append(healthCareApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHealthCareDescriptionOfServiceException(
				sb.toString());
		}

		return healthCareDescriptionOfService;
	}

	/**
	 * Returns the health care description of service where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care description of service, or <code>null</code> if a matching health care description of service could not be found
	 */
	@Override
	public HealthCareDescriptionOfService fetchBygetHealthCareById(
		long healthCareApplicationId) {

		return fetchBygetHealthCareById(healthCareApplicationId, true);
	}

	/**
	 * Returns the health care description of service where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care description of service, or <code>null</code> if a matching health care description of service could not be found
	 */
	@Override
	public HealthCareDescriptionOfService fetchBygetHealthCareById(
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

		if (result instanceof HealthCareDescriptionOfService) {
			HealthCareDescriptionOfService healthCareDescriptionOfService =
				(HealthCareDescriptionOfService)result;

			if (healthCareApplicationId !=
					healthCareDescriptionOfService.
						getHealthCareApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HEALTHCAREDESCRIPTIONOFSERVICE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETHEALTHCAREBYID_HEALTHCAREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(healthCareApplicationId);

				List<HealthCareDescriptionOfService> list = query.list();

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
								"HealthCareDescriptionOfServicePersistenceImpl.fetchBygetHealthCareById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HealthCareDescriptionOfService
						healthCareDescriptionOfService = list.get(0);

					result = healthCareDescriptionOfService;

					cacheResult(healthCareDescriptionOfService);
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
			return (HealthCareDescriptionOfService)result;
		}
	}

	/**
	 * Removes the health care description of service where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care description of service that was removed
	 */
	@Override
	public HealthCareDescriptionOfService removeBygetHealthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareDescriptionOfServiceException {

		HealthCareDescriptionOfService healthCareDescriptionOfService =
			findBygetHealthCareById(healthCareApplicationId);

		return remove(healthCareDescriptionOfService);
	}

	/**
	 * Returns the number of health care description of services where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care description of services
	 */
	@Override
	public int countBygetHealthCareById(long healthCareApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHealthCareById;

		Object[] finderArgs = new Object[] {healthCareApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HEALTHCAREDESCRIPTIONOFSERVICE_WHERE);

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
			"healthCareDescriptionOfService.healthCareApplicationId = ?";

	public HealthCareDescriptionOfServicePersistenceImpl() {
		setModelClass(HealthCareDescriptionOfService.class);

		setModelImplClass(HealthCareDescriptionOfServiceImpl.class);
		setModelPKClass(long.class);

		setTable(HealthCareDescriptionOfServiceTable.INSTANCE);
	}

	/**
	 * Caches the health care description of service in the entity cache if it is enabled.
	 *
	 * @param healthCareDescriptionOfService the health care description of service
	 */
	@Override
	public void cacheResult(
		HealthCareDescriptionOfService healthCareDescriptionOfService) {

		entityCache.putResult(
			HealthCareDescriptionOfServiceImpl.class,
			healthCareDescriptionOfService.getPrimaryKey(),
			healthCareDescriptionOfService);

		finderCache.putResult(
			_finderPathFetchBygetHealthCareById,
			new Object[] {
				healthCareDescriptionOfService.getHealthCareApplicationId()
			},
			healthCareDescriptionOfService);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the health care description of services in the entity cache if it is enabled.
	 *
	 * @param healthCareDescriptionOfServices the health care description of services
	 */
	@Override
	public void cacheResult(
		List<HealthCareDescriptionOfService> healthCareDescriptionOfServices) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (healthCareDescriptionOfServices.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HealthCareDescriptionOfService healthCareDescriptionOfService :
				healthCareDescriptionOfServices) {

			if (entityCache.getResult(
					HealthCareDescriptionOfServiceImpl.class,
					healthCareDescriptionOfService.getPrimaryKey()) == null) {

				cacheResult(healthCareDescriptionOfService);
			}
		}
	}

	/**
	 * Clears the cache for all health care description of services.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HealthCareDescriptionOfServiceImpl.class);

		finderCache.clearCache(HealthCareDescriptionOfServiceImpl.class);
	}

	/**
	 * Clears the cache for the health care description of service.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		HealthCareDescriptionOfService healthCareDescriptionOfService) {

		entityCache.removeResult(
			HealthCareDescriptionOfServiceImpl.class,
			healthCareDescriptionOfService);
	}

	@Override
	public void clearCache(
		List<HealthCareDescriptionOfService> healthCareDescriptionOfServices) {

		for (HealthCareDescriptionOfService healthCareDescriptionOfService :
				healthCareDescriptionOfServices) {

			entityCache.removeResult(
				HealthCareDescriptionOfServiceImpl.class,
				healthCareDescriptionOfService);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HealthCareDescriptionOfServiceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				HealthCareDescriptionOfServiceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		HealthCareDescriptionOfServiceModelImpl
			healthCareDescriptionOfServiceModelImpl) {

		Object[] args = new Object[] {
			healthCareDescriptionOfServiceModelImpl.getHealthCareApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHealthCareById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHealthCareById, args,
			healthCareDescriptionOfServiceModelImpl);
	}

	/**
	 * Creates a new health care description of service with the primary key. Does not add the health care description of service to the database.
	 *
	 * @param healthCareDescriptionId the primary key for the new health care description of service
	 * @return the new health care description of service
	 */
	@Override
	public HealthCareDescriptionOfService create(long healthCareDescriptionId) {
		HealthCareDescriptionOfService healthCareDescriptionOfService =
			new HealthCareDescriptionOfServiceImpl();

		healthCareDescriptionOfService.setNew(true);
		healthCareDescriptionOfService.setPrimaryKey(healthCareDescriptionId);

		healthCareDescriptionOfService.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return healthCareDescriptionOfService;
	}

	/**
	 * Removes the health care description of service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareDescriptionId the primary key of the health care description of service
	 * @return the health care description of service that was removed
	 * @throws NoSuchHealthCareDescriptionOfServiceException if a health care description of service with the primary key could not be found
	 */
	@Override
	public HealthCareDescriptionOfService remove(long healthCareDescriptionId)
		throws NoSuchHealthCareDescriptionOfServiceException {

		return remove((Serializable)healthCareDescriptionId);
	}

	/**
	 * Removes the health care description of service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the health care description of service
	 * @return the health care description of service that was removed
	 * @throws NoSuchHealthCareDescriptionOfServiceException if a health care description of service with the primary key could not be found
	 */
	@Override
	public HealthCareDescriptionOfService remove(Serializable primaryKey)
		throws NoSuchHealthCareDescriptionOfServiceException {

		Session session = null;

		try {
			session = openSession();

			HealthCareDescriptionOfService healthCareDescriptionOfService =
				(HealthCareDescriptionOfService)session.get(
					HealthCareDescriptionOfServiceImpl.class, primaryKey);

			if (healthCareDescriptionOfService == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHealthCareDescriptionOfServiceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(healthCareDescriptionOfService);
		}
		catch (NoSuchHealthCareDescriptionOfServiceException
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
	protected HealthCareDescriptionOfService removeImpl(
		HealthCareDescriptionOfService healthCareDescriptionOfService) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(healthCareDescriptionOfService)) {
				healthCareDescriptionOfService =
					(HealthCareDescriptionOfService)session.get(
						HealthCareDescriptionOfServiceImpl.class,
						healthCareDescriptionOfService.getPrimaryKeyObj());
			}

			if (healthCareDescriptionOfService != null) {
				session.delete(healthCareDescriptionOfService);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (healthCareDescriptionOfService != null) {
			clearCache(healthCareDescriptionOfService);
		}

		return healthCareDescriptionOfService;
	}

	@Override
	public HealthCareDescriptionOfService updateImpl(
		HealthCareDescriptionOfService healthCareDescriptionOfService) {

		boolean isNew = healthCareDescriptionOfService.isNew();

		if (!(healthCareDescriptionOfService instanceof
				HealthCareDescriptionOfServiceModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					healthCareDescriptionOfService.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					healthCareDescriptionOfService);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in healthCareDescriptionOfService proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HealthCareDescriptionOfService implementation " +
					healthCareDescriptionOfService.getClass());
		}

		HealthCareDescriptionOfServiceModelImpl
			healthCareDescriptionOfServiceModelImpl =
				(HealthCareDescriptionOfServiceModelImpl)
					healthCareDescriptionOfService;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (healthCareDescriptionOfService.getCreateDate() == null)) {
			if (serviceContext == null) {
				healthCareDescriptionOfService.setCreateDate(date);
			}
			else {
				healthCareDescriptionOfService.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!healthCareDescriptionOfServiceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				healthCareDescriptionOfService.setModifiedDate(date);
			}
			else {
				healthCareDescriptionOfService.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(healthCareDescriptionOfService);
			}
			else {
				healthCareDescriptionOfService =
					(HealthCareDescriptionOfService)session.merge(
						healthCareDescriptionOfService);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HealthCareDescriptionOfServiceImpl.class,
			healthCareDescriptionOfServiceModelImpl, false, true);

		cacheUniqueFindersCache(healthCareDescriptionOfServiceModelImpl);

		if (isNew) {
			healthCareDescriptionOfService.setNew(false);
		}

		healthCareDescriptionOfService.resetOriginalValues();

		return healthCareDescriptionOfService;
	}

	/**
	 * Returns the health care description of service with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the health care description of service
	 * @return the health care description of service
	 * @throws NoSuchHealthCareDescriptionOfServiceException if a health care description of service with the primary key could not be found
	 */
	@Override
	public HealthCareDescriptionOfService findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchHealthCareDescriptionOfServiceException {

		HealthCareDescriptionOfService healthCareDescriptionOfService =
			fetchByPrimaryKey(primaryKey);

		if (healthCareDescriptionOfService == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHealthCareDescriptionOfServiceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return healthCareDescriptionOfService;
	}

	/**
	 * Returns the health care description of service with the primary key or throws a <code>NoSuchHealthCareDescriptionOfServiceException</code> if it could not be found.
	 *
	 * @param healthCareDescriptionId the primary key of the health care description of service
	 * @return the health care description of service
	 * @throws NoSuchHealthCareDescriptionOfServiceException if a health care description of service with the primary key could not be found
	 */
	@Override
	public HealthCareDescriptionOfService findByPrimaryKey(
			long healthCareDescriptionId)
		throws NoSuchHealthCareDescriptionOfServiceException {

		return findByPrimaryKey((Serializable)healthCareDescriptionId);
	}

	/**
	 * Returns the health care description of service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareDescriptionId the primary key of the health care description of service
	 * @return the health care description of service, or <code>null</code> if a health care description of service with the primary key could not be found
	 */
	@Override
	public HealthCareDescriptionOfService fetchByPrimaryKey(
		long healthCareDescriptionId) {

		return fetchByPrimaryKey((Serializable)healthCareDescriptionId);
	}

	/**
	 * Returns all the health care description of services.
	 *
	 * @return the health care description of services
	 */
	@Override
	public List<HealthCareDescriptionOfService> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the health care description of services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareDescriptionOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care description of services
	 * @param end the upper bound of the range of health care description of services (not inclusive)
	 * @return the range of health care description of services
	 */
	@Override
	public List<HealthCareDescriptionOfService> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the health care description of services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareDescriptionOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care description of services
	 * @param end the upper bound of the range of health care description of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care description of services
	 */
	@Override
	public List<HealthCareDescriptionOfService> findAll(
		int start, int end,
		OrderByComparator<HealthCareDescriptionOfService> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the health care description of services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareDescriptionOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care description of services
	 * @param end the upper bound of the range of health care description of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care description of services
	 */
	@Override
	public List<HealthCareDescriptionOfService> findAll(
		int start, int end,
		OrderByComparator<HealthCareDescriptionOfService> orderByComparator,
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

		List<HealthCareDescriptionOfService> list = null;

		if (useFinderCache) {
			list = (List<HealthCareDescriptionOfService>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HEALTHCAREDESCRIPTIONOFSERVICE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HEALTHCAREDESCRIPTIONOFSERVICE;

				sql = sql.concat(
					HealthCareDescriptionOfServiceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HealthCareDescriptionOfService>)QueryUtil.list(
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
	 * Removes all the health care description of services from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HealthCareDescriptionOfService healthCareDescriptionOfService :
				findAll()) {

			remove(healthCareDescriptionOfService);
		}
	}

	/**
	 * Returns the number of health care description of services.
	 *
	 * @return the number of health care description of services
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
					_SQL_COUNT_HEALTHCAREDESCRIPTIONOFSERVICE);

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
		return "healthCareDescriptionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HEALTHCAREDESCRIPTIONOFSERVICE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HealthCareDescriptionOfServiceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the health care description of service persistence.
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

		HealthCareDescriptionOfServiceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HealthCareDescriptionOfServiceUtil.setPersistence(null);

		entityCache.removeCache(
			HealthCareDescriptionOfServiceImpl.class.getName());
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

	private static final String _SQL_SELECT_HEALTHCAREDESCRIPTIONOFSERVICE =
		"SELECT healthCareDescriptionOfService FROM HealthCareDescriptionOfService healthCareDescriptionOfService";

	private static final String
		_SQL_SELECT_HEALTHCAREDESCRIPTIONOFSERVICE_WHERE =
			"SELECT healthCareDescriptionOfService FROM HealthCareDescriptionOfService healthCareDescriptionOfService WHERE ";

	private static final String _SQL_COUNT_HEALTHCAREDESCRIPTIONOFSERVICE =
		"SELECT COUNT(healthCareDescriptionOfService) FROM HealthCareDescriptionOfService healthCareDescriptionOfService";

	private static final String
		_SQL_COUNT_HEALTHCAREDESCRIPTIONOFSERVICE_WHERE =
			"SELECT COUNT(healthCareDescriptionOfService) FROM HealthCareDescriptionOfService healthCareDescriptionOfService WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"healthCareDescriptionOfService.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HealthCareDescriptionOfService exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HealthCareDescriptionOfService exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HealthCareDescriptionOfServicePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}