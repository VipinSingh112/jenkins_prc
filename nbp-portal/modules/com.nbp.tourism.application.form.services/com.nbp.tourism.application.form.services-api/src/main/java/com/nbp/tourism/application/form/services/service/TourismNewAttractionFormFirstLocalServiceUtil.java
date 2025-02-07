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

import com.nbp.tourism.application.form.services.model.TourismNewAttractionFormFirst;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for TourismNewAttractionFormFirst. This utility wraps
 * <code>com.nbp.tourism.application.form.services.service.impl.TourismNewAttractionFormFirstLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormFirstLocalService
 * @generated
 */
public class TourismNewAttractionFormFirstLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.tourism.application.form.services.service.impl.TourismNewAttractionFormFirstLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the tourism new attraction form first to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionFormFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionFormFirst the tourism new attraction form first
	 * @return the tourism new attraction form first that was added
	 */
	public static TourismNewAttractionFormFirst
		addTourismNewAttractionFormFirst(
			TourismNewAttractionFormFirst tourismNewAttractionFormFirst) {

		return getService().addTourismNewAttractionFormFirst(
			tourismNewAttractionFormFirst);
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
	 * Creates a new tourism new attraction form first with the primary key. Does not add the tourism new attraction form first to the database.
	 *
	 * @param tourismNewAttractFormFirstId the primary key for the new tourism new attraction form first
	 * @return the new tourism new attraction form first
	 */
	public static TourismNewAttractionFormFirst
		createTourismNewAttractionFormFirst(long tourismNewAttractFormFirstId) {

		return getService().createTourismNewAttractionFormFirst(
			tourismNewAttractFormFirstId);
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
	 * Deletes the tourism new attraction form first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionFormFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractFormFirstId the primary key of the tourism new attraction form first
	 * @return the tourism new attraction form first that was removed
	 * @throws PortalException if a tourism new attraction form first with the primary key could not be found
	 */
	public static TourismNewAttractionFormFirst
			deleteTourismNewAttractionFormFirst(
				long tourismNewAttractFormFirstId)
		throws PortalException {

		return getService().deleteTourismNewAttractionFormFirst(
			tourismNewAttractFormFirstId);
	}

	/**
	 * Deletes the tourism new attraction form first from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionFormFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionFormFirst the tourism new attraction form first
	 * @return the tourism new attraction form first that was removed
	 */
	public static TourismNewAttractionFormFirst
		deleteTourismNewAttractionFormFirst(
			TourismNewAttractionFormFirst tourismNewAttractionFormFirst) {

		return getService().deleteTourismNewAttractionFormFirst(
			tourismNewAttractionFormFirst);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormFirstModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormFirstModelImpl</code>.
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

	public static TourismNewAttractionFormFirst
		fetchTourismNewAttractionFormFirst(long tourismNewAttractFormFirstId) {

		return getService().fetchTourismNewAttractionFormFirst(
			tourismNewAttractFormFirstId);
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

	public static TourismNewAttractionFormFirst getTourimsById(
		long tourismApplicationId) {

		return getService().getTourimsById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new attraction form first with the primary key.
	 *
	 * @param tourismNewAttractFormFirstId the primary key of the tourism new attraction form first
	 * @return the tourism new attraction form first
	 * @throws PortalException if a tourism new attraction form first with the primary key could not be found
	 */
	public static TourismNewAttractionFormFirst
			getTourismNewAttractionFormFirst(long tourismNewAttractFormFirstId)
		throws PortalException {

		return getService().getTourismNewAttractionFormFirst(
			tourismNewAttractFormFirstId);
	}

	/**
	 * Returns a range of all the tourism new attraction form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form firsts
	 * @param end the upper bound of the range of tourism new attraction form firsts (not inclusive)
	 * @return the range of tourism new attraction form firsts
	 */
	public static List<TourismNewAttractionFormFirst>
		getTourismNewAttractionFormFirsts(int start, int end) {

		return getService().getTourismNewAttractionFormFirsts(start, end);
	}

	/**
	 * Returns the number of tourism new attraction form firsts.
	 *
	 * @return the number of tourism new attraction form firsts
	 */
	public static int getTourismNewAttractionFormFirstsCount() {
		return getService().getTourismNewAttractionFormFirstsCount();
	}

	/**
	 * Updates the tourism new attraction form first in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionFormFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionFormFirst the tourism new attraction form first
	 * @return the tourism new attraction form first that was updated
	 */
	public static TourismNewAttractionFormFirst
		updateTourismNewAttractionFormFirst(
			TourismNewAttractionFormFirst tourismNewAttractionFormFirst) {

		return getService().updateTourismNewAttractionFormFirst(
			tourismNewAttractionFormFirst);
	}

	public static TourismNewAttractionFormFirstLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<TourismNewAttractionFormFirstLocalService>
		_serviceSnapshot = new Snapshot<>(
			TourismNewAttractionFormFirstLocalServiceUtil.class,
			TourismNewAttractionFormFirstLocalService.class);

}