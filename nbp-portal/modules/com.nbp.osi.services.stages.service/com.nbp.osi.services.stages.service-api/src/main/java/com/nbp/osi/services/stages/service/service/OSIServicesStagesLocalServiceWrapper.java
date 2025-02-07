/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OSIServicesStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesStagesLocalService
 * @generated
 */
public class OSIServicesStagesLocalServiceWrapper
	implements OSIServicesStagesLocalService,
			   ServiceWrapper<OSIServicesStagesLocalService> {

	public OSIServicesStagesLocalServiceWrapper() {
		this(null);
	}

	public OSIServicesStagesLocalServiceWrapper(
		OSIServicesStagesLocalService osiServicesStagesLocalService) {

		_osiServicesStagesLocalService = osiServicesStagesLocalService;
	}

	/**
	 * Adds the osi services stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServicesStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesStages the osi services stages
	 * @return the osi services stages that was added
	 */
	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesStages
		addOSIServicesStages(
			com.nbp.osi.services.stages.service.model.OSIServicesStages
				osiServicesStages) {

		return _osiServicesStagesLocalService.addOSIServicesStages(
			osiServicesStages);
	}

	/**
	 * Creates a new osi services stages with the primary key. Does not add the osi services stages to the database.
	 *
	 * @param osiServicesStagesId the primary key for the new osi services stages
	 * @return the new osi services stages
	 */
	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesStages
		createOSIServicesStages(long osiServicesStagesId) {

		return _osiServicesStagesLocalService.createOSIServicesStages(
			osiServicesStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi services stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServicesStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesStagesId the primary key of the osi services stages
	 * @return the osi services stages that was removed
	 * @throws PortalException if a osi services stages with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesStages
			deleteOSIServicesStages(long osiServicesStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesStagesLocalService.deleteOSIServicesStages(
			osiServicesStagesId);
	}

	/**
	 * Deletes the osi services stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServicesStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesStages the osi services stages
	 * @return the osi services stages that was removed
	 */
	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesStages
		deleteOSIServicesStages(
			com.nbp.osi.services.stages.service.model.OSIServicesStages
				osiServicesStages) {

		return _osiServicesStagesLocalService.deleteOSIServicesStages(
			osiServicesStages);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiServicesStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiServicesStagesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiServicesStagesLocalService.dynamicQuery();
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

		return _osiServicesStagesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.stages.service.model.impl.OSIServicesStagesModelImpl</code>.
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

		return _osiServicesStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.stages.service.model.impl.OSIServicesStagesModelImpl</code>.
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

		return _osiServicesStagesLocalService.dynamicQuery(
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

		return _osiServicesStagesLocalService.dynamicQueryCount(dynamicQuery);
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

		return _osiServicesStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesStages
		fetchOSIServicesStages(long osiServicesStagesId) {

		return _osiServicesStagesLocalService.fetchOSIServicesStages(
			osiServicesStagesId);
	}

	/**
	 * Returns the osi services stages matching the UUID and group.
	 *
	 * @param uuid the osi services stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesStages
		fetchOSIServicesStagesByUuidAndGroupId(String uuid, long groupId) {

		return _osiServicesStagesLocalService.
			fetchOSIServicesStagesByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiServicesStagesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _osiServicesStagesLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiServicesStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiServicesStagesLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List
		<com.nbp.osi.services.stages.service.model.OSIServicesStages>
			getOSI_Service_CaseId(String caseId) {

		return _osiServicesStagesLocalService.getOSI_Service_CaseId(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.osi.services.stages.service.model.OSIServicesStages>
			getOSI_Service_StageName(String stageName) {

		return _osiServicesStagesLocalService.getOSI_Service_StageName(
			stageName);
	}

	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesStages
			getOSIService_By_CaseId(String caseId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return _osiServicesStagesLocalService.getOSIService_By_CaseId(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.osi.services.stages.service.model.OSIServicesStages>
			getOSIService_CaseId(String caseId) {

		return _osiServicesStagesLocalService.getOSIService_CaseId(caseId);
	}

	@Override
	public java.util.List<String> getOSIServiceDistinctStages() {
		return _osiServicesStagesLocalService.getOSIServiceDistinctStages();
	}

	@Override
	public String getOSIServicesCurrentStages(String caseId) {
		return _osiServicesStagesLocalService.getOSIServicesCurrentStages(
			caseId);
	}

	@Override
	public Long getOSIServiceSeenCases() {
		return _osiServicesStagesLocalService.getOSIServiceSeenCases();
	}

	/**
	 * Returns the osi services stages with the primary key.
	 *
	 * @param osiServicesStagesId the primary key of the osi services stages
	 * @return the osi services stages
	 * @throws PortalException if a osi services stages with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesStages
			getOSIServicesStages(long osiServicesStagesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesStagesLocalService.getOSIServicesStages(
			osiServicesStagesId);
	}

	/**
	 * Returns the osi services stages matching the UUID and group.
	 *
	 * @param uuid the osi services stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services stages
	 * @throws PortalException if a matching osi services stages could not be found
	 */
	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesStages
			getOSIServicesStagesByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesStagesLocalService.
			getOSIServicesStagesByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.stages.service.model.impl.OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @return the range of osi services stageses
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.stages.service.model.OSIServicesStages>
			getOSIServicesStageses(int start, int end) {

		return _osiServicesStagesLocalService.getOSIServicesStageses(
			start, end);
	}

	/**
	 * Returns all the osi services stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services stageses
	 * @param companyId the primary key of the company
	 * @return the matching osi services stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.stages.service.model.OSIServicesStages>
			getOSIServicesStagesesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _osiServicesStagesLocalService.
			getOSIServicesStagesesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of osi services stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.osi.services.stages.service.model.OSIServicesStages>
			getOSIServicesStagesesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.osi.services.stages.service.model.
						OSIServicesStages> orderByComparator) {

		return _osiServicesStagesLocalService.
			getOSIServicesStagesesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi services stageses.
	 *
	 * @return the number of osi services stageses
	 */
	@Override
	public int getOSIServicesStagesesCount() {
		return _osiServicesStagesLocalService.getOSIServicesStagesesCount();
	}

	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesStages
			getOSIServiceStagesBy_SI_SN(String caseId, String stageName)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return _osiServicesStagesLocalService.getOSIServiceStagesBy_SI_SN(
			caseId, stageName);
	}

	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesStages
			getOSIServiceStagesBy_SI_ST_SN(
				String caseId, String stageStatus, String stageName)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return _osiServicesStagesLocalService.getOSIServiceStagesBy_SI_ST_SN(
			caseId, stageStatus, stageName);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiServicesStagesLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public String getPharmaCurrentStages(String caseId) {
		return _osiServicesStagesLocalService.getPharmaCurrentStages(caseId);
	}

	/**
	 * Updates the osi services stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServicesStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesStages the osi services stages
	 * @return the osi services stages that was updated
	 */
	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesStages
		updateOSIServicesStages(
			com.nbp.osi.services.stages.service.model.OSIServicesStages
				osiServicesStages) {

		return _osiServicesStagesLocalService.updateOSIServicesStages(
			osiServicesStages);
	}

	@Override
	public com.nbp.osi.services.stages.service.model.OSIServicesStages
			updateOSIServicesStages(
				String caseId, String stageName, java.util.Date stageStartDate,
				java.util.Date stageEndDate, String duration,
				String stageStatus)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return _osiServicesStagesLocalService.updateOSIServicesStages(
			caseId, stageName, stageStartDate, stageEndDate, duration,
			stageStatus);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiServicesStagesLocalService.getBasePersistence();
	}

	@Override
	public OSIServicesStagesLocalService getWrappedService() {
		return _osiServicesStagesLocalService;
	}

	@Override
	public void setWrappedService(
		OSIServicesStagesLocalService osiServicesStagesLocalService) {

		_osiServicesStagesLocalService = osiServicesStagesLocalService;
	}

	private OSIServicesStagesLocalService _osiServicesStagesLocalService;

}