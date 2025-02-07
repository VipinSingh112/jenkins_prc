/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.mining.stage.service.model.MiningApplicationMinisterialDecision;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MiningApplicationMinisterialDecision. This utility wraps
 * <code>com.nbp.mining.stage.service.service.impl.MiningApplicationMinisterialDecisionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationMinisterialDecisionLocalService
 * @generated
 */
public class MiningApplicationMinisterialDecisionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.mining.stage.service.service.impl.MiningApplicationMinisterialDecisionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the mining application ministerial decision to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationMinisterialDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationMinisterialDecision the mining application ministerial decision
	 * @return the mining application ministerial decision that was added
	 */
	public static MiningApplicationMinisterialDecision
		addMiningApplicationMinisterialDecision(
			MiningApplicationMinisterialDecision
				miningApplicationMinisterialDecision) {

		return getService().addMiningApplicationMinisterialDecision(
			miningApplicationMinisterialDecision);
	}

	/**
	 * Creates a new mining application ministerial decision with the primary key. Does not add the mining application ministerial decision to the database.
	 *
	 * @param miningDecId the primary key for the new mining application ministerial decision
	 * @return the new mining application ministerial decision
	 */
	public static MiningApplicationMinisterialDecision
		createMiningApplicationMinisterialDecision(long miningDecId) {

		return getService().createMiningApplicationMinisterialDecision(
			miningDecId);
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
	 * Deletes the mining application ministerial decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationMinisterialDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningDecId the primary key of the mining application ministerial decision
	 * @return the mining application ministerial decision that was removed
	 * @throws PortalException if a mining application ministerial decision with the primary key could not be found
	 */
	public static MiningApplicationMinisterialDecision
			deleteMiningApplicationMinisterialDecision(long miningDecId)
		throws PortalException {

		return getService().deleteMiningApplicationMinisterialDecision(
			miningDecId);
	}

	/**
	 * Deletes the mining application ministerial decision from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationMinisterialDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationMinisterialDecision the mining application ministerial decision
	 * @return the mining application ministerial decision that was removed
	 */
	public static MiningApplicationMinisterialDecision
		deleteMiningApplicationMinisterialDecision(
			MiningApplicationMinisterialDecision
				miningApplicationMinisterialDecision) {

		return getService().deleteMiningApplicationMinisterialDecision(
			miningApplicationMinisterialDecision);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationMinisterialDecisionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationMinisterialDecisionModelImpl</code>.
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

	public static MiningApplicationMinisterialDecision
		fetchMiningApplicationMinisterialDecision(long miningDecId) {

		return getService().fetchMiningApplicationMinisterialDecision(
			miningDecId);
	}

	/**
	 * Returns the mining application ministerial decision matching the UUID and group.
	 *
	 * @param uuid the mining application ministerial decision's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	public static MiningApplicationMinisterialDecision
		fetchMiningApplicationMinisterialDecisionByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().
			fetchMiningApplicationMinisterialDecisionByUuidAndGroupId(
				uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
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
	 * Returns the mining application ministerial decision with the primary key.
	 *
	 * @param miningDecId the primary key of the mining application ministerial decision
	 * @return the mining application ministerial decision
	 * @throws PortalException if a mining application ministerial decision with the primary key could not be found
	 */
	public static MiningApplicationMinisterialDecision
			getMiningApplicationMinisterialDecision(long miningDecId)
		throws PortalException {

		return getService().getMiningApplicationMinisterialDecision(
			miningDecId);
	}

	public static MiningApplicationMinisterialDecision
			getMiningApplicationMinisterialDecisionByCI(String caseId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationMinisterialDecisionException {

		return getService().getMiningApplicationMinisterialDecisionByCI(caseId);
	}

	/**
	 * Returns the mining application ministerial decision matching the UUID and group.
	 *
	 * @param uuid the mining application ministerial decision's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mining application ministerial decision
	 * @throws PortalException if a matching mining application ministerial decision could not be found
	 */
	public static MiningApplicationMinisterialDecision
			getMiningApplicationMinisterialDecisionByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().
			getMiningApplicationMinisterialDecisionByUuidAndGroupId(
				uuid, groupId);
	}

	/**
	 * Returns a range of all the mining application ministerial decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @return the range of mining application ministerial decisions
	 */
	public static List<MiningApplicationMinisterialDecision>
		getMiningApplicationMinisterialDecisions(int start, int end) {

		return getService().getMiningApplicationMinisterialDecisions(
			start, end);
	}

	/**
	 * Returns all the mining application ministerial decisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the mining application ministerial decisions
	 * @param companyId the primary key of the company
	 * @return the matching mining application ministerial decisions, or an empty list if no matches were found
	 */
	public static List<MiningApplicationMinisterialDecision>
		getMiningApplicationMinisterialDecisionsByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().
			getMiningApplicationMinisterialDecisionsByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of mining application ministerial decisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the mining application ministerial decisions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching mining application ministerial decisions, or an empty list if no matches were found
	 */
	public static List<MiningApplicationMinisterialDecision>
		getMiningApplicationMinisterialDecisionsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<MiningApplicationMinisterialDecision>
				orderByComparator) {

		return getService().
			getMiningApplicationMinisterialDecisionsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of mining application ministerial decisions.
	 *
	 * @return the number of mining application ministerial decisions
	 */
	public static int getMiningApplicationMinisterialDecisionsCount() {
		return getService().getMiningApplicationMinisterialDecisionsCount();
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
	 * Updates the mining application ministerial decision in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationMinisterialDecisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationMinisterialDecision the mining application ministerial decision
	 * @return the mining application ministerial decision that was updated
	 */
	public static MiningApplicationMinisterialDecision
		updateMiningApplicationMinisterialDecision(
			MiningApplicationMinisterialDecision
				miningApplicationMinisterialDecision) {

		return getService().updateMiningApplicationMinisterialDecision(
			miningApplicationMinisterialDecision);
	}

	public static MiningApplicationMinisterialDecision
		updateMiningMinisterialDecision(
			String caseId, String committeeDecision,
			java.sql.Date dateofCommitteeDecision,
			java.sql.Date dateOfExpiration, String certificateNumber) {

		return getService().updateMiningMinisterialDecision(
			caseId, committeeDecision, dateofCommitteeDecision,
			dateOfExpiration, certificateNumber);
	}

	public static MiningApplicationMinisterialDecision
		updateMiningMinisterialDecision(
			String caseId, String committeeDecision,
			java.util.Date dateofCommitteeDecision,
			java.util.Date dateOfExpiration, String certificateNumber) {

		return getService().updateMiningMinisterialDecision(
			caseId, committeeDecision, dateofCommitteeDecision,
			dateOfExpiration, certificateNumber);
	}

	public static MiningApplicationMinisterialDecisionLocalService
		getService() {

		return _serviceSnapshot.get();
	}

	private static final Snapshot
		<MiningApplicationMinisterialDecisionLocalService> _serviceSnapshot =
			new Snapshot<>(
				MiningApplicationMinisterialDecisionLocalServiceUtil.class,
				MiningApplicationMinisterialDecisionLocalService.class);

}