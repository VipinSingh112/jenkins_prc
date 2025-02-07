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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneFinancialInfoException;
import com.nbp.sez.status.application.form.service.model.SezZoneFinancialInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneFinancialInfoTable;
import com.nbp.sez.status.application.form.service.model.impl.SezZoneFinancialInfoImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezZoneFinancialInfoModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneFinancialInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneFinancialInfoUtil;
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
 * The persistence implementation for the sez zone financial info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezZoneFinancialInfoPersistence.class)
public class SezZoneFinancialInfoPersistenceImpl
	extends BasePersistenceImpl<SezZoneFinancialInfo>
	implements SezZoneFinancialInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezZoneFinancialInfoUtil</code> to access the sez zone financial info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezZoneFinancialInfoImpl.class.getName();

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
	 * Returns the sez zone financial info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezZoneFinancialInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone financial info
	 * @throws NoSuchSezZoneFinancialInfoException if a matching sez zone financial info could not be found
	 */
	@Override
	public SezZoneFinancialInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneFinancialInfoException {

		SezZoneFinancialInfo sezZoneFinancialInfo = fetchBygetSezStatusByAppId(
			sezStatusApplicationId);

		if (sezZoneFinancialInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezZoneFinancialInfoException(sb.toString());
		}

		return sezZoneFinancialInfo;
	}

	/**
	 * Returns the sez zone financial info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone financial info, or <code>null</code> if a matching sez zone financial info could not be found
	 */
	@Override
	public SezZoneFinancialInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez zone financial info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone financial info, or <code>null</code> if a matching sez zone financial info could not be found
	 */
	@Override
	public SezZoneFinancialInfo fetchBygetSezStatusByAppId(
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

		if (result instanceof SezZoneFinancialInfo) {
			SezZoneFinancialInfo sezZoneFinancialInfo =
				(SezZoneFinancialInfo)result;

			if (sezStatusApplicationId !=
					sezZoneFinancialInfo.getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZZONEFINANCIALINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezZoneFinancialInfo> list = query.list();

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
								"SezZoneFinancialInfoPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezZoneFinancialInfo sezZoneFinancialInfo = list.get(0);

					result = sezZoneFinancialInfo;

					cacheResult(sezZoneFinancialInfo);
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
			return (SezZoneFinancialInfo)result;
		}
	}

	/**
	 * Removes the sez zone financial info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez zone financial info that was removed
	 */
	@Override
	public SezZoneFinancialInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneFinancialInfoException {

		SezZoneFinancialInfo sezZoneFinancialInfo = findBygetSezStatusByAppId(
			sezStatusApplicationId);

		return remove(sezZoneFinancialInfo);
	}

	/**
	 * Returns the number of sez zone financial infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone financial infos
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZZONEFINANCIALINFO_WHERE);

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
			"sezZoneFinancialInfo.sezStatusApplicationId = ?";

	public SezZoneFinancialInfoPersistenceImpl() {
		setModelClass(SezZoneFinancialInfo.class);

		setModelImplClass(SezZoneFinancialInfoImpl.class);
		setModelPKClass(long.class);

		setTable(SezZoneFinancialInfoTable.INSTANCE);
	}

	/**
	 * Caches the sez zone financial info in the entity cache if it is enabled.
	 *
	 * @param sezZoneFinancialInfo the sez zone financial info
	 */
	@Override
	public void cacheResult(SezZoneFinancialInfo sezZoneFinancialInfo) {
		entityCache.putResult(
			SezZoneFinancialInfoImpl.class,
			sezZoneFinancialInfo.getPrimaryKey(), sezZoneFinancialInfo);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {sezZoneFinancialInfo.getSezStatusApplicationId()},
			sezZoneFinancialInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez zone financial infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneFinancialInfos the sez zone financial infos
	 */
	@Override
	public void cacheResult(List<SezZoneFinancialInfo> sezZoneFinancialInfos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezZoneFinancialInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezZoneFinancialInfo sezZoneFinancialInfo :
				sezZoneFinancialInfos) {

			if (entityCache.getResult(
					SezZoneFinancialInfoImpl.class,
					sezZoneFinancialInfo.getPrimaryKey()) == null) {

				cacheResult(sezZoneFinancialInfo);
			}
		}
	}

	/**
	 * Clears the cache for all sez zone financial infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezZoneFinancialInfoImpl.class);

		finderCache.clearCache(SezZoneFinancialInfoImpl.class);
	}

	/**
	 * Clears the cache for the sez zone financial info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezZoneFinancialInfo sezZoneFinancialInfo) {
		entityCache.removeResult(
			SezZoneFinancialInfoImpl.class, sezZoneFinancialInfo);
	}

	@Override
	public void clearCache(List<SezZoneFinancialInfo> sezZoneFinancialInfos) {
		for (SezZoneFinancialInfo sezZoneFinancialInfo :
				sezZoneFinancialInfos) {

			entityCache.removeResult(
				SezZoneFinancialInfoImpl.class, sezZoneFinancialInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezZoneFinancialInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezZoneFinancialInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezZoneFinancialInfoModelImpl sezZoneFinancialInfoModelImpl) {

		Object[] args = new Object[] {
			sezZoneFinancialInfoModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezZoneFinancialInfoModelImpl);
	}

	/**
	 * Creates a new sez zone financial info with the primary key. Does not add the sez zone financial info to the database.
	 *
	 * @param sezZoneFinancialnfoId the primary key for the new sez zone financial info
	 * @return the new sez zone financial info
	 */
	@Override
	public SezZoneFinancialInfo create(long sezZoneFinancialnfoId) {
		SezZoneFinancialInfo sezZoneFinancialInfo =
			new SezZoneFinancialInfoImpl();

		sezZoneFinancialInfo.setNew(true);
		sezZoneFinancialInfo.setPrimaryKey(sezZoneFinancialnfoId);

		sezZoneFinancialInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sezZoneFinancialInfo;
	}

	/**
	 * Removes the sez zone financial info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneFinancialnfoId the primary key of the sez zone financial info
	 * @return the sez zone financial info that was removed
	 * @throws NoSuchSezZoneFinancialInfoException if a sez zone financial info with the primary key could not be found
	 */
	@Override
	public SezZoneFinancialInfo remove(long sezZoneFinancialnfoId)
		throws NoSuchSezZoneFinancialInfoException {

		return remove((Serializable)sezZoneFinancialnfoId);
	}

	/**
	 * Removes the sez zone financial info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez zone financial info
	 * @return the sez zone financial info that was removed
	 * @throws NoSuchSezZoneFinancialInfoException if a sez zone financial info with the primary key could not be found
	 */
	@Override
	public SezZoneFinancialInfo remove(Serializable primaryKey)
		throws NoSuchSezZoneFinancialInfoException {

		Session session = null;

		try {
			session = openSession();

			SezZoneFinancialInfo sezZoneFinancialInfo =
				(SezZoneFinancialInfo)session.get(
					SezZoneFinancialInfoImpl.class, primaryKey);

			if (sezZoneFinancialInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezZoneFinancialInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezZoneFinancialInfo);
		}
		catch (NoSuchSezZoneFinancialInfoException noSuchEntityException) {
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
	protected SezZoneFinancialInfo removeImpl(
		SezZoneFinancialInfo sezZoneFinancialInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezZoneFinancialInfo)) {
				sezZoneFinancialInfo = (SezZoneFinancialInfo)session.get(
					SezZoneFinancialInfoImpl.class,
					sezZoneFinancialInfo.getPrimaryKeyObj());
			}

			if (sezZoneFinancialInfo != null) {
				session.delete(sezZoneFinancialInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezZoneFinancialInfo != null) {
			clearCache(sezZoneFinancialInfo);
		}

		return sezZoneFinancialInfo;
	}

	@Override
	public SezZoneFinancialInfo updateImpl(
		SezZoneFinancialInfo sezZoneFinancialInfo) {

		boolean isNew = sezZoneFinancialInfo.isNew();

		if (!(sezZoneFinancialInfo instanceof SezZoneFinancialInfoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezZoneFinancialInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezZoneFinancialInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezZoneFinancialInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezZoneFinancialInfo implementation " +
					sezZoneFinancialInfo.getClass());
		}

		SezZoneFinancialInfoModelImpl sezZoneFinancialInfoModelImpl =
			(SezZoneFinancialInfoModelImpl)sezZoneFinancialInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezZoneFinancialInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezZoneFinancialInfo.setCreateDate(date);
			}
			else {
				sezZoneFinancialInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezZoneFinancialInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezZoneFinancialInfo.setModifiedDate(date);
			}
			else {
				sezZoneFinancialInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezZoneFinancialInfo);
			}
			else {
				sezZoneFinancialInfo = (SezZoneFinancialInfo)session.merge(
					sezZoneFinancialInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezZoneFinancialInfoImpl.class, sezZoneFinancialInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(sezZoneFinancialInfoModelImpl);

		if (isNew) {
			sezZoneFinancialInfo.setNew(false);
		}

		sezZoneFinancialInfo.resetOriginalValues();

		return sezZoneFinancialInfo;
	}

	/**
	 * Returns the sez zone financial info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez zone financial info
	 * @return the sez zone financial info
	 * @throws NoSuchSezZoneFinancialInfoException if a sez zone financial info with the primary key could not be found
	 */
	@Override
	public SezZoneFinancialInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezZoneFinancialInfoException {

		SezZoneFinancialInfo sezZoneFinancialInfo = fetchByPrimaryKey(
			primaryKey);

		if (sezZoneFinancialInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezZoneFinancialInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezZoneFinancialInfo;
	}

	/**
	 * Returns the sez zone financial info with the primary key or throws a <code>NoSuchSezZoneFinancialInfoException</code> if it could not be found.
	 *
	 * @param sezZoneFinancialnfoId the primary key of the sez zone financial info
	 * @return the sez zone financial info
	 * @throws NoSuchSezZoneFinancialInfoException if a sez zone financial info with the primary key could not be found
	 */
	@Override
	public SezZoneFinancialInfo findByPrimaryKey(long sezZoneFinancialnfoId)
		throws NoSuchSezZoneFinancialInfoException {

		return findByPrimaryKey((Serializable)sezZoneFinancialnfoId);
	}

	/**
	 * Returns the sez zone financial info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneFinancialnfoId the primary key of the sez zone financial info
	 * @return the sez zone financial info, or <code>null</code> if a sez zone financial info with the primary key could not be found
	 */
	@Override
	public SezZoneFinancialInfo fetchByPrimaryKey(long sezZoneFinancialnfoId) {
		return fetchByPrimaryKey((Serializable)sezZoneFinancialnfoId);
	}

	/**
	 * Returns all the sez zone financial infos.
	 *
	 * @return the sez zone financial infos
	 */
	@Override
	public List<SezZoneFinancialInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez zone financial infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneFinancialInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone financial infos
	 * @param end the upper bound of the range of sez zone financial infos (not inclusive)
	 * @return the range of sez zone financial infos
	 */
	@Override
	public List<SezZoneFinancialInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez zone financial infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneFinancialInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone financial infos
	 * @param end the upper bound of the range of sez zone financial infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone financial infos
	 */
	@Override
	public List<SezZoneFinancialInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneFinancialInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez zone financial infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneFinancialInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone financial infos
	 * @param end the upper bound of the range of sez zone financial infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone financial infos
	 */
	@Override
	public List<SezZoneFinancialInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneFinancialInfo> orderByComparator,
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

		List<SezZoneFinancialInfo> list = null;

		if (useFinderCache) {
			list = (List<SezZoneFinancialInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZZONEFINANCIALINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZZONEFINANCIALINFO;

				sql = sql.concat(SezZoneFinancialInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezZoneFinancialInfo>)QueryUtil.list(
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
	 * Removes all the sez zone financial infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezZoneFinancialInfo sezZoneFinancialInfo : findAll()) {
			remove(sezZoneFinancialInfo);
		}
	}

	/**
	 * Returns the number of sez zone financial infos.
	 *
	 * @return the number of sez zone financial infos
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
					_SQL_COUNT_SEZZONEFINANCIALINFO);

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
		return "sezZoneFinancialnfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZZONEFINANCIALINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezZoneFinancialInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez zone financial info persistence.
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

		SezZoneFinancialInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezZoneFinancialInfoUtil.setPersistence(null);

		entityCache.removeCache(SezZoneFinancialInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZZONEFINANCIALINFO =
		"SELECT sezZoneFinancialInfo FROM SezZoneFinancialInfo sezZoneFinancialInfo";

	private static final String _SQL_SELECT_SEZZONEFINANCIALINFO_WHERE =
		"SELECT sezZoneFinancialInfo FROM SezZoneFinancialInfo sezZoneFinancialInfo WHERE ";

	private static final String _SQL_COUNT_SEZZONEFINANCIALINFO =
		"SELECT COUNT(sezZoneFinancialInfo) FROM SezZoneFinancialInfo sezZoneFinancialInfo";

	private static final String _SQL_COUNT_SEZZONEFINANCIALINFO_WHERE =
		"SELECT COUNT(sezZoneFinancialInfo) FROM SezZoneFinancialInfo sezZoneFinancialInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezZoneFinancialInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezZoneFinancialInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezZoneFinancialInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezZoneFinancialInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}