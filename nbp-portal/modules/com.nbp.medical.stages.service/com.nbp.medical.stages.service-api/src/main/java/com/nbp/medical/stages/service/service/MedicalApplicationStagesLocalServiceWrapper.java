/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MedicalApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalApplicationStagesLocalService
 * @generated
 */
public class MedicalApplicationStagesLocalServiceWrapper
	implements MedicalApplicationStagesLocalService,
			   ServiceWrapper<MedicalApplicationStagesLocalService> {

	public MedicalApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public MedicalApplicationStagesLocalServiceWrapper(
		MedicalApplicationStagesLocalService
			medicalApplicationStagesLocalService) {

		_medicalApplicationStagesLocalService =
			medicalApplicationStagesLocalService;
	}

	/**
	 * Adds the medical application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalApplicationStages the medical application stages
	 * @return the medical application stages that was added
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalApplicationStages
		addMedicalApplicationStages(
			com.nbp.medical.stages.service.model.MedicalApplicationStages
				medicalApplicationStages) {

		return _medicalApplicationStagesLocalService.
			addMedicalApplicationStages(medicalApplicationStages);
	}

	/**
	 * Creates a new medical application stages with the primary key. Does not add the medical application stages to the database.
	 *
	 * @param medicalStagesId the primary key for the new medical application stages
	 * @return the new medical application stages
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalApplicationStages
		createMedicalApplicationStages(long medicalStagesId) {

		return _medicalApplicationStagesLocalService.
			createMedicalApplicationStages(medicalStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the medical application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalStagesId the primary key of the medical application stages
	 * @return the medical application stages that was removed
	 * @throws PortalException if a medical application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalApplicationStages
			deleteMedicalApplicationStages(long medicalStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalApplicationStagesLocalService.
			deleteMedicalApplicationStages(medicalStagesId);
	}

	/**
	 * Deletes the medical application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalApplicationStages the medical application stages
	 * @return the medical application stages that was removed
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalApplicationStages
		deleteMedicalApplicationStages(
			com.nbp.medical.stages.service.model.MedicalApplicationStages
				medicalApplicationStages) {

		return _medicalApplicationStagesLocalService.
			deleteMedicalApplicationStages(medicalApplicationStages);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _medicalApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _medicalApplicationStagesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _medicalApplicationStagesLocalService.dynamicQuery();
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

		return _medicalApplicationStagesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalApplicationStagesModelImpl</code>.
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

		return _medicalApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalApplicationStagesModelImpl</code>.
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

		return _medicalApplicationStagesLocalService.dynamicQuery(
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

		return _medicalApplicationStagesLocalService.dynamicQueryCount(
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

		return _medicalApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.medical.stages.service.model.MedicalApplicationStages
		fetchMedicalApplicationStages(long medicalStagesId) {

		return _medicalApplicationStagesLocalService.
			fetchMedicalApplicationStages(medicalStagesId);
	}

	/**
	 * Returns the medical application stages matching the UUID and group.
	 *
	 * @param uuid the medical application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalApplicationStages
		fetchMedicalApplicationStagesByUuidAndGroupId(
			String uuid, long groupId) {

		return _medicalApplicationStagesLocalService.
			fetchMedicalApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.nbp.medical.stages.service.model.MedicalApplicationStages
			get_Medical_By_CI(String caseId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return _medicalApplicationStagesLocalService.get_Medical_By_CI(caseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _medicalApplicationStagesLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _medicalApplicationStagesLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _medicalApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public String getManufacturingApplicaitonCurrentStages(String caseId) {
		return _medicalApplicationStagesLocalService.
			getManufacturingApplicaitonCurrentStages(caseId);
	}

	/**
	 * Returns the medical application stages with the primary key.
	 *
	 * @param medicalStagesId the primary key of the medical application stages
	 * @return the medical application stages
	 * @throws PortalException if a medical application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalApplicationStages
			getMedicalApplicationStages(long medicalStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalApplicationStagesLocalService.
			getMedicalApplicationStages(medicalStagesId);
	}

	/**
	 * Returns the medical application stages matching the UUID and group.
	 *
	 * @param uuid the medical application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical application stages
	 * @throws PortalException if a matching medical application stages could not be found
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalApplicationStages
			getMedicalApplicationStagesByUuidAndGroupId(
				String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalApplicationStagesLocalService.
			getMedicalApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the medical application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @return the range of medical application stageses
	 */
	@Override
	public java.util.List
		<com.nbp.medical.stages.service.model.MedicalApplicationStages>
			getMedicalApplicationStageses(int start, int end) {

		return _medicalApplicationStagesLocalService.
			getMedicalApplicationStageses(start, end);
	}

	/**
	 * Returns all the medical application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical application stageses
	 * @param companyId the primary key of the company
	 * @return the matching medical application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.stages.service.model.MedicalApplicationStages>
			getMedicalApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _medicalApplicationStagesLocalService.
			getMedicalApplicationStagesesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of medical application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching medical application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.stages.service.model.MedicalApplicationStages>
			getMedicalApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.medical.stages.service.model.
						MedicalApplicationStages> orderByComparator) {

		return _medicalApplicationStagesLocalService.
			getMedicalApplicationStagesesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of medical application stageses.
	 *
	 * @return the number of medical application stageses
	 */
	@Override
	public int getMedicalApplicationStagesesCount() {
		return _medicalApplicationStagesLocalService.
			getMedicalApplicationStagesesCount();
	}

	@Override
	public java.util.List
		<com.nbp.medical.stages.service.model.MedicalApplicationStages>
				getMedicalByCI(String caseId)
			throws com.nbp.medical.stages.service.exception.
				NoSuchMedicalApplicationStagesException {

		return _medicalApplicationStagesLocalService.getMedicalByCI(caseId);
	}

	@Override
	public com.nbp.medical.stages.service.model.MedicalApplicationStages
			getMedicalByCI_SN(String caseId, String stageName)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return _medicalApplicationStagesLocalService.getMedicalByCI_SN(
			caseId, stageName);
	}

	@Override
	public com.nbp.medical.stages.service.model.MedicalApplicationStages
			getMedicalByCI_ST(String caseId, String stageStatus)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return _medicalApplicationStagesLocalService.getMedicalByCI_ST(
			caseId, stageStatus);
	}

	@Override
	public com.nbp.medical.stages.service.model.MedicalApplicationStages
			getMedicalByCI_ST_SN(
				String caseId, String stageStatus, String stageName)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return _medicalApplicationStagesLocalService.getMedicalByCI_ST_SN(
			caseId, stageStatus, stageName);
	}

	@Override
	public java.util.List<String> getMedicalDistinctStages() {
		return _medicalApplicationStagesLocalService.getMedicalDistinctStages();
	}

	@Override
	public Long getMedicalSeenCases() {
		return _medicalApplicationStagesLocalService.getMedicalSeenCases();
	}

	@Override
	public String getNcbjApplicaitonCurrentStages(String caseId) {
		return _medicalApplicationStagesLocalService.
			getNcbjApplicaitonCurrentStages(caseId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalApplicationStagesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.medical.stages.service.model.MedicalApplicationStages>
			gtMedicalApplicationStages_By_SN(String stageName) {

		return _medicalApplicationStagesLocalService.
			gtMedicalApplicationStages_By_SN(stageName);
	}

	/**
	 * Updates the medical application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalApplicationStages the medical application stages
	 * @return the medical application stages that was updated
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalApplicationStages
		updateMedicalApplicationStages(
			com.nbp.medical.stages.service.model.MedicalApplicationStages
				medicalApplicationStages) {

		return _medicalApplicationStagesLocalService.
			updateMedicalApplicationStages(medicalApplicationStages);
	}

	@Override
	public com.nbp.medical.stages.service.model.MedicalApplicationStages
		updateMedicalApplicationStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return _medicalApplicationStagesLocalService.
			updateMedicalApplicationStages(
				caseId, stageName, stageStartDate, stageEndDate, duration,
				stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _medicalApplicationStagesLocalService.getBasePersistence();
	}

	@Override
	public MedicalApplicationStagesLocalService getWrappedService() {
		return _medicalApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		MedicalApplicationStagesLocalService
			medicalApplicationStagesLocalService) {

		_medicalApplicationStagesLocalService =
			medicalApplicationStagesLocalService;
	}

	private MedicalApplicationStagesLocalService
		_medicalApplicationStagesLocalService;

}