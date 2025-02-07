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

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismNewVehicleAddBox;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for TourismNewVehicleAddBox. This utility wraps
 * <code>com.nbp.tourism.application.form.services.service.impl.TourismNewVehicleAddBoxLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewVehicleAddBoxLocalService
 * @generated
 */
public class TourismNewVehicleAddBoxLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.tourism.application.form.services.service.impl.TourismNewVehicleAddBoxLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static TourismNewVehicleAddBox addTourismNewVehicleAddBox(
		TourismNewVehicleAddBox tourismNewVehicleAddBox) {

		return getService().addTourismNewVehicleAddBox(tourismNewVehicleAddBox);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tourism new vehicle add box with the primary key. Does not add the tourism new vehicle add box to the database.
	 *
	 * @param tourismNewVehBoxId the primary key for the new tourism new vehicle add box
	 * @return the new tourism new vehicle add box
	 */
	public static TourismNewVehicleAddBox createTourismNewVehicleAddBox(
		long tourismNewVehBoxId) {

		return getService().createTourismNewVehicleAddBox(tourismNewVehBoxId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	public static TourismNewVehicleAddBox deleteTourismNewVehicleAddBox(
			long tourismNewVehBoxId)
		throws PortalException {

		return getService().deleteTourismNewVehicleAddBox(tourismNewVehBoxId);
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
	public static TourismNewVehicleAddBox deleteTourismNewVehicleAddBox(
		TourismNewVehicleAddBox tourismNewVehicleAddBox) {

		return getService().deleteTourismNewVehicleAddBox(
			tourismNewVehicleAddBox);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static TourismNewVehicleAddBox fetchTourismNewVehicleAddBox(
		long tourismNewVehBoxId) {

		return getService().fetchTourismNewVehicleAddBox(tourismNewVehBoxId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static List<TourismNewVehicleAddBox> getTourism_By_id(
		long tourismApplicationId) {

		return getService().getTourism_By_id(tourismApplicationId);
	}

	/**
	 * Returns the tourism new vehicle add box with the primary key.
	 *
	 * @param tourismNewVehBoxId the primary key of the tourism new vehicle add box
	 * @return the tourism new vehicle add box
	 * @throws PortalException if a tourism new vehicle add box with the primary key could not be found
	 */
	public static TourismNewVehicleAddBox getTourismNewVehicleAddBox(
			long tourismNewVehBoxId)
		throws PortalException {

		return getService().getTourismNewVehicleAddBox(tourismNewVehBoxId);
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
	public static List<TourismNewVehicleAddBox> getTourismNewVehicleAddBoxes(
		int start, int end) {

		return getService().getTourismNewVehicleAddBoxes(start, end);
	}

	/**
	 * Returns the number of tourism new vehicle add boxes.
	 *
	 * @return the number of tourism new vehicle add boxes
	 */
	public static int getTourismNewVehicleAddBoxesCount() {
		return getService().getTourismNewVehicleAddBoxesCount();
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
	public static TourismNewVehicleAddBox updateTourismNewVehicleAddBox(
		TourismNewVehicleAddBox tourismNewVehicleAddBox) {

		return getService().updateTourismNewVehicleAddBox(
			tourismNewVehicleAddBox);
	}

	public static TourismNewVehicleAddBoxLocalService getService() {
		return _service;
	}

	private static volatile TourismNewVehicleAddBoxLocalService _service;

}