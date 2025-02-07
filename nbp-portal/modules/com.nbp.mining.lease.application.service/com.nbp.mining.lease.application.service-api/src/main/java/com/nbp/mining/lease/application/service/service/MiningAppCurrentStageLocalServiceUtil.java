/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.mining.lease.application.service.model.MiningAppCurrentStage;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MiningAppCurrentStage. This utility wraps
 * <code>com.nbp.mining.lease.application.service.service.impl.MiningAppCurrentStageLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MiningAppCurrentStageLocalService
 * @generated
 */
public class MiningAppCurrentStageLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.mining.lease.application.service.service.impl.MiningAppCurrentStageLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the mining app current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningAppCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningAppCurrentStage the mining app current stage
	 * @return the mining app current stage that was added
	 */
	public static MiningAppCurrentStage addMiningAppCurrentStage(
		MiningAppCurrentStage miningAppCurrentStage) {

		return getService().addMiningAppCurrentStage(miningAppCurrentStage);
	}

	/**
	 * Creates a new mining app current stage with the primary key. Does not add the mining app current stage to the database.
	 *
	 * @param miningAppCurrentStageId the primary key for the new mining app current stage
	 * @return the new mining app current stage
	 */
	public static MiningAppCurrentStage createMiningAppCurrentStage(
		long miningAppCurrentStageId) {

		return getService().createMiningAppCurrentStage(
			miningAppCurrentStageId);
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
	 * Deletes the mining app current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningAppCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningAppCurrentStageId the primary key of the mining app current stage
	 * @return the mining app current stage that was removed
	 * @throws PortalException if a mining app current stage with the primary key could not be found
	 */
	public static MiningAppCurrentStage deleteMiningAppCurrentStage(
			long miningAppCurrentStageId)
		throws PortalException {

		return getService().deleteMiningAppCurrentStage(
			miningAppCurrentStageId);
	}

	/**
	 * Deletes the mining app current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningAppCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningAppCurrentStage the mining app current stage
	 * @return the mining app current stage that was removed
	 */
	public static MiningAppCurrentStage deleteMiningAppCurrentStage(
		MiningAppCurrentStage miningAppCurrentStage) {

		return getService().deleteMiningAppCurrentStage(miningAppCurrentStage);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningAppCurrentStageModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningAppCurrentStageModelImpl</code>.
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

	public static MiningAppCurrentStage fetchMiningAppCurrentStage(
		long miningAppCurrentStageId) {

		return getService().fetchMiningAppCurrentStage(miningAppCurrentStageId);
	}

	/**
	 * Returns the mining app current stage matching the UUID and group.
	 *
	 * @param uuid the mining app current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mining app current stage, or <code>null</code> if a matching mining app current stage could not be found
	 */
	public static MiningAppCurrentStage
		fetchMiningAppCurrentStageByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchMiningAppCurrentStageByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static MiningAppCurrentStage getByMining_Stage(
			long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningAppCurrentStageException {

		return getService().getByMining_Stage(miningLeaseApplicationId);
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
	 * Returns the mining app current stage with the primary key.
	 *
	 * @param miningAppCurrentStageId the primary key of the mining app current stage
	 * @return the mining app current stage
	 * @throws PortalException if a mining app current stage with the primary key could not be found
	 */
	public static MiningAppCurrentStage getMiningAppCurrentStage(
			long miningAppCurrentStageId)
		throws PortalException {

		return getService().getMiningAppCurrentStage(miningAppCurrentStageId);
	}

	/**
	 * Returns the mining app current stage matching the UUID and group.
	 *
	 * @param uuid the mining app current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mining app current stage
	 * @throws PortalException if a matching mining app current stage could not be found
	 */
	public static MiningAppCurrentStage
			getMiningAppCurrentStageByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getMiningAppCurrentStageByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the mining app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.lease.application.service.model.impl.MiningAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining app current stages
	 * @param end the upper bound of the range of mining app current stages (not inclusive)
	 * @return the range of mining app current stages
	 */
	public static List<MiningAppCurrentStage> getMiningAppCurrentStages(
		int start, int end) {

		return getService().getMiningAppCurrentStages(start, end);
	}

	/**
	 * Returns all the mining app current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the mining app current stages
	 * @param companyId the primary key of the company
	 * @return the matching mining app current stages, or an empty list if no matches were found
	 */
	public static List<MiningAppCurrentStage>
		getMiningAppCurrentStagesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getMiningAppCurrentStagesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of mining app current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the mining app current stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of mining app current stages
	 * @param end the upper bound of the range of mining app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching mining app current stages, or an empty list if no matches were found
	 */
	public static List<MiningAppCurrentStage>
		getMiningAppCurrentStagesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<MiningAppCurrentStage> orderByComparator) {

		return getService().getMiningAppCurrentStagesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of mining app current stages.
	 *
	 * @return the number of mining app current stages
	 */
	public static int getMiningAppCurrentStagesCount() {
		return getService().getMiningAppCurrentStagesCount();
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
	 * Updates the mining app current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningAppCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningAppCurrentStage the mining app current stage
	 * @return the mining app current stage that was updated
	 */
	public static MiningAppCurrentStage updateMiningAppCurrentStage(
		MiningAppCurrentStage miningAppCurrentStage) {

		return getService().updateMiningAppCurrentStage(miningAppCurrentStage);
	}

	public static MiningAppCurrentStageLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MiningAppCurrentStageLocalService>
		_serviceSnapshot = new Snapshot<>(
			MiningAppCurrentStageLocalServiceUtil.class,
			MiningAppCurrentStageLocalService.class);

}