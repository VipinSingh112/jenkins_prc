/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.mining.stage.service.model.MiningApplicationStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MiningApplicationStages. This utility wraps
 * <code>com.nbp.mining.stage.service.service.impl.MiningApplicationStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationStagesLocalService
 * @generated
 */
public class MiningApplicationStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.mining.stage.service.service.impl.MiningApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the mining application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationStages the mining application stages
	 * @return the mining application stages that was added
	 */
	public static MiningApplicationStages addMiningApplicationStages(
		MiningApplicationStages miningApplicationStages) {

		return getService().addMiningApplicationStages(miningApplicationStages);
	}

	/**
	 * Creates a new mining application stages with the primary key. Does not add the mining application stages to the database.
	 *
	 * @param miningStagesId the primary key for the new mining application stages
	 * @return the new mining application stages
	 */
	public static MiningApplicationStages createMiningApplicationStages(
		long miningStagesId) {

		return getService().createMiningApplicationStages(miningStagesId);
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
	 * Deletes the mining application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningStagesId the primary key of the mining application stages
	 * @return the mining application stages that was removed
	 * @throws PortalException if a mining application stages with the primary key could not be found
	 */
	public static MiningApplicationStages deleteMiningApplicationStages(
			long miningStagesId)
		throws PortalException {

		return getService().deleteMiningApplicationStages(miningStagesId);
	}

	/**
	 * Deletes the mining application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationStages the mining application stages
	 * @return the mining application stages that was removed
	 */
	public static MiningApplicationStages deleteMiningApplicationStages(
		MiningApplicationStages miningApplicationStages) {

		return getService().deleteMiningApplicationStages(
			miningApplicationStages);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationStagesModelImpl</code>.
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

	public static MiningApplicationStages fetchMiningApplicationStages(
		long miningStagesId) {

		return getService().fetchMiningApplicationStages(miningStagesId);
	}

	/**
	 * Returns the mining application stages matching the UUID and group.
	 *
	 * @param uuid the mining application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages
		fetchMiningApplicationStagesByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchMiningApplicationStagesByUuidAndGroupId(
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

	public static List<String> getJadscDistinctStages() {
		return getService().getJadscDistinctStages();
	}

	public static Long getJadscSeenCases() {
		return getService().getJadscSeenCases();
	}

	public static String getManufacturingApplicaitonCurrentStages(
		String caseId) {

		return getService().getManufacturingApplicaitonCurrentStages(caseId);
	}

	public static MiningApplicationStages getMining_By_CI(String caseId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getService().getMining_By_CI(caseId);
	}

	public static String getMiningApplicaitonCurrentStages(String caseId) {
		return getService().getMiningApplicaitonCurrentStages(caseId);
	}

	/**
	 * Returns the mining application stages with the primary key.
	 *
	 * @param miningStagesId the primary key of the mining application stages
	 * @return the mining application stages
	 * @throws PortalException if a mining application stages with the primary key could not be found
	 */
	public static MiningApplicationStages getMiningApplicationStages(
			long miningStagesId)
		throws PortalException {

		return getService().getMiningApplicationStages(miningStagesId);
	}

	/**
	 * Returns the mining application stages matching the UUID and group.
	 *
	 * @param uuid the mining application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mining application stages
	 * @throws PortalException if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages
			getMiningApplicationStagesByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getMiningApplicationStagesByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the mining application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @return the range of mining application stageses
	 */
	public static List<MiningApplicationStages> getMiningApplicationStageses(
		int start, int end) {

		return getService().getMiningApplicationStageses(start, end);
	}

	/**
	 * Returns all the mining application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the mining application stageses
	 * @param companyId the primary key of the company
	 * @return the matching mining application stageses, or an empty list if no matches were found
	 */
	public static List<MiningApplicationStages>
		getMiningApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getMiningApplicationStagesesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of mining application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the mining application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching mining application stageses, or an empty list if no matches were found
	 */
	public static List<MiningApplicationStages>
		getMiningApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<MiningApplicationStages> orderByComparator) {

		return getService().getMiningApplicationStagesesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of mining application stageses.
	 *
	 * @return the number of mining application stageses
	 */
	public static int getMiningApplicationStagesesCount() {
		return getService().getMiningApplicationStagesesCount();
	}

	public static List<MiningApplicationStages> getMiningByCI(String caseId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getService().getMiningByCI(caseId);
	}

	public static MiningApplicationStages getMiningByCI_SN(
			String caseId, String stageName)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getService().getMiningByCI_SN(caseId, stageName);
	}

	public static MiningApplicationStages getMiningByCI_ST(
			String caseId, String stageStatus)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getService().getMiningByCI_ST(caseId, stageStatus);
	}

	public static MiningApplicationStages getMiningByCI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getService().getMiningByCI_ST_SN(caseId, stageStatus, stageName);
	}

	public static List<String> getMiningDistinctStages() {
		return getService().getMiningDistinctStages();
	}

	public static Long getMiningSeenCases() {
		return getService().getMiningSeenCases();
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

	public static List<MiningApplicationStages> gtMiningApplicationStages_By_SN(
		String stageName) {

		return getService().gtMiningApplicationStages_By_SN(stageName);
	}

	/**
	 * Updates the mining application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationStages the mining application stages
	 * @return the mining application stages that was updated
	 */
	public static MiningApplicationStages updateMiningApplicationStages(
		MiningApplicationStages miningApplicationStages) {

		return getService().updateMiningApplicationStages(
			miningApplicationStages);
	}

	public static MiningApplicationStages updateMiningApplicationStages(
		String caseId, String stageName, java.util.Date stageStartDate,
		java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateMiningApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static MiningApplicationStagesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MiningApplicationStagesLocalService>
		_serviceSnapshot = new Snapshot<>(
			MiningApplicationStagesLocalServiceUtil.class,
			MiningApplicationStagesLocalService.class);

}