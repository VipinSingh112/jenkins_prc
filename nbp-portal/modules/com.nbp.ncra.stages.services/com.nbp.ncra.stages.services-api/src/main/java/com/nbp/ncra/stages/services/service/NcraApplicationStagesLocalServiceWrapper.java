/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcraApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcraApplicationStagesLocalService
 * @generated
 */
public class NcraApplicationStagesLocalServiceWrapper
	implements NcraApplicationStagesLocalService,
			   ServiceWrapper<NcraApplicationStagesLocalService> {

	public NcraApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public NcraApplicationStagesLocalServiceWrapper(
		NcraApplicationStagesLocalService ncraApplicationStagesLocalService) {

		_ncraApplicationStagesLocalService = ncraApplicationStagesLocalService;
	}

	/**
	 * Adds the ncra application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraApplicationStages the ncra application stages
	 * @return the ncra application stages that was added
	 */
	@Override
	public com.nbp.ncra.stages.services.model.NcraApplicationStages
		addNcraApplicationStages(
			com.nbp.ncra.stages.services.model.NcraApplicationStages
				ncraApplicationStages) {

		return _ncraApplicationStagesLocalService.addNcraApplicationStages(
			ncraApplicationStages);
	}

	/**
	 * Creates a new ncra application stages with the primary key. Does not add the ncra application stages to the database.
	 *
	 * @param ncraApplciationStage the primary key for the new ncra application stages
	 * @return the new ncra application stages
	 */
	@Override
	public com.nbp.ncra.stages.services.model.NcraApplicationStages
		createNcraApplicationStages(long ncraApplciationStage) {

		return _ncraApplicationStagesLocalService.createNcraApplicationStages(
			ncraApplciationStage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncra application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraApplciationStage the primary key of the ncra application stages
	 * @return the ncra application stages that was removed
	 * @throws PortalException if a ncra application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.ncra.stages.services.model.NcraApplicationStages
			deleteNcraApplicationStages(long ncraApplciationStage)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraApplicationStagesLocalService.deleteNcraApplicationStages(
			ncraApplciationStage);
	}

	/**
	 * Deletes the ncra application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraApplicationStages the ncra application stages
	 * @return the ncra application stages that was removed
	 */
	@Override
	public com.nbp.ncra.stages.services.model.NcraApplicationStages
		deleteNcraApplicationStages(
			com.nbp.ncra.stages.services.model.NcraApplicationStages
				ncraApplicationStages) {

		return _ncraApplicationStagesLocalService.deleteNcraApplicationStages(
			ncraApplicationStages);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncraApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncraApplicationStagesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncraApplicationStagesLocalService.dynamicQuery();
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

		return _ncraApplicationStagesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.stages.services.model.impl.NcraApplicationStagesModelImpl</code>.
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

		return _ncraApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.stages.services.model.impl.NcraApplicationStagesModelImpl</code>.
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

		return _ncraApplicationStagesLocalService.dynamicQuery(
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

		return _ncraApplicationStagesLocalService.dynamicQueryCount(
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

		return _ncraApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncra.stages.services.model.NcraApplicationStages
		fetchNcraApplicationStages(long ncraApplciationStage) {

		return _ncraApplicationStagesLocalService.fetchNcraApplicationStages(
			ncraApplciationStage);
	}

	/**
	 * Returns the ncra application stages matching the UUID and group.
	 *
	 * @param uuid the ncra application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	@Override
	public com.nbp.ncra.stages.services.model.NcraApplicationStages
		fetchNcraApplicationStagesByUuidAndGroupId(String uuid, long groupId) {

		return _ncraApplicationStagesLocalService.
			fetchNcraApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncraApplicationStagesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _ncraApplicationStagesLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncraApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.ncra.stages.services.model.NcraApplicationStages>
			getNCRA_By_CaseId(String caseId) {

		return _ncraApplicationStagesLocalService.getNCRA_By_CaseId(caseId);
	}

	@Override
	public com.nbp.ncra.stages.services.model.NcraApplicationStages
			getNCRA_By_StageStatus(String stageStatus)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return _ncraApplicationStagesLocalService.getNCRA_By_StageStatus(
			stageStatus);
	}

	@Override
	public com.nbp.ncra.stages.services.model.NcraApplicationStages
			getNCRA_ByCI(String caseId)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return _ncraApplicationStagesLocalService.getNCRA_ByCI(caseId);
	}

	@Override
	public com.nbp.ncra.stages.services.model.NcraApplicationStages
			getNCRA_ByCI_SN(String caseId, String stageName)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return _ncraApplicationStagesLocalService.getNCRA_ByCI_SN(
			caseId, stageName);
	}

	@Override
	public com.nbp.ncra.stages.services.model.NcraApplicationStages
			getNCRA_ByCI_SN_SS(
				String caseId, String stageName, String stageStatus)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return _ncraApplicationStagesLocalService.getNCRA_ByCI_SN_SS(
			caseId, stageName, stageStatus);
	}

	@Override
	public com.nbp.ncra.stages.services.model.NcraApplicationStages
			getNCRA_ByCI_SS(String caseId, String stageStatus)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return _ncraApplicationStagesLocalService.getNCRA_ByCI_SS(
			caseId, stageStatus);
	}

	@Override
	public java.util.List
		<com.nbp.ncra.stages.services.model.NcraApplicationStages> getNCRA_BySN(
			String stageName) {

		return _ncraApplicationStagesLocalService.getNCRA_BySN(stageName);
	}

	/**
	 * Returns the ncra application stages with the primary key.
	 *
	 * @param ncraApplciationStage the primary key of the ncra application stages
	 * @return the ncra application stages
	 * @throws PortalException if a ncra application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.ncra.stages.services.model.NcraApplicationStages
			getNcraApplicationStages(long ncraApplciationStage)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraApplicationStagesLocalService.getNcraApplicationStages(
			ncraApplciationStage);
	}

	/**
	 * Returns the ncra application stages matching the UUID and group.
	 *
	 * @param uuid the ncra application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ncra application stages
	 * @throws PortalException if a matching ncra application stages could not be found
	 */
	@Override
	public com.nbp.ncra.stages.services.model.NcraApplicationStages
			getNcraApplicationStagesByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraApplicationStagesLocalService.
			getNcraApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the ncra application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.stages.services.model.impl.NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @return the range of ncra application stageses
	 */
	@Override
	public java.util.List
		<com.nbp.ncra.stages.services.model.NcraApplicationStages>
			getNcraApplicationStageses(int start, int end) {

		return _ncraApplicationStagesLocalService.getNcraApplicationStageses(
			start, end);
	}

	/**
	 * Returns all the ncra application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the ncra application stageses
	 * @param companyId the primary key of the company
	 * @return the matching ncra application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.ncra.stages.services.model.NcraApplicationStages>
			getNcraApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _ncraApplicationStagesLocalService.
			getNcraApplicationStagesesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of ncra application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the ncra application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching ncra application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.ncra.stages.services.model.NcraApplicationStages>
			getNcraApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.ncra.stages.services.model.NcraApplicationStages>
						orderByComparator) {

		return _ncraApplicationStagesLocalService.
			getNcraApplicationStagesesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of ncra application stageses.
	 *
	 * @return the number of ncra application stageses
	 */
	@Override
	public int getNcraApplicationStagesesCount() {
		return _ncraApplicationStagesLocalService.
			getNcraApplicationStagesesCount();
	}

	@Override
	public String getNCRACurrentStages(String caseId) {
		return _ncraApplicationStagesLocalService.getNCRACurrentStages(caseId);
	}

	@Override
	public java.util.List<String> getNCRADistinctStages() {
		return _ncraApplicationStagesLocalService.getNCRADistinctStages();
	}

	@Override
	public Long getNCRASeenCases() {
		return _ncraApplicationStagesLocalService.getNCRASeenCases();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncraApplicationStagesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the ncra application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraApplicationStages the ncra application stages
	 * @return the ncra application stages that was updated
	 */
	@Override
	public com.nbp.ncra.stages.services.model.NcraApplicationStages
		updateNcraApplicationStages(
			com.nbp.ncra.stages.services.model.NcraApplicationStages
				ncraApplicationStages) {

		return _ncraApplicationStagesLocalService.updateNcraApplicationStages(
			ncraApplicationStages);
	}

	@Override
	public com.nbp.ncra.stages.services.model.NcraApplicationStages
		updateNCRAAppStage(
			String caseId, String stageName, String stageStatus,
			java.util.Date stageStartDate, java.util.Date stageEndDate,
			String duration) {

		return _ncraApplicationStagesLocalService.updateNCRAAppStage(
			caseId, stageName, stageStatus, stageStartDate, stageEndDate,
			duration);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncraApplicationStagesLocalService.getBasePersistence();
	}

	@Override
	public NcraApplicationStagesLocalService getWrappedService() {
		return _ncraApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		NcraApplicationStagesLocalService ncraApplicationStagesLocalService) {

		_ncraApplicationStagesLocalService = ncraApplicationStagesLocalService;
	}

	private NcraApplicationStagesLocalService
		_ncraApplicationStagesLocalService;

}