/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.stages.services.model.NcbjApplicationStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for NcbjApplicationStages. This utility wraps
 * <code>com.nbp.ncbj.stages.services.service.impl.NcbjApplicationStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicationStagesLocalService
 * @generated
 */
public class NcbjApplicationStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ncbj.stages.services.service.impl.NcbjApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the ncbj application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicationStages the ncbj application stages
	 * @return the ncbj application stages that was added
	 */
	public static NcbjApplicationStages addNcbjApplicationStages(
		NcbjApplicationStages ncbjApplicationStages) {

		return getService().addNcbjApplicationStages(ncbjApplicationStages);
	}

	/**
	 * Creates a new ncbj application stages with the primary key. Does not add the ncbj application stages to the database.
	 *
	 * @param ncbjStagesApplicationId the primary key for the new ncbj application stages
	 * @return the new ncbj application stages
	 */
	public static NcbjApplicationStages createNcbjApplicationStages(
		long ncbjStagesApplicationId) {

		return getService().createNcbjApplicationStages(
			ncbjStagesApplicationId);
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
	 * Deletes the ncbj application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjStagesApplicationId the primary key of the ncbj application stages
	 * @return the ncbj application stages that was removed
	 * @throws PortalException if a ncbj application stages with the primary key could not be found
	 */
	public static NcbjApplicationStages deleteNcbjApplicationStages(
			long ncbjStagesApplicationId)
		throws PortalException {

		return getService().deleteNcbjApplicationStages(
			ncbjStagesApplicationId);
	}

	/**
	 * Deletes the ncbj application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicationStages the ncbj application stages
	 * @return the ncbj application stages that was removed
	 */
	public static NcbjApplicationStages deleteNcbjApplicationStages(
		NcbjApplicationStages ncbjApplicationStages) {

		return getService().deleteNcbjApplicationStages(ncbjApplicationStages);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjApplicationStagesModelImpl</code>.
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

	public static NcbjApplicationStages fetchNcbjApplicationStages(
		long ncbjStagesApplicationId) {

		return getService().fetchNcbjApplicationStages(ncbjStagesApplicationId);
	}

	/**
	 * Returns the ncbj application stages matching the UUID and group.
	 *
	 * @param uuid the ncbj application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages
		fetchNcbjApplicationStagesByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchNcbjApplicationStagesByUuidAndGroupId(
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

	public static String getManufacturingApplicaitonCurrentStages(
		String caseId) {

		return getService().getManufacturingApplicaitonCurrentStages(caseId);
	}

	public static List<NcbjApplicationStages> getMiningByCI(String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getService().getMiningByCI(caseId);
	}

	public static NcbjApplicationStages getMiningByCI_SN(
			String caseId, String stageName)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getService().getMiningByCI_SN(caseId, stageName);
	}

	public static NcbjApplicationStages getMiningByCI_ST(
			String caseId, String stageStatus)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getService().getMiningByCI_ST(caseId, stageStatus);
	}

	public static NcbjApplicationStages getMiningByCI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getService().getMiningByCI_ST_SN(caseId, stageStatus, stageName);
	}

	public static String getNcbjApplicaitonCurrentStages(String caseId) {
		return getService().getNcbjApplicaitonCurrentStages(caseId);
	}

	/**
	 * Returns the ncbj application stages with the primary key.
	 *
	 * @param ncbjStagesApplicationId the primary key of the ncbj application stages
	 * @return the ncbj application stages
	 * @throws PortalException if a ncbj application stages with the primary key could not be found
	 */
	public static NcbjApplicationStages getNcbjApplicationStages(
			long ncbjStagesApplicationId)
		throws PortalException {

		return getService().getNcbjApplicationStages(ncbjStagesApplicationId);
	}

	/**
	 * Returns the ncbj application stages matching the UUID and group.
	 *
	 * @param uuid the ncbj application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ncbj application stages
	 * @throws PortalException if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages
			getNcbjApplicationStagesByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getNcbjApplicationStagesByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the ncbj application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @return the range of ncbj application stageses
	 */
	public static List<NcbjApplicationStages> getNcbjApplicationStageses(
		int start, int end) {

		return getService().getNcbjApplicationStageses(start, end);
	}

	/**
	 * Returns all the ncbj application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the ncbj application stageses
	 * @param companyId the primary key of the company
	 * @return the matching ncbj application stageses, or an empty list if no matches were found
	 */
	public static List<NcbjApplicationStages>
		getNcbjApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getNcbjApplicationStagesesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of ncbj application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the ncbj application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching ncbj application stageses, or an empty list if no matches were found
	 */
	public static List<NcbjApplicationStages>
		getNcbjApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<NcbjApplicationStages> orderByComparator) {

		return getService().getNcbjApplicationStagesesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of ncbj application stageses.
	 *
	 * @return the number of ncbj application stageses
	 */
	public static int getNcbjApplicationStagesesCount() {
		return getService().getNcbjApplicationStagesesCount();
	}

	public static NcbjApplicationStages getNCBJByCI(String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getService().getNCBJByCI(caseId);
	}

	public static NcbjApplicationStages getNcbjByCI_SN(
			String caseId, String stageName)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getService().getNcbjByCI_SN(caseId, stageName);
	}

	public static NcbjApplicationStages getNcbjByCI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getService().getNcbjByCI_ST_SN(caseId, stageStatus, stageName);
	}

	public static List<String> getNcbjDistinctStages() {
		return getService().getNcbjDistinctStages();
	}

	public static Long getNCBJSeenCases() {
		return getService().getNCBJSeenCases();
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

	public static Long getQuarrySeenCases() {
		return getService().getQuarrySeenCases();
	}

	public static List<NcbjApplicationStages> gtNcbjApplicationStages_By_SN(
		String stageName) {

		return getService().gtNcbjApplicationStages_By_SN(stageName);
	}

	/**
	 * Updates the ncbj application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicationStages the ncbj application stages
	 * @return the ncbj application stages that was updated
	 */
	public static NcbjApplicationStages updateNcbjApplicationStages(
		NcbjApplicationStages ncbjApplicationStages) {

		return getService().updateNcbjApplicationStages(ncbjApplicationStages);
	}

	public static NcbjApplicationStages updateNcbjApplicationStages(
		String caseId, String stageName, java.util.Date stageStartDate,
		java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateNcbjApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static NcbjApplicationStagesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<NcbjApplicationStagesLocalService>
		_serviceSnapshot = new Snapshot<>(
			NcbjApplicationStagesLocalServiceUtil.class,
			NcbjApplicationStagesLocalService.class);

}