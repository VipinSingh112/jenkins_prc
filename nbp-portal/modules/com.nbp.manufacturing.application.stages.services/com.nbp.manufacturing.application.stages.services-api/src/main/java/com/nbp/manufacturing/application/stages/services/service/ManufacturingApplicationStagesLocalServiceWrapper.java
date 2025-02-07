/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ManufacturingApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingApplicationStagesLocalService
 * @generated
 */
public class ManufacturingApplicationStagesLocalServiceWrapper
	implements ManufacturingApplicationStagesLocalService,
			   ServiceWrapper<ManufacturingApplicationStagesLocalService> {

	public ManufacturingApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public ManufacturingApplicationStagesLocalServiceWrapper(
		ManufacturingApplicationStagesLocalService
			manufacturingApplicationStagesLocalService) {

		_manufacturingApplicationStagesLocalService =
			manufacturingApplicationStagesLocalService;
	}

	/**
	 * Adds the manufacturing application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingApplicationStages the manufacturing application stages
	 * @return the manufacturing application stages that was added
	 */
	@Override
	public com.nbp.manufacturing.application.stages.services.model.
		ManufacturingApplicationStages addManufacturingApplicationStages(
			com.nbp.manufacturing.application.stages.services.model.
				ManufacturingApplicationStages manufacturingApplicationStages) {

		return _manufacturingApplicationStagesLocalService.
			addManufacturingApplicationStages(manufacturingApplicationStages);
	}

	/**
	 * Creates a new manufacturing application stages with the primary key. Does not add the manufacturing application stages to the database.
	 *
	 * @param manufacturingAppStagesId the primary key for the new manufacturing application stages
	 * @return the new manufacturing application stages
	 */
	@Override
	public com.nbp.manufacturing.application.stages.services.model.
		ManufacturingApplicationStages createManufacturingApplicationStages(
			long manufacturingAppStagesId) {

		return _manufacturingApplicationStagesLocalService.
			createManufacturingApplicationStages(manufacturingAppStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturingApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the manufacturing application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingAppStagesId the primary key of the manufacturing application stages
	 * @return the manufacturing application stages that was removed
	 * @throws PortalException if a manufacturing application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.stages.services.model.
		ManufacturingApplicationStages deleteManufacturingApplicationStages(
				long manufacturingAppStagesId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturingApplicationStagesLocalService.
			deleteManufacturingApplicationStages(manufacturingAppStagesId);
	}

	/**
	 * Deletes the manufacturing application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingApplicationStages the manufacturing application stages
	 * @return the manufacturing application stages that was removed
	 */
	@Override
	public com.nbp.manufacturing.application.stages.services.model.
		ManufacturingApplicationStages deleteManufacturingApplicationStages(
			com.nbp.manufacturing.application.stages.services.model.
				ManufacturingApplicationStages manufacturingApplicationStages) {

		return _manufacturingApplicationStagesLocalService.
			deleteManufacturingApplicationStages(
				manufacturingApplicationStages);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturingApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _manufacturingApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _manufacturingApplicationStagesLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _manufacturingApplicationStagesLocalService.dynamicQuery();
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

		return _manufacturingApplicationStagesLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingApplicationStagesModelImpl</code>.
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

		return _manufacturingApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingApplicationStagesModelImpl</code>.
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

		return _manufacturingApplicationStagesLocalService.dynamicQuery(
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

		return _manufacturingApplicationStagesLocalService.dynamicQueryCount(
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

		return _manufacturingApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.manufacturing.application.stages.services.model.
		ManufacturingApplicationStages fetchManufacturingApplicationStages(
			long manufacturingAppStagesId) {

		return _manufacturingApplicationStagesLocalService.
			fetchManufacturingApplicationStages(manufacturingAppStagesId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _manufacturingApplicationStagesLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _manufacturingApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public String getManufacturingApplicaitonCurrentStages(String caseId) {
		return _manufacturingApplicationStagesLocalService.
			getManufacturingApplicaitonCurrentStages(caseId);
	}

	/**
	 * Returns the manufacturing application stages with the primary key.
	 *
	 * @param manufacturingAppStagesId the primary key of the manufacturing application stages
	 * @return the manufacturing application stages
	 * @throws PortalException if a manufacturing application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.stages.services.model.
		ManufacturingApplicationStages getManufacturingApplicationStages(
				long manufacturingAppStagesId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturingApplicationStagesLocalService.
			getManufacturingApplicationStages(manufacturingAppStagesId);
	}

	/**
	 * Returns a range of all the manufacturing application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @return the range of manufacturing application stageses
	 */
	@Override
	public java.util.List
		<com.nbp.manufacturing.application.stages.services.model.
			ManufacturingApplicationStages> getManufacturingApplicationStageses(
				int start, int end) {

		return _manufacturingApplicationStagesLocalService.
			getManufacturingApplicationStageses(start, end);
	}

	/**
	 * Returns the number of manufacturing application stageses.
	 *
	 * @return the number of manufacturing application stageses
	 */
	@Override
	public int getManufacturingApplicationStagesesCount() {
		return _manufacturingApplicationStagesLocalService.
			getManufacturingApplicationStagesesCount();
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.stages.services.model.
			ManufacturingApplicationStages> getManufacturingByCI(String caseId)
				throws com.nbp.manufacturing.application.stages.services.
					exception.NoSuchManufacturingApplicationStagesException {

		return _manufacturingApplicationStagesLocalService.getManufacturingByCI(
			caseId);
	}

	@Override
	public com.nbp.manufacturing.application.stages.services.model.
		ManufacturingApplicationStages getManufacturingByCI_SN(
				String caseId, String stageName)
			throws com.nbp.manufacturing.application.stages.services.exception.
				NoSuchManufacturingApplicationStagesException {

		return _manufacturingApplicationStagesLocalService.
			getManufacturingByCI_SN(caseId, stageName);
	}

	@Override
	public com.nbp.manufacturing.application.stages.services.model.
		ManufacturingApplicationStages getManufacturingByCI_ST(
				String caseId, String stageStatus)
			throws com.nbp.manufacturing.application.stages.services.exception.
				NoSuchManufacturingApplicationStagesException {

		return _manufacturingApplicationStagesLocalService.
			getManufacturingByCI_ST(caseId, stageStatus);
	}

	@Override
	public com.nbp.manufacturing.application.stages.services.model.
		ManufacturingApplicationStages getManufacturingByCI_ST_SN(
				String caseId, String stageStatus, String stageName)
			throws com.nbp.manufacturing.application.stages.services.exception.
				NoSuchManufacturingApplicationStagesException {

		return _manufacturingApplicationStagesLocalService.
			getManufacturingByCI_ST_SN(caseId, stageStatus, stageName);
	}

	@Override
	public com.nbp.manufacturing.application.stages.services.model.
		ManufacturingApplicationStages getManufacturingByMAI(
				long manufacturingApplicationId)
			throws com.nbp.manufacturing.application.stages.services.exception.
				NoSuchManufacturingApplicationStagesException {

		return _manufacturingApplicationStagesLocalService.
			getManufacturingByMAI(manufacturingApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.stages.services.model.
			ManufacturingApplicationStages> getManufacturingBySN_Status(
					String stageName, String status)
				throws com.nbp.manufacturing.application.stages.services.
					exception.NoSuchManufacturingApplicationStagesException {

		return _manufacturingApplicationStagesLocalService.
			getManufacturingBySN_Status(stageName, status);
	}

	@Override
	public java.util.List<String> getManufacturingDistinctStages() {
		return _manufacturingApplicationStagesLocalService.
			getManufacturingDistinctStages();
	}

	@Override
	public Long getManufacturingSeenCases() {
		return _manufacturingApplicationStagesLocalService.
			getManufacturingSeenCases();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manufacturingApplicationStagesLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manufacturingApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.stages.services.model.
			ManufacturingApplicationStages>
				gtManufacturingApplicationStages_By_SN(String stageName) {

		return _manufacturingApplicationStagesLocalService.
			gtManufacturingApplicationStages_By_SN(stageName);
	}

	/**
	 * Updates the manufacturing application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManufacturingApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manufacturingApplicationStages the manufacturing application stages
	 * @return the manufacturing application stages that was updated
	 */
	@Override
	public com.nbp.manufacturing.application.stages.services.model.
		ManufacturingApplicationStages updateManufacturingApplicationStages(
			com.nbp.manufacturing.application.stages.services.model.
				ManufacturingApplicationStages manufacturingApplicationStages) {

		return _manufacturingApplicationStagesLocalService.
			updateManufacturingApplicationStages(
				manufacturingApplicationStages);
	}

	@Override
	public com.nbp.manufacturing.application.stages.services.model.
		ManufacturingApplicationStages updateManufacturingApplicationStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return _manufacturingApplicationStagesLocalService.
			updateManufacturingApplicationStages(
				caseId, stageName, stageStartDate, stageEndDate, duration,
				stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _manufacturingApplicationStagesLocalService.getBasePersistence();
	}

	@Override
	public ManufacturingApplicationStagesLocalService getWrappedService() {
		return _manufacturingApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		ManufacturingApplicationStagesLocalService
			manufacturingApplicationStagesLocalService) {

		_manufacturingApplicationStagesLocalService =
			manufacturingApplicationStagesLocalService;
	}

	private ManufacturingApplicationStagesLocalService
		_manufacturingApplicationStagesLocalService;

}