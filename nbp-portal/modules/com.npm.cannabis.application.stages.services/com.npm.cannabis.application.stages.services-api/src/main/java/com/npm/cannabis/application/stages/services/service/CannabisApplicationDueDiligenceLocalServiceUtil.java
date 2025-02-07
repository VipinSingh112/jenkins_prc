/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.npm.cannabis.application.stages.services.model.CannabisApplicationDueDiligence;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CannabisApplicationDueDiligence. This utility wraps
 * <code>com.npm.cannabis.application.stages.services.service.impl.CannabisApplicationDueDiligenceLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationDueDiligenceLocalService
 * @generated
 */
public class CannabisApplicationDueDiligenceLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.npm.cannabis.application.stages.services.service.impl.CannabisApplicationDueDiligenceLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the cannabis application due diligence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationDueDiligence the cannabis application due diligence
	 * @return the cannabis application due diligence that was added
	 */
	public static CannabisApplicationDueDiligence
		addCannabisApplicationDueDiligence(
			CannabisApplicationDueDiligence cannabisApplicationDueDiligence) {

		return getService().addCannabisApplicationDueDiligence(
			cannabisApplicationDueDiligence);
	}

	/**
	 * Creates a new cannabis application due diligence with the primary key. Does not add the cannabis application due diligence to the database.
	 *
	 * @param cannabisAppDDId the primary key for the new cannabis application due diligence
	 * @return the new cannabis application due diligence
	 */
	public static CannabisApplicationDueDiligence
		createCannabisApplicationDueDiligence(long cannabisAppDDId) {

		return getService().createCannabisApplicationDueDiligence(
			cannabisAppDDId);
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
	 * Deletes the cannabis application due diligence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationDueDiligence the cannabis application due diligence
	 * @return the cannabis application due diligence that was removed
	 */
	public static CannabisApplicationDueDiligence
		deleteCannabisApplicationDueDiligence(
			CannabisApplicationDueDiligence cannabisApplicationDueDiligence) {

		return getService().deleteCannabisApplicationDueDiligence(
			cannabisApplicationDueDiligence);
	}

	/**
	 * Deletes the cannabis application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisAppDDId the primary key of the cannabis application due diligence
	 * @return the cannabis application due diligence that was removed
	 * @throws PortalException if a cannabis application due diligence with the primary key could not be found
	 */
	public static CannabisApplicationDueDiligence
			deleteCannabisApplicationDueDiligence(long cannabisAppDDId)
		throws PortalException {

		return getService().deleteCannabisApplicationDueDiligence(
			cannabisAppDDId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationDueDiligenceModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationDueDiligenceModelImpl</code>.
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

	public static CannabisApplicationDueDiligence
		fetchCannabisApplicationDueDiligence(long cannabisAppDDId) {

		return getService().fetchCannabisApplicationDueDiligence(
			cannabisAppDDId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the cannabis application due diligence with the primary key.
	 *
	 * @param cannabisAppDDId the primary key of the cannabis application due diligence
	 * @return the cannabis application due diligence
	 * @throws PortalException if a cannabis application due diligence with the primary key could not be found
	 */
	public static CannabisApplicationDueDiligence
			getCannabisApplicationDueDiligence(long cannabisAppDDId)
		throws PortalException {

		return getService().getCannabisApplicationDueDiligence(cannabisAppDDId);
	}

	/**
	 * Returns a range of all the cannabis application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @return the range of cannabis application due diligences
	 */
	public static List<CannabisApplicationDueDiligence>
		getCannabisApplicationDueDiligences(int start, int end) {

		return getService().getCannabisApplicationDueDiligences(start, end);
	}

	/**
	 * Returns the number of cannabis application due diligences.
	 *
	 * @return the number of cannabis application due diligences
	 */
	public static int getCannabisApplicationDueDiligencesCount() {
		return getService().getCannabisApplicationDueDiligencesCount();
	}

	public static CannabisApplicationDueDiligence
			getCannabisApplicationDueDiligenceStage(
				String caseId, String agencyName)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationDueDiligenceException {

		return getService().getCannabisApplicationDueDiligenceStage(
			caseId, agencyName);
	}

	public static List<CannabisApplicationDueDiligence>
		getCannabisApplicationDueDiligenceStages(String caseId) {

		return getService().getCannabisApplicationDueDiligenceStages(caseId);
	}

	public static List<String> getDistinctAgencies() {
		return getService().getDistinctAgencies();
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
	 * Updates the cannabis application due diligence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationDueDiligence the cannabis application due diligence
	 * @return the cannabis application due diligence that was updated
	 */
	public static CannabisApplicationDueDiligence
		updateCannabisApplicationDueDiligence(
			CannabisApplicationDueDiligence cannabisApplicationDueDiligence) {

		return getService().updateCannabisApplicationDueDiligence(
			cannabisApplicationDueDiligence);
	}

	public static CannabisApplicationDueDiligence
		updateCannabisApplicationDueDiligence(
			String caseId, String agencyName, String agencyContactName,
			String agencyEmailAddress, java.util.Date dateFeedbackReceived,
			java.util.Date dateOfApplication,
			java.util.Date dateSubmittedToAgency,
			java.util.Date datefoDeadlineByAgency, String entityName,
			String status, String licenseNumber, String statusOfAgencyLetter,
			String agencyDecision) {

		return getService().updateCannabisApplicationDueDiligence(
			caseId, agencyName, agencyContactName, agencyEmailAddress,
			dateFeedbackReceived, dateOfApplication, dateSubmittedToAgency,
			datefoDeadlineByAgency, entityName, status, licenseNumber,
			statusOfAgencyLetter, agencyDecision);
	}

	public static CannabisApplicationDueDiligenceLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CannabisApplicationDueDiligenceLocalService>
		_serviceSnapshot = new Snapshot<>(
			CannabisApplicationDueDiligenceLocalServiceUtil.class,
			CannabisApplicationDueDiligenceLocalService.class);

}