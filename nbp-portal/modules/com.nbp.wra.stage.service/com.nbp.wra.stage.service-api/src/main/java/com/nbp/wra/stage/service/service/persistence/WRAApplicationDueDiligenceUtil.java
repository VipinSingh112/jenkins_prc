/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.wra.stage.service.model.WRAApplicationDueDiligence;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the wra application due diligence service. This utility wraps <code>com.nbp.wra.stage.service.service.persistence.impl.WRAApplicationDueDiligencePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WRAApplicationDueDiligencePersistence
 * @generated
 */
public class WRAApplicationDueDiligenceUtil {

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
		WRAApplicationDueDiligence wraApplicationDueDiligence) {

		getPersistence().clearCache(wraApplicationDueDiligence);
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
	public static Map<Serializable, WRAApplicationDueDiligence>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<WRAApplicationDueDiligence> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<WRAApplicationDueDiligence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<WRAApplicationDueDiligence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static WRAApplicationDueDiligence update(
		WRAApplicationDueDiligence wraApplicationDueDiligence) {

		return getPersistence().update(wraApplicationDueDiligence);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static WRAApplicationDueDiligence update(
		WRAApplicationDueDiligence wraApplicationDueDiligence,
		ServiceContext serviceContext) {

		return getPersistence().update(
			wraApplicationDueDiligence, serviceContext);
	}

	/**
	 * Returns the wra application due diligence where caseId = &#63; or throws a <code>NoSuchWRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a matching wra application due diligence could not be found
	 */
	public static WRAApplicationDueDiligence findBygetWRADD_By_CAI(
			String caseId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWRAApplicationDueDiligenceException {

		return getPersistence().findBygetWRADD_By_CAI(caseId);
	}

	/**
	 * Returns the wra application due diligence where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	public static WRAApplicationDueDiligence fetchBygetWRADD_By_CAI(
		String caseId) {

		return getPersistence().fetchBygetWRADD_By_CAI(caseId);
	}

	/**
	 * Returns the wra application due diligence where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	public static WRAApplicationDueDiligence fetchBygetWRADD_By_CAI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetWRADD_By_CAI(caseId, useFinderCache);
	}

	/**
	 * Removes the wra application due diligence where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the wra application due diligence that was removed
	 */
	public static WRAApplicationDueDiligence removeBygetWRADD_By_CAI(
			String caseId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWRAApplicationDueDiligenceException {

		return getPersistence().removeBygetWRADD_By_CAI(caseId);
	}

	/**
	 * Returns the number of wra application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra application due diligences
	 */
	public static int countBygetWRADD_By_CAI(String caseId) {
		return getPersistence().countBygetWRADD_By_CAI(caseId);
	}

	/**
	 * Returns the wra application due diligence where wraApplicationId = &#63; or throws a <code>NoSuchWRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a matching wra application due diligence could not be found
	 */
	public static WRAApplicationDueDiligence findBygetWRAADD_CAI(
			long wraApplicationId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWRAApplicationDueDiligenceException {

		return getPersistence().findBygetWRAADD_CAI(wraApplicationId);
	}

	/**
	 * Returns the wra application due diligence where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	public static WRAApplicationDueDiligence fetchBygetWRAADD_CAI(
		long wraApplicationId) {

		return getPersistence().fetchBygetWRAADD_CAI(wraApplicationId);
	}

	/**
	 * Returns the wra application due diligence where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	public static WRAApplicationDueDiligence fetchBygetWRAADD_CAI(
		long wraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetWRAADD_CAI(
			wraApplicationId, useFinderCache);
	}

	/**
	 * Removes the wra application due diligence where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the wra application due diligence that was removed
	 */
	public static WRAApplicationDueDiligence removeBygetWRAADD_CAI(
			long wraApplicationId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWRAApplicationDueDiligenceException {

		return getPersistence().removeBygetWRAADD_CAI(wraApplicationId);
	}

	/**
	 * Returns the number of wra application due diligences where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra application due diligences
	 */
	public static int countBygetWRAADD_CAI(long wraApplicationId) {
		return getPersistence().countBygetWRAADD_CAI(wraApplicationId);
	}

	/**
	 * Returns the wra application due diligence where caseId = &#63; and agencyName = &#63; or throws a <code>NoSuchWRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a matching wra application due diligence could not be found
	 */
	public static WRAApplicationDueDiligence findBygetWRAADD_CaseIdAgnecyName(
			String caseId, String agencyName)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWRAApplicationDueDiligenceException {

		return getPersistence().findBygetWRAADD_CaseIdAgnecyName(
			caseId, agencyName);
	}

	/**
	 * Returns the wra application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	public static WRAApplicationDueDiligence fetchBygetWRAADD_CaseIdAgnecyName(
		String caseId, String agencyName) {

		return getPersistence().fetchBygetWRAADD_CaseIdAgnecyName(
			caseId, agencyName);
	}

	/**
	 * Returns the wra application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	public static WRAApplicationDueDiligence fetchBygetWRAADD_CaseIdAgnecyName(
		String caseId, String agencyName, boolean useFinderCache) {

		return getPersistence().fetchBygetWRAADD_CaseIdAgnecyName(
			caseId, agencyName, useFinderCache);
	}

	/**
	 * Removes the wra application due diligence where caseId = &#63; and agencyName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the wra application due diligence that was removed
	 */
	public static WRAApplicationDueDiligence removeBygetWRAADD_CaseIdAgnecyName(
			String caseId, String agencyName)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWRAApplicationDueDiligenceException {

		return getPersistence().removeBygetWRAADD_CaseIdAgnecyName(
			caseId, agencyName);
	}

	/**
	 * Returns the number of wra application due diligences where caseId = &#63; and agencyName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the number of matching wra application due diligences
	 */
	public static int countBygetWRAADD_CaseIdAgnecyName(
		String caseId, String agencyName) {

		return getPersistence().countBygetWRAADD_CaseIdAgnecyName(
			caseId, agencyName);
	}

	/**
	 * Returns all the wra application due diligences where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @return the matching wra application due diligences
	 */
	public static List<WRAApplicationDueDiligence> findBygetWRADD_AgnecyName(
		String agencyName) {

		return getPersistence().findBygetWRADD_AgnecyName(agencyName);
	}

	/**
	 * Returns a range of all the wra application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @return the range of matching wra application due diligences
	 */
	public static List<WRAApplicationDueDiligence> findBygetWRADD_AgnecyName(
		String agencyName, int start, int end) {

		return getPersistence().findBygetWRADD_AgnecyName(
			agencyName, start, end);
	}

	/**
	 * Returns an ordered range of all the wra application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra application due diligences
	 */
	public static List<WRAApplicationDueDiligence> findBygetWRADD_AgnecyName(
		String agencyName, int start, int end,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator) {

		return getPersistence().findBygetWRADD_AgnecyName(
			agencyName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra application due diligences
	 */
	public static List<WRAApplicationDueDiligence> findBygetWRADD_AgnecyName(
		String agencyName, int start, int end,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetWRADD_AgnecyName(
			agencyName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first wra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a matching wra application due diligence could not be found
	 */
	public static WRAApplicationDueDiligence findBygetWRADD_AgnecyName_First(
			String agencyName,
			OrderByComparator<WRAApplicationDueDiligence> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWRAApplicationDueDiligenceException {

		return getPersistence().findBygetWRADD_AgnecyName_First(
			agencyName, orderByComparator);
	}

	/**
	 * Returns the first wra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	public static WRAApplicationDueDiligence fetchBygetWRADD_AgnecyName_First(
		String agencyName,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator) {

		return getPersistence().fetchBygetWRADD_AgnecyName_First(
			agencyName, orderByComparator);
	}

	/**
	 * Returns the last wra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a matching wra application due diligence could not be found
	 */
	public static WRAApplicationDueDiligence findBygetWRADD_AgnecyName_Last(
			String agencyName,
			OrderByComparator<WRAApplicationDueDiligence> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWRAApplicationDueDiligenceException {

		return getPersistence().findBygetWRADD_AgnecyName_Last(
			agencyName, orderByComparator);
	}

	/**
	 * Returns the last wra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	public static WRAApplicationDueDiligence fetchBygetWRADD_AgnecyName_Last(
		String agencyName,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator) {

		return getPersistence().fetchBygetWRADD_AgnecyName_Last(
			agencyName, orderByComparator);
	}

	/**
	 * Returns the wra application due diligences before and after the current wra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param wRAApplicationDueDiligenceId the primary key of the current wra application due diligence
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a wra application due diligence with the primary key could not be found
	 */
	public static WRAApplicationDueDiligence[]
			findBygetWRADD_AgnecyName_PrevAndNext(
				long wRAApplicationDueDiligenceId, String agencyName,
				OrderByComparator<WRAApplicationDueDiligence> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWRAApplicationDueDiligenceException {

		return getPersistence().findBygetWRADD_AgnecyName_PrevAndNext(
			wRAApplicationDueDiligenceId, agencyName, orderByComparator);
	}

	/**
	 * Removes all the wra application due diligences where agencyName = &#63; from the database.
	 *
	 * @param agencyName the agency name
	 */
	public static void removeBygetWRADD_AgnecyName(String agencyName) {
		getPersistence().removeBygetWRADD_AgnecyName(agencyName);
	}

	/**
	 * Returns the number of wra application due diligences where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @return the number of matching wra application due diligences
	 */
	public static int countBygetWRADD_AgnecyName(String agencyName) {
		return getPersistence().countBygetWRADD_AgnecyName(agencyName);
	}

	/**
	 * Returns all the wra application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application due diligences
	 */
	public static List<WRAApplicationDueDiligence> findBygetWRADD_CaseId(
		String caseId) {

		return getPersistence().findBygetWRADD_CaseId(caseId);
	}

	/**
	 * Returns a range of all the wra application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @return the range of matching wra application due diligences
	 */
	public static List<WRAApplicationDueDiligence> findBygetWRADD_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetWRADD_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the wra application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra application due diligences
	 */
	public static List<WRAApplicationDueDiligence> findBygetWRADD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator) {

		return getPersistence().findBygetWRADD_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra application due diligences
	 */
	public static List<WRAApplicationDueDiligence> findBygetWRADD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetWRADD_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first wra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a matching wra application due diligence could not be found
	 */
	public static WRAApplicationDueDiligence findBygetWRADD_CaseId_First(
			String caseId,
			OrderByComparator<WRAApplicationDueDiligence> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWRAApplicationDueDiligenceException {

		return getPersistence().findBygetWRADD_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first wra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	public static WRAApplicationDueDiligence fetchBygetWRADD_CaseId_First(
		String caseId,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator) {

		return getPersistence().fetchBygetWRADD_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last wra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a matching wra application due diligence could not be found
	 */
	public static WRAApplicationDueDiligence findBygetWRADD_CaseId_Last(
			String caseId,
			OrderByComparator<WRAApplicationDueDiligence> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWRAApplicationDueDiligenceException {

		return getPersistence().findBygetWRADD_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last wra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	public static WRAApplicationDueDiligence fetchBygetWRADD_CaseId_Last(
		String caseId,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator) {

		return getPersistence().fetchBygetWRADD_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the wra application due diligences before and after the current wra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param wRAApplicationDueDiligenceId the primary key of the current wra application due diligence
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a wra application due diligence with the primary key could not be found
	 */
	public static WRAApplicationDueDiligence[]
			findBygetWRADD_CaseId_PrevAndNext(
				long wRAApplicationDueDiligenceId, String caseId,
				OrderByComparator<WRAApplicationDueDiligence> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWRAApplicationDueDiligenceException {

		return getPersistence().findBygetWRADD_CaseId_PrevAndNext(
			wRAApplicationDueDiligenceId, caseId, orderByComparator);
	}

	/**
	 * Removes all the wra application due diligences where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetWRADD_CaseId(String caseId) {
		getPersistence().removeBygetWRADD_CaseId(caseId);
	}

	/**
	 * Returns the number of wra application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra application due diligences
	 */
	public static int countBygetWRADD_CaseId(String caseId) {
		return getPersistence().countBygetWRADD_CaseId(caseId);
	}

	/**
	 * Caches the wra application due diligence in the entity cache if it is enabled.
	 *
	 * @param wraApplicationDueDiligence the wra application due diligence
	 */
	public static void cacheResult(
		WRAApplicationDueDiligence wraApplicationDueDiligence) {

		getPersistence().cacheResult(wraApplicationDueDiligence);
	}

	/**
	 * Caches the wra application due diligences in the entity cache if it is enabled.
	 *
	 * @param wraApplicationDueDiligences the wra application due diligences
	 */
	public static void cacheResult(
		List<WRAApplicationDueDiligence> wraApplicationDueDiligences) {

		getPersistence().cacheResult(wraApplicationDueDiligences);
	}

	/**
	 * Creates a new wra application due diligence with the primary key. Does not add the wra application due diligence to the database.
	 *
	 * @param wRAApplicationDueDiligenceId the primary key for the new wra application due diligence
	 * @return the new wra application due diligence
	 */
	public static WRAApplicationDueDiligence create(
		long wRAApplicationDueDiligenceId) {

		return getPersistence().create(wRAApplicationDueDiligenceId);
	}

	/**
	 * Removes the wra application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wRAApplicationDueDiligenceId the primary key of the wra application due diligence
	 * @return the wra application due diligence that was removed
	 * @throws NoSuchWRAApplicationDueDiligenceException if a wra application due diligence with the primary key could not be found
	 */
	public static WRAApplicationDueDiligence remove(
			long wRAApplicationDueDiligenceId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWRAApplicationDueDiligenceException {

		return getPersistence().remove(wRAApplicationDueDiligenceId);
	}

	public static WRAApplicationDueDiligence updateImpl(
		WRAApplicationDueDiligence wraApplicationDueDiligence) {

		return getPersistence().updateImpl(wraApplicationDueDiligence);
	}

	/**
	 * Returns the wra application due diligence with the primary key or throws a <code>NoSuchWRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param wRAApplicationDueDiligenceId the primary key of the wra application due diligence
	 * @return the wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a wra application due diligence with the primary key could not be found
	 */
	public static WRAApplicationDueDiligence findByPrimaryKey(
			long wRAApplicationDueDiligenceId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWRAApplicationDueDiligenceException {

		return getPersistence().findByPrimaryKey(wRAApplicationDueDiligenceId);
	}

	/**
	 * Returns the wra application due diligence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wRAApplicationDueDiligenceId the primary key of the wra application due diligence
	 * @return the wra application due diligence, or <code>null</code> if a wra application due diligence with the primary key could not be found
	 */
	public static WRAApplicationDueDiligence fetchByPrimaryKey(
		long wRAApplicationDueDiligenceId) {

		return getPersistence().fetchByPrimaryKey(wRAApplicationDueDiligenceId);
	}

	/**
	 * Returns all the wra application due diligences.
	 *
	 * @return the wra application due diligences
	 */
	public static List<WRAApplicationDueDiligence> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the wra application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @return the range of wra application due diligences
	 */
	public static List<WRAApplicationDueDiligence> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the wra application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra application due diligences
	 */
	public static List<WRAApplicationDueDiligence> findAll(
		int start, int end,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra application due diligences
	 */
	public static List<WRAApplicationDueDiligence> findAll(
		int start, int end,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the wra application due diligences from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of wra application due diligences.
	 *
	 * @return the number of wra application due diligences
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static WRAApplicationDueDiligencePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		WRAApplicationDueDiligencePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile WRAApplicationDueDiligencePersistence _persistence;

}