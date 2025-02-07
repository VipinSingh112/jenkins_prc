/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence.impl;

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

import com.nbp.healthcare.application.form.service.exception.NoSuchHealthCareCurrentStageException;
import com.nbp.healthcare.application.form.service.model.HealthCareCurrentStage;
import com.nbp.healthcare.application.form.service.model.HealthCareCurrentStageTable;
import com.nbp.healthcare.application.form.service.model.impl.HealthCareCurrentStageImpl;
import com.nbp.healthcare.application.form.service.model.impl.HealthCareCurrentStageModelImpl;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareCurrentStagePersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareCurrentStageUtil;
import com.nbp.healthcare.application.form.service.service.persistence.impl.constants.HEALTHPersistenceConstants;

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
 * The persistence implementation for the health care current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HealthCareCurrentStagePersistence.class)
public class HealthCareCurrentStagePersistenceImpl
	extends BasePersistenceImpl<HealthCareCurrentStage>
	implements HealthCareCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HealthCareCurrentStageUtil</code> to access the health care current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HealthCareCurrentStageImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygethealthById;
	private FinderPath _finderPathCountBygethealthById;

	/**
	 * Returns the health care current stage where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareCurrentStageException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care current stage
	 * @throws NoSuchHealthCareCurrentStageException if a matching health care current stage could not be found
	 */
	@Override
	public HealthCareCurrentStage findBygethealthById(
			long healthCareApplicationId)
		throws NoSuchHealthCareCurrentStageException {

		HealthCareCurrentStage healthCareCurrentStage = fetchBygethealthById(
			healthCareApplicationId);

		if (healthCareCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("healthCareApplicationId=");
			sb.append(healthCareApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHealthCareCurrentStageException(sb.toString());
		}

		return healthCareCurrentStage;
	}

	/**
	 * Returns the health care current stage where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care current stage, or <code>null</code> if a matching health care current stage could not be found
	 */
	@Override
	public HealthCareCurrentStage fetchBygethealthById(
		long healthCareApplicationId) {

		return fetchBygethealthById(healthCareApplicationId, true);
	}

	/**
	 * Returns the health care current stage where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care current stage, or <code>null</code> if a matching health care current stage could not be found
	 */
	@Override
	public HealthCareCurrentStage fetchBygethealthById(
		long healthCareApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {healthCareApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygethealthById, finderArgs, this);
		}

		if (result instanceof HealthCareCurrentStage) {
			HealthCareCurrentStage healthCareCurrentStage =
				(HealthCareCurrentStage)result;

			if (healthCareApplicationId !=
					healthCareCurrentStage.getHealthCareApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HEALTHCARECURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETHEALTHBYID_HEALTHCAREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(healthCareApplicationId);

				List<HealthCareCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygethealthById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									healthCareApplicationId
								};
							}

							_log.warn(
								"HealthCareCurrentStagePersistenceImpl.fetchBygethealthById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HealthCareCurrentStage healthCareCurrentStage = list.get(0);

					result = healthCareCurrentStage;

					cacheResult(healthCareCurrentStage);
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
			return (HealthCareCurrentStage)result;
		}
	}

	/**
	 * Removes the health care current stage where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care current stage that was removed
	 */
	@Override
	public HealthCareCurrentStage removeBygethealthById(
			long healthCareApplicationId)
		throws NoSuchHealthCareCurrentStageException {

		HealthCareCurrentStage healthCareCurrentStage = findBygethealthById(
			healthCareApplicationId);

		return remove(healthCareCurrentStage);
	}

	/**
	 * Returns the number of health care current stages where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care current stages
	 */
	@Override
	public int countBygethealthById(long healthCareApplicationId) {
		FinderPath finderPath = _finderPathCountBygethealthById;

		Object[] finderArgs = new Object[] {healthCareApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HEALTHCARECURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETHEALTHBYID_HEALTHCAREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(healthCareApplicationId);

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
		_FINDER_COLUMN_GETHEALTHBYID_HEALTHCAREAPPLICATIONID_2 =
			"healthCareCurrentStage.healthCareApplicationId = ?";

	public HealthCareCurrentStagePersistenceImpl() {
		setModelClass(HealthCareCurrentStage.class);

		setModelImplClass(HealthCareCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(HealthCareCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the health care current stage in the entity cache if it is enabled.
	 *
	 * @param healthCareCurrentStage the health care current stage
	 */
	@Override
	public void cacheResult(HealthCareCurrentStage healthCareCurrentStage) {
		entityCache.putResult(
			HealthCareCurrentStageImpl.class,
			healthCareCurrentStage.getPrimaryKey(), healthCareCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygethealthById,
			new Object[] {healthCareCurrentStage.getHealthCareApplicationId()},
			healthCareCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the health care current stages in the entity cache if it is enabled.
	 *
	 * @param healthCareCurrentStages the health care current stages
	 */
	@Override
	public void cacheResult(
		List<HealthCareCurrentStage> healthCareCurrentStages) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (healthCareCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HealthCareCurrentStage healthCareCurrentStage :
				healthCareCurrentStages) {

			if (entityCache.getResult(
					HealthCareCurrentStageImpl.class,
					healthCareCurrentStage.getPrimaryKey()) == null) {

				cacheResult(healthCareCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all health care current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HealthCareCurrentStageImpl.class);

		finderCache.clearCache(HealthCareCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the health care current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HealthCareCurrentStage healthCareCurrentStage) {
		entityCache.removeResult(
			HealthCareCurrentStageImpl.class, healthCareCurrentStage);
	}

	@Override
	public void clearCache(
		List<HealthCareCurrentStage> healthCareCurrentStages) {

		for (HealthCareCurrentStage healthCareCurrentStage :
				healthCareCurrentStages) {

			entityCache.removeResult(
				HealthCareCurrentStageImpl.class, healthCareCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HealthCareCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				HealthCareCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		HealthCareCurrentStageModelImpl healthCareCurrentStageModelImpl) {

		Object[] args = new Object[] {
			healthCareCurrentStageModelImpl.getHealthCareApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygethealthById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygethealthById, args,
			healthCareCurrentStageModelImpl);
	}

	/**
	 * Creates a new health care current stage with the primary key. Does not add the health care current stage to the database.
	 *
	 * @param HealthCareCurrentStageId the primary key for the new health care current stage
	 * @return the new health care current stage
	 */
	@Override
	public HealthCareCurrentStage create(long HealthCareCurrentStageId) {
		HealthCareCurrentStage healthCareCurrentStage =
			new HealthCareCurrentStageImpl();

		healthCareCurrentStage.setNew(true);
		healthCareCurrentStage.setPrimaryKey(HealthCareCurrentStageId);

		healthCareCurrentStage.setCompanyId(CompanyThreadLocal.getCompanyId());

		return healthCareCurrentStage;
	}

	/**
	 * Removes the health care current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param HealthCareCurrentStageId the primary key of the health care current stage
	 * @return the health care current stage that was removed
	 * @throws NoSuchHealthCareCurrentStageException if a health care current stage with the primary key could not be found
	 */
	@Override
	public HealthCareCurrentStage remove(long HealthCareCurrentStageId)
		throws NoSuchHealthCareCurrentStageException {

		return remove((Serializable)HealthCareCurrentStageId);
	}

	/**
	 * Removes the health care current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the health care current stage
	 * @return the health care current stage that was removed
	 * @throws NoSuchHealthCareCurrentStageException if a health care current stage with the primary key could not be found
	 */
	@Override
	public HealthCareCurrentStage remove(Serializable primaryKey)
		throws NoSuchHealthCareCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			HealthCareCurrentStage healthCareCurrentStage =
				(HealthCareCurrentStage)session.get(
					HealthCareCurrentStageImpl.class, primaryKey);

			if (healthCareCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHealthCareCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(healthCareCurrentStage);
		}
		catch (NoSuchHealthCareCurrentStageException noSuchEntityException) {
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
	protected HealthCareCurrentStage removeImpl(
		HealthCareCurrentStage healthCareCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(healthCareCurrentStage)) {
				healthCareCurrentStage = (HealthCareCurrentStage)session.get(
					HealthCareCurrentStageImpl.class,
					healthCareCurrentStage.getPrimaryKeyObj());
			}

			if (healthCareCurrentStage != null) {
				session.delete(healthCareCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (healthCareCurrentStage != null) {
			clearCache(healthCareCurrentStage);
		}

		return healthCareCurrentStage;
	}

	@Override
	public HealthCareCurrentStage updateImpl(
		HealthCareCurrentStage healthCareCurrentStage) {

		boolean isNew = healthCareCurrentStage.isNew();

		if (!(healthCareCurrentStage instanceof
				HealthCareCurrentStageModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(healthCareCurrentStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					healthCareCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in healthCareCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HealthCareCurrentStage implementation " +
					healthCareCurrentStage.getClass());
		}

		HealthCareCurrentStageModelImpl healthCareCurrentStageModelImpl =
			(HealthCareCurrentStageModelImpl)healthCareCurrentStage;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (healthCareCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				healthCareCurrentStage.setCreateDate(date);
			}
			else {
				healthCareCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!healthCareCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				healthCareCurrentStage.setModifiedDate(date);
			}
			else {
				healthCareCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(healthCareCurrentStage);
			}
			else {
				healthCareCurrentStage = (HealthCareCurrentStage)session.merge(
					healthCareCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HealthCareCurrentStageImpl.class, healthCareCurrentStageModelImpl,
			false, true);

		cacheUniqueFindersCache(healthCareCurrentStageModelImpl);

		if (isNew) {
			healthCareCurrentStage.setNew(false);
		}

		healthCareCurrentStage.resetOriginalValues();

		return healthCareCurrentStage;
	}

	/**
	 * Returns the health care current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the health care current stage
	 * @return the health care current stage
	 * @throws NoSuchHealthCareCurrentStageException if a health care current stage with the primary key could not be found
	 */
	@Override
	public HealthCareCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHealthCareCurrentStageException {

		HealthCareCurrentStage healthCareCurrentStage = fetchByPrimaryKey(
			primaryKey);

		if (healthCareCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHealthCareCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return healthCareCurrentStage;
	}

	/**
	 * Returns the health care current stage with the primary key or throws a <code>NoSuchHealthCareCurrentStageException</code> if it could not be found.
	 *
	 * @param HealthCareCurrentStageId the primary key of the health care current stage
	 * @return the health care current stage
	 * @throws NoSuchHealthCareCurrentStageException if a health care current stage with the primary key could not be found
	 */
	@Override
	public HealthCareCurrentStage findByPrimaryKey(
			long HealthCareCurrentStageId)
		throws NoSuchHealthCareCurrentStageException {

		return findByPrimaryKey((Serializable)HealthCareCurrentStageId);
	}

	/**
	 * Returns the health care current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param HealthCareCurrentStageId the primary key of the health care current stage
	 * @return the health care current stage, or <code>null</code> if a health care current stage with the primary key could not be found
	 */
	@Override
	public HealthCareCurrentStage fetchByPrimaryKey(
		long HealthCareCurrentStageId) {

		return fetchByPrimaryKey((Serializable)HealthCareCurrentStageId);
	}

	/**
	 * Returns all the health care current stages.
	 *
	 * @return the health care current stages
	 */
	@Override
	public List<HealthCareCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the health care current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care current stages
	 * @param end the upper bound of the range of health care current stages (not inclusive)
	 * @return the range of health care current stages
	 */
	@Override
	public List<HealthCareCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the health care current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care current stages
	 * @param end the upper bound of the range of health care current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care current stages
	 */
	@Override
	public List<HealthCareCurrentStage> findAll(
		int start, int end,
		OrderByComparator<HealthCareCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the health care current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care current stages
	 * @param end the upper bound of the range of health care current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care current stages
	 */
	@Override
	public List<HealthCareCurrentStage> findAll(
		int start, int end,
		OrderByComparator<HealthCareCurrentStage> orderByComparator,
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

		List<HealthCareCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<HealthCareCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HEALTHCARECURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HEALTHCARECURRENTSTAGE;

				sql = sql.concat(HealthCareCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HealthCareCurrentStage>)QueryUtil.list(
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
	 * Removes all the health care current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HealthCareCurrentStage healthCareCurrentStage : findAll()) {
			remove(healthCareCurrentStage);
		}
	}

	/**
	 * Returns the number of health care current stages.
	 *
	 * @return the number of health care current stages
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
					_SQL_COUNT_HEALTHCARECURRENTSTAGE);

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
		return "HealthCareCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HEALTHCARECURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HealthCareCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the health care current stage persistence.
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

		_finderPathFetchBygethealthById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygethealthById",
			new String[] {Long.class.getName()},
			new String[] {"healthCareApplicationId"}, true);

		_finderPathCountBygethealthById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygethealthById",
			new String[] {Long.class.getName()},
			new String[] {"healthCareApplicationId"}, false);

		HealthCareCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HealthCareCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(HealthCareCurrentStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = HEALTHPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HEALTHPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HEALTHPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_HEALTHCARECURRENTSTAGE =
		"SELECT healthCareCurrentStage FROM HealthCareCurrentStage healthCareCurrentStage";

	private static final String _SQL_SELECT_HEALTHCARECURRENTSTAGE_WHERE =
		"SELECT healthCareCurrentStage FROM HealthCareCurrentStage healthCareCurrentStage WHERE ";

	private static final String _SQL_COUNT_HEALTHCARECURRENTSTAGE =
		"SELECT COUNT(healthCareCurrentStage) FROM HealthCareCurrentStage healthCareCurrentStage";

	private static final String _SQL_COUNT_HEALTHCARECURRENTSTAGE_WHERE =
		"SELECT COUNT(healthCareCurrentStage) FROM HealthCareCurrentStage healthCareCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"healthCareCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HealthCareCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HealthCareCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HealthCareCurrentStagePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}