/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisApplicationCompanyAddressException;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationCompanyAddress;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis application company address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCompanyAddressUtil
 * @generated
 */
@ProviderType
public interface CannabisApplicationCompanyAddressPersistence
	extends BasePersistence<CannabisApplicationCompanyAddress> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisApplicationCompanyAddressUtil} to access the cannabis application company address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cannabis application company addresses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis application company addresses
	 */
	public java.util.List<CannabisApplicationCompanyAddress> findByUuid(
		String uuid);

	/**
	 * Returns a range of all the cannabis application company addresses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @return the range of matching cannabis application company addresses
	 */
	public java.util.List<CannabisApplicationCompanyAddress> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application company addresses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application company addresses
	 */
	public java.util.List<CannabisApplicationCompanyAddress> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyAddress> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application company addresses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application company addresses
	 */
	public java.util.List<CannabisApplicationCompanyAddress> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyAddress> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis application company address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	public CannabisApplicationCompanyAddress findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyAddress> orderByComparator)
		throws NoSuchCannabisApplicationCompanyAddressException;

	/**
	 * Returns the first cannabis application company address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	public CannabisApplicationCompanyAddress fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyAddress> orderByComparator);

	/**
	 * Returns the last cannabis application company address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	public CannabisApplicationCompanyAddress findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyAddress> orderByComparator)
		throws NoSuchCannabisApplicationCompanyAddressException;

	/**
	 * Returns the last cannabis application company address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	public CannabisApplicationCompanyAddress fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyAddress> orderByComparator);

	/**
	 * Returns the cannabis application company addresses before and after the current cannabis application company address in the ordered set where uuid = &#63;.
	 *
	 * @param companyAddressId the primary key of the current cannabis application company address
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a cannabis application company address with the primary key could not be found
	 */
	public CannabisApplicationCompanyAddress[] findByUuid_PrevAndNext(
			long companyAddressId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyAddress> orderByComparator)
		throws NoSuchCannabisApplicationCompanyAddressException;

	/**
	 * Removes all the cannabis application company addresses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of cannabis application company addresses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis application company addresses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the cannabis application company address where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisApplicationCompanyAddressException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	public CannabisApplicationCompanyAddress findByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisApplicationCompanyAddressException;

	/**
	 * Returns the cannabis application company address where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	public CannabisApplicationCompanyAddress fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the cannabis application company address where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	public CannabisApplicationCompanyAddress fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the cannabis application company address where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis application company address that was removed
	 */
	public CannabisApplicationCompanyAddress removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisApplicationCompanyAddressException;

	/**
	 * Returns the number of cannabis application company addresses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis application company addresses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the cannabis application company addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis application company addresses
	 */
	public java.util.List<CannabisApplicationCompanyAddress> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the cannabis application company addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @return the range of matching cannabis application company addresses
	 */
	public java.util.List<CannabisApplicationCompanyAddress> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application company addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application company addresses
	 */
	public java.util.List<CannabisApplicationCompanyAddress> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyAddress> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application company addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application company addresses
	 */
	public java.util.List<CannabisApplicationCompanyAddress> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyAddress> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis application company address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	public CannabisApplicationCompanyAddress findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyAddress> orderByComparator)
		throws NoSuchCannabisApplicationCompanyAddressException;

	/**
	 * Returns the first cannabis application company address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	public CannabisApplicationCompanyAddress fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyAddress> orderByComparator);

	/**
	 * Returns the last cannabis application company address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	public CannabisApplicationCompanyAddress findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyAddress> orderByComparator)
		throws NoSuchCannabisApplicationCompanyAddressException;

	/**
	 * Returns the last cannabis application company address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	public CannabisApplicationCompanyAddress fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyAddress> orderByComparator);

	/**
	 * Returns the cannabis application company addresses before and after the current cannabis application company address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param companyAddressId the primary key of the current cannabis application company address
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a cannabis application company address with the primary key could not be found
	 */
	public CannabisApplicationCompanyAddress[] findByUuid_C_PrevAndNext(
			long companyAddressId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyAddress> orderByComparator)
		throws NoSuchCannabisApplicationCompanyAddressException;

	/**
	 * Removes all the cannabis application company addresses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of cannabis application company addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis application company addresses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the cannabis application company address where addressType = &#63; and companyInformationId = &#63; or throws a <code>NoSuchCannabisApplicationCompanyAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param companyInformationId the company information ID
	 * @return the matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	public CannabisApplicationCompanyAddress findBygetCA_CA_by_CI_AT(
			String addressType, long companyInformationId)
		throws NoSuchCannabisApplicationCompanyAddressException;

	/**
	 * Returns the cannabis application company address where addressType = &#63; and companyInformationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param companyInformationId the company information ID
	 * @return the matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	public CannabisApplicationCompanyAddress fetchBygetCA_CA_by_CI_AT(
		String addressType, long companyInformationId);

	/**
	 * Returns the cannabis application company address where addressType = &#63; and companyInformationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param companyInformationId the company information ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	public CannabisApplicationCompanyAddress fetchBygetCA_CA_by_CI_AT(
		String addressType, long companyInformationId, boolean useFinderCache);

	/**
	 * Removes the cannabis application company address where addressType = &#63; and companyInformationId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param companyInformationId the company information ID
	 * @return the cannabis application company address that was removed
	 */
	public CannabisApplicationCompanyAddress removeBygetCA_CA_by_CI_AT(
			String addressType, long companyInformationId)
		throws NoSuchCannabisApplicationCompanyAddressException;

	/**
	 * Returns the number of cannabis application company addresses where addressType = &#63; and companyInformationId = &#63;.
	 *
	 * @param addressType the address type
	 * @param companyInformationId the company information ID
	 * @return the number of matching cannabis application company addresses
	 */
	public int countBygetCA_CA_by_CI_AT(
		String addressType, long companyInformationId);

	/**
	 * Returns all the cannabis application company addresses where companyInformationId = &#63;.
	 *
	 * @param companyInformationId the company information ID
	 * @return the matching cannabis application company addresses
	 */
	public java.util.List<CannabisApplicationCompanyAddress>
		findBygetCA_CA_by_CI(long companyInformationId);

	/**
	 * Returns a range of all the cannabis application company addresses where companyInformationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param companyInformationId the company information ID
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @return the range of matching cannabis application company addresses
	 */
	public java.util.List<CannabisApplicationCompanyAddress>
		findBygetCA_CA_by_CI(long companyInformationId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application company addresses where companyInformationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param companyInformationId the company information ID
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application company addresses
	 */
	public java.util.List<CannabisApplicationCompanyAddress>
		findBygetCA_CA_by_CI(
			long companyInformationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyAddress> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application company addresses where companyInformationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param companyInformationId the company information ID
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application company addresses
	 */
	public java.util.List<CannabisApplicationCompanyAddress>
		findBygetCA_CA_by_CI(
			long companyInformationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyAddress> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis application company address in the ordered set where companyInformationId = &#63;.
	 *
	 * @param companyInformationId the company information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	public CannabisApplicationCompanyAddress findBygetCA_CA_by_CI_First(
			long companyInformationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyAddress> orderByComparator)
		throws NoSuchCannabisApplicationCompanyAddressException;

	/**
	 * Returns the first cannabis application company address in the ordered set where companyInformationId = &#63;.
	 *
	 * @param companyInformationId the company information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	public CannabisApplicationCompanyAddress fetchBygetCA_CA_by_CI_First(
		long companyInformationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyAddress> orderByComparator);

	/**
	 * Returns the last cannabis application company address in the ordered set where companyInformationId = &#63;.
	 *
	 * @param companyInformationId the company information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	public CannabisApplicationCompanyAddress findBygetCA_CA_by_CI_Last(
			long companyInformationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyAddress> orderByComparator)
		throws NoSuchCannabisApplicationCompanyAddressException;

	/**
	 * Returns the last cannabis application company address in the ordered set where companyInformationId = &#63;.
	 *
	 * @param companyInformationId the company information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	public CannabisApplicationCompanyAddress fetchBygetCA_CA_by_CI_Last(
		long companyInformationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyAddress> orderByComparator);

	/**
	 * Returns the cannabis application company addresses before and after the current cannabis application company address in the ordered set where companyInformationId = &#63;.
	 *
	 * @param companyAddressId the primary key of the current cannabis application company address
	 * @param companyInformationId the company information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a cannabis application company address with the primary key could not be found
	 */
	public CannabisApplicationCompanyAddress[] findBygetCA_CA_by_CI_PrevAndNext(
			long companyAddressId, long companyInformationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCompanyAddress> orderByComparator)
		throws NoSuchCannabisApplicationCompanyAddressException;

	/**
	 * Removes all the cannabis application company addresses where companyInformationId = &#63; from the database.
	 *
	 * @param companyInformationId the company information ID
	 */
	public void removeBygetCA_CA_by_CI(long companyInformationId);

	/**
	 * Returns the number of cannabis application company addresses where companyInformationId = &#63;.
	 *
	 * @param companyInformationId the company information ID
	 * @return the number of matching cannabis application company addresses
	 */
	public int countBygetCA_CA_by_CI(long companyInformationId);

	/**
	 * Caches the cannabis application company address in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationCompanyAddress the cannabis application company address
	 */
	public void cacheResult(
		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress);

	/**
	 * Caches the cannabis application company addresses in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationCompanyAddresses the cannabis application company addresses
	 */
	public void cacheResult(
		java.util.List<CannabisApplicationCompanyAddress>
			cannabisApplicationCompanyAddresses);

	/**
	 * Creates a new cannabis application company address with the primary key. Does not add the cannabis application company address to the database.
	 *
	 * @param companyAddressId the primary key for the new cannabis application company address
	 * @return the new cannabis application company address
	 */
	public CannabisApplicationCompanyAddress create(long companyAddressId);

	/**
	 * Removes the cannabis application company address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companyAddressId the primary key of the cannabis application company address
	 * @return the cannabis application company address that was removed
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a cannabis application company address with the primary key could not be found
	 */
	public CannabisApplicationCompanyAddress remove(long companyAddressId)
		throws NoSuchCannabisApplicationCompanyAddressException;

	public CannabisApplicationCompanyAddress updateImpl(
		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress);

	/**
	 * Returns the cannabis application company address with the primary key or throws a <code>NoSuchCannabisApplicationCompanyAddressException</code> if it could not be found.
	 *
	 * @param companyAddressId the primary key of the cannabis application company address
	 * @return the cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a cannabis application company address with the primary key could not be found
	 */
	public CannabisApplicationCompanyAddress findByPrimaryKey(
			long companyAddressId)
		throws NoSuchCannabisApplicationCompanyAddressException;

	/**
	 * Returns the cannabis application company address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companyAddressId the primary key of the cannabis application company address
	 * @return the cannabis application company address, or <code>null</code> if a cannabis application company address with the primary key could not be found
	 */
	public CannabisApplicationCompanyAddress fetchByPrimaryKey(
		long companyAddressId);

	/**
	 * Returns all the cannabis application company addresses.
	 *
	 * @return the cannabis application company addresses
	 */
	public java.util.List<CannabisApplicationCompanyAddress> findAll();

	/**
	 * Returns a range of all the cannabis application company addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @return the range of cannabis application company addresses
	 */
	public java.util.List<CannabisApplicationCompanyAddress> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application company addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application company addresses
	 */
	public java.util.List<CannabisApplicationCompanyAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyAddress> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application company addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application company addresses
	 */
	public java.util.List<CannabisApplicationCompanyAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCompanyAddress> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis application company addresses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis application company addresses.
	 *
	 * @return the number of cannabis application company addresses
	 */
	public int countAll();

}