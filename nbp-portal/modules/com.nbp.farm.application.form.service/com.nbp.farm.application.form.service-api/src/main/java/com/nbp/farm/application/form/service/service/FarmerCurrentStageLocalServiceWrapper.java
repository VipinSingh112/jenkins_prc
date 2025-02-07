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
 * Provides a wrapper for {@link FarmerCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerCurrentStageLocalService
 * @generated
 */
public class FarmerCurrentStageLocalServiceWrapper
	implements FarmerCurrentStageLocalService,
			   ServiceWrapper<FarmerCurrentStageLocalService> {

	public FarmerCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public FarmerCurrentStageLocalServiceWrapper(
		FarmerCurrentStageLocalService farmerCurrentStageLocalService) {

		_farmerCurrentStageLocalService = farmerCurrentStageLocalService;
	}

	/**
	 * Adds the farmer current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerCurrentStage the farmer current stage
	 * @return the farmer current stage that was added
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerCurrentStage
		addFarmerCurrentStage(
			com.nbp.farm.application.form.service.model.FarmerCurrentStage
				farmerCurrentStage) {

		return _farmerCurrentStageLocalService.addFarmerCurrentStage(
			farmerCurrentStage);
	}

	/**
	 * Creates a new farmer current stage with the primary key. Does not add the farmer current stage to the database.
	 *
	 * @param farmerCurrentStageId the primary key for the new farmer current stage
	 * @return the new farmer current stage
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerCurrentStage
		createFarmerCurrentStage(long farmerCurrentStageId) {

		return _farmerCurrentStageLocalService.createFarmerCurrentStage(
			farmerCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the farmer current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerCurrentStage the farmer current stage
	 * @return the farmer current stage that was removed
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerCurrentStage
		deleteFarmerCurrentStage(
			com.nbp.farm.application.form.service.model.FarmerCurrentStage
				farmerCurrentStage) {

		return _farmerCurrentStageLocalService.deleteFarmerCurrentStage(
			farmerCurrentStage);
	}

	/**
	 * Deletes the farmer current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerCurrentStageId the primary key of the farmer current stage
	 * @return the farmer current stage that was removed
	 * @throws PortalException if a farmer current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerCurrentStage
			deleteFarmerCurrentStage(long farmerCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerCurrentStageLocalService.deleteFarmerCurrentStage(
			farmerCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _farmerCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _farmerCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _farmerCurrentStageLocalService.dynamicQuery();
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

		return _farmerCurrentStageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerCurrentStageModelImpl</code>.
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

		return _farmerCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerCurrentStageModelImpl</code>.
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

		return _farmerCurrentStageLocalService.dynamicQuery(
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

		return _farmerCurrentStageLocalService.dynamicQueryCount(dynamicQuery);
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

		return _farmerCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.farm.application.form.service.model.FarmerCurrentStage
		fetchFarmerCurrentStage(long farmerCurrentStageId) {

		return _farmerCurrentStageLocalService.fetchFarmerCurrentStage(
			farmerCurrentStageId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _farmerCurrentStageLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the farmer current stage with the primary key.
	 *
	 * @param farmerCurrentStageId the primary key of the farmer current stage
	 * @return the farmer current stage
	 * @throws PortalException if a farmer current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerCurrentStage
			getFarmerCurrentStage(long farmerCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerCurrentStageLocalService.getFarmerCurrentStage(
			farmerCurrentStageId);
	}

	/**
	 * Returns a range of all the farmer current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer current stages
	 * @param end the upper bound of the range of farmer current stages (not inclusive)
	 * @return the range of farmer current stages
	 */
	@Override
	public java.util.List
		<com.nbp.farm.application.form.service.model.FarmerCurrentStage>
			getFarmerCurrentStages(int start, int end) {

		return _farmerCurrentStageLocalService.getFarmerCurrentStages(
			start, end);
	}

	/**
	 * Returns the number of farmer current stages.
	 *
	 * @return the number of farmer current stages
	 */
	@Override
	public int getFarmerCurrentStagesCount() {
		return _farmerCurrentStageLocalService.getFarmerCurrentStagesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _farmerCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _farmerCurrentStageLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerCurrentStageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the farmer current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerCurrentStage the farmer current stage
	 * @return the farmer current stage that was updated
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerCurrentStage
		updateFarmerCurrentStage(
			com.nbp.farm.application.form.service.model.FarmerCurrentStage
				farmerCurrentStage) {

		return _farmerCurrentStageLocalService.updateFarmerCurrentStage(
			farmerCurrentStage);
	}

	@Override
	public FarmerCurrentStageLocalService getWrappedService() {
		return _farmerCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		FarmerCurrentStageLocalService farmerCurrentStageLocalService) {

		_farmerCurrentStageLocalService = farmerCurrentStageLocalService;
	}

	private FarmerCurrentStageLocalService _farmerCurrentStageLocalService;

}