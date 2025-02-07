/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service.persistence.impl;

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

import com.nbp.janaac.stages.services.exception.NoSuchJanaacCommitteeDecisionException;
import com.nbp.janaac.stages.services.model.JanaacCommitteeDecision;
import com.nbp.janaac.stages.services.model.JanaacCommitteeDecisionTable;
import com.nbp.janaac.stages.services.model.impl.JanaacCommitteeDecisionImpl;
import com.nbp.janaac.stages.services.model.impl.JanaacCommitteeDecisionModelImpl;
import com.nbp.janaac.stages.services.service.persistence.JanaacCommitteeDecisionPersistence;
import com.nbp.janaac.stages.services.service.persistence.JanaacCommitteeDecisionUtil;
import com.nbp.janaac.stages.services.service.persistence.impl.constants.JANAAC_STAGESPersistenceConstants;

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
 * The persistence implementation for the janaac committee decision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JanaacCommitteeDecisionPersistence.class)
public class JanaacCommitteeDecisionPersistenceImpl
	extends BasePersistenceImpl<JanaacCommitteeDecision>
	implements JanaacCommitteeDecisionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JanaacCommitteeDecisionUtil</code> to access the janaac committee decision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JanaacCommitteeDecisionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJanaac_by_caseId;
	private FinderPath _finderPathCountBygetJanaac_by_caseId;

	/**
	 * Returns the janaac committee decision where caseId = &#63; or throws a <code>NoSuchJanaacCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac committee decision
	 * @throws NoSuchJanaacCommitteeDecisionException if a matching janaac committee decision could not be found
	 */
	@Override
	public JanaacCommitteeDecision findBygetJanaac_by_caseId(String caseId)
		throws NoSuchJanaacCommitteeDecisionException {

		JanaacCommitteeDecision janaacCommitteeDecision =
			fetchBygetJanaac_by_caseId(caseId);

		if (janaacCommitteeDecision == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJanaacCommitteeDecisionException(sb.toString());
		}

		return janaacCommitteeDecision;
	}

	/**
	 * Returns the janaac committee decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac committee decision, or <code>null</code> if a matching janaac committee decision could not be found
	 */
	@Override
	public JanaacCommitteeDecision fetchBygetJanaac_by_caseId(String caseId) {
		return fetchBygetJanaac_by_caseId(caseId, true);
	}

	/**
	 * Returns the janaac committee decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac committee decision, or <code>null</code> if a matching janaac committee decision could not be found
	 */
	@Override
	public JanaacCommitteeDecision fetchBygetJanaac_by_caseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJanaac_by_caseId, finderArgs, this);
		}

		if (result instanceof JanaacCommitteeDecision) {
			JanaacCommitteeDecision janaacCommitteeDecision =
				(JanaacCommitteeDecision)result;

			if (!Objects.equals(caseId, janaacCommitteeDecision.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JANAACCOMMITTEEDECISION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_2);
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

				List<JanaacCommitteeDecision> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJanaac_by_caseId, finderArgs,
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
								"JanaacCommitteeDecisionPersistenceImpl.fetchBygetJanaac_by_caseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JanaacCommitteeDecision janaacCommitteeDecision = list.get(
						0);

					result = janaacCommitteeDecision;

					cacheResult(janaacCommitteeDecision);
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
			return (JanaacCommitteeDecision)result;
		}
	}

	/**
	 * Removes the janaac committee decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the janaac committee decision that was removed
	 */
	@Override
	public JanaacCommitteeDecision removeBygetJanaac_by_caseId(String caseId)
		throws NoSuchJanaacCommitteeDecisionException {

		JanaacCommitteeDecision janaacCommitteeDecision =
			findBygetJanaac_by_caseId(caseId);

		return remove(janaacCommitteeDecision);
	}

	/**
	 * Returns the number of janaac committee decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac committee decisions
	 */
	@Override
	public int countBygetJanaac_by_caseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJanaac_by_caseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JANAACCOMMITTEEDECISION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_2 =
		"janaacCommitteeDecision.caseId = ?";

	private static final String _FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_3 =
		"(janaacCommitteeDecision.caseId IS NULL OR janaacCommitteeDecision.caseId = '')";

	public JanaacCommitteeDecisionPersistenceImpl() {
		setModelClass(JanaacCommitteeDecision.class);

		setModelImplClass(JanaacCommitteeDecisionImpl.class);
		setModelPKClass(long.class);

		setTable(JanaacCommitteeDecisionTable.INSTANCE);
	}

	/**
	 * Caches the janaac committee decision in the entity cache if it is enabled.
	 *
	 * @param janaacCommitteeDecision the janaac committee decision
	 */
	@Override
	public void cacheResult(JanaacCommitteeDecision janaacCommitteeDecision) {
		entityCache.putResult(
			JanaacCommitteeDecisionImpl.class,
			janaacCommitteeDecision.getPrimaryKey(), janaacCommitteeDecision);

		finderCache.putResult(
			_finderPathFetchBygetJanaac_by_caseId,
			new Object[] {janaacCommitteeDecision.getCaseId()},
			janaacCommitteeDecision);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the janaac committee decisions in the entity cache if it is enabled.
	 *
	 * @param janaacCommitteeDecisions the janaac committee decisions
	 */
	@Override
	public void cacheResult(
		List<JanaacCommitteeDecision> janaacCommitteeDecisions) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (janaacCommitteeDecisions.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JanaacCommitteeDecision janaacCommitteeDecision :
				janaacCommitteeDecisions) {

			if (entityCache.getResult(
					JanaacCommitteeDecisionImpl.class,
					janaacCommitteeDecision.getPrimaryKey()) == null) {

				cacheResult(janaacCommitteeDecision);
			}
		}
	}

	/**
	 * Clears the cache for all janaac committee decisions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JanaacCommitteeDecisionImpl.class);

		finderCache.clearCache(JanaacCommitteeDecisionImpl.class);
	}

	/**
	 * Clears the cache for the janaac committee decision.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JanaacCommitteeDecision janaacCommitteeDecision) {
		entityCache.removeResult(
			JanaacCommitteeDecisionImpl.class, janaacCommitteeDecision);
	}

	@Override
	public void clearCache(
		List<JanaacCommitteeDecision> janaacCommitteeDecisions) {

		for (JanaacCommitteeDecision janaacCommitteeDecision :
				janaacCommitteeDecisions) {

			entityCache.removeResult(
				JanaacCommitteeDecisionImpl.class, janaacCommitteeDecision);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JanaacCommitteeDecisionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JanaacCommitteeDecisionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JanaacCommitteeDecisionModelImpl janaacCommitteeDecisionModelImpl) {

		Object[] args = new Object[] {
			janaacCommitteeDecisionModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetJanaac_by_caseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJanaac_by_caseId, args,
			janaacCommitteeDecisionModelImpl);
	}

	/**
	 * Creates a new janaac committee decision with the primary key. Does not add the janaac committee decision to the database.
	 *
	 * @param janaacCommitteeDecisionId the primary key for the new janaac committee decision
	 * @return the new janaac committee decision
	 */
	@Override
	public JanaacCommitteeDecision create(long janaacCommitteeDecisionId) {
		JanaacCommitteeDecision janaacCommitteeDecision =
			new JanaacCommitteeDecisionImpl();

		janaacCommitteeDecision.setNew(true);
		janaacCommitteeDecision.setPrimaryKey(janaacCommitteeDecisionId);

		janaacCommitteeDecision.setCompanyId(CompanyThreadLocal.getCompanyId());

		return janaacCommitteeDecision;
	}

	/**
	 * Removes the janaac committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacCommitteeDecisionId the primary key of the janaac committee decision
	 * @return the janaac committee decision that was removed
	 * @throws NoSuchJanaacCommitteeDecisionException if a janaac committee decision with the primary key could not be found
	 */
	@Override
	public JanaacCommitteeDecision remove(long janaacCommitteeDecisionId)
		throws NoSuchJanaacCommitteeDecisionException {

		return remove((Serializable)janaacCommitteeDecisionId);
	}

	/**
	 * Removes the janaac committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the janaac committee decision
	 * @return the janaac committee decision that was removed
	 * @throws NoSuchJanaacCommitteeDecisionException if a janaac committee decision with the primary key could not be found
	 */
	@Override
	public JanaacCommitteeDecision remove(Serializable primaryKey)
		throws NoSuchJanaacCommitteeDecisionException {

		Session session = null;

		try {
			session = openSession();

			JanaacCommitteeDecision janaacCommitteeDecision =
				(JanaacCommitteeDecision)session.get(
					JanaacCommitteeDecisionImpl.class, primaryKey);

			if (janaacCommitteeDecision == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJanaacCommitteeDecisionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(janaacCommitteeDecision);
		}
		catch (NoSuchJanaacCommitteeDecisionException noSuchEntityException) {
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
	protected JanaacCommitteeDecision removeImpl(
		JanaacCommitteeDecision janaacCommitteeDecision) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(janaacCommitteeDecision)) {
				janaacCommitteeDecision = (JanaacCommitteeDecision)session.get(
					JanaacCommitteeDecisionImpl.class,
					janaacCommitteeDecision.getPrimaryKeyObj());
			}

			if (janaacCommitteeDecision != null) {
				session.delete(janaacCommitteeDecision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (janaacCommitteeDecision != null) {
			clearCache(janaacCommitteeDecision);
		}

		return janaacCommitteeDecision;
	}

	@Override
	public JanaacCommitteeDecision updateImpl(
		JanaacCommitteeDecision janaacCommitteeDecision) {

		boolean isNew = janaacCommitteeDecision.isNew();

		if (!(janaacCommitteeDecision instanceof
				JanaacCommitteeDecisionModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(janaacCommitteeDecision.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					janaacCommitteeDecision);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in janaacCommitteeDecision proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JanaacCommitteeDecision implementation " +
					janaacCommitteeDecision.getClass());
		}

		JanaacCommitteeDecisionModelImpl janaacCommitteeDecisionModelImpl =
			(JanaacCommitteeDecisionModelImpl)janaacCommitteeDecision;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (janaacCommitteeDecision.getCreateDate() == null)) {
			if (serviceContext == null) {
				janaacCommitteeDecision.setCreateDate(date);
			}
			else {
				janaacCommitteeDecision.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!janaacCommitteeDecisionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				janaacCommitteeDecision.setModifiedDate(date);
			}
			else {
				janaacCommitteeDecision.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(janaacCommitteeDecision);
			}
			else {
				janaacCommitteeDecision =
					(JanaacCommitteeDecision)session.merge(
						janaacCommitteeDecision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JanaacCommitteeDecisionImpl.class, janaacCommitteeDecisionModelImpl,
			false, true);

		cacheUniqueFindersCache(janaacCommitteeDecisionModelImpl);

		if (isNew) {
			janaacCommitteeDecision.setNew(false);
		}

		janaacCommitteeDecision.resetOriginalValues();

		return janaacCommitteeDecision;
	}

	/**
	 * Returns the janaac committee decision with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the janaac committee decision
	 * @return the janaac committee decision
	 * @throws NoSuchJanaacCommitteeDecisionException if a janaac committee decision with the primary key could not be found
	 */
	@Override
	public JanaacCommitteeDecision findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJanaacCommitteeDecisionException {

		JanaacCommitteeDecision janaacCommitteeDecision = fetchByPrimaryKey(
			primaryKey);

		if (janaacCommitteeDecision == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJanaacCommitteeDecisionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return janaacCommitteeDecision;
	}

	/**
	 * Returns the janaac committee decision with the primary key or throws a <code>NoSuchJanaacCommitteeDecisionException</code> if it could not be found.
	 *
	 * @param janaacCommitteeDecisionId the primary key of the janaac committee decision
	 * @return the janaac committee decision
	 * @throws NoSuchJanaacCommitteeDecisionException if a janaac committee decision with the primary key could not be found
	 */
	@Override
	public JanaacCommitteeDecision findByPrimaryKey(
			long janaacCommitteeDecisionId)
		throws NoSuchJanaacCommitteeDecisionException {

		return findByPrimaryKey((Serializable)janaacCommitteeDecisionId);
	}

	/**
	 * Returns the janaac committee decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacCommitteeDecisionId the primary key of the janaac committee decision
	 * @return the janaac committee decision, or <code>null</code> if a janaac committee decision with the primary key could not be found
	 */
	@Override
	public JanaacCommitteeDecision fetchByPrimaryKey(
		long janaacCommitteeDecisionId) {

		return fetchByPrimaryKey((Serializable)janaacCommitteeDecisionId);
	}

	/**
	 * Returns all the janaac committee decisions.
	 *
	 * @return the janaac committee decisions
	 */
	@Override
	public List<JanaacCommitteeDecision> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the janaac committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac committee decisions
	 * @param end the upper bound of the range of janaac committee decisions (not inclusive)
	 * @return the range of janaac committee decisions
	 */
	@Override
	public List<JanaacCommitteeDecision> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the janaac committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac committee decisions
	 * @param end the upper bound of the range of janaac committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac committee decisions
	 */
	@Override
	public List<JanaacCommitteeDecision> findAll(
		int start, int end,
		OrderByComparator<JanaacCommitteeDecision> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the janaac committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac committee decisions
	 * @param end the upper bound of the range of janaac committee decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac committee decisions
	 */
	@Override
	public List<JanaacCommitteeDecision> findAll(
		int start, int end,
		OrderByComparator<JanaacCommitteeDecision> orderByComparator,
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

		List<JanaacCommitteeDecision> list = null;

		if (useFinderCache) {
			list = (List<JanaacCommitteeDecision>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JANAACCOMMITTEEDECISION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JANAACCOMMITTEEDECISION;

				sql = sql.concat(
					JanaacCommitteeDecisionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JanaacCommitteeDecision>)QueryUtil.list(
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
	 * Removes all the janaac committee decisions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JanaacCommitteeDecision janaacCommitteeDecision : findAll()) {
			remove(janaacCommitteeDecision);
		}
	}

	/**
	 * Returns the number of janaac committee decisions.
	 *
	 * @return the number of janaac committee decisions
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
					_SQL_COUNT_JANAACCOMMITTEEDECISION);

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
		return "janaacCommitteeDecisionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JANAACCOMMITTEEDECISION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JanaacCommitteeDecisionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the janaac committee decision persistence.
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

		_finderPathFetchBygetJanaac_by_caseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJanaac_by_caseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetJanaac_by_caseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJanaac_by_caseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		JanaacCommitteeDecisionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JanaacCommitteeDecisionUtil.setPersistence(null);

		entityCache.removeCache(JanaacCommitteeDecisionImpl.class.getName());
	}

	@Override
	@Reference(
		target = JANAAC_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JANAAC_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JANAAC_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JANAACCOMMITTEEDECISION =
		"SELECT janaacCommitteeDecision FROM JanaacCommitteeDecision janaacCommitteeDecision";

	private static final String _SQL_SELECT_JANAACCOMMITTEEDECISION_WHERE =
		"SELECT janaacCommitteeDecision FROM JanaacCommitteeDecision janaacCommitteeDecision WHERE ";

	private static final String _SQL_COUNT_JANAACCOMMITTEEDECISION =
		"SELECT COUNT(janaacCommitteeDecision) FROM JanaacCommitteeDecision janaacCommitteeDecision";

	private static final String _SQL_COUNT_JANAACCOMMITTEEDECISION_WHERE =
		"SELECT COUNT(janaacCommitteeDecision) FROM JanaacCommitteeDecision janaacCommitteeDecision WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"janaacCommitteeDecision.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JanaacCommitteeDecision exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JanaacCommitteeDecision exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JanaacCommitteeDecisionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}