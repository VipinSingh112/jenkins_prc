/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.factories.registration.stage.services.model.FactoriesApplicationStage;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FactoriesApplicationStage. This utility wraps
 * <code>com.nbp.factories.registration.stage.services.service.impl.FactoriesApplicationStageLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesApplicationStageLocalService
 * @generated
 */
public class FactoriesApplicationStageLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.factories.registration.stage.services.service.impl.FactoriesApplicationStageLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the factories application stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesApplicationStage the factories application stage
	 * @return the factories application stage that was added
	 */
	public static FactoriesApplicationStage addFactoriesApplicationStage(
		FactoriesApplicationStage factoriesApplicationStage) {

		return getService().addFactoriesApplicationStage(
			factoriesApplicationStage);
	}

	/**
	 * Creates a new factories application stage with the primary key. Does not add the factories application stage to the database.
	 *
	 * @param factoriesApplicationStageId the primary key for the new factories application stage
	 * @return the new factories application stage
	 */
	public static FactoriesApplicationStage createFactoriesApplicationStage(
		long factoriesApplicationStageId) {

		return getService().createFactoriesApplicationStage(
			factoriesApplicationStageId);
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
	 * Deletes the factories application stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesApplicationStage the factories application stage
	 * @return the factories application stage that was removed
	 */
	public static FactoriesApplicationStage deleteFactoriesApplicationStage(
		FactoriesApplicationStage factoriesApplicationStage) {

		return getService().deleteFactoriesApplicationStage(
			factoriesApplicationStage);
	}

	/**
	 * Deletes the factories application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesApplicationStageId the primary key of the factories application stage
	 * @return the factories application stage that was removed
	 * @throws PortalException if a factories application stage with the primary key could not be found
	 */
	public static FactoriesApplicationStage deleteFactoriesApplicationStage(
			long factoriesApplicationStageId)
		throws PortalException {

		return getService().deleteFactoriesApplicationStage(
			factoriesApplicationStageId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesApplicationStageModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesApplicationStageModelImpl</code>.
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

	public static FactoriesApplicationStage fetchFactoriesApplicationStage(
		long factoriesApplicationStageId) {

		return getService().fetchFactoriesApplicationStage(
			factoriesApplicationStageId);
	}

	/**
	 * Returns the factories application stage matching the UUID and group.
	 *
	 * @param uuid the factories application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage
		fetchFactoriesApplicationStageByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchFactoriesApplicationStageByUuidAndGroupId(
			uuid, groupId);
	}

	public static FactoriesApplicationStage get_Factories_By_CaseId(
			String caseId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getService().get_Factories_By_CaseId(caseId);
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

	public static FactoriesApplicationStage getFactories_By_AI(
			long factoriesApplicationId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getService().getFactories_By_AI(factoriesApplicationId);
	}

	public static List<FactoriesApplicationStage> getFactories_By_CaseId(
		String caseId) {

		return getService().getFactories_By_CaseId(caseId);
	}

	public static FactoriesApplicationStage getFactories_By_CaseIdAndStatus(
			String caseId, String status)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getService().getFactories_By_CaseIdAndStatus(caseId, status);
	}

	public static FactoriesApplicationStage getFactories_By_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getService().getFactories_By_CaseIdStageName(caseId, stageName);
	}

	public static FactoriesApplicationStage getFactories_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getService().getFactories_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	public static List<FactoriesApplicationStage> getFactories_By_StageName(
		String stageName) {

		return getService().getFactories_By_StageName(stageName);
	}

	/**
	 * Returns the factories application stage with the primary key.
	 *
	 * @param factoriesApplicationStageId the primary key of the factories application stage
	 * @return the factories application stage
	 * @throws PortalException if a factories application stage with the primary key could not be found
	 */
	public static FactoriesApplicationStage getFactoriesApplicationStage(
			long factoriesApplicationStageId)
		throws PortalException {

		return getService().getFactoriesApplicationStage(
			factoriesApplicationStageId);
	}

	/**
	 * Returns the factories application stage matching the UUID and group.
	 *
	 * @param uuid the factories application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching factories application stage
	 * @throws PortalException if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage
			getFactoriesApplicationStageByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getFactoriesApplicationStageByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the factories application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @return the range of factories application stages
	 */
	public static List<FactoriesApplicationStage> getFactoriesApplicationStages(
		int start, int end) {

		return getService().getFactoriesApplicationStages(start, end);
	}

	/**
	 * Returns all the factories application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the factories application stages
	 * @param companyId the primary key of the company
	 * @return the matching factories application stages, or an empty list if no matches were found
	 */
	public static List<FactoriesApplicationStage>
		getFactoriesApplicationStagesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getFactoriesApplicationStagesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of factories application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the factories application stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching factories application stages, or an empty list if no matches were found
	 */
	public static List<FactoriesApplicationStage>
		getFactoriesApplicationStagesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		return getService().getFactoriesApplicationStagesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of factories application stages.
	 *
	 * @return the number of factories application stages
	 */
	public static int getFactoriesApplicationStagesCount() {
		return getService().getFactoriesApplicationStagesCount();
	}

	public static String getfactoriesCurrentStage(String caseId) {
		return getService().getfactoriesCurrentStage(caseId);
	}

	public static List<String> getFactoriesDistinctStages() {
		return getService().getFactoriesDistinctStages();
	}

	public static Long getFactoriesSeenCases() {
		return getService().getFactoriesSeenCases();
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
	 * Updates the factories application stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesApplicationStage the factories application stage
	 * @return the factories application stage that was updated
	 */
	public static FactoriesApplicationStage updateFactoriesApplicationStage(
		FactoriesApplicationStage factoriesApplicationStage) {

		return getService().updateFactoriesApplicationStage(
			factoriesApplicationStage);
	}

	public static FactoriesApplicationStage updateFactoriesApplicationStage(
		String caseId, String stageName, java.util.Date stageStartDate,
		java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateFactoriesApplicationStage(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static FactoriesApplicationStageLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FactoriesApplicationStageLocalService>
		_serviceSnapshot = new Snapshot<>(
			FactoriesApplicationStageLocalServiceUtil.class,
			FactoriesApplicationStageLocalService.class);

}