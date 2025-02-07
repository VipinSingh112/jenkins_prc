/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence.impl;

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

import com.nbp.jtb.application.form.service.exception.NoSuchAttractDetailFormInfoException;
import com.nbp.jtb.application.form.service.model.AttractDetailFormInfo;
import com.nbp.jtb.application.form.service.model.AttractDetailFormInfoTable;
import com.nbp.jtb.application.form.service.model.impl.AttractDetailFormInfoImpl;
import com.nbp.jtb.application.form.service.model.impl.AttractDetailFormInfoModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AttractDetailFormInfoPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractDetailFormInfoUtil;
import com.nbp.jtb.application.form.service.service.persistence.impl.constants.JTB_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the attract detail form info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AttractDetailFormInfoPersistence.class)
public class AttractDetailFormInfoPersistenceImpl
	extends BasePersistenceImpl<AttractDetailFormInfo>
	implements AttractDetailFormInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AttractDetailFormInfoUtil</code> to access the attract detail form info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AttractDetailFormInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJTB_ByApplicationId;
	private FinderPath _finderPathCountBygetJTB_ByApplicationId;

	/**
	 * Returns the attract detail form info where jtbApplicationId = &#63; or throws a <code>NoSuchAttractDetailFormInfoException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attract detail form info
	 * @throws NoSuchAttractDetailFormInfoException if a matching attract detail form info could not be found
	 */
	@Override
	public AttractDetailFormInfo findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractDetailFormInfoException {

		AttractDetailFormInfo attractDetailFormInfo =
			fetchBygetJTB_ByApplicationId(jtbApplicationId);

		if (attractDetailFormInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAttractDetailFormInfoException(sb.toString());
		}

		return attractDetailFormInfo;
	}

	/**
	 * Returns the attract detail form info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attract detail form info, or <code>null</code> if a matching attract detail form info could not be found
	 */
	@Override
	public AttractDetailFormInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the attract detail form info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attract detail form info, or <code>null</code> if a matching attract detail form info could not be found
	 */
	@Override
	public AttractDetailFormInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {jtbApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJTB_ByApplicationId, finderArgs, this);
		}

		if (result instanceof AttractDetailFormInfo) {
			AttractDetailFormInfo attractDetailFormInfo =
				(AttractDetailFormInfo)result;

			if (jtbApplicationId !=
					attractDetailFormInfo.getJtbApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ATTRACTDETAILFORMINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AttractDetailFormInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJTB_ByApplicationId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {jtbApplicationId};
							}

							_log.warn(
								"AttractDetailFormInfoPersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AttractDetailFormInfo attractDetailFormInfo = list.get(0);

					result = attractDetailFormInfo;

					cacheResult(attractDetailFormInfo);
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
			return (AttractDetailFormInfo)result;
		}
	}

	/**
	 * Removes the attract detail form info where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attract detail form info that was removed
	 */
	@Override
	public AttractDetailFormInfo removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractDetailFormInfoException {

		AttractDetailFormInfo attractDetailFormInfo =
			findBygetJTB_ByApplicationId(jtbApplicationId);

		return remove(attractDetailFormInfo);
	}

	/**
	 * Returns the number of attract detail form infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attract detail form infos
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ATTRACTDETAILFORMINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

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
		_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2 =
			"attractDetailFormInfo.jtbApplicationId = ?";

	public AttractDetailFormInfoPersistenceImpl() {
		setModelClass(AttractDetailFormInfo.class);

		setModelImplClass(AttractDetailFormInfoImpl.class);
		setModelPKClass(long.class);

		setTable(AttractDetailFormInfoTable.INSTANCE);
	}

	/**
	 * Caches the attract detail form info in the entity cache if it is enabled.
	 *
	 * @param attractDetailFormInfo the attract detail form info
	 */
	@Override
	public void cacheResult(AttractDetailFormInfo attractDetailFormInfo) {
		entityCache.putResult(
			AttractDetailFormInfoImpl.class,
			attractDetailFormInfo.getPrimaryKey(), attractDetailFormInfo);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {attractDetailFormInfo.getJtbApplicationId()},
			attractDetailFormInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the attract detail form infos in the entity cache if it is enabled.
	 *
	 * @param attractDetailFormInfos the attract detail form infos
	 */
	@Override
	public void cacheResult(
		List<AttractDetailFormInfo> attractDetailFormInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (attractDetailFormInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AttractDetailFormInfo attractDetailFormInfo :
				attractDetailFormInfos) {

			if (entityCache.getResult(
					AttractDetailFormInfoImpl.class,
					attractDetailFormInfo.getPrimaryKey()) == null) {

				cacheResult(attractDetailFormInfo);
			}
		}
	}

	/**
	 * Clears the cache for all attract detail form infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AttractDetailFormInfoImpl.class);

		finderCache.clearCache(AttractDetailFormInfoImpl.class);
	}

	/**
	 * Clears the cache for the attract detail form info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AttractDetailFormInfo attractDetailFormInfo) {
		entityCache.removeResult(
			AttractDetailFormInfoImpl.class, attractDetailFormInfo);
	}

	@Override
	public void clearCache(List<AttractDetailFormInfo> attractDetailFormInfos) {
		for (AttractDetailFormInfo attractDetailFormInfo :
				attractDetailFormInfos) {

			entityCache.removeResult(
				AttractDetailFormInfoImpl.class, attractDetailFormInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AttractDetailFormInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AttractDetailFormInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AttractDetailFormInfoModelImpl attractDetailFormInfoModelImpl) {

		Object[] args = new Object[] {
			attractDetailFormInfoModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			attractDetailFormInfoModelImpl);
	}

	/**
	 * Creates a new attract detail form info with the primary key. Does not add the attract detail form info to the database.
	 *
	 * @param attractDetailFormInfoId the primary key for the new attract detail form info
	 * @return the new attract detail form info
	 */
	@Override
	public AttractDetailFormInfo create(long attractDetailFormInfoId) {
		AttractDetailFormInfo attractDetailFormInfo =
			new AttractDetailFormInfoImpl();

		attractDetailFormInfo.setNew(true);
		attractDetailFormInfo.setPrimaryKey(attractDetailFormInfoId);

		attractDetailFormInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return attractDetailFormInfo;
	}

	/**
	 * Removes the attract detail form info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractDetailFormInfoId the primary key of the attract detail form info
	 * @return the attract detail form info that was removed
	 * @throws NoSuchAttractDetailFormInfoException if a attract detail form info with the primary key could not be found
	 */
	@Override
	public AttractDetailFormInfo remove(long attractDetailFormInfoId)
		throws NoSuchAttractDetailFormInfoException {

		return remove((Serializable)attractDetailFormInfoId);
	}

	/**
	 * Removes the attract detail form info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attract detail form info
	 * @return the attract detail form info that was removed
	 * @throws NoSuchAttractDetailFormInfoException if a attract detail form info with the primary key could not be found
	 */
	@Override
	public AttractDetailFormInfo remove(Serializable primaryKey)
		throws NoSuchAttractDetailFormInfoException {

		Session session = null;

		try {
			session = openSession();

			AttractDetailFormInfo attractDetailFormInfo =
				(AttractDetailFormInfo)session.get(
					AttractDetailFormInfoImpl.class, primaryKey);

			if (attractDetailFormInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttractDetailFormInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(attractDetailFormInfo);
		}
		catch (NoSuchAttractDetailFormInfoException noSuchEntityException) {
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
	protected AttractDetailFormInfo removeImpl(
		AttractDetailFormInfo attractDetailFormInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attractDetailFormInfo)) {
				attractDetailFormInfo = (AttractDetailFormInfo)session.get(
					AttractDetailFormInfoImpl.class,
					attractDetailFormInfo.getPrimaryKeyObj());
			}

			if (attractDetailFormInfo != null) {
				session.delete(attractDetailFormInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (attractDetailFormInfo != null) {
			clearCache(attractDetailFormInfo);
		}

		return attractDetailFormInfo;
	}

	@Override
	public AttractDetailFormInfo updateImpl(
		AttractDetailFormInfo attractDetailFormInfo) {

		boolean isNew = attractDetailFormInfo.isNew();

		if (!(attractDetailFormInfo instanceof
				AttractDetailFormInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(attractDetailFormInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					attractDetailFormInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in attractDetailFormInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AttractDetailFormInfo implementation " +
					attractDetailFormInfo.getClass());
		}

		AttractDetailFormInfoModelImpl attractDetailFormInfoModelImpl =
			(AttractDetailFormInfoModelImpl)attractDetailFormInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (attractDetailFormInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				attractDetailFormInfo.setCreateDate(date);
			}
			else {
				attractDetailFormInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!attractDetailFormInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				attractDetailFormInfo.setModifiedDate(date);
			}
			else {
				attractDetailFormInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(attractDetailFormInfo);
			}
			else {
				attractDetailFormInfo = (AttractDetailFormInfo)session.merge(
					attractDetailFormInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AttractDetailFormInfoImpl.class, attractDetailFormInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(attractDetailFormInfoModelImpl);

		if (isNew) {
			attractDetailFormInfo.setNew(false);
		}

		attractDetailFormInfo.resetOriginalValues();

		return attractDetailFormInfo;
	}

	/**
	 * Returns the attract detail form info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attract detail form info
	 * @return the attract detail form info
	 * @throws NoSuchAttractDetailFormInfoException if a attract detail form info with the primary key could not be found
	 */
	@Override
	public AttractDetailFormInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttractDetailFormInfoException {

		AttractDetailFormInfo attractDetailFormInfo = fetchByPrimaryKey(
			primaryKey);

		if (attractDetailFormInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttractDetailFormInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return attractDetailFormInfo;
	}

	/**
	 * Returns the attract detail form info with the primary key or throws a <code>NoSuchAttractDetailFormInfoException</code> if it could not be found.
	 *
	 * @param attractDetailFormInfoId the primary key of the attract detail form info
	 * @return the attract detail form info
	 * @throws NoSuchAttractDetailFormInfoException if a attract detail form info with the primary key could not be found
	 */
	@Override
	public AttractDetailFormInfo findByPrimaryKey(long attractDetailFormInfoId)
		throws NoSuchAttractDetailFormInfoException {

		return findByPrimaryKey((Serializable)attractDetailFormInfoId);
	}

	/**
	 * Returns the attract detail form info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractDetailFormInfoId the primary key of the attract detail form info
	 * @return the attract detail form info, or <code>null</code> if a attract detail form info with the primary key could not be found
	 */
	@Override
	public AttractDetailFormInfo fetchByPrimaryKey(
		long attractDetailFormInfoId) {

		return fetchByPrimaryKey((Serializable)attractDetailFormInfoId);
	}

	/**
	 * Returns all the attract detail form infos.
	 *
	 * @return the attract detail form infos
	 */
	@Override
	public List<AttractDetailFormInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the attract detail form infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractDetailFormInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attract detail form infos
	 * @param end the upper bound of the range of attract detail form infos (not inclusive)
	 * @return the range of attract detail form infos
	 */
	@Override
	public List<AttractDetailFormInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the attract detail form infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractDetailFormInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attract detail form infos
	 * @param end the upper bound of the range of attract detail form infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attract detail form infos
	 */
	@Override
	public List<AttractDetailFormInfo> findAll(
		int start, int end,
		OrderByComparator<AttractDetailFormInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the attract detail form infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractDetailFormInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attract detail form infos
	 * @param end the upper bound of the range of attract detail form infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attract detail form infos
	 */
	@Override
	public List<AttractDetailFormInfo> findAll(
		int start, int end,
		OrderByComparator<AttractDetailFormInfo> orderByComparator,
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

		List<AttractDetailFormInfo> list = null;

		if (useFinderCache) {
			list = (List<AttractDetailFormInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ATTRACTDETAILFORMINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ATTRACTDETAILFORMINFO;

				sql = sql.concat(AttractDetailFormInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AttractDetailFormInfo>)QueryUtil.list(
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
	 * Removes all the attract detail form infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AttractDetailFormInfo attractDetailFormInfo : findAll()) {
			remove(attractDetailFormInfo);
		}
	}

	/**
	 * Returns the number of attract detail form infos.
	 *
	 * @return the number of attract detail form infos
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
					_SQL_COUNT_ATTRACTDETAILFORMINFO);

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
		return "attractDetailFormInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ATTRACTDETAILFORMINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AttractDetailFormInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the attract detail form info persistence.
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

		_finderPathFetchBygetJTB_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJTB_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, true);

		_finderPathCountBygetJTB_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJTB_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, false);

		AttractDetailFormInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AttractDetailFormInfoUtil.setPersistence(null);

		entityCache.removeCache(AttractDetailFormInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ATTRACTDETAILFORMINFO =
		"SELECT attractDetailFormInfo FROM AttractDetailFormInfo attractDetailFormInfo";

	private static final String _SQL_SELECT_ATTRACTDETAILFORMINFO_WHERE =
		"SELECT attractDetailFormInfo FROM AttractDetailFormInfo attractDetailFormInfo WHERE ";

	private static final String _SQL_COUNT_ATTRACTDETAILFORMINFO =
		"SELECT COUNT(attractDetailFormInfo) FROM AttractDetailFormInfo attractDetailFormInfo";

	private static final String _SQL_COUNT_ATTRACTDETAILFORMINFO_WHERE =
		"SELECT COUNT(attractDetailFormInfo) FROM AttractDetailFormInfo attractDetailFormInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"attractDetailFormInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AttractDetailFormInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AttractDetailFormInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AttractDetailFormInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}