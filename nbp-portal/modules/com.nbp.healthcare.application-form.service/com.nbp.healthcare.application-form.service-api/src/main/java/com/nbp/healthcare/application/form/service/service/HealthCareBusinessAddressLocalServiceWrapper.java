/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link HealthCareBusinessAddressLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareBusinessAddressLocalService
 * @generated
 */
public class HealthCareBusinessAddressLocalServiceWrapper
	implements HealthCareBusinessAddressLocalService,
			   ServiceWrapper<HealthCareBusinessAddressLocalService> {

	public HealthCareBusinessAddressLocalServiceWrapper() {
		this(null);
	}

	public HealthCareBusinessAddressLocalServiceWrapper(
		HealthCareBusinessAddressLocalService
			healthCareBusinessAddressLocalService) {

		_healthCareBusinessAddressLocalService =
			healthCareBusinessAddressLocalService;
	}

	/**
	 * Adds the health care business address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareBusinessAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareBusinessAddress the health care business address
	 * @return the health care business address that was added
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareBusinessAddress addHealthCareBusinessAddress(
				com.nbp.healthcare.application.form.service.model.
					HealthCareBusinessAddress healthCareBusinessAddress) {

		return _healthCareBusinessAddressLocalService.
			addHealthCareBusinessAddress(healthCareBusinessAddress);
	}

	/**
	 * Creates a new health care business address with the primary key. Does not add the health care business address to the database.
	 *
	 * @param healthCareBusinessAddressId the primary key for the new health care business address
	 * @return the new health care business address
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareBusinessAddress createHealthCareBusinessAddress(
				long healthCareBusinessAddressId) {

		return _healthCareBusinessAddressLocalService.
			createHealthCareBusinessAddress(healthCareBusinessAddressId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareBusinessAddressLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the health care business address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareBusinessAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareBusinessAddress the health care business address
	 * @return the health care business address that was removed
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareBusinessAddress deleteHealthCareBusinessAddress(
				com.nbp.healthcare.application.form.service.model.
					HealthCareBusinessAddress healthCareBusinessAddress) {

		return _healthCareBusinessAddressLocalService.
			deleteHealthCareBusinessAddress(healthCareBusinessAddress);
	}

	/**
	 * Deletes the health care business address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareBusinessAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareBusinessAddressId the primary key of the health care business address
	 * @return the health care business address that was removed
	 * @throws PortalException if a health care business address with the primary key could not be found
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareBusinessAddress deleteHealthCareBusinessAddress(
					long healthCareBusinessAddressId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareBusinessAddressLocalService.
			deleteHealthCareBusinessAddress(healthCareBusinessAddressId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareBusinessAddressLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _healthCareBusinessAddressLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _healthCareBusinessAddressLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _healthCareBusinessAddressLocalService.dynamicQuery();
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

		return _healthCareBusinessAddressLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareBusinessAddressModelImpl</code>.
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

		return _healthCareBusinessAddressLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareBusinessAddressModelImpl</code>.
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

		return _healthCareBusinessAddressLocalService.dynamicQuery(
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

		return _healthCareBusinessAddressLocalService.dynamicQueryCount(
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

		return _healthCareBusinessAddressLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareBusinessAddress fetchHealthCareBusinessAddress(
				long healthCareBusinessAddressId) {

		return _healthCareBusinessAddressLocalService.
			fetchHealthCareBusinessAddress(healthCareBusinessAddressId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _healthCareBusinessAddressLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the health care business address with the primary key.
	 *
	 * @param healthCareBusinessAddressId the primary key of the health care business address
	 * @return the health care business address
	 * @throws PortalException if a health care business address with the primary key could not be found
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareBusinessAddress getHealthCareBusinessAddress(
					long healthCareBusinessAddressId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareBusinessAddressLocalService.
			getHealthCareBusinessAddress(healthCareBusinessAddressId);
	}

	/**
	 * Returns a range of all the health care business addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareBusinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care business addresses
	 * @param end the upper bound of the range of health care business addresses (not inclusive)
	 * @return the range of health care business addresses
	 */
	@Override
	public java.util.List
		<com.nbp.healthcare.application.form.service.model.
			HealthCareBusinessAddress> getHealthCareBusinessAddresses(
				int start, int end) {

		return _healthCareBusinessAddressLocalService.
			getHealthCareBusinessAddresses(start, end);
	}

	/**
	 * Returns the number of health care business addresses.
	 *
	 * @return the number of health care business addresses
	 */
	@Override
	public int getHealthCareBusinessAddressesCount() {
		return _healthCareBusinessAddressLocalService.
			getHealthCareBusinessAddressesCount();
	}

	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareBusinessAddress getHealthCareById(long healthCareById) {

		return _healthCareBusinessAddressLocalService.getHealthCareById(
			healthCareById);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _healthCareBusinessAddressLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthCareBusinessAddressLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthCareBusinessAddressLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the health care business address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareBusinessAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareBusinessAddress the health care business address
	 * @return the health care business address that was updated
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthCareBusinessAddress updateHealthCareBusinessAddress(
				com.nbp.healthcare.application.form.service.model.
					HealthCareBusinessAddress healthCareBusinessAddress) {

		return _healthCareBusinessAddressLocalService.
			updateHealthCareBusinessAddress(healthCareBusinessAddress);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _healthCareBusinessAddressLocalService.getBasePersistence();
	}

	@Override
	public HealthCareBusinessAddressLocalService getWrappedService() {
		return _healthCareBusinessAddressLocalService;
	}

	@Override
	public void setWrappedService(
		HealthCareBusinessAddressLocalService
			healthCareBusinessAddressLocalService) {

		_healthCareBusinessAddressLocalService =
			healthCareBusinessAddressLocalService;
	}

	private HealthCareBusinessAddressLocalService
		_healthCareBusinessAddressLocalService;

}