/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link WraApplicationStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see WraApplicationStageLocalService
 * @generated
 */
public class WraApplicationStageLocalServiceWrapper
	implements ServiceWrapper<WraApplicationStageLocalService>,
			   WraApplicationStageLocalService {

	public WraApplicationStageLocalServiceWrapper() {
		this(null);
	}

	public WraApplicationStageLocalServiceWrapper(
		WraApplicationStageLocalService wraApplicationStageLocalService) {

		_wraApplicationStageLocalService = wraApplicationStageLocalService;
	}

	/**
	 * Adds the wra application stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraApplicationStage the wra application stage
	 * @return the wra application stage that was added
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraApplicationStage
		addWraApplicationStage(
			com.nbp.wra.stage.service.model.WraApplicationStage
				wraApplicationStage) {

		return _wraApplicationStageLocalService.addWraApplicationStage(
			wraApplicationStage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraApplicationStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new wra application stage with the primary key. Does not add the wra application stage to the database.
	 *
	 * @param wraApplicationStageId the primary key for the new wra application stage
	 * @return the new wra application stage
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraApplicationStage
		createWraApplicationStage(long wraApplicationStageId) {

		return _wraApplicationStageLocalService.createWraApplicationStage(
			wraApplicationStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraApplicationStageLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the wra application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraApplicationStageId the primary key of the wra application stage
	 * @return the wra application stage that was removed
	 * @throws PortalException if a wra application stage with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraApplicationStage
			deleteWraApplicationStage(long wraApplicationStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraApplicationStageLocalService.deleteWraApplicationStage(
			wraApplicationStageId);
	}

	/**
	 * Deletes the wra application stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraApplicationStage the wra application stage
	 * @return the wra application stage that was removed
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraApplicationStage
		deleteWraApplicationStage(
			com.nbp.wra.stage.service.model.WraApplicationStage
				wraApplicationStage) {

		return _wraApplicationStageLocalService.deleteWraApplicationStage(
			wraApplicationStage);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _wraApplicationStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _wraApplicationStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _wraApplicationStageLocalService.dynamicQuery();
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

		return _wraApplicationStageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraApplicationStageModelImpl</code>.
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

		return _wraApplicationStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraApplicationStageModelImpl</code>.
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

		return _wraApplicationStageLocalService.dynamicQuery(
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

		return _wraApplicationStageLocalService.dynamicQueryCount(dynamicQuery);
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

		return _wraApplicationStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.wra.stage.service.model.WraApplicationStage
		fetchWraApplicationStage(long wraApplicationStageId) {

		return _wraApplicationStageLocalService.fetchWraApplicationStage(
			wraApplicationStageId);
	}

	/**
	 * Returns the wra application stage matching the UUID and group.
	 *
	 * @param uuid the wra application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraApplicationStage
		fetchWraApplicationStageByUuidAndGroupId(String uuid, long groupId) {

		return _wraApplicationStageLocalService.
			fetchWraApplicationStageByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.nbp.wra.stage.service.model.WraApplicationStage
			get_WRA_Stage_By_CI(String caseId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return _wraApplicationStageLocalService.get_WRA_Stage_By_CI(caseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _wraApplicationStageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _wraApplicationStageLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _wraApplicationStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _wraApplicationStageLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraApplicationStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public String getWraApplicationCurrentStages(String caseId) {
		return _wraApplicationStageLocalService.getWraApplicationCurrentStages(
			caseId);
	}

	/**
	 * Returns the wra application stage with the primary key.
	 *
	 * @param wraApplicationStageId the primary key of the wra application stage
	 * @return the wra application stage
	 * @throws PortalException if a wra application stage with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraApplicationStage
			getWraApplicationStage(long wraApplicationStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraApplicationStageLocalService.getWraApplicationStage(
			wraApplicationStageId);
	}

	@Override
	public com.nbp.wra.stage.service.model.WraApplicationStage
		getWraApplicationStage_By_CI(String stageName) {

		return _wraApplicationStageLocalService.getWraApplicationStage_By_CI(
			stageName);
	}

	/**
	 * Returns the wra application stage matching the UUID and group.
	 *
	 * @param uuid the wra application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching wra application stage
	 * @throws PortalException if a matching wra application stage could not be found
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraApplicationStage
			getWraApplicationStageByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraApplicationStageLocalService.
			getWraApplicationStageByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the wra application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @return the range of wra application stages
	 */
	@Override
	public java.util.List<com.nbp.wra.stage.service.model.WraApplicationStage>
		getWraApplicationStages(int start, int end) {

		return _wraApplicationStageLocalService.getWraApplicationStages(
			start, end);
	}

	/**
	 * Returns all the wra application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the wra application stages
	 * @param companyId the primary key of the company
	 * @return the matching wra application stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.nbp.wra.stage.service.model.WraApplicationStage>
		getWraApplicationStagesByUuidAndCompanyId(String uuid, long companyId) {

		return _wraApplicationStageLocalService.
			getWraApplicationStagesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of wra application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the wra application stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching wra application stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.nbp.wra.stage.service.model.WraApplicationStage>
		getWraApplicationStagesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.nbp.wra.stage.service.model.WraApplicationStage>
					orderByComparator) {

		return _wraApplicationStageLocalService.
			getWraApplicationStagesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of wra application stages.
	 *
	 * @return the number of wra application stages
	 */
	@Override
	public int getWraApplicationStagesCount() {
		return _wraApplicationStageLocalService.getWraApplicationStagesCount();
	}

	@Override
	public java.util.List<com.nbp.wra.stage.service.model.WraApplicationStage>
			getWraByCI(String caseId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return _wraApplicationStageLocalService.getWraByCI(caseId);
	}

	@Override
	public com.nbp.wra.stage.service.model.WraApplicationStage getWraByCI_SN(
			String caseId, String stageName)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return _wraApplicationStageLocalService.getWraByCI_SN(
			caseId, stageName);
	}

	@Override
	public com.nbp.wra.stage.service.model.WraApplicationStage getWraByCI_ST(
			String caseId, String stageStatus)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return _wraApplicationStageLocalService.getWraByCI_ST(
			caseId, stageStatus);
	}

	@Override
	public com.nbp.wra.stage.service.model.WraApplicationStage getWraByCI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return _wraApplicationStageLocalService.getWraByCI_ST_SN(
			caseId, stageStatus, stageName);
	}

	@Override
	public java.util.List<String> getWRADistinctStages() {
		return _wraApplicationStageLocalService.getWRADistinctStages();
	}

	@Override
	public Long getWRASeenCases() {
		return _wraApplicationStageLocalService.getWRASeenCases();
	}

	@Override
	public java.util.List<com.nbp.wra.stage.service.model.WraApplicationStage>
		gtWraApplicationStage_By_SN(String stageName) {

		return _wraApplicationStageLocalService.gtWraApplicationStage_By_SN(
			stageName);
	}

	@Override
	public com.nbp.wra.stage.service.model.WraApplicationStage
		updateWraApplicationStage(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return _wraApplicationStageLocalService.updateWraApplicationStage(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	/**
	 * Updates the wra application stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraApplicationStage the wra application stage
	 * @return the wra application stage that was updated
	 */
	@Override
	public com.nbp.wra.stage.service.model.WraApplicationStage
		updateWraApplicationStage(
			com.nbp.wra.stage.service.model.WraApplicationStage
				wraApplicationStage) {

		return _wraApplicationStageLocalService.updateWraApplicationStage(
			wraApplicationStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _wraApplicationStageLocalService.getBasePersistence();
	}

	@Override
	public WraApplicationStageLocalService getWrappedService() {
		return _wraApplicationStageLocalService;
	}

	@Override
	public void setWrappedService(
		WraApplicationStageLocalService wraApplicationStageLocalService) {

		_wraApplicationStageLocalService = wraApplicationStageLocalService;
	}

	private WraApplicationStageLocalService _wraApplicationStageLocalService;

}