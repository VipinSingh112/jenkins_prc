/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JanaacApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacApplicationLocalService
 * @generated
 */
public class JanaacApplicationLocalServiceWrapper
	implements JanaacApplicationLocalService,
			   ServiceWrapper<JanaacApplicationLocalService> {

	public JanaacApplicationLocalServiceWrapper() {
		this(null);
	}

	public JanaacApplicationLocalServiceWrapper(
		JanaacApplicationLocalService janaacApplicationLocalService) {

		_janaacApplicationLocalService = janaacApplicationLocalService;
	}

	/**
	 * Adds the janaac application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacApplication the janaac application
	 * @return the janaac application that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.JanaacApplication
		addJanaacApplication(
			com.nbp.janaac.application.form.service.model.JanaacApplication
				janaacApplication) {

		return _janaacApplicationLocalService.addJanaacApplication(
			janaacApplication);
	}

	/**
	 * Creates a new janaac application with the primary key. Does not add the janaac application to the database.
	 *
	 * @param janaacApplicationId the primary key for the new janaac application
	 * @return the new janaac application
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.JanaacApplication
		createJanaacApplication(long janaacApplicationId) {

		return _janaacApplicationLocalService.createJanaacApplication(
			janaacApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacApplicationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the janaac application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacApplication the janaac application
	 * @return the janaac application that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.JanaacApplication
		deleteJanaacApplication(
			com.nbp.janaac.application.form.service.model.JanaacApplication
				janaacApplication) {

		return _janaacApplicationLocalService.deleteJanaacApplication(
			janaacApplication);
	}

	/**
	 * Deletes the janaac application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacApplicationId the primary key of the janaac application
	 * @return the janaac application that was removed
	 * @throws PortalException if a janaac application with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.JanaacApplication
			deleteJanaacApplication(long janaacApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacApplicationLocalService.deleteJanaacApplication(
			janaacApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacApplicationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _janaacApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _janaacApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _janaacApplicationLocalService.dynamicQuery();
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

		return _janaacApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.JanaacApplicationModelImpl</code>.
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

		return _janaacApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.JanaacApplicationModelImpl</code>.
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

		return _janaacApplicationLocalService.dynamicQuery(
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

		return _janaacApplicationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _janaacApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.JanaacApplication
		fetchJanaacApplication(long janaacApplicationId) {

		return _janaacApplicationLocalService.fetchJanaacApplication(
			janaacApplicationId);
	}

	/**
	 * Returns the janaac application matching the UUID and group.
	 *
	 * @param uuid the janaac application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.JanaacApplication
		fetchJanaacApplicationByUuidAndGroupId(String uuid, long groupId) {

		return _janaacApplicationLocalService.
			fetchJanaacApplicationByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _janaacApplicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _janaacApplicationLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _janaacApplicationLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.janaac.application.form.service.model.JanaacApplication
			getJANAAC_By_app_no(String appNo)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return _janaacApplicationLocalService.getJANAAC_By_app_no(appNo);
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.JanaacApplication>
			getJANAAC_By_status(int status) {

		return _janaacApplicationLocalService.getJANAAC_By_status(status);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.JanaacApplication
			getJANAAC_ByCaseId(String caseId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return _janaacApplicationLocalService.getJANAAC_ByCaseId(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.JanaacApplication>
			getJANAAC_ByS_U(long userId, int status) {

		return _janaacApplicationLocalService.getJANAAC_ByS_U(userId, status);
	}

	/**
	 * Returns the janaac application with the primary key.
	 *
	 * @param janaacApplicationId the primary key of the janaac application
	 * @return the janaac application
	 * @throws PortalException if a janaac application with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.JanaacApplication
			getJanaacApplication(long janaacApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacApplicationLocalService.getJanaacApplication(
			janaacApplicationId);
	}

	/**
	 * Returns the janaac application matching the UUID and group.
	 *
	 * @param uuid the janaac application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching janaac application
	 * @throws PortalException if a matching janaac application could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.JanaacApplication
			getJanaacApplicationByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacApplicationLocalService.
			getJanaacApplicationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the janaac applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @return the range of janaac applications
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.JanaacApplication>
			getJanaacApplications(int start, int end) {

		return _janaacApplicationLocalService.getJanaacApplications(start, end);
	}

	/**
	 * Returns all the janaac applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the janaac applications
	 * @param companyId the primary key of the company
	 * @return the matching janaac applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.JanaacApplication>
			getJanaacApplicationsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _janaacApplicationLocalService.
			getJanaacApplicationsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of janaac applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the janaac applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching janaac applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.JanaacApplication>
			getJanaacApplicationsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.janaac.application.form.service.model.
						JanaacApplication> orderByComparator) {

		return _janaacApplicationLocalService.
			getJanaacApplicationsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of janaac applications.
	 *
	 * @return the number of janaac applications
	 */
	@Override
	public int getJanaacApplicationsCount() {
		return _janaacApplicationLocalService.getJanaacApplicationsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _janaacApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacApplicationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the janaac application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacApplication the janaac application
	 * @return the janaac application that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.JanaacApplication
		updateJanaacApplication(
			com.nbp.janaac.application.form.service.model.JanaacApplication
				janaacApplication) {

		return _janaacApplicationLocalService.updateJanaacApplication(
			janaacApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _janaacApplicationLocalService.getBasePersistence();
	}

	@Override
	public JanaacApplicationLocalService getWrappedService() {
		return _janaacApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		JanaacApplicationLocalService janaacApplicationLocalService) {

		_janaacApplicationLocalService = janaacApplicationLocalService;
	}

	private JanaacApplicationLocalService _janaacApplicationLocalService;

}