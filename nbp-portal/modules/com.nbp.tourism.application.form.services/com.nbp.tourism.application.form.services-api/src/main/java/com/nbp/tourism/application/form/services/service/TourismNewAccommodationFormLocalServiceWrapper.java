/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismNewAccommodationFormLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccommodationFormLocalService
 * @generated
 */
public class TourismNewAccommodationFormLocalServiceWrapper
	implements ServiceWrapper<TourismNewAccommodationFormLocalService>,
			   TourismNewAccommodationFormLocalService {

	public TourismNewAccommodationFormLocalServiceWrapper() {
		this(null);
	}

	public TourismNewAccommodationFormLocalServiceWrapper(
		TourismNewAccommodationFormLocalService
			tourismNewAccommodationFormLocalService) {

		_tourismNewAccommodationFormLocalService =
			tourismNewAccommodationFormLocalService;
	}

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
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAccommodationForm addTourismNewAccommodationForm(
				com.nbp.tourism.application.form.services.model.
					TourismNewAccommodationForm tourismNewAccommodationForm) {

		return _tourismNewAccommodationFormLocalService.
			addTourismNewAccommodationForm(tourismNewAccommodationForm);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccommodationFormLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism new accommodation form with the primary key. Does not add the tourism new accommodation form to the database.
	 *
	 * @param tourismNewAccoFormId the primary key for the new tourism new accommodation form
	 * @return the new tourism new accommodation form
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAccommodationForm createTourismNewAccommodationForm(
				long tourismNewAccoFormId) {

		return _tourismNewAccommodationFormLocalService.
			createTourismNewAccommodationForm(tourismNewAccoFormId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccommodationFormLocalService.deletePersistedModel(
			persistedModel);
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
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAccommodationForm deleteTourismNewAccommodationForm(
					long tourismNewAccoFormId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccommodationFormLocalService.
			deleteTourismNewAccommodationForm(tourismNewAccoFormId);
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
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAccommodationForm deleteTourismNewAccommodationForm(
				com.nbp.tourism.application.form.services.model.
					TourismNewAccommodationForm tourismNewAccommodationForm) {

		return _tourismNewAccommodationFormLocalService.
			deleteTourismNewAccommodationForm(tourismNewAccommodationForm);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismNewAccommodationFormLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismNewAccommodationFormLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismNewAccommodationFormLocalService.dynamicQuery();
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

		return _tourismNewAccommodationFormLocalService.dynamicQuery(
			dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _tourismNewAccommodationFormLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _tourismNewAccommodationFormLocalService.dynamicQuery(
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

		return _tourismNewAccommodationFormLocalService.dynamicQueryCount(
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

		return _tourismNewAccommodationFormLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAccommodationForm fetchTourismNewAccommodationForm(
				long tourismNewAccoFormId) {

		return _tourismNewAccommodationFormLocalService.
			fetchTourismNewAccommodationForm(tourismNewAccoFormId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismNewAccommodationFormLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismNewAccommodationFormLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewAccommodationFormLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccommodationFormLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAccommodationForm getTourismById(
				long tourismApplicationId) {

		return _tourismNewAccommodationFormLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Returns the tourism new accommodation form with the primary key.
	 *
	 * @param tourismNewAccoFormId the primary key of the tourism new accommodation form
	 * @return the tourism new accommodation form
	 * @throws PortalException if a tourism new accommodation form with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAccommodationForm getTourismNewAccommodationForm(
					long tourismNewAccoFormId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccommodationFormLocalService.
			getTourismNewAccommodationForm(tourismNewAccoFormId);
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
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismNewAccommodationForm> getTourismNewAccommodationForms(
				int start, int end) {

		return _tourismNewAccommodationFormLocalService.
			getTourismNewAccommodationForms(start, end);
	}

	/**
	 * Returns the number of tourism new accommodation forms.
	 *
	 * @return the number of tourism new accommodation forms
	 */
	@Override
	public int getTourismNewAccommodationFormsCount() {
		return _tourismNewAccommodationFormLocalService.
			getTourismNewAccommodationFormsCount();
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
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAccommodationForm updateTourismNewAccommodationForm(
				com.nbp.tourism.application.form.services.model.
					TourismNewAccommodationForm tourismNewAccommodationForm) {

		return _tourismNewAccommodationFormLocalService.
			updateTourismNewAccommodationForm(tourismNewAccommodationForm);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismNewAccommodationFormLocalService.getBasePersistence();
	}

	@Override
	public TourismNewAccommodationFormLocalService getWrappedService() {
		return _tourismNewAccommodationFormLocalService;
	}

	@Override
	public void setWrappedService(
		TourismNewAccommodationFormLocalService
			tourismNewAccommodationFormLocalService) {

		_tourismNewAccommodationFormLocalService =
			tourismNewAccommodationFormLocalService;
	}

	private TourismNewAccommodationFormLocalService
		_tourismNewAccommodationFormLocalService;

}