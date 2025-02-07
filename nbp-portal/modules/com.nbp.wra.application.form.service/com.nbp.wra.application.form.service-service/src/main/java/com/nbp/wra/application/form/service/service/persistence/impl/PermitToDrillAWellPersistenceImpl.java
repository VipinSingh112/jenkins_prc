/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence.impl;

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

import com.nbp.wra.application.form.service.exception.NoSuchPermitToDrillAWellException;
import com.nbp.wra.application.form.service.model.PermitToDrillAWell;
import com.nbp.wra.application.form.service.model.PermitToDrillAWellTable;
import com.nbp.wra.application.form.service.model.impl.PermitToDrillAWellImpl;
import com.nbp.wra.application.form.service.model.impl.PermitToDrillAWellModelImpl;
import com.nbp.wra.application.form.service.service.persistence.PermitToDrillAWellPersistence;
import com.nbp.wra.application.form.service.service.persistence.PermitToDrillAWellUtil;
import com.nbp.wra.application.form.service.service.persistence.impl.constants.WRA_APPLICATIONPersistenceConstants;

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
 * The persistence implementation for the permit to drill a well service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PermitToDrillAWellPersistence.class)
public class PermitToDrillAWellPersistenceImpl
	extends BasePersistenceImpl<PermitToDrillAWell>
	implements PermitToDrillAWellPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PermitToDrillAWellUtil</code> to access the permit to drill a well persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PermitToDrillAWellImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetWRA_By_Id;
	private FinderPath _finderPathCountBygetWRA_By_Id;

	/**
	 * Returns the permit to drill a well where wraApplicationId = &#63; or throws a <code>NoSuchPermitToDrillAWellException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching permit to drill a well
	 * @throws NoSuchPermitToDrillAWellException if a matching permit to drill a well could not be found
	 */
	@Override
	public PermitToDrillAWell findBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchPermitToDrillAWellException {

		PermitToDrillAWell permitToDrillAWell = fetchBygetWRA_By_Id(
			wraApplicationId);

		if (permitToDrillAWell == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("wraApplicationId=");
			sb.append(wraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPermitToDrillAWellException(sb.toString());
		}

		return permitToDrillAWell;
	}

	/**
	 * Returns the permit to drill a well where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching permit to drill a well, or <code>null</code> if a matching permit to drill a well could not be found
	 */
	@Override
	public PermitToDrillAWell fetchBygetWRA_By_Id(long wraApplicationId) {
		return fetchBygetWRA_By_Id(wraApplicationId, true);
	}

	/**
	 * Returns the permit to drill a well where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching permit to drill a well, or <code>null</code> if a matching permit to drill a well could not be found
	 */
	@Override
	public PermitToDrillAWell fetchBygetWRA_By_Id(
		long wraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {wraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetWRA_By_Id, finderArgs, this);
		}

		if (result instanceof PermitToDrillAWell) {
			PermitToDrillAWell permitToDrillAWell = (PermitToDrillAWell)result;

			if (wraApplicationId != permitToDrillAWell.getWraApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PERMITTODRILLAWELL_WHERE);

			sb.append(_FINDER_COLUMN_GETWRA_BY_ID_WRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

				List<PermitToDrillAWell> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetWRA_By_Id, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {wraApplicationId};
							}

							_log.warn(
								"PermitToDrillAWellPersistenceImpl.fetchBygetWRA_By_Id(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PermitToDrillAWell permitToDrillAWell = list.get(0);

					result = permitToDrillAWell;

					cacheResult(permitToDrillAWell);
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
			return (PermitToDrillAWell)result;
		}
	}

	/**
	 * Removes the permit to drill a well where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the permit to drill a well that was removed
	 */
	@Override
	public PermitToDrillAWell removeBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchPermitToDrillAWellException {

		PermitToDrillAWell permitToDrillAWell = findBygetWRA_By_Id(
			wraApplicationId);

		return remove(permitToDrillAWell);
	}

	/**
	 * Returns the number of permit to drill a wells where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching permit to drill a wells
	 */
	@Override
	public int countBygetWRA_By_Id(long wraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetWRA_By_Id;

		Object[] finderArgs = new Object[] {wraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PERMITTODRILLAWELL_WHERE);

			sb.append(_FINDER_COLUMN_GETWRA_BY_ID_WRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

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

	private static final String _FINDER_COLUMN_GETWRA_BY_ID_WRAAPPLICATIONID_2 =
		"permitToDrillAWell.wraApplicationId = ?";

	public PermitToDrillAWellPersistenceImpl() {
		setModelClass(PermitToDrillAWell.class);

		setModelImplClass(PermitToDrillAWellImpl.class);
		setModelPKClass(long.class);

		setTable(PermitToDrillAWellTable.INSTANCE);
	}

	/**
	 * Caches the permit to drill a well in the entity cache if it is enabled.
	 *
	 * @param permitToDrillAWell the permit to drill a well
	 */
	@Override
	public void cacheResult(PermitToDrillAWell permitToDrillAWell) {
		entityCache.putResult(
			PermitToDrillAWellImpl.class, permitToDrillAWell.getPrimaryKey(),
			permitToDrillAWell);

		finderCache.putResult(
			_finderPathFetchBygetWRA_By_Id,
			new Object[] {permitToDrillAWell.getWraApplicationId()},
			permitToDrillAWell);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the permit to drill a wells in the entity cache if it is enabled.
	 *
	 * @param permitToDrillAWells the permit to drill a wells
	 */
	@Override
	public void cacheResult(List<PermitToDrillAWell> permitToDrillAWells) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (permitToDrillAWells.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PermitToDrillAWell permitToDrillAWell : permitToDrillAWells) {
			if (entityCache.getResult(
					PermitToDrillAWellImpl.class,
					permitToDrillAWell.getPrimaryKey()) == null) {

				cacheResult(permitToDrillAWell);
			}
		}
	}

	/**
	 * Clears the cache for all permit to drill a wells.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PermitToDrillAWellImpl.class);

		finderCache.clearCache(PermitToDrillAWellImpl.class);
	}

	/**
	 * Clears the cache for the permit to drill a well.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PermitToDrillAWell permitToDrillAWell) {
		entityCache.removeResult(
			PermitToDrillAWellImpl.class, permitToDrillAWell);
	}

	@Override
	public void clearCache(List<PermitToDrillAWell> permitToDrillAWells) {
		for (PermitToDrillAWell permitToDrillAWell : permitToDrillAWells) {
			entityCache.removeResult(
				PermitToDrillAWellImpl.class, permitToDrillAWell);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PermitToDrillAWellImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(PermitToDrillAWellImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		PermitToDrillAWellModelImpl permitToDrillAWellModelImpl) {

		Object[] args = new Object[] {
			permitToDrillAWellModelImpl.getWraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetWRA_By_Id, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetWRA_By_Id, args, permitToDrillAWellModelImpl);
	}

	/**
	 * Creates a new permit to drill a well with the primary key. Does not add the permit to drill a well to the database.
	 *
	 * @param drillAWellApplicationId the primary key for the new permit to drill a well
	 * @return the new permit to drill a well
	 */
	@Override
	public PermitToDrillAWell create(long drillAWellApplicationId) {
		PermitToDrillAWell permitToDrillAWell = new PermitToDrillAWellImpl();

		permitToDrillAWell.setNew(true);
		permitToDrillAWell.setPrimaryKey(drillAWellApplicationId);

		permitToDrillAWell.setCompanyId(CompanyThreadLocal.getCompanyId());

		return permitToDrillAWell;
	}

	/**
	 * Removes the permit to drill a well with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param drillAWellApplicationId the primary key of the permit to drill a well
	 * @return the permit to drill a well that was removed
	 * @throws NoSuchPermitToDrillAWellException if a permit to drill a well with the primary key could not be found
	 */
	@Override
	public PermitToDrillAWell remove(long drillAWellApplicationId)
		throws NoSuchPermitToDrillAWellException {

		return remove((Serializable)drillAWellApplicationId);
	}

	/**
	 * Removes the permit to drill a well with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the permit to drill a well
	 * @return the permit to drill a well that was removed
	 * @throws NoSuchPermitToDrillAWellException if a permit to drill a well with the primary key could not be found
	 */
	@Override
	public PermitToDrillAWell remove(Serializable primaryKey)
		throws NoSuchPermitToDrillAWellException {

		Session session = null;

		try {
			session = openSession();

			PermitToDrillAWell permitToDrillAWell =
				(PermitToDrillAWell)session.get(
					PermitToDrillAWellImpl.class, primaryKey);

			if (permitToDrillAWell == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPermitToDrillAWellException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(permitToDrillAWell);
		}
		catch (NoSuchPermitToDrillAWellException noSuchEntityException) {
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
	protected PermitToDrillAWell removeImpl(
		PermitToDrillAWell permitToDrillAWell) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(permitToDrillAWell)) {
				permitToDrillAWell = (PermitToDrillAWell)session.get(
					PermitToDrillAWellImpl.class,
					permitToDrillAWell.getPrimaryKeyObj());
			}

			if (permitToDrillAWell != null) {
				session.delete(permitToDrillAWell);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (permitToDrillAWell != null) {
			clearCache(permitToDrillAWell);
		}

		return permitToDrillAWell;
	}

	@Override
	public PermitToDrillAWell updateImpl(
		PermitToDrillAWell permitToDrillAWell) {

		boolean isNew = permitToDrillAWell.isNew();

		if (!(permitToDrillAWell instanceof PermitToDrillAWellModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(permitToDrillAWell.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					permitToDrillAWell);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in permitToDrillAWell proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PermitToDrillAWell implementation " +
					permitToDrillAWell.getClass());
		}

		PermitToDrillAWellModelImpl permitToDrillAWellModelImpl =
			(PermitToDrillAWellModelImpl)permitToDrillAWell;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (permitToDrillAWell.getCreateDate() == null)) {
			if (serviceContext == null) {
				permitToDrillAWell.setCreateDate(date);
			}
			else {
				permitToDrillAWell.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!permitToDrillAWellModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				permitToDrillAWell.setModifiedDate(date);
			}
			else {
				permitToDrillAWell.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(permitToDrillAWell);
			}
			else {
				permitToDrillAWell = (PermitToDrillAWell)session.merge(
					permitToDrillAWell);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PermitToDrillAWellImpl.class, permitToDrillAWellModelImpl, false,
			true);

		cacheUniqueFindersCache(permitToDrillAWellModelImpl);

		if (isNew) {
			permitToDrillAWell.setNew(false);
		}

		permitToDrillAWell.resetOriginalValues();

		return permitToDrillAWell;
	}

	/**
	 * Returns the permit to drill a well with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the permit to drill a well
	 * @return the permit to drill a well
	 * @throws NoSuchPermitToDrillAWellException if a permit to drill a well with the primary key could not be found
	 */
	@Override
	public PermitToDrillAWell findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPermitToDrillAWellException {

		PermitToDrillAWell permitToDrillAWell = fetchByPrimaryKey(primaryKey);

		if (permitToDrillAWell == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPermitToDrillAWellException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return permitToDrillAWell;
	}

	/**
	 * Returns the permit to drill a well with the primary key or throws a <code>NoSuchPermitToDrillAWellException</code> if it could not be found.
	 *
	 * @param drillAWellApplicationId the primary key of the permit to drill a well
	 * @return the permit to drill a well
	 * @throws NoSuchPermitToDrillAWellException if a permit to drill a well with the primary key could not be found
	 */
	@Override
	public PermitToDrillAWell findByPrimaryKey(long drillAWellApplicationId)
		throws NoSuchPermitToDrillAWellException {

		return findByPrimaryKey((Serializable)drillAWellApplicationId);
	}

	/**
	 * Returns the permit to drill a well with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param drillAWellApplicationId the primary key of the permit to drill a well
	 * @return the permit to drill a well, or <code>null</code> if a permit to drill a well with the primary key could not be found
	 */
	@Override
	public PermitToDrillAWell fetchByPrimaryKey(long drillAWellApplicationId) {
		return fetchByPrimaryKey((Serializable)drillAWellApplicationId);
	}

	/**
	 * Returns all the permit to drill a wells.
	 *
	 * @return the permit to drill a wells
	 */
	@Override
	public List<PermitToDrillAWell> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the permit to drill a wells.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PermitToDrillAWellModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of permit to drill a wells
	 * @param end the upper bound of the range of permit to drill a wells (not inclusive)
	 * @return the range of permit to drill a wells
	 */
	@Override
	public List<PermitToDrillAWell> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the permit to drill a wells.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PermitToDrillAWellModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of permit to drill a wells
	 * @param end the upper bound of the range of permit to drill a wells (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of permit to drill a wells
	 */
	@Override
	public List<PermitToDrillAWell> findAll(
		int start, int end,
		OrderByComparator<PermitToDrillAWell> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the permit to drill a wells.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PermitToDrillAWellModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of permit to drill a wells
	 * @param end the upper bound of the range of permit to drill a wells (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of permit to drill a wells
	 */
	@Override
	public List<PermitToDrillAWell> findAll(
		int start, int end,
		OrderByComparator<PermitToDrillAWell> orderByComparator,
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

		List<PermitToDrillAWell> list = null;

		if (useFinderCache) {
			list = (List<PermitToDrillAWell>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PERMITTODRILLAWELL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PERMITTODRILLAWELL;

				sql = sql.concat(PermitToDrillAWellModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PermitToDrillAWell>)QueryUtil.list(
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
	 * Removes all the permit to drill a wells from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PermitToDrillAWell permitToDrillAWell : findAll()) {
			remove(permitToDrillAWell);
		}
	}

	/**
	 * Returns the number of permit to drill a wells.
	 *
	 * @return the number of permit to drill a wells
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
					_SQL_COUNT_PERMITTODRILLAWELL);

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
		return "drillAWellApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PERMITTODRILLAWELL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PermitToDrillAWellModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the permit to drill a well persistence.
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

		_finderPathFetchBygetWRA_By_Id = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetWRA_By_Id",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, true);

		_finderPathCountBygetWRA_By_Id = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetWRA_By_Id",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, false);

		PermitToDrillAWellUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		PermitToDrillAWellUtil.setPersistence(null);

		entityCache.removeCache(PermitToDrillAWellImpl.class.getName());
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PERMITTODRILLAWELL =
		"SELECT permitToDrillAWell FROM PermitToDrillAWell permitToDrillAWell";

	private static final String _SQL_SELECT_PERMITTODRILLAWELL_WHERE =
		"SELECT permitToDrillAWell FROM PermitToDrillAWell permitToDrillAWell WHERE ";

	private static final String _SQL_COUNT_PERMITTODRILLAWELL =
		"SELECT COUNT(permitToDrillAWell) FROM PermitToDrillAWell permitToDrillAWell";

	private static final String _SQL_COUNT_PERMITTODRILLAWELL_WHERE =
		"SELECT COUNT(permitToDrillAWell) FROM PermitToDrillAWell permitToDrillAWell WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "permitToDrillAWell.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PermitToDrillAWell exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PermitToDrillAWell exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PermitToDrillAWellPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}