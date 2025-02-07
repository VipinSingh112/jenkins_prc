/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.factories.registration.stage.services.model.FactoriesAppCommitteeDecision;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FactoriesAppCommitteeDecision. This utility wraps
 * <code>com.nbp.factories.registration.stage.services.service.impl.FactoriesAppCommitteeDecisionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesAppCommitteeDecisionLocalService
 * @generated
 */
public class FactoriesAppCommitteeDecisionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.factories.registration.stage.services.service.impl.FactoriesAppCommitteeDecisionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the factories app committee decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesAppCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesAppCommitteeDecision the factories app committee decision
	 * @return the factories app committee decision that was added
	 */
	public static FactoriesAppCommitteeDecision
		addFactoriesAppCommitteeDecision(
			FactoriesAppCommitteeDecision factoriesAppCommitteeDecision) {

		return getService().addFactoriesAppCommitteeDecision(
			factoriesAppCommitteeDecision);
	}

	/**
	 * Creates a new factories app committee decision with the primary key. Does not add the factories app committee decision to the database.
	 *
	 * @param factoriesAppCommiDecId the primary key for the new factories app committee decision
	 * @return the new factories app committee decision
	 */
	public static FactoriesAppCommitteeDecision
		createFactoriesAppCommitteeDecision(long factoriesAppCommiDecId) {

		return getService().createFactoriesAppCommitteeDecision(
			factoriesAppCommiDecId);
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
	 * Deletes the factories app committee decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesAppCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesAppCommitteeDecision the factories app committee decision
	 * @return the factories app committee decision that was removed
	 */
	public static FactoriesAppCommitteeDecision
		deleteFactoriesAppCommitteeDecision(
			FactoriesAppCommitteeDecision factoriesAppCommitteeDecision) {

		return getService().deleteFactoriesAppCommitteeDecision(
			factoriesAppCommitteeDecision);
	}

	/**
	 * Deletes the factories app committee decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesAppCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesAppCommiDecId the primary key of the factories app committee decision
	 * @return the factories app committee decision that was removed
	 * @throws PortalException if a factories app committee decision with the primary key could not be found
	 */
	public static FactoriesAppCommitteeDecision
			deleteFactoriesAppCommitteeDecision(long factoriesAppCommiDecId)
		throws PortalException {

		return getService().deleteFactoriesAppCommitteeDecision(
			factoriesAppCommiDecId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesAppCommitteeDecisionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesAppCommitteeDecisionModelImpl</code>.
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

	public static FactoriesAppCommitteeDecision
		fetchFactoriesAppCommitteeDecision(long factoriesAppCommiDecId) {

		return getService().fetchFactoriesAppCommitteeDecision(
			factoriesAppCommiDecId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the factories app committee decision with the primary key.
	 *
	 * @param factoriesAppCommiDecId the primary key of the factories app committee decision
	 * @return the factories app committee decision
	 * @throws PortalException if a factories app committee decision with the primary key could not be found
	 */
	public static FactoriesAppCommitteeDecision
			getFactoriesAppCommitteeDecision(long factoriesAppCommiDecId)
		throws PortalException {

		return getService().getFactoriesAppCommitteeDecision(
			factoriesAppCommiDecId);
	}

	/**
	 * Returns a range of all the factories app committee decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesAppCommitteeDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories app committee decisions
	 * @param end the upper bound of the range of factories app committee decisions (not inclusive)
	 * @return the range of factories app committee decisions
	 */
	public static List<FactoriesAppCommitteeDecision>
		getFactoriesAppCommitteeDecisions(int start, int end) {

		return getService().getFactoriesAppCommitteeDecisions(start, end);
	}

	/**
	 * Returns the number of factories app committee decisions.
	 *
	 * @return the number of factories app committee decisions
	 */
	public static int getFactoriesAppCommitteeDecisionsCount() {
		return getService().getFactoriesAppCommitteeDecisionsCount();
	}

	public static List<FactoriesAppCommitteeDecision> getFactory_By_CD(
			String status)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesAppCommitteeDecisionException {

		return getService().getFactory_By_CD(status);
	}

	public static FactoriesAppCommitteeDecision getFactory_CD_CI(String caseId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesAppCommitteeDecisionException {

		return getService().getFactory_CD_CI(caseId);
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
	 * Updates the factories app committee decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesAppCommitteeDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesAppCommitteeDecision the factories app committee decision
	 * @return the factories app committee decision that was updated
	 */
	public static FactoriesAppCommitteeDecision
		updateFactoriesAppCommitteeDecision(
			FactoriesAppCommitteeDecision factoriesAppCommitteeDecision) {

		return getService().updateFactoriesAppCommitteeDecision(
			factoriesAppCommitteeDecision);
	}

	public static FactoriesAppCommitteeDecision
		updateQuarryApplicationCommitteeDecision(
			String caseId, java.util.Date dateOfCommitteeDecision,
			String committeeDecision) {

		return getService().updateQuarryApplicationCommitteeDecision(
			caseId, dateOfCommitteeDecision, committeeDecision);
	}

	public static FactoriesAppCommitteeDecisionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FactoriesAppCommitteeDecisionLocalService>
		_serviceSnapshot = new Snapshot<>(
			FactoriesAppCommitteeDecisionLocalServiceUtil.class,
			FactoriesAppCommitteeDecisionLocalService.class);

}