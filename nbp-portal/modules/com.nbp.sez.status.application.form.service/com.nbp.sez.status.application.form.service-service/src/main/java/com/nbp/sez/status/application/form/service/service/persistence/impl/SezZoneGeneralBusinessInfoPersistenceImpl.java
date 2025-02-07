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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneGeneralBusinessInfoException;
import com.nbp.sez.status.application.form.service.model.SezZoneGeneralBusinessInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneGeneralBusinessInfoTable;
import com.nbp.sez.status.application.form.service.model.impl.SezZoneGeneralBusinessInfoImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezZoneGeneralBusinessInfoModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneGeneralBusinessInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneGeneralBusinessInfoUtil;
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
 * The persistence implementation for the sez zone general business info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezZoneGeneralBusinessInfoPersistence.class)
public class SezZoneGeneralBusinessInfoPersistenceImpl
	extends BasePersistenceImpl<SezZoneGeneralBusinessInfo>
	implements SezZoneGeneralBusinessInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezZoneGeneralBusinessInfoUtil</code> to access the sez zone general business info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezZoneGeneralBusinessInfoImpl.class.getName();

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
	 * Returns the sez zone general business info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezZoneGeneralBusinessInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone general business info
	 * @throws NoSuchSezZoneGeneralBusinessInfoException if a matching sez zone general business info could not be found
	 */
	@Override
	public SezZoneGeneralBusinessInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneGeneralBusinessInfoException {

		SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo =
			fetchBygetSezStatusByAppId(sezStatusApplicationId);

		if (sezZoneGeneralBusinessInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezZoneGeneralBusinessInfoException(sb.toString());
		}

		return sezZoneGeneralBusinessInfo;
	}

	/**
	 * Returns the sez zone general business info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone general business info, or <code>null</code> if a matching sez zone general business info could not be found
	 */
	@Override
	public SezZoneGeneralBusinessInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez zone general business info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone general business info, or <code>null</code> if a matching sez zone general business info could not be found
	 */
	@Override
	public SezZoneGeneralBusinessInfo fetchBygetSezStatusByAppId(
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

		if (result instanceof SezZoneGeneralBusinessInfo) {
			SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo =
				(SezZoneGeneralBusinessInfo)result;

			if (sezStatusApplicationId !=
					sezZoneGeneralBusinessInfo.getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZZONEGENERALBUSINESSINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezZoneGeneralBusinessInfo> list = query.list();

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
								"SezZoneGeneralBusinessInfoPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo =
						list.get(0);

					result = sezZoneGeneralBusinessInfo;

					cacheResult(sezZoneGeneralBusinessInfo);
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
			return (SezZoneGeneralBusinessInfo)result;
		}
	}

	/**
	 * Removes the sez zone general business info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez zone general business info that was removed
	 */
	@Override
	public SezZoneGeneralBusinessInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneGeneralBusinessInfoException {

		SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo =
			findBygetSezStatusByAppId(sezStatusApplicationId);

		return remove(sezZoneGeneralBusinessInfo);
	}

	/**
	 * Returns the number of sez zone general business infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone general business infos
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZZONEGENERALBUSINESSINFO_WHERE);

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
			"sezZoneGeneralBusinessInfo.sezStatusApplicationId = ?";

	public SezZoneGeneralBusinessInfoPersistenceImpl() {
		setModelClass(SezZoneGeneralBusinessInfo.class);

		setModelImplClass(SezZoneGeneralBusinessInfoImpl.class);
		setModelPKClass(long.class);

		setTable(SezZoneGeneralBusinessInfoTable.INSTANCE);
	}

	/**
	 * Caches the sez zone general business info in the entity cache if it is enabled.
	 *
	 * @param sezZoneGeneralBusinessInfo the sez zone general business info
	 */
	@Override
	public void cacheResult(
		SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo) {

		entityCache.putResult(
			SezZoneGeneralBusinessInfoImpl.class,
			sezZoneGeneralBusinessInfo.getPrimaryKey(),
			sezZoneGeneralBusinessInfo);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {
				sezZoneGeneralBusinessInfo.getSezStatusApplicationId()
			},
			sezZoneGeneralBusinessInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez zone general business infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneGeneralBusinessInfos the sez zone general business infos
	 */
	@Override
	public void cacheResult(
		List<SezZoneGeneralBusinessInfo> sezZoneGeneralBusinessInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezZoneGeneralBusinessInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo :
				sezZoneGeneralBusinessInfos) {

			if (entityCache.getResult(
					SezZoneGeneralBusinessInfoImpl.class,
					sezZoneGeneralBusinessInfo.getPrimaryKey()) == null) {

				cacheResult(sezZoneGeneralBusinessInfo);
			}
		}
	}

	/**
	 * Clears the cache for all sez zone general business infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezZoneGeneralBusinessInfoImpl.class);

		finderCache.clearCache(SezZoneGeneralBusinessInfoImpl.class);
	}

	/**
	 * Clears the cache for the sez zone general business info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo) {

		entityCache.removeResult(
			SezZoneGeneralBusinessInfoImpl.class, sezZoneGeneralBusinessInfo);
	}

	@Override
	public void clearCache(
		List<SezZoneGeneralBusinessInfo> sezZoneGeneralBusinessInfos) {

		for (SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo :
				sezZoneGeneralBusinessInfos) {

			entityCache.removeResult(
				SezZoneGeneralBusinessInfoImpl.class,
				sezZoneGeneralBusinessInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezZoneGeneralBusinessInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezZoneGeneralBusinessInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezZoneGeneralBusinessInfoModelImpl
			sezZoneGeneralBusinessInfoModelImpl) {

		Object[] args = new Object[] {
			sezZoneGeneralBusinessInfoModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezZoneGeneralBusinessInfoModelImpl);
	}

	/**
	 * Creates a new sez zone general business info with the primary key. Does not add the sez zone general business info to the database.
	 *
	 * @param sezZoneGeneralBusinessInfoId the primary key for the new sez zone general business info
	 * @return the new sez zone general business info
	 */
	@Override
	public SezZoneGeneralBusinessInfo create(
		long sezZoneGeneralBusinessInfoId) {

		SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo =
			new SezZoneGeneralBusinessInfoImpl();

		sezZoneGeneralBusinessInfo.setNew(true);
		sezZoneGeneralBusinessInfo.setPrimaryKey(sezZoneGeneralBusinessInfoId);

		sezZoneGeneralBusinessInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezZoneGeneralBusinessInfo;
	}

	/**
	 * Removes the sez zone general business info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneGeneralBusinessInfoId the primary key of the sez zone general business info
	 * @return the sez zone general business info that was removed
	 * @throws NoSuchSezZoneGeneralBusinessInfoException if a sez zone general business info with the primary key could not be found
	 */
	@Override
	public SezZoneGeneralBusinessInfo remove(long sezZoneGeneralBusinessInfoId)
		throws NoSuchSezZoneGeneralBusinessInfoException {

		return remove((Serializable)sezZoneGeneralBusinessInfoId);
	}

	/**
	 * Removes the sez zone general business info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez zone general business info
	 * @return the sez zone general business info that was removed
	 * @throws NoSuchSezZoneGeneralBusinessInfoException if a sez zone general business info with the primary key could not be found
	 */
	@Override
	public SezZoneGeneralBusinessInfo remove(Serializable primaryKey)
		throws NoSuchSezZoneGeneralBusinessInfoException {

		Session session = null;

		try {
			session = openSession();

			SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo =
				(SezZoneGeneralBusinessInfo)session.get(
					SezZoneGeneralBusinessInfoImpl.class, primaryKey);

			if (sezZoneGeneralBusinessInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezZoneGeneralBusinessInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezZoneGeneralBusinessInfo);
		}
		catch (NoSuchSezZoneGeneralBusinessInfoException
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
	protected SezZoneGeneralBusinessInfo removeImpl(
		SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezZoneGeneralBusinessInfo)) {
				sezZoneGeneralBusinessInfo =
					(SezZoneGeneralBusinessInfo)session.get(
						SezZoneGeneralBusinessInfoImpl.class,
						sezZoneGeneralBusinessInfo.getPrimaryKeyObj());
			}

			if (sezZoneGeneralBusinessInfo != null) {
				session.delete(sezZoneGeneralBusinessInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezZoneGeneralBusinessInfo != null) {
			clearCache(sezZoneGeneralBusinessInfo);
		}

		return sezZoneGeneralBusinessInfo;
	}

	@Override
	public SezZoneGeneralBusinessInfo updateImpl(
		SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo) {

		boolean isNew = sezZoneGeneralBusinessInfo.isNew();

		if (!(sezZoneGeneralBusinessInfo instanceof
				SezZoneGeneralBusinessInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezZoneGeneralBusinessInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezZoneGeneralBusinessInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezZoneGeneralBusinessInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezZoneGeneralBusinessInfo implementation " +
					sezZoneGeneralBusinessInfo.getClass());
		}

		SezZoneGeneralBusinessInfoModelImpl
			sezZoneGeneralBusinessInfoModelImpl =
				(SezZoneGeneralBusinessInfoModelImpl)sezZoneGeneralBusinessInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezZoneGeneralBusinessInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezZoneGeneralBusinessInfo.setCreateDate(date);
			}
			else {
				sezZoneGeneralBusinessInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezZoneGeneralBusinessInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezZoneGeneralBusinessInfo.setModifiedDate(date);
			}
			else {
				sezZoneGeneralBusinessInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezZoneGeneralBusinessInfo);
			}
			else {
				sezZoneGeneralBusinessInfo =
					(SezZoneGeneralBusinessInfo)session.merge(
						sezZoneGeneralBusinessInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezZoneGeneralBusinessInfoImpl.class,
			sezZoneGeneralBusinessInfoModelImpl, false, true);

		cacheUniqueFindersCache(sezZoneGeneralBusinessInfoModelImpl);

		if (isNew) {
			sezZoneGeneralBusinessInfo.setNew(false);
		}

		sezZoneGeneralBusinessInfo.resetOriginalValues();

		return sezZoneGeneralBusinessInfo;
	}

	/**
	 * Returns the sez zone general business info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez zone general business info
	 * @return the sez zone general business info
	 * @throws NoSuchSezZoneGeneralBusinessInfoException if a sez zone general business info with the primary key could not be found
	 */
	@Override
	public SezZoneGeneralBusinessInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezZoneGeneralBusinessInfoException {

		SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo =
			fetchByPrimaryKey(primaryKey);

		if (sezZoneGeneralBusinessInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezZoneGeneralBusinessInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezZoneGeneralBusinessInfo;
	}

	/**
	 * Returns the sez zone general business info with the primary key or throws a <code>NoSuchSezZoneGeneralBusinessInfoException</code> if it could not be found.
	 *
	 * @param sezZoneGeneralBusinessInfoId the primary key of the sez zone general business info
	 * @return the sez zone general business info
	 * @throws NoSuchSezZoneGeneralBusinessInfoException if a sez zone general business info with the primary key could not be found
	 */
	@Override
	public SezZoneGeneralBusinessInfo findByPrimaryKey(
			long sezZoneGeneralBusinessInfoId)
		throws NoSuchSezZoneGeneralBusinessInfoException {

		return findByPrimaryKey((Serializable)sezZoneGeneralBusinessInfoId);
	}

	/**
	 * Returns the sez zone general business info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneGeneralBusinessInfoId the primary key of the sez zone general business info
	 * @return the sez zone general business info, or <code>null</code> if a sez zone general business info with the primary key could not be found
	 */
	@Override
	public SezZoneGeneralBusinessInfo fetchByPrimaryKey(
		long sezZoneGeneralBusinessInfoId) {

		return fetchByPrimaryKey((Serializable)sezZoneGeneralBusinessInfoId);
	}

	/**
	 * Returns all the sez zone general business infos.
	 *
	 * @return the sez zone general business infos
	 */
	@Override
	public List<SezZoneGeneralBusinessInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez zone general business infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneGeneralBusinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone general business infos
	 * @param end the upper bound of the range of sez zone general business infos (not inclusive)
	 * @return the range of sez zone general business infos
	 */
	@Override
	public List<SezZoneGeneralBusinessInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez zone general business infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneGeneralBusinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone general business infos
	 * @param end the upper bound of the range of sez zone general business infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone general business infos
	 */
	@Override
	public List<SezZoneGeneralBusinessInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneGeneralBusinessInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez zone general business infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneGeneralBusinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone general business infos
	 * @param end the upper bound of the range of sez zone general business infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone general business infos
	 */
	@Override
	public List<SezZoneGeneralBusinessInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneGeneralBusinessInfo> orderByComparator,
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

		List<SezZoneGeneralBusinessInfo> list = null;

		if (useFinderCache) {
			list = (List<SezZoneGeneralBusinessInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZZONEGENERALBUSINESSINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZZONEGENERALBUSINESSINFO;

				sql = sql.concat(
					SezZoneGeneralBusinessInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezZoneGeneralBusinessInfo>)QueryUtil.list(
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
	 * Removes all the sez zone general business infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo :
				findAll()) {

			remove(sezZoneGeneralBusinessInfo);
		}
	}

	/**
	 * Returns the number of sez zone general business infos.
	 *
	 * @return the number of sez zone general business infos
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
					_SQL_COUNT_SEZZONEGENERALBUSINESSINFO);

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
		return "sezZoneGeneralBusinessInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZZONEGENERALBUSINESSINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezZoneGeneralBusinessInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez zone general business info persistence.
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

		SezZoneGeneralBusinessInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezZoneGeneralBusinessInfoUtil.setPersistence(null);

		entityCache.removeCache(SezZoneGeneralBusinessInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZZONEGENERALBUSINESSINFO =
		"SELECT sezZoneGeneralBusinessInfo FROM SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo";

	private static final String _SQL_SELECT_SEZZONEGENERALBUSINESSINFO_WHERE =
		"SELECT sezZoneGeneralBusinessInfo FROM SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo WHERE ";

	private static final String _SQL_COUNT_SEZZONEGENERALBUSINESSINFO =
		"SELECT COUNT(sezZoneGeneralBusinessInfo) FROM SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo";

	private static final String _SQL_COUNT_SEZZONEGENERALBUSINESSINFO_WHERE =
		"SELECT COUNT(sezZoneGeneralBusinessInfo) FROM SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezZoneGeneralBusinessInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezZoneGeneralBusinessInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezZoneGeneralBusinessInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezZoneGeneralBusinessInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}