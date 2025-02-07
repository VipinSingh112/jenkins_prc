/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.GeneralDelarations;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the general delarations service. This utility wraps <code>com.nbp.cannabis.application.form.services.service.persistence.impl.GeneralDelarationsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GeneralDelarationsPersistence
 * @generated
 */
public class GeneralDelarationsUtil {

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
	public static void clearCache(GeneralDelarations generalDelarations) {
		getPersistence().clearCache(generalDelarations);
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
	public static Map<Serializable, GeneralDelarations> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<GeneralDelarations> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<GeneralDelarations> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<GeneralDelarations> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<GeneralDelarations> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static GeneralDelarations update(
		GeneralDelarations generalDelarations) {

		return getPersistence().update(generalDelarations);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static GeneralDelarations update(
		GeneralDelarations generalDelarations, ServiceContext serviceContext) {

		return getPersistence().update(generalDelarations, serviceContext);
	}

	/**
	 * Returns all the general delarationses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching general delarationses
	 */
	public static List<GeneralDelarations> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the general delarationses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @return the range of matching general delarationses
	 */
	public static List<GeneralDelarations> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the general delarationses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching general delarationses
	 */
	public static List<GeneralDelarations> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<GeneralDelarations> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the general delarationses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching general delarationses
	 */
	public static List<GeneralDelarations> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<GeneralDelarations> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first general delarations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching general delarations
	 * @throws NoSuchGeneralDelarationsException if a matching general delarations could not be found
	 */
	public static GeneralDelarations findByUuid_First(
			String uuid,
			OrderByComparator<GeneralDelarations> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchGeneralDelarationsException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first general delarations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	public static GeneralDelarations fetchByUuid_First(
		String uuid, OrderByComparator<GeneralDelarations> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last general delarations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching general delarations
	 * @throws NoSuchGeneralDelarationsException if a matching general delarations could not be found
	 */
	public static GeneralDelarations findByUuid_Last(
			String uuid,
			OrderByComparator<GeneralDelarations> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchGeneralDelarationsException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last general delarations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	public static GeneralDelarations fetchByUuid_Last(
		String uuid, OrderByComparator<GeneralDelarations> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the general delarationses before and after the current general delarations in the ordered set where uuid = &#63;.
	 *
	 * @param generalDeclarationId the primary key of the current general delarations
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next general delarations
	 * @throws NoSuchGeneralDelarationsException if a general delarations with the primary key could not be found
	 */
	public static GeneralDelarations[] findByUuid_PrevAndNext(
			long generalDeclarationId, String uuid,
			OrderByComparator<GeneralDelarations> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchGeneralDelarationsException {

		return getPersistence().findByUuid_PrevAndNext(
			generalDeclarationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the general delarationses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of general delarationses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching general delarationses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the general delarations where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchGeneralDelarationsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching general delarations
	 * @throws NoSuchGeneralDelarationsException if a matching general delarations could not be found
	 */
	public static GeneralDelarations findByUUID_G(String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchGeneralDelarationsException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the general delarations where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	public static GeneralDelarations fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the general delarations where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	public static GeneralDelarations fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the general delarations where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the general delarations that was removed
	 */
	public static GeneralDelarations removeByUUID_G(String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchGeneralDelarationsException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of general delarationses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching general delarationses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the general delarationses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching general delarationses
	 */
	public static List<GeneralDelarations> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the general delarationses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @return the range of matching general delarationses
	 */
	public static List<GeneralDelarations> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the general delarationses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching general delarationses
	 */
	public static List<GeneralDelarations> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<GeneralDelarations> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the general delarationses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching general delarationses
	 */
	public static List<GeneralDelarations> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<GeneralDelarations> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first general delarations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching general delarations
	 * @throws NoSuchGeneralDelarationsException if a matching general delarations could not be found
	 */
	public static GeneralDelarations findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<GeneralDelarations> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchGeneralDelarationsException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first general delarations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	public static GeneralDelarations fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<GeneralDelarations> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last general delarations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching general delarations
	 * @throws NoSuchGeneralDelarationsException if a matching general delarations could not be found
	 */
	public static GeneralDelarations findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<GeneralDelarations> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchGeneralDelarationsException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last general delarations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	public static GeneralDelarations fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<GeneralDelarations> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the general delarationses before and after the current general delarations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param generalDeclarationId the primary key of the current general delarations
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next general delarations
	 * @throws NoSuchGeneralDelarationsException if a general delarations with the primary key could not be found
	 */
	public static GeneralDelarations[] findByUuid_C_PrevAndNext(
			long generalDeclarationId, String uuid, long companyId,
			OrderByComparator<GeneralDelarations> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchGeneralDelarationsException {

		return getPersistence().findByUuid_C_PrevAndNext(
			generalDeclarationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the general delarationses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of general delarationses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching general delarationses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the general delarationses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching general delarationses
	 */
	public static List<GeneralDelarations> findBygetCA_GD_CAI(
		long cannabisApplicationId) {

		return getPersistence().findBygetCA_GD_CAI(cannabisApplicationId);
	}

	/**
	 * Returns a range of all the general delarationses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @return the range of matching general delarationses
	 */
	public static List<GeneralDelarations> findBygetCA_GD_CAI(
		long cannabisApplicationId, int start, int end) {

		return getPersistence().findBygetCA_GD_CAI(
			cannabisApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the general delarationses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching general delarationses
	 */
	public static List<GeneralDelarations> findBygetCA_GD_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<GeneralDelarations> orderByComparator) {

		return getPersistence().findBygetCA_GD_CAI(
			cannabisApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the general delarationses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching general delarationses
	 */
	public static List<GeneralDelarations> findBygetCA_GD_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<GeneralDelarations> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCA_GD_CAI(
			cannabisApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first general delarations in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching general delarations
	 * @throws NoSuchGeneralDelarationsException if a matching general delarations could not be found
	 */
	public static GeneralDelarations findBygetCA_GD_CAI_First(
			long cannabisApplicationId,
			OrderByComparator<GeneralDelarations> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchGeneralDelarationsException {

		return getPersistence().findBygetCA_GD_CAI_First(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the first general delarations in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	public static GeneralDelarations fetchBygetCA_GD_CAI_First(
		long cannabisApplicationId,
		OrderByComparator<GeneralDelarations> orderByComparator) {

		return getPersistence().fetchBygetCA_GD_CAI_First(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last general delarations in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching general delarations
	 * @throws NoSuchGeneralDelarationsException if a matching general delarations could not be found
	 */
	public static GeneralDelarations findBygetCA_GD_CAI_Last(
			long cannabisApplicationId,
			OrderByComparator<GeneralDelarations> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchGeneralDelarationsException {

		return getPersistence().findBygetCA_GD_CAI_Last(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last general delarations in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	public static GeneralDelarations fetchBygetCA_GD_CAI_Last(
		long cannabisApplicationId,
		OrderByComparator<GeneralDelarations> orderByComparator) {

		return getPersistence().fetchBygetCA_GD_CAI_Last(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the general delarationses before and after the current general delarations in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param generalDeclarationId the primary key of the current general delarations
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next general delarations
	 * @throws NoSuchGeneralDelarationsException if a general delarations with the primary key could not be found
	 */
	public static GeneralDelarations[] findBygetCA_GD_CAI_PrevAndNext(
			long generalDeclarationId, long cannabisApplicationId,
			OrderByComparator<GeneralDelarations> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchGeneralDelarationsException {

		return getPersistence().findBygetCA_GD_CAI_PrevAndNext(
			generalDeclarationId, cannabisApplicationId, orderByComparator);
	}

	/**
	 * Removes all the general delarationses where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public static void removeBygetCA_GD_CAI(long cannabisApplicationId) {
		getPersistence().removeBygetCA_GD_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the number of general delarationses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching general delarationses
	 */
	public static int countBygetCA_GD_CAI(long cannabisApplicationId) {
		return getPersistence().countBygetCA_GD_CAI(cannabisApplicationId);
	}

	/**
	 * Caches the general delarations in the entity cache if it is enabled.
	 *
	 * @param generalDelarations the general delarations
	 */
	public static void cacheResult(GeneralDelarations generalDelarations) {
		getPersistence().cacheResult(generalDelarations);
	}

	/**
	 * Caches the general delarationses in the entity cache if it is enabled.
	 *
	 * @param generalDelarationses the general delarationses
	 */
	public static void cacheResult(
		List<GeneralDelarations> generalDelarationses) {

		getPersistence().cacheResult(generalDelarationses);
	}

	/**
	 * Creates a new general delarations with the primary key. Does not add the general delarations to the database.
	 *
	 * @param generalDeclarationId the primary key for the new general delarations
	 * @return the new general delarations
	 */
	public static GeneralDelarations create(long generalDeclarationId) {
		return getPersistence().create(generalDeclarationId);
	}

	/**
	 * Removes the general delarations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param generalDeclarationId the primary key of the general delarations
	 * @return the general delarations that was removed
	 * @throws NoSuchGeneralDelarationsException if a general delarations with the primary key could not be found
	 */
	public static GeneralDelarations remove(long generalDeclarationId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchGeneralDelarationsException {

		return getPersistence().remove(generalDeclarationId);
	}

	public static GeneralDelarations updateImpl(
		GeneralDelarations generalDelarations) {

		return getPersistence().updateImpl(generalDelarations);
	}

	/**
	 * Returns the general delarations with the primary key or throws a <code>NoSuchGeneralDelarationsException</code> if it could not be found.
	 *
	 * @param generalDeclarationId the primary key of the general delarations
	 * @return the general delarations
	 * @throws NoSuchGeneralDelarationsException if a general delarations with the primary key could not be found
	 */
	public static GeneralDelarations findByPrimaryKey(long generalDeclarationId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchGeneralDelarationsException {

		return getPersistence().findByPrimaryKey(generalDeclarationId);
	}

	/**
	 * Returns the general delarations with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param generalDeclarationId the primary key of the general delarations
	 * @return the general delarations, or <code>null</code> if a general delarations with the primary key could not be found
	 */
	public static GeneralDelarations fetchByPrimaryKey(
		long generalDeclarationId) {

		return getPersistence().fetchByPrimaryKey(generalDeclarationId);
	}

	/**
	 * Returns all the general delarationses.
	 *
	 * @return the general delarationses
	 */
	public static List<GeneralDelarations> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the general delarationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @return the range of general delarationses
	 */
	public static List<GeneralDelarations> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the general delarationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of general delarationses
	 */
	public static List<GeneralDelarations> findAll(
		int start, int end,
		OrderByComparator<GeneralDelarations> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the general delarationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of general delarationses
	 */
	public static List<GeneralDelarations> findAll(
		int start, int end,
		OrderByComparator<GeneralDelarations> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the general delarationses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of general delarationses.
	 *
	 * @return the number of general delarationses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static GeneralDelarationsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		GeneralDelarationsPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile GeneralDelarationsPersistence _persistence;

}