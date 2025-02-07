/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence.impl;

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

import com.nbp.hsra.application.service.exception.NoSuchHsraApplicationPaymentException;
import com.nbp.hsra.application.service.model.HsraApplicationPayment;
import com.nbp.hsra.application.service.model.HsraApplicationPaymentTable;
import com.nbp.hsra.application.service.model.impl.HsraApplicationPaymentImpl;
import com.nbp.hsra.application.service.model.impl.HsraApplicationPaymentModelImpl;
import com.nbp.hsra.application.service.service.persistence.HsraApplicationPaymentPersistence;
import com.nbp.hsra.application.service.service.persistence.HsraApplicationPaymentUtil;
import com.nbp.hsra.application.service.service.persistence.impl.constants.HSRA_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the hsra application payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HsraApplicationPaymentPersistence.class)
public class HsraApplicationPaymentPersistenceImpl
	extends BasePersistenceImpl<HsraApplicationPayment>
	implements HsraApplicationPaymentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HsraApplicationPaymentUtil</code> to access the hsra application payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HsraApplicationPaymentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetHsraById;
	private FinderPath _finderPathCountBygetHsraById;

	/**
	 * Returns the hsra application payment where hsraApplicationId = &#63; or throws a <code>NoSuchHsraApplicationPaymentException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application payment
	 * @throws NoSuchHsraApplicationPaymentException if a matching hsra application payment could not be found
	 */
	@Override
	public HsraApplicationPayment findBygetHsraById(long hsraApplicationId)
		throws NoSuchHsraApplicationPaymentException {

		HsraApplicationPayment hsraApplicationPayment = fetchBygetHsraById(
			hsraApplicationId);

		if (hsraApplicationPayment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHsraApplicationPaymentException(sb.toString());
		}

		return hsraApplicationPayment;
	}

	/**
	 * Returns the hsra application payment where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application payment, or <code>null</code> if a matching hsra application payment could not be found
	 */
	@Override
	public HsraApplicationPayment fetchBygetHsraById(long hsraApplicationId) {
		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the hsra application payment where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application payment, or <code>null</code> if a matching hsra application payment could not be found
	 */
	@Override
	public HsraApplicationPayment fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {hsraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHsraById, finderArgs, this);
		}

		if (result instanceof HsraApplicationPayment) {
			HsraApplicationPayment hsraApplicationPayment =
				(HsraApplicationPayment)result;

			if (hsraApplicationId !=
					hsraApplicationPayment.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HSRAAPPLICATIONPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<HsraApplicationPayment> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHsraById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {hsraApplicationId};
							}

							_log.warn(
								"HsraApplicationPaymentPersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HsraApplicationPayment hsraApplicationPayment = list.get(0);

					result = hsraApplicationPayment;

					cacheResult(hsraApplicationPayment);
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
			return (HsraApplicationPayment)result;
		}
	}

	/**
	 * Removes the hsra application payment where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the hsra application payment that was removed
	 */
	@Override
	public HsraApplicationPayment removeBygetHsraById(long hsraApplicationId)
		throws NoSuchHsraApplicationPaymentException {

		HsraApplicationPayment hsraApplicationPayment = findBygetHsraById(
			hsraApplicationId);

		return remove(hsraApplicationPayment);
	}

	/**
	 * Returns the number of hsra application payments where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra application payments
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAAPPLICATIONPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

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

	private static final String _FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2 =
		"hsraApplicationPayment.hsraApplicationId = ?";

	public HsraApplicationPaymentPersistenceImpl() {
		setModelClass(HsraApplicationPayment.class);

		setModelImplClass(HsraApplicationPaymentImpl.class);
		setModelPKClass(long.class);

		setTable(HsraApplicationPaymentTable.INSTANCE);
	}

	/**
	 * Caches the hsra application payment in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationPayment the hsra application payment
	 */
	@Override
	public void cacheResult(HsraApplicationPayment hsraApplicationPayment) {
		entityCache.putResult(
			HsraApplicationPaymentImpl.class,
			hsraApplicationPayment.getPrimaryKey(), hsraApplicationPayment);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {hsraApplicationPayment.getHsraApplicationId()},
			hsraApplicationPayment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the hsra application payments in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationPayments the hsra application payments
	 */
	@Override
	public void cacheResult(
		List<HsraApplicationPayment> hsraApplicationPayments) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (hsraApplicationPayments.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HsraApplicationPayment hsraApplicationPayment :
				hsraApplicationPayments) {

			if (entityCache.getResult(
					HsraApplicationPaymentImpl.class,
					hsraApplicationPayment.getPrimaryKey()) == null) {

				cacheResult(hsraApplicationPayment);
			}
		}
	}

	/**
	 * Clears the cache for all hsra application payments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HsraApplicationPaymentImpl.class);

		finderCache.clearCache(HsraApplicationPaymentImpl.class);
	}

	/**
	 * Clears the cache for the hsra application payment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HsraApplicationPayment hsraApplicationPayment) {
		entityCache.removeResult(
			HsraApplicationPaymentImpl.class, hsraApplicationPayment);
	}

	@Override
	public void clearCache(
		List<HsraApplicationPayment> hsraApplicationPayments) {

		for (HsraApplicationPayment hsraApplicationPayment :
				hsraApplicationPayments) {

			entityCache.removeResult(
				HsraApplicationPaymentImpl.class, hsraApplicationPayment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HsraApplicationPaymentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				HsraApplicationPaymentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		HsraApplicationPaymentModelImpl hsraApplicationPaymentModelImpl) {

		Object[] args = new Object[] {
			hsraApplicationPaymentModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args,
			hsraApplicationPaymentModelImpl);
	}

	/**
	 * Creates a new hsra application payment with the primary key. Does not add the hsra application payment to the database.
	 *
	 * @param hsraApplicationPaymentId the primary key for the new hsra application payment
	 * @return the new hsra application payment
	 */
	@Override
	public HsraApplicationPayment create(long hsraApplicationPaymentId) {
		HsraApplicationPayment hsraApplicationPayment =
			new HsraApplicationPaymentImpl();

		hsraApplicationPayment.setNew(true);
		hsraApplicationPayment.setPrimaryKey(hsraApplicationPaymentId);

		hsraApplicationPayment.setCompanyId(CompanyThreadLocal.getCompanyId());

		return hsraApplicationPayment;
	}

	/**
	 * Removes the hsra application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraApplicationPaymentId the primary key of the hsra application payment
	 * @return the hsra application payment that was removed
	 * @throws NoSuchHsraApplicationPaymentException if a hsra application payment with the primary key could not be found
	 */
	@Override
	public HsraApplicationPayment remove(long hsraApplicationPaymentId)
		throws NoSuchHsraApplicationPaymentException {

		return remove((Serializable)hsraApplicationPaymentId);
	}

	/**
	 * Removes the hsra application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the hsra application payment
	 * @return the hsra application payment that was removed
	 * @throws NoSuchHsraApplicationPaymentException if a hsra application payment with the primary key could not be found
	 */
	@Override
	public HsraApplicationPayment remove(Serializable primaryKey)
		throws NoSuchHsraApplicationPaymentException {

		Session session = null;

		try {
			session = openSession();

			HsraApplicationPayment hsraApplicationPayment =
				(HsraApplicationPayment)session.get(
					HsraApplicationPaymentImpl.class, primaryKey);

			if (hsraApplicationPayment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHsraApplicationPaymentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(hsraApplicationPayment);
		}
		catch (NoSuchHsraApplicationPaymentException noSuchEntityException) {
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
	protected HsraApplicationPayment removeImpl(
		HsraApplicationPayment hsraApplicationPayment) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(hsraApplicationPayment)) {
				hsraApplicationPayment = (HsraApplicationPayment)session.get(
					HsraApplicationPaymentImpl.class,
					hsraApplicationPayment.getPrimaryKeyObj());
			}

			if (hsraApplicationPayment != null) {
				session.delete(hsraApplicationPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (hsraApplicationPayment != null) {
			clearCache(hsraApplicationPayment);
		}

		return hsraApplicationPayment;
	}

	@Override
	public HsraApplicationPayment updateImpl(
		HsraApplicationPayment hsraApplicationPayment) {

		boolean isNew = hsraApplicationPayment.isNew();

		if (!(hsraApplicationPayment instanceof
				HsraApplicationPaymentModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(hsraApplicationPayment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					hsraApplicationPayment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in hsraApplicationPayment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HsraApplicationPayment implementation " +
					hsraApplicationPayment.getClass());
		}

		HsraApplicationPaymentModelImpl hsraApplicationPaymentModelImpl =
			(HsraApplicationPaymentModelImpl)hsraApplicationPayment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (hsraApplicationPayment.getCreateDate() == null)) {
			if (serviceContext == null) {
				hsraApplicationPayment.setCreateDate(date);
			}
			else {
				hsraApplicationPayment.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!hsraApplicationPaymentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				hsraApplicationPayment.setModifiedDate(date);
			}
			else {
				hsraApplicationPayment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(hsraApplicationPayment);
			}
			else {
				hsraApplicationPayment = (HsraApplicationPayment)session.merge(
					hsraApplicationPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HsraApplicationPaymentImpl.class, hsraApplicationPaymentModelImpl,
			false, true);

		cacheUniqueFindersCache(hsraApplicationPaymentModelImpl);

		if (isNew) {
			hsraApplicationPayment.setNew(false);
		}

		hsraApplicationPayment.resetOriginalValues();

		return hsraApplicationPayment;
	}

	/**
	 * Returns the hsra application payment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the hsra application payment
	 * @return the hsra application payment
	 * @throws NoSuchHsraApplicationPaymentException if a hsra application payment with the primary key could not be found
	 */
	@Override
	public HsraApplicationPayment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHsraApplicationPaymentException {

		HsraApplicationPayment hsraApplicationPayment = fetchByPrimaryKey(
			primaryKey);

		if (hsraApplicationPayment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHsraApplicationPaymentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return hsraApplicationPayment;
	}

	/**
	 * Returns the hsra application payment with the primary key or throws a <code>NoSuchHsraApplicationPaymentException</code> if it could not be found.
	 *
	 * @param hsraApplicationPaymentId the primary key of the hsra application payment
	 * @return the hsra application payment
	 * @throws NoSuchHsraApplicationPaymentException if a hsra application payment with the primary key could not be found
	 */
	@Override
	public HsraApplicationPayment findByPrimaryKey(
			long hsraApplicationPaymentId)
		throws NoSuchHsraApplicationPaymentException {

		return findByPrimaryKey((Serializable)hsraApplicationPaymentId);
	}

	/**
	 * Returns the hsra application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraApplicationPaymentId the primary key of the hsra application payment
	 * @return the hsra application payment, or <code>null</code> if a hsra application payment with the primary key could not be found
	 */
	@Override
	public HsraApplicationPayment fetchByPrimaryKey(
		long hsraApplicationPaymentId) {

		return fetchByPrimaryKey((Serializable)hsraApplicationPaymentId);
	}

	/**
	 * Returns all the hsra application payments.
	 *
	 * @return the hsra application payments
	 */
	@Override
	public List<HsraApplicationPayment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application payments
	 * @param end the upper bound of the range of hsra application payments (not inclusive)
	 * @return the range of hsra application payments
	 */
	@Override
	public List<HsraApplicationPayment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application payments
	 * @param end the upper bound of the range of hsra application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra application payments
	 */
	@Override
	public List<HsraApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<HsraApplicationPayment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application payments
	 * @param end the upper bound of the range of hsra application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra application payments
	 */
	@Override
	public List<HsraApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<HsraApplicationPayment> orderByComparator,
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

		List<HsraApplicationPayment> list = null;

		if (useFinderCache) {
			list = (List<HsraApplicationPayment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HSRAAPPLICATIONPAYMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HSRAAPPLICATIONPAYMENT;

				sql = sql.concat(HsraApplicationPaymentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HsraApplicationPayment>)QueryUtil.list(
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
	 * Removes all the hsra application payments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HsraApplicationPayment hsraApplicationPayment : findAll()) {
			remove(hsraApplicationPayment);
		}
	}

	/**
	 * Returns the number of hsra application payments.
	 *
	 * @return the number of hsra application payments
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
					_SQL_COUNT_HSRAAPPLICATIONPAYMENT);

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
		return "hsraApplicationPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HSRAAPPLICATIONPAYMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HsraApplicationPaymentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the hsra application payment persistence.
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

		_finderPathFetchBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, true);

		_finderPathCountBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, false);

		HsraApplicationPaymentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HsraApplicationPaymentUtil.setPersistence(null);

		entityCache.removeCache(HsraApplicationPaymentImpl.class.getName());
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_HSRAAPPLICATIONPAYMENT =
		"SELECT hsraApplicationPayment FROM HsraApplicationPayment hsraApplicationPayment";

	private static final String _SQL_SELECT_HSRAAPPLICATIONPAYMENT_WHERE =
		"SELECT hsraApplicationPayment FROM HsraApplicationPayment hsraApplicationPayment WHERE ";

	private static final String _SQL_COUNT_HSRAAPPLICATIONPAYMENT =
		"SELECT COUNT(hsraApplicationPayment) FROM HsraApplicationPayment hsraApplicationPayment";

	private static final String _SQL_COUNT_HSRAAPPLICATIONPAYMENT_WHERE =
		"SELECT COUNT(hsraApplicationPayment) FROM HsraApplicationPayment hsraApplicationPayment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"hsraApplicationPayment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HsraApplicationPayment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HsraApplicationPayment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HsraApplicationPaymentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}