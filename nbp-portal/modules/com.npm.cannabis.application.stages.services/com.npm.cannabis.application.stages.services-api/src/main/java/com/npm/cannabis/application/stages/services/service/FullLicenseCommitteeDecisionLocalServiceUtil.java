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

import com.npm.cannabis.application.stages.services.model.FullLicenseCommitteeDecision;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FullLicenseCommitteeDecision. This utility wraps
 * <code>com.npm.cannabis.application.stages.services.service.impl.FullLicenseCommitteeDecisionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FullLicenseCommitteeDecisionLocalService
 * @generated
 */
public class FullLicenseCommitteeDecisionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.npm.cannabis.application.stages.services.service.impl.FullLicenseCommitteeDecisionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the full license committee decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FullLicenseCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fullLicenseCommitteeDecision the full license committee decision
	 * @return the full license committee decision that was added
	 */
	public static FullLicenseCommitteeDecision addFullLicenseCommitteeDecision(
		FullLicenseCommitteeDecision fullLicenseCommitteeDecision) {

		return getService().addFullLicenseCommitteeDecision(
			fullLicenseCommitteeDecision);
	}

	/**
	 * Creates a new full license committee decision with the primary key. Does not add the full license committee decision to the database.
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key for the new full license committee decision
	 * @return the new full license committee decision
	 */
	public static FullLicenseCommitteeDecision
		createFullLicenseCommitteeDecision(
			long fullLicenseCommitteeDecisionId) {

		return getService().createFullLicenseCommitteeDecision(
			fullLicenseCommitteeDecisionId);
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
	 * Deletes the full license committee decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FullLicenseCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fullLicenseCommitteeDecision the full license committee decision
	 * @return the full license committee decision that was removed
	 */
	public static FullLicenseCommitteeDecision
		deleteFullLicenseCommitteeDecision(
			FullLicenseCommitteeDecision fullLicenseCommitteeDecision) {

		return getService().deleteFullLicenseCommitteeDecision(
			fullLicenseCommitteeDecision);
	}

	/**
	 * Deletes the full license committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FullLicenseCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key of the full license committee decision
	 * @return the full license committee decision that was removed
	 * @throws PortalException if a full license committee decision with the primary key could not be found
	 */
	public static FullLicenseCommitteeDecision
			deleteFullLicenseCommitteeDecision(
				long fullLicenseCommitteeDecisionId)
		throws PortalException {

		return getService().deleteFullLicenseCommitteeDecision(
			fullLicenseCommitteeDecisionId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.FullLicenseCommitteeDecisionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.FullLicenseCommitteeDecisionModelImpl</code>.
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

	public static FullLicenseCommitteeDecision
		fetchFullLicenseCommitteeDecision(long fullLicenseCommitteeDecisionId) {

		return getService().fetchFullLicenseCommitteeDecision(
			fullLicenseCommitteeDecisionId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the full license committee decision with the primary key.
	 *
	 * @param fullLicenseCommitteeDecisionId the primary key of the full license committee decision
	 * @return the full license committee decision
	 * @throws PortalException if a full license committee decision with the primary key could not be found
	 */
	public static FullLicenseCommitteeDecision getFullLicenseCommitteeDecision(
			long fullLicenseCommitteeDecisionId)
		throws PortalException {

		return getService().getFullLicenseCommitteeDecision(
			fullLicenseCommitteeDecisionId);
	}

	public static FullLicenseCommitteeDecision
			getFullLicenseCommitteeDecisionBy_Case_Id(String caseId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchFullLicenseCommitteeDecisionException {

		return getService().getFullLicenseCommitteeDecisionBy_Case_Id(caseId);
	}

	public static List<FullLicenseCommitteeDecision>
		getFullLicenseCommitteeDecisionByCaseId(String caseId) {

		return getService().getFullLicenseCommitteeDecisionByCaseId(caseId);
	}

	public static FullLicenseCommitteeDecision
			getFullLicenseCommitteeDecisionByCaseIdStatus(
				String caseId, String committeeDecision)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchFullLicenseCommitteeDecisionException {

		return getService().getFullLicenseCommitteeDecisionByCaseIdStatus(
			caseId, committeeDecision);
	}

	public static List<FullLicenseCommitteeDecision>
		getFullLicenseCommitteeDecisionByStatus(String committeeDecision) {

		return getService().getFullLicenseCommitteeDecisionByStatus(
			committeeDecision);
	}

	/**
	 * Returns a range of all the full license committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.FullLicenseCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of full license committee decisions
	 * @param end the upper bound of the range of full license committee decisions (not inclusive)
	 * @return the range of full license committee decisions
	 */
	public static List<FullLicenseCommitteeDecision>
		getFullLicenseCommitteeDecisions(int start, int end) {

		return getService().getFullLicenseCommitteeDecisions(start, end);
	}

	/**
	 * Returns the number of full license committee decisions.
	 *
	 * @return the number of full license committee decisions
	 */
	public static int getFullLicenseCommitteeDecisionsCount() {
		return getService().getFullLicenseCommitteeDecisionsCount();
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

	public static FullLicenseCommitteeDecision
		updateCommitteeDecisionApplicationStage(
			String caseId, String bondFeeDue, String committeeDecision,
			String licenseFeeDue, long totalAmountDue, String stageStatus) {

		return getService().updateCommitteeDecisionApplicationStage(
			caseId, bondFeeDue, committeeDecision, licenseFeeDue,
			totalAmountDue, stageStatus);
	}

	/**
	 * Updates the full license committee decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FullLicenseCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fullLicenseCommitteeDecision the full license committee decision
	 * @return the full license committee decision that was updated
	 */
	public static FullLicenseCommitteeDecision
		updateFullLicenseCommitteeDecision(
			FullLicenseCommitteeDecision fullLicenseCommitteeDecision) {

		return getService().updateFullLicenseCommitteeDecision(
			fullLicenseCommitteeDecision);
	}

	public static FullLicenseCommitteeDecisionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FullLicenseCommitteeDecisionLocalService>
		_serviceSnapshot = new Snapshot<>(
			FullLicenseCommitteeDecisionLocalServiceUtil.class,
			FullLicenseCommitteeDecisionLocalService.class);

}