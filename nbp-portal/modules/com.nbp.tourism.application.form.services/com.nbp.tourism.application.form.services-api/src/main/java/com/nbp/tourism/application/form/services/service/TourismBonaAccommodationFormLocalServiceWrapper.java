/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaAccommodationFormLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccommodationFormLocalService
 * @generated
 */
public class TourismBonaAccommodationFormLocalServiceWrapper
	implements ServiceWrapper<TourismBonaAccommodationFormLocalService>,
			   TourismBonaAccommodationFormLocalService {

	public TourismBonaAccommodationFormLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaAccommodationFormLocalServiceWrapper(
		TourismBonaAccommodationFormLocalService
			tourismBonaAccommodationFormLocalService) {

		_tourismBonaAccommodationFormLocalService =
			tourismBonaAccommodationFormLocalService;
	}

	/**
	 * Adds the tourism bona accommodation form to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAccommodationFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAccommodationForm the tourism bona accommodation form
	 * @return the tourism bona accommodation form that was added
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaAccommodationForm addTourismBonaAccommodationForm(
				com.nbp.tourism.application.form.services.model.
					TourismBonaAccommodationForm tourismBonaAccommodationForm) {

		return _tourismBonaAccommodationFormLocalService.
			addTourismBonaAccommodationForm(tourismBonaAccommodationForm);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccommodationFormLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona accommodation form with the primary key. Does not add the tourism bona accommodation form to the database.
	 *
	 * @param tourismBonaAFId the primary key for the new tourism bona accommodation form
	 * @return the new tourism bona accommodation form
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaAccommodationForm createTourismBonaAccommodationForm(
				long tourismBonaAFId) {

		return _tourismBonaAccommodationFormLocalService.
			createTourismBonaAccommodationForm(tourismBonaAFId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccommodationFormLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism bona accommodation form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAccommodationFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAFId the primary key of the tourism bona accommodation form
	 * @return the tourism bona accommodation form that was removed
	 * @throws PortalException if a tourism bona accommodation form with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaAccommodationForm deleteTourismBonaAccommodationForm(
					long tourismBonaAFId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccommodationFormLocalService.
			deleteTourismBonaAccommodationForm(tourismBonaAFId);
	}

	/**
	 * Deletes the tourism bona accommodation form from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAccommodationFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAccommodationForm the tourism bona accommodation form
	 * @return the tourism bona accommodation form that was removed
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaAccommodationForm deleteTourismBonaAccommodationForm(
				com.nbp.tourism.application.form.services.model.
					TourismBonaAccommodationForm tourismBonaAccommodationForm) {

		return _tourismBonaAccommodationFormLocalService.
			deleteTourismBonaAccommodationForm(tourismBonaAccommodationForm);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaAccommodationFormLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaAccommodationFormLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaAccommodationFormLocalService.dynamicQuery();
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

		return _tourismBonaAccommodationFormLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAccommodationFormModelImpl</code>.
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

		return _tourismBonaAccommodationFormLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAccommodationFormModelImpl</code>.
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

		return _tourismBonaAccommodationFormLocalService.dynamicQuery(
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

		return _tourismBonaAccommodationFormLocalService.dynamicQueryCount(
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

		return _tourismBonaAccommodationFormLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaAccommodationForm fetchTourismBonaAccommodationForm(
				long tourismBonaAFId) {

		return _tourismBonaAccommodationFormLocalService.
			fetchTourismBonaAccommodationForm(tourismBonaAFId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaAccommodationFormLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaAccommodationFormLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaAccommodationFormLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccommodationFormLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the tourism bona accommodation form with the primary key.
	 *
	 * @param tourismBonaAFId the primary key of the tourism bona accommodation form
	 * @return the tourism bona accommodation form
	 * @throws PortalException if a tourism bona accommodation form with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaAccommodationForm getTourismBonaAccommodationForm(
					long tourismBonaAFId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccommodationFormLocalService.
			getTourismBonaAccommodationForm(tourismBonaAFId);
	}

	/**
	 * Returns a range of all the tourism bona accommodation forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAccommodationFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona accommodation forms
	 * @param end the upper bound of the range of tourism bona accommodation forms (not inclusive)
	 * @return the range of tourism bona accommodation forms
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaAccommodationForm> getTourismBonaAccommodationForms(
				int start, int end) {

		return _tourismBonaAccommodationFormLocalService.
			getTourismBonaAccommodationForms(start, end);
	}

	/**
	 * Returns the number of tourism bona accommodation forms.
	 *
	 * @return the number of tourism bona accommodation forms
	 */
	@Override
	public int getTourismBonaAccommodationFormsCount() {
		return _tourismBonaAccommodationFormLocalService.
			getTourismBonaAccommodationFormsCount();
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaAccommodationForm getTourismById(
				long tourismApplicationId) {

		return _tourismBonaAccommodationFormLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Updates the tourism bona accommodation form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAccommodationFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAccommodationForm the tourism bona accommodation form
	 * @return the tourism bona accommodation form that was updated
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaAccommodationForm updateTourismBonaAccommodationForm(
				com.nbp.tourism.application.form.services.model.
					TourismBonaAccommodationForm tourismBonaAccommodationForm) {

		return _tourismBonaAccommodationFormLocalService.
			updateTourismBonaAccommodationForm(tourismBonaAccommodationForm);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaAccommodationFormLocalService.getBasePersistence();
	}

	@Override
	public TourismBonaAccommodationFormLocalService getWrappedService() {
		return _tourismBonaAccommodationFormLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaAccommodationFormLocalService
			tourismBonaAccommodationFormLocalService) {

		_tourismBonaAccommodationFormLocalService =
			tourismBonaAccommodationFormLocalService;
	}

	private TourismBonaAccommodationFormLocalService
		_tourismBonaAccommodationFormLocalService;

}