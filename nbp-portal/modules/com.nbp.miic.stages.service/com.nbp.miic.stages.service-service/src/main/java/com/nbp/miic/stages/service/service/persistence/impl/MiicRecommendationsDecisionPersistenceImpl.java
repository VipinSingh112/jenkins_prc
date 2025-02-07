/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.service.persistence.impl;

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

import com.nbp.miic.stages.service.exception.NoSuchMiicRecommendationsDecisionException;
import com.nbp.miic.stages.service.model.MiicRecommendationsDecision;
import com.nbp.miic.stages.service.model.MiicRecommendationsDecisionTable;
import com.nbp.miic.stages.service.model.impl.MiicRecommendationsDecisionImpl;
import com.nbp.miic.stages.service.model.impl.MiicRecommendationsDecisionModelImpl;
import com.nbp.miic.stages.service.service.persistence.MiicRecommendationsDecisionPersistence;
import com.nbp.miic.stages.service.service.persistence.MiicRecommendationsDecisionUtil;
import com.nbp.miic.stages.service.service.persistence.impl.constants.MIIC_APPLICATION_STAGEPersistenceConstants;

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
 * The persistence implementation for the miic recommendations decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiicRecommendationsDecisionPersistence.class)
public class MiicRecommendationsDecisionPersistenceImpl
	extends BasePersistenceImpl<MiicRecommendationsDecision>
	implements MiicRecommendationsDecisionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiicRecommendationsDecisionUtil</code> to access the miic recommendations decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiicRecommendationsDecisionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetMiic_RD_by_CI;
	private FinderPath _finderPathCountBygetMiic_RD_by_CI;

	/**
	 * Returns the miic recommendations decision where caseId = &#63; or throws a <code>NoSuchMiicRecommendationsDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching miic recommendations decision
	 * @throws NoSuchMiicRecommendationsDecisionException if a matching miic recommendations decision could not be found
	 */
	@Override
	public MiicRecommendationsDecision findBygetMiic_RD_by_CI(String caseId)
		throws NoSuchMiicRecommendationsDecisionException {

		MiicRecommendationsDecision miicRecommendationsDecision =
			fetchBygetMiic_RD_by_CI(caseId);

		if (miicRecommendationsDecision == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiicRecommendationsDecisionException(sb.toString());
		}

		return miicRecommendationsDecision;
	}

	/**
	 * Returns the miic recommendations decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching miic recommendations decision, or <code>null</code> if a matching miic recommendations decision could not be found
	 */
	@Override
	public MiicRecommendationsDecision fetchBygetMiic_RD_by_CI(String caseId) {
		return fetchBygetMiic_RD_by_CI(caseId, true);
	}

	/**
	 * Returns the miic recommendations decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic recommendations decision, or <code>null</code> if a matching miic recommendations decision could not be found
	 */
	@Override
	public MiicRecommendationsDecision fetchBygetMiic_RD_by_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMiic_RD_by_CI, finderArgs, this);
		}

		if (result instanceof MiicRecommendationsDecision) {
			MiicRecommendationsDecision miicRecommendationsDecision =
				(MiicRecommendationsDecision)result;

			if (!Objects.equals(
					caseId, miicRecommendationsDecision.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MIICRECOMMENDATIONSDECISION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIIC_RD_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMIIC_RD_BY_CI_CASEID_2);
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

				List<MiicRecommendationsDecision> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMiic_RD_by_CI, finderArgs,
							list);
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
								"MiicRecommendationsDecisionPersistenceImpl.fetchBygetMiic_RD_by_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiicRecommendationsDecision miicRecommendationsDecision =
						list.get(0);

					result = miicRecommendationsDecision;

					cacheResult(miicRecommendationsDecision);
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
			return (MiicRecommendationsDecision)result;
		}
	}

	/**
	 * Removes the miic recommendations decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the miic recommendations decision that was removed
	 */
	@Override
	public MiicRecommendationsDecision removeBygetMiic_RD_by_CI(String caseId)
		throws NoSuchMiicRecommendationsDecisionException {

		MiicRecommendationsDecision miicRecommendationsDecision =
			findBygetMiic_RD_by_CI(caseId);

		return remove(miicRecommendationsDecision);
	}

	/**
	 * Returns the number of miic recommendations decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching miic recommendations decisions
	 */
	@Override
	public int countBygetMiic_RD_by_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMiic_RD_by_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MIICRECOMMENDATIONSDECISION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIIC_RD_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMIIC_RD_BY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETMIIC_RD_BY_CI_CASEID_2 =
		"miicRecommendationsDecision.caseId = ?";

	private static final String _FINDER_COLUMN_GETMIIC_RD_BY_CI_CASEID_3 =
		"(miicRecommendationsDecision.caseId IS NULL OR miicRecommendationsDecision.caseId = '')";

	public MiicRecommendationsDecisionPersistenceImpl() {
		setModelClass(MiicRecommendationsDecision.class);

		setModelImplClass(MiicRecommendationsDecisionImpl.class);
		setModelPKClass(long.class);

		setTable(MiicRecommendationsDecisionTable.INSTANCE);
	}

	/**
	 * Caches the miic recommendations decision in the entity cache if it is enabled.
	 *
	 * @param miicRecommendationsDecision the miic recommendations decision
	 */
	@Override
	public void cacheResult(
		MiicRecommendationsDecision miicRecommendationsDecision) {

		entityCache.putResult(
			MiicRecommendationsDecisionImpl.class,
			miicRecommendationsDecision.getPrimaryKey(),
			miicRecommendationsDecision);

		finderCache.putResult(
			_finderPathFetchBygetMiic_RD_by_CI,
			new Object[] {miicRecommendationsDecision.getCaseId()},
			miicRecommendationsDecision);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the miic recommendations decisions in the entity cache if it is enabled.
	 *
	 * @param miicRecommendationsDecisions the miic recommendations decisions
	 */
	@Override
	public void cacheResult(
		List<MiicRecommendationsDecision> miicRecommendationsDecisions) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miicRecommendationsDecisions.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiicRecommendationsDecision miicRecommendationsDecision :
				miicRecommendationsDecisions) {

			if (entityCache.getResult(
					MiicRecommendationsDecisionImpl.class,
					miicRecommendationsDecision.getPrimaryKey()) == null) {

				cacheResult(miicRecommendationsDecision);
			}
		}
	}

	/**
	 * Clears the cache for all miic recommendations decisions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiicRecommendationsDecisionImpl.class);

		finderCache.clearCache(MiicRecommendationsDecisionImpl.class);
	}

	/**
	 * Clears the cache for the miic recommendations decision.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		MiicRecommendationsDecision miicRecommendationsDecision) {

		entityCache.removeResult(
			MiicRecommendationsDecisionImpl.class, miicRecommendationsDecision);
	}

	@Override
	public void clearCache(
		List<MiicRecommendationsDecision> miicRecommendationsDecisions) {

		for (MiicRecommendationsDecision miicRecommendationsDecision :
				miicRecommendationsDecisions) {

			entityCache.removeResult(
				MiicRecommendationsDecisionImpl.class,
				miicRecommendationsDecision);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiicRecommendationsDecisionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MiicRecommendationsDecisionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MiicRecommendationsDecisionModelImpl
			miicRecommendationsDecisionModelImpl) {

		Object[] args = new Object[] {
			miicRecommendationsDecisionModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetMiic_RD_by_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMiic_RD_by_CI, args,
			miicRecommendationsDecisionModelImpl);
	}

	/**
	 * Creates a new miic recommendations decision with the primary key. Does not add the miic recommendations decision to the database.
	 *
	 * @param miicRecommendationsDecisionId the primary key for the new miic recommendations decision
	 * @return the new miic recommendations decision
	 */
	@Override
	public MiicRecommendationsDecision create(
		long miicRecommendationsDecisionId) {

		MiicRecommendationsDecision miicRecommendationsDecision =
			new MiicRecommendationsDecisionImpl();

		miicRecommendationsDecision.setNew(true);
		miicRecommendationsDecision.setPrimaryKey(
			miicRecommendationsDecisionId);

		miicRecommendationsDecision.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return miicRecommendationsDecision;
	}

	/**
	 * Removes the miic recommendations decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicRecommendationsDecisionId the primary key of the miic recommendations decision
	 * @return the miic recommendations decision that was removed
	 * @throws NoSuchMiicRecommendationsDecisionException if a miic recommendations decision with the primary key could not be found
	 */
	@Override
	public MiicRecommendationsDecision remove(
			long miicRecommendationsDecisionId)
		throws NoSuchMiicRecommendationsDecisionException {

		return remove((Serializable)miicRecommendationsDecisionId);
	}

	/**
	 * Removes the miic recommendations decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the miic recommendations decision
	 * @return the miic recommendations decision that was removed
	 * @throws NoSuchMiicRecommendationsDecisionException if a miic recommendations decision with the primary key could not be found
	 */
	@Override
	public MiicRecommendationsDecision remove(Serializable primaryKey)
		throws NoSuchMiicRecommendationsDecisionException {

		Session session = null;

		try {
			session = openSession();

			MiicRecommendationsDecision miicRecommendationsDecision =
				(MiicRecommendationsDecision)session.get(
					MiicRecommendationsDecisionImpl.class, primaryKey);

			if (miicRecommendationsDecision == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiicRecommendationsDecisionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miicRecommendationsDecision);
		}
		catch (NoSuchMiicRecommendationsDecisionException
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
	protected MiicRecommendationsDecision removeImpl(
		MiicRecommendationsDecision miicRecommendationsDecision) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miicRecommendationsDecision)) {
				miicRecommendationsDecision =
					(MiicRecommendationsDecision)session.get(
						MiicRecommendationsDecisionImpl.class,
						miicRecommendationsDecision.getPrimaryKeyObj());
			}

			if (miicRecommendationsDecision != null) {
				session.delete(miicRecommendationsDecision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miicRecommendationsDecision != null) {
			clearCache(miicRecommendationsDecision);
		}

		return miicRecommendationsDecision;
	}

	@Override
	public MiicRecommendationsDecision updateImpl(
		MiicRecommendationsDecision miicRecommendationsDecision) {

		boolean isNew = miicRecommendationsDecision.isNew();

		if (!(miicRecommendationsDecision instanceof
				MiicRecommendationsDecisionModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					miicRecommendationsDecision.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					miicRecommendationsDecision);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miicRecommendationsDecision proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiicRecommendationsDecision implementation " +
					miicRecommendationsDecision.getClass());
		}

		MiicRecommendationsDecisionModelImpl
			miicRecommendationsDecisionModelImpl =
				(MiicRecommendationsDecisionModelImpl)
					miicRecommendationsDecision;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (miicRecommendationsDecision.getCreateDate() == null)) {
			if (serviceContext == null) {
				miicRecommendationsDecision.setCreateDate(date);
			}
			else {
				miicRecommendationsDecision.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!miicRecommendationsDecisionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				miicRecommendationsDecision.setModifiedDate(date);
			}
			else {
				miicRecommendationsDecision.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miicRecommendationsDecision);
			}
			else {
				miicRecommendationsDecision =
					(MiicRecommendationsDecision)session.merge(
						miicRecommendationsDecision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MiicRecommendationsDecisionImpl.class,
			miicRecommendationsDecisionModelImpl, false, true);

		cacheUniqueFindersCache(miicRecommendationsDecisionModelImpl);

		if (isNew) {
			miicRecommendationsDecision.setNew(false);
		}

		miicRecommendationsDecision.resetOriginalValues();

		return miicRecommendationsDecision;
	}

	/**
	 * Returns the miic recommendations decision with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the miic recommendations decision
	 * @return the miic recommendations decision
	 * @throws NoSuchMiicRecommendationsDecisionException if a miic recommendations decision with the primary key could not be found
	 */
	@Override
	public MiicRecommendationsDecision findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMiicRecommendationsDecisionException {

		MiicRecommendationsDecision miicRecommendationsDecision =
			fetchByPrimaryKey(primaryKey);

		if (miicRecommendationsDecision == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiicRecommendationsDecisionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miicRecommendationsDecision;
	}

	/**
	 * Returns the miic recommendations decision with the primary key or throws a <code>NoSuchMiicRecommendationsDecisionException</code> if it could not be found.
	 *
	 * @param miicRecommendationsDecisionId the primary key of the miic recommendations decision
	 * @return the miic recommendations decision
	 * @throws NoSuchMiicRecommendationsDecisionException if a miic recommendations decision with the primary key could not be found
	 */
	@Override
	public MiicRecommendationsDecision findByPrimaryKey(
			long miicRecommendationsDecisionId)
		throws NoSuchMiicRecommendationsDecisionException {

		return findByPrimaryKey((Serializable)miicRecommendationsDecisionId);
	}

	/**
	 * Returns the miic recommendations decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicRecommendationsDecisionId the primary key of the miic recommendations decision
	 * @return the miic recommendations decision, or <code>null</code> if a miic recommendations decision with the primary key could not be found
	 */
	@Override
	public MiicRecommendationsDecision fetchByPrimaryKey(
		long miicRecommendationsDecisionId) {

		return fetchByPrimaryKey((Serializable)miicRecommendationsDecisionId);
	}

	/**
	 * Returns all the miic recommendations decisions.
	 *
	 * @return the miic recommendations decisions
	 */
	@Override
	public List<MiicRecommendationsDecision> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic recommendations decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicRecommendationsDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic recommendations decisions
	 * @param end the upper bound of the range of miic recommendations decisions (not inclusive)
	 * @return the range of miic recommendations decisions
	 */
	@Override
	public List<MiicRecommendationsDecision> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic recommendations decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicRecommendationsDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic recommendations decisions
	 * @param end the upper bound of the range of miic recommendations decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic recommendations decisions
	 */
	@Override
	public List<MiicRecommendationsDecision> findAll(
		int start, int end,
		OrderByComparator<MiicRecommendationsDecision> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic recommendations decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicRecommendationsDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic recommendations decisions
	 * @param end the upper bound of the range of miic recommendations decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic recommendations decisions
	 */
	@Override
	public List<MiicRecommendationsDecision> findAll(
		int start, int end,
		OrderByComparator<MiicRecommendationsDecision> orderByComparator,
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

		List<MiicRecommendationsDecision> list = null;

		if (useFinderCache) {
			list = (List<MiicRecommendationsDecision>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MIICRECOMMENDATIONSDECISION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MIICRECOMMENDATIONSDECISION;

				sql = sql.concat(
					MiicRecommendationsDecisionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MiicRecommendationsDecision>)QueryUtil.list(
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
	 * Removes all the miic recommendations decisions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiicRecommendationsDecision miicRecommendationsDecision :
				findAll()) {

			remove(miicRecommendationsDecision);
		}
	}

	/**
	 * Returns the number of miic recommendations decisions.
	 *
	 * @return the number of miic recommendations decisions
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
					_SQL_COUNT_MIICRECOMMENDATIONSDECISION);

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
		return "miicRecommendationsDecisionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MIICRECOMMENDATIONSDECISION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiicRecommendationsDecisionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the miic recommendations decision persistence.
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

		_finderPathFetchBygetMiic_RD_by_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMiic_RD_by_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetMiic_RD_by_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMiic_RD_by_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		MiicRecommendationsDecisionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiicRecommendationsDecisionUtil.setPersistence(null);

		entityCache.removeCache(
			MiicRecommendationsDecisionImpl.class.getName());
	}

	@Override
	@Reference(
		target = MIIC_APPLICATION_STAGEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MIIC_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MIIC_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MIICRECOMMENDATIONSDECISION =
		"SELECT miicRecommendationsDecision FROM MiicRecommendationsDecision miicRecommendationsDecision";

	private static final String _SQL_SELECT_MIICRECOMMENDATIONSDECISION_WHERE =
		"SELECT miicRecommendationsDecision FROM MiicRecommendationsDecision miicRecommendationsDecision WHERE ";

	private static final String _SQL_COUNT_MIICRECOMMENDATIONSDECISION =
		"SELECT COUNT(miicRecommendationsDecision) FROM MiicRecommendationsDecision miicRecommendationsDecision";

	private static final String _SQL_COUNT_MIICRECOMMENDATIONSDECISION_WHERE =
		"SELECT COUNT(miicRecommendationsDecision) FROM MiicRecommendationsDecision miicRecommendationsDecision WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"miicRecommendationsDecision.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiicRecommendationsDecision exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MiicRecommendationsDecision exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MiicRecommendationsDecisionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}