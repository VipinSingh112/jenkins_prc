/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence.impl;

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

import com.nbp.pharmaceutical.application.form.service.exception.NoSuchPharmaApplicationPaymentException;
import com.nbp.pharmaceutical.application.form.service.model.PharmaApplicationPayment;
import com.nbp.pharmaceutical.application.form.service.model.PharmaApplicationPaymentTable;
import com.nbp.pharmaceutical.application.form.service.model.impl.PharmaApplicationPaymentImpl;
import com.nbp.pharmaceutical.application.form.service.model.impl.PharmaApplicationPaymentModelImpl;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaApplicationPaymentPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaApplicationPaymentUtil;
import com.nbp.pharmaceutical.application.form.service.service.persistence.impl.constants.PHARMACEUTICALPersistenceConstants;

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
 * The persistence implementation for the pharma application payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PharmaApplicationPaymentPersistence.class)
public class PharmaApplicationPaymentPersistenceImpl
	extends BasePersistenceImpl<PharmaApplicationPayment>
	implements PharmaApplicationPaymentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PharmaApplicationPaymentUtil</code> to access the pharma application payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PharmaApplicationPaymentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetPAP_PAI;
	private FinderPath _finderPathCountBygetPAP_PAI;

	/**
	 * Returns the pharma application payment where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaApplicationPaymentException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application payment
	 * @throws NoSuchPharmaApplicationPaymentException if a matching pharma application payment could not be found
	 */
	@Override
	public PharmaApplicationPayment findBygetPAP_PAI(long pharmaApplicationId)
		throws NoSuchPharmaApplicationPaymentException {

		PharmaApplicationPayment pharmaApplicationPayment = fetchBygetPAP_PAI(
			pharmaApplicationId);

		if (pharmaApplicationPayment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("pharmaApplicationId=");
			sb.append(pharmaApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPharmaApplicationPaymentException(sb.toString());
		}

		return pharmaApplicationPayment;
	}

	/**
	 * Returns the pharma application payment where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application payment, or <code>null</code> if a matching pharma application payment could not be found
	 */
	@Override
	public PharmaApplicationPayment fetchBygetPAP_PAI(
		long pharmaApplicationId) {

		return fetchBygetPAP_PAI(pharmaApplicationId, true);
	}

	/**
	 * Returns the pharma application payment where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application payment, or <code>null</code> if a matching pharma application payment could not be found
	 */
	@Override
	public PharmaApplicationPayment fetchBygetPAP_PAI(
		long pharmaApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {pharmaApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetPAP_PAI, finderArgs, this);
		}

		if (result instanceof PharmaApplicationPayment) {
			PharmaApplicationPayment pharmaApplicationPayment =
				(PharmaApplicationPayment)result;

			if (pharmaApplicationId !=
					pharmaApplicationPayment.getPharmaApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PHARMAAPPLICATIONPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETPAP_PAI_PHARMAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

				List<PharmaApplicationPayment> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetPAP_PAI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {pharmaApplicationId};
							}

							_log.warn(
								"PharmaApplicationPaymentPersistenceImpl.fetchBygetPAP_PAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PharmaApplicationPayment pharmaApplicationPayment =
						list.get(0);

					result = pharmaApplicationPayment;

					cacheResult(pharmaApplicationPayment);
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
			return (PharmaApplicationPayment)result;
		}
	}

	/**
	 * Removes the pharma application payment where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma application payment that was removed
	 */
	@Override
	public PharmaApplicationPayment removeBygetPAP_PAI(long pharmaApplicationId)
		throws NoSuchPharmaApplicationPaymentException {

		PharmaApplicationPayment pharmaApplicationPayment = findBygetPAP_PAI(
			pharmaApplicationId);

		return remove(pharmaApplicationPayment);
	}

	/**
	 * Returns the number of pharma application payments where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma application payments
	 */
	@Override
	public int countBygetPAP_PAI(long pharmaApplicationId) {
		FinderPath finderPath = _finderPathCountBygetPAP_PAI;

		Object[] finderArgs = new Object[] {pharmaApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMAAPPLICATIONPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETPAP_PAI_PHARMAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

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
		_FINDER_COLUMN_GETPAP_PAI_PHARMAAPPLICATIONID_2 =
			"pharmaApplicationPayment.pharmaApplicationId = ?";

	public PharmaApplicationPaymentPersistenceImpl() {
		setModelClass(PharmaApplicationPayment.class);

		setModelImplClass(PharmaApplicationPaymentImpl.class);
		setModelPKClass(long.class);

		setTable(PharmaApplicationPaymentTable.INSTANCE);
	}

	/**
	 * Caches the pharma application payment in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationPayment the pharma application payment
	 */
	@Override
	public void cacheResult(PharmaApplicationPayment pharmaApplicationPayment) {
		entityCache.putResult(
			PharmaApplicationPaymentImpl.class,
			pharmaApplicationPayment.getPrimaryKey(), pharmaApplicationPayment);

		finderCache.putResult(
			_finderPathFetchBygetPAP_PAI,
			new Object[] {pharmaApplicationPayment.getPharmaApplicationId()},
			pharmaApplicationPayment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the pharma application payments in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationPayments the pharma application payments
	 */
	@Override
	public void cacheResult(
		List<PharmaApplicationPayment> pharmaApplicationPayments) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (pharmaApplicationPayments.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PharmaApplicationPayment pharmaApplicationPayment :
				pharmaApplicationPayments) {

			if (entityCache.getResult(
					PharmaApplicationPaymentImpl.class,
					pharmaApplicationPayment.getPrimaryKey()) == null) {

				cacheResult(pharmaApplicationPayment);
			}
		}
	}

	/**
	 * Clears the cache for all pharma application payments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PharmaApplicationPaymentImpl.class);

		finderCache.clearCache(PharmaApplicationPaymentImpl.class);
	}

	/**
	 * Clears the cache for the pharma application payment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PharmaApplicationPayment pharmaApplicationPayment) {
		entityCache.removeResult(
			PharmaApplicationPaymentImpl.class, pharmaApplicationPayment);
	}

	@Override
	public void clearCache(
		List<PharmaApplicationPayment> pharmaApplicationPayments) {

		for (PharmaApplicationPayment pharmaApplicationPayment :
				pharmaApplicationPayments) {

			entityCache.removeResult(
				PharmaApplicationPaymentImpl.class, pharmaApplicationPayment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PharmaApplicationPaymentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				PharmaApplicationPaymentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		PharmaApplicationPaymentModelImpl pharmaApplicationPaymentModelImpl) {

		Object[] args = new Object[] {
			pharmaApplicationPaymentModelImpl.getPharmaApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetPAP_PAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetPAP_PAI, args,
			pharmaApplicationPaymentModelImpl);
	}

	/**
	 * Creates a new pharma application payment with the primary key. Does not add the pharma application payment to the database.
	 *
	 * @param pharmaApplicationPaymentId the primary key for the new pharma application payment
	 * @return the new pharma application payment
	 */
	@Override
	public PharmaApplicationPayment create(long pharmaApplicationPaymentId) {
		PharmaApplicationPayment pharmaApplicationPayment =
			new PharmaApplicationPaymentImpl();

		pharmaApplicationPayment.setNew(true);
		pharmaApplicationPayment.setPrimaryKey(pharmaApplicationPaymentId);

		pharmaApplicationPayment.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return pharmaApplicationPayment;
	}

	/**
	 * Removes the pharma application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaApplicationPaymentId the primary key of the pharma application payment
	 * @return the pharma application payment that was removed
	 * @throws NoSuchPharmaApplicationPaymentException if a pharma application payment with the primary key could not be found
	 */
	@Override
	public PharmaApplicationPayment remove(long pharmaApplicationPaymentId)
		throws NoSuchPharmaApplicationPaymentException {

		return remove((Serializable)pharmaApplicationPaymentId);
	}

	/**
	 * Removes the pharma application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pharma application payment
	 * @return the pharma application payment that was removed
	 * @throws NoSuchPharmaApplicationPaymentException if a pharma application payment with the primary key could not be found
	 */
	@Override
	public PharmaApplicationPayment remove(Serializable primaryKey)
		throws NoSuchPharmaApplicationPaymentException {

		Session session = null;

		try {
			session = openSession();

			PharmaApplicationPayment pharmaApplicationPayment =
				(PharmaApplicationPayment)session.get(
					PharmaApplicationPaymentImpl.class, primaryKey);

			if (pharmaApplicationPayment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPharmaApplicationPaymentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(pharmaApplicationPayment);
		}
		catch (NoSuchPharmaApplicationPaymentException noSuchEntityException) {
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
	protected PharmaApplicationPayment removeImpl(
		PharmaApplicationPayment pharmaApplicationPayment) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pharmaApplicationPayment)) {
				pharmaApplicationPayment =
					(PharmaApplicationPayment)session.get(
						PharmaApplicationPaymentImpl.class,
						pharmaApplicationPayment.getPrimaryKeyObj());
			}

			if (pharmaApplicationPayment != null) {
				session.delete(pharmaApplicationPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (pharmaApplicationPayment != null) {
			clearCache(pharmaApplicationPayment);
		}

		return pharmaApplicationPayment;
	}

	@Override
	public PharmaApplicationPayment updateImpl(
		PharmaApplicationPayment pharmaApplicationPayment) {

		boolean isNew = pharmaApplicationPayment.isNew();

		if (!(pharmaApplicationPayment instanceof
				PharmaApplicationPaymentModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(pharmaApplicationPayment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					pharmaApplicationPayment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in pharmaApplicationPayment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PharmaApplicationPayment implementation " +
					pharmaApplicationPayment.getClass());
		}

		PharmaApplicationPaymentModelImpl pharmaApplicationPaymentModelImpl =
			(PharmaApplicationPaymentModelImpl)pharmaApplicationPayment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (pharmaApplicationPayment.getCreateDate() == null)) {
			if (serviceContext == null) {
				pharmaApplicationPayment.setCreateDate(date);
			}
			else {
				pharmaApplicationPayment.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!pharmaApplicationPaymentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				pharmaApplicationPayment.setModifiedDate(date);
			}
			else {
				pharmaApplicationPayment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(pharmaApplicationPayment);
			}
			else {
				pharmaApplicationPayment =
					(PharmaApplicationPayment)session.merge(
						pharmaApplicationPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PharmaApplicationPaymentImpl.class,
			pharmaApplicationPaymentModelImpl, false, true);

		cacheUniqueFindersCache(pharmaApplicationPaymentModelImpl);

		if (isNew) {
			pharmaApplicationPayment.setNew(false);
		}

		pharmaApplicationPayment.resetOriginalValues();

		return pharmaApplicationPayment;
	}

	/**
	 * Returns the pharma application payment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pharma application payment
	 * @return the pharma application payment
	 * @throws NoSuchPharmaApplicationPaymentException if a pharma application payment with the primary key could not be found
	 */
	@Override
	public PharmaApplicationPayment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPharmaApplicationPaymentException {

		PharmaApplicationPayment pharmaApplicationPayment = fetchByPrimaryKey(
			primaryKey);

		if (pharmaApplicationPayment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPharmaApplicationPaymentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return pharmaApplicationPayment;
	}

	/**
	 * Returns the pharma application payment with the primary key or throws a <code>NoSuchPharmaApplicationPaymentException</code> if it could not be found.
	 *
	 * @param pharmaApplicationPaymentId the primary key of the pharma application payment
	 * @return the pharma application payment
	 * @throws NoSuchPharmaApplicationPaymentException if a pharma application payment with the primary key could not be found
	 */
	@Override
	public PharmaApplicationPayment findByPrimaryKey(
			long pharmaApplicationPaymentId)
		throws NoSuchPharmaApplicationPaymentException {

		return findByPrimaryKey((Serializable)pharmaApplicationPaymentId);
	}

	/**
	 * Returns the pharma application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaApplicationPaymentId the primary key of the pharma application payment
	 * @return the pharma application payment, or <code>null</code> if a pharma application payment with the primary key could not be found
	 */
	@Override
	public PharmaApplicationPayment fetchByPrimaryKey(
		long pharmaApplicationPaymentId) {

		return fetchByPrimaryKey((Serializable)pharmaApplicationPaymentId);
	}

	/**
	 * Returns all the pharma application payments.
	 *
	 * @return the pharma application payments
	 */
	@Override
	public List<PharmaApplicationPayment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application payments
	 * @param end the upper bound of the range of pharma application payments (not inclusive)
	 * @return the range of pharma application payments
	 */
	@Override
	public List<PharmaApplicationPayment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application payments
	 * @param end the upper bound of the range of pharma application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma application payments
	 */
	@Override
	public List<PharmaApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<PharmaApplicationPayment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application payments
	 * @param end the upper bound of the range of pharma application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma application payments
	 */
	@Override
	public List<PharmaApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<PharmaApplicationPayment> orderByComparator,
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

		List<PharmaApplicationPayment> list = null;

		if (useFinderCache) {
			list = (List<PharmaApplicationPayment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PHARMAAPPLICATIONPAYMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PHARMAAPPLICATIONPAYMENT;

				sql = sql.concat(
					PharmaApplicationPaymentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PharmaApplicationPayment>)QueryUtil.list(
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
	 * Removes all the pharma application payments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PharmaApplicationPayment pharmaApplicationPayment : findAll()) {
			remove(pharmaApplicationPayment);
		}
	}

	/**
	 * Returns the number of pharma application payments.
	 *
	 * @return the number of pharma application payments
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
					_SQL_COUNT_PHARMAAPPLICATIONPAYMENT);

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
		return "pharmaApplicationPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PHARMAAPPLICATIONPAYMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PharmaApplicationPaymentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the pharma application payment persistence.
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

		_finderPathFetchBygetPAP_PAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetPAP_PAI",
			new String[] {Long.class.getName()},
			new String[] {"pharmaApplicationId"}, true);

		_finderPathCountBygetPAP_PAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetPAP_PAI",
			new String[] {Long.class.getName()},
			new String[] {"pharmaApplicationId"}, false);

		PharmaApplicationPaymentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		PharmaApplicationPaymentUtil.setPersistence(null);

		entityCache.removeCache(PharmaApplicationPaymentImpl.class.getName());
	}

	@Override
	@Reference(
		target = PHARMACEUTICALPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = PHARMACEUTICALPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = PHARMACEUTICALPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PHARMAAPPLICATIONPAYMENT =
		"SELECT pharmaApplicationPayment FROM PharmaApplicationPayment pharmaApplicationPayment";

	private static final String _SQL_SELECT_PHARMAAPPLICATIONPAYMENT_WHERE =
		"SELECT pharmaApplicationPayment FROM PharmaApplicationPayment pharmaApplicationPayment WHERE ";

	private static final String _SQL_COUNT_PHARMAAPPLICATIONPAYMENT =
		"SELECT COUNT(pharmaApplicationPayment) FROM PharmaApplicationPayment pharmaApplicationPayment";

	private static final String _SQL_COUNT_PHARMAAPPLICATIONPAYMENT_WHERE =
		"SELECT COUNT(pharmaApplicationPayment) FROM PharmaApplicationPayment pharmaApplicationPayment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"pharmaApplicationPayment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PharmaApplicationPayment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PharmaApplicationPayment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PharmaApplicationPaymentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}