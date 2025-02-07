/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.service.persistence.impl;

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

import com.nbp.osi.services.stages.service.exception.NoSuchOsiServiceIssuanceOfReportException;
import com.nbp.osi.services.stages.service.model.OsiServiceIssuanceOfReport;
import com.nbp.osi.services.stages.service.model.OsiServiceIssuanceOfReportTable;
import com.nbp.osi.services.stages.service.model.impl.OsiServiceIssuanceOfReportImpl;
import com.nbp.osi.services.stages.service.model.impl.OsiServiceIssuanceOfReportModelImpl;
import com.nbp.osi.services.stages.service.service.persistence.OsiServiceIssuanceOfReportPersistence;
import com.nbp.osi.services.stages.service.service.persistence.OsiServiceIssuanceOfReportUtil;
import com.nbp.osi.services.stages.service.service.persistence.impl.constants.OSI_SERVICE_STAGESPersistenceConstants;

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
 * The persistence implementation for the osi service issuance of report service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiServiceIssuanceOfReportPersistence.class)
public class OsiServiceIssuanceOfReportPersistenceImpl
	extends BasePersistenceImpl<OsiServiceIssuanceOfReport>
	implements OsiServiceIssuanceOfReportPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiServiceIssuanceOfReportUtil</code> to access the osi service issuance of report persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiServiceIssuanceOfReportImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOSIIssuanceOfReportBy_CI;
	private FinderPath _finderPathCountBygetOSIIssuanceOfReportBy_CI;

	/**
	 * Returns the osi service issuance of report where caseId = &#63; or throws a <code>NoSuchOsiServiceIssuanceOfReportException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi service issuance of report
	 * @throws NoSuchOsiServiceIssuanceOfReportException if a matching osi service issuance of report could not be found
	 */
	@Override
	public OsiServiceIssuanceOfReport findBygetOSIIssuanceOfReportBy_CI(
			String caseId)
		throws NoSuchOsiServiceIssuanceOfReportException {

		OsiServiceIssuanceOfReport osiServiceIssuanceOfReport =
			fetchBygetOSIIssuanceOfReportBy_CI(caseId);

		if (osiServiceIssuanceOfReport == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiServiceIssuanceOfReportException(sb.toString());
		}

		return osiServiceIssuanceOfReport;
	}

	/**
	 * Returns the osi service issuance of report where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi service issuance of report, or <code>null</code> if a matching osi service issuance of report could not be found
	 */
	@Override
	public OsiServiceIssuanceOfReport fetchBygetOSIIssuanceOfReportBy_CI(
		String caseId) {

		return fetchBygetOSIIssuanceOfReportBy_CI(caseId, true);
	}

	/**
	 * Returns the osi service issuance of report where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi service issuance of report, or <code>null</code> if a matching osi service issuance of report could not be found
	 */
	@Override
	public OsiServiceIssuanceOfReport fetchBygetOSIIssuanceOfReportBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOSIIssuanceOfReportBy_CI, finderArgs,
				this);
		}

		if (result instanceof OsiServiceIssuanceOfReport) {
			OsiServiceIssuanceOfReport osiServiceIssuanceOfReport =
				(OsiServiceIssuanceOfReport)result;

			if (!Objects.equals(
					caseId, osiServiceIssuanceOfReport.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSISERVICEISSUANCEOFREPORT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSIISSUANCEOFREPORTBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOSIISSUANCEOFREPORTBY_CI_CASEID_2);
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

				List<OsiServiceIssuanceOfReport> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOSIIssuanceOfReportBy_CI,
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
								"OsiServiceIssuanceOfReportPersistenceImpl.fetchBygetOSIIssuanceOfReportBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiServiceIssuanceOfReport osiServiceIssuanceOfReport =
						list.get(0);

					result = osiServiceIssuanceOfReport;

					cacheResult(osiServiceIssuanceOfReport);
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
			return (OsiServiceIssuanceOfReport)result;
		}
	}

	/**
	 * Removes the osi service issuance of report where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi service issuance of report that was removed
	 */
	@Override
	public OsiServiceIssuanceOfReport removeBygetOSIIssuanceOfReportBy_CI(
			String caseId)
		throws NoSuchOsiServiceIssuanceOfReportException {

		OsiServiceIssuanceOfReport osiServiceIssuanceOfReport =
			findBygetOSIIssuanceOfReportBy_CI(caseId);

		return remove(osiServiceIssuanceOfReport);
	}

	/**
	 * Returns the number of osi service issuance of reports where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi service issuance of reports
	 */
	@Override
	public int countBygetOSIIssuanceOfReportBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetOSIIssuanceOfReportBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICEISSUANCEOFREPORT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSIISSUANCEOFREPORTBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOSIISSUANCEOFREPORTBY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETOSIISSUANCEOFREPORTBY_CI_CASEID_2 =
			"osiServiceIssuanceOfReport.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETOSIISSUANCEOFREPORTBY_CI_CASEID_3 =
			"(osiServiceIssuanceOfReport.caseId IS NULL OR osiServiceIssuanceOfReport.caseId = '')";

	public OsiServiceIssuanceOfReportPersistenceImpl() {
		setModelClass(OsiServiceIssuanceOfReport.class);

		setModelImplClass(OsiServiceIssuanceOfReportImpl.class);
		setModelPKClass(long.class);

		setTable(OsiServiceIssuanceOfReportTable.INSTANCE);
	}

	/**
	 * Caches the osi service issuance of report in the entity cache if it is enabled.
	 *
	 * @param osiServiceIssuanceOfReport the osi service issuance of report
	 */
	@Override
	public void cacheResult(
		OsiServiceIssuanceOfReport osiServiceIssuanceOfReport) {

		entityCache.putResult(
			OsiServiceIssuanceOfReportImpl.class,
			osiServiceIssuanceOfReport.getPrimaryKey(),
			osiServiceIssuanceOfReport);

		finderCache.putResult(
			_finderPathFetchBygetOSIIssuanceOfReportBy_CI,
			new Object[] {osiServiceIssuanceOfReport.getCaseId()},
			osiServiceIssuanceOfReport);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi service issuance of reports in the entity cache if it is enabled.
	 *
	 * @param osiServiceIssuanceOfReports the osi service issuance of reports
	 */
	@Override
	public void cacheResult(
		List<OsiServiceIssuanceOfReport> osiServiceIssuanceOfReports) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiServiceIssuanceOfReports.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiServiceIssuanceOfReport osiServiceIssuanceOfReport :
				osiServiceIssuanceOfReports) {

			if (entityCache.getResult(
					OsiServiceIssuanceOfReportImpl.class,
					osiServiceIssuanceOfReport.getPrimaryKey()) == null) {

				cacheResult(osiServiceIssuanceOfReport);
			}
		}
	}

	/**
	 * Clears the cache for all osi service issuance of reports.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiServiceIssuanceOfReportImpl.class);

		finderCache.clearCache(OsiServiceIssuanceOfReportImpl.class);
	}

	/**
	 * Clears the cache for the osi service issuance of report.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		OsiServiceIssuanceOfReport osiServiceIssuanceOfReport) {

		entityCache.removeResult(
			OsiServiceIssuanceOfReportImpl.class, osiServiceIssuanceOfReport);
	}

	@Override
	public void clearCache(
		List<OsiServiceIssuanceOfReport> osiServiceIssuanceOfReports) {

		for (OsiServiceIssuanceOfReport osiServiceIssuanceOfReport :
				osiServiceIssuanceOfReports) {

			entityCache.removeResult(
				OsiServiceIssuanceOfReportImpl.class,
				osiServiceIssuanceOfReport);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiServiceIssuanceOfReportImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiServiceIssuanceOfReportImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiServiceIssuanceOfReportModelImpl
			osiServiceIssuanceOfReportModelImpl) {

		Object[] args = new Object[] {
			osiServiceIssuanceOfReportModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetOSIIssuanceOfReportBy_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOSIIssuanceOfReportBy_CI, args,
			osiServiceIssuanceOfReportModelImpl);
	}

	/**
	 * Creates a new osi service issuance of report with the primary key. Does not add the osi service issuance of report to the database.
	 *
	 * @param osiServiceIssuanceOfReportId the primary key for the new osi service issuance of report
	 * @return the new osi service issuance of report
	 */
	@Override
	public OsiServiceIssuanceOfReport create(
		long osiServiceIssuanceOfReportId) {

		OsiServiceIssuanceOfReport osiServiceIssuanceOfReport =
			new OsiServiceIssuanceOfReportImpl();

		osiServiceIssuanceOfReport.setNew(true);
		osiServiceIssuanceOfReport.setPrimaryKey(osiServiceIssuanceOfReportId);

		osiServiceIssuanceOfReport.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return osiServiceIssuanceOfReport;
	}

	/**
	 * Removes the osi service issuance of report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiServiceIssuanceOfReportId the primary key of the osi service issuance of report
	 * @return the osi service issuance of report that was removed
	 * @throws NoSuchOsiServiceIssuanceOfReportException if a osi service issuance of report with the primary key could not be found
	 */
	@Override
	public OsiServiceIssuanceOfReport remove(long osiServiceIssuanceOfReportId)
		throws NoSuchOsiServiceIssuanceOfReportException {

		return remove((Serializable)osiServiceIssuanceOfReportId);
	}

	/**
	 * Removes the osi service issuance of report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi service issuance of report
	 * @return the osi service issuance of report that was removed
	 * @throws NoSuchOsiServiceIssuanceOfReportException if a osi service issuance of report with the primary key could not be found
	 */
	@Override
	public OsiServiceIssuanceOfReport remove(Serializable primaryKey)
		throws NoSuchOsiServiceIssuanceOfReportException {

		Session session = null;

		try {
			session = openSession();

			OsiServiceIssuanceOfReport osiServiceIssuanceOfReport =
				(OsiServiceIssuanceOfReport)session.get(
					OsiServiceIssuanceOfReportImpl.class, primaryKey);

			if (osiServiceIssuanceOfReport == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiServiceIssuanceOfReportException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiServiceIssuanceOfReport);
		}
		catch (NoSuchOsiServiceIssuanceOfReportException
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
	protected OsiServiceIssuanceOfReport removeImpl(
		OsiServiceIssuanceOfReport osiServiceIssuanceOfReport) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiServiceIssuanceOfReport)) {
				osiServiceIssuanceOfReport =
					(OsiServiceIssuanceOfReport)session.get(
						OsiServiceIssuanceOfReportImpl.class,
						osiServiceIssuanceOfReport.getPrimaryKeyObj());
			}

			if (osiServiceIssuanceOfReport != null) {
				session.delete(osiServiceIssuanceOfReport);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiServiceIssuanceOfReport != null) {
			clearCache(osiServiceIssuanceOfReport);
		}

		return osiServiceIssuanceOfReport;
	}

	@Override
	public OsiServiceIssuanceOfReport updateImpl(
		OsiServiceIssuanceOfReport osiServiceIssuanceOfReport) {

		boolean isNew = osiServiceIssuanceOfReport.isNew();

		if (!(osiServiceIssuanceOfReport instanceof
				OsiServiceIssuanceOfReportModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiServiceIssuanceOfReport.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiServiceIssuanceOfReport);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiServiceIssuanceOfReport proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiServiceIssuanceOfReport implementation " +
					osiServiceIssuanceOfReport.getClass());
		}

		OsiServiceIssuanceOfReportModelImpl
			osiServiceIssuanceOfReportModelImpl =
				(OsiServiceIssuanceOfReportModelImpl)osiServiceIssuanceOfReport;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiServiceIssuanceOfReport.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiServiceIssuanceOfReport.setCreateDate(date);
			}
			else {
				osiServiceIssuanceOfReport.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiServiceIssuanceOfReportModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiServiceIssuanceOfReport.setModifiedDate(date);
			}
			else {
				osiServiceIssuanceOfReport.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiServiceIssuanceOfReport);
			}
			else {
				osiServiceIssuanceOfReport =
					(OsiServiceIssuanceOfReport)session.merge(
						osiServiceIssuanceOfReport);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiServiceIssuanceOfReportImpl.class,
			osiServiceIssuanceOfReportModelImpl, false, true);

		cacheUniqueFindersCache(osiServiceIssuanceOfReportModelImpl);

		if (isNew) {
			osiServiceIssuanceOfReport.setNew(false);
		}

		osiServiceIssuanceOfReport.resetOriginalValues();

		return osiServiceIssuanceOfReport;
	}

	/**
	 * Returns the osi service issuance of report with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi service issuance of report
	 * @return the osi service issuance of report
	 * @throws NoSuchOsiServiceIssuanceOfReportException if a osi service issuance of report with the primary key could not be found
	 */
	@Override
	public OsiServiceIssuanceOfReport findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOsiServiceIssuanceOfReportException {

		OsiServiceIssuanceOfReport osiServiceIssuanceOfReport =
			fetchByPrimaryKey(primaryKey);

		if (osiServiceIssuanceOfReport == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiServiceIssuanceOfReportException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiServiceIssuanceOfReport;
	}

	/**
	 * Returns the osi service issuance of report with the primary key or throws a <code>NoSuchOsiServiceIssuanceOfReportException</code> if it could not be found.
	 *
	 * @param osiServiceIssuanceOfReportId the primary key of the osi service issuance of report
	 * @return the osi service issuance of report
	 * @throws NoSuchOsiServiceIssuanceOfReportException if a osi service issuance of report with the primary key could not be found
	 */
	@Override
	public OsiServiceIssuanceOfReport findByPrimaryKey(
			long osiServiceIssuanceOfReportId)
		throws NoSuchOsiServiceIssuanceOfReportException {

		return findByPrimaryKey((Serializable)osiServiceIssuanceOfReportId);
	}

	/**
	 * Returns the osi service issuance of report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiServiceIssuanceOfReportId the primary key of the osi service issuance of report
	 * @return the osi service issuance of report, or <code>null</code> if a osi service issuance of report with the primary key could not be found
	 */
	@Override
	public OsiServiceIssuanceOfReport fetchByPrimaryKey(
		long osiServiceIssuanceOfReportId) {

		return fetchByPrimaryKey((Serializable)osiServiceIssuanceOfReportId);
	}

	/**
	 * Returns all the osi service issuance of reports.
	 *
	 * @return the osi service issuance of reports
	 */
	@Override
	public List<OsiServiceIssuanceOfReport> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi service issuance of reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServiceIssuanceOfReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service issuance of reports
	 * @param end the upper bound of the range of osi service issuance of reports (not inclusive)
	 * @return the range of osi service issuance of reports
	 */
	@Override
	public List<OsiServiceIssuanceOfReport> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi service issuance of reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServiceIssuanceOfReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service issuance of reports
	 * @param end the upper bound of the range of osi service issuance of reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi service issuance of reports
	 */
	@Override
	public List<OsiServiceIssuanceOfReport> findAll(
		int start, int end,
		OrderByComparator<OsiServiceIssuanceOfReport> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi service issuance of reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServiceIssuanceOfReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service issuance of reports
	 * @param end the upper bound of the range of osi service issuance of reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi service issuance of reports
	 */
	@Override
	public List<OsiServiceIssuanceOfReport> findAll(
		int start, int end,
		OrderByComparator<OsiServiceIssuanceOfReport> orderByComparator,
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

		List<OsiServiceIssuanceOfReport> list = null;

		if (useFinderCache) {
			list = (List<OsiServiceIssuanceOfReport>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSISERVICEISSUANCEOFREPORT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSISERVICEISSUANCEOFREPORT;

				sql = sql.concat(
					OsiServiceIssuanceOfReportModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiServiceIssuanceOfReport>)QueryUtil.list(
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
	 * Removes all the osi service issuance of reports from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiServiceIssuanceOfReport osiServiceIssuanceOfReport :
				findAll()) {

			remove(osiServiceIssuanceOfReport);
		}
	}

	/**
	 * Returns the number of osi service issuance of reports.
	 *
	 * @return the number of osi service issuance of reports
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
					_SQL_COUNT_OSISERVICEISSUANCEOFREPORT);

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
		return "osiServiceIssuanceOfReportId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSISERVICEISSUANCEOFREPORT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiServiceIssuanceOfReportModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi service issuance of report persistence.
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

		_finderPathFetchBygetOSIIssuanceOfReportBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOSIIssuanceOfReportBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetOSIIssuanceOfReportBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSIIssuanceOfReportBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		OsiServiceIssuanceOfReportUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiServiceIssuanceOfReportUtil.setPersistence(null);

		entityCache.removeCache(OsiServiceIssuanceOfReportImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_SERVICE_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_SERVICE_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_SERVICE_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OSISERVICEISSUANCEOFREPORT =
		"SELECT osiServiceIssuanceOfReport FROM OsiServiceIssuanceOfReport osiServiceIssuanceOfReport";

	private static final String _SQL_SELECT_OSISERVICEISSUANCEOFREPORT_WHERE =
		"SELECT osiServiceIssuanceOfReport FROM OsiServiceIssuanceOfReport osiServiceIssuanceOfReport WHERE ";

	private static final String _SQL_COUNT_OSISERVICEISSUANCEOFREPORT =
		"SELECT COUNT(osiServiceIssuanceOfReport) FROM OsiServiceIssuanceOfReport osiServiceIssuanceOfReport";

	private static final String _SQL_COUNT_OSISERVICEISSUANCEOFREPORT_WHERE =
		"SELECT COUNT(osiServiceIssuanceOfReport) FROM OsiServiceIssuanceOfReport osiServiceIssuanceOfReport WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiServiceIssuanceOfReport.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiServiceIssuanceOfReport exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiServiceIssuanceOfReport exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiServiceIssuanceOfReportPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}