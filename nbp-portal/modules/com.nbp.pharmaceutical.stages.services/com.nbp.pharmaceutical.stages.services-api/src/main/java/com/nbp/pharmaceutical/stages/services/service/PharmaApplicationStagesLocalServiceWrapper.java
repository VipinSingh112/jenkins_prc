/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link PharmaApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationStagesLocalService
 * @generated
 */
public class PharmaApplicationStagesLocalServiceWrapper
	implements PharmaApplicationStagesLocalService,
			   ServiceWrapper<PharmaApplicationStagesLocalService> {

	public PharmaApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public PharmaApplicationStagesLocalServiceWrapper(
		PharmaApplicationStagesLocalService
			pharmaApplicationStagesLocalService) {

		_pharmaApplicationStagesLocalService =
			pharmaApplicationStagesLocalService;
	}

	/**
	 * Adds the pharma application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationStages the pharma application stages
	 * @return the pharma application stages that was added
	 */
	@Override
	public com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages
		addPharmaApplicationStages(
			com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages
				pharmaApplicationStages) {

		return _pharmaApplicationStagesLocalService.addPharmaApplicationStages(
			pharmaApplicationStages);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new pharma application stages with the primary key. Does not add the pharma application stages to the database.
	 *
	 * @param pharmaApplicationstageId the primary key for the new pharma application stages
	 * @return the new pharma application stages
	 */
	@Override
	public com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages
		createPharmaApplicationStages(long pharmaApplicationstageId) {

		return _pharmaApplicationStagesLocalService.
			createPharmaApplicationStages(pharmaApplicationstageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the pharma application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationstageId the primary key of the pharma application stages
	 * @return the pharma application stages that was removed
	 * @throws PortalException if a pharma application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages
			deletePharmaApplicationStages(long pharmaApplicationstageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationStagesLocalService.
			deletePharmaApplicationStages(pharmaApplicationstageId);
	}

	/**
	 * Deletes the pharma application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationStages the pharma application stages
	 * @return the pharma application stages that was removed
	 */
	@Override
	public com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages
		deletePharmaApplicationStages(
			com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages
				pharmaApplicationStages) {

		return _pharmaApplicationStagesLocalService.
			deletePharmaApplicationStages(pharmaApplicationStages);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pharmaApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pharmaApplicationStagesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pharmaApplicationStagesLocalService.dynamicQuery();
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

		return _pharmaApplicationStagesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationStagesModelImpl</code>.
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

		return _pharmaApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationStagesModelImpl</code>.
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

		return _pharmaApplicationStagesLocalService.dynamicQuery(
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

		return _pharmaApplicationStagesLocalService.dynamicQueryCount(
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

		return _pharmaApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages
		fetchPharmaApplicationStages(long pharmaApplicationstageId) {

		return _pharmaApplicationStagesLocalService.
			fetchPharmaApplicationStages(pharmaApplicationstageId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pharmaApplicationStagesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pharmaApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaApplicationStagesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the pharma application stages with the primary key.
	 *
	 * @param pharmaApplicationstageId the primary key of the pharma application stages
	 * @return the pharma application stages
	 * @throws PortalException if a pharma application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages
			getPharmaApplicationStages(long pharmaApplicationstageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaApplicationStagesLocalService.getPharmaApplicationStages(
			pharmaApplicationstageId);
	}

	@Override
	public com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages
			getPharmaApplicationStages(String caseId, String stageName)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return _pharmaApplicationStagesLocalService.getPharmaApplicationStages(
			caseId, stageName);
	}

	@Override
	public java.util.List
		<com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages>
				getPharmaApplicationStagesByCaseId(String caseId)
			throws com.nbp.pharmaceutical.stages.services.exception.
				NoSuchPharmaApplicationStagesException {

		return _pharmaApplicationStagesLocalService.
			getPharmaApplicationStagesByCaseId(caseId);
	}

	@Override
	public com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages
			getPharmaApplicationStagesByCaseIdStageStageNameStageStatus(
				String caseId, String stageName, String Stage)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return _pharmaApplicationStagesLocalService.
			getPharmaApplicationStagesByCaseIdStageStageNameStageStatus(
				caseId, stageName, Stage);
	}

	@Override
	public java.util.List
		<com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages>
			getPharmaApplicationStagesByCI_SN_SS(
				String caseId, String stageName, String Stage) {

		return _pharmaApplicationStagesLocalService.
			getPharmaApplicationStagesByCI_SN_SS(caseId, stageName, Stage);
	}

	@Override
	public com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages
			getPharmaApplicationStagesByStatus(
				String caseId, String stageStatus)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return _pharmaApplicationStagesLocalService.
			getPharmaApplicationStagesByStatus(caseId, stageStatus);
	}

	/**
	 * Returns a range of all the pharma application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @return the range of pharma application stageses
	 */
	@Override
	public java.util.List
		<com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages>
			getPharmaApplicationStageses(int start, int end) {

		return _pharmaApplicationStagesLocalService.
			getPharmaApplicationStageses(start, end);
	}

	/**
	 * Returns the number of pharma application stageses.
	 *
	 * @return the number of pharma application stageses
	 */
	@Override
	public int getPharmaApplicationStagesesCount() {
		return _pharmaApplicationStagesLocalService.
			getPharmaApplicationStagesesCount();
	}

	@Override
	public java.util.List
		<com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages>
			getPharmaBy_SN(String stageName) {

		return _pharmaApplicationStagesLocalService.getPharmaBy_SN(stageName);
	}

	@Override
	public Long getPharmaceuticalSeenCases() {
		return _pharmaApplicationStagesLocalService.
			getPharmaceuticalSeenCases();
	}

	@Override
	public String getPharmaCurrentStages(String caseId) {
		return _pharmaApplicationStagesLocalService.getPharmaCurrentStages(
			caseId);
	}

	@Override
	public java.util.List<String> getPharmaDistinctStages() {
		return _pharmaApplicationStagesLocalService.getPharmaDistinctStages();
	}

	@Override
	public java.util.List
		<com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages>
			getPS_StageName_StageStatus(String stageName, String status) {

		return _pharmaApplicationStagesLocalService.getPS_StageName_StageStatus(
			stageName, status);
	}

	/**
	 * Updates the pharma application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationStages the pharma application stages
	 * @return the pharma application stages that was updated
	 */
	@Override
	public com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages
		updatePharmaApplicationStages(
			com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages
				pharmaApplicationStages) {

		return _pharmaApplicationStagesLocalService.
			updatePharmaApplicationStages(pharmaApplicationStages);
	}

	@Override
	public com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages
			updatePharmaApplicationStages(
				String caseId, String stageName, java.util.Date stageStartDate,
				java.util.Date stageEndDate, String duration,
				String stageStatus)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return _pharmaApplicationStagesLocalService.
			updatePharmaApplicationStages(
				caseId, stageName, stageStartDate, stageEndDate, duration,
				stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _pharmaApplicationStagesLocalService.getBasePersistence();
	}

	@Override
	public PharmaApplicationStagesLocalService getWrappedService() {
		return _pharmaApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		PharmaApplicationStagesLocalService
			pharmaApplicationStagesLocalService) {

		_pharmaApplicationStagesLocalService =
			pharmaApplicationStagesLocalService;
	}

	private PharmaApplicationStagesLocalService
		_pharmaApplicationStagesLocalService;

}