/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence.impl;

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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevDisasterManagementException;
import com.nbp.sez.status.application.form.service.model.SezDevDisasterManagement;
import com.nbp.sez.status.application.form.service.model.SezDevDisasterManagementTable;
import com.nbp.sez.status.application.form.service.model.impl.SezDevDisasterManagementImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezDevDisasterManagementModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevDisasterManagementPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevDisasterManagementUtil;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;

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
 * The persistence implementation for the sez dev disaster management service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezDevDisasterManagementPersistence.class)
public class SezDevDisasterManagementPersistenceImpl
	extends BasePersistenceImpl<SezDevDisasterManagement>
	implements SezDevDisasterManagementPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezDevDisasterManagementUtil</code> to access the sez dev disaster management persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezDevDisasterManagementImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetSezStatusByAppId;
	private FinderPath _finderPathCountBygetSezStatusByAppId;

	/**
	 * Returns the sez dev disaster management where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDevDisasterManagementException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev disaster management
	 * @throws NoSuchSezDevDisasterManagementException if a matching sez dev disaster management could not be found
	 */
	@Override
	public SezDevDisasterManagement findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevDisasterManagementException {

		SezDevDisasterManagement sezDevDisasterManagement =
			fetchBygetSezStatusByAppId(sezStatusApplicationId);

		if (sezDevDisasterManagement == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezDevDisasterManagementException(sb.toString());
		}

		return sezDevDisasterManagement;
	}

	/**
	 * Returns the sez dev disaster management where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev disaster management, or <code>null</code> if a matching sez dev disaster management could not be found
	 */
	@Override
	public SezDevDisasterManagement fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez dev disaster management where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez dev disaster management, or <code>null</code> if a matching sez dev disaster management could not be found
	 */
	@Override
	public SezDevDisasterManagement fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {sezStatusApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSezStatusByAppId, finderArgs, this);
		}

		if (result instanceof SezDevDisasterManagement) {
			SezDevDisasterManagement sezDevDisasterManagement =
				(SezDevDisasterManagement)result;

			if (sezStatusApplicationId !=
					sezDevDisasterManagement.getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZDEVDISASTERMANAGEMENT_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezDevDisasterManagement> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSezStatusByAppId, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									sezStatusApplicationId
								};
							}

							_log.warn(
								"SezDevDisasterManagementPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezDevDisasterManagement sezDevDisasterManagement =
						list.get(0);

					result = sezDevDisasterManagement;

					cacheResult(sezDevDisasterManagement);
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
			return (SezDevDisasterManagement)result;
		}
	}

	/**
	 * Removes the sez dev disaster management where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez dev disaster management that was removed
	 */
	@Override
	public SezDevDisasterManagement removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevDisasterManagementException {

		SezDevDisasterManagement sezDevDisasterManagement =
			findBygetSezStatusByAppId(sezStatusApplicationId);

		return remove(sezDevDisasterManagement);
	}

	/**
	 * Returns the number of sez dev disaster managements where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev disaster managements
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZDEVDISASTERMANAGEMENT_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

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
		_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2 =
			"sezDevDisasterManagement.sezStatusApplicationId = ?";

	public SezDevDisasterManagementPersistenceImpl() {
		setModelClass(SezDevDisasterManagement.class);

		setModelImplClass(SezDevDisasterManagementImpl.class);
		setModelPKClass(long.class);

		setTable(SezDevDisasterManagementTable.INSTANCE);
	}

	/**
	 * Caches the sez dev disaster management in the entity cache if it is enabled.
	 *
	 * @param sezDevDisasterManagement the sez dev disaster management
	 */
	@Override
	public void cacheResult(SezDevDisasterManagement sezDevDisasterManagement) {
		entityCache.putResult(
			SezDevDisasterManagementImpl.class,
			sezDevDisasterManagement.getPrimaryKey(), sezDevDisasterManagement);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {sezDevDisasterManagement.getSezStatusApplicationId()},
			sezDevDisasterManagement);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez dev disaster managements in the entity cache if it is enabled.
	 *
	 * @param sezDevDisasterManagements the sez dev disaster managements
	 */
	@Override
	public void cacheResult(
		List<SezDevDisasterManagement> sezDevDisasterManagements) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezDevDisasterManagements.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezDevDisasterManagement sezDevDisasterManagement :
				sezDevDisasterManagements) {

			if (entityCache.getResult(
					SezDevDisasterManagementImpl.class,
					sezDevDisasterManagement.getPrimaryKey()) == null) {

				cacheResult(sezDevDisasterManagement);
			}
		}
	}

	/**
	 * Clears the cache for all sez dev disaster managements.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezDevDisasterManagementImpl.class);

		finderCache.clearCache(SezDevDisasterManagementImpl.class);
	}

	/**
	 * Clears the cache for the sez dev disaster management.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezDevDisasterManagement sezDevDisasterManagement) {
		entityCache.removeResult(
			SezDevDisasterManagementImpl.class, sezDevDisasterManagement);
	}

	@Override
	public void clearCache(
		List<SezDevDisasterManagement> sezDevDisasterManagements) {

		for (SezDevDisasterManagement sezDevDisasterManagement :
				sezDevDisasterManagements) {

			entityCache.removeResult(
				SezDevDisasterManagementImpl.class, sezDevDisasterManagement);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezDevDisasterManagementImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezDevDisasterManagementImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezDevDisasterManagementModelImpl sezDevDisasterManagementModelImpl) {

		Object[] args = new Object[] {
			sezDevDisasterManagementModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezDevDisasterManagementModelImpl);
	}

	/**
	 * Creates a new sez dev disaster management with the primary key. Does not add the sez dev disaster management to the database.
	 *
	 * @param sezDevDisasterManagementId the primary key for the new sez dev disaster management
	 * @return the new sez dev disaster management
	 */
	@Override
	public SezDevDisasterManagement create(long sezDevDisasterManagementId) {
		SezDevDisasterManagement sezDevDisasterManagement =
			new SezDevDisasterManagementImpl();

		sezDevDisasterManagement.setNew(true);
		sezDevDisasterManagement.setPrimaryKey(sezDevDisasterManagementId);

		sezDevDisasterManagement.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezDevDisasterManagement;
	}

	/**
	 * Removes the sez dev disaster management with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevDisasterManagementId the primary key of the sez dev disaster management
	 * @return the sez dev disaster management that was removed
	 * @throws NoSuchSezDevDisasterManagementException if a sez dev disaster management with the primary key could not be found
	 */
	@Override
	public SezDevDisasterManagement remove(long sezDevDisasterManagementId)
		throws NoSuchSezDevDisasterManagementException {

		return remove((Serializable)sezDevDisasterManagementId);
	}

	/**
	 * Removes the sez dev disaster management with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez dev disaster management
	 * @return the sez dev disaster management that was removed
	 * @throws NoSuchSezDevDisasterManagementException if a sez dev disaster management with the primary key could not be found
	 */
	@Override
	public SezDevDisasterManagement remove(Serializable primaryKey)
		throws NoSuchSezDevDisasterManagementException {

		Session session = null;

		try {
			session = openSession();

			SezDevDisasterManagement sezDevDisasterManagement =
				(SezDevDisasterManagement)session.get(
					SezDevDisasterManagementImpl.class, primaryKey);

			if (sezDevDisasterManagement == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezDevDisasterManagementException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezDevDisasterManagement);
		}
		catch (NoSuchSezDevDisasterManagementException noSuchEntityException) {
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
	protected SezDevDisasterManagement removeImpl(
		SezDevDisasterManagement sezDevDisasterManagement) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezDevDisasterManagement)) {
				sezDevDisasterManagement =
					(SezDevDisasterManagement)session.get(
						SezDevDisasterManagementImpl.class,
						sezDevDisasterManagement.getPrimaryKeyObj());
			}

			if (sezDevDisasterManagement != null) {
				session.delete(sezDevDisasterManagement);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezDevDisasterManagement != null) {
			clearCache(sezDevDisasterManagement);
		}

		return sezDevDisasterManagement;
	}

	@Override
	public SezDevDisasterManagement updateImpl(
		SezDevDisasterManagement sezDevDisasterManagement) {

		boolean isNew = sezDevDisasterManagement.isNew();

		if (!(sezDevDisasterManagement instanceof
				SezDevDisasterManagementModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezDevDisasterManagement.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezDevDisasterManagement);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezDevDisasterManagement proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezDevDisasterManagement implementation " +
					sezDevDisasterManagement.getClass());
		}

		SezDevDisasterManagementModelImpl sezDevDisasterManagementModelImpl =
			(SezDevDisasterManagementModelImpl)sezDevDisasterManagement;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezDevDisasterManagement.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezDevDisasterManagement.setCreateDate(date);
			}
			else {
				sezDevDisasterManagement.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezDevDisasterManagementModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezDevDisasterManagement.setModifiedDate(date);
			}
			else {
				sezDevDisasterManagement.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezDevDisasterManagement);
			}
			else {
				sezDevDisasterManagement =
					(SezDevDisasterManagement)session.merge(
						sezDevDisasterManagement);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezDevDisasterManagementImpl.class,
			sezDevDisasterManagementModelImpl, false, true);

		cacheUniqueFindersCache(sezDevDisasterManagementModelImpl);

		if (isNew) {
			sezDevDisasterManagement.setNew(false);
		}

		sezDevDisasterManagement.resetOriginalValues();

		return sezDevDisasterManagement;
	}

	/**
	 * Returns the sez dev disaster management with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez dev disaster management
	 * @return the sez dev disaster management
	 * @throws NoSuchSezDevDisasterManagementException if a sez dev disaster management with the primary key could not be found
	 */
	@Override
	public SezDevDisasterManagement findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezDevDisasterManagementException {

		SezDevDisasterManagement sezDevDisasterManagement = fetchByPrimaryKey(
			primaryKey);

		if (sezDevDisasterManagement == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezDevDisasterManagementException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezDevDisasterManagement;
	}

	/**
	 * Returns the sez dev disaster management with the primary key or throws a <code>NoSuchSezDevDisasterManagementException</code> if it could not be found.
	 *
	 * @param sezDevDisasterManagementId the primary key of the sez dev disaster management
	 * @return the sez dev disaster management
	 * @throws NoSuchSezDevDisasterManagementException if a sez dev disaster management with the primary key could not be found
	 */
	@Override
	public SezDevDisasterManagement findByPrimaryKey(
			long sezDevDisasterManagementId)
		throws NoSuchSezDevDisasterManagementException {

		return findByPrimaryKey((Serializable)sezDevDisasterManagementId);
	}

	/**
	 * Returns the sez dev disaster management with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevDisasterManagementId the primary key of the sez dev disaster management
	 * @return the sez dev disaster management, or <code>null</code> if a sez dev disaster management with the primary key could not be found
	 */
	@Override
	public SezDevDisasterManagement fetchByPrimaryKey(
		long sezDevDisasterManagementId) {

		return fetchByPrimaryKey((Serializable)sezDevDisasterManagementId);
	}

	/**
	 * Returns all the sez dev disaster managements.
	 *
	 * @return the sez dev disaster managements
	 */
	@Override
	public List<SezDevDisasterManagement> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev disaster managements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevDisasterManagementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev disaster managements
	 * @param end the upper bound of the range of sez dev disaster managements (not inclusive)
	 * @return the range of sez dev disaster managements
	 */
	@Override
	public List<SezDevDisasterManagement> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev disaster managements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevDisasterManagementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev disaster managements
	 * @param end the upper bound of the range of sez dev disaster managements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev disaster managements
	 */
	@Override
	public List<SezDevDisasterManagement> findAll(
		int start, int end,
		OrderByComparator<SezDevDisasterManagement> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev disaster managements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevDisasterManagementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev disaster managements
	 * @param end the upper bound of the range of sez dev disaster managements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev disaster managements
	 */
	@Override
	public List<SezDevDisasterManagement> findAll(
		int start, int end,
		OrderByComparator<SezDevDisasterManagement> orderByComparator,
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

		List<SezDevDisasterManagement> list = null;

		if (useFinderCache) {
			list = (List<SezDevDisasterManagement>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZDEVDISASTERMANAGEMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZDEVDISASTERMANAGEMENT;

				sql = sql.concat(
					SezDevDisasterManagementModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezDevDisasterManagement>)QueryUtil.list(
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
	 * Removes all the sez dev disaster managements from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezDevDisasterManagement sezDevDisasterManagement : findAll()) {
			remove(sezDevDisasterManagement);
		}
	}

	/**
	 * Returns the number of sez dev disaster managements.
	 *
	 * @return the number of sez dev disaster managements
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
					_SQL_COUNT_SEZDEVDISASTERMANAGEMENT);

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
		return "sezDevDisasterManagementId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZDEVDISASTERMANAGEMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezDevDisasterManagementModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez dev disaster management persistence.
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

		_finderPathFetchBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSezStatusByAppId",
			new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		SezDevDisasterManagementUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezDevDisasterManagementUtil.setPersistence(null);

		entityCache.removeCache(SezDevDisasterManagementImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZDEVDISASTERMANAGEMENT =
		"SELECT sezDevDisasterManagement FROM SezDevDisasterManagement sezDevDisasterManagement";

	private static final String _SQL_SELECT_SEZDEVDISASTERMANAGEMENT_WHERE =
		"SELECT sezDevDisasterManagement FROM SezDevDisasterManagement sezDevDisasterManagement WHERE ";

	private static final String _SQL_COUNT_SEZDEVDISASTERMANAGEMENT =
		"SELECT COUNT(sezDevDisasterManagement) FROM SezDevDisasterManagement sezDevDisasterManagement";

	private static final String _SQL_COUNT_SEZDEVDISASTERMANAGEMENT_WHERE =
		"SELECT COUNT(sezDevDisasterManagement) FROM SezDevDisasterManagement sezDevDisasterManagement WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezDevDisasterManagement.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezDevDisasterManagement exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezDevDisasterManagement exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezDevDisasterManagementPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}