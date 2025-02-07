/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.stages.services.model.JanaacApplicationStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JanaacApplicationStages. This utility wraps
 * <code>com.nbp.janaac.stages.services.service.impl.JanaacApplicationStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacApplicationStagesLocalService
 * @generated
 */
public class JanaacApplicationStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.janaac.stages.services.service.impl.JanaacApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the janaac application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacApplicationStages the janaac application stages
	 * @return the janaac application stages that was added
	 */
	public static JanaacApplicationStages addJanaacApplicationStages(
		JanaacApplicationStages janaacApplicationStages) {

		return getService().addJanaacApplicationStages(janaacApplicationStages);
	}

	/**
	 * Creates a new janaac application stages with the primary key. Does not add the janaac application stages to the database.
	 *
	 * @param janaacApplicationStagesId the primary key for the new janaac application stages
	 * @return the new janaac application stages
	 */
	public static JanaacApplicationStages createJanaacApplicationStages(
		long janaacApplicationStagesId) {

		return getService().createJanaacApplicationStages(
			janaacApplicationStagesId);
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
	 * Deletes the janaac application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacApplicationStages the janaac application stages
	 * @return the janaac application stages that was removed
	 */
	public static JanaacApplicationStages deleteJanaacApplicationStages(
		JanaacApplicationStages janaacApplicationStages) {

		return getService().deleteJanaacApplicationStages(
			janaacApplicationStages);
	}

	/**
	 * Deletes the janaac application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacApplicationStagesId the primary key of the janaac application stages
	 * @return the janaac application stages that was removed
	 * @throws PortalException if a janaac application stages with the primary key could not be found
	 */
	public static JanaacApplicationStages deleteJanaacApplicationStages(
			long janaacApplicationStagesId)
		throws PortalException {

		return getService().deleteJanaacApplicationStages(
			janaacApplicationStagesId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacApplicationStagesModelImpl</code>.
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

	public static JanaacApplicationStages fetchJanaacApplicationStages(
		long janaacApplicationStagesId) {

		return getService().fetchJanaacApplicationStages(
			janaacApplicationStagesId);
	}

	/**
	 * Returns the janaac application stages matching the UUID and group.
	 *
	 * @param uuid the janaac application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages
		fetchJanaacApplicationStagesByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchJanaacApplicationStagesByUuidAndGroupId(
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

	public static String getJanaacApplicationCurrentStages(String caseId) {
		return getService().getJanaacApplicationCurrentStages(caseId);
	}

	public static List<JanaacApplicationStages> getJanaacApplicationStage_By_SN(
		String stageName) {

		return getService().getJanaacApplicationStage_By_SN(stageName);
	}

	/**
	 * Returns the janaac application stages with the primary key.
	 *
	 * @param janaacApplicationStagesId the primary key of the janaac application stages
	 * @return the janaac application stages
	 * @throws PortalException if a janaac application stages with the primary key could not be found
	 */
	public static JanaacApplicationStages getJanaacApplicationStages(
			long janaacApplicationStagesId)
		throws PortalException {

		return getService().getJanaacApplicationStages(
			janaacApplicationStagesId);
	}

	/**
	 * Returns the janaac application stages matching the UUID and group.
	 *
	 * @param uuid the janaac application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching janaac application stages
	 * @throws PortalException if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages
			getJanaacApplicationStagesByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getJanaacApplicationStagesByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the janaac application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @return the range of janaac application stageses
	 */
	public static List<JanaacApplicationStages> getJanaacApplicationStageses(
		int start, int end) {

		return getService().getJanaacApplicationStageses(start, end);
	}

	/**
	 * Returns all the janaac application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the janaac application stageses
	 * @param companyId the primary key of the company
	 * @return the matching janaac application stageses, or an empty list if no matches were found
	 */
	public static List<JanaacApplicationStages>
		getJanaacApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getJanaacApplicationStagesesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of janaac application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the janaac application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching janaac application stageses, or an empty list if no matches were found
	 */
	public static List<JanaacApplicationStages>
		getJanaacApplicationStagesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<JanaacApplicationStages> orderByComparator) {

		return getService().getJanaacApplicationStagesesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of janaac application stageses.
	 *
	 * @return the number of janaac application stageses
	 */
	public static int getJanaacApplicationStagesesCount() {
		return getService().getJanaacApplicationStagesesCount();
	}

	public static JanaacApplicationStages getJanaacBy_CI(String caseId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getService().getJanaacBy_CI(caseId);
	}

	public static List<JanaacApplicationStages> getJanaacByCI(String caseId) {
		return getService().getJanaacByCI(caseId);
	}

	public static JanaacApplicationStages getJanaacByCI_SN(
			String caseId, String stageName)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getService().getJanaacByCI_SN(caseId, stageName);
	}

	public static JanaacApplicationStages getJanaacByCI_ST(
			String caseId, String stageStatus)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getService().getJanaacByCI_ST(caseId, stageStatus);
	}

	public static JanaacApplicationStages getJanaacByCI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getService().getJanaacByCI_ST_SN(caseId, stageStatus, stageName);
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

	public static JanaacApplicationStages updateJanaacApplicationStage(
		String caseId, String stageName, java.util.Date stageStartDate,
		java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateJanaacApplicationStage(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	/**
	 * Updates the janaac application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacApplicationStages the janaac application stages
	 * @return the janaac application stages that was updated
	 */
	public static JanaacApplicationStages updateJanaacApplicationStages(
		JanaacApplicationStages janaacApplicationStages) {

		return getService().updateJanaacApplicationStages(
			janaacApplicationStages);
	}

	public static JanaacApplicationStagesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<JanaacApplicationStagesLocalService>
		_serviceSnapshot = new Snapshot<>(
			JanaacApplicationStagesLocalServiceUtil.class,
			JanaacApplicationStagesLocalService.class);

}