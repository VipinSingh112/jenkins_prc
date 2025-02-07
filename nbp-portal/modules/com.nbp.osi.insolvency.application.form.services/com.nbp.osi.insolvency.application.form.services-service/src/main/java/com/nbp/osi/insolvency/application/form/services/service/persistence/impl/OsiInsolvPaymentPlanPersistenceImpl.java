/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence.impl;

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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchOsiInsolvPaymentPlanException;
import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvPaymentPlan;
import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvPaymentPlanTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvPaymentPlanImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvPaymentPlanModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiInsolvPaymentPlanPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiInsolvPaymentPlanUtil;
import com.nbp.osi.insolvency.application.form.services.service.persistence.impl.constants.OSI_INSOLVENCYPersistenceConstants;

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
 * The persistence implementation for the osi insolv payment plan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiInsolvPaymentPlanPersistence.class)
public class OsiInsolvPaymentPlanPersistenceImpl
	extends BasePersistenceImpl<OsiInsolvPaymentPlan>
	implements OsiInsolvPaymentPlanPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiInsolvPaymentPlanUtil</code> to access the osi insolv payment plan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiInsolvPaymentPlanImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOsiInsolvPaymentById;
	private FinderPath _finderPathCountBygetOsiInsolvPaymentById;

	/**
	 * Returns the osi insolv payment plan where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiInsolvPaymentPlanException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolv payment plan
	 * @throws NoSuchOsiInsolvPaymentPlanException if a matching osi insolv payment plan could not be found
	 */
	@Override
	public OsiInsolvPaymentPlan findBygetOsiInsolvPaymentById(
			long osiInsolvencyId)
		throws NoSuchOsiInsolvPaymentPlanException {

		OsiInsolvPaymentPlan osiInsolvPaymentPlan =
			fetchBygetOsiInsolvPaymentById(osiInsolvencyId);

		if (osiInsolvPaymentPlan == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiInsolvPaymentPlanException(sb.toString());
		}

		return osiInsolvPaymentPlan;
	}

	/**
	 * Returns the osi insolv payment plan where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolv payment plan, or <code>null</code> if a matching osi insolv payment plan could not be found
	 */
	@Override
	public OsiInsolvPaymentPlan fetchBygetOsiInsolvPaymentById(
		long osiInsolvencyId) {

		return fetchBygetOsiInsolvPaymentById(osiInsolvencyId, true);
	}

	/**
	 * Returns the osi insolv payment plan where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolv payment plan, or <code>null</code> if a matching osi insolv payment plan could not be found
	 */
	@Override
	public OsiInsolvPaymentPlan fetchBygetOsiInsolvPaymentById(
		long osiInsolvencyId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiInsolvencyId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiInsolvPaymentById, finderArgs, this);
		}

		if (result instanceof OsiInsolvPaymentPlan) {
			OsiInsolvPaymentPlan osiInsolvPaymentPlan =
				(OsiInsolvPaymentPlan)result;

			if (osiInsolvencyId != osiInsolvPaymentPlan.getOsiInsolvencyId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSIINSOLVPAYMENTPLAN_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIINSOLVPAYMENTBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<OsiInsolvPaymentPlan> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOsiInsolvPaymentById,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {osiInsolvencyId};
							}

							_log.warn(
								"OsiInsolvPaymentPlanPersistenceImpl.fetchBygetOsiInsolvPaymentById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiInsolvPaymentPlan osiInsolvPaymentPlan = list.get(0);

					result = osiInsolvPaymentPlan;

					cacheResult(osiInsolvPaymentPlan);
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
			return (OsiInsolvPaymentPlan)result;
		}
	}

	/**
	 * Removes the osi insolv payment plan where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi insolv payment plan that was removed
	 */
	@Override
	public OsiInsolvPaymentPlan removeBygetOsiInsolvPaymentById(
			long osiInsolvencyId)
		throws NoSuchOsiInsolvPaymentPlanException {

		OsiInsolvPaymentPlan osiInsolvPaymentPlan =
			findBygetOsiInsolvPaymentById(osiInsolvencyId);

		return remove(osiInsolvPaymentPlan);
	}

	/**
	 * Returns the number of osi insolv payment plans where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi insolv payment plans
	 */
	@Override
	public int countBygetOsiInsolvPaymentById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiInsolvPaymentById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIINSOLVPAYMENTPLAN_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIINSOLVPAYMENTBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

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
		_FINDER_COLUMN_GETOSIINSOLVPAYMENTBYID_OSIINSOLVENCYID_2 =
			"osiInsolvPaymentPlan.osiInsolvencyId = ?";

	public OsiInsolvPaymentPlanPersistenceImpl() {
		setModelClass(OsiInsolvPaymentPlan.class);

		setModelImplClass(OsiInsolvPaymentPlanImpl.class);
		setModelPKClass(long.class);

		setTable(OsiInsolvPaymentPlanTable.INSTANCE);
	}

	/**
	 * Caches the osi insolv payment plan in the entity cache if it is enabled.
	 *
	 * @param osiInsolvPaymentPlan the osi insolv payment plan
	 */
	@Override
	public void cacheResult(OsiInsolvPaymentPlan osiInsolvPaymentPlan) {
		entityCache.putResult(
			OsiInsolvPaymentPlanImpl.class,
			osiInsolvPaymentPlan.getPrimaryKey(), osiInsolvPaymentPlan);

		finderCache.putResult(
			_finderPathFetchBygetOsiInsolvPaymentById,
			new Object[] {osiInsolvPaymentPlan.getOsiInsolvencyId()},
			osiInsolvPaymentPlan);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi insolv payment plans in the entity cache if it is enabled.
	 *
	 * @param osiInsolvPaymentPlans the osi insolv payment plans
	 */
	@Override
	public void cacheResult(List<OsiInsolvPaymentPlan> osiInsolvPaymentPlans) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiInsolvPaymentPlans.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiInsolvPaymentPlan osiInsolvPaymentPlan :
				osiInsolvPaymentPlans) {

			if (entityCache.getResult(
					OsiInsolvPaymentPlanImpl.class,
					osiInsolvPaymentPlan.getPrimaryKey()) == null) {

				cacheResult(osiInsolvPaymentPlan);
			}
		}
	}

	/**
	 * Clears the cache for all osi insolv payment plans.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiInsolvPaymentPlanImpl.class);

		finderCache.clearCache(OsiInsolvPaymentPlanImpl.class);
	}

	/**
	 * Clears the cache for the osi insolv payment plan.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OsiInsolvPaymentPlan osiInsolvPaymentPlan) {
		entityCache.removeResult(
			OsiInsolvPaymentPlanImpl.class, osiInsolvPaymentPlan);
	}

	@Override
	public void clearCache(List<OsiInsolvPaymentPlan> osiInsolvPaymentPlans) {
		for (OsiInsolvPaymentPlan osiInsolvPaymentPlan :
				osiInsolvPaymentPlans) {

			entityCache.removeResult(
				OsiInsolvPaymentPlanImpl.class, osiInsolvPaymentPlan);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiInsolvPaymentPlanImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiInsolvPaymentPlanImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiInsolvPaymentPlanModelImpl osiInsolvPaymentPlanModelImpl) {

		Object[] args = new Object[] {
			osiInsolvPaymentPlanModelImpl.getOsiInsolvencyId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiInsolvPaymentById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiInsolvPaymentById, args,
			osiInsolvPaymentPlanModelImpl);
	}

	/**
	 * Creates a new osi insolv payment plan with the primary key. Does not add the osi insolv payment plan to the database.
	 *
	 * @param osiInsolvPaymentPlanId the primary key for the new osi insolv payment plan
	 * @return the new osi insolv payment plan
	 */
	@Override
	public OsiInsolvPaymentPlan create(long osiInsolvPaymentPlanId) {
		OsiInsolvPaymentPlan osiInsolvPaymentPlan =
			new OsiInsolvPaymentPlanImpl();

		osiInsolvPaymentPlan.setNew(true);
		osiInsolvPaymentPlan.setPrimaryKey(osiInsolvPaymentPlanId);

		osiInsolvPaymentPlan.setCompanyId(CompanyThreadLocal.getCompanyId());

		return osiInsolvPaymentPlan;
	}

	/**
	 * Removes the osi insolv payment plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInsolvPaymentPlanId the primary key of the osi insolv payment plan
	 * @return the osi insolv payment plan that was removed
	 * @throws NoSuchOsiInsolvPaymentPlanException if a osi insolv payment plan with the primary key could not be found
	 */
	@Override
	public OsiInsolvPaymentPlan remove(long osiInsolvPaymentPlanId)
		throws NoSuchOsiInsolvPaymentPlanException {

		return remove((Serializable)osiInsolvPaymentPlanId);
	}

	/**
	 * Removes the osi insolv payment plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi insolv payment plan
	 * @return the osi insolv payment plan that was removed
	 * @throws NoSuchOsiInsolvPaymentPlanException if a osi insolv payment plan with the primary key could not be found
	 */
	@Override
	public OsiInsolvPaymentPlan remove(Serializable primaryKey)
		throws NoSuchOsiInsolvPaymentPlanException {

		Session session = null;

		try {
			session = openSession();

			OsiInsolvPaymentPlan osiInsolvPaymentPlan =
				(OsiInsolvPaymentPlan)session.get(
					OsiInsolvPaymentPlanImpl.class, primaryKey);

			if (osiInsolvPaymentPlan == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiInsolvPaymentPlanException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiInsolvPaymentPlan);
		}
		catch (NoSuchOsiInsolvPaymentPlanException noSuchEntityException) {
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
	protected OsiInsolvPaymentPlan removeImpl(
		OsiInsolvPaymentPlan osiInsolvPaymentPlan) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiInsolvPaymentPlan)) {
				osiInsolvPaymentPlan = (OsiInsolvPaymentPlan)session.get(
					OsiInsolvPaymentPlanImpl.class,
					osiInsolvPaymentPlan.getPrimaryKeyObj());
			}

			if (osiInsolvPaymentPlan != null) {
				session.delete(osiInsolvPaymentPlan);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiInsolvPaymentPlan != null) {
			clearCache(osiInsolvPaymentPlan);
		}

		return osiInsolvPaymentPlan;
	}

	@Override
	public OsiInsolvPaymentPlan updateImpl(
		OsiInsolvPaymentPlan osiInsolvPaymentPlan) {

		boolean isNew = osiInsolvPaymentPlan.isNew();

		if (!(osiInsolvPaymentPlan instanceof OsiInsolvPaymentPlanModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiInsolvPaymentPlan.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiInsolvPaymentPlan);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiInsolvPaymentPlan proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiInsolvPaymentPlan implementation " +
					osiInsolvPaymentPlan.getClass());
		}

		OsiInsolvPaymentPlanModelImpl osiInsolvPaymentPlanModelImpl =
			(OsiInsolvPaymentPlanModelImpl)osiInsolvPaymentPlan;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiInsolvPaymentPlan.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiInsolvPaymentPlan.setCreateDate(date);
			}
			else {
				osiInsolvPaymentPlan.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiInsolvPaymentPlanModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiInsolvPaymentPlan.setModifiedDate(date);
			}
			else {
				osiInsolvPaymentPlan.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiInsolvPaymentPlan);
			}
			else {
				osiInsolvPaymentPlan = (OsiInsolvPaymentPlan)session.merge(
					osiInsolvPaymentPlan);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiInsolvPaymentPlanImpl.class, osiInsolvPaymentPlanModelImpl,
			false, true);

		cacheUniqueFindersCache(osiInsolvPaymentPlanModelImpl);

		if (isNew) {
			osiInsolvPaymentPlan.setNew(false);
		}

		osiInsolvPaymentPlan.resetOriginalValues();

		return osiInsolvPaymentPlan;
	}

	/**
	 * Returns the osi insolv payment plan with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi insolv payment plan
	 * @return the osi insolv payment plan
	 * @throws NoSuchOsiInsolvPaymentPlanException if a osi insolv payment plan with the primary key could not be found
	 */
	@Override
	public OsiInsolvPaymentPlan findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOsiInsolvPaymentPlanException {

		OsiInsolvPaymentPlan osiInsolvPaymentPlan = fetchByPrimaryKey(
			primaryKey);

		if (osiInsolvPaymentPlan == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiInsolvPaymentPlanException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiInsolvPaymentPlan;
	}

	/**
	 * Returns the osi insolv payment plan with the primary key or throws a <code>NoSuchOsiInsolvPaymentPlanException</code> if it could not be found.
	 *
	 * @param osiInsolvPaymentPlanId the primary key of the osi insolv payment plan
	 * @return the osi insolv payment plan
	 * @throws NoSuchOsiInsolvPaymentPlanException if a osi insolv payment plan with the primary key could not be found
	 */
	@Override
	public OsiInsolvPaymentPlan findByPrimaryKey(long osiInsolvPaymentPlanId)
		throws NoSuchOsiInsolvPaymentPlanException {

		return findByPrimaryKey((Serializable)osiInsolvPaymentPlanId);
	}

	/**
	 * Returns the osi insolv payment plan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInsolvPaymentPlanId the primary key of the osi insolv payment plan
	 * @return the osi insolv payment plan, or <code>null</code> if a osi insolv payment plan with the primary key could not be found
	 */
	@Override
	public OsiInsolvPaymentPlan fetchByPrimaryKey(long osiInsolvPaymentPlanId) {
		return fetchByPrimaryKey((Serializable)osiInsolvPaymentPlanId);
	}

	/**
	 * Returns all the osi insolv payment plans.
	 *
	 * @return the osi insolv payment plans
	 */
	@Override
	public List<OsiInsolvPaymentPlan> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi insolv payment plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvPaymentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolv payment plans
	 * @param end the upper bound of the range of osi insolv payment plans (not inclusive)
	 * @return the range of osi insolv payment plans
	 */
	@Override
	public List<OsiInsolvPaymentPlan> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi insolv payment plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvPaymentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolv payment plans
	 * @param end the upper bound of the range of osi insolv payment plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi insolv payment plans
	 */
	@Override
	public List<OsiInsolvPaymentPlan> findAll(
		int start, int end,
		OrderByComparator<OsiInsolvPaymentPlan> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi insolv payment plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvPaymentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolv payment plans
	 * @param end the upper bound of the range of osi insolv payment plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi insolv payment plans
	 */
	@Override
	public List<OsiInsolvPaymentPlan> findAll(
		int start, int end,
		OrderByComparator<OsiInsolvPaymentPlan> orderByComparator,
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

		List<OsiInsolvPaymentPlan> list = null;

		if (useFinderCache) {
			list = (List<OsiInsolvPaymentPlan>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSIINSOLVPAYMENTPLAN);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSIINSOLVPAYMENTPLAN;

				sql = sql.concat(OsiInsolvPaymentPlanModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiInsolvPaymentPlan>)QueryUtil.list(
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
	 * Removes all the osi insolv payment plans from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiInsolvPaymentPlan osiInsolvPaymentPlan : findAll()) {
			remove(osiInsolvPaymentPlan);
		}
	}

	/**
	 * Returns the number of osi insolv payment plans.
	 *
	 * @return the number of osi insolv payment plans
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
					_SQL_COUNT_OSIINSOLVPAYMENTPLAN);

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
		return "osiInsolvPaymentPlanId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSIINSOLVPAYMENTPLAN;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiInsolvPaymentPlanModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi insolv payment plan persistence.
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

		_finderPathFetchBygetOsiInsolvPaymentById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOsiInsolvPaymentById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathCountBygetOsiInsolvPaymentById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOsiInsolvPaymentById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, false);

		OsiInsolvPaymentPlanUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiInsolvPaymentPlanUtil.setPersistence(null);

		entityCache.removeCache(OsiInsolvPaymentPlanImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OSIINSOLVPAYMENTPLAN =
		"SELECT osiInsolvPaymentPlan FROM OsiInsolvPaymentPlan osiInsolvPaymentPlan";

	private static final String _SQL_SELECT_OSIINSOLVPAYMENTPLAN_WHERE =
		"SELECT osiInsolvPaymentPlan FROM OsiInsolvPaymentPlan osiInsolvPaymentPlan WHERE ";

	private static final String _SQL_COUNT_OSIINSOLVPAYMENTPLAN =
		"SELECT COUNT(osiInsolvPaymentPlan) FROM OsiInsolvPaymentPlan osiInsolvPaymentPlan";

	private static final String _SQL_COUNT_OSIINSOLVPAYMENTPLAN_WHERE =
		"SELECT COUNT(osiInsolvPaymentPlan) FROM OsiInsolvPaymentPlan osiInsolvPaymentPlan WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiInsolvPaymentPlan.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiInsolvPaymentPlan exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiInsolvPaymentPlan exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiInsolvPaymentPlanPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}