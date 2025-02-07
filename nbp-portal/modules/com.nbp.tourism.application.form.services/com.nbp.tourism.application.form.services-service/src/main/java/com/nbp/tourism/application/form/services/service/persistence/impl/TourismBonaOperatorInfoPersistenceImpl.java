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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaOperatorInfoException;
import com.nbp.tourism.application.form.services.model.TourismBonaOperatorInfo;
import com.nbp.tourism.application.form.services.model.TourismBonaOperatorInfoTable;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaOperatorInfoImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaOperatorInfoModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaOperatorInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaOperatorInfoUtil;
import com.nbp.tourism.application.form.services.service.persistence.impl.constants.TOURISMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the tourism bona operator info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismBonaOperatorInfoPersistence.class)
public class TourismBonaOperatorInfoPersistenceImpl
	extends BasePersistenceImpl<TourismBonaOperatorInfo>
	implements TourismBonaOperatorInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismBonaOperatorInfoUtil</code> to access the tourism bona operator info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismBonaOperatorInfoImpl.class.getName();

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
	 * Returns the tourism bona operator info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaOperatorInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona operator info
	 * @throws NoSuchTourismBonaOperatorInfoException if a matching tourism bona operator info could not be found
	 */
	@Override
	public TourismBonaOperatorInfo findBygetTourismById(
			Long tourismApplicationId)
		throws NoSuchTourismBonaOperatorInfoException {

		TourismBonaOperatorInfo tourismBonaOperatorInfo = fetchBygetTourismById(
			tourismApplicationId);

		if (tourismBonaOperatorInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismBonaOperatorInfoException(sb.toString());
		}

		return tourismBonaOperatorInfo;
	}

	/**
	 * Returns the tourism bona operator info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona operator info, or <code>null</code> if a matching tourism bona operator info could not be found
	 */
	@Override
	public TourismBonaOperatorInfo fetchBygetTourismById(
		Long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism bona operator info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona operator info, or <code>null</code> if a matching tourism bona operator info could not be found
	 */
	@Override
	public TourismBonaOperatorInfo fetchBygetTourismById(
		Long tourismApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {tourismApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetTourismById, finderArgs, this);
		}

		if (result instanceof TourismBonaOperatorInfo) {
			TourismBonaOperatorInfo tourismBonaOperatorInfo =
				(TourismBonaOperatorInfo)result;

			if (!Objects.equals(
					tourismApplicationId,
					tourismBonaOperatorInfo.getTourismApplicationId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMBONAOPERATORINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId.longValue());

				List<TourismBonaOperatorInfo> list = query.list();

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
								"TourismBonaOperatorInfoPersistenceImpl.fetchBygetTourismById(Long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismBonaOperatorInfo tourismBonaOperatorInfo = list.get(
						0);

					result = tourismBonaOperatorInfo;

					cacheResult(tourismBonaOperatorInfo);
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
			return (TourismBonaOperatorInfo)result;
		}
	}

	/**
	 * Removes the tourism bona operator info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona operator info that was removed
	 */
	@Override
	public TourismBonaOperatorInfo removeBygetTourismById(
			Long tourismApplicationId)
		throws NoSuchTourismBonaOperatorInfoException {

		TourismBonaOperatorInfo tourismBonaOperatorInfo = findBygetTourismById(
			tourismApplicationId);

		return remove(tourismBonaOperatorInfo);
	}

	/**
	 * Returns the number of tourism bona operator infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona operator infos
	 */
	@Override
	public int countBygetTourismById(Long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMBONAOPERATORINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId.longValue());

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
			"tourismBonaOperatorInfo.tourismApplicationId = ?";

	public TourismBonaOperatorInfoPersistenceImpl() {
		setModelClass(TourismBonaOperatorInfo.class);

		setModelImplClass(TourismBonaOperatorInfoImpl.class);
		setModelPKClass(long.class);

		setTable(TourismBonaOperatorInfoTable.INSTANCE);
	}

	/**
	 * Caches the tourism bona operator info in the entity cache if it is enabled.
	 *
	 * @param tourismBonaOperatorInfo the tourism bona operator info
	 */
	@Override
	public void cacheResult(TourismBonaOperatorInfo tourismBonaOperatorInfo) {
		entityCache.putResult(
			TourismBonaOperatorInfoImpl.class,
			tourismBonaOperatorInfo.getPrimaryKey(), tourismBonaOperatorInfo);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {tourismBonaOperatorInfo.getTourismApplicationId()},
			tourismBonaOperatorInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism bona operator infos in the entity cache if it is enabled.
	 *
	 * @param tourismBonaOperatorInfos the tourism bona operator infos
	 */
	@Override
	public void cacheResult(
		List<TourismBonaOperatorInfo> tourismBonaOperatorInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismBonaOperatorInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismBonaOperatorInfo tourismBonaOperatorInfo :
				tourismBonaOperatorInfos) {

			if (entityCache.getResult(
					TourismBonaOperatorInfoImpl.class,
					tourismBonaOperatorInfo.getPrimaryKey()) == null) {

				cacheResult(tourismBonaOperatorInfo);
			}
		}
	}

	/**
	 * Clears the cache for all tourism bona operator infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismBonaOperatorInfoImpl.class);

		finderCache.clearCache(TourismBonaOperatorInfoImpl.class);
	}

	/**
	 * Clears the cache for the tourism bona operator info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TourismBonaOperatorInfo tourismBonaOperatorInfo) {
		entityCache.removeResult(
			TourismBonaOperatorInfoImpl.class, tourismBonaOperatorInfo);
	}

	@Override
	public void clearCache(
		List<TourismBonaOperatorInfo> tourismBonaOperatorInfos) {

		for (TourismBonaOperatorInfo tourismBonaOperatorInfo :
				tourismBonaOperatorInfos) {

			entityCache.removeResult(
				TourismBonaOperatorInfoImpl.class, tourismBonaOperatorInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismBonaOperatorInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismBonaOperatorInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismBonaOperatorInfoModelImpl tourismBonaOperatorInfoModelImpl) {

		Object[] args = new Object[] {
			tourismBonaOperatorInfoModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismBonaOperatorInfoModelImpl);
	}

	/**
	 * Creates a new tourism bona operator info with the primary key. Does not add the tourism bona operator info to the database.
	 *
	 * @param tourismBonaOperatorInfoId the primary key for the new tourism bona operator info
	 * @return the new tourism bona operator info
	 */
	@Override
	public TourismBonaOperatorInfo create(long tourismBonaOperatorInfoId) {
		TourismBonaOperatorInfo tourismBonaOperatorInfo =
			new TourismBonaOperatorInfoImpl();

		tourismBonaOperatorInfo.setNew(true);
		tourismBonaOperatorInfo.setPrimaryKey(tourismBonaOperatorInfoId);

		tourismBonaOperatorInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return tourismBonaOperatorInfo;
	}

	/**
	 * Removes the tourism bona operator info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaOperatorInfoId the primary key of the tourism bona operator info
	 * @return the tourism bona operator info that was removed
	 * @throws NoSuchTourismBonaOperatorInfoException if a tourism bona operator info with the primary key could not be found
	 */
	@Override
	public TourismBonaOperatorInfo remove(long tourismBonaOperatorInfoId)
		throws NoSuchTourismBonaOperatorInfoException {

		return remove((Serializable)tourismBonaOperatorInfoId);
	}

	/**
	 * Removes the tourism bona operator info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism bona operator info
	 * @return the tourism bona operator info that was removed
	 * @throws NoSuchTourismBonaOperatorInfoException if a tourism bona operator info with the primary key could not be found
	 */
	@Override
	public TourismBonaOperatorInfo remove(Serializable primaryKey)
		throws NoSuchTourismBonaOperatorInfoException {

		Session session = null;

		try {
			session = openSession();

			TourismBonaOperatorInfo tourismBonaOperatorInfo =
				(TourismBonaOperatorInfo)session.get(
					TourismBonaOperatorInfoImpl.class, primaryKey);

			if (tourismBonaOperatorInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismBonaOperatorInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismBonaOperatorInfo);
		}
		catch (NoSuchTourismBonaOperatorInfoException noSuchEntityException) {
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
	protected TourismBonaOperatorInfo removeImpl(
		TourismBonaOperatorInfo tourismBonaOperatorInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismBonaOperatorInfo)) {
				tourismBonaOperatorInfo = (TourismBonaOperatorInfo)session.get(
					TourismBonaOperatorInfoImpl.class,
					tourismBonaOperatorInfo.getPrimaryKeyObj());
			}

			if (tourismBonaOperatorInfo != null) {
				session.delete(tourismBonaOperatorInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismBonaOperatorInfo != null) {
			clearCache(tourismBonaOperatorInfo);
		}

		return tourismBonaOperatorInfo;
	}

	@Override
	public TourismBonaOperatorInfo updateImpl(
		TourismBonaOperatorInfo tourismBonaOperatorInfo) {

		boolean isNew = tourismBonaOperatorInfo.isNew();

		if (!(tourismBonaOperatorInfo instanceof
				TourismBonaOperatorInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tourismBonaOperatorInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismBonaOperatorInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismBonaOperatorInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismBonaOperatorInfo implementation " +
					tourismBonaOperatorInfo.getClass());
		}

		TourismBonaOperatorInfoModelImpl tourismBonaOperatorInfoModelImpl =
			(TourismBonaOperatorInfoModelImpl)tourismBonaOperatorInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismBonaOperatorInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismBonaOperatorInfo.setCreateDate(date);
			}
			else {
				tourismBonaOperatorInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismBonaOperatorInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismBonaOperatorInfo.setModifiedDate(date);
			}
			else {
				tourismBonaOperatorInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismBonaOperatorInfo);
			}
			else {
				tourismBonaOperatorInfo =
					(TourismBonaOperatorInfo)session.merge(
						tourismBonaOperatorInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismBonaOperatorInfoImpl.class, tourismBonaOperatorInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(tourismBonaOperatorInfoModelImpl);

		if (isNew) {
			tourismBonaOperatorInfo.setNew(false);
		}

		tourismBonaOperatorInfo.resetOriginalValues();

		return tourismBonaOperatorInfo;
	}

	/**
	 * Returns the tourism bona operator info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism bona operator info
	 * @return the tourism bona operator info
	 * @throws NoSuchTourismBonaOperatorInfoException if a tourism bona operator info with the primary key could not be found
	 */
	@Override
	public TourismBonaOperatorInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTourismBonaOperatorInfoException {

		TourismBonaOperatorInfo tourismBonaOperatorInfo = fetchByPrimaryKey(
			primaryKey);

		if (tourismBonaOperatorInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismBonaOperatorInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismBonaOperatorInfo;
	}

	/**
	 * Returns the tourism bona operator info with the primary key or throws a <code>NoSuchTourismBonaOperatorInfoException</code> if it could not be found.
	 *
	 * @param tourismBonaOperatorInfoId the primary key of the tourism bona operator info
	 * @return the tourism bona operator info
	 * @throws NoSuchTourismBonaOperatorInfoException if a tourism bona operator info with the primary key could not be found
	 */
	@Override
	public TourismBonaOperatorInfo findByPrimaryKey(
			long tourismBonaOperatorInfoId)
		throws NoSuchTourismBonaOperatorInfoException {

		return findByPrimaryKey((Serializable)tourismBonaOperatorInfoId);
	}

	/**
	 * Returns the tourism bona operator info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaOperatorInfoId the primary key of the tourism bona operator info
	 * @return the tourism bona operator info, or <code>null</code> if a tourism bona operator info with the primary key could not be found
	 */
	@Override
	public TourismBonaOperatorInfo fetchByPrimaryKey(
		long tourismBonaOperatorInfoId) {

		return fetchByPrimaryKey((Serializable)tourismBonaOperatorInfoId);
	}

	/**
	 * Returns all the tourism bona operator infos.
	 *
	 * @return the tourism bona operator infos
	 */
	@Override
	public List<TourismBonaOperatorInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism bona operator infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaOperatorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona operator infos
	 * @param end the upper bound of the range of tourism bona operator infos (not inclusive)
	 * @return the range of tourism bona operator infos
	 */
	@Override
	public List<TourismBonaOperatorInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism bona operator infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaOperatorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona operator infos
	 * @param end the upper bound of the range of tourism bona operator infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona operator infos
	 */
	@Override
	public List<TourismBonaOperatorInfo> findAll(
		int start, int end,
		OrderByComparator<TourismBonaOperatorInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism bona operator infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaOperatorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona operator infos
	 * @param end the upper bound of the range of tourism bona operator infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona operator infos
	 */
	@Override
	public List<TourismBonaOperatorInfo> findAll(
		int start, int end,
		OrderByComparator<TourismBonaOperatorInfo> orderByComparator,
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

		List<TourismBonaOperatorInfo> list = null;

		if (useFinderCache) {
			list = (List<TourismBonaOperatorInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMBONAOPERATORINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMBONAOPERATORINFO;

				sql = sql.concat(
					TourismBonaOperatorInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismBonaOperatorInfo>)QueryUtil.list(
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
	 * Removes all the tourism bona operator infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismBonaOperatorInfo tourismBonaOperatorInfo : findAll()) {
			remove(tourismBonaOperatorInfo);
		}
	}

	/**
	 * Returns the number of tourism bona operator infos.
	 *
	 * @return the number of tourism bona operator infos
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
					_SQL_COUNT_TOURISMBONAOPERATORINFO);

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
		return "tourismBonaOperatorInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMBONAOPERATORINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismBonaOperatorInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism bona operator info persistence.
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

		TourismBonaOperatorInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismBonaOperatorInfoUtil.setPersistence(null);

		entityCache.removeCache(TourismBonaOperatorInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_TOURISMBONAOPERATORINFO =
		"SELECT tourismBonaOperatorInfo FROM TourismBonaOperatorInfo tourismBonaOperatorInfo";

	private static final String _SQL_SELECT_TOURISMBONAOPERATORINFO_WHERE =
		"SELECT tourismBonaOperatorInfo FROM TourismBonaOperatorInfo tourismBonaOperatorInfo WHERE ";

	private static final String _SQL_COUNT_TOURISMBONAOPERATORINFO =
		"SELECT COUNT(tourismBonaOperatorInfo) FROM TourismBonaOperatorInfo tourismBonaOperatorInfo";

	private static final String _SQL_COUNT_TOURISMBONAOPERATORINFO_WHERE =
		"SELECT COUNT(tourismBonaOperatorInfo) FROM TourismBonaOperatorInfo tourismBonaOperatorInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismBonaOperatorInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismBonaOperatorInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismBonaOperatorInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismBonaOperatorInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}