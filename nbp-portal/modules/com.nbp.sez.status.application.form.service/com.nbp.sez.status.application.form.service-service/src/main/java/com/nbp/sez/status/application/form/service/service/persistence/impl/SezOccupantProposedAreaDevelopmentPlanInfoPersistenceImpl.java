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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException;
import com.nbp.sez.status.application.form.service.model.SezOccupantProposedAreaDevelopmentPlanInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupantProposedAreaDevelopmentPlanInfoTable;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupantProposedAreaDevelopmentPlanInfoImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupantProposedAreaDevelopmentPlanInfoModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantProposedAreaDevelopmentPlanInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantProposedAreaDevelopmentPlanInfoUtil;
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
 * The persistence implementation for the sez occupant proposed area development plan info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = SezOccupantProposedAreaDevelopmentPlanInfoPersistence.class
)
public class SezOccupantProposedAreaDevelopmentPlanInfoPersistenceImpl
	extends BasePersistenceImpl<SezOccupantProposedAreaDevelopmentPlanInfo>
	implements SezOccupantProposedAreaDevelopmentPlanInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezOccupantProposedAreaDevelopmentPlanInfoUtil</code> to access the sez occupant proposed area development plan info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezOccupantProposedAreaDevelopmentPlanInfoImpl.class.getName();

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
	 * Returns the sez occupant proposed area development plan info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant proposed area development plan info
	 * @throws NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException if a matching sez occupant proposed area development plan info could not be found
	 */
	@Override
	public SezOccupantProposedAreaDevelopmentPlanInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException {

		SezOccupantProposedAreaDevelopmentPlanInfo
			sezOccupantProposedAreaDevelopmentPlanInfo =
				fetchBygetSezStatusByAppId(sezStatusApplicationId);

		if (sezOccupantProposedAreaDevelopmentPlanInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException(
				sb.toString());
		}

		return sezOccupantProposedAreaDevelopmentPlanInfo;
	}

	/**
	 * Returns the sez occupant proposed area development plan info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant proposed area development plan info, or <code>null</code> if a matching sez occupant proposed area development plan info could not be found
	 */
	@Override
	public SezOccupantProposedAreaDevelopmentPlanInfo
		fetchBygetSezStatusByAppId(long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez occupant proposed area development plan info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant proposed area development plan info, or <code>null</code> if a matching sez occupant proposed area development plan info could not be found
	 */
	@Override
	public SezOccupantProposedAreaDevelopmentPlanInfo
		fetchBygetSezStatusByAppId(
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

		if (result instanceof SezOccupantProposedAreaDevelopmentPlanInfo) {
			SezOccupantProposedAreaDevelopmentPlanInfo
				sezOccupantProposedAreaDevelopmentPlanInfo =
					(SezOccupantProposedAreaDevelopmentPlanInfo)result;

			if (sezStatusApplicationId !=
					sezOccupantProposedAreaDevelopmentPlanInfo.
						getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(
				_SQL_SELECT_SEZOCCUPANTPROPOSEDAREADEVELOPMENTPLANINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezOccupantProposedAreaDevelopmentPlanInfo> list =
					query.list();

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
								"SezOccupantProposedAreaDevelopmentPlanInfoPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezOccupantProposedAreaDevelopmentPlanInfo
						sezOccupantProposedAreaDevelopmentPlanInfo = list.get(
							0);

					result = sezOccupantProposedAreaDevelopmentPlanInfo;

					cacheResult(sezOccupantProposedAreaDevelopmentPlanInfo);
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
			return (SezOccupantProposedAreaDevelopmentPlanInfo)result;
		}
	}

	/**
	 * Removes the sez occupant proposed area development plan info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupant proposed area development plan info that was removed
	 */
	@Override
	public SezOccupantProposedAreaDevelopmentPlanInfo
			removeBygetSezStatusByAppId(long sezStatusApplicationId)
		throws NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException {

		SezOccupantProposedAreaDevelopmentPlanInfo
			sezOccupantProposedAreaDevelopmentPlanInfo =
				findBygetSezStatusByAppId(sezStatusApplicationId);

		return remove(sezOccupantProposedAreaDevelopmentPlanInfo);
	}

	/**
	 * Returns the number of sez occupant proposed area development plan infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant proposed area development plan infos
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(
				_SQL_COUNT_SEZOCCUPANTPROPOSEDAREADEVELOPMENTPLANINFO_WHERE);

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
			"sezOccupantProposedAreaDevelopmentPlanInfo.sezStatusApplicationId = ?";

	public SezOccupantProposedAreaDevelopmentPlanInfoPersistenceImpl() {
		setModelClass(SezOccupantProposedAreaDevelopmentPlanInfo.class);

		setModelImplClass(SezOccupantProposedAreaDevelopmentPlanInfoImpl.class);
		setModelPKClass(long.class);

		setTable(SezOccupantProposedAreaDevelopmentPlanInfoTable.INSTANCE);
	}

	/**
	 * Caches the sez occupant proposed area development plan info in the entity cache if it is enabled.
	 *
	 * @param sezOccupantProposedAreaDevelopmentPlanInfo the sez occupant proposed area development plan info
	 */
	@Override
	public void cacheResult(
		SezOccupantProposedAreaDevelopmentPlanInfo
			sezOccupantProposedAreaDevelopmentPlanInfo) {

		entityCache.putResult(
			SezOccupantProposedAreaDevelopmentPlanInfoImpl.class,
			sezOccupantProposedAreaDevelopmentPlanInfo.getPrimaryKey(),
			sezOccupantProposedAreaDevelopmentPlanInfo);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {
				sezOccupantProposedAreaDevelopmentPlanInfo.
					getSezStatusApplicationId()
			},
			sezOccupantProposedAreaDevelopmentPlanInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez occupant proposed area development plan infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupantProposedAreaDevelopmentPlanInfos the sez occupant proposed area development plan infos
	 */
	@Override
	public void cacheResult(
		List<SezOccupantProposedAreaDevelopmentPlanInfo>
			sezOccupantProposedAreaDevelopmentPlanInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezOccupantProposedAreaDevelopmentPlanInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezOccupantProposedAreaDevelopmentPlanInfo
				sezOccupantProposedAreaDevelopmentPlanInfo :
					sezOccupantProposedAreaDevelopmentPlanInfos) {

			if (entityCache.getResult(
					SezOccupantProposedAreaDevelopmentPlanInfoImpl.class,
					sezOccupantProposedAreaDevelopmentPlanInfo.
						getPrimaryKey()) == null) {

				cacheResult(sezOccupantProposedAreaDevelopmentPlanInfo);
			}
		}
	}

	/**
	 * Clears the cache for all sez occupant proposed area development plan infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(
			SezOccupantProposedAreaDevelopmentPlanInfoImpl.class);

		finderCache.clearCache(
			SezOccupantProposedAreaDevelopmentPlanInfoImpl.class);
	}

	/**
	 * Clears the cache for the sez occupant proposed area development plan info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezOccupantProposedAreaDevelopmentPlanInfo
			sezOccupantProposedAreaDevelopmentPlanInfo) {

		entityCache.removeResult(
			SezOccupantProposedAreaDevelopmentPlanInfoImpl.class,
			sezOccupantProposedAreaDevelopmentPlanInfo);
	}

	@Override
	public void clearCache(
		List<SezOccupantProposedAreaDevelopmentPlanInfo>
			sezOccupantProposedAreaDevelopmentPlanInfos) {

		for (SezOccupantProposedAreaDevelopmentPlanInfo
				sezOccupantProposedAreaDevelopmentPlanInfo :
					sezOccupantProposedAreaDevelopmentPlanInfos) {

			entityCache.removeResult(
				SezOccupantProposedAreaDevelopmentPlanInfoImpl.class,
				sezOccupantProposedAreaDevelopmentPlanInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(
			SezOccupantProposedAreaDevelopmentPlanInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezOccupantProposedAreaDevelopmentPlanInfoImpl.class,
				primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezOccupantProposedAreaDevelopmentPlanInfoModelImpl
			sezOccupantProposedAreaDevelopmentPlanInfoModelImpl) {

		Object[] args = new Object[] {
			sezOccupantProposedAreaDevelopmentPlanInfoModelImpl.
				getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezOccupantProposedAreaDevelopmentPlanInfoModelImpl);
	}

	/**
	 * Creates a new sez occupant proposed area development plan info with the primary key. Does not add the sez occupant proposed area development plan info to the database.
	 *
	 * @param sezOccPropAreaId the primary key for the new sez occupant proposed area development plan info
	 * @return the new sez occupant proposed area development plan info
	 */
	@Override
	public SezOccupantProposedAreaDevelopmentPlanInfo create(
		long sezOccPropAreaId) {

		SezOccupantProposedAreaDevelopmentPlanInfo
			sezOccupantProposedAreaDevelopmentPlanInfo =
				new SezOccupantProposedAreaDevelopmentPlanInfoImpl();

		sezOccupantProposedAreaDevelopmentPlanInfo.setNew(true);
		sezOccupantProposedAreaDevelopmentPlanInfo.setPrimaryKey(
			sezOccPropAreaId);

		sezOccupantProposedAreaDevelopmentPlanInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezOccupantProposedAreaDevelopmentPlanInfo;
	}

	/**
	 * Removes the sez occupant proposed area development plan info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccPropAreaId the primary key of the sez occupant proposed area development plan info
	 * @return the sez occupant proposed area development plan info that was removed
	 * @throws NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException if a sez occupant proposed area development plan info with the primary key could not be found
	 */
	@Override
	public SezOccupantProposedAreaDevelopmentPlanInfo remove(
			long sezOccPropAreaId)
		throws NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException {

		return remove((Serializable)sezOccPropAreaId);
	}

	/**
	 * Removes the sez occupant proposed area development plan info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez occupant proposed area development plan info
	 * @return the sez occupant proposed area development plan info that was removed
	 * @throws NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException if a sez occupant proposed area development plan info with the primary key could not be found
	 */
	@Override
	public SezOccupantProposedAreaDevelopmentPlanInfo remove(
			Serializable primaryKey)
		throws NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException {

		Session session = null;

		try {
			session = openSession();

			SezOccupantProposedAreaDevelopmentPlanInfo
				sezOccupantProposedAreaDevelopmentPlanInfo =
					(SezOccupantProposedAreaDevelopmentPlanInfo)session.get(
						SezOccupantProposedAreaDevelopmentPlanInfoImpl.class,
						primaryKey);

			if (sezOccupantProposedAreaDevelopmentPlanInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezOccupantProposedAreaDevelopmentPlanInfo);
		}
		catch (NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException
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
	protected SezOccupantProposedAreaDevelopmentPlanInfo removeImpl(
		SezOccupantProposedAreaDevelopmentPlanInfo
			sezOccupantProposedAreaDevelopmentPlanInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezOccupantProposedAreaDevelopmentPlanInfo)) {
				sezOccupantProposedAreaDevelopmentPlanInfo =
					(SezOccupantProposedAreaDevelopmentPlanInfo)session.get(
						SezOccupantProposedAreaDevelopmentPlanInfoImpl.class,
						sezOccupantProposedAreaDevelopmentPlanInfo.
							getPrimaryKeyObj());
			}

			if (sezOccupantProposedAreaDevelopmentPlanInfo != null) {
				session.delete(sezOccupantProposedAreaDevelopmentPlanInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezOccupantProposedAreaDevelopmentPlanInfo != null) {
			clearCache(sezOccupantProposedAreaDevelopmentPlanInfo);
		}

		return sezOccupantProposedAreaDevelopmentPlanInfo;
	}

	@Override
	public SezOccupantProposedAreaDevelopmentPlanInfo updateImpl(
		SezOccupantProposedAreaDevelopmentPlanInfo
			sezOccupantProposedAreaDevelopmentPlanInfo) {

		boolean isNew = sezOccupantProposedAreaDevelopmentPlanInfo.isNew();

		if (!(sezOccupantProposedAreaDevelopmentPlanInfo instanceof
				SezOccupantProposedAreaDevelopmentPlanInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					sezOccupantProposedAreaDevelopmentPlanInfo.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					sezOccupantProposedAreaDevelopmentPlanInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezOccupantProposedAreaDevelopmentPlanInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezOccupantProposedAreaDevelopmentPlanInfo implementation " +
					sezOccupantProposedAreaDevelopmentPlanInfo.getClass());
		}

		SezOccupantProposedAreaDevelopmentPlanInfoModelImpl
			sezOccupantProposedAreaDevelopmentPlanInfoModelImpl =
				(SezOccupantProposedAreaDevelopmentPlanInfoModelImpl)
					sezOccupantProposedAreaDevelopmentPlanInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(sezOccupantProposedAreaDevelopmentPlanInfo.getCreateDate() ==
				null)) {

			if (serviceContext == null) {
				sezOccupantProposedAreaDevelopmentPlanInfo.setCreateDate(date);
			}
			else {
				sezOccupantProposedAreaDevelopmentPlanInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezOccupantProposedAreaDevelopmentPlanInfoModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				sezOccupantProposedAreaDevelopmentPlanInfo.setModifiedDate(
					date);
			}
			else {
				sezOccupantProposedAreaDevelopmentPlanInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezOccupantProposedAreaDevelopmentPlanInfo);
			}
			else {
				sezOccupantProposedAreaDevelopmentPlanInfo =
					(SezOccupantProposedAreaDevelopmentPlanInfo)session.merge(
						sezOccupantProposedAreaDevelopmentPlanInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezOccupantProposedAreaDevelopmentPlanInfoImpl.class,
			sezOccupantProposedAreaDevelopmentPlanInfoModelImpl, false, true);

		cacheUniqueFindersCache(
			sezOccupantProposedAreaDevelopmentPlanInfoModelImpl);

		if (isNew) {
			sezOccupantProposedAreaDevelopmentPlanInfo.setNew(false);
		}

		sezOccupantProposedAreaDevelopmentPlanInfo.resetOriginalValues();

		return sezOccupantProposedAreaDevelopmentPlanInfo;
	}

	/**
	 * Returns the sez occupant proposed area development plan info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez occupant proposed area development plan info
	 * @return the sez occupant proposed area development plan info
	 * @throws NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException if a sez occupant proposed area development plan info with the primary key could not be found
	 */
	@Override
	public SezOccupantProposedAreaDevelopmentPlanInfo findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException {

		SezOccupantProposedAreaDevelopmentPlanInfo
			sezOccupantProposedAreaDevelopmentPlanInfo = fetchByPrimaryKey(
				primaryKey);

		if (sezOccupantProposedAreaDevelopmentPlanInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezOccupantProposedAreaDevelopmentPlanInfo;
	}

	/**
	 * Returns the sez occupant proposed area development plan info with the primary key or throws a <code>NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException</code> if it could not be found.
	 *
	 * @param sezOccPropAreaId the primary key of the sez occupant proposed area development plan info
	 * @return the sez occupant proposed area development plan info
	 * @throws NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException if a sez occupant proposed area development plan info with the primary key could not be found
	 */
	@Override
	public SezOccupantProposedAreaDevelopmentPlanInfo findByPrimaryKey(
			long sezOccPropAreaId)
		throws NoSuchSezOccupantProposedAreaDevelopmentPlanInfoException {

		return findByPrimaryKey((Serializable)sezOccPropAreaId);
	}

	/**
	 * Returns the sez occupant proposed area development plan info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccPropAreaId the primary key of the sez occupant proposed area development plan info
	 * @return the sez occupant proposed area development plan info, or <code>null</code> if a sez occupant proposed area development plan info with the primary key could not be found
	 */
	@Override
	public SezOccupantProposedAreaDevelopmentPlanInfo fetchByPrimaryKey(
		long sezOccPropAreaId) {

		return fetchByPrimaryKey((Serializable)sezOccPropAreaId);
	}

	/**
	 * Returns all the sez occupant proposed area development plan infos.
	 *
	 * @return the sez occupant proposed area development plan infos
	 */
	@Override
	public List<SezOccupantProposedAreaDevelopmentPlanInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez occupant proposed area development plan infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantProposedAreaDevelopmentPlanInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant proposed area development plan infos
	 * @param end the upper bound of the range of sez occupant proposed area development plan infos (not inclusive)
	 * @return the range of sez occupant proposed area development plan infos
	 */
	@Override
	public List<SezOccupantProposedAreaDevelopmentPlanInfo> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez occupant proposed area development plan infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantProposedAreaDevelopmentPlanInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant proposed area development plan infos
	 * @param end the upper bound of the range of sez occupant proposed area development plan infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant proposed area development plan infos
	 */
	@Override
	public List<SezOccupantProposedAreaDevelopmentPlanInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantProposedAreaDevelopmentPlanInfo>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez occupant proposed area development plan infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantProposedAreaDevelopmentPlanInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant proposed area development plan infos
	 * @param end the upper bound of the range of sez occupant proposed area development plan infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant proposed area development plan infos
	 */
	@Override
	public List<SezOccupantProposedAreaDevelopmentPlanInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantProposedAreaDevelopmentPlanInfo>
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

		List<SezOccupantProposedAreaDevelopmentPlanInfo> list = null;

		if (useFinderCache) {
			list =
				(List<SezOccupantProposedAreaDevelopmentPlanInfo>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(
					_SQL_SELECT_SEZOCCUPANTPROPOSEDAREADEVELOPMENTPLANINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZOCCUPANTPROPOSEDAREADEVELOPMENTPLANINFO;

				sql = sql.concat(
					SezOccupantProposedAreaDevelopmentPlanInfoModelImpl.
						ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<SezOccupantProposedAreaDevelopmentPlanInfo>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Removes all the sez occupant proposed area development plan infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezOccupantProposedAreaDevelopmentPlanInfo
				sezOccupantProposedAreaDevelopmentPlanInfo : findAll()) {

			remove(sezOccupantProposedAreaDevelopmentPlanInfo);
		}
	}

	/**
	 * Returns the number of sez occupant proposed area development plan infos.
	 *
	 * @return the number of sez occupant proposed area development plan infos
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
					_SQL_COUNT_SEZOCCUPANTPROPOSEDAREADEVELOPMENTPLANINFO);

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
		return "sezOccPropAreaId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZOCCUPANTPROPOSEDAREADEVELOPMENTPLANINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezOccupantProposedAreaDevelopmentPlanInfoModelImpl.
			TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez occupant proposed area development plan info persistence.
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

		SezOccupantProposedAreaDevelopmentPlanInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezOccupantProposedAreaDevelopmentPlanInfoUtil.setPersistence(null);

		entityCache.removeCache(
			SezOccupantProposedAreaDevelopmentPlanInfoImpl.class.getName());
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
		_SQL_SELECT_SEZOCCUPANTPROPOSEDAREADEVELOPMENTPLANINFO =
			"SELECT sezOccupantProposedAreaDevelopmentPlanInfo FROM SezOccupantProposedAreaDevelopmentPlanInfo sezOccupantProposedAreaDevelopmentPlanInfo";

	private static final String
		_SQL_SELECT_SEZOCCUPANTPROPOSEDAREADEVELOPMENTPLANINFO_WHERE =
			"SELECT sezOccupantProposedAreaDevelopmentPlanInfo FROM SezOccupantProposedAreaDevelopmentPlanInfo sezOccupantProposedAreaDevelopmentPlanInfo WHERE ";

	private static final String
		_SQL_COUNT_SEZOCCUPANTPROPOSEDAREADEVELOPMENTPLANINFO =
			"SELECT COUNT(sezOccupantProposedAreaDevelopmentPlanInfo) FROM SezOccupantProposedAreaDevelopmentPlanInfo sezOccupantProposedAreaDevelopmentPlanInfo";

	private static final String
		_SQL_COUNT_SEZOCCUPANTPROPOSEDAREADEVELOPMENTPLANINFO_WHERE =
			"SELECT COUNT(sezOccupantProposedAreaDevelopmentPlanInfo) FROM SezOccupantProposedAreaDevelopmentPlanInfo sezOccupantProposedAreaDevelopmentPlanInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezOccupantProposedAreaDevelopmentPlanInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezOccupantProposedAreaDevelopmentPlanInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezOccupantProposedAreaDevelopmentPlanInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezOccupantProposedAreaDevelopmentPlanInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}