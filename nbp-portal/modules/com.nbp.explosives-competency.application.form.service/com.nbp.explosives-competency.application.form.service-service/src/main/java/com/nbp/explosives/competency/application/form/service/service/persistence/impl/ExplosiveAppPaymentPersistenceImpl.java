/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service.persistence.impl;

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

import com.nbp.explosives.competency.application.form.service.exception.NoSuchExplosiveAppPaymentException;
import com.nbp.explosives.competency.application.form.service.model.ExplosiveAppPayment;
import com.nbp.explosives.competency.application.form.service.model.ExplosiveAppPaymentTable;
import com.nbp.explosives.competency.application.form.service.model.impl.ExplosiveAppPaymentImpl;
import com.nbp.explosives.competency.application.form.service.model.impl.ExplosiveAppPaymentModelImpl;
import com.nbp.explosives.competency.application.form.service.service.persistence.ExplosiveAppPaymentPersistence;
import com.nbp.explosives.competency.application.form.service.service.persistence.ExplosiveAppPaymentUtil;
import com.nbp.explosives.competency.application.form.service.service.persistence.impl.constants.EXPLOSIVEPersistenceConstants;

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
 * The persistence implementation for the explosive app payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ExplosiveAppPaymentPersistence.class)
public class ExplosiveAppPaymentPersistenceImpl
	extends BasePersistenceImpl<ExplosiveAppPayment>
	implements ExplosiveAppPaymentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ExplosiveAppPaymentUtil</code> to access the explosive app payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ExplosiveAppPaymentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetExplosiveById;
	private FinderPath _finderPathCountBygetExplosiveById;

	/**
	 * Returns the explosive app payment where explosivesApplicationId = &#63; or throws a <code>NoSuchExplosiveAppPaymentException</code> if it could not be found.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching explosive app payment
	 * @throws NoSuchExplosiveAppPaymentException if a matching explosive app payment could not be found
	 */
	@Override
	public ExplosiveAppPayment findBygetExplosiveById(
			long explosivesApplicationId)
		throws NoSuchExplosiveAppPaymentException {

		ExplosiveAppPayment explosiveAppPayment = fetchBygetExplosiveById(
			explosivesApplicationId);

		if (explosiveAppPayment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("explosivesApplicationId=");
			sb.append(explosivesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchExplosiveAppPaymentException(sb.toString());
		}

		return explosiveAppPayment;
	}

	/**
	 * Returns the explosive app payment where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching explosive app payment, or <code>null</code> if a matching explosive app payment could not be found
	 */
	@Override
	public ExplosiveAppPayment fetchBygetExplosiveById(
		long explosivesApplicationId) {

		return fetchBygetExplosiveById(explosivesApplicationId, true);
	}

	/**
	 * Returns the explosive app payment where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive app payment, or <code>null</code> if a matching explosive app payment could not be found
	 */
	@Override
	public ExplosiveAppPayment fetchBygetExplosiveById(
		long explosivesApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {explosivesApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetExplosiveById, finderArgs, this);
		}

		if (result instanceof ExplosiveAppPayment) {
			ExplosiveAppPayment explosiveAppPayment =
				(ExplosiveAppPayment)result;

			if (explosivesApplicationId !=
					explosiveAppPayment.getExplosivesApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_EXPLOSIVEAPPPAYMENT_WHERE);

			sb.append(
				_FINDER_COLUMN_GETEXPLOSIVEBYID_EXPLOSIVESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(explosivesApplicationId);

				List<ExplosiveAppPayment> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetExplosiveById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									explosivesApplicationId
								};
							}

							_log.warn(
								"ExplosiveAppPaymentPersistenceImpl.fetchBygetExplosiveById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ExplosiveAppPayment explosiveAppPayment = list.get(0);

					result = explosiveAppPayment;

					cacheResult(explosiveAppPayment);
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
			return (ExplosiveAppPayment)result;
		}
	}

	/**
	 * Removes the explosive app payment where explosivesApplicationId = &#63; from the database.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the explosive app payment that was removed
	 */
	@Override
	public ExplosiveAppPayment removeBygetExplosiveById(
			long explosivesApplicationId)
		throws NoSuchExplosiveAppPaymentException {

		ExplosiveAppPayment explosiveAppPayment = findBygetExplosiveById(
			explosivesApplicationId);

		return remove(explosiveAppPayment);
	}

	/**
	 * Returns the number of explosive app payments where explosivesApplicationId = &#63;.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the number of matching explosive app payments
	 */
	@Override
	public int countBygetExplosiveById(long explosivesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetExplosiveById;

		Object[] finderArgs = new Object[] {explosivesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXPLOSIVEAPPPAYMENT_WHERE);

			sb.append(
				_FINDER_COLUMN_GETEXPLOSIVEBYID_EXPLOSIVESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(explosivesApplicationId);

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
		_FINDER_COLUMN_GETEXPLOSIVEBYID_EXPLOSIVESAPPLICATIONID_2 =
			"explosiveAppPayment.explosivesApplicationId = ?";

	public ExplosiveAppPaymentPersistenceImpl() {
		setModelClass(ExplosiveAppPayment.class);

		setModelImplClass(ExplosiveAppPaymentImpl.class);
		setModelPKClass(long.class);

		setTable(ExplosiveAppPaymentTable.INSTANCE);
	}

	/**
	 * Caches the explosive app payment in the entity cache if it is enabled.
	 *
	 * @param explosiveAppPayment the explosive app payment
	 */
	@Override
	public void cacheResult(ExplosiveAppPayment explosiveAppPayment) {
		entityCache.putResult(
			ExplosiveAppPaymentImpl.class, explosiveAppPayment.getPrimaryKey(),
			explosiveAppPayment);

		finderCache.putResult(
			_finderPathFetchBygetExplosiveById,
			new Object[] {explosiveAppPayment.getExplosivesApplicationId()},
			explosiveAppPayment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the explosive app payments in the entity cache if it is enabled.
	 *
	 * @param explosiveAppPayments the explosive app payments
	 */
	@Override
	public void cacheResult(List<ExplosiveAppPayment> explosiveAppPayments) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (explosiveAppPayments.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ExplosiveAppPayment explosiveAppPayment : explosiveAppPayments) {
			if (entityCache.getResult(
					ExplosiveAppPaymentImpl.class,
					explosiveAppPayment.getPrimaryKey()) == null) {

				cacheResult(explosiveAppPayment);
			}
		}
	}

	/**
	 * Clears the cache for all explosive app payments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ExplosiveAppPaymentImpl.class);

		finderCache.clearCache(ExplosiveAppPaymentImpl.class);
	}

	/**
	 * Clears the cache for the explosive app payment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ExplosiveAppPayment explosiveAppPayment) {
		entityCache.removeResult(
			ExplosiveAppPaymentImpl.class, explosiveAppPayment);
	}

	@Override
	public void clearCache(List<ExplosiveAppPayment> explosiveAppPayments) {
		for (ExplosiveAppPayment explosiveAppPayment : explosiveAppPayments) {
			entityCache.removeResult(
				ExplosiveAppPaymentImpl.class, explosiveAppPayment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ExplosiveAppPaymentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ExplosiveAppPaymentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ExplosiveAppPaymentModelImpl explosiveAppPaymentModelImpl) {

		Object[] args = new Object[] {
			explosiveAppPaymentModelImpl.getExplosivesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetExplosiveById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetExplosiveById, args,
			explosiveAppPaymentModelImpl);
	}

	/**
	 * Creates a new explosive app payment with the primary key. Does not add the explosive app payment to the database.
	 *
	 * @param explosiveAppPaymentId the primary key for the new explosive app payment
	 * @return the new explosive app payment
	 */
	@Override
	public ExplosiveAppPayment create(long explosiveAppPaymentId) {
		ExplosiveAppPayment explosiveAppPayment = new ExplosiveAppPaymentImpl();

		explosiveAppPayment.setNew(true);
		explosiveAppPayment.setPrimaryKey(explosiveAppPaymentId);

		explosiveAppPayment.setCompanyId(CompanyThreadLocal.getCompanyId());

		return explosiveAppPayment;
	}

	/**
	 * Removes the explosive app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param explosiveAppPaymentId the primary key of the explosive app payment
	 * @return the explosive app payment that was removed
	 * @throws NoSuchExplosiveAppPaymentException if a explosive app payment with the primary key could not be found
	 */
	@Override
	public ExplosiveAppPayment remove(long explosiveAppPaymentId)
		throws NoSuchExplosiveAppPaymentException {

		return remove((Serializable)explosiveAppPaymentId);
	}

	/**
	 * Removes the explosive app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the explosive app payment
	 * @return the explosive app payment that was removed
	 * @throws NoSuchExplosiveAppPaymentException if a explosive app payment with the primary key could not be found
	 */
	@Override
	public ExplosiveAppPayment remove(Serializable primaryKey)
		throws NoSuchExplosiveAppPaymentException {

		Session session = null;

		try {
			session = openSession();

			ExplosiveAppPayment explosiveAppPayment =
				(ExplosiveAppPayment)session.get(
					ExplosiveAppPaymentImpl.class, primaryKey);

			if (explosiveAppPayment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchExplosiveAppPaymentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(explosiveAppPayment);
		}
		catch (NoSuchExplosiveAppPaymentException noSuchEntityException) {
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
	protected ExplosiveAppPayment removeImpl(
		ExplosiveAppPayment explosiveAppPayment) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(explosiveAppPayment)) {
				explosiveAppPayment = (ExplosiveAppPayment)session.get(
					ExplosiveAppPaymentImpl.class,
					explosiveAppPayment.getPrimaryKeyObj());
			}

			if (explosiveAppPayment != null) {
				session.delete(explosiveAppPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (explosiveAppPayment != null) {
			clearCache(explosiveAppPayment);
		}

		return explosiveAppPayment;
	}

	@Override
	public ExplosiveAppPayment updateImpl(
		ExplosiveAppPayment explosiveAppPayment) {

		boolean isNew = explosiveAppPayment.isNew();

		if (!(explosiveAppPayment instanceof ExplosiveAppPaymentModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(explosiveAppPayment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					explosiveAppPayment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in explosiveAppPayment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ExplosiveAppPayment implementation " +
					explosiveAppPayment.getClass());
		}

		ExplosiveAppPaymentModelImpl explosiveAppPaymentModelImpl =
			(ExplosiveAppPaymentModelImpl)explosiveAppPayment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (explosiveAppPayment.getCreateDate() == null)) {
			if (serviceContext == null) {
				explosiveAppPayment.setCreateDate(date);
			}
			else {
				explosiveAppPayment.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!explosiveAppPaymentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				explosiveAppPayment.setModifiedDate(date);
			}
			else {
				explosiveAppPayment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(explosiveAppPayment);
			}
			else {
				explosiveAppPayment = (ExplosiveAppPayment)session.merge(
					explosiveAppPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ExplosiveAppPaymentImpl.class, explosiveAppPaymentModelImpl, false,
			true);

		cacheUniqueFindersCache(explosiveAppPaymentModelImpl);

		if (isNew) {
			explosiveAppPayment.setNew(false);
		}

		explosiveAppPayment.resetOriginalValues();

		return explosiveAppPayment;
	}

	/**
	 * Returns the explosive app payment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the explosive app payment
	 * @return the explosive app payment
	 * @throws NoSuchExplosiveAppPaymentException if a explosive app payment with the primary key could not be found
	 */
	@Override
	public ExplosiveAppPayment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchExplosiveAppPaymentException {

		ExplosiveAppPayment explosiveAppPayment = fetchByPrimaryKey(primaryKey);

		if (explosiveAppPayment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchExplosiveAppPaymentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return explosiveAppPayment;
	}

	/**
	 * Returns the explosive app payment with the primary key or throws a <code>NoSuchExplosiveAppPaymentException</code> if it could not be found.
	 *
	 * @param explosiveAppPaymentId the primary key of the explosive app payment
	 * @return the explosive app payment
	 * @throws NoSuchExplosiveAppPaymentException if a explosive app payment with the primary key could not be found
	 */
	@Override
	public ExplosiveAppPayment findByPrimaryKey(long explosiveAppPaymentId)
		throws NoSuchExplosiveAppPaymentException {

		return findByPrimaryKey((Serializable)explosiveAppPaymentId);
	}

	/**
	 * Returns the explosive app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param explosiveAppPaymentId the primary key of the explosive app payment
	 * @return the explosive app payment, or <code>null</code> if a explosive app payment with the primary key could not be found
	 */
	@Override
	public ExplosiveAppPayment fetchByPrimaryKey(long explosiveAppPaymentId) {
		return fetchByPrimaryKey((Serializable)explosiveAppPaymentId);
	}

	/**
	 * Returns all the explosive app payments.
	 *
	 * @return the explosive app payments
	 */
	@Override
	public List<ExplosiveAppPayment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosive app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive app payments
	 * @param end the upper bound of the range of explosive app payments (not inclusive)
	 * @return the range of explosive app payments
	 */
	@Override
	public List<ExplosiveAppPayment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosive app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive app payments
	 * @param end the upper bound of the range of explosive app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of explosive app payments
	 */
	@Override
	public List<ExplosiveAppPayment> findAll(
		int start, int end,
		OrderByComparator<ExplosiveAppPayment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosive app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive app payments
	 * @param end the upper bound of the range of explosive app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of explosive app payments
	 */
	@Override
	public List<ExplosiveAppPayment> findAll(
		int start, int end,
		OrderByComparator<ExplosiveAppPayment> orderByComparator,
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

		List<ExplosiveAppPayment> list = null;

		if (useFinderCache) {
			list = (List<ExplosiveAppPayment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_EXPLOSIVEAPPPAYMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_EXPLOSIVEAPPPAYMENT;

				sql = sql.concat(ExplosiveAppPaymentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ExplosiveAppPayment>)QueryUtil.list(
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
	 * Removes all the explosive app payments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ExplosiveAppPayment explosiveAppPayment : findAll()) {
			remove(explosiveAppPayment);
		}
	}

	/**
	 * Returns the number of explosive app payments.
	 *
	 * @return the number of explosive app payments
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
					_SQL_COUNT_EXPLOSIVEAPPPAYMENT);

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
		return "explosiveAppPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_EXPLOSIVEAPPPAYMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ExplosiveAppPaymentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the explosive app payment persistence.
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

		_finderPathFetchBygetExplosiveById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetExplosiveById",
			new String[] {Long.class.getName()},
			new String[] {"explosivesApplicationId"}, true);

		_finderPathCountBygetExplosiveById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetExplosiveById", new String[] {Long.class.getName()},
			new String[] {"explosivesApplicationId"}, false);

		ExplosiveAppPaymentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ExplosiveAppPaymentUtil.setPersistence(null);

		entityCache.removeCache(ExplosiveAppPaymentImpl.class.getName());
	}

	@Override
	@Reference(
		target = EXPLOSIVEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = EXPLOSIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = EXPLOSIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_EXPLOSIVEAPPPAYMENT =
		"SELECT explosiveAppPayment FROM ExplosiveAppPayment explosiveAppPayment";

	private static final String _SQL_SELECT_EXPLOSIVEAPPPAYMENT_WHERE =
		"SELECT explosiveAppPayment FROM ExplosiveAppPayment explosiveAppPayment WHERE ";

	private static final String _SQL_COUNT_EXPLOSIVEAPPPAYMENT =
		"SELECT COUNT(explosiveAppPayment) FROM ExplosiveAppPayment explosiveAppPayment";

	private static final String _SQL_COUNT_EXPLOSIVEAPPPAYMENT_WHERE =
		"SELECT COUNT(explosiveAppPayment) FROM ExplosiveAppPayment explosiveAppPayment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "explosiveAppPayment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ExplosiveAppPayment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ExplosiveAppPayment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ExplosiveAppPaymentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}