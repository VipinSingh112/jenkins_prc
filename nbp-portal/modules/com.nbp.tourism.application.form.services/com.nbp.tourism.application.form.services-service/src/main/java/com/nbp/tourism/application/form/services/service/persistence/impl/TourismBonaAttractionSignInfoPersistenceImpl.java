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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaAttractionSignInfoException;
import com.nbp.tourism.application.form.services.model.TourismBonaAttractionSignInfo;
import com.nbp.tourism.application.form.services.model.TourismBonaAttractionSignInfoTable;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionSignInfoImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionSignInfoModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAttractionSignInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAttractionSignInfoUtil;
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
 * The persistence implementation for the tourism bona attraction sign info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismBonaAttractionSignInfoPersistence.class)
public class TourismBonaAttractionSignInfoPersistenceImpl
	extends BasePersistenceImpl<TourismBonaAttractionSignInfo>
	implements TourismBonaAttractionSignInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismBonaAttractionSignInfoUtil</code> to access the tourism bona attraction sign info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismBonaAttractionSignInfoImpl.class.getName();

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
	 * Returns the tourism bona attraction sign info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAttractionSignInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona attraction sign info
	 * @throws NoSuchTourismBonaAttractionSignInfoException if a matching tourism bona attraction sign info could not be found
	 */
	@Override
	public TourismBonaAttractionSignInfo findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAttractionSignInfoException {

		TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo =
			fetchBygetTourismById(tourismApplicationId);

		if (tourismBonaAttractionSignInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismBonaAttractionSignInfoException(
				sb.toString());
		}

		return tourismBonaAttractionSignInfo;
	}

	/**
	 * Returns the tourism bona attraction sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona attraction sign info, or <code>null</code> if a matching tourism bona attraction sign info could not be found
	 */
	@Override
	public TourismBonaAttractionSignInfo fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism bona attraction sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona attraction sign info, or <code>null</code> if a matching tourism bona attraction sign info could not be found
	 */
	@Override
	public TourismBonaAttractionSignInfo fetchBygetTourismById(
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

		if (result instanceof TourismBonaAttractionSignInfo) {
			TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo =
				(TourismBonaAttractionSignInfo)result;

			if (tourismApplicationId !=
					tourismBonaAttractionSignInfo.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMBONAATTRACTIONSIGNINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismBonaAttractionSignInfo> list = query.list();

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
								"TourismBonaAttractionSignInfoPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismBonaAttractionSignInfo
						tourismBonaAttractionSignInfo = list.get(0);

					result = tourismBonaAttractionSignInfo;

					cacheResult(tourismBonaAttractionSignInfo);
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
			return (TourismBonaAttractionSignInfo)result;
		}
	}

	/**
	 * Removes the tourism bona attraction sign info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona attraction sign info that was removed
	 */
	@Override
	public TourismBonaAttractionSignInfo removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAttractionSignInfoException {

		TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo =
			findBygetTourismById(tourismApplicationId);

		return remove(tourismBonaAttractionSignInfo);
	}

	/**
	 * Returns the number of tourism bona attraction sign infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona attraction sign infos
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMBONAATTRACTIONSIGNINFO_WHERE);

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
			"tourismBonaAttractionSignInfo.tourismApplicationId = ?";

	public TourismBonaAttractionSignInfoPersistenceImpl() {
		setModelClass(TourismBonaAttractionSignInfo.class);

		setModelImplClass(TourismBonaAttractionSignInfoImpl.class);
		setModelPKClass(long.class);

		setTable(TourismBonaAttractionSignInfoTable.INSTANCE);
	}

	/**
	 * Caches the tourism bona attraction sign info in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAttractionSignInfo the tourism bona attraction sign info
	 */
	@Override
	public void cacheResult(
		TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo) {

		entityCache.putResult(
			TourismBonaAttractionSignInfoImpl.class,
			tourismBonaAttractionSignInfo.getPrimaryKey(),
			tourismBonaAttractionSignInfo);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {
				tourismBonaAttractionSignInfo.getTourismApplicationId()
			},
			tourismBonaAttractionSignInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism bona attraction sign infos in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAttractionSignInfos the tourism bona attraction sign infos
	 */
	@Override
	public void cacheResult(
		List<TourismBonaAttractionSignInfo> tourismBonaAttractionSignInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismBonaAttractionSignInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo :
				tourismBonaAttractionSignInfos) {

			if (entityCache.getResult(
					TourismBonaAttractionSignInfoImpl.class,
					tourismBonaAttractionSignInfo.getPrimaryKey()) == null) {

				cacheResult(tourismBonaAttractionSignInfo);
			}
		}
	}

	/**
	 * Clears the cache for all tourism bona attraction sign infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismBonaAttractionSignInfoImpl.class);

		finderCache.clearCache(TourismBonaAttractionSignInfoImpl.class);
	}

	/**
	 * Clears the cache for the tourism bona attraction sign info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo) {

		entityCache.removeResult(
			TourismBonaAttractionSignInfoImpl.class,
			tourismBonaAttractionSignInfo);
	}

	@Override
	public void clearCache(
		List<TourismBonaAttractionSignInfo> tourismBonaAttractionSignInfos) {

		for (TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo :
				tourismBonaAttractionSignInfos) {

			entityCache.removeResult(
				TourismBonaAttractionSignInfoImpl.class,
				tourismBonaAttractionSignInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismBonaAttractionSignInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismBonaAttractionSignInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismBonaAttractionSignInfoModelImpl
			tourismBonaAttractionSignInfoModelImpl) {

		Object[] args = new Object[] {
			tourismBonaAttractionSignInfoModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismBonaAttractionSignInfoModelImpl);
	}

	/**
	 * Creates a new tourism bona attraction sign info with the primary key. Does not add the tourism bona attraction sign info to the database.
	 *
	 * @param tourismBonAttrSignId the primary key for the new tourism bona attraction sign info
	 * @return the new tourism bona attraction sign info
	 */
	@Override
	public TourismBonaAttractionSignInfo create(long tourismBonAttrSignId) {
		TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo =
			new TourismBonaAttractionSignInfoImpl();

		tourismBonaAttractionSignInfo.setNew(true);
		tourismBonaAttractionSignInfo.setPrimaryKey(tourismBonAttrSignId);

		tourismBonaAttractionSignInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismBonaAttractionSignInfo;
	}

	/**
	 * Removes the tourism bona attraction sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonAttrSignId the primary key of the tourism bona attraction sign info
	 * @return the tourism bona attraction sign info that was removed
	 * @throws NoSuchTourismBonaAttractionSignInfoException if a tourism bona attraction sign info with the primary key could not be found
	 */
	@Override
	public TourismBonaAttractionSignInfo remove(long tourismBonAttrSignId)
		throws NoSuchTourismBonaAttractionSignInfoException {

		return remove((Serializable)tourismBonAttrSignId);
	}

	/**
	 * Removes the tourism bona attraction sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism bona attraction sign info
	 * @return the tourism bona attraction sign info that was removed
	 * @throws NoSuchTourismBonaAttractionSignInfoException if a tourism bona attraction sign info with the primary key could not be found
	 */
	@Override
	public TourismBonaAttractionSignInfo remove(Serializable primaryKey)
		throws NoSuchTourismBonaAttractionSignInfoException {

		Session session = null;

		try {
			session = openSession();

			TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo =
				(TourismBonaAttractionSignInfo)session.get(
					TourismBonaAttractionSignInfoImpl.class, primaryKey);

			if (tourismBonaAttractionSignInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismBonaAttractionSignInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismBonaAttractionSignInfo);
		}
		catch (NoSuchTourismBonaAttractionSignInfoException
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
	protected TourismBonaAttractionSignInfo removeImpl(
		TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismBonaAttractionSignInfo)) {
				tourismBonaAttractionSignInfo =
					(TourismBonaAttractionSignInfo)session.get(
						TourismBonaAttractionSignInfoImpl.class,
						tourismBonaAttractionSignInfo.getPrimaryKeyObj());
			}

			if (tourismBonaAttractionSignInfo != null) {
				session.delete(tourismBonaAttractionSignInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismBonaAttractionSignInfo != null) {
			clearCache(tourismBonaAttractionSignInfo);
		}

		return tourismBonaAttractionSignInfo;
	}

	@Override
	public TourismBonaAttractionSignInfo updateImpl(
		TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo) {

		boolean isNew = tourismBonaAttractionSignInfo.isNew();

		if (!(tourismBonaAttractionSignInfo instanceof
				TourismBonaAttractionSignInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					tourismBonaAttractionSignInfo.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismBonaAttractionSignInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismBonaAttractionSignInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismBonaAttractionSignInfo implementation " +
					tourismBonaAttractionSignInfo.getClass());
		}

		TourismBonaAttractionSignInfoModelImpl
			tourismBonaAttractionSignInfoModelImpl =
				(TourismBonaAttractionSignInfoModelImpl)
					tourismBonaAttractionSignInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismBonaAttractionSignInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismBonaAttractionSignInfo.setCreateDate(date);
			}
			else {
				tourismBonaAttractionSignInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismBonaAttractionSignInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismBonaAttractionSignInfo.setModifiedDate(date);
			}
			else {
				tourismBonaAttractionSignInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismBonaAttractionSignInfo);
			}
			else {
				tourismBonaAttractionSignInfo =
					(TourismBonaAttractionSignInfo)session.merge(
						tourismBonaAttractionSignInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismBonaAttractionSignInfoImpl.class,
			tourismBonaAttractionSignInfoModelImpl, false, true);

		cacheUniqueFindersCache(tourismBonaAttractionSignInfoModelImpl);

		if (isNew) {
			tourismBonaAttractionSignInfo.setNew(false);
		}

		tourismBonaAttractionSignInfo.resetOriginalValues();

		return tourismBonaAttractionSignInfo;
	}

	/**
	 * Returns the tourism bona attraction sign info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism bona attraction sign info
	 * @return the tourism bona attraction sign info
	 * @throws NoSuchTourismBonaAttractionSignInfoException if a tourism bona attraction sign info with the primary key could not be found
	 */
	@Override
	public TourismBonaAttractionSignInfo findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchTourismBonaAttractionSignInfoException {

		TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo =
			fetchByPrimaryKey(primaryKey);

		if (tourismBonaAttractionSignInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismBonaAttractionSignInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismBonaAttractionSignInfo;
	}

	/**
	 * Returns the tourism bona attraction sign info with the primary key or throws a <code>NoSuchTourismBonaAttractionSignInfoException</code> if it could not be found.
	 *
	 * @param tourismBonAttrSignId the primary key of the tourism bona attraction sign info
	 * @return the tourism bona attraction sign info
	 * @throws NoSuchTourismBonaAttractionSignInfoException if a tourism bona attraction sign info with the primary key could not be found
	 */
	@Override
	public TourismBonaAttractionSignInfo findByPrimaryKey(
			long tourismBonAttrSignId)
		throws NoSuchTourismBonaAttractionSignInfoException {

		return findByPrimaryKey((Serializable)tourismBonAttrSignId);
	}

	/**
	 * Returns the tourism bona attraction sign info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonAttrSignId the primary key of the tourism bona attraction sign info
	 * @return the tourism bona attraction sign info, or <code>null</code> if a tourism bona attraction sign info with the primary key could not be found
	 */
	@Override
	public TourismBonaAttractionSignInfo fetchByPrimaryKey(
		long tourismBonAttrSignId) {

		return fetchByPrimaryKey((Serializable)tourismBonAttrSignId);
	}

	/**
	 * Returns all the tourism bona attraction sign infos.
	 *
	 * @return the tourism bona attraction sign infos
	 */
	@Override
	public List<TourismBonaAttractionSignInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism bona attraction sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction sign infos
	 * @param end the upper bound of the range of tourism bona attraction sign infos (not inclusive)
	 * @return the range of tourism bona attraction sign infos
	 */
	@Override
	public List<TourismBonaAttractionSignInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism bona attraction sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction sign infos
	 * @param end the upper bound of the range of tourism bona attraction sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona attraction sign infos
	 */
	@Override
	public List<TourismBonaAttractionSignInfo> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAttractionSignInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism bona attraction sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction sign infos
	 * @param end the upper bound of the range of tourism bona attraction sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona attraction sign infos
	 */
	@Override
	public List<TourismBonaAttractionSignInfo> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAttractionSignInfo> orderByComparator,
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

		List<TourismBonaAttractionSignInfo> list = null;

		if (useFinderCache) {
			list = (List<TourismBonaAttractionSignInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMBONAATTRACTIONSIGNINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMBONAATTRACTIONSIGNINFO;

				sql = sql.concat(
					TourismBonaAttractionSignInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismBonaAttractionSignInfo>)QueryUtil.list(
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
	 * Removes all the tourism bona attraction sign infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo :
				findAll()) {

			remove(tourismBonaAttractionSignInfo);
		}
	}

	/**
	 * Returns the number of tourism bona attraction sign infos.
	 *
	 * @return the number of tourism bona attraction sign infos
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
					_SQL_COUNT_TOURISMBONAATTRACTIONSIGNINFO);

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
		return "tourismBonAttrSignId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMBONAATTRACTIONSIGNINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismBonaAttractionSignInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism bona attraction sign info persistence.
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

		TourismBonaAttractionSignInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismBonaAttractionSignInfoUtil.setPersistence(null);

		entityCache.removeCache(
			TourismBonaAttractionSignInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_TOURISMBONAATTRACTIONSIGNINFO =
		"SELECT tourismBonaAttractionSignInfo FROM TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo";

	private static final String
		_SQL_SELECT_TOURISMBONAATTRACTIONSIGNINFO_WHERE =
			"SELECT tourismBonaAttractionSignInfo FROM TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo WHERE ";

	private static final String _SQL_COUNT_TOURISMBONAATTRACTIONSIGNINFO =
		"SELECT COUNT(tourismBonaAttractionSignInfo) FROM TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo";

	private static final String _SQL_COUNT_TOURISMBONAATTRACTIONSIGNINFO_WHERE =
		"SELECT COUNT(tourismBonaAttractionSignInfo) FROM TourismBonaAttractionSignInfo tourismBonaAttractionSignInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismBonaAttractionSignInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismBonaAttractionSignInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismBonaAttractionSignInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismBonaAttractionSignInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}