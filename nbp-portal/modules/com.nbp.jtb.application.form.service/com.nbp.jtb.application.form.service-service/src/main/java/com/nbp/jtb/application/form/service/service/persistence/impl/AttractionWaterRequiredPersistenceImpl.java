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

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionWaterRequiredException;
import com.nbp.jtb.application.form.service.model.AttractionWaterRequired;
import com.nbp.jtb.application.form.service.model.AttractionWaterRequiredTable;
import com.nbp.jtb.application.form.service.model.impl.AttractionWaterRequiredImpl;
import com.nbp.jtb.application.form.service.model.impl.AttractionWaterRequiredModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AttractionWaterRequiredPersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionWaterRequiredUtil;
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
 * The persistence implementation for the attraction water required service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AttractionWaterRequiredPersistence.class)
public class AttractionWaterRequiredPersistenceImpl
	extends BasePersistenceImpl<AttractionWaterRequired>
	implements AttractionWaterRequiredPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AttractionWaterRequiredUtil</code> to access the attraction water required persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AttractionWaterRequiredImpl.class.getName();

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
	 * Returns the attraction water required where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionWaterRequiredException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water required
	 * @throws NoSuchAttractionWaterRequiredException if a matching attraction water required could not be found
	 */
	@Override
	public AttractionWaterRequired findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionWaterRequiredException {

		AttractionWaterRequired attractionWaterRequired =
			fetchBygetJTB_ByApplicationId(jtbApplicationId);

		if (attractionWaterRequired == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAttractionWaterRequiredException(sb.toString());
		}

		return attractionWaterRequired;
	}

	/**
	 * Returns the attraction water required where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water required, or <code>null</code> if a matching attraction water required could not be found
	 */
	@Override
	public AttractionWaterRequired fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the attraction water required where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction water required, or <code>null</code> if a matching attraction water required could not be found
	 */
	@Override
	public AttractionWaterRequired fetchBygetJTB_ByApplicationId(
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

		if (result instanceof AttractionWaterRequired) {
			AttractionWaterRequired attractionWaterRequired =
				(AttractionWaterRequired)result;

			if (jtbApplicationId !=
					attractionWaterRequired.getJtbApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ATTRACTIONWATERREQUIRED_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AttractionWaterRequired> list = query.list();

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
								"AttractionWaterRequiredPersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AttractionWaterRequired attractionWaterRequired = list.get(
						0);

					result = attractionWaterRequired;

					cacheResult(attractionWaterRequired);
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
			return (AttractionWaterRequired)result;
		}
	}

	/**
	 * Removes the attraction water required where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction water required that was removed
	 */
	@Override
	public AttractionWaterRequired removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionWaterRequiredException {

		AttractionWaterRequired attractionWaterRequired =
			findBygetJTB_ByApplicationId(jtbApplicationId);

		return remove(attractionWaterRequired);
	}

	/**
	 * Returns the number of attraction water requireds where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction water requireds
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ATTRACTIONWATERREQUIRED_WHERE);

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
			"attractionWaterRequired.jtbApplicationId = ?";

	public AttractionWaterRequiredPersistenceImpl() {
		setModelClass(AttractionWaterRequired.class);

		setModelImplClass(AttractionWaterRequiredImpl.class);
		setModelPKClass(long.class);

		setTable(AttractionWaterRequiredTable.INSTANCE);
	}

	/**
	 * Caches the attraction water required in the entity cache if it is enabled.
	 *
	 * @param attractionWaterRequired the attraction water required
	 */
	@Override
	public void cacheResult(AttractionWaterRequired attractionWaterRequired) {
		entityCache.putResult(
			AttractionWaterRequiredImpl.class,
			attractionWaterRequired.getPrimaryKey(), attractionWaterRequired);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {attractionWaterRequired.getJtbApplicationId()},
			attractionWaterRequired);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the attraction water requireds in the entity cache if it is enabled.
	 *
	 * @param attractionWaterRequireds the attraction water requireds
	 */
	@Override
	public void cacheResult(
		List<AttractionWaterRequired> attractionWaterRequireds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (attractionWaterRequireds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AttractionWaterRequired attractionWaterRequired :
				attractionWaterRequireds) {

			if (entityCache.getResult(
					AttractionWaterRequiredImpl.class,
					attractionWaterRequired.getPrimaryKey()) == null) {

				cacheResult(attractionWaterRequired);
			}
		}
	}

	/**
	 * Clears the cache for all attraction water requireds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AttractionWaterRequiredImpl.class);

		finderCache.clearCache(AttractionWaterRequiredImpl.class);
	}

	/**
	 * Clears the cache for the attraction water required.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AttractionWaterRequired attractionWaterRequired) {
		entityCache.removeResult(
			AttractionWaterRequiredImpl.class, attractionWaterRequired);
	}

	@Override
	public void clearCache(
		List<AttractionWaterRequired> attractionWaterRequireds) {

		for (AttractionWaterRequired attractionWaterRequired :
				attractionWaterRequireds) {

			entityCache.removeResult(
				AttractionWaterRequiredImpl.class, attractionWaterRequired);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AttractionWaterRequiredImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AttractionWaterRequiredImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AttractionWaterRequiredModelImpl attractionWaterRequiredModelImpl) {

		Object[] args = new Object[] {
			attractionWaterRequiredModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			attractionWaterRequiredModelImpl);
	}

	/**
	 * Creates a new attraction water required with the primary key. Does not add the attraction water required to the database.
	 *
	 * @param attractionWaterRequiredId the primary key for the new attraction water required
	 * @return the new attraction water required
	 */
	@Override
	public AttractionWaterRequired create(long attractionWaterRequiredId) {
		AttractionWaterRequired attractionWaterRequired =
			new AttractionWaterRequiredImpl();

		attractionWaterRequired.setNew(true);
		attractionWaterRequired.setPrimaryKey(attractionWaterRequiredId);

		attractionWaterRequired.setCompanyId(CompanyThreadLocal.getCompanyId());

		return attractionWaterRequired;
	}

	/**
	 * Removes the attraction water required with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionWaterRequiredId the primary key of the attraction water required
	 * @return the attraction water required that was removed
	 * @throws NoSuchAttractionWaterRequiredException if a attraction water required with the primary key could not be found
	 */
	@Override
	public AttractionWaterRequired remove(long attractionWaterRequiredId)
		throws NoSuchAttractionWaterRequiredException {

		return remove((Serializable)attractionWaterRequiredId);
	}

	/**
	 * Removes the attraction water required with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attraction water required
	 * @return the attraction water required that was removed
	 * @throws NoSuchAttractionWaterRequiredException if a attraction water required with the primary key could not be found
	 */
	@Override
	public AttractionWaterRequired remove(Serializable primaryKey)
		throws NoSuchAttractionWaterRequiredException {

		Session session = null;

		try {
			session = openSession();

			AttractionWaterRequired attractionWaterRequired =
				(AttractionWaterRequired)session.get(
					AttractionWaterRequiredImpl.class, primaryKey);

			if (attractionWaterRequired == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttractionWaterRequiredException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(attractionWaterRequired);
		}
		catch (NoSuchAttractionWaterRequiredException noSuchEntityException) {
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
	protected AttractionWaterRequired removeImpl(
		AttractionWaterRequired attractionWaterRequired) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attractionWaterRequired)) {
				attractionWaterRequired = (AttractionWaterRequired)session.get(
					AttractionWaterRequiredImpl.class,
					attractionWaterRequired.getPrimaryKeyObj());
			}

			if (attractionWaterRequired != null) {
				session.delete(attractionWaterRequired);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (attractionWaterRequired != null) {
			clearCache(attractionWaterRequired);
		}

		return attractionWaterRequired;
	}

	@Override
	public AttractionWaterRequired updateImpl(
		AttractionWaterRequired attractionWaterRequired) {

		boolean isNew = attractionWaterRequired.isNew();

		if (!(attractionWaterRequired instanceof
				AttractionWaterRequiredModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(attractionWaterRequired.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					attractionWaterRequired);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in attractionWaterRequired proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AttractionWaterRequired implementation " +
					attractionWaterRequired.getClass());
		}

		AttractionWaterRequiredModelImpl attractionWaterRequiredModelImpl =
			(AttractionWaterRequiredModelImpl)attractionWaterRequired;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (attractionWaterRequired.getCreateDate() == null)) {
			if (serviceContext == null) {
				attractionWaterRequired.setCreateDate(date);
			}
			else {
				attractionWaterRequired.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!attractionWaterRequiredModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				attractionWaterRequired.setModifiedDate(date);
			}
			else {
				attractionWaterRequired.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(attractionWaterRequired);
			}
			else {
				attractionWaterRequired =
					(AttractionWaterRequired)session.merge(
						attractionWaterRequired);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AttractionWaterRequiredImpl.class, attractionWaterRequiredModelImpl,
			false, true);

		cacheUniqueFindersCache(attractionWaterRequiredModelImpl);

		if (isNew) {
			attractionWaterRequired.setNew(false);
		}

		attractionWaterRequired.resetOriginalValues();

		return attractionWaterRequired;
	}

	/**
	 * Returns the attraction water required with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attraction water required
	 * @return the attraction water required
	 * @throws NoSuchAttractionWaterRequiredException if a attraction water required with the primary key could not be found
	 */
	@Override
	public AttractionWaterRequired findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttractionWaterRequiredException {

		AttractionWaterRequired attractionWaterRequired = fetchByPrimaryKey(
			primaryKey);

		if (attractionWaterRequired == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttractionWaterRequiredException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return attractionWaterRequired;
	}

	/**
	 * Returns the attraction water required with the primary key or throws a <code>NoSuchAttractionWaterRequiredException</code> if it could not be found.
	 *
	 * @param attractionWaterRequiredId the primary key of the attraction water required
	 * @return the attraction water required
	 * @throws NoSuchAttractionWaterRequiredException if a attraction water required with the primary key could not be found
	 */
	@Override
	public AttractionWaterRequired findByPrimaryKey(
			long attractionWaterRequiredId)
		throws NoSuchAttractionWaterRequiredException {

		return findByPrimaryKey((Serializable)attractionWaterRequiredId);
	}

	/**
	 * Returns the attraction water required with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionWaterRequiredId the primary key of the attraction water required
	 * @return the attraction water required, or <code>null</code> if a attraction water required with the primary key could not be found
	 */
	@Override
	public AttractionWaterRequired fetchByPrimaryKey(
		long attractionWaterRequiredId) {

		return fetchByPrimaryKey((Serializable)attractionWaterRequiredId);
	}

	/**
	 * Returns all the attraction water requireds.
	 *
	 * @return the attraction water requireds
	 */
	@Override
	public List<AttractionWaterRequired> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the attraction water requireds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterRequiredModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water requireds
	 * @param end the upper bound of the range of attraction water requireds (not inclusive)
	 * @return the range of attraction water requireds
	 */
	@Override
	public List<AttractionWaterRequired> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the attraction water requireds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterRequiredModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water requireds
	 * @param end the upper bound of the range of attraction water requireds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction water requireds
	 */
	@Override
	public List<AttractionWaterRequired> findAll(
		int start, int end,
		OrderByComparator<AttractionWaterRequired> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the attraction water requireds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterRequiredModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water requireds
	 * @param end the upper bound of the range of attraction water requireds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction water requireds
	 */
	@Override
	public List<AttractionWaterRequired> findAll(
		int start, int end,
		OrderByComparator<AttractionWaterRequired> orderByComparator,
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

		List<AttractionWaterRequired> list = null;

		if (useFinderCache) {
			list = (List<AttractionWaterRequired>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ATTRACTIONWATERREQUIRED);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ATTRACTIONWATERREQUIRED;

				sql = sql.concat(
					AttractionWaterRequiredModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AttractionWaterRequired>)QueryUtil.list(
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
	 * Removes all the attraction water requireds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AttractionWaterRequired attractionWaterRequired : findAll()) {
			remove(attractionWaterRequired);
		}
	}

	/**
	 * Returns the number of attraction water requireds.
	 *
	 * @return the number of attraction water requireds
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
					_SQL_COUNT_ATTRACTIONWATERREQUIRED);

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
		return "attractionWaterRequiredId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ATTRACTIONWATERREQUIRED;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AttractionWaterRequiredModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the attraction water required persistence.
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

		AttractionWaterRequiredUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AttractionWaterRequiredUtil.setPersistence(null);

		entityCache.removeCache(AttractionWaterRequiredImpl.class.getName());
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

	private static final String _SQL_SELECT_ATTRACTIONWATERREQUIRED =
		"SELECT attractionWaterRequired FROM AttractionWaterRequired attractionWaterRequired";

	private static final String _SQL_SELECT_ATTRACTIONWATERREQUIRED_WHERE =
		"SELECT attractionWaterRequired FROM AttractionWaterRequired attractionWaterRequired WHERE ";

	private static final String _SQL_COUNT_ATTRACTIONWATERREQUIRED =
		"SELECT COUNT(attractionWaterRequired) FROM AttractionWaterRequired attractionWaterRequired";

	private static final String _SQL_COUNT_ATTRACTIONWATERREQUIRED_WHERE =
		"SELECT COUNT(attractionWaterRequired) FROM AttractionWaterRequired attractionWaterRequired WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"attractionWaterRequired.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AttractionWaterRequired exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AttractionWaterRequired exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AttractionWaterRequiredPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}