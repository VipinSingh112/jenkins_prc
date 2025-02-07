/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.miic.stages.service.model.MiicRecommendationsDecision;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MiicRecommendationsDecision. This utility wraps
 * <code>com.nbp.miic.stages.service.service.impl.MiicRecommendationsDecisionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MiicRecommendationsDecisionLocalService
 * @generated
 */
public class MiicRecommendationsDecisionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.miic.stages.service.service.impl.MiicRecommendationsDecisionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the miic recommendations decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicRecommendationsDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicRecommendationsDecision the miic recommendations decision
	 * @return the miic recommendations decision that was added
	 */
	public static MiicRecommendationsDecision addMiicRecommendationsDecision(
		MiicRecommendationsDecision miicRecommendationsDecision) {

		return getService().addMiicRecommendationsDecision(
			miicRecommendationsDecision);
	}

	/**
	 * Creates a new miic recommendations decision with the primary key. Does not add the miic recommendations decision to the database.
	 *
	 * @param miicRecommendationsDecisionId the primary key for the new miic recommendations decision
	 * @return the new miic recommendations decision
	 */
	public static MiicRecommendationsDecision createMiicRecommendationsDecision(
		long miicRecommendationsDecisionId) {

		return getService().createMiicRecommendationsDecision(
			miicRecommendationsDecisionId);
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
	 * Deletes the miic recommendations decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicRecommendationsDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicRecommendationsDecisionId the primary key of the miic recommendations decision
	 * @return the miic recommendations decision that was removed
	 * @throws PortalException if a miic recommendations decision with the primary key could not be found
	 */
	public static MiicRecommendationsDecision deleteMiicRecommendationsDecision(
			long miicRecommendationsDecisionId)
		throws PortalException {

		return getService().deleteMiicRecommendationsDecision(
			miicRecommendationsDecisionId);
	}

	/**
	 * Deletes the miic recommendations decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicRecommendationsDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicRecommendationsDecision the miic recommendations decision
	 * @return the miic recommendations decision that was removed
	 */
	public static MiicRecommendationsDecision deleteMiicRecommendationsDecision(
		MiicRecommendationsDecision miicRecommendationsDecision) {

		return getService().deleteMiicRecommendationsDecision(
			miicRecommendationsDecision);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.stages.service.model.impl.MiicRecommendationsDecisionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.stages.service.model.impl.MiicRecommendationsDecisionModelImpl</code>.
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

	public static MiicRecommendationsDecision fetchMiicRecommendationsDecision(
		long miicRecommendationsDecisionId) {

		return getService().fetchMiicRecommendationsDecision(
			miicRecommendationsDecisionId);
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

	public static MiicRecommendationsDecision getMiic_RD_by_CI(String caseId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicRecommendationsDecisionException {

		return getService().getMiic_RD_by_CI(caseId);
	}

	/**
	 * Returns the miic recommendations decision with the primary key.
	 *
	 * @param miicRecommendationsDecisionId the primary key of the miic recommendations decision
	 * @return the miic recommendations decision
	 * @throws PortalException if a miic recommendations decision with the primary key could not be found
	 */
	public static MiicRecommendationsDecision getMiicRecommendationsDecision(
			long miicRecommendationsDecisionId)
		throws PortalException {

		return getService().getMiicRecommendationsDecision(
			miicRecommendationsDecisionId);
	}

	/**
	 * Returns a range of all the miic recommendations decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.stages.service.model.impl.MiicRecommendationsDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic recommendations decisions
	 * @param end the upper bound of the range of miic recommendations decisions (not inclusive)
	 * @return the range of miic recommendations decisions
	 */
	public static List<MiicRecommendationsDecision>
		getMiicRecommendationsDecisions(int start, int end) {

		return getService().getMiicRecommendationsDecisions(start, end);
	}

	/**
	 * Returns the number of miic recommendations decisions.
	 *
	 * @return the number of miic recommendations decisions
	 */
	public static int getMiicRecommendationsDecisionsCount() {
		return getService().getMiicRecommendationsDecisionsCount();
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
	 * Updates the miic recommendations decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicRecommendationsDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicRecommendationsDecision the miic recommendations decision
	 * @return the miic recommendations decision that was updated
	 */
	public static MiicRecommendationsDecision updateMiicRecommendationsDecision(
		MiicRecommendationsDecision miicRecommendationsDecision) {

		return getService().updateMiicRecommendationsDecision(
			miicRecommendationsDecision);
	}

	public static MiicRecommendationsDecision updateMiicRecommendationsDecision(
		String caseId, java.util.Date dateOfRecommendationsDecision,
		String recommendationsDecision) {

		return getService().updateMiicRecommendationsDecision(
			caseId, dateOfRecommendationsDecision, recommendationsDecision);
	}

	public static MiicRecommendationsDecisionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MiicRecommendationsDecisionLocalService>
		_serviceSnapshot = new Snapshot<>(
			MiicRecommendationsDecisionLocalServiceUtil.class,
			MiicRecommendationsDecisionLocalService.class);

}