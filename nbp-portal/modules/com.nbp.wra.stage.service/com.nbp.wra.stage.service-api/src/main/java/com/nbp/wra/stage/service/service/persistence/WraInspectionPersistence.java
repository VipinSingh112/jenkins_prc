/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.wra.stage.service.exception.NoSuchWraInspectionException;
import com.nbp.wra.stage.service.model.WraInspection;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the wra inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WraInspectionUtil
 * @generated
 */
@ProviderType
public interface WraInspectionPersistence
	extends BasePersistence<WraInspection> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WraInspectionUtil} to access the wra inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the wra inspection where caseId = &#63; or throws a <code>NoSuchWraInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public WraInspection findBygetWraInspectionBy_CI(String caseId)
		throws NoSuchWraInspectionException;

	/**
	 * Returns the wra inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public WraInspection fetchBygetWraInspectionBy_CI(String caseId);

	/**
	 * Returns the wra inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public WraInspection fetchBygetWraInspectionBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the wra inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the wra inspection that was removed
	 */
	public WraInspection removeBygetWraInspectionBy_CI(String caseId)
		throws NoSuchWraInspectionException;

	/**
	 * Returns the number of wra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra inspections
	 */
	public int countBygetWraInspectionBy_CI(String caseId);

	/**
	 * Returns all the wra inspections where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra inspections
	 */
	public java.util.List<WraInspection> findBygetWraById(
		long wraApplicationId);

	/**
	 * Returns a range of all the wra inspections where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @return the range of matching wra inspections
	 */
	public java.util.List<WraInspection> findBygetWraById(
		long wraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the wra inspections where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra inspections
	 */
	public java.util.List<WraInspection> findBygetWraById(
		long wraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra inspections where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra inspections
	 */
	public java.util.List<WraInspection> findBygetWraById(
		long wraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first wra inspection in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public WraInspection findBygetWraById_First(
			long wraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
				orderByComparator)
		throws NoSuchWraInspectionException;

	/**
	 * Returns the first wra inspection in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public WraInspection fetchBygetWraById_First(
		long wraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
			orderByComparator);

	/**
	 * Returns the last wra inspection in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public WraInspection findBygetWraById_Last(
			long wraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
				orderByComparator)
		throws NoSuchWraInspectionException;

	/**
	 * Returns the last wra inspection in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public WraInspection fetchBygetWraById_Last(
		long wraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
			orderByComparator);

	/**
	 * Returns the wra inspections before and after the current wra inspection in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraInspectionId the primary key of the current wra inspection
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra inspection
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	public WraInspection[] findBygetWraById_PrevAndNext(
			long wraInspectionId, long wraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
				orderByComparator)
		throws NoSuchWraInspectionException;

	/**
	 * Removes all the wra inspections where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 */
	public void removeBygetWraById(long wraApplicationId);

	/**
	 * Returns the number of wra inspections where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra inspections
	 */
	public int countBygetWraById(long wraApplicationId);

	/**
	 * Returns all the wra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching wra inspections
	 */
	public java.util.List<WraInspection> findBygetWra_CaseId(String caseId);

	/**
	 * Returns a range of all the wra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @return the range of matching wra inspections
	 */
	public java.util.List<WraInspection> findBygetWra_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the wra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra inspections
	 */
	public java.util.List<WraInspection> findBygetWra_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra inspections
	 */
	public java.util.List<WraInspection> findBygetWra_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first wra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public WraInspection findBygetWra_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
				orderByComparator)
		throws NoSuchWraInspectionException;

	/**
	 * Returns the first wra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public WraInspection fetchBygetWra_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
			orderByComparator);

	/**
	 * Returns the last wra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public WraInspection findBygetWra_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
				orderByComparator)
		throws NoSuchWraInspectionException;

	/**
	 * Returns the last wra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public WraInspection fetchBygetWra_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
			orderByComparator);

	/**
	 * Returns the wra inspections before and after the current wra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param wraInspectionId the primary key of the current wra inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra inspection
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	public WraInspection[] findBygetWra_CaseId_PrevAndNext(
			long wraInspectionId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
				orderByComparator)
		throws NoSuchWraInspectionException;

	/**
	 * Removes all the wra inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetWra_CaseId(String caseId);

	/**
	 * Returns the number of wra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra inspections
	 */
	public int countBygetWra_CaseId(String caseId);

	/**
	 * Returns all the wra inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching wra inspections
	 */
	public java.util.List<WraInspection> findBygetWra_Status(String status);

	/**
	 * Returns a range of all the wra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @return the range of matching wra inspections
	 */
	public java.util.List<WraInspection> findBygetWra_Status(
		String status, int start, int end);

	/**
	 * Returns an ordered range of all the wra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra inspections
	 */
	public java.util.List<WraInspection> findBygetWra_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra inspections
	 */
	public java.util.List<WraInspection> findBygetWra_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first wra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public WraInspection findBygetWra_Status_First(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
				orderByComparator)
		throws NoSuchWraInspectionException;

	/**
	 * Returns the first wra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public WraInspection fetchBygetWra_Status_First(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
			orderByComparator);

	/**
	 * Returns the last wra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public WraInspection findBygetWra_Status_Last(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
				orderByComparator)
		throws NoSuchWraInspectionException;

	/**
	 * Returns the last wra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public WraInspection fetchBygetWra_Status_Last(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
			orderByComparator);

	/**
	 * Returns the wra inspections before and after the current wra inspection in the ordered set where status = &#63;.
	 *
	 * @param wraInspectionId the primary key of the current wra inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra inspection
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	public WraInspection[] findBygetWra_Status_PrevAndNext(
			long wraInspectionId, String status,
			com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
				orderByComparator)
		throws NoSuchWraInspectionException;

	/**
	 * Removes all the wra inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetWra_Status(String status);

	/**
	 * Returns the number of wra inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching wra inspections
	 */
	public int countBygetWra_Status(String status);

	/**
	 * Returns all the wra inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching wra inspections
	 */
	public java.util.List<WraInspection> findBygetWra_CI_Status(
		String status, String caseId);

	/**
	 * Returns a range of all the wra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @return the range of matching wra inspections
	 */
	public java.util.List<WraInspection> findBygetWra_CI_Status(
		String status, String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the wra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra inspections
	 */
	public java.util.List<WraInspection> findBygetWra_CI_Status(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra inspections
	 */
	public java.util.List<WraInspection> findBygetWra_CI_Status(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first wra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public WraInspection findBygetWra_CI_Status_First(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
				orderByComparator)
		throws NoSuchWraInspectionException;

	/**
	 * Returns the first wra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public WraInspection fetchBygetWra_CI_Status_First(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
			orderByComparator);

	/**
	 * Returns the last wra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public WraInspection findBygetWra_CI_Status_Last(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
				orderByComparator)
		throws NoSuchWraInspectionException;

	/**
	 * Returns the last wra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public WraInspection fetchBygetWra_CI_Status_Last(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
			orderByComparator);

	/**
	 * Returns the wra inspections before and after the current wra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param wraInspectionId the primary key of the current wra inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra inspection
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	public WraInspection[] findBygetWra_CI_Status_PrevAndNext(
			long wraInspectionId, String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
				orderByComparator)
		throws NoSuchWraInspectionException;

	/**
	 * Removes all the wra inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public void removeBygetWra_CI_Status(String status, String caseId);

	/**
	 * Returns the number of wra inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching wra inspections
	 */
	public int countBygetWra_CI_Status(String status, String caseId);

	/**
	 * Returns all the wra inspections where status = &#63; and wraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra inspections
	 */
	public java.util.List<WraInspection> findBygetWra_CI_AppId(
		String status, long wraApplicationId);

	/**
	 * Returns a range of all the wra inspections where status = &#63; and wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @return the range of matching wra inspections
	 */
	public java.util.List<WraInspection> findBygetWra_CI_AppId(
		String status, long wraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the wra inspections where status = &#63; and wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra inspections
	 */
	public java.util.List<WraInspection> findBygetWra_CI_AppId(
		String status, long wraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra inspections where status = &#63; and wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra inspections
	 */
	public java.util.List<WraInspection> findBygetWra_CI_AppId(
		String status, long wraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first wra inspection in the ordered set where status = &#63; and wraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public WraInspection findBygetWra_CI_AppId_First(
			String status, long wraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
				orderByComparator)
		throws NoSuchWraInspectionException;

	/**
	 * Returns the first wra inspection in the ordered set where status = &#63; and wraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public WraInspection fetchBygetWra_CI_AppId_First(
		String status, long wraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
			orderByComparator);

	/**
	 * Returns the last wra inspection in the ordered set where status = &#63; and wraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public WraInspection findBygetWra_CI_AppId_Last(
			String status, long wraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
				orderByComparator)
		throws NoSuchWraInspectionException;

	/**
	 * Returns the last wra inspection in the ordered set where status = &#63; and wraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public WraInspection fetchBygetWra_CI_AppId_Last(
		String status, long wraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
			orderByComparator);

	/**
	 * Returns the wra inspections before and after the current wra inspection in the ordered set where status = &#63; and wraApplicationId = &#63;.
	 *
	 * @param wraInspectionId the primary key of the current wra inspection
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra inspection
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	public WraInspection[] findBygetWra_CI_AppId_PrevAndNext(
			long wraInspectionId, String status, long wraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
				orderByComparator)
		throws NoSuchWraInspectionException;

	/**
	 * Removes all the wra inspections where status = &#63; and wraApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 */
	public void removeBygetWra_CI_AppId(String status, long wraApplicationId);

	/**
	 * Returns the number of wra inspections where status = &#63; and wraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra inspections
	 */
	public int countBygetWra_CI_AppId(String status, long wraApplicationId);

	/**
	 * Returns the wra inspection where status = &#63; and slotBookedByUser = &#63; and wraApplicationId = &#63; or throws a <code>NoSuchWraInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public WraInspection findBygetInspecByST_Slot_AppId(
			String status, long slotBookedByUser, long wraApplicationId)
		throws NoSuchWraInspectionException;

	/**
	 * Returns the wra inspection where status = &#63; and slotBookedByUser = &#63; and wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public WraInspection fetchBygetInspecByST_Slot_AppId(
		String status, long slotBookedByUser, long wraApplicationId);

	/**
	 * Returns the wra inspection where status = &#63; and slotBookedByUser = &#63; and wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public WraInspection fetchBygetInspecByST_Slot_AppId(
		String status, long slotBookedByUser, long wraApplicationId,
		boolean useFinderCache);

	/**
	 * Removes the wra inspection where status = &#63; and slotBookedByUser = &#63; and wraApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param wraApplicationId the wra application ID
	 * @return the wra inspection that was removed
	 */
	public WraInspection removeBygetInspecByST_Slot_AppId(
			String status, long slotBookedByUser, long wraApplicationId)
		throws NoSuchWraInspectionException;

	/**
	 * Returns the number of wra inspections where status = &#63; and slotBookedByUser = &#63; and wraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra inspections
	 */
	public int countBygetInspecByST_Slot_AppId(
		String status, long slotBookedByUser, long wraApplicationId);

	/**
	 * Caches the wra inspection in the entity cache if it is enabled.
	 *
	 * @param wraInspection the wra inspection
	 */
	public void cacheResult(WraInspection wraInspection);

	/**
	 * Caches the wra inspections in the entity cache if it is enabled.
	 *
	 * @param wraInspections the wra inspections
	 */
	public void cacheResult(java.util.List<WraInspection> wraInspections);

	/**
	 * Creates a new wra inspection with the primary key. Does not add the wra inspection to the database.
	 *
	 * @param wraInspectionId the primary key for the new wra inspection
	 * @return the new wra inspection
	 */
	public WraInspection create(long wraInspectionId);

	/**
	 * Removes the wra inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraInspectionId the primary key of the wra inspection
	 * @return the wra inspection that was removed
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	public WraInspection remove(long wraInspectionId)
		throws NoSuchWraInspectionException;

	public WraInspection updateImpl(WraInspection wraInspection);

	/**
	 * Returns the wra inspection with the primary key or throws a <code>NoSuchWraInspectionException</code> if it could not be found.
	 *
	 * @param wraInspectionId the primary key of the wra inspection
	 * @return the wra inspection
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	public WraInspection findByPrimaryKey(long wraInspectionId)
		throws NoSuchWraInspectionException;

	/**
	 * Returns the wra inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraInspectionId the primary key of the wra inspection
	 * @return the wra inspection, or <code>null</code> if a wra inspection with the primary key could not be found
	 */
	public WraInspection fetchByPrimaryKey(long wraInspectionId);

	/**
	 * Returns all the wra inspections.
	 *
	 * @return the wra inspections
	 */
	public java.util.List<WraInspection> findAll();

	/**
	 * Returns a range of all the wra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @return the range of wra inspections
	 */
	public java.util.List<WraInspection> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the wra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra inspections
	 */
	public java.util.List<WraInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra inspections
	 */
	public java.util.List<WraInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the wra inspections from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of wra inspections.
	 *
	 * @return the number of wra inspections
	 */
	public int countAll();

}