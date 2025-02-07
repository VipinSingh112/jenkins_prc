/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.services.stages.service.model.OSIServicesStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OSIServicesStages. This utility wraps
 * <code>com.nbp.osi.services.stages.service.service.impl.OSIServicesStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesStagesLocalService
 * @generated
 */
public class OSIServicesStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.services.stages.service.service.impl.OSIServicesStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi services stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServicesStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesStages the osi services stages
	 * @return the osi services stages that was added
	 */
	public static OSIServicesStages addOSIServicesStages(
		OSIServicesStages osiServicesStages) {

		return getService().addOSIServicesStages(osiServicesStages);
	}

	/**
	 * Creates a new osi services stages with the primary key. Does not add the osi services stages to the database.
	 *
	 * @param osiServicesStagesId the primary key for the new osi services stages
	 * @return the new osi services stages
	 */
	public static OSIServicesStages createOSIServicesStages(
		long osiServicesStagesId) {

		return getService().createOSIServicesStages(osiServicesStagesId);
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
	 * Deletes the osi services stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServicesStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesStagesId the primary key of the osi services stages
	 * @return the osi services stages that was removed
	 * @throws PortalException if a osi services stages with the primary key could not be found
	 */
	public static OSIServicesStages deleteOSIServicesStages(
			long osiServicesStagesId)
		throws PortalException {

		return getService().deleteOSIServicesStages(osiServicesStagesId);
	}

	/**
	 * Deletes the osi services stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServicesStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesStages the osi services stages
	 * @return the osi services stages that was removed
	 */
	public static OSIServicesStages deleteOSIServicesStages(
		OSIServicesStages osiServicesStages) {

		return getService().deleteOSIServicesStages(osiServicesStages);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.stages.service.model.impl.OSIServicesStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.stages.service.model.impl.OSIServicesStagesModelImpl</code>.
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

	public static OSIServicesStages fetchOSIServicesStages(
		long osiServicesStagesId) {

		return getService().fetchOSIServicesStages(osiServicesStagesId);
	}

	/**
	 * Returns the osi services stages matching the UUID and group.
	 *
	 * @param uuid the osi services stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public static OSIServicesStages fetchOSIServicesStagesByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchOSIServicesStagesByUuidAndGroupId(
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

	public static List<OSIServicesStages> getOSI_Service_CaseId(String caseId) {
		return getService().getOSI_Service_CaseId(caseId);
	}

	public static List<OSIServicesStages> getOSI_Service_StageName(
		String stageName) {

		return getService().getOSI_Service_StageName(stageName);
	}

	public static OSIServicesStages getOSIService_By_CaseId(String caseId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getService().getOSIService_By_CaseId(caseId);
	}

	public static List<OSIServicesStages> getOSIService_CaseId(String caseId) {
		return getService().getOSIService_CaseId(caseId);
	}

	public static List<String> getOSIServiceDistinctStages() {
		return getService().getOSIServiceDistinctStages();
	}

	public static String getOSIServicesCurrentStages(String caseId) {
		return getService().getOSIServicesCurrentStages(caseId);
	}

	public static Long getOSIServiceSeenCases() {
		return getService().getOSIServiceSeenCases();
	}

	/**
	 * Returns the osi services stages with the primary key.
	 *
	 * @param osiServicesStagesId the primary key of the osi services stages
	 * @return the osi services stages
	 * @throws PortalException if a osi services stages with the primary key could not be found
	 */
	public static OSIServicesStages getOSIServicesStages(
			long osiServicesStagesId)
		throws PortalException {

		return getService().getOSIServicesStages(osiServicesStagesId);
	}

	/**
	 * Returns the osi services stages matching the UUID and group.
	 *
	 * @param uuid the osi services stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services stages
	 * @throws PortalException if a matching osi services stages could not be found
	 */
	public static OSIServicesStages getOSIServicesStagesByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getOSIServicesStagesByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.stages.service.model.impl.OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @return the range of osi services stageses
	 */
	public static List<OSIServicesStages> getOSIServicesStageses(
		int start, int end) {

		return getService().getOSIServicesStageses(start, end);
	}

	/**
	 * Returns all the osi services stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services stageses
	 * @param companyId the primary key of the company
	 * @return the matching osi services stageses, or an empty list if no matches were found
	 */
	public static List<OSIServicesStages>
		getOSIServicesStagesesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getOSIServicesStagesesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of osi services stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services stageses, or an empty list if no matches were found
	 */
	public static List<OSIServicesStages>
		getOSIServicesStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<OSIServicesStages> orderByComparator) {

		return getService().getOSIServicesStagesesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi services stageses.
	 *
	 * @return the number of osi services stageses
	 */
	public static int getOSIServicesStagesesCount() {
		return getService().getOSIServicesStagesesCount();
	}

	public static OSIServicesStages getOSIServiceStagesBy_SI_SN(
			String caseId, String stageName)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getService().getOSIServiceStagesBy_SI_SN(caseId, stageName);
	}

	public static OSIServicesStages getOSIServiceStagesBy_SI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getService().getOSIServiceStagesBy_SI_ST_SN(
			caseId, stageStatus, stageName);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static String getPharmaCurrentStages(String caseId) {
		return getService().getPharmaCurrentStages(caseId);
	}

	/**
	 * Updates the osi services stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServicesStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesStages the osi services stages
	 * @return the osi services stages that was updated
	 */
	public static OSIServicesStages updateOSIServicesStages(
		OSIServicesStages osiServicesStages) {

		return getService().updateOSIServicesStages(osiServicesStages);
	}

	public static OSIServicesStages updateOSIServicesStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getService().updateOSIServicesStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static OSIServicesStagesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OSIServicesStagesLocalService>
		_serviceSnapshot = new Snapshot<>(
			OSIServicesStagesLocalServiceUtil.class,
			OSIServicesStagesLocalService.class);

}