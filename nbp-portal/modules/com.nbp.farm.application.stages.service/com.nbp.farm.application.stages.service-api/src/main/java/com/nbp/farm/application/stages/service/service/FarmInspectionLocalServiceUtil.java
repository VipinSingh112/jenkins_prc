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

package com.nbp.farm.application.stages.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.farm.application.stages.service.model.FarmInspection;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FarmInspection. This utility wraps
 * <code>com.nbp.farm.application.stages.service.service.impl.FarmInspectionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FarmInspectionLocalService
 * @generated
 */
public class FarmInspectionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.farm.application.stages.service.service.impl.FarmInspectionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the farm inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmInspection the farm inspection
	 * @return the farm inspection that was added
	 */
	public static FarmInspection addFarmInspection(
		FarmInspection farmInspection) {

		return getService().addFarmInspection(farmInspection);
	}

	/**
	 * Creates a new farm inspection with the primary key. Does not add the farm inspection to the database.
	 *
	 * @param farmInspectionId the primary key for the new farm inspection
	 * @return the new farm inspection
	 */
	public static FarmInspection createFarmInspection(long farmInspectionId) {
		return getService().createFarmInspection(farmInspectionId);
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
	 * Deletes the farm inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmInspection the farm inspection
	 * @return the farm inspection that was removed
	 */
	public static FarmInspection deleteFarmInspection(
		FarmInspection farmInspection) {

		return getService().deleteFarmInspection(farmInspection);
	}

	/**
	 * Deletes the farm inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmInspectionId the primary key of the farm inspection
	 * @return the farm inspection that was removed
	 * @throws PortalException if a farm inspection with the primary key could not be found
	 */
	public static FarmInspection deleteFarmInspection(long farmInspectionId)
		throws PortalException {

		return getService().deleteFarmInspection(farmInspectionId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.stages.service.model.impl.FarmInspectionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.stages.service.model.impl.FarmInspectionModelImpl</code>.
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

	public static FarmInspection fetchFarmInspection(long farmInspectionId) {
		return getService().fetchFarmInspection(farmInspectionId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the farm inspection with the primary key.
	 *
	 * @param farmInspectionId the primary key of the farm inspection
	 * @return the farm inspection
	 * @throws PortalException if a farm inspection with the primary key could not be found
	 */
	public static FarmInspection getFarmInspection(long farmInspectionId)
		throws PortalException {

		return getService().getFarmInspection(farmInspectionId);
	}

	/**
	 * Returns a range of all the farm inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.stages.service.model.impl.FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @return the range of farm inspections
	 */
	public static List<FarmInspection> getFarmInspections(int start, int end) {
		return getService().getFarmInspections(start, end);
	}

	public static List<FarmInspection> getFarmInspections(
		long farmApplicationId) {

		return getService().getFarmInspections(farmApplicationId);
	}

	public static List<FarmInspection> getFarmInspectionsByCaseId(
		String caseId) {

		return getService().getFarmInspectionsByCaseId(caseId);
	}

	public static List<FarmInspection> getFarmInspectionsByStatusApplicationId(
		long farmApplicationId, String status) {

		return getService().getFarmInspectionsByStatusApplicationId(
			farmApplicationId, status);
	}

	public static List<FarmInspection> getFarmInspectionsByStatusCaseId(
		String caseId, String status) {

		return getService().getFarmInspectionsByStatusCaseId(caseId, status);
	}

	/**
	 * Returns the number of farm inspections.
	 *
	 * @return the number of farm inspections
	 */
	public static int getFarmInspectionsCount() {
		return getService().getFarmInspectionsCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static FarmInspection getInspectionByStatus_SlotBoooked(
			String status, long slotBookedByUser, long farmApplicationId)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmInspectionException {

		return getService().getInspectionByStatus_SlotBoooked(
			status, slotBookedByUser, farmApplicationId);
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
	 * Updates the farm inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmInspection the farm inspection
	 * @return the farm inspection that was updated
	 */
	public static FarmInspection updateFarmInspection(
		FarmInspection farmInspection) {

		return getService().updateFarmInspection(farmInspection);
	}

	public static FarmInspectionLocalService getService() {
		return _service;
	}

	private static volatile FarmInspectionLocalService _service;

}