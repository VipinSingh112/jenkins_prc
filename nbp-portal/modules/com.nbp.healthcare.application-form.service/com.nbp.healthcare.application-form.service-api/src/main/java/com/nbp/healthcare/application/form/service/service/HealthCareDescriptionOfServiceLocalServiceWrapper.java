/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link HealthCareDescriptionOfServiceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareDescriptionOfServiceLocalService
 * @generated
 */
public class HealthCareDescriptionOfServiceLocalServiceWrapper
	implements HealthCareDescriptionOfServiceLocalService,
			   ServiceWrapper<HealthCareDescriptionOfServiceLocalService> {

	public HealthCareDescriptionOfServiceLocalServiceWrapper() {
		this(null);
	}

	public HealthCareDescriptionOfServiceLocalServiceWrapper(
		HealthCareDescriptionOfServiceLocalService
			healthCareDescriptionOfServiceLocalService) {

		_healthCareDescriptionOfServiceLocalService =
			healthCareDescriptionOfServiceLocalService;
	}

	/**
	 * Adds the health care description of service to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareDescriptionOfServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareDescriptionOfService the health care description of service
	 * @return the health care description of service that was added
	 */
	@Override
	public com.nbp.healthcare.application.form.service.model.
		HealthCareDescriptionOfService addHealthCareDescriptionOfService(
			com.nbp.healthcare.application.form.service.model.
				HealthCareDescriptionOfService healthCareDescriptionOfService) {

		return _healthCareDescriptionOfServiceLocalService.
			addHealthCareDescriptionOfService(healthCareDescriptionOfService);
	}

	/**
	 * Creates a new health care description of service with the primary key. Does not add the health care description of service to the database.
	 *
	 * @param healthCareDescriptionId the primary key for the new health care description of service
	 * @return the new health care description of service
	 */
	@Override
	public com.nbp.healthcare.application.form.service.model.
		HealthCareDescriptionOfService createHealthCareDescriptionOfService(
			long healthCareDescriptionId) {

		return _healthCareDescriptionOfServiceLocalService.
			createHealthCareDescriptionOfService(healthCareDescriptionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareDescriptionOfServiceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the health care description of service from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareDescriptionOfServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareDescriptionOfService the health care description of service
	 * @return the health care description of service that was removed
	 */
	@Override
	public com.nbp.healthcare.application.form.service.model.
		HealthCareDescriptionOfService deleteHealthCareDescriptionOfService(
			com.nbp.healthcare.application.form.service.model.
				HealthCareDescriptionOfService healthCareDescriptionOfService) {

		return _healthCareDescriptionOfServiceLocalService.
			deleteHealthCareDescriptionOfService(
				healthCareDescriptionOfService);
	}

	/**
	 * Deletes the health care description of service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareDescriptionOfServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareDescriptionId the primary key of the health care description of service
	 * @return the health care description of service that was removed
	 * @throws PortalException if a health care description of service with the primary key could not be found
	 */
	@Override
	public com.nbp.healthcare.application.form.service.model.
		HealthCareDescriptionOfService deleteHealthCareDescriptionOfService(
				long healthCareDescriptionId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareDescriptionOfServiceLocalService.
			deleteHealthCareDescriptionOfService(healthCareDescriptionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareDescriptionOfServiceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _healthCareDescriptionOfServiceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _healthCareDescriptionOfServiceLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _healthCareDescriptionOfServiceLocalService.dynamicQuery();
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

		return _healthCareDescriptionOfServiceLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareDescriptionOfServiceModelImpl</code>.
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

		return _healthCareDescriptionOfServiceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareDescriptionOfServiceModelImpl</code>.
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

		return _healthCareDescriptionOfServiceLocalService.dynamicQuery(
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

		return _healthCareDescriptionOfServiceLocalService.dynamicQueryCount(
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

		return _healthCareDescriptionOfServiceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.healthcare.application.form.service.model.
		HealthCareDescriptionOfService fetchHealthCareDescriptionOfService(
			long healthCareDescriptionId) {

		return _healthCareDescriptionOfServiceLocalService.
			fetchHealthCareDescriptionOfService(healthCareDescriptionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _healthCareDescriptionOfServiceLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.healthcare.application.form.service.model.
		HealthCareDescriptionOfService getHealthCareById(
			long healthCareApplicationId) {

		return _healthCareDescriptionOfServiceLocalService.getHealthCareById(
			healthCareApplicationId);
	}

	/**
	 * Returns the health care description of service with the primary key.
	 *
	 * @param healthCareDescriptionId the primary key of the health care description of service
	 * @return the health care description of service
	 * @throws PortalException if a health care description of service with the primary key could not be found
	 */
	@Override
	public com.nbp.healthcare.application.form.service.model.
		HealthCareDescriptionOfService getHealthCareDescriptionOfService(
				long healthCareDescriptionId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareDescriptionOfServiceLocalService.
			getHealthCareDescriptionOfService(healthCareDescriptionId);
	}

	/**
	 * Returns a range of all the health care description of services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareDescriptionOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care description of services
	 * @param end the upper bound of the range of health care description of services (not inclusive)
	 * @return the range of health care description of services
	 */
	@Override
	public java.util.List
		<com.nbp.healthcare.application.form.service.model.
			HealthCareDescriptionOfService> getHealthCareDescriptionOfServices(
				int start, int end) {

		return _healthCareDescriptionOfServiceLocalService.
			getHealthCareDescriptionOfServices(start, end);
	}

	/**
	 * Returns the number of health care description of services.
	 *
	 * @return the number of health care description of services
	 */
	@Override
	public int getHealthCareDescriptionOfServicesCount() {
		return _healthCareDescriptionOfServiceLocalService.
			getHealthCareDescriptionOfServicesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _healthCareDescriptionOfServiceLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthCareDescriptionOfServiceLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareDescriptionOfServiceLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the health care description of service in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareDescriptionOfServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareDescriptionOfService the health care description of service
	 * @return the health care description of service that was updated
	 */
	@Override
	public com.nbp.healthcare.application.form.service.model.
		HealthCareDescriptionOfService updateHealthCareDescriptionOfService(
			com.nbp.healthcare.application.form.service.model.
				HealthCareDescriptionOfService healthCareDescriptionOfService) {

		return _healthCareDescriptionOfServiceLocalService.
			updateHealthCareDescriptionOfService(
				healthCareDescriptionOfService);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _healthCareDescriptionOfServiceLocalService.getBasePersistence();
	}

	@Override
	public HealthCareDescriptionOfServiceLocalService getWrappedService() {
		return _healthCareDescriptionOfServiceLocalService;
	}

	@Override
	public void setWrappedService(
		HealthCareDescriptionOfServiceLocalService
			healthCareDescriptionOfServiceLocalService) {

		_healthCareDescriptionOfServiceLocalService =
			healthCareDescriptionOfServiceLocalService;
	}

	private HealthCareDescriptionOfServiceLocalService
		_healthCareDescriptionOfServiceLocalService;

}