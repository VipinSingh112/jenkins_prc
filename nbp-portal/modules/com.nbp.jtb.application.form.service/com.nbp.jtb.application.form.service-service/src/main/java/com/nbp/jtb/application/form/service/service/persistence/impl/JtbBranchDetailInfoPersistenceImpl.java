/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
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
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.jtb.application.form.service.exception.NoSuchJtbBranchDetailInfoException;
import com.nbp.jtb.application.form.service.model.JtbBranchDetailInfo;
import com.nbp.jtb.application.form.service.model.JtbBranchDetailInfoTable;
import com.nbp.jtb.application.form.service.model.impl.JtbBranchDetailInfoImpl;
import com.nbp.jtb.application.form.service.model.impl.JtbBranchDetailInfoModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.JtbBranchDetailInfoPersistence;
import com.nbp.jtb.application.form.service.service.persistence.JtbBranchDetailInfoUtil;
import com.nbp.jtb.application.form.service.service.persistence.impl.constants.JTB_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
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
 * The persistence implementation for the jtb branch detail info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {JtbBranchDetailInfoPersistence.class, BasePersistence.class}
)
public class JtbBranchDetailInfoPersistenceImpl
	extends BasePersistenceImpl<JtbBranchDetailInfo>
	implements JtbBranchDetailInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JtbBranchDetailInfoUtil</code> to access the jtb branch detail info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JtbBranchDetailInfoImpl.class.getName();

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
	 * Returns the jtb branch detail info where jtbApplicationId = &#63; or throws a <code>NoSuchJtbBranchDetailInfoException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb branch detail info
	 * @throws NoSuchJtbBranchDetailInfoException if a matching jtb branch detail info could not be found
	 */
	@Override
	public JtbBranchDetailInfo findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchJtbBranchDetailInfoException {

		JtbBranchDetailInfo jtbBranchDetailInfo = fetchBygetJTB_ByApplicationId(
			jtbApplicationId);

		if (jtbBranchDetailInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJtbBranchDetailInfoException(sb.toString());
		}

		return jtbBranchDetailInfo;
	}

	/**
	 * Returns the jtb branch detail info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb branch detail info, or <code>null</code> if a matching jtb branch detail info could not be found
	 */
	@Override
	public JtbBranchDetailInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the jtb branch detail info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb branch detail info, or <code>null</code> if a matching jtb branch detail info could not be found
	 */
	@Override
	public JtbBranchDetailInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {jtbApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJTB_ByApplicationId, finderArgs,this);
		}

		if (result instanceof JtbBranchDetailInfo) {
			JtbBranchDetailInfo jtbBranchDetailInfo =
				(JtbBranchDetailInfo)result;

			if (jtbApplicationId != jtbBranchDetailInfo.getJtbApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JTBBRANCHDETAILINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<JtbBranchDetailInfo> list = query.list();

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
								"JtbBranchDetailInfoPersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JtbBranchDetailInfo jtbBranchDetailInfo = list.get(0);

					result = jtbBranchDetailInfo;

					cacheResult(jtbBranchDetailInfo);
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
			return (JtbBranchDetailInfo)result;
		}
	}

	/**
	 * Removes the jtb branch detail info where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the jtb branch detail info that was removed
	 */
	@Override
	public JtbBranchDetailInfo removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchJtbBranchDetailInfoException {

		JtbBranchDetailInfo jtbBranchDetailInfo = findBygetJTB_ByApplicationId(
			jtbApplicationId);

		return remove(jtbBranchDetailInfo);
	}

	/**
	 * Returns the number of jtb branch detail infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb branch detail infos
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBBRANCHDETAILINFO_WHERE);

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
			"jtbBranchDetailInfo.jtbApplicationId = ?";

	public JtbBranchDetailInfoPersistenceImpl() {
		setModelClass(JtbBranchDetailInfo.class);

		setModelImplClass(JtbBranchDetailInfoImpl.class);
		setModelPKClass(long.class);

		setTable(JtbBranchDetailInfoTable.INSTANCE);
	}

	/**
	 * Caches the jtb branch detail info in the entity cache if it is enabled.
	 *
	 * @param jtbBranchDetailInfo the jtb branch detail info
	 */
	@Override
	public void cacheResult(JtbBranchDetailInfo jtbBranchDetailInfo) {
		entityCache.putResult(
			JtbBranchDetailInfoImpl.class, jtbBranchDetailInfo.getPrimaryKey(),
			jtbBranchDetailInfo);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {jtbBranchDetailInfo.getJtbApplicationId()},
			jtbBranchDetailInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jtb branch detail infos in the entity cache if it is enabled.
	 *
	 * @param jtbBranchDetailInfos the jtb branch detail infos
	 */
	@Override
	public void cacheResult(List<JtbBranchDetailInfo> jtbBranchDetailInfos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jtbBranchDetailInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JtbBranchDetailInfo jtbBranchDetailInfo : jtbBranchDetailInfos) {
			if (entityCache.getResult(
					JtbBranchDetailInfoImpl.class,
					jtbBranchDetailInfo.getPrimaryKey()) == null) {

				cacheResult(jtbBranchDetailInfo);
			}
		}
	}

	/**
	 * Clears the cache for all jtb branch detail infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JtbBranchDetailInfoImpl.class);

		finderCache.clearCache(JtbBranchDetailInfoImpl.class);
	}

	/**
	 * Clears the cache for the jtb branch detail info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JtbBranchDetailInfo jtbBranchDetailInfo) {
		entityCache.removeResult(
			JtbBranchDetailInfoImpl.class, jtbBranchDetailInfo);
	}

	@Override
	public void clearCache(List<JtbBranchDetailInfo> jtbBranchDetailInfos) {
		for (JtbBranchDetailInfo jtbBranchDetailInfo : jtbBranchDetailInfos) {
			entityCache.removeResult(
				JtbBranchDetailInfoImpl.class, jtbBranchDetailInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JtbBranchDetailInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(JtbBranchDetailInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JtbBranchDetailInfoModelImpl jtbBranchDetailInfoModelImpl) {

		Object[] args = new Object[] {
			jtbBranchDetailInfoModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			jtbBranchDetailInfoModelImpl);
	}

	/**
	 * Creates a new jtb branch detail info with the primary key. Does not add the jtb branch detail info to the database.
	 *
	 * @param jtbBranchDetailInfoId the primary key for the new jtb branch detail info
	 * @return the new jtb branch detail info
	 */
	@Override
	public JtbBranchDetailInfo create(long jtbBranchDetailInfoId) {
		JtbBranchDetailInfo jtbBranchDetailInfo = new JtbBranchDetailInfoImpl();

		jtbBranchDetailInfo.setNew(true);
		jtbBranchDetailInfo.setPrimaryKey(jtbBranchDetailInfoId);

		jtbBranchDetailInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jtbBranchDetailInfo;
	}

	/**
	 * Removes the jtb branch detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb branch detail info
	 * @return the jtb branch detail info that was removed
	 * @throws NoSuchJtbBranchDetailInfoException if a jtb branch detail info with the primary key could not be found
	 */
	@Override
	public JtbBranchDetailInfo remove(long jtbBranchDetailInfoId)
		throws NoSuchJtbBranchDetailInfoException {

		return remove((Serializable)jtbBranchDetailInfoId);
	}

	/**
	 * Removes the jtb branch detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jtb branch detail info
	 * @return the jtb branch detail info that was removed
	 * @throws NoSuchJtbBranchDetailInfoException if a jtb branch detail info with the primary key could not be found
	 */
	@Override
	public JtbBranchDetailInfo remove(Serializable primaryKey)
		throws NoSuchJtbBranchDetailInfoException {

		Session session = null;

		try {
			session = openSession();

			JtbBranchDetailInfo jtbBranchDetailInfo =
				(JtbBranchDetailInfo)session.get(
					JtbBranchDetailInfoImpl.class, primaryKey);

			if (jtbBranchDetailInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJtbBranchDetailInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jtbBranchDetailInfo);
		}
		catch (NoSuchJtbBranchDetailInfoException noSuchEntityException) {
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
	protected JtbBranchDetailInfo removeImpl(
		JtbBranchDetailInfo jtbBranchDetailInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jtbBranchDetailInfo)) {
				jtbBranchDetailInfo = (JtbBranchDetailInfo)session.get(
					JtbBranchDetailInfoImpl.class,
					jtbBranchDetailInfo.getPrimaryKeyObj());
			}

			if (jtbBranchDetailInfo != null) {
				session.delete(jtbBranchDetailInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jtbBranchDetailInfo != null) {
			clearCache(jtbBranchDetailInfo);
		}

		return jtbBranchDetailInfo;
	}

	@Override
	public JtbBranchDetailInfo updateImpl(
		JtbBranchDetailInfo jtbBranchDetailInfo) {

		boolean isNew = jtbBranchDetailInfo.isNew();

		if (!(jtbBranchDetailInfo instanceof JtbBranchDetailInfoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jtbBranchDetailInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jtbBranchDetailInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jtbBranchDetailInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JtbBranchDetailInfo implementation " +
					jtbBranchDetailInfo.getClass());
		}

		JtbBranchDetailInfoModelImpl jtbBranchDetailInfoModelImpl =
			(JtbBranchDetailInfoModelImpl)jtbBranchDetailInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jtbBranchDetailInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				jtbBranchDetailInfo.setCreateDate(date);
			}
			else {
				jtbBranchDetailInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jtbBranchDetailInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jtbBranchDetailInfo.setModifiedDate(date);
			}
			else {
				jtbBranchDetailInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jtbBranchDetailInfo);
			}
			else {
				jtbBranchDetailInfo = (JtbBranchDetailInfo)session.merge(
					jtbBranchDetailInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JtbBranchDetailInfoImpl.class, jtbBranchDetailInfoModelImpl, false,
			true);

		cacheUniqueFindersCache(jtbBranchDetailInfoModelImpl);

		if (isNew) {
			jtbBranchDetailInfo.setNew(false);
		}

		jtbBranchDetailInfo.resetOriginalValues();

		return jtbBranchDetailInfo;
	}

	/**
	 * Returns the jtb branch detail info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jtb branch detail info
	 * @return the jtb branch detail info
	 * @throws NoSuchJtbBranchDetailInfoException if a jtb branch detail info with the primary key could not be found
	 */
	@Override
	public JtbBranchDetailInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJtbBranchDetailInfoException {

		JtbBranchDetailInfo jtbBranchDetailInfo = fetchByPrimaryKey(primaryKey);

		if (jtbBranchDetailInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJtbBranchDetailInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jtbBranchDetailInfo;
	}

	/**
	 * Returns the jtb branch detail info with the primary key or throws a <code>NoSuchJtbBranchDetailInfoException</code> if it could not be found.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb branch detail info
	 * @return the jtb branch detail info
	 * @throws NoSuchJtbBranchDetailInfoException if a jtb branch detail info with the primary key could not be found
	 */
	@Override
	public JtbBranchDetailInfo findByPrimaryKey(long jtbBranchDetailInfoId)
		throws NoSuchJtbBranchDetailInfoException {

		return findByPrimaryKey((Serializable)jtbBranchDetailInfoId);
	}

	/**
	 * Returns the jtb branch detail info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb branch detail info
	 * @return the jtb branch detail info, or <code>null</code> if a jtb branch detail info with the primary key could not be found
	 */
	@Override
	public JtbBranchDetailInfo fetchByPrimaryKey(long jtbBranchDetailInfoId) {
		return fetchByPrimaryKey((Serializable)jtbBranchDetailInfoId);
	}

	/**
	 * Returns all the jtb branch detail infos.
	 *
	 * @return the jtb branch detail infos
	 */
	@Override
	public List<JtbBranchDetailInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb branch detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb branch detail infos
	 * @param end the upper bound of the range of jtb branch detail infos (not inclusive)
	 * @return the range of jtb branch detail infos
	 */
	@Override
	public List<JtbBranchDetailInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb branch detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb branch detail infos
	 * @param end the upper bound of the range of jtb branch detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb branch detail infos
	 */
	@Override
	public List<JtbBranchDetailInfo> findAll(
		int start, int end,
		OrderByComparator<JtbBranchDetailInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb branch detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb branch detail infos
	 * @param end the upper bound of the range of jtb branch detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb branch detail infos
	 */
	@Override
	public List<JtbBranchDetailInfo> findAll(
		int start, int end,
		OrderByComparator<JtbBranchDetailInfo> orderByComparator,
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

		List<JtbBranchDetailInfo> list = null;

		if (useFinderCache) {
			list = (List<JtbBranchDetailInfo>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JTBBRANCHDETAILINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JTBBRANCHDETAILINFO;

				sql = sql.concat(JtbBranchDetailInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JtbBranchDetailInfo>)QueryUtil.list(
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
	 * Removes all the jtb branch detail infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JtbBranchDetailInfo jtbBranchDetailInfo : findAll()) {
			remove(jtbBranchDetailInfo);
		}
	}

	/**
	 * Returns the number of jtb branch detail infos.
	 *
	 * @return the number of jtb branch detail infos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_JTBBRANCHDETAILINFO);

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
		return "jtbBranchDetailInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JTBBRANCHDETAILINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JtbBranchDetailInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jtb branch detail info persistence.
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

		_setJtbBranchDetailInfoUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setJtbBranchDetailInfoUtilPersistence(null);

		entityCache.removeCache(JtbBranchDetailInfoImpl.class.getName());
	}

	private void _setJtbBranchDetailInfoUtilPersistence(
		JtbBranchDetailInfoPersistence jtbBranchDetailInfoPersistence) {

		try {
			Field field = JtbBranchDetailInfoUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, jtbBranchDetailInfoPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
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

	private static final String _SQL_SELECT_JTBBRANCHDETAILINFO =
		"SELECT jtbBranchDetailInfo FROM JtbBranchDetailInfo jtbBranchDetailInfo";

	private static final String _SQL_SELECT_JTBBRANCHDETAILINFO_WHERE =
		"SELECT jtbBranchDetailInfo FROM JtbBranchDetailInfo jtbBranchDetailInfo WHERE ";

	private static final String _SQL_COUNT_JTBBRANCHDETAILINFO =
		"SELECT COUNT(jtbBranchDetailInfo) FROM JtbBranchDetailInfo jtbBranchDetailInfo";

	private static final String _SQL_COUNT_JTBBRANCHDETAILINFO_WHERE =
		"SELECT COUNT(jtbBranchDetailInfo) FROM JtbBranchDetailInfo jtbBranchDetailInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "jtbBranchDetailInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JtbBranchDetailInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JtbBranchDetailInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JtbBranchDetailInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private JtbBranchDetailInfoModelArgumentsResolver
		_jtbBranchDetailInfoModelArgumentsResolver;

}