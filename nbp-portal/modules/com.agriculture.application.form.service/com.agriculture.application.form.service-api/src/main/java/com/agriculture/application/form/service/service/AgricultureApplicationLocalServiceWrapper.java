/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AgricultureApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApplicationLocalService
 * @generated
 */
public class AgricultureApplicationLocalServiceWrapper
	implements AgricultureApplicationLocalService,
			   ServiceWrapper<AgricultureApplicationLocalService> {

	public AgricultureApplicationLocalServiceWrapper() {
		this(null);
	}

	public AgricultureApplicationLocalServiceWrapper(
		AgricultureApplicationLocalService agricultureApplicationLocalService) {

		_agricultureApplicationLocalService =
			agricultureApplicationLocalService;
	}

	/**
	 * Adds the agriculture application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureApplication the agriculture application
	 * @return the agriculture application that was added
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureApplication
		addAgricultureApplication(
			com.agriculture.application.form.service.model.
				AgricultureApplication agricultureApplication) {

		return _agricultureApplicationLocalService.addAgricultureApplication(
			agricultureApplication);
	}

	/**
	 * Creates a new agriculture application with the primary key. Does not add the agriculture application to the database.
	 *
	 * @param agricultureApplicationId the primary key for the new agriculture application
	 * @return the new agriculture application
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureApplication
		createAgricultureApplication(long agricultureApplicationId) {

		return _agricultureApplicationLocalService.createAgricultureApplication(
			agricultureApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureApplicationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the agriculture application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureApplication the agriculture application
	 * @return the agriculture application that was removed
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureApplication
		deleteAgricultureApplication(
			com.agriculture.application.form.service.model.
				AgricultureApplication agricultureApplication) {

		return _agricultureApplicationLocalService.deleteAgricultureApplication(
			agricultureApplication);
	}

	/**
	 * Deletes the agriculture application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureApplicationId the primary key of the agriculture application
	 * @return the agriculture application that was removed
	 * @throws PortalException if a agriculture application with the primary key could not be found
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureApplication
			deleteAgricultureApplication(long agricultureApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureApplicationLocalService.deleteAgricultureApplication(
			agricultureApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureApplicationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _agricultureApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _agricultureApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _agricultureApplicationLocalService.dynamicQuery();
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

		return _agricultureApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureApplicationModelImpl</code>.
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

		return _agricultureApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureApplicationModelImpl</code>.
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

		return _agricultureApplicationLocalService.dynamicQuery(
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

		return _agricultureApplicationLocalService.dynamicQueryCount(
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

		return _agricultureApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.agriculture.application.form.service.model.AgricultureApplication
		fetchAgricultureApplication(long agricultureApplicationId) {

		return _agricultureApplicationLocalService.fetchAgricultureApplication(
			agricultureApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _agricultureApplicationLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the agriculture application with the primary key.
	 *
	 * @param agricultureApplicationId the primary key of the agriculture application
	 * @return the agriculture application
	 * @throws PortalException if a agriculture application with the primary key could not be found
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureApplication
			getAgricultureApplication(long agricultureApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureApplicationLocalService.getAgricultureApplication(
			agricultureApplicationId);
	}

	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgricultureApplication>
			getAgricultureApplicationByS_U(long userId, int status) {

		return _agricultureApplicationLocalService.
			getAgricultureApplicationByS_U(userId, status);
	}

	/**
	 * Returns a range of all the agriculture applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @return the range of agriculture applications
	 */
	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgricultureApplication>
			getAgricultureApplications(int start, int end) {

		return _agricultureApplicationLocalService.getAgricultureApplications(
			start, end);
	}

	/**
	 * Returns the number of agriculture applications.
	 *
	 * @return the number of agriculture applications
	 */
	@Override
	public int getAgricultureApplicationsCount() {
		return _agricultureApplicationLocalService.
			getAgricultureApplicationsCount();
	}

	@Override
	public com.agriculture.application.form.service.model.AgricultureApplication
			getAgricultureBy_CI(String caseId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return _agricultureApplicationLocalService.getAgricultureBy_CI(caseId);
	}

	@Override
	public com.agriculture.application.form.service.model.AgricultureApplication
			getAgricultureBy_RT_AppNo(String caseId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return _agricultureApplicationLocalService.getAgricultureBy_RT_AppNo(
			caseId);
	}

	@Override
	public com.agriculture.application.form.service.model.AgricultureApplication
			getAgricultureBy_RT_AppNo(
				String expiredAppLicenseNumber, String requestType)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return _agricultureApplicationLocalService.getAgricultureBy_RT_AppNo(
			expiredAppLicenseNumber, requestType);
	}

	@Override
	public com.agriculture.application.form.service.model.AgricultureApplication
			getAgricultureByAppNo(String applicationNumber)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return _agricultureApplicationLocalService.getAgricultureByAppNo(
			applicationNumber);
	}

	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgricultureApplication>
			getAgricultureByStatus(int status) {

		return _agricultureApplicationLocalService.getAgricultureByStatus(
			status);
	}

	@Override
	public java.util.List<String> getAgricultureDistinctCategory() {
		return _agricultureApplicationLocalService.
			getAgricultureDistinctCategory();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _agricultureApplicationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agricultureApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureApplicationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the agriculture application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureApplication the agriculture application
	 * @return the agriculture application that was updated
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureApplication
		updateAgricultureApplication(
			com.agriculture.application.form.service.model.
				AgricultureApplication agricultureApplication) {

		return _agricultureApplicationLocalService.updateAgricultureApplication(
			agricultureApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _agricultureApplicationLocalService.getBasePersistence();
	}

	@Override
	public AgricultureApplicationLocalService getWrappedService() {
		return _agricultureApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		AgricultureApplicationLocalService agricultureApplicationLocalService) {

		_agricultureApplicationLocalService =
			agricultureApplicationLocalService;
	}

	private AgricultureApplicationLocalService
		_agricultureApplicationLocalService;

}