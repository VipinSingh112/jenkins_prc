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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAnnualEarningsException;
import com.nbp.tourism.application.form.services.model.TourismNewAnnualEarnings;
import com.nbp.tourism.application.form.services.model.TourismNewAnnualEarningsTable;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAnnualEarningsImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAnnualEarningsModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAnnualEarningsPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAnnualEarningsUtil;
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
 * The persistence implementation for the tourism new annual earnings service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismNewAnnualEarningsPersistence.class)
public class TourismNewAnnualEarningsPersistenceImpl
	extends BasePersistenceImpl<TourismNewAnnualEarnings>
	implements TourismNewAnnualEarningsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismNewAnnualEarningsUtil</code> to access the tourism new annual earnings persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismNewAnnualEarningsImpl.class.getName();

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
	 * Returns the tourism new annual earnings where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAnnualEarningsException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new annual earnings
	 * @throws NoSuchTourismNewAnnualEarningsException if a matching tourism new annual earnings could not be found
	 */
	@Override
	public TourismNewAnnualEarnings findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAnnualEarningsException {

		TourismNewAnnualEarnings tourismNewAnnualEarnings =
			fetchBygetTourismById(tourismApplicationId);

		if (tourismNewAnnualEarnings == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismNewAnnualEarningsException(sb.toString());
		}

		return tourismNewAnnualEarnings;
	}

	/**
	 * Returns the tourism new annual earnings where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new annual earnings, or <code>null</code> if a matching tourism new annual earnings could not be found
	 */
	@Override
	public TourismNewAnnualEarnings fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism new annual earnings where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new annual earnings, or <code>null</code> if a matching tourism new annual earnings could not be found
	 */
	@Override
	public TourismNewAnnualEarnings fetchBygetTourismById(
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

		if (result instanceof TourismNewAnnualEarnings) {
			TourismNewAnnualEarnings tourismNewAnnualEarnings =
				(TourismNewAnnualEarnings)result;

			if (tourismApplicationId !=
					tourismNewAnnualEarnings.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMNEWANNUALEARNINGS_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismNewAnnualEarnings> list = query.list();

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
								"TourismNewAnnualEarningsPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismNewAnnualEarnings tourismNewAnnualEarnings =
						list.get(0);

					result = tourismNewAnnualEarnings;

					cacheResult(tourismNewAnnualEarnings);
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
			return (TourismNewAnnualEarnings)result;
		}
	}

	/**
	 * Removes the tourism new annual earnings where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new annual earnings that was removed
	 */
	@Override
	public TourismNewAnnualEarnings removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAnnualEarningsException {

		TourismNewAnnualEarnings tourismNewAnnualEarnings =
			findBygetTourismById(tourismApplicationId);

		return remove(tourismNewAnnualEarnings);
	}

	/**
	 * Returns the number of tourism new annual earningses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new annual earningses
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMNEWANNUALEARNINGS_WHERE);

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
			"tourismNewAnnualEarnings.tourismApplicationId = ?";

	public TourismNewAnnualEarningsPersistenceImpl() {
		setModelClass(TourismNewAnnualEarnings.class);

		setModelImplClass(TourismNewAnnualEarningsImpl.class);
		setModelPKClass(long.class);

		setTable(TourismNewAnnualEarningsTable.INSTANCE);
	}

	/**
	 * Caches the tourism new annual earnings in the entity cache if it is enabled.
	 *
	 * @param tourismNewAnnualEarnings the tourism new annual earnings
	 */
	@Override
	public void cacheResult(TourismNewAnnualEarnings tourismNewAnnualEarnings) {
		entityCache.putResult(
			TourismNewAnnualEarningsImpl.class,
			tourismNewAnnualEarnings.getPrimaryKey(), tourismNewAnnualEarnings);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {tourismNewAnnualEarnings.getTourismApplicationId()},
			tourismNewAnnualEarnings);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism new annual earningses in the entity cache if it is enabled.
	 *
	 * @param tourismNewAnnualEarningses the tourism new annual earningses
	 */
	@Override
	public void cacheResult(
		List<TourismNewAnnualEarnings> tourismNewAnnualEarningses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismNewAnnualEarningses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismNewAnnualEarnings tourismNewAnnualEarnings :
				tourismNewAnnualEarningses) {

			if (entityCache.getResult(
					TourismNewAnnualEarningsImpl.class,
					tourismNewAnnualEarnings.getPrimaryKey()) == null) {

				cacheResult(tourismNewAnnualEarnings);
			}
		}
	}

	/**
	 * Clears the cache for all tourism new annual earningses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismNewAnnualEarningsImpl.class);

		finderCache.clearCache(TourismNewAnnualEarningsImpl.class);
	}

	/**
	 * Clears the cache for the tourism new annual earnings.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TourismNewAnnualEarnings tourismNewAnnualEarnings) {
		entityCache.removeResult(
			TourismNewAnnualEarningsImpl.class, tourismNewAnnualEarnings);
	}

	@Override
	public void clearCache(
		List<TourismNewAnnualEarnings> tourismNewAnnualEarningses) {

		for (TourismNewAnnualEarnings tourismNewAnnualEarnings :
				tourismNewAnnualEarningses) {

			entityCache.removeResult(
				TourismNewAnnualEarningsImpl.class, tourismNewAnnualEarnings);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismNewAnnualEarningsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismNewAnnualEarningsImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismNewAnnualEarningsModelImpl tourismNewAnnualEarningsModelImpl) {

		Object[] args = new Object[] {
			tourismNewAnnualEarningsModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismNewAnnualEarningsModelImpl);
	}

	/**
	 * Creates a new tourism new annual earnings with the primary key. Does not add the tourism new annual earnings to the database.
	 *
	 * @param tourismNewAnnualEarningsId the primary key for the new tourism new annual earnings
	 * @return the new tourism new annual earnings
	 */
	@Override
	public TourismNewAnnualEarnings create(long tourismNewAnnualEarningsId) {
		TourismNewAnnualEarnings tourismNewAnnualEarnings =
			new TourismNewAnnualEarningsImpl();

		tourismNewAnnualEarnings.setNew(true);
		tourismNewAnnualEarnings.setPrimaryKey(tourismNewAnnualEarningsId);

		tourismNewAnnualEarnings.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismNewAnnualEarnings;
	}

	/**
	 * Removes the tourism new annual earnings with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAnnualEarningsId the primary key of the tourism new annual earnings
	 * @return the tourism new annual earnings that was removed
	 * @throws NoSuchTourismNewAnnualEarningsException if a tourism new annual earnings with the primary key could not be found
	 */
	@Override
	public TourismNewAnnualEarnings remove(long tourismNewAnnualEarningsId)
		throws NoSuchTourismNewAnnualEarningsException {

		return remove((Serializable)tourismNewAnnualEarningsId);
	}

	/**
	 * Removes the tourism new annual earnings with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism new annual earnings
	 * @return the tourism new annual earnings that was removed
	 * @throws NoSuchTourismNewAnnualEarningsException if a tourism new annual earnings with the primary key could not be found
	 */
	@Override
	public TourismNewAnnualEarnings remove(Serializable primaryKey)
		throws NoSuchTourismNewAnnualEarningsException {

		Session session = null;

		try {
			session = openSession();

			TourismNewAnnualEarnings tourismNewAnnualEarnings =
				(TourismNewAnnualEarnings)session.get(
					TourismNewAnnualEarningsImpl.class, primaryKey);

			if (tourismNewAnnualEarnings == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismNewAnnualEarningsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismNewAnnualEarnings);
		}
		catch (NoSuchTourismNewAnnualEarningsException noSuchEntityException) {
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
	protected TourismNewAnnualEarnings removeImpl(
		TourismNewAnnualEarnings tourismNewAnnualEarnings) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismNewAnnualEarnings)) {
				tourismNewAnnualEarnings =
					(TourismNewAnnualEarnings)session.get(
						TourismNewAnnualEarningsImpl.class,
						tourismNewAnnualEarnings.getPrimaryKeyObj());
			}

			if (tourismNewAnnualEarnings != null) {
				session.delete(tourismNewAnnualEarnings);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismNewAnnualEarnings != null) {
			clearCache(tourismNewAnnualEarnings);
		}

		return tourismNewAnnualEarnings;
	}

	@Override
	public TourismNewAnnualEarnings updateImpl(
		TourismNewAnnualEarnings tourismNewAnnualEarnings) {

		boolean isNew = tourismNewAnnualEarnings.isNew();

		if (!(tourismNewAnnualEarnings instanceof
				TourismNewAnnualEarningsModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tourismNewAnnualEarnings.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismNewAnnualEarnings);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismNewAnnualEarnings proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismNewAnnualEarnings implementation " +
					tourismNewAnnualEarnings.getClass());
		}

		TourismNewAnnualEarningsModelImpl tourismNewAnnualEarningsModelImpl =
			(TourismNewAnnualEarningsModelImpl)tourismNewAnnualEarnings;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismNewAnnualEarnings.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismNewAnnualEarnings.setCreateDate(date);
			}
			else {
				tourismNewAnnualEarnings.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismNewAnnualEarningsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismNewAnnualEarnings.setModifiedDate(date);
			}
			else {
				tourismNewAnnualEarnings.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismNewAnnualEarnings);
			}
			else {
				tourismNewAnnualEarnings =
					(TourismNewAnnualEarnings)session.merge(
						tourismNewAnnualEarnings);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismNewAnnualEarningsImpl.class,
			tourismNewAnnualEarningsModelImpl, false, true);

		cacheUniqueFindersCache(tourismNewAnnualEarningsModelImpl);

		if (isNew) {
			tourismNewAnnualEarnings.setNew(false);
		}

		tourismNewAnnualEarnings.resetOriginalValues();

		return tourismNewAnnualEarnings;
	}

	/**
	 * Returns the tourism new annual earnings with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism new annual earnings
	 * @return the tourism new annual earnings
	 * @throws NoSuchTourismNewAnnualEarningsException if a tourism new annual earnings with the primary key could not be found
	 */
	@Override
	public TourismNewAnnualEarnings findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTourismNewAnnualEarningsException {

		TourismNewAnnualEarnings tourismNewAnnualEarnings = fetchByPrimaryKey(
			primaryKey);

		if (tourismNewAnnualEarnings == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismNewAnnualEarningsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismNewAnnualEarnings;
	}

	/**
	 * Returns the tourism new annual earnings with the primary key or throws a <code>NoSuchTourismNewAnnualEarningsException</code> if it could not be found.
	 *
	 * @param tourismNewAnnualEarningsId the primary key of the tourism new annual earnings
	 * @return the tourism new annual earnings
	 * @throws NoSuchTourismNewAnnualEarningsException if a tourism new annual earnings with the primary key could not be found
	 */
	@Override
	public TourismNewAnnualEarnings findByPrimaryKey(
			long tourismNewAnnualEarningsId)
		throws NoSuchTourismNewAnnualEarningsException {

		return findByPrimaryKey((Serializable)tourismNewAnnualEarningsId);
	}

	/**
	 * Returns the tourism new annual earnings with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAnnualEarningsId the primary key of the tourism new annual earnings
	 * @return the tourism new annual earnings, or <code>null</code> if a tourism new annual earnings with the primary key could not be found
	 */
	@Override
	public TourismNewAnnualEarnings fetchByPrimaryKey(
		long tourismNewAnnualEarningsId) {

		return fetchByPrimaryKey((Serializable)tourismNewAnnualEarningsId);
	}

	/**
	 * Returns all the tourism new annual earningses.
	 *
	 * @return the tourism new annual earningses
	 */
	@Override
	public List<TourismNewAnnualEarnings> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism new annual earningses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAnnualEarningsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new annual earningses
	 * @param end the upper bound of the range of tourism new annual earningses (not inclusive)
	 * @return the range of tourism new annual earningses
	 */
	@Override
	public List<TourismNewAnnualEarnings> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism new annual earningses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAnnualEarningsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new annual earningses
	 * @param end the upper bound of the range of tourism new annual earningses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new annual earningses
	 */
	@Override
	public List<TourismNewAnnualEarnings> findAll(
		int start, int end,
		OrderByComparator<TourismNewAnnualEarnings> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism new annual earningses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAnnualEarningsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new annual earningses
	 * @param end the upper bound of the range of tourism new annual earningses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new annual earningses
	 */
	@Override
	public List<TourismNewAnnualEarnings> findAll(
		int start, int end,
		OrderByComparator<TourismNewAnnualEarnings> orderByComparator,
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

		List<TourismNewAnnualEarnings> list = null;

		if (useFinderCache) {
			list = (List<TourismNewAnnualEarnings>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMNEWANNUALEARNINGS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMNEWANNUALEARNINGS;

				sql = sql.concat(
					TourismNewAnnualEarningsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismNewAnnualEarnings>)QueryUtil.list(
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
	 * Removes all the tourism new annual earningses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismNewAnnualEarnings tourismNewAnnualEarnings : findAll()) {
			remove(tourismNewAnnualEarnings);
		}
	}

	/**
	 * Returns the number of tourism new annual earningses.
	 *
	 * @return the number of tourism new annual earningses
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
					_SQL_COUNT_TOURISMNEWANNUALEARNINGS);

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
		return "tourismNewAnnualEarningsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMNEWANNUALEARNINGS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismNewAnnualEarningsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism new annual earnings persistence.
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

		TourismNewAnnualEarningsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismNewAnnualEarningsUtil.setPersistence(null);

		entityCache.removeCache(TourismNewAnnualEarningsImpl.class.getName());
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

	private static final String _SQL_SELECT_TOURISMNEWANNUALEARNINGS =
		"SELECT tourismNewAnnualEarnings FROM TourismNewAnnualEarnings tourismNewAnnualEarnings";

	private static final String _SQL_SELECT_TOURISMNEWANNUALEARNINGS_WHERE =
		"SELECT tourismNewAnnualEarnings FROM TourismNewAnnualEarnings tourismNewAnnualEarnings WHERE ";

	private static final String _SQL_COUNT_TOURISMNEWANNUALEARNINGS =
		"SELECT COUNT(tourismNewAnnualEarnings) FROM TourismNewAnnualEarnings tourismNewAnnualEarnings";

	private static final String _SQL_COUNT_TOURISMNEWANNUALEARNINGS_WHERE =
		"SELECT COUNT(tourismNewAnnualEarnings) FROM TourismNewAnnualEarnings tourismNewAnnualEarnings WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismNewAnnualEarnings.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismNewAnnualEarnings exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismNewAnnualEarnings exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismNewAnnualEarningsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}