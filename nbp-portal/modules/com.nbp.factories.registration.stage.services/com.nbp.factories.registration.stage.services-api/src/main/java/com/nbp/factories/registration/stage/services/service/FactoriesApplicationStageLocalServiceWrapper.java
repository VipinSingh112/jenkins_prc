/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FactoriesApplicationStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesApplicationStageLocalService
 * @generated
 */
public class FactoriesApplicationStageLocalServiceWrapper
	implements FactoriesApplicationStageLocalService,
			   ServiceWrapper<FactoriesApplicationStageLocalService> {

	public FactoriesApplicationStageLocalServiceWrapper() {
		this(null);
	}

	public FactoriesApplicationStageLocalServiceWrapper(
		FactoriesApplicationStageLocalService
			factoriesApplicationStageLocalService) {

		_factoriesApplicationStageLocalService =
			factoriesApplicationStageLocalService;
	}

	/**
	 * Adds the factories application stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesApplicationStage the factories application stage
	 * @return the factories application stage that was added
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesApplicationStage addFactoriesApplicationStage(
			com.nbp.factories.registration.stage.services.model.
				FactoriesApplicationStage factoriesApplicationStage) {

		return _factoriesApplicationStageLocalService.
			addFactoriesApplicationStage(factoriesApplicationStage);
	}

	/**
	 * Creates a new factories application stage with the primary key. Does not add the factories application stage to the database.
	 *
	 * @param factoriesApplicationStageId the primary key for the new factories application stage
	 * @return the new factories application stage
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesApplicationStage createFactoriesApplicationStage(
			long factoriesApplicationStageId) {

		return _factoriesApplicationStageLocalService.
			createFactoriesApplicationStage(factoriesApplicationStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesApplicationStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the factories application stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesApplicationStage the factories application stage
	 * @return the factories application stage that was removed
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesApplicationStage deleteFactoriesApplicationStage(
			com.nbp.factories.registration.stage.services.model.
				FactoriesApplicationStage factoriesApplicationStage) {

		return _factoriesApplicationStageLocalService.
			deleteFactoriesApplicationStage(factoriesApplicationStage);
	}

	/**
	 * Deletes the factories application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesApplicationStageId the primary key of the factories application stage
	 * @return the factories application stage that was removed
	 * @throws PortalException if a factories application stage with the primary key could not be found
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesApplicationStage deleteFactoriesApplicationStage(
				long factoriesApplicationStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesApplicationStageLocalService.
			deleteFactoriesApplicationStage(factoriesApplicationStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesApplicationStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _factoriesApplicationStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _factoriesApplicationStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _factoriesApplicationStageLocalService.dynamicQuery();
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

		return _factoriesApplicationStageLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesApplicationStageModelImpl</code>.
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

		return _factoriesApplicationStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesApplicationStageModelImpl</code>.
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

		return _factoriesApplicationStageLocalService.dynamicQuery(
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

		return _factoriesApplicationStageLocalService.dynamicQueryCount(
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

		return _factoriesApplicationStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesApplicationStage fetchFactoriesApplicationStage(
			long factoriesApplicationStageId) {

		return _factoriesApplicationStageLocalService.
			fetchFactoriesApplicationStage(factoriesApplicationStageId);
	}

	/**
	 * Returns the factories application stage matching the UUID and group.
	 *
	 * @param uuid the factories application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesApplicationStage
			fetchFactoriesApplicationStageByUuidAndGroupId(
				String uuid, long groupId) {

		return _factoriesApplicationStageLocalService.
			fetchFactoriesApplicationStageByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesApplicationStage get_Factories_By_CaseId(String caseId)
			throws com.nbp.factories.registration.stage.services.exception.
				NoSuchFactoriesApplicationStageException {

		return _factoriesApplicationStageLocalService.get_Factories_By_CaseId(
			caseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _factoriesApplicationStageLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _factoriesApplicationStageLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesApplicationStage getFactories_By_AI(
				long factoriesApplicationId)
			throws com.nbp.factories.registration.stage.services.exception.
				NoSuchFactoriesApplicationStageException {

		return _factoriesApplicationStageLocalService.getFactories_By_AI(
			factoriesApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.factories.registration.stage.services.model.
			FactoriesApplicationStage> getFactories_By_CaseId(String caseId) {

		return _factoriesApplicationStageLocalService.getFactories_By_CaseId(
			caseId);
	}

	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesApplicationStage getFactories_By_CaseIdAndStatus(
				String caseId, String status)
			throws com.nbp.factories.registration.stage.services.exception.
				NoSuchFactoriesApplicationStageException {

		return _factoriesApplicationStageLocalService.
			getFactories_By_CaseIdAndStatus(caseId, status);
	}

	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesApplicationStage getFactories_By_CaseIdStageName(
				String caseId, String stageName)
			throws com.nbp.factories.registration.stage.services.exception.
				NoSuchFactoriesApplicationStageException {

		return _factoriesApplicationStageLocalService.
			getFactories_By_CaseIdStageName(caseId, stageName);
	}

	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesApplicationStage getFactories_By_CaseIdStageStatus(
				String caseId, String stageStatus, String stageName)
			throws com.nbp.factories.registration.stage.services.exception.
				NoSuchFactoriesApplicationStageException {

		return _factoriesApplicationStageLocalService.
			getFactories_By_CaseIdStageStatus(caseId, stageStatus, stageName);
	}

	@Override
	public java.util.List
		<com.nbp.factories.registration.stage.services.model.
			FactoriesApplicationStage> getFactories_By_StageName(
				String stageName) {

		return _factoriesApplicationStageLocalService.getFactories_By_StageName(
			stageName);
	}

	/**
	 * Returns the factories application stage with the primary key.
	 *
	 * @param factoriesApplicationStageId the primary key of the factories application stage
	 * @return the factories application stage
	 * @throws PortalException if a factories application stage with the primary key could not be found
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesApplicationStage getFactoriesApplicationStage(
				long factoriesApplicationStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesApplicationStageLocalService.
			getFactoriesApplicationStage(factoriesApplicationStageId);
	}

	/**
	 * Returns the factories application stage matching the UUID and group.
	 *
	 * @param uuid the factories application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching factories application stage
	 * @throws PortalException if a matching factories application stage could not be found
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesApplicationStage getFactoriesApplicationStageByUuidAndGroupId(
				String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesApplicationStageLocalService.
			getFactoriesApplicationStageByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the factories application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @return the range of factories application stages
	 */
	@Override
	public java.util.List
		<com.nbp.factories.registration.stage.services.model.
			FactoriesApplicationStage> getFactoriesApplicationStages(
				int start, int end) {

		return _factoriesApplicationStageLocalService.
			getFactoriesApplicationStages(start, end);
	}

	/**
	 * Returns all the factories application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the factories application stages
	 * @param companyId the primary key of the company
	 * @return the matching factories application stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.factories.registration.stage.services.model.
			FactoriesApplicationStage>
				getFactoriesApplicationStagesByUuidAndCompanyId(
					String uuid, long companyId) {

		return _factoriesApplicationStageLocalService.
			getFactoriesApplicationStagesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of factories application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the factories application stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching factories application stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.factories.registration.stage.services.model.
			FactoriesApplicationStage>
				getFactoriesApplicationStagesByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.factories.registration.stage.services.model.
							FactoriesApplicationStage> orderByComparator) {

		return _factoriesApplicationStageLocalService.
			getFactoriesApplicationStagesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of factories application stages.
	 *
	 * @return the number of factories application stages
	 */
	@Override
	public int getFactoriesApplicationStagesCount() {
		return _factoriesApplicationStageLocalService.
			getFactoriesApplicationStagesCount();
	}

	@Override
	public String getfactoriesCurrentStage(String caseId) {
		return _factoriesApplicationStageLocalService.getfactoriesCurrentStage(
			caseId);
	}

	@Override
	public java.util.List<String> getFactoriesDistinctStages() {
		return _factoriesApplicationStageLocalService.
			getFactoriesDistinctStages();
	}

	@Override
	public Long getFactoriesSeenCases() {
		return _factoriesApplicationStageLocalService.getFactoriesSeenCases();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _factoriesApplicationStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _factoriesApplicationStageLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _factoriesApplicationStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the factories application stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesApplicationStage the factories application stage
	 * @return the factories application stage that was updated
	 */
	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesApplicationStage updateFactoriesApplicationStage(
			com.nbp.factories.registration.stage.services.model.
				FactoriesApplicationStage factoriesApplicationStage) {

		return _factoriesApplicationStageLocalService.
			updateFactoriesApplicationStage(factoriesApplicationStage);
	}

	@Override
	public com.nbp.factories.registration.stage.services.model.
		FactoriesApplicationStage updateFactoriesApplicationStage(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return _factoriesApplicationStageLocalService.
			updateFactoriesApplicationStage(
				caseId, stageName, stageStartDate, stageEndDate, duration,
				stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _factoriesApplicationStageLocalService.getBasePersistence();
	}

	@Override
	public FactoriesApplicationStageLocalService getWrappedService() {
		return _factoriesApplicationStageLocalService;
	}

	@Override
	public void setWrappedService(
		FactoriesApplicationStageLocalService
			factoriesApplicationStageLocalService) {

		_factoriesApplicationStageLocalService =
			factoriesApplicationStageLocalService;
	}

	private FactoriesApplicationStageLocalService
		_factoriesApplicationStageLocalService;

}