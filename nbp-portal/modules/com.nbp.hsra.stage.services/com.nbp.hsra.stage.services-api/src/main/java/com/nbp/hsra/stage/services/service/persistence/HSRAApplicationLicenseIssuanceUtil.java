/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuance;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the hsra application license issuance service. This utility wraps <code>com.nbp.hsra.stage.services.service.persistence.impl.HSRAApplicationLicenseIssuancePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HSRAApplicationLicenseIssuancePersistence
 * @generated
 */
public class HSRAApplicationLicenseIssuanceUtil {

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
		HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance) {

		getPersistence().clearCache(hsraApplicationLicenseIssuance);
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
	public static Map<Serializable, HSRAApplicationLicenseIssuance>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HSRAApplicationLicenseIssuance> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HSRAApplicationLicenseIssuance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HSRAApplicationLicenseIssuance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HSRAApplicationLicenseIssuance> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HSRAApplicationLicenseIssuance update(
		HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance) {

		return getPersistence().update(hsraApplicationLicenseIssuance);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HSRAApplicationLicenseIssuance update(
		HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance,
		ServiceContext serviceContext) {

		return getPersistence().update(
			hsraApplicationLicenseIssuance, serviceContext);
	}

	/**
	 * Returns the hsra application license issuance where caseId = &#63; or throws a <code>NoSuchHSRAApplicationLicenseIssuanceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application license issuance
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a matching hsra application license issuance could not be found
	 */
	public static HSRAApplicationLicenseIssuance findBygetHSRA_lic_iss_By_CI(
			String caseId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationLicenseIssuanceException {

		return getPersistence().findBygetHSRA_lic_iss_By_CI(caseId);
	}

	/**
	 * Returns the hsra application license issuance where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application license issuance, or <code>null</code> if a matching hsra application license issuance could not be found
	 */
	public static HSRAApplicationLicenseIssuance fetchBygetHSRA_lic_iss_By_CI(
		String caseId) {

		return getPersistence().fetchBygetHSRA_lic_iss_By_CI(caseId);
	}

	/**
	 * Returns the hsra application license issuance where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application license issuance, or <code>null</code> if a matching hsra application license issuance could not be found
	 */
	public static HSRAApplicationLicenseIssuance fetchBygetHSRA_lic_iss_By_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetHSRA_lic_iss_By_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the hsra application license issuance where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the hsra application license issuance that was removed
	 */
	public static HSRAApplicationLicenseIssuance removeBygetHSRA_lic_iss_By_CI(
			String caseId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationLicenseIssuanceException {

		return getPersistence().removeBygetHSRA_lic_iss_By_CI(caseId);
	}

	/**
	 * Returns the number of hsra application license issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra application license issuances
	 */
	public static int countBygetHSRA_lic_iss_By_CI(String caseId) {
		return getPersistence().countBygetHSRA_lic_iss_By_CI(caseId);
	}

	/**
	 * Returns all the hsra application license issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application license issuances
	 */
	public static List<HSRAApplicationLicenseIssuance>
		findBygetHSRA_lic_iss_By_CID(String caseId) {

		return getPersistence().findBygetHSRA_lic_iss_By_CID(caseId);
	}

	/**
	 * Returns a range of all the hsra application license issuances where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application license issuances
	 * @param end the upper bound of the range of hsra application license issuances (not inclusive)
	 * @return the range of matching hsra application license issuances
	 */
	public static List<HSRAApplicationLicenseIssuance>
		findBygetHSRA_lic_iss_By_CID(String caseId, int start, int end) {

		return getPersistence().findBygetHSRA_lic_iss_By_CID(
			caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the hsra application license issuances where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application license issuances
	 * @param end the upper bound of the range of hsra application license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application license issuances
	 */
	public static List<HSRAApplicationLicenseIssuance>
		findBygetHSRA_lic_iss_By_CID(
			String caseId, int start, int end,
			OrderByComparator<HSRAApplicationLicenseIssuance>
				orderByComparator) {

		return getPersistence().findBygetHSRA_lic_iss_By_CID(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra application license issuances where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application license issuances
	 * @param end the upper bound of the range of hsra application license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application license issuances
	 */
	public static List<HSRAApplicationLicenseIssuance>
		findBygetHSRA_lic_iss_By_CID(
			String caseId, int start, int end,
			OrderByComparator<HSRAApplicationLicenseIssuance> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetHSRA_lic_iss_By_CID(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first hsra application license issuance in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application license issuance
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a matching hsra application license issuance could not be found
	 */
	public static HSRAApplicationLicenseIssuance
			findBygetHSRA_lic_iss_By_CID_First(
				String caseId,
				OrderByComparator<HSRAApplicationLicenseIssuance>
					orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationLicenseIssuanceException {

		return getPersistence().findBygetHSRA_lic_iss_By_CID_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first hsra application license issuance in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application license issuance, or <code>null</code> if a matching hsra application license issuance could not be found
	 */
	public static HSRAApplicationLicenseIssuance
		fetchBygetHSRA_lic_iss_By_CID_First(
			String caseId,
			OrderByComparator<HSRAApplicationLicenseIssuance>
				orderByComparator) {

		return getPersistence().fetchBygetHSRA_lic_iss_By_CID_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last hsra application license issuance in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application license issuance
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a matching hsra application license issuance could not be found
	 */
	public static HSRAApplicationLicenseIssuance
			findBygetHSRA_lic_iss_By_CID_Last(
				String caseId,
				OrderByComparator<HSRAApplicationLicenseIssuance>
					orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationLicenseIssuanceException {

		return getPersistence().findBygetHSRA_lic_iss_By_CID_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last hsra application license issuance in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application license issuance, or <code>null</code> if a matching hsra application license issuance could not be found
	 */
	public static HSRAApplicationLicenseIssuance
		fetchBygetHSRA_lic_iss_By_CID_Last(
			String caseId,
			OrderByComparator<HSRAApplicationLicenseIssuance>
				orderByComparator) {

		return getPersistence().fetchBygetHSRA_lic_iss_By_CID_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the hsra application license issuances before and after the current hsra application license issuance in the ordered set where caseId = &#63;.
	 *
	 * @param hsraFullLicenseId the primary key of the current hsra application license issuance
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application license issuance
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a hsra application license issuance with the primary key could not be found
	 */
	public static HSRAApplicationLicenseIssuance[]
			findBygetHSRA_lic_iss_By_CID_PrevAndNext(
				long hsraFullLicenseId, String caseId,
				OrderByComparator<HSRAApplicationLicenseIssuance>
					orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationLicenseIssuanceException {

		return getPersistence().findBygetHSRA_lic_iss_By_CID_PrevAndNext(
			hsraFullLicenseId, caseId, orderByComparator);
	}

	/**
	 * Removes all the hsra application license issuances where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetHSRA_lic_iss_By_CID(String caseId) {
		getPersistence().removeBygetHSRA_lic_iss_By_CID(caseId);
	}

	/**
	 * Returns the number of hsra application license issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra application license issuances
	 */
	public static int countBygetHSRA_lic_iss_By_CID(String caseId) {
		return getPersistence().countBygetHSRA_lic_iss_By_CID(caseId);
	}

	/**
	 * Returns the hsra application license issuance where licenseNumber = &#63; or throws a <code>NoSuchHSRAApplicationLicenseIssuanceException</code> if it could not be found.
	 *
	 * @param licenseNumber the license number
	 * @return the matching hsra application license issuance
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a matching hsra application license issuance could not be found
	 */
	public static HSRAApplicationLicenseIssuance findBygetHSRA_lic_iss_By_LN(
			String licenseNumber)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationLicenseIssuanceException {

		return getPersistence().findBygetHSRA_lic_iss_By_LN(licenseNumber);
	}

	/**
	 * Returns the hsra application license issuance where licenseNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param licenseNumber the license number
	 * @return the matching hsra application license issuance, or <code>null</code> if a matching hsra application license issuance could not be found
	 */
	public static HSRAApplicationLicenseIssuance fetchBygetHSRA_lic_iss_By_LN(
		String licenseNumber) {

		return getPersistence().fetchBygetHSRA_lic_iss_By_LN(licenseNumber);
	}

	/**
	 * Returns the hsra application license issuance where licenseNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param licenseNumber the license number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application license issuance, or <code>null</code> if a matching hsra application license issuance could not be found
	 */
	public static HSRAApplicationLicenseIssuance fetchBygetHSRA_lic_iss_By_LN(
		String licenseNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetHSRA_lic_iss_By_LN(
			licenseNumber, useFinderCache);
	}

	/**
	 * Removes the hsra application license issuance where licenseNumber = &#63; from the database.
	 *
	 * @param licenseNumber the license number
	 * @return the hsra application license issuance that was removed
	 */
	public static HSRAApplicationLicenseIssuance removeBygetHSRA_lic_iss_By_LN(
			String licenseNumber)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationLicenseIssuanceException {

		return getPersistence().removeBygetHSRA_lic_iss_By_LN(licenseNumber);
	}

	/**
	 * Returns the number of hsra application license issuances where licenseNumber = &#63;.
	 *
	 * @param licenseNumber the license number
	 * @return the number of matching hsra application license issuances
	 */
	public static int countBygetHSRA_lic_iss_By_LN(String licenseNumber) {
		return getPersistence().countBygetHSRA_lic_iss_By_LN(licenseNumber);
	}

	/**
	 * Caches the hsra application license issuance in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationLicenseIssuance the hsra application license issuance
	 */
	public static void cacheResult(
		HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance) {

		getPersistence().cacheResult(hsraApplicationLicenseIssuance);
	}

	/**
	 * Caches the hsra application license issuances in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationLicenseIssuances the hsra application license issuances
	 */
	public static void cacheResult(
		List<HSRAApplicationLicenseIssuance> hsraApplicationLicenseIssuances) {

		getPersistence().cacheResult(hsraApplicationLicenseIssuances);
	}

	/**
	 * Creates a new hsra application license issuance with the primary key. Does not add the hsra application license issuance to the database.
	 *
	 * @param hsraFullLicenseId the primary key for the new hsra application license issuance
	 * @return the new hsra application license issuance
	 */
	public static HSRAApplicationLicenseIssuance create(
		long hsraFullLicenseId) {

		return getPersistence().create(hsraFullLicenseId);
	}

	/**
	 * Removes the hsra application license issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraFullLicenseId the primary key of the hsra application license issuance
	 * @return the hsra application license issuance that was removed
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a hsra application license issuance with the primary key could not be found
	 */
	public static HSRAApplicationLicenseIssuance remove(long hsraFullLicenseId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationLicenseIssuanceException {

		return getPersistence().remove(hsraFullLicenseId);
	}

	public static HSRAApplicationLicenseIssuance updateImpl(
		HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance) {

		return getPersistence().updateImpl(hsraApplicationLicenseIssuance);
	}

	/**
	 * Returns the hsra application license issuance with the primary key or throws a <code>NoSuchHSRAApplicationLicenseIssuanceException</code> if it could not be found.
	 *
	 * @param hsraFullLicenseId the primary key of the hsra application license issuance
	 * @return the hsra application license issuance
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a hsra application license issuance with the primary key could not be found
	 */
	public static HSRAApplicationLicenseIssuance findByPrimaryKey(
			long hsraFullLicenseId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationLicenseIssuanceException {

		return getPersistence().findByPrimaryKey(hsraFullLicenseId);
	}

	/**
	 * Returns the hsra application license issuance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraFullLicenseId the primary key of the hsra application license issuance
	 * @return the hsra application license issuance, or <code>null</code> if a hsra application license issuance with the primary key could not be found
	 */
	public static HSRAApplicationLicenseIssuance fetchByPrimaryKey(
		long hsraFullLicenseId) {

		return getPersistence().fetchByPrimaryKey(hsraFullLicenseId);
	}

	/**
	 * Returns all the hsra application license issuances.
	 *
	 * @return the hsra application license issuances
	 */
	public static List<HSRAApplicationLicenseIssuance> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the hsra application license issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application license issuances
	 * @param end the upper bound of the range of hsra application license issuances (not inclusive)
	 * @return the range of hsra application license issuances
	 */
	public static List<HSRAApplicationLicenseIssuance> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the hsra application license issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application license issuances
	 * @param end the upper bound of the range of hsra application license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra application license issuances
	 */
	public static List<HSRAApplicationLicenseIssuance> findAll(
		int start, int end,
		OrderByComparator<HSRAApplicationLicenseIssuance> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra application license issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application license issuances
	 * @param end the upper bound of the range of hsra application license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra application license issuances
	 */
	public static List<HSRAApplicationLicenseIssuance> findAll(
		int start, int end,
		OrderByComparator<HSRAApplicationLicenseIssuance> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the hsra application license issuances from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of hsra application license issuances.
	 *
	 * @return the number of hsra application license issuances
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HSRAApplicationLicenseIssuancePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		HSRAApplicationLicenseIssuancePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile HSRAApplicationLicenseIssuancePersistence
		_persistence;

}