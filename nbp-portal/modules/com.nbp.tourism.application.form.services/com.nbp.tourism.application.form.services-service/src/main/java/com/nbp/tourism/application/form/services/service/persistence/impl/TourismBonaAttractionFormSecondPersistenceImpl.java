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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaAttractionFormSecondException;
import com.nbp.tourism.application.form.services.model.TourismBonaAttractionFormSecond;
import com.nbp.tourism.application.form.services.model.TourismBonaAttractionFormSecondTable;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormSecondImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormSecondModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAttractionFormSecondPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAttractionFormSecondUtil;
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
 * The persistence implementation for the tourism bona attraction form second service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismBonaAttractionFormSecondPersistence.class)
public class TourismBonaAttractionFormSecondPersistenceImpl
	extends BasePersistenceImpl<TourismBonaAttractionFormSecond>
	implements TourismBonaAttractionFormSecondPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismBonaAttractionFormSecondUtil</code> to access the tourism bona attraction form second persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismBonaAttractionFormSecondImpl.class.getName();

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
	 * Returns the tourism bona attraction form second where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAttractionFormSecondException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona attraction form second
	 * @throws NoSuchTourismBonaAttractionFormSecondException if a matching tourism bona attraction form second could not be found
	 */
	@Override
	public TourismBonaAttractionFormSecond findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAttractionFormSecondException {

		TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond =
			fetchBygetTourismById(tourismApplicationId);

		if (tourismBonaAttractionFormSecond == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismBonaAttractionFormSecondException(
				sb.toString());
		}

		return tourismBonaAttractionFormSecond;
	}

	/**
	 * Returns the tourism bona attraction form second where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona attraction form second, or <code>null</code> if a matching tourism bona attraction form second could not be found
	 */
	@Override
	public TourismBonaAttractionFormSecond fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism bona attraction form second where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona attraction form second, or <code>null</code> if a matching tourism bona attraction form second could not be found
	 */
	@Override
	public TourismBonaAttractionFormSecond fetchBygetTourismById(
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

		if (result instanceof TourismBonaAttractionFormSecond) {
			TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond =
				(TourismBonaAttractionFormSecond)result;

			if (tourismApplicationId !=
					tourismBonaAttractionFormSecond.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMBONAATTRACTIONFORMSECOND_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismBonaAttractionFormSecond> list = query.list();

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
								"TourismBonaAttractionFormSecondPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismBonaAttractionFormSecond
						tourismBonaAttractionFormSecond = list.get(0);

					result = tourismBonaAttractionFormSecond;

					cacheResult(tourismBonaAttractionFormSecond);
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
			return (TourismBonaAttractionFormSecond)result;
		}
	}

	/**
	 * Removes the tourism bona attraction form second where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona attraction form second that was removed
	 */
	@Override
	public TourismBonaAttractionFormSecond removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAttractionFormSecondException {

		TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond =
			findBygetTourismById(tourismApplicationId);

		return remove(tourismBonaAttractionFormSecond);
	}

	/**
	 * Returns the number of tourism bona attraction form seconds where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona attraction form seconds
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMBONAATTRACTIONFORMSECOND_WHERE);

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
			"tourismBonaAttractionFormSecond.tourismApplicationId = ?";

	public TourismBonaAttractionFormSecondPersistenceImpl() {
		setModelClass(TourismBonaAttractionFormSecond.class);

		setModelImplClass(TourismBonaAttractionFormSecondImpl.class);
		setModelPKClass(long.class);

		setTable(TourismBonaAttractionFormSecondTable.INSTANCE);
	}

	/**
	 * Caches the tourism bona attraction form second in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAttractionFormSecond the tourism bona attraction form second
	 */
	@Override
	public void cacheResult(
		TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond) {

		entityCache.putResult(
			TourismBonaAttractionFormSecondImpl.class,
			tourismBonaAttractionFormSecond.getPrimaryKey(),
			tourismBonaAttractionFormSecond);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {
				tourismBonaAttractionFormSecond.getTourismApplicationId()
			},
			tourismBonaAttractionFormSecond);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism bona attraction form seconds in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAttractionFormSeconds the tourism bona attraction form seconds
	 */
	@Override
	public void cacheResult(
		List<TourismBonaAttractionFormSecond>
			tourismBonaAttractionFormSeconds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismBonaAttractionFormSeconds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond :
				tourismBonaAttractionFormSeconds) {

			if (entityCache.getResult(
					TourismBonaAttractionFormSecondImpl.class,
					tourismBonaAttractionFormSecond.getPrimaryKey()) == null) {

				cacheResult(tourismBonaAttractionFormSecond);
			}
		}
	}

	/**
	 * Clears the cache for all tourism bona attraction form seconds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismBonaAttractionFormSecondImpl.class);

		finderCache.clearCache(TourismBonaAttractionFormSecondImpl.class);
	}

	/**
	 * Clears the cache for the tourism bona attraction form second.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond) {

		entityCache.removeResult(
			TourismBonaAttractionFormSecondImpl.class,
			tourismBonaAttractionFormSecond);
	}

	@Override
	public void clearCache(
		List<TourismBonaAttractionFormSecond>
			tourismBonaAttractionFormSeconds) {

		for (TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond :
				tourismBonaAttractionFormSeconds) {

			entityCache.removeResult(
				TourismBonaAttractionFormSecondImpl.class,
				tourismBonaAttractionFormSecond);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismBonaAttractionFormSecondImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismBonaAttractionFormSecondImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismBonaAttractionFormSecondModelImpl
			tourismBonaAttractionFormSecondModelImpl) {

		Object[] args = new Object[] {
			tourismBonaAttractionFormSecondModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismBonaAttractionFormSecondModelImpl);
	}

	/**
	 * Creates a new tourism bona attraction form second with the primary key. Does not add the tourism bona attraction form second to the database.
	 *
	 * @param tourismBonaAttractFormSecId the primary key for the new tourism bona attraction form second
	 * @return the new tourism bona attraction form second
	 */
	@Override
	public TourismBonaAttractionFormSecond create(
		long tourismBonaAttractFormSecId) {

		TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond =
			new TourismBonaAttractionFormSecondImpl();

		tourismBonaAttractionFormSecond.setNew(true);
		tourismBonaAttractionFormSecond.setPrimaryKey(
			tourismBonaAttractFormSecId);

		tourismBonaAttractionFormSecond.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismBonaAttractionFormSecond;
	}

	/**
	 * Removes the tourism bona attraction form second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaAttractFormSecId the primary key of the tourism bona attraction form second
	 * @return the tourism bona attraction form second that was removed
	 * @throws NoSuchTourismBonaAttractionFormSecondException if a tourism bona attraction form second with the primary key could not be found
	 */
	@Override
	public TourismBonaAttractionFormSecond remove(
			long tourismBonaAttractFormSecId)
		throws NoSuchTourismBonaAttractionFormSecondException {

		return remove((Serializable)tourismBonaAttractFormSecId);
	}

	/**
	 * Removes the tourism bona attraction form second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism bona attraction form second
	 * @return the tourism bona attraction form second that was removed
	 * @throws NoSuchTourismBonaAttractionFormSecondException if a tourism bona attraction form second with the primary key could not be found
	 */
	@Override
	public TourismBonaAttractionFormSecond remove(Serializable primaryKey)
		throws NoSuchTourismBonaAttractionFormSecondException {

		Session session = null;

		try {
			session = openSession();

			TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond =
				(TourismBonaAttractionFormSecond)session.get(
					TourismBonaAttractionFormSecondImpl.class, primaryKey);

			if (tourismBonaAttractionFormSecond == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismBonaAttractionFormSecondException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismBonaAttractionFormSecond);
		}
		catch (NoSuchTourismBonaAttractionFormSecondException
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
	protected TourismBonaAttractionFormSecond removeImpl(
		TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismBonaAttractionFormSecond)) {
				tourismBonaAttractionFormSecond =
					(TourismBonaAttractionFormSecond)session.get(
						TourismBonaAttractionFormSecondImpl.class,
						tourismBonaAttractionFormSecond.getPrimaryKeyObj());
			}

			if (tourismBonaAttractionFormSecond != null) {
				session.delete(tourismBonaAttractionFormSecond);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismBonaAttractionFormSecond != null) {
			clearCache(tourismBonaAttractionFormSecond);
		}

		return tourismBonaAttractionFormSecond;
	}

	@Override
	public TourismBonaAttractionFormSecond updateImpl(
		TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond) {

		boolean isNew = tourismBonaAttractionFormSecond.isNew();

		if (!(tourismBonaAttractionFormSecond instanceof
				TourismBonaAttractionFormSecondModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					tourismBonaAttractionFormSecond.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismBonaAttractionFormSecond);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismBonaAttractionFormSecond proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismBonaAttractionFormSecond implementation " +
					tourismBonaAttractionFormSecond.getClass());
		}

		TourismBonaAttractionFormSecondModelImpl
			tourismBonaAttractionFormSecondModelImpl =
				(TourismBonaAttractionFormSecondModelImpl)
					tourismBonaAttractionFormSecond;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(tourismBonaAttractionFormSecond.getCreateDate() == null)) {

			if (serviceContext == null) {
				tourismBonaAttractionFormSecond.setCreateDate(date);
			}
			else {
				tourismBonaAttractionFormSecond.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismBonaAttractionFormSecondModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismBonaAttractionFormSecond.setModifiedDate(date);
			}
			else {
				tourismBonaAttractionFormSecond.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismBonaAttractionFormSecond);
			}
			else {
				tourismBonaAttractionFormSecond =
					(TourismBonaAttractionFormSecond)session.merge(
						tourismBonaAttractionFormSecond);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismBonaAttractionFormSecondImpl.class,
			tourismBonaAttractionFormSecondModelImpl, false, true);

		cacheUniqueFindersCache(tourismBonaAttractionFormSecondModelImpl);

		if (isNew) {
			tourismBonaAttractionFormSecond.setNew(false);
		}

		tourismBonaAttractionFormSecond.resetOriginalValues();

		return tourismBonaAttractionFormSecond;
	}

	/**
	 * Returns the tourism bona attraction form second with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism bona attraction form second
	 * @return the tourism bona attraction form second
	 * @throws NoSuchTourismBonaAttractionFormSecondException if a tourism bona attraction form second with the primary key could not be found
	 */
	@Override
	public TourismBonaAttractionFormSecond findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchTourismBonaAttractionFormSecondException {

		TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond =
			fetchByPrimaryKey(primaryKey);

		if (tourismBonaAttractionFormSecond == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismBonaAttractionFormSecondException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismBonaAttractionFormSecond;
	}

	/**
	 * Returns the tourism bona attraction form second with the primary key or throws a <code>NoSuchTourismBonaAttractionFormSecondException</code> if it could not be found.
	 *
	 * @param tourismBonaAttractFormSecId the primary key of the tourism bona attraction form second
	 * @return the tourism bona attraction form second
	 * @throws NoSuchTourismBonaAttractionFormSecondException if a tourism bona attraction form second with the primary key could not be found
	 */
	@Override
	public TourismBonaAttractionFormSecond findByPrimaryKey(
			long tourismBonaAttractFormSecId)
		throws NoSuchTourismBonaAttractionFormSecondException {

		return findByPrimaryKey((Serializable)tourismBonaAttractFormSecId);
	}

	/**
	 * Returns the tourism bona attraction form second with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaAttractFormSecId the primary key of the tourism bona attraction form second
	 * @return the tourism bona attraction form second, or <code>null</code> if a tourism bona attraction form second with the primary key could not be found
	 */
	@Override
	public TourismBonaAttractionFormSecond fetchByPrimaryKey(
		long tourismBonaAttractFormSecId) {

		return fetchByPrimaryKey((Serializable)tourismBonaAttractFormSecId);
	}

	/**
	 * Returns all the tourism bona attraction form seconds.
	 *
	 * @return the tourism bona attraction form seconds
	 */
	@Override
	public List<TourismBonaAttractionFormSecond> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism bona attraction form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form seconds
	 * @param end the upper bound of the range of tourism bona attraction form seconds (not inclusive)
	 * @return the range of tourism bona attraction form seconds
	 */
	@Override
	public List<TourismBonaAttractionFormSecond> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism bona attraction form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form seconds
	 * @param end the upper bound of the range of tourism bona attraction form seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona attraction form seconds
	 */
	@Override
	public List<TourismBonaAttractionFormSecond> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAttractionFormSecond> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism bona attraction form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form seconds
	 * @param end the upper bound of the range of tourism bona attraction form seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona attraction form seconds
	 */
	@Override
	public List<TourismBonaAttractionFormSecond> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAttractionFormSecond> orderByComparator,
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

		List<TourismBonaAttractionFormSecond> list = null;

		if (useFinderCache) {
			list = (List<TourismBonaAttractionFormSecond>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMBONAATTRACTIONFORMSECOND);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMBONAATTRACTIONFORMSECOND;

				sql = sql.concat(
					TourismBonaAttractionFormSecondModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismBonaAttractionFormSecond>)QueryUtil.list(
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
	 * Removes all the tourism bona attraction form seconds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond :
				findAll()) {

			remove(tourismBonaAttractionFormSecond);
		}
	}

	/**
	 * Returns the number of tourism bona attraction form seconds.
	 *
	 * @return the number of tourism bona attraction form seconds
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
					_SQL_COUNT_TOURISMBONAATTRACTIONFORMSECOND);

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
		return "tourismBonaAttractFormSecId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMBONAATTRACTIONFORMSECOND;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismBonaAttractionFormSecondModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism bona attraction form second persistence.
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

		TourismBonaAttractionFormSecondUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismBonaAttractionFormSecondUtil.setPersistence(null);

		entityCache.removeCache(
			TourismBonaAttractionFormSecondImpl.class.getName());
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

	private static final String _SQL_SELECT_TOURISMBONAATTRACTIONFORMSECOND =
		"SELECT tourismBonaAttractionFormSecond FROM TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond";

	private static final String
		_SQL_SELECT_TOURISMBONAATTRACTIONFORMSECOND_WHERE =
			"SELECT tourismBonaAttractionFormSecond FROM TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond WHERE ";

	private static final String _SQL_COUNT_TOURISMBONAATTRACTIONFORMSECOND =
		"SELECT COUNT(tourismBonaAttractionFormSecond) FROM TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond";

	private static final String
		_SQL_COUNT_TOURISMBONAATTRACTIONFORMSECOND_WHERE =
			"SELECT COUNT(tourismBonaAttractionFormSecond) FROM TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismBonaAttractionFormSecond.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismBonaAttractionFormSecond exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismBonaAttractionFormSecond exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismBonaAttractionFormSecondPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}