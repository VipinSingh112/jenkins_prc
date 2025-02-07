/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence.impl;

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

import com.nbp.acquire.application.form.service.exception.NoSuchAcquirePaymentPlanException;
import com.nbp.acquire.application.form.service.model.AcquirePaymentPlan;
import com.nbp.acquire.application.form.service.model.AcquirePaymentPlanTable;
import com.nbp.acquire.application.form.service.model.impl.AcquirePaymentPlanImpl;
import com.nbp.acquire.application.form.service.model.impl.AcquirePaymentPlanModelImpl;
import com.nbp.acquire.application.form.service.service.persistence.AcquirePaymentPlanPersistence;
import com.nbp.acquire.application.form.service.service.persistence.AcquirePaymentPlanUtil;
import com.nbp.acquire.application.form.service.service.persistence.impl.constants.ACQUIREPersistenceConstants;

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
 * The persistence implementation for the acquire payment plan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AcquirePaymentPlanPersistence.class)
public class AcquirePaymentPlanPersistenceImpl
	extends BasePersistenceImpl<AcquirePaymentPlan>
	implements AcquirePaymentPlanPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AcquirePaymentPlanUtil</code> to access the acquire payment plan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AcquirePaymentPlanImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetAcquireById;
	private FinderPath _finderPathCountBygetAcquireById;

	/**
	 * Returns the acquire payment plan where acquireApplicationId = &#63; or throws a <code>NoSuchAcquirePaymentPlanException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire payment plan
	 * @throws NoSuchAcquirePaymentPlanException if a matching acquire payment plan could not be found
	 */
	@Override
	public AcquirePaymentPlan findBygetAcquireById(long acquireApplicationId)
		throws NoSuchAcquirePaymentPlanException {

		AcquirePaymentPlan acquirePaymentPlan = fetchBygetAcquireById(
			acquireApplicationId);

		if (acquirePaymentPlan == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("acquireApplicationId=");
			sb.append(acquireApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquirePaymentPlanException(sb.toString());
		}

		return acquirePaymentPlan;
	}

	/**
	 * Returns the acquire payment plan where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire payment plan, or <code>null</code> if a matching acquire payment plan could not be found
	 */
	@Override
	public AcquirePaymentPlan fetchBygetAcquireById(long acquireApplicationId) {
		return fetchBygetAcquireById(acquireApplicationId, true);
	}

	/**
	 * Returns the acquire payment plan where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire payment plan, or <code>null</code> if a matching acquire payment plan could not be found
	 */
	@Override
	public AcquirePaymentPlan fetchBygetAcquireById(
		long acquireApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {acquireApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAcquireById, finderArgs, this);
		}

		if (result instanceof AcquirePaymentPlan) {
			AcquirePaymentPlan acquirePaymentPlan = (AcquirePaymentPlan)result;

			if (acquireApplicationId !=
					acquirePaymentPlan.getAcquireApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACQUIREPAYMENTPLAN_WHERE);

			sb.append(_FINDER_COLUMN_GETACQUIREBYID_ACQUIREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(acquireApplicationId);

				List<AcquirePaymentPlan> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAcquireById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									acquireApplicationId
								};
							}

							_log.warn(
								"AcquirePaymentPlanPersistenceImpl.fetchBygetAcquireById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquirePaymentPlan acquirePaymentPlan = list.get(0);

					result = acquirePaymentPlan;

					cacheResult(acquirePaymentPlan);
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
			return (AcquirePaymentPlan)result;
		}
	}

	/**
	 * Removes the acquire payment plan where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire payment plan that was removed
	 */
	@Override
	public AcquirePaymentPlan removeBygetAcquireById(long acquireApplicationId)
		throws NoSuchAcquirePaymentPlanException {

		AcquirePaymentPlan acquirePaymentPlan = findBygetAcquireById(
			acquireApplicationId);

		return remove(acquirePaymentPlan);
	}

	/**
	 * Returns the number of acquire payment plans where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire payment plans
	 */
	@Override
	public int countBygetAcquireById(long acquireApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAcquireById;

		Object[] finderArgs = new Object[] {acquireApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREPAYMENTPLAN_WHERE);

			sb.append(_FINDER_COLUMN_GETACQUIREBYID_ACQUIREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(acquireApplicationId);

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
		_FINDER_COLUMN_GETACQUIREBYID_ACQUIREAPPLICATIONID_2 =
			"acquirePaymentPlan.acquireApplicationId = ?";

	public AcquirePaymentPlanPersistenceImpl() {
		setModelClass(AcquirePaymentPlan.class);

		setModelImplClass(AcquirePaymentPlanImpl.class);
		setModelPKClass(long.class);

		setTable(AcquirePaymentPlanTable.INSTANCE);
	}

	/**
	 * Caches the acquire payment plan in the entity cache if it is enabled.
	 *
	 * @param acquirePaymentPlan the acquire payment plan
	 */
	@Override
	public void cacheResult(AcquirePaymentPlan acquirePaymentPlan) {
		entityCache.putResult(
			AcquirePaymentPlanImpl.class, acquirePaymentPlan.getPrimaryKey(),
			acquirePaymentPlan);

		finderCache.putResult(
			_finderPathFetchBygetAcquireById,
			new Object[] {acquirePaymentPlan.getAcquireApplicationId()},
			acquirePaymentPlan);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acquire payment plans in the entity cache if it is enabled.
	 *
	 * @param acquirePaymentPlans the acquire payment plans
	 */
	@Override
	public void cacheResult(List<AcquirePaymentPlan> acquirePaymentPlans) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (acquirePaymentPlans.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AcquirePaymentPlan acquirePaymentPlan : acquirePaymentPlans) {
			if (entityCache.getResult(
					AcquirePaymentPlanImpl.class,
					acquirePaymentPlan.getPrimaryKey()) == null) {

				cacheResult(acquirePaymentPlan);
			}
		}
	}

	/**
	 * Clears the cache for all acquire payment plans.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AcquirePaymentPlanImpl.class);

		finderCache.clearCache(AcquirePaymentPlanImpl.class);
	}

	/**
	 * Clears the cache for the acquire payment plan.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AcquirePaymentPlan acquirePaymentPlan) {
		entityCache.removeResult(
			AcquirePaymentPlanImpl.class, acquirePaymentPlan);
	}

	@Override
	public void clearCache(List<AcquirePaymentPlan> acquirePaymentPlans) {
		for (AcquirePaymentPlan acquirePaymentPlan : acquirePaymentPlans) {
			entityCache.removeResult(
				AcquirePaymentPlanImpl.class, acquirePaymentPlan);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AcquirePaymentPlanImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AcquirePaymentPlanImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AcquirePaymentPlanModelImpl acquirePaymentPlanModelImpl) {

		Object[] args = new Object[] {
			acquirePaymentPlanModelImpl.getAcquireApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetAcquireById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquireById, args,
			acquirePaymentPlanModelImpl);
	}

	/**
	 * Creates a new acquire payment plan with the primary key. Does not add the acquire payment plan to the database.
	 *
	 * @param acquirePaymentPlanId the primary key for the new acquire payment plan
	 * @return the new acquire payment plan
	 */
	@Override
	public AcquirePaymentPlan create(long acquirePaymentPlanId) {
		AcquirePaymentPlan acquirePaymentPlan = new AcquirePaymentPlanImpl();

		acquirePaymentPlan.setNew(true);
		acquirePaymentPlan.setPrimaryKey(acquirePaymentPlanId);

		acquirePaymentPlan.setCompanyId(CompanyThreadLocal.getCompanyId());

		return acquirePaymentPlan;
	}

	/**
	 * Removes the acquire payment plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquirePaymentPlanId the primary key of the acquire payment plan
	 * @return the acquire payment plan that was removed
	 * @throws NoSuchAcquirePaymentPlanException if a acquire payment plan with the primary key could not be found
	 */
	@Override
	public AcquirePaymentPlan remove(long acquirePaymentPlanId)
		throws NoSuchAcquirePaymentPlanException {

		return remove((Serializable)acquirePaymentPlanId);
	}

	/**
	 * Removes the acquire payment plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acquire payment plan
	 * @return the acquire payment plan that was removed
	 * @throws NoSuchAcquirePaymentPlanException if a acquire payment plan with the primary key could not be found
	 */
	@Override
	public AcquirePaymentPlan remove(Serializable primaryKey)
		throws NoSuchAcquirePaymentPlanException {

		Session session = null;

		try {
			session = openSession();

			AcquirePaymentPlan acquirePaymentPlan =
				(AcquirePaymentPlan)session.get(
					AcquirePaymentPlanImpl.class, primaryKey);

			if (acquirePaymentPlan == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAcquirePaymentPlanException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(acquirePaymentPlan);
		}
		catch (NoSuchAcquirePaymentPlanException noSuchEntityException) {
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
	protected AcquirePaymentPlan removeImpl(
		AcquirePaymentPlan acquirePaymentPlan) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acquirePaymentPlan)) {
				acquirePaymentPlan = (AcquirePaymentPlan)session.get(
					AcquirePaymentPlanImpl.class,
					acquirePaymentPlan.getPrimaryKeyObj());
			}

			if (acquirePaymentPlan != null) {
				session.delete(acquirePaymentPlan);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (acquirePaymentPlan != null) {
			clearCache(acquirePaymentPlan);
		}

		return acquirePaymentPlan;
	}

	@Override
	public AcquirePaymentPlan updateImpl(
		AcquirePaymentPlan acquirePaymentPlan) {

		boolean isNew = acquirePaymentPlan.isNew();

		if (!(acquirePaymentPlan instanceof AcquirePaymentPlanModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(acquirePaymentPlan.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					acquirePaymentPlan);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in acquirePaymentPlan proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AcquirePaymentPlan implementation " +
					acquirePaymentPlan.getClass());
		}

		AcquirePaymentPlanModelImpl acquirePaymentPlanModelImpl =
			(AcquirePaymentPlanModelImpl)acquirePaymentPlan;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (acquirePaymentPlan.getCreateDate() == null)) {
			if (serviceContext == null) {
				acquirePaymentPlan.setCreateDate(date);
			}
			else {
				acquirePaymentPlan.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!acquirePaymentPlanModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				acquirePaymentPlan.setModifiedDate(date);
			}
			else {
				acquirePaymentPlan.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(acquirePaymentPlan);
			}
			else {
				acquirePaymentPlan = (AcquirePaymentPlan)session.merge(
					acquirePaymentPlan);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AcquirePaymentPlanImpl.class, acquirePaymentPlanModelImpl, false,
			true);

		cacheUniqueFindersCache(acquirePaymentPlanModelImpl);

		if (isNew) {
			acquirePaymentPlan.setNew(false);
		}

		acquirePaymentPlan.resetOriginalValues();

		return acquirePaymentPlan;
	}

	/**
	 * Returns the acquire payment plan with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acquire payment plan
	 * @return the acquire payment plan
	 * @throws NoSuchAcquirePaymentPlanException if a acquire payment plan with the primary key could not be found
	 */
	@Override
	public AcquirePaymentPlan findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAcquirePaymentPlanException {

		AcquirePaymentPlan acquirePaymentPlan = fetchByPrimaryKey(primaryKey);

		if (acquirePaymentPlan == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAcquirePaymentPlanException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return acquirePaymentPlan;
	}

	/**
	 * Returns the acquire payment plan with the primary key or throws a <code>NoSuchAcquirePaymentPlanException</code> if it could not be found.
	 *
	 * @param acquirePaymentPlanId the primary key of the acquire payment plan
	 * @return the acquire payment plan
	 * @throws NoSuchAcquirePaymentPlanException if a acquire payment plan with the primary key could not be found
	 */
	@Override
	public AcquirePaymentPlan findByPrimaryKey(long acquirePaymentPlanId)
		throws NoSuchAcquirePaymentPlanException {

		return findByPrimaryKey((Serializable)acquirePaymentPlanId);
	}

	/**
	 * Returns the acquire payment plan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquirePaymentPlanId the primary key of the acquire payment plan
	 * @return the acquire payment plan, or <code>null</code> if a acquire payment plan with the primary key could not be found
	 */
	@Override
	public AcquirePaymentPlan fetchByPrimaryKey(long acquirePaymentPlanId) {
		return fetchByPrimaryKey((Serializable)acquirePaymentPlanId);
	}

	/**
	 * Returns all the acquire payment plans.
	 *
	 * @return the acquire payment plans
	 */
	@Override
	public List<AcquirePaymentPlan> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire payment plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire payment plans
	 * @param end the upper bound of the range of acquire payment plans (not inclusive)
	 * @return the range of acquire payment plans
	 */
	@Override
	public List<AcquirePaymentPlan> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire payment plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire payment plans
	 * @param end the upper bound of the range of acquire payment plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire payment plans
	 */
	@Override
	public List<AcquirePaymentPlan> findAll(
		int start, int end,
		OrderByComparator<AcquirePaymentPlan> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire payment plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire payment plans
	 * @param end the upper bound of the range of acquire payment plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire payment plans
	 */
	@Override
	public List<AcquirePaymentPlan> findAll(
		int start, int end,
		OrderByComparator<AcquirePaymentPlan> orderByComparator,
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

		List<AcquirePaymentPlan> list = null;

		if (useFinderCache) {
			list = (List<AcquirePaymentPlan>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACQUIREPAYMENTPLAN);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACQUIREPAYMENTPLAN;

				sql = sql.concat(AcquirePaymentPlanModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AcquirePaymentPlan>)QueryUtil.list(
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
	 * Removes all the acquire payment plans from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AcquirePaymentPlan acquirePaymentPlan : findAll()) {
			remove(acquirePaymentPlan);
		}
	}

	/**
	 * Returns the number of acquire payment plans.
	 *
	 * @return the number of acquire payment plans
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
					_SQL_COUNT_ACQUIREPAYMENTPLAN);

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
		return "acquirePaymentPlanId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACQUIREPAYMENTPLAN;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AcquirePaymentPlanModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acquire payment plan persistence.
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

		_finderPathFetchBygetAcquireById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAcquireById",
			new String[] {Long.class.getName()},
			new String[] {"acquireApplicationId"}, true);

		_finderPathCountBygetAcquireById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetAcquireById",
			new String[] {Long.class.getName()},
			new String[] {"acquireApplicationId"}, false);

		AcquirePaymentPlanUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AcquirePaymentPlanUtil.setPersistence(null);

		entityCache.removeCache(AcquirePaymentPlanImpl.class.getName());
	}

	@Override
	@Reference(
		target = ACQUIREPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ACQUIREPAYMENTPLAN =
		"SELECT acquirePaymentPlan FROM AcquirePaymentPlan acquirePaymentPlan";

	private static final String _SQL_SELECT_ACQUIREPAYMENTPLAN_WHERE =
		"SELECT acquirePaymentPlan FROM AcquirePaymentPlan acquirePaymentPlan WHERE ";

	private static final String _SQL_COUNT_ACQUIREPAYMENTPLAN =
		"SELECT COUNT(acquirePaymentPlan) FROM AcquirePaymentPlan acquirePaymentPlan";

	private static final String _SQL_COUNT_ACQUIREPAYMENTPLAN_WHERE =
		"SELECT COUNT(acquirePaymentPlan) FROM AcquirePaymentPlan acquirePaymentPlan WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "acquirePaymentPlan.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AcquirePaymentPlan exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AcquirePaymentPlan exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AcquirePaymentPlanPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}