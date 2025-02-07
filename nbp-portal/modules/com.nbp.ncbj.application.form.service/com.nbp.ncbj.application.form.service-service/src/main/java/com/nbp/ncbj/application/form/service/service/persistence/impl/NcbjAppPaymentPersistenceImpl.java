/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence.impl;

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

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjAppPaymentException;
import com.nbp.ncbj.application.form.service.model.NcbjAppPayment;
import com.nbp.ncbj.application.form.service.model.NcbjAppPaymentTable;
import com.nbp.ncbj.application.form.service.model.impl.NcbjAppPaymentImpl;
import com.nbp.ncbj.application.form.service.model.impl.NcbjAppPaymentModelImpl;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjAppPaymentPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjAppPaymentUtil;
import com.nbp.ncbj.application.form.service.service.persistence.impl.constants.FOOPersistenceConstants;

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
 * The persistence implementation for the ncbj app payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjAppPaymentPersistence.class)
public class NcbjAppPaymentPersistenceImpl
	extends BasePersistenceImpl<NcbjAppPayment>
	implements NcbjAppPaymentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjAppPaymentUtil</code> to access the ncbj app payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjAppPaymentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetNcbjAppById;
	private FinderPath _finderPathCountBygetNcbjAppById;

	/**
	 * Returns the ncbj app payment where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjAppPaymentException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj app payment
	 * @throws NoSuchNcbjAppPaymentException if a matching ncbj app payment could not be found
	 */
	@Override
	public NcbjAppPayment findBygetNcbjAppById(long ncbjApplicationId)
		throws NoSuchNcbjAppPaymentException {

		NcbjAppPayment ncbjAppPayment = fetchBygetNcbjAppById(
			ncbjApplicationId);

		if (ncbjAppPayment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncbjApplicationId=");
			sb.append(ncbjApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjAppPaymentException(sb.toString());
		}

		return ncbjAppPayment;
	}

	/**
	 * Returns the ncbj app payment where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj app payment, or <code>null</code> if a matching ncbj app payment could not be found
	 */
	@Override
	public NcbjAppPayment fetchBygetNcbjAppById(long ncbjApplicationId) {
		return fetchBygetNcbjAppById(ncbjApplicationId, true);
	}

	/**
	 * Returns the ncbj app payment where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj app payment, or <code>null</code> if a matching ncbj app payment could not be found
	 */
	@Override
	public NcbjAppPayment fetchBygetNcbjAppById(
		long ncbjApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ncbjApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNcbjAppById, finderArgs, this);
		}

		if (result instanceof NcbjAppPayment) {
			NcbjAppPayment ncbjAppPayment = (NcbjAppPayment)result;

			if (ncbjApplicationId != ncbjAppPayment.getNcbjApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJAPPPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJAPPBYID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				List<NcbjAppPayment> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcbjAppById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {ncbjApplicationId};
							}

							_log.warn(
								"NcbjAppPaymentPersistenceImpl.fetchBygetNcbjAppById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjAppPayment ncbjAppPayment = list.get(0);

					result = ncbjAppPayment;

					cacheResult(ncbjAppPayment);
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
			return (NcbjAppPayment)result;
		}
	}

	/**
	 * Removes the ncbj app payment where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj app payment that was removed
	 */
	@Override
	public NcbjAppPayment removeBygetNcbjAppById(long ncbjApplicationId)
		throws NoSuchNcbjAppPaymentException {

		NcbjAppPayment ncbjAppPayment = findBygetNcbjAppById(ncbjApplicationId);

		return remove(ncbjAppPayment);
	}

	/**
	 * Returns the number of ncbj app payments where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj app payments
	 */
	@Override
	public int countBygetNcbjAppById(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNcbjAppById;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJAPPPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJAPPBYID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

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
		_FINDER_COLUMN_GETNCBJAPPBYID_NCBJAPPLICATIONID_2 =
			"ncbjAppPayment.ncbjApplicationId = ?";

	public NcbjAppPaymentPersistenceImpl() {
		setModelClass(NcbjAppPayment.class);

		setModelImplClass(NcbjAppPaymentImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjAppPaymentTable.INSTANCE);
	}

	/**
	 * Caches the ncbj app payment in the entity cache if it is enabled.
	 *
	 * @param ncbjAppPayment the ncbj app payment
	 */
	@Override
	public void cacheResult(NcbjAppPayment ncbjAppPayment) {
		entityCache.putResult(
			NcbjAppPaymentImpl.class, ncbjAppPayment.getPrimaryKey(),
			ncbjAppPayment);

		finderCache.putResult(
			_finderPathFetchBygetNcbjAppById,
			new Object[] {ncbjAppPayment.getNcbjApplicationId()},
			ncbjAppPayment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj app payments in the entity cache if it is enabled.
	 *
	 * @param ncbjAppPayments the ncbj app payments
	 */
	@Override
	public void cacheResult(List<NcbjAppPayment> ncbjAppPayments) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjAppPayments.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjAppPayment ncbjAppPayment : ncbjAppPayments) {
			if (entityCache.getResult(
					NcbjAppPaymentImpl.class, ncbjAppPayment.getPrimaryKey()) ==
						null) {

				cacheResult(ncbjAppPayment);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj app payments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjAppPaymentImpl.class);

		finderCache.clearCache(NcbjAppPaymentImpl.class);
	}

	/**
	 * Clears the cache for the ncbj app payment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjAppPayment ncbjAppPayment) {
		entityCache.removeResult(NcbjAppPaymentImpl.class, ncbjAppPayment);
	}

	@Override
	public void clearCache(List<NcbjAppPayment> ncbjAppPayments) {
		for (NcbjAppPayment ncbjAppPayment : ncbjAppPayments) {
			entityCache.removeResult(NcbjAppPaymentImpl.class, ncbjAppPayment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjAppPaymentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(NcbjAppPaymentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjAppPaymentModelImpl ncbjAppPaymentModelImpl) {

		Object[] args = new Object[] {
			ncbjAppPaymentModelImpl.getNcbjApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetNcbjAppById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcbjAppById, args, ncbjAppPaymentModelImpl);
	}

	/**
	 * Creates a new ncbj app payment with the primary key. Does not add the ncbj app payment to the database.
	 *
	 * @param ncbjAppPaymentId the primary key for the new ncbj app payment
	 * @return the new ncbj app payment
	 */
	@Override
	public NcbjAppPayment create(long ncbjAppPaymentId) {
		NcbjAppPayment ncbjAppPayment = new NcbjAppPaymentImpl();

		ncbjAppPayment.setNew(true);
		ncbjAppPayment.setPrimaryKey(ncbjAppPaymentId);

		ncbjAppPayment.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjAppPayment;
	}

	/**
	 * Removes the ncbj app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjAppPaymentId the primary key of the ncbj app payment
	 * @return the ncbj app payment that was removed
	 * @throws NoSuchNcbjAppPaymentException if a ncbj app payment with the primary key could not be found
	 */
	@Override
	public NcbjAppPayment remove(long ncbjAppPaymentId)
		throws NoSuchNcbjAppPaymentException {

		return remove((Serializable)ncbjAppPaymentId);
	}

	/**
	 * Removes the ncbj app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj app payment
	 * @return the ncbj app payment that was removed
	 * @throws NoSuchNcbjAppPaymentException if a ncbj app payment with the primary key could not be found
	 */
	@Override
	public NcbjAppPayment remove(Serializable primaryKey)
		throws NoSuchNcbjAppPaymentException {

		Session session = null;

		try {
			session = openSession();

			NcbjAppPayment ncbjAppPayment = (NcbjAppPayment)session.get(
				NcbjAppPaymentImpl.class, primaryKey);

			if (ncbjAppPayment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjAppPaymentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjAppPayment);
		}
		catch (NoSuchNcbjAppPaymentException noSuchEntityException) {
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
	protected NcbjAppPayment removeImpl(NcbjAppPayment ncbjAppPayment) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjAppPayment)) {
				ncbjAppPayment = (NcbjAppPayment)session.get(
					NcbjAppPaymentImpl.class,
					ncbjAppPayment.getPrimaryKeyObj());
			}

			if (ncbjAppPayment != null) {
				session.delete(ncbjAppPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjAppPayment != null) {
			clearCache(ncbjAppPayment);
		}

		return ncbjAppPayment;
	}

	@Override
	public NcbjAppPayment updateImpl(NcbjAppPayment ncbjAppPayment) {
		boolean isNew = ncbjAppPayment.isNew();

		if (!(ncbjAppPayment instanceof NcbjAppPaymentModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjAppPayment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjAppPayment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjAppPayment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjAppPayment implementation " +
					ncbjAppPayment.getClass());
		}

		NcbjAppPaymentModelImpl ncbjAppPaymentModelImpl =
			(NcbjAppPaymentModelImpl)ncbjAppPayment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjAppPayment.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjAppPayment.setCreateDate(date);
			}
			else {
				ncbjAppPayment.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjAppPaymentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjAppPayment.setModifiedDate(date);
			}
			else {
				ncbjAppPayment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjAppPayment);
			}
			else {
				ncbjAppPayment = (NcbjAppPayment)session.merge(ncbjAppPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjAppPaymentImpl.class, ncbjAppPaymentModelImpl, false, true);

		cacheUniqueFindersCache(ncbjAppPaymentModelImpl);

		if (isNew) {
			ncbjAppPayment.setNew(false);
		}

		ncbjAppPayment.resetOriginalValues();

		return ncbjAppPayment;
	}

	/**
	 * Returns the ncbj app payment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj app payment
	 * @return the ncbj app payment
	 * @throws NoSuchNcbjAppPaymentException if a ncbj app payment with the primary key could not be found
	 */
	@Override
	public NcbjAppPayment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjAppPaymentException {

		NcbjAppPayment ncbjAppPayment = fetchByPrimaryKey(primaryKey);

		if (ncbjAppPayment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjAppPaymentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjAppPayment;
	}

	/**
	 * Returns the ncbj app payment with the primary key or throws a <code>NoSuchNcbjAppPaymentException</code> if it could not be found.
	 *
	 * @param ncbjAppPaymentId the primary key of the ncbj app payment
	 * @return the ncbj app payment
	 * @throws NoSuchNcbjAppPaymentException if a ncbj app payment with the primary key could not be found
	 */
	@Override
	public NcbjAppPayment findByPrimaryKey(long ncbjAppPaymentId)
		throws NoSuchNcbjAppPaymentException {

		return findByPrimaryKey((Serializable)ncbjAppPaymentId);
	}

	/**
	 * Returns the ncbj app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjAppPaymentId the primary key of the ncbj app payment
	 * @return the ncbj app payment, or <code>null</code> if a ncbj app payment with the primary key could not be found
	 */
	@Override
	public NcbjAppPayment fetchByPrimaryKey(long ncbjAppPaymentId) {
		return fetchByPrimaryKey((Serializable)ncbjAppPaymentId);
	}

	/**
	 * Returns all the ncbj app payments.
	 *
	 * @return the ncbj app payments
	 */
	@Override
	public List<NcbjAppPayment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj app payments
	 * @param end the upper bound of the range of ncbj app payments (not inclusive)
	 * @return the range of ncbj app payments
	 */
	@Override
	public List<NcbjAppPayment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj app payments
	 * @param end the upper bound of the range of ncbj app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj app payments
	 */
	@Override
	public List<NcbjAppPayment> findAll(
		int start, int end,
		OrderByComparator<NcbjAppPayment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj app payments
	 * @param end the upper bound of the range of ncbj app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj app payments
	 */
	@Override
	public List<NcbjAppPayment> findAll(
		int start, int end, OrderByComparator<NcbjAppPayment> orderByComparator,
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

		List<NcbjAppPayment> list = null;

		if (useFinderCache) {
			list = (List<NcbjAppPayment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJAPPPAYMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJAPPPAYMENT;

				sql = sql.concat(NcbjAppPaymentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjAppPayment>)QueryUtil.list(
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
	 * Removes all the ncbj app payments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjAppPayment ncbjAppPayment : findAll()) {
			remove(ncbjAppPayment);
		}
	}

	/**
	 * Returns the number of ncbj app payments.
	 *
	 * @return the number of ncbj app payments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NCBJAPPPAYMENT);

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
		return "ncbjAppPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJAPPPAYMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjAppPaymentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj app payment persistence.
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

		_finderPathFetchBygetNcbjAppById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcbjAppById",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, true);

		_finderPathCountBygetNcbjAppById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNcbjAppById",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, false);

		NcbjAppPaymentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjAppPaymentUtil.setPersistence(null);

		entityCache.removeCache(NcbjAppPaymentImpl.class.getName());
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCBJAPPPAYMENT =
		"SELECT ncbjAppPayment FROM NcbjAppPayment ncbjAppPayment";

	private static final String _SQL_SELECT_NCBJAPPPAYMENT_WHERE =
		"SELECT ncbjAppPayment FROM NcbjAppPayment ncbjAppPayment WHERE ";

	private static final String _SQL_COUNT_NCBJAPPPAYMENT =
		"SELECT COUNT(ncbjAppPayment) FROM NcbjAppPayment ncbjAppPayment";

	private static final String _SQL_COUNT_NCBJAPPPAYMENT_WHERE =
		"SELECT COUNT(ncbjAppPayment) FROM NcbjAppPayment ncbjAppPayment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ncbjAppPayment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjAppPayment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjAppPayment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjAppPaymentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}