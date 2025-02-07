/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationDueDiligence;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for PharmaApplicationDueDiligence. This utility wraps
 * <code>com.nbp.pharmaceutical.stages.services.service.impl.PharmaApplicationDueDiligenceLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationDueDiligenceLocalService
 * @generated
 */
public class PharmaApplicationDueDiligenceLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.pharmaceutical.stages.services.service.impl.PharmaApplicationDueDiligenceLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the pharma application due diligence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationDueDiligence the pharma application due diligence
	 * @return the pharma application due diligence that was added
	 */
	public static PharmaApplicationDueDiligence
		addPharmaApplicationDueDiligence(
			PharmaApplicationDueDiligence pharmaApplicationDueDiligence) {

		return getService().addPharmaApplicationDueDiligence(
			pharmaApplicationDueDiligence);
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
	 * Creates a new pharma application due diligence with the primary key. Does not add the pharma application due diligence to the database.
	 *
	 * @param pharmaAppDDId the primary key for the new pharma application due diligence
	 * @return the new pharma application due diligence
	 */
	public static PharmaApplicationDueDiligence
		createPharmaApplicationDueDiligence(long pharmaAppDDId) {

		return getService().createPharmaApplicationDueDiligence(pharmaAppDDId);
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
	 * Deletes the pharma application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaAppDDId the primary key of the pharma application due diligence
	 * @return the pharma application due diligence that was removed
	 * @throws PortalException if a pharma application due diligence with the primary key could not be found
	 */
	public static PharmaApplicationDueDiligence
			deletePharmaApplicationDueDiligence(long pharmaAppDDId)
		throws PortalException {

		return getService().deletePharmaApplicationDueDiligence(pharmaAppDDId);
	}

	/**
	 * Deletes the pharma application due diligence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationDueDiligence the pharma application due diligence
	 * @return the pharma application due diligence that was removed
	 */
	public static PharmaApplicationDueDiligence
		deletePharmaApplicationDueDiligence(
			PharmaApplicationDueDiligence pharmaApplicationDueDiligence) {

		return getService().deletePharmaApplicationDueDiligence(
			pharmaApplicationDueDiligence);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationDueDiligenceModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationDueDiligenceModelImpl</code>.
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

	public static PharmaApplicationDueDiligence
		fetchPharmaApplicationDueDiligence(long pharmaAppDDId) {

		return getService().fetchPharmaApplicationDueDiligence(pharmaAppDDId);
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

	/**
	 * Returns the pharma application due diligence with the primary key.
	 *
	 * @param pharmaAppDDId the primary key of the pharma application due diligence
	 * @return the pharma application due diligence
	 * @throws PortalException if a pharma application due diligence with the primary key could not be found
	 */
	public static PharmaApplicationDueDiligence
			getPharmaApplicationDueDiligence(long pharmaAppDDId)
		throws PortalException {

		return getService().getPharmaApplicationDueDiligence(pharmaAppDDId);
	}

	public static List<PharmaApplicationDueDiligence>
			getPharmaApplicationDueDiligenceAN(String agencyName)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationDueDiligenceException {

		return getService().getPharmaApplicationDueDiligenceAN(agencyName);
	}

	/**
	 * Returns a range of all the pharma application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @return the range of pharma application due diligences
	 */
	public static List<PharmaApplicationDueDiligence>
		getPharmaApplicationDueDiligences(int start, int end) {

		return getService().getPharmaApplicationDueDiligences(start, end);
	}

	/**
	 * Returns the number of pharma application due diligences.
	 *
	 * @return the number of pharma application due diligences
	 */
	public static int getPharmaApplicationDueDiligencesCount() {
		return getService().getPharmaApplicationDueDiligencesCount();
	}

	public static PharmaApplicationDueDiligence
			getPharmaApplicationDueDiligenceStage(
				String caseId, String agencyName)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationDueDiligenceException {

		return getService().getPharmaApplicationDueDiligenceStage(
			caseId, agencyName);
	}

	/**
	 * Updates the pharma application due diligence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationDueDiligence the pharma application due diligence
	 * @return the pharma application due diligence that was updated
	 */
	public static PharmaApplicationDueDiligence
		updatePharmaApplicationDueDiligence(
			PharmaApplicationDueDiligence pharmaApplicationDueDiligence) {

		return getService().updatePharmaApplicationDueDiligence(
			pharmaApplicationDueDiligence);
	}

	public static PharmaApplicationDueDiligence
		updatePharmaApplicationDueDiligence(
			String caseId, String agencyName,
			java.util.Date dateSubmittedToAgency,
			java.util.Date dateFeedbackReceived, String status,
			String durationOfTimeSpentAtAgency, String agencyDecision) {

		return getService().updatePharmaApplicationDueDiligence(
			caseId, agencyName, dateSubmittedToAgency, dateFeedbackReceived,
			status, durationOfTimeSpentAtAgency, agencyDecision);
	}

	public static PharmaApplicationDueDiligence
		updatePharmaApplicationDueDiligence(
			String caseId, String agencyName, String agencyContactName,
			String agencyEmailAddress, java.util.Date dateFeedbackReceived,
			java.util.Date dateOfApplication,
			java.util.Date dateSubmittedToAgency,
			java.util.Date datefoDeadlineByAgency, String entityName,
			String status, String licenseNumber) {

		return getService().updatePharmaApplicationDueDiligence(
			caseId, agencyName, agencyContactName, agencyEmailAddress,
			dateFeedbackReceived, dateOfApplication, dateSubmittedToAgency,
			datefoDeadlineByAgency, entityName, status, licenseNumber);
	}

	public static PharmaApplicationDueDiligenceLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<PharmaApplicationDueDiligenceLocalService>
		_serviceSnapshot = new Snapshot<>(
			PharmaApplicationDueDiligenceLocalServiceUtil.class,
			PharmaApplicationDueDiligenceLocalService.class);

}