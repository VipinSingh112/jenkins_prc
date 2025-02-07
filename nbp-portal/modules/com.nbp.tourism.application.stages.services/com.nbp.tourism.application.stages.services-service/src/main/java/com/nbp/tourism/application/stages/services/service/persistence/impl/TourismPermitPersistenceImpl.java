/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service.persistence.impl;

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

import com.nbp.tourism.application.stages.services.exception.NoSuchTourismPermitException;
import com.nbp.tourism.application.stages.services.model.TourismPermit;
import com.nbp.tourism.application.stages.services.model.TourismPermitTable;
import com.nbp.tourism.application.stages.services.model.impl.TourismPermitImpl;
import com.nbp.tourism.application.stages.services.model.impl.TourismPermitModelImpl;
import com.nbp.tourism.application.stages.services.service.persistence.TourismPermitPersistence;
import com.nbp.tourism.application.stages.services.service.persistence.TourismPermitUtil;
import com.nbp.tourism.application.stages.services.service.persistence.impl.constants.TOURISM_STAGESPersistenceConstants;

import java.io.Serializable;

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
 * The persistence implementation for the tourism permit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismPermitPersistence.class)
public class TourismPermitPersistenceImpl
	extends BasePersistenceImpl<TourismPermit>
	implements TourismPermitPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismPermitUtil</code> to access the tourism permit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismPermitImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetManufacturingPermitBY_CI;
	private FinderPath _finderPathCountBygetManufacturingPermitBY_CI;

	/**
	 * Returns the tourism permit where caseId = &#63; or throws a <code>NoSuchTourismPermitException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism permit
	 * @throws NoSuchTourismPermitException if a matching tourism permit could not be found
	 */
	@Override
	public TourismPermit findBygetManufacturingPermitBY_CI(String caseId)
		throws NoSuchTourismPermitException {

		TourismPermit tourismPermit = fetchBygetManufacturingPermitBY_CI(
			caseId);

		if (tourismPermit == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismPermitException(sb.toString());
		}

		return tourismPermit;
	}

	/**
	 * Returns the tourism permit where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism permit, or <code>null</code> if a matching tourism permit could not be found
	 */
	@Override
	public TourismPermit fetchBygetManufacturingPermitBY_CI(String caseId) {
		return fetchBygetManufacturingPermitBY_CI(caseId, true);
	}

	/**
	 * Returns the tourism permit where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism permit, or <code>null</code> if a matching tourism permit could not be found
	 */
	@Override
	public TourismPermit fetchBygetManufacturingPermitBY_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetManufacturingPermitBY_CI, finderArgs,
				this);
		}

		if (result instanceof TourismPermit) {
			TourismPermit tourismPermit = (TourismPermit)result;

			if (!Objects.equals(caseId, tourismPermit.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMPERMIT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMANUFACTURINGPERMITBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMANUFACTURINGPERMITBY_CI_CASEID_2);
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

				List<TourismPermit> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetManufacturingPermitBY_CI,
							finderArgs, list);
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
								"TourismPermitPersistenceImpl.fetchBygetManufacturingPermitBY_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismPermit tourismPermit = list.get(0);

					result = tourismPermit;

					cacheResult(tourismPermit);
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
			return (TourismPermit)result;
		}
	}

	/**
	 * Removes the tourism permit where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the tourism permit that was removed
	 */
	@Override
	public TourismPermit removeBygetManufacturingPermitBY_CI(String caseId)
		throws NoSuchTourismPermitException {

		TourismPermit tourismPermit = findBygetManufacturingPermitBY_CI(caseId);

		return remove(tourismPermit);
	}

	/**
	 * Returns the number of tourism permits where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching tourism permits
	 */
	@Override
	public int countBygetManufacturingPermitBY_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetManufacturingPermitBY_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMPERMIT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMANUFACTURINGPERMITBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMANUFACTURINGPERMITBY_CI_CASEID_2);
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

	private static final String
		_FINDER_COLUMN_GETMANUFACTURINGPERMITBY_CI_CASEID_2 =
			"tourismPermit.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETMANUFACTURINGPERMITBY_CI_CASEID_3 =
			"(tourismPermit.caseId IS NULL OR tourismPermit.caseId = '')";

	public TourismPermitPersistenceImpl() {
		setModelClass(TourismPermit.class);

		setModelImplClass(TourismPermitImpl.class);
		setModelPKClass(long.class);

		setTable(TourismPermitTable.INSTANCE);
	}

	/**
	 * Caches the tourism permit in the entity cache if it is enabled.
	 *
	 * @param tourismPermit the tourism permit
	 */
	@Override
	public void cacheResult(TourismPermit tourismPermit) {
		entityCache.putResult(
			TourismPermitImpl.class, tourismPermit.getPrimaryKey(),
			tourismPermit);

		finderCache.putResult(
			_finderPathFetchBygetManufacturingPermitBY_CI,
			new Object[] {tourismPermit.getCaseId()}, tourismPermit);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism permits in the entity cache if it is enabled.
	 *
	 * @param tourismPermits the tourism permits
	 */
	@Override
	public void cacheResult(List<TourismPermit> tourismPermits) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismPermits.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismPermit tourismPermit : tourismPermits) {
			if (entityCache.getResult(
					TourismPermitImpl.class, tourismPermit.getPrimaryKey()) ==
						null) {

				cacheResult(tourismPermit);
			}
		}
	}

	/**
	 * Clears the cache for all tourism permits.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismPermitImpl.class);

		finderCache.clearCache(TourismPermitImpl.class);
	}

	/**
	 * Clears the cache for the tourism permit.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TourismPermit tourismPermit) {
		entityCache.removeResult(TourismPermitImpl.class, tourismPermit);
	}

	@Override
	public void clearCache(List<TourismPermit> tourismPermits) {
		for (TourismPermit tourismPermit : tourismPermits) {
			entityCache.removeResult(TourismPermitImpl.class, tourismPermit);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismPermitImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(TourismPermitImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismPermitModelImpl tourismPermitModelImpl) {

		Object[] args = new Object[] {tourismPermitModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetManufacturingPermitBY_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetManufacturingPermitBY_CI, args,
			tourismPermitModelImpl);
	}

	/**
	 * Creates a new tourism permit with the primary key. Does not add the tourism permit to the database.
	 *
	 * @param tourismgPermitId the primary key for the new tourism permit
	 * @return the new tourism permit
	 */
	@Override
	public TourismPermit create(long tourismgPermitId) {
		TourismPermit tourismPermit = new TourismPermitImpl();

		tourismPermit.setNew(true);
		tourismPermit.setPrimaryKey(tourismgPermitId);

		tourismPermit.setCompanyId(CompanyThreadLocal.getCompanyId());

		return tourismPermit;
	}

	/**
	 * Removes the tourism permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismgPermitId the primary key of the tourism permit
	 * @return the tourism permit that was removed
	 * @throws NoSuchTourismPermitException if a tourism permit with the primary key could not be found
	 */
	@Override
	public TourismPermit remove(long tourismgPermitId)
		throws NoSuchTourismPermitException {

		return remove((Serializable)tourismgPermitId);
	}

	/**
	 * Removes the tourism permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism permit
	 * @return the tourism permit that was removed
	 * @throws NoSuchTourismPermitException if a tourism permit with the primary key could not be found
	 */
	@Override
	public TourismPermit remove(Serializable primaryKey)
		throws NoSuchTourismPermitException {

		Session session = null;

		try {
			session = openSession();

			TourismPermit tourismPermit = (TourismPermit)session.get(
				TourismPermitImpl.class, primaryKey);

			if (tourismPermit == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismPermitException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismPermit);
		}
		catch (NoSuchTourismPermitException noSuchEntityException) {
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
	protected TourismPermit removeImpl(TourismPermit tourismPermit) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismPermit)) {
				tourismPermit = (TourismPermit)session.get(
					TourismPermitImpl.class, tourismPermit.getPrimaryKeyObj());
			}

			if (tourismPermit != null) {
				session.delete(tourismPermit);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismPermit != null) {
			clearCache(tourismPermit);
		}

		return tourismPermit;
	}

	@Override
	public TourismPermit updateImpl(TourismPermit tourismPermit) {
		boolean isNew = tourismPermit.isNew();

		if (!(tourismPermit instanceof TourismPermitModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tourismPermit.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismPermit);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismPermit proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismPermit implementation " +
					tourismPermit.getClass());
		}

		TourismPermitModelImpl tourismPermitModelImpl =
			(TourismPermitModelImpl)tourismPermit;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismPermit.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismPermit.setCreateDate(date);
			}
			else {
				tourismPermit.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!tourismPermitModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismPermit.setModifiedDate(date);
			}
			else {
				tourismPermit.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismPermit);
			}
			else {
				tourismPermit = (TourismPermit)session.merge(tourismPermit);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismPermitImpl.class, tourismPermitModelImpl, false, true);

		cacheUniqueFindersCache(tourismPermitModelImpl);

		if (isNew) {
			tourismPermit.setNew(false);
		}

		tourismPermit.resetOriginalValues();

		return tourismPermit;
	}

	/**
	 * Returns the tourism permit with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism permit
	 * @return the tourism permit
	 * @throws NoSuchTourismPermitException if a tourism permit with the primary key could not be found
	 */
	@Override
	public TourismPermit findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTourismPermitException {

		TourismPermit tourismPermit = fetchByPrimaryKey(primaryKey);

		if (tourismPermit == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismPermitException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismPermit;
	}

	/**
	 * Returns the tourism permit with the primary key or throws a <code>NoSuchTourismPermitException</code> if it could not be found.
	 *
	 * @param tourismgPermitId the primary key of the tourism permit
	 * @return the tourism permit
	 * @throws NoSuchTourismPermitException if a tourism permit with the primary key could not be found
	 */
	@Override
	public TourismPermit findByPrimaryKey(long tourismgPermitId)
		throws NoSuchTourismPermitException {

		return findByPrimaryKey((Serializable)tourismgPermitId);
	}

	/**
	 * Returns the tourism permit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismgPermitId the primary key of the tourism permit
	 * @return the tourism permit, or <code>null</code> if a tourism permit with the primary key could not be found
	 */
	@Override
	public TourismPermit fetchByPrimaryKey(long tourismgPermitId) {
		return fetchByPrimaryKey((Serializable)tourismgPermitId);
	}

	/**
	 * Returns all the tourism permits.
	 *
	 * @return the tourism permits
	 */
	@Override
	public List<TourismPermit> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism permits
	 * @param end the upper bound of the range of tourism permits (not inclusive)
	 * @return the range of tourism permits
	 */
	@Override
	public List<TourismPermit> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism permits
	 * @param end the upper bound of the range of tourism permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism permits
	 */
	@Override
	public List<TourismPermit> findAll(
		int start, int end,
		OrderByComparator<TourismPermit> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism permits
	 * @param end the upper bound of the range of tourism permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism permits
	 */
	@Override
	public List<TourismPermit> findAll(
		int start, int end, OrderByComparator<TourismPermit> orderByComparator,
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

		List<TourismPermit> list = null;

		if (useFinderCache) {
			list = (List<TourismPermit>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMPERMIT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMPERMIT;

				sql = sql.concat(TourismPermitModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismPermit>)QueryUtil.list(
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
	 * Removes all the tourism permits from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismPermit tourismPermit : findAll()) {
			remove(tourismPermit);
		}
	}

	/**
	 * Returns the number of tourism permits.
	 *
	 * @return the number of tourism permits
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_TOURISMPERMIT);

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
		return "tourismgPermitId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMPERMIT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismPermitModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism permit persistence.
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

		_finderPathFetchBygetManufacturingPermitBY_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetManufacturingPermitBY_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetManufacturingPermitBY_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetManufacturingPermitBY_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		TourismPermitUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismPermitUtil.setPersistence(null);

		entityCache.removeCache(TourismPermitImpl.class.getName());
	}

	@Override
	@Reference(
		target = TOURISM_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = TOURISM_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = TOURISM_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_TOURISMPERMIT =
		"SELECT tourismPermit FROM TourismPermit tourismPermit";

	private static final String _SQL_SELECT_TOURISMPERMIT_WHERE =
		"SELECT tourismPermit FROM TourismPermit tourismPermit WHERE ";

	private static final String _SQL_COUNT_TOURISMPERMIT =
		"SELECT COUNT(tourismPermit) FROM TourismPermit tourismPermit";

	private static final String _SQL_COUNT_TOURISMPERMIT_WHERE =
		"SELECT COUNT(tourismPermit) FROM TourismPermit tourismPermit WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "tourismPermit.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismPermit exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismPermit exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismPermitPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}