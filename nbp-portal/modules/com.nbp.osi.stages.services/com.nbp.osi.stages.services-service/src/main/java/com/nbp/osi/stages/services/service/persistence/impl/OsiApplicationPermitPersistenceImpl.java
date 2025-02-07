/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service.persistence.impl;

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

import com.nbp.osi.stages.services.exception.NoSuchOsiApplicationPermitException;
import com.nbp.osi.stages.services.model.OsiApplicationPermit;
import com.nbp.osi.stages.services.model.OsiApplicationPermitTable;
import com.nbp.osi.stages.services.model.impl.OsiApplicationPermitImpl;
import com.nbp.osi.stages.services.model.impl.OsiApplicationPermitModelImpl;
import com.nbp.osi.stages.services.service.persistence.OsiApplicationPermitPersistence;
import com.nbp.osi.stages.services.service.persistence.OsiApplicationPermitUtil;
import com.nbp.osi.stages.services.service.persistence.impl.constants.OSI_STAGESPersistenceConstants;

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
 * The persistence implementation for the osi application permit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiApplicationPermitPersistence.class)
public class OsiApplicationPermitPersistenceImpl
	extends BasePersistenceImpl<OsiApplicationPermit>
	implements OsiApplicationPermitPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiApplicationPermitUtil</code> to access the osi application permit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiApplicationPermitImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOsiAppPermitByCaseId;
	private FinderPath _finderPathCountBygetOsiAppPermitByCaseId;

	/**
	 * Returns the osi application permit where caseId = &#63; or throws a <code>NoSuchOsiApplicationPermitException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi application permit
	 * @throws NoSuchOsiApplicationPermitException if a matching osi application permit could not be found
	 */
	@Override
	public OsiApplicationPermit findBygetOsiAppPermitByCaseId(String caseId)
		throws NoSuchOsiApplicationPermitException {

		OsiApplicationPermit osiApplicationPermit =
			fetchBygetOsiAppPermitByCaseId(caseId);

		if (osiApplicationPermit == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiApplicationPermitException(sb.toString());
		}

		return osiApplicationPermit;
	}

	/**
	 * Returns the osi application permit where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi application permit, or <code>null</code> if a matching osi application permit could not be found
	 */
	@Override
	public OsiApplicationPermit fetchBygetOsiAppPermitByCaseId(String caseId) {
		return fetchBygetOsiAppPermitByCaseId(caseId, true);
	}

	/**
	 * Returns the osi application permit where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application permit, or <code>null</code> if a matching osi application permit could not be found
	 */
	@Override
	public OsiApplicationPermit fetchBygetOsiAppPermitByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiAppPermitByCaseId, finderArgs, this);
		}

		if (result instanceof OsiApplicationPermit) {
			OsiApplicationPermit osiApplicationPermit =
				(OsiApplicationPermit)result;

			if (!Objects.equals(caseId, osiApplicationPermit.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSIAPPLICATIONPERMIT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSIAPPPERMITBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOSIAPPPERMITBYCASEID_CASEID_2);
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

				List<OsiApplicationPermit> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOsiAppPermitByCaseId,
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
								"OsiApplicationPermitPersistenceImpl.fetchBygetOsiAppPermitByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiApplicationPermit osiApplicationPermit = list.get(0);

					result = osiApplicationPermit;

					cacheResult(osiApplicationPermit);
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
			return (OsiApplicationPermit)result;
		}
	}

	/**
	 * Removes the osi application permit where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi application permit that was removed
	 */
	@Override
	public OsiApplicationPermit removeBygetOsiAppPermitByCaseId(String caseId)
		throws NoSuchOsiApplicationPermitException {

		OsiApplicationPermit osiApplicationPermit =
			findBygetOsiAppPermitByCaseId(caseId);

		return remove(osiApplicationPermit);
	}

	/**
	 * Returns the number of osi application permits where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi application permits
	 */
	@Override
	public int countBygetOsiAppPermitByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetOsiAppPermitByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIAPPLICATIONPERMIT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSIAPPPERMITBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOSIAPPPERMITBYCASEID_CASEID_2);
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
		_FINDER_COLUMN_GETOSIAPPPERMITBYCASEID_CASEID_2 =
			"osiApplicationPermit.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETOSIAPPPERMITBYCASEID_CASEID_3 =
			"(osiApplicationPermit.caseId IS NULL OR osiApplicationPermit.caseId = '')";

	public OsiApplicationPermitPersistenceImpl() {
		setModelClass(OsiApplicationPermit.class);

		setModelImplClass(OsiApplicationPermitImpl.class);
		setModelPKClass(long.class);

		setTable(OsiApplicationPermitTable.INSTANCE);
	}

	/**
	 * Caches the osi application permit in the entity cache if it is enabled.
	 *
	 * @param osiApplicationPermit the osi application permit
	 */
	@Override
	public void cacheResult(OsiApplicationPermit osiApplicationPermit) {
		entityCache.putResult(
			OsiApplicationPermitImpl.class,
			osiApplicationPermit.getPrimaryKey(), osiApplicationPermit);

		finderCache.putResult(
			_finderPathFetchBygetOsiAppPermitByCaseId,
			new Object[] {osiApplicationPermit.getCaseId()},
			osiApplicationPermit);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi application permits in the entity cache if it is enabled.
	 *
	 * @param osiApplicationPermits the osi application permits
	 */
	@Override
	public void cacheResult(List<OsiApplicationPermit> osiApplicationPermits) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiApplicationPermits.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiApplicationPermit osiApplicationPermit :
				osiApplicationPermits) {

			if (entityCache.getResult(
					OsiApplicationPermitImpl.class,
					osiApplicationPermit.getPrimaryKey()) == null) {

				cacheResult(osiApplicationPermit);
			}
		}
	}

	/**
	 * Clears the cache for all osi application permits.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiApplicationPermitImpl.class);

		finderCache.clearCache(OsiApplicationPermitImpl.class);
	}

	/**
	 * Clears the cache for the osi application permit.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OsiApplicationPermit osiApplicationPermit) {
		entityCache.removeResult(
			OsiApplicationPermitImpl.class, osiApplicationPermit);
	}

	@Override
	public void clearCache(List<OsiApplicationPermit> osiApplicationPermits) {
		for (OsiApplicationPermit osiApplicationPermit :
				osiApplicationPermits) {

			entityCache.removeResult(
				OsiApplicationPermitImpl.class, osiApplicationPermit);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiApplicationPermitImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiApplicationPermitImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiApplicationPermitModelImpl osiApplicationPermitModelImpl) {

		Object[] args = new Object[] {
			osiApplicationPermitModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiAppPermitByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiAppPermitByCaseId, args,
			osiApplicationPermitModelImpl);
	}

	/**
	 * Creates a new osi application permit with the primary key. Does not add the osi application permit to the database.
	 *
	 * @param osiApplicationPermitId the primary key for the new osi application permit
	 * @return the new osi application permit
	 */
	@Override
	public OsiApplicationPermit create(long osiApplicationPermitId) {
		OsiApplicationPermit osiApplicationPermit =
			new OsiApplicationPermitImpl();

		osiApplicationPermit.setNew(true);
		osiApplicationPermit.setPrimaryKey(osiApplicationPermitId);

		osiApplicationPermit.setCompanyId(CompanyThreadLocal.getCompanyId());

		return osiApplicationPermit;
	}

	/**
	 * Removes the osi application permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiApplicationPermitId the primary key of the osi application permit
	 * @return the osi application permit that was removed
	 * @throws NoSuchOsiApplicationPermitException if a osi application permit with the primary key could not be found
	 */
	@Override
	public OsiApplicationPermit remove(long osiApplicationPermitId)
		throws NoSuchOsiApplicationPermitException {

		return remove((Serializable)osiApplicationPermitId);
	}

	/**
	 * Removes the osi application permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi application permit
	 * @return the osi application permit that was removed
	 * @throws NoSuchOsiApplicationPermitException if a osi application permit with the primary key could not be found
	 */
	@Override
	public OsiApplicationPermit remove(Serializable primaryKey)
		throws NoSuchOsiApplicationPermitException {

		Session session = null;

		try {
			session = openSession();

			OsiApplicationPermit osiApplicationPermit =
				(OsiApplicationPermit)session.get(
					OsiApplicationPermitImpl.class, primaryKey);

			if (osiApplicationPermit == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiApplicationPermitException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiApplicationPermit);
		}
		catch (NoSuchOsiApplicationPermitException noSuchEntityException) {
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
	protected OsiApplicationPermit removeImpl(
		OsiApplicationPermit osiApplicationPermit) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiApplicationPermit)) {
				osiApplicationPermit = (OsiApplicationPermit)session.get(
					OsiApplicationPermitImpl.class,
					osiApplicationPermit.getPrimaryKeyObj());
			}

			if (osiApplicationPermit != null) {
				session.delete(osiApplicationPermit);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiApplicationPermit != null) {
			clearCache(osiApplicationPermit);
		}

		return osiApplicationPermit;
	}

	@Override
	public OsiApplicationPermit updateImpl(
		OsiApplicationPermit osiApplicationPermit) {

		boolean isNew = osiApplicationPermit.isNew();

		if (!(osiApplicationPermit instanceof OsiApplicationPermitModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiApplicationPermit.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiApplicationPermit);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiApplicationPermit proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiApplicationPermit implementation " +
					osiApplicationPermit.getClass());
		}

		OsiApplicationPermitModelImpl osiApplicationPermitModelImpl =
			(OsiApplicationPermitModelImpl)osiApplicationPermit;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiApplicationPermit.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiApplicationPermit.setCreateDate(date);
			}
			else {
				osiApplicationPermit.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiApplicationPermitModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiApplicationPermit.setModifiedDate(date);
			}
			else {
				osiApplicationPermit.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiApplicationPermit);
			}
			else {
				osiApplicationPermit = (OsiApplicationPermit)session.merge(
					osiApplicationPermit);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiApplicationPermitImpl.class, osiApplicationPermitModelImpl,
			false, true);

		cacheUniqueFindersCache(osiApplicationPermitModelImpl);

		if (isNew) {
			osiApplicationPermit.setNew(false);
		}

		osiApplicationPermit.resetOriginalValues();

		return osiApplicationPermit;
	}

	/**
	 * Returns the osi application permit with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi application permit
	 * @return the osi application permit
	 * @throws NoSuchOsiApplicationPermitException if a osi application permit with the primary key could not be found
	 */
	@Override
	public OsiApplicationPermit findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOsiApplicationPermitException {

		OsiApplicationPermit osiApplicationPermit = fetchByPrimaryKey(
			primaryKey);

		if (osiApplicationPermit == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiApplicationPermitException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiApplicationPermit;
	}

	/**
	 * Returns the osi application permit with the primary key or throws a <code>NoSuchOsiApplicationPermitException</code> if it could not be found.
	 *
	 * @param osiApplicationPermitId the primary key of the osi application permit
	 * @return the osi application permit
	 * @throws NoSuchOsiApplicationPermitException if a osi application permit with the primary key could not be found
	 */
	@Override
	public OsiApplicationPermit findByPrimaryKey(long osiApplicationPermitId)
		throws NoSuchOsiApplicationPermitException {

		return findByPrimaryKey((Serializable)osiApplicationPermitId);
	}

	/**
	 * Returns the osi application permit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiApplicationPermitId the primary key of the osi application permit
	 * @return the osi application permit, or <code>null</code> if a osi application permit with the primary key could not be found
	 */
	@Override
	public OsiApplicationPermit fetchByPrimaryKey(long osiApplicationPermitId) {
		return fetchByPrimaryKey((Serializable)osiApplicationPermitId);
	}

	/**
	 * Returns all the osi application permits.
	 *
	 * @return the osi application permits
	 */
	@Override
	public List<OsiApplicationPermit> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi application permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi application permits
	 * @param end the upper bound of the range of osi application permits (not inclusive)
	 * @return the range of osi application permits
	 */
	@Override
	public List<OsiApplicationPermit> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi application permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi application permits
	 * @param end the upper bound of the range of osi application permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi application permits
	 */
	@Override
	public List<OsiApplicationPermit> findAll(
		int start, int end,
		OrderByComparator<OsiApplicationPermit> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi application permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi application permits
	 * @param end the upper bound of the range of osi application permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi application permits
	 */
	@Override
	public List<OsiApplicationPermit> findAll(
		int start, int end,
		OrderByComparator<OsiApplicationPermit> orderByComparator,
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

		List<OsiApplicationPermit> list = null;

		if (useFinderCache) {
			list = (List<OsiApplicationPermit>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSIAPPLICATIONPERMIT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSIAPPLICATIONPERMIT;

				sql = sql.concat(OsiApplicationPermitModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiApplicationPermit>)QueryUtil.list(
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
	 * Removes all the osi application permits from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiApplicationPermit osiApplicationPermit : findAll()) {
			remove(osiApplicationPermit);
		}
	}

	/**
	 * Returns the number of osi application permits.
	 *
	 * @return the number of osi application permits
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
					_SQL_COUNT_OSIAPPLICATIONPERMIT);

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
		return "osiApplicationPermitId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSIAPPLICATIONPERMIT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiApplicationPermitModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi application permit persistence.
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

		_finderPathFetchBygetOsiAppPermitByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOsiAppPermitByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetOsiAppPermitByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOsiAppPermitByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		OsiApplicationPermitUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiApplicationPermitUtil.setPersistence(null);

		entityCache.removeCache(OsiApplicationPermitImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OSIAPPLICATIONPERMIT =
		"SELECT osiApplicationPermit FROM OsiApplicationPermit osiApplicationPermit";

	private static final String _SQL_SELECT_OSIAPPLICATIONPERMIT_WHERE =
		"SELECT osiApplicationPermit FROM OsiApplicationPermit osiApplicationPermit WHERE ";

	private static final String _SQL_COUNT_OSIAPPLICATIONPERMIT =
		"SELECT COUNT(osiApplicationPermit) FROM OsiApplicationPermit osiApplicationPermit";

	private static final String _SQL_COUNT_OSIAPPLICATIONPERMIT_WHERE =
		"SELECT COUNT(osiApplicationPermit) FROM OsiApplicationPermit osiApplicationPermit WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiApplicationPermit.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiApplicationPermit exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiApplicationPermit exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiApplicationPermitPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}