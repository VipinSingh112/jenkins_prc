/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence.impl;

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

import com.nbp.hsra.application.service.exception.NoSuchFitPropBusinessInfoException;
import com.nbp.hsra.application.service.model.FitPropBusinessInfo;
import com.nbp.hsra.application.service.model.FitPropBusinessInfoTable;
import com.nbp.hsra.application.service.model.impl.FitPropBusinessInfoImpl;
import com.nbp.hsra.application.service.model.impl.FitPropBusinessInfoModelImpl;
import com.nbp.hsra.application.service.service.persistence.FitPropBusinessInfoPersistence;
import com.nbp.hsra.application.service.service.persistence.FitPropBusinessInfoUtil;
import com.nbp.hsra.application.service.service.persistence.impl.constants.HSRA_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the fit prop business info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FitPropBusinessInfoPersistence.class)
public class FitPropBusinessInfoPersistenceImpl
	extends BasePersistenceImpl<FitPropBusinessInfo>
	implements FitPropBusinessInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FitPropBusinessInfoUtil</code> to access the fit prop business info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FitPropBusinessInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetHsraById;
	private FinderPath _finderPathCountBygetHsraById;

	/**
	 * Returns the fit prop business info where hsraApplicationId = &#63; or throws a <code>NoSuchFitPropBusinessInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching fit prop business info
	 * @throws NoSuchFitPropBusinessInfoException if a matching fit prop business info could not be found
	 */
	@Override
	public FitPropBusinessInfo findBygetHsraById(long hsraApplicationId)
		throws NoSuchFitPropBusinessInfoException {

		FitPropBusinessInfo fitPropBusinessInfo = fetchBygetHsraById(
			hsraApplicationId);

		if (fitPropBusinessInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFitPropBusinessInfoException(sb.toString());
		}

		return fitPropBusinessInfo;
	}

	/**
	 * Returns the fit prop business info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching fit prop business info, or <code>null</code> if a matching fit prop business info could not be found
	 */
	@Override
	public FitPropBusinessInfo fetchBygetHsraById(long hsraApplicationId) {
		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the fit prop business info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fit prop business info, or <code>null</code> if a matching fit prop business info could not be found
	 */
	@Override
	public FitPropBusinessInfo fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {hsraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHsraById, finderArgs, this);
		}

		if (result instanceof FitPropBusinessInfo) {
			FitPropBusinessInfo fitPropBusinessInfo =
				(FitPropBusinessInfo)result;

			if (hsraApplicationId !=
					fitPropBusinessInfo.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FITPROPBUSINESSINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<FitPropBusinessInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHsraById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {hsraApplicationId};
							}

							_log.warn(
								"FitPropBusinessInfoPersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FitPropBusinessInfo fitPropBusinessInfo = list.get(0);

					result = fitPropBusinessInfo;

					cacheResult(fitPropBusinessInfo);
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
			return (FitPropBusinessInfo)result;
		}
	}

	/**
	 * Removes the fit prop business info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the fit prop business info that was removed
	 */
	@Override
	public FitPropBusinessInfo removeBygetHsraById(long hsraApplicationId)
		throws NoSuchFitPropBusinessInfoException {

		FitPropBusinessInfo fitPropBusinessInfo = findBygetHsraById(
			hsraApplicationId);

		return remove(fitPropBusinessInfo);
	}

	/**
	 * Returns the number of fit prop business infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching fit prop business infos
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FITPROPBUSINESSINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

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

	private static final String _FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2 =
		"fitPropBusinessInfo.hsraApplicationId = ?";

	public FitPropBusinessInfoPersistenceImpl() {
		setModelClass(FitPropBusinessInfo.class);

		setModelImplClass(FitPropBusinessInfoImpl.class);
		setModelPKClass(long.class);

		setTable(FitPropBusinessInfoTable.INSTANCE);
	}

	/**
	 * Caches the fit prop business info in the entity cache if it is enabled.
	 *
	 * @param fitPropBusinessInfo the fit prop business info
	 */
	@Override
	public void cacheResult(FitPropBusinessInfo fitPropBusinessInfo) {
		entityCache.putResult(
			FitPropBusinessInfoImpl.class, fitPropBusinessInfo.getPrimaryKey(),
			fitPropBusinessInfo);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {fitPropBusinessInfo.getHsraApplicationId()},
			fitPropBusinessInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the fit prop business infos in the entity cache if it is enabled.
	 *
	 * @param fitPropBusinessInfos the fit prop business infos
	 */
	@Override
	public void cacheResult(List<FitPropBusinessInfo> fitPropBusinessInfos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fitPropBusinessInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FitPropBusinessInfo fitPropBusinessInfo : fitPropBusinessInfos) {
			if (entityCache.getResult(
					FitPropBusinessInfoImpl.class,
					fitPropBusinessInfo.getPrimaryKey()) == null) {

				cacheResult(fitPropBusinessInfo);
			}
		}
	}

	/**
	 * Clears the cache for all fit prop business infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FitPropBusinessInfoImpl.class);

		finderCache.clearCache(FitPropBusinessInfoImpl.class);
	}

	/**
	 * Clears the cache for the fit prop business info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FitPropBusinessInfo fitPropBusinessInfo) {
		entityCache.removeResult(
			FitPropBusinessInfoImpl.class, fitPropBusinessInfo);
	}

	@Override
	public void clearCache(List<FitPropBusinessInfo> fitPropBusinessInfos) {
		for (FitPropBusinessInfo fitPropBusinessInfo : fitPropBusinessInfos) {
			entityCache.removeResult(
				FitPropBusinessInfoImpl.class, fitPropBusinessInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FitPropBusinessInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(FitPropBusinessInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FitPropBusinessInfoModelImpl fitPropBusinessInfoModelImpl) {

		Object[] args = new Object[] {
			fitPropBusinessInfoModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args, fitPropBusinessInfoModelImpl);
	}

	/**
	 * Creates a new fit prop business info with the primary key. Does not add the fit prop business info to the database.
	 *
	 * @param fitPropBusinessInfoId the primary key for the new fit prop business info
	 * @return the new fit prop business info
	 */
	@Override
	public FitPropBusinessInfo create(long fitPropBusinessInfoId) {
		FitPropBusinessInfo fitPropBusinessInfo = new FitPropBusinessInfoImpl();

		fitPropBusinessInfo.setNew(true);
		fitPropBusinessInfo.setPrimaryKey(fitPropBusinessInfoId);

		fitPropBusinessInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return fitPropBusinessInfo;
	}

	/**
	 * Removes the fit prop business info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fitPropBusinessInfoId the primary key of the fit prop business info
	 * @return the fit prop business info that was removed
	 * @throws NoSuchFitPropBusinessInfoException if a fit prop business info with the primary key could not be found
	 */
	@Override
	public FitPropBusinessInfo remove(long fitPropBusinessInfoId)
		throws NoSuchFitPropBusinessInfoException {

		return remove((Serializable)fitPropBusinessInfoId);
	}

	/**
	 * Removes the fit prop business info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fit prop business info
	 * @return the fit prop business info that was removed
	 * @throws NoSuchFitPropBusinessInfoException if a fit prop business info with the primary key could not be found
	 */
	@Override
	public FitPropBusinessInfo remove(Serializable primaryKey)
		throws NoSuchFitPropBusinessInfoException {

		Session session = null;

		try {
			session = openSession();

			FitPropBusinessInfo fitPropBusinessInfo =
				(FitPropBusinessInfo)session.get(
					FitPropBusinessInfoImpl.class, primaryKey);

			if (fitPropBusinessInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFitPropBusinessInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(fitPropBusinessInfo);
		}
		catch (NoSuchFitPropBusinessInfoException noSuchEntityException) {
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
	protected FitPropBusinessInfo removeImpl(
		FitPropBusinessInfo fitPropBusinessInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fitPropBusinessInfo)) {
				fitPropBusinessInfo = (FitPropBusinessInfo)session.get(
					FitPropBusinessInfoImpl.class,
					fitPropBusinessInfo.getPrimaryKeyObj());
			}

			if (fitPropBusinessInfo != null) {
				session.delete(fitPropBusinessInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (fitPropBusinessInfo != null) {
			clearCache(fitPropBusinessInfo);
		}

		return fitPropBusinessInfo;
	}

	@Override
	public FitPropBusinessInfo updateImpl(
		FitPropBusinessInfo fitPropBusinessInfo) {

		boolean isNew = fitPropBusinessInfo.isNew();

		if (!(fitPropBusinessInfo instanceof FitPropBusinessInfoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(fitPropBusinessInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					fitPropBusinessInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in fitPropBusinessInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FitPropBusinessInfo implementation " +
					fitPropBusinessInfo.getClass());
		}

		FitPropBusinessInfoModelImpl fitPropBusinessInfoModelImpl =
			(FitPropBusinessInfoModelImpl)fitPropBusinessInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (fitPropBusinessInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				fitPropBusinessInfo.setCreateDate(date);
			}
			else {
				fitPropBusinessInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!fitPropBusinessInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				fitPropBusinessInfo.setModifiedDate(date);
			}
			else {
				fitPropBusinessInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(fitPropBusinessInfo);
			}
			else {
				fitPropBusinessInfo = (FitPropBusinessInfo)session.merge(
					fitPropBusinessInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FitPropBusinessInfoImpl.class, fitPropBusinessInfoModelImpl, false,
			true);

		cacheUniqueFindersCache(fitPropBusinessInfoModelImpl);

		if (isNew) {
			fitPropBusinessInfo.setNew(false);
		}

		fitPropBusinessInfo.resetOriginalValues();

		return fitPropBusinessInfo;
	}

	/**
	 * Returns the fit prop business info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fit prop business info
	 * @return the fit prop business info
	 * @throws NoSuchFitPropBusinessInfoException if a fit prop business info with the primary key could not be found
	 */
	@Override
	public FitPropBusinessInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFitPropBusinessInfoException {

		FitPropBusinessInfo fitPropBusinessInfo = fetchByPrimaryKey(primaryKey);

		if (fitPropBusinessInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFitPropBusinessInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return fitPropBusinessInfo;
	}

	/**
	 * Returns the fit prop business info with the primary key or throws a <code>NoSuchFitPropBusinessInfoException</code> if it could not be found.
	 *
	 * @param fitPropBusinessInfoId the primary key of the fit prop business info
	 * @return the fit prop business info
	 * @throws NoSuchFitPropBusinessInfoException if a fit prop business info with the primary key could not be found
	 */
	@Override
	public FitPropBusinessInfo findByPrimaryKey(long fitPropBusinessInfoId)
		throws NoSuchFitPropBusinessInfoException {

		return findByPrimaryKey((Serializable)fitPropBusinessInfoId);
	}

	/**
	 * Returns the fit prop business info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fitPropBusinessInfoId the primary key of the fit prop business info
	 * @return the fit prop business info, or <code>null</code> if a fit prop business info with the primary key could not be found
	 */
	@Override
	public FitPropBusinessInfo fetchByPrimaryKey(long fitPropBusinessInfoId) {
		return fetchByPrimaryKey((Serializable)fitPropBusinessInfoId);
	}

	/**
	 * Returns all the fit prop business infos.
	 *
	 * @return the fit prop business infos
	 */
	@Override
	public List<FitPropBusinessInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fit prop business infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropBusinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop business infos
	 * @param end the upper bound of the range of fit prop business infos (not inclusive)
	 * @return the range of fit prop business infos
	 */
	@Override
	public List<FitPropBusinessInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fit prop business infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropBusinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop business infos
	 * @param end the upper bound of the range of fit prop business infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fit prop business infos
	 */
	@Override
	public List<FitPropBusinessInfo> findAll(
		int start, int end,
		OrderByComparator<FitPropBusinessInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fit prop business infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropBusinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop business infos
	 * @param end the upper bound of the range of fit prop business infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fit prop business infos
	 */
	@Override
	public List<FitPropBusinessInfo> findAll(
		int start, int end,
		OrderByComparator<FitPropBusinessInfo> orderByComparator,
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

		List<FitPropBusinessInfo> list = null;

		if (useFinderCache) {
			list = (List<FitPropBusinessInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FITPROPBUSINESSINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FITPROPBUSINESSINFO;

				sql = sql.concat(FitPropBusinessInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FitPropBusinessInfo>)QueryUtil.list(
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
	 * Removes all the fit prop business infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FitPropBusinessInfo fitPropBusinessInfo : findAll()) {
			remove(fitPropBusinessInfo);
		}
	}

	/**
	 * Returns the number of fit prop business infos.
	 *
	 * @return the number of fit prop business infos
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
					_SQL_COUNT_FITPROPBUSINESSINFO);

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
		return "fitPropBusinessInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FITPROPBUSINESSINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FitPropBusinessInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the fit prop business info persistence.
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

		_finderPathFetchBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, true);

		_finderPathCountBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, false);

		FitPropBusinessInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FitPropBusinessInfoUtil.setPersistence(null);

		entityCache.removeCache(FitPropBusinessInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FITPROPBUSINESSINFO =
		"SELECT fitPropBusinessInfo FROM FitPropBusinessInfo fitPropBusinessInfo";

	private static final String _SQL_SELECT_FITPROPBUSINESSINFO_WHERE =
		"SELECT fitPropBusinessInfo FROM FitPropBusinessInfo fitPropBusinessInfo WHERE ";

	private static final String _SQL_COUNT_FITPROPBUSINESSINFO =
		"SELECT COUNT(fitPropBusinessInfo) FROM FitPropBusinessInfo fitPropBusinessInfo";

	private static final String _SQL_COUNT_FITPROPBUSINESSINFO_WHERE =
		"SELECT COUNT(fitPropBusinessInfo) FROM FitPropBusinessInfo fitPropBusinessInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "fitPropBusinessInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FitPropBusinessInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FitPropBusinessInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FitPropBusinessInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}