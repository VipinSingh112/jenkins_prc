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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantUserUndertakingInfoException;
import com.nbp.sez.status.application.form.service.model.SezOccupantUserUndertakingInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupantUserUndertakingInfoTable;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupantUserUndertakingInfoImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupantUserUndertakingInfoModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantUserUndertakingInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantUserUndertakingInfoUtil;
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
 * The persistence implementation for the sez occupant user undertaking info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezOccupantUserUndertakingInfoPersistence.class)
public class SezOccupantUserUndertakingInfoPersistenceImpl
	extends BasePersistenceImpl<SezOccupantUserUndertakingInfo>
	implements SezOccupantUserUndertakingInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezOccupantUserUndertakingInfoUtil</code> to access the sez occupant user undertaking info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezOccupantUserUndertakingInfoImpl.class.getName();

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
	 * Returns the sez occupant user undertaking info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupantUserUndertakingInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant user undertaking info
	 * @throws NoSuchSezOccupantUserUndertakingInfoException if a matching sez occupant user undertaking info could not be found
	 */
	@Override
	public SezOccupantUserUndertakingInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupantUserUndertakingInfoException {

		SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo =
			fetchBygetSezStatusByAppId(sezStatusApplicationId);

		if (sezOccupantUserUndertakingInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezOccupantUserUndertakingInfoException(
				sb.toString());
		}

		return sezOccupantUserUndertakingInfo;
	}

	/**
	 * Returns the sez occupant user undertaking info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant user undertaking info, or <code>null</code> if a matching sez occupant user undertaking info could not be found
	 */
	@Override
	public SezOccupantUserUndertakingInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez occupant user undertaking info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant user undertaking info, or <code>null</code> if a matching sez occupant user undertaking info could not be found
	 */
	@Override
	public SezOccupantUserUndertakingInfo fetchBygetSezStatusByAppId(
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

		if (result instanceof SezOccupantUserUndertakingInfo) {
			SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo =
				(SezOccupantUserUndertakingInfo)result;

			if (sezStatusApplicationId !=
					sezOccupantUserUndertakingInfo.
						getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZOCCUPANTUSERUNDERTAKINGINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezOccupantUserUndertakingInfo> list = query.list();

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
								"SezOccupantUserUndertakingInfoPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezOccupantUserUndertakingInfo
						sezOccupantUserUndertakingInfo = list.get(0);

					result = sezOccupantUserUndertakingInfo;

					cacheResult(sezOccupantUserUndertakingInfo);
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
			return (SezOccupantUserUndertakingInfo)result;
		}
	}

	/**
	 * Removes the sez occupant user undertaking info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupant user undertaking info that was removed
	 */
	@Override
	public SezOccupantUserUndertakingInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupantUserUndertakingInfoException {

		SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo =
			findBygetSezStatusByAppId(sezStatusApplicationId);

		return remove(sezOccupantUserUndertakingInfo);
	}

	/**
	 * Returns the number of sez occupant user undertaking infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant user undertaking infos
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZOCCUPANTUSERUNDERTAKINGINFO_WHERE);

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
			"sezOccupantUserUndertakingInfo.sezStatusApplicationId = ?";

	public SezOccupantUserUndertakingInfoPersistenceImpl() {
		setModelClass(SezOccupantUserUndertakingInfo.class);

		setModelImplClass(SezOccupantUserUndertakingInfoImpl.class);
		setModelPKClass(long.class);

		setTable(SezOccupantUserUndertakingInfoTable.INSTANCE);
	}

	/**
	 * Caches the sez occupant user undertaking info in the entity cache if it is enabled.
	 *
	 * @param sezOccupantUserUndertakingInfo the sez occupant user undertaking info
	 */
	@Override
	public void cacheResult(
		SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo) {

		entityCache.putResult(
			SezOccupantUserUndertakingInfoImpl.class,
			sezOccupantUserUndertakingInfo.getPrimaryKey(),
			sezOccupantUserUndertakingInfo);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {
				sezOccupantUserUndertakingInfo.getSezStatusApplicationId()
			},
			sezOccupantUserUndertakingInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez occupant user undertaking infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupantUserUndertakingInfos the sez occupant user undertaking infos
	 */
	@Override
	public void cacheResult(
		List<SezOccupantUserUndertakingInfo> sezOccupantUserUndertakingInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezOccupantUserUndertakingInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo :
				sezOccupantUserUndertakingInfos) {

			if (entityCache.getResult(
					SezOccupantUserUndertakingInfoImpl.class,
					sezOccupantUserUndertakingInfo.getPrimaryKey()) == null) {

				cacheResult(sezOccupantUserUndertakingInfo);
			}
		}
	}

	/**
	 * Clears the cache for all sez occupant user undertaking infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezOccupantUserUndertakingInfoImpl.class);

		finderCache.clearCache(SezOccupantUserUndertakingInfoImpl.class);
	}

	/**
	 * Clears the cache for the sez occupant user undertaking info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo) {

		entityCache.removeResult(
			SezOccupantUserUndertakingInfoImpl.class,
			sezOccupantUserUndertakingInfo);
	}

	@Override
	public void clearCache(
		List<SezOccupantUserUndertakingInfo> sezOccupantUserUndertakingInfos) {

		for (SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo :
				sezOccupantUserUndertakingInfos) {

			entityCache.removeResult(
				SezOccupantUserUndertakingInfoImpl.class,
				sezOccupantUserUndertakingInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezOccupantUserUndertakingInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezOccupantUserUndertakingInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezOccupantUserUndertakingInfoModelImpl
			sezOccupantUserUndertakingInfoModelImpl) {

		Object[] args = new Object[] {
			sezOccupantUserUndertakingInfoModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezOccupantUserUndertakingInfoModelImpl);
	}

	/**
	 * Creates a new sez occupant user undertaking info with the primary key. Does not add the sez occupant user undertaking info to the database.
	 *
	 * @param sezOccUserunderId the primary key for the new sez occupant user undertaking info
	 * @return the new sez occupant user undertaking info
	 */
	@Override
	public SezOccupantUserUndertakingInfo create(long sezOccUserunderId) {
		SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo =
			new SezOccupantUserUndertakingInfoImpl();

		sezOccupantUserUndertakingInfo.setNew(true);
		sezOccupantUserUndertakingInfo.setPrimaryKey(sezOccUserunderId);

		sezOccupantUserUndertakingInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezOccupantUserUndertakingInfo;
	}

	/**
	 * Removes the sez occupant user undertaking info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccUserunderId the primary key of the sez occupant user undertaking info
	 * @return the sez occupant user undertaking info that was removed
	 * @throws NoSuchSezOccupantUserUndertakingInfoException if a sez occupant user undertaking info with the primary key could not be found
	 */
	@Override
	public SezOccupantUserUndertakingInfo remove(long sezOccUserunderId)
		throws NoSuchSezOccupantUserUndertakingInfoException {

		return remove((Serializable)sezOccUserunderId);
	}

	/**
	 * Removes the sez occupant user undertaking info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez occupant user undertaking info
	 * @return the sez occupant user undertaking info that was removed
	 * @throws NoSuchSezOccupantUserUndertakingInfoException if a sez occupant user undertaking info with the primary key could not be found
	 */
	@Override
	public SezOccupantUserUndertakingInfo remove(Serializable primaryKey)
		throws NoSuchSezOccupantUserUndertakingInfoException {

		Session session = null;

		try {
			session = openSession();

			SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo =
				(SezOccupantUserUndertakingInfo)session.get(
					SezOccupantUserUndertakingInfoImpl.class, primaryKey);

			if (sezOccupantUserUndertakingInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezOccupantUserUndertakingInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezOccupantUserUndertakingInfo);
		}
		catch (NoSuchSezOccupantUserUndertakingInfoException
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
	protected SezOccupantUserUndertakingInfo removeImpl(
		SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezOccupantUserUndertakingInfo)) {
				sezOccupantUserUndertakingInfo =
					(SezOccupantUserUndertakingInfo)session.get(
						SezOccupantUserUndertakingInfoImpl.class,
						sezOccupantUserUndertakingInfo.getPrimaryKeyObj());
			}

			if (sezOccupantUserUndertakingInfo != null) {
				session.delete(sezOccupantUserUndertakingInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezOccupantUserUndertakingInfo != null) {
			clearCache(sezOccupantUserUndertakingInfo);
		}

		return sezOccupantUserUndertakingInfo;
	}

	@Override
	public SezOccupantUserUndertakingInfo updateImpl(
		SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo) {

		boolean isNew = sezOccupantUserUndertakingInfo.isNew();

		if (!(sezOccupantUserUndertakingInfo instanceof
				SezOccupantUserUndertakingInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					sezOccupantUserUndertakingInfo.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					sezOccupantUserUndertakingInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezOccupantUserUndertakingInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezOccupantUserUndertakingInfo implementation " +
					sezOccupantUserUndertakingInfo.getClass());
		}

		SezOccupantUserUndertakingInfoModelImpl
			sezOccupantUserUndertakingInfoModelImpl =
				(SezOccupantUserUndertakingInfoModelImpl)
					sezOccupantUserUndertakingInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezOccupantUserUndertakingInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezOccupantUserUndertakingInfo.setCreateDate(date);
			}
			else {
				sezOccupantUserUndertakingInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezOccupantUserUndertakingInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezOccupantUserUndertakingInfo.setModifiedDate(date);
			}
			else {
				sezOccupantUserUndertakingInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezOccupantUserUndertakingInfo);
			}
			else {
				sezOccupantUserUndertakingInfo =
					(SezOccupantUserUndertakingInfo)session.merge(
						sezOccupantUserUndertakingInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezOccupantUserUndertakingInfoImpl.class,
			sezOccupantUserUndertakingInfoModelImpl, false, true);

		cacheUniqueFindersCache(sezOccupantUserUndertakingInfoModelImpl);

		if (isNew) {
			sezOccupantUserUndertakingInfo.setNew(false);
		}

		sezOccupantUserUndertakingInfo.resetOriginalValues();

		return sezOccupantUserUndertakingInfo;
	}

	/**
	 * Returns the sez occupant user undertaking info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez occupant user undertaking info
	 * @return the sez occupant user undertaking info
	 * @throws NoSuchSezOccupantUserUndertakingInfoException if a sez occupant user undertaking info with the primary key could not be found
	 */
	@Override
	public SezOccupantUserUndertakingInfo findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchSezOccupantUserUndertakingInfoException {

		SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo =
			fetchByPrimaryKey(primaryKey);

		if (sezOccupantUserUndertakingInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezOccupantUserUndertakingInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezOccupantUserUndertakingInfo;
	}

	/**
	 * Returns the sez occupant user undertaking info with the primary key or throws a <code>NoSuchSezOccupantUserUndertakingInfoException</code> if it could not be found.
	 *
	 * @param sezOccUserunderId the primary key of the sez occupant user undertaking info
	 * @return the sez occupant user undertaking info
	 * @throws NoSuchSezOccupantUserUndertakingInfoException if a sez occupant user undertaking info with the primary key could not be found
	 */
	@Override
	public SezOccupantUserUndertakingInfo findByPrimaryKey(
			long sezOccUserunderId)
		throws NoSuchSezOccupantUserUndertakingInfoException {

		return findByPrimaryKey((Serializable)sezOccUserunderId);
	}

	/**
	 * Returns the sez occupant user undertaking info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccUserunderId the primary key of the sez occupant user undertaking info
	 * @return the sez occupant user undertaking info, or <code>null</code> if a sez occupant user undertaking info with the primary key could not be found
	 */
	@Override
	public SezOccupantUserUndertakingInfo fetchByPrimaryKey(
		long sezOccUserunderId) {

		return fetchByPrimaryKey((Serializable)sezOccUserunderId);
	}

	/**
	 * Returns all the sez occupant user undertaking infos.
	 *
	 * @return the sez occupant user undertaking infos
	 */
	@Override
	public List<SezOccupantUserUndertakingInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez occupant user undertaking infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantUserUndertakingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant user undertaking infos
	 * @param end the upper bound of the range of sez occupant user undertaking infos (not inclusive)
	 * @return the range of sez occupant user undertaking infos
	 */
	@Override
	public List<SezOccupantUserUndertakingInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez occupant user undertaking infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantUserUndertakingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant user undertaking infos
	 * @param end the upper bound of the range of sez occupant user undertaking infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant user undertaking infos
	 */
	@Override
	public List<SezOccupantUserUndertakingInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantUserUndertakingInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez occupant user undertaking infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantUserUndertakingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant user undertaking infos
	 * @param end the upper bound of the range of sez occupant user undertaking infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant user undertaking infos
	 */
	@Override
	public List<SezOccupantUserUndertakingInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantUserUndertakingInfo> orderByComparator,
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

		List<SezOccupantUserUndertakingInfo> list = null;

		if (useFinderCache) {
			list = (List<SezOccupantUserUndertakingInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZOCCUPANTUSERUNDERTAKINGINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZOCCUPANTUSERUNDERTAKINGINFO;

				sql = sql.concat(
					SezOccupantUserUndertakingInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezOccupantUserUndertakingInfo>)QueryUtil.list(
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
	 * Removes all the sez occupant user undertaking infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo :
				findAll()) {

			remove(sezOccupantUserUndertakingInfo);
		}
	}

	/**
	 * Returns the number of sez occupant user undertaking infos.
	 *
	 * @return the number of sez occupant user undertaking infos
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
					_SQL_COUNT_SEZOCCUPANTUSERUNDERTAKINGINFO);

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
		return "sezOccUserunderId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZOCCUPANTUSERUNDERTAKINGINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezOccupantUserUndertakingInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez occupant user undertaking info persistence.
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

		SezOccupantUserUndertakingInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezOccupantUserUndertakingInfoUtil.setPersistence(null);

		entityCache.removeCache(
			SezOccupantUserUndertakingInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZOCCUPANTUSERUNDERTAKINGINFO =
		"SELECT sezOccupantUserUndertakingInfo FROM SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo";

	private static final String
		_SQL_SELECT_SEZOCCUPANTUSERUNDERTAKINGINFO_WHERE =
			"SELECT sezOccupantUserUndertakingInfo FROM SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo WHERE ";

	private static final String _SQL_COUNT_SEZOCCUPANTUSERUNDERTAKINGINFO =
		"SELECT COUNT(sezOccupantUserUndertakingInfo) FROM SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo";

	private static final String
		_SQL_COUNT_SEZOCCUPANTUSERUNDERTAKINGINFO_WHERE =
			"SELECT COUNT(sezOccupantUserUndertakingInfo) FROM SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezOccupantUserUndertakingInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezOccupantUserUndertakingInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezOccupantUserUndertakingInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezOccupantUserUndertakingInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}