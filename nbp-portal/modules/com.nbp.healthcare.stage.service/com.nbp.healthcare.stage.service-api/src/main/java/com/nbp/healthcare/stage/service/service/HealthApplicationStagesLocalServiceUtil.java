/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.healthcare.stage.service.model.HealthApplicationStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for HealthApplicationStages. This utility wraps
 * <code>com.nbp.healthcare.stage.service.service.impl.HealthApplicationStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see HealthApplicationStagesLocalService
 * @generated
 */
public class HealthApplicationStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.healthcare.stage.service.service.impl.HealthApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the health application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthApplicationStages the health application stages
	 * @return the health application stages that was added
	 */
	public static HealthApplicationStages addHealthApplicationStages(
		HealthApplicationStages healthApplicationStages) {

		return getService().addHealthApplicationStages(healthApplicationStages);
	}

	/**
	 * Creates a new health application stages with the primary key. Does not add the health application stages to the database.
	 *
	 * @param healthApplicationStagesId the primary key for the new health application stages
	 * @return the new health application stages
	 */
	public static HealthApplicationStages createHealthApplicationStages(
		long healthApplicationStagesId) {

		return getService().createHealthApplicationStages(
			healthApplicationStagesId);
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
	 * Deletes the health application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthApplicationStages the health application stages
	 * @return the health application stages that was removed
	 */
	public static HealthApplicationStages deleteHealthApplicationStages(
		HealthApplicationStages healthApplicationStages) {

		return getService().deleteHealthApplicationStages(
			healthApplicationStages);
	}

	/**
	 * Deletes the health application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthApplicationStagesId the primary key of the health application stages
	 * @return the health application stages that was removed
	 * @throws PortalException if a health application stages with the primary key could not be found
	 */
	public static HealthApplicationStages deleteHealthApplicationStages(
			long healthApplicationStagesId)
		throws PortalException {

		return getService().deleteHealthApplicationStages(
			healthApplicationStagesId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthApplicationStagesModelImpl</code>.
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

	public static HealthApplicationStages fetchHealthApplicationStages(
		long healthApplicationStagesId) {

		return getService().fetchHealthApplicationStages(
			healthApplicationStagesId);
	}

	/**
	 * Returns the health application stages matching the UUID and group.
	 *
	 * @param uuid the health application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public static HealthApplicationStages
		fetchHealthApplicationStagesByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchHealthApplicationStagesByUuidAndGroupId(
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
	 * Returns the health application stages with the primary key.
	 *
	 * @param healthApplicationStagesId the primary key of the health application stages
	 * @return the health application stages
	 * @throws PortalException if a health application stages with the primary key could not be found
	 */
	public static HealthApplicationStages getHealthApplicationStages(
			long healthApplicationStagesId)
		throws PortalException {

		return getService().getHealthApplicationStages(
			healthApplicationStagesId);
	}

	/**
	 * Returns the health application stages matching the UUID and group.
	 *
	 * @param uuid the health application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching health application stages
	 * @throws PortalException if a matching health application stages could not be found
	 */
	public static HealthApplicationStages
			getHealthApplicationStagesByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getHealthApplicationStagesByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the health application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @return the range of health application stageses
	 */
	public static List<HealthApplicationStages> getHealthApplicationStageses(
		int start, int end) {

		return getService().getHealthApplicationStageses(start, end);
	}

	/**
	 * Returns all the health application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the health application stageses
	 * @param companyId the primary key of the company
	 * @return the matching health application stageses, or an empty list if no matches were found
	 */
	public static List<HealthApplicationStages>
		getHealthApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getHealthApplicationStagesesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of health application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the health application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching health application stageses, or an empty list if no matches were found
	 */
	public static List<HealthApplicationStages>
		getHealthApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<HealthApplicationStages> orderByComparator) {

		return getService().getHealthApplicationStagesesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of health application stageses.
	 *
	 * @return the number of health application stageses
	 */
	public static int getHealthApplicationStagesesCount() {
		return getService().getHealthApplicationStagesesCount();
	}

	public static List<HealthApplicationStages> getHealthCareBy_SN(
		String stageName) {

		return getService().getHealthCareBy_SN(stageName);
	}

	public static List<HealthApplicationStages> getHealthCareBy_SN_SS(
		String stageName, String status) {

		return getService().getHealthCareBy_SN_SS(stageName, status);
	}

	public static List<String> getHealthCareDistinctStages() {
		return getService().getHealthCareDistinctStages();
	}

	public static List<HealthApplicationStages> getHealthcareStageBy_CI(
		String caseId) {

		return getService().getHealthcareStageBy_CI(caseId);
	}

	public static HealthApplicationStages getHealthcareStageBy_CI_SN(
			String caseId, String stageName)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getService().getHealthcareStageBy_CI_SN(caseId, stageName);
	}

	public static HealthApplicationStages getHealthcareStageBy_CI_SN_ST(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getService().getHealthcareStageBy_CI_SN_ST(
			caseId, stageName, stageStatus);
	}

	public static HealthApplicationStages getHealthcareStageBy_CI_ST(
			String caseId, String stageStatus)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getService().getHealthcareStageBy_CI_ST(caseId, stageStatus);
	}

	public static HealthApplicationStages getHealthcareStageBy_HAI(
			long healthApplicationId)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getService().getHealthcareStageBy_HAI(healthApplicationId);
	}

	public static String getHealthCurrentStages(String caseId) {
		return getService().getHealthCurrentStages(caseId);
	}

	public static Long getHealthSeenCases() {
		return getService().getHealthSeenCases();
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
	 * Updates the health application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthApplicationStages the health application stages
	 * @return the health application stages that was updated
	 */
	public static HealthApplicationStages updateHealthApplicationStages(
		HealthApplicationStages healthApplicationStages) {

		return getService().updateHealthApplicationStages(
			healthApplicationStages);
	}

	public static HealthApplicationStages updateHealthApplicationStages(
		String caseId, String stageName, java.util.Date stageStartDate,
		java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateHealthApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static HealthApplicationStagesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<HealthApplicationStagesLocalService>
		_serviceSnapshot = new Snapshot<>(
			HealthApplicationStagesLocalServiceUtil.class,
			HealthApplicationStagesLocalService.class);

}