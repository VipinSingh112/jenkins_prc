/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisDeclarationOfOwnershipException;
import com.nbp.cannabis.application.form.services.model.CannabisDeclarationOfOwnership;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis declaration of ownership service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisDeclarationOfOwnershipUtil
 * @generated
 */
@ProviderType
public interface CannabisDeclarationOfOwnershipPersistence
	extends BasePersistence<CannabisDeclarationOfOwnership> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisDeclarationOfOwnershipUtil} to access the cannabis declaration of ownership persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cannabis declaration of ownerships where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis declaration of ownerships
	 */
	public java.util.List<CannabisDeclarationOfOwnership> findByUuid(
		String uuid);

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
	public java.util.List<CannabisDeclarationOfOwnership> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<CannabisDeclarationOfOwnership> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisDeclarationOfOwnership> orderByComparator);

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
	public java.util.List<CannabisDeclarationOfOwnership> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisDeclarationOfOwnership> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis declaration of ownership in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a matching cannabis declaration of ownership could not be found
	 */
	public CannabisDeclarationOfOwnership findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisDeclarationOfOwnership> orderByComparator)
		throws NoSuchCannabisDeclarationOfOwnershipException;

	/**
	 * Returns the first cannabis declaration of ownership in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	public CannabisDeclarationOfOwnership fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisDeclarationOfOwnership> orderByComparator);

	/**
	 * Returns the last cannabis declaration of ownership in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a matching cannabis declaration of ownership could not be found
	 */
	public CannabisDeclarationOfOwnership findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisDeclarationOfOwnership> orderByComparator)
		throws NoSuchCannabisDeclarationOfOwnershipException;

	/**
	 * Returns the last cannabis declaration of ownership in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	public CannabisDeclarationOfOwnership fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisDeclarationOfOwnership> orderByComparator);

	/**
	 * Returns the cannabis declaration of ownerships before and after the current cannabis declaration of ownership in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisDecOfOwnershipId the primary key of the current cannabis declaration of ownership
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a cannabis declaration of ownership with the primary key could not be found
	 */
	public CannabisDeclarationOfOwnership[] findByUuid_PrevAndNext(
			long cannabisDecOfOwnershipId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisDeclarationOfOwnership> orderByComparator)
		throws NoSuchCannabisDeclarationOfOwnershipException;

	/**
	 * Removes all the cannabis declaration of ownerships where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of cannabis declaration of ownerships where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis declaration of ownerships
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the cannabis declaration of ownership where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisDeclarationOfOwnershipException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a matching cannabis declaration of ownership could not be found
	 */
	public CannabisDeclarationOfOwnership findByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisDeclarationOfOwnershipException;

	/**
	 * Returns the cannabis declaration of ownership where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	public CannabisDeclarationOfOwnership fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the cannabis declaration of ownership where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	public CannabisDeclarationOfOwnership fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the cannabis declaration of ownership where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis declaration of ownership that was removed
	 */
	public CannabisDeclarationOfOwnership removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisDeclarationOfOwnershipException;

	/**
	 * Returns the number of cannabis declaration of ownerships where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis declaration of ownerships
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the cannabis declaration of ownerships where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis declaration of ownerships
	 */
	public java.util.List<CannabisDeclarationOfOwnership> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<CannabisDeclarationOfOwnership> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<CannabisDeclarationOfOwnership> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisDeclarationOfOwnership> orderByComparator);

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
	public java.util.List<CannabisDeclarationOfOwnership> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisDeclarationOfOwnership> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis declaration of ownership in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a matching cannabis declaration of ownership could not be found
	 */
	public CannabisDeclarationOfOwnership findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisDeclarationOfOwnership> orderByComparator)
		throws NoSuchCannabisDeclarationOfOwnershipException;

	/**
	 * Returns the first cannabis declaration of ownership in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	public CannabisDeclarationOfOwnership fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisDeclarationOfOwnership> orderByComparator);

	/**
	 * Returns the last cannabis declaration of ownership in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a matching cannabis declaration of ownership could not be found
	 */
	public CannabisDeclarationOfOwnership findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisDeclarationOfOwnership> orderByComparator)
		throws NoSuchCannabisDeclarationOfOwnershipException;

	/**
	 * Returns the last cannabis declaration of ownership in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	public CannabisDeclarationOfOwnership fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisDeclarationOfOwnership> orderByComparator);

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
	public CannabisDeclarationOfOwnership[] findByUuid_C_PrevAndNext(
			long cannabisDecOfOwnershipId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisDeclarationOfOwnership> orderByComparator)
		throws NoSuchCannabisDeclarationOfOwnershipException;

	/**
	 * Removes all the cannabis declaration of ownerships where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of cannabis declaration of ownerships where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis declaration of ownerships
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the cannabis declaration of ownerships where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis declaration of ownerships
	 */
	public java.util.List<CannabisDeclarationOfOwnership> findBygetCA_DO_CAI(
		long cannabisApplicationId);

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
	public java.util.List<CannabisDeclarationOfOwnership> findBygetCA_DO_CAI(
		long cannabisApplicationId, int start, int end);

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
	public java.util.List<CannabisDeclarationOfOwnership> findBygetCA_DO_CAI(
		long cannabisApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisDeclarationOfOwnership> orderByComparator);

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
	public java.util.List<CannabisDeclarationOfOwnership> findBygetCA_DO_CAI(
		long cannabisApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisDeclarationOfOwnership> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis declaration of ownership in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a matching cannabis declaration of ownership could not be found
	 */
	public CannabisDeclarationOfOwnership findBygetCA_DO_CAI_First(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisDeclarationOfOwnership> orderByComparator)
		throws NoSuchCannabisDeclarationOfOwnershipException;

	/**
	 * Returns the first cannabis declaration of ownership in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	public CannabisDeclarationOfOwnership fetchBygetCA_DO_CAI_First(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisDeclarationOfOwnership> orderByComparator);

	/**
	 * Returns the last cannabis declaration of ownership in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a matching cannabis declaration of ownership could not be found
	 */
	public CannabisDeclarationOfOwnership findBygetCA_DO_CAI_Last(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisDeclarationOfOwnership> orderByComparator)
		throws NoSuchCannabisDeclarationOfOwnershipException;

	/**
	 * Returns the last cannabis declaration of ownership in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	public CannabisDeclarationOfOwnership fetchBygetCA_DO_CAI_Last(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisDeclarationOfOwnership> orderByComparator);

	/**
	 * Returns the cannabis declaration of ownerships before and after the current cannabis declaration of ownership in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisDecOfOwnershipId the primary key of the current cannabis declaration of ownership
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a cannabis declaration of ownership with the primary key could not be found
	 */
	public CannabisDeclarationOfOwnership[] findBygetCA_DO_CAI_PrevAndNext(
			long cannabisDecOfOwnershipId, long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisDeclarationOfOwnership> orderByComparator)
		throws NoSuchCannabisDeclarationOfOwnershipException;

	/**
	 * Removes all the cannabis declaration of ownerships where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public void removeBygetCA_DO_CAI(long cannabisApplicationId);

	/**
	 * Returns the number of cannabis declaration of ownerships where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis declaration of ownerships
	 */
	public int countBygetCA_DO_CAI(long cannabisApplicationId);

	/**
	 * Caches the cannabis declaration of ownership in the entity cache if it is enabled.
	 *
	 * @param cannabisDeclarationOfOwnership the cannabis declaration of ownership
	 */
	public void cacheResult(
		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership);

	/**
	 * Caches the cannabis declaration of ownerships in the entity cache if it is enabled.
	 *
	 * @param cannabisDeclarationOfOwnerships the cannabis declaration of ownerships
	 */
	public void cacheResult(
		java.util.List<CannabisDeclarationOfOwnership>
			cannabisDeclarationOfOwnerships);

	/**
	 * Creates a new cannabis declaration of ownership with the primary key. Does not add the cannabis declaration of ownership to the database.
	 *
	 * @param cannabisDecOfOwnershipId the primary key for the new cannabis declaration of ownership
	 * @return the new cannabis declaration of ownership
	 */
	public CannabisDeclarationOfOwnership create(long cannabisDecOfOwnershipId);

	/**
	 * Removes the cannabis declaration of ownership with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisDecOfOwnershipId the primary key of the cannabis declaration of ownership
	 * @return the cannabis declaration of ownership that was removed
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a cannabis declaration of ownership with the primary key could not be found
	 */
	public CannabisDeclarationOfOwnership remove(long cannabisDecOfOwnershipId)
		throws NoSuchCannabisDeclarationOfOwnershipException;

	public CannabisDeclarationOfOwnership updateImpl(
		CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership);

	/**
	 * Returns the cannabis declaration of ownership with the primary key or throws a <code>NoSuchCannabisDeclarationOfOwnershipException</code> if it could not be found.
	 *
	 * @param cannabisDecOfOwnershipId the primary key of the cannabis declaration of ownership
	 * @return the cannabis declaration of ownership
	 * @throws NoSuchCannabisDeclarationOfOwnershipException if a cannabis declaration of ownership with the primary key could not be found
	 */
	public CannabisDeclarationOfOwnership findByPrimaryKey(
			long cannabisDecOfOwnershipId)
		throws NoSuchCannabisDeclarationOfOwnershipException;

	/**
	 * Returns the cannabis declaration of ownership with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisDecOfOwnershipId the primary key of the cannabis declaration of ownership
	 * @return the cannabis declaration of ownership, or <code>null</code> if a cannabis declaration of ownership with the primary key could not be found
	 */
	public CannabisDeclarationOfOwnership fetchByPrimaryKey(
		long cannabisDecOfOwnershipId);

	/**
	 * Returns all the cannabis declaration of ownerships.
	 *
	 * @return the cannabis declaration of ownerships
	 */
	public java.util.List<CannabisDeclarationOfOwnership> findAll();

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
	public java.util.List<CannabisDeclarationOfOwnership> findAll(
		int start, int end);

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
	public java.util.List<CannabisDeclarationOfOwnership> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisDeclarationOfOwnership> orderByComparator);

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
	public java.util.List<CannabisDeclarationOfOwnership> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisDeclarationOfOwnership> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis declaration of ownerships from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis declaration of ownerships.
	 *
	 * @return the number of cannabis declaration of ownerships
	 */
	public int countAll();

}