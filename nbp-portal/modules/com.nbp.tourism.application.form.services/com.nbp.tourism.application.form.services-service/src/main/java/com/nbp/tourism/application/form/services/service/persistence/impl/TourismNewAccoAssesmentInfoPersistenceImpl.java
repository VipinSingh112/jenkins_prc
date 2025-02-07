/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
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
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAccoAssesmentInfoException;
import com.nbp.tourism.application.form.services.model.TourismNewAccoAssesmentInfo;
import com.nbp.tourism.application.form.services.model.TourismNewAccoAssesmentInfoTable;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAccoAssesmentInfoImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAccoAssesmentInfoModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAccoAssesmentInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAccoAssesmentInfoUtil;
import com.nbp.tourism.application.form.services.service.persistence.impl.constants.TOURISMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
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
 * The persistence implementation for the tourism new acco assesment info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {
		TourismNewAccoAssesmentInfoPersistence.class, BasePersistence.class
	}
)
public class TourismNewAccoAssesmentInfoPersistenceImpl
	extends BasePersistenceImpl<TourismNewAccoAssesmentInfo>
	implements TourismNewAccoAssesmentInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismNewAccoAssesmentInfoUtil</code> to access the tourism new acco assesment info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismNewAccoAssesmentInfoImpl.class.getName();

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
	 * Returns the tourism new acco assesment info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAccoAssesmentInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new acco assesment info
	 * @throws NoSuchTourismNewAccoAssesmentInfoException if a matching tourism new acco assesment info could not be found
	 */
	@Override
	public TourismNewAccoAssesmentInfo findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccoAssesmentInfoException {

		TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo =
			fetchBygetTourismById(tourismApplicationId);

		if (tourismNewAccoAssesmentInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismNewAccoAssesmentInfoException(sb.toString());
		}

		return tourismNewAccoAssesmentInfo;
	}

	/**
	 * Returns the tourism new acco assesment info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new acco assesment info, or <code>null</code> if a matching tourism new acco assesment info could not be found
	 */
	@Override
	public TourismNewAccoAssesmentInfo fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism new acco assesment info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new acco assesment info, or <code>null</code> if a matching tourism new acco assesment info could not be found
	 */
	@Override
	public TourismNewAccoAssesmentInfo fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {tourismApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetTourismById, finderArgs,this);
		}

		if (result instanceof TourismNewAccoAssesmentInfo) {
			TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo =
				(TourismNewAccoAssesmentInfo)result;

			if (tourismApplicationId !=
					tourismNewAccoAssesmentInfo.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMNEWACCOASSESMENTINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismNewAccoAssesmentInfo> list = query.list();

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
								"TourismNewAccoAssesmentInfoPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo =
						list.get(0);

					result = tourismNewAccoAssesmentInfo;

					cacheResult(tourismNewAccoAssesmentInfo);
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
			return (TourismNewAccoAssesmentInfo)result;
		}
	}

	/**
	 * Removes the tourism new acco assesment info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new acco assesment info that was removed
	 */
	@Override
	public TourismNewAccoAssesmentInfo removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccoAssesmentInfoException {

		TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo =
			findBygetTourismById(tourismApplicationId);

		return remove(tourismNewAccoAssesmentInfo);
	}

	/**
	 * Returns the number of tourism new acco assesment infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new acco assesment infos
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMNEWACCOASSESMENTINFO_WHERE);

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
			"tourismNewAccoAssesmentInfo.tourismApplicationId = ?";

	public TourismNewAccoAssesmentInfoPersistenceImpl() {
		setModelClass(TourismNewAccoAssesmentInfo.class);

		setModelImplClass(TourismNewAccoAssesmentInfoImpl.class);
		setModelPKClass(long.class);

		setTable(TourismNewAccoAssesmentInfoTable.INSTANCE);
	}

	/**
	 * Caches the tourism new acco assesment info in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccoAssesmentInfo the tourism new acco assesment info
	 */
	@Override
	public void cacheResult(
		TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo) {

		entityCache.putResult(
			TourismNewAccoAssesmentInfoImpl.class,
			tourismNewAccoAssesmentInfo.getPrimaryKey(),
			tourismNewAccoAssesmentInfo);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {
				tourismNewAccoAssesmentInfo.getTourismApplicationId()
			},
			tourismNewAccoAssesmentInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism new acco assesment infos in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccoAssesmentInfos the tourism new acco assesment infos
	 */
	@Override
	public void cacheResult(
		List<TourismNewAccoAssesmentInfo> tourismNewAccoAssesmentInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismNewAccoAssesmentInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo :
				tourismNewAccoAssesmentInfos) {

			if (entityCache.getResult(
					TourismNewAccoAssesmentInfoImpl.class,
					tourismNewAccoAssesmentInfo.getPrimaryKey()) == null) {

				cacheResult(tourismNewAccoAssesmentInfo);
			}
		}
	}

	/**
	 * Clears the cache for all tourism new acco assesment infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismNewAccoAssesmentInfoImpl.class);

		finderCache.clearCache(TourismNewAccoAssesmentInfoImpl.class);
	}

	/**
	 * Clears the cache for the tourism new acco assesment info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo) {

		entityCache.removeResult(
			TourismNewAccoAssesmentInfoImpl.class, tourismNewAccoAssesmentInfo);
	}

	@Override
	public void clearCache(
		List<TourismNewAccoAssesmentInfo> tourismNewAccoAssesmentInfos) {

		for (TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo :
				tourismNewAccoAssesmentInfos) {

			entityCache.removeResult(
				TourismNewAccoAssesmentInfoImpl.class,
				tourismNewAccoAssesmentInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismNewAccoAssesmentInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismNewAccoAssesmentInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismNewAccoAssesmentInfoModelImpl
			tourismNewAccoAssesmentInfoModelImpl) {

		Object[] args = new Object[] {
			tourismNewAccoAssesmentInfoModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismNewAccoAssesmentInfoModelImpl);
	}

	/**
	 * Creates a new tourism new acco assesment info with the primary key. Does not add the tourism new acco assesment info to the database.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key for the new tourism new acco assesment info
	 * @return the new tourism new acco assesment info
	 */
	@Override
	public TourismNewAccoAssesmentInfo create(
		long TourismNewAccoAssesmentInfoId) {

		TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo =
			new TourismNewAccoAssesmentInfoImpl();

		tourismNewAccoAssesmentInfo.setNew(true);
		tourismNewAccoAssesmentInfo.setPrimaryKey(
			TourismNewAccoAssesmentInfoId);

		tourismNewAccoAssesmentInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismNewAccoAssesmentInfo;
	}

	/**
	 * Removes the tourism new acco assesment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key of the tourism new acco assesment info
	 * @return the tourism new acco assesment info that was removed
	 * @throws NoSuchTourismNewAccoAssesmentInfoException if a tourism new acco assesment info with the primary key could not be found
	 */
	@Override
	public TourismNewAccoAssesmentInfo remove(
			long TourismNewAccoAssesmentInfoId)
		throws NoSuchTourismNewAccoAssesmentInfoException {

		return remove((Serializable)TourismNewAccoAssesmentInfoId);
	}

	/**
	 * Removes the tourism new acco assesment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism new acco assesment info
	 * @return the tourism new acco assesment info that was removed
	 * @throws NoSuchTourismNewAccoAssesmentInfoException if a tourism new acco assesment info with the primary key could not be found
	 */
	@Override
	public TourismNewAccoAssesmentInfo remove(Serializable primaryKey)
		throws NoSuchTourismNewAccoAssesmentInfoException {

		Session session = null;

		try {
			session = openSession();

			TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo =
				(TourismNewAccoAssesmentInfo)session.get(
					TourismNewAccoAssesmentInfoImpl.class, primaryKey);

			if (tourismNewAccoAssesmentInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismNewAccoAssesmentInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismNewAccoAssesmentInfo);
		}
		catch (NoSuchTourismNewAccoAssesmentInfoException
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
	protected TourismNewAccoAssesmentInfo removeImpl(
		TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismNewAccoAssesmentInfo)) {
				tourismNewAccoAssesmentInfo =
					(TourismNewAccoAssesmentInfo)session.get(
						TourismNewAccoAssesmentInfoImpl.class,
						tourismNewAccoAssesmentInfo.getPrimaryKeyObj());
			}

			if (tourismNewAccoAssesmentInfo != null) {
				session.delete(tourismNewAccoAssesmentInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismNewAccoAssesmentInfo != null) {
			clearCache(tourismNewAccoAssesmentInfo);
		}

		return tourismNewAccoAssesmentInfo;
	}

	@Override
	public TourismNewAccoAssesmentInfo updateImpl(
		TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo) {

		boolean isNew = tourismNewAccoAssesmentInfo.isNew();

		if (!(tourismNewAccoAssesmentInfo instanceof
				TourismNewAccoAssesmentInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					tourismNewAccoAssesmentInfo.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismNewAccoAssesmentInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismNewAccoAssesmentInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismNewAccoAssesmentInfo implementation " +
					tourismNewAccoAssesmentInfo.getClass());
		}

		TourismNewAccoAssesmentInfoModelImpl
			tourismNewAccoAssesmentInfoModelImpl =
				(TourismNewAccoAssesmentInfoModelImpl)
					tourismNewAccoAssesmentInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismNewAccoAssesmentInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismNewAccoAssesmentInfo.setCreateDate(date);
			}
			else {
				tourismNewAccoAssesmentInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismNewAccoAssesmentInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismNewAccoAssesmentInfo.setModifiedDate(date);
			}
			else {
				tourismNewAccoAssesmentInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismNewAccoAssesmentInfo);
			}
			else {
				tourismNewAccoAssesmentInfo =
					(TourismNewAccoAssesmentInfo)session.merge(
						tourismNewAccoAssesmentInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismNewAccoAssesmentInfoImpl.class,
			tourismNewAccoAssesmentInfoModelImpl, false, true);

		cacheUniqueFindersCache(tourismNewAccoAssesmentInfoModelImpl);

		if (isNew) {
			tourismNewAccoAssesmentInfo.setNew(false);
		}

		tourismNewAccoAssesmentInfo.resetOriginalValues();

		return tourismNewAccoAssesmentInfo;
	}

	/**
	 * Returns the tourism new acco assesment info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism new acco assesment info
	 * @return the tourism new acco assesment info
	 * @throws NoSuchTourismNewAccoAssesmentInfoException if a tourism new acco assesment info with the primary key could not be found
	 */
	@Override
	public TourismNewAccoAssesmentInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTourismNewAccoAssesmentInfoException {

		TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo =
			fetchByPrimaryKey(primaryKey);

		if (tourismNewAccoAssesmentInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismNewAccoAssesmentInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismNewAccoAssesmentInfo;
	}

	/**
	 * Returns the tourism new acco assesment info with the primary key or throws a <code>NoSuchTourismNewAccoAssesmentInfoException</code> if it could not be found.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key of the tourism new acco assesment info
	 * @return the tourism new acco assesment info
	 * @throws NoSuchTourismNewAccoAssesmentInfoException if a tourism new acco assesment info with the primary key could not be found
	 */
	@Override
	public TourismNewAccoAssesmentInfo findByPrimaryKey(
			long TourismNewAccoAssesmentInfoId)
		throws NoSuchTourismNewAccoAssesmentInfoException {

		return findByPrimaryKey((Serializable)TourismNewAccoAssesmentInfoId);
	}

	/**
	 * Returns the tourism new acco assesment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key of the tourism new acco assesment info
	 * @return the tourism new acco assesment info, or <code>null</code> if a tourism new acco assesment info with the primary key could not be found
	 */
	@Override
	public TourismNewAccoAssesmentInfo fetchByPrimaryKey(
		long TourismNewAccoAssesmentInfoId) {

		return fetchByPrimaryKey((Serializable)TourismNewAccoAssesmentInfoId);
	}

	/**
	 * Returns all the tourism new acco assesment infos.
	 *
	 * @return the tourism new acco assesment infos
	 */
	@Override
	public List<TourismNewAccoAssesmentInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism new acco assesment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoAssesmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco assesment infos
	 * @param end the upper bound of the range of tourism new acco assesment infos (not inclusive)
	 * @return the range of tourism new acco assesment infos
	 */
	@Override
	public List<TourismNewAccoAssesmentInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism new acco assesment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoAssesmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco assesment infos
	 * @param end the upper bound of the range of tourism new acco assesment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new acco assesment infos
	 */
	@Override
	public List<TourismNewAccoAssesmentInfo> findAll(
		int start, int end,
		OrderByComparator<TourismNewAccoAssesmentInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism new acco assesment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoAssesmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco assesment infos
	 * @param end the upper bound of the range of tourism new acco assesment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new acco assesment infos
	 */
	@Override
	public List<TourismNewAccoAssesmentInfo> findAll(
		int start, int end,
		OrderByComparator<TourismNewAccoAssesmentInfo> orderByComparator,
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

		List<TourismNewAccoAssesmentInfo> list = null;

		if (useFinderCache) {
			list = (List<TourismNewAccoAssesmentInfo>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMNEWACCOASSESMENTINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMNEWACCOASSESMENTINFO;

				sql = sql.concat(
					TourismNewAccoAssesmentInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismNewAccoAssesmentInfo>)QueryUtil.list(
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
	 * Removes all the tourism new acco assesment infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo :
				findAll()) {

			remove(tourismNewAccoAssesmentInfo);
		}
	}

	/**
	 * Returns the number of tourism new acco assesment infos.
	 *
	 * @return the number of tourism new acco assesment infos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_TOURISMNEWACCOASSESMENTINFO);

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
		return _SQL_SELECT_TOURISMNEWACCOASSESMENTINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismNewAccoAssesmentInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism new acco assesment info persistence.
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

		_setTourismNewAccoAssesmentInfoUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setTourismNewAccoAssesmentInfoUtilPersistence(null);

		entityCache.removeCache(
			TourismNewAccoAssesmentInfoImpl.class.getName());
	}

	private void _setTourismNewAccoAssesmentInfoUtilPersistence(
		TourismNewAccoAssesmentInfoPersistence
			tourismNewAccoAssesmentInfoPersistence) {

		try {
			Field field =
				TourismNewAccoAssesmentInfoUtil.class.getDeclaredField(
					"_persistence");

			field.setAccessible(true);

			field.set(null, tourismNewAccoAssesmentInfoPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
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

	private static final String _SQL_SELECT_TOURISMNEWACCOASSESMENTINFO =
		"SELECT tourismNewAccoAssesmentInfo FROM TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo";

	private static final String _SQL_SELECT_TOURISMNEWACCOASSESMENTINFO_WHERE =
		"SELECT tourismNewAccoAssesmentInfo FROM TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo WHERE ";

	private static final String _SQL_COUNT_TOURISMNEWACCOASSESMENTINFO =
		"SELECT COUNT(tourismNewAccoAssesmentInfo) FROM TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo";

	private static final String _SQL_COUNT_TOURISMNEWACCOASSESMENTINFO_WHERE =
		"SELECT COUNT(tourismNewAccoAssesmentInfo) FROM TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismNewAccoAssesmentInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismNewAccoAssesmentInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismNewAccoAssesmentInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismNewAccoAssesmentInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private TourismNewAccoAssesmentInfoModelArgumentsResolver
		_tourismNewAccoAssesmentInfoModelArgumentsResolver;

}