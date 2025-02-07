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

import com.nbp.farm.application.form.service.model.FarmerCropPractice;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FarmerCropPractice. This utility wraps
 * <code>com.nbp.farm.application.form.service.service.impl.FarmerCropPracticeLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerCropPracticeLocalService
 * @generated
 */
public class FarmerCropPracticeLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.farm.application.form.service.service.impl.FarmerCropPracticeLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the farmer crop practice to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerCropPracticeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerCropPractice the farmer crop practice
	 * @return the farmer crop practice that was added
	 */
	public static FarmerCropPractice addFarmerCropPractice(
		FarmerCropPractice farmerCropPractice) {

		return getService().addFarmerCropPractice(farmerCropPractice);
	}

	/**
	 * Creates a new farmer crop practice with the primary key. Does not add the farmer crop practice to the database.
	 *
	 * @param farmerCropPracticeId the primary key for the new farmer crop practice
	 * @return the new farmer crop practice
	 */
	public static FarmerCropPractice createFarmerCropPractice(
		long farmerCropPracticeId) {

		return getService().createFarmerCropPractice(farmerCropPracticeId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	public static void deleteCP_BY_ID(long applicationId) {
		getService().deleteCP_BY_ID(applicationId);
	}

	/**
	 * Deletes the farmer crop practice from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerCropPracticeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerCropPractice the farmer crop practice
	 * @return the farmer crop practice that was removed
	 */
	public static FarmerCropPractice deleteFarmerCropPractice(
		FarmerCropPractice farmerCropPractice) {

		return getService().deleteFarmerCropPractice(farmerCropPractice);
	}

	/**
	 * Deletes the farmer crop practice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerCropPracticeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerCropPracticeId the primary key of the farmer crop practice
	 * @return the farmer crop practice that was removed
	 * @throws PortalException if a farmer crop practice with the primary key could not be found
	 */
	public static FarmerCropPractice deleteFarmerCropPractice(
			long farmerCropPracticeId)
		throws PortalException {

		return getService().deleteFarmerCropPractice(farmerCropPracticeId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerCropPracticeModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerCropPracticeModelImpl</code>.
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

	public static FarmerCropPractice fetchFarmerCropPractice(
		long farmerCropPracticeId) {

		return getService().fetchFarmerCropPractice(farmerCropPracticeId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<FarmerCropPractice> getFA_FFCP_FAI(long ApplicationId) {
		return getService().getFA_FFCP_FAI(ApplicationId);
	}

	public static FarmerCropPractice getFarmerById(long ApplicationId) {
		return getService().getFarmerById(ApplicationId);
	}

	/**
	 * Returns the farmer crop practice with the primary key.
	 *
	 * @param farmerCropPracticeId the primary key of the farmer crop practice
	 * @return the farmer crop practice
	 * @throws PortalException if a farmer crop practice with the primary key could not be found
	 */
	public static FarmerCropPractice getFarmerCropPractice(
			long farmerCropPracticeId)
		throws PortalException {

		return getService().getFarmerCropPractice(farmerCropPracticeId);
	}

	/**
	 * Returns a range of all the farmer crop practices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerCropPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer crop practices
	 * @param end the upper bound of the range of farmer crop practices (not inclusive)
	 * @return the range of farmer crop practices
	 */
	public static List<FarmerCropPractice> getFarmerCropPractices(
		int start, int end) {

		return getService().getFarmerCropPractices(start, end);
	}

	/**
	 * Returns the number of farmer crop practices.
	 *
	 * @return the number of farmer crop practices
	 */
	public static int getFarmerCropPracticesCount() {
		return getService().getFarmerCropPracticesCount();
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
	 * Updates the farmer crop practice in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerCropPracticeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerCropPractice the farmer crop practice
	 * @return the farmer crop practice that was updated
	 */
	public static FarmerCropPractice updateFarmerCropPractice(
		FarmerCropPractice farmerCropPractice) {

		return getService().updateFarmerCropPractice(farmerCropPractice);
	}

	public static FarmerCropPracticeLocalService getService() {
		return _service;
	}

	private static volatile FarmerCropPracticeLocalService _service;

}