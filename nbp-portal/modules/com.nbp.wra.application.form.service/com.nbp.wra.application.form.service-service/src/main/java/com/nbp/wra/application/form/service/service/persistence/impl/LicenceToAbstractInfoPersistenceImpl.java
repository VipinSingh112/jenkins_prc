/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence.impl;

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

import com.nbp.wra.application.form.service.exception.NoSuchLicenceToAbstractInfoException;
import com.nbp.wra.application.form.service.model.LicenceToAbstractInfo;
import com.nbp.wra.application.form.service.model.LicenceToAbstractInfoTable;
import com.nbp.wra.application.form.service.model.impl.LicenceToAbstractInfoImpl;
import com.nbp.wra.application.form.service.model.impl.LicenceToAbstractInfoModelImpl;
import com.nbp.wra.application.form.service.service.persistence.LicenceToAbstractInfoPersistence;
import com.nbp.wra.application.form.service.service.persistence.LicenceToAbstractInfoUtil;
import com.nbp.wra.application.form.service.service.persistence.impl.constants.WRA_APPLICATIONPersistenceConstants;

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
 * The persistence implementation for the licence to abstract info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = LicenceToAbstractInfoPersistence.class)
public class LicenceToAbstractInfoPersistenceImpl
	extends BasePersistenceImpl<LicenceToAbstractInfo>
	implements LicenceToAbstractInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>LicenceToAbstractInfoUtil</code> to access the licence to abstract info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		LicenceToAbstractInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetWRA_By_Id;
	private FinderPath _finderPathCountBygetWRA_By_Id;

	/**
	 * Returns the licence to abstract info where wraApplicationId = &#63; or throws a <code>NoSuchLicenceToAbstractInfoException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching licence to abstract info
	 * @throws NoSuchLicenceToAbstractInfoException if a matching licence to abstract info could not be found
	 */
	@Override
	public LicenceToAbstractInfo findBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchLicenceToAbstractInfoException {

		LicenceToAbstractInfo licenceToAbstractInfo = fetchBygetWRA_By_Id(
			wraApplicationId);

		if (licenceToAbstractInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("wraApplicationId=");
			sb.append(wraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchLicenceToAbstractInfoException(sb.toString());
		}

		return licenceToAbstractInfo;
	}

	/**
	 * Returns the licence to abstract info where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching licence to abstract info, or <code>null</code> if a matching licence to abstract info could not be found
	 */
	@Override
	public LicenceToAbstractInfo fetchBygetWRA_By_Id(long wraApplicationId) {
		return fetchBygetWRA_By_Id(wraApplicationId, true);
	}

	/**
	 * Returns the licence to abstract info where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching licence to abstract info, or <code>null</code> if a matching licence to abstract info could not be found
	 */
	@Override
	public LicenceToAbstractInfo fetchBygetWRA_By_Id(
		long wraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {wraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetWRA_By_Id, finderArgs, this);
		}

		if (result instanceof LicenceToAbstractInfo) {
			LicenceToAbstractInfo licenceToAbstractInfo =
				(LicenceToAbstractInfo)result;

			if (wraApplicationId !=
					licenceToAbstractInfo.getWraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_LICENCETOABSTRACTINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETWRA_BY_ID_WRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

				List<LicenceToAbstractInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetWRA_By_Id, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {wraApplicationId};
							}

							_log.warn(
								"LicenceToAbstractInfoPersistenceImpl.fetchBygetWRA_By_Id(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					LicenceToAbstractInfo licenceToAbstractInfo = list.get(0);

					result = licenceToAbstractInfo;

					cacheResult(licenceToAbstractInfo);
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
			return (LicenceToAbstractInfo)result;
		}
	}

	/**
	 * Removes the licence to abstract info where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the licence to abstract info that was removed
	 */
	@Override
	public LicenceToAbstractInfo removeBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchLicenceToAbstractInfoException {

		LicenceToAbstractInfo licenceToAbstractInfo = findBygetWRA_By_Id(
			wraApplicationId);

		return remove(licenceToAbstractInfo);
	}

	/**
	 * Returns the number of licence to abstract infos where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching licence to abstract infos
	 */
	@Override
	public int countBygetWRA_By_Id(long wraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetWRA_By_Id;

		Object[] finderArgs = new Object[] {wraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_LICENCETOABSTRACTINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETWRA_BY_ID_WRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

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

	private static final String _FINDER_COLUMN_GETWRA_BY_ID_WRAAPPLICATIONID_2 =
		"licenceToAbstractInfo.wraApplicationId = ?";

	public LicenceToAbstractInfoPersistenceImpl() {
		setModelClass(LicenceToAbstractInfo.class);

		setModelImplClass(LicenceToAbstractInfoImpl.class);
		setModelPKClass(long.class);

		setTable(LicenceToAbstractInfoTable.INSTANCE);
	}

	/**
	 * Caches the licence to abstract info in the entity cache if it is enabled.
	 *
	 * @param licenceToAbstractInfo the licence to abstract info
	 */
	@Override
	public void cacheResult(LicenceToAbstractInfo licenceToAbstractInfo) {
		entityCache.putResult(
			LicenceToAbstractInfoImpl.class,
			licenceToAbstractInfo.getPrimaryKey(), licenceToAbstractInfo);

		finderCache.putResult(
			_finderPathFetchBygetWRA_By_Id,
			new Object[] {licenceToAbstractInfo.getWraApplicationId()},
			licenceToAbstractInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the licence to abstract infos in the entity cache if it is enabled.
	 *
	 * @param licenceToAbstractInfos the licence to abstract infos
	 */
	@Override
	public void cacheResult(
		List<LicenceToAbstractInfo> licenceToAbstractInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (licenceToAbstractInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (LicenceToAbstractInfo licenceToAbstractInfo :
				licenceToAbstractInfos) {

			if (entityCache.getResult(
					LicenceToAbstractInfoImpl.class,
					licenceToAbstractInfo.getPrimaryKey()) == null) {

				cacheResult(licenceToAbstractInfo);
			}
		}
	}

	/**
	 * Clears the cache for all licence to abstract infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(LicenceToAbstractInfoImpl.class);

		finderCache.clearCache(LicenceToAbstractInfoImpl.class);
	}

	/**
	 * Clears the cache for the licence to abstract info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LicenceToAbstractInfo licenceToAbstractInfo) {
		entityCache.removeResult(
			LicenceToAbstractInfoImpl.class, licenceToAbstractInfo);
	}

	@Override
	public void clearCache(List<LicenceToAbstractInfo> licenceToAbstractInfos) {
		for (LicenceToAbstractInfo licenceToAbstractInfo :
				licenceToAbstractInfos) {

			entityCache.removeResult(
				LicenceToAbstractInfoImpl.class, licenceToAbstractInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(LicenceToAbstractInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				LicenceToAbstractInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		LicenceToAbstractInfoModelImpl licenceToAbstractInfoModelImpl) {

		Object[] args = new Object[] {
			licenceToAbstractInfoModelImpl.getWraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetWRA_By_Id, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetWRA_By_Id, args,
			licenceToAbstractInfoModelImpl);
	}

	/**
	 * Creates a new licence to abstract info with the primary key. Does not add the licence to abstract info to the database.
	 *
	 * @param abstractLicenceId the primary key for the new licence to abstract info
	 * @return the new licence to abstract info
	 */
	@Override
	public LicenceToAbstractInfo create(long abstractLicenceId) {
		LicenceToAbstractInfo licenceToAbstractInfo =
			new LicenceToAbstractInfoImpl();

		licenceToAbstractInfo.setNew(true);
		licenceToAbstractInfo.setPrimaryKey(abstractLicenceId);

		licenceToAbstractInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return licenceToAbstractInfo;
	}

	/**
	 * Removes the licence to abstract info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param abstractLicenceId the primary key of the licence to abstract info
	 * @return the licence to abstract info that was removed
	 * @throws NoSuchLicenceToAbstractInfoException if a licence to abstract info with the primary key could not be found
	 */
	@Override
	public LicenceToAbstractInfo remove(long abstractLicenceId)
		throws NoSuchLicenceToAbstractInfoException {

		return remove((Serializable)abstractLicenceId);
	}

	/**
	 * Removes the licence to abstract info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the licence to abstract info
	 * @return the licence to abstract info that was removed
	 * @throws NoSuchLicenceToAbstractInfoException if a licence to abstract info with the primary key could not be found
	 */
	@Override
	public LicenceToAbstractInfo remove(Serializable primaryKey)
		throws NoSuchLicenceToAbstractInfoException {

		Session session = null;

		try {
			session = openSession();

			LicenceToAbstractInfo licenceToAbstractInfo =
				(LicenceToAbstractInfo)session.get(
					LicenceToAbstractInfoImpl.class, primaryKey);

			if (licenceToAbstractInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLicenceToAbstractInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(licenceToAbstractInfo);
		}
		catch (NoSuchLicenceToAbstractInfoException noSuchEntityException) {
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
	protected LicenceToAbstractInfo removeImpl(
		LicenceToAbstractInfo licenceToAbstractInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(licenceToAbstractInfo)) {
				licenceToAbstractInfo = (LicenceToAbstractInfo)session.get(
					LicenceToAbstractInfoImpl.class,
					licenceToAbstractInfo.getPrimaryKeyObj());
			}

			if (licenceToAbstractInfo != null) {
				session.delete(licenceToAbstractInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (licenceToAbstractInfo != null) {
			clearCache(licenceToAbstractInfo);
		}

		return licenceToAbstractInfo;
	}

	@Override
	public LicenceToAbstractInfo updateImpl(
		LicenceToAbstractInfo licenceToAbstractInfo) {

		boolean isNew = licenceToAbstractInfo.isNew();

		if (!(licenceToAbstractInfo instanceof
				LicenceToAbstractInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(licenceToAbstractInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					licenceToAbstractInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in licenceToAbstractInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom LicenceToAbstractInfo implementation " +
					licenceToAbstractInfo.getClass());
		}

		LicenceToAbstractInfoModelImpl licenceToAbstractInfoModelImpl =
			(LicenceToAbstractInfoModelImpl)licenceToAbstractInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (licenceToAbstractInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				licenceToAbstractInfo.setCreateDate(date);
			}
			else {
				licenceToAbstractInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!licenceToAbstractInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				licenceToAbstractInfo.setModifiedDate(date);
			}
			else {
				licenceToAbstractInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(licenceToAbstractInfo);
			}
			else {
				licenceToAbstractInfo = (LicenceToAbstractInfo)session.merge(
					licenceToAbstractInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			LicenceToAbstractInfoImpl.class, licenceToAbstractInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(licenceToAbstractInfoModelImpl);

		if (isNew) {
			licenceToAbstractInfo.setNew(false);
		}

		licenceToAbstractInfo.resetOriginalValues();

		return licenceToAbstractInfo;
	}

	/**
	 * Returns the licence to abstract info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the licence to abstract info
	 * @return the licence to abstract info
	 * @throws NoSuchLicenceToAbstractInfoException if a licence to abstract info with the primary key could not be found
	 */
	@Override
	public LicenceToAbstractInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLicenceToAbstractInfoException {

		LicenceToAbstractInfo licenceToAbstractInfo = fetchByPrimaryKey(
			primaryKey);

		if (licenceToAbstractInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLicenceToAbstractInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return licenceToAbstractInfo;
	}

	/**
	 * Returns the licence to abstract info with the primary key or throws a <code>NoSuchLicenceToAbstractInfoException</code> if it could not be found.
	 *
	 * @param abstractLicenceId the primary key of the licence to abstract info
	 * @return the licence to abstract info
	 * @throws NoSuchLicenceToAbstractInfoException if a licence to abstract info with the primary key could not be found
	 */
	@Override
	public LicenceToAbstractInfo findByPrimaryKey(long abstractLicenceId)
		throws NoSuchLicenceToAbstractInfoException {

		return findByPrimaryKey((Serializable)abstractLicenceId);
	}

	/**
	 * Returns the licence to abstract info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param abstractLicenceId the primary key of the licence to abstract info
	 * @return the licence to abstract info, or <code>null</code> if a licence to abstract info with the primary key could not be found
	 */
	@Override
	public LicenceToAbstractInfo fetchByPrimaryKey(long abstractLicenceId) {
		return fetchByPrimaryKey((Serializable)abstractLicenceId);
	}

	/**
	 * Returns all the licence to abstract infos.
	 *
	 * @return the licence to abstract infos
	 */
	@Override
	public List<LicenceToAbstractInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the licence to abstract infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LicenceToAbstractInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of licence to abstract infos
	 * @param end the upper bound of the range of licence to abstract infos (not inclusive)
	 * @return the range of licence to abstract infos
	 */
	@Override
	public List<LicenceToAbstractInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the licence to abstract infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LicenceToAbstractInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of licence to abstract infos
	 * @param end the upper bound of the range of licence to abstract infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of licence to abstract infos
	 */
	@Override
	public List<LicenceToAbstractInfo> findAll(
		int start, int end,
		OrderByComparator<LicenceToAbstractInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the licence to abstract infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LicenceToAbstractInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of licence to abstract infos
	 * @param end the upper bound of the range of licence to abstract infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of licence to abstract infos
	 */
	@Override
	public List<LicenceToAbstractInfo> findAll(
		int start, int end,
		OrderByComparator<LicenceToAbstractInfo> orderByComparator,
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

		List<LicenceToAbstractInfo> list = null;

		if (useFinderCache) {
			list = (List<LicenceToAbstractInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_LICENCETOABSTRACTINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_LICENCETOABSTRACTINFO;

				sql = sql.concat(LicenceToAbstractInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<LicenceToAbstractInfo>)QueryUtil.list(
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
	 * Removes all the licence to abstract infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (LicenceToAbstractInfo licenceToAbstractInfo : findAll()) {
			remove(licenceToAbstractInfo);
		}
	}

	/**
	 * Returns the number of licence to abstract infos.
	 *
	 * @return the number of licence to abstract infos
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
					_SQL_COUNT_LICENCETOABSTRACTINFO);

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
		return "abstractLicenceId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_LICENCETOABSTRACTINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return LicenceToAbstractInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the licence to abstract info persistence.
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

		_finderPathFetchBygetWRA_By_Id = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetWRA_By_Id",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, true);

		_finderPathCountBygetWRA_By_Id = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetWRA_By_Id",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, false);

		LicenceToAbstractInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		LicenceToAbstractInfoUtil.setPersistence(null);

		entityCache.removeCache(LicenceToAbstractInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_LICENCETOABSTRACTINFO =
		"SELECT licenceToAbstractInfo FROM LicenceToAbstractInfo licenceToAbstractInfo";

	private static final String _SQL_SELECT_LICENCETOABSTRACTINFO_WHERE =
		"SELECT licenceToAbstractInfo FROM LicenceToAbstractInfo licenceToAbstractInfo WHERE ";

	private static final String _SQL_COUNT_LICENCETOABSTRACTINFO =
		"SELECT COUNT(licenceToAbstractInfo) FROM LicenceToAbstractInfo licenceToAbstractInfo";

	private static final String _SQL_COUNT_LICENCETOABSTRACTINFO_WHERE =
		"SELECT COUNT(licenceToAbstractInfo) FROM LicenceToAbstractInfo licenceToAbstractInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"licenceToAbstractInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No LicenceToAbstractInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No LicenceToAbstractInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		LicenceToAbstractInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}