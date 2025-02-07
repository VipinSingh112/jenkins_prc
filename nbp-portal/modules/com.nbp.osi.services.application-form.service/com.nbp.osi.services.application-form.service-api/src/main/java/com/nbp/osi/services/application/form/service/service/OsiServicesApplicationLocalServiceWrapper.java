/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiServicesApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesApplicationLocalService
 * @generated
 */
public class OsiServicesApplicationLocalServiceWrapper
	implements OsiServicesApplicationLocalService,
			   ServiceWrapper<OsiServicesApplicationLocalService> {

	public OsiServicesApplicationLocalServiceWrapper() {
		this(null);
	}

	public OsiServicesApplicationLocalServiceWrapper(
		OsiServicesApplicationLocalService osiServicesApplicationLocalService) {

		_osiServicesApplicationLocalService =
			osiServicesApplicationLocalService;
	}

	/**
	 * Adds the osi services application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesApplication the osi services application
	 * @return the osi services application that was added
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesApplication addOsiServicesApplication(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesApplication osiServicesApplication) {

		return _osiServicesApplicationLocalService.addOsiServicesApplication(
			osiServicesApplication);
	}

	/**
	 * Creates a new osi services application with the primary key. Does not add the osi services application to the database.
	 *
	 * @param osiServicesApplicationId the primary key for the new osi services application
	 * @return the new osi services application
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesApplication createOsiServicesApplication(
				long osiServicesApplicationId) {

		return _osiServicesApplicationLocalService.createOsiServicesApplication(
			osiServicesApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesApplicationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi services application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesApplicationId the primary key of the osi services application
	 * @return the osi services application that was removed
	 * @throws PortalException if a osi services application with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesApplication deleteOsiServicesApplication(
					long osiServicesApplicationId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesApplicationLocalService.deleteOsiServicesApplication(
			osiServicesApplicationId);
	}

	/**
	 * Deletes the osi services application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesApplication the osi services application
	 * @return the osi services application that was removed
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesApplication deleteOsiServicesApplication(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesApplication osiServicesApplication) {

		return _osiServicesApplicationLocalService.deleteOsiServicesApplication(
			osiServicesApplication);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesApplicationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiServicesApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiServicesApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiServicesApplicationLocalService.dynamicQuery();
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

		return _osiServicesApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesApplicationModelImpl</code>.
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

		return _osiServicesApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesApplicationModelImpl</code>.
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

		return _osiServicesApplicationLocalService.dynamicQuery(
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

		return _osiServicesApplicationLocalService.dynamicQueryCount(
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

		return _osiServicesApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesApplication fetchOsiServicesApplication(
				long osiServicesApplicationId) {

		return _osiServicesApplicationLocalService.fetchOsiServicesApplication(
			osiServicesApplicationId);
	}

	/**
	 * Returns the osi services application matching the UUID and group.
	 *
	 * @param uuid the osi services application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesApplication fetchOsiServicesApplicationByUuidAndGroupId(
				String uuid, long groupId) {

		return _osiServicesApplicationLocalService.
			fetchOsiServicesApplicationByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiServicesApplicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _osiServicesApplicationLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiServicesApplicationLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List<String> getJadscDistinctCategory() {
		return _osiServicesApplicationLocalService.getJadscDistinctCategory();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesApplicationLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesApplication getOsiServiceApplicationBy_CI(String caseId)
				throws com.nbp.osi.services.application.form.service.exception.
					NoSuchOsiServicesApplicationException {

		return _osiServicesApplicationLocalService.
			getOsiServiceApplicationBy_CI(caseId);
	}

	@Override
	public java.util.List<String> getOSISERVICEDistinctCategory() {
		return _osiServicesApplicationLocalService.
			getOSISERVICEDistinctCategory();
	}

	/**
	 * Returns the osi services application with the primary key.
	 *
	 * @param osiServicesApplicationId the primary key of the osi services application
	 * @return the osi services application
	 * @throws PortalException if a osi services application with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesApplication getOsiServicesApplication(
					long osiServicesApplicationId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesApplicationLocalService.getOsiServicesApplication(
			osiServicesApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesApplication> getOsiServicesApplicationByEntityId_Status(
				int status, long userId) {

		return _osiServicesApplicationLocalService.
			getOsiServicesApplicationByEntityId_Status(status, userId);
	}

	/**
	 * Returns the osi services application matching the UUID and group.
	 *
	 * @param uuid the osi services application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services application
	 * @throws PortalException if a matching osi services application could not be found
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesApplication getOsiServicesApplicationByUuidAndGroupId(
					String uuid, long groupId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesApplicationLocalService.
			getOsiServicesApplicationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of osi services applications
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesApplication> getOsiServicesApplications(
				int start, int end) {

		return _osiServicesApplicationLocalService.getOsiServicesApplications(
			start, end);
	}

	/**
	 * Returns all the osi services applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services applications
	 * @param companyId the primary key of the company
	 * @return the matching osi services applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesApplication>
				getOsiServicesApplicationsByUuidAndCompanyId(
					String uuid, long companyId) {

		return _osiServicesApplicationLocalService.
			getOsiServicesApplicationsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of osi services applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesApplication>
				getOsiServicesApplicationsByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.osi.services.application.form.service.model.
							OsiServicesApplication> orderByComparator) {

		return _osiServicesApplicationLocalService.
			getOsiServicesApplicationsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi services applications.
	 *
	 * @return the number of osi services applications
	 */
	@Override
	public int getOsiServicesApplicationsCount() {
		return _osiServicesApplicationLocalService.
			getOsiServicesApplicationsCount();
	}

	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesApplication> getOsiServicesApplicationStatus(
				int status, long userId) {

		return _osiServicesApplicationLocalService.
			getOsiServicesApplicationStatus(status, userId);
	}

	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesApplication getOSIServicesByAppNo(
					String applicationNumber)
				throws com.nbp.osi.services.application.form.service.exception.
					NoSuchOsiServicesApplicationException {

		return _osiServicesApplicationLocalService.getOSIServicesByAppNo(
			applicationNumber);
	}

	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesApplication getOsiServicesByAT_AppNo(
					String typeOfTransaction, String expiredLicenseAppNumber)
				throws com.nbp.osi.services.application.form.service.exception.
					NoSuchOsiServicesApplicationException {

		return _osiServicesApplicationLocalService.getOsiServicesByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	@Override
	public java.util.List
		<com.nbp.osi.services.application.form.service.model.
			OsiServicesApplication> getOSIServicesByStatus(int status) {

		return _osiServicesApplicationLocalService.getOSIServicesByStatus(
			status);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesApplicationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi services application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesApplication the osi services application
	 * @return the osi services application that was updated
	 */
	@Override
	public
		com.nbp.osi.services.application.form.service.model.
			OsiServicesApplication updateOsiServicesApplication(
				com.nbp.osi.services.application.form.service.model.
					OsiServicesApplication osiServicesApplication) {

		return _osiServicesApplicationLocalService.updateOsiServicesApplication(
			osiServicesApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiServicesApplicationLocalService.getBasePersistence();
	}

	@Override
	public OsiServicesApplicationLocalService getWrappedService() {
		return _osiServicesApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		OsiServicesApplicationLocalService osiServicesApplicationLocalService) {

		_osiServicesApplicationLocalService =
			osiServicesApplicationLocalService;
	}

	private OsiServicesApplicationLocalService
		_osiServicesApplicationLocalService;

}