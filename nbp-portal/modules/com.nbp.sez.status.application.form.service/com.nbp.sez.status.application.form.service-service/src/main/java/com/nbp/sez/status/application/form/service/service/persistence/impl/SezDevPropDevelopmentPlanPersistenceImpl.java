/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence.impl;

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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevPropDevelopmentPlanException;
import com.nbp.sez.status.application.form.service.model.SezDevPropDevelopmentPlan;
import com.nbp.sez.status.application.form.service.model.SezDevPropDevelopmentPlanTable;
import com.nbp.sez.status.application.form.service.model.impl.SezDevPropDevelopmentPlanImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezDevPropDevelopmentPlanModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevPropDevelopmentPlanPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevPropDevelopmentPlanUtil;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;

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
 * The persistence implementation for the sez dev prop development plan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezDevPropDevelopmentPlanPersistence.class)
public class SezDevPropDevelopmentPlanPersistenceImpl
	extends BasePersistenceImpl<SezDevPropDevelopmentPlan>
	implements SezDevPropDevelopmentPlanPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezDevPropDevelopmentPlanUtil</code> to access the sez dev prop development plan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezDevPropDevelopmentPlanImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetSezStatusByAppId;
	private FinderPath _finderPathCountBygetSezStatusByAppId;

	/**
	 * Returns the sez dev prop development plan where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDevPropDevelopmentPlanException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev prop development plan
	 * @throws NoSuchSezDevPropDevelopmentPlanException if a matching sez dev prop development plan could not be found
	 */
	@Override
	public SezDevPropDevelopmentPlan findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevPropDevelopmentPlanException {

		SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan =
			fetchBygetSezStatusByAppId(sezStatusApplicationId);

		if (sezDevPropDevelopmentPlan == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezDevPropDevelopmentPlanException(sb.toString());
		}

		return sezDevPropDevelopmentPlan;
	}

	/**
	 * Returns the sez dev prop development plan where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev prop development plan, or <code>null</code> if a matching sez dev prop development plan could not be found
	 */
	@Override
	public SezDevPropDevelopmentPlan fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez dev prop development plan where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez dev prop development plan, or <code>null</code> if a matching sez dev prop development plan could not be found
	 */
	@Override
	public SezDevPropDevelopmentPlan fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {sezStatusApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSezStatusByAppId, finderArgs, this);
		}

		if (result instanceof SezDevPropDevelopmentPlan) {
			SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan =
				(SezDevPropDevelopmentPlan)result;

			if (sezStatusApplicationId !=
					sezDevPropDevelopmentPlan.getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZDEVPROPDEVELOPMENTPLAN_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezDevPropDevelopmentPlan> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSezStatusByAppId, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									sezStatusApplicationId
								};
							}

							_log.warn(
								"SezDevPropDevelopmentPlanPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan =
						list.get(0);

					result = sezDevPropDevelopmentPlan;

					cacheResult(sezDevPropDevelopmentPlan);
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
			return (SezDevPropDevelopmentPlan)result;
		}
	}

	/**
	 * Removes the sez dev prop development plan where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez dev prop development plan that was removed
	 */
	@Override
	public SezDevPropDevelopmentPlan removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevPropDevelopmentPlanException {

		SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan =
			findBygetSezStatusByAppId(sezStatusApplicationId);

		return remove(sezDevPropDevelopmentPlan);
	}

	/**
	 * Returns the number of sez dev prop development plans where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev prop development plans
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZDEVPROPDEVELOPMENTPLAN_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

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
		_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2 =
			"sezDevPropDevelopmentPlan.sezStatusApplicationId = ?";

	public SezDevPropDevelopmentPlanPersistenceImpl() {
		setModelClass(SezDevPropDevelopmentPlan.class);

		setModelImplClass(SezDevPropDevelopmentPlanImpl.class);
		setModelPKClass(long.class);

		setTable(SezDevPropDevelopmentPlanTable.INSTANCE);
	}

	/**
	 * Caches the sez dev prop development plan in the entity cache if it is enabled.
	 *
	 * @param sezDevPropDevelopmentPlan the sez dev prop development plan
	 */
	@Override
	public void cacheResult(
		SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan) {

		entityCache.putResult(
			SezDevPropDevelopmentPlanImpl.class,
			sezDevPropDevelopmentPlan.getPrimaryKey(),
			sezDevPropDevelopmentPlan);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {
				sezDevPropDevelopmentPlan.getSezStatusApplicationId()
			},
			sezDevPropDevelopmentPlan);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez dev prop development plans in the entity cache if it is enabled.
	 *
	 * @param sezDevPropDevelopmentPlans the sez dev prop development plans
	 */
	@Override
	public void cacheResult(
		List<SezDevPropDevelopmentPlan> sezDevPropDevelopmentPlans) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezDevPropDevelopmentPlans.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan :
				sezDevPropDevelopmentPlans) {

			if (entityCache.getResult(
					SezDevPropDevelopmentPlanImpl.class,
					sezDevPropDevelopmentPlan.getPrimaryKey()) == null) {

				cacheResult(sezDevPropDevelopmentPlan);
			}
		}
	}

	/**
	 * Clears the cache for all sez dev prop development plans.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezDevPropDevelopmentPlanImpl.class);

		finderCache.clearCache(SezDevPropDevelopmentPlanImpl.class);
	}

	/**
	 * Clears the cache for the sez dev prop development plan.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan) {

		entityCache.removeResult(
			SezDevPropDevelopmentPlanImpl.class, sezDevPropDevelopmentPlan);
	}

	@Override
	public void clearCache(
		List<SezDevPropDevelopmentPlan> sezDevPropDevelopmentPlans) {

		for (SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan :
				sezDevPropDevelopmentPlans) {

			entityCache.removeResult(
				SezDevPropDevelopmentPlanImpl.class, sezDevPropDevelopmentPlan);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezDevPropDevelopmentPlanImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezDevPropDevelopmentPlanImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezDevPropDevelopmentPlanModelImpl sezDevPropDevelopmentPlanModelImpl) {

		Object[] args = new Object[] {
			sezDevPropDevelopmentPlanModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezDevPropDevelopmentPlanModelImpl);
	}

	/**
	 * Creates a new sez dev prop development plan with the primary key. Does not add the sez dev prop development plan to the database.
	 *
	 * @param sezDevPropDevelopmentPlanId the primary key for the new sez dev prop development plan
	 * @return the new sez dev prop development plan
	 */
	@Override
	public SezDevPropDevelopmentPlan create(long sezDevPropDevelopmentPlanId) {
		SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan =
			new SezDevPropDevelopmentPlanImpl();

		sezDevPropDevelopmentPlan.setNew(true);
		sezDevPropDevelopmentPlan.setPrimaryKey(sezDevPropDevelopmentPlanId);

		sezDevPropDevelopmentPlan.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezDevPropDevelopmentPlan;
	}

	/**
	 * Removes the sez dev prop development plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevPropDevelopmentPlanId the primary key of the sez dev prop development plan
	 * @return the sez dev prop development plan that was removed
	 * @throws NoSuchSezDevPropDevelopmentPlanException if a sez dev prop development plan with the primary key could not be found
	 */
	@Override
	public SezDevPropDevelopmentPlan remove(long sezDevPropDevelopmentPlanId)
		throws NoSuchSezDevPropDevelopmentPlanException {

		return remove((Serializable)sezDevPropDevelopmentPlanId);
	}

	/**
	 * Removes the sez dev prop development plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez dev prop development plan
	 * @return the sez dev prop development plan that was removed
	 * @throws NoSuchSezDevPropDevelopmentPlanException if a sez dev prop development plan with the primary key could not be found
	 */
	@Override
	public SezDevPropDevelopmentPlan remove(Serializable primaryKey)
		throws NoSuchSezDevPropDevelopmentPlanException {

		Session session = null;

		try {
			session = openSession();

			SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan =
				(SezDevPropDevelopmentPlan)session.get(
					SezDevPropDevelopmentPlanImpl.class, primaryKey);

			if (sezDevPropDevelopmentPlan == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezDevPropDevelopmentPlanException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezDevPropDevelopmentPlan);
		}
		catch (NoSuchSezDevPropDevelopmentPlanException noSuchEntityException) {
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
	protected SezDevPropDevelopmentPlan removeImpl(
		SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezDevPropDevelopmentPlan)) {
				sezDevPropDevelopmentPlan =
					(SezDevPropDevelopmentPlan)session.get(
						SezDevPropDevelopmentPlanImpl.class,
						sezDevPropDevelopmentPlan.getPrimaryKeyObj());
			}

			if (sezDevPropDevelopmentPlan != null) {
				session.delete(sezDevPropDevelopmentPlan);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezDevPropDevelopmentPlan != null) {
			clearCache(sezDevPropDevelopmentPlan);
		}

		return sezDevPropDevelopmentPlan;
	}

	@Override
	public SezDevPropDevelopmentPlan updateImpl(
		SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan) {

		boolean isNew = sezDevPropDevelopmentPlan.isNew();

		if (!(sezDevPropDevelopmentPlan instanceof
				SezDevPropDevelopmentPlanModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezDevPropDevelopmentPlan.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezDevPropDevelopmentPlan);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezDevPropDevelopmentPlan proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezDevPropDevelopmentPlan implementation " +
					sezDevPropDevelopmentPlan.getClass());
		}

		SezDevPropDevelopmentPlanModelImpl sezDevPropDevelopmentPlanModelImpl =
			(SezDevPropDevelopmentPlanModelImpl)sezDevPropDevelopmentPlan;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezDevPropDevelopmentPlan.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezDevPropDevelopmentPlan.setCreateDate(date);
			}
			else {
				sezDevPropDevelopmentPlan.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezDevPropDevelopmentPlanModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezDevPropDevelopmentPlan.setModifiedDate(date);
			}
			else {
				sezDevPropDevelopmentPlan.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezDevPropDevelopmentPlan);
			}
			else {
				sezDevPropDevelopmentPlan =
					(SezDevPropDevelopmentPlan)session.merge(
						sezDevPropDevelopmentPlan);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezDevPropDevelopmentPlanImpl.class,
			sezDevPropDevelopmentPlanModelImpl, false, true);

		cacheUniqueFindersCache(sezDevPropDevelopmentPlanModelImpl);

		if (isNew) {
			sezDevPropDevelopmentPlan.setNew(false);
		}

		sezDevPropDevelopmentPlan.resetOriginalValues();

		return sezDevPropDevelopmentPlan;
	}

	/**
	 * Returns the sez dev prop development plan with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez dev prop development plan
	 * @return the sez dev prop development plan
	 * @throws NoSuchSezDevPropDevelopmentPlanException if a sez dev prop development plan with the primary key could not be found
	 */
	@Override
	public SezDevPropDevelopmentPlan findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezDevPropDevelopmentPlanException {

		SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan = fetchByPrimaryKey(
			primaryKey);

		if (sezDevPropDevelopmentPlan == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezDevPropDevelopmentPlanException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezDevPropDevelopmentPlan;
	}

	/**
	 * Returns the sez dev prop development plan with the primary key or throws a <code>NoSuchSezDevPropDevelopmentPlanException</code> if it could not be found.
	 *
	 * @param sezDevPropDevelopmentPlanId the primary key of the sez dev prop development plan
	 * @return the sez dev prop development plan
	 * @throws NoSuchSezDevPropDevelopmentPlanException if a sez dev prop development plan with the primary key could not be found
	 */
	@Override
	public SezDevPropDevelopmentPlan findByPrimaryKey(
			long sezDevPropDevelopmentPlanId)
		throws NoSuchSezDevPropDevelopmentPlanException {

		return findByPrimaryKey((Serializable)sezDevPropDevelopmentPlanId);
	}

	/**
	 * Returns the sez dev prop development plan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevPropDevelopmentPlanId the primary key of the sez dev prop development plan
	 * @return the sez dev prop development plan, or <code>null</code> if a sez dev prop development plan with the primary key could not be found
	 */
	@Override
	public SezDevPropDevelopmentPlan fetchByPrimaryKey(
		long sezDevPropDevelopmentPlanId) {

		return fetchByPrimaryKey((Serializable)sezDevPropDevelopmentPlanId);
	}

	/**
	 * Returns all the sez dev prop development plans.
	 *
	 * @return the sez dev prop development plans
	 */
	@Override
	public List<SezDevPropDevelopmentPlan> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev prop development plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevPropDevelopmentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev prop development plans
	 * @param end the upper bound of the range of sez dev prop development plans (not inclusive)
	 * @return the range of sez dev prop development plans
	 */
	@Override
	public List<SezDevPropDevelopmentPlan> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev prop development plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevPropDevelopmentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev prop development plans
	 * @param end the upper bound of the range of sez dev prop development plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev prop development plans
	 */
	@Override
	public List<SezDevPropDevelopmentPlan> findAll(
		int start, int end,
		OrderByComparator<SezDevPropDevelopmentPlan> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev prop development plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevPropDevelopmentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev prop development plans
	 * @param end the upper bound of the range of sez dev prop development plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev prop development plans
	 */
	@Override
	public List<SezDevPropDevelopmentPlan> findAll(
		int start, int end,
		OrderByComparator<SezDevPropDevelopmentPlan> orderByComparator,
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

		List<SezDevPropDevelopmentPlan> list = null;

		if (useFinderCache) {
			list = (List<SezDevPropDevelopmentPlan>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZDEVPROPDEVELOPMENTPLAN);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZDEVPROPDEVELOPMENTPLAN;

				sql = sql.concat(
					SezDevPropDevelopmentPlanModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezDevPropDevelopmentPlan>)QueryUtil.list(
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
	 * Removes all the sez dev prop development plans from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan : findAll()) {
			remove(sezDevPropDevelopmentPlan);
		}
	}

	/**
	 * Returns the number of sez dev prop development plans.
	 *
	 * @return the number of sez dev prop development plans
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
					_SQL_COUNT_SEZDEVPROPDEVELOPMENTPLAN);

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
		return "sezDevPropDevelopmentPlanId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZDEVPROPDEVELOPMENTPLAN;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezDevPropDevelopmentPlanModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez dev prop development plan persistence.
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

		_finderPathFetchBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSezStatusByAppId",
			new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		SezDevPropDevelopmentPlanUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezDevPropDevelopmentPlanUtil.setPersistence(null);

		entityCache.removeCache(SezDevPropDevelopmentPlanImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZDEVPROPDEVELOPMENTPLAN =
		"SELECT sezDevPropDevelopmentPlan FROM SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan";

	private static final String _SQL_SELECT_SEZDEVPROPDEVELOPMENTPLAN_WHERE =
		"SELECT sezDevPropDevelopmentPlan FROM SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan WHERE ";

	private static final String _SQL_COUNT_SEZDEVPROPDEVELOPMENTPLAN =
		"SELECT COUNT(sezDevPropDevelopmentPlan) FROM SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan";

	private static final String _SQL_COUNT_SEZDEVPROPDEVELOPMENTPLAN_WHERE =
		"SELECT COUNT(sezDevPropDevelopmentPlan) FROM SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezDevPropDevelopmentPlan.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezDevPropDevelopmentPlan exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezDevPropDevelopmentPlan exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezDevPropDevelopmentPlanPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}