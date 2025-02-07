/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.fire.brigade.stage.service.exception.NoSuchFireBrigadeInspectionException;
import com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the fire brigade inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeInspectionUtil
 * @generated
 */
@ProviderType
public interface FireBrigadeInspectionPersistence
	extends BasePersistence<FireBrigadeInspection> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FireBrigadeInspectionUtil} to access the fire brigade inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the fire brigade inspection where caseId = &#63; or throws a <code>NoSuchFireBrigadeInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection findBygetFireBrigadeInspectionBy_CI(
			String caseId)
		throws NoSuchFireBrigadeInspectionException;

	/**
	 * Returns the fire brigade inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection fetchBygetFireBrigadeInspectionBy_CI(
		String caseId);

	/**
	 * Returns the fire brigade inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection fetchBygetFireBrigadeInspectionBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the fire brigade inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the fire brigade inspection that was removed
	 */
	public FireBrigadeInspection removeBygetFireBrigadeInspectionBy_CI(
			String caseId)
		throws NoSuchFireBrigadeInspectionException;

	/**
	 * Returns the number of fire brigade inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade inspections
	 */
	public int countBygetFireBrigadeInspectionBy_CI(String caseId);

	/**
	 * Returns all the fire brigade inspections where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection> findBygetFBI_FBAI(
		long fireBrigadeApplicationId);

	/**
	 * Returns a range of all the fire brigade inspections where fireBrigadeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @return the range of matching fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection> findBygetFBI_FBAI(
		long fireBrigadeApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade inspections where fireBrigadeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection> findBygetFBI_FBAI(
		long fireBrigadeApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade inspections where fireBrigadeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection> findBygetFBI_FBAI(
		long fireBrigadeApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first fire brigade inspection in the ordered set where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection findBygetFBI_FBAI_First(
			long fireBrigadeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException;

	/**
	 * Returns the first fire brigade inspection in the ordered set where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection fetchBygetFBI_FBAI_First(
		long fireBrigadeApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeInspection>
			orderByComparator);

	/**
	 * Returns the last fire brigade inspection in the ordered set where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection findBygetFBI_FBAI_Last(
			long fireBrigadeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException;

	/**
	 * Returns the last fire brigade inspection in the ordered set where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection fetchBygetFBI_FBAI_Last(
		long fireBrigadeApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeInspection>
			orderByComparator);

	/**
	 * Returns the fire brigade inspections before and after the current fire brigade inspection in the ordered set where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeInspectionId the primary key of the current fire brigade inspection
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	public FireBrigadeInspection[] findBygetFBI_FBAI_PrevAndNext(
			long fireBrigadeInspectionId, long fireBrigadeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException;

	/**
	 * Removes all the fire brigade inspections where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 */
	public void removeBygetFBI_FBAI(long fireBrigadeApplicationId);

	/**
	 * Returns the number of fire brigade inspections where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade inspections
	 */
	public int countBygetFBI_FBAI(long fireBrigadeApplicationId);

	/**
	 * Returns all the fire brigade inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection> findBygetFBI_CaseId(
		String caseId);

	/**
	 * Returns a range of all the fire brigade inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @return the range of matching fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection> findBygetFBI_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection> findBygetFBI_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection> findBygetFBI_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first fire brigade inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection findBygetFBI_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException;

	/**
	 * Returns the first fire brigade inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection fetchBygetFBI_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeInspection>
			orderByComparator);

	/**
	 * Returns the last fire brigade inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection findBygetFBI_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException;

	/**
	 * Returns the last fire brigade inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection fetchBygetFBI_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeInspection>
			orderByComparator);

	/**
	 * Returns the fire brigade inspections before and after the current fire brigade inspection in the ordered set where caseId = &#63;.
	 *
	 * @param fireBrigadeInspectionId the primary key of the current fire brigade inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	public FireBrigadeInspection[] findBygetFBI_CaseId_PrevAndNext(
			long fireBrigadeInspectionId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException;

	/**
	 * Removes all the fire brigade inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetFBI_CaseId(String caseId);

	/**
	 * Returns the number of fire brigade inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade inspections
	 */
	public int countBygetFBI_CaseId(String caseId);

	/**
	 * Returns all the fire brigade inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection> findBygetFBI_Status(
		String status);

	/**
	 * Returns a range of all the fire brigade inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @return the range of matching fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection> findBygetFBI_Status(
		String status, int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection> findBygetFBI_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection> findBygetFBI_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first fire brigade inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection findBygetFBI_Status_First(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException;

	/**
	 * Returns the first fire brigade inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection fetchBygetFBI_Status_First(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeInspection>
			orderByComparator);

	/**
	 * Returns the last fire brigade inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection findBygetFBI_Status_Last(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException;

	/**
	 * Returns the last fire brigade inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection fetchBygetFBI_Status_Last(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeInspection>
			orderByComparator);

	/**
	 * Returns the fire brigade inspections before and after the current fire brigade inspection in the ordered set where status = &#63;.
	 *
	 * @param fireBrigadeInspectionId the primary key of the current fire brigade inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	public FireBrigadeInspection[] findBygetFBI_Status_PrevAndNext(
			long fireBrigadeInspectionId, String status,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException;

	/**
	 * Removes all the fire brigade inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetFBI_Status(String status);

	/**
	 * Returns the number of fire brigade inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching fire brigade inspections
	 */
	public int countBygetFBI_Status(String status);

	/**
	 * Returns all the fire brigade inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection> findBygetFBI_CaseIdStatus(
		String status, String caseId);

	/**
	 * Returns a range of all the fire brigade inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @return the range of matching fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection> findBygetFBI_CaseIdStatus(
		String status, String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection> findBygetFBI_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection> findBygetFBI_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first fire brigade inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection findBygetFBI_CaseIdStatus_First(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException;

	/**
	 * Returns the first fire brigade inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection fetchBygetFBI_CaseIdStatus_First(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeInspection>
			orderByComparator);

	/**
	 * Returns the last fire brigade inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection findBygetFBI_CaseIdStatus_Last(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException;

	/**
	 * Returns the last fire brigade inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection fetchBygetFBI_CaseIdStatus_Last(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeInspection>
			orderByComparator);

	/**
	 * Returns the fire brigade inspections before and after the current fire brigade inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param fireBrigadeInspectionId the primary key of the current fire brigade inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	public FireBrigadeInspection[] findBygetFBI_CaseIdStatus_PrevAndNext(
			long fireBrigadeInspectionId, String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException;

	/**
	 * Removes all the fire brigade inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public void removeBygetFBI_CaseIdStatus(String status, String caseId);

	/**
	 * Returns the number of fire brigade inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching fire brigade inspections
	 */
	public int countBygetFBI_CaseIdStatus(String status, String caseId);

	/**
	 * Returns all the fire brigade inspections where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection>
		findBygetFBI_CaseIdApplicationId(
			String status, long fireBrigadeApplicationId);

	/**
	 * Returns a range of all the fire brigade inspections where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @return the range of matching fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection>
		findBygetFBI_CaseIdApplicationId(
			String status, long fireBrigadeApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade inspections where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection>
		findBygetFBI_CaseIdApplicationId(
			String status, long fireBrigadeApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeInspection> orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade inspections where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection>
		findBygetFBI_CaseIdApplicationId(
			String status, long fireBrigadeApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeInspection> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first fire brigade inspection in the ordered set where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection findBygetFBI_CaseIdApplicationId_First(
			String status, long fireBrigadeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException;

	/**
	 * Returns the first fire brigade inspection in the ordered set where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection fetchBygetFBI_CaseIdApplicationId_First(
		String status, long fireBrigadeApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeInspection>
			orderByComparator);

	/**
	 * Returns the last fire brigade inspection in the ordered set where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection findBygetFBI_CaseIdApplicationId_Last(
			String status, long fireBrigadeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException;

	/**
	 * Returns the last fire brigade inspection in the ordered set where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection fetchBygetFBI_CaseIdApplicationId_Last(
		String status, long fireBrigadeApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeInspection>
			orderByComparator);

	/**
	 * Returns the fire brigade inspections before and after the current fire brigade inspection in the ordered set where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeInspectionId the primary key of the current fire brigade inspection
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	public FireBrigadeInspection[] findBygetFBI_CaseIdApplicationId_PrevAndNext(
			long fireBrigadeInspectionId, String status,
			long fireBrigadeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException;

	/**
	 * Removes all the fire brigade inspections where status = &#63; and fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 */
	public void removeBygetFBI_CaseIdApplicationId(
		String status, long fireBrigadeApplicationId);

	/**
	 * Returns the number of fire brigade inspections where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade inspections
	 */
	public int countBygetFBI_CaseIdApplicationId(
		String status, long fireBrigadeApplicationId);

	/**
	 * Returns the fire brigade inspection where status = &#63; and slotBookedByUser = &#63; and fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeInspectionException;

	/**
	 * Returns the fire brigade inspection where status = &#63; and slotBookedByUser = &#63; and fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser,
			long fireBrigadeApplicationId);

	/**
	 * Returns the fire brigade inspection where status = &#63; and slotBookedByUser = &#63; and fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public FireBrigadeInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long fireBrigadeApplicationId,
			boolean useFinderCache);

	/**
	 * Removes the fire brigade inspection where status = &#63; and slotBookedByUser = &#63; and fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade inspection that was removed
	 */
	public FireBrigadeInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeInspectionException;

	/**
	 * Returns the number of fire brigade inspections where status = &#63; and slotBookedByUser = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade inspections
	 */
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long fireBrigadeApplicationId);

	/**
	 * Caches the fire brigade inspection in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeInspection the fire brigade inspection
	 */
	public void cacheResult(FireBrigadeInspection fireBrigadeInspection);

	/**
	 * Caches the fire brigade inspections in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeInspections the fire brigade inspections
	 */
	public void cacheResult(
		java.util.List<FireBrigadeInspection> fireBrigadeInspections);

	/**
	 * Creates a new fire brigade inspection with the primary key. Does not add the fire brigade inspection to the database.
	 *
	 * @param fireBrigadeInspectionId the primary key for the new fire brigade inspection
	 * @return the new fire brigade inspection
	 */
	public FireBrigadeInspection create(long fireBrigadeInspectionId);

	/**
	 * Removes the fire brigade inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeInspectionId the primary key of the fire brigade inspection
	 * @return the fire brigade inspection that was removed
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	public FireBrigadeInspection remove(long fireBrigadeInspectionId)
		throws NoSuchFireBrigadeInspectionException;

	public FireBrigadeInspection updateImpl(
		FireBrigadeInspection fireBrigadeInspection);

	/**
	 * Returns the fire brigade inspection with the primary key or throws a <code>NoSuchFireBrigadeInspectionException</code> if it could not be found.
	 *
	 * @param fireBrigadeInspectionId the primary key of the fire brigade inspection
	 * @return the fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	public FireBrigadeInspection findByPrimaryKey(long fireBrigadeInspectionId)
		throws NoSuchFireBrigadeInspectionException;

	/**
	 * Returns the fire brigade inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeInspectionId the primary key of the fire brigade inspection
	 * @return the fire brigade inspection, or <code>null</code> if a fire brigade inspection with the primary key could not be found
	 */
	public FireBrigadeInspection fetchByPrimaryKey(
		long fireBrigadeInspectionId);

	/**
	 * Returns all the fire brigade inspections.
	 *
	 * @return the fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection> findAll();

	/**
	 * Returns a range of all the fire brigade inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @return the range of fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade inspections
	 */
	public java.util.List<FireBrigadeInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the fire brigade inspections from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of fire brigade inspections.
	 *
	 * @return the number of fire brigade inspections
	 */
	public int countAll();

}