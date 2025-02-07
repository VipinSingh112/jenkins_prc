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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupanteDeveloperUndertakingInfoException;
import com.nbp.sez.status.application.form.service.model.SezOccupanteDeveloperUndertakingInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupanteDeveloperUndertakingInfoTable;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupanteDeveloperUndertakingInfoImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupanteDeveloperUndertakingInfoModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupanteDeveloperUndertakingInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupanteDeveloperUndertakingInfoUtil;
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
 * The persistence implementation for the sez occupante developer undertaking info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezOccupanteDeveloperUndertakingInfoPersistence.class)
public class SezOccupanteDeveloperUndertakingInfoPersistenceImpl
	extends BasePersistenceImpl<SezOccupanteDeveloperUndertakingInfo>
	implements SezOccupanteDeveloperUndertakingInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezOccupanteDeveloperUndertakingInfoUtil</code> to access the sez occupante developer undertaking info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezOccupanteDeveloperUndertakingInfoImpl.class.getName();

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
	 * Returns the sez occupante developer undertaking info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupanteDeveloperUndertakingInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupante developer undertaking info
	 * @throws NoSuchSezOccupanteDeveloperUndertakingInfoException if a matching sez occupante developer undertaking info could not be found
	 */
	@Override
	public SezOccupanteDeveloperUndertakingInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupanteDeveloperUndertakingInfoException {

		SezOccupanteDeveloperUndertakingInfo
			sezOccupanteDeveloperUndertakingInfo = fetchBygetSezStatusByAppId(
				sezStatusApplicationId);

		if (sezOccupanteDeveloperUndertakingInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezOccupanteDeveloperUndertakingInfoException(
				sb.toString());
		}

		return sezOccupanteDeveloperUndertakingInfo;
	}

	/**
	 * Returns the sez occupante developer undertaking info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupante developer undertaking info, or <code>null</code> if a matching sez occupante developer undertaking info could not be found
	 */
	@Override
	public SezOccupanteDeveloperUndertakingInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez occupante developer undertaking info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupante developer undertaking info, or <code>null</code> if a matching sez occupante developer undertaking info could not be found
	 */
	@Override
	public SezOccupanteDeveloperUndertakingInfo fetchBygetSezStatusByAppId(
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

		if (result instanceof SezOccupanteDeveloperUndertakingInfo) {
			SezOccupanteDeveloperUndertakingInfo
				sezOccupanteDeveloperUndertakingInfo =
					(SezOccupanteDeveloperUndertakingInfo)result;

			if (sezStatusApplicationId !=
					sezOccupanteDeveloperUndertakingInfo.
						getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZOCCUPANTEDEVELOPERUNDERTAKINGINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezOccupanteDeveloperUndertakingInfo> list = query.list();

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
								"SezOccupanteDeveloperUndertakingInfoPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezOccupanteDeveloperUndertakingInfo
						sezOccupanteDeveloperUndertakingInfo = list.get(0);

					result = sezOccupanteDeveloperUndertakingInfo;

					cacheResult(sezOccupanteDeveloperUndertakingInfo);
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
			return (SezOccupanteDeveloperUndertakingInfo)result;
		}
	}

	/**
	 * Removes the sez occupante developer undertaking info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupante developer undertaking info that was removed
	 */
	@Override
	public SezOccupanteDeveloperUndertakingInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupanteDeveloperUndertakingInfoException {

		SezOccupanteDeveloperUndertakingInfo
			sezOccupanteDeveloperUndertakingInfo = findBygetSezStatusByAppId(
				sezStatusApplicationId);

		return remove(sezOccupanteDeveloperUndertakingInfo);
	}

	/**
	 * Returns the number of sez occupante developer undertaking infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupante developer undertaking infos
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZOCCUPANTEDEVELOPERUNDERTAKINGINFO_WHERE);

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
			"sezOccupanteDeveloperUndertakingInfo.sezStatusApplicationId = ?";

	public SezOccupanteDeveloperUndertakingInfoPersistenceImpl() {
		setModelClass(SezOccupanteDeveloperUndertakingInfo.class);

		setModelImplClass(SezOccupanteDeveloperUndertakingInfoImpl.class);
		setModelPKClass(long.class);

		setTable(SezOccupanteDeveloperUndertakingInfoTable.INSTANCE);
	}

	/**
	 * Caches the sez occupante developer undertaking info in the entity cache if it is enabled.
	 *
	 * @param sezOccupanteDeveloperUndertakingInfo the sez occupante developer undertaking info
	 */
	@Override
	public void cacheResult(
		SezOccupanteDeveloperUndertakingInfo
			sezOccupanteDeveloperUndertakingInfo) {

		entityCache.putResult(
			SezOccupanteDeveloperUndertakingInfoImpl.class,
			sezOccupanteDeveloperUndertakingInfo.getPrimaryKey(),
			sezOccupanteDeveloperUndertakingInfo);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {
				sezOccupanteDeveloperUndertakingInfo.getSezStatusApplicationId()
			},
			sezOccupanteDeveloperUndertakingInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez occupante developer undertaking infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupanteDeveloperUndertakingInfos the sez occupante developer undertaking infos
	 */
	@Override
	public void cacheResult(
		List<SezOccupanteDeveloperUndertakingInfo>
			sezOccupanteDeveloperUndertakingInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezOccupanteDeveloperUndertakingInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezOccupanteDeveloperUndertakingInfo
				sezOccupanteDeveloperUndertakingInfo :
					sezOccupanteDeveloperUndertakingInfos) {

			if (entityCache.getResult(
					SezOccupanteDeveloperUndertakingInfoImpl.class,
					sezOccupanteDeveloperUndertakingInfo.getPrimaryKey()) ==
						null) {

				cacheResult(sezOccupanteDeveloperUndertakingInfo);
			}
		}
	}

	/**
	 * Clears the cache for all sez occupante developer undertaking infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezOccupanteDeveloperUndertakingInfoImpl.class);

		finderCache.clearCache(SezOccupanteDeveloperUndertakingInfoImpl.class);
	}

	/**
	 * Clears the cache for the sez occupante developer undertaking info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezOccupanteDeveloperUndertakingInfo
			sezOccupanteDeveloperUndertakingInfo) {

		entityCache.removeResult(
			SezOccupanteDeveloperUndertakingInfoImpl.class,
			sezOccupanteDeveloperUndertakingInfo);
	}

	@Override
	public void clearCache(
		List<SezOccupanteDeveloperUndertakingInfo>
			sezOccupanteDeveloperUndertakingInfos) {

		for (SezOccupanteDeveloperUndertakingInfo
				sezOccupanteDeveloperUndertakingInfo :
					sezOccupanteDeveloperUndertakingInfos) {

			entityCache.removeResult(
				SezOccupanteDeveloperUndertakingInfoImpl.class,
				sezOccupanteDeveloperUndertakingInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezOccupanteDeveloperUndertakingInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezOccupanteDeveloperUndertakingInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezOccupanteDeveloperUndertakingInfoModelImpl
			sezOccupanteDeveloperUndertakingInfoModelImpl) {

		Object[] args = new Object[] {
			sezOccupanteDeveloperUndertakingInfoModelImpl.
				getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezOccupanteDeveloperUndertakingInfoModelImpl);
	}

	/**
	 * Creates a new sez occupante developer undertaking info with the primary key. Does not add the sez occupante developer undertaking info to the database.
	 *
	 * @param sezOccDevUnderId the primary key for the new sez occupante developer undertaking info
	 * @return the new sez occupante developer undertaking info
	 */
	@Override
	public SezOccupanteDeveloperUndertakingInfo create(long sezOccDevUnderId) {
		SezOccupanteDeveloperUndertakingInfo
			sezOccupanteDeveloperUndertakingInfo =
				new SezOccupanteDeveloperUndertakingInfoImpl();

		sezOccupanteDeveloperUndertakingInfo.setNew(true);
		sezOccupanteDeveloperUndertakingInfo.setPrimaryKey(sezOccDevUnderId);

		sezOccupanteDeveloperUndertakingInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezOccupanteDeveloperUndertakingInfo;
	}

	/**
	 * Removes the sez occupante developer undertaking info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccDevUnderId the primary key of the sez occupante developer undertaking info
	 * @return the sez occupante developer undertaking info that was removed
	 * @throws NoSuchSezOccupanteDeveloperUndertakingInfoException if a sez occupante developer undertaking info with the primary key could not be found
	 */
	@Override
	public SezOccupanteDeveloperUndertakingInfo remove(long sezOccDevUnderId)
		throws NoSuchSezOccupanteDeveloperUndertakingInfoException {

		return remove((Serializable)sezOccDevUnderId);
	}

	/**
	 * Removes the sez occupante developer undertaking info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez occupante developer undertaking info
	 * @return the sez occupante developer undertaking info that was removed
	 * @throws NoSuchSezOccupanteDeveloperUndertakingInfoException if a sez occupante developer undertaking info with the primary key could not be found
	 */
	@Override
	public SezOccupanteDeveloperUndertakingInfo remove(Serializable primaryKey)
		throws NoSuchSezOccupanteDeveloperUndertakingInfoException {

		Session session = null;

		try {
			session = openSession();

			SezOccupanteDeveloperUndertakingInfo
				sezOccupanteDeveloperUndertakingInfo =
					(SezOccupanteDeveloperUndertakingInfo)session.get(
						SezOccupanteDeveloperUndertakingInfoImpl.class,
						primaryKey);

			if (sezOccupanteDeveloperUndertakingInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezOccupanteDeveloperUndertakingInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezOccupanteDeveloperUndertakingInfo);
		}
		catch (NoSuchSezOccupanteDeveloperUndertakingInfoException
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
	protected SezOccupanteDeveloperUndertakingInfo removeImpl(
		SezOccupanteDeveloperUndertakingInfo
			sezOccupanteDeveloperUndertakingInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezOccupanteDeveloperUndertakingInfo)) {
				sezOccupanteDeveloperUndertakingInfo =
					(SezOccupanteDeveloperUndertakingInfo)session.get(
						SezOccupanteDeveloperUndertakingInfoImpl.class,
						sezOccupanteDeveloperUndertakingInfo.
							getPrimaryKeyObj());
			}

			if (sezOccupanteDeveloperUndertakingInfo != null) {
				session.delete(sezOccupanteDeveloperUndertakingInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezOccupanteDeveloperUndertakingInfo != null) {
			clearCache(sezOccupanteDeveloperUndertakingInfo);
		}

		return sezOccupanteDeveloperUndertakingInfo;
	}

	@Override
	public SezOccupanteDeveloperUndertakingInfo updateImpl(
		SezOccupanteDeveloperUndertakingInfo
			sezOccupanteDeveloperUndertakingInfo) {

		boolean isNew = sezOccupanteDeveloperUndertakingInfo.isNew();

		if (!(sezOccupanteDeveloperUndertakingInfo instanceof
				SezOccupanteDeveloperUndertakingInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					sezOccupanteDeveloperUndertakingInfo.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					sezOccupanteDeveloperUndertakingInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezOccupanteDeveloperUndertakingInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezOccupanteDeveloperUndertakingInfo implementation " +
					sezOccupanteDeveloperUndertakingInfo.getClass());
		}

		SezOccupanteDeveloperUndertakingInfoModelImpl
			sezOccupanteDeveloperUndertakingInfoModelImpl =
				(SezOccupanteDeveloperUndertakingInfoModelImpl)
					sezOccupanteDeveloperUndertakingInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(sezOccupanteDeveloperUndertakingInfo.getCreateDate() == null)) {

			if (serviceContext == null) {
				sezOccupanteDeveloperUndertakingInfo.setCreateDate(date);
			}
			else {
				sezOccupanteDeveloperUndertakingInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezOccupanteDeveloperUndertakingInfoModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				sezOccupanteDeveloperUndertakingInfo.setModifiedDate(date);
			}
			else {
				sezOccupanteDeveloperUndertakingInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezOccupanteDeveloperUndertakingInfo);
			}
			else {
				sezOccupanteDeveloperUndertakingInfo =
					(SezOccupanteDeveloperUndertakingInfo)session.merge(
						sezOccupanteDeveloperUndertakingInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezOccupanteDeveloperUndertakingInfoImpl.class,
			sezOccupanteDeveloperUndertakingInfoModelImpl, false, true);

		cacheUniqueFindersCache(sezOccupanteDeveloperUndertakingInfoModelImpl);

		if (isNew) {
			sezOccupanteDeveloperUndertakingInfo.setNew(false);
		}

		sezOccupanteDeveloperUndertakingInfo.resetOriginalValues();

		return sezOccupanteDeveloperUndertakingInfo;
	}

	/**
	 * Returns the sez occupante developer undertaking info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez occupante developer undertaking info
	 * @return the sez occupante developer undertaking info
	 * @throws NoSuchSezOccupanteDeveloperUndertakingInfoException if a sez occupante developer undertaking info with the primary key could not be found
	 */
	@Override
	public SezOccupanteDeveloperUndertakingInfo findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchSezOccupanteDeveloperUndertakingInfoException {

		SezOccupanteDeveloperUndertakingInfo
			sezOccupanteDeveloperUndertakingInfo = fetchByPrimaryKey(
				primaryKey);

		if (sezOccupanteDeveloperUndertakingInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezOccupanteDeveloperUndertakingInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezOccupanteDeveloperUndertakingInfo;
	}

	/**
	 * Returns the sez occupante developer undertaking info with the primary key or throws a <code>NoSuchSezOccupanteDeveloperUndertakingInfoException</code> if it could not be found.
	 *
	 * @param sezOccDevUnderId the primary key of the sez occupante developer undertaking info
	 * @return the sez occupante developer undertaking info
	 * @throws NoSuchSezOccupanteDeveloperUndertakingInfoException if a sez occupante developer undertaking info with the primary key could not be found
	 */
	@Override
	public SezOccupanteDeveloperUndertakingInfo findByPrimaryKey(
			long sezOccDevUnderId)
		throws NoSuchSezOccupanteDeveloperUndertakingInfoException {

		return findByPrimaryKey((Serializable)sezOccDevUnderId);
	}

	/**
	 * Returns the sez occupante developer undertaking info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccDevUnderId the primary key of the sez occupante developer undertaking info
	 * @return the sez occupante developer undertaking info, or <code>null</code> if a sez occupante developer undertaking info with the primary key could not be found
	 */
	@Override
	public SezOccupanteDeveloperUndertakingInfo fetchByPrimaryKey(
		long sezOccDevUnderId) {

		return fetchByPrimaryKey((Serializable)sezOccDevUnderId);
	}

	/**
	 * Returns all the sez occupante developer undertaking infos.
	 *
	 * @return the sez occupante developer undertaking infos
	 */
	@Override
	public List<SezOccupanteDeveloperUndertakingInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez occupante developer undertaking infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupanteDeveloperUndertakingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupante developer undertaking infos
	 * @param end the upper bound of the range of sez occupante developer undertaking infos (not inclusive)
	 * @return the range of sez occupante developer undertaking infos
	 */
	@Override
	public List<SezOccupanteDeveloperUndertakingInfo> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez occupante developer undertaking infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupanteDeveloperUndertakingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupante developer undertaking infos
	 * @param end the upper bound of the range of sez occupante developer undertaking infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupante developer undertaking infos
	 */
	@Override
	public List<SezOccupanteDeveloperUndertakingInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupanteDeveloperUndertakingInfo>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez occupante developer undertaking infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupanteDeveloperUndertakingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupante developer undertaking infos
	 * @param end the upper bound of the range of sez occupante developer undertaking infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupante developer undertaking infos
	 */
	@Override
	public List<SezOccupanteDeveloperUndertakingInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupanteDeveloperUndertakingInfo>
			orderByComparator,
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

		List<SezOccupanteDeveloperUndertakingInfo> list = null;

		if (useFinderCache) {
			list =
				(List<SezOccupanteDeveloperUndertakingInfo>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZOCCUPANTEDEVELOPERUNDERTAKINGINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZOCCUPANTEDEVELOPERUNDERTAKINGINFO;

				sql = sql.concat(
					SezOccupanteDeveloperUndertakingInfoModelImpl.
						ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<SezOccupanteDeveloperUndertakingInfo>)QueryUtil.list(
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
	 * Removes all the sez occupante developer undertaking infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezOccupanteDeveloperUndertakingInfo
				sezOccupanteDeveloperUndertakingInfo : findAll()) {

			remove(sezOccupanteDeveloperUndertakingInfo);
		}
	}

	/**
	 * Returns the number of sez occupante developer undertaking infos.
	 *
	 * @return the number of sez occupante developer undertaking infos
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
					_SQL_COUNT_SEZOCCUPANTEDEVELOPERUNDERTAKINGINFO);

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
		return "sezOccDevUnderId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZOCCUPANTEDEVELOPERUNDERTAKINGINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezOccupanteDeveloperUndertakingInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez occupante developer undertaking info persistence.
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

		SezOccupanteDeveloperUndertakingInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezOccupanteDeveloperUndertakingInfoUtil.setPersistence(null);

		entityCache.removeCache(
			SezOccupanteDeveloperUndertakingInfoImpl.class.getName());
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

	private static final String
		_SQL_SELECT_SEZOCCUPANTEDEVELOPERUNDERTAKINGINFO =
			"SELECT sezOccupanteDeveloperUndertakingInfo FROM SezOccupanteDeveloperUndertakingInfo sezOccupanteDeveloperUndertakingInfo";

	private static final String
		_SQL_SELECT_SEZOCCUPANTEDEVELOPERUNDERTAKINGINFO_WHERE =
			"SELECT sezOccupanteDeveloperUndertakingInfo FROM SezOccupanteDeveloperUndertakingInfo sezOccupanteDeveloperUndertakingInfo WHERE ";

	private static final String
		_SQL_COUNT_SEZOCCUPANTEDEVELOPERUNDERTAKINGINFO =
			"SELECT COUNT(sezOccupanteDeveloperUndertakingInfo) FROM SezOccupanteDeveloperUndertakingInfo sezOccupanteDeveloperUndertakingInfo";

	private static final String
		_SQL_COUNT_SEZOCCUPANTEDEVELOPERUNDERTAKINGINFO_WHERE =
			"SELECT COUNT(sezOccupanteDeveloperUndertakingInfo) FROM SezOccupanteDeveloperUndertakingInfo sezOccupanteDeveloperUndertakingInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezOccupanteDeveloperUndertakingInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezOccupanteDeveloperUndertakingInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezOccupanteDeveloperUndertakingInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezOccupanteDeveloperUndertakingInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}