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

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.farm.application.stages.service.model.FarmApplicationStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FarmApplicationStages. This utility wraps
 * <code>com.nbp.farm.application.stages.service.service.impl.FarmApplicationStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FarmApplicationStagesLocalService
 * @generated
 */
public class FarmApplicationStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.farm.application.stages.service.service.impl.FarmApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static FarmApplicationStages addFarmApplicationStages(
		FarmApplicationStages farmApplicationStages) {

		return getService().addFarmApplicationStages(farmApplicationStages);
	}

	/**
	 * Creates a new farm application stages with the primary key. Does not add the farm application stages to the database.
	 *
	 * @param farmApplicationStagesId the primary key for the new farm application stages
	 * @return the new farm application stages
	 */
	public static FarmApplicationStages createFarmApplicationStages(
		long farmApplicationStagesId) {

		return getService().createFarmApplicationStages(
			farmApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
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
	public static FarmApplicationStages deleteFarmApplicationStages(
		FarmApplicationStages farmApplicationStages) {

		return getService().deleteFarmApplicationStages(farmApplicationStages);
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
	public static FarmApplicationStages deleteFarmApplicationStages(
			long farmApplicationStagesId)
		throws PortalException {

		return getService().deleteFarmApplicationStages(
			farmApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static FarmApplicationStages fetchFarmApplicationStages(
		long farmApplicationStagesId) {

		return getService().fetchFarmApplicationStages(farmApplicationStagesId);
	}

	/**
	 * Returns the farm application stages matching the UUID and group.
	 *
	 * @param uuid the farm application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages
		fetchFarmApplicationStagesByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchFarmApplicationStagesByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	/**
	 * Returns the farm application stages with the primary key.
	 *
	 * @param farmApplicationStagesId the primary key of the farm application stages
	 * @return the farm application stages
	 * @throws PortalException if a farm application stages with the primary key could not be found
	 */
	public static FarmApplicationStages getFarmApplicationStages(
			long farmApplicationStagesId)
		throws PortalException {

		return getService().getFarmApplicationStages(farmApplicationStagesId);
	}

	/**
	 * Returns the farm application stages matching the UUID and group.
	 *
	 * @param uuid the farm application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching farm application stages
	 * @throws PortalException if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages
			getFarmApplicationStagesByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getFarmApplicationStagesByUuidAndGroupId(
			uuid, groupId);
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
	public static List<FarmApplicationStages> getFarmApplicationStageses(
		int start, int end) {

		return getService().getFarmApplicationStageses(start, end);
	}

	/**
	 * Returns all the farm application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the farm application stageses
	 * @param companyId the primary key of the company
	 * @return the matching farm application stageses, or an empty list if no matches were found
	 */
	public static List<FarmApplicationStages>
		getFarmApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getFarmApplicationStagesesByUuidAndCompanyId(
			uuid, companyId);
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
	public static List<FarmApplicationStages>
		getFarmApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<FarmApplicationStages> orderByComparator) {

		return getService().getFarmApplicationStagesesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of farm application stageses.
	 *
	 * @return the number of farm application stageses
	 */
	public static int getFarmApplicationStagesesCount() {
		return getService().getFarmApplicationStagesesCount();
	}

	public static List<FarmApplicationStages> getFarmByCI(String caseId) {
		return getService().getFarmByCI(caseId);
	}

	public static FarmApplicationStages getFarmByCI_SN(
			String caseId, String stageName)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getService().getFarmByCI_SN(caseId, stageName);
	}

	public static FarmApplicationStages getFarmByCI_ST(
			String caseId, String status)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getService().getFarmByCI_ST(caseId, status);
	}

	public static FarmApplicationStages getFarmByCI_ST_SN(
			String CaseId, String stageStatus, String StageName)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getService().getFarmByCI_ST_SN(CaseId, stageStatus, StageName);
	}

	public static FarmApplicationStages getFarmByFAI(long farmApplicationId)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getService().getFarmByFAI(farmApplicationId);
	}

	public static List<FarmApplicationStages> getFarmBySN(String stageName) {
		return getService().getFarmBySN(stageName);
	}

	public static String getfarmCurrentStage(String caseId) {
		return getService().getfarmCurrentStage(caseId);
	}

	public static List<String> getFarmerDistinctStages() {
		return getService().getFarmerDistinctStages();
	}

	public static Long getFarmSeenCases() {
		return getService().getFarmSeenCases();
	}

	public static List<FarmApplicationStages> getFAS_StageName_Status(
		String stageName, String status) {

		return getService().getFAS_StageName_Status(stageName, status);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
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
	public static FarmApplicationStages updateFarmApplicationStages(
		FarmApplicationStages farmApplicationStages) {

		return getService().updateFarmApplicationStages(farmApplicationStages);
	}

	public static FarmApplicationStages updateFarmApplicationStages(
		String caseId, String stageName, java.util.Date stageStartDate,
		java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateFarmApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static FarmApplicationStagesLocalService getService() {
		return _service;
	}

	private static volatile FarmApplicationStagesLocalService _service;

}