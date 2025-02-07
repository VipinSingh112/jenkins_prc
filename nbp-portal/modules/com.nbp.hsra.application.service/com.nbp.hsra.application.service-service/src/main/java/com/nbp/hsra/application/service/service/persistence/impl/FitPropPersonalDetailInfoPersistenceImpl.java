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

import com.nbp.hsra.application.service.exception.NoSuchFitPropPersonalDetailInfoException;
import com.nbp.hsra.application.service.model.FitPropPersonalDetailInfo;
import com.nbp.hsra.application.service.model.FitPropPersonalDetailInfoTable;
import com.nbp.hsra.application.service.model.impl.FitPropPersonalDetailInfoImpl;
import com.nbp.hsra.application.service.model.impl.FitPropPersonalDetailInfoModelImpl;
import com.nbp.hsra.application.service.service.persistence.FitPropPersonalDetailInfoPersistence;
import com.nbp.hsra.application.service.service.persistence.FitPropPersonalDetailInfoUtil;
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
 * The persistence implementation for the fit prop personal detail info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FitPropPersonalDetailInfoPersistence.class)
public class FitPropPersonalDetailInfoPersistenceImpl
	extends BasePersistenceImpl<FitPropPersonalDetailInfo>
	implements FitPropPersonalDetailInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FitPropPersonalDetailInfoUtil</code> to access the fit prop personal detail info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FitPropPersonalDetailInfoImpl.class.getName();

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
	 * Returns the fit prop personal detail info where hsraApplicationId = &#63; or throws a <code>NoSuchFitPropPersonalDetailInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching fit prop personal detail info
	 * @throws NoSuchFitPropPersonalDetailInfoException if a matching fit prop personal detail info could not be found
	 */
	@Override
	public FitPropPersonalDetailInfo findBygetHsraById(long hsraApplicationId)
		throws NoSuchFitPropPersonalDetailInfoException {

		FitPropPersonalDetailInfo fitPropPersonalDetailInfo =
			fetchBygetHsraById(hsraApplicationId);

		if (fitPropPersonalDetailInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFitPropPersonalDetailInfoException(sb.toString());
		}

		return fitPropPersonalDetailInfo;
	}

	/**
	 * Returns the fit prop personal detail info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching fit prop personal detail info, or <code>null</code> if a matching fit prop personal detail info could not be found
	 */
	@Override
	public FitPropPersonalDetailInfo fetchBygetHsraById(
		long hsraApplicationId) {

		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the fit prop personal detail info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fit prop personal detail info, or <code>null</code> if a matching fit prop personal detail info could not be found
	 */
	@Override
	public FitPropPersonalDetailInfo fetchBygetHsraById(
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

		if (result instanceof FitPropPersonalDetailInfo) {
			FitPropPersonalDetailInfo fitPropPersonalDetailInfo =
				(FitPropPersonalDetailInfo)result;

			if (hsraApplicationId !=
					fitPropPersonalDetailInfo.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FITPROPPERSONALDETAILINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<FitPropPersonalDetailInfo> list = query.list();

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
								"FitPropPersonalDetailInfoPersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FitPropPersonalDetailInfo fitPropPersonalDetailInfo =
						list.get(0);

					result = fitPropPersonalDetailInfo;

					cacheResult(fitPropPersonalDetailInfo);
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
			return (FitPropPersonalDetailInfo)result;
		}
	}

	/**
	 * Removes the fit prop personal detail info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the fit prop personal detail info that was removed
	 */
	@Override
	public FitPropPersonalDetailInfo removeBygetHsraById(long hsraApplicationId)
		throws NoSuchFitPropPersonalDetailInfoException {

		FitPropPersonalDetailInfo fitPropPersonalDetailInfo = findBygetHsraById(
			hsraApplicationId);

		return remove(fitPropPersonalDetailInfo);
	}

	/**
	 * Returns the number of fit prop personal detail infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching fit prop personal detail infos
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FITPROPPERSONALDETAILINFO_WHERE);

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
		"fitPropPersonalDetailInfo.hsraApplicationId = ?";

	public FitPropPersonalDetailInfoPersistenceImpl() {
		setModelClass(FitPropPersonalDetailInfo.class);

		setModelImplClass(FitPropPersonalDetailInfoImpl.class);
		setModelPKClass(long.class);

		setTable(FitPropPersonalDetailInfoTable.INSTANCE);
	}

	/**
	 * Caches the fit prop personal detail info in the entity cache if it is enabled.
	 *
	 * @param fitPropPersonalDetailInfo the fit prop personal detail info
	 */
	@Override
	public void cacheResult(
		FitPropPersonalDetailInfo fitPropPersonalDetailInfo) {

		entityCache.putResult(
			FitPropPersonalDetailInfoImpl.class,
			fitPropPersonalDetailInfo.getPrimaryKey(),
			fitPropPersonalDetailInfo);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {fitPropPersonalDetailInfo.getHsraApplicationId()},
			fitPropPersonalDetailInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the fit prop personal detail infos in the entity cache if it is enabled.
	 *
	 * @param fitPropPersonalDetailInfos the fit prop personal detail infos
	 */
	@Override
	public void cacheResult(
		List<FitPropPersonalDetailInfo> fitPropPersonalDetailInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fitPropPersonalDetailInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FitPropPersonalDetailInfo fitPropPersonalDetailInfo :
				fitPropPersonalDetailInfos) {

			if (entityCache.getResult(
					FitPropPersonalDetailInfoImpl.class,
					fitPropPersonalDetailInfo.getPrimaryKey()) == null) {

				cacheResult(fitPropPersonalDetailInfo);
			}
		}
	}

	/**
	 * Clears the cache for all fit prop personal detail infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FitPropPersonalDetailInfoImpl.class);

		finderCache.clearCache(FitPropPersonalDetailInfoImpl.class);
	}

	/**
	 * Clears the cache for the fit prop personal detail info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FitPropPersonalDetailInfo fitPropPersonalDetailInfo) {

		entityCache.removeResult(
			FitPropPersonalDetailInfoImpl.class, fitPropPersonalDetailInfo);
	}

	@Override
	public void clearCache(
		List<FitPropPersonalDetailInfo> fitPropPersonalDetailInfos) {

		for (FitPropPersonalDetailInfo fitPropPersonalDetailInfo :
				fitPropPersonalDetailInfos) {

			entityCache.removeResult(
				FitPropPersonalDetailInfoImpl.class, fitPropPersonalDetailInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FitPropPersonalDetailInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FitPropPersonalDetailInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FitPropPersonalDetailInfoModelImpl fitPropPersonalDetailInfoModelImpl) {

		Object[] args = new Object[] {
			fitPropPersonalDetailInfoModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args,
			fitPropPersonalDetailInfoModelImpl);
	}

	/**
	 * Creates a new fit prop personal detail info with the primary key. Does not add the fit prop personal detail info to the database.
	 *
	 * @param fitPropPersonalDetailInfoId the primary key for the new fit prop personal detail info
	 * @return the new fit prop personal detail info
	 */
	@Override
	public FitPropPersonalDetailInfo create(long fitPropPersonalDetailInfoId) {
		FitPropPersonalDetailInfo fitPropPersonalDetailInfo =
			new FitPropPersonalDetailInfoImpl();

		fitPropPersonalDetailInfo.setNew(true);
		fitPropPersonalDetailInfo.setPrimaryKey(fitPropPersonalDetailInfoId);

		fitPropPersonalDetailInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return fitPropPersonalDetailInfo;
	}

	/**
	 * Removes the fit prop personal detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fitPropPersonalDetailInfoId the primary key of the fit prop personal detail info
	 * @return the fit prop personal detail info that was removed
	 * @throws NoSuchFitPropPersonalDetailInfoException if a fit prop personal detail info with the primary key could not be found
	 */
	@Override
	public FitPropPersonalDetailInfo remove(long fitPropPersonalDetailInfoId)
		throws NoSuchFitPropPersonalDetailInfoException {

		return remove((Serializable)fitPropPersonalDetailInfoId);
	}

	/**
	 * Removes the fit prop personal detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fit prop personal detail info
	 * @return the fit prop personal detail info that was removed
	 * @throws NoSuchFitPropPersonalDetailInfoException if a fit prop personal detail info with the primary key could not be found
	 */
	@Override
	public FitPropPersonalDetailInfo remove(Serializable primaryKey)
		throws NoSuchFitPropPersonalDetailInfoException {

		Session session = null;

		try {
			session = openSession();

			FitPropPersonalDetailInfo fitPropPersonalDetailInfo =
				(FitPropPersonalDetailInfo)session.get(
					FitPropPersonalDetailInfoImpl.class, primaryKey);

			if (fitPropPersonalDetailInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFitPropPersonalDetailInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(fitPropPersonalDetailInfo);
		}
		catch (NoSuchFitPropPersonalDetailInfoException noSuchEntityException) {
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
	protected FitPropPersonalDetailInfo removeImpl(
		FitPropPersonalDetailInfo fitPropPersonalDetailInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fitPropPersonalDetailInfo)) {
				fitPropPersonalDetailInfo =
					(FitPropPersonalDetailInfo)session.get(
						FitPropPersonalDetailInfoImpl.class,
						fitPropPersonalDetailInfo.getPrimaryKeyObj());
			}

			if (fitPropPersonalDetailInfo != null) {
				session.delete(fitPropPersonalDetailInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (fitPropPersonalDetailInfo != null) {
			clearCache(fitPropPersonalDetailInfo);
		}

		return fitPropPersonalDetailInfo;
	}

	@Override
	public FitPropPersonalDetailInfo updateImpl(
		FitPropPersonalDetailInfo fitPropPersonalDetailInfo) {

		boolean isNew = fitPropPersonalDetailInfo.isNew();

		if (!(fitPropPersonalDetailInfo instanceof
				FitPropPersonalDetailInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(fitPropPersonalDetailInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					fitPropPersonalDetailInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in fitPropPersonalDetailInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FitPropPersonalDetailInfo implementation " +
					fitPropPersonalDetailInfo.getClass());
		}

		FitPropPersonalDetailInfoModelImpl fitPropPersonalDetailInfoModelImpl =
			(FitPropPersonalDetailInfoModelImpl)fitPropPersonalDetailInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (fitPropPersonalDetailInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				fitPropPersonalDetailInfo.setCreateDate(date);
			}
			else {
				fitPropPersonalDetailInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!fitPropPersonalDetailInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				fitPropPersonalDetailInfo.setModifiedDate(date);
			}
			else {
				fitPropPersonalDetailInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(fitPropPersonalDetailInfo);
			}
			else {
				fitPropPersonalDetailInfo =
					(FitPropPersonalDetailInfo)session.merge(
						fitPropPersonalDetailInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FitPropPersonalDetailInfoImpl.class,
			fitPropPersonalDetailInfoModelImpl, false, true);

		cacheUniqueFindersCache(fitPropPersonalDetailInfoModelImpl);

		if (isNew) {
			fitPropPersonalDetailInfo.setNew(false);
		}

		fitPropPersonalDetailInfo.resetOriginalValues();

		return fitPropPersonalDetailInfo;
	}

	/**
	 * Returns the fit prop personal detail info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fit prop personal detail info
	 * @return the fit prop personal detail info
	 * @throws NoSuchFitPropPersonalDetailInfoException if a fit prop personal detail info with the primary key could not be found
	 */
	@Override
	public FitPropPersonalDetailInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFitPropPersonalDetailInfoException {

		FitPropPersonalDetailInfo fitPropPersonalDetailInfo = fetchByPrimaryKey(
			primaryKey);

		if (fitPropPersonalDetailInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFitPropPersonalDetailInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return fitPropPersonalDetailInfo;
	}

	/**
	 * Returns the fit prop personal detail info with the primary key or throws a <code>NoSuchFitPropPersonalDetailInfoException</code> if it could not be found.
	 *
	 * @param fitPropPersonalDetailInfoId the primary key of the fit prop personal detail info
	 * @return the fit prop personal detail info
	 * @throws NoSuchFitPropPersonalDetailInfoException if a fit prop personal detail info with the primary key could not be found
	 */
	@Override
	public FitPropPersonalDetailInfo findByPrimaryKey(
			long fitPropPersonalDetailInfoId)
		throws NoSuchFitPropPersonalDetailInfoException {

		return findByPrimaryKey((Serializable)fitPropPersonalDetailInfoId);
	}

	/**
	 * Returns the fit prop personal detail info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fitPropPersonalDetailInfoId the primary key of the fit prop personal detail info
	 * @return the fit prop personal detail info, or <code>null</code> if a fit prop personal detail info with the primary key could not be found
	 */
	@Override
	public FitPropPersonalDetailInfo fetchByPrimaryKey(
		long fitPropPersonalDetailInfoId) {

		return fetchByPrimaryKey((Serializable)fitPropPersonalDetailInfoId);
	}

	/**
	 * Returns all the fit prop personal detail infos.
	 *
	 * @return the fit prop personal detail infos
	 */
	@Override
	public List<FitPropPersonalDetailInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fit prop personal detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropPersonalDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop personal detail infos
	 * @param end the upper bound of the range of fit prop personal detail infos (not inclusive)
	 * @return the range of fit prop personal detail infos
	 */
	@Override
	public List<FitPropPersonalDetailInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fit prop personal detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropPersonalDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop personal detail infos
	 * @param end the upper bound of the range of fit prop personal detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fit prop personal detail infos
	 */
	@Override
	public List<FitPropPersonalDetailInfo> findAll(
		int start, int end,
		OrderByComparator<FitPropPersonalDetailInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fit prop personal detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropPersonalDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop personal detail infos
	 * @param end the upper bound of the range of fit prop personal detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fit prop personal detail infos
	 */
	@Override
	public List<FitPropPersonalDetailInfo> findAll(
		int start, int end,
		OrderByComparator<FitPropPersonalDetailInfo> orderByComparator,
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

		List<FitPropPersonalDetailInfo> list = null;

		if (useFinderCache) {
			list = (List<FitPropPersonalDetailInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FITPROPPERSONALDETAILINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FITPROPPERSONALDETAILINFO;

				sql = sql.concat(
					FitPropPersonalDetailInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FitPropPersonalDetailInfo>)QueryUtil.list(
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
	 * Removes all the fit prop personal detail infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FitPropPersonalDetailInfo fitPropPersonalDetailInfo : findAll()) {
			remove(fitPropPersonalDetailInfo);
		}
	}

	/**
	 * Returns the number of fit prop personal detail infos.
	 *
	 * @return the number of fit prop personal detail infos
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
					_SQL_COUNT_FITPROPPERSONALDETAILINFO);

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
		return "fitPropPersonalDetailInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FITPROPPERSONALDETAILINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FitPropPersonalDetailInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the fit prop personal detail info persistence.
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

		FitPropPersonalDetailInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FitPropPersonalDetailInfoUtil.setPersistence(null);

		entityCache.removeCache(FitPropPersonalDetailInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_FITPROPPERSONALDETAILINFO =
		"SELECT fitPropPersonalDetailInfo FROM FitPropPersonalDetailInfo fitPropPersonalDetailInfo";

	private static final String _SQL_SELECT_FITPROPPERSONALDETAILINFO_WHERE =
		"SELECT fitPropPersonalDetailInfo FROM FitPropPersonalDetailInfo fitPropPersonalDetailInfo WHERE ";

	private static final String _SQL_COUNT_FITPROPPERSONALDETAILINFO =
		"SELECT COUNT(fitPropPersonalDetailInfo) FROM FitPropPersonalDetailInfo fitPropPersonalDetailInfo";

	private static final String _SQL_COUNT_FITPROPPERSONALDETAILINFO_WHERE =
		"SELECT COUNT(fitPropPersonalDetailInfo) FROM FitPropPersonalDetailInfo fitPropPersonalDetailInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"fitPropPersonalDetailInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FitPropPersonalDetailInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FitPropPersonalDetailInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FitPropPersonalDetailInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}