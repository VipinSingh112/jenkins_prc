/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.collaboration.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.cannabis.collaboration.services.exception.NoSuchCannabisCollobartionException;
import com.nbp.cannabis.collaboration.services.model.CannabisCollobartion;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis collobartion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisCollobartionUtil
 * @generated
 */
@ProviderType
public interface CannabisCollobartionPersistence
	extends BasePersistence<CannabisCollobartion> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisCollobartionUtil} to access the cannabis collobartion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cannabis collobartions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findByUuid(String uuid);

	/**
	 * Returns a range of all the cannabis collobartions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis collobartions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis collobartions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException;

	/**
	 * Returns the first cannabis collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator);

	/**
	 * Returns the last cannabis collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException;

	/**
	 * Returns the last cannabis collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator);

	/**
	 * Returns the cannabis collobartions before and after the current cannabis collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisCollaborationId the primary key of the current cannabis collobartion
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	public CannabisCollobartion[] findByUuid_PrevAndNext(
			long cannabisCollaborationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException;

	/**
	 * Removes all the cannabis collobartions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of cannabis collobartions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis collobartions
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the cannabis collobartion where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisCollobartionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion findByUUID_G(String uuid, long groupId)
		throws NoSuchCannabisCollobartionException;

	/**
	 * Returns the cannabis collobartion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the cannabis collobartion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the cannabis collobartion where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis collobartion that was removed
	 */
	public CannabisCollobartion removeByUUID_G(String uuid, long groupId)
		throws NoSuchCannabisCollobartionException;

	/**
	 * Returns the number of cannabis collobartions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis collobartions
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the cannabis collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the cannabis collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException;

	/**
	 * Returns the first cannabis collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator);

	/**
	 * Returns the last cannabis collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException;

	/**
	 * Returns the last cannabis collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator);

	/**
	 * Returns the cannabis collobartions before and after the current cannabis collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cannabisCollaborationId the primary key of the current cannabis collobartion
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	public CannabisCollobartion[] findByUuid_C_PrevAndNext(
			long cannabisCollaborationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException;

	/**
	 * Removes all the cannabis collobartions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of cannabis collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis collobartions
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the cannabis collobartions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findBycaseId(String caseId);

	/**
	 * Returns a range of all the cannabis collobartions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findBycaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findBycaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findBycaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion findBycaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException;

	/**
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion fetchBycaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator);

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion findBycaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException;

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion fetchBycaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator);

	/**
	 * Returns the cannabis collobartions before and after the current cannabis collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisCollaborationId the primary key of the current cannabis collobartion
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	public CannabisCollobartion[] findBycaseId_PrevAndNext(
			long cannabisCollaborationId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException;

	/**
	 * Removes all the cannabis collobartions where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBycaseId(String caseId);

	/**
	 * Returns the number of cannabis collobartions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis collobartions
	 */
	public int countBycaseId(String caseId);

	/**
	 * Returns all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @return the matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findBycannabisStage_CaseId(
		String caseId, String cannabisStage);

	/**
	 * Returns a range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findBycannabisStage_CaseId(
		String caseId, String cannabisStage, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findBycannabisStage_CaseId(
		String caseId, String cannabisStage, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findBycannabisStage_CaseId(
		String caseId, String cannabisStage, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion findBycannabisStage_CaseId_First(
			String caseId, String cannabisStage,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException;

	/**
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion fetchBycannabisStage_CaseId_First(
		String caseId, String cannabisStage,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator);

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion findBycannabisStage_CaseId_Last(
			String caseId, String cannabisStage,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException;

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion fetchBycannabisStage_CaseId_Last(
		String caseId, String cannabisStage,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator);

	/**
	 * Returns the cannabis collobartions before and after the current cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * @param cannabisCollaborationId the primary key of the current cannabis collobartion
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	public CannabisCollobartion[] findBycannabisStage_CaseId_PrevAndNext(
			long cannabisCollaborationId, String caseId, String cannabisStage,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException;

	/**
	 * Removes all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 */
	public void removeBycannabisStage_CaseId(
		String caseId, String cannabisStage);

	/**
	 * Returns the number of cannabis collobartions where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @return the number of matching cannabis collobartions
	 */
	public int countBycannabisStage_CaseId(String caseId, String cannabisStage);

	/**
	 * Returns all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @return the matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findBycannabisStage_CU(
		String caseId, String cannabisStage, String userType);

	/**
	 * Returns a range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findBycannabisStage_CU(
		String caseId, String cannabisStage, String userType, int start,
		int end);

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findBycannabisStage_CU(
		String caseId, String cannabisStage, String userType, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findBycannabisStage_CU(
		String caseId, String cannabisStage, String userType, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion findBycannabisStage_CU_First(
			String caseId, String cannabisStage, String userType,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException;

	/**
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion fetchBycannabisStage_CU_First(
		String caseId, String cannabisStage, String userType,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator);

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion findBycannabisStage_CU_Last(
			String caseId, String cannabisStage, String userType,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException;

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion fetchBycannabisStage_CU_Last(
		String caseId, String cannabisStage, String userType,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator);

	/**
	 * Returns the cannabis collobartions before and after the current cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * @param cannabisCollaborationId the primary key of the current cannabis collobartion
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	public CannabisCollobartion[] findBycannabisStage_CU_PrevAndNext(
			long cannabisCollaborationId, String caseId, String cannabisStage,
			String userType,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException;

	/**
	 * Removes all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 */
	public void removeBycannabisStage_CU(
		String caseId, String cannabisStage, String userType);

	/**
	 * Returns the number of cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @return the number of matching cannabis collobartions
	 */
	public int countBycannabisStage_CU(
		String caseId, String cannabisStage, String userType);

	/**
	 * Returns all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @return the matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findBycannabisStage_CUA(
		String caseId, String cannabisStage, String userType, int archived);

	/**
	 * Returns a range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findBycannabisStage_CUA(
		String caseId, String cannabisStage, String userType, int archived,
		int start, int end);

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findBycannabisStage_CUA(
		String caseId, String cannabisStage, String userType, int archived,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findBycannabisStage_CUA(
		String caseId, String cannabisStage, String userType, int archived,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion findBycannabisStage_CUA_First(
			String caseId, String cannabisStage, String userType, int archived,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException;

	/**
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion fetchBycannabisStage_CUA_First(
		String caseId, String cannabisStage, String userType, int archived,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator);

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion findBycannabisStage_CUA_Last(
			String caseId, String cannabisStage, String userType, int archived,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException;

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public CannabisCollobartion fetchBycannabisStage_CUA_Last(
		String caseId, String cannabisStage, String userType, int archived,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator);

	/**
	 * Returns the cannabis collobartions before and after the current cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param cannabisCollaborationId the primary key of the current cannabis collobartion
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	public CannabisCollobartion[] findBycannabisStage_CUA_PrevAndNext(
			long cannabisCollaborationId, String caseId, String cannabisStage,
			String userType, int archived,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisCollobartion> orderByComparator)
		throws NoSuchCannabisCollobartionException;

	/**
	 * Removes all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 */
	public void removeBycannabisStage_CUA(
		String caseId, String cannabisStage, String userType, int archived);

	/**
	 * Returns the number of cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @return the number of matching cannabis collobartions
	 */
	public int countBycannabisStage_CUA(
		String caseId, String cannabisStage, String userType, int archived);

	/**
	 * Caches the cannabis collobartion in the entity cache if it is enabled.
	 *
	 * @param cannabisCollobartion the cannabis collobartion
	 */
	public void cacheResult(CannabisCollobartion cannabisCollobartion);

	/**
	 * Caches the cannabis collobartions in the entity cache if it is enabled.
	 *
	 * @param cannabisCollobartions the cannabis collobartions
	 */
	public void cacheResult(
		java.util.List<CannabisCollobartion> cannabisCollobartions);

	/**
	 * Creates a new cannabis collobartion with the primary key. Does not add the cannabis collobartion to the database.
	 *
	 * @param cannabisCollaborationId the primary key for the new cannabis collobartion
	 * @return the new cannabis collobartion
	 */
	public CannabisCollobartion create(long cannabisCollaborationId);

	/**
	 * Removes the cannabis collobartion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisCollaborationId the primary key of the cannabis collobartion
	 * @return the cannabis collobartion that was removed
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	public CannabisCollobartion remove(long cannabisCollaborationId)
		throws NoSuchCannabisCollobartionException;

	public CannabisCollobartion updateImpl(
		CannabisCollobartion cannabisCollobartion);

	/**
	 * Returns the cannabis collobartion with the primary key or throws a <code>NoSuchCannabisCollobartionException</code> if it could not be found.
	 *
	 * @param cannabisCollaborationId the primary key of the cannabis collobartion
	 * @return the cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	public CannabisCollobartion findByPrimaryKey(long cannabisCollaborationId)
		throws NoSuchCannabisCollobartionException;

	/**
	 * Returns the cannabis collobartion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisCollaborationId the primary key of the cannabis collobartion
	 * @return the cannabis collobartion, or <code>null</code> if a cannabis collobartion with the primary key could not be found
	 */
	public CannabisCollobartion fetchByPrimaryKey(long cannabisCollaborationId);

	/**
	 * Returns all the cannabis collobartions.
	 *
	 * @return the cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findAll();

	/**
	 * Returns a range of all the cannabis collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the cannabis collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis collobartions
	 */
	public java.util.List<CannabisCollobartion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisCollobartion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis collobartions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis collobartions.
	 *
	 * @return the number of cannabis collobartions
	 */
	public int countAll();

}