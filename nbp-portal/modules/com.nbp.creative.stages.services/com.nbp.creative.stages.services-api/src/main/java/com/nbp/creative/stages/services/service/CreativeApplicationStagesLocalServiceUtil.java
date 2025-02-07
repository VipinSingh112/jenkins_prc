/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.creative.stages.services.model.CreativeApplicationStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CreativeApplicationStages. This utility wraps
 * <code>com.nbp.creative.stages.services.service.impl.CreativeApplicationStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeApplicationStagesLocalService
 * @generated
 */
public class CreativeApplicationStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.creative.stages.services.service.impl.CreativeApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the creative application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeApplicationStages the creative application stages
	 * @return the creative application stages that was added
	 */
	public static CreativeApplicationStages addCreativeApplicationStages(
		CreativeApplicationStages creativeApplicationStages) {

		return getService().addCreativeApplicationStages(
			creativeApplicationStages);
	}

	/**
	 * Creates a new creative application stages with the primary key. Does not add the creative application stages to the database.
	 *
	 * @param creativeApplicationStagesId the primary key for the new creative application stages
	 * @return the new creative application stages
	 */
	public static CreativeApplicationStages createCreativeApplicationStages(
		long creativeApplicationStagesId) {

		return getService().createCreativeApplicationStages(
			creativeApplicationStagesId);
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
	 * Deletes the creative application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeApplicationStages the creative application stages
	 * @return the creative application stages that was removed
	 */
	public static CreativeApplicationStages deleteCreativeApplicationStages(
		CreativeApplicationStages creativeApplicationStages) {

		return getService().deleteCreativeApplicationStages(
			creativeApplicationStages);
	}

	/**
	 * Deletes the creative application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeApplicationStagesId the primary key of the creative application stages
	 * @return the creative application stages that was removed
	 * @throws PortalException if a creative application stages with the primary key could not be found
	 */
	public static CreativeApplicationStages deleteCreativeApplicationStages(
			long creativeApplicationStagesId)
		throws PortalException {

		return getService().deleteCreativeApplicationStages(
			creativeApplicationStagesId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.stages.services.model.impl.CreativeApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.stages.services.model.impl.CreativeApplicationStagesModelImpl</code>.
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

	public static CreativeApplicationStages fetchCreativeApplicationStages(
		long creativeApplicationStagesId) {

		return getService().fetchCreativeApplicationStages(
			creativeApplicationStagesId);
	}

	/**
	 * Returns the creative application stages matching the UUID and group.
	 *
	 * @param uuid the creative application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages
		fetchCreativeApplicationStagesByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchCreativeApplicationStagesByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<CreativeApplicationStages> getCAS_BY_SN(
		String stageName) {

		return getService().getCAS_BY_SN(stageName);
	}

	public static CreativeApplicationStages getCAS_CAI(
			long creativeApplicationId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getService().getCAS_CAI(creativeApplicationId);
	}

	public static List<CreativeApplicationStages> getCAS_CaseId(String caseId) {
		return getService().getCAS_CaseId(caseId);
	}

	public static CreativeApplicationStages getCAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getService().getCAS_CaseIdAndStatus(caseId, stageStatus);
	}

	public static CreativeApplicationStages getCAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getService().getCAS_CaseIdStageName(caseId, stageName);
	}

	public static CreativeApplicationStages getCAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getService().getCAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	public static List<CreativeApplicationStages> getCAS_SNAndSS(
		String stageName, String status) {

		return getService().getCAS_SNAndSS(stageName, status);
	}

	/**
	 * Returns the creative application stages with the primary key.
	 *
	 * @param creativeApplicationStagesId the primary key of the creative application stages
	 * @return the creative application stages
	 * @throws PortalException if a creative application stages with the primary key could not be found
	 */
	public static CreativeApplicationStages getCreativeApplicationStages(
			long creativeApplicationStagesId)
		throws PortalException {

		return getService().getCreativeApplicationStages(
			creativeApplicationStagesId);
	}

	/**
	 * Returns the creative application stages matching the UUID and group.
	 *
	 * @param uuid the creative application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching creative application stages
	 * @throws PortalException if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages
			getCreativeApplicationStagesByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getCreativeApplicationStagesByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the creative application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.stages.services.model.impl.CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @return the range of creative application stageses
	 */
	public static List<CreativeApplicationStages>
		getCreativeApplicationStageses(int start, int end) {

		return getService().getCreativeApplicationStageses(start, end);
	}

	/**
	 * Returns all the creative application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the creative application stageses
	 * @param companyId the primary key of the company
	 * @return the matching creative application stageses, or an empty list if no matches were found
	 */
	public static List<CreativeApplicationStages>
		getCreativeApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getCreativeApplicationStagesesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of creative application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the creative application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching creative application stageses, or an empty list if no matches were found
	 */
	public static List<CreativeApplicationStages>
		getCreativeApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return getService().getCreativeApplicationStagesesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of creative application stageses.
	 *
	 * @return the number of creative application stageses
	 */
	public static int getCreativeApplicationStagesesCount() {
		return getService().getCreativeApplicationStagesesCount();
	}

	public static List<String> getCreativeDistinctStages() {
		return getService().getCreativeDistinctStages();
	}

	public static Long getCreativeSeenCases() {
		return getService().getCreativeSeenCases();
	}

	public static String getCretiveCurrentStages(String caseId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getService().getCretiveCurrentStages(caseId);
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
	 * Updates the creative application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeApplicationStages the creative application stages
	 * @return the creative application stages that was updated
	 */
	public static CreativeApplicationStages updateCreativeApplicationStages(
		CreativeApplicationStages creativeApplicationStages) {

		return getService().updateCreativeApplicationStages(
			creativeApplicationStages);
	}

	public static CreativeApplicationStages updateCreativeApplicationStages(
		String caseId, String stageName, java.util.Date stageStartDate,
		java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateCreativeApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static CreativeApplicationStagesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CreativeApplicationStagesLocalService>
		_serviceSnapshot = new Snapshot<>(
			CreativeApplicationStagesLocalServiceUtil.class,
			CreativeApplicationStagesLocalService.class);

}