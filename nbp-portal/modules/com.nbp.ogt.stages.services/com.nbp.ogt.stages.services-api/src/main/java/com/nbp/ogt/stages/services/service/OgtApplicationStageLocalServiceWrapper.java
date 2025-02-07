/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OgtApplicationStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OgtApplicationStageLocalService
 * @generated
 */
public class OgtApplicationStageLocalServiceWrapper
	implements OgtApplicationStageLocalService,
			   ServiceWrapper<OgtApplicationStageLocalService> {

	public OgtApplicationStageLocalServiceWrapper() {
		this(null);
	}

	public OgtApplicationStageLocalServiceWrapper(
		OgtApplicationStageLocalService ogtApplicationStageLocalService) {

		_ogtApplicationStageLocalService = ogtApplicationStageLocalService;
	}

	/**
	 * Adds the ogt application stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtApplicationStage the ogt application stage
	 * @return the ogt application stage that was added
	 */
	@Override
	public com.nbp.ogt.stages.services.model.OgtApplicationStage
		addOgtApplicationStage(
			com.nbp.ogt.stages.services.model.OgtApplicationStage
				ogtApplicationStage) {

		return _ogtApplicationStageLocalService.addOgtApplicationStage(
			ogtApplicationStage);
	}

	/**
	 * Creates a new ogt application stage with the primary key. Does not add the ogt application stage to the database.
	 *
	 * @param ogtStagesId the primary key for the new ogt application stage
	 * @return the new ogt application stage
	 */
	@Override
	public com.nbp.ogt.stages.services.model.OgtApplicationStage
		createOgtApplicationStage(long ogtStagesId) {

		return _ogtApplicationStageLocalService.createOgtApplicationStage(
			ogtStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtApplicationStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ogt application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtStagesId the primary key of the ogt application stage
	 * @return the ogt application stage that was removed
	 * @throws PortalException if a ogt application stage with the primary key could not be found
	 */
	@Override
	public com.nbp.ogt.stages.services.model.OgtApplicationStage
			deleteOgtApplicationStage(long ogtStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtApplicationStageLocalService.deleteOgtApplicationStage(
			ogtStagesId);
	}

	/**
	 * Deletes the ogt application stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtApplicationStage the ogt application stage
	 * @return the ogt application stage that was removed
	 */
	@Override
	public com.nbp.ogt.stages.services.model.OgtApplicationStage
		deleteOgtApplicationStage(
			com.nbp.ogt.stages.services.model.OgtApplicationStage
				ogtApplicationStage) {

		return _ogtApplicationStageLocalService.deleteOgtApplicationStage(
			ogtApplicationStage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtApplicationStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ogtApplicationStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ogtApplicationStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ogtApplicationStageLocalService.dynamicQuery();
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

		return _ogtApplicationStageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.stages.services.model.impl.OgtApplicationStageModelImpl</code>.
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

		return _ogtApplicationStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.stages.services.model.impl.OgtApplicationStageModelImpl</code>.
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

		return _ogtApplicationStageLocalService.dynamicQuery(
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

		return _ogtApplicationStageLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ogtApplicationStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ogt.stages.services.model.OgtApplicationStage
		fetchOgtApplicationStage(long ogtStagesId) {

		return _ogtApplicationStageLocalService.fetchOgtApplicationStage(
			ogtStagesId);
	}

	/**
	 * Returns the ogt application stage matching the UUID and group.
	 *
	 * @param uuid the ogt application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	@Override
	public com.nbp.ogt.stages.services.model.OgtApplicationStage
		fetchOgtApplicationStageByUuidAndGroupId(String uuid, long groupId) {

		return _ogtApplicationStageLocalService.
			fetchOgtApplicationStageByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ogtApplicationStageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _ogtApplicationStageLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ogtApplicationStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ogt.stages.services.model.OgtApplicationStage
			getMedicalByCI_ST(String caseId, String stageStatus)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return _ogtApplicationStageLocalService.getMedicalByCI_ST(
			caseId, stageStatus);
	}

	@Override
	public String getNcbjApplicaitonCurrentStages(String caseId) {
		return _ogtApplicationStageLocalService.getNcbjApplicaitonCurrentStages(
			caseId);
	}

	/**
	 * Returns the ogt application stage with the primary key.
	 *
	 * @param ogtStagesId the primary key of the ogt application stage
	 * @return the ogt application stage
	 * @throws PortalException if a ogt application stage with the primary key could not be found
	 */
	@Override
	public com.nbp.ogt.stages.services.model.OgtApplicationStage
			getOgtApplicationStage(long ogtStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtApplicationStageLocalService.getOgtApplicationStage(
			ogtStagesId);
	}

	/**
	 * Returns the ogt application stage matching the UUID and group.
	 *
	 * @param uuid the ogt application stage's UUID
	 * @param groupId the primary key of the group
	 * @return the matching ogt application stage
	 * @throws PortalException if a matching ogt application stage could not be found
	 */
	@Override
	public com.nbp.ogt.stages.services.model.OgtApplicationStage
			getOgtApplicationStageByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtApplicationStageLocalService.
			getOgtApplicationStageByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the ogt application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.stages.services.model.impl.OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @return the range of ogt application stages
	 */
	@Override
	public java.util.List<com.nbp.ogt.stages.services.model.OgtApplicationStage>
		getOgtApplicationStages(int start, int end) {

		return _ogtApplicationStageLocalService.getOgtApplicationStages(
			start, end);
	}

	/**
	 * Returns all the ogt application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the ogt application stages
	 * @param companyId the primary key of the company
	 * @return the matching ogt application stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.nbp.ogt.stages.services.model.OgtApplicationStage>
		getOgtApplicationStagesByUuidAndCompanyId(String uuid, long companyId) {

		return _ogtApplicationStageLocalService.
			getOgtApplicationStagesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of ogt application stages matching the UUID and company.
	 *
	 * @param uuid the UUID of the ogt application stages
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching ogt application stages, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.nbp.ogt.stages.services.model.OgtApplicationStage>
		getOgtApplicationStagesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.nbp.ogt.stages.services.model.OgtApplicationStage>
					orderByComparator) {

		return _ogtApplicationStageLocalService.
			getOgtApplicationStagesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of ogt application stages.
	 *
	 * @return the number of ogt application stages
	 */
	@Override
	public int getOgtApplicationStagesCount() {
		return _ogtApplicationStageLocalService.getOgtApplicationStagesCount();
	}

	@Override
	public java.util.List<com.nbp.ogt.stages.services.model.OgtApplicationStage>
			getOgtByCI(String caseId)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return _ogtApplicationStageLocalService.getOgtByCI(caseId);
	}

	@Override
	public java.util.List<String> getOGTDistinctStages() {
		return _ogtApplicationStageLocalService.getOGTDistinctStages();
	}

	@Override
	public Long getOGTSeenCases() {
		return _ogtApplicationStageLocalService.getOGTSeenCases();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ogtApplicationStageLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.nbp.ogt.stages.services.model.OgtApplicationStage getOtgBy_CI(
			String caseId)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return _ogtApplicationStageLocalService.getOtgBy_CI(caseId);
	}

	@Override
	public com.nbp.ogt.stages.services.model.OgtApplicationStage getOtgByCI_SN(
			String caseId, String stageName)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return _ogtApplicationStageLocalService.getOtgByCI_SN(
			caseId, stageName);
	}

	@Override
	public com.nbp.ogt.stages.services.model.OgtApplicationStage
			getOtgByCI_ST_SN(
				String caseId, String stageStatus, String stageName)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return _ogtApplicationStageLocalService.getOtgByCI_ST_SN(
			caseId, stageStatus, stageName);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtApplicationStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List<com.nbp.ogt.stages.services.model.OgtApplicationStage>
		gtOgtApplicationStage_By_SN(String stageName) {

		return _ogtApplicationStageLocalService.gtOgtApplicationStage_By_SN(
			stageName);
	}

	/**
	 * Updates the ogt application stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtApplicationStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtApplicationStage the ogt application stage
	 * @return the ogt application stage that was updated
	 */
	@Override
	public com.nbp.ogt.stages.services.model.OgtApplicationStage
		updateOgtApplicationStage(
			com.nbp.ogt.stages.services.model.OgtApplicationStage
				ogtApplicationStage) {

		return _ogtApplicationStageLocalService.updateOgtApplicationStage(
			ogtApplicationStage);
	}

	@Override
	public com.nbp.ogt.stages.services.model.OgtApplicationStage
		updateOgtApplicationStage(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return _ogtApplicationStageLocalService.updateOgtApplicationStage(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ogtApplicationStageLocalService.getBasePersistence();
	}

	@Override
	public OgtApplicationStageLocalService getWrappedService() {
		return _ogtApplicationStageLocalService;
	}

	@Override
	public void setWrappedService(
		OgtApplicationStageLocalService ogtApplicationStageLocalService) {

		_ogtApplicationStageLocalService = ogtApplicationStageLocalService;
	}

	private OgtApplicationStageLocalService _ogtApplicationStageLocalService;

}