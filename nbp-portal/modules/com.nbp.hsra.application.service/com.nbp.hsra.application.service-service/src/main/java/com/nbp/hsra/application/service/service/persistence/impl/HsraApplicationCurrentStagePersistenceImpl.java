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

import com.nbp.hsra.application.service.exception.NoSuchHsraApplicationCurrentStageException;
import com.nbp.hsra.application.service.model.HsraApplicationCurrentStage;
import com.nbp.hsra.application.service.model.HsraApplicationCurrentStageTable;
import com.nbp.hsra.application.service.model.impl.HsraApplicationCurrentStageImpl;
import com.nbp.hsra.application.service.model.impl.HsraApplicationCurrentStageModelImpl;
import com.nbp.hsra.application.service.service.persistence.HsraApplicationCurrentStagePersistence;
import com.nbp.hsra.application.service.service.persistence.HsraApplicationCurrentStageUtil;
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
 * The persistence implementation for the hsra application current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HsraApplicationCurrentStagePersistence.class)
public class HsraApplicationCurrentStagePersistenceImpl
	extends BasePersistenceImpl<HsraApplicationCurrentStage>
	implements HsraApplicationCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HsraApplicationCurrentStageUtil</code> to access the hsra application current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HsraApplicationCurrentStageImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetHsra_Stage_HAI;
	private FinderPath _finderPathCountBygetHsra_Stage_HAI;

	/**
	 * Returns the hsra application current stage where hsraApplicationId = &#63; or throws a <code>NoSuchHsraApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application current stage
	 * @throws NoSuchHsraApplicationCurrentStageException if a matching hsra application current stage could not be found
	 */
	@Override
	public HsraApplicationCurrentStage findBygetHsra_Stage_HAI(
			long hsraApplicationId)
		throws NoSuchHsraApplicationCurrentStageException {

		HsraApplicationCurrentStage hsraApplicationCurrentStage =
			fetchBygetHsra_Stage_HAI(hsraApplicationId);

		if (hsraApplicationCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHsraApplicationCurrentStageException(sb.toString());
		}

		return hsraApplicationCurrentStage;
	}

	/**
	 * Returns the hsra application current stage where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application current stage, or <code>null</code> if a matching hsra application current stage could not be found
	 */
	@Override
	public HsraApplicationCurrentStage fetchBygetHsra_Stage_HAI(
		long hsraApplicationId) {

		return fetchBygetHsra_Stage_HAI(hsraApplicationId, true);
	}

	/**
	 * Returns the hsra application current stage where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application current stage, or <code>null</code> if a matching hsra application current stage could not be found
	 */
	@Override
	public HsraApplicationCurrentStage fetchBygetHsra_Stage_HAI(
		long hsraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {hsraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHsra_Stage_HAI, finderArgs, this);
		}

		if (result instanceof HsraApplicationCurrentStage) {
			HsraApplicationCurrentStage hsraApplicationCurrentStage =
				(HsraApplicationCurrentStage)result;

			if (hsraApplicationId !=
					hsraApplicationCurrentStage.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HSRAAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRA_STAGE_HAI_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<HsraApplicationCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHsra_Stage_HAI, finderArgs,
							list);
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
								"HsraApplicationCurrentStagePersistenceImpl.fetchBygetHsra_Stage_HAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HsraApplicationCurrentStage hsraApplicationCurrentStage =
						list.get(0);

					result = hsraApplicationCurrentStage;

					cacheResult(hsraApplicationCurrentStage);
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
			return (HsraApplicationCurrentStage)result;
		}
	}

	/**
	 * Removes the hsra application current stage where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the hsra application current stage that was removed
	 */
	@Override
	public HsraApplicationCurrentStage removeBygetHsra_Stage_HAI(
			long hsraApplicationId)
		throws NoSuchHsraApplicationCurrentStageException {

		HsraApplicationCurrentStage hsraApplicationCurrentStage =
			findBygetHsra_Stage_HAI(hsraApplicationId);

		return remove(hsraApplicationCurrentStage);
	}

	/**
	 * Returns the number of hsra application current stages where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra application current stages
	 */
	@Override
	public int countBygetHsra_Stage_HAI(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsra_Stage_HAI;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRA_STAGE_HAI_HSRAAPPLICATIONID_2);

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

	private static final String
		_FINDER_COLUMN_GETHSRA_STAGE_HAI_HSRAAPPLICATIONID_2 =
			"hsraApplicationCurrentStage.hsraApplicationId = ?";

	public HsraApplicationCurrentStagePersistenceImpl() {
		setModelClass(HsraApplicationCurrentStage.class);

		setModelImplClass(HsraApplicationCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(HsraApplicationCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the hsra application current stage in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationCurrentStage the hsra application current stage
	 */
	@Override
	public void cacheResult(
		HsraApplicationCurrentStage hsraApplicationCurrentStage) {

		entityCache.putResult(
			HsraApplicationCurrentStageImpl.class,
			hsraApplicationCurrentStage.getPrimaryKey(),
			hsraApplicationCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetHsra_Stage_HAI,
			new Object[] {hsraApplicationCurrentStage.getHsraApplicationId()},
			hsraApplicationCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the hsra application current stages in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationCurrentStages the hsra application current stages
	 */
	@Override
	public void cacheResult(
		List<HsraApplicationCurrentStage> hsraApplicationCurrentStages) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (hsraApplicationCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HsraApplicationCurrentStage hsraApplicationCurrentStage :
				hsraApplicationCurrentStages) {

			if (entityCache.getResult(
					HsraApplicationCurrentStageImpl.class,
					hsraApplicationCurrentStage.getPrimaryKey()) == null) {

				cacheResult(hsraApplicationCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all hsra application current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HsraApplicationCurrentStageImpl.class);

		finderCache.clearCache(HsraApplicationCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the hsra application current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		HsraApplicationCurrentStage hsraApplicationCurrentStage) {

		entityCache.removeResult(
			HsraApplicationCurrentStageImpl.class, hsraApplicationCurrentStage);
	}

	@Override
	public void clearCache(
		List<HsraApplicationCurrentStage> hsraApplicationCurrentStages) {

		for (HsraApplicationCurrentStage hsraApplicationCurrentStage :
				hsraApplicationCurrentStages) {

			entityCache.removeResult(
				HsraApplicationCurrentStageImpl.class,
				hsraApplicationCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HsraApplicationCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				HsraApplicationCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		HsraApplicationCurrentStageModelImpl
			hsraApplicationCurrentStageModelImpl) {

		Object[] args = new Object[] {
			hsraApplicationCurrentStageModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsra_Stage_HAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsra_Stage_HAI, args,
			hsraApplicationCurrentStageModelImpl);
	}

	/**
	 * Creates a new hsra application current stage with the primary key. Does not add the hsra application current stage to the database.
	 *
	 * @param hsraApplicationCurrentStageId the primary key for the new hsra application current stage
	 * @return the new hsra application current stage
	 */
	@Override
	public HsraApplicationCurrentStage create(
		long hsraApplicationCurrentStageId) {

		HsraApplicationCurrentStage hsraApplicationCurrentStage =
			new HsraApplicationCurrentStageImpl();

		hsraApplicationCurrentStage.setNew(true);
		hsraApplicationCurrentStage.setPrimaryKey(
			hsraApplicationCurrentStageId);

		hsraApplicationCurrentStage.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return hsraApplicationCurrentStage;
	}

	/**
	 * Removes the hsra application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraApplicationCurrentStageId the primary key of the hsra application current stage
	 * @return the hsra application current stage that was removed
	 * @throws NoSuchHsraApplicationCurrentStageException if a hsra application current stage with the primary key could not be found
	 */
	@Override
	public HsraApplicationCurrentStage remove(
			long hsraApplicationCurrentStageId)
		throws NoSuchHsraApplicationCurrentStageException {

		return remove((Serializable)hsraApplicationCurrentStageId);
	}

	/**
	 * Removes the hsra application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the hsra application current stage
	 * @return the hsra application current stage that was removed
	 * @throws NoSuchHsraApplicationCurrentStageException if a hsra application current stage with the primary key could not be found
	 */
	@Override
	public HsraApplicationCurrentStage remove(Serializable primaryKey)
		throws NoSuchHsraApplicationCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			HsraApplicationCurrentStage hsraApplicationCurrentStage =
				(HsraApplicationCurrentStage)session.get(
					HsraApplicationCurrentStageImpl.class, primaryKey);

			if (hsraApplicationCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHsraApplicationCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(hsraApplicationCurrentStage);
		}
		catch (NoSuchHsraApplicationCurrentStageException
					noSuchEntityException) {

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
	protected HsraApplicationCurrentStage removeImpl(
		HsraApplicationCurrentStage hsraApplicationCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(hsraApplicationCurrentStage)) {
				hsraApplicationCurrentStage =
					(HsraApplicationCurrentStage)session.get(
						HsraApplicationCurrentStageImpl.class,
						hsraApplicationCurrentStage.getPrimaryKeyObj());
			}

			if (hsraApplicationCurrentStage != null) {
				session.delete(hsraApplicationCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (hsraApplicationCurrentStage != null) {
			clearCache(hsraApplicationCurrentStage);
		}

		return hsraApplicationCurrentStage;
	}

	@Override
	public HsraApplicationCurrentStage updateImpl(
		HsraApplicationCurrentStage hsraApplicationCurrentStage) {

		boolean isNew = hsraApplicationCurrentStage.isNew();

		if (!(hsraApplicationCurrentStage instanceof
				HsraApplicationCurrentStageModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					hsraApplicationCurrentStage.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					hsraApplicationCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in hsraApplicationCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HsraApplicationCurrentStage implementation " +
					hsraApplicationCurrentStage.getClass());
		}

		HsraApplicationCurrentStageModelImpl
			hsraApplicationCurrentStageModelImpl =
				(HsraApplicationCurrentStageModelImpl)
					hsraApplicationCurrentStage;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (hsraApplicationCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				hsraApplicationCurrentStage.setCreateDate(date);
			}
			else {
				hsraApplicationCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!hsraApplicationCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				hsraApplicationCurrentStage.setModifiedDate(date);
			}
			else {
				hsraApplicationCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(hsraApplicationCurrentStage);
			}
			else {
				hsraApplicationCurrentStage =
					(HsraApplicationCurrentStage)session.merge(
						hsraApplicationCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HsraApplicationCurrentStageImpl.class,
			hsraApplicationCurrentStageModelImpl, false, true);

		cacheUniqueFindersCache(hsraApplicationCurrentStageModelImpl);

		if (isNew) {
			hsraApplicationCurrentStage.setNew(false);
		}

		hsraApplicationCurrentStage.resetOriginalValues();

		return hsraApplicationCurrentStage;
	}

	/**
	 * Returns the hsra application current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the hsra application current stage
	 * @return the hsra application current stage
	 * @throws NoSuchHsraApplicationCurrentStageException if a hsra application current stage with the primary key could not be found
	 */
	@Override
	public HsraApplicationCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHsraApplicationCurrentStageException {

		HsraApplicationCurrentStage hsraApplicationCurrentStage =
			fetchByPrimaryKey(primaryKey);

		if (hsraApplicationCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHsraApplicationCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return hsraApplicationCurrentStage;
	}

	/**
	 * Returns the hsra application current stage with the primary key or throws a <code>NoSuchHsraApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param hsraApplicationCurrentStageId the primary key of the hsra application current stage
	 * @return the hsra application current stage
	 * @throws NoSuchHsraApplicationCurrentStageException if a hsra application current stage with the primary key could not be found
	 */
	@Override
	public HsraApplicationCurrentStage findByPrimaryKey(
			long hsraApplicationCurrentStageId)
		throws NoSuchHsraApplicationCurrentStageException {

		return findByPrimaryKey((Serializable)hsraApplicationCurrentStageId);
	}

	/**
	 * Returns the hsra application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraApplicationCurrentStageId the primary key of the hsra application current stage
	 * @return the hsra application current stage, or <code>null</code> if a hsra application current stage with the primary key could not be found
	 */
	@Override
	public HsraApplicationCurrentStage fetchByPrimaryKey(
		long hsraApplicationCurrentStageId) {

		return fetchByPrimaryKey((Serializable)hsraApplicationCurrentStageId);
	}

	/**
	 * Returns all the hsra application current stages.
	 *
	 * @return the hsra application current stages
	 */
	@Override
	public List<HsraApplicationCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application current stages
	 * @param end the upper bound of the range of hsra application current stages (not inclusive)
	 * @return the range of hsra application current stages
	 */
	@Override
	public List<HsraApplicationCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application current stages
	 * @param end the upper bound of the range of hsra application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra application current stages
	 */
	@Override
	public List<HsraApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<HsraApplicationCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application current stages
	 * @param end the upper bound of the range of hsra application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra application current stages
	 */
	@Override
	public List<HsraApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<HsraApplicationCurrentStage> orderByComparator,
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

		List<HsraApplicationCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<HsraApplicationCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HSRAAPPLICATIONCURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HSRAAPPLICATIONCURRENTSTAGE;

				sql = sql.concat(
					HsraApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HsraApplicationCurrentStage>)QueryUtil.list(
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
	 * Removes all the hsra application current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HsraApplicationCurrentStage hsraApplicationCurrentStage :
				findAll()) {

			remove(hsraApplicationCurrentStage);
		}
	}

	/**
	 * Returns the number of hsra application current stages.
	 *
	 * @return the number of hsra application current stages
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
					_SQL_COUNT_HSRAAPPLICATIONCURRENTSTAGE);

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
		return "hsraApplicationCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HSRAAPPLICATIONCURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HsraApplicationCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the hsra application current stage persistence.
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

		_finderPathFetchBygetHsra_Stage_HAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHsra_Stage_HAI",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, true);

		_finderPathCountBygetHsra_Stage_HAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHsra_Stage_HAI", new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, false);

		HsraApplicationCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HsraApplicationCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(
			HsraApplicationCurrentStageImpl.class.getName());
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

	private static final String _SQL_SELECT_HSRAAPPLICATIONCURRENTSTAGE =
		"SELECT hsraApplicationCurrentStage FROM HsraApplicationCurrentStage hsraApplicationCurrentStage";

	private static final String _SQL_SELECT_HSRAAPPLICATIONCURRENTSTAGE_WHERE =
		"SELECT hsraApplicationCurrentStage FROM HsraApplicationCurrentStage hsraApplicationCurrentStage WHERE ";

	private static final String _SQL_COUNT_HSRAAPPLICATIONCURRENTSTAGE =
		"SELECT COUNT(hsraApplicationCurrentStage) FROM HsraApplicationCurrentStage hsraApplicationCurrentStage";

	private static final String _SQL_COUNT_HSRAAPPLICATIONCURRENTSTAGE_WHERE =
		"SELECT COUNT(hsraApplicationCurrentStage) FROM HsraApplicationCurrentStage hsraApplicationCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"hsraApplicationCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HsraApplicationCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HsraApplicationCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HsraApplicationCurrentStagePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}