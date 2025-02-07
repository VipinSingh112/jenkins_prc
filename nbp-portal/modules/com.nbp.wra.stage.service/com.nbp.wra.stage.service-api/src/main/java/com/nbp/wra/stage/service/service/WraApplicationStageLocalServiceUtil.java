/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.wra.stage.service.model.WraApplicationStage;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for WraApplicationStage. This utility wraps
 * <code>com.nbp.wra.stage.service.service.impl.WraApplicationStageLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see WraApplicationStageLocalService
 * @generated
 */
public class WraApplicationStageLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.wra.stage.service.service.impl.WraApplicationStageLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the wra application stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraApplicationStage the wra application stage
	 * @return the wra application stage that was added
	 */
	public static WraApplicationStage addWraApplicationStage(
		WraApplicationStage wraApplicationStage) {

		return getService().addWraApplicationStage(wraApplicationStage);
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
	 * Creates a new wra application stage with the primary key. Does not add the wra application stage to the database.
	 *
	 * @param wraApplicationStageId the primary key for the new wra application stage
	 * @return the new wra application stage
	 */
	public static WraApplicationStage createWraApplicationStage(
		long wraApplicationStageId) {

		return getService().createWraApplicationStage(wraApplicationStageId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the wra application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraApplicationStageId the primary key of the wra application stage
	 * @return the wra application stage that was removed
	 * @throws PortalException if a wra application stage with the primary key could not be found
	 */
	public static WraApplicationStage deleteWraApplicationStage(
			long wraApplicationStageId)
		throws PortalException {

		return getService().deleteWraApplicationStage(wraApplicationStageId);
	}

	/**
	 * Deletes the wra application stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraApplicationStage the wra application stage
	 * @return the wra application stage that was removed
	 */
	public static WraApplicationStage deleteWraApplicationStage(
		WraApplicationStage wraApplicationStage) {

		return getService().deleteWraApplicationStage(wraApplicationStage);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraApplicationStageModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraApplicationStageModelImpl</code>.
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

	public static WraApplicationStage fetchWraApplicationStage(
		long wraApplicationStageId) {

		return getService().fetchWraApplicationStage(wraApplicationStageId);
	}

	/**
	 * Returns the wra application stage matching the UUID and group.
	 *
	 * @param uuid the wra application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public static WraApplicationStage fetchWraApplicationStageByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchWraApplicationStageByUuidAndGroupId(
			uuid, groupId);
	}

	public static WraApplicationStage get_WRA_Stage_By_CI(String caseId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getService().get_WRA_Stage_By_CI(caseId);
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

	public static String getWraApplicationCurrentStages(String caseId) {
		return getService().getWraApplicationCurrentStages(caseId);
	}

	/**
	 * Returns the wra application stage with the primary key.
	 *
	 * @param wraApplicationStageId the primary key of the wra application stage
	 * @return the wra application stage
	 * @throws PortalException if a wra application stage with the primary key could not be found
	 */
	public static WraApplicationStage getWraApplicationStage(
			long wraApplicationStageId)
		throws PortalException {

		return getService().getWraApplicationStage(wraApplicationStageId);
	}

	public static WraApplicationStage getWraApplicationStage_By_CI(
		String stageName) {

		return getService().getWraApplicationStage_By_CI(stageName);
	}

	/**
	 * Returns the wra application stage matching the UUID and group.
	 *
	 * @param uuid the wra application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching wra application stage
	 * @throws PortalException if a matching wra application stage could not be found
	 */
	public static WraApplicationStage getWraApplicationStageByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getWraApplicationStageByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the wra application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @return the range of wra application stages
	 */
	public static List<WraApplicationStage> getWraApplicationStages(
		int start, int end) {

		return getService().getWraApplicationStages(start, end);
	}

	/**
	 * Returns all the wra application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the wra application stages
	 * @param companyId the primary key of the company
	 * @return the matching wra application stages, or an empty list if no matches were found
	 */
	public static List<WraApplicationStage>
		getWraApplicationStagesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getWraApplicationStagesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of wra application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the wra application stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching wra application stages, or an empty list if no matches were found
	 */
	public static List<WraApplicationStage>
		getWraApplicationStagesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<WraApplicationStage> orderByComparator) {

		return getService().getWraApplicationStagesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of wra application stages.
	 *
	 * @return the number of wra application stages
	 */
	public static int getWraApplicationStagesCount() {
		return getService().getWraApplicationStagesCount();
	}

	public static List<WraApplicationStage> getWraByCI(String caseId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getService().getWraByCI(caseId);
	}

	public static WraApplicationStage getWraByCI_SN(
			String caseId, String stageName)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getService().getWraByCI_SN(caseId, stageName);
	}

	public static WraApplicationStage getWraByCI_ST(
			String caseId, String stageStatus)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getService().getWraByCI_ST(caseId, stageStatus);
	}

	public static WraApplicationStage getWraByCI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getService().getWraByCI_ST_SN(caseId, stageStatus, stageName);
	}

	public static List<String> getWRADistinctStages() {
		return getService().getWRADistinctStages();
	}

	public static Long getWRASeenCases() {
		return getService().getWRASeenCases();
	}

	public static List<WraApplicationStage> gtWraApplicationStage_By_SN(
		String stageName) {

		return getService().gtWraApplicationStage_By_SN(stageName);
	}

	public static WraApplicationStage updateWraApplicationStage(
		String caseId, String stageName, java.util.Date stageStartDate,
		java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateWraApplicationStage(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	/**
	 * Updates the wra application stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraApplicationStage the wra application stage
	 * @return the wra application stage that was updated
	 */
	public static WraApplicationStage updateWraApplicationStage(
		WraApplicationStage wraApplicationStage) {

		return getService().updateWraApplicationStage(wraApplicationStage);
	}

	public static WraApplicationStageLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<WraApplicationStageLocalService>
		_serviceSnapshot = new Snapshot<>(
			WraApplicationStageLocalServiceUtil.class,
			WraApplicationStageLocalService.class);

}