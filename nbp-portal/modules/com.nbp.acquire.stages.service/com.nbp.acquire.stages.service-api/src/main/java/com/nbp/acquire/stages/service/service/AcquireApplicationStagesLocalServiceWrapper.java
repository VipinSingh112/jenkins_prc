/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AcquireApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireApplicationStagesLocalService
 * @generated
 */
public class AcquireApplicationStagesLocalServiceWrapper
	implements AcquireApplicationStagesLocalService,
			   ServiceWrapper<AcquireApplicationStagesLocalService> {

	public AcquireApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public AcquireApplicationStagesLocalServiceWrapper(
		AcquireApplicationStagesLocalService
			acquireApplicationStagesLocalService) {

		_acquireApplicationStagesLocalService =
			acquireApplicationStagesLocalService;
	}

	/**
	 * Adds the acquire application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireApplicationStages the acquire application stages
	 * @return the acquire application stages that was added
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireApplicationStages
		addAcquireApplicationStages(
			com.nbp.acquire.stages.service.model.AcquireApplicationStages
				acquireApplicationStages) {

		return _acquireApplicationStagesLocalService.
			addAcquireApplicationStages(acquireApplicationStages);
	}

	/**
	 * Creates a new acquire application stages with the primary key. Does not add the acquire application stages to the database.
	 *
	 * @param acquireApplicationStagesId the primary key for the new acquire application stages
	 * @return the new acquire application stages
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireApplicationStages
		createAcquireApplicationStages(long acquireApplicationStagesId) {

		return _acquireApplicationStagesLocalService.
			createAcquireApplicationStages(acquireApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acquire application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireApplicationStages the acquire application stages
	 * @return the acquire application stages that was removed
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireApplicationStages
		deleteAcquireApplicationStages(
			com.nbp.acquire.stages.service.model.AcquireApplicationStages
				acquireApplicationStages) {

		return _acquireApplicationStagesLocalService.
			deleteAcquireApplicationStages(acquireApplicationStages);
	}

	/**
	 * Deletes the acquire application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireApplicationStagesId the primary key of the acquire application stages
	 * @return the acquire application stages that was removed
	 * @throws PortalException if a acquire application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireApplicationStages
			deleteAcquireApplicationStages(long acquireApplicationStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireApplicationStagesLocalService.
			deleteAcquireApplicationStages(acquireApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _acquireApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _acquireApplicationStagesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acquireApplicationStagesLocalService.dynamicQuery();
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

		return _acquireApplicationStagesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireApplicationStagesModelImpl</code>.
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

		return _acquireApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireApplicationStagesModelImpl</code>.
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

		return _acquireApplicationStagesLocalService.dynamicQuery(
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

		return _acquireApplicationStagesLocalService.dynamicQueryCount(
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

		return _acquireApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireApplicationStages
		fetchAcquireApplicationStages(long acquireApplicationStagesId) {

		return _acquireApplicationStagesLocalService.
			fetchAcquireApplicationStages(acquireApplicationStagesId);
	}

	@Override
	public java.util.List
		<com.nbp.acquire.stages.service.model.AcquireApplicationStages>
			getAcquireApplicationByCaseId(String acquireCaseId) {

		return _acquireApplicationStagesLocalService.
			getAcquireApplicationByCaseId(acquireCaseId);
	}

	/**
	 * Returns the acquire application stages with the primary key.
	 *
	 * @param acquireApplicationStagesId the primary key of the acquire application stages
	 * @return the acquire application stages
	 * @throws PortalException if a acquire application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireApplicationStages
			getAcquireApplicationStages(long acquireApplicationStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireApplicationStagesLocalService.
			getAcquireApplicationStages(acquireApplicationStagesId);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireApplicationStages
			getAcquireApplicationStagesBy_AppId(long acquireApplicationId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return _acquireApplicationStagesLocalService.
			getAcquireApplicationStagesBy_AppId(acquireApplicationId);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireApplicationStages
			getAcquireApplicationStagesBy_CaseId(
				String acquireCaseId, String stageStatus)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return _acquireApplicationStagesLocalService.
			getAcquireApplicationStagesBy_CaseId(acquireCaseId, stageStatus);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireApplicationStages
			getAcquireApplicationStagesBy_CaseId_StageName(
				String acquireCaseId, String stageName)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return _acquireApplicationStagesLocalService.
			getAcquireApplicationStagesBy_CaseId_StageName(
				acquireCaseId, stageName);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireApplicationStages
			getAcquireApplicationStagesBy_CaseId_StageName_StageStatus(
				String acquireCaseId, String stageName, String stageStatus)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return _acquireApplicationStagesLocalService.
			getAcquireApplicationStagesBy_CaseId_StageName_StageStatus(
				acquireCaseId, stageName, stageStatus);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireApplicationStages
			getAcquireApplicationStagesBy_CI(String acquireCaseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return _acquireApplicationStagesLocalService.
			getAcquireApplicationStagesBy_CI(acquireCaseId);
	}

	/**
	 * Returns a range of all the acquire application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @return the range of acquire application stageses
	 */
	@Override
	public java.util.List
		<com.nbp.acquire.stages.service.model.AcquireApplicationStages>
			getAcquireApplicationStageses(int start, int end) {

		return _acquireApplicationStagesLocalService.
			getAcquireApplicationStageses(start, end);
	}

	/**
	 * Returns the number of acquire application stageses.
	 *
	 * @return the number of acquire application stageses
	 */
	@Override
	public int getAcquireApplicationStagesesCount() {
		return _acquireApplicationStagesLocalService.
			getAcquireApplicationStagesesCount();
	}

	@Override
	public String getAcquireCurrentStages(String caseId) {
		return _acquireApplicationStagesLocalService.getAcquireCurrentStages(
			caseId);
	}

	@Override
	public java.util.List<String> getAcquireDistinctStages() {
		return _acquireApplicationStagesLocalService.getAcquireDistinctStages();
	}

	@Override
	public Long getAcquireSeenCases() {
		return _acquireApplicationStagesLocalService.getAcquireSeenCases();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _acquireApplicationStagesLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.acquire.stages.service.model.AcquireApplicationStages>
			getApplicatrionStagesBy_SN(String stageName) {

		return _acquireApplicationStagesLocalService.getApplicatrionStagesBy_SN(
			stageName);
	}

	@Override
	public java.util.List
		<com.nbp.acquire.stages.service.model.AcquireApplicationStages>
			getApplicatrionStagesBy_StageName_StageStatus(
				String stageName, String stageStatus) {

		return _acquireApplicationStagesLocalService.
			getApplicatrionStagesBy_StageName_StageStatus(
				stageName, stageStatus);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _acquireApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireApplicationStagesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the acquire application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireApplicationStages the acquire application stages
	 * @return the acquire application stages that was updated
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireApplicationStages
		updateAcquireApplicationStages(
			com.nbp.acquire.stages.service.model.AcquireApplicationStages
				acquireApplicationStages) {

		return _acquireApplicationStagesLocalService.
			updateAcquireApplicationStages(acquireApplicationStages);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireApplicationStages
		updateAcquireApplicationStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return _acquireApplicationStagesLocalService.
			updateAcquireApplicationStages(
				caseId, stageName, stageStartDate, stageEndDate, duration,
				stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _acquireApplicationStagesLocalService.getBasePersistence();
	}

	@Override
	public AcquireApplicationStagesLocalService getWrappedService() {
		return _acquireApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		AcquireApplicationStagesLocalService
			acquireApplicationStagesLocalService) {

		_acquireApplicationStagesLocalService =
			acquireApplicationStagesLocalService;
	}

	private AcquireApplicationStagesLocalService
		_acquireApplicationStagesLocalService;

}