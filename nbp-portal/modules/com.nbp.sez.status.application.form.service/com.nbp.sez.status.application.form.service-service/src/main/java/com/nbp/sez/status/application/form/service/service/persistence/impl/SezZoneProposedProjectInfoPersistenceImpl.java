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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneProposedProjectInfoException;
import com.nbp.sez.status.application.form.service.model.SezZoneProposedProjectInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneProposedProjectInfoTable;
import com.nbp.sez.status.application.form.service.model.impl.SezZoneProposedProjectInfoImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezZoneProposedProjectInfoModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneProposedProjectInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneProposedProjectInfoUtil;
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
 * The persistence implementation for the sez zone proposed project info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezZoneProposedProjectInfoPersistence.class)
public class SezZoneProposedProjectInfoPersistenceImpl
	extends BasePersistenceImpl<SezZoneProposedProjectInfo>
	implements SezZoneProposedProjectInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezZoneProposedProjectInfoUtil</code> to access the sez zone proposed project info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezZoneProposedProjectInfoImpl.class.getName();

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
	 * Returns the sez zone proposed project info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezZoneProposedProjectInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone proposed project info
	 * @throws NoSuchSezZoneProposedProjectInfoException if a matching sez zone proposed project info could not be found
	 */
	@Override
	public SezZoneProposedProjectInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneProposedProjectInfoException {

		SezZoneProposedProjectInfo sezZoneProposedProjectInfo =
			fetchBygetSezStatusByAppId(sezStatusApplicationId);

		if (sezZoneProposedProjectInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezZoneProposedProjectInfoException(sb.toString());
		}

		return sezZoneProposedProjectInfo;
	}

	/**
	 * Returns the sez zone proposed project info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone proposed project info, or <code>null</code> if a matching sez zone proposed project info could not be found
	 */
	@Override
	public SezZoneProposedProjectInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez zone proposed project info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone proposed project info, or <code>null</code> if a matching sez zone proposed project info could not be found
	 */
	@Override
	public SezZoneProposedProjectInfo fetchBygetSezStatusByAppId(
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

		if (result instanceof SezZoneProposedProjectInfo) {
			SezZoneProposedProjectInfo sezZoneProposedProjectInfo =
				(SezZoneProposedProjectInfo)result;

			if (sezStatusApplicationId !=
					sezZoneProposedProjectInfo.getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZZONEPROPOSEDPROJECTINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezZoneProposedProjectInfo> list = query.list();

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
								"SezZoneProposedProjectInfoPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezZoneProposedProjectInfo sezZoneProposedProjectInfo =
						list.get(0);

					result = sezZoneProposedProjectInfo;

					cacheResult(sezZoneProposedProjectInfo);
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
			return (SezZoneProposedProjectInfo)result;
		}
	}

	/**
	 * Removes the sez zone proposed project info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez zone proposed project info that was removed
	 */
	@Override
	public SezZoneProposedProjectInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneProposedProjectInfoException {

		SezZoneProposedProjectInfo sezZoneProposedProjectInfo =
			findBygetSezStatusByAppId(sezStatusApplicationId);

		return remove(sezZoneProposedProjectInfo);
	}

	/**
	 * Returns the number of sez zone proposed project infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone proposed project infos
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZZONEPROPOSEDPROJECTINFO_WHERE);

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
			"sezZoneProposedProjectInfo.sezStatusApplicationId = ?";

	public SezZoneProposedProjectInfoPersistenceImpl() {
		setModelClass(SezZoneProposedProjectInfo.class);

		setModelImplClass(SezZoneProposedProjectInfoImpl.class);
		setModelPKClass(long.class);

		setTable(SezZoneProposedProjectInfoTable.INSTANCE);
	}

	/**
	 * Caches the sez zone proposed project info in the entity cache if it is enabled.
	 *
	 * @param sezZoneProposedProjectInfo the sez zone proposed project info
	 */
	@Override
	public void cacheResult(
		SezZoneProposedProjectInfo sezZoneProposedProjectInfo) {

		entityCache.putResult(
			SezZoneProposedProjectInfoImpl.class,
			sezZoneProposedProjectInfo.getPrimaryKey(),
			sezZoneProposedProjectInfo);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {
				sezZoneProposedProjectInfo.getSezStatusApplicationId()
			},
			sezZoneProposedProjectInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez zone proposed project infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneProposedProjectInfos the sez zone proposed project infos
	 */
	@Override
	public void cacheResult(
		List<SezZoneProposedProjectInfo> sezZoneProposedProjectInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezZoneProposedProjectInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezZoneProposedProjectInfo sezZoneProposedProjectInfo :
				sezZoneProposedProjectInfos) {

			if (entityCache.getResult(
					SezZoneProposedProjectInfoImpl.class,
					sezZoneProposedProjectInfo.getPrimaryKey()) == null) {

				cacheResult(sezZoneProposedProjectInfo);
			}
		}
	}

	/**
	 * Clears the cache for all sez zone proposed project infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezZoneProposedProjectInfoImpl.class);

		finderCache.clearCache(SezZoneProposedProjectInfoImpl.class);
	}

	/**
	 * Clears the cache for the sez zone proposed project info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezZoneProposedProjectInfo sezZoneProposedProjectInfo) {

		entityCache.removeResult(
			SezZoneProposedProjectInfoImpl.class, sezZoneProposedProjectInfo);
	}

	@Override
	public void clearCache(
		List<SezZoneProposedProjectInfo> sezZoneProposedProjectInfos) {

		for (SezZoneProposedProjectInfo sezZoneProposedProjectInfo :
				sezZoneProposedProjectInfos) {

			entityCache.removeResult(
				SezZoneProposedProjectInfoImpl.class,
				sezZoneProposedProjectInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezZoneProposedProjectInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezZoneProposedProjectInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezZoneProposedProjectInfoModelImpl
			sezZoneProposedProjectInfoModelImpl) {

		Object[] args = new Object[] {
			sezZoneProposedProjectInfoModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezZoneProposedProjectInfoModelImpl);
	}

	/**
	 * Creates a new sez zone proposed project info with the primary key. Does not add the sez zone proposed project info to the database.
	 *
	 * @param sezZoneProposedProjectInfoId the primary key for the new sez zone proposed project info
	 * @return the new sez zone proposed project info
	 */
	@Override
	public SezZoneProposedProjectInfo create(
		long sezZoneProposedProjectInfoId) {

		SezZoneProposedProjectInfo sezZoneProposedProjectInfo =
			new SezZoneProposedProjectInfoImpl();

		sezZoneProposedProjectInfo.setNew(true);
		sezZoneProposedProjectInfo.setPrimaryKey(sezZoneProposedProjectInfoId);

		sezZoneProposedProjectInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezZoneProposedProjectInfo;
	}

	/**
	 * Removes the sez zone proposed project info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneProposedProjectInfoId the primary key of the sez zone proposed project info
	 * @return the sez zone proposed project info that was removed
	 * @throws NoSuchSezZoneProposedProjectInfoException if a sez zone proposed project info with the primary key could not be found
	 */
	@Override
	public SezZoneProposedProjectInfo remove(long sezZoneProposedProjectInfoId)
		throws NoSuchSezZoneProposedProjectInfoException {

		return remove((Serializable)sezZoneProposedProjectInfoId);
	}

	/**
	 * Removes the sez zone proposed project info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez zone proposed project info
	 * @return the sez zone proposed project info that was removed
	 * @throws NoSuchSezZoneProposedProjectInfoException if a sez zone proposed project info with the primary key could not be found
	 */
	@Override
	public SezZoneProposedProjectInfo remove(Serializable primaryKey)
		throws NoSuchSezZoneProposedProjectInfoException {

		Session session = null;

		try {
			session = openSession();

			SezZoneProposedProjectInfo sezZoneProposedProjectInfo =
				(SezZoneProposedProjectInfo)session.get(
					SezZoneProposedProjectInfoImpl.class, primaryKey);

			if (sezZoneProposedProjectInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezZoneProposedProjectInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezZoneProposedProjectInfo);
		}
		catch (NoSuchSezZoneProposedProjectInfoException
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
	protected SezZoneProposedProjectInfo removeImpl(
		SezZoneProposedProjectInfo sezZoneProposedProjectInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezZoneProposedProjectInfo)) {
				sezZoneProposedProjectInfo =
					(SezZoneProposedProjectInfo)session.get(
						SezZoneProposedProjectInfoImpl.class,
						sezZoneProposedProjectInfo.getPrimaryKeyObj());
			}

			if (sezZoneProposedProjectInfo != null) {
				session.delete(sezZoneProposedProjectInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezZoneProposedProjectInfo != null) {
			clearCache(sezZoneProposedProjectInfo);
		}

		return sezZoneProposedProjectInfo;
	}

	@Override
	public SezZoneProposedProjectInfo updateImpl(
		SezZoneProposedProjectInfo sezZoneProposedProjectInfo) {

		boolean isNew = sezZoneProposedProjectInfo.isNew();

		if (!(sezZoneProposedProjectInfo instanceof
				SezZoneProposedProjectInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezZoneProposedProjectInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezZoneProposedProjectInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezZoneProposedProjectInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezZoneProposedProjectInfo implementation " +
					sezZoneProposedProjectInfo.getClass());
		}

		SezZoneProposedProjectInfoModelImpl
			sezZoneProposedProjectInfoModelImpl =
				(SezZoneProposedProjectInfoModelImpl)sezZoneProposedProjectInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezZoneProposedProjectInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezZoneProposedProjectInfo.setCreateDate(date);
			}
			else {
				sezZoneProposedProjectInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezZoneProposedProjectInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezZoneProposedProjectInfo.setModifiedDate(date);
			}
			else {
				sezZoneProposedProjectInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezZoneProposedProjectInfo);
			}
			else {
				sezZoneProposedProjectInfo =
					(SezZoneProposedProjectInfo)session.merge(
						sezZoneProposedProjectInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezZoneProposedProjectInfoImpl.class,
			sezZoneProposedProjectInfoModelImpl, false, true);

		cacheUniqueFindersCache(sezZoneProposedProjectInfoModelImpl);

		if (isNew) {
			sezZoneProposedProjectInfo.setNew(false);
		}

		sezZoneProposedProjectInfo.resetOriginalValues();

		return sezZoneProposedProjectInfo;
	}

	/**
	 * Returns the sez zone proposed project info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez zone proposed project info
	 * @return the sez zone proposed project info
	 * @throws NoSuchSezZoneProposedProjectInfoException if a sez zone proposed project info with the primary key could not be found
	 */
	@Override
	public SezZoneProposedProjectInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezZoneProposedProjectInfoException {

		SezZoneProposedProjectInfo sezZoneProposedProjectInfo =
			fetchByPrimaryKey(primaryKey);

		if (sezZoneProposedProjectInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezZoneProposedProjectInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezZoneProposedProjectInfo;
	}

	/**
	 * Returns the sez zone proposed project info with the primary key or throws a <code>NoSuchSezZoneProposedProjectInfoException</code> if it could not be found.
	 *
	 * @param sezZoneProposedProjectInfoId the primary key of the sez zone proposed project info
	 * @return the sez zone proposed project info
	 * @throws NoSuchSezZoneProposedProjectInfoException if a sez zone proposed project info with the primary key could not be found
	 */
	@Override
	public SezZoneProposedProjectInfo findByPrimaryKey(
			long sezZoneProposedProjectInfoId)
		throws NoSuchSezZoneProposedProjectInfoException {

		return findByPrimaryKey((Serializable)sezZoneProposedProjectInfoId);
	}

	/**
	 * Returns the sez zone proposed project info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneProposedProjectInfoId the primary key of the sez zone proposed project info
	 * @return the sez zone proposed project info, or <code>null</code> if a sez zone proposed project info with the primary key could not be found
	 */
	@Override
	public SezZoneProposedProjectInfo fetchByPrimaryKey(
		long sezZoneProposedProjectInfoId) {

		return fetchByPrimaryKey((Serializable)sezZoneProposedProjectInfoId);
	}

	/**
	 * Returns all the sez zone proposed project infos.
	 *
	 * @return the sez zone proposed project infos
	 */
	@Override
	public List<SezZoneProposedProjectInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez zone proposed project infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneProposedProjectInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone proposed project infos
	 * @param end the upper bound of the range of sez zone proposed project infos (not inclusive)
	 * @return the range of sez zone proposed project infos
	 */
	@Override
	public List<SezZoneProposedProjectInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez zone proposed project infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneProposedProjectInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone proposed project infos
	 * @param end the upper bound of the range of sez zone proposed project infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone proposed project infos
	 */
	@Override
	public List<SezZoneProposedProjectInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneProposedProjectInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez zone proposed project infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneProposedProjectInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone proposed project infos
	 * @param end the upper bound of the range of sez zone proposed project infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone proposed project infos
	 */
	@Override
	public List<SezZoneProposedProjectInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneProposedProjectInfo> orderByComparator,
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

		List<SezZoneProposedProjectInfo> list = null;

		if (useFinderCache) {
			list = (List<SezZoneProposedProjectInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZZONEPROPOSEDPROJECTINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZZONEPROPOSEDPROJECTINFO;

				sql = sql.concat(
					SezZoneProposedProjectInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezZoneProposedProjectInfo>)QueryUtil.list(
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
	 * Removes all the sez zone proposed project infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezZoneProposedProjectInfo sezZoneProposedProjectInfo :
				findAll()) {

			remove(sezZoneProposedProjectInfo);
		}
	}

	/**
	 * Returns the number of sez zone proposed project infos.
	 *
	 * @return the number of sez zone proposed project infos
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
					_SQL_COUNT_SEZZONEPROPOSEDPROJECTINFO);

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
		return "sezZoneProposedProjectInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZZONEPROPOSEDPROJECTINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezZoneProposedProjectInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez zone proposed project info persistence.
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

		SezZoneProposedProjectInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezZoneProposedProjectInfoUtil.setPersistence(null);

		entityCache.removeCache(SezZoneProposedProjectInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZZONEPROPOSEDPROJECTINFO =
		"SELECT sezZoneProposedProjectInfo FROM SezZoneProposedProjectInfo sezZoneProposedProjectInfo";

	private static final String _SQL_SELECT_SEZZONEPROPOSEDPROJECTINFO_WHERE =
		"SELECT sezZoneProposedProjectInfo FROM SezZoneProposedProjectInfo sezZoneProposedProjectInfo WHERE ";

	private static final String _SQL_COUNT_SEZZONEPROPOSEDPROJECTINFO =
		"SELECT COUNT(sezZoneProposedProjectInfo) FROM SezZoneProposedProjectInfo sezZoneProposedProjectInfo";

	private static final String _SQL_COUNT_SEZZONEPROPOSEDPROJECTINFO_WHERE =
		"SELECT COUNT(sezZoneProposedProjectInfo) FROM SezZoneProposedProjectInfo sezZoneProposedProjectInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezZoneProposedProjectInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezZoneProposedProjectInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezZoneProposedProjectInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezZoneProposedProjectInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}