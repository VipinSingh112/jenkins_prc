/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link HsraApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationLocalService
 * @generated
 */
public class HsraApplicationLocalServiceWrapper
	implements HsraApplicationLocalService,
			   ServiceWrapper<HsraApplicationLocalService> {

	public HsraApplicationLocalServiceWrapper() {
		this(null);
	}

	public HsraApplicationLocalServiceWrapper(
		HsraApplicationLocalService hsraApplicationLocalService) {

		_hsraApplicationLocalService = hsraApplicationLocalService;
	}

	/**
	 * Adds the hsra application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplication the hsra application
	 * @return the hsra application that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.HsraApplication
		addHsraApplication(
			com.nbp.hsra.application.service.model.HsraApplication
				hsraApplication) {

		return _hsraApplicationLocalService.addHsraApplication(hsraApplication);
	}

	/**
	 * Creates a new hsra application with the primary key. Does not add the hsra application to the database.
	 *
	 * @param hsraApplicationId the primary key for the new hsra application
	 * @return the new hsra application
	 */
	@Override
	public com.nbp.hsra.application.service.model.HsraApplication
		createHsraApplication(long hsraApplicationId) {

		return _hsraApplicationLocalService.createHsraApplication(
			hsraApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the hsra application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplication the hsra application
	 * @return the hsra application that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.HsraApplication
		deleteHsraApplication(
			com.nbp.hsra.application.service.model.HsraApplication
				hsraApplication) {

		return _hsraApplicationLocalService.deleteHsraApplication(
			hsraApplication);
	}

	/**
	 * Deletes the hsra application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationId the primary key of the hsra application
	 * @return the hsra application that was removed
	 * @throws PortalException if a hsra application with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.HsraApplication
			deleteHsraApplication(long hsraApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationLocalService.deleteHsraApplication(
			hsraApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _hsraApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _hsraApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _hsraApplicationLocalService.dynamicQuery();
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

		return _hsraApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.HsraApplicationModelImpl</code>.
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

		return _hsraApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.HsraApplicationModelImpl</code>.
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

		return _hsraApplicationLocalService.dynamicQuery(
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

		return _hsraApplicationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _hsraApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.HsraApplication
		fetchHsraApplication(long hsraApplicationId) {

		return _hsraApplicationLocalService.fetchHsraApplication(
			hsraApplicationId);
	}

	/**
	 * Returns the hsra application matching the UUID and group.
	 *
	 * @param uuid the hsra application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.HsraApplication
		fetchHsraApplicationByUuidAndGroupId(String uuid, long groupId) {

		return _hsraApplicationLocalService.
			fetchHsraApplicationByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _hsraApplicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _hsraApplicationLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	/**
	 * Returns the hsra application with the primary key.
	 *
	 * @param hsraApplicationId the primary key of the hsra application
	 * @return the hsra application
	 * @throws PortalException if a hsra application with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.HsraApplication
			getHsraApplication(long hsraApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationLocalService.getHsraApplication(
			hsraApplicationId);
	}

	/**
	 * Returns the hsra application matching the UUID and group.
	 *
	 * @param uuid the hsra application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching hsra application
	 * @throws PortalException if a matching hsra application could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.HsraApplication
			getHsraApplicationByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationLocalService.getHsraApplicationByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the hsra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of hsra applications
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.HsraApplication>
			getHsraApplications(int start, int end) {

		return _hsraApplicationLocalService.getHsraApplications(start, end);
	}

	/**
	 * Returns all the hsra applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the hsra applications
	 * @param companyId the primary key of the company
	 * @return the matching hsra applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.HsraApplication>
			getHsraApplicationsByUuidAndCompanyId(String uuid, long companyId) {

		return _hsraApplicationLocalService.
			getHsraApplicationsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of hsra applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the hsra applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching hsra applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.HsraApplication>
			getHsraApplicationsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.hsra.application.service.model.HsraApplication>
						orderByComparator) {

		return _hsraApplicationLocalService.
			getHsraApplicationsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of hsra applications.
	 *
	 * @return the number of hsra applications
	 */
	@Override
	public int getHsraApplicationsCount() {
		return _hsraApplicationLocalService.getHsraApplicationsCount();
	}

	@Override
	public com.nbp.hsra.application.service.model.HsraApplication
			getHsraByAppNum(String applicationNumber)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return _hsraApplicationLocalService.getHsraByAppNum(applicationNumber);
	}

	@Override
	public com.nbp.hsra.application.service.model.HsraApplication
			getHsraByCaseId(String caseId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return _hsraApplicationLocalService.getHsraByCaseId(caseId);
	}

	@Override
	public com.nbp.hsra.application.service.model.HsraApplication
			getHsraByRT_AppNo(
				String typeOfApplicant, String expiredLicenseAppNumber)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return _hsraApplicationLocalService.getHsraByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);
	}

	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.HsraApplication> getHsraByS_U(
			long userId, int status) {

		return _hsraApplicationLocalService.getHsraByS_U(userId, status);
	}

	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.HsraApplication>
			getHsraByStatus(int status) {

		return _hsraApplicationLocalService.getHsraByStatus(status);
	}

	@Override
	public java.util.List<String> getHsraDistinctCategory() {
		return _hsraApplicationLocalService.getHsraDistinctCategory();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _hsraApplicationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _hsraApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the hsra application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplication the hsra application
	 * @return the hsra application that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.HsraApplication
		updateHsraApplication(
			com.nbp.hsra.application.service.model.HsraApplication
				hsraApplication) {

		return _hsraApplicationLocalService.updateHsraApplication(
			hsraApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _hsraApplicationLocalService.getBasePersistence();
	}

	@Override
	public HsraApplicationLocalService getWrappedService() {
		return _hsraApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		HsraApplicationLocalService hsraApplicationLocalService) {

		_hsraApplicationLocalService = hsraApplicationLocalService;
	}

	private HsraApplicationLocalService _hsraApplicationLocalService;

}