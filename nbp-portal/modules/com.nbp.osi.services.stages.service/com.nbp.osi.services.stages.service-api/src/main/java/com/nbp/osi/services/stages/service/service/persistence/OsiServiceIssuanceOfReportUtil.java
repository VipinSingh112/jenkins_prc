/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.services.stages.service.model.OsiServiceIssuanceOfReport;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi service issuance of report service. This utility wraps <code>com.nbp.osi.services.stages.service.service.persistence.impl.OsiServiceIssuanceOfReportPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServiceIssuanceOfReportPersistence
 * @generated
 */
public class OsiServiceIssuanceOfReportUtil {

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
		OsiServiceIssuanceOfReport osiServiceIssuanceOfReport) {

		getPersistence().clearCache(osiServiceIssuanceOfReport);
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
	public static Map<Serializable, OsiServiceIssuanceOfReport>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiServiceIssuanceOfReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiServiceIssuanceOfReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiServiceIssuanceOfReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiServiceIssuanceOfReport> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiServiceIssuanceOfReport update(
		OsiServiceIssuanceOfReport osiServiceIssuanceOfReport) {

		return getPersistence().update(osiServiceIssuanceOfReport);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiServiceIssuanceOfReport update(
		OsiServiceIssuanceOfReport osiServiceIssuanceOfReport,
		ServiceContext serviceContext) {

		return getPersistence().update(
			osiServiceIssuanceOfReport, serviceContext);
	}

	/**
	 * Returns the osi service issuance of report where caseId = &#63; or throws a <code>NoSuchOsiServiceIssuanceOfReportException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi service issuance of report
	 * @throws NoSuchOsiServiceIssuanceOfReportException if a matching osi service issuance of report could not be found
	 */
	public static OsiServiceIssuanceOfReport findBygetOSIIssuanceOfReportBy_CI(
			String caseId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOsiServiceIssuanceOfReportException {

		return getPersistence().findBygetOSIIssuanceOfReportBy_CI(caseId);
	}

	/**
	 * Returns the osi service issuance of report where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi service issuance of report, or <code>null</code> if a matching osi service issuance of report could not be found
	 */
	public static OsiServiceIssuanceOfReport fetchBygetOSIIssuanceOfReportBy_CI(
		String caseId) {

		return getPersistence().fetchBygetOSIIssuanceOfReportBy_CI(caseId);
	}

	/**
	 * Returns the osi service issuance of report where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi service issuance of report, or <code>null</code> if a matching osi service issuance of report could not be found
	 */
	public static OsiServiceIssuanceOfReport fetchBygetOSIIssuanceOfReportBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetOSIIssuanceOfReportBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the osi service issuance of report where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi service issuance of report that was removed
	 */
	public static OsiServiceIssuanceOfReport
			removeBygetOSIIssuanceOfReportBy_CI(String caseId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOsiServiceIssuanceOfReportException {

		return getPersistence().removeBygetOSIIssuanceOfReportBy_CI(caseId);
	}

	/**
	 * Returns the number of osi service issuance of reports where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi service issuance of reports
	 */
	public static int countBygetOSIIssuanceOfReportBy_CI(String caseId) {
		return getPersistence().countBygetOSIIssuanceOfReportBy_CI(caseId);
	}

	/**
	 * Caches the osi service issuance of report in the entity cache if it is enabled.
	 *
	 * @param osiServiceIssuanceOfReport the osi service issuance of report
	 */
	public static void cacheResult(
		OsiServiceIssuanceOfReport osiServiceIssuanceOfReport) {

		getPersistence().cacheResult(osiServiceIssuanceOfReport);
	}

	/**
	 * Caches the osi service issuance of reports in the entity cache if it is enabled.
	 *
	 * @param osiServiceIssuanceOfReports the osi service issuance of reports
	 */
	public static void cacheResult(
		List<OsiServiceIssuanceOfReport> osiServiceIssuanceOfReports) {

		getPersistence().cacheResult(osiServiceIssuanceOfReports);
	}

	/**
	 * Creates a new osi service issuance of report with the primary key. Does not add the osi service issuance of report to the database.
	 *
	 * @param osiServiceIssuanceOfReportId the primary key for the new osi service issuance of report
	 * @return the new osi service issuance of report
	 */
	public static OsiServiceIssuanceOfReport create(
		long osiServiceIssuanceOfReportId) {

		return getPersistence().create(osiServiceIssuanceOfReportId);
	}

	/**
	 * Removes the osi service issuance of report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiServiceIssuanceOfReportId the primary key of the osi service issuance of report
	 * @return the osi service issuance of report that was removed
	 * @throws NoSuchOsiServiceIssuanceOfReportException if a osi service issuance of report with the primary key could not be found
	 */
	public static OsiServiceIssuanceOfReport remove(
			long osiServiceIssuanceOfReportId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOsiServiceIssuanceOfReportException {

		return getPersistence().remove(osiServiceIssuanceOfReportId);
	}

	public static OsiServiceIssuanceOfReport updateImpl(
		OsiServiceIssuanceOfReport osiServiceIssuanceOfReport) {

		return getPersistence().updateImpl(osiServiceIssuanceOfReport);
	}

	/**
	 * Returns the osi service issuance of report with the primary key or throws a <code>NoSuchOsiServiceIssuanceOfReportException</code> if it could not be found.
	 *
	 * @param osiServiceIssuanceOfReportId the primary key of the osi service issuance of report
	 * @return the osi service issuance of report
	 * @throws NoSuchOsiServiceIssuanceOfReportException if a osi service issuance of report with the primary key could not be found
	 */
	public static OsiServiceIssuanceOfReport findByPrimaryKey(
			long osiServiceIssuanceOfReportId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOsiServiceIssuanceOfReportException {

		return getPersistence().findByPrimaryKey(osiServiceIssuanceOfReportId);
	}

	/**
	 * Returns the osi service issuance of report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiServiceIssuanceOfReportId the primary key of the osi service issuance of report
	 * @return the osi service issuance of report, or <code>null</code> if a osi service issuance of report with the primary key could not be found
	 */
	public static OsiServiceIssuanceOfReport fetchByPrimaryKey(
		long osiServiceIssuanceOfReportId) {

		return getPersistence().fetchByPrimaryKey(osiServiceIssuanceOfReportId);
	}

	/**
	 * Returns all the osi service issuance of reports.
	 *
	 * @return the osi service issuance of reports
	 */
	public static List<OsiServiceIssuanceOfReport> findAll() {
		return getPersistence().findAll();
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
	public static List<OsiServiceIssuanceOfReport> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<OsiServiceIssuanceOfReport> findAll(
		int start, int end,
		OrderByComparator<OsiServiceIssuanceOfReport> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<OsiServiceIssuanceOfReport> findAll(
		int start, int end,
		OrderByComparator<OsiServiceIssuanceOfReport> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi service issuance of reports from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi service issuance of reports.
	 *
	 * @return the number of osi service issuance of reports
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiServiceIssuanceOfReportPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OsiServiceIssuanceOfReportPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OsiServiceIssuanceOfReportPersistence _persistence;

}