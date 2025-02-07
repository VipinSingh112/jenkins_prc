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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevShareholdingInfoException;
import com.nbp.sez.status.application.form.service.model.SezDevShareholdingInfo;
import com.nbp.sez.status.application.form.service.model.SezDevShareholdingInfoTable;
import com.nbp.sez.status.application.form.service.model.impl.SezDevShareholdingInfoImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezDevShareholdingInfoModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevShareholdingInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevShareholdingInfoUtil;
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
 * The persistence implementation for the sez dev shareholding info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezDevShareholdingInfoPersistence.class)
public class SezDevShareholdingInfoPersistenceImpl
	extends BasePersistenceImpl<SezDevShareholdingInfo>
	implements SezDevShareholdingInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezDevShareholdingInfoUtil</code> to access the sez dev shareholding info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezDevShareholdingInfoImpl.class.getName();

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
	 * Returns the sez dev shareholding info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDevShareholdingInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev shareholding info
	 * @throws NoSuchSezDevShareholdingInfoException if a matching sez dev shareholding info could not be found
	 */
	@Override
	public SezDevShareholdingInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevShareholdingInfoException {

		SezDevShareholdingInfo sezDevShareholdingInfo =
			fetchBygetSezStatusByAppId(sezStatusApplicationId);

		if (sezDevShareholdingInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezDevShareholdingInfoException(sb.toString());
		}

		return sezDevShareholdingInfo;
	}

	/**
	 * Returns the sez dev shareholding info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev shareholding info, or <code>null</code> if a matching sez dev shareholding info could not be found
	 */
	@Override
	public SezDevShareholdingInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez dev shareholding info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez dev shareholding info, or <code>null</code> if a matching sez dev shareholding info could not be found
	 */
	@Override
	public SezDevShareholdingInfo fetchBygetSezStatusByAppId(
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

		if (result instanceof SezDevShareholdingInfo) {
			SezDevShareholdingInfo sezDevShareholdingInfo =
				(SezDevShareholdingInfo)result;

			if (sezStatusApplicationId !=
					sezDevShareholdingInfo.getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZDEVSHAREHOLDINGINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezDevShareholdingInfo> list = query.list();

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
								"SezDevShareholdingInfoPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezDevShareholdingInfo sezDevShareholdingInfo = list.get(0);

					result = sezDevShareholdingInfo;

					cacheResult(sezDevShareholdingInfo);
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
			return (SezDevShareholdingInfo)result;
		}
	}

	/**
	 * Removes the sez dev shareholding info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez dev shareholding info that was removed
	 */
	@Override
	public SezDevShareholdingInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevShareholdingInfoException {

		SezDevShareholdingInfo sezDevShareholdingInfo =
			findBygetSezStatusByAppId(sezStatusApplicationId);

		return remove(sezDevShareholdingInfo);
	}

	/**
	 * Returns the number of sez dev shareholding infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev shareholding infos
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZDEVSHAREHOLDINGINFO_WHERE);

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
			"sezDevShareholdingInfo.sezStatusApplicationId = ?";

	public SezDevShareholdingInfoPersistenceImpl() {
		setModelClass(SezDevShareholdingInfo.class);

		setModelImplClass(SezDevShareholdingInfoImpl.class);
		setModelPKClass(long.class);

		setTable(SezDevShareholdingInfoTable.INSTANCE);
	}

	/**
	 * Caches the sez dev shareholding info in the entity cache if it is enabled.
	 *
	 * @param sezDevShareholdingInfo the sez dev shareholding info
	 */
	@Override
	public void cacheResult(SezDevShareholdingInfo sezDevShareholdingInfo) {
		entityCache.putResult(
			SezDevShareholdingInfoImpl.class,
			sezDevShareholdingInfo.getPrimaryKey(), sezDevShareholdingInfo);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {sezDevShareholdingInfo.getSezStatusApplicationId()},
			sezDevShareholdingInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez dev shareholding infos in the entity cache if it is enabled.
	 *
	 * @param sezDevShareholdingInfos the sez dev shareholding infos
	 */
	@Override
	public void cacheResult(
		List<SezDevShareholdingInfo> sezDevShareholdingInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezDevShareholdingInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezDevShareholdingInfo sezDevShareholdingInfo :
				sezDevShareholdingInfos) {

			if (entityCache.getResult(
					SezDevShareholdingInfoImpl.class,
					sezDevShareholdingInfo.getPrimaryKey()) == null) {

				cacheResult(sezDevShareholdingInfo);
			}
		}
	}

	/**
	 * Clears the cache for all sez dev shareholding infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezDevShareholdingInfoImpl.class);

		finderCache.clearCache(SezDevShareholdingInfoImpl.class);
	}

	/**
	 * Clears the cache for the sez dev shareholding info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezDevShareholdingInfo sezDevShareholdingInfo) {
		entityCache.removeResult(
			SezDevShareholdingInfoImpl.class, sezDevShareholdingInfo);
	}

	@Override
	public void clearCache(
		List<SezDevShareholdingInfo> sezDevShareholdingInfos) {

		for (SezDevShareholdingInfo sezDevShareholdingInfo :
				sezDevShareholdingInfos) {

			entityCache.removeResult(
				SezDevShareholdingInfoImpl.class, sezDevShareholdingInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezDevShareholdingInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezDevShareholdingInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezDevShareholdingInfoModelImpl sezDevShareholdingInfoModelImpl) {

		Object[] args = new Object[] {
			sezDevShareholdingInfoModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezDevShareholdingInfoModelImpl);
	}

	/**
	 * Creates a new sez dev shareholding info with the primary key. Does not add the sez dev shareholding info to the database.
	 *
	 * @param sezDevShareholdingInfoId the primary key for the new sez dev shareholding info
	 * @return the new sez dev shareholding info
	 */
	@Override
	public SezDevShareholdingInfo create(long sezDevShareholdingInfoId) {
		SezDevShareholdingInfo sezDevShareholdingInfo =
			new SezDevShareholdingInfoImpl();

		sezDevShareholdingInfo.setNew(true);
		sezDevShareholdingInfo.setPrimaryKey(sezDevShareholdingInfoId);

		sezDevShareholdingInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sezDevShareholdingInfo;
	}

	/**
	 * Removes the sez dev shareholding info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevShareholdingInfoId the primary key of the sez dev shareholding info
	 * @return the sez dev shareholding info that was removed
	 * @throws NoSuchSezDevShareholdingInfoException if a sez dev shareholding info with the primary key could not be found
	 */
	@Override
	public SezDevShareholdingInfo remove(long sezDevShareholdingInfoId)
		throws NoSuchSezDevShareholdingInfoException {

		return remove((Serializable)sezDevShareholdingInfoId);
	}

	/**
	 * Removes the sez dev shareholding info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez dev shareholding info
	 * @return the sez dev shareholding info that was removed
	 * @throws NoSuchSezDevShareholdingInfoException if a sez dev shareholding info with the primary key could not be found
	 */
	@Override
	public SezDevShareholdingInfo remove(Serializable primaryKey)
		throws NoSuchSezDevShareholdingInfoException {

		Session session = null;

		try {
			session = openSession();

			SezDevShareholdingInfo sezDevShareholdingInfo =
				(SezDevShareholdingInfo)session.get(
					SezDevShareholdingInfoImpl.class, primaryKey);

			if (sezDevShareholdingInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezDevShareholdingInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezDevShareholdingInfo);
		}
		catch (NoSuchSezDevShareholdingInfoException noSuchEntityException) {
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
	protected SezDevShareholdingInfo removeImpl(
		SezDevShareholdingInfo sezDevShareholdingInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezDevShareholdingInfo)) {
				sezDevShareholdingInfo = (SezDevShareholdingInfo)session.get(
					SezDevShareholdingInfoImpl.class,
					sezDevShareholdingInfo.getPrimaryKeyObj());
			}

			if (sezDevShareholdingInfo != null) {
				session.delete(sezDevShareholdingInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezDevShareholdingInfo != null) {
			clearCache(sezDevShareholdingInfo);
		}

		return sezDevShareholdingInfo;
	}

	@Override
	public SezDevShareholdingInfo updateImpl(
		SezDevShareholdingInfo sezDevShareholdingInfo) {

		boolean isNew = sezDevShareholdingInfo.isNew();

		if (!(sezDevShareholdingInfo instanceof
				SezDevShareholdingInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezDevShareholdingInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezDevShareholdingInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezDevShareholdingInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezDevShareholdingInfo implementation " +
					sezDevShareholdingInfo.getClass());
		}

		SezDevShareholdingInfoModelImpl sezDevShareholdingInfoModelImpl =
			(SezDevShareholdingInfoModelImpl)sezDevShareholdingInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezDevShareholdingInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezDevShareholdingInfo.setCreateDate(date);
			}
			else {
				sezDevShareholdingInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezDevShareholdingInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezDevShareholdingInfo.setModifiedDate(date);
			}
			else {
				sezDevShareholdingInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezDevShareholdingInfo);
			}
			else {
				sezDevShareholdingInfo = (SezDevShareholdingInfo)session.merge(
					sezDevShareholdingInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezDevShareholdingInfoImpl.class, sezDevShareholdingInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(sezDevShareholdingInfoModelImpl);

		if (isNew) {
			sezDevShareholdingInfo.setNew(false);
		}

		sezDevShareholdingInfo.resetOriginalValues();

		return sezDevShareholdingInfo;
	}

	/**
	 * Returns the sez dev shareholding info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez dev shareholding info
	 * @return the sez dev shareholding info
	 * @throws NoSuchSezDevShareholdingInfoException if a sez dev shareholding info with the primary key could not be found
	 */
	@Override
	public SezDevShareholdingInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezDevShareholdingInfoException {

		SezDevShareholdingInfo sezDevShareholdingInfo = fetchByPrimaryKey(
			primaryKey);

		if (sezDevShareholdingInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezDevShareholdingInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezDevShareholdingInfo;
	}

	/**
	 * Returns the sez dev shareholding info with the primary key or throws a <code>NoSuchSezDevShareholdingInfoException</code> if it could not be found.
	 *
	 * @param sezDevShareholdingInfoId the primary key of the sez dev shareholding info
	 * @return the sez dev shareholding info
	 * @throws NoSuchSezDevShareholdingInfoException if a sez dev shareholding info with the primary key could not be found
	 */
	@Override
	public SezDevShareholdingInfo findByPrimaryKey(
			long sezDevShareholdingInfoId)
		throws NoSuchSezDevShareholdingInfoException {

		return findByPrimaryKey((Serializable)sezDevShareholdingInfoId);
	}

	/**
	 * Returns the sez dev shareholding info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevShareholdingInfoId the primary key of the sez dev shareholding info
	 * @return the sez dev shareholding info, or <code>null</code> if a sez dev shareholding info with the primary key could not be found
	 */
	@Override
	public SezDevShareholdingInfo fetchByPrimaryKey(
		long sezDevShareholdingInfoId) {

		return fetchByPrimaryKey((Serializable)sezDevShareholdingInfoId);
	}

	/**
	 * Returns all the sez dev shareholding infos.
	 *
	 * @return the sez dev shareholding infos
	 */
	@Override
	public List<SezDevShareholdingInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev shareholding infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareholdingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev shareholding infos
	 * @param end the upper bound of the range of sez dev shareholding infos (not inclusive)
	 * @return the range of sez dev shareholding infos
	 */
	@Override
	public List<SezDevShareholdingInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev shareholding infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareholdingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev shareholding infos
	 * @param end the upper bound of the range of sez dev shareholding infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev shareholding infos
	 */
	@Override
	public List<SezDevShareholdingInfo> findAll(
		int start, int end,
		OrderByComparator<SezDevShareholdingInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev shareholding infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareholdingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev shareholding infos
	 * @param end the upper bound of the range of sez dev shareholding infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev shareholding infos
	 */
	@Override
	public List<SezDevShareholdingInfo> findAll(
		int start, int end,
		OrderByComparator<SezDevShareholdingInfo> orderByComparator,
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

		List<SezDevShareholdingInfo> list = null;

		if (useFinderCache) {
			list = (List<SezDevShareholdingInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZDEVSHAREHOLDINGINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZDEVSHAREHOLDINGINFO;

				sql = sql.concat(SezDevShareholdingInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezDevShareholdingInfo>)QueryUtil.list(
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
	 * Removes all the sez dev shareholding infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezDevShareholdingInfo sezDevShareholdingInfo : findAll()) {
			remove(sezDevShareholdingInfo);
		}
	}

	/**
	 * Returns the number of sez dev shareholding infos.
	 *
	 * @return the number of sez dev shareholding infos
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
					_SQL_COUNT_SEZDEVSHAREHOLDINGINFO);

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
		return "sezDevShareholdingInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZDEVSHAREHOLDINGINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezDevShareholdingInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez dev shareholding info persistence.
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

		SezDevShareholdingInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezDevShareholdingInfoUtil.setPersistence(null);

		entityCache.removeCache(SezDevShareholdingInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZDEVSHAREHOLDINGINFO =
		"SELECT sezDevShareholdingInfo FROM SezDevShareholdingInfo sezDevShareholdingInfo";

	private static final String _SQL_SELECT_SEZDEVSHAREHOLDINGINFO_WHERE =
		"SELECT sezDevShareholdingInfo FROM SezDevShareholdingInfo sezDevShareholdingInfo WHERE ";

	private static final String _SQL_COUNT_SEZDEVSHAREHOLDINGINFO =
		"SELECT COUNT(sezDevShareholdingInfo) FROM SezDevShareholdingInfo sezDevShareholdingInfo";

	private static final String _SQL_COUNT_SEZDEVSHAREHOLDINGINFO_WHERE =
		"SELECT COUNT(sezDevShareholdingInfo) FROM SezDevShareholdingInfo sezDevShareholdingInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezDevShareholdingInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezDevShareholdingInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezDevShareholdingInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezDevShareholdingInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}