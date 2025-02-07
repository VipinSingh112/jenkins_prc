/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.stages.services.exception.NoSuchNcbjInspectionException;
import com.nbp.ncbj.stages.services.model.NcbjInspection;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjInspectionUtil
 * @generated
 */
@ProviderType
public interface NcbjInspectionPersistence
	extends BasePersistence<NcbjInspection> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjInspectionUtil} to access the ncbj inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncbj inspection where caseId = &#63; or throws a <code>NoSuchNcbjInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public NcbjInspection findBygetNcbjInspectionBy_CI(String caseId)
		throws NoSuchNcbjInspectionException;

	/**
	 * Returns the ncbj inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public NcbjInspection fetchBygetNcbjInspectionBy_CI(String caseId);

	/**
	 * Returns the ncbj inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public NcbjInspection fetchBygetNcbjInspectionBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the ncbj inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncbj inspection that was removed
	 */
	public NcbjInspection removeBygetNcbjInspectionBy_CI(String caseId)
		throws NoSuchNcbjInspectionException;

	/**
	 * Returns the number of ncbj inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj inspections
	 */
	public int countBygetNcbjInspectionBy_CI(String caseId);

	/**
	 * Returns all the ncbj inspections where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj inspections
	 */
	public java.util.List<NcbjInspection> findBygetNcbj_FBAI(
		long ncbjApplicationId);

	/**
	 * Returns a range of all the ncbj inspections where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @return the range of matching ncbj inspections
	 */
	public java.util.List<NcbjInspection> findBygetNcbj_FBAI(
		long ncbjApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj inspections where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj inspections
	 */
	public java.util.List<NcbjInspection> findBygetNcbj_FBAI(
		long ncbjApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj inspections where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj inspections
	 */
	public java.util.List<NcbjInspection> findBygetNcbj_FBAI(
		long ncbjApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj inspection in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public NcbjInspection findBygetNcbj_FBAI_First(
			long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
				orderByComparator)
		throws NoSuchNcbjInspectionException;

	/**
	 * Returns the first ncbj inspection in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public NcbjInspection fetchBygetNcbj_FBAI_First(
		long ncbjApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
			orderByComparator);

	/**
	 * Returns the last ncbj inspection in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public NcbjInspection findBygetNcbj_FBAI_Last(
			long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
				orderByComparator)
		throws NoSuchNcbjInspectionException;

	/**
	 * Returns the last ncbj inspection in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public NcbjInspection fetchBygetNcbj_FBAI_Last(
		long ncbjApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
			orderByComparator);

	/**
	 * Returns the ncbj inspections before and after the current ncbj inspection in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjInspectionId the primary key of the current ncbj inspection
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	public NcbjInspection[] findBygetNcbj_FBAI_PrevAndNext(
			long ncbjInspectionId, long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
				orderByComparator)
		throws NoSuchNcbjInspectionException;

	/**
	 * Removes all the ncbj inspections where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public void removeBygetNcbj_FBAI(long ncbjApplicationId);

	/**
	 * Returns the number of ncbj inspections where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj inspections
	 */
	public int countBygetNcbj_FBAI(long ncbjApplicationId);

	/**
	 * Returns all the ncbj inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj inspections
	 */
	public java.util.List<NcbjInspection> findBygetNcbj_CaseId(String caseId);

	/**
	 * Returns a range of all the ncbj inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @return the range of matching ncbj inspections
	 */
	public java.util.List<NcbjInspection> findBygetNcbj_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj inspections
	 */
	public java.util.List<NcbjInspection> findBygetNcbj_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj inspections
	 */
	public java.util.List<NcbjInspection> findBygetNcbj_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public NcbjInspection findBygetNcbj_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
				orderByComparator)
		throws NoSuchNcbjInspectionException;

	/**
	 * Returns the first ncbj inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public NcbjInspection fetchBygetNcbj_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
			orderByComparator);

	/**
	 * Returns the last ncbj inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public NcbjInspection findBygetNcbj_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
				orderByComparator)
		throws NoSuchNcbjInspectionException;

	/**
	 * Returns the last ncbj inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public NcbjInspection fetchBygetNcbj_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
			orderByComparator);

	/**
	 * Returns the ncbj inspections before and after the current ncbj inspection in the ordered set where caseId = &#63;.
	 *
	 * @param ncbjInspectionId the primary key of the current ncbj inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	public NcbjInspection[] findBygetNcbj_CaseId_PrevAndNext(
			long ncbjInspectionId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
				orderByComparator)
		throws NoSuchNcbjInspectionException;

	/**
	 * Removes all the ncbj inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetNcbj_CaseId(String caseId);

	/**
	 * Returns the number of ncbj inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj inspections
	 */
	public int countBygetNcbj_CaseId(String caseId);

	/**
	 * Returns all the ncbj inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching ncbj inspections
	 */
	public java.util.List<NcbjInspection> findBygetNcbj_Status(String status);

	/**
	 * Returns a range of all the ncbj inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @return the range of matching ncbj inspections
	 */
	public java.util.List<NcbjInspection> findBygetNcbj_Status(
		String status, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj inspections
	 */
	public java.util.List<NcbjInspection> findBygetNcbj_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj inspections
	 */
	public java.util.List<NcbjInspection> findBygetNcbj_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public NcbjInspection findBygetNcbj_Status_First(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
				orderByComparator)
		throws NoSuchNcbjInspectionException;

	/**
	 * Returns the first ncbj inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public NcbjInspection fetchBygetNcbj_Status_First(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
			orderByComparator);

	/**
	 * Returns the last ncbj inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public NcbjInspection findBygetNcbj_Status_Last(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
				orderByComparator)
		throws NoSuchNcbjInspectionException;

	/**
	 * Returns the last ncbj inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public NcbjInspection fetchBygetNcbj_Status_Last(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
			orderByComparator);

	/**
	 * Returns the ncbj inspections before and after the current ncbj inspection in the ordered set where status = &#63;.
	 *
	 * @param ncbjInspectionId the primary key of the current ncbj inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	public NcbjInspection[] findBygetNcbj_Status_PrevAndNext(
			long ncbjInspectionId, String status,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
				orderByComparator)
		throws NoSuchNcbjInspectionException;

	/**
	 * Removes all the ncbj inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetNcbj_Status(String status);

	/**
	 * Returns the number of ncbj inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching ncbj inspections
	 */
	public int countBygetNcbj_Status(String status);

	/**
	 * Returns all the ncbj inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching ncbj inspections
	 */
	public java.util.List<NcbjInspection> findBygetNcbj_CaseIdStatus(
		String status, String caseId);

	/**
	 * Returns a range of all the ncbj inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @return the range of matching ncbj inspections
	 */
	public java.util.List<NcbjInspection> findBygetNcbj_CaseIdStatus(
		String status, String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj inspections
	 */
	public java.util.List<NcbjInspection> findBygetNcbj_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj inspections
	 */
	public java.util.List<NcbjInspection> findBygetNcbj_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public NcbjInspection findBygetNcbj_CaseIdStatus_First(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
				orderByComparator)
		throws NoSuchNcbjInspectionException;

	/**
	 * Returns the first ncbj inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public NcbjInspection fetchBygetNcbj_CaseIdStatus_First(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
			orderByComparator);

	/**
	 * Returns the last ncbj inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public NcbjInspection findBygetNcbj_CaseIdStatus_Last(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
				orderByComparator)
		throws NoSuchNcbjInspectionException;

	/**
	 * Returns the last ncbj inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public NcbjInspection fetchBygetNcbj_CaseIdStatus_Last(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
			orderByComparator);

	/**
	 * Returns the ncbj inspections before and after the current ncbj inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param ncbjInspectionId the primary key of the current ncbj inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	public NcbjInspection[] findBygetNcbj_CaseIdStatus_PrevAndNext(
			long ncbjInspectionId, String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
				orderByComparator)
		throws NoSuchNcbjInspectionException;

	/**
	 * Removes all the ncbj inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public void removeBygetNcbj_CaseIdStatus(String status, String caseId);

	/**
	 * Returns the number of ncbj inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching ncbj inspections
	 */
	public int countBygetNcbj_CaseIdStatus(String status, String caseId);

	/**
	 * Returns all the ncbj inspections where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj inspections
	 */
	public java.util.List<NcbjInspection> findBygetNcbj_CaseIdAppId(
		String status, long ncbjApplicationId);

	/**
	 * Returns a range of all the ncbj inspections where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @return the range of matching ncbj inspections
	 */
	public java.util.List<NcbjInspection> findBygetNcbj_CaseIdAppId(
		String status, long ncbjApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj inspections where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj inspections
	 */
	public java.util.List<NcbjInspection> findBygetNcbj_CaseIdAppId(
		String status, long ncbjApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj inspections where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj inspections
	 */
	public java.util.List<NcbjInspection> findBygetNcbj_CaseIdAppId(
		String status, long ncbjApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj inspection in the ordered set where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public NcbjInspection findBygetNcbj_CaseIdAppId_First(
			String status, long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
				orderByComparator)
		throws NoSuchNcbjInspectionException;

	/**
	 * Returns the first ncbj inspection in the ordered set where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public NcbjInspection fetchBygetNcbj_CaseIdAppId_First(
		String status, long ncbjApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
			orderByComparator);

	/**
	 * Returns the last ncbj inspection in the ordered set where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public NcbjInspection findBygetNcbj_CaseIdAppId_Last(
			String status, long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
				orderByComparator)
		throws NoSuchNcbjInspectionException;

	/**
	 * Returns the last ncbj inspection in the ordered set where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public NcbjInspection fetchBygetNcbj_CaseIdAppId_Last(
		String status, long ncbjApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
			orderByComparator);

	/**
	 * Returns the ncbj inspections before and after the current ncbj inspection in the ordered set where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param ncbjInspectionId the primary key of the current ncbj inspection
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	public NcbjInspection[] findBygetNcbj_CaseIdAppId_PrevAndNext(
			long ncbjInspectionId, String status, long ncbjApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
				orderByComparator)
		throws NoSuchNcbjInspectionException;

	/**
	 * Removes all the ncbj inspections where status = &#63; and ncbjApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public void removeBygetNcbj_CaseIdAppId(
		String status, long ncbjApplicationId);

	/**
	 * Returns the number of ncbj inspections where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj inspections
	 */
	public int countBygetNcbj_CaseIdAppId(
		String status, long ncbjApplicationId);

	/**
	 * Returns the ncbj inspection where status = &#63; and slotBookedByUser = &#63; and ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public NcbjInspection findBygetInspecByStatus_SlotBook_AppId(
			String status, long slotBookedByUser, long ncbjApplicationId)
		throws NoSuchNcbjInspectionException;

	/**
	 * Returns the ncbj inspection where status = &#63; and slotBookedByUser = &#63; and ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public NcbjInspection fetchBygetInspecByStatus_SlotBook_AppId(
		String status, long slotBookedByUser, long ncbjApplicationId);

	/**
	 * Returns the ncbj inspection where status = &#63; and slotBookedByUser = &#63; and ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public NcbjInspection fetchBygetInspecByStatus_SlotBook_AppId(
		String status, long slotBookedByUser, long ncbjApplicationId,
		boolean useFinderCache);

	/**
	 * Removes the ncbj inspection where status = &#63; and slotBookedByUser = &#63; and ncbjApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj inspection that was removed
	 */
	public NcbjInspection removeBygetInspecByStatus_SlotBook_AppId(
			String status, long slotBookedByUser, long ncbjApplicationId)
		throws NoSuchNcbjInspectionException;

	/**
	 * Returns the number of ncbj inspections where status = &#63; and slotBookedByUser = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj inspections
	 */
	public int countBygetInspecByStatus_SlotBook_AppId(
		String status, long slotBookedByUser, long ncbjApplicationId);

	/**
	 * Caches the ncbj inspection in the entity cache if it is enabled.
	 *
	 * @param ncbjInspection the ncbj inspection
	 */
	public void cacheResult(NcbjInspection ncbjInspection);

	/**
	 * Caches the ncbj inspections in the entity cache if it is enabled.
	 *
	 * @param ncbjInspections the ncbj inspections
	 */
	public void cacheResult(java.util.List<NcbjInspection> ncbjInspections);

	/**
	 * Creates a new ncbj inspection with the primary key. Does not add the ncbj inspection to the database.
	 *
	 * @param ncbjInspectionId the primary key for the new ncbj inspection
	 * @return the new ncbj inspection
	 */
	public NcbjInspection create(long ncbjInspectionId);

	/**
	 * Removes the ncbj inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjInspectionId the primary key of the ncbj inspection
	 * @return the ncbj inspection that was removed
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	public NcbjInspection remove(long ncbjInspectionId)
		throws NoSuchNcbjInspectionException;

	public NcbjInspection updateImpl(NcbjInspection ncbjInspection);

	/**
	 * Returns the ncbj inspection with the primary key or throws a <code>NoSuchNcbjInspectionException</code> if it could not be found.
	 *
	 * @param ncbjInspectionId the primary key of the ncbj inspection
	 * @return the ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	public NcbjInspection findByPrimaryKey(long ncbjInspectionId)
		throws NoSuchNcbjInspectionException;

	/**
	 * Returns the ncbj inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjInspectionId the primary key of the ncbj inspection
	 * @return the ncbj inspection, or <code>null</code> if a ncbj inspection with the primary key could not be found
	 */
	public NcbjInspection fetchByPrimaryKey(long ncbjInspectionId);

	/**
	 * Returns all the ncbj inspections.
	 *
	 * @return the ncbj inspections
	 */
	public java.util.List<NcbjInspection> findAll();

	/**
	 * Returns a range of all the ncbj inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @return the range of ncbj inspections
	 */
	public java.util.List<NcbjInspection> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj inspections
	 */
	public java.util.List<NcbjInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj inspections
	 */
	public java.util.List<NcbjInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj inspections from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj inspections.
	 *
	 * @return the number of ncbj inspections
	 */
	public int countAll();

}