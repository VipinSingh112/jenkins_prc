/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiInsoIIssuanceOfReportLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsoIIssuanceOfReportLocalService
 * @generated
 */
public class OsiInsoIIssuanceOfReportLocalServiceWrapper
	implements OsiInsoIIssuanceOfReportLocalService,
			   ServiceWrapper<OsiInsoIIssuanceOfReportLocalService> {

	public OsiInsoIIssuanceOfReportLocalServiceWrapper() {
		this(null);
	}

	public OsiInsoIIssuanceOfReportLocalServiceWrapper(
		OsiInsoIIssuanceOfReportLocalService
			osiInsoIIssuanceOfReportLocalService) {

		_osiInsoIIssuanceOfReportLocalService =
			osiInsoIIssuanceOfReportLocalService;
	}

	/**
	 * Adds the osi inso i issuance of report to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsoIIssuanceOfReportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsoIIssuanceOfReport the osi inso i issuance of report
	 * @return the osi inso i issuance of report that was added
	 */
	@Override
	public com.nbp.osi.insolvency.stage.services.model.OsiInsoIIssuanceOfReport
		addOsiInsoIIssuanceOfReport(
			com.nbp.osi.insolvency.stage.services.model.OsiInsoIIssuanceOfReport
				osiInsoIIssuanceOfReport) {

		return _osiInsoIIssuanceOfReportLocalService.
			addOsiInsoIIssuanceOfReport(osiInsoIIssuanceOfReport);
	}

	/**
	 * Creates a new osi inso i issuance of report with the primary key. Does not add the osi inso i issuance of report to the database.
	 *
	 * @param osiInsoIIssuanceOfReportId the primary key for the new osi inso i issuance of report
	 * @return the new osi inso i issuance of report
	 */
	@Override
	public com.nbp.osi.insolvency.stage.services.model.OsiInsoIIssuanceOfReport
		createOsiInsoIIssuanceOfReport(long osiInsoIIssuanceOfReportId) {

		return _osiInsoIIssuanceOfReportLocalService.
			createOsiInsoIIssuanceOfReport(osiInsoIIssuanceOfReportId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsoIIssuanceOfReportLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi inso i issuance of report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsoIIssuanceOfReportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsoIIssuanceOfReportId the primary key of the osi inso i issuance of report
	 * @return the osi inso i issuance of report that was removed
	 * @throws PortalException if a osi inso i issuance of report with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.stage.services.model.OsiInsoIIssuanceOfReport
			deleteOsiInsoIIssuanceOfReport(long osiInsoIIssuanceOfReportId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsoIIssuanceOfReportLocalService.
			deleteOsiInsoIIssuanceOfReport(osiInsoIIssuanceOfReportId);
	}

	/**
	 * Deletes the osi inso i issuance of report from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsoIIssuanceOfReportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsoIIssuanceOfReport the osi inso i issuance of report
	 * @return the osi inso i issuance of report that was removed
	 */
	@Override
	public com.nbp.osi.insolvency.stage.services.model.OsiInsoIIssuanceOfReport
		deleteOsiInsoIIssuanceOfReport(
			com.nbp.osi.insolvency.stage.services.model.OsiInsoIIssuanceOfReport
				osiInsoIIssuanceOfReport) {

		return _osiInsoIIssuanceOfReportLocalService.
			deleteOsiInsoIIssuanceOfReport(osiInsoIIssuanceOfReport);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsoIIssuanceOfReportLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiInsoIIssuanceOfReportLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiInsoIIssuanceOfReportLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiInsoIIssuanceOfReportLocalService.dynamicQuery();
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

		return _osiInsoIIssuanceOfReportLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsoIIssuanceOfReportModelImpl</code>.
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

		return _osiInsoIIssuanceOfReportLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsoIIssuanceOfReportModelImpl</code>.
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

		return _osiInsoIIssuanceOfReportLocalService.dynamicQuery(
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

		return _osiInsoIIssuanceOfReportLocalService.dynamicQueryCount(
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

		return _osiInsoIIssuanceOfReportLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.insolvency.stage.services.model.OsiInsoIIssuanceOfReport
		fetchOsiInsoIIssuanceOfReport(long osiInsoIIssuanceOfReportId) {

		return _osiInsoIIssuanceOfReportLocalService.
			fetchOsiInsoIIssuanceOfReport(osiInsoIIssuanceOfReportId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiInsoIIssuanceOfReportLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiInsoIIssuanceOfReportLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiInsoIIssuanceOfReportLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi inso i issuance of report with the primary key.
	 *
	 * @param osiInsoIIssuanceOfReportId the primary key of the osi inso i issuance of report
	 * @return the osi inso i issuance of report
	 * @throws PortalException if a osi inso i issuance of report with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.stage.services.model.OsiInsoIIssuanceOfReport
			getOsiInsoIIssuanceOfReport(long osiInsoIIssuanceOfReportId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsoIIssuanceOfReportLocalService.
			getOsiInsoIIssuanceOfReport(osiInsoIIssuanceOfReportId);
	}

	/**
	 * Returns a range of all the osi inso i issuance of reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsoIIssuanceOfReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi inso i issuance of reports
	 * @param end the upper bound of the range of osi inso i issuance of reports (not inclusive)
	 * @return the range of osi inso i issuance of reports
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.stage.services.model.OsiInsoIIssuanceOfReport>
			getOsiInsoIIssuanceOfReports(int start, int end) {

		return _osiInsoIIssuanceOfReportLocalService.
			getOsiInsoIIssuanceOfReports(start, end);
	}

	/**
	 * Returns the number of osi inso i issuance of reports.
	 *
	 * @return the number of osi inso i issuance of reports
	 */
	@Override
	public int getOsiInsoIIssuanceOfReportsCount() {
		return _osiInsoIIssuanceOfReportLocalService.
			getOsiInsoIIssuanceOfReportsCount();
	}

	@Override
	public com.nbp.osi.insolvency.stage.services.model.OsiInsoIIssuanceOfReport
			getOSIIRIssuanceOfReportBy_CI(String caseId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsoIIssuanceOfReportException {

		return _osiInsoIIssuanceOfReportLocalService.
			getOSIIRIssuanceOfReportBy_CI(caseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsoIIssuanceOfReportLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.osi.insolvency.stage.services.model.OsiInsoIIssuanceOfReport
		updateIIssuanceOfReportInsoIIssuanceOfReport(
			String caseId, java.util.Date dateOfReport, String nameOfApplicant,
			String typeOfApplicant, String decision) {

		return _osiInsoIIssuanceOfReportLocalService.
			updateIIssuanceOfReportInsoIIssuanceOfReport(
				caseId, dateOfReport, nameOfApplicant, typeOfApplicant,
				decision);
	}

	/**
	 * Updates the osi inso i issuance of report in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsoIIssuanceOfReportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsoIIssuanceOfReport the osi inso i issuance of report
	 * @return the osi inso i issuance of report that was updated
	 */
	@Override
	public com.nbp.osi.insolvency.stage.services.model.OsiInsoIIssuanceOfReport
		updateOsiInsoIIssuanceOfReport(
			com.nbp.osi.insolvency.stage.services.model.OsiInsoIIssuanceOfReport
				osiInsoIIssuanceOfReport) {

		return _osiInsoIIssuanceOfReportLocalService.
			updateOsiInsoIIssuanceOfReport(osiInsoIIssuanceOfReport);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiInsoIIssuanceOfReportLocalService.getBasePersistence();
	}

	@Override
	public OsiInsoIIssuanceOfReportLocalService getWrappedService() {
		return _osiInsoIIssuanceOfReportLocalService;
	}

	@Override
	public void setWrappedService(
		OsiInsoIIssuanceOfReportLocalService
			osiInsoIIssuanceOfReportLocalService) {

		_osiInsoIIssuanceOfReportLocalService =
			osiInsoIIssuanceOfReportLocalService;
	}

	private OsiInsoIIssuanceOfReportLocalService
		_osiInsoIIssuanceOfReportLocalService;

}