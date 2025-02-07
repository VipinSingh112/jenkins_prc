/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QuarryApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationLocalService
 * @generated
 */
public class QuarryApplicationLocalServiceWrapper
	implements QuarryApplicationLocalService,
			   ServiceWrapper<QuarryApplicationLocalService> {

	public QuarryApplicationLocalServiceWrapper() {
		this(null);
	}

	public QuarryApplicationLocalServiceWrapper(
		QuarryApplicationLocalService quarryApplicationLocalService) {

		_quarryApplicationLocalService = quarryApplicationLocalService;
	}

	/**
	 * Adds the quarry application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplication the quarry application
	 * @return the quarry application that was added
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryApplication
		addQuarryApplication(
			com.nbp.quary.application.form.service.model.QuarryApplication
				quarryApplication) {

		return _quarryApplicationLocalService.addQuarryApplication(
			quarryApplication);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new quarry application with the primary key. Does not add the quarry application to the database.
	 *
	 * @param quarryApplicationId the primary key for the new quarry application
	 * @return the new quarry application
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryApplication
		createQuarryApplication(long quarryApplicationId) {

		return _quarryApplicationLocalService.createQuarryApplication(
			quarryApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the quarry application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationId the primary key of the quarry application
	 * @return the quarry application that was removed
	 * @throws PortalException if a quarry application with the primary key could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryApplication
			deleteQuarryApplication(long quarryApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationLocalService.deleteQuarryApplication(
			quarryApplicationId);
	}

	/**
	 * Deletes the quarry application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplication the quarry application
	 * @return the quarry application that was removed
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryApplication
		deleteQuarryApplication(
			com.nbp.quary.application.form.service.model.QuarryApplication
				quarryApplication) {

		return _quarryApplicationLocalService.deleteQuarryApplication(
			quarryApplication);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _quarryApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _quarryApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _quarryApplicationLocalService.dynamicQuery();
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

		return _quarryApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryApplicationModelImpl</code>.
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

		return _quarryApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryApplicationModelImpl</code>.
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

		return _quarryApplicationLocalService.dynamicQuery(
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

		return _quarryApplicationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _quarryApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.quary.application.form.service.model.QuarryApplication
		fetchQuarryApplication(long quarryApplicationId) {

		return _quarryApplicationLocalService.fetchQuarryApplication(
			quarryApplicationId);
	}

	/**
	 * Returns the quarry application matching the UUID and group.
	 *
	 * @param uuid the quarry application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryApplication
		fetchQuarryApplicationByUuidAndGroupId(String uuid, long groupId) {

		return _quarryApplicationLocalService.
			fetchQuarryApplicationByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _quarryApplicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _quarryApplicationLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _quarryApplicationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the quarry application with the primary key.
	 *
	 * @param quarryApplicationId the primary key of the quarry application
	 * @return the quarry application
	 * @throws PortalException if a quarry application with the primary key could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryApplication
			getQuarryApplication(long quarryApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationLocalService.getQuarryApplication(
			quarryApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.QuarryApplication>
			getQuarryApplicationByStatus(int status) {

		return _quarryApplicationLocalService.getQuarryApplicationByStatus(
			status);
	}

	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.QuarryApplication>
			getQuarryApplicationByStatus_UId(int status, long userId) {

		return _quarryApplicationLocalService.getQuarryApplicationByStatus_UId(
			status, userId);
	}

	/**
	 * Returns the quarry application matching the UUID and group.
	 *
	 * @param uuid the quarry application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching quarry application
	 * @throws PortalException if a matching quarry application could not be found
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryApplication
			getQuarryApplicationByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationLocalService.
			getQuarryApplicationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the quarry applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of quarry applications
	 */
	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.QuarryApplication>
			getQuarryApplications(int start, int end) {

		return _quarryApplicationLocalService.getQuarryApplications(start, end);
	}

	/**
	 * Returns all the quarry applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the quarry applications
	 * @param companyId the primary key of the company
	 * @return the matching quarry applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.QuarryApplication>
			getQuarryApplicationsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _quarryApplicationLocalService.
			getQuarryApplicationsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of quarry applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the quarry applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching quarry applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.quary.application.form.service.model.QuarryApplication>
			getQuarryApplicationsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.quary.application.form.service.model.
						QuarryApplication> orderByComparator) {

		return _quarryApplicationLocalService.
			getQuarryApplicationsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of quarry applications.
	 *
	 * @return the number of quarry applications
	 */
	@Override
	public int getQuarryApplicationsCount() {
		return _quarryApplicationLocalService.getQuarryApplicationsCount();
	}

	@Override
	public com.nbp.quary.application.form.service.model.QuarryApplication
			getQuarryByAppNo(String applicationNumber)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return _quarryApplicationLocalService.getQuarryByAppNo(
			applicationNumber);
	}

	@Override
	public com.nbp.quary.application.form.service.model.QuarryApplication
			getQuarryByAT_AppNo(
				String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return _quarryApplicationLocalService.getQuarryByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	@Override
	public com.nbp.quary.application.form.service.model.QuarryApplication
			getQuarryByCaseId(String caseId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return _quarryApplicationLocalService.getQuarryByCaseId(caseId);
	}

	@Override
	public java.util.List<String> getQuaryDistinctCategories() {
		return _quarryApplicationLocalService.getQuaryDistinctCategories();
	}

	/**
	 * Updates the quarry application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplication the quarry application
	 * @return the quarry application that was updated
	 */
	@Override
	public com.nbp.quary.application.form.service.model.QuarryApplication
		updateQuarryApplication(
			com.nbp.quary.application.form.service.model.QuarryApplication
				quarryApplication) {

		return _quarryApplicationLocalService.updateQuarryApplication(
			quarryApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _quarryApplicationLocalService.getBasePersistence();
	}

	@Override
	public QuarryApplicationLocalService getWrappedService() {
		return _quarryApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		QuarryApplicationLocalService quarryApplicationLocalService) {

		_quarryApplicationLocalService = quarryApplicationLocalService;
	}

	private QuarryApplicationLocalService _quarryApplicationLocalService;

}