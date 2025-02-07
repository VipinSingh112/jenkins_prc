/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismNewAnnualEarningsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAnnualEarningsLocalService
 * @generated
 */
public class TourismNewAnnualEarningsLocalServiceWrapper
	implements ServiceWrapper<TourismNewAnnualEarningsLocalService>,
			   TourismNewAnnualEarningsLocalService {

	public TourismNewAnnualEarningsLocalServiceWrapper() {
		this(null);
	}

	public TourismNewAnnualEarningsLocalServiceWrapper(
		TourismNewAnnualEarningsLocalService
			tourismNewAnnualEarningsLocalService) {

		_tourismNewAnnualEarningsLocalService =
			tourismNewAnnualEarningsLocalService;
	}

	/**
	 * Adds the tourism new annual earnings to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAnnualEarningsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAnnualEarnings the tourism new annual earnings
	 * @return the tourism new annual earnings that was added
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewAnnualEarnings
			addTourismNewAnnualEarnings(
				com.nbp.tourism.application.form.services.model.
					TourismNewAnnualEarnings tourismNewAnnualEarnings) {

		return _tourismNewAnnualEarningsLocalService.
			addTourismNewAnnualEarnings(tourismNewAnnualEarnings);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAnnualEarningsLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism new annual earnings with the primary key. Does not add the tourism new annual earnings to the database.
	 *
	 * @param tourismNewAnnualEarningsId the primary key for the new tourism new annual earnings
	 * @return the new tourism new annual earnings
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewAnnualEarnings
			createTourismNewAnnualEarnings(long tourismNewAnnualEarningsId) {

		return _tourismNewAnnualEarningsLocalService.
			createTourismNewAnnualEarnings(tourismNewAnnualEarningsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAnnualEarningsLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism new annual earnings with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAnnualEarningsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAnnualEarningsId the primary key of the tourism new annual earnings
	 * @return the tourism new annual earnings that was removed
	 * @throws PortalException if a tourism new annual earnings with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewAnnualEarnings
				deleteTourismNewAnnualEarnings(long tourismNewAnnualEarningsId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAnnualEarningsLocalService.
			deleteTourismNewAnnualEarnings(tourismNewAnnualEarningsId);
	}

	/**
	 * Deletes the tourism new annual earnings from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAnnualEarningsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAnnualEarnings the tourism new annual earnings
	 * @return the tourism new annual earnings that was removed
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewAnnualEarnings
			deleteTourismNewAnnualEarnings(
				com.nbp.tourism.application.form.services.model.
					TourismNewAnnualEarnings tourismNewAnnualEarnings) {

		return _tourismNewAnnualEarningsLocalService.
			deleteTourismNewAnnualEarnings(tourismNewAnnualEarnings);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismNewAnnualEarningsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismNewAnnualEarningsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismNewAnnualEarningsLocalService.dynamicQuery();
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

		return _tourismNewAnnualEarningsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAnnualEarningsModelImpl</code>.
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

		return _tourismNewAnnualEarningsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAnnualEarningsModelImpl</code>.
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

		return _tourismNewAnnualEarningsLocalService.dynamicQuery(
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

		return _tourismNewAnnualEarningsLocalService.dynamicQueryCount(
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

		return _tourismNewAnnualEarningsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewAnnualEarnings
			fetchTourismNewAnnualEarnings(long tourismNewAnnualEarningsId) {

		return _tourismNewAnnualEarningsLocalService.
			fetchTourismNewAnnualEarnings(tourismNewAnnualEarningsId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismNewAnnualEarningsLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismNewAnnualEarningsLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewAnnualEarningsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAnnualEarningsLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewAnnualEarnings
				getTourismById(long tourismApplicationId)
			throws com.nbp.tourism.application.form.services.exception.
				NoSuchTourismNewAnnualEarningsException {

		return _tourismNewAnnualEarningsLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Returns the tourism new annual earnings with the primary key.
	 *
	 * @param tourismNewAnnualEarningsId the primary key of the tourism new annual earnings
	 * @return the tourism new annual earnings
	 * @throws PortalException if a tourism new annual earnings with the primary key could not be found
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewAnnualEarnings
				getTourismNewAnnualEarnings(long tourismNewAnnualEarningsId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAnnualEarningsLocalService.
			getTourismNewAnnualEarnings(tourismNewAnnualEarningsId);
	}

	/**
	 * Returns a range of all the tourism new annual earningses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAnnualEarningsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new annual earningses
	 * @param end the upper bound of the range of tourism new annual earningses (not inclusive)
	 * @return the range of tourism new annual earningses
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismNewAnnualEarnings> getTourismNewAnnualEarningses(
				int start, int end) {

		return _tourismNewAnnualEarningsLocalService.
			getTourismNewAnnualEarningses(start, end);
	}

	/**
	 * Returns the number of tourism new annual earningses.
	 *
	 * @return the number of tourism new annual earningses
	 */
	@Override
	public int getTourismNewAnnualEarningsesCount() {
		return _tourismNewAnnualEarningsLocalService.
			getTourismNewAnnualEarningsesCount();
	}

	/**
	 * Updates the tourism new annual earnings in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAnnualEarningsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAnnualEarnings the tourism new annual earnings
	 * @return the tourism new annual earnings that was updated
	 */
	@Override
	public
		com.nbp.tourism.application.form.services.model.TourismNewAnnualEarnings
			updateTourismNewAnnualEarnings(
				com.nbp.tourism.application.form.services.model.
					TourismNewAnnualEarnings tourismNewAnnualEarnings) {

		return _tourismNewAnnualEarningsLocalService.
			updateTourismNewAnnualEarnings(tourismNewAnnualEarnings);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismNewAnnualEarningsLocalService.getBasePersistence();
	}

	@Override
	public TourismNewAnnualEarningsLocalService getWrappedService() {
		return _tourismNewAnnualEarningsLocalService;
	}

	@Override
	public void setWrappedService(
		TourismNewAnnualEarningsLocalService
			tourismNewAnnualEarningsLocalService) {

		_tourismNewAnnualEarningsLocalService =
			tourismNewAnnualEarningsLocalService;
	}

	private TourismNewAnnualEarningsLocalService
		_tourismNewAnnualEarningsLocalService;

}