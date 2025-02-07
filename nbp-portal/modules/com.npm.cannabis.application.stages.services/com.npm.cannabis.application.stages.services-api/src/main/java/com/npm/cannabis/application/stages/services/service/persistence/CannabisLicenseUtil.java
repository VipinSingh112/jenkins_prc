/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.npm.cannabis.application.stages.services.model.CannabisLicense;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis license service. This utility wraps <code>com.npm.cannabis.application.stages.services.service.persistence.impl.CannabisLicensePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicensePersistence
 * @generated
 */
public class CannabisLicenseUtil {

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
	public static void clearCache(CannabisLicense cannabisLicense) {
		getPersistence().clearCache(cannabisLicense);
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
	public static Map<Serializable, CannabisLicense> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisLicense> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisLicense> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisLicense> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CannabisLicense> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisLicense update(CannabisLicense cannabisLicense) {
		return getPersistence().update(cannabisLicense);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisLicense update(
		CannabisLicense cannabisLicense, ServiceContext serviceContext) {

		return getPersistence().update(cannabisLicense, serviceContext);
	}

	/**
	 * Returns the cannabis license where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisLicenseException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis license
	 * @throws NoSuchCannabisLicenseException if a matching cannabis license could not be found
	 */
	public static CannabisLicense findBygetCL_CAI(long cannabisApplicationId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisLicenseException {

		return getPersistence().findBygetCL_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis license where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis license, or <code>null</code> if a matching cannabis license could not be found
	 */
	public static CannabisLicense fetchBygetCL_CAI(long cannabisApplicationId) {
		return getPersistence().fetchBygetCL_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis license where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis license, or <code>null</code> if a matching cannabis license could not be found
	 */
	public static CannabisLicense fetchBygetCL_CAI(
		long cannabisApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCL_CAI(
			cannabisApplicationId, useFinderCache);
	}

	/**
	 * Removes the cannabis license where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis license that was removed
	 */
	public static CannabisLicense removeBygetCL_CAI(long cannabisApplicationId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisLicenseException {

		return getPersistence().removeBygetCL_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the number of cannabis licenses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis licenses
	 */
	public static int countBygetCL_CAI(long cannabisApplicationId) {
		return getPersistence().countBygetCL_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis license where caseId = &#63; or throws a <code>NoSuchCannabisLicenseException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis license
	 * @throws NoSuchCannabisLicenseException if a matching cannabis license could not be found
	 */
	public static CannabisLicense findBygetCL_CaseId(String caseId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisLicenseException {

		return getPersistence().findBygetCL_CaseId(caseId);
	}

	/**
	 * Returns the cannabis license where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis license, or <code>null</code> if a matching cannabis license could not be found
	 */
	public static CannabisLicense fetchBygetCL_CaseId(String caseId) {
		return getPersistence().fetchBygetCL_CaseId(caseId);
	}

	/**
	 * Returns the cannabis license where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis license, or <code>null</code> if a matching cannabis license could not be found
	 */
	public static CannabisLicense fetchBygetCL_CaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetCL_CaseId(caseId, useFinderCache);
	}

	/**
	 * Removes the cannabis license where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the cannabis license that was removed
	 */
	public static CannabisLicense removeBygetCL_CaseId(String caseId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisLicenseException {

		return getPersistence().removeBygetCL_CaseId(caseId);
	}

	/**
	 * Returns the number of cannabis licenses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis licenses
	 */
	public static int countBygetCL_CaseId(String caseId) {
		return getPersistence().countBygetCL_CaseId(caseId);
	}

	/**
	 * Returns the cannabis license where licenseNumber = &#63; or throws a <code>NoSuchCannabisLicenseException</code> if it could not be found.
	 *
	 * @param licenseNumber the license number
	 * @return the matching cannabis license
	 * @throws NoSuchCannabisLicenseException if a matching cannabis license could not be found
	 */
	public static CannabisLicense findBygetCL_LN(String licenseNumber)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisLicenseException {

		return getPersistence().findBygetCL_LN(licenseNumber);
	}

	/**
	 * Returns the cannabis license where licenseNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param licenseNumber the license number
	 * @return the matching cannabis license, or <code>null</code> if a matching cannabis license could not be found
	 */
	public static CannabisLicense fetchBygetCL_LN(String licenseNumber) {
		return getPersistence().fetchBygetCL_LN(licenseNumber);
	}

	/**
	 * Returns the cannabis license where licenseNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param licenseNumber the license number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis license, or <code>null</code> if a matching cannabis license could not be found
	 */
	public static CannabisLicense fetchBygetCL_LN(
		String licenseNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetCL_LN(licenseNumber, useFinderCache);
	}

	/**
	 * Removes the cannabis license where licenseNumber = &#63; from the database.
	 *
	 * @param licenseNumber the license number
	 * @return the cannabis license that was removed
	 */
	public static CannabisLicense removeBygetCL_LN(String licenseNumber)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisLicenseException {

		return getPersistence().removeBygetCL_LN(licenseNumber);
	}

	/**
	 * Returns the number of cannabis licenses where licenseNumber = &#63;.
	 *
	 * @param licenseNumber the license number
	 * @return the number of matching cannabis licenses
	 */
	public static int countBygetCL_LN(String licenseNumber) {
		return getPersistence().countBygetCL_LN(licenseNumber);
	}

	/**
	 * Caches the cannabis license in the entity cache if it is enabled.
	 *
	 * @param cannabisLicense the cannabis license
	 */
	public static void cacheResult(CannabisLicense cannabisLicense) {
		getPersistence().cacheResult(cannabisLicense);
	}

	/**
	 * Caches the cannabis licenses in the entity cache if it is enabled.
	 *
	 * @param cannabisLicenses the cannabis licenses
	 */
	public static void cacheResult(List<CannabisLicense> cannabisLicenses) {
		getPersistence().cacheResult(cannabisLicenses);
	}

	/**
	 * Creates a new cannabis license with the primary key. Does not add the cannabis license to the database.
	 *
	 * @param cannabisLicenseId the primary key for the new cannabis license
	 * @return the new cannabis license
	 */
	public static CannabisLicense create(long cannabisLicenseId) {
		return getPersistence().create(cannabisLicenseId);
	}

	/**
	 * Removes the cannabis license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisLicenseId the primary key of the cannabis license
	 * @return the cannabis license that was removed
	 * @throws NoSuchCannabisLicenseException if a cannabis license with the primary key could not be found
	 */
	public static CannabisLicense remove(long cannabisLicenseId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisLicenseException {

		return getPersistence().remove(cannabisLicenseId);
	}

	public static CannabisLicense updateImpl(CannabisLicense cannabisLicense) {
		return getPersistence().updateImpl(cannabisLicense);
	}

	/**
	 * Returns the cannabis license with the primary key or throws a <code>NoSuchCannabisLicenseException</code> if it could not be found.
	 *
	 * @param cannabisLicenseId the primary key of the cannabis license
	 * @return the cannabis license
	 * @throws NoSuchCannabisLicenseException if a cannabis license with the primary key could not be found
	 */
	public static CannabisLicense findByPrimaryKey(long cannabisLicenseId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisLicenseException {

		return getPersistence().findByPrimaryKey(cannabisLicenseId);
	}

	/**
	 * Returns the cannabis license with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisLicenseId the primary key of the cannabis license
	 * @return the cannabis license, or <code>null</code> if a cannabis license with the primary key could not be found
	 */
	public static CannabisLicense fetchByPrimaryKey(long cannabisLicenseId) {
		return getPersistence().fetchByPrimaryKey(cannabisLicenseId);
	}

	/**
	 * Returns all the cannabis licenses.
	 *
	 * @return the cannabis licenses
	 */
	public static List<CannabisLicense> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis licenses
	 * @param end the upper bound of the range of cannabis licenses (not inclusive)
	 * @return the range of cannabis licenses
	 */
	public static List<CannabisLicense> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis licenses
	 * @param end the upper bound of the range of cannabis licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis licenses
	 */
	public static List<CannabisLicense> findAll(
		int start, int end,
		OrderByComparator<CannabisLicense> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis licenses
	 * @param end the upper bound of the range of cannabis licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis licenses
	 */
	public static List<CannabisLicense> findAll(
		int start, int end,
		OrderByComparator<CannabisLicense> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis licenses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis licenses.
	 *
	 * @return the number of cannabis licenses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisLicensePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(CannabisLicensePersistence persistence) {
		_persistence = persistence;
	}

	private static volatile CannabisLicensePersistence _persistence;

}