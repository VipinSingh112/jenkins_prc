/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismBonaVehicleAddBoxLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaVehicleAddBoxLocalService
 * @generated
 */
public class TourismBonaVehicleAddBoxLocalServiceWrapper
	implements ServiceWrapper<TourismBonaVehicleAddBoxLocalService>,
			   TourismBonaVehicleAddBoxLocalService {

	public TourismBonaVehicleAddBoxLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaVehicleAddBoxLocalServiceWrapper(
		TourismBonaVehicleAddBoxLocalService
			tourismBonaVehicleAddBoxLocalService) {

		_tourismBonaVehicleAddBoxLocalService =
			tourismBonaVehicleAddBoxLocalService;
	}

	/**
	 * Adds the tourism bona vehicle add box to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaVehicleAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaVehicleAddBox the tourism bona vehicle add box
	 * @return the tourism bona vehicle add box that was added
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaVehicleAddBox
			addTourismBonaVehicleAddBox(
				com.nbp.tourism.application.form.services.model.
					TourismBonaVehicleAddBox tourismBonaVehicleAddBox) {

		return _tourismBonaVehicleAddBoxLocalService.
			addTourismBonaVehicleAddBox(tourismBonaVehicleAddBox);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaVehicleAddBoxLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona vehicle add box with the primary key. Does not add the tourism bona vehicle add box to the database.
	 *
	 * @param tourismBonaVehBoxId the primary key for the new tourism bona vehicle add box
	 * @return the new tourism bona vehicle add box
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaVehicleAddBox
			createTourismBonaVehicleAddBox(long tourismBonaVehBoxId) {

		return _tourismBonaVehicleAddBoxLocalService.
			createTourismBonaVehicleAddBox(tourismBonaVehBoxId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaVehicleAddBoxLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism bona vehicle add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaVehicleAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaVehBoxId the primary key of the tourism bona vehicle add box
	 * @return the tourism bona vehicle add box that was removed
	 * @throws PortalException if a tourism bona vehicle add box with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaVehicleAddBox
				deleteTourismBonaVehicleAddBox(long tourismBonaVehBoxId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaVehicleAddBoxLocalService.
			deleteTourismBonaVehicleAddBox(tourismBonaVehBoxId);
	}

	/**
	 * Deletes the tourism bona vehicle add box from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaVehicleAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaVehicleAddBox the tourism bona vehicle add box
	 * @return the tourism bona vehicle add box that was removed
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaVehicleAddBox
			deleteTourismBonaVehicleAddBox(
				com.nbp.tourism.application.form.services.model.
					TourismBonaVehicleAddBox tourismBonaVehicleAddBox) {

		return _tourismBonaVehicleAddBoxLocalService.
			deleteTourismBonaVehicleAddBox(tourismBonaVehicleAddBox);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaVehicleAddBoxLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaVehicleAddBoxLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaVehicleAddBoxLocalService.dynamicQuery();
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

		return _tourismBonaVehicleAddBoxLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaVehicleAddBoxModelImpl</code>.
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

		return _tourismBonaVehicleAddBoxLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaVehicleAddBoxModelImpl</code>.
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

		return _tourismBonaVehicleAddBoxLocalService.dynamicQuery(
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

		return _tourismBonaVehicleAddBoxLocalService.dynamicQueryCount(
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

		return _tourismBonaVehicleAddBoxLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaVehicleAddBox
			fetchTourismBonaVehicleAddBox(long tourismBonaVehBoxId) {

		return _tourismBonaVehicleAddBoxLocalService.
			fetchTourismBonaVehicleAddBox(tourismBonaVehBoxId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaVehicleAddBoxLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaVehicleAddBoxLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaVehicleAddBoxLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaVehicleAddBoxLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaVehicleAddBox> getTourism_by_id(
				long tourismApplicationId) {

		return _tourismBonaVehicleAddBoxLocalService.getTourism_by_id(
			tourismApplicationId);
	}

	/**
	 * Returns the tourism bona vehicle add box with the primary key.
	 *
	 * @param tourismBonaVehBoxId the primary key of the tourism bona vehicle add box
	 * @return the tourism bona vehicle add box
	 * @throws PortalException if a tourism bona vehicle add box with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaVehicleAddBox
				getTourismBonaVehicleAddBox(long tourismBonaVehBoxId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaVehicleAddBoxLocalService.
			getTourismBonaVehicleAddBox(tourismBonaVehBoxId);
	}

	/**
	 * Returns a range of all the tourism bona vehicle add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaVehicleAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona vehicle add boxes
	 * @param end the upper bound of the range of tourism bona vehicle add boxes (not inclusive)
	 * @return the range of tourism bona vehicle add boxes
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaVehicleAddBox> getTourismBonaVehicleAddBoxes(
				int start, int end) {

		return _tourismBonaVehicleAddBoxLocalService.
			getTourismBonaVehicleAddBoxes(start, end);
	}

	/**
	 * Returns the number of tourism bona vehicle add boxes.
	 *
	 * @return the number of tourism bona vehicle add boxes
	 */
	@Override
	public int getTourismBonaVehicleAddBoxesCount() {
		return _tourismBonaVehicleAddBoxLocalService.
			getTourismBonaVehicleAddBoxesCount();
	}

	/**
	 * Updates the tourism bona vehicle add box in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaVehicleAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaVehicleAddBox the tourism bona vehicle add box
	 * @return the tourism bona vehicle add box that was updated
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismBonaVehicleAddBox
			updateTourismBonaVehicleAddBox(
				com.nbp.tourism.application.form.services.model.
					TourismBonaVehicleAddBox tourismBonaVehicleAddBox) {

		return _tourismBonaVehicleAddBoxLocalService.
			updateTourismBonaVehicleAddBox(tourismBonaVehicleAddBox);
	}

	@Override
	public TourismBonaVehicleAddBoxLocalService getWrappedService() {
		return _tourismBonaVehicleAddBoxLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaVehicleAddBoxLocalService
			tourismBonaVehicleAddBoxLocalService) {

		_tourismBonaVehicleAddBoxLocalService =
			tourismBonaVehicleAddBoxLocalService;
	}

	private TourismBonaVehicleAddBoxLocalService
		_tourismBonaVehicleAddBoxLocalService;

}