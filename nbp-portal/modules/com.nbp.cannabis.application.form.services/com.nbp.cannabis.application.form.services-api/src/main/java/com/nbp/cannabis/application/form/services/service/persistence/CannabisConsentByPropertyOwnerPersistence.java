/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisConsentByPropertyOwnerException;
import com.nbp.cannabis.application.form.services.model.CannabisConsentByPropertyOwner;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis consent by property owner service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConsentByPropertyOwnerUtil
 * @generated
 */
@ProviderType
public interface CannabisConsentByPropertyOwnerPersistence
	extends BasePersistence<CannabisConsentByPropertyOwner> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisConsentByPropertyOwnerUtil} to access the cannabis consent by property owner persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cannabis consent by property owners where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis consent by property owners
	 */
	public java.util.List<CannabisConsentByPropertyOwner> findByUuid(
		String uuid);

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
	public java.util.List<CannabisConsentByPropertyOwner> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<CannabisConsentByPropertyOwner> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConsentByPropertyOwner> orderByComparator);

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
	public java.util.List<CannabisConsentByPropertyOwner> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConsentByPropertyOwner> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis consent by property owner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a matching cannabis consent by property owner could not be found
	 */
	public CannabisConsentByPropertyOwner findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConsentByPropertyOwner> orderByComparator)
		throws NoSuchCannabisConsentByPropertyOwnerException;

	/**
	 * Returns the first cannabis consent by property owner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	public CannabisConsentByPropertyOwner fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConsentByPropertyOwner> orderByComparator);

	/**
	 * Returns the last cannabis consent by property owner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a matching cannabis consent by property owner could not be found
	 */
	public CannabisConsentByPropertyOwner findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConsentByPropertyOwner> orderByComparator)
		throws NoSuchCannabisConsentByPropertyOwnerException;

	/**
	 * Returns the last cannabis consent by property owner in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	public CannabisConsentByPropertyOwner fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConsentByPropertyOwner> orderByComparator);

	/**
	 * Returns the cannabis consent by property owners before and after the current cannabis consent by property owner in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisCPOId the primary key of the current cannabis consent by property owner
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a cannabis consent by property owner with the primary key could not be found
	 */
	public CannabisConsentByPropertyOwner[] findByUuid_PrevAndNext(
			long cannabisCPOId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConsentByPropertyOwner> orderByComparator)
		throws NoSuchCannabisConsentByPropertyOwnerException;

	/**
	 * Removes all the cannabis consent by property owners where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of cannabis consent by property owners where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis consent by property owners
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the cannabis consent by property owner where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisConsentByPropertyOwnerException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a matching cannabis consent by property owner could not be found
	 */
	public CannabisConsentByPropertyOwner findByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisConsentByPropertyOwnerException;

	/**
	 * Returns the cannabis consent by property owner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	public CannabisConsentByPropertyOwner fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the cannabis consent by property owner where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	public CannabisConsentByPropertyOwner fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the cannabis consent by property owner where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis consent by property owner that was removed
	 */
	public CannabisConsentByPropertyOwner removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisConsentByPropertyOwnerException;

	/**
	 * Returns the number of cannabis consent by property owners where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis consent by property owners
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the cannabis consent by property owners where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis consent by property owners
	 */
	public java.util.List<CannabisConsentByPropertyOwner> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<CannabisConsentByPropertyOwner> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<CannabisConsentByPropertyOwner> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConsentByPropertyOwner> orderByComparator);

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
	public java.util.List<CannabisConsentByPropertyOwner> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConsentByPropertyOwner> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis consent by property owner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a matching cannabis consent by property owner could not be found
	 */
	public CannabisConsentByPropertyOwner findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConsentByPropertyOwner> orderByComparator)
		throws NoSuchCannabisConsentByPropertyOwnerException;

	/**
	 * Returns the first cannabis consent by property owner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	public CannabisConsentByPropertyOwner fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConsentByPropertyOwner> orderByComparator);

	/**
	 * Returns the last cannabis consent by property owner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a matching cannabis consent by property owner could not be found
	 */
	public CannabisConsentByPropertyOwner findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConsentByPropertyOwner> orderByComparator)
		throws NoSuchCannabisConsentByPropertyOwnerException;

	/**
	 * Returns the last cannabis consent by property owner in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	public CannabisConsentByPropertyOwner fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConsentByPropertyOwner> orderByComparator);

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
	public CannabisConsentByPropertyOwner[] findByUuid_C_PrevAndNext(
			long cannabisCPOId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConsentByPropertyOwner> orderByComparator)
		throws NoSuchCannabisConsentByPropertyOwnerException;

	/**
	 * Removes all the cannabis consent by property owners where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of cannabis consent by property owners where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis consent by property owners
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the cannabis consent by property owner where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisConsentByPropertyOwnerException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a matching cannabis consent by property owner could not be found
	 */
	public CannabisConsentByPropertyOwner findBygetCA_CPO_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisConsentByPropertyOwnerException;

	/**
	 * Returns the cannabis consent by property owner where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	public CannabisConsentByPropertyOwner fetchBygetCA_CPO_CAI(
		long cannabisApplicationId);

	/**
	 * Returns the cannabis consent by property owner where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	public CannabisConsentByPropertyOwner fetchBygetCA_CPO_CAI(
		long cannabisApplicationId, boolean useFinderCache);

	/**
	 * Removes the cannabis consent by property owner where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis consent by property owner that was removed
	 */
	public CannabisConsentByPropertyOwner removeBygetCA_CPO_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisConsentByPropertyOwnerException;

	/**
	 * Returns the number of cannabis consent by property owners where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis consent by property owners
	 */
	public int countBygetCA_CPO_CAI(long cannabisApplicationId);

	/**
	 * Caches the cannabis consent by property owner in the entity cache if it is enabled.
	 *
	 * @param cannabisConsentByPropertyOwner the cannabis consent by property owner
	 */
	public void cacheResult(
		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner);

	/**
	 * Caches the cannabis consent by property owners in the entity cache if it is enabled.
	 *
	 * @param cannabisConsentByPropertyOwners the cannabis consent by property owners
	 */
	public void cacheResult(
		java.util.List<CannabisConsentByPropertyOwner>
			cannabisConsentByPropertyOwners);

	/**
	 * Creates a new cannabis consent by property owner with the primary key. Does not add the cannabis consent by property owner to the database.
	 *
	 * @param cannabisCPOId the primary key for the new cannabis consent by property owner
	 * @return the new cannabis consent by property owner
	 */
	public CannabisConsentByPropertyOwner create(long cannabisCPOId);

	/**
	 * Removes the cannabis consent by property owner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisCPOId the primary key of the cannabis consent by property owner
	 * @return the cannabis consent by property owner that was removed
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a cannabis consent by property owner with the primary key could not be found
	 */
	public CannabisConsentByPropertyOwner remove(long cannabisCPOId)
		throws NoSuchCannabisConsentByPropertyOwnerException;

	public CannabisConsentByPropertyOwner updateImpl(
		CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner);

	/**
	 * Returns the cannabis consent by property owner with the primary key or throws a <code>NoSuchCannabisConsentByPropertyOwnerException</code> if it could not be found.
	 *
	 * @param cannabisCPOId the primary key of the cannabis consent by property owner
	 * @return the cannabis consent by property owner
	 * @throws NoSuchCannabisConsentByPropertyOwnerException if a cannabis consent by property owner with the primary key could not be found
	 */
	public CannabisConsentByPropertyOwner findByPrimaryKey(long cannabisCPOId)
		throws NoSuchCannabisConsentByPropertyOwnerException;

	/**
	 * Returns the cannabis consent by property owner with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisCPOId the primary key of the cannabis consent by property owner
	 * @return the cannabis consent by property owner, or <code>null</code> if a cannabis consent by property owner with the primary key could not be found
	 */
	public CannabisConsentByPropertyOwner fetchByPrimaryKey(long cannabisCPOId);

	/**
	 * Returns all the cannabis consent by property owners.
	 *
	 * @return the cannabis consent by property owners
	 */
	public java.util.List<CannabisConsentByPropertyOwner> findAll();

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
	public java.util.List<CannabisConsentByPropertyOwner> findAll(
		int start, int end);

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
	public java.util.List<CannabisConsentByPropertyOwner> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConsentByPropertyOwner> orderByComparator);

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
	public java.util.List<CannabisConsentByPropertyOwner> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConsentByPropertyOwner> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis consent by property owners from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis consent by property owners.
	 *
	 * @return the number of cannabis consent by property owners
	 */
	public int countAll();

}