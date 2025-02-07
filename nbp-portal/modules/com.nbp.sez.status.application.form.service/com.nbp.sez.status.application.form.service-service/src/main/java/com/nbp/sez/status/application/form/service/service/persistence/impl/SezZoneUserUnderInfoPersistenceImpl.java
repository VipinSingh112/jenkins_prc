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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneUserUnderInfoException;
import com.nbp.sez.status.application.form.service.model.SezZoneUserUnderInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneUserUnderInfoTable;
import com.nbp.sez.status.application.form.service.model.impl.SezZoneUserUnderInfoImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezZoneUserUnderInfoModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneUserUnderInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneUserUnderInfoUtil;
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
 * The persistence implementation for the sez zone user under info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezZoneUserUnderInfoPersistence.class)
public class SezZoneUserUnderInfoPersistenceImpl
	extends BasePersistenceImpl<SezZoneUserUnderInfo>
	implements SezZoneUserUnderInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezZoneUserUnderInfoUtil</code> to access the sez zone user under info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezZoneUserUnderInfoImpl.class.getName();

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
	 * Returns the sez zone user under info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezZoneUserUnderInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone user under info
	 * @throws NoSuchSezZoneUserUnderInfoException if a matching sez zone user under info could not be found
	 */
	@Override
	public SezZoneUserUnderInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneUserUnderInfoException {

		SezZoneUserUnderInfo sezZoneUserUnderInfo = fetchBygetSezStatusByAppId(
			sezStatusApplicationId);

		if (sezZoneUserUnderInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezZoneUserUnderInfoException(sb.toString());
		}

		return sezZoneUserUnderInfo;
	}

	/**
	 * Returns the sez zone user under info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone user under info, or <code>null</code> if a matching sez zone user under info could not be found
	 */
	@Override
	public SezZoneUserUnderInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez zone user under info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone user under info, or <code>null</code> if a matching sez zone user under info could not be found
	 */
	@Override
	public SezZoneUserUnderInfo fetchBygetSezStatusByAppId(
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

		if (result instanceof SezZoneUserUnderInfo) {
			SezZoneUserUnderInfo sezZoneUserUnderInfo =
				(SezZoneUserUnderInfo)result;

			if (sezStatusApplicationId !=
					sezZoneUserUnderInfo.getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZZONEUSERUNDERINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezZoneUserUnderInfo> list = query.list();

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
								"SezZoneUserUnderInfoPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezZoneUserUnderInfo sezZoneUserUnderInfo = list.get(0);

					result = sezZoneUserUnderInfo;

					cacheResult(sezZoneUserUnderInfo);
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
			return (SezZoneUserUnderInfo)result;
		}
	}

	/**
	 * Removes the sez zone user under info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez zone user under info that was removed
	 */
	@Override
	public SezZoneUserUnderInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneUserUnderInfoException {

		SezZoneUserUnderInfo sezZoneUserUnderInfo = findBygetSezStatusByAppId(
			sezStatusApplicationId);

		return remove(sezZoneUserUnderInfo);
	}

	/**
	 * Returns the number of sez zone user under infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone user under infos
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZZONEUSERUNDERINFO_WHERE);

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
			"sezZoneUserUnderInfo.sezStatusApplicationId = ?";

	public SezZoneUserUnderInfoPersistenceImpl() {
		setModelClass(SezZoneUserUnderInfo.class);

		setModelImplClass(SezZoneUserUnderInfoImpl.class);
		setModelPKClass(long.class);

		setTable(SezZoneUserUnderInfoTable.INSTANCE);
	}

	/**
	 * Caches the sez zone user under info in the entity cache if it is enabled.
	 *
	 * @param sezZoneUserUnderInfo the sez zone user under info
	 */
	@Override
	public void cacheResult(SezZoneUserUnderInfo sezZoneUserUnderInfo) {
		entityCache.putResult(
			SezZoneUserUnderInfoImpl.class,
			sezZoneUserUnderInfo.getPrimaryKey(), sezZoneUserUnderInfo);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {sezZoneUserUnderInfo.getSezStatusApplicationId()},
			sezZoneUserUnderInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez zone user under infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneUserUnderInfos the sez zone user under infos
	 */
	@Override
	public void cacheResult(List<SezZoneUserUnderInfo> sezZoneUserUnderInfos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezZoneUserUnderInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezZoneUserUnderInfo sezZoneUserUnderInfo :
				sezZoneUserUnderInfos) {

			if (entityCache.getResult(
					SezZoneUserUnderInfoImpl.class,
					sezZoneUserUnderInfo.getPrimaryKey()) == null) {

				cacheResult(sezZoneUserUnderInfo);
			}
		}
	}

	/**
	 * Clears the cache for all sez zone user under infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezZoneUserUnderInfoImpl.class);

		finderCache.clearCache(SezZoneUserUnderInfoImpl.class);
	}

	/**
	 * Clears the cache for the sez zone user under info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezZoneUserUnderInfo sezZoneUserUnderInfo) {
		entityCache.removeResult(
			SezZoneUserUnderInfoImpl.class, sezZoneUserUnderInfo);
	}

	@Override
	public void clearCache(List<SezZoneUserUnderInfo> sezZoneUserUnderInfos) {
		for (SezZoneUserUnderInfo sezZoneUserUnderInfo :
				sezZoneUserUnderInfos) {

			entityCache.removeResult(
				SezZoneUserUnderInfoImpl.class, sezZoneUserUnderInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezZoneUserUnderInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezZoneUserUnderInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezZoneUserUnderInfoModelImpl sezZoneUserUnderInfoModelImpl) {

		Object[] args = new Object[] {
			sezZoneUserUnderInfoModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezZoneUserUnderInfoModelImpl);
	}

	/**
	 * Creates a new sez zone user under info with the primary key. Does not add the sez zone user under info to the database.
	 *
	 * @param sezZoneUserUnderInfoId the primary key for the new sez zone user under info
	 * @return the new sez zone user under info
	 */
	@Override
	public SezZoneUserUnderInfo create(long sezZoneUserUnderInfoId) {
		SezZoneUserUnderInfo sezZoneUserUnderInfo =
			new SezZoneUserUnderInfoImpl();

		sezZoneUserUnderInfo.setNew(true);
		sezZoneUserUnderInfo.setPrimaryKey(sezZoneUserUnderInfoId);

		sezZoneUserUnderInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sezZoneUserUnderInfo;
	}

	/**
	 * Removes the sez zone user under info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneUserUnderInfoId the primary key of the sez zone user under info
	 * @return the sez zone user under info that was removed
	 * @throws NoSuchSezZoneUserUnderInfoException if a sez zone user under info with the primary key could not be found
	 */
	@Override
	public SezZoneUserUnderInfo remove(long sezZoneUserUnderInfoId)
		throws NoSuchSezZoneUserUnderInfoException {

		return remove((Serializable)sezZoneUserUnderInfoId);
	}

	/**
	 * Removes the sez zone user under info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez zone user under info
	 * @return the sez zone user under info that was removed
	 * @throws NoSuchSezZoneUserUnderInfoException if a sez zone user under info with the primary key could not be found
	 */
	@Override
	public SezZoneUserUnderInfo remove(Serializable primaryKey)
		throws NoSuchSezZoneUserUnderInfoException {

		Session session = null;

		try {
			session = openSession();

			SezZoneUserUnderInfo sezZoneUserUnderInfo =
				(SezZoneUserUnderInfo)session.get(
					SezZoneUserUnderInfoImpl.class, primaryKey);

			if (sezZoneUserUnderInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezZoneUserUnderInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezZoneUserUnderInfo);
		}
		catch (NoSuchSezZoneUserUnderInfoException noSuchEntityException) {
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
	protected SezZoneUserUnderInfo removeImpl(
		SezZoneUserUnderInfo sezZoneUserUnderInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezZoneUserUnderInfo)) {
				sezZoneUserUnderInfo = (SezZoneUserUnderInfo)session.get(
					SezZoneUserUnderInfoImpl.class,
					sezZoneUserUnderInfo.getPrimaryKeyObj());
			}

			if (sezZoneUserUnderInfo != null) {
				session.delete(sezZoneUserUnderInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezZoneUserUnderInfo != null) {
			clearCache(sezZoneUserUnderInfo);
		}

		return sezZoneUserUnderInfo;
	}

	@Override
	public SezZoneUserUnderInfo updateImpl(
		SezZoneUserUnderInfo sezZoneUserUnderInfo) {

		boolean isNew = sezZoneUserUnderInfo.isNew();

		if (!(sezZoneUserUnderInfo instanceof SezZoneUserUnderInfoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezZoneUserUnderInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezZoneUserUnderInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezZoneUserUnderInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezZoneUserUnderInfo implementation " +
					sezZoneUserUnderInfo.getClass());
		}

		SezZoneUserUnderInfoModelImpl sezZoneUserUnderInfoModelImpl =
			(SezZoneUserUnderInfoModelImpl)sezZoneUserUnderInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezZoneUserUnderInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezZoneUserUnderInfo.setCreateDate(date);
			}
			else {
				sezZoneUserUnderInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezZoneUserUnderInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezZoneUserUnderInfo.setModifiedDate(date);
			}
			else {
				sezZoneUserUnderInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezZoneUserUnderInfo);
			}
			else {
				sezZoneUserUnderInfo = (SezZoneUserUnderInfo)session.merge(
					sezZoneUserUnderInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezZoneUserUnderInfoImpl.class, sezZoneUserUnderInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(sezZoneUserUnderInfoModelImpl);

		if (isNew) {
			sezZoneUserUnderInfo.setNew(false);
		}

		sezZoneUserUnderInfo.resetOriginalValues();

		return sezZoneUserUnderInfo;
	}

	/**
	 * Returns the sez zone user under info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez zone user under info
	 * @return the sez zone user under info
	 * @throws NoSuchSezZoneUserUnderInfoException if a sez zone user under info with the primary key could not be found
	 */
	@Override
	public SezZoneUserUnderInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezZoneUserUnderInfoException {

		SezZoneUserUnderInfo sezZoneUserUnderInfo = fetchByPrimaryKey(
			primaryKey);

		if (sezZoneUserUnderInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezZoneUserUnderInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezZoneUserUnderInfo;
	}

	/**
	 * Returns the sez zone user under info with the primary key or throws a <code>NoSuchSezZoneUserUnderInfoException</code> if it could not be found.
	 *
	 * @param sezZoneUserUnderInfoId the primary key of the sez zone user under info
	 * @return the sez zone user under info
	 * @throws NoSuchSezZoneUserUnderInfoException if a sez zone user under info with the primary key could not be found
	 */
	@Override
	public SezZoneUserUnderInfo findByPrimaryKey(long sezZoneUserUnderInfoId)
		throws NoSuchSezZoneUserUnderInfoException {

		return findByPrimaryKey((Serializable)sezZoneUserUnderInfoId);
	}

	/**
	 * Returns the sez zone user under info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneUserUnderInfoId the primary key of the sez zone user under info
	 * @return the sez zone user under info, or <code>null</code> if a sez zone user under info with the primary key could not be found
	 */
	@Override
	public SezZoneUserUnderInfo fetchByPrimaryKey(long sezZoneUserUnderInfoId) {
		return fetchByPrimaryKey((Serializable)sezZoneUserUnderInfoId);
	}

	/**
	 * Returns all the sez zone user under infos.
	 *
	 * @return the sez zone user under infos
	 */
	@Override
	public List<SezZoneUserUnderInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez zone user under infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneUserUnderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone user under infos
	 * @param end the upper bound of the range of sez zone user under infos (not inclusive)
	 * @return the range of sez zone user under infos
	 */
	@Override
	public List<SezZoneUserUnderInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez zone user under infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneUserUnderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone user under infos
	 * @param end the upper bound of the range of sez zone user under infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone user under infos
	 */
	@Override
	public List<SezZoneUserUnderInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneUserUnderInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez zone user under infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneUserUnderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone user under infos
	 * @param end the upper bound of the range of sez zone user under infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone user under infos
	 */
	@Override
	public List<SezZoneUserUnderInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneUserUnderInfo> orderByComparator,
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

		List<SezZoneUserUnderInfo> list = null;

		if (useFinderCache) {
			list = (List<SezZoneUserUnderInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZZONEUSERUNDERINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZZONEUSERUNDERINFO;

				sql = sql.concat(SezZoneUserUnderInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezZoneUserUnderInfo>)QueryUtil.list(
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
	 * Removes all the sez zone user under infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezZoneUserUnderInfo sezZoneUserUnderInfo : findAll()) {
			remove(sezZoneUserUnderInfo);
		}
	}

	/**
	 * Returns the number of sez zone user under infos.
	 *
	 * @return the number of sez zone user under infos
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
					_SQL_COUNT_SEZZONEUSERUNDERINFO);

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
		return "sezZoneUserUnderInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZZONEUSERUNDERINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezZoneUserUnderInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez zone user under info persistence.
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

		SezZoneUserUnderInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezZoneUserUnderInfoUtil.setPersistence(null);

		entityCache.removeCache(SezZoneUserUnderInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZZONEUSERUNDERINFO =
		"SELECT sezZoneUserUnderInfo FROM SezZoneUserUnderInfo sezZoneUserUnderInfo";

	private static final String _SQL_SELECT_SEZZONEUSERUNDERINFO_WHERE =
		"SELECT sezZoneUserUnderInfo FROM SezZoneUserUnderInfo sezZoneUserUnderInfo WHERE ";

	private static final String _SQL_COUNT_SEZZONEUSERUNDERINFO =
		"SELECT COUNT(sezZoneUserUnderInfo) FROM SezZoneUserUnderInfo sezZoneUserUnderInfo";

	private static final String _SQL_COUNT_SEZZONEUSERUNDERINFO_WHERE =
		"SELECT COUNT(sezZoneUserUnderInfo) FROM SezZoneUserUnderInfo sezZoneUserUnderInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezZoneUserUnderInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezZoneUserUnderInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezZoneUserUnderInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezZoneUserUnderInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}