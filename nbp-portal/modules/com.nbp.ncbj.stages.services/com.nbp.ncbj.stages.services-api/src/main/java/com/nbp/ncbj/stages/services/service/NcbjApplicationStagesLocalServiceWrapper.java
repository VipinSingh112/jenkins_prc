/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicationStagesLocalService
 * @generated
 */
public class NcbjApplicationStagesLocalServiceWrapper
	implements NcbjApplicationStagesLocalService,
			   ServiceWrapper<NcbjApplicationStagesLocalService> {

	public NcbjApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public NcbjApplicationStagesLocalServiceWrapper(
		NcbjApplicationStagesLocalService ncbjApplicationStagesLocalService) {

		_ncbjApplicationStagesLocalService = ncbjApplicationStagesLocalService;
	}

	/**
	 * Adds the ncbj application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicationStages the ncbj application stages
	 * @return the ncbj application stages that was added
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationStages
		addNcbjApplicationStages(
			com.nbp.ncbj.stages.services.model.NcbjApplicationStages
				ncbjApplicationStages) {

		return _ncbjApplicationStagesLocalService.addNcbjApplicationStages(
			ncbjApplicationStages);
	}

	/**
	 * Creates a new ncbj application stages with the primary key. Does not add the ncbj application stages to the database.
	 *
	 * @param ncbjStagesApplicationId the primary key for the new ncbj application stages
	 * @return the new ncbj application stages
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationStages
		createNcbjApplicationStages(long ncbjStagesApplicationId) {

		return _ncbjApplicationStagesLocalService.createNcbjApplicationStages(
			ncbjStagesApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncbj application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjStagesApplicationId the primary key of the ncbj application stages
	 * @return the ncbj application stages that was removed
	 * @throws PortalException if a ncbj application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationStages
			deleteNcbjApplicationStages(long ncbjStagesApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjApplicationStagesLocalService.deleteNcbjApplicationStages(
			ncbjStagesApplicationId);
	}

	/**
	 * Deletes the ncbj application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicationStages the ncbj application stages
	 * @return the ncbj application stages that was removed
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationStages
		deleteNcbjApplicationStages(
			com.nbp.ncbj.stages.services.model.NcbjApplicationStages
				ncbjApplicationStages) {

		return _ncbjApplicationStagesLocalService.deleteNcbjApplicationStages(
			ncbjApplicationStages);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjApplicationStagesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjApplicationStagesLocalService.dynamicQuery();
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

		return _ncbjApplicationStagesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjApplicationStagesModelImpl</code>.
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

		return _ncbjApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjApplicationStagesModelImpl</code>.
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

		return _ncbjApplicationStagesLocalService.dynamicQuery(
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

		return _ncbjApplicationStagesLocalService.dynamicQueryCount(
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

		return _ncbjApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationStages
		fetchNcbjApplicationStages(long ncbjStagesApplicationId) {

		return _ncbjApplicationStagesLocalService.fetchNcbjApplicationStages(
			ncbjStagesApplicationId);
	}

	/**
	 * Returns the ncbj application stages matching the UUID and group.
	 *
	 * @param uuid the ncbj application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationStages
		fetchNcbjApplicationStagesByUuidAndGroupId(String uuid, long groupId) {

		return _ncbjApplicationStagesLocalService.
			fetchNcbjApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjApplicationStagesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _ncbjApplicationStagesLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public String getManufacturingApplicaitonCurrentStages(String caseId) {
		return _ncbjApplicationStagesLocalService.
			getManufacturingApplicaitonCurrentStages(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.ncbj.stages.services.model.NcbjApplicationStages>
				getMiningByCI(String caseId)
			throws com.nbp.ncbj.stages.services.exception.
				NoSuchNcbjApplicationStagesException {

		return _ncbjApplicationStagesLocalService.getMiningByCI(caseId);
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationStages
			getMiningByCI_SN(String caseId, String stageName)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return _ncbjApplicationStagesLocalService.getMiningByCI_SN(
			caseId, stageName);
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationStages
			getMiningByCI_ST(String caseId, String stageStatus)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return _ncbjApplicationStagesLocalService.getMiningByCI_ST(
			caseId, stageStatus);
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationStages
			getMiningByCI_ST_SN(
				String caseId, String stageStatus, String stageName)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return _ncbjApplicationStagesLocalService.getMiningByCI_ST_SN(
			caseId, stageStatus, stageName);
	}

	@Override
	public String getNcbjApplicaitonCurrentStages(String caseId) {
		return _ncbjApplicationStagesLocalService.
			getNcbjApplicaitonCurrentStages(caseId);
	}

	/**
	 * Returns the ncbj application stages with the primary key.
	 *
	 * @param ncbjStagesApplicationId the primary key of the ncbj application stages
	 * @return the ncbj application stages
	 * @throws PortalException if a ncbj application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationStages
			getNcbjApplicationStages(long ncbjStagesApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjApplicationStagesLocalService.getNcbjApplicationStages(
			ncbjStagesApplicationId);
	}

	/**
	 * Returns the ncbj application stages matching the UUID and group.
	 *
	 * @param uuid the ncbj application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ncbj application stages
	 * @throws PortalException if a matching ncbj application stages could not be found
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationStages
			getNcbjApplicationStagesByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjApplicationStagesLocalService.
			getNcbjApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the ncbj application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @return the range of ncbj application stageses
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.stages.services.model.NcbjApplicationStages>
			getNcbjApplicationStageses(int start, int end) {

		return _ncbjApplicationStagesLocalService.getNcbjApplicationStageses(
			start, end);
	}

	/**
	 * Returns all the ncbj application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the ncbj application stageses
	 * @param companyId the primary key of the company
	 * @return the matching ncbj application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.stages.services.model.NcbjApplicationStages>
			getNcbjApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _ncbjApplicationStagesLocalService.
			getNcbjApplicationStagesesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of ncbj application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the ncbj application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching ncbj application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.stages.services.model.NcbjApplicationStages>
			getNcbjApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.ncbj.stages.services.model.NcbjApplicationStages>
						orderByComparator) {

		return _ncbjApplicationStagesLocalService.
			getNcbjApplicationStagesesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of ncbj application stageses.
	 *
	 * @return the number of ncbj application stageses
	 */
	@Override
	public int getNcbjApplicationStagesesCount() {
		return _ncbjApplicationStagesLocalService.
			getNcbjApplicationStagesesCount();
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationStages getNCBJByCI(
			String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return _ncbjApplicationStagesLocalService.getNCBJByCI(caseId);
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationStages
			getNcbjByCI_SN(String caseId, String stageName)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return _ncbjApplicationStagesLocalService.getNcbjByCI_SN(
			caseId, stageName);
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationStages
			getNcbjByCI_ST_SN(
				String caseId, String stageStatus, String stageName)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return _ncbjApplicationStagesLocalService.getNcbjByCI_ST_SN(
			caseId, stageStatus, stageName);
	}

	@Override
	public java.util.List<String> getNcbjDistinctStages() {
		return _ncbjApplicationStagesLocalService.getNcbjDistinctStages();
	}

	@Override
	public Long getNCBJSeenCases() {
		return _ncbjApplicationStagesLocalService.getNCBJSeenCases();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjApplicationStagesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public Long getQuarrySeenCases() {
		return _ncbjApplicationStagesLocalService.getQuarrySeenCases();
	}

	@Override
	public java.util.List
		<com.nbp.ncbj.stages.services.model.NcbjApplicationStages>
			gtNcbjApplicationStages_By_SN(String stageName) {

		return _ncbjApplicationStagesLocalService.gtNcbjApplicationStages_By_SN(
			stageName);
	}

	/**
	 * Updates the ncbj application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicationStages the ncbj application stages
	 * @return the ncbj application stages that was updated
	 */
	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationStages
		updateNcbjApplicationStages(
			com.nbp.ncbj.stages.services.model.NcbjApplicationStages
				ncbjApplicationStages) {

		return _ncbjApplicationStagesLocalService.updateNcbjApplicationStages(
			ncbjApplicationStages);
	}

	@Override
	public com.nbp.ncbj.stages.services.model.NcbjApplicationStages
		updateNcbjApplicationStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return _ncbjApplicationStagesLocalService.updateNcbjApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjApplicationStagesLocalService.getBasePersistence();
	}

	@Override
	public NcbjApplicationStagesLocalService getWrappedService() {
		return _ncbjApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjApplicationStagesLocalService ncbjApplicationStagesLocalService) {

		_ncbjApplicationStagesLocalService = ncbjApplicationStagesLocalService;
	}

	private NcbjApplicationStagesLocalService
		_ncbjApplicationStagesLocalService;

}