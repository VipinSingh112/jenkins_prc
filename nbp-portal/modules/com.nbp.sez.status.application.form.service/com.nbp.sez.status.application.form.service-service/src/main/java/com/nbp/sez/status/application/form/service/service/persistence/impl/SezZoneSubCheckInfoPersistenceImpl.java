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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneSubCheckInfoException;
import com.nbp.sez.status.application.form.service.model.SezZoneSubCheckInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneSubCheckInfoTable;
import com.nbp.sez.status.application.form.service.model.impl.SezZoneSubCheckInfoImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezZoneSubCheckInfoModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneSubCheckInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneSubCheckInfoUtil;
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
 * The persistence implementation for the sez zone sub check info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezZoneSubCheckInfoPersistence.class)
public class SezZoneSubCheckInfoPersistenceImpl
	extends BasePersistenceImpl<SezZoneSubCheckInfo>
	implements SezZoneSubCheckInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezZoneSubCheckInfoUtil</code> to access the sez zone sub check info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezZoneSubCheckInfoImpl.class.getName();

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
	 * Returns the sez zone sub check info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezZoneSubCheckInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone sub check info
	 * @throws NoSuchSezZoneSubCheckInfoException if a matching sez zone sub check info could not be found
	 */
	@Override
	public SezZoneSubCheckInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneSubCheckInfoException {

		SezZoneSubCheckInfo sezZoneSubCheckInfo = fetchBygetSezStatusByAppId(
			sezStatusApplicationId);

		if (sezZoneSubCheckInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezZoneSubCheckInfoException(sb.toString());
		}

		return sezZoneSubCheckInfo;
	}

	/**
	 * Returns the sez zone sub check info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone sub check info, or <code>null</code> if a matching sez zone sub check info could not be found
	 */
	@Override
	public SezZoneSubCheckInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez zone sub check info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone sub check info, or <code>null</code> if a matching sez zone sub check info could not be found
	 */
	@Override
	public SezZoneSubCheckInfo fetchBygetSezStatusByAppId(
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

		if (result instanceof SezZoneSubCheckInfo) {
			SezZoneSubCheckInfo sezZoneSubCheckInfo =
				(SezZoneSubCheckInfo)result;

			if (sezStatusApplicationId !=
					sezZoneSubCheckInfo.getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZZONESUBCHECKINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezZoneSubCheckInfo> list = query.list();

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
								"SezZoneSubCheckInfoPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezZoneSubCheckInfo sezZoneSubCheckInfo = list.get(0);

					result = sezZoneSubCheckInfo;

					cacheResult(sezZoneSubCheckInfo);
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
			return (SezZoneSubCheckInfo)result;
		}
	}

	/**
	 * Removes the sez zone sub check info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez zone sub check info that was removed
	 */
	@Override
	public SezZoneSubCheckInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneSubCheckInfoException {

		SezZoneSubCheckInfo sezZoneSubCheckInfo = findBygetSezStatusByAppId(
			sezStatusApplicationId);

		return remove(sezZoneSubCheckInfo);
	}

	/**
	 * Returns the number of sez zone sub check infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone sub check infos
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZZONESUBCHECKINFO_WHERE);

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
			"sezZoneSubCheckInfo.sezStatusApplicationId = ?";

	public SezZoneSubCheckInfoPersistenceImpl() {
		setModelClass(SezZoneSubCheckInfo.class);

		setModelImplClass(SezZoneSubCheckInfoImpl.class);
		setModelPKClass(long.class);

		setTable(SezZoneSubCheckInfoTable.INSTANCE);
	}

	/**
	 * Caches the sez zone sub check info in the entity cache if it is enabled.
	 *
	 * @param sezZoneSubCheckInfo the sez zone sub check info
	 */
	@Override
	public void cacheResult(SezZoneSubCheckInfo sezZoneSubCheckInfo) {
		entityCache.putResult(
			SezZoneSubCheckInfoImpl.class, sezZoneSubCheckInfo.getPrimaryKey(),
			sezZoneSubCheckInfo);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {sezZoneSubCheckInfo.getSezStatusApplicationId()},
			sezZoneSubCheckInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez zone sub check infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneSubCheckInfos the sez zone sub check infos
	 */
	@Override
	public void cacheResult(List<SezZoneSubCheckInfo> sezZoneSubCheckInfos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezZoneSubCheckInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezZoneSubCheckInfo sezZoneSubCheckInfo : sezZoneSubCheckInfos) {
			if (entityCache.getResult(
					SezZoneSubCheckInfoImpl.class,
					sezZoneSubCheckInfo.getPrimaryKey()) == null) {

				cacheResult(sezZoneSubCheckInfo);
			}
		}
	}

	/**
	 * Clears the cache for all sez zone sub check infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezZoneSubCheckInfoImpl.class);

		finderCache.clearCache(SezZoneSubCheckInfoImpl.class);
	}

	/**
	 * Clears the cache for the sez zone sub check info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezZoneSubCheckInfo sezZoneSubCheckInfo) {
		entityCache.removeResult(
			SezZoneSubCheckInfoImpl.class, sezZoneSubCheckInfo);
	}

	@Override
	public void clearCache(List<SezZoneSubCheckInfo> sezZoneSubCheckInfos) {
		for (SezZoneSubCheckInfo sezZoneSubCheckInfo : sezZoneSubCheckInfos) {
			entityCache.removeResult(
				SezZoneSubCheckInfoImpl.class, sezZoneSubCheckInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezZoneSubCheckInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(SezZoneSubCheckInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezZoneSubCheckInfoModelImpl sezZoneSubCheckInfoModelImpl) {

		Object[] args = new Object[] {
			sezZoneSubCheckInfoModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezZoneSubCheckInfoModelImpl);
	}

	/**
	 * Creates a new sez zone sub check info with the primary key. Does not add the sez zone sub check info to the database.
	 *
	 * @param sezZoneSubCheckInfoId the primary key for the new sez zone sub check info
	 * @return the new sez zone sub check info
	 */
	@Override
	public SezZoneSubCheckInfo create(long sezZoneSubCheckInfoId) {
		SezZoneSubCheckInfo sezZoneSubCheckInfo = new SezZoneSubCheckInfoImpl();

		sezZoneSubCheckInfo.setNew(true);
		sezZoneSubCheckInfo.setPrimaryKey(sezZoneSubCheckInfoId);

		sezZoneSubCheckInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sezZoneSubCheckInfo;
	}

	/**
	 * Removes the sez zone sub check info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneSubCheckInfoId the primary key of the sez zone sub check info
	 * @return the sez zone sub check info that was removed
	 * @throws NoSuchSezZoneSubCheckInfoException if a sez zone sub check info with the primary key could not be found
	 */
	@Override
	public SezZoneSubCheckInfo remove(long sezZoneSubCheckInfoId)
		throws NoSuchSezZoneSubCheckInfoException {

		return remove((Serializable)sezZoneSubCheckInfoId);
	}

	/**
	 * Removes the sez zone sub check info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez zone sub check info
	 * @return the sez zone sub check info that was removed
	 * @throws NoSuchSezZoneSubCheckInfoException if a sez zone sub check info with the primary key could not be found
	 */
	@Override
	public SezZoneSubCheckInfo remove(Serializable primaryKey)
		throws NoSuchSezZoneSubCheckInfoException {

		Session session = null;

		try {
			session = openSession();

			SezZoneSubCheckInfo sezZoneSubCheckInfo =
				(SezZoneSubCheckInfo)session.get(
					SezZoneSubCheckInfoImpl.class, primaryKey);

			if (sezZoneSubCheckInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezZoneSubCheckInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezZoneSubCheckInfo);
		}
		catch (NoSuchSezZoneSubCheckInfoException noSuchEntityException) {
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
	protected SezZoneSubCheckInfo removeImpl(
		SezZoneSubCheckInfo sezZoneSubCheckInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezZoneSubCheckInfo)) {
				sezZoneSubCheckInfo = (SezZoneSubCheckInfo)session.get(
					SezZoneSubCheckInfoImpl.class,
					sezZoneSubCheckInfo.getPrimaryKeyObj());
			}

			if (sezZoneSubCheckInfo != null) {
				session.delete(sezZoneSubCheckInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezZoneSubCheckInfo != null) {
			clearCache(sezZoneSubCheckInfo);
		}

		return sezZoneSubCheckInfo;
	}

	@Override
	public SezZoneSubCheckInfo updateImpl(
		SezZoneSubCheckInfo sezZoneSubCheckInfo) {

		boolean isNew = sezZoneSubCheckInfo.isNew();

		if (!(sezZoneSubCheckInfo instanceof SezZoneSubCheckInfoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezZoneSubCheckInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezZoneSubCheckInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezZoneSubCheckInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezZoneSubCheckInfo implementation " +
					sezZoneSubCheckInfo.getClass());
		}

		SezZoneSubCheckInfoModelImpl sezZoneSubCheckInfoModelImpl =
			(SezZoneSubCheckInfoModelImpl)sezZoneSubCheckInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezZoneSubCheckInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezZoneSubCheckInfo.setCreateDate(date);
			}
			else {
				sezZoneSubCheckInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezZoneSubCheckInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezZoneSubCheckInfo.setModifiedDate(date);
			}
			else {
				sezZoneSubCheckInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezZoneSubCheckInfo);
			}
			else {
				sezZoneSubCheckInfo = (SezZoneSubCheckInfo)session.merge(
					sezZoneSubCheckInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezZoneSubCheckInfoImpl.class, sezZoneSubCheckInfoModelImpl, false,
			true);

		cacheUniqueFindersCache(sezZoneSubCheckInfoModelImpl);

		if (isNew) {
			sezZoneSubCheckInfo.setNew(false);
		}

		sezZoneSubCheckInfo.resetOriginalValues();

		return sezZoneSubCheckInfo;
	}

	/**
	 * Returns the sez zone sub check info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez zone sub check info
	 * @return the sez zone sub check info
	 * @throws NoSuchSezZoneSubCheckInfoException if a sez zone sub check info with the primary key could not be found
	 */
	@Override
	public SezZoneSubCheckInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezZoneSubCheckInfoException {

		SezZoneSubCheckInfo sezZoneSubCheckInfo = fetchByPrimaryKey(primaryKey);

		if (sezZoneSubCheckInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezZoneSubCheckInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezZoneSubCheckInfo;
	}

	/**
	 * Returns the sez zone sub check info with the primary key or throws a <code>NoSuchSezZoneSubCheckInfoException</code> if it could not be found.
	 *
	 * @param sezZoneSubCheckInfoId the primary key of the sez zone sub check info
	 * @return the sez zone sub check info
	 * @throws NoSuchSezZoneSubCheckInfoException if a sez zone sub check info with the primary key could not be found
	 */
	@Override
	public SezZoneSubCheckInfo findByPrimaryKey(long sezZoneSubCheckInfoId)
		throws NoSuchSezZoneSubCheckInfoException {

		return findByPrimaryKey((Serializable)sezZoneSubCheckInfoId);
	}

	/**
	 * Returns the sez zone sub check info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneSubCheckInfoId the primary key of the sez zone sub check info
	 * @return the sez zone sub check info, or <code>null</code> if a sez zone sub check info with the primary key could not be found
	 */
	@Override
	public SezZoneSubCheckInfo fetchByPrimaryKey(long sezZoneSubCheckInfoId) {
		return fetchByPrimaryKey((Serializable)sezZoneSubCheckInfoId);
	}

	/**
	 * Returns all the sez zone sub check infos.
	 *
	 * @return the sez zone sub check infos
	 */
	@Override
	public List<SezZoneSubCheckInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez zone sub check infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneSubCheckInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone sub check infos
	 * @param end the upper bound of the range of sez zone sub check infos (not inclusive)
	 * @return the range of sez zone sub check infos
	 */
	@Override
	public List<SezZoneSubCheckInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez zone sub check infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneSubCheckInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone sub check infos
	 * @param end the upper bound of the range of sez zone sub check infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone sub check infos
	 */
	@Override
	public List<SezZoneSubCheckInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneSubCheckInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez zone sub check infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneSubCheckInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone sub check infos
	 * @param end the upper bound of the range of sez zone sub check infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone sub check infos
	 */
	@Override
	public List<SezZoneSubCheckInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneSubCheckInfo> orderByComparator,
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

		List<SezZoneSubCheckInfo> list = null;

		if (useFinderCache) {
			list = (List<SezZoneSubCheckInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZZONESUBCHECKINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZZONESUBCHECKINFO;

				sql = sql.concat(SezZoneSubCheckInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezZoneSubCheckInfo>)QueryUtil.list(
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
	 * Removes all the sez zone sub check infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezZoneSubCheckInfo sezZoneSubCheckInfo : findAll()) {
			remove(sezZoneSubCheckInfo);
		}
	}

	/**
	 * Returns the number of sez zone sub check infos.
	 *
	 * @return the number of sez zone sub check infos
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
					_SQL_COUNT_SEZZONESUBCHECKINFO);

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
		return "sezZoneSubCheckInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZZONESUBCHECKINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezZoneSubCheckInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez zone sub check info persistence.
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

		SezZoneSubCheckInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezZoneSubCheckInfoUtil.setPersistence(null);

		entityCache.removeCache(SezZoneSubCheckInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZZONESUBCHECKINFO =
		"SELECT sezZoneSubCheckInfo FROM SezZoneSubCheckInfo sezZoneSubCheckInfo";

	private static final String _SQL_SELECT_SEZZONESUBCHECKINFO_WHERE =
		"SELECT sezZoneSubCheckInfo FROM SezZoneSubCheckInfo sezZoneSubCheckInfo WHERE ";

	private static final String _SQL_COUNT_SEZZONESUBCHECKINFO =
		"SELECT COUNT(sezZoneSubCheckInfo) FROM SezZoneSubCheckInfo sezZoneSubCheckInfo";

	private static final String _SQL_COUNT_SEZZONESUBCHECKINFO_WHERE =
		"SELECT COUNT(sezZoneSubCheckInfo) FROM SezZoneSubCheckInfo sezZoneSubCheckInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "sezZoneSubCheckInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezZoneSubCheckInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezZoneSubCheckInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezZoneSubCheckInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}