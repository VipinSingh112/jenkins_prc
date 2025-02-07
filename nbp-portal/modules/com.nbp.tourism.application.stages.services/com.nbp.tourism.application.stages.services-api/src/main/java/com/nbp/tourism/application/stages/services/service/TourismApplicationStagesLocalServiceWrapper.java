/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismApplicationStagesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationStagesLocalService
 * @generated
 */
public class TourismApplicationStagesLocalServiceWrapper
	implements ServiceWrapper<TourismApplicationStagesLocalService>,
			   TourismApplicationStagesLocalService {

	public TourismApplicationStagesLocalServiceWrapper() {
		this(null);
	}

	public TourismApplicationStagesLocalServiceWrapper(
		TourismApplicationStagesLocalService
			tourismApplicationStagesLocalService) {

		_tourismApplicationStagesLocalService =
			tourismApplicationStagesLocalService;
	}

	/**
	 * Adds the tourism application stages to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismApplicationStages the tourism application stages
	 * @return the tourism application stages that was added
	 */
	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismApplicationStages addTourismApplicationStages(
				com.nbp.tourism.application.stages.services.model.
					TourismApplicationStages tourismApplicationStages) {

		return _tourismApplicationStagesLocalService.
			addTourismApplicationStages(tourismApplicationStages);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismApplicationStagesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism application stages with the primary key. Does not add the tourism application stages to the database.
	 *
	 * @param tourismApplicationStagesId the primary key for the new tourism application stages
	 * @return the new tourism application stages
	 */
	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismApplicationStages createTourismApplicationStages(
				long tourismApplicationStagesId) {

		return _tourismApplicationStagesLocalService.
			createTourismApplicationStages(tourismApplicationStagesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismApplicationStagesLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismApplicationStagesId the primary key of the tourism application stages
	 * @return the tourism application stages that was removed
	 * @throws PortalException if a tourism application stages with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismApplicationStages deleteTourismApplicationStages(
					long tourismApplicationStagesId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismApplicationStagesLocalService.
			deleteTourismApplicationStages(tourismApplicationStagesId);
	}

	/**
	 * Deletes the tourism application stages from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismApplicationStages the tourism application stages
	 * @return the tourism application stages that was removed
	 */
	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismApplicationStages deleteTourismApplicationStages(
				com.nbp.tourism.application.stages.services.model.
					TourismApplicationStages tourismApplicationStages) {

		return _tourismApplicationStagesLocalService.
			deleteTourismApplicationStages(tourismApplicationStages);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismApplicationStagesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismApplicationStagesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismApplicationStagesLocalService.dynamicQuery();
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

		return _tourismApplicationStagesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.stages.services.model.impl.TourismApplicationStagesModelImpl</code>.
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

		return _tourismApplicationStagesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.stages.services.model.impl.TourismApplicationStagesModelImpl</code>.
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

		return _tourismApplicationStagesLocalService.dynamicQuery(
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

		return _tourismApplicationStagesLocalService.dynamicQueryCount(
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

		return _tourismApplicationStagesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismApplicationStages fetchTourismApplicationStages(
				long tourismApplicationStagesId) {

		return _tourismApplicationStagesLocalService.
			fetchTourismApplicationStages(tourismApplicationStagesId);
	}

	/**
	 * Returns the tourism application stages matching the UUID and group.
	 *
	 * @param uuid the tourism application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismApplicationStages
				fetchTourismApplicationStagesByUuidAndGroupId(
					String uuid, long groupId) {

		return _tourismApplicationStagesLocalService.
			fetchTourismApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismApplicationStagesLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _tourismApplicationStagesLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismApplicationStagesLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismApplicationStagesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismApplicationStagesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.tourism.application.stages.services.model.
			TourismApplicationStages> getTAS_CaseId(String caseId) {

		return _tourismApplicationStagesLocalService.getTAS_CaseId(caseId);
	}

	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismApplicationStages getTAS_CaseIdAndStatus(
					String caseId, String stageStatus)
				throws com.nbp.tourism.application.stages.services.exception.
					NoSuchTourismApplicationStagesException {

		return _tourismApplicationStagesLocalService.getTAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismApplicationStages getTAS_CaseIdStageName(
					String caseId, String stageName)
				throws com.nbp.tourism.application.stages.services.exception.
					NoSuchTourismApplicationStagesException {

		return _tourismApplicationStagesLocalService.getTAS_CaseIdStageName(
			caseId, stageName);
	}

	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismApplicationStages getTAS_CaseIdStageStatus(
					String caseId, String stageName, String stageStatus)
				throws com.nbp.tourism.application.stages.services.exception.
					NoSuchTourismApplicationStagesException {

		return _tourismApplicationStagesLocalService.getTAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismApplicationStages getTAS_TAI(long tourismApplicationId)
				throws com.nbp.tourism.application.stages.services.exception.
					NoSuchTourismApplicationStagesException {

		return _tourismApplicationStagesLocalService.getTAS_TAI(
			tourismApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.tourism.application.stages.services.model.
			TourismApplicationStages> getTourismApplicationsList_By_SN(
				String stageName) {

		return _tourismApplicationStagesLocalService.
			getTourismApplicationsList_By_SN(stageName);
	}

	@Override
	public java.util.List
		<com.nbp.tourism.application.stages.services.model.
			TourismApplicationStages> getTourismApplicationsList_By_SN_SS(
				String stageName, String status) {

		return _tourismApplicationStagesLocalService.
			getTourismApplicationsList_By_SN_SS(stageName, status);
	}

	/**
	 * Returns the tourism application stages with the primary key.
	 *
	 * @param tourismApplicationStagesId the primary key of the tourism application stages
	 * @return the tourism application stages
	 * @throws PortalException if a tourism application stages with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismApplicationStages getTourismApplicationStages(
					long tourismApplicationStagesId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismApplicationStagesLocalService.
			getTourismApplicationStages(tourismApplicationStagesId);
	}

	/**
	 * Returns the tourism application stages matching the UUID and group.
	 *
	 * @param uuid the tourism application stages's UUID
	 * @param groupId the primary key of the group
	 * @return the matching tourism application stages
	 * @throws PortalException if a matching tourism application stages could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismApplicationStages
					getTourismApplicationStagesByUuidAndGroupId(
						String uuid, long groupId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismApplicationStagesLocalService.
			getTourismApplicationStagesByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the tourism application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.stages.services.model.impl.TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @return the range of tourism application stageses
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.stages.services.model.
			TourismApplicationStages> getTourismApplicationStageses(
				int start, int end) {

		return _tourismApplicationStagesLocalService.
			getTourismApplicationStageses(start, end);
	}

	/**
	 * Returns all the tourism application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the tourism application stageses
	 * @param companyId the primary key of the company
	 * @return the matching tourism application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.stages.services.model.
			TourismApplicationStages>
				getTourismApplicationStagesesByUuidAndCompanyId(
					String uuid, long companyId) {

		return _tourismApplicationStagesLocalService.
			getTourismApplicationStagesesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of tourism application stageses matching the UUID and company.
	 *
	 * @param uuid the UUID of the tourism application stageses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching tourism application stageses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.stages.services.model.
			TourismApplicationStages>
				getTourismApplicationStagesesByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.tourism.application.stages.services.model.
							TourismApplicationStages> orderByComparator) {

		return _tourismApplicationStagesLocalService.
			getTourismApplicationStagesesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of tourism application stageses.
	 *
	 * @return the number of tourism application stageses
	 */
	@Override
	public int getTourismApplicationStagesesCount() {
		return _tourismApplicationStagesLocalService.
			getTourismApplicationStagesesCount();
	}

	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismApplicationStages getTourismAppStages_By_SN(String stageName)
				throws com.nbp.tourism.application.stages.services.exception.
					NoSuchTourismApplicationStagesException {

		return _tourismApplicationStagesLocalService.getTourismAppStages_By_SN(
			stageName);
	}

	@Override
	public String getTourismCurrentStages(String caseId)
		throws com.nbp.tourism.application.stages.services.exception.
			NoSuchTourismApplicationStagesException {

		return _tourismApplicationStagesLocalService.getTourismCurrentStages(
			caseId);
	}

	@Override
	public java.util.List<String> gettourismDistinctStages() {
		return _tourismApplicationStagesLocalService.gettourismDistinctStages();
	}

	@Override
	public Long getTourismSeenCases() {
		return _tourismApplicationStagesLocalService.getTourismSeenCases();
	}

	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismApplicationStages updateTourismApplicationStages(
				String caseId, String stageName, java.util.Date stageStartDate,
				java.util.Date stageEndDate, String duration,
				String stageStatus) {

		return _tourismApplicationStagesLocalService.
			updateTourismApplicationStages(
				caseId, stageName, stageStartDate, stageEndDate, duration,
				stageStatus);
	}

	/**
	 * Updates the tourism application stages in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationStagesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismApplicationStages the tourism application stages
	 * @return the tourism application stages that was updated
	 */
	@Override
	public
		com.nbp.tourism.application.stages.services.model.
			TourismApplicationStages updateTourismApplicationStages(
				com.nbp.tourism.application.stages.services.model.
					TourismApplicationStages tourismApplicationStages) {

		return _tourismApplicationStagesLocalService.
			updateTourismApplicationStages(tourismApplicationStages);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismApplicationStagesLocalService.getBasePersistence();
	}

	@Override
	public TourismApplicationStagesLocalService getWrappedService() {
		return _tourismApplicationStagesLocalService;
	}

	@Override
	public void setWrappedService(
		TourismApplicationStagesLocalService
			tourismApplicationStagesLocalService) {

		_tourismApplicationStagesLocalService =
			tourismApplicationStagesLocalService;
	}

	private TourismApplicationStagesLocalService
		_tourismApplicationStagesLocalService;

}