/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismApplicationCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationCurrentStageLocalService
 * @generated
 */
public class TourismApplicationCurrentStageLocalServiceWrapper
	implements ServiceWrapper<TourismApplicationCurrentStageLocalService>,
			   TourismApplicationCurrentStageLocalService {

	public TourismApplicationCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public TourismApplicationCurrentStageLocalServiceWrapper(
		TourismApplicationCurrentStageLocalService
			tourismApplicationCurrentStageLocalService) {

		_tourismApplicationCurrentStageLocalService =
			tourismApplicationCurrentStageLocalService;
	}

	/**
	 * Adds the tourism application current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismApplicationCurrentStage the tourism application current stage
	 * @return the tourism application current stage that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismApplicationCurrentStage addTourismApplicationCurrentStage(
			com.nbp.tourism.application.form.services.model.
				TourismApplicationCurrentStage tourismApplicationCurrentStage) {

		return _tourismApplicationCurrentStageLocalService.
			addTourismApplicationCurrentStage(tourismApplicationCurrentStage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismApplicationCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism application current stage with the primary key. Does not add the tourism application current stage to the database.
	 *
	 * @param tourismAppliCurrentStageId the primary key for the new tourism application current stage
	 * @return the new tourism application current stage
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismApplicationCurrentStage createTourismApplicationCurrentStage(
			long tourismAppliCurrentStageId) {

		return _tourismApplicationCurrentStageLocalService.
			createTourismApplicationCurrentStage(tourismAppliCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismApplicationCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismAppliCurrentStageId the primary key of the tourism application current stage
	 * @return the tourism application current stage that was removed
	 * @throws PortalException if a tourism application current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismApplicationCurrentStage deleteTourismApplicationCurrentStage(
				long tourismAppliCurrentStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismApplicationCurrentStageLocalService.
			deleteTourismApplicationCurrentStage(tourismAppliCurrentStageId);
	}

	/**
	 * Deletes the tourism application current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismApplicationCurrentStage the tourism application current stage
	 * @return the tourism application current stage that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismApplicationCurrentStage deleteTourismApplicationCurrentStage(
			com.nbp.tourism.application.form.services.model.
				TourismApplicationCurrentStage tourismApplicationCurrentStage) {

		return _tourismApplicationCurrentStageLocalService.
			deleteTourismApplicationCurrentStage(
				tourismApplicationCurrentStage);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismApplicationCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismApplicationCurrentStageLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismApplicationCurrentStageLocalService.dynamicQuery();
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

		return _tourismApplicationCurrentStageLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismApplicationCurrentStageModelImpl</code>.
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

		return _tourismApplicationCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismApplicationCurrentStageModelImpl</code>.
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

		return _tourismApplicationCurrentStageLocalService.dynamicQuery(
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

		return _tourismApplicationCurrentStageLocalService.dynamicQueryCount(
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

		return _tourismApplicationCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismApplicationCurrentStage fetchTourismApplicationCurrentStage(
			long tourismAppliCurrentStageId) {

		return _tourismApplicationCurrentStageLocalService.
			fetchTourismApplicationCurrentStage(tourismAppliCurrentStageId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismApplicationCurrentStageLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismApplicationCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismApplicationCurrentStageLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismApplicationCurrentStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismApplicationCurrentStage getTA_stage_TAI(
			long tourismApplicationId) {

		return _tourismApplicationCurrentStageLocalService.getTA_stage_TAI(
			tourismApplicationId);
	}

	/**
	 * Returns the tourism application current stage with the primary key.
	 *
	 * @param tourismAppliCurrentStageId the primary key of the tourism application current stage
	 * @return the tourism application current stage
	 * @throws PortalException if a tourism application current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismApplicationCurrentStage getTourismApplicationCurrentStage(
				long tourismAppliCurrentStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismApplicationCurrentStageLocalService.
			getTourismApplicationCurrentStage(tourismAppliCurrentStageId);
	}

	/**
	 * Returns a range of all the tourism application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application current stages
	 * @param end the upper bound of the range of tourism application current stages (not inclusive)
	 * @return the range of tourism application current stages
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismApplicationCurrentStage> getTourismApplicationCurrentStages(
				int start, int end) {

		return _tourismApplicationCurrentStageLocalService.
			getTourismApplicationCurrentStages(start, end);
	}

	/**
	 * Returns the number of tourism application current stages.
	 *
	 * @return the number of tourism application current stages
	 */
	@Override
	public int getTourismApplicationCurrentStagesCount() {
		return _tourismApplicationCurrentStageLocalService.
			getTourismApplicationCurrentStagesCount();
	}

	/**
	 * Updates the tourism application current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismApplicationCurrentStage the tourism application current stage
	 * @return the tourism application current stage that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismApplicationCurrentStage updateTourismApplicationCurrentStage(
			com.nbp.tourism.application.form.services.model.
				TourismApplicationCurrentStage tourismApplicationCurrentStage) {

		return _tourismApplicationCurrentStageLocalService.
			updateTourismApplicationCurrentStage(
				tourismApplicationCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismApplicationCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public TourismApplicationCurrentStageLocalService getWrappedService() {
		return _tourismApplicationCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		TourismApplicationCurrentStageLocalService
			tourismApplicationCurrentStageLocalService) {

		_tourismApplicationCurrentStageLocalService =
			tourismApplicationCurrentStageLocalService;
	}

	private TourismApplicationCurrentStageLocalService
		_tourismApplicationCurrentStageLocalService;

}