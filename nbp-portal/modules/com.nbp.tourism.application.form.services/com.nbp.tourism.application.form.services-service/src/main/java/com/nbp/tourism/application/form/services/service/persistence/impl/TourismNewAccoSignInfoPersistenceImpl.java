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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAccoSignInfoException;
import com.nbp.tourism.application.form.services.model.TourismNewAccoSignInfo;
import com.nbp.tourism.application.form.services.model.TourismNewAccoSignInfoTable;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAccoSignInfoImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAccoSignInfoModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAccoSignInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAccoSignInfoUtil;
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
 * The persistence implementation for the tourism new acco sign info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismNewAccoSignInfoPersistence.class)
public class TourismNewAccoSignInfoPersistenceImpl
	extends BasePersistenceImpl<TourismNewAccoSignInfo>
	implements TourismNewAccoSignInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismNewAccoSignInfoUtil</code> to access the tourism new acco sign info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismNewAccoSignInfoImpl.class.getName();

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
	 * Returns the tourism new acco sign info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAccoSignInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new acco sign info
	 * @throws NoSuchTourismNewAccoSignInfoException if a matching tourism new acco sign info could not be found
	 */
	@Override
	public TourismNewAccoSignInfo findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccoSignInfoException {

		TourismNewAccoSignInfo tourismNewAccoSignInfo = fetchBygetTourismById(
			tourismApplicationId);

		if (tourismNewAccoSignInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismNewAccoSignInfoException(sb.toString());
		}

		return tourismNewAccoSignInfo;
	}

	/**
	 * Returns the tourism new acco sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new acco sign info, or <code>null</code> if a matching tourism new acco sign info could not be found
	 */
	@Override
	public TourismNewAccoSignInfo fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism new acco sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new acco sign info, or <code>null</code> if a matching tourism new acco sign info could not be found
	 */
	@Override
	public TourismNewAccoSignInfo fetchBygetTourismById(
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

		if (result instanceof TourismNewAccoSignInfo) {
			TourismNewAccoSignInfo tourismNewAccoSignInfo =
				(TourismNewAccoSignInfo)result;

			if (tourismApplicationId !=
					tourismNewAccoSignInfo.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMNEWACCOSIGNINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismNewAccoSignInfo> list = query.list();

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
								"TourismNewAccoSignInfoPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismNewAccoSignInfo tourismNewAccoSignInfo = list.get(0);

					result = tourismNewAccoSignInfo;

					cacheResult(tourismNewAccoSignInfo);
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
			return (TourismNewAccoSignInfo)result;
		}
	}

	/**
	 * Removes the tourism new acco sign info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new acco sign info that was removed
	 */
	@Override
	public TourismNewAccoSignInfo removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccoSignInfoException {

		TourismNewAccoSignInfo tourismNewAccoSignInfo = findBygetTourismById(
			tourismApplicationId);

		return remove(tourismNewAccoSignInfo);
	}

	/**
	 * Returns the number of tourism new acco sign infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new acco sign infos
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMNEWACCOSIGNINFO_WHERE);

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
			"tourismNewAccoSignInfo.tourismApplicationId = ?";

	public TourismNewAccoSignInfoPersistenceImpl() {
		setModelClass(TourismNewAccoSignInfo.class);

		setModelImplClass(TourismNewAccoSignInfoImpl.class);
		setModelPKClass(long.class);

		setTable(TourismNewAccoSignInfoTable.INSTANCE);
	}

	/**
	 * Caches the tourism new acco sign info in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccoSignInfo the tourism new acco sign info
	 */
	@Override
	public void cacheResult(TourismNewAccoSignInfo tourismNewAccoSignInfo) {
		entityCache.putResult(
			TourismNewAccoSignInfoImpl.class,
			tourismNewAccoSignInfo.getPrimaryKey(), tourismNewAccoSignInfo);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {tourismNewAccoSignInfo.getTourismApplicationId()},
			tourismNewAccoSignInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism new acco sign infos in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccoSignInfos the tourism new acco sign infos
	 */
	@Override
	public void cacheResult(
		List<TourismNewAccoSignInfo> tourismNewAccoSignInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismNewAccoSignInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismNewAccoSignInfo tourismNewAccoSignInfo :
				tourismNewAccoSignInfos) {

			if (entityCache.getResult(
					TourismNewAccoSignInfoImpl.class,
					tourismNewAccoSignInfo.getPrimaryKey()) == null) {

				cacheResult(tourismNewAccoSignInfo);
			}
		}
	}

	/**
	 * Clears the cache for all tourism new acco sign infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismNewAccoSignInfoImpl.class);

		finderCache.clearCache(TourismNewAccoSignInfoImpl.class);
	}

	/**
	 * Clears the cache for the tourism new acco sign info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TourismNewAccoSignInfo tourismNewAccoSignInfo) {
		entityCache.removeResult(
			TourismNewAccoSignInfoImpl.class, tourismNewAccoSignInfo);
	}

	@Override
	public void clearCache(
		List<TourismNewAccoSignInfo> tourismNewAccoSignInfos) {

		for (TourismNewAccoSignInfo tourismNewAccoSignInfo :
				tourismNewAccoSignInfos) {

			entityCache.removeResult(
				TourismNewAccoSignInfoImpl.class, tourismNewAccoSignInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismNewAccoSignInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismNewAccoSignInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismNewAccoSignInfoModelImpl tourismNewAccoSignInfoModelImpl) {

		Object[] args = new Object[] {
			tourismNewAccoSignInfoModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismNewAccoSignInfoModelImpl);
	}

	/**
	 * Creates a new tourism new acco sign info with the primary key. Does not add the tourism new acco sign info to the database.
	 *
	 * @param tourismNewAccoSignInfoId the primary key for the new tourism new acco sign info
	 * @return the new tourism new acco sign info
	 */
	@Override
	public TourismNewAccoSignInfo create(long tourismNewAccoSignInfoId) {
		TourismNewAccoSignInfo tourismNewAccoSignInfo =
			new TourismNewAccoSignInfoImpl();

		tourismNewAccoSignInfo.setNew(true);
		tourismNewAccoSignInfo.setPrimaryKey(tourismNewAccoSignInfoId);

		tourismNewAccoSignInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return tourismNewAccoSignInfo;
	}

	/**
	 * Removes the tourism new acco sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAccoSignInfoId the primary key of the tourism new acco sign info
	 * @return the tourism new acco sign info that was removed
	 * @throws NoSuchTourismNewAccoSignInfoException if a tourism new acco sign info with the primary key could not be found
	 */
	@Override
	public TourismNewAccoSignInfo remove(long tourismNewAccoSignInfoId)
		throws NoSuchTourismNewAccoSignInfoException {

		return remove((Serializable)tourismNewAccoSignInfoId);
	}

	/**
	 * Removes the tourism new acco sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism new acco sign info
	 * @return the tourism new acco sign info that was removed
	 * @throws NoSuchTourismNewAccoSignInfoException if a tourism new acco sign info with the primary key could not be found
	 */
	@Override
	public TourismNewAccoSignInfo remove(Serializable primaryKey)
		throws NoSuchTourismNewAccoSignInfoException {

		Session session = null;

		try {
			session = openSession();

			TourismNewAccoSignInfo tourismNewAccoSignInfo =
				(TourismNewAccoSignInfo)session.get(
					TourismNewAccoSignInfoImpl.class, primaryKey);

			if (tourismNewAccoSignInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismNewAccoSignInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismNewAccoSignInfo);
		}
		catch (NoSuchTourismNewAccoSignInfoException noSuchEntityException) {
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
	protected TourismNewAccoSignInfo removeImpl(
		TourismNewAccoSignInfo tourismNewAccoSignInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismNewAccoSignInfo)) {
				tourismNewAccoSignInfo = (TourismNewAccoSignInfo)session.get(
					TourismNewAccoSignInfoImpl.class,
					tourismNewAccoSignInfo.getPrimaryKeyObj());
			}

			if (tourismNewAccoSignInfo != null) {
				session.delete(tourismNewAccoSignInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismNewAccoSignInfo != null) {
			clearCache(tourismNewAccoSignInfo);
		}

		return tourismNewAccoSignInfo;
	}

	@Override
	public TourismNewAccoSignInfo updateImpl(
		TourismNewAccoSignInfo tourismNewAccoSignInfo) {

		boolean isNew = tourismNewAccoSignInfo.isNew();

		if (!(tourismNewAccoSignInfo instanceof
				TourismNewAccoSignInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tourismNewAccoSignInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismNewAccoSignInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismNewAccoSignInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismNewAccoSignInfo implementation " +
					tourismNewAccoSignInfo.getClass());
		}

		TourismNewAccoSignInfoModelImpl tourismNewAccoSignInfoModelImpl =
			(TourismNewAccoSignInfoModelImpl)tourismNewAccoSignInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismNewAccoSignInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismNewAccoSignInfo.setCreateDate(date);
			}
			else {
				tourismNewAccoSignInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismNewAccoSignInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismNewAccoSignInfo.setModifiedDate(date);
			}
			else {
				tourismNewAccoSignInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismNewAccoSignInfo);
			}
			else {
				tourismNewAccoSignInfo = (TourismNewAccoSignInfo)session.merge(
					tourismNewAccoSignInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismNewAccoSignInfoImpl.class, tourismNewAccoSignInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(tourismNewAccoSignInfoModelImpl);

		if (isNew) {
			tourismNewAccoSignInfo.setNew(false);
		}

		tourismNewAccoSignInfo.resetOriginalValues();

		return tourismNewAccoSignInfo;
	}

	/**
	 * Returns the tourism new acco sign info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism new acco sign info
	 * @return the tourism new acco sign info
	 * @throws NoSuchTourismNewAccoSignInfoException if a tourism new acco sign info with the primary key could not be found
	 */
	@Override
	public TourismNewAccoSignInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTourismNewAccoSignInfoException {

		TourismNewAccoSignInfo tourismNewAccoSignInfo = fetchByPrimaryKey(
			primaryKey);

		if (tourismNewAccoSignInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismNewAccoSignInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismNewAccoSignInfo;
	}

	/**
	 * Returns the tourism new acco sign info with the primary key or throws a <code>NoSuchTourismNewAccoSignInfoException</code> if it could not be found.
	 *
	 * @param tourismNewAccoSignInfoId the primary key of the tourism new acco sign info
	 * @return the tourism new acco sign info
	 * @throws NoSuchTourismNewAccoSignInfoException if a tourism new acco sign info with the primary key could not be found
	 */
	@Override
	public TourismNewAccoSignInfo findByPrimaryKey(
			long tourismNewAccoSignInfoId)
		throws NoSuchTourismNewAccoSignInfoException {

		return findByPrimaryKey((Serializable)tourismNewAccoSignInfoId);
	}

	/**
	 * Returns the tourism new acco sign info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAccoSignInfoId the primary key of the tourism new acco sign info
	 * @return the tourism new acco sign info, or <code>null</code> if a tourism new acco sign info with the primary key could not be found
	 */
	@Override
	public TourismNewAccoSignInfo fetchByPrimaryKey(
		long tourismNewAccoSignInfoId) {

		return fetchByPrimaryKey((Serializable)tourismNewAccoSignInfoId);
	}

	/**
	 * Returns all the tourism new acco sign infos.
	 *
	 * @return the tourism new acco sign infos
	 */
	@Override
	public List<TourismNewAccoSignInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism new acco sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco sign infos
	 * @param end the upper bound of the range of tourism new acco sign infos (not inclusive)
	 * @return the range of tourism new acco sign infos
	 */
	@Override
	public List<TourismNewAccoSignInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism new acco sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco sign infos
	 * @param end the upper bound of the range of tourism new acco sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new acco sign infos
	 */
	@Override
	public List<TourismNewAccoSignInfo> findAll(
		int start, int end,
		OrderByComparator<TourismNewAccoSignInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism new acco sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco sign infos
	 * @param end the upper bound of the range of tourism new acco sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new acco sign infos
	 */
	@Override
	public List<TourismNewAccoSignInfo> findAll(
		int start, int end,
		OrderByComparator<TourismNewAccoSignInfo> orderByComparator,
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

		List<TourismNewAccoSignInfo> list = null;

		if (useFinderCache) {
			list = (List<TourismNewAccoSignInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMNEWACCOSIGNINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMNEWACCOSIGNINFO;

				sql = sql.concat(TourismNewAccoSignInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismNewAccoSignInfo>)QueryUtil.list(
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
	 * Removes all the tourism new acco sign infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismNewAccoSignInfo tourismNewAccoSignInfo : findAll()) {
			remove(tourismNewAccoSignInfo);
		}
	}

	/**
	 * Returns the number of tourism new acco sign infos.
	 *
	 * @return the number of tourism new acco sign infos
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
					_SQL_COUNT_TOURISMNEWACCOSIGNINFO);

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
		return "tourismNewAccoSignInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMNEWACCOSIGNINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismNewAccoSignInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism new acco sign info persistence.
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

		TourismNewAccoSignInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismNewAccoSignInfoUtil.setPersistence(null);

		entityCache.removeCache(TourismNewAccoSignInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_TOURISMNEWACCOSIGNINFO =
		"SELECT tourismNewAccoSignInfo FROM TourismNewAccoSignInfo tourismNewAccoSignInfo";

	private static final String _SQL_SELECT_TOURISMNEWACCOSIGNINFO_WHERE =
		"SELECT tourismNewAccoSignInfo FROM TourismNewAccoSignInfo tourismNewAccoSignInfo WHERE ";

	private static final String _SQL_COUNT_TOURISMNEWACCOSIGNINFO =
		"SELECT COUNT(tourismNewAccoSignInfo) FROM TourismNewAccoSignInfo tourismNewAccoSignInfo";

	private static final String _SQL_COUNT_TOURISMNEWACCOSIGNINFO_WHERE =
		"SELECT COUNT(tourismNewAccoSignInfo) FROM TourismNewAccoSignInfo tourismNewAccoSignInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismNewAccoSignInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismNewAccoSignInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismNewAccoSignInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismNewAccoSignInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}