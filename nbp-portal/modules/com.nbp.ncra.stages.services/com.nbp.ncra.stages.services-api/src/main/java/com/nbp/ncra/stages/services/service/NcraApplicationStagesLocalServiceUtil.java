/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncra.stages.services.model.NcraApplicationStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for NcraApplicationStages. This utility wraps
 * <code>com.nbp.ncra.stages.services.service.impl.NcraApplicationStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NcraApplicationStagesLocalService
 * @generated
 */
public class NcraApplicationStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ncra.stages.services.service.impl.NcraApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the ncra application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraApplicationStages the ncra application stages
	 * @return the ncra application stages that was added
	 */
	public static NcraApplicationStages addNcraApplicationStages(
		NcraApplicationStages ncraApplicationStages) {

		return getService().addNcraApplicationStages(ncraApplicationStages);
	}

	/**
	 * Creates a new ncra application stages with the primary key. Does not add the ncra application stages to the database.
	 *
	 * @param ncraApplciationStage the primary key for the new ncra application stages
	 * @return the new ncra application stages
	 */
	public static NcraApplicationStages createNcraApplicationStages(
		long ncraApplciationStage) {

		return getService().createNcraApplicationStages(ncraApplciationStage);
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
	 * Deletes the ncra application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraApplciationStage the primary key of the ncra application stages
	 * @return the ncra application stages that was removed
	 * @throws PortalException if a ncra application stages with the primary key could not be found
	 */
	public static NcraApplicationStages deleteNcraApplicationStages(
			long ncraApplciationStage)
		throws PortalException {

		return getService().deleteNcraApplicationStages(ncraApplciationStage);
	}

	/**
	 * Deletes the ncra application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraApplicationStages the ncra application stages
	 * @return the ncra application stages that was removed
	 */
	public static NcraApplicationStages deleteNcraApplicationStages(
		NcraApplicationStages ncraApplicationStages) {

		return getService().deleteNcraApplicationStages(ncraApplicationStages);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.stages.services.model.impl.NcraApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.stages.services.model.impl.NcraApplicationStagesModelImpl</code>.
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

	public static NcraApplicationStages fetchNcraApplicationStages(
		long ncraApplciationStage) {

		return getService().fetchNcraApplicationStages(ncraApplciationStage);
	}

	/**
	 * Returns the ncra application stages matching the UUID and group.
	 *
	 * @param uuid the ncra application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages
		fetchNcraApplicationStagesByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchNcraApplicationStagesByUuidAndGroupId(
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

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static List<NcraApplicationStages> getNCRA_By_CaseId(String caseId) {
		return getService().getNCRA_By_CaseId(caseId);
	}

	public static NcraApplicationStages getNCRA_By_StageStatus(
			String stageStatus)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getService().getNCRA_By_StageStatus(stageStatus);
	}

	public static NcraApplicationStages getNCRA_ByCI(String caseId)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getService().getNCRA_ByCI(caseId);
	}

	public static NcraApplicationStages getNCRA_ByCI_SN(
			String caseId, String stageName)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getService().getNCRA_ByCI_SN(caseId, stageName);
	}

	public static NcraApplicationStages getNCRA_ByCI_SN_SS(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getService().getNCRA_ByCI_SN_SS(caseId, stageName, stageStatus);
	}

	public static NcraApplicationStages getNCRA_ByCI_SS(
			String caseId, String stageStatus)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getService().getNCRA_ByCI_SS(caseId, stageStatus);
	}

	public static List<NcraApplicationStages> getNCRA_BySN(String stageName) {
		return getService().getNCRA_BySN(stageName);
	}

	/**
	 * Returns the ncra application stages with the primary key.
	 *
	 * @param ncraApplciationStage the primary key of the ncra application stages
	 * @return the ncra application stages
	 * @throws PortalException if a ncra application stages with the primary key could not be found
	 */
	public static NcraApplicationStages getNcraApplicationStages(
			long ncraApplciationStage)
		throws PortalException {

		return getService().getNcraApplicationStages(ncraApplciationStage);
	}

	/**
	 * Returns the ncra application stages matching the UUID and group.
	 *
	 * @param uuid the ncra application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ncra application stages
	 * @throws PortalException if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages
			getNcraApplicationStagesByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getNcraApplicationStagesByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the ncra application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.stages.services.model.impl.NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @return the range of ncra application stageses
	 */
	public static List<NcraApplicationStages> getNcraApplicationStageses(
		int start, int end) {

		return getService().getNcraApplicationStageses(start, end);
	}

	/**
	 * Returns all the ncra application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the ncra application stageses
	 * @param companyId the primary key of the company
	 * @return the matching ncra application stageses, or an empty list if no matches were found
	 */
	public static List<NcraApplicationStages>
		getNcraApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getNcraApplicationStagesesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of ncra application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the ncra application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching ncra application stageses, or an empty list if no matches were found
	 */
	public static List<NcraApplicationStages>
		getNcraApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<NcraApplicationStages> orderByComparator) {

		return getService().getNcraApplicationStagesesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of ncra application stageses.
	 *
	 * @return the number of ncra application stageses
	 */
	public static int getNcraApplicationStagesesCount() {
		return getService().getNcraApplicationStagesesCount();
	}

	public static String getNCRACurrentStages(String caseId) {
		return getService().getNCRACurrentStages(caseId);
	}

	public static List<String> getNCRADistinctStages() {
		return getService().getNCRADistinctStages();
	}

	public static Long getNCRASeenCases() {
		return getService().getNCRASeenCases();
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
	 * Updates the ncra application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraApplicationStages the ncra application stages
	 * @return the ncra application stages that was updated
	 */
	public static NcraApplicationStages updateNcraApplicationStages(
		NcraApplicationStages ncraApplicationStages) {

		return getService().updateNcraApplicationStages(ncraApplicationStages);
	}

	public static NcraApplicationStages updateNCRAAppStage(
		String caseId, String stageName, String stageStatus,
		java.util.Date stageStartDate, java.util.Date stageEndDate,
		String duration) {

		return getService().updateNCRAAppStage(
			caseId, stageName, stageStatus, stageStartDate, stageEndDate,
			duration);
	}

	public static NcraApplicationStagesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<NcraApplicationStagesLocalService>
		_serviceSnapshot = new Snapshot<>(
			NcraApplicationStagesLocalServiceUtil.class,
			NcraApplicationStagesLocalService.class);

}