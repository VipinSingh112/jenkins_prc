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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaAccoSignInfoException;
import com.nbp.tourism.application.form.services.model.TourismBonaAccoSignInfo;
import com.nbp.tourism.application.form.services.model.TourismBonaAccoSignInfoTable;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaAccoSignInfoImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaAccoSignInfoModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAccoSignInfoPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAccoSignInfoUtil;
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
 * The persistence implementation for the tourism bona acco sign info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismBonaAccoSignInfoPersistence.class)
public class TourismBonaAccoSignInfoPersistenceImpl
	extends BasePersistenceImpl<TourismBonaAccoSignInfo>
	implements TourismBonaAccoSignInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismBonaAccoSignInfoUtil</code> to access the tourism bona acco sign info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismBonaAccoSignInfoImpl.class.getName();

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
	 * Returns the tourism bona acco sign info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAccoSignInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona acco sign info
	 * @throws NoSuchTourismBonaAccoSignInfoException if a matching tourism bona acco sign info could not be found
	 */
	@Override
	public TourismBonaAccoSignInfo findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAccoSignInfoException {

		TourismBonaAccoSignInfo tourismBonaAccoSignInfo = fetchBygetTourismById(
			tourismApplicationId);

		if (tourismBonaAccoSignInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismBonaAccoSignInfoException(sb.toString());
		}

		return tourismBonaAccoSignInfo;
	}

	/**
	 * Returns the tourism bona acco sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona acco sign info, or <code>null</code> if a matching tourism bona acco sign info could not be found
	 */
	@Override
	public TourismBonaAccoSignInfo fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism bona acco sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona acco sign info, or <code>null</code> if a matching tourism bona acco sign info could not be found
	 */
	@Override
	public TourismBonaAccoSignInfo fetchBygetTourismById(
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

		if (result instanceof TourismBonaAccoSignInfo) {
			TourismBonaAccoSignInfo tourismBonaAccoSignInfo =
				(TourismBonaAccoSignInfo)result;

			if (tourismApplicationId !=
					tourismBonaAccoSignInfo.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMBONAACCOSIGNINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismBonaAccoSignInfo> list = query.list();

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
								"TourismBonaAccoSignInfoPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismBonaAccoSignInfo tourismBonaAccoSignInfo = list.get(
						0);

					result = tourismBonaAccoSignInfo;

					cacheResult(tourismBonaAccoSignInfo);
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
			return (TourismBonaAccoSignInfo)result;
		}
	}

	/**
	 * Removes the tourism bona acco sign info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona acco sign info that was removed
	 */
	@Override
	public TourismBonaAccoSignInfo removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAccoSignInfoException {

		TourismBonaAccoSignInfo tourismBonaAccoSignInfo = findBygetTourismById(
			tourismApplicationId);

		return remove(tourismBonaAccoSignInfo);
	}

	/**
	 * Returns the number of tourism bona acco sign infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona acco sign infos
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMBONAACCOSIGNINFO_WHERE);

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
			"tourismBonaAccoSignInfo.tourismApplicationId = ?";

	public TourismBonaAccoSignInfoPersistenceImpl() {
		setModelClass(TourismBonaAccoSignInfo.class);

		setModelImplClass(TourismBonaAccoSignInfoImpl.class);
		setModelPKClass(long.class);

		setTable(TourismBonaAccoSignInfoTable.INSTANCE);
	}

	/**
	 * Caches the tourism bona acco sign info in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccoSignInfo the tourism bona acco sign info
	 */
	@Override
	public void cacheResult(TourismBonaAccoSignInfo tourismBonaAccoSignInfo) {
		entityCache.putResult(
			TourismBonaAccoSignInfoImpl.class,
			tourismBonaAccoSignInfo.getPrimaryKey(), tourismBonaAccoSignInfo);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {tourismBonaAccoSignInfo.getTourismApplicationId()},
			tourismBonaAccoSignInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism bona acco sign infos in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccoSignInfos the tourism bona acco sign infos
	 */
	@Override
	public void cacheResult(
		List<TourismBonaAccoSignInfo> tourismBonaAccoSignInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismBonaAccoSignInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismBonaAccoSignInfo tourismBonaAccoSignInfo :
				tourismBonaAccoSignInfos) {

			if (entityCache.getResult(
					TourismBonaAccoSignInfoImpl.class,
					tourismBonaAccoSignInfo.getPrimaryKey()) == null) {

				cacheResult(tourismBonaAccoSignInfo);
			}
		}
	}

	/**
	 * Clears the cache for all tourism bona acco sign infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismBonaAccoSignInfoImpl.class);

		finderCache.clearCache(TourismBonaAccoSignInfoImpl.class);
	}

	/**
	 * Clears the cache for the tourism bona acco sign info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TourismBonaAccoSignInfo tourismBonaAccoSignInfo) {
		entityCache.removeResult(
			TourismBonaAccoSignInfoImpl.class, tourismBonaAccoSignInfo);
	}

	@Override
	public void clearCache(
		List<TourismBonaAccoSignInfo> tourismBonaAccoSignInfos) {

		for (TourismBonaAccoSignInfo tourismBonaAccoSignInfo :
				tourismBonaAccoSignInfos) {

			entityCache.removeResult(
				TourismBonaAccoSignInfoImpl.class, tourismBonaAccoSignInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismBonaAccoSignInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismBonaAccoSignInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismBonaAccoSignInfoModelImpl tourismBonaAccoSignInfoModelImpl) {

		Object[] args = new Object[] {
			tourismBonaAccoSignInfoModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismBonaAccoSignInfoModelImpl);
	}

	/**
	 * Creates a new tourism bona acco sign info with the primary key. Does not add the tourism bona acco sign info to the database.
	 *
	 * @param tourismBonaAccoSignId the primary key for the new tourism bona acco sign info
	 * @return the new tourism bona acco sign info
	 */
	@Override
	public TourismBonaAccoSignInfo create(long tourismBonaAccoSignId) {
		TourismBonaAccoSignInfo tourismBonaAccoSignInfo =
			new TourismBonaAccoSignInfoImpl();

		tourismBonaAccoSignInfo.setNew(true);
		tourismBonaAccoSignInfo.setPrimaryKey(tourismBonaAccoSignId);

		tourismBonaAccoSignInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return tourismBonaAccoSignInfo;
	}

	/**
	 * Removes the tourism bona acco sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaAccoSignId the primary key of the tourism bona acco sign info
	 * @return the tourism bona acco sign info that was removed
	 * @throws NoSuchTourismBonaAccoSignInfoException if a tourism bona acco sign info with the primary key could not be found
	 */
	@Override
	public TourismBonaAccoSignInfo remove(long tourismBonaAccoSignId)
		throws NoSuchTourismBonaAccoSignInfoException {

		return remove((Serializable)tourismBonaAccoSignId);
	}

	/**
	 * Removes the tourism bona acco sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism bona acco sign info
	 * @return the tourism bona acco sign info that was removed
	 * @throws NoSuchTourismBonaAccoSignInfoException if a tourism bona acco sign info with the primary key could not be found
	 */
	@Override
	public TourismBonaAccoSignInfo remove(Serializable primaryKey)
		throws NoSuchTourismBonaAccoSignInfoException {

		Session session = null;

		try {
			session = openSession();

			TourismBonaAccoSignInfo tourismBonaAccoSignInfo =
				(TourismBonaAccoSignInfo)session.get(
					TourismBonaAccoSignInfoImpl.class, primaryKey);

			if (tourismBonaAccoSignInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismBonaAccoSignInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismBonaAccoSignInfo);
		}
		catch (NoSuchTourismBonaAccoSignInfoException noSuchEntityException) {
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
	protected TourismBonaAccoSignInfo removeImpl(
		TourismBonaAccoSignInfo tourismBonaAccoSignInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismBonaAccoSignInfo)) {
				tourismBonaAccoSignInfo = (TourismBonaAccoSignInfo)session.get(
					TourismBonaAccoSignInfoImpl.class,
					tourismBonaAccoSignInfo.getPrimaryKeyObj());
			}

			if (tourismBonaAccoSignInfo != null) {
				session.delete(tourismBonaAccoSignInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismBonaAccoSignInfo != null) {
			clearCache(tourismBonaAccoSignInfo);
		}

		return tourismBonaAccoSignInfo;
	}

	@Override
	public TourismBonaAccoSignInfo updateImpl(
		TourismBonaAccoSignInfo tourismBonaAccoSignInfo) {

		boolean isNew = tourismBonaAccoSignInfo.isNew();

		if (!(tourismBonaAccoSignInfo instanceof
				TourismBonaAccoSignInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tourismBonaAccoSignInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismBonaAccoSignInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismBonaAccoSignInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismBonaAccoSignInfo implementation " +
					tourismBonaAccoSignInfo.getClass());
		}

		TourismBonaAccoSignInfoModelImpl tourismBonaAccoSignInfoModelImpl =
			(TourismBonaAccoSignInfoModelImpl)tourismBonaAccoSignInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismBonaAccoSignInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismBonaAccoSignInfo.setCreateDate(date);
			}
			else {
				tourismBonaAccoSignInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismBonaAccoSignInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismBonaAccoSignInfo.setModifiedDate(date);
			}
			else {
				tourismBonaAccoSignInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismBonaAccoSignInfo);
			}
			else {
				tourismBonaAccoSignInfo =
					(TourismBonaAccoSignInfo)session.merge(
						tourismBonaAccoSignInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismBonaAccoSignInfoImpl.class, tourismBonaAccoSignInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(tourismBonaAccoSignInfoModelImpl);

		if (isNew) {
			tourismBonaAccoSignInfo.setNew(false);
		}

		tourismBonaAccoSignInfo.resetOriginalValues();

		return tourismBonaAccoSignInfo;
	}

	/**
	 * Returns the tourism bona acco sign info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism bona acco sign info
	 * @return the tourism bona acco sign info
	 * @throws NoSuchTourismBonaAccoSignInfoException if a tourism bona acco sign info with the primary key could not be found
	 */
	@Override
	public TourismBonaAccoSignInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTourismBonaAccoSignInfoException {

		TourismBonaAccoSignInfo tourismBonaAccoSignInfo = fetchByPrimaryKey(
			primaryKey);

		if (tourismBonaAccoSignInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismBonaAccoSignInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismBonaAccoSignInfo;
	}

	/**
	 * Returns the tourism bona acco sign info with the primary key or throws a <code>NoSuchTourismBonaAccoSignInfoException</code> if it could not be found.
	 *
	 * @param tourismBonaAccoSignId the primary key of the tourism bona acco sign info
	 * @return the tourism bona acco sign info
	 * @throws NoSuchTourismBonaAccoSignInfoException if a tourism bona acco sign info with the primary key could not be found
	 */
	@Override
	public TourismBonaAccoSignInfo findByPrimaryKey(long tourismBonaAccoSignId)
		throws NoSuchTourismBonaAccoSignInfoException {

		return findByPrimaryKey((Serializable)tourismBonaAccoSignId);
	}

	/**
	 * Returns the tourism bona acco sign info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaAccoSignId the primary key of the tourism bona acco sign info
	 * @return the tourism bona acco sign info, or <code>null</code> if a tourism bona acco sign info with the primary key could not be found
	 */
	@Override
	public TourismBonaAccoSignInfo fetchByPrimaryKey(
		long tourismBonaAccoSignId) {

		return fetchByPrimaryKey((Serializable)tourismBonaAccoSignId);
	}

	/**
	 * Returns all the tourism bona acco sign infos.
	 *
	 * @return the tourism bona acco sign infos
	 */
	@Override
	public List<TourismBonaAccoSignInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism bona acco sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccoSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco sign infos
	 * @param end the upper bound of the range of tourism bona acco sign infos (not inclusive)
	 * @return the range of tourism bona acco sign infos
	 */
	@Override
	public List<TourismBonaAccoSignInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism bona acco sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccoSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco sign infos
	 * @param end the upper bound of the range of tourism bona acco sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona acco sign infos
	 */
	@Override
	public List<TourismBonaAccoSignInfo> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAccoSignInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism bona acco sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccoSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco sign infos
	 * @param end the upper bound of the range of tourism bona acco sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona acco sign infos
	 */
	@Override
	public List<TourismBonaAccoSignInfo> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAccoSignInfo> orderByComparator,
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

		List<TourismBonaAccoSignInfo> list = null;

		if (useFinderCache) {
			list = (List<TourismBonaAccoSignInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMBONAACCOSIGNINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMBONAACCOSIGNINFO;

				sql = sql.concat(
					TourismBonaAccoSignInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismBonaAccoSignInfo>)QueryUtil.list(
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
	 * Removes all the tourism bona acco sign infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismBonaAccoSignInfo tourismBonaAccoSignInfo : findAll()) {
			remove(tourismBonaAccoSignInfo);
		}
	}

	/**
	 * Returns the number of tourism bona acco sign infos.
	 *
	 * @return the number of tourism bona acco sign infos
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
					_SQL_COUNT_TOURISMBONAACCOSIGNINFO);

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
		return "tourismBonaAccoSignId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMBONAACCOSIGNINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismBonaAccoSignInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism bona acco sign info persistence.
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

		TourismBonaAccoSignInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismBonaAccoSignInfoUtil.setPersistence(null);

		entityCache.removeCache(TourismBonaAccoSignInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_TOURISMBONAACCOSIGNINFO =
		"SELECT tourismBonaAccoSignInfo FROM TourismBonaAccoSignInfo tourismBonaAccoSignInfo";

	private static final String _SQL_SELECT_TOURISMBONAACCOSIGNINFO_WHERE =
		"SELECT tourismBonaAccoSignInfo FROM TourismBonaAccoSignInfo tourismBonaAccoSignInfo WHERE ";

	private static final String _SQL_COUNT_TOURISMBONAACCOSIGNINFO =
		"SELECT COUNT(tourismBonaAccoSignInfo) FROM TourismBonaAccoSignInfo tourismBonaAccoSignInfo";

	private static final String _SQL_COUNT_TOURISMBONAACCOSIGNINFO_WHERE =
		"SELECT COUNT(tourismBonaAccoSignInfo) FROM TourismBonaAccoSignInfo tourismBonaAccoSignInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismBonaAccoSignInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismBonaAccoSignInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismBonaAccoSignInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismBonaAccoSignInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}