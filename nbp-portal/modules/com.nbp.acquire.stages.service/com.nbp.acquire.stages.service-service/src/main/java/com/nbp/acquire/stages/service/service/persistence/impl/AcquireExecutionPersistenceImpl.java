/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence.impl;

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

import com.nbp.acquire.stages.service.exception.NoSuchAcquireExecutionException;
import com.nbp.acquire.stages.service.model.AcquireExecution;
import com.nbp.acquire.stages.service.model.AcquireExecutionTable;
import com.nbp.acquire.stages.service.model.impl.AcquireExecutionImpl;
import com.nbp.acquire.stages.service.model.impl.AcquireExecutionModelImpl;
import com.nbp.acquire.stages.service.service.persistence.AcquireExecutionPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireExecutionUtil;
import com.nbp.acquire.stages.service.service.persistence.impl.constants.NBP_ACQUIREPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the acquire execution service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AcquireExecutionPersistence.class)
public class AcquireExecutionPersistenceImpl
	extends BasePersistenceImpl<AcquireExecution>
	implements AcquireExecutionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AcquireExecutionUtil</code> to access the acquire execution persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AcquireExecutionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetAcquireExecutionBy_CI;
	private FinderPath _finderPathCountBygetAcquireExecutionBy_CI;

	/**
	 * Returns the acquire execution where caseId = &#63; or throws a <code>NoSuchAcquireExecutionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire execution
	 * @throws NoSuchAcquireExecutionException if a matching acquire execution could not be found
	 */
	@Override
	public AcquireExecution findBygetAcquireExecutionBy_CI(String caseId)
		throws NoSuchAcquireExecutionException {

		AcquireExecution acquireExecution = fetchBygetAcquireExecutionBy_CI(
			caseId);

		if (acquireExecution == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireExecutionException(sb.toString());
		}

		return acquireExecution;
	}

	/**
	 * Returns the acquire execution where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire execution, or <code>null</code> if a matching acquire execution could not be found
	 */
	@Override
	public AcquireExecution fetchBygetAcquireExecutionBy_CI(String caseId) {
		return fetchBygetAcquireExecutionBy_CI(caseId, true);
	}

	/**
	 * Returns the acquire execution where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire execution, or <code>null</code> if a matching acquire execution could not be found
	 */
	@Override
	public AcquireExecution fetchBygetAcquireExecutionBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAcquireExecutionBy_CI, finderArgs, this);
		}

		if (result instanceof AcquireExecution) {
			AcquireExecution acquireExecution = (AcquireExecution)result;

			if (!Objects.equals(caseId, acquireExecution.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACQUIREEXECUTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETACQUIREEXECUTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETACQUIREEXECUTIONBY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<AcquireExecution> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAcquireExecutionBy_CI,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"AcquireExecutionPersistenceImpl.fetchBygetAcquireExecutionBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireExecution acquireExecution = list.get(0);

					result = acquireExecution;

					cacheResult(acquireExecution);
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
			return (AcquireExecution)result;
		}
	}

	/**
	 * Removes the acquire execution where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire execution that was removed
	 */
	@Override
	public AcquireExecution removeBygetAcquireExecutionBy_CI(String caseId)
		throws NoSuchAcquireExecutionException {

		AcquireExecution acquireExecution = findBygetAcquireExecutionBy_CI(
			caseId);

		return remove(acquireExecution);
	}

	/**
	 * Returns the number of acquire executions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire executions
	 */
	@Override
	public int countBygetAcquireExecutionBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetAcquireExecutionBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREEXECUTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETACQUIREEXECUTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETACQUIREEXECUTIONBY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

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
		_FINDER_COLUMN_GETACQUIREEXECUTIONBY_CI_CASEID_2 =
			"acquireExecution.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETACQUIREEXECUTIONBY_CI_CASEID_3 =
			"(acquireExecution.caseId IS NULL OR acquireExecution.caseId = '')";

	public AcquireExecutionPersistenceImpl() {
		setModelClass(AcquireExecution.class);

		setModelImplClass(AcquireExecutionImpl.class);
		setModelPKClass(long.class);

		setTable(AcquireExecutionTable.INSTANCE);
	}

	/**
	 * Caches the acquire execution in the entity cache if it is enabled.
	 *
	 * @param acquireExecution the acquire execution
	 */
	@Override
	public void cacheResult(AcquireExecution acquireExecution) {
		entityCache.putResult(
			AcquireExecutionImpl.class, acquireExecution.getPrimaryKey(),
			acquireExecution);

		finderCache.putResult(
			_finderPathFetchBygetAcquireExecutionBy_CI,
			new Object[] {acquireExecution.getCaseId()}, acquireExecution);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acquire executions in the entity cache if it is enabled.
	 *
	 * @param acquireExecutions the acquire executions
	 */
	@Override
	public void cacheResult(List<AcquireExecution> acquireExecutions) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (acquireExecutions.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AcquireExecution acquireExecution : acquireExecutions) {
			if (entityCache.getResult(
					AcquireExecutionImpl.class,
					acquireExecution.getPrimaryKey()) == null) {

				cacheResult(acquireExecution);
			}
		}
	}

	/**
	 * Clears the cache for all acquire executions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AcquireExecutionImpl.class);

		finderCache.clearCache(AcquireExecutionImpl.class);
	}

	/**
	 * Clears the cache for the acquire execution.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AcquireExecution acquireExecution) {
		entityCache.removeResult(AcquireExecutionImpl.class, acquireExecution);
	}

	@Override
	public void clearCache(List<AcquireExecution> acquireExecutions) {
		for (AcquireExecution acquireExecution : acquireExecutions) {
			entityCache.removeResult(
				AcquireExecutionImpl.class, acquireExecution);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AcquireExecutionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AcquireExecutionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AcquireExecutionModelImpl acquireExecutionModelImpl) {

		Object[] args = new Object[] {acquireExecutionModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetAcquireExecutionBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquireExecutionBy_CI, args,
			acquireExecutionModelImpl);
	}

	/**
	 * Creates a new acquire execution with the primary key. Does not add the acquire execution to the database.
	 *
	 * @param acquireExecutionId the primary key for the new acquire execution
	 * @return the new acquire execution
	 */
	@Override
	public AcquireExecution create(long acquireExecutionId) {
		AcquireExecution acquireExecution = new AcquireExecutionImpl();

		acquireExecution.setNew(true);
		acquireExecution.setPrimaryKey(acquireExecutionId);

		acquireExecution.setCompanyId(CompanyThreadLocal.getCompanyId());

		return acquireExecution;
	}

	/**
	 * Removes the acquire execution with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireExecutionId the primary key of the acquire execution
	 * @return the acquire execution that was removed
	 * @throws NoSuchAcquireExecutionException if a acquire execution with the primary key could not be found
	 */
	@Override
	public AcquireExecution remove(long acquireExecutionId)
		throws NoSuchAcquireExecutionException {

		return remove((Serializable)acquireExecutionId);
	}

	/**
	 * Removes the acquire execution with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acquire execution
	 * @return the acquire execution that was removed
	 * @throws NoSuchAcquireExecutionException if a acquire execution with the primary key could not be found
	 */
	@Override
	public AcquireExecution remove(Serializable primaryKey)
		throws NoSuchAcquireExecutionException {

		Session session = null;

		try {
			session = openSession();

			AcquireExecution acquireExecution = (AcquireExecution)session.get(
				AcquireExecutionImpl.class, primaryKey);

			if (acquireExecution == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAcquireExecutionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(acquireExecution);
		}
		catch (NoSuchAcquireExecutionException noSuchEntityException) {
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
	protected AcquireExecution removeImpl(AcquireExecution acquireExecution) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acquireExecution)) {
				acquireExecution = (AcquireExecution)session.get(
					AcquireExecutionImpl.class,
					acquireExecution.getPrimaryKeyObj());
			}

			if (acquireExecution != null) {
				session.delete(acquireExecution);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (acquireExecution != null) {
			clearCache(acquireExecution);
		}

		return acquireExecution;
	}

	@Override
	public AcquireExecution updateImpl(AcquireExecution acquireExecution) {
		boolean isNew = acquireExecution.isNew();

		if (!(acquireExecution instanceof AcquireExecutionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(acquireExecution.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					acquireExecution);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in acquireExecution proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AcquireExecution implementation " +
					acquireExecution.getClass());
		}

		AcquireExecutionModelImpl acquireExecutionModelImpl =
			(AcquireExecutionModelImpl)acquireExecution;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (acquireExecution.getCreateDate() == null)) {
			if (serviceContext == null) {
				acquireExecution.setCreateDate(date);
			}
			else {
				acquireExecution.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!acquireExecutionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				acquireExecution.setModifiedDate(date);
			}
			else {
				acquireExecution.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(acquireExecution);
			}
			else {
				acquireExecution = (AcquireExecution)session.merge(
					acquireExecution);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AcquireExecutionImpl.class, acquireExecutionModelImpl, false, true);

		cacheUniqueFindersCache(acquireExecutionModelImpl);

		if (isNew) {
			acquireExecution.setNew(false);
		}

		acquireExecution.resetOriginalValues();

		return acquireExecution;
	}

	/**
	 * Returns the acquire execution with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acquire execution
	 * @return the acquire execution
	 * @throws NoSuchAcquireExecutionException if a acquire execution with the primary key could not be found
	 */
	@Override
	public AcquireExecution findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAcquireExecutionException {

		AcquireExecution acquireExecution = fetchByPrimaryKey(primaryKey);

		if (acquireExecution == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAcquireExecutionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return acquireExecution;
	}

	/**
	 * Returns the acquire execution with the primary key or throws a <code>NoSuchAcquireExecutionException</code> if it could not be found.
	 *
	 * @param acquireExecutionId the primary key of the acquire execution
	 * @return the acquire execution
	 * @throws NoSuchAcquireExecutionException if a acquire execution with the primary key could not be found
	 */
	@Override
	public AcquireExecution findByPrimaryKey(long acquireExecutionId)
		throws NoSuchAcquireExecutionException {

		return findByPrimaryKey((Serializable)acquireExecutionId);
	}

	/**
	 * Returns the acquire execution with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireExecutionId the primary key of the acquire execution
	 * @return the acquire execution, or <code>null</code> if a acquire execution with the primary key could not be found
	 */
	@Override
	public AcquireExecution fetchByPrimaryKey(long acquireExecutionId) {
		return fetchByPrimaryKey((Serializable)acquireExecutionId);
	}

	/**
	 * Returns all the acquire executions.
	 *
	 * @return the acquire executions
	 */
	@Override
	public List<AcquireExecution> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire executions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireExecutionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire executions
	 * @param end the upper bound of the range of acquire executions (not inclusive)
	 * @return the range of acquire executions
	 */
	@Override
	public List<AcquireExecution> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire executions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireExecutionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire executions
	 * @param end the upper bound of the range of acquire executions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire executions
	 */
	@Override
	public List<AcquireExecution> findAll(
		int start, int end,
		OrderByComparator<AcquireExecution> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire executions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireExecutionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire executions
	 * @param end the upper bound of the range of acquire executions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire executions
	 */
	@Override
	public List<AcquireExecution> findAll(
		int start, int end,
		OrderByComparator<AcquireExecution> orderByComparator,
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

		List<AcquireExecution> list = null;

		if (useFinderCache) {
			list = (List<AcquireExecution>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACQUIREEXECUTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACQUIREEXECUTION;

				sql = sql.concat(AcquireExecutionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AcquireExecution>)QueryUtil.list(
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
	 * Removes all the acquire executions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AcquireExecution acquireExecution : findAll()) {
			remove(acquireExecution);
		}
	}

	/**
	 * Returns the number of acquire executions.
	 *
	 * @return the number of acquire executions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ACQUIREEXECUTION);

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
		return "acquireExecutionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACQUIREEXECUTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AcquireExecutionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acquire execution persistence.
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

		_finderPathFetchBygetAcquireExecutionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAcquireExecutionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetAcquireExecutionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAcquireExecutionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		AcquireExecutionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AcquireExecutionUtil.setPersistence(null);

		entityCache.removeCache(AcquireExecutionImpl.class.getName());
	}

	@Override
	@Reference(
		target = NBP_ACQUIREPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NBP_ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NBP_ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ACQUIREEXECUTION =
		"SELECT acquireExecution FROM AcquireExecution acquireExecution";

	private static final String _SQL_SELECT_ACQUIREEXECUTION_WHERE =
		"SELECT acquireExecution FROM AcquireExecution acquireExecution WHERE ";

	private static final String _SQL_COUNT_ACQUIREEXECUTION =
		"SELECT COUNT(acquireExecution) FROM AcquireExecution acquireExecution";

	private static final String _SQL_COUNT_ACQUIREEXECUTION_WHERE =
		"SELECT COUNT(acquireExecution) FROM AcquireExecution acquireExecution WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "acquireExecution.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AcquireExecution exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AcquireExecution exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AcquireExecutionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}