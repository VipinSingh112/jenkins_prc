/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.stages.service.model.AcquireApplicationStages;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AcquireApplicationStages. This utility wraps
 * <code>com.nbp.acquire.stages.service.service.impl.AcquireApplicationStagesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireApplicationStagesLocalService
 * @generated
 */
public class AcquireApplicationStagesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.acquire.stages.service.service.impl.AcquireApplicationStagesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acquire application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireApplicationStages the acquire application stages
	 * @return the acquire application stages that was added
	 */
	public static AcquireApplicationStages addAcquireApplicationStages(
		AcquireApplicationStages acquireApplicationStages) {

		return getService().addAcquireApplicationStages(
			acquireApplicationStages);
	}

	/**
	 * Creates a new acquire application stages with the primary key. Does not add the acquire application stages to the database.
	 *
	 * @param acquireApplicationStagesId the primary key for the new acquire application stages
	 * @return the new acquire application stages
	 */
	public static AcquireApplicationStages createAcquireApplicationStages(
		long acquireApplicationStagesId) {

		return getService().createAcquireApplicationStages(
			acquireApplicationStagesId);
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
	 * Deletes the acquire application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireApplicationStages the acquire application stages
	 * @return the acquire application stages that was removed
	 */
	public static AcquireApplicationStages deleteAcquireApplicationStages(
		AcquireApplicationStages acquireApplicationStages) {

		return getService().deleteAcquireApplicationStages(
			acquireApplicationStages);
	}

	/**
	 * Deletes the acquire application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireApplicationStagesId the primary key of the acquire application stages
	 * @return the acquire application stages that was removed
	 * @throws PortalException if a acquire application stages with the primary key could not be found
	 */
	public static AcquireApplicationStages deleteAcquireApplicationStages(
			long acquireApplicationStagesId)
		throws PortalException {

		return getService().deleteAcquireApplicationStages(
			acquireApplicationStagesId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireApplicationStagesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireApplicationStagesModelImpl</code>.
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

	public static AcquireApplicationStages fetchAcquireApplicationStages(
		long acquireApplicationStagesId) {

		return getService().fetchAcquireApplicationStages(
			acquireApplicationStagesId);
	}

	public static List<AcquireApplicationStages> getAcquireApplicationByCaseId(
		String acquireCaseId) {

		return getService().getAcquireApplicationByCaseId(acquireCaseId);
	}

	/**
	 * Returns the acquire application stages with the primary key.
	 *
	 * @param acquireApplicationStagesId the primary key of the acquire application stages
	 * @return the acquire application stages
	 * @throws PortalException if a acquire application stages with the primary key could not be found
	 */
	public static AcquireApplicationStages getAcquireApplicationStages(
			long acquireApplicationStagesId)
		throws PortalException {

		return getService().getAcquireApplicationStages(
			acquireApplicationStagesId);
	}

	public static AcquireApplicationStages getAcquireApplicationStagesBy_AppId(
			long acquireApplicationId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getService().getAcquireApplicationStagesBy_AppId(
			acquireApplicationId);
	}

	public static AcquireApplicationStages getAcquireApplicationStagesBy_CaseId(
			String acquireCaseId, String stageStatus)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getService().getAcquireApplicationStagesBy_CaseId(
			acquireCaseId, stageStatus);
	}

	public static AcquireApplicationStages
			getAcquireApplicationStagesBy_CaseId_StageName(
				String acquireCaseId, String stageName)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getService().getAcquireApplicationStagesBy_CaseId_StageName(
			acquireCaseId, stageName);
	}

	public static AcquireApplicationStages
			getAcquireApplicationStagesBy_CaseId_StageName_StageStatus(
				String acquireCaseId, String stageName, String stageStatus)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getService().
			getAcquireApplicationStagesBy_CaseId_StageName_StageStatus(
				acquireCaseId, stageName, stageStatus);
	}

	public static AcquireApplicationStages getAcquireApplicationStagesBy_CI(
			String acquireCaseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getService().getAcquireApplicationStagesBy_CI(acquireCaseId);
	}

	/**
	 * Returns a range of all the acquire application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @return the range of acquire application stageses
	 */
	public static List<AcquireApplicationStages> getAcquireApplicationStageses(
		int start, int end) {

		return getService().getAcquireApplicationStageses(start, end);
	}

	/**
	 * Returns the number of acquire application stageses.
	 *
	 * @return the number of acquire application stageses
	 */
	public static int getAcquireApplicationStagesesCount() {
		return getService().getAcquireApplicationStagesesCount();
	}

	public static String getAcquireCurrentStages(String caseId) {
		return getService().getAcquireCurrentStages(caseId);
	}

	public static List<String> getAcquireDistinctStages() {
		return getService().getAcquireDistinctStages();
	}

	public static Long getAcquireSeenCases() {
		return getService().getAcquireSeenCases();
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<AcquireApplicationStages> getApplicatrionStagesBy_SN(
		String stageName) {

		return getService().getApplicatrionStagesBy_SN(stageName);
	}

	public static List<AcquireApplicationStages>
		getApplicatrionStagesBy_StageName_StageStatus(
			String stageName, String stageStatus) {

		return getService().getApplicatrionStagesBy_StageName_StageStatus(
			stageName, stageStatus);
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
	 * Updates the acquire application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireApplicationStages the acquire application stages
	 * @return the acquire application stages that was updated
	 */
	public static AcquireApplicationStages updateAcquireApplicationStages(
		AcquireApplicationStages acquireApplicationStages) {

		return getService().updateAcquireApplicationStages(
			acquireApplicationStages);
	}

	public static AcquireApplicationStages updateAcquireApplicationStages(
		String caseId, String stageName, java.util.Date stageStartDate,
		java.util.Date stageEndDate, String duration, String stageStatus) {

		return getService().updateAcquireApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	public static AcquireApplicationStagesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AcquireApplicationStagesLocalService>
		_serviceSnapshot = new Snapshot<>(
			AcquireApplicationStagesLocalServiceUtil.class,
			AcquireApplicationStagesLocalService.class);

}