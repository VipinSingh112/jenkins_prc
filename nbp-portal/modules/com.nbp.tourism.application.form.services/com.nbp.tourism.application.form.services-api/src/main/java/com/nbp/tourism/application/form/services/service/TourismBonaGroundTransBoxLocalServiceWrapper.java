/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaGroundTransBoxLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransBoxLocalService
 * @generated
 */
public class TourismBonaGroundTransBoxLocalServiceWrapper
	implements ServiceWrapper<TourismBonaGroundTransBoxLocalService>,
			   TourismBonaGroundTransBoxLocalService {

	public TourismBonaGroundTransBoxLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaGroundTransBoxLocalServiceWrapper(
		TourismBonaGroundTransBoxLocalService
			tourismBonaGroundTransBoxLocalService) {

		_tourismBonaGroundTransBoxLocalService =
			tourismBonaGroundTransBoxLocalService;
	}

	/**
	 * Adds the tourism bona ground trans box to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundTransBox the tourism bona ground trans box
	 * @return the tourism bona ground trans box that was added
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundTransBox addTourismBonaGroundTransBox(
				com.nbp.tourism.application.form.services.model.
					TourismBonaGroundTransBox tourismBonaGroundTransBox) {

		return _tourismBonaGroundTransBoxLocalService.
			addTourismBonaGroundTransBox(tourismBonaGroundTransBox);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransBoxLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona ground trans box with the primary key. Does not add the tourism bona ground trans box to the database.
	 *
	 * @param tourismVehicleBoxBonaId the primary key for the new tourism bona ground trans box
	 * @return the new tourism bona ground trans box
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundTransBox createTourismBonaGroundTransBox(
				long tourismVehicleBoxBonaId) {

		return _tourismBonaGroundTransBoxLocalService.
			createTourismBonaGroundTransBox(tourismVehicleBoxBonaId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransBoxLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public void deleteTA_BY_ID(long applicationId) {
		_tourismBonaGroundTransBoxLocalService.deleteTA_BY_ID(applicationId);
	}

	/**
	 * Deletes the tourism bona ground trans box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismVehicleBoxBonaId the primary key of the tourism bona ground trans box
	 * @return the tourism bona ground trans box that was removed
	 * @throws PortalException if a tourism bona ground trans box with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundTransBox deleteTourismBonaGroundTransBox(
					long tourismVehicleBoxBonaId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransBoxLocalService.
			deleteTourismBonaGroundTransBox(tourismVehicleBoxBonaId);
	}

	/**
	 * Deletes the tourism bona ground trans box from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundTransBox the tourism bona ground trans box
	 * @return the tourism bona ground trans box that was removed
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundTransBox deleteTourismBonaGroundTransBox(
				com.nbp.tourism.application.form.services.model.
					TourismBonaGroundTransBox tourismBonaGroundTransBox) {

		return _tourismBonaGroundTransBoxLocalService.
			deleteTourismBonaGroundTransBox(tourismBonaGroundTransBox);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaGroundTransBoxLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaGroundTransBoxLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaGroundTransBoxLocalService.dynamicQuery();
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

		return _tourismBonaGroundTransBoxLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransBoxModelImpl</code>.
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

		return _tourismBonaGroundTransBoxLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransBoxModelImpl</code>.
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

		return _tourismBonaGroundTransBoxLocalService.dynamicQuery(
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

		return _tourismBonaGroundTransBoxLocalService.dynamicQueryCount(
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

		return _tourismBonaGroundTransBoxLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundTransBox fetchTourismBonaGroundTransBox(
				long tourismVehicleBoxBonaId) {

		return _tourismBonaGroundTransBoxLocalService.
			fetchTourismBonaGroundTransBox(tourismVehicleBoxBonaId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaGroundTransBoxLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaGroundTransBoxLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaGroundTransBoxLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransBoxLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the tourism bona ground trans box with the primary key.
	 *
	 * @param tourismVehicleBoxBonaId the primary key of the tourism bona ground trans box
	 * @return the tourism bona ground trans box
	 * @throws PortalException if a tourism bona ground trans box with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundTransBox getTourismBonaGroundTransBox(
					long tourismVehicleBoxBonaId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransBoxLocalService.
			getTourismBonaGroundTransBox(tourismVehicleBoxBonaId);
	}

	/**
	 * Returns a range of all the tourism bona ground trans boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground trans boxes
	 * @param end the upper bound of the range of tourism bona ground trans boxes (not inclusive)
	 * @return the range of tourism bona ground trans boxes
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaGroundTransBox> getTourismBonaGroundTransBoxes(
				int start, int end) {

		return _tourismBonaGroundTransBoxLocalService.
			getTourismBonaGroundTransBoxes(start, end);
	}

	/**
	 * Returns the number of tourism bona ground trans boxes.
	 *
	 * @return the number of tourism bona ground trans boxes
	 */
	@Override
	public int getTourismBonaGroundTransBoxesCount() {
		return _tourismBonaGroundTransBoxLocalService.
			getTourismBonaGroundTransBoxesCount();
	}

	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaGroundTransBox> getTourismByid(long appId) {

		return _tourismBonaGroundTransBoxLocalService.getTourismByid(appId);
	}

	/**
	 * Updates the tourism bona ground trans box in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundTransBox the tourism bona ground trans box
	 * @return the tourism bona ground trans box that was updated
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismBonaGroundTransBox updateTourismBonaGroundTransBox(
				com.nbp.tourism.application.form.services.model.
					TourismBonaGroundTransBox tourismBonaGroundTransBox) {

		return _tourismBonaGroundTransBoxLocalService.
			updateTourismBonaGroundTransBox(tourismBonaGroundTransBox);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaGroundTransBoxLocalService.getBasePersistence();
	}

	@Override
	public TourismBonaGroundTransBoxLocalService getWrappedService() {
		return _tourismBonaGroundTransBoxLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaGroundTransBoxLocalService
			tourismBonaGroundTransBoxLocalService) {

		_tourismBonaGroundTransBoxLocalService =
			tourismBonaGroundTransBoxLocalService;
	}

	private TourismBonaGroundTransBoxLocalService
		_tourismBonaGroundTransBoxLocalService;

}