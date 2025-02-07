/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.CannabisConsentByPropertyOwner;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis consent by property owner service. This utility wraps <code>com.nbp.cannabis.application.form.services.service.persistence.impl.CannabisConsentByPropertyOwnerPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConsentByPropertyOwnerPersistence
 * @generated
 */
public class CannabisConsentByPropertyOwnerUtil {

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
		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner) {

		getPersistence().clearCache(cannabisConsentByPropertyOwner);
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
	public static Map<Serializable, CannabisConsentByPropertyOwner>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisConsentByPropertyOwner> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisConsentByPropertyOwner> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisConsentByPropertyOwner> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisConsentByPropertyOwner update(
		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner) {

		return getPersistence().update(cannabisConsentByPropertyOwner);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisConsentByPropertyOwner update(
		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner,
		ServiceContext serviceContext) {

		return getPersistence().update(
			cannabisConsentByPropertyOwner, serviceContext);
	}

	/**
	 * Returns all the cannabis consent by property owners where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis consent by property owners
	 */
	public static List<CannabisConsentByPropertyOwner> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the cannabis consent by property owners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentByPropertyOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis consent by property owners
	 * @param end the upper bound of the range of cannabis consent by property owners (not inclusive)
	 * @return the range of matching cannabis consent by property owners
	 */
	public static List<CannabisConsentByPropertyOwner> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis consent by property owners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentByPropertyOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis consent by property owners
	 * @param end the upper bound of the range of cannabis consent by property owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis consent by property owners
	 */
	public static List<CannabisConsentByPropertyOwner> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis consent by property owners where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentByPropertyOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis consent by property owners
	 * @param end the upper bound of the range of cannabis consent by property owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis consent by property owners
	 */
	public static List<CannabisConsentByPropertyOwner> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis consent by property owner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a matching cannabis consent by property owner could not be found
	 */
	public static CannabisConsentByPropertyOwner findByUuid_First(
			String uuid,
			OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisConsentByPropertyOwnerException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first cannabis consent by property owner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	public static CannabisConsentByPropertyOwner fetchByUuid_First(
		String uuid,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last cannabis consent by property owner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a matching cannabis consent by property owner could not be found
	 */
	public static CannabisConsentByPropertyOwner findByUuid_Last(
			String uuid,
			OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisConsentByPropertyOwnerException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last cannabis consent by property owner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	public static CannabisConsentByPropertyOwner fetchByUuid_Last(
		String uuid,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the cannabis consent by property owners before and after the current cannabis consent by property owner in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisCPOId the primary key of the current cannabis consent by property owner
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a cannabis consent by property owner with the primary key could not be found
	 */
	public static CannabisConsentByPropertyOwner[] findByUuid_PrevAndNext(
			long cannabisCPOId, String uuid,
			OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisConsentByPropertyOwnerException {

		return getPersistence().findByUuid_PrevAndNext(
			cannabisCPOId, uuid, orderByComparator);
	}

	/**
	 * Removes all the cannabis consent by property owners where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of cannabis consent by property owners where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis consent by property owners
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the cannabis consent by property owner where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisConsentByPropertyOwnerException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a matching cannabis consent by property owner could not be found
	 */
	public static CannabisConsentByPropertyOwner findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisConsentByPropertyOwnerException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cannabis consent by property owner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	public static CannabisConsentByPropertyOwner fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cannabis consent by property owner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	public static CannabisConsentByPropertyOwner fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the cannabis consent by property owner where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis consent by property owner that was removed
	 */
	public static CannabisConsentByPropertyOwner removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisConsentByPropertyOwnerException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of cannabis consent by property owners where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis consent by property owners
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the cannabis consent by property owners where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis consent by property owners
	 */
	public static List<CannabisConsentByPropertyOwner> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the cannabis consent by property owners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentByPropertyOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis consent by property owners
	 * @param end the upper bound of the range of cannabis consent by property owners (not inclusive)
	 * @return the range of matching cannabis consent by property owners
	 */
	public static List<CannabisConsentByPropertyOwner> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis consent by property owners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentByPropertyOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis consent by property owners
	 * @param end the upper bound of the range of cannabis consent by property owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis consent by property owners
	 */
	public static List<CannabisConsentByPropertyOwner> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis consent by property owners where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentByPropertyOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis consent by property owners
	 * @param end the upper bound of the range of cannabis consent by property owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis consent by property owners
	 */
	public static List<CannabisConsentByPropertyOwner> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis consent by property owner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a matching cannabis consent by property owner could not be found
	 */
	public static CannabisConsentByPropertyOwner findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisConsentByPropertyOwnerException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first cannabis consent by property owner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	public static CannabisConsentByPropertyOwner fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last cannabis consent by property owner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a matching cannabis consent by property owner could not be found
	 */
	public static CannabisConsentByPropertyOwner findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisConsentByPropertyOwnerException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last cannabis consent by property owner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	public static CannabisConsentByPropertyOwner fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the cannabis consent by property owners before and after the current cannabis consent by property owner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cannabisCPOId the primary key of the current cannabis consent by property owner
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a cannabis consent by property owner with the primary key could not be found
	 */
	public static CannabisConsentByPropertyOwner[] findByUuid_C_PrevAndNext(
			long cannabisCPOId, String uuid, long companyId,
			OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisConsentByPropertyOwnerException {

		return getPersistence().findByUuid_C_PrevAndNext(
			cannabisCPOId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the cannabis consent by property owners where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of cannabis consent by property owners where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis consent by property owners
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the cannabis consent by property owner where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisConsentByPropertyOwnerException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a matching cannabis consent by property owner could not be found
	 */
	public static CannabisConsentByPropertyOwner findBygetCA_CPO_CAI(
			long cannabisApplicationId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisConsentByPropertyOwnerException {

		return getPersistence().findBygetCA_CPO_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis consent by property owner where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	public static CannabisConsentByPropertyOwner fetchBygetCA_CPO_CAI(
		long cannabisApplicationId) {

		return getPersistence().fetchBygetCA_CPO_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis consent by property owner where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	public static CannabisConsentByPropertyOwner fetchBygetCA_CPO_CAI(
		long cannabisApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCA_CPO_CAI(
			cannabisApplicationId, useFinderCache);
	}

	/**
	 * Removes the cannabis consent by property owner where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis consent by property owner that was removed
	 */
	public static CannabisConsentByPropertyOwner removeBygetCA_CPO_CAI(
			long cannabisApplicationId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisConsentByPropertyOwnerException {

		return getPersistence().removeBygetCA_CPO_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the number of cannabis consent by property owners where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis consent by property owners
	 */
	public static int countBygetCA_CPO_CAI(long cannabisApplicationId) {
		return getPersistence().countBygetCA_CPO_CAI(cannabisApplicationId);
	}

	/**
	 * Caches the cannabis consent by property owner in the entity cache if it is enabled.
	 *
	 * @param cannabisConsentByPropertyOwner the cannabis consent by property owner
	 */
	public static void cacheResult(
		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner) {

		getPersistence().cacheResult(cannabisConsentByPropertyOwner);
	}

	/**
	 * Caches the cannabis consent by property owners in the entity cache if it is enabled.
	 *
	 * @param cannabisConsentByPropertyOwners the cannabis consent by property owners
	 */
	public static void cacheResult(
		List<CannabisConsentByPropertyOwner> cannabisConsentByPropertyOwners) {

		getPersistence().cacheResult(cannabisConsentByPropertyOwners);
	}

	/**
	 * Creates a new cannabis consent by property owner with the primary key. Does not add the cannabis consent by property owner to the database.
	 *
	 * @param cannabisCPOId the primary key for the new cannabis consent by property owner
	 * @return the new cannabis consent by property owner
	 */
	public static CannabisConsentByPropertyOwner create(long cannabisCPOId) {
		return getPersistence().create(cannabisCPOId);
	}

	/**
	 * Removes the cannabis consent by property owner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisCPOId the primary key of the cannabis consent by property owner
	 * @return the cannabis consent by property owner that was removed
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a cannabis consent by property owner with the primary key could not be found
	 */
	public static CannabisConsentByPropertyOwner remove(long cannabisCPOId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisConsentByPropertyOwnerException {

		return getPersistence().remove(cannabisCPOId);
	}

	public static CannabisConsentByPropertyOwner updateImpl(
		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner) {

		return getPersistence().updateImpl(cannabisConsentByPropertyOwner);
	}

	/**
	 * Returns the cannabis consent by property owner with the primary key or throws a <code>NoSuchCannabisConsentByPropertyOwnerException</code> if it could not be found.
	 *
	 * @param cannabisCPOId the primary key of the cannabis consent by property owner
	 * @return the cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a cannabis consent by property owner with the primary key could not be found
	 */
	public static CannabisConsentByPropertyOwner findByPrimaryKey(
			long cannabisCPOId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisConsentByPropertyOwnerException {

		return getPersistence().findByPrimaryKey(cannabisCPOId);
	}

	/**
	 * Returns the cannabis consent by property owner with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisCPOId the primary key of the cannabis consent by property owner
	 * @return the cannabis consent by property owner, or <code>null</code> if a cannabis consent by property owner with the primary key could not be found
	 */
	public static CannabisConsentByPropertyOwner fetchByPrimaryKey(
		long cannabisCPOId) {

		return getPersistence().fetchByPrimaryKey(cannabisCPOId);
	}

	/**
	 * Returns all the cannabis consent by property owners.
	 *
	 * @return the cannabis consent by property owners
	 */
	public static List<CannabisConsentByPropertyOwner> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis consent by property owners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentByPropertyOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis consent by property owners
	 * @param end the upper bound of the range of cannabis consent by property owners (not inclusive)
	 * @return the range of cannabis consent by property owners
	 */
	public static List<CannabisConsentByPropertyOwner> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis consent by property owners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentByPropertyOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis consent by property owners
	 * @param end the upper bound of the range of cannabis consent by property owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis consent by property owners
	 */
	public static List<CannabisConsentByPropertyOwner> findAll(
		int start, int end,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis consent by property owners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConsentByPropertyOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis consent by property owners
	 * @param end the upper bound of the range of cannabis consent by property owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis consent by property owners
	 */
	public static List<CannabisConsentByPropertyOwner> findAll(
		int start, int end,
		OrderByComparator<CannabisConsentByPropertyOwner> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis consent by property owners from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis consent by property owners.
	 *
	 * @return the number of cannabis consent by property owners
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisConsentByPropertyOwnerPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CannabisConsentByPropertyOwnerPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CannabisConsentByPropertyOwnerPersistence
		_persistence;

}