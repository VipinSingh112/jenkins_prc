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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaGroundSignInfoException;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundSignInfo;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundSignInfoTable;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundSignInfoImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundSignInfoModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundSignInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundSignInfoUtil;
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
 * The persistence implementation for the tourism bona ground sign info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismBonaGroundSignInfoPersistence.class)
public class TourismBonaGroundSignInfoPersistenceImpl
	extends BasePersistenceImpl<TourismBonaGroundSignInfo>
	implements TourismBonaGroundSignInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismBonaGroundSignInfoUtil</code> to access the tourism bona ground sign info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismBonaGroundSignInfoImpl.class.getName();

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
	 * Returns the tourism bona ground sign info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaGroundSignInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground sign info
	 * @throws NoSuchTourismBonaGroundSignInfoException if a matching tourism bona ground sign info could not be found
	 */
	@Override
	public TourismBonaGroundSignInfo findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundSignInfoException {

		TourismBonaGroundSignInfo tourismBonaGroundSignInfo =
			fetchBygetTourismById(tourismApplicationId);

		if (tourismBonaGroundSignInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismBonaGroundSignInfoException(sb.toString());
		}

		return tourismBonaGroundSignInfo;
	}

	/**
	 * Returns the tourism bona ground sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground sign info, or <code>null</code> if a matching tourism bona ground sign info could not be found
	 */
	@Override
	public TourismBonaGroundSignInfo fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism bona ground sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona ground sign info, or <code>null</code> if a matching tourism bona ground sign info could not be found
	 */
	@Override
	public TourismBonaGroundSignInfo fetchBygetTourismById(
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

		if (result instanceof TourismBonaGroundSignInfo) {
			TourismBonaGroundSignInfo tourismBonaGroundSignInfo =
				(TourismBonaGroundSignInfo)result;

			if (tourismApplicationId !=
					tourismBonaGroundSignInfo.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMBONAGROUNDSIGNINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismBonaGroundSignInfo> list = query.list();

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
								"TourismBonaGroundSignInfoPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismBonaGroundSignInfo tourismBonaGroundSignInfo =
						list.get(0);

					result = tourismBonaGroundSignInfo;

					cacheResult(tourismBonaGroundSignInfo);
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
			return (TourismBonaGroundSignInfo)result;
		}
	}

	/**
	 * Removes the tourism bona ground sign info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona ground sign info that was removed
	 */
	@Override
	public TourismBonaGroundSignInfo removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundSignInfoException {

		TourismBonaGroundSignInfo tourismBonaGroundSignInfo =
			findBygetTourismById(tourismApplicationId);

		return remove(tourismBonaGroundSignInfo);
	}

	/**
	 * Returns the number of tourism bona ground sign infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona ground sign infos
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMBONAGROUNDSIGNINFO_WHERE);

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
			"tourismBonaGroundSignInfo.tourismApplicationId = ?";

	public TourismBonaGroundSignInfoPersistenceImpl() {
		setModelClass(TourismBonaGroundSignInfo.class);

		setModelImplClass(TourismBonaGroundSignInfoImpl.class);
		setModelPKClass(long.class);

		setTable(TourismBonaGroundSignInfoTable.INSTANCE);
	}

	/**
	 * Caches the tourism bona ground sign info in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundSignInfo the tourism bona ground sign info
	 */
	@Override
	public void cacheResult(
		TourismBonaGroundSignInfo tourismBonaGroundSignInfo) {

		entityCache.putResult(
			TourismBonaGroundSignInfoImpl.class,
			tourismBonaGroundSignInfo.getPrimaryKey(),
			tourismBonaGroundSignInfo);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {tourismBonaGroundSignInfo.getTourismApplicationId()},
			tourismBonaGroundSignInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism bona ground sign infos in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundSignInfos the tourism bona ground sign infos
	 */
	@Override
	public void cacheResult(
		List<TourismBonaGroundSignInfo> tourismBonaGroundSignInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismBonaGroundSignInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismBonaGroundSignInfo tourismBonaGroundSignInfo :
				tourismBonaGroundSignInfos) {

			if (entityCache.getResult(
					TourismBonaGroundSignInfoImpl.class,
					tourismBonaGroundSignInfo.getPrimaryKey()) == null) {

				cacheResult(tourismBonaGroundSignInfo);
			}
		}
	}

	/**
	 * Clears the cache for all tourism bona ground sign infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismBonaGroundSignInfoImpl.class);

		finderCache.clearCache(TourismBonaGroundSignInfoImpl.class);
	}

	/**
	 * Clears the cache for the tourism bona ground sign info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismBonaGroundSignInfo tourismBonaGroundSignInfo) {

		entityCache.removeResult(
			TourismBonaGroundSignInfoImpl.class, tourismBonaGroundSignInfo);
	}

	@Override
	public void clearCache(
		List<TourismBonaGroundSignInfo> tourismBonaGroundSignInfos) {

		for (TourismBonaGroundSignInfo tourismBonaGroundSignInfo :
				tourismBonaGroundSignInfos) {

			entityCache.removeResult(
				TourismBonaGroundSignInfoImpl.class, tourismBonaGroundSignInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismBonaGroundSignInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismBonaGroundSignInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismBonaGroundSignInfoModelImpl tourismBonaGroundSignInfoModelImpl) {

		Object[] args = new Object[] {
			tourismBonaGroundSignInfoModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismBonaGroundSignInfoModelImpl);
	}

	/**
	 * Creates a new tourism bona ground sign info with the primary key. Does not add the tourism bona ground sign info to the database.
	 *
	 * @param tourismBonaGroundSignInfoId the primary key for the new tourism bona ground sign info
	 * @return the new tourism bona ground sign info
	 */
	@Override
	public TourismBonaGroundSignInfo create(long tourismBonaGroundSignInfoId) {
		TourismBonaGroundSignInfo tourismBonaGroundSignInfo =
			new TourismBonaGroundSignInfoImpl();

		tourismBonaGroundSignInfo.setNew(true);
		tourismBonaGroundSignInfo.setPrimaryKey(tourismBonaGroundSignInfoId);

		tourismBonaGroundSignInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismBonaGroundSignInfo;
	}

	/**
	 * Removes the tourism bona ground sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaGroundSignInfoId the primary key of the tourism bona ground sign info
	 * @return the tourism bona ground sign info that was removed
	 * @throws NoSuchTourismBonaGroundSignInfoException if a tourism bona ground sign info with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundSignInfo remove(long tourismBonaGroundSignInfoId)
		throws NoSuchTourismBonaGroundSignInfoException {

		return remove((Serializable)tourismBonaGroundSignInfoId);
	}

	/**
	 * Removes the tourism bona ground sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism bona ground sign info
	 * @return the tourism bona ground sign info that was removed
	 * @throws NoSuchTourismBonaGroundSignInfoException if a tourism bona ground sign info with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundSignInfo remove(Serializable primaryKey)
		throws NoSuchTourismBonaGroundSignInfoException {

		Session session = null;

		try {
			session = openSession();

			TourismBonaGroundSignInfo tourismBonaGroundSignInfo =
				(TourismBonaGroundSignInfo)session.get(
					TourismBonaGroundSignInfoImpl.class, primaryKey);

			if (tourismBonaGroundSignInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismBonaGroundSignInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismBonaGroundSignInfo);
		}
		catch (NoSuchTourismBonaGroundSignInfoException noSuchEntityException) {
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
	protected TourismBonaGroundSignInfo removeImpl(
		TourismBonaGroundSignInfo tourismBonaGroundSignInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismBonaGroundSignInfo)) {
				tourismBonaGroundSignInfo =
					(TourismBonaGroundSignInfo)session.get(
						TourismBonaGroundSignInfoImpl.class,
						tourismBonaGroundSignInfo.getPrimaryKeyObj());
			}

			if (tourismBonaGroundSignInfo != null) {
				session.delete(tourismBonaGroundSignInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismBonaGroundSignInfo != null) {
			clearCache(tourismBonaGroundSignInfo);
		}

		return tourismBonaGroundSignInfo;
	}

	@Override
	public TourismBonaGroundSignInfo updateImpl(
		TourismBonaGroundSignInfo tourismBonaGroundSignInfo) {

		boolean isNew = tourismBonaGroundSignInfo.isNew();

		if (!(tourismBonaGroundSignInfo instanceof
				TourismBonaGroundSignInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tourismBonaGroundSignInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismBonaGroundSignInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismBonaGroundSignInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismBonaGroundSignInfo implementation " +
					tourismBonaGroundSignInfo.getClass());
		}

		TourismBonaGroundSignInfoModelImpl tourismBonaGroundSignInfoModelImpl =
			(TourismBonaGroundSignInfoModelImpl)tourismBonaGroundSignInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismBonaGroundSignInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismBonaGroundSignInfo.setCreateDate(date);
			}
			else {
				tourismBonaGroundSignInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismBonaGroundSignInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismBonaGroundSignInfo.setModifiedDate(date);
			}
			else {
				tourismBonaGroundSignInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismBonaGroundSignInfo);
			}
			else {
				tourismBonaGroundSignInfo =
					(TourismBonaGroundSignInfo)session.merge(
						tourismBonaGroundSignInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismBonaGroundSignInfoImpl.class,
			tourismBonaGroundSignInfoModelImpl, false, true);

		cacheUniqueFindersCache(tourismBonaGroundSignInfoModelImpl);

		if (isNew) {
			tourismBonaGroundSignInfo.setNew(false);
		}

		tourismBonaGroundSignInfo.resetOriginalValues();

		return tourismBonaGroundSignInfo;
	}

	/**
	 * Returns the tourism bona ground sign info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism bona ground sign info
	 * @return the tourism bona ground sign info
	 * @throws NoSuchTourismBonaGroundSignInfoException if a tourism bona ground sign info with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundSignInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTourismBonaGroundSignInfoException {

		TourismBonaGroundSignInfo tourismBonaGroundSignInfo = fetchByPrimaryKey(
			primaryKey);

		if (tourismBonaGroundSignInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismBonaGroundSignInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismBonaGroundSignInfo;
	}

	/**
	 * Returns the tourism bona ground sign info with the primary key or throws a <code>NoSuchTourismBonaGroundSignInfoException</code> if it could not be found.
	 *
	 * @param tourismBonaGroundSignInfoId the primary key of the tourism bona ground sign info
	 * @return the tourism bona ground sign info
	 * @throws NoSuchTourismBonaGroundSignInfoException if a tourism bona ground sign info with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundSignInfo findByPrimaryKey(
			long tourismBonaGroundSignInfoId)
		throws NoSuchTourismBonaGroundSignInfoException {

		return findByPrimaryKey((Serializable)tourismBonaGroundSignInfoId);
	}

	/**
	 * Returns the tourism bona ground sign info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaGroundSignInfoId the primary key of the tourism bona ground sign info
	 * @return the tourism bona ground sign info, or <code>null</code> if a tourism bona ground sign info with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundSignInfo fetchByPrimaryKey(
		long tourismBonaGroundSignInfoId) {

		return fetchByPrimaryKey((Serializable)tourismBonaGroundSignInfoId);
	}

	/**
	 * Returns all the tourism bona ground sign infos.
	 *
	 * @return the tourism bona ground sign infos
	 */
	@Override
	public List<TourismBonaGroundSignInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism bona ground sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground sign infos
	 * @param end the upper bound of the range of tourism bona ground sign infos (not inclusive)
	 * @return the range of tourism bona ground sign infos
	 */
	@Override
	public List<TourismBonaGroundSignInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground sign infos
	 * @param end the upper bound of the range of tourism bona ground sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona ground sign infos
	 */
	@Override
	public List<TourismBonaGroundSignInfo> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundSignInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground sign infos
	 * @param end the upper bound of the range of tourism bona ground sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona ground sign infos
	 */
	@Override
	public List<TourismBonaGroundSignInfo> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundSignInfo> orderByComparator,
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

		List<TourismBonaGroundSignInfo> list = null;

		if (useFinderCache) {
			list = (List<TourismBonaGroundSignInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMBONAGROUNDSIGNINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMBONAGROUNDSIGNINFO;

				sql = sql.concat(
					TourismBonaGroundSignInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismBonaGroundSignInfo>)QueryUtil.list(
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
	 * Removes all the tourism bona ground sign infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismBonaGroundSignInfo tourismBonaGroundSignInfo : findAll()) {
			remove(tourismBonaGroundSignInfo);
		}
	}

	/**
	 * Returns the number of tourism bona ground sign infos.
	 *
	 * @return the number of tourism bona ground sign infos
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
					_SQL_COUNT_TOURISMBONAGROUNDSIGNINFO);

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
		return "tourismBonaGroundSignInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMBONAGROUNDSIGNINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismBonaGroundSignInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism bona ground sign info persistence.
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

		TourismBonaGroundSignInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismBonaGroundSignInfoUtil.setPersistence(null);

		entityCache.removeCache(TourismBonaGroundSignInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_TOURISMBONAGROUNDSIGNINFO =
		"SELECT tourismBonaGroundSignInfo FROM TourismBonaGroundSignInfo tourismBonaGroundSignInfo";

	private static final String _SQL_SELECT_TOURISMBONAGROUNDSIGNINFO_WHERE =
		"SELECT tourismBonaGroundSignInfo FROM TourismBonaGroundSignInfo tourismBonaGroundSignInfo WHERE ";

	private static final String _SQL_COUNT_TOURISMBONAGROUNDSIGNINFO =
		"SELECT COUNT(tourismBonaGroundSignInfo) FROM TourismBonaGroundSignInfo tourismBonaGroundSignInfo";

	private static final String _SQL_COUNT_TOURISMBONAGROUNDSIGNINFO_WHERE =
		"SELECT COUNT(tourismBonaGroundSignInfo) FROM TourismBonaGroundSignInfo tourismBonaGroundSignInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismBonaGroundSignInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismBonaGroundSignInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismBonaGroundSignInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismBonaGroundSignInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}