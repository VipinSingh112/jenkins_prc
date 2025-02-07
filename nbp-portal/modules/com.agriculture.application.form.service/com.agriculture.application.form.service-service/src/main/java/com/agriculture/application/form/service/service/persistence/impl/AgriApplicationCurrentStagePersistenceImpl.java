/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence.impl;

import com.agriculture.application.form.service.exception.NoSuchAgriApplicationCurrentStageException;
import com.agriculture.application.form.service.model.AgriApplicationCurrentStage;
import com.agriculture.application.form.service.model.AgriApplicationCurrentStageTable;
import com.agriculture.application.form.service.model.impl.AgriApplicationCurrentStageImpl;
import com.agriculture.application.form.service.model.impl.AgriApplicationCurrentStageModelImpl;
import com.agriculture.application.form.service.service.persistence.AgriApplicationCurrentStagePersistence;
import com.agriculture.application.form.service.service.persistence.AgriApplicationCurrentStageUtil;
import com.agriculture.application.form.service.service.persistence.impl.constants.AGRICULTUREPersistenceConstants;

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
 * The persistence implementation for the agri application current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AgriApplicationCurrentStagePersistence.class)
public class AgriApplicationCurrentStagePersistenceImpl
	extends BasePersistenceImpl<AgriApplicationCurrentStage>
	implements AgriApplicationCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AgriApplicationCurrentStageUtil</code> to access the agri application current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AgriApplicationCurrentStageImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetAgricultureById;
	private FinderPath _finderPathCountBygetAgricultureById;

	/**
	 * Returns the agri application current stage where agricultureApplicationId = &#63; or throws a <code>NoSuchAgriApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agri application current stage
	 * @throws NoSuchAgriApplicationCurrentStageException if a matching agri application current stage could not be found
	 */
	@Override
	public AgriApplicationCurrentStage findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgriApplicationCurrentStageException {

		AgriApplicationCurrentStage agriApplicationCurrentStage =
			fetchBygetAgricultureById(agricultureApplicationId);

		if (agriApplicationCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("agricultureApplicationId=");
			sb.append(agricultureApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAgriApplicationCurrentStageException(sb.toString());
		}

		return agriApplicationCurrentStage;
	}

	/**
	 * Returns the agri application current stage where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agri application current stage, or <code>null</code> if a matching agri application current stage could not be found
	 */
	@Override
	public AgriApplicationCurrentStage fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return fetchBygetAgricultureById(agricultureApplicationId, true);
	}

	/**
	 * Returns the agri application current stage where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agri application current stage, or <code>null</code> if a matching agri application current stage could not be found
	 */
	@Override
	public AgriApplicationCurrentStage fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {agricultureApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAgricultureById, finderArgs, this);
		}

		if (result instanceof AgriApplicationCurrentStage) {
			AgriApplicationCurrentStage agriApplicationCurrentStage =
				(AgriApplicationCurrentStage)result;

			if (agricultureApplicationId !=
					agriApplicationCurrentStage.getAgricultureApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_AGRIAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETAGRICULTUREBYID_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				List<AgriApplicationCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAgricultureById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									agricultureApplicationId
								};
							}

							_log.warn(
								"AgriApplicationCurrentStagePersistenceImpl.fetchBygetAgricultureById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgriApplicationCurrentStage agriApplicationCurrentStage =
						list.get(0);

					result = agriApplicationCurrentStage;

					cacheResult(agriApplicationCurrentStage);
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
			return (AgriApplicationCurrentStage)result;
		}
	}

	/**
	 * Removes the agri application current stage where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agri application current stage that was removed
	 */
	@Override
	public AgriApplicationCurrentStage removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgriApplicationCurrentStageException {

		AgriApplicationCurrentStage agriApplicationCurrentStage =
			findBygetAgricultureById(agricultureApplicationId);

		return remove(agriApplicationCurrentStage);
	}

	/**
	 * Returns the number of agri application current stages where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agri application current stages
	 */
	@Override
	public int countBygetAgricultureById(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAgricultureById;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRIAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETAGRICULTUREBYID_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

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
		_FINDER_COLUMN_GETAGRICULTUREBYID_AGRICULTUREAPPLICATIONID_2 =
			"agriApplicationCurrentStage.agricultureApplicationId = ?";

	private FinderPath _finderPathFetchBygetAA_Stage_AAI;
	private FinderPath _finderPathCountBygetAA_Stage_AAI;

	/**
	 * Returns the agri application current stage where agricultureApplicationId = &#63; or throws a <code>NoSuchAgriApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agri application current stage
	 * @throws NoSuchAgriApplicationCurrentStageException if a matching agri application current stage could not be found
	 */
	@Override
	public AgriApplicationCurrentStage findBygetAA_Stage_AAI(
			long agricultureApplicationId)
		throws NoSuchAgriApplicationCurrentStageException {

		AgriApplicationCurrentStage agriApplicationCurrentStage =
			fetchBygetAA_Stage_AAI(agricultureApplicationId);

		if (agriApplicationCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("agricultureApplicationId=");
			sb.append(agricultureApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAgriApplicationCurrentStageException(sb.toString());
		}

		return agriApplicationCurrentStage;
	}

	/**
	 * Returns the agri application current stage where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agri application current stage, or <code>null</code> if a matching agri application current stage could not be found
	 */
	@Override
	public AgriApplicationCurrentStage fetchBygetAA_Stage_AAI(
		long agricultureApplicationId) {

		return fetchBygetAA_Stage_AAI(agricultureApplicationId, true);
	}

	/**
	 * Returns the agri application current stage where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agri application current stage, or <code>null</code> if a matching agri application current stage could not be found
	 */
	@Override
	public AgriApplicationCurrentStage fetchBygetAA_Stage_AAI(
		long agricultureApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {agricultureApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAA_Stage_AAI, finderArgs, this);
		}

		if (result instanceof AgriApplicationCurrentStage) {
			AgriApplicationCurrentStage agriApplicationCurrentStage =
				(AgriApplicationCurrentStage)result;

			if (agricultureApplicationId !=
					agriApplicationCurrentStage.getAgricultureApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_AGRIAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETAA_STAGE_AAI_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				List<AgriApplicationCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAA_Stage_AAI, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									agricultureApplicationId
								};
							}

							_log.warn(
								"AgriApplicationCurrentStagePersistenceImpl.fetchBygetAA_Stage_AAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgriApplicationCurrentStage agriApplicationCurrentStage =
						list.get(0);

					result = agriApplicationCurrentStage;

					cacheResult(agriApplicationCurrentStage);
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
			return (AgriApplicationCurrentStage)result;
		}
	}

	/**
	 * Removes the agri application current stage where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agri application current stage that was removed
	 */
	@Override
	public AgriApplicationCurrentStage removeBygetAA_Stage_AAI(
			long agricultureApplicationId)
		throws NoSuchAgriApplicationCurrentStageException {

		AgriApplicationCurrentStage agriApplicationCurrentStage =
			findBygetAA_Stage_AAI(agricultureApplicationId);

		return remove(agriApplicationCurrentStage);
	}

	/**
	 * Returns the number of agri application current stages where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agri application current stages
	 */
	@Override
	public int countBygetAA_Stage_AAI(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAA_Stage_AAI;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRIAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETAA_STAGE_AAI_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

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
		_FINDER_COLUMN_GETAA_STAGE_AAI_AGRICULTUREAPPLICATIONID_2 =
			"agriApplicationCurrentStage.agricultureApplicationId = ?";

	public AgriApplicationCurrentStagePersistenceImpl() {
		setModelClass(AgriApplicationCurrentStage.class);

		setModelImplClass(AgriApplicationCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(AgriApplicationCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the agri application current stage in the entity cache if it is enabled.
	 *
	 * @param agriApplicationCurrentStage the agri application current stage
	 */
	@Override
	public void cacheResult(
		AgriApplicationCurrentStage agriApplicationCurrentStage) {

		entityCache.putResult(
			AgriApplicationCurrentStageImpl.class,
			agriApplicationCurrentStage.getPrimaryKey(),
			agriApplicationCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetAgricultureById,
			new Object[] {
				agriApplicationCurrentStage.getAgricultureApplicationId()
			},
			agriApplicationCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetAA_Stage_AAI,
			new Object[] {
				agriApplicationCurrentStage.getAgricultureApplicationId()
			},
			agriApplicationCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the agri application current stages in the entity cache if it is enabled.
	 *
	 * @param agriApplicationCurrentStages the agri application current stages
	 */
	@Override
	public void cacheResult(
		List<AgriApplicationCurrentStage> agriApplicationCurrentStages) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (agriApplicationCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AgriApplicationCurrentStage agriApplicationCurrentStage :
				agriApplicationCurrentStages) {

			if (entityCache.getResult(
					AgriApplicationCurrentStageImpl.class,
					agriApplicationCurrentStage.getPrimaryKey()) == null) {

				cacheResult(agriApplicationCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all agri application current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AgriApplicationCurrentStageImpl.class);

		finderCache.clearCache(AgriApplicationCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the agri application current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AgriApplicationCurrentStage agriApplicationCurrentStage) {

		entityCache.removeResult(
			AgriApplicationCurrentStageImpl.class, agriApplicationCurrentStage);
	}

	@Override
	public void clearCache(
		List<AgriApplicationCurrentStage> agriApplicationCurrentStages) {

		for (AgriApplicationCurrentStage agriApplicationCurrentStage :
				agriApplicationCurrentStages) {

			entityCache.removeResult(
				AgriApplicationCurrentStageImpl.class,
				agriApplicationCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AgriApplicationCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AgriApplicationCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AgriApplicationCurrentStageModelImpl
			agriApplicationCurrentStageModelImpl) {

		Object[] args = new Object[] {
			agriApplicationCurrentStageModelImpl.getAgricultureApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetAgricultureById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAgricultureById, args,
			agriApplicationCurrentStageModelImpl);

		args = new Object[] {
			agriApplicationCurrentStageModelImpl.getAgricultureApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetAA_Stage_AAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAA_Stage_AAI, args,
			agriApplicationCurrentStageModelImpl);
	}

	/**
	 * Creates a new agri application current stage with the primary key. Does not add the agri application current stage to the database.
	 *
	 * @param agriApplicationCurrentStageId the primary key for the new agri application current stage
	 * @return the new agri application current stage
	 */
	@Override
	public AgriApplicationCurrentStage create(
		long agriApplicationCurrentStageId) {

		AgriApplicationCurrentStage agriApplicationCurrentStage =
			new AgriApplicationCurrentStageImpl();

		agriApplicationCurrentStage.setNew(true);
		agriApplicationCurrentStage.setPrimaryKey(
			agriApplicationCurrentStageId);

		agriApplicationCurrentStage.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return agriApplicationCurrentStage;
	}

	/**
	 * Removes the agri application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agriApplicationCurrentStageId the primary key of the agri application current stage
	 * @return the agri application current stage that was removed
	 * @throws NoSuchAgriApplicationCurrentStageException if a agri application current stage with the primary key could not be found
	 */
	@Override
	public AgriApplicationCurrentStage remove(
			long agriApplicationCurrentStageId)
		throws NoSuchAgriApplicationCurrentStageException {

		return remove((Serializable)agriApplicationCurrentStageId);
	}

	/**
	 * Removes the agri application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the agri application current stage
	 * @return the agri application current stage that was removed
	 * @throws NoSuchAgriApplicationCurrentStageException if a agri application current stage with the primary key could not be found
	 */
	@Override
	public AgriApplicationCurrentStage remove(Serializable primaryKey)
		throws NoSuchAgriApplicationCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			AgriApplicationCurrentStage agriApplicationCurrentStage =
				(AgriApplicationCurrentStage)session.get(
					AgriApplicationCurrentStageImpl.class, primaryKey);

			if (agriApplicationCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAgriApplicationCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(agriApplicationCurrentStage);
		}
		catch (NoSuchAgriApplicationCurrentStageException
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
	protected AgriApplicationCurrentStage removeImpl(
		AgriApplicationCurrentStage agriApplicationCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(agriApplicationCurrentStage)) {
				agriApplicationCurrentStage =
					(AgriApplicationCurrentStage)session.get(
						AgriApplicationCurrentStageImpl.class,
						agriApplicationCurrentStage.getPrimaryKeyObj());
			}

			if (agriApplicationCurrentStage != null) {
				session.delete(agriApplicationCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (agriApplicationCurrentStage != null) {
			clearCache(agriApplicationCurrentStage);
		}

		return agriApplicationCurrentStage;
	}

	@Override
	public AgriApplicationCurrentStage updateImpl(
		AgriApplicationCurrentStage agriApplicationCurrentStage) {

		boolean isNew = agriApplicationCurrentStage.isNew();

		if (!(agriApplicationCurrentStage instanceof
				AgriApplicationCurrentStageModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					agriApplicationCurrentStage.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					agriApplicationCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in agriApplicationCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AgriApplicationCurrentStage implementation " +
					agriApplicationCurrentStage.getClass());
		}

		AgriApplicationCurrentStageModelImpl
			agriApplicationCurrentStageModelImpl =
				(AgriApplicationCurrentStageModelImpl)
					agriApplicationCurrentStage;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (agriApplicationCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				agriApplicationCurrentStage.setCreateDate(date);
			}
			else {
				agriApplicationCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!agriApplicationCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				agriApplicationCurrentStage.setModifiedDate(date);
			}
			else {
				agriApplicationCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(agriApplicationCurrentStage);
			}
			else {
				agriApplicationCurrentStage =
					(AgriApplicationCurrentStage)session.merge(
						agriApplicationCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AgriApplicationCurrentStageImpl.class,
			agriApplicationCurrentStageModelImpl, false, true);

		cacheUniqueFindersCache(agriApplicationCurrentStageModelImpl);

		if (isNew) {
			agriApplicationCurrentStage.setNew(false);
		}

		agriApplicationCurrentStage.resetOriginalValues();

		return agriApplicationCurrentStage;
	}

	/**
	 * Returns the agri application current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the agri application current stage
	 * @return the agri application current stage
	 * @throws NoSuchAgriApplicationCurrentStageException if a agri application current stage with the primary key could not be found
	 */
	@Override
	public AgriApplicationCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAgriApplicationCurrentStageException {

		AgriApplicationCurrentStage agriApplicationCurrentStage =
			fetchByPrimaryKey(primaryKey);

		if (agriApplicationCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAgriApplicationCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return agriApplicationCurrentStage;
	}

	/**
	 * Returns the agri application current stage with the primary key or throws a <code>NoSuchAgriApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param agriApplicationCurrentStageId the primary key of the agri application current stage
	 * @return the agri application current stage
	 * @throws NoSuchAgriApplicationCurrentStageException if a agri application current stage with the primary key could not be found
	 */
	@Override
	public AgriApplicationCurrentStage findByPrimaryKey(
			long agriApplicationCurrentStageId)
		throws NoSuchAgriApplicationCurrentStageException {

		return findByPrimaryKey((Serializable)agriApplicationCurrentStageId);
	}

	/**
	 * Returns the agri application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agriApplicationCurrentStageId the primary key of the agri application current stage
	 * @return the agri application current stage, or <code>null</code> if a agri application current stage with the primary key could not be found
	 */
	@Override
	public AgriApplicationCurrentStage fetchByPrimaryKey(
		long agriApplicationCurrentStageId) {

		return fetchByPrimaryKey((Serializable)agriApplicationCurrentStageId);
	}

	/**
	 * Returns all the agri application current stages.
	 *
	 * @return the agri application current stages
	 */
	@Override
	public List<AgriApplicationCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agri application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agri application current stages
	 * @param end the upper bound of the range of agri application current stages (not inclusive)
	 * @return the range of agri application current stages
	 */
	@Override
	public List<AgriApplicationCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the agri application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agri application current stages
	 * @param end the upper bound of the range of agri application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agri application current stages
	 */
	@Override
	public List<AgriApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<AgriApplicationCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agri application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agri application current stages
	 * @param end the upper bound of the range of agri application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agri application current stages
	 */
	@Override
	public List<AgriApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<AgriApplicationCurrentStage> orderByComparator,
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

		List<AgriApplicationCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<AgriApplicationCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_AGRIAPPLICATIONCURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_AGRIAPPLICATIONCURRENTSTAGE;

				sql = sql.concat(
					AgriApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AgriApplicationCurrentStage>)QueryUtil.list(
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
	 * Removes all the agri application current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AgriApplicationCurrentStage agriApplicationCurrentStage :
				findAll()) {

			remove(agriApplicationCurrentStage);
		}
	}

	/**
	 * Returns the number of agri application current stages.
	 *
	 * @return the number of agri application current stages
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
					_SQL_COUNT_AGRIAPPLICATIONCURRENTSTAGE);

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
		return "agriApplicationCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_AGRIAPPLICATIONCURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AgriApplicationCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the agri application current stage persistence.
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

		_finderPathFetchBygetAgricultureById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAgricultureById",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathCountBygetAgricultureById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAgricultureById", new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, false);

		_finderPathFetchBygetAA_Stage_AAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAA_Stage_AAI",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathCountBygetAA_Stage_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetAA_Stage_AAI",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, false);

		AgriApplicationCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AgriApplicationCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(
			AgriApplicationCurrentStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = AGRICULTUREPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = AGRICULTUREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = AGRICULTUREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_AGRIAPPLICATIONCURRENTSTAGE =
		"SELECT agriApplicationCurrentStage FROM AgriApplicationCurrentStage agriApplicationCurrentStage";

	private static final String _SQL_SELECT_AGRIAPPLICATIONCURRENTSTAGE_WHERE =
		"SELECT agriApplicationCurrentStage FROM AgriApplicationCurrentStage agriApplicationCurrentStage WHERE ";

	private static final String _SQL_COUNT_AGRIAPPLICATIONCURRENTSTAGE =
		"SELECT COUNT(agriApplicationCurrentStage) FROM AgriApplicationCurrentStage agriApplicationCurrentStage";

	private static final String _SQL_COUNT_AGRIAPPLICATIONCURRENTSTAGE_WHERE =
		"SELECT COUNT(agriApplicationCurrentStage) FROM AgriApplicationCurrentStage agriApplicationCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"agriApplicationCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AgriApplicationCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AgriApplicationCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AgriApplicationCurrentStagePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}