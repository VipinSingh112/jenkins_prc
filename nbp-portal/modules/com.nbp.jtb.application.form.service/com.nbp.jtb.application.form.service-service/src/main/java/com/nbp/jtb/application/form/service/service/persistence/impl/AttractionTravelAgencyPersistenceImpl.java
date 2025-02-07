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

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionTravelAgencyException;
import com.nbp.jtb.application.form.service.model.AttractionTravelAgency;
import com.nbp.jtb.application.form.service.model.AttractionTravelAgencyTable;
import com.nbp.jtb.application.form.service.model.impl.AttractionTravelAgencyImpl;
import com.nbp.jtb.application.form.service.model.impl.AttractionTravelAgencyModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AttractionTravelAgencyPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionTravelAgencyUtil;
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
 * The persistence implementation for the attraction travel agency service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AttractionTravelAgencyPersistence.class)
public class AttractionTravelAgencyPersistenceImpl
	extends BasePersistenceImpl<AttractionTravelAgency>
	implements AttractionTravelAgencyPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AttractionTravelAgencyUtil</code> to access the attraction travel agency persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AttractionTravelAgencyImpl.class.getName();

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
	 * Returns the attraction travel agency where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionTravelAgencyException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction travel agency
	 * @throws NoSuchAttractionTravelAgencyException if a matching attraction travel agency could not be found
	 */
	@Override
	public AttractionTravelAgency findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionTravelAgencyException {

		AttractionTravelAgency attractionTravelAgency =
			fetchBygetJTB_ByApplicationId(jtbApplicationId);

		if (attractionTravelAgency == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAttractionTravelAgencyException(sb.toString());
		}

		return attractionTravelAgency;
	}

	/**
	 * Returns the attraction travel agency where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction travel agency, or <code>null</code> if a matching attraction travel agency could not be found
	 */
	@Override
	public AttractionTravelAgency fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the attraction travel agency where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction travel agency, or <code>null</code> if a matching attraction travel agency could not be found
	 */
	@Override
	public AttractionTravelAgency fetchBygetJTB_ByApplicationId(
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

		if (result instanceof AttractionTravelAgency) {
			AttractionTravelAgency attractionTravelAgency =
				(AttractionTravelAgency)result;

			if (jtbApplicationId !=
					attractionTravelAgency.getJtbApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ATTRACTIONTRAVELAGENCY_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AttractionTravelAgency> list = query.list();

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
								"AttractionTravelAgencyPersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AttractionTravelAgency attractionTravelAgency = list.get(0);

					result = attractionTravelAgency;

					cacheResult(attractionTravelAgency);
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
			return (AttractionTravelAgency)result;
		}
	}

	/**
	 * Removes the attraction travel agency where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction travel agency that was removed
	 */
	@Override
	public AttractionTravelAgency removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionTravelAgencyException {

		AttractionTravelAgency attractionTravelAgency =
			findBygetJTB_ByApplicationId(jtbApplicationId);

		return remove(attractionTravelAgency);
	}

	/**
	 * Returns the number of attraction travel agencies where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction travel agencies
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ATTRACTIONTRAVELAGENCY_WHERE);

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
			"attractionTravelAgency.jtbApplicationId = ?";

	public AttractionTravelAgencyPersistenceImpl() {
		setModelClass(AttractionTravelAgency.class);

		setModelImplClass(AttractionTravelAgencyImpl.class);
		setModelPKClass(long.class);

		setTable(AttractionTravelAgencyTable.INSTANCE);
	}

	/**
	 * Caches the attraction travel agency in the entity cache if it is enabled.
	 *
	 * @param attractionTravelAgency the attraction travel agency
	 */
	@Override
	public void cacheResult(AttractionTravelAgency attractionTravelAgency) {
		entityCache.putResult(
			AttractionTravelAgencyImpl.class,
			attractionTravelAgency.getPrimaryKey(), attractionTravelAgency);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {attractionTravelAgency.getJtbApplicationId()},
			attractionTravelAgency);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the attraction travel agencies in the entity cache if it is enabled.
	 *
	 * @param attractionTravelAgencies the attraction travel agencies
	 */
	@Override
	public void cacheResult(
		List<AttractionTravelAgency> attractionTravelAgencies) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (attractionTravelAgencies.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AttractionTravelAgency attractionTravelAgency :
				attractionTravelAgencies) {

			if (entityCache.getResult(
					AttractionTravelAgencyImpl.class,
					attractionTravelAgency.getPrimaryKey()) == null) {

				cacheResult(attractionTravelAgency);
			}
		}
	}

	/**
	 * Clears the cache for all attraction travel agencies.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AttractionTravelAgencyImpl.class);

		finderCache.clearCache(AttractionTravelAgencyImpl.class);
	}

	/**
	 * Clears the cache for the attraction travel agency.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AttractionTravelAgency attractionTravelAgency) {
		entityCache.removeResult(
			AttractionTravelAgencyImpl.class, attractionTravelAgency);
	}

	@Override
	public void clearCache(
		List<AttractionTravelAgency> attractionTravelAgencies) {

		for (AttractionTravelAgency attractionTravelAgency :
				attractionTravelAgencies) {

			entityCache.removeResult(
				AttractionTravelAgencyImpl.class, attractionTravelAgency);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AttractionTravelAgencyImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AttractionTravelAgencyImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AttractionTravelAgencyModelImpl attractionTravelAgencyModelImpl) {

		Object[] args = new Object[] {
			attractionTravelAgencyModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			attractionTravelAgencyModelImpl);
	}

	/**
	 * Creates a new attraction travel agency with the primary key. Does not add the attraction travel agency to the database.
	 *
	 * @param attractionTravelAgencyId the primary key for the new attraction travel agency
	 * @return the new attraction travel agency
	 */
	@Override
	public AttractionTravelAgency create(long attractionTravelAgencyId) {
		AttractionTravelAgency attractionTravelAgency =
			new AttractionTravelAgencyImpl();

		attractionTravelAgency.setNew(true);
		attractionTravelAgency.setPrimaryKey(attractionTravelAgencyId);

		attractionTravelAgency.setCompanyId(CompanyThreadLocal.getCompanyId());

		return attractionTravelAgency;
	}

	/**
	 * Removes the attraction travel agency with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionTravelAgencyId the primary key of the attraction travel agency
	 * @return the attraction travel agency that was removed
	 * @throws NoSuchAttractionTravelAgencyException if a attraction travel agency with the primary key could not be found
	 */
	@Override
	public AttractionTravelAgency remove(long attractionTravelAgencyId)
		throws NoSuchAttractionTravelAgencyException {

		return remove((Serializable)attractionTravelAgencyId);
	}

	/**
	 * Removes the attraction travel agency with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attraction travel agency
	 * @return the attraction travel agency that was removed
	 * @throws NoSuchAttractionTravelAgencyException if a attraction travel agency with the primary key could not be found
	 */
	@Override
	public AttractionTravelAgency remove(Serializable primaryKey)
		throws NoSuchAttractionTravelAgencyException {

		Session session = null;

		try {
			session = openSession();

			AttractionTravelAgency attractionTravelAgency =
				(AttractionTravelAgency)session.get(
					AttractionTravelAgencyImpl.class, primaryKey);

			if (attractionTravelAgency == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttractionTravelAgencyException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(attractionTravelAgency);
		}
		catch (NoSuchAttractionTravelAgencyException noSuchEntityException) {
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
	protected AttractionTravelAgency removeImpl(
		AttractionTravelAgency attractionTravelAgency) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attractionTravelAgency)) {
				attractionTravelAgency = (AttractionTravelAgency)session.get(
					AttractionTravelAgencyImpl.class,
					attractionTravelAgency.getPrimaryKeyObj());
			}

			if (attractionTravelAgency != null) {
				session.delete(attractionTravelAgency);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (attractionTravelAgency != null) {
			clearCache(attractionTravelAgency);
		}

		return attractionTravelAgency;
	}

	@Override
	public AttractionTravelAgency updateImpl(
		AttractionTravelAgency attractionTravelAgency) {

		boolean isNew = attractionTravelAgency.isNew();

		if (!(attractionTravelAgency instanceof
				AttractionTravelAgencyModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(attractionTravelAgency.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					attractionTravelAgency);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in attractionTravelAgency proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AttractionTravelAgency implementation " +
					attractionTravelAgency.getClass());
		}

		AttractionTravelAgencyModelImpl attractionTravelAgencyModelImpl =
			(AttractionTravelAgencyModelImpl)attractionTravelAgency;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (attractionTravelAgency.getCreateDate() == null)) {
			if (serviceContext == null) {
				attractionTravelAgency.setCreateDate(date);
			}
			else {
				attractionTravelAgency.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!attractionTravelAgencyModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				attractionTravelAgency.setModifiedDate(date);
			}
			else {
				attractionTravelAgency.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(attractionTravelAgency);
			}
			else {
				attractionTravelAgency = (AttractionTravelAgency)session.merge(
					attractionTravelAgency);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AttractionTravelAgencyImpl.class, attractionTravelAgencyModelImpl,
			false, true);

		cacheUniqueFindersCache(attractionTravelAgencyModelImpl);

		if (isNew) {
			attractionTravelAgency.setNew(false);
		}

		attractionTravelAgency.resetOriginalValues();

		return attractionTravelAgency;
	}

	/**
	 * Returns the attraction travel agency with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attraction travel agency
	 * @return the attraction travel agency
	 * @throws NoSuchAttractionTravelAgencyException if a attraction travel agency with the primary key could not be found
	 */
	@Override
	public AttractionTravelAgency findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttractionTravelAgencyException {

		AttractionTravelAgency attractionTravelAgency = fetchByPrimaryKey(
			primaryKey);

		if (attractionTravelAgency == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttractionTravelAgencyException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return attractionTravelAgency;
	}

	/**
	 * Returns the attraction travel agency with the primary key or throws a <code>NoSuchAttractionTravelAgencyException</code> if it could not be found.
	 *
	 * @param attractionTravelAgencyId the primary key of the attraction travel agency
	 * @return the attraction travel agency
	 * @throws NoSuchAttractionTravelAgencyException if a attraction travel agency with the primary key could not be found
	 */
	@Override
	public AttractionTravelAgency findByPrimaryKey(
			long attractionTravelAgencyId)
		throws NoSuchAttractionTravelAgencyException {

		return findByPrimaryKey((Serializable)attractionTravelAgencyId);
	}

	/**
	 * Returns the attraction travel agency with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionTravelAgencyId the primary key of the attraction travel agency
	 * @return the attraction travel agency, or <code>null</code> if a attraction travel agency with the primary key could not be found
	 */
	@Override
	public AttractionTravelAgency fetchByPrimaryKey(
		long attractionTravelAgencyId) {

		return fetchByPrimaryKey((Serializable)attractionTravelAgencyId);
	}

	/**
	 * Returns all the attraction travel agencies.
	 *
	 * @return the attraction travel agencies
	 */
	@Override
	public List<AttractionTravelAgency> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the attraction travel agencies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionTravelAgencyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction travel agencies
	 * @param end the upper bound of the range of attraction travel agencies (not inclusive)
	 * @return the range of attraction travel agencies
	 */
	@Override
	public List<AttractionTravelAgency> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the attraction travel agencies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionTravelAgencyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction travel agencies
	 * @param end the upper bound of the range of attraction travel agencies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction travel agencies
	 */
	@Override
	public List<AttractionTravelAgency> findAll(
		int start, int end,
		OrderByComparator<AttractionTravelAgency> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the attraction travel agencies.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionTravelAgencyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction travel agencies
	 * @param end the upper bound of the range of attraction travel agencies (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction travel agencies
	 */
	@Override
	public List<AttractionTravelAgency> findAll(
		int start, int end,
		OrderByComparator<AttractionTravelAgency> orderByComparator,
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

		List<AttractionTravelAgency> list = null;

		if (useFinderCache) {
			list = (List<AttractionTravelAgency>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ATTRACTIONTRAVELAGENCY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ATTRACTIONTRAVELAGENCY;

				sql = sql.concat(AttractionTravelAgencyModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AttractionTravelAgency>)QueryUtil.list(
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
	 * Removes all the attraction travel agencies from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AttractionTravelAgency attractionTravelAgency : findAll()) {
			remove(attractionTravelAgency);
		}
	}

	/**
	 * Returns the number of attraction travel agencies.
	 *
	 * @return the number of attraction travel agencies
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
					_SQL_COUNT_ATTRACTIONTRAVELAGENCY);

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
		return "attractionTravelAgencyId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ATTRACTIONTRAVELAGENCY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AttractionTravelAgencyModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the attraction travel agency persistence.
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

		AttractionTravelAgencyUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AttractionTravelAgencyUtil.setPersistence(null);

		entityCache.removeCache(AttractionTravelAgencyImpl.class.getName());
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

	private static final String _SQL_SELECT_ATTRACTIONTRAVELAGENCY =
		"SELECT attractionTravelAgency FROM AttractionTravelAgency attractionTravelAgency";

	private static final String _SQL_SELECT_ATTRACTIONTRAVELAGENCY_WHERE =
		"SELECT attractionTravelAgency FROM AttractionTravelAgency attractionTravelAgency WHERE ";

	private static final String _SQL_COUNT_ATTRACTIONTRAVELAGENCY =
		"SELECT COUNT(attractionTravelAgency) FROM AttractionTravelAgency attractionTravelAgency";

	private static final String _SQL_COUNT_ATTRACTIONTRAVELAGENCY_WHERE =
		"SELECT COUNT(attractionTravelAgency) FROM AttractionTravelAgency attractionTravelAgency WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"attractionTravelAgency.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AttractionTravelAgency exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AttractionTravelAgency exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AttractionTravelAgencyPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}