/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationFullLicense;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the pharma application full license service. This utility wraps <code>com.nbp.pharmaceutical.stages.services.service.persistence.impl.PharmaApplicationFullLicensePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationFullLicensePersistence
 * @generated
 */
public class PharmaApplicationFullLicenseUtil {

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
		PharmaApplicationFullLicense pharmaApplicationFullLicense) {

		getPersistence().clearCache(pharmaApplicationFullLicense);
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
	public static Map<Serializable, PharmaApplicationFullLicense>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PharmaApplicationFullLicense> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PharmaApplicationFullLicense> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PharmaApplicationFullLicense> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PharmaApplicationFullLicense> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PharmaApplicationFullLicense update(
		PharmaApplicationFullLicense pharmaApplicationFullLicense) {

		return getPersistence().update(pharmaApplicationFullLicense);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PharmaApplicationFullLicense update(
		PharmaApplicationFullLicense pharmaApplicationFullLicense,
		ServiceContext serviceContext) {

		return getPersistence().update(
			pharmaApplicationFullLicense, serviceContext);
	}

	/**
	 * Returns the pharma application full license where caseId = &#63; or throws a <code>NoSuchPharmaApplicationFullLicenseException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma application full license
	 * @throws NoSuchPharmaApplicationFullLicenseException if a matching pharma application full license could not be found
	 */
	public static PharmaApplicationFullLicense findBygetPharmaFullLic_By_CI(
			String caseId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationFullLicenseException {

		return getPersistence().findBygetPharmaFullLic_By_CI(caseId);
	}

	/**
	 * Returns the pharma application full license where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma application full license, or <code>null</code> if a matching pharma application full license could not be found
	 */
	public static PharmaApplicationFullLicense fetchBygetPharmaFullLic_By_CI(
		String caseId) {

		return getPersistence().fetchBygetPharmaFullLic_By_CI(caseId);
	}

	/**
	 * Returns the pharma application full license where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application full license, or <code>null</code> if a matching pharma application full license could not be found
	 */
	public static PharmaApplicationFullLicense fetchBygetPharmaFullLic_By_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetPharmaFullLic_By_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the pharma application full license where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the pharma application full license that was removed
	 */
	public static PharmaApplicationFullLicense removeBygetPharmaFullLic_By_CI(
			String caseId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationFullLicenseException {

		return getPersistence().removeBygetPharmaFullLic_By_CI(caseId);
	}

	/**
	 * Returns the number of pharma application full licenses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching pharma application full licenses
	 */
	public static int countBygetPharmaFullLic_By_CI(String caseId) {
		return getPersistence().countBygetPharmaFullLic_By_CI(caseId);
	}

	/**
	 * Returns all the pharma application full licenses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma application full licenses
	 */
	public static List<PharmaApplicationFullLicense>
		findBygetPharmaFullLic_By_CID(String caseId) {

		return getPersistence().findBygetPharmaFullLic_By_CID(caseId);
	}

	/**
	 * Returns a range of all the pharma application full licenses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationFullLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application full licenses
	 * @param end the upper bound of the range of pharma application full licenses (not inclusive)
	 * @return the range of matching pharma application full licenses
	 */
	public static List<PharmaApplicationFullLicense>
		findBygetPharmaFullLic_By_CID(String caseId, int start, int end) {

		return getPersistence().findBygetPharmaFullLic_By_CID(
			caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the pharma application full licenses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationFullLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application full licenses
	 * @param end the upper bound of the range of pharma application full licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma application full licenses
	 */
	public static List<PharmaApplicationFullLicense>
		findBygetPharmaFullLic_By_CID(
			String caseId, int start, int end,
			OrderByComparator<PharmaApplicationFullLicense> orderByComparator) {

		return getPersistence().findBygetPharmaFullLic_By_CID(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma application full licenses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationFullLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application full licenses
	 * @param end the upper bound of the range of pharma application full licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma application full licenses
	 */
	public static List<PharmaApplicationFullLicense>
		findBygetPharmaFullLic_By_CID(
			String caseId, int start, int end,
			OrderByComparator<PharmaApplicationFullLicense> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetPharmaFullLic_By_CID(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first pharma application full license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application full license
	 * @throws NoSuchPharmaApplicationFullLicenseException if a matching pharma application full license could not be found
	 */
	public static PharmaApplicationFullLicense
			findBygetPharmaFullLic_By_CID_First(
				String caseId,
				OrderByComparator<PharmaApplicationFullLicense>
					orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationFullLicenseException {

		return getPersistence().findBygetPharmaFullLic_By_CID_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first pharma application full license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application full license, or <code>null</code> if a matching pharma application full license could not be found
	 */
	public static PharmaApplicationFullLicense
		fetchBygetPharmaFullLic_By_CID_First(
			String caseId,
			OrderByComparator<PharmaApplicationFullLicense> orderByComparator) {

		return getPersistence().fetchBygetPharmaFullLic_By_CID_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last pharma application full license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application full license
	 * @throws NoSuchPharmaApplicationFullLicenseException if a matching pharma application full license could not be found
	 */
	public static PharmaApplicationFullLicense
			findBygetPharmaFullLic_By_CID_Last(
				String caseId,
				OrderByComparator<PharmaApplicationFullLicense>
					orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationFullLicenseException {

		return getPersistence().findBygetPharmaFullLic_By_CID_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last pharma application full license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application full license, or <code>null</code> if a matching pharma application full license could not be found
	 */
	public static PharmaApplicationFullLicense
		fetchBygetPharmaFullLic_By_CID_Last(
			String caseId,
			OrderByComparator<PharmaApplicationFullLicense> orderByComparator) {

		return getPersistence().fetchBygetPharmaFullLic_By_CID_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the pharma application full licenses before and after the current pharma application full license in the ordered set where caseId = &#63;.
	 *
	 * @param pharmaFullLicenseId the primary key of the current pharma application full license
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application full license
	 * @throws NoSuchPharmaApplicationFullLicenseException if a pharma application full license with the primary key could not be found
	 */
	public static PharmaApplicationFullLicense[]
			findBygetPharmaFullLic_By_CID_PrevAndNext(
				long pharmaFullLicenseId, String caseId,
				OrderByComparator<PharmaApplicationFullLicense>
					orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationFullLicenseException {

		return getPersistence().findBygetPharmaFullLic_By_CID_PrevAndNext(
			pharmaFullLicenseId, caseId, orderByComparator);
	}

	/**
	 * Removes all the pharma application full licenses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetPharmaFullLic_By_CID(String caseId) {
		getPersistence().removeBygetPharmaFullLic_By_CID(caseId);
	}

	/**
	 * Returns the number of pharma application full licenses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching pharma application full licenses
	 */
	public static int countBygetPharmaFullLic_By_CID(String caseId) {
		return getPersistence().countBygetPharmaFullLic_By_CID(caseId);
	}

	/**
	 * Returns the pharma application full license where licenseNumber = &#63; or throws a <code>NoSuchPharmaApplicationFullLicenseException</code> if it could not be found.
	 *
	 * @param licenseNumber the license number
	 * @return the matching pharma application full license
	 * @throws NoSuchPharmaApplicationFullLicenseException if a matching pharma application full license could not be found
	 */
	public static PharmaApplicationFullLicense findBygetPharmaFullLic_By_LN(
			String licenseNumber)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationFullLicenseException {

		return getPersistence().findBygetPharmaFullLic_By_LN(licenseNumber);
	}

	/**
	 * Returns the pharma application full license where licenseNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param licenseNumber the license number
	 * @return the matching pharma application full license, or <code>null</code> if a matching pharma application full license could not be found
	 */
	public static PharmaApplicationFullLicense fetchBygetPharmaFullLic_By_LN(
		String licenseNumber) {

		return getPersistence().fetchBygetPharmaFullLic_By_LN(licenseNumber);
	}

	/**
	 * Returns the pharma application full license where licenseNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param licenseNumber the license number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application full license, or <code>null</code> if a matching pharma application full license could not be found
	 */
	public static PharmaApplicationFullLicense fetchBygetPharmaFullLic_By_LN(
		String licenseNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetPharmaFullLic_By_LN(
			licenseNumber, useFinderCache);
	}

	/**
	 * Removes the pharma application full license where licenseNumber = &#63; from the database.
	 *
	 * @param licenseNumber the license number
	 * @return the pharma application full license that was removed
	 */
	public static PharmaApplicationFullLicense removeBygetPharmaFullLic_By_LN(
			String licenseNumber)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationFullLicenseException {

		return getPersistence().removeBygetPharmaFullLic_By_LN(licenseNumber);
	}

	/**
	 * Returns the number of pharma application full licenses where licenseNumber = &#63;.
	 *
	 * @param licenseNumber the license number
	 * @return the number of matching pharma application full licenses
	 */
	public static int countBygetPharmaFullLic_By_LN(String licenseNumber) {
		return getPersistence().countBygetPharmaFullLic_By_LN(licenseNumber);
	}

	/**
	 * Caches the pharma application full license in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationFullLicense the pharma application full license
	 */
	public static void cacheResult(
		PharmaApplicationFullLicense pharmaApplicationFullLicense) {

		getPersistence().cacheResult(pharmaApplicationFullLicense);
	}

	/**
	 * Caches the pharma application full licenses in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationFullLicenses the pharma application full licenses
	 */
	public static void cacheResult(
		List<PharmaApplicationFullLicense> pharmaApplicationFullLicenses) {

		getPersistence().cacheResult(pharmaApplicationFullLicenses);
	}

	/**
	 * Creates a new pharma application full license with the primary key. Does not add the pharma application full license to the database.
	 *
	 * @param pharmaFullLicenseId the primary key for the new pharma application full license
	 * @return the new pharma application full license
	 */
	public static PharmaApplicationFullLicense create(
		long pharmaFullLicenseId) {

		return getPersistence().create(pharmaFullLicenseId);
	}

	/**
	 * Removes the pharma application full license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaFullLicenseId the primary key of the pharma application full license
	 * @return the pharma application full license that was removed
	 * @throws NoSuchPharmaApplicationFullLicenseException if a pharma application full license with the primary key could not be found
	 */
	public static PharmaApplicationFullLicense remove(long pharmaFullLicenseId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationFullLicenseException {

		return getPersistence().remove(pharmaFullLicenseId);
	}

	public static PharmaApplicationFullLicense updateImpl(
		PharmaApplicationFullLicense pharmaApplicationFullLicense) {

		return getPersistence().updateImpl(pharmaApplicationFullLicense);
	}

	/**
	 * Returns the pharma application full license with the primary key or throws a <code>NoSuchPharmaApplicationFullLicenseException</code> if it could not be found.
	 *
	 * @param pharmaFullLicenseId the primary key of the pharma application full license
	 * @return the pharma application full license
	 * @throws NoSuchPharmaApplicationFullLicenseException if a pharma application full license with the primary key could not be found
	 */
	public static PharmaApplicationFullLicense findByPrimaryKey(
			long pharmaFullLicenseId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationFullLicenseException {

		return getPersistence().findByPrimaryKey(pharmaFullLicenseId);
	}

	/**
	 * Returns the pharma application full license with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaFullLicenseId the primary key of the pharma application full license
	 * @return the pharma application full license, or <code>null</code> if a pharma application full license with the primary key could not be found
	 */
	public static PharmaApplicationFullLicense fetchByPrimaryKey(
		long pharmaFullLicenseId) {

		return getPersistence().fetchByPrimaryKey(pharmaFullLicenseId);
	}

	/**
	 * Returns all the pharma application full licenses.
	 *
	 * @return the pharma application full licenses
	 */
	public static List<PharmaApplicationFullLicense> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the pharma application full licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationFullLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application full licenses
	 * @param end the upper bound of the range of pharma application full licenses (not inclusive)
	 * @return the range of pharma application full licenses
	 */
	public static List<PharmaApplicationFullLicense> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the pharma application full licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationFullLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application full licenses
	 * @param end the upper bound of the range of pharma application full licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma application full licenses
	 */
	public static List<PharmaApplicationFullLicense> findAll(
		int start, int end,
		OrderByComparator<PharmaApplicationFullLicense> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma application full licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationFullLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application full licenses
	 * @param end the upper bound of the range of pharma application full licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma application full licenses
	 */
	public static List<PharmaApplicationFullLicense> findAll(
		int start, int end,
		OrderByComparator<PharmaApplicationFullLicense> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the pharma application full licenses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of pharma application full licenses.
	 *
	 * @return the number of pharma application full licenses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PharmaApplicationFullLicensePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		PharmaApplicationFullLicensePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile PharmaApplicationFullLicensePersistence
		_persistence;

}