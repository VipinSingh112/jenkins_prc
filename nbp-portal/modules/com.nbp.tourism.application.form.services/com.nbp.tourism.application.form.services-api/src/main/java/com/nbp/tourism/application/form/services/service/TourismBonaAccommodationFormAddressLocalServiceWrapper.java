/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link TourismBonaAccommodationFormAddressLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccommodationFormAddressLocalService
 * @generated
 */
public class TourismBonaAccommodationFormAddressLocalServiceWrapper
	implements ServiceWrapper<TourismBonaAccommodationFormAddressLocalService>,
			   TourismBonaAccommodationFormAddressLocalService {

	public TourismBonaAccommodationFormAddressLocalServiceWrapper() {
		this(null);
	}

	public TourismBonaAccommodationFormAddressLocalServiceWrapper(
		TourismBonaAccommodationFormAddressLocalService
			tourismBonaAccommodationFormAddressLocalService) {

		_tourismBonaAccommodationFormAddressLocalService =
			tourismBonaAccommodationFormAddressLocalService;
	}

	/**
	 * Adds the tourism bona accommodation form address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAccommodationFormAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAccommodationFormAddress the tourism bona accommodation form address
	 * @return the tourism bona accommodation form address that was added
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAccommodationFormAddress
			addTourismBonaAccommodationFormAddress(
				com.nbp.tourism.application.form.services.model.
					TourismBonaAccommodationFormAddress
						tourismBonaAccommodationFormAddress) {

		return _tourismBonaAccommodationFormAddressLocalService.
			addTourismBonaAccommodationFormAddress(
				tourismBonaAccommodationFormAddress);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccommodationFormAddressLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona accommodation form address with the primary key. Does not add the tourism bona accommodation form address to the database.
	 *
	 * @param tourismBonaAccommodationFAOOId the primary key for the new tourism bona accommodation form address
	 * @return the new tourism bona accommodation form address
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAccommodationFormAddress
			createTourismBonaAccommodationFormAddress(
				long tourismBonaAccommodationFAOOId) {

		return _tourismBonaAccommodationFormAddressLocalService.
			createTourismBonaAccommodationFormAddress(
				tourismBonaAccommodationFAOOId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccommodationFormAddressLocalService.
			deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the tourism bona accommodation form address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAccommodationFormAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAccommodationFAOOId the primary key of the tourism bona accommodation form address
	 * @return the tourism bona accommodation form address that was removed
	 * @throws PortalException if a tourism bona accommodation form address with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAccommodationFormAddress
				deleteTourismBonaAccommodationFormAddress(
					long tourismBonaAccommodationFAOOId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccommodationFormAddressLocalService.
			deleteTourismBonaAccommodationFormAddress(
				tourismBonaAccommodationFAOOId);
	}

	/**
	 * Deletes the tourism bona accommodation form address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAccommodationFormAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAccommodationFormAddress the tourism bona accommodation form address
	 * @return the tourism bona accommodation form address that was removed
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAccommodationFormAddress
			deleteTourismBonaAccommodationFormAddress(
				com.nbp.tourism.application.form.services.model.
					TourismBonaAccommodationFormAddress
						tourismBonaAccommodationFormAddress) {

		return _tourismBonaAccommodationFormAddressLocalService.
			deleteTourismBonaAccommodationFormAddress(
				tourismBonaAccommodationFormAddress);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tourismBonaAccommodationFormAddressLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tourismBonaAccommodationFormAddressLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tourismBonaAccommodationFormAddressLocalService.dynamicQuery();
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

		return _tourismBonaAccommodationFormAddressLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAccommodationFormAddressModelImpl</code>.
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

		return _tourismBonaAccommodationFormAddressLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAccommodationFormAddressModelImpl</code>.
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

		return _tourismBonaAccommodationFormAddressLocalService.dynamicQuery(
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

		return _tourismBonaAccommodationFormAddressLocalService.
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

		return _tourismBonaAccommodationFormAddressLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAccommodationFormAddress
			fetchTourismBonaAccommodationFormAddress(
				long tourismBonaAccommodationFAOOId) {

		return _tourismBonaAccommodationFormAddressLocalService.
			fetchTourismBonaAccommodationFormAddress(
				tourismBonaAccommodationFAOOId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tourismBonaAccommodationFormAddressLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tourismBonaAccommodationFormAddressLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tourismBonaAccommodationFormAddressLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccommodationFormAddressLocalService.
			getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAccommodationFormAddress getTB_Acco_AT(
			String addressType, long tourismBonaAFId) {

		return _tourismBonaAccommodationFormAddressLocalService.getTB_Acco_AT(
			addressType, tourismBonaAFId);
	}

	/**
	 * Returns the tourism bona accommodation form address with the primary key.
	 *
	 * @param tourismBonaAccommodationFAOOId the primary key of the tourism bona accommodation form address
	 * @return the tourism bona accommodation form address
	 * @throws PortalException if a tourism bona accommodation form address with the primary key could not be found
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAccommodationFormAddress
				getTourismBonaAccommodationFormAddress(
					long tourismBonaAccommodationFAOOId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _tourismBonaAccommodationFormAddressLocalService.
			getTourismBonaAccommodationFormAddress(
				tourismBonaAccommodationFAOOId);
	}

	/**
	 * Returns a range of all the tourism bona accommodation form addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaAccommodationFormAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona accommodation form addresses
	 * @param end the upper bound of the range of tourism bona accommodation form addresses (not inclusive)
	 * @return the range of tourism bona accommodation form addresses
	 */
	@Override
	public java.util.List
		<com.nbp.tourism.application.form.services.model.
			TourismBonaAccommodationFormAddress>
				getTourismBonaAccommodationFormAddresses(int start, int end) {

		return _tourismBonaAccommodationFormAddressLocalService.
			getTourismBonaAccommodationFormAddresses(start, end);
	}

	/**
	 * Returns the number of tourism bona accommodation form addresses.
	 *
	 * @return the number of tourism bona accommodation form addresses
	 */
	@Override
	public int getTourismBonaAccommodationFormAddressesCount() {
		return _tourismBonaAccommodationFormAddressLocalService.
			getTourismBonaAccommodationFormAddressesCount();
	}

	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAccommodationFormAddress getTourismById(
			long tourismApplicationId) {

		return _tourismBonaAccommodationFormAddressLocalService.getTourismById(
			tourismApplicationId);
	}

	/**
	 * Updates the tourism bona accommodation form address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TourismBonaAccommodationFormAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tourismBonaAccommodationFormAddress the tourism bona accommodation form address
	 * @return the tourism bona accommodation form address that was updated
	 */
	@Override
	public com.nbp.tourism.application.form.services.model.
		TourismBonaAccommodationFormAddress
			updateTourismBonaAccommodationFormAddress(
				com.nbp.tourism.application.form.services.model.
					TourismBonaAccommodationFormAddress
						tourismBonaAccommodationFormAddress) {

		return _tourismBonaAccommodationFormAddressLocalService.
			updateTourismBonaAccommodationFormAddress(
				tourismBonaAccommodationFormAddress);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _tourismBonaAccommodationFormAddressLocalService.
			getBasePersistence();
	}

	@Override
	public TourismBonaAccommodationFormAddressLocalService getWrappedService() {
		return _tourismBonaAccommodationFormAddressLocalService;
	}

	@Override
	public void setWrappedService(
		TourismBonaAccommodationFormAddressLocalService
			tourismBonaAccommodationFormAddressLocalService) {

		_tourismBonaAccommodationFormAddressLocalService =
			tourismBonaAccommodationFormAddressLocalService;
	}

	private TourismBonaAccommodationFormAddressLocalService
		_tourismBonaAccommodationFormAddressLocalService;

}