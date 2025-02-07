/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MiicApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicationStagesLocalService
 * @generated
 */
public class MiicApplicationStagesLocalServiceWrapper
	implements MiicApplicationStagesLocalService,
			   ServiceWrapper<MiicApplicationStagesLocalService> {

	public MiicApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public MiicApplicationStagesLocalServiceWrapper(
		MiicApplicationStagesLocalService miicApplicationStagesLocalService) {

		_miicApplicationStagesLocalService = miicApplicationStagesLocalService;
	}

	/**
	 * Adds the miic application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplicationStages the miic application stages
	 * @return the miic application stages that was added
	 */
	@Override
	public com.nbp.miic.stages.service.model.MiicApplicationStages
		addMiicApplicationStages(
			com.nbp.miic.stages.service.model.MiicApplicationStages
				miicApplicationStages) {

		return _miicApplicationStagesLocalService.addMiicApplicationStages(
			miicApplicationStages);
	}

	/**
	 * Creates a new miic application stages with the primary key. Does not add the miic application stages to the database.
	 *
	 * @param miicApplicationStagesId the primary key for the new miic application stages
	 * @return the new miic application stages
	 */
	@Override
	public com.nbp.miic.stages.service.model.MiicApplicationStages
		createMiicApplicationStages(long miicApplicationStagesId) {

		return _miicApplicationStagesLocalService.createMiicApplicationStages(
			miicApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the miic application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplicationStagesId the primary key of the miic application stages
	 * @return the miic application stages that was removed
	 * @throws PortalException if a miic application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.miic.stages.service.model.MiicApplicationStages
			deleteMiicApplicationStages(long miicApplicationStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicApplicationStagesLocalService.deleteMiicApplicationStages(
			miicApplicationStagesId);
	}

	/**
	 * Deletes the miic application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplicationStages the miic application stages
	 * @return the miic application stages that was removed
	 */
	@Override
	public com.nbp.miic.stages.service.model.MiicApplicationStages
		deleteMiicApplicationStages(
			com.nbp.miic.stages.service.model.MiicApplicationStages
				miicApplicationStages) {

		return _miicApplicationStagesLocalService.deleteMiicApplicationStages(
			miicApplicationStages);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _miicApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _miicApplicationStagesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _miicApplicationStagesLocalService.dynamicQuery();
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

		return _miicApplicationStagesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.stages.service.model.impl.MiicApplicationStagesModelImpl</code>.
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

		return _miicApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.stages.service.model.impl.MiicApplicationStagesModelImpl</code>.
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

		return _miicApplicationStagesLocalService.dynamicQuery(
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

		return _miicApplicationStagesLocalService.dynamicQueryCount(
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

		return _miicApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.miic.stages.service.model.MiicApplicationStages
		fetchMiicApplicationStages(long miicApplicationStagesId) {

		return _miicApplicationStagesLocalService.fetchMiicApplicationStages(
			miicApplicationStagesId);
	}

	/**
	 * Returns the miic application stages matching the UUID and group.
	 *
	 * @param uuid the miic application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	@Override
	public com.nbp.miic.stages.service.model.MiicApplicationStages
		fetchMiicApplicationStagesByUuidAndGroupId(String uuid, long groupId) {

		return _miicApplicationStagesLocalService.
			fetchMiicApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.nbp.miic.stages.service.model.MiicApplicationStages
			findBygetMIIC_By_CaseId(String caseId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return _miicApplicationStagesLocalService.findBygetMIIC_By_CaseId(
			caseId);
	}

	@Override
	public com.nbp.miic.stages.service.model.MiicApplicationStages
			findBygetMIIC_CAI(long miicApplicationId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return _miicApplicationStagesLocalService.findBygetMIIC_CAI(
			miicApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.miic.stages.service.model.MiicApplicationStages>
			findBygetMIIC_CaseId(String caseId) {

		return _miicApplicationStagesLocalService.findBygetMIIC_CaseId(caseId);
	}

	@Override
	public com.nbp.miic.stages.service.model.MiicApplicationStages
			findBygetMIIC_CaseIdAndStatus(String caseId, String stageStatus)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return _miicApplicationStagesLocalService.findBygetMIIC_CaseIdAndStatus(
			caseId, stageStatus);
	}

	@Override
	public com.nbp.miic.stages.service.model.MiicApplicationStages
			findBygetMIIC_CaseIdStageName(String caseId, String stageName)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return _miicApplicationStagesLocalService.findBygetMIIC_CaseIdStageName(
			caseId, stageName);
	}

	@Override
	public com.nbp.miic.stages.service.model.MiicApplicationStages
			findBygetMIIC_CaseIdStageStatus(
				String caseId, String stageStatus, String stageName)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return _miicApplicationStagesLocalService.
			findBygetMIIC_CaseIdStageStatus(caseId, stageStatus, stageName);
	}

	@Override
	public java.util.List
		<com.nbp.miic.stages.service.model.MiicApplicationStages>
			findBygetMIIC_StageName(String stageName) {

		return _miicApplicationStagesLocalService.findBygetMIIC_StageName(
			stageName);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _miicApplicationStagesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _miicApplicationStagesLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _miicApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public String getMIICApplicaitonCurrentStages(String caseId) {
		return _miicApplicationStagesLocalService.
			getMIICApplicaitonCurrentStages(caseId);
	}

	/**
	 * Returns the miic application stages with the primary key.
	 *
	 * @param miicApplicationStagesId the primary key of the miic application stages
	 * @return the miic application stages
	 * @throws PortalException if a miic application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.miic.stages.service.model.MiicApplicationStages
			getMiicApplicationStages(long miicApplicationStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicApplicationStagesLocalService.getMiicApplicationStages(
			miicApplicationStagesId);
	}

	/**
	 * Returns the miic application stages matching the UUID and group.
	 *
	 * @param uuid the miic application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching miic application stages
	 * @throws PortalException if a matching miic application stages could not be found
	 */
	@Override
	public com.nbp.miic.stages.service.model.MiicApplicationStages
			getMiicApplicationStagesByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicApplicationStagesLocalService.
			getMiicApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the miic application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.stages.service.model.impl.MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @return the range of miic application stageses
	 */
	@Override
	public java.util.List
		<com.nbp.miic.stages.service.model.MiicApplicationStages>
			getMiicApplicationStageses(int start, int end) {

		return _miicApplicationStagesLocalService.getMiicApplicationStageses(
			start, end);
	}

	/**
	 * Returns all the miic application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the miic application stageses
	 * @param companyId the primary key of the company
	 * @return the matching miic application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.miic.stages.service.model.MiicApplicationStages>
			getMiicApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _miicApplicationStagesLocalService.
			getMiicApplicationStagesesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of miic application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the miic application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching miic application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.miic.stages.service.model.MiicApplicationStages>
			getMiicApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.miic.stages.service.model.MiicApplicationStages>
						orderByComparator) {

		return _miicApplicationStagesLocalService.
			getMiicApplicationStagesesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of miic application stageses.
	 *
	 * @return the number of miic application stageses
	 */
	@Override
	public int getMiicApplicationStagesesCount() {
		return _miicApplicationStagesLocalService.
			getMiicApplicationStagesesCount();
	}

	@Override
	public java.util.List<String> getMiicDistinctStages() {
		return _miicApplicationStagesLocalService.getMiicDistinctStages();
	}

	@Override
	public Long getMIICSeenCases() {
		return _miicApplicationStagesLocalService.getMIICSeenCases();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _miicApplicationStagesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _miicApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the miic application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicApplicationStages the miic application stages
	 * @return the miic application stages that was updated
	 */
	@Override
	public com.nbp.miic.stages.service.model.MiicApplicationStages
		updateMiicApplicationStages(
			com.nbp.miic.stages.service.model.MiicApplicationStages
				miicApplicationStages) {

		return _miicApplicationStagesLocalService.updateMiicApplicationStages(
			miicApplicationStages);
	}

	@Override
	public com.nbp.miic.stages.service.model.MiicApplicationStages
		updateMIICApplicationStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return _miicApplicationStagesLocalService.updateMIICApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _miicApplicationStagesLocalService.getBasePersistence();
	}

	@Override
	public MiicApplicationStagesLocalService getWrappedService() {
		return _miicApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		MiicApplicationStagesLocalService miicApplicationStagesLocalService) {

		_miicApplicationStagesLocalService = miicApplicationStagesLocalService;
	}

	private MiicApplicationStagesLocalService
		_miicApplicationStagesLocalService;

}