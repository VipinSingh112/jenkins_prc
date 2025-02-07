/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.npm.cannabis.application.stages.services.model.CannabisApplicationStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CannabisApplicationStages. This utility wraps
 * <code>com.npm.cannabis.application.stages.services.service.impl.CannabisApplicationStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationStagesLocalService
 * @generated
 */
public class CannabisApplicationStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.npm.cannabis.application.stages.services.service.impl.CannabisApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the cannabis application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationStages the cannabis application stages
	 * @return the cannabis application stages that was added
	 */
	public static CannabisApplicationStages addCannabisApplicationStages(
		CannabisApplicationStages cannabisApplicationStages) {

		return getService().addCannabisApplicationStages(
			cannabisApplicationStages);
	}

	/**
	 * Creates a new cannabis application stages with the primary key. Does not add the cannabis application stages to the database.
	 *
	 * @param cannabisApplicationstageId the primary key for the new cannabis application stages
	 * @return the new cannabis application stages
	 */
	public static CannabisApplicationStages createCannabisApplicationStages(
		long cannabisApplicationstageId) {

		return getService().createCannabisApplicationStages(
			cannabisApplicationstageId);
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
	 * Deletes the cannabis application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationStages the cannabis application stages
	 * @return the cannabis application stages that was removed
	 */
	public static CannabisApplicationStages deleteCannabisApplicationStages(
		CannabisApplicationStages cannabisApplicationStages) {

		return getService().deleteCannabisApplicationStages(
			cannabisApplicationStages);
	}

	/**
	 * Deletes the cannabis application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationstageId the primary key of the cannabis application stages
	 * @return the cannabis application stages that was removed
	 * @throws PortalException if a cannabis application stages with the primary key could not be found
	 */
	public static CannabisApplicationStages deleteCannabisApplicationStages(
			long cannabisApplicationstageId)
		throws PortalException {

		return getService().deleteCannabisApplicationStages(
			cannabisApplicationstageId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationStagesModelImpl</code>.
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

	public static CannabisApplicationStages fetchCannabisApplicationStages(
		long cannabisApplicationstageId) {

		return getService().fetchCannabisApplicationStages(
			cannabisApplicationstageId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static CannabisApplicationStages getCannabisApplicationStage(
			String caseId, String stageName)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getService().getCannabisApplicationStage(caseId, stageName);
	}

	public static CannabisApplicationStages getCannabisApplicationStage(
			String caseId, String stageName, String stageStatus)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getService().getCannabisApplicationStage(
			caseId, stageName, stageStatus);
	}

	public static List<CannabisApplicationStages>
			getCannabisApplicationStageName(String stageName)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getService().getCannabisApplicationStageName(stageName);
	}

	/**
	 * Returns the cannabis application stages with the primary key.
	 *
	 * @param cannabisApplicationstageId the primary key of the cannabis application stages
	 * @return the cannabis application stages
	 * @throws PortalException if a cannabis application stages with the primary key could not be found
	 */
	public static CannabisApplicationStages getCannabisApplicationStages(
			long cannabisApplicationstageId)
		throws PortalException {

		return getService().getCannabisApplicationStages(
			cannabisApplicationstageId);
	}

	public static List<CannabisApplicationStages> getCannabisApplicationStages(
			String caseId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getService().getCannabisApplicationStages(caseId);
	}

	public static CannabisApplicationStages
			getCannabisApplicationStagesAndStatus(
				String caseId, String stageStatus)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getService().getCannabisApplicationStagesAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns a range of all the cannabis application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @return the range of cannabis application stageses
	 */
	public static List<CannabisApplicationStages>
		getCannabisApplicationStageses(int start, int end) {

		return getService().getCannabisApplicationStageses(start, end);
	}

	/**
	 * Returns the number of cannabis application stageses.
	 *
	 * @return the number of cannabis application stageses
	 */
	public static int getCannabisApplicationStagesesCount() {
		return getService().getCannabisApplicationStagesesCount();
	}

	public static String getCannabisCurrentStages(String caseId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getService().getCannabisCurrentStages(caseId);
	}

	public static List<String> getCannabisDistinctStages() {
		return getService().getCannabisDistinctStages();
	}

	public static Long getCannabisSeenCases() {
		return getService().getCannabisSeenCases();
	}

	public static List<CannabisApplicationStages> getCAS_StageName_StageStatus(
			String stageName, String status)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getService().getCAS_StageName_StageStatus(stageName, status);
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
	 * Updates the cannabis application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationStages the cannabis application stages
	 * @return the cannabis application stages that was updated
	 */
	public static CannabisApplicationStages updateCannabisApplicationStages(
		CannabisApplicationStages cannabisApplicationStages) {

		return getService().updateCannabisApplicationStages(
			cannabisApplicationStages);
	}

	public static CannabisApplicationStages updateCannabisApplicationStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getService().updateCannabisApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static CannabisApplicationStagesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CannabisApplicationStagesLocalService>
		_serviceSnapshot = new Snapshot<>(
			CannabisApplicationStagesLocalServiceUtil.class,
			CannabisApplicationStagesLocalService.class);

}