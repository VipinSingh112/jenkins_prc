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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewNumberOFEmploymentException;
import com.nbp.tourism.application.form.services.model.TourismNewNumberOFEmployment;
import com.nbp.tourism.application.form.services.model.TourismNewNumberOFEmploymentTable;
import com.nbp.tourism.application.form.services.model.impl.TourismNewNumberOFEmploymentImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismNewNumberOFEmploymentModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewNumberOFEmploymentPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewNumberOFEmploymentUtil;
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
 * The persistence implementation for the tourism new number of employment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismNewNumberOFEmploymentPersistence.class)
public class TourismNewNumberOFEmploymentPersistenceImpl
	extends BasePersistenceImpl<TourismNewNumberOFEmployment>
	implements TourismNewNumberOFEmploymentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismNewNumberOFEmploymentUtil</code> to access the tourism new number of employment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismNewNumberOFEmploymentImpl.class.getName();

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
	 * Returns the tourism new number of employment where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewNumberOFEmploymentException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new number of employment
	 * @throws NoSuchTourismNewNumberOFEmploymentException if a matching tourism new number of employment could not be found
	 */
	@Override
	public TourismNewNumberOFEmployment findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewNumberOFEmploymentException {

		TourismNewNumberOFEmployment tourismNewNumberOFEmployment =
			fetchBygetTourismById(tourismApplicationId);

		if (tourismNewNumberOFEmployment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismNewNumberOFEmploymentException(
				sb.toString());
		}

		return tourismNewNumberOFEmployment;
	}

	/**
	 * Returns the tourism new number of employment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new number of employment, or <code>null</code> if a matching tourism new number of employment could not be found
	 */
	@Override
	public TourismNewNumberOFEmployment fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism new number of employment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new number of employment, or <code>null</code> if a matching tourism new number of employment could not be found
	 */
	@Override
	public TourismNewNumberOFEmployment fetchBygetTourismById(
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

		if (result instanceof TourismNewNumberOFEmployment) {
			TourismNewNumberOFEmployment tourismNewNumberOFEmployment =
				(TourismNewNumberOFEmployment)result;

			if (tourismApplicationId !=
					tourismNewNumberOFEmployment.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMNEWNUMBEROFEMPLOYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismNewNumberOFEmployment> list = query.list();

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
								"TourismNewNumberOFEmploymentPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismNewNumberOFEmployment tourismNewNumberOFEmployment =
						list.get(0);

					result = tourismNewNumberOFEmployment;

					cacheResult(tourismNewNumberOFEmployment);
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
			return (TourismNewNumberOFEmployment)result;
		}
	}

	/**
	 * Removes the tourism new number of employment where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new number of employment that was removed
	 */
	@Override
	public TourismNewNumberOFEmployment removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewNumberOFEmploymentException {

		TourismNewNumberOFEmployment tourismNewNumberOFEmployment =
			findBygetTourismById(tourismApplicationId);

		return remove(tourismNewNumberOFEmployment);
	}

	/**
	 * Returns the number of tourism new number of employments where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new number of employments
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMNEWNUMBEROFEMPLOYMENT_WHERE);

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
			"tourismNewNumberOFEmployment.tourismApplicationId = ?";

	public TourismNewNumberOFEmploymentPersistenceImpl() {
		setModelClass(TourismNewNumberOFEmployment.class);

		setModelImplClass(TourismNewNumberOFEmploymentImpl.class);
		setModelPKClass(long.class);

		setTable(TourismNewNumberOFEmploymentTable.INSTANCE);
	}

	/**
	 * Caches the tourism new number of employment in the entity cache if it is enabled.
	 *
	 * @param tourismNewNumberOFEmployment the tourism new number of employment
	 */
	@Override
	public void cacheResult(
		TourismNewNumberOFEmployment tourismNewNumberOFEmployment) {

		entityCache.putResult(
			TourismNewNumberOFEmploymentImpl.class,
			tourismNewNumberOFEmployment.getPrimaryKey(),
			tourismNewNumberOFEmployment);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {
				tourismNewNumberOFEmployment.getTourismApplicationId()
			},
			tourismNewNumberOFEmployment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism new number of employments in the entity cache if it is enabled.
	 *
	 * @param tourismNewNumberOFEmployments the tourism new number of employments
	 */
	@Override
	public void cacheResult(
		List<TourismNewNumberOFEmployment> tourismNewNumberOFEmployments) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismNewNumberOFEmployments.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismNewNumberOFEmployment tourismNewNumberOFEmployment :
				tourismNewNumberOFEmployments) {

			if (entityCache.getResult(
					TourismNewNumberOFEmploymentImpl.class,
					tourismNewNumberOFEmployment.getPrimaryKey()) == null) {

				cacheResult(tourismNewNumberOFEmployment);
			}
		}
	}

	/**
	 * Clears the cache for all tourism new number of employments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismNewNumberOFEmploymentImpl.class);

		finderCache.clearCache(TourismNewNumberOFEmploymentImpl.class);
	}

	/**
	 * Clears the cache for the tourism new number of employment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismNewNumberOFEmployment tourismNewNumberOFEmployment) {

		entityCache.removeResult(
			TourismNewNumberOFEmploymentImpl.class,
			tourismNewNumberOFEmployment);
	}

	@Override
	public void clearCache(
		List<TourismNewNumberOFEmployment> tourismNewNumberOFEmployments) {

		for (TourismNewNumberOFEmployment tourismNewNumberOFEmployment :
				tourismNewNumberOFEmployments) {

			entityCache.removeResult(
				TourismNewNumberOFEmploymentImpl.class,
				tourismNewNumberOFEmployment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismNewNumberOFEmploymentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismNewNumberOFEmploymentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismNewNumberOFEmploymentModelImpl
			tourismNewNumberOFEmploymentModelImpl) {

		Object[] args = new Object[] {
			tourismNewNumberOFEmploymentModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismNewNumberOFEmploymentModelImpl);
	}

	/**
	 * Creates a new tourism new number of employment with the primary key. Does not add the tourism new number of employment to the database.
	 *
	 * @param tourismNewNumberOFEmploymentId the primary key for the new tourism new number of employment
	 * @return the new tourism new number of employment
	 */
	@Override
	public TourismNewNumberOFEmployment create(
		long tourismNewNumberOFEmploymentId) {

		TourismNewNumberOFEmployment tourismNewNumberOFEmployment =
			new TourismNewNumberOFEmploymentImpl();

		tourismNewNumberOFEmployment.setNew(true);
		tourismNewNumberOFEmployment.setPrimaryKey(
			tourismNewNumberOFEmploymentId);

		tourismNewNumberOFEmployment.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismNewNumberOFEmployment;
	}

	/**
	 * Removes the tourism new number of employment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewNumberOFEmploymentId the primary key of the tourism new number of employment
	 * @return the tourism new number of employment that was removed
	 * @throws NoSuchTourismNewNumberOFEmploymentException if a tourism new number of employment with the primary key could not be found
	 */
	@Override
	public TourismNewNumberOFEmployment remove(
			long tourismNewNumberOFEmploymentId)
		throws NoSuchTourismNewNumberOFEmploymentException {

		return remove((Serializable)tourismNewNumberOFEmploymentId);
	}

	/**
	 * Removes the tourism new number of employment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism new number of employment
	 * @return the tourism new number of employment that was removed
	 * @throws NoSuchTourismNewNumberOFEmploymentException if a tourism new number of employment with the primary key could not be found
	 */
	@Override
	public TourismNewNumberOFEmployment remove(Serializable primaryKey)
		throws NoSuchTourismNewNumberOFEmploymentException {

		Session session = null;

		try {
			session = openSession();

			TourismNewNumberOFEmployment tourismNewNumberOFEmployment =
				(TourismNewNumberOFEmployment)session.get(
					TourismNewNumberOFEmploymentImpl.class, primaryKey);

			if (tourismNewNumberOFEmployment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismNewNumberOFEmploymentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismNewNumberOFEmployment);
		}
		catch (NoSuchTourismNewNumberOFEmploymentException
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
	protected TourismNewNumberOFEmployment removeImpl(
		TourismNewNumberOFEmployment tourismNewNumberOFEmployment) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismNewNumberOFEmployment)) {
				tourismNewNumberOFEmployment =
					(TourismNewNumberOFEmployment)session.get(
						TourismNewNumberOFEmploymentImpl.class,
						tourismNewNumberOFEmployment.getPrimaryKeyObj());
			}

			if (tourismNewNumberOFEmployment != null) {
				session.delete(tourismNewNumberOFEmployment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismNewNumberOFEmployment != null) {
			clearCache(tourismNewNumberOFEmployment);
		}

		return tourismNewNumberOFEmployment;
	}

	@Override
	public TourismNewNumberOFEmployment updateImpl(
		TourismNewNumberOFEmployment tourismNewNumberOFEmployment) {

		boolean isNew = tourismNewNumberOFEmployment.isNew();

		if (!(tourismNewNumberOFEmployment instanceof
				TourismNewNumberOFEmploymentModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					tourismNewNumberOFEmployment.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismNewNumberOFEmployment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismNewNumberOFEmployment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismNewNumberOFEmployment implementation " +
					tourismNewNumberOFEmployment.getClass());
		}

		TourismNewNumberOFEmploymentModelImpl
			tourismNewNumberOFEmploymentModelImpl =
				(TourismNewNumberOFEmploymentModelImpl)
					tourismNewNumberOFEmployment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismNewNumberOFEmployment.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismNewNumberOFEmployment.setCreateDate(date);
			}
			else {
				tourismNewNumberOFEmployment.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismNewNumberOFEmploymentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismNewNumberOFEmployment.setModifiedDate(date);
			}
			else {
				tourismNewNumberOFEmployment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismNewNumberOFEmployment);
			}
			else {
				tourismNewNumberOFEmployment =
					(TourismNewNumberOFEmployment)session.merge(
						tourismNewNumberOFEmployment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismNewNumberOFEmploymentImpl.class,
			tourismNewNumberOFEmploymentModelImpl, false, true);

		cacheUniqueFindersCache(tourismNewNumberOFEmploymentModelImpl);

		if (isNew) {
			tourismNewNumberOFEmployment.setNew(false);
		}

		tourismNewNumberOFEmployment.resetOriginalValues();

		return tourismNewNumberOFEmployment;
	}

	/**
	 * Returns the tourism new number of employment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism new number of employment
	 * @return the tourism new number of employment
	 * @throws NoSuchTourismNewNumberOFEmploymentException if a tourism new number of employment with the primary key could not be found
	 */
	@Override
	public TourismNewNumberOFEmployment findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchTourismNewNumberOFEmploymentException {

		TourismNewNumberOFEmployment tourismNewNumberOFEmployment =
			fetchByPrimaryKey(primaryKey);

		if (tourismNewNumberOFEmployment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismNewNumberOFEmploymentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismNewNumberOFEmployment;
	}

	/**
	 * Returns the tourism new number of employment with the primary key or throws a <code>NoSuchTourismNewNumberOFEmploymentException</code> if it could not be found.
	 *
	 * @param tourismNewNumberOFEmploymentId the primary key of the tourism new number of employment
	 * @return the tourism new number of employment
	 * @throws NoSuchTourismNewNumberOFEmploymentException if a tourism new number of employment with the primary key could not be found
	 */
	@Override
	public TourismNewNumberOFEmployment findByPrimaryKey(
			long tourismNewNumberOFEmploymentId)
		throws NoSuchTourismNewNumberOFEmploymentException {

		return findByPrimaryKey((Serializable)tourismNewNumberOFEmploymentId);
	}

	/**
	 * Returns the tourism new number of employment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewNumberOFEmploymentId the primary key of the tourism new number of employment
	 * @return the tourism new number of employment, or <code>null</code> if a tourism new number of employment with the primary key could not be found
	 */
	@Override
	public TourismNewNumberOFEmployment fetchByPrimaryKey(
		long tourismNewNumberOFEmploymentId) {

		return fetchByPrimaryKey((Serializable)tourismNewNumberOFEmploymentId);
	}

	/**
	 * Returns all the tourism new number of employments.
	 *
	 * @return the tourism new number of employments
	 */
	@Override
	public List<TourismNewNumberOFEmployment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism new number of employments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewNumberOFEmploymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new number of employments
	 * @param end the upper bound of the range of tourism new number of employments (not inclusive)
	 * @return the range of tourism new number of employments
	 */
	@Override
	public List<TourismNewNumberOFEmployment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism new number of employments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewNumberOFEmploymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new number of employments
	 * @param end the upper bound of the range of tourism new number of employments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new number of employments
	 */
	@Override
	public List<TourismNewNumberOFEmployment> findAll(
		int start, int end,
		OrderByComparator<TourismNewNumberOFEmployment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism new number of employments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewNumberOFEmploymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new number of employments
	 * @param end the upper bound of the range of tourism new number of employments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new number of employments
	 */
	@Override
	public List<TourismNewNumberOFEmployment> findAll(
		int start, int end,
		OrderByComparator<TourismNewNumberOFEmployment> orderByComparator,
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

		List<TourismNewNumberOFEmployment> list = null;

		if (useFinderCache) {
			list = (List<TourismNewNumberOFEmployment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMNEWNUMBEROFEMPLOYMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMNEWNUMBEROFEMPLOYMENT;

				sql = sql.concat(
					TourismNewNumberOFEmploymentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismNewNumberOFEmployment>)QueryUtil.list(
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
	 * Removes all the tourism new number of employments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismNewNumberOFEmployment tourismNewNumberOFEmployment :
				findAll()) {

			remove(tourismNewNumberOFEmployment);
		}
	}

	/**
	 * Returns the number of tourism new number of employments.
	 *
	 * @return the number of tourism new number of employments
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
					_SQL_COUNT_TOURISMNEWNUMBEROFEMPLOYMENT);

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
		return "tourismNewNumberOFEmploymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMNEWNUMBEROFEMPLOYMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismNewNumberOFEmploymentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism new number of employment persistence.
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

		TourismNewNumberOFEmploymentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismNewNumberOFEmploymentUtil.setPersistence(null);

		entityCache.removeCache(
			TourismNewNumberOFEmploymentImpl.class.getName());
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

	private static final String _SQL_SELECT_TOURISMNEWNUMBEROFEMPLOYMENT =
		"SELECT tourismNewNumberOFEmployment FROM TourismNewNumberOFEmployment tourismNewNumberOFEmployment";

	private static final String _SQL_SELECT_TOURISMNEWNUMBEROFEMPLOYMENT_WHERE =
		"SELECT tourismNewNumberOFEmployment FROM TourismNewNumberOFEmployment tourismNewNumberOFEmployment WHERE ";

	private static final String _SQL_COUNT_TOURISMNEWNUMBEROFEMPLOYMENT =
		"SELECT COUNT(tourismNewNumberOFEmployment) FROM TourismNewNumberOFEmployment tourismNewNumberOFEmployment";

	private static final String _SQL_COUNT_TOURISMNEWNUMBEROFEMPLOYMENT_WHERE =
		"SELECT COUNT(tourismNewNumberOFEmployment) FROM TourismNewNumberOFEmployment tourismNewNumberOFEmployment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismNewNumberOFEmployment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismNewNumberOFEmployment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismNewNumberOFEmployment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismNewNumberOFEmploymentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}