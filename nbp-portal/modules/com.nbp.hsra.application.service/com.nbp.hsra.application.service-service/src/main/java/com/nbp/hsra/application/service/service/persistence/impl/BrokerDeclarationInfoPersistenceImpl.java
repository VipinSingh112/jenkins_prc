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

import com.nbp.hsra.application.service.exception.NoSuchBrokerDeclarationInfoException;
import com.nbp.hsra.application.service.model.BrokerDeclarationInfo;
import com.nbp.hsra.application.service.model.BrokerDeclarationInfoTable;
import com.nbp.hsra.application.service.model.impl.BrokerDeclarationInfoImpl;
import com.nbp.hsra.application.service.model.impl.BrokerDeclarationInfoModelImpl;
import com.nbp.hsra.application.service.service.persistence.BrokerDeclarationInfoPersistence;
import com.nbp.hsra.application.service.service.persistence.BrokerDeclarationInfoUtil;
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
 * The persistence implementation for the broker declaration info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = BrokerDeclarationInfoPersistence.class)
public class BrokerDeclarationInfoPersistenceImpl
	extends BasePersistenceImpl<BrokerDeclarationInfo>
	implements BrokerDeclarationInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>BrokerDeclarationInfoUtil</code> to access the broker declaration info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		BrokerDeclarationInfoImpl.class.getName();

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
	 * Returns the broker declaration info where hsraApplicationId = &#63; or throws a <code>NoSuchBrokerDeclarationInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching broker declaration info
	 * @throws NoSuchBrokerDeclarationInfoException if a matching broker declaration info could not be found
	 */
	@Override
	public BrokerDeclarationInfo findBygetHsraById(long hsraApplicationId)
		throws NoSuchBrokerDeclarationInfoException {

		BrokerDeclarationInfo brokerDeclarationInfo = fetchBygetHsraById(
			hsraApplicationId);

		if (brokerDeclarationInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchBrokerDeclarationInfoException(sb.toString());
		}

		return brokerDeclarationInfo;
	}

	/**
	 * Returns the broker declaration info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching broker declaration info, or <code>null</code> if a matching broker declaration info could not be found
	 */
	@Override
	public BrokerDeclarationInfo fetchBygetHsraById(long hsraApplicationId) {
		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the broker declaration info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching broker declaration info, or <code>null</code> if a matching broker declaration info could not be found
	 */
	@Override
	public BrokerDeclarationInfo fetchBygetHsraById(
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

		if (result instanceof BrokerDeclarationInfo) {
			BrokerDeclarationInfo brokerDeclarationInfo =
				(BrokerDeclarationInfo)result;

			if (hsraApplicationId !=
					brokerDeclarationInfo.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_BROKERDECLARATIONINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<BrokerDeclarationInfo> list = query.list();

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
								"BrokerDeclarationInfoPersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					BrokerDeclarationInfo brokerDeclarationInfo = list.get(0);

					result = brokerDeclarationInfo;

					cacheResult(brokerDeclarationInfo);
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
			return (BrokerDeclarationInfo)result;
		}
	}

	/**
	 * Removes the broker declaration info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the broker declaration info that was removed
	 */
	@Override
	public BrokerDeclarationInfo removeBygetHsraById(long hsraApplicationId)
		throws NoSuchBrokerDeclarationInfoException {

		BrokerDeclarationInfo brokerDeclarationInfo = findBygetHsraById(
			hsraApplicationId);

		return remove(brokerDeclarationInfo);
	}

	/**
	 * Returns the number of broker declaration infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching broker declaration infos
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_BROKERDECLARATIONINFO_WHERE);

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
		"brokerDeclarationInfo.hsraApplicationId = ?";

	public BrokerDeclarationInfoPersistenceImpl() {
		setModelClass(BrokerDeclarationInfo.class);

		setModelImplClass(BrokerDeclarationInfoImpl.class);
		setModelPKClass(long.class);

		setTable(BrokerDeclarationInfoTable.INSTANCE);
	}

	/**
	 * Caches the broker declaration info in the entity cache if it is enabled.
	 *
	 * @param brokerDeclarationInfo the broker declaration info
	 */
	@Override
	public void cacheResult(BrokerDeclarationInfo brokerDeclarationInfo) {
		entityCache.putResult(
			BrokerDeclarationInfoImpl.class,
			brokerDeclarationInfo.getPrimaryKey(), brokerDeclarationInfo);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {brokerDeclarationInfo.getHsraApplicationId()},
			brokerDeclarationInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the broker declaration infos in the entity cache if it is enabled.
	 *
	 * @param brokerDeclarationInfos the broker declaration infos
	 */
	@Override
	public void cacheResult(
		List<BrokerDeclarationInfo> brokerDeclarationInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (brokerDeclarationInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (BrokerDeclarationInfo brokerDeclarationInfo :
				brokerDeclarationInfos) {

			if (entityCache.getResult(
					BrokerDeclarationInfoImpl.class,
					brokerDeclarationInfo.getPrimaryKey()) == null) {

				cacheResult(brokerDeclarationInfo);
			}
		}
	}

	/**
	 * Clears the cache for all broker declaration infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(BrokerDeclarationInfoImpl.class);

		finderCache.clearCache(BrokerDeclarationInfoImpl.class);
	}

	/**
	 * Clears the cache for the broker declaration info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BrokerDeclarationInfo brokerDeclarationInfo) {
		entityCache.removeResult(
			BrokerDeclarationInfoImpl.class, brokerDeclarationInfo);
	}

	@Override
	public void clearCache(List<BrokerDeclarationInfo> brokerDeclarationInfos) {
		for (BrokerDeclarationInfo brokerDeclarationInfo :
				brokerDeclarationInfos) {

			entityCache.removeResult(
				BrokerDeclarationInfoImpl.class, brokerDeclarationInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(BrokerDeclarationInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				BrokerDeclarationInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		BrokerDeclarationInfoModelImpl brokerDeclarationInfoModelImpl) {

		Object[] args = new Object[] {
			brokerDeclarationInfoModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args,
			brokerDeclarationInfoModelImpl);
	}

	/**
	 * Creates a new broker declaration info with the primary key. Does not add the broker declaration info to the database.
	 *
	 * @param brokerDeclareInfoId the primary key for the new broker declaration info
	 * @return the new broker declaration info
	 */
	@Override
	public BrokerDeclarationInfo create(long brokerDeclareInfoId) {
		BrokerDeclarationInfo brokerDeclarationInfo =
			new BrokerDeclarationInfoImpl();

		brokerDeclarationInfo.setNew(true);
		brokerDeclarationInfo.setPrimaryKey(brokerDeclareInfoId);

		brokerDeclarationInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return brokerDeclarationInfo;
	}

	/**
	 * Removes the broker declaration info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param brokerDeclareInfoId the primary key of the broker declaration info
	 * @return the broker declaration info that was removed
	 * @throws NoSuchBrokerDeclarationInfoException if a broker declaration info with the primary key could not be found
	 */
	@Override
	public BrokerDeclarationInfo remove(long brokerDeclareInfoId)
		throws NoSuchBrokerDeclarationInfoException {

		return remove((Serializable)brokerDeclareInfoId);
	}

	/**
	 * Removes the broker declaration info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the broker declaration info
	 * @return the broker declaration info that was removed
	 * @throws NoSuchBrokerDeclarationInfoException if a broker declaration info with the primary key could not be found
	 */
	@Override
	public BrokerDeclarationInfo remove(Serializable primaryKey)
		throws NoSuchBrokerDeclarationInfoException {

		Session session = null;

		try {
			session = openSession();

			BrokerDeclarationInfo brokerDeclarationInfo =
				(BrokerDeclarationInfo)session.get(
					BrokerDeclarationInfoImpl.class, primaryKey);

			if (brokerDeclarationInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBrokerDeclarationInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(brokerDeclarationInfo);
		}
		catch (NoSuchBrokerDeclarationInfoException noSuchEntityException) {
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
	protected BrokerDeclarationInfo removeImpl(
		BrokerDeclarationInfo brokerDeclarationInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(brokerDeclarationInfo)) {
				brokerDeclarationInfo = (BrokerDeclarationInfo)session.get(
					BrokerDeclarationInfoImpl.class,
					brokerDeclarationInfo.getPrimaryKeyObj());
			}

			if (brokerDeclarationInfo != null) {
				session.delete(brokerDeclarationInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (brokerDeclarationInfo != null) {
			clearCache(brokerDeclarationInfo);
		}

		return brokerDeclarationInfo;
	}

	@Override
	public BrokerDeclarationInfo updateImpl(
		BrokerDeclarationInfo brokerDeclarationInfo) {

		boolean isNew = brokerDeclarationInfo.isNew();

		if (!(brokerDeclarationInfo instanceof
				BrokerDeclarationInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(brokerDeclarationInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					brokerDeclarationInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in brokerDeclarationInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom BrokerDeclarationInfo implementation " +
					brokerDeclarationInfo.getClass());
		}

		BrokerDeclarationInfoModelImpl brokerDeclarationInfoModelImpl =
			(BrokerDeclarationInfoModelImpl)brokerDeclarationInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (brokerDeclarationInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				brokerDeclarationInfo.setCreateDate(date);
			}
			else {
				brokerDeclarationInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!brokerDeclarationInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				brokerDeclarationInfo.setModifiedDate(date);
			}
			else {
				brokerDeclarationInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(brokerDeclarationInfo);
			}
			else {
				brokerDeclarationInfo = (BrokerDeclarationInfo)session.merge(
					brokerDeclarationInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			BrokerDeclarationInfoImpl.class, brokerDeclarationInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(brokerDeclarationInfoModelImpl);

		if (isNew) {
			brokerDeclarationInfo.setNew(false);
		}

		brokerDeclarationInfo.resetOriginalValues();

		return brokerDeclarationInfo;
	}

	/**
	 * Returns the broker declaration info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the broker declaration info
	 * @return the broker declaration info
	 * @throws NoSuchBrokerDeclarationInfoException if a broker declaration info with the primary key could not be found
	 */
	@Override
	public BrokerDeclarationInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBrokerDeclarationInfoException {

		BrokerDeclarationInfo brokerDeclarationInfo = fetchByPrimaryKey(
			primaryKey);

		if (brokerDeclarationInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBrokerDeclarationInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return brokerDeclarationInfo;
	}

	/**
	 * Returns the broker declaration info with the primary key or throws a <code>NoSuchBrokerDeclarationInfoException</code> if it could not be found.
	 *
	 * @param brokerDeclareInfoId the primary key of the broker declaration info
	 * @return the broker declaration info
	 * @throws NoSuchBrokerDeclarationInfoException if a broker declaration info with the primary key could not be found
	 */
	@Override
	public BrokerDeclarationInfo findByPrimaryKey(long brokerDeclareInfoId)
		throws NoSuchBrokerDeclarationInfoException {

		return findByPrimaryKey((Serializable)brokerDeclareInfoId);
	}

	/**
	 * Returns the broker declaration info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param brokerDeclareInfoId the primary key of the broker declaration info
	 * @return the broker declaration info, or <code>null</code> if a broker declaration info with the primary key could not be found
	 */
	@Override
	public BrokerDeclarationInfo fetchByPrimaryKey(long brokerDeclareInfoId) {
		return fetchByPrimaryKey((Serializable)brokerDeclareInfoId);
	}

	/**
	 * Returns all the broker declaration infos.
	 *
	 * @return the broker declaration infos
	 */
	@Override
	public List<BrokerDeclarationInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the broker declaration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BrokerDeclarationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of broker declaration infos
	 * @param end the upper bound of the range of broker declaration infos (not inclusive)
	 * @return the range of broker declaration infos
	 */
	@Override
	public List<BrokerDeclarationInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the broker declaration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BrokerDeclarationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of broker declaration infos
	 * @param end the upper bound of the range of broker declaration infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of broker declaration infos
	 */
	@Override
	public List<BrokerDeclarationInfo> findAll(
		int start, int end,
		OrderByComparator<BrokerDeclarationInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the broker declaration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BrokerDeclarationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of broker declaration infos
	 * @param end the upper bound of the range of broker declaration infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of broker declaration infos
	 */
	@Override
	public List<BrokerDeclarationInfo> findAll(
		int start, int end,
		OrderByComparator<BrokerDeclarationInfo> orderByComparator,
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

		List<BrokerDeclarationInfo> list = null;

		if (useFinderCache) {
			list = (List<BrokerDeclarationInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_BROKERDECLARATIONINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_BROKERDECLARATIONINFO;

				sql = sql.concat(BrokerDeclarationInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<BrokerDeclarationInfo>)QueryUtil.list(
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
	 * Removes all the broker declaration infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (BrokerDeclarationInfo brokerDeclarationInfo : findAll()) {
			remove(brokerDeclarationInfo);
		}
	}

	/**
	 * Returns the number of broker declaration infos.
	 *
	 * @return the number of broker declaration infos
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
					_SQL_COUNT_BROKERDECLARATIONINFO);

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
		return "brokerDeclareInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_BROKERDECLARATIONINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return BrokerDeclarationInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the broker declaration info persistence.
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

		BrokerDeclarationInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		BrokerDeclarationInfoUtil.setPersistence(null);

		entityCache.removeCache(BrokerDeclarationInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_BROKERDECLARATIONINFO =
		"SELECT brokerDeclarationInfo FROM BrokerDeclarationInfo brokerDeclarationInfo";

	private static final String _SQL_SELECT_BROKERDECLARATIONINFO_WHERE =
		"SELECT brokerDeclarationInfo FROM BrokerDeclarationInfo brokerDeclarationInfo WHERE ";

	private static final String _SQL_COUNT_BROKERDECLARATIONINFO =
		"SELECT COUNT(brokerDeclarationInfo) FROM BrokerDeclarationInfo brokerDeclarationInfo";

	private static final String _SQL_COUNT_BROKERDECLARATIONINFO_WHERE =
		"SELECT COUNT(brokerDeclarationInfo) FROM BrokerDeclarationInfo brokerDeclarationInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"brokerDeclarationInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No BrokerDeclarationInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No BrokerDeclarationInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		BrokerDeclarationInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}