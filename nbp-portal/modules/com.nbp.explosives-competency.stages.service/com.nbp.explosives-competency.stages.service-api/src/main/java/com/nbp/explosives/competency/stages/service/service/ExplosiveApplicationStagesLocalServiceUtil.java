/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.explosives.competency.stages.service.model.ExplosiveApplicationStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ExplosiveApplicationStages. This utility wraps
 * <code>com.nbp.explosives.competency.stages.service.service.impl.ExplosiveApplicationStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveApplicationStagesLocalService
 * @generated
 */
public class ExplosiveApplicationStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.explosives.competency.stages.service.service.impl.ExplosiveApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the explosive application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveApplicationStages the explosive application stages
	 * @return the explosive application stages that was added
	 */
	public static ExplosiveApplicationStages addExplosiveApplicationStages(
		ExplosiveApplicationStages explosiveApplicationStages) {

		return getService().addExplosiveApplicationStages(
			explosiveApplicationStages);
	}

	/**
	 * Creates a new explosive application stages with the primary key. Does not add the explosive application stages to the database.
	 *
	 * @param expApplicationStagesId the primary key for the new explosive application stages
	 * @return the new explosive application stages
	 */
	public static ExplosiveApplicationStages createExplosiveApplicationStages(
		long expApplicationStagesId) {

		return getService().createExplosiveApplicationStages(
			expApplicationStagesId);
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
	 * Deletes the explosive application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveApplicationStages the explosive application stages
	 * @return the explosive application stages that was removed
	 */
	public static ExplosiveApplicationStages deleteExplosiveApplicationStages(
		ExplosiveApplicationStages explosiveApplicationStages) {

		return getService().deleteExplosiveApplicationStages(
			explosiveApplicationStages);
	}

	/**
	 * Deletes the explosive application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param expApplicationStagesId the primary key of the explosive application stages
	 * @return the explosive application stages that was removed
	 * @throws PortalException if a explosive application stages with the primary key could not be found
	 */
	public static ExplosiveApplicationStages deleteExplosiveApplicationStages(
			long expApplicationStagesId)
		throws PortalException {

		return getService().deleteExplosiveApplicationStages(
			expApplicationStagesId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveApplicationStagesModelImpl</code>.
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

	public static ExplosiveApplicationStages fetchExplosiveApplicationStages(
		long expApplicationStagesId) {

		return getService().fetchExplosiveApplicationStages(
			expApplicationStagesId);
	}

	/**
	 * Returns the explosive application stages matching the UUID and group.
	 *
	 * @param uuid the explosive application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages
		fetchExplosiveApplicationStagesByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchExplosiveApplicationStagesByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<ExplosiveApplicationStages> getCAS_BY_SN(
		String stageName) {

		return getService().getCAS_BY_SN(stageName);
	}

	public static List<ExplosiveApplicationStages> getCAS_CaseId(
		String caseId) {

		return getService().getCAS_CaseId(caseId);
	}

	public static List<ExplosiveApplicationStages> getCAS_SNAndSS(
		String stageName, String status) {

		return getService().getCAS_SNAndSS(stageName, status);
	}

	public static String getCretiveCurrentStages(String caseId) {
		return getService().getCretiveCurrentStages(caseId);
	}

	public static ExplosiveApplicationStages getEXP_By_CaseId(String caseId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getService().getEXP_By_CaseId(caseId);
	}

	public static List<ExplosiveApplicationStages> getEXP_BY_SN(
		String stageName) {

		return getService().getEXP_BY_SN(stageName);
	}

	public static ExplosiveApplicationStages getEXP_CAI(long expApplicationId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getService().getEXP_CAI(expApplicationId);
	}

	public static List<ExplosiveApplicationStages> getEXP_CaseId(
		String caseId) {

		return getService().getEXP_CaseId(caseId);
	}

	public static ExplosiveApplicationStages getEXP_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getService().getEXP_CaseIdAndStatus(caseId, stageStatus);
	}

	public static ExplosiveApplicationStages getEXP_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getService().getEXP_CaseIdStageName(caseId, stageName);
	}

	public static ExplosiveApplicationStages getEXP_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getService().getEXP_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	public static List<ExplosiveApplicationStages> getEXP_SNAndSS(
		String stageName, String status) {

		return getService().getEXP_SNAndSS(stageName, status);
	}

	public static List<String> getExplosiceDistinctStages() {
		return getService().getExplosiceDistinctStages();
	}

	/**
	 * Returns the explosive application stages with the primary key.
	 *
	 * @param expApplicationStagesId the primary key of the explosive application stages
	 * @return the explosive application stages
	 * @throws PortalException if a explosive application stages with the primary key could not be found
	 */
	public static ExplosiveApplicationStages getExplosiveApplicationStages(
			long expApplicationStagesId)
		throws PortalException {

		return getService().getExplosiveApplicationStages(
			expApplicationStagesId);
	}

	/**
	 * Returns the explosive application stages matching the UUID and group.
	 *
	 * @param uuid the explosive application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosive application stages
	 * @throws PortalException if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages
			getExplosiveApplicationStagesByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getExplosiveApplicationStagesByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the explosive application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @return the range of explosive application stageses
	 */
	public static List<ExplosiveApplicationStages>
		getExplosiveApplicationStageses(int start, int end) {

		return getService().getExplosiveApplicationStageses(start, end);
	}

	/**
	 * Returns all the explosive application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosive application stageses
	 * @param companyId the primary key of the company
	 * @return the matching explosive application stageses, or an empty list if no matches were found
	 */
	public static List<ExplosiveApplicationStages>
		getExplosiveApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getExplosiveApplicationStagesesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of explosive application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosive application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching explosive application stageses, or an empty list if no matches were found
	 */
	public static List<ExplosiveApplicationStages>
		getExplosiveApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return getService().getExplosiveApplicationStagesesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of explosive application stageses.
	 *
	 * @return the number of explosive application stageses
	 */
	public static int getExplosiveApplicationStagesesCount() {
		return getService().getExplosiveApplicationStagesesCount();
	}

	public static String getExplosiveCurrentStages(String caseId) {
		return getService().getExplosiveCurrentStages(caseId);
	}

	public static Long getExplosiveSeenCases() {
		return getService().getExplosiveSeenCases();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
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
	 * Updates the explosive application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveApplicationStages the explosive application stages
	 * @return the explosive application stages that was updated
	 */
	public static ExplosiveApplicationStages updateExplosiveApplicationStages(
		ExplosiveApplicationStages explosiveApplicationStages) {

		return getService().updateExplosiveApplicationStages(
			explosiveApplicationStages);
	}

	public static ExplosiveApplicationStages updateExplosiveApplicationStages(
		String caseId, String stageName, java.util.Date stageStartDate,
		java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateExplosiveApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static ExplosiveApplicationStagesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ExplosiveApplicationStagesLocalService>
		_serviceSnapshot = new Snapshot<>(
			ExplosiveApplicationStagesLocalServiceUtil.class,
			ExplosiveApplicationStagesLocalService.class);

}