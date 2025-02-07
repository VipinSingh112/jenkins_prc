/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.persistence.impl;

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

import com.nbp.fire.brigade.application.form.service.exception.NoSuchFireBrigadeAppPaymentException;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeAppPayment;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeAppPaymentTable;
import com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeAppPaymentImpl;
import com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeAppPaymentModelImpl;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeAppPaymentPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeAppPaymentUtil;
import com.nbp.fire.brigade.application.form.service.service.persistence.impl.constants.FIRE_BRIGADEPersistenceConstants;

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
 * The persistence implementation for the fire brigade app payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FireBrigadeAppPaymentPersistence.class)
public class FireBrigadeAppPaymentPersistenceImpl
	extends BasePersistenceImpl<FireBrigadeAppPayment>
	implements FireBrigadeAppPaymentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FireBrigadeAppPaymentUtil</code> to access the fire brigade app payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FireBrigadeAppPaymentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchByfireBrigadeApplicationId;
	private FinderPath _finderPathCountByfireBrigadeApplicationId;

	/**
	 * Returns the fire brigade app payment where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeAppPaymentException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade app payment
	 * @throws NoSuchFireBrigadeAppPaymentException if a matching fire brigade app payment could not be found
	 */
	@Override
	public FireBrigadeAppPayment findByfireBrigadeApplicationId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeAppPaymentException {

		FireBrigadeAppPayment fireBrigadeAppPayment =
			fetchByfireBrigadeApplicationId(fireBrigadeApplicationId);

		if (fireBrigadeAppPayment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("fireBrigadeApplicationId=");
			sb.append(fireBrigadeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFireBrigadeAppPaymentException(sb.toString());
		}

		return fireBrigadeAppPayment;
	}

	/**
	 * Returns the fire brigade app payment where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade app payment, or <code>null</code> if a matching fire brigade app payment could not be found
	 */
	@Override
	public FireBrigadeAppPayment fetchByfireBrigadeApplicationId(
		long fireBrigadeApplicationId) {

		return fetchByfireBrigadeApplicationId(fireBrigadeApplicationId, true);
	}

	/**
	 * Returns the fire brigade app payment where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade app payment, or <code>null</code> if a matching fire brigade app payment could not be found
	 */
	@Override
	public FireBrigadeAppPayment fetchByfireBrigadeApplicationId(
		long fireBrigadeApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {fireBrigadeApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByfireBrigadeApplicationId, finderArgs, this);
		}

		if (result instanceof FireBrigadeAppPayment) {
			FireBrigadeAppPayment fireBrigadeAppPayment =
				(FireBrigadeAppPayment)result;

			if (fireBrigadeApplicationId !=
					fireBrigadeAppPayment.getFireBrigadeApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FIREBRIGADEAPPPAYMENT_WHERE);

			sb.append(
				_FINDER_COLUMN_FIREBRIGADEAPPLICATIONID_FIREBRIGADEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(fireBrigadeApplicationId);

				List<FireBrigadeAppPayment> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByfireBrigadeApplicationId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									fireBrigadeApplicationId
								};
							}

							_log.warn(
								"FireBrigadeAppPaymentPersistenceImpl.fetchByfireBrigadeApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FireBrigadeAppPayment fireBrigadeAppPayment = list.get(0);

					result = fireBrigadeAppPayment;

					cacheResult(fireBrigadeAppPayment);
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
			return (FireBrigadeAppPayment)result;
		}
	}

	/**
	 * Removes the fire brigade app payment where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade app payment that was removed
	 */
	@Override
	public FireBrigadeAppPayment removeByfireBrigadeApplicationId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeAppPaymentException {

		FireBrigadeAppPayment fireBrigadeAppPayment =
			findByfireBrigadeApplicationId(fireBrigadeApplicationId);

		return remove(fireBrigadeAppPayment);
	}

	/**
	 * Returns the number of fire brigade app payments where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade app payments
	 */
	@Override
	public int countByfireBrigadeApplicationId(long fireBrigadeApplicationId) {
		FinderPath finderPath = _finderPathCountByfireBrigadeApplicationId;

		Object[] finderArgs = new Object[] {fireBrigadeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPPAYMENT_WHERE);

			sb.append(
				_FINDER_COLUMN_FIREBRIGADEAPPLICATIONID_FIREBRIGADEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(fireBrigadeApplicationId);

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
		_FINDER_COLUMN_FIREBRIGADEAPPLICATIONID_FIREBRIGADEAPPLICATIONID_2 =
			"fireBrigadeAppPayment.fireBrigadeApplicationId = ?";

	public FireBrigadeAppPaymentPersistenceImpl() {
		setModelClass(FireBrigadeAppPayment.class);

		setModelImplClass(FireBrigadeAppPaymentImpl.class);
		setModelPKClass(long.class);

		setTable(FireBrigadeAppPaymentTable.INSTANCE);
	}

	/**
	 * Caches the fire brigade app payment in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeAppPayment the fire brigade app payment
	 */
	@Override
	public void cacheResult(FireBrigadeAppPayment fireBrigadeAppPayment) {
		entityCache.putResult(
			FireBrigadeAppPaymentImpl.class,
			fireBrigadeAppPayment.getPrimaryKey(), fireBrigadeAppPayment);

		finderCache.putResult(
			_finderPathFetchByfireBrigadeApplicationId,
			new Object[] {fireBrigadeAppPayment.getFireBrigadeApplicationId()},
			fireBrigadeAppPayment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the fire brigade app payments in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeAppPayments the fire brigade app payments
	 */
	@Override
	public void cacheResult(
		List<FireBrigadeAppPayment> fireBrigadeAppPayments) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fireBrigadeAppPayments.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FireBrigadeAppPayment fireBrigadeAppPayment :
				fireBrigadeAppPayments) {

			if (entityCache.getResult(
					FireBrigadeAppPaymentImpl.class,
					fireBrigadeAppPayment.getPrimaryKey()) == null) {

				cacheResult(fireBrigadeAppPayment);
			}
		}
	}

	/**
	 * Clears the cache for all fire brigade app payments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FireBrigadeAppPaymentImpl.class);

		finderCache.clearCache(FireBrigadeAppPaymentImpl.class);
	}

	/**
	 * Clears the cache for the fire brigade app payment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FireBrigadeAppPayment fireBrigadeAppPayment) {
		entityCache.removeResult(
			FireBrigadeAppPaymentImpl.class, fireBrigadeAppPayment);
	}

	@Override
	public void clearCache(List<FireBrigadeAppPayment> fireBrigadeAppPayments) {
		for (FireBrigadeAppPayment fireBrigadeAppPayment :
				fireBrigadeAppPayments) {

			entityCache.removeResult(
				FireBrigadeAppPaymentImpl.class, fireBrigadeAppPayment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FireBrigadeAppPaymentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FireBrigadeAppPaymentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FireBrigadeAppPaymentModelImpl fireBrigadeAppPaymentModelImpl) {

		Object[] args = new Object[] {
			fireBrigadeAppPaymentModelImpl.getFireBrigadeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountByfireBrigadeApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByfireBrigadeApplicationId, args,
			fireBrigadeAppPaymentModelImpl);
	}

	/**
	 * Creates a new fire brigade app payment with the primary key. Does not add the fire brigade app payment to the database.
	 *
	 * @param fireBrigadeAppPaymentId the primary key for the new fire brigade app payment
	 * @return the new fire brigade app payment
	 */
	@Override
	public FireBrigadeAppPayment create(long fireBrigadeAppPaymentId) {
		FireBrigadeAppPayment fireBrigadeAppPayment =
			new FireBrigadeAppPaymentImpl();

		fireBrigadeAppPayment.setNew(true);
		fireBrigadeAppPayment.setPrimaryKey(fireBrigadeAppPaymentId);

		fireBrigadeAppPayment.setCompanyId(CompanyThreadLocal.getCompanyId());

		return fireBrigadeAppPayment;
	}

	/**
	 * Removes the fire brigade app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeAppPaymentId the primary key of the fire brigade app payment
	 * @return the fire brigade app payment that was removed
	 * @throws NoSuchFireBrigadeAppPaymentException if a fire brigade app payment with the primary key could not be found
	 */
	@Override
	public FireBrigadeAppPayment remove(long fireBrigadeAppPaymentId)
		throws NoSuchFireBrigadeAppPaymentException {

		return remove((Serializable)fireBrigadeAppPaymentId);
	}

	/**
	 * Removes the fire brigade app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fire brigade app payment
	 * @return the fire brigade app payment that was removed
	 * @throws NoSuchFireBrigadeAppPaymentException if a fire brigade app payment with the primary key could not be found
	 */
	@Override
	public FireBrigadeAppPayment remove(Serializable primaryKey)
		throws NoSuchFireBrigadeAppPaymentException {

		Session session = null;

		try {
			session = openSession();

			FireBrigadeAppPayment fireBrigadeAppPayment =
				(FireBrigadeAppPayment)session.get(
					FireBrigadeAppPaymentImpl.class, primaryKey);

			if (fireBrigadeAppPayment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFireBrigadeAppPaymentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(fireBrigadeAppPayment);
		}
		catch (NoSuchFireBrigadeAppPaymentException noSuchEntityException) {
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
	protected FireBrigadeAppPayment removeImpl(
		FireBrigadeAppPayment fireBrigadeAppPayment) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fireBrigadeAppPayment)) {
				fireBrigadeAppPayment = (FireBrigadeAppPayment)session.get(
					FireBrigadeAppPaymentImpl.class,
					fireBrigadeAppPayment.getPrimaryKeyObj());
			}

			if (fireBrigadeAppPayment != null) {
				session.delete(fireBrigadeAppPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (fireBrigadeAppPayment != null) {
			clearCache(fireBrigadeAppPayment);
		}

		return fireBrigadeAppPayment;
	}

	@Override
	public FireBrigadeAppPayment updateImpl(
		FireBrigadeAppPayment fireBrigadeAppPayment) {

		boolean isNew = fireBrigadeAppPayment.isNew();

		if (!(fireBrigadeAppPayment instanceof
				FireBrigadeAppPaymentModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(fireBrigadeAppPayment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					fireBrigadeAppPayment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in fireBrigadeAppPayment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FireBrigadeAppPayment implementation " +
					fireBrigadeAppPayment.getClass());
		}

		FireBrigadeAppPaymentModelImpl fireBrigadeAppPaymentModelImpl =
			(FireBrigadeAppPaymentModelImpl)fireBrigadeAppPayment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (fireBrigadeAppPayment.getCreateDate() == null)) {
			if (serviceContext == null) {
				fireBrigadeAppPayment.setCreateDate(date);
			}
			else {
				fireBrigadeAppPayment.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!fireBrigadeAppPaymentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				fireBrigadeAppPayment.setModifiedDate(date);
			}
			else {
				fireBrigadeAppPayment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(fireBrigadeAppPayment);
			}
			else {
				fireBrigadeAppPayment = (FireBrigadeAppPayment)session.merge(
					fireBrigadeAppPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FireBrigadeAppPaymentImpl.class, fireBrigadeAppPaymentModelImpl,
			false, true);

		cacheUniqueFindersCache(fireBrigadeAppPaymentModelImpl);

		if (isNew) {
			fireBrigadeAppPayment.setNew(false);
		}

		fireBrigadeAppPayment.resetOriginalValues();

		return fireBrigadeAppPayment;
	}

	/**
	 * Returns the fire brigade app payment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fire brigade app payment
	 * @return the fire brigade app payment
	 * @throws NoSuchFireBrigadeAppPaymentException if a fire brigade app payment with the primary key could not be found
	 */
	@Override
	public FireBrigadeAppPayment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFireBrigadeAppPaymentException {

		FireBrigadeAppPayment fireBrigadeAppPayment = fetchByPrimaryKey(
			primaryKey);

		if (fireBrigadeAppPayment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFireBrigadeAppPaymentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return fireBrigadeAppPayment;
	}

	/**
	 * Returns the fire brigade app payment with the primary key or throws a <code>NoSuchFireBrigadeAppPaymentException</code> if it could not be found.
	 *
	 * @param fireBrigadeAppPaymentId the primary key of the fire brigade app payment
	 * @return the fire brigade app payment
	 * @throws NoSuchFireBrigadeAppPaymentException if a fire brigade app payment with the primary key could not be found
	 */
	@Override
	public FireBrigadeAppPayment findByPrimaryKey(long fireBrigadeAppPaymentId)
		throws NoSuchFireBrigadeAppPaymentException {

		return findByPrimaryKey((Serializable)fireBrigadeAppPaymentId);
	}

	/**
	 * Returns the fire brigade app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeAppPaymentId the primary key of the fire brigade app payment
	 * @return the fire brigade app payment, or <code>null</code> if a fire brigade app payment with the primary key could not be found
	 */
	@Override
	public FireBrigadeAppPayment fetchByPrimaryKey(
		long fireBrigadeAppPaymentId) {

		return fetchByPrimaryKey((Serializable)fireBrigadeAppPaymentId);
	}

	/**
	 * Returns all the fire brigade app payments.
	 *
	 * @return the fire brigade app payments
	 */
	@Override
	public List<FireBrigadeAppPayment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade app payments
	 * @param end the upper bound of the range of fire brigade app payments (not inclusive)
	 * @return the range of fire brigade app payments
	 */
	@Override
	public List<FireBrigadeAppPayment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade app payments
	 * @param end the upper bound of the range of fire brigade app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade app payments
	 */
	@Override
	public List<FireBrigadeAppPayment> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeAppPayment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade app payments
	 * @param end the upper bound of the range of fire brigade app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade app payments
	 */
	@Override
	public List<FireBrigadeAppPayment> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeAppPayment> orderByComparator,
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

		List<FireBrigadeAppPayment> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeAppPayment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FIREBRIGADEAPPPAYMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FIREBRIGADEAPPPAYMENT;

				sql = sql.concat(FireBrigadeAppPaymentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FireBrigadeAppPayment>)QueryUtil.list(
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
	 * Removes all the fire brigade app payments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FireBrigadeAppPayment fireBrigadeAppPayment : findAll()) {
			remove(fireBrigadeAppPayment);
		}
	}

	/**
	 * Returns the number of fire brigade app payments.
	 *
	 * @return the number of fire brigade app payments
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
					_SQL_COUNT_FIREBRIGADEAPPPAYMENT);

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
		return "fireBrigadeAppPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FIREBRIGADEAPPPAYMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FireBrigadeAppPaymentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the fire brigade app payment persistence.
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

		_finderPathFetchByfireBrigadeApplicationId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByfireBrigadeApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"fireBrigadeApplicationId"}, true);

		_finderPathCountByfireBrigadeApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByfireBrigadeApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"fireBrigadeApplicationId"}, false);

		FireBrigadeAppPaymentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FireBrigadeAppPaymentUtil.setPersistence(null);

		entityCache.removeCache(FireBrigadeAppPaymentImpl.class.getName());
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FIREBRIGADEAPPPAYMENT =
		"SELECT fireBrigadeAppPayment FROM FireBrigadeAppPayment fireBrigadeAppPayment";

	private static final String _SQL_SELECT_FIREBRIGADEAPPPAYMENT_WHERE =
		"SELECT fireBrigadeAppPayment FROM FireBrigadeAppPayment fireBrigadeAppPayment WHERE ";

	private static final String _SQL_COUNT_FIREBRIGADEAPPPAYMENT =
		"SELECT COUNT(fireBrigadeAppPayment) FROM FireBrigadeAppPayment fireBrigadeAppPayment";

	private static final String _SQL_COUNT_FIREBRIGADEAPPPAYMENT_WHERE =
		"SELECT COUNT(fireBrigadeAppPayment) FROM FireBrigadeAppPayment fireBrigadeAppPayment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"fireBrigadeAppPayment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FireBrigadeAppPayment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FireBrigadeAppPayment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FireBrigadeAppPaymentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}