/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismNewAttractionFormSecond;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for TourismNewAttractionFormSecond. This utility wraps
 * <code>com.nbp.tourism.application.form.services.service.impl.TourismNewAttractionFormSecondLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormSecondLocalService
 * @generated
 */
public class TourismNewAttractionFormSecondLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.tourism.application.form.services.service.impl.TourismNewAttractionFormSecondLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the tourism new attraction form second to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionFormSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionFormSecond the tourism new attraction form second
	 * @return the tourism new attraction form second that was added
	 */
	public static TourismNewAttractionFormSecond
		addTourismNewAttractionFormSecond(
			TourismNewAttractionFormSecond tourismNewAttractionFormSecond) {

		return getService().addTourismNewAttractionFormSecond(
			tourismNewAttractionFormSecond);
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
	 * Creates a new tourism new attraction form second with the primary key. Does not add the tourism new attraction form second to the database.
	 *
	 * @param tourismNewAttractionFormSecId the primary key for the new tourism new attraction form second
	 * @return the new tourism new attraction form second
	 */
	public static TourismNewAttractionFormSecond
		createTourismNewAttractionFormSecond(
			long tourismNewAttractionFormSecId) {

		return getService().createTourismNewAttractionFormSecond(
			tourismNewAttractionFormSecId);
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
	 * Deletes the tourism new attraction form second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionFormSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionFormSecId the primary key of the tourism new attraction form second
	 * @return the tourism new attraction form second that was removed
	 * @throws PortalException if a tourism new attraction form second with the primary key could not be found
	 */
	public static TourismNewAttractionFormSecond
			deleteTourismNewAttractionFormSecond(
				long tourismNewAttractionFormSecId)
		throws PortalException {

		return getService().deleteTourismNewAttractionFormSecond(
			tourismNewAttractionFormSecId);
	}

	/**
	 * Deletes the tourism new attraction form second from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionFormSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionFormSecond the tourism new attraction form second
	 * @return the tourism new attraction form second that was removed
	 */
	public static TourismNewAttractionFormSecond
		deleteTourismNewAttractionFormSecond(
			TourismNewAttractionFormSecond tourismNewAttractionFormSecond) {

		return getService().deleteTourismNewAttractionFormSecond(
			tourismNewAttractionFormSecond);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormSecondModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormSecondModelImpl</code>.
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

	public static TourismNewAttractionFormSecond
		fetchTourismNewAttractionFormSecond(
			long tourismNewAttractionFormSecId) {

		return getService().fetchTourismNewAttractionFormSecond(
			tourismNewAttractionFormSecId);
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

	public static TourismNewAttractionFormSecond getTourismById(
		long tourismApplicationId) {

		return getService().getTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new attraction form second with the primary key.
	 *
	 * @param tourismNewAttractionFormSecId the primary key of the tourism new attraction form second
	 * @return the tourism new attraction form second
	 * @throws PortalException if a tourism new attraction form second with the primary key could not be found
	 */
	public static TourismNewAttractionFormSecond
			getTourismNewAttractionFormSecond(
				long tourismNewAttractionFormSecId)
		throws PortalException {

		return getService().getTourismNewAttractionFormSecond(
			tourismNewAttractionFormSecId);
	}

	/**
	 * Returns a range of all the tourism new attraction form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form seconds
	 * @param end the upper bound of the range of tourism new attraction form seconds (not inclusive)
	 * @return the range of tourism new attraction form seconds
	 */
	public static List<TourismNewAttractionFormSecond>
		getTourismNewAttractionFormSeconds(int start, int end) {

		return getService().getTourismNewAttractionFormSeconds(start, end);
	}

	/**
	 * Returns the number of tourism new attraction form seconds.
	 *
	 * @return the number of tourism new attraction form seconds
	 */
	public static int getTourismNewAttractionFormSecondsCount() {
		return getService().getTourismNewAttractionFormSecondsCount();
	}

	/**
	 * Updates the tourism new attraction form second in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionFormSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionFormSecond the tourism new attraction form second
	 * @return the tourism new attraction form second that was updated
	 */
	public static TourismNewAttractionFormSecond
		updateTourismNewAttractionFormSecond(
			TourismNewAttractionFormSecond tourismNewAttractionFormSecond) {

		return getService().updateTourismNewAttractionFormSecond(
			tourismNewAttractionFormSecond);
	}

	public static TourismNewAttractionFormSecondLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<TourismNewAttractionFormSecondLocalService>
		_serviceSnapshot = new Snapshot<>(
			TourismNewAttractionFormSecondLocalServiceUtil.class,
			TourismNewAttractionFormSecondLocalService.class);

}