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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaWaterSportsFormSecondException;
import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportsFormSecond;
import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportsFormSecondTable;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportsFormSecondImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportsFormSecondModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaWaterSportsFormSecondPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaWaterSportsFormSecondUtil;
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
 * The persistence implementation for the tourism bona water sports form second service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismBonaWaterSportsFormSecondPersistence.class)
public class TourismBonaWaterSportsFormSecondPersistenceImpl
	extends BasePersistenceImpl<TourismBonaWaterSportsFormSecond>
	implements TourismBonaWaterSportsFormSecondPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismBonaWaterSportsFormSecondUtil</code> to access the tourism bona water sports form second persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismBonaWaterSportsFormSecondImpl.class.getName();

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
	 * Returns the tourism bona water sports form second where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaWaterSportsFormSecondException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona water sports form second
	 * @throws NoSuchTourismBonaWaterSportsFormSecondException if a matching tourism bona water sports form second could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormSecond findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaWaterSportsFormSecondException {

		TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond =
			fetchBygetTourismById(tourismApplicationId);

		if (tourismBonaWaterSportsFormSecond == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismBonaWaterSportsFormSecondException(
				sb.toString());
		}

		return tourismBonaWaterSportsFormSecond;
	}

	/**
	 * Returns the tourism bona water sports form second where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona water sports form second, or <code>null</code> if a matching tourism bona water sports form second could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormSecond fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism bona water sports form second where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona water sports form second, or <code>null</code> if a matching tourism bona water sports form second could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormSecond fetchBygetTourismById(
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

		if (result instanceof TourismBonaWaterSportsFormSecond) {
			TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond =
				(TourismBonaWaterSportsFormSecond)result;

			if (tourismApplicationId !=
					tourismBonaWaterSportsFormSecond.
						getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMBONAWATERSPORTSFORMSECOND_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismBonaWaterSportsFormSecond> list = query.list();

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
								"TourismBonaWaterSportsFormSecondPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismBonaWaterSportsFormSecond
						tourismBonaWaterSportsFormSecond = list.get(0);

					result = tourismBonaWaterSportsFormSecond;

					cacheResult(tourismBonaWaterSportsFormSecond);
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
			return (TourismBonaWaterSportsFormSecond)result;
		}
	}

	/**
	 * Removes the tourism bona water sports form second where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona water sports form second that was removed
	 */
	@Override
	public TourismBonaWaterSportsFormSecond removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaWaterSportsFormSecondException {

		TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond =
			findBygetTourismById(tourismApplicationId);

		return remove(tourismBonaWaterSportsFormSecond);
	}

	/**
	 * Returns the number of tourism bona water sports form seconds where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona water sports form seconds
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMBONAWATERSPORTSFORMSECOND_WHERE);

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
			"tourismBonaWaterSportsFormSecond.tourismApplicationId = ?";

	public TourismBonaWaterSportsFormSecondPersistenceImpl() {
		setModelClass(TourismBonaWaterSportsFormSecond.class);

		setModelImplClass(TourismBonaWaterSportsFormSecondImpl.class);
		setModelPKClass(long.class);

		setTable(TourismBonaWaterSportsFormSecondTable.INSTANCE);
	}

	/**
	 * Caches the tourism bona water sports form second in the entity cache if it is enabled.
	 *
	 * @param tourismBonaWaterSportsFormSecond the tourism bona water sports form second
	 */
	@Override
	public void cacheResult(
		TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond) {

		entityCache.putResult(
			TourismBonaWaterSportsFormSecondImpl.class,
			tourismBonaWaterSportsFormSecond.getPrimaryKey(),
			tourismBonaWaterSportsFormSecond);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {
				tourismBonaWaterSportsFormSecond.getTourismApplicationId()
			},
			tourismBonaWaterSportsFormSecond);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism bona water sports form seconds in the entity cache if it is enabled.
	 *
	 * @param tourismBonaWaterSportsFormSeconds the tourism bona water sports form seconds
	 */
	@Override
	public void cacheResult(
		List<TourismBonaWaterSportsFormSecond>
			tourismBonaWaterSportsFormSeconds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismBonaWaterSportsFormSeconds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond :
				tourismBonaWaterSportsFormSeconds) {

			if (entityCache.getResult(
					TourismBonaWaterSportsFormSecondImpl.class,
					tourismBonaWaterSportsFormSecond.getPrimaryKey()) == null) {

				cacheResult(tourismBonaWaterSportsFormSecond);
			}
		}
	}

	/**
	 * Clears the cache for all tourism bona water sports form seconds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismBonaWaterSportsFormSecondImpl.class);

		finderCache.clearCache(TourismBonaWaterSportsFormSecondImpl.class);
	}

	/**
	 * Clears the cache for the tourism bona water sports form second.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond) {

		entityCache.removeResult(
			TourismBonaWaterSportsFormSecondImpl.class,
			tourismBonaWaterSportsFormSecond);
	}

	@Override
	public void clearCache(
		List<TourismBonaWaterSportsFormSecond>
			tourismBonaWaterSportsFormSeconds) {

		for (TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond :
				tourismBonaWaterSportsFormSeconds) {

			entityCache.removeResult(
				TourismBonaWaterSportsFormSecondImpl.class,
				tourismBonaWaterSportsFormSecond);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismBonaWaterSportsFormSecondImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismBonaWaterSportsFormSecondImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismBonaWaterSportsFormSecondModelImpl
			tourismBonaWaterSportsFormSecondModelImpl) {

		Object[] args = new Object[] {
			tourismBonaWaterSportsFormSecondModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismBonaWaterSportsFormSecondModelImpl);
	}

	/**
	 * Creates a new tourism bona water sports form second with the primary key. Does not add the tourism bona water sports form second to the database.
	 *
	 * @param tourismBonaWaterSportsFSecId the primary key for the new tourism bona water sports form second
	 * @return the new tourism bona water sports form second
	 */
	@Override
	public TourismBonaWaterSportsFormSecond create(
		long tourismBonaWaterSportsFSecId) {

		TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond =
			new TourismBonaWaterSportsFormSecondImpl();

		tourismBonaWaterSportsFormSecond.setNew(true);
		tourismBonaWaterSportsFormSecond.setPrimaryKey(
			tourismBonaWaterSportsFSecId);

		tourismBonaWaterSportsFormSecond.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismBonaWaterSportsFormSecond;
	}

	/**
	 * Removes the tourism bona water sports form second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaWaterSportsFSecId the primary key of the tourism bona water sports form second
	 * @return the tourism bona water sports form second that was removed
	 * @throws NoSuchTourismBonaWaterSportsFormSecondException if a tourism bona water sports form second with the primary key could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormSecond remove(
			long tourismBonaWaterSportsFSecId)
		throws NoSuchTourismBonaWaterSportsFormSecondException {

		return remove((Serializable)tourismBonaWaterSportsFSecId);
	}

	/**
	 * Removes the tourism bona water sports form second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism bona water sports form second
	 * @return the tourism bona water sports form second that was removed
	 * @throws NoSuchTourismBonaWaterSportsFormSecondException if a tourism bona water sports form second with the primary key could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormSecond remove(Serializable primaryKey)
		throws NoSuchTourismBonaWaterSportsFormSecondException {

		Session session = null;

		try {
			session = openSession();

			TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond =
				(TourismBonaWaterSportsFormSecond)session.get(
					TourismBonaWaterSportsFormSecondImpl.class, primaryKey);

			if (tourismBonaWaterSportsFormSecond == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismBonaWaterSportsFormSecondException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismBonaWaterSportsFormSecond);
		}
		catch (NoSuchTourismBonaWaterSportsFormSecondException
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
	protected TourismBonaWaterSportsFormSecond removeImpl(
		TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismBonaWaterSportsFormSecond)) {
				tourismBonaWaterSportsFormSecond =
					(TourismBonaWaterSportsFormSecond)session.get(
						TourismBonaWaterSportsFormSecondImpl.class,
						tourismBonaWaterSportsFormSecond.getPrimaryKeyObj());
			}

			if (tourismBonaWaterSportsFormSecond != null) {
				session.delete(tourismBonaWaterSportsFormSecond);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismBonaWaterSportsFormSecond != null) {
			clearCache(tourismBonaWaterSportsFormSecond);
		}

		return tourismBonaWaterSportsFormSecond;
	}

	@Override
	public TourismBonaWaterSportsFormSecond updateImpl(
		TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond) {

		boolean isNew = tourismBonaWaterSportsFormSecond.isNew();

		if (!(tourismBonaWaterSportsFormSecond instanceof
				TourismBonaWaterSportsFormSecondModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					tourismBonaWaterSportsFormSecond.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismBonaWaterSportsFormSecond);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismBonaWaterSportsFormSecond proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismBonaWaterSportsFormSecond implementation " +
					tourismBonaWaterSportsFormSecond.getClass());
		}

		TourismBonaWaterSportsFormSecondModelImpl
			tourismBonaWaterSportsFormSecondModelImpl =
				(TourismBonaWaterSportsFormSecondModelImpl)
					tourismBonaWaterSportsFormSecond;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(tourismBonaWaterSportsFormSecond.getCreateDate() == null)) {

			if (serviceContext == null) {
				tourismBonaWaterSportsFormSecond.setCreateDate(date);
			}
			else {
				tourismBonaWaterSportsFormSecond.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismBonaWaterSportsFormSecondModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismBonaWaterSportsFormSecond.setModifiedDate(date);
			}
			else {
				tourismBonaWaterSportsFormSecond.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismBonaWaterSportsFormSecond);
			}
			else {
				tourismBonaWaterSportsFormSecond =
					(TourismBonaWaterSportsFormSecond)session.merge(
						tourismBonaWaterSportsFormSecond);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismBonaWaterSportsFormSecondImpl.class,
			tourismBonaWaterSportsFormSecondModelImpl, false, true);

		cacheUniqueFindersCache(tourismBonaWaterSportsFormSecondModelImpl);

		if (isNew) {
			tourismBonaWaterSportsFormSecond.setNew(false);
		}

		tourismBonaWaterSportsFormSecond.resetOriginalValues();

		return tourismBonaWaterSportsFormSecond;
	}

	/**
	 * Returns the tourism bona water sports form second with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism bona water sports form second
	 * @return the tourism bona water sports form second
	 * @throws NoSuchTourismBonaWaterSportsFormSecondException if a tourism bona water sports form second with the primary key could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormSecond findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchTourismBonaWaterSportsFormSecondException {

		TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond =
			fetchByPrimaryKey(primaryKey);

		if (tourismBonaWaterSportsFormSecond == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismBonaWaterSportsFormSecondException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismBonaWaterSportsFormSecond;
	}

	/**
	 * Returns the tourism bona water sports form second with the primary key or throws a <code>NoSuchTourismBonaWaterSportsFormSecondException</code> if it could not be found.
	 *
	 * @param tourismBonaWaterSportsFSecId the primary key of the tourism bona water sports form second
	 * @return the tourism bona water sports form second
	 * @throws NoSuchTourismBonaWaterSportsFormSecondException if a tourism bona water sports form second with the primary key could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormSecond findByPrimaryKey(
			long tourismBonaWaterSportsFSecId)
		throws NoSuchTourismBonaWaterSportsFormSecondException {

		return findByPrimaryKey((Serializable)tourismBonaWaterSportsFSecId);
	}

	/**
	 * Returns the tourism bona water sports form second with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaWaterSportsFSecId the primary key of the tourism bona water sports form second
	 * @return the tourism bona water sports form second, or <code>null</code> if a tourism bona water sports form second with the primary key could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormSecond fetchByPrimaryKey(
		long tourismBonaWaterSportsFSecId) {

		return fetchByPrimaryKey((Serializable)tourismBonaWaterSportsFSecId);
	}

	/**
	 * Returns all the tourism bona water sports form seconds.
	 *
	 * @return the tourism bona water sports form seconds
	 */
	@Override
	public List<TourismBonaWaterSportsFormSecond> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism bona water sports form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form seconds
	 * @param end the upper bound of the range of tourism bona water sports form seconds (not inclusive)
	 * @return the range of tourism bona water sports form seconds
	 */
	@Override
	public List<TourismBonaWaterSportsFormSecond> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism bona water sports form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form seconds
	 * @param end the upper bound of the range of tourism bona water sports form seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona water sports form seconds
	 */
	@Override
	public List<TourismBonaWaterSportsFormSecond> findAll(
		int start, int end,
		OrderByComparator<TourismBonaWaterSportsFormSecond> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism bona water sports form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form seconds
	 * @param end the upper bound of the range of tourism bona water sports form seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona water sports form seconds
	 */
	@Override
	public List<TourismBonaWaterSportsFormSecond> findAll(
		int start, int end,
		OrderByComparator<TourismBonaWaterSportsFormSecond> orderByComparator,
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

		List<TourismBonaWaterSportsFormSecond> list = null;

		if (useFinderCache) {
			list =
				(List<TourismBonaWaterSportsFormSecond>)finderCache.getResult(
					finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMBONAWATERSPORTSFORMSECOND);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMBONAWATERSPORTSFORMSECOND;

				sql = sql.concat(
					TourismBonaWaterSportsFormSecondModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismBonaWaterSportsFormSecond>)QueryUtil.list(
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
	 * Removes all the tourism bona water sports form seconds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond :
				findAll()) {

			remove(tourismBonaWaterSportsFormSecond);
		}
	}

	/**
	 * Returns the number of tourism bona water sports form seconds.
	 *
	 * @return the number of tourism bona water sports form seconds
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
					_SQL_COUNT_TOURISMBONAWATERSPORTSFORMSECOND);

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
		return "tourismBonaWaterSportsFSecId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMBONAWATERSPORTSFORMSECOND;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismBonaWaterSportsFormSecondModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism bona water sports form second persistence.
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

		TourismBonaWaterSportsFormSecondUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismBonaWaterSportsFormSecondUtil.setPersistence(null);

		entityCache.removeCache(
			TourismBonaWaterSportsFormSecondImpl.class.getName());
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

	private static final String _SQL_SELECT_TOURISMBONAWATERSPORTSFORMSECOND =
		"SELECT tourismBonaWaterSportsFormSecond FROM TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond";

	private static final String
		_SQL_SELECT_TOURISMBONAWATERSPORTSFORMSECOND_WHERE =
			"SELECT tourismBonaWaterSportsFormSecond FROM TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond WHERE ";

	private static final String _SQL_COUNT_TOURISMBONAWATERSPORTSFORMSECOND =
		"SELECT COUNT(tourismBonaWaterSportsFormSecond) FROM TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond";

	private static final String
		_SQL_COUNT_TOURISMBONAWATERSPORTSFORMSECOND_WHERE =
			"SELECT COUNT(tourismBonaWaterSportsFormSecond) FROM TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismBonaWaterSportsFormSecond.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismBonaWaterSportsFormSecond exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismBonaWaterSportsFormSecond exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismBonaWaterSportsFormSecondPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}