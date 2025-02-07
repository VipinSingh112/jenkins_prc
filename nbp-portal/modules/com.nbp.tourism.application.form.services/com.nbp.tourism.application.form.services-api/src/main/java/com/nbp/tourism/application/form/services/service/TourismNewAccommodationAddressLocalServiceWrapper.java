/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismNewAccommodationAddressLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccommodationAddressLocalService
 * @generated
 */
public class TourismNewAccommodationAddressLocalServiceWrapper
	implements ServiceWrapper<TourismNewAccommodationAddressLocalService>,
			   TourismNewAccommodationAddressLocalService {

	public TourismNewAccommodationAddressLocalServiceWrapper() {
		this(null);
	}

	public TourismNewAccommodationAddressLocalServiceWrapper(
		TourismNewAccommodationAddressLocalService
			tourismNewAccommodationAddressLocalService) {

		_tourismNewAccommodationAddressLocalService =
			tourismNewAccommodationAddressLocalService;
	}

	/**
	 * Adds the tourism new accommodation address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAccommodationAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAccommodationAddress the tourism new accommodation address
	 * @return the tourism new accommodation address that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAccommodationAddress addTourismNewAccommodationAddress(
			com.nbp.tourism.application.form.services.model.
				TourismNewAccommodationAddress tourismNewAccommodationAddress) {

		return _tourismNewAccommodationAddressLocalService.
			addTourismNewAccommodationAddress(tourismNewAccommodationAddress);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccommodationAddressLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new tourism new accommodation address with the primary key. Does not add the tourism new accommodation address to the database.
	 *
	 * @param tourismNewAccommodationAOOId the primary key for the new tourism new accommodation address
	 * @return the new tourism new accommodation address
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAccommodationAddress createTourismNewAccommodationAddress(
			long tourismNewAccommodationAOOId) {

		return _tourismNewAccommodationAddressLocalService.
			createTourismNewAccommodationAddress(tourismNewAccommodationAOOId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccommodationAddressLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the tourism new accommodation address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAccommodationAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAccommodationAOOId the primary key of the tourism new accommodation address
	 * @return the tourism new accommodation address that was removed
	 * @throws PortalException if a tourism new accommodation address with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAccommodationAddress deleteTourismNewAccommodationAddress(
				long tourismNewAccommodationAOOId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccommodationAddressLocalService.
			deleteTourismNewAccommodationAddress(tourismNewAccommodationAOOId);
	}

	/**
	 * Deletes the tourism new accommodation address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAccommodationAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAccommodationAddress the tourism new accommodation address
	 * @return the tourism new accommodation address that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAccommodationAddress deleteTourismNewAccommodationAddress(
			com.nbp.tourism.application.form.services.model.
				TourismNewAccommodationAddress tourismNewAccommodationAddress) {

		return _tourismNewAccommodationAddressLocalService.
			deleteTourismNewAccommodationAddress(
				tourismNewAccommodationAddress);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismNewAccommodationAddressLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismNewAccommodationAddressLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismNewAccommodationAddressLocalService.dynamicQuery();
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

		return _tourismNewAccommodationAddressLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAccommodationAddressModelImpl</code>.
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

		return _tourismNewAccommodationAddressLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAccommodationAddressModelImpl</code>.
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

		return _tourismNewAccommodationAddressLocalService.dynamicQuery(
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

		return _tourismNewAccommodationAddressLocalService.dynamicQueryCount(
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

		return _tourismNewAccommodationAddressLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAccommodationAddress fetchTourismNewAccommodationAddress(
			long tourismNewAccommodationAOOId) {

		return _tourismNewAccommodationAddressLocalService.
			fetchTourismNewAccommodationAddress(tourismNewAccommodationAOOId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismNewAccommodationAddressLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismNewAccommodationAddressLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewAccommodationAddressLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccommodationAddressLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAccommodationAddress getTN_A_At(
			String addressType, long tourismNewAccoFormId) {

		return _tourismNewAccommodationAddressLocalService.getTN_A_At(
			addressType, tourismNewAccoFormId);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAccommodationAddress getTourismById(
			long tourismApplicationId) {

		return _tourismNewAccommodationAddressLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Returns the tourism new accommodation address with the primary key.
	 *
	 * @param tourismNewAccommodationAOOId the primary key of the tourism new accommodation address
	 * @return the tourism new accommodation address
	 * @throws PortalException if a tourism new accommodation address with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAccommodationAddress getTourismNewAccommodationAddress(
				long tourismNewAccommodationAOOId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAccommodationAddressLocalService.
			getTourismNewAccommodationAddress(tourismNewAccommodationAOOId);
	}

	/**
	 * Returns a range of all the tourism new accommodation addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAccommodationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accommodation addresses
	 * @param end the upper bound of the range of tourism new accommodation addresses (not inclusive)
	 * @return the range of tourism new accommodation addresses
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismNewAccommodationAddress> getTourismNewAccommodationAddresses(
				int start, int end) {

		return _tourismNewAccommodationAddressLocalService.
			getTourismNewAccommodationAddresses(start, end);
	}

	/**
	 * Returns the number of tourism new accommodation addresses.
	 *
	 * @return the number of tourism new accommodation addresses
	 */
	@Override
	public int getTourismNewAccommodationAddressesCount() {
		return _tourismNewAccommodationAddressLocalService.
			getTourismNewAccommodationAddressesCount();
	}

	/**
	 * Updates the tourism new accommodation address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAccommodationAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAccommodationAddress the tourism new accommodation address
	 * @return the tourism new accommodation address that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAccommodationAddress updateTourismNewAccommodationAddress(
			com.nbp.tourism.application.form.services.model.
				TourismNewAccommodationAddress tourismNewAccommodationAddress) {

		return _tourismNewAccommodationAddressLocalService.
			updateTourismNewAccommodationAddress(
				tourismNewAccommodationAddress);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismNewAccommodationAddressLocalService.getBasePersistence();
	}

	@Override
	public TourismNewAccommodationAddressLocalService getWrappedService() {
		return _tourismNewAccommodationAddressLocalService;
	}

	@Override
	public void setWrappedService(
		TourismNewAccommodationAddressLocalService
			tourismNewAccommodationAddressLocalService) {

		_tourismNewAccommodationAddressLocalService =
			tourismNewAccommodationAddressLocalService;
	}

	private TourismNewAccommodationAddressLocalService
		_tourismNewAccommodationAddressLocalService;

}