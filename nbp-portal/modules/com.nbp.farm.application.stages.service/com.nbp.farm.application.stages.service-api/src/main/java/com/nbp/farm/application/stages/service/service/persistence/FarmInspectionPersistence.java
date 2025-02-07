/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.farm.application.stages.service.exception.NoSuchFarmInspectionException;
import com.nbp.farm.application.stages.service.model.FarmInspection;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the farm inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmInspectionUtil
 * @generated
 */
@ProviderType
public interface FarmInspectionPersistence
	extends BasePersistence<FarmInspection> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FarmInspectionUtil} to access the farm inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the farm inspections where farmApplicationId = &#63;.
	 *
	 * @param farmApplicationId the farm application ID
	 * @return the matching farm inspections
	 */
	public java.util.List<FarmInspection> findBygetFI_FAI(
		long farmApplicationId);

	/**
	 * Returns a range of all the farm inspections where farmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param farmApplicationId the farm application ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @return the range of matching farm inspections
	 */
	public java.util.List<FarmInspection> findBygetFI_FAI(
		long farmApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the farm inspections where farmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param farmApplicationId the farm application ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm inspections
	 */
	public java.util.List<FarmInspection> findBygetFI_FAI(
		long farmApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farm inspections where farmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param farmApplicationId the farm application ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm inspections
	 */
	public java.util.List<FarmInspection> findBygetFI_FAI(
		long farmApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first farm inspection in the ordered set where farmApplicationId = &#63;.
	 *
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	public FarmInspection findBygetFI_FAI_First(
			long farmApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
				orderByComparator)
		throws NoSuchFarmInspectionException;

	/**
	 * Returns the first farm inspection in the ordered set where farmApplicationId = &#63;.
	 *
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public FarmInspection fetchBygetFI_FAI_First(
		long farmApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
			orderByComparator);

	/**
	 * Returns the last farm inspection in the ordered set where farmApplicationId = &#63;.
	 *
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	public FarmInspection findBygetFI_FAI_Last(
			long farmApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
				orderByComparator)
		throws NoSuchFarmInspectionException;

	/**
	 * Returns the last farm inspection in the ordered set where farmApplicationId = &#63;.
	 *
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public FarmInspection fetchBygetFI_FAI_Last(
		long farmApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
			orderByComparator);

	/**
	 * Returns the farm inspections before and after the current farm inspection in the ordered set where farmApplicationId = &#63;.
	 *
	 * @param farmInspectionId the primary key of the current farm inspection
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm inspection
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	public FarmInspection[] findBygetFI_FAI_PrevAndNext(
			long farmInspectionId, long farmApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
				orderByComparator)
		throws NoSuchFarmInspectionException;

	/**
	 * Removes all the farm inspections where farmApplicationId = &#63; from the database.
	 *
	 * @param farmApplicationId the farm application ID
	 */
	public void removeBygetFI_FAI(long farmApplicationId);

	/**
	 * Returns the number of farm inspections where farmApplicationId = &#63;.
	 *
	 * @param farmApplicationId the farm application ID
	 * @return the number of matching farm inspections
	 */
	public int countBygetFI_FAI(long farmApplicationId);

	/**
	 * Returns all the farm inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching farm inspections
	 */
	public java.util.List<FarmInspection> findBygetFI_CaseId(String caseId);

	/**
	 * Returns a range of all the farm inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @return the range of matching farm inspections
	 */
	public java.util.List<FarmInspection> findBygetFI_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the farm inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm inspections
	 */
	public java.util.List<FarmInspection> findBygetFI_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farm inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm inspections
	 */
	public java.util.List<FarmInspection> findBygetFI_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first farm inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	public FarmInspection findBygetFI_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
				orderByComparator)
		throws NoSuchFarmInspectionException;

	/**
	 * Returns the first farm inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public FarmInspection fetchBygetFI_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
			orderByComparator);

	/**
	 * Returns the last farm inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	public FarmInspection findBygetFI_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
				orderByComparator)
		throws NoSuchFarmInspectionException;

	/**
	 * Returns the last farm inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public FarmInspection fetchBygetFI_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
			orderByComparator);

	/**
	 * Returns the farm inspections before and after the current farm inspection in the ordered set where caseId = &#63;.
	 *
	 * @param farmInspectionId the primary key of the current farm inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm inspection
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	public FarmInspection[] findBygetFI_CaseId_PrevAndNext(
			long farmInspectionId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
				orderByComparator)
		throws NoSuchFarmInspectionException;

	/**
	 * Removes all the farm inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetFI_CaseId(String caseId);

	/**
	 * Returns the number of farm inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching farm inspections
	 */
	public int countBygetFI_CaseId(String caseId);

	/**
	 * Returns all the farm inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching farm inspections
	 */
	public java.util.List<FarmInspection> findBygetFI_Status(String status);

	/**
	 * Returns a range of all the farm inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @return the range of matching farm inspections
	 */
	public java.util.List<FarmInspection> findBygetFI_Status(
		String status, int start, int end);

	/**
	 * Returns an ordered range of all the farm inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm inspections
	 */
	public java.util.List<FarmInspection> findBygetFI_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farm inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm inspections
	 */
	public java.util.List<FarmInspection> findBygetFI_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first farm inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	public FarmInspection findBygetFI_Status_First(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
				orderByComparator)
		throws NoSuchFarmInspectionException;

	/**
	 * Returns the first farm inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public FarmInspection fetchBygetFI_Status_First(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
			orderByComparator);

	/**
	 * Returns the last farm inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	public FarmInspection findBygetFI_Status_Last(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
				orderByComparator)
		throws NoSuchFarmInspectionException;

	/**
	 * Returns the last farm inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public FarmInspection fetchBygetFI_Status_Last(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
			orderByComparator);

	/**
	 * Returns the farm inspections before and after the current farm inspection in the ordered set where status = &#63;.
	 *
	 * @param farmInspectionId the primary key of the current farm inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm inspection
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	public FarmInspection[] findBygetFI_Status_PrevAndNext(
			long farmInspectionId, String status,
			com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
				orderByComparator)
		throws NoSuchFarmInspectionException;

	/**
	 * Removes all the farm inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetFI_Status(String status);

	/**
	 * Returns the number of farm inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching farm inspections
	 */
	public int countBygetFI_Status(String status);

	/**
	 * Returns all the farm inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching farm inspections
	 */
	public java.util.List<FarmInspection> findBygetFI_CaseIdStatus(
		String status, String caseId);

	/**
	 * Returns a range of all the farm inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @return the range of matching farm inspections
	 */
	public java.util.List<FarmInspection> findBygetFI_CaseIdStatus(
		String status, String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the farm inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm inspections
	 */
	public java.util.List<FarmInspection> findBygetFI_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farm inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm inspections
	 */
	public java.util.List<FarmInspection> findBygetFI_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first farm inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	public FarmInspection findBygetFI_CaseIdStatus_First(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
				orderByComparator)
		throws NoSuchFarmInspectionException;

	/**
	 * Returns the first farm inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public FarmInspection fetchBygetFI_CaseIdStatus_First(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
			orderByComparator);

	/**
	 * Returns the last farm inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	public FarmInspection findBygetFI_CaseIdStatus_Last(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
				orderByComparator)
		throws NoSuchFarmInspectionException;

	/**
	 * Returns the last farm inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public FarmInspection fetchBygetFI_CaseIdStatus_Last(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
			orderByComparator);

	/**
	 * Returns the farm inspections before and after the current farm inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param farmInspectionId the primary key of the current farm inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm inspection
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	public FarmInspection[] findBygetFI_CaseIdStatus_PrevAndNext(
			long farmInspectionId, String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
				orderByComparator)
		throws NoSuchFarmInspectionException;

	/**
	 * Removes all the farm inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public void removeBygetFI_CaseIdStatus(String status, String caseId);

	/**
	 * Returns the number of farm inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching farm inspections
	 */
	public int countBygetFI_CaseIdStatus(String status, String caseId);

	/**
	 * Returns all the farm inspections where status = &#63; and farmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @return the matching farm inspections
	 */
	public java.util.List<FarmInspection> findBygetFI_CaseIdApplicationId(
		String status, long farmApplicationId);

	/**
	 * Returns a range of all the farm inspections where status = &#63; and farmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @return the range of matching farm inspections
	 */
	public java.util.List<FarmInspection> findBygetFI_CaseIdApplicationId(
		String status, long farmApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the farm inspections where status = &#63; and farmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm inspections
	 */
	public java.util.List<FarmInspection> findBygetFI_CaseIdApplicationId(
		String status, long farmApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farm inspections where status = &#63; and farmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm inspections
	 */
	public java.util.List<FarmInspection> findBygetFI_CaseIdApplicationId(
		String status, long farmApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first farm inspection in the ordered set where status = &#63; and farmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	public FarmInspection findBygetFI_CaseIdApplicationId_First(
			String status, long farmApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
				orderByComparator)
		throws NoSuchFarmInspectionException;

	/**
	 * Returns the first farm inspection in the ordered set where status = &#63; and farmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public FarmInspection fetchBygetFI_CaseIdApplicationId_First(
		String status, long farmApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
			orderByComparator);

	/**
	 * Returns the last farm inspection in the ordered set where status = &#63; and farmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	public FarmInspection findBygetFI_CaseIdApplicationId_Last(
			String status, long farmApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
				orderByComparator)
		throws NoSuchFarmInspectionException;

	/**
	 * Returns the last farm inspection in the ordered set where status = &#63; and farmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public FarmInspection fetchBygetFI_CaseIdApplicationId_Last(
		String status, long farmApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
			orderByComparator);

	/**
	 * Returns the farm inspections before and after the current farm inspection in the ordered set where status = &#63; and farmApplicationId = &#63;.
	 *
	 * @param farmInspectionId the primary key of the current farm inspection
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm inspection
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	public FarmInspection[] findBygetFI_CaseIdApplicationId_PrevAndNext(
			long farmInspectionId, String status, long farmApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
				orderByComparator)
		throws NoSuchFarmInspectionException;

	/**
	 * Removes all the farm inspections where status = &#63; and farmApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 */
	public void removeBygetFI_CaseIdApplicationId(
		String status, long farmApplicationId);

	/**
	 * Returns the number of farm inspections where status = &#63; and farmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @return the number of matching farm inspections
	 */
	public int countBygetFI_CaseIdApplicationId(
		String status, long farmApplicationId);

	/**
	 * Returns the farm inspection where status = &#63; and slotBookedByUser = &#63; and farmApplicationId = &#63; or throws a <code>NoSuchFarmInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param farmApplicationId the farm application ID
	 * @return the matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	public FarmInspection findBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long farmApplicationId)
		throws NoSuchFarmInspectionException;

	/**
	 * Returns the farm inspection where status = &#63; and slotBookedByUser = &#63; and farmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param farmApplicationId the farm application ID
	 * @return the matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public FarmInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long farmApplicationId);

	/**
	 * Returns the farm inspection where status = &#63; and slotBookedByUser = &#63; and farmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param farmApplicationId the farm application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	public FarmInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long farmApplicationId,
			boolean useFinderCache);

	/**
	 * Removes the farm inspection where status = &#63; and slotBookedByUser = &#63; and farmApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param farmApplicationId the farm application ID
	 * @return the farm inspection that was removed
	 */
	public FarmInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long farmApplicationId)
		throws NoSuchFarmInspectionException;

	/**
	 * Returns the number of farm inspections where status = &#63; and slotBookedByUser = &#63; and farmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param farmApplicationId the farm application ID
	 * @return the number of matching farm inspections
	 */
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long farmApplicationId);

	/**
	 * Caches the farm inspection in the entity cache if it is enabled.
	 *
	 * @param farmInspection the farm inspection
	 */
	public void cacheResult(FarmInspection farmInspection);

	/**
	 * Caches the farm inspections in the entity cache if it is enabled.
	 *
	 * @param farmInspections the farm inspections
	 */
	public void cacheResult(java.util.List<FarmInspection> farmInspections);

	/**
	 * Creates a new farm inspection with the primary key. Does not add the farm inspection to the database.
	 *
	 * @param farmInspectionId the primary key for the new farm inspection
	 * @return the new farm inspection
	 */
	public FarmInspection create(long farmInspectionId);

	/**
	 * Removes the farm inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmInspectionId the primary key of the farm inspection
	 * @return the farm inspection that was removed
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	public FarmInspection remove(long farmInspectionId)
		throws NoSuchFarmInspectionException;

	public FarmInspection updateImpl(FarmInspection farmInspection);

	/**
	 * Returns the farm inspection with the primary key or throws a <code>NoSuchFarmInspectionException</code> if it could not be found.
	 *
	 * @param farmInspectionId the primary key of the farm inspection
	 * @return the farm inspection
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	public FarmInspection findByPrimaryKey(long farmInspectionId)
		throws NoSuchFarmInspectionException;

	/**
	 * Returns the farm inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmInspectionId the primary key of the farm inspection
	 * @return the farm inspection, or <code>null</code> if a farm inspection with the primary key could not be found
	 */
	public FarmInspection fetchByPrimaryKey(long farmInspectionId);

	/**
	 * Returns all the farm inspections.
	 *
	 * @return the farm inspections
	 */
	public java.util.List<FarmInspection> findAll();

	/**
	 * Returns a range of all the farm inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @return the range of farm inspections
	 */
	public java.util.List<FarmInspection> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the farm inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farm inspections
	 */
	public java.util.List<FarmInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farm inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farm inspections
	 */
	public java.util.List<FarmInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the farm inspections from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of farm inspections.
	 *
	 * @return the number of farm inspections
	 */
	public int countAll();

}