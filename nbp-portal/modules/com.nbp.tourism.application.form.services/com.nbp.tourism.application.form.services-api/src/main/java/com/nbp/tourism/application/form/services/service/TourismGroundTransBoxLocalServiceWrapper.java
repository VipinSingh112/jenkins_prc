/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismGroundTransBoxLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismGroundTransBoxLocalService
 * @generated
 */
public class TourismGroundTransBoxLocalServiceWrapper
	implements ServiceWrapper<TourismGroundTransBoxLocalService>,
			   TourismGroundTransBoxLocalService {

	public TourismGroundTransBoxLocalServiceWrapper() {
		this(null);
	}

	public TourismGroundTransBoxLocalServiceWrapper(
		TourismGroundTransBoxLocalService tourismGroundTransBoxLocalService) {

		_tourismGroundTransBoxLocalService = tourismGroundTransBoxLocalService;
	}

	/**
	 * Adds the tourism ground trans box to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismGroundTransBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismGroundTransBox the tourism ground trans box
	 * @return the tourism ground trans box that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.TourismGroundTransBox
		addTourismGroundTransBox(
			com.nbp.tourism.application.form.services.model.
				TourismGroundTransBox tourismGroundTransBox) {

		return _tourismGroundTransBoxLocalService.addTourismGroundTransBox(
			tourismGroundTransBox);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismGroundTransBoxLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism ground trans box with the primary key. Does not add the tourism ground trans box to the database.
	 *
	 * @param tourismVehicleBoxId the primary key for the new tourism ground trans box
	 * @return the new tourism ground trans box
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.TourismGroundTransBox
		createTourismGroundTransBox(long tourismVehicleBoxId) {

		return _tourismGroundTransBoxLocalService.createTourismGroundTransBox(
			tourismVehicleBoxId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismGroundTransBoxLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public void deleteTA_BY_ID(long applicationId) {
		_tourismGroundTransBoxLocalService.deleteTA_BY_ID(applicationId);
	}

	/**
	 * Deletes the tourism ground trans box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismGroundTransBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismVehicleBoxId the primary key of the tourism ground trans box
	 * @return the tourism ground trans box that was removed
	 * @throws PortalException if a tourism ground trans box with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.TourismGroundTransBox
			deleteTourismGroundTransBox(long tourismVehicleBoxId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismGroundTransBoxLocalService.deleteTourismGroundTransBox(
			tourismVehicleBoxId);
	}

	/**
	 * Deletes the tourism ground trans box from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismGroundTransBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismGroundTransBox the tourism ground trans box
	 * @return the tourism ground trans box that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.TourismGroundTransBox
		deleteTourismGroundTransBox(
			com.nbp.tourism.application.form.services.model.
				TourismGroundTransBox tourismGroundTransBox) {

		return _tourismGroundTransBoxLocalService.deleteTourismGroundTransBox(
			tourismGroundTransBox);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismGroundTransBoxLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismGroundTransBoxLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismGroundTransBoxLocalService.dynamicQuery();
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

		return _tourismGroundTransBoxLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismGroundTransBoxModelImpl</code>.
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

		return _tourismGroundTransBoxLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismGroundTransBoxModelImpl</code>.
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

		return _tourismGroundTransBoxLocalService.dynamicQuery(
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

		return _tourismGroundTransBoxLocalService.dynamicQueryCount(
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

		return _tourismGroundTransBoxLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.TourismGroundTransBox
		fetchTourismGroundTransBox(long tourismVehicleBoxId) {

		return _tourismGroundTransBoxLocalService.fetchTourismGroundTransBox(
			tourismVehicleBoxId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismGroundTransBoxLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismGroundTransBoxLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismGroundTransBoxLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismGroundTransBoxLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.TourismGroundTransBox>
			getTourismById(long appId) {

		return _tourismGroundTransBoxLocalService.getTourismById(appId);
	}

	/**
	 * Returns the tourism ground trans box with the primary key.
	 *
	 * @param tourismVehicleBoxId the primary key of the tourism ground trans box
	 * @return the tourism ground trans box
	 * @throws PortalException if a tourism ground trans box with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.TourismGroundTransBox
			getTourismGroundTransBox(long tourismVehicleBoxId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismGroundTransBoxLocalService.getTourismGroundTransBox(
			tourismVehicleBoxId);
	}

	/**
	 * Returns a range of all the tourism ground trans boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism ground trans boxes
	 * @param end the upper bound of the range of tourism ground trans boxes (not inclusive)
	 * @return the range of tourism ground trans boxes
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.TourismGroundTransBox>
			getTourismGroundTransBoxes(int start, int end) {

		return _tourismGroundTransBoxLocalService.getTourismGroundTransBoxes(
			start, end);
	}

	/**
	 * Returns the number of tourism ground trans boxes.
	 *
	 * @return the number of tourism ground trans boxes
	 */
	@Override
	public int getTourismGroundTransBoxesCount() {
		return _tourismGroundTransBoxLocalService.
			getTourismGroundTransBoxesCount();
	}

	/**
	 * Updates the tourism ground trans box in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismGroundTransBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismGroundTransBox the tourism ground trans box
	 * @return the tourism ground trans box that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.TourismGroundTransBox
		updateTourismGroundTransBox(
			com.nbp.tourism.application.form.services.model.
				TourismGroundTransBox tourismGroundTransBox) {

		return _tourismGroundTransBoxLocalService.updateTourismGroundTransBox(
			tourismGroundTransBox);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismGroundTransBoxLocalService.getBasePersistence();
	}

	@Override
	public TourismGroundTransBoxLocalService getWrappedService() {
		return _tourismGroundTransBoxLocalService;
	}

	@Override
	public void setWrappedService(
		TourismGroundTransBoxLocalService tourismGroundTransBoxLocalService) {

		_tourismGroundTransBoxLocalService = tourismGroundTransBoxLocalService;
	}

	private TourismGroundTransBoxLocalService
		_tourismGroundTransBoxLocalService;

}