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

import com.nbp.tourism.application.form.services.model.TourismNewAccommodationForm;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for TourismNewAccommodationForm. This utility wraps
 * <code>com.nbp.tourism.application.form.services.service.impl.TourismNewAccommodationFormLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccommodationFormLocalService
 * @generated
 */
public class TourismNewAccommodationFormLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.tourism.application.form.services.service.impl.TourismNewAccommodationFormLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the tourism new accommodation form to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAccommodationFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAccommodationForm the tourism new accommodation form
	 * @return the tourism new accommodation form that was added
	 */
	public static TourismNewAccommodationForm addTourismNewAccommodationForm(
		TourismNewAccommodationForm tourismNewAccommodationForm) {

		return getService().addTourismNewAccommodationForm(
			tourismNewAccommodationForm);
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
	 * Creates a new tourism new accommodation form with the primary key. Does not add the tourism new accommodation form to the database.
	 *
	 * @param tourismNewAccoFormId the primary key for the new tourism new accommodation form
	 * @return the new tourism new accommodation form
	 */
	public static TourismNewAccommodationForm createTourismNewAccommodationForm(
		long tourismNewAccoFormId) {

		return getService().createTourismNewAccommodationForm(
			tourismNewAccoFormId);
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
	 * Deletes the tourism new accommodation form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAccommodationFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAccoFormId the primary key of the tourism new accommodation form
	 * @return the tourism new accommodation form that was removed
	 * @throws PortalException if a tourism new accommodation form with the primary key could not be found
	 */
	public static TourismNewAccommodationForm deleteTourismNewAccommodationForm(
			long tourismNewAccoFormId)
		throws PortalException {

		return getService().deleteTourismNewAccommodationForm(
			tourismNewAccoFormId);
	}

	/**
	 * Deletes the tourism new accommodation form from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAccommodationFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAccommodationForm the tourism new accommodation form
	 * @return the tourism new accommodation form that was removed
	 */
	public static TourismNewAccommodationForm deleteTourismNewAccommodationForm(
		TourismNewAccommodationForm tourismNewAccommodationForm) {

		return getService().deleteTourismNewAccommodationForm(
			tourismNewAccommodationForm);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAccommodationFormModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAccommodationFormModelImpl</code>.
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

	public static TourismNewAccommodationForm fetchTourismNewAccommodationForm(
		long tourismNewAccoFormId) {

		return getService().fetchTourismNewAccommodationForm(
			tourismNewAccoFormId);
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

	public static TourismNewAccommodationForm getTourismById(
		long tourismApplicationId) {

		return getService().getTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new accommodation form with the primary key.
	 *
	 * @param tourismNewAccoFormId the primary key of the tourism new accommodation form
	 * @return the tourism new accommodation form
	 * @throws PortalException if a tourism new accommodation form with the primary key could not be found
	 */
	public static TourismNewAccommodationForm getTourismNewAccommodationForm(
			long tourismNewAccoFormId)
		throws PortalException {

		return getService().getTourismNewAccommodationForm(
			tourismNewAccoFormId);
	}

	/**
	 * Returns a range of all the tourism new accommodation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAccommodationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accommodation forms
	 * @param end the upper bound of the range of tourism new accommodation forms (not inclusive)
	 * @return the range of tourism new accommodation forms
	 */
	public static List<TourismNewAccommodationForm>
		getTourismNewAccommodationForms(int start, int end) {

		return getService().getTourismNewAccommodationForms(start, end);
	}

	/**
	 * Returns the number of tourism new accommodation forms.
	 *
	 * @return the number of tourism new accommodation forms
	 */
	public static int getTourismNewAccommodationFormsCount() {
		return getService().getTourismNewAccommodationFormsCount();
	}

	/**
	 * Updates the tourism new accommodation form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAccommodationFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAccommodationForm the tourism new accommodation form
	 * @return the tourism new accommodation form that was updated
	 */
	public static TourismNewAccommodationForm updateTourismNewAccommodationForm(
		TourismNewAccommodationForm tourismNewAccommodationForm) {

		return getService().updateTourismNewAccommodationForm(
			tourismNewAccommodationForm);
	}

	public static TourismNewAccommodationFormLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<TourismNewAccommodationFormLocalService>
		_serviceSnapshot = new Snapshot<>(
			TourismNewAccommodationFormLocalServiceUtil.class,
			TourismNewAccommodationFormLocalService.class);

}