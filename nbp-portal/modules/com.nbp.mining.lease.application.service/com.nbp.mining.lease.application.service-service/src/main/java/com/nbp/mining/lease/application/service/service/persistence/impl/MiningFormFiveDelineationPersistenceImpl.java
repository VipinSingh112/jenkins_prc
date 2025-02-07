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

import com.nbp.mining.lease.application.service.exception.NoSuchMiningFormFiveDelineationException;
import com.nbp.mining.lease.application.service.model.MiningFormFiveDelineation;
import com.nbp.mining.lease.application.service.model.MiningFormFiveDelineationTable;
import com.nbp.mining.lease.application.service.model.impl.MiningFormFiveDelineationImpl;
import com.nbp.mining.lease.application.service.model.impl.MiningFormFiveDelineationModelImpl;
import com.nbp.mining.lease.application.service.service.persistence.MiningFormFiveDelineationPersistence;
import com.nbp.mining.lease.application.service.service.persistence.MiningFormFiveDelineationUtil;
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
 * The persistence implementation for the mining form five delineation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiningFormFiveDelineationPersistence.class)
public class MiningFormFiveDelineationPersistenceImpl
	extends BasePersistenceImpl<MiningFormFiveDelineation>
	implements MiningFormFiveDelineationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiningFormFiveDelineationUtil</code> to access the mining form five delineation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiningFormFiveDelineationImpl.class.getName();

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
	 * Returns the mining form five delineation where miningLeaseApplicationId = &#63; or throws a <code>NoSuchMiningFormFiveDelineationException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining form five delineation
	 * @throws NoSuchMiningFormFiveDelineationException if a matching mining form five delineation could not be found
	 */
	@Override
	public MiningFormFiveDelineation findBygetMiningById(
			long miningLeaseApplicationId)
		throws NoSuchMiningFormFiveDelineationException {

		MiningFormFiveDelineation miningFormFiveDelineation =
			fetchBygetMiningById(miningLeaseApplicationId);

		if (miningFormFiveDelineation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("miningLeaseApplicationId=");
			sb.append(miningLeaseApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiningFormFiveDelineationException(sb.toString());
		}

		return miningFormFiveDelineation;
	}

	/**
	 * Returns the mining form five delineation where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining form five delineation, or <code>null</code> if a matching mining form five delineation could not be found
	 */
	@Override
	public MiningFormFiveDelineation fetchBygetMiningById(
		long miningLeaseApplicationId) {

		return fetchBygetMiningById(miningLeaseApplicationId, true);
	}

	/**
	 * Returns the mining form five delineation where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining form five delineation, or <code>null</code> if a matching mining form five delineation could not be found
	 */
	@Override
	public MiningFormFiveDelineation fetchBygetMiningById(
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

		if (result instanceof MiningFormFiveDelineation) {
			MiningFormFiveDelineation miningFormFiveDelineation =
				(MiningFormFiveDelineation)result;

			if (miningLeaseApplicationId !=
					miningFormFiveDelineation.getMiningLeaseApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MININGFORMFIVEDELINEATION_WHERE);

			sb.append(_FINDER_COLUMN_GETMININGBYID_MININGLEASEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miningLeaseApplicationId);

				List<MiningFormFiveDelineation> list = query.list();

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
								"MiningFormFiveDelineationPersistenceImpl.fetchBygetMiningById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiningFormFiveDelineation miningFormFiveDelineation =
						list.get(0);

					result = miningFormFiveDelineation;

					cacheResult(miningFormFiveDelineation);
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
			return (MiningFormFiveDelineation)result;
		}
	}

	/**
	 * Removes the mining form five delineation where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the mining form five delineation that was removed
	 */
	@Override
	public MiningFormFiveDelineation removeBygetMiningById(
			long miningLeaseApplicationId)
		throws NoSuchMiningFormFiveDelineationException {

		MiningFormFiveDelineation miningFormFiveDelineation =
			findBygetMiningById(miningLeaseApplicationId);

		return remove(miningFormFiveDelineation);
	}

	/**
	 * Returns the number of mining form five delineations where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining form five delineations
	 */
	@Override
	public int countBygetMiningById(long miningLeaseApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMiningById;

		Object[] finderArgs = new Object[] {miningLeaseApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGFORMFIVEDELINEATION_WHERE);

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
			"miningFormFiveDelineation.miningLeaseApplicationId = ?";

	public MiningFormFiveDelineationPersistenceImpl() {
		setModelClass(MiningFormFiveDelineation.class);

		setModelImplClass(MiningFormFiveDelineationImpl.class);
		setModelPKClass(long.class);

		setTable(MiningFormFiveDelineationTable.INSTANCE);
	}

	/**
	 * Caches the mining form five delineation in the entity cache if it is enabled.
	 *
	 * @param miningFormFiveDelineation the mining form five delineation
	 */
	@Override
	public void cacheResult(
		MiningFormFiveDelineation miningFormFiveDelineation) {

		entityCache.putResult(
			MiningFormFiveDelineationImpl.class,
			miningFormFiveDelineation.getPrimaryKey(),
			miningFormFiveDelineation);

		finderCache.putResult(
			_finderPathFetchBygetMiningById,
			new Object[] {
				miningFormFiveDelineation.getMiningLeaseApplicationId()
			},
			miningFormFiveDelineation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the mining form five delineations in the entity cache if it is enabled.
	 *
	 * @param miningFormFiveDelineations the mining form five delineations
	 */
	@Override
	public void cacheResult(
		List<MiningFormFiveDelineation> miningFormFiveDelineations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miningFormFiveDelineations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiningFormFiveDelineation miningFormFiveDelineation :
				miningFormFiveDelineations) {

			if (entityCache.getResult(
					MiningFormFiveDelineationImpl.class,
					miningFormFiveDelineation.getPrimaryKey()) == null) {

				cacheResult(miningFormFiveDelineation);
			}
		}
	}

	/**
	 * Clears the cache for all mining form five delineations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiningFormFiveDelineationImpl.class);

		finderCache.clearCache(MiningFormFiveDelineationImpl.class);
	}

	/**
	 * Clears the cache for the mining form five delineation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		MiningFormFiveDelineation miningFormFiveDelineation) {

		entityCache.removeResult(
			MiningFormFiveDelineationImpl.class, miningFormFiveDelineation);
	}

	@Override
	public void clearCache(
		List<MiningFormFiveDelineation> miningFormFiveDelineations) {

		for (MiningFormFiveDelineation miningFormFiveDelineation :
				miningFormFiveDelineations) {

			entityCache.removeResult(
				MiningFormFiveDelineationImpl.class, miningFormFiveDelineation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiningFormFiveDelineationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MiningFormFiveDelineationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MiningFormFiveDelineationModelImpl miningFormFiveDelineationModelImpl) {

		Object[] args = new Object[] {
			miningFormFiveDelineationModelImpl.getMiningLeaseApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetMiningById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMiningById, args,
			miningFormFiveDelineationModelImpl);
	}

	/**
	 * Creates a new mining form five delineation with the primary key. Does not add the mining form five delineation to the database.
	 *
	 * @param miningFormFiveDelineationId the primary key for the new mining form five delineation
	 * @return the new mining form five delineation
	 */
	@Override
	public MiningFormFiveDelineation create(long miningFormFiveDelineationId) {
		MiningFormFiveDelineation miningFormFiveDelineation =
			new MiningFormFiveDelineationImpl();

		miningFormFiveDelineation.setNew(true);
		miningFormFiveDelineation.setPrimaryKey(miningFormFiveDelineationId);

		miningFormFiveDelineation.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return miningFormFiveDelineation;
	}

	/**
	 * Removes the mining form five delineation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningFormFiveDelineationId the primary key of the mining form five delineation
	 * @return the mining form five delineation that was removed
	 * @throws NoSuchMiningFormFiveDelineationException if a mining form five delineation with the primary key could not be found
	 */
	@Override
	public MiningFormFiveDelineation remove(long miningFormFiveDelineationId)
		throws NoSuchMiningFormFiveDelineationException {

		return remove((Serializable)miningFormFiveDelineationId);
	}

	/**
	 * Removes the mining form five delineation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mining form five delineation
	 * @return the mining form five delineation that was removed
	 * @throws NoSuchMiningFormFiveDelineationException if a mining form five delineation with the primary key could not be found
	 */
	@Override
	public MiningFormFiveDelineation remove(Serializable primaryKey)
		throws NoSuchMiningFormFiveDelineationException {

		Session session = null;

		try {
			session = openSession();

			MiningFormFiveDelineation miningFormFiveDelineation =
				(MiningFormFiveDelineation)session.get(
					MiningFormFiveDelineationImpl.class, primaryKey);

			if (miningFormFiveDelineation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiningFormFiveDelineationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miningFormFiveDelineation);
		}
		catch (NoSuchMiningFormFiveDelineationException noSuchEntityException) {
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
	protected MiningFormFiveDelineation removeImpl(
		MiningFormFiveDelineation miningFormFiveDelineation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miningFormFiveDelineation)) {
				miningFormFiveDelineation =
					(MiningFormFiveDelineation)session.get(
						MiningFormFiveDelineationImpl.class,
						miningFormFiveDelineation.getPrimaryKeyObj());
			}

			if (miningFormFiveDelineation != null) {
				session.delete(miningFormFiveDelineation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miningFormFiveDelineation != null) {
			clearCache(miningFormFiveDelineation);
		}

		return miningFormFiveDelineation;
	}

	@Override
	public MiningFormFiveDelineation updateImpl(
		MiningFormFiveDelineation miningFormFiveDelineation) {

		boolean isNew = miningFormFiveDelineation.isNew();

		if (!(miningFormFiveDelineation instanceof
				MiningFormFiveDelineationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(miningFormFiveDelineation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					miningFormFiveDelineation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miningFormFiveDelineation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiningFormFiveDelineation implementation " +
					miningFormFiveDelineation.getClass());
		}

		MiningFormFiveDelineationModelImpl miningFormFiveDelineationModelImpl =
			(MiningFormFiveDelineationModelImpl)miningFormFiveDelineation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (miningFormFiveDelineation.getCreateDate() == null)) {
			if (serviceContext == null) {
				miningFormFiveDelineation.setCreateDate(date);
			}
			else {
				miningFormFiveDelineation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!miningFormFiveDelineationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				miningFormFiveDelineation.setModifiedDate(date);
			}
			else {
				miningFormFiveDelineation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miningFormFiveDelineation);
			}
			else {
				miningFormFiveDelineation =
					(MiningFormFiveDelineation)session.merge(
						miningFormFiveDelineation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MiningFormFiveDelineationImpl.class,
			miningFormFiveDelineationModelImpl, false, true);

		cacheUniqueFindersCache(miningFormFiveDelineationModelImpl);

		if (isNew) {
			miningFormFiveDelineation.setNew(false);
		}

		miningFormFiveDelineation.resetOriginalValues();

		return miningFormFiveDelineation;
	}

	/**
	 * Returns the mining form five delineation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mining form five delineation
	 * @return the mining form five delineation
	 * @throws NoSuchMiningFormFiveDelineationException if a mining form five delineation with the primary key could not be found
	 */
	@Override
	public MiningFormFiveDelineation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMiningFormFiveDelineationException {

		MiningFormFiveDelineation miningFormFiveDelineation = fetchByPrimaryKey(
			primaryKey);

		if (miningFormFiveDelineation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiningFormFiveDelineationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miningFormFiveDelineation;
	}

	/**
	 * Returns the mining form five delineation with the primary key or throws a <code>NoSuchMiningFormFiveDelineationException</code> if it could not be found.
	 *
	 * @param miningFormFiveDelineationId the primary key of the mining form five delineation
	 * @return the mining form five delineation
	 * @throws NoSuchMiningFormFiveDelineationException if a mining form five delineation with the primary key could not be found
	 */
	@Override
	public MiningFormFiveDelineation findByPrimaryKey(
			long miningFormFiveDelineationId)
		throws NoSuchMiningFormFiveDelineationException {

		return findByPrimaryKey((Serializable)miningFormFiveDelineationId);
	}

	/**
	 * Returns the mining form five delineation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningFormFiveDelineationId the primary key of the mining form five delineation
	 * @return the mining form five delineation, or <code>null</code> if a mining form five delineation with the primary key could not be found
	 */
	@Override
	public MiningFormFiveDelineation fetchByPrimaryKey(
		long miningFormFiveDelineationId) {

		return fetchByPrimaryKey((Serializable)miningFormFiveDelineationId);
	}

	/**
	 * Returns all the mining form five delineations.
	 *
	 * @return the mining form five delineations
	 */
	@Override
	public List<MiningFormFiveDelineation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining form five delineations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningFormFiveDelineationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining form five delineations
	 * @param end the upper bound of the range of mining form five delineations (not inclusive)
	 * @return the range of mining form five delineations
	 */
	@Override
	public List<MiningFormFiveDelineation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining form five delineations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningFormFiveDelineationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining form five delineations
	 * @param end the upper bound of the range of mining form five delineations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining form five delineations
	 */
	@Override
	public List<MiningFormFiveDelineation> findAll(
		int start, int end,
		OrderByComparator<MiningFormFiveDelineation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining form five delineations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningFormFiveDelineationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining form five delineations
	 * @param end the upper bound of the range of mining form five delineations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining form five delineations
	 */
	@Override
	public List<MiningFormFiveDelineation> findAll(
		int start, int end,
		OrderByComparator<MiningFormFiveDelineation> orderByComparator,
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

		List<MiningFormFiveDelineation> list = null;

		if (useFinderCache) {
			list = (List<MiningFormFiveDelineation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MININGFORMFIVEDELINEATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MININGFORMFIVEDELINEATION;

				sql = sql.concat(
					MiningFormFiveDelineationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MiningFormFiveDelineation>)QueryUtil.list(
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
	 * Removes all the mining form five delineations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiningFormFiveDelineation miningFormFiveDelineation : findAll()) {
			remove(miningFormFiveDelineation);
		}
	}

	/**
	 * Returns the number of mining form five delineations.
	 *
	 * @return the number of mining form five delineations
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
					_SQL_COUNT_MININGFORMFIVEDELINEATION);

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
		return "miningFormFiveDelineationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MININGFORMFIVEDELINEATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiningFormFiveDelineationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the mining form five delineation persistence.
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

		MiningFormFiveDelineationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiningFormFiveDelineationUtil.setPersistence(null);

		entityCache.removeCache(MiningFormFiveDelineationImpl.class.getName());
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

	private static final String _SQL_SELECT_MININGFORMFIVEDELINEATION =
		"SELECT miningFormFiveDelineation FROM MiningFormFiveDelineation miningFormFiveDelineation";

	private static final String _SQL_SELECT_MININGFORMFIVEDELINEATION_WHERE =
		"SELECT miningFormFiveDelineation FROM MiningFormFiveDelineation miningFormFiveDelineation WHERE ";

	private static final String _SQL_COUNT_MININGFORMFIVEDELINEATION =
		"SELECT COUNT(miningFormFiveDelineation) FROM MiningFormFiveDelineation miningFormFiveDelineation";

	private static final String _SQL_COUNT_MININGFORMFIVEDELINEATION_WHERE =
		"SELECT COUNT(miningFormFiveDelineation) FROM MiningFormFiveDelineation miningFormFiveDelineation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"miningFormFiveDelineation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiningFormFiveDelineation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MiningFormFiveDelineation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MiningFormFiveDelineationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}