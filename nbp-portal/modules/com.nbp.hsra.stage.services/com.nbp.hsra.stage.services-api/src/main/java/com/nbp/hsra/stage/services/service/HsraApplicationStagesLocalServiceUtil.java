/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.stage.services.model.HsraApplicationStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for HsraApplicationStages. This utility wraps
 * <code>com.nbp.hsra.stage.services.service.impl.HsraApplicationStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationStagesLocalService
 * @generated
 */
public class HsraApplicationStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.hsra.stage.services.service.impl.HsraApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the hsra application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationStages the hsra application stages
	 * @return the hsra application stages that was added
	 */
	public static HsraApplicationStages addHsraApplicationStages(
		HsraApplicationStages hsraApplicationStages) {

		return getService().addHsraApplicationStages(hsraApplicationStages);
	}

	/**
	 * Creates a new hsra application stages with the primary key. Does not add the hsra application stages to the database.
	 *
	 * @param hsraApplicationStagesId the primary key for the new hsra application stages
	 * @return the new hsra application stages
	 */
	public static HsraApplicationStages createHsraApplicationStages(
		long hsraApplicationStagesId) {

		return getService().createHsraApplicationStages(
			hsraApplicationStagesId);
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
	 * Deletes the hsra application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationStages the hsra application stages
	 * @return the hsra application stages that was removed
	 */
	public static HsraApplicationStages deleteHsraApplicationStages(
		HsraApplicationStages hsraApplicationStages) {

		return getService().deleteHsraApplicationStages(hsraApplicationStages);
	}

	/**
	 * Deletes the hsra application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationStagesId the primary key of the hsra application stages
	 * @return the hsra application stages that was removed
	 * @throws PortalException if a hsra application stages with the primary key could not be found
	 */
	public static HsraApplicationStages deleteHsraApplicationStages(
			long hsraApplicationStagesId)
		throws PortalException {

		return getService().deleteHsraApplicationStages(
			hsraApplicationStagesId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HsraApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HsraApplicationStagesModelImpl</code>.
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

	public static HsraApplicationStages fetchHsraApplicationStages(
		long hsraApplicationStagesId) {

		return getService().fetchHsraApplicationStages(hsraApplicationStagesId);
	}

	/**
	 * Returns the hsra application stages matching the UUID and group.
	 *
	 * @param uuid the hsra application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages
		fetchHsraApplicationStagesByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchHsraApplicationStagesByUuidAndGroupId(
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

	public static HsraApplicationStages getHsraApp_By_CI(String caseId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getService().getHsraApp_By_CI(caseId);
	}

	public static String getHsraApplicaitonCurrentStages(String caseId) {
		return getService().getHsraApplicaitonCurrentStages(caseId);
	}

	/**
	 * Returns the hsra application stages with the primary key.
	 *
	 * @param hsraApplicationStagesId the primary key of the hsra application stages
	 * @return the hsra application stages
	 * @throws PortalException if a hsra application stages with the primary key could not be found
	 */
	public static HsraApplicationStages getHsraApplicationStages(
			long hsraApplicationStagesId)
		throws PortalException {

		return getService().getHsraApplicationStages(hsraApplicationStagesId);
	}

	/**
	 * Returns the hsra application stages matching the UUID and group.
	 *
	 * @param uuid the hsra application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching hsra application stages
	 * @throws PortalException if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages
			getHsraApplicationStagesByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getHsraApplicationStagesByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the hsra application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @return the range of hsra application stageses
	 */
	public static List<HsraApplicationStages> getHsraApplicationStageses(
		int start, int end) {

		return getService().getHsraApplicationStageses(start, end);
	}

	/**
	 * Returns all the hsra application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the hsra application stageses
	 * @param companyId the primary key of the company
	 * @return the matching hsra application stageses, or an empty list if no matches were found
	 */
	public static List<HsraApplicationStages>
		getHsraApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getHsraApplicationStagesesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of hsra application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the hsra application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching hsra application stageses, or an empty list if no matches were found
	 */
	public static List<HsraApplicationStages>
		getHsraApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<HsraApplicationStages> orderByComparator) {

		return getService().getHsraApplicationStagesesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of hsra application stageses.
	 *
	 * @return the number of hsra application stageses
	 */
	public static int getHsraApplicationStagesesCount() {
		return getService().getHsraApplicationStagesesCount();
	}

	public static List<HsraApplicationStages> getHsraByCI(String caseId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getService().getHsraByCI(caseId);
	}

	public static HsraApplicationStages getHsraByCI_SN(
			String caseId, String stageName)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getService().getHsraByCI_SN(caseId, stageName);
	}

	public static HsraApplicationStages getHsraByCI_ST(
			String caseId, String stageStatus)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getService().getHsraByCI_ST(caseId, stageStatus);
	}

	public static HsraApplicationStages getHsraByCI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getService().getHsraByCI_ST_SN(caseId, stageStatus, stageName);
	}

	public static List<String> getHsraDistinctStages() {
		return getService().getHsraDistinctStages();
	}

	public static Long getHsraSeenCases() {
		return getService().getHsraSeenCases();
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

	public static List<HsraApplicationStages> gtHsraApplicationStages_By_SN(
		String stageName) {

		return getService().gtHsraApplicationStages_By_SN(stageName);
	}

	/**
	 * Updates the hsra application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationStages the hsra application stages
	 * @return the hsra application stages that was updated
	 */
	public static HsraApplicationStages updateHsraApplicationStages(
		HsraApplicationStages hsraApplicationStages) {

		return getService().updateHsraApplicationStages(hsraApplicationStages);
	}

	public static HsraApplicationStages updateHsraApplicationStages(
		String caseId, String stageName, java.util.Date stageStartDate,
		java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateHsraApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static HsraApplicationStagesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<HsraApplicationStagesLocalService>
		_serviceSnapshot = new Snapshot<>(
			HsraApplicationStagesLocalServiceUtil.class,
			HsraApplicationStagesLocalService.class);

}