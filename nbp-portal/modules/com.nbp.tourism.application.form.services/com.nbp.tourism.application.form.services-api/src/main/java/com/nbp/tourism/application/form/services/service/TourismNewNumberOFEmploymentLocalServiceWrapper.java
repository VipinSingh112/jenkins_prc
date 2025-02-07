/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismNewNumberOFEmploymentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewNumberOFEmploymentLocalService
 * @generated
 */
public class TourismNewNumberOFEmploymentLocalServiceWrapper
	implements ServiceWrapper<TourismNewNumberOFEmploymentLocalService>,
			   TourismNewNumberOFEmploymentLocalService {

	public TourismNewNumberOFEmploymentLocalServiceWrapper() {
		this(null);
	}

	public TourismNewNumberOFEmploymentLocalServiceWrapper(
		TourismNewNumberOFEmploymentLocalService
			tourismNewNumberOFEmploymentLocalService) {

		_tourismNewNumberOFEmploymentLocalService =
			tourismNewNumberOFEmploymentLocalService;
	}

	/**
	 * Adds the tourism new number of employment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewNumberOFEmploymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewNumberOFEmployment the tourism new number of employment
	 * @return the tourism new number of employment that was added
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewNumberOFEmployment addTourismNewNumberOFEmployment(
				com.nbp.tourism.application.form.services.model.
					TourismNewNumberOFEmployment tourismNewNumberOFEmployment) {

		return _tourismNewNumberOFEmploymentLocalService.
			addTourismNewNumberOFEmployment(tourismNewNumberOFEmployment);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewNumberOFEmploymentLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism new number of employment with the primary key. Does not add the tourism new number of employment to the database.
	 *
	 * @param tourismNewNumberOFEmploymentId the primary key for the new tourism new number of employment
	 * @return the new tourism new number of employment
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewNumberOFEmployment createTourismNewNumberOFEmployment(
				long tourismNewNumberOFEmploymentId) {

		return _tourismNewNumberOFEmploymentLocalService.
			createTourismNewNumberOFEmployment(tourismNewNumberOFEmploymentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewNumberOFEmploymentLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism new number of employment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewNumberOFEmploymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewNumberOFEmploymentId the primary key of the tourism new number of employment
	 * @return the tourism new number of employment that was removed
	 * @throws PortalException if a tourism new number of employment with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewNumberOFEmployment deleteTourismNewNumberOFEmployment(
					long tourismNewNumberOFEmploymentId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewNumberOFEmploymentLocalService.
			deleteTourismNewNumberOFEmployment(tourismNewNumberOFEmploymentId);
	}

	/**
	 * Deletes the tourism new number of employment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewNumberOFEmploymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewNumberOFEmployment the tourism new number of employment
	 * @return the tourism new number of employment that was removed
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewNumberOFEmployment deleteTourismNewNumberOFEmployment(
				com.nbp.tourism.application.form.services.model.
					TourismNewNumberOFEmployment tourismNewNumberOFEmployment) {

		return _tourismNewNumberOFEmploymentLocalService.
			deleteTourismNewNumberOFEmployment(tourismNewNumberOFEmployment);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismNewNumberOFEmploymentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismNewNumberOFEmploymentLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismNewNumberOFEmploymentLocalService.dynamicQuery();
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

		return _tourismNewNumberOFEmploymentLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewNumberOFEmploymentModelImpl</code>.
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

		return _tourismNewNumberOFEmploymentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewNumberOFEmploymentModelImpl</code>.
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

		return _tourismNewNumberOFEmploymentLocalService.dynamicQuery(
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

		return _tourismNewNumberOFEmploymentLocalService.dynamicQueryCount(
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

		return _tourismNewNumberOFEmploymentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewNumberOFEmployment fetchTourismNewNumberOFEmployment(
				long tourismNewNumberOFEmploymentId) {

		return _tourismNewNumberOFEmploymentLocalService.
			fetchTourismNewNumberOFEmployment(tourismNewNumberOFEmploymentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismNewNumberOFEmploymentLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismNewNumberOFEmploymentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewNumberOFEmploymentLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewNumberOFEmploymentLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewNumberOFEmployment getTourismById(
					long tourismApplicationId)
				throws com.nbp.tourism.application.form.services.exception.
					NoSuchTourismNewNumberOFEmploymentException {

		return _tourismNewNumberOFEmploymentLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Returns the tourism new number of employment with the primary key.
	 *
	 * @param tourismNewNumberOFEmploymentId the primary key of the tourism new number of employment
	 * @return the tourism new number of employment
	 * @throws PortalException if a tourism new number of employment with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewNumberOFEmployment getTourismNewNumberOFEmployment(
					long tourismNewNumberOFEmploymentId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewNumberOFEmploymentLocalService.
			getTourismNewNumberOFEmployment(tourismNewNumberOFEmploymentId);
	}

	/**
	 * Returns a range of all the tourism new number of employments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewNumberOFEmploymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new number of employments
	 * @param end the upper bound of the range of tourism new number of employments (not inclusive)
	 * @return the range of tourism new number of employments
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismNewNumberOFEmployment> getTourismNewNumberOFEmployments(
				int start, int end) {

		return _tourismNewNumberOFEmploymentLocalService.
			getTourismNewNumberOFEmployments(start, end);
	}

	/**
	 * Returns the number of tourism new number of employments.
	 *
	 * @return the number of tourism new number of employments
	 */
	@Override
	public int getTourismNewNumberOFEmploymentsCount() {
		return _tourismNewNumberOFEmploymentLocalService.
			getTourismNewNumberOFEmploymentsCount();
	}

	/**
	 * Updates the tourism new number of employment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewNumberOFEmploymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewNumberOFEmployment the tourism new number of employment
	 * @return the tourism new number of employment that was updated
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.
			TourismNewNumberOFEmployment updateTourismNewNumberOFEmployment(
				com.nbp.tourism.application.form.services.model.
					TourismNewNumberOFEmployment tourismNewNumberOFEmployment) {

		return _tourismNewNumberOFEmploymentLocalService.
			updateTourismNewNumberOFEmployment(tourismNewNumberOFEmployment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismNewNumberOFEmploymentLocalService.getBasePersistence();
	}

	@Override
	public TourismNewNumberOFEmploymentLocalService getWrappedService() {
		return _tourismNewNumberOFEmploymentLocalService;
	}

	@Override
	public void setWrappedService(
		TourismNewNumberOFEmploymentLocalService
			tourismNewNumberOFEmploymentLocalService) {

		_tourismNewNumberOFEmploymentLocalService =
			tourismNewNumberOFEmploymentLocalService;
	}

	private TourismNewNumberOFEmploymentLocalService
		_tourismNewNumberOFEmploymentLocalService;

}