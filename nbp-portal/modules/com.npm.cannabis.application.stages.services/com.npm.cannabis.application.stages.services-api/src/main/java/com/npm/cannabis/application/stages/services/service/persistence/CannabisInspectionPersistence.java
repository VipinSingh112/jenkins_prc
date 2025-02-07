/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisInspectionException;
import com.npm.cannabis.application.stages.services.model.CannabisInspection;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisInspectionUtil
 * @generated
 */
@ProviderType
public interface CannabisInspectionPersistence
	extends BasePersistence<CannabisInspection> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisInspectionUtil} to access the cannabis inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cannabis inspections where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis inspections
	 */
	public java.util.List<CannabisInspection> findBygetCI_CAI(
		long cannabisApplicationId);

	/**
	 * Returns a range of all the cannabis inspections where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @return the range of matching cannabis inspections
	 */
	public java.util.List<CannabisInspection> findBygetCI_CAI(
		long cannabisApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis inspections where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis inspections
	 */
	public java.util.List<CannabisInspection> findBygetCI_CAI(
		long cannabisApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis inspections where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis inspections
	 */
	public java.util.List<CannabisInspection> findBygetCI_CAI(
		long cannabisApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis inspection in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	public CannabisInspection findBygetCI_CAI_First(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
				orderByComparator)
		throws NoSuchCannabisInspectionException;

	/**
	 * Returns the first cannabis inspection in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public CannabisInspection fetchBygetCI_CAI_First(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
			orderByComparator);

	/**
	 * Returns the last cannabis inspection in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	public CannabisInspection findBygetCI_CAI_Last(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
				orderByComparator)
		throws NoSuchCannabisInspectionException;

	/**
	 * Returns the last cannabis inspection in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public CannabisInspection fetchBygetCI_CAI_Last(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
			orderByComparator);

	/**
	 * Returns the cannabis inspections before and after the current cannabis inspection in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisInspectionId the primary key of the current cannabis inspection
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	public CannabisInspection[] findBygetCI_CAI_PrevAndNext(
			long cannabisInspectionId, long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
				orderByComparator)
		throws NoSuchCannabisInspectionException;

	/**
	 * Removes all the cannabis inspections where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public void removeBygetCI_CAI(long cannabisApplicationId);

	/**
	 * Returns the number of cannabis inspections where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis inspections
	 */
	public int countBygetCI_CAI(long cannabisApplicationId);

	/**
	 * Returns all the cannabis inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis inspections
	 */
	public java.util.List<CannabisInspection> findBygetCI_CaseId(String caseId);

	/**
	 * Returns a range of all the cannabis inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @return the range of matching cannabis inspections
	 */
	public java.util.List<CannabisInspection> findBygetCI_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis inspections
	 */
	public java.util.List<CannabisInspection> findBygetCI_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis inspections
	 */
	public java.util.List<CannabisInspection> findBygetCI_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	public CannabisInspection findBygetCI_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
				orderByComparator)
		throws NoSuchCannabisInspectionException;

	/**
	 * Returns the first cannabis inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public CannabisInspection fetchBygetCI_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
			orderByComparator);

	/**
	 * Returns the last cannabis inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	public CannabisInspection findBygetCI_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
				orderByComparator)
		throws NoSuchCannabisInspectionException;

	/**
	 * Returns the last cannabis inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public CannabisInspection fetchBygetCI_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
			orderByComparator);

	/**
	 * Returns the cannabis inspections before and after the current cannabis inspection in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisInspectionId the primary key of the current cannabis inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	public CannabisInspection[] findBygetCI_CaseId_PrevAndNext(
			long cannabisInspectionId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
				orderByComparator)
		throws NoSuchCannabisInspectionException;

	/**
	 * Removes all the cannabis inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetCI_CaseId(String caseId);

	/**
	 * Returns the number of cannabis inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis inspections
	 */
	public int countBygetCI_CaseId(String caseId);

	/**
	 * Returns all the cannabis inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching cannabis inspections
	 */
	public java.util.List<CannabisInspection> findBygetCI_Status(String status);

	/**
	 * Returns a range of all the cannabis inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @return the range of matching cannabis inspections
	 */
	public java.util.List<CannabisInspection> findBygetCI_Status(
		String status, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis inspections
	 */
	public java.util.List<CannabisInspection> findBygetCI_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis inspections
	 */
	public java.util.List<CannabisInspection> findBygetCI_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	public CannabisInspection findBygetCI_Status_First(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
				orderByComparator)
		throws NoSuchCannabisInspectionException;

	/**
	 * Returns the first cannabis inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public CannabisInspection fetchBygetCI_Status_First(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
			orderByComparator);

	/**
	 * Returns the last cannabis inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	public CannabisInspection findBygetCI_Status_Last(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
				orderByComparator)
		throws NoSuchCannabisInspectionException;

	/**
	 * Returns the last cannabis inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public CannabisInspection fetchBygetCI_Status_Last(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
			orderByComparator);

	/**
	 * Returns the cannabis inspections before and after the current cannabis inspection in the ordered set where status = &#63;.
	 *
	 * @param cannabisInspectionId the primary key of the current cannabis inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	public CannabisInspection[] findBygetCI_Status_PrevAndNext(
			long cannabisInspectionId, String status,
			com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
				orderByComparator)
		throws NoSuchCannabisInspectionException;

	/**
	 * Removes all the cannabis inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetCI_Status(String status);

	/**
	 * Returns the number of cannabis inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching cannabis inspections
	 */
	public int countBygetCI_Status(String status);

	/**
	 * Returns all the cannabis inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching cannabis inspections
	 */
	public java.util.List<CannabisInspection> findBygetCI_CaseIdStatus(
		String status, String caseId);

	/**
	 * Returns a range of all the cannabis inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @return the range of matching cannabis inspections
	 */
	public java.util.List<CannabisInspection> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis inspections
	 */
	public java.util.List<CannabisInspection> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis inspections
	 */
	public java.util.List<CannabisInspection> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	public CannabisInspection findBygetCI_CaseIdStatus_First(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
				orderByComparator)
		throws NoSuchCannabisInspectionException;

	/**
	 * Returns the first cannabis inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public CannabisInspection fetchBygetCI_CaseIdStatus_First(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
			orderByComparator);

	/**
	 * Returns the last cannabis inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	public CannabisInspection findBygetCI_CaseIdStatus_Last(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
				orderByComparator)
		throws NoSuchCannabisInspectionException;

	/**
	 * Returns the last cannabis inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public CannabisInspection fetchBygetCI_CaseIdStatus_Last(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
			orderByComparator);

	/**
	 * Returns the cannabis inspections before and after the current cannabis inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param cannabisInspectionId the primary key of the current cannabis inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	public CannabisInspection[] findBygetCI_CaseIdStatus_PrevAndNext(
			long cannabisInspectionId, String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
				orderByComparator)
		throws NoSuchCannabisInspectionException;

	/**
	 * Removes all the cannabis inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public void removeBygetCI_CaseIdStatus(String status, String caseId);

	/**
	 * Returns the number of cannabis inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching cannabis inspections
	 */
	public int countBygetCI_CaseIdStatus(String status, String caseId);

	/**
	 * Returns all the cannabis inspections where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis inspections
	 */
	public java.util.List<CannabisInspection> findBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId);

	/**
	 * Returns a range of all the cannabis inspections where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @return the range of matching cannabis inspections
	 */
	public java.util.List<CannabisInspection> findBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis inspections where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis inspections
	 */
	public java.util.List<CannabisInspection> findBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis inspections where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis inspections
	 */
	public java.util.List<CannabisInspection> findBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis inspection in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	public CannabisInspection findBygetCI_CaseIdApplicationId_First(
			String status, long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
				orderByComparator)
		throws NoSuchCannabisInspectionException;

	/**
	 * Returns the first cannabis inspection in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public CannabisInspection fetchBygetCI_CaseIdApplicationId_First(
		String status, long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
			orderByComparator);

	/**
	 * Returns the last cannabis inspection in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	public CannabisInspection findBygetCI_CaseIdApplicationId_Last(
			String status, long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
				orderByComparator)
		throws NoSuchCannabisInspectionException;

	/**
	 * Returns the last cannabis inspection in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public CannabisInspection fetchBygetCI_CaseIdApplicationId_Last(
		String status, long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
			orderByComparator);

	/**
	 * Returns the cannabis inspections before and after the current cannabis inspection in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param cannabisInspectionId the primary key of the current cannabis inspection
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	public CannabisInspection[] findBygetCI_CaseIdApplicationId_PrevAndNext(
			long cannabisInspectionId, String status,
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
				orderByComparator)
		throws NoSuchCannabisInspectionException;

	/**
	 * Removes all the cannabis inspections where status = &#63; and cannabisApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public void removeBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId);

	/**
	 * Returns the number of cannabis inspections where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis inspections
	 */
	public int countBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId);

	/**
	 * Returns the cannabis inspection where status = &#63; and slotBookedByUser = &#63; and cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	public CannabisInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long cannabisApplicationId)
		throws NoSuchCannabisInspectionException;

	/**
	 * Returns the cannabis inspection where status = &#63; and slotBookedByUser = &#63; and cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public CannabisInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long cannabisApplicationId);

	/**
	 * Returns the cannabis inspection where status = &#63; and slotBookedByUser = &#63; and cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public CannabisInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long cannabisApplicationId,
			boolean useFinderCache);

	/**
	 * Removes the cannabis inspection where status = &#63; and slotBookedByUser = &#63; and cannabisApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis inspection that was removed
	 */
	public CannabisInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long cannabisApplicationId)
		throws NoSuchCannabisInspectionException;

	/**
	 * Returns the number of cannabis inspections where status = &#63; and slotBookedByUser = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis inspections
	 */
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long cannabisApplicationId);

	/**
	 * Caches the cannabis inspection in the entity cache if it is enabled.
	 *
	 * @param cannabisInspection the cannabis inspection
	 */
	public void cacheResult(CannabisInspection cannabisInspection);

	/**
	 * Caches the cannabis inspections in the entity cache if it is enabled.
	 *
	 * @param cannabisInspections the cannabis inspections
	 */
	public void cacheResult(
		java.util.List<CannabisInspection> cannabisInspections);

	/**
	 * Creates a new cannabis inspection with the primary key. Does not add the cannabis inspection to the database.
	 *
	 * @param cannabisInspectionId the primary key for the new cannabis inspection
	 * @return the new cannabis inspection
	 */
	public CannabisInspection create(long cannabisInspectionId);

	/**
	 * Removes the cannabis inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisInspectionId the primary key of the cannabis inspection
	 * @return the cannabis inspection that was removed
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	public CannabisInspection remove(long cannabisInspectionId)
		throws NoSuchCannabisInspectionException;

	public CannabisInspection updateImpl(CannabisInspection cannabisInspection);

	/**
	 * Returns the cannabis inspection with the primary key or throws a <code>NoSuchCannabisInspectionException</code> if it could not be found.
	 *
	 * @param cannabisInspectionId the primary key of the cannabis inspection
	 * @return the cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	public CannabisInspection findByPrimaryKey(long cannabisInspectionId)
		throws NoSuchCannabisInspectionException;

	/**
	 * Returns the cannabis inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisInspectionId the primary key of the cannabis inspection
	 * @return the cannabis inspection, or <code>null</code> if a cannabis inspection with the primary key could not be found
	 */
	public CannabisInspection fetchByPrimaryKey(long cannabisInspectionId);

	/**
	 * Returns all the cannabis inspections.
	 *
	 * @return the cannabis inspections
	 */
	public java.util.List<CannabisInspection> findAll();

	/**
	 * Returns a range of all the cannabis inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @return the range of cannabis inspections
	 */
	public java.util.List<CannabisInspection> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the cannabis inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis inspections
	 */
	public java.util.List<CannabisInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis inspections
	 */
	public java.util.List<CannabisInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CannabisInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis inspections from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis inspections.
	 *
	 * @return the number of cannabis inspections
	 */
	public int countAll();

}