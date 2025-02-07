/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JanaacReportLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacReportLocalService
 * @generated
 */
public class JanaacReportLocalServiceWrapper
	implements JanaacReportLocalService,
			   ServiceWrapper<JanaacReportLocalService> {

	public JanaacReportLocalServiceWrapper() {
		this(null);
	}

	public JanaacReportLocalServiceWrapper(
		JanaacReportLocalService janaacReportLocalService) {

		_janaacReportLocalService = janaacReportLocalService;
	}

	/**
	 * Adds the janaac report to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacReportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacReport the janaac report
	 * @return the janaac report that was added
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacReport addJanaacReport(
		com.nbp.janaac.stages.services.model.JanaacReport janaacReport) {

		return _janaacReportLocalService.addJanaacReport(janaacReport);
	}

	/**
	 * Creates a new janaac report with the primary key. Does not add the janaac report to the database.
	 *
	 * @param janaacReportId the primary key for the new janaac report
	 * @return the new janaac report
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacReport createJanaacReport(
		long janaacReportId) {

		return _janaacReportLocalService.createJanaacReport(janaacReportId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacReportLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the janaac report from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacReportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacReport the janaac report
	 * @return the janaac report that was removed
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacReport deleteJanaacReport(
		com.nbp.janaac.stages.services.model.JanaacReport janaacReport) {

		return _janaacReportLocalService.deleteJanaacReport(janaacReport);
	}

	/**
	 * Deletes the janaac report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacReportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacReportId the primary key of the janaac report
	 * @return the janaac report that was removed
	 * @throws PortalException if a janaac report with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacReport deleteJanaacReport(
			long janaacReportId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacReportLocalService.deleteJanaacReport(janaacReportId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacReportLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _janaacReportLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _janaacReportLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _janaacReportLocalService.dynamicQuery();
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

		return _janaacReportLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacReportModelImpl</code>.
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

		return _janaacReportLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacReportModelImpl</code>.
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

		return _janaacReportLocalService.dynamicQuery(
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

		return _janaacReportLocalService.dynamicQueryCount(dynamicQuery);
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

		return _janaacReportLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.stages.services.model.JanaacReport fetchJanaacReport(
		long janaacReportId) {

		return _janaacReportLocalService.fetchJanaacReport(janaacReportId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _janaacReportLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _janaacReportLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.janaac.stages.services.model.JanaacReport
			getJanaac_by_caseId(String caseId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacReportException {

		return _janaacReportLocalService.getJanaac_by_caseId(caseId);
	}

	/**
	 * Returns the janaac report with the primary key.
	 *
	 * @param janaacReportId the primary key of the janaac report
	 * @return the janaac report
	 * @throws PortalException if a janaac report with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacReport getJanaacReport(
			long janaacReportId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacReportLocalService.getJanaacReport(janaacReportId);
	}

	/**
	 * Returns a range of all the janaac reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac reports
	 * @param end the upper bound of the range of janaac reports (not inclusive)
	 * @return the range of janaac reports
	 */
	@Override
	public java.util.List<com.nbp.janaac.stages.services.model.JanaacReport>
		getJanaacReports(int start, int end) {

		return _janaacReportLocalService.getJanaacReports(start, end);
	}

	/**
	 * Returns the number of janaac reports.
	 *
	 * @return the number of janaac reports
	 */
	@Override
	public int getJanaacReportsCount() {
		return _janaacReportLocalService.getJanaacReportsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _janaacReportLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacReportLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.nbp.janaac.stages.services.model.JanaacReport
		updateJanaacApplicationReport(
			String caseId, java.util.Date dateOfReport, String report) {

		return _janaacReportLocalService.updateJanaacApplicationReport(
			caseId, dateOfReport, report);
	}

	/**
	 * Updates the janaac report in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacReportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacReport the janaac report
	 * @return the janaac report that was updated
	 */
	@Override
	public com.nbp.janaac.stages.services.model.JanaacReport updateJanaacReport(
		com.nbp.janaac.stages.services.model.JanaacReport janaacReport) {

		return _janaacReportLocalService.updateJanaacReport(janaacReport);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _janaacReportLocalService.getBasePersistence();
	}

	@Override
	public JanaacReportLocalService getWrappedService() {
		return _janaacReportLocalService;
	}

	@Override
	public void setWrappedService(
		JanaacReportLocalService janaacReportLocalService) {

		_janaacReportLocalService = janaacReportLocalService;
	}

	private JanaacReportLocalService _janaacReportLocalService;

}