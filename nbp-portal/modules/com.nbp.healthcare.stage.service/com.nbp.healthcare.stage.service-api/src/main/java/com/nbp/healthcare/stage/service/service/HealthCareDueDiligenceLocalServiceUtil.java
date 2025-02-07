/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.healthcare.stage.service.model.HealthCareDueDiligence;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for HealthCareDueDiligence. This utility wraps
 * <code>com.nbp.healthcare.stage.service.service.impl.HealthCareDueDiligenceLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareDueDiligenceLocalService
 * @generated
 */
public class HealthCareDueDiligenceLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.healthcare.stage.service.service.impl.HealthCareDueDiligenceLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the health care due diligence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareDueDiligence the health care due diligence
	 * @return the health care due diligence that was added
	 */
	public static HealthCareDueDiligence addHealthCareDueDiligence(
		HealthCareDueDiligence healthCareDueDiligence) {

		return getService().addHealthCareDueDiligence(healthCareDueDiligence);
	}

	/**
	 * Creates a new health care due diligence with the primary key. Does not add the health care due diligence to the database.
	 *
	 * @param healthDDId the primary key for the new health care due diligence
	 * @return the new health care due diligence
	 */
	public static HealthCareDueDiligence createHealthCareDueDiligence(
		long healthDDId) {

		return getService().createHealthCareDueDiligence(healthDDId);
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
	 * Deletes the health care due diligence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareDueDiligence the health care due diligence
	 * @return the health care due diligence that was removed
	 */
	public static HealthCareDueDiligence deleteHealthCareDueDiligence(
		HealthCareDueDiligence healthCareDueDiligence) {

		return getService().deleteHealthCareDueDiligence(
			healthCareDueDiligence);
	}

	/**
	 * Deletes the health care due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthDDId the primary key of the health care due diligence
	 * @return the health care due diligence that was removed
	 * @throws PortalException if a health care due diligence with the primary key could not be found
	 */
	public static HealthCareDueDiligence deleteHealthCareDueDiligence(
			long healthDDId)
		throws PortalException {

		return getService().deleteHealthCareDueDiligence(healthDDId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthCareDueDiligenceModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthCareDueDiligenceModelImpl</code>.
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

	public static HealthCareDueDiligence fetchHealthCareDueDiligence(
		long healthDDId) {

		return getService().fetchHealthCareDueDiligence(healthDDId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<String> getDistinctAgencies() {
		return getService().getDistinctAgencies();
	}

	public static HealthCareDueDiligence getHealthCareBy_CI(String caseId)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthCareDueDiligenceException {

		return getService().getHealthCareBy_CI(caseId);
	}

	/**
	 * Returns the health care due diligence with the primary key.
	 *
	 * @param healthDDId the primary key of the health care due diligence
	 * @return the health care due diligence
	 * @throws PortalException if a health care due diligence with the primary key could not be found
	 */
	public static HealthCareDueDiligence getHealthCareDueDiligence(
			long healthDDId)
		throws PortalException {

		return getService().getHealthCareDueDiligence(healthDDId);
	}

	public static HealthCareDueDiligence getHealthCareDueDiligenceBy_CI_SN(
			String caseId, String agncyName)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthCareDueDiligenceException {

		return getService().getHealthCareDueDiligenceBy_CI_SN(
			caseId, agncyName);
	}

	/**
	 * Returns a range of all the health care due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthCareDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care due diligences
	 * @param end the upper bound of the range of health care due diligences (not inclusive)
	 * @return the range of health care due diligences
	 */
	public static List<HealthCareDueDiligence> getHealthCareDueDiligences(
		int start, int end) {

		return getService().getHealthCareDueDiligences(start, end);
	}

	/**
	 * Returns the number of health care due diligences.
	 *
	 * @return the number of health care due diligences
	 */
	public static int getHealthCareDueDiligencesCount() {
		return getService().getHealthCareDueDiligencesCount();
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
	 * Updates the health care due diligence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthCareDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthCareDueDiligence the health care due diligence
	 * @return the health care due diligence that was updated
	 */
	public static HealthCareDueDiligence updateHealthCareDueDiligence(
		HealthCareDueDiligence healthCareDueDiligence) {

		return getService().updateHealthCareDueDiligence(
			healthCareDueDiligence);
	}

	public static HealthCareDueDiligence updateHealthCareDueDiligence(
		String caseId, java.util.Date dateSubmittedAgency, String nameofAgency,
		String Status, java.util.Date feedbackReceived) {

		return getService().updateHealthCareDueDiligence(
			caseId, dateSubmittedAgency, nameofAgency, Status,
			feedbackReceived);
	}

	public static HealthCareDueDiligence updateHealthCareDueDiligence(
		String caseId, java.util.Date dateSubmittedAgency, String nameofAgency,
		String Status, java.util.Date feedbackReceived,
		String reasonForObejction, String agencyDecision) {

		return getService().updateHealthCareDueDiligence(
			caseId, dateSubmittedAgency, nameofAgency, Status, feedbackReceived,
			reasonForObejction, agencyDecision);
	}

	public static HealthCareDueDiligence updateHealthCareDueDiligence(
		String caseId, java.util.Date dateSubmittedAgency, String nameofAgency,
		String Status, java.util.Date feedbackReceived,
		String reasonForObejction, String agencyDecision,
		String durationOfPeriod) {

		return getService().updateHealthCareDueDiligence(
			caseId, dateSubmittedAgency, nameofAgency, Status, feedbackReceived,
			reasonForObejction, agencyDecision, durationOfPeriod);
	}

	public static HealthCareDueDiligence updateHealthCareDueDiligence(
		String caseId, java.util.Date dateSubmittedAgency, String nameofAgency,
		String Status, String feedbackReceived, java.util.Date date) {

		return getService().updateHealthCareDueDiligence(
			caseId, dateSubmittedAgency, nameofAgency, Status, feedbackReceived,
			date);
	}

	public static HealthCareDueDiligenceLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<HealthCareDueDiligenceLocalService>
		_serviceSnapshot = new Snapshot<>(
			HealthCareDueDiligenceLocalServiceUtil.class,
			HealthCareDueDiligenceLocalService.class);

}