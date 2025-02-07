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
 * Provides a wrapper for {@link FarmerCropPracticeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerCropPracticeLocalService
 * @generated
 */
public class FarmerCropPracticeLocalServiceWrapper
	implements FarmerCropPracticeLocalService,
			   ServiceWrapper<FarmerCropPracticeLocalService> {

	public FarmerCropPracticeLocalServiceWrapper() {
		this(null);
	}

	public FarmerCropPracticeLocalServiceWrapper(
		FarmerCropPracticeLocalService farmerCropPracticeLocalService) {

		_farmerCropPracticeLocalService = farmerCropPracticeLocalService;
	}

	/**
	 * Adds the farmer crop practice to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerCropPracticeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerCropPractice the farmer crop practice
	 * @return the farmer crop practice that was added
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerCropPractice
		addFarmerCropPractice(
			com.nbp.farm.application.form.service.model.FarmerCropPractice
				farmerCropPractice) {

		return _farmerCropPracticeLocalService.addFarmerCropPractice(
			farmerCropPractice);
	}

	/**
	 * Creates a new farmer crop practice with the primary key. Does not add the farmer crop practice to the database.
	 *
	 * @param farmerCropPracticeId the primary key for the new farmer crop practice
	 * @return the new farmer crop practice
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerCropPractice
		createFarmerCropPractice(long farmerCropPracticeId) {

		return _farmerCropPracticeLocalService.createFarmerCropPractice(
			farmerCropPracticeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerCropPracticeLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void deleteCP_BY_ID(long applicationId) {
		_farmerCropPracticeLocalService.deleteCP_BY_ID(applicationId);
	}

	/**
	 * Deletes the farmer crop practice from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerCropPracticeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerCropPractice the farmer crop practice
	 * @return the farmer crop practice that was removed
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerCropPractice
		deleteFarmerCropPractice(
			com.nbp.farm.application.form.service.model.FarmerCropPractice
				farmerCropPractice) {

		return _farmerCropPracticeLocalService.deleteFarmerCropPractice(
			farmerCropPractice);
	}

	/**
	 * Deletes the farmer crop practice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerCropPracticeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerCropPracticeId the primary key of the farmer crop practice
	 * @return the farmer crop practice that was removed
	 * @throws PortalException if a farmer crop practice with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerCropPractice
			deleteFarmerCropPractice(long farmerCropPracticeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerCropPracticeLocalService.deleteFarmerCropPractice(
			farmerCropPracticeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerCropPracticeLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _farmerCropPracticeLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _farmerCropPracticeLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _farmerCropPracticeLocalService.dynamicQuery();
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

		return _farmerCropPracticeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerCropPracticeModelImpl</code>.
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

		return _farmerCropPracticeLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerCropPracticeModelImpl</code>.
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

		return _farmerCropPracticeLocalService.dynamicQuery(
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

		return _farmerCropPracticeLocalService.dynamicQueryCount(dynamicQuery);
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

		return _farmerCropPracticeLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.farm.application.form.service.model.FarmerCropPractice
		fetchFarmerCropPractice(long farmerCropPracticeId) {

		return _farmerCropPracticeLocalService.fetchFarmerCropPractice(
			farmerCropPracticeId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _farmerCropPracticeLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.farm.application.form.service.model.FarmerCropPractice>
			getFA_FFCP_FAI(long ApplicationId) {

		return _farmerCropPracticeLocalService.getFA_FFCP_FAI(ApplicationId);
	}

	@Override
	public com.nbp.farm.application.form.service.model.FarmerCropPractice
		getFarmerById(long ApplicationId) {

		return _farmerCropPracticeLocalService.getFarmerById(ApplicationId);
	}

	/**
	 * Returns the farmer crop practice with the primary key.
	 *
	 * @param farmerCropPracticeId the primary key of the farmer crop practice
	 * @return the farmer crop practice
	 * @throws PortalException if a farmer crop practice with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerCropPractice
			getFarmerCropPractice(long farmerCropPracticeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerCropPracticeLocalService.getFarmerCropPractice(
			farmerCropPracticeId);
	}

	/**
	 * Returns a range of all the farmer crop practices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerCropPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer crop practices
	 * @param end the upper bound of the range of farmer crop practices (not inclusive)
	 * @return the range of farmer crop practices
	 */
	@Override
	public java.util.List
		<com.nbp.farm.application.form.service.model.FarmerCropPractice>
			getFarmerCropPractices(int start, int end) {

		return _farmerCropPracticeLocalService.getFarmerCropPractices(
			start, end);
	}

	/**
	 * Returns the number of farmer crop practices.
	 *
	 * @return the number of farmer crop practices
	 */
	@Override
	public int getFarmerCropPracticesCount() {
		return _farmerCropPracticeLocalService.getFarmerCropPracticesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _farmerCropPracticeLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _farmerCropPracticeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerCropPracticeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the farmer crop practice in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerCropPracticeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerCropPractice the farmer crop practice
	 * @return the farmer crop practice that was updated
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerCropPractice
		updateFarmerCropPractice(
			com.nbp.farm.application.form.service.model.FarmerCropPractice
				farmerCropPractice) {

		return _farmerCropPracticeLocalService.updateFarmerCropPractice(
			farmerCropPractice);
	}

	@Override
	public FarmerCropPracticeLocalService getWrappedService() {
		return _farmerCropPracticeLocalService;
	}

	@Override
	public void setWrappedService(
		FarmerCropPracticeLocalService farmerCropPracticeLocalService) {

		_farmerCropPracticeLocalService = farmerCropPracticeLocalService;
	}

	private FarmerCropPracticeLocalService _farmerCropPracticeLocalService;

}