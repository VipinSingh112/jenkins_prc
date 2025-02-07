/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link HealthCareApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicationLocalService
 * @generated
 */
public class HealthCareApplicationLocalServiceWrapper
	implements HealthCareApplicationLocalService,
			   ServiceWrapper<HealthCareApplicationLocalService> {

	public HealthCareApplicationLocalServiceWrapper() {
		this(null);
	}

	public HealthCareApplicationLocalServiceWrapper(
		HealthCareApplicationLocalService healthCareApplicationLocalService) {

		_healthCareApplicationLocalService = healthCareApplicationLocalService;
	}

	/**
	 * Adds the health care application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareApplication the health care application
	 * @return the health care application that was added
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.HealthCareApplication
			addHealthCareApplication(
				com.nbp.healthcare.application.form.service.model.
					HealthCareApplication healthCareApplication) {

		return _healthCareApplicationLocalService.addHealthCareApplication(
			healthCareApplication);
	}

	/**
	 * Creates a new health care application with the primary key. Does not add the health care application to the database.
	 *
	 * @param healthCareApplicationId the primary key for the new health care application
	 * @return the new health care application
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.HealthCareApplication
			createHealthCareApplication(long healthCareApplicationId) {

		return _healthCareApplicationLocalService.createHealthCareApplication(
			healthCareApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareApplicationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the health care application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareApplication the health care application
	 * @return the health care application that was removed
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.HealthCareApplication
			deleteHealthCareApplication(
				com.nbp.healthcare.application.form.service.model.
					HealthCareApplication healthCareApplication) {

		return _healthCareApplicationLocalService.deleteHealthCareApplication(
			healthCareApplication);
	}

	/**
	 * Deletes the health care application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareApplicationId the primary key of the health care application
	 * @return the health care application that was removed
	 * @throws PortalException if a health care application with the primary key could not be found
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.HealthCareApplication
				deleteHealthCareApplication(long healthCareApplicationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareApplicationLocalService.deleteHealthCareApplication(
			healthCareApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareApplicationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _healthCareApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _healthCareApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _healthCareApplicationLocalService.dynamicQuery();
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

		return _healthCareApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicationModelImpl</code>.
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

		return _healthCareApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicationModelImpl</code>.
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

		return _healthCareApplicationLocalService.dynamicQuery(
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

		return _healthCareApplicationLocalService.dynamicQueryCount(
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

		return _healthCareApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.healthcare.application.form.service.model.HealthCareApplication
			fetchHealthCareApplication(long healthCareApplicationId) {

		return _healthCareApplicationLocalService.fetchHealthCareApplication(
			healthCareApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _healthCareApplicationLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the health care application with the primary key.
	 *
	 * @param healthCareApplicationId the primary key of the health care application
	 * @return the health care application
	 * @throws PortalException if a health care application with the primary key could not be found
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.HealthCareApplication
				getHealthCareApplication(long healthCareApplicationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareApplicationLocalService.getHealthCareApplication(
			healthCareApplicationId);
	}

	/**
	 * Returns a range of all the health care applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @return the range of health care applications
	 */
	@Override
	public java.util.List
		<com.nbp.healthcare.application.form.service.model.
			HealthCareApplication> getHealthCareApplications(
				int start, int end) {

		return _healthCareApplicationLocalService.getHealthCareApplications(
			start, end);
	}

	/**
	 * Returns the number of health care applications.
	 *
	 * @return the number of health care applications
	 */
	@Override
	public int getHealthCareApplicationsCount() {
		return _healthCareApplicationLocalService.
			getHealthCareApplicationsCount();
	}

	@Override
	public
		com.nbp.healthcare.application.form.service.model.HealthCareApplication
				getHealthcareBy_CI(String healthcareCaseId)
			throws com.nbp.healthcare.application.form.service.exception.
				NoSuchHealthCareApplicationException {

		return _healthCareApplicationLocalService.getHealthcareBy_CI(
			healthcareCaseId);
	}

	@Override
	public
		com.nbp.healthcare.application.form.service.model.HealthCareApplication
				getHealthcareByAppNo(String healthcareApplicationNumber)
			throws com.nbp.healthcare.application.form.service.exception.
				NoSuchHealthCareApplicationException {

		return _healthCareApplicationLocalService.getHealthcareByAppNo(
			healthcareApplicationNumber);
	}

	@Override
	public java.util.List
		<com.nbp.healthcare.application.form.service.model.
			HealthCareApplication> getHealthCareByS_U(int status, long userId) {

		return _healthCareApplicationLocalService.getHealthCareByS_U(
			status, userId);
	}

	@Override
	public java.util.List
		<com.nbp.healthcare.application.form.service.model.
			HealthCareApplication> getHealthCareByStatus(int status) {

		return _healthCareApplicationLocalService.getHealthCareByStatus(status);
	}

	@Override
	public java.util.List<String> getHealthDistinctCategories() {
		return _healthCareApplicationLocalService.getHealthDistinctCategories();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _healthCareApplicationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthCareApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareApplicationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the health care application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareApplication the health care application
	 * @return the health care application that was updated
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.HealthCareApplication
			updateHealthCareApplication(
				com.nbp.healthcare.application.form.service.model.
					HealthCareApplication healthCareApplication) {

		return _healthCareApplicationLocalService.updateHealthCareApplication(
			healthCareApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _healthCareApplicationLocalService.getBasePersistence();
	}

	@Override
	public HealthCareApplicationLocalService getWrappedService() {
		return _healthCareApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		HealthCareApplicationLocalService healthCareApplicationLocalService) {

		_healthCareApplicationLocalService = healthCareApplicationLocalService;
	}

	private HealthCareApplicationLocalService
		_healthCareApplicationLocalService;

}