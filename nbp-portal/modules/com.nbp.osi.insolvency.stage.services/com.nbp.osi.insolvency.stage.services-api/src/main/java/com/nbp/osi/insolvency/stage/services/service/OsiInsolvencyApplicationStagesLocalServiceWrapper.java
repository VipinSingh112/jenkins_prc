/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiInsolvencyApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyApplicationStagesLocalService
 * @generated
 */
public class OsiInsolvencyApplicationStagesLocalServiceWrapper
	implements OsiInsolvencyApplicationStagesLocalService,
			   ServiceWrapper<OsiInsolvencyApplicationStagesLocalService> {

	public OsiInsolvencyApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public OsiInsolvencyApplicationStagesLocalServiceWrapper(
		OsiInsolvencyApplicationStagesLocalService
			osiInsolvencyApplicationStagesLocalService) {

		_osiInsolvencyApplicationStagesLocalService =
			osiInsolvencyApplicationStagesLocalService;
	}

	/**
	 * Adds the osi insolvency application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyApplicationStages the osi insolvency application stages
	 * @return the osi insolvency application stages that was added
	 */
	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyApplicationStages addOsiInsolvencyApplicationStages(
				com.nbp.osi.insolvency.stage.services.model.
					OsiInsolvencyApplicationStages
						osiInsolvencyApplicationStages) {

		return _osiInsolvencyApplicationStagesLocalService.
			addOsiInsolvencyApplicationStages(osiInsolvencyApplicationStages);
	}

	/**
	 * Creates a new osi insolvency application stages with the primary key. Does not add the osi insolvency application stages to the database.
	 *
	 * @param osiInsolveApplicationStagesId the primary key for the new osi insolvency application stages
	 * @return the new osi insolvency application stages
	 */
	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyApplicationStages createOsiInsolvencyApplicationStages(
				long osiInsolveApplicationStagesId) {

		return _osiInsolvencyApplicationStagesLocalService.
			createOsiInsolvencyApplicationStages(osiInsolveApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi insolvency application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the osi insolvency application stages
	 * @return the osi insolvency application stages that was removed
	 * @throws PortalException if a osi insolvency application stages with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyApplicationStages deleteOsiInsolvencyApplicationStages(
					long osiInsolveApplicationStagesId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyApplicationStagesLocalService.
			deleteOsiInsolvencyApplicationStages(osiInsolveApplicationStagesId);
	}

	/**
	 * Deletes the osi insolvency application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyApplicationStages the osi insolvency application stages
	 * @return the osi insolvency application stages that was removed
	 */
	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyApplicationStages deleteOsiInsolvencyApplicationStages(
				com.nbp.osi.insolvency.stage.services.model.
					OsiInsolvencyApplicationStages
						osiInsolvencyApplicationStages) {

		return _osiInsolvencyApplicationStagesLocalService.
			deleteOsiInsolvencyApplicationStages(
				osiInsolvencyApplicationStages);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiInsolvencyApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiInsolvencyApplicationStagesLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiInsolvencyApplicationStagesLocalService.dynamicQuery();
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

		return _osiInsolvencyApplicationStagesLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolvencyApplicationStagesModelImpl</code>.
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

		return _osiInsolvencyApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolvencyApplicationStagesModelImpl</code>.
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

		return _osiInsolvencyApplicationStagesLocalService.dynamicQuery(
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

		return _osiInsolvencyApplicationStagesLocalService.dynamicQueryCount(
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

		return _osiInsolvencyApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyApplicationStages fetchOsiInsolvencyApplicationStages(
				long osiInsolveApplicationStagesId) {

		return _osiInsolvencyApplicationStagesLocalService.
			fetchOsiInsolvencyApplicationStages(osiInsolveApplicationStagesId);
	}

	/**
	 * Returns the osi insolvency application stages matching the UUID and group.
	 *
	 * @param uuid the osi insolvency application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyApplicationStages
				fetchOsiInsolvencyApplicationStagesByUuidAndGroupId(
					String uuid, long groupId) {

		return _osiInsolvencyApplicationStagesLocalService.
			fetchOsiInsolvencyApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiInsolvencyApplicationStagesLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyApplicationStages getCAS_CaseIdStageName(
					String caseId, String stageName)
				throws com.nbp.osi.insolvency.stage.services.exception.
					NoSuchOsiInsolvencyApplicationStagesException {

		return _osiInsolvencyApplicationStagesLocalService.
			getCAS_CaseIdStageName(caseId, stageName);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _osiInsolvencyApplicationStagesLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiInsolvencyApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyApplicationStages> getOAIS_StageName(
				String stageName) {

		return _osiInsolvencyApplicationStagesLocalService.getOAIS_StageName(
			stageName);
	}

	@Override
	public java.util.List
		<com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyApplicationStages> getOIAS_CaseId(String caseId) {

		return _osiInsolvencyApplicationStagesLocalService.getOIAS_CaseId(
			caseId);
	}

	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyApplicationStages getOIAS_CaseIdAndStatus(
					String caseId, String stageStatus)
				throws com.nbp.osi.insolvency.stage.services.exception.
					NoSuchOsiInsolvencyApplicationStagesException {

		return _osiInsolvencyApplicationStagesLocalService.
			getOIAS_CaseIdAndStatus(caseId, stageStatus);
	}

	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyApplicationStages getOIAS_CaseIdStageStatus(
					String caseId, String stageName, String stageStatus)
				throws com.nbp.osi.insolvency.stage.services.exception.
					NoSuchOsiInsolvencyApplicationStagesException {

		return _osiInsolvencyApplicationStagesLocalService.
			getOIAS_CaseIdStageStatus(caseId, stageName, stageStatus);
	}

	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyApplicationStages getOIAS_OAI(long osiInsolvencyId)
				throws com.nbp.osi.insolvency.stage.services.exception.
					NoSuchOsiInsolvencyApplicationStagesException {

		return _osiInsolvencyApplicationStagesLocalService.getOIAS_OAI(
			osiInsolvencyId);
	}

	@Override
	public java.util.List
		<com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyApplicationStages> getOIAS_StageName_StageStatus(
				String caseId, String status) {

		return _osiInsolvencyApplicationStagesLocalService.
			getOIAS_StageName_StageStatus(caseId, status);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiInsolvencyApplicationStagesLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi insolvency application stages with the primary key.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the osi insolvency application stages
	 * @return the osi insolvency application stages
	 * @throws PortalException if a osi insolvency application stages with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyApplicationStages getOsiInsolvencyApplicationStages(
					long osiInsolveApplicationStagesId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyApplicationStagesLocalService.
			getOsiInsolvencyApplicationStages(osiInsolveApplicationStagesId);
	}

	/**
	 * Returns the osi insolvency application stages matching the UUID and group.
	 *
	 * @param uuid the osi insolvency application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi insolvency application stages
	 * @throws PortalException if a matching osi insolvency application stages could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyApplicationStages
					getOsiInsolvencyApplicationStagesByUuidAndGroupId(
						String uuid, long groupId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyApplicationStagesLocalService.
			getOsiInsolvencyApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the osi insolvency application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @return the range of osi insolvency application stageses
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyApplicationStages> getOsiInsolvencyApplicationStageses(
				int start, int end) {

		return _osiInsolvencyApplicationStagesLocalService.
			getOsiInsolvencyApplicationStageses(start, end);
	}

	/**
	 * Returns all the osi insolvency application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi insolvency application stageses
	 * @param companyId the primary key of the company
	 * @return the matching osi insolvency application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyApplicationStages>
				getOsiInsolvencyApplicationStagesesByUuidAndCompanyId(
					String uuid, long companyId) {

		return _osiInsolvencyApplicationStagesLocalService.
			getOsiInsolvencyApplicationStagesesByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of osi insolvency application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi insolvency application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi insolvency application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyApplicationStages>
				getOsiInsolvencyApplicationStagesesByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.osi.insolvency.stage.services.model.
							OsiInsolvencyApplicationStages> orderByComparator) {

		return _osiInsolvencyApplicationStagesLocalService.
			getOsiInsolvencyApplicationStagesesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi insolvency application stageses.
	 *
	 * @return the number of osi insolvency application stageses
	 */
	@Override
	public int getOsiInsolvencyApplicationStagesesCount() {
		return _osiInsolvencyApplicationStagesLocalService.
			getOsiInsolvencyApplicationStagesesCount();
	}

	@Override
	public String getOsiInsolvencypplicaitonCurrentStages(String caseId) {
		return _osiInsolvencyApplicationStagesLocalService.
			getOsiInsolvencypplicaitonCurrentStages(caseId);
	}

	@Override
	public String getOsiInsolvencypplicaitonCurrentStagesForVerificationReport(
		String caseId) {

		return _osiInsolvencyApplicationStagesLocalService.
			getOsiInsolvencypplicaitonCurrentStagesForVerificationReport(
				caseId);
	}

	@Override
	public Long getOSIIRSeenCases(String stageName) {
		return _osiInsolvencyApplicationStagesLocalService.getOSIIRSeenCases(
			stageName);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi insolvency application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyApplicationStages the osi insolvency application stages
	 * @return the osi insolvency application stages that was updated
	 */
	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyApplicationStages updateOsiInsolvencyApplicationStages(
				com.nbp.osi.insolvency.stage.services.model.
					OsiInsolvencyApplicationStages
						osiInsolvencyApplicationStages) {

		return _osiInsolvencyApplicationStagesLocalService.
			updateOsiInsolvencyApplicationStages(
				osiInsolvencyApplicationStages);
	}

	@Override
	public
		com.nbp.osi.insolvency.stage.services.model.
			OsiInsolvencyApplicationStages updateOsiInsolvencyApplicationStages(
				String caseId, String stageName, java.util.Date stageStartDate,
				java.util.Date stageEndDate, String duration,
				String stageStatus) {

		return _osiInsolvencyApplicationStagesLocalService.
			updateOsiInsolvencyApplicationStages(
				caseId, stageName, stageStartDate, stageEndDate, duration,
				stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiInsolvencyApplicationStagesLocalService.getBasePersistence();
	}

	@Override
	public OsiInsolvencyApplicationStagesLocalService getWrappedService() {
		return _osiInsolvencyApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		OsiInsolvencyApplicationStagesLocalService
			osiInsolvencyApplicationStagesLocalService) {

		_osiInsolvencyApplicationStagesLocalService =
			osiInsolvencyApplicationStagesLocalService;
	}

	private OsiInsolvencyApplicationStagesLocalService
		_osiInsolvencyApplicationStagesLocalService;

}