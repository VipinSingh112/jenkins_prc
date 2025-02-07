/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationStagesLocalService
 * @generated
 */
public class CannabisApplicationStagesLocalServiceWrapper
	implements CannabisApplicationStagesLocalService,
			   ServiceWrapper<CannabisApplicationStagesLocalService> {

	public CannabisApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public CannabisApplicationStagesLocalServiceWrapper(
		CannabisApplicationStagesLocalService
			cannabisApplicationStagesLocalService) {

		_cannabisApplicationStagesLocalService =
			cannabisApplicationStagesLocalService;
	}

	/**
	 * Adds the cannabis application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationStages the cannabis application stages
	 * @return the cannabis application stages that was added
	 */
	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisApplicationStages addCannabisApplicationStages(
				com.npm.cannabis.application.stages.services.model.
					CannabisApplicationStages cannabisApplicationStages) {

		return _cannabisApplicationStagesLocalService.
			addCannabisApplicationStages(cannabisApplicationStages);
	}

	/**
	 * Creates a new cannabis application stages with the primary key. Does not add the cannabis application stages to the database.
	 *
	 * @param cannabisApplicationstageId the primary key for the new cannabis application stages
	 * @return the new cannabis application stages
	 */
	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisApplicationStages createCannabisApplicationStages(
				long cannabisApplicationstageId) {

		return _cannabisApplicationStagesLocalService.
			createCannabisApplicationStages(cannabisApplicationstageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the cannabis application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationStages the cannabis application stages
	 * @return the cannabis application stages that was removed
	 */
	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisApplicationStages deleteCannabisApplicationStages(
				com.npm.cannabis.application.stages.services.model.
					CannabisApplicationStages cannabisApplicationStages) {

		return _cannabisApplicationStagesLocalService.
			deleteCannabisApplicationStages(cannabisApplicationStages);
	}

	/**
	 * Deletes the cannabis application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationstageId the primary key of the cannabis application stages
	 * @return the cannabis application stages that was removed
	 * @throws PortalException if a cannabis application stages with the primary key could not be found
	 */
	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisApplicationStages deleteCannabisApplicationStages(
					long cannabisApplicationstageId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationStagesLocalService.
			deleteCannabisApplicationStages(cannabisApplicationstageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisApplicationStagesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisApplicationStagesLocalService.dynamicQuery();
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

		return _cannabisApplicationStagesLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationStagesModelImpl</code>.
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

		return _cannabisApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationStagesModelImpl</code>.
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

		return _cannabisApplicationStagesLocalService.dynamicQuery(
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

		return _cannabisApplicationStagesLocalService.dynamicQueryCount(
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

		return _cannabisApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisApplicationStages fetchCannabisApplicationStages(
				long cannabisApplicationstageId) {

		return _cannabisApplicationStagesLocalService.
			fetchCannabisApplicationStages(cannabisApplicationstageId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisApplicationStagesLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisApplicationStages getCannabisApplicationStage(
					String caseId, String stageName)
				throws com.npm.cannabis.application.stages.services.exception.
					NoSuchCannabisApplicationStagesException {

		return _cannabisApplicationStagesLocalService.
			getCannabisApplicationStage(caseId, stageName);
	}

	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisApplicationStages getCannabisApplicationStage(
					String caseId, String stageName, String stageStatus)
				throws com.npm.cannabis.application.stages.services.exception.
					NoSuchCannabisApplicationStagesException {

		return _cannabisApplicationStagesLocalService.
			getCannabisApplicationStage(caseId, stageName, stageStatus);
	}

	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			CannabisApplicationStages> getCannabisApplicationStageName(
					String stageName)
				throws com.npm.cannabis.application.stages.services.exception.
					NoSuchCannabisApplicationStagesException {

		return _cannabisApplicationStagesLocalService.
			getCannabisApplicationStageName(stageName);
	}

	/**
	 * Returns the cannabis application stages with the primary key.
	 *
	 * @param cannabisApplicationstageId the primary key of the cannabis application stages
	 * @return the cannabis application stages
	 * @throws PortalException if a cannabis application stages with the primary key could not be found
	 */
	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisApplicationStages getCannabisApplicationStages(
					long cannabisApplicationstageId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationStagesLocalService.
			getCannabisApplicationStages(cannabisApplicationstageId);
	}

	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			CannabisApplicationStages> getCannabisApplicationStages(
					String caseId)
				throws com.npm.cannabis.application.stages.services.exception.
					NoSuchCannabisApplicationStagesException {

		return _cannabisApplicationStagesLocalService.
			getCannabisApplicationStages(caseId);
	}

	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisApplicationStages getCannabisApplicationStagesAndStatus(
					String caseId, String stageStatus)
				throws com.npm.cannabis.application.stages.services.exception.
					NoSuchCannabisApplicationStagesException {

		return _cannabisApplicationStagesLocalService.
			getCannabisApplicationStagesAndStatus(caseId, stageStatus);
	}

	/**
	 * Returns a range of all the cannabis application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @return the range of cannabis application stageses
	 */
	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			CannabisApplicationStages> getCannabisApplicationStageses(
				int start, int end) {

		return _cannabisApplicationStagesLocalService.
			getCannabisApplicationStageses(start, end);
	}

	/**
	 * Returns the number of cannabis application stageses.
	 *
	 * @return the number of cannabis application stageses
	 */
	@Override
	public int getCannabisApplicationStagesesCount() {
		return _cannabisApplicationStagesLocalService.
			getCannabisApplicationStagesesCount();
	}

	@Override
	public String getCannabisCurrentStages(String caseId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return _cannabisApplicationStagesLocalService.getCannabisCurrentStages(
			caseId);
	}

	@Override
	public java.util.List<String> getCannabisDistinctStages() {
		return _cannabisApplicationStagesLocalService.
			getCannabisDistinctStages();
	}

	@Override
	public Long getCannabisSeenCases() {
		return _cannabisApplicationStagesLocalService.getCannabisSeenCases();
	}

	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			CannabisApplicationStages> getCAS_StageName_StageStatus(
					String stageName, String status)
				throws com.npm.cannabis.application.stages.services.exception.
					NoSuchCannabisApplicationStagesException {

		return _cannabisApplicationStagesLocalService.
			getCAS_StageName_StageStatus(stageName, status);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationStagesLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the cannabis application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationStages the cannabis application stages
	 * @return the cannabis application stages that was updated
	 */
	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisApplicationStages updateCannabisApplicationStages(
				com.npm.cannabis.application.stages.services.model.
					CannabisApplicationStages cannabisApplicationStages) {

		return _cannabisApplicationStagesLocalService.
			updateCannabisApplicationStages(cannabisApplicationStages);
	}

	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisApplicationStages updateCannabisApplicationStages(
					String caseId, String stageName,
					java.util.Date stageStartDate, java.util.Date stageEndDate,
					String duration, String stageStatus)
				throws com.npm.cannabis.application.stages.services.exception.
					NoSuchCannabisApplicationStagesException {

		return _cannabisApplicationStagesLocalService.
			updateCannabisApplicationStages(
				caseId, stageName, stageStartDate, stageEndDate, duration,
				stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisApplicationStagesLocalService.getBasePersistence();
	}

	@Override
	public CannabisApplicationStagesLocalService getWrappedService() {
		return _cannabisApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationStagesLocalService
			cannabisApplicationStagesLocalService) {

		_cannabisApplicationStagesLocalService =
			cannabisApplicationStagesLocalService;
	}

	private CannabisApplicationStagesLocalService
		_cannabisApplicationStagesLocalService;

}