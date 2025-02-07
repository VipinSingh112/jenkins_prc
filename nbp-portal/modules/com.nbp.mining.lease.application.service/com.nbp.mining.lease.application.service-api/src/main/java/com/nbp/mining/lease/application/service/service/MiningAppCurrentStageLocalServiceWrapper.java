/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiningAppCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningAppCurrentStageLocalService
 * @generated
 */
public class MiningAppCurrentStageLocalServiceWrapper
	implements MiningAppCurrentStageLocalService,
			   ServiceWrapper<MiningAppCurrentStageLocalService> {

	public MiningAppCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public MiningAppCurrentStageLocalServiceWrapper(
		MiningAppCurrentStageLocalService miningAppCurrentStageLocalService) {

		_miningAppCurrentStageLocalService = miningAppCurrentStageLocalService;
	}

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
	@Override
	public com.nbp.mining.lease.application.service.model.MiningAppCurrentStage
		addMiningAppCurrentStage(
			com.nbp.mining.lease.application.service.model.MiningAppCurrentStage
				miningAppCurrentStage) {

		return _miningAppCurrentStageLocalService.addMiningAppCurrentStage(
			miningAppCurrentStage);
	}

	/**
	 * Creates a new mining app current stage with the primary key. Does not add the mining app current stage to the database.
	 *
	 * @param miningAppCurrentStageId the primary key for the new mining app current stage
	 * @return the new mining app current stage
	 */
	@Override
	public com.nbp.mining.lease.application.service.model.MiningAppCurrentStage
		createMiningAppCurrentStage(long miningAppCurrentStageId) {

		return _miningAppCurrentStageLocalService.createMiningAppCurrentStage(
			miningAppCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningAppCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.nbp.mining.lease.application.service.model.MiningAppCurrentStage
			deleteMiningAppCurrentStage(long miningAppCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningAppCurrentStageLocalService.deleteMiningAppCurrentStage(
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
	@Override
	public com.nbp.mining.lease.application.service.model.MiningAppCurrentStage
		deleteMiningAppCurrentStage(
			com.nbp.mining.lease.application.service.model.MiningAppCurrentStage
				miningAppCurrentStage) {

		return _miningAppCurrentStageLocalService.deleteMiningAppCurrentStage(
			miningAppCurrentStage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningAppCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miningAppCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miningAppCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miningAppCurrentStageLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _miningAppCurrentStageLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _miningAppCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _miningAppCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _miningAppCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _miningAppCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.mining.lease.application.service.model.MiningAppCurrentStage
		fetchMiningAppCurrentStage(long miningAppCurrentStageId) {

		return _miningAppCurrentStageLocalService.fetchMiningAppCurrentStage(
			miningAppCurrentStageId);
	}

	/**
	 * Returns the mining app current stage matching the UUID and group.
	 *
	 * @param uuid the mining app current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mining app current stage, or <code>null</code> if a matching mining app current stage could not be found
	 */
	@Override
	public com.nbp.mining.lease.application.service.model.MiningAppCurrentStage
		fetchMiningAppCurrentStageByUuidAndGroupId(String uuid, long groupId) {

		return _miningAppCurrentStageLocalService.
			fetchMiningAppCurrentStageByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miningAppCurrentStageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.mining.lease.application.service.model.MiningAppCurrentStage
			getByMining_Stage(long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningAppCurrentStageException {

		return _miningAppCurrentStageLocalService.getByMining_Stage(
			miningLeaseApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _miningAppCurrentStageLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miningAppCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the mining app current stage with the primary key.
	 *
	 * @param miningAppCurrentStageId the primary key of the mining app current stage
	 * @return the mining app current stage
	 * @throws PortalException if a mining app current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.mining.lease.application.service.model.MiningAppCurrentStage
			getMiningAppCurrentStage(long miningAppCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningAppCurrentStageLocalService.getMiningAppCurrentStage(
			miningAppCurrentStageId);
	}

	/**
	 * Returns the mining app current stage matching the UUID and group.
	 *
	 * @param uuid the mining app current stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mining app current stage
	 * @throws PortalException if a matching mining app current stage could not be found
	 */
	@Override
	public com.nbp.mining.lease.application.service.model.MiningAppCurrentStage
			getMiningAppCurrentStageByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningAppCurrentStageLocalService.
			getMiningAppCurrentStageByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List
		<com.nbp.mining.lease.application.service.model.MiningAppCurrentStage>
			getMiningAppCurrentStages(int start, int end) {

		return _miningAppCurrentStageLocalService.getMiningAppCurrentStages(
			start, end);
	}

	/**
	 * Returns all the mining app current stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the mining app current stages
	 * @param companyId the primary key of the company
	 * @return the matching mining app current stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.mining.lease.application.service.model.MiningAppCurrentStage>
			getMiningAppCurrentStagesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _miningAppCurrentStageLocalService.
			getMiningAppCurrentStagesByUuidAndCompanyId(uuid, companyId);
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
	@Override
	public java.util.List
		<com.nbp.mining.lease.application.service.model.MiningAppCurrentStage>
			getMiningAppCurrentStagesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.mining.lease.application.service.model.
						MiningAppCurrentStage> orderByComparator) {

		return _miningAppCurrentStageLocalService.
			getMiningAppCurrentStagesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of mining app current stages.
	 *
	 * @return the number of mining app current stages
	 */
	@Override
	public int getMiningAppCurrentStagesCount() {
		return _miningAppCurrentStageLocalService.
			getMiningAppCurrentStagesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningAppCurrentStageLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningAppCurrentStageLocalService.getPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.nbp.mining.lease.application.service.model.MiningAppCurrentStage
		updateMiningAppCurrentStage(
			com.nbp.mining.lease.application.service.model.MiningAppCurrentStage
				miningAppCurrentStage) {

		return _miningAppCurrentStageLocalService.updateMiningAppCurrentStage(
			miningAppCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miningAppCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public MiningAppCurrentStageLocalService getWrappedService() {
		return _miningAppCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		MiningAppCurrentStageLocalService miningAppCurrentStageLocalService) {

		_miningAppCurrentStageLocalService = miningAppCurrentStageLocalService;
	}

	private MiningAppCurrentStageLocalService
		_miningAppCurrentStageLocalService;

}