/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.stage.services.model.OsiInsolvencyApplicationStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiInsolvencyApplicationStages. This utility wraps
 * <code>com.nbp.osi.insolvency.stage.services.service.impl.OsiInsolvencyApplicationStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyApplicationStagesLocalService
 * @generated
 */
public class OsiInsolvencyApplicationStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.insolvency.stage.services.service.impl.OsiInsolvencyApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi insolvency application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyApplicationStages the osi insolvency application stages
	 * @return the osi insolvency application stages that was added
	 */
	public static OsiInsolvencyApplicationStages
		addOsiInsolvencyApplicationStages(
			OsiInsolvencyApplicationStages osiInsolvencyApplicationStages) {

		return getService().addOsiInsolvencyApplicationStages(
			osiInsolvencyApplicationStages);
	}

	/**
	 * Creates a new osi insolvency application stages with the primary key. Does not add the osi insolvency application stages to the database.
	 *
	 * @param osiInsolveApplicationStagesId the primary key for the new osi insolvency application stages
	 * @return the new osi insolvency application stages
	 */
	public static OsiInsolvencyApplicationStages
		createOsiInsolvencyApplicationStages(
			long osiInsolveApplicationStagesId) {

		return getService().createOsiInsolvencyApplicationStages(
			osiInsolveApplicationStagesId);
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
	 * Deletes the osi insolvency application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the osi insolvency application stages
	 * @return the osi insolvency application stages that was removed
	 * @throws PortalException if a osi insolvency application stages with the primary key could not be found
	 */
	public static OsiInsolvencyApplicationStages
			deleteOsiInsolvencyApplicationStages(
				long osiInsolveApplicationStagesId)
		throws PortalException {

		return getService().deleteOsiInsolvencyApplicationStages(
			osiInsolveApplicationStagesId);
	}

	/**
	 * Deletes the osi insolvency application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyApplicationStages the osi insolvency application stages
	 * @return the osi insolvency application stages that was removed
	 */
	public static OsiInsolvencyApplicationStages
		deleteOsiInsolvencyApplicationStages(
			OsiInsolvencyApplicationStages osiInsolvencyApplicationStages) {

		return getService().deleteOsiInsolvencyApplicationStages(
			osiInsolvencyApplicationStages);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolvencyApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolvencyApplicationStagesModelImpl</code>.
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

	public static OsiInsolvencyApplicationStages
		fetchOsiInsolvencyApplicationStages(
			long osiInsolveApplicationStagesId) {

		return getService().fetchOsiInsolvencyApplicationStages(
			osiInsolveApplicationStagesId);
	}

	/**
	 * Returns the osi insolvency application stages matching the UUID and group.
	 *
	 * @param uuid the osi insolvency application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages
		fetchOsiInsolvencyApplicationStagesByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchOsiInsolvencyApplicationStagesByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static OsiInsolvencyApplicationStages getCAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

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

	public static List<OsiInsolvencyApplicationStages> getOAIS_StageName(
		String stageName) {

		return getService().getOAIS_StageName(stageName);
	}

	public static List<OsiInsolvencyApplicationStages> getOIAS_CaseId(
		String caseId) {

		return getService().getOIAS_CaseId(caseId);
	}

	public static OsiInsolvencyApplicationStages getOIAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getService().getOIAS_CaseIdAndStatus(caseId, stageStatus);
	}

	public static OsiInsolvencyApplicationStages getOIAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getService().getOIAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	public static OsiInsolvencyApplicationStages getOIAS_OAI(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getService().getOIAS_OAI(osiInsolvencyId);
	}

	public static List<OsiInsolvencyApplicationStages>
		getOIAS_StageName_StageStatus(String caseId, String status) {

		return getService().getOIAS_StageName_StageStatus(caseId, status);
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
	 * Returns the osi insolvency application stages with the primary key.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the osi insolvency application stages
	 * @return the osi insolvency application stages
	 * @throws PortalException if a osi insolvency application stages with the primary key could not be found
	 */
	public static OsiInsolvencyApplicationStages
			getOsiInsolvencyApplicationStages(
				long osiInsolveApplicationStagesId)
		throws PortalException {

		return getService().getOsiInsolvencyApplicationStages(
			osiInsolveApplicationStagesId);
	}

	/**
	 * Returns the osi insolvency application stages matching the UUID and group.
	 *
	 * @param uuid the osi insolvency application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi insolvency application stages
	 * @throws PortalException if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages
			getOsiInsolvencyApplicationStagesByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getOsiInsolvencyApplicationStagesByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the osi insolvency application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @return the range of osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages>
		getOsiInsolvencyApplicationStageses(int start, int end) {

		return getService().getOsiInsolvencyApplicationStageses(start, end);
	}

	/**
	 * Returns all the osi insolvency application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi insolvency application stageses
	 * @param companyId the primary key of the company
	 * @return the matching osi insolvency application stageses, or an empty list if no matches were found
	 */
	public static List<OsiInsolvencyApplicationStages>
		getOsiInsolvencyApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().
			getOsiInsolvencyApplicationStagesesByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of osi insolvency application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi insolvency application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi insolvency application stageses, or an empty list if no matches were found
	 */
	public static List<OsiInsolvencyApplicationStages>
		getOsiInsolvencyApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<OsiInsolvencyApplicationStages>
				orderByComparator) {

		return getService().
			getOsiInsolvencyApplicationStagesesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi insolvency application stageses.
	 *
	 * @return the number of osi insolvency application stageses
	 */
	public static int getOsiInsolvencyApplicationStagesesCount() {
		return getService().getOsiInsolvencyApplicationStagesesCount();
	}

	public static String getOsiInsolvencypplicaitonCurrentStages(
		String caseId) {

		return getService().getOsiInsolvencypplicaitonCurrentStages(caseId);
	}

	public static String
		getOsiInsolvencypplicaitonCurrentStagesForVerificationReport(
			String caseId) {

		return getService().
			getOsiInsolvencypplicaitonCurrentStagesForVerificationReport(
				caseId);
	}

	public static Long getOSIIRSeenCases(String stageName) {
		return getService().getOSIIRSeenCases(stageName);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi insolvency application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyApplicationStages the osi insolvency application stages
	 * @return the osi insolvency application stages that was updated
	 */
	public static OsiInsolvencyApplicationStages
		updateOsiInsolvencyApplicationStages(
			OsiInsolvencyApplicationStages osiInsolvencyApplicationStages) {

		return getService().updateOsiInsolvencyApplicationStages(
			osiInsolvencyApplicationStages);
	}

	public static OsiInsolvencyApplicationStages
		updateOsiInsolvencyApplicationStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateOsiInsolvencyApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static OsiInsolvencyApplicationStagesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OsiInsolvencyApplicationStagesLocalService>
		_serviceSnapshot = new Snapshot<>(
			OsiInsolvencyApplicationStagesLocalServiceUtil.class,
			OsiInsolvencyApplicationStagesLocalService.class);

}