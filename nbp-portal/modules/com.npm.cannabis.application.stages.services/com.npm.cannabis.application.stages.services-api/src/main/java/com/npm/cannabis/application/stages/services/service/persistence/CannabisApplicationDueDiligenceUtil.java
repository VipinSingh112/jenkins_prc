/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.npm.cannabis.application.stages.services.model.CannabisApplicationDueDiligence;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis application due diligence service. This utility wraps <code>com.npm.cannabis.application.stages.services.service.persistence.impl.CannabisApplicationDueDiligencePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationDueDiligencePersistence
 * @generated
 */
public class CannabisApplicationDueDiligenceUtil {

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
		CannabisApplicationDueDiligence cannabisApplicationDueDiligence) {

		getPersistence().clearCache(cannabisApplicationDueDiligence);
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
	public static Map<Serializable, CannabisApplicationDueDiligence>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisApplicationDueDiligence> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisApplicationDueDiligence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisApplicationDueDiligence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisApplicationDueDiligence update(
		CannabisApplicationDueDiligence cannabisApplicationDueDiligence) {

		return getPersistence().update(cannabisApplicationDueDiligence);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisApplicationDueDiligence update(
		CannabisApplicationDueDiligence cannabisApplicationDueDiligence,
		ServiceContext serviceContext) {

		return getPersistence().update(
			cannabisApplicationDueDiligence, serviceContext);
	}

	/**
	 * Returns the cannabis application due diligence where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a matching cannabis application due diligence could not be found
	 */
	public static CannabisApplicationDueDiligence findBygetCADD_CAI(
			long cannabisApplicationId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationDueDiligenceException {

		return getPersistence().findBygetCADD_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis application due diligence where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	public static CannabisApplicationDueDiligence fetchBygetCADD_CAI(
		long cannabisApplicationId) {

		return getPersistence().fetchBygetCADD_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis application due diligence where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	public static CannabisApplicationDueDiligence fetchBygetCADD_CAI(
		long cannabisApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCADD_CAI(
			cannabisApplicationId, useFinderCache);
	}

	/**
	 * Removes the cannabis application due diligence where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis application due diligence that was removed
	 */
	public static CannabisApplicationDueDiligence removeBygetCADD_CAI(
			long cannabisApplicationId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationDueDiligenceException {

		return getPersistence().removeBygetCADD_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the number of cannabis application due diligences where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis application due diligences
	 */
	public static int countBygetCADD_CAI(long cannabisApplicationId) {
		return getPersistence().countBygetCADD_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis application due diligence where caseId = &#63; and agencyName = &#63; or throws a <code>NoSuchCannabisApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a matching cannabis application due diligence could not be found
	 */
	public static CannabisApplicationDueDiligence
			findBygetCADD_CaseIdAgnecyName(String caseId, String agencyName)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationDueDiligenceException {

		return getPersistence().findBygetCADD_CaseIdAgnecyName(
			caseId, agencyName);
	}

	/**
	 * Returns the cannabis application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	public static CannabisApplicationDueDiligence
		fetchBygetCADD_CaseIdAgnecyName(String caseId, String agencyName) {

		return getPersistence().fetchBygetCADD_CaseIdAgnecyName(
			caseId, agencyName);
	}

	/**
	 * Returns the cannabis application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	public static CannabisApplicationDueDiligence
		fetchBygetCADD_CaseIdAgnecyName(
			String caseId, String agencyName, boolean useFinderCache) {

		return getPersistence().fetchBygetCADD_CaseIdAgnecyName(
			caseId, agencyName, useFinderCache);
	}

	/**
	 * Removes the cannabis application due diligence where caseId = &#63; and agencyName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the cannabis application due diligence that was removed
	 */
	public static CannabisApplicationDueDiligence
			removeBygetCADD_CaseIdAgnecyName(String caseId, String agencyName)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationDueDiligenceException {

		return getPersistence().removeBygetCADD_CaseIdAgnecyName(
			caseId, agencyName);
	}

	/**
	 * Returns the number of cannabis application due diligences where caseId = &#63; and agencyName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the number of matching cannabis application due diligences
	 */
	public static int countBygetCADD_CaseIdAgnecyName(
		String caseId, String agencyName) {

		return getPersistence().countBygetCADD_CaseIdAgnecyName(
			caseId, agencyName);
	}

	/**
	 * Returns all the cannabis application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis application due diligences
	 */
	public static List<CannabisApplicationDueDiligence> findBygetCADD_CaseId(
		String caseId) {

		return getPersistence().findBygetCADD_CaseId(caseId);
	}

	/**
	 * Returns a range of all the cannabis application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @return the range of matching cannabis application due diligences
	 */
	public static List<CannabisApplicationDueDiligence> findBygetCADD_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetCADD_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application due diligences
	 */
	public static List<CannabisApplicationDueDiligence> findBygetCADD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator) {

		return getPersistence().findBygetCADD_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application due diligences
	 */
	public static List<CannabisApplicationDueDiligence> findBygetCADD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCADD_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a matching cannabis application due diligence could not be found
	 */
	public static CannabisApplicationDueDiligence findBygetCADD_CaseId_First(
			String caseId,
			OrderByComparator<CannabisApplicationDueDiligence>
				orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationDueDiligenceException {

		return getPersistence().findBygetCADD_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first cannabis application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	public static CannabisApplicationDueDiligence fetchBygetCADD_CaseId_First(
		String caseId,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator) {

		return getPersistence().fetchBygetCADD_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last cannabis application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a matching cannabis application due diligence could not be found
	 */
	public static CannabisApplicationDueDiligence findBygetCADD_CaseId_Last(
			String caseId,
			OrderByComparator<CannabisApplicationDueDiligence>
				orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationDueDiligenceException {

		return getPersistence().findBygetCADD_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last cannabis application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	public static CannabisApplicationDueDiligence fetchBygetCADD_CaseId_Last(
		String caseId,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator) {

		return getPersistence().fetchBygetCADD_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the cannabis application due diligences before and after the current cannabis application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisAppDDId the primary key of the current cannabis application due diligence
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a cannabis application due diligence with the primary key could not be found
	 */
	public static CannabisApplicationDueDiligence[]
			findBygetCADD_CaseId_PrevAndNext(
				long cannabisAppDDId, String caseId,
				OrderByComparator<CannabisApplicationDueDiligence>
					orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationDueDiligenceException {

		return getPersistence().findBygetCADD_CaseId_PrevAndNext(
			cannabisAppDDId, caseId, orderByComparator);
	}

	/**
	 * Removes all the cannabis application due diligences where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetCADD_CaseId(String caseId) {
		getPersistence().removeBygetCADD_CaseId(caseId);
	}

	/**
	 * Returns the number of cannabis application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis application due diligences
	 */
	public static int countBygetCADD_CaseId(String caseId) {
		return getPersistence().countBygetCADD_CaseId(caseId);
	}

	/**
	 * Returns all the cannabis application due diligences where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching cannabis application due diligences
	 */
	public static List<CannabisApplicationDueDiligence> findBygetCADD_Status(
		String status) {

		return getPersistence().findBygetCADD_Status(status);
	}

	/**
	 * Returns a range of all the cannabis application due diligences where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @return the range of matching cannabis application due diligences
	 */
	public static List<CannabisApplicationDueDiligence> findBygetCADD_Status(
		String status, int start, int end) {

		return getPersistence().findBygetCADD_Status(status, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application due diligences where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application due diligences
	 */
	public static List<CannabisApplicationDueDiligence> findBygetCADD_Status(
		String status, int start, int end,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator) {

		return getPersistence().findBygetCADD_Status(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application due diligences where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application due diligences
	 */
	public static List<CannabisApplicationDueDiligence> findBygetCADD_Status(
		String status, int start, int end,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCADD_Status(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis application due diligence in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a matching cannabis application due diligence could not be found
	 */
	public static CannabisApplicationDueDiligence findBygetCADD_Status_First(
			String status,
			OrderByComparator<CannabisApplicationDueDiligence>
				orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationDueDiligenceException {

		return getPersistence().findBygetCADD_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first cannabis application due diligence in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	public static CannabisApplicationDueDiligence fetchBygetCADD_Status_First(
		String status,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator) {

		return getPersistence().fetchBygetCADD_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last cannabis application due diligence in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a matching cannabis application due diligence could not be found
	 */
	public static CannabisApplicationDueDiligence findBygetCADD_Status_Last(
			String status,
			OrderByComparator<CannabisApplicationDueDiligence>
				orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationDueDiligenceException {

		return getPersistence().findBygetCADD_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last cannabis application due diligence in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	public static CannabisApplicationDueDiligence fetchBygetCADD_Status_Last(
		String status,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator) {

		return getPersistence().fetchBygetCADD_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the cannabis application due diligences before and after the current cannabis application due diligence in the ordered set where status = &#63;.
	 *
	 * @param cannabisAppDDId the primary key of the current cannabis application due diligence
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a cannabis application due diligence with the primary key could not be found
	 */
	public static CannabisApplicationDueDiligence[]
			findBygetCADD_Status_PrevAndNext(
				long cannabisAppDDId, String status,
				OrderByComparator<CannabisApplicationDueDiligence>
					orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationDueDiligenceException {

		return getPersistence().findBygetCADD_Status_PrevAndNext(
			cannabisAppDDId, status, orderByComparator);
	}

	/**
	 * Removes all the cannabis application due diligences where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetCADD_Status(String status) {
		getPersistence().removeBygetCADD_Status(status);
	}

	/**
	 * Returns the number of cannabis application due diligences where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching cannabis application due diligences
	 */
	public static int countBygetCADD_Status(String status) {
		return getPersistence().countBygetCADD_Status(status);
	}

	/**
	 * Caches the cannabis application due diligence in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationDueDiligence the cannabis application due diligence
	 */
	public static void cacheResult(
		CannabisApplicationDueDiligence cannabisApplicationDueDiligence) {

		getPersistence().cacheResult(cannabisApplicationDueDiligence);
	}

	/**
	 * Caches the cannabis application due diligences in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationDueDiligences the cannabis application due diligences
	 */
	public static void cacheResult(
		List<CannabisApplicationDueDiligence>
			cannabisApplicationDueDiligences) {

		getPersistence().cacheResult(cannabisApplicationDueDiligences);
	}

	/**
	 * Creates a new cannabis application due diligence with the primary key. Does not add the cannabis application due diligence to the database.
	 *
	 * @param cannabisAppDDId the primary key for the new cannabis application due diligence
	 * @return the new cannabis application due diligence
	 */
	public static CannabisApplicationDueDiligence create(long cannabisAppDDId) {
		return getPersistence().create(cannabisAppDDId);
	}

	/**
	 * Removes the cannabis application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisAppDDId the primary key of the cannabis application due diligence
	 * @return the cannabis application due diligence that was removed
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a cannabis application due diligence with the primary key could not be found
	 */
	public static CannabisApplicationDueDiligence remove(long cannabisAppDDId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationDueDiligenceException {

		return getPersistence().remove(cannabisAppDDId);
	}

	public static CannabisApplicationDueDiligence updateImpl(
		CannabisApplicationDueDiligence cannabisApplicationDueDiligence) {

		return getPersistence().updateImpl(cannabisApplicationDueDiligence);
	}

	/**
	 * Returns the cannabis application due diligence with the primary key or throws a <code>NoSuchCannabisApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param cannabisAppDDId the primary key of the cannabis application due diligence
	 * @return the cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a cannabis application due diligence with the primary key could not be found
	 */
	public static CannabisApplicationDueDiligence findByPrimaryKey(
			long cannabisAppDDId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationDueDiligenceException {

		return getPersistence().findByPrimaryKey(cannabisAppDDId);
	}

	/**
	 * Returns the cannabis application due diligence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisAppDDId the primary key of the cannabis application due diligence
	 * @return the cannabis application due diligence, or <code>null</code> if a cannabis application due diligence with the primary key could not be found
	 */
	public static CannabisApplicationDueDiligence fetchByPrimaryKey(
		long cannabisAppDDId) {

		return getPersistence().fetchByPrimaryKey(cannabisAppDDId);
	}

	/**
	 * Returns all the cannabis application due diligences.
	 *
	 * @return the cannabis application due diligences
	 */
	public static List<CannabisApplicationDueDiligence> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @return the range of cannabis application due diligences
	 */
	public static List<CannabisApplicationDueDiligence> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application due diligences
	 */
	public static List<CannabisApplicationDueDiligence> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application due diligences
	 */
	public static List<CannabisApplicationDueDiligence> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis application due diligences from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis application due diligences.
	 *
	 * @return the number of cannabis application due diligences
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisApplicationDueDiligencePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CannabisApplicationDueDiligencePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CannabisApplicationDueDiligencePersistence
		_persistence;

}