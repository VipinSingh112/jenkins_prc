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

import com.nbp.tourism.application.form.services.model.TourismBonaVehicleAddBox;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for TourismBonaVehicleAddBox. This utility wraps
 * <code>com.nbp.tourism.application.form.services.service.impl.TourismBonaVehicleAddBoxLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaVehicleAddBoxLocalService
 * @generated
 */
public class TourismBonaVehicleAddBoxLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.tourism.application.form.services.service.impl.TourismBonaVehicleAddBoxLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static TourismBonaVehicleAddBox addTourismBonaVehicleAddBox(
		TourismBonaVehicleAddBox tourismBonaVehicleAddBox) {

		return getService().addTourismBonaVehicleAddBox(
			tourismBonaVehicleAddBox);
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
	 * Creates a new tourism bona vehicle add box with the primary key. Does not add the tourism bona vehicle add box to the database.
	 *
	 * @param tourismBonaVehBoxId the primary key for the new tourism bona vehicle add box
	 * @return the new tourism bona vehicle add box
	 */
	public static TourismBonaVehicleAddBox createTourismBonaVehicleAddBox(
		long tourismBonaVehBoxId) {

		return getService().createTourismBonaVehicleAddBox(tourismBonaVehBoxId);
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
	public static TourismBonaVehicleAddBox deleteTourismBonaVehicleAddBox(
			long tourismBonaVehBoxId)
		throws PortalException {

		return getService().deleteTourismBonaVehicleAddBox(tourismBonaVehBoxId);
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
	public static TourismBonaVehicleAddBox deleteTourismBonaVehicleAddBox(
		TourismBonaVehicleAddBox tourismBonaVehicleAddBox) {

		return getService().deleteTourismBonaVehicleAddBox(
			tourismBonaVehicleAddBox);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaVehicleAddBoxModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaVehicleAddBoxModelImpl</code>.
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

	public static TourismBonaVehicleAddBox fetchTourismBonaVehicleAddBox(
		long tourismBonaVehBoxId) {

		return getService().fetchTourismBonaVehicleAddBox(tourismBonaVehBoxId);
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

	public static List<TourismBonaVehicleAddBox> getTourism_by_id(
		long tourismApplicationId) {

		return getService().getTourism_by_id(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona vehicle add box with the primary key.
	 *
	 * @param tourismBonaVehBoxId the primary key of the tourism bona vehicle add box
	 * @return the tourism bona vehicle add box
	 * @throws PortalException if a tourism bona vehicle add box with the primary key could not be found
	 */
	public static TourismBonaVehicleAddBox getTourismBonaVehicleAddBox(
			long tourismBonaVehBoxId)
		throws PortalException {

		return getService().getTourismBonaVehicleAddBox(tourismBonaVehBoxId);
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
	public static List<TourismBonaVehicleAddBox> getTourismBonaVehicleAddBoxes(
		int start, int end) {

		return getService().getTourismBonaVehicleAddBoxes(start, end);
	}

	/**
	 * Returns the number of tourism bona vehicle add boxes.
	 *
	 * @return the number of tourism bona vehicle add boxes
	 */
	public static int getTourismBonaVehicleAddBoxesCount() {
		return getService().getTourismBonaVehicleAddBoxesCount();
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
	public static TourismBonaVehicleAddBox updateTourismBonaVehicleAddBox(
		TourismBonaVehicleAddBox tourismBonaVehicleAddBox) {

		return getService().updateTourismBonaVehicleAddBox(
			tourismBonaVehicleAddBox);
	}

	public static TourismBonaVehicleAddBoxLocalService getService() {
		return _service;
	}

	private static volatile TourismBonaVehicleAddBoxLocalService _service;

}