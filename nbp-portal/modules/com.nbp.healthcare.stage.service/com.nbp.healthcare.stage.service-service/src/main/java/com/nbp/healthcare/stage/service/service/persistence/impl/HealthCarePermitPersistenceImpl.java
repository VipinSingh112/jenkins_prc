/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service.persistence.impl;

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

import com.nbp.healthcare.stage.service.exception.NoSuchHealthCarePermitException;
import com.nbp.healthcare.stage.service.model.HealthCarePermit;
import com.nbp.healthcare.stage.service.model.HealthCarePermitTable;
import com.nbp.healthcare.stage.service.model.impl.HealthCarePermitImpl;
import com.nbp.healthcare.stage.service.model.impl.HealthCarePermitModelImpl;
import com.nbp.healthcare.stage.service.service.persistence.HealthCarePermitPersistence;
import com.nbp.healthcare.stage.service.service.persistence.HealthCarePermitUtil;
import com.nbp.healthcare.stage.service.service.persistence.impl.constants.HEALTH_STAGESPersistenceConstants;

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
 * The persistence implementation for the health care permit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HealthCarePermitPersistence.class)
public class HealthCarePermitPersistenceImpl
	extends BasePersistenceImpl<HealthCarePermit>
	implements HealthCarePermitPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HealthCarePermitUtil</code> to access the health care permit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HealthCarePermitImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetHealthCareBY_CI;
	private FinderPath _finderPathCountBygetHealthCareBY_CI;

	/**
	 * Returns the health care permit where caseId = &#63; or throws a <code>NoSuchHealthCarePermitException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching health care permit
	 * @throws NoSuchHealthCarePermitException if a matching health care permit could not be found
	 */
	@Override
	public HealthCarePermit findBygetHealthCareBY_CI(String caseId)
		throws NoSuchHealthCarePermitException {

		HealthCarePermit healthCarePermit = fetchBygetHealthCareBY_CI(caseId);

		if (healthCarePermit == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHealthCarePermitException(sb.toString());
		}

		return healthCarePermit;
	}

	/**
	 * Returns the health care permit where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching health care permit, or <code>null</code> if a matching health care permit could not be found
	 */
	@Override
	public HealthCarePermit fetchBygetHealthCareBY_CI(String caseId) {
		return fetchBygetHealthCareBY_CI(caseId, true);
	}

	/**
	 * Returns the health care permit where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care permit, or <code>null</code> if a matching health care permit could not be found
	 */
	@Override
	public HealthCarePermit fetchBygetHealthCareBY_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHealthCareBY_CI, finderArgs, this);
		}

		if (result instanceof HealthCarePermit) {
			HealthCarePermit healthCarePermit = (HealthCarePermit)result;

			if (!Objects.equals(caseId, healthCarePermit.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HEALTHCAREPERMIT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHEALTHCAREBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHEALTHCAREBY_CI_CASEID_2);
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

				List<HealthCarePermit> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHealthCareBY_CI, finderArgs,
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
								"HealthCarePermitPersistenceImpl.fetchBygetHealthCareBY_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HealthCarePermit healthCarePermit = list.get(0);

					result = healthCarePermit;

					cacheResult(healthCarePermit);
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
			return (HealthCarePermit)result;
		}
	}

	/**
	 * Removes the health care permit where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the health care permit that was removed
	 */
	@Override
	public HealthCarePermit removeBygetHealthCareBY_CI(String caseId)
		throws NoSuchHealthCarePermitException {

		HealthCarePermit healthCarePermit = findBygetHealthCareBY_CI(caseId);

		return remove(healthCarePermit);
	}

	/**
	 * Returns the number of health care permits where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching health care permits
	 */
	@Override
	public int countBygetHealthCareBY_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetHealthCareBY_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HEALTHCAREPERMIT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHEALTHCAREBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHEALTHCAREBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETHEALTHCAREBY_CI_CASEID_2 =
		"healthCarePermit.caseId = ?";

	private static final String _FINDER_COLUMN_GETHEALTHCAREBY_CI_CASEID_3 =
		"(healthCarePermit.caseId IS NULL OR healthCarePermit.caseId = '')";

	public HealthCarePermitPersistenceImpl() {
		setModelClass(HealthCarePermit.class);

		setModelImplClass(HealthCarePermitImpl.class);
		setModelPKClass(long.class);

		setTable(HealthCarePermitTable.INSTANCE);
	}

	/**
	 * Caches the health care permit in the entity cache if it is enabled.
	 *
	 * @param healthCarePermit the health care permit
	 */
	@Override
	public void cacheResult(HealthCarePermit healthCarePermit) {
		entityCache.putResult(
			HealthCarePermitImpl.class, healthCarePermit.getPrimaryKey(),
			healthCarePermit);

		finderCache.putResult(
			_finderPathFetchBygetHealthCareBY_CI,
			new Object[] {healthCarePermit.getCaseId()}, healthCarePermit);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the health care permits in the entity cache if it is enabled.
	 *
	 * @param healthCarePermits the health care permits
	 */
	@Override
	public void cacheResult(List<HealthCarePermit> healthCarePermits) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (healthCarePermits.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HealthCarePermit healthCarePermit : healthCarePermits) {
			if (entityCache.getResult(
					HealthCarePermitImpl.class,
					healthCarePermit.getPrimaryKey()) == null) {

				cacheResult(healthCarePermit);
			}
		}
	}

	/**
	 * Clears the cache for all health care permits.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HealthCarePermitImpl.class);

		finderCache.clearCache(HealthCarePermitImpl.class);
	}

	/**
	 * Clears the cache for the health care permit.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HealthCarePermit healthCarePermit) {
		entityCache.removeResult(HealthCarePermitImpl.class, healthCarePermit);
	}

	@Override
	public void clearCache(List<HealthCarePermit> healthCarePermits) {
		for (HealthCarePermit healthCarePermit : healthCarePermits) {
			entityCache.removeResult(
				HealthCarePermitImpl.class, healthCarePermit);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HealthCarePermitImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(HealthCarePermitImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		HealthCarePermitModelImpl healthCarePermitModelImpl) {

		Object[] args = new Object[] {healthCarePermitModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetHealthCareBY_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHealthCareBY_CI, args,
			healthCarePermitModelImpl);
	}

	/**
	 * Creates a new health care permit with the primary key. Does not add the health care permit to the database.
	 *
	 * @param healthPermitId the primary key for the new health care permit
	 * @return the new health care permit
	 */
	@Override
	public HealthCarePermit create(long healthPermitId) {
		HealthCarePermit healthCarePermit = new HealthCarePermitImpl();

		healthCarePermit.setNew(true);
		healthCarePermit.setPrimaryKey(healthPermitId);

		healthCarePermit.setCompanyId(CompanyThreadLocal.getCompanyId());

		return healthCarePermit;
	}

	/**
	 * Removes the health care permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthPermitId the primary key of the health care permit
	 * @return the health care permit that was removed
	 * @throws NoSuchHealthCarePermitException if a health care permit with the primary key could not be found
	 */
	@Override
	public HealthCarePermit remove(long healthPermitId)
		throws NoSuchHealthCarePermitException {

		return remove((Serializable)healthPermitId);
	}

	/**
	 * Removes the health care permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the health care permit
	 * @return the health care permit that was removed
	 * @throws NoSuchHealthCarePermitException if a health care permit with the primary key could not be found
	 */
	@Override
	public HealthCarePermit remove(Serializable primaryKey)
		throws NoSuchHealthCarePermitException {

		Session session = null;

		try {
			session = openSession();

			HealthCarePermit healthCarePermit = (HealthCarePermit)session.get(
				HealthCarePermitImpl.class, primaryKey);

			if (healthCarePermit == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHealthCarePermitException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(healthCarePermit);
		}
		catch (NoSuchHealthCarePermitException noSuchEntityException) {
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
	protected HealthCarePermit removeImpl(HealthCarePermit healthCarePermit) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(healthCarePermit)) {
				healthCarePermit = (HealthCarePermit)session.get(
					HealthCarePermitImpl.class,
					healthCarePermit.getPrimaryKeyObj());
			}

			if (healthCarePermit != null) {
				session.delete(healthCarePermit);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (healthCarePermit != null) {
			clearCache(healthCarePermit);
		}

		return healthCarePermit;
	}

	@Override
	public HealthCarePermit updateImpl(HealthCarePermit healthCarePermit) {
		boolean isNew = healthCarePermit.isNew();

		if (!(healthCarePermit instanceof HealthCarePermitModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(healthCarePermit.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					healthCarePermit);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in healthCarePermit proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HealthCarePermit implementation " +
					healthCarePermit.getClass());
		}

		HealthCarePermitModelImpl healthCarePermitModelImpl =
			(HealthCarePermitModelImpl)healthCarePermit;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (healthCarePermit.getCreateDate() == null)) {
			if (serviceContext == null) {
				healthCarePermit.setCreateDate(date);
			}
			else {
				healthCarePermit.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!healthCarePermitModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				healthCarePermit.setModifiedDate(date);
			}
			else {
				healthCarePermit.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(healthCarePermit);
			}
			else {
				healthCarePermit = (HealthCarePermit)session.merge(
					healthCarePermit);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HealthCarePermitImpl.class, healthCarePermitModelImpl, false, true);

		cacheUniqueFindersCache(healthCarePermitModelImpl);

		if (isNew) {
			healthCarePermit.setNew(false);
		}

		healthCarePermit.resetOriginalValues();

		return healthCarePermit;
	}

	/**
	 * Returns the health care permit with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the health care permit
	 * @return the health care permit
	 * @throws NoSuchHealthCarePermitException if a health care permit with the primary key could not be found
	 */
	@Override
	public HealthCarePermit findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHealthCarePermitException {

		HealthCarePermit healthCarePermit = fetchByPrimaryKey(primaryKey);

		if (healthCarePermit == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHealthCarePermitException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return healthCarePermit;
	}

	/**
	 * Returns the health care permit with the primary key or throws a <code>NoSuchHealthCarePermitException</code> if it could not be found.
	 *
	 * @param healthPermitId the primary key of the health care permit
	 * @return the health care permit
	 * @throws NoSuchHealthCarePermitException if a health care permit with the primary key could not be found
	 */
	@Override
	public HealthCarePermit findByPrimaryKey(long healthPermitId)
		throws NoSuchHealthCarePermitException {

		return findByPrimaryKey((Serializable)healthPermitId);
	}

	/**
	 * Returns the health care permit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthPermitId the primary key of the health care permit
	 * @return the health care permit, or <code>null</code> if a health care permit with the primary key could not be found
	 */
	@Override
	public HealthCarePermit fetchByPrimaryKey(long healthPermitId) {
		return fetchByPrimaryKey((Serializable)healthPermitId);
	}

	/**
	 * Returns all the health care permits.
	 *
	 * @return the health care permits
	 */
	@Override
	public List<HealthCarePermit> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the health care permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCarePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care permits
	 * @param end the upper bound of the range of health care permits (not inclusive)
	 * @return the range of health care permits
	 */
	@Override
	public List<HealthCarePermit> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the health care permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCarePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care permits
	 * @param end the upper bound of the range of health care permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care permits
	 */
	@Override
	public List<HealthCarePermit> findAll(
		int start, int end,
		OrderByComparator<HealthCarePermit> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the health care permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCarePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care permits
	 * @param end the upper bound of the range of health care permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care permits
	 */
	@Override
	public List<HealthCarePermit> findAll(
		int start, int end,
		OrderByComparator<HealthCarePermit> orderByComparator,
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

		List<HealthCarePermit> list = null;

		if (useFinderCache) {
			list = (List<HealthCarePermit>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HEALTHCAREPERMIT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HEALTHCAREPERMIT;

				sql = sql.concat(HealthCarePermitModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HealthCarePermit>)QueryUtil.list(
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
	 * Removes all the health care permits from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HealthCarePermit healthCarePermit : findAll()) {
			remove(healthCarePermit);
		}
	}

	/**
	 * Returns the number of health care permits.
	 *
	 * @return the number of health care permits
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_HEALTHCAREPERMIT);

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
		return "healthPermitId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HEALTHCAREPERMIT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HealthCarePermitModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the health care permit persistence.
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

		_finderPathFetchBygetHealthCareBY_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHealthCareBY_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetHealthCareBY_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHealthCareBY_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		HealthCarePermitUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HealthCarePermitUtil.setPersistence(null);

		entityCache.removeCache(HealthCarePermitImpl.class.getName());
	}

	@Override
	@Reference(
		target = HEALTH_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HEALTH_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HEALTH_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_HEALTHCAREPERMIT =
		"SELECT healthCarePermit FROM HealthCarePermit healthCarePermit";

	private static final String _SQL_SELECT_HEALTHCAREPERMIT_WHERE =
		"SELECT healthCarePermit FROM HealthCarePermit healthCarePermit WHERE ";

	private static final String _SQL_COUNT_HEALTHCAREPERMIT =
		"SELECT COUNT(healthCarePermit) FROM HealthCarePermit healthCarePermit";

	private static final String _SQL_COUNT_HEALTHCAREPERMIT_WHERE =
		"SELECT COUNT(healthCarePermit) FROM HealthCarePermit healthCarePermit WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "healthCarePermit.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HealthCarePermit exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HealthCarePermit exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HealthCarePermitPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}