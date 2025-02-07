/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence.impl;

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

import com.nbp.quary.application.form.service.exception.NoSuchQuarryTransferApplicantInfoException;
import com.nbp.quary.application.form.service.model.QuarryTransferApplicantInfo;
import com.nbp.quary.application.form.service.model.QuarryTransferApplicantInfoTable;
import com.nbp.quary.application.form.service.model.impl.QuarryTransferApplicantInfoImpl;
import com.nbp.quary.application.form.service.model.impl.QuarryTransferApplicantInfoModelImpl;
import com.nbp.quary.application.form.service.service.persistence.QuarryTransferApplicantInfoPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryTransferApplicantInfoUtil;
import com.nbp.quary.application.form.service.service.persistence.impl.constants.QUARRY_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the quarry transfer applicant info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QuarryTransferApplicantInfoPersistence.class)
public class QuarryTransferApplicantInfoPersistenceImpl
	extends BasePersistenceImpl<QuarryTransferApplicantInfo>
	implements QuarryTransferApplicantInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QuarryTransferApplicantInfoUtil</code> to access the quarry transfer applicant info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QuarryTransferApplicantInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetQuarry_ById;
	private FinderPath _finderPathCountBygetQuarry_ById;

	/**
	 * Returns the quarry transfer applicant info where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryTransferApplicantInfoException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry transfer applicant info
	 * @throws NoSuchQuarryTransferApplicantInfoException if a matching quarry transfer applicant info could not be found
	 */
	@Override
	public QuarryTransferApplicantInfo findBygetQuarry_ById(
			long quarryApplicationId)
		throws NoSuchQuarryTransferApplicantInfoException {

		QuarryTransferApplicantInfo quarryTransferApplicantInfo =
			fetchBygetQuarry_ById(quarryApplicationId);

		if (quarryTransferApplicantInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("quarryApplicationId=");
			sb.append(quarryApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQuarryTransferApplicantInfoException(sb.toString());
		}

		return quarryTransferApplicantInfo;
	}

	/**
	 * Returns the quarry transfer applicant info where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry transfer applicant info, or <code>null</code> if a matching quarry transfer applicant info could not be found
	 */
	@Override
	public QuarryTransferApplicantInfo fetchBygetQuarry_ById(
		long quarryApplicationId) {

		return fetchBygetQuarry_ById(quarryApplicationId, true);
	}

	/**
	 * Returns the quarry transfer applicant info where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry transfer applicant info, or <code>null</code> if a matching quarry transfer applicant info could not be found
	 */
	@Override
	public QuarryTransferApplicantInfo fetchBygetQuarry_ById(
		long quarryApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {quarryApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetQuarry_ById, finderArgs, this);
		}

		if (result instanceof QuarryTransferApplicantInfo) {
			QuarryTransferApplicantInfo quarryTransferApplicantInfo =
				(QuarryTransferApplicantInfo)result;

			if (quarryApplicationId !=
					quarryTransferApplicantInfo.getQuarryApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_QUARRYTRANSFERAPPLICANTINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRY_BYID_QUARRYAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

				List<QuarryTransferApplicantInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetQuarry_ById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {quarryApplicationId};
							}

							_log.warn(
								"QuarryTransferApplicantInfoPersistenceImpl.fetchBygetQuarry_ById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QuarryTransferApplicantInfo quarryTransferApplicantInfo =
						list.get(0);

					result = quarryTransferApplicantInfo;

					cacheResult(quarryTransferApplicantInfo);
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
			return (QuarryTransferApplicantInfo)result;
		}
	}

	/**
	 * Removes the quarry transfer applicant info where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry transfer applicant info that was removed
	 */
	@Override
	public QuarryTransferApplicantInfo removeBygetQuarry_ById(
			long quarryApplicationId)
		throws NoSuchQuarryTransferApplicantInfoException {

		QuarryTransferApplicantInfo quarryTransferApplicantInfo =
			findBygetQuarry_ById(quarryApplicationId);

		return remove(quarryTransferApplicantInfo);
	}

	/**
	 * Returns the number of quarry transfer applicant infos where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry transfer applicant infos
	 */
	@Override
	public int countBygetQuarry_ById(long quarryApplicationId) {
		FinderPath finderPath = _finderPathCountBygetQuarry_ById;

		Object[] finderArgs = new Object[] {quarryApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYTRANSFERAPPLICANTINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRY_BYID_QUARRYAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

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
		_FINDER_COLUMN_GETQUARRY_BYID_QUARRYAPPLICATIONID_2 =
			"quarryTransferApplicantInfo.quarryApplicationId = ?";

	public QuarryTransferApplicantInfoPersistenceImpl() {
		setModelClass(QuarryTransferApplicantInfo.class);

		setModelImplClass(QuarryTransferApplicantInfoImpl.class);
		setModelPKClass(long.class);

		setTable(QuarryTransferApplicantInfoTable.INSTANCE);
	}

	/**
	 * Caches the quarry transfer applicant info in the entity cache if it is enabled.
	 *
	 * @param quarryTransferApplicantInfo the quarry transfer applicant info
	 */
	@Override
	public void cacheResult(
		QuarryTransferApplicantInfo quarryTransferApplicantInfo) {

		entityCache.putResult(
			QuarryTransferApplicantInfoImpl.class,
			quarryTransferApplicantInfo.getPrimaryKey(),
			quarryTransferApplicantInfo);

		finderCache.putResult(
			_finderPathFetchBygetQuarry_ById,
			new Object[] {quarryTransferApplicantInfo.getQuarryApplicationId()},
			quarryTransferApplicantInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the quarry transfer applicant infos in the entity cache if it is enabled.
	 *
	 * @param quarryTransferApplicantInfos the quarry transfer applicant infos
	 */
	@Override
	public void cacheResult(
		List<QuarryTransferApplicantInfo> quarryTransferApplicantInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (quarryTransferApplicantInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QuarryTransferApplicantInfo quarryTransferApplicantInfo :
				quarryTransferApplicantInfos) {

			if (entityCache.getResult(
					QuarryTransferApplicantInfoImpl.class,
					quarryTransferApplicantInfo.getPrimaryKey()) == null) {

				cacheResult(quarryTransferApplicantInfo);
			}
		}
	}

	/**
	 * Clears the cache for all quarry transfer applicant infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QuarryTransferApplicantInfoImpl.class);

		finderCache.clearCache(QuarryTransferApplicantInfoImpl.class);
	}

	/**
	 * Clears the cache for the quarry transfer applicant info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QuarryTransferApplicantInfo quarryTransferApplicantInfo) {

		entityCache.removeResult(
			QuarryTransferApplicantInfoImpl.class, quarryTransferApplicantInfo);
	}

	@Override
	public void clearCache(
		List<QuarryTransferApplicantInfo> quarryTransferApplicantInfos) {

		for (QuarryTransferApplicantInfo quarryTransferApplicantInfo :
				quarryTransferApplicantInfos) {

			entityCache.removeResult(
				QuarryTransferApplicantInfoImpl.class,
				quarryTransferApplicantInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(QuarryTransferApplicantInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				QuarryTransferApplicantInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		QuarryTransferApplicantInfoModelImpl
			quarryTransferApplicantInfoModelImpl) {

		Object[] args = new Object[] {
			quarryTransferApplicantInfoModelImpl.getQuarryApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetQuarry_ById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetQuarry_ById, args,
			quarryTransferApplicantInfoModelImpl);
	}

	/**
	 * Creates a new quarry transfer applicant info with the primary key. Does not add the quarry transfer applicant info to the database.
	 *
	 * @param quarryTransferInfoId the primary key for the new quarry transfer applicant info
	 * @return the new quarry transfer applicant info
	 */
	@Override
	public QuarryTransferApplicantInfo create(long quarryTransferInfoId) {
		QuarryTransferApplicantInfo quarryTransferApplicantInfo =
			new QuarryTransferApplicantInfoImpl();

		quarryTransferApplicantInfo.setNew(true);
		quarryTransferApplicantInfo.setPrimaryKey(quarryTransferInfoId);

		quarryTransferApplicantInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return quarryTransferApplicantInfo;
	}

	/**
	 * Removes the quarry transfer applicant info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quarryTransferInfoId the primary key of the quarry transfer applicant info
	 * @return the quarry transfer applicant info that was removed
	 * @throws NoSuchQuarryTransferApplicantInfoException if a quarry transfer applicant info with the primary key could not be found
	 */
	@Override
	public QuarryTransferApplicantInfo remove(long quarryTransferInfoId)
		throws NoSuchQuarryTransferApplicantInfoException {

		return remove((Serializable)quarryTransferInfoId);
	}

	/**
	 * Removes the quarry transfer applicant info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the quarry transfer applicant info
	 * @return the quarry transfer applicant info that was removed
	 * @throws NoSuchQuarryTransferApplicantInfoException if a quarry transfer applicant info with the primary key could not be found
	 */
	@Override
	public QuarryTransferApplicantInfo remove(Serializable primaryKey)
		throws NoSuchQuarryTransferApplicantInfoException {

		Session session = null;

		try {
			session = openSession();

			QuarryTransferApplicantInfo quarryTransferApplicantInfo =
				(QuarryTransferApplicantInfo)session.get(
					QuarryTransferApplicantInfoImpl.class, primaryKey);

			if (quarryTransferApplicantInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQuarryTransferApplicantInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(quarryTransferApplicantInfo);
		}
		catch (NoSuchQuarryTransferApplicantInfoException
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
	protected QuarryTransferApplicantInfo removeImpl(
		QuarryTransferApplicantInfo quarryTransferApplicantInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(quarryTransferApplicantInfo)) {
				quarryTransferApplicantInfo =
					(QuarryTransferApplicantInfo)session.get(
						QuarryTransferApplicantInfoImpl.class,
						quarryTransferApplicantInfo.getPrimaryKeyObj());
			}

			if (quarryTransferApplicantInfo != null) {
				session.delete(quarryTransferApplicantInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (quarryTransferApplicantInfo != null) {
			clearCache(quarryTransferApplicantInfo);
		}

		return quarryTransferApplicantInfo;
	}

	@Override
	public QuarryTransferApplicantInfo updateImpl(
		QuarryTransferApplicantInfo quarryTransferApplicantInfo) {

		boolean isNew = quarryTransferApplicantInfo.isNew();

		if (!(quarryTransferApplicantInfo instanceof
				QuarryTransferApplicantInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					quarryTransferApplicantInfo.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					quarryTransferApplicantInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in quarryTransferApplicantInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QuarryTransferApplicantInfo implementation " +
					quarryTransferApplicantInfo.getClass());
		}

		QuarryTransferApplicantInfoModelImpl
			quarryTransferApplicantInfoModelImpl =
				(QuarryTransferApplicantInfoModelImpl)
					quarryTransferApplicantInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (quarryTransferApplicantInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				quarryTransferApplicantInfo.setCreateDate(date);
			}
			else {
				quarryTransferApplicantInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!quarryTransferApplicantInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				quarryTransferApplicantInfo.setModifiedDate(date);
			}
			else {
				quarryTransferApplicantInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(quarryTransferApplicantInfo);
			}
			else {
				quarryTransferApplicantInfo =
					(QuarryTransferApplicantInfo)session.merge(
						quarryTransferApplicantInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			QuarryTransferApplicantInfoImpl.class,
			quarryTransferApplicantInfoModelImpl, false, true);

		cacheUniqueFindersCache(quarryTransferApplicantInfoModelImpl);

		if (isNew) {
			quarryTransferApplicantInfo.setNew(false);
		}

		quarryTransferApplicantInfo.resetOriginalValues();

		return quarryTransferApplicantInfo;
	}

	/**
	 * Returns the quarry transfer applicant info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the quarry transfer applicant info
	 * @return the quarry transfer applicant info
	 * @throws NoSuchQuarryTransferApplicantInfoException if a quarry transfer applicant info with the primary key could not be found
	 */
	@Override
	public QuarryTransferApplicantInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQuarryTransferApplicantInfoException {

		QuarryTransferApplicantInfo quarryTransferApplicantInfo =
			fetchByPrimaryKey(primaryKey);

		if (quarryTransferApplicantInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQuarryTransferApplicantInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return quarryTransferApplicantInfo;
	}

	/**
	 * Returns the quarry transfer applicant info with the primary key or throws a <code>NoSuchQuarryTransferApplicantInfoException</code> if it could not be found.
	 *
	 * @param quarryTransferInfoId the primary key of the quarry transfer applicant info
	 * @return the quarry transfer applicant info
	 * @throws NoSuchQuarryTransferApplicantInfoException if a quarry transfer applicant info with the primary key could not be found
	 */
	@Override
	public QuarryTransferApplicantInfo findByPrimaryKey(
			long quarryTransferInfoId)
		throws NoSuchQuarryTransferApplicantInfoException {

		return findByPrimaryKey((Serializable)quarryTransferInfoId);
	}

	/**
	 * Returns the quarry transfer applicant info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quarryTransferInfoId the primary key of the quarry transfer applicant info
	 * @return the quarry transfer applicant info, or <code>null</code> if a quarry transfer applicant info with the primary key could not be found
	 */
	@Override
	public QuarryTransferApplicantInfo fetchByPrimaryKey(
		long quarryTransferInfoId) {

		return fetchByPrimaryKey((Serializable)quarryTransferInfoId);
	}

	/**
	 * Returns all the quarry transfer applicant infos.
	 *
	 * @return the quarry transfer applicant infos
	 */
	@Override
	public List<QuarryTransferApplicantInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry transfer applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryTransferApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry transfer applicant infos
	 * @param end the upper bound of the range of quarry transfer applicant infos (not inclusive)
	 * @return the range of quarry transfer applicant infos
	 */
	@Override
	public List<QuarryTransferApplicantInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry transfer applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryTransferApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry transfer applicant infos
	 * @param end the upper bound of the range of quarry transfer applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry transfer applicant infos
	 */
	@Override
	public List<QuarryTransferApplicantInfo> findAll(
		int start, int end,
		OrderByComparator<QuarryTransferApplicantInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry transfer applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryTransferApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry transfer applicant infos
	 * @param end the upper bound of the range of quarry transfer applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry transfer applicant infos
	 */
	@Override
	public List<QuarryTransferApplicantInfo> findAll(
		int start, int end,
		OrderByComparator<QuarryTransferApplicantInfo> orderByComparator,
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

		List<QuarryTransferApplicantInfo> list = null;

		if (useFinderCache) {
			list = (List<QuarryTransferApplicantInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUARRYTRANSFERAPPLICANTINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUARRYTRANSFERAPPLICANTINFO;

				sql = sql.concat(
					QuarryTransferApplicantInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<QuarryTransferApplicantInfo>)QueryUtil.list(
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
	 * Removes all the quarry transfer applicant infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QuarryTransferApplicantInfo quarryTransferApplicantInfo :
				findAll()) {

			remove(quarryTransferApplicantInfo);
		}
	}

	/**
	 * Returns the number of quarry transfer applicant infos.
	 *
	 * @return the number of quarry transfer applicant infos
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
					_SQL_COUNT_QUARRYTRANSFERAPPLICANTINFO);

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
		return "quarryTransferInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUARRYTRANSFERAPPLICANTINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QuarryTransferApplicantInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the quarry transfer applicant info persistence.
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

		_finderPathFetchBygetQuarry_ById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetQuarry_ById",
			new String[] {Long.class.getName()},
			new String[] {"quarryApplicationId"}, true);

		_finderPathCountBygetQuarry_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetQuarry_ById",
			new String[] {Long.class.getName()},
			new String[] {"quarryApplicationId"}, false);

		QuarryTransferApplicantInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		QuarryTransferApplicantInfoUtil.setPersistence(null);

		entityCache.removeCache(
			QuarryTransferApplicantInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_QUARRYTRANSFERAPPLICANTINFO =
		"SELECT quarryTransferApplicantInfo FROM QuarryTransferApplicantInfo quarryTransferApplicantInfo";

	private static final String _SQL_SELECT_QUARRYTRANSFERAPPLICANTINFO_WHERE =
		"SELECT quarryTransferApplicantInfo FROM QuarryTransferApplicantInfo quarryTransferApplicantInfo WHERE ";

	private static final String _SQL_COUNT_QUARRYTRANSFERAPPLICANTINFO =
		"SELECT COUNT(quarryTransferApplicantInfo) FROM QuarryTransferApplicantInfo quarryTransferApplicantInfo";

	private static final String _SQL_COUNT_QUARRYTRANSFERAPPLICANTINFO_WHERE =
		"SELECT COUNT(quarryTransferApplicantInfo) FROM QuarryTransferApplicantInfo quarryTransferApplicantInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"quarryTransferApplicantInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QuarryTransferApplicantInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QuarryTransferApplicantInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QuarryTransferApplicantInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}