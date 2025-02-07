/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisApplicationIndividualAddressException;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationIndividualAddress;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis application individual address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationIndividualAddressUtil
 * @generated
 */
@ProviderType
public interface CannabisApplicationIndividualAddressPersistence
	extends BasePersistence<CannabisApplicationIndividualAddress> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisApplicationIndividualAddressUtil} to access the cannabis application individual address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cannabis application individual addresses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis application individual addresses
	 */
	public java.util.List<CannabisApplicationIndividualAddress> findByUuid(
		String uuid);

	/**
	 * Returns a range of all the cannabis application individual addresses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @return the range of matching cannabis application individual addresses
	 */
	public java.util.List<CannabisApplicationIndividualAddress> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application individual addresses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application individual addresses
	 */
	public java.util.List<CannabisApplicationIndividualAddress> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationIndividualAddress> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application individual addresses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application individual addresses
	 */
	public java.util.List<CannabisApplicationIndividualAddress> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationIndividualAddress> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis application individual address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	public CannabisApplicationIndividualAddress findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationIndividualAddress> orderByComparator)
		throws NoSuchCannabisApplicationIndividualAddressException;

	/**
	 * Returns the first cannabis application individual address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	public CannabisApplicationIndividualAddress fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationIndividualAddress> orderByComparator);

	/**
	 * Returns the last cannabis application individual address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	public CannabisApplicationIndividualAddress findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationIndividualAddress> orderByComparator)
		throws NoSuchCannabisApplicationIndividualAddressException;

	/**
	 * Returns the last cannabis application individual address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	public CannabisApplicationIndividualAddress fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationIndividualAddress> orderByComparator);

	/**
	 * Returns the cannabis application individual addresses before and after the current cannabis application individual address in the ordered set where uuid = &#63;.
	 *
	 * @param IndividualAddressId the primary key of the current cannabis application individual address
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a cannabis application individual address with the primary key could not be found
	 */
	public CannabisApplicationIndividualAddress[] findByUuid_PrevAndNext(
			long IndividualAddressId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationIndividualAddress> orderByComparator)
		throws NoSuchCannabisApplicationIndividualAddressException;

	/**
	 * Removes all the cannabis application individual addresses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of cannabis application individual addresses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis application individual addresses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the cannabis application individual address where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisApplicationIndividualAddressException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	public CannabisApplicationIndividualAddress findByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisApplicationIndividualAddressException;

	/**
	 * Returns the cannabis application individual address where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	public CannabisApplicationIndividualAddress fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the cannabis application individual address where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	public CannabisApplicationIndividualAddress fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the cannabis application individual address where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis application individual address that was removed
	 */
	public CannabisApplicationIndividualAddress removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisApplicationIndividualAddressException;

	/**
	 * Returns the number of cannabis application individual addresses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis application individual addresses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the cannabis application individual addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis application individual addresses
	 */
	public java.util.List<CannabisApplicationIndividualAddress> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the cannabis application individual addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @return the range of matching cannabis application individual addresses
	 */
	public java.util.List<CannabisApplicationIndividualAddress> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application individual addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application individual addresses
	 */
	public java.util.List<CannabisApplicationIndividualAddress> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationIndividualAddress> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application individual addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application individual addresses
	 */
	public java.util.List<CannabisApplicationIndividualAddress> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationIndividualAddress> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis application individual address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	public CannabisApplicationIndividualAddress findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationIndividualAddress> orderByComparator)
		throws NoSuchCannabisApplicationIndividualAddressException;

	/**
	 * Returns the first cannabis application individual address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	public CannabisApplicationIndividualAddress fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationIndividualAddress> orderByComparator);

	/**
	 * Returns the last cannabis application individual address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	public CannabisApplicationIndividualAddress findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationIndividualAddress> orderByComparator)
		throws NoSuchCannabisApplicationIndividualAddressException;

	/**
	 * Returns the last cannabis application individual address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	public CannabisApplicationIndividualAddress fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationIndividualAddress> orderByComparator);

	/**
	 * Returns the cannabis application individual addresses before and after the current cannabis application individual address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param IndividualAddressId the primary key of the current cannabis application individual address
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a cannabis application individual address with the primary key could not be found
	 */
	public CannabisApplicationIndividualAddress[] findByUuid_C_PrevAndNext(
			long IndividualAddressId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationIndividualAddress> orderByComparator)
		throws NoSuchCannabisApplicationIndividualAddressException;

	/**
	 * Removes all the cannabis application individual addresses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of cannabis application individual addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis application individual addresses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the cannabis application individual address where addressType = &#63; and individualInformationId = &#63; or throws a <code>NoSuchCannabisApplicationIndividualAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param individualInformationId the individual information ID
	 * @return the matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	public CannabisApplicationIndividualAddress findBygetCA_CA_by_CI_AT(
			String addressType, long individualInformationId)
		throws NoSuchCannabisApplicationIndividualAddressException;

	/**
	 * Returns the cannabis application individual address where addressType = &#63; and individualInformationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param individualInformationId the individual information ID
	 * @return the matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	public CannabisApplicationIndividualAddress fetchBygetCA_CA_by_CI_AT(
		String addressType, long individualInformationId);

	/**
	 * Returns the cannabis application individual address where addressType = &#63; and individualInformationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param individualInformationId the individual information ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	public CannabisApplicationIndividualAddress fetchBygetCA_CA_by_CI_AT(
		String addressType, long individualInformationId,
		boolean useFinderCache);

	/**
	 * Removes the cannabis application individual address where addressType = &#63; and individualInformationId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param individualInformationId the individual information ID
	 * @return the cannabis application individual address that was removed
	 */
	public CannabisApplicationIndividualAddress removeBygetCA_CA_by_CI_AT(
			String addressType, long individualInformationId)
		throws NoSuchCannabisApplicationIndividualAddressException;

	/**
	 * Returns the number of cannabis application individual addresses where addressType = &#63; and individualInformationId = &#63;.
	 *
	 * @param addressType the address type
	 * @param individualInformationId the individual information ID
	 * @return the number of matching cannabis application individual addresses
	 */
	public int countBygetCA_CA_by_CI_AT(
		String addressType, long individualInformationId);

	/**
	 * Returns all the cannabis application individual addresses where individualInformationId = &#63;.
	 *
	 * @param individualInformationId the individual information ID
	 * @return the matching cannabis application individual addresses
	 */
	public java.util.List<CannabisApplicationIndividualAddress>
		findBygetCA_CA_by_CI(long individualInformationId);

	/**
	 * Returns a range of all the cannabis application individual addresses where individualInformationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param individualInformationId the individual information ID
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @return the range of matching cannabis application individual addresses
	 */
	public java.util.List<CannabisApplicationIndividualAddress>
		findBygetCA_CA_by_CI(long individualInformationId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application individual addresses where individualInformationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param individualInformationId the individual information ID
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application individual addresses
	 */
	public java.util.List<CannabisApplicationIndividualAddress>
		findBygetCA_CA_by_CI(
			long individualInformationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationIndividualAddress> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application individual addresses where individualInformationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param individualInformationId the individual information ID
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application individual addresses
	 */
	public java.util.List<CannabisApplicationIndividualAddress>
		findBygetCA_CA_by_CI(
			long individualInformationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationIndividualAddress> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis application individual address in the ordered set where individualInformationId = &#63;.
	 *
	 * @param individualInformationId the individual information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	public CannabisApplicationIndividualAddress findBygetCA_CA_by_CI_First(
			long individualInformationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationIndividualAddress> orderByComparator)
		throws NoSuchCannabisApplicationIndividualAddressException;

	/**
	 * Returns the first cannabis application individual address in the ordered set where individualInformationId = &#63;.
	 *
	 * @param individualInformationId the individual information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	public CannabisApplicationIndividualAddress fetchBygetCA_CA_by_CI_First(
		long individualInformationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationIndividualAddress> orderByComparator);

	/**
	 * Returns the last cannabis application individual address in the ordered set where individualInformationId = &#63;.
	 *
	 * @param individualInformationId the individual information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	public CannabisApplicationIndividualAddress findBygetCA_CA_by_CI_Last(
			long individualInformationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationIndividualAddress> orderByComparator)
		throws NoSuchCannabisApplicationIndividualAddressException;

	/**
	 * Returns the last cannabis application individual address in the ordered set where individualInformationId = &#63;.
	 *
	 * @param individualInformationId the individual information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	public CannabisApplicationIndividualAddress fetchBygetCA_CA_by_CI_Last(
		long individualInformationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationIndividualAddress> orderByComparator);

	/**
	 * Returns the cannabis application individual addresses before and after the current cannabis application individual address in the ordered set where individualInformationId = &#63;.
	 *
	 * @param IndividualAddressId the primary key of the current cannabis application individual address
	 * @param individualInformationId the individual information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a cannabis application individual address with the primary key could not be found
	 */
	public CannabisApplicationIndividualAddress[]
			findBygetCA_CA_by_CI_PrevAndNext(
				long IndividualAddressId, long individualInformationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisApplicationIndividualAddress> orderByComparator)
		throws NoSuchCannabisApplicationIndividualAddressException;

	/**
	 * Removes all the cannabis application individual addresses where individualInformationId = &#63; from the database.
	 *
	 * @param individualInformationId the individual information ID
	 */
	public void removeBygetCA_CA_by_CI(long individualInformationId);

	/**
	 * Returns the number of cannabis application individual addresses where individualInformationId = &#63;.
	 *
	 * @param individualInformationId the individual information ID
	 * @return the number of matching cannabis application individual addresses
	 */
	public int countBygetCA_CA_by_CI(long individualInformationId);

	/**
	 * Caches the cannabis application individual address in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationIndividualAddress the cannabis application individual address
	 */
	public void cacheResult(
		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress);

	/**
	 * Caches the cannabis application individual addresses in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationIndividualAddresses the cannabis application individual addresses
	 */
	public void cacheResult(
		java.util.List<CannabisApplicationIndividualAddress>
			cannabisApplicationIndividualAddresses);

	/**
	 * Creates a new cannabis application individual address with the primary key. Does not add the cannabis application individual address to the database.
	 *
	 * @param IndividualAddressId the primary key for the new cannabis application individual address
	 * @return the new cannabis application individual address
	 */
	public CannabisApplicationIndividualAddress create(
		long IndividualAddressId);

	/**
	 * Removes the cannabis application individual address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param IndividualAddressId the primary key of the cannabis application individual address
	 * @return the cannabis application individual address that was removed
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a cannabis application individual address with the primary key could not be found
	 */
	public CannabisApplicationIndividualAddress remove(long IndividualAddressId)
		throws NoSuchCannabisApplicationIndividualAddressException;

	public CannabisApplicationIndividualAddress updateImpl(
		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress);

	/**
	 * Returns the cannabis application individual address with the primary key or throws a <code>NoSuchCannabisApplicationIndividualAddressException</code> if it could not be found.
	 *
	 * @param IndividualAddressId the primary key of the cannabis application individual address
	 * @return the cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a cannabis application individual address with the primary key could not be found
	 */
	public CannabisApplicationIndividualAddress findByPrimaryKey(
			long IndividualAddressId)
		throws NoSuchCannabisApplicationIndividualAddressException;

	/**
	 * Returns the cannabis application individual address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param IndividualAddressId the primary key of the cannabis application individual address
	 * @return the cannabis application individual address, or <code>null</code> if a cannabis application individual address with the primary key could not be found
	 */
	public CannabisApplicationIndividualAddress fetchByPrimaryKey(
		long IndividualAddressId);

	/**
	 * Returns all the cannabis application individual addresses.
	 *
	 * @return the cannabis application individual addresses
	 */
	public java.util.List<CannabisApplicationIndividualAddress> findAll();

	/**
	 * Returns a range of all the cannabis application individual addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @return the range of cannabis application individual addresses
	 */
	public java.util.List<CannabisApplicationIndividualAddress> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application individual addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application individual addresses
	 */
	public java.util.List<CannabisApplicationIndividualAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationIndividualAddress> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application individual addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application individual addresses
	 */
	public java.util.List<CannabisApplicationIndividualAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationIndividualAddress> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis application individual addresses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis application individual addresses.
	 *
	 * @return the number of cannabis application individual addresses
	 */
	public int countAll();

}