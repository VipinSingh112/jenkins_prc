/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence.impl;

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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchMonthlyIncomeException;
import com.nbp.osi.insolvency.application.form.services.model.MonthlyIncome;
import com.nbp.osi.insolvency.application.form.services.model.MonthlyIncomeTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.MonthlyIncomeImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.MonthlyIncomeModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.MonthlyIncomePersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.MonthlyIncomeUtil;
import com.nbp.osi.insolvency.application.form.services.service.persistence.impl.constants.OSI_INSOLVENCYPersistenceConstants;

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
 * The persistence implementation for the monthly income service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MonthlyIncomePersistence.class)
public class MonthlyIncomePersistenceImpl
	extends BasePersistenceImpl<MonthlyIncome>
	implements MonthlyIncomePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MonthlyIncomeUtil</code> to access the monthly income persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MonthlyIncomeImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOsiById;
	private FinderPath _finderPathCountBygetOsiById;

	/**
	 * Returns the monthly income where osiInsolvencyId = &#63; or throws a <code>NoSuchMonthlyIncomeException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching monthly income
	 * @throws NoSuchMonthlyIncomeException if a matching monthly income could not be found
	 */
	@Override
	public MonthlyIncome findBygetOsiById(long osiInsolvencyId)
		throws NoSuchMonthlyIncomeException {

		MonthlyIncome monthlyIncome = fetchBygetOsiById(osiInsolvencyId);

		if (monthlyIncome == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMonthlyIncomeException(sb.toString());
		}

		return monthlyIncome;
	}

	/**
	 * Returns the monthly income where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching monthly income, or <code>null</code> if a matching monthly income could not be found
	 */
	@Override
	public MonthlyIncome fetchBygetOsiById(long osiInsolvencyId) {
		return fetchBygetOsiById(osiInsolvencyId, true);
	}

	/**
	 * Returns the monthly income where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching monthly income, or <code>null</code> if a matching monthly income could not be found
	 */
	@Override
	public MonthlyIncome fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiInsolvencyId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiById, finderArgs, this);
		}

		if (result instanceof MonthlyIncome) {
			MonthlyIncome monthlyIncome = (MonthlyIncome)result;

			if (osiInsolvencyId != monthlyIncome.getOsiInsolvencyId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MONTHLYINCOME_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<MonthlyIncome> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOsiById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {osiInsolvencyId};
							}

							_log.warn(
								"MonthlyIncomePersistenceImpl.fetchBygetOsiById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MonthlyIncome monthlyIncome = list.get(0);

					result = monthlyIncome;

					cacheResult(monthlyIncome);
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
			return (MonthlyIncome)result;
		}
	}

	/**
	 * Removes the monthly income where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the monthly income that was removed
	 */
	@Override
	public MonthlyIncome removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchMonthlyIncomeException {

		MonthlyIncome monthlyIncome = findBygetOsiById(osiInsolvencyId);

		return remove(monthlyIncome);
	}

	/**
	 * Returns the number of monthly incomes where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching monthly incomes
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MONTHLYINCOME_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

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

	private static final String _FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2 =
		"monthlyIncome.osiInsolvencyId = ?";

	public MonthlyIncomePersistenceImpl() {
		setModelClass(MonthlyIncome.class);

		setModelImplClass(MonthlyIncomeImpl.class);
		setModelPKClass(long.class);

		setTable(MonthlyIncomeTable.INSTANCE);
	}

	/**
	 * Caches the monthly income in the entity cache if it is enabled.
	 *
	 * @param monthlyIncome the monthly income
	 */
	@Override
	public void cacheResult(MonthlyIncome monthlyIncome) {
		entityCache.putResult(
			MonthlyIncomeImpl.class, monthlyIncome.getPrimaryKey(),
			monthlyIncome);

		finderCache.putResult(
			_finderPathFetchBygetOsiById,
			new Object[] {monthlyIncome.getOsiInsolvencyId()}, monthlyIncome);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the monthly incomes in the entity cache if it is enabled.
	 *
	 * @param monthlyIncomes the monthly incomes
	 */
	@Override
	public void cacheResult(List<MonthlyIncome> monthlyIncomes) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (monthlyIncomes.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MonthlyIncome monthlyIncome : monthlyIncomes) {
			if (entityCache.getResult(
					MonthlyIncomeImpl.class, monthlyIncome.getPrimaryKey()) ==
						null) {

				cacheResult(monthlyIncome);
			}
		}
	}

	/**
	 * Clears the cache for all monthly incomes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MonthlyIncomeImpl.class);

		finderCache.clearCache(MonthlyIncomeImpl.class);
	}

	/**
	 * Clears the cache for the monthly income.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MonthlyIncome monthlyIncome) {
		entityCache.removeResult(MonthlyIncomeImpl.class, monthlyIncome);
	}

	@Override
	public void clearCache(List<MonthlyIncome> monthlyIncomes) {
		for (MonthlyIncome monthlyIncome : monthlyIncomes) {
			entityCache.removeResult(MonthlyIncomeImpl.class, monthlyIncome);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MonthlyIncomeImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(MonthlyIncomeImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MonthlyIncomeModelImpl monthlyIncomeModelImpl) {

		Object[] args = new Object[] {
			monthlyIncomeModelImpl.getOsiInsolvencyId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiById, args, monthlyIncomeModelImpl);
	}

	/**
	 * Creates a new monthly income with the primary key. Does not add the monthly income to the database.
	 *
	 * @param monthlyIncomeId the primary key for the new monthly income
	 * @return the new monthly income
	 */
	@Override
	public MonthlyIncome create(long monthlyIncomeId) {
		MonthlyIncome monthlyIncome = new MonthlyIncomeImpl();

		monthlyIncome.setNew(true);
		monthlyIncome.setPrimaryKey(monthlyIncomeId);

		monthlyIncome.setCompanyId(CompanyThreadLocal.getCompanyId());

		return monthlyIncome;
	}

	/**
	 * Removes the monthly income with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param monthlyIncomeId the primary key of the monthly income
	 * @return the monthly income that was removed
	 * @throws NoSuchMonthlyIncomeException if a monthly income with the primary key could not be found
	 */
	@Override
	public MonthlyIncome remove(long monthlyIncomeId)
		throws NoSuchMonthlyIncomeException {

		return remove((Serializable)monthlyIncomeId);
	}

	/**
	 * Removes the monthly income with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the monthly income
	 * @return the monthly income that was removed
	 * @throws NoSuchMonthlyIncomeException if a monthly income with the primary key could not be found
	 */
	@Override
	public MonthlyIncome remove(Serializable primaryKey)
		throws NoSuchMonthlyIncomeException {

		Session session = null;

		try {
			session = openSession();

			MonthlyIncome monthlyIncome = (MonthlyIncome)session.get(
				MonthlyIncomeImpl.class, primaryKey);

			if (monthlyIncome == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMonthlyIncomeException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(monthlyIncome);
		}
		catch (NoSuchMonthlyIncomeException noSuchEntityException) {
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
	protected MonthlyIncome removeImpl(MonthlyIncome monthlyIncome) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(monthlyIncome)) {
				monthlyIncome = (MonthlyIncome)session.get(
					MonthlyIncomeImpl.class, monthlyIncome.getPrimaryKeyObj());
			}

			if (monthlyIncome != null) {
				session.delete(monthlyIncome);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (monthlyIncome != null) {
			clearCache(monthlyIncome);
		}

		return monthlyIncome;
	}

	@Override
	public MonthlyIncome updateImpl(MonthlyIncome monthlyIncome) {
		boolean isNew = monthlyIncome.isNew();

		if (!(monthlyIncome instanceof MonthlyIncomeModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(monthlyIncome.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					monthlyIncome);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in monthlyIncome proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MonthlyIncome implementation " +
					monthlyIncome.getClass());
		}

		MonthlyIncomeModelImpl monthlyIncomeModelImpl =
			(MonthlyIncomeModelImpl)monthlyIncome;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (monthlyIncome.getCreateDate() == null)) {
			if (serviceContext == null) {
				monthlyIncome.setCreateDate(date);
			}
			else {
				monthlyIncome.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!monthlyIncomeModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				monthlyIncome.setModifiedDate(date);
			}
			else {
				monthlyIncome.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(monthlyIncome);
			}
			else {
				monthlyIncome = (MonthlyIncome)session.merge(monthlyIncome);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MonthlyIncomeImpl.class, monthlyIncomeModelImpl, false, true);

		cacheUniqueFindersCache(monthlyIncomeModelImpl);

		if (isNew) {
			monthlyIncome.setNew(false);
		}

		monthlyIncome.resetOriginalValues();

		return monthlyIncome;
	}

	/**
	 * Returns the monthly income with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the monthly income
	 * @return the monthly income
	 * @throws NoSuchMonthlyIncomeException if a monthly income with the primary key could not be found
	 */
	@Override
	public MonthlyIncome findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMonthlyIncomeException {

		MonthlyIncome monthlyIncome = fetchByPrimaryKey(primaryKey);

		if (monthlyIncome == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMonthlyIncomeException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return monthlyIncome;
	}

	/**
	 * Returns the monthly income with the primary key or throws a <code>NoSuchMonthlyIncomeException</code> if it could not be found.
	 *
	 * @param monthlyIncomeId the primary key of the monthly income
	 * @return the monthly income
	 * @throws NoSuchMonthlyIncomeException if a monthly income with the primary key could not be found
	 */
	@Override
	public MonthlyIncome findByPrimaryKey(long monthlyIncomeId)
		throws NoSuchMonthlyIncomeException {

		return findByPrimaryKey((Serializable)monthlyIncomeId);
	}

	/**
	 * Returns the monthly income with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param monthlyIncomeId the primary key of the monthly income
	 * @return the monthly income, or <code>null</code> if a monthly income with the primary key could not be found
	 */
	@Override
	public MonthlyIncome fetchByPrimaryKey(long monthlyIncomeId) {
		return fetchByPrimaryKey((Serializable)monthlyIncomeId);
	}

	/**
	 * Returns all the monthly incomes.
	 *
	 * @return the monthly incomes
	 */
	@Override
	public List<MonthlyIncome> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the monthly incomes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MonthlyIncomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of monthly incomes
	 * @param end the upper bound of the range of monthly incomes (not inclusive)
	 * @return the range of monthly incomes
	 */
	@Override
	public List<MonthlyIncome> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the monthly incomes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MonthlyIncomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of monthly incomes
	 * @param end the upper bound of the range of monthly incomes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of monthly incomes
	 */
	@Override
	public List<MonthlyIncome> findAll(
		int start, int end,
		OrderByComparator<MonthlyIncome> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the monthly incomes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MonthlyIncomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of monthly incomes
	 * @param end the upper bound of the range of monthly incomes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of monthly incomes
	 */
	@Override
	public List<MonthlyIncome> findAll(
		int start, int end, OrderByComparator<MonthlyIncome> orderByComparator,
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

		List<MonthlyIncome> list = null;

		if (useFinderCache) {
			list = (List<MonthlyIncome>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MONTHLYINCOME);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MONTHLYINCOME;

				sql = sql.concat(MonthlyIncomeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MonthlyIncome>)QueryUtil.list(
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
	 * Removes all the monthly incomes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MonthlyIncome monthlyIncome : findAll()) {
			remove(monthlyIncome);
		}
	}

	/**
	 * Returns the number of monthly incomes.
	 *
	 * @return the number of monthly incomes
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_MONTHLYINCOME);

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
		return "monthlyIncomeId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MONTHLYINCOME;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MonthlyIncomeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the monthly income persistence.
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

		_finderPathFetchBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathCountBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, false);

		MonthlyIncomeUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MonthlyIncomeUtil.setPersistence(null);

		entityCache.removeCache(MonthlyIncomeImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MONTHLYINCOME =
		"SELECT monthlyIncome FROM MonthlyIncome monthlyIncome";

	private static final String _SQL_SELECT_MONTHLYINCOME_WHERE =
		"SELECT monthlyIncome FROM MonthlyIncome monthlyIncome WHERE ";

	private static final String _SQL_COUNT_MONTHLYINCOME =
		"SELECT COUNT(monthlyIncome) FROM MonthlyIncome monthlyIncome";

	private static final String _SQL_COUNT_MONTHLYINCOME_WHERE =
		"SELECT COUNT(monthlyIncome) FROM MonthlyIncome monthlyIncome WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "monthlyIncome.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MonthlyIncome exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MonthlyIncome exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MonthlyIncomePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}