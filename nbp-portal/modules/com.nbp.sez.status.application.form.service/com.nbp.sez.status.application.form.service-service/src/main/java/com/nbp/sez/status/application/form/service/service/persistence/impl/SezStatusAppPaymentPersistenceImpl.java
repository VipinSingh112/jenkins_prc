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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezStatusAppPaymentException;
import com.nbp.sez.status.application.form.service.model.SezStatusAppPayment;
import com.nbp.sez.status.application.form.service.model.SezStatusAppPaymentTable;
import com.nbp.sez.status.application.form.service.model.impl.SezStatusAppPaymentImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezStatusAppPaymentModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezStatusAppPaymentPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezStatusAppPaymentUtil;
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
 * The persistence implementation for the sez status app payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezStatusAppPaymentPersistence.class)
public class SezStatusAppPaymentPersistenceImpl
	extends BasePersistenceImpl<SezStatusAppPayment>
	implements SezStatusAppPaymentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezStatusAppPaymentUtil</code> to access the sez status app payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezStatusAppPaymentImpl.class.getName();

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
	 * Returns the sez status app payment where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezStatusAppPaymentException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status app payment
	 * @throws NoSuchSezStatusAppPaymentException if a matching sez status app payment could not be found
	 */
	@Override
	public SezStatusAppPayment findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezStatusAppPaymentException {

		SezStatusAppPayment sezStatusAppPayment = fetchBygetSezStatusByAppId(
			sezStatusApplicationId);

		if (sezStatusAppPayment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezStatusAppPaymentException(sb.toString());
		}

		return sezStatusAppPayment;
	}

	/**
	 * Returns the sez status app payment where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status app payment, or <code>null</code> if a matching sez status app payment could not be found
	 */
	@Override
	public SezStatusAppPayment fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez status app payment where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status app payment, or <code>null</code> if a matching sez status app payment could not be found
	 */
	@Override
	public SezStatusAppPayment fetchBygetSezStatusByAppId(
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

		if (result instanceof SezStatusAppPayment) {
			SezStatusAppPayment sezStatusAppPayment =
				(SezStatusAppPayment)result;

			if (sezStatusApplicationId !=
					sezStatusAppPayment.getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZSTATUSAPPPAYMENT_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezStatusAppPayment> list = query.list();

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
								"SezStatusAppPaymentPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezStatusAppPayment sezStatusAppPayment = list.get(0);

					result = sezStatusAppPayment;

					cacheResult(sezStatusAppPayment);
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
			return (SezStatusAppPayment)result;
		}
	}

	/**
	 * Removes the sez status app payment where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez status app payment that was removed
	 */
	@Override
	public SezStatusAppPayment removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezStatusAppPaymentException {

		SezStatusAppPayment sezStatusAppPayment = findBygetSezStatusByAppId(
			sezStatusApplicationId);

		return remove(sezStatusAppPayment);
	}

	/**
	 * Returns the number of sez status app payments where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez status app payments
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSAPPPAYMENT_WHERE);

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
			"sezStatusAppPayment.sezStatusApplicationId = ?";

	public SezStatusAppPaymentPersistenceImpl() {
		setModelClass(SezStatusAppPayment.class);

		setModelImplClass(SezStatusAppPaymentImpl.class);
		setModelPKClass(long.class);

		setTable(SezStatusAppPaymentTable.INSTANCE);
	}

	/**
	 * Caches the sez status app payment in the entity cache if it is enabled.
	 *
	 * @param sezStatusAppPayment the sez status app payment
	 */
	@Override
	public void cacheResult(SezStatusAppPayment sezStatusAppPayment) {
		entityCache.putResult(
			SezStatusAppPaymentImpl.class, sezStatusAppPayment.getPrimaryKey(),
			sezStatusAppPayment);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {sezStatusAppPayment.getSezStatusApplicationId()},
			sezStatusAppPayment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez status app payments in the entity cache if it is enabled.
	 *
	 * @param sezStatusAppPayments the sez status app payments
	 */
	@Override
	public void cacheResult(List<SezStatusAppPayment> sezStatusAppPayments) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezStatusAppPayments.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezStatusAppPayment sezStatusAppPayment : sezStatusAppPayments) {
			if (entityCache.getResult(
					SezStatusAppPaymentImpl.class,
					sezStatusAppPayment.getPrimaryKey()) == null) {

				cacheResult(sezStatusAppPayment);
			}
		}
	}

	/**
	 * Clears the cache for all sez status app payments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezStatusAppPaymentImpl.class);

		finderCache.clearCache(SezStatusAppPaymentImpl.class);
	}

	/**
	 * Clears the cache for the sez status app payment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezStatusAppPayment sezStatusAppPayment) {
		entityCache.removeResult(
			SezStatusAppPaymentImpl.class, sezStatusAppPayment);
	}

	@Override
	public void clearCache(List<SezStatusAppPayment> sezStatusAppPayments) {
		for (SezStatusAppPayment sezStatusAppPayment : sezStatusAppPayments) {
			entityCache.removeResult(
				SezStatusAppPaymentImpl.class, sezStatusAppPayment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezStatusAppPaymentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(SezStatusAppPaymentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezStatusAppPaymentModelImpl sezStatusAppPaymentModelImpl) {

		Object[] args = new Object[] {
			sezStatusAppPaymentModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezStatusAppPaymentModelImpl);
	}

	/**
	 * Creates a new sez status app payment with the primary key. Does not add the sez status app payment to the database.
	 *
	 * @param sezStatusAppPaymentId the primary key for the new sez status app payment
	 * @return the new sez status app payment
	 */
	@Override
	public SezStatusAppPayment create(long sezStatusAppPaymentId) {
		SezStatusAppPayment sezStatusAppPayment = new SezStatusAppPaymentImpl();

		sezStatusAppPayment.setNew(true);
		sezStatusAppPayment.setPrimaryKey(sezStatusAppPaymentId);

		sezStatusAppPayment.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sezStatusAppPayment;
	}

	/**
	 * Removes the sez status app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStatusAppPaymentId the primary key of the sez status app payment
	 * @return the sez status app payment that was removed
	 * @throws NoSuchSezStatusAppPaymentException if a sez status app payment with the primary key could not be found
	 */
	@Override
	public SezStatusAppPayment remove(long sezStatusAppPaymentId)
		throws NoSuchSezStatusAppPaymentException {

		return remove((Serializable)sezStatusAppPaymentId);
	}

	/**
	 * Removes the sez status app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez status app payment
	 * @return the sez status app payment that was removed
	 * @throws NoSuchSezStatusAppPaymentException if a sez status app payment with the primary key could not be found
	 */
	@Override
	public SezStatusAppPayment remove(Serializable primaryKey)
		throws NoSuchSezStatusAppPaymentException {

		Session session = null;

		try {
			session = openSession();

			SezStatusAppPayment sezStatusAppPayment =
				(SezStatusAppPayment)session.get(
					SezStatusAppPaymentImpl.class, primaryKey);

			if (sezStatusAppPayment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezStatusAppPaymentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezStatusAppPayment);
		}
		catch (NoSuchSezStatusAppPaymentException noSuchEntityException) {
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
	protected SezStatusAppPayment removeImpl(
		SezStatusAppPayment sezStatusAppPayment) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezStatusAppPayment)) {
				sezStatusAppPayment = (SezStatusAppPayment)session.get(
					SezStatusAppPaymentImpl.class,
					sezStatusAppPayment.getPrimaryKeyObj());
			}

			if (sezStatusAppPayment != null) {
				session.delete(sezStatusAppPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezStatusAppPayment != null) {
			clearCache(sezStatusAppPayment);
		}

		return sezStatusAppPayment;
	}

	@Override
	public SezStatusAppPayment updateImpl(
		SezStatusAppPayment sezStatusAppPayment) {

		boolean isNew = sezStatusAppPayment.isNew();

		if (!(sezStatusAppPayment instanceof SezStatusAppPaymentModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezStatusAppPayment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezStatusAppPayment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezStatusAppPayment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezStatusAppPayment implementation " +
					sezStatusAppPayment.getClass());
		}

		SezStatusAppPaymentModelImpl sezStatusAppPaymentModelImpl =
			(SezStatusAppPaymentModelImpl)sezStatusAppPayment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezStatusAppPayment.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezStatusAppPayment.setCreateDate(date);
			}
			else {
				sezStatusAppPayment.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezStatusAppPaymentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezStatusAppPayment.setModifiedDate(date);
			}
			else {
				sezStatusAppPayment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezStatusAppPayment);
			}
			else {
				sezStatusAppPayment = (SezStatusAppPayment)session.merge(
					sezStatusAppPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezStatusAppPaymentImpl.class, sezStatusAppPaymentModelImpl, false,
			true);

		cacheUniqueFindersCache(sezStatusAppPaymentModelImpl);

		if (isNew) {
			sezStatusAppPayment.setNew(false);
		}

		sezStatusAppPayment.resetOriginalValues();

		return sezStatusAppPayment;
	}

	/**
	 * Returns the sez status app payment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez status app payment
	 * @return the sez status app payment
	 * @throws NoSuchSezStatusAppPaymentException if a sez status app payment with the primary key could not be found
	 */
	@Override
	public SezStatusAppPayment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezStatusAppPaymentException {

		SezStatusAppPayment sezStatusAppPayment = fetchByPrimaryKey(primaryKey);

		if (sezStatusAppPayment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezStatusAppPaymentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezStatusAppPayment;
	}

	/**
	 * Returns the sez status app payment with the primary key or throws a <code>NoSuchSezStatusAppPaymentException</code> if it could not be found.
	 *
	 * @param sezStatusAppPaymentId the primary key of the sez status app payment
	 * @return the sez status app payment
	 * @throws NoSuchSezStatusAppPaymentException if a sez status app payment with the primary key could not be found
	 */
	@Override
	public SezStatusAppPayment findByPrimaryKey(long sezStatusAppPaymentId)
		throws NoSuchSezStatusAppPaymentException {

		return findByPrimaryKey((Serializable)sezStatusAppPaymentId);
	}

	/**
	 * Returns the sez status app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStatusAppPaymentId the primary key of the sez status app payment
	 * @return the sez status app payment, or <code>null</code> if a sez status app payment with the primary key could not be found
	 */
	@Override
	public SezStatusAppPayment fetchByPrimaryKey(long sezStatusAppPaymentId) {
		return fetchByPrimaryKey((Serializable)sezStatusAppPaymentId);
	}

	/**
	 * Returns all the sez status app payments.
	 *
	 * @return the sez status app payments
	 */
	@Override
	public List<SezStatusAppPayment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status app payments
	 * @param end the upper bound of the range of sez status app payments (not inclusive)
	 * @return the range of sez status app payments
	 */
	@Override
	public List<SezStatusAppPayment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status app payments
	 * @param end the upper bound of the range of sez status app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status app payments
	 */
	@Override
	public List<SezStatusAppPayment> findAll(
		int start, int end,
		OrderByComparator<SezStatusAppPayment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status app payments
	 * @param end the upper bound of the range of sez status app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status app payments
	 */
	@Override
	public List<SezStatusAppPayment> findAll(
		int start, int end,
		OrderByComparator<SezStatusAppPayment> orderByComparator,
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

		List<SezStatusAppPayment> list = null;

		if (useFinderCache) {
			list = (List<SezStatusAppPayment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZSTATUSAPPPAYMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZSTATUSAPPPAYMENT;

				sql = sql.concat(SezStatusAppPaymentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezStatusAppPayment>)QueryUtil.list(
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
	 * Removes all the sez status app payments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezStatusAppPayment sezStatusAppPayment : findAll()) {
			remove(sezStatusAppPayment);
		}
	}

	/**
	 * Returns the number of sez status app payments.
	 *
	 * @return the number of sez status app payments
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
					_SQL_COUNT_SEZSTATUSAPPPAYMENT);

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
		return "sezStatusAppPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZSTATUSAPPPAYMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezStatusAppPaymentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez status app payment persistence.
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

		SezStatusAppPaymentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezStatusAppPaymentUtil.setPersistence(null);

		entityCache.removeCache(SezStatusAppPaymentImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZSTATUSAPPPAYMENT =
		"SELECT sezStatusAppPayment FROM SezStatusAppPayment sezStatusAppPayment";

	private static final String _SQL_SELECT_SEZSTATUSAPPPAYMENT_WHERE =
		"SELECT sezStatusAppPayment FROM SezStatusAppPayment sezStatusAppPayment WHERE ";

	private static final String _SQL_COUNT_SEZSTATUSAPPPAYMENT =
		"SELECT COUNT(sezStatusAppPayment) FROM SezStatusAppPayment sezStatusAppPayment";

	private static final String _SQL_COUNT_SEZSTATUSAPPPAYMENT_WHERE =
		"SELECT COUNT(sezStatusAppPayment) FROM SezStatusAppPayment sezStatusAppPayment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "sezStatusAppPayment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezStatusAppPayment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezStatusAppPayment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezStatusAppPaymentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}