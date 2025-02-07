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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaAccoGenralInfoException;
import com.nbp.tourism.application.form.services.model.TourismBonaAccoGenralInfo;
import com.nbp.tourism.application.form.services.model.TourismBonaAccoGenralInfoTable;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaAccoGenralInfoImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaAccoGenralInfoModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAccoGenralInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAccoGenralInfoUtil;
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
 * The persistence implementation for the tourism bona acco genral info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismBonaAccoGenralInfoPersistence.class)
public class TourismBonaAccoGenralInfoPersistenceImpl
	extends BasePersistenceImpl<TourismBonaAccoGenralInfo>
	implements TourismBonaAccoGenralInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismBonaAccoGenralInfoUtil</code> to access the tourism bona acco genral info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismBonaAccoGenralInfoImpl.class.getName();

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
	 * Returns the tourism bona acco genral info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAccoGenralInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona acco genral info
	 * @throws NoSuchTourismBonaAccoGenralInfoException if a matching tourism bona acco genral info could not be found
	 */
	@Override
	public TourismBonaAccoGenralInfo findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAccoGenralInfoException {

		TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo =
			fetchBygetTourismById(tourismApplicationId);

		if (tourismBonaAccoGenralInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismBonaAccoGenralInfoException(sb.toString());
		}

		return tourismBonaAccoGenralInfo;
	}

	/**
	 * Returns the tourism bona acco genral info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona acco genral info, or <code>null</code> if a matching tourism bona acco genral info could not be found
	 */
	@Override
	public TourismBonaAccoGenralInfo fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism bona acco genral info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona acco genral info, or <code>null</code> if a matching tourism bona acco genral info could not be found
	 */
	@Override
	public TourismBonaAccoGenralInfo fetchBygetTourismById(
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

		if (result instanceof TourismBonaAccoGenralInfo) {
			TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo =
				(TourismBonaAccoGenralInfo)result;

			if (tourismApplicationId !=
					tourismBonaAccoGenralInfo.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMBONAACCOGENRALINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismBonaAccoGenralInfo> list = query.list();

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
								"TourismBonaAccoGenralInfoPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo =
						list.get(0);

					result = tourismBonaAccoGenralInfo;

					cacheResult(tourismBonaAccoGenralInfo);
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
			return (TourismBonaAccoGenralInfo)result;
		}
	}

	/**
	 * Removes the tourism bona acco genral info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona acco genral info that was removed
	 */
	@Override
	public TourismBonaAccoGenralInfo removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAccoGenralInfoException {

		TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo =
			findBygetTourismById(tourismApplicationId);

		return remove(tourismBonaAccoGenralInfo);
	}

	/**
	 * Returns the number of tourism bona acco genral infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona acco genral infos
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMBONAACCOGENRALINFO_WHERE);

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
			"tourismBonaAccoGenralInfo.tourismApplicationId = ?";

	public TourismBonaAccoGenralInfoPersistenceImpl() {
		setModelClass(TourismBonaAccoGenralInfo.class);

		setModelImplClass(TourismBonaAccoGenralInfoImpl.class);
		setModelPKClass(long.class);

		setTable(TourismBonaAccoGenralInfoTable.INSTANCE);
	}

	/**
	 * Caches the tourism bona acco genral info in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccoGenralInfo the tourism bona acco genral info
	 */
	@Override
	public void cacheResult(
		TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo) {

		entityCache.putResult(
			TourismBonaAccoGenralInfoImpl.class,
			tourismBonaAccoGenralInfo.getPrimaryKey(),
			tourismBonaAccoGenralInfo);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {tourismBonaAccoGenralInfo.getTourismApplicationId()},
			tourismBonaAccoGenralInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism bona acco genral infos in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccoGenralInfos the tourism bona acco genral infos
	 */
	@Override
	public void cacheResult(
		List<TourismBonaAccoGenralInfo> tourismBonaAccoGenralInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismBonaAccoGenralInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo :
				tourismBonaAccoGenralInfos) {

			if (entityCache.getResult(
					TourismBonaAccoGenralInfoImpl.class,
					tourismBonaAccoGenralInfo.getPrimaryKey()) == null) {

				cacheResult(tourismBonaAccoGenralInfo);
			}
		}
	}

	/**
	 * Clears the cache for all tourism bona acco genral infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismBonaAccoGenralInfoImpl.class);

		finderCache.clearCache(TourismBonaAccoGenralInfoImpl.class);
	}

	/**
	 * Clears the cache for the tourism bona acco genral info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo) {

		entityCache.removeResult(
			TourismBonaAccoGenralInfoImpl.class, tourismBonaAccoGenralInfo);
	}

	@Override
	public void clearCache(
		List<TourismBonaAccoGenralInfo> tourismBonaAccoGenralInfos) {

		for (TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo :
				tourismBonaAccoGenralInfos) {

			entityCache.removeResult(
				TourismBonaAccoGenralInfoImpl.class, tourismBonaAccoGenralInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismBonaAccoGenralInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismBonaAccoGenralInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismBonaAccoGenralInfoModelImpl tourismBonaAccoGenralInfoModelImpl) {

		Object[] args = new Object[] {
			tourismBonaAccoGenralInfoModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismBonaAccoGenralInfoModelImpl);
	}

	/**
	 * Creates a new tourism bona acco genral info with the primary key. Does not add the tourism bona acco genral info to the database.
	 *
	 * @param tourismBonaAccoGenralInfoId the primary key for the new tourism bona acco genral info
	 * @return the new tourism bona acco genral info
	 */
	@Override
	public TourismBonaAccoGenralInfo create(long tourismBonaAccoGenralInfoId) {
		TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo =
			new TourismBonaAccoGenralInfoImpl();

		tourismBonaAccoGenralInfo.setNew(true);
		tourismBonaAccoGenralInfo.setPrimaryKey(tourismBonaAccoGenralInfoId);

		tourismBonaAccoGenralInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismBonaAccoGenralInfo;
	}

	/**
	 * Removes the tourism bona acco genral info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaAccoGenralInfoId the primary key of the tourism bona acco genral info
	 * @return the tourism bona acco genral info that was removed
	 * @throws NoSuchTourismBonaAccoGenralInfoException if a tourism bona acco genral info with the primary key could not be found
	 */
	@Override
	public TourismBonaAccoGenralInfo remove(long tourismBonaAccoGenralInfoId)
		throws NoSuchTourismBonaAccoGenralInfoException {

		return remove((Serializable)tourismBonaAccoGenralInfoId);
	}

	/**
	 * Removes the tourism bona acco genral info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism bona acco genral info
	 * @return the tourism bona acco genral info that was removed
	 * @throws NoSuchTourismBonaAccoGenralInfoException if a tourism bona acco genral info with the primary key could not be found
	 */
	@Override
	public TourismBonaAccoGenralInfo remove(Serializable primaryKey)
		throws NoSuchTourismBonaAccoGenralInfoException {

		Session session = null;

		try {
			session = openSession();

			TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo =
				(TourismBonaAccoGenralInfo)session.get(
					TourismBonaAccoGenralInfoImpl.class, primaryKey);

			if (tourismBonaAccoGenralInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismBonaAccoGenralInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismBonaAccoGenralInfo);
		}
		catch (NoSuchTourismBonaAccoGenralInfoException noSuchEntityException) {
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
	protected TourismBonaAccoGenralInfo removeImpl(
		TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismBonaAccoGenralInfo)) {
				tourismBonaAccoGenralInfo =
					(TourismBonaAccoGenralInfo)session.get(
						TourismBonaAccoGenralInfoImpl.class,
						tourismBonaAccoGenralInfo.getPrimaryKeyObj());
			}

			if (tourismBonaAccoGenralInfo != null) {
				session.delete(tourismBonaAccoGenralInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismBonaAccoGenralInfo != null) {
			clearCache(tourismBonaAccoGenralInfo);
		}

		return tourismBonaAccoGenralInfo;
	}

	@Override
	public TourismBonaAccoGenralInfo updateImpl(
		TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo) {

		boolean isNew = tourismBonaAccoGenralInfo.isNew();

		if (!(tourismBonaAccoGenralInfo instanceof
				TourismBonaAccoGenralInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tourismBonaAccoGenralInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismBonaAccoGenralInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismBonaAccoGenralInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismBonaAccoGenralInfo implementation " +
					tourismBonaAccoGenralInfo.getClass());
		}

		TourismBonaAccoGenralInfoModelImpl tourismBonaAccoGenralInfoModelImpl =
			(TourismBonaAccoGenralInfoModelImpl)tourismBonaAccoGenralInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismBonaAccoGenralInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismBonaAccoGenralInfo.setCreateDate(date);
			}
			else {
				tourismBonaAccoGenralInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismBonaAccoGenralInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismBonaAccoGenralInfo.setModifiedDate(date);
			}
			else {
				tourismBonaAccoGenralInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismBonaAccoGenralInfo);
			}
			else {
				tourismBonaAccoGenralInfo =
					(TourismBonaAccoGenralInfo)session.merge(
						tourismBonaAccoGenralInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismBonaAccoGenralInfoImpl.class,
			tourismBonaAccoGenralInfoModelImpl, false, true);

		cacheUniqueFindersCache(tourismBonaAccoGenralInfoModelImpl);

		if (isNew) {
			tourismBonaAccoGenralInfo.setNew(false);
		}

		tourismBonaAccoGenralInfo.resetOriginalValues();

		return tourismBonaAccoGenralInfo;
	}

	/**
	 * Returns the tourism bona acco genral info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism bona acco genral info
	 * @return the tourism bona acco genral info
	 * @throws NoSuchTourismBonaAccoGenralInfoException if a tourism bona acco genral info with the primary key could not be found
	 */
	@Override
	public TourismBonaAccoGenralInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTourismBonaAccoGenralInfoException {

		TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo = fetchByPrimaryKey(
			primaryKey);

		if (tourismBonaAccoGenralInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismBonaAccoGenralInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismBonaAccoGenralInfo;
	}

	/**
	 * Returns the tourism bona acco genral info with the primary key or throws a <code>NoSuchTourismBonaAccoGenralInfoException</code> if it could not be found.
	 *
	 * @param tourismBonaAccoGenralInfoId the primary key of the tourism bona acco genral info
	 * @return the tourism bona acco genral info
	 * @throws NoSuchTourismBonaAccoGenralInfoException if a tourism bona acco genral info with the primary key could not be found
	 */
	@Override
	public TourismBonaAccoGenralInfo findByPrimaryKey(
			long tourismBonaAccoGenralInfoId)
		throws NoSuchTourismBonaAccoGenralInfoException {

		return findByPrimaryKey((Serializable)tourismBonaAccoGenralInfoId);
	}

	/**
	 * Returns the tourism bona acco genral info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaAccoGenralInfoId the primary key of the tourism bona acco genral info
	 * @return the tourism bona acco genral info, or <code>null</code> if a tourism bona acco genral info with the primary key could not be found
	 */
	@Override
	public TourismBonaAccoGenralInfo fetchByPrimaryKey(
		long tourismBonaAccoGenralInfoId) {

		return fetchByPrimaryKey((Serializable)tourismBonaAccoGenralInfoId);
	}

	/**
	 * Returns all the tourism bona acco genral infos.
	 *
	 * @return the tourism bona acco genral infos
	 */
	@Override
	public List<TourismBonaAccoGenralInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism bona acco genral infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccoGenralInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco genral infos
	 * @param end the upper bound of the range of tourism bona acco genral infos (not inclusive)
	 * @return the range of tourism bona acco genral infos
	 */
	@Override
	public List<TourismBonaAccoGenralInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism bona acco genral infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccoGenralInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco genral infos
	 * @param end the upper bound of the range of tourism bona acco genral infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona acco genral infos
	 */
	@Override
	public List<TourismBonaAccoGenralInfo> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAccoGenralInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism bona acco genral infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccoGenralInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco genral infos
	 * @param end the upper bound of the range of tourism bona acco genral infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona acco genral infos
	 */
	@Override
	public List<TourismBonaAccoGenralInfo> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAccoGenralInfo> orderByComparator,
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

		List<TourismBonaAccoGenralInfo> list = null;

		if (useFinderCache) {
			list = (List<TourismBonaAccoGenralInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMBONAACCOGENRALINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMBONAACCOGENRALINFO;

				sql = sql.concat(
					TourismBonaAccoGenralInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismBonaAccoGenralInfo>)QueryUtil.list(
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
	 * Removes all the tourism bona acco genral infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo : findAll()) {
			remove(tourismBonaAccoGenralInfo);
		}
	}

	/**
	 * Returns the number of tourism bona acco genral infos.
	 *
	 * @return the number of tourism bona acco genral infos
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
					_SQL_COUNT_TOURISMBONAACCOGENRALINFO);

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
		return "tourismBonaAccoGenralInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMBONAACCOGENRALINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismBonaAccoGenralInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism bona acco genral info persistence.
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

		TourismBonaAccoGenralInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismBonaAccoGenralInfoUtil.setPersistence(null);

		entityCache.removeCache(TourismBonaAccoGenralInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_TOURISMBONAACCOGENRALINFO =
		"SELECT tourismBonaAccoGenralInfo FROM TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo";

	private static final String _SQL_SELECT_TOURISMBONAACCOGENRALINFO_WHERE =
		"SELECT tourismBonaAccoGenralInfo FROM TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo WHERE ";

	private static final String _SQL_COUNT_TOURISMBONAACCOGENRALINFO =
		"SELECT COUNT(tourismBonaAccoGenralInfo) FROM TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo";

	private static final String _SQL_COUNT_TOURISMBONAACCOGENRALINFO_WHERE =
		"SELECT COUNT(tourismBonaAccoGenralInfo) FROM TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismBonaAccoGenralInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismBonaAccoGenralInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismBonaAccoGenralInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismBonaAccoGenralInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}