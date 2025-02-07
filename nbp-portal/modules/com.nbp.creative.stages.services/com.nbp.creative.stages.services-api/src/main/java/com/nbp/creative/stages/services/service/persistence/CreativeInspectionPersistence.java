/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.creative.stages.services.exception.NoSuchCreativeInspectionException;
import com.nbp.creative.stages.services.model.CreativeInspection;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the creative inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeInspectionUtil
 * @generated
 */
@ProviderType
public interface CreativeInspectionPersistence
	extends BasePersistence<CreativeInspection> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CreativeInspectionUtil} to access the creative inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the creative inspection where caseId = &#63; or throws a <code>NoSuchCreativeInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public CreativeInspection findBygetCreativeInspectionBy_CI(String caseId)
		throws NoSuchCreativeInspectionException;

	/**
	 * Returns the creative inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public CreativeInspection fetchBygetCreativeInspectionBy_CI(String caseId);

	/**
	 * Returns the creative inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public CreativeInspection fetchBygetCreativeInspectionBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the creative inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the creative inspection that was removed
	 */
	public CreativeInspection removeBygetCreativeInspectionBy_CI(String caseId)
		throws NoSuchCreativeInspectionException;

	/**
	 * Returns the number of creative inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching creative inspections
	 */
	public int countBygetCreativeInspectionBy_CI(String caseId);

	/**
	 * Returns all the creative inspections where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the matching creative inspections
	 */
	public java.util.List<CreativeInspection> findBygetCI_CAI(
		long creativeApplicationId);

	/**
	 * Returns a range of all the creative inspections where creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @return the range of matching creative inspections
	 */
	public java.util.List<CreativeInspection> findBygetCI_CAI(
		long creativeApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the creative inspections where creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative inspections
	 */
	public java.util.List<CreativeInspection> findBygetCI_CAI(
		long creativeApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the creative inspections where creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative inspections
	 */
	public java.util.List<CreativeInspection> findBygetCI_CAI(
		long creativeApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first creative inspection in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public CreativeInspection findBygetCI_CAI_First(
			long creativeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
				orderByComparator)
		throws NoSuchCreativeInspectionException;

	/**
	 * Returns the first creative inspection in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public CreativeInspection fetchBygetCI_CAI_First(
		long creativeApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
			orderByComparator);

	/**
	 * Returns the last creative inspection in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public CreativeInspection findBygetCI_CAI_Last(
			long creativeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
				orderByComparator)
		throws NoSuchCreativeInspectionException;

	/**
	 * Returns the last creative inspection in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public CreativeInspection fetchBygetCI_CAI_Last(
		long creativeApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
			orderByComparator);

	/**
	 * Returns the creative inspections before and after the current creative inspection in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeInspectionId the primary key of the current creative inspection
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative inspection
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	public CreativeInspection[] findBygetCI_CAI_PrevAndNext(
			long creativeInspectionId, long creativeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
				orderByComparator)
		throws NoSuchCreativeInspectionException;

	/**
	 * Removes all the creative inspections where creativeApplicationId = &#63; from the database.
	 *
	 * @param creativeApplicationId the creative application ID
	 */
	public void removeBygetCI_CAI(long creativeApplicationId);

	/**
	 * Returns the number of creative inspections where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the number of matching creative inspections
	 */
	public int countBygetCI_CAI(long creativeApplicationId);

	/**
	 * Returns all the creative inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching creative inspections
	 */
	public java.util.List<CreativeInspection> findBygetCI_CaseId(String caseId);

	/**
	 * Returns a range of all the creative inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @return the range of matching creative inspections
	 */
	public java.util.List<CreativeInspection> findBygetCI_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the creative inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative inspections
	 */
	public java.util.List<CreativeInspection> findBygetCI_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the creative inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative inspections
	 */
	public java.util.List<CreativeInspection> findBygetCI_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first creative inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public CreativeInspection findBygetCI_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
				orderByComparator)
		throws NoSuchCreativeInspectionException;

	/**
	 * Returns the first creative inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public CreativeInspection fetchBygetCI_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
			orderByComparator);

	/**
	 * Returns the last creative inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public CreativeInspection findBygetCI_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
				orderByComparator)
		throws NoSuchCreativeInspectionException;

	/**
	 * Returns the last creative inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public CreativeInspection fetchBygetCI_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
			orderByComparator);

	/**
	 * Returns the creative inspections before and after the current creative inspection in the ordered set where caseId = &#63;.
	 *
	 * @param creativeInspectionId the primary key of the current creative inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative inspection
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	public CreativeInspection[] findBygetCI_CaseId_PrevAndNext(
			long creativeInspectionId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
				orderByComparator)
		throws NoSuchCreativeInspectionException;

	/**
	 * Removes all the creative inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetCI_CaseId(String caseId);

	/**
	 * Returns the number of creative inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching creative inspections
	 */
	public int countBygetCI_CaseId(String caseId);

	/**
	 * Returns all the creative inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching creative inspections
	 */
	public java.util.List<CreativeInspection> findBygetCI_Status(String status);

	/**
	 * Returns a range of all the creative inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @return the range of matching creative inspections
	 */
	public java.util.List<CreativeInspection> findBygetCI_Status(
		String status, int start, int end);

	/**
	 * Returns an ordered range of all the creative inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative inspections
	 */
	public java.util.List<CreativeInspection> findBygetCI_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the creative inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative inspections
	 */
	public java.util.List<CreativeInspection> findBygetCI_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first creative inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public CreativeInspection findBygetCI_Status_First(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
				orderByComparator)
		throws NoSuchCreativeInspectionException;

	/**
	 * Returns the first creative inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public CreativeInspection fetchBygetCI_Status_First(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
			orderByComparator);

	/**
	 * Returns the last creative inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public CreativeInspection findBygetCI_Status_Last(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
				orderByComparator)
		throws NoSuchCreativeInspectionException;

	/**
	 * Returns the last creative inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public CreativeInspection fetchBygetCI_Status_Last(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
			orderByComparator);

	/**
	 * Returns the creative inspections before and after the current creative inspection in the ordered set where status = &#63;.
	 *
	 * @param creativeInspectionId the primary key of the current creative inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative inspection
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	public CreativeInspection[] findBygetCI_Status_PrevAndNext(
			long creativeInspectionId, String status,
			com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
				orderByComparator)
		throws NoSuchCreativeInspectionException;

	/**
	 * Removes all the creative inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetCI_Status(String status);

	/**
	 * Returns the number of creative inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching creative inspections
	 */
	public int countBygetCI_Status(String status);

	/**
	 * Returns all the creative inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching creative inspections
	 */
	public java.util.List<CreativeInspection> findBygetCI_CaseIdStatus(
		String status, String caseId);

	/**
	 * Returns a range of all the creative inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @return the range of matching creative inspections
	 */
	public java.util.List<CreativeInspection> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the creative inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative inspections
	 */
	public java.util.List<CreativeInspection> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the creative inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative inspections
	 */
	public java.util.List<CreativeInspection> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first creative inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public CreativeInspection findBygetCI_CaseIdStatus_First(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
				orderByComparator)
		throws NoSuchCreativeInspectionException;

	/**
	 * Returns the first creative inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public CreativeInspection fetchBygetCI_CaseIdStatus_First(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
			orderByComparator);

	/**
	 * Returns the last creative inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public CreativeInspection findBygetCI_CaseIdStatus_Last(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
				orderByComparator)
		throws NoSuchCreativeInspectionException;

	/**
	 * Returns the last creative inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public CreativeInspection fetchBygetCI_CaseIdStatus_Last(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
			orderByComparator);

	/**
	 * Returns the creative inspections before and after the current creative inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param creativeInspectionId the primary key of the current creative inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative inspection
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	public CreativeInspection[] findBygetCI_CaseIdStatus_PrevAndNext(
			long creativeInspectionId, String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
				orderByComparator)
		throws NoSuchCreativeInspectionException;

	/**
	 * Removes all the creative inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public void removeBygetCI_CaseIdStatus(String status, String caseId);

	/**
	 * Returns the number of creative inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching creative inspections
	 */
	public int countBygetCI_CaseIdStatus(String status, String caseId);

	/**
	 * Returns all the creative inspections where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @return the matching creative inspections
	 */
	public java.util.List<CreativeInspection> findBygetCI_CaseIdApplicationId(
		String status, long creativeApplicationId);

	/**
	 * Returns a range of all the creative inspections where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @return the range of matching creative inspections
	 */
	public java.util.List<CreativeInspection> findBygetCI_CaseIdApplicationId(
		String status, long creativeApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the creative inspections where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative inspections
	 */
	public java.util.List<CreativeInspection> findBygetCI_CaseIdApplicationId(
		String status, long creativeApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the creative inspections where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative inspections
	 */
	public java.util.List<CreativeInspection> findBygetCI_CaseIdApplicationId(
		String status, long creativeApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first creative inspection in the ordered set where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public CreativeInspection findBygetCI_CaseIdApplicationId_First(
			String status, long creativeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
				orderByComparator)
		throws NoSuchCreativeInspectionException;

	/**
	 * Returns the first creative inspection in the ordered set where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public CreativeInspection fetchBygetCI_CaseIdApplicationId_First(
		String status, long creativeApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
			orderByComparator);

	/**
	 * Returns the last creative inspection in the ordered set where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public CreativeInspection findBygetCI_CaseIdApplicationId_Last(
			String status, long creativeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
				orderByComparator)
		throws NoSuchCreativeInspectionException;

	/**
	 * Returns the last creative inspection in the ordered set where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public CreativeInspection fetchBygetCI_CaseIdApplicationId_Last(
		String status, long creativeApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
			orderByComparator);

	/**
	 * Returns the creative inspections before and after the current creative inspection in the ordered set where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param creativeInspectionId the primary key of the current creative inspection
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative inspection
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	public CreativeInspection[] findBygetCI_CaseIdApplicationId_PrevAndNext(
			long creativeInspectionId, String status,
			long creativeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
				orderByComparator)
		throws NoSuchCreativeInspectionException;

	/**
	 * Removes all the creative inspections where status = &#63; and creativeApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 */
	public void removeBygetCI_CaseIdApplicationId(
		String status, long creativeApplicationId);

	/**
	 * Returns the number of creative inspections where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @return the number of matching creative inspections
	 */
	public int countBygetCI_CaseIdApplicationId(
		String status, long creativeApplicationId);

	/**
	 * Returns the creative inspection where status = &#63; and slotBookedByUser = &#63; and creativeApplicationId = &#63; or throws a <code>NoSuchCreativeInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param creativeApplicationId the creative application ID
	 * @return the matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public CreativeInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long creativeApplicationId)
		throws NoSuchCreativeInspectionException;

	/**
	 * Returns the creative inspection where status = &#63; and slotBookedByUser = &#63; and creativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param creativeApplicationId the creative application ID
	 * @return the matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public CreativeInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long creativeApplicationId);

	/**
	 * Returns the creative inspection where status = &#63; and slotBookedByUser = &#63; and creativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param creativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public CreativeInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long creativeApplicationId,
			boolean useFinderCache);

	/**
	 * Removes the creative inspection where status = &#63; and slotBookedByUser = &#63; and creativeApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param creativeApplicationId the creative application ID
	 * @return the creative inspection that was removed
	 */
	public CreativeInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long creativeApplicationId)
		throws NoSuchCreativeInspectionException;

	/**
	 * Returns the number of creative inspections where status = &#63; and slotBookedByUser = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param creativeApplicationId the creative application ID
	 * @return the number of matching creative inspections
	 */
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long creativeApplicationId);

	/**
	 * Caches the creative inspection in the entity cache if it is enabled.
	 *
	 * @param creativeInspection the creative inspection
	 */
	public void cacheResult(CreativeInspection creativeInspection);

	/**
	 * Caches the creative inspections in the entity cache if it is enabled.
	 *
	 * @param creativeInspections the creative inspections
	 */
	public void cacheResult(
		java.util.List<CreativeInspection> creativeInspections);

	/**
	 * Creates a new creative inspection with the primary key. Does not add the creative inspection to the database.
	 *
	 * @param creativeInspectionId the primary key for the new creative inspection
	 * @return the new creative inspection
	 */
	public CreativeInspection create(long creativeInspectionId);

	/**
	 * Removes the creative inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeInspectionId the primary key of the creative inspection
	 * @return the creative inspection that was removed
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	public CreativeInspection remove(long creativeInspectionId)
		throws NoSuchCreativeInspectionException;

	public CreativeInspection updateImpl(CreativeInspection creativeInspection);

	/**
	 * Returns the creative inspection with the primary key or throws a <code>NoSuchCreativeInspectionException</code> if it could not be found.
	 *
	 * @param creativeInspectionId the primary key of the creative inspection
	 * @return the creative inspection
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	public CreativeInspection findByPrimaryKey(long creativeInspectionId)
		throws NoSuchCreativeInspectionException;

	/**
	 * Returns the creative inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeInspectionId the primary key of the creative inspection
	 * @return the creative inspection, or <code>null</code> if a creative inspection with the primary key could not be found
	 */
	public CreativeInspection fetchByPrimaryKey(long creativeInspectionId);

	/**
	 * Returns all the creative inspections.
	 *
	 * @return the creative inspections
	 */
	public java.util.List<CreativeInspection> findAll();

	/**
	 * Returns a range of all the creative inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @return the range of creative inspections
	 */
	public java.util.List<CreativeInspection> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the creative inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative inspections
	 */
	public java.util.List<CreativeInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the creative inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative inspections
	 */
	public java.util.List<CreativeInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the creative inspections from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of creative inspections.
	 *
	 * @return the number of creative inspections
	 */
	public int countAll();

}