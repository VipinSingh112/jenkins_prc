/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismNewAttractionFormFirstAddressLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormFirstAddressLocalService
 * @generated
 */
public class TourismNewAttractionFormFirstAddressLocalServiceWrapper
	implements ServiceWrapper<TourismNewAttractionFormFirstAddressLocalService>,
			   TourismNewAttractionFormFirstAddressLocalService {

	public TourismNewAttractionFormFirstAddressLocalServiceWrapper() {
		this(null);
	}

	public TourismNewAttractionFormFirstAddressLocalServiceWrapper(
		TourismNewAttractionFormFirstAddressLocalService
			tourismNewAttractionFormFirstAddressLocalService) {

		_tourismNewAttractionFormFirstAddressLocalService =
			tourismNewAttractionFormFirstAddressLocalService;
	}

	/**
	 * Adds the tourism new attraction form first address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionFormFirstAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionFormFirstAddress the tourism new attraction form first address
	 * @return the tourism new attraction form first address that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormFirstAddress
			addTourismNewAttractionFormFirstAddress(
				com.nbp.tourism.application.form.services.model.
					TourismNewAttractionFormFirstAddress
						tourismNewAttractionFormFirstAddress) {

		return _tourismNewAttractionFormFirstAddressLocalService.
			addTourismNewAttractionFormFirstAddress(
				tourismNewAttractionFormFirstAddress);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionFormFirstAddressLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tourism new attraction form first address with the primary key. Does not add the tourism new attraction form first address to the database.
	 *
	 * @param tourismNewAttractionFormFAOOId the primary key for the new tourism new attraction form first address
	 * @return the new tourism new attraction form first address
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormFirstAddress
			createTourismNewAttractionFormFirstAddress(
				long tourismNewAttractionFormFAOOId) {

		return _tourismNewAttractionFormFirstAddressLocalService.
			createTourismNewAttractionFormFirstAddress(
				tourismNewAttractionFormFAOOId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionFormFirstAddressLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the tourism new attraction form first address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionFormFirstAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionFormFAOOId the primary key of the tourism new attraction form first address
	 * @return the tourism new attraction form first address that was removed
	 * @throws PortalException if a tourism new attraction form first address with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormFirstAddress
				deleteTourismNewAttractionFormFirstAddress(
					long tourismNewAttractionFormFAOOId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionFormFirstAddressLocalService.
			deleteTourismNewAttractionFormFirstAddress(
				tourismNewAttractionFormFAOOId);
	}

	/**
	 * Deletes the tourism new attraction form first address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionFormFirstAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionFormFirstAddress the tourism new attraction form first address
	 * @return the tourism new attraction form first address that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormFirstAddress
			deleteTourismNewAttractionFormFirstAddress(
				com.nbp.tourism.application.form.services.model.
					TourismNewAttractionFormFirstAddress
						tourismNewAttractionFormFirstAddress) {

		return _tourismNewAttractionFormFirstAddressLocalService.
			deleteTourismNewAttractionFormFirstAddress(
				tourismNewAttractionFormFirstAddress);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismNewAttractionFormFirstAddressLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismNewAttractionFormFirstAddressLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismNewAttractionFormFirstAddressLocalService.dynamicQuery();
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

		return _tourismNewAttractionFormFirstAddressLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormFirstAddressModelImpl</code>.
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

		return _tourismNewAttractionFormFirstAddressLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormFirstAddressModelImpl</code>.
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

		return _tourismNewAttractionFormFirstAddressLocalService.dynamicQuery(
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

		return _tourismNewAttractionFormFirstAddressLocalService.
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

		return _tourismNewAttractionFormFirstAddressLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormFirstAddress
			fetchTourismNewAttractionFormFirstAddress(
				long tourismNewAttractionFormFAOOId) {

		return _tourismNewAttractionFormFirstAddressLocalService.
			fetchTourismNewAttractionFormFirstAddress(
				tourismNewAttractionFormFAOOId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismNewAttractionFormFirstAddressLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismNewAttractionFormFirstAddressLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismNewAttractionFormFirstAddressLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionFormFirstAddressLocalService.
			getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormFirstAddress getTN_Attract_AT(
			String addressType, long tourismNewAttractFormFirstId) {

		return _tourismNewAttractionFormFirstAddressLocalService.
			getTN_Attract_AT(addressType, tourismNewAttractFormFirstId);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormFirstAddress getTourismById(
			long tourismApplicationId) {

		return _tourismNewAttractionFormFirstAddressLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Returns the tourism new attraction form first address with the primary key.
	 *
	 * @param tourismNewAttractionFormFAOOId the primary key of the tourism new attraction form first address
	 * @return the tourism new attraction form first address
	 * @throws PortalException if a tourism new attraction form first address with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormFirstAddress
				getTourismNewAttractionFormFirstAddress(
					long tourismNewAttractionFormFAOOId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismNewAttractionFormFirstAddressLocalService.
			getTourismNewAttractionFormFirstAddress(
				tourismNewAttractionFormFAOOId);
	}

	/**
	 * Returns a range of all the tourism new attraction form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form first addresses
	 * @param end the upper bound of the range of tourism new attraction form first addresses (not inclusive)
	 * @return the range of tourism new attraction form first addresses
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismNewAttractionFormFirstAddress>
				getTourismNewAttractionFormFirstAddresses(int start, int end) {

		return _tourismNewAttractionFormFirstAddressLocalService.
			getTourismNewAttractionFormFirstAddresses(start, end);
	}

	/**
	 * Returns the number of tourism new attraction form first addresses.
	 *
	 * @return the number of tourism new attraction form first addresses
	 */
	@Override
	public int getTourismNewAttractionFormFirstAddressesCount() {
		return _tourismNewAttractionFormFirstAddressLocalService.
			getTourismNewAttractionFormFirstAddressesCount();
	}

	/**
	 * Updates the tourism new attraction form first address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismNewAttractionFormFirstAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismNewAttractionFormFirstAddress the tourism new attraction form first address
	 * @return the tourism new attraction form first address that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismNewAttractionFormFirstAddress
			updateTourismNewAttractionFormFirstAddress(
				com.nbp.tourism.application.form.services.model.
					TourismNewAttractionFormFirstAddress
						tourismNewAttractionFormFirstAddress) {

		return _tourismNewAttractionFormFirstAddressLocalService.
			updateTourismNewAttractionFormFirstAddress(
				tourismNewAttractionFormFirstAddress);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismNewAttractionFormFirstAddressLocalService.
			getBasePersistence();
	}

	@Override
	public TourismNewAttractionFormFirstAddressLocalService
		getWrappedService() {

		return _tourismNewAttractionFormFirstAddressLocalService;
	}

	@Override
	public void setWrappedService(
		TourismNewAttractionFormFirstAddressLocalService
			tourismNewAttractionFormFirstAddressLocalService) {

		_tourismNewAttractionFormFirstAddressLocalService =
			tourismNewAttractionFormFirstAddressLocalService;
	}

	private TourismNewAttractionFormFirstAddressLocalService
		_tourismNewAttractionFormFirstAddressLocalService;

}