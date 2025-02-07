/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.stage.services.model.SezStatusWFHApplicationStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for SezStatusWFHApplicationStages. This utility wraps
 * <code>com.nbp.sez.status.application.stage.services.service.impl.SezStatusWFHApplicationStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWFHApplicationStagesLocalService
 * @generated
 */
public class SezStatusWFHApplicationStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.sez.status.application.stage.services.service.impl.SezStatusWFHApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the sez status wfh application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusWFHApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusWFHApplicationStages the sez status wfh application stages
	 * @return the sez status wfh application stages that was added
	 */
	public static SezStatusWFHApplicationStages
		addSezStatusWFHApplicationStages(
			SezStatusWFHApplicationStages sezStatusWFHApplicationStages) {

		return getService().addSezStatusWFHApplicationStages(
			sezStatusWFHApplicationStages);
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
	 * Creates a new sez status wfh application stages with the primary key. Does not add the sez status wfh application stages to the database.
	 *
	 * @param sezWFHAppStagesId the primary key for the new sez status wfh application stages
	 * @return the new sez status wfh application stages
	 */
	public static SezStatusWFHApplicationStages
		createSezStatusWFHApplicationStages(long sezWFHAppStagesId) {

		return getService().createSezStatusWFHApplicationStages(
			sezWFHAppStagesId);
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
	 * Deletes the sez status wfh application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusWFHApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezWFHAppStagesId the primary key of the sez status wfh application stages
	 * @return the sez status wfh application stages that was removed
	 * @throws PortalException if a sez status wfh application stages with the primary key could not be found
	 */
	public static SezStatusWFHApplicationStages
			deleteSezStatusWFHApplicationStages(long sezWFHAppStagesId)
		throws PortalException {

		return getService().deleteSezStatusWFHApplicationStages(
			sezWFHAppStagesId);
	}

	/**
	 * Deletes the sez status wfh application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusWFHApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusWFHApplicationStages the sez status wfh application stages
	 * @return the sez status wfh application stages that was removed
	 */
	public static SezStatusWFHApplicationStages
		deleteSezStatusWFHApplicationStages(
			SezStatusWFHApplicationStages sezStatusWFHApplicationStages) {

		return getService().deleteSezStatusWFHApplicationStages(
			sezStatusWFHApplicationStages);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusWFHApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusWFHApplicationStagesModelImpl</code>.
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

	public static SezStatusWFHApplicationStages
		fetchSezStatusWFHApplicationStages(long sezWFHAppStagesId) {

		return getService().fetchSezStatusWFHApplicationStages(
			sezWFHAppStagesId);
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

	public static List<SezStatusWFHApplicationStages> getSAS_CaseId(
		String caseId) {

		return getService().getSAS_CaseId(caseId);
	}

	public static SezStatusWFHApplicationStages getSAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWFHApplicationStagesException {

		return getService().getSAS_CaseIdAndStatus(caseId, stageStatus);
	}

	public static SezStatusWFHApplicationStages getSAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWFHApplicationStagesException {

		return getService().getSAS_CaseIdStageName(caseId, stageName);
	}

	public static SezStatusWFHApplicationStages getSAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWFHApplicationStagesException {

		return getService().getSAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	public static SezStatusWFHApplicationStages getSAS_SAI(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWFHApplicationStagesException {

		return getService().getSAS_SAI(sezStatusApplicationId);
	}

	public static Long getSezSeenCases() {
		return getService().getSezSeenCases();
	}

	public static List<SezStatusWFHApplicationStages>
		getSezStatusApplicationsList_By_SN(String stageName) {

		return getService().getSezStatusApplicationsList_By_SN(stageName);
	}

	public static String getSezStatusCurrentStages(String caseId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWFHApplicationStagesException {

		return getService().getSezStatusCurrentStages(caseId);
	}

	/**
	 * Returns the sez status wfh application stages with the primary key.
	 *
	 * @param sezWFHAppStagesId the primary key of the sez status wfh application stages
	 * @return the sez status wfh application stages
	 * @throws PortalException if a sez status wfh application stages with the primary key could not be found
	 */
	public static SezStatusWFHApplicationStages
			getSezStatusWFHApplicationStages(long sezWFHAppStagesId)
		throws PortalException {

		return getService().getSezStatusWFHApplicationStages(sezWFHAppStagesId);
	}

	/**
	 * Returns a range of all the sez status wfh application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @return the range of sez status wfh application stageses
	 */
	public static List<SezStatusWFHApplicationStages>
		getSezStatusWFHApplicationStageses(int start, int end) {

		return getService().getSezStatusWFHApplicationStageses(start, end);
	}

	/**
	 * Returns the number of sez status wfh application stageses.
	 *
	 * @return the number of sez status wfh application stageses
	 */
	public static int getSezStatusWFHApplicationStagesesCount() {
		return getService().getSezStatusWFHApplicationStagesesCount();
	}

	/**
	 * Updates the sez status wfh application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusWFHApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusWFHApplicationStages the sez status wfh application stages
	 * @return the sez status wfh application stages that was updated
	 */
	public static SezStatusWFHApplicationStages
		updateSezStatusWFHApplicationStages(
			SezStatusWFHApplicationStages sezStatusWFHApplicationStages) {

		return getService().updateSezStatusWFHApplicationStages(
			sezStatusWFHApplicationStages);
	}

	public static SezStatusWFHApplicationStages
		updateSezStatusWFHApplicationStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateSezStatusWFHApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static SezStatusWFHApplicationStagesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<SezStatusWFHApplicationStagesLocalService>
		_serviceSnapshot = new Snapshot<>(
			SezStatusWFHApplicationStagesLocalServiceUtil.class,
			SezStatusWFHApplicationStagesLocalService.class);

}