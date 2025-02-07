/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezStatusApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusApplicationStagesLocalService
 * @generated
 */
public class SezStatusApplicationStagesLocalServiceWrapper
	implements ServiceWrapper<SezStatusApplicationStagesLocalService>,
			   SezStatusApplicationStagesLocalService {

	public SezStatusApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public SezStatusApplicationStagesLocalServiceWrapper(
		SezStatusApplicationStagesLocalService
			sezStatusApplicationStagesLocalService) {

		_sezStatusApplicationStagesLocalService =
			sezStatusApplicationStagesLocalService;
	}

	/**
	 * Adds the sez status application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusApplicationStages the sez status application stages
	 * @return the sez status application stages that was added
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusApplicationStages addSezStatusApplicationStages(
			com.nbp.sez.status.application.stage.services.model.
				SezStatusApplicationStages sezStatusApplicationStages) {

		return _sezStatusApplicationStagesLocalService.
			addSezStatusApplicationStages(sezStatusApplicationStages);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez status application stages with the primary key. Does not add the sez status application stages to the database.
	 *
	 * @param SezStatusApplicationStagesId the primary key for the new sez status application stages
	 * @return the new sez status application stages
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusApplicationStages createSezStatusApplicationStages(
			long SezStatusApplicationStagesId) {

		return _sezStatusApplicationStagesLocalService.
			createSezStatusApplicationStages(SezStatusApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez status application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param SezStatusApplicationStagesId the primary key of the sez status application stages
	 * @return the sez status application stages that was removed
	 * @throws PortalException if a sez status application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusApplicationStages deleteSezStatusApplicationStages(
				long SezStatusApplicationStagesId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusApplicationStagesLocalService.
			deleteSezStatusApplicationStages(SezStatusApplicationStagesId);
	}

	/**
	 * Deletes the sez status application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusApplicationStages the sez status application stages
	 * @return the sez status application stages that was removed
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusApplicationStages deleteSezStatusApplicationStages(
			com.nbp.sez.status.application.stage.services.model.
				SezStatusApplicationStages sezStatusApplicationStages) {

		return _sezStatusApplicationStagesLocalService.
			deleteSezStatusApplicationStages(sezStatusApplicationStages);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezStatusApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezStatusApplicationStagesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezStatusApplicationStagesLocalService.dynamicQuery();
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

		return _sezStatusApplicationStagesLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusApplicationStagesModelImpl</code>.
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

		return _sezStatusApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusApplicationStagesModelImpl</code>.
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

		return _sezStatusApplicationStagesLocalService.dynamicQuery(
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

		return _sezStatusApplicationStagesLocalService.dynamicQueryCount(
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

		return _sezStatusApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusApplicationStages fetchSezStatusApplicationStages(
			long SezStatusApplicationStagesId) {

		return _sezStatusApplicationStagesLocalService.
			fetchSezStatusApplicationStages(SezStatusApplicationStagesId);
	}

	/**
	 * Returns the sez status application stages matching the UUID and group.
	 *
	 * @param uuid the sez status application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusApplicationStages
			fetchSezStatusApplicationStagesByUuidAndGroupId(
				String uuid, long groupId) {

		return _sezStatusApplicationStagesLocalService.
			fetchSezStatusApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezStatusApplicationStagesLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _sezStatusApplicationStagesLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezStatusApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusApplicationStagesLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusApplicationStages> getSAS_CaseId(String caseId) {

		return _sezStatusApplicationStagesLocalService.getSAS_CaseId(caseId);
	}

	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusApplicationStages getSAS_CaseIdAndStatus(
				String caseId, String stageStatus)
			throws com.nbp.sez.status.application.stage.services.exception.
				NoSuchSezStatusApplicationStagesException {

		return _sezStatusApplicationStagesLocalService.getSAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusApplicationStages getSAS_CaseIdStageName(
				String caseId, String stageName)
			throws com.nbp.sez.status.application.stage.services.exception.
				NoSuchSezStatusApplicationStagesException {

		return _sezStatusApplicationStagesLocalService.getSAS_CaseIdStageName(
			caseId, stageName);
	}

	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusApplicationStages getSAS_CaseIdStageStatus(
				String caseId, String stageName, String stageStatus)
			throws com.nbp.sez.status.application.stage.services.exception.
				NoSuchSezStatusApplicationStagesException {

		return _sezStatusApplicationStagesLocalService.getSAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusApplicationStages getSAS_SAI(long sezStatusApplicationId)
			throws com.nbp.sez.status.application.stage.services.exception.
				NoSuchSezStatusApplicationStagesException {

		return _sezStatusApplicationStagesLocalService.getSAS_SAI(
			sezStatusApplicationId);
	}

	@Override
	public java.util.List<String> getSezDistinctStages() {
		return _sezStatusApplicationStagesLocalService.getSezDistinctStages();
	}

	@Override
	public Long getSezSeenCases() {
		return _sezStatusApplicationStagesLocalService.getSezSeenCases();
	}

	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusApplicationStages getSezStatusApplications_By_CI(String caseId)
			throws com.nbp.sez.status.application.stage.services.exception.
				NoSuchSezStatusApplicationStagesException {

		return _sezStatusApplicationStagesLocalService.
			getSezStatusApplications_By_CI(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusApplicationStages> getSezStatusApplicationsList_By_SN(
				String stageName) {

		return _sezStatusApplicationStagesLocalService.
			getSezStatusApplicationsList_By_SN(stageName);
	}

	/**
	 * Returns the sez status application stages with the primary key.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the sez status application stages
	 * @return the sez status application stages
	 * @throws PortalException if a sez status application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusApplicationStages getSezStatusApplicationStages(
				long SezStatusApplicationStagesId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusApplicationStagesLocalService.
			getSezStatusApplicationStages(SezStatusApplicationStagesId);
	}

	/**
	 * Returns the sez status application stages matching the UUID and group.
	 *
	 * @param uuid the sez status application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching sez status application stages
	 * @throws PortalException if a matching sez status application stages could not be found
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusApplicationStages
				getSezStatusApplicationStagesByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusApplicationStagesLocalService.
			getSezStatusApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the sez status application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @return the range of sez status application stageses
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusApplicationStages> getSezStatusApplicationStageses(
				int start, int end) {

		return _sezStatusApplicationStagesLocalService.
			getSezStatusApplicationStageses(start, end);
	}

	/**
	 * Returns all the sez status application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status application stageses
	 * @param companyId the primary key of the company
	 * @return the matching sez status application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusApplicationStages>
				getSezStatusApplicationStagesesByUuidAndCompanyId(
					String uuid, long companyId) {

		return _sezStatusApplicationStagesLocalService.
			getSezStatusApplicationStagesesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of sez status application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the sez status application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching sez status application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusApplicationStages>
				getSezStatusApplicationStagesesByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.sez.status.application.stage.services.model.
							SezStatusApplicationStages> orderByComparator) {

		return _sezStatusApplicationStagesLocalService.
			getSezStatusApplicationStagesesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of sez status application stageses.
	 *
	 * @return the number of sez status application stageses
	 */
	@Override
	public int getSezStatusApplicationStagesesCount() {
		return _sezStatusApplicationStagesLocalService.
			getSezStatusApplicationStagesesCount();
	}

	@Override
	public String getSezStatusCurrentStages(String caseId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return _sezStatusApplicationStagesLocalService.
			getSezStatusCurrentStages(caseId);
	}

	@Override
	public String getSezStatusWFMCurrentStages(String caseId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return _sezStatusApplicationStagesLocalService.
			getSezStatusWFMCurrentStages(caseId);
	}

	/**
	 * Updates the sez status application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusApplicationStages the sez status application stages
	 * @return the sez status application stages that was updated
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusApplicationStages updateSezStatusApplicationStages(
			com.nbp.sez.status.application.stage.services.model.
				SezStatusApplicationStages sezStatusApplicationStages) {

		return _sezStatusApplicationStagesLocalService.
			updateSezStatusApplicationStages(sezStatusApplicationStages);
	}

	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusApplicationStages updateSezStatusApplicationStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return _sezStatusApplicationStagesLocalService.
			updateSezStatusApplicationStages(
				caseId, stageName, stageStartDate, stageEndDate, duration,
				stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezStatusApplicationStagesLocalService.getBasePersistence();
	}

	@Override
	public SezStatusApplicationStagesLocalService getWrappedService() {
		return _sezStatusApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		SezStatusApplicationStagesLocalService
			sezStatusApplicationStagesLocalService) {

		_sezStatusApplicationStagesLocalService =
			sezStatusApplicationStagesLocalService;
	}

	private SezStatusApplicationStagesLocalService
		_sezStatusApplicationStagesLocalService;

}