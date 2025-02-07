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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchGrandTotalException;
import com.nbp.osi.insolvency.application.form.services.model.GrandTotal;
import com.nbp.osi.insolvency.application.form.services.model.GrandTotalTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.GrandTotalImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.GrandTotalModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.GrandTotalPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.GrandTotalUtil;
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
 * The persistence implementation for the grand total service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = GrandTotalPersistence.class)
public class GrandTotalPersistenceImpl
	extends BasePersistenceImpl<GrandTotal> implements GrandTotalPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>GrandTotalUtil</code> to access the grand total persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		GrandTotalImpl.class.getName();

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
	 * Returns the grand total where osiInsolvencyId = &#63; or throws a <code>NoSuchGrandTotalException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching grand total
	 * @throws NoSuchGrandTotalException if a matching grand total could not be found
	 */
	@Override
	public GrandTotal findBygetOsiById(long osiInsolvencyId)
		throws NoSuchGrandTotalException {

		GrandTotal grandTotal = fetchBygetOsiById(osiInsolvencyId);

		if (grandTotal == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchGrandTotalException(sb.toString());
		}

		return grandTotal;
	}

	/**
	 * Returns the grand total where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching grand total, or <code>null</code> if a matching grand total could not be found
	 */
	@Override
	public GrandTotal fetchBygetOsiById(long osiInsolvencyId) {
		return fetchBygetOsiById(osiInsolvencyId, true);
	}

	/**
	 * Returns the grand total where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching grand total, or <code>null</code> if a matching grand total could not be found
	 */
	@Override
	public GrandTotal fetchBygetOsiById(
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

		if (result instanceof GrandTotal) {
			GrandTotal grandTotal = (GrandTotal)result;

			if (osiInsolvencyId != grandTotal.getOsiInsolvencyId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_GRANDTOTAL_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<GrandTotal> list = query.list();

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
								"GrandTotalPersistenceImpl.fetchBygetOsiById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					GrandTotal grandTotal = list.get(0);

					result = grandTotal;

					cacheResult(grandTotal);
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
			return (GrandTotal)result;
		}
	}

	/**
	 * Removes the grand total where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the grand total that was removed
	 */
	@Override
	public GrandTotal removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchGrandTotalException {

		GrandTotal grandTotal = findBygetOsiById(osiInsolvencyId);

		return remove(grandTotal);
	}

	/**
	 * Returns the number of grand totals where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching grand totals
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_GRANDTOTAL_WHERE);

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
		"grandTotal.osiInsolvencyId = ?";

	public GrandTotalPersistenceImpl() {
		setModelClass(GrandTotal.class);

		setModelImplClass(GrandTotalImpl.class);
		setModelPKClass(long.class);

		setTable(GrandTotalTable.INSTANCE);
	}

	/**
	 * Caches the grand total in the entity cache if it is enabled.
	 *
	 * @param grandTotal the grand total
	 */
	@Override
	public void cacheResult(GrandTotal grandTotal) {
		entityCache.putResult(
			GrandTotalImpl.class, grandTotal.getPrimaryKey(), grandTotal);

		finderCache.putResult(
			_finderPathFetchBygetOsiById,
			new Object[] {grandTotal.getOsiInsolvencyId()}, grandTotal);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the grand totals in the entity cache if it is enabled.
	 *
	 * @param grandTotals the grand totals
	 */
	@Override
	public void cacheResult(List<GrandTotal> grandTotals) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (grandTotals.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (GrandTotal grandTotal : grandTotals) {
			if (entityCache.getResult(
					GrandTotalImpl.class, grandTotal.getPrimaryKey()) == null) {

				cacheResult(grandTotal);
			}
		}
	}

	/**
	 * Clears the cache for all grand totals.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(GrandTotalImpl.class);

		finderCache.clearCache(GrandTotalImpl.class);
	}

	/**
	 * Clears the cache for the grand total.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(GrandTotal grandTotal) {
		entityCache.removeResult(GrandTotalImpl.class, grandTotal);
	}

	@Override
	public void clearCache(List<GrandTotal> grandTotals) {
		for (GrandTotal grandTotal : grandTotals) {
			entityCache.removeResult(GrandTotalImpl.class, grandTotal);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(GrandTotalImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(GrandTotalImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		GrandTotalModelImpl grandTotalModelImpl) {

		Object[] args = new Object[] {grandTotalModelImpl.getOsiInsolvencyId()};

		finderCache.putResult(
			_finderPathCountBygetOsiById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiById, args, grandTotalModelImpl);
	}

	/**
	 * Creates a new grand total with the primary key. Does not add the grand total to the database.
	 *
	 * @param grandTotalId the primary key for the new grand total
	 * @return the new grand total
	 */
	@Override
	public GrandTotal create(long grandTotalId) {
		GrandTotal grandTotal = new GrandTotalImpl();

		grandTotal.setNew(true);
		grandTotal.setPrimaryKey(grandTotalId);

		grandTotal.setCompanyId(CompanyThreadLocal.getCompanyId());

		return grandTotal;
	}

	/**
	 * Removes the grand total with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param grandTotalId the primary key of the grand total
	 * @return the grand total that was removed
	 * @throws NoSuchGrandTotalException if a grand total with the primary key could not be found
	 */
	@Override
	public GrandTotal remove(long grandTotalId)
		throws NoSuchGrandTotalException {

		return remove((Serializable)grandTotalId);
	}

	/**
	 * Removes the grand total with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the grand total
	 * @return the grand total that was removed
	 * @throws NoSuchGrandTotalException if a grand total with the primary key could not be found
	 */
	@Override
	public GrandTotal remove(Serializable primaryKey)
		throws NoSuchGrandTotalException {

		Session session = null;

		try {
			session = openSession();

			GrandTotal grandTotal = (GrandTotal)session.get(
				GrandTotalImpl.class, primaryKey);

			if (grandTotal == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchGrandTotalException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(grandTotal);
		}
		catch (NoSuchGrandTotalException noSuchEntityException) {
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
	protected GrandTotal removeImpl(GrandTotal grandTotal) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(grandTotal)) {
				grandTotal = (GrandTotal)session.get(
					GrandTotalImpl.class, grandTotal.getPrimaryKeyObj());
			}

			if (grandTotal != null) {
				session.delete(grandTotal);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (grandTotal != null) {
			clearCache(grandTotal);
		}

		return grandTotal;
	}

	@Override
	public GrandTotal updateImpl(GrandTotal grandTotal) {
		boolean isNew = grandTotal.isNew();

		if (!(grandTotal instanceof GrandTotalModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(grandTotal.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(grandTotal);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in grandTotal proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom GrandTotal implementation " +
					grandTotal.getClass());
		}

		GrandTotalModelImpl grandTotalModelImpl =
			(GrandTotalModelImpl)grandTotal;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (grandTotal.getCreateDate() == null)) {
			if (serviceContext == null) {
				grandTotal.setCreateDate(date);
			}
			else {
				grandTotal.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!grandTotalModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				grandTotal.setModifiedDate(date);
			}
			else {
				grandTotal.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(grandTotal);
			}
			else {
				grandTotal = (GrandTotal)session.merge(grandTotal);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			GrandTotalImpl.class, grandTotalModelImpl, false, true);

		cacheUniqueFindersCache(grandTotalModelImpl);

		if (isNew) {
			grandTotal.setNew(false);
		}

		grandTotal.resetOriginalValues();

		return grandTotal;
	}

	/**
	 * Returns the grand total with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the grand total
	 * @return the grand total
	 * @throws NoSuchGrandTotalException if a grand total with the primary key could not be found
	 */
	@Override
	public GrandTotal findByPrimaryKey(Serializable primaryKey)
		throws NoSuchGrandTotalException {

		GrandTotal grandTotal = fetchByPrimaryKey(primaryKey);

		if (grandTotal == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchGrandTotalException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return grandTotal;
	}

	/**
	 * Returns the grand total with the primary key or throws a <code>NoSuchGrandTotalException</code> if it could not be found.
	 *
	 * @param grandTotalId the primary key of the grand total
	 * @return the grand total
	 * @throws NoSuchGrandTotalException if a grand total with the primary key could not be found
	 */
	@Override
	public GrandTotal findByPrimaryKey(long grandTotalId)
		throws NoSuchGrandTotalException {

		return findByPrimaryKey((Serializable)grandTotalId);
	}

	/**
	 * Returns the grand total with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param grandTotalId the primary key of the grand total
	 * @return the grand total, or <code>null</code> if a grand total with the primary key could not be found
	 */
	@Override
	public GrandTotal fetchByPrimaryKey(long grandTotalId) {
		return fetchByPrimaryKey((Serializable)grandTotalId);
	}

	/**
	 * Returns all the grand totals.
	 *
	 * @return the grand totals
	 */
	@Override
	public List<GrandTotal> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the grand totals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GrandTotalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of grand totals
	 * @param end the upper bound of the range of grand totals (not inclusive)
	 * @return the range of grand totals
	 */
	@Override
	public List<GrandTotal> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the grand totals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GrandTotalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of grand totals
	 * @param end the upper bound of the range of grand totals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of grand totals
	 */
	@Override
	public List<GrandTotal> findAll(
		int start, int end, OrderByComparator<GrandTotal> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the grand totals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GrandTotalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of grand totals
	 * @param end the upper bound of the range of grand totals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of grand totals
	 */
	@Override
	public List<GrandTotal> findAll(
		int start, int end, OrderByComparator<GrandTotal> orderByComparator,
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

		List<GrandTotal> list = null;

		if (useFinderCache) {
			list = (List<GrandTotal>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_GRANDTOTAL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_GRANDTOTAL;

				sql = sql.concat(GrandTotalModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<GrandTotal>)QueryUtil.list(
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
	 * Removes all the grand totals from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (GrandTotal grandTotal : findAll()) {
			remove(grandTotal);
		}
	}

	/**
	 * Returns the number of grand totals.
	 *
	 * @return the number of grand totals
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_GRANDTOTAL);

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
		return "grandTotalId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_GRANDTOTAL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return GrandTotalModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the grand total persistence.
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

		GrandTotalUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		GrandTotalUtil.setPersistence(null);

		entityCache.removeCache(GrandTotalImpl.class.getName());
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

	private static final String _SQL_SELECT_GRANDTOTAL =
		"SELECT grandTotal FROM GrandTotal grandTotal";

	private static final String _SQL_SELECT_GRANDTOTAL_WHERE =
		"SELECT grandTotal FROM GrandTotal grandTotal WHERE ";

	private static final String _SQL_COUNT_GRANDTOTAL =
		"SELECT COUNT(grandTotal) FROM GrandTotal grandTotal";

	private static final String _SQL_COUNT_GRANDTOTAL_WHERE =
		"SELECT COUNT(grandTotal) FROM GrandTotal grandTotal WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "grandTotal.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No GrandTotal exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No GrandTotal exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		GrandTotalPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}