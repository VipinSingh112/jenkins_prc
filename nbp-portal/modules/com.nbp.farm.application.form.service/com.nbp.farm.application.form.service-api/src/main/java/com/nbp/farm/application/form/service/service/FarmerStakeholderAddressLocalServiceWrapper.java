/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FarmerStakeholderAddressLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerStakeholderAddressLocalService
 * @generated
 */
public class FarmerStakeholderAddressLocalServiceWrapper
	implements FarmerStakeholderAddressLocalService,
			   ServiceWrapper<FarmerStakeholderAddressLocalService> {

	public FarmerStakeholderAddressLocalServiceWrapper() {
		this(null);
	}

	public FarmerStakeholderAddressLocalServiceWrapper(
		FarmerStakeholderAddressLocalService
			farmerStakeholderAddressLocalService) {

		_farmerStakeholderAddressLocalService =
			farmerStakeholderAddressLocalService;
	}

	/**
	 * Adds the farmer stakeholder address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerStakeholderAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerStakeholderAddress the farmer stakeholder address
	 * @return the farmer stakeholder address that was added
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerStakeholderAddress
		addFarmerStakeholderAddress(
			com.nbp.farm.application.form.service.model.FarmerStakeholderAddress
				farmerStakeholderAddress) {

		return _farmerStakeholderAddressLocalService.
			addFarmerStakeholderAddress(farmerStakeholderAddress);
	}

	/**
	 * Creates a new farmer stakeholder address with the primary key. Does not add the farmer stakeholder address to the database.
	 *
	 * @param farmerStakeholderAddressId the primary key for the new farmer stakeholder address
	 * @return the new farmer stakeholder address
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerStakeholderAddress
		createFarmerStakeholderAddress(long farmerStakeholderAddressId) {

		return _farmerStakeholderAddressLocalService.
			createFarmerStakeholderAddress(farmerStakeholderAddressId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerStakeholderAddressLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the farmer stakeholder address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerStakeholderAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerStakeholderAddress the farmer stakeholder address
	 * @return the farmer stakeholder address that was removed
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerStakeholderAddress
		deleteFarmerStakeholderAddress(
			com.nbp.farm.application.form.service.model.FarmerStakeholderAddress
				farmerStakeholderAddress) {

		return _farmerStakeholderAddressLocalService.
			deleteFarmerStakeholderAddress(farmerStakeholderAddress);
	}

	/**
	 * Deletes the farmer stakeholder address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerStakeholderAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerStakeholderAddressId the primary key of the farmer stakeholder address
	 * @return the farmer stakeholder address that was removed
	 * @throws PortalException if a farmer stakeholder address with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerStakeholderAddress
			deleteFarmerStakeholderAddress(long farmerStakeholderAddressId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerStakeholderAddressLocalService.
			deleteFarmerStakeholderAddress(farmerStakeholderAddressId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerStakeholderAddressLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _farmerStakeholderAddressLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _farmerStakeholderAddressLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _farmerStakeholderAddressLocalService.dynamicQuery();
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

		return _farmerStakeholderAddressLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerStakeholderAddressModelImpl</code>.
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

		return _farmerStakeholderAddressLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerStakeholderAddressModelImpl</code>.
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

		return _farmerStakeholderAddressLocalService.dynamicQuery(
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

		return _farmerStakeholderAddressLocalService.dynamicQueryCount(
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

		return _farmerStakeholderAddressLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.farm.application.form.service.model.FarmerStakeholderAddress
		fetchFarmerStakeholderAddress(long farmerStakeholderAddressId) {

		return _farmerStakeholderAddressLocalService.
			fetchFarmerStakeholderAddress(farmerStakeholderAddressId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _farmerStakeholderAddressLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.farm.application.form.service.model.FarmerStakeholderAddress
		getFA_FSI_AT(String addressType, long farmerStakeholderInfoId) {

		return _farmerStakeholderAddressLocalService.getFA_FSI_AT(
			addressType, farmerStakeholderInfoId);
	}

	@Override
	public com.nbp.farm.application.form.service.model.FarmerStakeholderAddress
		getFarmerById(long applicationId) {

		return _farmerStakeholderAddressLocalService.getFarmerById(
			applicationId);
	}

	@Override
	public com.nbp.farm.application.form.service.model.FarmerStakeholderAddress
		getFarmerByStakeholderId(long applicationId) {

		return _farmerStakeholderAddressLocalService.getFarmerByStakeholderId(
			applicationId);
	}

	/**
	 * Returns the farmer stakeholder address with the primary key.
	 *
	 * @param farmerStakeholderAddressId the primary key of the farmer stakeholder address
	 * @return the farmer stakeholder address
	 * @throws PortalException if a farmer stakeholder address with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerStakeholderAddress
			getFarmerStakeholderAddress(long farmerStakeholderAddressId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerStakeholderAddressLocalService.
			getFarmerStakeholderAddress(farmerStakeholderAddressId);
	}

	/**
	 * Returns a range of all the farmer stakeholder addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerStakeholderAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer stakeholder addresses
	 * @param end the upper bound of the range of farmer stakeholder addresses (not inclusive)
	 * @return the range of farmer stakeholder addresses
	 */
	@Override
	public java.util.List
		<com.nbp.farm.application.form.service.model.FarmerStakeholderAddress>
			getFarmerStakeholderAddresses(int start, int end) {

		return _farmerStakeholderAddressLocalService.
			getFarmerStakeholderAddresses(start, end);
	}

	/**
	 * Returns the number of farmer stakeholder addresses.
	 *
	 * @return the number of farmer stakeholder addresses
	 */
	@Override
	public int getFarmerStakeholderAddressesCount() {
		return _farmerStakeholderAddressLocalService.
			getFarmerStakeholderAddressesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _farmerStakeholderAddressLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _farmerStakeholderAddressLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerStakeholderAddressLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the farmer stakeholder address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerStakeholderAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerStakeholderAddress the farmer stakeholder address
	 * @return the farmer stakeholder address that was updated
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerStakeholderAddress
		updateFarmerStakeholderAddress(
			com.nbp.farm.application.form.service.model.FarmerStakeholderAddress
				farmerStakeholderAddress) {

		return _farmerStakeholderAddressLocalService.
			updateFarmerStakeholderAddress(farmerStakeholderAddress);
	}

	@Override
	public FarmerStakeholderAddressLocalService getWrappedService() {
		return _farmerStakeholderAddressLocalService;
	}

	@Override
	public void setWrappedService(
		FarmerStakeholderAddressLocalService
			farmerStakeholderAddressLocalService) {

		_farmerStakeholderAddressLocalService =
			farmerStakeholderAddressLocalService;
	}

	private FarmerStakeholderAddressLocalService
		_farmerStakeholderAddressLocalService;

}