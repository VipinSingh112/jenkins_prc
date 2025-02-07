/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link HealthDeskVerificationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthDeskVerificationLocalService
 * @generated
 */
public class HealthDeskVerificationLocalServiceWrapper
	implements HealthDeskVerificationLocalService,
			   ServiceWrapper<HealthDeskVerificationLocalService> {

	public HealthDeskVerificationLocalServiceWrapper() {
		this(null);
	}

	public HealthDeskVerificationLocalServiceWrapper(
		HealthDeskVerificationLocalService healthDeskVerificationLocalService) {

		_healthDeskVerificationLocalService =
			healthDeskVerificationLocalService;
	}

	/**
	 * Adds the health desk verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthDeskVerification the health desk verification
	 * @return the health desk verification that was added
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthDeskVerification
		addHealthDeskVerification(
			com.nbp.healthcare.stage.service.model.HealthDeskVerification
				healthDeskVerification) {

		return _healthDeskVerificationLocalService.addHealthDeskVerification(
			healthDeskVerification);
	}

	/**
	 * Creates a new health desk verification with the primary key. Does not add the health desk verification to the database.
	 *
	 * @param healthDeskVerificationId the primary key for the new health desk verification
	 * @return the new health desk verification
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthDeskVerification
		createHealthDeskVerification(long healthDeskVerificationId) {

		return _healthDeskVerificationLocalService.createHealthDeskVerification(
			healthDeskVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthDeskVerificationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void deleteHealthCareDV_ById(long healthCareApplicationId) {
		_healthDeskVerificationLocalService.deleteHealthCareDV_ById(
			healthCareApplicationId);
	}

	/**
	 * Deletes the health desk verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthDeskVerification the health desk verification
	 * @return the health desk verification that was removed
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthDeskVerification
		deleteHealthDeskVerification(
			com.nbp.healthcare.stage.service.model.HealthDeskVerification
				healthDeskVerification) {

		return _healthDeskVerificationLocalService.deleteHealthDeskVerification(
			healthDeskVerification);
	}

	/**
	 * Deletes the health desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthDeskVerificationId the primary key of the health desk verification
	 * @return the health desk verification that was removed
	 * @throws PortalException if a health desk verification with the primary key could not be found
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthDeskVerification
			deleteHealthDeskVerification(long healthDeskVerificationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthDeskVerificationLocalService.deleteHealthDeskVerification(
			healthDeskVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthDeskVerificationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _healthDeskVerificationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _healthDeskVerificationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _healthDeskVerificationLocalService.dynamicQuery();
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

		return _healthDeskVerificationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthDeskVerificationModelImpl</code>.
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

		return _healthDeskVerificationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthDeskVerificationModelImpl</code>.
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

		return _healthDeskVerificationLocalService.dynamicQuery(
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

		return _healthDeskVerificationLocalService.dynamicQueryCount(
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

		return _healthDeskVerificationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.healthcare.stage.service.model.HealthDeskVerification
		fetchHealthDeskVerification(long healthDeskVerificationId) {

		return _healthDeskVerificationLocalService.fetchHealthDeskVerification(
			healthDeskVerificationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _healthDeskVerificationLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the health desk verification with the primary key.
	 *
	 * @param healthDeskVerificationId the primary key of the health desk verification
	 * @return the health desk verification
	 * @throws PortalException if a health desk verification with the primary key could not be found
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthDeskVerification
			getHealthDeskVerification(long healthDeskVerificationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthDeskVerificationLocalService.getHealthDeskVerification(
			healthDeskVerificationId);
	}

	/**
	 * Returns a range of all the health desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health desk verifications
	 * @param end the upper bound of the range of health desk verifications (not inclusive)
	 * @return the range of health desk verifications
	 */
	@Override
	public java.util.List
		<com.nbp.healthcare.stage.service.model.HealthDeskVerification>
			getHealthDeskVerifications(int start, int end) {

		return _healthDeskVerificationLocalService.getHealthDeskVerifications(
			start, end);
	}

	/**
	 * Returns the number of health desk verifications.
	 *
	 * @return the number of health desk verifications
	 */
	@Override
	public int getHealthDeskVerificationsCount() {
		return _healthDeskVerificationLocalService.
			getHealthDeskVerificationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _healthDeskVerificationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthDeskVerificationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthDeskVerificationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.healthcare.stage.service.model.HealthDeskVerification>
			healthCareDeskVerification(long healthCareApplicationId) {

		return _healthDeskVerificationLocalService.healthCareDeskVerification(
			healthCareApplicationId);
	}

	/**
	 * Updates the health desk verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthDeskVerification the health desk verification
	 * @return the health desk verification that was updated
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthDeskVerification
		updateHealthDeskVerification(
			com.nbp.healthcare.stage.service.model.HealthDeskVerification
				healthDeskVerification) {

		return _healthDeskVerificationLocalService.updateHealthDeskVerification(
			healthDeskVerification);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _healthDeskVerificationLocalService.getBasePersistence();
	}

	@Override
	public HealthDeskVerificationLocalService getWrappedService() {
		return _healthDeskVerificationLocalService;
	}

	@Override
	public void setWrappedService(
		HealthDeskVerificationLocalService healthDeskVerificationLocalService) {

		_healthDeskVerificationLocalService =
			healthDeskVerificationLocalService;
	}

	private HealthDeskVerificationLocalService
		_healthDeskVerificationLocalService;

}