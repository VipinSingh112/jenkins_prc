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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAccoAssesmentException;
import com.nbp.tourism.application.form.services.model.TourismNewAccoAssesment;
import com.nbp.tourism.application.form.services.model.TourismNewAccoAssesmentTable;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAccoAssesmentImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAccoAssesmentModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAccoAssesmentPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAccoAssesmentUtil;
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
 * The persistence implementation for the tourism new acco assesment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismNewAccoAssesmentPersistence.class)
public class TourismNewAccoAssesmentPersistenceImpl
	extends BasePersistenceImpl<TourismNewAccoAssesment>
	implements TourismNewAccoAssesmentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismNewAccoAssesmentUtil</code> to access the tourism new acco assesment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismNewAccoAssesmentImpl.class.getName();

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
	 * Returns the tourism new acco assesment where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAccoAssesmentException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new acco assesment
	 * @throws NoSuchTourismNewAccoAssesmentException if a matching tourism new acco assesment could not be found
	 */
	@Override
	public TourismNewAccoAssesment findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccoAssesmentException {

		TourismNewAccoAssesment tourismNewAccoAssesment = fetchBygetTourismById(
			tourismApplicationId);

		if (tourismNewAccoAssesment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismNewAccoAssesmentException(sb.toString());
		}

		return tourismNewAccoAssesment;
	}

	/**
	 * Returns the tourism new acco assesment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new acco assesment, or <code>null</code> if a matching tourism new acco assesment could not be found
	 */
	@Override
	public TourismNewAccoAssesment fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism new acco assesment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new acco assesment, or <code>null</code> if a matching tourism new acco assesment could not be found
	 */
	@Override
	public TourismNewAccoAssesment fetchBygetTourismById(
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

		if (result instanceof TourismNewAccoAssesment) {
			TourismNewAccoAssesment tourismNewAccoAssesment =
				(TourismNewAccoAssesment)result;

			if (tourismApplicationId !=
					tourismNewAccoAssesment.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMNEWACCOASSESMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismNewAccoAssesment> list = query.list();

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
								"TourismNewAccoAssesmentPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismNewAccoAssesment tourismNewAccoAssesment = list.get(
						0);

					result = tourismNewAccoAssesment;

					cacheResult(tourismNewAccoAssesment);
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
			return (TourismNewAccoAssesment)result;
		}
	}

	/**
	 * Removes the tourism new acco assesment where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new acco assesment that was removed
	 */
	@Override
	public TourismNewAccoAssesment removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccoAssesmentException {

		TourismNewAccoAssesment tourismNewAccoAssesment = findBygetTourismById(
			tourismApplicationId);

		return remove(tourismNewAccoAssesment);
	}

	/**
	 * Returns the number of tourism new acco assesments where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new acco assesments
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMNEWACCOASSESMENT_WHERE);

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
			"tourismNewAccoAssesment.tourismApplicationId = ?";

	public TourismNewAccoAssesmentPersistenceImpl() {
		setModelClass(TourismNewAccoAssesment.class);

		setModelImplClass(TourismNewAccoAssesmentImpl.class);
		setModelPKClass(long.class);

		setTable(TourismNewAccoAssesmentTable.INSTANCE);
	}

	/**
	 * Caches the tourism new acco assesment in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccoAssesment the tourism new acco assesment
	 */
	@Override
	public void cacheResult(TourismNewAccoAssesment tourismNewAccoAssesment) {
		entityCache.putResult(
			TourismNewAccoAssesmentImpl.class,
			tourismNewAccoAssesment.getPrimaryKey(), tourismNewAccoAssesment);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {tourismNewAccoAssesment.getTourismApplicationId()},
			tourismNewAccoAssesment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism new acco assesments in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccoAssesments the tourism new acco assesments
	 */
	@Override
	public void cacheResult(
		List<TourismNewAccoAssesment> tourismNewAccoAssesments) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismNewAccoAssesments.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismNewAccoAssesment tourismNewAccoAssesment :
				tourismNewAccoAssesments) {

			if (entityCache.getResult(
					TourismNewAccoAssesmentImpl.class,
					tourismNewAccoAssesment.getPrimaryKey()) == null) {

				cacheResult(tourismNewAccoAssesment);
			}
		}
	}

	/**
	 * Clears the cache for all tourism new acco assesments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismNewAccoAssesmentImpl.class);

		finderCache.clearCache(TourismNewAccoAssesmentImpl.class);
	}

	/**
	 * Clears the cache for the tourism new acco assesment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TourismNewAccoAssesment tourismNewAccoAssesment) {
		entityCache.removeResult(
			TourismNewAccoAssesmentImpl.class, tourismNewAccoAssesment);
	}

	@Override
	public void clearCache(
		List<TourismNewAccoAssesment> tourismNewAccoAssesments) {

		for (TourismNewAccoAssesment tourismNewAccoAssesment :
				tourismNewAccoAssesments) {

			entityCache.removeResult(
				TourismNewAccoAssesmentImpl.class, tourismNewAccoAssesment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismNewAccoAssesmentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismNewAccoAssesmentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismNewAccoAssesmentModelImpl tourismNewAccoAssesmentModelImpl) {

		Object[] args = new Object[] {
			tourismNewAccoAssesmentModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismNewAccoAssesmentModelImpl);
	}

	/**
	 * Creates a new tourism new acco assesment with the primary key. Does not add the tourism new acco assesment to the database.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key for the new tourism new acco assesment
	 * @return the new tourism new acco assesment
	 */
	@Override
	public TourismNewAccoAssesment create(long TourismNewAccoAssesmentInfoId) {
		TourismNewAccoAssesment tourismNewAccoAssesment =
			new TourismNewAccoAssesmentImpl();

		tourismNewAccoAssesment.setNew(true);
		tourismNewAccoAssesment.setPrimaryKey(TourismNewAccoAssesmentInfoId);

		tourismNewAccoAssesment.setCompanyId(CompanyThreadLocal.getCompanyId());

		return tourismNewAccoAssesment;
	}

	/**
	 * Removes the tourism new acco assesment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key of the tourism new acco assesment
	 * @return the tourism new acco assesment that was removed
	 * @throws NoSuchTourismNewAccoAssesmentException if a tourism new acco assesment with the primary key could not be found
	 */
	@Override
	public TourismNewAccoAssesment remove(long TourismNewAccoAssesmentInfoId)
		throws NoSuchTourismNewAccoAssesmentException {

		return remove((Serializable)TourismNewAccoAssesmentInfoId);
	}

	/**
	 * Removes the tourism new acco assesment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism new acco assesment
	 * @return the tourism new acco assesment that was removed
	 * @throws NoSuchTourismNewAccoAssesmentException if a tourism new acco assesment with the primary key could not be found
	 */
	@Override
	public TourismNewAccoAssesment remove(Serializable primaryKey)
		throws NoSuchTourismNewAccoAssesmentException {

		Session session = null;

		try {
			session = openSession();

			TourismNewAccoAssesment tourismNewAccoAssesment =
				(TourismNewAccoAssesment)session.get(
					TourismNewAccoAssesmentImpl.class, primaryKey);

			if (tourismNewAccoAssesment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismNewAccoAssesmentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismNewAccoAssesment);
		}
		catch (NoSuchTourismNewAccoAssesmentException noSuchEntityException) {
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
	protected TourismNewAccoAssesment removeImpl(
		TourismNewAccoAssesment tourismNewAccoAssesment) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismNewAccoAssesment)) {
				tourismNewAccoAssesment = (TourismNewAccoAssesment)session.get(
					TourismNewAccoAssesmentImpl.class,
					tourismNewAccoAssesment.getPrimaryKeyObj());
			}

			if (tourismNewAccoAssesment != null) {
				session.delete(tourismNewAccoAssesment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismNewAccoAssesment != null) {
			clearCache(tourismNewAccoAssesment);
		}

		return tourismNewAccoAssesment;
	}

	@Override
	public TourismNewAccoAssesment updateImpl(
		TourismNewAccoAssesment tourismNewAccoAssesment) {

		boolean isNew = tourismNewAccoAssesment.isNew();

		if (!(tourismNewAccoAssesment instanceof
				TourismNewAccoAssesmentModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tourismNewAccoAssesment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismNewAccoAssesment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismNewAccoAssesment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismNewAccoAssesment implementation " +
					tourismNewAccoAssesment.getClass());
		}

		TourismNewAccoAssesmentModelImpl tourismNewAccoAssesmentModelImpl =
			(TourismNewAccoAssesmentModelImpl)tourismNewAccoAssesment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismNewAccoAssesment.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismNewAccoAssesment.setCreateDate(date);
			}
			else {
				tourismNewAccoAssesment.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismNewAccoAssesmentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismNewAccoAssesment.setModifiedDate(date);
			}
			else {
				tourismNewAccoAssesment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismNewAccoAssesment);
			}
			else {
				tourismNewAccoAssesment =
					(TourismNewAccoAssesment)session.merge(
						tourismNewAccoAssesment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismNewAccoAssesmentImpl.class, tourismNewAccoAssesmentModelImpl,
			false, true);

		cacheUniqueFindersCache(tourismNewAccoAssesmentModelImpl);

		if (isNew) {
			tourismNewAccoAssesment.setNew(false);
		}

		tourismNewAccoAssesment.resetOriginalValues();

		return tourismNewAccoAssesment;
	}

	/**
	 * Returns the tourism new acco assesment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism new acco assesment
	 * @return the tourism new acco assesment
	 * @throws NoSuchTourismNewAccoAssesmentException if a tourism new acco assesment with the primary key could not be found
	 */
	@Override
	public TourismNewAccoAssesment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTourismNewAccoAssesmentException {

		TourismNewAccoAssesment tourismNewAccoAssesment = fetchByPrimaryKey(
			primaryKey);

		if (tourismNewAccoAssesment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismNewAccoAssesmentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismNewAccoAssesment;
	}

	/**
	 * Returns the tourism new acco assesment with the primary key or throws a <code>NoSuchTourismNewAccoAssesmentException</code> if it could not be found.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key of the tourism new acco assesment
	 * @return the tourism new acco assesment
	 * @throws NoSuchTourismNewAccoAssesmentException if a tourism new acco assesment with the primary key could not be found
	 */
	@Override
	public TourismNewAccoAssesment findByPrimaryKey(
			long TourismNewAccoAssesmentInfoId)
		throws NoSuchTourismNewAccoAssesmentException {

		return findByPrimaryKey((Serializable)TourismNewAccoAssesmentInfoId);
	}

	/**
	 * Returns the tourism new acco assesment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key of the tourism new acco assesment
	 * @return the tourism new acco assesment, or <code>null</code> if a tourism new acco assesment with the primary key could not be found
	 */
	@Override
	public TourismNewAccoAssesment fetchByPrimaryKey(
		long TourismNewAccoAssesmentInfoId) {

		return fetchByPrimaryKey((Serializable)TourismNewAccoAssesmentInfoId);
	}

	/**
	 * Returns all the tourism new acco assesments.
	 *
	 * @return the tourism new acco assesments
	 */
	@Override
	public List<TourismNewAccoAssesment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism new acco assesments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoAssesmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco assesments
	 * @param end the upper bound of the range of tourism new acco assesments (not inclusive)
	 * @return the range of tourism new acco assesments
	 */
	@Override
	public List<TourismNewAccoAssesment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism new acco assesments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoAssesmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco assesments
	 * @param end the upper bound of the range of tourism new acco assesments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new acco assesments
	 */
	@Override
	public List<TourismNewAccoAssesment> findAll(
		int start, int end,
		OrderByComparator<TourismNewAccoAssesment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism new acco assesments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoAssesmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco assesments
	 * @param end the upper bound of the range of tourism new acco assesments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new acco assesments
	 */
	@Override
	public List<TourismNewAccoAssesment> findAll(
		int start, int end,
		OrderByComparator<TourismNewAccoAssesment> orderByComparator,
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

		List<TourismNewAccoAssesment> list = null;

		if (useFinderCache) {
			list = (List<TourismNewAccoAssesment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMNEWACCOASSESMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMNEWACCOASSESMENT;

				sql = sql.concat(
					TourismNewAccoAssesmentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismNewAccoAssesment>)QueryUtil.list(
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
	 * Removes all the tourism new acco assesments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismNewAccoAssesment tourismNewAccoAssesment : findAll()) {
			remove(tourismNewAccoAssesment);
		}
	}

	/**
	 * Returns the number of tourism new acco assesments.
	 *
	 * @return the number of tourism new acco assesments
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
					_SQL_COUNT_TOURISMNEWACCOASSESMENT);

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
		return "TourismNewAccoAssesmentInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMNEWACCOASSESMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismNewAccoAssesmentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism new acco assesment persistence.
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

		TourismNewAccoAssesmentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismNewAccoAssesmentUtil.setPersistence(null);

		entityCache.removeCache(TourismNewAccoAssesmentImpl.class.getName());
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

	private static final String _SQL_SELECT_TOURISMNEWACCOASSESMENT =
		"SELECT tourismNewAccoAssesment FROM TourismNewAccoAssesment tourismNewAccoAssesment";

	private static final String _SQL_SELECT_TOURISMNEWACCOASSESMENT_WHERE =
		"SELECT tourismNewAccoAssesment FROM TourismNewAccoAssesment tourismNewAccoAssesment WHERE ";

	private static final String _SQL_COUNT_TOURISMNEWACCOASSESMENT =
		"SELECT COUNT(tourismNewAccoAssesment) FROM TourismNewAccoAssesment tourismNewAccoAssesment";

	private static final String _SQL_COUNT_TOURISMNEWACCOASSESMENT_WHERE =
		"SELECT COUNT(tourismNewAccoAssesment) FROM TourismNewAccoAssesment tourismNewAccoAssesment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismNewAccoAssesment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismNewAccoAssesment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismNewAccoAssesment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismNewAccoAssesmentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}