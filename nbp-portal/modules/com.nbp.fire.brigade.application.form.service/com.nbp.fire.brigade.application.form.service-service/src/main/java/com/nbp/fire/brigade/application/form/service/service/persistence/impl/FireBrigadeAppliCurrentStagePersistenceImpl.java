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

import com.nbp.fire.brigade.application.form.service.exception.NoSuchFireBrigadeAppliCurrentStageException;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeAppliCurrentStage;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeAppliCurrentStageTable;
import com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeAppliCurrentStageImpl;
import com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeAppliCurrentStageModelImpl;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeAppliCurrentStagePersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeAppliCurrentStageUtil;
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
 * The persistence implementation for the fire brigade appli current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FireBrigadeAppliCurrentStagePersistence.class)
public class FireBrigadeAppliCurrentStagePersistenceImpl
	extends BasePersistenceImpl<FireBrigadeAppliCurrentStage>
	implements FireBrigadeAppliCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FireBrigadeAppliCurrentStageUtil</code> to access the fire brigade appli current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FireBrigadeAppliCurrentStageImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetFireBrigade_Stage_FBAI;
	private FinderPath _finderPathCountBygetFireBrigade_Stage_FBAI;

	/**
	 * Returns the fire brigade appli current stage where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeAppliCurrentStageException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade appli current stage
	 * @throws NoSuchFireBrigadeAppliCurrentStageException if a matching fire brigade appli current stage could not be found
	 */
	@Override
	public FireBrigadeAppliCurrentStage findBygetFireBrigade_Stage_FBAI(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeAppliCurrentStageException {

		FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage =
			fetchBygetFireBrigade_Stage_FBAI(fireBrigadeApplicationId);

		if (fireBrigadeAppliCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("fireBrigadeApplicationId=");
			sb.append(fireBrigadeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFireBrigadeAppliCurrentStageException(
				sb.toString());
		}

		return fireBrigadeAppliCurrentStage;
	}

	/**
	 * Returns the fire brigade appli current stage where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade appli current stage, or <code>null</code> if a matching fire brigade appli current stage could not be found
	 */
	@Override
	public FireBrigadeAppliCurrentStage fetchBygetFireBrigade_Stage_FBAI(
		long fireBrigadeApplicationId) {

		return fetchBygetFireBrigade_Stage_FBAI(fireBrigadeApplicationId, true);
	}

	/**
	 * Returns the fire brigade appli current stage where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade appli current stage, or <code>null</code> if a matching fire brigade appli current stage could not be found
	 */
	@Override
	public FireBrigadeAppliCurrentStage fetchBygetFireBrigade_Stage_FBAI(
		long fireBrigadeApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {fireBrigadeApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFireBrigade_Stage_FBAI, finderArgs, this);
		}

		if (result instanceof FireBrigadeAppliCurrentStage) {
			FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage =
				(FireBrigadeAppliCurrentStage)result;

			if (fireBrigadeApplicationId !=
					fireBrigadeAppliCurrentStage.
						getFireBrigadeApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FIREBRIGADEAPPLICURRENTSTAGE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETFIREBRIGADE_STAGE_FBAI_FIREBRIGADEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(fireBrigadeApplicationId);

				List<FireBrigadeAppliCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFireBrigade_Stage_FBAI,
							finderArgs, list);
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
								"FireBrigadeAppliCurrentStagePersistenceImpl.fetchBygetFireBrigade_Stage_FBAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage =
						list.get(0);

					result = fireBrigadeAppliCurrentStage;

					cacheResult(fireBrigadeAppliCurrentStage);
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
			return (FireBrigadeAppliCurrentStage)result;
		}
	}

	/**
	 * Removes the fire brigade appli current stage where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade appli current stage that was removed
	 */
	@Override
	public FireBrigadeAppliCurrentStage removeBygetFireBrigade_Stage_FBAI(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeAppliCurrentStageException {

		FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage =
			findBygetFireBrigade_Stage_FBAI(fireBrigadeApplicationId);

		return remove(fireBrigadeAppliCurrentStage);
	}

	/**
	 * Returns the number of fire brigade appli current stages where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade appli current stages
	 */
	@Override
	public int countBygetFireBrigade_Stage_FBAI(long fireBrigadeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFireBrigade_Stage_FBAI;

		Object[] finderArgs = new Object[] {fireBrigadeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPLICURRENTSTAGE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETFIREBRIGADE_STAGE_FBAI_FIREBRIGADEAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETFIREBRIGADE_STAGE_FBAI_FIREBRIGADEAPPLICATIONID_2 =
			"fireBrigadeAppliCurrentStage.fireBrigadeApplicationId = ?";

	public FireBrigadeAppliCurrentStagePersistenceImpl() {
		setModelClass(FireBrigadeAppliCurrentStage.class);

		setModelImplClass(FireBrigadeAppliCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(FireBrigadeAppliCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the fire brigade appli current stage in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeAppliCurrentStage the fire brigade appli current stage
	 */
	@Override
	public void cacheResult(
		FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage) {

		entityCache.putResult(
			FireBrigadeAppliCurrentStageImpl.class,
			fireBrigadeAppliCurrentStage.getPrimaryKey(),
			fireBrigadeAppliCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetFireBrigade_Stage_FBAI,
			new Object[] {
				fireBrigadeAppliCurrentStage.getFireBrigadeApplicationId()
			},
			fireBrigadeAppliCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the fire brigade appli current stages in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeAppliCurrentStages the fire brigade appli current stages
	 */
	@Override
	public void cacheResult(
		List<FireBrigadeAppliCurrentStage> fireBrigadeAppliCurrentStages) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fireBrigadeAppliCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage :
				fireBrigadeAppliCurrentStages) {

			if (entityCache.getResult(
					FireBrigadeAppliCurrentStageImpl.class,
					fireBrigadeAppliCurrentStage.getPrimaryKey()) == null) {

				cacheResult(fireBrigadeAppliCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all fire brigade appli current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FireBrigadeAppliCurrentStageImpl.class);

		finderCache.clearCache(FireBrigadeAppliCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the fire brigade appli current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage) {

		entityCache.removeResult(
			FireBrigadeAppliCurrentStageImpl.class,
			fireBrigadeAppliCurrentStage);
	}

	@Override
	public void clearCache(
		List<FireBrigadeAppliCurrentStage> fireBrigadeAppliCurrentStages) {

		for (FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage :
				fireBrigadeAppliCurrentStages) {

			entityCache.removeResult(
				FireBrigadeAppliCurrentStageImpl.class,
				fireBrigadeAppliCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FireBrigadeAppliCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FireBrigadeAppliCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FireBrigadeAppliCurrentStageModelImpl
			fireBrigadeAppliCurrentStageModelImpl) {

		Object[] args = new Object[] {
			fireBrigadeAppliCurrentStageModelImpl.getFireBrigadeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFireBrigade_Stage_FBAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFireBrigade_Stage_FBAI, args,
			fireBrigadeAppliCurrentStageModelImpl);
	}

	/**
	 * Creates a new fire brigade appli current stage with the primary key. Does not add the fire brigade appli current stage to the database.
	 *
	 * @param fireBrigadeAppliCurrentStageId the primary key for the new fire brigade appli current stage
	 * @return the new fire brigade appli current stage
	 */
	@Override
	public FireBrigadeAppliCurrentStage create(
		long fireBrigadeAppliCurrentStageId) {

		FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage =
			new FireBrigadeAppliCurrentStageImpl();

		fireBrigadeAppliCurrentStage.setNew(true);
		fireBrigadeAppliCurrentStage.setPrimaryKey(
			fireBrigadeAppliCurrentStageId);

		fireBrigadeAppliCurrentStage.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return fireBrigadeAppliCurrentStage;
	}

	/**
	 * Removes the fire brigade appli current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeAppliCurrentStageId the primary key of the fire brigade appli current stage
	 * @return the fire brigade appli current stage that was removed
	 * @throws NoSuchFireBrigadeAppliCurrentStageException if a fire brigade appli current stage with the primary key could not be found
	 */
	@Override
	public FireBrigadeAppliCurrentStage remove(
			long fireBrigadeAppliCurrentStageId)
		throws NoSuchFireBrigadeAppliCurrentStageException {

		return remove((Serializable)fireBrigadeAppliCurrentStageId);
	}

	/**
	 * Removes the fire brigade appli current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fire brigade appli current stage
	 * @return the fire brigade appli current stage that was removed
	 * @throws NoSuchFireBrigadeAppliCurrentStageException if a fire brigade appli current stage with the primary key could not be found
	 */
	@Override
	public FireBrigadeAppliCurrentStage remove(Serializable primaryKey)
		throws NoSuchFireBrigadeAppliCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage =
				(FireBrigadeAppliCurrentStage)session.get(
					FireBrigadeAppliCurrentStageImpl.class, primaryKey);

			if (fireBrigadeAppliCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFireBrigadeAppliCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(fireBrigadeAppliCurrentStage);
		}
		catch (NoSuchFireBrigadeAppliCurrentStageException
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
	protected FireBrigadeAppliCurrentStage removeImpl(
		FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fireBrigadeAppliCurrentStage)) {
				fireBrigadeAppliCurrentStage =
					(FireBrigadeAppliCurrentStage)session.get(
						FireBrigadeAppliCurrentStageImpl.class,
						fireBrigadeAppliCurrentStage.getPrimaryKeyObj());
			}

			if (fireBrigadeAppliCurrentStage != null) {
				session.delete(fireBrigadeAppliCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (fireBrigadeAppliCurrentStage != null) {
			clearCache(fireBrigadeAppliCurrentStage);
		}

		return fireBrigadeAppliCurrentStage;
	}

	@Override
	public FireBrigadeAppliCurrentStage updateImpl(
		FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage) {

		boolean isNew = fireBrigadeAppliCurrentStage.isNew();

		if (!(fireBrigadeAppliCurrentStage instanceof
				FireBrigadeAppliCurrentStageModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					fireBrigadeAppliCurrentStage.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					fireBrigadeAppliCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in fireBrigadeAppliCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FireBrigadeAppliCurrentStage implementation " +
					fireBrigadeAppliCurrentStage.getClass());
		}

		FireBrigadeAppliCurrentStageModelImpl
			fireBrigadeAppliCurrentStageModelImpl =
				(FireBrigadeAppliCurrentStageModelImpl)
					fireBrigadeAppliCurrentStage;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (fireBrigadeAppliCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				fireBrigadeAppliCurrentStage.setCreateDate(date);
			}
			else {
				fireBrigadeAppliCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!fireBrigadeAppliCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				fireBrigadeAppliCurrentStage.setModifiedDate(date);
			}
			else {
				fireBrigadeAppliCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(fireBrigadeAppliCurrentStage);
			}
			else {
				fireBrigadeAppliCurrentStage =
					(FireBrigadeAppliCurrentStage)session.merge(
						fireBrigadeAppliCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FireBrigadeAppliCurrentStageImpl.class,
			fireBrigadeAppliCurrentStageModelImpl, false, true);

		cacheUniqueFindersCache(fireBrigadeAppliCurrentStageModelImpl);

		if (isNew) {
			fireBrigadeAppliCurrentStage.setNew(false);
		}

		fireBrigadeAppliCurrentStage.resetOriginalValues();

		return fireBrigadeAppliCurrentStage;
	}

	/**
	 * Returns the fire brigade appli current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fire brigade appli current stage
	 * @return the fire brigade appli current stage
	 * @throws NoSuchFireBrigadeAppliCurrentStageException if a fire brigade appli current stage with the primary key could not be found
	 */
	@Override
	public FireBrigadeAppliCurrentStage findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchFireBrigadeAppliCurrentStageException {

		FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage =
			fetchByPrimaryKey(primaryKey);

		if (fireBrigadeAppliCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFireBrigadeAppliCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return fireBrigadeAppliCurrentStage;
	}

	/**
	 * Returns the fire brigade appli current stage with the primary key or throws a <code>NoSuchFireBrigadeAppliCurrentStageException</code> if it could not be found.
	 *
	 * @param fireBrigadeAppliCurrentStageId the primary key of the fire brigade appli current stage
	 * @return the fire brigade appli current stage
	 * @throws NoSuchFireBrigadeAppliCurrentStageException if a fire brigade appli current stage with the primary key could not be found
	 */
	@Override
	public FireBrigadeAppliCurrentStage findByPrimaryKey(
			long fireBrigadeAppliCurrentStageId)
		throws NoSuchFireBrigadeAppliCurrentStageException {

		return findByPrimaryKey((Serializable)fireBrigadeAppliCurrentStageId);
	}

	/**
	 * Returns the fire brigade appli current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeAppliCurrentStageId the primary key of the fire brigade appli current stage
	 * @return the fire brigade appli current stage, or <code>null</code> if a fire brigade appli current stage with the primary key could not be found
	 */
	@Override
	public FireBrigadeAppliCurrentStage fetchByPrimaryKey(
		long fireBrigadeAppliCurrentStageId) {

		return fetchByPrimaryKey((Serializable)fireBrigadeAppliCurrentStageId);
	}

	/**
	 * Returns all the fire brigade appli current stages.
	 *
	 * @return the fire brigade appli current stages
	 */
	@Override
	public List<FireBrigadeAppliCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade appli current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade appli current stages
	 * @param end the upper bound of the range of fire brigade appli current stages (not inclusive)
	 * @return the range of fire brigade appli current stages
	 */
	@Override
	public List<FireBrigadeAppliCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade appli current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade appli current stages
	 * @param end the upper bound of the range of fire brigade appli current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade appli current stages
	 */
	@Override
	public List<FireBrigadeAppliCurrentStage> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeAppliCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade appli current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade appli current stages
	 * @param end the upper bound of the range of fire brigade appli current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade appli current stages
	 */
	@Override
	public List<FireBrigadeAppliCurrentStage> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeAppliCurrentStage> orderByComparator,
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

		List<FireBrigadeAppliCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeAppliCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FIREBRIGADEAPPLICURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FIREBRIGADEAPPLICURRENTSTAGE;

				sql = sql.concat(
					FireBrigadeAppliCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FireBrigadeAppliCurrentStage>)QueryUtil.list(
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
	 * Removes all the fire brigade appli current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage :
				findAll()) {

			remove(fireBrigadeAppliCurrentStage);
		}
	}

	/**
	 * Returns the number of fire brigade appli current stages.
	 *
	 * @return the number of fire brigade appli current stages
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
					_SQL_COUNT_FIREBRIGADEAPPLICURRENTSTAGE);

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
		return "fireBrigadeAppliCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FIREBRIGADEAPPLICURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FireBrigadeAppliCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the fire brigade appli current stage persistence.
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

		_finderPathFetchBygetFireBrigade_Stage_FBAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFireBrigade_Stage_FBAI",
			new String[] {Long.class.getName()},
			new String[] {"fireBrigadeApplicationId"}, true);

		_finderPathCountBygetFireBrigade_Stage_FBAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFireBrigade_Stage_FBAI",
			new String[] {Long.class.getName()},
			new String[] {"fireBrigadeApplicationId"}, false);

		FireBrigadeAppliCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FireBrigadeAppliCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(
			FireBrigadeAppliCurrentStageImpl.class.getName());
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

	private static final String _SQL_SELECT_FIREBRIGADEAPPLICURRENTSTAGE =
		"SELECT fireBrigadeAppliCurrentStage FROM FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage";

	private static final String _SQL_SELECT_FIREBRIGADEAPPLICURRENTSTAGE_WHERE =
		"SELECT fireBrigadeAppliCurrentStage FROM FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage WHERE ";

	private static final String _SQL_COUNT_FIREBRIGADEAPPLICURRENTSTAGE =
		"SELECT COUNT(fireBrigadeAppliCurrentStage) FROM FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage";

	private static final String _SQL_COUNT_FIREBRIGADEAPPLICURRENTSTAGE_WHERE =
		"SELECT COUNT(fireBrigadeAppliCurrentStage) FROM FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"fireBrigadeAppliCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FireBrigadeAppliCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FireBrigadeAppliCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FireBrigadeAppliCurrentStagePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}