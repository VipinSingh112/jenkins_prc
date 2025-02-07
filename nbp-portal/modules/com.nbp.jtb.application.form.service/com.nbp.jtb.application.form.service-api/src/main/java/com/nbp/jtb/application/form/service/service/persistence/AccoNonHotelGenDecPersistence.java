/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAccoNonHotelGenDecException;
import com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acco non hotel gen dec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccoNonHotelGenDecUtil
 * @generated
 */
@ProviderType
public interface AccoNonHotelGenDecPersistence
	extends BasePersistence<AccoNonHotelGenDec> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccoNonHotelGenDecUtil} to access the acco non hotel gen dec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acco non hotel gen decs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acco non hotel gen decs
	 */
	public java.util.List<AccoNonHotelGenDec> findByUuid(String uuid);

	/**
	 * Returns a range of all the acco non hotel gen decs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @return the range of matching acco non hotel gen decs
	 */
	public java.util.List<AccoNonHotelGenDec> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acco non hotel gen decs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco non hotel gen decs
	 */
	public java.util.List<AccoNonHotelGenDec> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelGenDec>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acco non hotel gen decs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco non hotel gen decs
	 */
	public java.util.List<AccoNonHotelGenDec> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelGenDec>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acco non hotel gen dec in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a matching acco non hotel gen dec could not be found
	 */
	public AccoNonHotelGenDec findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelGenDec>
				orderByComparator)
		throws NoSuchAccoNonHotelGenDecException;

	/**
	 * Returns the first acco non hotel gen dec in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	public AccoNonHotelGenDec fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelGenDec>
			orderByComparator);

	/**
	 * Returns the last acco non hotel gen dec in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a matching acco non hotel gen dec could not be found
	 */
	public AccoNonHotelGenDec findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelGenDec>
				orderByComparator)
		throws NoSuchAccoNonHotelGenDecException;

	/**
	 * Returns the last acco non hotel gen dec in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	public AccoNonHotelGenDec fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelGenDec>
			orderByComparator);

	/**
	 * Returns the acco non hotel gen decs before and after the current acco non hotel gen dec in the ordered set where uuid = &#63;.
	 *
	 * @param accoNonHotelGenDecId the primary key of the current acco non hotel gen dec
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a acco non hotel gen dec with the primary key could not be found
	 */
	public AccoNonHotelGenDec[] findByUuid_PrevAndNext(
			long accoNonHotelGenDecId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelGenDec>
				orderByComparator)
		throws NoSuchAccoNonHotelGenDecException;

	/**
	 * Removes all the acco non hotel gen decs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acco non hotel gen decs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acco non hotel gen decs
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acco non hotel gen dec where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccoNonHotelGenDecException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a matching acco non hotel gen dec could not be found
	 */
	public AccoNonHotelGenDec findByUUID_G(String uuid, long groupId)
		throws NoSuchAccoNonHotelGenDecException;

	/**
	 * Returns the acco non hotel gen dec where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	public AccoNonHotelGenDec fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acco non hotel gen dec where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	public AccoNonHotelGenDec fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acco non hotel gen dec where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acco non hotel gen dec that was removed
	 */
	public AccoNonHotelGenDec removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccoNonHotelGenDecException;

	/**
	 * Returns the number of acco non hotel gen decs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acco non hotel gen decs
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acco non hotel gen decs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acco non hotel gen decs
	 */
	public java.util.List<AccoNonHotelGenDec> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acco non hotel gen decs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @return the range of matching acco non hotel gen decs
	 */
	public java.util.List<AccoNonHotelGenDec> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acco non hotel gen decs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco non hotel gen decs
	 */
	public java.util.List<AccoNonHotelGenDec> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelGenDec>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acco non hotel gen decs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco non hotel gen decs
	 */
	public java.util.List<AccoNonHotelGenDec> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelGenDec>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acco non hotel gen dec in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a matching acco non hotel gen dec could not be found
	 */
	public AccoNonHotelGenDec findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelGenDec>
				orderByComparator)
		throws NoSuchAccoNonHotelGenDecException;

	/**
	 * Returns the first acco non hotel gen dec in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	public AccoNonHotelGenDec fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelGenDec>
			orderByComparator);

	/**
	 * Returns the last acco non hotel gen dec in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a matching acco non hotel gen dec could not be found
	 */
	public AccoNonHotelGenDec findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelGenDec>
				orderByComparator)
		throws NoSuchAccoNonHotelGenDecException;

	/**
	 * Returns the last acco non hotel gen dec in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	public AccoNonHotelGenDec fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelGenDec>
			orderByComparator);

	/**
	 * Returns the acco non hotel gen decs before and after the current acco non hotel gen dec in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accoNonHotelGenDecId the primary key of the current acco non hotel gen dec
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a acco non hotel gen dec with the primary key could not be found
	 */
	public AccoNonHotelGenDec[] findByUuid_C_PrevAndNext(
			long accoNonHotelGenDecId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelGenDec>
				orderByComparator)
		throws NoSuchAccoNonHotelGenDecException;

	/**
	 * Removes all the acco non hotel gen decs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acco non hotel gen decs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acco non hotel gen decs
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acco non hotel gen dec where jtbApplicationId = &#63; or throws a <code>NoSuchAccoNonHotelGenDecException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a matching acco non hotel gen dec could not be found
	 */
	public AccoNonHotelGenDec findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAccoNonHotelGenDecException;

	/**
	 * Returns the acco non hotel gen dec where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	public AccoNonHotelGenDec fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the acco non hotel gen dec where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	public AccoNonHotelGenDec fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the acco non hotel gen dec where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the acco non hotel gen dec that was removed
	 */
	public AccoNonHotelGenDec removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAccoNonHotelGenDecException;

	/**
	 * Returns the number of acco non hotel gen decs where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching acco non hotel gen decs
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the acco non hotel gen dec in the entity cache if it is enabled.
	 *
	 * @param accoNonHotelGenDec the acco non hotel gen dec
	 */
	public void cacheResult(AccoNonHotelGenDec accoNonHotelGenDec);

	/**
	 * Caches the acco non hotel gen decs in the entity cache if it is enabled.
	 *
	 * @param accoNonHotelGenDecs the acco non hotel gen decs
	 */
	public void cacheResult(
		java.util.List<AccoNonHotelGenDec> accoNonHotelGenDecs);

	/**
	 * Creates a new acco non hotel gen dec with the primary key. Does not add the acco non hotel gen dec to the database.
	 *
	 * @param accoNonHotelGenDecId the primary key for the new acco non hotel gen dec
	 * @return the new acco non hotel gen dec
	 */
	public AccoNonHotelGenDec create(long accoNonHotelGenDecId);

	/**
	 * Removes the acco non hotel gen dec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accoNonHotelGenDecId the primary key of the acco non hotel gen dec
	 * @return the acco non hotel gen dec that was removed
	 * @throws NoSuchAccoNonHotelGenDecException if a acco non hotel gen dec with the primary key could not be found
	 */
	public AccoNonHotelGenDec remove(long accoNonHotelGenDecId)
		throws NoSuchAccoNonHotelGenDecException;

	public AccoNonHotelGenDec updateImpl(AccoNonHotelGenDec accoNonHotelGenDec);

	/**
	 * Returns the acco non hotel gen dec with the primary key or throws a <code>NoSuchAccoNonHotelGenDecException</code> if it could not be found.
	 *
	 * @param accoNonHotelGenDecId the primary key of the acco non hotel gen dec
	 * @return the acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a acco non hotel gen dec with the primary key could not be found
	 */
	public AccoNonHotelGenDec findByPrimaryKey(long accoNonHotelGenDecId)
		throws NoSuchAccoNonHotelGenDecException;

	/**
	 * Returns the acco non hotel gen dec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accoNonHotelGenDecId the primary key of the acco non hotel gen dec
	 * @return the acco non hotel gen dec, or <code>null</code> if a acco non hotel gen dec with the primary key could not be found
	 */
	public AccoNonHotelGenDec fetchByPrimaryKey(long accoNonHotelGenDecId);

	/**
	 * Returns all the acco non hotel gen decs.
	 *
	 * @return the acco non hotel gen decs
	 */
	public java.util.List<AccoNonHotelGenDec> findAll();

	/**
	 * Returns a range of all the acco non hotel gen decs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @return the range of acco non hotel gen decs
	 */
	public java.util.List<AccoNonHotelGenDec> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acco non hotel gen decs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acco non hotel gen decs
	 */
	public java.util.List<AccoNonHotelGenDec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelGenDec>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acco non hotel gen decs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acco non hotel gen decs
	 */
	public java.util.List<AccoNonHotelGenDec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoNonHotelGenDec>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acco non hotel gen decs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acco non hotel gen decs.
	 *
	 * @return the number of acco non hotel gen decs
	 */
	public int countAll();

}