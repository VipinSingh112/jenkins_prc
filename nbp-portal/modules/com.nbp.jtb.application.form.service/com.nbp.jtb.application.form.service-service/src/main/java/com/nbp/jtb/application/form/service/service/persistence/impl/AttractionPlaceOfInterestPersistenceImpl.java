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

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionPlaceOfInterestException;
import com.nbp.jtb.application.form.service.model.AttractionPlaceOfInterest;
import com.nbp.jtb.application.form.service.model.AttractionPlaceOfInterestTable;
import com.nbp.jtb.application.form.service.model.impl.AttractionPlaceOfInterestImpl;
import com.nbp.jtb.application.form.service.model.impl.AttractionPlaceOfInterestModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AttractionPlaceOfInterestPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionPlaceOfInterestUtil;
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
 * The persistence implementation for the attraction place of interest service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AttractionPlaceOfInterestPersistence.class)
public class AttractionPlaceOfInterestPersistenceImpl
	extends BasePersistenceImpl<AttractionPlaceOfInterest>
	implements AttractionPlaceOfInterestPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AttractionPlaceOfInterestUtil</code> to access the attraction place of interest persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AttractionPlaceOfInterestImpl.class.getName();

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
	 * Returns the attraction place of interest where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionPlaceOfInterestException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction place of interest
	 * @throws NoSuchAttractionPlaceOfInterestException if a matching attraction place of interest could not be found
	 */
	@Override
	public AttractionPlaceOfInterest findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionPlaceOfInterestException {

		AttractionPlaceOfInterest attractionPlaceOfInterest =
			fetchBygetJTB_ByApplicationId(jtbApplicationId);

		if (attractionPlaceOfInterest == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAttractionPlaceOfInterestException(sb.toString());
		}

		return attractionPlaceOfInterest;
	}

	/**
	 * Returns the attraction place of interest where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction place of interest, or <code>null</code> if a matching attraction place of interest could not be found
	 */
	@Override
	public AttractionPlaceOfInterest fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the attraction place of interest where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction place of interest, or <code>null</code> if a matching attraction place of interest could not be found
	 */
	@Override
	public AttractionPlaceOfInterest fetchBygetJTB_ByApplicationId(
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

		if (result instanceof AttractionPlaceOfInterest) {
			AttractionPlaceOfInterest attractionPlaceOfInterest =
				(AttractionPlaceOfInterest)result;

			if (jtbApplicationId !=
					attractionPlaceOfInterest.getJtbApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ATTRACTIONPLACEOFINTEREST_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AttractionPlaceOfInterest> list = query.list();

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
								"AttractionPlaceOfInterestPersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AttractionPlaceOfInterest attractionPlaceOfInterest =
						list.get(0);

					result = attractionPlaceOfInterest;

					cacheResult(attractionPlaceOfInterest);
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
			return (AttractionPlaceOfInterest)result;
		}
	}

	/**
	 * Removes the attraction place of interest where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction place of interest that was removed
	 */
	@Override
	public AttractionPlaceOfInterest removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionPlaceOfInterestException {

		AttractionPlaceOfInterest attractionPlaceOfInterest =
			findBygetJTB_ByApplicationId(jtbApplicationId);

		return remove(attractionPlaceOfInterest);
	}

	/**
	 * Returns the number of attraction place of interests where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction place of interests
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ATTRACTIONPLACEOFINTEREST_WHERE);

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
			"attractionPlaceOfInterest.jtbApplicationId = ?";

	public AttractionPlaceOfInterestPersistenceImpl() {
		setModelClass(AttractionPlaceOfInterest.class);

		setModelImplClass(AttractionPlaceOfInterestImpl.class);
		setModelPKClass(long.class);

		setTable(AttractionPlaceOfInterestTable.INSTANCE);
	}

	/**
	 * Caches the attraction place of interest in the entity cache if it is enabled.
	 *
	 * @param attractionPlaceOfInterest the attraction place of interest
	 */
	@Override
	public void cacheResult(
		AttractionPlaceOfInterest attractionPlaceOfInterest) {

		entityCache.putResult(
			AttractionPlaceOfInterestImpl.class,
			attractionPlaceOfInterest.getPrimaryKey(),
			attractionPlaceOfInterest);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {attractionPlaceOfInterest.getJtbApplicationId()},
			attractionPlaceOfInterest);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the attraction place of interests in the entity cache if it is enabled.
	 *
	 * @param attractionPlaceOfInterests the attraction place of interests
	 */
	@Override
	public void cacheResult(
		List<AttractionPlaceOfInterest> attractionPlaceOfInterests) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (attractionPlaceOfInterests.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AttractionPlaceOfInterest attractionPlaceOfInterest :
				attractionPlaceOfInterests) {

			if (entityCache.getResult(
					AttractionPlaceOfInterestImpl.class,
					attractionPlaceOfInterest.getPrimaryKey()) == null) {

				cacheResult(attractionPlaceOfInterest);
			}
		}
	}

	/**
	 * Clears the cache for all attraction place of interests.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AttractionPlaceOfInterestImpl.class);

		finderCache.clearCache(AttractionPlaceOfInterestImpl.class);
	}

	/**
	 * Clears the cache for the attraction place of interest.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AttractionPlaceOfInterest attractionPlaceOfInterest) {

		entityCache.removeResult(
			AttractionPlaceOfInterestImpl.class, attractionPlaceOfInterest);
	}

	@Override
	public void clearCache(
		List<AttractionPlaceOfInterest> attractionPlaceOfInterests) {

		for (AttractionPlaceOfInterest attractionPlaceOfInterest :
				attractionPlaceOfInterests) {

			entityCache.removeResult(
				AttractionPlaceOfInterestImpl.class, attractionPlaceOfInterest);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AttractionPlaceOfInterestImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AttractionPlaceOfInterestImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AttractionPlaceOfInterestModelImpl attractionPlaceOfInterestModelImpl) {

		Object[] args = new Object[] {
			attractionPlaceOfInterestModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			attractionPlaceOfInterestModelImpl);
	}

	/**
	 * Creates a new attraction place of interest with the primary key. Does not add the attraction place of interest to the database.
	 *
	 * @param attractionPlaceOfInterestId the primary key for the new attraction place of interest
	 * @return the new attraction place of interest
	 */
	@Override
	public AttractionPlaceOfInterest create(long attractionPlaceOfInterestId) {
		AttractionPlaceOfInterest attractionPlaceOfInterest =
			new AttractionPlaceOfInterestImpl();

		attractionPlaceOfInterest.setNew(true);
		attractionPlaceOfInterest.setPrimaryKey(attractionPlaceOfInterestId);

		attractionPlaceOfInterest.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return attractionPlaceOfInterest;
	}

	/**
	 * Removes the attraction place of interest with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionPlaceOfInterestId the primary key of the attraction place of interest
	 * @return the attraction place of interest that was removed
	 * @throws NoSuchAttractionPlaceOfInterestException if a attraction place of interest with the primary key could not be found
	 */
	@Override
	public AttractionPlaceOfInterest remove(long attractionPlaceOfInterestId)
		throws NoSuchAttractionPlaceOfInterestException {

		return remove((Serializable)attractionPlaceOfInterestId);
	}

	/**
	 * Removes the attraction place of interest with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attraction place of interest
	 * @return the attraction place of interest that was removed
	 * @throws NoSuchAttractionPlaceOfInterestException if a attraction place of interest with the primary key could not be found
	 */
	@Override
	public AttractionPlaceOfInterest remove(Serializable primaryKey)
		throws NoSuchAttractionPlaceOfInterestException {

		Session session = null;

		try {
			session = openSession();

			AttractionPlaceOfInterest attractionPlaceOfInterest =
				(AttractionPlaceOfInterest)session.get(
					AttractionPlaceOfInterestImpl.class, primaryKey);

			if (attractionPlaceOfInterest == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttractionPlaceOfInterestException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(attractionPlaceOfInterest);
		}
		catch (NoSuchAttractionPlaceOfInterestException noSuchEntityException) {
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
	protected AttractionPlaceOfInterest removeImpl(
		AttractionPlaceOfInterest attractionPlaceOfInterest) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attractionPlaceOfInterest)) {
				attractionPlaceOfInterest =
					(AttractionPlaceOfInterest)session.get(
						AttractionPlaceOfInterestImpl.class,
						attractionPlaceOfInterest.getPrimaryKeyObj());
			}

			if (attractionPlaceOfInterest != null) {
				session.delete(attractionPlaceOfInterest);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (attractionPlaceOfInterest != null) {
			clearCache(attractionPlaceOfInterest);
		}

		return attractionPlaceOfInterest;
	}

	@Override
	public AttractionPlaceOfInterest updateImpl(
		AttractionPlaceOfInterest attractionPlaceOfInterest) {

		boolean isNew = attractionPlaceOfInterest.isNew();

		if (!(attractionPlaceOfInterest instanceof
				AttractionPlaceOfInterestModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(attractionPlaceOfInterest.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					attractionPlaceOfInterest);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in attractionPlaceOfInterest proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AttractionPlaceOfInterest implementation " +
					attractionPlaceOfInterest.getClass());
		}

		AttractionPlaceOfInterestModelImpl attractionPlaceOfInterestModelImpl =
			(AttractionPlaceOfInterestModelImpl)attractionPlaceOfInterest;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (attractionPlaceOfInterest.getCreateDate() == null)) {
			if (serviceContext == null) {
				attractionPlaceOfInterest.setCreateDate(date);
			}
			else {
				attractionPlaceOfInterest.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!attractionPlaceOfInterestModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				attractionPlaceOfInterest.setModifiedDate(date);
			}
			else {
				attractionPlaceOfInterest.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(attractionPlaceOfInterest);
			}
			else {
				attractionPlaceOfInterest =
					(AttractionPlaceOfInterest)session.merge(
						attractionPlaceOfInterest);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AttractionPlaceOfInterestImpl.class,
			attractionPlaceOfInterestModelImpl, false, true);

		cacheUniqueFindersCache(attractionPlaceOfInterestModelImpl);

		if (isNew) {
			attractionPlaceOfInterest.setNew(false);
		}

		attractionPlaceOfInterest.resetOriginalValues();

		return attractionPlaceOfInterest;
	}

	/**
	 * Returns the attraction place of interest with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attraction place of interest
	 * @return the attraction place of interest
	 * @throws NoSuchAttractionPlaceOfInterestException if a attraction place of interest with the primary key could not be found
	 */
	@Override
	public AttractionPlaceOfInterest findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttractionPlaceOfInterestException {

		AttractionPlaceOfInterest attractionPlaceOfInterest = fetchByPrimaryKey(
			primaryKey);

		if (attractionPlaceOfInterest == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttractionPlaceOfInterestException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return attractionPlaceOfInterest;
	}

	/**
	 * Returns the attraction place of interest with the primary key or throws a <code>NoSuchAttractionPlaceOfInterestException</code> if it could not be found.
	 *
	 * @param attractionPlaceOfInterestId the primary key of the attraction place of interest
	 * @return the attraction place of interest
	 * @throws NoSuchAttractionPlaceOfInterestException if a attraction place of interest with the primary key could not be found
	 */
	@Override
	public AttractionPlaceOfInterest findByPrimaryKey(
			long attractionPlaceOfInterestId)
		throws NoSuchAttractionPlaceOfInterestException {

		return findByPrimaryKey((Serializable)attractionPlaceOfInterestId);
	}

	/**
	 * Returns the attraction place of interest with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionPlaceOfInterestId the primary key of the attraction place of interest
	 * @return the attraction place of interest, or <code>null</code> if a attraction place of interest with the primary key could not be found
	 */
	@Override
	public AttractionPlaceOfInterest fetchByPrimaryKey(
		long attractionPlaceOfInterestId) {

		return fetchByPrimaryKey((Serializable)attractionPlaceOfInterestId);
	}

	/**
	 * Returns all the attraction place of interests.
	 *
	 * @return the attraction place of interests
	 */
	@Override
	public List<AttractionPlaceOfInterest> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the attraction place of interests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionPlaceOfInterestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction place of interests
	 * @param end the upper bound of the range of attraction place of interests (not inclusive)
	 * @return the range of attraction place of interests
	 */
	@Override
	public List<AttractionPlaceOfInterest> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the attraction place of interests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionPlaceOfInterestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction place of interests
	 * @param end the upper bound of the range of attraction place of interests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction place of interests
	 */
	@Override
	public List<AttractionPlaceOfInterest> findAll(
		int start, int end,
		OrderByComparator<AttractionPlaceOfInterest> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the attraction place of interests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionPlaceOfInterestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction place of interests
	 * @param end the upper bound of the range of attraction place of interests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction place of interests
	 */
	@Override
	public List<AttractionPlaceOfInterest> findAll(
		int start, int end,
		OrderByComparator<AttractionPlaceOfInterest> orderByComparator,
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

		List<AttractionPlaceOfInterest> list = null;

		if (useFinderCache) {
			list = (List<AttractionPlaceOfInterest>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ATTRACTIONPLACEOFINTEREST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ATTRACTIONPLACEOFINTEREST;

				sql = sql.concat(
					AttractionPlaceOfInterestModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AttractionPlaceOfInterest>)QueryUtil.list(
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
	 * Removes all the attraction place of interests from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AttractionPlaceOfInterest attractionPlaceOfInterest : findAll()) {
			remove(attractionPlaceOfInterest);
		}
	}

	/**
	 * Returns the number of attraction place of interests.
	 *
	 * @return the number of attraction place of interests
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
					_SQL_COUNT_ATTRACTIONPLACEOFINTEREST);

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
		return "attractionPlaceOfInterestId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ATTRACTIONPLACEOFINTEREST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AttractionPlaceOfInterestModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the attraction place of interest persistence.
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

		AttractionPlaceOfInterestUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AttractionPlaceOfInterestUtil.setPersistence(null);

		entityCache.removeCache(AttractionPlaceOfInterestImpl.class.getName());
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

	private static final String _SQL_SELECT_ATTRACTIONPLACEOFINTEREST =
		"SELECT attractionPlaceOfInterest FROM AttractionPlaceOfInterest attractionPlaceOfInterest";

	private static final String _SQL_SELECT_ATTRACTIONPLACEOFINTEREST_WHERE =
		"SELECT attractionPlaceOfInterest FROM AttractionPlaceOfInterest attractionPlaceOfInterest WHERE ";

	private static final String _SQL_COUNT_ATTRACTIONPLACEOFINTEREST =
		"SELECT COUNT(attractionPlaceOfInterest) FROM AttractionPlaceOfInterest attractionPlaceOfInterest";

	private static final String _SQL_COUNT_ATTRACTIONPLACEOFINTEREST_WHERE =
		"SELECT COUNT(attractionPlaceOfInterest) FROM AttractionPlaceOfInterest attractionPlaceOfInterest WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"attractionPlaceOfInterest.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AttractionPlaceOfInterest exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AttractionPlaceOfInterest exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AttractionPlaceOfInterestPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}