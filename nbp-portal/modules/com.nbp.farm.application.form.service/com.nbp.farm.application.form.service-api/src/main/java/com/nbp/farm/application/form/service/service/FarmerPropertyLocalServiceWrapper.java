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
 * Provides a wrapper for {@link FarmerPropertyLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerPropertyLocalService
 * @generated
 */
public class FarmerPropertyLocalServiceWrapper
	implements FarmerPropertyLocalService,
			   ServiceWrapper<FarmerPropertyLocalService> {

	public FarmerPropertyLocalServiceWrapper() {
		this(null);
	}

	public FarmerPropertyLocalServiceWrapper(
		FarmerPropertyLocalService farmerPropertyLocalService) {

		_farmerPropertyLocalService = farmerPropertyLocalService;
	}

	/**
	 * Adds the farmer property to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerPropertyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerProperty the farmer property
	 * @return the farmer property that was added
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerProperty
		addFarmerProperty(
			com.nbp.farm.application.form.service.model.FarmerProperty
				farmerProperty) {

		return _farmerPropertyLocalService.addFarmerProperty(farmerProperty);
	}

	/**
	 * Creates a new farmer property with the primary key. Does not add the farmer property to the database.
	 *
	 * @param farmerPropertyId the primary key for the new farmer property
	 * @return the new farmer property
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerProperty
		createFarmerProperty(long farmerPropertyId) {

		return _farmerPropertyLocalService.createFarmerProperty(
			farmerPropertyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerPropertyLocalService.createPersistedModel(primaryKeyObj);
	}

	@Override
	public void deleteBy_Id(long applicationId) {
		_farmerPropertyLocalService.deleteBy_Id(applicationId);
	}

	/**
	 * Deletes the farmer property from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerPropertyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerProperty the farmer property
	 * @return the farmer property that was removed
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerProperty
		deleteFarmerProperty(
			com.nbp.farm.application.form.service.model.FarmerProperty
				farmerProperty) {

		return _farmerPropertyLocalService.deleteFarmerProperty(farmerProperty);
	}

	/**
	 * Deletes the farmer property with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerPropertyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerPropertyId the primary key of the farmer property
	 * @return the farmer property that was removed
	 * @throws PortalException if a farmer property with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerProperty
			deleteFarmerProperty(long farmerPropertyId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerPropertyLocalService.deleteFarmerProperty(
			farmerPropertyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerPropertyLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _farmerPropertyLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _farmerPropertyLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _farmerPropertyLocalService.dynamicQuery();
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

		return _farmerPropertyLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerPropertyModelImpl</code>.
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

		return _farmerPropertyLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerPropertyModelImpl</code>.
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

		return _farmerPropertyLocalService.dynamicQuery(
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

		return _farmerPropertyLocalService.dynamicQueryCount(dynamicQuery);
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

		return _farmerPropertyLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.farm.application.form.service.model.FarmerProperty
		fetchFarmerProperty(long farmerPropertyId) {

		return _farmerPropertyLocalService.fetchFarmerProperty(
			farmerPropertyId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _farmerPropertyLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.farm.application.form.service.model.FarmerProperty>
			getFA_FPR_FAI(long ApplicationId) {

		return _farmerPropertyLocalService.getFA_FPR_FAI(ApplicationId);
	}

	@Override
	public com.nbp.farm.application.form.service.model.FarmerProperty
		getFarmerById(long ApplicationId) {

		return _farmerPropertyLocalService.getFarmerById(ApplicationId);
	}

	/**
	 * Returns a range of all the farmer properties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer properties
	 * @param end the upper bound of the range of farmer properties (not inclusive)
	 * @return the range of farmer properties
	 */
	@Override
	public java.util.List
		<com.nbp.farm.application.form.service.model.FarmerProperty>
			getFarmerProperties(int start, int end) {

		return _farmerPropertyLocalService.getFarmerProperties(start, end);
	}

	/**
	 * Returns the number of farmer properties.
	 *
	 * @return the number of farmer properties
	 */
	@Override
	public int getFarmerPropertiesCount() {
		return _farmerPropertyLocalService.getFarmerPropertiesCount();
	}

	/**
	 * Returns the farmer property with the primary key.
	 *
	 * @param farmerPropertyId the primary key of the farmer property
	 * @return the farmer property
	 * @throws PortalException if a farmer property with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerProperty
			getFarmerProperty(long farmerPropertyId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerPropertyLocalService.getFarmerProperty(farmerPropertyId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _farmerPropertyLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _farmerPropertyLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerPropertyLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the farmer property in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerPropertyLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerProperty the farmer property
	 * @return the farmer property that was updated
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerProperty
		updateFarmerProperty(
			com.nbp.farm.application.form.service.model.FarmerProperty
				farmerProperty) {

		return _farmerPropertyLocalService.updateFarmerProperty(farmerProperty);
	}

	@Override
	public FarmerPropertyLocalService getWrappedService() {
		return _farmerPropertyLocalService;
	}

	@Override
	public void setWrappedService(
		FarmerPropertyLocalService farmerPropertyLocalService) {

		_farmerPropertyLocalService = farmerPropertyLocalService;
	}

	private FarmerPropertyLocalService _farmerPropertyLocalService;

}