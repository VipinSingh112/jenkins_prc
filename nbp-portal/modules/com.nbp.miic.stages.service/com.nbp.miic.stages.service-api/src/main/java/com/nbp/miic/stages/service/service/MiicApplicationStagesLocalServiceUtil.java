/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.miic.stages.service.model.MiicApplicationStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MiicApplicationStages. This utility wraps
 * <code>com.nbp.miic.stages.service.service.impl.MiicApplicationStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicationStagesLocalService
 * @generated
 */
public class MiicApplicationStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.miic.stages.service.service.impl.MiicApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the miic application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplicationStages the miic application stages
	 * @return the miic application stages that was added
	 */
	public static MiicApplicationStages addMiicApplicationStages(
		MiicApplicationStages miicApplicationStages) {

		return getService().addMiicApplicationStages(miicApplicationStages);
	}

	/**
	 * Creates a new miic application stages with the primary key. Does not add the miic application stages to the database.
	 *
	 * @param miicApplicationStagesId the primary key for the new miic application stages
	 * @return the new miic application stages
	 */
	public static MiicApplicationStages createMiicApplicationStages(
		long miicApplicationStagesId) {

		return getService().createMiicApplicationStages(
			miicApplicationStagesId);
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
	 * Deletes the miic application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplicationStagesId the primary key of the miic application stages
	 * @return the miic application stages that was removed
	 * @throws PortalException if a miic application stages with the primary key could not be found
	 */
	public static MiicApplicationStages deleteMiicApplicationStages(
			long miicApplicationStagesId)
		throws PortalException {

		return getService().deleteMiicApplicationStages(
			miicApplicationStagesId);
	}

	/**
	 * Deletes the miic application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplicationStages the miic application stages
	 * @return the miic application stages that was removed
	 */
	public static MiicApplicationStages deleteMiicApplicationStages(
		MiicApplicationStages miicApplicationStages) {

		return getService().deleteMiicApplicationStages(miicApplicationStages);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.stages.service.model.impl.MiicApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.stages.service.model.impl.MiicApplicationStagesModelImpl</code>.
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

	public static MiicApplicationStages fetchMiicApplicationStages(
		long miicApplicationStagesId) {

		return getService().fetchMiicApplicationStages(miicApplicationStagesId);
	}

	/**
	 * Returns the miic application stages matching the UUID and group.
	 *
	 * @param uuid the miic application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages
		fetchMiicApplicationStagesByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchMiicApplicationStagesByUuidAndGroupId(
			uuid, groupId);
	}

	public static MiicApplicationStages findBygetMIIC_By_CaseId(String caseId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getService().findBygetMIIC_By_CaseId(caseId);
	}

	public static MiicApplicationStages findBygetMIIC_CAI(
			long miicApplicationId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getService().findBygetMIIC_CAI(miicApplicationId);
	}

	public static List<MiicApplicationStages> findBygetMIIC_CaseId(
		String caseId) {

		return getService().findBygetMIIC_CaseId(caseId);
	}

	public static MiicApplicationStages findBygetMIIC_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getService().findBygetMIIC_CaseIdAndStatus(caseId, stageStatus);
	}

	public static MiicApplicationStages findBygetMIIC_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getService().findBygetMIIC_CaseIdStageName(caseId, stageName);
	}

	public static MiicApplicationStages findBygetMIIC_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getService().findBygetMIIC_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	public static List<MiicApplicationStages> findBygetMIIC_StageName(
		String stageName) {

		return getService().findBygetMIIC_StageName(stageName);
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

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static String getMIICApplicaitonCurrentStages(String caseId) {
		return getService().getMIICApplicaitonCurrentStages(caseId);
	}

	/**
	 * Returns the miic application stages with the primary key.
	 *
	 * @param miicApplicationStagesId the primary key of the miic application stages
	 * @return the miic application stages
	 * @throws PortalException if a miic application stages with the primary key could not be found
	 */
	public static MiicApplicationStages getMiicApplicationStages(
			long miicApplicationStagesId)
		throws PortalException {

		return getService().getMiicApplicationStages(miicApplicationStagesId);
	}

	/**
	 * Returns the miic application stages matching the UUID and group.
	 *
	 * @param uuid the miic application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching miic application stages
	 * @throws PortalException if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages
			getMiicApplicationStagesByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getMiicApplicationStagesByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the miic application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.stages.service.model.impl.MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @return the range of miic application stageses
	 */
	public static List<MiicApplicationStages> getMiicApplicationStageses(
		int start, int end) {

		return getService().getMiicApplicationStageses(start, end);
	}

	/**
	 * Returns all the miic application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the miic application stageses
	 * @param companyId the primary key of the company
	 * @return the matching miic application stageses, or an empty list if no matches were found
	 */
	public static List<MiicApplicationStages>
		getMiicApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getMiicApplicationStagesesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of miic application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the miic application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching miic application stageses, or an empty list if no matches were found
	 */
	public static List<MiicApplicationStages>
		getMiicApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<MiicApplicationStages> orderByComparator) {

		return getService().getMiicApplicationStagesesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of miic application stageses.
	 *
	 * @return the number of miic application stageses
	 */
	public static int getMiicApplicationStagesesCount() {
		return getService().getMiicApplicationStagesesCount();
	}

	public static List<String> getMiicDistinctStages() {
		return getService().getMiicDistinctStages();
	}

	public static Long getMIICSeenCases() {
		return getService().getMIICSeenCases();
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
	 * Updates the miic application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplicationStages the miic application stages
	 * @return the miic application stages that was updated
	 */
	public static MiicApplicationStages updateMiicApplicationStages(
		MiicApplicationStages miicApplicationStages) {

		return getService().updateMiicApplicationStages(miicApplicationStages);
	}

	public static MiicApplicationStages updateMIICApplicationStages(
		String caseId, String stageName, java.util.Date stageStartDate,
		java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateMIICApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static MiicApplicationStagesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MiicApplicationStagesLocalService>
		_serviceSnapshot = new Snapshot<>(
			MiicApplicationStagesLocalServiceUtil.class,
			MiicApplicationStagesLocalService.class);

}