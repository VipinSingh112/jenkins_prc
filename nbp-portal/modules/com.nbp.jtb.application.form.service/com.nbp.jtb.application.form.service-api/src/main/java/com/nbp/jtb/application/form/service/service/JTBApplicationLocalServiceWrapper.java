/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JTBApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JTBApplicationLocalService
 * @generated
 */
public class JTBApplicationLocalServiceWrapper
	implements JTBApplicationLocalService,
			   ServiceWrapper<JTBApplicationLocalService> {

	public JTBApplicationLocalServiceWrapper() {
		this(null);
	}

	public JTBApplicationLocalServiceWrapper(
		JTBApplicationLocalService jtbApplicationLocalService) {

		_jtbApplicationLocalService = jtbApplicationLocalService;
	}

	/**
	 * Adds the jtb application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplication the jtb application
	 * @return the jtb application that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JTBApplication
		addJTBApplication(
			com.nbp.jtb.application.form.service.model.JTBApplication
				jtbApplication) {

		return _jtbApplicationLocalService.addJTBApplication(jtbApplication);
	}

	/**
	 * Creates a new jtb application with the primary key. Does not add the jtb application to the database.
	 *
	 * @param jtbApplicationId the primary key for the new jtb application
	 * @return the new jtb application
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JTBApplication
		createJTBApplication(long jtbApplicationId) {

		return _jtbApplicationLocalService.createJTBApplication(
			jtbApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbApplicationLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the jtb application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplication the jtb application
	 * @return the jtb application that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JTBApplication
		deleteJTBApplication(
			com.nbp.jtb.application.form.service.model.JTBApplication
				jtbApplication) {

		return _jtbApplicationLocalService.deleteJTBApplication(jtbApplication);
	}

	/**
	 * Deletes the jtb application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplicationId the primary key of the jtb application
	 * @return the jtb application that was removed
	 * @throws PortalException if a jtb application with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JTBApplication
			deleteJTBApplication(long jtbApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbApplicationLocalService.deleteJTBApplication(
			jtbApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbApplicationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jtbApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jtbApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jtbApplicationLocalService.dynamicQuery();
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

		return _jtbApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBApplicationModelImpl</code>.
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

		return _jtbApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBApplicationModelImpl</code>.
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

		return _jtbApplicationLocalService.dynamicQuery(
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

		return _jtbApplicationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _jtbApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.JTBApplication
		fetchJTBApplication(long jtbApplicationId) {

		return _jtbApplicationLocalService.fetchJTBApplication(
			jtbApplicationId);
	}

	/**
	 * Returns the jtb application matching the UUID and group.
	 *
	 * @param uuid the jtb application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JTBApplication
		fetchJTBApplicationByUuidAndGroupId(String uuid, long groupId) {

		return _jtbApplicationLocalService.fetchJTBApplicationByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jtbApplicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _jtbApplicationLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jtbApplicationLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.JTBApplication
			getJTB_By_AppNum(String applicationNumber)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return _jtbApplicationLocalService.getJTB_By_AppNum(applicationNumber);
	}

	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.JTBApplication>
				getJTB_By_AppType_Status(int status, String typeOfApplication)
			throws com.nbp.jtb.application.form.service.exception.
				NoSuchJTBApplicationException {

		return _jtbApplicationLocalService.getJTB_By_AppType_Status(
			status, typeOfApplication);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.JTBApplication
			getJTB_By_RT_AppNo(
				String typeOfApplicant, String expiredLicenseAppNumber)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return _jtbApplicationLocalService.getJTB_By_RT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);
	}

	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.JTBApplication>
			getJTB_By_Status(int status) {

		return _jtbApplicationLocalService.getJTB_By_Status(status);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.JTBApplication
			getJTB_ByCaseId(String caseId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return _jtbApplicationLocalService.getJTB_ByCaseId(caseId);
	}

	/**
	 * Returns the jtb application with the primary key.
	 *
	 * @param jtbApplicationId the primary key of the jtb application
	 * @return the jtb application
	 * @throws PortalException if a jtb application with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JTBApplication
			getJTBApplication(long jtbApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbApplicationLocalService.getJTBApplication(jtbApplicationId);
	}

	/**
	 * Returns the jtb application matching the UUID and group.
	 *
	 * @param uuid the jtb application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jtb application
	 * @throws PortalException if a matching jtb application could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JTBApplication
			getJTBApplicationByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbApplicationLocalService.getJTBApplicationByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.JTBApplication>
			getJTBApplicationList_By_S_UId(long userId, int status) {

		return _jtbApplicationLocalService.getJTBApplicationList_By_S_UId(
			userId, status);
	}

	/**
	 * Returns a range of all the jtb applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @return the range of jtb applications
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.JTBApplication>
			getJTBApplications(int start, int end) {

		return _jtbApplicationLocalService.getJTBApplications(start, end);
	}

	/**
	 * Returns all the jtb applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the jtb applications
	 * @param companyId the primary key of the company
	 * @return the matching jtb applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.JTBApplication>
			getJTBApplicationsByUuidAndCompanyId(String uuid, long companyId) {

		return _jtbApplicationLocalService.getJTBApplicationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of jtb applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the jtb applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jtb applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.JTBApplication>
			getJTBApplicationsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.jtb.application.form.service.model.JTBApplication>
						orderByComparator) {

		return _jtbApplicationLocalService.getJTBApplicationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jtb applications.
	 *
	 * @return the number of jtb applications
	 */
	@Override
	public int getJTBApplicationsCount() {
		return _jtbApplicationLocalService.getJTBApplicationsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbApplicationLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.util.List<String> getTpdcoDistinctCategories() {
		return _jtbApplicationLocalService.getTpdcoDistinctCategories();
	}

	/**
	 * Updates the jtb application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplication the jtb application
	 * @return the jtb application that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JTBApplication
		updateJTBApplication(
			com.nbp.jtb.application.form.service.model.JTBApplication
				jtbApplication) {

		return _jtbApplicationLocalService.updateJTBApplication(jtbApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jtbApplicationLocalService.getBasePersistence();
	}

	@Override
	public JTBApplicationLocalService getWrappedService() {
		return _jtbApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		JTBApplicationLocalService jtbApplicationLocalService) {

		_jtbApplicationLocalService = jtbApplicationLocalService;
	}

	private JTBApplicationLocalService _jtbApplicationLocalService;

}