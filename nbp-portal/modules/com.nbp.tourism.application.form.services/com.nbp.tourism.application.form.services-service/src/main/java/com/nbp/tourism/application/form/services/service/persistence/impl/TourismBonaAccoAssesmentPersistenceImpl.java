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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaAccoAssesmentException;
import com.nbp.tourism.application.form.services.model.TourismBonaAccoAssesment;
import com.nbp.tourism.application.form.services.model.TourismBonaAccoAssesmentTable;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaAccoAssesmentImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaAccoAssesmentModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAccoAssesmentPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAccoAssesmentUtil;
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
 * The persistence implementation for the tourism bona acco assesment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismBonaAccoAssesmentPersistence.class)
public class TourismBonaAccoAssesmentPersistenceImpl
	extends BasePersistenceImpl<TourismBonaAccoAssesment>
	implements TourismBonaAccoAssesmentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismBonaAccoAssesmentUtil</code> to access the tourism bona acco assesment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismBonaAccoAssesmentImpl.class.getName();

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
	 * Returns the tourism bona acco assesment where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAccoAssesmentException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona acco assesment
	 * @throws NoSuchTourismBonaAccoAssesmentException if a matching tourism bona acco assesment could not be found
	 */
	@Override
	public TourismBonaAccoAssesment findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAccoAssesmentException {

		TourismBonaAccoAssesment tourismBonaAccoAssesment =
			fetchBygetTourismById(tourismApplicationId);

		if (tourismBonaAccoAssesment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismBonaAccoAssesmentException(sb.toString());
		}

		return tourismBonaAccoAssesment;
	}

	/**
	 * Returns the tourism bona acco assesment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona acco assesment, or <code>null</code> if a matching tourism bona acco assesment could not be found
	 */
	@Override
	public TourismBonaAccoAssesment fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism bona acco assesment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona acco assesment, or <code>null</code> if a matching tourism bona acco assesment could not be found
	 */
	@Override
	public TourismBonaAccoAssesment fetchBygetTourismById(
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

		if (result instanceof TourismBonaAccoAssesment) {
			TourismBonaAccoAssesment tourismBonaAccoAssesment =
				(TourismBonaAccoAssesment)result;

			if (tourismApplicationId !=
					tourismBonaAccoAssesment.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMBONAACCOASSESMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismBonaAccoAssesment> list = query.list();

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
								"TourismBonaAccoAssesmentPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismBonaAccoAssesment tourismBonaAccoAssesment =
						list.get(0);

					result = tourismBonaAccoAssesment;

					cacheResult(tourismBonaAccoAssesment);
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
			return (TourismBonaAccoAssesment)result;
		}
	}

	/**
	 * Removes the tourism bona acco assesment where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona acco assesment that was removed
	 */
	@Override
	public TourismBonaAccoAssesment removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAccoAssesmentException {

		TourismBonaAccoAssesment tourismBonaAccoAssesment =
			findBygetTourismById(tourismApplicationId);

		return remove(tourismBonaAccoAssesment);
	}

	/**
	 * Returns the number of tourism bona acco assesments where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona acco assesments
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMBONAACCOASSESMENT_WHERE);

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
			"tourismBonaAccoAssesment.tourismApplicationId = ?";

	public TourismBonaAccoAssesmentPersistenceImpl() {
		setModelClass(TourismBonaAccoAssesment.class);

		setModelImplClass(TourismBonaAccoAssesmentImpl.class);
		setModelPKClass(long.class);

		setTable(TourismBonaAccoAssesmentTable.INSTANCE);
	}

	/**
	 * Caches the tourism bona acco assesment in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccoAssesment the tourism bona acco assesment
	 */
	@Override
	public void cacheResult(TourismBonaAccoAssesment tourismBonaAccoAssesment) {
		entityCache.putResult(
			TourismBonaAccoAssesmentImpl.class,
			tourismBonaAccoAssesment.getPrimaryKey(), tourismBonaAccoAssesment);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {tourismBonaAccoAssesment.getTourismApplicationId()},
			tourismBonaAccoAssesment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism bona acco assesments in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccoAssesments the tourism bona acco assesments
	 */
	@Override
	public void cacheResult(
		List<TourismBonaAccoAssesment> tourismBonaAccoAssesments) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismBonaAccoAssesments.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismBonaAccoAssesment tourismBonaAccoAssesment :
				tourismBonaAccoAssesments) {

			if (entityCache.getResult(
					TourismBonaAccoAssesmentImpl.class,
					tourismBonaAccoAssesment.getPrimaryKey()) == null) {

				cacheResult(tourismBonaAccoAssesment);
			}
		}
	}

	/**
	 * Clears the cache for all tourism bona acco assesments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismBonaAccoAssesmentImpl.class);

		finderCache.clearCache(TourismBonaAccoAssesmentImpl.class);
	}

	/**
	 * Clears the cache for the tourism bona acco assesment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TourismBonaAccoAssesment tourismBonaAccoAssesment) {
		entityCache.removeResult(
			TourismBonaAccoAssesmentImpl.class, tourismBonaAccoAssesment);
	}

	@Override
	public void clearCache(
		List<TourismBonaAccoAssesment> tourismBonaAccoAssesments) {

		for (TourismBonaAccoAssesment tourismBonaAccoAssesment :
				tourismBonaAccoAssesments) {

			entityCache.removeResult(
				TourismBonaAccoAssesmentImpl.class, tourismBonaAccoAssesment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismBonaAccoAssesmentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismBonaAccoAssesmentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismBonaAccoAssesmentModelImpl tourismBonaAccoAssesmentModelImpl) {

		Object[] args = new Object[] {
			tourismBonaAccoAssesmentModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismBonaAccoAssesmentModelImpl);
	}

	/**
	 * Creates a new tourism bona acco assesment with the primary key. Does not add the tourism bona acco assesment to the database.
	 *
	 * @param tourismBonaAccoAssesmentId the primary key for the new tourism bona acco assesment
	 * @return the new tourism bona acco assesment
	 */
	@Override
	public TourismBonaAccoAssesment create(long tourismBonaAccoAssesmentId) {
		TourismBonaAccoAssesment tourismBonaAccoAssesment =
			new TourismBonaAccoAssesmentImpl();

		tourismBonaAccoAssesment.setNew(true);
		tourismBonaAccoAssesment.setPrimaryKey(tourismBonaAccoAssesmentId);

		tourismBonaAccoAssesment.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismBonaAccoAssesment;
	}

	/**
	 * Removes the tourism bona acco assesment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaAccoAssesmentId the primary key of the tourism bona acco assesment
	 * @return the tourism bona acco assesment that was removed
	 * @throws NoSuchTourismBonaAccoAssesmentException if a tourism bona acco assesment with the primary key could not be found
	 */
	@Override
	public TourismBonaAccoAssesment remove(long tourismBonaAccoAssesmentId)
		throws NoSuchTourismBonaAccoAssesmentException {

		return remove((Serializable)tourismBonaAccoAssesmentId);
	}

	/**
	 * Removes the tourism bona acco assesment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism bona acco assesment
	 * @return the tourism bona acco assesment that was removed
	 * @throws NoSuchTourismBonaAccoAssesmentException if a tourism bona acco assesment with the primary key could not be found
	 */
	@Override
	public TourismBonaAccoAssesment remove(Serializable primaryKey)
		throws NoSuchTourismBonaAccoAssesmentException {

		Session session = null;

		try {
			session = openSession();

			TourismBonaAccoAssesment tourismBonaAccoAssesment =
				(TourismBonaAccoAssesment)session.get(
					TourismBonaAccoAssesmentImpl.class, primaryKey);

			if (tourismBonaAccoAssesment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismBonaAccoAssesmentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismBonaAccoAssesment);
		}
		catch (NoSuchTourismBonaAccoAssesmentException noSuchEntityException) {
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
	protected TourismBonaAccoAssesment removeImpl(
		TourismBonaAccoAssesment tourismBonaAccoAssesment) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismBonaAccoAssesment)) {
				tourismBonaAccoAssesment =
					(TourismBonaAccoAssesment)session.get(
						TourismBonaAccoAssesmentImpl.class,
						tourismBonaAccoAssesment.getPrimaryKeyObj());
			}

			if (tourismBonaAccoAssesment != null) {
				session.delete(tourismBonaAccoAssesment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismBonaAccoAssesment != null) {
			clearCache(tourismBonaAccoAssesment);
		}

		return tourismBonaAccoAssesment;
	}

	@Override
	public TourismBonaAccoAssesment updateImpl(
		TourismBonaAccoAssesment tourismBonaAccoAssesment) {

		boolean isNew = tourismBonaAccoAssesment.isNew();

		if (!(tourismBonaAccoAssesment instanceof
				TourismBonaAccoAssesmentModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tourismBonaAccoAssesment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismBonaAccoAssesment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismBonaAccoAssesment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismBonaAccoAssesment implementation " +
					tourismBonaAccoAssesment.getClass());
		}

		TourismBonaAccoAssesmentModelImpl tourismBonaAccoAssesmentModelImpl =
			(TourismBonaAccoAssesmentModelImpl)tourismBonaAccoAssesment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismBonaAccoAssesment.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismBonaAccoAssesment.setCreateDate(date);
			}
			else {
				tourismBonaAccoAssesment.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismBonaAccoAssesmentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismBonaAccoAssesment.setModifiedDate(date);
			}
			else {
				tourismBonaAccoAssesment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismBonaAccoAssesment);
			}
			else {
				tourismBonaAccoAssesment =
					(TourismBonaAccoAssesment)session.merge(
						tourismBonaAccoAssesment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismBonaAccoAssesmentImpl.class,
			tourismBonaAccoAssesmentModelImpl, false, true);

		cacheUniqueFindersCache(tourismBonaAccoAssesmentModelImpl);

		if (isNew) {
			tourismBonaAccoAssesment.setNew(false);
		}

		tourismBonaAccoAssesment.resetOriginalValues();

		return tourismBonaAccoAssesment;
	}

	/**
	 * Returns the tourism bona acco assesment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism bona acco assesment
	 * @return the tourism bona acco assesment
	 * @throws NoSuchTourismBonaAccoAssesmentException if a tourism bona acco assesment with the primary key could not be found
	 */
	@Override
	public TourismBonaAccoAssesment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTourismBonaAccoAssesmentException {

		TourismBonaAccoAssesment tourismBonaAccoAssesment = fetchByPrimaryKey(
			primaryKey);

		if (tourismBonaAccoAssesment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismBonaAccoAssesmentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismBonaAccoAssesment;
	}

	/**
	 * Returns the tourism bona acco assesment with the primary key or throws a <code>NoSuchTourismBonaAccoAssesmentException</code> if it could not be found.
	 *
	 * @param tourismBonaAccoAssesmentId the primary key of the tourism bona acco assesment
	 * @return the tourism bona acco assesment
	 * @throws NoSuchTourismBonaAccoAssesmentException if a tourism bona acco assesment with the primary key could not be found
	 */
	@Override
	public TourismBonaAccoAssesment findByPrimaryKey(
			long tourismBonaAccoAssesmentId)
		throws NoSuchTourismBonaAccoAssesmentException {

		return findByPrimaryKey((Serializable)tourismBonaAccoAssesmentId);
	}

	/**
	 * Returns the tourism bona acco assesment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaAccoAssesmentId the primary key of the tourism bona acco assesment
	 * @return the tourism bona acco assesment, or <code>null</code> if a tourism bona acco assesment with the primary key could not be found
	 */
	@Override
	public TourismBonaAccoAssesment fetchByPrimaryKey(
		long tourismBonaAccoAssesmentId) {

		return fetchByPrimaryKey((Serializable)tourismBonaAccoAssesmentId);
	}

	/**
	 * Returns all the tourism bona acco assesments.
	 *
	 * @return the tourism bona acco assesments
	 */
	@Override
	public List<TourismBonaAccoAssesment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism bona acco assesments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccoAssesmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco assesments
	 * @param end the upper bound of the range of tourism bona acco assesments (not inclusive)
	 * @return the range of tourism bona acco assesments
	 */
	@Override
	public List<TourismBonaAccoAssesment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism bona acco assesments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccoAssesmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco assesments
	 * @param end the upper bound of the range of tourism bona acco assesments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona acco assesments
	 */
	@Override
	public List<TourismBonaAccoAssesment> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAccoAssesment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism bona acco assesments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccoAssesmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco assesments
	 * @param end the upper bound of the range of tourism bona acco assesments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona acco assesments
	 */
	@Override
	public List<TourismBonaAccoAssesment> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAccoAssesment> orderByComparator,
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

		List<TourismBonaAccoAssesment> list = null;

		if (useFinderCache) {
			list = (List<TourismBonaAccoAssesment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMBONAACCOASSESMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMBONAACCOASSESMENT;

				sql = sql.concat(
					TourismBonaAccoAssesmentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismBonaAccoAssesment>)QueryUtil.list(
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
	 * Removes all the tourism bona acco assesments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismBonaAccoAssesment tourismBonaAccoAssesment : findAll()) {
			remove(tourismBonaAccoAssesment);
		}
	}

	/**
	 * Returns the number of tourism bona acco assesments.
	 *
	 * @return the number of tourism bona acco assesments
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
					_SQL_COUNT_TOURISMBONAACCOASSESMENT);

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
		return "tourismBonaAccoAssesmentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMBONAACCOASSESMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismBonaAccoAssesmentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism bona acco assesment persistence.
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

		TourismBonaAccoAssesmentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismBonaAccoAssesmentUtil.setPersistence(null);

		entityCache.removeCache(TourismBonaAccoAssesmentImpl.class.getName());
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

	private static final String _SQL_SELECT_TOURISMBONAACCOASSESMENT =
		"SELECT tourismBonaAccoAssesment FROM TourismBonaAccoAssesment tourismBonaAccoAssesment";

	private static final String _SQL_SELECT_TOURISMBONAACCOASSESMENT_WHERE =
		"SELECT tourismBonaAccoAssesment FROM TourismBonaAccoAssesment tourismBonaAccoAssesment WHERE ";

	private static final String _SQL_COUNT_TOURISMBONAACCOASSESMENT =
		"SELECT COUNT(tourismBonaAccoAssesment) FROM TourismBonaAccoAssesment tourismBonaAccoAssesment";

	private static final String _SQL_COUNT_TOURISMBONAACCOASSESMENT_WHERE =
		"SELECT COUNT(tourismBonaAccoAssesment) FROM TourismBonaAccoAssesment tourismBonaAccoAssesment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismBonaAccoAssesment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismBonaAccoAssesment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismBonaAccoAssesment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismBonaAccoAssesmentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}