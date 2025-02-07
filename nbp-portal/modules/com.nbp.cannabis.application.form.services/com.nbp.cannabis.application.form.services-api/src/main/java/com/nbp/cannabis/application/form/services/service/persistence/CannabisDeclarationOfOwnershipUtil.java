/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.CannabisDeclarationOfOwnership;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis declaration of ownership service. This utility wraps <code>com.nbp.cannabis.application.form.services.service.persistence.impl.CannabisDeclarationOfOwnershipPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisDeclarationOfOwnershipPersistence
 * @generated
 */
public class CannabisDeclarationOfOwnershipUtil {

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
		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership) {

		getPersistence().clearCache(cannabisDeclarationOfOwnership);
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
	public static Map<Serializable, CannabisDeclarationOfOwnership>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisDeclarationOfOwnership> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisDeclarationOfOwnership> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisDeclarationOfOwnership> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisDeclarationOfOwnership update(
		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership) {

		return getPersistence().update(cannabisDeclarationOfOwnership);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisDeclarationOfOwnership update(
		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership,
		ServiceContext serviceContext) {

		return getPersistence().update(
			cannabisDeclarationOfOwnership, serviceContext);
	}

	/**
	 * Returns all the cannabis declaration of ownerships where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis declaration of ownerships
	 */
	public static List<CannabisDeclarationOfOwnership> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the cannabis declaration of ownerships where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @return the range of matching cannabis declaration of ownerships
	 */
	public static List<CannabisDeclarationOfOwnership> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis declaration of ownerships where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis declaration of ownerships
	 */
	public static List<CannabisDeclarationOfOwnership> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis declaration of ownerships where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis declaration of ownerships
	 */
	public static List<CannabisDeclarationOfOwnership> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis declaration of ownership in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a matching cannabis declaration of ownership could not be found
	 */
	public static CannabisDeclarationOfOwnership findByUuid_First(
			String uuid,
			OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisDeclarationOfOwnershipException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first cannabis declaration of ownership in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	public static CannabisDeclarationOfOwnership fetchByUuid_First(
		String uuid,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last cannabis declaration of ownership in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a matching cannabis declaration of ownership could not be found
	 */
	public static CannabisDeclarationOfOwnership findByUuid_Last(
			String uuid,
			OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisDeclarationOfOwnershipException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last cannabis declaration of ownership in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	public static CannabisDeclarationOfOwnership fetchByUuid_Last(
		String uuid,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the cannabis declaration of ownerships before and after the current cannabis declaration of ownership in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisDecOfOwnershipId the primary key of the current cannabis declaration of ownership
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a cannabis declaration of ownership with the primary key could not be found
	 */
	public static CannabisDeclarationOfOwnership[] findByUuid_PrevAndNext(
			long cannabisDecOfOwnershipId, String uuid,
			OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisDeclarationOfOwnershipException {

		return getPersistence().findByUuid_PrevAndNext(
			cannabisDecOfOwnershipId, uuid, orderByComparator);
	}

	/**
	 * Removes all the cannabis declaration of ownerships where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of cannabis declaration of ownerships where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis declaration of ownerships
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the cannabis declaration of ownership where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisDeclarationOfOwnershipException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a matching cannabis declaration of ownership could not be found
	 */
	public static CannabisDeclarationOfOwnership findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisDeclarationOfOwnershipException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cannabis declaration of ownership where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	public static CannabisDeclarationOfOwnership fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cannabis declaration of ownership where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	public static CannabisDeclarationOfOwnership fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the cannabis declaration of ownership where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis declaration of ownership that was removed
	 */
	public static CannabisDeclarationOfOwnership removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisDeclarationOfOwnershipException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of cannabis declaration of ownerships where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis declaration of ownerships
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the cannabis declaration of ownerships where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis declaration of ownerships
	 */
	public static List<CannabisDeclarationOfOwnership> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the cannabis declaration of ownerships where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @return the range of matching cannabis declaration of ownerships
	 */
	public static List<CannabisDeclarationOfOwnership> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis declaration of ownerships where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis declaration of ownerships
	 */
	public static List<CannabisDeclarationOfOwnership> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis declaration of ownerships where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis declaration of ownerships
	 */
	public static List<CannabisDeclarationOfOwnership> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis declaration of ownership in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a matching cannabis declaration of ownership could not be found
	 */
	public static CannabisDeclarationOfOwnership findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisDeclarationOfOwnershipException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first cannabis declaration of ownership in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	public static CannabisDeclarationOfOwnership fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last cannabis declaration of ownership in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a matching cannabis declaration of ownership could not be found
	 */
	public static CannabisDeclarationOfOwnership findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisDeclarationOfOwnershipException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last cannabis declaration of ownership in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	public static CannabisDeclarationOfOwnership fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the cannabis declaration of ownerships before and after the current cannabis declaration of ownership in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cannabisDecOfOwnershipId the primary key of the current cannabis declaration of ownership
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a cannabis declaration of ownership with the primary key could not be found
	 */
	public static CannabisDeclarationOfOwnership[] findByUuid_C_PrevAndNext(
			long cannabisDecOfOwnershipId, String uuid, long companyId,
			OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisDeclarationOfOwnershipException {

		return getPersistence().findByUuid_C_PrevAndNext(
			cannabisDecOfOwnershipId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the cannabis declaration of ownerships where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of cannabis declaration of ownerships where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis declaration of ownerships
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the cannabis declaration of ownerships where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis declaration of ownerships
	 */
	public static List<CannabisDeclarationOfOwnership> findBygetCA_DO_CAI(
		long cannabisApplicationId) {

		return getPersistence().findBygetCA_DO_CAI(cannabisApplicationId);
	}

	/**
	 * Returns a range of all the cannabis declaration of ownerships where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @return the range of matching cannabis declaration of ownerships
	 */
	public static List<CannabisDeclarationOfOwnership> findBygetCA_DO_CAI(
		long cannabisApplicationId, int start, int end) {

		return getPersistence().findBygetCA_DO_CAI(
			cannabisApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis declaration of ownerships where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis declaration of ownerships
	 */
	public static List<CannabisDeclarationOfOwnership> findBygetCA_DO_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator) {

		return getPersistence().findBygetCA_DO_CAI(
			cannabisApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis declaration of ownerships where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis declaration of ownerships
	 */
	public static List<CannabisDeclarationOfOwnership> findBygetCA_DO_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCA_DO_CAI(
			cannabisApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first cannabis declaration of ownership in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a matching cannabis declaration of ownership could not be found
	 */
	public static CannabisDeclarationOfOwnership findBygetCA_DO_CAI_First(
			long cannabisApplicationId,
			OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisDeclarationOfOwnershipException {

		return getPersistence().findBygetCA_DO_CAI_First(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the first cannabis declaration of ownership in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	public static CannabisDeclarationOfOwnership fetchBygetCA_DO_CAI_First(
		long cannabisApplicationId,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator) {

		return getPersistence().fetchBygetCA_DO_CAI_First(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis declaration of ownership in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a matching cannabis declaration of ownership could not be found
	 */
	public static CannabisDeclarationOfOwnership findBygetCA_DO_CAI_Last(
			long cannabisApplicationId,
			OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisDeclarationOfOwnershipException {

		return getPersistence().findBygetCA_DO_CAI_Last(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis declaration of ownership in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	public static CannabisDeclarationOfOwnership fetchBygetCA_DO_CAI_Last(
		long cannabisApplicationId,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator) {

		return getPersistence().fetchBygetCA_DO_CAI_Last(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the cannabis declaration of ownerships before and after the current cannabis declaration of ownership in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisDecOfOwnershipId the primary key of the current cannabis declaration of ownership
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a cannabis declaration of ownership with the primary key could not be found
	 */
	public static CannabisDeclarationOfOwnership[]
			findBygetCA_DO_CAI_PrevAndNext(
				long cannabisDecOfOwnershipId, long cannabisApplicationId,
				OrderByComparator<CannabisDeclarationOfOwnership>
					orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisDeclarationOfOwnershipException {

		return getPersistence().findBygetCA_DO_CAI_PrevAndNext(
			cannabisDecOfOwnershipId, cannabisApplicationId, orderByComparator);
	}

	/**
	 * Removes all the cannabis declaration of ownerships where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public static void removeBygetCA_DO_CAI(long cannabisApplicationId) {
		getPersistence().removeBygetCA_DO_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the number of cannabis declaration of ownerships where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis declaration of ownerships
	 */
	public static int countBygetCA_DO_CAI(long cannabisApplicationId) {
		return getPersistence().countBygetCA_DO_CAI(cannabisApplicationId);
	}

	/**
	 * Caches the cannabis declaration of ownership in the entity cache if it is enabled.
	 *
	 * @param cannabisDeclarationOfOwnership the cannabis declaration of ownership
	 */
	public static void cacheResult(
		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership) {

		getPersistence().cacheResult(cannabisDeclarationOfOwnership);
	}

	/**
	 * Caches the cannabis declaration of ownerships in the entity cache if it is enabled.
	 *
	 * @param cannabisDeclarationOfOwnerships the cannabis declaration of ownerships
	 */
	public static void cacheResult(
		List<CannabisDeclarationOfOwnership> cannabisDeclarationOfOwnerships) {

		getPersistence().cacheResult(cannabisDeclarationOfOwnerships);
	}

	/**
	 * Creates a new cannabis declaration of ownership with the primary key. Does not add the cannabis declaration of ownership to the database.
	 *
	 * @param cannabisDecOfOwnershipId the primary key for the new cannabis declaration of ownership
	 * @return the new cannabis declaration of ownership
	 */
	public static CannabisDeclarationOfOwnership create(
		long cannabisDecOfOwnershipId) {

		return getPersistence().create(cannabisDecOfOwnershipId);
	}

	/**
	 * Removes the cannabis declaration of ownership with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisDecOfOwnershipId the primary key of the cannabis declaration of ownership
	 * @return the cannabis declaration of ownership that was removed
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a cannabis declaration of ownership with the primary key could not be found
	 */
	public static CannabisDeclarationOfOwnership remove(
			long cannabisDecOfOwnershipId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisDeclarationOfOwnershipException {

		return getPersistence().remove(cannabisDecOfOwnershipId);
	}

	public static CannabisDeclarationOfOwnership updateImpl(
		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership) {

		return getPersistence().updateImpl(cannabisDeclarationOfOwnership);
	}

	/**
	 * Returns the cannabis declaration of ownership with the primary key or throws a <code>NoSuchCannabisDeclarationOfOwnershipException</code> if it could not be found.
	 *
	 * @param cannabisDecOfOwnershipId the primary key of the cannabis declaration of ownership
	 * @return the cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a cannabis declaration of ownership with the primary key could not be found
	 */
	public static CannabisDeclarationOfOwnership findByPrimaryKey(
			long cannabisDecOfOwnershipId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisDeclarationOfOwnershipException {

		return getPersistence().findByPrimaryKey(cannabisDecOfOwnershipId);
	}

	/**
	 * Returns the cannabis declaration of ownership with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisDecOfOwnershipId the primary key of the cannabis declaration of ownership
	 * @return the cannabis declaration of ownership, or <code>null</code> if a cannabis declaration of ownership with the primary key could not be found
	 */
	public static CannabisDeclarationOfOwnership fetchByPrimaryKey(
		long cannabisDecOfOwnershipId) {

		return getPersistence().fetchByPrimaryKey(cannabisDecOfOwnershipId);
	}

	/**
	 * Returns all the cannabis declaration of ownerships.
	 *
	 * @return the cannabis declaration of ownerships
	 */
	public static List<CannabisDeclarationOfOwnership> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis declaration of ownerships.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @return the range of cannabis declaration of ownerships
	 */
	public static List<CannabisDeclarationOfOwnership> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis declaration of ownerships.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis declaration of ownerships
	 */
	public static List<CannabisDeclarationOfOwnership> findAll(
		int start, int end,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis declaration of ownerships.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis declaration of ownerships
	 */
	public static List<CannabisDeclarationOfOwnership> findAll(
		int start, int end,
		OrderByComparator<CannabisDeclarationOfOwnership> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis declaration of ownerships from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis declaration of ownerships.
	 *
	 * @return the number of cannabis declaration of ownerships
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisDeclarationOfOwnershipPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CannabisDeclarationOfOwnershipPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CannabisDeclarationOfOwnershipPersistence
		_persistence;

}