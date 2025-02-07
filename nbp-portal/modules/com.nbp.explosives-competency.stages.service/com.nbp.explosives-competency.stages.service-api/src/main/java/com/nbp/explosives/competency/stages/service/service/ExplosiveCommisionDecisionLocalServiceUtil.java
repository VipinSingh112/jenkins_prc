/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.explosives.competency.stages.service.model.ExplosiveCommisionDecision;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ExplosiveCommisionDecision. This utility wraps
 * <code>com.nbp.explosives.competency.stages.service.service.impl.ExplosiveCommisionDecisionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveCommisionDecisionLocalService
 * @generated
 */
public class ExplosiveCommisionDecisionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.explosives.competency.stages.service.service.impl.ExplosiveCommisionDecisionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the explosive commision decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveCommisionDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveCommisionDecision the explosive commision decision
	 * @return the explosive commision decision that was added
	 */
	public static ExplosiveCommisionDecision addExplosiveCommisionDecision(
		ExplosiveCommisionDecision explosiveCommisionDecision) {

		return getService().addExplosiveCommisionDecision(
			explosiveCommisionDecision);
	}

	/**
	 * Creates a new explosive commision decision with the primary key. Does not add the explosive commision decision to the database.
	 *
	 * @param commisiondecId the primary key for the new explosive commision decision
	 * @return the new explosive commision decision
	 */
	public static ExplosiveCommisionDecision createExplosiveCommisionDecision(
		long commisiondecId) {

		return getService().createExplosiveCommisionDecision(commisiondecId);
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
	 * Deletes the explosive commision decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveCommisionDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveCommisionDecision the explosive commision decision
	 * @return the explosive commision decision that was removed
	 */
	public static ExplosiveCommisionDecision deleteExplosiveCommisionDecision(
		ExplosiveCommisionDecision explosiveCommisionDecision) {

		return getService().deleteExplosiveCommisionDecision(
			explosiveCommisionDecision);
	}

	/**
	 * Deletes the explosive commision decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveCommisionDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param commisiondecId the primary key of the explosive commision decision
	 * @return the explosive commision decision that was removed
	 * @throws PortalException if a explosive commision decision with the primary key could not be found
	 */
	public static ExplosiveCommisionDecision deleteExplosiveCommisionDecision(
			long commisiondecId)
		throws PortalException {

		return getService().deleteExplosiveCommisionDecision(commisiondecId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveCommisionDecisionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveCommisionDecisionModelImpl</code>.
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

	public static ExplosiveCommisionDecision fetchExplosiveCommisionDecision(
		long commisiondecId) {

		return getService().fetchExplosiveCommisionDecision(commisiondecId);
	}

	/**
	 * Returns the explosive commision decision matching the UUID and group.
	 *
	 * @param uuid the explosive commision decision's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	public static ExplosiveCommisionDecision
		fetchExplosiveCommisionDecisionByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchExplosiveCommisionDecisionByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the explosive commision decision with the primary key.
	 *
	 * @param commisiondecId the primary key of the explosive commision decision
	 * @return the explosive commision decision
	 * @throws PortalException if a explosive commision decision with the primary key could not be found
	 */
	public static ExplosiveCommisionDecision getExplosiveCommisionDecision(
			long commisiondecId)
		throws PortalException {

		return getService().getExplosiveCommisionDecision(commisiondecId);
	}

	public static ExplosiveCommisionDecision getExplosiveCommisionDecisionBy_CI(
			String caseId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveCommisionDecisionException {

		return getService().getExplosiveCommisionDecisionBy_CI(caseId);
	}

	/**
	 * Returns the explosive commision decision matching the UUID and group.
	 *
	 * @param uuid the explosive commision decision's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosive commision decision
	 * @throws PortalException if a matching explosive commision decision could not be found
	 */
	public static ExplosiveCommisionDecision
			getExplosiveCommisionDecisionByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getExplosiveCommisionDecisionByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the explosive commision decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @return the range of explosive commision decisions
	 */
	public static List<ExplosiveCommisionDecision>
		getExplosiveCommisionDecisions(int start, int end) {

		return getService().getExplosiveCommisionDecisions(start, end);
	}

	/**
	 * Returns all the explosive commision decisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosive commision decisions
	 * @param companyId the primary key of the company
	 * @return the matching explosive commision decisions, or an empty list if no matches were found
	 */
	public static List<ExplosiveCommisionDecision>
		getExplosiveCommisionDecisionsByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getExplosiveCommisionDecisionsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of explosive commision decisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosive commision decisions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching explosive commision decisions, or an empty list if no matches were found
	 */
	public static List<ExplosiveCommisionDecision>
		getExplosiveCommisionDecisionsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<ExplosiveCommisionDecision> orderByComparator) {

		return getService().getExplosiveCommisionDecisionsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of explosive commision decisions.
	 *
	 * @return the number of explosive commision decisions
	 */
	public static int getExplosiveCommisionDecisionsCount() {
		return getService().getExplosiveCommisionDecisionsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
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
	 * Updates the explosive commision decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveCommisionDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveCommisionDecision the explosive commision decision
	 * @return the explosive commision decision that was updated
	 */
	public static ExplosiveCommisionDecision updateExplosiveCommisionDecision(
		ExplosiveCommisionDecision explosiveCommisionDecision) {

		return getService().updateExplosiveCommisionDecision(
			explosiveCommisionDecision);
	}

	public static ExplosiveCommisionDecision updateExplosiveCommisionDecision(
			String caseId, java.util.Date dateOfDecision,
			String commisionDecision)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveCommisionDecisionException {

		return getService().updateExplosiveCommisionDecision(
			caseId, dateOfDecision, commisionDecision);
	}

	public static ExplosiveCommisionDecisionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ExplosiveCommisionDecisionLocalService>
		_serviceSnapshot = new Snapshot<>(
			ExplosiveCommisionDecisionLocalServiceUtil.class,
			ExplosiveCommisionDecisionLocalService.class);

}