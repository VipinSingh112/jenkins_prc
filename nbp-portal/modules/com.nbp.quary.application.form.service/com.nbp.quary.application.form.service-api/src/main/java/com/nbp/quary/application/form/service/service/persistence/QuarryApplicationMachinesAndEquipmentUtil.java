/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quary.application.form.service.model.QuarryApplicationMachinesAndEquipment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the quarry application machines and equipment service. This utility wraps <code>com.nbp.quary.application.form.service.service.persistence.impl.QuarryApplicationMachinesAndEquipmentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationMachinesAndEquipmentPersistence
 * @generated
 */
public class QuarryApplicationMachinesAndEquipmentUtil {

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
		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment) {

		getPersistence().clearCache(quarryApplicationMachinesAndEquipment);
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
	public static Map<Serializable, QuarryApplicationMachinesAndEquipment>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QuarryApplicationMachinesAndEquipment>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QuarryApplicationMachinesAndEquipment>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QuarryApplicationMachinesAndEquipment>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static QuarryApplicationMachinesAndEquipment update(
		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment) {

		return getPersistence().update(quarryApplicationMachinesAndEquipment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static QuarryApplicationMachinesAndEquipment update(
		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment,
		ServiceContext serviceContext) {

		return getPersistence().update(
			quarryApplicationMachinesAndEquipment, serviceContext);
	}

	/**
	 * Returns all the quarry application machines and equipments where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching quarry application machines and equipments
	 */
	public static List<QuarryApplicationMachinesAndEquipment> findByUuid(
		String uuid) {

		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the quarry application machines and equipments where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @return the range of matching quarry application machines and equipments
	 */
	public static List<QuarryApplicationMachinesAndEquipment> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry application machines and equipments where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry application machines and equipments
	 */
	public static List<QuarryApplicationMachinesAndEquipment> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry application machines and equipments where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry application machines and equipments
	 */
	public static List<QuarryApplicationMachinesAndEquipment> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment findByUuid_First(
			String uuid,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationMachinesAndEquipmentException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment fetchByUuid_First(
		String uuid,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment findByUuid_Last(
			String uuid,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationMachinesAndEquipmentException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment fetchByUuid_Last(
		String uuid,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the quarry application machines and equipments before and after the current quarry application machines and equipment in the ordered set where uuid = &#63;.
	 *
	 * @param quarryApplicationMachinId the primary key of the current quarry application machines and equipment
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a quarry application machines and equipment with the primary key could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment[]
			findByUuid_PrevAndNext(
				long quarryApplicationMachinId, String uuid,
				OrderByComparator<QuarryApplicationMachinesAndEquipment>
					orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationMachinesAndEquipmentException {

		return getPersistence().findByUuid_PrevAndNext(
			quarryApplicationMachinId, uuid, orderByComparator);
	}

	/**
	 * Removes all the quarry application machines and equipments where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of quarry application machines and equipments where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching quarry application machines and equipments
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the quarry application machines and equipment where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchQuarryApplicationMachinesAndEquipmentException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationMachinesAndEquipmentException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the quarry application machines and equipment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the quarry application machines and equipment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the quarry application machines and equipment where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the quarry application machines and equipment that was removed
	 */
	public static QuarryApplicationMachinesAndEquipment removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationMachinesAndEquipmentException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of quarry application machines and equipments where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching quarry application machines and equipments
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the quarry application machines and equipments where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching quarry application machines and equipments
	 */
	public static List<QuarryApplicationMachinesAndEquipment> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the quarry application machines and equipments where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @return the range of matching quarry application machines and equipments
	 */
	public static List<QuarryApplicationMachinesAndEquipment> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry application machines and equipments where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry application machines and equipments
	 */
	public static List<QuarryApplicationMachinesAndEquipment> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry application machines and equipments where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry application machines and equipments
	 */
	public static List<QuarryApplicationMachinesAndEquipment> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationMachinesAndEquipmentException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationMachinesAndEquipmentException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the quarry application machines and equipments before and after the current quarry application machines and equipment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param quarryApplicationMachinId the primary key of the current quarry application machines and equipment
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a quarry application machines and equipment with the primary key could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment[]
			findByUuid_C_PrevAndNext(
				long quarryApplicationMachinId, String uuid, long companyId,
				OrderByComparator<QuarryApplicationMachinesAndEquipment>
					orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationMachinesAndEquipmentException {

		return getPersistence().findByUuid_C_PrevAndNext(
			quarryApplicationMachinId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the quarry application machines and equipments where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of quarry application machines and equipments where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching quarry application machines and equipments
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the quarry application machines and equipments where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry application machines and equipments
	 */
	public static List<QuarryApplicationMachinesAndEquipment>
		findBygetQuarryById(String quarryApplicationId) {

		return getPersistence().findBygetQuarryById(quarryApplicationId);
	}

	/**
	 * Returns a range of all the quarry application machines and equipments where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @return the range of matching quarry application machines and equipments
	 */
	public static List<QuarryApplicationMachinesAndEquipment>
		findBygetQuarryById(String quarryApplicationId, int start, int end) {

		return getPersistence().findBygetQuarryById(
			quarryApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry application machines and equipments where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry application machines and equipments
	 */
	public static List<QuarryApplicationMachinesAndEquipment>
		findBygetQuarryById(
			String quarryApplicationId, int start, int end,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator) {

		return getPersistence().findBygetQuarryById(
			quarryApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry application machines and equipments where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry application machines and equipments
	 */
	public static List<QuarryApplicationMachinesAndEquipment>
		findBygetQuarryById(
			String quarryApplicationId, int start, int end,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetQuarryById(
			quarryApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment
			findBygetQuarryById_First(
				String quarryApplicationId,
				OrderByComparator<QuarryApplicationMachinesAndEquipment>
					orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationMachinesAndEquipmentException {

		return getPersistence().findBygetQuarryById_First(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment
		fetchBygetQuarryById_First(
			String quarryApplicationId,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator) {

		return getPersistence().fetchBygetQuarryById_First(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment
			findBygetQuarryById_Last(
				String quarryApplicationId,
				OrderByComparator<QuarryApplicationMachinesAndEquipment>
					orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationMachinesAndEquipmentException {

		return getPersistence().findBygetQuarryById_Last(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment
		fetchBygetQuarryById_Last(
			String quarryApplicationId,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator) {

		return getPersistence().fetchBygetQuarryById_Last(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the quarry application machines and equipments before and after the current quarry application machines and equipment in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationMachinId the primary key of the current quarry application machines and equipment
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a quarry application machines and equipment with the primary key could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment[]
			findBygetQuarryById_PrevAndNext(
				long quarryApplicationMachinId, String quarryApplicationId,
				OrderByComparator<QuarryApplicationMachinesAndEquipment>
					orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationMachinesAndEquipmentException {

		return getPersistence().findBygetQuarryById_PrevAndNext(
			quarryApplicationMachinId, quarryApplicationId, orderByComparator);
	}

	/**
	 * Removes all the quarry application machines and equipments where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 */
	public static void removeBygetQuarryById(String quarryApplicationId) {
		getPersistence().removeBygetQuarryById(quarryApplicationId);
	}

	/**
	 * Returns the number of quarry application machines and equipments where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry application machines and equipments
	 */
	public static int countBygetQuarryById(String quarryApplicationId) {
		return getPersistence().countBygetQuarryById(quarryApplicationId);
	}

	/**
	 * Returns all the quarry application machines and equipments where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @return the matching quarry application machines and equipments
	 */
	public static List<QuarryApplicationMachinesAndEquipment>
		findBygetQuarryMAchineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName) {

		return getPersistence().
			findBygetQuarryMAchineEquipment_By_MachineName_AppId(
				quarryApplicationId, manchineName);
	}

	/**
	 * Returns a range of all the quarry application machines and equipments where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @return the range of matching quarry application machines and equipments
	 */
	public static List<QuarryApplicationMachinesAndEquipment>
		findBygetQuarryMAchineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName, int start,
			int end) {

		return getPersistence().
			findBygetQuarryMAchineEquipment_By_MachineName_AppId(
				quarryApplicationId, manchineName, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry application machines and equipments where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry application machines and equipments
	 */
	public static List<QuarryApplicationMachinesAndEquipment>
		findBygetQuarryMAchineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName, int start, int end,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator) {

		return getPersistence().
			findBygetQuarryMAchineEquipment_By_MachineName_AppId(
				quarryApplicationId, manchineName, start, end,
				orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry application machines and equipments where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry application machines and equipments
	 */
	public static List<QuarryApplicationMachinesAndEquipment>
		findBygetQuarryMAchineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName, int start, int end,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().
			findBygetQuarryMAchineEquipment_By_MachineName_AppId(
				quarryApplicationId, manchineName, start, end,
				orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment
			findBygetQuarryMAchineEquipment_By_MachineName_AppId_First(
				String quarryApplicationId, String manchineName,
				OrderByComparator<QuarryApplicationMachinesAndEquipment>
					orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationMachinesAndEquipmentException {

		return getPersistence().
			findBygetQuarryMAchineEquipment_By_MachineName_AppId_First(
				quarryApplicationId, manchineName, orderByComparator);
	}

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment
		fetchBygetQuarryMAchineEquipment_By_MachineName_AppId_First(
			String quarryApplicationId, String manchineName,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator) {

		return getPersistence().
			fetchBygetQuarryMAchineEquipment_By_MachineName_AppId_First(
				quarryApplicationId, manchineName, orderByComparator);
	}

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment
			findBygetQuarryMAchineEquipment_By_MachineName_AppId_Last(
				String quarryApplicationId, String manchineName,
				OrderByComparator<QuarryApplicationMachinesAndEquipment>
					orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationMachinesAndEquipmentException {

		return getPersistence().
			findBygetQuarryMAchineEquipment_By_MachineName_AppId_Last(
				quarryApplicationId, manchineName, orderByComparator);
	}

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment
		fetchBygetQuarryMAchineEquipment_By_MachineName_AppId_Last(
			String quarryApplicationId, String manchineName,
			OrderByComparator<QuarryApplicationMachinesAndEquipment>
				orderByComparator) {

		return getPersistence().
			fetchBygetQuarryMAchineEquipment_By_MachineName_AppId_Last(
				quarryApplicationId, manchineName, orderByComparator);
	}

	/**
	 * Returns the quarry application machines and equipments before and after the current quarry application machines and equipment in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationMachinId the primary key of the current quarry application machines and equipment
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a quarry application machines and equipment with the primary key could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment[]
			findBygetQuarryMAchineEquipment_By_MachineName_AppId_PrevAndNext(
				long quarryApplicationMachinId, String quarryApplicationId,
				String manchineName,
				OrderByComparator<QuarryApplicationMachinesAndEquipment>
					orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationMachinesAndEquipmentException {

		return getPersistence().
			findBygetQuarryMAchineEquipment_By_MachineName_AppId_PrevAndNext(
				quarryApplicationMachinId, quarryApplicationId, manchineName,
				orderByComparator);
	}

	/**
	 * Removes all the quarry application machines and equipments where quarryApplicationId = &#63; and manchineName = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 */
	public static void removeBygetQuarryMAchineEquipment_By_MachineName_AppId(
		String quarryApplicationId, String manchineName) {

		getPersistence().removeBygetQuarryMAchineEquipment_By_MachineName_AppId(
			quarryApplicationId, manchineName);
	}

	/**
	 * Returns the number of quarry application machines and equipments where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @return the number of matching quarry application machines and equipments
	 */
	public static int countBygetQuarryMAchineEquipment_By_MachineName_AppId(
		String quarryApplicationId, String manchineName) {

		return getPersistence().
			countBygetQuarryMAchineEquipment_By_MachineName_AppId(
				quarryApplicationId, manchineName);
	}

	/**
	 * Caches the quarry application machines and equipment in the entity cache if it is enabled.
	 *
	 * @param quarryApplicationMachinesAndEquipment the quarry application machines and equipment
	 */
	public static void cacheResult(
		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment) {

		getPersistence().cacheResult(quarryApplicationMachinesAndEquipment);
	}

	/**
	 * Caches the quarry application machines and equipments in the entity cache if it is enabled.
	 *
	 * @param quarryApplicationMachinesAndEquipments the quarry application machines and equipments
	 */
	public static void cacheResult(
		List<QuarryApplicationMachinesAndEquipment>
			quarryApplicationMachinesAndEquipments) {

		getPersistence().cacheResult(quarryApplicationMachinesAndEquipments);
	}

	/**
	 * Creates a new quarry application machines and equipment with the primary key. Does not add the quarry application machines and equipment to the database.
	 *
	 * @param quarryApplicationMachinId the primary key for the new quarry application machines and equipment
	 * @return the new quarry application machines and equipment
	 */
	public static QuarryApplicationMachinesAndEquipment create(
		long quarryApplicationMachinId) {

		return getPersistence().create(quarryApplicationMachinId);
	}

	/**
	 * Removes the quarry application machines and equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quarryApplicationMachinId the primary key of the quarry application machines and equipment
	 * @return the quarry application machines and equipment that was removed
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a quarry application machines and equipment with the primary key could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment remove(
			long quarryApplicationMachinId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationMachinesAndEquipmentException {

		return getPersistence().remove(quarryApplicationMachinId);
	}

	public static QuarryApplicationMachinesAndEquipment updateImpl(
		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment) {

		return getPersistence().updateImpl(
			quarryApplicationMachinesAndEquipment);
	}

	/**
	 * Returns the quarry application machines and equipment with the primary key or throws a <code>NoSuchQuarryApplicationMachinesAndEquipmentException</code> if it could not be found.
	 *
	 * @param quarryApplicationMachinId the primary key of the quarry application machines and equipment
	 * @return the quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a quarry application machines and equipment with the primary key could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment findByPrimaryKey(
			long quarryApplicationMachinId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationMachinesAndEquipmentException {

		return getPersistence().findByPrimaryKey(quarryApplicationMachinId);
	}

	/**
	 * Returns the quarry application machines and equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quarryApplicationMachinId the primary key of the quarry application machines and equipment
	 * @return the quarry application machines and equipment, or <code>null</code> if a quarry application machines and equipment with the primary key could not be found
	 */
	public static QuarryApplicationMachinesAndEquipment fetchByPrimaryKey(
		long quarryApplicationMachinId) {

		return getPersistence().fetchByPrimaryKey(quarryApplicationMachinId);
	}

	/**
	 * Returns all the quarry application machines and equipments.
	 *
	 * @return the quarry application machines and equipments
	 */
	public static List<QuarryApplicationMachinesAndEquipment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the quarry application machines and equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @return the range of quarry application machines and equipments
	 */
	public static List<QuarryApplicationMachinesAndEquipment> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the quarry application machines and equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry application machines and equipments
	 */
	public static List<QuarryApplicationMachinesAndEquipment> findAll(
		int start, int end,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry application machines and equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationMachinesAndEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application machines and equipments
	 * @param end the upper bound of the range of quarry application machines and equipments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry application machines and equipments
	 */
	public static List<QuarryApplicationMachinesAndEquipment> findAll(
		int start, int end,
		OrderByComparator<QuarryApplicationMachinesAndEquipment>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the quarry application machines and equipments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of quarry application machines and equipments.
	 *
	 * @return the number of quarry application machines and equipments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QuarryApplicationMachinesAndEquipmentPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		QuarryApplicationMachinesAndEquipmentPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile QuarryApplicationMachinesAndEquipmentPersistence
		_persistence;

}