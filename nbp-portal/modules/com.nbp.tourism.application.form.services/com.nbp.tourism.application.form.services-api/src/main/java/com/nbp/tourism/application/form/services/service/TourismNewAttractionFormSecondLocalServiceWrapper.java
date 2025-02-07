/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismNewAttractionFormSecondLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormSecondLocalService
 * @generated
 */
public class TourismNewAttractionFormSecondLocalServiceWrapper
	implements ServiceWrapper<TourismNewAttractionFormSecondLocalService>,
			   TourismNewAttractionFormSecondLocalService {

	public TourismNewAttractionFormSecondLocalServiceWrapper() {
		this(null);
	}

	public TourismNewAttractionFormSecondLocalServiceWrapper(
		TourismNewAttractionFormSecondLocalService
			tourismNewAttractionFormSecondLocalService) {

		_tourismNewAttractionFormSecondLocalService =
			tourismNewAttractionFormSecondLocalService;
	}

	/**
	 * Adds the tourism new attraction form second to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionFormSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionFormSecond the tourism new attraction form second
	 * @return the tourism new attraction form second that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormSecond addTourismNewAttractionFormSecond(
			com.nbp.tourism.application.form.services.model.
				TourismNewAttractionFormSecond tourismNewAttractionFormSecond) {

		return _tourismNewAttractionFormSecondLocalService.
			addTourismNewAttractionFormSecond(tourismNewAttractionFormSecond);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionFormSecondLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism new attraction form second with the primary key. Does not add the tourism new attraction form second to the database.
	 *
	 * @param tourismNewAttractionFormSecId the primary key for the new tourism new attraction form second
	 * @return the new tourism new attraction form second
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormSecond createTourismNewAttractionFormSecond(
			long tourismNewAttractionFormSecId) {

		return _tourismNewAttractionFormSecondLocalService.
			createTourismNewAttractionFormSecond(tourismNewAttractionFormSecId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionFormSecondLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism new attraction form second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionFormSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionFormSecId the primary key of the tourism new attraction form second
	 * @return the tourism new attraction form second that was removed
	 * @throws PortalException if a tourism new attraction form second with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormSecond deleteTourismNewAttractionFormSecond(
				long tourismNewAttractionFormSecId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionFormSecondLocalService.
			deleteTourismNewAttractionFormSecond(tourismNewAttractionFormSecId);
	}

	/**
	 * Deletes the tourism new attraction form second from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionFormSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionFormSecond the tourism new attraction form second
	 * @return the tourism new attraction form second that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormSecond deleteTourismNewAttractionFormSecond(
			com.nbp.tourism.application.form.services.model.
				TourismNewAttractionFormSecond tourismNewAttractionFormSecond) {

		return _tourismNewAttractionFormSecondLocalService.
			deleteTourismNewAttractionFormSecond(
				tourismNewAttractionFormSecond);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismNewAttractionFormSecondLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismNewAttractionFormSecondLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismNewAttractionFormSecondLocalService.dynamicQuery();
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

		return _tourismNewAttractionFormSecondLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormSecondModelImpl</code>.
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

		return _tourismNewAttractionFormSecondLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormSecondModelImpl</code>.
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

		return _tourismNewAttractionFormSecondLocalService.dynamicQuery(
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

		return _tourismNewAttractionFormSecondLocalService.dynamicQueryCount(
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

		return _tourismNewAttractionFormSecondLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormSecond fetchTourismNewAttractionFormSecond(
			long tourismNewAttractionFormSecId) {

		return _tourismNewAttractionFormSecondLocalService.
			fetchTourismNewAttractionFormSecond(tourismNewAttractionFormSecId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismNewAttractionFormSecondLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismNewAttractionFormSecondLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewAttractionFormSecondLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionFormSecondLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormSecond getTourismById(
			long tourismApplicationId) {

		return _tourismNewAttractionFormSecondLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Returns the tourism new attraction form second with the primary key.
	 *
	 * @param tourismNewAttractionFormSecId the primary key of the tourism new attraction form second
	 * @return the tourism new attraction form second
	 * @throws PortalException if a tourism new attraction form second with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormSecond getTourismNewAttractionFormSecond(
				long tourismNewAttractionFormSecId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionFormSecondLocalService.
			getTourismNewAttractionFormSecond(tourismNewAttractionFormSecId);
	}

	/**
	 * Returns a range of all the tourism new attraction form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form seconds
	 * @param end the upper bound of the range of tourism new attraction form seconds (not inclusive)
	 * @return the range of tourism new attraction form seconds
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismNewAttractionFormSecond> getTourismNewAttractionFormSeconds(
				int start, int end) {

		return _tourismNewAttractionFormSecondLocalService.
			getTourismNewAttractionFormSeconds(start, end);
	}

	/**
	 * Returns the number of tourism new attraction form seconds.
	 *
	 * @return the number of tourism new attraction form seconds
	 */
	@Override
	public int getTourismNewAttractionFormSecondsCount() {
		return _tourismNewAttractionFormSecondLocalService.
			getTourismNewAttractionFormSecondsCount();
	}

	/**
	 * Updates the tourism new attraction form second in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionFormSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionFormSecond the tourism new attraction form second
	 * @return the tourism new attraction form second that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormSecond updateTourismNewAttractionFormSecond(
			com.nbp.tourism.application.form.services.model.
				TourismNewAttractionFormSecond tourismNewAttractionFormSecond) {

		return _tourismNewAttractionFormSecondLocalService.
			updateTourismNewAttractionFormSecond(
				tourismNewAttractionFormSecond);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismNewAttractionFormSecondLocalService.getBasePersistence();
	}

	@Override
	public TourismNewAttractionFormSecondLocalService getWrappedService() {
		return _tourismNewAttractionFormSecondLocalService;
	}

	@Override
	public void setWrappedService(
		TourismNewAttractionFormSecondLocalService
			tourismNewAttractionFormSecondLocalService) {

		_tourismNewAttractionFormSecondLocalService =
			tourismNewAttractionFormSecondLocalService;
	}

	private TourismNewAttractionFormSecondLocalService
		_tourismNewAttractionFormSecondLocalService;

}