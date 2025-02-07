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

import com.nbp.hsra.application.service.exception.NoSuchRadiationProtectionSecOneException;
import com.nbp.hsra.application.service.model.RadiationProtectionSecOne;
import com.nbp.hsra.application.service.model.RadiationProtectionSecOneTable;
import com.nbp.hsra.application.service.model.impl.RadiationProtectionSecOneImpl;
import com.nbp.hsra.application.service.model.impl.RadiationProtectionSecOneModelImpl;
import com.nbp.hsra.application.service.service.persistence.RadiationProtectionSecOnePersistence;
import com.nbp.hsra.application.service.service.persistence.RadiationProtectionSecOneUtil;
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
 * The persistence implementation for the radiation protection sec one service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = RadiationProtectionSecOnePersistence.class)
public class RadiationProtectionSecOnePersistenceImpl
	extends BasePersistenceImpl<RadiationProtectionSecOne>
	implements RadiationProtectionSecOnePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RadiationProtectionSecOneUtil</code> to access the radiation protection sec one persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RadiationProtectionSecOneImpl.class.getName();

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
	 * Returns the radiation protection sec one where hsraApplicationId = &#63; or throws a <code>NoSuchRadiationProtectionSecOneException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation protection sec one
	 * @throws NoSuchRadiationProtectionSecOneException if a matching radiation protection sec one could not be found
	 */
	@Override
	public RadiationProtectionSecOne findBygetHsraById(long hsraApplicationId)
		throws NoSuchRadiationProtectionSecOneException {

		RadiationProtectionSecOne radiationProtectionSecOne =
			fetchBygetHsraById(hsraApplicationId);

		if (radiationProtectionSecOne == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchRadiationProtectionSecOneException(sb.toString());
		}

		return radiationProtectionSecOne;
	}

	/**
	 * Returns the radiation protection sec one where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation protection sec one, or <code>null</code> if a matching radiation protection sec one could not be found
	 */
	@Override
	public RadiationProtectionSecOne fetchBygetHsraById(
		long hsraApplicationId) {

		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the radiation protection sec one where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching radiation protection sec one, or <code>null</code> if a matching radiation protection sec one could not be found
	 */
	@Override
	public RadiationProtectionSecOne fetchBygetHsraById(
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

		if (result instanceof RadiationProtectionSecOne) {
			RadiationProtectionSecOne radiationProtectionSecOne =
				(RadiationProtectionSecOne)result;

			if (hsraApplicationId !=
					radiationProtectionSecOne.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_RADIATIONPROTECTIONSECONE_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<RadiationProtectionSecOne> list = query.list();

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
								"RadiationProtectionSecOnePersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					RadiationProtectionSecOne radiationProtectionSecOne =
						list.get(0);

					result = radiationProtectionSecOne;

					cacheResult(radiationProtectionSecOne);
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
			return (RadiationProtectionSecOne)result;
		}
	}

	/**
	 * Removes the radiation protection sec one where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the radiation protection sec one that was removed
	 */
	@Override
	public RadiationProtectionSecOne removeBygetHsraById(long hsraApplicationId)
		throws NoSuchRadiationProtectionSecOneException {

		RadiationProtectionSecOne radiationProtectionSecOne = findBygetHsraById(
			hsraApplicationId);

		return remove(radiationProtectionSecOne);
	}

	/**
	 * Returns the number of radiation protection sec ones where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radiation protection sec ones
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_RADIATIONPROTECTIONSECONE_WHERE);

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
		"radiationProtectionSecOne.hsraApplicationId = ?";

	public RadiationProtectionSecOnePersistenceImpl() {
		setModelClass(RadiationProtectionSecOne.class);

		setModelImplClass(RadiationProtectionSecOneImpl.class);
		setModelPKClass(long.class);

		setTable(RadiationProtectionSecOneTable.INSTANCE);
	}

	/**
	 * Caches the radiation protection sec one in the entity cache if it is enabled.
	 *
	 * @param radiationProtectionSecOne the radiation protection sec one
	 */
	@Override
	public void cacheResult(
		RadiationProtectionSecOne radiationProtectionSecOne) {

		entityCache.putResult(
			RadiationProtectionSecOneImpl.class,
			radiationProtectionSecOne.getPrimaryKey(),
			radiationProtectionSecOne);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {radiationProtectionSecOne.getHsraApplicationId()},
			radiationProtectionSecOne);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the radiation protection sec ones in the entity cache if it is enabled.
	 *
	 * @param radiationProtectionSecOnes the radiation protection sec ones
	 */
	@Override
	public void cacheResult(
		List<RadiationProtectionSecOne> radiationProtectionSecOnes) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (radiationProtectionSecOnes.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (RadiationProtectionSecOne radiationProtectionSecOne :
				radiationProtectionSecOnes) {

			if (entityCache.getResult(
					RadiationProtectionSecOneImpl.class,
					radiationProtectionSecOne.getPrimaryKey()) == null) {

				cacheResult(radiationProtectionSecOne);
			}
		}
	}

	/**
	 * Clears the cache for all radiation protection sec ones.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RadiationProtectionSecOneImpl.class);

		finderCache.clearCache(RadiationProtectionSecOneImpl.class);
	}

	/**
	 * Clears the cache for the radiation protection sec one.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		RadiationProtectionSecOne radiationProtectionSecOne) {

		entityCache.removeResult(
			RadiationProtectionSecOneImpl.class, radiationProtectionSecOne);
	}

	@Override
	public void clearCache(
		List<RadiationProtectionSecOne> radiationProtectionSecOnes) {

		for (RadiationProtectionSecOne radiationProtectionSecOne :
				radiationProtectionSecOnes) {

			entityCache.removeResult(
				RadiationProtectionSecOneImpl.class, radiationProtectionSecOne);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(RadiationProtectionSecOneImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				RadiationProtectionSecOneImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		RadiationProtectionSecOneModelImpl radiationProtectionSecOneModelImpl) {

		Object[] args = new Object[] {
			radiationProtectionSecOneModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args,
			radiationProtectionSecOneModelImpl);
	}

	/**
	 * Creates a new radiation protection sec one with the primary key. Does not add the radiation protection sec one to the database.
	 *
	 * @param radiationProtectSecOneId the primary key for the new radiation protection sec one
	 * @return the new radiation protection sec one
	 */
	@Override
	public RadiationProtectionSecOne create(long radiationProtectSecOneId) {
		RadiationProtectionSecOne radiationProtectionSecOne =
			new RadiationProtectionSecOneImpl();

		radiationProtectionSecOne.setNew(true);
		radiationProtectionSecOne.setPrimaryKey(radiationProtectSecOneId);

		radiationProtectionSecOne.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return radiationProtectionSecOne;
	}

	/**
	 * Removes the radiation protection sec one with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radiationProtectSecOneId the primary key of the radiation protection sec one
	 * @return the radiation protection sec one that was removed
	 * @throws NoSuchRadiationProtectionSecOneException if a radiation protection sec one with the primary key could not be found
	 */
	@Override
	public RadiationProtectionSecOne remove(long radiationProtectSecOneId)
		throws NoSuchRadiationProtectionSecOneException {

		return remove((Serializable)radiationProtectSecOneId);
	}

	/**
	 * Removes the radiation protection sec one with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the radiation protection sec one
	 * @return the radiation protection sec one that was removed
	 * @throws NoSuchRadiationProtectionSecOneException if a radiation protection sec one with the primary key could not be found
	 */
	@Override
	public RadiationProtectionSecOne remove(Serializable primaryKey)
		throws NoSuchRadiationProtectionSecOneException {

		Session session = null;

		try {
			session = openSession();

			RadiationProtectionSecOne radiationProtectionSecOne =
				(RadiationProtectionSecOne)session.get(
					RadiationProtectionSecOneImpl.class, primaryKey);

			if (radiationProtectionSecOne == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRadiationProtectionSecOneException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(radiationProtectionSecOne);
		}
		catch (NoSuchRadiationProtectionSecOneException noSuchEntityException) {
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
	protected RadiationProtectionSecOne removeImpl(
		RadiationProtectionSecOne radiationProtectionSecOne) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(radiationProtectionSecOne)) {
				radiationProtectionSecOne =
					(RadiationProtectionSecOne)session.get(
						RadiationProtectionSecOneImpl.class,
						radiationProtectionSecOne.getPrimaryKeyObj());
			}

			if (radiationProtectionSecOne != null) {
				session.delete(radiationProtectionSecOne);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (radiationProtectionSecOne != null) {
			clearCache(radiationProtectionSecOne);
		}

		return radiationProtectionSecOne;
	}

	@Override
	public RadiationProtectionSecOne updateImpl(
		RadiationProtectionSecOne radiationProtectionSecOne) {

		boolean isNew = radiationProtectionSecOne.isNew();

		if (!(radiationProtectionSecOne instanceof
				RadiationProtectionSecOneModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(radiationProtectionSecOne.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					radiationProtectionSecOne);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in radiationProtectionSecOne proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom RadiationProtectionSecOne implementation " +
					radiationProtectionSecOne.getClass());
		}

		RadiationProtectionSecOneModelImpl radiationProtectionSecOneModelImpl =
			(RadiationProtectionSecOneModelImpl)radiationProtectionSecOne;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (radiationProtectionSecOne.getCreateDate() == null)) {
			if (serviceContext == null) {
				radiationProtectionSecOne.setCreateDate(date);
			}
			else {
				radiationProtectionSecOne.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!radiationProtectionSecOneModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				radiationProtectionSecOne.setModifiedDate(date);
			}
			else {
				radiationProtectionSecOne.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(radiationProtectionSecOne);
			}
			else {
				radiationProtectionSecOne =
					(RadiationProtectionSecOne)session.merge(
						radiationProtectionSecOne);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			RadiationProtectionSecOneImpl.class,
			radiationProtectionSecOneModelImpl, false, true);

		cacheUniqueFindersCache(radiationProtectionSecOneModelImpl);

		if (isNew) {
			radiationProtectionSecOne.setNew(false);
		}

		radiationProtectionSecOne.resetOriginalValues();

		return radiationProtectionSecOne;
	}

	/**
	 * Returns the radiation protection sec one with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the radiation protection sec one
	 * @return the radiation protection sec one
	 * @throws NoSuchRadiationProtectionSecOneException if a radiation protection sec one with the primary key could not be found
	 */
	@Override
	public RadiationProtectionSecOne findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRadiationProtectionSecOneException {

		RadiationProtectionSecOne radiationProtectionSecOne = fetchByPrimaryKey(
			primaryKey);

		if (radiationProtectionSecOne == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRadiationProtectionSecOneException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return radiationProtectionSecOne;
	}

	/**
	 * Returns the radiation protection sec one with the primary key or throws a <code>NoSuchRadiationProtectionSecOneException</code> if it could not be found.
	 *
	 * @param radiationProtectSecOneId the primary key of the radiation protection sec one
	 * @return the radiation protection sec one
	 * @throws NoSuchRadiationProtectionSecOneException if a radiation protection sec one with the primary key could not be found
	 */
	@Override
	public RadiationProtectionSecOne findByPrimaryKey(
			long radiationProtectSecOneId)
		throws NoSuchRadiationProtectionSecOneException {

		return findByPrimaryKey((Serializable)radiationProtectSecOneId);
	}

	/**
	 * Returns the radiation protection sec one with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radiationProtectSecOneId the primary key of the radiation protection sec one
	 * @return the radiation protection sec one, or <code>null</code> if a radiation protection sec one with the primary key could not be found
	 */
	@Override
	public RadiationProtectionSecOne fetchByPrimaryKey(
		long radiationProtectSecOneId) {

		return fetchByPrimaryKey((Serializable)radiationProtectSecOneId);
	}

	/**
	 * Returns all the radiation protection sec ones.
	 *
	 * @return the radiation protection sec ones
	 */
	@Override
	public List<RadiationProtectionSecOne> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the radiation protection sec ones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationProtectionSecOneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation protection sec ones
	 * @param end the upper bound of the range of radiation protection sec ones (not inclusive)
	 * @return the range of radiation protection sec ones
	 */
	@Override
	public List<RadiationProtectionSecOne> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the radiation protection sec ones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationProtectionSecOneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation protection sec ones
	 * @param end the upper bound of the range of radiation protection sec ones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radiation protection sec ones
	 */
	@Override
	public List<RadiationProtectionSecOne> findAll(
		int start, int end,
		OrderByComparator<RadiationProtectionSecOne> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the radiation protection sec ones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationProtectionSecOneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation protection sec ones
	 * @param end the upper bound of the range of radiation protection sec ones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radiation protection sec ones
	 */
	@Override
	public List<RadiationProtectionSecOne> findAll(
		int start, int end,
		OrderByComparator<RadiationProtectionSecOne> orderByComparator,
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

		List<RadiationProtectionSecOne> list = null;

		if (useFinderCache) {
			list = (List<RadiationProtectionSecOne>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_RADIATIONPROTECTIONSECONE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_RADIATIONPROTECTIONSECONE;

				sql = sql.concat(
					RadiationProtectionSecOneModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<RadiationProtectionSecOne>)QueryUtil.list(
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
	 * Removes all the radiation protection sec ones from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RadiationProtectionSecOne radiationProtectionSecOne : findAll()) {
			remove(radiationProtectionSecOne);
		}
	}

	/**
	 * Returns the number of radiation protection sec ones.
	 *
	 * @return the number of radiation protection sec ones
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
					_SQL_COUNT_RADIATIONPROTECTIONSECONE);

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
		return "radiationProtectSecOneId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_RADIATIONPROTECTIONSECONE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return RadiationProtectionSecOneModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the radiation protection sec one persistence.
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

		RadiationProtectionSecOneUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		RadiationProtectionSecOneUtil.setPersistence(null);

		entityCache.removeCache(RadiationProtectionSecOneImpl.class.getName());
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

	private static final String _SQL_SELECT_RADIATIONPROTECTIONSECONE =
		"SELECT radiationProtectionSecOne FROM RadiationProtectionSecOne radiationProtectionSecOne";

	private static final String _SQL_SELECT_RADIATIONPROTECTIONSECONE_WHERE =
		"SELECT radiationProtectionSecOne FROM RadiationProtectionSecOne radiationProtectionSecOne WHERE ";

	private static final String _SQL_COUNT_RADIATIONPROTECTIONSECONE =
		"SELECT COUNT(radiationProtectionSecOne) FROM RadiationProtectionSecOne radiationProtectionSecOne";

	private static final String _SQL_COUNT_RADIATIONPROTECTIONSECONE_WHERE =
		"SELECT COUNT(radiationProtectionSecOne) FROM RadiationProtectionSecOne radiationProtectionSecOne WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"radiationProtectionSecOne.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No RadiationProtectionSecOne exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No RadiationProtectionSecOne exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		RadiationProtectionSecOnePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}