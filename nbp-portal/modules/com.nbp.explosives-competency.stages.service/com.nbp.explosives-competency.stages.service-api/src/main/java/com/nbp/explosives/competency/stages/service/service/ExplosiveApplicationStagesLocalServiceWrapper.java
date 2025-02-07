/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ExplosiveApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveApplicationStagesLocalService
 * @generated
 */
public class ExplosiveApplicationStagesLocalServiceWrapper
	implements ExplosiveApplicationStagesLocalService,
			   ServiceWrapper<ExplosiveApplicationStagesLocalService> {

	public ExplosiveApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public ExplosiveApplicationStagesLocalServiceWrapper(
		ExplosiveApplicationStagesLocalService
			explosiveApplicationStagesLocalService) {

		_explosiveApplicationStagesLocalService =
			explosiveApplicationStagesLocalService;
	}

	/**
	 * Adds the explosive application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveApplicationStages the explosive application stages
	 * @return the explosive application stages that was added
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveApplicationStages addExplosiveApplicationStages(
			com.nbp.explosives.competency.stages.service.model.
				ExplosiveApplicationStages explosiveApplicationStages) {

		return _explosiveApplicationStagesLocalService.
			addExplosiveApplicationStages(explosiveApplicationStages);
	}

	/**
	 * Creates a new explosive application stages with the primary key. Does not add the explosive application stages to the database.
	 *
	 * @param expApplicationStagesId the primary key for the new explosive application stages
	 * @return the new explosive application stages
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveApplicationStages createExplosiveApplicationStages(
			long expApplicationStagesId) {

		return _explosiveApplicationStagesLocalService.
			createExplosiveApplicationStages(expApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the explosive application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveApplicationStages the explosive application stages
	 * @return the explosive application stages that was removed
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveApplicationStages deleteExplosiveApplicationStages(
			com.nbp.explosives.competency.stages.service.model.
				ExplosiveApplicationStages explosiveApplicationStages) {

		return _explosiveApplicationStagesLocalService.
			deleteExplosiveApplicationStages(explosiveApplicationStages);
	}

	/**
	 * Deletes the explosive application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param expApplicationStagesId the primary key of the explosive application stages
	 * @return the explosive application stages that was removed
	 * @throws PortalException if a explosive application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveApplicationStages deleteExplosiveApplicationStages(
				long expApplicationStagesId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveApplicationStagesLocalService.
			deleteExplosiveApplicationStages(expApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _explosiveApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _explosiveApplicationStagesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _explosiveApplicationStagesLocalService.dynamicQuery();
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

		return _explosiveApplicationStagesLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveApplicationStagesModelImpl</code>.
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

		return _explosiveApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveApplicationStagesModelImpl</code>.
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

		return _explosiveApplicationStagesLocalService.dynamicQuery(
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

		return _explosiveApplicationStagesLocalService.dynamicQueryCount(
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

		return _explosiveApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveApplicationStages fetchExplosiveApplicationStages(
			long expApplicationStagesId) {

		return _explosiveApplicationStagesLocalService.
			fetchExplosiveApplicationStages(expApplicationStagesId);
	}

	/**
	 * Returns the explosive application stages matching the UUID and group.
	 *
	 * @param uuid the explosive application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveApplicationStages
			fetchExplosiveApplicationStagesByUuidAndGroupId(
				String uuid, long groupId) {

		return _explosiveApplicationStagesLocalService.
			fetchExplosiveApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _explosiveApplicationStagesLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.explosives.competency.stages.service.model.
			ExplosiveApplicationStages> getCAS_BY_SN(String stageName) {

		return _explosiveApplicationStagesLocalService.getCAS_BY_SN(stageName);
	}

	@Override
	public java.util.List
		<com.nbp.explosives.competency.stages.service.model.
			ExplosiveApplicationStages> getCAS_CaseId(String caseId) {

		return _explosiveApplicationStagesLocalService.getCAS_CaseId(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.explosives.competency.stages.service.model.
			ExplosiveApplicationStages> getCAS_SNAndSS(
				String stageName, String status) {

		return _explosiveApplicationStagesLocalService.getCAS_SNAndSS(
			stageName, status);
	}

	@Override
	public String getCretiveCurrentStages(String caseId) {
		return _explosiveApplicationStagesLocalService.getCretiveCurrentStages(
			caseId);
	}

	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveApplicationStages getEXP_By_CaseId(String caseId)
			throws com.nbp.explosives.competency.stages.service.exception.
				NoSuchExplosiveApplicationStagesException {

		return _explosiveApplicationStagesLocalService.getEXP_By_CaseId(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.explosives.competency.stages.service.model.
			ExplosiveApplicationStages> getEXP_BY_SN(String stageName) {

		return _explosiveApplicationStagesLocalService.getEXP_BY_SN(stageName);
	}

	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveApplicationStages getEXP_CAI(long expApplicationId)
			throws com.nbp.explosives.competency.stages.service.exception.
				NoSuchExplosiveApplicationStagesException {

		return _explosiveApplicationStagesLocalService.getEXP_CAI(
			expApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.explosives.competency.stages.service.model.
			ExplosiveApplicationStages> getEXP_CaseId(String caseId) {

		return _explosiveApplicationStagesLocalService.getEXP_CaseId(caseId);
	}

	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveApplicationStages getEXP_CaseIdAndStatus(
				String caseId, String stageStatus)
			throws com.nbp.explosives.competency.stages.service.exception.
				NoSuchExplosiveApplicationStagesException {

		return _explosiveApplicationStagesLocalService.getEXP_CaseIdAndStatus(
			caseId, stageStatus);
	}

	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveApplicationStages getEXP_CaseIdStageName(
				String caseId, String stageName)
			throws com.nbp.explosives.competency.stages.service.exception.
				NoSuchExplosiveApplicationStagesException {

		return _explosiveApplicationStagesLocalService.getEXP_CaseIdStageName(
			caseId, stageName);
	}

	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveApplicationStages getEXP_CaseIdStageStatus(
				String caseId, String stageName, String stageStatus)
			throws com.nbp.explosives.competency.stages.service.exception.
				NoSuchExplosiveApplicationStagesException {

		return _explosiveApplicationStagesLocalService.getEXP_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	@Override
	public java.util.List
		<com.nbp.explosives.competency.stages.service.model.
			ExplosiveApplicationStages> getEXP_SNAndSS(
				String stageName, String status) {

		return _explosiveApplicationStagesLocalService.getEXP_SNAndSS(
			stageName, status);
	}

	@Override
	public java.util.List<String> getExplosiceDistinctStages() {
		return _explosiveApplicationStagesLocalService.
			getExplosiceDistinctStages();
	}

	/**
	 * Returns the explosive application stages with the primary key.
	 *
	 * @param expApplicationStagesId the primary key of the explosive application stages
	 * @return the explosive application stages
	 * @throws PortalException if a explosive application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveApplicationStages getExplosiveApplicationStages(
				long expApplicationStagesId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveApplicationStagesLocalService.
			getExplosiveApplicationStages(expApplicationStagesId);
	}

	/**
	 * Returns the explosive application stages matching the UUID and group.
	 *
	 * @param uuid the explosive application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosive application stages
	 * @throws PortalException if a matching explosive application stages could not be found
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveApplicationStages
				getExplosiveApplicationStagesByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveApplicationStagesLocalService.
			getExplosiveApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the explosive application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @return the range of explosive application stageses
	 */
	@Override
	public java.util.List
		<com.nbp.explosives.competency.stages.service.model.
			ExplosiveApplicationStages> getExplosiveApplicationStageses(
				int start, int end) {

		return _explosiveApplicationStagesLocalService.
			getExplosiveApplicationStageses(start, end);
	}

	/**
	 * Returns all the explosive application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosive application stageses
	 * @param companyId the primary key of the company
	 * @return the matching explosive application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.explosives.competency.stages.service.model.
			ExplosiveApplicationStages>
				getExplosiveApplicationStagesesByUuidAndCompanyId(
					String uuid, long companyId) {

		return _explosiveApplicationStagesLocalService.
			getExplosiveApplicationStagesesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of explosive application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosive application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching explosive application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.explosives.competency.stages.service.model.
			ExplosiveApplicationStages>
				getExplosiveApplicationStagesesByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.explosives.competency.stages.service.model.
							ExplosiveApplicationStages> orderByComparator) {

		return _explosiveApplicationStagesLocalService.
			getExplosiveApplicationStagesesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of explosive application stageses.
	 *
	 * @return the number of explosive application stageses
	 */
	@Override
	public int getExplosiveApplicationStagesesCount() {
		return _explosiveApplicationStagesLocalService.
			getExplosiveApplicationStagesesCount();
	}

	@Override
	public String getExplosiveCurrentStages(String caseId) {
		return _explosiveApplicationStagesLocalService.
			getExplosiveCurrentStages(caseId);
	}

	@Override
	public Long getExplosiveSeenCases() {
		return _explosiveApplicationStagesLocalService.getExplosiveSeenCases();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _explosiveApplicationStagesLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _explosiveApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _explosiveApplicationStagesLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _explosiveApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the explosive application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveApplicationStages the explosive application stages
	 * @return the explosive application stages that was updated
	 */
	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveApplicationStages updateExplosiveApplicationStages(
			com.nbp.explosives.competency.stages.service.model.
				ExplosiveApplicationStages explosiveApplicationStages) {

		return _explosiveApplicationStagesLocalService.
			updateExplosiveApplicationStages(explosiveApplicationStages);
	}

	@Override
	public com.nbp.explosives.competency.stages.service.model.
		ExplosiveApplicationStages updateExplosiveApplicationStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return _explosiveApplicationStagesLocalService.
			updateExplosiveApplicationStages(
				caseId, stageName, stageStartDate, stageEndDate, duration,
				stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _explosiveApplicationStagesLocalService.getBasePersistence();
	}

	@Override
	public ExplosiveApplicationStagesLocalService getWrappedService() {
		return _explosiveApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		ExplosiveApplicationStagesLocalService
			explosiveApplicationStagesLocalService) {

		_explosiveApplicationStagesLocalService =
			explosiveApplicationStagesLocalService;
	}

	private ExplosiveApplicationStagesLocalService
		_explosiveApplicationStagesLocalService;

}