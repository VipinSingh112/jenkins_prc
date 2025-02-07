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
 * Provides a wrapper for {@link FarmerProfileLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerProfileLocalService
 * @generated
 */
public class FarmerProfileLocalServiceWrapper
	implements FarmerProfileLocalService,
			   ServiceWrapper<FarmerProfileLocalService> {

	public FarmerProfileLocalServiceWrapper() {
		this(null);
	}

	public FarmerProfileLocalServiceWrapper(
		FarmerProfileLocalService farmerProfileLocalService) {

		_farmerProfileLocalService = farmerProfileLocalService;
	}

	/**
	 * Adds the farmer profile to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerProfileLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerProfile the farmer profile
	 * @return the farmer profile that was added
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerProfile
		addFarmerProfile(
			com.nbp.farm.application.form.service.model.FarmerProfile
				farmerProfile) {

		return _farmerProfileLocalService.addFarmerProfile(farmerProfile);
	}

	/**
	 * Creates a new farmer profile with the primary key. Does not add the farmer profile to the database.
	 *
	 * @param farmerProfileId the primary key for the new farmer profile
	 * @return the new farmer profile
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerProfile
		createFarmerProfile(long farmerProfileId) {

		return _farmerProfileLocalService.createFarmerProfile(farmerProfileId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerProfileLocalService.createPersistedModel(primaryKeyObj);
	}

	@Override
	public void deleteBy_Id(long applicationId) {
		_farmerProfileLocalService.deleteBy_Id(applicationId);
	}

	/**
	 * Deletes the farmer profile from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerProfileLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerProfile the farmer profile
	 * @return the farmer profile that was removed
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerProfile
		deleteFarmerProfile(
			com.nbp.farm.application.form.service.model.FarmerProfile
				farmerProfile) {

		return _farmerProfileLocalService.deleteFarmerProfile(farmerProfile);
	}

	/**
	 * Deletes the farmer profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerProfileLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerProfileId the primary key of the farmer profile
	 * @return the farmer profile that was removed
	 * @throws PortalException if a farmer profile with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerProfile
			deleteFarmerProfile(long farmerProfileId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerProfileLocalService.deleteFarmerProfile(farmerProfileId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerProfileLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _farmerProfileLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _farmerProfileLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _farmerProfileLocalService.dynamicQuery();
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

		return _farmerProfileLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerProfileModelImpl</code>.
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

		return _farmerProfileLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerProfileModelImpl</code>.
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

		return _farmerProfileLocalService.dynamicQuery(
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

		return _farmerProfileLocalService.dynamicQueryCount(dynamicQuery);
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

		return _farmerProfileLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.farm.application.form.service.model.FarmerProfile
		fetchFarmerProfile(long farmerProfileId) {

		return _farmerProfileLocalService.fetchFarmerProfile(farmerProfileId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _farmerProfileLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.farm.application.form.service.model.FarmerProfile>
			getFA_FP_FAI(long ApplicationId) {

		return _farmerProfileLocalService.getFA_FP_FAI(ApplicationId);
	}

	@Override
	public com.nbp.farm.application.form.service.model.FarmerProfile
		getFarmerById(long ApplicationId) {

		return _farmerProfileLocalService.getFarmerById(ApplicationId);
	}

	/**
	 * Returns the farmer profile with the primary key.
	 *
	 * @param farmerProfileId the primary key of the farmer profile
	 * @return the farmer profile
	 * @throws PortalException if a farmer profile with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerProfile
			getFarmerProfile(long farmerProfileId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerProfileLocalService.getFarmerProfile(farmerProfileId);
	}

	/**
	 * Returns a range of all the farmer profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer profiles
	 * @param end the upper bound of the range of farmer profiles (not inclusive)
	 * @return the range of farmer profiles
	 */
	@Override
	public java.util.List
		<com.nbp.farm.application.form.service.model.FarmerProfile>
			getFarmerProfiles(int start, int end) {

		return _farmerProfileLocalService.getFarmerProfiles(start, end);
	}

	/**
	 * Returns the number of farmer profiles.
	 *
	 * @return the number of farmer profiles
	 */
	@Override
	public int getFarmerProfilesCount() {
		return _farmerProfileLocalService.getFarmerProfilesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _farmerProfileLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _farmerProfileLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerProfileLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the farmer profile in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerProfileLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerProfile the farmer profile
	 * @return the farmer profile that was updated
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerProfile
		updateFarmerProfile(
			com.nbp.farm.application.form.service.model.FarmerProfile
				farmerProfile) {

		return _farmerProfileLocalService.updateFarmerProfile(farmerProfile);
	}

	@Override
	public FarmerProfileLocalService getWrappedService() {
		return _farmerProfileLocalService;
	}

	@Override
	public void setWrappedService(
		FarmerProfileLocalService farmerProfileLocalService) {

		_farmerProfileLocalService = farmerProfileLocalService;
	}

	private FarmerProfileLocalService _farmerProfileLocalService;

}