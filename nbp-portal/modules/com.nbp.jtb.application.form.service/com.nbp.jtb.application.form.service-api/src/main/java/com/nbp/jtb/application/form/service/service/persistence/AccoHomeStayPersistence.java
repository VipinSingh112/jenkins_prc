/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAccoHomeStayException;
import com.nbp.jtb.application.form.service.model.AccoHomeStay;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acco home stay service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccoHomeStayUtil
 * @generated
 */
@ProviderType
public interface AccoHomeStayPersistence extends BasePersistence<AccoHomeStay> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AccoHomeStayUtil} to access the acco home stay persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acco home stays where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acco home stays
	 */
	public java.util.List<AccoHomeStay> findByUuid(String uuid);

	/**
	 * Returns a range of all the acco home stays where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @return the range of matching acco home stays
	 */
	public java.util.List<AccoHomeStay> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acco home stays where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco home stays
	 */
	public java.util.List<AccoHomeStay> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoHomeStay>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acco home stays where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco home stays
	 */
	public java.util.List<AccoHomeStay> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoHomeStay>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acco home stay in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco home stay
	 * @throws NoSuchAccoHomeStayException if a matching acco home stay could not be found
	 */
	public AccoHomeStay findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccoHomeStay>
				orderByComparator)
		throws NoSuchAccoHomeStayException;

	/**
	 * Returns the first acco home stay in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	public AccoHomeStay fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccoHomeStay>
			orderByComparator);

	/**
	 * Returns the last acco home stay in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco home stay
	 * @throws NoSuchAccoHomeStayException if a matching acco home stay could not be found
	 */
	public AccoHomeStay findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccoHomeStay>
				orderByComparator)
		throws NoSuchAccoHomeStayException;

	/**
	 * Returns the last acco home stay in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	public AccoHomeStay fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AccoHomeStay>
			orderByComparator);

	/**
	 * Returns the acco home stays before and after the current acco home stay in the ordered set where uuid = &#63;.
	 *
	 * @param accoHomeStayId the primary key of the current acco home stay
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco home stay
	 * @throws NoSuchAccoHomeStayException if a acco home stay with the primary key could not be found
	 */
	public AccoHomeStay[] findByUuid_PrevAndNext(
			long accoHomeStayId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AccoHomeStay>
				orderByComparator)
		throws NoSuchAccoHomeStayException;

	/**
	 * Removes all the acco home stays where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acco home stays where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acco home stays
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acco home stay where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccoHomeStayException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco home stay
	 * @throws NoSuchAccoHomeStayException if a matching acco home stay could not be found
	 */
	public AccoHomeStay findByUUID_G(String uuid, long groupId)
		throws NoSuchAccoHomeStayException;

	/**
	 * Returns the acco home stay where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	public AccoHomeStay fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acco home stay where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	public AccoHomeStay fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acco home stay where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acco home stay that was removed
	 */
	public AccoHomeStay removeByUUID_G(String uuid, long groupId)
		throws NoSuchAccoHomeStayException;

	/**
	 * Returns the number of acco home stays where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acco home stays
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acco home stays where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acco home stays
	 */
	public java.util.List<AccoHomeStay> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acco home stays where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @return the range of matching acco home stays
	 */
	public java.util.List<AccoHomeStay> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acco home stays where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco home stays
	 */
	public java.util.List<AccoHomeStay> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoHomeStay>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acco home stays where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco home stays
	 */
	public java.util.List<AccoHomeStay> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoHomeStay>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acco home stay in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco home stay
	 * @throws NoSuchAccoHomeStayException if a matching acco home stay could not be found
	 */
	public AccoHomeStay findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccoHomeStay>
				orderByComparator)
		throws NoSuchAccoHomeStayException;

	/**
	 * Returns the first acco home stay in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	public AccoHomeStay fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccoHomeStay>
			orderByComparator);

	/**
	 * Returns the last acco home stay in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco home stay
	 * @throws NoSuchAccoHomeStayException if a matching acco home stay could not be found
	 */
	public AccoHomeStay findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccoHomeStay>
				orderByComparator)
		throws NoSuchAccoHomeStayException;

	/**
	 * Returns the last acco home stay in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	public AccoHomeStay fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AccoHomeStay>
			orderByComparator);

	/**
	 * Returns the acco home stays before and after the current acco home stay in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accoHomeStayId the primary key of the current acco home stay
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco home stay
	 * @throws NoSuchAccoHomeStayException if a acco home stay with the primary key could not be found
	 */
	public AccoHomeStay[] findByUuid_C_PrevAndNext(
			long accoHomeStayId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AccoHomeStay>
				orderByComparator)
		throws NoSuchAccoHomeStayException;

	/**
	 * Removes all the acco home stays where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acco home stays where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acco home stays
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acco home stay where jtbApplicationId = &#63; or throws a <code>NoSuchAccoHomeStayException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco home stay
	 * @throws NoSuchAccoHomeStayException if a matching acco home stay could not be found
	 */
	public AccoHomeStay findBygetJTB_ByApplicationId(long jtbApplicationId)
		throws NoSuchAccoHomeStayException;

	/**
	 * Returns the acco home stay where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	public AccoHomeStay fetchBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Returns the acco home stay where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	public AccoHomeStay fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the acco home stay where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the acco home stay that was removed
	 */
	public AccoHomeStay removeBygetJTB_ByApplicationId(long jtbApplicationId)
		throws NoSuchAccoHomeStayException;

	/**
	 * Returns the number of acco home stays where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching acco home stays
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the acco home stay in the entity cache if it is enabled.
	 *
	 * @param accoHomeStay the acco home stay
	 */
	public void cacheResult(AccoHomeStay accoHomeStay);

	/**
	 * Caches the acco home stays in the entity cache if it is enabled.
	 *
	 * @param accoHomeStays the acco home stays
	 */
	public void cacheResult(java.util.List<AccoHomeStay> accoHomeStays);

	/**
	 * Creates a new acco home stay with the primary key. Does not add the acco home stay to the database.
	 *
	 * @param accoHomeStayId the primary key for the new acco home stay
	 * @return the new acco home stay
	 */
	public AccoHomeStay create(long accoHomeStayId);

	/**
	 * Removes the acco home stay with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accoHomeStayId the primary key of the acco home stay
	 * @return the acco home stay that was removed
	 * @throws NoSuchAccoHomeStayException if a acco home stay with the primary key could not be found
	 */
	public AccoHomeStay remove(long accoHomeStayId)
		throws NoSuchAccoHomeStayException;

	public AccoHomeStay updateImpl(AccoHomeStay accoHomeStay);

	/**
	 * Returns the acco home stay with the primary key or throws a <code>NoSuchAccoHomeStayException</code> if it could not be found.
	 *
	 * @param accoHomeStayId the primary key of the acco home stay
	 * @return the acco home stay
	 * @throws NoSuchAccoHomeStayException if a acco home stay with the primary key could not be found
	 */
	public AccoHomeStay findByPrimaryKey(long accoHomeStayId)
		throws NoSuchAccoHomeStayException;

	/**
	 * Returns the acco home stay with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accoHomeStayId the primary key of the acco home stay
	 * @return the acco home stay, or <code>null</code> if a acco home stay with the primary key could not be found
	 */
	public AccoHomeStay fetchByPrimaryKey(long accoHomeStayId);

	/**
	 * Returns all the acco home stays.
	 *
	 * @return the acco home stays
	 */
	public java.util.List<AccoHomeStay> findAll();

	/**
	 * Returns a range of all the acco home stays.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @return the range of acco home stays
	 */
	public java.util.List<AccoHomeStay> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acco home stays.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acco home stays
	 */
	public java.util.List<AccoHomeStay> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoHomeStay>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acco home stays.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acco home stays
	 */
	public java.util.List<AccoHomeStay> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AccoHomeStay>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acco home stays from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acco home stays.
	 *
	 * @return the number of acco home stays
	 */
	public int countAll();

}