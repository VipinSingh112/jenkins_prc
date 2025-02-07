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

package com.nbp.farm.application.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FarmDeskVerificationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FarmDeskVerificationLocalService
 * @generated
 */
public class FarmDeskVerificationLocalServiceWrapper
	implements FarmDeskVerificationLocalService,
			   ServiceWrapper<FarmDeskVerificationLocalService> {

	public FarmDeskVerificationLocalServiceWrapper() {
		this(null);
	}

	public FarmDeskVerificationLocalServiceWrapper(
		FarmDeskVerificationLocalService farmDeskVerificationLocalService) {

		_farmDeskVerificationLocalService = farmDeskVerificationLocalService;
	}

	/**
	 * Adds the farm desk verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmDeskVerification the farm desk verification
	 * @return the farm desk verification that was added
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmDeskVerification
		addFarmDeskVerification(
			com.nbp.farm.application.stages.service.model.FarmDeskVerification
				farmDeskVerification) {

		return _farmDeskVerificationLocalService.addFarmDeskVerification(
			farmDeskVerification);
	}

	/**
	 * Creates a new farm desk verification with the primary key. Does not add the farm desk verification to the database.
	 *
	 * @param farmDeskVerificationId the primary key for the new farm desk verification
	 * @return the new farm desk verification
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmDeskVerification
		createFarmDeskVerification(long farmDeskVerificationId) {

		return _farmDeskVerificationLocalService.createFarmDeskVerification(
			farmDeskVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmDeskVerificationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void deleteFarmDeskVer_ById(long farmerApplicationId) {
		_farmDeskVerificationLocalService.deleteFarmDeskVer_ById(
			farmerApplicationId);
	}

	/**
	 * Deletes the farm desk verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmDeskVerification the farm desk verification
	 * @return the farm desk verification that was removed
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmDeskVerification
		deleteFarmDeskVerification(
			com.nbp.farm.application.stages.service.model.FarmDeskVerification
				farmDeskVerification) {

		return _farmDeskVerificationLocalService.deleteFarmDeskVerification(
			farmDeskVerification);
	}

	/**
	 * Deletes the farm desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmDeskVerificationId the primary key of the farm desk verification
	 * @return the farm desk verification that was removed
	 * @throws PortalException if a farm desk verification with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmDeskVerification
			deleteFarmDeskVerification(long farmDeskVerificationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmDeskVerificationLocalService.deleteFarmDeskVerification(
			farmDeskVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmDeskVerificationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _farmDeskVerificationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _farmDeskVerificationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _farmDeskVerificationLocalService.dynamicQuery();
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

		return _farmDeskVerificationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.stages.service.model.impl.FarmDeskVerificationModelImpl</code>.
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

		return _farmDeskVerificationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.stages.service.model.impl.FarmDeskVerificationModelImpl</code>.
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

		return _farmDeskVerificationLocalService.dynamicQuery(
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

		return _farmDeskVerificationLocalService.dynamicQueryCount(
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

		return _farmDeskVerificationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.farm.application.stages.service.model.FarmDeskVerification
		fetchFarmDeskVerification(long farmDeskVerificationId) {

		return _farmDeskVerificationLocalService.fetchFarmDeskVerification(
			farmDeskVerificationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _farmDeskVerificationLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the farm desk verification with the primary key.
	 *
	 * @param farmDeskVerificationId the primary key of the farm desk verification
	 * @return the farm desk verification
	 * @throws PortalException if a farm desk verification with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmDeskVerification
			getFarmDeskVerification(long farmDeskVerificationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmDeskVerificationLocalService.getFarmDeskVerification(
			farmDeskVerificationId);
	}

	/**
	 * Returns a range of all the farm desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.stages.service.model.impl.FarmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm desk verifications
	 * @param end the upper bound of the range of farm desk verifications (not inclusive)
	 * @return the range of farm desk verifications
	 */
	@Override
	public java.util.List
		<com.nbp.farm.application.stages.service.model.FarmDeskVerification>
			getFarmDeskVerifications(int start, int end) {

		return _farmDeskVerificationLocalService.getFarmDeskVerifications(
			start, end);
	}

	/**
	 * Returns the number of farm desk verifications.
	 *
	 * @return the number of farm desk verifications
	 */
	@Override
	public int getFarmDeskVerificationsCount() {
		return _farmDeskVerificationLocalService.
			getFarmDeskVerificationsCount();
	}

	@Override
	public java.util.List
		<com.nbp.farm.application.stages.service.model.FarmDeskVerification>
			getFarmerDeskVerifications(long farmerApplicationId) {

		return _farmDeskVerificationLocalService.getFarmerDeskVerifications(
			farmerApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _farmDeskVerificationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _farmDeskVerificationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmDeskVerificationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the farm desk verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmDeskVerification the farm desk verification
	 * @return the farm desk verification that was updated
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmDeskVerification
		updateFarmDeskVerification(
			com.nbp.farm.application.stages.service.model.FarmDeskVerification
				farmDeskVerification) {

		return _farmDeskVerificationLocalService.updateFarmDeskVerification(
			farmDeskVerification);
	}

	@Override
	public FarmDeskVerificationLocalService getWrappedService() {
		return _farmDeskVerificationLocalService;
	}

	@Override
	public void setWrappedService(
		FarmDeskVerificationLocalService farmDeskVerificationLocalService) {

		_farmDeskVerificationLocalService = farmDeskVerificationLocalService;
	}

	private FarmDeskVerificationLocalService _farmDeskVerificationLocalService;

}