/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service.persistence.impl;

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

import com.nbp.creative.stages.services.exception.NoSuchCreativePermitException;
import com.nbp.creative.stages.services.model.CreativePermit;
import com.nbp.creative.stages.services.model.CreativePermitTable;
import com.nbp.creative.stages.services.model.impl.CreativePermitImpl;
import com.nbp.creative.stages.services.model.impl.CreativePermitModelImpl;
import com.nbp.creative.stages.services.service.persistence.CreativePermitPersistence;
import com.nbp.creative.stages.services.service.persistence.CreativePermitUtil;
import com.nbp.creative.stages.services.service.persistence.impl.constants.CREATIVE_STAGESPersistenceConstants;

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
 * The persistence implementation for the creative permit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CreativePermitPersistence.class)
public class CreativePermitPersistenceImpl
	extends BasePersistenceImpl<CreativePermit>
	implements CreativePermitPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CreativePermitUtil</code> to access the creative permit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CreativePermitImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetCreativePermitBy_CI;
	private FinderPath _finderPathCountBygetCreativePermitBy_CI;

	/**
	 * Returns the creative permit where caseId = &#63; or throws a <code>NoSuchCreativePermitException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching creative permit
	 * @throws NoSuchCreativePermitException if a matching creative permit could not be found
	 */
	@Override
	public CreativePermit findBygetCreativePermitBy_CI(String caseId)
		throws NoSuchCreativePermitException {

		CreativePermit creativePermit = fetchBygetCreativePermitBy_CI(caseId);

		if (creativePermit == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCreativePermitException(sb.toString());
		}

		return creativePermit;
	}

	/**
	 * Returns the creative permit where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching creative permit, or <code>null</code> if a matching creative permit could not be found
	 */
	@Override
	public CreativePermit fetchBygetCreativePermitBy_CI(String caseId) {
		return fetchBygetCreativePermitBy_CI(caseId, true);
	}

	/**
	 * Returns the creative permit where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative permit, or <code>null</code> if a matching creative permit could not be found
	 */
	@Override
	public CreativePermit fetchBygetCreativePermitBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCreativePermitBy_CI, finderArgs, this);
		}

		if (result instanceof CreativePermit) {
			CreativePermit creativePermit = (CreativePermit)result;

			if (!Objects.equals(caseId, creativePermit.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CREATIVEPERMIT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCREATIVEPERMITBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCREATIVEPERMITBY_CI_CASEID_2);
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

				List<CreativePermit> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCreativePermitBy_CI,
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
								"CreativePermitPersistenceImpl.fetchBygetCreativePermitBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CreativePermit creativePermit = list.get(0);

					result = creativePermit;

					cacheResult(creativePermit);
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
			return (CreativePermit)result;
		}
	}

	/**
	 * Removes the creative permit where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the creative permit that was removed
	 */
	@Override
	public CreativePermit removeBygetCreativePermitBy_CI(String caseId)
		throws NoSuchCreativePermitException {

		CreativePermit creativePermit = findBygetCreativePermitBy_CI(caseId);

		return remove(creativePermit);
	}

	/**
	 * Returns the number of creative permits where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching creative permits
	 */
	@Override
	public int countBygetCreativePermitBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetCreativePermitBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVEPERMIT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCREATIVEPERMITBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCREATIVEPERMITBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETCREATIVEPERMITBY_CI_CASEID_2 =
		"creativePermit.caseId = ?";

	private static final String _FINDER_COLUMN_GETCREATIVEPERMITBY_CI_CASEID_3 =
		"(creativePermit.caseId IS NULL OR creativePermit.caseId = '')";

	public CreativePermitPersistenceImpl() {
		setModelClass(CreativePermit.class);

		setModelImplClass(CreativePermitImpl.class);
		setModelPKClass(long.class);

		setTable(CreativePermitTable.INSTANCE);
	}

	/**
	 * Caches the creative permit in the entity cache if it is enabled.
	 *
	 * @param creativePermit the creative permit
	 */
	@Override
	public void cacheResult(CreativePermit creativePermit) {
		entityCache.putResult(
			CreativePermitImpl.class, creativePermit.getPrimaryKey(),
			creativePermit);

		finderCache.putResult(
			_finderPathFetchBygetCreativePermitBy_CI,
			new Object[] {creativePermit.getCaseId()}, creativePermit);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the creative permits in the entity cache if it is enabled.
	 *
	 * @param creativePermits the creative permits
	 */
	@Override
	public void cacheResult(List<CreativePermit> creativePermits) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (creativePermits.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CreativePermit creativePermit : creativePermits) {
			if (entityCache.getResult(
					CreativePermitImpl.class, creativePermit.getPrimaryKey()) ==
						null) {

				cacheResult(creativePermit);
			}
		}
	}

	/**
	 * Clears the cache for all creative permits.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CreativePermitImpl.class);

		finderCache.clearCache(CreativePermitImpl.class);
	}

	/**
	 * Clears the cache for the creative permit.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CreativePermit creativePermit) {
		entityCache.removeResult(CreativePermitImpl.class, creativePermit);
	}

	@Override
	public void clearCache(List<CreativePermit> creativePermits) {
		for (CreativePermit creativePermit : creativePermits) {
			entityCache.removeResult(CreativePermitImpl.class, creativePermit);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CreativePermitImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(CreativePermitImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CreativePermitModelImpl creativePermitModelImpl) {

		Object[] args = new Object[] {creativePermitModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetCreativePermitBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCreativePermitBy_CI, args,
			creativePermitModelImpl);
	}

	/**
	 * Creates a new creative permit with the primary key. Does not add the creative permit to the database.
	 *
	 * @param creativePermitId the primary key for the new creative permit
	 * @return the new creative permit
	 */
	@Override
	public CreativePermit create(long creativePermitId) {
		CreativePermit creativePermit = new CreativePermitImpl();

		creativePermit.setNew(true);
		creativePermit.setPrimaryKey(creativePermitId);

		creativePermit.setCompanyId(CompanyThreadLocal.getCompanyId());

		return creativePermit;
	}

	/**
	 * Removes the creative permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativePermitId the primary key of the creative permit
	 * @return the creative permit that was removed
	 * @throws NoSuchCreativePermitException if a creative permit with the primary key could not be found
	 */
	@Override
	public CreativePermit remove(long creativePermitId)
		throws NoSuchCreativePermitException {

		return remove((Serializable)creativePermitId);
	}

	/**
	 * Removes the creative permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the creative permit
	 * @return the creative permit that was removed
	 * @throws NoSuchCreativePermitException if a creative permit with the primary key could not be found
	 */
	@Override
	public CreativePermit remove(Serializable primaryKey)
		throws NoSuchCreativePermitException {

		Session session = null;

		try {
			session = openSession();

			CreativePermit creativePermit = (CreativePermit)session.get(
				CreativePermitImpl.class, primaryKey);

			if (creativePermit == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCreativePermitException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(creativePermit);
		}
		catch (NoSuchCreativePermitException noSuchEntityException) {
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
	protected CreativePermit removeImpl(CreativePermit creativePermit) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(creativePermit)) {
				creativePermit = (CreativePermit)session.get(
					CreativePermitImpl.class,
					creativePermit.getPrimaryKeyObj());
			}

			if (creativePermit != null) {
				session.delete(creativePermit);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (creativePermit != null) {
			clearCache(creativePermit);
		}

		return creativePermit;
	}

	@Override
	public CreativePermit updateImpl(CreativePermit creativePermit) {
		boolean isNew = creativePermit.isNew();

		if (!(creativePermit instanceof CreativePermitModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(creativePermit.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					creativePermit);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in creativePermit proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CreativePermit implementation " +
					creativePermit.getClass());
		}

		CreativePermitModelImpl creativePermitModelImpl =
			(CreativePermitModelImpl)creativePermit;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (creativePermit.getCreateDate() == null)) {
			if (serviceContext == null) {
				creativePermit.setCreateDate(date);
			}
			else {
				creativePermit.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!creativePermitModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				creativePermit.setModifiedDate(date);
			}
			else {
				creativePermit.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(creativePermit);
			}
			else {
				creativePermit = (CreativePermit)session.merge(creativePermit);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CreativePermitImpl.class, creativePermitModelImpl, false, true);

		cacheUniqueFindersCache(creativePermitModelImpl);

		if (isNew) {
			creativePermit.setNew(false);
		}

		creativePermit.resetOriginalValues();

		return creativePermit;
	}

	/**
	 * Returns the creative permit with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the creative permit
	 * @return the creative permit
	 * @throws NoSuchCreativePermitException if a creative permit with the primary key could not be found
	 */
	@Override
	public CreativePermit findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCreativePermitException {

		CreativePermit creativePermit = fetchByPrimaryKey(primaryKey);

		if (creativePermit == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCreativePermitException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return creativePermit;
	}

	/**
	 * Returns the creative permit with the primary key or throws a <code>NoSuchCreativePermitException</code> if it could not be found.
	 *
	 * @param creativePermitId the primary key of the creative permit
	 * @return the creative permit
	 * @throws NoSuchCreativePermitException if a creative permit with the primary key could not be found
	 */
	@Override
	public CreativePermit findByPrimaryKey(long creativePermitId)
		throws NoSuchCreativePermitException {

		return findByPrimaryKey((Serializable)creativePermitId);
	}

	/**
	 * Returns the creative permit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativePermitId the primary key of the creative permit
	 * @return the creative permit, or <code>null</code> if a creative permit with the primary key could not be found
	 */
	@Override
	public CreativePermit fetchByPrimaryKey(long creativePermitId) {
		return fetchByPrimaryKey((Serializable)creativePermitId);
	}

	/**
	 * Returns all the creative permits.
	 *
	 * @return the creative permits
	 */
	@Override
	public List<CreativePermit> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative permits
	 * @param end the upper bound of the range of creative permits (not inclusive)
	 * @return the range of creative permits
	 */
	@Override
	public List<CreativePermit> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative permits
	 * @param end the upper bound of the range of creative permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative permits
	 */
	@Override
	public List<CreativePermit> findAll(
		int start, int end,
		OrderByComparator<CreativePermit> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative permits
	 * @param end the upper bound of the range of creative permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative permits
	 */
	@Override
	public List<CreativePermit> findAll(
		int start, int end, OrderByComparator<CreativePermit> orderByComparator,
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

		List<CreativePermit> list = null;

		if (useFinderCache) {
			list = (List<CreativePermit>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CREATIVEPERMIT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CREATIVEPERMIT;

				sql = sql.concat(CreativePermitModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CreativePermit>)QueryUtil.list(
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
	 * Removes all the creative permits from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CreativePermit creativePermit : findAll()) {
			remove(creativePermit);
		}
	}

	/**
	 * Returns the number of creative permits.
	 *
	 * @return the number of creative permits
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_CREATIVEPERMIT);

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
		return "creativePermitId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CREATIVEPERMIT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CreativePermitModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the creative permit persistence.
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

		_finderPathFetchBygetCreativePermitBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCreativePermitBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetCreativePermitBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCreativePermitBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		CreativePermitUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CreativePermitUtil.setPersistence(null);

		entityCache.removeCache(CreativePermitImpl.class.getName());
	}

	@Override
	@Reference(
		target = CREATIVE_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CREATIVE_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CREATIVE_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CREATIVEPERMIT =
		"SELECT creativePermit FROM CreativePermit creativePermit";

	private static final String _SQL_SELECT_CREATIVEPERMIT_WHERE =
		"SELECT creativePermit FROM CreativePermit creativePermit WHERE ";

	private static final String _SQL_COUNT_CREATIVEPERMIT =
		"SELECT COUNT(creativePermit) FROM CreativePermit creativePermit";

	private static final String _SQL_COUNT_CREATIVEPERMIT_WHERE =
		"SELECT COUNT(creativePermit) FROM CreativePermit creativePermit WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "creativePermit.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CreativePermit exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CreativePermit exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CreativePermitPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}