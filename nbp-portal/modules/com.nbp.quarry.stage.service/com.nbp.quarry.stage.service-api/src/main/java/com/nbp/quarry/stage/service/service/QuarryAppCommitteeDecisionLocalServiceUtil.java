/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quarry.stage.service.model.QuarryAppCommitteeDecision;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for QuarryAppCommitteeDecision. This utility wraps
 * <code>com.nbp.quarry.stage.service.service.impl.QuarryAppCommitteeDecisionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryAppCommitteeDecisionLocalService
 * @generated
 */
public class QuarryAppCommitteeDecisionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.quarry.stage.service.service.impl.QuarryAppCommitteeDecisionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the quarry app committee decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryAppCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryAppCommitteeDecision the quarry app committee decision
	 * @return the quarry app committee decision that was added
	 */
	public static QuarryAppCommitteeDecision addQuarryAppCommitteeDecision(
		QuarryAppCommitteeDecision quarryAppCommitteeDecision) {

		return getService().addQuarryAppCommitteeDecision(
			quarryAppCommitteeDecision);
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
	 * Creates a new quarry app committee decision with the primary key. Does not add the quarry app committee decision to the database.
	 *
	 * @param quarryAppCommitteeDecisionId the primary key for the new quarry app committee decision
	 * @return the new quarry app committee decision
	 */
	public static QuarryAppCommitteeDecision createQuarryAppCommitteeDecision(
		long quarryAppCommitteeDecisionId) {

		return getService().createQuarryAppCommitteeDecision(
			quarryAppCommitteeDecisionId);
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
	 * Deletes the quarry app committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryAppCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryAppCommitteeDecisionId the primary key of the quarry app committee decision
	 * @return the quarry app committee decision that was removed
	 * @throws PortalException if a quarry app committee decision with the primary key could not be found
	 */
	public static QuarryAppCommitteeDecision deleteQuarryAppCommitteeDecision(
			long quarryAppCommitteeDecisionId)
		throws PortalException {

		return getService().deleteQuarryAppCommitteeDecision(
			quarryAppCommitteeDecisionId);
	}

	/**
	 * Deletes the quarry app committee decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryAppCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryAppCommitteeDecision the quarry app committee decision
	 * @return the quarry app committee decision that was removed
	 */
	public static QuarryAppCommitteeDecision deleteQuarryAppCommitteeDecision(
		QuarryAppCommitteeDecision quarryAppCommitteeDecision) {

		return getService().deleteQuarryAppCommitteeDecision(
			quarryAppCommitteeDecision);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryAppCommitteeDecisionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryAppCommitteeDecisionModelImpl</code>.
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

	public static QuarryAppCommitteeDecision fetchQuarryAppCommitteeDecision(
		long quarryAppCommitteeDecisionId) {

		return getService().fetchQuarryAppCommitteeDecision(
			quarryAppCommitteeDecisionId);
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

	public static List<QuarryAppCommitteeDecision> getQuarry_By_CD(
			String status)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryAppCommitteeDecisionException {

		return getService().getQuarry_By_CD(status);
	}

	public static QuarryAppCommitteeDecision getQuarry_CD_CI(String caseId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryAppCommitteeDecisionException {

		return getService().getQuarry_CD_CI(caseId);
	}

	/**
	 * Returns the quarry app committee decision with the primary key.
	 *
	 * @param quarryAppCommitteeDecisionId the primary key of the quarry app committee decision
	 * @return the quarry app committee decision
	 * @throws PortalException if a quarry app committee decision with the primary key could not be found
	 */
	public static QuarryAppCommitteeDecision getQuarryAppCommitteeDecision(
			long quarryAppCommitteeDecisionId)
		throws PortalException {

		return getService().getQuarryAppCommitteeDecision(
			quarryAppCommitteeDecisionId);
	}

	/**
	 * Returns a range of all the quarry app committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry app committee decisions
	 * @param end the upper bound of the range of quarry app committee decisions (not inclusive)
	 * @return the range of quarry app committee decisions
	 */
	public static List<QuarryAppCommitteeDecision>
		getQuarryAppCommitteeDecisions(int start, int end) {

		return getService().getQuarryAppCommitteeDecisions(start, end);
	}

	/**
	 * Returns the number of quarry app committee decisions.
	 *
	 * @return the number of quarry app committee decisions
	 */
	public static int getQuarryAppCommitteeDecisionsCount() {
		return getService().getQuarryAppCommitteeDecisionsCount();
	}

	/**
	 * Updates the quarry app committee decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryAppCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryAppCommitteeDecision the quarry app committee decision
	 * @return the quarry app committee decision that was updated
	 */
	public static QuarryAppCommitteeDecision updateQuarryAppCommitteeDecision(
		QuarryAppCommitteeDecision quarryAppCommitteeDecision) {

		return getService().updateQuarryAppCommitteeDecision(
			quarryAppCommitteeDecision);
	}

	public static QuarryAppCommitteeDecision
		updateQuarryApplicationCommitteeDecision(
			String caseId, java.util.Date dateOfCommitteeDecision,
			String committeeDecision) {

		return getService().updateQuarryApplicationCommitteeDecision(
			caseId, dateOfCommitteeDecision, committeeDecision);
	}

	public static QuarryAppCommitteeDecisionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<QuarryAppCommitteeDecisionLocalService>
		_serviceSnapshot = new Snapshot<>(
			QuarryAppCommitteeDecisionLocalServiceUtil.class,
			QuarryAppCommitteeDecisionLocalService.class);

}