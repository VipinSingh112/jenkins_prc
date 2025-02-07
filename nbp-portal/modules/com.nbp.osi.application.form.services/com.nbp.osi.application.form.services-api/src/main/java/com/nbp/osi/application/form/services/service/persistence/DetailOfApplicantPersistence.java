/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.application.form.services.exception.NoSuchDetailOfApplicantException;
import com.nbp.osi.application.form.services.model.DetailOfApplicant;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the detail of applicant service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfApplicantUtil
 * @generated
 */
@ProviderType
public interface DetailOfApplicantPersistence
	extends BasePersistence<DetailOfApplicant> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DetailOfApplicantUtil} to access the detail of applicant persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the detail of applicants where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching detail of applicants
	 */
	public java.util.List<DetailOfApplicant> findByUuid(String uuid);

	/**
	 * Returns a range of all the detail of applicants where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @return the range of matching detail of applicants
	 */
	public java.util.List<DetailOfApplicant> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the detail of applicants where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching detail of applicants
	 */
	public java.util.List<DetailOfApplicant> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DetailOfApplicant>
			orderByComparator);

	/**
	 * Returns an ordered range of all the detail of applicants where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching detail of applicants
	 */
	public java.util.List<DetailOfApplicant> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DetailOfApplicant>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first detail of applicant in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a matching detail of applicant could not be found
	 */
	public DetailOfApplicant findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<DetailOfApplicant>
				orderByComparator)
		throws NoSuchDetailOfApplicantException;

	/**
	 * Returns the first detail of applicant in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	public DetailOfApplicant fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DetailOfApplicant>
			orderByComparator);

	/**
	 * Returns the last detail of applicant in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a matching detail of applicant could not be found
	 */
	public DetailOfApplicant findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<DetailOfApplicant>
				orderByComparator)
		throws NoSuchDetailOfApplicantException;

	/**
	 * Returns the last detail of applicant in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	public DetailOfApplicant fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DetailOfApplicant>
			orderByComparator);

	/**
	 * Returns the detail of applicants before and after the current detail of applicant in the ordered set where uuid = &#63;.
	 *
	 * @param detailOfApplicantId the primary key of the current detail of applicant
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a detail of applicant with the primary key could not be found
	 */
	public DetailOfApplicant[] findByUuid_PrevAndNext(
			long detailOfApplicantId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<DetailOfApplicant>
				orderByComparator)
		throws NoSuchDetailOfApplicantException;

	/**
	 * Removes all the detail of applicants where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of detail of applicants where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching detail of applicants
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the detail of applicant where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDetailOfApplicantException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a matching detail of applicant could not be found
	 */
	public DetailOfApplicant findByUUID_G(String uuid, long groupId)
		throws NoSuchDetailOfApplicantException;

	/**
	 * Returns the detail of applicant where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	public DetailOfApplicant fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the detail of applicant where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	public DetailOfApplicant fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the detail of applicant where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the detail of applicant that was removed
	 */
	public DetailOfApplicant removeByUUID_G(String uuid, long groupId)
		throws NoSuchDetailOfApplicantException;

	/**
	 * Returns the number of detail of applicants where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching detail of applicants
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the detail of applicants where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching detail of applicants
	 */
	public java.util.List<DetailOfApplicant> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the detail of applicants where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @return the range of matching detail of applicants
	 */
	public java.util.List<DetailOfApplicant> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the detail of applicants where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching detail of applicants
	 */
	public java.util.List<DetailOfApplicant> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DetailOfApplicant>
			orderByComparator);

	/**
	 * Returns an ordered range of all the detail of applicants where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching detail of applicants
	 */
	public java.util.List<DetailOfApplicant> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DetailOfApplicant>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first detail of applicant in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a matching detail of applicant could not be found
	 */
	public DetailOfApplicant findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<DetailOfApplicant>
				orderByComparator)
		throws NoSuchDetailOfApplicantException;

	/**
	 * Returns the first detail of applicant in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	public DetailOfApplicant fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DetailOfApplicant>
			orderByComparator);

	/**
	 * Returns the last detail of applicant in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a matching detail of applicant could not be found
	 */
	public DetailOfApplicant findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<DetailOfApplicant>
				orderByComparator)
		throws NoSuchDetailOfApplicantException;

	/**
	 * Returns the last detail of applicant in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	public DetailOfApplicant fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DetailOfApplicant>
			orderByComparator);

	/**
	 * Returns the detail of applicants before and after the current detail of applicant in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param detailOfApplicantId the primary key of the current detail of applicant
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a detail of applicant with the primary key could not be found
	 */
	public DetailOfApplicant[] findByUuid_C_PrevAndNext(
			long detailOfApplicantId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<DetailOfApplicant>
				orderByComparator)
		throws NoSuchDetailOfApplicantException;

	/**
	 * Removes all the detail of applicants where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of detail of applicants where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching detail of applicants
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the detail of applicant where osiApplicationId = &#63; or throws a <code>NoSuchDetailOfApplicantException</code> if it could not be found.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a matching detail of applicant could not be found
	 */
	public DetailOfApplicant findBygetOsiById(long osiApplicationId)
		throws NoSuchDetailOfApplicantException;

	/**
	 * Returns the detail of applicant where osiApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	public DetailOfApplicant fetchBygetOsiById(long osiApplicationId);

	/**
	 * Returns the detail of applicant where osiApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	public DetailOfApplicant fetchBygetOsiById(
		long osiApplicationId, boolean useFinderCache);

	/**
	 * Removes the detail of applicant where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the detail of applicant that was removed
	 */
	public DetailOfApplicant removeBygetOsiById(long osiApplicationId)
		throws NoSuchDetailOfApplicantException;

	/**
	 * Returns the number of detail of applicants where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching detail of applicants
	 */
	public int countBygetOsiById(long osiApplicationId);

	/**
	 * Caches the detail of applicant in the entity cache if it is enabled.
	 *
	 * @param detailOfApplicant the detail of applicant
	 */
	public void cacheResult(DetailOfApplicant detailOfApplicant);

	/**
	 * Caches the detail of applicants in the entity cache if it is enabled.
	 *
	 * @param detailOfApplicants the detail of applicants
	 */
	public void cacheResult(
		java.util.List<DetailOfApplicant> detailOfApplicants);

	/**
	 * Creates a new detail of applicant with the primary key. Does not add the detail of applicant to the database.
	 *
	 * @param detailOfApplicantId the primary key for the new detail of applicant
	 * @return the new detail of applicant
	 */
	public DetailOfApplicant create(long detailOfApplicantId);

	/**
	 * Removes the detail of applicant with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param detailOfApplicantId the primary key of the detail of applicant
	 * @return the detail of applicant that was removed
	 * @throws NoSuchDetailOfApplicantException if a detail of applicant with the primary key could not be found
	 */
	public DetailOfApplicant remove(long detailOfApplicantId)
		throws NoSuchDetailOfApplicantException;

	public DetailOfApplicant updateImpl(DetailOfApplicant detailOfApplicant);

	/**
	 * Returns the detail of applicant with the primary key or throws a <code>NoSuchDetailOfApplicantException</code> if it could not be found.
	 *
	 * @param detailOfApplicantId the primary key of the detail of applicant
	 * @return the detail of applicant
	 * @throws NoSuchDetailOfApplicantException if a detail of applicant with the primary key could not be found
	 */
	public DetailOfApplicant findByPrimaryKey(long detailOfApplicantId)
		throws NoSuchDetailOfApplicantException;

	/**
	 * Returns the detail of applicant with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param detailOfApplicantId the primary key of the detail of applicant
	 * @return the detail of applicant, or <code>null</code> if a detail of applicant with the primary key could not be found
	 */
	public DetailOfApplicant fetchByPrimaryKey(long detailOfApplicantId);

	/**
	 * Returns all the detail of applicants.
	 *
	 * @return the detail of applicants
	 */
	public java.util.List<DetailOfApplicant> findAll();

	/**
	 * Returns a range of all the detail of applicants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @return the range of detail of applicants
	 */
	public java.util.List<DetailOfApplicant> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the detail of applicants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of detail of applicants
	 */
	public java.util.List<DetailOfApplicant> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DetailOfApplicant>
			orderByComparator);

	/**
	 * Returns an ordered range of all the detail of applicants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of detail of applicants
	 */
	public java.util.List<DetailOfApplicant> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DetailOfApplicant>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the detail of applicants from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of detail of applicants.
	 *
	 * @return the number of detail of applicants
	 */
	public int countAll();

}