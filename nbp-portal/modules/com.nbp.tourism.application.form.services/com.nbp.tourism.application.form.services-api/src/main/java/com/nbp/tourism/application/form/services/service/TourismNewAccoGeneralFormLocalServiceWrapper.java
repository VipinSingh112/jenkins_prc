/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismNewAccoGeneralFormLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoGeneralFormLocalService
 * @generated
 */
public class TourismNewAccoGeneralFormLocalServiceWrapper
	implements ServiceWrapper<TourismNewAccoGeneralFormLocalService>,
			   TourismNewAccoGeneralFormLocalService {

	public TourismNewAccoGeneralFormLocalServiceWrapper() {
		this(null);
	}

	public TourismNewAccoGeneralFormLocalServiceWrapper(
		TourismNewAccoGeneralFormLocalService
			tourismNewAccoGeneralFormLocalService) {

		_tourismNewAccoGeneralFormLocalService =
			tourismNewAccoGeneralFormLocalService;
	}

	/**
	 * Adds the tourism new acco general form to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAccoGeneralFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAccoGeneralForm the tourism new acco general form
	 * @return the tourism new acco general form that was added
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAccoGeneralForm addTourismNewAccoGeneralForm(
				com.nbp.tourism.application.form.services.model.
					TourismNewAccoGeneralForm tourismNewAccoGeneralForm) {

		return _tourismNewAccoGeneralFormLocalService.
			addTourismNewAccoGeneralForm(tourismNewAccoGeneralForm);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccoGeneralFormLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism new acco general form with the primary key. Does not add the tourism new acco general form to the database.
	 *
	 * @param tourismNewAccoGenFormId the primary key for the new tourism new acco general form
	 * @return the new tourism new acco general form
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAccoGeneralForm createTourismNewAccoGeneralForm(
				long tourismNewAccoGenFormId) {

		return _tourismNewAccoGeneralFormLocalService.
			createTourismNewAccoGeneralForm(tourismNewAccoGenFormId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccoGeneralFormLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism new acco general form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAccoGeneralFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAccoGenFormId the primary key of the tourism new acco general form
	 * @return the tourism new acco general form that was removed
	 * @throws PortalException if a tourism new acco general form with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAccoGeneralForm deleteTourismNewAccoGeneralForm(
					long tourismNewAccoGenFormId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccoGeneralFormLocalService.
			deleteTourismNewAccoGeneralForm(tourismNewAccoGenFormId);
	}

	/**
	 * Deletes the tourism new acco general form from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAccoGeneralFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAccoGeneralForm the tourism new acco general form
	 * @return the tourism new acco general form that was removed
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAccoGeneralForm deleteTourismNewAccoGeneralForm(
				com.nbp.tourism.application.form.services.model.
					TourismNewAccoGeneralForm tourismNewAccoGeneralForm) {

		return _tourismNewAccoGeneralFormLocalService.
			deleteTourismNewAccoGeneralForm(tourismNewAccoGeneralForm);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismNewAccoGeneralFormLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismNewAccoGeneralFormLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismNewAccoGeneralFormLocalService.dynamicQuery();
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

		return _tourismNewAccoGeneralFormLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAccoGeneralFormModelImpl</code>.
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

		return _tourismNewAccoGeneralFormLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAccoGeneralFormModelImpl</code>.
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

		return _tourismNewAccoGeneralFormLocalService.dynamicQuery(
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

		return _tourismNewAccoGeneralFormLocalService.dynamicQueryCount(
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

		return _tourismNewAccoGeneralFormLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAccoGeneralForm fetchTourismNewAccoGeneralForm(
				long tourismNewAccoGenFormId) {

		return _tourismNewAccoGeneralFormLocalService.
			fetchTourismNewAccoGeneralForm(tourismNewAccoGenFormId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismNewAccoGeneralFormLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismNewAccoGeneralFormLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewAccoGeneralFormLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccoGeneralFormLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAccoGeneralForm getTourismById(long tourismApplicationId)
				throws com.nbp.tourism.application.form.services.exception.
					NoSuchTourismNewAccoGeneralFormException {

		return _tourismNewAccoGeneralFormLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Returns the tourism new acco general form with the primary key.
	 *
	 * @param tourismNewAccoGenFormId the primary key of the tourism new acco general form
	 * @return the tourism new acco general form
	 * @throws PortalException if a tourism new acco general form with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAccoGeneralForm getTourismNewAccoGeneralForm(
					long tourismNewAccoGenFormId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccoGeneralFormLocalService.
			getTourismNewAccoGeneralForm(tourismNewAccoGenFormId);
	}

	/**
	 * Returns a range of all the tourism new acco general forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAccoGeneralFormModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco general forms
	 * @param end the upper bound of the range of tourism new acco general forms (not inclusive)
	 * @return the range of tourism new acco general forms
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismNewAccoGeneralForm> getTourismNewAccoGeneralForms(
				int start, int end) {

		return _tourismNewAccoGeneralFormLocalService.
			getTourismNewAccoGeneralForms(start, end);
	}

	/**
	 * Returns the number of tourism new acco general forms.
	 *
	 * @return the number of tourism new acco general forms
	 */
	@Override
	public int getTourismNewAccoGeneralFormsCount() {
		return _tourismNewAccoGeneralFormLocalService.
			getTourismNewAccoGeneralFormsCount();
	}

	/**
	 * Updates the tourism new acco general form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAccoGeneralFormLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAccoGeneralForm the tourism new acco general form
	 * @return the tourism new acco general form that was updated
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewAccoGeneralForm updateTourismNewAccoGeneralForm(
				com.nbp.tourism.application.form.services.model.
					TourismNewAccoGeneralForm tourismNewAccoGeneralForm) {

		return _tourismNewAccoGeneralFormLocalService.
			updateTourismNewAccoGeneralForm(tourismNewAccoGeneralForm);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismNewAccoGeneralFormLocalService.getBasePersistence();
	}

	@Override
	public TourismNewAccoGeneralFormLocalService getWrappedService() {
		return _tourismNewAccoGeneralFormLocalService;
	}

	@Override
	public void setWrappedService(
		TourismNewAccoGeneralFormLocalService
			tourismNewAccoGeneralFormLocalService) {

		_tourismNewAccoGeneralFormLocalService =
			tourismNewAccoGeneralFormLocalService;
	}

	private TourismNewAccoGeneralFormLocalService
		_tourismNewAccoGeneralFormLocalService;

}