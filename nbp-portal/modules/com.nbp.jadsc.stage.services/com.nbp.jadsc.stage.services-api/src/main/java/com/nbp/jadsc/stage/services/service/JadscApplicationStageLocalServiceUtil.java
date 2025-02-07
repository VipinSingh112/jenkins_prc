/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.stage.services.model.JadscApplicationStage;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JadscApplicationStage. This utility wraps
 * <code>com.nbp.jadsc.stage.services.service.impl.JadscApplicationStageLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JadscApplicationStageLocalService
 * @generated
 */
public class JadscApplicationStageLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jadsc.stage.services.service.impl.JadscApplicationStageLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the jadsc application stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationStage the jadsc application stage
	 * @return the jadsc application stage that was added
	 */
	public static JadscApplicationStage addJadscApplicationStage(
		JadscApplicationStage jadscApplicationStage) {

		return getService().addJadscApplicationStage(jadscApplicationStage);
	}

	/**
	 * Creates a new jadsc application stage with the primary key. Does not add the jadsc application stage to the database.
	 *
	 * @param jadscAppStageId the primary key for the new jadsc application stage
	 * @return the new jadsc application stage
	 */
	public static JadscApplicationStage createJadscApplicationStage(
		long jadscAppStageId) {

		return getService().createJadscApplicationStage(jadscAppStageId);
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
	 * Deletes the jadsc application stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationStage the jadsc application stage
	 * @return the jadsc application stage that was removed
	 */
	public static JadscApplicationStage deleteJadscApplicationStage(
		JadscApplicationStage jadscApplicationStage) {

		return getService().deleteJadscApplicationStage(jadscApplicationStage);
	}

	/**
	 * Deletes the jadsc application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppStageId the primary key of the jadsc application stage
	 * @return the jadsc application stage that was removed
	 * @throws PortalException if a jadsc application stage with the primary key could not be found
	 */
	public static JadscApplicationStage deleteJadscApplicationStage(
			long jadscAppStageId)
		throws PortalException {

		return getService().deleteJadscApplicationStage(jadscAppStageId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationStageModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationStageModelImpl</code>.
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

	public static JadscApplicationStage fetchJadscApplicationStage(
		long jadscAppStageId) {

		return getService().fetchJadscApplicationStage(jadscAppStageId);
	}

	/**
	 * Returns the jadsc application stage matching the UUID and group.
	 *
	 * @param uuid the jadsc application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage
		fetchJadscApplicationStageByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchJadscApplicationStageByUuidAndGroupId(
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

	public static String getJadscApplicationCurrentStages(String caseId) {
		return getService().getJadscApplicationCurrentStages(caseId);
	}

	/**
	 * Returns the jadsc application stage with the primary key.
	 *
	 * @param jadscAppStageId the primary key of the jadsc application stage
	 * @return the jadsc application stage
	 * @throws PortalException if a jadsc application stage with the primary key could not be found
	 */
	public static JadscApplicationStage getJadscApplicationStage(
			long jadscAppStageId)
		throws PortalException {

		return getService().getJadscApplicationStage(jadscAppStageId);
	}

	/**
	 * Returns the jadsc application stage matching the UUID and group.
	 *
	 * @param uuid the jadsc application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jadsc application stage
	 * @throws PortalException if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage
			getJadscApplicationStageByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getJadscApplicationStageByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the jadsc application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @return the range of jadsc application stages
	 */
	public static List<JadscApplicationStage> getJadscApplicationStages(
		int start, int end) {

		return getService().getJadscApplicationStages(start, end);
	}

	/**
	 * Returns all the jadsc application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc application stages
	 * @param companyId the primary key of the company
	 * @return the matching jadsc application stages, or an empty list if no matches were found
	 */
	public static List<JadscApplicationStage>
		getJadscApplicationStagesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getJadscApplicationStagesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of jadsc application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the jadsc application stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jadsc application stages, or an empty list if no matches were found
	 */
	public static List<JadscApplicationStage>
		getJadscApplicationStagesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<JadscApplicationStage> orderByComparator) {

		return getService().getJadscApplicationStagesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jadsc application stages.
	 *
	 * @return the number of jadsc application stages
	 */
	public static int getJadscApplicationStagesCount() {
		return getService().getJadscApplicationStagesCount();
	}

	public static JadscApplicationStage getJadscBy_CI(String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getService().getJadscBy_CI(caseId);
	}

	public static List<JadscApplicationStage> getJadscByCI(String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getService().getJadscByCI(caseId);
	}

	public static JadscApplicationStage getJadscByCI_SN(
			String caseId, String stageName)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getService().getJadscByCI_SN(caseId, stageName);
	}

	public static JadscApplicationStage getJadscByCI_ST(
			String caseId, String stageStatus)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getService().getJadscByCI_ST(caseId, stageStatus);
	}

	public static JadscApplicationStage getJadscByCI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getService().getJadscByCI_ST_SN(caseId, stageStatus, stageName);
	}

	public static List<String> getJadscDistinctStages() {
		return getService().getJadscDistinctStages();
	}

	public static Long getJadscSeenCases() {
		return getService().getJadscSeenCases();
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

	public static List<JadscApplicationStage> gtJadscApplicationStage_By_SN(
		String stageName) {

		return getService().gtJadscApplicationStage_By_SN(stageName);
	}

	/**
	 * Updates the jadsc application stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscApplicationStage the jadsc application stage
	 * @return the jadsc application stage that was updated
	 */
	public static JadscApplicationStage updateJadscApplicationStage(
		JadscApplicationStage jadscApplicationStage) {

		return getService().updateJadscApplicationStage(jadscApplicationStage);
	}

	public static JadscApplicationStage updateJadscApplicationStage(
		String caseId, String stageName, java.util.Date stageStartDate,
		java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateJadscApplicationStage(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static JadscApplicationStageLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<JadscApplicationStageLocalService>
		_serviceSnapshot = new Snapshot<>(
			JadscApplicationStageLocalServiceUtil.class,
			JadscApplicationStageLocalService.class);

}