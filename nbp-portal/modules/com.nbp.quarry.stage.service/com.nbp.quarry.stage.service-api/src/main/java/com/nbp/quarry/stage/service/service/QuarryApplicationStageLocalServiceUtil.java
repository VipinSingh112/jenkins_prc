/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quarry.stage.service.model.QuarryApplicationStage;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for QuarryApplicationStage. This utility wraps
 * <code>com.nbp.quarry.stage.service.service.impl.QuarryApplicationStageLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationStageLocalService
 * @generated
 */
public class QuarryApplicationStageLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.quarry.stage.service.service.impl.QuarryApplicationStageLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the quarry application stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationStage the quarry application stage
	 * @return the quarry application stage that was added
	 */
	public static QuarryApplicationStage addQuarryApplicationStage(
		QuarryApplicationStage quarryApplicationStage) {

		return getService().addQuarryApplicationStage(quarryApplicationStage);
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
	 * Creates a new quarry application stage with the primary key. Does not add the quarry application stage to the database.
	 *
	 * @param quarryAppStagesId the primary key for the new quarry application stage
	 * @return the new quarry application stage
	 */
	public static QuarryApplicationStage createQuarryApplicationStage(
		long quarryAppStagesId) {

		return getService().createQuarryApplicationStage(quarryAppStagesId);
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
	 * Deletes the quarry application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryAppStagesId the primary key of the quarry application stage
	 * @return the quarry application stage that was removed
	 * @throws PortalException if a quarry application stage with the primary key could not be found
	 */
	public static QuarryApplicationStage deleteQuarryApplicationStage(
			long quarryAppStagesId)
		throws PortalException {

		return getService().deleteQuarryApplicationStage(quarryAppStagesId);
	}

	/**
	 * Deletes the quarry application stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationStage the quarry application stage
	 * @return the quarry application stage that was removed
	 */
	public static QuarryApplicationStage deleteQuarryApplicationStage(
		QuarryApplicationStage quarryApplicationStage) {

		return getService().deleteQuarryApplicationStage(
			quarryApplicationStage);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryApplicationStageModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryApplicationStageModelImpl</code>.
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

	public static QuarryApplicationStage fetchQuarryApplicationStage(
		long quarryAppStagesId) {

		return getService().fetchQuarryApplicationStage(quarryAppStagesId);
	}

	/**
	 * Returns the quarry application stage matching the UUID and group.
	 *
	 * @param uuid the quarry application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage
		fetchQuarryApplicationStageByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchQuarryApplicationStageByUuidAndGroupId(
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

	public static List<String> getFilmDistinctStages() {
		return getService().getFilmDistinctStages();
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
	 * Returns the quarry application stage with the primary key.
	 *
	 * @param quarryAppStagesId the primary key of the quarry application stage
	 * @return the quarry application stage
	 * @throws PortalException if a quarry application stage with the primary key could not be found
	 */
	public static QuarryApplicationStage getQuarryApplicationStage(
			long quarryAppStagesId)
		throws PortalException {

		return getService().getQuarryApplicationStage(quarryAppStagesId);
	}

	/**
	 * Returns the quarry application stage matching the UUID and group.
	 *
	 * @param uuid the quarry application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching quarry application stage
	 * @throws PortalException if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage
			getQuarryApplicationStageByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getQuarryApplicationStageByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the quarry application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @return the range of quarry application stages
	 */
	public static List<QuarryApplicationStage> getQuarryApplicationStages(
		int start, int end) {

		return getService().getQuarryApplicationStages(start, end);
	}

	/**
	 * Returns all the quarry application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the quarry application stages
	 * @param companyId the primary key of the company
	 * @return the matching quarry application stages, or an empty list if no matches were found
	 */
	public static List<QuarryApplicationStage>
		getQuarryApplicationStagesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getQuarryApplicationStagesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of quarry application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the quarry application stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching quarry application stages, or an empty list if no matches were found
	 */
	public static List<QuarryApplicationStage>
		getQuarryApplicationStagesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<QuarryApplicationStage> orderByComparator) {

		return getService().getQuarryApplicationStagesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of quarry application stages.
	 *
	 * @return the number of quarry application stages
	 */
	public static int getQuarryApplicationStagesCount() {
		return getService().getQuarryApplicationStagesCount();
	}

	public static List<QuarryApplicationStage> getQuarryByCI(String caseId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getService().getQuarryByCI(caseId);
	}

	public static QuarryApplicationStage getQuarryByCI_SN(
			String caseId, String stageName)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getService().getQuarryByCI_SN(caseId, stageName);
	}

	public static QuarryApplicationStage getQuarryByCI_ST(
			String caseId, String stageStatus)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getService().getQuarryByCI_ST(caseId, stageStatus);
	}

	public static QuarryApplicationStage getQuarryByCI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getService().getQuarryByCI_ST_SN(caseId, stageStatus, stageName);
	}

	public static QuarryApplicationStage getQuarryByCId(String caseId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getService().getQuarryByCId(caseId);
	}

	public static List<String> getQuarryDistinctStages() {
		return getService().getQuarryDistinctStages();
	}

	public static Long getQuarrySeenCases() {
		return getService().getQuarrySeenCases();
	}

	public static List<QuarryApplicationStage> gtQuarryApplicationStage_By_SN(
		String stageName) {

		return getService().gtQuarryApplicationStage_By_SN(stageName);
	}

	/**
	 * Updates the quarry application stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationStage the quarry application stage
	 * @return the quarry application stage that was updated
	 */
	public static QuarryApplicationStage updateQuarryApplicationStage(
		QuarryApplicationStage quarryApplicationStage) {

		return getService().updateQuarryApplicationStage(
			quarryApplicationStage);
	}

	public static QuarryApplicationStage updateQuarryApplicationStage(
		String caseId, String stageName, java.util.Date stageStartDate,
		java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateQuarryApplicationStage(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static QuarryApplicationStageLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<QuarryApplicationStageLocalService>
		_serviceSnapshot = new Snapshot<>(
			QuarryApplicationStageLocalServiceUtil.class,
			QuarryApplicationStageLocalService.class);

}