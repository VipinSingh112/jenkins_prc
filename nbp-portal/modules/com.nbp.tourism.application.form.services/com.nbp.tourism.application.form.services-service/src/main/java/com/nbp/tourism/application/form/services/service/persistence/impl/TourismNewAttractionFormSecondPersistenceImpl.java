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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAttractionFormSecondException;
import com.nbp.tourism.application.form.services.model.TourismNewAttractionFormSecond;
import com.nbp.tourism.application.form.services.model.TourismNewAttractionFormSecondTable;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormSecondImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormSecondModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAttractionFormSecondPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAttractionFormSecondUtil;
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
 * The persistence implementation for the tourism new attraction form second service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismNewAttractionFormSecondPersistence.class)
public class TourismNewAttractionFormSecondPersistenceImpl
	extends BasePersistenceImpl<TourismNewAttractionFormSecond>
	implements TourismNewAttractionFormSecondPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismNewAttractionFormSecondUtil</code> to access the tourism new attraction form second persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismNewAttractionFormSecondImpl.class.getName();

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
	 * Returns the tourism new attraction form second where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAttractionFormSecondException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction form second
	 * @throws NoSuchTourismNewAttractionFormSecondException if a matching tourism new attraction form second could not be found
	 */
	@Override
	public TourismNewAttractionFormSecond findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAttractionFormSecondException {

		TourismNewAttractionFormSecond tourismNewAttractionFormSecond =
			fetchBygetTourismById(tourismApplicationId);

		if (tourismNewAttractionFormSecond == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismNewAttractionFormSecondException(
				sb.toString());
		}

		return tourismNewAttractionFormSecond;
	}

	/**
	 * Returns the tourism new attraction form second where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction form second, or <code>null</code> if a matching tourism new attraction form second could not be found
	 */
	@Override
	public TourismNewAttractionFormSecond fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism new attraction form second where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new attraction form second, or <code>null</code> if a matching tourism new attraction form second could not be found
	 */
	@Override
	public TourismNewAttractionFormSecond fetchBygetTourismById(
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

		if (result instanceof TourismNewAttractionFormSecond) {
			TourismNewAttractionFormSecond tourismNewAttractionFormSecond =
				(TourismNewAttractionFormSecond)result;

			if (tourismApplicationId !=
					tourismNewAttractionFormSecond.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMNEWATTRACTIONFORMSECOND_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismNewAttractionFormSecond> list = query.list();

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
								"TourismNewAttractionFormSecondPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismNewAttractionFormSecond
						tourismNewAttractionFormSecond = list.get(0);

					result = tourismNewAttractionFormSecond;

					cacheResult(tourismNewAttractionFormSecond);
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
			return (TourismNewAttractionFormSecond)result;
		}
	}

	/**
	 * Removes the tourism new attraction form second where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new attraction form second that was removed
	 */
	@Override
	public TourismNewAttractionFormSecond removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAttractionFormSecondException {

		TourismNewAttractionFormSecond tourismNewAttractionFormSecond =
			findBygetTourismById(tourismApplicationId);

		return remove(tourismNewAttractionFormSecond);
	}

	/**
	 * Returns the number of tourism new attraction form seconds where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new attraction form seconds
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMNEWATTRACTIONFORMSECOND_WHERE);

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
			"tourismNewAttractionFormSecond.tourismApplicationId = ?";

	public TourismNewAttractionFormSecondPersistenceImpl() {
		setModelClass(TourismNewAttractionFormSecond.class);

		setModelImplClass(TourismNewAttractionFormSecondImpl.class);
		setModelPKClass(long.class);

		setTable(TourismNewAttractionFormSecondTable.INSTANCE);
	}

	/**
	 * Caches the tourism new attraction form second in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionFormSecond the tourism new attraction form second
	 */
	@Override
	public void cacheResult(
		TourismNewAttractionFormSecond tourismNewAttractionFormSecond) {

		entityCache.putResult(
			TourismNewAttractionFormSecondImpl.class,
			tourismNewAttractionFormSecond.getPrimaryKey(),
			tourismNewAttractionFormSecond);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {
				tourismNewAttractionFormSecond.getTourismApplicationId()
			},
			tourismNewAttractionFormSecond);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism new attraction form seconds in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionFormSeconds the tourism new attraction form seconds
	 */
	@Override
	public void cacheResult(
		List<TourismNewAttractionFormSecond> tourismNewAttractionFormSeconds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismNewAttractionFormSeconds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismNewAttractionFormSecond tourismNewAttractionFormSecond :
				tourismNewAttractionFormSeconds) {

			if (entityCache.getResult(
					TourismNewAttractionFormSecondImpl.class,
					tourismNewAttractionFormSecond.getPrimaryKey()) == null) {

				cacheResult(tourismNewAttractionFormSecond);
			}
		}
	}

	/**
	 * Clears the cache for all tourism new attraction form seconds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismNewAttractionFormSecondImpl.class);

		finderCache.clearCache(TourismNewAttractionFormSecondImpl.class);
	}

	/**
	 * Clears the cache for the tourism new attraction form second.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismNewAttractionFormSecond tourismNewAttractionFormSecond) {

		entityCache.removeResult(
			TourismNewAttractionFormSecondImpl.class,
			tourismNewAttractionFormSecond);
	}

	@Override
	public void clearCache(
		List<TourismNewAttractionFormSecond> tourismNewAttractionFormSeconds) {

		for (TourismNewAttractionFormSecond tourismNewAttractionFormSecond :
				tourismNewAttractionFormSeconds) {

			entityCache.removeResult(
				TourismNewAttractionFormSecondImpl.class,
				tourismNewAttractionFormSecond);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismNewAttractionFormSecondImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismNewAttractionFormSecondImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismNewAttractionFormSecondModelImpl
			tourismNewAttractionFormSecondModelImpl) {

		Object[] args = new Object[] {
			tourismNewAttractionFormSecondModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismNewAttractionFormSecondModelImpl);
	}

	/**
	 * Creates a new tourism new attraction form second with the primary key. Does not add the tourism new attraction form second to the database.
	 *
	 * @param tourismNewAttractionFormSecId the primary key for the new tourism new attraction form second
	 * @return the new tourism new attraction form second
	 */
	@Override
	public TourismNewAttractionFormSecond create(
		long tourismNewAttractionFormSecId) {

		TourismNewAttractionFormSecond tourismNewAttractionFormSecond =
			new TourismNewAttractionFormSecondImpl();

		tourismNewAttractionFormSecond.setNew(true);
		tourismNewAttractionFormSecond.setPrimaryKey(
			tourismNewAttractionFormSecId);

		tourismNewAttractionFormSecond.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismNewAttractionFormSecond;
	}

	/**
	 * Removes the tourism new attraction form second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAttractionFormSecId the primary key of the tourism new attraction form second
	 * @return the tourism new attraction form second that was removed
	 * @throws NoSuchTourismNewAttractionFormSecondException if a tourism new attraction form second with the primary key could not be found
	 */
	@Override
	public TourismNewAttractionFormSecond remove(
			long tourismNewAttractionFormSecId)
		throws NoSuchTourismNewAttractionFormSecondException {

		return remove((Serializable)tourismNewAttractionFormSecId);
	}

	/**
	 * Removes the tourism new attraction form second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism new attraction form second
	 * @return the tourism new attraction form second that was removed
	 * @throws NoSuchTourismNewAttractionFormSecondException if a tourism new attraction form second with the primary key could not be found
	 */
	@Override
	public TourismNewAttractionFormSecond remove(Serializable primaryKey)
		throws NoSuchTourismNewAttractionFormSecondException {

		Session session = null;

		try {
			session = openSession();

			TourismNewAttractionFormSecond tourismNewAttractionFormSecond =
				(TourismNewAttractionFormSecond)session.get(
					TourismNewAttractionFormSecondImpl.class, primaryKey);

			if (tourismNewAttractionFormSecond == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismNewAttractionFormSecondException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismNewAttractionFormSecond);
		}
		catch (NoSuchTourismNewAttractionFormSecondException
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
	protected TourismNewAttractionFormSecond removeImpl(
		TourismNewAttractionFormSecond tourismNewAttractionFormSecond) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismNewAttractionFormSecond)) {
				tourismNewAttractionFormSecond =
					(TourismNewAttractionFormSecond)session.get(
						TourismNewAttractionFormSecondImpl.class,
						tourismNewAttractionFormSecond.getPrimaryKeyObj());
			}

			if (tourismNewAttractionFormSecond != null) {
				session.delete(tourismNewAttractionFormSecond);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismNewAttractionFormSecond != null) {
			clearCache(tourismNewAttractionFormSecond);
		}

		return tourismNewAttractionFormSecond;
	}

	@Override
	public TourismNewAttractionFormSecond updateImpl(
		TourismNewAttractionFormSecond tourismNewAttractionFormSecond) {

		boolean isNew = tourismNewAttractionFormSecond.isNew();

		if (!(tourismNewAttractionFormSecond instanceof
				TourismNewAttractionFormSecondModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					tourismNewAttractionFormSecond.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismNewAttractionFormSecond);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismNewAttractionFormSecond proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismNewAttractionFormSecond implementation " +
					tourismNewAttractionFormSecond.getClass());
		}

		TourismNewAttractionFormSecondModelImpl
			tourismNewAttractionFormSecondModelImpl =
				(TourismNewAttractionFormSecondModelImpl)
					tourismNewAttractionFormSecond;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismNewAttractionFormSecond.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismNewAttractionFormSecond.setCreateDate(date);
			}
			else {
				tourismNewAttractionFormSecond.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismNewAttractionFormSecondModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismNewAttractionFormSecond.setModifiedDate(date);
			}
			else {
				tourismNewAttractionFormSecond.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismNewAttractionFormSecond);
			}
			else {
				tourismNewAttractionFormSecond =
					(TourismNewAttractionFormSecond)session.merge(
						tourismNewAttractionFormSecond);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismNewAttractionFormSecondImpl.class,
			tourismNewAttractionFormSecondModelImpl, false, true);

		cacheUniqueFindersCache(tourismNewAttractionFormSecondModelImpl);

		if (isNew) {
			tourismNewAttractionFormSecond.setNew(false);
		}

		tourismNewAttractionFormSecond.resetOriginalValues();

		return tourismNewAttractionFormSecond;
	}

	/**
	 * Returns the tourism new attraction form second with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism new attraction form second
	 * @return the tourism new attraction form second
	 * @throws NoSuchTourismNewAttractionFormSecondException if a tourism new attraction form second with the primary key could not be found
	 */
	@Override
	public TourismNewAttractionFormSecond findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchTourismNewAttractionFormSecondException {

		TourismNewAttractionFormSecond tourismNewAttractionFormSecond =
			fetchByPrimaryKey(primaryKey);

		if (tourismNewAttractionFormSecond == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismNewAttractionFormSecondException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismNewAttractionFormSecond;
	}

	/**
	 * Returns the tourism new attraction form second with the primary key or throws a <code>NoSuchTourismNewAttractionFormSecondException</code> if it could not be found.
	 *
	 * @param tourismNewAttractionFormSecId the primary key of the tourism new attraction form second
	 * @return the tourism new attraction form second
	 * @throws NoSuchTourismNewAttractionFormSecondException if a tourism new attraction form second with the primary key could not be found
	 */
	@Override
	public TourismNewAttractionFormSecond findByPrimaryKey(
			long tourismNewAttractionFormSecId)
		throws NoSuchTourismNewAttractionFormSecondException {

		return findByPrimaryKey((Serializable)tourismNewAttractionFormSecId);
	}

	/**
	 * Returns the tourism new attraction form second with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAttractionFormSecId the primary key of the tourism new attraction form second
	 * @return the tourism new attraction form second, or <code>null</code> if a tourism new attraction form second with the primary key could not be found
	 */
	@Override
	public TourismNewAttractionFormSecond fetchByPrimaryKey(
		long tourismNewAttractionFormSecId) {

		return fetchByPrimaryKey((Serializable)tourismNewAttractionFormSecId);
	}

	/**
	 * Returns all the tourism new attraction form seconds.
	 *
	 * @return the tourism new attraction form seconds
	 */
	@Override
	public List<TourismNewAttractionFormSecond> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism new attraction form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form seconds
	 * @param end the upper bound of the range of tourism new attraction form seconds (not inclusive)
	 * @return the range of tourism new attraction form seconds
	 */
	@Override
	public List<TourismNewAttractionFormSecond> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism new attraction form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form seconds
	 * @param end the upper bound of the range of tourism new attraction form seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new attraction form seconds
	 */
	@Override
	public List<TourismNewAttractionFormSecond> findAll(
		int start, int end,
		OrderByComparator<TourismNewAttractionFormSecond> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism new attraction form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form seconds
	 * @param end the upper bound of the range of tourism new attraction form seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new attraction form seconds
	 */
	@Override
	public List<TourismNewAttractionFormSecond> findAll(
		int start, int end,
		OrderByComparator<TourismNewAttractionFormSecond> orderByComparator,
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

		List<TourismNewAttractionFormSecond> list = null;

		if (useFinderCache) {
			list = (List<TourismNewAttractionFormSecond>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMNEWATTRACTIONFORMSECOND);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMNEWATTRACTIONFORMSECOND;

				sql = sql.concat(
					TourismNewAttractionFormSecondModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismNewAttractionFormSecond>)QueryUtil.list(
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
	 * Removes all the tourism new attraction form seconds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismNewAttractionFormSecond tourismNewAttractionFormSecond :
				findAll()) {

			remove(tourismNewAttractionFormSecond);
		}
	}

	/**
	 * Returns the number of tourism new attraction form seconds.
	 *
	 * @return the number of tourism new attraction form seconds
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
					_SQL_COUNT_TOURISMNEWATTRACTIONFORMSECOND);

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
		return "tourismNewAttractionFormSecId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMNEWATTRACTIONFORMSECOND;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismNewAttractionFormSecondModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism new attraction form second persistence.
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

		TourismNewAttractionFormSecondUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismNewAttractionFormSecondUtil.setPersistence(null);

		entityCache.removeCache(
			TourismNewAttractionFormSecondImpl.class.getName());
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

	private static final String _SQL_SELECT_TOURISMNEWATTRACTIONFORMSECOND =
		"SELECT tourismNewAttractionFormSecond FROM TourismNewAttractionFormSecond tourismNewAttractionFormSecond";

	private static final String
		_SQL_SELECT_TOURISMNEWATTRACTIONFORMSECOND_WHERE =
			"SELECT tourismNewAttractionFormSecond FROM TourismNewAttractionFormSecond tourismNewAttractionFormSecond WHERE ";

	private static final String _SQL_COUNT_TOURISMNEWATTRACTIONFORMSECOND =
		"SELECT COUNT(tourismNewAttractionFormSecond) FROM TourismNewAttractionFormSecond tourismNewAttractionFormSecond";

	private static final String
		_SQL_COUNT_TOURISMNEWATTRACTIONFORMSECOND_WHERE =
			"SELECT COUNT(tourismNewAttractionFormSecond) FROM TourismNewAttractionFormSecond tourismNewAttractionFormSecond WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismNewAttractionFormSecond.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismNewAttractionFormSecond exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismNewAttractionFormSecond exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismNewAttractionFormSecondPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}