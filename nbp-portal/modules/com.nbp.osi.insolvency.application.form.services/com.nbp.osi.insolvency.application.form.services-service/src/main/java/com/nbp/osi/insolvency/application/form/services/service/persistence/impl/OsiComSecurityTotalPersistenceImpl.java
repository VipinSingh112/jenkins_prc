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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchOsiComSecurityTotalException;
import com.nbp.osi.insolvency.application.form.services.model.OsiComSecurityTotal;
import com.nbp.osi.insolvency.application.form.services.model.OsiComSecurityTotalTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.OsiComSecurityTotalImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.OsiComSecurityTotalModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiComSecurityTotalPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.OsiComSecurityTotalUtil;
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
 * The persistence implementation for the osi com security total service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiComSecurityTotalPersistence.class)
public class OsiComSecurityTotalPersistenceImpl
	extends BasePersistenceImpl<OsiComSecurityTotal>
	implements OsiComSecurityTotalPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiComSecurityTotalUtil</code> to access the osi com security total persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiComSecurityTotalImpl.class.getName();

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
	 * Returns the osi com security total where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiComSecurityTotalException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi com security total
	 * @throws NoSuchOsiComSecurityTotalException if a matching osi com security total could not be found
	 */
	@Override
	public OsiComSecurityTotal findBygetOsiById(long osiInsolvencyId)
		throws NoSuchOsiComSecurityTotalException {

		OsiComSecurityTotal osiComSecurityTotal = fetchBygetOsiById(
			osiInsolvencyId);

		if (osiComSecurityTotal == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiComSecurityTotalException(sb.toString());
		}

		return osiComSecurityTotal;
	}

	/**
	 * Returns the osi com security total where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi com security total, or <code>null</code> if a matching osi com security total could not be found
	 */
	@Override
	public OsiComSecurityTotal fetchBygetOsiById(long osiInsolvencyId) {
		return fetchBygetOsiById(osiInsolvencyId, true);
	}

	/**
	 * Returns the osi com security total where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi com security total, or <code>null</code> if a matching osi com security total could not be found
	 */
	@Override
	public OsiComSecurityTotal fetchBygetOsiById(
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

		if (result instanceof OsiComSecurityTotal) {
			OsiComSecurityTotal osiComSecurityTotal =
				(OsiComSecurityTotal)result;

			if (osiInsolvencyId != osiComSecurityTotal.getOsiInsolvencyId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSICOMSECURITYTOTAL_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<OsiComSecurityTotal> list = query.list();

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
								"OsiComSecurityTotalPersistenceImpl.fetchBygetOsiById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiComSecurityTotal osiComSecurityTotal = list.get(0);

					result = osiComSecurityTotal;

					cacheResult(osiComSecurityTotal);
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
			return (OsiComSecurityTotal)result;
		}
	}

	/**
	 * Removes the osi com security total where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi com security total that was removed
	 */
	@Override
	public OsiComSecurityTotal removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchOsiComSecurityTotalException {

		OsiComSecurityTotal osiComSecurityTotal = findBygetOsiById(
			osiInsolvencyId);

		return remove(osiComSecurityTotal);
	}

	/**
	 * Returns the number of osi com security totals where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi com security totals
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSICOMSECURITYTOTAL_WHERE);

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
		"osiComSecurityTotal.osiInsolvencyId = ?";

	public OsiComSecurityTotalPersistenceImpl() {
		setModelClass(OsiComSecurityTotal.class);

		setModelImplClass(OsiComSecurityTotalImpl.class);
		setModelPKClass(long.class);

		setTable(OsiComSecurityTotalTable.INSTANCE);
	}

	/**
	 * Caches the osi com security total in the entity cache if it is enabled.
	 *
	 * @param osiComSecurityTotal the osi com security total
	 */
	@Override
	public void cacheResult(OsiComSecurityTotal osiComSecurityTotal) {
		entityCache.putResult(
			OsiComSecurityTotalImpl.class, osiComSecurityTotal.getPrimaryKey(),
			osiComSecurityTotal);

		finderCache.putResult(
			_finderPathFetchBygetOsiById,
			new Object[] {osiComSecurityTotal.getOsiInsolvencyId()},
			osiComSecurityTotal);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi com security totals in the entity cache if it is enabled.
	 *
	 * @param osiComSecurityTotals the osi com security totals
	 */
	@Override
	public void cacheResult(List<OsiComSecurityTotal> osiComSecurityTotals) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiComSecurityTotals.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiComSecurityTotal osiComSecurityTotal : osiComSecurityTotals) {
			if (entityCache.getResult(
					OsiComSecurityTotalImpl.class,
					osiComSecurityTotal.getPrimaryKey()) == null) {

				cacheResult(osiComSecurityTotal);
			}
		}
	}

	/**
	 * Clears the cache for all osi com security totals.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiComSecurityTotalImpl.class);

		finderCache.clearCache(OsiComSecurityTotalImpl.class);
	}

	/**
	 * Clears the cache for the osi com security total.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OsiComSecurityTotal osiComSecurityTotal) {
		entityCache.removeResult(
			OsiComSecurityTotalImpl.class, osiComSecurityTotal);
	}

	@Override
	public void clearCache(List<OsiComSecurityTotal> osiComSecurityTotals) {
		for (OsiComSecurityTotal osiComSecurityTotal : osiComSecurityTotals) {
			entityCache.removeResult(
				OsiComSecurityTotalImpl.class, osiComSecurityTotal);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiComSecurityTotalImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(OsiComSecurityTotalImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiComSecurityTotalModelImpl osiComSecurityTotalModelImpl) {

		Object[] args = new Object[] {
			osiComSecurityTotalModelImpl.getOsiInsolvencyId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiById, args, osiComSecurityTotalModelImpl);
	}

	/**
	 * Creates a new osi com security total with the primary key. Does not add the osi com security total to the database.
	 *
	 * @param osiComSecurityTotalId the primary key for the new osi com security total
	 * @return the new osi com security total
	 */
	@Override
	public OsiComSecurityTotal create(long osiComSecurityTotalId) {
		OsiComSecurityTotal osiComSecurityTotal = new OsiComSecurityTotalImpl();

		osiComSecurityTotal.setNew(true);
		osiComSecurityTotal.setPrimaryKey(osiComSecurityTotalId);

		osiComSecurityTotal.setCompanyId(CompanyThreadLocal.getCompanyId());

		return osiComSecurityTotal;
	}

	/**
	 * Removes the osi com security total with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiComSecurityTotalId the primary key of the osi com security total
	 * @return the osi com security total that was removed
	 * @throws NoSuchOsiComSecurityTotalException if a osi com security total with the primary key could not be found
	 */
	@Override
	public OsiComSecurityTotal remove(long osiComSecurityTotalId)
		throws NoSuchOsiComSecurityTotalException {

		return remove((Serializable)osiComSecurityTotalId);
	}

	/**
	 * Removes the osi com security total with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi com security total
	 * @return the osi com security total that was removed
	 * @throws NoSuchOsiComSecurityTotalException if a osi com security total with the primary key could not be found
	 */
	@Override
	public OsiComSecurityTotal remove(Serializable primaryKey)
		throws NoSuchOsiComSecurityTotalException {

		Session session = null;

		try {
			session = openSession();

			OsiComSecurityTotal osiComSecurityTotal =
				(OsiComSecurityTotal)session.get(
					OsiComSecurityTotalImpl.class, primaryKey);

			if (osiComSecurityTotal == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiComSecurityTotalException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiComSecurityTotal);
		}
		catch (NoSuchOsiComSecurityTotalException noSuchEntityException) {
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
	protected OsiComSecurityTotal removeImpl(
		OsiComSecurityTotal osiComSecurityTotal) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiComSecurityTotal)) {
				osiComSecurityTotal = (OsiComSecurityTotal)session.get(
					OsiComSecurityTotalImpl.class,
					osiComSecurityTotal.getPrimaryKeyObj());
			}

			if (osiComSecurityTotal != null) {
				session.delete(osiComSecurityTotal);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiComSecurityTotal != null) {
			clearCache(osiComSecurityTotal);
		}

		return osiComSecurityTotal;
	}

	@Override
	public OsiComSecurityTotal updateImpl(
		OsiComSecurityTotal osiComSecurityTotal) {

		boolean isNew = osiComSecurityTotal.isNew();

		if (!(osiComSecurityTotal instanceof OsiComSecurityTotalModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiComSecurityTotal.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiComSecurityTotal);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiComSecurityTotal proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiComSecurityTotal implementation " +
					osiComSecurityTotal.getClass());
		}

		OsiComSecurityTotalModelImpl osiComSecurityTotalModelImpl =
			(OsiComSecurityTotalModelImpl)osiComSecurityTotal;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiComSecurityTotal.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiComSecurityTotal.setCreateDate(date);
			}
			else {
				osiComSecurityTotal.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiComSecurityTotalModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiComSecurityTotal.setModifiedDate(date);
			}
			else {
				osiComSecurityTotal.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiComSecurityTotal);
			}
			else {
				osiComSecurityTotal = (OsiComSecurityTotal)session.merge(
					osiComSecurityTotal);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiComSecurityTotalImpl.class, osiComSecurityTotalModelImpl, false,
			true);

		cacheUniqueFindersCache(osiComSecurityTotalModelImpl);

		if (isNew) {
			osiComSecurityTotal.setNew(false);
		}

		osiComSecurityTotal.resetOriginalValues();

		return osiComSecurityTotal;
	}

	/**
	 * Returns the osi com security total with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi com security total
	 * @return the osi com security total
	 * @throws NoSuchOsiComSecurityTotalException if a osi com security total with the primary key could not be found
	 */
	@Override
	public OsiComSecurityTotal findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOsiComSecurityTotalException {

		OsiComSecurityTotal osiComSecurityTotal = fetchByPrimaryKey(primaryKey);

		if (osiComSecurityTotal == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiComSecurityTotalException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiComSecurityTotal;
	}

	/**
	 * Returns the osi com security total with the primary key or throws a <code>NoSuchOsiComSecurityTotalException</code> if it could not be found.
	 *
	 * @param osiComSecurityTotalId the primary key of the osi com security total
	 * @return the osi com security total
	 * @throws NoSuchOsiComSecurityTotalException if a osi com security total with the primary key could not be found
	 */
	@Override
	public OsiComSecurityTotal findByPrimaryKey(long osiComSecurityTotalId)
		throws NoSuchOsiComSecurityTotalException {

		return findByPrimaryKey((Serializable)osiComSecurityTotalId);
	}

	/**
	 * Returns the osi com security total with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiComSecurityTotalId the primary key of the osi com security total
	 * @return the osi com security total, or <code>null</code> if a osi com security total with the primary key could not be found
	 */
	@Override
	public OsiComSecurityTotal fetchByPrimaryKey(long osiComSecurityTotalId) {
		return fetchByPrimaryKey((Serializable)osiComSecurityTotalId);
	}

	/**
	 * Returns all the osi com security totals.
	 *
	 * @return the osi com security totals
	 */
	@Override
	public List<OsiComSecurityTotal> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi com security totals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiComSecurityTotalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi com security totals
	 * @param end the upper bound of the range of osi com security totals (not inclusive)
	 * @return the range of osi com security totals
	 */
	@Override
	public List<OsiComSecurityTotal> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi com security totals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiComSecurityTotalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi com security totals
	 * @param end the upper bound of the range of osi com security totals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi com security totals
	 */
	@Override
	public List<OsiComSecurityTotal> findAll(
		int start, int end,
		OrderByComparator<OsiComSecurityTotal> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi com security totals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiComSecurityTotalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi com security totals
	 * @param end the upper bound of the range of osi com security totals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi com security totals
	 */
	@Override
	public List<OsiComSecurityTotal> findAll(
		int start, int end,
		OrderByComparator<OsiComSecurityTotal> orderByComparator,
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

		List<OsiComSecurityTotal> list = null;

		if (useFinderCache) {
			list = (List<OsiComSecurityTotal>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSICOMSECURITYTOTAL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSICOMSECURITYTOTAL;

				sql = sql.concat(OsiComSecurityTotalModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiComSecurityTotal>)QueryUtil.list(
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
	 * Removes all the osi com security totals from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiComSecurityTotal osiComSecurityTotal : findAll()) {
			remove(osiComSecurityTotal);
		}
	}

	/**
	 * Returns the number of osi com security totals.
	 *
	 * @return the number of osi com security totals
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
					_SQL_COUNT_OSICOMSECURITYTOTAL);

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
		return "osiComSecurityTotalId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSICOMSECURITYTOTAL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiComSecurityTotalModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi com security total persistence.
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

		OsiComSecurityTotalUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiComSecurityTotalUtil.setPersistence(null);

		entityCache.removeCache(OsiComSecurityTotalImpl.class.getName());
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

	private static final String _SQL_SELECT_OSICOMSECURITYTOTAL =
		"SELECT osiComSecurityTotal FROM OsiComSecurityTotal osiComSecurityTotal";

	private static final String _SQL_SELECT_OSICOMSECURITYTOTAL_WHERE =
		"SELECT osiComSecurityTotal FROM OsiComSecurityTotal osiComSecurityTotal WHERE ";

	private static final String _SQL_COUNT_OSICOMSECURITYTOTAL =
		"SELECT COUNT(osiComSecurityTotal) FROM OsiComSecurityTotal osiComSecurityTotal";

	private static final String _SQL_COUNT_OSICOMSECURITYTOTAL_WHERE =
		"SELECT COUNT(osiComSecurityTotal) FROM OsiComSecurityTotal osiComSecurityTotal WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "osiComSecurityTotal.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiComSecurityTotal exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiComSecurityTotal exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiComSecurityTotalPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}