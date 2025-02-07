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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.quary.application.form.service.exception.NoSuchMaterialInformationMachinesAndEquipentException;
import com.nbp.quary.application.form.service.model.MaterialInformationMachinesAndEquipent;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the material information machines and equipent service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MaterialInformationMachinesAndEquipentUtil
 * @generated
 */
@ProviderType
public interface MaterialInformationMachinesAndEquipentPersistence
	extends BasePersistence<MaterialInformationMachinesAndEquipent> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MaterialInformationMachinesAndEquipentUtil} to access the material information machines and equipent persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the material information machines and equipents where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching material information machines and equipents
	 */
	public java.util.List<MaterialInformationMachinesAndEquipent> findByUuid(
		String uuid);

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
	public java.util.List<MaterialInformationMachinesAndEquipent> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<MaterialInformationMachinesAndEquipent> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MaterialInformationMachinesAndEquipent> orderByComparator);

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
	public java.util.List<MaterialInformationMachinesAndEquipent> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MaterialInformationMachinesAndEquipent> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first material information machines and equipent in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	public MaterialInformationMachinesAndEquipent findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MaterialInformationMachinesAndEquipent> orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException;

	/**
	 * Returns the first material information machines and equipent in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	public MaterialInformationMachinesAndEquipent fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MaterialInformationMachinesAndEquipent> orderByComparator);

	/**
	 * Returns the last material information machines and equipent in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	public MaterialInformationMachinesAndEquipent findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MaterialInformationMachinesAndEquipent> orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException;

	/**
	 * Returns the last material information machines and equipent in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	public MaterialInformationMachinesAndEquipent fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MaterialInformationMachinesAndEquipent> orderByComparator);

	/**
	 * Returns the material information machines and equipents before and after the current material information machines and equipent in the ordered set where uuid = &#63;.
	 *
	 * @param miMachineId the primary key of the current material information machines and equipent
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a material information machines and equipent with the primary key could not be found
	 */
	public MaterialInformationMachinesAndEquipent[] findByUuid_PrevAndNext(
			long miMachineId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MaterialInformationMachinesAndEquipent> orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException;

	/**
	 * Removes all the material information machines and equipents where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of material information machines and equipents where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching material information machines and equipents
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the material information machines and equipent where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMaterialInformationMachinesAndEquipentException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	public MaterialInformationMachinesAndEquipent findByUUID_G(
			String uuid, long groupId)
		throws NoSuchMaterialInformationMachinesAndEquipentException;

	/**
	 * Returns the material information machines and equipent where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	public MaterialInformationMachinesAndEquipent fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the material information machines and equipent where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	public MaterialInformationMachinesAndEquipent fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the material information machines and equipent where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the material information machines and equipent that was removed
	 */
	public MaterialInformationMachinesAndEquipent removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchMaterialInformationMachinesAndEquipentException;

	/**
	 * Returns the number of material information machines and equipents where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching material information machines and equipents
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the material information machines and equipents where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching material information machines and equipents
	 */
	public java.util.List<MaterialInformationMachinesAndEquipent> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<MaterialInformationMachinesAndEquipent> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<MaterialInformationMachinesAndEquipent> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MaterialInformationMachinesAndEquipent> orderByComparator);

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
	public java.util.List<MaterialInformationMachinesAndEquipent> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MaterialInformationMachinesAndEquipent> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first material information machines and equipent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	public MaterialInformationMachinesAndEquipent findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MaterialInformationMachinesAndEquipent> orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException;

	/**
	 * Returns the first material information machines and equipent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	public MaterialInformationMachinesAndEquipent fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MaterialInformationMachinesAndEquipent> orderByComparator);

	/**
	 * Returns the last material information machines and equipent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	public MaterialInformationMachinesAndEquipent findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MaterialInformationMachinesAndEquipent> orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException;

	/**
	 * Returns the last material information machines and equipent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	public MaterialInformationMachinesAndEquipent fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MaterialInformationMachinesAndEquipent> orderByComparator);

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
	public MaterialInformationMachinesAndEquipent[] findByUuid_C_PrevAndNext(
			long miMachineId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MaterialInformationMachinesAndEquipent> orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException;

	/**
	 * Removes all the material information machines and equipents where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of material information machines and equipents where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching material information machines and equipents
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the material information machines and equipents where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching material information machines and equipents
	 */
	public java.util.List<MaterialInformationMachinesAndEquipent>
		findBygetQuarryById(String quarryApplicationId);

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
	public java.util.List<MaterialInformationMachinesAndEquipent>
		findBygetQuarryById(String quarryApplicationId, int start, int end);

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
	public java.util.List<MaterialInformationMachinesAndEquipent>
		findBygetQuarryById(
			String quarryApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MaterialInformationMachinesAndEquipent> orderByComparator);

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
	public java.util.List<MaterialInformationMachinesAndEquipent>
		findBygetQuarryById(
			String quarryApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MaterialInformationMachinesAndEquipent> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first material information machines and equipent in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	public MaterialInformationMachinesAndEquipent findBygetQuarryById_First(
			String quarryApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MaterialInformationMachinesAndEquipent> orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException;

	/**
	 * Returns the first material information machines and equipent in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	public MaterialInformationMachinesAndEquipent fetchBygetQuarryById_First(
		String quarryApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MaterialInformationMachinesAndEquipent> orderByComparator);

	/**
	 * Returns the last material information machines and equipent in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	public MaterialInformationMachinesAndEquipent findBygetQuarryById_Last(
			String quarryApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MaterialInformationMachinesAndEquipent> orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException;

	/**
	 * Returns the last material information machines and equipent in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	public MaterialInformationMachinesAndEquipent fetchBygetQuarryById_Last(
		String quarryApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MaterialInformationMachinesAndEquipent> orderByComparator);

	/**
	 * Returns the material information machines and equipents before and after the current material information machines and equipent in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param miMachineId the primary key of the current material information machines and equipent
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a material information machines and equipent with the primary key could not be found
	 */
	public MaterialInformationMachinesAndEquipent[]
			findBygetQuarryById_PrevAndNext(
				long miMachineId, String quarryApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<MaterialInformationMachinesAndEquipent> orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException;

	/**
	 * Removes all the material information machines and equipents where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 */
	public void removeBygetQuarryById(String quarryApplicationId);

	/**
	 * Returns the number of material information machines and equipents where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching material information machines and equipents
	 */
	public int countBygetQuarryById(String quarryApplicationId);

	/**
	 * Returns all the material information machines and equipents where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @return the matching material information machines and equipents
	 */
	public java.util.List<MaterialInformationMachinesAndEquipent>
		findBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName);

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
	public java.util.List<MaterialInformationMachinesAndEquipent>
		findBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName, int start,
			int end);

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
	public java.util.List<MaterialInformationMachinesAndEquipent>
		findBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MaterialInformationMachinesAndEquipent> orderByComparator);

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
	public java.util.List<MaterialInformationMachinesAndEquipent>
		findBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MaterialInformationMachinesAndEquipent> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first material information machines and equipent in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	public MaterialInformationMachinesAndEquipent
			findBygetMaterialInfoMachineEquipment_By_MachineName_AppId_First(
				String quarryApplicationId, String manchineName,
				com.liferay.portal.kernel.util.OrderByComparator
					<MaterialInformationMachinesAndEquipent> orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException;

	/**
	 * Returns the first material information machines and equipent in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	public MaterialInformationMachinesAndEquipent
		fetchBygetMaterialInfoMachineEquipment_By_MachineName_AppId_First(
			String quarryApplicationId, String manchineName,
			com.liferay.portal.kernel.util.OrderByComparator
				<MaterialInformationMachinesAndEquipent> orderByComparator);

	/**
	 * Returns the last material information machines and equipent in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a matching material information machines and equipent could not be found
	 */
	public MaterialInformationMachinesAndEquipent
			findBygetMaterialInfoMachineEquipment_By_MachineName_AppId_Last(
				String quarryApplicationId, String manchineName,
				com.liferay.portal.kernel.util.OrderByComparator
					<MaterialInformationMachinesAndEquipent> orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException;

	/**
	 * Returns the last material information machines and equipent in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching material information machines and equipent, or <code>null</code> if a matching material information machines and equipent could not be found
	 */
	public MaterialInformationMachinesAndEquipent
		fetchBygetMaterialInfoMachineEquipment_By_MachineName_AppId_Last(
			String quarryApplicationId, String manchineName,
			com.liferay.portal.kernel.util.OrderByComparator
				<MaterialInformationMachinesAndEquipent> orderByComparator);

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
	public MaterialInformationMachinesAndEquipent[]
			findBygetMaterialInfoMachineEquipment_By_MachineName_AppId_PrevAndNext(
				long miMachineId, String quarryApplicationId,
				String manchineName,
				com.liferay.portal.kernel.util.OrderByComparator
					<MaterialInformationMachinesAndEquipent> orderByComparator)
		throws NoSuchMaterialInformationMachinesAndEquipentException;

	/**
	 * Removes all the material information machines and equipents where quarryApplicationId = &#63; and manchineName = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 */
	public void removeBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
		String quarryApplicationId, String manchineName);

	/**
	 * Returns the number of material information machines and equipents where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @return the number of matching material information machines and equipents
	 */
	public int countBygetMaterialInfoMachineEquipment_By_MachineName_AppId(
		String quarryApplicationId, String manchineName);

	/**
	 * Caches the material information machines and equipent in the entity cache if it is enabled.
	 *
	 * @param materialInformationMachinesAndEquipent the material information machines and equipent
	 */
	public void cacheResult(
		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent);

	/**
	 * Caches the material information machines and equipents in the entity cache if it is enabled.
	 *
	 * @param materialInformationMachinesAndEquipents the material information machines and equipents
	 */
	public void cacheResult(
		java.util.List<MaterialInformationMachinesAndEquipent>
			materialInformationMachinesAndEquipents);

	/**
	 * Creates a new material information machines and equipent with the primary key. Does not add the material information machines and equipent to the database.
	 *
	 * @param miMachineId the primary key for the new material information machines and equipent
	 * @return the new material information machines and equipent
	 */
	public MaterialInformationMachinesAndEquipent create(long miMachineId);

	/**
	 * Removes the material information machines and equipent with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miMachineId the primary key of the material information machines and equipent
	 * @return the material information machines and equipent that was removed
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a material information machines and equipent with the primary key could not be found
	 */
	public MaterialInformationMachinesAndEquipent remove(long miMachineId)
		throws NoSuchMaterialInformationMachinesAndEquipentException;

	public MaterialInformationMachinesAndEquipent updateImpl(
		MaterialInformationMachinesAndEquipent
			materialInformationMachinesAndEquipent);

	/**
	 * Returns the material information machines and equipent with the primary key or throws a <code>NoSuchMaterialInformationMachinesAndEquipentException</code> if it could not be found.
	 *
	 * @param miMachineId the primary key of the material information machines and equipent
	 * @return the material information machines and equipent
	 * @throws NoSuchMaterialInformationMachinesAndEquipentException if a material information machines and equipent with the primary key could not be found
	 */
	public MaterialInformationMachinesAndEquipent findByPrimaryKey(
			long miMachineId)
		throws NoSuchMaterialInformationMachinesAndEquipentException;

	/**
	 * Returns the material information machines and equipent with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miMachineId the primary key of the material information machines and equipent
	 * @return the material information machines and equipent, or <code>null</code> if a material information machines and equipent with the primary key could not be found
	 */
	public MaterialInformationMachinesAndEquipent fetchByPrimaryKey(
		long miMachineId);

	/**
	 * Returns all the material information machines and equipents.
	 *
	 * @return the material information machines and equipents
	 */
	public java.util.List<MaterialInformationMachinesAndEquipent> findAll();

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
	public java.util.List<MaterialInformationMachinesAndEquipent> findAll(
		int start, int end);

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
	public java.util.List<MaterialInformationMachinesAndEquipent> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MaterialInformationMachinesAndEquipent> orderByComparator);

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
	public java.util.List<MaterialInformationMachinesAndEquipent> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MaterialInformationMachinesAndEquipent> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the material information machines and equipents from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of material information machines and equipents.
	 *
	 * @return the number of material information machines and equipents
	 */
	public int countAll();

}