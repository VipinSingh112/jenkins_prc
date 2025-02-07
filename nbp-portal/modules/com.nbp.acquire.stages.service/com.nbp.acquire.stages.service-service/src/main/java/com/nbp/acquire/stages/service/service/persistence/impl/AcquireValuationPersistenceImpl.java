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

import com.nbp.acquire.stages.service.exception.NoSuchAcquireValuationException;
import com.nbp.acquire.stages.service.model.AcquireValuation;
import com.nbp.acquire.stages.service.model.AcquireValuationTable;
import com.nbp.acquire.stages.service.model.impl.AcquireValuationImpl;
import com.nbp.acquire.stages.service.model.impl.AcquireValuationModelImpl;
import com.nbp.acquire.stages.service.service.persistence.AcquireValuationPersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireValuationUtil;
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
 * The persistence implementation for the acquire valuation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AcquireValuationPersistence.class)
public class AcquireValuationPersistenceImpl
	extends BasePersistenceImpl<AcquireValuation>
	implements AcquireValuationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AcquireValuationUtil</code> to access the acquire valuation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AcquireValuationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetAcquireValuationBy_CaseId;
	private FinderPath _finderPathCountBygetAcquireValuationBy_CaseId;

	/**
	 * Returns the acquire valuation where caseId = &#63; or throws a <code>NoSuchAcquireValuationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire valuation
	 * @throws NoSuchAcquireValuationException if a matching acquire valuation could not be found
	 */
	@Override
	public AcquireValuation findBygetAcquireValuationBy_CaseId(String caseId)
		throws NoSuchAcquireValuationException {

		AcquireValuation acquireValuation = fetchBygetAcquireValuationBy_CaseId(
			caseId);

		if (acquireValuation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireValuationException(sb.toString());
		}

		return acquireValuation;
	}

	/**
	 * Returns the acquire valuation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire valuation, or <code>null</code> if a matching acquire valuation could not be found
	 */
	@Override
	public AcquireValuation fetchBygetAcquireValuationBy_CaseId(String caseId) {
		return fetchBygetAcquireValuationBy_CaseId(caseId, true);
	}

	/**
	 * Returns the acquire valuation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire valuation, or <code>null</code> if a matching acquire valuation could not be found
	 */
	@Override
	public AcquireValuation fetchBygetAcquireValuationBy_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAcquireValuationBy_CaseId, finderArgs,
				this);
		}

		if (result instanceof AcquireValuation) {
			AcquireValuation acquireValuation = (AcquireValuation)result;

			if (!Objects.equals(caseId, acquireValuation.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACQUIREVALUATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETACQUIREVALUATIONBY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETACQUIREVALUATIONBY_CASEID_CASEID_2);
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

				List<AcquireValuation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAcquireValuationBy_CaseId,
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
								"AcquireValuationPersistenceImpl.fetchBygetAcquireValuationBy_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireValuation acquireValuation = list.get(0);

					result = acquireValuation;

					cacheResult(acquireValuation);
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
			return (AcquireValuation)result;
		}
	}

	/**
	 * Removes the acquire valuation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire valuation that was removed
	 */
	@Override
	public AcquireValuation removeBygetAcquireValuationBy_CaseId(String caseId)
		throws NoSuchAcquireValuationException {

		AcquireValuation acquireValuation = findBygetAcquireValuationBy_CaseId(
			caseId);

		return remove(acquireValuation);
	}

	/**
	 * Returns the number of acquire valuations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire valuations
	 */
	@Override
	public int countBygetAcquireValuationBy_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetAcquireValuationBy_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREVALUATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETACQUIREVALUATIONBY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETACQUIREVALUATIONBY_CASEID_CASEID_2);
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
		_FINDER_COLUMN_GETACQUIREVALUATIONBY_CASEID_CASEID_2 =
			"acquireValuation.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETACQUIREVALUATIONBY_CASEID_CASEID_3 =
			"(acquireValuation.caseId IS NULL OR acquireValuation.caseId = '')";

	public AcquireValuationPersistenceImpl() {
		setModelClass(AcquireValuation.class);

		setModelImplClass(AcquireValuationImpl.class);
		setModelPKClass(long.class);

		setTable(AcquireValuationTable.INSTANCE);
	}

	/**
	 * Caches the acquire valuation in the entity cache if it is enabled.
	 *
	 * @param acquireValuation the acquire valuation
	 */
	@Override
	public void cacheResult(AcquireValuation acquireValuation) {
		entityCache.putResult(
			AcquireValuationImpl.class, acquireValuation.getPrimaryKey(),
			acquireValuation);

		finderCache.putResult(
			_finderPathFetchBygetAcquireValuationBy_CaseId,
			new Object[] {acquireValuation.getCaseId()}, acquireValuation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acquire valuations in the entity cache if it is enabled.
	 *
	 * @param acquireValuations the acquire valuations
	 */
	@Override
	public void cacheResult(List<AcquireValuation> acquireValuations) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (acquireValuations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AcquireValuation acquireValuation : acquireValuations) {
			if (entityCache.getResult(
					AcquireValuationImpl.class,
					acquireValuation.getPrimaryKey()) == null) {

				cacheResult(acquireValuation);
			}
		}
	}

	/**
	 * Clears the cache for all acquire valuations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AcquireValuationImpl.class);

		finderCache.clearCache(AcquireValuationImpl.class);
	}

	/**
	 * Clears the cache for the acquire valuation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AcquireValuation acquireValuation) {
		entityCache.removeResult(AcquireValuationImpl.class, acquireValuation);
	}

	@Override
	public void clearCache(List<AcquireValuation> acquireValuations) {
		for (AcquireValuation acquireValuation : acquireValuations) {
			entityCache.removeResult(
				AcquireValuationImpl.class, acquireValuation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AcquireValuationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AcquireValuationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AcquireValuationModelImpl acquireValuationModelImpl) {

		Object[] args = new Object[] {acquireValuationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetAcquireValuationBy_CaseId, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquireValuationBy_CaseId, args,
			acquireValuationModelImpl);
	}

	/**
	 * Creates a new acquire valuation with the primary key. Does not add the acquire valuation to the database.
	 *
	 * @param acquireValuationId the primary key for the new acquire valuation
	 * @return the new acquire valuation
	 */
	@Override
	public AcquireValuation create(long acquireValuationId) {
		AcquireValuation acquireValuation = new AcquireValuationImpl();

		acquireValuation.setNew(true);
		acquireValuation.setPrimaryKey(acquireValuationId);

		acquireValuation.setCompanyId(CompanyThreadLocal.getCompanyId());

		return acquireValuation;
	}

	/**
	 * Removes the acquire valuation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireValuationId the primary key of the acquire valuation
	 * @return the acquire valuation that was removed
	 * @throws NoSuchAcquireValuationException if a acquire valuation with the primary key could not be found
	 */
	@Override
	public AcquireValuation remove(long acquireValuationId)
		throws NoSuchAcquireValuationException {

		return remove((Serializable)acquireValuationId);
	}

	/**
	 * Removes the acquire valuation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acquire valuation
	 * @return the acquire valuation that was removed
	 * @throws NoSuchAcquireValuationException if a acquire valuation with the primary key could not be found
	 */
	@Override
	public AcquireValuation remove(Serializable primaryKey)
		throws NoSuchAcquireValuationException {

		Session session = null;

		try {
			session = openSession();

			AcquireValuation acquireValuation = (AcquireValuation)session.get(
				AcquireValuationImpl.class, primaryKey);

			if (acquireValuation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAcquireValuationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(acquireValuation);
		}
		catch (NoSuchAcquireValuationException noSuchEntityException) {
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
	protected AcquireValuation removeImpl(AcquireValuation acquireValuation) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acquireValuation)) {
				acquireValuation = (AcquireValuation)session.get(
					AcquireValuationImpl.class,
					acquireValuation.getPrimaryKeyObj());
			}

			if (acquireValuation != null) {
				session.delete(acquireValuation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (acquireValuation != null) {
			clearCache(acquireValuation);
		}

		return acquireValuation;
	}

	@Override
	public AcquireValuation updateImpl(AcquireValuation acquireValuation) {
		boolean isNew = acquireValuation.isNew();

		if (!(acquireValuation instanceof AcquireValuationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(acquireValuation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					acquireValuation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in acquireValuation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AcquireValuation implementation " +
					acquireValuation.getClass());
		}

		AcquireValuationModelImpl acquireValuationModelImpl =
			(AcquireValuationModelImpl)acquireValuation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (acquireValuation.getCreateDate() == null)) {
			if (serviceContext == null) {
				acquireValuation.setCreateDate(date);
			}
			else {
				acquireValuation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!acquireValuationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				acquireValuation.setModifiedDate(date);
			}
			else {
				acquireValuation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(acquireValuation);
			}
			else {
				acquireValuation = (AcquireValuation)session.merge(
					acquireValuation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AcquireValuationImpl.class, acquireValuationModelImpl, false, true);

		cacheUniqueFindersCache(acquireValuationModelImpl);

		if (isNew) {
			acquireValuation.setNew(false);
		}

		acquireValuation.resetOriginalValues();

		return acquireValuation;
	}

	/**
	 * Returns the acquire valuation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acquire valuation
	 * @return the acquire valuation
	 * @throws NoSuchAcquireValuationException if a acquire valuation with the primary key could not be found
	 */
	@Override
	public AcquireValuation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAcquireValuationException {

		AcquireValuation acquireValuation = fetchByPrimaryKey(primaryKey);

		if (acquireValuation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAcquireValuationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return acquireValuation;
	}

	/**
	 * Returns the acquire valuation with the primary key or throws a <code>NoSuchAcquireValuationException</code> if it could not be found.
	 *
	 * @param acquireValuationId the primary key of the acquire valuation
	 * @return the acquire valuation
	 * @throws NoSuchAcquireValuationException if a acquire valuation with the primary key could not be found
	 */
	@Override
	public AcquireValuation findByPrimaryKey(long acquireValuationId)
		throws NoSuchAcquireValuationException {

		return findByPrimaryKey((Serializable)acquireValuationId);
	}

	/**
	 * Returns the acquire valuation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireValuationId the primary key of the acquire valuation
	 * @return the acquire valuation, or <code>null</code> if a acquire valuation with the primary key could not be found
	 */
	@Override
	public AcquireValuation fetchByPrimaryKey(long acquireValuationId) {
		return fetchByPrimaryKey((Serializable)acquireValuationId);
	}

	/**
	 * Returns all the acquire valuations.
	 *
	 * @return the acquire valuations
	 */
	@Override
	public List<AcquireValuation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire valuations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireValuationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire valuations
	 * @param end the upper bound of the range of acquire valuations (not inclusive)
	 * @return the range of acquire valuations
	 */
	@Override
	public List<AcquireValuation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire valuations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireValuationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire valuations
	 * @param end the upper bound of the range of acquire valuations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire valuations
	 */
	@Override
	public List<AcquireValuation> findAll(
		int start, int end,
		OrderByComparator<AcquireValuation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire valuations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireValuationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire valuations
	 * @param end the upper bound of the range of acquire valuations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire valuations
	 */
	@Override
	public List<AcquireValuation> findAll(
		int start, int end,
		OrderByComparator<AcquireValuation> orderByComparator,
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

		List<AcquireValuation> list = null;

		if (useFinderCache) {
			list = (List<AcquireValuation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACQUIREVALUATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACQUIREVALUATION;

				sql = sql.concat(AcquireValuationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AcquireValuation>)QueryUtil.list(
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
	 * Removes all the acquire valuations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AcquireValuation acquireValuation : findAll()) {
			remove(acquireValuation);
		}
	}

	/**
	 * Returns the number of acquire valuations.
	 *
	 * @return the number of acquire valuations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ACQUIREVALUATION);

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
		return "acquireValuationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACQUIREVALUATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AcquireValuationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acquire valuation persistence.
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

		_finderPathFetchBygetAcquireValuationBy_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAcquireValuationBy_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetAcquireValuationBy_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAcquireValuationBy_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		AcquireValuationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AcquireValuationUtil.setPersistence(null);

		entityCache.removeCache(AcquireValuationImpl.class.getName());
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

	private static final String _SQL_SELECT_ACQUIREVALUATION =
		"SELECT acquireValuation FROM AcquireValuation acquireValuation";

	private static final String _SQL_SELECT_ACQUIREVALUATION_WHERE =
		"SELECT acquireValuation FROM AcquireValuation acquireValuation WHERE ";

	private static final String _SQL_COUNT_ACQUIREVALUATION =
		"SELECT COUNT(acquireValuation) FROM AcquireValuation acquireValuation";

	private static final String _SQL_COUNT_ACQUIREVALUATION_WHERE =
		"SELECT COUNT(acquireValuation) FROM AcquireValuation acquireValuation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "acquireValuation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AcquireValuation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AcquireValuation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AcquireValuationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}