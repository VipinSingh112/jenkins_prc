/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezStatusWFHApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWFHApplicationStagesLocalService
 * @generated
 */
public class SezStatusWFHApplicationStagesLocalServiceWrapper
	implements ServiceWrapper<SezStatusWFHApplicationStagesLocalService>,
			   SezStatusWFHApplicationStagesLocalService {

	public SezStatusWFHApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public SezStatusWFHApplicationStagesLocalServiceWrapper(
		SezStatusWFHApplicationStagesLocalService
			sezStatusWFHApplicationStagesLocalService) {

		_sezStatusWFHApplicationStagesLocalService =
			sezStatusWFHApplicationStagesLocalService;
	}

	/**
	 * Adds the sez status wfh application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusWFHApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusWFHApplicationStages the sez status wfh application stages
	 * @return the sez status wfh application stages that was added
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusWFHApplicationStages addSezStatusWFHApplicationStages(
			com.nbp.sez.status.application.stage.services.model.
				SezStatusWFHApplicationStages sezStatusWFHApplicationStages) {

		return _sezStatusWFHApplicationStagesLocalService.
			addSezStatusWFHApplicationStages(sezStatusWFHApplicationStages);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusWFHApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez status wfh application stages with the primary key. Does not add the sez status wfh application stages to the database.
	 *
	 * @param sezWFHAppStagesId the primary key for the new sez status wfh application stages
	 * @return the new sez status wfh application stages
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusWFHApplicationStages createSezStatusWFHApplicationStages(
			long sezWFHAppStagesId) {

		return _sezStatusWFHApplicationStagesLocalService.
			createSezStatusWFHApplicationStages(sezWFHAppStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusWFHApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez status wfh application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusWFHApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezWFHAppStagesId the primary key of the sez status wfh application stages
	 * @return the sez status wfh application stages that was removed
	 * @throws PortalException if a sez status wfh application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusWFHApplicationStages deleteSezStatusWFHApplicationStages(
				long sezWFHAppStagesId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusWFHApplicationStagesLocalService.
			deleteSezStatusWFHApplicationStages(sezWFHAppStagesId);
	}

	/**
	 * Deletes the sez status wfh application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusWFHApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusWFHApplicationStages the sez status wfh application stages
	 * @return the sez status wfh application stages that was removed
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusWFHApplicationStages deleteSezStatusWFHApplicationStages(
			com.nbp.sez.status.application.stage.services.model.
				SezStatusWFHApplicationStages sezStatusWFHApplicationStages) {

		return _sezStatusWFHApplicationStagesLocalService.
			deleteSezStatusWFHApplicationStages(sezStatusWFHApplicationStages);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezStatusWFHApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezStatusWFHApplicationStagesLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezStatusWFHApplicationStagesLocalService.dynamicQuery();
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

		return _sezStatusWFHApplicationStagesLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusWFHApplicationStagesModelImpl</code>.
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

		return _sezStatusWFHApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusWFHApplicationStagesModelImpl</code>.
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

		return _sezStatusWFHApplicationStagesLocalService.dynamicQuery(
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

		return _sezStatusWFHApplicationStagesLocalService.dynamicQueryCount(
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

		return _sezStatusWFHApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusWFHApplicationStages fetchSezStatusWFHApplicationStages(
			long sezWFHAppStagesId) {

		return _sezStatusWFHApplicationStagesLocalService.
			fetchSezStatusWFHApplicationStages(sezWFHAppStagesId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezStatusWFHApplicationStagesLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezStatusWFHApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezStatusWFHApplicationStagesLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusWFHApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusWFHApplicationStages> getSAS_CaseId(String caseId) {

		return _sezStatusWFHApplicationStagesLocalService.getSAS_CaseId(caseId);
	}

	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusWFHApplicationStages getSAS_CaseIdAndStatus(
				String caseId, String stageStatus)
			throws com.nbp.sez.status.application.stage.services.exception.
				NoSuchSezStatusWFHApplicationStagesException {

		return _sezStatusWFHApplicationStagesLocalService.
			getSAS_CaseIdAndStatus(caseId, stageStatus);
	}

	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusWFHApplicationStages getSAS_CaseIdStageName(
				String caseId, String stageName)
			throws com.nbp.sez.status.application.stage.services.exception.
				NoSuchSezStatusWFHApplicationStagesException {

		return _sezStatusWFHApplicationStagesLocalService.
			getSAS_CaseIdStageName(caseId, stageName);
	}

	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusWFHApplicationStages getSAS_CaseIdStageStatus(
				String caseId, String stageName, String stageStatus)
			throws com.nbp.sez.status.application.stage.services.exception.
				NoSuchSezStatusWFHApplicationStagesException {

		return _sezStatusWFHApplicationStagesLocalService.
			getSAS_CaseIdStageStatus(caseId, stageName, stageStatus);
	}

	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusWFHApplicationStages getSAS_SAI(long sezStatusApplicationId)
			throws com.nbp.sez.status.application.stage.services.exception.
				NoSuchSezStatusWFHApplicationStagesException {

		return _sezStatusWFHApplicationStagesLocalService.getSAS_SAI(
			sezStatusApplicationId);
	}

	@Override
	public Long getSezSeenCases() {
		return _sezStatusWFHApplicationStagesLocalService.getSezSeenCases();
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusWFHApplicationStages> getSezStatusApplicationsList_By_SN(
				String stageName) {

		return _sezStatusWFHApplicationStagesLocalService.
			getSezStatusApplicationsList_By_SN(stageName);
	}

	@Override
	public String getSezStatusCurrentStages(String caseId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWFHApplicationStagesException {

		return _sezStatusWFHApplicationStagesLocalService.
			getSezStatusCurrentStages(caseId);
	}

	/**
	 * Returns the sez status wfh application stages with the primary key.
	 *
	 * @param sezWFHAppStagesId the primary key of the sez status wfh application stages
	 * @return the sez status wfh application stages
	 * @throws PortalException if a sez status wfh application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusWFHApplicationStages getSezStatusWFHApplicationStages(
				long sezWFHAppStagesId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezStatusWFHApplicationStagesLocalService.
			getSezStatusWFHApplicationStages(sezWFHAppStagesId);
	}

	/**
	 * Returns a range of all the sez status wfh application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.stage.services.model.impl.SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @return the range of sez status wfh application stageses
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.stage.services.model.
			SezStatusWFHApplicationStages> getSezStatusWFHApplicationStageses(
				int start, int end) {

		return _sezStatusWFHApplicationStagesLocalService.
			getSezStatusWFHApplicationStageses(start, end);
	}

	/**
	 * Returns the number of sez status wfh application stageses.
	 *
	 * @return the number of sez status wfh application stageses
	 */
	@Override
	public int getSezStatusWFHApplicationStagesesCount() {
		return _sezStatusWFHApplicationStagesLocalService.
			getSezStatusWFHApplicationStagesesCount();
	}

	/**
	 * Updates the sez status wfh application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusWFHApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusWFHApplicationStages the sez status wfh application stages
	 * @return the sez status wfh application stages that was updated
	 */
	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusWFHApplicationStages updateSezStatusWFHApplicationStages(
			com.nbp.sez.status.application.stage.services.model.
				SezStatusWFHApplicationStages sezStatusWFHApplicationStages) {

		return _sezStatusWFHApplicationStagesLocalService.
			updateSezStatusWFHApplicationStages(sezStatusWFHApplicationStages);
	}

	@Override
	public com.nbp.sez.status.application.stage.services.model.
		SezStatusWFHApplicationStages updateSezStatusWFHApplicationStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return _sezStatusWFHApplicationStagesLocalService.
			updateSezStatusWFHApplicationStages(
				caseId, stageName, stageStartDate, stageEndDate, duration,
				stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezStatusWFHApplicationStagesLocalService.getBasePersistence();
	}

	@Override
	public SezStatusWFHApplicationStagesLocalService getWrappedService() {
		return _sezStatusWFHApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		SezStatusWFHApplicationStagesLocalService
			sezStatusWFHApplicationStagesLocalService) {

		_sezStatusWFHApplicationStagesLocalService =
			sezStatusWFHApplicationStagesLocalService;
	}

	private SezStatusWFHApplicationStagesLocalService
		_sezStatusWFHApplicationStagesLocalService;

}