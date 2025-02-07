/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisSupplementalInformationException;
import com.nbp.cannabis.application.form.services.model.CannabisSupplementalInformation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis supplemental information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisSupplementalInformationUtil
 * @generated
 */
@ProviderType
public interface CannabisSupplementalInformationPersistence
	extends BasePersistence<CannabisSupplementalInformation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisSupplementalInformationUtil} to access the cannabis supplemental information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cannabis supplemental informations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis supplemental informations
	 */
	public java.util.List<CannabisSupplementalInformation> findByUuid(
		String uuid);

	/**
	 * Returns a range of all the cannabis supplemental informations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @return the range of matching cannabis supplemental informations
	 */
	public java.util.List<CannabisSupplementalInformation> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis supplemental informations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis supplemental informations
	 */
	public java.util.List<CannabisSupplementalInformation> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisSupplementalInformation> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis supplemental informations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis supplemental informations
	 */
	public java.util.List<CannabisSupplementalInformation> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisSupplementalInformation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis supplemental information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a matching cannabis supplemental information could not be found
	 */
	public CannabisSupplementalInformation findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisSupplementalInformation> orderByComparator)
		throws NoSuchCannabisSupplementalInformationException;

	/**
	 * Returns the first cannabis supplemental information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	public CannabisSupplementalInformation fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisSupplementalInformation> orderByComparator);

	/**
	 * Returns the last cannabis supplemental information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a matching cannabis supplemental information could not be found
	 */
	public CannabisSupplementalInformation findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisSupplementalInformation> orderByComparator)
		throws NoSuchCannabisSupplementalInformationException;

	/**
	 * Returns the last cannabis supplemental information in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	public CannabisSupplementalInformation fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisSupplementalInformation> orderByComparator);

	/**
	 * Returns the cannabis supplemental informations before and after the current cannabis supplemental information in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisSupplementalInfoId the primary key of the current cannabis supplemental information
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a cannabis supplemental information with the primary key could not be found
	 */
	public CannabisSupplementalInformation[] findByUuid_PrevAndNext(
			long cannabisSupplementalInfoId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisSupplementalInformation> orderByComparator)
		throws NoSuchCannabisSupplementalInformationException;

	/**
	 * Removes all the cannabis supplemental informations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of cannabis supplemental informations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis supplemental informations
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the cannabis supplemental information where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisSupplementalInformationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a matching cannabis supplemental information could not be found
	 */
	public CannabisSupplementalInformation findByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisSupplementalInformationException;

	/**
	 * Returns the cannabis supplemental information where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	public CannabisSupplementalInformation fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the cannabis supplemental information where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	public CannabisSupplementalInformation fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the cannabis supplemental information where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis supplemental information that was removed
	 */
	public CannabisSupplementalInformation removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisSupplementalInformationException;

	/**
	 * Returns the number of cannabis supplemental informations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis supplemental informations
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the cannabis supplemental informations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis supplemental informations
	 */
	public java.util.List<CannabisSupplementalInformation> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the cannabis supplemental informations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @return the range of matching cannabis supplemental informations
	 */
	public java.util.List<CannabisSupplementalInformation> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis supplemental informations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis supplemental informations
	 */
	public java.util.List<CannabisSupplementalInformation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisSupplementalInformation> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis supplemental informations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis supplemental informations
	 */
	public java.util.List<CannabisSupplementalInformation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisSupplementalInformation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis supplemental information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a matching cannabis supplemental information could not be found
	 */
	public CannabisSupplementalInformation findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisSupplementalInformation> orderByComparator)
		throws NoSuchCannabisSupplementalInformationException;

	/**
	 * Returns the first cannabis supplemental information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	public CannabisSupplementalInformation fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisSupplementalInformation> orderByComparator);

	/**
	 * Returns the last cannabis supplemental information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a matching cannabis supplemental information could not be found
	 */
	public CannabisSupplementalInformation findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisSupplementalInformation> orderByComparator)
		throws NoSuchCannabisSupplementalInformationException;

	/**
	 * Returns the last cannabis supplemental information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	public CannabisSupplementalInformation fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisSupplementalInformation> orderByComparator);

	/**
	 * Returns the cannabis supplemental informations before and after the current cannabis supplemental information in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cannabisSupplementalInfoId the primary key of the current cannabis supplemental information
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a cannabis supplemental information with the primary key could not be found
	 */
	public CannabisSupplementalInformation[] findByUuid_C_PrevAndNext(
			long cannabisSupplementalInfoId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisSupplementalInformation> orderByComparator)
		throws NoSuchCannabisSupplementalInformationException;

	/**
	 * Removes all the cannabis supplemental informations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of cannabis supplemental informations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis supplemental informations
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the cannabis supplemental informations where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis supplemental informations
	 */
	public java.util.List<CannabisSupplementalInformation> findBygetCA_SI_CAI(
		long cannabisApplicationId);

	/**
	 * Returns a range of all the cannabis supplemental informations where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @return the range of matching cannabis supplemental informations
	 */
	public java.util.List<CannabisSupplementalInformation> findBygetCA_SI_CAI(
		long cannabisApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis supplemental informations where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis supplemental informations
	 */
	public java.util.List<CannabisSupplementalInformation> findBygetCA_SI_CAI(
		long cannabisApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisSupplementalInformation> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis supplemental informations where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis supplemental informations
	 */
	public java.util.List<CannabisSupplementalInformation> findBygetCA_SI_CAI(
		long cannabisApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisSupplementalInformation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis supplemental information in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a matching cannabis supplemental information could not be found
	 */
	public CannabisSupplementalInformation findBygetCA_SI_CAI_First(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisSupplementalInformation> orderByComparator)
		throws NoSuchCannabisSupplementalInformationException;

	/**
	 * Returns the first cannabis supplemental information in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	public CannabisSupplementalInformation fetchBygetCA_SI_CAI_First(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisSupplementalInformation> orderByComparator);

	/**
	 * Returns the last cannabis supplemental information in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a matching cannabis supplemental information could not be found
	 */
	public CannabisSupplementalInformation findBygetCA_SI_CAI_Last(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisSupplementalInformation> orderByComparator)
		throws NoSuchCannabisSupplementalInformationException;

	/**
	 * Returns the last cannabis supplemental information in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis supplemental information, or <code>null</code> if a matching cannabis supplemental information could not be found
	 */
	public CannabisSupplementalInformation fetchBygetCA_SI_CAI_Last(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisSupplementalInformation> orderByComparator);

	/**
	 * Returns the cannabis supplemental informations before and after the current cannabis supplemental information in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisSupplementalInfoId the primary key of the current cannabis supplemental information
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a cannabis supplemental information with the primary key could not be found
	 */
	public CannabisSupplementalInformation[] findBygetCA_SI_CAI_PrevAndNext(
			long cannabisSupplementalInfoId, long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisSupplementalInformation> orderByComparator)
		throws NoSuchCannabisSupplementalInformationException;

	/**
	 * Removes all the cannabis supplemental informations where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public void removeBygetCA_SI_CAI(long cannabisApplicationId);

	/**
	 * Returns the number of cannabis supplemental informations where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis supplemental informations
	 */
	public int countBygetCA_SI_CAI(long cannabisApplicationId);

	/**
	 * Caches the cannabis supplemental information in the entity cache if it is enabled.
	 *
	 * @param cannabisSupplementalInformation the cannabis supplemental information
	 */
	public void cacheResult(
		CannabisSupplementalInformation cannabisSupplementalInformation);

	/**
	 * Caches the cannabis supplemental informations in the entity cache if it is enabled.
	 *
	 * @param cannabisSupplementalInformations the cannabis supplemental informations
	 */
	public void cacheResult(
		java.util.List<CannabisSupplementalInformation>
			cannabisSupplementalInformations);

	/**
	 * Creates a new cannabis supplemental information with the primary key. Does not add the cannabis supplemental information to the database.
	 *
	 * @param cannabisSupplementalInfoId the primary key for the new cannabis supplemental information
	 * @return the new cannabis supplemental information
	 */
	public CannabisSupplementalInformation create(
		long cannabisSupplementalInfoId);

	/**
	 * Removes the cannabis supplemental information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisSupplementalInfoId the primary key of the cannabis supplemental information
	 * @return the cannabis supplemental information that was removed
	 * @throws NoSuchCannabisSupplementalInformationException if a cannabis supplemental information with the primary key could not be found
	 */
	public CannabisSupplementalInformation remove(
			long cannabisSupplementalInfoId)
		throws NoSuchCannabisSupplementalInformationException;

	public CannabisSupplementalInformation updateImpl(
		CannabisSupplementalInformation cannabisSupplementalInformation);

	/**
	 * Returns the cannabis supplemental information with the primary key or throws a <code>NoSuchCannabisSupplementalInformationException</code> if it could not be found.
	 *
	 * @param cannabisSupplementalInfoId the primary key of the cannabis supplemental information
	 * @return the cannabis supplemental information
	 * @throws NoSuchCannabisSupplementalInformationException if a cannabis supplemental information with the primary key could not be found
	 */
	public CannabisSupplementalInformation findByPrimaryKey(
			long cannabisSupplementalInfoId)
		throws NoSuchCannabisSupplementalInformationException;

	/**
	 * Returns the cannabis supplemental information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisSupplementalInfoId the primary key of the cannabis supplemental information
	 * @return the cannabis supplemental information, or <code>null</code> if a cannabis supplemental information with the primary key could not be found
	 */
	public CannabisSupplementalInformation fetchByPrimaryKey(
		long cannabisSupplementalInfoId);

	/**
	 * Returns all the cannabis supplemental informations.
	 *
	 * @return the cannabis supplemental informations
	 */
	public java.util.List<CannabisSupplementalInformation> findAll();

	/**
	 * Returns a range of all the cannabis supplemental informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @return the range of cannabis supplemental informations
	 */
	public java.util.List<CannabisSupplementalInformation> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the cannabis supplemental informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis supplemental informations
	 */
	public java.util.List<CannabisSupplementalInformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisSupplementalInformation> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis supplemental informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisSupplementalInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis supplemental informations
	 * @param end the upper bound of the range of cannabis supplemental informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis supplemental informations
	 */
	public java.util.List<CannabisSupplementalInformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisSupplementalInformation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis supplemental informations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis supplemental informations.
	 *
	 * @return the number of cannabis supplemental informations
	 */
	public int countAll();

}