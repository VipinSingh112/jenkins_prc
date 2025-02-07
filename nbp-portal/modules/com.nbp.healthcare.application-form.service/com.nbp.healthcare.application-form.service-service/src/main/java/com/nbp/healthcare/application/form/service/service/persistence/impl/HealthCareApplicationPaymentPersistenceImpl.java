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

import com.nbp.healthcare.application.form.service.exception.NoSuchHealthCareApplicationPaymentException;
import com.nbp.healthcare.application.form.service.model.HealthCareApplicationPayment;
import com.nbp.healthcare.application.form.service.model.HealthCareApplicationPaymentTable;
import com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicationPaymentImpl;
import com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicationPaymentModelImpl;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareApplicationPaymentPersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareApplicationPaymentUtil;
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
 * The persistence implementation for the health care application payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HealthCareApplicationPaymentPersistence.class)
public class HealthCareApplicationPaymentPersistenceImpl
	extends BasePersistenceImpl<HealthCareApplicationPayment>
	implements HealthCareApplicationPaymentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HealthCareApplicationPaymentUtil</code> to access the health care application payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HealthCareApplicationPaymentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetHAP_HAI;
	private FinderPath _finderPathCountBygetHAP_HAI;

	/**
	 * Returns the health care application payment where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareApplicationPaymentException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care application payment
	 * @throws NoSuchHealthCareApplicationPaymentException if a matching health care application payment could not be found
	 */
	@Override
	public HealthCareApplicationPayment findBygetHAP_HAI(
			long healthCareApplicationId)
		throws NoSuchHealthCareApplicationPaymentException {

		HealthCareApplicationPayment healthCareApplicationPayment =
			fetchBygetHAP_HAI(healthCareApplicationId);

		if (healthCareApplicationPayment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("healthCareApplicationId=");
			sb.append(healthCareApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHealthCareApplicationPaymentException(
				sb.toString());
		}

		return healthCareApplicationPayment;
	}

	/**
	 * Returns the health care application payment where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care application payment, or <code>null</code> if a matching health care application payment could not be found
	 */
	@Override
	public HealthCareApplicationPayment fetchBygetHAP_HAI(
		long healthCareApplicationId) {

		return fetchBygetHAP_HAI(healthCareApplicationId, true);
	}

	/**
	 * Returns the health care application payment where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care application payment, or <code>null</code> if a matching health care application payment could not be found
	 */
	@Override
	public HealthCareApplicationPayment fetchBygetHAP_HAI(
		long healthCareApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {healthCareApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHAP_HAI, finderArgs, this);
		}

		if (result instanceof HealthCareApplicationPayment) {
			HealthCareApplicationPayment healthCareApplicationPayment =
				(HealthCareApplicationPayment)result;

			if (healthCareApplicationId !=
					healthCareApplicationPayment.getHealthCareApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HEALTHCAREAPPLICATIONPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETHAP_HAI_HEALTHCAREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(healthCareApplicationId);

				List<HealthCareApplicationPayment> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHAP_HAI, finderArgs, list);
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
								"HealthCareApplicationPaymentPersistenceImpl.fetchBygetHAP_HAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HealthCareApplicationPayment healthCareApplicationPayment =
						list.get(0);

					result = healthCareApplicationPayment;

					cacheResult(healthCareApplicationPayment);
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
			return (HealthCareApplicationPayment)result;
		}
	}

	/**
	 * Removes the health care application payment where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care application payment that was removed
	 */
	@Override
	public HealthCareApplicationPayment removeBygetHAP_HAI(
			long healthCareApplicationId)
		throws NoSuchHealthCareApplicationPaymentException {

		HealthCareApplicationPayment healthCareApplicationPayment =
			findBygetHAP_HAI(healthCareApplicationId);

		return remove(healthCareApplicationPayment);
	}

	/**
	 * Returns the number of health care application payments where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care application payments
	 */
	@Override
	public int countBygetHAP_HAI(long healthCareApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHAP_HAI;

		Object[] finderArgs = new Object[] {healthCareApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HEALTHCAREAPPLICATIONPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETHAP_HAI_HEALTHCAREAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETHAP_HAI_HEALTHCAREAPPLICATIONID_2 =
			"healthCareApplicationPayment.healthCareApplicationId = ?";

	public HealthCareApplicationPaymentPersistenceImpl() {
		setModelClass(HealthCareApplicationPayment.class);

		setModelImplClass(HealthCareApplicationPaymentImpl.class);
		setModelPKClass(long.class);

		setTable(HealthCareApplicationPaymentTable.INSTANCE);
	}

	/**
	 * Caches the health care application payment in the entity cache if it is enabled.
	 *
	 * @param healthCareApplicationPayment the health care application payment
	 */
	@Override
	public void cacheResult(
		HealthCareApplicationPayment healthCareApplicationPayment) {

		entityCache.putResult(
			HealthCareApplicationPaymentImpl.class,
			healthCareApplicationPayment.getPrimaryKey(),
			healthCareApplicationPayment);

		finderCache.putResult(
			_finderPathFetchBygetHAP_HAI,
			new Object[] {
				healthCareApplicationPayment.getHealthCareApplicationId()
			},
			healthCareApplicationPayment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the health care application payments in the entity cache if it is enabled.
	 *
	 * @param healthCareApplicationPayments the health care application payments
	 */
	@Override
	public void cacheResult(
		List<HealthCareApplicationPayment> healthCareApplicationPayments) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (healthCareApplicationPayments.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HealthCareApplicationPayment healthCareApplicationPayment :
				healthCareApplicationPayments) {

			if (entityCache.getResult(
					HealthCareApplicationPaymentImpl.class,
					healthCareApplicationPayment.getPrimaryKey()) == null) {

				cacheResult(healthCareApplicationPayment);
			}
		}
	}

	/**
	 * Clears the cache for all health care application payments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HealthCareApplicationPaymentImpl.class);

		finderCache.clearCache(HealthCareApplicationPaymentImpl.class);
	}

	/**
	 * Clears the cache for the health care application payment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		HealthCareApplicationPayment healthCareApplicationPayment) {

		entityCache.removeResult(
			HealthCareApplicationPaymentImpl.class,
			healthCareApplicationPayment);
	}

	@Override
	public void clearCache(
		List<HealthCareApplicationPayment> healthCareApplicationPayments) {

		for (HealthCareApplicationPayment healthCareApplicationPayment :
				healthCareApplicationPayments) {

			entityCache.removeResult(
				HealthCareApplicationPaymentImpl.class,
				healthCareApplicationPayment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HealthCareApplicationPaymentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				HealthCareApplicationPaymentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		HealthCareApplicationPaymentModelImpl
			healthCareApplicationPaymentModelImpl) {

		Object[] args = new Object[] {
			healthCareApplicationPaymentModelImpl.getHealthCareApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHAP_HAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHAP_HAI, args,
			healthCareApplicationPaymentModelImpl);
	}

	/**
	 * Creates a new health care application payment with the primary key. Does not add the health care application payment to the database.
	 *
	 * @param healthCareApplicationPaymentId the primary key for the new health care application payment
	 * @return the new health care application payment
	 */
	@Override
	public HealthCareApplicationPayment create(
		long healthCareApplicationPaymentId) {

		HealthCareApplicationPayment healthCareApplicationPayment =
			new HealthCareApplicationPaymentImpl();

		healthCareApplicationPayment.setNew(true);
		healthCareApplicationPayment.setPrimaryKey(
			healthCareApplicationPaymentId);

		healthCareApplicationPayment.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return healthCareApplicationPayment;
	}

	/**
	 * Removes the health care application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareApplicationPaymentId the primary key of the health care application payment
	 * @return the health care application payment that was removed
	 * @throws NoSuchHealthCareApplicationPaymentException if a health care application payment with the primary key could not be found
	 */
	@Override
	public HealthCareApplicationPayment remove(
			long healthCareApplicationPaymentId)
		throws NoSuchHealthCareApplicationPaymentException {

		return remove((Serializable)healthCareApplicationPaymentId);
	}

	/**
	 * Removes the health care application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the health care application payment
	 * @return the health care application payment that was removed
	 * @throws NoSuchHealthCareApplicationPaymentException if a health care application payment with the primary key could not be found
	 */
	@Override
	public HealthCareApplicationPayment remove(Serializable primaryKey)
		throws NoSuchHealthCareApplicationPaymentException {

		Session session = null;

		try {
			session = openSession();

			HealthCareApplicationPayment healthCareApplicationPayment =
				(HealthCareApplicationPayment)session.get(
					HealthCareApplicationPaymentImpl.class, primaryKey);

			if (healthCareApplicationPayment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHealthCareApplicationPaymentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(healthCareApplicationPayment);
		}
		catch (NoSuchHealthCareApplicationPaymentException
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
	protected HealthCareApplicationPayment removeImpl(
		HealthCareApplicationPayment healthCareApplicationPayment) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(healthCareApplicationPayment)) {
				healthCareApplicationPayment =
					(HealthCareApplicationPayment)session.get(
						HealthCareApplicationPaymentImpl.class,
						healthCareApplicationPayment.getPrimaryKeyObj());
			}

			if (healthCareApplicationPayment != null) {
				session.delete(healthCareApplicationPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (healthCareApplicationPayment != null) {
			clearCache(healthCareApplicationPayment);
		}

		return healthCareApplicationPayment;
	}

	@Override
	public HealthCareApplicationPayment updateImpl(
		HealthCareApplicationPayment healthCareApplicationPayment) {

		boolean isNew = healthCareApplicationPayment.isNew();

		if (!(healthCareApplicationPayment instanceof
				HealthCareApplicationPaymentModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					healthCareApplicationPayment.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					healthCareApplicationPayment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in healthCareApplicationPayment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HealthCareApplicationPayment implementation " +
					healthCareApplicationPayment.getClass());
		}

		HealthCareApplicationPaymentModelImpl
			healthCareApplicationPaymentModelImpl =
				(HealthCareApplicationPaymentModelImpl)
					healthCareApplicationPayment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (healthCareApplicationPayment.getCreateDate() == null)) {
			if (serviceContext == null) {
				healthCareApplicationPayment.setCreateDate(date);
			}
			else {
				healthCareApplicationPayment.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!healthCareApplicationPaymentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				healthCareApplicationPayment.setModifiedDate(date);
			}
			else {
				healthCareApplicationPayment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(healthCareApplicationPayment);
			}
			else {
				healthCareApplicationPayment =
					(HealthCareApplicationPayment)session.merge(
						healthCareApplicationPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HealthCareApplicationPaymentImpl.class,
			healthCareApplicationPaymentModelImpl, false, true);

		cacheUniqueFindersCache(healthCareApplicationPaymentModelImpl);

		if (isNew) {
			healthCareApplicationPayment.setNew(false);
		}

		healthCareApplicationPayment.resetOriginalValues();

		return healthCareApplicationPayment;
	}

	/**
	 * Returns the health care application payment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the health care application payment
	 * @return the health care application payment
	 * @throws NoSuchHealthCareApplicationPaymentException if a health care application payment with the primary key could not be found
	 */
	@Override
	public HealthCareApplicationPayment findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchHealthCareApplicationPaymentException {

		HealthCareApplicationPayment healthCareApplicationPayment =
			fetchByPrimaryKey(primaryKey);

		if (healthCareApplicationPayment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHealthCareApplicationPaymentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return healthCareApplicationPayment;
	}

	/**
	 * Returns the health care application payment with the primary key or throws a <code>NoSuchHealthCareApplicationPaymentException</code> if it could not be found.
	 *
	 * @param healthCareApplicationPaymentId the primary key of the health care application payment
	 * @return the health care application payment
	 * @throws NoSuchHealthCareApplicationPaymentException if a health care application payment with the primary key could not be found
	 */
	@Override
	public HealthCareApplicationPayment findByPrimaryKey(
			long healthCareApplicationPaymentId)
		throws NoSuchHealthCareApplicationPaymentException {

		return findByPrimaryKey((Serializable)healthCareApplicationPaymentId);
	}

	/**
	 * Returns the health care application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareApplicationPaymentId the primary key of the health care application payment
	 * @return the health care application payment, or <code>null</code> if a health care application payment with the primary key could not be found
	 */
	@Override
	public HealthCareApplicationPayment fetchByPrimaryKey(
		long healthCareApplicationPaymentId) {

		return fetchByPrimaryKey((Serializable)healthCareApplicationPaymentId);
	}

	/**
	 * Returns all the health care application payments.
	 *
	 * @return the health care application payments
	 */
	@Override
	public List<HealthCareApplicationPayment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the health care application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care application payments
	 * @param end the upper bound of the range of health care application payments (not inclusive)
	 * @return the range of health care application payments
	 */
	@Override
	public List<HealthCareApplicationPayment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the health care application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care application payments
	 * @param end the upper bound of the range of health care application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care application payments
	 */
	@Override
	public List<HealthCareApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<HealthCareApplicationPayment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the health care application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care application payments
	 * @param end the upper bound of the range of health care application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care application payments
	 */
	@Override
	public List<HealthCareApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<HealthCareApplicationPayment> orderByComparator,
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

		List<HealthCareApplicationPayment> list = null;

		if (useFinderCache) {
			list = (List<HealthCareApplicationPayment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HEALTHCAREAPPLICATIONPAYMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HEALTHCAREAPPLICATIONPAYMENT;

				sql = sql.concat(
					HealthCareApplicationPaymentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HealthCareApplicationPayment>)QueryUtil.list(
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
	 * Removes all the health care application payments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HealthCareApplicationPayment healthCareApplicationPayment :
				findAll()) {

			remove(healthCareApplicationPayment);
		}
	}

	/**
	 * Returns the number of health care application payments.
	 *
	 * @return the number of health care application payments
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
					_SQL_COUNT_HEALTHCAREAPPLICATIONPAYMENT);

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
		return "healthCareApplicationPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HEALTHCAREAPPLICATIONPAYMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HealthCareApplicationPaymentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the health care application payment persistence.
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

		_finderPathFetchBygetHAP_HAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHAP_HAI",
			new String[] {Long.class.getName()},
			new String[] {"healthCareApplicationId"}, true);

		_finderPathCountBygetHAP_HAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHAP_HAI",
			new String[] {Long.class.getName()},
			new String[] {"healthCareApplicationId"}, false);

		HealthCareApplicationPaymentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HealthCareApplicationPaymentUtil.setPersistence(null);

		entityCache.removeCache(
			HealthCareApplicationPaymentImpl.class.getName());
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

	private static final String _SQL_SELECT_HEALTHCAREAPPLICATIONPAYMENT =
		"SELECT healthCareApplicationPayment FROM HealthCareApplicationPayment healthCareApplicationPayment";

	private static final String _SQL_SELECT_HEALTHCAREAPPLICATIONPAYMENT_WHERE =
		"SELECT healthCareApplicationPayment FROM HealthCareApplicationPayment healthCareApplicationPayment WHERE ";

	private static final String _SQL_COUNT_HEALTHCAREAPPLICATIONPAYMENT =
		"SELECT COUNT(healthCareApplicationPayment) FROM HealthCareApplicationPayment healthCareApplicationPayment";

	private static final String _SQL_COUNT_HEALTHCAREAPPLICATIONPAYMENT_WHERE =
		"SELECT COUNT(healthCareApplicationPayment) FROM HealthCareApplicationPayment healthCareApplicationPayment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"healthCareApplicationPayment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HealthCareApplicationPayment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HealthCareApplicationPayment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HealthCareApplicationPaymentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}