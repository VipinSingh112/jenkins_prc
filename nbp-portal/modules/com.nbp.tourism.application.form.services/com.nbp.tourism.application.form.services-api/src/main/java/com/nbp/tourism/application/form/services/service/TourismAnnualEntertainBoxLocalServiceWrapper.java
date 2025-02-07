/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismAnnualEntertainBoxLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismAnnualEntertainBoxLocalService
 * @generated
 */
public class TourismAnnualEntertainBoxLocalServiceWrapper
	implements ServiceWrapper<TourismAnnualEntertainBoxLocalService>,
			   TourismAnnualEntertainBoxLocalService {

	public TourismAnnualEntertainBoxLocalServiceWrapper() {
		this(null);
	}

	public TourismAnnualEntertainBoxLocalServiceWrapper(
		TourismAnnualEntertainBoxLocalService
			tourismAnnualEntertainBoxLocalService) {

		_tourismAnnualEntertainBoxLocalService =
			tourismAnnualEntertainBoxLocalService;
	}

	/**
	 * Adds the tourism annual entertain box to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismAnnualEntertainBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismAnnualEntertainBox the tourism annual entertain box
	 * @return the tourism annual entertain box that was added
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismAnnualEntertainBox addTourismAnnualEntertainBox(
				com.nbp.tourism.application.form.services.model.
					TourismAnnualEntertainBox tourismAnnualEntertainBox) {

		return _tourismAnnualEntertainBoxLocalService.
			addTourismAnnualEntertainBox(tourismAnnualEntertainBox);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismAnnualEntertainBoxLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism annual entertain box with the primary key. Does not add the tourism annual entertain box to the database.
	 *
	 * @param tourismAnnualEntertainBoxId the primary key for the new tourism annual entertain box
	 * @return the new tourism annual entertain box
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismAnnualEntertainBox createTourismAnnualEntertainBox(
				long tourismAnnualEntertainBoxId) {

		return _tourismAnnualEntertainBoxLocalService.
			createTourismAnnualEntertainBox(tourismAnnualEntertainBoxId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismAnnualEntertainBoxLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public void deleteTA_BY_ID(long applicationId) {
		_tourismAnnualEntertainBoxLocalService.deleteTA_BY_ID(applicationId);
	}

	/**
	 * Deletes the tourism annual entertain box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismAnnualEntertainBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismAnnualEntertainBoxId the primary key of the tourism annual entertain box
	 * @return the tourism annual entertain box that was removed
	 * @throws PortalException if a tourism annual entertain box with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismAnnualEntertainBox deleteTourismAnnualEntertainBox(
					long tourismAnnualEntertainBoxId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismAnnualEntertainBoxLocalService.
			deleteTourismAnnualEntertainBox(tourismAnnualEntertainBoxId);
	}

	/**
	 * Deletes the tourism annual entertain box from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismAnnualEntertainBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismAnnualEntertainBox the tourism annual entertain box
	 * @return the tourism annual entertain box that was removed
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismAnnualEntertainBox deleteTourismAnnualEntertainBox(
				com.nbp.tourism.application.form.services.model.
					TourismAnnualEntertainBox tourismAnnualEntertainBox) {

		return _tourismAnnualEntertainBoxLocalService.
			deleteTourismAnnualEntertainBox(tourismAnnualEntertainBox);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismAnnualEntertainBoxLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismAnnualEntertainBoxLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismAnnualEntertainBoxLocalService.dynamicQuery();
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

		return _tourismAnnualEntertainBoxLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismAnnualEntertainBoxModelImpl</code>.
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

		return _tourismAnnualEntertainBoxLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismAnnualEntertainBoxModelImpl</code>.
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

		return _tourismAnnualEntertainBoxLocalService.dynamicQuery(
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

		return _tourismAnnualEntertainBoxLocalService.dynamicQueryCount(
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

		return _tourismAnnualEntertainBoxLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismAnnualEntertainBox fetchTourismAnnualEntertainBox(
				long tourismAnnualEntertainBoxId) {

		return _tourismAnnualEntertainBoxLocalService.
			fetchTourismAnnualEntertainBox(tourismAnnualEntertainBoxId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismAnnualEntertainBoxLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismAnnualEntertainBoxLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismAnnualEntertainBoxLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismAnnualEntertainBoxLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismAnnualEntertainBox> getTAP_TAI(long tourismApplicationId) {

		return _tourismAnnualEntertainBoxLocalService.getTAP_TAI(
			tourismApplicationId);
	}

	/**
	 * Returns the tourism annual entertain box with the primary key.
	 *
	 * @param tourismAnnualEntertainBoxId the primary key of the tourism annual entertain box
	 * @return the tourism annual entertain box
	 * @throws PortalException if a tourism annual entertain box with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismAnnualEntertainBox getTourismAnnualEntertainBox(
					long tourismAnnualEntertainBoxId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismAnnualEntertainBoxLocalService.
			getTourismAnnualEntertainBox(tourismAnnualEntertainBoxId);
	}

	/**
	 * Returns a range of all the tourism annual entertain boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismAnnualEntertainBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism annual entertain boxes
	 * @param end the upper bound of the range of tourism annual entertain boxes (not inclusive)
	 * @return the range of tourism annual entertain boxes
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismAnnualEntertainBox> getTourismAnnualEntertainBoxes(
				int start, int end) {

		return _tourismAnnualEntertainBoxLocalService.
			getTourismAnnualEntertainBoxes(start, end);
	}

	/**
	 * Returns the number of tourism annual entertain boxes.
	 *
	 * @return the number of tourism annual entertain boxes
	 */
	@Override
	public int getTourismAnnualEntertainBoxesCount() {
		return _tourismAnnualEntertainBoxLocalService.
			getTourismAnnualEntertainBoxesCount();
	}

	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismAnnualEntertainBox> getTourismEntertainmentBoxById(
				long applicationId) {

		return _tourismAnnualEntertainBoxLocalService.
			getTourismEntertainmentBoxById(applicationId);
	}

	/**
	 * Updates the tourism annual entertain box in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismAnnualEntertainBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismAnnualEntertainBox the tourism annual entertain box
	 * @return the tourism annual entertain box that was updated
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismAnnualEntertainBox updateTourismAnnualEntertainBox(
				com.nbp.tourism.application.form.services.model.
					TourismAnnualEntertainBox tourismAnnualEntertainBox) {

		return _tourismAnnualEntertainBoxLocalService.
			updateTourismAnnualEntertainBox(tourismAnnualEntertainBox);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismAnnualEntertainBoxLocalService.getBasePersistence();
	}

	@Override
	public TourismAnnualEntertainBoxLocalService getWrappedService() {
		return _tourismAnnualEntertainBoxLocalService;
	}

	@Override
	public void setWrappedService(
		TourismAnnualEntertainBoxLocalService
			tourismAnnualEntertainBoxLocalService) {

		_tourismAnnualEntertainBoxLocalService =
			tourismAnnualEntertainBoxLocalService;
	}

	private TourismAnnualEntertainBoxLocalService
		_tourismAnnualEntertainBoxLocalService;

}