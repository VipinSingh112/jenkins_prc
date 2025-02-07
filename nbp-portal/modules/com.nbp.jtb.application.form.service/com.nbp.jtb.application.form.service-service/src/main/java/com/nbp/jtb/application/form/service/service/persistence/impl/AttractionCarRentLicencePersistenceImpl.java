/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
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
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionCarRentLicenceException;
import com.nbp.jtb.application.form.service.model.AttractionCarRentLicence;
import com.nbp.jtb.application.form.service.model.AttractionCarRentLicenceTable;
import com.nbp.jtb.application.form.service.model.impl.AttractionCarRentLicenceImpl;
import com.nbp.jtb.application.form.service.model.impl.AttractionCarRentLicenceModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AttractionCarRentLicencePersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionCarRentLicenceUtil;
import com.nbp.jtb.application.form.service.service.persistence.impl.constants.JTB_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
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
 * The persistence implementation for the attraction car rent licence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {AttractionCarRentLicencePersistence.class, BasePersistence.class}
)
public class AttractionCarRentLicencePersistenceImpl
	extends BasePersistenceImpl<AttractionCarRentLicence>
	implements AttractionCarRentLicencePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AttractionCarRentLicenceUtil</code> to access the attraction car rent licence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AttractionCarRentLicenceImpl.class.getName();

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
	 * Returns the attraction car rent licence where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionCarRentLicenceException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction car rent licence
	 * @throws NoSuchAttractionCarRentLicenceException if a matching attraction car rent licence could not be found
	 */
	@Override
	public AttractionCarRentLicence findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionCarRentLicenceException {

		AttractionCarRentLicence attractionCarRentLicence =
			fetchBygetJTB_ByApplicationId(jtbApplicationId);

		if (attractionCarRentLicence == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAttractionCarRentLicenceException(sb.toString());
		}

		return attractionCarRentLicence;
	}

	/**
	 * Returns the attraction car rent licence where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction car rent licence, or <code>null</code> if a matching attraction car rent licence could not be found
	 */
	@Override
	public AttractionCarRentLicence fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the attraction car rent licence where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction car rent licence, or <code>null</code> if a matching attraction car rent licence could not be found
	 */
	@Override
	public AttractionCarRentLicence fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {jtbApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJTB_ByApplicationId, finderArgs,this);
		}

		if (result instanceof AttractionCarRentLicence) {
			AttractionCarRentLicence attractionCarRentLicence =
				(AttractionCarRentLicence)result;

			if (jtbApplicationId !=
					attractionCarRentLicence.getJtbApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ATTRACTIONCARRENTLICENCE_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AttractionCarRentLicence> list = query.list();

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
								"AttractionCarRentLicencePersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AttractionCarRentLicence attractionCarRentLicence =
						list.get(0);

					result = attractionCarRentLicence;

					cacheResult(attractionCarRentLicence);
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
			return (AttractionCarRentLicence)result;
		}
	}

	/**
	 * Removes the attraction car rent licence where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction car rent licence that was removed
	 */
	@Override
	public AttractionCarRentLicence removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionCarRentLicenceException {

		AttractionCarRentLicence attractionCarRentLicence =
			findBygetJTB_ByApplicationId(jtbApplicationId);

		return remove(attractionCarRentLicence);
	}

	/**
	 * Returns the number of attraction car rent licences where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction car rent licences
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ATTRACTIONCARRENTLICENCE_WHERE);

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
			"attractionCarRentLicence.jtbApplicationId = ?";

	public AttractionCarRentLicencePersistenceImpl() {
		setModelClass(AttractionCarRentLicence.class);

		setModelImplClass(AttractionCarRentLicenceImpl.class);
		setModelPKClass(long.class);

		setTable(AttractionCarRentLicenceTable.INSTANCE);
	}

	/**
	 * Caches the attraction car rent licence in the entity cache if it is enabled.
	 *
	 * @param attractionCarRentLicence the attraction car rent licence
	 */
	@Override
	public void cacheResult(AttractionCarRentLicence attractionCarRentLicence) {
		entityCache.putResult(
			AttractionCarRentLicenceImpl.class,
			attractionCarRentLicence.getPrimaryKey(), attractionCarRentLicence);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {attractionCarRentLicence.getJtbApplicationId()},
			attractionCarRentLicence);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the attraction car rent licences in the entity cache if it is enabled.
	 *
	 * @param attractionCarRentLicences the attraction car rent licences
	 */
	@Override
	public void cacheResult(
		List<AttractionCarRentLicence> attractionCarRentLicences) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (attractionCarRentLicences.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AttractionCarRentLicence attractionCarRentLicence :
				attractionCarRentLicences) {

			if (entityCache.getResult(
					AttractionCarRentLicenceImpl.class,
					attractionCarRentLicence.getPrimaryKey()) == null) {

				cacheResult(attractionCarRentLicence);
			}
		}
	}

	/**
	 * Clears the cache for all attraction car rent licences.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AttractionCarRentLicenceImpl.class);

		finderCache.clearCache(AttractionCarRentLicenceImpl.class);
	}

	/**
	 * Clears the cache for the attraction car rent licence.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AttractionCarRentLicence attractionCarRentLicence) {
		entityCache.removeResult(
			AttractionCarRentLicenceImpl.class, attractionCarRentLicence);
	}

	@Override
	public void clearCache(
		List<AttractionCarRentLicence> attractionCarRentLicences) {

		for (AttractionCarRentLicence attractionCarRentLicence :
				attractionCarRentLicences) {

			entityCache.removeResult(
				AttractionCarRentLicenceImpl.class, attractionCarRentLicence);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AttractionCarRentLicenceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AttractionCarRentLicenceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AttractionCarRentLicenceModelImpl attractionCarRentLicenceModelImpl) {

		Object[] args = new Object[] {
			attractionCarRentLicenceModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			attractionCarRentLicenceModelImpl);
	}

	/**
	 * Creates a new attraction car rent licence with the primary key. Does not add the attraction car rent licence to the database.
	 *
	 * @param attractionCarRentLicenceId the primary key for the new attraction car rent licence
	 * @return the new attraction car rent licence
	 */
	@Override
	public AttractionCarRentLicence create(long attractionCarRentLicenceId) {
		AttractionCarRentLicence attractionCarRentLicence =
			new AttractionCarRentLicenceImpl();

		attractionCarRentLicence.setNew(true);
		attractionCarRentLicence.setPrimaryKey(attractionCarRentLicenceId);

		attractionCarRentLicence.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return attractionCarRentLicence;
	}

	/**
	 * Removes the attraction car rent licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionCarRentLicenceId the primary key of the attraction car rent licence
	 * @return the attraction car rent licence that was removed
	 * @throws NoSuchAttractionCarRentLicenceException if a attraction car rent licence with the primary key could not be found
	 */
	@Override
	public AttractionCarRentLicence remove(long attractionCarRentLicenceId)
		throws NoSuchAttractionCarRentLicenceException {

		return remove((Serializable)attractionCarRentLicenceId);
	}

	/**
	 * Removes the attraction car rent licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attraction car rent licence
	 * @return the attraction car rent licence that was removed
	 * @throws NoSuchAttractionCarRentLicenceException if a attraction car rent licence with the primary key could not be found
	 */
	@Override
	public AttractionCarRentLicence remove(Serializable primaryKey)
		throws NoSuchAttractionCarRentLicenceException {

		Session session = null;

		try {
			session = openSession();

			AttractionCarRentLicence attractionCarRentLicence =
				(AttractionCarRentLicence)session.get(
					AttractionCarRentLicenceImpl.class, primaryKey);

			if (attractionCarRentLicence == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttractionCarRentLicenceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(attractionCarRentLicence);
		}
		catch (NoSuchAttractionCarRentLicenceException noSuchEntityException) {
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
	protected AttractionCarRentLicence removeImpl(
		AttractionCarRentLicence attractionCarRentLicence) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attractionCarRentLicence)) {
				attractionCarRentLicence =
					(AttractionCarRentLicence)session.get(
						AttractionCarRentLicenceImpl.class,
						attractionCarRentLicence.getPrimaryKeyObj());
			}

			if (attractionCarRentLicence != null) {
				session.delete(attractionCarRentLicence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (attractionCarRentLicence != null) {
			clearCache(attractionCarRentLicence);
		}

		return attractionCarRentLicence;
	}

	@Override
	public AttractionCarRentLicence updateImpl(
		AttractionCarRentLicence attractionCarRentLicence) {

		boolean isNew = attractionCarRentLicence.isNew();

		if (!(attractionCarRentLicence instanceof
				AttractionCarRentLicenceModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(attractionCarRentLicence.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					attractionCarRentLicence);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in attractionCarRentLicence proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AttractionCarRentLicence implementation " +
					attractionCarRentLicence.getClass());
		}

		AttractionCarRentLicenceModelImpl attractionCarRentLicenceModelImpl =
			(AttractionCarRentLicenceModelImpl)attractionCarRentLicence;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (attractionCarRentLicence.getCreateDate() == null)) {
			if (serviceContext == null) {
				attractionCarRentLicence.setCreateDate(date);
			}
			else {
				attractionCarRentLicence.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!attractionCarRentLicenceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				attractionCarRentLicence.setModifiedDate(date);
			}
			else {
				attractionCarRentLicence.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(attractionCarRentLicence);
			}
			else {
				attractionCarRentLicence =
					(AttractionCarRentLicence)session.merge(
						attractionCarRentLicence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AttractionCarRentLicenceImpl.class,
			attractionCarRentLicenceModelImpl, false, true);

		cacheUniqueFindersCache(attractionCarRentLicenceModelImpl);

		if (isNew) {
			attractionCarRentLicence.setNew(false);
		}

		attractionCarRentLicence.resetOriginalValues();

		return attractionCarRentLicence;
	}

	/**
	 * Returns the attraction car rent licence with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attraction car rent licence
	 * @return the attraction car rent licence
	 * @throws NoSuchAttractionCarRentLicenceException if a attraction car rent licence with the primary key could not be found
	 */
	@Override
	public AttractionCarRentLicence findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttractionCarRentLicenceException {

		AttractionCarRentLicence attractionCarRentLicence = fetchByPrimaryKey(
			primaryKey);

		if (attractionCarRentLicence == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttractionCarRentLicenceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return attractionCarRentLicence;
	}

	/**
	 * Returns the attraction car rent licence with the primary key or throws a <code>NoSuchAttractionCarRentLicenceException</code> if it could not be found.
	 *
	 * @param attractionCarRentLicenceId the primary key of the attraction car rent licence
	 * @return the attraction car rent licence
	 * @throws NoSuchAttractionCarRentLicenceException if a attraction car rent licence with the primary key could not be found
	 */
	@Override
	public AttractionCarRentLicence findByPrimaryKey(
			long attractionCarRentLicenceId)
		throws NoSuchAttractionCarRentLicenceException {

		return findByPrimaryKey((Serializable)attractionCarRentLicenceId);
	}

	/**
	 * Returns the attraction car rent licence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionCarRentLicenceId the primary key of the attraction car rent licence
	 * @return the attraction car rent licence, or <code>null</code> if a attraction car rent licence with the primary key could not be found
	 */
	@Override
	public AttractionCarRentLicence fetchByPrimaryKey(
		long attractionCarRentLicenceId) {

		return fetchByPrimaryKey((Serializable)attractionCarRentLicenceId);
	}

	/**
	 * Returns all the attraction car rent licences.
	 *
	 * @return the attraction car rent licences
	 */
	@Override
	public List<AttractionCarRentLicence> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the attraction car rent licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rent licences
	 * @param end the upper bound of the range of attraction car rent licences (not inclusive)
	 * @return the range of attraction car rent licences
	 */
	@Override
	public List<AttractionCarRentLicence> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the attraction car rent licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rent licences
	 * @param end the upper bound of the range of attraction car rent licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction car rent licences
	 */
	@Override
	public List<AttractionCarRentLicence> findAll(
		int start, int end,
		OrderByComparator<AttractionCarRentLicence> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the attraction car rent licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rent licences
	 * @param end the upper bound of the range of attraction car rent licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction car rent licences
	 */
	@Override
	public List<AttractionCarRentLicence> findAll(
		int start, int end,
		OrderByComparator<AttractionCarRentLicence> orderByComparator,
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

		List<AttractionCarRentLicence> list = null;

		if (useFinderCache) {
			list = (List<AttractionCarRentLicence>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ATTRACTIONCARRENTLICENCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ATTRACTIONCARRENTLICENCE;

				sql = sql.concat(
					AttractionCarRentLicenceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AttractionCarRentLicence>)QueryUtil.list(
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
	 * Removes all the attraction car rent licences from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AttractionCarRentLicence attractionCarRentLicence : findAll()) {
			remove(attractionCarRentLicence);
		}
	}

	/**
	 * Returns the number of attraction car rent licences.
	 *
	 * @return the number of attraction car rent licences
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_ATTRACTIONCARRENTLICENCE);

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
		return "attractionCarRentLicenceId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ATTRACTIONCARRENTLICENCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AttractionCarRentLicenceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the attraction car rent licence persistence.
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

		_setAttractionCarRentLicenceUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setAttractionCarRentLicenceUtilPersistence(null);

		entityCache.removeCache(AttractionCarRentLicenceImpl.class.getName());
	}

	private void _setAttractionCarRentLicenceUtilPersistence(
		AttractionCarRentLicencePersistence
			attractionCarRentLicencePersistence) {

		try {
			Field field = AttractionCarRentLicenceUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, attractionCarRentLicencePersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
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

	private static final String _SQL_SELECT_ATTRACTIONCARRENTLICENCE =
		"SELECT attractionCarRentLicence FROM AttractionCarRentLicence attractionCarRentLicence";

	private static final String _SQL_SELECT_ATTRACTIONCARRENTLICENCE_WHERE =
		"SELECT attractionCarRentLicence FROM AttractionCarRentLicence attractionCarRentLicence WHERE ";

	private static final String _SQL_COUNT_ATTRACTIONCARRENTLICENCE =
		"SELECT COUNT(attractionCarRentLicence) FROM AttractionCarRentLicence attractionCarRentLicence";

	private static final String _SQL_COUNT_ATTRACTIONCARRENTLICENCE_WHERE =
		"SELECT COUNT(attractionCarRentLicence) FROM AttractionCarRentLicence attractionCarRentLicence WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"attractionCarRentLicence.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AttractionCarRentLicence exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AttractionCarRentLicence exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AttractionCarRentLicencePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private AttractionCarRentLicenceModelArgumentsResolver
		_attractionCarRentLicenceModelArgumentsResolver;

}