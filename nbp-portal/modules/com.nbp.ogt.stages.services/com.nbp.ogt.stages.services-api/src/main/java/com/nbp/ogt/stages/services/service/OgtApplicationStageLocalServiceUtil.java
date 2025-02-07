/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ogt.stages.services.model.OgtApplicationStage;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OgtApplicationStage. This utility wraps
 * <code>com.nbp.ogt.stages.services.service.impl.OgtApplicationStageLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OgtApplicationStageLocalService
 * @generated
 */
public class OgtApplicationStageLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ogt.stages.services.service.impl.OgtApplicationStageLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the ogt application stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtApplicationStage the ogt application stage
	 * @return the ogt application stage that was added
	 */
	public static OgtApplicationStage addOgtApplicationStage(
		OgtApplicationStage ogtApplicationStage) {

		return getService().addOgtApplicationStage(ogtApplicationStage);
	}

	/**
	 * Creates a new ogt application stage with the primary key. Does not add the ogt application stage to the database.
	 *
	 * @param ogtStagesId the primary key for the new ogt application stage
	 * @return the new ogt application stage
	 */
	public static OgtApplicationStage createOgtApplicationStage(
		long ogtStagesId) {

		return getService().createOgtApplicationStage(ogtStagesId);
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
	 * Deletes the ogt application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtStagesId the primary key of the ogt application stage
	 * @return the ogt application stage that was removed
	 * @throws PortalException if a ogt application stage with the primary key could not be found
	 */
	public static OgtApplicationStage deleteOgtApplicationStage(
			long ogtStagesId)
		throws PortalException {

		return getService().deleteOgtApplicationStage(ogtStagesId);
	}

	/**
	 * Deletes the ogt application stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtApplicationStage the ogt application stage
	 * @return the ogt application stage that was removed
	 */
	public static OgtApplicationStage deleteOgtApplicationStage(
		OgtApplicationStage ogtApplicationStage) {

		return getService().deleteOgtApplicationStage(ogtApplicationStage);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.stages.services.model.impl.OgtApplicationStageModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.stages.services.model.impl.OgtApplicationStageModelImpl</code>.
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

	public static OgtApplicationStage fetchOgtApplicationStage(
		long ogtStagesId) {

		return getService().fetchOgtApplicationStage(ogtStagesId);
	}

	/**
	 * Returns the ogt application stage matching the UUID and group.
	 *
	 * @param uuid the ogt application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage fetchOgtApplicationStageByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchOgtApplicationStageByUuidAndGroupId(
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

	public static OgtApplicationStage getMedicalByCI_ST(
			String caseId, String stageStatus)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getService().getMedicalByCI_ST(caseId, stageStatus);
	}

	public static String getNcbjApplicaitonCurrentStages(String caseId) {
		return getService().getNcbjApplicaitonCurrentStages(caseId);
	}

	/**
	 * Returns the ogt application stage with the primary key.
	 *
	 * @param ogtStagesId the primary key of the ogt application stage
	 * @return the ogt application stage
	 * @throws PortalException if a ogt application stage with the primary key could not be found
	 */
	public static OgtApplicationStage getOgtApplicationStage(long ogtStagesId)
		throws PortalException {

		return getService().getOgtApplicationStage(ogtStagesId);
	}

	/**
	 * Returns the ogt application stage matching the UUID and group.
	 *
	 * @param uuid the ogt application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ogt application stage
	 * @throws PortalException if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage getOgtApplicationStageByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getOgtApplicationStageByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the ogt application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.stages.services.model.impl.OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @return the range of ogt application stages
	 */
	public static List<OgtApplicationStage> getOgtApplicationStages(
		int start, int end) {

		return getService().getOgtApplicationStages(start, end);
	}

	/**
	 * Returns all the ogt application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the ogt application stages
	 * @param companyId the primary key of the company
	 * @return the matching ogt application stages, or an empty list if no matches were found
	 */
	public static List<OgtApplicationStage>
		getOgtApplicationStagesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getOgtApplicationStagesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of ogt application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the ogt application stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching ogt application stages, or an empty list if no matches were found
	 */
	public static List<OgtApplicationStage>
		getOgtApplicationStagesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<OgtApplicationStage> orderByComparator) {

		return getService().getOgtApplicationStagesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of ogt application stages.
	 *
	 * @return the number of ogt application stages
	 */
	public static int getOgtApplicationStagesCount() {
		return getService().getOgtApplicationStagesCount();
	}

	public static List<OgtApplicationStage> getOgtByCI(String caseId)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getService().getOgtByCI(caseId);
	}

	public static List<String> getOGTDistinctStages() {
		return getService().getOGTDistinctStages();
	}

	public static Long getOGTSeenCases() {
		return getService().getOGTSeenCases();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static OgtApplicationStage getOtgBy_CI(String caseId)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getService().getOtgBy_CI(caseId);
	}

	public static OgtApplicationStage getOtgByCI_SN(
			String caseId, String stageName)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getService().getOtgByCI_SN(caseId, stageName);
	}

	public static OgtApplicationStage getOtgByCI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getService().getOtgByCI_ST_SN(caseId, stageStatus, stageName);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static List<OgtApplicationStage> gtOgtApplicationStage_By_SN(
		String stageName) {

		return getService().gtOgtApplicationStage_By_SN(stageName);
	}

	/**
	 * Updates the ogt application stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtApplicationStage the ogt application stage
	 * @return the ogt application stage that was updated
	 */
	public static OgtApplicationStage updateOgtApplicationStage(
		OgtApplicationStage ogtApplicationStage) {

		return getService().updateOgtApplicationStage(ogtApplicationStage);
	}

	public static OgtApplicationStage updateOgtApplicationStage(
		String caseId, String stageName, java.util.Date stageStartDate,
		java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateOgtApplicationStage(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static OgtApplicationStageLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OgtApplicationStageLocalService>
		_serviceSnapshot = new Snapshot<>(
			OgtApplicationStageLocalServiceUtil.class,
			OgtApplicationStageLocalService.class);

}