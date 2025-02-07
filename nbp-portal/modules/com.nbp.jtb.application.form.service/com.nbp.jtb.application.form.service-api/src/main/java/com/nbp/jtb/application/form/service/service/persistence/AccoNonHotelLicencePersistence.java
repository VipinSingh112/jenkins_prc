/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAccoNonHotelLicenceException;
import com.nbp.jtb.application.form.service.model.AccoNonHotelLicence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acco non hotel licence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccoNonHotelLicenceUtil
 * @generated
 */
@ProviderType
public interface AccoNonHotelLicencePersistence
	extends BasePersistence<AccoNonHotelLicence> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccoNonHotelLicenceUtil} to access the acco non hotel licence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acco non hotel licences where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acco non hotel licences
	 */
	public java.util.List<AccoNonHotelLicence> findByUuid(String uuid);

	/**
	 * Returns a range of all the acco non hotel licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @return the range of matching acco non hotel licences
	 */
	public java.util.List<AccoNonHotelLicence> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acco non hotel licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco non hotel licences
	 */
	public java.util.List<AccoNonHotelLicence> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelLicence>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acco non hotel licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco non hotel licences
	 */
	public java.util.List<AccoNonHotelLicence> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelLicence>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acco non hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a matching acco non hotel licence could not be found
	 */
	public AccoNonHotelLicence findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccoNonHotelLicence> orderByComparator)
		throws NoSuchAccoNonHotelLicenceException;

	/**
	 * Returns the first acco non hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	public AccoNonHotelLicence fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelLicence>
			orderByComparator);

	/**
	 * Returns the last acco non hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a matching acco non hotel licence could not be found
	 */
	public AccoNonHotelLicence findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccoNonHotelLicence> orderByComparator)
		throws NoSuchAccoNonHotelLicenceException;

	/**
	 * Returns the last acco non hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	public AccoNonHotelLicence fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelLicence>
			orderByComparator);

	/**
	 * Returns the acco non hotel licences before and after the current acco non hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param accoNonHotelLicenceId the primary key of the current acco non hotel licence
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a acco non hotel licence with the primary key could not be found
	 */
	public AccoNonHotelLicence[] findByUuid_PrevAndNext(
			long accoNonHotelLicenceId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccoNonHotelLicence> orderByComparator)
		throws NoSuchAccoNonHotelLicenceException;

	/**
	 * Removes all the acco non hotel licences where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acco non hotel licences where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acco non hotel licences
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acco non hotel licence where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccoNonHotelLicenceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a matching acco non hotel licence could not be found
	 */
	public AccoNonHotelLicence findByUUID_G(String uuid, long groupId)
		throws NoSuchAccoNonHotelLicenceException;

	/**
	 * Returns the acco non hotel licence where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	public AccoNonHotelLicence fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acco non hotel licence where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	public AccoNonHotelLicence fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acco non hotel licence where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acco non hotel licence that was removed
	 */
	public AccoNonHotelLicence removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccoNonHotelLicenceException;

	/**
	 * Returns the number of acco non hotel licences where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acco non hotel licences
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acco non hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acco non hotel licences
	 */
	public java.util.List<AccoNonHotelLicence> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acco non hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @return the range of matching acco non hotel licences
	 */
	public java.util.List<AccoNonHotelLicence> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acco non hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco non hotel licences
	 */
	public java.util.List<AccoNonHotelLicence> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelLicence>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acco non hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco non hotel licences
	 */
	public java.util.List<AccoNonHotelLicence> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelLicence>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acco non hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a matching acco non hotel licence could not be found
	 */
	public AccoNonHotelLicence findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccoNonHotelLicence> orderByComparator)
		throws NoSuchAccoNonHotelLicenceException;

	/**
	 * Returns the first acco non hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	public AccoNonHotelLicence fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelLicence>
			orderByComparator);

	/**
	 * Returns the last acco non hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a matching acco non hotel licence could not be found
	 */
	public AccoNonHotelLicence findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccoNonHotelLicence> orderByComparator)
		throws NoSuchAccoNonHotelLicenceException;

	/**
	 * Returns the last acco non hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	public AccoNonHotelLicence fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelLicence>
			orderByComparator);

	/**
	 * Returns the acco non hotel licences before and after the current acco non hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accoNonHotelLicenceId the primary key of the current acco non hotel licence
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a acco non hotel licence with the primary key could not be found
	 */
	public AccoNonHotelLicence[] findByUuid_C_PrevAndNext(
			long accoNonHotelLicenceId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AccoNonHotelLicence> orderByComparator)
		throws NoSuchAccoNonHotelLicenceException;

	/**
	 * Removes all the acco non hotel licences where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acco non hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acco non hotel licences
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acco non hotel licence where jtbApplicationId = &#63; or throws a <code>NoSuchAccoNonHotelLicenceException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a matching acco non hotel licence could not be found
	 */
	public AccoNonHotelLicence findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAccoNonHotelLicenceException;

	/**
	 * Returns the acco non hotel licence where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	public AccoNonHotelLicence fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the acco non hotel licence where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	public AccoNonHotelLicence fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the acco non hotel licence where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the acco non hotel licence that was removed
	 */
	public AccoNonHotelLicence removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAccoNonHotelLicenceException;

	/**
	 * Returns the number of acco non hotel licences where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching acco non hotel licences
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the acco non hotel licence in the entity cache if it is enabled.
	 *
	 * @param accoNonHotelLicence the acco non hotel licence
	 */
	public void cacheResult(AccoNonHotelLicence accoNonHotelLicence);

	/**
	 * Caches the acco non hotel licences in the entity cache if it is enabled.
	 *
	 * @param accoNonHotelLicences the acco non hotel licences
	 */
	public void cacheResult(
		java.util.List<AccoNonHotelLicence> accoNonHotelLicences);

	/**
	 * Creates a new acco non hotel licence with the primary key. Does not add the acco non hotel licence to the database.
	 *
	 * @param accoNonHotelLicenceId the primary key for the new acco non hotel licence
	 * @return the new acco non hotel licence
	 */
	public AccoNonHotelLicence create(long accoNonHotelLicenceId);

	/**
	 * Removes the acco non hotel licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accoNonHotelLicenceId the primary key of the acco non hotel licence
	 * @return the acco non hotel licence that was removed
	 * @throws NoSuchAccoNonHotelLicenceException if a acco non hotel licence with the primary key could not be found
	 */
	public AccoNonHotelLicence remove(long accoNonHotelLicenceId)
		throws NoSuchAccoNonHotelLicenceException;

	public AccoNonHotelLicence updateImpl(
		AccoNonHotelLicence accoNonHotelLicence);

	/**
	 * Returns the acco non hotel licence with the primary key or throws a <code>NoSuchAccoNonHotelLicenceException</code> if it could not be found.
	 *
	 * @param accoNonHotelLicenceId the primary key of the acco non hotel licence
	 * @return the acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a acco non hotel licence with the primary key could not be found
	 */
	public AccoNonHotelLicence findByPrimaryKey(long accoNonHotelLicenceId)
		throws NoSuchAccoNonHotelLicenceException;

	/**
	 * Returns the acco non hotel licence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accoNonHotelLicenceId the primary key of the acco non hotel licence
	 * @return the acco non hotel licence, or <code>null</code> if a acco non hotel licence with the primary key could not be found
	 */
	public AccoNonHotelLicence fetchByPrimaryKey(long accoNonHotelLicenceId);

	/**
	 * Returns all the acco non hotel licences.
	 *
	 * @return the acco non hotel licences
	 */
	public java.util.List<AccoNonHotelLicence> findAll();

	/**
	 * Returns a range of all the acco non hotel licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @return the range of acco non hotel licences
	 */
	public java.util.List<AccoNonHotelLicence> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acco non hotel licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acco non hotel licences
	 */
	public java.util.List<AccoNonHotelLicence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelLicence>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acco non hotel licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acco non hotel licences
	 */
	public java.util.List<AccoNonHotelLicence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelLicence>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acco non hotel licences from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acco non hotel licences.
	 *
	 * @return the number of acco non hotel licences
	 */
	public int countAll();

}