/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaGroundTransportatioCarRentalLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransportatioCarRentalLocalService
 * @generated
 */
public class TourismBonaGroundTransportatioCarRentalLocalServiceWrapper
	implements ServiceWrapper
		<TourismBonaGroundTransportatioCarRentalLocalService>,
			   TourismBonaGroundTransportatioCarRentalLocalService {

	public TourismBonaGroundTransportatioCarRentalLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaGroundTransportatioCarRentalLocalServiceWrapper(
		TourismBonaGroundTransportatioCarRentalLocalService
			tourismBonaGroundTransportatioCarRentalLocalService) {

		_tourismBonaGroundTransportatioCarRentalLocalService =
			tourismBonaGroundTransportatioCarRentalLocalService;
	}

	/**
	 * Adds the tourism bona ground transportatio car rental to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransportatioCarRentalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundTransportatioCarRental the tourism bona ground transportatio car rental
	 * @return the tourism bona ground transportatio car rental that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportatioCarRental
			addTourismBonaGroundTransportatioCarRental(
				com.nbp.tourism.application.form.services.model.
					TourismBonaGroundTransportatioCarRental
						tourismBonaGroundTransportatioCarRental) {

		return _tourismBonaGroundTransportatioCarRentalLocalService.
			addTourismBonaGroundTransportatioCarRental(
				tourismBonaGroundTransportatioCarRental);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransportatioCarRentalLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona ground transportatio car rental with the primary key. Does not add the tourism bona ground transportatio car rental to the database.
	 *
	 * @param tourismBonaGroundTransportCRId the primary key for the new tourism bona ground transportatio car rental
	 * @return the new tourism bona ground transportatio car rental
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportatioCarRental
			createTourismBonaGroundTransportatioCarRental(
				long tourismBonaGroundTransportCRId) {

		return _tourismBonaGroundTransportatioCarRentalLocalService.
			createTourismBonaGroundTransportatioCarRental(
				tourismBonaGroundTransportCRId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransportatioCarRentalLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the tourism bona ground transportatio car rental with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransportatioCarRentalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundTransportCRId the primary key of the tourism bona ground transportatio car rental
	 * @return the tourism bona ground transportatio car rental that was removed
	 * @throws PortalException if a tourism bona ground transportatio car rental with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportatioCarRental
				deleteTourismBonaGroundTransportatioCarRental(
					long tourismBonaGroundTransportCRId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransportatioCarRentalLocalService.
			deleteTourismBonaGroundTransportatioCarRental(
				tourismBonaGroundTransportCRId);
	}

	/**
	 * Deletes the tourism bona ground transportatio car rental from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransportatioCarRentalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundTransportatioCarRental the tourism bona ground transportatio car rental
	 * @return the tourism bona ground transportatio car rental that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportatioCarRental
			deleteTourismBonaGroundTransportatioCarRental(
				com.nbp.tourism.application.form.services.model.
					TourismBonaGroundTransportatioCarRental
						tourismBonaGroundTransportatioCarRental) {

		return _tourismBonaGroundTransportatioCarRentalLocalService.
			deleteTourismBonaGroundTransportatioCarRental(
				tourismBonaGroundTransportatioCarRental);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaGroundTransportatioCarRentalLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaGroundTransportatioCarRentalLocalService.
			dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaGroundTransportatioCarRentalLocalService.
			dynamicQuery();
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

		return _tourismBonaGroundTransportatioCarRentalLocalService.
			dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransportatioCarRentalModelImpl</code>.
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

		return _tourismBonaGroundTransportatioCarRentalLocalService.
			dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransportatioCarRentalModelImpl</code>.
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

		return _tourismBonaGroundTransportatioCarRentalLocalService.
			dynamicQuery(dynamicQuery, start, end, orderByComparator);
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

		return _tourismBonaGroundTransportatioCarRentalLocalService.
			dynamicQueryCount(dynamicQuery);
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

		return _tourismBonaGroundTransportatioCarRentalLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportatioCarRental
			fetchTourismBonaGroundTransportatioCarRental(
				long tourismBonaGroundTransportCRId) {

		return _tourismBonaGroundTransportatioCarRentalLocalService.
			fetchTourismBonaGroundTransportatioCarRental(
				tourismBonaGroundTransportCRId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaGroundTransportatioCarRentalLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaGroundTransportatioCarRentalLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaGroundTransportatioCarRentalLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransportatioCarRentalLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the tourism bona ground transportatio car rental with the primary key.
	 *
	 * @param tourismBonaGroundTransportCRId the primary key of the tourism bona ground transportatio car rental
	 * @return the tourism bona ground transportatio car rental
	 * @throws PortalException if a tourism bona ground transportatio car rental with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportatioCarRental
				getTourismBonaGroundTransportatioCarRental(
					long tourismBonaGroundTransportCRId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransportatioCarRentalLocalService.
			getTourismBonaGroundTransportatioCarRental(
				tourismBonaGroundTransportCRId);
	}

	/**
	 * Returns a range of all the tourism bona ground transportatio car rentals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransportatioCarRentalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportatio car rentals
	 * @param end the upper bound of the range of tourism bona ground transportatio car rentals (not inclusive)
	 * @return the range of tourism bona ground transportatio car rentals
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaGroundTransportatioCarRental>
				getTourismBonaGroundTransportatioCarRentals(
					int start, int end) {

		return _tourismBonaGroundTransportatioCarRentalLocalService.
			getTourismBonaGroundTransportatioCarRentals(start, end);
	}

	/**
	 * Returns the number of tourism bona ground transportatio car rentals.
	 *
	 * @return the number of tourism bona ground transportatio car rentals
	 */
	@Override
	public int getTourismBonaGroundTransportatioCarRentalsCount() {
		return _tourismBonaGroundTransportatioCarRentalLocalService.
			getTourismBonaGroundTransportatioCarRentalsCount();
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportatioCarRental getTourismById(
			long tourismApplicationId) {

		return _tourismBonaGroundTransportatioCarRentalLocalService.
			getTourismById(tourismApplicationId);
	}

	/**
	 * Updates the tourism bona ground transportatio car rental in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransportatioCarRentalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundTransportatioCarRental the tourism bona ground transportatio car rental
	 * @return the tourism bona ground transportatio car rental that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportatioCarRental
			updateTourismBonaGroundTransportatioCarRental(
				com.nbp.tourism.application.form.services.model.
					TourismBonaGroundTransportatioCarRental
						tourismBonaGroundTransportatioCarRental) {

		return _tourismBonaGroundTransportatioCarRentalLocalService.
			updateTourismBonaGroundTransportatioCarRental(
				tourismBonaGroundTransportatioCarRental);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaGroundTransportatioCarRentalLocalService.
			getBasePersistence();
	}

	@Override
	public TourismBonaGroundTransportatioCarRentalLocalService
		getWrappedService() {

		return _tourismBonaGroundTransportatioCarRentalLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaGroundTransportatioCarRentalLocalService
			tourismBonaGroundTransportatioCarRentalLocalService) {

		_tourismBonaGroundTransportatioCarRentalLocalService =
			tourismBonaGroundTransportatioCarRentalLocalService;
	}

	private TourismBonaGroundTransportatioCarRentalLocalService
		_tourismBonaGroundTransportatioCarRentalLocalService;

}