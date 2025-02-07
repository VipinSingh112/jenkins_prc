/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.medical.stages.service.model.MedicalApplicationStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MedicalApplicationStages. This utility wraps
 * <code>com.nbp.medical.stages.service.service.impl.MedicalApplicationStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalApplicationStagesLocalService
 * @generated
 */
public class MedicalApplicationStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.medical.stages.service.service.impl.MedicalApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the medical application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalApplicationStages the medical application stages
	 * @return the medical application stages that was added
	 */
	public static MedicalApplicationStages addMedicalApplicationStages(
		MedicalApplicationStages medicalApplicationStages) {

		return getService().addMedicalApplicationStages(
			medicalApplicationStages);
	}

	/**
	 * Creates a new medical application stages with the primary key. Does not add the medical application stages to the database.
	 *
	 * @param medicalStagesId the primary key for the new medical application stages
	 * @return the new medical application stages
	 */
	public static MedicalApplicationStages createMedicalApplicationStages(
		long medicalStagesId) {

		return getService().createMedicalApplicationStages(medicalStagesId);
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
	 * Deletes the medical application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalStagesId the primary key of the medical application stages
	 * @return the medical application stages that was removed
	 * @throws PortalException if a medical application stages with the primary key could not be found
	 */
	public static MedicalApplicationStages deleteMedicalApplicationStages(
			long medicalStagesId)
		throws PortalException {

		return getService().deleteMedicalApplicationStages(medicalStagesId);
	}

	/**
	 * Deletes the medical application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalApplicationStages the medical application stages
	 * @return the medical application stages that was removed
	 */
	public static MedicalApplicationStages deleteMedicalApplicationStages(
		MedicalApplicationStages medicalApplicationStages) {

		return getService().deleteMedicalApplicationStages(
			medicalApplicationStages);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalApplicationStagesModelImpl</code>.
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

	public static MedicalApplicationStages fetchMedicalApplicationStages(
		long medicalStagesId) {

		return getService().fetchMedicalApplicationStages(medicalStagesId);
	}

	/**
	 * Returns the medical application stages matching the UUID and group.
	 *
	 * @param uuid the medical application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages
		fetchMedicalApplicationStagesByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchMedicalApplicationStagesByUuidAndGroupId(
			uuid, groupId);
	}

	public static MedicalApplicationStages get_Medical_By_CI(String caseId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getService().get_Medical_By_CI(caseId);
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

	public static String getManufacturingApplicaitonCurrentStages(
		String caseId) {

		return getService().getManufacturingApplicaitonCurrentStages(caseId);
	}

	/**
	 * Returns the medical application stages with the primary key.
	 *
	 * @param medicalStagesId the primary key of the medical application stages
	 * @return the medical application stages
	 * @throws PortalException if a medical application stages with the primary key could not be found
	 */
	public static MedicalApplicationStages getMedicalApplicationStages(
			long medicalStagesId)
		throws PortalException {

		return getService().getMedicalApplicationStages(medicalStagesId);
	}

	/**
	 * Returns the medical application stages matching the UUID and group.
	 *
	 * @param uuid the medical application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical application stages
	 * @throws PortalException if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages
			getMedicalApplicationStagesByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getMedicalApplicationStagesByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the medical application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @return the range of medical application stageses
	 */
	public static List<MedicalApplicationStages> getMedicalApplicationStageses(
		int start, int end) {

		return getService().getMedicalApplicationStageses(start, end);
	}

	/**
	 * Returns all the medical application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical application stageses
	 * @param companyId the primary key of the company
	 * @return the matching medical application stageses, or an empty list if no matches were found
	 */
	public static List<MedicalApplicationStages>
		getMedicalApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getMedicalApplicationStagesesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of medical application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching medical application stageses, or an empty list if no matches were found
	 */
	public static List<MedicalApplicationStages>
		getMedicalApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<MedicalApplicationStages> orderByComparator) {

		return getService().getMedicalApplicationStagesesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of medical application stageses.
	 *
	 * @return the number of medical application stageses
	 */
	public static int getMedicalApplicationStagesesCount() {
		return getService().getMedicalApplicationStagesesCount();
	}

	public static List<MedicalApplicationStages> getMedicalByCI(String caseId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getService().getMedicalByCI(caseId);
	}

	public static MedicalApplicationStages getMedicalByCI_SN(
			String caseId, String stageName)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getService().getMedicalByCI_SN(caseId, stageName);
	}

	public static MedicalApplicationStages getMedicalByCI_ST(
			String caseId, String stageStatus)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getService().getMedicalByCI_ST(caseId, stageStatus);
	}

	public static MedicalApplicationStages getMedicalByCI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getService().getMedicalByCI_ST_SN(
			caseId, stageStatus, stageName);
	}

	public static List<String> getMedicalDistinctStages() {
		return getService().getMedicalDistinctStages();
	}

	public static Long getMedicalSeenCases() {
		return getService().getMedicalSeenCases();
	}

	public static String getNcbjApplicaitonCurrentStages(String caseId) {
		return getService().getNcbjApplicaitonCurrentStages(caseId);
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

	public static List<MedicalApplicationStages>
		gtMedicalApplicationStages_By_SN(String stageName) {

		return getService().gtMedicalApplicationStages_By_SN(stageName);
	}

	/**
	 * Updates the medical application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalApplicationStages the medical application stages
	 * @return the medical application stages that was updated
	 */
	public static MedicalApplicationStages updateMedicalApplicationStages(
		MedicalApplicationStages medicalApplicationStages) {

		return getService().updateMedicalApplicationStages(
			medicalApplicationStages);
	}

	public static MedicalApplicationStages updateMedicalApplicationStages(
		String caseId, String stageName, java.util.Date stageStartDate,
		java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateMedicalApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static MedicalApplicationStagesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MedicalApplicationStagesLocalService>
		_serviceSnapshot = new Snapshot<>(
			MedicalApplicationStagesLocalServiceUtil.class,
			MedicalApplicationStagesLocalService.class);

}