/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence.impl;

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

import com.nbp.pharmaceutical.application.form.service.exception.NoSuchPharmaCurrentStageException;
import com.nbp.pharmaceutical.application.form.service.model.PharmaCurrentStage;
import com.nbp.pharmaceutical.application.form.service.model.PharmaCurrentStageTable;
import com.nbp.pharmaceutical.application.form.service.model.impl.PharmaCurrentStageImpl;
import com.nbp.pharmaceutical.application.form.service.model.impl.PharmaCurrentStageModelImpl;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaCurrentStagePersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaCurrentStageUtil;
import com.nbp.pharmaceutical.application.form.service.service.persistence.impl.constants.PHARMACEUTICALPersistenceConstants;

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
 * The persistence implementation for the pharma current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PharmaCurrentStagePersistence.class)
public class PharmaCurrentStagePersistenceImpl
	extends BasePersistenceImpl<PharmaCurrentStage>
	implements PharmaCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PharmaCurrentStageUtil</code> to access the pharma current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PharmaCurrentStageImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetpharmaById;
	private FinderPath _finderPathCountBygetpharmaById;

	/**
	 * Returns the pharma current stage where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaCurrentStageException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma current stage
	 * @throws NoSuchPharmaCurrentStageException if a matching pharma current stage could not be found
	 */
	@Override
	public PharmaCurrentStage findBygetpharmaById(long pharmaApplicationId)
		throws NoSuchPharmaCurrentStageException {

		PharmaCurrentStage pharmaCurrentStage = fetchBygetpharmaById(
			pharmaApplicationId);

		if (pharmaCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("pharmaApplicationId=");
			sb.append(pharmaApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPharmaCurrentStageException(sb.toString());
		}

		return pharmaCurrentStage;
	}

	/**
	 * Returns the pharma current stage where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma current stage, or <code>null</code> if a matching pharma current stage could not be found
	 */
	@Override
	public PharmaCurrentStage fetchBygetpharmaById(long pharmaApplicationId) {
		return fetchBygetpharmaById(pharmaApplicationId, true);
	}

	/**
	 * Returns the pharma current stage where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma current stage, or <code>null</code> if a matching pharma current stage could not be found
	 */
	@Override
	public PharmaCurrentStage fetchBygetpharmaById(
		long pharmaApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {pharmaApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetpharmaById, finderArgs, this);
		}

		if (result instanceof PharmaCurrentStage) {
			PharmaCurrentStage pharmaCurrentStage = (PharmaCurrentStage)result;

			if (pharmaApplicationId !=
					pharmaCurrentStage.getPharmaApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PHARMACURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETPHARMABYID_PHARMAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

				List<PharmaCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetpharmaById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {pharmaApplicationId};
							}

							_log.warn(
								"PharmaCurrentStagePersistenceImpl.fetchBygetpharmaById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PharmaCurrentStage pharmaCurrentStage = list.get(0);

					result = pharmaCurrentStage;

					cacheResult(pharmaCurrentStage);
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
			return (PharmaCurrentStage)result;
		}
	}

	/**
	 * Removes the pharma current stage where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma current stage that was removed
	 */
	@Override
	public PharmaCurrentStage removeBygetpharmaById(long pharmaApplicationId)
		throws NoSuchPharmaCurrentStageException {

		PharmaCurrentStage pharmaCurrentStage = findBygetpharmaById(
			pharmaApplicationId);

		return remove(pharmaCurrentStage);
	}

	/**
	 * Returns the number of pharma current stages where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma current stages
	 */
	@Override
	public int countBygetpharmaById(long pharmaApplicationId) {
		FinderPath finderPath = _finderPathCountBygetpharmaById;

		Object[] finderArgs = new Object[] {pharmaApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMACURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETPHARMABYID_PHARMAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

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
		_FINDER_COLUMN_GETPHARMABYID_PHARMAAPPLICATIONID_2 =
			"pharmaCurrentStage.pharmaApplicationId = ?";

	private FinderPath _finderPathFetchBygetPA_CS_PAI;
	private FinderPath _finderPathCountBygetPA_CS_PAI;

	/**
	 * Returns the pharma current stage where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaCurrentStageException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma current stage
	 * @throws NoSuchPharmaCurrentStageException if a matching pharma current stage could not be found
	 */
	@Override
	public PharmaCurrentStage findBygetPA_CS_PAI(long pharmaApplicationId)
		throws NoSuchPharmaCurrentStageException {

		PharmaCurrentStage pharmaCurrentStage = fetchBygetPA_CS_PAI(
			pharmaApplicationId);

		if (pharmaCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("pharmaApplicationId=");
			sb.append(pharmaApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPharmaCurrentStageException(sb.toString());
		}

		return pharmaCurrentStage;
	}

	/**
	 * Returns the pharma current stage where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma current stage, or <code>null</code> if a matching pharma current stage could not be found
	 */
	@Override
	public PharmaCurrentStage fetchBygetPA_CS_PAI(long pharmaApplicationId) {
		return fetchBygetPA_CS_PAI(pharmaApplicationId, true);
	}

	/**
	 * Returns the pharma current stage where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma current stage, or <code>null</code> if a matching pharma current stage could not be found
	 */
	@Override
	public PharmaCurrentStage fetchBygetPA_CS_PAI(
		long pharmaApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {pharmaApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetPA_CS_PAI, finderArgs, this);
		}

		if (result instanceof PharmaCurrentStage) {
			PharmaCurrentStage pharmaCurrentStage = (PharmaCurrentStage)result;

			if (pharmaApplicationId !=
					pharmaCurrentStage.getPharmaApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PHARMACURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETPA_CS_PAI_PHARMAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

				List<PharmaCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetPA_CS_PAI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {pharmaApplicationId};
							}

							_log.warn(
								"PharmaCurrentStagePersistenceImpl.fetchBygetPA_CS_PAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PharmaCurrentStage pharmaCurrentStage = list.get(0);

					result = pharmaCurrentStage;

					cacheResult(pharmaCurrentStage);
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
			return (PharmaCurrentStage)result;
		}
	}

	/**
	 * Removes the pharma current stage where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma current stage that was removed
	 */
	@Override
	public PharmaCurrentStage removeBygetPA_CS_PAI(long pharmaApplicationId)
		throws NoSuchPharmaCurrentStageException {

		PharmaCurrentStage pharmaCurrentStage = findBygetPA_CS_PAI(
			pharmaApplicationId);

		return remove(pharmaCurrentStage);
	}

	/**
	 * Returns the number of pharma current stages where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma current stages
	 */
	@Override
	public int countBygetPA_CS_PAI(long pharmaApplicationId) {
		FinderPath finderPath = _finderPathCountBygetPA_CS_PAI;

		Object[] finderArgs = new Object[] {pharmaApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMACURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETPA_CS_PAI_PHARMAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

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
		_FINDER_COLUMN_GETPA_CS_PAI_PHARMAAPPLICATIONID_2 =
			"pharmaCurrentStage.pharmaApplicationId = ?";

	public PharmaCurrentStagePersistenceImpl() {
		setModelClass(PharmaCurrentStage.class);

		setModelImplClass(PharmaCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(PharmaCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the pharma current stage in the entity cache if it is enabled.
	 *
	 * @param pharmaCurrentStage the pharma current stage
	 */
	@Override
	public void cacheResult(PharmaCurrentStage pharmaCurrentStage) {
		entityCache.putResult(
			PharmaCurrentStageImpl.class, pharmaCurrentStage.getPrimaryKey(),
			pharmaCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetpharmaById,
			new Object[] {pharmaCurrentStage.getPharmaApplicationId()},
			pharmaCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetPA_CS_PAI,
			new Object[] {pharmaCurrentStage.getPharmaApplicationId()},
			pharmaCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the pharma current stages in the entity cache if it is enabled.
	 *
	 * @param pharmaCurrentStages the pharma current stages
	 */
	@Override
	public void cacheResult(List<PharmaCurrentStage> pharmaCurrentStages) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (pharmaCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PharmaCurrentStage pharmaCurrentStage : pharmaCurrentStages) {
			if (entityCache.getResult(
					PharmaCurrentStageImpl.class,
					pharmaCurrentStage.getPrimaryKey()) == null) {

				cacheResult(pharmaCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all pharma current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PharmaCurrentStageImpl.class);

		finderCache.clearCache(PharmaCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the pharma current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PharmaCurrentStage pharmaCurrentStage) {
		entityCache.removeResult(
			PharmaCurrentStageImpl.class, pharmaCurrentStage);
	}

	@Override
	public void clearCache(List<PharmaCurrentStage> pharmaCurrentStages) {
		for (PharmaCurrentStage pharmaCurrentStage : pharmaCurrentStages) {
			entityCache.removeResult(
				PharmaCurrentStageImpl.class, pharmaCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PharmaCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(PharmaCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		PharmaCurrentStageModelImpl pharmaCurrentStageModelImpl) {

		Object[] args = new Object[] {
			pharmaCurrentStageModelImpl.getPharmaApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetpharmaById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetpharmaById, args, pharmaCurrentStageModelImpl);

		args = new Object[] {
			pharmaCurrentStageModelImpl.getPharmaApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetPA_CS_PAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetPA_CS_PAI, args, pharmaCurrentStageModelImpl);
	}

	/**
	 * Creates a new pharma current stage with the primary key. Does not add the pharma current stage to the database.
	 *
	 * @param pharmaCurrentStageId the primary key for the new pharma current stage
	 * @return the new pharma current stage
	 */
	@Override
	public PharmaCurrentStage create(long pharmaCurrentStageId) {
		PharmaCurrentStage pharmaCurrentStage = new PharmaCurrentStageImpl();

		pharmaCurrentStage.setNew(true);
		pharmaCurrentStage.setPrimaryKey(pharmaCurrentStageId);

		pharmaCurrentStage.setCompanyId(CompanyThreadLocal.getCompanyId());

		return pharmaCurrentStage;
	}

	/**
	 * Removes the pharma current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaCurrentStageId the primary key of the pharma current stage
	 * @return the pharma current stage that was removed
	 * @throws NoSuchPharmaCurrentStageException if a pharma current stage with the primary key could not be found
	 */
	@Override
	public PharmaCurrentStage remove(long pharmaCurrentStageId)
		throws NoSuchPharmaCurrentStageException {

		return remove((Serializable)pharmaCurrentStageId);
	}

	/**
	 * Removes the pharma current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pharma current stage
	 * @return the pharma current stage that was removed
	 * @throws NoSuchPharmaCurrentStageException if a pharma current stage with the primary key could not be found
	 */
	@Override
	public PharmaCurrentStage remove(Serializable primaryKey)
		throws NoSuchPharmaCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			PharmaCurrentStage pharmaCurrentStage =
				(PharmaCurrentStage)session.get(
					PharmaCurrentStageImpl.class, primaryKey);

			if (pharmaCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPharmaCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(pharmaCurrentStage);
		}
		catch (NoSuchPharmaCurrentStageException noSuchEntityException) {
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
	protected PharmaCurrentStage removeImpl(
		PharmaCurrentStage pharmaCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pharmaCurrentStage)) {
				pharmaCurrentStage = (PharmaCurrentStage)session.get(
					PharmaCurrentStageImpl.class,
					pharmaCurrentStage.getPrimaryKeyObj());
			}

			if (pharmaCurrentStage != null) {
				session.delete(pharmaCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (pharmaCurrentStage != null) {
			clearCache(pharmaCurrentStage);
		}

		return pharmaCurrentStage;
	}

	@Override
	public PharmaCurrentStage updateImpl(
		PharmaCurrentStage pharmaCurrentStage) {

		boolean isNew = pharmaCurrentStage.isNew();

		if (!(pharmaCurrentStage instanceof PharmaCurrentStageModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(pharmaCurrentStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					pharmaCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in pharmaCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PharmaCurrentStage implementation " +
					pharmaCurrentStage.getClass());
		}

		PharmaCurrentStageModelImpl pharmaCurrentStageModelImpl =
			(PharmaCurrentStageModelImpl)pharmaCurrentStage;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (pharmaCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				pharmaCurrentStage.setCreateDate(date);
			}
			else {
				pharmaCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!pharmaCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				pharmaCurrentStage.setModifiedDate(date);
			}
			else {
				pharmaCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(pharmaCurrentStage);
			}
			else {
				pharmaCurrentStage = (PharmaCurrentStage)session.merge(
					pharmaCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PharmaCurrentStageImpl.class, pharmaCurrentStageModelImpl, false,
			true);

		cacheUniqueFindersCache(pharmaCurrentStageModelImpl);

		if (isNew) {
			pharmaCurrentStage.setNew(false);
		}

		pharmaCurrentStage.resetOriginalValues();

		return pharmaCurrentStage;
	}

	/**
	 * Returns the pharma current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pharma current stage
	 * @return the pharma current stage
	 * @throws NoSuchPharmaCurrentStageException if a pharma current stage with the primary key could not be found
	 */
	@Override
	public PharmaCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPharmaCurrentStageException {

		PharmaCurrentStage pharmaCurrentStage = fetchByPrimaryKey(primaryKey);

		if (pharmaCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPharmaCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return pharmaCurrentStage;
	}

	/**
	 * Returns the pharma current stage with the primary key or throws a <code>NoSuchPharmaCurrentStageException</code> if it could not be found.
	 *
	 * @param pharmaCurrentStageId the primary key of the pharma current stage
	 * @return the pharma current stage
	 * @throws NoSuchPharmaCurrentStageException if a pharma current stage with the primary key could not be found
	 */
	@Override
	public PharmaCurrentStage findByPrimaryKey(long pharmaCurrentStageId)
		throws NoSuchPharmaCurrentStageException {

		return findByPrimaryKey((Serializable)pharmaCurrentStageId);
	}

	/**
	 * Returns the pharma current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaCurrentStageId the primary key of the pharma current stage
	 * @return the pharma current stage, or <code>null</code> if a pharma current stage with the primary key could not be found
	 */
	@Override
	public PharmaCurrentStage fetchByPrimaryKey(long pharmaCurrentStageId) {
		return fetchByPrimaryKey((Serializable)pharmaCurrentStageId);
	}

	/**
	 * Returns all the pharma current stages.
	 *
	 * @return the pharma current stages
	 */
	@Override
	public List<PharmaCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma current stages
	 * @param end the upper bound of the range of pharma current stages (not inclusive)
	 * @return the range of pharma current stages
	 */
	@Override
	public List<PharmaCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma current stages
	 * @param end the upper bound of the range of pharma current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma current stages
	 */
	@Override
	public List<PharmaCurrentStage> findAll(
		int start, int end,
		OrderByComparator<PharmaCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma current stages
	 * @param end the upper bound of the range of pharma current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma current stages
	 */
	@Override
	public List<PharmaCurrentStage> findAll(
		int start, int end,
		OrderByComparator<PharmaCurrentStage> orderByComparator,
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

		List<PharmaCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<PharmaCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PHARMACURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PHARMACURRENTSTAGE;

				sql = sql.concat(PharmaCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PharmaCurrentStage>)QueryUtil.list(
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
	 * Removes all the pharma current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PharmaCurrentStage pharmaCurrentStage : findAll()) {
			remove(pharmaCurrentStage);
		}
	}

	/**
	 * Returns the number of pharma current stages.
	 *
	 * @return the number of pharma current stages
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
					_SQL_COUNT_PHARMACURRENTSTAGE);

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
		return "pharmaCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PHARMACURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PharmaCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the pharma current stage persistence.
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

		_finderPathFetchBygetpharmaById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetpharmaById",
			new String[] {Long.class.getName()},
			new String[] {"pharmaApplicationId"}, true);

		_finderPathCountBygetpharmaById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetpharmaById",
			new String[] {Long.class.getName()},
			new String[] {"pharmaApplicationId"}, false);

		_finderPathFetchBygetPA_CS_PAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetPA_CS_PAI",
			new String[] {Long.class.getName()},
			new String[] {"pharmaApplicationId"}, true);

		_finderPathCountBygetPA_CS_PAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetPA_CS_PAI",
			new String[] {Long.class.getName()},
			new String[] {"pharmaApplicationId"}, false);

		PharmaCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		PharmaCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(PharmaCurrentStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = PHARMACEUTICALPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = PHARMACEUTICALPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = PHARMACEUTICALPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PHARMACURRENTSTAGE =
		"SELECT pharmaCurrentStage FROM PharmaCurrentStage pharmaCurrentStage";

	private static final String _SQL_SELECT_PHARMACURRENTSTAGE_WHERE =
		"SELECT pharmaCurrentStage FROM PharmaCurrentStage pharmaCurrentStage WHERE ";

	private static final String _SQL_COUNT_PHARMACURRENTSTAGE =
		"SELECT COUNT(pharmaCurrentStage) FROM PharmaCurrentStage pharmaCurrentStage";

	private static final String _SQL_COUNT_PHARMACURRENTSTAGE_WHERE =
		"SELECT COUNT(pharmaCurrentStage) FROM PharmaCurrentStage pharmaCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "pharmaCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PharmaCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PharmaCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PharmaCurrentStagePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}