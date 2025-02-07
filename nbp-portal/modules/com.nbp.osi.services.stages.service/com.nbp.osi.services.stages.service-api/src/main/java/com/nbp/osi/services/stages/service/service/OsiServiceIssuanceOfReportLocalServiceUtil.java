/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.services.stages.service.model.OsiServiceIssuanceOfReport;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiServiceIssuanceOfReport. This utility wraps
 * <code>com.nbp.osi.services.stages.service.service.impl.OsiServiceIssuanceOfReportLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServiceIssuanceOfReportLocalService
 * @generated
 */
public class OsiServiceIssuanceOfReportLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.services.stages.service.service.impl.OsiServiceIssuanceOfReportLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi service issuance of report to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServiceIssuanceOfReportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServiceIssuanceOfReport the osi service issuance of report
	 * @return the osi service issuance of report that was added
	 */
	public static OsiServiceIssuanceOfReport addOsiServiceIssuanceOfReport(
		OsiServiceIssuanceOfReport osiServiceIssuanceOfReport) {

		return getService().addOsiServiceIssuanceOfReport(
			osiServiceIssuanceOfReport);
	}

	/**
	 * Creates a new osi service issuance of report with the primary key. Does not add the osi service issuance of report to the database.
	 *
	 * @param osiServiceIssuanceOfReportId the primary key for the new osi service issuance of report
	 * @return the new osi service issuance of report
	 */
	public static OsiServiceIssuanceOfReport createOsiServiceIssuanceOfReport(
		long osiServiceIssuanceOfReportId) {

		return getService().createOsiServiceIssuanceOfReport(
			osiServiceIssuanceOfReportId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the osi service issuance of report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServiceIssuanceOfReportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServiceIssuanceOfReportId the primary key of the osi service issuance of report
	 * @return the osi service issuance of report that was removed
	 * @throws PortalException if a osi service issuance of report with the primary key could not be found
	 */
	public static OsiServiceIssuanceOfReport deleteOsiServiceIssuanceOfReport(
			long osiServiceIssuanceOfReportId)
		throws PortalException {

		return getService().deleteOsiServiceIssuanceOfReport(
			osiServiceIssuanceOfReportId);
	}

	/**
	 * Deletes the osi service issuance of report from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServiceIssuanceOfReportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServiceIssuanceOfReport the osi service issuance of report
	 * @return the osi service issuance of report that was removed
	 */
	public static OsiServiceIssuanceOfReport deleteOsiServiceIssuanceOfReport(
		OsiServiceIssuanceOfReport osiServiceIssuanceOfReport) {

		return getService().deleteOsiServiceIssuanceOfReport(
			osiServiceIssuanceOfReport);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.stages.service.model.impl.OsiServiceIssuanceOfReportModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.stages.service.model.impl.OsiServiceIssuanceOfReportModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static OsiServiceIssuanceOfReport fetchOsiServiceIssuanceOfReport(
		long osiServiceIssuanceOfReportId) {

		return getService().fetchOsiServiceIssuanceOfReport(
			osiServiceIssuanceOfReportId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static OsiServiceIssuanceOfReport getOSIIssuanceOfReportBy_CI(
			String caseId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOsiServiceIssuanceOfReportException {

		return getService().getOSIIssuanceOfReportBy_CI(caseId);
	}

	/**
	 * Returns the osi service issuance of report with the primary key.
	 *
	 * @param osiServiceIssuanceOfReportId the primary key of the osi service issuance of report
	 * @return the osi service issuance of report
	 * @throws PortalException if a osi service issuance of report with the primary key could not be found
	 */
	public static OsiServiceIssuanceOfReport getOsiServiceIssuanceOfReport(
			long osiServiceIssuanceOfReportId)
		throws PortalException {

		return getService().getOsiServiceIssuanceOfReport(
			osiServiceIssuanceOfReportId);
	}

	/**
	 * Returns a range of all the osi service issuance of reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.stages.service.model.impl.OsiServiceIssuanceOfReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service issuance of reports
	 * @param end the upper bound of the range of osi service issuance of reports (not inclusive)
	 * @return the range of osi service issuance of reports
	 */
	public static List<OsiServiceIssuanceOfReport>
		getOsiServiceIssuanceOfReports(int start, int end) {

		return getService().getOsiServiceIssuanceOfReports(start, end);
	}

	/**
	 * Returns the number of osi service issuance of reports.
	 *
	 * @return the number of osi service issuance of reports
	 */
	public static int getOsiServiceIssuanceOfReportsCount() {
		return getService().getOsiServiceIssuanceOfReportsCount();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static OsiServiceIssuanceOfReport updateInsoIIssuanceOfReport(
		String caseId, java.util.Date dateOfReport, String nameOfApplicant,
		String typeOfApplicant, String decision) {

		return getService().updateInsoIIssuanceOfReport(
			caseId, dateOfReport, nameOfApplicant, typeOfApplicant, decision);
	}

	/**
	 * Updates the osi service issuance of report in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServiceIssuanceOfReportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServiceIssuanceOfReport the osi service issuance of report
	 * @return the osi service issuance of report that was updated
	 */
	public static OsiServiceIssuanceOfReport updateOsiServiceIssuanceOfReport(
		OsiServiceIssuanceOfReport osiServiceIssuanceOfReport) {

		return getService().updateOsiServiceIssuanceOfReport(
			osiServiceIssuanceOfReport);
	}

	public static OsiServiceIssuanceOfReportLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OsiServiceIssuanceOfReportLocalService>
		_serviceSnapshot = new Snapshot<>(
			OsiServiceIssuanceOfReportLocalServiceUtil.class,
			OsiServiceIssuanceOfReportLocalService.class);

}