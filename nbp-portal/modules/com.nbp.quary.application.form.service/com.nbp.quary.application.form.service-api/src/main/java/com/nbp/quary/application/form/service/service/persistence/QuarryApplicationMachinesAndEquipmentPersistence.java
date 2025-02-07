/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.quary.application.form.service.exception.NoSuchQuarryApplicationMachinesAndEquipmentException;
import com.nbp.quary.application.form.service.model.QuarryApplicationMachinesAndEquipment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the quarry application machines and equipment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationMachinesAndEquipmentUtil
 * @generated
 */
@ProviderType
public interface QuarryApplicationMachinesAndEquipmentPersistence
	extends BasePersistence<QuarryApplicationMachinesAndEquipment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QuarryApplicationMachinesAndEquipmentUtil} to access the quarry application machines and equipment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the quarry application machines and equipments where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching quarry application machines and equipments
	 */
	public java.util.List<QuarryApplicationMachinesAndEquipment> findByUuid(
		String uuid);

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
	public java.util.List<QuarryApplicationMachinesAndEquipment> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<QuarryApplicationMachinesAndEquipment> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryApplicationMachinesAndEquipment> orderByComparator);

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
	public java.util.List<QuarryApplicationMachinesAndEquipment> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryApplicationMachinesAndEquipment> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	public QuarryApplicationMachinesAndEquipment findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationMachinesAndEquipment> orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException;

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	public QuarryApplicationMachinesAndEquipment fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryApplicationMachinesAndEquipment> orderByComparator);

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	public QuarryApplicationMachinesAndEquipment findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationMachinesAndEquipment> orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException;

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	public QuarryApplicationMachinesAndEquipment fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryApplicationMachinesAndEquipment> orderByComparator);

	/**
	 * Returns the quarry application machines and equipments before and after the current quarry application machines and equipment in the ordered set where uuid = &#63;.
	 *
	 * @param quarryApplicationMachinId the primary key of the current quarry application machines and equipment
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a quarry application machines and equipment with the primary key could not be found
	 */
	public QuarryApplicationMachinesAndEquipment[] findByUuid_PrevAndNext(
			long quarryApplicationMachinId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationMachinesAndEquipment> orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException;

	/**
	 * Removes all the quarry application machines and equipments where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of quarry application machines and equipments where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching quarry application machines and equipments
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the quarry application machines and equipment where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchQuarryApplicationMachinesAndEquipmentException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	public QuarryApplicationMachinesAndEquipment findByUUID_G(
			String uuid, long groupId)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException;

	/**
	 * Returns the quarry application machines and equipment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	public QuarryApplicationMachinesAndEquipment fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the quarry application machines and equipment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	public QuarryApplicationMachinesAndEquipment fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the quarry application machines and equipment where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the quarry application machines and equipment that was removed
	 */
	public QuarryApplicationMachinesAndEquipment removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException;

	/**
	 * Returns the number of quarry application machines and equipments where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching quarry application machines and equipments
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the quarry application machines and equipments where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching quarry application machines and equipments
	 */
	public java.util.List<QuarryApplicationMachinesAndEquipment> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<QuarryApplicationMachinesAndEquipment> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<QuarryApplicationMachinesAndEquipment> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryApplicationMachinesAndEquipment> orderByComparator);

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
	public java.util.List<QuarryApplicationMachinesAndEquipment> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryApplicationMachinesAndEquipment> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	public QuarryApplicationMachinesAndEquipment findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationMachinesAndEquipment> orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException;

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	public QuarryApplicationMachinesAndEquipment fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryApplicationMachinesAndEquipment> orderByComparator);

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	public QuarryApplicationMachinesAndEquipment findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationMachinesAndEquipment> orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException;

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	public QuarryApplicationMachinesAndEquipment fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryApplicationMachinesAndEquipment> orderByComparator);

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
	public QuarryApplicationMachinesAndEquipment[] findByUuid_C_PrevAndNext(
			long quarryApplicationMachinId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationMachinesAndEquipment> orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException;

	/**
	 * Removes all the quarry application machines and equipments where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of quarry application machines and equipments where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching quarry application machines and equipments
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the quarry application machines and equipments where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry application machines and equipments
	 */
	public java.util.List<QuarryApplicationMachinesAndEquipment>
		findBygetQuarryById(String quarryApplicationId);

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
	public java.util.List<QuarryApplicationMachinesAndEquipment>
		findBygetQuarryById(String quarryApplicationId, int start, int end);

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
	public java.util.List<QuarryApplicationMachinesAndEquipment>
		findBygetQuarryById(
			String quarryApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationMachinesAndEquipment> orderByComparator);

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
	public java.util.List<QuarryApplicationMachinesAndEquipment>
		findBygetQuarryById(
			String quarryApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationMachinesAndEquipment> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	public QuarryApplicationMachinesAndEquipment findBygetQuarryById_First(
			String quarryApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationMachinesAndEquipment> orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException;

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	public QuarryApplicationMachinesAndEquipment fetchBygetQuarryById_First(
		String quarryApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryApplicationMachinesAndEquipment> orderByComparator);

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	public QuarryApplicationMachinesAndEquipment findBygetQuarryById_Last(
			String quarryApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationMachinesAndEquipment> orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException;

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	public QuarryApplicationMachinesAndEquipment fetchBygetQuarryById_Last(
		String quarryApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryApplicationMachinesAndEquipment> orderByComparator);

	/**
	 * Returns the quarry application machines and equipments before and after the current quarry application machines and equipment in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationMachinId the primary key of the current quarry application machines and equipment
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a quarry application machines and equipment with the primary key could not be found
	 */
	public QuarryApplicationMachinesAndEquipment[]
			findBygetQuarryById_PrevAndNext(
				long quarryApplicationMachinId, String quarryApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<QuarryApplicationMachinesAndEquipment> orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException;

	/**
	 * Removes all the quarry application machines and equipments where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 */
	public void removeBygetQuarryById(String quarryApplicationId);

	/**
	 * Returns the number of quarry application machines and equipments where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry application machines and equipments
	 */
	public int countBygetQuarryById(String quarryApplicationId);

	/**
	 * Returns all the quarry application machines and equipments where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @return the matching quarry application machines and equipments
	 */
	public java.util.List<QuarryApplicationMachinesAndEquipment>
		findBygetQuarryMAchineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName);

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
	public java.util.List<QuarryApplicationMachinesAndEquipment>
		findBygetQuarryMAchineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName, int start,
			int end);

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
	public java.util.List<QuarryApplicationMachinesAndEquipment>
		findBygetQuarryMAchineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationMachinesAndEquipment> orderByComparator);

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
	public java.util.List<QuarryApplicationMachinesAndEquipment>
		findBygetQuarryMAchineEquipment_By_MachineName_AppId(
			String quarryApplicationId, String manchineName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationMachinesAndEquipment> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	public QuarryApplicationMachinesAndEquipment
			findBygetQuarryMAchineEquipment_By_MachineName_AppId_First(
				String quarryApplicationId, String manchineName,
				com.liferay.portal.kernel.util.OrderByComparator
					<QuarryApplicationMachinesAndEquipment> orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException;

	/**
	 * Returns the first quarry application machines and equipment in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	public QuarryApplicationMachinesAndEquipment
		fetchBygetQuarryMAchineEquipment_By_MachineName_AppId_First(
			String quarryApplicationId, String manchineName,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationMachinesAndEquipment> orderByComparator);

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a matching quarry application machines and equipment could not be found
	 */
	public QuarryApplicationMachinesAndEquipment
			findBygetQuarryMAchineEquipment_By_MachineName_AppId_Last(
				String quarryApplicationId, String manchineName,
				com.liferay.portal.kernel.util.OrderByComparator
					<QuarryApplicationMachinesAndEquipment> orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException;

	/**
	 * Returns the last quarry application machines and equipment in the ordered set where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application machines and equipment, or <code>null</code> if a matching quarry application machines and equipment could not be found
	 */
	public QuarryApplicationMachinesAndEquipment
		fetchBygetQuarryMAchineEquipment_By_MachineName_AppId_Last(
			String quarryApplicationId, String manchineName,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationMachinesAndEquipment> orderByComparator);

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
	public QuarryApplicationMachinesAndEquipment[]
			findBygetQuarryMAchineEquipment_By_MachineName_AppId_PrevAndNext(
				long quarryApplicationMachinId, String quarryApplicationId,
				String manchineName,
				com.liferay.portal.kernel.util.OrderByComparator
					<QuarryApplicationMachinesAndEquipment> orderByComparator)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException;

	/**
	 * Removes all the quarry application machines and equipments where quarryApplicationId = &#63; and manchineName = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 */
	public void removeBygetQuarryMAchineEquipment_By_MachineName_AppId(
		String quarryApplicationId, String manchineName);

	/**
	 * Returns the number of quarry application machines and equipments where quarryApplicationId = &#63; and manchineName = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param manchineName the manchine name
	 * @return the number of matching quarry application machines and equipments
	 */
	public int countBygetQuarryMAchineEquipment_By_MachineName_AppId(
		String quarryApplicationId, String manchineName);

	/**
	 * Caches the quarry application machines and equipment in the entity cache if it is enabled.
	 *
	 * @param quarryApplicationMachinesAndEquipment the quarry application machines and equipment
	 */
	public void cacheResult(
		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment);

	/**
	 * Caches the quarry application machines and equipments in the entity cache if it is enabled.
	 *
	 * @param quarryApplicationMachinesAndEquipments the quarry application machines and equipments
	 */
	public void cacheResult(
		java.util.List<QuarryApplicationMachinesAndEquipment>
			quarryApplicationMachinesAndEquipments);

	/**
	 * Creates a new quarry application machines and equipment with the primary key. Does not add the quarry application machines and equipment to the database.
	 *
	 * @param quarryApplicationMachinId the primary key for the new quarry application machines and equipment
	 * @return the new quarry application machines and equipment
	 */
	public QuarryApplicationMachinesAndEquipment create(
		long quarryApplicationMachinId);

	/**
	 * Removes the quarry application machines and equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quarryApplicationMachinId the primary key of the quarry application machines and equipment
	 * @return the quarry application machines and equipment that was removed
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a quarry application machines and equipment with the primary key could not be found
	 */
	public QuarryApplicationMachinesAndEquipment remove(
			long quarryApplicationMachinId)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException;

	public QuarryApplicationMachinesAndEquipment updateImpl(
		QuarryApplicationMachinesAndEquipment
			quarryApplicationMachinesAndEquipment);

	/**
	 * Returns the quarry application machines and equipment with the primary key or throws a <code>NoSuchQuarryApplicationMachinesAndEquipmentException</code> if it could not be found.
	 *
	 * @param quarryApplicationMachinId the primary key of the quarry application machines and equipment
	 * @return the quarry application machines and equipment
	 * @throws NoSuchQuarryApplicationMachinesAndEquipmentException if a quarry application machines and equipment with the primary key could not be found
	 */
	public QuarryApplicationMachinesAndEquipment findByPrimaryKey(
			long quarryApplicationMachinId)
		throws NoSuchQuarryApplicationMachinesAndEquipmentException;

	/**
	 * Returns the quarry application machines and equipment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quarryApplicationMachinId the primary key of the quarry application machines and equipment
	 * @return the quarry application machines and equipment, or <code>null</code> if a quarry application machines and equipment with the primary key could not be found
	 */
	public QuarryApplicationMachinesAndEquipment fetchByPrimaryKey(
		long quarryApplicationMachinId);

	/**
	 * Returns all the quarry application machines and equipments.
	 *
	 * @return the quarry application machines and equipments
	 */
	public java.util.List<QuarryApplicationMachinesAndEquipment> findAll();

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
	public java.util.List<QuarryApplicationMachinesAndEquipment> findAll(
		int start, int end);

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
	public java.util.List<QuarryApplicationMachinesAndEquipment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryApplicationMachinesAndEquipment> orderByComparator);

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
	public java.util.List<QuarryApplicationMachinesAndEquipment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<QuarryApplicationMachinesAndEquipment> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the quarry application machines and equipments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of quarry application machines and equipments.
	 *
	 * @return the number of quarry application machines and equipments
	 */
	public int countAll();

}