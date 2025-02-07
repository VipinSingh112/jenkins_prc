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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantExistingProposedProjectBriefInfoException;
import com.nbp.sez.status.application.form.service.model.SezOccupantExistingProposedProjectBriefInfo;
import com.nbp.sez.status.application.form.service.model.SezOccupantExistingProposedProjectBriefInfoTable;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupantExistingProposedProjectBriefInfoImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupantExistingProposedProjectBriefInfoModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantExistingProposedProjectBriefInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantExistingProposedProjectBriefInfoUtil;
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
 * The persistence implementation for the sez occupant existing proposed project brief info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = SezOccupantExistingProposedProjectBriefInfoPersistence.class
)
public class SezOccupantExistingProposedProjectBriefInfoPersistenceImpl
	extends BasePersistenceImpl<SezOccupantExistingProposedProjectBriefInfo>
	implements SezOccupantExistingProposedProjectBriefInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezOccupantExistingProposedProjectBriefInfoUtil</code> to access the sez occupant existing proposed project brief info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezOccupantExistingProposedProjectBriefInfoImpl.class.getName();

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
	 * Returns the sez occupant existing proposed project brief info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupantExistingProposedProjectBriefInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant existing proposed project brief info
	 * @throws NoSuchSezOccupantExistingProposedProjectBriefInfoException if a matching sez occupant existing proposed project brief info could not be found
	 */
	@Override
	public SezOccupantExistingProposedProjectBriefInfo
			findBygetSezStatusByAppId(long sezStatusApplicationId)
		throws NoSuchSezOccupantExistingProposedProjectBriefInfoException {

		SezOccupantExistingProposedProjectBriefInfo
			sezOccupantExistingProposedProjectBriefInfo =
				fetchBygetSezStatusByAppId(sezStatusApplicationId);

		if (sezOccupantExistingProposedProjectBriefInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezOccupantExistingProposedProjectBriefInfoException(
				sb.toString());
		}

		return sezOccupantExistingProposedProjectBriefInfo;
	}

	/**
	 * Returns the sez occupant existing proposed project brief info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant existing proposed project brief info, or <code>null</code> if a matching sez occupant existing proposed project brief info could not be found
	 */
	@Override
	public SezOccupantExistingProposedProjectBriefInfo
		fetchBygetSezStatusByAppId(long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez occupant existing proposed project brief info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant existing proposed project brief info, or <code>null</code> if a matching sez occupant existing proposed project brief info could not be found
	 */
	@Override
	public SezOccupantExistingProposedProjectBriefInfo
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

		if (result instanceof SezOccupantExistingProposedProjectBriefInfo) {
			SezOccupantExistingProposedProjectBriefInfo
				sezOccupantExistingProposedProjectBriefInfo =
					(SezOccupantExistingProposedProjectBriefInfo)result;

			if (sezStatusApplicationId !=
					sezOccupantExistingProposedProjectBriefInfo.
						getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(
				_SQL_SELECT_SEZOCCUPANTEXISTINGPROPOSEDPROJECTBRIEFINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezOccupantExistingProposedProjectBriefInfo> list =
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
								"SezOccupantExistingProposedProjectBriefInfoPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezOccupantExistingProposedProjectBriefInfo
						sezOccupantExistingProposedProjectBriefInfo = list.get(
							0);

					result = sezOccupantExistingProposedProjectBriefInfo;

					cacheResult(sezOccupantExistingProposedProjectBriefInfo);
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
			return (SezOccupantExistingProposedProjectBriefInfo)result;
		}
	}

	/**
	 * Removes the sez occupant existing proposed project brief info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupant existing proposed project brief info that was removed
	 */
	@Override
	public SezOccupantExistingProposedProjectBriefInfo
			removeBygetSezStatusByAppId(long sezStatusApplicationId)
		throws NoSuchSezOccupantExistingProposedProjectBriefInfoException {

		SezOccupantExistingProposedProjectBriefInfo
			sezOccupantExistingProposedProjectBriefInfo =
				findBygetSezStatusByAppId(sezStatusApplicationId);

		return remove(sezOccupantExistingProposedProjectBriefInfo);
	}

	/**
	 * Returns the number of sez occupant existing proposed project brief infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant existing proposed project brief infos
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(
				_SQL_COUNT_SEZOCCUPANTEXISTINGPROPOSEDPROJECTBRIEFINFO_WHERE);

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
			"sezOccupantExistingProposedProjectBriefInfo.sezStatusApplicationId = ?";

	public SezOccupantExistingProposedProjectBriefInfoPersistenceImpl() {
		setModelClass(SezOccupantExistingProposedProjectBriefInfo.class);

		setModelImplClass(
			SezOccupantExistingProposedProjectBriefInfoImpl.class);
		setModelPKClass(long.class);

		setTable(SezOccupantExistingProposedProjectBriefInfoTable.INSTANCE);
	}

	/**
	 * Caches the sez occupant existing proposed project brief info in the entity cache if it is enabled.
	 *
	 * @param sezOccupantExistingProposedProjectBriefInfo the sez occupant existing proposed project brief info
	 */
	@Override
	public void cacheResult(
		SezOccupantExistingProposedProjectBriefInfo
			sezOccupantExistingProposedProjectBriefInfo) {

		entityCache.putResult(
			SezOccupantExistingProposedProjectBriefInfoImpl.class,
			sezOccupantExistingProposedProjectBriefInfo.getPrimaryKey(),
			sezOccupantExistingProposedProjectBriefInfo);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {
				sezOccupantExistingProposedProjectBriefInfo.
					getSezStatusApplicationId()
			},
			sezOccupantExistingProposedProjectBriefInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez occupant existing proposed project brief infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupantExistingProposedProjectBriefInfos the sez occupant existing proposed project brief infos
	 */
	@Override
	public void cacheResult(
		List<SezOccupantExistingProposedProjectBriefInfo>
			sezOccupantExistingProposedProjectBriefInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezOccupantExistingProposedProjectBriefInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezOccupantExistingProposedProjectBriefInfo
				sezOccupantExistingProposedProjectBriefInfo :
					sezOccupantExistingProposedProjectBriefInfos) {

			if (entityCache.getResult(
					SezOccupantExistingProposedProjectBriefInfoImpl.class,
					sezOccupantExistingProposedProjectBriefInfo.
						getPrimaryKey()) == null) {

				cacheResult(sezOccupantExistingProposedProjectBriefInfo);
			}
		}
	}

	/**
	 * Clears the cache for all sez occupant existing proposed project brief infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(
			SezOccupantExistingProposedProjectBriefInfoImpl.class);

		finderCache.clearCache(
			SezOccupantExistingProposedProjectBriefInfoImpl.class);
	}

	/**
	 * Clears the cache for the sez occupant existing proposed project brief info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezOccupantExistingProposedProjectBriefInfo
			sezOccupantExistingProposedProjectBriefInfo) {

		entityCache.removeResult(
			SezOccupantExistingProposedProjectBriefInfoImpl.class,
			sezOccupantExistingProposedProjectBriefInfo);
	}

	@Override
	public void clearCache(
		List<SezOccupantExistingProposedProjectBriefInfo>
			sezOccupantExistingProposedProjectBriefInfos) {

		for (SezOccupantExistingProposedProjectBriefInfo
				sezOccupantExistingProposedProjectBriefInfo :
					sezOccupantExistingProposedProjectBriefInfos) {

			entityCache.removeResult(
				SezOccupantExistingProposedProjectBriefInfoImpl.class,
				sezOccupantExistingProposedProjectBriefInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(
			SezOccupantExistingProposedProjectBriefInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezOccupantExistingProposedProjectBriefInfoImpl.class,
				primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezOccupantExistingProposedProjectBriefInfoModelImpl
			sezOccupantExistingProposedProjectBriefInfoModelImpl) {

		Object[] args = new Object[] {
			sezOccupantExistingProposedProjectBriefInfoModelImpl.
				getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezOccupantExistingProposedProjectBriefInfoModelImpl);
	}

	/**
	 * Creates a new sez occupant existing proposed project brief info with the primary key. Does not add the sez occupant existing proposed project brief info to the database.
	 *
	 * @param sezOccExistPorpId the primary key for the new sez occupant existing proposed project brief info
	 * @return the new sez occupant existing proposed project brief info
	 */
	@Override
	public SezOccupantExistingProposedProjectBriefInfo create(
		long sezOccExistPorpId) {

		SezOccupantExistingProposedProjectBriefInfo
			sezOccupantExistingProposedProjectBriefInfo =
				new SezOccupantExistingProposedProjectBriefInfoImpl();

		sezOccupantExistingProposedProjectBriefInfo.setNew(true);
		sezOccupantExistingProposedProjectBriefInfo.setPrimaryKey(
			sezOccExistPorpId);

		sezOccupantExistingProposedProjectBriefInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezOccupantExistingProposedProjectBriefInfo;
	}

	/**
	 * Removes the sez occupant existing proposed project brief info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccExistPorpId the primary key of the sez occupant existing proposed project brief info
	 * @return the sez occupant existing proposed project brief info that was removed
	 * @throws NoSuchSezOccupantExistingProposedProjectBriefInfoException if a sez occupant existing proposed project brief info with the primary key could not be found
	 */
	@Override
	public SezOccupantExistingProposedProjectBriefInfo remove(
			long sezOccExistPorpId)
		throws NoSuchSezOccupantExistingProposedProjectBriefInfoException {

		return remove((Serializable)sezOccExistPorpId);
	}

	/**
	 * Removes the sez occupant existing proposed project brief info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez occupant existing proposed project brief info
	 * @return the sez occupant existing proposed project brief info that was removed
	 * @throws NoSuchSezOccupantExistingProposedProjectBriefInfoException if a sez occupant existing proposed project brief info with the primary key could not be found
	 */
	@Override
	public SezOccupantExistingProposedProjectBriefInfo remove(
			Serializable primaryKey)
		throws NoSuchSezOccupantExistingProposedProjectBriefInfoException {

		Session session = null;

		try {
			session = openSession();

			SezOccupantExistingProposedProjectBriefInfo
				sezOccupantExistingProposedProjectBriefInfo =
					(SezOccupantExistingProposedProjectBriefInfo)session.get(
						SezOccupantExistingProposedProjectBriefInfoImpl.class,
						primaryKey);

			if (sezOccupantExistingProposedProjectBriefInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezOccupantExistingProposedProjectBriefInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezOccupantExistingProposedProjectBriefInfo);
		}
		catch (NoSuchSezOccupantExistingProposedProjectBriefInfoException
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
	protected SezOccupantExistingProposedProjectBriefInfo removeImpl(
		SezOccupantExistingProposedProjectBriefInfo
			sezOccupantExistingProposedProjectBriefInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(
					sezOccupantExistingProposedProjectBriefInfo)) {

				sezOccupantExistingProposedProjectBriefInfo =
					(SezOccupantExistingProposedProjectBriefInfo)session.get(
						SezOccupantExistingProposedProjectBriefInfoImpl.class,
						sezOccupantExistingProposedProjectBriefInfo.
							getPrimaryKeyObj());
			}

			if (sezOccupantExistingProposedProjectBriefInfo != null) {
				session.delete(sezOccupantExistingProposedProjectBriefInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezOccupantExistingProposedProjectBriefInfo != null) {
			clearCache(sezOccupantExistingProposedProjectBriefInfo);
		}

		return sezOccupantExistingProposedProjectBriefInfo;
	}

	@Override
	public SezOccupantExistingProposedProjectBriefInfo updateImpl(
		SezOccupantExistingProposedProjectBriefInfo
			sezOccupantExistingProposedProjectBriefInfo) {

		boolean isNew = sezOccupantExistingProposedProjectBriefInfo.isNew();

		if (!(sezOccupantExistingProposedProjectBriefInfo instanceof
				SezOccupantExistingProposedProjectBriefInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					sezOccupantExistingProposedProjectBriefInfo.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					sezOccupantExistingProposedProjectBriefInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezOccupantExistingProposedProjectBriefInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezOccupantExistingProposedProjectBriefInfo implementation " +
					sezOccupantExistingProposedProjectBriefInfo.getClass());
		}

		SezOccupantExistingProposedProjectBriefInfoModelImpl
			sezOccupantExistingProposedProjectBriefInfoModelImpl =
				(SezOccupantExistingProposedProjectBriefInfoModelImpl)
					sezOccupantExistingProposedProjectBriefInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(sezOccupantExistingProposedProjectBriefInfo.getCreateDate() ==
				null)) {

			if (serviceContext == null) {
				sezOccupantExistingProposedProjectBriefInfo.setCreateDate(date);
			}
			else {
				sezOccupantExistingProposedProjectBriefInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezOccupantExistingProposedProjectBriefInfoModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				sezOccupantExistingProposedProjectBriefInfo.setModifiedDate(
					date);
			}
			else {
				sezOccupantExistingProposedProjectBriefInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezOccupantExistingProposedProjectBriefInfo);
			}
			else {
				sezOccupantExistingProposedProjectBriefInfo =
					(SezOccupantExistingProposedProjectBriefInfo)session.merge(
						sezOccupantExistingProposedProjectBriefInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezOccupantExistingProposedProjectBriefInfoImpl.class,
			sezOccupantExistingProposedProjectBriefInfoModelImpl, false, true);

		cacheUniqueFindersCache(
			sezOccupantExistingProposedProjectBriefInfoModelImpl);

		if (isNew) {
			sezOccupantExistingProposedProjectBriefInfo.setNew(false);
		}

		sezOccupantExistingProposedProjectBriefInfo.resetOriginalValues();

		return sezOccupantExistingProposedProjectBriefInfo;
	}

	/**
	 * Returns the sez occupant existing proposed project brief info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez occupant existing proposed project brief info
	 * @return the sez occupant existing proposed project brief info
	 * @throws NoSuchSezOccupantExistingProposedProjectBriefInfoException if a sez occupant existing proposed project brief info with the primary key could not be found
	 */
	@Override
	public SezOccupantExistingProposedProjectBriefInfo findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchSezOccupantExistingProposedProjectBriefInfoException {

		SezOccupantExistingProposedProjectBriefInfo
			sezOccupantExistingProposedProjectBriefInfo = fetchByPrimaryKey(
				primaryKey);

		if (sezOccupantExistingProposedProjectBriefInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezOccupantExistingProposedProjectBriefInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezOccupantExistingProposedProjectBriefInfo;
	}

	/**
	 * Returns the sez occupant existing proposed project brief info with the primary key or throws a <code>NoSuchSezOccupantExistingProposedProjectBriefInfoException</code> if it could not be found.
	 *
	 * @param sezOccExistPorpId the primary key of the sez occupant existing proposed project brief info
	 * @return the sez occupant existing proposed project brief info
	 * @throws NoSuchSezOccupantExistingProposedProjectBriefInfoException if a sez occupant existing proposed project brief info with the primary key could not be found
	 */
	@Override
	public SezOccupantExistingProposedProjectBriefInfo findByPrimaryKey(
			long sezOccExistPorpId)
		throws NoSuchSezOccupantExistingProposedProjectBriefInfoException {

		return findByPrimaryKey((Serializable)sezOccExistPorpId);
	}

	/**
	 * Returns the sez occupant existing proposed project brief info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccExistPorpId the primary key of the sez occupant existing proposed project brief info
	 * @return the sez occupant existing proposed project brief info, or <code>null</code> if a sez occupant existing proposed project brief info with the primary key could not be found
	 */
	@Override
	public SezOccupantExistingProposedProjectBriefInfo fetchByPrimaryKey(
		long sezOccExistPorpId) {

		return fetchByPrimaryKey((Serializable)sezOccExistPorpId);
	}

	/**
	 * Returns all the sez occupant existing proposed project brief infos.
	 *
	 * @return the sez occupant existing proposed project brief infos
	 */
	@Override
	public List<SezOccupantExistingProposedProjectBriefInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez occupant existing proposed project brief infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantExistingProposedProjectBriefInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant existing proposed project brief infos
	 * @param end the upper bound of the range of sez occupant existing proposed project brief infos (not inclusive)
	 * @return the range of sez occupant existing proposed project brief infos
	 */
	@Override
	public List<SezOccupantExistingProposedProjectBriefInfo> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez occupant existing proposed project brief infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantExistingProposedProjectBriefInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant existing proposed project brief infos
	 * @param end the upper bound of the range of sez occupant existing proposed project brief infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant existing proposed project brief infos
	 */
	@Override
	public List<SezOccupantExistingProposedProjectBriefInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantExistingProposedProjectBriefInfo>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez occupant existing proposed project brief infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantExistingProposedProjectBriefInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant existing proposed project brief infos
	 * @param end the upper bound of the range of sez occupant existing proposed project brief infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant existing proposed project brief infos
	 */
	@Override
	public List<SezOccupantExistingProposedProjectBriefInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantExistingProposedProjectBriefInfo>
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

		List<SezOccupantExistingProposedProjectBriefInfo> list = null;

		if (useFinderCache) {
			list =
				(List<SezOccupantExistingProposedProjectBriefInfo>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(
					_SQL_SELECT_SEZOCCUPANTEXISTINGPROPOSEDPROJECTBRIEFINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZOCCUPANTEXISTINGPROPOSEDPROJECTBRIEFINFO;

				sql = sql.concat(
					SezOccupantExistingProposedProjectBriefInfoModelImpl.
						ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<SezOccupantExistingProposedProjectBriefInfo>)
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
	 * Removes all the sez occupant existing proposed project brief infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezOccupantExistingProposedProjectBriefInfo
				sezOccupantExistingProposedProjectBriefInfo : findAll()) {

			remove(sezOccupantExistingProposedProjectBriefInfo);
		}
	}

	/**
	 * Returns the number of sez occupant existing proposed project brief infos.
	 *
	 * @return the number of sez occupant existing proposed project brief infos
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
					_SQL_COUNT_SEZOCCUPANTEXISTINGPROPOSEDPROJECTBRIEFINFO);

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
		return "sezOccExistPorpId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZOCCUPANTEXISTINGPROPOSEDPROJECTBRIEFINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezOccupantExistingProposedProjectBriefInfoModelImpl.
			TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez occupant existing proposed project brief info persistence.
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

		SezOccupantExistingProposedProjectBriefInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezOccupantExistingProposedProjectBriefInfoUtil.setPersistence(null);

		entityCache.removeCache(
			SezOccupantExistingProposedProjectBriefInfoImpl.class.getName());
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
		_SQL_SELECT_SEZOCCUPANTEXISTINGPROPOSEDPROJECTBRIEFINFO =
			"SELECT sezOccupantExistingProposedProjectBriefInfo FROM SezOccupantExistingProposedProjectBriefInfo sezOccupantExistingProposedProjectBriefInfo";

	private static final String
		_SQL_SELECT_SEZOCCUPANTEXISTINGPROPOSEDPROJECTBRIEFINFO_WHERE =
			"SELECT sezOccupantExistingProposedProjectBriefInfo FROM SezOccupantExistingProposedProjectBriefInfo sezOccupantExistingProposedProjectBriefInfo WHERE ";

	private static final String
		_SQL_COUNT_SEZOCCUPANTEXISTINGPROPOSEDPROJECTBRIEFINFO =
			"SELECT COUNT(sezOccupantExistingProposedProjectBriefInfo) FROM SezOccupantExistingProposedProjectBriefInfo sezOccupantExistingProposedProjectBriefInfo";

	private static final String
		_SQL_COUNT_SEZOCCUPANTEXISTINGPROPOSEDPROJECTBRIEFINFO_WHERE =
			"SELECT COUNT(sezOccupantExistingProposedProjectBriefInfo) FROM SezOccupantExistingProposedProjectBriefInfo sezOccupantExistingProposedProjectBriefInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezOccupantExistingProposedProjectBriefInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezOccupantExistingProposedProjectBriefInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezOccupantExistingProposedProjectBriefInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezOccupantExistingProposedProjectBriefInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}