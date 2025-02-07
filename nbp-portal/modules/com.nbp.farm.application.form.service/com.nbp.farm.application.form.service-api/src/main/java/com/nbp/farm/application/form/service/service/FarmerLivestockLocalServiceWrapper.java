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
 * Provides a wrapper for {@link FarmerLivestockLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerLivestockLocalService
 * @generated
 */
public class FarmerLivestockLocalServiceWrapper
	implements FarmerLivestockLocalService,
			   ServiceWrapper<FarmerLivestockLocalService> {

	public FarmerLivestockLocalServiceWrapper() {
		this(null);
	}

	public FarmerLivestockLocalServiceWrapper(
		FarmerLivestockLocalService farmerLivestockLocalService) {

		_farmerLivestockLocalService = farmerLivestockLocalService;
	}

	/**
	 * Adds the farmer livestock to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerLivestockLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerLivestock the farmer livestock
	 * @return the farmer livestock that was added
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerLivestock
		addFarmerLivestock(
			com.nbp.farm.application.form.service.model.FarmerLivestock
				farmerLivestock) {

		return _farmerLivestockLocalService.addFarmerLivestock(farmerLivestock);
	}

	/**
	 * Creates a new farmer livestock with the primary key. Does not add the farmer livestock to the database.
	 *
	 * @param farmerLiveStockId the primary key for the new farmer livestock
	 * @return the new farmer livestock
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerLivestock
		createFarmerLivestock(long farmerLiveStockId) {

		return _farmerLivestockLocalService.createFarmerLivestock(
			farmerLiveStockId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerLivestockLocalService.createPersistedModel(primaryKeyObj);
	}

	@Override
	public void delete_BY_ID(long applicationId) {
		_farmerLivestockLocalService.delete_BY_ID(applicationId);
	}

	/**
	 * Deletes the farmer livestock from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerLivestockLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerLivestock the farmer livestock
	 * @return the farmer livestock that was removed
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerLivestock
		deleteFarmerLivestock(
			com.nbp.farm.application.form.service.model.FarmerLivestock
				farmerLivestock) {

		return _farmerLivestockLocalService.deleteFarmerLivestock(
			farmerLivestock);
	}

	/**
	 * Deletes the farmer livestock with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerLivestockLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerLiveStockId the primary key of the farmer livestock
	 * @return the farmer livestock that was removed
	 * @throws PortalException if a farmer livestock with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerLivestock
			deleteFarmerLivestock(long farmerLiveStockId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerLivestockLocalService.deleteFarmerLivestock(
			farmerLiveStockId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerLivestockLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _farmerLivestockLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _farmerLivestockLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _farmerLivestockLocalService.dynamicQuery();
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

		return _farmerLivestockLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerLivestockModelImpl</code>.
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

		return _farmerLivestockLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerLivestockModelImpl</code>.
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

		return _farmerLivestockLocalService.dynamicQuery(
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

		return _farmerLivestockLocalService.dynamicQueryCount(dynamicQuery);
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

		return _farmerLivestockLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.farm.application.form.service.model.FarmerLivestock
		fetchFarmerLivestock(long farmerLiveStockId) {

		return _farmerLivestockLocalService.fetchFarmerLivestock(
			farmerLiveStockId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _farmerLivestockLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.farm.application.form.service.model.FarmerLivestock>
			getFA_FLS_FAI(long ApplicationId) {

		return _farmerLivestockLocalService.getFA_FLS_FAI(ApplicationId);
	}

	@Override
	public com.nbp.farm.application.form.service.model.FarmerLivestock
		getFarmerById(long ApplicationId) {

		return _farmerLivestockLocalService.getFarmerById(ApplicationId);
	}

	/**
	 * Returns the farmer livestock with the primary key.
	 *
	 * @param farmerLiveStockId the primary key of the farmer livestock
	 * @return the farmer livestock
	 * @throws PortalException if a farmer livestock with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerLivestock
			getFarmerLivestock(long farmerLiveStockId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerLivestockLocalService.getFarmerLivestock(
			farmerLiveStockId);
	}

	/**
	 * Returns a range of all the farmer livestocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer livestocks
	 * @param end the upper bound of the range of farmer livestocks (not inclusive)
	 * @return the range of farmer livestocks
	 */
	@Override
	public java.util.List
		<com.nbp.farm.application.form.service.model.FarmerLivestock>
			getFarmerLivestocks(int start, int end) {

		return _farmerLivestockLocalService.getFarmerLivestocks(start, end);
	}

	/**
	 * Returns the number of farmer livestocks.
	 *
	 * @return the number of farmer livestocks
	 */
	@Override
	public int getFarmerLivestocksCount() {
		return _farmerLivestockLocalService.getFarmerLivestocksCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _farmerLivestockLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _farmerLivestockLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerLivestockLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the farmer livestock in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerLivestockLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerLivestock the farmer livestock
	 * @return the farmer livestock that was updated
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerLivestock
		updateFarmerLivestock(
			com.nbp.farm.application.form.service.model.FarmerLivestock
				farmerLivestock) {

		return _farmerLivestockLocalService.updateFarmerLivestock(
			farmerLivestock);
	}

	@Override
	public FarmerLivestockLocalService getWrappedService() {
		return _farmerLivestockLocalService;
	}

	@Override
	public void setWrappedService(
		FarmerLivestockLocalService farmerLivestockLocalService) {

		_farmerLivestockLocalService = farmerLivestockLocalService;
	}

	private FarmerLivestockLocalService _farmerLivestockLocalService;

}