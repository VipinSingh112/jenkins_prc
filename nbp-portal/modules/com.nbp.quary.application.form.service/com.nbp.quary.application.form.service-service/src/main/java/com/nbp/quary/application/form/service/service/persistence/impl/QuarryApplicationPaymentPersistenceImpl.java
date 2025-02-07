/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence.impl;

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

import com.nbp.quary.application.form.service.exception.NoSuchQuarryApplicationPaymentException;
import com.nbp.quary.application.form.service.model.QuarryApplicationPayment;
import com.nbp.quary.application.form.service.model.QuarryApplicationPaymentTable;
import com.nbp.quary.application.form.service.model.impl.QuarryApplicationPaymentImpl;
import com.nbp.quary.application.form.service.model.impl.QuarryApplicationPaymentModelImpl;
import com.nbp.quary.application.form.service.service.persistence.QuarryApplicationPaymentPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryApplicationPaymentUtil;
import com.nbp.quary.application.form.service.service.persistence.impl.constants.QUARRY_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the quarry application payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QuarryApplicationPaymentPersistence.class)
public class QuarryApplicationPaymentPersistenceImpl
	extends BasePersistenceImpl<QuarryApplicationPayment>
	implements QuarryApplicationPaymentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QuarryApplicationPaymentUtil</code> to access the quarry application payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QuarryApplicationPaymentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetQuarry_Pay_AppId;
	private FinderPath _finderPathCountBygetQuarry_Pay_AppId;

	/**
	 * Returns the quarry application payment where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryApplicationPaymentException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry application payment
	 * @throws NoSuchQuarryApplicationPaymentException if a matching quarry application payment could not be found
	 */
	@Override
	public QuarryApplicationPayment findBygetQuarry_Pay_AppId(
			long quarryApplicationId)
		throws NoSuchQuarryApplicationPaymentException {

		QuarryApplicationPayment quarryApplicationPayment =
			fetchBygetQuarry_Pay_AppId(quarryApplicationId);

		if (quarryApplicationPayment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("quarryApplicationId=");
			sb.append(quarryApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQuarryApplicationPaymentException(sb.toString());
		}

		return quarryApplicationPayment;
	}

	/**
	 * Returns the quarry application payment where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry application payment, or <code>null</code> if a matching quarry application payment could not be found
	 */
	@Override
	public QuarryApplicationPayment fetchBygetQuarry_Pay_AppId(
		long quarryApplicationId) {

		return fetchBygetQuarry_Pay_AppId(quarryApplicationId, true);
	}

	/**
	 * Returns the quarry application payment where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application payment, or <code>null</code> if a matching quarry application payment could not be found
	 */
	@Override
	public QuarryApplicationPayment fetchBygetQuarry_Pay_AppId(
		long quarryApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {quarryApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetQuarry_Pay_AppId, finderArgs, this);
		}

		if (result instanceof QuarryApplicationPayment) {
			QuarryApplicationPayment quarryApplicationPayment =
				(QuarryApplicationPayment)result;

			if (quarryApplicationId !=
					quarryApplicationPayment.getQuarryApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_QUARRYAPPLICATIONPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRY_PAY_APPID_QUARRYAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

				List<QuarryApplicationPayment> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetQuarry_Pay_AppId, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {quarryApplicationId};
							}

							_log.warn(
								"QuarryApplicationPaymentPersistenceImpl.fetchBygetQuarry_Pay_AppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QuarryApplicationPayment quarryApplicationPayment =
						list.get(0);

					result = quarryApplicationPayment;

					cacheResult(quarryApplicationPayment);
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
			return (QuarryApplicationPayment)result;
		}
	}

	/**
	 * Removes the quarry application payment where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry application payment that was removed
	 */
	@Override
	public QuarryApplicationPayment removeBygetQuarry_Pay_AppId(
			long quarryApplicationId)
		throws NoSuchQuarryApplicationPaymentException {

		QuarryApplicationPayment quarryApplicationPayment =
			findBygetQuarry_Pay_AppId(quarryApplicationId);

		return remove(quarryApplicationPayment);
	}

	/**
	 * Returns the number of quarry application payments where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry application payments
	 */
	@Override
	public int countBygetQuarry_Pay_AppId(long quarryApplicationId) {
		FinderPath finderPath = _finderPathCountBygetQuarry_Pay_AppId;

		Object[] finderArgs = new Object[] {quarryApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYAPPLICATIONPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRY_PAY_APPID_QUARRYAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

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
		_FINDER_COLUMN_GETQUARRY_PAY_APPID_QUARRYAPPLICATIONID_2 =
			"quarryApplicationPayment.quarryApplicationId = ?";

	public QuarryApplicationPaymentPersistenceImpl() {
		setModelClass(QuarryApplicationPayment.class);

		setModelImplClass(QuarryApplicationPaymentImpl.class);
		setModelPKClass(long.class);

		setTable(QuarryApplicationPaymentTable.INSTANCE);
	}

	/**
	 * Caches the quarry application payment in the entity cache if it is enabled.
	 *
	 * @param quarryApplicationPayment the quarry application payment
	 */
	@Override
	public void cacheResult(QuarryApplicationPayment quarryApplicationPayment) {
		entityCache.putResult(
			QuarryApplicationPaymentImpl.class,
			quarryApplicationPayment.getPrimaryKey(), quarryApplicationPayment);

		finderCache.putResult(
			_finderPathFetchBygetQuarry_Pay_AppId,
			new Object[] {quarryApplicationPayment.getQuarryApplicationId()},
			quarryApplicationPayment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the quarry application payments in the entity cache if it is enabled.
	 *
	 * @param quarryApplicationPayments the quarry application payments
	 */
	@Override
	public void cacheResult(
		List<QuarryApplicationPayment> quarryApplicationPayments) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (quarryApplicationPayments.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QuarryApplicationPayment quarryApplicationPayment :
				quarryApplicationPayments) {

			if (entityCache.getResult(
					QuarryApplicationPaymentImpl.class,
					quarryApplicationPayment.getPrimaryKey()) == null) {

				cacheResult(quarryApplicationPayment);
			}
		}
	}

	/**
	 * Clears the cache for all quarry application payments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QuarryApplicationPaymentImpl.class);

		finderCache.clearCache(QuarryApplicationPaymentImpl.class);
	}

	/**
	 * Clears the cache for the quarry application payment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QuarryApplicationPayment quarryApplicationPayment) {
		entityCache.removeResult(
			QuarryApplicationPaymentImpl.class, quarryApplicationPayment);
	}

	@Override
	public void clearCache(
		List<QuarryApplicationPayment> quarryApplicationPayments) {

		for (QuarryApplicationPayment quarryApplicationPayment :
				quarryApplicationPayments) {

			entityCache.removeResult(
				QuarryApplicationPaymentImpl.class, quarryApplicationPayment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(QuarryApplicationPaymentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				QuarryApplicationPaymentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		QuarryApplicationPaymentModelImpl quarryApplicationPaymentModelImpl) {

		Object[] args = new Object[] {
			quarryApplicationPaymentModelImpl.getQuarryApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetQuarry_Pay_AppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetQuarry_Pay_AppId, args,
			quarryApplicationPaymentModelImpl);
	}

	/**
	 * Creates a new quarry application payment with the primary key. Does not add the quarry application payment to the database.
	 *
	 * @param quarryApplicationPaymentId the primary key for the new quarry application payment
	 * @return the new quarry application payment
	 */
	@Override
	public QuarryApplicationPayment create(long quarryApplicationPaymentId) {
		QuarryApplicationPayment quarryApplicationPayment =
			new QuarryApplicationPaymentImpl();

		quarryApplicationPayment.setNew(true);
		quarryApplicationPayment.setPrimaryKey(quarryApplicationPaymentId);

		quarryApplicationPayment.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return quarryApplicationPayment;
	}

	/**
	 * Removes the quarry application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quarryApplicationPaymentId the primary key of the quarry application payment
	 * @return the quarry application payment that was removed
	 * @throws NoSuchQuarryApplicationPaymentException if a quarry application payment with the primary key could not be found
	 */
	@Override
	public QuarryApplicationPayment remove(long quarryApplicationPaymentId)
		throws NoSuchQuarryApplicationPaymentException {

		return remove((Serializable)quarryApplicationPaymentId);
	}

	/**
	 * Removes the quarry application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the quarry application payment
	 * @return the quarry application payment that was removed
	 * @throws NoSuchQuarryApplicationPaymentException if a quarry application payment with the primary key could not be found
	 */
	@Override
	public QuarryApplicationPayment remove(Serializable primaryKey)
		throws NoSuchQuarryApplicationPaymentException {

		Session session = null;

		try {
			session = openSession();

			QuarryApplicationPayment quarryApplicationPayment =
				(QuarryApplicationPayment)session.get(
					QuarryApplicationPaymentImpl.class, primaryKey);

			if (quarryApplicationPayment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQuarryApplicationPaymentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(quarryApplicationPayment);
		}
		catch (NoSuchQuarryApplicationPaymentException noSuchEntityException) {
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
	protected QuarryApplicationPayment removeImpl(
		QuarryApplicationPayment quarryApplicationPayment) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(quarryApplicationPayment)) {
				quarryApplicationPayment =
					(QuarryApplicationPayment)session.get(
						QuarryApplicationPaymentImpl.class,
						quarryApplicationPayment.getPrimaryKeyObj());
			}

			if (quarryApplicationPayment != null) {
				session.delete(quarryApplicationPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (quarryApplicationPayment != null) {
			clearCache(quarryApplicationPayment);
		}

		return quarryApplicationPayment;
	}

	@Override
	public QuarryApplicationPayment updateImpl(
		QuarryApplicationPayment quarryApplicationPayment) {

		boolean isNew = quarryApplicationPayment.isNew();

		if (!(quarryApplicationPayment instanceof
				QuarryApplicationPaymentModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(quarryApplicationPayment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					quarryApplicationPayment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in quarryApplicationPayment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QuarryApplicationPayment implementation " +
					quarryApplicationPayment.getClass());
		}

		QuarryApplicationPaymentModelImpl quarryApplicationPaymentModelImpl =
			(QuarryApplicationPaymentModelImpl)quarryApplicationPayment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (quarryApplicationPayment.getCreateDate() == null)) {
			if (serviceContext == null) {
				quarryApplicationPayment.setCreateDate(date);
			}
			else {
				quarryApplicationPayment.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!quarryApplicationPaymentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				quarryApplicationPayment.setModifiedDate(date);
			}
			else {
				quarryApplicationPayment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(quarryApplicationPayment);
			}
			else {
				quarryApplicationPayment =
					(QuarryApplicationPayment)session.merge(
						quarryApplicationPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			QuarryApplicationPaymentImpl.class,
			quarryApplicationPaymentModelImpl, false, true);

		cacheUniqueFindersCache(quarryApplicationPaymentModelImpl);

		if (isNew) {
			quarryApplicationPayment.setNew(false);
		}

		quarryApplicationPayment.resetOriginalValues();

		return quarryApplicationPayment;
	}

	/**
	 * Returns the quarry application payment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the quarry application payment
	 * @return the quarry application payment
	 * @throws NoSuchQuarryApplicationPaymentException if a quarry application payment with the primary key could not be found
	 */
	@Override
	public QuarryApplicationPayment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQuarryApplicationPaymentException {

		QuarryApplicationPayment quarryApplicationPayment = fetchByPrimaryKey(
			primaryKey);

		if (quarryApplicationPayment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQuarryApplicationPaymentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return quarryApplicationPayment;
	}

	/**
	 * Returns the quarry application payment with the primary key or throws a <code>NoSuchQuarryApplicationPaymentException</code> if it could not be found.
	 *
	 * @param quarryApplicationPaymentId the primary key of the quarry application payment
	 * @return the quarry application payment
	 * @throws NoSuchQuarryApplicationPaymentException if a quarry application payment with the primary key could not be found
	 */
	@Override
	public QuarryApplicationPayment findByPrimaryKey(
			long quarryApplicationPaymentId)
		throws NoSuchQuarryApplicationPaymentException {

		return findByPrimaryKey((Serializable)quarryApplicationPaymentId);
	}

	/**
	 * Returns the quarry application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quarryApplicationPaymentId the primary key of the quarry application payment
	 * @return the quarry application payment, or <code>null</code> if a quarry application payment with the primary key could not be found
	 */
	@Override
	public QuarryApplicationPayment fetchByPrimaryKey(
		long quarryApplicationPaymentId) {

		return fetchByPrimaryKey((Serializable)quarryApplicationPaymentId);
	}

	/**
	 * Returns all the quarry application payments.
	 *
	 * @return the quarry application payments
	 */
	@Override
	public List<QuarryApplicationPayment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application payments
	 * @param end the upper bound of the range of quarry application payments (not inclusive)
	 * @return the range of quarry application payments
	 */
	@Override
	public List<QuarryApplicationPayment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application payments
	 * @param end the upper bound of the range of quarry application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry application payments
	 */
	@Override
	public List<QuarryApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<QuarryApplicationPayment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application payments
	 * @param end the upper bound of the range of quarry application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry application payments
	 */
	@Override
	public List<QuarryApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<QuarryApplicationPayment> orderByComparator,
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

		List<QuarryApplicationPayment> list = null;

		if (useFinderCache) {
			list = (List<QuarryApplicationPayment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUARRYAPPLICATIONPAYMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUARRYAPPLICATIONPAYMENT;

				sql = sql.concat(
					QuarryApplicationPaymentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<QuarryApplicationPayment>)QueryUtil.list(
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
	 * Removes all the quarry application payments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QuarryApplicationPayment quarryApplicationPayment : findAll()) {
			remove(quarryApplicationPayment);
		}
	}

	/**
	 * Returns the number of quarry application payments.
	 *
	 * @return the number of quarry application payments
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
					_SQL_COUNT_QUARRYAPPLICATIONPAYMENT);

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
		return "quarryApplicationPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUARRYAPPLICATIONPAYMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QuarryApplicationPaymentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the quarry application payment persistence.
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

		_finderPathFetchBygetQuarry_Pay_AppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetQuarry_Pay_AppId",
			new String[] {Long.class.getName()},
			new String[] {"quarryApplicationId"}, true);

		_finderPathCountBygetQuarry_Pay_AppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarry_Pay_AppId", new String[] {Long.class.getName()},
			new String[] {"quarryApplicationId"}, false);

		QuarryApplicationPaymentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		QuarryApplicationPaymentUtil.setPersistence(null);

		entityCache.removeCache(QuarryApplicationPaymentImpl.class.getName());
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_QUARRYAPPLICATIONPAYMENT =
		"SELECT quarryApplicationPayment FROM QuarryApplicationPayment quarryApplicationPayment";

	private static final String _SQL_SELECT_QUARRYAPPLICATIONPAYMENT_WHERE =
		"SELECT quarryApplicationPayment FROM QuarryApplicationPayment quarryApplicationPayment WHERE ";

	private static final String _SQL_COUNT_QUARRYAPPLICATIONPAYMENT =
		"SELECT COUNT(quarryApplicationPayment) FROM QuarryApplicationPayment quarryApplicationPayment";

	private static final String _SQL_COUNT_QUARRYAPPLICATIONPAYMENT_WHERE =
		"SELECT COUNT(quarryApplicationPayment) FROM QuarryApplicationPayment quarryApplicationPayment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"quarryApplicationPayment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QuarryApplicationPayment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QuarryApplicationPayment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QuarryApplicationPaymentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}