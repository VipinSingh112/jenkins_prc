/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence.impl;

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

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisApplicationPaymentException;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationPayment;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationPaymentTable;
import com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationPaymentImpl;
import com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationPaymentModelImpl;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationPaymentPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationPaymentUtil;
import com.nbp.cannabis.application.form.services.service.persistence.impl.constants.CANNABISPersistenceConstants;

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
 * The persistence implementation for the cannabis application payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisApplicationPaymentPersistence.class)
public class CannabisApplicationPaymentPersistenceImpl
	extends BasePersistenceImpl<CannabisApplicationPayment>
	implements CannabisApplicationPaymentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisApplicationPaymentUtil</code> to access the cannabis application payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisApplicationPaymentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetCAP_CAI;
	private FinderPath _finderPathCountBygetCAP_CAI;

	/**
	 * Returns the cannabis application payment where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisApplicationPaymentException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application payment
	 * @throws NoSuchCannabisApplicationPaymentException if a matching cannabis application payment could not be found
	 */
	@Override
	public CannabisApplicationPayment findBygetCAP_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationPaymentException {

		CannabisApplicationPayment cannabisApplicationPayment =
			fetchBygetCAP_CAI(cannabisApplicationId);

		if (cannabisApplicationPayment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("cannabisApplicationId=");
			sb.append(cannabisApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisApplicationPaymentException(sb.toString());
		}

		return cannabisApplicationPayment;
	}

	/**
	 * Returns the cannabis application payment where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application payment, or <code>null</code> if a matching cannabis application payment could not be found
	 */
	@Override
	public CannabisApplicationPayment fetchBygetCAP_CAI(
		long cannabisApplicationId) {

		return fetchBygetCAP_CAI(cannabisApplicationId, true);
	}

	/**
	 * Returns the cannabis application payment where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application payment, or <code>null</code> if a matching cannabis application payment could not be found
	 */
	@Override
	public CannabisApplicationPayment fetchBygetCAP_CAI(
		long cannabisApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {cannabisApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCAP_CAI, finderArgs, this);
		}

		if (result instanceof CannabisApplicationPayment) {
			CannabisApplicationPayment cannabisApplicationPayment =
				(CannabisApplicationPayment)result;

			if (cannabisApplicationId !=
					cannabisApplicationPayment.getCannabisApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETCAP_CAI_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				List<CannabisApplicationPayment> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCAP_CAI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									cannabisApplicationId
								};
							}

							_log.warn(
								"CannabisApplicationPaymentPersistenceImpl.fetchBygetCAP_CAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisApplicationPayment cannabisApplicationPayment =
						list.get(0);

					result = cannabisApplicationPayment;

					cacheResult(cannabisApplicationPayment);
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
			return (CannabisApplicationPayment)result;
		}
	}

	/**
	 * Removes the cannabis application payment where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis application payment that was removed
	 */
	@Override
	public CannabisApplicationPayment removeBygetCAP_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationPaymentException {

		CannabisApplicationPayment cannabisApplicationPayment =
			findBygetCAP_CAI(cannabisApplicationId);

		return remove(cannabisApplicationPayment);
	}

	/**
	 * Returns the number of cannabis application payments where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis application payments
	 */
	@Override
	public int countBygetCAP_CAI(long cannabisApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCAP_CAI;

		Object[] finderArgs = new Object[] {cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETCAP_CAI_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

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
		_FINDER_COLUMN_GETCAP_CAI_CANNABISAPPLICATIONID_2 =
			"cannabisApplicationPayment.cannabisApplicationId = ?";

	public CannabisApplicationPaymentPersistenceImpl() {
		setModelClass(CannabisApplicationPayment.class);

		setModelImplClass(CannabisApplicationPaymentImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisApplicationPaymentTable.INSTANCE);
	}

	/**
	 * Caches the cannabis application payment in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationPayment the cannabis application payment
	 */
	@Override
	public void cacheResult(
		CannabisApplicationPayment cannabisApplicationPayment) {

		entityCache.putResult(
			CannabisApplicationPaymentImpl.class,
			cannabisApplicationPayment.getPrimaryKey(),
			cannabisApplicationPayment);

		finderCache.putResult(
			_finderPathFetchBygetCAP_CAI,
			new Object[] {
				cannabisApplicationPayment.getCannabisApplicationId()
			},
			cannabisApplicationPayment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis application payments in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationPayments the cannabis application payments
	 */
	@Override
	public void cacheResult(
		List<CannabisApplicationPayment> cannabisApplicationPayments) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisApplicationPayments.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisApplicationPayment cannabisApplicationPayment :
				cannabisApplicationPayments) {

			if (entityCache.getResult(
					CannabisApplicationPaymentImpl.class,
					cannabisApplicationPayment.getPrimaryKey()) == null) {

				cacheResult(cannabisApplicationPayment);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis application payments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisApplicationPaymentImpl.class);

		finderCache.clearCache(CannabisApplicationPaymentImpl.class);
	}

	/**
	 * Clears the cache for the cannabis application payment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CannabisApplicationPayment cannabisApplicationPayment) {

		entityCache.removeResult(
			CannabisApplicationPaymentImpl.class, cannabisApplicationPayment);
	}

	@Override
	public void clearCache(
		List<CannabisApplicationPayment> cannabisApplicationPayments) {

		for (CannabisApplicationPayment cannabisApplicationPayment :
				cannabisApplicationPayments) {

			entityCache.removeResult(
				CannabisApplicationPaymentImpl.class,
				cannabisApplicationPayment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisApplicationPaymentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisApplicationPaymentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CannabisApplicationPaymentModelImpl
			cannabisApplicationPaymentModelImpl) {

		Object[] args = new Object[] {
			cannabisApplicationPaymentModelImpl.getCannabisApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCAP_CAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCAP_CAI, args,
			cannabisApplicationPaymentModelImpl);
	}

	/**
	 * Creates a new cannabis application payment with the primary key. Does not add the cannabis application payment to the database.
	 *
	 * @param cannabisApplicationPaymentId the primary key for the new cannabis application payment
	 * @return the new cannabis application payment
	 */
	@Override
	public CannabisApplicationPayment create(
		long cannabisApplicationPaymentId) {

		CannabisApplicationPayment cannabisApplicationPayment =
			new CannabisApplicationPaymentImpl();

		cannabisApplicationPayment.setNew(true);
		cannabisApplicationPayment.setPrimaryKey(cannabisApplicationPaymentId);

		cannabisApplicationPayment.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return cannabisApplicationPayment;
	}

	/**
	 * Removes the cannabis application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisApplicationPaymentId the primary key of the cannabis application payment
	 * @return the cannabis application payment that was removed
	 * @throws NoSuchCannabisApplicationPaymentException if a cannabis application payment with the primary key could not be found
	 */
	@Override
	public CannabisApplicationPayment remove(long cannabisApplicationPaymentId)
		throws NoSuchCannabisApplicationPaymentException {

		return remove((Serializable)cannabisApplicationPaymentId);
	}

	/**
	 * Removes the cannabis application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis application payment
	 * @return the cannabis application payment that was removed
	 * @throws NoSuchCannabisApplicationPaymentException if a cannabis application payment with the primary key could not be found
	 */
	@Override
	public CannabisApplicationPayment remove(Serializable primaryKey)
		throws NoSuchCannabisApplicationPaymentException {

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationPayment cannabisApplicationPayment =
				(CannabisApplicationPayment)session.get(
					CannabisApplicationPaymentImpl.class, primaryKey);

			if (cannabisApplicationPayment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisApplicationPaymentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisApplicationPayment);
		}
		catch (NoSuchCannabisApplicationPaymentException
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
	protected CannabisApplicationPayment removeImpl(
		CannabisApplicationPayment cannabisApplicationPayment) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisApplicationPayment)) {
				cannabisApplicationPayment =
					(CannabisApplicationPayment)session.get(
						CannabisApplicationPaymentImpl.class,
						cannabisApplicationPayment.getPrimaryKeyObj());
			}

			if (cannabisApplicationPayment != null) {
				session.delete(cannabisApplicationPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisApplicationPayment != null) {
			clearCache(cannabisApplicationPayment);
		}

		return cannabisApplicationPayment;
	}

	@Override
	public CannabisApplicationPayment updateImpl(
		CannabisApplicationPayment cannabisApplicationPayment) {

		boolean isNew = cannabisApplicationPayment.isNew();

		if (!(cannabisApplicationPayment instanceof
				CannabisApplicationPaymentModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(cannabisApplicationPayment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisApplicationPayment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisApplicationPayment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisApplicationPayment implementation " +
					cannabisApplicationPayment.getClass());
		}

		CannabisApplicationPaymentModelImpl
			cannabisApplicationPaymentModelImpl =
				(CannabisApplicationPaymentModelImpl)cannabisApplicationPayment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (cannabisApplicationPayment.getCreateDate() == null)) {
			if (serviceContext == null) {
				cannabisApplicationPayment.setCreateDate(date);
			}
			else {
				cannabisApplicationPayment.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisApplicationPaymentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cannabisApplicationPayment.setModifiedDate(date);
			}
			else {
				cannabisApplicationPayment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisApplicationPayment);
			}
			else {
				cannabisApplicationPayment =
					(CannabisApplicationPayment)session.merge(
						cannabisApplicationPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisApplicationPaymentImpl.class,
			cannabisApplicationPaymentModelImpl, false, true);

		cacheUniqueFindersCache(cannabisApplicationPaymentModelImpl);

		if (isNew) {
			cannabisApplicationPayment.setNew(false);
		}

		cannabisApplicationPayment.resetOriginalValues();

		return cannabisApplicationPayment;
	}

	/**
	 * Returns the cannabis application payment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis application payment
	 * @return the cannabis application payment
	 * @throws NoSuchCannabisApplicationPaymentException if a cannabis application payment with the primary key could not be found
	 */
	@Override
	public CannabisApplicationPayment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCannabisApplicationPaymentException {

		CannabisApplicationPayment cannabisApplicationPayment =
			fetchByPrimaryKey(primaryKey);

		if (cannabisApplicationPayment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisApplicationPaymentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisApplicationPayment;
	}

	/**
	 * Returns the cannabis application payment with the primary key or throws a <code>NoSuchCannabisApplicationPaymentException</code> if it could not be found.
	 *
	 * @param cannabisApplicationPaymentId the primary key of the cannabis application payment
	 * @return the cannabis application payment
	 * @throws NoSuchCannabisApplicationPaymentException if a cannabis application payment with the primary key could not be found
	 */
	@Override
	public CannabisApplicationPayment findByPrimaryKey(
			long cannabisApplicationPaymentId)
		throws NoSuchCannabisApplicationPaymentException {

		return findByPrimaryKey((Serializable)cannabisApplicationPaymentId);
	}

	/**
	 * Returns the cannabis application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisApplicationPaymentId the primary key of the cannabis application payment
	 * @return the cannabis application payment, or <code>null</code> if a cannabis application payment with the primary key could not be found
	 */
	@Override
	public CannabisApplicationPayment fetchByPrimaryKey(
		long cannabisApplicationPaymentId) {

		return fetchByPrimaryKey((Serializable)cannabisApplicationPaymentId);
	}

	/**
	 * Returns all the cannabis application payments.
	 *
	 * @return the cannabis application payments
	 */
	@Override
	public List<CannabisApplicationPayment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application payments
	 * @param end the upper bound of the range of cannabis application payments (not inclusive)
	 * @return the range of cannabis application payments
	 */
	@Override
	public List<CannabisApplicationPayment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application payments
	 * @param end the upper bound of the range of cannabis application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application payments
	 */
	@Override
	public List<CannabisApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationPayment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application payments
	 * @param end the upper bound of the range of cannabis application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application payments
	 */
	@Override
	public List<CannabisApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationPayment> orderByComparator,
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

		List<CannabisApplicationPayment> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplicationPayment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISAPPLICATIONPAYMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISAPPLICATIONPAYMENT;

				sql = sql.concat(
					CannabisApplicationPaymentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisApplicationPayment>)QueryUtil.list(
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
	 * Removes all the cannabis application payments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisApplicationPayment cannabisApplicationPayment :
				findAll()) {

			remove(cannabisApplicationPayment);
		}
	}

	/**
	 * Returns the number of cannabis application payments.
	 *
	 * @return the number of cannabis application payments
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
					_SQL_COUNT_CANNABISAPPLICATIONPAYMENT);

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
		return "cannabisApplicationPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISAPPLICATIONPAYMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisApplicationPaymentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis application payment persistence.
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

		_finderPathFetchBygetCAP_CAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCAP_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathCountBygetCAP_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCAP_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, false);

		CannabisApplicationPaymentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisApplicationPaymentUtil.setPersistence(null);

		entityCache.removeCache(CannabisApplicationPaymentImpl.class.getName());
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CANNABISAPPLICATIONPAYMENT =
		"SELECT cannabisApplicationPayment FROM CannabisApplicationPayment cannabisApplicationPayment";

	private static final String _SQL_SELECT_CANNABISAPPLICATIONPAYMENT_WHERE =
		"SELECT cannabisApplicationPayment FROM CannabisApplicationPayment cannabisApplicationPayment WHERE ";

	private static final String _SQL_COUNT_CANNABISAPPLICATIONPAYMENT =
		"SELECT COUNT(cannabisApplicationPayment) FROM CannabisApplicationPayment cannabisApplicationPayment";

	private static final String _SQL_COUNT_CANNABISAPPLICATIONPAYMENT_WHERE =
		"SELECT COUNT(cannabisApplicationPayment) FROM CannabisApplicationPayment cannabisApplicationPayment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisApplicationPayment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisApplicationPayment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisApplicationPayment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisApplicationPaymentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}