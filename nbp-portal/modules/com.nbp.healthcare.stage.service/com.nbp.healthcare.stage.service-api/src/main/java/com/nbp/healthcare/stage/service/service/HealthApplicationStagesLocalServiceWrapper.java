/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link HealthApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthApplicationStagesLocalService
 * @generated
 */
public class HealthApplicationStagesLocalServiceWrapper
	implements HealthApplicationStagesLocalService,
			   ServiceWrapper<HealthApplicationStagesLocalService> {

	public HealthApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public HealthApplicationStagesLocalServiceWrapper(
		HealthApplicationStagesLocalService
			healthApplicationStagesLocalService) {

		_healthApplicationStagesLocalService =
			healthApplicationStagesLocalService;
	}

	/**
	 * Adds the health application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthApplicationStages the health application stages
	 * @return the health application stages that was added
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthApplicationStages
		addHealthApplicationStages(
			com.nbp.healthcare.stage.service.model.HealthApplicationStages
				healthApplicationStages) {

		return _healthApplicationStagesLocalService.addHealthApplicationStages(
			healthApplicationStages);
	}

	/**
	 * Creates a new health application stages with the primary key. Does not add the health application stages to the database.
	 *
	 * @param healthApplicationStagesId the primary key for the new health application stages
	 * @return the new health application stages
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthApplicationStages
		createHealthApplicationStages(long healthApplicationStagesId) {

		return _healthApplicationStagesLocalService.
			createHealthApplicationStages(healthApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the health application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthApplicationStages the health application stages
	 * @return the health application stages that was removed
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthApplicationStages
		deleteHealthApplicationStages(
			com.nbp.healthcare.stage.service.model.HealthApplicationStages
				healthApplicationStages) {

		return _healthApplicationStagesLocalService.
			deleteHealthApplicationStages(healthApplicationStages);
	}

	/**
	 * Deletes the health application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthApplicationStagesId the primary key of the health application stages
	 * @return the health application stages that was removed
	 * @throws PortalException if a health application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthApplicationStages
			deleteHealthApplicationStages(long healthApplicationStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthApplicationStagesLocalService.
			deleteHealthApplicationStages(healthApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _healthApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _healthApplicationStagesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _healthApplicationStagesLocalService.dynamicQuery();
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

		return _healthApplicationStagesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthApplicationStagesModelImpl</code>.
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

		return _healthApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthApplicationStagesModelImpl</code>.
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

		return _healthApplicationStagesLocalService.dynamicQuery(
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

		return _healthApplicationStagesLocalService.dynamicQueryCount(
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

		return _healthApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.healthcare.stage.service.model.HealthApplicationStages
		fetchHealthApplicationStages(long healthApplicationStagesId) {

		return _healthApplicationStagesLocalService.
			fetchHealthApplicationStages(healthApplicationStagesId);
	}

	/**
	 * Returns the health application stages matching the UUID and group.
	 *
	 * @param uuid the health application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthApplicationStages
		fetchHealthApplicationStagesByUuidAndGroupId(
			String uuid, long groupId) {

		return _healthApplicationStagesLocalService.
			fetchHealthApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _healthApplicationStagesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _healthApplicationStagesLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	/**
	 * Returns the health application stages with the primary key.
	 *
	 * @param healthApplicationStagesId the primary key of the health application stages
	 * @return the health application stages
	 * @throws PortalException if a health application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthApplicationStages
			getHealthApplicationStages(long healthApplicationStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthApplicationStagesLocalService.getHealthApplicationStages(
			healthApplicationStagesId);
	}

	/**
	 * Returns the health application stages matching the UUID and group.
	 *
	 * @param uuid the health application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching health application stages
	 * @throws PortalException if a matching health application stages could not be found
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthApplicationStages
			getHealthApplicationStagesByUuidAndGroupId(
				String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthApplicationStagesLocalService.
			getHealthApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the health application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @return the range of health application stageses
	 */
	@Override
	public java.util.List
		<com.nbp.healthcare.stage.service.model.HealthApplicationStages>
			getHealthApplicationStageses(int start, int end) {

		return _healthApplicationStagesLocalService.
			getHealthApplicationStageses(start, end);
	}

	/**
	 * Returns all the health application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the health application stageses
	 * @param companyId the primary key of the company
	 * @return the matching health application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.healthcare.stage.service.model.HealthApplicationStages>
			getHealthApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _healthApplicationStagesLocalService.
			getHealthApplicationStagesesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of health application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the health application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching health application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.healthcare.stage.service.model.HealthApplicationStages>
			getHealthApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.healthcare.stage.service.model.
						HealthApplicationStages> orderByComparator) {

		return _healthApplicationStagesLocalService.
			getHealthApplicationStagesesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of health application stageses.
	 *
	 * @return the number of health application stageses
	 */
	@Override
	public int getHealthApplicationStagesesCount() {
		return _healthApplicationStagesLocalService.
			getHealthApplicationStagesesCount();
	}

	@Override
	public java.util.List
		<com.nbp.healthcare.stage.service.model.HealthApplicationStages>
			getHealthCareBy_SN(String stageName) {

		return _healthApplicationStagesLocalService.getHealthCareBy_SN(
			stageName);
	}

	@Override
	public java.util.List
		<com.nbp.healthcare.stage.service.model.HealthApplicationStages>
			getHealthCareBy_SN_SS(String stageName, String status) {

		return _healthApplicationStagesLocalService.getHealthCareBy_SN_SS(
			stageName, status);
	}

	@Override
	public java.util.List<String> getHealthCareDistinctStages() {
		return _healthApplicationStagesLocalService.
			getHealthCareDistinctStages();
	}

	@Override
	public java.util.List
		<com.nbp.healthcare.stage.service.model.HealthApplicationStages>
			getHealthcareStageBy_CI(String caseId) {

		return _healthApplicationStagesLocalService.getHealthcareStageBy_CI(
			caseId);
	}

	@Override
	public com.nbp.healthcare.stage.service.model.HealthApplicationStages
			getHealthcareStageBy_CI_SN(String caseId, String stageName)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return _healthApplicationStagesLocalService.getHealthcareStageBy_CI_SN(
			caseId, stageName);
	}

	@Override
	public com.nbp.healthcare.stage.service.model.HealthApplicationStages
			getHealthcareStageBy_CI_SN_ST(
				String caseId, String stageName, String stageStatus)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return _healthApplicationStagesLocalService.
			getHealthcareStageBy_CI_SN_ST(caseId, stageName, stageStatus);
	}

	@Override
	public com.nbp.healthcare.stage.service.model.HealthApplicationStages
			getHealthcareStageBy_CI_ST(String caseId, String stageStatus)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return _healthApplicationStagesLocalService.getHealthcareStageBy_CI_ST(
			caseId, stageStatus);
	}

	@Override
	public com.nbp.healthcare.stage.service.model.HealthApplicationStages
			getHealthcareStageBy_HAI(long healthApplicationId)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return _healthApplicationStagesLocalService.getHealthcareStageBy_HAI(
			healthApplicationId);
	}

	@Override
	public String getHealthCurrentStages(String caseId) {
		return _healthApplicationStagesLocalService.getHealthCurrentStages(
			caseId);
	}

	@Override
	public Long getHealthSeenCases() {
		return _healthApplicationStagesLocalService.getHealthSeenCases();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _healthApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthApplicationStagesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the health application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthApplicationStages the health application stages
	 * @return the health application stages that was updated
	 */
	@Override
	public com.nbp.healthcare.stage.service.model.HealthApplicationStages
		updateHealthApplicationStages(
			com.nbp.healthcare.stage.service.model.HealthApplicationStages
				healthApplicationStages) {

		return _healthApplicationStagesLocalService.
			updateHealthApplicationStages(healthApplicationStages);
	}

	@Override
	public com.nbp.healthcare.stage.service.model.HealthApplicationStages
		updateHealthApplicationStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return _healthApplicationStagesLocalService.
			updateHealthApplicationStages(
				caseId, stageName, stageStartDate, stageEndDate, duration,
				stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _healthApplicationStagesLocalService.getBasePersistence();
	}

	@Override
	public HealthApplicationStagesLocalService getWrappedService() {
		return _healthApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		HealthApplicationStagesLocalService
			healthApplicationStagesLocalService) {

		_healthApplicationStagesLocalService =
			healthApplicationStagesLocalService;
	}

	private HealthApplicationStagesLocalService
		_healthApplicationStagesLocalService;

}