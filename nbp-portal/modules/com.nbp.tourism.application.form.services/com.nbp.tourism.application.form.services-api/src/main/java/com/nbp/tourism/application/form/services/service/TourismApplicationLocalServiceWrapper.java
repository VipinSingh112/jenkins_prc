/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationLocalService
 * @generated
 */
public class TourismApplicationLocalServiceWrapper
	implements ServiceWrapper<TourismApplicationLocalService>,
			   TourismApplicationLocalService {

	public TourismApplicationLocalServiceWrapper() {
		this(null);
	}

	public TourismApplicationLocalServiceWrapper(
		TourismApplicationLocalService tourismApplicationLocalService) {

		_tourismApplicationLocalService = tourismApplicationLocalService;
	}

	/**
	 * Adds the tourism application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismApplication the tourism application
	 * @return the tourism application that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.TourismApplication
		addTourismApplication(
			com.nbp.tourism.application.form.services.model.TourismApplication
				tourismApplication) {

		return _tourismApplicationLocalService.addTourismApplication(
			tourismApplication);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismApplicationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism application with the primary key. Does not add the tourism application to the database.
	 *
	 * @param tourismApplicationId the primary key for the new tourism application
	 * @return the new tourism application
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.TourismApplication
		createTourismApplication(long tourismApplicationId) {

		return _tourismApplicationLocalService.createTourismApplication(
			tourismApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismApplicationLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismApplicationId the primary key of the tourism application
	 * @return the tourism application that was removed
	 * @throws PortalException if a tourism application with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.TourismApplication
			deleteTourismApplication(long tourismApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismApplicationLocalService.deleteTourismApplication(
			tourismApplicationId);
	}

	/**
	 * Deletes the tourism application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismApplication the tourism application
	 * @return the tourism application that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.TourismApplication
		deleteTourismApplication(
			com.nbp.tourism.application.form.services.model.TourismApplication
				tourismApplication) {

		return _tourismApplicationLocalService.deleteTourismApplication(
			tourismApplication);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismApplicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismApplicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismApplicationLocalService.dynamicQuery();
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

		return _tourismApplicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismApplicationModelImpl</code>.
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

		return _tourismApplicationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismApplicationModelImpl</code>.
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

		return _tourismApplicationLocalService.dynamicQuery(
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

		return _tourismApplicationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _tourismApplicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.TourismApplication
		fetchTourismApplication(long tourismApplicationId) {

		return _tourismApplicationLocalService.fetchTourismApplication(
			tourismApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismApplicationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismApplicationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismApplicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismApplicationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the tourism application with the primary key.
	 *
	 * @param tourismApplicationId the primary key of the tourism application
	 * @return the tourism application
	 * @throws PortalException if a tourism application with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.TourismApplication
			getTourismApplication(long tourismApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismApplicationLocalService.getTourismApplication(
			tourismApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.TourismApplication>
			getTourismApplicationByS_U(long userId, int status) {

		return _tourismApplicationLocalService.getTourismApplicationByS_U(
			userId, status);
	}

	/**
	 * Returns a range of all the tourism applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @return the range of tourism applications
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.TourismApplication>
			getTourismApplications(int start, int end) {

		return _tourismApplicationLocalService.getTourismApplications(
			start, end);
	}

	/**
	 * Returns the number of tourism applications.
	 *
	 * @return the number of tourism applications
	 */
	@Override
	public int getTourismApplicationsCount() {
		return _tourismApplicationLocalService.getTourismApplicationsCount();
	}

	@Override
	public com.nbp.tourism.application.form.services.model.TourismApplication
			getTourismBy_CI(String caseId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationException {

		return _tourismApplicationLocalService.getTourismBy_CI(caseId);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.TourismApplication
			getTourismByAppNo(String applicationNumber)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationException {

		return _tourismApplicationLocalService.getTourismByAppNo(
			applicationNumber);
	}

	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.TourismApplication>
			getTourismByStatus(int status) {

		return _tourismApplicationLocalService.getTourismByStatus(status);
	}

	@Override
	public java.util.List<String> getTourismDistinctCategories() {
		return _tourismApplicationLocalService.getTourismDistinctCategories();
	}

	/**
	 * Updates the tourism application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismApplication the tourism application
	 * @return the tourism application that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.TourismApplication
		updateTourismApplication(
			com.nbp.tourism.application.form.services.model.TourismApplication
				tourismApplication) {

		return _tourismApplicationLocalService.updateTourismApplication(
			tourismApplication);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismApplicationLocalService.getBasePersistence();
	}

	@Override
	public TourismApplicationLocalService getWrappedService() {
		return _tourismApplicationLocalService;
	}

	@Override
	public void setWrappedService(
		TourismApplicationLocalService tourismApplicationLocalService) {

		_tourismApplicationLocalService = tourismApplicationLocalService;
	}

	private TourismApplicationLocalService _tourismApplicationLocalService;

}