/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence.impl;

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

import com.nbp.wra.application.form.service.exception.NoSuchRenewLicAbstractAndWaterException;
import com.nbp.wra.application.form.service.model.RenewLicAbstractAndWater;
import com.nbp.wra.application.form.service.model.RenewLicAbstractAndWaterTable;
import com.nbp.wra.application.form.service.model.impl.RenewLicAbstractAndWaterImpl;
import com.nbp.wra.application.form.service.model.impl.RenewLicAbstractAndWaterModelImpl;
import com.nbp.wra.application.form.service.service.persistence.RenewLicAbstractAndWaterPersistence;
import com.nbp.wra.application.form.service.service.persistence.RenewLicAbstractAndWaterUtil;
import com.nbp.wra.application.form.service.service.persistence.impl.constants.WRA_APPLICATIONPersistenceConstants;

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
 * The persistence implementation for the renew lic abstract and water service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = RenewLicAbstractAndWaterPersistence.class)
public class RenewLicAbstractAndWaterPersistenceImpl
	extends BasePersistenceImpl<RenewLicAbstractAndWater>
	implements RenewLicAbstractAndWaterPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RenewLicAbstractAndWaterUtil</code> to access the renew lic abstract and water persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RenewLicAbstractAndWaterImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetWRA_By_Id;
	private FinderPath _finderPathCountBygetWRA_By_Id;

	/**
	 * Returns the renew lic abstract and water where wraApplicationId = &#63; or throws a <code>NoSuchRenewLicAbstractAndWaterException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching renew lic abstract and water
	 * @throws NoSuchRenewLicAbstractAndWaterException if a matching renew lic abstract and water could not be found
	 */
	@Override
	public RenewLicAbstractAndWater findBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchRenewLicAbstractAndWaterException {

		RenewLicAbstractAndWater renewLicAbstractAndWater = fetchBygetWRA_By_Id(
			wraApplicationId);

		if (renewLicAbstractAndWater == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("wraApplicationId=");
			sb.append(wraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchRenewLicAbstractAndWaterException(sb.toString());
		}

		return renewLicAbstractAndWater;
	}

	/**
	 * Returns the renew lic abstract and water where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching renew lic abstract and water, or <code>null</code> if a matching renew lic abstract and water could not be found
	 */
	@Override
	public RenewLicAbstractAndWater fetchBygetWRA_By_Id(long wraApplicationId) {
		return fetchBygetWRA_By_Id(wraApplicationId, true);
	}

	/**
	 * Returns the renew lic abstract and water where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching renew lic abstract and water, or <code>null</code> if a matching renew lic abstract and water could not be found
	 */
	@Override
	public RenewLicAbstractAndWater fetchBygetWRA_By_Id(
		long wraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {wraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetWRA_By_Id, finderArgs, this);
		}

		if (result instanceof RenewLicAbstractAndWater) {
			RenewLicAbstractAndWater renewLicAbstractAndWater =
				(RenewLicAbstractAndWater)result;

			if (wraApplicationId !=
					renewLicAbstractAndWater.getWraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_RENEWLICABSTRACTANDWATER_WHERE);

			sb.append(_FINDER_COLUMN_GETWRA_BY_ID_WRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

				List<RenewLicAbstractAndWater> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetWRA_By_Id, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {wraApplicationId};
							}

							_log.warn(
								"RenewLicAbstractAndWaterPersistenceImpl.fetchBygetWRA_By_Id(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					RenewLicAbstractAndWater renewLicAbstractAndWater =
						list.get(0);

					result = renewLicAbstractAndWater;

					cacheResult(renewLicAbstractAndWater);
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
			return (RenewLicAbstractAndWater)result;
		}
	}

	/**
	 * Removes the renew lic abstract and water where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the renew lic abstract and water that was removed
	 */
	@Override
	public RenewLicAbstractAndWater removeBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchRenewLicAbstractAndWaterException {

		RenewLicAbstractAndWater renewLicAbstractAndWater = findBygetWRA_By_Id(
			wraApplicationId);

		return remove(renewLicAbstractAndWater);
	}

	/**
	 * Returns the number of renew lic abstract and waters where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching renew lic abstract and waters
	 */
	@Override
	public int countBygetWRA_By_Id(long wraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetWRA_By_Id;

		Object[] finderArgs = new Object[] {wraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_RENEWLICABSTRACTANDWATER_WHERE);

			sb.append(_FINDER_COLUMN_GETWRA_BY_ID_WRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

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

	private static final String _FINDER_COLUMN_GETWRA_BY_ID_WRAAPPLICATIONID_2 =
		"renewLicAbstractAndWater.wraApplicationId = ?";

	public RenewLicAbstractAndWaterPersistenceImpl() {
		setModelClass(RenewLicAbstractAndWater.class);

		setModelImplClass(RenewLicAbstractAndWaterImpl.class);
		setModelPKClass(long.class);

		setTable(RenewLicAbstractAndWaterTable.INSTANCE);
	}

	/**
	 * Caches the renew lic abstract and water in the entity cache if it is enabled.
	 *
	 * @param renewLicAbstractAndWater the renew lic abstract and water
	 */
	@Override
	public void cacheResult(RenewLicAbstractAndWater renewLicAbstractAndWater) {
		entityCache.putResult(
			RenewLicAbstractAndWaterImpl.class,
			renewLicAbstractAndWater.getPrimaryKey(), renewLicAbstractAndWater);

		finderCache.putResult(
			_finderPathFetchBygetWRA_By_Id,
			new Object[] {renewLicAbstractAndWater.getWraApplicationId()},
			renewLicAbstractAndWater);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the renew lic abstract and waters in the entity cache if it is enabled.
	 *
	 * @param renewLicAbstractAndWaters the renew lic abstract and waters
	 */
	@Override
	public void cacheResult(
		List<RenewLicAbstractAndWater> renewLicAbstractAndWaters) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (renewLicAbstractAndWaters.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (RenewLicAbstractAndWater renewLicAbstractAndWater :
				renewLicAbstractAndWaters) {

			if (entityCache.getResult(
					RenewLicAbstractAndWaterImpl.class,
					renewLicAbstractAndWater.getPrimaryKey()) == null) {

				cacheResult(renewLicAbstractAndWater);
			}
		}
	}

	/**
	 * Clears the cache for all renew lic abstract and waters.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RenewLicAbstractAndWaterImpl.class);

		finderCache.clearCache(RenewLicAbstractAndWaterImpl.class);
	}

	/**
	 * Clears the cache for the renew lic abstract and water.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RenewLicAbstractAndWater renewLicAbstractAndWater) {
		entityCache.removeResult(
			RenewLicAbstractAndWaterImpl.class, renewLicAbstractAndWater);
	}

	@Override
	public void clearCache(
		List<RenewLicAbstractAndWater> renewLicAbstractAndWaters) {

		for (RenewLicAbstractAndWater renewLicAbstractAndWater :
				renewLicAbstractAndWaters) {

			entityCache.removeResult(
				RenewLicAbstractAndWaterImpl.class, renewLicAbstractAndWater);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(RenewLicAbstractAndWaterImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				RenewLicAbstractAndWaterImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		RenewLicAbstractAndWaterModelImpl renewLicAbstractAndWaterModelImpl) {

		Object[] args = new Object[] {
			renewLicAbstractAndWaterModelImpl.getWraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetWRA_By_Id, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetWRA_By_Id, args,
			renewLicAbstractAndWaterModelImpl);
	}

	/**
	 * Creates a new renew lic abstract and water with the primary key. Does not add the renew lic abstract and water to the database.
	 *
	 * @param renewLicAbstractAndWaterId the primary key for the new renew lic abstract and water
	 * @return the new renew lic abstract and water
	 */
	@Override
	public RenewLicAbstractAndWater create(long renewLicAbstractAndWaterId) {
		RenewLicAbstractAndWater renewLicAbstractAndWater =
			new RenewLicAbstractAndWaterImpl();

		renewLicAbstractAndWater.setNew(true);
		renewLicAbstractAndWater.setPrimaryKey(renewLicAbstractAndWaterId);

		renewLicAbstractAndWater.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return renewLicAbstractAndWater;
	}

	/**
	 * Removes the renew lic abstract and water with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param renewLicAbstractAndWaterId the primary key of the renew lic abstract and water
	 * @return the renew lic abstract and water that was removed
	 * @throws NoSuchRenewLicAbstractAndWaterException if a renew lic abstract and water with the primary key could not be found
	 */
	@Override
	public RenewLicAbstractAndWater remove(long renewLicAbstractAndWaterId)
		throws NoSuchRenewLicAbstractAndWaterException {

		return remove((Serializable)renewLicAbstractAndWaterId);
	}

	/**
	 * Removes the renew lic abstract and water with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the renew lic abstract and water
	 * @return the renew lic abstract and water that was removed
	 * @throws NoSuchRenewLicAbstractAndWaterException if a renew lic abstract and water with the primary key could not be found
	 */
	@Override
	public RenewLicAbstractAndWater remove(Serializable primaryKey)
		throws NoSuchRenewLicAbstractAndWaterException {

		Session session = null;

		try {
			session = openSession();

			RenewLicAbstractAndWater renewLicAbstractAndWater =
				(RenewLicAbstractAndWater)session.get(
					RenewLicAbstractAndWaterImpl.class, primaryKey);

			if (renewLicAbstractAndWater == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRenewLicAbstractAndWaterException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(renewLicAbstractAndWater);
		}
		catch (NoSuchRenewLicAbstractAndWaterException noSuchEntityException) {
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
	protected RenewLicAbstractAndWater removeImpl(
		RenewLicAbstractAndWater renewLicAbstractAndWater) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(renewLicAbstractAndWater)) {
				renewLicAbstractAndWater =
					(RenewLicAbstractAndWater)session.get(
						RenewLicAbstractAndWaterImpl.class,
						renewLicAbstractAndWater.getPrimaryKeyObj());
			}

			if (renewLicAbstractAndWater != null) {
				session.delete(renewLicAbstractAndWater);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (renewLicAbstractAndWater != null) {
			clearCache(renewLicAbstractAndWater);
		}

		return renewLicAbstractAndWater;
	}

	@Override
	public RenewLicAbstractAndWater updateImpl(
		RenewLicAbstractAndWater renewLicAbstractAndWater) {

		boolean isNew = renewLicAbstractAndWater.isNew();

		if (!(renewLicAbstractAndWater instanceof
				RenewLicAbstractAndWaterModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(renewLicAbstractAndWater.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					renewLicAbstractAndWater);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in renewLicAbstractAndWater proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom RenewLicAbstractAndWater implementation " +
					renewLicAbstractAndWater.getClass());
		}

		RenewLicAbstractAndWaterModelImpl renewLicAbstractAndWaterModelImpl =
			(RenewLicAbstractAndWaterModelImpl)renewLicAbstractAndWater;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (renewLicAbstractAndWater.getCreateDate() == null)) {
			if (serviceContext == null) {
				renewLicAbstractAndWater.setCreateDate(date);
			}
			else {
				renewLicAbstractAndWater.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!renewLicAbstractAndWaterModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				renewLicAbstractAndWater.setModifiedDate(date);
			}
			else {
				renewLicAbstractAndWater.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(renewLicAbstractAndWater);
			}
			else {
				renewLicAbstractAndWater =
					(RenewLicAbstractAndWater)session.merge(
						renewLicAbstractAndWater);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			RenewLicAbstractAndWaterImpl.class,
			renewLicAbstractAndWaterModelImpl, false, true);

		cacheUniqueFindersCache(renewLicAbstractAndWaterModelImpl);

		if (isNew) {
			renewLicAbstractAndWater.setNew(false);
		}

		renewLicAbstractAndWater.resetOriginalValues();

		return renewLicAbstractAndWater;
	}

	/**
	 * Returns the renew lic abstract and water with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the renew lic abstract and water
	 * @return the renew lic abstract and water
	 * @throws NoSuchRenewLicAbstractAndWaterException if a renew lic abstract and water with the primary key could not be found
	 */
	@Override
	public RenewLicAbstractAndWater findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRenewLicAbstractAndWaterException {

		RenewLicAbstractAndWater renewLicAbstractAndWater = fetchByPrimaryKey(
			primaryKey);

		if (renewLicAbstractAndWater == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRenewLicAbstractAndWaterException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return renewLicAbstractAndWater;
	}

	/**
	 * Returns the renew lic abstract and water with the primary key or throws a <code>NoSuchRenewLicAbstractAndWaterException</code> if it could not be found.
	 *
	 * @param renewLicAbstractAndWaterId the primary key of the renew lic abstract and water
	 * @return the renew lic abstract and water
	 * @throws NoSuchRenewLicAbstractAndWaterException if a renew lic abstract and water with the primary key could not be found
	 */
	@Override
	public RenewLicAbstractAndWater findByPrimaryKey(
			long renewLicAbstractAndWaterId)
		throws NoSuchRenewLicAbstractAndWaterException {

		return findByPrimaryKey((Serializable)renewLicAbstractAndWaterId);
	}

	/**
	 * Returns the renew lic abstract and water with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param renewLicAbstractAndWaterId the primary key of the renew lic abstract and water
	 * @return the renew lic abstract and water, or <code>null</code> if a renew lic abstract and water with the primary key could not be found
	 */
	@Override
	public RenewLicAbstractAndWater fetchByPrimaryKey(
		long renewLicAbstractAndWaterId) {

		return fetchByPrimaryKey((Serializable)renewLicAbstractAndWaterId);
	}

	/**
	 * Returns all the renew lic abstract and waters.
	 *
	 * @return the renew lic abstract and waters
	 */
	@Override
	public List<RenewLicAbstractAndWater> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the renew lic abstract and waters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RenewLicAbstractAndWaterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of renew lic abstract and waters
	 * @param end the upper bound of the range of renew lic abstract and waters (not inclusive)
	 * @return the range of renew lic abstract and waters
	 */
	@Override
	public List<RenewLicAbstractAndWater> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the renew lic abstract and waters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RenewLicAbstractAndWaterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of renew lic abstract and waters
	 * @param end the upper bound of the range of renew lic abstract and waters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of renew lic abstract and waters
	 */
	@Override
	public List<RenewLicAbstractAndWater> findAll(
		int start, int end,
		OrderByComparator<RenewLicAbstractAndWater> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the renew lic abstract and waters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RenewLicAbstractAndWaterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of renew lic abstract and waters
	 * @param end the upper bound of the range of renew lic abstract and waters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of renew lic abstract and waters
	 */
	@Override
	public List<RenewLicAbstractAndWater> findAll(
		int start, int end,
		OrderByComparator<RenewLicAbstractAndWater> orderByComparator,
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

		List<RenewLicAbstractAndWater> list = null;

		if (useFinderCache) {
			list = (List<RenewLicAbstractAndWater>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_RENEWLICABSTRACTANDWATER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_RENEWLICABSTRACTANDWATER;

				sql = sql.concat(
					RenewLicAbstractAndWaterModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<RenewLicAbstractAndWater>)QueryUtil.list(
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
	 * Removes all the renew lic abstract and waters from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RenewLicAbstractAndWater renewLicAbstractAndWater : findAll()) {
			remove(renewLicAbstractAndWater);
		}
	}

	/**
	 * Returns the number of renew lic abstract and waters.
	 *
	 * @return the number of renew lic abstract and waters
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
					_SQL_COUNT_RENEWLICABSTRACTANDWATER);

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
		return "renewLicAbstractAndWaterId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_RENEWLICABSTRACTANDWATER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return RenewLicAbstractAndWaterModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the renew lic abstract and water persistence.
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

		_finderPathFetchBygetWRA_By_Id = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetWRA_By_Id",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, true);

		_finderPathCountBygetWRA_By_Id = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetWRA_By_Id",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, false);

		RenewLicAbstractAndWaterUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		RenewLicAbstractAndWaterUtil.setPersistence(null);

		entityCache.removeCache(RenewLicAbstractAndWaterImpl.class.getName());
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_RENEWLICABSTRACTANDWATER =
		"SELECT renewLicAbstractAndWater FROM RenewLicAbstractAndWater renewLicAbstractAndWater";

	private static final String _SQL_SELECT_RENEWLICABSTRACTANDWATER_WHERE =
		"SELECT renewLicAbstractAndWater FROM RenewLicAbstractAndWater renewLicAbstractAndWater WHERE ";

	private static final String _SQL_COUNT_RENEWLICABSTRACTANDWATER =
		"SELECT COUNT(renewLicAbstractAndWater) FROM RenewLicAbstractAndWater renewLicAbstractAndWater";

	private static final String _SQL_COUNT_RENEWLICABSTRACTANDWATER_WHERE =
		"SELECT COUNT(renewLicAbstractAndWater) FROM RenewLicAbstractAndWater renewLicAbstractAndWater WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"renewLicAbstractAndWater.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No RenewLicAbstractAndWater exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No RenewLicAbstractAndWater exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		RenewLicAbstractAndWaterPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}