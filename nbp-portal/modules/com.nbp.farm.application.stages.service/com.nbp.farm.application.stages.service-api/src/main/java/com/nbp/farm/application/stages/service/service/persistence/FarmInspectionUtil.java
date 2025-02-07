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

package com.nbp.farm.application.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.farm.application.stages.service.model.FarmInspection;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the farm inspection service. This utility wraps <code>com.nbp.farm.application.stages.service.service.persistence.impl.FarmInspectionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmInspectionPersistence
 * @generated
 */
public class FarmInspectionUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(FarmInspection farmInspection) {
		getPersistence().clearCache(farmInspection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, FarmInspection> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FarmInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FarmInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FarmInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FarmInspection> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FarmInspection update(FarmInspection farmInspection) {
		return getPersistence().update(farmInspection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FarmInspection update(
		FarmInspection farmInspection, ServiceContext serviceContext) {

		return getPersistence().update(farmInspection, serviceContext);
	}

	/**
	 * Returns all the farm inspections where farmApplicationId = &#63;.
	 *
	 * @param farmApplicationId the farm application ID
	 * @return the matching farm inspections
	 */
	public static List<FarmInspection> findBygetFI_FAI(long farmApplicationId) {
		return getPersistence().findBygetFI_FAI(farmApplicationId);
	}

	/**
	 * Returns a range of all the farm inspections where farmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param farmApplicationId the farm application ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @return the range of matching farm inspections
	 */
	public static List<FarmInspection> findBygetFI_FAI(
		long farmApplicationId, int start, int end) {

		return getPersistence().findBygetFI_FAI(farmApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the farm inspections where farmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param farmApplicationId the farm application ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm inspections
	 */
	public static List<FarmInspection> findBygetFI_FAI(
		long farmApplicationId, int start, int end,
		OrderByComparator<FarmInspection> orderByComparator) {

		return getPersistence().findBygetFI_FAI(
			farmApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farm inspections where farmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param farmApplicationId the farm application ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm inspections
	 */
	public static List<FarmInspection> findBygetFI_FAI(
		long farmApplicationId, int start, int end,
		OrderByComparator<FarmInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFI_FAI(
			farmApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first farm inspection in the ordered set where farmApplicationId = &#63;.
	 *
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	public static FarmInspection findBygetFI_FAI_First(
			long farmApplicationId,
			OrderByComparator<FarmInspection> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmInspectionException {

		return getPersistence().findBygetFI_FAI_First(
			farmApplicationId, orderByComparator);
	}

	/**
	 * Returns the first farm inspection in the ordered set where farmApplicationId = &#63;.
	 *
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public static FarmInspection fetchBygetFI_FAI_First(
		long farmApplicationId,
		OrderByComparator<FarmInspection> orderByComparator) {

		return getPersistence().fetchBygetFI_FAI_First(
			farmApplicationId, orderByComparator);
	}

	/**
	 * Returns the last farm inspection in the ordered set where farmApplicationId = &#63;.
	 *
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	public static FarmInspection findBygetFI_FAI_Last(
			long farmApplicationId,
			OrderByComparator<FarmInspection> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmInspectionException {

		return getPersistence().findBygetFI_FAI_Last(
			farmApplicationId, orderByComparator);
	}

	/**
	 * Returns the last farm inspection in the ordered set where farmApplicationId = &#63;.
	 *
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public static FarmInspection fetchBygetFI_FAI_Last(
		long farmApplicationId,
		OrderByComparator<FarmInspection> orderByComparator) {

		return getPersistence().fetchBygetFI_FAI_Last(
			farmApplicationId, orderByComparator);
	}

	/**
	 * Returns the farm inspections before and after the current farm inspection in the ordered set where farmApplicationId = &#63;.
	 *
	 * @param farmInspectionId the primary key of the current farm inspection
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm inspection
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	public static FarmInspection[] findBygetFI_FAI_PrevAndNext(
			long farmInspectionId, long farmApplicationId,
			OrderByComparator<FarmInspection> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmInspectionException {

		return getPersistence().findBygetFI_FAI_PrevAndNext(
			farmInspectionId, farmApplicationId, orderByComparator);
	}

	/**
	 * Removes all the farm inspections where farmApplicationId = &#63; from the database.
	 *
	 * @param farmApplicationId the farm application ID
	 */
	public static void removeBygetFI_FAI(long farmApplicationId) {
		getPersistence().removeBygetFI_FAI(farmApplicationId);
	}

	/**
	 * Returns the number of farm inspections where farmApplicationId = &#63;.
	 *
	 * @param farmApplicationId the farm application ID
	 * @return the number of matching farm inspections
	 */
	public static int countBygetFI_FAI(long farmApplicationId) {
		return getPersistence().countBygetFI_FAI(farmApplicationId);
	}

	/**
	 * Returns all the farm inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching farm inspections
	 */
	public static List<FarmInspection> findBygetFI_CaseId(String caseId) {
		return getPersistence().findBygetFI_CaseId(caseId);
	}

	/**
	 * Returns a range of all the farm inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @return the range of matching farm inspections
	 */
	public static List<FarmInspection> findBygetFI_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetFI_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the farm inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm inspections
	 */
	public static List<FarmInspection> findBygetFI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FarmInspection> orderByComparator) {

		return getPersistence().findBygetFI_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farm inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm inspections
	 */
	public static List<FarmInspection> findBygetFI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FarmInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFI_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first farm inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	public static FarmInspection findBygetFI_CaseId_First(
			String caseId, OrderByComparator<FarmInspection> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmInspectionException {

		return getPersistence().findBygetFI_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first farm inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public static FarmInspection fetchBygetFI_CaseId_First(
		String caseId, OrderByComparator<FarmInspection> orderByComparator) {

		return getPersistence().fetchBygetFI_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last farm inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	public static FarmInspection findBygetFI_CaseId_Last(
			String caseId, OrderByComparator<FarmInspection> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmInspectionException {

		return getPersistence().findBygetFI_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last farm inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public static FarmInspection fetchBygetFI_CaseId_Last(
		String caseId, OrderByComparator<FarmInspection> orderByComparator) {

		return getPersistence().fetchBygetFI_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the farm inspections before and after the current farm inspection in the ordered set where caseId = &#63;.
	 *
	 * @param farmInspectionId the primary key of the current farm inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm inspection
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	public static FarmInspection[] findBygetFI_CaseId_PrevAndNext(
			long farmInspectionId, String caseId,
			OrderByComparator<FarmInspection> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmInspectionException {

		return getPersistence().findBygetFI_CaseId_PrevAndNext(
			farmInspectionId, caseId, orderByComparator);
	}

	/**
	 * Removes all the farm inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetFI_CaseId(String caseId) {
		getPersistence().removeBygetFI_CaseId(caseId);
	}

	/**
	 * Returns the number of farm inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching farm inspections
	 */
	public static int countBygetFI_CaseId(String caseId) {
		return getPersistence().countBygetFI_CaseId(caseId);
	}

	/**
	 * Returns all the farm inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching farm inspections
	 */
	public static List<FarmInspection> findBygetFI_Status(String status) {
		return getPersistence().findBygetFI_Status(status);
	}

	/**
	 * Returns a range of all the farm inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @return the range of matching farm inspections
	 */
	public static List<FarmInspection> findBygetFI_Status(
		String status, int start, int end) {

		return getPersistence().findBygetFI_Status(status, start, end);
	}

	/**
	 * Returns an ordered range of all the farm inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm inspections
	 */
	public static List<FarmInspection> findBygetFI_Status(
		String status, int start, int end,
		OrderByComparator<FarmInspection> orderByComparator) {

		return getPersistence().findBygetFI_Status(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farm inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm inspections
	 */
	public static List<FarmInspection> findBygetFI_Status(
		String status, int start, int end,
		OrderByComparator<FarmInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFI_Status(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first farm inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	public static FarmInspection findBygetFI_Status_First(
			String status, OrderByComparator<FarmInspection> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmInspectionException {

		return getPersistence().findBygetFI_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first farm inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public static FarmInspection fetchBygetFI_Status_First(
		String status, OrderByComparator<FarmInspection> orderByComparator) {

		return getPersistence().fetchBygetFI_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last farm inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	public static FarmInspection findBygetFI_Status_Last(
			String status, OrderByComparator<FarmInspection> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmInspectionException {

		return getPersistence().findBygetFI_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last farm inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public static FarmInspection fetchBygetFI_Status_Last(
		String status, OrderByComparator<FarmInspection> orderByComparator) {

		return getPersistence().fetchBygetFI_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the farm inspections before and after the current farm inspection in the ordered set where status = &#63;.
	 *
	 * @param farmInspectionId the primary key of the current farm inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm inspection
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	public static FarmInspection[] findBygetFI_Status_PrevAndNext(
			long farmInspectionId, String status,
			OrderByComparator<FarmInspection> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmInspectionException {

		return getPersistence().findBygetFI_Status_PrevAndNext(
			farmInspectionId, status, orderByComparator);
	}

	/**
	 * Removes all the farm inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetFI_Status(String status) {
		getPersistence().removeBygetFI_Status(status);
	}

	/**
	 * Returns the number of farm inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching farm inspections
	 */
	public static int countBygetFI_Status(String status) {
		return getPersistence().countBygetFI_Status(status);
	}

	/**
	 * Returns all the farm inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching farm inspections
	 */
	public static List<FarmInspection> findBygetFI_CaseIdStatus(
		String status, String caseId) {

		return getPersistence().findBygetFI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns a range of all the farm inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @return the range of matching farm inspections
	 */
	public static List<FarmInspection> findBygetFI_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return getPersistence().findBygetFI_CaseIdStatus(
			status, caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the farm inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm inspections
	 */
	public static List<FarmInspection> findBygetFI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<FarmInspection> orderByComparator) {

		return getPersistence().findBygetFI_CaseIdStatus(
			status, caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farm inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm inspections
	 */
	public static List<FarmInspection> findBygetFI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<FarmInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFI_CaseIdStatus(
			status, caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first farm inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	public static FarmInspection findBygetFI_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<FarmInspection> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmInspectionException {

		return getPersistence().findBygetFI_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the first farm inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public static FarmInspection fetchBygetFI_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<FarmInspection> orderByComparator) {

		return getPersistence().fetchBygetFI_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last farm inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	public static FarmInspection findBygetFI_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<FarmInspection> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmInspectionException {

		return getPersistence().findBygetFI_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last farm inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public static FarmInspection fetchBygetFI_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<FarmInspection> orderByComparator) {

		return getPersistence().fetchBygetFI_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the farm inspections before and after the current farm inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param farmInspectionId the primary key of the current farm inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm inspection
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	public static FarmInspection[] findBygetFI_CaseIdStatus_PrevAndNext(
			long farmInspectionId, String status, String caseId,
			OrderByComparator<FarmInspection> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmInspectionException {

		return getPersistence().findBygetFI_CaseIdStatus_PrevAndNext(
			farmInspectionId, status, caseId, orderByComparator);
	}

	/**
	 * Removes all the farm inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public static void removeBygetFI_CaseIdStatus(
		String status, String caseId) {

		getPersistence().removeBygetFI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns the number of farm inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching farm inspections
	 */
	public static int countBygetFI_CaseIdStatus(String status, String caseId) {
		return getPersistence().countBygetFI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns all the farm inspections where status = &#63; and farmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @return the matching farm inspections
	 */
	public static List<FarmInspection> findBygetFI_CaseIdApplicationId(
		String status, long farmApplicationId) {

		return getPersistence().findBygetFI_CaseIdApplicationId(
			status, farmApplicationId);
	}

	/**
	 * Returns a range of all the farm inspections where status = &#63; and farmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @return the range of matching farm inspections
	 */
	public static List<FarmInspection> findBygetFI_CaseIdApplicationId(
		String status, long farmApplicationId, int start, int end) {

		return getPersistence().findBygetFI_CaseIdApplicationId(
			status, farmApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the farm inspections where status = &#63; and farmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm inspections
	 */
	public static List<FarmInspection> findBygetFI_CaseIdApplicationId(
		String status, long farmApplicationId, int start, int end,
		OrderByComparator<FarmInspection> orderByComparator) {

		return getPersistence().findBygetFI_CaseIdApplicationId(
			status, farmApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farm inspections where status = &#63; and farmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm inspections
	 */
	public static List<FarmInspection> findBygetFI_CaseIdApplicationId(
		String status, long farmApplicationId, int start, int end,
		OrderByComparator<FarmInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFI_CaseIdApplicationId(
			status, farmApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first farm inspection in the ordered set where status = &#63; and farmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	public static FarmInspection findBygetFI_CaseIdApplicationId_First(
			String status, long farmApplicationId,
			OrderByComparator<FarmInspection> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmInspectionException {

		return getPersistence().findBygetFI_CaseIdApplicationId_First(
			status, farmApplicationId, orderByComparator);
	}

	/**
	 * Returns the first farm inspection in the ordered set where status = &#63; and farmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public static FarmInspection fetchBygetFI_CaseIdApplicationId_First(
		String status, long farmApplicationId,
		OrderByComparator<FarmInspection> orderByComparator) {

		return getPersistence().fetchBygetFI_CaseIdApplicationId_First(
			status, farmApplicationId, orderByComparator);
	}

	/**
	 * Returns the last farm inspection in the ordered set where status = &#63; and farmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	public static FarmInspection findBygetFI_CaseIdApplicationId_Last(
			String status, long farmApplicationId,
			OrderByComparator<FarmInspection> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmInspectionException {

		return getPersistence().findBygetFI_CaseIdApplicationId_Last(
			status, farmApplicationId, orderByComparator);
	}

	/**
	 * Returns the last farm inspection in the ordered set where status = &#63; and farmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public static FarmInspection fetchBygetFI_CaseIdApplicationId_Last(
		String status, long farmApplicationId,
		OrderByComparator<FarmInspection> orderByComparator) {

		return getPersistence().fetchBygetFI_CaseIdApplicationId_Last(
			status, farmApplicationId, orderByComparator);
	}

	/**
	 * Returns the farm inspections before and after the current farm inspection in the ordered set where status = &#63; and farmApplicationId = &#63;.
	 *
	 * @param farmInspectionId the primary key of the current farm inspection
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm inspection
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	public static FarmInspection[] findBygetFI_CaseIdApplicationId_PrevAndNext(
			long farmInspectionId, String status, long farmApplicationId,
			OrderByComparator<FarmInspection> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmInspectionException {

		return getPersistence().findBygetFI_CaseIdApplicationId_PrevAndNext(
			farmInspectionId, status, farmApplicationId, orderByComparator);
	}

	/**
	 * Removes all the farm inspections where status = &#63; and farmApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 */
	public static void removeBygetFI_CaseIdApplicationId(
		String status, long farmApplicationId) {

		getPersistence().removeBygetFI_CaseIdApplicationId(
			status, farmApplicationId);
	}

	/**
	 * Returns the number of farm inspections where status = &#63; and farmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @return the number of matching farm inspections
	 */
	public static int countBygetFI_CaseIdApplicationId(
		String status, long farmApplicationId) {

		return getPersistence().countBygetFI_CaseIdApplicationId(
			status, farmApplicationId);
	}

	/**
	 * Returns the farm inspection where status = &#63; and slotBookedByUser = &#63; and farmApplicationId = &#63; or throws a <code>NoSuchFarmInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param farmApplicationId the farm application ID
	 * @return the matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	public static FarmInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long farmApplicationId)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmInspectionException {

		return getPersistence().
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, farmApplicationId);
	}

	/**
	 * Returns the farm inspection where status = &#63; and slotBookedByUser = &#63; and farmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param farmApplicationId the farm application ID
	 * @return the matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public static FarmInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long farmApplicationId) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, farmApplicationId);
	}

	/**
	 * Returns the farm inspection where status = &#63; and slotBookedByUser = &#63; and farmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param farmApplicationId the farm application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public static FarmInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long farmApplicationId,
			boolean useFinderCache) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, farmApplicationId, useFinderCache);
	}

	/**
	 * Removes the farm inspection where status = &#63; and slotBookedByUser = &#63; and farmApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param farmApplicationId the farm application ID
	 * @return the farm inspection that was removed
	 */
	public static FarmInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long farmApplicationId)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmInspectionException {

		return getPersistence().
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, farmApplicationId);
	}

	/**
	 * Returns the number of farm inspections where status = &#63; and slotBookedByUser = &#63; and farmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param farmApplicationId the farm application ID
	 * @return the number of matching farm inspections
	 */
	public static int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long farmApplicationId) {

		return getPersistence().
			countBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, farmApplicationId);
	}

	/**
	 * Caches the farm inspection in the entity cache if it is enabled.
	 *
	 * @param farmInspection the farm inspection
	 */
	public static void cacheResult(FarmInspection farmInspection) {
		getPersistence().cacheResult(farmInspection);
	}

	/**
	 * Caches the farm inspections in the entity cache if it is enabled.
	 *
	 * @param farmInspections the farm inspections
	 */
	public static void cacheResult(List<FarmInspection> farmInspections) {
		getPersistence().cacheResult(farmInspections);
	}

	/**
	 * Creates a new farm inspection with the primary key. Does not add the farm inspection to the database.
	 *
	 * @param farmInspectionId the primary key for the new farm inspection
	 * @return the new farm inspection
	 */
	public static FarmInspection create(long farmInspectionId) {
		return getPersistence().create(farmInspectionId);
	}

	/**
	 * Removes the farm inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmInspectionId the primary key of the farm inspection
	 * @return the farm inspection that was removed
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	public static FarmInspection remove(long farmInspectionId)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmInspectionException {

		return getPersistence().remove(farmInspectionId);
	}

	public static FarmInspection updateImpl(FarmInspection farmInspection) {
		return getPersistence().updateImpl(farmInspection);
	}

	/**
	 * Returns the farm inspection with the primary key or throws a <code>NoSuchFarmInspectionException</code> if it could not be found.
	 *
	 * @param farmInspectionId the primary key of the farm inspection
	 * @return the farm inspection
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	public static FarmInspection findByPrimaryKey(long farmInspectionId)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmInspectionException {

		return getPersistence().findByPrimaryKey(farmInspectionId);
	}

	/**
	 * Returns the farm inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmInspectionId the primary key of the farm inspection
	 * @return the farm inspection, or <code>null</code> if a farm inspection with the primary key could not be found
	 */
	public static FarmInspection fetchByPrimaryKey(long farmInspectionId) {
		return getPersistence().fetchByPrimaryKey(farmInspectionId);
	}

	/**
	 * Returns all the farm inspections.
	 *
	 * @return the farm inspections
	 */
	public static List<FarmInspection> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the farm inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @return the range of farm inspections
	 */
	public static List<FarmInspection> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the farm inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farm inspections
	 */
	public static List<FarmInspection> findAll(
		int start, int end,
		OrderByComparator<FarmInspection> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farm inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farm inspections
	 */
	public static List<FarmInspection> findAll(
		int start, int end, OrderByComparator<FarmInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the farm inspections from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of farm inspections.
	 *
	 * @return the number of farm inspections
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FarmInspectionPersistence getPersistence() {
		return _persistence;
	}

	private static volatile FarmInspectionPersistence _persistence;

}