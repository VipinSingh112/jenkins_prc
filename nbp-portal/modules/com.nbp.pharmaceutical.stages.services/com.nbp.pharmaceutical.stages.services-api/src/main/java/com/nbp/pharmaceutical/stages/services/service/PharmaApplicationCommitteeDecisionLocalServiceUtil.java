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

import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationCommitteeDecision;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for PharmaApplicationCommitteeDecision. This utility wraps
 * <code>com.nbp.pharmaceutical.stages.services.service.impl.PharmaApplicationCommitteeDecisionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationCommitteeDecisionLocalService
 * @generated
 */
public class PharmaApplicationCommitteeDecisionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.pharmaceutical.stages.services.service.impl.PharmaApplicationCommitteeDecisionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the pharma application committee decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationCommitteeDecision the pharma application committee decision
	 * @return the pharma application committee decision that was added
	 */
	public static PharmaApplicationCommitteeDecision
		addPharmaApplicationCommitteeDecision(
			PharmaApplicationCommitteeDecision
				pharmaApplicationCommitteeDecision) {

		return getService().addPharmaApplicationCommitteeDecision(
			pharmaApplicationCommitteeDecision);
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
	 * Creates a new pharma application committee decision with the primary key. Does not add the pharma application committee decision to the database.
	 *
	 * @param pharmaCommitteeDecisionId the primary key for the new pharma application committee decision
	 * @return the new pharma application committee decision
	 */
	public static PharmaApplicationCommitteeDecision
		createPharmaApplicationCommitteeDecision(
			long pharmaCommitteeDecisionId) {

		return getService().createPharmaApplicationCommitteeDecision(
			pharmaCommitteeDecisionId);
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
	 * Deletes the pharma application committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaCommitteeDecisionId the primary key of the pharma application committee decision
	 * @return the pharma application committee decision that was removed
	 * @throws PortalException if a pharma application committee decision with the primary key could not be found
	 */
	public static PharmaApplicationCommitteeDecision
			deletePharmaApplicationCommitteeDecision(
				long pharmaCommitteeDecisionId)
		throws PortalException {

		return getService().deletePharmaApplicationCommitteeDecision(
			pharmaCommitteeDecisionId);
	}

	/**
	 * Deletes the pharma application committee decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationCommitteeDecision the pharma application committee decision
	 * @return the pharma application committee decision that was removed
	 */
	public static PharmaApplicationCommitteeDecision
		deletePharmaApplicationCommitteeDecision(
			PharmaApplicationCommitteeDecision
				pharmaApplicationCommitteeDecision) {

		return getService().deletePharmaApplicationCommitteeDecision(
			pharmaApplicationCommitteeDecision);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationCommitteeDecisionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationCommitteeDecisionModelImpl</code>.
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

	public static PharmaApplicationCommitteeDecision
		fetchPharmaApplicationCommitteeDecision(
			long pharmaCommitteeDecisionId) {

		return getService().fetchPharmaApplicationCommitteeDecision(
			pharmaCommitteeDecisionId);
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
	 * Returns the pharma application committee decision with the primary key.
	 *
	 * @param pharmaCommitteeDecisionId the primary key of the pharma application committee decision
	 * @return the pharma application committee decision
	 * @throws PortalException if a pharma application committee decision with the primary key could not be found
	 */
	public static PharmaApplicationCommitteeDecision
			getPharmaApplicationCommitteeDecision(
				long pharmaCommitteeDecisionId)
		throws PortalException {

		return getService().getPharmaApplicationCommitteeDecision(
			pharmaCommitteeDecisionId);
	}

	/**
	 * Returns a range of all the pharma application committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application committee decisions
	 * @param end the upper bound of the range of pharma application committee decisions (not inclusive)
	 * @return the range of pharma application committee decisions
	 */
	public static List<PharmaApplicationCommitteeDecision>
		getPharmaApplicationCommitteeDecisions(int start, int end) {

		return getService().getPharmaApplicationCommitteeDecisions(start, end);
	}

	/**
	 * Returns the number of pharma application committee decisions.
	 *
	 * @return the number of pharma application committee decisions
	 */
	public static int getPharmaApplicationCommitteeDecisionsCount() {
		return getService().getPharmaApplicationCommitteeDecisionsCount();
	}

	public static PharmaApplicationCommitteeDecision
			getPharmaCommitteDecisionByCI(String caseId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationCommitteeDecisionException {

		return getService().getPharmaCommitteDecisionByCI(caseId);
	}

	public static List<PharmaApplicationCommitteeDecision>
			getPharmaCommitteDecisionByStatus(String status)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationCommitteeDecisionException {

		return getService().getPharmaCommitteDecisionByStatus(status);
	}

	/**
	 * Updates the pharma application committee decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationCommitteeDecision the pharma application committee decision
	 * @return the pharma application committee decision that was updated
	 */
	public static PharmaApplicationCommitteeDecision
		updatePharmaApplicationCommitteeDecision(
			PharmaApplicationCommitteeDecision
				pharmaApplicationCommitteeDecision) {

		return getService().updatePharmaApplicationCommitteeDecision(
			pharmaApplicationCommitteeDecision);
	}

	public static PharmaApplicationCommitteeDecision
		updatePharmaApplicationCommitteeDecision(
			String caseId, java.util.Date dateOfCommitteeDecision,
			String committeeDecision) {

		return getService().updatePharmaApplicationCommitteeDecision(
			caseId, dateOfCommitteeDecision, committeeDecision);
	}

	public static PharmaApplicationCommitteeDecisionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot
		<PharmaApplicationCommitteeDecisionLocalService> _serviceSnapshot =
			new Snapshot<>(
				PharmaApplicationCommitteeDecisionLocalServiceUtil.class,
				PharmaApplicationCommitteeDecisionLocalService.class);

}