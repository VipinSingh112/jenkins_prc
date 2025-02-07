/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationDueDiligence;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the pharma application due diligence service. This utility wraps <code>com.nbp.pharmaceutical.stages.services.service.persistence.impl.PharmaApplicationDueDiligencePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationDueDiligencePersistence
 * @generated
 */
public class PharmaApplicationDueDiligenceUtil {

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
		PharmaApplicationDueDiligence pharmaApplicationDueDiligence) {

		getPersistence().clearCache(pharmaApplicationDueDiligence);
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
	public static Map<Serializable, PharmaApplicationDueDiligence>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PharmaApplicationDueDiligence> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PharmaApplicationDueDiligence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PharmaApplicationDueDiligence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PharmaApplicationDueDiligence> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PharmaApplicationDueDiligence update(
		PharmaApplicationDueDiligence pharmaApplicationDueDiligence) {

		return getPersistence().update(pharmaApplicationDueDiligence);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PharmaApplicationDueDiligence update(
		PharmaApplicationDueDiligence pharmaApplicationDueDiligence,
		ServiceContext serviceContext) {

		return getPersistence().update(
			pharmaApplicationDueDiligence, serviceContext);
	}

	/**
	 * Returns the pharma application due diligence where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a matching pharma application due diligence could not be found
	 */
	public static PharmaApplicationDueDiligence findBygetPHARMADD_CAI(
			long pharmaApplicationId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationDueDiligenceException {

		return getPersistence().findBygetPHARMADD_CAI(pharmaApplicationId);
	}

	/**
	 * Returns the pharma application due diligence where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	public static PharmaApplicationDueDiligence fetchBygetPHARMADD_CAI(
		long pharmaApplicationId) {

		return getPersistence().fetchBygetPHARMADD_CAI(pharmaApplicationId);
	}

	/**
	 * Returns the pharma application due diligence where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	public static PharmaApplicationDueDiligence fetchBygetPHARMADD_CAI(
		long pharmaApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetPHARMADD_CAI(
			pharmaApplicationId, useFinderCache);
	}

	/**
	 * Removes the pharma application due diligence where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma application due diligence that was removed
	 */
	public static PharmaApplicationDueDiligence removeBygetPHARMADD_CAI(
			long pharmaApplicationId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationDueDiligenceException {

		return getPersistence().removeBygetPHARMADD_CAI(pharmaApplicationId);
	}

	/**
	 * Returns the number of pharma application due diligences where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma application due diligences
	 */
	public static int countBygetPHARMADD_CAI(long pharmaApplicationId) {
		return getPersistence().countBygetPHARMADD_CAI(pharmaApplicationId);
	}

	/**
	 * Returns the pharma application due diligence where caseId = &#63; and agencyName = &#63; or throws a <code>NoSuchPharmaApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a matching pharma application due diligence could not be found
	 */
	public static PharmaApplicationDueDiligence
			findBygetPHARMADD_CaseIdAgnecyName(String caseId, String agencyName)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationDueDiligenceException {

		return getPersistence().findBygetPHARMADD_CaseIdAgnecyName(
			caseId, agencyName);
	}

	/**
	 * Returns the pharma application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	public static PharmaApplicationDueDiligence
		fetchBygetPHARMADD_CaseIdAgnecyName(String caseId, String agencyName) {

		return getPersistence().fetchBygetPHARMADD_CaseIdAgnecyName(
			caseId, agencyName);
	}

	/**
	 * Returns the pharma application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	public static PharmaApplicationDueDiligence
		fetchBygetPHARMADD_CaseIdAgnecyName(
			String caseId, String agencyName, boolean useFinderCache) {

		return getPersistence().fetchBygetPHARMADD_CaseIdAgnecyName(
			caseId, agencyName, useFinderCache);
	}

	/**
	 * Removes the pharma application due diligence where caseId = &#63; and agencyName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the pharma application due diligence that was removed
	 */
	public static PharmaApplicationDueDiligence
			removeBygetPHARMADD_CaseIdAgnecyName(
				String caseId, String agencyName)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationDueDiligenceException {

		return getPersistence().removeBygetPHARMADD_CaseIdAgnecyName(
			caseId, agencyName);
	}

	/**
	 * Returns the number of pharma application due diligences where caseId = &#63; and agencyName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the number of matching pharma application due diligences
	 */
	public static int countBygetPHARMADD_CaseIdAgnecyName(
		String caseId, String agencyName) {

		return getPersistence().countBygetPHARMADD_CaseIdAgnecyName(
			caseId, agencyName);
	}

	/**
	 * Returns all the pharma application due diligences where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @return the matching pharma application due diligences
	 */
	public static List<PharmaApplicationDueDiligence>
		findBygetPHARMADD_AgnecyName(String agencyName) {

		return getPersistence().findBygetPHARMADD_AgnecyName(agencyName);
	}

	/**
	 * Returns a range of all the pharma application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @return the range of matching pharma application due diligences
	 */
	public static List<PharmaApplicationDueDiligence>
		findBygetPHARMADD_AgnecyName(String agencyName, int start, int end) {

		return getPersistence().findBygetPHARMADD_AgnecyName(
			agencyName, start, end);
	}

	/**
	 * Returns an ordered range of all the pharma application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma application due diligences
	 */
	public static List<PharmaApplicationDueDiligence>
		findBygetPHARMADD_AgnecyName(
			String agencyName, int start, int end,
			OrderByComparator<PharmaApplicationDueDiligence>
				orderByComparator) {

		return getPersistence().findBygetPHARMADD_AgnecyName(
			agencyName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma application due diligences
	 */
	public static List<PharmaApplicationDueDiligence>
		findBygetPHARMADD_AgnecyName(
			String agencyName, int start, int end,
			OrderByComparator<PharmaApplicationDueDiligence> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetPHARMADD_AgnecyName(
			agencyName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first pharma application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a matching pharma application due diligence could not be found
	 */
	public static PharmaApplicationDueDiligence
			findBygetPHARMADD_AgnecyName_First(
				String agencyName,
				OrderByComparator<PharmaApplicationDueDiligence>
					orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationDueDiligenceException {

		return getPersistence().findBygetPHARMADD_AgnecyName_First(
			agencyName, orderByComparator);
	}

	/**
	 * Returns the first pharma application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	public static PharmaApplicationDueDiligence
		fetchBygetPHARMADD_AgnecyName_First(
			String agencyName,
			OrderByComparator<PharmaApplicationDueDiligence>
				orderByComparator) {

		return getPersistence().fetchBygetPHARMADD_AgnecyName_First(
			agencyName, orderByComparator);
	}

	/**
	 * Returns the last pharma application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a matching pharma application due diligence could not be found
	 */
	public static PharmaApplicationDueDiligence
			findBygetPHARMADD_AgnecyName_Last(
				String agencyName,
				OrderByComparator<PharmaApplicationDueDiligence>
					orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationDueDiligenceException {

		return getPersistence().findBygetPHARMADD_AgnecyName_Last(
			agencyName, orderByComparator);
	}

	/**
	 * Returns the last pharma application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	public static PharmaApplicationDueDiligence
		fetchBygetPHARMADD_AgnecyName_Last(
			String agencyName,
			OrderByComparator<PharmaApplicationDueDiligence>
				orderByComparator) {

		return getPersistence().fetchBygetPHARMADD_AgnecyName_Last(
			agencyName, orderByComparator);
	}

	/**
	 * Returns the pharma application due diligences before and after the current pharma application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param pharmaAppDDId the primary key of the current pharma application due diligence
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a pharma application due diligence with the primary key could not be found
	 */
	public static PharmaApplicationDueDiligence[]
			findBygetPHARMADD_AgnecyName_PrevAndNext(
				long pharmaAppDDId, String agencyName,
				OrderByComparator<PharmaApplicationDueDiligence>
					orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationDueDiligenceException {

		return getPersistence().findBygetPHARMADD_AgnecyName_PrevAndNext(
			pharmaAppDDId, agencyName, orderByComparator);
	}

	/**
	 * Removes all the pharma application due diligences where agencyName = &#63; from the database.
	 *
	 * @param agencyName the agency name
	 */
	public static void removeBygetPHARMADD_AgnecyName(String agencyName) {
		getPersistence().removeBygetPHARMADD_AgnecyName(agencyName);
	}

	/**
	 * Returns the number of pharma application due diligences where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @return the number of matching pharma application due diligences
	 */
	public static int countBygetPHARMADD_AgnecyName(String agencyName) {
		return getPersistence().countBygetPHARMADD_AgnecyName(agencyName);
	}

	/**
	 * Returns all the pharma application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma application due diligences
	 */
	public static List<PharmaApplicationDueDiligence> findBygetPHARMADD_CaseId(
		String caseId) {

		return getPersistence().findBygetPHARMADD_CaseId(caseId);
	}

	/**
	 * Returns a range of all the pharma application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @return the range of matching pharma application due diligences
	 */
	public static List<PharmaApplicationDueDiligence> findBygetPHARMADD_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetPHARMADD_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the pharma application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma application due diligences
	 */
	public static List<PharmaApplicationDueDiligence> findBygetPHARMADD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<PharmaApplicationDueDiligence> orderByComparator) {

		return getPersistence().findBygetPHARMADD_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma application due diligences
	 */
	public static List<PharmaApplicationDueDiligence> findBygetPHARMADD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<PharmaApplicationDueDiligence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetPHARMADD_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first pharma application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a matching pharma application due diligence could not be found
	 */
	public static PharmaApplicationDueDiligence findBygetPHARMADD_CaseId_First(
			String caseId,
			OrderByComparator<PharmaApplicationDueDiligence> orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationDueDiligenceException {

		return getPersistence().findBygetPHARMADD_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first pharma application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	public static PharmaApplicationDueDiligence fetchBygetPHARMADD_CaseId_First(
		String caseId,
		OrderByComparator<PharmaApplicationDueDiligence> orderByComparator) {

		return getPersistence().fetchBygetPHARMADD_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last pharma application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a matching pharma application due diligence could not be found
	 */
	public static PharmaApplicationDueDiligence findBygetPHARMADD_CaseId_Last(
			String caseId,
			OrderByComparator<PharmaApplicationDueDiligence> orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationDueDiligenceException {

		return getPersistence().findBygetPHARMADD_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last pharma application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	public static PharmaApplicationDueDiligence fetchBygetPHARMADD_CaseId_Last(
		String caseId,
		OrderByComparator<PharmaApplicationDueDiligence> orderByComparator) {

		return getPersistence().fetchBygetPHARMADD_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the pharma application due diligences before and after the current pharma application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param pharmaAppDDId the primary key of the current pharma application due diligence
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a pharma application due diligence with the primary key could not be found
	 */
	public static PharmaApplicationDueDiligence[]
			findBygetPHARMADD_CaseId_PrevAndNext(
				long pharmaAppDDId, String caseId,
				OrderByComparator<PharmaApplicationDueDiligence>
					orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationDueDiligenceException {

		return getPersistence().findBygetPHARMADD_CaseId_PrevAndNext(
			pharmaAppDDId, caseId, orderByComparator);
	}

	/**
	 * Removes all the pharma application due diligences where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetPHARMADD_CaseId(String caseId) {
		getPersistence().removeBygetPHARMADD_CaseId(caseId);
	}

	/**
	 * Returns the number of pharma application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching pharma application due diligences
	 */
	public static int countBygetPHARMADD_CaseId(String caseId) {
		return getPersistence().countBygetPHARMADD_CaseId(caseId);
	}

	/**
	 * Caches the pharma application due diligence in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationDueDiligence the pharma application due diligence
	 */
	public static void cacheResult(
		PharmaApplicationDueDiligence pharmaApplicationDueDiligence) {

		getPersistence().cacheResult(pharmaApplicationDueDiligence);
	}

	/**
	 * Caches the pharma application due diligences in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationDueDiligences the pharma application due diligences
	 */
	public static void cacheResult(
		List<PharmaApplicationDueDiligence> pharmaApplicationDueDiligences) {

		getPersistence().cacheResult(pharmaApplicationDueDiligences);
	}

	/**
	 * Creates a new pharma application due diligence with the primary key. Does not add the pharma application due diligence to the database.
	 *
	 * @param pharmaAppDDId the primary key for the new pharma application due diligence
	 * @return the new pharma application due diligence
	 */
	public static PharmaApplicationDueDiligence create(long pharmaAppDDId) {
		return getPersistence().create(pharmaAppDDId);
	}

	/**
	 * Removes the pharma application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaAppDDId the primary key of the pharma application due diligence
	 * @return the pharma application due diligence that was removed
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a pharma application due diligence with the primary key could not be found
	 */
	public static PharmaApplicationDueDiligence remove(long pharmaAppDDId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationDueDiligenceException {

		return getPersistence().remove(pharmaAppDDId);
	}

	public static PharmaApplicationDueDiligence updateImpl(
		PharmaApplicationDueDiligence pharmaApplicationDueDiligence) {

		return getPersistence().updateImpl(pharmaApplicationDueDiligence);
	}

	/**
	 * Returns the pharma application due diligence with the primary key or throws a <code>NoSuchPharmaApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param pharmaAppDDId the primary key of the pharma application due diligence
	 * @return the pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a pharma application due diligence with the primary key could not be found
	 */
	public static PharmaApplicationDueDiligence findByPrimaryKey(
			long pharmaAppDDId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationDueDiligenceException {

		return getPersistence().findByPrimaryKey(pharmaAppDDId);
	}

	/**
	 * Returns the pharma application due diligence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaAppDDId the primary key of the pharma application due diligence
	 * @return the pharma application due diligence, or <code>null</code> if a pharma application due diligence with the primary key could not be found
	 */
	public static PharmaApplicationDueDiligence fetchByPrimaryKey(
		long pharmaAppDDId) {

		return getPersistence().fetchByPrimaryKey(pharmaAppDDId);
	}

	/**
	 * Returns all the pharma application due diligences.
	 *
	 * @return the pharma application due diligences
	 */
	public static List<PharmaApplicationDueDiligence> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the pharma application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @return the range of pharma application due diligences
	 */
	public static List<PharmaApplicationDueDiligence> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the pharma application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma application due diligences
	 */
	public static List<PharmaApplicationDueDiligence> findAll(
		int start, int end,
		OrderByComparator<PharmaApplicationDueDiligence> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma application due diligences
	 */
	public static List<PharmaApplicationDueDiligence> findAll(
		int start, int end,
		OrderByComparator<PharmaApplicationDueDiligence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the pharma application due diligences from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of pharma application due diligences.
	 *
	 * @return the number of pharma application due diligences
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PharmaApplicationDueDiligencePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		PharmaApplicationDueDiligencePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile PharmaApplicationDueDiligencePersistence
		_persistence;

}