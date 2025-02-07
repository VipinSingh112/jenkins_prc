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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAttractionSignInfoException;
import com.nbp.tourism.application.form.services.model.TourismNewAttractionSignInfo;
import com.nbp.tourism.application.form.services.model.TourismNewAttractionSignInfoTable;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionSignInfoImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionSignInfoModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAttractionSignInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAttractionSignInfoUtil;
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
 * The persistence implementation for the tourism new attraction sign info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismNewAttractionSignInfoPersistence.class)
public class TourismNewAttractionSignInfoPersistenceImpl
	extends BasePersistenceImpl<TourismNewAttractionSignInfo>
	implements TourismNewAttractionSignInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismNewAttractionSignInfoUtil</code> to access the tourism new attraction sign info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismNewAttractionSignInfoImpl.class.getName();

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
	 * Returns the tourism new attraction sign info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAttractionSignInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction sign info
	 * @throws NoSuchTourismNewAttractionSignInfoException if a matching tourism new attraction sign info could not be found
	 */
	@Override
	public TourismNewAttractionSignInfo findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAttractionSignInfoException {

		TourismNewAttractionSignInfo tourismNewAttractionSignInfo =
			fetchBygetTourismById(tourismApplicationId);

		if (tourismNewAttractionSignInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismNewAttractionSignInfoException(
				sb.toString());
		}

		return tourismNewAttractionSignInfo;
	}

	/**
	 * Returns the tourism new attraction sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction sign info, or <code>null</code> if a matching tourism new attraction sign info could not be found
	 */
	@Override
	public TourismNewAttractionSignInfo fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism new attraction sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new attraction sign info, or <code>null</code> if a matching tourism new attraction sign info could not be found
	 */
	@Override
	public TourismNewAttractionSignInfo fetchBygetTourismById(
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

		if (result instanceof TourismNewAttractionSignInfo) {
			TourismNewAttractionSignInfo tourismNewAttractionSignInfo =
				(TourismNewAttractionSignInfo)result;

			if (tourismApplicationId !=
					tourismNewAttractionSignInfo.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMNEWATTRACTIONSIGNINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismNewAttractionSignInfo> list = query.list();

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
								"TourismNewAttractionSignInfoPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismNewAttractionSignInfo tourismNewAttractionSignInfo =
						list.get(0);

					result = tourismNewAttractionSignInfo;

					cacheResult(tourismNewAttractionSignInfo);
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
			return (TourismNewAttractionSignInfo)result;
		}
	}

	/**
	 * Removes the tourism new attraction sign info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new attraction sign info that was removed
	 */
	@Override
	public TourismNewAttractionSignInfo removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAttractionSignInfoException {

		TourismNewAttractionSignInfo tourismNewAttractionSignInfo =
			findBygetTourismById(tourismApplicationId);

		return remove(tourismNewAttractionSignInfo);
	}

	/**
	 * Returns the number of tourism new attraction sign infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new attraction sign infos
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMNEWATTRACTIONSIGNINFO_WHERE);

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
			"tourismNewAttractionSignInfo.tourismApplicationId = ?";

	public TourismNewAttractionSignInfoPersistenceImpl() {
		setModelClass(TourismNewAttractionSignInfo.class);

		setModelImplClass(TourismNewAttractionSignInfoImpl.class);
		setModelPKClass(long.class);

		setTable(TourismNewAttractionSignInfoTable.INSTANCE);
	}

	/**
	 * Caches the tourism new attraction sign info in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionSignInfo the tourism new attraction sign info
	 */
	@Override
	public void cacheResult(
		TourismNewAttractionSignInfo tourismNewAttractionSignInfo) {

		entityCache.putResult(
			TourismNewAttractionSignInfoImpl.class,
			tourismNewAttractionSignInfo.getPrimaryKey(),
			tourismNewAttractionSignInfo);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {
				tourismNewAttractionSignInfo.getTourismApplicationId()
			},
			tourismNewAttractionSignInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism new attraction sign infos in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionSignInfos the tourism new attraction sign infos
	 */
	@Override
	public void cacheResult(
		List<TourismNewAttractionSignInfo> tourismNewAttractionSignInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismNewAttractionSignInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismNewAttractionSignInfo tourismNewAttractionSignInfo :
				tourismNewAttractionSignInfos) {

			if (entityCache.getResult(
					TourismNewAttractionSignInfoImpl.class,
					tourismNewAttractionSignInfo.getPrimaryKey()) == null) {

				cacheResult(tourismNewAttractionSignInfo);
			}
		}
	}

	/**
	 * Clears the cache for all tourism new attraction sign infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismNewAttractionSignInfoImpl.class);

		finderCache.clearCache(TourismNewAttractionSignInfoImpl.class);
	}

	/**
	 * Clears the cache for the tourism new attraction sign info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismNewAttractionSignInfo tourismNewAttractionSignInfo) {

		entityCache.removeResult(
			TourismNewAttractionSignInfoImpl.class,
			tourismNewAttractionSignInfo);
	}

	@Override
	public void clearCache(
		List<TourismNewAttractionSignInfo> tourismNewAttractionSignInfos) {

		for (TourismNewAttractionSignInfo tourismNewAttractionSignInfo :
				tourismNewAttractionSignInfos) {

			entityCache.removeResult(
				TourismNewAttractionSignInfoImpl.class,
				tourismNewAttractionSignInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismNewAttractionSignInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismNewAttractionSignInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismNewAttractionSignInfoModelImpl
			tourismNewAttractionSignInfoModelImpl) {

		Object[] args = new Object[] {
			tourismNewAttractionSignInfoModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismNewAttractionSignInfoModelImpl);
	}

	/**
	 * Creates a new tourism new attraction sign info with the primary key. Does not add the tourism new attraction sign info to the database.
	 *
	 * @param tourismNewAttraSignInfoId the primary key for the new tourism new attraction sign info
	 * @return the new tourism new attraction sign info
	 */
	@Override
	public TourismNewAttractionSignInfo create(long tourismNewAttraSignInfoId) {
		TourismNewAttractionSignInfo tourismNewAttractionSignInfo =
			new TourismNewAttractionSignInfoImpl();

		tourismNewAttractionSignInfo.setNew(true);
		tourismNewAttractionSignInfo.setPrimaryKey(tourismNewAttraSignInfoId);

		tourismNewAttractionSignInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismNewAttractionSignInfo;
	}

	/**
	 * Removes the tourism new attraction sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAttraSignInfoId the primary key of the tourism new attraction sign info
	 * @return the tourism new attraction sign info that was removed
	 * @throws NoSuchTourismNewAttractionSignInfoException if a tourism new attraction sign info with the primary key could not be found
	 */
	@Override
	public TourismNewAttractionSignInfo remove(long tourismNewAttraSignInfoId)
		throws NoSuchTourismNewAttractionSignInfoException {

		return remove((Serializable)tourismNewAttraSignInfoId);
	}

	/**
	 * Removes the tourism new attraction sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism new attraction sign info
	 * @return the tourism new attraction sign info that was removed
	 * @throws NoSuchTourismNewAttractionSignInfoException if a tourism new attraction sign info with the primary key could not be found
	 */
	@Override
	public TourismNewAttractionSignInfo remove(Serializable primaryKey)
		throws NoSuchTourismNewAttractionSignInfoException {

		Session session = null;

		try {
			session = openSession();

			TourismNewAttractionSignInfo tourismNewAttractionSignInfo =
				(TourismNewAttractionSignInfo)session.get(
					TourismNewAttractionSignInfoImpl.class, primaryKey);

			if (tourismNewAttractionSignInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismNewAttractionSignInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismNewAttractionSignInfo);
		}
		catch (NoSuchTourismNewAttractionSignInfoException
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
	protected TourismNewAttractionSignInfo removeImpl(
		TourismNewAttractionSignInfo tourismNewAttractionSignInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismNewAttractionSignInfo)) {
				tourismNewAttractionSignInfo =
					(TourismNewAttractionSignInfo)session.get(
						TourismNewAttractionSignInfoImpl.class,
						tourismNewAttractionSignInfo.getPrimaryKeyObj());
			}

			if (tourismNewAttractionSignInfo != null) {
				session.delete(tourismNewAttractionSignInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismNewAttractionSignInfo != null) {
			clearCache(tourismNewAttractionSignInfo);
		}

		return tourismNewAttractionSignInfo;
	}

	@Override
	public TourismNewAttractionSignInfo updateImpl(
		TourismNewAttractionSignInfo tourismNewAttractionSignInfo) {

		boolean isNew = tourismNewAttractionSignInfo.isNew();

		if (!(tourismNewAttractionSignInfo instanceof
				TourismNewAttractionSignInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					tourismNewAttractionSignInfo.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismNewAttractionSignInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismNewAttractionSignInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismNewAttractionSignInfo implementation " +
					tourismNewAttractionSignInfo.getClass());
		}

		TourismNewAttractionSignInfoModelImpl
			tourismNewAttractionSignInfoModelImpl =
				(TourismNewAttractionSignInfoModelImpl)
					tourismNewAttractionSignInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismNewAttractionSignInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismNewAttractionSignInfo.setCreateDate(date);
			}
			else {
				tourismNewAttractionSignInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismNewAttractionSignInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismNewAttractionSignInfo.setModifiedDate(date);
			}
			else {
				tourismNewAttractionSignInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismNewAttractionSignInfo);
			}
			else {
				tourismNewAttractionSignInfo =
					(TourismNewAttractionSignInfo)session.merge(
						tourismNewAttractionSignInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismNewAttractionSignInfoImpl.class,
			tourismNewAttractionSignInfoModelImpl, false, true);

		cacheUniqueFindersCache(tourismNewAttractionSignInfoModelImpl);

		if (isNew) {
			tourismNewAttractionSignInfo.setNew(false);
		}

		tourismNewAttractionSignInfo.resetOriginalValues();

		return tourismNewAttractionSignInfo;
	}

	/**
	 * Returns the tourism new attraction sign info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism new attraction sign info
	 * @return the tourism new attraction sign info
	 * @throws NoSuchTourismNewAttractionSignInfoException if a tourism new attraction sign info with the primary key could not be found
	 */
	@Override
	public TourismNewAttractionSignInfo findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchTourismNewAttractionSignInfoException {

		TourismNewAttractionSignInfo tourismNewAttractionSignInfo =
			fetchByPrimaryKey(primaryKey);

		if (tourismNewAttractionSignInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismNewAttractionSignInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismNewAttractionSignInfo;
	}

	/**
	 * Returns the tourism new attraction sign info with the primary key or throws a <code>NoSuchTourismNewAttractionSignInfoException</code> if it could not be found.
	 *
	 * @param tourismNewAttraSignInfoId the primary key of the tourism new attraction sign info
	 * @return the tourism new attraction sign info
	 * @throws NoSuchTourismNewAttractionSignInfoException if a tourism new attraction sign info with the primary key could not be found
	 */
	@Override
	public TourismNewAttractionSignInfo findByPrimaryKey(
			long tourismNewAttraSignInfoId)
		throws NoSuchTourismNewAttractionSignInfoException {

		return findByPrimaryKey((Serializable)tourismNewAttraSignInfoId);
	}

	/**
	 * Returns the tourism new attraction sign info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAttraSignInfoId the primary key of the tourism new attraction sign info
	 * @return the tourism new attraction sign info, or <code>null</code> if a tourism new attraction sign info with the primary key could not be found
	 */
	@Override
	public TourismNewAttractionSignInfo fetchByPrimaryKey(
		long tourismNewAttraSignInfoId) {

		return fetchByPrimaryKey((Serializable)tourismNewAttraSignInfoId);
	}

	/**
	 * Returns all the tourism new attraction sign infos.
	 *
	 * @return the tourism new attraction sign infos
	 */
	@Override
	public List<TourismNewAttractionSignInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism new attraction sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction sign infos
	 * @param end the upper bound of the range of tourism new attraction sign infos (not inclusive)
	 * @return the range of tourism new attraction sign infos
	 */
	@Override
	public List<TourismNewAttractionSignInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism new attraction sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction sign infos
	 * @param end the upper bound of the range of tourism new attraction sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new attraction sign infos
	 */
	@Override
	public List<TourismNewAttractionSignInfo> findAll(
		int start, int end,
		OrderByComparator<TourismNewAttractionSignInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism new attraction sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction sign infos
	 * @param end the upper bound of the range of tourism new attraction sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new attraction sign infos
	 */
	@Override
	public List<TourismNewAttractionSignInfo> findAll(
		int start, int end,
		OrderByComparator<TourismNewAttractionSignInfo> orderByComparator,
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

		List<TourismNewAttractionSignInfo> list = null;

		if (useFinderCache) {
			list = (List<TourismNewAttractionSignInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMNEWATTRACTIONSIGNINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMNEWATTRACTIONSIGNINFO;

				sql = sql.concat(
					TourismNewAttractionSignInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismNewAttractionSignInfo>)QueryUtil.list(
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
	 * Removes all the tourism new attraction sign infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismNewAttractionSignInfo tourismNewAttractionSignInfo :
				findAll()) {

			remove(tourismNewAttractionSignInfo);
		}
	}

	/**
	 * Returns the number of tourism new attraction sign infos.
	 *
	 * @return the number of tourism new attraction sign infos
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
					_SQL_COUNT_TOURISMNEWATTRACTIONSIGNINFO);

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
		return "tourismNewAttraSignInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMNEWATTRACTIONSIGNINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismNewAttractionSignInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism new attraction sign info persistence.
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

		TourismNewAttractionSignInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismNewAttractionSignInfoUtil.setPersistence(null);

		entityCache.removeCache(
			TourismNewAttractionSignInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_TOURISMNEWATTRACTIONSIGNINFO =
		"SELECT tourismNewAttractionSignInfo FROM TourismNewAttractionSignInfo tourismNewAttractionSignInfo";

	private static final String _SQL_SELECT_TOURISMNEWATTRACTIONSIGNINFO_WHERE =
		"SELECT tourismNewAttractionSignInfo FROM TourismNewAttractionSignInfo tourismNewAttractionSignInfo WHERE ";

	private static final String _SQL_COUNT_TOURISMNEWATTRACTIONSIGNINFO =
		"SELECT COUNT(tourismNewAttractionSignInfo) FROM TourismNewAttractionSignInfo tourismNewAttractionSignInfo";

	private static final String _SQL_COUNT_TOURISMNEWATTRACTIONSIGNINFO_WHERE =
		"SELECT COUNT(tourismNewAttractionSignInfo) FROM TourismNewAttractionSignInfo tourismNewAttractionSignInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismNewAttractionSignInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismNewAttractionSignInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismNewAttractionSignInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismNewAttractionSignInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}