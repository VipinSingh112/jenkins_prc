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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaGroundTransportatioCarRentalException;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransportatioCarRental;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransportatioCarRentalTable;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransportatioCarRentalImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransportatioCarRentalModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundTransportatioCarRentalPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundTransportatioCarRentalUtil;
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
 * The persistence implementation for the tourism bona ground transportatio car rental service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismBonaGroundTransportatioCarRentalPersistence.class)
public class TourismBonaGroundTransportatioCarRentalPersistenceImpl
	extends BasePersistenceImpl<TourismBonaGroundTransportatioCarRental>
	implements TourismBonaGroundTransportatioCarRentalPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismBonaGroundTransportatioCarRentalUtil</code> to access the tourism bona ground transportatio car rental persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismBonaGroundTransportatioCarRentalImpl.class.getName();

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
	 * Returns the tourism bona ground transportatio car rental where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaGroundTransportatioCarRentalException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground transportatio car rental
	 * @throws NoSuchTourismBonaGroundTransportatioCarRentalException if a matching tourism bona ground transportatio car rental could not be found
	 */
	@Override
	public TourismBonaGroundTransportatioCarRental findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundTransportatioCarRentalException {

		TourismBonaGroundTransportatioCarRental
			tourismBonaGroundTransportatioCarRental = fetchBygetTourismById(
				tourismApplicationId);

		if (tourismBonaGroundTransportatioCarRental == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismBonaGroundTransportatioCarRentalException(
				sb.toString());
		}

		return tourismBonaGroundTransportatioCarRental;
	}

	/**
	 * Returns the tourism bona ground transportatio car rental where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground transportatio car rental, or <code>null</code> if a matching tourism bona ground transportatio car rental could not be found
	 */
	@Override
	public TourismBonaGroundTransportatioCarRental fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism bona ground transportatio car rental where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona ground transportatio car rental, or <code>null</code> if a matching tourism bona ground transportatio car rental could not be found
	 */
	@Override
	public TourismBonaGroundTransportatioCarRental fetchBygetTourismById(
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

		if (result instanceof TourismBonaGroundTransportatioCarRental) {
			TourismBonaGroundTransportatioCarRental
				tourismBonaGroundTransportatioCarRental =
					(TourismBonaGroundTransportatioCarRental)result;

			if (tourismApplicationId !=
					tourismBonaGroundTransportatioCarRental.
						getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(
				_SQL_SELECT_TOURISMBONAGROUNDTRANSPORTATIOCARRENTAL_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismBonaGroundTransportatioCarRental> list =
					query.list();

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
								"TourismBonaGroundTransportatioCarRentalPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismBonaGroundTransportatioCarRental
						tourismBonaGroundTransportatioCarRental = list.get(0);

					result = tourismBonaGroundTransportatioCarRental;

					cacheResult(tourismBonaGroundTransportatioCarRental);
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
			return (TourismBonaGroundTransportatioCarRental)result;
		}
	}

	/**
	 * Removes the tourism bona ground transportatio car rental where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona ground transportatio car rental that was removed
	 */
	@Override
	public TourismBonaGroundTransportatioCarRental removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundTransportatioCarRentalException {

		TourismBonaGroundTransportatioCarRental
			tourismBonaGroundTransportatioCarRental = findBygetTourismById(
				tourismApplicationId);

		return remove(tourismBonaGroundTransportatioCarRental);
	}

	/**
	 * Returns the number of tourism bona ground transportatio car rentals where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona ground transportatio car rentals
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMBONAGROUNDTRANSPORTATIOCARRENTAL_WHERE);

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
			"tourismBonaGroundTransportatioCarRental.tourismApplicationId = ?";

	public TourismBonaGroundTransportatioCarRentalPersistenceImpl() {
		setModelClass(TourismBonaGroundTransportatioCarRental.class);

		setModelImplClass(TourismBonaGroundTransportatioCarRentalImpl.class);
		setModelPKClass(long.class);

		setTable(TourismBonaGroundTransportatioCarRentalTable.INSTANCE);
	}

	/**
	 * Caches the tourism bona ground transportatio car rental in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransportatioCarRental the tourism bona ground transportatio car rental
	 */
	@Override
	public void cacheResult(
		TourismBonaGroundTransportatioCarRental
			tourismBonaGroundTransportatioCarRental) {

		entityCache.putResult(
			TourismBonaGroundTransportatioCarRentalImpl.class,
			tourismBonaGroundTransportatioCarRental.getPrimaryKey(),
			tourismBonaGroundTransportatioCarRental);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {
				tourismBonaGroundTransportatioCarRental.
					getTourismApplicationId()
			},
			tourismBonaGroundTransportatioCarRental);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism bona ground transportatio car rentals in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransportatioCarRentals the tourism bona ground transportatio car rentals
	 */
	@Override
	public void cacheResult(
		List<TourismBonaGroundTransportatioCarRental>
			tourismBonaGroundTransportatioCarRentals) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismBonaGroundTransportatioCarRentals.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismBonaGroundTransportatioCarRental
				tourismBonaGroundTransportatioCarRental :
					tourismBonaGroundTransportatioCarRentals) {

			if (entityCache.getResult(
					TourismBonaGroundTransportatioCarRentalImpl.class,
					tourismBonaGroundTransportatioCarRental.getPrimaryKey()) ==
						null) {

				cacheResult(tourismBonaGroundTransportatioCarRental);
			}
		}
	}

	/**
	 * Clears the cache for all tourism bona ground transportatio car rentals.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(
			TourismBonaGroundTransportatioCarRentalImpl.class);

		finderCache.clearCache(
			TourismBonaGroundTransportatioCarRentalImpl.class);
	}

	/**
	 * Clears the cache for the tourism bona ground transportatio car rental.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismBonaGroundTransportatioCarRental
			tourismBonaGroundTransportatioCarRental) {

		entityCache.removeResult(
			TourismBonaGroundTransportatioCarRentalImpl.class,
			tourismBonaGroundTransportatioCarRental);
	}

	@Override
	public void clearCache(
		List<TourismBonaGroundTransportatioCarRental>
			tourismBonaGroundTransportatioCarRentals) {

		for (TourismBonaGroundTransportatioCarRental
				tourismBonaGroundTransportatioCarRental :
					tourismBonaGroundTransportatioCarRentals) {

			entityCache.removeResult(
				TourismBonaGroundTransportatioCarRentalImpl.class,
				tourismBonaGroundTransportatioCarRental);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(
			TourismBonaGroundTransportatioCarRentalImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismBonaGroundTransportatioCarRentalImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismBonaGroundTransportatioCarRentalModelImpl
			tourismBonaGroundTransportatioCarRentalModelImpl) {

		Object[] args = new Object[] {
			tourismBonaGroundTransportatioCarRentalModelImpl.
				getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismBonaGroundTransportatioCarRentalModelImpl);
	}

	/**
	 * Creates a new tourism bona ground transportatio car rental with the primary key. Does not add the tourism bona ground transportatio car rental to the database.
	 *
	 * @param tourismBonaGroundTransportCRId the primary key for the new tourism bona ground transportatio car rental
	 * @return the new tourism bona ground transportatio car rental
	 */
	@Override
	public TourismBonaGroundTransportatioCarRental create(
		long tourismBonaGroundTransportCRId) {

		TourismBonaGroundTransportatioCarRental
			tourismBonaGroundTransportatioCarRental =
				new TourismBonaGroundTransportatioCarRentalImpl();

		tourismBonaGroundTransportatioCarRental.setNew(true);
		tourismBonaGroundTransportatioCarRental.setPrimaryKey(
			tourismBonaGroundTransportCRId);

		tourismBonaGroundTransportatioCarRental.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismBonaGroundTransportatioCarRental;
	}

	/**
	 * Removes the tourism bona ground transportatio car rental with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaGroundTransportCRId the primary key of the tourism bona ground transportatio car rental
	 * @return the tourism bona ground transportatio car rental that was removed
	 * @throws NoSuchTourismBonaGroundTransportatioCarRentalException if a tourism bona ground transportatio car rental with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransportatioCarRental remove(
			long tourismBonaGroundTransportCRId)
		throws NoSuchTourismBonaGroundTransportatioCarRentalException {

		return remove((Serializable)tourismBonaGroundTransportCRId);
	}

	/**
	 * Removes the tourism bona ground transportatio car rental with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism bona ground transportatio car rental
	 * @return the tourism bona ground transportatio car rental that was removed
	 * @throws NoSuchTourismBonaGroundTransportatioCarRentalException if a tourism bona ground transportatio car rental with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransportatioCarRental remove(
			Serializable primaryKey)
		throws NoSuchTourismBonaGroundTransportatioCarRentalException {

		Session session = null;

		try {
			session = openSession();

			TourismBonaGroundTransportatioCarRental
				tourismBonaGroundTransportatioCarRental =
					(TourismBonaGroundTransportatioCarRental)session.get(
						TourismBonaGroundTransportatioCarRentalImpl.class,
						primaryKey);

			if (tourismBonaGroundTransportatioCarRental == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismBonaGroundTransportatioCarRentalException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismBonaGroundTransportatioCarRental);
		}
		catch (NoSuchTourismBonaGroundTransportatioCarRentalException
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
	protected TourismBonaGroundTransportatioCarRental removeImpl(
		TourismBonaGroundTransportatioCarRental
			tourismBonaGroundTransportatioCarRental) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismBonaGroundTransportatioCarRental)) {
				tourismBonaGroundTransportatioCarRental =
					(TourismBonaGroundTransportatioCarRental)session.get(
						TourismBonaGroundTransportatioCarRentalImpl.class,
						tourismBonaGroundTransportatioCarRental.
							getPrimaryKeyObj());
			}

			if (tourismBonaGroundTransportatioCarRental != null) {
				session.delete(tourismBonaGroundTransportatioCarRental);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismBonaGroundTransportatioCarRental != null) {
			clearCache(tourismBonaGroundTransportatioCarRental);
		}

		return tourismBonaGroundTransportatioCarRental;
	}

	@Override
	public TourismBonaGroundTransportatioCarRental updateImpl(
		TourismBonaGroundTransportatioCarRental
			tourismBonaGroundTransportatioCarRental) {

		boolean isNew = tourismBonaGroundTransportatioCarRental.isNew();

		if (!(tourismBonaGroundTransportatioCarRental instanceof
				TourismBonaGroundTransportatioCarRentalModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					tourismBonaGroundTransportatioCarRental.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismBonaGroundTransportatioCarRental);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismBonaGroundTransportatioCarRental proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismBonaGroundTransportatioCarRental implementation " +
					tourismBonaGroundTransportatioCarRental.getClass());
		}

		TourismBonaGroundTransportatioCarRentalModelImpl
			tourismBonaGroundTransportatioCarRentalModelImpl =
				(TourismBonaGroundTransportatioCarRentalModelImpl)
					tourismBonaGroundTransportatioCarRental;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(tourismBonaGroundTransportatioCarRental.getCreateDate() == null)) {

			if (serviceContext == null) {
				tourismBonaGroundTransportatioCarRental.setCreateDate(date);
			}
			else {
				tourismBonaGroundTransportatioCarRental.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismBonaGroundTransportatioCarRentalModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				tourismBonaGroundTransportatioCarRental.setModifiedDate(date);
			}
			else {
				tourismBonaGroundTransportatioCarRental.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismBonaGroundTransportatioCarRental);
			}
			else {
				tourismBonaGroundTransportatioCarRental =
					(TourismBonaGroundTransportatioCarRental)session.merge(
						tourismBonaGroundTransportatioCarRental);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismBonaGroundTransportatioCarRentalImpl.class,
			tourismBonaGroundTransportatioCarRentalModelImpl, false, true);

		cacheUniqueFindersCache(
			tourismBonaGroundTransportatioCarRentalModelImpl);

		if (isNew) {
			tourismBonaGroundTransportatioCarRental.setNew(false);
		}

		tourismBonaGroundTransportatioCarRental.resetOriginalValues();

		return tourismBonaGroundTransportatioCarRental;
	}

	/**
	 * Returns the tourism bona ground transportatio car rental with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism bona ground transportatio car rental
	 * @return the tourism bona ground transportatio car rental
	 * @throws NoSuchTourismBonaGroundTransportatioCarRentalException if a tourism bona ground transportatio car rental with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransportatioCarRental findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchTourismBonaGroundTransportatioCarRentalException {

		TourismBonaGroundTransportatioCarRental
			tourismBonaGroundTransportatioCarRental = fetchByPrimaryKey(
				primaryKey);

		if (tourismBonaGroundTransportatioCarRental == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismBonaGroundTransportatioCarRentalException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismBonaGroundTransportatioCarRental;
	}

	/**
	 * Returns the tourism bona ground transportatio car rental with the primary key or throws a <code>NoSuchTourismBonaGroundTransportatioCarRentalException</code> if it could not be found.
	 *
	 * @param tourismBonaGroundTransportCRId the primary key of the tourism bona ground transportatio car rental
	 * @return the tourism bona ground transportatio car rental
	 * @throws NoSuchTourismBonaGroundTransportatioCarRentalException if a tourism bona ground transportatio car rental with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransportatioCarRental findByPrimaryKey(
			long tourismBonaGroundTransportCRId)
		throws NoSuchTourismBonaGroundTransportatioCarRentalException {

		return findByPrimaryKey((Serializable)tourismBonaGroundTransportCRId);
	}

	/**
	 * Returns the tourism bona ground transportatio car rental with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaGroundTransportCRId the primary key of the tourism bona ground transportatio car rental
	 * @return the tourism bona ground transportatio car rental, or <code>null</code> if a tourism bona ground transportatio car rental with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransportatioCarRental fetchByPrimaryKey(
		long tourismBonaGroundTransportCRId) {

		return fetchByPrimaryKey((Serializable)tourismBonaGroundTransportCRId);
	}

	/**
	 * Returns all the tourism bona ground transportatio car rentals.
	 *
	 * @return the tourism bona ground transportatio car rentals
	 */
	@Override
	public List<TourismBonaGroundTransportatioCarRental> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism bona ground transportatio car rentals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportatioCarRentalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportatio car rentals
	 * @param end the upper bound of the range of tourism bona ground transportatio car rentals (not inclusive)
	 * @return the range of tourism bona ground transportatio car rentals
	 */
	@Override
	public List<TourismBonaGroundTransportatioCarRental> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground transportatio car rentals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportatioCarRentalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportatio car rentals
	 * @param end the upper bound of the range of tourism bona ground transportatio car rentals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona ground transportatio car rentals
	 */
	@Override
	public List<TourismBonaGroundTransportatioCarRental> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundTransportatioCarRental>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground transportatio car rentals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportatioCarRentalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportatio car rentals
	 * @param end the upper bound of the range of tourism bona ground transportatio car rentals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona ground transportatio car rentals
	 */
	@Override
	public List<TourismBonaGroundTransportatioCarRental> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundTransportatioCarRental>
			orderByComparator,
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

		List<TourismBonaGroundTransportatioCarRental> list = null;

		if (useFinderCache) {
			list =
				(List<TourismBonaGroundTransportatioCarRental>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMBONAGROUNDTRANSPORTATIOCARRENTAL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMBONAGROUNDTRANSPORTATIOCARRENTAL;

				sql = sql.concat(
					TourismBonaGroundTransportatioCarRentalModelImpl.
						ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<TourismBonaGroundTransportatioCarRental>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Removes all the tourism bona ground transportatio car rentals from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismBonaGroundTransportatioCarRental
				tourismBonaGroundTransportatioCarRental : findAll()) {

			remove(tourismBonaGroundTransportatioCarRental);
		}
	}

	/**
	 * Returns the number of tourism bona ground transportatio car rentals.
	 *
	 * @return the number of tourism bona ground transportatio car rentals
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
					_SQL_COUNT_TOURISMBONAGROUNDTRANSPORTATIOCARRENTAL);

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
		return "tourismBonaGroundTransportCRId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMBONAGROUNDTRANSPORTATIOCARRENTAL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismBonaGroundTransportatioCarRentalModelImpl.
			TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism bona ground transportatio car rental persistence.
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

		TourismBonaGroundTransportatioCarRentalUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismBonaGroundTransportatioCarRentalUtil.setPersistence(null);

		entityCache.removeCache(
			TourismBonaGroundTransportatioCarRentalImpl.class.getName());
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

	private static final String
		_SQL_SELECT_TOURISMBONAGROUNDTRANSPORTATIOCARRENTAL =
			"SELECT tourismBonaGroundTransportatioCarRental FROM TourismBonaGroundTransportatioCarRental tourismBonaGroundTransportatioCarRental";

	private static final String
		_SQL_SELECT_TOURISMBONAGROUNDTRANSPORTATIOCARRENTAL_WHERE =
			"SELECT tourismBonaGroundTransportatioCarRental FROM TourismBonaGroundTransportatioCarRental tourismBonaGroundTransportatioCarRental WHERE ";

	private static final String
		_SQL_COUNT_TOURISMBONAGROUNDTRANSPORTATIOCARRENTAL =
			"SELECT COUNT(tourismBonaGroundTransportatioCarRental) FROM TourismBonaGroundTransportatioCarRental tourismBonaGroundTransportatioCarRental";

	private static final String
		_SQL_COUNT_TOURISMBONAGROUNDTRANSPORTATIOCARRENTAL_WHERE =
			"SELECT COUNT(tourismBonaGroundTransportatioCarRental) FROM TourismBonaGroundTransportatioCarRental tourismBonaGroundTransportatioCarRental WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismBonaGroundTransportatioCarRental.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismBonaGroundTransportatioCarRental exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismBonaGroundTransportatioCarRental exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismBonaGroundTransportatioCarRentalPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}