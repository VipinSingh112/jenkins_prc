/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.stages.service.model.AcquireDueDiligence;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acquire due diligence service. This utility wraps <code>com.nbp.acquire.stages.service.service.persistence.impl.AcquireDueDiligencePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDueDiligencePersistence
 * @generated
 */
public class AcquireDueDiligenceUtil {

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
	public static void clearCache(AcquireDueDiligence acquireDueDiligence) {
		getPersistence().clearCache(acquireDueDiligence);
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
	public static Map<Serializable, AcquireDueDiligence> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AcquireDueDiligence> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AcquireDueDiligence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AcquireDueDiligence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AcquireDueDiligence> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AcquireDueDiligence update(
		AcquireDueDiligence acquireDueDiligence) {

		return getPersistence().update(acquireDueDiligence);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AcquireDueDiligence update(
		AcquireDueDiligence acquireDueDiligence,
		ServiceContext serviceContext) {

		return getPersistence().update(acquireDueDiligence, serviceContext);
	}

	/**
	 * Returns the acquire due diligence where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireDueDiligenceException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire due diligence
	 * @throws NoSuchAcquireDueDiligenceException if a matching acquire due diligence could not be found
	 */
	public static AcquireDueDiligence findBygetADD_AAI(
			long acquireApplicationId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDueDiligenceException {

		return getPersistence().findBygetADD_AAI(acquireApplicationId);
	}

	/**
	 * Returns the acquire due diligence where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	public static AcquireDueDiligence fetchBygetADD_AAI(
		long acquireApplicationId) {

		return getPersistence().fetchBygetADD_AAI(acquireApplicationId);
	}

	/**
	 * Returns the acquire due diligence where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	public static AcquireDueDiligence fetchBygetADD_AAI(
		long acquireApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetADD_AAI(
			acquireApplicationId, useFinderCache);
	}

	/**
	 * Removes the acquire due diligence where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire due diligence that was removed
	 */
	public static AcquireDueDiligence removeBygetADD_AAI(
			long acquireApplicationId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDueDiligenceException {

		return getPersistence().removeBygetADD_AAI(acquireApplicationId);
	}

	/**
	 * Returns the number of acquire due diligences where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire due diligences
	 */
	public static int countBygetADD_AAI(long acquireApplicationId) {
		return getPersistence().countBygetADD_AAI(acquireApplicationId);
	}

	/**
	 * Returns the acquire due diligence where caseId = &#63; and nameOfAgency = &#63; or throws a <code>NoSuchAcquireDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param nameOfAgency the name of agency
	 * @return the matching acquire due diligence
	 * @throws NoSuchAcquireDueDiligenceException if a matching acquire due diligence could not be found
	 */
	public static AcquireDueDiligence findBygetADD_CaseId_AgencyName(
			String caseId, String nameOfAgency)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDueDiligenceException {

		return getPersistence().findBygetADD_CaseId_AgencyName(
			caseId, nameOfAgency);
	}

	/**
	 * Returns the acquire due diligence where caseId = &#63; and nameOfAgency = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param nameOfAgency the name of agency
	 * @return the matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	public static AcquireDueDiligence fetchBygetADD_CaseId_AgencyName(
		String caseId, String nameOfAgency) {

		return getPersistence().fetchBygetADD_CaseId_AgencyName(
			caseId, nameOfAgency);
	}

	/**
	 * Returns the acquire due diligence where caseId = &#63; and nameOfAgency = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param nameOfAgency the name of agency
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	public static AcquireDueDiligence fetchBygetADD_CaseId_AgencyName(
		String caseId, String nameOfAgency, boolean useFinderCache) {

		return getPersistence().fetchBygetADD_CaseId_AgencyName(
			caseId, nameOfAgency, useFinderCache);
	}

	/**
	 * Removes the acquire due diligence where caseId = &#63; and nameOfAgency = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param nameOfAgency the name of agency
	 * @return the acquire due diligence that was removed
	 */
	public static AcquireDueDiligence removeBygetADD_CaseId_AgencyName(
			String caseId, String nameOfAgency)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDueDiligenceException {

		return getPersistence().removeBygetADD_CaseId_AgencyName(
			caseId, nameOfAgency);
	}

	/**
	 * Returns the number of acquire due diligences where caseId = &#63; and nameOfAgency = &#63;.
	 *
	 * @param caseId the case ID
	 * @param nameOfAgency the name of agency
	 * @return the number of matching acquire due diligences
	 */
	public static int countBygetADD_CaseId_AgencyName(
		String caseId, String nameOfAgency) {

		return getPersistence().countBygetADD_CaseId_AgencyName(
			caseId, nameOfAgency);
	}

	/**
	 * Returns all the acquire due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire due diligences
	 */
	public static List<AcquireDueDiligence> findBygetADD_CaseId(String caseId) {
		return getPersistence().findBygetADD_CaseId(caseId);
	}

	/**
	 * Returns a range of all the acquire due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire due diligences
	 * @param end the upper bound of the range of acquire due diligences (not inclusive)
	 * @return the range of matching acquire due diligences
	 */
	public static List<AcquireDueDiligence> findBygetADD_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetADD_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the acquire due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire due diligences
	 * @param end the upper bound of the range of acquire due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire due diligences
	 */
	public static List<AcquireDueDiligence> findBygetADD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<AcquireDueDiligence> orderByComparator) {

		return getPersistence().findBygetADD_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire due diligences
	 * @param end the upper bound of the range of acquire due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire due diligences
	 */
	public static List<AcquireDueDiligence> findBygetADD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<AcquireDueDiligence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetADD_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acquire due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire due diligence
	 * @throws NoSuchAcquireDueDiligenceException if a matching acquire due diligence could not be found
	 */
	public static AcquireDueDiligence findBygetADD_CaseId_First(
			String caseId,
			OrderByComparator<AcquireDueDiligence> orderByComparator)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDueDiligenceException {

		return getPersistence().findBygetADD_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first acquire due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	public static AcquireDueDiligence fetchBygetADD_CaseId_First(
		String caseId,
		OrderByComparator<AcquireDueDiligence> orderByComparator) {

		return getPersistence().fetchBygetADD_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last acquire due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire due diligence
	 * @throws NoSuchAcquireDueDiligenceException if a matching acquire due diligence could not be found
	 */
	public static AcquireDueDiligence findBygetADD_CaseId_Last(
			String caseId,
			OrderByComparator<AcquireDueDiligence> orderByComparator)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDueDiligenceException {

		return getPersistence().findBygetADD_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last acquire due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	public static AcquireDueDiligence fetchBygetADD_CaseId_Last(
		String caseId,
		OrderByComparator<AcquireDueDiligence> orderByComparator) {

		return getPersistence().fetchBygetADD_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the acquire due diligences before and after the current acquire due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param sampleId the primary key of the current acquire due diligence
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire due diligence
	 * @throws NoSuchAcquireDueDiligenceException if a acquire due diligence with the primary key could not be found
	 */
	public static AcquireDueDiligence[] findBygetADD_CaseId_PrevAndNext(
			long sampleId, String caseId,
			OrderByComparator<AcquireDueDiligence> orderByComparator)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDueDiligenceException {

		return getPersistence().findBygetADD_CaseId_PrevAndNext(
			sampleId, caseId, orderByComparator);
	}

	/**
	 * Removes all the acquire due diligences where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetADD_CaseId(String caseId) {
		getPersistence().removeBygetADD_CaseId(caseId);
	}

	/**
	 * Returns the number of acquire due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire due diligences
	 */
	public static int countBygetADD_CaseId(String caseId) {
		return getPersistence().countBygetADD_CaseId(caseId);
	}

	/**
	 * Returns the acquire due diligence where caseId = &#63; or throws a <code>NoSuchAcquireDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire due diligence
	 * @throws NoSuchAcquireDueDiligenceException if a matching acquire due diligence could not be found
	 */
	public static AcquireDueDiligence findBygetADD_CI(String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDueDiligenceException {

		return getPersistence().findBygetADD_CI(caseId);
	}

	/**
	 * Returns the acquire due diligence where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	public static AcquireDueDiligence fetchBygetADD_CI(String caseId) {
		return getPersistence().fetchBygetADD_CI(caseId);
	}

	/**
	 * Returns the acquire due diligence where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	public static AcquireDueDiligence fetchBygetADD_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetADD_CI(caseId, useFinderCache);
	}

	/**
	 * Removes the acquire due diligence where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire due diligence that was removed
	 */
	public static AcquireDueDiligence removeBygetADD_CI(String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDueDiligenceException {

		return getPersistence().removeBygetADD_CI(caseId);
	}

	/**
	 * Returns the number of acquire due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire due diligences
	 */
	public static int countBygetADD_CI(String caseId) {
		return getPersistence().countBygetADD_CI(caseId);
	}

	/**
	 * Caches the acquire due diligence in the entity cache if it is enabled.
	 *
	 * @param acquireDueDiligence the acquire due diligence
	 */
	public static void cacheResult(AcquireDueDiligence acquireDueDiligence) {
		getPersistence().cacheResult(acquireDueDiligence);
	}

	/**
	 * Caches the acquire due diligences in the entity cache if it is enabled.
	 *
	 * @param acquireDueDiligences the acquire due diligences
	 */
	public static void cacheResult(
		List<AcquireDueDiligence> acquireDueDiligences) {

		getPersistence().cacheResult(acquireDueDiligences);
	}

	/**
	 * Creates a new acquire due diligence with the primary key. Does not add the acquire due diligence to the database.
	 *
	 * @param sampleId the primary key for the new acquire due diligence
	 * @return the new acquire due diligence
	 */
	public static AcquireDueDiligence create(long sampleId) {
		return getPersistence().create(sampleId);
	}

	/**
	 * Removes the acquire due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sampleId the primary key of the acquire due diligence
	 * @return the acquire due diligence that was removed
	 * @throws NoSuchAcquireDueDiligenceException if a acquire due diligence with the primary key could not be found
	 */
	public static AcquireDueDiligence remove(long sampleId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDueDiligenceException {

		return getPersistence().remove(sampleId);
	}

	public static AcquireDueDiligence updateImpl(
		AcquireDueDiligence acquireDueDiligence) {

		return getPersistence().updateImpl(acquireDueDiligence);
	}

	/**
	 * Returns the acquire due diligence with the primary key or throws a <code>NoSuchAcquireDueDiligenceException</code> if it could not be found.
	 *
	 * @param sampleId the primary key of the acquire due diligence
	 * @return the acquire due diligence
	 * @throws NoSuchAcquireDueDiligenceException if a acquire due diligence with the primary key could not be found
	 */
	public static AcquireDueDiligence findByPrimaryKey(long sampleId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireDueDiligenceException {

		return getPersistence().findByPrimaryKey(sampleId);
	}

	/**
	 * Returns the acquire due diligence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sampleId the primary key of the acquire due diligence
	 * @return the acquire due diligence, or <code>null</code> if a acquire due diligence with the primary key could not be found
	 */
	public static AcquireDueDiligence fetchByPrimaryKey(long sampleId) {
		return getPersistence().fetchByPrimaryKey(sampleId);
	}

	/**
	 * Returns all the acquire due diligences.
	 *
	 * @return the acquire due diligences
	 */
	public static List<AcquireDueDiligence> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acquire due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire due diligences
	 * @param end the upper bound of the range of acquire due diligences (not inclusive)
	 * @return the range of acquire due diligences
	 */
	public static List<AcquireDueDiligence> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acquire due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire due diligences
	 * @param end the upper bound of the range of acquire due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire due diligences
	 */
	public static List<AcquireDueDiligence> findAll(
		int start, int end,
		OrderByComparator<AcquireDueDiligence> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire due diligences
	 * @param end the upper bound of the range of acquire due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire due diligences
	 */
	public static List<AcquireDueDiligence> findAll(
		int start, int end,
		OrderByComparator<AcquireDueDiligence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acquire due diligences from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acquire due diligences.
	 *
	 * @return the number of acquire due diligences
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AcquireDueDiligencePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AcquireDueDiligencePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AcquireDueDiligencePersistence _persistence;

}