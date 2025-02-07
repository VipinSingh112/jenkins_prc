/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaAttractionFormFirstLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionFormFirstLocalService
 * @generated
 */
public class TourismBonaAttractionFormFirstLocalServiceWrapper
	implements ServiceWrapper<TourismBonaAttractionFormFirstLocalService>,
			   TourismBonaAttractionFormFirstLocalService {

	public TourismBonaAttractionFormFirstLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaAttractionFormFirstLocalServiceWrapper(
		TourismBonaAttractionFormFirstLocalService
			tourismBonaAttractionFormFirstLocalService) {

		_tourismBonaAttractionFormFirstLocalService =
			tourismBonaAttractionFormFirstLocalService;
	}

	/**
	 * Adds the tourism bona attraction form first to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionFormFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttractionFormFirst the tourism bona attraction form first
	 * @return the tourism bona attraction form first that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormFirst addTourismBonaAttractionFormFirst(
			com.nbp.tourism.application.form.services.model.
				TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst) {

		return _tourismBonaAttractionFormFirstLocalService.
			addTourismBonaAttractionFormFirst(tourismBonaAttractionFormFirst);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionFormFirstLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona attraction form first with the primary key. Does not add the tourism bona attraction form first to the database.
	 *
	 * @param tourismBonaAttractFormFirstId the primary key for the new tourism bona attraction form first
	 * @return the new tourism bona attraction form first
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormFirst createTourismBonaAttractionFormFirst(
			long tourismBonaAttractFormFirstId) {

		return _tourismBonaAttractionFormFirstLocalService.
			createTourismBonaAttractionFormFirst(tourismBonaAttractFormFirstId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionFormFirstLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism bona attraction form first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionFormFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttractFormFirstId the primary key of the tourism bona attraction form first
	 * @return the tourism bona attraction form first that was removed
	 * @throws PortalException if a tourism bona attraction form first with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormFirst deleteTourismBonaAttractionFormFirst(
				long tourismBonaAttractFormFirstId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionFormFirstLocalService.
			deleteTourismBonaAttractionFormFirst(tourismBonaAttractFormFirstId);
	}

	/**
	 * Deletes the tourism bona attraction form first from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionFormFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttractionFormFirst the tourism bona attraction form first
	 * @return the tourism bona attraction form first that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormFirst deleteTourismBonaAttractionFormFirst(
			com.nbp.tourism.application.form.services.model.
				TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst) {

		return _tourismBonaAttractionFormFirstLocalService.
			deleteTourismBonaAttractionFormFirst(
				tourismBonaAttractionFormFirst);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaAttractionFormFirstLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaAttractionFormFirstLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaAttractionFormFirstLocalService.dynamicQuery();
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

		return _tourismBonaAttractionFormFirstLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormFirstModelImpl</code>.
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

		return _tourismBonaAttractionFormFirstLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormFirstModelImpl</code>.
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

		return _tourismBonaAttractionFormFirstLocalService.dynamicQuery(
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

		return _tourismBonaAttractionFormFirstLocalService.dynamicQueryCount(
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

		return _tourismBonaAttractionFormFirstLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormFirst fetchTourismBonaAttractionFormFirst(
			long tourismBonaAttractFormFirstId) {

		return _tourismBonaAttractionFormFirstLocalService.
			fetchTourismBonaAttractionFormFirst(tourismBonaAttractFormFirstId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaAttractionFormFirstLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaAttractionFormFirstLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaAttractionFormFirstLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionFormFirstLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the tourism bona attraction form first with the primary key.
	 *
	 * @param tourismBonaAttractFormFirstId the primary key of the tourism bona attraction form first
	 * @return the tourism bona attraction form first
	 * @throws PortalException if a tourism bona attraction form first with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormFirst getTourismBonaAttractionFormFirst(
				long tourismBonaAttractFormFirstId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionFormFirstLocalService.
			getTourismBonaAttractionFormFirst(tourismBonaAttractFormFirstId);
	}

	/**
	 * Returns a range of all the tourism bona attraction form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form firsts
	 * @param end the upper bound of the range of tourism bona attraction form firsts (not inclusive)
	 * @return the range of tourism bona attraction form firsts
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaAttractionFormFirst> getTourismBonaAttractionFormFirsts(
				int start, int end) {

		return _tourismBonaAttractionFormFirstLocalService.
			getTourismBonaAttractionFormFirsts(start, end);
	}

	/**
	 * Returns the number of tourism bona attraction form firsts.
	 *
	 * @return the number of tourism bona attraction form firsts
	 */
	@Override
	public int getTourismBonaAttractionFormFirstsCount() {
		return _tourismBonaAttractionFormFirstLocalService.
			getTourismBonaAttractionFormFirstsCount();
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormFirst gettourismById(
			long tourismApplicationId) {

		return _tourismBonaAttractionFormFirstLocalService.gettourismById(
			tourismApplicationId);
	}

	/**
	 * Updates the tourism bona attraction form first in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionFormFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttractionFormFirst the tourism bona attraction form first
	 * @return the tourism bona attraction form first that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormFirst updateTourismBonaAttractionFormFirst(
			com.nbp.tourism.application.form.services.model.
				TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst) {

		return _tourismBonaAttractionFormFirstLocalService.
			updateTourismBonaAttractionFormFirst(
				tourismBonaAttractionFormFirst);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaAttractionFormFirstLocalService.getBasePersistence();
	}

	@Override
	public TourismBonaAttractionFormFirstLocalService getWrappedService() {
		return _tourismBonaAttractionFormFirstLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaAttractionFormFirstLocalService
			tourismBonaAttractionFormFirstLocalService) {

		_tourismBonaAttractionFormFirstLocalService =
			tourismBonaAttractionFormFirstLocalService;
	}

	private TourismBonaAttractionFormFirstLocalService
		_tourismBonaAttractionFormFirstLocalService;

}