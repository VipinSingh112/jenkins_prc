/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiningApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationStagesLocalService
 * @generated
 */
public class MiningApplicationStagesLocalServiceWrapper
	implements MiningApplicationStagesLocalService,
			   ServiceWrapper<MiningApplicationStagesLocalService> {

	public MiningApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public MiningApplicationStagesLocalServiceWrapper(
		MiningApplicationStagesLocalService
			miningApplicationStagesLocalService) {

		_miningApplicationStagesLocalService =
			miningApplicationStagesLocalService;
	}

	/**
	 * Adds the mining application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationStages the mining application stages
	 * @return the mining application stages that was added
	 */
	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationStages
		addMiningApplicationStages(
			com.nbp.mining.stage.service.model.MiningApplicationStages
				miningApplicationStages) {

		return _miningApplicationStagesLocalService.addMiningApplicationStages(
			miningApplicationStages);
	}

	/**
	 * Creates a new mining application stages with the primary key. Does not add the mining application stages to the database.
	 *
	 * @param miningStagesId the primary key for the new mining application stages
	 * @return the new mining application stages
	 */
	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationStages
		createMiningApplicationStages(long miningStagesId) {

		return _miningApplicationStagesLocalService.
			createMiningApplicationStages(miningStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the mining application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningStagesId the primary key of the mining application stages
	 * @return the mining application stages that was removed
	 * @throws PortalException if a mining application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationStages
			deleteMiningApplicationStages(long miningStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationStagesLocalService.
			deleteMiningApplicationStages(miningStagesId);
	}

	/**
	 * Deletes the mining application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationStages the mining application stages
	 * @return the mining application stages that was removed
	 */
	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationStages
		deleteMiningApplicationStages(
			com.nbp.mining.stage.service.model.MiningApplicationStages
				miningApplicationStages) {

		return _miningApplicationStagesLocalService.
			deleteMiningApplicationStages(miningApplicationStages);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miningApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miningApplicationStagesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miningApplicationStagesLocalService.dynamicQuery();
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

		return _miningApplicationStagesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationStagesModelImpl</code>.
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

		return _miningApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationStagesModelImpl</code>.
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

		return _miningApplicationStagesLocalService.dynamicQuery(
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

		return _miningApplicationStagesLocalService.dynamicQueryCount(
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

		return _miningApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationStages
		fetchMiningApplicationStages(long miningStagesId) {

		return _miningApplicationStagesLocalService.
			fetchMiningApplicationStages(miningStagesId);
	}

	/**
	 * Returns the mining application stages matching the UUID and group.
	 *
	 * @param uuid the mining application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationStages
		fetchMiningApplicationStagesByUuidAndGroupId(
			String uuid, long groupId) {

		return _miningApplicationStagesLocalService.
			fetchMiningApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miningApplicationStagesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _miningApplicationStagesLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miningApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List<String> getJadscDistinctStages() {
		return _miningApplicationStagesLocalService.getJadscDistinctStages();
	}

	@Override
	public Long getJadscSeenCases() {
		return _miningApplicationStagesLocalService.getJadscSeenCases();
	}

	@Override
	public String getManufacturingApplicaitonCurrentStages(String caseId) {
		return _miningApplicationStagesLocalService.
			getManufacturingApplicaitonCurrentStages(caseId);
	}

	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationStages
			getMining_By_CI(String caseId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return _miningApplicationStagesLocalService.getMining_By_CI(caseId);
	}

	@Override
	public String getMiningApplicaitonCurrentStages(String caseId) {
		return _miningApplicationStagesLocalService.
			getMiningApplicaitonCurrentStages(caseId);
	}

	/**
	 * Returns the mining application stages with the primary key.
	 *
	 * @param miningStagesId the primary key of the mining application stages
	 * @return the mining application stages
	 * @throws PortalException if a mining application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationStages
			getMiningApplicationStages(long miningStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationStagesLocalService.getMiningApplicationStages(
			miningStagesId);
	}

	/**
	 * Returns the mining application stages matching the UUID and group.
	 *
	 * @param uuid the mining application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mining application stages
	 * @throws PortalException if a matching mining application stages could not be found
	 */
	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationStages
			getMiningApplicationStagesByUuidAndGroupId(
				String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationStagesLocalService.
			getMiningApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the mining application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.mining.stage.service.model.impl.MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @return the range of mining application stageses
	 */
	@Override
	public java.util.List
		<com.nbp.mining.stage.service.model.MiningApplicationStages>
			getMiningApplicationStageses(int start, int end) {

		return _miningApplicationStagesLocalService.
			getMiningApplicationStageses(start, end);
	}

	/**
	 * Returns all the mining application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the mining application stageses
	 * @param companyId the primary key of the company
	 * @return the matching mining application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.mining.stage.service.model.MiningApplicationStages>
			getMiningApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _miningApplicationStagesLocalService.
			getMiningApplicationStagesesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of mining application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the mining application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching mining application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.mining.stage.service.model.MiningApplicationStages>
			getMiningApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.mining.stage.service.model.MiningApplicationStages>
						orderByComparator) {

		return _miningApplicationStagesLocalService.
			getMiningApplicationStagesesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of mining application stageses.
	 *
	 * @return the number of mining application stageses
	 */
	@Override
	public int getMiningApplicationStagesesCount() {
		return _miningApplicationStagesLocalService.
			getMiningApplicationStagesesCount();
	}

	@Override
	public java.util.List
		<com.nbp.mining.stage.service.model.MiningApplicationStages>
				getMiningByCI(String caseId)
			throws com.nbp.mining.stage.service.exception.
				NoSuchMiningApplicationStagesException {

		return _miningApplicationStagesLocalService.getMiningByCI(caseId);
	}

	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationStages
			getMiningByCI_SN(String caseId, String stageName)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return _miningApplicationStagesLocalService.getMiningByCI_SN(
			caseId, stageName);
	}

	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationStages
			getMiningByCI_ST(String caseId, String stageStatus)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return _miningApplicationStagesLocalService.getMiningByCI_ST(
			caseId, stageStatus);
	}

	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationStages
			getMiningByCI_ST_SN(
				String caseId, String stageStatus, String stageName)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return _miningApplicationStagesLocalService.getMiningByCI_ST_SN(
			caseId, stageStatus, stageName);
	}

	@Override
	public java.util.List<String> getMiningDistinctStages() {
		return _miningApplicationStagesLocalService.getMiningDistinctStages();
	}

	@Override
	public Long getMiningSeenCases() {
		return _miningApplicationStagesLocalService.getMiningSeenCases();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miningApplicationStagesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miningApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.mining.stage.service.model.MiningApplicationStages>
			gtMiningApplicationStages_By_SN(String stageName) {

		return _miningApplicationStagesLocalService.
			gtMiningApplicationStages_By_SN(stageName);
	}

	/**
	 * Updates the mining application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiningApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miningApplicationStages the mining application stages
	 * @return the mining application stages that was updated
	 */
	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationStages
		updateMiningApplicationStages(
			com.nbp.mining.stage.service.model.MiningApplicationStages
				miningApplicationStages) {

		return _miningApplicationStagesLocalService.
			updateMiningApplicationStages(miningApplicationStages);
	}

	@Override
	public com.nbp.mining.stage.service.model.MiningApplicationStages
		updateMiningApplicationStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return _miningApplicationStagesLocalService.
			updateMiningApplicationStages(
				caseId, stageName, stageStartDate, stageEndDate, duration,
				stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miningApplicationStagesLocalService.getBasePersistence();
	}

	@Override
	public MiningApplicationStagesLocalService getWrappedService() {
		return _miningApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		MiningApplicationStagesLocalService
			miningApplicationStagesLocalService) {

		_miningApplicationStagesLocalService =
			miningApplicationStagesLocalService;
	}

	private MiningApplicationStagesLocalService
		_miningApplicationStagesLocalService;

}