/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence.impl;

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

import com.nbp.hsra.application.service.exception.NoSuchBrokerRegistrationInfoException;
import com.nbp.hsra.application.service.model.BrokerRegistrationInfo;
import com.nbp.hsra.application.service.model.BrokerRegistrationInfoTable;
import com.nbp.hsra.application.service.model.impl.BrokerRegistrationInfoImpl;
import com.nbp.hsra.application.service.model.impl.BrokerRegistrationInfoModelImpl;
import com.nbp.hsra.application.service.service.persistence.BrokerRegistrationInfoPersistence;
import com.nbp.hsra.application.service.service.persistence.BrokerRegistrationInfoUtil;
import com.nbp.hsra.application.service.service.persistence.impl.constants.HSRA_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the broker registration info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = BrokerRegistrationInfoPersistence.class)
public class BrokerRegistrationInfoPersistenceImpl
	extends BasePersistenceImpl<BrokerRegistrationInfo>
	implements BrokerRegistrationInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>BrokerRegistrationInfoUtil</code> to access the broker registration info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		BrokerRegistrationInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetHsraById;
	private FinderPath _finderPathCountBygetHsraById;

	/**
	 * Returns the broker registration info where hsraApplicationId = &#63; or throws a <code>NoSuchBrokerRegistrationInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching broker registration info
	 * @throws NoSuchBrokerRegistrationInfoException if a matching broker registration info could not be found
	 */
	@Override
	public BrokerRegistrationInfo findBygetHsraById(long hsraApplicationId)
		throws NoSuchBrokerRegistrationInfoException {

		BrokerRegistrationInfo brokerRegistrationInfo = fetchBygetHsraById(
			hsraApplicationId);

		if (brokerRegistrationInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchBrokerRegistrationInfoException(sb.toString());
		}

		return brokerRegistrationInfo;
	}

	/**
	 * Returns the broker registration info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching broker registration info, or <code>null</code> if a matching broker registration info could not be found
	 */
	@Override
	public BrokerRegistrationInfo fetchBygetHsraById(long hsraApplicationId) {
		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the broker registration info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching broker registration info, or <code>null</code> if a matching broker registration info could not be found
	 */
	@Override
	public BrokerRegistrationInfo fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {hsraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHsraById, finderArgs, this);
		}

		if (result instanceof BrokerRegistrationInfo) {
			BrokerRegistrationInfo brokerRegistrationInfo =
				(BrokerRegistrationInfo)result;

			if (hsraApplicationId !=
					brokerRegistrationInfo.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_BROKERREGISTRATIONINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<BrokerRegistrationInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHsraById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {hsraApplicationId};
							}

							_log.warn(
								"BrokerRegistrationInfoPersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					BrokerRegistrationInfo brokerRegistrationInfo = list.get(0);

					result = brokerRegistrationInfo;

					cacheResult(brokerRegistrationInfo);
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
			return (BrokerRegistrationInfo)result;
		}
	}

	/**
	 * Removes the broker registration info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the broker registration info that was removed
	 */
	@Override
	public BrokerRegistrationInfo removeBygetHsraById(long hsraApplicationId)
		throws NoSuchBrokerRegistrationInfoException {

		BrokerRegistrationInfo brokerRegistrationInfo = findBygetHsraById(
			hsraApplicationId);

		return remove(brokerRegistrationInfo);
	}

	/**
	 * Returns the number of broker registration infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching broker registration infos
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_BROKERREGISTRATIONINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

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

	private static final String _FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2 =
		"brokerRegistrationInfo.hsraApplicationId = ?";

	public BrokerRegistrationInfoPersistenceImpl() {
		setModelClass(BrokerRegistrationInfo.class);

		setModelImplClass(BrokerRegistrationInfoImpl.class);
		setModelPKClass(long.class);

		setTable(BrokerRegistrationInfoTable.INSTANCE);
	}

	/**
	 * Caches the broker registration info in the entity cache if it is enabled.
	 *
	 * @param brokerRegistrationInfo the broker registration info
	 */
	@Override
	public void cacheResult(BrokerRegistrationInfo brokerRegistrationInfo) {
		entityCache.putResult(
			BrokerRegistrationInfoImpl.class,
			brokerRegistrationInfo.getPrimaryKey(), brokerRegistrationInfo);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {brokerRegistrationInfo.getHsraApplicationId()},
			brokerRegistrationInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the broker registration infos in the entity cache if it is enabled.
	 *
	 * @param brokerRegistrationInfos the broker registration infos
	 */
	@Override
	public void cacheResult(
		List<BrokerRegistrationInfo> brokerRegistrationInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (brokerRegistrationInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (BrokerRegistrationInfo brokerRegistrationInfo :
				brokerRegistrationInfos) {

			if (entityCache.getResult(
					BrokerRegistrationInfoImpl.class,
					brokerRegistrationInfo.getPrimaryKey()) == null) {

				cacheResult(brokerRegistrationInfo);
			}
		}
	}

	/**
	 * Clears the cache for all broker registration infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(BrokerRegistrationInfoImpl.class);

		finderCache.clearCache(BrokerRegistrationInfoImpl.class);
	}

	/**
	 * Clears the cache for the broker registration info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BrokerRegistrationInfo brokerRegistrationInfo) {
		entityCache.removeResult(
			BrokerRegistrationInfoImpl.class, brokerRegistrationInfo);
	}

	@Override
	public void clearCache(
		List<BrokerRegistrationInfo> brokerRegistrationInfos) {

		for (BrokerRegistrationInfo brokerRegistrationInfo :
				brokerRegistrationInfos) {

			entityCache.removeResult(
				BrokerRegistrationInfoImpl.class, brokerRegistrationInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(BrokerRegistrationInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				BrokerRegistrationInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		BrokerRegistrationInfoModelImpl brokerRegistrationInfoModelImpl) {

		Object[] args = new Object[] {
			brokerRegistrationInfoModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args,
			brokerRegistrationInfoModelImpl);
	}

	/**
	 * Creates a new broker registration info with the primary key. Does not add the broker registration info to the database.
	 *
	 * @param brokerRegstInfoId the primary key for the new broker registration info
	 * @return the new broker registration info
	 */
	@Override
	public BrokerRegistrationInfo create(long brokerRegstInfoId) {
		BrokerRegistrationInfo brokerRegistrationInfo =
			new BrokerRegistrationInfoImpl();

		brokerRegistrationInfo.setNew(true);
		brokerRegistrationInfo.setPrimaryKey(brokerRegstInfoId);

		brokerRegistrationInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return brokerRegistrationInfo;
	}

	/**
	 * Removes the broker registration info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param brokerRegstInfoId the primary key of the broker registration info
	 * @return the broker registration info that was removed
	 * @throws NoSuchBrokerRegistrationInfoException if a broker registration info with the primary key could not be found
	 */
	@Override
	public BrokerRegistrationInfo remove(long brokerRegstInfoId)
		throws NoSuchBrokerRegistrationInfoException {

		return remove((Serializable)brokerRegstInfoId);
	}

	/**
	 * Removes the broker registration info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the broker registration info
	 * @return the broker registration info that was removed
	 * @throws NoSuchBrokerRegistrationInfoException if a broker registration info with the primary key could not be found
	 */
	@Override
	public BrokerRegistrationInfo remove(Serializable primaryKey)
		throws NoSuchBrokerRegistrationInfoException {

		Session session = null;

		try {
			session = openSession();

			BrokerRegistrationInfo brokerRegistrationInfo =
				(BrokerRegistrationInfo)session.get(
					BrokerRegistrationInfoImpl.class, primaryKey);

			if (brokerRegistrationInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBrokerRegistrationInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(brokerRegistrationInfo);
		}
		catch (NoSuchBrokerRegistrationInfoException noSuchEntityException) {
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
	protected BrokerRegistrationInfo removeImpl(
		BrokerRegistrationInfo brokerRegistrationInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(brokerRegistrationInfo)) {
				brokerRegistrationInfo = (BrokerRegistrationInfo)session.get(
					BrokerRegistrationInfoImpl.class,
					brokerRegistrationInfo.getPrimaryKeyObj());
			}

			if (brokerRegistrationInfo != null) {
				session.delete(brokerRegistrationInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (brokerRegistrationInfo != null) {
			clearCache(brokerRegistrationInfo);
		}

		return brokerRegistrationInfo;
	}

	@Override
	public BrokerRegistrationInfo updateImpl(
		BrokerRegistrationInfo brokerRegistrationInfo) {

		boolean isNew = brokerRegistrationInfo.isNew();

		if (!(brokerRegistrationInfo instanceof
				BrokerRegistrationInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(brokerRegistrationInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					brokerRegistrationInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in brokerRegistrationInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom BrokerRegistrationInfo implementation " +
					brokerRegistrationInfo.getClass());
		}

		BrokerRegistrationInfoModelImpl brokerRegistrationInfoModelImpl =
			(BrokerRegistrationInfoModelImpl)brokerRegistrationInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (brokerRegistrationInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				brokerRegistrationInfo.setCreateDate(date);
			}
			else {
				brokerRegistrationInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!brokerRegistrationInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				brokerRegistrationInfo.setModifiedDate(date);
			}
			else {
				brokerRegistrationInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(brokerRegistrationInfo);
			}
			else {
				brokerRegistrationInfo = (BrokerRegistrationInfo)session.merge(
					brokerRegistrationInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			BrokerRegistrationInfoImpl.class, brokerRegistrationInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(brokerRegistrationInfoModelImpl);

		if (isNew) {
			brokerRegistrationInfo.setNew(false);
		}

		brokerRegistrationInfo.resetOriginalValues();

		return brokerRegistrationInfo;
	}

	/**
	 * Returns the broker registration info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the broker registration info
	 * @return the broker registration info
	 * @throws NoSuchBrokerRegistrationInfoException if a broker registration info with the primary key could not be found
	 */
	@Override
	public BrokerRegistrationInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBrokerRegistrationInfoException {

		BrokerRegistrationInfo brokerRegistrationInfo = fetchByPrimaryKey(
			primaryKey);

		if (brokerRegistrationInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBrokerRegistrationInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return brokerRegistrationInfo;
	}

	/**
	 * Returns the broker registration info with the primary key or throws a <code>NoSuchBrokerRegistrationInfoException</code> if it could not be found.
	 *
	 * @param brokerRegstInfoId the primary key of the broker registration info
	 * @return the broker registration info
	 * @throws NoSuchBrokerRegistrationInfoException if a broker registration info with the primary key could not be found
	 */
	@Override
	public BrokerRegistrationInfo findByPrimaryKey(long brokerRegstInfoId)
		throws NoSuchBrokerRegistrationInfoException {

		return findByPrimaryKey((Serializable)brokerRegstInfoId);
	}

	/**
	 * Returns the broker registration info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param brokerRegstInfoId the primary key of the broker registration info
	 * @return the broker registration info, or <code>null</code> if a broker registration info with the primary key could not be found
	 */
	@Override
	public BrokerRegistrationInfo fetchByPrimaryKey(long brokerRegstInfoId) {
		return fetchByPrimaryKey((Serializable)brokerRegstInfoId);
	}

	/**
	 * Returns all the broker registration infos.
	 *
	 * @return the broker registration infos
	 */
	@Override
	public List<BrokerRegistrationInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the broker registration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BrokerRegistrationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of broker registration infos
	 * @param end the upper bound of the range of broker registration infos (not inclusive)
	 * @return the range of broker registration infos
	 */
	@Override
	public List<BrokerRegistrationInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the broker registration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BrokerRegistrationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of broker registration infos
	 * @param end the upper bound of the range of broker registration infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of broker registration infos
	 */
	@Override
	public List<BrokerRegistrationInfo> findAll(
		int start, int end,
		OrderByComparator<BrokerRegistrationInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the broker registration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BrokerRegistrationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of broker registration infos
	 * @param end the upper bound of the range of broker registration infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of broker registration infos
	 */
	@Override
	public List<BrokerRegistrationInfo> findAll(
		int start, int end,
		OrderByComparator<BrokerRegistrationInfo> orderByComparator,
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

		List<BrokerRegistrationInfo> list = null;

		if (useFinderCache) {
			list = (List<BrokerRegistrationInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_BROKERREGISTRATIONINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_BROKERREGISTRATIONINFO;

				sql = sql.concat(BrokerRegistrationInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<BrokerRegistrationInfo>)QueryUtil.list(
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
	 * Removes all the broker registration infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (BrokerRegistrationInfo brokerRegistrationInfo : findAll()) {
			remove(brokerRegistrationInfo);
		}
	}

	/**
	 * Returns the number of broker registration infos.
	 *
	 * @return the number of broker registration infos
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
					_SQL_COUNT_BROKERREGISTRATIONINFO);

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
		return "brokerRegstInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_BROKERREGISTRATIONINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return BrokerRegistrationInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the broker registration info persistence.
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

		_finderPathFetchBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, true);

		_finderPathCountBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, false);

		BrokerRegistrationInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		BrokerRegistrationInfoUtil.setPersistence(null);

		entityCache.removeCache(BrokerRegistrationInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_BROKERREGISTRATIONINFO =
		"SELECT brokerRegistrationInfo FROM BrokerRegistrationInfo brokerRegistrationInfo";

	private static final String _SQL_SELECT_BROKERREGISTRATIONINFO_WHERE =
		"SELECT brokerRegistrationInfo FROM BrokerRegistrationInfo brokerRegistrationInfo WHERE ";

	private static final String _SQL_COUNT_BROKERREGISTRATIONINFO =
		"SELECT COUNT(brokerRegistrationInfo) FROM BrokerRegistrationInfo brokerRegistrationInfo";

	private static final String _SQL_COUNT_BROKERREGISTRATIONINFO_WHERE =
		"SELECT COUNT(brokerRegistrationInfo) FROM BrokerRegistrationInfo brokerRegistrationInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"brokerRegistrationInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No BrokerRegistrationInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No BrokerRegistrationInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		BrokerRegistrationInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}