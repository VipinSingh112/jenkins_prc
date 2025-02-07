/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.stage.services.model.JtbApplicationStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JtbApplicationStages. This utility wraps
 * <code>com.nbp.jtb.application.stage.services.service.impl.JtbApplicationStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JtbApplicationStagesLocalService
 * @generated
 */
public class JtbApplicationStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jtb.application.stage.services.service.impl.JtbApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the jtb application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplicationStages the jtb application stages
	 * @return the jtb application stages that was added
	 */
	public static JtbApplicationStages addJtbApplicationStages(
		JtbApplicationStages jtbApplicationStages) {

		return getService().addJtbApplicationStages(jtbApplicationStages);
	}

	/**
	 * Creates a new jtb application stages with the primary key. Does not add the jtb application stages to the database.
	 *
	 * @param jtbApplicationStagesId the primary key for the new jtb application stages
	 * @return the new jtb application stages
	 */
	public static JtbApplicationStages createJtbApplicationStages(
		long jtbApplicationStagesId) {

		return getService().createJtbApplicationStages(jtbApplicationStagesId);
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
	 * Deletes the jtb application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplicationStages the jtb application stages
	 * @return the jtb application stages that was removed
	 */
	public static JtbApplicationStages deleteJtbApplicationStages(
		JtbApplicationStages jtbApplicationStages) {

		return getService().deleteJtbApplicationStages(jtbApplicationStages);
	}

	/**
	 * Deletes the jtb application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplicationStagesId the primary key of the jtb application stages
	 * @return the jtb application stages that was removed
	 * @throws PortalException if a jtb application stages with the primary key could not be found
	 */
	public static JtbApplicationStages deleteJtbApplicationStages(
			long jtbApplicationStagesId)
		throws PortalException {

		return getService().deleteJtbApplicationStages(jtbApplicationStagesId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JtbApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JtbApplicationStagesModelImpl</code>.
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

	public static JtbApplicationStages fetchJtbApplicationStages(
		long jtbApplicationStagesId) {

		return getService().fetchJtbApplicationStages(jtbApplicationStagesId);
	}

	/**
	 * Returns the jtb application stages matching the UUID and group.
	 *
	 * @param uuid the jtb application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages
		fetchJtbApplicationStagesByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchJtbApplicationStagesByUuidAndGroupId(
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

	public static String getJtbApplicaitonCurrentStages(String caseId) {
		return getService().getJtbApplicaitonCurrentStages(caseId);
	}

	/**
	 * Returns the jtb application stages with the primary key.
	 *
	 * @param jtbApplicationStagesId the primary key of the jtb application stages
	 * @return the jtb application stages
	 * @throws PortalException if a jtb application stages with the primary key could not be found
	 */
	public static JtbApplicationStages getJtbApplicationStages(
			long jtbApplicationStagesId)
		throws PortalException {

		return getService().getJtbApplicationStages(jtbApplicationStagesId);
	}

	/**
	 * Returns the jtb application stages matching the UUID and group.
	 *
	 * @param uuid the jtb application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jtb application stages
	 * @throws PortalException if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages getJtbApplicationStagesByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getJtbApplicationStagesByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the jtb application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @return the range of jtb application stageses
	 */
	public static List<JtbApplicationStages> getJtbApplicationStageses(
		int start, int end) {

		return getService().getJtbApplicationStageses(start, end);
	}

	/**
	 * Returns all the jtb application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the jtb application stageses
	 * @param companyId the primary key of the company
	 * @return the matching jtb application stageses, or an empty list if no matches were found
	 */
	public static List<JtbApplicationStages>
		getJtbApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getJtbApplicationStagesesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of jtb application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the jtb application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jtb application stageses, or an empty list if no matches were found
	 */
	public static List<JtbApplicationStages>
		getJtbApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<JtbApplicationStages> orderByComparator) {

		return getService().getJtbApplicationStagesesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jtb application stageses.
	 *
	 * @return the number of jtb application stageses
	 */
	public static int getJtbApplicationStagesesCount() {
		return getService().getJtbApplicationStagesesCount();
	}

	public static Long getJTBAttractionSeenCases() {
		return getService().getJTBAttractionSeenCases();
	}

	public static JtbApplicationStages getJtbBy_CI(String caseId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getService().getJtbBy_CI(caseId);
	}

	public static List<JtbApplicationStages> getJtbByCI(String caseId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getService().getJtbByCI(caseId);
	}

	public static JtbApplicationStages getJtbByCI_SN(
			String caseId, String stageName)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getService().getJtbByCI_SN(caseId, stageName);
	}

	public static JtbApplicationStages getJtbByCI_ST(
			String caseId, String stageStatus)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getService().getJtbByCI_ST(caseId, stageStatus);
	}

	public static JtbApplicationStages getJtbByCI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getService().getJtbByCI_ST_SN(caseId, stageStatus, stageName);
	}

	public static List<String> getJTBDistinctStages() {
		return getService().getJTBDistinctStages();
	}

	public static Long getJTBOtherSeenCases() {
		return getService().getJTBOtherSeenCases();
	}

	public static Long getJTBSeenCases() {
		return getService().getJTBSeenCases();
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

	public static List<JtbApplicationStages> gtJtbApplicationStages_By_SN(
		String stageName) {

		return getService().gtJtbApplicationStages_By_SN(stageName);
	}

	/**
	 * Updates the jtb application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplicationStages the jtb application stages
	 * @return the jtb application stages that was updated
	 */
	public static JtbApplicationStages updateJtbApplicationStages(
		JtbApplicationStages jtbApplicationStages) {

		return getService().updateJtbApplicationStages(jtbApplicationStages);
	}

	public static JtbApplicationStages updateJtbApplicationStages(
		String caseId, String stageName, java.util.Date stageStartDate,
		java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateJtbApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static JtbApplicationStagesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<JtbApplicationStagesLocalService>
		_serviceSnapshot = new Snapshot<>(
			JtbApplicationStagesLocalServiceUtil.class,
			JtbApplicationStagesLocalService.class);

}