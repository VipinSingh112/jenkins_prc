/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link HsraApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationStagesLocalService
 * @generated
 */
public class HsraApplicationStagesLocalServiceWrapper
	implements HsraApplicationStagesLocalService,
			   ServiceWrapper<HsraApplicationStagesLocalService> {

	public HsraApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public HsraApplicationStagesLocalServiceWrapper(
		HsraApplicationStagesLocalService hsraApplicationStagesLocalService) {

		_hsraApplicationStagesLocalService = hsraApplicationStagesLocalService;
	}

	/**
	 * Adds the hsra application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationStages the hsra application stages
	 * @return the hsra application stages that was added
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HsraApplicationStages
		addHsraApplicationStages(
			com.nbp.hsra.stage.services.model.HsraApplicationStages
				hsraApplicationStages) {

		return _hsraApplicationStagesLocalService.addHsraApplicationStages(
			hsraApplicationStages);
	}

	/**
	 * Creates a new hsra application stages with the primary key. Does not add the hsra application stages to the database.
	 *
	 * @param hsraApplicationStagesId the primary key for the new hsra application stages
	 * @return the new hsra application stages
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HsraApplicationStages
		createHsraApplicationStages(long hsraApplicationStagesId) {

		return _hsraApplicationStagesLocalService.createHsraApplicationStages(
			hsraApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the hsra application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationStages the hsra application stages
	 * @return the hsra application stages that was removed
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HsraApplicationStages
		deleteHsraApplicationStages(
			com.nbp.hsra.stage.services.model.HsraApplicationStages
				hsraApplicationStages) {

		return _hsraApplicationStagesLocalService.deleteHsraApplicationStages(
			hsraApplicationStages);
	}

	/**
	 * Deletes the hsra application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationStagesId the primary key of the hsra application stages
	 * @return the hsra application stages that was removed
	 * @throws PortalException if a hsra application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HsraApplicationStages
			deleteHsraApplicationStages(long hsraApplicationStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationStagesLocalService.deleteHsraApplicationStages(
			hsraApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _hsraApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _hsraApplicationStagesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _hsraApplicationStagesLocalService.dynamicQuery();
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

		return _hsraApplicationStagesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HsraApplicationStagesModelImpl</code>.
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

		return _hsraApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HsraApplicationStagesModelImpl</code>.
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

		return _hsraApplicationStagesLocalService.dynamicQuery(
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

		return _hsraApplicationStagesLocalService.dynamicQueryCount(
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

		return _hsraApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.stage.services.model.HsraApplicationStages
		fetchHsraApplicationStages(long hsraApplicationStagesId) {

		return _hsraApplicationStagesLocalService.fetchHsraApplicationStages(
			hsraApplicationStagesId);
	}

	/**
	 * Returns the hsra application stages matching the UUID and group.
	 *
	 * @param uuid the hsra application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HsraApplicationStages
		fetchHsraApplicationStagesByUuidAndGroupId(String uuid, long groupId) {

		return _hsraApplicationStagesLocalService.
			fetchHsraApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _hsraApplicationStagesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _hsraApplicationStagesLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.nbp.hsra.stage.services.model.HsraApplicationStages
			getHsraApp_By_CI(String caseId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return _hsraApplicationStagesLocalService.getHsraApp_By_CI(caseId);
	}

	@Override
	public String getHsraApplicaitonCurrentStages(String caseId) {
		return _hsraApplicationStagesLocalService.
			getHsraApplicaitonCurrentStages(caseId);
	}

	/**
	 * Returns the hsra application stages with the primary key.
	 *
	 * @param hsraApplicationStagesId the primary key of the hsra application stages
	 * @return the hsra application stages
	 * @throws PortalException if a hsra application stages with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HsraApplicationStages
			getHsraApplicationStages(long hsraApplicationStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationStagesLocalService.getHsraApplicationStages(
			hsraApplicationStagesId);
	}

	/**
	 * Returns the hsra application stages matching the UUID and group.
	 *
	 * @param uuid the hsra application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching hsra application stages
	 * @throws PortalException if a matching hsra application stages could not be found
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HsraApplicationStages
			getHsraApplicationStagesByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationStagesLocalService.
			getHsraApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the hsra application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @return the range of hsra application stageses
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.stage.services.model.HsraApplicationStages>
			getHsraApplicationStageses(int start, int end) {

		return _hsraApplicationStagesLocalService.getHsraApplicationStageses(
			start, end);
	}

	/**
	 * Returns all the hsra application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the hsra application stageses
	 * @param companyId the primary key of the company
	 * @return the matching hsra application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.stage.services.model.HsraApplicationStages>
			getHsraApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _hsraApplicationStagesLocalService.
			getHsraApplicationStagesesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of hsra application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the hsra application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching hsra application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.stage.services.model.HsraApplicationStages>
			getHsraApplicationStagesesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.hsra.stage.services.model.HsraApplicationStages>
						orderByComparator) {

		return _hsraApplicationStagesLocalService.
			getHsraApplicationStagesesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of hsra application stageses.
	 *
	 * @return the number of hsra application stageses
	 */
	@Override
	public int getHsraApplicationStagesesCount() {
		return _hsraApplicationStagesLocalService.
			getHsraApplicationStagesesCount();
	}

	@Override
	public java.util.List
		<com.nbp.hsra.stage.services.model.HsraApplicationStages> getHsraByCI(
				String caseId)
			throws com.nbp.hsra.stage.services.exception.
				NoSuchHsraApplicationStagesException {

		return _hsraApplicationStagesLocalService.getHsraByCI(caseId);
	}

	@Override
	public com.nbp.hsra.stage.services.model.HsraApplicationStages
			getHsraByCI_SN(String caseId, String stageName)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return _hsraApplicationStagesLocalService.getHsraByCI_SN(
			caseId, stageName);
	}

	@Override
	public com.nbp.hsra.stage.services.model.HsraApplicationStages
			getHsraByCI_ST(String caseId, String stageStatus)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return _hsraApplicationStagesLocalService.getHsraByCI_ST(
			caseId, stageStatus);
	}

	@Override
	public com.nbp.hsra.stage.services.model.HsraApplicationStages
			getHsraByCI_ST_SN(
				String caseId, String stageStatus, String stageName)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return _hsraApplicationStagesLocalService.getHsraByCI_ST_SN(
			caseId, stageStatus, stageName);
	}

	@Override
	public java.util.List<String> getHsraDistinctStages() {
		return _hsraApplicationStagesLocalService.getHsraDistinctStages();
	}

	@Override
	public Long getHsraSeenCases() {
		return _hsraApplicationStagesLocalService.getHsraSeenCases();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _hsraApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _hsraApplicationStagesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _hsraApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.hsra.stage.services.model.HsraApplicationStages>
			gtHsraApplicationStages_By_SN(String stageName) {

		return _hsraApplicationStagesLocalService.gtHsraApplicationStages_By_SN(
			stageName);
	}

	/**
	 * Updates the hsra application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationStages the hsra application stages
	 * @return the hsra application stages that was updated
	 */
	@Override
	public com.nbp.hsra.stage.services.model.HsraApplicationStages
		updateHsraApplicationStages(
			com.nbp.hsra.stage.services.model.HsraApplicationStages
				hsraApplicationStages) {

		return _hsraApplicationStagesLocalService.updateHsraApplicationStages(
			hsraApplicationStages);
	}

	@Override
	public com.nbp.hsra.stage.services.model.HsraApplicationStages
		updateHsraApplicationStages(
			String caseId, String stageName, java.util.Date stageStartDate,
			java.util.Date stageEndDate, String duration, String stageStatus) {

		return _hsraApplicationStagesLocalService.updateHsraApplicationStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _hsraApplicationStagesLocalService.getBasePersistence();
	}

	@Override
	public HsraApplicationStagesLocalService getWrappedService() {
		return _hsraApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		HsraApplicationStagesLocalService hsraApplicationStagesLocalService) {

		_hsraApplicationStagesLocalService = hsraApplicationStagesLocalService;
	}

	private HsraApplicationStagesLocalService
		_hsraApplicationStagesLocalService;

}