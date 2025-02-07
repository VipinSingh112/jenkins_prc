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

import com.nbp.tourism.application.form.services.model.TourismBonaAttractionFormSecond;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for TourismBonaAttractionFormSecond. This utility wraps
 * <code>com.nbp.tourism.application.form.services.service.impl.TourismBonaAttractionFormSecondLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionFormSecondLocalService
 * @generated
 */
public class TourismBonaAttractionFormSecondLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.tourism.application.form.services.service.impl.TourismBonaAttractionFormSecondLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the tourism bona attraction form second to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionFormSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttractionFormSecond the tourism bona attraction form second
	 * @return the tourism bona attraction form second that was added
	 */
	public static TourismBonaAttractionFormSecond
		addTourismBonaAttractionFormSecond(
			TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond) {

		return getService().addTourismBonaAttractionFormSecond(
			tourismBonaAttractionFormSecond);
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
	 * Creates a new tourism bona attraction form second with the primary key. Does not add the tourism bona attraction form second to the database.
	 *
	 * @param tourismBonaAttractFormSecId the primary key for the new tourism bona attraction form second
	 * @return the new tourism bona attraction form second
	 */
	public static TourismBonaAttractionFormSecond
		createTourismBonaAttractionFormSecond(
			long tourismBonaAttractFormSecId) {

		return getService().createTourismBonaAttractionFormSecond(
			tourismBonaAttractFormSecId);
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
	 * Deletes the tourism bona attraction form second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionFormSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttractFormSecId the primary key of the tourism bona attraction form second
	 * @return the tourism bona attraction form second that was removed
	 * @throws PortalException if a tourism bona attraction form second with the primary key could not be found
	 */
	public static TourismBonaAttractionFormSecond
			deleteTourismBonaAttractionFormSecond(
				long tourismBonaAttractFormSecId)
		throws PortalException {

		return getService().deleteTourismBonaAttractionFormSecond(
			tourismBonaAttractFormSecId);
	}

	/**
	 * Deletes the tourism bona attraction form second from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionFormSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttractionFormSecond the tourism bona attraction form second
	 * @return the tourism bona attraction form second that was removed
	 */
	public static TourismBonaAttractionFormSecond
		deleteTourismBonaAttractionFormSecond(
			TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond) {

		return getService().deleteTourismBonaAttractionFormSecond(
			tourismBonaAttractionFormSecond);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormSecondModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormSecondModelImpl</code>.
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

	public static TourismBonaAttractionFormSecond
		fetchTourismBonaAttractionFormSecond(long tourismBonaAttractFormSecId) {

		return getService().fetchTourismBonaAttractionFormSecond(
			tourismBonaAttractFormSecId);
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

	/**
	 * Returns the tourism bona attraction form second with the primary key.
	 *
	 * @param tourismBonaAttractFormSecId the primary key of the tourism bona attraction form second
	 * @return the tourism bona attraction form second
	 * @throws PortalException if a tourism bona attraction form second with the primary key could not be found
	 */
	public static TourismBonaAttractionFormSecond
			getTourismBonaAttractionFormSecond(long tourismBonaAttractFormSecId)
		throws PortalException {

		return getService().getTourismBonaAttractionFormSecond(
			tourismBonaAttractFormSecId);
	}

	/**
	 * Returns a range of all the tourism bona attraction form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form seconds
	 * @param end the upper bound of the range of tourism bona attraction form seconds (not inclusive)
	 * @return the range of tourism bona attraction form seconds
	 */
	public static List<TourismBonaAttractionFormSecond>
		getTourismBonaAttractionFormSeconds(int start, int end) {

		return getService().getTourismBonaAttractionFormSeconds(start, end);
	}

	/**
	 * Returns the number of tourism bona attraction form seconds.
	 *
	 * @return the number of tourism bona attraction form seconds
	 */
	public static int getTourismBonaAttractionFormSecondsCount() {
		return getService().getTourismBonaAttractionFormSecondsCount();
	}

	public static TourismBonaAttractionFormSecond getTourismById(
		long tourismApplicationId) {

		return getService().getTourismById(tourismApplicationId);
	}

	/**
	 * Updates the tourism bona attraction form second in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionFormSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttractionFormSecond the tourism bona attraction form second
	 * @return the tourism bona attraction form second that was updated
	 */
	public static TourismBonaAttractionFormSecond
		updateTourismBonaAttractionFormSecond(
			TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond) {

		return getService().updateTourismBonaAttractionFormSecond(
			tourismBonaAttractionFormSecond);
	}

	public static TourismBonaAttractionFormSecondLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<TourismBonaAttractionFormSecondLocalService>
		_serviceSnapshot = new Snapshot<>(
			TourismBonaAttractionFormSecondLocalServiceUtil.class,
			TourismBonaAttractionFormSecondLocalService.class);

}