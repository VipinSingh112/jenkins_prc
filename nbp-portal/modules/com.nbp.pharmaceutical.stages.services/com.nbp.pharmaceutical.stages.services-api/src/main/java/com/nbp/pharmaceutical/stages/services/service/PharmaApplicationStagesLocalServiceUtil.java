/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for PharmaApplicationStages. This utility wraps
 * <code>com.nbp.pharmaceutical.stages.services.service.impl.PharmaApplicationStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationStagesLocalService
 * @generated
 */
public class PharmaApplicationStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.pharmaceutical.stages.services.service.impl.PharmaApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the pharma application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationStages the pharma application stages
	 * @return the pharma application stages that was added
	 */
	public static PharmaApplicationStages addPharmaApplicationStages(
		PharmaApplicationStages pharmaApplicationStages) {

		return getService().addPharmaApplicationStages(pharmaApplicationStages);
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
	 * Creates a new pharma application stages with the primary key. Does not add the pharma application stages to the database.
	 *
	 * @param pharmaApplicationstageId the primary key for the new pharma application stages
	 * @return the new pharma application stages
	 */
	public static PharmaApplicationStages createPharmaApplicationStages(
		long pharmaApplicationstageId) {

		return getService().createPharmaApplicationStages(
			pharmaApplicationstageId);
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
	 * Deletes the pharma application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationstageId the primary key of the pharma application stages
	 * @return the pharma application stages that was removed
	 * @throws PortalException if a pharma application stages with the primary key could not be found
	 */
	public static PharmaApplicationStages deletePharmaApplicationStages(
			long pharmaApplicationstageId)
		throws PortalException {

		return getService().deletePharmaApplicationStages(
			pharmaApplicationstageId);
	}

	/**
	 * Deletes the pharma application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationStages the pharma application stages
	 * @return the pharma application stages that was removed
	 */
	public static PharmaApplicationStages deletePharmaApplicationStages(
		PharmaApplicationStages pharmaApplicationStages) {

		return getService().deletePharmaApplicationStages(
			pharmaApplicationStages);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationStagesModelImpl</code>.
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

	public static PharmaApplicationStages fetchPharmaApplicationStages(
		long pharmaApplicationstageId) {

		return getService().fetchPharmaApplicationStages(
			pharmaApplicationstageId);
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
	 * Returns the pharma application stages with the primary key.
	 *
	 * @param pharmaApplicationstageId the primary key of the pharma application stages
	 * @return the pharma application stages
	 * @throws PortalException if a pharma application stages with the primary key could not be found
	 */
	public static PharmaApplicationStages getPharmaApplicationStages(
			long pharmaApplicationstageId)
		throws PortalException {

		return getService().getPharmaApplicationStages(
			pharmaApplicationstageId);
	}

	public static PharmaApplicationStages getPharmaApplicationStages(
			String caseId, String stageName)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getService().getPharmaApplicationStages(caseId, stageName);
	}

	public static List<PharmaApplicationStages>
			getPharmaApplicationStagesByCaseId(String caseId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getService().getPharmaApplicationStagesByCaseId(caseId);
	}

	public static PharmaApplicationStages
			getPharmaApplicationStagesByCaseIdStageStageNameStageStatus(
				String caseId, String stageName, String Stage)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getService().
			getPharmaApplicationStagesByCaseIdStageStageNameStageStatus(
				caseId, stageName, Stage);
	}

	public static List<PharmaApplicationStages>
		getPharmaApplicationStagesByCI_SN_SS(
			String caseId, String stageName, String Stage) {

		return getService().getPharmaApplicationStagesByCI_SN_SS(
			caseId, stageName, Stage);
	}

	public static PharmaApplicationStages getPharmaApplicationStagesByStatus(
			String caseId, String stageStatus)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getService().getPharmaApplicationStagesByStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns a range of all the pharma application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @return the range of pharma application stageses
	 */
	public static List<PharmaApplicationStages> getPharmaApplicationStageses(
		int start, int end) {

		return getService().getPharmaApplicationStageses(start, end);
	}

	/**
	 * Returns the number of pharma application stageses.
	 *
	 * @return the number of pharma application stageses
	 */
	public static int getPharmaApplicationStagesesCount() {
		return getService().getPharmaApplicationStagesesCount();
	}

	public static List<PharmaApplicationStages> getPharmaBy_SN(
		String stageName) {

		return getService().getPharmaBy_SN(stageName);
	}

	public static Long getPharmaceuticalSeenCases() {
		return getService().getPharmaceuticalSeenCases();
	}

	public static String getPharmaCurrentStages(String caseId) {
		return getService().getPharmaCurrentStages(caseId);
	}

	public static List<String> getPharmaDistinctStages() {
		return getService().getPharmaDistinctStages();
	}

	public static List<PharmaApplicationStages> getPS_StageName_StageStatus(
		String stageName, String status) {

		return getService().getPS_StageName_StageStatus(stageName, status);
	}

	/**
	 * Updates the pharma application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationStages the pharma application stages
	 * @return the pharma application stages that was updated
	 */
	public static PharmaApplicationStages updatePharmaApplicationStages(
		PharmaApplicationStages pharmaApplicationStages) {

		return getService().updatePharmaApplicationStages(
			pharmaApplicationStages);
	}

	public static PharmaApplicationStages updatePharmaApplicationStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getService().updatePharmaApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static PharmaApplicationStagesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<PharmaApplicationStagesLocalService>
		_serviceSnapshot = new Snapshot<>(
			PharmaApplicationStagesLocalServiceUtil.class,
			PharmaApplicationStagesLocalService.class);

}