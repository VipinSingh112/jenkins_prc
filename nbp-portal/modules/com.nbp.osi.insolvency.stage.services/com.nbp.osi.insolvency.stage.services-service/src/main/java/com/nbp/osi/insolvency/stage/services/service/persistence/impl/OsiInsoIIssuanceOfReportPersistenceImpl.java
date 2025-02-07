/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service.persistence.impl;

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

import com.nbp.osi.insolvency.stage.services.exception.NoSuchOsiInsoIIssuanceOfReportException;
import com.nbp.osi.insolvency.stage.services.model.OsiInsoIIssuanceOfReport;
import com.nbp.osi.insolvency.stage.services.model.OsiInsoIIssuanceOfReportTable;
import com.nbp.osi.insolvency.stage.services.model.impl.OsiInsoIIssuanceOfReportImpl;
import com.nbp.osi.insolvency.stage.services.model.impl.OsiInsoIIssuanceOfReportModelImpl;
import com.nbp.osi.insolvency.stage.services.service.persistence.OsiInsoIIssuanceOfReportPersistence;
import com.nbp.osi.insolvency.stage.services.service.persistence.OsiInsoIIssuanceOfReportUtil;
import com.nbp.osi.insolvency.stage.services.service.persistence.impl.constants.OSI_INSOLVENCY_STAGESPersistenceConstants;

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
 * The persistence implementation for the osi inso i issuance of report service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiInsoIIssuanceOfReportPersistence.class)
public class OsiInsoIIssuanceOfReportPersistenceImpl
	extends BasePersistenceImpl<OsiInsoIIssuanceOfReport>
	implements OsiInsoIIssuanceOfReportPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiInsoIIssuanceOfReportUtil</code> to access the osi inso i issuance of report persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiInsoIIssuanceOfReportImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOSIIRIssuanceOfReportBy_CI;
	private FinderPath _finderPathCountBygetOSIIRIssuanceOfReportBy_CI;

	/**
	 * Returns the osi inso i issuance of report where caseId = &#63; or throws a <code>NoSuchOsiInsoIIssuanceOfReportException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi inso i issuance of report
	 * @throws NoSuchOsiInsoIIssuanceOfReportException if a matching osi inso i issuance of report could not be found
	 */
	@Override
	public OsiInsoIIssuanceOfReport findBygetOSIIRIssuanceOfReportBy_CI(
			String caseId)
		throws NoSuchOsiInsoIIssuanceOfReportException {

		OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport =
			fetchBygetOSIIRIssuanceOfReportBy_CI(caseId);

		if (osiInsoIIssuanceOfReport == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiInsoIIssuanceOfReportException(sb.toString());
		}

		return osiInsoIIssuanceOfReport;
	}

	/**
	 * Returns the osi inso i issuance of report where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi inso i issuance of report, or <code>null</code> if a matching osi inso i issuance of report could not be found
	 */
	@Override
	public OsiInsoIIssuanceOfReport fetchBygetOSIIRIssuanceOfReportBy_CI(
		String caseId) {

		return fetchBygetOSIIRIssuanceOfReportBy_CI(caseId, true);
	}

	/**
	 * Returns the osi inso i issuance of report where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi inso i issuance of report, or <code>null</code> if a matching osi inso i issuance of report could not be found
	 */
	@Override
	public OsiInsoIIssuanceOfReport fetchBygetOSIIRIssuanceOfReportBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOSIIRIssuanceOfReportBy_CI, finderArgs,
				this);
		}

		if (result instanceof OsiInsoIIssuanceOfReport) {
			OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport =
				(OsiInsoIIssuanceOfReport)result;

			if (!Objects.equals(caseId, osiInsoIIssuanceOfReport.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSIINSOIISSUANCEOFREPORT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSIIRISSUANCEOFREPORTBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETOSIIRISSUANCEOFREPORTBY_CI_CASEID_2);
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

				List<OsiInsoIIssuanceOfReport> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOSIIRIssuanceOfReportBy_CI,
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
								"OsiInsoIIssuanceOfReportPersistenceImpl.fetchBygetOSIIRIssuanceOfReportBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport =
						list.get(0);

					result = osiInsoIIssuanceOfReport;

					cacheResult(osiInsoIIssuanceOfReport);
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
			return (OsiInsoIIssuanceOfReport)result;
		}
	}

	/**
	 * Removes the osi inso i issuance of report where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi inso i issuance of report that was removed
	 */
	@Override
	public OsiInsoIIssuanceOfReport removeBygetOSIIRIssuanceOfReportBy_CI(
			String caseId)
		throws NoSuchOsiInsoIIssuanceOfReportException {

		OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport =
			findBygetOSIIRIssuanceOfReportBy_CI(caseId);

		return remove(osiInsoIIssuanceOfReport);
	}

	/**
	 * Returns the number of osi inso i issuance of reports where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi inso i issuance of reports
	 */
	@Override
	public int countBygetOSIIRIssuanceOfReportBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetOSIIRIssuanceOfReportBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIINSOIISSUANCEOFREPORT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSIIRISSUANCEOFREPORTBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETOSIIRISSUANCEOFREPORTBY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETOSIIRISSUANCEOFREPORTBY_CI_CASEID_2 =
			"osiInsoIIssuanceOfReport.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETOSIIRISSUANCEOFREPORTBY_CI_CASEID_3 =
			"(osiInsoIIssuanceOfReport.caseId IS NULL OR osiInsoIIssuanceOfReport.caseId = '')";

	public OsiInsoIIssuanceOfReportPersistenceImpl() {
		setModelClass(OsiInsoIIssuanceOfReport.class);

		setModelImplClass(OsiInsoIIssuanceOfReportImpl.class);
		setModelPKClass(long.class);

		setTable(OsiInsoIIssuanceOfReportTable.INSTANCE);
	}

	/**
	 * Caches the osi inso i issuance of report in the entity cache if it is enabled.
	 *
	 * @param osiInsoIIssuanceOfReport the osi inso i issuance of report
	 */
	@Override
	public void cacheResult(OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport) {
		entityCache.putResult(
			OsiInsoIIssuanceOfReportImpl.class,
			osiInsoIIssuanceOfReport.getPrimaryKey(), osiInsoIIssuanceOfReport);

		finderCache.putResult(
			_finderPathFetchBygetOSIIRIssuanceOfReportBy_CI,
			new Object[] {osiInsoIIssuanceOfReport.getCaseId()},
			osiInsoIIssuanceOfReport);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi inso i issuance of reports in the entity cache if it is enabled.
	 *
	 * @param osiInsoIIssuanceOfReports the osi inso i issuance of reports
	 */
	@Override
	public void cacheResult(
		List<OsiInsoIIssuanceOfReport> osiInsoIIssuanceOfReports) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiInsoIIssuanceOfReports.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport :
				osiInsoIIssuanceOfReports) {

			if (entityCache.getResult(
					OsiInsoIIssuanceOfReportImpl.class,
					osiInsoIIssuanceOfReport.getPrimaryKey()) == null) {

				cacheResult(osiInsoIIssuanceOfReport);
			}
		}
	}

	/**
	 * Clears the cache for all osi inso i issuance of reports.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiInsoIIssuanceOfReportImpl.class);

		finderCache.clearCache(OsiInsoIIssuanceOfReportImpl.class);
	}

	/**
	 * Clears the cache for the osi inso i issuance of report.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport) {
		entityCache.removeResult(
			OsiInsoIIssuanceOfReportImpl.class, osiInsoIIssuanceOfReport);
	}

	@Override
	public void clearCache(
		List<OsiInsoIIssuanceOfReport> osiInsoIIssuanceOfReports) {

		for (OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport :
				osiInsoIIssuanceOfReports) {

			entityCache.removeResult(
				OsiInsoIIssuanceOfReportImpl.class, osiInsoIIssuanceOfReport);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiInsoIIssuanceOfReportImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiInsoIIssuanceOfReportImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiInsoIIssuanceOfReportModelImpl osiInsoIIssuanceOfReportModelImpl) {

		Object[] args = new Object[] {
			osiInsoIIssuanceOfReportModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetOSIIRIssuanceOfReportBy_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOSIIRIssuanceOfReportBy_CI, args,
			osiInsoIIssuanceOfReportModelImpl);
	}

	/**
	 * Creates a new osi inso i issuance of report with the primary key. Does not add the osi inso i issuance of report to the database.
	 *
	 * @param osiInsoIIssuanceOfReportId the primary key for the new osi inso i issuance of report
	 * @return the new osi inso i issuance of report
	 */
	@Override
	public OsiInsoIIssuanceOfReport create(long osiInsoIIssuanceOfReportId) {
		OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport =
			new OsiInsoIIssuanceOfReportImpl();

		osiInsoIIssuanceOfReport.setNew(true);
		osiInsoIIssuanceOfReport.setPrimaryKey(osiInsoIIssuanceOfReportId);

		osiInsoIIssuanceOfReport.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return osiInsoIIssuanceOfReport;
	}

	/**
	 * Removes the osi inso i issuance of report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInsoIIssuanceOfReportId the primary key of the osi inso i issuance of report
	 * @return the osi inso i issuance of report that was removed
	 * @throws NoSuchOsiInsoIIssuanceOfReportException if a osi inso i issuance of report with the primary key could not be found
	 */
	@Override
	public OsiInsoIIssuanceOfReport remove(long osiInsoIIssuanceOfReportId)
		throws NoSuchOsiInsoIIssuanceOfReportException {

		return remove((Serializable)osiInsoIIssuanceOfReportId);
	}

	/**
	 * Removes the osi inso i issuance of report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi inso i issuance of report
	 * @return the osi inso i issuance of report that was removed
	 * @throws NoSuchOsiInsoIIssuanceOfReportException if a osi inso i issuance of report with the primary key could not be found
	 */
	@Override
	public OsiInsoIIssuanceOfReport remove(Serializable primaryKey)
		throws NoSuchOsiInsoIIssuanceOfReportException {

		Session session = null;

		try {
			session = openSession();

			OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport =
				(OsiInsoIIssuanceOfReport)session.get(
					OsiInsoIIssuanceOfReportImpl.class, primaryKey);

			if (osiInsoIIssuanceOfReport == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiInsoIIssuanceOfReportException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiInsoIIssuanceOfReport);
		}
		catch (NoSuchOsiInsoIIssuanceOfReportException noSuchEntityException) {
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
	protected OsiInsoIIssuanceOfReport removeImpl(
		OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiInsoIIssuanceOfReport)) {
				osiInsoIIssuanceOfReport =
					(OsiInsoIIssuanceOfReport)session.get(
						OsiInsoIIssuanceOfReportImpl.class,
						osiInsoIIssuanceOfReport.getPrimaryKeyObj());
			}

			if (osiInsoIIssuanceOfReport != null) {
				session.delete(osiInsoIIssuanceOfReport);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiInsoIIssuanceOfReport != null) {
			clearCache(osiInsoIIssuanceOfReport);
		}

		return osiInsoIIssuanceOfReport;
	}

	@Override
	public OsiInsoIIssuanceOfReport updateImpl(
		OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport) {

		boolean isNew = osiInsoIIssuanceOfReport.isNew();

		if (!(osiInsoIIssuanceOfReport instanceof
				OsiInsoIIssuanceOfReportModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiInsoIIssuanceOfReport.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiInsoIIssuanceOfReport);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiInsoIIssuanceOfReport proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiInsoIIssuanceOfReport implementation " +
					osiInsoIIssuanceOfReport.getClass());
		}

		OsiInsoIIssuanceOfReportModelImpl osiInsoIIssuanceOfReportModelImpl =
			(OsiInsoIIssuanceOfReportModelImpl)osiInsoIIssuanceOfReport;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiInsoIIssuanceOfReport.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiInsoIIssuanceOfReport.setCreateDate(date);
			}
			else {
				osiInsoIIssuanceOfReport.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiInsoIIssuanceOfReportModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiInsoIIssuanceOfReport.setModifiedDate(date);
			}
			else {
				osiInsoIIssuanceOfReport.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiInsoIIssuanceOfReport);
			}
			else {
				osiInsoIIssuanceOfReport =
					(OsiInsoIIssuanceOfReport)session.merge(
						osiInsoIIssuanceOfReport);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiInsoIIssuanceOfReportImpl.class,
			osiInsoIIssuanceOfReportModelImpl, false, true);

		cacheUniqueFindersCache(osiInsoIIssuanceOfReportModelImpl);

		if (isNew) {
			osiInsoIIssuanceOfReport.setNew(false);
		}

		osiInsoIIssuanceOfReport.resetOriginalValues();

		return osiInsoIIssuanceOfReport;
	}

	/**
	 * Returns the osi inso i issuance of report with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi inso i issuance of report
	 * @return the osi inso i issuance of report
	 * @throws NoSuchOsiInsoIIssuanceOfReportException if a osi inso i issuance of report with the primary key could not be found
	 */
	@Override
	public OsiInsoIIssuanceOfReport findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOsiInsoIIssuanceOfReportException {

		OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport = fetchByPrimaryKey(
			primaryKey);

		if (osiInsoIIssuanceOfReport == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiInsoIIssuanceOfReportException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiInsoIIssuanceOfReport;
	}

	/**
	 * Returns the osi inso i issuance of report with the primary key or throws a <code>NoSuchOsiInsoIIssuanceOfReportException</code> if it could not be found.
	 *
	 * @param osiInsoIIssuanceOfReportId the primary key of the osi inso i issuance of report
	 * @return the osi inso i issuance of report
	 * @throws NoSuchOsiInsoIIssuanceOfReportException if a osi inso i issuance of report with the primary key could not be found
	 */
	@Override
	public OsiInsoIIssuanceOfReport findByPrimaryKey(
			long osiInsoIIssuanceOfReportId)
		throws NoSuchOsiInsoIIssuanceOfReportException {

		return findByPrimaryKey((Serializable)osiInsoIIssuanceOfReportId);
	}

	/**
	 * Returns the osi inso i issuance of report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInsoIIssuanceOfReportId the primary key of the osi inso i issuance of report
	 * @return the osi inso i issuance of report, or <code>null</code> if a osi inso i issuance of report with the primary key could not be found
	 */
	@Override
	public OsiInsoIIssuanceOfReport fetchByPrimaryKey(
		long osiInsoIIssuanceOfReportId) {

		return fetchByPrimaryKey((Serializable)osiInsoIIssuanceOfReportId);
	}

	/**
	 * Returns all the osi inso i issuance of reports.
	 *
	 * @return the osi inso i issuance of reports
	 */
	@Override
	public List<OsiInsoIIssuanceOfReport> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi inso i issuance of reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsoIIssuanceOfReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi inso i issuance of reports
	 * @param end the upper bound of the range of osi inso i issuance of reports (not inclusive)
	 * @return the range of osi inso i issuance of reports
	 */
	@Override
	public List<OsiInsoIIssuanceOfReport> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi inso i issuance of reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsoIIssuanceOfReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi inso i issuance of reports
	 * @param end the upper bound of the range of osi inso i issuance of reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi inso i issuance of reports
	 */
	@Override
	public List<OsiInsoIIssuanceOfReport> findAll(
		int start, int end,
		OrderByComparator<OsiInsoIIssuanceOfReport> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi inso i issuance of reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsoIIssuanceOfReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi inso i issuance of reports
	 * @param end the upper bound of the range of osi inso i issuance of reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi inso i issuance of reports
	 */
	@Override
	public List<OsiInsoIIssuanceOfReport> findAll(
		int start, int end,
		OrderByComparator<OsiInsoIIssuanceOfReport> orderByComparator,
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

		List<OsiInsoIIssuanceOfReport> list = null;

		if (useFinderCache) {
			list = (List<OsiInsoIIssuanceOfReport>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSIINSOIISSUANCEOFREPORT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSIINSOIISSUANCEOFREPORT;

				sql = sql.concat(
					OsiInsoIIssuanceOfReportModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiInsoIIssuanceOfReport>)QueryUtil.list(
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
	 * Removes all the osi inso i issuance of reports from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport : findAll()) {
			remove(osiInsoIIssuanceOfReport);
		}
	}

	/**
	 * Returns the number of osi inso i issuance of reports.
	 *
	 * @return the number of osi inso i issuance of reports
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
					_SQL_COUNT_OSIINSOIISSUANCEOFREPORT);

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
		return "osiInsoIIssuanceOfReportId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSIINSOIISSUANCEOFREPORT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiInsoIIssuanceOfReportModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi inso i issuance of report persistence.
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

		_finderPathFetchBygetOSIIRIssuanceOfReportBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOSIIRIssuanceOfReportBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetOSIIRIssuanceOfReportBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSIIRIssuanceOfReportBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		OsiInsoIIssuanceOfReportUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiInsoIIssuanceOfReportUtil.setPersistence(null);

		entityCache.removeCache(OsiInsoIIssuanceOfReportImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCY_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCY_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCY_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OSIINSOIISSUANCEOFREPORT =
		"SELECT osiInsoIIssuanceOfReport FROM OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport";

	private static final String _SQL_SELECT_OSIINSOIISSUANCEOFREPORT_WHERE =
		"SELECT osiInsoIIssuanceOfReport FROM OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport WHERE ";

	private static final String _SQL_COUNT_OSIINSOIISSUANCEOFREPORT =
		"SELECT COUNT(osiInsoIIssuanceOfReport) FROM OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport";

	private static final String _SQL_COUNT_OSIINSOIISSUANCEOFREPORT_WHERE =
		"SELECT COUNT(osiInsoIIssuanceOfReport) FROM OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiInsoIIssuanceOfReport.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiInsoIIssuanceOfReport exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiInsoIIssuanceOfReport exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiInsoIIssuanceOfReportPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}