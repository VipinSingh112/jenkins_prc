/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.stages.services.model.ManufacturingApplicationStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ManufacturingApplicationStages. This utility wraps
 * <code>com.nbp.manufacturing.application.stages.services.service.impl.ManufacturingApplicationStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingApplicationStagesLocalService
 * @generated
 */
public class ManufacturingApplicationStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.manufacturing.application.stages.services.service.impl.ManufacturingApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the manufacturing application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingApplicationStages the manufacturing application stages
	 * @return the manufacturing application stages that was added
	 */
	public static ManufacturingApplicationStages
		addManufacturingApplicationStages(
			ManufacturingApplicationStages manufacturingApplicationStages) {

		return getService().addManufacturingApplicationStages(
			manufacturingApplicationStages);
	}

	/**
	 * Creates a new manufacturing application stages with the primary key. Does not add the manufacturing application stages to the database.
	 *
	 * @param manufacturingAppStagesId the primary key for the new manufacturing application stages
	 * @return the new manufacturing application stages
	 */
	public static ManufacturingApplicationStages
		createManufacturingApplicationStages(long manufacturingAppStagesId) {

		return getService().createManufacturingApplicationStages(
			manufacturingAppStagesId);
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
	 * Deletes the manufacturing application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingAppStagesId the primary key of the manufacturing application stages
	 * @return the manufacturing application stages that was removed
	 * @throws PortalException if a manufacturing application stages with the primary key could not be found
	 */
	public static ManufacturingApplicationStages
			deleteManufacturingApplicationStages(long manufacturingAppStagesId)
		throws PortalException {

		return getService().deleteManufacturingApplicationStages(
			manufacturingAppStagesId);
	}

	/**
	 * Deletes the manufacturing application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingApplicationStages the manufacturing application stages
	 * @return the manufacturing application stages that was removed
	 */
	public static ManufacturingApplicationStages
		deleteManufacturingApplicationStages(
			ManufacturingApplicationStages manufacturingApplicationStages) {

		return getService().deleteManufacturingApplicationStages(
			manufacturingApplicationStages);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingApplicationStagesModelImpl</code>.
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

	public static ManufacturingApplicationStages
		fetchManufacturingApplicationStages(long manufacturingAppStagesId) {

		return getService().fetchManufacturingApplicationStages(
			manufacturingAppStagesId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
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
	 * Returns the manufacturing application stages with the primary key.
	 *
	 * @param manufacturingAppStagesId the primary key of the manufacturing application stages
	 * @return the manufacturing application stages
	 * @throws PortalException if a manufacturing application stages with the primary key could not be found
	 */
	public static ManufacturingApplicationStages
			getManufacturingApplicationStages(long manufacturingAppStagesId)
		throws PortalException {

		return getService().getManufacturingApplicationStages(
			manufacturingAppStagesId);
	}

	/**
	 * Returns a range of all the manufacturing application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @return the range of manufacturing application stageses
	 */
	public static List<ManufacturingApplicationStages>
		getManufacturingApplicationStageses(int start, int end) {

		return getService().getManufacturingApplicationStageses(start, end);
	}

	/**
	 * Returns the number of manufacturing application stageses.
	 *
	 * @return the number of manufacturing application stageses
	 */
	public static int getManufacturingApplicationStagesesCount() {
		return getService().getManufacturingApplicationStagesesCount();
	}

	public static List<ManufacturingApplicationStages> getManufacturingByCI(
			String caseId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getService().getManufacturingByCI(caseId);
	}

	public static ManufacturingApplicationStages getManufacturingByCI_SN(
			String caseId, String stageName)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getService().getManufacturingByCI_SN(caseId, stageName);
	}

	public static ManufacturingApplicationStages getManufacturingByCI_ST(
			String caseId, String stageStatus)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getService().getManufacturingByCI_ST(caseId, stageStatus);
	}

	public static ManufacturingApplicationStages getManufacturingByCI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getService().getManufacturingByCI_ST_SN(
			caseId, stageStatus, stageName);
	}

	public static ManufacturingApplicationStages getManufacturingByMAI(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getService().getManufacturingByMAI(manufacturingApplicationId);
	}

	public static List<ManufacturingApplicationStages>
			getManufacturingBySN_Status(String stageName, String status)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getService().getManufacturingBySN_Status(stageName, status);
	}

	public static List<String> getManufacturingDistinctStages() {
		return getService().getManufacturingDistinctStages();
	}

	public static Long getManufacturingSeenCases() {
		return getService().getManufacturingSeenCases();
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

	public static List<ManufacturingApplicationStages>
		gtManufacturingApplicationStages_By_SN(String stageName) {

		return getService().gtManufacturingApplicationStages_By_SN(stageName);
	}

	/**
	 * Updates the manufacturing application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingApplicationStages the manufacturing application stages
	 * @return the manufacturing application stages that was updated
	 */
	public static ManufacturingApplicationStages
		updateManufacturingApplicationStages(
			ManufacturingApplicationStages manufacturingApplicationStages) {

		return getService().updateManufacturingApplicationStages(
			manufacturingApplicationStages);
	}

	public static ManufacturingApplicationStages
		updateManufacturingApplicationStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateManufacturingApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static ManufacturingApplicationStagesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ManufacturingApplicationStagesLocalService>
		_serviceSnapshot = new Snapshot<>(
			ManufacturingApplicationStagesLocalServiceUtil.class,
			ManufacturingApplicationStagesLocalService.class);

}