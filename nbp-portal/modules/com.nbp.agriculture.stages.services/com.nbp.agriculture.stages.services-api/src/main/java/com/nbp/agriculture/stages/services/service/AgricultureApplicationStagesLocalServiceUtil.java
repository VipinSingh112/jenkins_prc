/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.agriculture.stages.services.model.AgricultureApplicationStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AgricultureApplicationStages. This utility wraps
 * <code>com.nbp.agriculture.stages.services.service.impl.AgricultureApplicationStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApplicationStagesLocalService
 * @generated
 */
public class AgricultureApplicationStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.agriculture.stages.services.service.impl.AgricultureApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the agriculture application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureApplicationStages the agriculture application stages
	 * @return the agriculture application stages that was added
	 */
	public static AgricultureApplicationStages addAgricultureApplicationStages(
		AgricultureApplicationStages agricultureApplicationStages) {

		return getService().addAgricultureApplicationStages(
			agricultureApplicationStages);
	}

	/**
	 * Creates a new agriculture application stages with the primary key. Does not add the agriculture application stages to the database.
	 *
	 * @param agricultureApplicationstageId the primary key for the new agriculture application stages
	 * @return the new agriculture application stages
	 */
	public static AgricultureApplicationStages
		createAgricultureApplicationStages(long agricultureApplicationstageId) {

		return getService().createAgricultureApplicationStages(
			agricultureApplicationstageId);
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
	 * Deletes the agriculture application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureApplicationStages the agriculture application stages
	 * @return the agriculture application stages that was removed
	 */
	public static AgricultureApplicationStages
		deleteAgricultureApplicationStages(
			AgricultureApplicationStages agricultureApplicationStages) {

		return getService().deleteAgricultureApplicationStages(
			agricultureApplicationStages);
	}

	/**
	 * Deletes the agriculture application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureApplicationstageId the primary key of the agriculture application stages
	 * @return the agriculture application stages that was removed
	 * @throws PortalException if a agriculture application stages with the primary key could not be found
	 */
	public static AgricultureApplicationStages
			deleteAgricultureApplicationStages(
				long agricultureApplicationstageId)
		throws PortalException {

		return getService().deleteAgricultureApplicationStages(
			agricultureApplicationstageId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.agriculture.stages.services.model.impl.AgricultureApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.agriculture.stages.services.model.impl.AgricultureApplicationStagesModelImpl</code>.
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

	public static AgricultureApplicationStages
		fetchAgricultureApplicationStages(long agricultureApplicationstageId) {

		return getService().fetchAgricultureApplicationStages(
			agricultureApplicationstageId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<AgricultureApplicationStages>
			getAgricultureApplicationByCaseId(String caseId)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getService().getAgricultureApplicationByCaseId(caseId);
	}

	public static AgricultureApplicationStages
			getAgricultureApplicationCaseIdStatus(String caseId, String status)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getService().getAgricultureApplicationCaseIdStatus(
			caseId, status);
	}

	public static String getAgricultureApplicationCurrentStages(String caseId) {
		return getService().getAgricultureApplicationCurrentStages(caseId);
	}

	/**
	 * Returns the agriculture application stages with the primary key.
	 *
	 * @param agricultureApplicationstageId the primary key of the agriculture application stages
	 * @return the agriculture application stages
	 * @throws PortalException if a agriculture application stages with the primary key could not be found
	 */
	public static AgricultureApplicationStages getAgricultureApplicationStages(
			long agricultureApplicationstageId)
		throws PortalException {

		return getService().getAgricultureApplicationStages(
			agricultureApplicationstageId);
	}

	public static AgricultureApplicationStages getAgricultureApplicationStages(
			String caseId, String stageName)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getService().getAgricultureApplicationStages(caseId, stageName);
	}

	public static AgricultureApplicationStages
			getAgricultureApplicationStagesBY_SN_SS_CI(
				String caseId, String stageName, String stageStatus)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getService().getAgricultureApplicationStagesBY_SN_SS_CI(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns a range of all the agriculture application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.agriculture.stages.services.model.impl.AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @return the range of agriculture application stageses
	 */
	public static List<AgricultureApplicationStages>
		getAgricultureApplicationStageses(int start, int end) {

		return getService().getAgricultureApplicationStageses(start, end);
	}

	/**
	 * Returns the number of agriculture application stageses.
	 *
	 * @return the number of agriculture application stageses
	 */
	public static int getAgricultureApplicationStagesesCount() {
		return getService().getAgricultureApplicationStagesesCount();
	}

	public static List<String> getAgricultureDistinctStages() {
		return getService().getAgricultureDistinctStages();
	}

	public static Long getAgricultureSeenCases() {
		return getService().getAgricultureSeenCases();
	}

	public static List<AgricultureApplicationStages> getAgricultureStagesBy_SN(
		String stageName) {

		return getService().getAgricultureStagesBy_SN(stageName);
	}

	public static List<AgricultureApplicationStages>
		getAgricultureStagesBy_SN_SS(String stageName, String status) {

		return getService().getAgricultureStagesBy_SN_SS(stageName, status);
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
	 * Updates the agriculture application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureApplicationStages the agriculture application stages
	 * @return the agriculture application stages that was updated
	 */
	public static AgricultureApplicationStages
		updateAgricultureApplicationStages(
			AgricultureApplicationStages agricultureApplicationStages) {

		return getService().updateAgricultureApplicationStages(
			agricultureApplicationStages);
	}

	public static AgricultureApplicationStages updateAgricultureStages(
		String caseId, String stageName, java.util.Date stageStartDate,
		java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateAgricultureStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static AgricultureApplicationStagesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AgricultureApplicationStagesLocalService>
		_serviceSnapshot = new Snapshot<>(
			AgricultureApplicationStagesLocalServiceUtil.class,
			AgricultureApplicationStagesLocalService.class);

}