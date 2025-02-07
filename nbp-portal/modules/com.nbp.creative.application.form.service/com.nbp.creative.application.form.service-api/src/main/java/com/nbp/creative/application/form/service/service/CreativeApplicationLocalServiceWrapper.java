/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CreativeApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeApplicationLocalService
 * @generated
 */
public class CreativeApplicationLocalServiceWrapper
	implements CreativeApplicationLocalService,
			   ServiceWrapper<CreativeApplicationLocalService> {

	public CreativeApplicationLocalServiceWrapper() {
		this(null);
	}

	public CreativeApplicationLocalServiceWrapper(
		CreativeApplicationLocalService creativeApplicationLocalService) {

		_creativeApplicationLocalService = creativeApplicationLocalService;
	}

	/**
	 * Adds the creative application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeApplication the creative application
	 * @return the creative application that was added
	 */
	@Override
	public com.nbp.creative.application.form.service.model.CreativeApplication
		addCreativeApplication(
			com.nbp.creative.application.form.service.model.CreativeApplication
				creativeApplication) {

		return _creativeApplicationLocalService.addCreativeApplication(
			creativeApplication);
	}

	/**
	 * Creates a new creative application with the primary key. Does not add the creative application to the database.
	 *
	 * @param CreativeApplicationId the primary key for the new creative application
	 * @return the new creative application
	 */
	@Override
	public com.nbp.creative.application.form.service.model.CreativeApplication
		createCreativeApplication(long CreativeApplicationId) {

		return _creativeApplicationLocalService.createCreativeApplication(
			CreativeApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeApplicationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the creative application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeApplication the creative application
	 * @return the creative application that was removed
	 */
	@Override
	public com.nbp.creative.application.form.service.model.CreativeApplication
		deleteCreativeApplication(
			com.nbp.creative.application.form.service.model.CreativeApplication
				creativeApplication) {

		return _creativeApplicationLocalService.deleteCreativeApplication(
			creativeApplication);
	}

	/**
	 * Deletes the creative application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param CreativeApplicationId the primary key of the creative application
	 * @return the creative application that was removed
	 * @throws PortalException if a creative application with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.application.form.service.model.CreativeApplication
			deleteCreativeApplication(long CreativeApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeApplicationLocalService.deleteCreativeApplication(
			CreativeApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeApplicationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _creativeApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _creativeApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _creativeApplicationLocalService.dynamicQuery();
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

		return _creativeApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeApplicationModelImpl</code>.
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

		return _creativeApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeApplicationModelImpl</code>.
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

		return _creativeApplicationLocalService.dynamicQuery(
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

		return _creativeApplicationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _creativeApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.creative.application.form.service.model.CreativeApplication
		fetchCreativeApplication(long CreativeApplicationId) {

		return _creativeApplicationLocalService.fetchCreativeApplication(
			CreativeApplicationId);
	}

	/**
	 * Returns the creative application matching the UUID and group.
	 *
	 * @param uuid the creative application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	@Override
	public com.nbp.creative.application.form.service.model.CreativeApplication
		fetchCreativeApplicationByUuidAndGroupId(String uuid, long groupId) {

		return _creativeApplicationLocalService.
			fetchCreativeApplicationByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.nbp.creative.application.form.service.model.CreativeApplication
			findBygetCreativeByCaseId(String caseId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return _creativeApplicationLocalService.findBygetCreativeByCaseId(
			caseId);
	}

	@Override
	public com.nbp.creative.application.form.service.model.CreativeApplication
		findBygetCreativeById(long creativeApplicationId) {

		return _creativeApplicationLocalService.findBygetCreativeById(
			creativeApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _creativeApplicationLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the creative application with the primary key.
	 *
	 * @param CreativeApplicationId the primary key of the creative application
	 * @return the creative application
	 * @throws PortalException if a creative application with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.application.form.service.model.CreativeApplication
			getCreativeApplication(long CreativeApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeApplicationLocalService.getCreativeApplication(
			CreativeApplicationId);
	}

	/**
	 * Returns the creative application matching the UUID and group.
	 *
	 * @param uuid the creative application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching creative application
	 * @throws PortalException if a matching creative application could not be found
	 */
	@Override
	public com.nbp.creative.application.form.service.model.CreativeApplication
			getCreativeApplicationByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeApplicationLocalService.
			getCreativeApplicationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the creative applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @return the range of creative applications
	 */
	@Override
	public java.util.List
		<com.nbp.creative.application.form.service.model.CreativeApplication>
			getCreativeApplications(int start, int end) {

		return _creativeApplicationLocalService.getCreativeApplications(
			start, end);
	}

	/**
	 * Returns all the creative applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the creative applications
	 * @param companyId the primary key of the company
	 * @return the matching creative applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.creative.application.form.service.model.CreativeApplication>
			getCreativeApplicationsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _creativeApplicationLocalService.
			getCreativeApplicationsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of creative applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the creative applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching creative applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.creative.application.form.service.model.CreativeApplication>
			getCreativeApplicationsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.creative.application.form.service.model.
						CreativeApplication> orderByComparator) {

		return _creativeApplicationLocalService.
			getCreativeApplicationsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of creative applications.
	 *
	 * @return the number of creative applications
	 */
	@Override
	public int getCreativeApplicationsCount() {
		return _creativeApplicationLocalService.getCreativeApplicationsCount();
	}

	@Override
	public com.nbp.creative.application.form.service.model.CreativeApplication
			getCreativeByAppNo(String applicationNumber)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return _creativeApplicationLocalService.getCreativeByAppNo(
			applicationNumber);
	}

	@Override
	public java.util.List
		<com.nbp.creative.application.form.service.model.CreativeApplication>
			getCreativeByS_U(int status, long userId) {

		return _creativeApplicationLocalService.getCreativeByS_U(
			status, userId);
	}

	@Override
	public java.util.List
		<com.nbp.creative.application.form.service.model.CreativeApplication>
			getCreativeByStatus(int status) {

		return _creativeApplicationLocalService.getCreativeByStatus(status);
	}

	@Override
	public java.util.List<String> getCreativeeDistinctCategory() {
		return _creativeApplicationLocalService.getCreativeeDistinctCategory();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _creativeApplicationLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _creativeApplicationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeApplicationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the creative application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeApplication the creative application
	 * @return the creative application that was updated
	 */
	@Override
	public com.nbp.creative.application.form.service.model.CreativeApplication
		updateCreativeApplication(
			com.nbp.creative.application.form.service.model.CreativeApplication
				creativeApplication) {

		return _creativeApplicationLocalService.updateCreativeApplication(
			creativeApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _creativeApplicationLocalService.getBasePersistence();
	}

	@Override
	public CreativeApplicationLocalService getWrappedService() {
		return _creativeApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		CreativeApplicationLocalService creativeApplicationLocalService) {

		_creativeApplicationLocalService = creativeApplicationLocalService;
	}

	private CreativeApplicationLocalService _creativeApplicationLocalService;

}