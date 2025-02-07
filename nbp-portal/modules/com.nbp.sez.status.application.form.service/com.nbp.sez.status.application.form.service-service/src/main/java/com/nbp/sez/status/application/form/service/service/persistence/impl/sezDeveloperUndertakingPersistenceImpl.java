/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence.impl;

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

import com.nbp.sez.status.application.form.service.exception.NoSuchsezDeveloperUndertakingException;
import com.nbp.sez.status.application.form.service.model.impl.sezDeveloperUndertakingImpl;
import com.nbp.sez.status.application.form.service.model.impl.sezDeveloperUndertakingModelImpl;
import com.nbp.sez.status.application.form.service.model.sezDeveloperUndertaking;
import com.nbp.sez.status.application.form.service.model.sezDeveloperUndertakingTable;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;
import com.nbp.sez.status.application.form.service.service.persistence.sezDeveloperUndertakingPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.sezDeveloperUndertakingUtil;

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
 * The persistence implementation for the sez developer undertaking service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = sezDeveloperUndertakingPersistence.class)
public class sezDeveloperUndertakingPersistenceImpl
	extends BasePersistenceImpl<sezDeveloperUndertaking>
	implements sezDeveloperUndertakingPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>sezDeveloperUndertakingUtil</code> to access the sez developer undertaking persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		sezDeveloperUndertakingImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetSezStatusByAppId;
	private FinderPath _finderPathCountBygetSezStatusByAppId;

	/**
	 * Returns the sez developer undertaking where sezStatusApplicationId = &#63; or throws a <code>NoSuchsezDeveloperUndertakingException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez developer undertaking
	 * @throws NoSuchsezDeveloperUndertakingException if a matching sez developer undertaking could not be found
	 */
	@Override
	public sezDeveloperUndertaking findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchsezDeveloperUndertakingException {

		sezDeveloperUndertaking sezDeveloperUndertaking =
			fetchBygetSezStatusByAppId(sezStatusApplicationId);

		if (sezDeveloperUndertaking == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchsezDeveloperUndertakingException(sb.toString());
		}

		return sezDeveloperUndertaking;
	}

	/**
	 * Returns the sez developer undertaking where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez developer undertaking, or <code>null</code> if a matching sez developer undertaking could not be found
	 */
	@Override
	public sezDeveloperUndertaking fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez developer undertaking where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez developer undertaking, or <code>null</code> if a matching sez developer undertaking could not be found
	 */
	@Override
	public sezDeveloperUndertaking fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {sezStatusApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSezStatusByAppId, finderArgs, this);
		}

		if (result instanceof sezDeveloperUndertaking) {
			sezDeveloperUndertaking sezDeveloperUndertaking =
				(sezDeveloperUndertaking)result;

			if (sezStatusApplicationId !=
					sezDeveloperUndertaking.getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZDEVELOPERUNDERTAKING_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<sezDeveloperUndertaking> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSezStatusByAppId, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									sezStatusApplicationId
								};
							}

							_log.warn(
								"sezDeveloperUndertakingPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					sezDeveloperUndertaking sezDeveloperUndertaking = list.get(
						0);

					result = sezDeveloperUndertaking;

					cacheResult(sezDeveloperUndertaking);
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
			return (sezDeveloperUndertaking)result;
		}
	}

	/**
	 * Removes the sez developer undertaking where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez developer undertaking that was removed
	 */
	@Override
	public sezDeveloperUndertaking removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchsezDeveloperUndertakingException {

		sezDeveloperUndertaking sezDeveloperUndertaking =
			findBygetSezStatusByAppId(sezStatusApplicationId);

		return remove(sezDeveloperUndertaking);
	}

	/**
	 * Returns the number of sez developer undertakings where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez developer undertakings
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZDEVELOPERUNDERTAKING_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

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
		_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2 =
			"sezDeveloperUndertaking.sezStatusApplicationId = ?";

	public sezDeveloperUndertakingPersistenceImpl() {
		setModelClass(sezDeveloperUndertaking.class);

		setModelImplClass(sezDeveloperUndertakingImpl.class);
		setModelPKClass(long.class);

		setTable(sezDeveloperUndertakingTable.INSTANCE);
	}

	/**
	 * Caches the sez developer undertaking in the entity cache if it is enabled.
	 *
	 * @param sezDeveloperUndertaking the sez developer undertaking
	 */
	@Override
	public void cacheResult(sezDeveloperUndertaking sezDeveloperUndertaking) {
		entityCache.putResult(
			sezDeveloperUndertakingImpl.class,
			sezDeveloperUndertaking.getPrimaryKey(), sezDeveloperUndertaking);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {sezDeveloperUndertaking.getSezStatusApplicationId()},
			sezDeveloperUndertaking);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez developer undertakings in the entity cache if it is enabled.
	 *
	 * @param sezDeveloperUndertakings the sez developer undertakings
	 */
	@Override
	public void cacheResult(
		List<sezDeveloperUndertaking> sezDeveloperUndertakings) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezDeveloperUndertakings.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (sezDeveloperUndertaking sezDeveloperUndertaking :
				sezDeveloperUndertakings) {

			if (entityCache.getResult(
					sezDeveloperUndertakingImpl.class,
					sezDeveloperUndertaking.getPrimaryKey()) == null) {

				cacheResult(sezDeveloperUndertaking);
			}
		}
	}

	/**
	 * Clears the cache for all sez developer undertakings.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(sezDeveloperUndertakingImpl.class);

		finderCache.clearCache(sezDeveloperUndertakingImpl.class);
	}

	/**
	 * Clears the cache for the sez developer undertaking.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(sezDeveloperUndertaking sezDeveloperUndertaking) {
		entityCache.removeResult(
			sezDeveloperUndertakingImpl.class, sezDeveloperUndertaking);
	}

	@Override
	public void clearCache(
		List<sezDeveloperUndertaking> sezDeveloperUndertakings) {

		for (sezDeveloperUndertaking sezDeveloperUndertaking :
				sezDeveloperUndertakings) {

			entityCache.removeResult(
				sezDeveloperUndertakingImpl.class, sezDeveloperUndertaking);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(sezDeveloperUndertakingImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				sezDeveloperUndertakingImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		sezDeveloperUndertakingModelImpl sezDeveloperUndertakingModelImpl) {

		Object[] args = new Object[] {
			sezDeveloperUndertakingModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezDeveloperUndertakingModelImpl);
	}

	/**
	 * Creates a new sez developer undertaking with the primary key. Does not add the sez developer undertaking to the database.
	 *
	 * @param sezDeveloperUndertakingId the primary key for the new sez developer undertaking
	 * @return the new sez developer undertaking
	 */
	@Override
	public sezDeveloperUndertaking create(long sezDeveloperUndertakingId) {
		sezDeveloperUndertaking sezDeveloperUndertaking =
			new sezDeveloperUndertakingImpl();

		sezDeveloperUndertaking.setNew(true);
		sezDeveloperUndertaking.setPrimaryKey(sezDeveloperUndertakingId);

		sezDeveloperUndertaking.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sezDeveloperUndertaking;
	}

	/**
	 * Removes the sez developer undertaking with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDeveloperUndertakingId the primary key of the sez developer undertaking
	 * @return the sez developer undertaking that was removed
	 * @throws NoSuchsezDeveloperUndertakingException if a sez developer undertaking with the primary key could not be found
	 */
	@Override
	public sezDeveloperUndertaking remove(long sezDeveloperUndertakingId)
		throws NoSuchsezDeveloperUndertakingException {

		return remove((Serializable)sezDeveloperUndertakingId);
	}

	/**
	 * Removes the sez developer undertaking with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez developer undertaking
	 * @return the sez developer undertaking that was removed
	 * @throws NoSuchsezDeveloperUndertakingException if a sez developer undertaking with the primary key could not be found
	 */
	@Override
	public sezDeveloperUndertaking remove(Serializable primaryKey)
		throws NoSuchsezDeveloperUndertakingException {

		Session session = null;

		try {
			session = openSession();

			sezDeveloperUndertaking sezDeveloperUndertaking =
				(sezDeveloperUndertaking)session.get(
					sezDeveloperUndertakingImpl.class, primaryKey);

			if (sezDeveloperUndertaking == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchsezDeveloperUndertakingException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezDeveloperUndertaking);
		}
		catch (NoSuchsezDeveloperUndertakingException noSuchEntityException) {
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
	protected sezDeveloperUndertaking removeImpl(
		sezDeveloperUndertaking sezDeveloperUndertaking) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezDeveloperUndertaking)) {
				sezDeveloperUndertaking = (sezDeveloperUndertaking)session.get(
					sezDeveloperUndertakingImpl.class,
					sezDeveloperUndertaking.getPrimaryKeyObj());
			}

			if (sezDeveloperUndertaking != null) {
				session.delete(sezDeveloperUndertaking);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezDeveloperUndertaking != null) {
			clearCache(sezDeveloperUndertaking);
		}

		return sezDeveloperUndertaking;
	}

	@Override
	public sezDeveloperUndertaking updateImpl(
		sezDeveloperUndertaking sezDeveloperUndertaking) {

		boolean isNew = sezDeveloperUndertaking.isNew();

		if (!(sezDeveloperUndertaking instanceof
				sezDeveloperUndertakingModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezDeveloperUndertaking.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezDeveloperUndertaking);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezDeveloperUndertaking proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom sezDeveloperUndertaking implementation " +
					sezDeveloperUndertaking.getClass());
		}

		sezDeveloperUndertakingModelImpl sezDeveloperUndertakingModelImpl =
			(sezDeveloperUndertakingModelImpl)sezDeveloperUndertaking;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezDeveloperUndertaking.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezDeveloperUndertaking.setCreateDate(date);
			}
			else {
				sezDeveloperUndertaking.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezDeveloperUndertakingModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezDeveloperUndertaking.setModifiedDate(date);
			}
			else {
				sezDeveloperUndertaking.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezDeveloperUndertaking);
			}
			else {
				sezDeveloperUndertaking =
					(sezDeveloperUndertaking)session.merge(
						sezDeveloperUndertaking);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			sezDeveloperUndertakingImpl.class, sezDeveloperUndertakingModelImpl,
			false, true);

		cacheUniqueFindersCache(sezDeveloperUndertakingModelImpl);

		if (isNew) {
			sezDeveloperUndertaking.setNew(false);
		}

		sezDeveloperUndertaking.resetOriginalValues();

		return sezDeveloperUndertaking;
	}

	/**
	 * Returns the sez developer undertaking with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez developer undertaking
	 * @return the sez developer undertaking
	 * @throws NoSuchsezDeveloperUndertakingException if a sez developer undertaking with the primary key could not be found
	 */
	@Override
	public sezDeveloperUndertaking findByPrimaryKey(Serializable primaryKey)
		throws NoSuchsezDeveloperUndertakingException {

		sezDeveloperUndertaking sezDeveloperUndertaking = fetchByPrimaryKey(
			primaryKey);

		if (sezDeveloperUndertaking == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchsezDeveloperUndertakingException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezDeveloperUndertaking;
	}

	/**
	 * Returns the sez developer undertaking with the primary key or throws a <code>NoSuchsezDeveloperUndertakingException</code> if it could not be found.
	 *
	 * @param sezDeveloperUndertakingId the primary key of the sez developer undertaking
	 * @return the sez developer undertaking
	 * @throws NoSuchsezDeveloperUndertakingException if a sez developer undertaking with the primary key could not be found
	 */
	@Override
	public sezDeveloperUndertaking findByPrimaryKey(
			long sezDeveloperUndertakingId)
		throws NoSuchsezDeveloperUndertakingException {

		return findByPrimaryKey((Serializable)sezDeveloperUndertakingId);
	}

	/**
	 * Returns the sez developer undertaking with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDeveloperUndertakingId the primary key of the sez developer undertaking
	 * @return the sez developer undertaking, or <code>null</code> if a sez developer undertaking with the primary key could not be found
	 */
	@Override
	public sezDeveloperUndertaking fetchByPrimaryKey(
		long sezDeveloperUndertakingId) {

		return fetchByPrimaryKey((Serializable)sezDeveloperUndertakingId);
	}

	/**
	 * Returns all the sez developer undertakings.
	 *
	 * @return the sez developer undertakings
	 */
	@Override
	public List<sezDeveloperUndertaking> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez developer undertakings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sezDeveloperUndertakingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez developer undertakings
	 * @param end the upper bound of the range of sez developer undertakings (not inclusive)
	 * @return the range of sez developer undertakings
	 */
	@Override
	public List<sezDeveloperUndertaking> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez developer undertakings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sezDeveloperUndertakingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez developer undertakings
	 * @param end the upper bound of the range of sez developer undertakings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez developer undertakings
	 */
	@Override
	public List<sezDeveloperUndertaking> findAll(
		int start, int end,
		OrderByComparator<sezDeveloperUndertaking> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez developer undertakings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sezDeveloperUndertakingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez developer undertakings
	 * @param end the upper bound of the range of sez developer undertakings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez developer undertakings
	 */
	@Override
	public List<sezDeveloperUndertaking> findAll(
		int start, int end,
		OrderByComparator<sezDeveloperUndertaking> orderByComparator,
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

		List<sezDeveloperUndertaking> list = null;

		if (useFinderCache) {
			list = (List<sezDeveloperUndertaking>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZDEVELOPERUNDERTAKING);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZDEVELOPERUNDERTAKING;

				sql = sql.concat(
					sezDeveloperUndertakingModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<sezDeveloperUndertaking>)QueryUtil.list(
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
	 * Removes all the sez developer undertakings from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (sezDeveloperUndertaking sezDeveloperUndertaking : findAll()) {
			remove(sezDeveloperUndertaking);
		}
	}

	/**
	 * Returns the number of sez developer undertakings.
	 *
	 * @return the number of sez developer undertakings
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
					_SQL_COUNT_SEZDEVELOPERUNDERTAKING);

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
		return "sezDeveloperUndertakingId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZDEVELOPERUNDERTAKING;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return sezDeveloperUndertakingModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez developer undertaking persistence.
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

		_finderPathFetchBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSezStatusByAppId",
			new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		sezDeveloperUndertakingUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		sezDeveloperUndertakingUtil.setPersistence(null);

		entityCache.removeCache(sezDeveloperUndertakingImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZDEVELOPERUNDERTAKING =
		"SELECT sezDeveloperUndertaking FROM sezDeveloperUndertaking sezDeveloperUndertaking";

	private static final String _SQL_SELECT_SEZDEVELOPERUNDERTAKING_WHERE =
		"SELECT sezDeveloperUndertaking FROM sezDeveloperUndertaking sezDeveloperUndertaking WHERE ";

	private static final String _SQL_COUNT_SEZDEVELOPERUNDERTAKING =
		"SELECT COUNT(sezDeveloperUndertaking) FROM sezDeveloperUndertaking sezDeveloperUndertaking";

	private static final String _SQL_COUNT_SEZDEVELOPERUNDERTAKING_WHERE =
		"SELECT COUNT(sezDeveloperUndertaking) FROM sezDeveloperUndertaking sezDeveloperUndertaking WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezDeveloperUndertaking.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No sezDeveloperUndertaking exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No sezDeveloperUndertaking exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		sezDeveloperUndertakingPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}