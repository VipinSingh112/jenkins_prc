/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransportationAddress;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for TourismBonaGroundTransportationAddress. This utility wraps
 * <code>com.nbp.tourism.application.form.services.service.impl.TourismBonaGroundTransportationAddressLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransportationAddressLocalService
 * @generated
 */
public class TourismBonaGroundTransportationAddressLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.tourism.application.form.services.service.impl.TourismBonaGroundTransportationAddressLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static TourismBonaGroundTransportationAddress
		addTourismBonaGroundTransportationAddress(
			TourismBonaGroundTransportationAddress
				tourismBonaGroundTransportationAddress) {

		return getService().addTourismBonaGroundTransportationAddress(
			tourismBonaGroundTransportationAddress);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tourism bona ground transportation address with the primary key. Does not add the tourism bona ground transportation address to the database.
	 *
	 * @param tourismBonaGroundTransAddresId the primary key for the new tourism bona ground transportation address
	 * @return the new tourism bona ground transportation address
	 */
	public static TourismBonaGroundTransportationAddress
		createTourismBonaGroundTransportationAddress(
			long tourismBonaGroundTransAddresId) {

		return getService().createTourismBonaGroundTransportationAddress(
			tourismBonaGroundTransAddresId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	public static TourismBonaGroundTransportationAddress
			deleteTourismBonaGroundTransportationAddress(
				long tourismBonaGroundTransAddresId)
		throws PortalException {

		return getService().deleteTourismBonaGroundTransportationAddress(
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
	public static TourismBonaGroundTransportationAddress
		deleteTourismBonaGroundTransportationAddress(
			TourismBonaGroundTransportationAddress
				tourismBonaGroundTransportationAddress) {

		return getService().deleteTourismBonaGroundTransportationAddress(
			tourismBonaGroundTransportationAddress);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static TourismBonaGroundTransportationAddress
		fetchTourismBonaGroundTransportationAddress(
			long tourismBonaGroundTransAddresId) {

		return getService().fetchTourismBonaGroundTransportationAddress(
			tourismBonaGroundTransAddresId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static TourismBonaGroundTransportationAddress getTB_Ground_AT(
		String addressType, long tourismBonaGroundTransportId) {

		return getService().getTB_Ground_AT(
			addressType, tourismBonaGroundTransportId);
	}

	/**
	 * Returns the tourism bona ground transportation address with the primary key.
	 *
	 * @param tourismBonaGroundTransAddresId the primary key of the tourism bona ground transportation address
	 * @return the tourism bona ground transportation address
	 * @throws PortalException if a tourism bona ground transportation address with the primary key could not be found
	 */
	public static TourismBonaGroundTransportationAddress
			getTourismBonaGroundTransportationAddress(
				long tourismBonaGroundTransAddresId)
		throws PortalException {

		return getService().getTourismBonaGroundTransportationAddress(
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
	public static List<TourismBonaGroundTransportationAddress>
		getTourismBonaGroundTransportationAddresses(int start, int end) {

		return getService().getTourismBonaGroundTransportationAddresses(
			start, end);
	}

	/**
	 * Returns the number of tourism bona ground transportation addresses.
	 *
	 * @return the number of tourism bona ground transportation addresses
	 */
	public static int getTourismBonaGroundTransportationAddressesCount() {
		return getService().getTourismBonaGroundTransportationAddressesCount();
	}

	public static TourismBonaGroundTransportationAddress getTourismById(
		long tourismApplicationId) {

		return getService().getTourismById(tourismApplicationId);
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
	public static TourismBonaGroundTransportationAddress
		updateTourismBonaGroundTransportationAddress(
			TourismBonaGroundTransportationAddress
				tourismBonaGroundTransportationAddress) {

		return getService().updateTourismBonaGroundTransportationAddress(
			tourismBonaGroundTransportationAddress);
	}

	public static TourismBonaGroundTransportationAddressLocalService
		getService() {

		return _serviceSnapshot.get();
	}

	private static final Snapshot
		<TourismBonaGroundTransportationAddressLocalService> _serviceSnapshot =
			new Snapshot<>(
				TourismBonaGroundTransportationAddressLocalServiceUtil.class,
				TourismBonaGroundTransportationAddressLocalService.class);

}