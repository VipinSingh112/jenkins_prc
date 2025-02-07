/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.npm.cannabis.application.stages.services.model.CannabisConditionalLicense;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis conditional license service. This utility wraps <code>com.npm.cannabis.application.stages.services.service.persistence.impl.CannabisConditionalLicensePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConditionalLicensePersistence
 * @generated
 */
public class CannabisConditionalLicenseUtil {

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
		CannabisConditionalLicense cannabisConditionalLicense) {

		getPersistence().clearCache(cannabisConditionalLicense);
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
	public static Map<Serializable, CannabisConditionalLicense>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisConditionalLicense> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisConditionalLicense> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisConditionalLicense> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CannabisConditionalLicense> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisConditionalLicense update(
		CannabisConditionalLicense cannabisConditionalLicense) {

		return getPersistence().update(cannabisConditionalLicense);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisConditionalLicense update(
		CannabisConditionalLicense cannabisConditionalLicense,
		ServiceContext serviceContext) {

		return getPersistence().update(
			cannabisConditionalLicense, serviceContext);
	}

	/**
	 * Returns the cannabis conditional license where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisConditionalLicenseException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis conditional license
	 * @throws NoSuchCannabisConditionalLicenseException if a matching cannabis conditional license could not be found
	 */
	public static CannabisConditionalLicense findBygetCCL_CAI(
			long cannabisApplicationId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicenseException {

		return getPersistence().findBygetCCL_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis conditional license where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis conditional license, or <code>null</code> if a matching cannabis conditional license could not be found
	 */
	public static CannabisConditionalLicense fetchBygetCCL_CAI(
		long cannabisApplicationId) {

		return getPersistence().fetchBygetCCL_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis conditional license where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis conditional license, or <code>null</code> if a matching cannabis conditional license could not be found
	 */
	public static CannabisConditionalLicense fetchBygetCCL_CAI(
		long cannabisApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCCL_CAI(
			cannabisApplicationId, useFinderCache);
	}

	/**
	 * Removes the cannabis conditional license where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis conditional license that was removed
	 */
	public static CannabisConditionalLicense removeBygetCCL_CAI(
			long cannabisApplicationId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicenseException {

		return getPersistence().removeBygetCCL_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the number of cannabis conditional licenses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis conditional licenses
	 */
	public static int countBygetCCL_CAI(long cannabisApplicationId) {
		return getPersistence().countBygetCCL_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis conditional license where caseId = &#63; or throws a <code>NoSuchCannabisConditionalLicenseException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis conditional license
	 * @throws NoSuchCannabisConditionalLicenseException if a matching cannabis conditional license could not be found
	 */
	public static CannabisConditionalLicense findBygetCCL_CaseId(String caseId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicenseException {

		return getPersistence().findBygetCCL_CaseId(caseId);
	}

	/**
	 * Returns the cannabis conditional license where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis conditional license, or <code>null</code> if a matching cannabis conditional license could not be found
	 */
	public static CannabisConditionalLicense fetchBygetCCL_CaseId(
		String caseId) {

		return getPersistence().fetchBygetCCL_CaseId(caseId);
	}

	/**
	 * Returns the cannabis conditional license where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis conditional license, or <code>null</code> if a matching cannabis conditional license could not be found
	 */
	public static CannabisConditionalLicense fetchBygetCCL_CaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetCCL_CaseId(caseId, useFinderCache);
	}

	/**
	 * Removes the cannabis conditional license where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the cannabis conditional license that was removed
	 */
	public static CannabisConditionalLicense removeBygetCCL_CaseId(
			String caseId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicenseException {

		return getPersistence().removeBygetCCL_CaseId(caseId);
	}

	/**
	 * Returns the number of cannabis conditional licenses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis conditional licenses
	 */
	public static int countBygetCCL_CaseId(String caseId) {
		return getPersistence().countBygetCCL_CaseId(caseId);
	}

	/**
	 * Returns all the cannabis conditional licenses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis conditional licenses
	 */
	public static List<CannabisConditionalLicense> findBygetCCL_BycaseId(
		String caseId) {

		return getPersistence().findBygetCCL_BycaseId(caseId);
	}

	/**
	 * Returns a range of all the cannabis conditional licenses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional licenses
	 * @param end the upper bound of the range of cannabis conditional licenses (not inclusive)
	 * @return the range of matching cannabis conditional licenses
	 */
	public static List<CannabisConditionalLicense> findBygetCCL_BycaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetCCL_BycaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional licenses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional licenses
	 * @param end the upper bound of the range of cannabis conditional licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis conditional licenses
	 */
	public static List<CannabisConditionalLicense> findBygetCCL_BycaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisConditionalLicense> orderByComparator) {

		return getPersistence().findBygetCCL_BycaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional licenses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional licenses
	 * @param end the upper bound of the range of cannabis conditional licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis conditional licenses
	 */
	public static List<CannabisConditionalLicense> findBygetCCL_BycaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisConditionalLicense> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCCL_BycaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis conditional license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license
	 * @throws NoSuchCannabisConditionalLicenseException if a matching cannabis conditional license could not be found
	 */
	public static CannabisConditionalLicense findBygetCCL_BycaseId_First(
			String caseId,
			OrderByComparator<CannabisConditionalLicense> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicenseException {

		return getPersistence().findBygetCCL_BycaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first cannabis conditional license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license, or <code>null</code> if a matching cannabis conditional license could not be found
	 */
	public static CannabisConditionalLicense fetchBygetCCL_BycaseId_First(
		String caseId,
		OrderByComparator<CannabisConditionalLicense> orderByComparator) {

		return getPersistence().fetchBygetCCL_BycaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last cannabis conditional license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license
	 * @throws NoSuchCannabisConditionalLicenseException if a matching cannabis conditional license could not be found
	 */
	public static CannabisConditionalLicense findBygetCCL_BycaseId_Last(
			String caseId,
			OrderByComparator<CannabisConditionalLicense> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicenseException {

		return getPersistence().findBygetCCL_BycaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last cannabis conditional license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license, or <code>null</code> if a matching cannabis conditional license could not be found
	 */
	public static CannabisConditionalLicense fetchBygetCCL_BycaseId_Last(
		String caseId,
		OrderByComparator<CannabisConditionalLicense> orderByComparator) {

		return getPersistence().fetchBygetCCL_BycaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the cannabis conditional licenses before and after the current cannabis conditional license in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisConditonalLicenseId the primary key of the current cannabis conditional license
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis conditional license
	 * @throws NoSuchCannabisConditionalLicenseException if a cannabis conditional license with the primary key could not be found
	 */
	public static CannabisConditionalLicense[]
			findBygetCCL_BycaseId_PrevAndNext(
				long cannabisConditonalLicenseId, String caseId,
				OrderByComparator<CannabisConditionalLicense> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicenseException {

		return getPersistence().findBygetCCL_BycaseId_PrevAndNext(
			cannabisConditonalLicenseId, caseId, orderByComparator);
	}

	/**
	 * Removes all the cannabis conditional licenses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetCCL_BycaseId(String caseId) {
		getPersistence().removeBygetCCL_BycaseId(caseId);
	}

	/**
	 * Returns the number of cannabis conditional licenses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis conditional licenses
	 */
	public static int countBygetCCL_BycaseId(String caseId) {
		return getPersistence().countBygetCCL_BycaseId(caseId);
	}

	/**
	 * Caches the cannabis conditional license in the entity cache if it is enabled.
	 *
	 * @param cannabisConditionalLicense the cannabis conditional license
	 */
	public static void cacheResult(
		CannabisConditionalLicense cannabisConditionalLicense) {

		getPersistence().cacheResult(cannabisConditionalLicense);
	}

	/**
	 * Caches the cannabis conditional licenses in the entity cache if it is enabled.
	 *
	 * @param cannabisConditionalLicenses the cannabis conditional licenses
	 */
	public static void cacheResult(
		List<CannabisConditionalLicense> cannabisConditionalLicenses) {

		getPersistence().cacheResult(cannabisConditionalLicenses);
	}

	/**
	 * Creates a new cannabis conditional license with the primary key. Does not add the cannabis conditional license to the database.
	 *
	 * @param cannabisConditonalLicenseId the primary key for the new cannabis conditional license
	 * @return the new cannabis conditional license
	 */
	public static CannabisConditionalLicense create(
		long cannabisConditonalLicenseId) {

		return getPersistence().create(cannabisConditonalLicenseId);
	}

	/**
	 * Removes the cannabis conditional license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisConditonalLicenseId the primary key of the cannabis conditional license
	 * @return the cannabis conditional license that was removed
	 * @throws NoSuchCannabisConditionalLicenseException if a cannabis conditional license with the primary key could not be found
	 */
	public static CannabisConditionalLicense remove(
			long cannabisConditonalLicenseId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicenseException {

		return getPersistence().remove(cannabisConditonalLicenseId);
	}

	public static CannabisConditionalLicense updateImpl(
		CannabisConditionalLicense cannabisConditionalLicense) {

		return getPersistence().updateImpl(cannabisConditionalLicense);
	}

	/**
	 * Returns the cannabis conditional license with the primary key or throws a <code>NoSuchCannabisConditionalLicenseException</code> if it could not be found.
	 *
	 * @param cannabisConditonalLicenseId the primary key of the cannabis conditional license
	 * @return the cannabis conditional license
	 * @throws NoSuchCannabisConditionalLicenseException if a cannabis conditional license with the primary key could not be found
	 */
	public static CannabisConditionalLicense findByPrimaryKey(
			long cannabisConditonalLicenseId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisConditionalLicenseException {

		return getPersistence().findByPrimaryKey(cannabisConditonalLicenseId);
	}

	/**
	 * Returns the cannabis conditional license with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisConditonalLicenseId the primary key of the cannabis conditional license
	 * @return the cannabis conditional license, or <code>null</code> if a cannabis conditional license with the primary key could not be found
	 */
	public static CannabisConditionalLicense fetchByPrimaryKey(
		long cannabisConditonalLicenseId) {

		return getPersistence().fetchByPrimaryKey(cannabisConditonalLicenseId);
	}

	/**
	 * Returns all the cannabis conditional licenses.
	 *
	 * @return the cannabis conditional licenses
	 */
	public static List<CannabisConditionalLicense> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis conditional licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis conditional licenses
	 * @param end the upper bound of the range of cannabis conditional licenses (not inclusive)
	 * @return the range of cannabis conditional licenses
	 */
	public static List<CannabisConditionalLicense> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis conditional licenses
	 * @param end the upper bound of the range of cannabis conditional licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis conditional licenses
	 */
	public static List<CannabisConditionalLicense> findAll(
		int start, int end,
		OrderByComparator<CannabisConditionalLicense> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis conditional licenses
	 * @param end the upper bound of the range of cannabis conditional licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis conditional licenses
	 */
	public static List<CannabisConditionalLicense> findAll(
		int start, int end,
		OrderByComparator<CannabisConditionalLicense> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis conditional licenses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis conditional licenses.
	 *
	 * @return the number of cannabis conditional licenses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisConditionalLicensePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CannabisConditionalLicensePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CannabisConditionalLicensePersistence _persistence;

}