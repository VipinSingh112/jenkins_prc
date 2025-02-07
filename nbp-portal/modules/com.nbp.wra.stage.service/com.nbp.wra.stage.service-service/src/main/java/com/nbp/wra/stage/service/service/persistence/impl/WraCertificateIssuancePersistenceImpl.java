/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service.persistence.impl;

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

import com.nbp.wra.stage.service.exception.NoSuchWraCertificateIssuanceException;
import com.nbp.wra.stage.service.model.WraCertificateIssuance;
import com.nbp.wra.stage.service.model.WraCertificateIssuanceTable;
import com.nbp.wra.stage.service.model.impl.WraCertificateIssuanceImpl;
import com.nbp.wra.stage.service.model.impl.WraCertificateIssuanceModelImpl;
import com.nbp.wra.stage.service.service.persistence.WraCertificateIssuancePersistence;
import com.nbp.wra.stage.service.service.persistence.WraCertificateIssuanceUtil;
import com.nbp.wra.stage.service.service.persistence.impl.constants.WRA_STAGESPersistenceConstants;

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
 * The persistence implementation for the wra certificate issuance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = WraCertificateIssuancePersistence.class)
public class WraCertificateIssuancePersistenceImpl
	extends BasePersistenceImpl<WraCertificateIssuance>
	implements WraCertificateIssuancePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>WraCertificateIssuanceUtil</code> to access the wra certificate issuance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		WraCertificateIssuanceImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetWra_Issuance_By_CI;
	private FinderPath _finderPathCountBygetWra_Issuance_By_CI;

	/**
	 * Returns the wra certificate issuance where caseId = &#63; or throws a <code>NoSuchWraCertificateIssuanceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching wra certificate issuance
	 * @throws NoSuchWraCertificateIssuanceException if a matching wra certificate issuance could not be found
	 */
	@Override
	public WraCertificateIssuance findBygetWra_Issuance_By_CI(String caseId)
		throws NoSuchWraCertificateIssuanceException {

		WraCertificateIssuance wraCertificateIssuance =
			fetchBygetWra_Issuance_By_CI(caseId);

		if (wraCertificateIssuance == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchWraCertificateIssuanceException(sb.toString());
		}

		return wraCertificateIssuance;
	}

	/**
	 * Returns the wra certificate issuance where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching wra certificate issuance, or <code>null</code> if a matching wra certificate issuance could not be found
	 */
	@Override
	public WraCertificateIssuance fetchBygetWra_Issuance_By_CI(String caseId) {
		return fetchBygetWra_Issuance_By_CI(caseId, true);
	}

	/**
	 * Returns the wra certificate issuance where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra certificate issuance, or <code>null</code> if a matching wra certificate issuance could not be found
	 */
	@Override
	public WraCertificateIssuance fetchBygetWra_Issuance_By_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetWra_Issuance_By_CI, finderArgs, this);
		}

		if (result instanceof WraCertificateIssuance) {
			WraCertificateIssuance wraCertificateIssuance =
				(WraCertificateIssuance)result;

			if (!Objects.equals(caseId, wraCertificateIssuance.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_WRACERTIFICATEISSUANCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_ISSUANCE_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRA_ISSUANCE_BY_CI_CASEID_2);
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

				List<WraCertificateIssuance> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetWra_Issuance_By_CI, finderArgs,
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
								"WraCertificateIssuancePersistenceImpl.fetchBygetWra_Issuance_By_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					WraCertificateIssuance wraCertificateIssuance = list.get(0);

					result = wraCertificateIssuance;

					cacheResult(wraCertificateIssuance);
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
			return (WraCertificateIssuance)result;
		}
	}

	/**
	 * Removes the wra certificate issuance where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the wra certificate issuance that was removed
	 */
	@Override
	public WraCertificateIssuance removeBygetWra_Issuance_By_CI(String caseId)
		throws NoSuchWraCertificateIssuanceException {

		WraCertificateIssuance wraCertificateIssuance =
			findBygetWra_Issuance_By_CI(caseId);

		return remove(wraCertificateIssuance);
	}

	/**
	 * Returns the number of wra certificate issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra certificate issuances
	 */
	@Override
	public int countBygetWra_Issuance_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetWra_Issuance_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRACERTIFICATEISSUANCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_ISSUANCE_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRA_ISSUANCE_BY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETWRA_ISSUANCE_BY_CI_CASEID_2 =
		"wraCertificateIssuance.caseId = ?";

	private static final String _FINDER_COLUMN_GETWRA_ISSUANCE_BY_CI_CASEID_3 =
		"(wraCertificateIssuance.caseId IS NULL OR wraCertificateIssuance.caseId = '')";

	public WraCertificateIssuancePersistenceImpl() {
		setModelClass(WraCertificateIssuance.class);

		setModelImplClass(WraCertificateIssuanceImpl.class);
		setModelPKClass(long.class);

		setTable(WraCertificateIssuanceTable.INSTANCE);
	}

	/**
	 * Caches the wra certificate issuance in the entity cache if it is enabled.
	 *
	 * @param wraCertificateIssuance the wra certificate issuance
	 */
	@Override
	public void cacheResult(WraCertificateIssuance wraCertificateIssuance) {
		entityCache.putResult(
			WraCertificateIssuanceImpl.class,
			wraCertificateIssuance.getPrimaryKey(), wraCertificateIssuance);

		finderCache.putResult(
			_finderPathFetchBygetWra_Issuance_By_CI,
			new Object[] {wraCertificateIssuance.getCaseId()},
			wraCertificateIssuance);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the wra certificate issuances in the entity cache if it is enabled.
	 *
	 * @param wraCertificateIssuances the wra certificate issuances
	 */
	@Override
	public void cacheResult(
		List<WraCertificateIssuance> wraCertificateIssuances) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (wraCertificateIssuances.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (WraCertificateIssuance wraCertificateIssuance :
				wraCertificateIssuances) {

			if (entityCache.getResult(
					WraCertificateIssuanceImpl.class,
					wraCertificateIssuance.getPrimaryKey()) == null) {

				cacheResult(wraCertificateIssuance);
			}
		}
	}

	/**
	 * Clears the cache for all wra certificate issuances.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(WraCertificateIssuanceImpl.class);

		finderCache.clearCache(WraCertificateIssuanceImpl.class);
	}

	/**
	 * Clears the cache for the wra certificate issuance.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(WraCertificateIssuance wraCertificateIssuance) {
		entityCache.removeResult(
			WraCertificateIssuanceImpl.class, wraCertificateIssuance);
	}

	@Override
	public void clearCache(
		List<WraCertificateIssuance> wraCertificateIssuances) {

		for (WraCertificateIssuance wraCertificateIssuance :
				wraCertificateIssuances) {

			entityCache.removeResult(
				WraCertificateIssuanceImpl.class, wraCertificateIssuance);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(WraCertificateIssuanceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				WraCertificateIssuanceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		WraCertificateIssuanceModelImpl wraCertificateIssuanceModelImpl) {

		Object[] args = new Object[] {
			wraCertificateIssuanceModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetWra_Issuance_By_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetWra_Issuance_By_CI, args,
			wraCertificateIssuanceModelImpl);
	}

	/**
	 * Creates a new wra certificate issuance with the primary key. Does not add the wra certificate issuance to the database.
	 *
	 * @param wraCertificateIssuanceId the primary key for the new wra certificate issuance
	 * @return the new wra certificate issuance
	 */
	@Override
	public WraCertificateIssuance create(long wraCertificateIssuanceId) {
		WraCertificateIssuance wraCertificateIssuance =
			new WraCertificateIssuanceImpl();

		wraCertificateIssuance.setNew(true);
		wraCertificateIssuance.setPrimaryKey(wraCertificateIssuanceId);

		wraCertificateIssuance.setCompanyId(CompanyThreadLocal.getCompanyId());

		return wraCertificateIssuance;
	}

	/**
	 * Removes the wra certificate issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraCertificateIssuanceId the primary key of the wra certificate issuance
	 * @return the wra certificate issuance that was removed
	 * @throws NoSuchWraCertificateIssuanceException if a wra certificate issuance with the primary key could not be found
	 */
	@Override
	public WraCertificateIssuance remove(long wraCertificateIssuanceId)
		throws NoSuchWraCertificateIssuanceException {

		return remove((Serializable)wraCertificateIssuanceId);
	}

	/**
	 * Removes the wra certificate issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the wra certificate issuance
	 * @return the wra certificate issuance that was removed
	 * @throws NoSuchWraCertificateIssuanceException if a wra certificate issuance with the primary key could not be found
	 */
	@Override
	public WraCertificateIssuance remove(Serializable primaryKey)
		throws NoSuchWraCertificateIssuanceException {

		Session session = null;

		try {
			session = openSession();

			WraCertificateIssuance wraCertificateIssuance =
				(WraCertificateIssuance)session.get(
					WraCertificateIssuanceImpl.class, primaryKey);

			if (wraCertificateIssuance == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchWraCertificateIssuanceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(wraCertificateIssuance);
		}
		catch (NoSuchWraCertificateIssuanceException noSuchEntityException) {
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
	protected WraCertificateIssuance removeImpl(
		WraCertificateIssuance wraCertificateIssuance) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(wraCertificateIssuance)) {
				wraCertificateIssuance = (WraCertificateIssuance)session.get(
					WraCertificateIssuanceImpl.class,
					wraCertificateIssuance.getPrimaryKeyObj());
			}

			if (wraCertificateIssuance != null) {
				session.delete(wraCertificateIssuance);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (wraCertificateIssuance != null) {
			clearCache(wraCertificateIssuance);
		}

		return wraCertificateIssuance;
	}

	@Override
	public WraCertificateIssuance updateImpl(
		WraCertificateIssuance wraCertificateIssuance) {

		boolean isNew = wraCertificateIssuance.isNew();

		if (!(wraCertificateIssuance instanceof
				WraCertificateIssuanceModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(wraCertificateIssuance.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					wraCertificateIssuance);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in wraCertificateIssuance proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom WraCertificateIssuance implementation " +
					wraCertificateIssuance.getClass());
		}

		WraCertificateIssuanceModelImpl wraCertificateIssuanceModelImpl =
			(WraCertificateIssuanceModelImpl)wraCertificateIssuance;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (wraCertificateIssuance.getCreateDate() == null)) {
			if (serviceContext == null) {
				wraCertificateIssuance.setCreateDate(date);
			}
			else {
				wraCertificateIssuance.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!wraCertificateIssuanceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				wraCertificateIssuance.setModifiedDate(date);
			}
			else {
				wraCertificateIssuance.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(wraCertificateIssuance);
			}
			else {
				wraCertificateIssuance = (WraCertificateIssuance)session.merge(
					wraCertificateIssuance);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			WraCertificateIssuanceImpl.class, wraCertificateIssuanceModelImpl,
			false, true);

		cacheUniqueFindersCache(wraCertificateIssuanceModelImpl);

		if (isNew) {
			wraCertificateIssuance.setNew(false);
		}

		wraCertificateIssuance.resetOriginalValues();

		return wraCertificateIssuance;
	}

	/**
	 * Returns the wra certificate issuance with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the wra certificate issuance
	 * @return the wra certificate issuance
	 * @throws NoSuchWraCertificateIssuanceException if a wra certificate issuance with the primary key could not be found
	 */
	@Override
	public WraCertificateIssuance findByPrimaryKey(Serializable primaryKey)
		throws NoSuchWraCertificateIssuanceException {

		WraCertificateIssuance wraCertificateIssuance = fetchByPrimaryKey(
			primaryKey);

		if (wraCertificateIssuance == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchWraCertificateIssuanceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return wraCertificateIssuance;
	}

	/**
	 * Returns the wra certificate issuance with the primary key or throws a <code>NoSuchWraCertificateIssuanceException</code> if it could not be found.
	 *
	 * @param wraCertificateIssuanceId the primary key of the wra certificate issuance
	 * @return the wra certificate issuance
	 * @throws NoSuchWraCertificateIssuanceException if a wra certificate issuance with the primary key could not be found
	 */
	@Override
	public WraCertificateIssuance findByPrimaryKey(
			long wraCertificateIssuanceId)
		throws NoSuchWraCertificateIssuanceException {

		return findByPrimaryKey((Serializable)wraCertificateIssuanceId);
	}

	/**
	 * Returns the wra certificate issuance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraCertificateIssuanceId the primary key of the wra certificate issuance
	 * @return the wra certificate issuance, or <code>null</code> if a wra certificate issuance with the primary key could not be found
	 */
	@Override
	public WraCertificateIssuance fetchByPrimaryKey(
		long wraCertificateIssuanceId) {

		return fetchByPrimaryKey((Serializable)wraCertificateIssuanceId);
	}

	/**
	 * Returns all the wra certificate issuances.
	 *
	 * @return the wra certificate issuances
	 */
	@Override
	public List<WraCertificateIssuance> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra certificate issuances
	 * @param end the upper bound of the range of wra certificate issuances (not inclusive)
	 * @return the range of wra certificate issuances
	 */
	@Override
	public List<WraCertificateIssuance> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra certificate issuances
	 * @param end the upper bound of the range of wra certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra certificate issuances
	 */
	@Override
	public List<WraCertificateIssuance> findAll(
		int start, int end,
		OrderByComparator<WraCertificateIssuance> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra certificate issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraCertificateIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra certificate issuances
	 * @param end the upper bound of the range of wra certificate issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra certificate issuances
	 */
	@Override
	public List<WraCertificateIssuance> findAll(
		int start, int end,
		OrderByComparator<WraCertificateIssuance> orderByComparator,
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

		List<WraCertificateIssuance> list = null;

		if (useFinderCache) {
			list = (List<WraCertificateIssuance>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_WRACERTIFICATEISSUANCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_WRACERTIFICATEISSUANCE;

				sql = sql.concat(WraCertificateIssuanceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<WraCertificateIssuance>)QueryUtil.list(
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
	 * Removes all the wra certificate issuances from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (WraCertificateIssuance wraCertificateIssuance : findAll()) {
			remove(wraCertificateIssuance);
		}
	}

	/**
	 * Returns the number of wra certificate issuances.
	 *
	 * @return the number of wra certificate issuances
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
					_SQL_COUNT_WRACERTIFICATEISSUANCE);

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
		return "wraCertificateIssuanceId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_WRACERTIFICATEISSUANCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return WraCertificateIssuanceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the wra certificate issuance persistence.
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

		_finderPathFetchBygetWra_Issuance_By_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetWra_Issuance_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetWra_Issuance_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetWra_Issuance_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		WraCertificateIssuanceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		WraCertificateIssuanceUtil.setPersistence(null);

		entityCache.removeCache(WraCertificateIssuanceImpl.class.getName());
	}

	@Override
	@Reference(
		target = WRA_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = WRA_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = WRA_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_WRACERTIFICATEISSUANCE =
		"SELECT wraCertificateIssuance FROM WraCertificateIssuance wraCertificateIssuance";

	private static final String _SQL_SELECT_WRACERTIFICATEISSUANCE_WHERE =
		"SELECT wraCertificateIssuance FROM WraCertificateIssuance wraCertificateIssuance WHERE ";

	private static final String _SQL_COUNT_WRACERTIFICATEISSUANCE =
		"SELECT COUNT(wraCertificateIssuance) FROM WraCertificateIssuance wraCertificateIssuance";

	private static final String _SQL_COUNT_WRACERTIFICATEISSUANCE_WHERE =
		"SELECT COUNT(wraCertificateIssuance) FROM WraCertificateIssuance wraCertificateIssuance WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"wraCertificateIssuance.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No WraCertificateIssuance exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No WraCertificateIssuance exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		WraCertificateIssuancePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}