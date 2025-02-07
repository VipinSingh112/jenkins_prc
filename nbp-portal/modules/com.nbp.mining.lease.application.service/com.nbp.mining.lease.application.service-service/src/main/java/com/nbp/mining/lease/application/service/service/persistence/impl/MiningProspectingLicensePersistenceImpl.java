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

import com.nbp.mining.lease.application.service.exception.NoSuchMiningProspectingLicenseException;
import com.nbp.mining.lease.application.service.model.MiningProspectingLicense;
import com.nbp.mining.lease.application.service.model.MiningProspectingLicenseTable;
import com.nbp.mining.lease.application.service.model.impl.MiningProspectingLicenseImpl;
import com.nbp.mining.lease.application.service.model.impl.MiningProspectingLicenseModelImpl;
import com.nbp.mining.lease.application.service.service.persistence.MiningProspectingLicensePersistence;
import com.nbp.mining.lease.application.service.service.persistence.MiningProspectingLicenseUtil;
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
 * The persistence implementation for the mining prospecting license service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiningProspectingLicensePersistence.class)
public class MiningProspectingLicensePersistenceImpl
	extends BasePersistenceImpl<MiningProspectingLicense>
	implements MiningProspectingLicensePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiningProspectingLicenseUtil</code> to access the mining prospecting license persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiningProspectingLicenseImpl.class.getName();

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
	 * Returns the mining prospecting license where miningLeaseApplicationId = &#63; or throws a <code>NoSuchMiningProspectingLicenseException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining prospecting license
	 * @throws NoSuchMiningProspectingLicenseException if a matching mining prospecting license could not be found
	 */
	@Override
	public MiningProspectingLicense findBygetMiningById(
			long miningLeaseApplicationId)
		throws NoSuchMiningProspectingLicenseException {

		MiningProspectingLicense miningProspectingLicense =
			fetchBygetMiningById(miningLeaseApplicationId);

		if (miningProspectingLicense == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("miningLeaseApplicationId=");
			sb.append(miningLeaseApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiningProspectingLicenseException(sb.toString());
		}

		return miningProspectingLicense;
	}

	/**
	 * Returns the mining prospecting license where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining prospecting license, or <code>null</code> if a matching mining prospecting license could not be found
	 */
	@Override
	public MiningProspectingLicense fetchBygetMiningById(
		long miningLeaseApplicationId) {

		return fetchBygetMiningById(miningLeaseApplicationId, true);
	}

	/**
	 * Returns the mining prospecting license where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining prospecting license, or <code>null</code> if a matching mining prospecting license could not be found
	 */
	@Override
	public MiningProspectingLicense fetchBygetMiningById(
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

		if (result instanceof MiningProspectingLicense) {
			MiningProspectingLicense miningProspectingLicense =
				(MiningProspectingLicense)result;

			if (miningLeaseApplicationId !=
					miningProspectingLicense.getMiningLeaseApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MININGPROSPECTINGLICENSE_WHERE);

			sb.append(_FINDER_COLUMN_GETMININGBYID_MININGLEASEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miningLeaseApplicationId);

				List<MiningProspectingLicense> list = query.list();

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
								"MiningProspectingLicensePersistenceImpl.fetchBygetMiningById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiningProspectingLicense miningProspectingLicense =
						list.get(0);

					result = miningProspectingLicense;

					cacheResult(miningProspectingLicense);
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
			return (MiningProspectingLicense)result;
		}
	}

	/**
	 * Removes the mining prospecting license where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the mining prospecting license that was removed
	 */
	@Override
	public MiningProspectingLicense removeBygetMiningById(
			long miningLeaseApplicationId)
		throws NoSuchMiningProspectingLicenseException {

		MiningProspectingLicense miningProspectingLicense = findBygetMiningById(
			miningLeaseApplicationId);

		return remove(miningProspectingLicense);
	}

	/**
	 * Returns the number of mining prospecting licenses where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining prospecting licenses
	 */
	@Override
	public int countBygetMiningById(long miningLeaseApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMiningById;

		Object[] finderArgs = new Object[] {miningLeaseApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGPROSPECTINGLICENSE_WHERE);

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
			"miningProspectingLicense.miningLeaseApplicationId = ?";

	public MiningProspectingLicensePersistenceImpl() {
		setModelClass(MiningProspectingLicense.class);

		setModelImplClass(MiningProspectingLicenseImpl.class);
		setModelPKClass(long.class);

		setTable(MiningProspectingLicenseTable.INSTANCE);
	}

	/**
	 * Caches the mining prospecting license in the entity cache if it is enabled.
	 *
	 * @param miningProspectingLicense the mining prospecting license
	 */
	@Override
	public void cacheResult(MiningProspectingLicense miningProspectingLicense) {
		entityCache.putResult(
			MiningProspectingLicenseImpl.class,
			miningProspectingLicense.getPrimaryKey(), miningProspectingLicense);

		finderCache.putResult(
			_finderPathFetchBygetMiningById,
			new Object[] {
				miningProspectingLicense.getMiningLeaseApplicationId()
			},
			miningProspectingLicense);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the mining prospecting licenses in the entity cache if it is enabled.
	 *
	 * @param miningProspectingLicenses the mining prospecting licenses
	 */
	@Override
	public void cacheResult(
		List<MiningProspectingLicense> miningProspectingLicenses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miningProspectingLicenses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiningProspectingLicense miningProspectingLicense :
				miningProspectingLicenses) {

			if (entityCache.getResult(
					MiningProspectingLicenseImpl.class,
					miningProspectingLicense.getPrimaryKey()) == null) {

				cacheResult(miningProspectingLicense);
			}
		}
	}

	/**
	 * Clears the cache for all mining prospecting licenses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiningProspectingLicenseImpl.class);

		finderCache.clearCache(MiningProspectingLicenseImpl.class);
	}

	/**
	 * Clears the cache for the mining prospecting license.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MiningProspectingLicense miningProspectingLicense) {
		entityCache.removeResult(
			MiningProspectingLicenseImpl.class, miningProspectingLicense);
	}

	@Override
	public void clearCache(
		List<MiningProspectingLicense> miningProspectingLicenses) {

		for (MiningProspectingLicense miningProspectingLicense :
				miningProspectingLicenses) {

			entityCache.removeResult(
				MiningProspectingLicenseImpl.class, miningProspectingLicense);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiningProspectingLicenseImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MiningProspectingLicenseImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MiningProspectingLicenseModelImpl miningProspectingLicenseModelImpl) {

		Object[] args = new Object[] {
			miningProspectingLicenseModelImpl.getMiningLeaseApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetMiningById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMiningById, args,
			miningProspectingLicenseModelImpl);
	}

	/**
	 * Creates a new mining prospecting license with the primary key. Does not add the mining prospecting license to the database.
	 *
	 * @param miningProspectingLicenseId the primary key for the new mining prospecting license
	 * @return the new mining prospecting license
	 */
	@Override
	public MiningProspectingLicense create(long miningProspectingLicenseId) {
		MiningProspectingLicense miningProspectingLicense =
			new MiningProspectingLicenseImpl();

		miningProspectingLicense.setNew(true);
		miningProspectingLicense.setPrimaryKey(miningProspectingLicenseId);

		miningProspectingLicense.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return miningProspectingLicense;
	}

	/**
	 * Removes the mining prospecting license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningProspectingLicenseId the primary key of the mining prospecting license
	 * @return the mining prospecting license that was removed
	 * @throws NoSuchMiningProspectingLicenseException if a mining prospecting license with the primary key could not be found
	 */
	@Override
	public MiningProspectingLicense remove(long miningProspectingLicenseId)
		throws NoSuchMiningProspectingLicenseException {

		return remove((Serializable)miningProspectingLicenseId);
	}

	/**
	 * Removes the mining prospecting license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mining prospecting license
	 * @return the mining prospecting license that was removed
	 * @throws NoSuchMiningProspectingLicenseException if a mining prospecting license with the primary key could not be found
	 */
	@Override
	public MiningProspectingLicense remove(Serializable primaryKey)
		throws NoSuchMiningProspectingLicenseException {

		Session session = null;

		try {
			session = openSession();

			MiningProspectingLicense miningProspectingLicense =
				(MiningProspectingLicense)session.get(
					MiningProspectingLicenseImpl.class, primaryKey);

			if (miningProspectingLicense == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiningProspectingLicenseException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miningProspectingLicense);
		}
		catch (NoSuchMiningProspectingLicenseException noSuchEntityException) {
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
	protected MiningProspectingLicense removeImpl(
		MiningProspectingLicense miningProspectingLicense) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miningProspectingLicense)) {
				miningProspectingLicense =
					(MiningProspectingLicense)session.get(
						MiningProspectingLicenseImpl.class,
						miningProspectingLicense.getPrimaryKeyObj());
			}

			if (miningProspectingLicense != null) {
				session.delete(miningProspectingLicense);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miningProspectingLicense != null) {
			clearCache(miningProspectingLicense);
		}

		return miningProspectingLicense;
	}

	@Override
	public MiningProspectingLicense updateImpl(
		MiningProspectingLicense miningProspectingLicense) {

		boolean isNew = miningProspectingLicense.isNew();

		if (!(miningProspectingLicense instanceof
				MiningProspectingLicenseModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(miningProspectingLicense.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					miningProspectingLicense);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miningProspectingLicense proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiningProspectingLicense implementation " +
					miningProspectingLicense.getClass());
		}

		MiningProspectingLicenseModelImpl miningProspectingLicenseModelImpl =
			(MiningProspectingLicenseModelImpl)miningProspectingLicense;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (miningProspectingLicense.getCreateDate() == null)) {
			if (serviceContext == null) {
				miningProspectingLicense.setCreateDate(date);
			}
			else {
				miningProspectingLicense.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!miningProspectingLicenseModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				miningProspectingLicense.setModifiedDate(date);
			}
			else {
				miningProspectingLicense.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miningProspectingLicense);
			}
			else {
				miningProspectingLicense =
					(MiningProspectingLicense)session.merge(
						miningProspectingLicense);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MiningProspectingLicenseImpl.class,
			miningProspectingLicenseModelImpl, false, true);

		cacheUniqueFindersCache(miningProspectingLicenseModelImpl);

		if (isNew) {
			miningProspectingLicense.setNew(false);
		}

		miningProspectingLicense.resetOriginalValues();

		return miningProspectingLicense;
	}

	/**
	 * Returns the mining prospecting license with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mining prospecting license
	 * @return the mining prospecting license
	 * @throws NoSuchMiningProspectingLicenseException if a mining prospecting license with the primary key could not be found
	 */
	@Override
	public MiningProspectingLicense findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMiningProspectingLicenseException {

		MiningProspectingLicense miningProspectingLicense = fetchByPrimaryKey(
			primaryKey);

		if (miningProspectingLicense == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiningProspectingLicenseException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miningProspectingLicense;
	}

	/**
	 * Returns the mining prospecting license with the primary key or throws a <code>NoSuchMiningProspectingLicenseException</code> if it could not be found.
	 *
	 * @param miningProspectingLicenseId the primary key of the mining prospecting license
	 * @return the mining prospecting license
	 * @throws NoSuchMiningProspectingLicenseException if a mining prospecting license with the primary key could not be found
	 */
	@Override
	public MiningProspectingLicense findByPrimaryKey(
			long miningProspectingLicenseId)
		throws NoSuchMiningProspectingLicenseException {

		return findByPrimaryKey((Serializable)miningProspectingLicenseId);
	}

	/**
	 * Returns the mining prospecting license with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningProspectingLicenseId the primary key of the mining prospecting license
	 * @return the mining prospecting license, or <code>null</code> if a mining prospecting license with the primary key could not be found
	 */
	@Override
	public MiningProspectingLicense fetchByPrimaryKey(
		long miningProspectingLicenseId) {

		return fetchByPrimaryKey((Serializable)miningProspectingLicenseId);
	}

	/**
	 * Returns all the mining prospecting licenses.
	 *
	 * @return the mining prospecting licenses
	 */
	@Override
	public List<MiningProspectingLicense> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining prospecting licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting licenses
	 * @param end the upper bound of the range of mining prospecting licenses (not inclusive)
	 * @return the range of mining prospecting licenses
	 */
	@Override
	public List<MiningProspectingLicense> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining prospecting licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting licenses
	 * @param end the upper bound of the range of mining prospecting licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining prospecting licenses
	 */
	@Override
	public List<MiningProspectingLicense> findAll(
		int start, int end,
		OrderByComparator<MiningProspectingLicense> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining prospecting licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting licenses
	 * @param end the upper bound of the range of mining prospecting licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining prospecting licenses
	 */
	@Override
	public List<MiningProspectingLicense> findAll(
		int start, int end,
		OrderByComparator<MiningProspectingLicense> orderByComparator,
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

		List<MiningProspectingLicense> list = null;

		if (useFinderCache) {
			list = (List<MiningProspectingLicense>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MININGPROSPECTINGLICENSE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MININGPROSPECTINGLICENSE;

				sql = sql.concat(
					MiningProspectingLicenseModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MiningProspectingLicense>)QueryUtil.list(
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
	 * Removes all the mining prospecting licenses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiningProspectingLicense miningProspectingLicense : findAll()) {
			remove(miningProspectingLicense);
		}
	}

	/**
	 * Returns the number of mining prospecting licenses.
	 *
	 * @return the number of mining prospecting licenses
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
					_SQL_COUNT_MININGPROSPECTINGLICENSE);

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
		return "miningProspectingLicenseId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MININGPROSPECTINGLICENSE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiningProspectingLicenseModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the mining prospecting license persistence.
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

		MiningProspectingLicenseUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiningProspectingLicenseUtil.setPersistence(null);

		entityCache.removeCache(MiningProspectingLicenseImpl.class.getName());
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

	private static final String _SQL_SELECT_MININGPROSPECTINGLICENSE =
		"SELECT miningProspectingLicense FROM MiningProspectingLicense miningProspectingLicense";

	private static final String _SQL_SELECT_MININGPROSPECTINGLICENSE_WHERE =
		"SELECT miningProspectingLicense FROM MiningProspectingLicense miningProspectingLicense WHERE ";

	private static final String _SQL_COUNT_MININGPROSPECTINGLICENSE =
		"SELECT COUNT(miningProspectingLicense) FROM MiningProspectingLicense miningProspectingLicense";

	private static final String _SQL_COUNT_MININGPROSPECTINGLICENSE_WHERE =
		"SELECT COUNT(miningProspectingLicense) FROM MiningProspectingLicense miningProspectingLicense WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"miningProspectingLicense.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiningProspectingLicense exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MiningProspectingLicense exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MiningProspectingLicensePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}