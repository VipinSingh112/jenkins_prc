/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence.impl;

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

import com.nbp.hsra.application.service.exception.NoSuchRadiationDeclarationException;
import com.nbp.hsra.application.service.model.RadiationDeclaration;
import com.nbp.hsra.application.service.model.RadiationDeclarationTable;
import com.nbp.hsra.application.service.model.impl.RadiationDeclarationImpl;
import com.nbp.hsra.application.service.model.impl.RadiationDeclarationModelImpl;
import com.nbp.hsra.application.service.service.persistence.RadiationDeclarationPersistence;
import com.nbp.hsra.application.service.service.persistence.RadiationDeclarationUtil;
import com.nbp.hsra.application.service.service.persistence.impl.constants.HSRA_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the radiation declaration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = RadiationDeclarationPersistence.class)
public class RadiationDeclarationPersistenceImpl
	extends BasePersistenceImpl<RadiationDeclaration>
	implements RadiationDeclarationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RadiationDeclarationUtil</code> to access the radiation declaration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RadiationDeclarationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetHsraById;
	private FinderPath _finderPathCountBygetHsraById;

	/**
	 * Returns the radiation declaration where hsraApplicationId = &#63; or throws a <code>NoSuchRadiationDeclarationException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation declaration
	 * @throws NoSuchRadiationDeclarationException if a matching radiation declaration could not be found
	 */
	@Override
	public RadiationDeclaration findBygetHsraById(long hsraApplicationId)
		throws NoSuchRadiationDeclarationException {

		RadiationDeclaration radiationDeclaration = fetchBygetHsraById(
			hsraApplicationId);

		if (radiationDeclaration == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchRadiationDeclarationException(sb.toString());
		}

		return radiationDeclaration;
	}

	/**
	 * Returns the radiation declaration where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation declaration, or <code>null</code> if a matching radiation declaration could not be found
	 */
	@Override
	public RadiationDeclaration fetchBygetHsraById(long hsraApplicationId) {
		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the radiation declaration where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching radiation declaration, or <code>null</code> if a matching radiation declaration could not be found
	 */
	@Override
	public RadiationDeclaration fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {hsraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHsraById, finderArgs, this);
		}

		if (result instanceof RadiationDeclaration) {
			RadiationDeclaration radiationDeclaration =
				(RadiationDeclaration)result;

			if (hsraApplicationId !=
					radiationDeclaration.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_RADIATIONDECLARATION_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<RadiationDeclaration> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHsraById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {hsraApplicationId};
							}

							_log.warn(
								"RadiationDeclarationPersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					RadiationDeclaration radiationDeclaration = list.get(0);

					result = radiationDeclaration;

					cacheResult(radiationDeclaration);
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
			return (RadiationDeclaration)result;
		}
	}

	/**
	 * Removes the radiation declaration where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the radiation declaration that was removed
	 */
	@Override
	public RadiationDeclaration removeBygetHsraById(long hsraApplicationId)
		throws NoSuchRadiationDeclarationException {

		RadiationDeclaration radiationDeclaration = findBygetHsraById(
			hsraApplicationId);

		return remove(radiationDeclaration);
	}

	/**
	 * Returns the number of radiation declarations where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radiation declarations
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_RADIATIONDECLARATION_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

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

	private static final String _FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2 =
		"radiationDeclaration.hsraApplicationId = ?";

	public RadiationDeclarationPersistenceImpl() {
		setModelClass(RadiationDeclaration.class);

		setModelImplClass(RadiationDeclarationImpl.class);
		setModelPKClass(long.class);

		setTable(RadiationDeclarationTable.INSTANCE);
	}

	/**
	 * Caches the radiation declaration in the entity cache if it is enabled.
	 *
	 * @param radiationDeclaration the radiation declaration
	 */
	@Override
	public void cacheResult(RadiationDeclaration radiationDeclaration) {
		entityCache.putResult(
			RadiationDeclarationImpl.class,
			radiationDeclaration.getPrimaryKey(), radiationDeclaration);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {radiationDeclaration.getHsraApplicationId()},
			radiationDeclaration);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the radiation declarations in the entity cache if it is enabled.
	 *
	 * @param radiationDeclarations the radiation declarations
	 */
	@Override
	public void cacheResult(List<RadiationDeclaration> radiationDeclarations) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (radiationDeclarations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (RadiationDeclaration radiationDeclaration :
				radiationDeclarations) {

			if (entityCache.getResult(
					RadiationDeclarationImpl.class,
					radiationDeclaration.getPrimaryKey()) == null) {

				cacheResult(radiationDeclaration);
			}
		}
	}

	/**
	 * Clears the cache for all radiation declarations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RadiationDeclarationImpl.class);

		finderCache.clearCache(RadiationDeclarationImpl.class);
	}

	/**
	 * Clears the cache for the radiation declaration.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RadiationDeclaration radiationDeclaration) {
		entityCache.removeResult(
			RadiationDeclarationImpl.class, radiationDeclaration);
	}

	@Override
	public void clearCache(List<RadiationDeclaration> radiationDeclarations) {
		for (RadiationDeclaration radiationDeclaration :
				radiationDeclarations) {

			entityCache.removeResult(
				RadiationDeclarationImpl.class, radiationDeclaration);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(RadiationDeclarationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				RadiationDeclarationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		RadiationDeclarationModelImpl radiationDeclarationModelImpl) {

		Object[] args = new Object[] {
			radiationDeclarationModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args, radiationDeclarationModelImpl);
	}

	/**
	 * Creates a new radiation declaration with the primary key. Does not add the radiation declaration to the database.
	 *
	 * @param radiationDeclarationId the primary key for the new radiation declaration
	 * @return the new radiation declaration
	 */
	@Override
	public RadiationDeclaration create(long radiationDeclarationId) {
		RadiationDeclaration radiationDeclaration =
			new RadiationDeclarationImpl();

		radiationDeclaration.setNew(true);
		radiationDeclaration.setPrimaryKey(radiationDeclarationId);

		radiationDeclaration.setCompanyId(CompanyThreadLocal.getCompanyId());

		return radiationDeclaration;
	}

	/**
	 * Removes the radiation declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radiationDeclarationId the primary key of the radiation declaration
	 * @return the radiation declaration that was removed
	 * @throws NoSuchRadiationDeclarationException if a radiation declaration with the primary key could not be found
	 */
	@Override
	public RadiationDeclaration remove(long radiationDeclarationId)
		throws NoSuchRadiationDeclarationException {

		return remove((Serializable)radiationDeclarationId);
	}

	/**
	 * Removes the radiation declaration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the radiation declaration
	 * @return the radiation declaration that was removed
	 * @throws NoSuchRadiationDeclarationException if a radiation declaration with the primary key could not be found
	 */
	@Override
	public RadiationDeclaration remove(Serializable primaryKey)
		throws NoSuchRadiationDeclarationException {

		Session session = null;

		try {
			session = openSession();

			RadiationDeclaration radiationDeclaration =
				(RadiationDeclaration)session.get(
					RadiationDeclarationImpl.class, primaryKey);

			if (radiationDeclaration == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRadiationDeclarationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(radiationDeclaration);
		}
		catch (NoSuchRadiationDeclarationException noSuchEntityException) {
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
	protected RadiationDeclaration removeImpl(
		RadiationDeclaration radiationDeclaration) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(radiationDeclaration)) {
				radiationDeclaration = (RadiationDeclaration)session.get(
					RadiationDeclarationImpl.class,
					radiationDeclaration.getPrimaryKeyObj());
			}

			if (radiationDeclaration != null) {
				session.delete(radiationDeclaration);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (radiationDeclaration != null) {
			clearCache(radiationDeclaration);
		}

		return radiationDeclaration;
	}

	@Override
	public RadiationDeclaration updateImpl(
		RadiationDeclaration radiationDeclaration) {

		boolean isNew = radiationDeclaration.isNew();

		if (!(radiationDeclaration instanceof RadiationDeclarationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(radiationDeclaration.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					radiationDeclaration);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in radiationDeclaration proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom RadiationDeclaration implementation " +
					radiationDeclaration.getClass());
		}

		RadiationDeclarationModelImpl radiationDeclarationModelImpl =
			(RadiationDeclarationModelImpl)radiationDeclaration;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (radiationDeclaration.getCreateDate() == null)) {
			if (serviceContext == null) {
				radiationDeclaration.setCreateDate(date);
			}
			else {
				radiationDeclaration.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!radiationDeclarationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				radiationDeclaration.setModifiedDate(date);
			}
			else {
				radiationDeclaration.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(radiationDeclaration);
			}
			else {
				radiationDeclaration = (RadiationDeclaration)session.merge(
					radiationDeclaration);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			RadiationDeclarationImpl.class, radiationDeclarationModelImpl,
			false, true);

		cacheUniqueFindersCache(radiationDeclarationModelImpl);

		if (isNew) {
			radiationDeclaration.setNew(false);
		}

		radiationDeclaration.resetOriginalValues();

		return radiationDeclaration;
	}

	/**
	 * Returns the radiation declaration with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the radiation declaration
	 * @return the radiation declaration
	 * @throws NoSuchRadiationDeclarationException if a radiation declaration with the primary key could not be found
	 */
	@Override
	public RadiationDeclaration findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRadiationDeclarationException {

		RadiationDeclaration radiationDeclaration = fetchByPrimaryKey(
			primaryKey);

		if (radiationDeclaration == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRadiationDeclarationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return radiationDeclaration;
	}

	/**
	 * Returns the radiation declaration with the primary key or throws a <code>NoSuchRadiationDeclarationException</code> if it could not be found.
	 *
	 * @param radiationDeclarationId the primary key of the radiation declaration
	 * @return the radiation declaration
	 * @throws NoSuchRadiationDeclarationException if a radiation declaration with the primary key could not be found
	 */
	@Override
	public RadiationDeclaration findByPrimaryKey(long radiationDeclarationId)
		throws NoSuchRadiationDeclarationException {

		return findByPrimaryKey((Serializable)radiationDeclarationId);
	}

	/**
	 * Returns the radiation declaration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radiationDeclarationId the primary key of the radiation declaration
	 * @return the radiation declaration, or <code>null</code> if a radiation declaration with the primary key could not be found
	 */
	@Override
	public RadiationDeclaration fetchByPrimaryKey(long radiationDeclarationId) {
		return fetchByPrimaryKey((Serializable)radiationDeclarationId);
	}

	/**
	 * Returns all the radiation declarations.
	 *
	 * @return the radiation declarations
	 */
	@Override
	public List<RadiationDeclaration> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the radiation declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation declarations
	 * @param end the upper bound of the range of radiation declarations (not inclusive)
	 * @return the range of radiation declarations
	 */
	@Override
	public List<RadiationDeclaration> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the radiation declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation declarations
	 * @param end the upper bound of the range of radiation declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radiation declarations
	 */
	@Override
	public List<RadiationDeclaration> findAll(
		int start, int end,
		OrderByComparator<RadiationDeclaration> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the radiation declarations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDeclarationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation declarations
	 * @param end the upper bound of the range of radiation declarations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radiation declarations
	 */
	@Override
	public List<RadiationDeclaration> findAll(
		int start, int end,
		OrderByComparator<RadiationDeclaration> orderByComparator,
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

		List<RadiationDeclaration> list = null;

		if (useFinderCache) {
			list = (List<RadiationDeclaration>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_RADIATIONDECLARATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_RADIATIONDECLARATION;

				sql = sql.concat(RadiationDeclarationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<RadiationDeclaration>)QueryUtil.list(
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
	 * Removes all the radiation declarations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RadiationDeclaration radiationDeclaration : findAll()) {
			remove(radiationDeclaration);
		}
	}

	/**
	 * Returns the number of radiation declarations.
	 *
	 * @return the number of radiation declarations
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
					_SQL_COUNT_RADIATIONDECLARATION);

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
		return "radiationDeclarationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_RADIATIONDECLARATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return RadiationDeclarationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the radiation declaration persistence.
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

		_finderPathFetchBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, true);

		_finderPathCountBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, false);

		RadiationDeclarationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		RadiationDeclarationUtil.setPersistence(null);

		entityCache.removeCache(RadiationDeclarationImpl.class.getName());
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_RADIATIONDECLARATION =
		"SELECT radiationDeclaration FROM RadiationDeclaration radiationDeclaration";

	private static final String _SQL_SELECT_RADIATIONDECLARATION_WHERE =
		"SELECT radiationDeclaration FROM RadiationDeclaration radiationDeclaration WHERE ";

	private static final String _SQL_COUNT_RADIATIONDECLARATION =
		"SELECT COUNT(radiationDeclaration) FROM RadiationDeclaration radiationDeclaration";

	private static final String _SQL_COUNT_RADIATIONDECLARATION_WHERE =
		"SELECT COUNT(radiationDeclaration) FROM RadiationDeclaration radiationDeclaration WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"radiationDeclaration.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No RadiationDeclaration exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No RadiationDeclaration exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		RadiationDeclarationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}