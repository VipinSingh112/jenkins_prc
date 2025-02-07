/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jadsc.application.form.service.exception.NoSuchJADSCChecklistException;
import com.nbp.jadsc.application.form.service.model.JADSCChecklist;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jadsc checklist service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCChecklistUtil
 * @generated
 */
@ProviderType
public interface JADSCChecklistPersistence
	extends BasePersistence<JADSCChecklist> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JADSCChecklistUtil} to access the jadsc checklist persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the jadsc checklists where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc checklists
	 */
	public java.util.List<JADSCChecklist> findByUuid(String uuid);

	/**
	 * Returns a range of all the jadsc checklists where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @return the range of matching jadsc checklists
	 */
	public java.util.List<JADSCChecklist> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc checklists where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc checklists
	 */
	public java.util.List<JADSCChecklist> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc checklists where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc checklists
	 */
	public java.util.List<JADSCChecklist> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc checklist in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist
	 * @throws NoSuchJADSCChecklistException if a matching jadsc checklist could not be found
	 */
	public JADSCChecklist findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
				orderByComparator)
		throws NoSuchJADSCChecklistException;

	/**
	 * Returns the first jadsc checklist in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist, or <code>null</code> if a matching jadsc checklist could not be found
	 */
	public JADSCChecklist fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
			orderByComparator);

	/**
	 * Returns the last jadsc checklist in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist
	 * @throws NoSuchJADSCChecklistException if a matching jadsc checklist could not be found
	 */
	public JADSCChecklist findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
				orderByComparator)
		throws NoSuchJADSCChecklistException;

	/**
	 * Returns the last jadsc checklist in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist, or <code>null</code> if a matching jadsc checklist could not be found
	 */
	public JADSCChecklist fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
			orderByComparator);

	/**
	 * Returns the jadsc checklists before and after the current jadsc checklist in the ordered set where uuid = &#63;.
	 *
	 * @param jadscChecklistId the primary key of the current jadsc checklist
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc checklist
	 * @throws NoSuchJADSCChecklistException if a jadsc checklist with the primary key could not be found
	 */
	public JADSCChecklist[] findByUuid_PrevAndNext(
			long jadscChecklistId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
				orderByComparator)
		throws NoSuchJADSCChecklistException;

	/**
	 * Removes all the jadsc checklists where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of jadsc checklists where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc checklists
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the jadsc checklist where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCChecklistException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc checklist
	 * @throws NoSuchJADSCChecklistException if a matching jadsc checklist could not be found
	 */
	public JADSCChecklist findByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCChecklistException;

	/**
	 * Returns the jadsc checklist where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc checklist, or <code>null</code> if a matching jadsc checklist could not be found
	 */
	public JADSCChecklist fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the jadsc checklist where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc checklist, or <code>null</code> if a matching jadsc checklist could not be found
	 */
	public JADSCChecklist fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the jadsc checklist where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc checklist that was removed
	 */
	public JADSCChecklist removeByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCChecklistException;

	/**
	 * Returns the number of jadsc checklists where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc checklists
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the jadsc checklists where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc checklists
	 */
	public java.util.List<JADSCChecklist> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the jadsc checklists where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @return the range of matching jadsc checklists
	 */
	public java.util.List<JADSCChecklist> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc checklists where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc checklists
	 */
	public java.util.List<JADSCChecklist> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc checklists where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc checklists
	 */
	public java.util.List<JADSCChecklist> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc checklist in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist
	 * @throws NoSuchJADSCChecklistException if a matching jadsc checklist could not be found
	 */
	public JADSCChecklist findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
				orderByComparator)
		throws NoSuchJADSCChecklistException;

	/**
	 * Returns the first jadsc checklist in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist, or <code>null</code> if a matching jadsc checklist could not be found
	 */
	public JADSCChecklist fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
			orderByComparator);

	/**
	 * Returns the last jadsc checklist in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist
	 * @throws NoSuchJADSCChecklistException if a matching jadsc checklist could not be found
	 */
	public JADSCChecklist findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
				orderByComparator)
		throws NoSuchJADSCChecklistException;

	/**
	 * Returns the last jadsc checklist in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist, or <code>null</code> if a matching jadsc checklist could not be found
	 */
	public JADSCChecklist fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
			orderByComparator);

	/**
	 * Returns the jadsc checklists before and after the current jadsc checklist in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscChecklistId the primary key of the current jadsc checklist
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc checklist
	 * @throws NoSuchJADSCChecklistException if a jadsc checklist with the primary key could not be found
	 */
	public JADSCChecklist[] findByUuid_C_PrevAndNext(
			long jadscChecklistId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
				orderByComparator)
		throws NoSuchJADSCChecklistException;

	/**
	 * Removes all the jadsc checklists where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of jadsc checklists where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc checklists
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the jadsc checklists where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc checklists
	 */
	public java.util.List<JADSCChecklist> findByJADSC_ByAppId(
		long jadscApplicationId);

	/**
	 * Returns a range of all the jadsc checklists where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @return the range of matching jadsc checklists
	 */
	public java.util.List<JADSCChecklist> findByJADSC_ByAppId(
		long jadscApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc checklists where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc checklists
	 */
	public java.util.List<JADSCChecklist> findByJADSC_ByAppId(
		long jadscApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc checklists where jadscApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc checklists
	 */
	public java.util.List<JADSCChecklist> findByJADSC_ByAppId(
		long jadscApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc checklist in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist
	 * @throws NoSuchJADSCChecklistException if a matching jadsc checklist could not be found
	 */
	public JADSCChecklist findByJADSC_ByAppId_First(
			long jadscApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
				orderByComparator)
		throws NoSuchJADSCChecklistException;

	/**
	 * Returns the first jadsc checklist in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc checklist, or <code>null</code> if a matching jadsc checklist could not be found
	 */
	public JADSCChecklist fetchByJADSC_ByAppId_First(
		long jadscApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
			orderByComparator);

	/**
	 * Returns the last jadsc checklist in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist
	 * @throws NoSuchJADSCChecklistException if a matching jadsc checklist could not be found
	 */
	public JADSCChecklist findByJADSC_ByAppId_Last(
			long jadscApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
				orderByComparator)
		throws NoSuchJADSCChecklistException;

	/**
	 * Returns the last jadsc checklist in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc checklist, or <code>null</code> if a matching jadsc checklist could not be found
	 */
	public JADSCChecklist fetchByJADSC_ByAppId_Last(
		long jadscApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
			orderByComparator);

	/**
	 * Returns the jadsc checklists before and after the current jadsc checklist in the ordered set where jadscApplicationId = &#63;.
	 *
	 * @param jadscChecklistId the primary key of the current jadsc checklist
	 * @param jadscApplicationId the jadsc application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc checklist
	 * @throws NoSuchJADSCChecklistException if a jadsc checklist with the primary key could not be found
	 */
	public JADSCChecklist[] findByJADSC_ByAppId_PrevAndNext(
			long jadscChecklistId, long jadscApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
				orderByComparator)
		throws NoSuchJADSCChecklistException;

	/**
	 * Removes all the jadsc checklists where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 */
	public void removeByJADSC_ByAppId(long jadscApplicationId);

	/**
	 * Returns the number of jadsc checklists where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc checklists
	 */
	public int countByJADSC_ByAppId(long jadscApplicationId);

	/**
	 * Caches the jadsc checklist in the entity cache if it is enabled.
	 *
	 * @param jadscChecklist the jadsc checklist
	 */
	public void cacheResult(JADSCChecklist jadscChecklist);

	/**
	 * Caches the jadsc checklists in the entity cache if it is enabled.
	 *
	 * @param jadscChecklists the jadsc checklists
	 */
	public void cacheResult(java.util.List<JADSCChecklist> jadscChecklists);

	/**
	 * Creates a new jadsc checklist with the primary key. Does not add the jadsc checklist to the database.
	 *
	 * @param jadscChecklistId the primary key for the new jadsc checklist
	 * @return the new jadsc checklist
	 */
	public JADSCChecklist create(long jadscChecklistId);

	/**
	 * Removes the jadsc checklist with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscChecklistId the primary key of the jadsc checklist
	 * @return the jadsc checklist that was removed
	 * @throws NoSuchJADSCChecklistException if a jadsc checklist with the primary key could not be found
	 */
	public JADSCChecklist remove(long jadscChecklistId)
		throws NoSuchJADSCChecklistException;

	public JADSCChecklist updateImpl(JADSCChecklist jadscChecklist);

	/**
	 * Returns the jadsc checklist with the primary key or throws a <code>NoSuchJADSCChecklistException</code> if it could not be found.
	 *
	 * @param jadscChecklistId the primary key of the jadsc checklist
	 * @return the jadsc checklist
	 * @throws NoSuchJADSCChecklistException if a jadsc checklist with the primary key could not be found
	 */
	public JADSCChecklist findByPrimaryKey(long jadscChecklistId)
		throws NoSuchJADSCChecklistException;

	/**
	 * Returns the jadsc checklist with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscChecklistId the primary key of the jadsc checklist
	 * @return the jadsc checklist, or <code>null</code> if a jadsc checklist with the primary key could not be found
	 */
	public JADSCChecklist fetchByPrimaryKey(long jadscChecklistId);

	/**
	 * Returns all the jadsc checklists.
	 *
	 * @return the jadsc checklists
	 */
	public java.util.List<JADSCChecklist> findAll();

	/**
	 * Returns a range of all the jadsc checklists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @return the range of jadsc checklists
	 */
	public java.util.List<JADSCChecklist> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jadsc checklists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc checklists
	 */
	public java.util.List<JADSCChecklist> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc checklists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCChecklistModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc checklists
	 * @param end the upper bound of the range of jadsc checklists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc checklists
	 */
	public java.util.List<JADSCChecklist> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JADSCChecklist>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jadsc checklists from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jadsc checklists.
	 *
	 * @return the number of jadsc checklists
	 */
	public int countAll();

}