/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link HealthCareApplicantAddressLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicantAddressLocalService
 * @generated
 */
public class HealthCareApplicantAddressLocalServiceWrapper
	implements HealthCareApplicantAddressLocalService,
			   ServiceWrapper<HealthCareApplicantAddressLocalService> {

	public HealthCareApplicantAddressLocalServiceWrapper() {
		this(null);
	}

	public HealthCareApplicantAddressLocalServiceWrapper(
		HealthCareApplicantAddressLocalService
			healthCareApplicantAddressLocalService) {

		_healthCareApplicantAddressLocalService =
			healthCareApplicantAddressLocalService;
	}

	/**
	 * Adds the health care applicant address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareApplicantAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareApplicantAddress the health care applicant address
	 * @return the health care applicant address that was added
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareApplicantAddress addHealthCareApplicantAddress(
				com.nbp.healthcare.application.form.service.model.
					HealthCareApplicantAddress healthCareApplicantAddress) {

		return _healthCareApplicantAddressLocalService.
			addHealthCareApplicantAddress(healthCareApplicantAddress);
	}

	/**
	 * Creates a new health care applicant address with the primary key. Does not add the health care applicant address to the database.
	 *
	 * @param healthCareApplicantAddressId the primary key for the new health care applicant address
	 * @return the new health care applicant address
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareApplicantAddress createHealthCareApplicantAddress(
				long healthCareApplicantAddressId) {

		return _healthCareApplicantAddressLocalService.
			createHealthCareApplicantAddress(healthCareApplicantAddressId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareApplicantAddressLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the health care applicant address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareApplicantAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareApplicantAddress the health care applicant address
	 * @return the health care applicant address that was removed
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareApplicantAddress deleteHealthCareApplicantAddress(
				com.nbp.healthcare.application.form.service.model.
					HealthCareApplicantAddress healthCareApplicantAddress) {

		return _healthCareApplicantAddressLocalService.
			deleteHealthCareApplicantAddress(healthCareApplicantAddress);
	}

	/**
	 * Deletes the health care applicant address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareApplicantAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareApplicantAddressId the primary key of the health care applicant address
	 * @return the health care applicant address that was removed
	 * @throws PortalException if a health care applicant address with the primary key could not be found
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareApplicantAddress deleteHealthCareApplicantAddress(
					long healthCareApplicantAddressId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareApplicantAddressLocalService.
			deleteHealthCareApplicantAddress(healthCareApplicantAddressId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareApplicantAddressLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _healthCareApplicantAddressLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _healthCareApplicantAddressLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _healthCareApplicantAddressLocalService.dynamicQuery();
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

		return _healthCareApplicantAddressLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicantAddressModelImpl</code>.
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

		return _healthCareApplicantAddressLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicantAddressModelImpl</code>.
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

		return _healthCareApplicantAddressLocalService.dynamicQuery(
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

		return _healthCareApplicantAddressLocalService.dynamicQueryCount(
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

		return _healthCareApplicantAddressLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareApplicantAddress fetchHealthCareApplicantAddress(
				long healthCareApplicantAddressId) {

		return _healthCareApplicantAddressLocalService.
			fetchHealthCareApplicantAddress(healthCareApplicantAddressId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _healthCareApplicantAddressLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the health care applicant address with the primary key.
	 *
	 * @param healthCareApplicantAddressId the primary key of the health care applicant address
	 * @return the health care applicant address
	 * @throws PortalException if a health care applicant address with the primary key could not be found
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareApplicantAddress getHealthCareApplicantAddress(
					long healthCareApplicantAddressId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareApplicantAddressLocalService.
			getHealthCareApplicantAddress(healthCareApplicantAddressId);
	}

	/**
	 * Returns a range of all the health care applicant addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicantAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applicant addresses
	 * @param end the upper bound of the range of health care applicant addresses (not inclusive)
	 * @return the range of health care applicant addresses
	 */
	@Override
	public java.util.List
		<com.nbp.healthcare.application.form.service.model.
			HealthCareApplicantAddress> getHealthCareApplicantAddresses(
				int start, int end) {

		return _healthCareApplicantAddressLocalService.
			getHealthCareApplicantAddresses(start, end);
	}

	/**
	 * Returns the number of health care applicant addresses.
	 *
	 * @return the number of health care applicant addresses
	 */
	@Override
	public int getHealthCareApplicantAddressesCount() {
		return _healthCareApplicantAddressLocalService.
			getHealthCareApplicantAddressesCount();
	}

	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareApplicantAddress getHealthCareById(
				long healthCareApplicationId) {

		return _healthCareApplicantAddressLocalService.getHealthCareById(
			healthCareApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _healthCareApplicantAddressLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthCareApplicantAddressLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareApplicantAddressLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the health care applicant address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareApplicantAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareApplicantAddress the health care applicant address
	 * @return the health care applicant address that was updated
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareApplicantAddress updateHealthCareApplicantAddress(
				com.nbp.healthcare.application.form.service.model.
					HealthCareApplicantAddress healthCareApplicantAddress) {

		return _healthCareApplicantAddressLocalService.
			updateHealthCareApplicantAddress(healthCareApplicantAddress);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _healthCareApplicantAddressLocalService.getBasePersistence();
	}

	@Override
	public HealthCareApplicantAddressLocalService getWrappedService() {
		return _healthCareApplicantAddressLocalService;
	}

	@Override
	public void setWrappedService(
		HealthCareApplicantAddressLocalService
			healthCareApplicantAddressLocalService) {

		_healthCareApplicantAddressLocalService =
			healthCareApplicantAddressLocalService;
	}

	private HealthCareApplicantAddressLocalService
		_healthCareApplicantAddressLocalService;

}