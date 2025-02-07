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
 * Provides a wrapper for {@link FarmerCropLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerCropLocalService
 * @generated
 */
public class FarmerCropLocalServiceWrapper
	implements FarmerCropLocalService, ServiceWrapper<FarmerCropLocalService> {

	public FarmerCropLocalServiceWrapper() {
		this(null);
	}

	public FarmerCropLocalServiceWrapper(
		FarmerCropLocalService farmerCropLocalService) {

		_farmerCropLocalService = farmerCropLocalService;
	}

	/**
	 * Adds the farmer crop to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerCropLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerCrop the farmer crop
	 * @return the farmer crop that was added
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerCrop addFarmerCrop(
		com.nbp.farm.application.form.service.model.FarmerCrop farmerCrop) {

		return _farmerCropLocalService.addFarmerCrop(farmerCrop);
	}

	/**
	 * Creates a new farmer crop with the primary key. Does not add the farmer crop to the database.
	 *
	 * @param farmerCropId the primary key for the new farmer crop
	 * @return the new farmer crop
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerCrop
		createFarmerCrop(long farmerCropId) {

		return _farmerCropLocalService.createFarmerCrop(farmerCropId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerCropLocalService.createPersistedModel(primaryKeyObj);
	}

	@Override
	public void deleteFA_CROP_FAI(long applicationId) {
		_farmerCropLocalService.deleteFA_CROP_FAI(applicationId);
	}

	/**
	 * Deletes the farmer crop from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerCropLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerCrop the farmer crop
	 * @return the farmer crop that was removed
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerCrop
		deleteFarmerCrop(
			com.nbp.farm.application.form.service.model.FarmerCrop farmerCrop) {

		return _farmerCropLocalService.deleteFarmerCrop(farmerCrop);
	}

	/**
	 * Deletes the farmer crop with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerCropLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerCropId the primary key of the farmer crop
	 * @return the farmer crop that was removed
	 * @throws PortalException if a farmer crop with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerCrop
			deleteFarmerCrop(long farmerCropId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerCropLocalService.deleteFarmerCrop(farmerCropId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerCropLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _farmerCropLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _farmerCropLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _farmerCropLocalService.dynamicQuery();
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

		return _farmerCropLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerCropModelImpl</code>.
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

		return _farmerCropLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerCropModelImpl</code>.
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

		return _farmerCropLocalService.dynamicQuery(
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

		return _farmerCropLocalService.dynamicQueryCount(dynamicQuery);
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

		return _farmerCropLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.farm.application.form.service.model.FarmerCrop
		fetchFarmerCrop(long farmerCropId) {

		return _farmerCropLocalService.fetchFarmerCrop(farmerCropId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _farmerCropLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.farm.application.form.service.model.FarmerCrop> getFA_FC_FAI(
			long ApplicataionId) {

		return _farmerCropLocalService.getFA_FC_FAI(ApplicataionId);
	}

	@Override
	public java.util.List
		<com.nbp.farm.application.form.service.model.FarmerCrop> getFA_FCP_FAI(
			long ApplicationId) {

		return _farmerCropLocalService.getFA_FCP_FAI(ApplicationId);
	}

	@Override
	public com.nbp.farm.application.form.service.model.FarmerCrop getFarmerById(
		long ApplicataionId) {

		return _farmerCropLocalService.getFarmerById(ApplicataionId);
	}

	/**
	 * Returns the farmer crop with the primary key.
	 *
	 * @param farmerCropId the primary key of the farmer crop
	 * @return the farmer crop
	 * @throws PortalException if a farmer crop with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerCrop getFarmerCrop(
			long farmerCropId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerCropLocalService.getFarmerCrop(farmerCropId);
	}

	/**
	 * Returns a range of all the farmer crops.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerCropModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer crops
	 * @param end the upper bound of the range of farmer crops (not inclusive)
	 * @return the range of farmer crops
	 */
	@Override
	public java.util.List
		<com.nbp.farm.application.form.service.model.FarmerCrop> getFarmerCrops(
			int start, int end) {

		return _farmerCropLocalService.getFarmerCrops(start, end);
	}

	/**
	 * Returns the number of farmer crops.
	 *
	 * @return the number of farmer crops
	 */
	@Override
	public int getFarmerCropsCount() {
		return _farmerCropLocalService.getFarmerCropsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _farmerCropLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _farmerCropLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerCropLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the farmer crop in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerCropLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerCrop the farmer crop
	 * @return the farmer crop that was updated
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerCrop
		updateFarmerCrop(
			com.nbp.farm.application.form.service.model.FarmerCrop farmerCrop) {

		return _farmerCropLocalService.updateFarmerCrop(farmerCrop);
	}

	@Override
	public FarmerCropLocalService getWrappedService() {
		return _farmerCropLocalService;
	}

	@Override
	public void setWrappedService(
		FarmerCropLocalService farmerCropLocalService) {

		_farmerCropLocalService = farmerCropLocalService;
	}

	private FarmerCropLocalService _farmerCropLocalService;

}