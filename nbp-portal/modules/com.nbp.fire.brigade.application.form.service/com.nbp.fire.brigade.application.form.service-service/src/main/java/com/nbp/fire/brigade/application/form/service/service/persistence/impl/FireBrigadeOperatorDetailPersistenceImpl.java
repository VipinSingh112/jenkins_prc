/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.persistence.impl;

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

import com.nbp.fire.brigade.application.form.service.exception.NoSuchFireBrigadeOperatorDetailException;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeOperatorDetail;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeOperatorDetailTable;
import com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeOperatorDetailImpl;
import com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeOperatorDetailModelImpl;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeOperatorDetailPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeOperatorDetailUtil;
import com.nbp.fire.brigade.application.form.service.service.persistence.impl.constants.FIRE_BRIGADEPersistenceConstants;

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
 * The persistence implementation for the fire brigade operator detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FireBrigadeOperatorDetailPersistence.class)
public class FireBrigadeOperatorDetailPersistenceImpl
	extends BasePersistenceImpl<FireBrigadeOperatorDetail>
	implements FireBrigadeOperatorDetailPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FireBrigadeOperatorDetailUtil</code> to access the fire brigade operator detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FireBrigadeOperatorDetailImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetFireBrigadeByAppId;
	private FinderPath _finderPathCountBygetFireBrigadeByAppId;

	/**
	 * Returns the fire brigade operator detail where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeOperatorDetailException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade operator detail
	 * @throws NoSuchFireBrigadeOperatorDetailException if a matching fire brigade operator detail could not be found
	 */
	@Override
	public FireBrigadeOperatorDetail findBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeOperatorDetailException {

		FireBrigadeOperatorDetail fireBrigadeOperatorDetail =
			fetchBygetFireBrigadeByAppId(fireBrigadeApplicationId);

		if (fireBrigadeOperatorDetail == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("fireBrigadeApplicationId=");
			sb.append(fireBrigadeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFireBrigadeOperatorDetailException(sb.toString());
		}

		return fireBrigadeOperatorDetail;
	}

	/**
	 * Returns the fire brigade operator detail where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade operator detail, or <code>null</code> if a matching fire brigade operator detail could not be found
	 */
	@Override
	public FireBrigadeOperatorDetail fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId) {

		return fetchBygetFireBrigadeByAppId(fireBrigadeApplicationId, true);
	}

	/**
	 * Returns the fire brigade operator detail where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade operator detail, or <code>null</code> if a matching fire brigade operator detail could not be found
	 */
	@Override
	public FireBrigadeOperatorDetail fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {fireBrigadeApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFireBrigadeByAppId, finderArgs, this);
		}

		if (result instanceof FireBrigadeOperatorDetail) {
			FireBrigadeOperatorDetail fireBrigadeOperatorDetail =
				(FireBrigadeOperatorDetail)result;

			if (fireBrigadeApplicationId !=
					fireBrigadeOperatorDetail.getFireBrigadeApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FIREBRIGADEOPERATORDETAIL_WHERE);

			sb.append(
				_FINDER_COLUMN_GETFIREBRIGADEBYAPPID_FIREBRIGADEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(fireBrigadeApplicationId);

				List<FireBrigadeOperatorDetail> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFireBrigadeByAppId, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									fireBrigadeApplicationId
								};
							}

							_log.warn(
								"FireBrigadeOperatorDetailPersistenceImpl.fetchBygetFireBrigadeByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FireBrigadeOperatorDetail fireBrigadeOperatorDetail =
						list.get(0);

					result = fireBrigadeOperatorDetail;

					cacheResult(fireBrigadeOperatorDetail);
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
			return (FireBrigadeOperatorDetail)result;
		}
	}

	/**
	 * Removes the fire brigade operator detail where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade operator detail that was removed
	 */
	@Override
	public FireBrigadeOperatorDetail removeBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeOperatorDetailException {

		FireBrigadeOperatorDetail fireBrigadeOperatorDetail =
			findBygetFireBrigadeByAppId(fireBrigadeApplicationId);

		return remove(fireBrigadeOperatorDetail);
	}

	/**
	 * Returns the number of fire brigade operator details where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade operator details
	 */
	@Override
	public int countBygetFireBrigadeByAppId(long fireBrigadeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFireBrigadeByAppId;

		Object[] finderArgs = new Object[] {fireBrigadeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEOPERATORDETAIL_WHERE);

			sb.append(
				_FINDER_COLUMN_GETFIREBRIGADEBYAPPID_FIREBRIGADEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(fireBrigadeApplicationId);

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
		_FINDER_COLUMN_GETFIREBRIGADEBYAPPID_FIREBRIGADEAPPLICATIONID_2 =
			"fireBrigadeOperatorDetail.fireBrigadeApplicationId = ?";

	public FireBrigadeOperatorDetailPersistenceImpl() {
		setModelClass(FireBrigadeOperatorDetail.class);

		setModelImplClass(FireBrigadeOperatorDetailImpl.class);
		setModelPKClass(long.class);

		setTable(FireBrigadeOperatorDetailTable.INSTANCE);
	}

	/**
	 * Caches the fire brigade operator detail in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeOperatorDetail the fire brigade operator detail
	 */
	@Override
	public void cacheResult(
		FireBrigadeOperatorDetail fireBrigadeOperatorDetail) {

		entityCache.putResult(
			FireBrigadeOperatorDetailImpl.class,
			fireBrigadeOperatorDetail.getPrimaryKey(),
			fireBrigadeOperatorDetail);

		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeByAppId,
			new Object[] {
				fireBrigadeOperatorDetail.getFireBrigadeApplicationId()
			},
			fireBrigadeOperatorDetail);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the fire brigade operator details in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeOperatorDetails the fire brigade operator details
	 */
	@Override
	public void cacheResult(
		List<FireBrigadeOperatorDetail> fireBrigadeOperatorDetails) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fireBrigadeOperatorDetails.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FireBrigadeOperatorDetail fireBrigadeOperatorDetail :
				fireBrigadeOperatorDetails) {

			if (entityCache.getResult(
					FireBrigadeOperatorDetailImpl.class,
					fireBrigadeOperatorDetail.getPrimaryKey()) == null) {

				cacheResult(fireBrigadeOperatorDetail);
			}
		}
	}

	/**
	 * Clears the cache for all fire brigade operator details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FireBrigadeOperatorDetailImpl.class);

		finderCache.clearCache(FireBrigadeOperatorDetailImpl.class);
	}

	/**
	 * Clears the cache for the fire brigade operator detail.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FireBrigadeOperatorDetail fireBrigadeOperatorDetail) {

		entityCache.removeResult(
			FireBrigadeOperatorDetailImpl.class, fireBrigadeOperatorDetail);
	}

	@Override
	public void clearCache(
		List<FireBrigadeOperatorDetail> fireBrigadeOperatorDetails) {

		for (FireBrigadeOperatorDetail fireBrigadeOperatorDetail :
				fireBrigadeOperatorDetails) {

			entityCache.removeResult(
				FireBrigadeOperatorDetailImpl.class, fireBrigadeOperatorDetail);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FireBrigadeOperatorDetailImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FireBrigadeOperatorDetailImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FireBrigadeOperatorDetailModelImpl fireBrigadeOperatorDetailModelImpl) {

		Object[] args = new Object[] {
			fireBrigadeOperatorDetailModelImpl.getFireBrigadeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFireBrigadeByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeByAppId, args,
			fireBrigadeOperatorDetailModelImpl);
	}

	/**
	 * Creates a new fire brigade operator detail with the primary key. Does not add the fire brigade operator detail to the database.
	 *
	 * @param fireBrigadeOperatorDetailId the primary key for the new fire brigade operator detail
	 * @return the new fire brigade operator detail
	 */
	@Override
	public FireBrigadeOperatorDetail create(long fireBrigadeOperatorDetailId) {
		FireBrigadeOperatorDetail fireBrigadeOperatorDetail =
			new FireBrigadeOperatorDetailImpl();

		fireBrigadeOperatorDetail.setNew(true);
		fireBrigadeOperatorDetail.setPrimaryKey(fireBrigadeOperatorDetailId);

		fireBrigadeOperatorDetail.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return fireBrigadeOperatorDetail;
	}

	/**
	 * Removes the fire brigade operator detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeOperatorDetailId the primary key of the fire brigade operator detail
	 * @return the fire brigade operator detail that was removed
	 * @throws NoSuchFireBrigadeOperatorDetailException if a fire brigade operator detail with the primary key could not be found
	 */
	@Override
	public FireBrigadeOperatorDetail remove(long fireBrigadeOperatorDetailId)
		throws NoSuchFireBrigadeOperatorDetailException {

		return remove((Serializable)fireBrigadeOperatorDetailId);
	}

	/**
	 * Removes the fire brigade operator detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fire brigade operator detail
	 * @return the fire brigade operator detail that was removed
	 * @throws NoSuchFireBrigadeOperatorDetailException if a fire brigade operator detail with the primary key could not be found
	 */
	@Override
	public FireBrigadeOperatorDetail remove(Serializable primaryKey)
		throws NoSuchFireBrigadeOperatorDetailException {

		Session session = null;

		try {
			session = openSession();

			FireBrigadeOperatorDetail fireBrigadeOperatorDetail =
				(FireBrigadeOperatorDetail)session.get(
					FireBrigadeOperatorDetailImpl.class, primaryKey);

			if (fireBrigadeOperatorDetail == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFireBrigadeOperatorDetailException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(fireBrigadeOperatorDetail);
		}
		catch (NoSuchFireBrigadeOperatorDetailException noSuchEntityException) {
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
	protected FireBrigadeOperatorDetail removeImpl(
		FireBrigadeOperatorDetail fireBrigadeOperatorDetail) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fireBrigadeOperatorDetail)) {
				fireBrigadeOperatorDetail =
					(FireBrigadeOperatorDetail)session.get(
						FireBrigadeOperatorDetailImpl.class,
						fireBrigadeOperatorDetail.getPrimaryKeyObj());
			}

			if (fireBrigadeOperatorDetail != null) {
				session.delete(fireBrigadeOperatorDetail);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (fireBrigadeOperatorDetail != null) {
			clearCache(fireBrigadeOperatorDetail);
		}

		return fireBrigadeOperatorDetail;
	}

	@Override
	public FireBrigadeOperatorDetail updateImpl(
		FireBrigadeOperatorDetail fireBrigadeOperatorDetail) {

		boolean isNew = fireBrigadeOperatorDetail.isNew();

		if (!(fireBrigadeOperatorDetail instanceof
				FireBrigadeOperatorDetailModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(fireBrigadeOperatorDetail.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					fireBrigadeOperatorDetail);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in fireBrigadeOperatorDetail proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FireBrigadeOperatorDetail implementation " +
					fireBrigadeOperatorDetail.getClass());
		}

		FireBrigadeOperatorDetailModelImpl fireBrigadeOperatorDetailModelImpl =
			(FireBrigadeOperatorDetailModelImpl)fireBrigadeOperatorDetail;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (fireBrigadeOperatorDetail.getCreateDate() == null)) {
			if (serviceContext == null) {
				fireBrigadeOperatorDetail.setCreateDate(date);
			}
			else {
				fireBrigadeOperatorDetail.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!fireBrigadeOperatorDetailModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				fireBrigadeOperatorDetail.setModifiedDate(date);
			}
			else {
				fireBrigadeOperatorDetail.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(fireBrigadeOperatorDetail);
			}
			else {
				fireBrigadeOperatorDetail =
					(FireBrigadeOperatorDetail)session.merge(
						fireBrigadeOperatorDetail);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FireBrigadeOperatorDetailImpl.class,
			fireBrigadeOperatorDetailModelImpl, false, true);

		cacheUniqueFindersCache(fireBrigadeOperatorDetailModelImpl);

		if (isNew) {
			fireBrigadeOperatorDetail.setNew(false);
		}

		fireBrigadeOperatorDetail.resetOriginalValues();

		return fireBrigadeOperatorDetail;
	}

	/**
	 * Returns the fire brigade operator detail with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fire brigade operator detail
	 * @return the fire brigade operator detail
	 * @throws NoSuchFireBrigadeOperatorDetailException if a fire brigade operator detail with the primary key could not be found
	 */
	@Override
	public FireBrigadeOperatorDetail findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFireBrigadeOperatorDetailException {

		FireBrigadeOperatorDetail fireBrigadeOperatorDetail = fetchByPrimaryKey(
			primaryKey);

		if (fireBrigadeOperatorDetail == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFireBrigadeOperatorDetailException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return fireBrigadeOperatorDetail;
	}

	/**
	 * Returns the fire brigade operator detail with the primary key or throws a <code>NoSuchFireBrigadeOperatorDetailException</code> if it could not be found.
	 *
	 * @param fireBrigadeOperatorDetailId the primary key of the fire brigade operator detail
	 * @return the fire brigade operator detail
	 * @throws NoSuchFireBrigadeOperatorDetailException if a fire brigade operator detail with the primary key could not be found
	 */
	@Override
	public FireBrigadeOperatorDetail findByPrimaryKey(
			long fireBrigadeOperatorDetailId)
		throws NoSuchFireBrigadeOperatorDetailException {

		return findByPrimaryKey((Serializable)fireBrigadeOperatorDetailId);
	}

	/**
	 * Returns the fire brigade operator detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeOperatorDetailId the primary key of the fire brigade operator detail
	 * @return the fire brigade operator detail, or <code>null</code> if a fire brigade operator detail with the primary key could not be found
	 */
	@Override
	public FireBrigadeOperatorDetail fetchByPrimaryKey(
		long fireBrigadeOperatorDetailId) {

		return fetchByPrimaryKey((Serializable)fireBrigadeOperatorDetailId);
	}

	/**
	 * Returns all the fire brigade operator details.
	 *
	 * @return the fire brigade operator details
	 */
	@Override
	public List<FireBrigadeOperatorDetail> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade operator details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeOperatorDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade operator details
	 * @param end the upper bound of the range of fire brigade operator details (not inclusive)
	 * @return the range of fire brigade operator details
	 */
	@Override
	public List<FireBrigadeOperatorDetail> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade operator details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeOperatorDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade operator details
	 * @param end the upper bound of the range of fire brigade operator details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade operator details
	 */
	@Override
	public List<FireBrigadeOperatorDetail> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeOperatorDetail> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade operator details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeOperatorDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade operator details
	 * @param end the upper bound of the range of fire brigade operator details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade operator details
	 */
	@Override
	public List<FireBrigadeOperatorDetail> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeOperatorDetail> orderByComparator,
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

		List<FireBrigadeOperatorDetail> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeOperatorDetail>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FIREBRIGADEOPERATORDETAIL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FIREBRIGADEOPERATORDETAIL;

				sql = sql.concat(
					FireBrigadeOperatorDetailModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FireBrigadeOperatorDetail>)QueryUtil.list(
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
	 * Removes all the fire brigade operator details from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FireBrigadeOperatorDetail fireBrigadeOperatorDetail : findAll()) {
			remove(fireBrigadeOperatorDetail);
		}
	}

	/**
	 * Returns the number of fire brigade operator details.
	 *
	 * @return the number of fire brigade operator details
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
					_SQL_COUNT_FIREBRIGADEOPERATORDETAIL);

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
		return "fireBrigadeOperatorDetailId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FIREBRIGADEOPERATORDETAIL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FireBrigadeOperatorDetailModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the fire brigade operator detail persistence.
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

		_finderPathFetchBygetFireBrigadeByAppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFireBrigadeByAppId",
			new String[] {Long.class.getName()},
			new String[] {"fireBrigadeApplicationId"}, true);

		_finderPathCountBygetFireBrigadeByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFireBrigadeByAppId", new String[] {Long.class.getName()},
			new String[] {"fireBrigadeApplicationId"}, false);

		FireBrigadeOperatorDetailUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FireBrigadeOperatorDetailUtil.setPersistence(null);

		entityCache.removeCache(FireBrigadeOperatorDetailImpl.class.getName());
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FIREBRIGADEOPERATORDETAIL =
		"SELECT fireBrigadeOperatorDetail FROM FireBrigadeOperatorDetail fireBrigadeOperatorDetail";

	private static final String _SQL_SELECT_FIREBRIGADEOPERATORDETAIL_WHERE =
		"SELECT fireBrigadeOperatorDetail FROM FireBrigadeOperatorDetail fireBrigadeOperatorDetail WHERE ";

	private static final String _SQL_COUNT_FIREBRIGADEOPERATORDETAIL =
		"SELECT COUNT(fireBrigadeOperatorDetail) FROM FireBrigadeOperatorDetail fireBrigadeOperatorDetail";

	private static final String _SQL_COUNT_FIREBRIGADEOPERATORDETAIL_WHERE =
		"SELECT COUNT(fireBrigadeOperatorDetail) FROM FireBrigadeOperatorDetail fireBrigadeOperatorDetail WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"fireBrigadeOperatorDetail.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FireBrigadeOperatorDetail exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FireBrigadeOperatorDetail exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FireBrigadeOperatorDetailPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}