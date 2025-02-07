/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.stage.services.model.OsiInsoIIssuanceOfReport;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi inso i issuance of report service. This utility wraps <code>com.nbp.osi.insolvency.stage.services.service.persistence.impl.OsiInsoIIssuanceOfReportPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsoIIssuanceOfReportPersistence
 * @generated
 */
public class OsiInsoIIssuanceOfReportUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport) {

		getPersistence().clearCache(osiInsoIIssuanceOfReport);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, OsiInsoIIssuanceOfReport>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiInsoIIssuanceOfReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiInsoIIssuanceOfReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiInsoIIssuanceOfReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiInsoIIssuanceOfReport> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiInsoIIssuanceOfReport update(
		OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport) {

		return getPersistence().update(osiInsoIIssuanceOfReport);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiInsoIIssuanceOfReport update(
		OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport,
		ServiceContext serviceContext) {

		return getPersistence().update(
			osiInsoIIssuanceOfReport, serviceContext);
	}

	/**
	 * Returns the osi inso i issuance of report where caseId = &#63; or throws a <code>NoSuchOsiInsoIIssuanceOfReportException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi inso i issuance of report
	 * @throws NoSuchOsiInsoIIssuanceOfReportException if a matching osi inso i issuance of report could not be found
	 */
	public static OsiInsoIIssuanceOfReport findBygetOSIIRIssuanceOfReportBy_CI(
			String caseId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsoIIssuanceOfReportException {

		return getPersistence().findBygetOSIIRIssuanceOfReportBy_CI(caseId);
	}

	/**
	 * Returns the osi inso i issuance of report where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi inso i issuance of report, or <code>null</code> if a matching osi inso i issuance of report could not be found
	 */
	public static OsiInsoIIssuanceOfReport fetchBygetOSIIRIssuanceOfReportBy_CI(
		String caseId) {

		return getPersistence().fetchBygetOSIIRIssuanceOfReportBy_CI(caseId);
	}

	/**
	 * Returns the osi inso i issuance of report where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi inso i issuance of report, or <code>null</code> if a matching osi inso i issuance of report could not be found
	 */
	public static OsiInsoIIssuanceOfReport fetchBygetOSIIRIssuanceOfReportBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetOSIIRIssuanceOfReportBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the osi inso i issuance of report where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi inso i issuance of report that was removed
	 */
	public static OsiInsoIIssuanceOfReport
			removeBygetOSIIRIssuanceOfReportBy_CI(String caseId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsoIIssuanceOfReportException {

		return getPersistence().removeBygetOSIIRIssuanceOfReportBy_CI(caseId);
	}

	/**
	 * Returns the number of osi inso i issuance of reports where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi inso i issuance of reports
	 */
	public static int countBygetOSIIRIssuanceOfReportBy_CI(String caseId) {
		return getPersistence().countBygetOSIIRIssuanceOfReportBy_CI(caseId);
	}

	/**
	 * Caches the osi inso i issuance of report in the entity cache if it is enabled.
	 *
	 * @param osiInsoIIssuanceOfReport the osi inso i issuance of report
	 */
	public static void cacheResult(
		OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport) {

		getPersistence().cacheResult(osiInsoIIssuanceOfReport);
	}

	/**
	 * Caches the osi inso i issuance of reports in the entity cache if it is enabled.
	 *
	 * @param osiInsoIIssuanceOfReports the osi inso i issuance of reports
	 */
	public static void cacheResult(
		List<OsiInsoIIssuanceOfReport> osiInsoIIssuanceOfReports) {

		getPersistence().cacheResult(osiInsoIIssuanceOfReports);
	}

	/**
	 * Creates a new osi inso i issuance of report with the primary key. Does not add the osi inso i issuance of report to the database.
	 *
	 * @param osiInsoIIssuanceOfReportId the primary key for the new osi inso i issuance of report
	 * @return the new osi inso i issuance of report
	 */
	public static OsiInsoIIssuanceOfReport create(
		long osiInsoIIssuanceOfReportId) {

		return getPersistence().create(osiInsoIIssuanceOfReportId);
	}

	/**
	 * Removes the osi inso i issuance of report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInsoIIssuanceOfReportId the primary key of the osi inso i issuance of report
	 * @return the osi inso i issuance of report that was removed
	 * @throws NoSuchOsiInsoIIssuanceOfReportException if a osi inso i issuance of report with the primary key could not be found
	 */
	public static OsiInsoIIssuanceOfReport remove(
			long osiInsoIIssuanceOfReportId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsoIIssuanceOfReportException {

		return getPersistence().remove(osiInsoIIssuanceOfReportId);
	}

	public static OsiInsoIIssuanceOfReport updateImpl(
		OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport) {

		return getPersistence().updateImpl(osiInsoIIssuanceOfReport);
	}

	/**
	 * Returns the osi inso i issuance of report with the primary key or throws a <code>NoSuchOsiInsoIIssuanceOfReportException</code> if it could not be found.
	 *
	 * @param osiInsoIIssuanceOfReportId the primary key of the osi inso i issuance of report
	 * @return the osi inso i issuance of report
	 * @throws NoSuchOsiInsoIIssuanceOfReportException if a osi inso i issuance of report with the primary key could not be found
	 */
	public static OsiInsoIIssuanceOfReport findByPrimaryKey(
			long osiInsoIIssuanceOfReportId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsoIIssuanceOfReportException {

		return getPersistence().findByPrimaryKey(osiInsoIIssuanceOfReportId);
	}

	/**
	 * Returns the osi inso i issuance of report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInsoIIssuanceOfReportId the primary key of the osi inso i issuance of report
	 * @return the osi inso i issuance of report, or <code>null</code> if a osi inso i issuance of report with the primary key could not be found
	 */
	public static OsiInsoIIssuanceOfReport fetchByPrimaryKey(
		long osiInsoIIssuanceOfReportId) {

		return getPersistence().fetchByPrimaryKey(osiInsoIIssuanceOfReportId);
	}

	/**
	 * Returns all the osi inso i issuance of reports.
	 *
	 * @return the osi inso i issuance of reports
	 */
	public static List<OsiInsoIIssuanceOfReport> findAll() {
		return getPersistence().findAll();
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
	public static List<OsiInsoIIssuanceOfReport> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<OsiInsoIIssuanceOfReport> findAll(
		int start, int end,
		OrderByComparator<OsiInsoIIssuanceOfReport> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<OsiInsoIIssuanceOfReport> findAll(
		int start, int end,
		OrderByComparator<OsiInsoIIssuanceOfReport> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi inso i issuance of reports from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi inso i issuance of reports.
	 *
	 * @return the number of osi inso i issuance of reports
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiInsoIIssuanceOfReportPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OsiInsoIIssuanceOfReportPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OsiInsoIIssuanceOfReportPersistence _persistence;

}