/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service.persistence.impl;

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

import com.nbp.explosives.competency.application.form.service.exception.NoSuchExplosivesCurrentStageException;
import com.nbp.explosives.competency.application.form.service.model.ExplosivesCurrentStage;
import com.nbp.explosives.competency.application.form.service.model.ExplosivesCurrentStageTable;
import com.nbp.explosives.competency.application.form.service.model.impl.ExplosivesCurrentStageImpl;
import com.nbp.explosives.competency.application.form.service.model.impl.ExplosivesCurrentStageModelImpl;
import com.nbp.explosives.competency.application.form.service.service.persistence.ExplosivesCurrentStagePersistence;
import com.nbp.explosives.competency.application.form.service.service.persistence.ExplosivesCurrentStageUtil;
import com.nbp.explosives.competency.application.form.service.service.persistence.impl.constants.EXPLOSIVEPersistenceConstants;

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
 * The persistence implementation for the explosives current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ExplosivesCurrentStagePersistence.class)
public class ExplosivesCurrentStagePersistenceImpl
	extends BasePersistenceImpl<ExplosivesCurrentStage>
	implements ExplosivesCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ExplosivesCurrentStageUtil</code> to access the explosives current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ExplosivesCurrentStageImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetByExplosive_Stage;
	private FinderPath _finderPathCountBygetByExplosive_Stage;

	/**
	 * Returns the explosives current stage where explosivesApplicationId = &#63; or throws a <code>NoSuchExplosivesCurrentStageException</code> if it could not be found.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching explosives current stage
	 * @throws NoSuchExplosivesCurrentStageException if a matching explosives current stage could not be found
	 */
	@Override
	public ExplosivesCurrentStage findBygetByExplosive_Stage(
			long explosivesApplicationId)
		throws NoSuchExplosivesCurrentStageException {

		ExplosivesCurrentStage explosivesCurrentStage =
			fetchBygetByExplosive_Stage(explosivesApplicationId);

		if (explosivesCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("explosivesApplicationId=");
			sb.append(explosivesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchExplosivesCurrentStageException(sb.toString());
		}

		return explosivesCurrentStage;
	}

	/**
	 * Returns the explosives current stage where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching explosives current stage, or <code>null</code> if a matching explosives current stage could not be found
	 */
	@Override
	public ExplosivesCurrentStage fetchBygetByExplosive_Stage(
		long explosivesApplicationId) {

		return fetchBygetByExplosive_Stage(explosivesApplicationId, true);
	}

	/**
	 * Returns the explosives current stage where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosives current stage, or <code>null</code> if a matching explosives current stage could not be found
	 */
	@Override
	public ExplosivesCurrentStage fetchBygetByExplosive_Stage(
		long explosivesApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {explosivesApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetByExplosive_Stage, finderArgs, this);
		}

		if (result instanceof ExplosivesCurrentStage) {
			ExplosivesCurrentStage explosivesCurrentStage =
				(ExplosivesCurrentStage)result;

			if (explosivesApplicationId !=
					explosivesCurrentStage.getExplosivesApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_EXPLOSIVESCURRENTSTAGE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETBYEXPLOSIVE_STAGE_EXPLOSIVESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(explosivesApplicationId);

				List<ExplosivesCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetByExplosive_Stage, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									explosivesApplicationId
								};
							}

							_log.warn(
								"ExplosivesCurrentStagePersistenceImpl.fetchBygetByExplosive_Stage(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ExplosivesCurrentStage explosivesCurrentStage = list.get(0);

					result = explosivesCurrentStage;

					cacheResult(explosivesCurrentStage);
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
			return (ExplosivesCurrentStage)result;
		}
	}

	/**
	 * Removes the explosives current stage where explosivesApplicationId = &#63; from the database.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the explosives current stage that was removed
	 */
	@Override
	public ExplosivesCurrentStage removeBygetByExplosive_Stage(
			long explosivesApplicationId)
		throws NoSuchExplosivesCurrentStageException {

		ExplosivesCurrentStage explosivesCurrentStage =
			findBygetByExplosive_Stage(explosivesApplicationId);

		return remove(explosivesCurrentStage);
	}

	/**
	 * Returns the number of explosives current stages where explosivesApplicationId = &#63;.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the number of matching explosives current stages
	 */
	@Override
	public int countBygetByExplosive_Stage(long explosivesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetByExplosive_Stage;

		Object[] finderArgs = new Object[] {explosivesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_EXPLOSIVESCURRENTSTAGE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETBYEXPLOSIVE_STAGE_EXPLOSIVESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(explosivesApplicationId);

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
		_FINDER_COLUMN_GETBYEXPLOSIVE_STAGE_EXPLOSIVESAPPLICATIONID_2 =
			"explosivesCurrentStage.explosivesApplicationId = ?";

	public ExplosivesCurrentStagePersistenceImpl() {
		setModelClass(ExplosivesCurrentStage.class);

		setModelImplClass(ExplosivesCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(ExplosivesCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the explosives current stage in the entity cache if it is enabled.
	 *
	 * @param explosivesCurrentStage the explosives current stage
	 */
	@Override
	public void cacheResult(ExplosivesCurrentStage explosivesCurrentStage) {
		entityCache.putResult(
			ExplosivesCurrentStageImpl.class,
			explosivesCurrentStage.getPrimaryKey(), explosivesCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetByExplosive_Stage,
			new Object[] {explosivesCurrentStage.getExplosivesApplicationId()},
			explosivesCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the explosives current stages in the entity cache if it is enabled.
	 *
	 * @param explosivesCurrentStages the explosives current stages
	 */
	@Override
	public void cacheResult(
		List<ExplosivesCurrentStage> explosivesCurrentStages) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (explosivesCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ExplosivesCurrentStage explosivesCurrentStage :
				explosivesCurrentStages) {

			if (entityCache.getResult(
					ExplosivesCurrentStageImpl.class,
					explosivesCurrentStage.getPrimaryKey()) == null) {

				cacheResult(explosivesCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all explosives current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ExplosivesCurrentStageImpl.class);

		finderCache.clearCache(ExplosivesCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the explosives current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ExplosivesCurrentStage explosivesCurrentStage) {
		entityCache.removeResult(
			ExplosivesCurrentStageImpl.class, explosivesCurrentStage);
	}

	@Override
	public void clearCache(
		List<ExplosivesCurrentStage> explosivesCurrentStages) {

		for (ExplosivesCurrentStage explosivesCurrentStage :
				explosivesCurrentStages) {

			entityCache.removeResult(
				ExplosivesCurrentStageImpl.class, explosivesCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ExplosivesCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ExplosivesCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ExplosivesCurrentStageModelImpl explosivesCurrentStageModelImpl) {

		Object[] args = new Object[] {
			explosivesCurrentStageModelImpl.getExplosivesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetByExplosive_Stage, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetByExplosive_Stage, args,
			explosivesCurrentStageModelImpl);
	}

	/**
	 * Creates a new explosives current stage with the primary key. Does not add the explosives current stage to the database.
	 *
	 * @param explosiveStageId the primary key for the new explosives current stage
	 * @return the new explosives current stage
	 */
	@Override
	public ExplosivesCurrentStage create(long explosiveStageId) {
		ExplosivesCurrentStage explosivesCurrentStage =
			new ExplosivesCurrentStageImpl();

		explosivesCurrentStage.setNew(true);
		explosivesCurrentStage.setPrimaryKey(explosiveStageId);

		explosivesCurrentStage.setCompanyId(CompanyThreadLocal.getCompanyId());

		return explosivesCurrentStage;
	}

	/**
	 * Removes the explosives current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param explosiveStageId the primary key of the explosives current stage
	 * @return the explosives current stage that was removed
	 * @throws NoSuchExplosivesCurrentStageException if a explosives current stage with the primary key could not be found
	 */
	@Override
	public ExplosivesCurrentStage remove(long explosiveStageId)
		throws NoSuchExplosivesCurrentStageException {

		return remove((Serializable)explosiveStageId);
	}

	/**
	 * Removes the explosives current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the explosives current stage
	 * @return the explosives current stage that was removed
	 * @throws NoSuchExplosivesCurrentStageException if a explosives current stage with the primary key could not be found
	 */
	@Override
	public ExplosivesCurrentStage remove(Serializable primaryKey)
		throws NoSuchExplosivesCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			ExplosivesCurrentStage explosivesCurrentStage =
				(ExplosivesCurrentStage)session.get(
					ExplosivesCurrentStageImpl.class, primaryKey);

			if (explosivesCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchExplosivesCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(explosivesCurrentStage);
		}
		catch (NoSuchExplosivesCurrentStageException noSuchEntityException) {
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
	protected ExplosivesCurrentStage removeImpl(
		ExplosivesCurrentStage explosivesCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(explosivesCurrentStage)) {
				explosivesCurrentStage = (ExplosivesCurrentStage)session.get(
					ExplosivesCurrentStageImpl.class,
					explosivesCurrentStage.getPrimaryKeyObj());
			}

			if (explosivesCurrentStage != null) {
				session.delete(explosivesCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (explosivesCurrentStage != null) {
			clearCache(explosivesCurrentStage);
		}

		return explosivesCurrentStage;
	}

	@Override
	public ExplosivesCurrentStage updateImpl(
		ExplosivesCurrentStage explosivesCurrentStage) {

		boolean isNew = explosivesCurrentStage.isNew();

		if (!(explosivesCurrentStage instanceof
				ExplosivesCurrentStageModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(explosivesCurrentStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					explosivesCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in explosivesCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ExplosivesCurrentStage implementation " +
					explosivesCurrentStage.getClass());
		}

		ExplosivesCurrentStageModelImpl explosivesCurrentStageModelImpl =
			(ExplosivesCurrentStageModelImpl)explosivesCurrentStage;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (explosivesCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				explosivesCurrentStage.setCreateDate(date);
			}
			else {
				explosivesCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!explosivesCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				explosivesCurrentStage.setModifiedDate(date);
			}
			else {
				explosivesCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(explosivesCurrentStage);
			}
			else {
				explosivesCurrentStage = (ExplosivesCurrentStage)session.merge(
					explosivesCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ExplosivesCurrentStageImpl.class, explosivesCurrentStageModelImpl,
			false, true);

		cacheUniqueFindersCache(explosivesCurrentStageModelImpl);

		if (isNew) {
			explosivesCurrentStage.setNew(false);
		}

		explosivesCurrentStage.resetOriginalValues();

		return explosivesCurrentStage;
	}

	/**
	 * Returns the explosives current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the explosives current stage
	 * @return the explosives current stage
	 * @throws NoSuchExplosivesCurrentStageException if a explosives current stage with the primary key could not be found
	 */
	@Override
	public ExplosivesCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchExplosivesCurrentStageException {

		ExplosivesCurrentStage explosivesCurrentStage = fetchByPrimaryKey(
			primaryKey);

		if (explosivesCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchExplosivesCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return explosivesCurrentStage;
	}

	/**
	 * Returns the explosives current stage with the primary key or throws a <code>NoSuchExplosivesCurrentStageException</code> if it could not be found.
	 *
	 * @param explosiveStageId the primary key of the explosives current stage
	 * @return the explosives current stage
	 * @throws NoSuchExplosivesCurrentStageException if a explosives current stage with the primary key could not be found
	 */
	@Override
	public ExplosivesCurrentStage findByPrimaryKey(long explosiveStageId)
		throws NoSuchExplosivesCurrentStageException {

		return findByPrimaryKey((Serializable)explosiveStageId);
	}

	/**
	 * Returns the explosives current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param explosiveStageId the primary key of the explosives current stage
	 * @return the explosives current stage, or <code>null</code> if a explosives current stage with the primary key could not be found
	 */
	@Override
	public ExplosivesCurrentStage fetchByPrimaryKey(long explosiveStageId) {
		return fetchByPrimaryKey((Serializable)explosiveStageId);
	}

	/**
	 * Returns all the explosives current stages.
	 *
	 * @return the explosives current stages
	 */
	@Override
	public List<ExplosivesCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the explosives current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives current stages
	 * @param end the upper bound of the range of explosives current stages (not inclusive)
	 * @return the range of explosives current stages
	 */
	@Override
	public List<ExplosivesCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the explosives current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives current stages
	 * @param end the upper bound of the range of explosives current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of explosives current stages
	 */
	@Override
	public List<ExplosivesCurrentStage> findAll(
		int start, int end,
		OrderByComparator<ExplosivesCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the explosives current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives current stages
	 * @param end the upper bound of the range of explosives current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of explosives current stages
	 */
	@Override
	public List<ExplosivesCurrentStage> findAll(
		int start, int end,
		OrderByComparator<ExplosivesCurrentStage> orderByComparator,
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

		List<ExplosivesCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<ExplosivesCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_EXPLOSIVESCURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_EXPLOSIVESCURRENTSTAGE;

				sql = sql.concat(ExplosivesCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ExplosivesCurrentStage>)QueryUtil.list(
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
	 * Removes all the explosives current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ExplosivesCurrentStage explosivesCurrentStage : findAll()) {
			remove(explosivesCurrentStage);
		}
	}

	/**
	 * Returns the number of explosives current stages.
	 *
	 * @return the number of explosives current stages
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
					_SQL_COUNT_EXPLOSIVESCURRENTSTAGE);

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
		return "explosiveStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_EXPLOSIVESCURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ExplosivesCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the explosives current stage persistence.
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

		_finderPathFetchBygetByExplosive_Stage = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetByExplosive_Stage",
			new String[] {Long.class.getName()},
			new String[] {"explosivesApplicationId"}, true);

		_finderPathCountBygetByExplosive_Stage = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetByExplosive_Stage", new String[] {Long.class.getName()},
			new String[] {"explosivesApplicationId"}, false);

		ExplosivesCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ExplosivesCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(ExplosivesCurrentStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = EXPLOSIVEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = EXPLOSIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = EXPLOSIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_EXPLOSIVESCURRENTSTAGE =
		"SELECT explosivesCurrentStage FROM ExplosivesCurrentStage explosivesCurrentStage";

	private static final String _SQL_SELECT_EXPLOSIVESCURRENTSTAGE_WHERE =
		"SELECT explosivesCurrentStage FROM ExplosivesCurrentStage explosivesCurrentStage WHERE ";

	private static final String _SQL_COUNT_EXPLOSIVESCURRENTSTAGE =
		"SELECT COUNT(explosivesCurrentStage) FROM ExplosivesCurrentStage explosivesCurrentStage";

	private static final String _SQL_COUNT_EXPLOSIVESCURRENTSTAGE_WHERE =
		"SELECT COUNT(explosivesCurrentStage) FROM ExplosivesCurrentStage explosivesCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"explosivesCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ExplosivesCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ExplosivesCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ExplosivesCurrentStagePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}