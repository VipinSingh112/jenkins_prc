/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.stage.services.exception.NoSuchHsraInspectionException;
import com.nbp.hsra.stage.services.model.HsraInspection;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the hsra inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HsraInspectionUtil
 * @generated
 */
@ProviderType
public interface HsraInspectionPersistence
	extends BasePersistence<HsraInspection> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HsraInspectionUtil} to access the hsra inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the hsra inspection where caseId = &#63; or throws a <code>NoSuchHsraInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public HsraInspection findBygetHsraInspectionBy_CI(String caseId)
		throws NoSuchHsraInspectionException;

	/**
	 * Returns the hsra inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public HsraInspection fetchBygetHsraInspectionBy_CI(String caseId);

	/**
	 * Returns the hsra inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public HsraInspection fetchBygetHsraInspectionBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the hsra inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the hsra inspection that was removed
	 */
	public HsraInspection removeBygetHsraInspectionBy_CI(String caseId)
		throws NoSuchHsraInspectionException;

	/**
	 * Returns the number of hsra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra inspections
	 */
	public int countBygetHsraInspectionBy_CI(String caseId);

	/**
	 * Returns all the hsra inspections where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra inspections
	 */
	public java.util.List<HsraInspection> findBygetHsra_FBAI(
		long hsraApplicationId);

	/**
	 * Returns a range of all the hsra inspections where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @return the range of matching hsra inspections
	 */
	public java.util.List<HsraInspection> findBygetHsra_FBAI(
		long hsraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the hsra inspections where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra inspections
	 */
	public java.util.List<HsraInspection> findBygetHsra_FBAI(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the hsra inspections where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra inspections
	 */
	public java.util.List<HsraInspection> findBygetHsra_FBAI(
		long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first hsra inspection in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public HsraInspection findBygetHsra_FBAI_First(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
				orderByComparator)
		throws NoSuchHsraInspectionException;

	/**
	 * Returns the first hsra inspection in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public HsraInspection fetchBygetHsra_FBAI_First(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
			orderByComparator);

	/**
	 * Returns the last hsra inspection in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public HsraInspection findBygetHsra_FBAI_Last(
			long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
				orderByComparator)
		throws NoSuchHsraInspectionException;

	/**
	 * Returns the last hsra inspection in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public HsraInspection fetchBygetHsra_FBAI_Last(
		long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
			orderByComparator);

	/**
	 * Returns the hsra inspections before and after the current hsra inspection in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraInspectionId the primary key of the current hsra inspection
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra inspection
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	public HsraInspection[] findBygetHsra_FBAI_PrevAndNext(
			long hsraInspectionId, long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
				orderByComparator)
		throws NoSuchHsraInspectionException;

	/**
	 * Removes all the hsra inspections where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public void removeBygetHsra_FBAI(long hsraApplicationId);

	/**
	 * Returns the number of hsra inspections where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra inspections
	 */
	public int countBygetHsra_FBAI(long hsraApplicationId);

	/**
	 * Returns all the hsra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra inspections
	 */
	public java.util.List<HsraInspection> findBygetHsra_CaseId(String caseId);

	/**
	 * Returns a range of all the hsra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @return the range of matching hsra inspections
	 */
	public java.util.List<HsraInspection> findBygetHsra_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the hsra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra inspections
	 */
	public java.util.List<HsraInspection> findBygetHsra_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the hsra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra inspections
	 */
	public java.util.List<HsraInspection> findBygetHsra_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first hsra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public HsraInspection findBygetHsra_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
				orderByComparator)
		throws NoSuchHsraInspectionException;

	/**
	 * Returns the first hsra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public HsraInspection fetchBygetHsra_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
			orderByComparator);

	/**
	 * Returns the last hsra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public HsraInspection findBygetHsra_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
				orderByComparator)
		throws NoSuchHsraInspectionException;

	/**
	 * Returns the last hsra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public HsraInspection fetchBygetHsra_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
			orderByComparator);

	/**
	 * Returns the hsra inspections before and after the current hsra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param hsraInspectionId the primary key of the current hsra inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra inspection
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	public HsraInspection[] findBygetHsra_CaseId_PrevAndNext(
			long hsraInspectionId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
				orderByComparator)
		throws NoSuchHsraInspectionException;

	/**
	 * Removes all the hsra inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetHsra_CaseId(String caseId);

	/**
	 * Returns the number of hsra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra inspections
	 */
	public int countBygetHsra_CaseId(String caseId);

	/**
	 * Returns all the hsra inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching hsra inspections
	 */
	public java.util.List<HsraInspection> findBygetHsra_Status(String status);

	/**
	 * Returns a range of all the hsra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @return the range of matching hsra inspections
	 */
	public java.util.List<HsraInspection> findBygetHsra_Status(
		String status, int start, int end);

	/**
	 * Returns an ordered range of all the hsra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra inspections
	 */
	public java.util.List<HsraInspection> findBygetHsra_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the hsra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra inspections
	 */
	public java.util.List<HsraInspection> findBygetHsra_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first hsra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public HsraInspection findBygetHsra_Status_First(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
				orderByComparator)
		throws NoSuchHsraInspectionException;

	/**
	 * Returns the first hsra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public HsraInspection fetchBygetHsra_Status_First(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
			orderByComparator);

	/**
	 * Returns the last hsra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public HsraInspection findBygetHsra_Status_Last(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
				orderByComparator)
		throws NoSuchHsraInspectionException;

	/**
	 * Returns the last hsra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public HsraInspection fetchBygetHsra_Status_Last(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
			orderByComparator);

	/**
	 * Returns the hsra inspections before and after the current hsra inspection in the ordered set where status = &#63;.
	 *
	 * @param hsraInspectionId the primary key of the current hsra inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra inspection
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	public HsraInspection[] findBygetHsra_Status_PrevAndNext(
			long hsraInspectionId, String status,
			com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
				orderByComparator)
		throws NoSuchHsraInspectionException;

	/**
	 * Removes all the hsra inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetHsra_Status(String status);

	/**
	 * Returns the number of hsra inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching hsra inspections
	 */
	public int countBygetHsra_Status(String status);

	/**
	 * Returns all the hsra inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching hsra inspections
	 */
	public java.util.List<HsraInspection> findBygetHsra_CaseIdStatus(
		String status, String caseId);

	/**
	 * Returns a range of all the hsra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @return the range of matching hsra inspections
	 */
	public java.util.List<HsraInspection> findBygetHsra_CaseIdStatus(
		String status, String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the hsra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra inspections
	 */
	public java.util.List<HsraInspection> findBygetHsra_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the hsra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra inspections
	 */
	public java.util.List<HsraInspection> findBygetHsra_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first hsra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public HsraInspection findBygetHsra_CaseIdStatus_First(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
				orderByComparator)
		throws NoSuchHsraInspectionException;

	/**
	 * Returns the first hsra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public HsraInspection fetchBygetHsra_CaseIdStatus_First(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
			orderByComparator);

	/**
	 * Returns the last hsra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public HsraInspection findBygetHsra_CaseIdStatus_Last(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
				orderByComparator)
		throws NoSuchHsraInspectionException;

	/**
	 * Returns the last hsra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public HsraInspection fetchBygetHsra_CaseIdStatus_Last(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
			orderByComparator);

	/**
	 * Returns the hsra inspections before and after the current hsra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param hsraInspectionId the primary key of the current hsra inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra inspection
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	public HsraInspection[] findBygetHsra_CaseIdStatus_PrevAndNext(
			long hsraInspectionId, String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
				orderByComparator)
		throws NoSuchHsraInspectionException;

	/**
	 * Removes all the hsra inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public void removeBygetHsra_CaseIdStatus(String status, String caseId);

	/**
	 * Returns the number of hsra inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching hsra inspections
	 */
	public int countBygetHsra_CaseIdStatus(String status, String caseId);

	/**
	 * Returns all the hsra inspections where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra inspections
	 */
	public java.util.List<HsraInspection> findBygetHsra_CaseIdApplicationId(
		String status, long hsraApplicationId);

	/**
	 * Returns a range of all the hsra inspections where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @return the range of matching hsra inspections
	 */
	public java.util.List<HsraInspection> findBygetHsra_CaseIdApplicationId(
		String status, long hsraApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the hsra inspections where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra inspections
	 */
	public java.util.List<HsraInspection> findBygetHsra_CaseIdApplicationId(
		String status, long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the hsra inspections where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra inspections
	 */
	public java.util.List<HsraInspection> findBygetHsra_CaseIdApplicationId(
		String status, long hsraApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first hsra inspection in the ordered set where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public HsraInspection findBygetHsra_CaseIdApplicationId_First(
			String status, long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
				orderByComparator)
		throws NoSuchHsraInspectionException;

	/**
	 * Returns the first hsra inspection in the ordered set where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public HsraInspection fetchBygetHsra_CaseIdApplicationId_First(
		String status, long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
			orderByComparator);

	/**
	 * Returns the last hsra inspection in the ordered set where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public HsraInspection findBygetHsra_CaseIdApplicationId_Last(
			String status, long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
				orderByComparator)
		throws NoSuchHsraInspectionException;

	/**
	 * Returns the last hsra inspection in the ordered set where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public HsraInspection fetchBygetHsra_CaseIdApplicationId_Last(
		String status, long hsraApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
			orderByComparator);

	/**
	 * Returns the hsra inspections before and after the current hsra inspection in the ordered set where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param hsraInspectionId the primary key of the current hsra inspection
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra inspection
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	public HsraInspection[] findBygetHsra_CaseIdApplicationId_PrevAndNext(
			long hsraInspectionId, String status, long hsraApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
				orderByComparator)
		throws NoSuchHsraInspectionException;

	/**
	 * Removes all the hsra inspections where status = &#63; and hsraApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 */
	public void removeBygetHsra_CaseIdApplicationId(
		String status, long hsraApplicationId);

	/**
	 * Returns the number of hsra inspections where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra inspections
	 */
	public int countBygetHsra_CaseIdApplicationId(
		String status, long hsraApplicationId);

	/**
	 * Returns the hsra inspection where status = &#63; and slotBookedByUser = &#63; and hsraApplicationId = &#63; or throws a <code>NoSuchHsraInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public HsraInspection findBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long hsraApplicationId)
		throws NoSuchHsraInspectionException;

	/**
	 * Returns the hsra inspection where status = &#63; and slotBookedByUser = &#63; and hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public HsraInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long hsraApplicationId);

	/**
	 * Returns the hsra inspection where status = &#63; and slotBookedByUser = &#63; and hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public HsraInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long hsraApplicationId,
			boolean useFinderCache);

	/**
	 * Removes the hsra inspection where status = &#63; and slotBookedByUser = &#63; and hsraApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param hsraApplicationId the hsra application ID
	 * @return the hsra inspection that was removed
	 */
	public HsraInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long hsraApplicationId)
		throws NoSuchHsraInspectionException;

	/**
	 * Returns the number of hsra inspections where status = &#63; and slotBookedByUser = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra inspections
	 */
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long hsraApplicationId);

	/**
	 * Caches the hsra inspection in the entity cache if it is enabled.
	 *
	 * @param hsraInspection the hsra inspection
	 */
	public void cacheResult(HsraInspection hsraInspection);

	/**
	 * Caches the hsra inspections in the entity cache if it is enabled.
	 *
	 * @param hsraInspections the hsra inspections
	 */
	public void cacheResult(java.util.List<HsraInspection> hsraInspections);

	/**
	 * Creates a new hsra inspection with the primary key. Does not add the hsra inspection to the database.
	 *
	 * @param hsraInspectionId the primary key for the new hsra inspection
	 * @return the new hsra inspection
	 */
	public HsraInspection create(long hsraInspectionId);

	/**
	 * Removes the hsra inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraInspectionId the primary key of the hsra inspection
	 * @return the hsra inspection that was removed
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	public HsraInspection remove(long hsraInspectionId)
		throws NoSuchHsraInspectionException;

	public HsraInspection updateImpl(HsraInspection hsraInspection);

	/**
	 * Returns the hsra inspection with the primary key or throws a <code>NoSuchHsraInspectionException</code> if it could not be found.
	 *
	 * @param hsraInspectionId the primary key of the hsra inspection
	 * @return the hsra inspection
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	public HsraInspection findByPrimaryKey(long hsraInspectionId)
		throws NoSuchHsraInspectionException;

	/**
	 * Returns the hsra inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraInspectionId the primary key of the hsra inspection
	 * @return the hsra inspection, or <code>null</code> if a hsra inspection with the primary key could not be found
	 */
	public HsraInspection fetchByPrimaryKey(long hsraInspectionId);

	/**
	 * Returns all the hsra inspections.
	 *
	 * @return the hsra inspections
	 */
	public java.util.List<HsraInspection> findAll();

	/**
	 * Returns a range of all the hsra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @return the range of hsra inspections
	 */
	public java.util.List<HsraInspection> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the hsra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra inspections
	 */
	public java.util.List<HsraInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the hsra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra inspections
	 */
	public java.util.List<HsraInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the hsra inspections from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of hsra inspections.
	 *
	 * @return the number of hsra inspections
	 */
	public int countAll();

}