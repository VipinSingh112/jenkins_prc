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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevEmplomentInfoException;
import com.nbp.sez.status.application.form.service.model.SezDevEmplomentInfo;
import com.nbp.sez.status.application.form.service.model.SezDevEmplomentInfoTable;
import com.nbp.sez.status.application.form.service.model.impl.SezDevEmplomentInfoImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezDevEmplomentInfoModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevEmplomentInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevEmplomentInfoUtil;
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
 * The persistence implementation for the sez dev emploment info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezDevEmplomentInfoPersistence.class)
public class SezDevEmplomentInfoPersistenceImpl
	extends BasePersistenceImpl<SezDevEmplomentInfo>
	implements SezDevEmplomentInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezDevEmplomentInfoUtil</code> to access the sez dev emploment info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezDevEmplomentInfoImpl.class.getName();

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
	 * Returns the sez dev emploment info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDevEmplomentInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev emploment info
	 * @throws NoSuchSezDevEmplomentInfoException if a matching sez dev emploment info could not be found
	 */
	@Override
	public SezDevEmplomentInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevEmplomentInfoException {

		SezDevEmplomentInfo sezDevEmplomentInfo = fetchBygetSezStatusByAppId(
			sezStatusApplicationId);

		if (sezDevEmplomentInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezDevEmplomentInfoException(sb.toString());
		}

		return sezDevEmplomentInfo;
	}

	/**
	 * Returns the sez dev emploment info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev emploment info, or <code>null</code> if a matching sez dev emploment info could not be found
	 */
	@Override
	public SezDevEmplomentInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez dev emploment info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez dev emploment info, or <code>null</code> if a matching sez dev emploment info could not be found
	 */
	@Override
	public SezDevEmplomentInfo fetchBygetSezStatusByAppId(
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

		if (result instanceof SezDevEmplomentInfo) {
			SezDevEmplomentInfo sezDevEmplomentInfo =
				(SezDevEmplomentInfo)result;

			if (sezStatusApplicationId !=
					sezDevEmplomentInfo.getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZDEVEMPLOMENTINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezDevEmplomentInfo> list = query.list();

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
								"SezDevEmplomentInfoPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezDevEmplomentInfo sezDevEmplomentInfo = list.get(0);

					result = sezDevEmplomentInfo;

					cacheResult(sezDevEmplomentInfo);
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
			return (SezDevEmplomentInfo)result;
		}
	}

	/**
	 * Removes the sez dev emploment info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez dev emploment info that was removed
	 */
	@Override
	public SezDevEmplomentInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevEmplomentInfoException {

		SezDevEmplomentInfo sezDevEmplomentInfo = findBygetSezStatusByAppId(
			sezStatusApplicationId);

		return remove(sezDevEmplomentInfo);
	}

	/**
	 * Returns the number of sez dev emploment infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev emploment infos
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZDEVEMPLOMENTINFO_WHERE);

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
			"sezDevEmplomentInfo.sezStatusApplicationId = ?";

	public SezDevEmplomentInfoPersistenceImpl() {
		setModelClass(SezDevEmplomentInfo.class);

		setModelImplClass(SezDevEmplomentInfoImpl.class);
		setModelPKClass(long.class);

		setTable(SezDevEmplomentInfoTable.INSTANCE);
	}

	/**
	 * Caches the sez dev emploment info in the entity cache if it is enabled.
	 *
	 * @param sezDevEmplomentInfo the sez dev emploment info
	 */
	@Override
	public void cacheResult(SezDevEmplomentInfo sezDevEmplomentInfo) {
		entityCache.putResult(
			SezDevEmplomentInfoImpl.class, sezDevEmplomentInfo.getPrimaryKey(),
			sezDevEmplomentInfo);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {sezDevEmplomentInfo.getSezStatusApplicationId()},
			sezDevEmplomentInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez dev emploment infos in the entity cache if it is enabled.
	 *
	 * @param sezDevEmplomentInfos the sez dev emploment infos
	 */
	@Override
	public void cacheResult(List<SezDevEmplomentInfo> sezDevEmplomentInfos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezDevEmplomentInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezDevEmplomentInfo sezDevEmplomentInfo : sezDevEmplomentInfos) {
			if (entityCache.getResult(
					SezDevEmplomentInfoImpl.class,
					sezDevEmplomentInfo.getPrimaryKey()) == null) {

				cacheResult(sezDevEmplomentInfo);
			}
		}
	}

	/**
	 * Clears the cache for all sez dev emploment infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezDevEmplomentInfoImpl.class);

		finderCache.clearCache(SezDevEmplomentInfoImpl.class);
	}

	/**
	 * Clears the cache for the sez dev emploment info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezDevEmplomentInfo sezDevEmplomentInfo) {
		entityCache.removeResult(
			SezDevEmplomentInfoImpl.class, sezDevEmplomentInfo);
	}

	@Override
	public void clearCache(List<SezDevEmplomentInfo> sezDevEmplomentInfos) {
		for (SezDevEmplomentInfo sezDevEmplomentInfo : sezDevEmplomentInfos) {
			entityCache.removeResult(
				SezDevEmplomentInfoImpl.class, sezDevEmplomentInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezDevEmplomentInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(SezDevEmplomentInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezDevEmplomentInfoModelImpl sezDevEmplomentInfoModelImpl) {

		Object[] args = new Object[] {
			sezDevEmplomentInfoModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezDevEmplomentInfoModelImpl);
	}

	/**
	 * Creates a new sez dev emploment info with the primary key. Does not add the sez dev emploment info to the database.
	 *
	 * @param sezDevEmplomentInfoId the primary key for the new sez dev emploment info
	 * @return the new sez dev emploment info
	 */
	@Override
	public SezDevEmplomentInfo create(long sezDevEmplomentInfoId) {
		SezDevEmplomentInfo sezDevEmplomentInfo = new SezDevEmplomentInfoImpl();

		sezDevEmplomentInfo.setNew(true);
		sezDevEmplomentInfo.setPrimaryKey(sezDevEmplomentInfoId);

		sezDevEmplomentInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sezDevEmplomentInfo;
	}

	/**
	 * Removes the sez dev emploment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevEmplomentInfoId the primary key of the sez dev emploment info
	 * @return the sez dev emploment info that was removed
	 * @throws NoSuchSezDevEmplomentInfoException if a sez dev emploment info with the primary key could not be found
	 */
	@Override
	public SezDevEmplomentInfo remove(long sezDevEmplomentInfoId)
		throws NoSuchSezDevEmplomentInfoException {

		return remove((Serializable)sezDevEmplomentInfoId);
	}

	/**
	 * Removes the sez dev emploment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez dev emploment info
	 * @return the sez dev emploment info that was removed
	 * @throws NoSuchSezDevEmplomentInfoException if a sez dev emploment info with the primary key could not be found
	 */
	@Override
	public SezDevEmplomentInfo remove(Serializable primaryKey)
		throws NoSuchSezDevEmplomentInfoException {

		Session session = null;

		try {
			session = openSession();

			SezDevEmplomentInfo sezDevEmplomentInfo =
				(SezDevEmplomentInfo)session.get(
					SezDevEmplomentInfoImpl.class, primaryKey);

			if (sezDevEmplomentInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezDevEmplomentInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezDevEmplomentInfo);
		}
		catch (NoSuchSezDevEmplomentInfoException noSuchEntityException) {
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
	protected SezDevEmplomentInfo removeImpl(
		SezDevEmplomentInfo sezDevEmplomentInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezDevEmplomentInfo)) {
				sezDevEmplomentInfo = (SezDevEmplomentInfo)session.get(
					SezDevEmplomentInfoImpl.class,
					sezDevEmplomentInfo.getPrimaryKeyObj());
			}

			if (sezDevEmplomentInfo != null) {
				session.delete(sezDevEmplomentInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezDevEmplomentInfo != null) {
			clearCache(sezDevEmplomentInfo);
		}

		return sezDevEmplomentInfo;
	}

	@Override
	public SezDevEmplomentInfo updateImpl(
		SezDevEmplomentInfo sezDevEmplomentInfo) {

		boolean isNew = sezDevEmplomentInfo.isNew();

		if (!(sezDevEmplomentInfo instanceof SezDevEmplomentInfoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezDevEmplomentInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezDevEmplomentInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezDevEmplomentInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezDevEmplomentInfo implementation " +
					sezDevEmplomentInfo.getClass());
		}

		SezDevEmplomentInfoModelImpl sezDevEmplomentInfoModelImpl =
			(SezDevEmplomentInfoModelImpl)sezDevEmplomentInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezDevEmplomentInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezDevEmplomentInfo.setCreateDate(date);
			}
			else {
				sezDevEmplomentInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezDevEmplomentInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezDevEmplomentInfo.setModifiedDate(date);
			}
			else {
				sezDevEmplomentInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezDevEmplomentInfo);
			}
			else {
				sezDevEmplomentInfo = (SezDevEmplomentInfo)session.merge(
					sezDevEmplomentInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezDevEmplomentInfoImpl.class, sezDevEmplomentInfoModelImpl, false,
			true);

		cacheUniqueFindersCache(sezDevEmplomentInfoModelImpl);

		if (isNew) {
			sezDevEmplomentInfo.setNew(false);
		}

		sezDevEmplomentInfo.resetOriginalValues();

		return sezDevEmplomentInfo;
	}

	/**
	 * Returns the sez dev emploment info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez dev emploment info
	 * @return the sez dev emploment info
	 * @throws NoSuchSezDevEmplomentInfoException if a sez dev emploment info with the primary key could not be found
	 */
	@Override
	public SezDevEmplomentInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezDevEmplomentInfoException {

		SezDevEmplomentInfo sezDevEmplomentInfo = fetchByPrimaryKey(primaryKey);

		if (sezDevEmplomentInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezDevEmplomentInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezDevEmplomentInfo;
	}

	/**
	 * Returns the sez dev emploment info with the primary key or throws a <code>NoSuchSezDevEmplomentInfoException</code> if it could not be found.
	 *
	 * @param sezDevEmplomentInfoId the primary key of the sez dev emploment info
	 * @return the sez dev emploment info
	 * @throws NoSuchSezDevEmplomentInfoException if a sez dev emploment info with the primary key could not be found
	 */
	@Override
	public SezDevEmplomentInfo findByPrimaryKey(long sezDevEmplomentInfoId)
		throws NoSuchSezDevEmplomentInfoException {

		return findByPrimaryKey((Serializable)sezDevEmplomentInfoId);
	}

	/**
	 * Returns the sez dev emploment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevEmplomentInfoId the primary key of the sez dev emploment info
	 * @return the sez dev emploment info, or <code>null</code> if a sez dev emploment info with the primary key could not be found
	 */
	@Override
	public SezDevEmplomentInfo fetchByPrimaryKey(long sezDevEmplomentInfoId) {
		return fetchByPrimaryKey((Serializable)sezDevEmplomentInfoId);
	}

	/**
	 * Returns all the sez dev emploment infos.
	 *
	 * @return the sez dev emploment infos
	 */
	@Override
	public List<SezDevEmplomentInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev emploment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmplomentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev emploment infos
	 * @param end the upper bound of the range of sez dev emploment infos (not inclusive)
	 * @return the range of sez dev emploment infos
	 */
	@Override
	public List<SezDevEmplomentInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev emploment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmplomentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev emploment infos
	 * @param end the upper bound of the range of sez dev emploment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev emploment infos
	 */
	@Override
	public List<SezDevEmplomentInfo> findAll(
		int start, int end,
		OrderByComparator<SezDevEmplomentInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev emploment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmplomentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev emploment infos
	 * @param end the upper bound of the range of sez dev emploment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev emploment infos
	 */
	@Override
	public List<SezDevEmplomentInfo> findAll(
		int start, int end,
		OrderByComparator<SezDevEmplomentInfo> orderByComparator,
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

		List<SezDevEmplomentInfo> list = null;

		if (useFinderCache) {
			list = (List<SezDevEmplomentInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZDEVEMPLOMENTINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZDEVEMPLOMENTINFO;

				sql = sql.concat(SezDevEmplomentInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezDevEmplomentInfo>)QueryUtil.list(
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
	 * Removes all the sez dev emploment infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezDevEmplomentInfo sezDevEmplomentInfo : findAll()) {
			remove(sezDevEmplomentInfo);
		}
	}

	/**
	 * Returns the number of sez dev emploment infos.
	 *
	 * @return the number of sez dev emploment infos
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
					_SQL_COUNT_SEZDEVEMPLOMENTINFO);

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
		return "sezDevEmplomentInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZDEVEMPLOMENTINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezDevEmplomentInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez dev emploment info persistence.
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

		SezDevEmplomentInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezDevEmplomentInfoUtil.setPersistence(null);

		entityCache.removeCache(SezDevEmplomentInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZDEVEMPLOMENTINFO =
		"SELECT sezDevEmplomentInfo FROM SezDevEmplomentInfo sezDevEmplomentInfo";

	private static final String _SQL_SELECT_SEZDEVEMPLOMENTINFO_WHERE =
		"SELECT sezDevEmplomentInfo FROM SezDevEmplomentInfo sezDevEmplomentInfo WHERE ";

	private static final String _SQL_COUNT_SEZDEVEMPLOMENTINFO =
		"SELECT COUNT(sezDevEmplomentInfo) FROM SezDevEmplomentInfo sezDevEmplomentInfo";

	private static final String _SQL_COUNT_SEZDEVEMPLOMENTINFO_WHERE =
		"SELECT COUNT(sezDevEmplomentInfo) FROM SezDevEmplomentInfo sezDevEmplomentInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "sezDevEmplomentInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezDevEmplomentInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezDevEmplomentInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezDevEmplomentInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}