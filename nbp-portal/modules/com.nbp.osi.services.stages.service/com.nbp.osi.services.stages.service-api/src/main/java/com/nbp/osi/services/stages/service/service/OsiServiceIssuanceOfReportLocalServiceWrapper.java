/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiServiceIssuanceOfReportLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServiceIssuanceOfReportLocalService
 * @generated
 */
public class OsiServiceIssuanceOfReportLocalServiceWrapper
	implements OsiServiceIssuanceOfReportLocalService,
			   ServiceWrapper<OsiServiceIssuanceOfReportLocalService> {

	public OsiServiceIssuanceOfReportLocalServiceWrapper() {
		this(null);
	}

	public OsiServiceIssuanceOfReportLocalServiceWrapper(
		OsiServiceIssuanceOfReportLocalService
			osiServiceIssuanceOfReportLocalService) {

		_osiServiceIssuanceOfReportLocalService =
			osiServiceIssuanceOfReportLocalService;
	}

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
	@Override
	public com.nbp.osi.services.stages.service.model.OsiServiceIssuanceOfReport
		addOsiServiceIssuanceOfReport(
			com.nbp.osi.services.stages.service.model.OsiServiceIssuanceOfReport
				osiServiceIssuanceOfReport) {

		return _osiServiceIssuanceOfReportLocalService.
			addOsiServiceIssuanceOfReport(osiServiceIssuanceOfReport);
	}

	/**
	 * Creates a new osi service issuance of report with the primary key. Does not add the osi service issuance of report to the database.
	 *
	 * @param osiServiceIssuanceOfReportId the primary key for the new osi service issuance of report
	 * @return the new osi service issuance of report
	 */
	@Override
	public com.nbp.osi.services.stages.service.model.OsiServiceIssuanceOfReport
		createOsiServiceIssuanceOfReport(long osiServiceIssuanceOfReportId) {

		return _osiServiceIssuanceOfReportLocalService.
			createOsiServiceIssuanceOfReport(osiServiceIssuanceOfReportId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServiceIssuanceOfReportLocalService.createPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.nbp.osi.services.stages.service.model.OsiServiceIssuanceOfReport
			deleteOsiServiceIssuanceOfReport(long osiServiceIssuanceOfReportId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServiceIssuanceOfReportLocalService.
			deleteOsiServiceIssuanceOfReport(osiServiceIssuanceOfReportId);
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
	@Override
	public com.nbp.osi.services.stages.service.model.OsiServiceIssuanceOfReport
		deleteOsiServiceIssuanceOfReport(
			com.nbp.osi.services.stages.service.model.OsiServiceIssuanceOfReport
				osiServiceIssuanceOfReport) {

		return _osiServiceIssuanceOfReportLocalService.
			deleteOsiServiceIssuanceOfReport(osiServiceIssuanceOfReport);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServiceIssuanceOfReportLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiServiceIssuanceOfReportLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiServiceIssuanceOfReportLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiServiceIssuanceOfReportLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _osiServiceIssuanceOfReportLocalService.dynamicQuery(
			dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _osiServiceIssuanceOfReportLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _osiServiceIssuanceOfReportLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _osiServiceIssuanceOfReportLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _osiServiceIssuanceOfReportLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.services.stages.service.model.OsiServiceIssuanceOfReport
		fetchOsiServiceIssuanceOfReport(long osiServiceIssuanceOfReportId) {

		return _osiServiceIssuanceOfReportLocalService.
			fetchOsiServiceIssuanceOfReport(osiServiceIssuanceOfReportId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiServiceIssuanceOfReportLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiServiceIssuanceOfReportLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServiceIssuanceOfReportLocalService.
			getOSGiServiceIdentifier();
	}

	@Override
	public com.nbp.osi.services.stages.service.model.OsiServiceIssuanceOfReport
			getOSIIssuanceOfReportBy_CI(String caseId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOsiServiceIssuanceOfReportException {

		return _osiServiceIssuanceOfReportLocalService.
			getOSIIssuanceOfReportBy_CI(caseId);
	}

	/**
	 * Returns the osi service issuance of report with the primary key.
	 *
	 * @param osiServiceIssuanceOfReportId the primary key of the osi service issuance of report
	 * @return the osi service issuance of report
	 * @throws PortalException if a osi service issuance of report with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.stages.service.model.OsiServiceIssuanceOfReport
			getOsiServiceIssuanceOfReport(long osiServiceIssuanceOfReportId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServiceIssuanceOfReportLocalService.
			getOsiServiceIssuanceOfReport(osiServiceIssuanceOfReportId);
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
	@Override
	public java.util.List
		<com.nbp.osi.services.stages.service.model.OsiServiceIssuanceOfReport>
			getOsiServiceIssuanceOfReports(int start, int end) {

		return _osiServiceIssuanceOfReportLocalService.
			getOsiServiceIssuanceOfReports(start, end);
	}

	/**
	 * Returns the number of osi service issuance of reports.
	 *
	 * @return the number of osi service issuance of reports
	 */
	@Override
	public int getOsiServiceIssuanceOfReportsCount() {
		return _osiServiceIssuanceOfReportLocalService.
			getOsiServiceIssuanceOfReportsCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServiceIssuanceOfReportLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.osi.services.stages.service.model.OsiServiceIssuanceOfReport
		updateInsoIIssuanceOfReport(
			String caseId, java.util.Date dateOfReport, String nameOfApplicant,
			String typeOfApplicant, String decision) {

		return _osiServiceIssuanceOfReportLocalService.
			updateInsoIIssuanceOfReport(
				caseId, dateOfReport, nameOfApplicant, typeOfApplicant,
				decision);
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
	@Override
	public com.nbp.osi.services.stages.service.model.OsiServiceIssuanceOfReport
		updateOsiServiceIssuanceOfReport(
			com.nbp.osi.services.stages.service.model.OsiServiceIssuanceOfReport
				osiServiceIssuanceOfReport) {

		return _osiServiceIssuanceOfReportLocalService.
			updateOsiServiceIssuanceOfReport(osiServiceIssuanceOfReport);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiServiceIssuanceOfReportLocalService.getBasePersistence();
	}

	@Override
	public OsiServiceIssuanceOfReportLocalService getWrappedService() {
		return _osiServiceIssuanceOfReportLocalService;
	}

	@Override
	public void setWrappedService(
		OsiServiceIssuanceOfReportLocalService
			osiServiceIssuanceOfReportLocalService) {

		_osiServiceIssuanceOfReportLocalService =
			osiServiceIssuanceOfReportLocalService;
	}

	private OsiServiceIssuanceOfReportLocalService
		_osiServiceIssuanceOfReportLocalService;

}