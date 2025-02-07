/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.collaboration.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.collaboration.services.exception.NoSuchCollobartionException;
import com.nbp.collaboration.services.model.Collobartion;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the collobartion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CollobartionUtil
 * @generated
 */
@ProviderType
public interface CollobartionPersistence extends BasePersistence<Collobartion> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CollobartionUtil} to access the collobartion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the collobartions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching collobartions
	 */
	public java.util.List<Collobartion> findByUuid(String uuid);

	/**
	 * Returns a range of all the collobartions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of matching collobartions
	 */
	public java.util.List<Collobartion> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the collobartions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching collobartions
	 */
	public java.util.List<Collobartion> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the collobartions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching collobartions
	 */
	public java.util.List<Collobartion> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public Collobartion findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
				orderByComparator)
		throws NoSuchCollobartionException;

	/**
	 * Returns the first collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public Collobartion fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator);

	/**
	 * Returns the last collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public Collobartion findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
				orderByComparator)
		throws NoSuchCollobartionException;

	/**
	 * Returns the last collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public Collobartion fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator);

	/**
	 * Returns the collobartions before and after the current collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param collaborationId the primary key of the current collobartion
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next collobartion
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	public Collobartion[] findByUuid_PrevAndNext(
			long collaborationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
				orderByComparator)
		throws NoSuchCollobartionException;

	/**
	 * Removes all the collobartions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of collobartions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching collobartions
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the collobartion where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCollobartionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public Collobartion findByUUID_G(String uuid, long groupId)
		throws NoSuchCollobartionException;

	/**
	 * Returns the collobartion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public Collobartion fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the collobartion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public Collobartion fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the collobartion where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the collobartion that was removed
	 */
	public Collobartion removeByUUID_G(String uuid, long groupId)
		throws NoSuchCollobartionException;

	/**
	 * Returns the number of collobartions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching collobartions
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching collobartions
	 */
	public java.util.List<Collobartion> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of matching collobartions
	 */
	public java.util.List<Collobartion> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching collobartions
	 */
	public java.util.List<Collobartion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching collobartions
	 */
	public java.util.List<Collobartion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public Collobartion findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
				orderByComparator)
		throws NoSuchCollobartionException;

	/**
	 * Returns the first collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public Collobartion fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator);

	/**
	 * Returns the last collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public Collobartion findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
				orderByComparator)
		throws NoSuchCollobartionException;

	/**
	 * Returns the last collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public Collobartion fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator);

	/**
	 * Returns the collobartions before and after the current collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param collaborationId the primary key of the current collobartion
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next collobartion
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	public Collobartion[] findByUuid_C_PrevAndNext(
			long collaborationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
				orderByComparator)
		throws NoSuchCollobartionException;

	/**
	 * Removes all the collobartions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching collobartions
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the collobartions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching collobartions
	 */
	public java.util.List<Collobartion> findBycaseId(String caseId);

	/**
	 * Returns a range of all the collobartions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of matching collobartions
	 */
	public java.util.List<Collobartion> findBycaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching collobartions
	 */
	public java.util.List<Collobartion> findBycaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching collobartions
	 */
	public java.util.List<Collobartion> findBycaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public Collobartion findBycaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
				orderByComparator)
		throws NoSuchCollobartionException;

	/**
	 * Returns the first collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public Collobartion fetchBycaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator);

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public Collobartion findBycaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
				orderByComparator)
		throws NoSuchCollobartionException;

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public Collobartion fetchBycaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator);

	/**
	 * Returns the collobartions before and after the current collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param collaborationId the primary key of the current collobartion
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next collobartion
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	public Collobartion[] findBycaseId_PrevAndNext(
			long collaborationId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
				orderByComparator)
		throws NoSuchCollobartionException;

	/**
	 * Removes all the collobartions where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBycaseId(String caseId);

	/**
	 * Returns the number of collobartions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching collobartions
	 */
	public int countBycaseId(String caseId);

	/**
	 * Returns all the collobartions where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching collobartions
	 */
	public java.util.List<Collobartion> findBystageName_CaseId(
		String caseId, String stageName);

	/**
	 * Returns a range of all the collobartions where caseId = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of matching collobartions
	 */
	public java.util.List<Collobartion> findBystageName_CaseId(
		String caseId, String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching collobartions
	 */
	public java.util.List<Collobartion> findBystageName_CaseId(
		String caseId, String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching collobartions
	 */
	public java.util.List<Collobartion> findBystageName_CaseId(
		String caseId, String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first collobartion in the ordered set where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public Collobartion findBystageName_CaseId_First(
			String caseId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
				orderByComparator)
		throws NoSuchCollobartionException;

	/**
	 * Returns the first collobartion in the ordered set where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public Collobartion fetchBystageName_CaseId_First(
		String caseId, String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator);

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public Collobartion findBystageName_CaseId_Last(
			String caseId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
				orderByComparator)
		throws NoSuchCollobartionException;

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public Collobartion fetchBystageName_CaseId_Last(
		String caseId, String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator);

	/**
	 * Returns the collobartions before and after the current collobartion in the ordered set where caseId = &#63; and stageName = &#63;.
	 *
	 * @param collaborationId the primary key of the current collobartion
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next collobartion
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	public Collobartion[] findBystageName_CaseId_PrevAndNext(
			long collaborationId, String caseId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
				orderByComparator)
		throws NoSuchCollobartionException;

	/**
	 * Removes all the collobartions where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 */
	public void removeBystageName_CaseId(String caseId, String stageName);

	/**
	 * Returns the number of collobartions where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching collobartions
	 */
	public int countBystageName_CaseId(String caseId, String stageName);

	/**
	 * Returns all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @return the matching collobartions
	 */
	public java.util.List<Collobartion> findByStage_CU(
		String caseId, String stageName, String userType);

	/**
	 * Returns a range of all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of matching collobartions
	 */
	public java.util.List<Collobartion> findByStage_CU(
		String caseId, String stageName, String userType, int start, int end);

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching collobartions
	 */
	public java.util.List<Collobartion> findByStage_CU(
		String caseId, String stageName, String userType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching collobartions
	 */
	public java.util.List<Collobartion> findByStage_CU(
		String caseId, String stageName, String userType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public Collobartion findByStage_CU_First(
			String caseId, String stageName, String userType,
			com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
				orderByComparator)
		throws NoSuchCollobartionException;

	/**
	 * Returns the first collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public Collobartion fetchByStage_CU_First(
		String caseId, String stageName, String userType,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator);

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public Collobartion findByStage_CU_Last(
			String caseId, String stageName, String userType,
			com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
				orderByComparator)
		throws NoSuchCollobartionException;

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public Collobartion fetchByStage_CU_Last(
		String caseId, String stageName, String userType,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator);

	/**
	 * Returns the collobartions before and after the current collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * @param collaborationId the primary key of the current collobartion
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next collobartion
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	public Collobartion[] findByStage_CU_PrevAndNext(
			long collaborationId, String caseId, String stageName,
			String userType,
			com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
				orderByComparator)
		throws NoSuchCollobartionException;

	/**
	 * Removes all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 */
	public void removeByStage_CU(
		String caseId, String stageName, String userType);

	/**
	 * Returns the number of collobartions where caseId = &#63; and stageName = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @return the number of matching collobartions
	 */
	public int countByStage_CU(
		String caseId, String stageName, String userType);

	/**
	 * Returns all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @return the matching collobartions
	 */
	public java.util.List<Collobartion> findByStage_CUA(
		String caseId, String stageName, String userType, int archived);

	/**
	 * Returns a range of all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of matching collobartions
	 */
	public java.util.List<Collobartion> findByStage_CUA(
		String caseId, String stageName, String userType, int archived,
		int start, int end);

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching collobartions
	 */
	public java.util.List<Collobartion> findByStage_CUA(
		String caseId, String stageName, String userType, int archived,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching collobartions
	 */
	public java.util.List<Collobartion> findByStage_CUA(
		String caseId, String stageName, String userType, int archived,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public Collobartion findByStage_CUA_First(
			String caseId, String stageName, String userType, int archived,
			com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
				orderByComparator)
		throws NoSuchCollobartionException;

	/**
	 * Returns the first collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public Collobartion fetchByStage_CUA_First(
		String caseId, String stageName, String userType, int archived,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator);

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion
	 * @throws NoSuchCollobartionException if a matching collobartion could not be found
	 */
	public Collobartion findByStage_CUA_Last(
			String caseId, String stageName, String userType, int archived,
			com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
				orderByComparator)
		throws NoSuchCollobartionException;

	/**
	 * Returns the last collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching collobartion, or <code>null</code> if a matching collobartion could not be found
	 */
	public Collobartion fetchByStage_CUA_Last(
		String caseId, String stageName, String userType, int archived,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator);

	/**
	 * Returns the collobartions before and after the current collobartion in the ordered set where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param collaborationId the primary key of the current collobartion
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next collobartion
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	public Collobartion[] findByStage_CUA_PrevAndNext(
			long collaborationId, String caseId, String stageName,
			String userType, int archived,
			com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
				orderByComparator)
		throws NoSuchCollobartionException;

	/**
	 * Removes all the collobartions where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 */
	public void removeByStage_CUA(
		String caseId, String stageName, String userType, int archived);

	/**
	 * Returns the number of collobartions where caseId = &#63; and stageName = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param userType the user type
	 * @param archived the archived
	 * @return the number of matching collobartions
	 */
	public int countByStage_CUA(
		String caseId, String stageName, String userType, int archived);

	/**
	 * Caches the collobartion in the entity cache if it is enabled.
	 *
	 * @param collobartion the collobartion
	 */
	public void cacheResult(Collobartion collobartion);

	/**
	 * Caches the collobartions in the entity cache if it is enabled.
	 *
	 * @param collobartions the collobartions
	 */
	public void cacheResult(java.util.List<Collobartion> collobartions);

	/**
	 * Creates a new collobartion with the primary key. Does not add the collobartion to the database.
	 *
	 * @param collaborationId the primary key for the new collobartion
	 * @return the new collobartion
	 */
	public Collobartion create(long collaborationId);

	/**
	 * Removes the collobartion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param collaborationId the primary key of the collobartion
	 * @return the collobartion that was removed
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	public Collobartion remove(long collaborationId)
		throws NoSuchCollobartionException;

	public Collobartion updateImpl(Collobartion collobartion);

	/**
	 * Returns the collobartion with the primary key or throws a <code>NoSuchCollobartionException</code> if it could not be found.
	 *
	 * @param collaborationId the primary key of the collobartion
	 * @return the collobartion
	 * @throws NoSuchCollobartionException if a collobartion with the primary key could not be found
	 */
	public Collobartion findByPrimaryKey(long collaborationId)
		throws NoSuchCollobartionException;

	/**
	 * Returns the collobartion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param collaborationId the primary key of the collobartion
	 * @return the collobartion, or <code>null</code> if a collobartion with the primary key could not be found
	 */
	public Collobartion fetchByPrimaryKey(long collaborationId);

	/**
	 * Returns all the collobartions.
	 *
	 * @return the collobartions
	 */
	public java.util.List<Collobartion> findAll();

	/**
	 * Returns a range of all the collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @return the range of collobartions
	 */
	public java.util.List<Collobartion> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of collobartions
	 */
	public java.util.List<Collobartion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator);

	/**
	 * Returns an ordered range of all the collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of collobartions
	 * @param end the upper bound of the range of collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of collobartions
	 */
	public java.util.List<Collobartion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Collobartion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the collobartions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of collobartions.
	 *
	 * @return the number of collobartions
	 */
	public int countAll();

}