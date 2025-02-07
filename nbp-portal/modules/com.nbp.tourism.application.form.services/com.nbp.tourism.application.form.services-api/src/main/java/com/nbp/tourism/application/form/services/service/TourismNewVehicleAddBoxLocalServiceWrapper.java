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
 * Provides a wrapper for {@link TourismNewVehicleAddBoxLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewVehicleAddBoxLocalService
 * @generated
 */
public class TourismNewVehicleAddBoxLocalServiceWrapper
	implements ServiceWrapper<TourismNewVehicleAddBoxLocalService>,
			   TourismNewVehicleAddBoxLocalService {

	public TourismNewVehicleAddBoxLocalServiceWrapper() {
		this(null);
	}

	public TourismNewVehicleAddBoxLocalServiceWrapper(
		TourismNewVehicleAddBoxLocalService
			tourismNewVehicleAddBoxLocalService) {

		_tourismNewVehicleAddBoxLocalService =
			tourismNewVehicleAddBoxLocalService;
	}

	/**
	 * Adds the tourism new vehicle add box to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewVehicleAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewVehicleAddBox the tourism new vehicle add box
	 * @return the tourism new vehicle add box that was added
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewVehicleAddBox
			addTourismNewVehicleAddBox(
				com.nbp.tourism.application.form.services.model.
					TourismNewVehicleAddBox tourismNewVehicleAddBox) {

		return _tourismNewVehicleAddBoxLocalService.addTourismNewVehicleAddBox(
			tourismNewVehicleAddBox);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewVehicleAddBoxLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism new vehicle add box with the primary key. Does not add the tourism new vehicle add box to the database.
	 *
	 * @param tourismNewVehBoxId the primary key for the new tourism new vehicle add box
	 * @return the new tourism new vehicle add box
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewVehicleAddBox
			createTourismNewVehicleAddBox(long tourismNewVehBoxId) {

		return _tourismNewVehicleAddBoxLocalService.
			createTourismNewVehicleAddBox(tourismNewVehBoxId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewVehicleAddBoxLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism new vehicle add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewVehicleAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewVehBoxId the primary key of the tourism new vehicle add box
	 * @return the tourism new vehicle add box that was removed
	 * @throws PortalException if a tourism new vehicle add box with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewVehicleAddBox
				deleteTourismNewVehicleAddBox(long tourismNewVehBoxId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewVehicleAddBoxLocalService.
			deleteTourismNewVehicleAddBox(tourismNewVehBoxId);
	}

	/**
	 * Deletes the tourism new vehicle add box from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewVehicleAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewVehicleAddBox the tourism new vehicle add box
	 * @return the tourism new vehicle add box that was removed
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewVehicleAddBox
			deleteTourismNewVehicleAddBox(
				com.nbp.tourism.application.form.services.model.
					TourismNewVehicleAddBox tourismNewVehicleAddBox) {

		return _tourismNewVehicleAddBoxLocalService.
			deleteTourismNewVehicleAddBox(tourismNewVehicleAddBox);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismNewVehicleAddBoxLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismNewVehicleAddBoxLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismNewVehicleAddBoxLocalService.dynamicQuery();
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

		return _tourismNewVehicleAddBoxLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewVehicleAddBoxModelImpl</code>.
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

		return _tourismNewVehicleAddBoxLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewVehicleAddBoxModelImpl</code>.
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

		return _tourismNewVehicleAddBoxLocalService.dynamicQuery(
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

		return _tourismNewVehicleAddBoxLocalService.dynamicQueryCount(
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

		return _tourismNewVehicleAddBoxLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewVehicleAddBox
			fetchTourismNewVehicleAddBox(long tourismNewVehBoxId) {

		return _tourismNewVehicleAddBoxLocalService.
			fetchTourismNewVehicleAddBox(tourismNewVehBoxId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismNewVehicleAddBoxLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismNewVehicleAddBoxLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewVehicleAddBoxLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewVehicleAddBoxLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismNewVehicleAddBox> getTourism_By_id(
				long tourismApplicationId) {

		return _tourismNewVehicleAddBoxLocalService.getTourism_By_id(
			tourismApplicationId);
	}

	/**
	 * Returns the tourism new vehicle add box with the primary key.
	 *
	 * @param tourismNewVehBoxId the primary key of the tourism new vehicle add box
	 * @return the tourism new vehicle add box
	 * @throws PortalException if a tourism new vehicle add box with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewVehicleAddBox
				getTourismNewVehicleAddBox(long tourismNewVehBoxId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewVehicleAddBoxLocalService.getTourismNewVehicleAddBox(
			tourismNewVehBoxId);
	}

	/**
	 * Returns a range of all the tourism new vehicle add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewVehicleAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new vehicle add boxes
	 * @param end the upper bound of the range of tourism new vehicle add boxes (not inclusive)
	 * @return the range of tourism new vehicle add boxes
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismNewVehicleAddBox> getTourismNewVehicleAddBoxes(
				int start, int end) {

		return _tourismNewVehicleAddBoxLocalService.
			getTourismNewVehicleAddBoxes(start, end);
	}

	/**
	 * Returns the number of tourism new vehicle add boxes.
	 *
	 * @return the number of tourism new vehicle add boxes
	 */
	@Override
	public int getTourismNewVehicleAddBoxesCount() {
		return _tourismNewVehicleAddBoxLocalService.
			getTourismNewVehicleAddBoxesCount();
	}

	/**
	 * Updates the tourism new vehicle add box in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewVehicleAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewVehicleAddBox the tourism new vehicle add box
	 * @return the tourism new vehicle add box that was updated
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewVehicleAddBox
			updateTourismNewVehicleAddBox(
				com.nbp.tourism.application.form.services.model.
					TourismNewVehicleAddBox tourismNewVehicleAddBox) {

		return _tourismNewVehicleAddBoxLocalService.
			updateTourismNewVehicleAddBox(tourismNewVehicleAddBox);
	}

	@Override
	public TourismNewVehicleAddBoxLocalService getWrappedService() {
		return _tourismNewVehicleAddBoxLocalService;
	}

	@Override
	public void setWrappedService(
		TourismNewVehicleAddBoxLocalService
			tourismNewVehicleAddBoxLocalService) {

		_tourismNewVehicleAddBoxLocalService =
			tourismNewVehicleAddBoxLocalService;
	}

	private TourismNewVehicleAddBoxLocalService
		_tourismNewVehicleAddBoxLocalService;

}