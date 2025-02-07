/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FireBrigadeApplicationStage. This utility wraps
 * <code>com.nbp.fire.brigade.stage.service.service.impl.FireBrigadeApplicationStageLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeApplicationStageLocalService
 * @generated
 */
public class FireBrigadeApplicationStageLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.fire.brigade.stage.service.service.impl.FireBrigadeApplicationStageLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the fire brigade application stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeApplicationStage the fire brigade application stage
	 * @return the fire brigade application stage that was added
	 */
	public static FireBrigadeApplicationStage addFireBrigadeApplicationStage(
		FireBrigadeApplicationStage fireBrigadeApplicationStage) {

		return getService().addFireBrigadeApplicationStage(
			fireBrigadeApplicationStage);
	}

	/**
	 * Creates a new fire brigade application stage with the primary key. Does not add the fire brigade application stage to the database.
	 *
	 * @param fireBrigadeAppStageId the primary key for the new fire brigade application stage
	 * @return the new fire brigade application stage
	 */
	public static FireBrigadeApplicationStage createFireBrigadeApplicationStage(
		long fireBrigadeAppStageId) {

		return getService().createFireBrigadeApplicationStage(
			fireBrigadeAppStageId);
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
	 * Deletes the fire brigade application stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeApplicationStage the fire brigade application stage
	 * @return the fire brigade application stage that was removed
	 */
	public static FireBrigadeApplicationStage deleteFireBrigadeApplicationStage(
		FireBrigadeApplicationStage fireBrigadeApplicationStage) {

		return getService().deleteFireBrigadeApplicationStage(
			fireBrigadeApplicationStage);
	}

	/**
	 * Deletes the fire brigade application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeAppStageId the primary key of the fire brigade application stage
	 * @return the fire brigade application stage that was removed
	 * @throws PortalException if a fire brigade application stage with the primary key could not be found
	 */
	public static FireBrigadeApplicationStage deleteFireBrigadeApplicationStage(
			long fireBrigadeAppStageId)
		throws PortalException {

		return getService().deleteFireBrigadeApplicationStage(
			fireBrigadeAppStageId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeApplicationStageModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeApplicationStageModelImpl</code>.
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

	public static FireBrigadeApplicationStage fetchFireBrigadeApplicationStage(
		long fireBrigadeAppStageId) {

		return getService().fetchFireBrigadeApplicationStage(
			fireBrigadeAppStageId);
	}

	/**
	 * Returns the fire brigade application stage matching the UUID and group.
	 *
	 * @param uuid the fire brigade application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage
		fetchFireBrigadeApplicationStageByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchFireBrigadeApplicationStageByUuidAndGroupId(
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

	public static List<String> getFBDistinctStages() {
		return getService().getFBDistinctStages();
	}

	public static Long getFBSeenCases() {
		return getService().getFBSeenCases();
	}

	public static FireBrigadeApplicationStage getFireBrigade_By_StageStatus(
			String stageStatus)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getService().getFireBrigade_By_StageStatus(stageStatus);
	}

	public static FireBrigadeApplicationStage getFireBrigade_ByCI_SN(
			String caseId, String stageName)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getService().getFireBrigade_ByCI_SN(caseId, stageName);
	}

	public static FireBrigadeApplicationStage getFireBrigade_ByCI_SN_SS(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getService().getFireBrigade_ByCI_SN_SS(
			caseId, stageName, stageStatus);
	}

	public static FireBrigadeApplicationStage getFireBrigade_ByCI_SS(
			String caseId, String stageStatus)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getService().getFireBrigade_ByCI_SS(caseId, stageStatus);
	}

	public static List<FireBrigadeApplicationStage> getFireBrigade_BySN(
		String stageName) {

		return getService().getFireBrigade_BySN(stageName);
	}

	/**
	 * Returns the fire brigade application stage with the primary key.
	 *
	 * @param fireBrigadeAppStageId the primary key of the fire brigade application stage
	 * @return the fire brigade application stage
	 * @throws PortalException if a fire brigade application stage with the primary key could not be found
	 */
	public static FireBrigadeApplicationStage getFireBrigadeApplicationStage(
			long fireBrigadeAppStageId)
		throws PortalException {

		return getService().getFireBrigadeApplicationStage(
			fireBrigadeAppStageId);
	}

	/**
	 * Returns the fire brigade application stage matching the UUID and group.
	 *
	 * @param uuid the fire brigade application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching fire brigade application stage
	 * @throws PortalException if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage
			getFireBrigadeApplicationStageByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getFireBrigadeApplicationStageByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the fire brigade application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @return the range of fire brigade application stages
	 */
	public static List<FireBrigadeApplicationStage>
		getFireBrigadeApplicationStages(int start, int end) {

		return getService().getFireBrigadeApplicationStages(start, end);
	}

	/**
	 * Returns all the fire brigade application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the fire brigade application stages
	 * @param companyId the primary key of the company
	 * @return the matching fire brigade application stages, or an empty list if no matches were found
	 */
	public static List<FireBrigadeApplicationStage>
		getFireBrigadeApplicationStagesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getFireBrigadeApplicationStagesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of fire brigade application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the fire brigade application stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching fire brigade application stages, or an empty list if no matches were found
	 */
	public static List<FireBrigadeApplicationStage>
		getFireBrigadeApplicationStagesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		return getService().getFireBrigadeApplicationStagesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of fire brigade application stages.
	 *
	 * @return the number of fire brigade application stages
	 */
	public static int getFireBrigadeApplicationStagesCount() {
		return getService().getFireBrigadeApplicationStagesCount();
	}

	public static List<FireBrigadeApplicationStage> getFireBrigadeByCaseId(
		String caseId) {

		return getService().getFireBrigadeByCaseId(caseId);
	}

	public static FireBrigadeApplicationStage getFireBrigadeByCI(String caseId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getService().getFireBrigadeByCI(caseId);
	}

	public static String getFireBrigadeCurrentStages(String caseId) {
		return getService().getFireBrigadeCurrentStages(caseId);
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
	 * Updates the fire brigade application stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeApplicationStage the fire brigade application stage
	 * @return the fire brigade application stage that was updated
	 */
	public static FireBrigadeApplicationStage updateFireBrigadeApplicationStage(
		FireBrigadeApplicationStage fireBrigadeApplicationStage) {

		return getService().updateFireBrigadeApplicationStage(
			fireBrigadeApplicationStage);
	}

	public static FireBrigadeApplicationStage updateFireBrigadeAppStage(
		String caseId, String stageName, String stageStatus,
		java.util.Date stageStartDate, java.util.Date stageEndDate,
		String duration) {

		return getService().updateFireBrigadeAppStage(
			caseId, stageName, stageStatus, stageStartDate, stageEndDate,
			duration);
	}

	public static FireBrigadeApplicationStageLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FireBrigadeApplicationStageLocalService>
		_serviceSnapshot = new Snapshot<>(
			FireBrigadeApplicationStageLocalServiceUtil.class,
			FireBrigadeApplicationStageLocalService.class);

}