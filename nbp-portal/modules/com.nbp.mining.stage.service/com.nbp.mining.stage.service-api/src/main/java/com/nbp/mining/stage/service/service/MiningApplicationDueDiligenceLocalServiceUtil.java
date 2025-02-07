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

import com.nbp.mining.stage.service.model.MiningApplicationDueDiligence;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MiningApplicationDueDiligence. This utility wraps
 * <code>com.nbp.mining.stage.service.service.impl.MiningApplicationDueDiligenceLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationDueDiligenceLocalService
 * @generated
 */
public class MiningApplicationDueDiligenceLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.mining.stage.service.service.impl.MiningApplicationDueDiligenceLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the mining application due diligence to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationDueDiligence the mining application due diligence
	 * @return the mining application due diligence that was added
	 */
	public static MiningApplicationDueDiligence
		addMiningApplicationDueDiligence(
			MiningApplicationDueDiligence miningApplicationDueDiligence) {

		return getService().addMiningApplicationDueDiligence(
			miningApplicationDueDiligence);
	}

	/**
	 * Creates a new mining application due diligence with the primary key. Does not add the mining application due diligence to the database.
	 *
	 * @param miningDueDiliId the primary key for the new mining application due diligence
	 * @return the new mining application due diligence
	 */
	public static MiningApplicationDueDiligence
		createMiningApplicationDueDiligence(long miningDueDiliId) {

		return getService().createMiningApplicationDueDiligence(
			miningDueDiliId);
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
	 * Deletes the mining application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningDueDiliId the primary key of the mining application due diligence
	 * @return the mining application due diligence that was removed
	 * @throws PortalException if a mining application due diligence with the primary key could not be found
	 */
	public static MiningApplicationDueDiligence
			deleteMiningApplicationDueDiligence(long miningDueDiliId)
		throws PortalException {

		return getService().deleteMiningApplicationDueDiligence(
			miningDueDiliId);
	}

	/**
	 * Deletes the mining application due diligence from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationDueDiligence the mining application due diligence
	 * @return the mining application due diligence that was removed
	 */
	public static MiningApplicationDueDiligence
		deleteMiningApplicationDueDiligence(
			MiningApplicationDueDiligence miningApplicationDueDiligence) {

		return getService().deleteMiningApplicationDueDiligence(
			miningApplicationDueDiligence);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationDueDiligenceModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationDueDiligenceModelImpl</code>.
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

	public static MiningApplicationDueDiligence
		fetchMiningApplicationDueDiligence(long miningDueDiliId) {

		return getService().fetchMiningApplicationDueDiligence(miningDueDiliId);
	}

	/**
	 * Returns the mining application due diligence matching the UUID and group.
	 *
	 * @param uuid the mining application due diligence's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	public static MiningApplicationDueDiligence
		fetchMiningApplicationDueDiligenceByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchMiningApplicationDueDiligenceByUuidAndGroupId(
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
	 * Returns the mining application due diligence with the primary key.
	 *
	 * @param miningDueDiliId the primary key of the mining application due diligence
	 * @return the mining application due diligence
	 * @throws PortalException if a mining application due diligence with the primary key could not be found
	 */
	public static MiningApplicationDueDiligence
			getMiningApplicationDueDiligence(long miningDueDiliId)
		throws PortalException {

		return getService().getMiningApplicationDueDiligence(miningDueDiliId);
	}

	public static MiningApplicationDueDiligence
			getMiningApplicationDueDiligenceByCI(String caseId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationDueDiligenceException {

		return getService().getMiningApplicationDueDiligenceByCI(caseId);
	}

	/**
	 * Returns the mining application due diligence matching the UUID and group.
	 *
	 * @param uuid the mining application due diligence's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mining application due diligence
	 * @throws PortalException if a matching mining application due diligence could not be found
	 */
	public static MiningApplicationDueDiligence
			getMiningApplicationDueDiligenceByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getMiningApplicationDueDiligenceByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the mining application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @return the range of mining application due diligences
	 */
	public static List<MiningApplicationDueDiligence>
		getMiningApplicationDueDiligences(int start, int end) {

		return getService().getMiningApplicationDueDiligences(start, end);
	}

	/**
	 * Returns all the mining application due diligences matching the UUID and company.
	 *
	 * @param uuid the UUID of the mining application due diligences
	 * @param companyId the primary key of the company
	 * @return the matching mining application due diligences, or an empty list if no matches were found
	 */
	public static List<MiningApplicationDueDiligence>
		getMiningApplicationDueDiligencesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getMiningApplicationDueDiligencesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of mining application due diligences matching the UUID and company.
	 *
	 * @param uuid the UUID of the mining application due diligences
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching mining application due diligences, or an empty list if no matches were found
	 */
	public static List<MiningApplicationDueDiligence>
		getMiningApplicationDueDiligencesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<MiningApplicationDueDiligence>
				orderByComparator) {

		return getService().getMiningApplicationDueDiligencesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of mining application due diligences.
	 *
	 * @return the number of mining application due diligences
	 */
	public static int getMiningApplicationDueDiligencesCount() {
		return getService().getMiningApplicationDueDiligencesCount();
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
	 * Updates the mining application due diligence in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationDueDiligenceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationDueDiligence the mining application due diligence
	 * @return the mining application due diligence that was updated
	 */
	public static MiningApplicationDueDiligence
		updateMiningApplicationDueDiligence(
			MiningApplicationDueDiligence miningApplicationDueDiligence) {

		return getService().updateMiningApplicationDueDiligence(
			miningApplicationDueDiligence);
	}

	public static MiningApplicationDueDiligence
		updateMiningApplicationDueDiligence(
			String caseId, String agencyName, String statusOfSubmission,
			String feedbackReceived, String status) {

		return getService().updateMiningApplicationDueDiligence(
			caseId, agencyName, statusOfSubmission, feedbackReceived, status);
	}

	public static MiningApplicationDueDiligenceLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MiningApplicationDueDiligenceLocalService>
		_serviceSnapshot = new Snapshot<>(
			MiningApplicationDueDiligenceLocalServiceUtil.class,
			MiningApplicationDueDiligenceLocalService.class);

}