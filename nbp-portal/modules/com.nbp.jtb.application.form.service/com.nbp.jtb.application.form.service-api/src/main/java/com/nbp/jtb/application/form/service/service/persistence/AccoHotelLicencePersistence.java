/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAccoHotelLicenceException;
import com.nbp.jtb.application.form.service.model.AccoHotelLicence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acco hotel licence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccoHotelLicenceUtil
 * @generated
 */
@ProviderType
public interface AccoHotelLicencePersistence
	extends BasePersistence<AccoHotelLicence> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccoHotelLicenceUtil} to access the acco hotel licence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acco hotel licences where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acco hotel licences
	 */
	public java.util.List<AccoHotelLicence> findByUuid(String uuid);

	/**
	 * Returns a range of all the acco hotel licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco hotel licences
	 * @param end the upper bound of the range of acco hotel licences (not inclusive)
	 * @return the range of matching acco hotel licences
	 */
	public java.util.List<AccoHotelLicence> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acco hotel licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco hotel licences
	 * @param end the upper bound of the range of acco hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco hotel licences
	 */
	public java.util.List<AccoHotelLicence> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoHotelLicence>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acco hotel licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco hotel licences
	 * @param end the upper bound of the range of acco hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco hotel licences
	 */
	public java.util.List<AccoHotelLicence> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoHotelLicence>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acco hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco hotel licence
	 * @throws NoSuchAccoHotelLicenceException if a matching acco hotel licence could not be found
	 */
	public AccoHotelLicence findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccoHotelLicence>
				orderByComparator)
		throws NoSuchAccoHotelLicenceException;

	/**
	 * Returns the first acco hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco hotel licence, or <code>null</code> if a matching acco hotel licence could not be found
	 */
	public AccoHotelLicence fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccoHotelLicence>
			orderByComparator);

	/**
	 * Returns the last acco hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco hotel licence
	 * @throws NoSuchAccoHotelLicenceException if a matching acco hotel licence could not be found
	 */
	public AccoHotelLicence findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccoHotelLicence>
				orderByComparator)
		throws NoSuchAccoHotelLicenceException;

	/**
	 * Returns the last acco hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco hotel licence, or <code>null</code> if a matching acco hotel licence could not be found
	 */
	public AccoHotelLicence fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccoHotelLicence>
			orderByComparator);

	/**
	 * Returns the acco hotel licences before and after the current acco hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param accoHotelLicenceId the primary key of the current acco hotel licence
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco hotel licence
	 * @throws NoSuchAccoHotelLicenceException if a acco hotel licence with the primary key could not be found
	 */
	public AccoHotelLicence[] findByUuid_PrevAndNext(
			long accoHotelLicenceId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccoHotelLicence>
				orderByComparator)
		throws NoSuchAccoHotelLicenceException;

	/**
	 * Removes all the acco hotel licences where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acco hotel licences where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acco hotel licences
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acco hotel licence where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccoHotelLicenceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco hotel licence
	 * @throws NoSuchAccoHotelLicenceException if a matching acco hotel licence could not be found
	 */
	public AccoHotelLicence findByUUID_G(String uuid, long groupId)
		throws NoSuchAccoHotelLicenceException;

	/**
	 * Returns the acco hotel licence where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco hotel licence, or <code>null</code> if a matching acco hotel licence could not be found
	 */
	public AccoHotelLicence fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acco hotel licence where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco hotel licence, or <code>null</code> if a matching acco hotel licence could not be found
	 */
	public AccoHotelLicence fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acco hotel licence where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acco hotel licence that was removed
	 */
	public AccoHotelLicence removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccoHotelLicenceException;

	/**
	 * Returns the number of acco hotel licences where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acco hotel licences
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acco hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acco hotel licences
	 */
	public java.util.List<AccoHotelLicence> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acco hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco hotel licences
	 * @param end the upper bound of the range of acco hotel licences (not inclusive)
	 * @return the range of matching acco hotel licences
	 */
	public java.util.List<AccoHotelLicence> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acco hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco hotel licences
	 * @param end the upper bound of the range of acco hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco hotel licences
	 */
	public java.util.List<AccoHotelLicence> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoHotelLicence>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acco hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco hotel licences
	 * @param end the upper bound of the range of acco hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco hotel licences
	 */
	public java.util.List<AccoHotelLicence> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoHotelLicence>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acco hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco hotel licence
	 * @throws NoSuchAccoHotelLicenceException if a matching acco hotel licence could not be found
	 */
	public AccoHotelLicence findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccoHotelLicence>
				orderByComparator)
		throws NoSuchAccoHotelLicenceException;

	/**
	 * Returns the first acco hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco hotel licence, or <code>null</code> if a matching acco hotel licence could not be found
	 */
	public AccoHotelLicence fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccoHotelLicence>
			orderByComparator);

	/**
	 * Returns the last acco hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco hotel licence
	 * @throws NoSuchAccoHotelLicenceException if a matching acco hotel licence could not be found
	 */
	public AccoHotelLicence findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccoHotelLicence>
				orderByComparator)
		throws NoSuchAccoHotelLicenceException;

	/**
	 * Returns the last acco hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco hotel licence, or <code>null</code> if a matching acco hotel licence could not be found
	 */
	public AccoHotelLicence fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccoHotelLicence>
			orderByComparator);

	/**
	 * Returns the acco hotel licences before and after the current acco hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accoHotelLicenceId the primary key of the current acco hotel licence
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco hotel licence
	 * @throws NoSuchAccoHotelLicenceException if a acco hotel licence with the primary key could not be found
	 */
	public AccoHotelLicence[] findByUuid_C_PrevAndNext(
			long accoHotelLicenceId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccoHotelLicence>
				orderByComparator)
		throws NoSuchAccoHotelLicenceException;

	/**
	 * Removes all the acco hotel licences where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acco hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acco hotel licences
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acco hotel licence where jtbApplicationId = &#63; or throws a <code>NoSuchAccoHotelLicenceException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco hotel licence
	 * @throws NoSuchAccoHotelLicenceException if a matching acco hotel licence could not be found
	 */
	public AccoHotelLicence findBygetJTB_ByApplicationId(long jtbApplicationId)
		throws NoSuchAccoHotelLicenceException;

	/**
	 * Returns the acco hotel licence where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco hotel licence, or <code>null</code> if a matching acco hotel licence could not be found
	 */
	public AccoHotelLicence fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the acco hotel licence where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco hotel licence, or <code>null</code> if a matching acco hotel licence could not be found
	 */
	public AccoHotelLicence fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the acco hotel licence where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the acco hotel licence that was removed
	 */
	public AccoHotelLicence removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAccoHotelLicenceException;

	/**
	 * Returns the number of acco hotel licences where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching acco hotel licences
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the acco hotel licence in the entity cache if it is enabled.
	 *
	 * @param accoHotelLicence the acco hotel licence
	 */
	public void cacheResult(AccoHotelLicence accoHotelLicence);

	/**
	 * Caches the acco hotel licences in the entity cache if it is enabled.
	 *
	 * @param accoHotelLicences the acco hotel licences
	 */
	public void cacheResult(java.util.List<AccoHotelLicence> accoHotelLicences);

	/**
	 * Creates a new acco hotel licence with the primary key. Does not add the acco hotel licence to the database.
	 *
	 * @param accoHotelLicenceId the primary key for the new acco hotel licence
	 * @return the new acco hotel licence
	 */
	public AccoHotelLicence create(long accoHotelLicenceId);

	/**
	 * Removes the acco hotel licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accoHotelLicenceId the primary key of the acco hotel licence
	 * @return the acco hotel licence that was removed
	 * @throws NoSuchAccoHotelLicenceException if a acco hotel licence with the primary key could not be found
	 */
	public AccoHotelLicence remove(long accoHotelLicenceId)
		throws NoSuchAccoHotelLicenceException;

	public AccoHotelLicence updateImpl(AccoHotelLicence accoHotelLicence);

	/**
	 * Returns the acco hotel licence with the primary key or throws a <code>NoSuchAccoHotelLicenceException</code> if it could not be found.
	 *
	 * @param accoHotelLicenceId the primary key of the acco hotel licence
	 * @return the acco hotel licence
	 * @throws NoSuchAccoHotelLicenceException if a acco hotel licence with the primary key could not be found
	 */
	public AccoHotelLicence findByPrimaryKey(long accoHotelLicenceId)
		throws NoSuchAccoHotelLicenceException;

	/**
	 * Returns the acco hotel licence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accoHotelLicenceId the primary key of the acco hotel licence
	 * @return the acco hotel licence, or <code>null</code> if a acco hotel licence with the primary key could not be found
	 */
	public AccoHotelLicence fetchByPrimaryKey(long accoHotelLicenceId);

	/**
	 * Returns all the acco hotel licences.
	 *
	 * @return the acco hotel licences
	 */
	public java.util.List<AccoHotelLicence> findAll();

	/**
	 * Returns a range of all the acco hotel licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco hotel licences
	 * @param end the upper bound of the range of acco hotel licences (not inclusive)
	 * @return the range of acco hotel licences
	 */
	public java.util.List<AccoHotelLicence> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acco hotel licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco hotel licences
	 * @param end the upper bound of the range of acco hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acco hotel licences
	 */
	public java.util.List<AccoHotelLicence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoHotelLicence>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acco hotel licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco hotel licences
	 * @param end the upper bound of the range of acco hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acco hotel licences
	 */
	public java.util.List<AccoHotelLicence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoHotelLicence>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acco hotel licences from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acco hotel licences.
	 *
	 * @return the number of acco hotel licences
	 */
	public int countAll();

}