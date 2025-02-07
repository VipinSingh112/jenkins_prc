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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezStatusWorkFromHomeException;
import com.nbp.sez.status.application.form.service.model.SezStatusWorkFromHome;
import com.nbp.sez.status.application.form.service.model.SezStatusWorkFromHomeTable;
import com.nbp.sez.status.application.form.service.model.impl.SezStatusWorkFromHomeImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezStatusWorkFromHomeModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezStatusWorkFromHomePersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezStatusWorkFromHomeUtil;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;

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
 * The persistence implementation for the sez status work from home service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezStatusWorkFromHomePersistence.class)
public class SezStatusWorkFromHomePersistenceImpl
	extends BasePersistenceImpl<SezStatusWorkFromHome>
	implements SezStatusWorkFromHomePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezStatusWorkFromHomeUtil</code> to access the sez status work from home persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezStatusWorkFromHomeImpl.class.getName();

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
	 * Returns the sez status work from home where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezStatusWorkFromHomeException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status work from home
	 * @throws NoSuchSezStatusWorkFromHomeException if a matching sez status work from home could not be found
	 */
	@Override
	public SezStatusWorkFromHome findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezStatusWorkFromHomeException {

		SezStatusWorkFromHome sezStatusWorkFromHome =
			fetchBygetSezStatusByAppId(sezStatusApplicationId);

		if (sezStatusWorkFromHome == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezStatusWorkFromHomeException(sb.toString());
		}

		return sezStatusWorkFromHome;
	}

	/**
	 * Returns the sez status work from home where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status work from home, or <code>null</code> if a matching sez status work from home could not be found
	 */
	@Override
	public SezStatusWorkFromHome fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez status work from home where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status work from home, or <code>null</code> if a matching sez status work from home could not be found
	 */
	@Override
	public SezStatusWorkFromHome fetchBygetSezStatusByAppId(
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

		if (result instanceof SezStatusWorkFromHome) {
			SezStatusWorkFromHome sezStatusWorkFromHome =
				(SezStatusWorkFromHome)result;

			if (sezStatusApplicationId !=
					sezStatusWorkFromHome.getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZSTATUSWORKFROMHOME_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezStatusWorkFromHome> list = query.list();

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
								"SezStatusWorkFromHomePersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezStatusWorkFromHome sezStatusWorkFromHome = list.get(0);

					result = sezStatusWorkFromHome;

					cacheResult(sezStatusWorkFromHome);
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
			return (SezStatusWorkFromHome)result;
		}
	}

	/**
	 * Removes the sez status work from home where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez status work from home that was removed
	 */
	@Override
	public SezStatusWorkFromHome removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezStatusWorkFromHomeException {

		SezStatusWorkFromHome sezStatusWorkFromHome = findBygetSezStatusByAppId(
			sezStatusApplicationId);

		return remove(sezStatusWorkFromHome);
	}

	/**
	 * Returns the number of sez status work from homes where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez status work from homes
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSWORKFROMHOME_WHERE);

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
			"sezStatusWorkFromHome.sezStatusApplicationId = ?";

	public SezStatusWorkFromHomePersistenceImpl() {
		setModelClass(SezStatusWorkFromHome.class);

		setModelImplClass(SezStatusWorkFromHomeImpl.class);
		setModelPKClass(long.class);

		setTable(SezStatusWorkFromHomeTable.INSTANCE);
	}

	/**
	 * Caches the sez status work from home in the entity cache if it is enabled.
	 *
	 * @param sezStatusWorkFromHome the sez status work from home
	 */
	@Override
	public void cacheResult(SezStatusWorkFromHome sezStatusWorkFromHome) {
		entityCache.putResult(
			SezStatusWorkFromHomeImpl.class,
			sezStatusWorkFromHome.getPrimaryKey(), sezStatusWorkFromHome);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {sezStatusWorkFromHome.getSezStatusApplicationId()},
			sezStatusWorkFromHome);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez status work from homes in the entity cache if it is enabled.
	 *
	 * @param sezStatusWorkFromHomes the sez status work from homes
	 */
	@Override
	public void cacheResult(
		List<SezStatusWorkFromHome> sezStatusWorkFromHomes) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezStatusWorkFromHomes.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezStatusWorkFromHome sezStatusWorkFromHome :
				sezStatusWorkFromHomes) {

			if (entityCache.getResult(
					SezStatusWorkFromHomeImpl.class,
					sezStatusWorkFromHome.getPrimaryKey()) == null) {

				cacheResult(sezStatusWorkFromHome);
			}
		}
	}

	/**
	 * Clears the cache for all sez status work from homes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezStatusWorkFromHomeImpl.class);

		finderCache.clearCache(SezStatusWorkFromHomeImpl.class);
	}

	/**
	 * Clears the cache for the sez status work from home.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezStatusWorkFromHome sezStatusWorkFromHome) {
		entityCache.removeResult(
			SezStatusWorkFromHomeImpl.class, sezStatusWorkFromHome);
	}

	@Override
	public void clearCache(List<SezStatusWorkFromHome> sezStatusWorkFromHomes) {
		for (SezStatusWorkFromHome sezStatusWorkFromHome :
				sezStatusWorkFromHomes) {

			entityCache.removeResult(
				SezStatusWorkFromHomeImpl.class, sezStatusWorkFromHome);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezStatusWorkFromHomeImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezStatusWorkFromHomeImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezStatusWorkFromHomeModelImpl sezStatusWorkFromHomeModelImpl) {

		Object[] args = new Object[] {
			sezStatusWorkFromHomeModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezStatusWorkFromHomeModelImpl);
	}

	/**
	 * Creates a new sez status work from home with the primary key. Does not add the sez status work from home to the database.
	 *
	 * @param sezStatusWorkFromHomeId the primary key for the new sez status work from home
	 * @return the new sez status work from home
	 */
	@Override
	public SezStatusWorkFromHome create(long sezStatusWorkFromHomeId) {
		SezStatusWorkFromHome sezStatusWorkFromHome =
			new SezStatusWorkFromHomeImpl();

		sezStatusWorkFromHome.setNew(true);
		sezStatusWorkFromHome.setPrimaryKey(sezStatusWorkFromHomeId);

		sezStatusWorkFromHome.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sezStatusWorkFromHome;
	}

	/**
	 * Removes the sez status work from home with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStatusWorkFromHomeId the primary key of the sez status work from home
	 * @return the sez status work from home that was removed
	 * @throws NoSuchSezStatusWorkFromHomeException if a sez status work from home with the primary key could not be found
	 */
	@Override
	public SezStatusWorkFromHome remove(long sezStatusWorkFromHomeId)
		throws NoSuchSezStatusWorkFromHomeException {

		return remove((Serializable)sezStatusWorkFromHomeId);
	}

	/**
	 * Removes the sez status work from home with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez status work from home
	 * @return the sez status work from home that was removed
	 * @throws NoSuchSezStatusWorkFromHomeException if a sez status work from home with the primary key could not be found
	 */
	@Override
	public SezStatusWorkFromHome remove(Serializable primaryKey)
		throws NoSuchSezStatusWorkFromHomeException {

		Session session = null;

		try {
			session = openSession();

			SezStatusWorkFromHome sezStatusWorkFromHome =
				(SezStatusWorkFromHome)session.get(
					SezStatusWorkFromHomeImpl.class, primaryKey);

			if (sezStatusWorkFromHome == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezStatusWorkFromHomeException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezStatusWorkFromHome);
		}
		catch (NoSuchSezStatusWorkFromHomeException noSuchEntityException) {
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
	protected SezStatusWorkFromHome removeImpl(
		SezStatusWorkFromHome sezStatusWorkFromHome) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezStatusWorkFromHome)) {
				sezStatusWorkFromHome = (SezStatusWorkFromHome)session.get(
					SezStatusWorkFromHomeImpl.class,
					sezStatusWorkFromHome.getPrimaryKeyObj());
			}

			if (sezStatusWorkFromHome != null) {
				session.delete(sezStatusWorkFromHome);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezStatusWorkFromHome != null) {
			clearCache(sezStatusWorkFromHome);
		}

		return sezStatusWorkFromHome;
	}

	@Override
	public SezStatusWorkFromHome updateImpl(
		SezStatusWorkFromHome sezStatusWorkFromHome) {

		boolean isNew = sezStatusWorkFromHome.isNew();

		if (!(sezStatusWorkFromHome instanceof
				SezStatusWorkFromHomeModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezStatusWorkFromHome.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezStatusWorkFromHome);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezStatusWorkFromHome proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezStatusWorkFromHome implementation " +
					sezStatusWorkFromHome.getClass());
		}

		SezStatusWorkFromHomeModelImpl sezStatusWorkFromHomeModelImpl =
			(SezStatusWorkFromHomeModelImpl)sezStatusWorkFromHome;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezStatusWorkFromHome.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezStatusWorkFromHome.setCreateDate(date);
			}
			else {
				sezStatusWorkFromHome.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezStatusWorkFromHomeModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezStatusWorkFromHome.setModifiedDate(date);
			}
			else {
				sezStatusWorkFromHome.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezStatusWorkFromHome);
			}
			else {
				sezStatusWorkFromHome = (SezStatusWorkFromHome)session.merge(
					sezStatusWorkFromHome);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezStatusWorkFromHomeImpl.class, sezStatusWorkFromHomeModelImpl,
			false, true);

		cacheUniqueFindersCache(sezStatusWorkFromHomeModelImpl);

		if (isNew) {
			sezStatusWorkFromHome.setNew(false);
		}

		sezStatusWorkFromHome.resetOriginalValues();

		return sezStatusWorkFromHome;
	}

	/**
	 * Returns the sez status work from home with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez status work from home
	 * @return the sez status work from home
	 * @throws NoSuchSezStatusWorkFromHomeException if a sez status work from home with the primary key could not be found
	 */
	@Override
	public SezStatusWorkFromHome findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezStatusWorkFromHomeException {

		SezStatusWorkFromHome sezStatusWorkFromHome = fetchByPrimaryKey(
			primaryKey);

		if (sezStatusWorkFromHome == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezStatusWorkFromHomeException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezStatusWorkFromHome;
	}

	/**
	 * Returns the sez status work from home with the primary key or throws a <code>NoSuchSezStatusWorkFromHomeException</code> if it could not be found.
	 *
	 * @param sezStatusWorkFromHomeId the primary key of the sez status work from home
	 * @return the sez status work from home
	 * @throws NoSuchSezStatusWorkFromHomeException if a sez status work from home with the primary key could not be found
	 */
	@Override
	public SezStatusWorkFromHome findByPrimaryKey(long sezStatusWorkFromHomeId)
		throws NoSuchSezStatusWorkFromHomeException {

		return findByPrimaryKey((Serializable)sezStatusWorkFromHomeId);
	}

	/**
	 * Returns the sez status work from home with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStatusWorkFromHomeId the primary key of the sez status work from home
	 * @return the sez status work from home, or <code>null</code> if a sez status work from home with the primary key could not be found
	 */
	@Override
	public SezStatusWorkFromHome fetchByPrimaryKey(
		long sezStatusWorkFromHomeId) {

		return fetchByPrimaryKey((Serializable)sezStatusWorkFromHomeId);
	}

	/**
	 * Returns all the sez status work from homes.
	 *
	 * @return the sez status work from homes
	 */
	@Override
	public List<SezStatusWorkFromHome> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status work from homes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWorkFromHomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status work from homes
	 * @param end the upper bound of the range of sez status work from homes (not inclusive)
	 * @return the range of sez status work from homes
	 */
	@Override
	public List<SezStatusWorkFromHome> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status work from homes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWorkFromHomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status work from homes
	 * @param end the upper bound of the range of sez status work from homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status work from homes
	 */
	@Override
	public List<SezStatusWorkFromHome> findAll(
		int start, int end,
		OrderByComparator<SezStatusWorkFromHome> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status work from homes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWorkFromHomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status work from homes
	 * @param end the upper bound of the range of sez status work from homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status work from homes
	 */
	@Override
	public List<SezStatusWorkFromHome> findAll(
		int start, int end,
		OrderByComparator<SezStatusWorkFromHome> orderByComparator,
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

		List<SezStatusWorkFromHome> list = null;

		if (useFinderCache) {
			list = (List<SezStatusWorkFromHome>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZSTATUSWORKFROMHOME);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZSTATUSWORKFROMHOME;

				sql = sql.concat(SezStatusWorkFromHomeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezStatusWorkFromHome>)QueryUtil.list(
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
	 * Removes all the sez status work from homes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezStatusWorkFromHome sezStatusWorkFromHome : findAll()) {
			remove(sezStatusWorkFromHome);
		}
	}

	/**
	 * Returns the number of sez status work from homes.
	 *
	 * @return the number of sez status work from homes
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
					_SQL_COUNT_SEZSTATUSWORKFROMHOME);

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
		return "sezStatusWorkFromHomeId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZSTATUSWORKFROMHOME;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezStatusWorkFromHomeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez status work from home persistence.
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

		SezStatusWorkFromHomeUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezStatusWorkFromHomeUtil.setPersistence(null);

		entityCache.removeCache(SezStatusWorkFromHomeImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZSTATUSWORKFROMHOME =
		"SELECT sezStatusWorkFromHome FROM SezStatusWorkFromHome sezStatusWorkFromHome";

	private static final String _SQL_SELECT_SEZSTATUSWORKFROMHOME_WHERE =
		"SELECT sezStatusWorkFromHome FROM SezStatusWorkFromHome sezStatusWorkFromHome WHERE ";

	private static final String _SQL_COUNT_SEZSTATUSWORKFROMHOME =
		"SELECT COUNT(sezStatusWorkFromHome) FROM SezStatusWorkFromHome sezStatusWorkFromHome";

	private static final String _SQL_COUNT_SEZSTATUSWORKFROMHOME_WHERE =
		"SELECT COUNT(sezStatusWorkFromHome) FROM SezStatusWorkFromHome sezStatusWorkFromHome WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezStatusWorkFromHome.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezStatusWorkFromHome exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezStatusWorkFromHome exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezStatusWorkFromHomePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}