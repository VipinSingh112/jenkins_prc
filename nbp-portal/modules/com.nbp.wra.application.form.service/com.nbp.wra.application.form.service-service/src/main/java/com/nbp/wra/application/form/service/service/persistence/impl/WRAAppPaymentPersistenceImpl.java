/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence.impl;

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

import com.nbp.wra.application.form.service.exception.NoSuchWRAAppPaymentException;
import com.nbp.wra.application.form.service.model.WRAAppPayment;
import com.nbp.wra.application.form.service.model.WRAAppPaymentTable;
import com.nbp.wra.application.form.service.model.impl.WRAAppPaymentImpl;
import com.nbp.wra.application.form.service.model.impl.WRAAppPaymentModelImpl;
import com.nbp.wra.application.form.service.service.persistence.WRAAppPaymentPersistence;
import com.nbp.wra.application.form.service.service.persistence.WRAAppPaymentUtil;
import com.nbp.wra.application.form.service.service.persistence.impl.constants.WRA_APPLICATIONPersistenceConstants;

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
 * The persistence implementation for the wra app payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = WRAAppPaymentPersistence.class)
public class WRAAppPaymentPersistenceImpl
	extends BasePersistenceImpl<WRAAppPayment>
	implements WRAAppPaymentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>WRAAppPaymentUtil</code> to access the wra app payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		WRAAppPaymentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetWRA_By_Id;
	private FinderPath _finderPathCountBygetWRA_By_Id;

	/**
	 * Returns the wra app payment where wraApplicationId = &#63; or throws a <code>NoSuchWRAAppPaymentException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra app payment
	 * @throws NoSuchWRAAppPaymentException if a matching wra app payment could not be found
	 */
	@Override
	public WRAAppPayment findBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchWRAAppPaymentException {

		WRAAppPayment wraAppPayment = fetchBygetWRA_By_Id(wraApplicationId);

		if (wraAppPayment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("wraApplicationId=");
			sb.append(wraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchWRAAppPaymentException(sb.toString());
		}

		return wraAppPayment;
	}

	/**
	 * Returns the wra app payment where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra app payment, or <code>null</code> if a matching wra app payment could not be found
	 */
	@Override
	public WRAAppPayment fetchBygetWRA_By_Id(long wraApplicationId) {
		return fetchBygetWRA_By_Id(wraApplicationId, true);
	}

	/**
	 * Returns the wra app payment where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra app payment, or <code>null</code> if a matching wra app payment could not be found
	 */
	@Override
	public WRAAppPayment fetchBygetWRA_By_Id(
		long wraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {wraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetWRA_By_Id, finderArgs, this);
		}

		if (result instanceof WRAAppPayment) {
			WRAAppPayment wraAppPayment = (WRAAppPayment)result;

			if (wraApplicationId != wraAppPayment.getWraApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_WRAAPPPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETWRA_BY_ID_WRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

				List<WRAAppPayment> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetWRA_By_Id, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {wraApplicationId};
							}

							_log.warn(
								"WRAAppPaymentPersistenceImpl.fetchBygetWRA_By_Id(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					WRAAppPayment wraAppPayment = list.get(0);

					result = wraAppPayment;

					cacheResult(wraAppPayment);
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
			return (WRAAppPayment)result;
		}
	}

	/**
	 * Removes the wra app payment where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the wra app payment that was removed
	 */
	@Override
	public WRAAppPayment removeBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchWRAAppPaymentException {

		WRAAppPayment wraAppPayment = findBygetWRA_By_Id(wraApplicationId);

		return remove(wraAppPayment);
	}

	/**
	 * Returns the number of wra app payments where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra app payments
	 */
	@Override
	public int countBygetWRA_By_Id(long wraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetWRA_By_Id;

		Object[] finderArgs = new Object[] {wraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAAPPPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETWRA_BY_ID_WRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

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

	private static final String _FINDER_COLUMN_GETWRA_BY_ID_WRAAPPLICATIONID_2 =
		"wraAppPayment.wraApplicationId = ?";

	public WRAAppPaymentPersistenceImpl() {
		setModelClass(WRAAppPayment.class);

		setModelImplClass(WRAAppPaymentImpl.class);
		setModelPKClass(long.class);

		setTable(WRAAppPaymentTable.INSTANCE);
	}

	/**
	 * Caches the wra app payment in the entity cache if it is enabled.
	 *
	 * @param wraAppPayment the wra app payment
	 */
	@Override
	public void cacheResult(WRAAppPayment wraAppPayment) {
		entityCache.putResult(
			WRAAppPaymentImpl.class, wraAppPayment.getPrimaryKey(),
			wraAppPayment);

		finderCache.putResult(
			_finderPathFetchBygetWRA_By_Id,
			new Object[] {wraAppPayment.getWraApplicationId()}, wraAppPayment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the wra app payments in the entity cache if it is enabled.
	 *
	 * @param wraAppPayments the wra app payments
	 */
	@Override
	public void cacheResult(List<WRAAppPayment> wraAppPayments) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (wraAppPayments.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (WRAAppPayment wraAppPayment : wraAppPayments) {
			if (entityCache.getResult(
					WRAAppPaymentImpl.class, wraAppPayment.getPrimaryKey()) ==
						null) {

				cacheResult(wraAppPayment);
			}
		}
	}

	/**
	 * Clears the cache for all wra app payments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(WRAAppPaymentImpl.class);

		finderCache.clearCache(WRAAppPaymentImpl.class);
	}

	/**
	 * Clears the cache for the wra app payment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(WRAAppPayment wraAppPayment) {
		entityCache.removeResult(WRAAppPaymentImpl.class, wraAppPayment);
	}

	@Override
	public void clearCache(List<WRAAppPayment> wraAppPayments) {
		for (WRAAppPayment wraAppPayment : wraAppPayments) {
			entityCache.removeResult(WRAAppPaymentImpl.class, wraAppPayment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(WRAAppPaymentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(WRAAppPaymentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		WRAAppPaymentModelImpl wraAppPaymentModelImpl) {

		Object[] args = new Object[] {
			wraAppPaymentModelImpl.getWraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetWRA_By_Id, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetWRA_By_Id, args, wraAppPaymentModelImpl);
	}

	/**
	 * Creates a new wra app payment with the primary key. Does not add the wra app payment to the database.
	 *
	 * @param wraAppPaymentId the primary key for the new wra app payment
	 * @return the new wra app payment
	 */
	@Override
	public WRAAppPayment create(long wraAppPaymentId) {
		WRAAppPayment wraAppPayment = new WRAAppPaymentImpl();

		wraAppPayment.setNew(true);
		wraAppPayment.setPrimaryKey(wraAppPaymentId);

		wraAppPayment.setCompanyId(CompanyThreadLocal.getCompanyId());

		return wraAppPayment;
	}

	/**
	 * Removes the wra app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraAppPaymentId the primary key of the wra app payment
	 * @return the wra app payment that was removed
	 * @throws NoSuchWRAAppPaymentException if a wra app payment with the primary key could not be found
	 */
	@Override
	public WRAAppPayment remove(long wraAppPaymentId)
		throws NoSuchWRAAppPaymentException {

		return remove((Serializable)wraAppPaymentId);
	}

	/**
	 * Removes the wra app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the wra app payment
	 * @return the wra app payment that was removed
	 * @throws NoSuchWRAAppPaymentException if a wra app payment with the primary key could not be found
	 */
	@Override
	public WRAAppPayment remove(Serializable primaryKey)
		throws NoSuchWRAAppPaymentException {

		Session session = null;

		try {
			session = openSession();

			WRAAppPayment wraAppPayment = (WRAAppPayment)session.get(
				WRAAppPaymentImpl.class, primaryKey);

			if (wraAppPayment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchWRAAppPaymentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(wraAppPayment);
		}
		catch (NoSuchWRAAppPaymentException noSuchEntityException) {
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
	protected WRAAppPayment removeImpl(WRAAppPayment wraAppPayment) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(wraAppPayment)) {
				wraAppPayment = (WRAAppPayment)session.get(
					WRAAppPaymentImpl.class, wraAppPayment.getPrimaryKeyObj());
			}

			if (wraAppPayment != null) {
				session.delete(wraAppPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (wraAppPayment != null) {
			clearCache(wraAppPayment);
		}

		return wraAppPayment;
	}

	@Override
	public WRAAppPayment updateImpl(WRAAppPayment wraAppPayment) {
		boolean isNew = wraAppPayment.isNew();

		if (!(wraAppPayment instanceof WRAAppPaymentModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(wraAppPayment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					wraAppPayment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in wraAppPayment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom WRAAppPayment implementation " +
					wraAppPayment.getClass());
		}

		WRAAppPaymentModelImpl wraAppPaymentModelImpl =
			(WRAAppPaymentModelImpl)wraAppPayment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (wraAppPayment.getCreateDate() == null)) {
			if (serviceContext == null) {
				wraAppPayment.setCreateDate(date);
			}
			else {
				wraAppPayment.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!wraAppPaymentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				wraAppPayment.setModifiedDate(date);
			}
			else {
				wraAppPayment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(wraAppPayment);
			}
			else {
				wraAppPayment = (WRAAppPayment)session.merge(wraAppPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			WRAAppPaymentImpl.class, wraAppPaymentModelImpl, false, true);

		cacheUniqueFindersCache(wraAppPaymentModelImpl);

		if (isNew) {
			wraAppPayment.setNew(false);
		}

		wraAppPayment.resetOriginalValues();

		return wraAppPayment;
	}

	/**
	 * Returns the wra app payment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the wra app payment
	 * @return the wra app payment
	 * @throws NoSuchWRAAppPaymentException if a wra app payment with the primary key could not be found
	 */
	@Override
	public WRAAppPayment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchWRAAppPaymentException {

		WRAAppPayment wraAppPayment = fetchByPrimaryKey(primaryKey);

		if (wraAppPayment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchWRAAppPaymentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return wraAppPayment;
	}

	/**
	 * Returns the wra app payment with the primary key or throws a <code>NoSuchWRAAppPaymentException</code> if it could not be found.
	 *
	 * @param wraAppPaymentId the primary key of the wra app payment
	 * @return the wra app payment
	 * @throws NoSuchWRAAppPaymentException if a wra app payment with the primary key could not be found
	 */
	@Override
	public WRAAppPayment findByPrimaryKey(long wraAppPaymentId)
		throws NoSuchWRAAppPaymentException {

		return findByPrimaryKey((Serializable)wraAppPaymentId);
	}

	/**
	 * Returns the wra app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraAppPaymentId the primary key of the wra app payment
	 * @return the wra app payment, or <code>null</code> if a wra app payment with the primary key could not be found
	 */
	@Override
	public WRAAppPayment fetchByPrimaryKey(long wraAppPaymentId) {
		return fetchByPrimaryKey((Serializable)wraAppPaymentId);
	}

	/**
	 * Returns all the wra app payments.
	 *
	 * @return the wra app payments
	 */
	@Override
	public List<WRAAppPayment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra app payments
	 * @param end the upper bound of the range of wra app payments (not inclusive)
	 * @return the range of wra app payments
	 */
	@Override
	public List<WRAAppPayment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra app payments
	 * @param end the upper bound of the range of wra app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra app payments
	 */
	@Override
	public List<WRAAppPayment> findAll(
		int start, int end,
		OrderByComparator<WRAAppPayment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra app payments
	 * @param end the upper bound of the range of wra app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra app payments
	 */
	@Override
	public List<WRAAppPayment> findAll(
		int start, int end, OrderByComparator<WRAAppPayment> orderByComparator,
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

		List<WRAAppPayment> list = null;

		if (useFinderCache) {
			list = (List<WRAAppPayment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_WRAAPPPAYMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_WRAAPPPAYMENT;

				sql = sql.concat(WRAAppPaymentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<WRAAppPayment>)QueryUtil.list(
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
	 * Removes all the wra app payments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (WRAAppPayment wraAppPayment : findAll()) {
			remove(wraAppPayment);
		}
	}

	/**
	 * Returns the number of wra app payments.
	 *
	 * @return the number of wra app payments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_WRAAPPPAYMENT);

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
		return "wraAppPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_WRAAPPPAYMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return WRAAppPaymentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the wra app payment persistence.
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

		_finderPathFetchBygetWRA_By_Id = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetWRA_By_Id",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, true);

		_finderPathCountBygetWRA_By_Id = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetWRA_By_Id",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, false);

		WRAAppPaymentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		WRAAppPaymentUtil.setPersistence(null);

		entityCache.removeCache(WRAAppPaymentImpl.class.getName());
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_WRAAPPPAYMENT =
		"SELECT wraAppPayment FROM WRAAppPayment wraAppPayment";

	private static final String _SQL_SELECT_WRAAPPPAYMENT_WHERE =
		"SELECT wraAppPayment FROM WRAAppPayment wraAppPayment WHERE ";

	private static final String _SQL_COUNT_WRAAPPPAYMENT =
		"SELECT COUNT(wraAppPayment) FROM WRAAppPayment wraAppPayment";

	private static final String _SQL_COUNT_WRAAPPPAYMENT_WHERE =
		"SELECT COUNT(wraAppPayment) FROM WRAAppPayment wraAppPayment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "wraAppPayment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No WRAAppPayment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No WRAAppPayment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		WRAAppPaymentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}