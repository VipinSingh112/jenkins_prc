/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.stages.service.service.persistence.impl;

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
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.farm.application.stages.service.exception.NoSuchFarmPermitException;
import com.nbp.farm.application.stages.service.model.FarmPermit;
import com.nbp.farm.application.stages.service.model.FarmPermitTable;
import com.nbp.farm.application.stages.service.model.impl.FarmPermitImpl;
import com.nbp.farm.application.stages.service.model.impl.FarmPermitModelImpl;
import com.nbp.farm.application.stages.service.service.persistence.FarmPermitPersistence;
import com.nbp.farm.application.stages.service.service.persistence.FarmPermitUtil;
import com.nbp.farm.application.stages.service.service.persistence.impl.constants.FARM_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the farm permit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {FarmPermitPersistence.class, BasePersistence.class})
public class FarmPermitPersistenceImpl
	extends BasePersistenceImpl<FarmPermit> implements FarmPermitPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FarmPermitUtil</code> to access the farm permit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FarmPermitImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetFarmBy_CI;
	private FinderPath _finderPathCountBygetFarmBy_CI;

	/**
	 * Returns the farm permit where caseId = &#63; or throws a <code>NoSuchFarmPermitException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching farm permit
	 * @throws NoSuchFarmPermitException if a matching farm permit could not be found
	 */
	@Override
	public FarmPermit findBygetFarmBy_CI(String caseId)
		throws NoSuchFarmPermitException {

		FarmPermit farmPermit = fetchBygetFarmBy_CI(caseId);

		if (farmPermit == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmPermitException(sb.toString());
		}

		return farmPermit;
	}

	/**
	 * Returns the farm permit where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching farm permit, or <code>null</code> if a matching farm permit could not be found
	 */
	@Override
	public FarmPermit fetchBygetFarmBy_CI(String caseId) {
		return fetchBygetFarmBy_CI(caseId, true);
	}

	/**
	 * Returns the farm permit where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farm permit, or <code>null</code> if a matching farm permit could not be found
	 */
	@Override
	public FarmPermit fetchBygetFarmBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFarmBy_CI, finderArgs,this);
		}

		if (result instanceof FarmPermit) {
			FarmPermit farmPermit = (FarmPermit)result;

			if (!Objects.equals(caseId, farmPermit.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FARMPERMIT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFARMBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFARMBY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<FarmPermit> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFarmBy_CI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"FarmPermitPersistenceImpl.fetchBygetFarmBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FarmPermit farmPermit = list.get(0);

					result = farmPermit;

					cacheResult(farmPermit);
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
			return (FarmPermit)result;
		}
	}

	/**
	 * Removes the farm permit where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the farm permit that was removed
	 */
	@Override
	public FarmPermit removeBygetFarmBy_CI(String caseId)
		throws NoSuchFarmPermitException {

		FarmPermit farmPermit = findBygetFarmBy_CI(caseId);

		return remove(farmPermit);
	}

	/**
	 * Returns the number of farm permits where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching farm permits
	 */
	@Override
	public int countBygetFarmBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFarmBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMPERMIT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFARMBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFARMBY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

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

	private static final String _FINDER_COLUMN_GETFARMBY_CI_CASEID_2 =
		"farmPermit.caseId = ?";

	private static final String _FINDER_COLUMN_GETFARMBY_CI_CASEID_3 =
		"(farmPermit.caseId IS NULL OR farmPermit.caseId = '')";

	public FarmPermitPersistenceImpl() {
		setModelClass(FarmPermit.class);

		setModelImplClass(FarmPermitImpl.class);
		setModelPKClass(long.class);

		setTable(FarmPermitTable.INSTANCE);
	}

	/**
	 * Caches the farm permit in the entity cache if it is enabled.
	 *
	 * @param farmPermit the farm permit
	 */
	@Override
	public void cacheResult(FarmPermit farmPermit) {
		entityCache.putResult(
			FarmPermitImpl.class, farmPermit.getPrimaryKey(), farmPermit);

		finderCache.putResult(
			_finderPathFetchBygetFarmBy_CI,
			new Object[] {farmPermit.getCaseId()}, farmPermit);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the farm permits in the entity cache if it is enabled.
	 *
	 * @param farmPermits the farm permits
	 */
	@Override
	public void cacheResult(List<FarmPermit> farmPermits) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (farmPermits.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FarmPermit farmPermit : farmPermits) {
			if (entityCache.getResult(
					FarmPermitImpl.class, farmPermit.getPrimaryKey()) == null) {

				cacheResult(farmPermit);
			}
		}
	}

	/**
	 * Clears the cache for all farm permits.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FarmPermitImpl.class);

		finderCache.clearCache(FarmPermitImpl.class);
	}

	/**
	 * Clears the cache for the farm permit.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FarmPermit farmPermit) {
		entityCache.removeResult(FarmPermitImpl.class, farmPermit);
	}

	@Override
	public void clearCache(List<FarmPermit> farmPermits) {
		for (FarmPermit farmPermit : farmPermits) {
			entityCache.removeResult(FarmPermitImpl.class, farmPermit);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FarmPermitImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(FarmPermitImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FarmPermitModelImpl farmPermitModelImpl) {

		Object[] args = new Object[] {farmPermitModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetFarmBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFarmBy_CI, args, farmPermitModelImpl);
	}

	/**
	 * Creates a new farm permit with the primary key. Does not add the farm permit to the database.
	 *
	 * @param farmPermitId the primary key for the new farm permit
	 * @return the new farm permit
	 */
	@Override
	public FarmPermit create(long farmPermitId) {
		FarmPermit farmPermit = new FarmPermitImpl();

		farmPermit.setNew(true);
		farmPermit.setPrimaryKey(farmPermitId);

		farmPermit.setCompanyId(CompanyThreadLocal.getCompanyId());

		return farmPermit;
	}

	/**
	 * Removes the farm permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmPermitId the primary key of the farm permit
	 * @return the farm permit that was removed
	 * @throws NoSuchFarmPermitException if a farm permit with the primary key could not be found
	 */
	@Override
	public FarmPermit remove(long farmPermitId)
		throws NoSuchFarmPermitException {

		return remove((Serializable)farmPermitId);
	}

	/**
	 * Removes the farm permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the farm permit
	 * @return the farm permit that was removed
	 * @throws NoSuchFarmPermitException if a farm permit with the primary key could not be found
	 */
	@Override
	public FarmPermit remove(Serializable primaryKey)
		throws NoSuchFarmPermitException {

		Session session = null;

		try {
			session = openSession();

			FarmPermit farmPermit = (FarmPermit)session.get(
				FarmPermitImpl.class, primaryKey);

			if (farmPermit == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFarmPermitException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(farmPermit);
		}
		catch (NoSuchFarmPermitException noSuchEntityException) {
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
	protected FarmPermit removeImpl(FarmPermit farmPermit) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(farmPermit)) {
				farmPermit = (FarmPermit)session.get(
					FarmPermitImpl.class, farmPermit.getPrimaryKeyObj());
			}

			if (farmPermit != null) {
				session.delete(farmPermit);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (farmPermit != null) {
			clearCache(farmPermit);
		}

		return farmPermit;
	}

	@Override
	public FarmPermit updateImpl(FarmPermit farmPermit) {
		boolean isNew = farmPermit.isNew();

		if (!(farmPermit instanceof FarmPermitModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(farmPermit.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(farmPermit);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in farmPermit proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FarmPermit implementation " +
					farmPermit.getClass());
		}

		FarmPermitModelImpl farmPermitModelImpl =
			(FarmPermitModelImpl)farmPermit;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (farmPermit.getCreateDate() == null)) {
			if (serviceContext == null) {
				farmPermit.setCreateDate(date);
			}
			else {
				farmPermit.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!farmPermitModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				farmPermit.setModifiedDate(date);
			}
			else {
				farmPermit.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(farmPermit);
			}
			else {
				farmPermit = (FarmPermit)session.merge(farmPermit);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FarmPermitImpl.class, farmPermitModelImpl, false, true);

		cacheUniqueFindersCache(farmPermitModelImpl);

		if (isNew) {
			farmPermit.setNew(false);
		}

		farmPermit.resetOriginalValues();

		return farmPermit;
	}

	/**
	 * Returns the farm permit with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the farm permit
	 * @return the farm permit
	 * @throws NoSuchFarmPermitException if a farm permit with the primary key could not be found
	 */
	@Override
	public FarmPermit findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFarmPermitException {

		FarmPermit farmPermit = fetchByPrimaryKey(primaryKey);

		if (farmPermit == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFarmPermitException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return farmPermit;
	}

	/**
	 * Returns the farm permit with the primary key or throws a <code>NoSuchFarmPermitException</code> if it could not be found.
	 *
	 * @param farmPermitId the primary key of the farm permit
	 * @return the farm permit
	 * @throws NoSuchFarmPermitException if a farm permit with the primary key could not be found
	 */
	@Override
	public FarmPermit findByPrimaryKey(long farmPermitId)
		throws NoSuchFarmPermitException {

		return findByPrimaryKey((Serializable)farmPermitId);
	}

	/**
	 * Returns the farm permit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmPermitId the primary key of the farm permit
	 * @return the farm permit, or <code>null</code> if a farm permit with the primary key could not be found
	 */
	@Override
	public FarmPermit fetchByPrimaryKey(long farmPermitId) {
		return fetchByPrimaryKey((Serializable)farmPermitId);
	}

	/**
	 * Returns all the farm permits.
	 *
	 * @return the farm permits
	 */
	@Override
	public List<FarmPermit> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farm permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm permits
	 * @param end the upper bound of the range of farm permits (not inclusive)
	 * @return the range of farm permits
	 */
	@Override
	public List<FarmPermit> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the farm permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm permits
	 * @param end the upper bound of the range of farm permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farm permits
	 */
	@Override
	public List<FarmPermit> findAll(
		int start, int end, OrderByComparator<FarmPermit> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farm permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm permits
	 * @param end the upper bound of the range of farm permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farm permits
	 */
	@Override
	public List<FarmPermit> findAll(
		int start, int end, OrderByComparator<FarmPermit> orderByComparator,
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

		List<FarmPermit> list = null;

		if (useFinderCache) {
			list = (List<FarmPermit>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FARMPERMIT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FARMPERMIT;

				sql = sql.concat(FarmPermitModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FarmPermit>)QueryUtil.list(
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
	 * Removes all the farm permits from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FarmPermit farmPermit : findAll()) {
			remove(farmPermit);
		}
	}

	/**
	 * Returns the number of farm permits.
	 *
	 * @return the number of farm permits
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_FARMPERMIT);

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
		return "farmPermitId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FARMPERMIT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FarmPermitModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the farm permit persistence.
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

		_finderPathFetchBygetFarmBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFarmBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetFarmBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFarmBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_setFarmPermitUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setFarmPermitUtilPersistence(null);

		entityCache.removeCache(FarmPermitImpl.class.getName());
	}

	private void _setFarmPermitUtilPersistence(
		FarmPermitPersistence farmPermitPersistence) {

		try {
			Field field = FarmPermitUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, farmPermitPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = FARM_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FARM_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FARM_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FARMPERMIT =
		"SELECT farmPermit FROM FarmPermit farmPermit";

	private static final String _SQL_SELECT_FARMPERMIT_WHERE =
		"SELECT farmPermit FROM FarmPermit farmPermit WHERE ";

	private static final String _SQL_COUNT_FARMPERMIT =
		"SELECT COUNT(farmPermit) FROM FarmPermit farmPermit";

	private static final String _SQL_COUNT_FARMPERMIT_WHERE =
		"SELECT COUNT(farmPermit) FROM FarmPermit farmPermit WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "farmPermit.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FarmPermit exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FarmPermit exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FarmPermitPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private FarmPermitModelArgumentsResolver _farmPermitModelArgumentsResolver;

}