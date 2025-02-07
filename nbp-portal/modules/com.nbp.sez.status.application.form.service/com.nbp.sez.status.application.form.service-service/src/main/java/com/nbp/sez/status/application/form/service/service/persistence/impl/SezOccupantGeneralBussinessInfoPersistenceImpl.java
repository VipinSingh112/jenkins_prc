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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantGeneralBussinessInfoException;
import com.nbp.sez.status.application.form.service.model.SezOccupantGeneralBussinessInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupantGeneralBussinessInfoTable;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupantGeneralBussinessInfoImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupantGeneralBussinessInfoModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantGeneralBussinessInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantGeneralBussinessInfoUtil;
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
 * The persistence implementation for the sez occupant general bussiness info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezOccupantGeneralBussinessInfoPersistence.class)
public class SezOccupantGeneralBussinessInfoPersistenceImpl
	extends BasePersistenceImpl<SezOccupantGeneralBussinessInfo>
	implements SezOccupantGeneralBussinessInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezOccupantGeneralBussinessInfoUtil</code> to access the sez occupant general bussiness info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezOccupantGeneralBussinessInfoImpl.class.getName();

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
	 * Returns the sez occupant general bussiness info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupantGeneralBussinessInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant general bussiness info
	 * @throws NoSuchSezOccupantGeneralBussinessInfoException if a matching sez occupant general bussiness info could not be found
	 */
	@Override
	public SezOccupantGeneralBussinessInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupantGeneralBussinessInfoException {

		SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo =
			fetchBygetSezStatusByAppId(sezStatusApplicationId);

		if (sezOccupantGeneralBussinessInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezOccupantGeneralBussinessInfoException(
				sb.toString());
		}

		return sezOccupantGeneralBussinessInfo;
	}

	/**
	 * Returns the sez occupant general bussiness info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant general bussiness info, or <code>null</code> if a matching sez occupant general bussiness info could not be found
	 */
	@Override
	public SezOccupantGeneralBussinessInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez occupant general bussiness info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant general bussiness info, or <code>null</code> if a matching sez occupant general bussiness info could not be found
	 */
	@Override
	public SezOccupantGeneralBussinessInfo fetchBygetSezStatusByAppId(
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

		if (result instanceof SezOccupantGeneralBussinessInfo) {
			SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo =
				(SezOccupantGeneralBussinessInfo)result;

			if (sezStatusApplicationId !=
					sezOccupantGeneralBussinessInfo.
						getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZOCCUPANTGENERALBUSSINESSINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezOccupantGeneralBussinessInfo> list = query.list();

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
								"SezOccupantGeneralBussinessInfoPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezOccupantGeneralBussinessInfo
						sezOccupantGeneralBussinessInfo = list.get(0);

					result = sezOccupantGeneralBussinessInfo;

					cacheResult(sezOccupantGeneralBussinessInfo);
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
			return (SezOccupantGeneralBussinessInfo)result;
		}
	}

	/**
	 * Removes the sez occupant general bussiness info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupant general bussiness info that was removed
	 */
	@Override
	public SezOccupantGeneralBussinessInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupantGeneralBussinessInfoException {

		SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo =
			findBygetSezStatusByAppId(sezStatusApplicationId);

		return remove(sezOccupantGeneralBussinessInfo);
	}

	/**
	 * Returns the number of sez occupant general bussiness infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant general bussiness infos
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZOCCUPANTGENERALBUSSINESSINFO_WHERE);

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
			"sezOccupantGeneralBussinessInfo.sezStatusApplicationId = ?";

	public SezOccupantGeneralBussinessInfoPersistenceImpl() {
		setModelClass(SezOccupantGeneralBussinessInfo.class);

		setModelImplClass(SezOccupantGeneralBussinessInfoImpl.class);
		setModelPKClass(long.class);

		setTable(SezOccupantGeneralBussinessInfoTable.INSTANCE);
	}

	/**
	 * Caches the sez occupant general bussiness info in the entity cache if it is enabled.
	 *
	 * @param sezOccupantGeneralBussinessInfo the sez occupant general bussiness info
	 */
	@Override
	public void cacheResult(
		SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo) {

		entityCache.putResult(
			SezOccupantGeneralBussinessInfoImpl.class,
			sezOccupantGeneralBussinessInfo.getPrimaryKey(),
			sezOccupantGeneralBussinessInfo);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {
				sezOccupantGeneralBussinessInfo.getSezStatusApplicationId()
			},
			sezOccupantGeneralBussinessInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez occupant general bussiness infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupantGeneralBussinessInfos the sez occupant general bussiness infos
	 */
	@Override
	public void cacheResult(
		List<SezOccupantGeneralBussinessInfo>
			sezOccupantGeneralBussinessInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezOccupantGeneralBussinessInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo :
				sezOccupantGeneralBussinessInfos) {

			if (entityCache.getResult(
					SezOccupantGeneralBussinessInfoImpl.class,
					sezOccupantGeneralBussinessInfo.getPrimaryKey()) == null) {

				cacheResult(sezOccupantGeneralBussinessInfo);
			}
		}
	}

	/**
	 * Clears the cache for all sez occupant general bussiness infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezOccupantGeneralBussinessInfoImpl.class);

		finderCache.clearCache(SezOccupantGeneralBussinessInfoImpl.class);
	}

	/**
	 * Clears the cache for the sez occupant general bussiness info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo) {

		entityCache.removeResult(
			SezOccupantGeneralBussinessInfoImpl.class,
			sezOccupantGeneralBussinessInfo);
	}

	@Override
	public void clearCache(
		List<SezOccupantGeneralBussinessInfo>
			sezOccupantGeneralBussinessInfos) {

		for (SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo :
				sezOccupantGeneralBussinessInfos) {

			entityCache.removeResult(
				SezOccupantGeneralBussinessInfoImpl.class,
				sezOccupantGeneralBussinessInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezOccupantGeneralBussinessInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezOccupantGeneralBussinessInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezOccupantGeneralBussinessInfoModelImpl
			sezOccupantGeneralBussinessInfoModelImpl) {

		Object[] args = new Object[] {
			sezOccupantGeneralBussinessInfoModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezOccupantGeneralBussinessInfoModelImpl);
	}

	/**
	 * Creates a new sez occupant general bussiness info with the primary key. Does not add the sez occupant general bussiness info to the database.
	 *
	 * @param sezOccGenBussId the primary key for the new sez occupant general bussiness info
	 * @return the new sez occupant general bussiness info
	 */
	@Override
	public SezOccupantGeneralBussinessInfo create(long sezOccGenBussId) {
		SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo =
			new SezOccupantGeneralBussinessInfoImpl();

		sezOccupantGeneralBussinessInfo.setNew(true);
		sezOccupantGeneralBussinessInfo.setPrimaryKey(sezOccGenBussId);

		sezOccupantGeneralBussinessInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezOccupantGeneralBussinessInfo;
	}

	/**
	 * Removes the sez occupant general bussiness info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccGenBussId the primary key of the sez occupant general bussiness info
	 * @return the sez occupant general bussiness info that was removed
	 * @throws NoSuchSezOccupantGeneralBussinessInfoException if a sez occupant general bussiness info with the primary key could not be found
	 */
	@Override
	public SezOccupantGeneralBussinessInfo remove(long sezOccGenBussId)
		throws NoSuchSezOccupantGeneralBussinessInfoException {

		return remove((Serializable)sezOccGenBussId);
	}

	/**
	 * Removes the sez occupant general bussiness info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez occupant general bussiness info
	 * @return the sez occupant general bussiness info that was removed
	 * @throws NoSuchSezOccupantGeneralBussinessInfoException if a sez occupant general bussiness info with the primary key could not be found
	 */
	@Override
	public SezOccupantGeneralBussinessInfo remove(Serializable primaryKey)
		throws NoSuchSezOccupantGeneralBussinessInfoException {

		Session session = null;

		try {
			session = openSession();

			SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo =
				(SezOccupantGeneralBussinessInfo)session.get(
					SezOccupantGeneralBussinessInfoImpl.class, primaryKey);

			if (sezOccupantGeneralBussinessInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezOccupantGeneralBussinessInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezOccupantGeneralBussinessInfo);
		}
		catch (NoSuchSezOccupantGeneralBussinessInfoException
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
	protected SezOccupantGeneralBussinessInfo removeImpl(
		SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezOccupantGeneralBussinessInfo)) {
				sezOccupantGeneralBussinessInfo =
					(SezOccupantGeneralBussinessInfo)session.get(
						SezOccupantGeneralBussinessInfoImpl.class,
						sezOccupantGeneralBussinessInfo.getPrimaryKeyObj());
			}

			if (sezOccupantGeneralBussinessInfo != null) {
				session.delete(sezOccupantGeneralBussinessInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezOccupantGeneralBussinessInfo != null) {
			clearCache(sezOccupantGeneralBussinessInfo);
		}

		return sezOccupantGeneralBussinessInfo;
	}

	@Override
	public SezOccupantGeneralBussinessInfo updateImpl(
		SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo) {

		boolean isNew = sezOccupantGeneralBussinessInfo.isNew();

		if (!(sezOccupantGeneralBussinessInfo instanceof
				SezOccupantGeneralBussinessInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					sezOccupantGeneralBussinessInfo.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					sezOccupantGeneralBussinessInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezOccupantGeneralBussinessInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezOccupantGeneralBussinessInfo implementation " +
					sezOccupantGeneralBussinessInfo.getClass());
		}

		SezOccupantGeneralBussinessInfoModelImpl
			sezOccupantGeneralBussinessInfoModelImpl =
				(SezOccupantGeneralBussinessInfoModelImpl)
					sezOccupantGeneralBussinessInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(sezOccupantGeneralBussinessInfo.getCreateDate() == null)) {

			if (serviceContext == null) {
				sezOccupantGeneralBussinessInfo.setCreateDate(date);
			}
			else {
				sezOccupantGeneralBussinessInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezOccupantGeneralBussinessInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezOccupantGeneralBussinessInfo.setModifiedDate(date);
			}
			else {
				sezOccupantGeneralBussinessInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezOccupantGeneralBussinessInfo);
			}
			else {
				sezOccupantGeneralBussinessInfo =
					(SezOccupantGeneralBussinessInfo)session.merge(
						sezOccupantGeneralBussinessInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezOccupantGeneralBussinessInfoImpl.class,
			sezOccupantGeneralBussinessInfoModelImpl, false, true);

		cacheUniqueFindersCache(sezOccupantGeneralBussinessInfoModelImpl);

		if (isNew) {
			sezOccupantGeneralBussinessInfo.setNew(false);
		}

		sezOccupantGeneralBussinessInfo.resetOriginalValues();

		return sezOccupantGeneralBussinessInfo;
	}

	/**
	 * Returns the sez occupant general bussiness info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez occupant general bussiness info
	 * @return the sez occupant general bussiness info
	 * @throws NoSuchSezOccupantGeneralBussinessInfoException if a sez occupant general bussiness info with the primary key could not be found
	 */
	@Override
	public SezOccupantGeneralBussinessInfo findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchSezOccupantGeneralBussinessInfoException {

		SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo =
			fetchByPrimaryKey(primaryKey);

		if (sezOccupantGeneralBussinessInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezOccupantGeneralBussinessInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezOccupantGeneralBussinessInfo;
	}

	/**
	 * Returns the sez occupant general bussiness info with the primary key or throws a <code>NoSuchSezOccupantGeneralBussinessInfoException</code> if it could not be found.
	 *
	 * @param sezOccGenBussId the primary key of the sez occupant general bussiness info
	 * @return the sez occupant general bussiness info
	 * @throws NoSuchSezOccupantGeneralBussinessInfoException if a sez occupant general bussiness info with the primary key could not be found
	 */
	@Override
	public SezOccupantGeneralBussinessInfo findByPrimaryKey(
			long sezOccGenBussId)
		throws NoSuchSezOccupantGeneralBussinessInfoException {

		return findByPrimaryKey((Serializable)sezOccGenBussId);
	}

	/**
	 * Returns the sez occupant general bussiness info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccGenBussId the primary key of the sez occupant general bussiness info
	 * @return the sez occupant general bussiness info, or <code>null</code> if a sez occupant general bussiness info with the primary key could not be found
	 */
	@Override
	public SezOccupantGeneralBussinessInfo fetchByPrimaryKey(
		long sezOccGenBussId) {

		return fetchByPrimaryKey((Serializable)sezOccGenBussId);
	}

	/**
	 * Returns all the sez occupant general bussiness infos.
	 *
	 * @return the sez occupant general bussiness infos
	 */
	@Override
	public List<SezOccupantGeneralBussinessInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez occupant general bussiness infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantGeneralBussinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant general bussiness infos
	 * @param end the upper bound of the range of sez occupant general bussiness infos (not inclusive)
	 * @return the range of sez occupant general bussiness infos
	 */
	@Override
	public List<SezOccupantGeneralBussinessInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez occupant general bussiness infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantGeneralBussinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant general bussiness infos
	 * @param end the upper bound of the range of sez occupant general bussiness infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant general bussiness infos
	 */
	@Override
	public List<SezOccupantGeneralBussinessInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantGeneralBussinessInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez occupant general bussiness infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantGeneralBussinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant general bussiness infos
	 * @param end the upper bound of the range of sez occupant general bussiness infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant general bussiness infos
	 */
	@Override
	public List<SezOccupantGeneralBussinessInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantGeneralBussinessInfo> orderByComparator,
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

		List<SezOccupantGeneralBussinessInfo> list = null;

		if (useFinderCache) {
			list = (List<SezOccupantGeneralBussinessInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZOCCUPANTGENERALBUSSINESSINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZOCCUPANTGENERALBUSSINESSINFO;

				sql = sql.concat(
					SezOccupantGeneralBussinessInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezOccupantGeneralBussinessInfo>)QueryUtil.list(
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
	 * Removes all the sez occupant general bussiness infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo :
				findAll()) {

			remove(sezOccupantGeneralBussinessInfo);
		}
	}

	/**
	 * Returns the number of sez occupant general bussiness infos.
	 *
	 * @return the number of sez occupant general bussiness infos
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
					_SQL_COUNT_SEZOCCUPANTGENERALBUSSINESSINFO);

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
		return "sezOccGenBussId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZOCCUPANTGENERALBUSSINESSINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezOccupantGeneralBussinessInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez occupant general bussiness info persistence.
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

		SezOccupantGeneralBussinessInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezOccupantGeneralBussinessInfoUtil.setPersistence(null);

		entityCache.removeCache(
			SezOccupantGeneralBussinessInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZOCCUPANTGENERALBUSSINESSINFO =
		"SELECT sezOccupantGeneralBussinessInfo FROM SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo";

	private static final String
		_SQL_SELECT_SEZOCCUPANTGENERALBUSSINESSINFO_WHERE =
			"SELECT sezOccupantGeneralBussinessInfo FROM SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo WHERE ";

	private static final String _SQL_COUNT_SEZOCCUPANTGENERALBUSSINESSINFO =
		"SELECT COUNT(sezOccupantGeneralBussinessInfo) FROM SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo";

	private static final String
		_SQL_COUNT_SEZOCCUPANTGENERALBUSSINESSINFO_WHERE =
			"SELECT COUNT(sezOccupantGeneralBussinessInfo) FROM SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezOccupantGeneralBussinessInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezOccupantGeneralBussinessInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezOccupantGeneralBussinessInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezOccupantGeneralBussinessInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}