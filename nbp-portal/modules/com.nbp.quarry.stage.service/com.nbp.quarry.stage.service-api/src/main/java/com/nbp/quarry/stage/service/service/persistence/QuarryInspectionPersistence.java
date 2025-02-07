/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.quarry.stage.service.exception.NoSuchQuarryInspectionException;
import com.nbp.quarry.stage.service.model.QuarryInspection;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the quarry inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryInspectionUtil
 * @generated
 */
@ProviderType
public interface QuarryInspectionPersistence
	extends BasePersistence<QuarryInspection> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QuarryInspectionUtil} to access the quarry inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the quarry inspection where caseId = &#63; or throws a <code>NoSuchQuarryInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public QuarryInspection findBygetQuarryInspectionBy_CI(String caseId)
		throws NoSuchQuarryInspectionException;

	/**
	 * Returns the quarry inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public QuarryInspection fetchBygetQuarryInspectionBy_CI(String caseId);

	/**
	 * Returns the quarry inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public QuarryInspection fetchBygetQuarryInspectionBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the quarry inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the quarry inspection that was removed
	 */
	public QuarryInspection removeBygetQuarryInspectionBy_CI(String caseId)
		throws NoSuchQuarryInspectionException;

	/**
	 * Returns the number of quarry inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry inspections
	 */
	public int countBygetQuarryInspectionBy_CI(String caseId);

	/**
	 * Returns all the quarry inspections where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry inspections
	 */
	public java.util.List<QuarryInspection> findBygetQuarry_FBAI(
		long quarryApplicationId);

	/**
	 * Returns a range of all the quarry inspections where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @return the range of matching quarry inspections
	 */
	public java.util.List<QuarryInspection> findBygetQuarry_FBAI(
		long quarryApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the quarry inspections where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry inspections
	 */
	public java.util.List<QuarryInspection> findBygetQuarry_FBAI(
		long quarryApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quarry inspections where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry inspections
	 */
	public java.util.List<QuarryInspection> findBygetQuarry_FBAI(
		long quarryApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first quarry inspection in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public QuarryInspection findBygetQuarry_FBAI_First(
			long quarryApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
				orderByComparator)
		throws NoSuchQuarryInspectionException;

	/**
	 * Returns the first quarry inspection in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public QuarryInspection fetchBygetQuarry_FBAI_First(
		long quarryApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
			orderByComparator);

	/**
	 * Returns the last quarry inspection in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public QuarryInspection findBygetQuarry_FBAI_Last(
			long quarryApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
				orderByComparator)
		throws NoSuchQuarryInspectionException;

	/**
	 * Returns the last quarry inspection in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public QuarryInspection fetchBygetQuarry_FBAI_Last(
		long quarryApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
			orderByComparator);

	/**
	 * Returns the quarry inspections before and after the current quarry inspection in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryInspectionId the primary key of the current quarry inspection
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry inspection
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	public QuarryInspection[] findBygetQuarry_FBAI_PrevAndNext(
			long quarryInspectionId, long quarryApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
				orderByComparator)
		throws NoSuchQuarryInspectionException;

	/**
	 * Removes all the quarry inspections where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 */
	public void removeBygetQuarry_FBAI(long quarryApplicationId);

	/**
	 * Returns the number of quarry inspections where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry inspections
	 */
	public int countBygetQuarry_FBAI(long quarryApplicationId);

	/**
	 * Returns all the quarry inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry inspections
	 */
	public java.util.List<QuarryInspection> findBygetQuarry_CaseId(
		String caseId);

	/**
	 * Returns a range of all the quarry inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @return the range of matching quarry inspections
	 */
	public java.util.List<QuarryInspection> findBygetQuarry_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the quarry inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry inspections
	 */
	public java.util.List<QuarryInspection> findBygetQuarry_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quarry inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry inspections
	 */
	public java.util.List<QuarryInspection> findBygetQuarry_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first quarry inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public QuarryInspection findBygetQuarry_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
				orderByComparator)
		throws NoSuchQuarryInspectionException;

	/**
	 * Returns the first quarry inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public QuarryInspection fetchBygetQuarry_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
			orderByComparator);

	/**
	 * Returns the last quarry inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public QuarryInspection findBygetQuarry_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
				orderByComparator)
		throws NoSuchQuarryInspectionException;

	/**
	 * Returns the last quarry inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public QuarryInspection fetchBygetQuarry_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
			orderByComparator);

	/**
	 * Returns the quarry inspections before and after the current quarry inspection in the ordered set where caseId = &#63;.
	 *
	 * @param quarryInspectionId the primary key of the current quarry inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry inspection
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	public QuarryInspection[] findBygetQuarry_CaseId_PrevAndNext(
			long quarryInspectionId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
				orderByComparator)
		throws NoSuchQuarryInspectionException;

	/**
	 * Removes all the quarry inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetQuarry_CaseId(String caseId);

	/**
	 * Returns the number of quarry inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry inspections
	 */
	public int countBygetQuarry_CaseId(String caseId);

	/**
	 * Returns all the quarry inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching quarry inspections
	 */
	public java.util.List<QuarryInspection> findBygetQuarry_Status(
		String status);

	/**
	 * Returns a range of all the quarry inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @return the range of matching quarry inspections
	 */
	public java.util.List<QuarryInspection> findBygetQuarry_Status(
		String status, int start, int end);

	/**
	 * Returns an ordered range of all the quarry inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry inspections
	 */
	public java.util.List<QuarryInspection> findBygetQuarry_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quarry inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry inspections
	 */
	public java.util.List<QuarryInspection> findBygetQuarry_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first quarry inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public QuarryInspection findBygetQuarry_Status_First(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
				orderByComparator)
		throws NoSuchQuarryInspectionException;

	/**
	 * Returns the first quarry inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public QuarryInspection fetchBygetQuarry_Status_First(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
			orderByComparator);

	/**
	 * Returns the last quarry inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public QuarryInspection findBygetQuarry_Status_Last(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
				orderByComparator)
		throws NoSuchQuarryInspectionException;

	/**
	 * Returns the last quarry inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public QuarryInspection fetchBygetQuarry_Status_Last(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
			orderByComparator);

	/**
	 * Returns the quarry inspections before and after the current quarry inspection in the ordered set where status = &#63;.
	 *
	 * @param quarryInspectionId the primary key of the current quarry inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry inspection
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	public QuarryInspection[] findBygetQuarry_Status_PrevAndNext(
			long quarryInspectionId, String status,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
				orderByComparator)
		throws NoSuchQuarryInspectionException;

	/**
	 * Removes all the quarry inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetQuarry_Status(String status);

	/**
	 * Returns the number of quarry inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching quarry inspections
	 */
	public int countBygetQuarry_Status(String status);

	/**
	 * Returns all the quarry inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching quarry inspections
	 */
	public java.util.List<QuarryInspection> findBygetQuarry_CaseIdStatus(
		String status, String caseId);

	/**
	 * Returns a range of all the quarry inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @return the range of matching quarry inspections
	 */
	public java.util.List<QuarryInspection> findBygetQuarry_CaseIdStatus(
		String status, String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the quarry inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry inspections
	 */
	public java.util.List<QuarryInspection> findBygetQuarry_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quarry inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry inspections
	 */
	public java.util.List<QuarryInspection> findBygetQuarry_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first quarry inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public QuarryInspection findBygetQuarry_CaseIdStatus_First(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
				orderByComparator)
		throws NoSuchQuarryInspectionException;

	/**
	 * Returns the first quarry inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public QuarryInspection fetchBygetQuarry_CaseIdStatus_First(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
			orderByComparator);

	/**
	 * Returns the last quarry inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public QuarryInspection findBygetQuarry_CaseIdStatus_Last(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
				orderByComparator)
		throws NoSuchQuarryInspectionException;

	/**
	 * Returns the last quarry inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public QuarryInspection fetchBygetQuarry_CaseIdStatus_Last(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
			orderByComparator);

	/**
	 * Returns the quarry inspections before and after the current quarry inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param quarryInspectionId the primary key of the current quarry inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry inspection
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	public QuarryInspection[] findBygetQuarry_CaseIdStatus_PrevAndNext(
			long quarryInspectionId, String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
				orderByComparator)
		throws NoSuchQuarryInspectionException;

	/**
	 * Removes all the quarry inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public void removeBygetQuarry_CaseIdStatus(String status, String caseId);

	/**
	 * Returns the number of quarry inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching quarry inspections
	 */
	public int countBygetQuarry_CaseIdStatus(String status, String caseId);

	/**
	 * Returns all the quarry inspections where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry inspections
	 */
	public java.util.List<QuarryInspection> findBygetQuarry_CaseIdApplicationId(
		String status, long quarryApplicationId);

	/**
	 * Returns a range of all the quarry inspections where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @return the range of matching quarry inspections
	 */
	public java.util.List<QuarryInspection> findBygetQuarry_CaseIdApplicationId(
		String status, long quarryApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the quarry inspections where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry inspections
	 */
	public java.util.List<QuarryInspection> findBygetQuarry_CaseIdApplicationId(
		String status, long quarryApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quarry inspections where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry inspections
	 */
	public java.util.List<QuarryInspection> findBygetQuarry_CaseIdApplicationId(
		String status, long quarryApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first quarry inspection in the ordered set where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public QuarryInspection findBygetQuarry_CaseIdApplicationId_First(
			String status, long quarryApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
				orderByComparator)
		throws NoSuchQuarryInspectionException;

	/**
	 * Returns the first quarry inspection in the ordered set where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public QuarryInspection fetchBygetQuarry_CaseIdApplicationId_First(
		String status, long quarryApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
			orderByComparator);

	/**
	 * Returns the last quarry inspection in the ordered set where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public QuarryInspection findBygetQuarry_CaseIdApplicationId_Last(
			String status, long quarryApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
				orderByComparator)
		throws NoSuchQuarryInspectionException;

	/**
	 * Returns the last quarry inspection in the ordered set where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public QuarryInspection fetchBygetQuarry_CaseIdApplicationId_Last(
		String status, long quarryApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
			orderByComparator);

	/**
	 * Returns the quarry inspections before and after the current quarry inspection in the ordered set where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param quarryInspectionId the primary key of the current quarry inspection
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry inspection
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	public QuarryInspection[] findBygetQuarry_CaseIdApplicationId_PrevAndNext(
			long quarryInspectionId, String status, long quarryApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
				orderByComparator)
		throws NoSuchQuarryInspectionException;

	/**
	 * Removes all the quarry inspections where status = &#63; and quarryApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 */
	public void removeBygetQuarry_CaseIdApplicationId(
		String status, long quarryApplicationId);

	/**
	 * Returns the number of quarry inspections where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry inspections
	 */
	public int countBygetQuarry_CaseIdApplicationId(
		String status, long quarryApplicationId);

	/**
	 * Returns the quarry inspection where status = &#63; and slotBookedByUser = &#63; and quarryApplicationId = &#63; or throws a <code>NoSuchQuarryInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public QuarryInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long quarryApplicationId)
		throws NoSuchQuarryInspectionException;

	/**
	 * Returns the quarry inspection where status = &#63; and slotBookedByUser = &#63; and quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public QuarryInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long quarryApplicationId);

	/**
	 * Returns the quarry inspection where status = &#63; and slotBookedByUser = &#63; and quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public QuarryInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long quarryApplicationId,
			boolean useFinderCache);

	/**
	 * Removes the quarry inspection where status = &#63; and slotBookedByUser = &#63; and quarryApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry inspection that was removed
	 */
	public QuarryInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long quarryApplicationId)
		throws NoSuchQuarryInspectionException;

	/**
	 * Returns the number of quarry inspections where status = &#63; and slotBookedByUser = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry inspections
	 */
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long quarryApplicationId);

	/**
	 * Caches the quarry inspection in the entity cache if it is enabled.
	 *
	 * @param quarryInspection the quarry inspection
	 */
	public void cacheResult(QuarryInspection quarryInspection);

	/**
	 * Caches the quarry inspections in the entity cache if it is enabled.
	 *
	 * @param quarryInspections the quarry inspections
	 */
	public void cacheResult(java.util.List<QuarryInspection> quarryInspections);

	/**
	 * Creates a new quarry inspection with the primary key. Does not add the quarry inspection to the database.
	 *
	 * @param quarryInspectionId the primary key for the new quarry inspection
	 * @return the new quarry inspection
	 */
	public QuarryInspection create(long quarryInspectionId);

	/**
	 * Removes the quarry inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quarryInspectionId the primary key of the quarry inspection
	 * @return the quarry inspection that was removed
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	public QuarryInspection remove(long quarryInspectionId)
		throws NoSuchQuarryInspectionException;

	public QuarryInspection updateImpl(QuarryInspection quarryInspection);

	/**
	 * Returns the quarry inspection with the primary key or throws a <code>NoSuchQuarryInspectionException</code> if it could not be found.
	 *
	 * @param quarryInspectionId the primary key of the quarry inspection
	 * @return the quarry inspection
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	public QuarryInspection findByPrimaryKey(long quarryInspectionId)
		throws NoSuchQuarryInspectionException;

	/**
	 * Returns the quarry inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quarryInspectionId the primary key of the quarry inspection
	 * @return the quarry inspection, or <code>null</code> if a quarry inspection with the primary key could not be found
	 */
	public QuarryInspection fetchByPrimaryKey(long quarryInspectionId);

	/**
	 * Returns all the quarry inspections.
	 *
	 * @return the quarry inspections
	 */
	public java.util.List<QuarryInspection> findAll();

	/**
	 * Returns a range of all the quarry inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @return the range of quarry inspections
	 */
	public java.util.List<QuarryInspection> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the quarry inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry inspections
	 */
	public java.util.List<QuarryInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quarry inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry inspections
	 */
	public java.util.List<QuarryInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the quarry inspections from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of quarry inspections.
	 *
	 * @return the number of quarry inspections
	 */
	public int countAll();

}