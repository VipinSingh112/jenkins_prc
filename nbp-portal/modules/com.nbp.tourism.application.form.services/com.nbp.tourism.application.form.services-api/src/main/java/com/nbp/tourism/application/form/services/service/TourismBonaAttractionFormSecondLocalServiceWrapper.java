/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaAttractionFormSecondLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionFormSecondLocalService
 * @generated
 */
public class TourismBonaAttractionFormSecondLocalServiceWrapper
	implements ServiceWrapper<TourismBonaAttractionFormSecondLocalService>,
			   TourismBonaAttractionFormSecondLocalService {

	public TourismBonaAttractionFormSecondLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaAttractionFormSecondLocalServiceWrapper(
		TourismBonaAttractionFormSecondLocalService
			tourismBonaAttractionFormSecondLocalService) {

		_tourismBonaAttractionFormSecondLocalService =
			tourismBonaAttractionFormSecondLocalService;
	}

	/**
	 * Adds the tourism bona attraction form second to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionFormSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttractionFormSecond the tourism bona attraction form second
	 * @return the tourism bona attraction form second that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormSecond addTourismBonaAttractionFormSecond(
			com.nbp.tourism.application.form.services.model.
				TourismBonaAttractionFormSecond
					tourismBonaAttractionFormSecond) {

		return _tourismBonaAttractionFormSecondLocalService.
			addTourismBonaAttractionFormSecond(tourismBonaAttractionFormSecond);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionFormSecondLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona attraction form second with the primary key. Does not add the tourism bona attraction form second to the database.
	 *
	 * @param tourismBonaAttractFormSecId the primary key for the new tourism bona attraction form second
	 * @return the new tourism bona attraction form second
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormSecond createTourismBonaAttractionFormSecond(
			long tourismBonaAttractFormSecId) {

		return _tourismBonaAttractionFormSecondLocalService.
			createTourismBonaAttractionFormSecond(tourismBonaAttractFormSecId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionFormSecondLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the tourism bona attraction form second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionFormSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttractFormSecId the primary key of the tourism bona attraction form second
	 * @return the tourism bona attraction form second that was removed
	 * @throws PortalException if a tourism bona attraction form second with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormSecond deleteTourismBonaAttractionFormSecond(
				long tourismBonaAttractFormSecId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionFormSecondLocalService.
			deleteTourismBonaAttractionFormSecond(tourismBonaAttractFormSecId);
	}

	/**
	 * Deletes the tourism bona attraction form second from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionFormSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttractionFormSecond the tourism bona attraction form second
	 * @return the tourism bona attraction form second that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormSecond deleteTourismBonaAttractionFormSecond(
			com.nbp.tourism.application.form.services.model.
				TourismBonaAttractionFormSecond
					tourismBonaAttractionFormSecond) {

		return _tourismBonaAttractionFormSecondLocalService.
			deleteTourismBonaAttractionFormSecond(
				tourismBonaAttractionFormSecond);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaAttractionFormSecondLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaAttractionFormSecondLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaAttractionFormSecondLocalService.dynamicQuery();
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

		return _tourismBonaAttractionFormSecondLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormSecondModelImpl</code>.
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

		return _tourismBonaAttractionFormSecondLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormSecondModelImpl</code>.
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

		return _tourismBonaAttractionFormSecondLocalService.dynamicQuery(
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

		return _tourismBonaAttractionFormSecondLocalService.dynamicQueryCount(
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

		return _tourismBonaAttractionFormSecondLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormSecond fetchTourismBonaAttractionFormSecond(
			long tourismBonaAttractFormSecId) {

		return _tourismBonaAttractionFormSecondLocalService.
			fetchTourismBonaAttractionFormSecond(tourismBonaAttractFormSecId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaAttractionFormSecondLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaAttractionFormSecondLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaAttractionFormSecondLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionFormSecondLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the tourism bona attraction form second with the primary key.
	 *
	 * @param tourismBonaAttractFormSecId the primary key of the tourism bona attraction form second
	 * @return the tourism bona attraction form second
	 * @throws PortalException if a tourism bona attraction form second with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormSecond getTourismBonaAttractionFormSecond(
				long tourismBonaAttractFormSecId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionFormSecondLocalService.
			getTourismBonaAttractionFormSecond(tourismBonaAttractFormSecId);
	}

	/**
	 * Returns a range of all the tourism bona attraction form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form seconds
	 * @param end the upper bound of the range of tourism bona attraction form seconds (not inclusive)
	 * @return the range of tourism bona attraction form seconds
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaAttractionFormSecond>
				getTourismBonaAttractionFormSeconds(int start, int end) {

		return _tourismBonaAttractionFormSecondLocalService.
			getTourismBonaAttractionFormSeconds(start, end);
	}

	/**
	 * Returns the number of tourism bona attraction form seconds.
	 *
	 * @return the number of tourism bona attraction form seconds
	 */
	@Override
	public int getTourismBonaAttractionFormSecondsCount() {
		return _tourismBonaAttractionFormSecondLocalService.
			getTourismBonaAttractionFormSecondsCount();
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormSecond getTourismById(
			long tourismApplicationId) {

		return _tourismBonaAttractionFormSecondLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Updates the tourism bona attraction form second in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionFormSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttractionFormSecond the tourism bona attraction form second
	 * @return the tourism bona attraction form second that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormSecond updateTourismBonaAttractionFormSecond(
			com.nbp.tourism.application.form.services.model.
				TourismBonaAttractionFormSecond
					tourismBonaAttractionFormSecond) {

		return _tourismBonaAttractionFormSecondLocalService.
			updateTourismBonaAttractionFormSecond(
				tourismBonaAttractionFormSecond);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaAttractionFormSecondLocalService.
			getBasePersistence();
	}

	@Override
	public TourismBonaAttractionFormSecondLocalService getWrappedService() {
		return _tourismBonaAttractionFormSecondLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaAttractionFormSecondLocalService
			tourismBonaAttractionFormSecondLocalService) {

		_tourismBonaAttractionFormSecondLocalService =
			tourismBonaAttractionFormSecondLocalService;
	}

	private TourismBonaAttractionFormSecondLocalService
		_tourismBonaAttractionFormSecondLocalService;

}