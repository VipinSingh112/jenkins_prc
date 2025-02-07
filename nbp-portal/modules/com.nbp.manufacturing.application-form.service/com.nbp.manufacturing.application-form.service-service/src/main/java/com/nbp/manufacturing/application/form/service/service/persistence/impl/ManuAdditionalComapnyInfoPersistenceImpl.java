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

package com.nbp.manufacturing.application.form.service.service.persistence.impl;

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

import com.nbp.manufacturing.application.form.service.exception.NoSuchManuAdditionalComapnyInfoException;
import com.nbp.manufacturing.application.form.service.model.ManuAdditionalComapnyInfo;
import com.nbp.manufacturing.application.form.service.model.ManuAdditionalComapnyInfoTable;
import com.nbp.manufacturing.application.form.service.model.impl.ManuAdditionalComapnyInfoImpl;
import com.nbp.manufacturing.application.form.service.model.impl.ManuAdditionalComapnyInfoModelImpl;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuAdditionalComapnyInfoPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ManuAdditionalComapnyInfoUtil;
import com.nbp.manufacturing.application.form.service.service.persistence.impl.constants.MANUFACTURINGPersistenceConstants;

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
 * The persistence implementation for the manu additional comapny info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {
		ManuAdditionalComapnyInfoPersistence.class, BasePersistence.class
	}
)
public class ManuAdditionalComapnyInfoPersistenceImpl
	extends BasePersistenceImpl<ManuAdditionalComapnyInfo>
	implements ManuAdditionalComapnyInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ManuAdditionalComapnyInfoUtil</code> to access the manu additional comapny info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ManuAdditionalComapnyInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetManufactureById;
	private FinderPath _finderPathCountBygetManufactureById;

	/**
	 * Returns the manu additional comapny info where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuAdditionalComapnyInfoException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu additional comapny info
	 * @throws NoSuchManuAdditionalComapnyInfoException if a matching manu additional comapny info could not be found
	 */
	@Override
	public ManuAdditionalComapnyInfo findBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuAdditionalComapnyInfoException {

		ManuAdditionalComapnyInfo manuAdditionalComapnyInfo =
			fetchBygetManufactureById(manufacturingApplicationId);

		if (manuAdditionalComapnyInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("manufacturingApplicationId=");
			sb.append(manufacturingApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchManuAdditionalComapnyInfoException(sb.toString());
		}

		return manuAdditionalComapnyInfo;
	}

	/**
	 * Returns the manu additional comapny info where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu additional comapny info, or <code>null</code> if a matching manu additional comapny info could not be found
	 */
	@Override
	public ManuAdditionalComapnyInfo fetchBygetManufactureById(
		long manufacturingApplicationId) {

		return fetchBygetManufactureById(manufacturingApplicationId, true);
	}

	/**
	 * Returns the manu additional comapny info where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu additional comapny info, or <code>null</code> if a matching manu additional comapny info could not be found
	 */
	@Override
	public ManuAdditionalComapnyInfo fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {manufacturingApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetManufactureById, finderArgs,this);
		}

		if (result instanceof ManuAdditionalComapnyInfo) {
			ManuAdditionalComapnyInfo manuAdditionalComapnyInfo =
				(ManuAdditionalComapnyInfo)result;

			if (manufacturingApplicationId !=
					manuAdditionalComapnyInfo.getManufacturingApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MANUADDITIONALCOMAPNYINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				List<ManuAdditionalComapnyInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetManufactureById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									manufacturingApplicationId
								};
							}

							_log.warn(
								"ManuAdditionalComapnyInfoPersistenceImpl.fetchBygetManufactureById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ManuAdditionalComapnyInfo manuAdditionalComapnyInfo =
						list.get(0);

					result = manuAdditionalComapnyInfo;

					cacheResult(manuAdditionalComapnyInfo);
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
			return (ManuAdditionalComapnyInfo)result;
		}
	}

	/**
	 * Removes the manu additional comapny info where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu additional comapny info that was removed
	 */
	@Override
	public ManuAdditionalComapnyInfo removeBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuAdditionalComapnyInfoException {

		ManuAdditionalComapnyInfo manuAdditionalComapnyInfo =
			findBygetManufactureById(manufacturingApplicationId);

		return remove(manuAdditionalComapnyInfo);
	}

	/**
	 * Returns the number of manu additional comapny infos where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu additional comapny infos
	 */
	@Override
	public int countBygetManufactureById(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetManufactureById;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUADDITIONALCOMAPNYINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

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
		_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2 =
			"manuAdditionalComapnyInfo.manufacturingApplicationId = ?";

	public ManuAdditionalComapnyInfoPersistenceImpl() {
		setModelClass(ManuAdditionalComapnyInfo.class);

		setModelImplClass(ManuAdditionalComapnyInfoImpl.class);
		setModelPKClass(long.class);

		setTable(ManuAdditionalComapnyInfoTable.INSTANCE);
	}

	/**
	 * Caches the manu additional comapny info in the entity cache if it is enabled.
	 *
	 * @param manuAdditionalComapnyInfo the manu additional comapny info
	 */
	@Override
	public void cacheResult(
		ManuAdditionalComapnyInfo manuAdditionalComapnyInfo) {

		entityCache.putResult(
			ManuAdditionalComapnyInfoImpl.class,
			manuAdditionalComapnyInfo.getPrimaryKey(),
			manuAdditionalComapnyInfo);

		finderCache.putResult(
			_finderPathFetchBygetManufactureById,
			new Object[] {
				manuAdditionalComapnyInfo.getManufacturingApplicationId()
			},
			manuAdditionalComapnyInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the manu additional comapny infos in the entity cache if it is enabled.
	 *
	 * @param manuAdditionalComapnyInfos the manu additional comapny infos
	 */
	@Override
	public void cacheResult(
		List<ManuAdditionalComapnyInfo> manuAdditionalComapnyInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (manuAdditionalComapnyInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ManuAdditionalComapnyInfo manuAdditionalComapnyInfo :
				manuAdditionalComapnyInfos) {

			if (entityCache.getResult(
					ManuAdditionalComapnyInfoImpl.class,
					manuAdditionalComapnyInfo.getPrimaryKey()) == null) {

				cacheResult(manuAdditionalComapnyInfo);
			}
		}
	}

	/**
	 * Clears the cache for all manu additional comapny infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ManuAdditionalComapnyInfoImpl.class);

		finderCache.clearCache(ManuAdditionalComapnyInfoImpl.class);
	}

	/**
	 * Clears the cache for the manu additional comapny info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		ManuAdditionalComapnyInfo manuAdditionalComapnyInfo) {

		entityCache.removeResult(
			ManuAdditionalComapnyInfoImpl.class, manuAdditionalComapnyInfo);
	}

	@Override
	public void clearCache(
		List<ManuAdditionalComapnyInfo> manuAdditionalComapnyInfos) {

		for (ManuAdditionalComapnyInfo manuAdditionalComapnyInfo :
				manuAdditionalComapnyInfos) {

			entityCache.removeResult(
				ManuAdditionalComapnyInfoImpl.class, manuAdditionalComapnyInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ManuAdditionalComapnyInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ManuAdditionalComapnyInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ManuAdditionalComapnyInfoModelImpl manuAdditionalComapnyInfoModelImpl) {

		Object[] args = new Object[] {
			manuAdditionalComapnyInfoModelImpl.getManufacturingApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetManufactureById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetManufactureById, args,
			manuAdditionalComapnyInfoModelImpl);
	}

	/**
	 * Creates a new manu additional comapny info with the primary key. Does not add the manu additional comapny info to the database.
	 *
	 * @param manuAdditionalComapnyInfoId the primary key for the new manu additional comapny info
	 * @return the new manu additional comapny info
	 */
	@Override
	public ManuAdditionalComapnyInfo create(long manuAdditionalComapnyInfoId) {
		ManuAdditionalComapnyInfo manuAdditionalComapnyInfo =
			new ManuAdditionalComapnyInfoImpl();

		manuAdditionalComapnyInfo.setNew(true);
		manuAdditionalComapnyInfo.setPrimaryKey(manuAdditionalComapnyInfoId);

		manuAdditionalComapnyInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return manuAdditionalComapnyInfo;
	}

	/**
	 * Removes the manu additional comapny info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuAdditionalComapnyInfoId the primary key of the manu additional comapny info
	 * @return the manu additional comapny info that was removed
	 * @throws NoSuchManuAdditionalComapnyInfoException if a manu additional comapny info with the primary key could not be found
	 */
	@Override
	public ManuAdditionalComapnyInfo remove(long manuAdditionalComapnyInfoId)
		throws NoSuchManuAdditionalComapnyInfoException {

		return remove((Serializable)manuAdditionalComapnyInfoId);
	}

	/**
	 * Removes the manu additional comapny info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the manu additional comapny info
	 * @return the manu additional comapny info that was removed
	 * @throws NoSuchManuAdditionalComapnyInfoException if a manu additional comapny info with the primary key could not be found
	 */
	@Override
	public ManuAdditionalComapnyInfo remove(Serializable primaryKey)
		throws NoSuchManuAdditionalComapnyInfoException {

		Session session = null;

		try {
			session = openSession();

			ManuAdditionalComapnyInfo manuAdditionalComapnyInfo =
				(ManuAdditionalComapnyInfo)session.get(
					ManuAdditionalComapnyInfoImpl.class, primaryKey);

			if (manuAdditionalComapnyInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchManuAdditionalComapnyInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(manuAdditionalComapnyInfo);
		}
		catch (NoSuchManuAdditionalComapnyInfoException noSuchEntityException) {
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
	protected ManuAdditionalComapnyInfo removeImpl(
		ManuAdditionalComapnyInfo manuAdditionalComapnyInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(manuAdditionalComapnyInfo)) {
				manuAdditionalComapnyInfo =
					(ManuAdditionalComapnyInfo)session.get(
						ManuAdditionalComapnyInfoImpl.class,
						manuAdditionalComapnyInfo.getPrimaryKeyObj());
			}

			if (manuAdditionalComapnyInfo != null) {
				session.delete(manuAdditionalComapnyInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (manuAdditionalComapnyInfo != null) {
			clearCache(manuAdditionalComapnyInfo);
		}

		return manuAdditionalComapnyInfo;
	}

	@Override
	public ManuAdditionalComapnyInfo updateImpl(
		ManuAdditionalComapnyInfo manuAdditionalComapnyInfo) {

		boolean isNew = manuAdditionalComapnyInfo.isNew();

		if (!(manuAdditionalComapnyInfo instanceof
				ManuAdditionalComapnyInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(manuAdditionalComapnyInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					manuAdditionalComapnyInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in manuAdditionalComapnyInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ManuAdditionalComapnyInfo implementation " +
					manuAdditionalComapnyInfo.getClass());
		}

		ManuAdditionalComapnyInfoModelImpl manuAdditionalComapnyInfoModelImpl =
			(ManuAdditionalComapnyInfoModelImpl)manuAdditionalComapnyInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (manuAdditionalComapnyInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				manuAdditionalComapnyInfo.setCreateDate(date);
			}
			else {
				manuAdditionalComapnyInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!manuAdditionalComapnyInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				manuAdditionalComapnyInfo.setModifiedDate(date);
			}
			else {
				manuAdditionalComapnyInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(manuAdditionalComapnyInfo);
			}
			else {
				manuAdditionalComapnyInfo =
					(ManuAdditionalComapnyInfo)session.merge(
						manuAdditionalComapnyInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ManuAdditionalComapnyInfoImpl.class,
			manuAdditionalComapnyInfoModelImpl, false, true);

		cacheUniqueFindersCache(manuAdditionalComapnyInfoModelImpl);

		if (isNew) {
			manuAdditionalComapnyInfo.setNew(false);
		}

		manuAdditionalComapnyInfo.resetOriginalValues();

		return manuAdditionalComapnyInfo;
	}

	/**
	 * Returns the manu additional comapny info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the manu additional comapny info
	 * @return the manu additional comapny info
	 * @throws NoSuchManuAdditionalComapnyInfoException if a manu additional comapny info with the primary key could not be found
	 */
	@Override
	public ManuAdditionalComapnyInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchManuAdditionalComapnyInfoException {

		ManuAdditionalComapnyInfo manuAdditionalComapnyInfo = fetchByPrimaryKey(
			primaryKey);

		if (manuAdditionalComapnyInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchManuAdditionalComapnyInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return manuAdditionalComapnyInfo;
	}

	/**
	 * Returns the manu additional comapny info with the primary key or throws a <code>NoSuchManuAdditionalComapnyInfoException</code> if it could not be found.
	 *
	 * @param manuAdditionalComapnyInfoId the primary key of the manu additional comapny info
	 * @return the manu additional comapny info
	 * @throws NoSuchManuAdditionalComapnyInfoException if a manu additional comapny info with the primary key could not be found
	 */
	@Override
	public ManuAdditionalComapnyInfo findByPrimaryKey(
			long manuAdditionalComapnyInfoId)
		throws NoSuchManuAdditionalComapnyInfoException {

		return findByPrimaryKey((Serializable)manuAdditionalComapnyInfoId);
	}

	/**
	 * Returns the manu additional comapny info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuAdditionalComapnyInfoId the primary key of the manu additional comapny info
	 * @return the manu additional comapny info, or <code>null</code> if a manu additional comapny info with the primary key could not be found
	 */
	@Override
	public ManuAdditionalComapnyInfo fetchByPrimaryKey(
		long manuAdditionalComapnyInfoId) {

		return fetchByPrimaryKey((Serializable)manuAdditionalComapnyInfoId);
	}

	/**
	 * Returns all the manu additional comapny infos.
	 *
	 * @return the manu additional comapny infos
	 */
	@Override
	public List<ManuAdditionalComapnyInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manu additional comapny infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalComapnyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu additional comapny infos
	 * @param end the upper bound of the range of manu additional comapny infos (not inclusive)
	 * @return the range of manu additional comapny infos
	 */
	@Override
	public List<ManuAdditionalComapnyInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the manu additional comapny infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalComapnyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu additional comapny infos
	 * @param end the upper bound of the range of manu additional comapny infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu additional comapny infos
	 */
	@Override
	public List<ManuAdditionalComapnyInfo> findAll(
		int start, int end,
		OrderByComparator<ManuAdditionalComapnyInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manu additional comapny infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalComapnyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu additional comapny infos
	 * @param end the upper bound of the range of manu additional comapny infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu additional comapny infos
	 */
	@Override
	public List<ManuAdditionalComapnyInfo> findAll(
		int start, int end,
		OrderByComparator<ManuAdditionalComapnyInfo> orderByComparator,
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

		List<ManuAdditionalComapnyInfo> list = null;

		if (useFinderCache) {
			list = (List<ManuAdditionalComapnyInfo>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MANUADDITIONALCOMAPNYINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MANUADDITIONALCOMAPNYINFO;

				sql = sql.concat(
					ManuAdditionalComapnyInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ManuAdditionalComapnyInfo>)QueryUtil.list(
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
	 * Removes all the manu additional comapny infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ManuAdditionalComapnyInfo manuAdditionalComapnyInfo : findAll()) {
			remove(manuAdditionalComapnyInfo);
		}
	}

	/**
	 * Returns the number of manu additional comapny infos.
	 *
	 * @return the number of manu additional comapny infos
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
					_SQL_COUNT_MANUADDITIONALCOMAPNYINFO);

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
		return "manuAdditionalComapnyInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MANUADDITIONALCOMAPNYINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ManuAdditionalComapnyInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the manu additional comapny info persistence.
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

		_finderPathFetchBygetManufactureById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetManufactureById",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetManufactureById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetManufactureById", new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		_setManuAdditionalComapnyInfoUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setManuAdditionalComapnyInfoUtilPersistence(null);

		entityCache.removeCache(ManuAdditionalComapnyInfoImpl.class.getName());
	}

	private void _setManuAdditionalComapnyInfoUtilPersistence(
		ManuAdditionalComapnyInfoPersistence
			manuAdditionalComapnyInfoPersistence) {

		try {
			Field field = ManuAdditionalComapnyInfoUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, manuAdditionalComapnyInfoPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MANUADDITIONALCOMAPNYINFO =
		"SELECT manuAdditionalComapnyInfo FROM ManuAdditionalComapnyInfo manuAdditionalComapnyInfo";

	private static final String _SQL_SELECT_MANUADDITIONALCOMAPNYINFO_WHERE =
		"SELECT manuAdditionalComapnyInfo FROM ManuAdditionalComapnyInfo manuAdditionalComapnyInfo WHERE ";

	private static final String _SQL_COUNT_MANUADDITIONALCOMAPNYINFO =
		"SELECT COUNT(manuAdditionalComapnyInfo) FROM ManuAdditionalComapnyInfo manuAdditionalComapnyInfo";

	private static final String _SQL_COUNT_MANUADDITIONALCOMAPNYINFO_WHERE =
		"SELECT COUNT(manuAdditionalComapnyInfo) FROM ManuAdditionalComapnyInfo manuAdditionalComapnyInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"manuAdditionalComapnyInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ManuAdditionalComapnyInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ManuAdditionalComapnyInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ManuAdditionalComapnyInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private ManuAdditionalComapnyInfoModelArgumentsResolver
		_manuAdditionalComapnyInfoModelArgumentsResolver;

}