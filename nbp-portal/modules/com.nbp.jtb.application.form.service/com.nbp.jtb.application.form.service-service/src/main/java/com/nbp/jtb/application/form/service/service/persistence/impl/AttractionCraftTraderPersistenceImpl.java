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

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionCraftTraderException;
import com.nbp.jtb.application.form.service.model.AttractionCraftTrader;
import com.nbp.jtb.application.form.service.model.AttractionCraftTraderTable;
import com.nbp.jtb.application.form.service.model.impl.AttractionCraftTraderImpl;
import com.nbp.jtb.application.form.service.model.impl.AttractionCraftTraderModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AttractionCraftTraderPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionCraftTraderUtil;
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
 * The persistence implementation for the attraction craft trader service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AttractionCraftTraderPersistence.class)
public class AttractionCraftTraderPersistenceImpl
	extends BasePersistenceImpl<AttractionCraftTrader>
	implements AttractionCraftTraderPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AttractionCraftTraderUtil</code> to access the attraction craft trader persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AttractionCraftTraderImpl.class.getName();

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
	 * Returns the attraction craft trader where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionCraftTraderException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction craft trader
	 * @throws NoSuchAttractionCraftTraderException if a matching attraction craft trader could not be found
	 */
	@Override
	public AttractionCraftTrader findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionCraftTraderException {

		AttractionCraftTrader attractionCraftTrader =
			fetchBygetJTB_ByApplicationId(jtbApplicationId);

		if (attractionCraftTrader == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAttractionCraftTraderException(sb.toString());
		}

		return attractionCraftTrader;
	}

	/**
	 * Returns the attraction craft trader where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction craft trader, or <code>null</code> if a matching attraction craft trader could not be found
	 */
	@Override
	public AttractionCraftTrader fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the attraction craft trader where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction craft trader, or <code>null</code> if a matching attraction craft trader could not be found
	 */
	@Override
	public AttractionCraftTrader fetchBygetJTB_ByApplicationId(
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

		if (result instanceof AttractionCraftTrader) {
			AttractionCraftTrader attractionCraftTrader =
				(AttractionCraftTrader)result;

			if (jtbApplicationId !=
					attractionCraftTrader.getJtbApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ATTRACTIONCRAFTTRADER_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AttractionCraftTrader> list = query.list();

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
								"AttractionCraftTraderPersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AttractionCraftTrader attractionCraftTrader = list.get(0);

					result = attractionCraftTrader;

					cacheResult(attractionCraftTrader);
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
			return (AttractionCraftTrader)result;
		}
	}

	/**
	 * Removes the attraction craft trader where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction craft trader that was removed
	 */
	@Override
	public AttractionCraftTrader removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionCraftTraderException {

		AttractionCraftTrader attractionCraftTrader =
			findBygetJTB_ByApplicationId(jtbApplicationId);

		return remove(attractionCraftTrader);
	}

	/**
	 * Returns the number of attraction craft traders where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction craft traders
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ATTRACTIONCRAFTTRADER_WHERE);

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
			"attractionCraftTrader.jtbApplicationId = ?";

	public AttractionCraftTraderPersistenceImpl() {
		setModelClass(AttractionCraftTrader.class);

		setModelImplClass(AttractionCraftTraderImpl.class);
		setModelPKClass(long.class);

		setTable(AttractionCraftTraderTable.INSTANCE);
	}

	/**
	 * Caches the attraction craft trader in the entity cache if it is enabled.
	 *
	 * @param attractionCraftTrader the attraction craft trader
	 */
	@Override
	public void cacheResult(AttractionCraftTrader attractionCraftTrader) {
		entityCache.putResult(
			AttractionCraftTraderImpl.class,
			attractionCraftTrader.getPrimaryKey(), attractionCraftTrader);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {attractionCraftTrader.getJtbApplicationId()},
			attractionCraftTrader);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the attraction craft traders in the entity cache if it is enabled.
	 *
	 * @param attractionCraftTraders the attraction craft traders
	 */
	@Override
	public void cacheResult(
		List<AttractionCraftTrader> attractionCraftTraders) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (attractionCraftTraders.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AttractionCraftTrader attractionCraftTrader :
				attractionCraftTraders) {

			if (entityCache.getResult(
					AttractionCraftTraderImpl.class,
					attractionCraftTrader.getPrimaryKey()) == null) {

				cacheResult(attractionCraftTrader);
			}
		}
	}

	/**
	 * Clears the cache for all attraction craft traders.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AttractionCraftTraderImpl.class);

		finderCache.clearCache(AttractionCraftTraderImpl.class);
	}

	/**
	 * Clears the cache for the attraction craft trader.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AttractionCraftTrader attractionCraftTrader) {
		entityCache.removeResult(
			AttractionCraftTraderImpl.class, attractionCraftTrader);
	}

	@Override
	public void clearCache(List<AttractionCraftTrader> attractionCraftTraders) {
		for (AttractionCraftTrader attractionCraftTrader :
				attractionCraftTraders) {

			entityCache.removeResult(
				AttractionCraftTraderImpl.class, attractionCraftTrader);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AttractionCraftTraderImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AttractionCraftTraderImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AttractionCraftTraderModelImpl attractionCraftTraderModelImpl) {

		Object[] args = new Object[] {
			attractionCraftTraderModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			attractionCraftTraderModelImpl);
	}

	/**
	 * Creates a new attraction craft trader with the primary key. Does not add the attraction craft trader to the database.
	 *
	 * @param attractionCraftTraderId the primary key for the new attraction craft trader
	 * @return the new attraction craft trader
	 */
	@Override
	public AttractionCraftTrader create(long attractionCraftTraderId) {
		AttractionCraftTrader attractionCraftTrader =
			new AttractionCraftTraderImpl();

		attractionCraftTrader.setNew(true);
		attractionCraftTrader.setPrimaryKey(attractionCraftTraderId);

		attractionCraftTrader.setCompanyId(CompanyThreadLocal.getCompanyId());

		return attractionCraftTrader;
	}

	/**
	 * Removes the attraction craft trader with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionCraftTraderId the primary key of the attraction craft trader
	 * @return the attraction craft trader that was removed
	 * @throws NoSuchAttractionCraftTraderException if a attraction craft trader with the primary key could not be found
	 */
	@Override
	public AttractionCraftTrader remove(long attractionCraftTraderId)
		throws NoSuchAttractionCraftTraderException {

		return remove((Serializable)attractionCraftTraderId);
	}

	/**
	 * Removes the attraction craft trader with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attraction craft trader
	 * @return the attraction craft trader that was removed
	 * @throws NoSuchAttractionCraftTraderException if a attraction craft trader with the primary key could not be found
	 */
	@Override
	public AttractionCraftTrader remove(Serializable primaryKey)
		throws NoSuchAttractionCraftTraderException {

		Session session = null;

		try {
			session = openSession();

			AttractionCraftTrader attractionCraftTrader =
				(AttractionCraftTrader)session.get(
					AttractionCraftTraderImpl.class, primaryKey);

			if (attractionCraftTrader == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttractionCraftTraderException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(attractionCraftTrader);
		}
		catch (NoSuchAttractionCraftTraderException noSuchEntityException) {
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
	protected AttractionCraftTrader removeImpl(
		AttractionCraftTrader attractionCraftTrader) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attractionCraftTrader)) {
				attractionCraftTrader = (AttractionCraftTrader)session.get(
					AttractionCraftTraderImpl.class,
					attractionCraftTrader.getPrimaryKeyObj());
			}

			if (attractionCraftTrader != null) {
				session.delete(attractionCraftTrader);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (attractionCraftTrader != null) {
			clearCache(attractionCraftTrader);
		}

		return attractionCraftTrader;
	}

	@Override
	public AttractionCraftTrader updateImpl(
		AttractionCraftTrader attractionCraftTrader) {

		boolean isNew = attractionCraftTrader.isNew();

		if (!(attractionCraftTrader instanceof
				AttractionCraftTraderModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(attractionCraftTrader.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					attractionCraftTrader);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in attractionCraftTrader proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AttractionCraftTrader implementation " +
					attractionCraftTrader.getClass());
		}

		AttractionCraftTraderModelImpl attractionCraftTraderModelImpl =
			(AttractionCraftTraderModelImpl)attractionCraftTrader;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (attractionCraftTrader.getCreateDate() == null)) {
			if (serviceContext == null) {
				attractionCraftTrader.setCreateDate(date);
			}
			else {
				attractionCraftTrader.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!attractionCraftTraderModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				attractionCraftTrader.setModifiedDate(date);
			}
			else {
				attractionCraftTrader.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(attractionCraftTrader);
			}
			else {
				attractionCraftTrader = (AttractionCraftTrader)session.merge(
					attractionCraftTrader);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AttractionCraftTraderImpl.class, attractionCraftTraderModelImpl,
			false, true);

		cacheUniqueFindersCache(attractionCraftTraderModelImpl);

		if (isNew) {
			attractionCraftTrader.setNew(false);
		}

		attractionCraftTrader.resetOriginalValues();

		return attractionCraftTrader;
	}

	/**
	 * Returns the attraction craft trader with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attraction craft trader
	 * @return the attraction craft trader
	 * @throws NoSuchAttractionCraftTraderException if a attraction craft trader with the primary key could not be found
	 */
	@Override
	public AttractionCraftTrader findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttractionCraftTraderException {

		AttractionCraftTrader attractionCraftTrader = fetchByPrimaryKey(
			primaryKey);

		if (attractionCraftTrader == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttractionCraftTraderException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return attractionCraftTrader;
	}

	/**
	 * Returns the attraction craft trader with the primary key or throws a <code>NoSuchAttractionCraftTraderException</code> if it could not be found.
	 *
	 * @param attractionCraftTraderId the primary key of the attraction craft trader
	 * @return the attraction craft trader
	 * @throws NoSuchAttractionCraftTraderException if a attraction craft trader with the primary key could not be found
	 */
	@Override
	public AttractionCraftTrader findByPrimaryKey(long attractionCraftTraderId)
		throws NoSuchAttractionCraftTraderException {

		return findByPrimaryKey((Serializable)attractionCraftTraderId);
	}

	/**
	 * Returns the attraction craft trader with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionCraftTraderId the primary key of the attraction craft trader
	 * @return the attraction craft trader, or <code>null</code> if a attraction craft trader with the primary key could not be found
	 */
	@Override
	public AttractionCraftTrader fetchByPrimaryKey(
		long attractionCraftTraderId) {

		return fetchByPrimaryKey((Serializable)attractionCraftTraderId);
	}

	/**
	 * Returns all the attraction craft traders.
	 *
	 * @return the attraction craft traders
	 */
	@Override
	public List<AttractionCraftTrader> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the attraction craft traders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCraftTraderModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction craft traders
	 * @param end the upper bound of the range of attraction craft traders (not inclusive)
	 * @return the range of attraction craft traders
	 */
	@Override
	public List<AttractionCraftTrader> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the attraction craft traders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCraftTraderModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction craft traders
	 * @param end the upper bound of the range of attraction craft traders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction craft traders
	 */
	@Override
	public List<AttractionCraftTrader> findAll(
		int start, int end,
		OrderByComparator<AttractionCraftTrader> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the attraction craft traders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCraftTraderModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction craft traders
	 * @param end the upper bound of the range of attraction craft traders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction craft traders
	 */
	@Override
	public List<AttractionCraftTrader> findAll(
		int start, int end,
		OrderByComparator<AttractionCraftTrader> orderByComparator,
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

		List<AttractionCraftTrader> list = null;

		if (useFinderCache) {
			list = (List<AttractionCraftTrader>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ATTRACTIONCRAFTTRADER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ATTRACTIONCRAFTTRADER;

				sql = sql.concat(AttractionCraftTraderModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AttractionCraftTrader>)QueryUtil.list(
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
	 * Removes all the attraction craft traders from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AttractionCraftTrader attractionCraftTrader : findAll()) {
			remove(attractionCraftTrader);
		}
	}

	/**
	 * Returns the number of attraction craft traders.
	 *
	 * @return the number of attraction craft traders
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
					_SQL_COUNT_ATTRACTIONCRAFTTRADER);

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
		return "attractionCraftTraderId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ATTRACTIONCRAFTTRADER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AttractionCraftTraderModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the attraction craft trader persistence.
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

		AttractionCraftTraderUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AttractionCraftTraderUtil.setPersistence(null);

		entityCache.removeCache(AttractionCraftTraderImpl.class.getName());
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

	private static final String _SQL_SELECT_ATTRACTIONCRAFTTRADER =
		"SELECT attractionCraftTrader FROM AttractionCraftTrader attractionCraftTrader";

	private static final String _SQL_SELECT_ATTRACTIONCRAFTTRADER_WHERE =
		"SELECT attractionCraftTrader FROM AttractionCraftTrader attractionCraftTrader WHERE ";

	private static final String _SQL_COUNT_ATTRACTIONCRAFTTRADER =
		"SELECT COUNT(attractionCraftTrader) FROM AttractionCraftTrader attractionCraftTrader";

	private static final String _SQL_COUNT_ATTRACTIONCRAFTTRADER_WHERE =
		"SELECT COUNT(attractionCraftTrader) FROM AttractionCraftTrader attractionCraftTrader WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"attractionCraftTrader.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AttractionCraftTrader exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AttractionCraftTrader exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AttractionCraftTraderPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}