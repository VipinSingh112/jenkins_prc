/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence.impl;

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

import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusPreApprovalConditionsException;
import com.nbp.sez.status.application.stage.services.model.SezStatusPreApprovalConditions;
import com.nbp.sez.status.application.stage.services.model.SezStatusPreApprovalConditionsTable;
import com.nbp.sez.status.application.stage.services.model.impl.SezStatusPreApprovalConditionsImpl;
import com.nbp.sez.status.application.stage.services.model.impl.SezStatusPreApprovalConditionsModelImpl;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusPreApprovalConditionsPersistence;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusPreApprovalConditionsUtil;
import com.nbp.sez.status.application.stage.services.service.persistence.impl.constants.SEZ_STATUS_STAGESPersistenceConstants;

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
 * The persistence implementation for the sez status pre approval conditions service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezStatusPreApprovalConditionsPersistence.class)
public class SezStatusPreApprovalConditionsPersistenceImpl
	extends BasePersistenceImpl<SezStatusPreApprovalConditions>
	implements SezStatusPreApprovalConditionsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezStatusPreApprovalConditionsUtil</code> to access the sez status pre approval conditions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezStatusPreApprovalConditionsImpl.class.getName();

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
	 * Returns the sez status pre approval conditions where caseId = &#63; or throws a <code>NoSuchSezStatusPreApprovalConditionsException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status pre approval conditions
	 * @throws NoSuchSezStatusPreApprovalConditionsException if a matching sez status pre approval conditions could not be found
	 */
	@Override
	public SezStatusPreApprovalConditions findBygetPreAPprovalConditionBy_CI(
			String caseId)
		throws NoSuchSezStatusPreApprovalConditionsException {

		SezStatusPreApprovalConditions sezStatusPreApprovalConditions =
			fetchBygetPreAPprovalConditionBy_CI(caseId);

		if (sezStatusPreApprovalConditions == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezStatusPreApprovalConditionsException(
				sb.toString());
		}

		return sezStatusPreApprovalConditions;
	}

	/**
	 * Returns the sez status pre approval conditions where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status pre approval conditions, or <code>null</code> if a matching sez status pre approval conditions could not be found
	 */
	@Override
	public SezStatusPreApprovalConditions fetchBygetPreAPprovalConditionBy_CI(
		String caseId) {

		return fetchBygetPreAPprovalConditionBy_CI(caseId, true);
	}

	/**
	 * Returns the sez status pre approval conditions where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status pre approval conditions, or <code>null</code> if a matching sez status pre approval conditions could not be found
	 */
	@Override
	public SezStatusPreApprovalConditions fetchBygetPreAPprovalConditionBy_CI(
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

		if (result instanceof SezStatusPreApprovalConditions) {
			SezStatusPreApprovalConditions sezStatusPreApprovalConditions =
				(SezStatusPreApprovalConditions)result;

			if (!Objects.equals(
					caseId, sezStatusPreApprovalConditions.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZSTATUSPREAPPROVALCONDITIONS_WHERE);

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

				List<SezStatusPreApprovalConditions> list = query.list();

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
								"SezStatusPreApprovalConditionsPersistenceImpl.fetchBygetPreAPprovalConditionBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezStatusPreApprovalConditions
						sezStatusPreApprovalConditions = list.get(0);

					result = sezStatusPreApprovalConditions;

					cacheResult(sezStatusPreApprovalConditions);
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
			return (SezStatusPreApprovalConditions)result;
		}
	}

	/**
	 * Removes the sez status pre approval conditions where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status pre approval conditions that was removed
	 */
	@Override
	public SezStatusPreApprovalConditions removeBygetPreAPprovalConditionBy_CI(
			String caseId)
		throws NoSuchSezStatusPreApprovalConditionsException {

		SezStatusPreApprovalConditions sezStatusPreApprovalConditions =
			findBygetPreAPprovalConditionBy_CI(caseId);

		return remove(sezStatusPreApprovalConditions);
	}

	/**
	 * Returns the number of sez status pre approval conditionses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status pre approval conditionses
	 */
	@Override
	public int countBygetPreAPprovalConditionBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetPreAPprovalConditionBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSPREAPPROVALCONDITIONS_WHERE);

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
			"sezStatusPreApprovalConditions.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETPREAPPROVALCONDITIONBY_CI_CASEID_3 =
			"(sezStatusPreApprovalConditions.caseId IS NULL OR sezStatusPreApprovalConditions.caseId = '')";

	public SezStatusPreApprovalConditionsPersistenceImpl() {
		setModelClass(SezStatusPreApprovalConditions.class);

		setModelImplClass(SezStatusPreApprovalConditionsImpl.class);
		setModelPKClass(long.class);

		setTable(SezStatusPreApprovalConditionsTable.INSTANCE);
	}

	/**
	 * Caches the sez status pre approval conditions in the entity cache if it is enabled.
	 *
	 * @param sezStatusPreApprovalConditions the sez status pre approval conditions
	 */
	@Override
	public void cacheResult(
		SezStatusPreApprovalConditions sezStatusPreApprovalConditions) {

		entityCache.putResult(
			SezStatusPreApprovalConditionsImpl.class,
			sezStatusPreApprovalConditions.getPrimaryKey(),
			sezStatusPreApprovalConditions);

		finderCache.putResult(
			_finderPathFetchBygetPreAPprovalConditionBy_CI,
			new Object[] {sezStatusPreApprovalConditions.getCaseId()},
			sezStatusPreApprovalConditions);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez status pre approval conditionses in the entity cache if it is enabled.
	 *
	 * @param sezStatusPreApprovalConditionses the sez status pre approval conditionses
	 */
	@Override
	public void cacheResult(
		List<SezStatusPreApprovalConditions> sezStatusPreApprovalConditionses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezStatusPreApprovalConditionses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezStatusPreApprovalConditions sezStatusPreApprovalConditions :
				sezStatusPreApprovalConditionses) {

			if (entityCache.getResult(
					SezStatusPreApprovalConditionsImpl.class,
					sezStatusPreApprovalConditions.getPrimaryKey()) == null) {

				cacheResult(sezStatusPreApprovalConditions);
			}
		}
	}

	/**
	 * Clears the cache for all sez status pre approval conditionses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezStatusPreApprovalConditionsImpl.class);

		finderCache.clearCache(SezStatusPreApprovalConditionsImpl.class);
	}

	/**
	 * Clears the cache for the sez status pre approval conditions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezStatusPreApprovalConditions sezStatusPreApprovalConditions) {

		entityCache.removeResult(
			SezStatusPreApprovalConditionsImpl.class,
			sezStatusPreApprovalConditions);
	}

	@Override
	public void clearCache(
		List<SezStatusPreApprovalConditions> sezStatusPreApprovalConditionses) {

		for (SezStatusPreApprovalConditions sezStatusPreApprovalConditions :
				sezStatusPreApprovalConditionses) {

			entityCache.removeResult(
				SezStatusPreApprovalConditionsImpl.class,
				sezStatusPreApprovalConditions);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezStatusPreApprovalConditionsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezStatusPreApprovalConditionsImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezStatusPreApprovalConditionsModelImpl
			sezStatusPreApprovalConditionsModelImpl) {

		Object[] args = new Object[] {
			sezStatusPreApprovalConditionsModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetPreAPprovalConditionBy_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetPreAPprovalConditionBy_CI, args,
			sezStatusPreApprovalConditionsModelImpl);
	}

	/**
	 * Creates a new sez status pre approval conditions with the primary key. Does not add the sez status pre approval conditions to the database.
	 *
	 * @param preApprovalId the primary key for the new sez status pre approval conditions
	 * @return the new sez status pre approval conditions
	 */
	@Override
	public SezStatusPreApprovalConditions create(long preApprovalId) {
		SezStatusPreApprovalConditions sezStatusPreApprovalConditions =
			new SezStatusPreApprovalConditionsImpl();

		sezStatusPreApprovalConditions.setNew(true);
		sezStatusPreApprovalConditions.setPrimaryKey(preApprovalId);

		sezStatusPreApprovalConditions.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezStatusPreApprovalConditions;
	}

	/**
	 * Removes the sez status pre approval conditions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param preApprovalId the primary key of the sez status pre approval conditions
	 * @return the sez status pre approval conditions that was removed
	 * @throws NoSuchSezStatusPreApprovalConditionsException if a sez status pre approval conditions with the primary key could not be found
	 */
	@Override
	public SezStatusPreApprovalConditions remove(long preApprovalId)
		throws NoSuchSezStatusPreApprovalConditionsException {

		return remove((Serializable)preApprovalId);
	}

	/**
	 * Removes the sez status pre approval conditions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez status pre approval conditions
	 * @return the sez status pre approval conditions that was removed
	 * @throws NoSuchSezStatusPreApprovalConditionsException if a sez status pre approval conditions with the primary key could not be found
	 */
	@Override
	public SezStatusPreApprovalConditions remove(Serializable primaryKey)
		throws NoSuchSezStatusPreApprovalConditionsException {

		Session session = null;

		try {
			session = openSession();

			SezStatusPreApprovalConditions sezStatusPreApprovalConditions =
				(SezStatusPreApprovalConditions)session.get(
					SezStatusPreApprovalConditionsImpl.class, primaryKey);

			if (sezStatusPreApprovalConditions == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezStatusPreApprovalConditionsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezStatusPreApprovalConditions);
		}
		catch (NoSuchSezStatusPreApprovalConditionsException
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
	protected SezStatusPreApprovalConditions removeImpl(
		SezStatusPreApprovalConditions sezStatusPreApprovalConditions) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezStatusPreApprovalConditions)) {
				sezStatusPreApprovalConditions =
					(SezStatusPreApprovalConditions)session.get(
						SezStatusPreApprovalConditionsImpl.class,
						sezStatusPreApprovalConditions.getPrimaryKeyObj());
			}

			if (sezStatusPreApprovalConditions != null) {
				session.delete(sezStatusPreApprovalConditions);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezStatusPreApprovalConditions != null) {
			clearCache(sezStatusPreApprovalConditions);
		}

		return sezStatusPreApprovalConditions;
	}

	@Override
	public SezStatusPreApprovalConditions updateImpl(
		SezStatusPreApprovalConditions sezStatusPreApprovalConditions) {

		boolean isNew = sezStatusPreApprovalConditions.isNew();

		if (!(sezStatusPreApprovalConditions instanceof
				SezStatusPreApprovalConditionsModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					sezStatusPreApprovalConditions.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					sezStatusPreApprovalConditions);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezStatusPreApprovalConditions proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezStatusPreApprovalConditions implementation " +
					sezStatusPreApprovalConditions.getClass());
		}

		SezStatusPreApprovalConditionsModelImpl
			sezStatusPreApprovalConditionsModelImpl =
				(SezStatusPreApprovalConditionsModelImpl)
					sezStatusPreApprovalConditions;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezStatusPreApprovalConditions.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezStatusPreApprovalConditions.setCreateDate(date);
			}
			else {
				sezStatusPreApprovalConditions.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezStatusPreApprovalConditionsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezStatusPreApprovalConditions.setModifiedDate(date);
			}
			else {
				sezStatusPreApprovalConditions.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezStatusPreApprovalConditions);
			}
			else {
				sezStatusPreApprovalConditions =
					(SezStatusPreApprovalConditions)session.merge(
						sezStatusPreApprovalConditions);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezStatusPreApprovalConditionsImpl.class,
			sezStatusPreApprovalConditionsModelImpl, false, true);

		cacheUniqueFindersCache(sezStatusPreApprovalConditionsModelImpl);

		if (isNew) {
			sezStatusPreApprovalConditions.setNew(false);
		}

		sezStatusPreApprovalConditions.resetOriginalValues();

		return sezStatusPreApprovalConditions;
	}

	/**
	 * Returns the sez status pre approval conditions with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez status pre approval conditions
	 * @return the sez status pre approval conditions
	 * @throws NoSuchSezStatusPreApprovalConditionsException if a sez status pre approval conditions with the primary key could not be found
	 */
	@Override
	public SezStatusPreApprovalConditions findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchSezStatusPreApprovalConditionsException {

		SezStatusPreApprovalConditions sezStatusPreApprovalConditions =
			fetchByPrimaryKey(primaryKey);

		if (sezStatusPreApprovalConditions == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezStatusPreApprovalConditionsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezStatusPreApprovalConditions;
	}

	/**
	 * Returns the sez status pre approval conditions with the primary key or throws a <code>NoSuchSezStatusPreApprovalConditionsException</code> if it could not be found.
	 *
	 * @param preApprovalId the primary key of the sez status pre approval conditions
	 * @return the sez status pre approval conditions
	 * @throws NoSuchSezStatusPreApprovalConditionsException if a sez status pre approval conditions with the primary key could not be found
	 */
	@Override
	public SezStatusPreApprovalConditions findByPrimaryKey(long preApprovalId)
		throws NoSuchSezStatusPreApprovalConditionsException {

		return findByPrimaryKey((Serializable)preApprovalId);
	}

	/**
	 * Returns the sez status pre approval conditions with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param preApprovalId the primary key of the sez status pre approval conditions
	 * @return the sez status pre approval conditions, or <code>null</code> if a sez status pre approval conditions with the primary key could not be found
	 */
	@Override
	public SezStatusPreApprovalConditions fetchByPrimaryKey(
		long preApprovalId) {

		return fetchByPrimaryKey((Serializable)preApprovalId);
	}

	/**
	 * Returns all the sez status pre approval conditionses.
	 *
	 * @return the sez status pre approval conditionses
	 */
	@Override
	public List<SezStatusPreApprovalConditions> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status pre approval conditionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPreApprovalConditionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status pre approval conditionses
	 * @param end the upper bound of the range of sez status pre approval conditionses (not inclusive)
	 * @return the range of sez status pre approval conditionses
	 */
	@Override
	public List<SezStatusPreApprovalConditions> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status pre approval conditionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPreApprovalConditionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status pre approval conditionses
	 * @param end the upper bound of the range of sez status pre approval conditionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status pre approval conditionses
	 */
	@Override
	public List<SezStatusPreApprovalConditions> findAll(
		int start, int end,
		OrderByComparator<SezStatusPreApprovalConditions> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status pre approval conditionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusPreApprovalConditionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status pre approval conditionses
	 * @param end the upper bound of the range of sez status pre approval conditionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status pre approval conditionses
	 */
	@Override
	public List<SezStatusPreApprovalConditions> findAll(
		int start, int end,
		OrderByComparator<SezStatusPreApprovalConditions> orderByComparator,
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

		List<SezStatusPreApprovalConditions> list = null;

		if (useFinderCache) {
			list = (List<SezStatusPreApprovalConditions>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZSTATUSPREAPPROVALCONDITIONS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZSTATUSPREAPPROVALCONDITIONS;

				sql = sql.concat(
					SezStatusPreApprovalConditionsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezStatusPreApprovalConditions>)QueryUtil.list(
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
	 * Removes all the sez status pre approval conditionses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezStatusPreApprovalConditions sezStatusPreApprovalConditions :
				findAll()) {

			remove(sezStatusPreApprovalConditions);
		}
	}

	/**
	 * Returns the number of sez status pre approval conditionses.
	 *
	 * @return the number of sez status pre approval conditionses
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
					_SQL_COUNT_SEZSTATUSPREAPPROVALCONDITIONS);

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
		return "preApprovalId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZSTATUSPREAPPROVALCONDITIONS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezStatusPreApprovalConditionsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez status pre approval conditions persistence.
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

		SezStatusPreApprovalConditionsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezStatusPreApprovalConditionsUtil.setPersistence(null);

		entityCache.removeCache(
			SezStatusPreApprovalConditionsImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUS_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZSTATUSPREAPPROVALCONDITIONS =
		"SELECT sezStatusPreApprovalConditions FROM SezStatusPreApprovalConditions sezStatusPreApprovalConditions";

	private static final String
		_SQL_SELECT_SEZSTATUSPREAPPROVALCONDITIONS_WHERE =
			"SELECT sezStatusPreApprovalConditions FROM SezStatusPreApprovalConditions sezStatusPreApprovalConditions WHERE ";

	private static final String _SQL_COUNT_SEZSTATUSPREAPPROVALCONDITIONS =
		"SELECT COUNT(sezStatusPreApprovalConditions) FROM SezStatusPreApprovalConditions sezStatusPreApprovalConditions";

	private static final String
		_SQL_COUNT_SEZSTATUSPREAPPROVALCONDITIONS_WHERE =
			"SELECT COUNT(sezStatusPreApprovalConditions) FROM SezStatusPreApprovalConditions sezStatusPreApprovalConditions WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezStatusPreApprovalConditions.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezStatusPreApprovalConditions exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezStatusPreApprovalConditions exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezStatusPreApprovalConditionsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}