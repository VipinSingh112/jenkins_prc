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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaGroundTransportationException;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransportation;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransportationTable;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransportationImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransportationModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundTransportationPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundTransportationUtil;
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
 * The persistence implementation for the tourism bona ground transportation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismBonaGroundTransportationPersistence.class)
public class TourismBonaGroundTransportationPersistenceImpl
	extends BasePersistenceImpl<TourismBonaGroundTransportation>
	implements TourismBonaGroundTransportationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismBonaGroundTransportationUtil</code> to access the tourism bona ground transportation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismBonaGroundTransportationImpl.class.getName();

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
	 * Returns the tourism bona ground transportation where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaGroundTransportationException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground transportation
	 * @throws NoSuchTourismBonaGroundTransportationException if a matching tourism bona ground transportation could not be found
	 */
	@Override
	public TourismBonaGroundTransportation findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundTransportationException {

		TourismBonaGroundTransportation tourismBonaGroundTransportation =
			fetchBygetTourismById(tourismApplicationId);

		if (tourismBonaGroundTransportation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismBonaGroundTransportationException(
				sb.toString());
		}

		return tourismBonaGroundTransportation;
	}

	/**
	 * Returns the tourism bona ground transportation where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground transportation, or <code>null</code> if a matching tourism bona ground transportation could not be found
	 */
	@Override
	public TourismBonaGroundTransportation fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism bona ground transportation where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona ground transportation, or <code>null</code> if a matching tourism bona ground transportation could not be found
	 */
	@Override
	public TourismBonaGroundTransportation fetchBygetTourismById(
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

		if (result instanceof TourismBonaGroundTransportation) {
			TourismBonaGroundTransportation tourismBonaGroundTransportation =
				(TourismBonaGroundTransportation)result;

			if (tourismApplicationId !=
					tourismBonaGroundTransportation.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMBONAGROUNDTRANSPORTATION_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismBonaGroundTransportation> list = query.list();

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
								"TourismBonaGroundTransportationPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismBonaGroundTransportation
						tourismBonaGroundTransportation = list.get(0);

					result = tourismBonaGroundTransportation;

					cacheResult(tourismBonaGroundTransportation);
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
			return (TourismBonaGroundTransportation)result;
		}
	}

	/**
	 * Removes the tourism bona ground transportation where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona ground transportation that was removed
	 */
	@Override
	public TourismBonaGroundTransportation removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundTransportationException {

		TourismBonaGroundTransportation tourismBonaGroundTransportation =
			findBygetTourismById(tourismApplicationId);

		return remove(tourismBonaGroundTransportation);
	}

	/**
	 * Returns the number of tourism bona ground transportations where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona ground transportations
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMBONAGROUNDTRANSPORTATION_WHERE);

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
			"tourismBonaGroundTransportation.tourismApplicationId = ?";

	public TourismBonaGroundTransportationPersistenceImpl() {
		setModelClass(TourismBonaGroundTransportation.class);

		setModelImplClass(TourismBonaGroundTransportationImpl.class);
		setModelPKClass(long.class);

		setTable(TourismBonaGroundTransportationTable.INSTANCE);
	}

	/**
	 * Caches the tourism bona ground transportation in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransportation the tourism bona ground transportation
	 */
	@Override
	public void cacheResult(
		TourismBonaGroundTransportation tourismBonaGroundTransportation) {

		entityCache.putResult(
			TourismBonaGroundTransportationImpl.class,
			tourismBonaGroundTransportation.getPrimaryKey(),
			tourismBonaGroundTransportation);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {
				tourismBonaGroundTransportation.getTourismApplicationId()
			},
			tourismBonaGroundTransportation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism bona ground transportations in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransportations the tourism bona ground transportations
	 */
	@Override
	public void cacheResult(
		List<TourismBonaGroundTransportation>
			tourismBonaGroundTransportations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismBonaGroundTransportations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismBonaGroundTransportation tourismBonaGroundTransportation :
				tourismBonaGroundTransportations) {

			if (entityCache.getResult(
					TourismBonaGroundTransportationImpl.class,
					tourismBonaGroundTransportation.getPrimaryKey()) == null) {

				cacheResult(tourismBonaGroundTransportation);
			}
		}
	}

	/**
	 * Clears the cache for all tourism bona ground transportations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismBonaGroundTransportationImpl.class);

		finderCache.clearCache(TourismBonaGroundTransportationImpl.class);
	}

	/**
	 * Clears the cache for the tourism bona ground transportation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismBonaGroundTransportation tourismBonaGroundTransportation) {

		entityCache.removeResult(
			TourismBonaGroundTransportationImpl.class,
			tourismBonaGroundTransportation);
	}

	@Override
	public void clearCache(
		List<TourismBonaGroundTransportation>
			tourismBonaGroundTransportations) {

		for (TourismBonaGroundTransportation tourismBonaGroundTransportation :
				tourismBonaGroundTransportations) {

			entityCache.removeResult(
				TourismBonaGroundTransportationImpl.class,
				tourismBonaGroundTransportation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismBonaGroundTransportationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismBonaGroundTransportationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismBonaGroundTransportationModelImpl
			tourismBonaGroundTransportationModelImpl) {

		Object[] args = new Object[] {
			tourismBonaGroundTransportationModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismBonaGroundTransportationModelImpl);
	}

	/**
	 * Creates a new tourism bona ground transportation with the primary key. Does not add the tourism bona ground transportation to the database.
	 *
	 * @param tourismBonaGroundTransportId the primary key for the new tourism bona ground transportation
	 * @return the new tourism bona ground transportation
	 */
	@Override
	public TourismBonaGroundTransportation create(
		long tourismBonaGroundTransportId) {

		TourismBonaGroundTransportation tourismBonaGroundTransportation =
			new TourismBonaGroundTransportationImpl();

		tourismBonaGroundTransportation.setNew(true);
		tourismBonaGroundTransportation.setPrimaryKey(
			tourismBonaGroundTransportId);

		tourismBonaGroundTransportation.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismBonaGroundTransportation;
	}

	/**
	 * Removes the tourism bona ground transportation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaGroundTransportId the primary key of the tourism bona ground transportation
	 * @return the tourism bona ground transportation that was removed
	 * @throws NoSuchTourismBonaGroundTransportationException if a tourism bona ground transportation with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransportation remove(
			long tourismBonaGroundTransportId)
		throws NoSuchTourismBonaGroundTransportationException {

		return remove((Serializable)tourismBonaGroundTransportId);
	}

	/**
	 * Removes the tourism bona ground transportation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism bona ground transportation
	 * @return the tourism bona ground transportation that was removed
	 * @throws NoSuchTourismBonaGroundTransportationException if a tourism bona ground transportation with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransportation remove(Serializable primaryKey)
		throws NoSuchTourismBonaGroundTransportationException {

		Session session = null;

		try {
			session = openSession();

			TourismBonaGroundTransportation tourismBonaGroundTransportation =
				(TourismBonaGroundTransportation)session.get(
					TourismBonaGroundTransportationImpl.class, primaryKey);

			if (tourismBonaGroundTransportation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismBonaGroundTransportationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismBonaGroundTransportation);
		}
		catch (NoSuchTourismBonaGroundTransportationException
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
	protected TourismBonaGroundTransportation removeImpl(
		TourismBonaGroundTransportation tourismBonaGroundTransportation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismBonaGroundTransportation)) {
				tourismBonaGroundTransportation =
					(TourismBonaGroundTransportation)session.get(
						TourismBonaGroundTransportationImpl.class,
						tourismBonaGroundTransportation.getPrimaryKeyObj());
			}

			if (tourismBonaGroundTransportation != null) {
				session.delete(tourismBonaGroundTransportation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismBonaGroundTransportation != null) {
			clearCache(tourismBonaGroundTransportation);
		}

		return tourismBonaGroundTransportation;
	}

	@Override
	public TourismBonaGroundTransportation updateImpl(
		TourismBonaGroundTransportation tourismBonaGroundTransportation) {

		boolean isNew = tourismBonaGroundTransportation.isNew();

		if (!(tourismBonaGroundTransportation instanceof
				TourismBonaGroundTransportationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					tourismBonaGroundTransportation.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismBonaGroundTransportation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismBonaGroundTransportation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismBonaGroundTransportation implementation " +
					tourismBonaGroundTransportation.getClass());
		}

		TourismBonaGroundTransportationModelImpl
			tourismBonaGroundTransportationModelImpl =
				(TourismBonaGroundTransportationModelImpl)
					tourismBonaGroundTransportation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(tourismBonaGroundTransportation.getCreateDate() == null)) {

			if (serviceContext == null) {
				tourismBonaGroundTransportation.setCreateDate(date);
			}
			else {
				tourismBonaGroundTransportation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismBonaGroundTransportationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismBonaGroundTransportation.setModifiedDate(date);
			}
			else {
				tourismBonaGroundTransportation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismBonaGroundTransportation);
			}
			else {
				tourismBonaGroundTransportation =
					(TourismBonaGroundTransportation)session.merge(
						tourismBonaGroundTransportation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismBonaGroundTransportationImpl.class,
			tourismBonaGroundTransportationModelImpl, false, true);

		cacheUniqueFindersCache(tourismBonaGroundTransportationModelImpl);

		if (isNew) {
			tourismBonaGroundTransportation.setNew(false);
		}

		tourismBonaGroundTransportation.resetOriginalValues();

		return tourismBonaGroundTransportation;
	}

	/**
	 * Returns the tourism bona ground transportation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism bona ground transportation
	 * @return the tourism bona ground transportation
	 * @throws NoSuchTourismBonaGroundTransportationException if a tourism bona ground transportation with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransportation findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchTourismBonaGroundTransportationException {

		TourismBonaGroundTransportation tourismBonaGroundTransportation =
			fetchByPrimaryKey(primaryKey);

		if (tourismBonaGroundTransportation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismBonaGroundTransportationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismBonaGroundTransportation;
	}

	/**
	 * Returns the tourism bona ground transportation with the primary key or throws a <code>NoSuchTourismBonaGroundTransportationException</code> if it could not be found.
	 *
	 * @param tourismBonaGroundTransportId the primary key of the tourism bona ground transportation
	 * @return the tourism bona ground transportation
	 * @throws NoSuchTourismBonaGroundTransportationException if a tourism bona ground transportation with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransportation findByPrimaryKey(
			long tourismBonaGroundTransportId)
		throws NoSuchTourismBonaGroundTransportationException {

		return findByPrimaryKey((Serializable)tourismBonaGroundTransportId);
	}

	/**
	 * Returns the tourism bona ground transportation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaGroundTransportId the primary key of the tourism bona ground transportation
	 * @return the tourism bona ground transportation, or <code>null</code> if a tourism bona ground transportation with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransportation fetchByPrimaryKey(
		long tourismBonaGroundTransportId) {

		return fetchByPrimaryKey((Serializable)tourismBonaGroundTransportId);
	}

	/**
	 * Returns all the tourism bona ground transportations.
	 *
	 * @return the tourism bona ground transportations
	 */
	@Override
	public List<TourismBonaGroundTransportation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism bona ground transportations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportations
	 * @param end the upper bound of the range of tourism bona ground transportations (not inclusive)
	 * @return the range of tourism bona ground transportations
	 */
	@Override
	public List<TourismBonaGroundTransportation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground transportations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportations
	 * @param end the upper bound of the range of tourism bona ground transportations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona ground transportations
	 */
	@Override
	public List<TourismBonaGroundTransportation> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundTransportation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground transportations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportations
	 * @param end the upper bound of the range of tourism bona ground transportations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona ground transportations
	 */
	@Override
	public List<TourismBonaGroundTransportation> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundTransportation> orderByComparator,
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

		List<TourismBonaGroundTransportation> list = null;

		if (useFinderCache) {
			list = (List<TourismBonaGroundTransportation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMBONAGROUNDTRANSPORTATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMBONAGROUNDTRANSPORTATION;

				sql = sql.concat(
					TourismBonaGroundTransportationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismBonaGroundTransportation>)QueryUtil.list(
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
	 * Removes all the tourism bona ground transportations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismBonaGroundTransportation tourismBonaGroundTransportation :
				findAll()) {

			remove(tourismBonaGroundTransportation);
		}
	}

	/**
	 * Returns the number of tourism bona ground transportations.
	 *
	 * @return the number of tourism bona ground transportations
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
					_SQL_COUNT_TOURISMBONAGROUNDTRANSPORTATION);

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
		return "tourismBonaGroundTransportId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMBONAGROUNDTRANSPORTATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismBonaGroundTransportationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism bona ground transportation persistence.
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

		TourismBonaGroundTransportationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismBonaGroundTransportationUtil.setPersistence(null);

		entityCache.removeCache(
			TourismBonaGroundTransportationImpl.class.getName());
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

	private static final String _SQL_SELECT_TOURISMBONAGROUNDTRANSPORTATION =
		"SELECT tourismBonaGroundTransportation FROM TourismBonaGroundTransportation tourismBonaGroundTransportation";

	private static final String
		_SQL_SELECT_TOURISMBONAGROUNDTRANSPORTATION_WHERE =
			"SELECT tourismBonaGroundTransportation FROM TourismBonaGroundTransportation tourismBonaGroundTransportation WHERE ";

	private static final String _SQL_COUNT_TOURISMBONAGROUNDTRANSPORTATION =
		"SELECT COUNT(tourismBonaGroundTransportation) FROM TourismBonaGroundTransportation tourismBonaGroundTransportation";

	private static final String
		_SQL_COUNT_TOURISMBONAGROUNDTRANSPORTATION_WHERE =
			"SELECT COUNT(tourismBonaGroundTransportation) FROM TourismBonaGroundTransportation tourismBonaGroundTransportation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismBonaGroundTransportation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismBonaGroundTransportation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismBonaGroundTransportation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismBonaGroundTransportationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}