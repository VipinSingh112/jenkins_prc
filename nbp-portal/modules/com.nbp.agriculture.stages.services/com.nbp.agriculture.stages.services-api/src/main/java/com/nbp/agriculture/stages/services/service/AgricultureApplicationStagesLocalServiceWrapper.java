/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AgricultureApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApplicationStagesLocalService
 * @generated
 */
public class AgricultureApplicationStagesLocalServiceWrapper
	implements AgricultureApplicationStagesLocalService,
			   ServiceWrapper<AgricultureApplicationStagesLocalService> {

	public AgricultureApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public AgricultureApplicationStagesLocalServiceWrapper(
		AgricultureApplicationStagesLocalService
			agricultureApplicationStagesLocalService) {

		_agricultureApplicationStagesLocalService =
			agricultureApplicationStagesLocalService;
	}

	/**
	 * Adds the agriculture application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureApplicationStages the agriculture application stages
	 * @return the agriculture application stages that was added
	 */
	@Override
	public
		com.nbp.agriculture.stages.services.model.AgricultureApplicationStages
			addAgricultureApplicationStages(
				com.nbp.agriculture.stages.services.model.
					AgricultureApplicationStages agricultureApplicationStages) {

		return _agricultureApplicationStagesLocalService.
			addAgricultureApplicationStages(agricultureApplicationStages);
	}

	/**
	 * Creates a new agriculture application stages with the primary key. Does not add the agriculture application stages to the database.
	 *
	 * @param agricultureApplicationstageId the primary key for the new agriculture application stages
	 * @return the new agriculture application stages
	 */
	@Override
	public
		com.nbp.agriculture.stages.services.model.AgricultureApplicationStages
			createAgricultureApplicationStages(
				long agricultureApplicationstageId) {

		return _agricultureApplicationStagesLocalService.
			createAgricultureApplicationStages(agricultureApplicationstageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the agriculture application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureApplicationStages the agriculture application stages
	 * @return the agriculture application stages that was removed
	 */
	@Override
	public
		com.nbp.agriculture.stages.services.model.AgricultureApplicationStages
			deleteAgricultureApplicationStages(
				com.nbp.agriculture.stages.services.model.
					AgricultureApplicationStages agricultureApplicationStages) {

		return _agricultureApplicationStagesLocalService.
			deleteAgricultureApplicationStages(agricultureApplicationStages);
	}

	/**
	 * Deletes the agriculture application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureApplicationstageId the primary key of the agriculture application stages
	 * @return the agriculture application stages that was removed
	 * @throws PortalException if a agriculture application stages with the primary key could not be found
	 */
	@Override
	public
		com.nbp.agriculture.stages.services.model.AgricultureApplicationStages
				deleteAgricultureApplicationStages(
					long agricultureApplicationstageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureApplicationStagesLocalService.
			deleteAgricultureApplicationStages(agricultureApplicationstageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _agricultureApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _agricultureApplicationStagesLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _agricultureApplicationStagesLocalService.dynamicQuery();
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

		return _agricultureApplicationStagesLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.agriculture.stages.services.model.impl.AgricultureApplicationStagesModelImpl</code>.
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

		return _agricultureApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.agriculture.stages.services.model.impl.AgricultureApplicationStagesModelImpl</code>.
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

		return _agricultureApplicationStagesLocalService.dynamicQuery(
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

		return _agricultureApplicationStagesLocalService.dynamicQueryCount(
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

		return _agricultureApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.agriculture.stages.services.model.AgricultureApplicationStages
			fetchAgricultureApplicationStages(
				long agricultureApplicationstageId) {

		return _agricultureApplicationStagesLocalService.
			fetchAgricultureApplicationStages(agricultureApplicationstageId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _agricultureApplicationStagesLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.agriculture.stages.services.model.AgricultureApplicationStages>
				getAgricultureApplicationByCaseId(String caseId)
			throws com.nbp.agriculture.stages.services.exception.
				NoSuchAgricultureApplicationStagesException {

		return _agricultureApplicationStagesLocalService.
			getAgricultureApplicationByCaseId(caseId);
	}

	@Override
	public
		com.nbp.agriculture.stages.services.model.AgricultureApplicationStages
				getAgricultureApplicationCaseIdStatus(
					String caseId, String status)
			throws com.nbp.agriculture.stages.services.exception.
				NoSuchAgricultureApplicationStagesException {

		return _agricultureApplicationStagesLocalService.
			getAgricultureApplicationCaseIdStatus(caseId, status);
	}

	@Override
	public String getAgricultureApplicationCurrentStages(String caseId) {
		return _agricultureApplicationStagesLocalService.
			getAgricultureApplicationCurrentStages(caseId);
	}

	/**
	 * Returns the agriculture application stages with the primary key.
	 *
	 * @param agricultureApplicationstageId the primary key of the agriculture application stages
	 * @return the agriculture application stages
	 * @throws PortalException if a agriculture application stages with the primary key could not be found
	 */
	@Override
	public
		com.nbp.agriculture.stages.services.model.AgricultureApplicationStages
				getAgricultureApplicationStages(
					long agricultureApplicationstageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureApplicationStagesLocalService.
			getAgricultureApplicationStages(agricultureApplicationstageId);
	}

	@Override
	public
		com.nbp.agriculture.stages.services.model.AgricultureApplicationStages
				getAgricultureApplicationStages(String caseId, String stageName)
			throws com.nbp.agriculture.stages.services.exception.
				NoSuchAgricultureApplicationStagesException {

		return _agricultureApplicationStagesLocalService.
			getAgricultureApplicationStages(caseId, stageName);
	}

	@Override
	public
		com.nbp.agriculture.stages.services.model.AgricultureApplicationStages
				getAgricultureApplicationStagesBY_SN_SS_CI(
					String caseId, String stageName, String stageStatus)
			throws com.nbp.agriculture.stages.services.exception.
				NoSuchAgricultureApplicationStagesException {

		return _agricultureApplicationStagesLocalService.
			getAgricultureApplicationStagesBY_SN_SS_CI(
				caseId, stageName, stageStatus);
	}

	/**
	 * Returns a range of all the agriculture application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.agriculture.stages.services.model.impl.AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @return the range of agriculture application stageses
	 */
	@Override
	public java.util.List
		<com.nbp.agriculture.stages.services.model.AgricultureApplicationStages>
			getAgricultureApplicationStageses(int start, int end) {

		return _agricultureApplicationStagesLocalService.
			getAgricultureApplicationStageses(start, end);
	}

	/**
	 * Returns the number of agriculture application stageses.
	 *
	 * @return the number of agriculture application stageses
	 */
	@Override
	public int getAgricultureApplicationStagesesCount() {
		return _agricultureApplicationStagesLocalService.
			getAgricultureApplicationStagesesCount();
	}

	@Override
	public java.util.List<String> getAgricultureDistinctStages() {
		return _agricultureApplicationStagesLocalService.
			getAgricultureDistinctStages();
	}

	@Override
	public Long getAgricultureSeenCases() {
		return _agricultureApplicationStagesLocalService.
			getAgricultureSeenCases();
	}

	@Override
	public java.util.List
		<com.nbp.agriculture.stages.services.model.AgricultureApplicationStages>
			getAgricultureStagesBy_SN(String stageName) {

		return _agricultureApplicationStagesLocalService.
			getAgricultureStagesBy_SN(stageName);
	}

	@Override
	public java.util.List
		<com.nbp.agriculture.stages.services.model.AgricultureApplicationStages>
			getAgricultureStagesBy_SN_SS(String stageName, String status) {

		return _agricultureApplicationStagesLocalService.
			getAgricultureStagesBy_SN_SS(stageName, status);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _agricultureApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agricultureApplicationStagesLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the agriculture application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureApplicationStages the agriculture application stages
	 * @return the agriculture application stages that was updated
	 */
	@Override
	public
		com.nbp.agriculture.stages.services.model.AgricultureApplicationStages
			updateAgricultureApplicationStages(
				com.nbp.agriculture.stages.services.model.
					AgricultureApplicationStages agricultureApplicationStages) {

		return _agricultureApplicationStagesLocalService.
			updateAgricultureApplicationStages(agricultureApplicationStages);
	}

	@Override
	public
		com.nbp.agriculture.stages.services.model.AgricultureApplicationStages
			updateAgricultureStages(
				String caseId, String stageName, java.util.Date stageStartDate,
				java.util.Date stageEndDate, String duration,
				String stageStatus) {

		return _agricultureApplicationStagesLocalService.
			updateAgricultureStages(
				caseId, stageName, stageStartDate, stageEndDate, duration,
				stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _agricultureApplicationStagesLocalService.getBasePersistence();
	}

	@Override
	public AgricultureApplicationStagesLocalService getWrappedService() {
		return _agricultureApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		AgricultureApplicationStagesLocalService
			agricultureApplicationStagesLocalService) {

		_agricultureApplicationStagesLocalService =
			agricultureApplicationStagesLocalService;
	}

	private AgricultureApplicationStagesLocalService
		_agricultureApplicationStagesLocalService;

}