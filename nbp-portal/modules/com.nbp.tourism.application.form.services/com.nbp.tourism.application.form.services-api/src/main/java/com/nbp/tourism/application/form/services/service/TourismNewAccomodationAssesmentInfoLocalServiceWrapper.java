/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TourismNewAccomodationAssesmentInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccomodationAssesmentInfoLocalService
 * @generated
 */
public class TourismNewAccomodationAssesmentInfoLocalServiceWrapper
	implements ServiceWrapper<TourismNewAccomodationAssesmentInfoLocalService>,
			   TourismNewAccomodationAssesmentInfoLocalService {

	public TourismNewAccomodationAssesmentInfoLocalServiceWrapper() {
		this(null);
	}

	public TourismNewAccomodationAssesmentInfoLocalServiceWrapper(
		TourismNewAccomodationAssesmentInfoLocalService
			tourismNewAccomodationAssesmentInfoLocalService) {

		_tourismNewAccomodationAssesmentInfoLocalService =
			tourismNewAccomodationAssesmentInfoLocalService;
	}

	/**
	 * Adds the tourism new accomodation assesment info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAccomodationAssesmentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAccomodationAssesmentInfo the tourism new accomodation assesment info
	 * @return the tourism new accomodation assesment info that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAccomodationAssesmentInfo
			addTourismNewAccomodationAssesmentInfo(
				com.nbp.tourism.application.form.services.model.
					TourismNewAccomodationAssesmentInfo
						tourismNewAccomodationAssesmentInfo) {

		return _tourismNewAccomodationAssesmentInfoLocalService.
			addTourismNewAccomodationAssesmentInfo(
				tourismNewAccomodationAssesmentInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccomodationAssesmentInfoLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tourism new accomodation assesment info with the primary key. Does not add the tourism new accomodation assesment info to the database.
	 *
	 * @param tourismNewAccomodationAssesId the primary key for the new tourism new accomodation assesment info
	 * @return the new tourism new accomodation assesment info
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAccomodationAssesmentInfo
			createTourismNewAccomodationAssesmentInfo(
				long tourismNewAccomodationAssesId) {

		return _tourismNewAccomodationAssesmentInfoLocalService.
			createTourismNewAccomodationAssesmentInfo(
				tourismNewAccomodationAssesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccomodationAssesmentInfoLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the tourism new accomodation assesment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAccomodationAssesmentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAccomodationAssesId the primary key of the tourism new accomodation assesment info
	 * @return the tourism new accomodation assesment info that was removed
	 * @throws PortalException if a tourism new accomodation assesment info with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAccomodationAssesmentInfo
				deleteTourismNewAccomodationAssesmentInfo(
					long tourismNewAccomodationAssesId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccomodationAssesmentInfoLocalService.
			deleteTourismNewAccomodationAssesmentInfo(
				tourismNewAccomodationAssesId);
	}

	/**
	 * Deletes the tourism new accomodation assesment info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAccomodationAssesmentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAccomodationAssesmentInfo the tourism new accomodation assesment info
	 * @return the tourism new accomodation assesment info that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAccomodationAssesmentInfo
			deleteTourismNewAccomodationAssesmentInfo(
				com.nbp.tourism.application.form.services.model.
					TourismNewAccomodationAssesmentInfo
						tourismNewAccomodationAssesmentInfo) {

		return _tourismNewAccomodationAssesmentInfoLocalService.
			deleteTourismNewAccomodationAssesmentInfo(
				tourismNewAccomodationAssesmentInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismNewAccomodationAssesmentInfoLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismNewAccomodationAssesmentInfoLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismNewAccomodationAssesmentInfoLocalService.dynamicQuery();
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

		return _tourismNewAccomodationAssesmentInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAccomodationAssesmentInfoModelImpl</code>.
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

		return _tourismNewAccomodationAssesmentInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAccomodationAssesmentInfoModelImpl</code>.
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

		return _tourismNewAccomodationAssesmentInfoLocalService.dynamicQuery(
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

		return _tourismNewAccomodationAssesmentInfoLocalService.
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

		return _tourismNewAccomodationAssesmentInfoLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAccomodationAssesmentInfo
			fetchTourismNewAccomodationAssesmentInfo(
				long tourismNewAccomodationAssesId) {

		return _tourismNewAccomodationAssesmentInfoLocalService.
			fetchTourismNewAccomodationAssesmentInfo(
				tourismNewAccomodationAssesId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismNewAccomodationAssesmentInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismNewAccomodationAssesmentInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewAccomodationAssesmentInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccomodationAssesmentInfoLocalService.
			getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAccomodationAssesmentInfo getTourismById(
				long tourismApplicationId)
			throws com.nbp.tourism.application.form.services.exception.
				NoSuchTourismNewAccomodationAssesmentInfoException {

		return _tourismNewAccomodationAssesmentInfoLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Returns the tourism new accomodation assesment info with the primary key.
	 *
	 * @param tourismNewAccomodationAssesId the primary key of the tourism new accomodation assesment info
	 * @return the tourism new accomodation assesment info
	 * @throws PortalException if a tourism new accomodation assesment info with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAccomodationAssesmentInfo
				getTourismNewAccomodationAssesmentInfo(
					long tourismNewAccomodationAssesId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccomodationAssesmentInfoLocalService.
			getTourismNewAccomodationAssesmentInfo(
				tourismNewAccomodationAssesId);
	}

	/**
	 * Returns a range of all the tourism new accomodation assesment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAccomodationAssesmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accomodation assesment infos
	 * @param end the upper bound of the range of tourism new accomodation assesment infos (not inclusive)
	 * @return the range of tourism new accomodation assesment infos
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismNewAccomodationAssesmentInfo>
				getTourismNewAccomodationAssesmentInfos(int start, int end) {

		return _tourismNewAccomodationAssesmentInfoLocalService.
			getTourismNewAccomodationAssesmentInfos(start, end);
	}

	/**
	 * Returns the number of tourism new accomodation assesment infos.
	 *
	 * @return the number of tourism new accomodation assesment infos
	 */
	@Override
	public int getTourismNewAccomodationAssesmentInfosCount() {
		return _tourismNewAccomodationAssesmentInfoLocalService.
			getTourismNewAccomodationAssesmentInfosCount();
	}

	/**
	 * Updates the tourism new accomodation assesment info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAccomodationAssesmentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAccomodationAssesmentInfo the tourism new accomodation assesment info
	 * @return the tourism new accomodation assesment info that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAccomodationAssesmentInfo
			updateTourismNewAccomodationAssesmentInfo(
				com.nbp.tourism.application.form.services.model.
					TourismNewAccomodationAssesmentInfo
						tourismNewAccomodationAssesmentInfo) {

		return _tourismNewAccomodationAssesmentInfoLocalService.
			updateTourismNewAccomodationAssesmentInfo(
				tourismNewAccomodationAssesmentInfo);
	}

	@Override
	public TourismNewAccomodationAssesmentInfoLocalService getWrappedService() {
		return _tourismNewAccomodationAssesmentInfoLocalService;
	}

	@Override
	public void setWrappedService(
		TourismNewAccomodationAssesmentInfoLocalService
			tourismNewAccomodationAssesmentInfoLocalService) {

		_tourismNewAccomodationAssesmentInfoLocalService =
			tourismNewAccomodationAssesmentInfoLocalService;
	}

	private TourismNewAccomodationAssesmentInfoLocalService
		_tourismNewAccomodationAssesmentInfoLocalService;

}