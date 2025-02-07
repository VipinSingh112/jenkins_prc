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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAttractionFormFirstException;
import com.nbp.tourism.application.form.services.model.TourismNewAttractionFormFirst;
import com.nbp.tourism.application.form.services.model.TourismNewAttractionFormFirstTable;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormFirstImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormFirstModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAttractionFormFirstPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAttractionFormFirstUtil;
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
 * The persistence implementation for the tourism new attraction form first service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismNewAttractionFormFirstPersistence.class)
public class TourismNewAttractionFormFirstPersistenceImpl
	extends BasePersistenceImpl<TourismNewAttractionFormFirst>
	implements TourismNewAttractionFormFirstPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismNewAttractionFormFirstUtil</code> to access the tourism new attraction form first persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismNewAttractionFormFirstImpl.class.getName();

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
	 * Returns the tourism new attraction form first where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAttractionFormFirstException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction form first
	 * @throws NoSuchTourismNewAttractionFormFirstException if a matching tourism new attraction form first could not be found
	 */
	@Override
	public TourismNewAttractionFormFirst findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAttractionFormFirstException {

		TourismNewAttractionFormFirst tourismNewAttractionFormFirst =
			fetchBygetTourismById(tourismApplicationId);

		if (tourismNewAttractionFormFirst == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismNewAttractionFormFirstException(
				sb.toString());
		}

		return tourismNewAttractionFormFirst;
	}

	/**
	 * Returns the tourism new attraction form first where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction form first, or <code>null</code> if a matching tourism new attraction form first could not be found
	 */
	@Override
	public TourismNewAttractionFormFirst fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism new attraction form first where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new attraction form first, or <code>null</code> if a matching tourism new attraction form first could not be found
	 */
	@Override
	public TourismNewAttractionFormFirst fetchBygetTourismById(
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

		if (result instanceof TourismNewAttractionFormFirst) {
			TourismNewAttractionFormFirst tourismNewAttractionFormFirst =
				(TourismNewAttractionFormFirst)result;

			if (tourismApplicationId !=
					tourismNewAttractionFormFirst.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMNEWATTRACTIONFORMFIRST_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismNewAttractionFormFirst> list = query.list();

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
								"TourismNewAttractionFormFirstPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismNewAttractionFormFirst
						tourismNewAttractionFormFirst = list.get(0);

					result = tourismNewAttractionFormFirst;

					cacheResult(tourismNewAttractionFormFirst);
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
			return (TourismNewAttractionFormFirst)result;
		}
	}

	/**
	 * Removes the tourism new attraction form first where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new attraction form first that was removed
	 */
	@Override
	public TourismNewAttractionFormFirst removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAttractionFormFirstException {

		TourismNewAttractionFormFirst tourismNewAttractionFormFirst =
			findBygetTourismById(tourismApplicationId);

		return remove(tourismNewAttractionFormFirst);
	}

	/**
	 * Returns the number of tourism new attraction form firsts where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new attraction form firsts
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMNEWATTRACTIONFORMFIRST_WHERE);

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
			"tourismNewAttractionFormFirst.tourismApplicationId = ?";

	public TourismNewAttractionFormFirstPersistenceImpl() {
		setModelClass(TourismNewAttractionFormFirst.class);

		setModelImplClass(TourismNewAttractionFormFirstImpl.class);
		setModelPKClass(long.class);

		setTable(TourismNewAttractionFormFirstTable.INSTANCE);
	}

	/**
	 * Caches the tourism new attraction form first in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionFormFirst the tourism new attraction form first
	 */
	@Override
	public void cacheResult(
		TourismNewAttractionFormFirst tourismNewAttractionFormFirst) {

		entityCache.putResult(
			TourismNewAttractionFormFirstImpl.class,
			tourismNewAttractionFormFirst.getPrimaryKey(),
			tourismNewAttractionFormFirst);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {
				tourismNewAttractionFormFirst.getTourismApplicationId()
			},
			tourismNewAttractionFormFirst);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism new attraction form firsts in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionFormFirsts the tourism new attraction form firsts
	 */
	@Override
	public void cacheResult(
		List<TourismNewAttractionFormFirst> tourismNewAttractionFormFirsts) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismNewAttractionFormFirsts.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismNewAttractionFormFirst tourismNewAttractionFormFirst :
				tourismNewAttractionFormFirsts) {

			if (entityCache.getResult(
					TourismNewAttractionFormFirstImpl.class,
					tourismNewAttractionFormFirst.getPrimaryKey()) == null) {

				cacheResult(tourismNewAttractionFormFirst);
			}
		}
	}

	/**
	 * Clears the cache for all tourism new attraction form firsts.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismNewAttractionFormFirstImpl.class);

		finderCache.clearCache(TourismNewAttractionFormFirstImpl.class);
	}

	/**
	 * Clears the cache for the tourism new attraction form first.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismNewAttractionFormFirst tourismNewAttractionFormFirst) {

		entityCache.removeResult(
			TourismNewAttractionFormFirstImpl.class,
			tourismNewAttractionFormFirst);
	}

	@Override
	public void clearCache(
		List<TourismNewAttractionFormFirst> tourismNewAttractionFormFirsts) {

		for (TourismNewAttractionFormFirst tourismNewAttractionFormFirst :
				tourismNewAttractionFormFirsts) {

			entityCache.removeResult(
				TourismNewAttractionFormFirstImpl.class,
				tourismNewAttractionFormFirst);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismNewAttractionFormFirstImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismNewAttractionFormFirstImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismNewAttractionFormFirstModelImpl
			tourismNewAttractionFormFirstModelImpl) {

		Object[] args = new Object[] {
			tourismNewAttractionFormFirstModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismNewAttractionFormFirstModelImpl);
	}

	/**
	 * Creates a new tourism new attraction form first with the primary key. Does not add the tourism new attraction form first to the database.
	 *
	 * @param tourismNewAttractFormFirstId the primary key for the new tourism new attraction form first
	 * @return the new tourism new attraction form first
	 */
	@Override
	public TourismNewAttractionFormFirst create(
		long tourismNewAttractFormFirstId) {

		TourismNewAttractionFormFirst tourismNewAttractionFormFirst =
			new TourismNewAttractionFormFirstImpl();

		tourismNewAttractionFormFirst.setNew(true);
		tourismNewAttractionFormFirst.setPrimaryKey(
			tourismNewAttractFormFirstId);

		tourismNewAttractionFormFirst.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismNewAttractionFormFirst;
	}

	/**
	 * Removes the tourism new attraction form first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAttractFormFirstId the primary key of the tourism new attraction form first
	 * @return the tourism new attraction form first that was removed
	 * @throws NoSuchTourismNewAttractionFormFirstException if a tourism new attraction form first with the primary key could not be found
	 */
	@Override
	public TourismNewAttractionFormFirst remove(
			long tourismNewAttractFormFirstId)
		throws NoSuchTourismNewAttractionFormFirstException {

		return remove((Serializable)tourismNewAttractFormFirstId);
	}

	/**
	 * Removes the tourism new attraction form first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism new attraction form first
	 * @return the tourism new attraction form first that was removed
	 * @throws NoSuchTourismNewAttractionFormFirstException if a tourism new attraction form first with the primary key could not be found
	 */
	@Override
	public TourismNewAttractionFormFirst remove(Serializable primaryKey)
		throws NoSuchTourismNewAttractionFormFirstException {

		Session session = null;

		try {
			session = openSession();

			TourismNewAttractionFormFirst tourismNewAttractionFormFirst =
				(TourismNewAttractionFormFirst)session.get(
					TourismNewAttractionFormFirstImpl.class, primaryKey);

			if (tourismNewAttractionFormFirst == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismNewAttractionFormFirstException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismNewAttractionFormFirst);
		}
		catch (NoSuchTourismNewAttractionFormFirstException
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
	protected TourismNewAttractionFormFirst removeImpl(
		TourismNewAttractionFormFirst tourismNewAttractionFormFirst) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismNewAttractionFormFirst)) {
				tourismNewAttractionFormFirst =
					(TourismNewAttractionFormFirst)session.get(
						TourismNewAttractionFormFirstImpl.class,
						tourismNewAttractionFormFirst.getPrimaryKeyObj());
			}

			if (tourismNewAttractionFormFirst != null) {
				session.delete(tourismNewAttractionFormFirst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismNewAttractionFormFirst != null) {
			clearCache(tourismNewAttractionFormFirst);
		}

		return tourismNewAttractionFormFirst;
	}

	@Override
	public TourismNewAttractionFormFirst updateImpl(
		TourismNewAttractionFormFirst tourismNewAttractionFormFirst) {

		boolean isNew = tourismNewAttractionFormFirst.isNew();

		if (!(tourismNewAttractionFormFirst instanceof
				TourismNewAttractionFormFirstModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					tourismNewAttractionFormFirst.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismNewAttractionFormFirst);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismNewAttractionFormFirst proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismNewAttractionFormFirst implementation " +
					tourismNewAttractionFormFirst.getClass());
		}

		TourismNewAttractionFormFirstModelImpl
			tourismNewAttractionFormFirstModelImpl =
				(TourismNewAttractionFormFirstModelImpl)
					tourismNewAttractionFormFirst;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismNewAttractionFormFirst.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismNewAttractionFormFirst.setCreateDate(date);
			}
			else {
				tourismNewAttractionFormFirst.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismNewAttractionFormFirstModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismNewAttractionFormFirst.setModifiedDate(date);
			}
			else {
				tourismNewAttractionFormFirst.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismNewAttractionFormFirst);
			}
			else {
				tourismNewAttractionFormFirst =
					(TourismNewAttractionFormFirst)session.merge(
						tourismNewAttractionFormFirst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismNewAttractionFormFirstImpl.class,
			tourismNewAttractionFormFirstModelImpl, false, true);

		cacheUniqueFindersCache(tourismNewAttractionFormFirstModelImpl);

		if (isNew) {
			tourismNewAttractionFormFirst.setNew(false);
		}

		tourismNewAttractionFormFirst.resetOriginalValues();

		return tourismNewAttractionFormFirst;
	}

	/**
	 * Returns the tourism new attraction form first with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism new attraction form first
	 * @return the tourism new attraction form first
	 * @throws NoSuchTourismNewAttractionFormFirstException if a tourism new attraction form first with the primary key could not be found
	 */
	@Override
	public TourismNewAttractionFormFirst findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchTourismNewAttractionFormFirstException {

		TourismNewAttractionFormFirst tourismNewAttractionFormFirst =
			fetchByPrimaryKey(primaryKey);

		if (tourismNewAttractionFormFirst == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismNewAttractionFormFirstException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismNewAttractionFormFirst;
	}

	/**
	 * Returns the tourism new attraction form first with the primary key or throws a <code>NoSuchTourismNewAttractionFormFirstException</code> if it could not be found.
	 *
	 * @param tourismNewAttractFormFirstId the primary key of the tourism new attraction form first
	 * @return the tourism new attraction form first
	 * @throws NoSuchTourismNewAttractionFormFirstException if a tourism new attraction form first with the primary key could not be found
	 */
	@Override
	public TourismNewAttractionFormFirst findByPrimaryKey(
			long tourismNewAttractFormFirstId)
		throws NoSuchTourismNewAttractionFormFirstException {

		return findByPrimaryKey((Serializable)tourismNewAttractFormFirstId);
	}

	/**
	 * Returns the tourism new attraction form first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAttractFormFirstId the primary key of the tourism new attraction form first
	 * @return the tourism new attraction form first, or <code>null</code> if a tourism new attraction form first with the primary key could not be found
	 */
	@Override
	public TourismNewAttractionFormFirst fetchByPrimaryKey(
		long tourismNewAttractFormFirstId) {

		return fetchByPrimaryKey((Serializable)tourismNewAttractFormFirstId);
	}

	/**
	 * Returns all the tourism new attraction form firsts.
	 *
	 * @return the tourism new attraction form firsts
	 */
	@Override
	public List<TourismNewAttractionFormFirst> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism new attraction form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form firsts
	 * @param end the upper bound of the range of tourism new attraction form firsts (not inclusive)
	 * @return the range of tourism new attraction form firsts
	 */
	@Override
	public List<TourismNewAttractionFormFirst> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism new attraction form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form firsts
	 * @param end the upper bound of the range of tourism new attraction form firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new attraction form firsts
	 */
	@Override
	public List<TourismNewAttractionFormFirst> findAll(
		int start, int end,
		OrderByComparator<TourismNewAttractionFormFirst> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism new attraction form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form firsts
	 * @param end the upper bound of the range of tourism new attraction form firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new attraction form firsts
	 */
	@Override
	public List<TourismNewAttractionFormFirst> findAll(
		int start, int end,
		OrderByComparator<TourismNewAttractionFormFirst> orderByComparator,
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

		List<TourismNewAttractionFormFirst> list = null;

		if (useFinderCache) {
			list = (List<TourismNewAttractionFormFirst>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMNEWATTRACTIONFORMFIRST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMNEWATTRACTIONFORMFIRST;

				sql = sql.concat(
					TourismNewAttractionFormFirstModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismNewAttractionFormFirst>)QueryUtil.list(
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
	 * Removes all the tourism new attraction form firsts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismNewAttractionFormFirst tourismNewAttractionFormFirst :
				findAll()) {

			remove(tourismNewAttractionFormFirst);
		}
	}

	/**
	 * Returns the number of tourism new attraction form firsts.
	 *
	 * @return the number of tourism new attraction form firsts
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
					_SQL_COUNT_TOURISMNEWATTRACTIONFORMFIRST);

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
		return "tourismNewAttractFormFirstId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMNEWATTRACTIONFORMFIRST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismNewAttractionFormFirstModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism new attraction form first persistence.
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

		TourismNewAttractionFormFirstUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismNewAttractionFormFirstUtil.setPersistence(null);

		entityCache.removeCache(
			TourismNewAttractionFormFirstImpl.class.getName());
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

	private static final String _SQL_SELECT_TOURISMNEWATTRACTIONFORMFIRST =
		"SELECT tourismNewAttractionFormFirst FROM TourismNewAttractionFormFirst tourismNewAttractionFormFirst";

	private static final String
		_SQL_SELECT_TOURISMNEWATTRACTIONFORMFIRST_WHERE =
			"SELECT tourismNewAttractionFormFirst FROM TourismNewAttractionFormFirst tourismNewAttractionFormFirst WHERE ";

	private static final String _SQL_COUNT_TOURISMNEWATTRACTIONFORMFIRST =
		"SELECT COUNT(tourismNewAttractionFormFirst) FROM TourismNewAttractionFormFirst tourismNewAttractionFormFirst";

	private static final String _SQL_COUNT_TOURISMNEWATTRACTIONFORMFIRST_WHERE =
		"SELECT COUNT(tourismNewAttractionFormFirst) FROM TourismNewAttractionFormFirst tourismNewAttractionFormFirst WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismNewAttractionFormFirst.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismNewAttractionFormFirst exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismNewAttractionFormFirst exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismNewAttractionFormFirstPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}