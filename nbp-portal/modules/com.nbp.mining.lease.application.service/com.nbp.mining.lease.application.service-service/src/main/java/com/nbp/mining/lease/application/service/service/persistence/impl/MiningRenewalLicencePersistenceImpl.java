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

import com.nbp.mining.lease.application.service.exception.NoSuchMiningRenewalLicenceException;
import com.nbp.mining.lease.application.service.model.MiningRenewalLicence;
import com.nbp.mining.lease.application.service.model.MiningRenewalLicenceTable;
import com.nbp.mining.lease.application.service.model.impl.MiningRenewalLicenceImpl;
import com.nbp.mining.lease.application.service.model.impl.MiningRenewalLicenceModelImpl;
import com.nbp.mining.lease.application.service.service.persistence.MiningRenewalLicencePersistence;
import com.nbp.mining.lease.application.service.service.persistence.MiningRenewalLicenceUtil;
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
 * The persistence implementation for the mining renewal licence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiningRenewalLicencePersistence.class)
public class MiningRenewalLicencePersistenceImpl
	extends BasePersistenceImpl<MiningRenewalLicence>
	implements MiningRenewalLicencePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiningRenewalLicenceUtil</code> to access the mining renewal licence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiningRenewalLicenceImpl.class.getName();

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
	 * Returns the mining renewal licence where miningLeaseApplicationId = &#63; or throws a <code>NoSuchMiningRenewalLicenceException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining renewal licence
	 * @throws NoSuchMiningRenewalLicenceException if a matching mining renewal licence could not be found
	 */
	@Override
	public MiningRenewalLicence findBygetMiningById(
			long miningLeaseApplicationId)
		throws NoSuchMiningRenewalLicenceException {

		MiningRenewalLicence miningRenewalLicence = fetchBygetMiningById(
			miningLeaseApplicationId);

		if (miningRenewalLicence == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("miningLeaseApplicationId=");
			sb.append(miningLeaseApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiningRenewalLicenceException(sb.toString());
		}

		return miningRenewalLicence;
	}

	/**
	 * Returns the mining renewal licence where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining renewal licence, or <code>null</code> if a matching mining renewal licence could not be found
	 */
	@Override
	public MiningRenewalLicence fetchBygetMiningById(
		long miningLeaseApplicationId) {

		return fetchBygetMiningById(miningLeaseApplicationId, true);
	}

	/**
	 * Returns the mining renewal licence where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining renewal licence, or <code>null</code> if a matching mining renewal licence could not be found
	 */
	@Override
	public MiningRenewalLicence fetchBygetMiningById(
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

		if (result instanceof MiningRenewalLicence) {
			MiningRenewalLicence miningRenewalLicence =
				(MiningRenewalLicence)result;

			if (miningLeaseApplicationId !=
					miningRenewalLicence.getMiningLeaseApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MININGRENEWALLICENCE_WHERE);

			sb.append(_FINDER_COLUMN_GETMININGBYID_MININGLEASEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miningLeaseApplicationId);

				List<MiningRenewalLicence> list = query.list();

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
								"MiningRenewalLicencePersistenceImpl.fetchBygetMiningById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiningRenewalLicence miningRenewalLicence = list.get(0);

					result = miningRenewalLicence;

					cacheResult(miningRenewalLicence);
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
			return (MiningRenewalLicence)result;
		}
	}

	/**
	 * Removes the mining renewal licence where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the mining renewal licence that was removed
	 */
	@Override
	public MiningRenewalLicence removeBygetMiningById(
			long miningLeaseApplicationId)
		throws NoSuchMiningRenewalLicenceException {

		MiningRenewalLicence miningRenewalLicence = findBygetMiningById(
			miningLeaseApplicationId);

		return remove(miningRenewalLicence);
	}

	/**
	 * Returns the number of mining renewal licences where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining renewal licences
	 */
	@Override
	public int countBygetMiningById(long miningLeaseApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMiningById;

		Object[] finderArgs = new Object[] {miningLeaseApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGRENEWALLICENCE_WHERE);

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
			"miningRenewalLicence.miningLeaseApplicationId = ?";

	public MiningRenewalLicencePersistenceImpl() {
		setModelClass(MiningRenewalLicence.class);

		setModelImplClass(MiningRenewalLicenceImpl.class);
		setModelPKClass(long.class);

		setTable(MiningRenewalLicenceTable.INSTANCE);
	}

	/**
	 * Caches the mining renewal licence in the entity cache if it is enabled.
	 *
	 * @param miningRenewalLicence the mining renewal licence
	 */
	@Override
	public void cacheResult(MiningRenewalLicence miningRenewalLicence) {
		entityCache.putResult(
			MiningRenewalLicenceImpl.class,
			miningRenewalLicence.getPrimaryKey(), miningRenewalLicence);

		finderCache.putResult(
			_finderPathFetchBygetMiningById,
			new Object[] {miningRenewalLicence.getMiningLeaseApplicationId()},
			miningRenewalLicence);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the mining renewal licences in the entity cache if it is enabled.
	 *
	 * @param miningRenewalLicences the mining renewal licences
	 */
	@Override
	public void cacheResult(List<MiningRenewalLicence> miningRenewalLicences) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miningRenewalLicences.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiningRenewalLicence miningRenewalLicence :
				miningRenewalLicences) {

			if (entityCache.getResult(
					MiningRenewalLicenceImpl.class,
					miningRenewalLicence.getPrimaryKey()) == null) {

				cacheResult(miningRenewalLicence);
			}
		}
	}

	/**
	 * Clears the cache for all mining renewal licences.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiningRenewalLicenceImpl.class);

		finderCache.clearCache(MiningRenewalLicenceImpl.class);
	}

	/**
	 * Clears the cache for the mining renewal licence.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MiningRenewalLicence miningRenewalLicence) {
		entityCache.removeResult(
			MiningRenewalLicenceImpl.class, miningRenewalLicence);
	}

	@Override
	public void clearCache(List<MiningRenewalLicence> miningRenewalLicences) {
		for (MiningRenewalLicence miningRenewalLicence :
				miningRenewalLicences) {

			entityCache.removeResult(
				MiningRenewalLicenceImpl.class, miningRenewalLicence);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiningRenewalLicenceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MiningRenewalLicenceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MiningRenewalLicenceModelImpl miningRenewalLicenceModelImpl) {

		Object[] args = new Object[] {
			miningRenewalLicenceModelImpl.getMiningLeaseApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetMiningById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMiningById, args,
			miningRenewalLicenceModelImpl);
	}

	/**
	 * Creates a new mining renewal licence with the primary key. Does not add the mining renewal licence to the database.
	 *
	 * @param miningRenewalLicenceId the primary key for the new mining renewal licence
	 * @return the new mining renewal licence
	 */
	@Override
	public MiningRenewalLicence create(long miningRenewalLicenceId) {
		MiningRenewalLicence miningRenewalLicence =
			new MiningRenewalLicenceImpl();

		miningRenewalLicence.setNew(true);
		miningRenewalLicence.setPrimaryKey(miningRenewalLicenceId);

		miningRenewalLicence.setCompanyId(CompanyThreadLocal.getCompanyId());

		return miningRenewalLicence;
	}

	/**
	 * Removes the mining renewal licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningRenewalLicenceId the primary key of the mining renewal licence
	 * @return the mining renewal licence that was removed
	 * @throws NoSuchMiningRenewalLicenceException if a mining renewal licence with the primary key could not be found
	 */
	@Override
	public MiningRenewalLicence remove(long miningRenewalLicenceId)
		throws NoSuchMiningRenewalLicenceException {

		return remove((Serializable)miningRenewalLicenceId);
	}

	/**
	 * Removes the mining renewal licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mining renewal licence
	 * @return the mining renewal licence that was removed
	 * @throws NoSuchMiningRenewalLicenceException if a mining renewal licence with the primary key could not be found
	 */
	@Override
	public MiningRenewalLicence remove(Serializable primaryKey)
		throws NoSuchMiningRenewalLicenceException {

		Session session = null;

		try {
			session = openSession();

			MiningRenewalLicence miningRenewalLicence =
				(MiningRenewalLicence)session.get(
					MiningRenewalLicenceImpl.class, primaryKey);

			if (miningRenewalLicence == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiningRenewalLicenceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miningRenewalLicence);
		}
		catch (NoSuchMiningRenewalLicenceException noSuchEntityException) {
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
	protected MiningRenewalLicence removeImpl(
		MiningRenewalLicence miningRenewalLicence) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miningRenewalLicence)) {
				miningRenewalLicence = (MiningRenewalLicence)session.get(
					MiningRenewalLicenceImpl.class,
					miningRenewalLicence.getPrimaryKeyObj());
			}

			if (miningRenewalLicence != null) {
				session.delete(miningRenewalLicence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miningRenewalLicence != null) {
			clearCache(miningRenewalLicence);
		}

		return miningRenewalLicence;
	}

	@Override
	public MiningRenewalLicence updateImpl(
		MiningRenewalLicence miningRenewalLicence) {

		boolean isNew = miningRenewalLicence.isNew();

		if (!(miningRenewalLicence instanceof MiningRenewalLicenceModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(miningRenewalLicence.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					miningRenewalLicence);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miningRenewalLicence proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiningRenewalLicence implementation " +
					miningRenewalLicence.getClass());
		}

		MiningRenewalLicenceModelImpl miningRenewalLicenceModelImpl =
			(MiningRenewalLicenceModelImpl)miningRenewalLicence;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (miningRenewalLicence.getCreateDate() == null)) {
			if (serviceContext == null) {
				miningRenewalLicence.setCreateDate(date);
			}
			else {
				miningRenewalLicence.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!miningRenewalLicenceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				miningRenewalLicence.setModifiedDate(date);
			}
			else {
				miningRenewalLicence.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miningRenewalLicence);
			}
			else {
				miningRenewalLicence = (MiningRenewalLicence)session.merge(
					miningRenewalLicence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MiningRenewalLicenceImpl.class, miningRenewalLicenceModelImpl,
			false, true);

		cacheUniqueFindersCache(miningRenewalLicenceModelImpl);

		if (isNew) {
			miningRenewalLicence.setNew(false);
		}

		miningRenewalLicence.resetOriginalValues();

		return miningRenewalLicence;
	}

	/**
	 * Returns the mining renewal licence with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mining renewal licence
	 * @return the mining renewal licence
	 * @throws NoSuchMiningRenewalLicenceException if a mining renewal licence with the primary key could not be found
	 */
	@Override
	public MiningRenewalLicence findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMiningRenewalLicenceException {

		MiningRenewalLicence miningRenewalLicence = fetchByPrimaryKey(
			primaryKey);

		if (miningRenewalLicence == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiningRenewalLicenceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miningRenewalLicence;
	}

	/**
	 * Returns the mining renewal licence with the primary key or throws a <code>NoSuchMiningRenewalLicenceException</code> if it could not be found.
	 *
	 * @param miningRenewalLicenceId the primary key of the mining renewal licence
	 * @return the mining renewal licence
	 * @throws NoSuchMiningRenewalLicenceException if a mining renewal licence with the primary key could not be found
	 */
	@Override
	public MiningRenewalLicence findByPrimaryKey(long miningRenewalLicenceId)
		throws NoSuchMiningRenewalLicenceException {

		return findByPrimaryKey((Serializable)miningRenewalLicenceId);
	}

	/**
	 * Returns the mining renewal licence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningRenewalLicenceId the primary key of the mining renewal licence
	 * @return the mining renewal licence, or <code>null</code> if a mining renewal licence with the primary key could not be found
	 */
	@Override
	public MiningRenewalLicence fetchByPrimaryKey(long miningRenewalLicenceId) {
		return fetchByPrimaryKey((Serializable)miningRenewalLicenceId);
	}

	/**
	 * Returns all the mining renewal licences.
	 *
	 * @return the mining renewal licences
	 */
	@Override
	public List<MiningRenewalLicence> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining renewal licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningRenewalLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining renewal licences
	 * @param end the upper bound of the range of mining renewal licences (not inclusive)
	 * @return the range of mining renewal licences
	 */
	@Override
	public List<MiningRenewalLicence> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining renewal licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningRenewalLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining renewal licences
	 * @param end the upper bound of the range of mining renewal licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining renewal licences
	 */
	@Override
	public List<MiningRenewalLicence> findAll(
		int start, int end,
		OrderByComparator<MiningRenewalLicence> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining renewal licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningRenewalLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining renewal licences
	 * @param end the upper bound of the range of mining renewal licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining renewal licences
	 */
	@Override
	public List<MiningRenewalLicence> findAll(
		int start, int end,
		OrderByComparator<MiningRenewalLicence> orderByComparator,
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

		List<MiningRenewalLicence> list = null;

		if (useFinderCache) {
			list = (List<MiningRenewalLicence>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MININGRENEWALLICENCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MININGRENEWALLICENCE;

				sql = sql.concat(MiningRenewalLicenceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MiningRenewalLicence>)QueryUtil.list(
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
	 * Removes all the mining renewal licences from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiningRenewalLicence miningRenewalLicence : findAll()) {
			remove(miningRenewalLicence);
		}
	}

	/**
	 * Returns the number of mining renewal licences.
	 *
	 * @return the number of mining renewal licences
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
					_SQL_COUNT_MININGRENEWALLICENCE);

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
		return "miningRenewalLicenceId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MININGRENEWALLICENCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiningRenewalLicenceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the mining renewal licence persistence.
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

		MiningRenewalLicenceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiningRenewalLicenceUtil.setPersistence(null);

		entityCache.removeCache(MiningRenewalLicenceImpl.class.getName());
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

	private static final String _SQL_SELECT_MININGRENEWALLICENCE =
		"SELECT miningRenewalLicence FROM MiningRenewalLicence miningRenewalLicence";

	private static final String _SQL_SELECT_MININGRENEWALLICENCE_WHERE =
		"SELECT miningRenewalLicence FROM MiningRenewalLicence miningRenewalLicence WHERE ";

	private static final String _SQL_COUNT_MININGRENEWALLICENCE =
		"SELECT COUNT(miningRenewalLicence) FROM MiningRenewalLicence miningRenewalLicence";

	private static final String _SQL_COUNT_MININGRENEWALLICENCE_WHERE =
		"SELECT COUNT(miningRenewalLicence) FROM MiningRenewalLicence miningRenewalLicence WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"miningRenewalLicence.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiningRenewalLicence exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MiningRenewalLicence exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MiningRenewalLicencePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}