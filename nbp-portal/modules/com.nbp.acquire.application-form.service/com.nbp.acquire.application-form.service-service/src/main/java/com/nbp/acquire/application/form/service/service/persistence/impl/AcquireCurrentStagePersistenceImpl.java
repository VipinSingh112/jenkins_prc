/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence.impl;

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

import com.nbp.acquire.application.form.service.exception.NoSuchAcquireCurrentStageException;
import com.nbp.acquire.application.form.service.model.AcquireCurrentStage;
import com.nbp.acquire.application.form.service.model.AcquireCurrentStageTable;
import com.nbp.acquire.application.form.service.model.impl.AcquireCurrentStageImpl;
import com.nbp.acquire.application.form.service.model.impl.AcquireCurrentStageModelImpl;
import com.nbp.acquire.application.form.service.service.persistence.AcquireCurrentStagePersistence;
import com.nbp.acquire.application.form.service.service.persistence.AcquireCurrentStageUtil;
import com.nbp.acquire.application.form.service.service.persistence.impl.constants.ACQUIREPersistenceConstants;

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
 * The persistence implementation for the acquire current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AcquireCurrentStagePersistence.class)
public class AcquireCurrentStagePersistenceImpl
	extends BasePersistenceImpl<AcquireCurrentStage>
	implements AcquireCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AcquireCurrentStageUtil</code> to access the acquire current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AcquireCurrentStageImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetAcquireById;
	private FinderPath _finderPathCountBygetAcquireById;

	/**
	 * Returns the acquire current stage where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireCurrentStageException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire current stage
	 * @throws NoSuchAcquireCurrentStageException if a matching acquire current stage could not be found
	 */
	@Override
	public AcquireCurrentStage findBygetAcquireById(long acquireApplicationId)
		throws NoSuchAcquireCurrentStageException {

		AcquireCurrentStage acquireCurrentStage = fetchBygetAcquireById(
			acquireApplicationId);

		if (acquireCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("acquireApplicationId=");
			sb.append(acquireApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireCurrentStageException(sb.toString());
		}

		return acquireCurrentStage;
	}

	/**
	 * Returns the acquire current stage where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire current stage, or <code>null</code> if a matching acquire current stage could not be found
	 */
	@Override
	public AcquireCurrentStage fetchBygetAcquireById(
		long acquireApplicationId) {

		return fetchBygetAcquireById(acquireApplicationId, true);
	}

	/**
	 * Returns the acquire current stage where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire current stage, or <code>null</code> if a matching acquire current stage could not be found
	 */
	@Override
	public AcquireCurrentStage fetchBygetAcquireById(
		long acquireApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {acquireApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAcquireById, finderArgs, this);
		}

		if (result instanceof AcquireCurrentStage) {
			AcquireCurrentStage acquireCurrentStage =
				(AcquireCurrentStage)result;

			if (acquireApplicationId !=
					acquireCurrentStage.getAcquireApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACQUIRECURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETACQUIREBYID_ACQUIREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(acquireApplicationId);

				List<AcquireCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAcquireById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									acquireApplicationId
								};
							}

							_log.warn(
								"AcquireCurrentStagePersistenceImpl.fetchBygetAcquireById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireCurrentStage acquireCurrentStage = list.get(0);

					result = acquireCurrentStage;

					cacheResult(acquireCurrentStage);
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
			return (AcquireCurrentStage)result;
		}
	}

	/**
	 * Removes the acquire current stage where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire current stage that was removed
	 */
	@Override
	public AcquireCurrentStage removeBygetAcquireById(long acquireApplicationId)
		throws NoSuchAcquireCurrentStageException {

		AcquireCurrentStage acquireCurrentStage = findBygetAcquireById(
			acquireApplicationId);

		return remove(acquireCurrentStage);
	}

	/**
	 * Returns the number of acquire current stages where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire current stages
	 */
	@Override
	public int countBygetAcquireById(long acquireApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAcquireById;

		Object[] finderArgs = new Object[] {acquireApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIRECURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETACQUIREBYID_ACQUIREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(acquireApplicationId);

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
		_FINDER_COLUMN_GETACQUIREBYID_ACQUIREAPPLICATIONID_2 =
			"acquireCurrentStage.acquireApplicationId = ?";

	public AcquireCurrentStagePersistenceImpl() {
		setModelClass(AcquireCurrentStage.class);

		setModelImplClass(AcquireCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(AcquireCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the acquire current stage in the entity cache if it is enabled.
	 *
	 * @param acquireCurrentStage the acquire current stage
	 */
	@Override
	public void cacheResult(AcquireCurrentStage acquireCurrentStage) {
		entityCache.putResult(
			AcquireCurrentStageImpl.class, acquireCurrentStage.getPrimaryKey(),
			acquireCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetAcquireById,
			new Object[] {acquireCurrentStage.getAcquireApplicationId()},
			acquireCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acquire current stages in the entity cache if it is enabled.
	 *
	 * @param acquireCurrentStages the acquire current stages
	 */
	@Override
	public void cacheResult(List<AcquireCurrentStage> acquireCurrentStages) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (acquireCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AcquireCurrentStage acquireCurrentStage : acquireCurrentStages) {
			if (entityCache.getResult(
					AcquireCurrentStageImpl.class,
					acquireCurrentStage.getPrimaryKey()) == null) {

				cacheResult(acquireCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all acquire current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AcquireCurrentStageImpl.class);

		finderCache.clearCache(AcquireCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the acquire current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AcquireCurrentStage acquireCurrentStage) {
		entityCache.removeResult(
			AcquireCurrentStageImpl.class, acquireCurrentStage);
	}

	@Override
	public void clearCache(List<AcquireCurrentStage> acquireCurrentStages) {
		for (AcquireCurrentStage acquireCurrentStage : acquireCurrentStages) {
			entityCache.removeResult(
				AcquireCurrentStageImpl.class, acquireCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AcquireCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AcquireCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AcquireCurrentStageModelImpl acquireCurrentStageModelImpl) {

		Object[] args = new Object[] {
			acquireCurrentStageModelImpl.getAcquireApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetAcquireById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquireById, args,
			acquireCurrentStageModelImpl);
	}

	/**
	 * Creates a new acquire current stage with the primary key. Does not add the acquire current stage to the database.
	 *
	 * @param acquireCurrentStageId the primary key for the new acquire current stage
	 * @return the new acquire current stage
	 */
	@Override
	public AcquireCurrentStage create(long acquireCurrentStageId) {
		AcquireCurrentStage acquireCurrentStage = new AcquireCurrentStageImpl();

		acquireCurrentStage.setNew(true);
		acquireCurrentStage.setPrimaryKey(acquireCurrentStageId);

		acquireCurrentStage.setCompanyId(CompanyThreadLocal.getCompanyId());

		return acquireCurrentStage;
	}

	/**
	 * Removes the acquire current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireCurrentStageId the primary key of the acquire current stage
	 * @return the acquire current stage that was removed
	 * @throws NoSuchAcquireCurrentStageException if a acquire current stage with the primary key could not be found
	 */
	@Override
	public AcquireCurrentStage remove(long acquireCurrentStageId)
		throws NoSuchAcquireCurrentStageException {

		return remove((Serializable)acquireCurrentStageId);
	}

	/**
	 * Removes the acquire current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acquire current stage
	 * @return the acquire current stage that was removed
	 * @throws NoSuchAcquireCurrentStageException if a acquire current stage with the primary key could not be found
	 */
	@Override
	public AcquireCurrentStage remove(Serializable primaryKey)
		throws NoSuchAcquireCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			AcquireCurrentStage acquireCurrentStage =
				(AcquireCurrentStage)session.get(
					AcquireCurrentStageImpl.class, primaryKey);

			if (acquireCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAcquireCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(acquireCurrentStage);
		}
		catch (NoSuchAcquireCurrentStageException noSuchEntityException) {
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
	protected AcquireCurrentStage removeImpl(
		AcquireCurrentStage acquireCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acquireCurrentStage)) {
				acquireCurrentStage = (AcquireCurrentStage)session.get(
					AcquireCurrentStageImpl.class,
					acquireCurrentStage.getPrimaryKeyObj());
			}

			if (acquireCurrentStage != null) {
				session.delete(acquireCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (acquireCurrentStage != null) {
			clearCache(acquireCurrentStage);
		}

		return acquireCurrentStage;
	}

	@Override
	public AcquireCurrentStage updateImpl(
		AcquireCurrentStage acquireCurrentStage) {

		boolean isNew = acquireCurrentStage.isNew();

		if (!(acquireCurrentStage instanceof AcquireCurrentStageModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(acquireCurrentStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					acquireCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in acquireCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AcquireCurrentStage implementation " +
					acquireCurrentStage.getClass());
		}

		AcquireCurrentStageModelImpl acquireCurrentStageModelImpl =
			(AcquireCurrentStageModelImpl)acquireCurrentStage;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (acquireCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				acquireCurrentStage.setCreateDate(date);
			}
			else {
				acquireCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!acquireCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				acquireCurrentStage.setModifiedDate(date);
			}
			else {
				acquireCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(acquireCurrentStage);
			}
			else {
				acquireCurrentStage = (AcquireCurrentStage)session.merge(
					acquireCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AcquireCurrentStageImpl.class, acquireCurrentStageModelImpl, false,
			true);

		cacheUniqueFindersCache(acquireCurrentStageModelImpl);

		if (isNew) {
			acquireCurrentStage.setNew(false);
		}

		acquireCurrentStage.resetOriginalValues();

		return acquireCurrentStage;
	}

	/**
	 * Returns the acquire current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acquire current stage
	 * @return the acquire current stage
	 * @throws NoSuchAcquireCurrentStageException if a acquire current stage with the primary key could not be found
	 */
	@Override
	public AcquireCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAcquireCurrentStageException {

		AcquireCurrentStage acquireCurrentStage = fetchByPrimaryKey(primaryKey);

		if (acquireCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAcquireCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return acquireCurrentStage;
	}

	/**
	 * Returns the acquire current stage with the primary key or throws a <code>NoSuchAcquireCurrentStageException</code> if it could not be found.
	 *
	 * @param acquireCurrentStageId the primary key of the acquire current stage
	 * @return the acquire current stage
	 * @throws NoSuchAcquireCurrentStageException if a acquire current stage with the primary key could not be found
	 */
	@Override
	public AcquireCurrentStage findByPrimaryKey(long acquireCurrentStageId)
		throws NoSuchAcquireCurrentStageException {

		return findByPrimaryKey((Serializable)acquireCurrentStageId);
	}

	/**
	 * Returns the acquire current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireCurrentStageId the primary key of the acquire current stage
	 * @return the acquire current stage, or <code>null</code> if a acquire current stage with the primary key could not be found
	 */
	@Override
	public AcquireCurrentStage fetchByPrimaryKey(long acquireCurrentStageId) {
		return fetchByPrimaryKey((Serializable)acquireCurrentStageId);
	}

	/**
	 * Returns all the acquire current stages.
	 *
	 * @return the acquire current stages
	 */
	@Override
	public List<AcquireCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire current stages
	 * @param end the upper bound of the range of acquire current stages (not inclusive)
	 * @return the range of acquire current stages
	 */
	@Override
	public List<AcquireCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire current stages
	 * @param end the upper bound of the range of acquire current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire current stages
	 */
	@Override
	public List<AcquireCurrentStage> findAll(
		int start, int end,
		OrderByComparator<AcquireCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire current stages
	 * @param end the upper bound of the range of acquire current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire current stages
	 */
	@Override
	public List<AcquireCurrentStage> findAll(
		int start, int end,
		OrderByComparator<AcquireCurrentStage> orderByComparator,
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

		List<AcquireCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<AcquireCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACQUIRECURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACQUIRECURRENTSTAGE;

				sql = sql.concat(AcquireCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AcquireCurrentStage>)QueryUtil.list(
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
	 * Removes all the acquire current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AcquireCurrentStage acquireCurrentStage : findAll()) {
			remove(acquireCurrentStage);
		}
	}

	/**
	 * Returns the number of acquire current stages.
	 *
	 * @return the number of acquire current stages
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
					_SQL_COUNT_ACQUIRECURRENTSTAGE);

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
		return "acquireCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACQUIRECURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AcquireCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acquire current stage persistence.
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

		_finderPathFetchBygetAcquireById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAcquireById",
			new String[] {Long.class.getName()},
			new String[] {"acquireApplicationId"}, true);

		_finderPathCountBygetAcquireById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetAcquireById",
			new String[] {Long.class.getName()},
			new String[] {"acquireApplicationId"}, false);

		AcquireCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AcquireCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(AcquireCurrentStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = ACQUIREPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ACQUIRECURRENTSTAGE =
		"SELECT acquireCurrentStage FROM AcquireCurrentStage acquireCurrentStage";

	private static final String _SQL_SELECT_ACQUIRECURRENTSTAGE_WHERE =
		"SELECT acquireCurrentStage FROM AcquireCurrentStage acquireCurrentStage WHERE ";

	private static final String _SQL_COUNT_ACQUIRECURRENTSTAGE =
		"SELECT COUNT(acquireCurrentStage) FROM AcquireCurrentStage acquireCurrentStage";

	private static final String _SQL_COUNT_ACQUIRECURRENTSTAGE_WHERE =
		"SELECT COUNT(acquireCurrentStage) FROM AcquireCurrentStage acquireCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "acquireCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AcquireCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AcquireCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AcquireCurrentStagePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}