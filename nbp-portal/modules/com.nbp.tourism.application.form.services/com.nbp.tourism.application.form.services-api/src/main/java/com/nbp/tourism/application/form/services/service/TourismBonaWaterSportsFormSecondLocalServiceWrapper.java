/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaWaterSportsFormSecondLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportsFormSecondLocalService
 * @generated
 */
public class TourismBonaWaterSportsFormSecondLocalServiceWrapper
	implements ServiceWrapper<TourismBonaWaterSportsFormSecondLocalService>,
			   TourismBonaWaterSportsFormSecondLocalService {

	public TourismBonaWaterSportsFormSecondLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaWaterSportsFormSecondLocalServiceWrapper(
		TourismBonaWaterSportsFormSecondLocalService
			tourismBonaWaterSportsFormSecondLocalService) {

		_tourismBonaWaterSportsFormSecondLocalService =
			tourismBonaWaterSportsFormSecondLocalService;
	}

	/**
	 * Adds the tourism bona water sports form second to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportsFormSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWaterSportsFormSecond the tourism bona water sports form second
	 * @return the tourism bona water sports form second that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormSecond addTourismBonaWaterSportsFormSecond(
			com.nbp.tourism.application.form.services.model.
				TourismBonaWaterSportsFormSecond
					tourismBonaWaterSportsFormSecond) {

		return _tourismBonaWaterSportsFormSecondLocalService.
			addTourismBonaWaterSportsFormSecond(
				tourismBonaWaterSportsFormSecond);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportsFormSecondLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona water sports form second with the primary key. Does not add the tourism bona water sports form second to the database.
	 *
	 * @param tourismBonaWaterSportsFSecId the primary key for the new tourism bona water sports form second
	 * @return the new tourism bona water sports form second
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormSecond createTourismBonaWaterSportsFormSecond(
			long tourismBonaWaterSportsFSecId) {

		return _tourismBonaWaterSportsFormSecondLocalService.
			createTourismBonaWaterSportsFormSecond(
				tourismBonaWaterSportsFSecId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportsFormSecondLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the tourism bona water sports form second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportsFormSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWaterSportsFSecId the primary key of the tourism bona water sports form second
	 * @return the tourism bona water sports form second that was removed
	 * @throws PortalException if a tourism bona water sports form second with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormSecond deleteTourismBonaWaterSportsFormSecond(
				long tourismBonaWaterSportsFSecId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportsFormSecondLocalService.
			deleteTourismBonaWaterSportsFormSecond(
				tourismBonaWaterSportsFSecId);
	}

	/**
	 * Deletes the tourism bona water sports form second from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportsFormSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWaterSportsFormSecond the tourism bona water sports form second
	 * @return the tourism bona water sports form second that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormSecond deleteTourismBonaWaterSportsFormSecond(
			com.nbp.tourism.application.form.services.model.
				TourismBonaWaterSportsFormSecond
					tourismBonaWaterSportsFormSecond) {

		return _tourismBonaWaterSportsFormSecondLocalService.
			deleteTourismBonaWaterSportsFormSecond(
				tourismBonaWaterSportsFormSecond);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaWaterSportsFormSecondLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaWaterSportsFormSecondLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaWaterSportsFormSecondLocalService.dynamicQuery();
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

		return _tourismBonaWaterSportsFormSecondLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportsFormSecondModelImpl</code>.
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

		return _tourismBonaWaterSportsFormSecondLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportsFormSecondModelImpl</code>.
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

		return _tourismBonaWaterSportsFormSecondLocalService.dynamicQuery(
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

		return _tourismBonaWaterSportsFormSecondLocalService.dynamicQueryCount(
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

		return _tourismBonaWaterSportsFormSecondLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormSecond fetchTourismBonaWaterSportsFormSecond(
			long tourismBonaWaterSportsFSecId) {

		return _tourismBonaWaterSportsFormSecondLocalService.
			fetchTourismBonaWaterSportsFormSecond(tourismBonaWaterSportsFSecId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaWaterSportsFormSecondLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaWaterSportsFormSecondLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaWaterSportsFormSecondLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportsFormSecondLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the tourism bona water sports form second with the primary key.
	 *
	 * @param tourismBonaWaterSportsFSecId the primary key of the tourism bona water sports form second
	 * @return the tourism bona water sports form second
	 * @throws PortalException if a tourism bona water sports form second with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormSecond getTourismBonaWaterSportsFormSecond(
				long tourismBonaWaterSportsFSecId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportsFormSecondLocalService.
			getTourismBonaWaterSportsFormSecond(tourismBonaWaterSportsFSecId);
	}

	/**
	 * Returns a range of all the tourism bona water sports form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportsFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form seconds
	 * @param end the upper bound of the range of tourism bona water sports form seconds (not inclusive)
	 * @return the range of tourism bona water sports form seconds
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaWaterSportsFormSecond>
				getTourismBonaWaterSportsFormSeconds(int start, int end) {

		return _tourismBonaWaterSportsFormSecondLocalService.
			getTourismBonaWaterSportsFormSeconds(start, end);
	}

	/**
	 * Returns the number of tourism bona water sports form seconds.
	 *
	 * @return the number of tourism bona water sports form seconds
	 */
	@Override
	public int getTourismBonaWaterSportsFormSecondsCount() {
		return _tourismBonaWaterSportsFormSecondLocalService.
			getTourismBonaWaterSportsFormSecondsCount();
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormSecond getTourismById(
			long tourismApplicationId) {

		return _tourismBonaWaterSportsFormSecondLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Updates the tourism bona water sports form second in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportsFormSecondLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWaterSportsFormSecond the tourism bona water sports form second
	 * @return the tourism bona water sports form second that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormSecond updateTourismBonaWaterSportsFormSecond(
			com.nbp.tourism.application.form.services.model.
				TourismBonaWaterSportsFormSecond
					tourismBonaWaterSportsFormSecond) {

		return _tourismBonaWaterSportsFormSecondLocalService.
			updateTourismBonaWaterSportsFormSecond(
				tourismBonaWaterSportsFormSecond);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaWaterSportsFormSecondLocalService.
			getBasePersistence();
	}

	@Override
	public TourismBonaWaterSportsFormSecondLocalService getWrappedService() {
		return _tourismBonaWaterSportsFormSecondLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaWaterSportsFormSecondLocalService
			tourismBonaWaterSportsFormSecondLocalService) {

		_tourismBonaWaterSportsFormSecondLocalService =
			tourismBonaWaterSportsFormSecondLocalService;
	}

	private TourismBonaWaterSportsFormSecondLocalService
		_tourismBonaWaterSportsFormSecondLocalService;

}