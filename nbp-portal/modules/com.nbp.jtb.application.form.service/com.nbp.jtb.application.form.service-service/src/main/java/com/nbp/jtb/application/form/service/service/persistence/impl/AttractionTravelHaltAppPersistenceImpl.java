/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
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
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionTravelHaltAppException;
import com.nbp.jtb.application.form.service.model.AttractionTravelHaltApp;
import com.nbp.jtb.application.form.service.model.AttractionTravelHaltAppTable;
import com.nbp.jtb.application.form.service.model.impl.AttractionTravelHaltAppImpl;
import com.nbp.jtb.application.form.service.model.impl.AttractionTravelHaltAppModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AttractionTravelHaltAppPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionTravelHaltAppUtil;
import com.nbp.jtb.application.form.service.service.persistence.impl.constants.JTB_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the attraction travel halt app service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AttractionTravelHaltAppPersistence.class)
public class AttractionTravelHaltAppPersistenceImpl
	extends BasePersistenceImpl<AttractionTravelHaltApp>
	implements AttractionTravelHaltAppPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AttractionTravelHaltAppUtil</code> to access the attraction travel halt app persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AttractionTravelHaltAppImpl.class.getName();

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
	 * Returns the attraction travel halt app where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionTravelHaltAppException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction travel halt app
	 * @throws NoSuchAttractionTravelHaltAppException if a matching attraction travel halt app could not be found
	 */
	@Override
	public AttractionTravelHaltApp findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionTravelHaltAppException {

		AttractionTravelHaltApp attractionTravelHaltApp =
			fetchBygetJTB_ByApplicationId(jtbApplicationId);

		if (attractionTravelHaltApp == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAttractionTravelHaltAppException(sb.toString());
		}

		return attractionTravelHaltApp;
	}

	/**
	 * Returns the attraction travel halt app where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction travel halt app, or <code>null</code> if a matching attraction travel halt app could not be found
	 */
	@Override
	public AttractionTravelHaltApp fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the attraction travel halt app where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction travel halt app, or <code>null</code> if a matching attraction travel halt app could not be found
	 */
	@Override
	public AttractionTravelHaltApp fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {jtbApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJTB_ByApplicationId, finderArgs, this);
		}

		if (result instanceof AttractionTravelHaltApp) {
			AttractionTravelHaltApp attractionTravelHaltApp =
				(AttractionTravelHaltApp)result;

			if (jtbApplicationId !=
					attractionTravelHaltApp.getJtbApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ATTRACTIONTRAVELHALTAPP_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AttractionTravelHaltApp> list = query.list();

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
								"AttractionTravelHaltAppPersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AttractionTravelHaltApp attractionTravelHaltApp = list.get(
						0);

					result = attractionTravelHaltApp;

					cacheResult(attractionTravelHaltApp);
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
			return (AttractionTravelHaltApp)result;
		}
	}

	/**
	 * Removes the attraction travel halt app where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction travel halt app that was removed
	 */
	@Override
	public AttractionTravelHaltApp removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionTravelHaltAppException {

		AttractionTravelHaltApp attractionTravelHaltApp =
			findBygetJTB_ByApplicationId(jtbApplicationId);

		return remove(attractionTravelHaltApp);
	}

	/**
	 * Returns the number of attraction travel halt apps where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction travel halt apps
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ATTRACTIONTRAVELHALTAPP_WHERE);

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
			"attractionTravelHaltApp.jtbApplicationId = ?";

	public AttractionTravelHaltAppPersistenceImpl() {
		setModelClass(AttractionTravelHaltApp.class);

		setModelImplClass(AttractionTravelHaltAppImpl.class);
		setModelPKClass(long.class);

		setTable(AttractionTravelHaltAppTable.INSTANCE);
	}

	/**
	 * Caches the attraction travel halt app in the entity cache if it is enabled.
	 *
	 * @param attractionTravelHaltApp the attraction travel halt app
	 */
	@Override
	public void cacheResult(AttractionTravelHaltApp attractionTravelHaltApp) {
		entityCache.putResult(
			AttractionTravelHaltAppImpl.class,
			attractionTravelHaltApp.getPrimaryKey(), attractionTravelHaltApp);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {attractionTravelHaltApp.getJtbApplicationId()},
			attractionTravelHaltApp);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the attraction travel halt apps in the entity cache if it is enabled.
	 *
	 * @param attractionTravelHaltApps the attraction travel halt apps
	 */
	@Override
	public void cacheResult(
		List<AttractionTravelHaltApp> attractionTravelHaltApps) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (attractionTravelHaltApps.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AttractionTravelHaltApp attractionTravelHaltApp :
				attractionTravelHaltApps) {

			if (entityCache.getResult(
					AttractionTravelHaltAppImpl.class,
					attractionTravelHaltApp.getPrimaryKey()) == null) {

				cacheResult(attractionTravelHaltApp);
			}
		}
	}

	/**
	 * Clears the cache for all attraction travel halt apps.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AttractionTravelHaltAppImpl.class);

		finderCache.clearCache(AttractionTravelHaltAppImpl.class);
	}

	/**
	 * Clears the cache for the attraction travel halt app.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AttractionTravelHaltApp attractionTravelHaltApp) {
		entityCache.removeResult(
			AttractionTravelHaltAppImpl.class, attractionTravelHaltApp);
	}

	@Override
	public void clearCache(
		List<AttractionTravelHaltApp> attractionTravelHaltApps) {

		for (AttractionTravelHaltApp attractionTravelHaltApp :
				attractionTravelHaltApps) {

			entityCache.removeResult(
				AttractionTravelHaltAppImpl.class, attractionTravelHaltApp);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AttractionTravelHaltAppImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AttractionTravelHaltAppImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AttractionTravelHaltAppModelImpl attractionTravelHaltAppModelImpl) {

		Object[] args = new Object[] {
			attractionTravelHaltAppModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			attractionTravelHaltAppModelImpl);
	}

	/**
	 * Creates a new attraction travel halt app with the primary key. Does not add the attraction travel halt app to the database.
	 *
	 * @param attractionTravelHaltAppId the primary key for the new attraction travel halt app
	 * @return the new attraction travel halt app
	 */
	@Override
	public AttractionTravelHaltApp create(long attractionTravelHaltAppId) {
		AttractionTravelHaltApp attractionTravelHaltApp =
			new AttractionTravelHaltAppImpl();

		attractionTravelHaltApp.setNew(true);
		attractionTravelHaltApp.setPrimaryKey(attractionTravelHaltAppId);

		attractionTravelHaltApp.setCompanyId(CompanyThreadLocal.getCompanyId());

		return attractionTravelHaltApp;
	}

	/**
	 * Removes the attraction travel halt app with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionTravelHaltAppId the primary key of the attraction travel halt app
	 * @return the attraction travel halt app that was removed
	 * @throws NoSuchAttractionTravelHaltAppException if a attraction travel halt app with the primary key could not be found
	 */
	@Override
	public AttractionTravelHaltApp remove(long attractionTravelHaltAppId)
		throws NoSuchAttractionTravelHaltAppException {

		return remove((Serializable)attractionTravelHaltAppId);
	}

	/**
	 * Removes the attraction travel halt app with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attraction travel halt app
	 * @return the attraction travel halt app that was removed
	 * @throws NoSuchAttractionTravelHaltAppException if a attraction travel halt app with the primary key could not be found
	 */
	@Override
	public AttractionTravelHaltApp remove(Serializable primaryKey)
		throws NoSuchAttractionTravelHaltAppException {

		Session session = null;

		try {
			session = openSession();

			AttractionTravelHaltApp attractionTravelHaltApp =
				(AttractionTravelHaltApp)session.get(
					AttractionTravelHaltAppImpl.class, primaryKey);

			if (attractionTravelHaltApp == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttractionTravelHaltAppException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(attractionTravelHaltApp);
		}
		catch (NoSuchAttractionTravelHaltAppException noSuchEntityException) {
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
	protected AttractionTravelHaltApp removeImpl(
		AttractionTravelHaltApp attractionTravelHaltApp) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attractionTravelHaltApp)) {
				attractionTravelHaltApp = (AttractionTravelHaltApp)session.get(
					AttractionTravelHaltAppImpl.class,
					attractionTravelHaltApp.getPrimaryKeyObj());
			}

			if (attractionTravelHaltApp != null) {
				session.delete(attractionTravelHaltApp);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (attractionTravelHaltApp != null) {
			clearCache(attractionTravelHaltApp);
		}

		return attractionTravelHaltApp;
	}

	@Override
	public AttractionTravelHaltApp updateImpl(
		AttractionTravelHaltApp attractionTravelHaltApp) {

		boolean isNew = attractionTravelHaltApp.isNew();

		if (!(attractionTravelHaltApp instanceof
				AttractionTravelHaltAppModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(attractionTravelHaltApp.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					attractionTravelHaltApp);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in attractionTravelHaltApp proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AttractionTravelHaltApp implementation " +
					attractionTravelHaltApp.getClass());
		}

		AttractionTravelHaltAppModelImpl attractionTravelHaltAppModelImpl =
			(AttractionTravelHaltAppModelImpl)attractionTravelHaltApp;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (attractionTravelHaltApp.getCreateDate() == null)) {
			if (serviceContext == null) {
				attractionTravelHaltApp.setCreateDate(date);
			}
			else {
				attractionTravelHaltApp.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!attractionTravelHaltAppModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				attractionTravelHaltApp.setModifiedDate(date);
			}
			else {
				attractionTravelHaltApp.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(attractionTravelHaltApp);
			}
			else {
				attractionTravelHaltApp =
					(AttractionTravelHaltApp)session.merge(
						attractionTravelHaltApp);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AttractionTravelHaltAppImpl.class, attractionTravelHaltAppModelImpl,
			false, true);

		cacheUniqueFindersCache(attractionTravelHaltAppModelImpl);

		if (isNew) {
			attractionTravelHaltApp.setNew(false);
		}

		attractionTravelHaltApp.resetOriginalValues();

		return attractionTravelHaltApp;
	}

	/**
	 * Returns the attraction travel halt app with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attraction travel halt app
	 * @return the attraction travel halt app
	 * @throws NoSuchAttractionTravelHaltAppException if a attraction travel halt app with the primary key could not be found
	 */
	@Override
	public AttractionTravelHaltApp findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttractionTravelHaltAppException {

		AttractionTravelHaltApp attractionTravelHaltApp = fetchByPrimaryKey(
			primaryKey);

		if (attractionTravelHaltApp == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttractionTravelHaltAppException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return attractionTravelHaltApp;
	}

	/**
	 * Returns the attraction travel halt app with the primary key or throws a <code>NoSuchAttractionTravelHaltAppException</code> if it could not be found.
	 *
	 * @param attractionTravelHaltAppId the primary key of the attraction travel halt app
	 * @return the attraction travel halt app
	 * @throws NoSuchAttractionTravelHaltAppException if a attraction travel halt app with the primary key could not be found
	 */
	@Override
	public AttractionTravelHaltApp findByPrimaryKey(
			long attractionTravelHaltAppId)
		throws NoSuchAttractionTravelHaltAppException {

		return findByPrimaryKey((Serializable)attractionTravelHaltAppId);
	}

	/**
	 * Returns the attraction travel halt app with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionTravelHaltAppId the primary key of the attraction travel halt app
	 * @return the attraction travel halt app, or <code>null</code> if a attraction travel halt app with the primary key could not be found
	 */
	@Override
	public AttractionTravelHaltApp fetchByPrimaryKey(
		long attractionTravelHaltAppId) {

		return fetchByPrimaryKey((Serializable)attractionTravelHaltAppId);
	}

	/**
	 * Returns all the attraction travel halt apps.
	 *
	 * @return the attraction travel halt apps
	 */
	@Override
	public List<AttractionTravelHaltApp> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the attraction travel halt apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionTravelHaltAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction travel halt apps
	 * @param end the upper bound of the range of attraction travel halt apps (not inclusive)
	 * @return the range of attraction travel halt apps
	 */
	@Override
	public List<AttractionTravelHaltApp> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the attraction travel halt apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionTravelHaltAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction travel halt apps
	 * @param end the upper bound of the range of attraction travel halt apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction travel halt apps
	 */
	@Override
	public List<AttractionTravelHaltApp> findAll(
		int start, int end,
		OrderByComparator<AttractionTravelHaltApp> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the attraction travel halt apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionTravelHaltAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction travel halt apps
	 * @param end the upper bound of the range of attraction travel halt apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction travel halt apps
	 */
	@Override
	public List<AttractionTravelHaltApp> findAll(
		int start, int end,
		OrderByComparator<AttractionTravelHaltApp> orderByComparator,
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

		List<AttractionTravelHaltApp> list = null;

		if (useFinderCache) {
			list = (List<AttractionTravelHaltApp>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ATTRACTIONTRAVELHALTAPP);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ATTRACTIONTRAVELHALTAPP;

				sql = sql.concat(
					AttractionTravelHaltAppModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AttractionTravelHaltApp>)QueryUtil.list(
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
	 * Removes all the attraction travel halt apps from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AttractionTravelHaltApp attractionTravelHaltApp : findAll()) {
			remove(attractionTravelHaltApp);
		}
	}

	/**
	 * Returns the number of attraction travel halt apps.
	 *
	 * @return the number of attraction travel halt apps
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
					_SQL_COUNT_ATTRACTIONTRAVELHALTAPP);

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
		return "attractionTravelHaltAppId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ATTRACTIONTRAVELHALTAPP;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AttractionTravelHaltAppModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the attraction travel halt app persistence.
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

		AttractionTravelHaltAppUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AttractionTravelHaltAppUtil.setPersistence(null);

		entityCache.removeCache(AttractionTravelHaltAppImpl.class.getName());
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

	private static final String _SQL_SELECT_ATTRACTIONTRAVELHALTAPP =
		"SELECT attractionTravelHaltApp FROM AttractionTravelHaltApp attractionTravelHaltApp";

	private static final String _SQL_SELECT_ATTRACTIONTRAVELHALTAPP_WHERE =
		"SELECT attractionTravelHaltApp FROM AttractionTravelHaltApp attractionTravelHaltApp WHERE ";

	private static final String _SQL_COUNT_ATTRACTIONTRAVELHALTAPP =
		"SELECT COUNT(attractionTravelHaltApp) FROM AttractionTravelHaltApp attractionTravelHaltApp";

	private static final String _SQL_COUNT_ATTRACTIONTRAVELHALTAPP_WHERE =
		"SELECT COUNT(attractionTravelHaltApp) FROM AttractionTravelHaltApp attractionTravelHaltApp WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"attractionTravelHaltApp.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AttractionTravelHaltApp exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AttractionTravelHaltApp exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AttractionTravelHaltAppPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}