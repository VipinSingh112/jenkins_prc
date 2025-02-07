/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service.persistence.impl;

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

import com.nbp.ncbj.stages.services.exception.NoSuchNcbjApplicationCorrectiveActionException;
import com.nbp.ncbj.stages.services.model.NcbjApplicationCorrectiveAction;
import com.nbp.ncbj.stages.services.model.NcbjApplicationCorrectiveActionTable;
import com.nbp.ncbj.stages.services.model.impl.NcbjApplicationCorrectiveActionImpl;
import com.nbp.ncbj.stages.services.model.impl.NcbjApplicationCorrectiveActionModelImpl;
import com.nbp.ncbj.stages.services.service.persistence.NcbjApplicationCorrectiveActionPersistence;
import com.nbp.ncbj.stages.services.service.persistence.NcbjApplicationCorrectiveActionUtil;
import com.nbp.ncbj.stages.services.service.persistence.impl.constants.NCBJ_STAGESPersistenceConstants;

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
 * The persistence implementation for the ncbj application corrective action service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjApplicationCorrectiveActionPersistence.class)
public class NcbjApplicationCorrectiveActionPersistenceImpl
	extends BasePersistenceImpl<NcbjApplicationCorrectiveAction>
	implements NcbjApplicationCorrectiveActionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjApplicationCorrectiveActionUtil</code> to access the ncbj application corrective action persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjApplicationCorrectiveActionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetPreAPprovalConditionBy_CI;
	private FinderPath _finderPathCountBygetPreAPprovalConditionBy_CI;

	/**
	 * Returns the ncbj application corrective action where caseId = &#63; or throws a <code>NoSuchNcbjApplicationCorrectiveActionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj application corrective action
	 * @throws NoSuchNcbjApplicationCorrectiveActionException if a matching ncbj application corrective action could not be found
	 */
	@Override
	public NcbjApplicationCorrectiveAction findBygetPreAPprovalConditionBy_CI(
			String caseId)
		throws NoSuchNcbjApplicationCorrectiveActionException {

		NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction =
			fetchBygetPreAPprovalConditionBy_CI(caseId);

		if (ncbjApplicationCorrectiveAction == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjApplicationCorrectiveActionException(
				sb.toString());
		}

		return ncbjApplicationCorrectiveAction;
	}

	/**
	 * Returns the ncbj application corrective action where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj application corrective action, or <code>null</code> if a matching ncbj application corrective action could not be found
	 */
	@Override
	public NcbjApplicationCorrectiveAction fetchBygetPreAPprovalConditionBy_CI(
		String caseId) {

		return fetchBygetPreAPprovalConditionBy_CI(caseId, true);
	}

	/**
	 * Returns the ncbj application corrective action where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application corrective action, or <code>null</code> if a matching ncbj application corrective action could not be found
	 */
	@Override
	public NcbjApplicationCorrectiveAction fetchBygetPreAPprovalConditionBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetPreAPprovalConditionBy_CI, finderArgs,
				this);
		}

		if (result instanceof NcbjApplicationCorrectiveAction) {
			NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction =
				(NcbjApplicationCorrectiveAction)result;

			if (!Objects.equals(
					caseId, ncbjApplicationCorrectiveAction.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJAPPLICATIONCORRECTIVEACTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPREAPPROVALCONDITIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPREAPPROVALCONDITIONBY_CI_CASEID_2);
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

				List<NcbjApplicationCorrectiveAction> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetPreAPprovalConditionBy_CI,
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
								"NcbjApplicationCorrectiveActionPersistenceImpl.fetchBygetPreAPprovalConditionBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjApplicationCorrectiveAction
						ncbjApplicationCorrectiveAction = list.get(0);

					result = ncbjApplicationCorrectiveAction;

					cacheResult(ncbjApplicationCorrectiveAction);
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
			return (NcbjApplicationCorrectiveAction)result;
		}
	}

	/**
	 * Removes the ncbj application corrective action where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncbj application corrective action that was removed
	 */
	@Override
	public NcbjApplicationCorrectiveAction removeBygetPreAPprovalConditionBy_CI(
			String caseId)
		throws NoSuchNcbjApplicationCorrectiveActionException {

		NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction =
			findBygetPreAPprovalConditionBy_CI(caseId);

		return remove(ncbjApplicationCorrectiveAction);
	}

	/**
	 * Returns the number of ncbj application corrective actions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj application corrective actions
	 */
	@Override
	public int countBygetPreAPprovalConditionBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetPreAPprovalConditionBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJAPPLICATIONCORRECTIVEACTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPREAPPROVALCONDITIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPREAPPROVALCONDITIONBY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETPREAPPROVALCONDITIONBY_CI_CASEID_2 =
			"ncbjApplicationCorrectiveAction.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETPREAPPROVALCONDITIONBY_CI_CASEID_3 =
			"(ncbjApplicationCorrectiveAction.caseId IS NULL OR ncbjApplicationCorrectiveAction.caseId = '')";

	public NcbjApplicationCorrectiveActionPersistenceImpl() {
		setModelClass(NcbjApplicationCorrectiveAction.class);

		setModelImplClass(NcbjApplicationCorrectiveActionImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjApplicationCorrectiveActionTable.INSTANCE);
	}

	/**
	 * Caches the ncbj application corrective action in the entity cache if it is enabled.
	 *
	 * @param ncbjApplicationCorrectiveAction the ncbj application corrective action
	 */
	@Override
	public void cacheResult(
		NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction) {

		entityCache.putResult(
			NcbjApplicationCorrectiveActionImpl.class,
			ncbjApplicationCorrectiveAction.getPrimaryKey(),
			ncbjApplicationCorrectiveAction);

		finderCache.putResult(
			_finderPathFetchBygetPreAPprovalConditionBy_CI,
			new Object[] {ncbjApplicationCorrectiveAction.getCaseId()},
			ncbjApplicationCorrectiveAction);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj application corrective actions in the entity cache if it is enabled.
	 *
	 * @param ncbjApplicationCorrectiveActions the ncbj application corrective actions
	 */
	@Override
	public void cacheResult(
		List<NcbjApplicationCorrectiveAction>
			ncbjApplicationCorrectiveActions) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjApplicationCorrectiveActions.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction :
				ncbjApplicationCorrectiveActions) {

			if (entityCache.getResult(
					NcbjApplicationCorrectiveActionImpl.class,
					ncbjApplicationCorrectiveAction.getPrimaryKey()) == null) {

				cacheResult(ncbjApplicationCorrectiveAction);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj application corrective actions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjApplicationCorrectiveActionImpl.class);

		finderCache.clearCache(NcbjApplicationCorrectiveActionImpl.class);
	}

	/**
	 * Clears the cache for the ncbj application corrective action.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction) {

		entityCache.removeResult(
			NcbjApplicationCorrectiveActionImpl.class,
			ncbjApplicationCorrectiveAction);
	}

	@Override
	public void clearCache(
		List<NcbjApplicationCorrectiveAction>
			ncbjApplicationCorrectiveActions) {

		for (NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction :
				ncbjApplicationCorrectiveActions) {

			entityCache.removeResult(
				NcbjApplicationCorrectiveActionImpl.class,
				ncbjApplicationCorrectiveAction);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjApplicationCorrectiveActionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				NcbjApplicationCorrectiveActionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjApplicationCorrectiveActionModelImpl
			ncbjApplicationCorrectiveActionModelImpl) {

		Object[] args = new Object[] {
			ncbjApplicationCorrectiveActionModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetPreAPprovalConditionBy_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetPreAPprovalConditionBy_CI, args,
			ncbjApplicationCorrectiveActionModelImpl);
	}

	/**
	 * Creates a new ncbj application corrective action with the primary key. Does not add the ncbj application corrective action to the database.
	 *
	 * @param ncbjAppCorrActionId the primary key for the new ncbj application corrective action
	 * @return the new ncbj application corrective action
	 */
	@Override
	public NcbjApplicationCorrectiveAction create(long ncbjAppCorrActionId) {
		NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction =
			new NcbjApplicationCorrectiveActionImpl();

		ncbjApplicationCorrectiveAction.setNew(true);
		ncbjApplicationCorrectiveAction.setPrimaryKey(ncbjAppCorrActionId);

		ncbjApplicationCorrectiveAction.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return ncbjApplicationCorrectiveAction;
	}

	/**
	 * Removes the ncbj application corrective action with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjAppCorrActionId the primary key of the ncbj application corrective action
	 * @return the ncbj application corrective action that was removed
	 * @throws NoSuchNcbjApplicationCorrectiveActionException if a ncbj application corrective action with the primary key could not be found
	 */
	@Override
	public NcbjApplicationCorrectiveAction remove(long ncbjAppCorrActionId)
		throws NoSuchNcbjApplicationCorrectiveActionException {

		return remove((Serializable)ncbjAppCorrActionId);
	}

	/**
	 * Removes the ncbj application corrective action with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj application corrective action
	 * @return the ncbj application corrective action that was removed
	 * @throws NoSuchNcbjApplicationCorrectiveActionException if a ncbj application corrective action with the primary key could not be found
	 */
	@Override
	public NcbjApplicationCorrectiveAction remove(Serializable primaryKey)
		throws NoSuchNcbjApplicationCorrectiveActionException {

		Session session = null;

		try {
			session = openSession();

			NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction =
				(NcbjApplicationCorrectiveAction)session.get(
					NcbjApplicationCorrectiveActionImpl.class, primaryKey);

			if (ncbjApplicationCorrectiveAction == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjApplicationCorrectiveActionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjApplicationCorrectiveAction);
		}
		catch (NoSuchNcbjApplicationCorrectiveActionException
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
	protected NcbjApplicationCorrectiveAction removeImpl(
		NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjApplicationCorrectiveAction)) {
				ncbjApplicationCorrectiveAction =
					(NcbjApplicationCorrectiveAction)session.get(
						NcbjApplicationCorrectiveActionImpl.class,
						ncbjApplicationCorrectiveAction.getPrimaryKeyObj());
			}

			if (ncbjApplicationCorrectiveAction != null) {
				session.delete(ncbjApplicationCorrectiveAction);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjApplicationCorrectiveAction != null) {
			clearCache(ncbjApplicationCorrectiveAction);
		}

		return ncbjApplicationCorrectiveAction;
	}

	@Override
	public NcbjApplicationCorrectiveAction updateImpl(
		NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction) {

		boolean isNew = ncbjApplicationCorrectiveAction.isNew();

		if (!(ncbjApplicationCorrectiveAction instanceof
				NcbjApplicationCorrectiveActionModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					ncbjApplicationCorrectiveAction.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjApplicationCorrectiveAction);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjApplicationCorrectiveAction proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjApplicationCorrectiveAction implementation " +
					ncbjApplicationCorrectiveAction.getClass());
		}

		NcbjApplicationCorrectiveActionModelImpl
			ncbjApplicationCorrectiveActionModelImpl =
				(NcbjApplicationCorrectiveActionModelImpl)
					ncbjApplicationCorrectiveAction;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(ncbjApplicationCorrectiveAction.getCreateDate() == null)) {

			if (serviceContext == null) {
				ncbjApplicationCorrectiveAction.setCreateDate(date);
			}
			else {
				ncbjApplicationCorrectiveAction.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjApplicationCorrectiveActionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjApplicationCorrectiveAction.setModifiedDate(date);
			}
			else {
				ncbjApplicationCorrectiveAction.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjApplicationCorrectiveAction);
			}
			else {
				ncbjApplicationCorrectiveAction =
					(NcbjApplicationCorrectiveAction)session.merge(
						ncbjApplicationCorrectiveAction);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjApplicationCorrectiveActionImpl.class,
			ncbjApplicationCorrectiveActionModelImpl, false, true);

		cacheUniqueFindersCache(ncbjApplicationCorrectiveActionModelImpl);

		if (isNew) {
			ncbjApplicationCorrectiveAction.setNew(false);
		}

		ncbjApplicationCorrectiveAction.resetOriginalValues();

		return ncbjApplicationCorrectiveAction;
	}

	/**
	 * Returns the ncbj application corrective action with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj application corrective action
	 * @return the ncbj application corrective action
	 * @throws NoSuchNcbjApplicationCorrectiveActionException if a ncbj application corrective action with the primary key could not be found
	 */
	@Override
	public NcbjApplicationCorrectiveAction findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchNcbjApplicationCorrectiveActionException {

		NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction =
			fetchByPrimaryKey(primaryKey);

		if (ncbjApplicationCorrectiveAction == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjApplicationCorrectiveActionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjApplicationCorrectiveAction;
	}

	/**
	 * Returns the ncbj application corrective action with the primary key or throws a <code>NoSuchNcbjApplicationCorrectiveActionException</code> if it could not be found.
	 *
	 * @param ncbjAppCorrActionId the primary key of the ncbj application corrective action
	 * @return the ncbj application corrective action
	 * @throws NoSuchNcbjApplicationCorrectiveActionException if a ncbj application corrective action with the primary key could not be found
	 */
	@Override
	public NcbjApplicationCorrectiveAction findByPrimaryKey(
			long ncbjAppCorrActionId)
		throws NoSuchNcbjApplicationCorrectiveActionException {

		return findByPrimaryKey((Serializable)ncbjAppCorrActionId);
	}

	/**
	 * Returns the ncbj application corrective action with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjAppCorrActionId the primary key of the ncbj application corrective action
	 * @return the ncbj application corrective action, or <code>null</code> if a ncbj application corrective action with the primary key could not be found
	 */
	@Override
	public NcbjApplicationCorrectiveAction fetchByPrimaryKey(
		long ncbjAppCorrActionId) {

		return fetchByPrimaryKey((Serializable)ncbjAppCorrActionId);
	}

	/**
	 * Returns all the ncbj application corrective actions.
	 *
	 * @return the ncbj application corrective actions
	 */
	@Override
	public List<NcbjApplicationCorrectiveAction> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj application corrective actions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationCorrectiveActionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application corrective actions
	 * @param end the upper bound of the range of ncbj application corrective actions (not inclusive)
	 * @return the range of ncbj application corrective actions
	 */
	@Override
	public List<NcbjApplicationCorrectiveAction> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj application corrective actions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationCorrectiveActionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application corrective actions
	 * @param end the upper bound of the range of ncbj application corrective actions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj application corrective actions
	 */
	@Override
	public List<NcbjApplicationCorrectiveAction> findAll(
		int start, int end,
		OrderByComparator<NcbjApplicationCorrectiveAction> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj application corrective actions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationCorrectiveActionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application corrective actions
	 * @param end the upper bound of the range of ncbj application corrective actions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj application corrective actions
	 */
	@Override
	public List<NcbjApplicationCorrectiveAction> findAll(
		int start, int end,
		OrderByComparator<NcbjApplicationCorrectiveAction> orderByComparator,
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

		List<NcbjApplicationCorrectiveAction> list = null;

		if (useFinderCache) {
			list = (List<NcbjApplicationCorrectiveAction>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJAPPLICATIONCORRECTIVEACTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJAPPLICATIONCORRECTIVEACTION;

				sql = sql.concat(
					NcbjApplicationCorrectiveActionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjApplicationCorrectiveAction>)QueryUtil.list(
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
	 * Removes all the ncbj application corrective actions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction :
				findAll()) {

			remove(ncbjApplicationCorrectiveAction);
		}
	}

	/**
	 * Returns the number of ncbj application corrective actions.
	 *
	 * @return the number of ncbj application corrective actions
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
					_SQL_COUNT_NCBJAPPLICATIONCORRECTIVEACTION);

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
		return "ncbjAppCorrActionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJAPPLICATIONCORRECTIVEACTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjApplicationCorrectiveActionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj application corrective action persistence.
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

		_finderPathFetchBygetPreAPprovalConditionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetPreAPprovalConditionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetPreAPprovalConditionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPreAPprovalConditionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		NcbjApplicationCorrectiveActionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjApplicationCorrectiveActionUtil.setPersistence(null);

		entityCache.removeCache(
			NcbjApplicationCorrectiveActionImpl.class.getName());
	}

	@Override
	@Reference(
		target = NCBJ_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NCBJ_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NCBJ_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCBJAPPLICATIONCORRECTIVEACTION =
		"SELECT ncbjApplicationCorrectiveAction FROM NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction";

	private static final String
		_SQL_SELECT_NCBJAPPLICATIONCORRECTIVEACTION_WHERE =
			"SELECT ncbjApplicationCorrectiveAction FROM NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction WHERE ";

	private static final String _SQL_COUNT_NCBJAPPLICATIONCORRECTIVEACTION =
		"SELECT COUNT(ncbjApplicationCorrectiveAction) FROM NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction";

	private static final String
		_SQL_COUNT_NCBJAPPLICATIONCORRECTIVEACTION_WHERE =
			"SELECT COUNT(ncbjApplicationCorrectiveAction) FROM NcbjApplicationCorrectiveAction ncbjApplicationCorrectiveAction WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"ncbjApplicationCorrectiveAction.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjApplicationCorrectiveAction exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjApplicationCorrectiveAction exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjApplicationCorrectiveActionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}