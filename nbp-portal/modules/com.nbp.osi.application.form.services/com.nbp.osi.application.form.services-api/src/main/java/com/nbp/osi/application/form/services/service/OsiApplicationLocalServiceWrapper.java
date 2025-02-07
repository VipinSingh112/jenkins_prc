/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiApplicationLocalService
 * @generated
 */
public class OsiApplicationLocalServiceWrapper
	implements OsiApplicationLocalService,
			   ServiceWrapper<OsiApplicationLocalService> {

	public OsiApplicationLocalServiceWrapper() {
		this(null);
	}

	public OsiApplicationLocalServiceWrapper(
		OsiApplicationLocalService osiApplicationLocalService) {

		_osiApplicationLocalService = osiApplicationLocalService;
	}

	/**
	 * Adds the osi application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiApplication the osi application
	 * @return the osi application that was added
	 */
	@Override
	public com.nbp.osi.application.form.services.model.OsiApplication
		addOsiApplication(
			com.nbp.osi.application.form.services.model.OsiApplication
				osiApplication) {

		return _osiApplicationLocalService.addOsiApplication(osiApplication);
	}

	/**
	 * Creates a new osi application with the primary key. Does not add the osi application to the database.
	 *
	 * @param osiApplicationId the primary key for the new osi application
	 * @return the new osi application
	 */
	@Override
	public com.nbp.osi.application.form.services.model.OsiApplication
		createOsiApplication(long osiApplicationId) {

		return _osiApplicationLocalService.createOsiApplication(
			osiApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiApplicationLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the osi application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiApplicationId the primary key of the osi application
	 * @return the osi application that was removed
	 * @throws PortalException if a osi application with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.application.form.services.model.OsiApplication
			deleteOsiApplication(long osiApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiApplicationLocalService.deleteOsiApplication(
			osiApplicationId);
	}

	/**
	 * Deletes the osi application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiApplication the osi application
	 * @return the osi application that was removed
	 */
	@Override
	public com.nbp.osi.application.form.services.model.OsiApplication
		deleteOsiApplication(
			com.nbp.osi.application.form.services.model.OsiApplication
				osiApplication) {

		return _osiApplicationLocalService.deleteOsiApplication(osiApplication);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiApplicationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiApplicationLocalService.dynamicQuery();
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

		return _osiApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.OsiApplicationModelImpl</code>.
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

		return _osiApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.OsiApplicationModelImpl</code>.
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

		return _osiApplicationLocalService.dynamicQuery(
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

		return _osiApplicationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _osiApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.application.form.services.model.OsiApplication
		fetchOsiApplication(long osiApplicationId) {

		return _osiApplicationLocalService.fetchOsiApplication(
			osiApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiApplicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiApplicationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi application with the primary key.
	 *
	 * @param osiApplicationId the primary key of the osi application
	 * @return the osi application
	 * @throws PortalException if a osi application with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.application.form.services.model.OsiApplication
			getOsiApplication(long osiApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiApplicationLocalService.getOsiApplication(osiApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.osi.application.form.services.model.OsiApplication>
			getOsiApplicationByAppStatus(int status) {

		return _osiApplicationLocalService.getOsiApplicationByAppStatus(status);
	}

	@Override
	public java.util.List
		<com.nbp.osi.application.form.services.model.OsiApplication>
			getOsiApplicationByS_U(int status, long userId) {

		return _osiApplicationLocalService.getOsiApplicationByS_U(
			status, userId);
	}

	@Override
	public java.util.List
		<com.nbp.osi.application.form.services.model.OsiApplication>
			getOsiApplicationByS_UId(long userId, int status) {

		return _osiApplicationLocalService.getOsiApplicationByS_UId(
			userId, status);
	}

	@Override
	public java.util.List
		<com.nbp.osi.application.form.services.model.OsiApplication>
			getOsiApplicationByStatus(int status) {

		return _osiApplicationLocalService.getOsiApplicationByStatus(status);
	}

	@Override
	public java.util.List
		<com.nbp.osi.application.form.services.model.OsiApplication>
			getOsiApplicationByStatus_UserId(int status, long userId) {

		return _osiApplicationLocalService.getOsiApplicationByStatus_UserId(
			status, userId);
	}

	/**
	 * Returns a range of all the osi applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @return the range of osi applications
	 */
	@Override
	public java.util.List
		<com.nbp.osi.application.form.services.model.OsiApplication>
			getOsiApplications(int start, int end) {

		return _osiApplicationLocalService.getOsiApplications(start, end);
	}

	/**
	 * Returns the number of osi applications.
	 *
	 * @return the number of osi applications
	 */
	@Override
	public int getOsiApplicationsCount() {
		return _osiApplicationLocalService.getOsiApplicationsCount();
	}

	@Override
	public com.nbp.osi.application.form.services.model.OsiApplication
			getOsiByAppNum(String applicationNumber)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return _osiApplicationLocalService.getOsiByAppNum(applicationNumber);
	}

	@Override
	public com.nbp.osi.application.form.services.model.OsiApplication
			getOsiByAT_AppNo(String applicationType, String appNumber)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return _osiApplicationLocalService.getOsiByAT_AppNo(
			applicationType, appNumber);
	}

	@Override
	public com.nbp.osi.application.form.services.model.OsiApplication
			getOsiByCaseId(String caseId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return _osiApplicationLocalService.getOsiByCaseId(caseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiApplicationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiApplication the osi application
	 * @return the osi application that was updated
	 */
	@Override
	public com.nbp.osi.application.form.services.model.OsiApplication
		updateOsiApplication(
			com.nbp.osi.application.form.services.model.OsiApplication
				osiApplication) {

		return _osiApplicationLocalService.updateOsiApplication(osiApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiApplicationLocalService.getBasePersistence();
	}

	@Override
	public OsiApplicationLocalService getWrappedService() {
		return _osiApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		OsiApplicationLocalService osiApplicationLocalService) {

		_osiApplicationLocalService = osiApplicationLocalService;
	}

	private OsiApplicationLocalService _osiApplicationLocalService;

}