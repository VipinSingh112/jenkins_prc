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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchFinancialPositionException;
import com.nbp.osi.insolvency.application.form.services.model.FinancialPosition;
import com.nbp.osi.insolvency.application.form.services.model.FinancialPositionTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.FinancialPositionImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.FinancialPositionModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.FinancialPositionPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.FinancialPositionUtil;
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
 * The persistence implementation for the financial position service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FinancialPositionPersistence.class)
public class FinancialPositionPersistenceImpl
	extends BasePersistenceImpl<FinancialPosition>
	implements FinancialPositionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FinancialPositionUtil</code> to access the financial position persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FinancialPositionImpl.class.getName();

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
	 * Returns the financial position where osiInsolvencyId = &#63; or throws a <code>NoSuchFinancialPositionException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching financial position
	 * @throws NoSuchFinancialPositionException if a matching financial position could not be found
	 */
	@Override
	public FinancialPosition findBygetOsiById(long osiInsolvencyId)
		throws NoSuchFinancialPositionException {

		FinancialPosition financialPosition = fetchBygetOsiById(
			osiInsolvencyId);

		if (financialPosition == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiInsolvencyId=");
			sb.append(osiInsolvencyId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFinancialPositionException(sb.toString());
		}

		return financialPosition;
	}

	/**
	 * Returns the financial position where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching financial position, or <code>null</code> if a matching financial position could not be found
	 */
	@Override
	public FinancialPosition fetchBygetOsiById(long osiInsolvencyId) {
		return fetchBygetOsiById(osiInsolvencyId, true);
	}

	/**
	 * Returns the financial position where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching financial position, or <code>null</code> if a matching financial position could not be found
	 */
	@Override
	public FinancialPosition fetchBygetOsiById(
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

		if (result instanceof FinancialPosition) {
			FinancialPosition financialPosition = (FinancialPosition)result;

			if (osiInsolvencyId != financialPosition.getOsiInsolvencyId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FINANCIALPOSITION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				List<FinancialPosition> list = query.list();

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
								"FinancialPositionPersistenceImpl.fetchBygetOsiById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FinancialPosition financialPosition = list.get(0);

					result = financialPosition;

					cacheResult(financialPosition);
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
			return (FinancialPosition)result;
		}
	}

	/**
	 * Removes the financial position where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the financial position that was removed
	 */
	@Override
	public FinancialPosition removeBygetOsiById(long osiInsolvencyId)
		throws NoSuchFinancialPositionException {

		FinancialPosition financialPosition = findBygetOsiById(osiInsolvencyId);

		return remove(financialPosition);
	}

	/**
	 * Returns the number of financial positions where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching financial positions
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FINANCIALPOSITION_WHERE);

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
		"financialPosition.osiInsolvencyId = ?";

	public FinancialPositionPersistenceImpl() {
		setModelClass(FinancialPosition.class);

		setModelImplClass(FinancialPositionImpl.class);
		setModelPKClass(long.class);

		setTable(FinancialPositionTable.INSTANCE);
	}

	/**
	 * Caches the financial position in the entity cache if it is enabled.
	 *
	 * @param financialPosition the financial position
	 */
	@Override
	public void cacheResult(FinancialPosition financialPosition) {
		entityCache.putResult(
			FinancialPositionImpl.class, financialPosition.getPrimaryKey(),
			financialPosition);

		finderCache.putResult(
			_finderPathFetchBygetOsiById,
			new Object[] {financialPosition.getOsiInsolvencyId()},
			financialPosition);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the financial positions in the entity cache if it is enabled.
	 *
	 * @param financialPositions the financial positions
	 */
	@Override
	public void cacheResult(List<FinancialPosition> financialPositions) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (financialPositions.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FinancialPosition financialPosition : financialPositions) {
			if (entityCache.getResult(
					FinancialPositionImpl.class,
					financialPosition.getPrimaryKey()) == null) {

				cacheResult(financialPosition);
			}
		}
	}

	/**
	 * Clears the cache for all financial positions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FinancialPositionImpl.class);

		finderCache.clearCache(FinancialPositionImpl.class);
	}

	/**
	 * Clears the cache for the financial position.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FinancialPosition financialPosition) {
		entityCache.removeResult(
			FinancialPositionImpl.class, financialPosition);
	}

	@Override
	public void clearCache(List<FinancialPosition> financialPositions) {
		for (FinancialPosition financialPosition : financialPositions) {
			entityCache.removeResult(
				FinancialPositionImpl.class, financialPosition);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FinancialPositionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(FinancialPositionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FinancialPositionModelImpl financialPositionModelImpl) {

		Object[] args = new Object[] {
			financialPositionModelImpl.getOsiInsolvencyId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiById, args, financialPositionModelImpl);
	}

	/**
	 * Creates a new financial position with the primary key. Does not add the financial position to the database.
	 *
	 * @param financialPositionId the primary key for the new financial position
	 * @return the new financial position
	 */
	@Override
	public FinancialPosition create(long financialPositionId) {
		FinancialPosition financialPosition = new FinancialPositionImpl();

		financialPosition.setNew(true);
		financialPosition.setPrimaryKey(financialPositionId);

		financialPosition.setCompanyId(CompanyThreadLocal.getCompanyId());

		return financialPosition;
	}

	/**
	 * Removes the financial position with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param financialPositionId the primary key of the financial position
	 * @return the financial position that was removed
	 * @throws NoSuchFinancialPositionException if a financial position with the primary key could not be found
	 */
	@Override
	public FinancialPosition remove(long financialPositionId)
		throws NoSuchFinancialPositionException {

		return remove((Serializable)financialPositionId);
	}

	/**
	 * Removes the financial position with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the financial position
	 * @return the financial position that was removed
	 * @throws NoSuchFinancialPositionException if a financial position with the primary key could not be found
	 */
	@Override
	public FinancialPosition remove(Serializable primaryKey)
		throws NoSuchFinancialPositionException {

		Session session = null;

		try {
			session = openSession();

			FinancialPosition financialPosition =
				(FinancialPosition)session.get(
					FinancialPositionImpl.class, primaryKey);

			if (financialPosition == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFinancialPositionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(financialPosition);
		}
		catch (NoSuchFinancialPositionException noSuchEntityException) {
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
	protected FinancialPosition removeImpl(
		FinancialPosition financialPosition) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(financialPosition)) {
				financialPosition = (FinancialPosition)session.get(
					FinancialPositionImpl.class,
					financialPosition.getPrimaryKeyObj());
			}

			if (financialPosition != null) {
				session.delete(financialPosition);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (financialPosition != null) {
			clearCache(financialPosition);
		}

		return financialPosition;
	}

	@Override
	public FinancialPosition updateImpl(FinancialPosition financialPosition) {
		boolean isNew = financialPosition.isNew();

		if (!(financialPosition instanceof FinancialPositionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(financialPosition.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					financialPosition);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in financialPosition proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FinancialPosition implementation " +
					financialPosition.getClass());
		}

		FinancialPositionModelImpl financialPositionModelImpl =
			(FinancialPositionModelImpl)financialPosition;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (financialPosition.getCreateDate() == null)) {
			if (serviceContext == null) {
				financialPosition.setCreateDate(date);
			}
			else {
				financialPosition.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!financialPositionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				financialPosition.setModifiedDate(date);
			}
			else {
				financialPosition.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(financialPosition);
			}
			else {
				financialPosition = (FinancialPosition)session.merge(
					financialPosition);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FinancialPositionImpl.class, financialPositionModelImpl, false,
			true);

		cacheUniqueFindersCache(financialPositionModelImpl);

		if (isNew) {
			financialPosition.setNew(false);
		}

		financialPosition.resetOriginalValues();

		return financialPosition;
	}

	/**
	 * Returns the financial position with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the financial position
	 * @return the financial position
	 * @throws NoSuchFinancialPositionException if a financial position with the primary key could not be found
	 */
	@Override
	public FinancialPosition findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFinancialPositionException {

		FinancialPosition financialPosition = fetchByPrimaryKey(primaryKey);

		if (financialPosition == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFinancialPositionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return financialPosition;
	}

	/**
	 * Returns the financial position with the primary key or throws a <code>NoSuchFinancialPositionException</code> if it could not be found.
	 *
	 * @param financialPositionId the primary key of the financial position
	 * @return the financial position
	 * @throws NoSuchFinancialPositionException if a financial position with the primary key could not be found
	 */
	@Override
	public FinancialPosition findByPrimaryKey(long financialPositionId)
		throws NoSuchFinancialPositionException {

		return findByPrimaryKey((Serializable)financialPositionId);
	}

	/**
	 * Returns the financial position with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param financialPositionId the primary key of the financial position
	 * @return the financial position, or <code>null</code> if a financial position with the primary key could not be found
	 */
	@Override
	public FinancialPosition fetchByPrimaryKey(long financialPositionId) {
		return fetchByPrimaryKey((Serializable)financialPositionId);
	}

	/**
	 * Returns all the financial positions.
	 *
	 * @return the financial positions
	 */
	@Override
	public List<FinancialPosition> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the financial positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FinancialPositionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of financial positions
	 * @param end the upper bound of the range of financial positions (not inclusive)
	 * @return the range of financial positions
	 */
	@Override
	public List<FinancialPosition> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the financial positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FinancialPositionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of financial positions
	 * @param end the upper bound of the range of financial positions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of financial positions
	 */
	@Override
	public List<FinancialPosition> findAll(
		int start, int end,
		OrderByComparator<FinancialPosition> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the financial positions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FinancialPositionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of financial positions
	 * @param end the upper bound of the range of financial positions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of financial positions
	 */
	@Override
	public List<FinancialPosition> findAll(
		int start, int end,
		OrderByComparator<FinancialPosition> orderByComparator,
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

		List<FinancialPosition> list = null;

		if (useFinderCache) {
			list = (List<FinancialPosition>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FINANCIALPOSITION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FINANCIALPOSITION;

				sql = sql.concat(FinancialPositionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FinancialPosition>)QueryUtil.list(
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
	 * Removes all the financial positions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FinancialPosition financialPosition : findAll()) {
			remove(financialPosition);
		}
	}

	/**
	 * Returns the number of financial positions.
	 *
	 * @return the number of financial positions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_FINANCIALPOSITION);

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
		return "financialPositionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FINANCIALPOSITION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FinancialPositionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the financial position persistence.
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

		FinancialPositionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FinancialPositionUtil.setPersistence(null);

		entityCache.removeCache(FinancialPositionImpl.class.getName());
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

	private static final String _SQL_SELECT_FINANCIALPOSITION =
		"SELECT financialPosition FROM FinancialPosition financialPosition";

	private static final String _SQL_SELECT_FINANCIALPOSITION_WHERE =
		"SELECT financialPosition FROM FinancialPosition financialPosition WHERE ";

	private static final String _SQL_COUNT_FINANCIALPOSITION =
		"SELECT COUNT(financialPosition) FROM FinancialPosition financialPosition";

	private static final String _SQL_COUNT_FINANCIALPOSITION_WHERE =
		"SELECT COUNT(financialPosition) FROM FinancialPosition financialPosition WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "financialPosition.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FinancialPosition exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FinancialPosition exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FinancialPositionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}