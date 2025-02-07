/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.farm.application.form.service.model.FarmerStakeholderAddress;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FarmerStakeholderAddress. This utility wraps
 * <code>com.nbp.farm.application.form.service.service.impl.FarmerStakeholderAddressLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerStakeholderAddressLocalService
 * @generated
 */
public class FarmerStakeholderAddressLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.farm.application.form.service.service.impl.FarmerStakeholderAddressLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the farmer stakeholder address to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerStakeholderAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerStakeholderAddress the farmer stakeholder address
	 * @return the farmer stakeholder address that was added
	 */
	public static FarmerStakeholderAddress addFarmerStakeholderAddress(
		FarmerStakeholderAddress farmerStakeholderAddress) {

		return getService().addFarmerStakeholderAddress(
			farmerStakeholderAddress);
	}

	/**
	 * Creates a new farmer stakeholder address with the primary key. Does not add the farmer stakeholder address to the database.
	 *
	 * @param farmerStakeholderAddressId the primary key for the new farmer stakeholder address
	 * @return the new farmer stakeholder address
	 */
	public static FarmerStakeholderAddress createFarmerStakeholderAddress(
		long farmerStakeholderAddressId) {

		return getService().createFarmerStakeholderAddress(
			farmerStakeholderAddressId);
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
	 * Deletes the farmer stakeholder address from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerStakeholderAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerStakeholderAddress the farmer stakeholder address
	 * @return the farmer stakeholder address that was removed
	 */
	public static FarmerStakeholderAddress deleteFarmerStakeholderAddress(
		FarmerStakeholderAddress farmerStakeholderAddress) {

		return getService().deleteFarmerStakeholderAddress(
			farmerStakeholderAddress);
	}

	/**
	 * Deletes the farmer stakeholder address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerStakeholderAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerStakeholderAddressId the primary key of the farmer stakeholder address
	 * @return the farmer stakeholder address that was removed
	 * @throws PortalException if a farmer stakeholder address with the primary key could not be found
	 */
	public static FarmerStakeholderAddress deleteFarmerStakeholderAddress(
			long farmerStakeholderAddressId)
		throws PortalException {

		return getService().deleteFarmerStakeholderAddress(
			farmerStakeholderAddressId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerStakeholderAddressModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerStakeholderAddressModelImpl</code>.
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

	public static FarmerStakeholderAddress fetchFarmerStakeholderAddress(
		long farmerStakeholderAddressId) {

		return getService().fetchFarmerStakeholderAddress(
			farmerStakeholderAddressId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static FarmerStakeholderAddress getFA_FSI_AT(
		String addressType, long farmerStakeholderInfoId) {

		return getService().getFA_FSI_AT(addressType, farmerStakeholderInfoId);
	}

	public static FarmerStakeholderAddress getFarmerById(long applicationId) {
		return getService().getFarmerById(applicationId);
	}

	public static FarmerStakeholderAddress getFarmerByStakeholderId(
		long applicationId) {

		return getService().getFarmerByStakeholderId(applicationId);
	}

	/**
	 * Returns the farmer stakeholder address with the primary key.
	 *
	 * @param farmerStakeholderAddressId the primary key of the farmer stakeholder address
	 * @return the farmer stakeholder address
	 * @throws PortalException if a farmer stakeholder address with the primary key could not be found
	 */
	public static FarmerStakeholderAddress getFarmerStakeholderAddress(
			long farmerStakeholderAddressId)
		throws PortalException {

		return getService().getFarmerStakeholderAddress(
			farmerStakeholderAddressId);
	}

	/**
	 * Returns a range of all the farmer stakeholder addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerStakeholderAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer stakeholder addresses
	 * @param end the upper bound of the range of farmer stakeholder addresses (not inclusive)
	 * @return the range of farmer stakeholder addresses
	 */
	public static List<FarmerStakeholderAddress> getFarmerStakeholderAddresses(
		int start, int end) {

		return getService().getFarmerStakeholderAddresses(start, end);
	}

	/**
	 * Returns the number of farmer stakeholder addresses.
	 *
	 * @return the number of farmer stakeholder addresses
	 */
	public static int getFarmerStakeholderAddressesCount() {
		return getService().getFarmerStakeholderAddressesCount();
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

	/**
	 * Updates the farmer stakeholder address in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerStakeholderAddressLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerStakeholderAddress the farmer stakeholder address
	 * @return the farmer stakeholder address that was updated
	 */
	public static FarmerStakeholderAddress updateFarmerStakeholderAddress(
		FarmerStakeholderAddress farmerStakeholderAddress) {

		return getService().updateFarmerStakeholderAddress(
			farmerStakeholderAddress);
	}

	public static FarmerStakeholderAddressLocalService getService() {
		return _service;
	}

	private static volatile FarmerStakeholderAddressLocalService _service;

}