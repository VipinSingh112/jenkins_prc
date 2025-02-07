/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaWaterSportsFormFirstAddressLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportsFormFirstAddressLocalService
 * @generated
 */
public class TourismBonaWaterSportsFormFirstAddressLocalServiceWrapper
	implements ServiceWrapper
		<TourismBonaWaterSportsFormFirstAddressLocalService>,
			   TourismBonaWaterSportsFormFirstAddressLocalService {

	public TourismBonaWaterSportsFormFirstAddressLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaWaterSportsFormFirstAddressLocalServiceWrapper(
		TourismBonaWaterSportsFormFirstAddressLocalService
			tourismBonaWaterSportsFormFirstAddressLocalService) {

		_tourismBonaWaterSportsFormFirstAddressLocalService =
			tourismBonaWaterSportsFormFirstAddressLocalService;
	}

	/**
	 * Adds the tourism bona water sports form first address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportsFormFirstAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWaterSportsFormFirstAddress the tourism bona water sports form first address
	 * @return the tourism bona water sports form first address that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormFirstAddress
			addTourismBonaWaterSportsFormFirstAddress(
				com.nbp.tourism.application.form.services.model.
					TourismBonaWaterSportsFormFirstAddress
						tourismBonaWaterSportsFormFirstAddress) {

		return _tourismBonaWaterSportsFormFirstAddressLocalService.
			addTourismBonaWaterSportsFormFirstAddress(
				tourismBonaWaterSportsFormFirstAddress);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportsFormFirstAddressLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona water sports form first address with the primary key. Does not add the tourism bona water sports form first address to the database.
	 *
	 * @param tourismBonaWaterSportsFFAId the primary key for the new tourism bona water sports form first address
	 * @return the new tourism bona water sports form first address
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormFirstAddress
			createTourismBonaWaterSportsFormFirstAddress(
				long tourismBonaWaterSportsFFAId) {

		return _tourismBonaWaterSportsFormFirstAddressLocalService.
			createTourismBonaWaterSportsFormFirstAddress(
				tourismBonaWaterSportsFFAId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportsFormFirstAddressLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the tourism bona water sports form first address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportsFormFirstAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWaterSportsFFAId the primary key of the tourism bona water sports form first address
	 * @return the tourism bona water sports form first address that was removed
	 * @throws PortalException if a tourism bona water sports form first address with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormFirstAddress
				deleteTourismBonaWaterSportsFormFirstAddress(
					long tourismBonaWaterSportsFFAId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportsFormFirstAddressLocalService.
			deleteTourismBonaWaterSportsFormFirstAddress(
				tourismBonaWaterSportsFFAId);
	}

	/**
	 * Deletes the tourism bona water sports form first address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportsFormFirstAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWaterSportsFormFirstAddress the tourism bona water sports form first address
	 * @return the tourism bona water sports form first address that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormFirstAddress
			deleteTourismBonaWaterSportsFormFirstAddress(
				com.nbp.tourism.application.form.services.model.
					TourismBonaWaterSportsFormFirstAddress
						tourismBonaWaterSportsFormFirstAddress) {

		return _tourismBonaWaterSportsFormFirstAddressLocalService.
			deleteTourismBonaWaterSportsFormFirstAddress(
				tourismBonaWaterSportsFormFirstAddress);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaWaterSportsFormFirstAddressLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaWaterSportsFormFirstAddressLocalService.
			dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaWaterSportsFormFirstAddressLocalService.
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

		return _tourismBonaWaterSportsFormFirstAddressLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportsFormFirstAddressModelImpl</code>.
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

		return _tourismBonaWaterSportsFormFirstAddressLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportsFormFirstAddressModelImpl</code>.
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

		return _tourismBonaWaterSportsFormFirstAddressLocalService.dynamicQuery(
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

		return _tourismBonaWaterSportsFormFirstAddressLocalService.
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

		return _tourismBonaWaterSportsFormFirstAddressLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormFirstAddress
			fetchTourismBonaWaterSportsFormFirstAddress(
				long tourismBonaWaterSportsFFAId) {

		return _tourismBonaWaterSportsFormFirstAddressLocalService.
			fetchTourismBonaWaterSportsFormFirstAddress(
				tourismBonaWaterSportsFFAId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaWaterSportsFormFirstAddressLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaWaterSportsFormFirstAddressLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaWaterSportsFormFirstAddressLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportsFormFirstAddressLocalService.
			getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormFirstAddress getTB_Water_AT(
			String addressType, long tourismBonaWaterSFFirstId) {

		return _tourismBonaWaterSportsFormFirstAddressLocalService.
			getTB_Water_AT(addressType, tourismBonaWaterSFFirstId);
	}

	/**
	 * Returns the tourism bona water sports form first address with the primary key.
	 *
	 * @param tourismBonaWaterSportsFFAId the primary key of the tourism bona water sports form first address
	 * @return the tourism bona water sports form first address
	 * @throws PortalException if a tourism bona water sports form first address with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormFirstAddress
				getTourismBonaWaterSportsFormFirstAddress(
					long tourismBonaWaterSportsFFAId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaWaterSportsFormFirstAddressLocalService.
			getTourismBonaWaterSportsFormFirstAddress(
				tourismBonaWaterSportsFFAId);
	}

	/**
	 * Returns a range of all the tourism bona water sports form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportsFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form first addresses
	 * @param end the upper bound of the range of tourism bona water sports form first addresses (not inclusive)
	 * @return the range of tourism bona water sports form first addresses
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaWaterSportsFormFirstAddress>
				getTourismBonaWaterSportsFormFirstAddresses(
					int start, int end) {

		return _tourismBonaWaterSportsFormFirstAddressLocalService.
			getTourismBonaWaterSportsFormFirstAddresses(start, end);
	}

	/**
	 * Returns the number of tourism bona water sports form first addresses.
	 *
	 * @return the number of tourism bona water sports form first addresses
	 */
	@Override
	public int getTourismBonaWaterSportsFormFirstAddressesCount() {
		return _tourismBonaWaterSportsFormFirstAddressLocalService.
			getTourismBonaWaterSportsFormFirstAddressesCount();
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormFirstAddress getTourismById(
			long tourismApplicationId) {

		return _tourismBonaWaterSportsFormFirstAddressLocalService.
			getTourismById(tourismApplicationId);
	}

	/**
	 * Updates the tourism bona water sports form first address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaWaterSportsFormFirstAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaWaterSportsFormFirstAddress the tourism bona water sports form first address
	 * @return the tourism bona water sports form first address that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaWaterSportsFormFirstAddress
			updateTourismBonaWaterSportsFormFirstAddress(
				com.nbp.tourism.application.form.services.model.
					TourismBonaWaterSportsFormFirstAddress
						tourismBonaWaterSportsFormFirstAddress) {

		return _tourismBonaWaterSportsFormFirstAddressLocalService.
			updateTourismBonaWaterSportsFormFirstAddress(
				tourismBonaWaterSportsFormFirstAddress);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaWaterSportsFormFirstAddressLocalService.
			getBasePersistence();
	}

	@Override
	public TourismBonaWaterSportsFormFirstAddressLocalService
		getWrappedService() {

		return _tourismBonaWaterSportsFormFirstAddressLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaWaterSportsFormFirstAddressLocalService
			tourismBonaWaterSportsFormFirstAddressLocalService) {

		_tourismBonaWaterSportsFormFirstAddressLocalService =
			tourismBonaWaterSportsFormFirstAddressLocalService;
	}

	private TourismBonaWaterSportsFormFirstAddressLocalService
		_tourismBonaWaterSportsFormFirstAddressLocalService;

}