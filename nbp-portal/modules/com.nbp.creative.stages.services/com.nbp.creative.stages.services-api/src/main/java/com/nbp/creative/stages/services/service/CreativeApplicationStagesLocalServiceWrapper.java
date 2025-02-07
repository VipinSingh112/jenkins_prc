/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CreativeApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeApplicationStagesLocalService
 * @generated
 */
public class CreativeApplicationStagesLocalServiceWrapper
	implements CreativeApplicationStagesLocalService,
			   ServiceWrapper<CreativeApplicationStagesLocalService> {

	public CreativeApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public CreativeApplicationStagesLocalServiceWrapper(
		CreativeApplicationStagesLocalService
			creativeApplicationStagesLocalService) {

		_creativeApplicationStagesLocalService =
			creativeApplicationStagesLocalService;
	}

	/**
	 * Adds the creative application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeApplicationStages the creative application stages
	 * @return the creative application stages that was added
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativeApplicationStages
		addCreativeApplicationStages(
			com.nbp.creative.stages.services.model.CreativeApplicationStages
				creativeApplicationStages) {

		return _creativeApplicationStagesLocalService.
			addCreativeApplicationStages(creativeApplicationStages);
	}

	/**
	 * Creates a new creative application stages with the primary key. Does not add the creative application stages to the database.
	 *
	 * @param creativeApplicationStagesId the primary key for the new creative application stages
	 * @return the new creative application stages
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativeApplicationStages
		createCreativeApplicationStages(long creativeApplicationStagesId) {

		return _creativeApplicationStagesLocalService.
			createCreativeApplicationStages(creativeApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the creative application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeApplicationStages the creative application stages
	 * @return the creative application stages that was removed
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativeApplicationStages
		deleteCreativeApplicationStages(
			com.nbp.creative.stages.services.model.CreativeApplicationStages
				creativeApplicationStages) {

		return _creativeApplicationStagesLocalService.
			deleteCreativeApplicationStages(creativeApplicationStages);
	}

	/**
	 * Deletes the creative application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeApplicationStagesId the primary key of the creative application stages
	 * @return the creative application stages that was removed
	 * @throws PortalException if a creative application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativeApplicationStages
			deleteCreativeApplicationStages(long creativeApplicationStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeApplicationStagesLocalService.
			deleteCreativeApplicationStages(creativeApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _creativeApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _creativeApplicationStagesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _creativeApplicationStagesLocalService.dynamicQuery();
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

		return _creativeApplicationStagesLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.stages.services.model.impl.CreativeApplicationStagesModelImpl</code>.
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

		return _creativeApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.stages.services.model.impl.CreativeApplicationStagesModelImpl</code>.
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

		return _creativeApplicationStagesLocalService.dynamicQuery(
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

		return _creativeApplicationStagesLocalService.dynamicQueryCount(
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

		return _creativeApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.creative.stages.services.model.CreativeApplicationStages
		fetchCreativeApplicationStages(long creativeApplicationStagesId) {

		return _creativeApplicationStagesLocalService.
			fetchCreativeApplicationStages(creativeApplicationStagesId);
	}

	/**
	 * Returns the creative application stages matching the UUID and group.
	 *
	 * @param uuid the creative application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativeApplicationStages
		fetchCreativeApplicationStagesByUuidAndGroupId(
			String uuid, long groupId) {

		return _creativeApplicationStagesLocalService.
			fetchCreativeApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _creativeApplicationStagesLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.creative.stages.services.model.CreativeApplicationStages>
			getCAS_BY_SN(String stageName) {

		return _creativeApplicationStagesLocalService.getCAS_BY_SN(stageName);
	}

	@Override
	public com.nbp.creative.stages.services.model.CreativeApplicationStages
			getCAS_CAI(long creativeApplicationId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return _creativeApplicationStagesLocalService.getCAS_CAI(
			creativeApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.creative.stages.services.model.CreativeApplicationStages>
			getCAS_CaseId(String caseId) {

		return _creativeApplicationStagesLocalService.getCAS_CaseId(caseId);
	}

	@Override
	public com.nbp.creative.stages.services.model.CreativeApplicationStages
			getCAS_CaseIdAndStatus(String caseId, String stageStatus)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return _creativeApplicationStagesLocalService.getCAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	@Override
	public com.nbp.creative.stages.services.model.CreativeApplicationStages
			getCAS_CaseIdStageName(String caseId, String stageName)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return _creativeApplicationStagesLocalService.getCAS_CaseIdStageName(
			caseId, stageName);
	}

	@Override
	public com.nbp.creative.stages.services.model.CreativeApplicationStages
			getCAS_CaseIdStageStatus(
				String caseId, String stageName, String stageStatus)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return _creativeApplicationStagesLocalService.getCAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	@Override
	public java.util.List
		<com.nbp.creative.stages.services.model.CreativeApplicationStages>
			getCAS_SNAndSS(String stageName, String status) {

		return _creativeApplicationStagesLocalService.getCAS_SNAndSS(
			stageName, status);
	}

	/**
	 * Returns the creative application stages with the primary key.
	 *
	 * @param creativeApplicationStagesId the primary key of the creative application stages
	 * @return the creative application stages
	 * @throws PortalException if a creative application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativeApplicationStages
			getCreativeApplicationStages(long creativeApplicationStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeApplicationStagesLocalService.
			getCreativeApplicationStages(creativeApplicationStagesId);
	}

	/**
	 * Returns the creative application stages matching the UUID and group.
	 *
	 * @param uuid the creative application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching creative application stages
	 * @throws PortalException if a matching creative application stages could not be found
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativeApplicationStages
			getCreativeApplicationStagesByUuidAndGroupId(
				String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeApplicationStagesLocalService.
			getCreativeApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the creative application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.stages.services.model.impl.CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @return the range of creative application stageses
	 */
	@Override
	public java.util.List
		<com.nbp.creative.stages.services.model.CreativeApplicationStages>
			getCreativeApplicationStageses(int start, int end) {

		return _creativeApplicationStagesLocalService.
			getCreativeApplicationStageses(start, end);
	}

	/**
	 * Returns all the creative application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the creative application stageses
	 * @param companyId the primary key of the company
	 * @return the matching creative application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.creative.stages.services.model.CreativeApplicationStages>
			getCreativeApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _creativeApplicationStagesLocalService.
			getCreativeApplicationStagesesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of creative application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the creative application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching creative application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.creative.stages.services.model.CreativeApplicationStages>
			getCreativeApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.creative.stages.services.model.
						CreativeApplicationStages> orderByComparator) {

		return _creativeApplicationStagesLocalService.
			getCreativeApplicationStagesesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of creative application stageses.
	 *
	 * @return the number of creative application stageses
	 */
	@Override
	public int getCreativeApplicationStagesesCount() {
		return _creativeApplicationStagesLocalService.
			getCreativeApplicationStagesesCount();
	}

	@Override
	public java.util.List<String> getCreativeDistinctStages() {
		return _creativeApplicationStagesLocalService.
			getCreativeDistinctStages();
	}

	@Override
	public Long getCreativeSeenCases() {
		return _creativeApplicationStagesLocalService.getCreativeSeenCases();
	}

	@Override
	public String getCretiveCurrentStages(String caseId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return _creativeApplicationStagesLocalService.getCretiveCurrentStages(
			caseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _creativeApplicationStagesLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _creativeApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeApplicationStagesLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the creative application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeApplicationStages the creative application stages
	 * @return the creative application stages that was updated
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativeApplicationStages
		updateCreativeApplicationStages(
			com.nbp.creative.stages.services.model.CreativeApplicationStages
				creativeApplicationStages) {

		return _creativeApplicationStagesLocalService.
			updateCreativeApplicationStages(creativeApplicationStages);
	}

	@Override
	public com.nbp.creative.stages.services.model.CreativeApplicationStages
		updateCreativeApplicationStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return _creativeApplicationStagesLocalService.
			updateCreativeApplicationStages(
				caseId, stageName, stageStartDate, stageEndDate, duration,
				stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _creativeApplicationStagesLocalService.getBasePersistence();
	}

	@Override
	public CreativeApplicationStagesLocalService getWrappedService() {
		return _creativeApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		CreativeApplicationStagesLocalService
			creativeApplicationStagesLocalService) {

		_creativeApplicationStagesLocalService =
			creativeApplicationStagesLocalService;
	}

	private CreativeApplicationStagesLocalService
		_creativeApplicationStagesLocalService;

}