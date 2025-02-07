/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AcquireApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireApplicationLocalService
 * @generated
 */
public class AcquireApplicationLocalServiceWrapper
	implements AcquireApplicationLocalService,
			   ServiceWrapper<AcquireApplicationLocalService> {

	public AcquireApplicationLocalServiceWrapper() {
		this(null);
	}

	public AcquireApplicationLocalServiceWrapper(
		AcquireApplicationLocalService acquireApplicationLocalService) {

		_acquireApplicationLocalService = acquireApplicationLocalService;
	}

	/**
	 * Adds the acquire application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireApplication the acquire application
	 * @return the acquire application that was added
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireApplication
		addAcquireApplication(
			com.nbp.acquire.application.form.service.model.AcquireApplication
				acquireApplication) {

		return _acquireApplicationLocalService.addAcquireApplication(
			acquireApplication);
	}

	/**
	 * Creates a new acquire application with the primary key. Does not add the acquire application to the database.
	 *
	 * @param acquireApplicationId the primary key for the new acquire application
	 * @return the new acquire application
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireApplication
		createAcquireApplication(long acquireApplicationId) {

		return _acquireApplicationLocalService.createAcquireApplication(
			acquireApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireApplicationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acquire application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireApplication the acquire application
	 * @return the acquire application that was removed
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireApplication
		deleteAcquireApplication(
			com.nbp.acquire.application.form.service.model.AcquireApplication
				acquireApplication) {

		return _acquireApplicationLocalService.deleteAcquireApplication(
			acquireApplication);
	}

	/**
	 * Deletes the acquire application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireApplicationId the primary key of the acquire application
	 * @return the acquire application that was removed
	 * @throws PortalException if a acquire application with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireApplication
			deleteAcquireApplication(long acquireApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireApplicationLocalService.deleteAcquireApplication(
			acquireApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireApplicationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _acquireApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _acquireApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acquireApplicationLocalService.dynamicQuery();
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

		return _acquireApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireApplicationModelImpl</code>.
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

		return _acquireApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireApplicationModelImpl</code>.
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

		return _acquireApplicationLocalService.dynamicQuery(
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

		return _acquireApplicationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _acquireApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.acquire.application.form.service.model.AcquireApplication
		fetchAcquireApplication(long acquireApplicationId) {

		return _acquireApplicationLocalService.fetchAcquireApplication(
			acquireApplicationId);
	}

	/**
	 * Returns the acquire application matching the UUID and group.
	 *
	 * @param uuid the acquire application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireApplication
		fetchAcquireApplicationByUuidAndGroupId(String uuid, long groupId) {

		return _acquireApplicationLocalService.
			fetchAcquireApplicationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acquire application with the primary key.
	 *
	 * @param acquireApplicationId the primary key of the acquire application
	 * @return the acquire application
	 * @throws PortalException if a acquire application with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireApplication
			getAcquireApplication(long acquireApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireApplicationLocalService.getAcquireApplication(
			acquireApplicationId);
	}

	/**
	 * Returns the acquire application matching the UUID and group.
	 *
	 * @param uuid the acquire application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acquire application
	 * @throws PortalException if a matching acquire application could not be found
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireApplication
			getAcquireApplicationByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireApplicationLocalService.
			getAcquireApplicationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acquire applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.application.form.service.model.impl.AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @return the range of acquire applications
	 */
	@Override
	public java.util.List
		<com.nbp.acquire.application.form.service.model.AcquireApplication>
			getAcquireApplications(int start, int end) {

		return _acquireApplicationLocalService.getAcquireApplications(
			start, end);
	}

	/**
	 * Returns all the acquire applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the acquire applications
	 * @param companyId the primary key of the company
	 * @return the matching acquire applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.acquire.application.form.service.model.AcquireApplication>
			getAcquireApplicationsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _acquireApplicationLocalService.
			getAcquireApplicationsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acquire applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the acquire applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acquire applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.acquire.application.form.service.model.AcquireApplication>
			getAcquireApplicationsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.acquire.application.form.service.model.
						AcquireApplication> orderByComparator) {

		return _acquireApplicationLocalService.
			getAcquireApplicationsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acquire applications.
	 *
	 * @return the number of acquire applications
	 */
	@Override
	public int getAcquireApplicationsCount() {
		return _acquireApplicationLocalService.getAcquireApplicationsCount();
	}

	@Override
	public com.nbp.acquire.application.form.service.model.AcquireApplication
			getAcquireByAppNum(String applicationNumber)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return _acquireApplicationLocalService.getAcquireByAppNum(
			applicationNumber);
	}

	@Override
	public java.util.List
		<com.nbp.acquire.application.form.service.model.AcquireApplication>
				getAcquireByS_U(int status, long userId)
			throws com.nbp.acquire.application.form.service.exception.
				NoSuchAcquireApplicationException {

		return _acquireApplicationLocalService.getAcquireByS_U(status, userId);
	}

	@Override
	public java.util.List
		<com.nbp.acquire.application.form.service.model.AcquireApplication>
				getAcquireByStatus(int status)
			throws com.nbp.acquire.application.form.service.exception.
				NoSuchAcquireApplicationException {

		return _acquireApplicationLocalService.getAcquireByStatus(status);
	}

	@Override
	public java.util.List<String> getAcquireDistinctStages() {
		return _acquireApplicationLocalService.getAcquireDistinctStages();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _acquireApplicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _acquireApplicationLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _acquireApplicationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireApplicationLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.nbp.acquire.application.form.service.model.AcquireApplication
			getPharmaByCaseId(String caseId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return _acquireApplicationLocalService.getPharmaByCaseId(caseId);
	}

	/**
	 * Updates the acquire application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireApplication the acquire application
	 * @return the acquire application that was updated
	 */
	@Override
	public com.nbp.acquire.application.form.service.model.AcquireApplication
		updateAcquireApplication(
			com.nbp.acquire.application.form.service.model.AcquireApplication
				acquireApplication) {

		return _acquireApplicationLocalService.updateAcquireApplication(
			acquireApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _acquireApplicationLocalService.getBasePersistence();
	}

	@Override
	public AcquireApplicationLocalService getWrappedService() {
		return _acquireApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		AcquireApplicationLocalService acquireApplicationLocalService) {

		_acquireApplicationLocalService = acquireApplicationLocalService;
	}

	private AcquireApplicationLocalService _acquireApplicationLocalService;

}