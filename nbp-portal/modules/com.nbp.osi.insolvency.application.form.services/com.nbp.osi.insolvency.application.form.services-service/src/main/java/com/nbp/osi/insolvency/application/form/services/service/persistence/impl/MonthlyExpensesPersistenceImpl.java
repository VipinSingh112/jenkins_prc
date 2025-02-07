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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchMonthlyExpensesException;
import com.nbp.osi.insolvency.application.form.services.model.MonthlyExpenses;
import com.nbp.osi.insolvency.application.form.services.model.MonthlyExpensesTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.MonthlyExpensesImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.MonthlyExpensesModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.MonthlyExpensesPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.MonthlyExpensesUtil;
import com.nbp.osi.insolvency.application.form.services.service.persistence.impl.constants.OSI_INSOLVENCYPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the monthly expenses service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MonthlyExpensesPersistence.class)
public class MonthlyExpensesPersistenceImpl
	extends BasePersistenceImpl<MonthlyExpenses>
	implements MonthlyExpensesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MonthlyExpensesUtil</code> to access the monthly expenses persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MonthlyExpensesImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetOsiById;
	private FinderPath _finderPathWithoutPaginationFindBygetOsiById;
	private FinderPath _finderPathCountBygetOsiById;

	/**
	 * Returns all the monthly expenseses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching monthly expenseses
	 */
	@Override
	public List<MonthlyExpenses> findBygetOsiById(long osiInsolvencyId) {
		return findBygetOsiById(
			osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the monthly expenseses where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MonthlyExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of monthly expenseses
	 * @param end the upper bound of the range of monthly expenseses (not inclusive)
	 * @return the range of matching monthly expenseses
	 */
	@Override
	public List<MonthlyExpenses> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return findBygetOsiById(osiInsolvencyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the monthly expenseses where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MonthlyExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of monthly expenseses
	 * @param end the upper bound of the range of monthly expenseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching monthly expenseses
	 */
	@Override
	public List<MonthlyExpenses> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<MonthlyExpenses> orderByComparator) {

		return findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the monthly expenseses where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MonthlyExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of monthly expenseses
	 * @param end the upper bound of the range of monthly expenseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching monthly expenseses
	 */
	@Override
	public List<MonthlyExpenses> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<MonthlyExpenses> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOsiById;
				finderArgs = new Object[] {osiInsolvencyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOsiById;
			finderArgs = new Object[] {
				osiInsolvencyId, start, end, orderByComparator
			};
		}

		List<MonthlyExpenses> list = null;

		if (useFinderCache) {
			list = (List<MonthlyExpenses>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MonthlyExpenses monthlyExpenses : list) {
					if (osiInsolvencyId !=
							monthlyExpenses.getOsiInsolvencyId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_MONTHLYEXPENSES_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MonthlyExpensesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				list = (List<MonthlyExpenses>)QueryUtil.list(
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
	 * Returns the first monthly expenses in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching monthly expenses
	 * @throws NoSuchMonthlyExpensesException if a matching monthly expenses could not be found
	 */
	@Override
	public MonthlyExpenses findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<MonthlyExpenses> orderByComparator)
		throws NoSuchMonthlyExpensesException {

		MonthlyExpenses monthlyExpenses = fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);

		if (monthlyExpenses != null) {
			return monthlyExpenses;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchMonthlyExpensesException(sb.toString());
	}

	/**
	 * Returns the first monthly expenses in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching monthly expenses, or <code>null</code> if a matching monthly expenses could not be found
	 */
	@Override
	public MonthlyExpenses fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<MonthlyExpenses> orderByComparator) {

		List<MonthlyExpenses> list = findBygetOsiById(
			osiInsolvencyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last monthly expenses in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching monthly expenses
	 * @throws NoSuchMonthlyExpensesException if a matching monthly expenses could not be found
	 */
	@Override
	public MonthlyExpenses findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<MonthlyExpenses> orderByComparator)
		throws NoSuchMonthlyExpensesException {

		MonthlyExpenses monthlyExpenses = fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);

		if (monthlyExpenses != null) {
			return monthlyExpenses;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchMonthlyExpensesException(sb.toString());
	}

	/**
	 * Returns the last monthly expenses in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching monthly expenses, or <code>null</code> if a matching monthly expenses could not be found
	 */
	@Override
	public MonthlyExpenses fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<MonthlyExpenses> orderByComparator) {

		int count = countBygetOsiById(osiInsolvencyId);

		if (count == 0) {
			return null;
		}

		List<MonthlyExpenses> list = findBygetOsiById(
			osiInsolvencyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the monthly expenseses before and after the current monthly expenses in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param monthlyExpensesId the primary key of the current monthly expenses
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next monthly expenses
	 * @throws NoSuchMonthlyExpensesException if a monthly expenses with the primary key could not be found
	 */
	@Override
	public MonthlyExpenses[] findBygetOsiById_PrevAndNext(
			long monthlyExpensesId, long osiInsolvencyId,
			OrderByComparator<MonthlyExpenses> orderByComparator)
		throws NoSuchMonthlyExpensesException {

		MonthlyExpenses monthlyExpenses = findByPrimaryKey(monthlyExpensesId);

		Session session = null;

		try {
			session = openSession();

			MonthlyExpenses[] array = new MonthlyExpensesImpl[3];

			array[0] = getBygetOsiById_PrevAndNext(
				session, monthlyExpenses, osiInsolvencyId, orderByComparator,
				true);

			array[1] = monthlyExpenses;

			array[2] = getBygetOsiById_PrevAndNext(
				session, monthlyExpenses, osiInsolvencyId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MonthlyExpenses getBygetOsiById_PrevAndNext(
		Session session, MonthlyExpenses monthlyExpenses, long osiInsolvencyId,
		OrderByComparator<MonthlyExpenses> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MONTHLYEXPENSES_WHERE);

		sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MonthlyExpensesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(osiInsolvencyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						monthlyExpenses)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MonthlyExpenses> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the monthly expenseses where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	@Override
	public void removeBygetOsiById(long osiInsolvencyId) {
		for (MonthlyExpenses monthlyExpenses :
				findBygetOsiById(
					osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(monthlyExpenses);
		}
	}

	/**
	 * Returns the number of monthly expenseses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching monthly expenseses
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MONTHLYEXPENSES_WHERE);

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
		"monthlyExpenses.osiInsolvencyId = ?";

	public MonthlyExpensesPersistenceImpl() {
		setModelClass(MonthlyExpenses.class);

		setModelImplClass(MonthlyExpensesImpl.class);
		setModelPKClass(long.class);

		setTable(MonthlyExpensesTable.INSTANCE);
	}

	/**
	 * Caches the monthly expenses in the entity cache if it is enabled.
	 *
	 * @param monthlyExpenses the monthly expenses
	 */
	@Override
	public void cacheResult(MonthlyExpenses monthlyExpenses) {
		entityCache.putResult(
			MonthlyExpensesImpl.class, monthlyExpenses.getPrimaryKey(),
			monthlyExpenses);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the monthly expenseses in the entity cache if it is enabled.
	 *
	 * @param monthlyExpenseses the monthly expenseses
	 */
	@Override
	public void cacheResult(List<MonthlyExpenses> monthlyExpenseses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (monthlyExpenseses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MonthlyExpenses monthlyExpenses : monthlyExpenseses) {
			if (entityCache.getResult(
					MonthlyExpensesImpl.class,
					monthlyExpenses.getPrimaryKey()) == null) {

				cacheResult(monthlyExpenses);
			}
		}
	}

	/**
	 * Clears the cache for all monthly expenseses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MonthlyExpensesImpl.class);

		finderCache.clearCache(MonthlyExpensesImpl.class);
	}

	/**
	 * Clears the cache for the monthly expenses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MonthlyExpenses monthlyExpenses) {
		entityCache.removeResult(MonthlyExpensesImpl.class, monthlyExpenses);
	}

	@Override
	public void clearCache(List<MonthlyExpenses> monthlyExpenseses) {
		for (MonthlyExpenses monthlyExpenses : monthlyExpenseses) {
			entityCache.removeResult(
				MonthlyExpensesImpl.class, monthlyExpenses);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MonthlyExpensesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(MonthlyExpensesImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new monthly expenses with the primary key. Does not add the monthly expenses to the database.
	 *
	 * @param monthlyExpensesId the primary key for the new monthly expenses
	 * @return the new monthly expenses
	 */
	@Override
	public MonthlyExpenses create(long monthlyExpensesId) {
		MonthlyExpenses monthlyExpenses = new MonthlyExpensesImpl();

		monthlyExpenses.setNew(true);
		monthlyExpenses.setPrimaryKey(monthlyExpensesId);

		monthlyExpenses.setCompanyId(CompanyThreadLocal.getCompanyId());

		return monthlyExpenses;
	}

	/**
	 * Removes the monthly expenses with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param monthlyExpensesId the primary key of the monthly expenses
	 * @return the monthly expenses that was removed
	 * @throws NoSuchMonthlyExpensesException if a monthly expenses with the primary key could not be found
	 */
	@Override
	public MonthlyExpenses remove(long monthlyExpensesId)
		throws NoSuchMonthlyExpensesException {

		return remove((Serializable)monthlyExpensesId);
	}

	/**
	 * Removes the monthly expenses with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the monthly expenses
	 * @return the monthly expenses that was removed
	 * @throws NoSuchMonthlyExpensesException if a monthly expenses with the primary key could not be found
	 */
	@Override
	public MonthlyExpenses remove(Serializable primaryKey)
		throws NoSuchMonthlyExpensesException {

		Session session = null;

		try {
			session = openSession();

			MonthlyExpenses monthlyExpenses = (MonthlyExpenses)session.get(
				MonthlyExpensesImpl.class, primaryKey);

			if (monthlyExpenses == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMonthlyExpensesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(monthlyExpenses);
		}
		catch (NoSuchMonthlyExpensesException noSuchEntityException) {
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
	protected MonthlyExpenses removeImpl(MonthlyExpenses monthlyExpenses) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(monthlyExpenses)) {
				monthlyExpenses = (MonthlyExpenses)session.get(
					MonthlyExpensesImpl.class,
					monthlyExpenses.getPrimaryKeyObj());
			}

			if (monthlyExpenses != null) {
				session.delete(monthlyExpenses);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (monthlyExpenses != null) {
			clearCache(monthlyExpenses);
		}

		return monthlyExpenses;
	}

	@Override
	public MonthlyExpenses updateImpl(MonthlyExpenses monthlyExpenses) {
		boolean isNew = monthlyExpenses.isNew();

		if (!(monthlyExpenses instanceof MonthlyExpensesModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(monthlyExpenses.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					monthlyExpenses);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in monthlyExpenses proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MonthlyExpenses implementation " +
					monthlyExpenses.getClass());
		}

		MonthlyExpensesModelImpl monthlyExpensesModelImpl =
			(MonthlyExpensesModelImpl)monthlyExpenses;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (monthlyExpenses.getCreateDate() == null)) {
			if (serviceContext == null) {
				monthlyExpenses.setCreateDate(date);
			}
			else {
				monthlyExpenses.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!monthlyExpensesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				monthlyExpenses.setModifiedDate(date);
			}
			else {
				monthlyExpenses.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(monthlyExpenses);
			}
			else {
				monthlyExpenses = (MonthlyExpenses)session.merge(
					monthlyExpenses);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MonthlyExpensesImpl.class, monthlyExpensesModelImpl, false, true);

		if (isNew) {
			monthlyExpenses.setNew(false);
		}

		monthlyExpenses.resetOriginalValues();

		return monthlyExpenses;
	}

	/**
	 * Returns the monthly expenses with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the monthly expenses
	 * @return the monthly expenses
	 * @throws NoSuchMonthlyExpensesException if a monthly expenses with the primary key could not be found
	 */
	@Override
	public MonthlyExpenses findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMonthlyExpensesException {

		MonthlyExpenses monthlyExpenses = fetchByPrimaryKey(primaryKey);

		if (monthlyExpenses == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMonthlyExpensesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return monthlyExpenses;
	}

	/**
	 * Returns the monthly expenses with the primary key or throws a <code>NoSuchMonthlyExpensesException</code> if it could not be found.
	 *
	 * @param monthlyExpensesId the primary key of the monthly expenses
	 * @return the monthly expenses
	 * @throws NoSuchMonthlyExpensesException if a monthly expenses with the primary key could not be found
	 */
	@Override
	public MonthlyExpenses findByPrimaryKey(long monthlyExpensesId)
		throws NoSuchMonthlyExpensesException {

		return findByPrimaryKey((Serializable)monthlyExpensesId);
	}

	/**
	 * Returns the monthly expenses with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param monthlyExpensesId the primary key of the monthly expenses
	 * @return the monthly expenses, or <code>null</code> if a monthly expenses with the primary key could not be found
	 */
	@Override
	public MonthlyExpenses fetchByPrimaryKey(long monthlyExpensesId) {
		return fetchByPrimaryKey((Serializable)monthlyExpensesId);
	}

	/**
	 * Returns all the monthly expenseses.
	 *
	 * @return the monthly expenseses
	 */
	@Override
	public List<MonthlyExpenses> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the monthly expenseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MonthlyExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of monthly expenseses
	 * @param end the upper bound of the range of monthly expenseses (not inclusive)
	 * @return the range of monthly expenseses
	 */
	@Override
	public List<MonthlyExpenses> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the monthly expenseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MonthlyExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of monthly expenseses
	 * @param end the upper bound of the range of monthly expenseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of monthly expenseses
	 */
	@Override
	public List<MonthlyExpenses> findAll(
		int start, int end,
		OrderByComparator<MonthlyExpenses> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the monthly expenseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MonthlyExpensesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of monthly expenseses
	 * @param end the upper bound of the range of monthly expenseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of monthly expenseses
	 */
	@Override
	public List<MonthlyExpenses> findAll(
		int start, int end,
		OrderByComparator<MonthlyExpenses> orderByComparator,
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

		List<MonthlyExpenses> list = null;

		if (useFinderCache) {
			list = (List<MonthlyExpenses>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MONTHLYEXPENSES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MONTHLYEXPENSES;

				sql = sql.concat(MonthlyExpensesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MonthlyExpenses>)QueryUtil.list(
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
	 * Removes all the monthly expenseses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MonthlyExpenses monthlyExpenses : findAll()) {
			remove(monthlyExpenses);
		}
	}

	/**
	 * Returns the number of monthly expenseses.
	 *
	 * @return the number of monthly expenseses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_MONTHLYEXPENSES);

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
		return "monthlyExpensesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MONTHLYEXPENSES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MonthlyExpensesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the monthly expenses persistence.
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

		_finderPathWithPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOsiById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathWithoutPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathCountBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, false);

		MonthlyExpensesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MonthlyExpensesUtil.setPersistence(null);

		entityCache.removeCache(MonthlyExpensesImpl.class.getName());
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

	private static final String _SQL_SELECT_MONTHLYEXPENSES =
		"SELECT monthlyExpenses FROM MonthlyExpenses monthlyExpenses";

	private static final String _SQL_SELECT_MONTHLYEXPENSES_WHERE =
		"SELECT monthlyExpenses FROM MonthlyExpenses monthlyExpenses WHERE ";

	private static final String _SQL_COUNT_MONTHLYEXPENSES =
		"SELECT COUNT(monthlyExpenses) FROM MonthlyExpenses monthlyExpenses";

	private static final String _SQL_COUNT_MONTHLYEXPENSES_WHERE =
		"SELECT COUNT(monthlyExpenses) FROM MonthlyExpenses monthlyExpenses WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "monthlyExpenses.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MonthlyExpenses exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MonthlyExpenses exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MonthlyExpensesPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}