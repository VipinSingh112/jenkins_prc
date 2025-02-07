/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismNewAttractionFormFirstLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormFirstLocalService
 * @generated
 */
public class TourismNewAttractionFormFirstLocalServiceWrapper
	implements ServiceWrapper<TourismNewAttractionFormFirstLocalService>,
			   TourismNewAttractionFormFirstLocalService {

	public TourismNewAttractionFormFirstLocalServiceWrapper() {
		this(null);
	}

	public TourismNewAttractionFormFirstLocalServiceWrapper(
		TourismNewAttractionFormFirstLocalService
			tourismNewAttractionFormFirstLocalService) {

		_tourismNewAttractionFormFirstLocalService =
			tourismNewAttractionFormFirstLocalService;
	}

	/**
	 * Adds the tourism new attraction form first to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionFormFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionFormFirst the tourism new attraction form first
	 * @return the tourism new attraction form first that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormFirst addTourismNewAttractionFormFirst(
			com.nbp.tourism.application.form.services.model.
				TourismNewAttractionFormFirst tourismNewAttractionFormFirst) {

		return _tourismNewAttractionFormFirstLocalService.
			addTourismNewAttractionFormFirst(tourismNewAttractionFormFirst);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionFormFirstLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism new attraction form first with the primary key. Does not add the tourism new attraction form first to the database.
	 *
	 * @param tourismNewAttractFormFirstId the primary key for the new tourism new attraction form first
	 * @return the new tourism new attraction form first
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormFirst createTourismNewAttractionFormFirst(
			long tourismNewAttractFormFirstId) {

		return _tourismNewAttractionFormFirstLocalService.
			createTourismNewAttractionFormFirst(tourismNewAttractFormFirstId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionFormFirstLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism new attraction form first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionFormFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractFormFirstId the primary key of the tourism new attraction form first
	 * @return the tourism new attraction form first that was removed
	 * @throws PortalException if a tourism new attraction form first with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormFirst deleteTourismNewAttractionFormFirst(
				long tourismNewAttractFormFirstId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionFormFirstLocalService.
			deleteTourismNewAttractionFormFirst(tourismNewAttractFormFirstId);
	}

	/**
	 * Deletes the tourism new attraction form first from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionFormFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionFormFirst the tourism new attraction form first
	 * @return the tourism new attraction form first that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormFirst deleteTourismNewAttractionFormFirst(
			com.nbp.tourism.application.form.services.model.
				TourismNewAttractionFormFirst tourismNewAttractionFormFirst) {

		return _tourismNewAttractionFormFirstLocalService.
			deleteTourismNewAttractionFormFirst(tourismNewAttractionFormFirst);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismNewAttractionFormFirstLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismNewAttractionFormFirstLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismNewAttractionFormFirstLocalService.dynamicQuery();
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

		return _tourismNewAttractionFormFirstLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormFirstModelImpl</code>.
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

		return _tourismNewAttractionFormFirstLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormFirstModelImpl</code>.
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

		return _tourismNewAttractionFormFirstLocalService.dynamicQuery(
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

		return _tourismNewAttractionFormFirstLocalService.dynamicQueryCount(
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

		return _tourismNewAttractionFormFirstLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormFirst fetchTourismNewAttractionFormFirst(
			long tourismNewAttractFormFirstId) {

		return _tourismNewAttractionFormFirstLocalService.
			fetchTourismNewAttractionFormFirst(tourismNewAttractFormFirstId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismNewAttractionFormFirstLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismNewAttractionFormFirstLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewAttractionFormFirstLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionFormFirstLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormFirst getTourimsById(
			long tourismApplicationId) {

		return _tourismNewAttractionFormFirstLocalService.getTourimsById(
			tourismApplicationId);
	}

	/**
	 * Returns the tourism new attraction form first with the primary key.
	 *
	 * @param tourismNewAttractFormFirstId the primary key of the tourism new attraction form first
	 * @return the tourism new attraction form first
	 * @throws PortalException if a tourism new attraction form first with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormFirst getTourismNewAttractionFormFirst(
				long tourismNewAttractFormFirstId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionFormFirstLocalService.
			getTourismNewAttractionFormFirst(tourismNewAttractFormFirstId);
	}

	/**
	 * Returns a range of all the tourism new attraction form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form firsts
	 * @param end the upper bound of the range of tourism new attraction form firsts (not inclusive)
	 * @return the range of tourism new attraction form firsts
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismNewAttractionFormFirst> getTourismNewAttractionFormFirsts(
				int start, int end) {

		return _tourismNewAttractionFormFirstLocalService.
			getTourismNewAttractionFormFirsts(start, end);
	}

	/**
	 * Returns the number of tourism new attraction form firsts.
	 *
	 * @return the number of tourism new attraction form firsts
	 */
	@Override
	public int getTourismNewAttractionFormFirstsCount() {
		return _tourismNewAttractionFormFirstLocalService.
			getTourismNewAttractionFormFirstsCount();
	}

	/**
	 * Updates the tourism new attraction form first in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionFormFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionFormFirst the tourism new attraction form first
	 * @return the tourism new attraction form first that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormFirst updateTourismNewAttractionFormFirst(
			com.nbp.tourism.application.form.services.model.
				TourismNewAttractionFormFirst tourismNewAttractionFormFirst) {

		return _tourismNewAttractionFormFirstLocalService.
			updateTourismNewAttractionFormFirst(tourismNewAttractionFormFirst);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismNewAttractionFormFirstLocalService.getBasePersistence();
	}

	@Override
	public TourismNewAttractionFormFirstLocalService getWrappedService() {
		return _tourismNewAttractionFormFirstLocalService;
	}

	@Override
	public void setWrappedService(
		TourismNewAttractionFormFirstLocalService
			tourismNewAttractionFormFirstLocalService) {

		_tourismNewAttractionFormFirstLocalService =
			tourismNewAttractionFormFirstLocalService;
	}

	private TourismNewAttractionFormFirstLocalService
		_tourismNewAttractionFormFirstLocalService;

}