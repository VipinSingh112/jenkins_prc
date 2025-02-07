/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence.impl;

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

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjOrgDetailInfoException;
import com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo;
import com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfoTable;
import com.nbp.ncbj.application.form.service.model.impl.NcbjOrgDetailInfoImpl;
import com.nbp.ncbj.application.form.service.model.impl.NcbjOrgDetailInfoModelImpl;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjOrgDetailInfoPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjOrgDetailInfoUtil;
import com.nbp.ncbj.application.form.service.service.persistence.impl.constants.FOOPersistenceConstants;

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
 * The persistence implementation for the ncbj org detail info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjOrgDetailInfoPersistence.class)
public class NcbjOrgDetailInfoPersistenceImpl
	extends BasePersistenceImpl<NcbjOrgDetailInfo>
	implements NcbjOrgDetailInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjOrgDetailInfoUtil</code> to access the ncbj org detail info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjOrgDetailInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetNCBJByAppId;
	private FinderPath _finderPathCountBygetNCBJByAppId;

	/**
	 * Returns the ncbj org detail info where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjOrgDetailInfoException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj org detail info
	 * @throws NoSuchNcbjOrgDetailInfoException if a matching ncbj org detail info could not be found
	 */
	@Override
	public NcbjOrgDetailInfo findBygetNCBJByAppId(long ncbjApplicationId)
		throws NoSuchNcbjOrgDetailInfoException {

		NcbjOrgDetailInfo ncbjOrgDetailInfo = fetchBygetNCBJByAppId(
			ncbjApplicationId);

		if (ncbjOrgDetailInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncbjApplicationId=");
			sb.append(ncbjApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjOrgDetailInfoException(sb.toString());
		}

		return ncbjOrgDetailInfo;
	}

	/**
	 * Returns the ncbj org detail info where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj org detail info, or <code>null</code> if a matching ncbj org detail info could not be found
	 */
	@Override
	public NcbjOrgDetailInfo fetchBygetNCBJByAppId(long ncbjApplicationId) {
		return fetchBygetNCBJByAppId(ncbjApplicationId, true);
	}

	/**
	 * Returns the ncbj org detail info where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj org detail info, or <code>null</code> if a matching ncbj org detail info could not be found
	 */
	@Override
	public NcbjOrgDetailInfo fetchBygetNCBJByAppId(
		long ncbjApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ncbjApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNCBJByAppId, finderArgs, this);
		}

		if (result instanceof NcbjOrgDetailInfo) {
			NcbjOrgDetailInfo ncbjOrgDetailInfo = (NcbjOrgDetailInfo)result;

			if (ncbjApplicationId != ncbjOrgDetailInfo.getNcbjApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJORGDETAILINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJBYAPPID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				List<NcbjOrgDetailInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNCBJByAppId, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {ncbjApplicationId};
							}

							_log.warn(
								"NcbjOrgDetailInfoPersistenceImpl.fetchBygetNCBJByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjOrgDetailInfo ncbjOrgDetailInfo = list.get(0);

					result = ncbjOrgDetailInfo;

					cacheResult(ncbjOrgDetailInfo);
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
			return (NcbjOrgDetailInfo)result;
		}
	}

	/**
	 * Removes the ncbj org detail info where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj org detail info that was removed
	 */
	@Override
	public NcbjOrgDetailInfo removeBygetNCBJByAppId(long ncbjApplicationId)
		throws NoSuchNcbjOrgDetailInfoException {

		NcbjOrgDetailInfo ncbjOrgDetailInfo = findBygetNCBJByAppId(
			ncbjApplicationId);

		return remove(ncbjOrgDetailInfo);
	}

	/**
	 * Returns the number of ncbj org detail infos where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj org detail infos
	 */
	@Override
	public int countBygetNCBJByAppId(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCBJByAppId;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJORGDETAILINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJBYAPPID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

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
		_FINDER_COLUMN_GETNCBJBYAPPID_NCBJAPPLICATIONID_2 =
			"ncbjOrgDetailInfo.ncbjApplicationId = ?";

	public NcbjOrgDetailInfoPersistenceImpl() {
		setModelClass(NcbjOrgDetailInfo.class);

		setModelImplClass(NcbjOrgDetailInfoImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjOrgDetailInfoTable.INSTANCE);
	}

	/**
	 * Caches the ncbj org detail info in the entity cache if it is enabled.
	 *
	 * @param ncbjOrgDetailInfo the ncbj org detail info
	 */
	@Override
	public void cacheResult(NcbjOrgDetailInfo ncbjOrgDetailInfo) {
		entityCache.putResult(
			NcbjOrgDetailInfoImpl.class, ncbjOrgDetailInfo.getPrimaryKey(),
			ncbjOrgDetailInfo);

		finderCache.putResult(
			_finderPathFetchBygetNCBJByAppId,
			new Object[] {ncbjOrgDetailInfo.getNcbjApplicationId()},
			ncbjOrgDetailInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj org detail infos in the entity cache if it is enabled.
	 *
	 * @param ncbjOrgDetailInfos the ncbj org detail infos
	 */
	@Override
	public void cacheResult(List<NcbjOrgDetailInfo> ncbjOrgDetailInfos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjOrgDetailInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjOrgDetailInfo ncbjOrgDetailInfo : ncbjOrgDetailInfos) {
			if (entityCache.getResult(
					NcbjOrgDetailInfoImpl.class,
					ncbjOrgDetailInfo.getPrimaryKey()) == null) {

				cacheResult(ncbjOrgDetailInfo);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj org detail infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjOrgDetailInfoImpl.class);

		finderCache.clearCache(NcbjOrgDetailInfoImpl.class);
	}

	/**
	 * Clears the cache for the ncbj org detail info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjOrgDetailInfo ncbjOrgDetailInfo) {
		entityCache.removeResult(
			NcbjOrgDetailInfoImpl.class, ncbjOrgDetailInfo);
	}

	@Override
	public void clearCache(List<NcbjOrgDetailInfo> ncbjOrgDetailInfos) {
		for (NcbjOrgDetailInfo ncbjOrgDetailInfo : ncbjOrgDetailInfos) {
			entityCache.removeResult(
				NcbjOrgDetailInfoImpl.class, ncbjOrgDetailInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjOrgDetailInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(NcbjOrgDetailInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjOrgDetailInfoModelImpl ncbjOrgDetailInfoModelImpl) {

		Object[] args = new Object[] {
			ncbjOrgDetailInfoModelImpl.getNcbjApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetNCBJByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNCBJByAppId, args, ncbjOrgDetailInfoModelImpl);
	}

	/**
	 * Creates a new ncbj org detail info with the primary key. Does not add the ncbj org detail info to the database.
	 *
	 * @param ncbjOrgDetailInfoId the primary key for the new ncbj org detail info
	 * @return the new ncbj org detail info
	 */
	@Override
	public NcbjOrgDetailInfo create(long ncbjOrgDetailInfoId) {
		NcbjOrgDetailInfo ncbjOrgDetailInfo = new NcbjOrgDetailInfoImpl();

		ncbjOrgDetailInfo.setNew(true);
		ncbjOrgDetailInfo.setPrimaryKey(ncbjOrgDetailInfoId);

		ncbjOrgDetailInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjOrgDetailInfo;
	}

	/**
	 * Removes the ncbj org detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjOrgDetailInfoId the primary key of the ncbj org detail info
	 * @return the ncbj org detail info that was removed
	 * @throws NoSuchNcbjOrgDetailInfoException if a ncbj org detail info with the primary key could not be found
	 */
	@Override
	public NcbjOrgDetailInfo remove(long ncbjOrgDetailInfoId)
		throws NoSuchNcbjOrgDetailInfoException {

		return remove((Serializable)ncbjOrgDetailInfoId);
	}

	/**
	 * Removes the ncbj org detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj org detail info
	 * @return the ncbj org detail info that was removed
	 * @throws NoSuchNcbjOrgDetailInfoException if a ncbj org detail info with the primary key could not be found
	 */
	@Override
	public NcbjOrgDetailInfo remove(Serializable primaryKey)
		throws NoSuchNcbjOrgDetailInfoException {

		Session session = null;

		try {
			session = openSession();

			NcbjOrgDetailInfo ncbjOrgDetailInfo =
				(NcbjOrgDetailInfo)session.get(
					NcbjOrgDetailInfoImpl.class, primaryKey);

			if (ncbjOrgDetailInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjOrgDetailInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjOrgDetailInfo);
		}
		catch (NoSuchNcbjOrgDetailInfoException noSuchEntityException) {
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
	protected NcbjOrgDetailInfo removeImpl(
		NcbjOrgDetailInfo ncbjOrgDetailInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjOrgDetailInfo)) {
				ncbjOrgDetailInfo = (NcbjOrgDetailInfo)session.get(
					NcbjOrgDetailInfoImpl.class,
					ncbjOrgDetailInfo.getPrimaryKeyObj());
			}

			if (ncbjOrgDetailInfo != null) {
				session.delete(ncbjOrgDetailInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjOrgDetailInfo != null) {
			clearCache(ncbjOrgDetailInfo);
		}

		return ncbjOrgDetailInfo;
	}

	@Override
	public NcbjOrgDetailInfo updateImpl(NcbjOrgDetailInfo ncbjOrgDetailInfo) {
		boolean isNew = ncbjOrgDetailInfo.isNew();

		if (!(ncbjOrgDetailInfo instanceof NcbjOrgDetailInfoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjOrgDetailInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjOrgDetailInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjOrgDetailInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjOrgDetailInfo implementation " +
					ncbjOrgDetailInfo.getClass());
		}

		NcbjOrgDetailInfoModelImpl ncbjOrgDetailInfoModelImpl =
			(NcbjOrgDetailInfoModelImpl)ncbjOrgDetailInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjOrgDetailInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjOrgDetailInfo.setCreateDate(date);
			}
			else {
				ncbjOrgDetailInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjOrgDetailInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjOrgDetailInfo.setModifiedDate(date);
			}
			else {
				ncbjOrgDetailInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjOrgDetailInfo);
			}
			else {
				ncbjOrgDetailInfo = (NcbjOrgDetailInfo)session.merge(
					ncbjOrgDetailInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjOrgDetailInfoImpl.class, ncbjOrgDetailInfoModelImpl, false,
			true);

		cacheUniqueFindersCache(ncbjOrgDetailInfoModelImpl);

		if (isNew) {
			ncbjOrgDetailInfo.setNew(false);
		}

		ncbjOrgDetailInfo.resetOriginalValues();

		return ncbjOrgDetailInfo;
	}

	/**
	 * Returns the ncbj org detail info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj org detail info
	 * @return the ncbj org detail info
	 * @throws NoSuchNcbjOrgDetailInfoException if a ncbj org detail info with the primary key could not be found
	 */
	@Override
	public NcbjOrgDetailInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjOrgDetailInfoException {

		NcbjOrgDetailInfo ncbjOrgDetailInfo = fetchByPrimaryKey(primaryKey);

		if (ncbjOrgDetailInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjOrgDetailInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjOrgDetailInfo;
	}

	/**
	 * Returns the ncbj org detail info with the primary key or throws a <code>NoSuchNcbjOrgDetailInfoException</code> if it could not be found.
	 *
	 * @param ncbjOrgDetailInfoId the primary key of the ncbj org detail info
	 * @return the ncbj org detail info
	 * @throws NoSuchNcbjOrgDetailInfoException if a ncbj org detail info with the primary key could not be found
	 */
	@Override
	public NcbjOrgDetailInfo findByPrimaryKey(long ncbjOrgDetailInfoId)
		throws NoSuchNcbjOrgDetailInfoException {

		return findByPrimaryKey((Serializable)ncbjOrgDetailInfoId);
	}

	/**
	 * Returns the ncbj org detail info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjOrgDetailInfoId the primary key of the ncbj org detail info
	 * @return the ncbj org detail info, or <code>null</code> if a ncbj org detail info with the primary key could not be found
	 */
	@Override
	public NcbjOrgDetailInfo fetchByPrimaryKey(long ncbjOrgDetailInfoId) {
		return fetchByPrimaryKey((Serializable)ncbjOrgDetailInfoId);
	}

	/**
	 * Returns all the ncbj org detail infos.
	 *
	 * @return the ncbj org detail infos
	 */
	@Override
	public List<NcbjOrgDetailInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj org detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjOrgDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj org detail infos
	 * @param end the upper bound of the range of ncbj org detail infos (not inclusive)
	 * @return the range of ncbj org detail infos
	 */
	@Override
	public List<NcbjOrgDetailInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj org detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjOrgDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj org detail infos
	 * @param end the upper bound of the range of ncbj org detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj org detail infos
	 */
	@Override
	public List<NcbjOrgDetailInfo> findAll(
		int start, int end,
		OrderByComparator<NcbjOrgDetailInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj org detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjOrgDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj org detail infos
	 * @param end the upper bound of the range of ncbj org detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj org detail infos
	 */
	@Override
	public List<NcbjOrgDetailInfo> findAll(
		int start, int end,
		OrderByComparator<NcbjOrgDetailInfo> orderByComparator,
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

		List<NcbjOrgDetailInfo> list = null;

		if (useFinderCache) {
			list = (List<NcbjOrgDetailInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJORGDETAILINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJORGDETAILINFO;

				sql = sql.concat(NcbjOrgDetailInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjOrgDetailInfo>)QueryUtil.list(
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
	 * Removes all the ncbj org detail infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjOrgDetailInfo ncbjOrgDetailInfo : findAll()) {
			remove(ncbjOrgDetailInfo);
		}
	}

	/**
	 * Returns the number of ncbj org detail infos.
	 *
	 * @return the number of ncbj org detail infos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NCBJORGDETAILINFO);

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
		return "ncbjOrgDetailInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJORGDETAILINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjOrgDetailInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj org detail info persistence.
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

		_finderPathFetchBygetNCBJByAppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNCBJByAppId",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, true);

		_finderPathCountBygetNCBJByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNCBJByAppId",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, false);

		NcbjOrgDetailInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjOrgDetailInfoUtil.setPersistence(null);

		entityCache.removeCache(NcbjOrgDetailInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCBJORGDETAILINFO =
		"SELECT ncbjOrgDetailInfo FROM NcbjOrgDetailInfo ncbjOrgDetailInfo";

	private static final String _SQL_SELECT_NCBJORGDETAILINFO_WHERE =
		"SELECT ncbjOrgDetailInfo FROM NcbjOrgDetailInfo ncbjOrgDetailInfo WHERE ";

	private static final String _SQL_COUNT_NCBJORGDETAILINFO =
		"SELECT COUNT(ncbjOrgDetailInfo) FROM NcbjOrgDetailInfo ncbjOrgDetailInfo";

	private static final String _SQL_COUNT_NCBJORGDETAILINFO_WHERE =
		"SELECT COUNT(ncbjOrgDetailInfo) FROM NcbjOrgDetailInfo ncbjOrgDetailInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ncbjOrgDetailInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjOrgDetailInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjOrgDetailInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjOrgDetailInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}