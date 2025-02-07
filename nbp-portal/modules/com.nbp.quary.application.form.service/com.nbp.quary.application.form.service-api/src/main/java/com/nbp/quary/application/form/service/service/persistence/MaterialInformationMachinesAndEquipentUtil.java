/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.quary.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quary.application.form.service.model.MaterialInformationMachinesAndEquipent;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the material information machines and equipent service. This utility wraps <code>com.nbp.quary.application.form.service.service.persistence.impl.MaterialInformationMachinesAndEquipentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MaterialInformationMachinesAndEquipentPersistence
 * @generated
 */
public class MaterialInformationMachinesAndEquipentUtil {

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
		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent) {

		getPersistence().clearCache(materialInformationMachinesAndEquipent);
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
	public static Map<Serializable, MaterialInformationMachinesAndEquipent>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MaterialInformationMachinesAndEquipent>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MaterialInformationMachinesAndEquipent>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MaterialInformationMachinesAndEquipent>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MaterialInformationMachinesAndEquipent update(
		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent) {

		return getPersistence().update(materialInformationMachinesAndEquipent);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MaterialInformationMachinesAndEquipent update(
		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent,
		ServiceContext serviceContext) {

		return getPersistence().update(
			materialInformationMachinesAndEquipent, serviceContext);
	}

	/**
	 * Returns all the material information machines and equipents where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching material information machines and equipents
	 */
	public static List<MaterialInformationMachinesAndEquipent> findByUuid(
		String uuid) {

		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the material information machines and equipents where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @return the range of matching material information machines and equipents
	 */
	public static List<MaterialInformationMachinesAndEquipent> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the material information machines and equipents where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching material information machines and equipents
	 */
	public static List<MaterialInformationMachinesAndEquipent> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the material information machines and equipents where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching material information machines and equipents
	 */
	public static List<MaterialInformationMachinesAndEquipent> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first material information machines and equipent in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	public static MaterialInformationMachinesAndEquipent findByUuid_First(
			String uuid,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchMaterialInformationMachinesAndEquipentException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first material information machines and equipent in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	public static MaterialInformationMachinesAndEquipent fetchByUuid_First(
		String uuid,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last material information machines and equipent in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	public static MaterialInformationMachinesAndEquipent findByUuid_Last(
			String uuid,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchMaterialInformationMachinesAndEquipentException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last material information machines and equipent in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	public static MaterialInformationMachinesAndEquipent fetchByUuid_Last(
		String uuid,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the material information machines and equipents before and after the current material information machines and equipent in the ordered set where uuid = &#63;.
	 *
	 * @param miMachineId the primary key of the current material information machines and equipent
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a material information machines and equipent with the primary key could not be found
	 */
	public static MaterialInformationMachinesAndEquipent[]
			findByUuid_PrevAndNext(
				long miMachineId, String uuid,
				OrderByComparator<MaterialInformationMachinesAndEquipent>
					orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchMaterialInformationMachinesAndEquipentException {

		return getPersistence().findByUuid_PrevAndNext(
			miMachineId, uuid, orderByComparator);
	}

	/**
	 * Removes all the material information machines and equipents where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of material information machines and equipents where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching material information machines and equipents
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the material information machines and equipent where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMaterialInformationMachinesAndEquipentException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	public static MaterialInformationMachinesAndEquipent findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchMaterialInformationMachinesAndEquipentException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the material information machines and equipent where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	public static MaterialInformationMachinesAndEquipent fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the material information machines and equipent where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	public static MaterialInformationMachinesAndEquipent fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the material information machines and equipent where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the material information machines and equipent that was removed
	 */
	public static MaterialInformationMachinesAndEquipent removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchMaterialInformationMachinesAndEquipentException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of material information machines and equipents where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching material information machines and equipents
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the material information machines and equipents where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching material information machines and equipents
	 */
	public static List<MaterialInformationMachinesAndEquipent> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the material information machines and equipents where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @return the range of matching material information machines and equipents
	 */
	public static List<MaterialInformationMachinesAndEquipent> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the material information machines and equipents where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching material information machines and equipents
	 */
	public static List<MaterialInformationMachinesAndEquipent> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the material information machines and equipents where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching material information machines and equipents
	 */
	public static List<MaterialInformationMachinesAndEquipent> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first material information machines and equipent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	public static MaterialInformationMachinesAndEquipent findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchMaterialInformationMachinesAndEquipentException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first material information machines and equipent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	public static MaterialInformationMachinesAndEquipent fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last material information machines and equipent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	public static MaterialInformationMachinesAndEquipent findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchMaterialInformationMachinesAndEquipentException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last material information machines and equipent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	public static MaterialInformationMachinesAndEquipent fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the material information machines and equipents before and after the current material information machines and equipent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param miMachineId the primary key of the current material information machines and equipent
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a material information machines and equipent with the primary key could not be found
	 */
	public static MaterialInformationMachinesAndEquipent[]
			findByUuid_C_PrevAndNext(
				long miMachineId, String uuid, long companyId,
				OrderByComparator<MaterialInformationMachinesAndEquipent>
					orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchMaterialInformationMachinesAndEquipentException {

		return getPersistence().findByUuid_C_PrevAndNext(
			miMachineId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the material information machines and equipents where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of material information machines and equipents where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching material information machines and equipents
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the material information machines and equipents where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching material information machines and equipents
	 */
	public static List<MaterialInformationMachinesAndEquipent>
		findBygetQuarryById(String quarryApplicationId) {

		return getPersistence().findBygetQuarryById(quarryApplicationId);
	}

	/**
	 * Returns a range of all the material information machines and equipents where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @return the range of matching material information machines and equipents
	 */
	public static List<MaterialInformationMachinesAndEquipent>
		findBygetQuarryById(String quarryApplicationId, int start, int end) {

		return getPersistence().findBygetQuarryById(
			quarryApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the material information machines and equipents where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching material information machines and equipents
	 */
	public static List<MaterialInformationMachinesAndEquipent>
		findBygetQuarryById(
			String quarryApplicationId, int start, int end,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator) {

		return getPersistence().findBygetQuarryById(
			quarryApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the material information machines and equipents where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching material information machines and equipents
	 */
	public static List<MaterialInformationMachinesAndEquipent>
		findBygetQuarryById(
			String quarryApplicationId, int start, int end,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetQuarryById(
			quarryApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first material information machines and equipent in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	public static MaterialInformationMachinesAndEquipent
			findBygetQuarryById_First(
				String quarryApplicationId,
				OrderByComparator<MaterialInformationMachinesAndEquipent>
					orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchMaterialInformationMachinesAndEquipentException {

		return getPersistence().findBygetQuarryById_First(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the first material information machines and equipent in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	public static MaterialInformationMachinesAndEquipent
		fetchBygetQuarryById_First(
			String quarryApplicationId,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator) {

		return getPersistence().fetchBygetQuarryById_First(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the last material information machines and equipent in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	public static MaterialInformationMachinesAndEquipent
			findBygetQuarryById_Last(
				String quarryApplicationId,
				OrderByComparator<MaterialInformationMachinesAndEquipent>
					orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchMaterialInformationMachinesAndEquipentException {

		return getPersistence().findBygetQuarryById_Last(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the last material information machines and equipent in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	public static MaterialInformationMachinesAndEquipent
		fetchBygetQuarryById_Last(
			String quarryApplicationId,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator) {

		return getPersistence().fetchBygetQuarryById_Last(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the material information machines and equipents before and after the current material information machines and equipent in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param miMachineId the primary key of the current material information machines and equipent
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a material information machines and equipent with the primary key could not be found
	 */
	public static MaterialInformationMachinesAndEquipent[]
			findBygetQuarryById_PrevAndNext(
				long miMachineId, String quarryApplicationId,
				OrderByComparator<MaterialInformationMachinesAndEquipent>
					orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchMaterialInformationMachinesAndEquipentException {

		return getPersistence().findBygetQuarryById_PrevAndNext(
			miMachineId, quarryApplicationId, orderByComparator);
	}

	/**
	 * Removes all the material information machines and equipents where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 */
	public static void removeBygetQuarryById(String quarryApplicationId) {
		getPersistence().removeBygetQuarryById(quarryApplicationId);
	}

	/**
	 * Returns the number of material information machines and equipents where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching material information machines and equipents
	 */
	public static int countBygetQuarryById(String quarryApplicationId) {
		return getPersistence().countBygetQuarryById(quarryApplicationId);
	}

	/**
	 * Returns all the material information machines and equipents where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @return the matching material information machines and equipents
	 */
	public static List<MaterialInformationMachinesAndEquipent>
		findBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName) {

		return getPersistence().
			findBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
				quarryApplicationId, manchineName);
	}

	/**
	 * Returns a range of all the material information machines and equipents where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @return the range of matching material information machines and equipents
	 */
	public static List<MaterialInformationMachinesAndEquipent>
		findBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName, int start,
			int end) {

		return getPersistence().
			findBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
				quarryApplicationId, manchineName, start, end);
	}

	/**
	 * Returns an ordered range of all the material information machines and equipents where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching material information machines and equipents
	 */
	public static List<MaterialInformationMachinesAndEquipent>
		findBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName, int start, int end,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator) {

		return getPersistence().
			findBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
				quarryApplicationId, manchineName, start, end,
				orderByComparator);
	}

	/**
	 * Returns an ordered range of all the material information machines and equipents where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching material information machines and equipents
	 */
	public static List<MaterialInformationMachinesAndEquipent>
		findBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName, int start, int end,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().
			findBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
				quarryApplicationId, manchineName, start, end,
				orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first material information machines and equipent in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	public static MaterialInformationMachinesAndEquipent
			findBygetMaterialInfoMachineEquipment_By_MachineName_AppId_First(
				String quarryApplicationId, String manchineName,
				OrderByComparator<MaterialInformationMachinesAndEquipent>
					orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchMaterialInformationMachinesAndEquipentException {

		return getPersistence().
			findBygetMaterialInfoMachineEquipment_By_MachineName_AppId_First(
				quarryApplicationId, manchineName, orderByComparator);
	}

	/**
	 * Returns the first material information machines and equipent in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	public static MaterialInformationMachinesAndEquipent
		fetchBygetMaterialInfoMachineEquipment_By_MachineName_AppId_First(
			String quarryApplicationId, String manchineName,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator) {

		return getPersistence().
			fetchBygetMaterialInfoMachineEquipment_By_MachineName_AppId_First(
				quarryApplicationId, manchineName, orderByComparator);
	}

	/**
	 * Returns the last material information machines and equipent in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	public static MaterialInformationMachinesAndEquipent
			findBygetMaterialInfoMachineEquipment_By_MachineName_AppId_Last(
				String quarryApplicationId, String manchineName,
				OrderByComparator<MaterialInformationMachinesAndEquipent>
					orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchMaterialInformationMachinesAndEquipentException {

		return getPersistence().
			findBygetMaterialInfoMachineEquipment_By_MachineName_AppId_Last(
				quarryApplicationId, manchineName, orderByComparator);
	}

	/**
	 * Returns the last material information machines and equipent in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	public static MaterialInformationMachinesAndEquipent
		fetchBygetMaterialInfoMachineEquipment_By_MachineName_AppId_Last(
			String quarryApplicationId, String manchineName,
			OrderByComparator<MaterialInformationMachinesAndEquipent>
				orderByComparator) {

		return getPersistence().
			fetchBygetMaterialInfoMachineEquipment_By_MachineName_AppId_Last(
				quarryApplicationId, manchineName, orderByComparator);
	}

	/**
	 * Returns the material information machines and equipents before and after the current material information machines and equipent in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param miMachineId the primary key of the current material information machines and equipent
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a material information machines and equipent with the primary key could not be found
	 */
	public static MaterialInformationMachinesAndEquipent[]
			findBygetMaterialInfoMachineEquipment_By_MachineName_AppId_PrevAndNext(
				long miMachineId, String quarryApplicationId,
				String manchineName,
				OrderByComparator<MaterialInformationMachinesAndEquipent>
					orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchMaterialInformationMachinesAndEquipentException {

		return getPersistence().
			findBygetMaterialInfoMachineEquipment_By_MachineName_AppId_PrevAndNext(
				miMachineId, quarryApplicationId, manchineName,
				orderByComparator);
	}

	/**
	 * Removes all the material information machines and equipents where quarryApplicationId = &#63; and manchineName = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 */
	public static void
		removeBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName) {

		getPersistence().
			removeBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
				quarryApplicationId, manchineName);
	}

	/**
	 * Returns the number of material information machines and equipents where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @return the number of matching material information machines and equipents
	 */
	public static int
		countBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName) {

		return getPersistence().
			countBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
				quarryApplicationId, manchineName);
	}

	/**
	 * Caches the material information machines and equipent in the entity cache if it is enabled.
	 *
	 * @param materialInformationMachinesAndEquipent the material information machines and equipent
	 */
	public static void cacheResult(
		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent) {

		getPersistence().cacheResult(materialInformationMachinesAndEquipent);
	}

	/**
	 * Caches the material information machines and equipents in the entity cache if it is enabled.
	 *
	 * @param materialInformationMachinesAndEquipents the material information machines and equipents
	 */
	public static void cacheResult(
		List<MaterialInformationMachinesAndEquipent>
			materialInformationMachinesAndEquipents) {

		getPersistence().cacheResult(materialInformationMachinesAndEquipents);
	}

	/**
	 * Creates a new material information machines and equipent with the primary key. Does not add the material information machines and equipent to the database.
	 *
	 * @param miMachineId the primary key for the new material information machines and equipent
	 * @return the new material information machines and equipent
	 */
	public static MaterialInformationMachinesAndEquipent create(
		long miMachineId) {

		return getPersistence().create(miMachineId);
	}

	/**
	 * Removes the material information machines and equipent with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miMachineId the primary key of the material information machines and equipent
	 * @return the material information machines and equipent that was removed
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a material information machines and equipent with the primary key could not be found
	 */
	public static MaterialInformationMachinesAndEquipent remove(
			long miMachineId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchMaterialInformationMachinesAndEquipentException {

		return getPersistence().remove(miMachineId);
	}

	public static MaterialInformationMachinesAndEquipent updateImpl(
		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent) {

		return getPersistence().updateImpl(
			materialInformationMachinesAndEquipent);
	}

	/**
	 * Returns the material information machines and equipent with the primary key or throws a <code>NoSuchMaterialInformationMachinesAndEquipentException</code> if it could not be found.
	 *
	 * @param miMachineId the primary key of the material information machines and equipent
	 * @return the material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a material information machines and equipent with the primary key could not be found
	 */
	public static MaterialInformationMachinesAndEquipent findByPrimaryKey(
			long miMachineId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchMaterialInformationMachinesAndEquipentException {

		return getPersistence().findByPrimaryKey(miMachineId);
	}

	/**
	 * Returns the material information machines and equipent with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miMachineId the primary key of the material information machines and equipent
	 * @return the material information machines and equipent, or <code>null</code> if a material information machines and equipent with the primary key could not be found
	 */
	public static MaterialInformationMachinesAndEquipent fetchByPrimaryKey(
		long miMachineId) {

		return getPersistence().fetchByPrimaryKey(miMachineId);
	}

	/**
	 * Returns all the material information machines and equipents.
	 *
	 * @return the material information machines and equipents
	 */
	public static List<MaterialInformationMachinesAndEquipent> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the material information machines and equipents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @return the range of material information machines and equipents
	 */
	public static List<MaterialInformationMachinesAndEquipent> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the material information machines and equipents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of material information machines and equipents
	 */
	public static List<MaterialInformationMachinesAndEquipent> findAll(
		int start, int end,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the material information machines and equipents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaterialInformationMachinesAndEquipentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of material information machines and equipents
	 * @param end the upper bound of the range of material information machines and equipents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of material information machines and equipents
	 */
	public static List<MaterialInformationMachinesAndEquipent> findAll(
		int start, int end,
		OrderByComparator<MaterialInformationMachinesAndEquipent>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the material information machines and equipents from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of material information machines and equipents.
	 *
	 * @return the number of material information machines and equipents
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MaterialInformationMachinesAndEquipentPersistence
		getPersistence() {

		return _persistence;
	}

	private static volatile MaterialInformationMachinesAndEquipentPersistence
		_persistence;

}