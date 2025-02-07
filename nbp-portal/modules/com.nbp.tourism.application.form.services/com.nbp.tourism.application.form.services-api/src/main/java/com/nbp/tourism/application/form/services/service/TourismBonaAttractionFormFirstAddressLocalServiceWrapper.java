/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaAttractionFormFirstAddressLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionFormFirstAddressLocalService
 * @generated
 */
public class TourismBonaAttractionFormFirstAddressLocalServiceWrapper
	implements ServiceWrapper
		<TourismBonaAttractionFormFirstAddressLocalService>,
			   TourismBonaAttractionFormFirstAddressLocalService {

	public TourismBonaAttractionFormFirstAddressLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaAttractionFormFirstAddressLocalServiceWrapper(
		TourismBonaAttractionFormFirstAddressLocalService
			tourismBonaAttractionFormFirstAddressLocalService) {

		_tourismBonaAttractionFormFirstAddressLocalService =
			tourismBonaAttractionFormFirstAddressLocalService;
	}

	/**
	 * Adds the tourism bona attraction form first address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionFormFirstAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttractionFormFirstAddress the tourism bona attraction form first address
	 * @return the tourism bona attraction form first address that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormFirstAddress
			addTourismBonaAttractionFormFirstAddress(
				com.nbp.tourism.application.form.services.model.
					TourismBonaAttractionFormFirstAddress
						tourismBonaAttractionFormFirstAddress) {

		return _tourismBonaAttractionFormFirstAddressLocalService.
			addTourismBonaAttractionFormFirstAddress(
				tourismBonaAttractionFormFirstAddress);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionFormFirstAddressLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona attraction form first address with the primary key. Does not add the tourism bona attraction form first address to the database.
	 *
	 * @param tourismBonaAttractionFFAOOId the primary key for the new tourism bona attraction form first address
	 * @return the new tourism bona attraction form first address
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormFirstAddress
			createTourismBonaAttractionFormFirstAddress(
				long tourismBonaAttractionFFAOOId) {

		return _tourismBonaAttractionFormFirstAddressLocalService.
			createTourismBonaAttractionFormFirstAddress(
				tourismBonaAttractionFFAOOId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionFormFirstAddressLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the tourism bona attraction form first address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionFormFirstAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttractionFFAOOId the primary key of the tourism bona attraction form first address
	 * @return the tourism bona attraction form first address that was removed
	 * @throws PortalException if a tourism bona attraction form first address with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormFirstAddress
				deleteTourismBonaAttractionFormFirstAddress(
					long tourismBonaAttractionFFAOOId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionFormFirstAddressLocalService.
			deleteTourismBonaAttractionFormFirstAddress(
				tourismBonaAttractionFFAOOId);
	}

	/**
	 * Deletes the tourism bona attraction form first address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionFormFirstAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttractionFormFirstAddress the tourism bona attraction form first address
	 * @return the tourism bona attraction form first address that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormFirstAddress
			deleteTourismBonaAttractionFormFirstAddress(
				com.nbp.tourism.application.form.services.model.
					TourismBonaAttractionFormFirstAddress
						tourismBonaAttractionFormFirstAddress) {

		return _tourismBonaAttractionFormFirstAddressLocalService.
			deleteTourismBonaAttractionFormFirstAddress(
				tourismBonaAttractionFormFirstAddress);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaAttractionFormFirstAddressLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaAttractionFormFirstAddressLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaAttractionFormFirstAddressLocalService.
			dynamicQuery();
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

		return _tourismBonaAttractionFormFirstAddressLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormFirstAddressModelImpl</code>.
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

		return _tourismBonaAttractionFormFirstAddressLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormFirstAddressModelImpl</code>.
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

		return _tourismBonaAttractionFormFirstAddressLocalService.dynamicQuery(
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

		return _tourismBonaAttractionFormFirstAddressLocalService.
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

		return _tourismBonaAttractionFormFirstAddressLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormFirstAddress
			fetchTourismBonaAttractionFormFirstAddress(
				long tourismBonaAttractionFFAOOId) {

		return _tourismBonaAttractionFormFirstAddressLocalService.
			fetchTourismBonaAttractionFormFirstAddress(
				tourismBonaAttractionFFAOOId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaAttractionFormFirstAddressLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaAttractionFormFirstAddressLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaAttractionFormFirstAddressLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionFormFirstAddressLocalService.
			getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormFirstAddress getTB_Attract_AT(
			String addressType, long tourismBonaAttractFormFirstId) {

		return _tourismBonaAttractionFormFirstAddressLocalService.
			getTB_Attract_AT(addressType, tourismBonaAttractFormFirstId);
	}

	/**
	 * Returns the tourism bona attraction form first address with the primary key.
	 *
	 * @param tourismBonaAttractionFFAOOId the primary key of the tourism bona attraction form first address
	 * @return the tourism bona attraction form first address
	 * @throws PortalException if a tourism bona attraction form first address with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormFirstAddress
				getTourismBonaAttractionFormFirstAddress(
					long tourismBonaAttractionFFAOOId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAttractionFormFirstAddressLocalService.
			getTourismBonaAttractionFormFirstAddress(
				tourismBonaAttractionFFAOOId);
	}

	/**
	 * Returns a range of all the tourism bona attraction form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form first addresses
	 * @param end the upper bound of the range of tourism bona attraction form first addresses (not inclusive)
	 * @return the range of tourism bona attraction form first addresses
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaAttractionFormFirstAddress>
				getTourismBonaAttractionFormFirstAddresses(int start, int end) {

		return _tourismBonaAttractionFormFirstAddressLocalService.
			getTourismBonaAttractionFormFirstAddresses(start, end);
	}

	/**
	 * Returns the number of tourism bona attraction form first addresses.
	 *
	 * @return the number of tourism bona attraction form first addresses
	 */
	@Override
	public int getTourismBonaAttractionFormFirstAddressesCount() {
		return _tourismBonaAttractionFormFirstAddressLocalService.
			getTourismBonaAttractionFormFirstAddressesCount();
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormFirstAddress getTourismById(
			long tourismApplicationId) {

		return _tourismBonaAttractionFormFirstAddressLocalService.
			getTourismById(tourismApplicationId);
	}

	/**
	 * Updates the tourism bona attraction form first address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAttractionFormFirstAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAttractionFormFirstAddress the tourism bona attraction form first address
	 * @return the tourism bona attraction form first address that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAttractionFormFirstAddress
			updateTourismBonaAttractionFormFirstAddress(
				com.nbp.tourism.application.form.services.model.
					TourismBonaAttractionFormFirstAddress
						tourismBonaAttractionFormFirstAddress) {

		return _tourismBonaAttractionFormFirstAddressLocalService.
			updateTourismBonaAttractionFormFirstAddress(
				tourismBonaAttractionFormFirstAddress);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaAttractionFormFirstAddressLocalService.
			getBasePersistence();
	}

	@Override
	public TourismBonaAttractionFormFirstAddressLocalService
		getWrappedService() {

		return _tourismBonaAttractionFormFirstAddressLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaAttractionFormFirstAddressLocalService
			tourismBonaAttractionFormFirstAddressLocalService) {

		_tourismBonaAttractionFormFirstAddressLocalService =
			tourismBonaAttractionFormFirstAddressLocalService;
	}

	private TourismBonaAttractionFormFirstAddressLocalService
		_tourismBonaAttractionFormFirstAddressLocalService;

}