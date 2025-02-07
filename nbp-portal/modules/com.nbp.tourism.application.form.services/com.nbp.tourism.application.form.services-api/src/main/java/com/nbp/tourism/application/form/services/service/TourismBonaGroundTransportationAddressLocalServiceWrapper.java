/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaGroundTransportationAddressLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransportationAddressLocalService
 * @generated
 */
public class TourismBonaGroundTransportationAddressLocalServiceWrapper
	implements ServiceWrapper
		<TourismBonaGroundTransportationAddressLocalService>,
			   TourismBonaGroundTransportationAddressLocalService {

	public TourismBonaGroundTransportationAddressLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaGroundTransportationAddressLocalServiceWrapper(
		TourismBonaGroundTransportationAddressLocalService
			tourismBonaGroundTransportationAddressLocalService) {

		_tourismBonaGroundTransportationAddressLocalService =
			tourismBonaGroundTransportationAddressLocalService;
	}

	/**
	 * Adds the tourism bona ground transportation address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransportationAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundTransportationAddress the tourism bona ground transportation address
	 * @return the tourism bona ground transportation address that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportationAddress
			addTourismBonaGroundTransportationAddress(
				com.nbp.tourism.application.form.services.model.
					TourismBonaGroundTransportationAddress
						tourismBonaGroundTransportationAddress) {

		return _tourismBonaGroundTransportationAddressLocalService.
			addTourismBonaGroundTransportationAddress(
				tourismBonaGroundTransportationAddress);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransportationAddressLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona ground transportation address with the primary key. Does not add the tourism bona ground transportation address to the database.
	 *
	 * @param tourismBonaGroundTransAddresId the primary key for the new tourism bona ground transportation address
	 * @return the new tourism bona ground transportation address
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportationAddress
			createTourismBonaGroundTransportationAddress(
				long tourismBonaGroundTransAddresId) {

		return _tourismBonaGroundTransportationAddressLocalService.
			createTourismBonaGroundTransportationAddress(
				tourismBonaGroundTransAddresId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransportationAddressLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the tourism bona ground transportation address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransportationAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundTransAddresId the primary key of the tourism bona ground transportation address
	 * @return the tourism bona ground transportation address that was removed
	 * @throws PortalException if a tourism bona ground transportation address with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportationAddress
				deleteTourismBonaGroundTransportationAddress(
					long tourismBonaGroundTransAddresId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransportationAddressLocalService.
			deleteTourismBonaGroundTransportationAddress(
				tourismBonaGroundTransAddresId);
	}

	/**
	 * Deletes the tourism bona ground transportation address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransportationAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundTransportationAddress the tourism bona ground transportation address
	 * @return the tourism bona ground transportation address that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportationAddress
			deleteTourismBonaGroundTransportationAddress(
				com.nbp.tourism.application.form.services.model.
					TourismBonaGroundTransportationAddress
						tourismBonaGroundTransportationAddress) {

		return _tourismBonaGroundTransportationAddressLocalService.
			deleteTourismBonaGroundTransportationAddress(
				tourismBonaGroundTransportationAddress);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaGroundTransportationAddressLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaGroundTransportationAddressLocalService.
			dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaGroundTransportationAddressLocalService.
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

		return _tourismBonaGroundTransportationAddressLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransportationAddressModelImpl</code>.
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

		return _tourismBonaGroundTransportationAddressLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransportationAddressModelImpl</code>.
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

		return _tourismBonaGroundTransportationAddressLocalService.dynamicQuery(
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

		return _tourismBonaGroundTransportationAddressLocalService.
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

		return _tourismBonaGroundTransportationAddressLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportationAddress
			fetchTourismBonaGroundTransportationAddress(
				long tourismBonaGroundTransAddresId) {

		return _tourismBonaGroundTransportationAddressLocalService.
			fetchTourismBonaGroundTransportationAddress(
				tourismBonaGroundTransAddresId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaGroundTransportationAddressLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaGroundTransportationAddressLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaGroundTransportationAddressLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransportationAddressLocalService.
			getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportationAddress getTB_Ground_AT(
			String addressType, long tourismBonaGroundTransportId) {

		return _tourismBonaGroundTransportationAddressLocalService.
			getTB_Ground_AT(addressType, tourismBonaGroundTransportId);
	}

	/**
	 * Returns the tourism bona ground transportation address with the primary key.
	 *
	 * @param tourismBonaGroundTransAddresId the primary key of the tourism bona ground transportation address
	 * @return the tourism bona ground transportation address
	 * @throws PortalException if a tourism bona ground transportation address with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportationAddress
				getTourismBonaGroundTransportationAddress(
					long tourismBonaGroundTransAddresId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaGroundTransportationAddressLocalService.
			getTourismBonaGroundTransportationAddress(
				tourismBonaGroundTransAddresId);
	}

	/**
	 * Returns a range of all the tourism bona ground transportation addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransportationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportation addresses
	 * @param end the upper bound of the range of tourism bona ground transportation addresses (not inclusive)
	 * @return the range of tourism bona ground transportation addresses
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaGroundTransportationAddress>
				getTourismBonaGroundTransportationAddresses(
					int start, int end) {

		return _tourismBonaGroundTransportationAddressLocalService.
			getTourismBonaGroundTransportationAddresses(start, end);
	}

	/**
	 * Returns the number of tourism bona ground transportation addresses.
	 *
	 * @return the number of tourism bona ground transportation addresses
	 */
	@Override
	public int getTourismBonaGroundTransportationAddressesCount() {
		return _tourismBonaGroundTransportationAddressLocalService.
			getTourismBonaGroundTransportationAddressesCount();
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportationAddress getTourismById(
			long tourismApplicationId) {

		return _tourismBonaGroundTransportationAddressLocalService.
			getTourismById(tourismApplicationId);
	}

	/**
	 * Updates the tourism bona ground transportation address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaGroundTransportationAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaGroundTransportationAddress the tourism bona ground transportation address
	 * @return the tourism bona ground transportation address that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaGroundTransportationAddress
			updateTourismBonaGroundTransportationAddress(
				com.nbp.tourism.application.form.services.model.
					TourismBonaGroundTransportationAddress
						tourismBonaGroundTransportationAddress) {

		return _tourismBonaGroundTransportationAddressLocalService.
			updateTourismBonaGroundTransportationAddress(
				tourismBonaGroundTransportationAddress);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaGroundTransportationAddressLocalService.
			getBasePersistence();
	}

	@Override
	public TourismBonaGroundTransportationAddressLocalService
		getWrappedService() {

		return _tourismBonaGroundTransportationAddressLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaGroundTransportationAddressLocalService
			tourismBonaGroundTransportationAddressLocalService) {

		_tourismBonaGroundTransportationAddressLocalService =
			tourismBonaGroundTransportationAddressLocalService;
	}

	private TourismBonaGroundTransportationAddressLocalService
		_tourismBonaGroundTransportationAddressLocalService;

}