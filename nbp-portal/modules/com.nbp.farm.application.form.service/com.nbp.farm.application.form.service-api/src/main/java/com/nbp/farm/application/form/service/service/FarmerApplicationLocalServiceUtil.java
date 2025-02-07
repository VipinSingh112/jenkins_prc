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

import com.nbp.farm.application.form.service.model.FarmerApplication;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FarmerApplication. This utility wraps
 * <code>com.nbp.farm.application.form.service.service.impl.FarmerApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerApplicationLocalService
 * @generated
 */
public class FarmerApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.farm.application.form.service.service.impl.FarmerApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the farmer application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerApplication the farmer application
	 * @return the farmer application that was added
	 */
	public static FarmerApplication addFarmerApplication(
		FarmerApplication farmerApplication) {

		return getService().addFarmerApplication(farmerApplication);
	}

	/**
	 * Creates a new farmer application with the primary key. Does not add the farmer application to the database.
	 *
	 * @param farmerApplicationId the primary key for the new farmer application
	 * @return the new farmer application
	 */
	public static FarmerApplication createFarmerApplication(
		long farmerApplicationId) {

		return getService().createFarmerApplication(farmerApplicationId);
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
	 * Deletes the farmer application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerApplication the farmer application
	 * @return the farmer application that was removed
	 */
	public static FarmerApplication deleteFarmerApplication(
		FarmerApplication farmerApplication) {

		return getService().deleteFarmerApplication(farmerApplication);
	}

	/**
	 * Deletes the farmer application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerApplicationId the primary key of the farmer application
	 * @return the farmer application that was removed
	 * @throws PortalException if a farmer application with the primary key could not be found
	 */
	public static FarmerApplication deleteFarmerApplication(
			long farmerApplicationId)
		throws PortalException {

		return getService().deleteFarmerApplication(farmerApplicationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerApplicationModelImpl</code>.
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

	public static FarmerApplication fetchFarmerApplication(
		long farmerApplicationId) {

		return getService().fetchFarmerApplication(farmerApplicationId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the farmer application with the primary key.
	 *
	 * @param farmerApplicationId the primary key of the farmer application
	 * @return the farmer application
	 * @throws PortalException if a farmer application with the primary key could not be found
	 */
	public static FarmerApplication getFarmerApplication(
			long farmerApplicationId)
		throws PortalException {

		return getService().getFarmerApplication(farmerApplicationId);
	}

	public static FarmerApplication getFarmerApplicationByAppNo(
			String applicationNumber)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getService().getFarmerApplicationByAppNo(applicationNumber);
	}

	public static FarmerApplication getFarmerApplicationByCaseId(String caseId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getService().getFarmerApplicationByCaseId(caseId);
	}

	public static FarmerApplication getFarmerApplicationByRT_AppNo(
			String requestType, String expiredLicenseappNumber)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getService().getFarmerApplicationByRT_AppNo(
			requestType, expiredLicenseappNumber);
	}

	public static List<FarmerApplication> getFarmerApplicationByS_U(
			long userId, int status)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getService().getFarmerApplicationByS_U(userId, status);
	}

	public static List<FarmerApplication> getFarmerApplicationByStatus(
		int status) {

		return getService().getFarmerApplicationByStatus(status);
	}

	public static List<FarmerApplication> getFarmerApplicationByUser(
		long userId) {

		return getService().getFarmerApplicationByUser(userId);
	}

	/**
	 * Returns a range of all the farmer applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @return the range of farmer applications
	 */
	public static List<FarmerApplication> getFarmerApplications(
		int start, int end) {

		return getService().getFarmerApplications(start, end);
	}

	/**
	 * Returns the number of farmer applications.
	 *
	 * @return the number of farmer applications
	 */
	public static int getFarmerApplicationsCount() {
		return getService().getFarmerApplicationsCount();
	}

	public static FarmerApplication getFarmerById(long ApplicationId) {
		return getService().getFarmerById(ApplicationId);
	}

	public static List<String> getFarmerDistinctCategories() {
		return getService().getFarmerDistinctCategories();
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
	 * Updates the farmer application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerApplication the farmer application
	 * @return the farmer application that was updated
	 */
	public static FarmerApplication updateFarmerApplication(
		FarmerApplication farmerApplication) {

		return getService().updateFarmerApplication(farmerApplication);
	}

	public static FarmerApplicationLocalService getService() {
		return _service;
	}

	private static volatile FarmerApplicationLocalService _service;

}