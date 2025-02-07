/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FireBrigadeApplicationStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeApplicationStageLocalService
 * @generated
 */
public class FireBrigadeApplicationStageLocalServiceWrapper
	implements FireBrigadeApplicationStageLocalService,
			   ServiceWrapper<FireBrigadeApplicationStageLocalService> {

	public FireBrigadeApplicationStageLocalServiceWrapper() {
		this(null);
	}

	public FireBrigadeApplicationStageLocalServiceWrapper(
		FireBrigadeApplicationStageLocalService
			fireBrigadeApplicationStageLocalService) {

		_fireBrigadeApplicationStageLocalService =
			fireBrigadeApplicationStageLocalService;
	}

	/**
	 * Adds the fire brigade application stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeApplicationStage the fire brigade application stage
	 * @return the fire brigade application stage that was added
	 */
	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage
		addFireBrigadeApplicationStage(
			com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage
				fireBrigadeApplicationStage) {

		return _fireBrigadeApplicationStageLocalService.
			addFireBrigadeApplicationStage(fireBrigadeApplicationStage);
	}

	/**
	 * Creates a new fire brigade application stage with the primary key. Does not add the fire brigade application stage to the database.
	 *
	 * @param fireBrigadeAppStageId the primary key for the new fire brigade application stage
	 * @return the new fire brigade application stage
	 */
	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage
		createFireBrigadeApplicationStage(long fireBrigadeAppStageId) {

		return _fireBrigadeApplicationStageLocalService.
			createFireBrigadeApplicationStage(fireBrigadeAppStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeApplicationStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the fire brigade application stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeApplicationStage the fire brigade application stage
	 * @return the fire brigade application stage that was removed
	 */
	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage
		deleteFireBrigadeApplicationStage(
			com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage
				fireBrigadeApplicationStage) {

		return _fireBrigadeApplicationStageLocalService.
			deleteFireBrigadeApplicationStage(fireBrigadeApplicationStage);
	}

	/**
	 * Deletes the fire brigade application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeAppStageId the primary key of the fire brigade application stage
	 * @return the fire brigade application stage that was removed
	 * @throws PortalException if a fire brigade application stage with the primary key could not be found
	 */
	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage
			deleteFireBrigadeApplicationStage(long fireBrigadeAppStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeApplicationStageLocalService.
			deleteFireBrigadeApplicationStage(fireBrigadeAppStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeApplicationStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fireBrigadeApplicationStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fireBrigadeApplicationStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fireBrigadeApplicationStageLocalService.dynamicQuery();
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

		return _fireBrigadeApplicationStageLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeApplicationStageModelImpl</code>.
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

		return _fireBrigadeApplicationStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeApplicationStageModelImpl</code>.
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

		return _fireBrigadeApplicationStageLocalService.dynamicQuery(
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

		return _fireBrigadeApplicationStageLocalService.dynamicQueryCount(
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

		return _fireBrigadeApplicationStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage
		fetchFireBrigadeApplicationStage(long fireBrigadeAppStageId) {

		return _fireBrigadeApplicationStageLocalService.
			fetchFireBrigadeApplicationStage(fireBrigadeAppStageId);
	}

	/**
	 * Returns the fire brigade application stage matching the UUID and group.
	 *
	 * @param uuid the fire brigade application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage
		fetchFireBrigadeApplicationStageByUuidAndGroupId(
			String uuid, long groupId) {

		return _fireBrigadeApplicationStageLocalService.
			fetchFireBrigadeApplicationStageByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fireBrigadeApplicationStageLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _fireBrigadeApplicationStageLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public java.util.List<String> getFBDistinctStages() {
		return _fireBrigadeApplicationStageLocalService.getFBDistinctStages();
	}

	@Override
	public Long getFBSeenCases() {
		return _fireBrigadeApplicationStageLocalService.getFBSeenCases();
	}

	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage
			getFireBrigade_By_StageStatus(String stageStatus)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return _fireBrigadeApplicationStageLocalService.
			getFireBrigade_By_StageStatus(stageStatus);
	}

	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage
			getFireBrigade_ByCI_SN(String caseId, String stageName)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return _fireBrigadeApplicationStageLocalService.getFireBrigade_ByCI_SN(
			caseId, stageName);
	}

	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage
			getFireBrigade_ByCI_SN_SS(
				String caseId, String stageName, String stageStatus)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return _fireBrigadeApplicationStageLocalService.
			getFireBrigade_ByCI_SN_SS(caseId, stageName, stageStatus);
	}

	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage
			getFireBrigade_ByCI_SS(String caseId, String stageStatus)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return _fireBrigadeApplicationStageLocalService.getFireBrigade_ByCI_SS(
			caseId, stageStatus);
	}

	@Override
	public java.util.List
		<com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage>
			getFireBrigade_BySN(String stageName) {

		return _fireBrigadeApplicationStageLocalService.getFireBrigade_BySN(
			stageName);
	}

	/**
	 * Returns the fire brigade application stage with the primary key.
	 *
	 * @param fireBrigadeAppStageId the primary key of the fire brigade application stage
	 * @return the fire brigade application stage
	 * @throws PortalException if a fire brigade application stage with the primary key could not be found
	 */
	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage
			getFireBrigadeApplicationStage(long fireBrigadeAppStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeApplicationStageLocalService.
			getFireBrigadeApplicationStage(fireBrigadeAppStageId);
	}

	/**
	 * Returns the fire brigade application stage matching the UUID and group.
	 *
	 * @param uuid the fire brigade application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching fire brigade application stage
	 * @throws PortalException if a matching fire brigade application stage could not be found
	 */
	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage
			getFireBrigadeApplicationStageByUuidAndGroupId(
				String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeApplicationStageLocalService.
			getFireBrigadeApplicationStageByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the fire brigade application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @return the range of fire brigade application stages
	 */
	@Override
	public java.util.List
		<com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage>
			getFireBrigadeApplicationStages(int start, int end) {

		return _fireBrigadeApplicationStageLocalService.
			getFireBrigadeApplicationStages(start, end);
	}

	/**
	 * Returns all the fire brigade application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the fire brigade application stages
	 * @param companyId the primary key of the company
	 * @return the matching fire brigade application stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage>
			getFireBrigadeApplicationStagesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _fireBrigadeApplicationStageLocalService.
			getFireBrigadeApplicationStagesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of fire brigade application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the fire brigade application stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching fire brigade application stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage>
			getFireBrigadeApplicationStagesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.fire.brigade.stage.service.model.
						FireBrigadeApplicationStage> orderByComparator) {

		return _fireBrigadeApplicationStageLocalService.
			getFireBrigadeApplicationStagesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of fire brigade application stages.
	 *
	 * @return the number of fire brigade application stages
	 */
	@Override
	public int getFireBrigadeApplicationStagesCount() {
		return _fireBrigadeApplicationStageLocalService.
			getFireBrigadeApplicationStagesCount();
	}

	@Override
	public java.util.List
		<com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage>
			getFireBrigadeByCaseId(String caseId) {

		return _fireBrigadeApplicationStageLocalService.getFireBrigadeByCaseId(
			caseId);
	}

	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage
			getFireBrigadeByCI(String caseId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return _fireBrigadeApplicationStageLocalService.getFireBrigadeByCI(
			caseId);
	}

	@Override
	public String getFireBrigadeCurrentStages(String caseId) {
		return _fireBrigadeApplicationStageLocalService.
			getFireBrigadeCurrentStages(caseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fireBrigadeApplicationStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeApplicationStageLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeApplicationStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the fire brigade application stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeApplicationStage the fire brigade application stage
	 * @return the fire brigade application stage that was updated
	 */
	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage
		updateFireBrigadeApplicationStage(
			com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage
				fireBrigadeApplicationStage) {

		return _fireBrigadeApplicationStageLocalService.
			updateFireBrigadeApplicationStage(fireBrigadeApplicationStage);
	}

	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage
		updateFireBrigadeAppStage(
			String caseId, String stageName, String stageStatus,
			java.util.Date stageStartDate, java.util.Date stageEndDate,
			String duration) {

		return _fireBrigadeApplicationStageLocalService.
			updateFireBrigadeAppStage(
				caseId, stageName, stageStatus, stageStartDate, stageEndDate,
				duration);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _fireBrigadeApplicationStageLocalService.getBasePersistence();
	}

	@Override
	public FireBrigadeApplicationStageLocalService getWrappedService() {
		return _fireBrigadeApplicationStageLocalService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeApplicationStageLocalService
			fireBrigadeApplicationStageLocalService) {

		_fireBrigadeApplicationStageLocalService =
			fireBrigadeApplicationStageLocalService;
	}

	private FireBrigadeApplicationStageLocalService
		_fireBrigadeApplicationStageLocalService;

}