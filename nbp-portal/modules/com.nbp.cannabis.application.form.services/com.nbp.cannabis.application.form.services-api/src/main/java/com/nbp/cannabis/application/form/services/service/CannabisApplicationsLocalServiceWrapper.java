/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisApplicationsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationsLocalService
 * @generated
 */
public class CannabisApplicationsLocalServiceWrapper
	implements CannabisApplicationsLocalService,
			   ServiceWrapper<CannabisApplicationsLocalService> {

	public CannabisApplicationsLocalServiceWrapper() {
		this(null);
	}

	public CannabisApplicationsLocalServiceWrapper(
		CannabisApplicationsLocalService cannabisApplicationsLocalService) {

		_cannabisApplicationsLocalService = cannabisApplicationsLocalService;
	}

	/**
	 * Adds the cannabis applications to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplications the cannabis applications
	 * @return the cannabis applications that was added
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.CannabisApplications
		addCannabisApplications(
			com.nbp.cannabis.application.form.services.model.
				CannabisApplications cannabisApplications) {

		return _cannabisApplicationsLocalService.addCannabisApplications(
			cannabisApplications);
	}

	/**
	 * Creates a new cannabis applications with the primary key. Does not add the cannabis applications to the database.
	 *
	 * @param cannabisApplicationId the primary key for the new cannabis applications
	 * @return the new cannabis applications
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.CannabisApplications
		createCannabisApplications(long cannabisApplicationId) {

		return _cannabisApplicationsLocalService.createCannabisApplications(
			cannabisApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationsLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the cannabis applications from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplications the cannabis applications
	 * @return the cannabis applications that was removed
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.CannabisApplications
		deleteCannabisApplications(
			com.nbp.cannabis.application.form.services.model.
				CannabisApplications cannabisApplications) {

		return _cannabisApplicationsLocalService.deleteCannabisApplications(
			cannabisApplications);
	}

	/**
	 * Deletes the cannabis applications with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationId the primary key of the cannabis applications
	 * @return the cannabis applications that was removed
	 * @throws PortalException if a cannabis applications with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.CannabisApplications
			deleteCannabisApplications(long cannabisApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationsLocalService.deleteCannabisApplications(
			cannabisApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationsLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisApplicationsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisApplicationsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisApplicationsLocalService.dynamicQuery();
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

		return _cannabisApplicationsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationsModelImpl</code>.
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

		return _cannabisApplicationsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationsModelImpl</code>.
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

		return _cannabisApplicationsLocalService.dynamicQuery(
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

		return _cannabisApplicationsLocalService.dynamicQueryCount(
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

		return _cannabisApplicationsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.CannabisApplications
		fetchCannabisApplications(long cannabisApplicationId) {

		return _cannabisApplicationsLocalService.fetchCannabisApplications(
			cannabisApplicationId);
	}

	/**
	 * Returns the cannabis applications matching the UUID and group.
	 *
	 * @param uuid the cannabis applications's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.CannabisApplications
		fetchCannabisApplicationsByUuidAndGroupId(String uuid, long groupId) {

		return _cannabisApplicationsLocalService.
			fetchCannabisApplicationsByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisApplicationsLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the cannabis applications with the primary key.
	 *
	 * @param cannabisApplicationId the primary key of the cannabis applications
	 * @return the cannabis applications
	 * @throws PortalException if a cannabis applications with the primary key could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.CannabisApplications
			getCannabisApplications(long cannabisApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationsLocalService.getCannabisApplications(
			cannabisApplicationId);
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.CannabisApplications
			getCannabisApplicationsByAppNo(String applicationNumber)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return _cannabisApplicationsLocalService.getCannabisApplicationsByAppNo(
			applicationNumber);
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.CannabisApplications
			getCannabisApplicationsByCaseId(String caseId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return _cannabisApplicationsLocalService.
			getCannabisApplicationsByCaseId(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.CannabisApplications>
			getCannabisApplicationsByLicenseCategory(
				int status, String licenseCategory) {

		return _cannabisApplicationsLocalService.
			getCannabisApplicationsByLicenseCategory(status, licenseCategory);
	}

	@Override
	public int getCannabisApplicationsByLicenseCategoryCount(
		int status, String licenseCategory) {

		return _cannabisApplicationsLocalService.
			getCannabisApplicationsByLicenseCategoryCount(
				status, licenseCategory);
	}

	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.CannabisApplications>
			getCannabisApplicationsByLicenseSubCategory(
				int status, String licenseSubCategory) {

		return _cannabisApplicationsLocalService.
			getCannabisApplicationsByLicenseSubCategory(
				status, licenseSubCategory);
	}

	@Override
	public int getCannabisApplicationsByLicenseSubCategoryCount(
		int status, String licenseSubCategory) {

		return _cannabisApplicationsLocalService.
			getCannabisApplicationsByLicenseSubCategoryCount(
				status, licenseSubCategory);
	}

	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.CannabisApplications>
			getCannabisApplicationsByRequestType(
				int status, String requestType) {

		return _cannabisApplicationsLocalService.
			getCannabisApplicationsByRequestType(status, requestType);
	}

	@Override
	public int getCannabisApplicationsByRequestTypeCount(
		int status, String requestType) {

		return _cannabisApplicationsLocalService.
			getCannabisApplicationsByRequestTypeCount(status, requestType);
	}

	@Override
	public com.nbp.cannabis.application.form.services.model.CannabisApplications
			getCannabisApplicationsByRT_ExpiredAppNo(
				String expiredLicenseAppNo, String requestType)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return _cannabisApplicationsLocalService.
			getCannabisApplicationsByRT_ExpiredAppNo(
				expiredLicenseAppNo, requestType);
	}

	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.CannabisApplications>
			getCannabisApplicationsByS_U(long userId, int status) {

		return _cannabisApplicationsLocalService.getCannabisApplicationsByS_U(
			userId, status);
	}

	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.CannabisApplications>
			getCannabisApplicationsByStatus(int status) {

		return _cannabisApplicationsLocalService.
			getCannabisApplicationsByStatus(status);
	}

	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.CannabisApplications>
			getCannabisApplicationsByUser(long userId) {

		return _cannabisApplicationsLocalService.getCannabisApplicationsByUser(
			userId);
	}

	/**
	 * Returns the cannabis applications matching the UUID and group.
	 *
	 * @param uuid the cannabis applications's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis applications
	 * @throws PortalException if a matching cannabis applications could not be found
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.CannabisApplications
			getCannabisApplicationsByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationsLocalService.
			getCannabisApplicationsByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the cannabis applicationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of cannabis applicationses
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.CannabisApplications>
			getCannabisApplicationses(int start, int end) {

		return _cannabisApplicationsLocalService.getCannabisApplicationses(
			start, end);
	}

	/**
	 * Returns all the cannabis applicationses matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis applicationses
	 * @param companyId the primary key of the company
	 * @return the matching cannabis applicationses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.CannabisApplications>
			getCannabisApplicationsesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _cannabisApplicationsLocalService.
			getCannabisApplicationsesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of cannabis applicationses matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis applicationses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis applicationses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.cannabis.application.form.services.model.CannabisApplications>
			getCannabisApplicationsesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.cannabis.application.form.services.model.
						CannabisApplications> orderByComparator) {

		return _cannabisApplicationsLocalService.
			getCannabisApplicationsesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of cannabis applicationses.
	 *
	 * @return the number of cannabis applicationses
	 */
	@Override
	public int getCannabisApplicationsesCount() {
		return _cannabisApplicationsLocalService.
			getCannabisApplicationsesCount();
	}

	@Override
	public java.util.List<String> getCannabisDistinctCategories() {
		return _cannabisApplicationsLocalService.
			getCannabisDistinctCategories();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _cannabisApplicationsLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisApplicationsLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationsLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the cannabis applications in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplications the cannabis applications
	 * @return the cannabis applications that was updated
	 */
	@Override
	public com.nbp.cannabis.application.form.services.model.CannabisApplications
		updateCannabisApplications(
			com.nbp.cannabis.application.form.services.model.
				CannabisApplications cannabisApplications) {

		return _cannabisApplicationsLocalService.updateCannabisApplications(
			cannabisApplications);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisApplicationsLocalService.getBasePersistence();
	}

	@Override
	public CannabisApplicationsLocalService getWrappedService() {
		return _cannabisApplicationsLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationsLocalService cannabisApplicationsLocalService) {

		_cannabisApplicationsLocalService = cannabisApplicationsLocalService;
	}

	private CannabisApplicationsLocalService _cannabisApplicationsLocalService;

}