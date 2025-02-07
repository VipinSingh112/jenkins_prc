/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link QuarryApplicationStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationStageLocalService
 * @generated
 */
public class QuarryApplicationStageLocalServiceWrapper
	implements QuarryApplicationStageLocalService,
			   ServiceWrapper<QuarryApplicationStageLocalService> {

	public QuarryApplicationStageLocalServiceWrapper() {
		this(null);
	}

	public QuarryApplicationStageLocalServiceWrapper(
		QuarryApplicationStageLocalService quarryApplicationStageLocalService) {

		_quarryApplicationStageLocalService =
			quarryApplicationStageLocalService;
	}

	/**
	 * Adds the quarry application stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationStage the quarry application stage
	 * @return the quarry application stage that was added
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryApplicationStage
		addQuarryApplicationStage(
			com.nbp.quarry.stage.service.model.QuarryApplicationStage
				quarryApplicationStage) {

		return _quarryApplicationStageLocalService.addQuarryApplicationStage(
			quarryApplicationStage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new quarry application stage with the primary key. Does not add the quarry application stage to the database.
	 *
	 * @param quarryAppStagesId the primary key for the new quarry application stage
	 * @return the new quarry application stage
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryApplicationStage
		createQuarryApplicationStage(long quarryAppStagesId) {

		return _quarryApplicationStageLocalService.createQuarryApplicationStage(
			quarryAppStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationStageLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the quarry application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryAppStagesId the primary key of the quarry application stage
	 * @return the quarry application stage that was removed
	 * @throws PortalException if a quarry application stage with the primary key could not be found
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryApplicationStage
			deleteQuarryApplicationStage(long quarryAppStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationStageLocalService.deleteQuarryApplicationStage(
			quarryAppStagesId);
	}

	/**
	 * Deletes the quarry application stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationStage the quarry application stage
	 * @return the quarry application stage that was removed
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryApplicationStage
		deleteQuarryApplicationStage(
			com.nbp.quarry.stage.service.model.QuarryApplicationStage
				quarryApplicationStage) {

		return _quarryApplicationStageLocalService.deleteQuarryApplicationStage(
			quarryApplicationStage);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _quarryApplicationStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _quarryApplicationStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _quarryApplicationStageLocalService.dynamicQuery();
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

		return _quarryApplicationStageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryApplicationStageModelImpl</code>.
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

		return _quarryApplicationStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryApplicationStageModelImpl</code>.
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

		return _quarryApplicationStageLocalService.dynamicQuery(
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

		return _quarryApplicationStageLocalService.dynamicQueryCount(
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

		return _quarryApplicationStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.quarry.stage.service.model.QuarryApplicationStage
		fetchQuarryApplicationStage(long quarryAppStagesId) {

		return _quarryApplicationStageLocalService.fetchQuarryApplicationStage(
			quarryAppStagesId);
	}

	/**
	 * Returns the quarry application stage matching the UUID and group.
	 *
	 * @param uuid the quarry application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryApplicationStage
		fetchQuarryApplicationStageByUuidAndGroupId(String uuid, long groupId) {

		return _quarryApplicationStageLocalService.
			fetchQuarryApplicationStageByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _quarryApplicationStageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _quarryApplicationStageLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public java.util.List<String> getFilmDistinctStages() {
		return _quarryApplicationStageLocalService.getFilmDistinctStages();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _quarryApplicationStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public String getManufacturingApplicaitonCurrentStages(String caseId) {
		return _quarryApplicationStageLocalService.
			getManufacturingApplicaitonCurrentStages(caseId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _quarryApplicationStageLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the quarry application stage with the primary key.
	 *
	 * @param quarryAppStagesId the primary key of the quarry application stage
	 * @return the quarry application stage
	 * @throws PortalException if a quarry application stage with the primary key could not be found
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryApplicationStage
			getQuarryApplicationStage(long quarryAppStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationStageLocalService.getQuarryApplicationStage(
			quarryAppStagesId);
	}

	/**
	 * Returns the quarry application stage matching the UUID and group.
	 *
	 * @param uuid the quarry application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching quarry application stage
	 * @throws PortalException if a matching quarry application stage could not be found
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryApplicationStage
			getQuarryApplicationStageByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _quarryApplicationStageLocalService.
			getQuarryApplicationStageByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the quarry application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @return the range of quarry application stages
	 */
	@Override
	public java.util.List
		<com.nbp.quarry.stage.service.model.QuarryApplicationStage>
			getQuarryApplicationStages(int start, int end) {

		return _quarryApplicationStageLocalService.getQuarryApplicationStages(
			start, end);
	}

	/**
	 * Returns all the quarry application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the quarry application stages
	 * @param companyId the primary key of the company
	 * @return the matching quarry application stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.quarry.stage.service.model.QuarryApplicationStage>
			getQuarryApplicationStagesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _quarryApplicationStageLocalService.
			getQuarryApplicationStagesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of quarry application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the quarry application stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching quarry application stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.quarry.stage.service.model.QuarryApplicationStage>
			getQuarryApplicationStagesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.quarry.stage.service.model.QuarryApplicationStage>
						orderByComparator) {

		return _quarryApplicationStageLocalService.
			getQuarryApplicationStagesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of quarry application stages.
	 *
	 * @return the number of quarry application stages
	 */
	@Override
	public int getQuarryApplicationStagesCount() {
		return _quarryApplicationStageLocalService.
			getQuarryApplicationStagesCount();
	}

	@Override
	public java.util.List
		<com.nbp.quarry.stage.service.model.QuarryApplicationStage>
				getQuarryByCI(String caseId)
			throws com.nbp.quarry.stage.service.exception.
				NoSuchQuarryApplicationStageException {

		return _quarryApplicationStageLocalService.getQuarryByCI(caseId);
	}

	@Override
	public com.nbp.quarry.stage.service.model.QuarryApplicationStage
			getQuarryByCI_SN(String caseId, String stageName)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return _quarryApplicationStageLocalService.getQuarryByCI_SN(
			caseId, stageName);
	}

	@Override
	public com.nbp.quarry.stage.service.model.QuarryApplicationStage
			getQuarryByCI_ST(String caseId, String stageStatus)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return _quarryApplicationStageLocalService.getQuarryByCI_ST(
			caseId, stageStatus);
	}

	@Override
	public com.nbp.quarry.stage.service.model.QuarryApplicationStage
			getQuarryByCI_ST_SN(
				String caseId, String stageStatus, String stageName)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return _quarryApplicationStageLocalService.getQuarryByCI_ST_SN(
			caseId, stageStatus, stageName);
	}

	@Override
	public com.nbp.quarry.stage.service.model.QuarryApplicationStage
			getQuarryByCId(String caseId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return _quarryApplicationStageLocalService.getQuarryByCId(caseId);
	}

	@Override
	public java.util.List<String> getQuarryDistinctStages() {
		return _quarryApplicationStageLocalService.getQuarryDistinctStages();
	}

	@Override
	public Long getQuarrySeenCases() {
		return _quarryApplicationStageLocalService.getQuarrySeenCases();
	}

	@Override
	public java.util.List
		<com.nbp.quarry.stage.service.model.QuarryApplicationStage>
			gtQuarryApplicationStage_By_SN(String stageName) {

		return _quarryApplicationStageLocalService.
			gtQuarryApplicationStage_By_SN(stageName);
	}

	/**
	 * Updates the quarry application stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationStage the quarry application stage
	 * @return the quarry application stage that was updated
	 */
	@Override
	public com.nbp.quarry.stage.service.model.QuarryApplicationStage
		updateQuarryApplicationStage(
			com.nbp.quarry.stage.service.model.QuarryApplicationStage
				quarryApplicationStage) {

		return _quarryApplicationStageLocalService.updateQuarryApplicationStage(
			quarryApplicationStage);
	}

	@Override
	public com.nbp.quarry.stage.service.model.QuarryApplicationStage
		updateQuarryApplicationStage(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return _quarryApplicationStageLocalService.updateQuarryApplicationStage(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _quarryApplicationStageLocalService.getBasePersistence();
	}

	@Override
	public QuarryApplicationStageLocalService getWrappedService() {
		return _quarryApplicationStageLocalService;
	}

	@Override
	public void setWrappedService(
		QuarryApplicationStageLocalService quarryApplicationStageLocalService) {

		_quarryApplicationStageLocalService =
			quarryApplicationStageLocalService;
	}

	private QuarryApplicationStageLocalService
		_quarryApplicationStageLocalService;

}