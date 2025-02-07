/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.stage.services.model.HSRAApplicationDueDiligence;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the hsra application due diligence service. This utility wraps <code>com.nbp.hsra.stage.services.service.persistence.impl.HSRAApplicationDueDiligencePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HSRAApplicationDueDiligencePersistence
 * @generated
 */
public class HSRAApplicationDueDiligenceUtil {

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
		HSRAApplicationDueDiligence hsraApplicationDueDiligence) {

		getPersistence().clearCache(hsraApplicationDueDiligence);
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
	public static Map<Serializable, HSRAApplicationDueDiligence>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HSRAApplicationDueDiligence> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HSRAApplicationDueDiligence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HSRAApplicationDueDiligence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HSRAApplicationDueDiligence update(
		HSRAApplicationDueDiligence hsraApplicationDueDiligence) {

		return getPersistence().update(hsraApplicationDueDiligence);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HSRAApplicationDueDiligence update(
		HSRAApplicationDueDiligence hsraApplicationDueDiligence,
		ServiceContext serviceContext) {

		return getPersistence().update(
			hsraApplicationDueDiligence, serviceContext);
	}

	/**
	 * Returns the hsra application due diligence where caseId = &#63; or throws a <code>NoSuchHSRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a matching hsra application due diligence could not be found
	 */
	public static HSRAApplicationDueDiligence findBygetHSRADD_By_CAI(
			String caseId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationDueDiligenceException {

		return getPersistence().findBygetHSRADD_By_CAI(caseId);
	}

	/**
	 * Returns the hsra application due diligence where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	public static HSRAApplicationDueDiligence fetchBygetHSRADD_By_CAI(
		String caseId) {

		return getPersistence().fetchBygetHSRADD_By_CAI(caseId);
	}

	/**
	 * Returns the hsra application due diligence where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	public static HSRAApplicationDueDiligence fetchBygetHSRADD_By_CAI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetHSRADD_By_CAI(caseId, useFinderCache);
	}

	/**
	 * Removes the hsra application due diligence where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the hsra application due diligence that was removed
	 */
	public static HSRAApplicationDueDiligence removeBygetHSRADD_By_CAI(
			String caseId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationDueDiligenceException {

		return getPersistence().removeBygetHSRADD_By_CAI(caseId);
	}

	/**
	 * Returns the number of hsra application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra application due diligences
	 */
	public static int countBygetHSRADD_By_CAI(String caseId) {
		return getPersistence().countBygetHSRADD_By_CAI(caseId);
	}

	/**
	 * Returns the hsra application due diligence where hsraApplicationId = &#63; or throws a <code>NoSuchHSRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a matching hsra application due diligence could not be found
	 */
	public static HSRAApplicationDueDiligence findBygetHSRADD_CAI(
			long hsraApplicationId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationDueDiligenceException {

		return getPersistence().findBygetHSRADD_CAI(hsraApplicationId);
	}

	/**
	 * Returns the hsra application due diligence where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	public static HSRAApplicationDueDiligence fetchBygetHSRADD_CAI(
		long hsraApplicationId) {

		return getPersistence().fetchBygetHSRADD_CAI(hsraApplicationId);
	}

	/**
	 * Returns the hsra application due diligence where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	public static HSRAApplicationDueDiligence fetchBygetHSRADD_CAI(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHSRADD_CAI(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the hsra application due diligence where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the hsra application due diligence that was removed
	 */
	public static HSRAApplicationDueDiligence removeBygetHSRADD_CAI(
			long hsraApplicationId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationDueDiligenceException {

		return getPersistence().removeBygetHSRADD_CAI(hsraApplicationId);
	}

	/**
	 * Returns the number of hsra application due diligences where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra application due diligences
	 */
	public static int countBygetHSRADD_CAI(long hsraApplicationId) {
		return getPersistence().countBygetHSRADD_CAI(hsraApplicationId);
	}

	/**
	 * Returns the hsra application due diligence where caseId = &#63; and agencyName = &#63; or throws a <code>NoSuchHSRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a matching hsra application due diligence could not be found
	 */
	public static HSRAApplicationDueDiligence findBygetHSRADD_CaseIdAgnecyName(
			String caseId, String agencyName)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationDueDiligenceException {

		return getPersistence().findBygetHSRADD_CaseIdAgnecyName(
			caseId, agencyName);
	}

	/**
	 * Returns the hsra application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	public static HSRAApplicationDueDiligence fetchBygetHSRADD_CaseIdAgnecyName(
		String caseId, String agencyName) {

		return getPersistence().fetchBygetHSRADD_CaseIdAgnecyName(
			caseId, agencyName);
	}

	/**
	 * Returns the hsra application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	public static HSRAApplicationDueDiligence fetchBygetHSRADD_CaseIdAgnecyName(
		String caseId, String agencyName, boolean useFinderCache) {

		return getPersistence().fetchBygetHSRADD_CaseIdAgnecyName(
			caseId, agencyName, useFinderCache);
	}

	/**
	 * Removes the hsra application due diligence where caseId = &#63; and agencyName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the hsra application due diligence that was removed
	 */
	public static HSRAApplicationDueDiligence
			removeBygetHSRADD_CaseIdAgnecyName(String caseId, String agencyName)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationDueDiligenceException {

		return getPersistence().removeBygetHSRADD_CaseIdAgnecyName(
			caseId, agencyName);
	}

	/**
	 * Returns the number of hsra application due diligences where caseId = &#63; and agencyName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the number of matching hsra application due diligences
	 */
	public static int countBygetHSRADD_CaseIdAgnecyName(
		String caseId, String agencyName) {

		return getPersistence().countBygetHSRADD_CaseIdAgnecyName(
			caseId, agencyName);
	}

	/**
	 * Returns all the hsra application due diligences where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @return the matching hsra application due diligences
	 */
	public static List<HSRAApplicationDueDiligence> findBygetHSRADD_AgnecyName(
		String agencyName) {

		return getPersistence().findBygetHSRADD_AgnecyName(agencyName);
	}

	/**
	 * Returns a range of all the hsra application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @return the range of matching hsra application due diligences
	 */
	public static List<HSRAApplicationDueDiligence> findBygetHSRADD_AgnecyName(
		String agencyName, int start, int end) {

		return getPersistence().findBygetHSRADD_AgnecyName(
			agencyName, start, end);
	}

	/**
	 * Returns an ordered range of all the hsra application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application due diligences
	 */
	public static List<HSRAApplicationDueDiligence> findBygetHSRADD_AgnecyName(
		String agencyName, int start, int end,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator) {

		return getPersistence().findBygetHSRADD_AgnecyName(
			agencyName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application due diligences
	 */
	public static List<HSRAApplicationDueDiligence> findBygetHSRADD_AgnecyName(
		String agencyName, int start, int end,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHSRADD_AgnecyName(
			agencyName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first hsra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a matching hsra application due diligence could not be found
	 */
	public static HSRAApplicationDueDiligence findBygetHSRADD_AgnecyName_First(
			String agencyName,
			OrderByComparator<HSRAApplicationDueDiligence> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationDueDiligenceException {

		return getPersistence().findBygetHSRADD_AgnecyName_First(
			agencyName, orderByComparator);
	}

	/**
	 * Returns the first hsra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	public static HSRAApplicationDueDiligence fetchBygetHSRADD_AgnecyName_First(
		String agencyName,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator) {

		return getPersistence().fetchBygetHSRADD_AgnecyName_First(
			agencyName, orderByComparator);
	}

	/**
	 * Returns the last hsra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a matching hsra application due diligence could not be found
	 */
	public static HSRAApplicationDueDiligence findBygetHSRADD_AgnecyName_Last(
			String agencyName,
			OrderByComparator<HSRAApplicationDueDiligence> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationDueDiligenceException {

		return getPersistence().findBygetHSRADD_AgnecyName_Last(
			agencyName, orderByComparator);
	}

	/**
	 * Returns the last hsra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	public static HSRAApplicationDueDiligence fetchBygetHSRADD_AgnecyName_Last(
		String agencyName,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator) {

		return getPersistence().fetchBygetHSRADD_AgnecyName_Last(
			agencyName, orderByComparator);
	}

	/**
	 * Returns the hsra application due diligences before and after the current hsra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param hsraAppDDId the primary key of the current hsra application due diligence
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a hsra application due diligence with the primary key could not be found
	 */
	public static HSRAApplicationDueDiligence[]
			findBygetHSRADD_AgnecyName_PrevAndNext(
				long hsraAppDDId, String agencyName,
				OrderByComparator<HSRAApplicationDueDiligence>
					orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationDueDiligenceException {

		return getPersistence().findBygetHSRADD_AgnecyName_PrevAndNext(
			hsraAppDDId, agencyName, orderByComparator);
	}

	/**
	 * Removes all the hsra application due diligences where agencyName = &#63; from the database.
	 *
	 * @param agencyName the agency name
	 */
	public static void removeBygetHSRADD_AgnecyName(String agencyName) {
		getPersistence().removeBygetHSRADD_AgnecyName(agencyName);
	}

	/**
	 * Returns the number of hsra application due diligences where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @return the number of matching hsra application due diligences
	 */
	public static int countBygetHSRADD_AgnecyName(String agencyName) {
		return getPersistence().countBygetHSRADD_AgnecyName(agencyName);
	}

	/**
	 * Returns all the hsra application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application due diligences
	 */
	public static List<HSRAApplicationDueDiligence> findBygetPHARMADD_CaseId(
		String caseId) {

		return getPersistence().findBygetPHARMADD_CaseId(caseId);
	}

	/**
	 * Returns a range of all the hsra application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @return the range of matching hsra application due diligences
	 */
	public static List<HSRAApplicationDueDiligence> findBygetPHARMADD_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetPHARMADD_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the hsra application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application due diligences
	 */
	public static List<HSRAApplicationDueDiligence> findBygetPHARMADD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator) {

		return getPersistence().findBygetPHARMADD_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application due diligences
	 */
	public static List<HSRAApplicationDueDiligence> findBygetPHARMADD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetPHARMADD_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first hsra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a matching hsra application due diligence could not be found
	 */
	public static HSRAApplicationDueDiligence findBygetPHARMADD_CaseId_First(
			String caseId,
			OrderByComparator<HSRAApplicationDueDiligence> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationDueDiligenceException {

		return getPersistence().findBygetPHARMADD_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first hsra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	public static HSRAApplicationDueDiligence fetchBygetPHARMADD_CaseId_First(
		String caseId,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator) {

		return getPersistence().fetchBygetPHARMADD_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last hsra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a matching hsra application due diligence could not be found
	 */
	public static HSRAApplicationDueDiligence findBygetPHARMADD_CaseId_Last(
			String caseId,
			OrderByComparator<HSRAApplicationDueDiligence> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationDueDiligenceException {

		return getPersistence().findBygetPHARMADD_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last hsra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	public static HSRAApplicationDueDiligence fetchBygetPHARMADD_CaseId_Last(
		String caseId,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator) {

		return getPersistence().fetchBygetPHARMADD_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the hsra application due diligences before and after the current hsra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param hsraAppDDId the primary key of the current hsra application due diligence
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a hsra application due diligence with the primary key could not be found
	 */
	public static HSRAApplicationDueDiligence[]
			findBygetPHARMADD_CaseId_PrevAndNext(
				long hsraAppDDId, String caseId,
				OrderByComparator<HSRAApplicationDueDiligence>
					orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationDueDiligenceException {

		return getPersistence().findBygetPHARMADD_CaseId_PrevAndNext(
			hsraAppDDId, caseId, orderByComparator);
	}

	/**
	 * Removes all the hsra application due diligences where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetPHARMADD_CaseId(String caseId) {
		getPersistence().removeBygetPHARMADD_CaseId(caseId);
	}

	/**
	 * Returns the number of hsra application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra application due diligences
	 */
	public static int countBygetPHARMADD_CaseId(String caseId) {
		return getPersistence().countBygetPHARMADD_CaseId(caseId);
	}

	/**
	 * Caches the hsra application due diligence in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationDueDiligence the hsra application due diligence
	 */
	public static void cacheResult(
		HSRAApplicationDueDiligence hsraApplicationDueDiligence) {

		getPersistence().cacheResult(hsraApplicationDueDiligence);
	}

	/**
	 * Caches the hsra application due diligences in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationDueDiligences the hsra application due diligences
	 */
	public static void cacheResult(
		List<HSRAApplicationDueDiligence> hsraApplicationDueDiligences) {

		getPersistence().cacheResult(hsraApplicationDueDiligences);
	}

	/**
	 * Creates a new hsra application due diligence with the primary key. Does not add the hsra application due diligence to the database.
	 *
	 * @param hsraAppDDId the primary key for the new hsra application due diligence
	 * @return the new hsra application due diligence
	 */
	public static HSRAApplicationDueDiligence create(long hsraAppDDId) {
		return getPersistence().create(hsraAppDDId);
	}

	/**
	 * Removes the hsra application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraAppDDId the primary key of the hsra application due diligence
	 * @return the hsra application due diligence that was removed
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a hsra application due diligence with the primary key could not be found
	 */
	public static HSRAApplicationDueDiligence remove(long hsraAppDDId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationDueDiligenceException {

		return getPersistence().remove(hsraAppDDId);
	}

	public static HSRAApplicationDueDiligence updateImpl(
		HSRAApplicationDueDiligence hsraApplicationDueDiligence) {

		return getPersistence().updateImpl(hsraApplicationDueDiligence);
	}

	/**
	 * Returns the hsra application due diligence with the primary key or throws a <code>NoSuchHSRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param hsraAppDDId the primary key of the hsra application due diligence
	 * @return the hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a hsra application due diligence with the primary key could not be found
	 */
	public static HSRAApplicationDueDiligence findByPrimaryKey(long hsraAppDDId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationDueDiligenceException {

		return getPersistence().findByPrimaryKey(hsraAppDDId);
	}

	/**
	 * Returns the hsra application due diligence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraAppDDId the primary key of the hsra application due diligence
	 * @return the hsra application due diligence, or <code>null</code> if a hsra application due diligence with the primary key could not be found
	 */
	public static HSRAApplicationDueDiligence fetchByPrimaryKey(
		long hsraAppDDId) {

		return getPersistence().fetchByPrimaryKey(hsraAppDDId);
	}

	/**
	 * Returns all the hsra application due diligences.
	 *
	 * @return the hsra application due diligences
	 */
	public static List<HSRAApplicationDueDiligence> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the hsra application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @return the range of hsra application due diligences
	 */
	public static List<HSRAApplicationDueDiligence> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the hsra application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra application due diligences
	 */
	public static List<HSRAApplicationDueDiligence> findAll(
		int start, int end,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra application due diligences
	 */
	public static List<HSRAApplicationDueDiligence> findAll(
		int start, int end,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the hsra application due diligences from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of hsra application due diligences.
	 *
	 * @return the number of hsra application due diligences
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HSRAApplicationDueDiligencePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		HSRAApplicationDueDiligencePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile HSRAApplicationDueDiligencePersistence _persistence;

}