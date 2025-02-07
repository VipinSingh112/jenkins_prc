/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jadsc.application.form.service.exception.NoSuchJADSCChecklistAddException;
import com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jadsc checklist add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCChecklistAddUtil
 * @generated
 */
@ProviderType
public interface JADSCChecklistAddPersistence
	extends BasePersistence<JADSCChecklistAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JADSCChecklistAddUtil} to access the jadsc checklist add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the jadsc checklist adds where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc checklist adds
	 */
	public java.util.List<JADSCChecklistAdd> findByUuid(String uuid);

	/**
	 * Returns a range of all the jadsc checklist adds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @return the range of matching jadsc checklist adds
	 */
	public java.util.List<JADSCChecklistAdd> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc checklist adds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc checklist adds
	 */
	public java.util.List<JADSCChecklistAdd> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc checklist adds where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc checklist adds
	 */
	public java.util.List<JADSCChecklistAdd> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc checklist add in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	public JADSCChecklistAdd findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
				orderByComparator)
		throws NoSuchJADSCChecklistAddException;

	/**
	 * Returns the first jadsc checklist add in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	public JADSCChecklistAdd fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
			orderByComparator);

	/**
	 * Returns the last jadsc checklist add in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	public JADSCChecklistAdd findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
				orderByComparator)
		throws NoSuchJADSCChecklistAddException;

	/**
	 * Returns the last jadsc checklist add in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	public JADSCChecklistAdd fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
			orderByComparator);

	/**
	 * Returns the jadsc checklist adds before and after the current jadsc checklist add in the ordered set where uuid = &#63;.
	 *
	 * @param jADSCChecklistAddId the primary key of the current jadsc checklist add
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a jadsc checklist add with the primary key could not be found
	 */
	public JADSCChecklistAdd[] findByUuid_PrevAndNext(
			long jADSCChecklistAddId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
				orderByComparator)
		throws NoSuchJADSCChecklistAddException;

	/**
	 * Removes all the jadsc checklist adds where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of jadsc checklist adds where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc checklist adds
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the jadsc checklist add where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCChecklistAddException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	public JADSCChecklistAdd findByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCChecklistAddException;

	/**
	 * Returns the jadsc checklist add where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	public JADSCChecklistAdd fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the jadsc checklist add where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	public JADSCChecklistAdd fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the jadsc checklist add where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc checklist add that was removed
	 */
	public JADSCChecklistAdd removeByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCChecklistAddException;

	/**
	 * Returns the number of jadsc checklist adds where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc checklist adds
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the jadsc checklist adds where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc checklist adds
	 */
	public java.util.List<JADSCChecklistAdd> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the jadsc checklist adds where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @return the range of matching jadsc checklist adds
	 */
	public java.util.List<JADSCChecklistAdd> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc checklist adds where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc checklist adds
	 */
	public java.util.List<JADSCChecklistAdd> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc checklist adds where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc checklist adds
	 */
	public java.util.List<JADSCChecklistAdd> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc checklist add in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	public JADSCChecklistAdd findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
				orderByComparator)
		throws NoSuchJADSCChecklistAddException;

	/**
	 * Returns the first jadsc checklist add in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	public JADSCChecklistAdd fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
			orderByComparator);

	/**
	 * Returns the last jadsc checklist add in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	public JADSCChecklistAdd findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
				orderByComparator)
		throws NoSuchJADSCChecklistAddException;

	/**
	 * Returns the last jadsc checklist add in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	public JADSCChecklistAdd fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
			orderByComparator);

	/**
	 * Returns the jadsc checklist adds before and after the current jadsc checklist add in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jADSCChecklistAddId the primary key of the current jadsc checklist add
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a jadsc checklist add with the primary key could not be found
	 */
	public JADSCChecklistAdd[] findByUuid_C_PrevAndNext(
			long jADSCChecklistAddId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
				orderByComparator)
		throws NoSuchJADSCChecklistAddException;

	/**
	 * Removes all the jadsc checklist adds where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of jadsc checklist adds where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc checklist adds
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc checklist adds
	 */
	public java.util.List<JADSCChecklistAdd> findBygetJADSCById(
		long jadscApplicationId);

	/**
	 * Returns a range of all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @return the range of matching jadsc checklist adds
	 */
	public java.util.List<JADSCChecklistAdd> findBygetJADSCById(
		long jadscApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc checklist adds
	 */
	public java.util.List<JADSCChecklistAdd> findBygetJADSCById(
		long jadscApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc checklist adds
	 */
	public java.util.List<JADSCChecklistAdd> findBygetJADSCById(
		long jadscApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	public JADSCChecklistAdd findBygetJADSCById_First(
			long jadscApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
				orderByComparator)
		throws NoSuchJADSCChecklistAddException;

	/**
	 * Returns the first jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	public JADSCChecklistAdd fetchBygetJADSCById_First(
		long jadscApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
			orderByComparator);

	/**
	 * Returns the last jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	public JADSCChecklistAdd findBygetJADSCById_Last(
			long jadscApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
				orderByComparator)
		throws NoSuchJADSCChecklistAddException;

	/**
	 * Returns the last jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	public JADSCChecklistAdd fetchBygetJADSCById_Last(
		long jadscApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
			orderByComparator);

	/**
	 * Returns the jadsc checklist adds before and after the current jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jADSCChecklistAddId the primary key of the current jadsc checklist add
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a jadsc checklist add with the primary key could not be found
	 */
	public JADSCChecklistAdd[] findBygetJADSCById_PrevAndNext(
			long jADSCChecklistAddId, long jadscApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
				orderByComparator)
		throws NoSuchJADSCChecklistAddException;

	/**
	 * Removes all the jadsc checklist adds where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 */
	public void removeBygetJADSCById(long jadscApplicationId);

	/**
	 * Returns the number of jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc checklist adds
	 */
	public int countBygetJADSCById(long jadscApplicationId);

	/**
	 * Returns all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc checklist adds
	 */
	public java.util.List<JADSCChecklistAdd> findBygetAppIdJADSC(
		long jadscApplicationId);

	/**
	 * Returns a range of all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @return the range of matching jadsc checklist adds
	 */
	public java.util.List<JADSCChecklistAdd> findBygetAppIdJADSC(
		long jadscApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc checklist adds
	 */
	public java.util.List<JADSCChecklistAdd> findBygetAppIdJADSC(
		long jadscApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc checklist adds
	 */
	public java.util.List<JADSCChecklistAdd> findBygetAppIdJADSC(
		long jadscApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	public JADSCChecklistAdd findBygetAppIdJADSC_First(
			long jadscApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
				orderByComparator)
		throws NoSuchJADSCChecklistAddException;

	/**
	 * Returns the first jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	public JADSCChecklistAdd fetchBygetAppIdJADSC_First(
		long jadscApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
			orderByComparator);

	/**
	 * Returns the last jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a matching jadsc checklist add could not be found
	 */
	public JADSCChecklistAdd findBygetAppIdJADSC_Last(
			long jadscApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
				orderByComparator)
		throws NoSuchJADSCChecklistAddException;

	/**
	 * Returns the last jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist add, or <code>null</code> if a matching jadsc checklist add could not be found
	 */
	public JADSCChecklistAdd fetchBygetAppIdJADSC_Last(
		long jadscApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
			orderByComparator);

	/**
	 * Returns the jadsc checklist adds before and after the current jadsc checklist add in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jADSCChecklistAddId the primary key of the current jadsc checklist add
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a jadsc checklist add with the primary key could not be found
	 */
	public JADSCChecklistAdd[] findBygetAppIdJADSC_PrevAndNext(
			long jADSCChecklistAddId, long jadscApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
				orderByComparator)
		throws NoSuchJADSCChecklistAddException;

	/**
	 * Removes all the jadsc checklist adds where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 */
	public void removeBygetAppIdJADSC(long jadscApplicationId);

	/**
	 * Returns the number of jadsc checklist adds where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc checklist adds
	 */
	public int countBygetAppIdJADSC(long jadscApplicationId);

	/**
	 * Caches the jadsc checklist add in the entity cache if it is enabled.
	 *
	 * @param jadscChecklistAdd the jadsc checklist add
	 */
	public void cacheResult(JADSCChecklistAdd jadscChecklistAdd);

	/**
	 * Caches the jadsc checklist adds in the entity cache if it is enabled.
	 *
	 * @param jadscChecklistAdds the jadsc checklist adds
	 */
	public void cacheResult(
		java.util.List<JADSCChecklistAdd> jadscChecklistAdds);

	/**
	 * Creates a new jadsc checklist add with the primary key. Does not add the jadsc checklist add to the database.
	 *
	 * @param jADSCChecklistAddId the primary key for the new jadsc checklist add
	 * @return the new jadsc checklist add
	 */
	public JADSCChecklistAdd create(long jADSCChecklistAddId);

	/**
	 * Removes the jadsc checklist add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jADSCChecklistAddId the primary key of the jadsc checklist add
	 * @return the jadsc checklist add that was removed
	 * @throws NoSuchJADSCChecklistAddException if a jadsc checklist add with the primary key could not be found
	 */
	public JADSCChecklistAdd remove(long jADSCChecklistAddId)
		throws NoSuchJADSCChecklistAddException;

	public JADSCChecklistAdd updateImpl(JADSCChecklistAdd jadscChecklistAdd);

	/**
	 * Returns the jadsc checklist add with the primary key or throws a <code>NoSuchJADSCChecklistAddException</code> if it could not be found.
	 *
	 * @param jADSCChecklistAddId the primary key of the jadsc checklist add
	 * @return the jadsc checklist add
	 * @throws NoSuchJADSCChecklistAddException if a jadsc checklist add with the primary key could not be found
	 */
	public JADSCChecklistAdd findByPrimaryKey(long jADSCChecklistAddId)
		throws NoSuchJADSCChecklistAddException;

	/**
	 * Returns the jadsc checklist add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jADSCChecklistAddId the primary key of the jadsc checklist add
	 * @return the jadsc checklist add, or <code>null</code> if a jadsc checklist add with the primary key could not be found
	 */
	public JADSCChecklistAdd fetchByPrimaryKey(long jADSCChecklistAddId);

	/**
	 * Returns all the jadsc checklist adds.
	 *
	 * @return the jadsc checklist adds
	 */
	public java.util.List<JADSCChecklistAdd> findAll();

	/**
	 * Returns a range of all the jadsc checklist adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @return the range of jadsc checklist adds
	 */
	public java.util.List<JADSCChecklistAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jadsc checklist adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc checklist adds
	 */
	public java.util.List<JADSCChecklistAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc checklist adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc checklist adds
	 * @param end the upper bound of the range of jadsc checklist adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc checklist adds
	 */
	public java.util.List<JADSCChecklistAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklistAdd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jadsc checklist adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jadsc checklist adds.
	 *
	 * @return the number of jadsc checklist adds
	 */
	public int countAll();

}