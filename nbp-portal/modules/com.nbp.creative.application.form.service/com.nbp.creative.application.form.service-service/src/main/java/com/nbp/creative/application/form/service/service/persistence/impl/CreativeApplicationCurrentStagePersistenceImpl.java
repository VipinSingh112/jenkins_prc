/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence.impl;

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

import com.nbp.creative.application.form.service.exception.NoSuchCreativeApplicationCurrentStageException;
import com.nbp.creative.application.form.service.model.CreativeApplicationCurrentStage;
import com.nbp.creative.application.form.service.model.CreativeApplicationCurrentStageTable;
import com.nbp.creative.application.form.service.model.impl.CreativeApplicationCurrentStageImpl;
import com.nbp.creative.application.form.service.model.impl.CreativeApplicationCurrentStageModelImpl;
import com.nbp.creative.application.form.service.service.persistence.CreativeApplicationCurrentStagePersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeApplicationCurrentStageUtil;
import com.nbp.creative.application.form.service.service.persistence.impl.constants.CREATIVEPersistenceConstants;

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
 * The persistence implementation for the creative application current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CreativeApplicationCurrentStagePersistence.class)
public class CreativeApplicationCurrentStagePersistenceImpl
	extends BasePersistenceImpl<CreativeApplicationCurrentStage>
	implements CreativeApplicationCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CreativeApplicationCurrentStageUtil</code> to access the creative application current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CreativeApplicationCurrentStageImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetCreativeById;
	private FinderPath _finderPathCountBygetCreativeById;

	/**
	 * Returns the creative application current stage where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative application current stage
	 * @throws NoSuchCreativeApplicationCurrentStageException if a matching creative application current stage could not be found
	 */
	@Override
	public CreativeApplicationCurrentStage findBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeApplicationCurrentStageException {

		CreativeApplicationCurrentStage creativeApplicationCurrentStage =
			fetchBygetCreativeById(CreativeApplicationId);

		if (creativeApplicationCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("CreativeApplicationId=");
			sb.append(CreativeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCreativeApplicationCurrentStageException(
				sb.toString());
		}

		return creativeApplicationCurrentStage;
	}

	/**
	 * Returns the creative application current stage where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative application current stage, or <code>null</code> if a matching creative application current stage could not be found
	 */
	@Override
	public CreativeApplicationCurrentStage fetchBygetCreativeById(
		long CreativeApplicationId) {

		return fetchBygetCreativeById(CreativeApplicationId, true);
	}

	/**
	 * Returns the creative application current stage where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application current stage, or <code>null</code> if a matching creative application current stage could not be found
	 */
	@Override
	public CreativeApplicationCurrentStage fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {CreativeApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCreativeById, finderArgs, this);
		}

		if (result instanceof CreativeApplicationCurrentStage) {
			CreativeApplicationCurrentStage creativeApplicationCurrentStage =
				(CreativeApplicationCurrentStage)result;

			if (CreativeApplicationId !=
					creativeApplicationCurrentStage.
						getCreativeApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CREATIVEAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETCREATIVEBYID_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

				List<CreativeApplicationCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCreativeById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									CreativeApplicationId
								};
							}

							_log.warn(
								"CreativeApplicationCurrentStagePersistenceImpl.fetchBygetCreativeById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CreativeApplicationCurrentStage
						creativeApplicationCurrentStage = list.get(0);

					result = creativeApplicationCurrentStage;

					cacheResult(creativeApplicationCurrentStage);
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
			return (CreativeApplicationCurrentStage)result;
		}
	}

	/**
	 * Removes the creative application current stage where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative application current stage that was removed
	 */
	@Override
	public CreativeApplicationCurrentStage removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeApplicationCurrentStageException {

		CreativeApplicationCurrentStage creativeApplicationCurrentStage =
			findBygetCreativeById(CreativeApplicationId);

		return remove(creativeApplicationCurrentStage);
	}

	/**
	 * Returns the number of creative application current stages where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative application current stages
	 */
	@Override
	public int countBygetCreativeById(long CreativeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCreativeById;

		Object[] finderArgs = new Object[] {CreativeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVEAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETCREATIVEBYID_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

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
		_FINDER_COLUMN_GETCREATIVEBYID_CREATIVEAPPLICATIONID_2 =
			"creativeApplicationCurrentStage.CreativeApplicationId = ?";

	private FinderPath _finderPathFetchBygetCA_Stage_CAI;
	private FinderPath _finderPathCountBygetCA_Stage_CAI;

	/**
	 * Returns the creative application current stage where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative application current stage
	 * @throws NoSuchCreativeApplicationCurrentStageException if a matching creative application current stage could not be found
	 */
	@Override
	public CreativeApplicationCurrentStage findBygetCA_Stage_CAI(
			long CreativeApplicationId)
		throws NoSuchCreativeApplicationCurrentStageException {

		CreativeApplicationCurrentStage creativeApplicationCurrentStage =
			fetchBygetCA_Stage_CAI(CreativeApplicationId);

		if (creativeApplicationCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("CreativeApplicationId=");
			sb.append(CreativeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCreativeApplicationCurrentStageException(
				sb.toString());
		}

		return creativeApplicationCurrentStage;
	}

	/**
	 * Returns the creative application current stage where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative application current stage, or <code>null</code> if a matching creative application current stage could not be found
	 */
	@Override
	public CreativeApplicationCurrentStage fetchBygetCA_Stage_CAI(
		long CreativeApplicationId) {

		return fetchBygetCA_Stage_CAI(CreativeApplicationId, true);
	}

	/**
	 * Returns the creative application current stage where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application current stage, or <code>null</code> if a matching creative application current stage could not be found
	 */
	@Override
	public CreativeApplicationCurrentStage fetchBygetCA_Stage_CAI(
		long CreativeApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {CreativeApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCA_Stage_CAI, finderArgs, this);
		}

		if (result instanceof CreativeApplicationCurrentStage) {
			CreativeApplicationCurrentStage creativeApplicationCurrentStage =
				(CreativeApplicationCurrentStage)result;

			if (CreativeApplicationId !=
					creativeApplicationCurrentStage.
						getCreativeApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CREATIVEAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_STAGE_CAI_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

				List<CreativeApplicationCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCA_Stage_CAI, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									CreativeApplicationId
								};
							}

							_log.warn(
								"CreativeApplicationCurrentStagePersistenceImpl.fetchBygetCA_Stage_CAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CreativeApplicationCurrentStage
						creativeApplicationCurrentStage = list.get(0);

					result = creativeApplicationCurrentStage;

					cacheResult(creativeApplicationCurrentStage);
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
			return (CreativeApplicationCurrentStage)result;
		}
	}

	/**
	 * Removes the creative application current stage where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative application current stage that was removed
	 */
	@Override
	public CreativeApplicationCurrentStage removeBygetCA_Stage_CAI(
			long CreativeApplicationId)
		throws NoSuchCreativeApplicationCurrentStageException {

		CreativeApplicationCurrentStage creativeApplicationCurrentStage =
			findBygetCA_Stage_CAI(CreativeApplicationId);

		return remove(creativeApplicationCurrentStage);
	}

	/**
	 * Returns the number of creative application current stages where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative application current stages
	 */
	@Override
	public int countBygetCA_Stage_CAI(long CreativeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCA_Stage_CAI;

		Object[] finderArgs = new Object[] {CreativeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVEAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETCA_STAGE_CAI_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

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
		_FINDER_COLUMN_GETCA_STAGE_CAI_CREATIVEAPPLICATIONID_2 =
			"creativeApplicationCurrentStage.CreativeApplicationId = ?";

	public CreativeApplicationCurrentStagePersistenceImpl() {
		setModelClass(CreativeApplicationCurrentStage.class);

		setModelImplClass(CreativeApplicationCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(CreativeApplicationCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the creative application current stage in the entity cache if it is enabled.
	 *
	 * @param creativeApplicationCurrentStage the creative application current stage
	 */
	@Override
	public void cacheResult(
		CreativeApplicationCurrentStage creativeApplicationCurrentStage) {

		entityCache.putResult(
			CreativeApplicationCurrentStageImpl.class,
			creativeApplicationCurrentStage.getPrimaryKey(),
			creativeApplicationCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetCreativeById,
			new Object[] {
				creativeApplicationCurrentStage.getCreativeApplicationId()
			},
			creativeApplicationCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetCA_Stage_CAI,
			new Object[] {
				creativeApplicationCurrentStage.getCreativeApplicationId()
			},
			creativeApplicationCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the creative application current stages in the entity cache if it is enabled.
	 *
	 * @param creativeApplicationCurrentStages the creative application current stages
	 */
	@Override
	public void cacheResult(
		List<CreativeApplicationCurrentStage>
			creativeApplicationCurrentStages) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (creativeApplicationCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CreativeApplicationCurrentStage creativeApplicationCurrentStage :
				creativeApplicationCurrentStages) {

			if (entityCache.getResult(
					CreativeApplicationCurrentStageImpl.class,
					creativeApplicationCurrentStage.getPrimaryKey()) == null) {

				cacheResult(creativeApplicationCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all creative application current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CreativeApplicationCurrentStageImpl.class);

		finderCache.clearCache(CreativeApplicationCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the creative application current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CreativeApplicationCurrentStage creativeApplicationCurrentStage) {

		entityCache.removeResult(
			CreativeApplicationCurrentStageImpl.class,
			creativeApplicationCurrentStage);
	}

	@Override
	public void clearCache(
		List<CreativeApplicationCurrentStage>
			creativeApplicationCurrentStages) {

		for (CreativeApplicationCurrentStage creativeApplicationCurrentStage :
				creativeApplicationCurrentStages) {

			entityCache.removeResult(
				CreativeApplicationCurrentStageImpl.class,
				creativeApplicationCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CreativeApplicationCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CreativeApplicationCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CreativeApplicationCurrentStageModelImpl
			creativeApplicationCurrentStageModelImpl) {

		Object[] args = new Object[] {
			creativeApplicationCurrentStageModelImpl.getCreativeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCreativeById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCreativeById, args,
			creativeApplicationCurrentStageModelImpl);

		args = new Object[] {
			creativeApplicationCurrentStageModelImpl.getCreativeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCA_Stage_CAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCA_Stage_CAI, args,
			creativeApplicationCurrentStageModelImpl);
	}

	/**
	 * Creates a new creative application current stage with the primary key. Does not add the creative application current stage to the database.
	 *
	 * @param creativeAppliCurrentStageId the primary key for the new creative application current stage
	 * @return the new creative application current stage
	 */
	@Override
	public CreativeApplicationCurrentStage create(
		long creativeAppliCurrentStageId) {

		CreativeApplicationCurrentStage creativeApplicationCurrentStage =
			new CreativeApplicationCurrentStageImpl();

		creativeApplicationCurrentStage.setNew(true);
		creativeApplicationCurrentStage.setPrimaryKey(
			creativeAppliCurrentStageId);

		creativeApplicationCurrentStage.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return creativeApplicationCurrentStage;
	}

	/**
	 * Removes the creative application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeAppliCurrentStageId the primary key of the creative application current stage
	 * @return the creative application current stage that was removed
	 * @throws NoSuchCreativeApplicationCurrentStageException if a creative application current stage with the primary key could not be found
	 */
	@Override
	public CreativeApplicationCurrentStage remove(
			long creativeAppliCurrentStageId)
		throws NoSuchCreativeApplicationCurrentStageException {

		return remove((Serializable)creativeAppliCurrentStageId);
	}

	/**
	 * Removes the creative application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the creative application current stage
	 * @return the creative application current stage that was removed
	 * @throws NoSuchCreativeApplicationCurrentStageException if a creative application current stage with the primary key could not be found
	 */
	@Override
	public CreativeApplicationCurrentStage remove(Serializable primaryKey)
		throws NoSuchCreativeApplicationCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			CreativeApplicationCurrentStage creativeApplicationCurrentStage =
				(CreativeApplicationCurrentStage)session.get(
					CreativeApplicationCurrentStageImpl.class, primaryKey);

			if (creativeApplicationCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCreativeApplicationCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(creativeApplicationCurrentStage);
		}
		catch (NoSuchCreativeApplicationCurrentStageException
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
	protected CreativeApplicationCurrentStage removeImpl(
		CreativeApplicationCurrentStage creativeApplicationCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(creativeApplicationCurrentStage)) {
				creativeApplicationCurrentStage =
					(CreativeApplicationCurrentStage)session.get(
						CreativeApplicationCurrentStageImpl.class,
						creativeApplicationCurrentStage.getPrimaryKeyObj());
			}

			if (creativeApplicationCurrentStage != null) {
				session.delete(creativeApplicationCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (creativeApplicationCurrentStage != null) {
			clearCache(creativeApplicationCurrentStage);
		}

		return creativeApplicationCurrentStage;
	}

	@Override
	public CreativeApplicationCurrentStage updateImpl(
		CreativeApplicationCurrentStage creativeApplicationCurrentStage) {

		boolean isNew = creativeApplicationCurrentStage.isNew();

		if (!(creativeApplicationCurrentStage instanceof
				CreativeApplicationCurrentStageModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					creativeApplicationCurrentStage.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					creativeApplicationCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in creativeApplicationCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CreativeApplicationCurrentStage implementation " +
					creativeApplicationCurrentStage.getClass());
		}

		CreativeApplicationCurrentStageModelImpl
			creativeApplicationCurrentStageModelImpl =
				(CreativeApplicationCurrentStageModelImpl)
					creativeApplicationCurrentStage;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(creativeApplicationCurrentStage.getCreateDate() == null)) {

			if (serviceContext == null) {
				creativeApplicationCurrentStage.setCreateDate(date);
			}
			else {
				creativeApplicationCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!creativeApplicationCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				creativeApplicationCurrentStage.setModifiedDate(date);
			}
			else {
				creativeApplicationCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(creativeApplicationCurrentStage);
			}
			else {
				creativeApplicationCurrentStage =
					(CreativeApplicationCurrentStage)session.merge(
						creativeApplicationCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CreativeApplicationCurrentStageImpl.class,
			creativeApplicationCurrentStageModelImpl, false, true);

		cacheUniqueFindersCache(creativeApplicationCurrentStageModelImpl);

		if (isNew) {
			creativeApplicationCurrentStage.setNew(false);
		}

		creativeApplicationCurrentStage.resetOriginalValues();

		return creativeApplicationCurrentStage;
	}

	/**
	 * Returns the creative application current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the creative application current stage
	 * @return the creative application current stage
	 * @throws NoSuchCreativeApplicationCurrentStageException if a creative application current stage with the primary key could not be found
	 */
	@Override
	public CreativeApplicationCurrentStage findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchCreativeApplicationCurrentStageException {

		CreativeApplicationCurrentStage creativeApplicationCurrentStage =
			fetchByPrimaryKey(primaryKey);

		if (creativeApplicationCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCreativeApplicationCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return creativeApplicationCurrentStage;
	}

	/**
	 * Returns the creative application current stage with the primary key or throws a <code>NoSuchCreativeApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param creativeAppliCurrentStageId the primary key of the creative application current stage
	 * @return the creative application current stage
	 * @throws NoSuchCreativeApplicationCurrentStageException if a creative application current stage with the primary key could not be found
	 */
	@Override
	public CreativeApplicationCurrentStage findByPrimaryKey(
			long creativeAppliCurrentStageId)
		throws NoSuchCreativeApplicationCurrentStageException {

		return findByPrimaryKey((Serializable)creativeAppliCurrentStageId);
	}

	/**
	 * Returns the creative application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeAppliCurrentStageId the primary key of the creative application current stage
	 * @return the creative application current stage, or <code>null</code> if a creative application current stage with the primary key could not be found
	 */
	@Override
	public CreativeApplicationCurrentStage fetchByPrimaryKey(
		long creativeAppliCurrentStageId) {

		return fetchByPrimaryKey((Serializable)creativeAppliCurrentStageId);
	}

	/**
	 * Returns all the creative application current stages.
	 *
	 * @return the creative application current stages
	 */
	@Override
	public List<CreativeApplicationCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative application current stages
	 * @param end the upper bound of the range of creative application current stages (not inclusive)
	 * @return the range of creative application current stages
	 */
	@Override
	public List<CreativeApplicationCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative application current stages
	 * @param end the upper bound of the range of creative application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative application current stages
	 */
	@Override
	public List<CreativeApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<CreativeApplicationCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative application current stages
	 * @param end the upper bound of the range of creative application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative application current stages
	 */
	@Override
	public List<CreativeApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<CreativeApplicationCurrentStage> orderByComparator,
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

		List<CreativeApplicationCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<CreativeApplicationCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CREATIVEAPPLICATIONCURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CREATIVEAPPLICATIONCURRENTSTAGE;

				sql = sql.concat(
					CreativeApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CreativeApplicationCurrentStage>)QueryUtil.list(
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
	 * Removes all the creative application current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CreativeApplicationCurrentStage creativeApplicationCurrentStage :
				findAll()) {

			remove(creativeApplicationCurrentStage);
		}
	}

	/**
	 * Returns the number of creative application current stages.
	 *
	 * @return the number of creative application current stages
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
					_SQL_COUNT_CREATIVEAPPLICATIONCURRENTSTAGE);

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
		return "creativeAppliCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CREATIVEAPPLICATIONCURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CreativeApplicationCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the creative application current stage persistence.
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

		_finderPathFetchBygetCreativeById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCreativeById",
			new String[] {Long.class.getName()},
			new String[] {"CreativeApplicationId"}, true);

		_finderPathCountBygetCreativeById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCreativeById",
			new String[] {Long.class.getName()},
			new String[] {"CreativeApplicationId"}, false);

		_finderPathFetchBygetCA_Stage_CAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCA_Stage_CAI",
			new String[] {Long.class.getName()},
			new String[] {"CreativeApplicationId"}, true);

		_finderPathCountBygetCA_Stage_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCA_Stage_CAI",
			new String[] {Long.class.getName()},
			new String[] {"CreativeApplicationId"}, false);

		CreativeApplicationCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CreativeApplicationCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(
			CreativeApplicationCurrentStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = CREATIVEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CREATIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CREATIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CREATIVEAPPLICATIONCURRENTSTAGE =
		"SELECT creativeApplicationCurrentStage FROM CreativeApplicationCurrentStage creativeApplicationCurrentStage";

	private static final String
		_SQL_SELECT_CREATIVEAPPLICATIONCURRENTSTAGE_WHERE =
			"SELECT creativeApplicationCurrentStage FROM CreativeApplicationCurrentStage creativeApplicationCurrentStage WHERE ";

	private static final String _SQL_COUNT_CREATIVEAPPLICATIONCURRENTSTAGE =
		"SELECT COUNT(creativeApplicationCurrentStage) FROM CreativeApplicationCurrentStage creativeApplicationCurrentStage";

	private static final String
		_SQL_COUNT_CREATIVEAPPLICATIONCURRENTSTAGE_WHERE =
			"SELECT COUNT(creativeApplicationCurrentStage) FROM CreativeApplicationCurrentStage creativeApplicationCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"creativeApplicationCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CreativeApplicationCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CreativeApplicationCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CreativeApplicationCurrentStagePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}