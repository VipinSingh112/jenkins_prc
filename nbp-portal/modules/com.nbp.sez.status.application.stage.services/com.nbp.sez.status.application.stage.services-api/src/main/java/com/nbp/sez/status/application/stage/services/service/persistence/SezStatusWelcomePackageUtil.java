/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.stage.services.model.SezStatusWelcomePackage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez status welcome package service. This utility wraps <code>com.nbp.sez.status.application.stage.services.service.persistence.impl.SezStatusWelcomePackagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWelcomePackagePersistence
 * @generated
 */
public class SezStatusWelcomePackageUtil {

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
		SezStatusWelcomePackage sezStatusWelcomePackage) {

		getPersistence().clearCache(sezStatusWelcomePackage);
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
	public static Map<Serializable, SezStatusWelcomePackage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezStatusWelcomePackage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezStatusWelcomePackage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezStatusWelcomePackage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezStatusWelcomePackage update(
		SezStatusWelcomePackage sezStatusWelcomePackage) {

		return getPersistence().update(sezStatusWelcomePackage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezStatusWelcomePackage update(
		SezStatusWelcomePackage sezStatusWelcomePackage,
		ServiceContext serviceContext) {

		return getPersistence().update(sezStatusWelcomePackage, serviceContext);
	}

	/**
	 * Returns all the sez status welcome packages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sez status welcome packages
	 */
	public static List<SezStatusWelcomePackage> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the sez status welcome packages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @return the range of matching sez status welcome packages
	 */
	public static List<SezStatusWelcomePackage> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the sez status welcome packages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status welcome packages
	 */
	public static List<SezStatusWelcomePackage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status welcome packages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status welcome packages
	 */
	public static List<SezStatusWelcomePackage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sez status welcome package in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a matching sez status welcome package could not be found
	 */
	public static SezStatusWelcomePackage findByUuid_First(
			String uuid,
			OrderByComparator<SezStatusWelcomePackage> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWelcomePackageException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first sez status welcome package in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	public static SezStatusWelcomePackage fetchByUuid_First(
		String uuid,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last sez status welcome package in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a matching sez status welcome package could not be found
	 */
	public static SezStatusWelcomePackage findByUuid_Last(
			String uuid,
			OrderByComparator<SezStatusWelcomePackage> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWelcomePackageException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last sez status welcome package in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	public static SezStatusWelcomePackage fetchByUuid_Last(
		String uuid,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the sez status welcome packages before and after the current sez status welcome package in the ordered set where uuid = &#63;.
	 *
	 * @param sezStatusWelcomeId the primary key of the current sez status welcome package
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a sez status welcome package with the primary key could not be found
	 */
	public static SezStatusWelcomePackage[] findByUuid_PrevAndNext(
			long sezStatusWelcomeId, String uuid,
			OrderByComparator<SezStatusWelcomePackage> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWelcomePackageException {

		return getPersistence().findByUuid_PrevAndNext(
			sezStatusWelcomeId, uuid, orderByComparator);
	}

	/**
	 * Removes all the sez status welcome packages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of sez status welcome packages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sez status welcome packages
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the sez status welcome package where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSezStatusWelcomePackageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a matching sez status welcome package could not be found
	 */
	public static SezStatusWelcomePackage findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWelcomePackageException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the sez status welcome package where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	public static SezStatusWelcomePackage fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the sez status welcome package where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	public static SezStatusWelcomePackage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the sez status welcome package where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sez status welcome package that was removed
	 */
	public static SezStatusWelcomePackage removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWelcomePackageException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of sez status welcome packages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching sez status welcome packages
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the sez status welcome packages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sez status welcome packages
	 */
	public static List<SezStatusWelcomePackage> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the sez status welcome packages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @return the range of matching sez status welcome packages
	 */
	public static List<SezStatusWelcomePackage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez status welcome packages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status welcome packages
	 */
	public static List<SezStatusWelcomePackage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status welcome packages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status welcome packages
	 */
	public static List<SezStatusWelcomePackage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sez status welcome package in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a matching sez status welcome package could not be found
	 */
	public static SezStatusWelcomePackage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<SezStatusWelcomePackage> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWelcomePackageException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first sez status welcome package in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	public static SezStatusWelcomePackage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last sez status welcome package in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a matching sez status welcome package could not be found
	 */
	public static SezStatusWelcomePackage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<SezStatusWelcomePackage> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWelcomePackageException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last sez status welcome package in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	public static SezStatusWelcomePackage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the sez status welcome packages before and after the current sez status welcome package in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param sezStatusWelcomeId the primary key of the current sez status welcome package
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a sez status welcome package with the primary key could not be found
	 */
	public static SezStatusWelcomePackage[] findByUuid_C_PrevAndNext(
			long sezStatusWelcomeId, String uuid, long companyId,
			OrderByComparator<SezStatusWelcomePackage> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWelcomePackageException {

		return getPersistence().findByUuid_C_PrevAndNext(
			sezStatusWelcomeId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the sez status welcome packages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of sez status welcome packages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sez status welcome packages
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the sez status welcome package where caseId = &#63; or throws a <code>NoSuchSezStatusWelcomePackageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a matching sez status welcome package could not be found
	 */
	public static SezStatusWelcomePackage
			findBygetSezStatus_Welcome_Package_By_CI(String caseId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWelcomePackageException {

		return getPersistence().findBygetSezStatus_Welcome_Package_By_CI(
			caseId);
	}

	/**
	 * Returns the sez status welcome package where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	public static SezStatusWelcomePackage
		fetchBygetSezStatus_Welcome_Package_By_CI(String caseId) {

		return getPersistence().fetchBygetSezStatus_Welcome_Package_By_CI(
			caseId);
	}

	/**
	 * Returns the sez status welcome package where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status welcome package, or <code>null</code> if a matching sez status welcome package could not be found
	 */
	public static SezStatusWelcomePackage
		fetchBygetSezStatus_Welcome_Package_By_CI(
			String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatus_Welcome_Package_By_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the sez status welcome package where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status welcome package that was removed
	 */
	public static SezStatusWelcomePackage
			removeBygetSezStatus_Welcome_Package_By_CI(String caseId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWelcomePackageException {

		return getPersistence().removeBygetSezStatus_Welcome_Package_By_CI(
			caseId);
	}

	/**
	 * Returns the number of sez status welcome packages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status welcome packages
	 */
	public static int countBygetSezStatus_Welcome_Package_By_CI(String caseId) {
		return getPersistence().countBygetSezStatus_Welcome_Package_By_CI(
			caseId);
	}

	/**
	 * Caches the sez status welcome package in the entity cache if it is enabled.
	 *
	 * @param sezStatusWelcomePackage the sez status welcome package
	 */
	public static void cacheResult(
		SezStatusWelcomePackage sezStatusWelcomePackage) {

		getPersistence().cacheResult(sezStatusWelcomePackage);
	}

	/**
	 * Caches the sez status welcome packages in the entity cache if it is enabled.
	 *
	 * @param sezStatusWelcomePackages the sez status welcome packages
	 */
	public static void cacheResult(
		List<SezStatusWelcomePackage> sezStatusWelcomePackages) {

		getPersistence().cacheResult(sezStatusWelcomePackages);
	}

	/**
	 * Creates a new sez status welcome package with the primary key. Does not add the sez status welcome package to the database.
	 *
	 * @param sezStatusWelcomeId the primary key for the new sez status welcome package
	 * @return the new sez status welcome package
	 */
	public static SezStatusWelcomePackage create(long sezStatusWelcomeId) {
		return getPersistence().create(sezStatusWelcomeId);
	}

	/**
	 * Removes the sez status welcome package with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStatusWelcomeId the primary key of the sez status welcome package
	 * @return the sez status welcome package that was removed
	 * @throws NoSuchSezStatusWelcomePackageException if a sez status welcome package with the primary key could not be found
	 */
	public static SezStatusWelcomePackage remove(long sezStatusWelcomeId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWelcomePackageException {

		return getPersistence().remove(sezStatusWelcomeId);
	}

	public static SezStatusWelcomePackage updateImpl(
		SezStatusWelcomePackage sezStatusWelcomePackage) {

		return getPersistence().updateImpl(sezStatusWelcomePackage);
	}

	/**
	 * Returns the sez status welcome package with the primary key or throws a <code>NoSuchSezStatusWelcomePackageException</code> if it could not be found.
	 *
	 * @param sezStatusWelcomeId the primary key of the sez status welcome package
	 * @return the sez status welcome package
	 * @throws NoSuchSezStatusWelcomePackageException if a sez status welcome package with the primary key could not be found
	 */
	public static SezStatusWelcomePackage findByPrimaryKey(
			long sezStatusWelcomeId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWelcomePackageException {

		return getPersistence().findByPrimaryKey(sezStatusWelcomeId);
	}

	/**
	 * Returns the sez status welcome package with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStatusWelcomeId the primary key of the sez status welcome package
	 * @return the sez status welcome package, or <code>null</code> if a sez status welcome package with the primary key could not be found
	 */
	public static SezStatusWelcomePackage fetchByPrimaryKey(
		long sezStatusWelcomeId) {

		return getPersistence().fetchByPrimaryKey(sezStatusWelcomeId);
	}

	/**
	 * Returns all the sez status welcome packages.
	 *
	 * @return the sez status welcome packages
	 */
	public static List<SezStatusWelcomePackage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez status welcome packages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @return the range of sez status welcome packages
	 */
	public static List<SezStatusWelcomePackage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez status welcome packages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status welcome packages
	 */
	public static List<SezStatusWelcomePackage> findAll(
		int start, int end,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status welcome packages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWelcomePackageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status welcome packages
	 * @param end the upper bound of the range of sez status welcome packages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status welcome packages
	 */
	public static List<SezStatusWelcomePackage> findAll(
		int start, int end,
		OrderByComparator<SezStatusWelcomePackage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez status welcome packages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez status welcome packages.
	 *
	 * @return the number of sez status welcome packages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezStatusWelcomePackagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezStatusWelcomePackagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezStatusWelcomePackagePersistence _persistence;

}