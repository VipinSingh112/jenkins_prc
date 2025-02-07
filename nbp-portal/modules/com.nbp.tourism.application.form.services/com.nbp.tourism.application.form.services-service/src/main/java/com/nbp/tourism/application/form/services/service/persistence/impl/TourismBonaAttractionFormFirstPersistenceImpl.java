/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence.impl;

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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaAttractionFormFirstException;
import com.nbp.tourism.application.form.services.model.TourismBonaAttractionFormFirst;
import com.nbp.tourism.application.form.services.model.TourismBonaAttractionFormFirstTable;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormFirstImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormFirstModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAttractionFormFirstPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAttractionFormFirstUtil;
import com.nbp.tourism.application.form.services.service.persistence.impl.constants.TOURISMPersistenceConstants;

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
 * The persistence implementation for the tourism bona attraction form first service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismBonaAttractionFormFirstPersistence.class)
public class TourismBonaAttractionFormFirstPersistenceImpl
	extends BasePersistenceImpl<TourismBonaAttractionFormFirst>
	implements TourismBonaAttractionFormFirstPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismBonaAttractionFormFirstUtil</code> to access the tourism bona attraction form first persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismBonaAttractionFormFirstImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetTourismById;
	private FinderPath _finderPathCountBygetTourismById;

	/**
	 * Returns the tourism bona attraction form first where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAttractionFormFirstException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona attraction form first
	 * @throws NoSuchTourismBonaAttractionFormFirstException if a matching tourism bona attraction form first could not be found
	 */
	@Override
	public TourismBonaAttractionFormFirst findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAttractionFormFirstException {

		TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst =
			fetchBygetTourismById(tourismApplicationId);

		if (tourismBonaAttractionFormFirst == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismBonaAttractionFormFirstException(
				sb.toString());
		}

		return tourismBonaAttractionFormFirst;
	}

	/**
	 * Returns the tourism bona attraction form first where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona attraction form first, or <code>null</code> if a matching tourism bona attraction form first could not be found
	 */
	@Override
	public TourismBonaAttractionFormFirst fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism bona attraction form first where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona attraction form first, or <code>null</code> if a matching tourism bona attraction form first could not be found
	 */
	@Override
	public TourismBonaAttractionFormFirst fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {tourismApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetTourismById, finderArgs, this);
		}

		if (result instanceof TourismBonaAttractionFormFirst) {
			TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst =
				(TourismBonaAttractionFormFirst)result;

			if (tourismApplicationId !=
					tourismBonaAttractionFormFirst.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMBONAATTRACTIONFORMFIRST_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismBonaAttractionFormFirst> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetTourismById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									tourismApplicationId
								};
							}

							_log.warn(
								"TourismBonaAttractionFormFirstPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismBonaAttractionFormFirst
						tourismBonaAttractionFormFirst = list.get(0);

					result = tourismBonaAttractionFormFirst;

					cacheResult(tourismBonaAttractionFormFirst);
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
			return (TourismBonaAttractionFormFirst)result;
		}
	}

	/**
	 * Removes the tourism bona attraction form first where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona attraction form first that was removed
	 */
	@Override
	public TourismBonaAttractionFormFirst removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAttractionFormFirstException {

		TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst =
			findBygetTourismById(tourismApplicationId);

		return remove(tourismBonaAttractionFormFirst);
	}

	/**
	 * Returns the number of tourism bona attraction form firsts where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona attraction form firsts
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMBONAATTRACTIONFORMFIRST_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

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
		_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2 =
			"tourismBonaAttractionFormFirst.tourismApplicationId = ?";

	public TourismBonaAttractionFormFirstPersistenceImpl() {
		setModelClass(TourismBonaAttractionFormFirst.class);

		setModelImplClass(TourismBonaAttractionFormFirstImpl.class);
		setModelPKClass(long.class);

		setTable(TourismBonaAttractionFormFirstTable.INSTANCE);
	}

	/**
	 * Caches the tourism bona attraction form first in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAttractionFormFirst the tourism bona attraction form first
	 */
	@Override
	public void cacheResult(
		TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst) {

		entityCache.putResult(
			TourismBonaAttractionFormFirstImpl.class,
			tourismBonaAttractionFormFirst.getPrimaryKey(),
			tourismBonaAttractionFormFirst);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {
				tourismBonaAttractionFormFirst.getTourismApplicationId()
			},
			tourismBonaAttractionFormFirst);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism bona attraction form firsts in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAttractionFormFirsts the tourism bona attraction form firsts
	 */
	@Override
	public void cacheResult(
		List<TourismBonaAttractionFormFirst> tourismBonaAttractionFormFirsts) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismBonaAttractionFormFirsts.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst :
				tourismBonaAttractionFormFirsts) {

			if (entityCache.getResult(
					TourismBonaAttractionFormFirstImpl.class,
					tourismBonaAttractionFormFirst.getPrimaryKey()) == null) {

				cacheResult(tourismBonaAttractionFormFirst);
			}
		}
	}

	/**
	 * Clears the cache for all tourism bona attraction form firsts.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismBonaAttractionFormFirstImpl.class);

		finderCache.clearCache(TourismBonaAttractionFormFirstImpl.class);
	}

	/**
	 * Clears the cache for the tourism bona attraction form first.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst) {

		entityCache.removeResult(
			TourismBonaAttractionFormFirstImpl.class,
			tourismBonaAttractionFormFirst);
	}

	@Override
	public void clearCache(
		List<TourismBonaAttractionFormFirst> tourismBonaAttractionFormFirsts) {

		for (TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst :
				tourismBonaAttractionFormFirsts) {

			entityCache.removeResult(
				TourismBonaAttractionFormFirstImpl.class,
				tourismBonaAttractionFormFirst);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismBonaAttractionFormFirstImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismBonaAttractionFormFirstImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismBonaAttractionFormFirstModelImpl
			tourismBonaAttractionFormFirstModelImpl) {

		Object[] args = new Object[] {
			tourismBonaAttractionFormFirstModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismBonaAttractionFormFirstModelImpl);
	}

	/**
	 * Creates a new tourism bona attraction form first with the primary key. Does not add the tourism bona attraction form first to the database.
	 *
	 * @param tourismBonaAttractFormFirstId the primary key for the new tourism bona attraction form first
	 * @return the new tourism bona attraction form first
	 */
	@Override
	public TourismBonaAttractionFormFirst create(
		long tourismBonaAttractFormFirstId) {

		TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst =
			new TourismBonaAttractionFormFirstImpl();

		tourismBonaAttractionFormFirst.setNew(true);
		tourismBonaAttractionFormFirst.setPrimaryKey(
			tourismBonaAttractFormFirstId);

		tourismBonaAttractionFormFirst.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismBonaAttractionFormFirst;
	}

	/**
	 * Removes the tourism bona attraction form first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaAttractFormFirstId the primary key of the tourism bona attraction form first
	 * @return the tourism bona attraction form first that was removed
	 * @throws NoSuchTourismBonaAttractionFormFirstException if a tourism bona attraction form first with the primary key could not be found
	 */
	@Override
	public TourismBonaAttractionFormFirst remove(
			long tourismBonaAttractFormFirstId)
		throws NoSuchTourismBonaAttractionFormFirstException {

		return remove((Serializable)tourismBonaAttractFormFirstId);
	}

	/**
	 * Removes the tourism bona attraction form first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism bona attraction form first
	 * @return the tourism bona attraction form first that was removed
	 * @throws NoSuchTourismBonaAttractionFormFirstException if a tourism bona attraction form first with the primary key could not be found
	 */
	@Override
	public TourismBonaAttractionFormFirst remove(Serializable primaryKey)
		throws NoSuchTourismBonaAttractionFormFirstException {

		Session session = null;

		try {
			session = openSession();

			TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst =
				(TourismBonaAttractionFormFirst)session.get(
					TourismBonaAttractionFormFirstImpl.class, primaryKey);

			if (tourismBonaAttractionFormFirst == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismBonaAttractionFormFirstException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismBonaAttractionFormFirst);
		}
		catch (NoSuchTourismBonaAttractionFormFirstException
					noSuchEntityException) {

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
	protected TourismBonaAttractionFormFirst removeImpl(
		TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismBonaAttractionFormFirst)) {
				tourismBonaAttractionFormFirst =
					(TourismBonaAttractionFormFirst)session.get(
						TourismBonaAttractionFormFirstImpl.class,
						tourismBonaAttractionFormFirst.getPrimaryKeyObj());
			}

			if (tourismBonaAttractionFormFirst != null) {
				session.delete(tourismBonaAttractionFormFirst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismBonaAttractionFormFirst != null) {
			clearCache(tourismBonaAttractionFormFirst);
		}

		return tourismBonaAttractionFormFirst;
	}

	@Override
	public TourismBonaAttractionFormFirst updateImpl(
		TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst) {

		boolean isNew = tourismBonaAttractionFormFirst.isNew();

		if (!(tourismBonaAttractionFormFirst instanceof
				TourismBonaAttractionFormFirstModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					tourismBonaAttractionFormFirst.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismBonaAttractionFormFirst);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismBonaAttractionFormFirst proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismBonaAttractionFormFirst implementation " +
					tourismBonaAttractionFormFirst.getClass());
		}

		TourismBonaAttractionFormFirstModelImpl
			tourismBonaAttractionFormFirstModelImpl =
				(TourismBonaAttractionFormFirstModelImpl)
					tourismBonaAttractionFormFirst;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismBonaAttractionFormFirst.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismBonaAttractionFormFirst.setCreateDate(date);
			}
			else {
				tourismBonaAttractionFormFirst.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismBonaAttractionFormFirstModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismBonaAttractionFormFirst.setModifiedDate(date);
			}
			else {
				tourismBonaAttractionFormFirst.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismBonaAttractionFormFirst);
			}
			else {
				tourismBonaAttractionFormFirst =
					(TourismBonaAttractionFormFirst)session.merge(
						tourismBonaAttractionFormFirst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismBonaAttractionFormFirstImpl.class,
			tourismBonaAttractionFormFirstModelImpl, false, true);

		cacheUniqueFindersCache(tourismBonaAttractionFormFirstModelImpl);

		if (isNew) {
			tourismBonaAttractionFormFirst.setNew(false);
		}

		tourismBonaAttractionFormFirst.resetOriginalValues();

		return tourismBonaAttractionFormFirst;
	}

	/**
	 * Returns the tourism bona attraction form first with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism bona attraction form first
	 * @return the tourism bona attraction form first
	 * @throws NoSuchTourismBonaAttractionFormFirstException if a tourism bona attraction form first with the primary key could not be found
	 */
	@Override
	public TourismBonaAttractionFormFirst findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchTourismBonaAttractionFormFirstException {

		TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst =
			fetchByPrimaryKey(primaryKey);

		if (tourismBonaAttractionFormFirst == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismBonaAttractionFormFirstException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismBonaAttractionFormFirst;
	}

	/**
	 * Returns the tourism bona attraction form first with the primary key or throws a <code>NoSuchTourismBonaAttractionFormFirstException</code> if it could not be found.
	 *
	 * @param tourismBonaAttractFormFirstId the primary key of the tourism bona attraction form first
	 * @return the tourism bona attraction form first
	 * @throws NoSuchTourismBonaAttractionFormFirstException if a tourism bona attraction form first with the primary key could not be found
	 */
	@Override
	public TourismBonaAttractionFormFirst findByPrimaryKey(
			long tourismBonaAttractFormFirstId)
		throws NoSuchTourismBonaAttractionFormFirstException {

		return findByPrimaryKey((Serializable)tourismBonaAttractFormFirstId);
	}

	/**
	 * Returns the tourism bona attraction form first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaAttractFormFirstId the primary key of the tourism bona attraction form first
	 * @return the tourism bona attraction form first, or <code>null</code> if a tourism bona attraction form first with the primary key could not be found
	 */
	@Override
	public TourismBonaAttractionFormFirst fetchByPrimaryKey(
		long tourismBonaAttractFormFirstId) {

		return fetchByPrimaryKey((Serializable)tourismBonaAttractFormFirstId);
	}

	/**
	 * Returns all the tourism bona attraction form firsts.
	 *
	 * @return the tourism bona attraction form firsts
	 */
	@Override
	public List<TourismBonaAttractionFormFirst> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism bona attraction form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form firsts
	 * @param end the upper bound of the range of tourism bona attraction form firsts (not inclusive)
	 * @return the range of tourism bona attraction form firsts
	 */
	@Override
	public List<TourismBonaAttractionFormFirst> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism bona attraction form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form firsts
	 * @param end the upper bound of the range of tourism bona attraction form firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona attraction form firsts
	 */
	@Override
	public List<TourismBonaAttractionFormFirst> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAttractionFormFirst> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism bona attraction form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form firsts
	 * @param end the upper bound of the range of tourism bona attraction form firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona attraction form firsts
	 */
	@Override
	public List<TourismBonaAttractionFormFirst> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAttractionFormFirst> orderByComparator,
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

		List<TourismBonaAttractionFormFirst> list = null;

		if (useFinderCache) {
			list = (List<TourismBonaAttractionFormFirst>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMBONAATTRACTIONFORMFIRST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMBONAATTRACTIONFORMFIRST;

				sql = sql.concat(
					TourismBonaAttractionFormFirstModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismBonaAttractionFormFirst>)QueryUtil.list(
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
	 * Removes all the tourism bona attraction form firsts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst :
				findAll()) {

			remove(tourismBonaAttractionFormFirst);
		}
	}

	/**
	 * Returns the number of tourism bona attraction form firsts.
	 *
	 * @return the number of tourism bona attraction form firsts
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
					_SQL_COUNT_TOURISMBONAATTRACTIONFORMFIRST);

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
		return "tourismBonaAttractFormFirstId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMBONAATTRACTIONFORMFIRST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismBonaAttractionFormFirstModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism bona attraction form first persistence.
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

		_finderPathFetchBygetTourismById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetTourismById",
			new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, true);

		_finderPathCountBygetTourismById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetTourismById",
			new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, false);

		TourismBonaAttractionFormFirstUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismBonaAttractionFormFirstUtil.setPersistence(null);

		entityCache.removeCache(
			TourismBonaAttractionFormFirstImpl.class.getName());
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_TOURISMBONAATTRACTIONFORMFIRST =
		"SELECT tourismBonaAttractionFormFirst FROM TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst";

	private static final String
		_SQL_SELECT_TOURISMBONAATTRACTIONFORMFIRST_WHERE =
			"SELECT tourismBonaAttractionFormFirst FROM TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst WHERE ";

	private static final String _SQL_COUNT_TOURISMBONAATTRACTIONFORMFIRST =
		"SELECT COUNT(tourismBonaAttractionFormFirst) FROM TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst";

	private static final String
		_SQL_COUNT_TOURISMBONAATTRACTIONFORMFIRST_WHERE =
			"SELECT COUNT(tourismBonaAttractionFormFirst) FROM TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismBonaAttractionFormFirst.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismBonaAttractionFormFirst exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismBonaAttractionFormFirst exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismBonaAttractionFormFirstPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}