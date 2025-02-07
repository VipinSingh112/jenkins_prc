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

import com.nbp.hsra.application.service.exception.NoSuchNotifiLegalInfoException;
import com.nbp.hsra.application.service.model.NotifiLegalInfo;
import com.nbp.hsra.application.service.model.NotifiLegalInfoTable;
import com.nbp.hsra.application.service.model.impl.NotifiLegalInfoImpl;
import com.nbp.hsra.application.service.model.impl.NotifiLegalInfoModelImpl;
import com.nbp.hsra.application.service.service.persistence.NotifiLegalInfoPersistence;
import com.nbp.hsra.application.service.service.persistence.NotifiLegalInfoUtil;
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
 * The persistence implementation for the notifi legal info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NotifiLegalInfoPersistence.class)
public class NotifiLegalInfoPersistenceImpl
	extends BasePersistenceImpl<NotifiLegalInfo>
	implements NotifiLegalInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NotifiLegalInfoUtil</code> to access the notifi legal info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NotifiLegalInfoImpl.class.getName();

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
	 * Returns the notifi legal info where hsraApplicationId = &#63; or throws a <code>NoSuchNotifiLegalInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching notifi legal info
	 * @throws NoSuchNotifiLegalInfoException if a matching notifi legal info could not be found
	 */
	@Override
	public NotifiLegalInfo findBygetHsraById(long hsraApplicationId)
		throws NoSuchNotifiLegalInfoException {

		NotifiLegalInfo notifiLegalInfo = fetchBygetHsraById(hsraApplicationId);

		if (notifiLegalInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNotifiLegalInfoException(sb.toString());
		}

		return notifiLegalInfo;
	}

	/**
	 * Returns the notifi legal info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching notifi legal info, or <code>null</code> if a matching notifi legal info could not be found
	 */
	@Override
	public NotifiLegalInfo fetchBygetHsraById(long hsraApplicationId) {
		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the notifi legal info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching notifi legal info, or <code>null</code> if a matching notifi legal info could not be found
	 */
	@Override
	public NotifiLegalInfo fetchBygetHsraById(
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

		if (result instanceof NotifiLegalInfo) {
			NotifiLegalInfo notifiLegalInfo = (NotifiLegalInfo)result;

			if (hsraApplicationId != notifiLegalInfo.getHsraApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NOTIFILEGALINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<NotifiLegalInfo> list = query.list();

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
								"NotifiLegalInfoPersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NotifiLegalInfo notifiLegalInfo = list.get(0);

					result = notifiLegalInfo;

					cacheResult(notifiLegalInfo);
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
			return (NotifiLegalInfo)result;
		}
	}

	/**
	 * Removes the notifi legal info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the notifi legal info that was removed
	 */
	@Override
	public NotifiLegalInfo removeBygetHsraById(long hsraApplicationId)
		throws NoSuchNotifiLegalInfoException {

		NotifiLegalInfo notifiLegalInfo = findBygetHsraById(hsraApplicationId);

		return remove(notifiLegalInfo);
	}

	/**
	 * Returns the number of notifi legal infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching notifi legal infos
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NOTIFILEGALINFO_WHERE);

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
		"notifiLegalInfo.hsraApplicationId = ?";

	public NotifiLegalInfoPersistenceImpl() {
		setModelClass(NotifiLegalInfo.class);

		setModelImplClass(NotifiLegalInfoImpl.class);
		setModelPKClass(long.class);

		setTable(NotifiLegalInfoTable.INSTANCE);
	}

	/**
	 * Caches the notifi legal info in the entity cache if it is enabled.
	 *
	 * @param notifiLegalInfo the notifi legal info
	 */
	@Override
	public void cacheResult(NotifiLegalInfo notifiLegalInfo) {
		entityCache.putResult(
			NotifiLegalInfoImpl.class, notifiLegalInfo.getPrimaryKey(),
			notifiLegalInfo);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {notifiLegalInfo.getHsraApplicationId()},
			notifiLegalInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the notifi legal infos in the entity cache if it is enabled.
	 *
	 * @param notifiLegalInfos the notifi legal infos
	 */
	@Override
	public void cacheResult(List<NotifiLegalInfo> notifiLegalInfos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (notifiLegalInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NotifiLegalInfo notifiLegalInfo : notifiLegalInfos) {
			if (entityCache.getResult(
					NotifiLegalInfoImpl.class,
					notifiLegalInfo.getPrimaryKey()) == null) {

				cacheResult(notifiLegalInfo);
			}
		}
	}

	/**
	 * Clears the cache for all notifi legal infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NotifiLegalInfoImpl.class);

		finderCache.clearCache(NotifiLegalInfoImpl.class);
	}

	/**
	 * Clears the cache for the notifi legal info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NotifiLegalInfo notifiLegalInfo) {
		entityCache.removeResult(NotifiLegalInfoImpl.class, notifiLegalInfo);
	}

	@Override
	public void clearCache(List<NotifiLegalInfo> notifiLegalInfos) {
		for (NotifiLegalInfo notifiLegalInfo : notifiLegalInfos) {
			entityCache.removeResult(
				NotifiLegalInfoImpl.class, notifiLegalInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NotifiLegalInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(NotifiLegalInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NotifiLegalInfoModelImpl notifiLegalInfoModelImpl) {

		Object[] args = new Object[] {
			notifiLegalInfoModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args, notifiLegalInfoModelImpl);
	}

	/**
	 * Creates a new notifi legal info with the primary key. Does not add the notifi legal info to the database.
	 *
	 * @param notifiLegalInfoId the primary key for the new notifi legal info
	 * @return the new notifi legal info
	 */
	@Override
	public NotifiLegalInfo create(long notifiLegalInfoId) {
		NotifiLegalInfo notifiLegalInfo = new NotifiLegalInfoImpl();

		notifiLegalInfo.setNew(true);
		notifiLegalInfo.setPrimaryKey(notifiLegalInfoId);

		notifiLegalInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return notifiLegalInfo;
	}

	/**
	 * Removes the notifi legal info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param notifiLegalInfoId the primary key of the notifi legal info
	 * @return the notifi legal info that was removed
	 * @throws NoSuchNotifiLegalInfoException if a notifi legal info with the primary key could not be found
	 */
	@Override
	public NotifiLegalInfo remove(long notifiLegalInfoId)
		throws NoSuchNotifiLegalInfoException {

		return remove((Serializable)notifiLegalInfoId);
	}

	/**
	 * Removes the notifi legal info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the notifi legal info
	 * @return the notifi legal info that was removed
	 * @throws NoSuchNotifiLegalInfoException if a notifi legal info with the primary key could not be found
	 */
	@Override
	public NotifiLegalInfo remove(Serializable primaryKey)
		throws NoSuchNotifiLegalInfoException {

		Session session = null;

		try {
			session = openSession();

			NotifiLegalInfo notifiLegalInfo = (NotifiLegalInfo)session.get(
				NotifiLegalInfoImpl.class, primaryKey);

			if (notifiLegalInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNotifiLegalInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(notifiLegalInfo);
		}
		catch (NoSuchNotifiLegalInfoException noSuchEntityException) {
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
	protected NotifiLegalInfo removeImpl(NotifiLegalInfo notifiLegalInfo) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(notifiLegalInfo)) {
				notifiLegalInfo = (NotifiLegalInfo)session.get(
					NotifiLegalInfoImpl.class,
					notifiLegalInfo.getPrimaryKeyObj());
			}

			if (notifiLegalInfo != null) {
				session.delete(notifiLegalInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (notifiLegalInfo != null) {
			clearCache(notifiLegalInfo);
		}

		return notifiLegalInfo;
	}

	@Override
	public NotifiLegalInfo updateImpl(NotifiLegalInfo notifiLegalInfo) {
		boolean isNew = notifiLegalInfo.isNew();

		if (!(notifiLegalInfo instanceof NotifiLegalInfoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(notifiLegalInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					notifiLegalInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in notifiLegalInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NotifiLegalInfo implementation " +
					notifiLegalInfo.getClass());
		}

		NotifiLegalInfoModelImpl notifiLegalInfoModelImpl =
			(NotifiLegalInfoModelImpl)notifiLegalInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (notifiLegalInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				notifiLegalInfo.setCreateDate(date);
			}
			else {
				notifiLegalInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!notifiLegalInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				notifiLegalInfo.setModifiedDate(date);
			}
			else {
				notifiLegalInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(notifiLegalInfo);
			}
			else {
				notifiLegalInfo = (NotifiLegalInfo)session.merge(
					notifiLegalInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NotifiLegalInfoImpl.class, notifiLegalInfoModelImpl, false, true);

		cacheUniqueFindersCache(notifiLegalInfoModelImpl);

		if (isNew) {
			notifiLegalInfo.setNew(false);
		}

		notifiLegalInfo.resetOriginalValues();

		return notifiLegalInfo;
	}

	/**
	 * Returns the notifi legal info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the notifi legal info
	 * @return the notifi legal info
	 * @throws NoSuchNotifiLegalInfoException if a notifi legal info with the primary key could not be found
	 */
	@Override
	public NotifiLegalInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNotifiLegalInfoException {

		NotifiLegalInfo notifiLegalInfo = fetchByPrimaryKey(primaryKey);

		if (notifiLegalInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNotifiLegalInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return notifiLegalInfo;
	}

	/**
	 * Returns the notifi legal info with the primary key or throws a <code>NoSuchNotifiLegalInfoException</code> if it could not be found.
	 *
	 * @param notifiLegalInfoId the primary key of the notifi legal info
	 * @return the notifi legal info
	 * @throws NoSuchNotifiLegalInfoException if a notifi legal info with the primary key could not be found
	 */
	@Override
	public NotifiLegalInfo findByPrimaryKey(long notifiLegalInfoId)
		throws NoSuchNotifiLegalInfoException {

		return findByPrimaryKey((Serializable)notifiLegalInfoId);
	}

	/**
	 * Returns the notifi legal info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param notifiLegalInfoId the primary key of the notifi legal info
	 * @return the notifi legal info, or <code>null</code> if a notifi legal info with the primary key could not be found
	 */
	@Override
	public NotifiLegalInfo fetchByPrimaryKey(long notifiLegalInfoId) {
		return fetchByPrimaryKey((Serializable)notifiLegalInfoId);
	}

	/**
	 * Returns all the notifi legal infos.
	 *
	 * @return the notifi legal infos
	 */
	@Override
	public List<NotifiLegalInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the notifi legal infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotifiLegalInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of notifi legal infos
	 * @param end the upper bound of the range of notifi legal infos (not inclusive)
	 * @return the range of notifi legal infos
	 */
	@Override
	public List<NotifiLegalInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the notifi legal infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotifiLegalInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of notifi legal infos
	 * @param end the upper bound of the range of notifi legal infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of notifi legal infos
	 */
	@Override
	public List<NotifiLegalInfo> findAll(
		int start, int end,
		OrderByComparator<NotifiLegalInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the notifi legal infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotifiLegalInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of notifi legal infos
	 * @param end the upper bound of the range of notifi legal infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of notifi legal infos
	 */
	@Override
	public List<NotifiLegalInfo> findAll(
		int start, int end,
		OrderByComparator<NotifiLegalInfo> orderByComparator,
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

		List<NotifiLegalInfo> list = null;

		if (useFinderCache) {
			list = (List<NotifiLegalInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NOTIFILEGALINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NOTIFILEGALINFO;

				sql = sql.concat(NotifiLegalInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NotifiLegalInfo>)QueryUtil.list(
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
	 * Removes all the notifi legal infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NotifiLegalInfo notifiLegalInfo : findAll()) {
			remove(notifiLegalInfo);
		}
	}

	/**
	 * Returns the number of notifi legal infos.
	 *
	 * @return the number of notifi legal infos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NOTIFILEGALINFO);

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
		return "notifiLegalInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NOTIFILEGALINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NotifiLegalInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the notifi legal info persistence.
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

		NotifiLegalInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NotifiLegalInfoUtil.setPersistence(null);

		entityCache.removeCache(NotifiLegalInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_NOTIFILEGALINFO =
		"SELECT notifiLegalInfo FROM NotifiLegalInfo notifiLegalInfo";

	private static final String _SQL_SELECT_NOTIFILEGALINFO_WHERE =
		"SELECT notifiLegalInfo FROM NotifiLegalInfo notifiLegalInfo WHERE ";

	private static final String _SQL_COUNT_NOTIFILEGALINFO =
		"SELECT COUNT(notifiLegalInfo) FROM NotifiLegalInfo notifiLegalInfo";

	private static final String _SQL_COUNT_NOTIFILEGALINFO_WHERE =
		"SELECT COUNT(notifiLegalInfo) FROM NotifiLegalInfo notifiLegalInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "notifiLegalInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NotifiLegalInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NotifiLegalInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NotifiLegalInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}