/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.cannabis.application.form.services.exception.NoSuchGeneralDelarationsException;
import com.nbp.cannabis.application.form.services.model.GeneralDelarations;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the general delarations service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GeneralDelarationsUtil
 * @generated
 */
@ProviderType
public interface GeneralDelarationsPersistence
	extends BasePersistence<GeneralDelarations> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GeneralDelarationsUtil} to access the general delarations persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the general delarationses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching general delarationses
	 */
	public java.util.List<GeneralDelarations> findByUuid(String uuid);

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
	public java.util.List<GeneralDelarations> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<GeneralDelarations> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
			orderByComparator);

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
	public java.util.List<GeneralDelarations> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first general delarations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching general delarations
	 * @throws NoSuchGeneralDelarationsException if a matching general delarations could not be found
	 */
	public GeneralDelarations findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
				orderByComparator)
		throws NoSuchGeneralDelarationsException;

	/**
	 * Returns the first general delarations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	public GeneralDelarations fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
			orderByComparator);

	/**
	 * Returns the last general delarations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching general delarations
	 * @throws NoSuchGeneralDelarationsException if a matching general delarations could not be found
	 */
	public GeneralDelarations findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
				orderByComparator)
		throws NoSuchGeneralDelarationsException;

	/**
	 * Returns the last general delarations in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	public GeneralDelarations fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
			orderByComparator);

	/**
	 * Returns the general delarationses before and after the current general delarations in the ordered set where uuid = &#63;.
	 *
	 * @param generalDeclarationId the primary key of the current general delarations
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next general delarations
	 * @throws NoSuchGeneralDelarationsException if a general delarations with the primary key could not be found
	 */
	public GeneralDelarations[] findByUuid_PrevAndNext(
			long generalDeclarationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
				orderByComparator)
		throws NoSuchGeneralDelarationsException;

	/**
	 * Removes all the general delarationses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of general delarationses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching general delarationses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the general delarations where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchGeneralDelarationsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching general delarations
	 * @throws NoSuchGeneralDelarationsException if a matching general delarations could not be found
	 */
	public GeneralDelarations findByUUID_G(String uuid, long groupId)
		throws NoSuchGeneralDelarationsException;

	/**
	 * Returns the general delarations where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	public GeneralDelarations fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the general delarations where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	public GeneralDelarations fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the general delarations where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the general delarations that was removed
	 */
	public GeneralDelarations removeByUUID_G(String uuid, long groupId)
		throws NoSuchGeneralDelarationsException;

	/**
	 * Returns the number of general delarationses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching general delarationses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the general delarationses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching general delarationses
	 */
	public java.util.List<GeneralDelarations> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<GeneralDelarations> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<GeneralDelarations> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
			orderByComparator);

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
	public java.util.List<GeneralDelarations> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first general delarations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching general delarations
	 * @throws NoSuchGeneralDelarationsException if a matching general delarations could not be found
	 */
	public GeneralDelarations findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
				orderByComparator)
		throws NoSuchGeneralDelarationsException;

	/**
	 * Returns the first general delarations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	public GeneralDelarations fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
			orderByComparator);

	/**
	 * Returns the last general delarations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching general delarations
	 * @throws NoSuchGeneralDelarationsException if a matching general delarations could not be found
	 */
	public GeneralDelarations findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
				orderByComparator)
		throws NoSuchGeneralDelarationsException;

	/**
	 * Returns the last general delarations in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	public GeneralDelarations fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
			orderByComparator);

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
	public GeneralDelarations[] findByUuid_C_PrevAndNext(
			long generalDeclarationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
				orderByComparator)
		throws NoSuchGeneralDelarationsException;

	/**
	 * Removes all the general delarationses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of general delarationses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching general delarationses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the general delarationses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching general delarationses
	 */
	public java.util.List<GeneralDelarations> findBygetCA_GD_CAI(
		long cannabisApplicationId);

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
	public java.util.List<GeneralDelarations> findBygetCA_GD_CAI(
		long cannabisApplicationId, int start, int end);

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
	public java.util.List<GeneralDelarations> findBygetCA_GD_CAI(
		long cannabisApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
			orderByComparator);

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
	public java.util.List<GeneralDelarations> findBygetCA_GD_CAI(
		long cannabisApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first general delarations in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching general delarations
	 * @throws NoSuchGeneralDelarationsException if a matching general delarations could not be found
	 */
	public GeneralDelarations findBygetCA_GD_CAI_First(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
				orderByComparator)
		throws NoSuchGeneralDelarationsException;

	/**
	 * Returns the first general delarations in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	public GeneralDelarations fetchBygetCA_GD_CAI_First(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
			orderByComparator);

	/**
	 * Returns the last general delarations in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching general delarations
	 * @throws NoSuchGeneralDelarationsException if a matching general delarations could not be found
	 */
	public GeneralDelarations findBygetCA_GD_CAI_Last(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
				orderByComparator)
		throws NoSuchGeneralDelarationsException;

	/**
	 * Returns the last general delarations in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	public GeneralDelarations fetchBygetCA_GD_CAI_Last(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
			orderByComparator);

	/**
	 * Returns the general delarationses before and after the current general delarations in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param generalDeclarationId the primary key of the current general delarations
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next general delarations
	 * @throws NoSuchGeneralDelarationsException if a general delarations with the primary key could not be found
	 */
	public GeneralDelarations[] findBygetCA_GD_CAI_PrevAndNext(
			long generalDeclarationId, long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
				orderByComparator)
		throws NoSuchGeneralDelarationsException;

	/**
	 * Removes all the general delarationses where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public void removeBygetCA_GD_CAI(long cannabisApplicationId);

	/**
	 * Returns the number of general delarationses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching general delarationses
	 */
	public int countBygetCA_GD_CAI(long cannabisApplicationId);

	/**
	 * Caches the general delarations in the entity cache if it is enabled.
	 *
	 * @param generalDelarations the general delarations
	 */
	public void cacheResult(GeneralDelarations generalDelarations);

	/**
	 * Caches the general delarationses in the entity cache if it is enabled.
	 *
	 * @param generalDelarationses the general delarationses
	 */
	public void cacheResult(
		java.util.List<GeneralDelarations> generalDelarationses);

	/**
	 * Creates a new general delarations with the primary key. Does not add the general delarations to the database.
	 *
	 * @param generalDeclarationId the primary key for the new general delarations
	 * @return the new general delarations
	 */
	public GeneralDelarations create(long generalDeclarationId);

	/**
	 * Removes the general delarations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param generalDeclarationId the primary key of the general delarations
	 * @return the general delarations that was removed
	 * @throws NoSuchGeneralDelarationsException if a general delarations with the primary key could not be found
	 */
	public GeneralDelarations remove(long generalDeclarationId)
		throws NoSuchGeneralDelarationsException;

	public GeneralDelarations updateImpl(GeneralDelarations generalDelarations);

	/**
	 * Returns the general delarations with the primary key or throws a <code>NoSuchGeneralDelarationsException</code> if it could not be found.
	 *
	 * @param generalDeclarationId the primary key of the general delarations
	 * @return the general delarations
	 * @throws NoSuchGeneralDelarationsException if a general delarations with the primary key could not be found
	 */
	public GeneralDelarations findByPrimaryKey(long generalDeclarationId)
		throws NoSuchGeneralDelarationsException;

	/**
	 * Returns the general delarations with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param generalDeclarationId the primary key of the general delarations
	 * @return the general delarations, or <code>null</code> if a general delarations with the primary key could not be found
	 */
	public GeneralDelarations fetchByPrimaryKey(long generalDeclarationId);

	/**
	 * Returns all the general delarationses.
	 *
	 * @return the general delarationses
	 */
	public java.util.List<GeneralDelarations> findAll();

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
	public java.util.List<GeneralDelarations> findAll(int start, int end);

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
	public java.util.List<GeneralDelarations> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
			orderByComparator);

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
	public java.util.List<GeneralDelarations> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<GeneralDelarations>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the general delarationses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of general delarationses.
	 *
	 * @return the number of general delarationses
	 */
	public int countAll();

}