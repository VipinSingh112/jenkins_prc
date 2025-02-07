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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchOsiTotalMonthlyExpenseException;
import com.nbp.osi.insolvency.application.form.services.model.OsiTotalMonthlyExpense;
import com.nbp.osi.insolvency.application.form.services.model.OsiTotalMonthlyExpenseTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.OsiTotalMonthlyExpenseImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.OsiTotalMonthlyExpenseModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiTotalMonthlyExpensePersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiTotalMonthlyExpenseUtil;
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
 * The persistence implementation for the osi total monthly expense service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiTotalMonthlyExpensePersistence.class)
public class OsiTotalMonthlyExpensePersistenceImpl
	extends BasePersistenceImpl<OsiTotalMonthlyExpense>
	implements OsiTotalMonthlyExpensePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiTotalMonthlyExpenseUtil</code> to access the osi total monthly expense persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiTotalMonthlyExpenseImpl.class.getName();

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
	 * Returns the osi total monthly expense where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiTotalMonthlyExpenseException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi total monthly expense
	 * @throws NoSuchOsiTotalMonthlyExpenseException if a matching osi total monthly expense could not be found
	 */
	@Override
	public OsiTotalMonthlyExpense findBygetOsiById(long osiInsolvencyId)
		throws NoSuchOsiTotalMonthlyExpenseException {

		OsiTotalMonthlyExpense osiTotalMonthlyExpense = fetchBygetOsiById(
			osiInsolvencyId);

		if (osiTotalMonthlyExpense == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiTotalMonthlyExpenseException(sb.toString());
		}

		return osiTotalMonthlyExpense;
	}

	/**
	 * Returns the osi total monthly expense where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi total monthly expense, or <code>null</code> if a matching osi total monthly expense could not be found
	 */
	@Override
	public OsiTotalMonthlyExpense fetchBygetOsiById(long osiInsolvencyId) {
		return fetchBygetOsiById(osiInsolvencyId, true);
	}

	/**
	 * Returns the osi total monthly expense where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi total monthly expense, or <code>null</code> if a matching osi total monthly expense could not be found
	 */
	@Override
	public OsiTotalMonthlyExpense fetchBygetOsiById(
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

		if (result instanceof OsiTotalMonthlyExpense) {
			OsiTotalMonthlyExpense osiTotalMonthlyExpense =
				(OsiTotalMonthlyExpense)result;

			if (osiInsolvencyId !=
					osiTotalMonthlyExpense.getOsiInsolvencyId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSITOTALMONTHLYEXPENSE_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<OsiTotalMonthlyExpense> list = query.list();

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
								"OsiTotalMonthlyExpensePersistenceImpl.fetchBygetOsiById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiTotalMonthlyExpense osiTotalMonthlyExpense = list.get(0);

					result = osiTotalMonthlyExpense;

					cacheResult(osiTotalMonthlyExpense);
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
			return (OsiTotalMonthlyExpense)result;
		}
	}

	/**
	 * Removes the osi total monthly expense where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi total monthly expense that was removed
	 */
	@Override
	public OsiTotalMonthlyExpense removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchOsiTotalMonthlyExpenseException {

		OsiTotalMonthlyExpense osiTotalMonthlyExpense = findBygetOsiById(
			osiInsolvencyId);

		return remove(osiTotalMonthlyExpense);
	}

	/**
	 * Returns the number of osi total monthly expenses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi total monthly expenses
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSITOTALMONTHLYEXPENSE_WHERE);

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
		"osiTotalMonthlyExpense.osiInsolvencyId = ?";

	public OsiTotalMonthlyExpensePersistenceImpl() {
		setModelClass(OsiTotalMonthlyExpense.class);

		setModelImplClass(OsiTotalMonthlyExpenseImpl.class);
		setModelPKClass(long.class);

		setTable(OsiTotalMonthlyExpenseTable.INSTANCE);
	}

	/**
	 * Caches the osi total monthly expense in the entity cache if it is enabled.
	 *
	 * @param osiTotalMonthlyExpense the osi total monthly expense
	 */
	@Override
	public void cacheResult(OsiTotalMonthlyExpense osiTotalMonthlyExpense) {
		entityCache.putResult(
			OsiTotalMonthlyExpenseImpl.class,
			osiTotalMonthlyExpense.getPrimaryKey(), osiTotalMonthlyExpense);

		finderCache.putResult(
			_finderPathFetchBygetOsiById,
			new Object[] {osiTotalMonthlyExpense.getOsiInsolvencyId()},
			osiTotalMonthlyExpense);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi total monthly expenses in the entity cache if it is enabled.
	 *
	 * @param osiTotalMonthlyExpenses the osi total monthly expenses
	 */
	@Override
	public void cacheResult(
		List<OsiTotalMonthlyExpense> osiTotalMonthlyExpenses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiTotalMonthlyExpenses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiTotalMonthlyExpense osiTotalMonthlyExpense :
				osiTotalMonthlyExpenses) {

			if (entityCache.getResult(
					OsiTotalMonthlyExpenseImpl.class,
					osiTotalMonthlyExpense.getPrimaryKey()) == null) {

				cacheResult(osiTotalMonthlyExpense);
			}
		}
	}

	/**
	 * Clears the cache for all osi total monthly expenses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiTotalMonthlyExpenseImpl.class);

		finderCache.clearCache(OsiTotalMonthlyExpenseImpl.class);
	}

	/**
	 * Clears the cache for the osi total monthly expense.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OsiTotalMonthlyExpense osiTotalMonthlyExpense) {
		entityCache.removeResult(
			OsiTotalMonthlyExpenseImpl.class, osiTotalMonthlyExpense);
	}

	@Override
	public void clearCache(
		List<OsiTotalMonthlyExpense> osiTotalMonthlyExpenses) {

		for (OsiTotalMonthlyExpense osiTotalMonthlyExpense :
				osiTotalMonthlyExpenses) {

			entityCache.removeResult(
				OsiTotalMonthlyExpenseImpl.class, osiTotalMonthlyExpense);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiTotalMonthlyExpenseImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiTotalMonthlyExpenseImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiTotalMonthlyExpenseModelImpl osiTotalMonthlyExpenseModelImpl) {

		Object[] args = new Object[] {
			osiTotalMonthlyExpenseModelImpl.getOsiInsolvencyId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiById, args,
			osiTotalMonthlyExpenseModelImpl);
	}

	/**
	 * Creates a new osi total monthly expense with the primary key. Does not add the osi total monthly expense to the database.
	 *
	 * @param osiTotalMonthlyExpenseId the primary key for the new osi total monthly expense
	 * @return the new osi total monthly expense
	 */
	@Override
	public OsiTotalMonthlyExpense create(long osiTotalMonthlyExpenseId) {
		OsiTotalMonthlyExpense osiTotalMonthlyExpense =
			new OsiTotalMonthlyExpenseImpl();

		osiTotalMonthlyExpense.setNew(true);
		osiTotalMonthlyExpense.setPrimaryKey(osiTotalMonthlyExpenseId);

		osiTotalMonthlyExpense.setCompanyId(CompanyThreadLocal.getCompanyId());

		return osiTotalMonthlyExpense;
	}

	/**
	 * Removes the osi total monthly expense with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiTotalMonthlyExpenseId the primary key of the osi total monthly expense
	 * @return the osi total monthly expense that was removed
	 * @throws NoSuchOsiTotalMonthlyExpenseException if a osi total monthly expense with the primary key could not be found
	 */
	@Override
	public OsiTotalMonthlyExpense remove(long osiTotalMonthlyExpenseId)
		throws NoSuchOsiTotalMonthlyExpenseException {

		return remove((Serializable)osiTotalMonthlyExpenseId);
	}

	/**
	 * Removes the osi total monthly expense with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi total monthly expense
	 * @return the osi total monthly expense that was removed
	 * @throws NoSuchOsiTotalMonthlyExpenseException if a osi total monthly expense with the primary key could not be found
	 */
	@Override
	public OsiTotalMonthlyExpense remove(Serializable primaryKey)
		throws NoSuchOsiTotalMonthlyExpenseException {

		Session session = null;

		try {
			session = openSession();

			OsiTotalMonthlyExpense osiTotalMonthlyExpense =
				(OsiTotalMonthlyExpense)session.get(
					OsiTotalMonthlyExpenseImpl.class, primaryKey);

			if (osiTotalMonthlyExpense == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiTotalMonthlyExpenseException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiTotalMonthlyExpense);
		}
		catch (NoSuchOsiTotalMonthlyExpenseException noSuchEntityException) {
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
	protected OsiTotalMonthlyExpense removeImpl(
		OsiTotalMonthlyExpense osiTotalMonthlyExpense) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiTotalMonthlyExpense)) {
				osiTotalMonthlyExpense = (OsiTotalMonthlyExpense)session.get(
					OsiTotalMonthlyExpenseImpl.class,
					osiTotalMonthlyExpense.getPrimaryKeyObj());
			}

			if (osiTotalMonthlyExpense != null) {
				session.delete(osiTotalMonthlyExpense);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiTotalMonthlyExpense != null) {
			clearCache(osiTotalMonthlyExpense);
		}

		return osiTotalMonthlyExpense;
	}

	@Override
	public OsiTotalMonthlyExpense updateImpl(
		OsiTotalMonthlyExpense osiTotalMonthlyExpense) {

		boolean isNew = osiTotalMonthlyExpense.isNew();

		if (!(osiTotalMonthlyExpense instanceof
				OsiTotalMonthlyExpenseModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiTotalMonthlyExpense.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiTotalMonthlyExpense);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiTotalMonthlyExpense proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiTotalMonthlyExpense implementation " +
					osiTotalMonthlyExpense.getClass());
		}

		OsiTotalMonthlyExpenseModelImpl osiTotalMonthlyExpenseModelImpl =
			(OsiTotalMonthlyExpenseModelImpl)osiTotalMonthlyExpense;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiTotalMonthlyExpense.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiTotalMonthlyExpense.setCreateDate(date);
			}
			else {
				osiTotalMonthlyExpense.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiTotalMonthlyExpenseModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiTotalMonthlyExpense.setModifiedDate(date);
			}
			else {
				osiTotalMonthlyExpense.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiTotalMonthlyExpense);
			}
			else {
				osiTotalMonthlyExpense = (OsiTotalMonthlyExpense)session.merge(
					osiTotalMonthlyExpense);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiTotalMonthlyExpenseImpl.class, osiTotalMonthlyExpenseModelImpl,
			false, true);

		cacheUniqueFindersCache(osiTotalMonthlyExpenseModelImpl);

		if (isNew) {
			osiTotalMonthlyExpense.setNew(false);
		}

		osiTotalMonthlyExpense.resetOriginalValues();

		return osiTotalMonthlyExpense;
	}

	/**
	 * Returns the osi total monthly expense with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi total monthly expense
	 * @return the osi total monthly expense
	 * @throws NoSuchOsiTotalMonthlyExpenseException if a osi total monthly expense with the primary key could not be found
	 */
	@Override
	public OsiTotalMonthlyExpense findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOsiTotalMonthlyExpenseException {

		OsiTotalMonthlyExpense osiTotalMonthlyExpense = fetchByPrimaryKey(
			primaryKey);

		if (osiTotalMonthlyExpense == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiTotalMonthlyExpenseException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiTotalMonthlyExpense;
	}

	/**
	 * Returns the osi total monthly expense with the primary key or throws a <code>NoSuchOsiTotalMonthlyExpenseException</code> if it could not be found.
	 *
	 * @param osiTotalMonthlyExpenseId the primary key of the osi total monthly expense
	 * @return the osi total monthly expense
	 * @throws NoSuchOsiTotalMonthlyExpenseException if a osi total monthly expense with the primary key could not be found
	 */
	@Override
	public OsiTotalMonthlyExpense findByPrimaryKey(
			long osiTotalMonthlyExpenseId)
		throws NoSuchOsiTotalMonthlyExpenseException {

		return findByPrimaryKey((Serializable)osiTotalMonthlyExpenseId);
	}

	/**
	 * Returns the osi total monthly expense with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiTotalMonthlyExpenseId the primary key of the osi total monthly expense
	 * @return the osi total monthly expense, or <code>null</code> if a osi total monthly expense with the primary key could not be found
	 */
	@Override
	public OsiTotalMonthlyExpense fetchByPrimaryKey(
		long osiTotalMonthlyExpenseId) {

		return fetchByPrimaryKey((Serializable)osiTotalMonthlyExpenseId);
	}

	/**
	 * Returns all the osi total monthly expenses.
	 *
	 * @return the osi total monthly expenses
	 */
	@Override
	public List<OsiTotalMonthlyExpense> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi total monthly expenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiTotalMonthlyExpenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi total monthly expenses
	 * @param end the upper bound of the range of osi total monthly expenses (not inclusive)
	 * @return the range of osi total monthly expenses
	 */
	@Override
	public List<OsiTotalMonthlyExpense> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi total monthly expenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiTotalMonthlyExpenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi total monthly expenses
	 * @param end the upper bound of the range of osi total monthly expenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi total monthly expenses
	 */
	@Override
	public List<OsiTotalMonthlyExpense> findAll(
		int start, int end,
		OrderByComparator<OsiTotalMonthlyExpense> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi total monthly expenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiTotalMonthlyExpenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi total monthly expenses
	 * @param end the upper bound of the range of osi total monthly expenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi total monthly expenses
	 */
	@Override
	public List<OsiTotalMonthlyExpense> findAll(
		int start, int end,
		OrderByComparator<OsiTotalMonthlyExpense> orderByComparator,
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

		List<OsiTotalMonthlyExpense> list = null;

		if (useFinderCache) {
			list = (List<OsiTotalMonthlyExpense>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSITOTALMONTHLYEXPENSE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSITOTALMONTHLYEXPENSE;

				sql = sql.concat(OsiTotalMonthlyExpenseModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiTotalMonthlyExpense>)QueryUtil.list(
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
	 * Removes all the osi total monthly expenses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiTotalMonthlyExpense osiTotalMonthlyExpense : findAll()) {
			remove(osiTotalMonthlyExpense);
		}
	}

	/**
	 * Returns the number of osi total monthly expenses.
	 *
	 * @return the number of osi total monthly expenses
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
					_SQL_COUNT_OSITOTALMONTHLYEXPENSE);

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
		return "osiTotalMonthlyExpenseId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSITOTALMONTHLYEXPENSE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiTotalMonthlyExpenseModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi total monthly expense persistence.
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

		OsiTotalMonthlyExpenseUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiTotalMonthlyExpenseUtil.setPersistence(null);

		entityCache.removeCache(OsiTotalMonthlyExpenseImpl.class.getName());
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

	private static final String _SQL_SELECT_OSITOTALMONTHLYEXPENSE =
		"SELECT osiTotalMonthlyExpense FROM OsiTotalMonthlyExpense osiTotalMonthlyExpense";

	private static final String _SQL_SELECT_OSITOTALMONTHLYEXPENSE_WHERE =
		"SELECT osiTotalMonthlyExpense FROM OsiTotalMonthlyExpense osiTotalMonthlyExpense WHERE ";

	private static final String _SQL_COUNT_OSITOTALMONTHLYEXPENSE =
		"SELECT COUNT(osiTotalMonthlyExpense) FROM OsiTotalMonthlyExpense osiTotalMonthlyExpense";

	private static final String _SQL_COUNT_OSITOTALMONTHLYEXPENSE_WHERE =
		"SELECT COUNT(osiTotalMonthlyExpense) FROM OsiTotalMonthlyExpense osiTotalMonthlyExpense WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiTotalMonthlyExpense.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiTotalMonthlyExpense exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiTotalMonthlyExpense exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiTotalMonthlyExpensePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}