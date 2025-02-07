/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncra.stages.services.exception.NoSuchNcraInspectionException;
import com.nbp.ncra.stages.services.model.NcraInspection;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncra inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraInspectionUtil
 * @generated
 */
@ProviderType
public interface NcraInspectionPersistence
	extends BasePersistence<NcraInspection> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcraInspectionUtil} to access the ncra inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncra inspection where caseId = &#63; or throws a <code>NoSuchNcraInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public NcraInspection findBygetNcraInspectionBy_CI(String caseId)
		throws NoSuchNcraInspectionException;

	/**
	 * Returns the ncra inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public NcraInspection fetchBygetNcraInspectionBy_CI(String caseId);

	/**
	 * Returns the ncra inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public NcraInspection fetchBygetNcraInspectionBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the ncra inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncra inspection that was removed
	 */
	public NcraInspection removeBygetNcraInspectionBy_CI(String caseId)
		throws NoSuchNcraInspectionException;

	/**
	 * Returns the number of ncra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncra inspections
	 */
	public int countBygetNcraInspectionBy_CI(String caseId);

	/**
	 * Returns all the ncra inspections where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra inspections
	 */
	public java.util.List<NcraInspection> findBygetNcra_AI(
		long ncraApplicationId);

	/**
	 * Returns a range of all the ncra inspections where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @return the range of matching ncra inspections
	 */
	public java.util.List<NcraInspection> findBygetNcra_AI(
		long ncraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the ncra inspections where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra inspections
	 */
	public java.util.List<NcraInspection> findBygetNcra_AI(
		long ncraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncra inspections where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra inspections
	 */
	public java.util.List<NcraInspection> findBygetNcra_AI(
		long ncraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncra inspection in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public NcraInspection findBygetNcra_AI_First(
			long ncraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
				orderByComparator)
		throws NoSuchNcraInspectionException;

	/**
	 * Returns the first ncra inspection in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public NcraInspection fetchBygetNcra_AI_First(
		long ncraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
			orderByComparator);

	/**
	 * Returns the last ncra inspection in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public NcraInspection findBygetNcra_AI_Last(
			long ncraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
				orderByComparator)
		throws NoSuchNcraInspectionException;

	/**
	 * Returns the last ncra inspection in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public NcraInspection fetchBygetNcra_AI_Last(
		long ncraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
			orderByComparator);

	/**
	 * Returns the ncra inspections before and after the current ncra inspection in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraInspectionId the primary key of the current ncra inspection
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra inspection
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	public NcraInspection[] findBygetNcra_AI_PrevAndNext(
			long ncraInspectionId, long ncraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
				orderByComparator)
		throws NoSuchNcraInspectionException;

	/**
	 * Removes all the ncra inspections where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 */
	public void removeBygetNcra_AI(long ncraApplicationId);

	/**
	 * Returns the number of ncra inspections where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra inspections
	 */
	public int countBygetNcra_AI(long ncraApplicationId);

	/**
	 * Returns all the ncra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra inspections
	 */
	public java.util.List<NcraInspection> findBygetNcra_by_CaseId(
		String caseId);

	/**
	 * Returns a range of all the ncra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @return the range of matching ncra inspections
	 */
	public java.util.List<NcraInspection> findBygetNcra_by_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the ncra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra inspections
	 */
	public java.util.List<NcraInspection> findBygetNcra_by_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra inspections
	 */
	public java.util.List<NcraInspection> findBygetNcra_by_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public NcraInspection findBygetNcra_by_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
				orderByComparator)
		throws NoSuchNcraInspectionException;

	/**
	 * Returns the first ncra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public NcraInspection fetchBygetNcra_by_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
			orderByComparator);

	/**
	 * Returns the last ncra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public NcraInspection findBygetNcra_by_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
				orderByComparator)
		throws NoSuchNcraInspectionException;

	/**
	 * Returns the last ncra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public NcraInspection fetchBygetNcra_by_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
			orderByComparator);

	/**
	 * Returns the ncra inspections before and after the current ncra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param ncraInspectionId the primary key of the current ncra inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra inspection
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	public NcraInspection[] findBygetNcra_by_CaseId_PrevAndNext(
			long ncraInspectionId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
				orderByComparator)
		throws NoSuchNcraInspectionException;

	/**
	 * Removes all the ncra inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetNcra_by_CaseId(String caseId);

	/**
	 * Returns the number of ncra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncra inspections
	 */
	public int countBygetNcra_by_CaseId(String caseId);

	/**
	 * Returns all the ncra inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching ncra inspections
	 */
	public java.util.List<NcraInspection> findBygetHsra_Status(String status);

	/**
	 * Returns a range of all the ncra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @return the range of matching ncra inspections
	 */
	public java.util.List<NcraInspection> findBygetHsra_Status(
		String status, int start, int end);

	/**
	 * Returns an ordered range of all the ncra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra inspections
	 */
	public java.util.List<NcraInspection> findBygetHsra_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra inspections
	 */
	public java.util.List<NcraInspection> findBygetHsra_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public NcraInspection findBygetHsra_Status_First(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
				orderByComparator)
		throws NoSuchNcraInspectionException;

	/**
	 * Returns the first ncra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public NcraInspection fetchBygetHsra_Status_First(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
			orderByComparator);

	/**
	 * Returns the last ncra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public NcraInspection findBygetHsra_Status_Last(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
				orderByComparator)
		throws NoSuchNcraInspectionException;

	/**
	 * Returns the last ncra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public NcraInspection fetchBygetHsra_Status_Last(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
			orderByComparator);

	/**
	 * Returns the ncra inspections before and after the current ncra inspection in the ordered set where status = &#63;.
	 *
	 * @param ncraInspectionId the primary key of the current ncra inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra inspection
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	public NcraInspection[] findBygetHsra_Status_PrevAndNext(
			long ncraInspectionId, String status,
			com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
				orderByComparator)
		throws NoSuchNcraInspectionException;

	/**
	 * Removes all the ncra inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetHsra_Status(String status);

	/**
	 * Returns the number of ncra inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching ncra inspections
	 */
	public int countBygetHsra_Status(String status);

	/**
	 * Returns all the ncra inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching ncra inspections
	 */
	public java.util.List<NcraInspection> findBygetNcra_CaseIdStatus(
		String status, String caseId);

	/**
	 * Returns a range of all the ncra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @return the range of matching ncra inspections
	 */
	public java.util.List<NcraInspection> findBygetNcra_CaseIdStatus(
		String status, String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the ncra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra inspections
	 */
	public java.util.List<NcraInspection> findBygetNcra_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra inspections
	 */
	public java.util.List<NcraInspection> findBygetNcra_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public NcraInspection findBygetNcra_CaseIdStatus_First(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
				orderByComparator)
		throws NoSuchNcraInspectionException;

	/**
	 * Returns the first ncra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public NcraInspection fetchBygetNcra_CaseIdStatus_First(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
			orderByComparator);

	/**
	 * Returns the last ncra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public NcraInspection findBygetNcra_CaseIdStatus_Last(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
				orderByComparator)
		throws NoSuchNcraInspectionException;

	/**
	 * Returns the last ncra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public NcraInspection fetchBygetNcra_CaseIdStatus_Last(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
			orderByComparator);

	/**
	 * Returns the ncra inspections before and after the current ncra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param ncraInspectionId the primary key of the current ncra inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra inspection
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	public NcraInspection[] findBygetNcra_CaseIdStatus_PrevAndNext(
			long ncraInspectionId, String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
				orderByComparator)
		throws NoSuchNcraInspectionException;

	/**
	 * Removes all the ncra inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public void removeBygetNcra_CaseIdStatus(String status, String caseId);

	/**
	 * Returns the number of ncra inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching ncra inspections
	 */
	public int countBygetNcra_CaseIdStatus(String status, String caseId);

	/**
	 * Returns all the ncra inspections where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra inspections
	 */
	public java.util.List<NcraInspection> findBygetNcra_CaseIdApplicationId(
		String status, long ncraApplicationId);

	/**
	 * Returns a range of all the ncra inspections where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @return the range of matching ncra inspections
	 */
	public java.util.List<NcraInspection> findBygetNcra_CaseIdApplicationId(
		String status, long ncraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the ncra inspections where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra inspections
	 */
	public java.util.List<NcraInspection> findBygetNcra_CaseIdApplicationId(
		String status, long ncraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncra inspections where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra inspections
	 */
	public java.util.List<NcraInspection> findBygetNcra_CaseIdApplicationId(
		String status, long ncraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncra inspection in the ordered set where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public NcraInspection findBygetNcra_CaseIdApplicationId_First(
			String status, long ncraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
				orderByComparator)
		throws NoSuchNcraInspectionException;

	/**
	 * Returns the first ncra inspection in the ordered set where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public NcraInspection fetchBygetNcra_CaseIdApplicationId_First(
		String status, long ncraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
			orderByComparator);

	/**
	 * Returns the last ncra inspection in the ordered set where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public NcraInspection findBygetNcra_CaseIdApplicationId_Last(
			String status, long ncraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
				orderByComparator)
		throws NoSuchNcraInspectionException;

	/**
	 * Returns the last ncra inspection in the ordered set where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public NcraInspection fetchBygetNcra_CaseIdApplicationId_Last(
		String status, long ncraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
			orderByComparator);

	/**
	 * Returns the ncra inspections before and after the current ncra inspection in the ordered set where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param ncraInspectionId the primary key of the current ncra inspection
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra inspection
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	public NcraInspection[] findBygetNcra_CaseIdApplicationId_PrevAndNext(
			long ncraInspectionId, String status, long ncraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
				orderByComparator)
		throws NoSuchNcraInspectionException;

	/**
	 * Removes all the ncra inspections where status = &#63; and ncraApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 */
	public void removeBygetNcra_CaseIdApplicationId(
		String status, long ncraApplicationId);

	/**
	 * Returns the number of ncra inspections where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra inspections
	 */
	public int countBygetNcra_CaseIdApplicationId(
		String status, long ncraApplicationId);

	/**
	 * Returns the ncra inspection where status = &#63; and slotBookedByUser = &#63; and ncraApplicationId = &#63; or throws a <code>NoSuchNcraInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public NcraInspection findBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long ncraApplicationId)
		throws NoSuchNcraInspectionException;

	/**
	 * Returns the ncra inspection where status = &#63; and slotBookedByUser = &#63; and ncraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public NcraInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long ncraApplicationId);

	/**
	 * Returns the ncra inspection where status = &#63; and slotBookedByUser = &#63; and ncraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncraApplicationId the ncra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public NcraInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long ncraApplicationId,
			boolean useFinderCache);

	/**
	 * Removes the ncra inspection where status = &#63; and slotBookedByUser = &#63; and ncraApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncraApplicationId the ncra application ID
	 * @return the ncra inspection that was removed
	 */
	public NcraInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long ncraApplicationId)
		throws NoSuchNcraInspectionException;

	/**
	 * Returns the number of ncra inspections where status = &#63; and slotBookedByUser = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra inspections
	 */
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long ncraApplicationId);

	/**
	 * Caches the ncra inspection in the entity cache if it is enabled.
	 *
	 * @param ncraInspection the ncra inspection
	 */
	public void cacheResult(NcraInspection ncraInspection);

	/**
	 * Caches the ncra inspections in the entity cache if it is enabled.
	 *
	 * @param ncraInspections the ncra inspections
	 */
	public void cacheResult(java.util.List<NcraInspection> ncraInspections);

	/**
	 * Creates a new ncra inspection with the primary key. Does not add the ncra inspection to the database.
	 *
	 * @param ncraInspectionId the primary key for the new ncra inspection
	 * @return the new ncra inspection
	 */
	public NcraInspection create(long ncraInspectionId);

	/**
	 * Removes the ncra inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraInspectionId the primary key of the ncra inspection
	 * @return the ncra inspection that was removed
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	public NcraInspection remove(long ncraInspectionId)
		throws NoSuchNcraInspectionException;

	public NcraInspection updateImpl(NcraInspection ncraInspection);

	/**
	 * Returns the ncra inspection with the primary key or throws a <code>NoSuchNcraInspectionException</code> if it could not be found.
	 *
	 * @param ncraInspectionId the primary key of the ncra inspection
	 * @return the ncra inspection
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	public NcraInspection findByPrimaryKey(long ncraInspectionId)
		throws NoSuchNcraInspectionException;

	/**
	 * Returns the ncra inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraInspectionId the primary key of the ncra inspection
	 * @return the ncra inspection, or <code>null</code> if a ncra inspection with the primary key could not be found
	 */
	public NcraInspection fetchByPrimaryKey(long ncraInspectionId);

	/**
	 * Returns all the ncra inspections.
	 *
	 * @return the ncra inspections
	 */
	public java.util.List<NcraInspection> findAll();

	/**
	 * Returns a range of all the ncra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @return the range of ncra inspections
	 */
	public java.util.List<NcraInspection> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra inspections
	 */
	public java.util.List<NcraInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra inspections
	 */
	public java.util.List<NcraInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncra inspections from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncra inspections.
	 *
	 * @return the number of ncra inspections
	 */
	public int countAll();

}