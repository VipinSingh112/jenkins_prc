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

import com.nbp.acquire.stages.service.exception.NoSuchAcquireEvaluationException;
import com.nbp.acquire.stages.service.model.AcquireEvaluation;
import com.nbp.acquire.stages.service.model.AcquireEvaluationTable;
import com.nbp.acquire.stages.service.model.impl.AcquireEvaluationImpl;
import com.nbp.acquire.stages.service.model.impl.AcquireEvaluationModelImpl;
import com.nbp.acquire.stages.service.service.persistence.AcquireEvaluationPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireEvaluationUtil;
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
 * The persistence implementation for the acquire evaluation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AcquireEvaluationPersistence.class)
public class AcquireEvaluationPersistenceImpl
	extends BasePersistenceImpl<AcquireEvaluation>
	implements AcquireEvaluationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AcquireEvaluationUtil</code> to access the acquire evaluation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AcquireEvaluationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetAcquireEvaluationBy_CaseId;
	private FinderPath _finderPathCountBygetAcquireEvaluationBy_CaseId;

	/**
	 * Returns the acquire evaluation where caseId = &#63; or throws a <code>NoSuchAcquireEvaluationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire evaluation
	 * @throws NoSuchAcquireEvaluationException if a matching acquire evaluation could not be found
	 */
	@Override
	public AcquireEvaluation findBygetAcquireEvaluationBy_CaseId(String caseId)
		throws NoSuchAcquireEvaluationException {

		AcquireEvaluation acquireEvaluation =
			fetchBygetAcquireEvaluationBy_CaseId(caseId);

		if (acquireEvaluation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireEvaluationException(sb.toString());
		}

		return acquireEvaluation;
	}

	/**
	 * Returns the acquire evaluation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire evaluation, or <code>null</code> if a matching acquire evaluation could not be found
	 */
	@Override
	public AcquireEvaluation fetchBygetAcquireEvaluationBy_CaseId(
		String caseId) {

		return fetchBygetAcquireEvaluationBy_CaseId(caseId, true);
	}

	/**
	 * Returns the acquire evaluation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire evaluation, or <code>null</code> if a matching acquire evaluation could not be found
	 */
	@Override
	public AcquireEvaluation fetchBygetAcquireEvaluationBy_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAcquireEvaluationBy_CaseId, finderArgs,
				this);
		}

		if (result instanceof AcquireEvaluation) {
			AcquireEvaluation acquireEvaluation = (AcquireEvaluation)result;

			if (!Objects.equals(caseId, acquireEvaluation.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACQUIREEVALUATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREEVALUATIONBY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREEVALUATIONBY_CASEID_CASEID_2);
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

				List<AcquireEvaluation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAcquireEvaluationBy_CaseId,
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
								"AcquireEvaluationPersistenceImpl.fetchBygetAcquireEvaluationBy_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireEvaluation acquireEvaluation = list.get(0);

					result = acquireEvaluation;

					cacheResult(acquireEvaluation);
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
			return (AcquireEvaluation)result;
		}
	}

	/**
	 * Removes the acquire evaluation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire evaluation that was removed
	 */
	@Override
	public AcquireEvaluation removeBygetAcquireEvaluationBy_CaseId(
			String caseId)
		throws NoSuchAcquireEvaluationException {

		AcquireEvaluation acquireEvaluation =
			findBygetAcquireEvaluationBy_CaseId(caseId);

		return remove(acquireEvaluation);
	}

	/**
	 * Returns the number of acquire evaluations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire evaluations
	 */
	@Override
	public int countBygetAcquireEvaluationBy_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetAcquireEvaluationBy_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREEVALUATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREEVALUATIONBY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREEVALUATIONBY_CASEID_CASEID_2);
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
		_FINDER_COLUMN_GETACQUIREEVALUATIONBY_CASEID_CASEID_2 =
			"acquireEvaluation.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETACQUIREEVALUATIONBY_CASEID_CASEID_3 =
			"(acquireEvaluation.caseId IS NULL OR acquireEvaluation.caseId = '')";

	public AcquireEvaluationPersistenceImpl() {
		setModelClass(AcquireEvaluation.class);

		setModelImplClass(AcquireEvaluationImpl.class);
		setModelPKClass(long.class);

		setTable(AcquireEvaluationTable.INSTANCE);
	}

	/**
	 * Caches the acquire evaluation in the entity cache if it is enabled.
	 *
	 * @param acquireEvaluation the acquire evaluation
	 */
	@Override
	public void cacheResult(AcquireEvaluation acquireEvaluation) {
		entityCache.putResult(
			AcquireEvaluationImpl.class, acquireEvaluation.getPrimaryKey(),
			acquireEvaluation);

		finderCache.putResult(
			_finderPathFetchBygetAcquireEvaluationBy_CaseId,
			new Object[] {acquireEvaluation.getCaseId()}, acquireEvaluation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acquire evaluations in the entity cache if it is enabled.
	 *
	 * @param acquireEvaluations the acquire evaluations
	 */
	@Override
	public void cacheResult(List<AcquireEvaluation> acquireEvaluations) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (acquireEvaluations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AcquireEvaluation acquireEvaluation : acquireEvaluations) {
			if (entityCache.getResult(
					AcquireEvaluationImpl.class,
					acquireEvaluation.getPrimaryKey()) == null) {

				cacheResult(acquireEvaluation);
			}
		}
	}

	/**
	 * Clears the cache for all acquire evaluations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AcquireEvaluationImpl.class);

		finderCache.clearCache(AcquireEvaluationImpl.class);
	}

	/**
	 * Clears the cache for the acquire evaluation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AcquireEvaluation acquireEvaluation) {
		entityCache.removeResult(
			AcquireEvaluationImpl.class, acquireEvaluation);
	}

	@Override
	public void clearCache(List<AcquireEvaluation> acquireEvaluations) {
		for (AcquireEvaluation acquireEvaluation : acquireEvaluations) {
			entityCache.removeResult(
				AcquireEvaluationImpl.class, acquireEvaluation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AcquireEvaluationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AcquireEvaluationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AcquireEvaluationModelImpl acquireEvaluationModelImpl) {

		Object[] args = new Object[] {acquireEvaluationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetAcquireEvaluationBy_CaseId, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquireEvaluationBy_CaseId, args,
			acquireEvaluationModelImpl);
	}

	/**
	 * Creates a new acquire evaluation with the primary key. Does not add the acquire evaluation to the database.
	 *
	 * @param acquireEvaluationId the primary key for the new acquire evaluation
	 * @return the new acquire evaluation
	 */
	@Override
	public AcquireEvaluation create(long acquireEvaluationId) {
		AcquireEvaluation acquireEvaluation = new AcquireEvaluationImpl();

		acquireEvaluation.setNew(true);
		acquireEvaluation.setPrimaryKey(acquireEvaluationId);

		acquireEvaluation.setCompanyId(CompanyThreadLocal.getCompanyId());

		return acquireEvaluation;
	}

	/**
	 * Removes the acquire evaluation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireEvaluationId the primary key of the acquire evaluation
	 * @return the acquire evaluation that was removed
	 * @throws NoSuchAcquireEvaluationException if a acquire evaluation with the primary key could not be found
	 */
	@Override
	public AcquireEvaluation remove(long acquireEvaluationId)
		throws NoSuchAcquireEvaluationException {

		return remove((Serializable)acquireEvaluationId);
	}

	/**
	 * Removes the acquire evaluation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acquire evaluation
	 * @return the acquire evaluation that was removed
	 * @throws NoSuchAcquireEvaluationException if a acquire evaluation with the primary key could not be found
	 */
	@Override
	public AcquireEvaluation remove(Serializable primaryKey)
		throws NoSuchAcquireEvaluationException {

		Session session = null;

		try {
			session = openSession();

			AcquireEvaluation acquireEvaluation =
				(AcquireEvaluation)session.get(
					AcquireEvaluationImpl.class, primaryKey);

			if (acquireEvaluation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAcquireEvaluationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(acquireEvaluation);
		}
		catch (NoSuchAcquireEvaluationException noSuchEntityException) {
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
	protected AcquireEvaluation removeImpl(
		AcquireEvaluation acquireEvaluation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acquireEvaluation)) {
				acquireEvaluation = (AcquireEvaluation)session.get(
					AcquireEvaluationImpl.class,
					acquireEvaluation.getPrimaryKeyObj());
			}

			if (acquireEvaluation != null) {
				session.delete(acquireEvaluation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (acquireEvaluation != null) {
			clearCache(acquireEvaluation);
		}

		return acquireEvaluation;
	}

	@Override
	public AcquireEvaluation updateImpl(AcquireEvaluation acquireEvaluation) {
		boolean isNew = acquireEvaluation.isNew();

		if (!(acquireEvaluation instanceof AcquireEvaluationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(acquireEvaluation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					acquireEvaluation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in acquireEvaluation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AcquireEvaluation implementation " +
					acquireEvaluation.getClass());
		}

		AcquireEvaluationModelImpl acquireEvaluationModelImpl =
			(AcquireEvaluationModelImpl)acquireEvaluation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (acquireEvaluation.getCreateDate() == null)) {
			if (serviceContext == null) {
				acquireEvaluation.setCreateDate(date);
			}
			else {
				acquireEvaluation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!acquireEvaluationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				acquireEvaluation.setModifiedDate(date);
			}
			else {
				acquireEvaluation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(acquireEvaluation);
			}
			else {
				acquireEvaluation = (AcquireEvaluation)session.merge(
					acquireEvaluation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AcquireEvaluationImpl.class, acquireEvaluationModelImpl, false,
			true);

		cacheUniqueFindersCache(acquireEvaluationModelImpl);

		if (isNew) {
			acquireEvaluation.setNew(false);
		}

		acquireEvaluation.resetOriginalValues();

		return acquireEvaluation;
	}

	/**
	 * Returns the acquire evaluation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acquire evaluation
	 * @return the acquire evaluation
	 * @throws NoSuchAcquireEvaluationException if a acquire evaluation with the primary key could not be found
	 */
	@Override
	public AcquireEvaluation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAcquireEvaluationException {

		AcquireEvaluation acquireEvaluation = fetchByPrimaryKey(primaryKey);

		if (acquireEvaluation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAcquireEvaluationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return acquireEvaluation;
	}

	/**
	 * Returns the acquire evaluation with the primary key or throws a <code>NoSuchAcquireEvaluationException</code> if it could not be found.
	 *
	 * @param acquireEvaluationId the primary key of the acquire evaluation
	 * @return the acquire evaluation
	 * @throws NoSuchAcquireEvaluationException if a acquire evaluation with the primary key could not be found
	 */
	@Override
	public AcquireEvaluation findByPrimaryKey(long acquireEvaluationId)
		throws NoSuchAcquireEvaluationException {

		return findByPrimaryKey((Serializable)acquireEvaluationId);
	}

	/**
	 * Returns the acquire evaluation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireEvaluationId the primary key of the acquire evaluation
	 * @return the acquire evaluation, or <code>null</code> if a acquire evaluation with the primary key could not be found
	 */
	@Override
	public AcquireEvaluation fetchByPrimaryKey(long acquireEvaluationId) {
		return fetchByPrimaryKey((Serializable)acquireEvaluationId);
	}

	/**
	 * Returns all the acquire evaluations.
	 *
	 * @return the acquire evaluations
	 */
	@Override
	public List<AcquireEvaluation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire evaluations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireEvaluationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire evaluations
	 * @param end the upper bound of the range of acquire evaluations (not inclusive)
	 * @return the range of acquire evaluations
	 */
	@Override
	public List<AcquireEvaluation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire evaluations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireEvaluationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire evaluations
	 * @param end the upper bound of the range of acquire evaluations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire evaluations
	 */
	@Override
	public List<AcquireEvaluation> findAll(
		int start, int end,
		OrderByComparator<AcquireEvaluation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire evaluations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireEvaluationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire evaluations
	 * @param end the upper bound of the range of acquire evaluations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire evaluations
	 */
	@Override
	public List<AcquireEvaluation> findAll(
		int start, int end,
		OrderByComparator<AcquireEvaluation> orderByComparator,
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

		List<AcquireEvaluation> list = null;

		if (useFinderCache) {
			list = (List<AcquireEvaluation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACQUIREEVALUATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACQUIREEVALUATION;

				sql = sql.concat(AcquireEvaluationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AcquireEvaluation>)QueryUtil.list(
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
	 * Removes all the acquire evaluations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AcquireEvaluation acquireEvaluation : findAll()) {
			remove(acquireEvaluation);
		}
	}

	/**
	 * Returns the number of acquire evaluations.
	 *
	 * @return the number of acquire evaluations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ACQUIREEVALUATION);

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
		return "acquireEvaluationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACQUIREEVALUATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AcquireEvaluationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acquire evaluation persistence.
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

		_finderPathFetchBygetAcquireEvaluationBy_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAcquireEvaluationBy_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetAcquireEvaluationBy_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAcquireEvaluationBy_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		AcquireEvaluationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AcquireEvaluationUtil.setPersistence(null);

		entityCache.removeCache(AcquireEvaluationImpl.class.getName());
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

	private static final String _SQL_SELECT_ACQUIREEVALUATION =
		"SELECT acquireEvaluation FROM AcquireEvaluation acquireEvaluation";

	private static final String _SQL_SELECT_ACQUIREEVALUATION_WHERE =
		"SELECT acquireEvaluation FROM AcquireEvaluation acquireEvaluation WHERE ";

	private static final String _SQL_COUNT_ACQUIREEVALUATION =
		"SELECT COUNT(acquireEvaluation) FROM AcquireEvaluation acquireEvaluation";

	private static final String _SQL_COUNT_ACQUIREEVALUATION_WHERE =
		"SELECT COUNT(acquireEvaluation) FROM AcquireEvaluation acquireEvaluation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "acquireEvaluation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AcquireEvaluation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AcquireEvaluation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AcquireEvaluationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}