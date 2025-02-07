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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaWaterSportsFormFirstException;
import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportsFormFirst;
import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportsFormFirstTable;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportsFormFirstImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportsFormFirstModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaWaterSportsFormFirstPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaWaterSportsFormFirstUtil;
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
 * The persistence implementation for the tourism bona water sports form first service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismBonaWaterSportsFormFirstPersistence.class)
public class TourismBonaWaterSportsFormFirstPersistenceImpl
	extends BasePersistenceImpl<TourismBonaWaterSportsFormFirst>
	implements TourismBonaWaterSportsFormFirstPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismBonaWaterSportsFormFirstUtil</code> to access the tourism bona water sports form first persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismBonaWaterSportsFormFirstImpl.class.getName();

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
	 * Returns the tourism bona water sports form first where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaWaterSportsFormFirstException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona water sports form first
	 * @throws NoSuchTourismBonaWaterSportsFormFirstException if a matching tourism bona water sports form first could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormFirst findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaWaterSportsFormFirstException {

		TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst =
			fetchBygetTourismById(tourismApplicationId);

		if (tourismBonaWaterSportsFormFirst == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismBonaWaterSportsFormFirstException(
				sb.toString());
		}

		return tourismBonaWaterSportsFormFirst;
	}

	/**
	 * Returns the tourism bona water sports form first where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona water sports form first, or <code>null</code> if a matching tourism bona water sports form first could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormFirst fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism bona water sports form first where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona water sports form first, or <code>null</code> if a matching tourism bona water sports form first could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormFirst fetchBygetTourismById(
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

		if (result instanceof TourismBonaWaterSportsFormFirst) {
			TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst =
				(TourismBonaWaterSportsFormFirst)result;

			if (tourismApplicationId !=
					tourismBonaWaterSportsFormFirst.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMBONAWATERSPORTSFORMFIRST_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismBonaWaterSportsFormFirst> list = query.list();

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
								"TourismBonaWaterSportsFormFirstPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismBonaWaterSportsFormFirst
						tourismBonaWaterSportsFormFirst = list.get(0);

					result = tourismBonaWaterSportsFormFirst;

					cacheResult(tourismBonaWaterSportsFormFirst);
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
			return (TourismBonaWaterSportsFormFirst)result;
		}
	}

	/**
	 * Removes the tourism bona water sports form first where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona water sports form first that was removed
	 */
	@Override
	public TourismBonaWaterSportsFormFirst removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaWaterSportsFormFirstException {

		TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst =
			findBygetTourismById(tourismApplicationId);

		return remove(tourismBonaWaterSportsFormFirst);
	}

	/**
	 * Returns the number of tourism bona water sports form firsts where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona water sports form firsts
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMBONAWATERSPORTSFORMFIRST_WHERE);

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
			"tourismBonaWaterSportsFormFirst.tourismApplicationId = ?";

	public TourismBonaWaterSportsFormFirstPersistenceImpl() {
		setModelClass(TourismBonaWaterSportsFormFirst.class);

		setModelImplClass(TourismBonaWaterSportsFormFirstImpl.class);
		setModelPKClass(long.class);

		setTable(TourismBonaWaterSportsFormFirstTable.INSTANCE);
	}

	/**
	 * Caches the tourism bona water sports form first in the entity cache if it is enabled.
	 *
	 * @param tourismBonaWaterSportsFormFirst the tourism bona water sports form first
	 */
	@Override
	public void cacheResult(
		TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst) {

		entityCache.putResult(
			TourismBonaWaterSportsFormFirstImpl.class,
			tourismBonaWaterSportsFormFirst.getPrimaryKey(),
			tourismBonaWaterSportsFormFirst);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {
				tourismBonaWaterSportsFormFirst.getTourismApplicationId()
			},
			tourismBonaWaterSportsFormFirst);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism bona water sports form firsts in the entity cache if it is enabled.
	 *
	 * @param tourismBonaWaterSportsFormFirsts the tourism bona water sports form firsts
	 */
	@Override
	public void cacheResult(
		List<TourismBonaWaterSportsFormFirst>
			tourismBonaWaterSportsFormFirsts) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismBonaWaterSportsFormFirsts.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst :
				tourismBonaWaterSportsFormFirsts) {

			if (entityCache.getResult(
					TourismBonaWaterSportsFormFirstImpl.class,
					tourismBonaWaterSportsFormFirst.getPrimaryKey()) == null) {

				cacheResult(tourismBonaWaterSportsFormFirst);
			}
		}
	}

	/**
	 * Clears the cache for all tourism bona water sports form firsts.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismBonaWaterSportsFormFirstImpl.class);

		finderCache.clearCache(TourismBonaWaterSportsFormFirstImpl.class);
	}

	/**
	 * Clears the cache for the tourism bona water sports form first.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst) {

		entityCache.removeResult(
			TourismBonaWaterSportsFormFirstImpl.class,
			tourismBonaWaterSportsFormFirst);
	}

	@Override
	public void clearCache(
		List<TourismBonaWaterSportsFormFirst>
			tourismBonaWaterSportsFormFirsts) {

		for (TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst :
				tourismBonaWaterSportsFormFirsts) {

			entityCache.removeResult(
				TourismBonaWaterSportsFormFirstImpl.class,
				tourismBonaWaterSportsFormFirst);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismBonaWaterSportsFormFirstImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismBonaWaterSportsFormFirstImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismBonaWaterSportsFormFirstModelImpl
			tourismBonaWaterSportsFormFirstModelImpl) {

		Object[] args = new Object[] {
			tourismBonaWaterSportsFormFirstModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismBonaWaterSportsFormFirstModelImpl);
	}

	/**
	 * Creates a new tourism bona water sports form first with the primary key. Does not add the tourism bona water sports form first to the database.
	 *
	 * @param tourismBonaWaterSFFirstId the primary key for the new tourism bona water sports form first
	 * @return the new tourism bona water sports form first
	 */
	@Override
	public TourismBonaWaterSportsFormFirst create(
		long tourismBonaWaterSFFirstId) {

		TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst =
			new TourismBonaWaterSportsFormFirstImpl();

		tourismBonaWaterSportsFormFirst.setNew(true);
		tourismBonaWaterSportsFormFirst.setPrimaryKey(
			tourismBonaWaterSFFirstId);

		tourismBonaWaterSportsFormFirst.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismBonaWaterSportsFormFirst;
	}

	/**
	 * Removes the tourism bona water sports form first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaWaterSFFirstId the primary key of the tourism bona water sports form first
	 * @return the tourism bona water sports form first that was removed
	 * @throws NoSuchTourismBonaWaterSportsFormFirstException if a tourism bona water sports form first with the primary key could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormFirst remove(
			long tourismBonaWaterSFFirstId)
		throws NoSuchTourismBonaWaterSportsFormFirstException {

		return remove((Serializable)tourismBonaWaterSFFirstId);
	}

	/**
	 * Removes the tourism bona water sports form first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism bona water sports form first
	 * @return the tourism bona water sports form first that was removed
	 * @throws NoSuchTourismBonaWaterSportsFormFirstException if a tourism bona water sports form first with the primary key could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormFirst remove(Serializable primaryKey)
		throws NoSuchTourismBonaWaterSportsFormFirstException {

		Session session = null;

		try {
			session = openSession();

			TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst =
				(TourismBonaWaterSportsFormFirst)session.get(
					TourismBonaWaterSportsFormFirstImpl.class, primaryKey);

			if (tourismBonaWaterSportsFormFirst == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismBonaWaterSportsFormFirstException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismBonaWaterSportsFormFirst);
		}
		catch (NoSuchTourismBonaWaterSportsFormFirstException
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
	protected TourismBonaWaterSportsFormFirst removeImpl(
		TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismBonaWaterSportsFormFirst)) {
				tourismBonaWaterSportsFormFirst =
					(TourismBonaWaterSportsFormFirst)session.get(
						TourismBonaWaterSportsFormFirstImpl.class,
						tourismBonaWaterSportsFormFirst.getPrimaryKeyObj());
			}

			if (tourismBonaWaterSportsFormFirst != null) {
				session.delete(tourismBonaWaterSportsFormFirst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismBonaWaterSportsFormFirst != null) {
			clearCache(tourismBonaWaterSportsFormFirst);
		}

		return tourismBonaWaterSportsFormFirst;
	}

	@Override
	public TourismBonaWaterSportsFormFirst updateImpl(
		TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst) {

		boolean isNew = tourismBonaWaterSportsFormFirst.isNew();

		if (!(tourismBonaWaterSportsFormFirst instanceof
				TourismBonaWaterSportsFormFirstModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					tourismBonaWaterSportsFormFirst.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismBonaWaterSportsFormFirst);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismBonaWaterSportsFormFirst proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismBonaWaterSportsFormFirst implementation " +
					tourismBonaWaterSportsFormFirst.getClass());
		}

		TourismBonaWaterSportsFormFirstModelImpl
			tourismBonaWaterSportsFormFirstModelImpl =
				(TourismBonaWaterSportsFormFirstModelImpl)
					tourismBonaWaterSportsFormFirst;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(tourismBonaWaterSportsFormFirst.getCreateDate() == null)) {

			if (serviceContext == null) {
				tourismBonaWaterSportsFormFirst.setCreateDate(date);
			}
			else {
				tourismBonaWaterSportsFormFirst.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismBonaWaterSportsFormFirstModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismBonaWaterSportsFormFirst.setModifiedDate(date);
			}
			else {
				tourismBonaWaterSportsFormFirst.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismBonaWaterSportsFormFirst);
			}
			else {
				tourismBonaWaterSportsFormFirst =
					(TourismBonaWaterSportsFormFirst)session.merge(
						tourismBonaWaterSportsFormFirst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismBonaWaterSportsFormFirstImpl.class,
			tourismBonaWaterSportsFormFirstModelImpl, false, true);

		cacheUniqueFindersCache(tourismBonaWaterSportsFormFirstModelImpl);

		if (isNew) {
			tourismBonaWaterSportsFormFirst.setNew(false);
		}

		tourismBonaWaterSportsFormFirst.resetOriginalValues();

		return tourismBonaWaterSportsFormFirst;
	}

	/**
	 * Returns the tourism bona water sports form first with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism bona water sports form first
	 * @return the tourism bona water sports form first
	 * @throws NoSuchTourismBonaWaterSportsFormFirstException if a tourism bona water sports form first with the primary key could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormFirst findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchTourismBonaWaterSportsFormFirstException {

		TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst =
			fetchByPrimaryKey(primaryKey);

		if (tourismBonaWaterSportsFormFirst == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismBonaWaterSportsFormFirstException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismBonaWaterSportsFormFirst;
	}

	/**
	 * Returns the tourism bona water sports form first with the primary key or throws a <code>NoSuchTourismBonaWaterSportsFormFirstException</code> if it could not be found.
	 *
	 * @param tourismBonaWaterSFFirstId the primary key of the tourism bona water sports form first
	 * @return the tourism bona water sports form first
	 * @throws NoSuchTourismBonaWaterSportsFormFirstException if a tourism bona water sports form first with the primary key could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormFirst findByPrimaryKey(
			long tourismBonaWaterSFFirstId)
		throws NoSuchTourismBonaWaterSportsFormFirstException {

		return findByPrimaryKey((Serializable)tourismBonaWaterSFFirstId);
	}

	/**
	 * Returns the tourism bona water sports form first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaWaterSFFirstId the primary key of the tourism bona water sports form first
	 * @return the tourism bona water sports form first, or <code>null</code> if a tourism bona water sports form first with the primary key could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormFirst fetchByPrimaryKey(
		long tourismBonaWaterSFFirstId) {

		return fetchByPrimaryKey((Serializable)tourismBonaWaterSFFirstId);
	}

	/**
	 * Returns all the tourism bona water sports form firsts.
	 *
	 * @return the tourism bona water sports form firsts
	 */
	@Override
	public List<TourismBonaWaterSportsFormFirst> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism bona water sports form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form firsts
	 * @param end the upper bound of the range of tourism bona water sports form firsts (not inclusive)
	 * @return the range of tourism bona water sports form firsts
	 */
	@Override
	public List<TourismBonaWaterSportsFormFirst> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism bona water sports form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form firsts
	 * @param end the upper bound of the range of tourism bona water sports form firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona water sports form firsts
	 */
	@Override
	public List<TourismBonaWaterSportsFormFirst> findAll(
		int start, int end,
		OrderByComparator<TourismBonaWaterSportsFormFirst> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism bona water sports form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form firsts
	 * @param end the upper bound of the range of tourism bona water sports form firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona water sports form firsts
	 */
	@Override
	public List<TourismBonaWaterSportsFormFirst> findAll(
		int start, int end,
		OrderByComparator<TourismBonaWaterSportsFormFirst> orderByComparator,
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

		List<TourismBonaWaterSportsFormFirst> list = null;

		if (useFinderCache) {
			list = (List<TourismBonaWaterSportsFormFirst>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMBONAWATERSPORTSFORMFIRST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMBONAWATERSPORTSFORMFIRST;

				sql = sql.concat(
					TourismBonaWaterSportsFormFirstModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismBonaWaterSportsFormFirst>)QueryUtil.list(
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
	 * Removes all the tourism bona water sports form firsts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst :
				findAll()) {

			remove(tourismBonaWaterSportsFormFirst);
		}
	}

	/**
	 * Returns the number of tourism bona water sports form firsts.
	 *
	 * @return the number of tourism bona water sports form firsts
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
					_SQL_COUNT_TOURISMBONAWATERSPORTSFORMFIRST);

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
		return "tourismBonaWaterSFFirstId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMBONAWATERSPORTSFORMFIRST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismBonaWaterSportsFormFirstModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism bona water sports form first persistence.
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

		TourismBonaWaterSportsFormFirstUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismBonaWaterSportsFormFirstUtil.setPersistence(null);

		entityCache.removeCache(
			TourismBonaWaterSportsFormFirstImpl.class.getName());
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

	private static final String _SQL_SELECT_TOURISMBONAWATERSPORTSFORMFIRST =
		"SELECT tourismBonaWaterSportsFormFirst FROM TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst";

	private static final String
		_SQL_SELECT_TOURISMBONAWATERSPORTSFORMFIRST_WHERE =
			"SELECT tourismBonaWaterSportsFormFirst FROM TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst WHERE ";

	private static final String _SQL_COUNT_TOURISMBONAWATERSPORTSFORMFIRST =
		"SELECT COUNT(tourismBonaWaterSportsFormFirst) FROM TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst";

	private static final String
		_SQL_COUNT_TOURISMBONAWATERSPORTSFORMFIRST_WHERE =
			"SELECT COUNT(tourismBonaWaterSportsFormFirst) FROM TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismBonaWaterSportsFormFirst.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismBonaWaterSportsFormFirst exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismBonaWaterSportsFormFirst exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismBonaWaterSportsFormFirstPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}