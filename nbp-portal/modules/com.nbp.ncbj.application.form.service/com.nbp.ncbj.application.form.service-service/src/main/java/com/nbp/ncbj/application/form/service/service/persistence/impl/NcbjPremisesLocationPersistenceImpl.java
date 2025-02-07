/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence.impl;

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

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjPremisesLocationException;
import com.nbp.ncbj.application.form.service.model.NcbjPremisesLocation;
import com.nbp.ncbj.application.form.service.model.NcbjPremisesLocationTable;
import com.nbp.ncbj.application.form.service.model.impl.NcbjPremisesLocationImpl;
import com.nbp.ncbj.application.form.service.model.impl.NcbjPremisesLocationModelImpl;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjPremisesLocationPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjPremisesLocationUtil;
import com.nbp.ncbj.application.form.service.service.persistence.impl.constants.FOOPersistenceConstants;

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
 * The persistence implementation for the ncbj premises location service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjPremisesLocationPersistence.class)
public class NcbjPremisesLocationPersistenceImpl
	extends BasePersistenceImpl<NcbjPremisesLocation>
	implements NcbjPremisesLocationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjPremisesLocationUtil</code> to access the ncbj premises location persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjPremisesLocationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetNCBJ_ById;
	private FinderPath _finderPathCountBygetNCBJ_ById;

	/**
	 * Returns the ncbj premises location where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjPremisesLocationException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj premises location
	 * @throws NoSuchNcbjPremisesLocationException if a matching ncbj premises location could not be found
	 */
	@Override
	public NcbjPremisesLocation findBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNcbjPremisesLocationException {

		NcbjPremisesLocation ncbjPremisesLocation = fetchBygetNCBJ_ById(
			ncbjApplicationId);

		if (ncbjPremisesLocation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncbjApplicationId=");
			sb.append(ncbjApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjPremisesLocationException(sb.toString());
		}

		return ncbjPremisesLocation;
	}

	/**
	 * Returns the ncbj premises location where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj premises location, or <code>null</code> if a matching ncbj premises location could not be found
	 */
	@Override
	public NcbjPremisesLocation fetchBygetNCBJ_ById(long ncbjApplicationId) {
		return fetchBygetNCBJ_ById(ncbjApplicationId, true);
	}

	/**
	 * Returns the ncbj premises location where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj premises location, or <code>null</code> if a matching ncbj premises location could not be found
	 */
	@Override
	public NcbjPremisesLocation fetchBygetNCBJ_ById(
		long ncbjApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ncbjApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNCBJ_ById, finderArgs, this);
		}

		if (result instanceof NcbjPremisesLocation) {
			NcbjPremisesLocation ncbjPremisesLocation =
				(NcbjPremisesLocation)result;

			if (ncbjApplicationId !=
					ncbjPremisesLocation.getNcbjApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJPREMISESLOCATION_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJ_BYID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				List<NcbjPremisesLocation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNCBJ_ById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {ncbjApplicationId};
							}

							_log.warn(
								"NcbjPremisesLocationPersistenceImpl.fetchBygetNCBJ_ById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjPremisesLocation ncbjPremisesLocation = list.get(0);

					result = ncbjPremisesLocation;

					cacheResult(ncbjPremisesLocation);
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
			return (NcbjPremisesLocation)result;
		}
	}

	/**
	 * Removes the ncbj premises location where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj premises location that was removed
	 */
	@Override
	public NcbjPremisesLocation removeBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNcbjPremisesLocationException {

		NcbjPremisesLocation ncbjPremisesLocation = findBygetNCBJ_ById(
			ncbjApplicationId);

		return remove(ncbjPremisesLocation);
	}

	/**
	 * Returns the number of ncbj premises locations where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj premises locations
	 */
	@Override
	public int countBygetNCBJ_ById(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCBJ_ById;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJPREMISESLOCATION_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJ_BYID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

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
		_FINDER_COLUMN_GETNCBJ_BYID_NCBJAPPLICATIONID_2 =
			"ncbjPremisesLocation.ncbjApplicationId = ?";

	public NcbjPremisesLocationPersistenceImpl() {
		setModelClass(NcbjPremisesLocation.class);

		setModelImplClass(NcbjPremisesLocationImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjPremisesLocationTable.INSTANCE);
	}

	/**
	 * Caches the ncbj premises location in the entity cache if it is enabled.
	 *
	 * @param ncbjPremisesLocation the ncbj premises location
	 */
	@Override
	public void cacheResult(NcbjPremisesLocation ncbjPremisesLocation) {
		entityCache.putResult(
			NcbjPremisesLocationImpl.class,
			ncbjPremisesLocation.getPrimaryKey(), ncbjPremisesLocation);

		finderCache.putResult(
			_finderPathFetchBygetNCBJ_ById,
			new Object[] {ncbjPremisesLocation.getNcbjApplicationId()},
			ncbjPremisesLocation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj premises locations in the entity cache if it is enabled.
	 *
	 * @param ncbjPremisesLocations the ncbj premises locations
	 */
	@Override
	public void cacheResult(List<NcbjPremisesLocation> ncbjPremisesLocations) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjPremisesLocations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjPremisesLocation ncbjPremisesLocation :
				ncbjPremisesLocations) {

			if (entityCache.getResult(
					NcbjPremisesLocationImpl.class,
					ncbjPremisesLocation.getPrimaryKey()) == null) {

				cacheResult(ncbjPremisesLocation);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj premises locations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjPremisesLocationImpl.class);

		finderCache.clearCache(NcbjPremisesLocationImpl.class);
	}

	/**
	 * Clears the cache for the ncbj premises location.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjPremisesLocation ncbjPremisesLocation) {
		entityCache.removeResult(
			NcbjPremisesLocationImpl.class, ncbjPremisesLocation);
	}

	@Override
	public void clearCache(List<NcbjPremisesLocation> ncbjPremisesLocations) {
		for (NcbjPremisesLocation ncbjPremisesLocation :
				ncbjPremisesLocations) {

			entityCache.removeResult(
				NcbjPremisesLocationImpl.class, ncbjPremisesLocation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjPremisesLocationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				NcbjPremisesLocationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjPremisesLocationModelImpl ncbjPremisesLocationModelImpl) {

		Object[] args = new Object[] {
			ncbjPremisesLocationModelImpl.getNcbjApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetNCBJ_ById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNCBJ_ById, args,
			ncbjPremisesLocationModelImpl);
	}

	/**
	 * Creates a new ncbj premises location with the primary key. Does not add the ncbj premises location to the database.
	 *
	 * @param ncbjPremisesLocationId the primary key for the new ncbj premises location
	 * @return the new ncbj premises location
	 */
	@Override
	public NcbjPremisesLocation create(long ncbjPremisesLocationId) {
		NcbjPremisesLocation ncbjPremisesLocation =
			new NcbjPremisesLocationImpl();

		ncbjPremisesLocation.setNew(true);
		ncbjPremisesLocation.setPrimaryKey(ncbjPremisesLocationId);

		ncbjPremisesLocation.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjPremisesLocation;
	}

	/**
	 * Removes the ncbj premises location with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjPremisesLocationId the primary key of the ncbj premises location
	 * @return the ncbj premises location that was removed
	 * @throws NoSuchNcbjPremisesLocationException if a ncbj premises location with the primary key could not be found
	 */
	@Override
	public NcbjPremisesLocation remove(long ncbjPremisesLocationId)
		throws NoSuchNcbjPremisesLocationException {

		return remove((Serializable)ncbjPremisesLocationId);
	}

	/**
	 * Removes the ncbj premises location with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj premises location
	 * @return the ncbj premises location that was removed
	 * @throws NoSuchNcbjPremisesLocationException if a ncbj premises location with the primary key could not be found
	 */
	@Override
	public NcbjPremisesLocation remove(Serializable primaryKey)
		throws NoSuchNcbjPremisesLocationException {

		Session session = null;

		try {
			session = openSession();

			NcbjPremisesLocation ncbjPremisesLocation =
				(NcbjPremisesLocation)session.get(
					NcbjPremisesLocationImpl.class, primaryKey);

			if (ncbjPremisesLocation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjPremisesLocationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjPremisesLocation);
		}
		catch (NoSuchNcbjPremisesLocationException noSuchEntityException) {
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
	protected NcbjPremisesLocation removeImpl(
		NcbjPremisesLocation ncbjPremisesLocation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjPremisesLocation)) {
				ncbjPremisesLocation = (NcbjPremisesLocation)session.get(
					NcbjPremisesLocationImpl.class,
					ncbjPremisesLocation.getPrimaryKeyObj());
			}

			if (ncbjPremisesLocation != null) {
				session.delete(ncbjPremisesLocation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjPremisesLocation != null) {
			clearCache(ncbjPremisesLocation);
		}

		return ncbjPremisesLocation;
	}

	@Override
	public NcbjPremisesLocation updateImpl(
		NcbjPremisesLocation ncbjPremisesLocation) {

		boolean isNew = ncbjPremisesLocation.isNew();

		if (!(ncbjPremisesLocation instanceof NcbjPremisesLocationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjPremisesLocation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjPremisesLocation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjPremisesLocation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjPremisesLocation implementation " +
					ncbjPremisesLocation.getClass());
		}

		NcbjPremisesLocationModelImpl ncbjPremisesLocationModelImpl =
			(NcbjPremisesLocationModelImpl)ncbjPremisesLocation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjPremisesLocation.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjPremisesLocation.setCreateDate(date);
			}
			else {
				ncbjPremisesLocation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjPremisesLocationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjPremisesLocation.setModifiedDate(date);
			}
			else {
				ncbjPremisesLocation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjPremisesLocation);
			}
			else {
				ncbjPremisesLocation = (NcbjPremisesLocation)session.merge(
					ncbjPremisesLocation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjPremisesLocationImpl.class, ncbjPremisesLocationModelImpl,
			false, true);

		cacheUniqueFindersCache(ncbjPremisesLocationModelImpl);

		if (isNew) {
			ncbjPremisesLocation.setNew(false);
		}

		ncbjPremisesLocation.resetOriginalValues();

		return ncbjPremisesLocation;
	}

	/**
	 * Returns the ncbj premises location with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj premises location
	 * @return the ncbj premises location
	 * @throws NoSuchNcbjPremisesLocationException if a ncbj premises location with the primary key could not be found
	 */
	@Override
	public NcbjPremisesLocation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjPremisesLocationException {

		NcbjPremisesLocation ncbjPremisesLocation = fetchByPrimaryKey(
			primaryKey);

		if (ncbjPremisesLocation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjPremisesLocationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjPremisesLocation;
	}

	/**
	 * Returns the ncbj premises location with the primary key or throws a <code>NoSuchNcbjPremisesLocationException</code> if it could not be found.
	 *
	 * @param ncbjPremisesLocationId the primary key of the ncbj premises location
	 * @return the ncbj premises location
	 * @throws NoSuchNcbjPremisesLocationException if a ncbj premises location with the primary key could not be found
	 */
	@Override
	public NcbjPremisesLocation findByPrimaryKey(long ncbjPremisesLocationId)
		throws NoSuchNcbjPremisesLocationException {

		return findByPrimaryKey((Serializable)ncbjPremisesLocationId);
	}

	/**
	 * Returns the ncbj premises location with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjPremisesLocationId the primary key of the ncbj premises location
	 * @return the ncbj premises location, or <code>null</code> if a ncbj premises location with the primary key could not be found
	 */
	@Override
	public NcbjPremisesLocation fetchByPrimaryKey(long ncbjPremisesLocationId) {
		return fetchByPrimaryKey((Serializable)ncbjPremisesLocationId);
	}

	/**
	 * Returns all the ncbj premises locations.
	 *
	 * @return the ncbj premises locations
	 */
	@Override
	public List<NcbjPremisesLocation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj premises locations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPremisesLocationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj premises locations
	 * @param end the upper bound of the range of ncbj premises locations (not inclusive)
	 * @return the range of ncbj premises locations
	 */
	@Override
	public List<NcbjPremisesLocation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj premises locations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPremisesLocationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj premises locations
	 * @param end the upper bound of the range of ncbj premises locations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj premises locations
	 */
	@Override
	public List<NcbjPremisesLocation> findAll(
		int start, int end,
		OrderByComparator<NcbjPremisesLocation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj premises locations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPremisesLocationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj premises locations
	 * @param end the upper bound of the range of ncbj premises locations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj premises locations
	 */
	@Override
	public List<NcbjPremisesLocation> findAll(
		int start, int end,
		OrderByComparator<NcbjPremisesLocation> orderByComparator,
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

		List<NcbjPremisesLocation> list = null;

		if (useFinderCache) {
			list = (List<NcbjPremisesLocation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJPREMISESLOCATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJPREMISESLOCATION;

				sql = sql.concat(NcbjPremisesLocationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjPremisesLocation>)QueryUtil.list(
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
	 * Removes all the ncbj premises locations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjPremisesLocation ncbjPremisesLocation : findAll()) {
			remove(ncbjPremisesLocation);
		}
	}

	/**
	 * Returns the number of ncbj premises locations.
	 *
	 * @return the number of ncbj premises locations
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
					_SQL_COUNT_NCBJPREMISESLOCATION);

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
		return "ncbjPremisesLocationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJPREMISESLOCATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjPremisesLocationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj premises location persistence.
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

		_finderPathFetchBygetNCBJ_ById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNCBJ_ById",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, true);

		_finderPathCountBygetNCBJ_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNCBJ_ById",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, false);

		NcbjPremisesLocationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjPremisesLocationUtil.setPersistence(null);

		entityCache.removeCache(NcbjPremisesLocationImpl.class.getName());
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCBJPREMISESLOCATION =
		"SELECT ncbjPremisesLocation FROM NcbjPremisesLocation ncbjPremisesLocation";

	private static final String _SQL_SELECT_NCBJPREMISESLOCATION_WHERE =
		"SELECT ncbjPremisesLocation FROM NcbjPremisesLocation ncbjPremisesLocation WHERE ";

	private static final String _SQL_COUNT_NCBJPREMISESLOCATION =
		"SELECT COUNT(ncbjPremisesLocation) FROM NcbjPremisesLocation ncbjPremisesLocation";

	private static final String _SQL_COUNT_NCBJPREMISESLOCATION_WHERE =
		"SELECT COUNT(ncbjPremisesLocation) FROM NcbjPremisesLocation ncbjPremisesLocation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"ncbjPremisesLocation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjPremisesLocation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjPremisesLocation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjPremisesLocationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}