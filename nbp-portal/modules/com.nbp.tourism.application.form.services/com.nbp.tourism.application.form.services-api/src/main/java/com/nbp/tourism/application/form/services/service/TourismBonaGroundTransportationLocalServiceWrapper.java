/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaGroundTransportationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransportationLocalService
 * @generated
 */
public class TourismBonaGroundTransportationLocalServiceWrapper
	implements ServiceWrapper<TourismBonaGroundTransportationLocalService>,
			   TourismBonaGroundTransportationLocalService {

	public TourismBonaGroundTransportationLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaGroundTransportationLocalServiceWrapper(
		TourismBonaGroundTransportationLocalService
			tourismBonaGroundTransportationLocalService) {

		_tourismBonaGroundTransportationLocalService =
			tourismBonaGroundTransportationLocalService;
	}

	/**
	 * Adds the tourism bona ground transportation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransportationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundTransportation the tourism bona ground transportation
	 * @return the tourism bona ground transportation that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportation addTourismBonaGroundTransportation(
			com.nbp.tourism.application.form.services.model.
				TourismBonaGroundTransportation
					tourismBonaGroundTransportation) {

		return _tourismBonaGroundTransportationLocalService.
			addTourismBonaGroundTransportation(tourismBonaGroundTransportation);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransportationLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona ground transportation with the primary key. Does not add the tourism bona ground transportation to the database.
	 *
	 * @param tourismBonaGroundTransportId the primary key for the new tourism bona ground transportation
	 * @return the new tourism bona ground transportation
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportation createTourismBonaGroundTransportation(
			long tourismBonaGroundTransportId) {

		return _tourismBonaGroundTransportationLocalService.
			createTourismBonaGroundTransportation(tourismBonaGroundTransportId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransportationLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the tourism bona ground transportation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransportationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundTransportId the primary key of the tourism bona ground transportation
	 * @return the tourism bona ground transportation that was removed
	 * @throws PortalException if a tourism bona ground transportation with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportation deleteTourismBonaGroundTransportation(
				long tourismBonaGroundTransportId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransportationLocalService.
			deleteTourismBonaGroundTransportation(tourismBonaGroundTransportId);
	}

	/**
	 * Deletes the tourism bona ground transportation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransportationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundTransportation the tourism bona ground transportation
	 * @return the tourism bona ground transportation that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportation deleteTourismBonaGroundTransportation(
			com.nbp.tourism.application.form.services.model.
				TourismBonaGroundTransportation
					tourismBonaGroundTransportation) {

		return _tourismBonaGroundTransportationLocalService.
			deleteTourismBonaGroundTransportation(
				tourismBonaGroundTransportation);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaGroundTransportationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaGroundTransportationLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaGroundTransportationLocalService.dynamicQuery();
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

		return _tourismBonaGroundTransportationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransportationModelImpl</code>.
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

		return _tourismBonaGroundTransportationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransportationModelImpl</code>.
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

		return _tourismBonaGroundTransportationLocalService.dynamicQuery(
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

		return _tourismBonaGroundTransportationLocalService.dynamicQueryCount(
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

		return _tourismBonaGroundTransportationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportation fetchTourismBonaGroundTransportation(
			long tourismBonaGroundTransportId) {

		return _tourismBonaGroundTransportationLocalService.
			fetchTourismBonaGroundTransportation(tourismBonaGroundTransportId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaGroundTransportationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaGroundTransportationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaGroundTransportationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransportationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the tourism bona ground transportation with the primary key.
	 *
	 * @param tourismBonaGroundTransportId the primary key of the tourism bona ground transportation
	 * @return the tourism bona ground transportation
	 * @throws PortalException if a tourism bona ground transportation with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportation getTourismBonaGroundTransportation(
				long tourismBonaGroundTransportId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransportationLocalService.
			getTourismBonaGroundTransportation(tourismBonaGroundTransportId);
	}

	/**
	 * Returns a range of all the tourism bona ground transportations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransportationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportations
	 * @param end the upper bound of the range of tourism bona ground transportations (not inclusive)
	 * @return the range of tourism bona ground transportations
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaGroundTransportation>
				getTourismBonaGroundTransportations(int start, int end) {

		return _tourismBonaGroundTransportationLocalService.
			getTourismBonaGroundTransportations(start, end);
	}

	/**
	 * Returns the number of tourism bona ground transportations.
	 *
	 * @return the number of tourism bona ground transportations
	 */
	@Override
	public int getTourismBonaGroundTransportationsCount() {
		return _tourismBonaGroundTransportationLocalService.
			getTourismBonaGroundTransportationsCount();
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportation getTourismById(
			long tourismApplicationId) {

		return _tourismBonaGroundTransportationLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Updates the tourism bona ground transportation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransportationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundTransportation the tourism bona ground transportation
	 * @return the tourism bona ground transportation that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportation updateTourismBonaGroundTransportation(
			com.nbp.tourism.application.form.services.model.
				TourismBonaGroundTransportation
					tourismBonaGroundTransportation) {

		return _tourismBonaGroundTransportationLocalService.
			updateTourismBonaGroundTransportation(
				tourismBonaGroundTransportation);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaGroundTransportationLocalService.
			getBasePersistence();
	}

	@Override
	public TourismBonaGroundTransportationLocalService getWrappedService() {
		return _tourismBonaGroundTransportationLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaGroundTransportationLocalService
			tourismBonaGroundTransportationLocalService) {

		_tourismBonaGroundTransportationLocalService =
			tourismBonaGroundTransportationLocalService;
	}

	private TourismBonaGroundTransportationLocalService
		_tourismBonaGroundTransportationLocalService;

}