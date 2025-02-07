/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence.impl;

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

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjSectionOneException;
import com.nbp.ncbj.application.form.service.model.NcbjSectionOne;
import com.nbp.ncbj.application.form.service.model.NcbjSectionOneTable;
import com.nbp.ncbj.application.form.service.model.impl.NcbjSectionOneImpl;
import com.nbp.ncbj.application.form.service.model.impl.NcbjSectionOneModelImpl;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionOnePersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionOneUtil;
import com.nbp.ncbj.application.form.service.service.persistence.impl.constants.FOOPersistenceConstants;

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
 * The persistence implementation for the ncbj section one service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjSectionOnePersistence.class)
public class NcbjSectionOnePersistenceImpl
	extends BasePersistenceImpl<NcbjSectionOne>
	implements NcbjSectionOnePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjSectionOneUtil</code> to access the ncbj section one persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjSectionOneImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetNCBJById;
	private FinderPath _finderPathCountBygetNCBJById;

	/**
	 * Returns the ncbj section one where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjSectionOneException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section one
	 * @throws NoSuchNcbjSectionOneException if a matching ncbj section one could not be found
	 */
	@Override
	public NcbjSectionOne findBygetNCBJById(long ncbjApplicationId)
		throws NoSuchNcbjSectionOneException {

		NcbjSectionOne ncbjSectionOne = fetchBygetNCBJById(ncbjApplicationId);

		if (ncbjSectionOne == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncbjApplicationId=");
			sb.append(ncbjApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjSectionOneException(sb.toString());
		}

		return ncbjSectionOne;
	}

	/**
	 * Returns the ncbj section one where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section one, or <code>null</code> if a matching ncbj section one could not be found
	 */
	@Override
	public NcbjSectionOne fetchBygetNCBJById(long ncbjApplicationId) {
		return fetchBygetNCBJById(ncbjApplicationId, true);
	}

	/**
	 * Returns the ncbj section one where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj section one, or <code>null</code> if a matching ncbj section one could not be found
	 */
	@Override
	public NcbjSectionOne fetchBygetNCBJById(
		long ncbjApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ncbjApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNCBJById, finderArgs, this);
		}

		if (result instanceof NcbjSectionOne) {
			NcbjSectionOne ncbjSectionOne = (NcbjSectionOne)result;

			if (ncbjApplicationId != ncbjSectionOne.getNcbjApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJSECTIONONE_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJBYID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				List<NcbjSectionOne> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNCBJById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {ncbjApplicationId};
							}

							_log.warn(
								"NcbjSectionOnePersistenceImpl.fetchBygetNCBJById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjSectionOne ncbjSectionOne = list.get(0);

					result = ncbjSectionOne;

					cacheResult(ncbjSectionOne);
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
			return (NcbjSectionOne)result;
		}
	}

	/**
	 * Removes the ncbj section one where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj section one that was removed
	 */
	@Override
	public NcbjSectionOne removeBygetNCBJById(long ncbjApplicationId)
		throws NoSuchNcbjSectionOneException {

		NcbjSectionOne ncbjSectionOne = findBygetNCBJById(ncbjApplicationId);

		return remove(ncbjSectionOne);
	}

	/**
	 * Returns the number of ncbj section ones where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj section ones
	 */
	@Override
	public int countBygetNCBJById(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCBJById;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJSECTIONONE_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJBYID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

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

	private static final String _FINDER_COLUMN_GETNCBJBYID_NCBJAPPLICATIONID_2 =
		"ncbjSectionOne.ncbjApplicationId = ?";

	private FinderPath _finderPathFetchBygetNCBJByAppId;
	private FinderPath _finderPathCountBygetNCBJByAppId;

	/**
	 * Returns the ncbj section one where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjSectionOneException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section one
	 * @throws NoSuchNcbjSectionOneException if a matching ncbj section one could not be found
	 */
	@Override
	public NcbjSectionOne findBygetNCBJByAppId(long ncbjApplicationId)
		throws NoSuchNcbjSectionOneException {

		NcbjSectionOne ncbjSectionOne = fetchBygetNCBJByAppId(
			ncbjApplicationId);

		if (ncbjSectionOne == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncbjApplicationId=");
			sb.append(ncbjApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjSectionOneException(sb.toString());
		}

		return ncbjSectionOne;
	}

	/**
	 * Returns the ncbj section one where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section one, or <code>null</code> if a matching ncbj section one could not be found
	 */
	@Override
	public NcbjSectionOne fetchBygetNCBJByAppId(long ncbjApplicationId) {
		return fetchBygetNCBJByAppId(ncbjApplicationId, true);
	}

	/**
	 * Returns the ncbj section one where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj section one, or <code>null</code> if a matching ncbj section one could not be found
	 */
	@Override
	public NcbjSectionOne fetchBygetNCBJByAppId(
		long ncbjApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ncbjApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNCBJByAppId, finderArgs, this);
		}

		if (result instanceof NcbjSectionOne) {
			NcbjSectionOne ncbjSectionOne = (NcbjSectionOne)result;

			if (ncbjApplicationId != ncbjSectionOne.getNcbjApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJSECTIONONE_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJBYAPPID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				List<NcbjSectionOne> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNCBJByAppId, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {ncbjApplicationId};
							}

							_log.warn(
								"NcbjSectionOnePersistenceImpl.fetchBygetNCBJByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjSectionOne ncbjSectionOne = list.get(0);

					result = ncbjSectionOne;

					cacheResult(ncbjSectionOne);
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
			return (NcbjSectionOne)result;
		}
	}

	/**
	 * Removes the ncbj section one where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj section one that was removed
	 */
	@Override
	public NcbjSectionOne removeBygetNCBJByAppId(long ncbjApplicationId)
		throws NoSuchNcbjSectionOneException {

		NcbjSectionOne ncbjSectionOne = findBygetNCBJByAppId(ncbjApplicationId);

		return remove(ncbjSectionOne);
	}

	/**
	 * Returns the number of ncbj section ones where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj section ones
	 */
	@Override
	public int countBygetNCBJByAppId(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCBJByAppId;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJSECTIONONE_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJBYAPPID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

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
		_FINDER_COLUMN_GETNCBJBYAPPID_NCBJAPPLICATIONID_2 =
			"ncbjSectionOne.ncbjApplicationId = ?";

	public NcbjSectionOnePersistenceImpl() {
		setModelClass(NcbjSectionOne.class);

		setModelImplClass(NcbjSectionOneImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjSectionOneTable.INSTANCE);
	}

	/**
	 * Caches the ncbj section one in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionOne the ncbj section one
	 */
	@Override
	public void cacheResult(NcbjSectionOne ncbjSectionOne) {
		entityCache.putResult(
			NcbjSectionOneImpl.class, ncbjSectionOne.getPrimaryKey(),
			ncbjSectionOne);

		finderCache.putResult(
			_finderPathFetchBygetNCBJById,
			new Object[] {ncbjSectionOne.getNcbjApplicationId()},
			ncbjSectionOne);

		finderCache.putResult(
			_finderPathFetchBygetNCBJByAppId,
			new Object[] {ncbjSectionOne.getNcbjApplicationId()},
			ncbjSectionOne);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj section ones in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionOnes the ncbj section ones
	 */
	@Override
	public void cacheResult(List<NcbjSectionOne> ncbjSectionOnes) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjSectionOnes.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjSectionOne ncbjSectionOne : ncbjSectionOnes) {
			if (entityCache.getResult(
					NcbjSectionOneImpl.class, ncbjSectionOne.getPrimaryKey()) ==
						null) {

				cacheResult(ncbjSectionOne);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj section ones.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjSectionOneImpl.class);

		finderCache.clearCache(NcbjSectionOneImpl.class);
	}

	/**
	 * Clears the cache for the ncbj section one.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjSectionOne ncbjSectionOne) {
		entityCache.removeResult(NcbjSectionOneImpl.class, ncbjSectionOne);
	}

	@Override
	public void clearCache(List<NcbjSectionOne> ncbjSectionOnes) {
		for (NcbjSectionOne ncbjSectionOne : ncbjSectionOnes) {
			entityCache.removeResult(NcbjSectionOneImpl.class, ncbjSectionOne);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjSectionOneImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(NcbjSectionOneImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjSectionOneModelImpl ncbjSectionOneModelImpl) {

		Object[] args = new Object[] {
			ncbjSectionOneModelImpl.getNcbjApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetNCBJById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNCBJById, args, ncbjSectionOneModelImpl);

		args = new Object[] {ncbjSectionOneModelImpl.getNcbjApplicationId()};

		finderCache.putResult(
			_finderPathCountBygetNCBJByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNCBJByAppId, args, ncbjSectionOneModelImpl);
	}

	/**
	 * Creates a new ncbj section one with the primary key. Does not add the ncbj section one to the database.
	 *
	 * @param ncbjSectionOneId the primary key for the new ncbj section one
	 * @return the new ncbj section one
	 */
	@Override
	public NcbjSectionOne create(long ncbjSectionOneId) {
		NcbjSectionOne ncbjSectionOne = new NcbjSectionOneImpl();

		ncbjSectionOne.setNew(true);
		ncbjSectionOne.setPrimaryKey(ncbjSectionOneId);

		ncbjSectionOne.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjSectionOne;
	}

	/**
	 * Removes the ncbj section one with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjSectionOneId the primary key of the ncbj section one
	 * @return the ncbj section one that was removed
	 * @throws NoSuchNcbjSectionOneException if a ncbj section one with the primary key could not be found
	 */
	@Override
	public NcbjSectionOne remove(long ncbjSectionOneId)
		throws NoSuchNcbjSectionOneException {

		return remove((Serializable)ncbjSectionOneId);
	}

	/**
	 * Removes the ncbj section one with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj section one
	 * @return the ncbj section one that was removed
	 * @throws NoSuchNcbjSectionOneException if a ncbj section one with the primary key could not be found
	 */
	@Override
	public NcbjSectionOne remove(Serializable primaryKey)
		throws NoSuchNcbjSectionOneException {

		Session session = null;

		try {
			session = openSession();

			NcbjSectionOne ncbjSectionOne = (NcbjSectionOne)session.get(
				NcbjSectionOneImpl.class, primaryKey);

			if (ncbjSectionOne == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjSectionOneException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjSectionOne);
		}
		catch (NoSuchNcbjSectionOneException noSuchEntityException) {
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
	protected NcbjSectionOne removeImpl(NcbjSectionOne ncbjSectionOne) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjSectionOne)) {
				ncbjSectionOne = (NcbjSectionOne)session.get(
					NcbjSectionOneImpl.class,
					ncbjSectionOne.getPrimaryKeyObj());
			}

			if (ncbjSectionOne != null) {
				session.delete(ncbjSectionOne);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjSectionOne != null) {
			clearCache(ncbjSectionOne);
		}

		return ncbjSectionOne;
	}

	@Override
	public NcbjSectionOne updateImpl(NcbjSectionOne ncbjSectionOne) {
		boolean isNew = ncbjSectionOne.isNew();

		if (!(ncbjSectionOne instanceof NcbjSectionOneModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjSectionOne.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjSectionOne);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjSectionOne proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjSectionOne implementation " +
					ncbjSectionOne.getClass());
		}

		NcbjSectionOneModelImpl ncbjSectionOneModelImpl =
			(NcbjSectionOneModelImpl)ncbjSectionOne;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjSectionOne.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjSectionOne.setCreateDate(date);
			}
			else {
				ncbjSectionOne.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjSectionOneModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjSectionOne.setModifiedDate(date);
			}
			else {
				ncbjSectionOne.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjSectionOne);
			}
			else {
				ncbjSectionOne = (NcbjSectionOne)session.merge(ncbjSectionOne);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjSectionOneImpl.class, ncbjSectionOneModelImpl, false, true);

		cacheUniqueFindersCache(ncbjSectionOneModelImpl);

		if (isNew) {
			ncbjSectionOne.setNew(false);
		}

		ncbjSectionOne.resetOriginalValues();

		return ncbjSectionOne;
	}

	/**
	 * Returns the ncbj section one with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj section one
	 * @return the ncbj section one
	 * @throws NoSuchNcbjSectionOneException if a ncbj section one with the primary key could not be found
	 */
	@Override
	public NcbjSectionOne findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjSectionOneException {

		NcbjSectionOne ncbjSectionOne = fetchByPrimaryKey(primaryKey);

		if (ncbjSectionOne == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjSectionOneException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjSectionOne;
	}

	/**
	 * Returns the ncbj section one with the primary key or throws a <code>NoSuchNcbjSectionOneException</code> if it could not be found.
	 *
	 * @param ncbjSectionOneId the primary key of the ncbj section one
	 * @return the ncbj section one
	 * @throws NoSuchNcbjSectionOneException if a ncbj section one with the primary key could not be found
	 */
	@Override
	public NcbjSectionOne findByPrimaryKey(long ncbjSectionOneId)
		throws NoSuchNcbjSectionOneException {

		return findByPrimaryKey((Serializable)ncbjSectionOneId);
	}

	/**
	 * Returns the ncbj section one with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjSectionOneId the primary key of the ncbj section one
	 * @return the ncbj section one, or <code>null</code> if a ncbj section one with the primary key could not be found
	 */
	@Override
	public NcbjSectionOne fetchByPrimaryKey(long ncbjSectionOneId) {
		return fetchByPrimaryKey((Serializable)ncbjSectionOneId);
	}

	/**
	 * Returns all the ncbj section ones.
	 *
	 * @return the ncbj section ones
	 */
	@Override
	public List<NcbjSectionOne> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj section ones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionOneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section ones
	 * @param end the upper bound of the range of ncbj section ones (not inclusive)
	 * @return the range of ncbj section ones
	 */
	@Override
	public List<NcbjSectionOne> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj section ones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionOneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section ones
	 * @param end the upper bound of the range of ncbj section ones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj section ones
	 */
	@Override
	public List<NcbjSectionOne> findAll(
		int start, int end,
		OrderByComparator<NcbjSectionOne> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj section ones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionOneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section ones
	 * @param end the upper bound of the range of ncbj section ones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj section ones
	 */
	@Override
	public List<NcbjSectionOne> findAll(
		int start, int end, OrderByComparator<NcbjSectionOne> orderByComparator,
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

		List<NcbjSectionOne> list = null;

		if (useFinderCache) {
			list = (List<NcbjSectionOne>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJSECTIONONE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJSECTIONONE;

				sql = sql.concat(NcbjSectionOneModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjSectionOne>)QueryUtil.list(
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
	 * Removes all the ncbj section ones from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjSectionOne ncbjSectionOne : findAll()) {
			remove(ncbjSectionOne);
		}
	}

	/**
	 * Returns the number of ncbj section ones.
	 *
	 * @return the number of ncbj section ones
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NCBJSECTIONONE);

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
		return "ncbjSectionOneId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJSECTIONONE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjSectionOneModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj section one persistence.
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

		_finderPathFetchBygetNCBJById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNCBJById",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, true);

		_finderPathCountBygetNCBJById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNCBJById",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, false);

		_finderPathFetchBygetNCBJByAppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNCBJByAppId",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, true);

		_finderPathCountBygetNCBJByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNCBJByAppId",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, false);

		NcbjSectionOneUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjSectionOneUtil.setPersistence(null);

		entityCache.removeCache(NcbjSectionOneImpl.class.getName());
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCBJSECTIONONE =
		"SELECT ncbjSectionOne FROM NcbjSectionOne ncbjSectionOne";

	private static final String _SQL_SELECT_NCBJSECTIONONE_WHERE =
		"SELECT ncbjSectionOne FROM NcbjSectionOne ncbjSectionOne WHERE ";

	private static final String _SQL_COUNT_NCBJSECTIONONE =
		"SELECT COUNT(ncbjSectionOne) FROM NcbjSectionOne ncbjSectionOne";

	private static final String _SQL_COUNT_NCBJSECTIONONE_WHERE =
		"SELECT COUNT(ncbjSectionOne) FROM NcbjSectionOne ncbjSectionOne WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ncbjSectionOne.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjSectionOne exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjSectionOne exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjSectionOnePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}