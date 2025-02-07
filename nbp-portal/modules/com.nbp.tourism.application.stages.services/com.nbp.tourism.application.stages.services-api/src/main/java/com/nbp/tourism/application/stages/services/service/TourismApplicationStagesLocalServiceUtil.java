/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.stages.services.model.TourismApplicationStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for TourismApplicationStages. This utility wraps
 * <code>com.nbp.tourism.application.stages.services.service.impl.TourismApplicationStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationStagesLocalService
 * @generated
 */
public class TourismApplicationStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.tourism.application.stages.services.service.impl.TourismApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the tourism application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismApplicationStages the tourism application stages
	 * @return the tourism application stages that was added
	 */
	public static TourismApplicationStages addTourismApplicationStages(
		TourismApplicationStages tourismApplicationStages) {

		return getService().addTourismApplicationStages(
			tourismApplicationStages);
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
	 * Creates a new tourism application stages with the primary key. Does not add the tourism application stages to the database.
	 *
	 * @param tourismApplicationStagesId the primary key for the new tourism application stages
	 * @return the new tourism application stages
	 */
	public static TourismApplicationStages createTourismApplicationStages(
		long tourismApplicationStagesId) {

		return getService().createTourismApplicationStages(
			tourismApplicationStagesId);
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
	 * Deletes the tourism application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismApplicationStagesId the primary key of the tourism application stages
	 * @return the tourism application stages that was removed
	 * @throws PortalException if a tourism application stages with the primary key could not be found
	 */
	public static TourismApplicationStages deleteTourismApplicationStages(
			long tourismApplicationStagesId)
		throws PortalException {

		return getService().deleteTourismApplicationStages(
			tourismApplicationStagesId);
	}

	/**
	 * Deletes the tourism application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismApplicationStages the tourism application stages
	 * @return the tourism application stages that was removed
	 */
	public static TourismApplicationStages deleteTourismApplicationStages(
		TourismApplicationStages tourismApplicationStages) {

		return getService().deleteTourismApplicationStages(
			tourismApplicationStages);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.stages.services.model.impl.TourismApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.stages.services.model.impl.TourismApplicationStagesModelImpl</code>.
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

	public static TourismApplicationStages fetchTourismApplicationStages(
		long tourismApplicationStagesId) {

		return getService().fetchTourismApplicationStages(
			tourismApplicationStagesId);
	}

	/**
	 * Returns the tourism application stages matching the UUID and group.
	 *
	 * @param uuid the tourism application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages
		fetchTourismApplicationStagesByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchTourismApplicationStagesByUuidAndGroupId(
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

	public static List<TourismApplicationStages> getTAS_CaseId(String caseId) {
		return getService().getTAS_CaseId(caseId);
	}

	public static TourismApplicationStages getTAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getService().getTAS_CaseIdAndStatus(caseId, stageStatus);
	}

	public static TourismApplicationStages getTAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getService().getTAS_CaseIdStageName(caseId, stageName);
	}

	public static TourismApplicationStages getTAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getService().getTAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	public static TourismApplicationStages getTAS_TAI(long tourismApplicationId)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getService().getTAS_TAI(tourismApplicationId);
	}

	public static List<TourismApplicationStages>
		getTourismApplicationsList_By_SN(String stageName) {

		return getService().getTourismApplicationsList_By_SN(stageName);
	}

	public static List<TourismApplicationStages>
		getTourismApplicationsList_By_SN_SS(String stageName, String status) {

		return getService().getTourismApplicationsList_By_SN_SS(
			stageName, status);
	}

	/**
	 * Returns the tourism application stages with the primary key.
	 *
	 * @param tourismApplicationStagesId the primary key of the tourism application stages
	 * @return the tourism application stages
	 * @throws PortalException if a tourism application stages with the primary key could not be found
	 */
	public static TourismApplicationStages getTourismApplicationStages(
			long tourismApplicationStagesId)
		throws PortalException {

		return getService().getTourismApplicationStages(
			tourismApplicationStagesId);
	}

	/**
	 * Returns the tourism application stages matching the UUID and group.
	 *
	 * @param uuid the tourism application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching tourism application stages
	 * @throws PortalException if a matching tourism application stages could not be found
	 */
	public static TourismApplicationStages
			getTourismApplicationStagesByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getTourismApplicationStagesByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the tourism application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.stages.services.model.impl.TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @return the range of tourism application stageses
	 */
	public static List<TourismApplicationStages> getTourismApplicationStageses(
		int start, int end) {

		return getService().getTourismApplicationStageses(start, end);
	}

	/**
	 * Returns all the tourism application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the tourism application stageses
	 * @param companyId the primary key of the company
	 * @return the matching tourism application stageses, or an empty list if no matches were found
	 */
	public static List<TourismApplicationStages>
		getTourismApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getTourismApplicationStagesesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of tourism application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the tourism application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching tourism application stageses, or an empty list if no matches were found
	 */
	public static List<TourismApplicationStages>
		getTourismApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<TourismApplicationStages> orderByComparator) {

		return getService().getTourismApplicationStagesesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of tourism application stageses.
	 *
	 * @return the number of tourism application stageses
	 */
	public static int getTourismApplicationStagesesCount() {
		return getService().getTourismApplicationStagesesCount();
	}

	public static TourismApplicationStages getTourismAppStages_By_SN(
			String stageName)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getService().getTourismAppStages_By_SN(stageName);
	}

	public static String getTourismCurrentStages(String caseId)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return getService().getTourismCurrentStages(caseId);
	}

	public static List<String> gettourismDistinctStages() {
		return getService().gettourismDistinctStages();
	}

	public static Long getTourismSeenCases() {
		return getService().getTourismSeenCases();
	}

	public static TourismApplicationStages updateTourismApplicationStages(
		String caseId, String stageName, java.util.Date stageStartDate,
		java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateTourismApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	/**
	 * Updates the tourism application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismApplicationStages the tourism application stages
	 * @return the tourism application stages that was updated
	 */
	public static TourismApplicationStages updateTourismApplicationStages(
		TourismApplicationStages tourismApplicationStages) {

		return getService().updateTourismApplicationStages(
			tourismApplicationStages);
	}

	public static TourismApplicationStagesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<TourismApplicationStagesLocalService>
		_serviceSnapshot = new Snapshot<>(
			TourismApplicationStagesLocalServiceUtil.class,
			TourismApplicationStagesLocalService.class);

}