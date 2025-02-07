/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence.impl;

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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismApplicationPaymentException;
import com.nbp.tourism.application.form.services.model.TourismApplicationPayment;
import com.nbp.tourism.application.form.services.model.TourismApplicationPaymentTable;
import com.nbp.tourism.application.form.services.model.impl.TourismApplicationPaymentImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismApplicationPaymentModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismApplicationPaymentPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismApplicationPaymentUtil;
import com.nbp.tourism.application.form.services.service.persistence.impl.constants.TOURISMPersistenceConstants;

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
 * The persistence implementation for the tourism application payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismApplicationPaymentPersistence.class)
public class TourismApplicationPaymentPersistenceImpl
	extends BasePersistenceImpl<TourismApplicationPayment>
	implements TourismApplicationPaymentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismApplicationPaymentUtil</code> to access the tourism application payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismApplicationPaymentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetTAP_TAI;
	private FinderPath _finderPathCountBygetTAP_TAI;

	/**
	 * Returns the tourism application payment where tourismApplicationId = &#63; or throws a <code>NoSuchTourismApplicationPaymentException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism application payment
	 * @throws NoSuchTourismApplicationPaymentException if a matching tourism application payment could not be found
	 */
	@Override
	public TourismApplicationPayment findBygetTAP_TAI(long tourismApplicationId)
		throws NoSuchTourismApplicationPaymentException {

		TourismApplicationPayment tourismApplicationPayment = fetchBygetTAP_TAI(
			tourismApplicationId);

		if (tourismApplicationPayment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismApplicationPaymentException(sb.toString());
		}

		return tourismApplicationPayment;
	}

	/**
	 * Returns the tourism application payment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism application payment, or <code>null</code> if a matching tourism application payment could not be found
	 */
	@Override
	public TourismApplicationPayment fetchBygetTAP_TAI(
		long tourismApplicationId) {

		return fetchBygetTAP_TAI(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism application payment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application payment, or <code>null</code> if a matching tourism application payment could not be found
	 */
	@Override
	public TourismApplicationPayment fetchBygetTAP_TAI(
		long tourismApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {tourismApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetTAP_TAI, finderArgs, this);
		}

		if (result instanceof TourismApplicationPayment) {
			TourismApplicationPayment tourismApplicationPayment =
				(TourismApplicationPayment)result;

			if (tourismApplicationId !=
					tourismApplicationPayment.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMAPPLICATIONPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETTAP_TAI_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismApplicationPayment> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetTAP_TAI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									tourismApplicationId
								};
							}

							_log.warn(
								"TourismApplicationPaymentPersistenceImpl.fetchBygetTAP_TAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismApplicationPayment tourismApplicationPayment =
						list.get(0);

					result = tourismApplicationPayment;

					cacheResult(tourismApplicationPayment);
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
			return (TourismApplicationPayment)result;
		}
	}

	/**
	 * Removes the tourism application payment where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism application payment that was removed
	 */
	@Override
	public TourismApplicationPayment removeBygetTAP_TAI(
			long tourismApplicationId)
		throws NoSuchTourismApplicationPaymentException {

		TourismApplicationPayment tourismApplicationPayment = findBygetTAP_TAI(
			tourismApplicationId);

		return remove(tourismApplicationPayment);
	}

	/**
	 * Returns the number of tourism application payments where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism application payments
	 */
	@Override
	public int countBygetTAP_TAI(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTAP_TAI;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMAPPLICATIONPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETTAP_TAI_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

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
		_FINDER_COLUMN_GETTAP_TAI_TOURISMAPPLICATIONID_2 =
			"tourismApplicationPayment.tourismApplicationId = ?";

	public TourismApplicationPaymentPersistenceImpl() {
		setModelClass(TourismApplicationPayment.class);

		setModelImplClass(TourismApplicationPaymentImpl.class);
		setModelPKClass(long.class);

		setTable(TourismApplicationPaymentTable.INSTANCE);
	}

	/**
	 * Caches the tourism application payment in the entity cache if it is enabled.
	 *
	 * @param tourismApplicationPayment the tourism application payment
	 */
	@Override
	public void cacheResult(
		TourismApplicationPayment tourismApplicationPayment) {

		entityCache.putResult(
			TourismApplicationPaymentImpl.class,
			tourismApplicationPayment.getPrimaryKey(),
			tourismApplicationPayment);

		finderCache.putResult(
			_finderPathFetchBygetTAP_TAI,
			new Object[] {tourismApplicationPayment.getTourismApplicationId()},
			tourismApplicationPayment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism application payments in the entity cache if it is enabled.
	 *
	 * @param tourismApplicationPayments the tourism application payments
	 */
	@Override
	public void cacheResult(
		List<TourismApplicationPayment> tourismApplicationPayments) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismApplicationPayments.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismApplicationPayment tourismApplicationPayment :
				tourismApplicationPayments) {

			if (entityCache.getResult(
					TourismApplicationPaymentImpl.class,
					tourismApplicationPayment.getPrimaryKey()) == null) {

				cacheResult(tourismApplicationPayment);
			}
		}
	}

	/**
	 * Clears the cache for all tourism application payments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismApplicationPaymentImpl.class);

		finderCache.clearCache(TourismApplicationPaymentImpl.class);
	}

	/**
	 * Clears the cache for the tourism application payment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismApplicationPayment tourismApplicationPayment) {

		entityCache.removeResult(
			TourismApplicationPaymentImpl.class, tourismApplicationPayment);
	}

	@Override
	public void clearCache(
		List<TourismApplicationPayment> tourismApplicationPayments) {

		for (TourismApplicationPayment tourismApplicationPayment :
				tourismApplicationPayments) {

			entityCache.removeResult(
				TourismApplicationPaymentImpl.class, tourismApplicationPayment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismApplicationPaymentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismApplicationPaymentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismApplicationPaymentModelImpl tourismApplicationPaymentModelImpl) {

		Object[] args = new Object[] {
			tourismApplicationPaymentModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTAP_TAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTAP_TAI, args,
			tourismApplicationPaymentModelImpl);
	}

	/**
	 * Creates a new tourism application payment with the primary key. Does not add the tourism application payment to the database.
	 *
	 * @param TourismApplicationPaymentId the primary key for the new tourism application payment
	 * @return the new tourism application payment
	 */
	@Override
	public TourismApplicationPayment create(long TourismApplicationPaymentId) {
		TourismApplicationPayment tourismApplicationPayment =
			new TourismApplicationPaymentImpl();

		tourismApplicationPayment.setNew(true);
		tourismApplicationPayment.setPrimaryKey(TourismApplicationPaymentId);

		tourismApplicationPayment.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismApplicationPayment;
	}

	/**
	 * Removes the tourism application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param TourismApplicationPaymentId the primary key of the tourism application payment
	 * @return the tourism application payment that was removed
	 * @throws NoSuchTourismApplicationPaymentException if a tourism application payment with the primary key could not be found
	 */
	@Override
	public TourismApplicationPayment remove(long TourismApplicationPaymentId)
		throws NoSuchTourismApplicationPaymentException {

		return remove((Serializable)TourismApplicationPaymentId);
	}

	/**
	 * Removes the tourism application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism application payment
	 * @return the tourism application payment that was removed
	 * @throws NoSuchTourismApplicationPaymentException if a tourism application payment with the primary key could not be found
	 */
	@Override
	public TourismApplicationPayment remove(Serializable primaryKey)
		throws NoSuchTourismApplicationPaymentException {

		Session session = null;

		try {
			session = openSession();

			TourismApplicationPayment tourismApplicationPayment =
				(TourismApplicationPayment)session.get(
					TourismApplicationPaymentImpl.class, primaryKey);

			if (tourismApplicationPayment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismApplicationPaymentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismApplicationPayment);
		}
		catch (NoSuchTourismApplicationPaymentException noSuchEntityException) {
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
	protected TourismApplicationPayment removeImpl(
		TourismApplicationPayment tourismApplicationPayment) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismApplicationPayment)) {
				tourismApplicationPayment =
					(TourismApplicationPayment)session.get(
						TourismApplicationPaymentImpl.class,
						tourismApplicationPayment.getPrimaryKeyObj());
			}

			if (tourismApplicationPayment != null) {
				session.delete(tourismApplicationPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismApplicationPayment != null) {
			clearCache(tourismApplicationPayment);
		}

		return tourismApplicationPayment;
	}

	@Override
	public TourismApplicationPayment updateImpl(
		TourismApplicationPayment tourismApplicationPayment) {

		boolean isNew = tourismApplicationPayment.isNew();

		if (!(tourismApplicationPayment instanceof
				TourismApplicationPaymentModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tourismApplicationPayment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismApplicationPayment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismApplicationPayment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismApplicationPayment implementation " +
					tourismApplicationPayment.getClass());
		}

		TourismApplicationPaymentModelImpl tourismApplicationPaymentModelImpl =
			(TourismApplicationPaymentModelImpl)tourismApplicationPayment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismApplicationPayment.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismApplicationPayment.setCreateDate(date);
			}
			else {
				tourismApplicationPayment.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismApplicationPaymentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismApplicationPayment.setModifiedDate(date);
			}
			else {
				tourismApplicationPayment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismApplicationPayment);
			}
			else {
				tourismApplicationPayment =
					(TourismApplicationPayment)session.merge(
						tourismApplicationPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismApplicationPaymentImpl.class,
			tourismApplicationPaymentModelImpl, false, true);

		cacheUniqueFindersCache(tourismApplicationPaymentModelImpl);

		if (isNew) {
			tourismApplicationPayment.setNew(false);
		}

		tourismApplicationPayment.resetOriginalValues();

		return tourismApplicationPayment;
	}

	/**
	 * Returns the tourism application payment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism application payment
	 * @return the tourism application payment
	 * @throws NoSuchTourismApplicationPaymentException if a tourism application payment with the primary key could not be found
	 */
	@Override
	public TourismApplicationPayment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTourismApplicationPaymentException {

		TourismApplicationPayment tourismApplicationPayment = fetchByPrimaryKey(
			primaryKey);

		if (tourismApplicationPayment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismApplicationPaymentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismApplicationPayment;
	}

	/**
	 * Returns the tourism application payment with the primary key or throws a <code>NoSuchTourismApplicationPaymentException</code> if it could not be found.
	 *
	 * @param TourismApplicationPaymentId the primary key of the tourism application payment
	 * @return the tourism application payment
	 * @throws NoSuchTourismApplicationPaymentException if a tourism application payment with the primary key could not be found
	 */
	@Override
	public TourismApplicationPayment findByPrimaryKey(
			long TourismApplicationPaymentId)
		throws NoSuchTourismApplicationPaymentException {

		return findByPrimaryKey((Serializable)TourismApplicationPaymentId);
	}

	/**
	 * Returns the tourism application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param TourismApplicationPaymentId the primary key of the tourism application payment
	 * @return the tourism application payment, or <code>null</code> if a tourism application payment with the primary key could not be found
	 */
	@Override
	public TourismApplicationPayment fetchByPrimaryKey(
		long TourismApplicationPaymentId) {

		return fetchByPrimaryKey((Serializable)TourismApplicationPaymentId);
	}

	/**
	 * Returns all the tourism application payments.
	 *
	 * @return the tourism application payments
	 */
	@Override
	public List<TourismApplicationPayment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application payments
	 * @param end the upper bound of the range of tourism application payments (not inclusive)
	 * @return the range of tourism application payments
	 */
	@Override
	public List<TourismApplicationPayment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application payments
	 * @param end the upper bound of the range of tourism application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism application payments
	 */
	@Override
	public List<TourismApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<TourismApplicationPayment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application payments
	 * @param end the upper bound of the range of tourism application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism application payments
	 */
	@Override
	public List<TourismApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<TourismApplicationPayment> orderByComparator,
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

		List<TourismApplicationPayment> list = null;

		if (useFinderCache) {
			list = (List<TourismApplicationPayment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMAPPLICATIONPAYMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMAPPLICATIONPAYMENT;

				sql = sql.concat(
					TourismApplicationPaymentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismApplicationPayment>)QueryUtil.list(
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
	 * Removes all the tourism application payments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismApplicationPayment tourismApplicationPayment : findAll()) {
			remove(tourismApplicationPayment);
		}
	}

	/**
	 * Returns the number of tourism application payments.
	 *
	 * @return the number of tourism application payments
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
					_SQL_COUNT_TOURISMAPPLICATIONPAYMENT);

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
		return "TourismApplicationPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMAPPLICATIONPAYMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismApplicationPaymentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism application payment persistence.
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

		_finderPathFetchBygetTAP_TAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetTAP_TAI",
			new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, true);

		_finderPathCountBygetTAP_TAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetTAP_TAI",
			new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, false);

		TourismApplicationPaymentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismApplicationPaymentUtil.setPersistence(null);

		entityCache.removeCache(TourismApplicationPaymentImpl.class.getName());
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_TOURISMAPPLICATIONPAYMENT =
		"SELECT tourismApplicationPayment FROM TourismApplicationPayment tourismApplicationPayment";

	private static final String _SQL_SELECT_TOURISMAPPLICATIONPAYMENT_WHERE =
		"SELECT tourismApplicationPayment FROM TourismApplicationPayment tourismApplicationPayment WHERE ";

	private static final String _SQL_COUNT_TOURISMAPPLICATIONPAYMENT =
		"SELECT COUNT(tourismApplicationPayment) FROM TourismApplicationPayment tourismApplicationPayment";

	private static final String _SQL_COUNT_TOURISMAPPLICATIONPAYMENT_WHERE =
		"SELECT COUNT(tourismApplicationPayment) FROM TourismApplicationPayment tourismApplicationPayment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismApplicationPayment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismApplicationPayment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismApplicationPayment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismApplicationPaymentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}