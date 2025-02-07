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
 * Provides a wrapper for {@link FarmApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FarmApplicationStagesLocalService
 * @generated
 */
public class FarmApplicationStagesLocalServiceWrapper
	implements FarmApplicationStagesLocalService,
			   ServiceWrapper<FarmApplicationStagesLocalService> {

	public FarmApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public FarmApplicationStagesLocalServiceWrapper(
		FarmApplicationStagesLocalService farmApplicationStagesLocalService) {

		_farmApplicationStagesLocalService = farmApplicationStagesLocalService;
	}

	/**
	 * Adds the farm application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmApplicationStages the farm application stages
	 * @return the farm application stages that was added
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmApplicationStages
		addFarmApplicationStages(
			com.nbp.farm.application.stages.service.model.FarmApplicationStages
				farmApplicationStages) {

		return _farmApplicationStagesLocalService.addFarmApplicationStages(
			farmApplicationStages);
	}

	/**
	 * Creates a new farm application stages with the primary key. Does not add the farm application stages to the database.
	 *
	 * @param farmApplicationStagesId the primary key for the new farm application stages
	 * @return the new farm application stages
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmApplicationStages
		createFarmApplicationStages(long farmApplicationStagesId) {

		return _farmApplicationStagesLocalService.createFarmApplicationStages(
			farmApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the farm application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmApplicationStages the farm application stages
	 * @return the farm application stages that was removed
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmApplicationStages
		deleteFarmApplicationStages(
			com.nbp.farm.application.stages.service.model.FarmApplicationStages
				farmApplicationStages) {

		return _farmApplicationStagesLocalService.deleteFarmApplicationStages(
			farmApplicationStages);
	}

	/**
	 * Deletes the farm application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmApplicationStagesId the primary key of the farm application stages
	 * @return the farm application stages that was removed
	 * @throws PortalException if a farm application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmApplicationStages
			deleteFarmApplicationStages(long farmApplicationStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmApplicationStagesLocalService.deleteFarmApplicationStages(
			farmApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _farmApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _farmApplicationStagesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _farmApplicationStagesLocalService.dynamicQuery();
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

		return _farmApplicationStagesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.stages.service.model.impl.FarmApplicationStagesModelImpl</code>.
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

		return _farmApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.stages.service.model.impl.FarmApplicationStagesModelImpl</code>.
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

		return _farmApplicationStagesLocalService.dynamicQuery(
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

		return _farmApplicationStagesLocalService.dynamicQueryCount(
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

		return _farmApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.farm.application.stages.service.model.FarmApplicationStages
		fetchFarmApplicationStages(long farmApplicationStagesId) {

		return _farmApplicationStagesLocalService.fetchFarmApplicationStages(
			farmApplicationStagesId);
	}

	/**
	 * Returns the farm application stages matching the UUID and group.
	 *
	 * @param uuid the farm application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmApplicationStages
		fetchFarmApplicationStagesByUuidAndGroupId(String uuid, long groupId) {

		return _farmApplicationStagesLocalService.
			fetchFarmApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _farmApplicationStagesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _farmApplicationStagesLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	/**
	 * Returns the farm application stages with the primary key.
	 *
	 * @param farmApplicationStagesId the primary key of the farm application stages
	 * @return the farm application stages
	 * @throws PortalException if a farm application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmApplicationStages
			getFarmApplicationStages(long farmApplicationStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmApplicationStagesLocalService.getFarmApplicationStages(
			farmApplicationStagesId);
	}

	/**
	 * Returns the farm application stages matching the UUID and group.
	 *
	 * @param uuid the farm application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching farm application stages
	 * @throws PortalException if a matching farm application stages could not be found
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmApplicationStages
			getFarmApplicationStagesByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmApplicationStagesLocalService.
			getFarmApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the farm application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.stages.service.model.impl.FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @return the range of farm application stageses
	 */
	@Override
	public java.util.List
		<com.nbp.farm.application.stages.service.model.FarmApplicationStages>
			getFarmApplicationStageses(int start, int end) {

		return _farmApplicationStagesLocalService.getFarmApplicationStageses(
			start, end);
	}

	/**
	 * Returns all the farm application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the farm application stageses
	 * @param companyId the primary key of the company
	 * @return the matching farm application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.farm.application.stages.service.model.FarmApplicationStages>
			getFarmApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _farmApplicationStagesLocalService.
			getFarmApplicationStagesesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of farm application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the farm application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching farm application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.farm.application.stages.service.model.FarmApplicationStages>
			getFarmApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.farm.application.stages.service.model.
						FarmApplicationStages> orderByComparator) {

		return _farmApplicationStagesLocalService.
			getFarmApplicationStagesesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of farm application stageses.
	 *
	 * @return the number of farm application stageses
	 */
	@Override
	public int getFarmApplicationStagesesCount() {
		return _farmApplicationStagesLocalService.
			getFarmApplicationStagesesCount();
	}

	@Override
	public java.util.List
		<com.nbp.farm.application.stages.service.model.FarmApplicationStages>
			getFarmByCI(String caseId) {

		return _farmApplicationStagesLocalService.getFarmByCI(caseId);
	}

	@Override
	public com.nbp.farm.application.stages.service.model.FarmApplicationStages
			getFarmByCI_SN(String caseId, String stageName)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return _farmApplicationStagesLocalService.getFarmByCI_SN(
			caseId, stageName);
	}

	@Override
	public com.nbp.farm.application.stages.service.model.FarmApplicationStages
			getFarmByCI_ST(String caseId, String status)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return _farmApplicationStagesLocalService.getFarmByCI_ST(
			caseId, status);
	}

	@Override
	public com.nbp.farm.application.stages.service.model.FarmApplicationStages
			getFarmByCI_ST_SN(
				String CaseId, String stageStatus, String StageName)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return _farmApplicationStagesLocalService.getFarmByCI_ST_SN(
			CaseId, stageStatus, StageName);
	}

	@Override
	public com.nbp.farm.application.stages.service.model.FarmApplicationStages
			getFarmByFAI(long farmApplicationId)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return _farmApplicationStagesLocalService.getFarmByFAI(
			farmApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.farm.application.stages.service.model.FarmApplicationStages>
			getFarmBySN(String stageName) {

		return _farmApplicationStagesLocalService.getFarmBySN(stageName);
	}

	@Override
	public String getfarmCurrentStage(String caseId) {
		return _farmApplicationStagesLocalService.getfarmCurrentStage(caseId);
	}

	@Override
	public java.util.List<String> getFarmerDistinctStages() {
		return _farmApplicationStagesLocalService.getFarmerDistinctStages();
	}

	@Override
	public Long getFarmSeenCases() {
		return _farmApplicationStagesLocalService.getFarmSeenCases();
	}

	@Override
	public java.util.List
		<com.nbp.farm.application.stages.service.model.FarmApplicationStages>
			getFAS_StageName_Status(String stageName, String status) {

		return _farmApplicationStagesLocalService.getFAS_StageName_Status(
			stageName, status);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _farmApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _farmApplicationStagesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the farm application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmApplicationStages the farm application stages
	 * @return the farm application stages that was updated
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmApplicationStages
		updateFarmApplicationStages(
			com.nbp.farm.application.stages.service.model.FarmApplicationStages
				farmApplicationStages) {

		return _farmApplicationStagesLocalService.updateFarmApplicationStages(
			farmApplicationStages);
	}

	@Override
	public com.nbp.farm.application.stages.service.model.FarmApplicationStages
		updateFarmApplicationStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return _farmApplicationStagesLocalService.updateFarmApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	@Override
	public FarmApplicationStagesLocalService getWrappedService() {
		return _farmApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		FarmApplicationStagesLocalService farmApplicationStagesLocalService) {

		_farmApplicationStagesLocalService = farmApplicationStagesLocalService;
	}

	private FarmApplicationStagesLocalService
		_farmApplicationStagesLocalService;

}