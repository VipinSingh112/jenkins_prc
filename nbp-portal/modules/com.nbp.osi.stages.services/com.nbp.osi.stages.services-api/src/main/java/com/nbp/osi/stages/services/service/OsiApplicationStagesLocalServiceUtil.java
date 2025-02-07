/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.stages.services.model.OsiApplicationStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiApplicationStages. This utility wraps
 * <code>com.nbp.osi.stages.services.service.impl.OsiApplicationStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiApplicationStagesLocalService
 * @generated
 */
public class OsiApplicationStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.stages.services.service.impl.OsiApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiApplicationStages the osi application stages
	 * @return the osi application stages that was added
	 */
	public static OsiApplicationStages addOsiApplicationStages(
		OsiApplicationStages osiApplicationStages) {

		return getService().addOsiApplicationStages(osiApplicationStages);
	}

	/**
	 * Creates a new osi application stages with the primary key. Does not add the osi application stages to the database.
	 *
	 * @param OsiApplicationStagesId the primary key for the new osi application stages
	 * @return the new osi application stages
	 */
	public static OsiApplicationStages createOsiApplicationStages(
		long OsiApplicationStagesId) {

		return getService().createOsiApplicationStages(OsiApplicationStagesId);
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
	 * Deletes the osi application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param OsiApplicationStagesId the primary key of the osi application stages
	 * @return the osi application stages that was removed
	 * @throws PortalException if a osi application stages with the primary key could not be found
	 */
	public static OsiApplicationStages deleteOsiApplicationStages(
			long OsiApplicationStagesId)
		throws PortalException {

		return getService().deleteOsiApplicationStages(OsiApplicationStagesId);
	}

	/**
	 * Deletes the osi application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiApplicationStages the osi application stages
	 * @return the osi application stages that was removed
	 */
	public static OsiApplicationStages deleteOsiApplicationStages(
		OsiApplicationStages osiApplicationStages) {

		return getService().deleteOsiApplicationStages(osiApplicationStages);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.stages.services.model.impl.OsiApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.stages.services.model.impl.OsiApplicationStagesModelImpl</code>.
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

	public static OsiApplicationStages fetchOsiApplicationStages(
		long OsiApplicationStagesId) {

		return getService().fetchOsiApplicationStages(OsiApplicationStagesId);
	}

	/**
	 * Returns the osi application stages matching the UUID and group.
	 *
	 * @param uuid the osi application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages
		fetchOsiApplicationStagesByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchOsiApplicationStagesByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static OsiApplicationStages getCAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getService().getCAS_CaseIdStageName(caseId, stageName);
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

	public static List<OsiApplicationStages> getOAS_CaseId(String caseId) {
		return getService().getOAS_CaseId(caseId);
	}

	public static OsiApplicationStages getOAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getService().getOAS_CaseIdAndStatus(caseId, stageStatus);
	}

	public static OsiApplicationStages getOAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getService().getOAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	public static OsiApplicationStages getOAS_OAI(long osiApplicationId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getService().getOAS_OAI(osiApplicationId);
	}

	public static List<OsiApplicationStages> getOAS_StageName(
		String stageName) {

		return getService().getOAS_StageName(stageName);
	}

	public static List<OsiApplicationStages> getOAS_StageNamendStageStatus(
		String caseId, String status) {

		return getService().getOAS_StageNamendStageStatus(caseId, status);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static String getOsiApplicaitonCurrentStages(String caseId) {
		return getService().getOsiApplicaitonCurrentStages(caseId);
	}

	/**
	 * Returns the osi application stages with the primary key.
	 *
	 * @param OsiApplicationStagesId the primary key of the osi application stages
	 * @return the osi application stages
	 * @throws PortalException if a osi application stages with the primary key could not be found
	 */
	public static OsiApplicationStages getOsiApplicationStages(
			long OsiApplicationStagesId)
		throws PortalException {

		return getService().getOsiApplicationStages(OsiApplicationStagesId);
	}

	/**
	 * Returns the osi application stages matching the UUID and group.
	 *
	 * @param uuid the osi application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi application stages
	 * @throws PortalException if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages getOsiApplicationStagesByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getOsiApplicationStagesByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the osi application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.stages.services.model.impl.OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @return the range of osi application stageses
	 */
	public static List<OsiApplicationStages> getOsiApplicationStageses(
		int start, int end) {

		return getService().getOsiApplicationStageses(start, end);
	}

	/**
	 * Returns all the osi application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi application stageses
	 * @param companyId the primary key of the company
	 * @return the matching osi application stageses, or an empty list if no matches were found
	 */
	public static List<OsiApplicationStages>
		getOsiApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getOsiApplicationStagesesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of osi application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi application stageses, or an empty list if no matches were found
	 */
	public static List<OsiApplicationStages>
		getOsiApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<OsiApplicationStages> orderByComparator) {

		return getService().getOsiApplicationStagesesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi application stageses.
	 *
	 * @return the number of osi application stageses
	 */
	public static int getOsiApplicationStagesesCount() {
		return getService().getOsiApplicationStagesesCount();
	}

	public static Long getOSIFCSeenCases() {
		return getService().getOSIFCSeenCases();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiApplicationStages the osi application stages
	 * @return the osi application stages that was updated
	 */
	public static OsiApplicationStages updateOsiApplicationStages(
		OsiApplicationStages osiApplicationStages) {

		return getService().updateOsiApplicationStages(osiApplicationStages);
	}

	public static OsiApplicationStages updateOsiApplicationStages(
		String caseId, String stageName, java.util.Date stageStartDate,
		java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateOsiApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static OsiApplicationStagesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OsiApplicationStagesLocalService>
		_serviceSnapshot = new Snapshot<>(
			OsiApplicationStagesLocalServiceUtil.class,
			OsiApplicationStagesLocalService.class);

}