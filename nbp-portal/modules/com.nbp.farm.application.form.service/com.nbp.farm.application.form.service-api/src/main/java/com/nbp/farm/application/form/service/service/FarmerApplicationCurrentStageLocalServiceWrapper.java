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
 * Provides a wrapper for {@link FarmerApplicationCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerApplicationCurrentStageLocalService
 * @generated
 */
public class FarmerApplicationCurrentStageLocalServiceWrapper
	implements FarmerApplicationCurrentStageLocalService,
			   ServiceWrapper<FarmerApplicationCurrentStageLocalService> {

	public FarmerApplicationCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public FarmerApplicationCurrentStageLocalServiceWrapper(
		FarmerApplicationCurrentStageLocalService
			farmerApplicationCurrentStageLocalService) {

		_farmerApplicationCurrentStageLocalService =
			farmerApplicationCurrentStageLocalService;
	}

	/**
	 * Adds the farmer application current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerApplicationCurrentStage the farmer application current stage
	 * @return the farmer application current stage that was added
	 */
	@Override
	public
		com.nbp.farm.application.form.service.model.
			FarmerApplicationCurrentStage addFarmerApplicationCurrentStage(
				com.nbp.farm.application.form.service.model.
					FarmerApplicationCurrentStage
						farmerApplicationCurrentStage) {

		return _farmerApplicationCurrentStageLocalService.
			addFarmerApplicationCurrentStage(farmerApplicationCurrentStage);
	}

	/**
	 * Creates a new farmer application current stage with the primary key. Does not add the farmer application current stage to the database.
	 *
	 * @param farmerCurrentStageId the primary key for the new farmer application current stage
	 * @return the new farmer application current stage
	 */
	@Override
	public
		com.nbp.farm.application.form.service.model.
			FarmerApplicationCurrentStage createFarmerApplicationCurrentStage(
				long farmerCurrentStageId) {

		return _farmerApplicationCurrentStageLocalService.
			createFarmerApplicationCurrentStage(farmerCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerApplicationCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the farmer application current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerApplicationCurrentStage the farmer application current stage
	 * @return the farmer application current stage that was removed
	 */
	@Override
	public
		com.nbp.farm.application.form.service.model.
			FarmerApplicationCurrentStage deleteFarmerApplicationCurrentStage(
				com.nbp.farm.application.form.service.model.
					FarmerApplicationCurrentStage
						farmerApplicationCurrentStage) {

		return _farmerApplicationCurrentStageLocalService.
			deleteFarmerApplicationCurrentStage(farmerApplicationCurrentStage);
	}

	/**
	 * Deletes the farmer application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerCurrentStageId the primary key of the farmer application current stage
	 * @return the farmer application current stage that was removed
	 * @throws PortalException if a farmer application current stage with the primary key could not be found
	 */
	@Override
	public
		com.nbp.farm.application.form.service.model.
			FarmerApplicationCurrentStage deleteFarmerApplicationCurrentStage(
					long farmerCurrentStageId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerApplicationCurrentStageLocalService.
			deleteFarmerApplicationCurrentStage(farmerCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerApplicationCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _farmerApplicationCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _farmerApplicationCurrentStageLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _farmerApplicationCurrentStageLocalService.dynamicQuery();
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

		return _farmerApplicationCurrentStageLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerApplicationCurrentStageModelImpl</code>.
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

		return _farmerApplicationCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerApplicationCurrentStageModelImpl</code>.
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

		return _farmerApplicationCurrentStageLocalService.dynamicQuery(
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

		return _farmerApplicationCurrentStageLocalService.dynamicQueryCount(
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

		return _farmerApplicationCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.farm.application.form.service.model.
			FarmerApplicationCurrentStage fetchFarmerApplicationCurrentStage(
				long farmerCurrentStageId) {

		return _farmerApplicationCurrentStageLocalService.
			fetchFarmerApplicationCurrentStage(farmerCurrentStageId);
	}

	/**
	 * Returns the farmer application current stage matching the UUID and group.
	 *
	 * @param uuid the farmer application current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	@Override
	public
		com.nbp.farm.application.form.service.model.
			FarmerApplicationCurrentStage
				fetchFarmerApplicationCurrentStageByUuidAndGroupId(
					String uuid, long groupId) {

		return _farmerApplicationCurrentStageLocalService.
			fetchFarmerApplicationCurrentStageByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _farmerApplicationCurrentStageLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _farmerApplicationCurrentStageLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	/**
	 * Returns the farmer application current stage with the primary key.
	 *
	 * @param farmerCurrentStageId the primary key of the farmer application current stage
	 * @return the farmer application current stage
	 * @throws PortalException if a farmer application current stage with the primary key could not be found
	 */
	@Override
	public
		com.nbp.farm.application.form.service.model.
			FarmerApplicationCurrentStage getFarmerApplicationCurrentStage(
					long farmerCurrentStageId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerApplicationCurrentStageLocalService.
			getFarmerApplicationCurrentStage(farmerCurrentStageId);
	}

	/**
	 * Returns the farmer application current stage matching the UUID and group.
	 *
	 * @param uuid the farmer application current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching farmer application current stage
	 * @throws PortalException if a matching farmer application current stage could not be found
	 */
	@Override
	public
		com.nbp.farm.application.form.service.model.
			FarmerApplicationCurrentStage
					getFarmerApplicationCurrentStageByUuidAndGroupId(
						String uuid, long groupId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerApplicationCurrentStageLocalService.
			getFarmerApplicationCurrentStageByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the farmer application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer application current stages
	 * @param end the upper bound of the range of farmer application current stages (not inclusive)
	 * @return the range of farmer application current stages
	 */
	@Override
	public java.util.List
		<com.nbp.farm.application.form.service.model.
			FarmerApplicationCurrentStage> getFarmerApplicationCurrentStages(
				int start, int end) {

		return _farmerApplicationCurrentStageLocalService.
			getFarmerApplicationCurrentStages(start, end);
	}

	/**
	 * Returns all the farmer application current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the farmer application current stages
	 * @param companyId the primary key of the company
	 * @return the matching farmer application current stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.farm.application.form.service.model.
			FarmerApplicationCurrentStage>
				getFarmerApplicationCurrentStagesByUuidAndCompanyId(
					String uuid, long companyId) {

		return _farmerApplicationCurrentStageLocalService.
			getFarmerApplicationCurrentStagesByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of farmer application current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the farmer application current stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of farmer application current stages
	 * @param end the upper bound of the range of farmer application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching farmer application current stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.farm.application.form.service.model.
			FarmerApplicationCurrentStage>
				getFarmerApplicationCurrentStagesByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.farm.application.form.service.model.
							FarmerApplicationCurrentStage> orderByComparator) {

		return _farmerApplicationCurrentStageLocalService.
			getFarmerApplicationCurrentStagesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of farmer application current stages.
	 *
	 * @return the number of farmer application current stages
	 */
	@Override
	public int getFarmerApplicationCurrentStagesCount() {
		return _farmerApplicationCurrentStageLocalService.
			getFarmerApplicationCurrentStagesCount();
	}

	@Override
	public
		com.nbp.farm.application.form.service.model.
			FarmerApplicationCurrentStage getfarmerById(
				long farmerApplicationId) {

		return _farmerApplicationCurrentStageLocalService.getfarmerById(
			farmerApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _farmerApplicationCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _farmerApplicationCurrentStageLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerApplicationCurrentStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the farmer application current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerApplicationCurrentStage the farmer application current stage
	 * @return the farmer application current stage that was updated
	 */
	@Override
	public
		com.nbp.farm.application.form.service.model.
			FarmerApplicationCurrentStage updateFarmerApplicationCurrentStage(
				com.nbp.farm.application.form.service.model.
					FarmerApplicationCurrentStage
						farmerApplicationCurrentStage) {

		return _farmerApplicationCurrentStageLocalService.
			updateFarmerApplicationCurrentStage(farmerApplicationCurrentStage);
	}

	@Override
	public FarmerApplicationCurrentStageLocalService getWrappedService() {
		return _farmerApplicationCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		FarmerApplicationCurrentStageLocalService
			farmerApplicationCurrentStageLocalService) {

		_farmerApplicationCurrentStageLocalService =
			farmerApplicationCurrentStageLocalService;
	}

	private FarmerApplicationCurrentStageLocalService
		_farmerApplicationCurrentStageLocalService;

}