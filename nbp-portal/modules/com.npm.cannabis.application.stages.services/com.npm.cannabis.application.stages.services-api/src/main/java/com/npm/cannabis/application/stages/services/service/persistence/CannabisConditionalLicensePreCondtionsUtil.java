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

package com.npm.cannabis.application.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.npm.cannabis.application.stages.services.model.CannabisConditionalLicensePreCondtions;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis conditional license pre condtions service. This utility wraps <code>com.npm.cannabis.application.stages.services.service.persistence.impl.CannabisConditionalLicensePreCondtionsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConditionalLicensePreCondtionsPersistence
 * @generated
 */
public class CannabisConditionalLicensePreCondtionsUtil {

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
	public static void clearCache(
		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions) {

		getPersistence().clearCache(cannabisConditionalLicensePreCondtions);
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
	public static Map<Serializable, CannabisConditionalLicensePreCondtions>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisConditionalLicensePreCondtions>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisConditionalLicensePreCondtions>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisConditionalLicensePreCondtions>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisConditionalLicensePreCondtions update(
		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions) {

		return getPersistence().update(cannabisConditionalLicensePreCondtions);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisConditionalLicensePreCondtions update(
		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions,
		ServiceContext serviceContext) {

		return getPersistence().update(
			cannabisConditionalLicensePreCondtions, serviceContext);
	}

	/**
	 * Returns all the cannabis conditional license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions> findBygetCI_CAI(
		long cannabisApplicationId) {

		return getPersistence().findBygetCI_CAI(cannabisApplicationId);
	}

	/**
	 * Returns a range of all the cannabis conditional license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @return the range of matching cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions> findBygetCI_CAI(
		long cannabisApplicationId, int start, int end) {

		return getPersistence().findBygetCI_CAI(
			cannabisApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions> findBygetCI_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisConditionalLicensePreCondtions>
			orderByComparator) {

		return getPersistence().findBygetCI_CAI(
			cannabisApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions> findBygetCI_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisConditionalLicensePreCondtions>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCI_CAI(
			cannabisApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	public static CannabisConditionalLicensePreCondtions findBygetCI_CAI_First(
			long cannabisApplicationId,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicensePreCondtionsException {

		return getPersistence().findBygetCI_CAI_First(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	public static CannabisConditionalLicensePreCondtions fetchBygetCI_CAI_First(
		long cannabisApplicationId,
		OrderByComparator<CannabisConditionalLicensePreCondtions>
			orderByComparator) {

		return getPersistence().fetchBygetCI_CAI_First(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	public static CannabisConditionalLicensePreCondtions findBygetCI_CAI_Last(
			long cannabisApplicationId,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicensePreCondtionsException {

		return getPersistence().findBygetCI_CAI_Last(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	public static CannabisConditionalLicensePreCondtions fetchBygetCI_CAI_Last(
		long cannabisApplicationId,
		OrderByComparator<CannabisConditionalLicensePreCondtions>
			orderByComparator) {

		return getPersistence().fetchBygetCI_CAI_Last(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the cannabis conditional license pre condtionses before and after the current cannabis conditional license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis conditional license pre condtions
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	public static CannabisConditionalLicensePreCondtions[]
			findBygetCI_CAI_PrevAndNext(
				long cannabisPreconditionsId, long cannabisApplicationId,
				OrderByComparator<CannabisConditionalLicensePreCondtions>
					orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicensePreCondtionsException {

		return getPersistence().findBygetCI_CAI_PrevAndNext(
			cannabisPreconditionsId, cannabisApplicationId, orderByComparator);
	}

	/**
	 * Removes all the cannabis conditional license pre condtionses where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public static void removeBygetCI_CAI(long cannabisApplicationId) {
		getPersistence().removeBygetCI_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the number of cannabis conditional license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis conditional license pre condtionses
	 */
	public static int countBygetCI_CAI(long cannabisApplicationId) {
		return getPersistence().countBygetCI_CAI(cannabisApplicationId);
	}

	/**
	 * Returns all the cannabis conditional license pre condtionses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseId(String caseId) {

		return getPersistence().findBygetCI_CaseId(caseId);
	}

	/**
	 * Returns a range of all the cannabis conditional license pre condtionses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @return the range of matching cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseId(String caseId, int start, int end) {

		return getPersistence().findBygetCI_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseId(
			String caseId, int start, int end,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator) {

		return getPersistence().findBygetCI_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseId(
			String caseId, int start, int end,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetCI_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	public static CannabisConditionalLicensePreCondtions
			findBygetCI_CaseId_First(
				String caseId,
				OrderByComparator<CannabisConditionalLicensePreCondtions>
					orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicensePreCondtionsException {

		return getPersistence().findBygetCI_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	public static CannabisConditionalLicensePreCondtions
		fetchBygetCI_CaseId_First(
			String caseId,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator) {

		return getPersistence().fetchBygetCI_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	public static CannabisConditionalLicensePreCondtions
			findBygetCI_CaseId_Last(
				String caseId,
				OrderByComparator<CannabisConditionalLicensePreCondtions>
					orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicensePreCondtionsException {

		return getPersistence().findBygetCI_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	public static CannabisConditionalLicensePreCondtions
		fetchBygetCI_CaseId_Last(
			String caseId,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator) {

		return getPersistence().fetchBygetCI_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the cannabis conditional license pre condtionses before and after the current cannabis conditional license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis conditional license pre condtions
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	public static CannabisConditionalLicensePreCondtions[]
			findBygetCI_CaseId_PrevAndNext(
				long cannabisPreconditionsId, String caseId,
				OrderByComparator<CannabisConditionalLicensePreCondtions>
					orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicensePreCondtionsException {

		return getPersistence().findBygetCI_CaseId_PrevAndNext(
			cannabisPreconditionsId, caseId, orderByComparator);
	}

	/**
	 * Removes all the cannabis conditional license pre condtionses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetCI_CaseId(String caseId) {
		getPersistence().removeBygetCI_CaseId(caseId);
	}

	/**
	 * Returns the number of cannabis conditional license pre condtionses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis conditional license pre condtionses
	 */
	public static int countBygetCI_CaseId(String caseId) {
		return getPersistence().countBygetCI_CaseId(caseId);
	}

	/**
	 * Returns all the cannabis conditional license pre condtionses where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions>
		findBygetCI_Status(String status) {

		return getPersistence().findBygetCI_Status(status);
	}

	/**
	 * Returns a range of all the cannabis conditional license pre condtionses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @return the range of matching cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions>
		findBygetCI_Status(String status, int start, int end) {

		return getPersistence().findBygetCI_Status(status, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions>
		findBygetCI_Status(
			String status, int start, int end,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator) {

		return getPersistence().findBygetCI_Status(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions>
		findBygetCI_Status(
			String status, int start, int end,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetCI_Status(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	public static CannabisConditionalLicensePreCondtions
			findBygetCI_Status_First(
				String status,
				OrderByComparator<CannabisConditionalLicensePreCondtions>
					orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicensePreCondtionsException {

		return getPersistence().findBygetCI_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	public static CannabisConditionalLicensePreCondtions
		fetchBygetCI_Status_First(
			String status,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator) {

		return getPersistence().fetchBygetCI_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	public static CannabisConditionalLicensePreCondtions
			findBygetCI_Status_Last(
				String status,
				OrderByComparator<CannabisConditionalLicensePreCondtions>
					orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicensePreCondtionsException {

		return getPersistence().findBygetCI_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	public static CannabisConditionalLicensePreCondtions
		fetchBygetCI_Status_Last(
			String status,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator) {

		return getPersistence().fetchBygetCI_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the cannabis conditional license pre condtionses before and after the current cannabis conditional license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis conditional license pre condtions
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	public static CannabisConditionalLicensePreCondtions[]
			findBygetCI_Status_PrevAndNext(
				long cannabisPreconditionsId, String status,
				OrderByComparator<CannabisConditionalLicensePreCondtions>
					orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicensePreCondtionsException {

		return getPersistence().findBygetCI_Status_PrevAndNext(
			cannabisPreconditionsId, status, orderByComparator);
	}

	/**
	 * Removes all the cannabis conditional license pre condtionses where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetCI_Status(String status) {
		getPersistence().removeBygetCI_Status(status);
	}

	/**
	 * Returns the number of cannabis conditional license pre condtionses where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching cannabis conditional license pre condtionses
	 */
	public static int countBygetCI_Status(String status) {
		return getPersistence().countBygetCI_Status(status);
	}

	/**
	 * Returns all the cannabis conditional license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdStatus(String status, String caseId) {

		return getPersistence().findBygetCI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns a range of all the cannabis conditional license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @return the range of matching cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdStatus(
			String status, String caseId, int start, int end) {

		return getPersistence().findBygetCI_CaseIdStatus(
			status, caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdStatus(
			String status, String caseId, int start, int end,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator) {

		return getPersistence().findBygetCI_CaseIdStatus(
			status, caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdStatus(
			String status, String caseId, int start, int end,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetCI_CaseIdStatus(
			status, caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	public static CannabisConditionalLicensePreCondtions
			findBygetCI_CaseIdStatus_First(
				String status, String caseId,
				OrderByComparator<CannabisConditionalLicensePreCondtions>
					orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicensePreCondtionsException {

		return getPersistence().findBygetCI_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	public static CannabisConditionalLicensePreCondtions
		fetchBygetCI_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator) {

		return getPersistence().fetchBygetCI_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	public static CannabisConditionalLicensePreCondtions
			findBygetCI_CaseIdStatus_Last(
				String status, String caseId,
				OrderByComparator<CannabisConditionalLicensePreCondtions>
					orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicensePreCondtionsException {

		return getPersistence().findBygetCI_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	public static CannabisConditionalLicensePreCondtions
		fetchBygetCI_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator) {

		return getPersistence().fetchBygetCI_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the cannabis conditional license pre condtionses before and after the current cannabis conditional license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis conditional license pre condtions
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	public static CannabisConditionalLicensePreCondtions[]
			findBygetCI_CaseIdStatus_PrevAndNext(
				long cannabisPreconditionsId, String status, String caseId,
				OrderByComparator<CannabisConditionalLicensePreCondtions>
					orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicensePreCondtionsException {

		return getPersistence().findBygetCI_CaseIdStatus_PrevAndNext(
			cannabisPreconditionsId, status, caseId, orderByComparator);
	}

	/**
	 * Removes all the cannabis conditional license pre condtionses where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public static void removeBygetCI_CaseIdStatus(
		String status, String caseId) {

		getPersistence().removeBygetCI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns the number of cannabis conditional license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching cannabis conditional license pre condtionses
	 */
	public static int countBygetCI_CaseIdStatus(String status, String caseId) {
		return getPersistence().countBygetCI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns all the cannabis conditional license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdApplicationId(
			String status, long cannabisApplicationId) {

		return getPersistence().findBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId);
	}

	/**
	 * Returns a range of all the cannabis conditional license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @return the range of matching cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdApplicationId(
			String status, long cannabisApplicationId, int start, int end) {

		return getPersistence().findBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdApplicationId(
			String status, long cannabisApplicationId, int start, int end,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator) {

		return getPersistence().findBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdApplicationId(
			String status, long cannabisApplicationId, int start, int end,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	public static CannabisConditionalLicensePreCondtions
			findBygetCI_CaseIdApplicationId_First(
				String status, long cannabisApplicationId,
				OrderByComparator<CannabisConditionalLicensePreCondtions>
					orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicensePreCondtionsException {

		return getPersistence().findBygetCI_CaseIdApplicationId_First(
			status, cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	public static CannabisConditionalLicensePreCondtions
		fetchBygetCI_CaseIdApplicationId_First(
			String status, long cannabisApplicationId,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator) {

		return getPersistence().fetchBygetCI_CaseIdApplicationId_First(
			status, cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	public static CannabisConditionalLicensePreCondtions
			findBygetCI_CaseIdApplicationId_Last(
				String status, long cannabisApplicationId,
				OrderByComparator<CannabisConditionalLicensePreCondtions>
					orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicensePreCondtionsException {

		return getPersistence().findBygetCI_CaseIdApplicationId_Last(
			status, cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	public static CannabisConditionalLicensePreCondtions
		fetchBygetCI_CaseIdApplicationId_Last(
			String status, long cannabisApplicationId,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator) {

		return getPersistence().fetchBygetCI_CaseIdApplicationId_Last(
			status, cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the cannabis conditional license pre condtionses before and after the current cannabis conditional license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis conditional license pre condtions
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	public static CannabisConditionalLicensePreCondtions[]
			findBygetCI_CaseIdApplicationId_PrevAndNext(
				long cannabisPreconditionsId, String status,
				long cannabisApplicationId,
				OrderByComparator<CannabisConditionalLicensePreCondtions>
					orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicensePreCondtionsException {

		return getPersistence().findBygetCI_CaseIdApplicationId_PrevAndNext(
			cannabisPreconditionsId, status, cannabisApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the cannabis conditional license pre condtionses where status = &#63; and cannabisApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public static void removeBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId) {

		getPersistence().removeBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId);
	}

	/**
	 * Returns the number of cannabis conditional license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis conditional license pre condtionses
	 */
	public static int countBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId) {

		return getPersistence().countBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId);
	}

	/**
	 * Caches the cannabis conditional license pre condtions in the entity cache if it is enabled.
	 *
	 * @param cannabisConditionalLicensePreCondtions the cannabis conditional license pre condtions
	 */
	public static void cacheResult(
		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions) {

		getPersistence().cacheResult(cannabisConditionalLicensePreCondtions);
	}

	/**
	 * Caches the cannabis conditional license pre condtionses in the entity cache if it is enabled.
	 *
	 * @param cannabisConditionalLicensePreCondtionses the cannabis conditional license pre condtionses
	 */
	public static void cacheResult(
		List<CannabisConditionalLicensePreCondtions>
			cannabisConditionalLicensePreCondtionses) {

		getPersistence().cacheResult(cannabisConditionalLicensePreCondtionses);
	}

	/**
	 * Creates a new cannabis conditional license pre condtions with the primary key. Does not add the cannabis conditional license pre condtions to the database.
	 *
	 * @param cannabisPreconditionsId the primary key for the new cannabis conditional license pre condtions
	 * @return the new cannabis conditional license pre condtions
	 */
	public static CannabisConditionalLicensePreCondtions create(
		long cannabisPreconditionsId) {

		return getPersistence().create(cannabisPreconditionsId);
	}

	/**
	 * Removes the cannabis conditional license pre condtions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisPreconditionsId the primary key of the cannabis conditional license pre condtions
	 * @return the cannabis conditional license pre condtions that was removed
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	public static CannabisConditionalLicensePreCondtions remove(
			long cannabisPreconditionsId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicensePreCondtionsException {

		return getPersistence().remove(cannabisPreconditionsId);
	}

	public static CannabisConditionalLicensePreCondtions updateImpl(
		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions) {

		return getPersistence().updateImpl(
			cannabisConditionalLicensePreCondtions);
	}

	/**
	 * Returns the cannabis conditional license pre condtions with the primary key or throws a <code>NoSuchCannabisConditionalLicensePreCondtionsException</code> if it could not be found.
	 *
	 * @param cannabisPreconditionsId the primary key of the cannabis conditional license pre condtions
	 * @return the cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	public static CannabisConditionalLicensePreCondtions findByPrimaryKey(
			long cannabisPreconditionsId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicensePreCondtionsException {

		return getPersistence().findByPrimaryKey(cannabisPreconditionsId);
	}

	/**
	 * Returns the cannabis conditional license pre condtions with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisPreconditionsId the primary key of the cannabis conditional license pre condtions
	 * @return the cannabis conditional license pre condtions, or <code>null</code> if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	public static CannabisConditionalLicensePreCondtions fetchByPrimaryKey(
		long cannabisPreconditionsId) {

		return getPersistence().fetchByPrimaryKey(cannabisPreconditionsId);
	}

	/**
	 * Returns all the cannabis conditional license pre condtionses.
	 *
	 * @return the cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis conditional license pre condtionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @return the range of cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions> findAll(
		int start, int end,
		OrderByComparator<CannabisConditionalLicensePreCondtions>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis conditional license pre condtionses
	 */
	public static List<CannabisConditionalLicensePreCondtions> findAll(
		int start, int end,
		OrderByComparator<CannabisConditionalLicensePreCondtions>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis conditional license pre condtionses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis conditional license pre condtionses.
	 *
	 * @return the number of cannabis conditional license pre condtionses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisConditionalLicensePreCondtionsPersistence
		getPersistence() {

		return _persistence;
	}

	private static volatile CannabisConditionalLicensePreCondtionsPersistence
		_persistence;

}