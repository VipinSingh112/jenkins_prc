/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FireBrigadeApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeApplicationLocalService
 * @generated
 */
public class FireBrigadeApplicationLocalServiceWrapper
	implements FireBrigadeApplicationLocalService,
			   ServiceWrapper<FireBrigadeApplicationLocalService> {

	public FireBrigadeApplicationLocalServiceWrapper() {
		this(null);
	}

	public FireBrigadeApplicationLocalServiceWrapper(
		FireBrigadeApplicationLocalService fireBrigadeApplicationLocalService) {

		_fireBrigadeApplicationLocalService =
			fireBrigadeApplicationLocalService;
	}

	/**
	 * Adds the fire brigade application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeApplication the fire brigade application
	 * @return the fire brigade application that was added
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeApplication addFireBrigadeApplication(
				com.nbp.fire.brigade.application.form.service.model.
					FireBrigadeApplication fireBrigadeApplication) {

		return _fireBrigadeApplicationLocalService.addFireBrigadeApplication(
			fireBrigadeApplication);
	}

	/**
	 * Creates a new fire brigade application with the primary key. Does not add the fire brigade application to the database.
	 *
	 * @param fireBrigadeApplicationId the primary key for the new fire brigade application
	 * @return the new fire brigade application
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeApplication createFireBrigadeApplication(
				long fireBrigadeApplicationId) {

		return _fireBrigadeApplicationLocalService.createFireBrigadeApplication(
			fireBrigadeApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeApplicationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the fire brigade application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeApplication the fire brigade application
	 * @return the fire brigade application that was removed
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeApplication deleteFireBrigadeApplication(
				com.nbp.fire.brigade.application.form.service.model.
					FireBrigadeApplication fireBrigadeApplication) {

		return _fireBrigadeApplicationLocalService.deleteFireBrigadeApplication(
			fireBrigadeApplication);
	}

	/**
	 * Deletes the fire brigade application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeApplicationId the primary key of the fire brigade application
	 * @return the fire brigade application that was removed
	 * @throws PortalException if a fire brigade application with the primary key could not be found
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeApplication deleteFireBrigadeApplication(
					long fireBrigadeApplicationId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeApplicationLocalService.deleteFireBrigadeApplication(
			fireBrigadeApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeApplicationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fireBrigadeApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fireBrigadeApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fireBrigadeApplicationLocalService.dynamicQuery();
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

		return _fireBrigadeApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeApplicationModelImpl</code>.
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

		return _fireBrigadeApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeApplicationModelImpl</code>.
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

		return _fireBrigadeApplicationLocalService.dynamicQuery(
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

		return _fireBrigadeApplicationLocalService.dynamicQueryCount(
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

		return _fireBrigadeApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeApplication fetchFireBrigadeApplication(
				long fireBrigadeApplicationId) {

		return _fireBrigadeApplicationLocalService.fetchFireBrigadeApplication(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade application matching the UUID and group.
	 *
	 * @param uuid the fire brigade application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeApplication fetchFireBrigadeApplicationByUuidAndGroupId(
				String uuid, long groupId) {

		return _fireBrigadeApplicationLocalService.
			fetchFireBrigadeApplicationByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fireBrigadeApplicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _fireBrigadeApplicationLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeApplication getFB_ByAppType_AppNo(
					String applicationType, String applicationNumber)
				throws com.nbp.fire.brigade.application.form.service.exception.
					NoSuchFireBrigadeApplicationException {

		return _fireBrigadeApplicationLocalService.getFB_ByAppType_AppNo(
			applicationType, applicationNumber);
	}

	/**
	 * Returns the fire brigade application with the primary key.
	 *
	 * @param fireBrigadeApplicationId the primary key of the fire brigade application
	 * @return the fire brigade application
	 * @throws PortalException if a fire brigade application with the primary key could not be found
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeApplication getFireBrigadeApplication(
					long fireBrigadeApplicationId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeApplicationLocalService.getFireBrigadeApplication(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade application matching the UUID and group.
	 *
	 * @param uuid the fire brigade application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching fire brigade application
	 * @throws PortalException if a matching fire brigade application could not be found
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeApplication getFireBrigadeApplicationByUuidAndGroupId(
					String uuid, long groupId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeApplicationLocalService.
			getFireBrigadeApplicationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the fire brigade applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of fire brigade applications
	 */
	@Override
	public java.util.List
		<com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeApplication> getFireBrigadeApplications(
				int start, int end) {

		return _fireBrigadeApplicationLocalService.getFireBrigadeApplications(
			start, end);
	}

	/**
	 * Returns all the fire brigade applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the fire brigade applications
	 * @param companyId the primary key of the company
	 * @return the matching fire brigade applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeApplication>
				getFireBrigadeApplicationsByUuidAndCompanyId(
					String uuid, long companyId) {

		return _fireBrigadeApplicationLocalService.
			getFireBrigadeApplicationsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of fire brigade applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the fire brigade applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching fire brigade applications, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeApplication>
				getFireBrigadeApplicationsByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.fire.brigade.application.form.service.model.
							FireBrigadeApplication> orderByComparator) {

		return _fireBrigadeApplicationLocalService.
			getFireBrigadeApplicationsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of fire brigade applications.
	 *
	 * @return the number of fire brigade applications
	 */
	@Override
	public int getFireBrigadeApplicationsCount() {
		return _fireBrigadeApplicationLocalService.
			getFireBrigadeApplicationsCount();
	}

	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeApplication getFireBrigadeByAppNo(
					String applicationNumber)
				throws com.nbp.fire.brigade.application.form.service.exception.
					NoSuchFireBrigadeApplicationException {

		return _fireBrigadeApplicationLocalService.getFireBrigadeByAppNo(
			applicationNumber);
	}

	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeApplication getFireBrigadeByEI_CI(
					String entityId, String caseId)
				throws com.nbp.fire.brigade.application.form.service.exception.
					NoSuchFireBrigadeApplicationException {

		return _fireBrigadeApplicationLocalService.getFireBrigadeByEI_CI(
			entityId, caseId);
	}

	@Override
	public java.util.List
		<com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeApplication> getFireBrigadeByEntityId(String entityId) {

		return _fireBrigadeApplicationLocalService.getFireBrigadeByEntityId(
			entityId);
	}

	@Override
	public java.util.List
		<com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeApplication> getFireBrigadeByEntityId_Status(
				String entityId, int status) {

		return _fireBrigadeApplicationLocalService.
			getFireBrigadeByEntityId_Status(entityId, status);
	}

	@Override
	public java.util.List
		<com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeApplication> getFireBrigadeByS_U(
				int status, long userId) {

		return _fireBrigadeApplicationLocalService.getFireBrigadeByS_U(
			status, userId);
	}

	@Override
	public java.util.List
		<com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeApplication> getFireBrigadeByStatus(int status) {

		return _fireBrigadeApplicationLocalService.getFireBrigadeByStatus(
			status);
	}

	@Override
	public java.util.List<String> getFireBrigadeDistinctCategory() {
		return _fireBrigadeApplicationLocalService.
			getFireBrigadeDistinctCategory();
	}

	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeApplication getFireBrigadeStatusByCaseId(String caseId)
				throws com.nbp.fire.brigade.application.form.service.exception.
					NoSuchFireBrigadeApplicationException {

		return _fireBrigadeApplicationLocalService.getFireBrigadeStatusByCaseId(
			caseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fireBrigadeApplicationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeApplicationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the fire brigade application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeApplication the fire brigade application
	 * @return the fire brigade application that was updated
	 */
	@Override
	public
		com.nbp.fire.brigade.application.form.service.model.
			FireBrigadeApplication updateFireBrigadeApplication(
				com.nbp.fire.brigade.application.form.service.model.
					FireBrigadeApplication fireBrigadeApplication) {

		return _fireBrigadeApplicationLocalService.updateFireBrigadeApplication(
			fireBrigadeApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _fireBrigadeApplicationLocalService.getBasePersistence();
	}

	@Override
	public FireBrigadeApplicationLocalService getWrappedService() {
		return _fireBrigadeApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeApplicationLocalService fireBrigadeApplicationLocalService) {

		_fireBrigadeApplicationLocalService =
			fireBrigadeApplicationLocalService;
	}

	private FireBrigadeApplicationLocalService
		_fireBrigadeApplicationLocalService;

}