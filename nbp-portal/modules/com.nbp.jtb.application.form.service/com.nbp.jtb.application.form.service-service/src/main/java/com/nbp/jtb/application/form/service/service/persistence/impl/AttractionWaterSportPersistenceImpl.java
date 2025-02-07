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

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionWaterSportException;
import com.nbp.jtb.application.form.service.model.AttractionWaterSport;
import com.nbp.jtb.application.form.service.model.AttractionWaterSportTable;
import com.nbp.jtb.application.form.service.model.impl.AttractionWaterSportImpl;
import com.nbp.jtb.application.form.service.model.impl.AttractionWaterSportModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AttractionWaterSportPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionWaterSportUtil;
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
 * The persistence implementation for the attraction water sport service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AttractionWaterSportPersistence.class)
public class AttractionWaterSportPersistenceImpl
	extends BasePersistenceImpl<AttractionWaterSport>
	implements AttractionWaterSportPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AttractionWaterSportUtil</code> to access the attraction water sport persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AttractionWaterSportImpl.class.getName();

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
	 * Returns the attraction water sport where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionWaterSportException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water sport
	 * @throws NoSuchAttractionWaterSportException if a matching attraction water sport could not be found
	 */
	@Override
	public AttractionWaterSport findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionWaterSportException {

		AttractionWaterSport attractionWaterSport =
			fetchBygetJTB_ByApplicationId(jtbApplicationId);

		if (attractionWaterSport == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAttractionWaterSportException(sb.toString());
		}

		return attractionWaterSport;
	}

	/**
	 * Returns the attraction water sport where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water sport, or <code>null</code> if a matching attraction water sport could not be found
	 */
	@Override
	public AttractionWaterSport fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the attraction water sport where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction water sport, or <code>null</code> if a matching attraction water sport could not be found
	 */
	@Override
	public AttractionWaterSport fetchBygetJTB_ByApplicationId(
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

		if (result instanceof AttractionWaterSport) {
			AttractionWaterSport attractionWaterSport =
				(AttractionWaterSport)result;

			if (jtbApplicationId !=
					attractionWaterSport.getJtbApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ATTRACTIONWATERSPORT_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AttractionWaterSport> list = query.list();

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
								"AttractionWaterSportPersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AttractionWaterSport attractionWaterSport = list.get(0);

					result = attractionWaterSport;

					cacheResult(attractionWaterSport);
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
			return (AttractionWaterSport)result;
		}
	}

	/**
	 * Removes the attraction water sport where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction water sport that was removed
	 */
	@Override
	public AttractionWaterSport removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionWaterSportException {

		AttractionWaterSport attractionWaterSport =
			findBygetJTB_ByApplicationId(jtbApplicationId);

		return remove(attractionWaterSport);
	}

	/**
	 * Returns the number of attraction water sports where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction water sports
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ATTRACTIONWATERSPORT_WHERE);

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
			"attractionWaterSport.jtbApplicationId = ?";

	public AttractionWaterSportPersistenceImpl() {
		setModelClass(AttractionWaterSport.class);

		setModelImplClass(AttractionWaterSportImpl.class);
		setModelPKClass(long.class);

		setTable(AttractionWaterSportTable.INSTANCE);
	}

	/**
	 * Caches the attraction water sport in the entity cache if it is enabled.
	 *
	 * @param attractionWaterSport the attraction water sport
	 */
	@Override
	public void cacheResult(AttractionWaterSport attractionWaterSport) {
		entityCache.putResult(
			AttractionWaterSportImpl.class,
			attractionWaterSport.getPrimaryKey(), attractionWaterSport);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {attractionWaterSport.getJtbApplicationId()},
			attractionWaterSport);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the attraction water sports in the entity cache if it is enabled.
	 *
	 * @param attractionWaterSports the attraction water sports
	 */
	@Override
	public void cacheResult(List<AttractionWaterSport> attractionWaterSports) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (attractionWaterSports.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AttractionWaterSport attractionWaterSport :
				attractionWaterSports) {

			if (entityCache.getResult(
					AttractionWaterSportImpl.class,
					attractionWaterSport.getPrimaryKey()) == null) {

				cacheResult(attractionWaterSport);
			}
		}
	}

	/**
	 * Clears the cache for all attraction water sports.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AttractionWaterSportImpl.class);

		finderCache.clearCache(AttractionWaterSportImpl.class);
	}

	/**
	 * Clears the cache for the attraction water sport.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AttractionWaterSport attractionWaterSport) {
		entityCache.removeResult(
			AttractionWaterSportImpl.class, attractionWaterSport);
	}

	@Override
	public void clearCache(List<AttractionWaterSport> attractionWaterSports) {
		for (AttractionWaterSport attractionWaterSport :
				attractionWaterSports) {

			entityCache.removeResult(
				AttractionWaterSportImpl.class, attractionWaterSport);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AttractionWaterSportImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AttractionWaterSportImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AttractionWaterSportModelImpl attractionWaterSportModelImpl) {

		Object[] args = new Object[] {
			attractionWaterSportModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			attractionWaterSportModelImpl);
	}

	/**
	 * Creates a new attraction water sport with the primary key. Does not add the attraction water sport to the database.
	 *
	 * @param attractionWaterSportId the primary key for the new attraction water sport
	 * @return the new attraction water sport
	 */
	@Override
	public AttractionWaterSport create(long attractionWaterSportId) {
		AttractionWaterSport attractionWaterSport =
			new AttractionWaterSportImpl();

		attractionWaterSport.setNew(true);
		attractionWaterSport.setPrimaryKey(attractionWaterSportId);

		attractionWaterSport.setCompanyId(CompanyThreadLocal.getCompanyId());

		return attractionWaterSport;
	}

	/**
	 * Removes the attraction water sport with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionWaterSportId the primary key of the attraction water sport
	 * @return the attraction water sport that was removed
	 * @throws NoSuchAttractionWaterSportException if a attraction water sport with the primary key could not be found
	 */
	@Override
	public AttractionWaterSport remove(long attractionWaterSportId)
		throws NoSuchAttractionWaterSportException {

		return remove((Serializable)attractionWaterSportId);
	}

	/**
	 * Removes the attraction water sport with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attraction water sport
	 * @return the attraction water sport that was removed
	 * @throws NoSuchAttractionWaterSportException if a attraction water sport with the primary key could not be found
	 */
	@Override
	public AttractionWaterSport remove(Serializable primaryKey)
		throws NoSuchAttractionWaterSportException {

		Session session = null;

		try {
			session = openSession();

			AttractionWaterSport attractionWaterSport =
				(AttractionWaterSport)session.get(
					AttractionWaterSportImpl.class, primaryKey);

			if (attractionWaterSport == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttractionWaterSportException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(attractionWaterSport);
		}
		catch (NoSuchAttractionWaterSportException noSuchEntityException) {
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
	protected AttractionWaterSport removeImpl(
		AttractionWaterSport attractionWaterSport) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attractionWaterSport)) {
				attractionWaterSport = (AttractionWaterSport)session.get(
					AttractionWaterSportImpl.class,
					attractionWaterSport.getPrimaryKeyObj());
			}

			if (attractionWaterSport != null) {
				session.delete(attractionWaterSport);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (attractionWaterSport != null) {
			clearCache(attractionWaterSport);
		}

		return attractionWaterSport;
	}

	@Override
	public AttractionWaterSport updateImpl(
		AttractionWaterSport attractionWaterSport) {

		boolean isNew = attractionWaterSport.isNew();

		if (!(attractionWaterSport instanceof AttractionWaterSportModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(attractionWaterSport.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					attractionWaterSport);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in attractionWaterSport proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AttractionWaterSport implementation " +
					attractionWaterSport.getClass());
		}

		AttractionWaterSportModelImpl attractionWaterSportModelImpl =
			(AttractionWaterSportModelImpl)attractionWaterSport;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (attractionWaterSport.getCreateDate() == null)) {
			if (serviceContext == null) {
				attractionWaterSport.setCreateDate(date);
			}
			else {
				attractionWaterSport.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!attractionWaterSportModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				attractionWaterSport.setModifiedDate(date);
			}
			else {
				attractionWaterSport.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(attractionWaterSport);
			}
			else {
				attractionWaterSport = (AttractionWaterSport)session.merge(
					attractionWaterSport);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AttractionWaterSportImpl.class, attractionWaterSportModelImpl,
			false, true);

		cacheUniqueFindersCache(attractionWaterSportModelImpl);

		if (isNew) {
			attractionWaterSport.setNew(false);
		}

		attractionWaterSport.resetOriginalValues();

		return attractionWaterSport;
	}

	/**
	 * Returns the attraction water sport with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attraction water sport
	 * @return the attraction water sport
	 * @throws NoSuchAttractionWaterSportException if a attraction water sport with the primary key could not be found
	 */
	@Override
	public AttractionWaterSport findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttractionWaterSportException {

		AttractionWaterSport attractionWaterSport = fetchByPrimaryKey(
			primaryKey);

		if (attractionWaterSport == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttractionWaterSportException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return attractionWaterSport;
	}

	/**
	 * Returns the attraction water sport with the primary key or throws a <code>NoSuchAttractionWaterSportException</code> if it could not be found.
	 *
	 * @param attractionWaterSportId the primary key of the attraction water sport
	 * @return the attraction water sport
	 * @throws NoSuchAttractionWaterSportException if a attraction water sport with the primary key could not be found
	 */
	@Override
	public AttractionWaterSport findByPrimaryKey(long attractionWaterSportId)
		throws NoSuchAttractionWaterSportException {

		return findByPrimaryKey((Serializable)attractionWaterSportId);
	}

	/**
	 * Returns the attraction water sport with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionWaterSportId the primary key of the attraction water sport
	 * @return the attraction water sport, or <code>null</code> if a attraction water sport with the primary key could not be found
	 */
	@Override
	public AttractionWaterSport fetchByPrimaryKey(long attractionWaterSportId) {
		return fetchByPrimaryKey((Serializable)attractionWaterSportId);
	}

	/**
	 * Returns all the attraction water sports.
	 *
	 * @return the attraction water sports
	 */
	@Override
	public List<AttractionWaterSport> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the attraction water sports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterSportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water sports
	 * @param end the upper bound of the range of attraction water sports (not inclusive)
	 * @return the range of attraction water sports
	 */
	@Override
	public List<AttractionWaterSport> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the attraction water sports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterSportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water sports
	 * @param end the upper bound of the range of attraction water sports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction water sports
	 */
	@Override
	public List<AttractionWaterSport> findAll(
		int start, int end,
		OrderByComparator<AttractionWaterSport> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the attraction water sports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterSportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water sports
	 * @param end the upper bound of the range of attraction water sports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction water sports
	 */
	@Override
	public List<AttractionWaterSport> findAll(
		int start, int end,
		OrderByComparator<AttractionWaterSport> orderByComparator,
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

		List<AttractionWaterSport> list = null;

		if (useFinderCache) {
			list = (List<AttractionWaterSport>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ATTRACTIONWATERSPORT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ATTRACTIONWATERSPORT;

				sql = sql.concat(AttractionWaterSportModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AttractionWaterSport>)QueryUtil.list(
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
	 * Removes all the attraction water sports from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AttractionWaterSport attractionWaterSport : findAll()) {
			remove(attractionWaterSport);
		}
	}

	/**
	 * Returns the number of attraction water sports.
	 *
	 * @return the number of attraction water sports
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
					_SQL_COUNT_ATTRACTIONWATERSPORT);

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
		return "attractionWaterSportId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ATTRACTIONWATERSPORT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AttractionWaterSportModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the attraction water sport persistence.
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

		AttractionWaterSportUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AttractionWaterSportUtil.setPersistence(null);

		entityCache.removeCache(AttractionWaterSportImpl.class.getName());
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

	private static final String _SQL_SELECT_ATTRACTIONWATERSPORT =
		"SELECT attractionWaterSport FROM AttractionWaterSport attractionWaterSport";

	private static final String _SQL_SELECT_ATTRACTIONWATERSPORT_WHERE =
		"SELECT attractionWaterSport FROM AttractionWaterSport attractionWaterSport WHERE ";

	private static final String _SQL_COUNT_ATTRACTIONWATERSPORT =
		"SELECT COUNT(attractionWaterSport) FROM AttractionWaterSport attractionWaterSport";

	private static final String _SQL_COUNT_ATTRACTIONWATERSPORT_WHERE =
		"SELECT COUNT(attractionWaterSport) FROM AttractionWaterSport attractionWaterSport WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"attractionWaterSport.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AttractionWaterSport exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AttractionWaterSport exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AttractionWaterSportPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}