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

import com.nbp.hsra.application.service.exception.NoSuchRadionuclideInfoException;
import com.nbp.hsra.application.service.model.RadionuclideInfo;
import com.nbp.hsra.application.service.model.RadionuclideInfoTable;
import com.nbp.hsra.application.service.model.impl.RadionuclideInfoImpl;
import com.nbp.hsra.application.service.model.impl.RadionuclideInfoModelImpl;
import com.nbp.hsra.application.service.service.persistence.RadionuclideInfoPersistence;
import com.nbp.hsra.application.service.service.persistence.RadionuclideInfoUtil;
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
 * The persistence implementation for the radionuclide info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = RadionuclideInfoPersistence.class)
public class RadionuclideInfoPersistenceImpl
	extends BasePersistenceImpl<RadionuclideInfo>
	implements RadionuclideInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RadionuclideInfoUtil</code> to access the radionuclide info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RadionuclideInfoImpl.class.getName();

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
	 * Returns the radionuclide info where hsraApplicationId = &#63; or throws a <code>NoSuchRadionuclideInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radionuclide info
	 * @throws NoSuchRadionuclideInfoException if a matching radionuclide info could not be found
	 */
	@Override
	public RadionuclideInfo findBygetHsraById(long hsraApplicationId)
		throws NoSuchRadionuclideInfoException {

		RadionuclideInfo radionuclideInfo = fetchBygetHsraById(
			hsraApplicationId);

		if (radionuclideInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchRadionuclideInfoException(sb.toString());
		}

		return radionuclideInfo;
	}

	/**
	 * Returns the radionuclide info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radionuclide info, or <code>null</code> if a matching radionuclide info could not be found
	 */
	@Override
	public RadionuclideInfo fetchBygetHsraById(long hsraApplicationId) {
		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the radionuclide info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching radionuclide info, or <code>null</code> if a matching radionuclide info could not be found
	 */
	@Override
	public RadionuclideInfo fetchBygetHsraById(
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

		if (result instanceof RadionuclideInfo) {
			RadionuclideInfo radionuclideInfo = (RadionuclideInfo)result;

			if (hsraApplicationId != radionuclideInfo.getHsraApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_RADIONUCLIDEINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<RadionuclideInfo> list = query.list();

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
								"RadionuclideInfoPersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					RadionuclideInfo radionuclideInfo = list.get(0);

					result = radionuclideInfo;

					cacheResult(radionuclideInfo);
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
			return (RadionuclideInfo)result;
		}
	}

	/**
	 * Removes the radionuclide info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the radionuclide info that was removed
	 */
	@Override
	public RadionuclideInfo removeBygetHsraById(long hsraApplicationId)
		throws NoSuchRadionuclideInfoException {

		RadionuclideInfo radionuclideInfo = findBygetHsraById(
			hsraApplicationId);

		return remove(radionuclideInfo);
	}

	/**
	 * Returns the number of radionuclide infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radionuclide infos
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_RADIONUCLIDEINFO_WHERE);

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
		"radionuclideInfo.hsraApplicationId = ?";

	public RadionuclideInfoPersistenceImpl() {
		setModelClass(RadionuclideInfo.class);

		setModelImplClass(RadionuclideInfoImpl.class);
		setModelPKClass(long.class);

		setTable(RadionuclideInfoTable.INSTANCE);
	}

	/**
	 * Caches the radionuclide info in the entity cache if it is enabled.
	 *
	 * @param radionuclideInfo the radionuclide info
	 */
	@Override
	public void cacheResult(RadionuclideInfo radionuclideInfo) {
		entityCache.putResult(
			RadionuclideInfoImpl.class, radionuclideInfo.getPrimaryKey(),
			radionuclideInfo);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {radionuclideInfo.getHsraApplicationId()},
			radionuclideInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the radionuclide infos in the entity cache if it is enabled.
	 *
	 * @param radionuclideInfos the radionuclide infos
	 */
	@Override
	public void cacheResult(List<RadionuclideInfo> radionuclideInfos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (radionuclideInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (RadionuclideInfo radionuclideInfo : radionuclideInfos) {
			if (entityCache.getResult(
					RadionuclideInfoImpl.class,
					radionuclideInfo.getPrimaryKey()) == null) {

				cacheResult(radionuclideInfo);
			}
		}
	}

	/**
	 * Clears the cache for all radionuclide infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RadionuclideInfoImpl.class);

		finderCache.clearCache(RadionuclideInfoImpl.class);
	}

	/**
	 * Clears the cache for the radionuclide info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RadionuclideInfo radionuclideInfo) {
		entityCache.removeResult(RadionuclideInfoImpl.class, radionuclideInfo);
	}

	@Override
	public void clearCache(List<RadionuclideInfo> radionuclideInfos) {
		for (RadionuclideInfo radionuclideInfo : radionuclideInfos) {
			entityCache.removeResult(
				RadionuclideInfoImpl.class, radionuclideInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(RadionuclideInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(RadionuclideInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		RadionuclideInfoModelImpl radionuclideInfoModelImpl) {

		Object[] args = new Object[] {
			radionuclideInfoModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args, radionuclideInfoModelImpl);
	}

	/**
	 * Creates a new radionuclide info with the primary key. Does not add the radionuclide info to the database.
	 *
	 * @param radionuclideInfoId the primary key for the new radionuclide info
	 * @return the new radionuclide info
	 */
	@Override
	public RadionuclideInfo create(long radionuclideInfoId) {
		RadionuclideInfo radionuclideInfo = new RadionuclideInfoImpl();

		radionuclideInfo.setNew(true);
		radionuclideInfo.setPrimaryKey(radionuclideInfoId);

		radionuclideInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return radionuclideInfo;
	}

	/**
	 * Removes the radionuclide info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radionuclideInfoId the primary key of the radionuclide info
	 * @return the radionuclide info that was removed
	 * @throws NoSuchRadionuclideInfoException if a radionuclide info with the primary key could not be found
	 */
	@Override
	public RadionuclideInfo remove(long radionuclideInfoId)
		throws NoSuchRadionuclideInfoException {

		return remove((Serializable)radionuclideInfoId);
	}

	/**
	 * Removes the radionuclide info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the radionuclide info
	 * @return the radionuclide info that was removed
	 * @throws NoSuchRadionuclideInfoException if a radionuclide info with the primary key could not be found
	 */
	@Override
	public RadionuclideInfo remove(Serializable primaryKey)
		throws NoSuchRadionuclideInfoException {

		Session session = null;

		try {
			session = openSession();

			RadionuclideInfo radionuclideInfo = (RadionuclideInfo)session.get(
				RadionuclideInfoImpl.class, primaryKey);

			if (radionuclideInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRadionuclideInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(radionuclideInfo);
		}
		catch (NoSuchRadionuclideInfoException noSuchEntityException) {
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
	protected RadionuclideInfo removeImpl(RadionuclideInfo radionuclideInfo) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(radionuclideInfo)) {
				radionuclideInfo = (RadionuclideInfo)session.get(
					RadionuclideInfoImpl.class,
					radionuclideInfo.getPrimaryKeyObj());
			}

			if (radionuclideInfo != null) {
				session.delete(radionuclideInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (radionuclideInfo != null) {
			clearCache(radionuclideInfo);
		}

		return radionuclideInfo;
	}

	@Override
	public RadionuclideInfo updateImpl(RadionuclideInfo radionuclideInfo) {
		boolean isNew = radionuclideInfo.isNew();

		if (!(radionuclideInfo instanceof RadionuclideInfoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(radionuclideInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					radionuclideInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in radionuclideInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom RadionuclideInfo implementation " +
					radionuclideInfo.getClass());
		}

		RadionuclideInfoModelImpl radionuclideInfoModelImpl =
			(RadionuclideInfoModelImpl)radionuclideInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (radionuclideInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				radionuclideInfo.setCreateDate(date);
			}
			else {
				radionuclideInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!radionuclideInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				radionuclideInfo.setModifiedDate(date);
			}
			else {
				radionuclideInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(radionuclideInfo);
			}
			else {
				radionuclideInfo = (RadionuclideInfo)session.merge(
					radionuclideInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			RadionuclideInfoImpl.class, radionuclideInfoModelImpl, false, true);

		cacheUniqueFindersCache(radionuclideInfoModelImpl);

		if (isNew) {
			radionuclideInfo.setNew(false);
		}

		radionuclideInfo.resetOriginalValues();

		return radionuclideInfo;
	}

	/**
	 * Returns the radionuclide info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the radionuclide info
	 * @return the radionuclide info
	 * @throws NoSuchRadionuclideInfoException if a radionuclide info with the primary key could not be found
	 */
	@Override
	public RadionuclideInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRadionuclideInfoException {

		RadionuclideInfo radionuclideInfo = fetchByPrimaryKey(primaryKey);

		if (radionuclideInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRadionuclideInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return radionuclideInfo;
	}

	/**
	 * Returns the radionuclide info with the primary key or throws a <code>NoSuchRadionuclideInfoException</code> if it could not be found.
	 *
	 * @param radionuclideInfoId the primary key of the radionuclide info
	 * @return the radionuclide info
	 * @throws NoSuchRadionuclideInfoException if a radionuclide info with the primary key could not be found
	 */
	@Override
	public RadionuclideInfo findByPrimaryKey(long radionuclideInfoId)
		throws NoSuchRadionuclideInfoException {

		return findByPrimaryKey((Serializable)radionuclideInfoId);
	}

	/**
	 * Returns the radionuclide info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radionuclideInfoId the primary key of the radionuclide info
	 * @return the radionuclide info, or <code>null</code> if a radionuclide info with the primary key could not be found
	 */
	@Override
	public RadionuclideInfo fetchByPrimaryKey(long radionuclideInfoId) {
		return fetchByPrimaryKey((Serializable)radionuclideInfoId);
	}

	/**
	 * Returns all the radionuclide infos.
	 *
	 * @return the radionuclide infos
	 */
	@Override
	public List<RadionuclideInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the radionuclide infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radionuclide infos
	 * @param end the upper bound of the range of radionuclide infos (not inclusive)
	 * @return the range of radionuclide infos
	 */
	@Override
	public List<RadionuclideInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the radionuclide infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radionuclide infos
	 * @param end the upper bound of the range of radionuclide infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radionuclide infos
	 */
	@Override
	public List<RadionuclideInfo> findAll(
		int start, int end,
		OrderByComparator<RadionuclideInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the radionuclide infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radionuclide infos
	 * @param end the upper bound of the range of radionuclide infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radionuclide infos
	 */
	@Override
	public List<RadionuclideInfo> findAll(
		int start, int end,
		OrderByComparator<RadionuclideInfo> orderByComparator,
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

		List<RadionuclideInfo> list = null;

		if (useFinderCache) {
			list = (List<RadionuclideInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_RADIONUCLIDEINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_RADIONUCLIDEINFO;

				sql = sql.concat(RadionuclideInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<RadionuclideInfo>)QueryUtil.list(
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
	 * Removes all the radionuclide infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RadionuclideInfo radionuclideInfo : findAll()) {
			remove(radionuclideInfo);
		}
	}

	/**
	 * Returns the number of radionuclide infos.
	 *
	 * @return the number of radionuclide infos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_RADIONUCLIDEINFO);

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
		return "radionuclideInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_RADIONUCLIDEINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return RadionuclideInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the radionuclide info persistence.
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

		RadionuclideInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		RadionuclideInfoUtil.setPersistence(null);

		entityCache.removeCache(RadionuclideInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_RADIONUCLIDEINFO =
		"SELECT radionuclideInfo FROM RadionuclideInfo radionuclideInfo";

	private static final String _SQL_SELECT_RADIONUCLIDEINFO_WHERE =
		"SELECT radionuclideInfo FROM RadionuclideInfo radionuclideInfo WHERE ";

	private static final String _SQL_COUNT_RADIONUCLIDEINFO =
		"SELECT COUNT(radionuclideInfo) FROM RadionuclideInfo radionuclideInfo";

	private static final String _SQL_COUNT_RADIONUCLIDEINFO_WHERE =
		"SELECT COUNT(radionuclideInfo) FROM RadionuclideInfo radionuclideInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "radionuclideInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No RadionuclideInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No RadionuclideInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		RadionuclideInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}