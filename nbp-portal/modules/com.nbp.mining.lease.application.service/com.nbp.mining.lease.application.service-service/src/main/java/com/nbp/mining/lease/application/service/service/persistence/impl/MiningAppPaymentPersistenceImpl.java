/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence.impl;

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

import com.nbp.mining.lease.application.service.exception.NoSuchMiningAppPaymentException;
import com.nbp.mining.lease.application.service.model.MiningAppPayment;
import com.nbp.mining.lease.application.service.model.MiningAppPaymentTable;
import com.nbp.mining.lease.application.service.model.impl.MiningAppPaymentImpl;
import com.nbp.mining.lease.application.service.model.impl.MiningAppPaymentModelImpl;
import com.nbp.mining.lease.application.service.service.persistence.MiningAppPaymentPersistence;
import com.nbp.mining.lease.application.service.service.persistence.MiningAppPaymentUtil;
import com.nbp.mining.lease.application.service.service.persistence.impl.constants.MINING_LEASE_APPLICATIONPersistenceConstants;

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
 * The persistence implementation for the mining app payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiningAppPaymentPersistence.class)
public class MiningAppPaymentPersistenceImpl
	extends BasePersistenceImpl<MiningAppPayment>
	implements MiningAppPaymentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiningAppPaymentUtil</code> to access the mining app payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiningAppPaymentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetMiningById;
	private FinderPath _finderPathCountBygetMiningById;

	/**
	 * Returns the mining app payment where miningLeaseApplicationId = &#63; or throws a <code>NoSuchMiningAppPaymentException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining app payment
	 * @throws NoSuchMiningAppPaymentException if a matching mining app payment could not be found
	 */
	@Override
	public MiningAppPayment findBygetMiningById(long miningLeaseApplicationId)
		throws NoSuchMiningAppPaymentException {

		MiningAppPayment miningAppPayment = fetchBygetMiningById(
			miningLeaseApplicationId);

		if (miningAppPayment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("miningLeaseApplicationId=");
			sb.append(miningLeaseApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiningAppPaymentException(sb.toString());
		}

		return miningAppPayment;
	}

	/**
	 * Returns the mining app payment where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining app payment, or <code>null</code> if a matching mining app payment could not be found
	 */
	@Override
	public MiningAppPayment fetchBygetMiningById(
		long miningLeaseApplicationId) {

		return fetchBygetMiningById(miningLeaseApplicationId, true);
	}

	/**
	 * Returns the mining app payment where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining app payment, or <code>null</code> if a matching mining app payment could not be found
	 */
	@Override
	public MiningAppPayment fetchBygetMiningById(
		long miningLeaseApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {miningLeaseApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMiningById, finderArgs, this);
		}

		if (result instanceof MiningAppPayment) {
			MiningAppPayment miningAppPayment = (MiningAppPayment)result;

			if (miningLeaseApplicationId !=
					miningAppPayment.getMiningLeaseApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MININGAPPPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETMININGBYID_MININGLEASEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miningLeaseApplicationId);

				List<MiningAppPayment> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMiningById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									miningLeaseApplicationId
								};
							}

							_log.warn(
								"MiningAppPaymentPersistenceImpl.fetchBygetMiningById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiningAppPayment miningAppPayment = list.get(0);

					result = miningAppPayment;

					cacheResult(miningAppPayment);
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
			return (MiningAppPayment)result;
		}
	}

	/**
	 * Removes the mining app payment where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the mining app payment that was removed
	 */
	@Override
	public MiningAppPayment removeBygetMiningById(long miningLeaseApplicationId)
		throws NoSuchMiningAppPaymentException {

		MiningAppPayment miningAppPayment = findBygetMiningById(
			miningLeaseApplicationId);

		return remove(miningAppPayment);
	}

	/**
	 * Returns the number of mining app payments where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining app payments
	 */
	@Override
	public int countBygetMiningById(long miningLeaseApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMiningById;

		Object[] finderArgs = new Object[] {miningLeaseApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGAPPPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETMININGBYID_MININGLEASEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miningLeaseApplicationId);

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
		_FINDER_COLUMN_GETMININGBYID_MININGLEASEAPPLICATIONID_2 =
			"miningAppPayment.miningLeaseApplicationId = ?";

	public MiningAppPaymentPersistenceImpl() {
		setModelClass(MiningAppPayment.class);

		setModelImplClass(MiningAppPaymentImpl.class);
		setModelPKClass(long.class);

		setTable(MiningAppPaymentTable.INSTANCE);
	}

	/**
	 * Caches the mining app payment in the entity cache if it is enabled.
	 *
	 * @param miningAppPayment the mining app payment
	 */
	@Override
	public void cacheResult(MiningAppPayment miningAppPayment) {
		entityCache.putResult(
			MiningAppPaymentImpl.class, miningAppPayment.getPrimaryKey(),
			miningAppPayment);

		finderCache.putResult(
			_finderPathFetchBygetMiningById,
			new Object[] {miningAppPayment.getMiningLeaseApplicationId()},
			miningAppPayment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the mining app payments in the entity cache if it is enabled.
	 *
	 * @param miningAppPayments the mining app payments
	 */
	@Override
	public void cacheResult(List<MiningAppPayment> miningAppPayments) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miningAppPayments.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiningAppPayment miningAppPayment : miningAppPayments) {
			if (entityCache.getResult(
					MiningAppPaymentImpl.class,
					miningAppPayment.getPrimaryKey()) == null) {

				cacheResult(miningAppPayment);
			}
		}
	}

	/**
	 * Clears the cache for all mining app payments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiningAppPaymentImpl.class);

		finderCache.clearCache(MiningAppPaymentImpl.class);
	}

	/**
	 * Clears the cache for the mining app payment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MiningAppPayment miningAppPayment) {
		entityCache.removeResult(MiningAppPaymentImpl.class, miningAppPayment);
	}

	@Override
	public void clearCache(List<MiningAppPayment> miningAppPayments) {
		for (MiningAppPayment miningAppPayment : miningAppPayments) {
			entityCache.removeResult(
				MiningAppPaymentImpl.class, miningAppPayment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiningAppPaymentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(MiningAppPaymentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MiningAppPaymentModelImpl miningAppPaymentModelImpl) {

		Object[] args = new Object[] {
			miningAppPaymentModelImpl.getMiningLeaseApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetMiningById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMiningById, args, miningAppPaymentModelImpl);
	}

	/**
	 * Creates a new mining app payment with the primary key. Does not add the mining app payment to the database.
	 *
	 * @param miningAppPaymentId the primary key for the new mining app payment
	 * @return the new mining app payment
	 */
	@Override
	public MiningAppPayment create(long miningAppPaymentId) {
		MiningAppPayment miningAppPayment = new MiningAppPaymentImpl();

		miningAppPayment.setNew(true);
		miningAppPayment.setPrimaryKey(miningAppPaymentId);

		miningAppPayment.setCompanyId(CompanyThreadLocal.getCompanyId());

		return miningAppPayment;
	}

	/**
	 * Removes the mining app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningAppPaymentId the primary key of the mining app payment
	 * @return the mining app payment that was removed
	 * @throws NoSuchMiningAppPaymentException if a mining app payment with the primary key could not be found
	 */
	@Override
	public MiningAppPayment remove(long miningAppPaymentId)
		throws NoSuchMiningAppPaymentException {

		return remove((Serializable)miningAppPaymentId);
	}

	/**
	 * Removes the mining app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mining app payment
	 * @return the mining app payment that was removed
	 * @throws NoSuchMiningAppPaymentException if a mining app payment with the primary key could not be found
	 */
	@Override
	public MiningAppPayment remove(Serializable primaryKey)
		throws NoSuchMiningAppPaymentException {

		Session session = null;

		try {
			session = openSession();

			MiningAppPayment miningAppPayment = (MiningAppPayment)session.get(
				MiningAppPaymentImpl.class, primaryKey);

			if (miningAppPayment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiningAppPaymentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miningAppPayment);
		}
		catch (NoSuchMiningAppPaymentException noSuchEntityException) {
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
	protected MiningAppPayment removeImpl(MiningAppPayment miningAppPayment) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miningAppPayment)) {
				miningAppPayment = (MiningAppPayment)session.get(
					MiningAppPaymentImpl.class,
					miningAppPayment.getPrimaryKeyObj());
			}

			if (miningAppPayment != null) {
				session.delete(miningAppPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miningAppPayment != null) {
			clearCache(miningAppPayment);
		}

		return miningAppPayment;
	}

	@Override
	public MiningAppPayment updateImpl(MiningAppPayment miningAppPayment) {
		boolean isNew = miningAppPayment.isNew();

		if (!(miningAppPayment instanceof MiningAppPaymentModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(miningAppPayment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					miningAppPayment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miningAppPayment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiningAppPayment implementation " +
					miningAppPayment.getClass());
		}

		MiningAppPaymentModelImpl miningAppPaymentModelImpl =
			(MiningAppPaymentModelImpl)miningAppPayment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (miningAppPayment.getCreateDate() == null)) {
			if (serviceContext == null) {
				miningAppPayment.setCreateDate(date);
			}
			else {
				miningAppPayment.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!miningAppPaymentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				miningAppPayment.setModifiedDate(date);
			}
			else {
				miningAppPayment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miningAppPayment);
			}
			else {
				miningAppPayment = (MiningAppPayment)session.merge(
					miningAppPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MiningAppPaymentImpl.class, miningAppPaymentModelImpl, false, true);

		cacheUniqueFindersCache(miningAppPaymentModelImpl);

		if (isNew) {
			miningAppPayment.setNew(false);
		}

		miningAppPayment.resetOriginalValues();

		return miningAppPayment;
	}

	/**
	 * Returns the mining app payment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mining app payment
	 * @return the mining app payment
	 * @throws NoSuchMiningAppPaymentException if a mining app payment with the primary key could not be found
	 */
	@Override
	public MiningAppPayment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMiningAppPaymentException {

		MiningAppPayment miningAppPayment = fetchByPrimaryKey(primaryKey);

		if (miningAppPayment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiningAppPaymentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miningAppPayment;
	}

	/**
	 * Returns the mining app payment with the primary key or throws a <code>NoSuchMiningAppPaymentException</code> if it could not be found.
	 *
	 * @param miningAppPaymentId the primary key of the mining app payment
	 * @return the mining app payment
	 * @throws NoSuchMiningAppPaymentException if a mining app payment with the primary key could not be found
	 */
	@Override
	public MiningAppPayment findByPrimaryKey(long miningAppPaymentId)
		throws NoSuchMiningAppPaymentException {

		return findByPrimaryKey((Serializable)miningAppPaymentId);
	}

	/**
	 * Returns the mining app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningAppPaymentId the primary key of the mining app payment
	 * @return the mining app payment, or <code>null</code> if a mining app payment with the primary key could not be found
	 */
	@Override
	public MiningAppPayment fetchByPrimaryKey(long miningAppPaymentId) {
		return fetchByPrimaryKey((Serializable)miningAppPaymentId);
	}

	/**
	 * Returns all the mining app payments.
	 *
	 * @return the mining app payments
	 */
	@Override
	public List<MiningAppPayment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining app payments
	 * @param end the upper bound of the range of mining app payments (not inclusive)
	 * @return the range of mining app payments
	 */
	@Override
	public List<MiningAppPayment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining app payments
	 * @param end the upper bound of the range of mining app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining app payments
	 */
	@Override
	public List<MiningAppPayment> findAll(
		int start, int end,
		OrderByComparator<MiningAppPayment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining app payments
	 * @param end the upper bound of the range of mining app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining app payments
	 */
	@Override
	public List<MiningAppPayment> findAll(
		int start, int end,
		OrderByComparator<MiningAppPayment> orderByComparator,
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

		List<MiningAppPayment> list = null;

		if (useFinderCache) {
			list = (List<MiningAppPayment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MININGAPPPAYMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MININGAPPPAYMENT;

				sql = sql.concat(MiningAppPaymentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MiningAppPayment>)QueryUtil.list(
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
	 * Removes all the mining app payments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiningAppPayment miningAppPayment : findAll()) {
			remove(miningAppPayment);
		}
	}

	/**
	 * Returns the number of mining app payments.
	 *
	 * @return the number of mining app payments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_MININGAPPPAYMENT);

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
		return "miningAppPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MININGAPPPAYMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiningAppPaymentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the mining app payment persistence.
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

		_finderPathFetchBygetMiningById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMiningById",
			new String[] {Long.class.getName()},
			new String[] {"miningLeaseApplicationId"}, true);

		_finderPathCountBygetMiningById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMiningById",
			new String[] {Long.class.getName()},
			new String[] {"miningLeaseApplicationId"}, false);

		MiningAppPaymentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiningAppPaymentUtil.setPersistence(null);

		entityCache.removeCache(MiningAppPaymentImpl.class.getName());
	}

	@Override
	@Reference(
		target = MINING_LEASE_APPLICATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MINING_LEASE_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MINING_LEASE_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MININGAPPPAYMENT =
		"SELECT miningAppPayment FROM MiningAppPayment miningAppPayment";

	private static final String _SQL_SELECT_MININGAPPPAYMENT_WHERE =
		"SELECT miningAppPayment FROM MiningAppPayment miningAppPayment WHERE ";

	private static final String _SQL_COUNT_MININGAPPPAYMENT =
		"SELECT COUNT(miningAppPayment) FROM MiningAppPayment miningAppPayment";

	private static final String _SQL_COUNT_MININGAPPPAYMENT_WHERE =
		"SELECT COUNT(miningAppPayment) FROM MiningAppPayment miningAppPayment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "miningAppPayment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiningAppPayment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MiningAppPayment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MiningAppPaymentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}