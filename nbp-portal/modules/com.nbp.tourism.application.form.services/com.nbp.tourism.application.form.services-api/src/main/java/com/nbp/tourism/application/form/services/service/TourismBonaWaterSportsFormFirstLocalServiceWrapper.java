/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaWaterSportsFormFirstLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportsFormFirstLocalService
 * @generated
 */
public class TourismBonaWaterSportsFormFirstLocalServiceWrapper
	implements ServiceWrapper<TourismBonaWaterSportsFormFirstLocalService>,
			   TourismBonaWaterSportsFormFirstLocalService {

	public TourismBonaWaterSportsFormFirstLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaWaterSportsFormFirstLocalServiceWrapper(
		TourismBonaWaterSportsFormFirstLocalService
			tourismBonaWaterSportsFormFirstLocalService) {

		_tourismBonaWaterSportsFormFirstLocalService =
			tourismBonaWaterSportsFormFirstLocalService;
	}

	/**
	 * Adds the tourism bona water sports form first to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportsFormFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWaterSportsFormFirst the tourism bona water sports form first
	 * @return the tourism bona water sports form first that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormFirst addTourismBonaWaterSportsFormFirst(
			com.nbp.tourism.application.form.services.model.
				TourismBonaWaterSportsFormFirst
					tourismBonaWaterSportsFormFirst) {

		return _tourismBonaWaterSportsFormFirstLocalService.
			addTourismBonaWaterSportsFormFirst(tourismBonaWaterSportsFormFirst);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportsFormFirstLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona water sports form first with the primary key. Does not add the tourism bona water sports form first to the database.
	 *
	 * @param tourismBonaWaterSFFirstId the primary key for the new tourism bona water sports form first
	 * @return the new tourism bona water sports form first
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormFirst createTourismBonaWaterSportsFormFirst(
			long tourismBonaWaterSFFirstId) {

		return _tourismBonaWaterSportsFormFirstLocalService.
			createTourismBonaWaterSportsFormFirst(tourismBonaWaterSFFirstId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportsFormFirstLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the tourism bona water sports form first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportsFormFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWaterSFFirstId the primary key of the tourism bona water sports form first
	 * @return the tourism bona water sports form first that was removed
	 * @throws PortalException if a tourism bona water sports form first with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormFirst deleteTourismBonaWaterSportsFormFirst(
				long tourismBonaWaterSFFirstId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportsFormFirstLocalService.
			deleteTourismBonaWaterSportsFormFirst(tourismBonaWaterSFFirstId);
	}

	/**
	 * Deletes the tourism bona water sports form first from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportsFormFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWaterSportsFormFirst the tourism bona water sports form first
	 * @return the tourism bona water sports form first that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormFirst deleteTourismBonaWaterSportsFormFirst(
			com.nbp.tourism.application.form.services.model.
				TourismBonaWaterSportsFormFirst
					tourismBonaWaterSportsFormFirst) {

		return _tourismBonaWaterSportsFormFirstLocalService.
			deleteTourismBonaWaterSportsFormFirst(
				tourismBonaWaterSportsFormFirst);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaWaterSportsFormFirstLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaWaterSportsFormFirstLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaWaterSportsFormFirstLocalService.dynamicQuery();
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

		return _tourismBonaWaterSportsFormFirstLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportsFormFirstModelImpl</code>.
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

		return _tourismBonaWaterSportsFormFirstLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportsFormFirstModelImpl</code>.
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

		return _tourismBonaWaterSportsFormFirstLocalService.dynamicQuery(
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

		return _tourismBonaWaterSportsFormFirstLocalService.dynamicQueryCount(
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

		return _tourismBonaWaterSportsFormFirstLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormFirst fetchTourismBonaWaterSportsFormFirst(
			long tourismBonaWaterSFFirstId) {

		return _tourismBonaWaterSportsFormFirstLocalService.
			fetchTourismBonaWaterSportsFormFirst(tourismBonaWaterSFFirstId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaWaterSportsFormFirstLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaWaterSportsFormFirstLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaWaterSportsFormFirstLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportsFormFirstLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the tourism bona water sports form first with the primary key.
	 *
	 * @param tourismBonaWaterSFFirstId the primary key of the tourism bona water sports form first
	 * @return the tourism bona water sports form first
	 * @throws PortalException if a tourism bona water sports form first with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormFirst getTourismBonaWaterSportsFormFirst(
				long tourismBonaWaterSFFirstId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportsFormFirstLocalService.
			getTourismBonaWaterSportsFormFirst(tourismBonaWaterSFFirstId);
	}

	/**
	 * Returns a range of all the tourism bona water sports form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportsFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form firsts
	 * @param end the upper bound of the range of tourism bona water sports form firsts (not inclusive)
	 * @return the range of tourism bona water sports form firsts
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaWaterSportsFormFirst>
				getTourismBonaWaterSportsFormFirsts(int start, int end) {

		return _tourismBonaWaterSportsFormFirstLocalService.
			getTourismBonaWaterSportsFormFirsts(start, end);
	}

	/**
	 * Returns the number of tourism bona water sports form firsts.
	 *
	 * @return the number of tourism bona water sports form firsts
	 */
	@Override
	public int getTourismBonaWaterSportsFormFirstsCount() {
		return _tourismBonaWaterSportsFormFirstLocalService.
			getTourismBonaWaterSportsFormFirstsCount();
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormFirst getTourismById(
			long tourismApplicationId) {

		return _tourismBonaWaterSportsFormFirstLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Updates the tourism bona water sports form first in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportsFormFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWaterSportsFormFirst the tourism bona water sports form first
	 * @return the tourism bona water sports form first that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormFirst updateTourismBonaWaterSportsFormFirst(
			com.nbp.tourism.application.form.services.model.
				TourismBonaWaterSportsFormFirst
					tourismBonaWaterSportsFormFirst) {

		return _tourismBonaWaterSportsFormFirstLocalService.
			updateTourismBonaWaterSportsFormFirst(
				tourismBonaWaterSportsFormFirst);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaWaterSportsFormFirstLocalService.
			getBasePersistence();
	}

	@Override
	public TourismBonaWaterSportsFormFirstLocalService getWrappedService() {
		return _tourismBonaWaterSportsFormFirstLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaWaterSportsFormFirstLocalService
			tourismBonaWaterSportsFormFirstLocalService) {

		_tourismBonaWaterSportsFormFirstLocalService =
			tourismBonaWaterSportsFormFirstLocalService;
	}

	private TourismBonaWaterSportsFormFirstLocalService
		_tourismBonaWaterSportsFormFirstLocalService;

}