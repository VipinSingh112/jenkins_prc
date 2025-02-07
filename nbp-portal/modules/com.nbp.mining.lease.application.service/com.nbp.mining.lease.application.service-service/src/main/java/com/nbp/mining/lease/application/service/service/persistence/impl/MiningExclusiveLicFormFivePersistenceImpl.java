/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence.impl;

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

import com.nbp.mining.lease.application.service.exception.NoSuchMiningExclusiveLicFormFiveException;
import com.nbp.mining.lease.application.service.model.MiningExclusiveLicFormFive;
import com.nbp.mining.lease.application.service.model.MiningExclusiveLicFormFiveTable;
import com.nbp.mining.lease.application.service.model.impl.MiningExclusiveLicFormFiveImpl;
import com.nbp.mining.lease.application.service.model.impl.MiningExclusiveLicFormFiveModelImpl;
import com.nbp.mining.lease.application.service.service.persistence.MiningExclusiveLicFormFivePersistence;
import com.nbp.mining.lease.application.service.service.persistence.MiningExclusiveLicFormFiveUtil;
import com.nbp.mining.lease.application.service.service.persistence.impl.constants.MINING_LEASE_APPLICATIONPersistenceConstants;

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
 * The persistence implementation for the mining exclusive lic form five service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiningExclusiveLicFormFivePersistence.class)
public class MiningExclusiveLicFormFivePersistenceImpl
	extends BasePersistenceImpl<MiningExclusiveLicFormFive>
	implements MiningExclusiveLicFormFivePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiningExclusiveLicFormFiveUtil</code> to access the mining exclusive lic form five persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiningExclusiveLicFormFiveImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetMiningById;
	private FinderPath _finderPathCountBygetMiningById;

	/**
	 * Returns the mining exclusive lic form five where miningLeaseApplicationId = &#63; or throws a <code>NoSuchMiningExclusiveLicFormFiveException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining exclusive lic form five
	 * @throws NoSuchMiningExclusiveLicFormFiveException if a matching mining exclusive lic form five could not be found
	 */
	@Override
	public MiningExclusiveLicFormFive findBygetMiningById(
			long miningLeaseApplicationId)
		throws NoSuchMiningExclusiveLicFormFiveException {

		MiningExclusiveLicFormFive miningExclusiveLicFormFive =
			fetchBygetMiningById(miningLeaseApplicationId);

		if (miningExclusiveLicFormFive == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("miningLeaseApplicationId=");
			sb.append(miningLeaseApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiningExclusiveLicFormFiveException(sb.toString());
		}

		return miningExclusiveLicFormFive;
	}

	/**
	 * Returns the mining exclusive lic form five where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining exclusive lic form five, or <code>null</code> if a matching mining exclusive lic form five could not be found
	 */
	@Override
	public MiningExclusiveLicFormFive fetchBygetMiningById(
		long miningLeaseApplicationId) {

		return fetchBygetMiningById(miningLeaseApplicationId, true);
	}

	/**
	 * Returns the mining exclusive lic form five where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining exclusive lic form five, or <code>null</code> if a matching mining exclusive lic form five could not be found
	 */
	@Override
	public MiningExclusiveLicFormFive fetchBygetMiningById(
		long miningLeaseApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {miningLeaseApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMiningById, finderArgs, this);
		}

		if (result instanceof MiningExclusiveLicFormFive) {
			MiningExclusiveLicFormFive miningExclusiveLicFormFive =
				(MiningExclusiveLicFormFive)result;

			if (miningLeaseApplicationId !=
					miningExclusiveLicFormFive.getMiningLeaseApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MININGEXCLUSIVELICFORMFIVE_WHERE);

			sb.append(_FINDER_COLUMN_GETMININGBYID_MININGLEASEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miningLeaseApplicationId);

				List<MiningExclusiveLicFormFive> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMiningById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									miningLeaseApplicationId
								};
							}

							_log.warn(
								"MiningExclusiveLicFormFivePersistenceImpl.fetchBygetMiningById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiningExclusiveLicFormFive miningExclusiveLicFormFive =
						list.get(0);

					result = miningExclusiveLicFormFive;

					cacheResult(miningExclusiveLicFormFive);
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
			return (MiningExclusiveLicFormFive)result;
		}
	}

	/**
	 * Removes the mining exclusive lic form five where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the mining exclusive lic form five that was removed
	 */
	@Override
	public MiningExclusiveLicFormFive removeBygetMiningById(
			long miningLeaseApplicationId)
		throws NoSuchMiningExclusiveLicFormFiveException {

		MiningExclusiveLicFormFive miningExclusiveLicFormFive =
			findBygetMiningById(miningLeaseApplicationId);

		return remove(miningExclusiveLicFormFive);
	}

	/**
	 * Returns the number of mining exclusive lic form fives where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining exclusive lic form fives
	 */
	@Override
	public int countBygetMiningById(long miningLeaseApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMiningById;

		Object[] finderArgs = new Object[] {miningLeaseApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGEXCLUSIVELICFORMFIVE_WHERE);

			sb.append(_FINDER_COLUMN_GETMININGBYID_MININGLEASEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miningLeaseApplicationId);

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
		_FINDER_COLUMN_GETMININGBYID_MININGLEASEAPPLICATIONID_2 =
			"miningExclusiveLicFormFive.miningLeaseApplicationId = ?";

	public MiningExclusiveLicFormFivePersistenceImpl() {
		setModelClass(MiningExclusiveLicFormFive.class);

		setModelImplClass(MiningExclusiveLicFormFiveImpl.class);
		setModelPKClass(long.class);

		setTable(MiningExclusiveLicFormFiveTable.INSTANCE);
	}

	/**
	 * Caches the mining exclusive lic form five in the entity cache if it is enabled.
	 *
	 * @param miningExclusiveLicFormFive the mining exclusive lic form five
	 */
	@Override
	public void cacheResult(
		MiningExclusiveLicFormFive miningExclusiveLicFormFive) {

		entityCache.putResult(
			MiningExclusiveLicFormFiveImpl.class,
			miningExclusiveLicFormFive.getPrimaryKey(),
			miningExclusiveLicFormFive);

		finderCache.putResult(
			_finderPathFetchBygetMiningById,
			new Object[] {
				miningExclusiveLicFormFive.getMiningLeaseApplicationId()
			},
			miningExclusiveLicFormFive);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the mining exclusive lic form fives in the entity cache if it is enabled.
	 *
	 * @param miningExclusiveLicFormFives the mining exclusive lic form fives
	 */
	@Override
	public void cacheResult(
		List<MiningExclusiveLicFormFive> miningExclusiveLicFormFives) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miningExclusiveLicFormFives.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiningExclusiveLicFormFive miningExclusiveLicFormFive :
				miningExclusiveLicFormFives) {

			if (entityCache.getResult(
					MiningExclusiveLicFormFiveImpl.class,
					miningExclusiveLicFormFive.getPrimaryKey()) == null) {

				cacheResult(miningExclusiveLicFormFive);
			}
		}
	}

	/**
	 * Clears the cache for all mining exclusive lic form fives.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiningExclusiveLicFormFiveImpl.class);

		finderCache.clearCache(MiningExclusiveLicFormFiveImpl.class);
	}

	/**
	 * Clears the cache for the mining exclusive lic form five.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		MiningExclusiveLicFormFive miningExclusiveLicFormFive) {

		entityCache.removeResult(
			MiningExclusiveLicFormFiveImpl.class, miningExclusiveLicFormFive);
	}

	@Override
	public void clearCache(
		List<MiningExclusiveLicFormFive> miningExclusiveLicFormFives) {

		for (MiningExclusiveLicFormFive miningExclusiveLicFormFive :
				miningExclusiveLicFormFives) {

			entityCache.removeResult(
				MiningExclusiveLicFormFiveImpl.class,
				miningExclusiveLicFormFive);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiningExclusiveLicFormFiveImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MiningExclusiveLicFormFiveImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MiningExclusiveLicFormFiveModelImpl
			miningExclusiveLicFormFiveModelImpl) {

		Object[] args = new Object[] {
			miningExclusiveLicFormFiveModelImpl.getMiningLeaseApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetMiningById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMiningById, args,
			miningExclusiveLicFormFiveModelImpl);
	}

	/**
	 * Creates a new mining exclusive lic form five with the primary key. Does not add the mining exclusive lic form five to the database.
	 *
	 * @param miningExclusiveLicFormFiveId the primary key for the new mining exclusive lic form five
	 * @return the new mining exclusive lic form five
	 */
	@Override
	public MiningExclusiveLicFormFive create(
		long miningExclusiveLicFormFiveId) {

		MiningExclusiveLicFormFive miningExclusiveLicFormFive =
			new MiningExclusiveLicFormFiveImpl();

		miningExclusiveLicFormFive.setNew(true);
		miningExclusiveLicFormFive.setPrimaryKey(miningExclusiveLicFormFiveId);

		miningExclusiveLicFormFive.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return miningExclusiveLicFormFive;
	}

	/**
	 * Removes the mining exclusive lic form five with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningExclusiveLicFormFiveId the primary key of the mining exclusive lic form five
	 * @return the mining exclusive lic form five that was removed
	 * @throws NoSuchMiningExclusiveLicFormFiveException if a mining exclusive lic form five with the primary key could not be found
	 */
	@Override
	public MiningExclusiveLicFormFive remove(long miningExclusiveLicFormFiveId)
		throws NoSuchMiningExclusiveLicFormFiveException {

		return remove((Serializable)miningExclusiveLicFormFiveId);
	}

	/**
	 * Removes the mining exclusive lic form five with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mining exclusive lic form five
	 * @return the mining exclusive lic form five that was removed
	 * @throws NoSuchMiningExclusiveLicFormFiveException if a mining exclusive lic form five with the primary key could not be found
	 */
	@Override
	public MiningExclusiveLicFormFive remove(Serializable primaryKey)
		throws NoSuchMiningExclusiveLicFormFiveException {

		Session session = null;

		try {
			session = openSession();

			MiningExclusiveLicFormFive miningExclusiveLicFormFive =
				(MiningExclusiveLicFormFive)session.get(
					MiningExclusiveLicFormFiveImpl.class, primaryKey);

			if (miningExclusiveLicFormFive == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiningExclusiveLicFormFiveException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miningExclusiveLicFormFive);
		}
		catch (NoSuchMiningExclusiveLicFormFiveException
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
	protected MiningExclusiveLicFormFive removeImpl(
		MiningExclusiveLicFormFive miningExclusiveLicFormFive) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miningExclusiveLicFormFive)) {
				miningExclusiveLicFormFive =
					(MiningExclusiveLicFormFive)session.get(
						MiningExclusiveLicFormFiveImpl.class,
						miningExclusiveLicFormFive.getPrimaryKeyObj());
			}

			if (miningExclusiveLicFormFive != null) {
				session.delete(miningExclusiveLicFormFive);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miningExclusiveLicFormFive != null) {
			clearCache(miningExclusiveLicFormFive);
		}

		return miningExclusiveLicFormFive;
	}

	@Override
	public MiningExclusiveLicFormFive updateImpl(
		MiningExclusiveLicFormFive miningExclusiveLicFormFive) {

		boolean isNew = miningExclusiveLicFormFive.isNew();

		if (!(miningExclusiveLicFormFive instanceof
				MiningExclusiveLicFormFiveModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(miningExclusiveLicFormFive.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					miningExclusiveLicFormFive);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miningExclusiveLicFormFive proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiningExclusiveLicFormFive implementation " +
					miningExclusiveLicFormFive.getClass());
		}

		MiningExclusiveLicFormFiveModelImpl
			miningExclusiveLicFormFiveModelImpl =
				(MiningExclusiveLicFormFiveModelImpl)miningExclusiveLicFormFive;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (miningExclusiveLicFormFive.getCreateDate() == null)) {
			if (serviceContext == null) {
				miningExclusiveLicFormFive.setCreateDate(date);
			}
			else {
				miningExclusiveLicFormFive.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!miningExclusiveLicFormFiveModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				miningExclusiveLicFormFive.setModifiedDate(date);
			}
			else {
				miningExclusiveLicFormFive.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miningExclusiveLicFormFive);
			}
			else {
				miningExclusiveLicFormFive =
					(MiningExclusiveLicFormFive)session.merge(
						miningExclusiveLicFormFive);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MiningExclusiveLicFormFiveImpl.class,
			miningExclusiveLicFormFiveModelImpl, false, true);

		cacheUniqueFindersCache(miningExclusiveLicFormFiveModelImpl);

		if (isNew) {
			miningExclusiveLicFormFive.setNew(false);
		}

		miningExclusiveLicFormFive.resetOriginalValues();

		return miningExclusiveLicFormFive;
	}

	/**
	 * Returns the mining exclusive lic form five with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mining exclusive lic form five
	 * @return the mining exclusive lic form five
	 * @throws NoSuchMiningExclusiveLicFormFiveException if a mining exclusive lic form five with the primary key could not be found
	 */
	@Override
	public MiningExclusiveLicFormFive findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMiningExclusiveLicFormFiveException {

		MiningExclusiveLicFormFive miningExclusiveLicFormFive =
			fetchByPrimaryKey(primaryKey);

		if (miningExclusiveLicFormFive == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiningExclusiveLicFormFiveException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miningExclusiveLicFormFive;
	}

	/**
	 * Returns the mining exclusive lic form five with the primary key or throws a <code>NoSuchMiningExclusiveLicFormFiveException</code> if it could not be found.
	 *
	 * @param miningExclusiveLicFormFiveId the primary key of the mining exclusive lic form five
	 * @return the mining exclusive lic form five
	 * @throws NoSuchMiningExclusiveLicFormFiveException if a mining exclusive lic form five with the primary key could not be found
	 */
	@Override
	public MiningExclusiveLicFormFive findByPrimaryKey(
			long miningExclusiveLicFormFiveId)
		throws NoSuchMiningExclusiveLicFormFiveException {

		return findByPrimaryKey((Serializable)miningExclusiveLicFormFiveId);
	}

	/**
	 * Returns the mining exclusive lic form five with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningExclusiveLicFormFiveId the primary key of the mining exclusive lic form five
	 * @return the mining exclusive lic form five, or <code>null</code> if a mining exclusive lic form five with the primary key could not be found
	 */
	@Override
	public MiningExclusiveLicFormFive fetchByPrimaryKey(
		long miningExclusiveLicFormFiveId) {

		return fetchByPrimaryKey((Serializable)miningExclusiveLicFormFiveId);
	}

	/**
	 * Returns all the mining exclusive lic form fives.
	 *
	 * @return the mining exclusive lic form fives
	 */
	@Override
	public List<MiningExclusiveLicFormFive> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining exclusive lic form fives.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningExclusiveLicFormFiveModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining exclusive lic form fives
	 * @param end the upper bound of the range of mining exclusive lic form fives (not inclusive)
	 * @return the range of mining exclusive lic form fives
	 */
	@Override
	public List<MiningExclusiveLicFormFive> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining exclusive lic form fives.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningExclusiveLicFormFiveModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining exclusive lic form fives
	 * @param end the upper bound of the range of mining exclusive lic form fives (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining exclusive lic form fives
	 */
	@Override
	public List<MiningExclusiveLicFormFive> findAll(
		int start, int end,
		OrderByComparator<MiningExclusiveLicFormFive> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining exclusive lic form fives.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningExclusiveLicFormFiveModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining exclusive lic form fives
	 * @param end the upper bound of the range of mining exclusive lic form fives (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining exclusive lic form fives
	 */
	@Override
	public List<MiningExclusiveLicFormFive> findAll(
		int start, int end,
		OrderByComparator<MiningExclusiveLicFormFive> orderByComparator,
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

		List<MiningExclusiveLicFormFive> list = null;

		if (useFinderCache) {
			list = (List<MiningExclusiveLicFormFive>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MININGEXCLUSIVELICFORMFIVE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MININGEXCLUSIVELICFORMFIVE;

				sql = sql.concat(
					MiningExclusiveLicFormFiveModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MiningExclusiveLicFormFive>)QueryUtil.list(
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
	 * Removes all the mining exclusive lic form fives from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiningExclusiveLicFormFive miningExclusiveLicFormFive :
				findAll()) {

			remove(miningExclusiveLicFormFive);
		}
	}

	/**
	 * Returns the number of mining exclusive lic form fives.
	 *
	 * @return the number of mining exclusive lic form fives
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
					_SQL_COUNT_MININGEXCLUSIVELICFORMFIVE);

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
		return "miningExclusiveLicFormFiveId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MININGEXCLUSIVELICFORMFIVE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiningExclusiveLicFormFiveModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the mining exclusive lic form five persistence.
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

		_finderPathFetchBygetMiningById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMiningById",
			new String[] {Long.class.getName()},
			new String[] {"miningLeaseApplicationId"}, true);

		_finderPathCountBygetMiningById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMiningById",
			new String[] {Long.class.getName()},
			new String[] {"miningLeaseApplicationId"}, false);

		MiningExclusiveLicFormFiveUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiningExclusiveLicFormFiveUtil.setPersistence(null);

		entityCache.removeCache(MiningExclusiveLicFormFiveImpl.class.getName());
	}

	@Override
	@Reference(
		target = MINING_LEASE_APPLICATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MINING_LEASE_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MINING_LEASE_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MININGEXCLUSIVELICFORMFIVE =
		"SELECT miningExclusiveLicFormFive FROM MiningExclusiveLicFormFive miningExclusiveLicFormFive";

	private static final String _SQL_SELECT_MININGEXCLUSIVELICFORMFIVE_WHERE =
		"SELECT miningExclusiveLicFormFive FROM MiningExclusiveLicFormFive miningExclusiveLicFormFive WHERE ";

	private static final String _SQL_COUNT_MININGEXCLUSIVELICFORMFIVE =
		"SELECT COUNT(miningExclusiveLicFormFive) FROM MiningExclusiveLicFormFive miningExclusiveLicFormFive";

	private static final String _SQL_COUNT_MININGEXCLUSIVELICFORMFIVE_WHERE =
		"SELECT COUNT(miningExclusiveLicFormFive) FROM MiningExclusiveLicFormFive miningExclusiveLicFormFive WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"miningExclusiveLicFormFive.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiningExclusiveLicFormFive exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MiningExclusiveLicFormFive exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MiningExclusiveLicFormFivePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}