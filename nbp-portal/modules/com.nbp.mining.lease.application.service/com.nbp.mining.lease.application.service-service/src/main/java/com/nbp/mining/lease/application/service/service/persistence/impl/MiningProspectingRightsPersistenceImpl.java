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

import com.nbp.mining.lease.application.service.exception.NoSuchMiningProspectingRightsException;
import com.nbp.mining.lease.application.service.model.MiningProspectingRights;
import com.nbp.mining.lease.application.service.model.MiningProspectingRightsTable;
import com.nbp.mining.lease.application.service.model.impl.MiningProspectingRightsImpl;
import com.nbp.mining.lease.application.service.model.impl.MiningProspectingRightsModelImpl;
import com.nbp.mining.lease.application.service.service.persistence.MiningProspectingRightsPersistence;
import com.nbp.mining.lease.application.service.service.persistence.MiningProspectingRightsUtil;
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
 * The persistence implementation for the mining prospecting rights service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiningProspectingRightsPersistence.class)
public class MiningProspectingRightsPersistenceImpl
	extends BasePersistenceImpl<MiningProspectingRights>
	implements MiningProspectingRightsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiningProspectingRightsUtil</code> to access the mining prospecting rights persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiningProspectingRightsImpl.class.getName();

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
	 * Returns the mining prospecting rights where miningLeaseApplicationId = &#63; or throws a <code>NoSuchMiningProspectingRightsException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining prospecting rights
	 * @throws NoSuchMiningProspectingRightsException if a matching mining prospecting rights could not be found
	 */
	@Override
	public MiningProspectingRights findBygetMiningById(
			long miningLeaseApplicationId)
		throws NoSuchMiningProspectingRightsException {

		MiningProspectingRights miningProspectingRights = fetchBygetMiningById(
			miningLeaseApplicationId);

		if (miningProspectingRights == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("miningLeaseApplicationId=");
			sb.append(miningLeaseApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiningProspectingRightsException(sb.toString());
		}

		return miningProspectingRights;
	}

	/**
	 * Returns the mining prospecting rights where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining prospecting rights, or <code>null</code> if a matching mining prospecting rights could not be found
	 */
	@Override
	public MiningProspectingRights fetchBygetMiningById(
		long miningLeaseApplicationId) {

		return fetchBygetMiningById(miningLeaseApplicationId, true);
	}

	/**
	 * Returns the mining prospecting rights where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining prospecting rights, or <code>null</code> if a matching mining prospecting rights could not be found
	 */
	@Override
	public MiningProspectingRights fetchBygetMiningById(
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

		if (result instanceof MiningProspectingRights) {
			MiningProspectingRights miningProspectingRights =
				(MiningProspectingRights)result;

			if (miningLeaseApplicationId !=
					miningProspectingRights.getMiningLeaseApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MININGPROSPECTINGRIGHTS_WHERE);

			sb.append(_FINDER_COLUMN_GETMININGBYID_MININGLEASEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miningLeaseApplicationId);

				List<MiningProspectingRights> list = query.list();

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
								"MiningProspectingRightsPersistenceImpl.fetchBygetMiningById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiningProspectingRights miningProspectingRights = list.get(
						0);

					result = miningProspectingRights;

					cacheResult(miningProspectingRights);
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
			return (MiningProspectingRights)result;
		}
	}

	/**
	 * Removes the mining prospecting rights where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the mining prospecting rights that was removed
	 */
	@Override
	public MiningProspectingRights removeBygetMiningById(
			long miningLeaseApplicationId)
		throws NoSuchMiningProspectingRightsException {

		MiningProspectingRights miningProspectingRights = findBygetMiningById(
			miningLeaseApplicationId);

		return remove(miningProspectingRights);
	}

	/**
	 * Returns the number of mining prospecting rightses where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining prospecting rightses
	 */
	@Override
	public int countBygetMiningById(long miningLeaseApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMiningById;

		Object[] finderArgs = new Object[] {miningLeaseApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGPROSPECTINGRIGHTS_WHERE);

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
			"miningProspectingRights.miningLeaseApplicationId = ?";

	public MiningProspectingRightsPersistenceImpl() {
		setModelClass(MiningProspectingRights.class);

		setModelImplClass(MiningProspectingRightsImpl.class);
		setModelPKClass(long.class);

		setTable(MiningProspectingRightsTable.INSTANCE);
	}

	/**
	 * Caches the mining prospecting rights in the entity cache if it is enabled.
	 *
	 * @param miningProspectingRights the mining prospecting rights
	 */
	@Override
	public void cacheResult(MiningProspectingRights miningProspectingRights) {
		entityCache.putResult(
			MiningProspectingRightsImpl.class,
			miningProspectingRights.getPrimaryKey(), miningProspectingRights);

		finderCache.putResult(
			_finderPathFetchBygetMiningById,
			new Object[] {
				miningProspectingRights.getMiningLeaseApplicationId()
			},
			miningProspectingRights);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the mining prospecting rightses in the entity cache if it is enabled.
	 *
	 * @param miningProspectingRightses the mining prospecting rightses
	 */
	@Override
	public void cacheResult(
		List<MiningProspectingRights> miningProspectingRightses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miningProspectingRightses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiningProspectingRights miningProspectingRights :
				miningProspectingRightses) {

			if (entityCache.getResult(
					MiningProspectingRightsImpl.class,
					miningProspectingRights.getPrimaryKey()) == null) {

				cacheResult(miningProspectingRights);
			}
		}
	}

	/**
	 * Clears the cache for all mining prospecting rightses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiningProspectingRightsImpl.class);

		finderCache.clearCache(MiningProspectingRightsImpl.class);
	}

	/**
	 * Clears the cache for the mining prospecting rights.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MiningProspectingRights miningProspectingRights) {
		entityCache.removeResult(
			MiningProspectingRightsImpl.class, miningProspectingRights);
	}

	@Override
	public void clearCache(
		List<MiningProspectingRights> miningProspectingRightses) {

		for (MiningProspectingRights miningProspectingRights :
				miningProspectingRightses) {

			entityCache.removeResult(
				MiningProspectingRightsImpl.class, miningProspectingRights);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiningProspectingRightsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MiningProspectingRightsImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MiningProspectingRightsModelImpl miningProspectingRightsModelImpl) {

		Object[] args = new Object[] {
			miningProspectingRightsModelImpl.getMiningLeaseApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetMiningById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMiningById, args,
			miningProspectingRightsModelImpl);
	}

	/**
	 * Creates a new mining prospecting rights with the primary key. Does not add the mining prospecting rights to the database.
	 *
	 * @param prospectingRightsId the primary key for the new mining prospecting rights
	 * @return the new mining prospecting rights
	 */
	@Override
	public MiningProspectingRights create(long prospectingRightsId) {
		MiningProspectingRights miningProspectingRights =
			new MiningProspectingRightsImpl();

		miningProspectingRights.setNew(true);
		miningProspectingRights.setPrimaryKey(prospectingRightsId);

		miningProspectingRights.setCompanyId(CompanyThreadLocal.getCompanyId());

		return miningProspectingRights;
	}

	/**
	 * Removes the mining prospecting rights with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param prospectingRightsId the primary key of the mining prospecting rights
	 * @return the mining prospecting rights that was removed
	 * @throws NoSuchMiningProspectingRightsException if a mining prospecting rights with the primary key could not be found
	 */
	@Override
	public MiningProspectingRights remove(long prospectingRightsId)
		throws NoSuchMiningProspectingRightsException {

		return remove((Serializable)prospectingRightsId);
	}

	/**
	 * Removes the mining prospecting rights with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mining prospecting rights
	 * @return the mining prospecting rights that was removed
	 * @throws NoSuchMiningProspectingRightsException if a mining prospecting rights with the primary key could not be found
	 */
	@Override
	public MiningProspectingRights remove(Serializable primaryKey)
		throws NoSuchMiningProspectingRightsException {

		Session session = null;

		try {
			session = openSession();

			MiningProspectingRights miningProspectingRights =
				(MiningProspectingRights)session.get(
					MiningProspectingRightsImpl.class, primaryKey);

			if (miningProspectingRights == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiningProspectingRightsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miningProspectingRights);
		}
		catch (NoSuchMiningProspectingRightsException noSuchEntityException) {
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
	protected MiningProspectingRights removeImpl(
		MiningProspectingRights miningProspectingRights) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miningProspectingRights)) {
				miningProspectingRights = (MiningProspectingRights)session.get(
					MiningProspectingRightsImpl.class,
					miningProspectingRights.getPrimaryKeyObj());
			}

			if (miningProspectingRights != null) {
				session.delete(miningProspectingRights);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miningProspectingRights != null) {
			clearCache(miningProspectingRights);
		}

		return miningProspectingRights;
	}

	@Override
	public MiningProspectingRights updateImpl(
		MiningProspectingRights miningProspectingRights) {

		boolean isNew = miningProspectingRights.isNew();

		if (!(miningProspectingRights instanceof
				MiningProspectingRightsModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(miningProspectingRights.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					miningProspectingRights);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miningProspectingRights proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiningProspectingRights implementation " +
					miningProspectingRights.getClass());
		}

		MiningProspectingRightsModelImpl miningProspectingRightsModelImpl =
			(MiningProspectingRightsModelImpl)miningProspectingRights;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (miningProspectingRights.getCreateDate() == null)) {
			if (serviceContext == null) {
				miningProspectingRights.setCreateDate(date);
			}
			else {
				miningProspectingRights.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!miningProspectingRightsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				miningProspectingRights.setModifiedDate(date);
			}
			else {
				miningProspectingRights.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miningProspectingRights);
			}
			else {
				miningProspectingRights =
					(MiningProspectingRights)session.merge(
						miningProspectingRights);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MiningProspectingRightsImpl.class, miningProspectingRightsModelImpl,
			false, true);

		cacheUniqueFindersCache(miningProspectingRightsModelImpl);

		if (isNew) {
			miningProspectingRights.setNew(false);
		}

		miningProspectingRights.resetOriginalValues();

		return miningProspectingRights;
	}

	/**
	 * Returns the mining prospecting rights with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mining prospecting rights
	 * @return the mining prospecting rights
	 * @throws NoSuchMiningProspectingRightsException if a mining prospecting rights with the primary key could not be found
	 */
	@Override
	public MiningProspectingRights findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMiningProspectingRightsException {

		MiningProspectingRights miningProspectingRights = fetchByPrimaryKey(
			primaryKey);

		if (miningProspectingRights == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiningProspectingRightsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miningProspectingRights;
	}

	/**
	 * Returns the mining prospecting rights with the primary key or throws a <code>NoSuchMiningProspectingRightsException</code> if it could not be found.
	 *
	 * @param prospectingRightsId the primary key of the mining prospecting rights
	 * @return the mining prospecting rights
	 * @throws NoSuchMiningProspectingRightsException if a mining prospecting rights with the primary key could not be found
	 */
	@Override
	public MiningProspectingRights findByPrimaryKey(long prospectingRightsId)
		throws NoSuchMiningProspectingRightsException {

		return findByPrimaryKey((Serializable)prospectingRightsId);
	}

	/**
	 * Returns the mining prospecting rights with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param prospectingRightsId the primary key of the mining prospecting rights
	 * @return the mining prospecting rights, or <code>null</code> if a mining prospecting rights with the primary key could not be found
	 */
	@Override
	public MiningProspectingRights fetchByPrimaryKey(long prospectingRightsId) {
		return fetchByPrimaryKey((Serializable)prospectingRightsId);
	}

	/**
	 * Returns all the mining prospecting rightses.
	 *
	 * @return the mining prospecting rightses
	 */
	@Override
	public List<MiningProspectingRights> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining prospecting rightses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingRightsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting rightses
	 * @param end the upper bound of the range of mining prospecting rightses (not inclusive)
	 * @return the range of mining prospecting rightses
	 */
	@Override
	public List<MiningProspectingRights> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining prospecting rightses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingRightsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting rightses
	 * @param end the upper bound of the range of mining prospecting rightses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining prospecting rightses
	 */
	@Override
	public List<MiningProspectingRights> findAll(
		int start, int end,
		OrderByComparator<MiningProspectingRights> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining prospecting rightses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingRightsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting rightses
	 * @param end the upper bound of the range of mining prospecting rightses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining prospecting rightses
	 */
	@Override
	public List<MiningProspectingRights> findAll(
		int start, int end,
		OrderByComparator<MiningProspectingRights> orderByComparator,
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

		List<MiningProspectingRights> list = null;

		if (useFinderCache) {
			list = (List<MiningProspectingRights>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MININGPROSPECTINGRIGHTS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MININGPROSPECTINGRIGHTS;

				sql = sql.concat(
					MiningProspectingRightsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MiningProspectingRights>)QueryUtil.list(
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
	 * Removes all the mining prospecting rightses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiningProspectingRights miningProspectingRights : findAll()) {
			remove(miningProspectingRights);
		}
	}

	/**
	 * Returns the number of mining prospecting rightses.
	 *
	 * @return the number of mining prospecting rightses
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
					_SQL_COUNT_MININGPROSPECTINGRIGHTS);

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
		return "prospectingRightsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MININGPROSPECTINGRIGHTS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiningProspectingRightsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the mining prospecting rights persistence.
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

		MiningProspectingRightsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiningProspectingRightsUtil.setPersistence(null);

		entityCache.removeCache(MiningProspectingRightsImpl.class.getName());
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

	private static final String _SQL_SELECT_MININGPROSPECTINGRIGHTS =
		"SELECT miningProspectingRights FROM MiningProspectingRights miningProspectingRights";

	private static final String _SQL_SELECT_MININGPROSPECTINGRIGHTS_WHERE =
		"SELECT miningProspectingRights FROM MiningProspectingRights miningProspectingRights WHERE ";

	private static final String _SQL_COUNT_MININGPROSPECTINGRIGHTS =
		"SELECT COUNT(miningProspectingRights) FROM MiningProspectingRights miningProspectingRights";

	private static final String _SQL_COUNT_MININGPROSPECTINGRIGHTS_WHERE =
		"SELECT COUNT(miningProspectingRights) FROM MiningProspectingRights miningProspectingRights WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"miningProspectingRights.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiningProspectingRights exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MiningProspectingRights exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MiningProspectingRightsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}