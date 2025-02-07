/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence.impl;

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

import com.nbp.hsra.application.service.exception.NoSuchDetailOfSourcesException;
import com.nbp.hsra.application.service.model.DetailOfSources;
import com.nbp.hsra.application.service.model.DetailOfSourcesTable;
import com.nbp.hsra.application.service.model.impl.DetailOfSourcesImpl;
import com.nbp.hsra.application.service.model.impl.DetailOfSourcesModelImpl;
import com.nbp.hsra.application.service.service.persistence.DetailOfSourcesPersistence;
import com.nbp.hsra.application.service.service.persistence.DetailOfSourcesUtil;
import com.nbp.hsra.application.service.service.persistence.impl.constants.HSRA_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the detail of sources service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = DetailOfSourcesPersistence.class)
public class DetailOfSourcesPersistenceImpl
	extends BasePersistenceImpl<DetailOfSources>
	implements DetailOfSourcesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DetailOfSourcesUtil</code> to access the detail of sources persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DetailOfSourcesImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetHsraById;
	private FinderPath _finderPathCountBygetHsraById;

	/**
	 * Returns the detail of sources where hsraApplicationId = &#63; or throws a <code>NoSuchDetailOfSourcesException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching detail of sources
	 * @throws NoSuchDetailOfSourcesException if a matching detail of sources could not be found
	 */
	@Override
	public DetailOfSources findBygetHsraById(long hsraApplicationId)
		throws NoSuchDetailOfSourcesException {

		DetailOfSources detailOfSources = fetchBygetHsraById(hsraApplicationId);

		if (detailOfSources == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchDetailOfSourcesException(sb.toString());
		}

		return detailOfSources;
	}

	/**
	 * Returns the detail of sources where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching detail of sources, or <code>null</code> if a matching detail of sources could not be found
	 */
	@Override
	public DetailOfSources fetchBygetHsraById(long hsraApplicationId) {
		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the detail of sources where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching detail of sources, or <code>null</code> if a matching detail of sources could not be found
	 */
	@Override
	public DetailOfSources fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {hsraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHsraById, finderArgs, this);
		}

		if (result instanceof DetailOfSources) {
			DetailOfSources detailOfSources = (DetailOfSources)result;

			if (hsraApplicationId != detailOfSources.getHsraApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_DETAILOFSOURCES_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<DetailOfSources> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHsraById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {hsraApplicationId};
							}

							_log.warn(
								"DetailOfSourcesPersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					DetailOfSources detailOfSources = list.get(0);

					result = detailOfSources;

					cacheResult(detailOfSources);
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
			return (DetailOfSources)result;
		}
	}

	/**
	 * Removes the detail of sources where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the detail of sources that was removed
	 */
	@Override
	public DetailOfSources removeBygetHsraById(long hsraApplicationId)
		throws NoSuchDetailOfSourcesException {

		DetailOfSources detailOfSources = findBygetHsraById(hsraApplicationId);

		return remove(detailOfSources);
	}

	/**
	 * Returns the number of detail of sourceses where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching detail of sourceses
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DETAILOFSOURCES_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

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

	private static final String _FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2 =
		"detailOfSources.hsraApplicationId = ?";

	public DetailOfSourcesPersistenceImpl() {
		setModelClass(DetailOfSources.class);

		setModelImplClass(DetailOfSourcesImpl.class);
		setModelPKClass(long.class);

		setTable(DetailOfSourcesTable.INSTANCE);
	}

	/**
	 * Caches the detail of sources in the entity cache if it is enabled.
	 *
	 * @param detailOfSources the detail of sources
	 */
	@Override
	public void cacheResult(DetailOfSources detailOfSources) {
		entityCache.putResult(
			DetailOfSourcesImpl.class, detailOfSources.getPrimaryKey(),
			detailOfSources);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {detailOfSources.getHsraApplicationId()},
			detailOfSources);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the detail of sourceses in the entity cache if it is enabled.
	 *
	 * @param detailOfSourceses the detail of sourceses
	 */
	@Override
	public void cacheResult(List<DetailOfSources> detailOfSourceses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (detailOfSourceses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (DetailOfSources detailOfSources : detailOfSourceses) {
			if (entityCache.getResult(
					DetailOfSourcesImpl.class,
					detailOfSources.getPrimaryKey()) == null) {

				cacheResult(detailOfSources);
			}
		}
	}

	/**
	 * Clears the cache for all detail of sourceses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DetailOfSourcesImpl.class);

		finderCache.clearCache(DetailOfSourcesImpl.class);
	}

	/**
	 * Clears the cache for the detail of sources.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DetailOfSources detailOfSources) {
		entityCache.removeResult(DetailOfSourcesImpl.class, detailOfSources);
	}

	@Override
	public void clearCache(List<DetailOfSources> detailOfSourceses) {
		for (DetailOfSources detailOfSources : detailOfSourceses) {
			entityCache.removeResult(
				DetailOfSourcesImpl.class, detailOfSources);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DetailOfSourcesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(DetailOfSourcesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		DetailOfSourcesModelImpl detailOfSourcesModelImpl) {

		Object[] args = new Object[] {
			detailOfSourcesModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args, detailOfSourcesModelImpl);
	}

	/**
	 * Creates a new detail of sources with the primary key. Does not add the detail of sources to the database.
	 *
	 * @param detailOfSourcesId the primary key for the new detail of sources
	 * @return the new detail of sources
	 */
	@Override
	public DetailOfSources create(long detailOfSourcesId) {
		DetailOfSources detailOfSources = new DetailOfSourcesImpl();

		detailOfSources.setNew(true);
		detailOfSources.setPrimaryKey(detailOfSourcesId);

		detailOfSources.setCompanyId(CompanyThreadLocal.getCompanyId());

		return detailOfSources;
	}

	/**
	 * Removes the detail of sources with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param detailOfSourcesId the primary key of the detail of sources
	 * @return the detail of sources that was removed
	 * @throws NoSuchDetailOfSourcesException if a detail of sources with the primary key could not be found
	 */
	@Override
	public DetailOfSources remove(long detailOfSourcesId)
		throws NoSuchDetailOfSourcesException {

		return remove((Serializable)detailOfSourcesId);
	}

	/**
	 * Removes the detail of sources with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the detail of sources
	 * @return the detail of sources that was removed
	 * @throws NoSuchDetailOfSourcesException if a detail of sources with the primary key could not be found
	 */
	@Override
	public DetailOfSources remove(Serializable primaryKey)
		throws NoSuchDetailOfSourcesException {

		Session session = null;

		try {
			session = openSession();

			DetailOfSources detailOfSources = (DetailOfSources)session.get(
				DetailOfSourcesImpl.class, primaryKey);

			if (detailOfSources == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDetailOfSourcesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(detailOfSources);
		}
		catch (NoSuchDetailOfSourcesException noSuchEntityException) {
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
	protected DetailOfSources removeImpl(DetailOfSources detailOfSources) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(detailOfSources)) {
				detailOfSources = (DetailOfSources)session.get(
					DetailOfSourcesImpl.class,
					detailOfSources.getPrimaryKeyObj());
			}

			if (detailOfSources != null) {
				session.delete(detailOfSources);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (detailOfSources != null) {
			clearCache(detailOfSources);
		}

		return detailOfSources;
	}

	@Override
	public DetailOfSources updateImpl(DetailOfSources detailOfSources) {
		boolean isNew = detailOfSources.isNew();

		if (!(detailOfSources instanceof DetailOfSourcesModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(detailOfSources.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					detailOfSources);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in detailOfSources proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom DetailOfSources implementation " +
					detailOfSources.getClass());
		}

		DetailOfSourcesModelImpl detailOfSourcesModelImpl =
			(DetailOfSourcesModelImpl)detailOfSources;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (detailOfSources.getCreateDate() == null)) {
			if (serviceContext == null) {
				detailOfSources.setCreateDate(date);
			}
			else {
				detailOfSources.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!detailOfSourcesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				detailOfSources.setModifiedDate(date);
			}
			else {
				detailOfSources.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(detailOfSources);
			}
			else {
				detailOfSources = (DetailOfSources)session.merge(
					detailOfSources);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			DetailOfSourcesImpl.class, detailOfSourcesModelImpl, false, true);

		cacheUniqueFindersCache(detailOfSourcesModelImpl);

		if (isNew) {
			detailOfSources.setNew(false);
		}

		detailOfSources.resetOriginalValues();

		return detailOfSources;
	}

	/**
	 * Returns the detail of sources with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the detail of sources
	 * @return the detail of sources
	 * @throws NoSuchDetailOfSourcesException if a detail of sources with the primary key could not be found
	 */
	@Override
	public DetailOfSources findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDetailOfSourcesException {

		DetailOfSources detailOfSources = fetchByPrimaryKey(primaryKey);

		if (detailOfSources == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDetailOfSourcesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return detailOfSources;
	}

	/**
	 * Returns the detail of sources with the primary key or throws a <code>NoSuchDetailOfSourcesException</code> if it could not be found.
	 *
	 * @param detailOfSourcesId the primary key of the detail of sources
	 * @return the detail of sources
	 * @throws NoSuchDetailOfSourcesException if a detail of sources with the primary key could not be found
	 */
	@Override
	public DetailOfSources findByPrimaryKey(long detailOfSourcesId)
		throws NoSuchDetailOfSourcesException {

		return findByPrimaryKey((Serializable)detailOfSourcesId);
	}

	/**
	 * Returns the detail of sources with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param detailOfSourcesId the primary key of the detail of sources
	 * @return the detail of sources, or <code>null</code> if a detail of sources with the primary key could not be found
	 */
	@Override
	public DetailOfSources fetchByPrimaryKey(long detailOfSourcesId) {
		return fetchByPrimaryKey((Serializable)detailOfSourcesId);
	}

	/**
	 * Returns all the detail of sourceses.
	 *
	 * @return the detail of sourceses
	 */
	@Override
	public List<DetailOfSources> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the detail of sourceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfSourcesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of sourceses
	 * @param end the upper bound of the range of detail of sourceses (not inclusive)
	 * @return the range of detail of sourceses
	 */
	@Override
	public List<DetailOfSources> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the detail of sourceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfSourcesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of sourceses
	 * @param end the upper bound of the range of detail of sourceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of detail of sourceses
	 */
	@Override
	public List<DetailOfSources> findAll(
		int start, int end,
		OrderByComparator<DetailOfSources> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the detail of sourceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfSourcesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of sourceses
	 * @param end the upper bound of the range of detail of sourceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of detail of sourceses
	 */
	@Override
	public List<DetailOfSources> findAll(
		int start, int end,
		OrderByComparator<DetailOfSources> orderByComparator,
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

		List<DetailOfSources> list = null;

		if (useFinderCache) {
			list = (List<DetailOfSources>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DETAILOFSOURCES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DETAILOFSOURCES;

				sql = sql.concat(DetailOfSourcesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<DetailOfSources>)QueryUtil.list(
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
	 * Removes all the detail of sourceses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DetailOfSources detailOfSources : findAll()) {
			remove(detailOfSources);
		}
	}

	/**
	 * Returns the number of detail of sourceses.
	 *
	 * @return the number of detail of sourceses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_DETAILOFSOURCES);

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
		return "detailOfSourcesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_DETAILOFSOURCES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DetailOfSourcesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the detail of sources persistence.
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

		_finderPathFetchBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, true);

		_finderPathCountBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, false);

		DetailOfSourcesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		DetailOfSourcesUtil.setPersistence(null);

		entityCache.removeCache(DetailOfSourcesImpl.class.getName());
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_DETAILOFSOURCES =
		"SELECT detailOfSources FROM DetailOfSources detailOfSources";

	private static final String _SQL_SELECT_DETAILOFSOURCES_WHERE =
		"SELECT detailOfSources FROM DetailOfSources detailOfSources WHERE ";

	private static final String _SQL_COUNT_DETAILOFSOURCES =
		"SELECT COUNT(detailOfSources) FROM DetailOfSources detailOfSources";

	private static final String _SQL_COUNT_DETAILOFSOURCES_WHERE =
		"SELECT COUNT(detailOfSources) FROM DetailOfSources detailOfSources WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "detailOfSources.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No DetailOfSources exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No DetailOfSources exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		DetailOfSourcesPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}