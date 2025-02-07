/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiApplicationStagesLocalService
 * @generated
 */
public class OsiApplicationStagesLocalServiceWrapper
	implements OsiApplicationStagesLocalService,
			   ServiceWrapper<OsiApplicationStagesLocalService> {

	public OsiApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public OsiApplicationStagesLocalServiceWrapper(
		OsiApplicationStagesLocalService osiApplicationStagesLocalService) {

		_osiApplicationStagesLocalService = osiApplicationStagesLocalService;
	}

	/**
	 * Adds the osi application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiApplicationStages the osi application stages
	 * @return the osi application stages that was added
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationStages
		addOsiApplicationStages(
			com.nbp.osi.stages.services.model.OsiApplicationStages
				osiApplicationStages) {

		return _osiApplicationStagesLocalService.addOsiApplicationStages(
			osiApplicationStages);
	}

	/**
	 * Creates a new osi application stages with the primary key. Does not add the osi application stages to the database.
	 *
	 * @param OsiApplicationStagesId the primary key for the new osi application stages
	 * @return the new osi application stages
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationStages
		createOsiApplicationStages(long OsiApplicationStagesId) {

		return _osiApplicationStagesLocalService.createOsiApplicationStages(
			OsiApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param OsiApplicationStagesId the primary key of the osi application stages
	 * @return the osi application stages that was removed
	 * @throws PortalException if a osi application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationStages
			deleteOsiApplicationStages(long OsiApplicationStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiApplicationStagesLocalService.deleteOsiApplicationStages(
			OsiApplicationStagesId);
	}

	/**
	 * Deletes the osi application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiApplicationStages the osi application stages
	 * @return the osi application stages that was removed
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationStages
		deleteOsiApplicationStages(
			com.nbp.osi.stages.services.model.OsiApplicationStages
				osiApplicationStages) {

		return _osiApplicationStagesLocalService.deleteOsiApplicationStages(
			osiApplicationStages);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiApplicationStagesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiApplicationStagesLocalService.dynamicQuery();
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

		return _osiApplicationStagesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.stages.services.model.impl.OsiApplicationStagesModelImpl</code>.
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

		return _osiApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.stages.services.model.impl.OsiApplicationStagesModelImpl</code>.
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

		return _osiApplicationStagesLocalService.dynamicQuery(
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

		return _osiApplicationStagesLocalService.dynamicQueryCount(
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

		return _osiApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationStages
		fetchOsiApplicationStages(long OsiApplicationStagesId) {

		return _osiApplicationStagesLocalService.fetchOsiApplicationStages(
			OsiApplicationStagesId);
	}

	/**
	 * Returns the osi application stages matching the UUID and group.
	 *
	 * @param uuid the osi application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationStages
		fetchOsiApplicationStagesByUuidAndGroupId(String uuid, long groupId) {

		return _osiApplicationStagesLocalService.
			fetchOsiApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiApplicationStagesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationStages
			getCAS_CaseIdStageName(String caseId, String stageName)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return _osiApplicationStagesLocalService.getCAS_CaseIdStageName(
			caseId, stageName);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _osiApplicationStagesLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.osi.stages.services.model.OsiApplicationStages> getOAS_CaseId(
			String caseId) {

		return _osiApplicationStagesLocalService.getOAS_CaseId(caseId);
	}

	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationStages
			getOAS_CaseIdAndStatus(String caseId, String stageStatus)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return _osiApplicationStagesLocalService.getOAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationStages
			getOAS_CaseIdStageStatus(
				String caseId, String stageName, String stageStatus)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return _osiApplicationStagesLocalService.getOAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationStages getOAS_OAI(
			long osiApplicationId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return _osiApplicationStagesLocalService.getOAS_OAI(osiApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.osi.stages.services.model.OsiApplicationStages>
			getOAS_StageName(String stageName) {

		return _osiApplicationStagesLocalService.getOAS_StageName(stageName);
	}

	@Override
	public java.util.List
		<com.nbp.osi.stages.services.model.OsiApplicationStages>
			getOAS_StageNamendStageStatus(String caseId, String status) {

		return _osiApplicationStagesLocalService.getOAS_StageNamendStageStatus(
			caseId, status);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiApplicationStagesLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public String getOsiApplicaitonCurrentStages(String caseId) {
		return _osiApplicationStagesLocalService.getOsiApplicaitonCurrentStages(
			caseId);
	}

	/**
	 * Returns the osi application stages with the primary key.
	 *
	 * @param OsiApplicationStagesId the primary key of the osi application stages
	 * @return the osi application stages
	 * @throws PortalException if a osi application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationStages
			getOsiApplicationStages(long OsiApplicationStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiApplicationStagesLocalService.getOsiApplicationStages(
			OsiApplicationStagesId);
	}

	/**
	 * Returns the osi application stages matching the UUID and group.
	 *
	 * @param uuid the osi application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi application stages
	 * @throws PortalException if a matching osi application stages could not be found
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationStages
			getOsiApplicationStagesByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiApplicationStagesLocalService.
			getOsiApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the osi application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.stages.services.model.impl.OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @return the range of osi application stageses
	 */
	@Override
	public java.util.List
		<com.nbp.osi.stages.services.model.OsiApplicationStages>
			getOsiApplicationStageses(int start, int end) {

		return _osiApplicationStagesLocalService.getOsiApplicationStageses(
			start, end);
	}

	/**
	 * Returns all the osi application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi application stageses
	 * @param companyId the primary key of the company
	 * @return the matching osi application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.stages.services.model.OsiApplicationStages>
			getOsiApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _osiApplicationStagesLocalService.
			getOsiApplicationStagesesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of osi application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.stages.services.model.OsiApplicationStages>
			getOsiApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.osi.stages.services.model.OsiApplicationStages>
						orderByComparator) {

		return _osiApplicationStagesLocalService.
			getOsiApplicationStagesesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi application stageses.
	 *
	 * @return the number of osi application stageses
	 */
	@Override
	public int getOsiApplicationStagesesCount() {
		return _osiApplicationStagesLocalService.
			getOsiApplicationStagesesCount();
	}

	@Override
	public Long getOSIFCSeenCases() {
		return _osiApplicationStagesLocalService.getOSIFCSeenCases();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiApplicationStages the osi application stages
	 * @return the osi application stages that was updated
	 */
	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationStages
		updateOsiApplicationStages(
			com.nbp.osi.stages.services.model.OsiApplicationStages
				osiApplicationStages) {

		return _osiApplicationStagesLocalService.updateOsiApplicationStages(
			osiApplicationStages);
	}

	@Override
	public com.nbp.osi.stages.services.model.OsiApplicationStages
		updateOsiApplicationStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return _osiApplicationStagesLocalService.updateOsiApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiApplicationStagesLocalService.getBasePersistence();
	}

	@Override
	public OsiApplicationStagesLocalService getWrappedService() {
		return _osiApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		OsiApplicationStagesLocalService osiApplicationStagesLocalService) {

		_osiApplicationStagesLocalService = osiApplicationStagesLocalService;
	}

	private OsiApplicationStagesLocalService _osiApplicationStagesLocalService;

}