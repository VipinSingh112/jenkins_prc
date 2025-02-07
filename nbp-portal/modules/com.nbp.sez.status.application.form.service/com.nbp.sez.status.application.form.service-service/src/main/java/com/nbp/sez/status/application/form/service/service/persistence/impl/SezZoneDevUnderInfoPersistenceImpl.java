/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence.impl;

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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneDevUnderInfoException;
import com.nbp.sez.status.application.form.service.model.SezZoneDevUnderInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneDevUnderInfoTable;
import com.nbp.sez.status.application.form.service.model.impl.SezZoneDevUnderInfoImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezZoneDevUnderInfoModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneDevUnderInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneDevUnderInfoUtil;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;

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
 * The persistence implementation for the sez zone dev under info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezZoneDevUnderInfoPersistence.class)
public class SezZoneDevUnderInfoPersistenceImpl
	extends BasePersistenceImpl<SezZoneDevUnderInfo>
	implements SezZoneDevUnderInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezZoneDevUnderInfoUtil</code> to access the sez zone dev under info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezZoneDevUnderInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetSezStatusByAppId;
	private FinderPath _finderPathCountBygetSezStatusByAppId;

	/**
	 * Returns the sez zone dev under info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezZoneDevUnderInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone dev under info
	 * @throws NoSuchSezZoneDevUnderInfoException if a matching sez zone dev under info could not be found
	 */
	@Override
	public SezZoneDevUnderInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneDevUnderInfoException {

		SezZoneDevUnderInfo sezZoneDevUnderInfo = fetchBygetSezStatusByAppId(
			sezStatusApplicationId);

		if (sezZoneDevUnderInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezZoneDevUnderInfoException(sb.toString());
		}

		return sezZoneDevUnderInfo;
	}

	/**
	 * Returns the sez zone dev under info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone dev under info, or <code>null</code> if a matching sez zone dev under info could not be found
	 */
	@Override
	public SezZoneDevUnderInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez zone dev under info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone dev under info, or <code>null</code> if a matching sez zone dev under info could not be found
	 */
	@Override
	public SezZoneDevUnderInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {sezStatusApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSezStatusByAppId, finderArgs, this);
		}

		if (result instanceof SezZoneDevUnderInfo) {
			SezZoneDevUnderInfo sezZoneDevUnderInfo =
				(SezZoneDevUnderInfo)result;

			if (sezStatusApplicationId !=
					sezZoneDevUnderInfo.getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZZONEDEVUNDERINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezZoneDevUnderInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSezStatusByAppId, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									sezStatusApplicationId
								};
							}

							_log.warn(
								"SezZoneDevUnderInfoPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezZoneDevUnderInfo sezZoneDevUnderInfo = list.get(0);

					result = sezZoneDevUnderInfo;

					cacheResult(sezZoneDevUnderInfo);
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
			return (SezZoneDevUnderInfo)result;
		}
	}

	/**
	 * Removes the sez zone dev under info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez zone dev under info that was removed
	 */
	@Override
	public SezZoneDevUnderInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneDevUnderInfoException {

		SezZoneDevUnderInfo sezZoneDevUnderInfo = findBygetSezStatusByAppId(
			sezStatusApplicationId);

		return remove(sezZoneDevUnderInfo);
	}

	/**
	 * Returns the number of sez zone dev under infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone dev under infos
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZZONEDEVUNDERINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

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
		_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2 =
			"sezZoneDevUnderInfo.sezStatusApplicationId = ?";

	public SezZoneDevUnderInfoPersistenceImpl() {
		setModelClass(SezZoneDevUnderInfo.class);

		setModelImplClass(SezZoneDevUnderInfoImpl.class);
		setModelPKClass(long.class);

		setTable(SezZoneDevUnderInfoTable.INSTANCE);
	}

	/**
	 * Caches the sez zone dev under info in the entity cache if it is enabled.
	 *
	 * @param sezZoneDevUnderInfo the sez zone dev under info
	 */
	@Override
	public void cacheResult(SezZoneDevUnderInfo sezZoneDevUnderInfo) {
		entityCache.putResult(
			SezZoneDevUnderInfoImpl.class, sezZoneDevUnderInfo.getPrimaryKey(),
			sezZoneDevUnderInfo);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {sezZoneDevUnderInfo.getSezStatusApplicationId()},
			sezZoneDevUnderInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez zone dev under infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneDevUnderInfos the sez zone dev under infos
	 */
	@Override
	public void cacheResult(List<SezZoneDevUnderInfo> sezZoneDevUnderInfos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezZoneDevUnderInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezZoneDevUnderInfo sezZoneDevUnderInfo : sezZoneDevUnderInfos) {
			if (entityCache.getResult(
					SezZoneDevUnderInfoImpl.class,
					sezZoneDevUnderInfo.getPrimaryKey()) == null) {

				cacheResult(sezZoneDevUnderInfo);
			}
		}
	}

	/**
	 * Clears the cache for all sez zone dev under infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezZoneDevUnderInfoImpl.class);

		finderCache.clearCache(SezZoneDevUnderInfoImpl.class);
	}

	/**
	 * Clears the cache for the sez zone dev under info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezZoneDevUnderInfo sezZoneDevUnderInfo) {
		entityCache.removeResult(
			SezZoneDevUnderInfoImpl.class, sezZoneDevUnderInfo);
	}

	@Override
	public void clearCache(List<SezZoneDevUnderInfo> sezZoneDevUnderInfos) {
		for (SezZoneDevUnderInfo sezZoneDevUnderInfo : sezZoneDevUnderInfos) {
			entityCache.removeResult(
				SezZoneDevUnderInfoImpl.class, sezZoneDevUnderInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezZoneDevUnderInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(SezZoneDevUnderInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezZoneDevUnderInfoModelImpl sezZoneDevUnderInfoModelImpl) {

		Object[] args = new Object[] {
			sezZoneDevUnderInfoModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezZoneDevUnderInfoModelImpl);
	}

	/**
	 * Creates a new sez zone dev under info with the primary key. Does not add the sez zone dev under info to the database.
	 *
	 * @param sezZoneDevUnderInfoId the primary key for the new sez zone dev under info
	 * @return the new sez zone dev under info
	 */
	@Override
	public SezZoneDevUnderInfo create(long sezZoneDevUnderInfoId) {
		SezZoneDevUnderInfo sezZoneDevUnderInfo = new SezZoneDevUnderInfoImpl();

		sezZoneDevUnderInfo.setNew(true);
		sezZoneDevUnderInfo.setPrimaryKey(sezZoneDevUnderInfoId);

		sezZoneDevUnderInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sezZoneDevUnderInfo;
	}

	/**
	 * Removes the sez zone dev under info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneDevUnderInfoId the primary key of the sez zone dev under info
	 * @return the sez zone dev under info that was removed
	 * @throws NoSuchSezZoneDevUnderInfoException if a sez zone dev under info with the primary key could not be found
	 */
	@Override
	public SezZoneDevUnderInfo remove(long sezZoneDevUnderInfoId)
		throws NoSuchSezZoneDevUnderInfoException {

		return remove((Serializable)sezZoneDevUnderInfoId);
	}

	/**
	 * Removes the sez zone dev under info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez zone dev under info
	 * @return the sez zone dev under info that was removed
	 * @throws NoSuchSezZoneDevUnderInfoException if a sez zone dev under info with the primary key could not be found
	 */
	@Override
	public SezZoneDevUnderInfo remove(Serializable primaryKey)
		throws NoSuchSezZoneDevUnderInfoException {

		Session session = null;

		try {
			session = openSession();

			SezZoneDevUnderInfo sezZoneDevUnderInfo =
				(SezZoneDevUnderInfo)session.get(
					SezZoneDevUnderInfoImpl.class, primaryKey);

			if (sezZoneDevUnderInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezZoneDevUnderInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezZoneDevUnderInfo);
		}
		catch (NoSuchSezZoneDevUnderInfoException noSuchEntityException) {
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
	protected SezZoneDevUnderInfo removeImpl(
		SezZoneDevUnderInfo sezZoneDevUnderInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezZoneDevUnderInfo)) {
				sezZoneDevUnderInfo = (SezZoneDevUnderInfo)session.get(
					SezZoneDevUnderInfoImpl.class,
					sezZoneDevUnderInfo.getPrimaryKeyObj());
			}

			if (sezZoneDevUnderInfo != null) {
				session.delete(sezZoneDevUnderInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezZoneDevUnderInfo != null) {
			clearCache(sezZoneDevUnderInfo);
		}

		return sezZoneDevUnderInfo;
	}

	@Override
	public SezZoneDevUnderInfo updateImpl(
		SezZoneDevUnderInfo sezZoneDevUnderInfo) {

		boolean isNew = sezZoneDevUnderInfo.isNew();

		if (!(sezZoneDevUnderInfo instanceof SezZoneDevUnderInfoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezZoneDevUnderInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezZoneDevUnderInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezZoneDevUnderInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezZoneDevUnderInfo implementation " +
					sezZoneDevUnderInfo.getClass());
		}

		SezZoneDevUnderInfoModelImpl sezZoneDevUnderInfoModelImpl =
			(SezZoneDevUnderInfoModelImpl)sezZoneDevUnderInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezZoneDevUnderInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezZoneDevUnderInfo.setCreateDate(date);
			}
			else {
				sezZoneDevUnderInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezZoneDevUnderInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezZoneDevUnderInfo.setModifiedDate(date);
			}
			else {
				sezZoneDevUnderInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezZoneDevUnderInfo);
			}
			else {
				sezZoneDevUnderInfo = (SezZoneDevUnderInfo)session.merge(
					sezZoneDevUnderInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezZoneDevUnderInfoImpl.class, sezZoneDevUnderInfoModelImpl, false,
			true);

		cacheUniqueFindersCache(sezZoneDevUnderInfoModelImpl);

		if (isNew) {
			sezZoneDevUnderInfo.setNew(false);
		}

		sezZoneDevUnderInfo.resetOriginalValues();

		return sezZoneDevUnderInfo;
	}

	/**
	 * Returns the sez zone dev under info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez zone dev under info
	 * @return the sez zone dev under info
	 * @throws NoSuchSezZoneDevUnderInfoException if a sez zone dev under info with the primary key could not be found
	 */
	@Override
	public SezZoneDevUnderInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezZoneDevUnderInfoException {

		SezZoneDevUnderInfo sezZoneDevUnderInfo = fetchByPrimaryKey(primaryKey);

		if (sezZoneDevUnderInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezZoneDevUnderInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezZoneDevUnderInfo;
	}

	/**
	 * Returns the sez zone dev under info with the primary key or throws a <code>NoSuchSezZoneDevUnderInfoException</code> if it could not be found.
	 *
	 * @param sezZoneDevUnderInfoId the primary key of the sez zone dev under info
	 * @return the sez zone dev under info
	 * @throws NoSuchSezZoneDevUnderInfoException if a sez zone dev under info with the primary key could not be found
	 */
	@Override
	public SezZoneDevUnderInfo findByPrimaryKey(long sezZoneDevUnderInfoId)
		throws NoSuchSezZoneDevUnderInfoException {

		return findByPrimaryKey((Serializable)sezZoneDevUnderInfoId);
	}

	/**
	 * Returns the sez zone dev under info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneDevUnderInfoId the primary key of the sez zone dev under info
	 * @return the sez zone dev under info, or <code>null</code> if a sez zone dev under info with the primary key could not be found
	 */
	@Override
	public SezZoneDevUnderInfo fetchByPrimaryKey(long sezZoneDevUnderInfoId) {
		return fetchByPrimaryKey((Serializable)sezZoneDevUnderInfoId);
	}

	/**
	 * Returns all the sez zone dev under infos.
	 *
	 * @return the sez zone dev under infos
	 */
	@Override
	public List<SezZoneDevUnderInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez zone dev under infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneDevUnderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone dev under infos
	 * @param end the upper bound of the range of sez zone dev under infos (not inclusive)
	 * @return the range of sez zone dev under infos
	 */
	@Override
	public List<SezZoneDevUnderInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez zone dev under infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneDevUnderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone dev under infos
	 * @param end the upper bound of the range of sez zone dev under infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone dev under infos
	 */
	@Override
	public List<SezZoneDevUnderInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneDevUnderInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez zone dev under infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneDevUnderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone dev under infos
	 * @param end the upper bound of the range of sez zone dev under infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone dev under infos
	 */
	@Override
	public List<SezZoneDevUnderInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneDevUnderInfo> orderByComparator,
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

		List<SezZoneDevUnderInfo> list = null;

		if (useFinderCache) {
			list = (List<SezZoneDevUnderInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZZONEDEVUNDERINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZZONEDEVUNDERINFO;

				sql = sql.concat(SezZoneDevUnderInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezZoneDevUnderInfo>)QueryUtil.list(
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
	 * Removes all the sez zone dev under infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezZoneDevUnderInfo sezZoneDevUnderInfo : findAll()) {
			remove(sezZoneDevUnderInfo);
		}
	}

	/**
	 * Returns the number of sez zone dev under infos.
	 *
	 * @return the number of sez zone dev under infos
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
					_SQL_COUNT_SEZZONEDEVUNDERINFO);

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
		return "sezZoneDevUnderInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZZONEDEVUNDERINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezZoneDevUnderInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez zone dev under info persistence.
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

		_finderPathFetchBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSezStatusByAppId",
			new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		SezZoneDevUnderInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezZoneDevUnderInfoUtil.setPersistence(null);

		entityCache.removeCache(SezZoneDevUnderInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZZONEDEVUNDERINFO =
		"SELECT sezZoneDevUnderInfo FROM SezZoneDevUnderInfo sezZoneDevUnderInfo";

	private static final String _SQL_SELECT_SEZZONEDEVUNDERINFO_WHERE =
		"SELECT sezZoneDevUnderInfo FROM SezZoneDevUnderInfo sezZoneDevUnderInfo WHERE ";

	private static final String _SQL_COUNT_SEZZONEDEVUNDERINFO =
		"SELECT COUNT(sezZoneDevUnderInfo) FROM SezZoneDevUnderInfo sezZoneDevUnderInfo";

	private static final String _SQL_COUNT_SEZZONEDEVUNDERINFO_WHERE =
		"SELECT COUNT(sezZoneDevUnderInfo) FROM SezZoneDevUnderInfo sezZoneDevUnderInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "sezZoneDevUnderInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezZoneDevUnderInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezZoneDevUnderInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezZoneDevUnderInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}