/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.stages.services.exception.NoSuchJanaacInspectionException;
import com.nbp.janaac.stages.services.model.JanaacInspection;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the janaac inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JanaacInspectionUtil
 * @generated
 */
@ProviderType
public interface JanaacInspectionPersistence
	extends BasePersistence<JanaacInspection> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JanaacInspectionUtil} to access the janaac inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the janaac inspection where caseId = &#63; or throws a <code>NoSuchJanaacInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public JanaacInspection findBygetJanaacInspectionBy_CI(String caseId)
		throws NoSuchJanaacInspectionException;

	/**
	 * Returns the janaac inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public JanaacInspection fetchBygetJanaacInspectionBy_CI(String caseId);

	/**
	 * Returns the janaac inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public JanaacInspection fetchBygetJanaacInspectionBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the janaac inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the janaac inspection that was removed
	 */
	public JanaacInspection removeBygetJanaacInspectionBy_CI(String caseId)
		throws NoSuchJanaacInspectionException;

	/**
	 * Returns the number of janaac inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac inspections
	 */
	public int countBygetJanaacInspectionBy_CI(String caseId);

	/**
	 * Returns all the janaac inspections where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac inspections
	 */
	public java.util.List<JanaacInspection> findBygetJanaac_AI(
		long janaacApplicationId);

	/**
	 * Returns a range of all the janaac inspections where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @return the range of matching janaac inspections
	 */
	public java.util.List<JanaacInspection> findBygetJanaac_AI(
		long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the janaac inspections where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac inspections
	 */
	public java.util.List<JanaacInspection> findBygetJanaac_AI(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the janaac inspections where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac inspections
	 */
	public java.util.List<JanaacInspection> findBygetJanaac_AI(
		long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first janaac inspection in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public JanaacInspection findBygetJanaac_AI_First(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
				orderByComparator)
		throws NoSuchJanaacInspectionException;

	/**
	 * Returns the first janaac inspection in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public JanaacInspection fetchBygetJanaac_AI_First(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
			orderByComparator);

	/**
	 * Returns the last janaac inspection in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public JanaacInspection findBygetJanaac_AI_Last(
			long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
				orderByComparator)
		throws NoSuchJanaacInspectionException;

	/**
	 * Returns the last janaac inspection in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public JanaacInspection fetchBygetJanaac_AI_Last(
		long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
			orderByComparator);

	/**
	 * Returns the janaac inspections before and after the current janaac inspection in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacInspectionId the primary key of the current janaac inspection
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac inspection
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	public JanaacInspection[] findBygetJanaac_AI_PrevAndNext(
			long janaacInspectionId, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
				orderByComparator)
		throws NoSuchJanaacInspectionException;

	/**
	 * Removes all the janaac inspections where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaac_AI(long janaacApplicationId);

	/**
	 * Returns the number of janaac inspections where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching janaac inspections
	 */
	public int countBygetJanaac_AI(long janaacApplicationId);

	/**
	 * Returns all the janaac inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac inspections
	 */
	public java.util.List<JanaacInspection> findBygetjanaac_by_CaseId(
		String caseId);

	/**
	 * Returns a range of all the janaac inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @return the range of matching janaac inspections
	 */
	public java.util.List<JanaacInspection> findBygetjanaac_by_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the janaac inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac inspections
	 */
	public java.util.List<JanaacInspection> findBygetjanaac_by_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the janaac inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac inspections
	 */
	public java.util.List<JanaacInspection> findBygetjanaac_by_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first janaac inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public JanaacInspection findBygetjanaac_by_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
				orderByComparator)
		throws NoSuchJanaacInspectionException;

	/**
	 * Returns the first janaac inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public JanaacInspection fetchBygetjanaac_by_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
			orderByComparator);

	/**
	 * Returns the last janaac inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public JanaacInspection findBygetjanaac_by_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
				orderByComparator)
		throws NoSuchJanaacInspectionException;

	/**
	 * Returns the last janaac inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public JanaacInspection fetchBygetjanaac_by_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
			orderByComparator);

	/**
	 * Returns the janaac inspections before and after the current janaac inspection in the ordered set where caseId = &#63;.
	 *
	 * @param janaacInspectionId the primary key of the current janaac inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac inspection
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	public JanaacInspection[] findBygetjanaac_by_CaseId_PrevAndNext(
			long janaacInspectionId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
				orderByComparator)
		throws NoSuchJanaacInspectionException;

	/**
	 * Removes all the janaac inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetjanaac_by_CaseId(String caseId);

	/**
	 * Returns the number of janaac inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac inspections
	 */
	public int countBygetjanaac_by_CaseId(String caseId);

	/**
	 * Returns all the janaac inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching janaac inspections
	 */
	public java.util.List<JanaacInspection> findBygetJanaac_Status(
		String status);

	/**
	 * Returns a range of all the janaac inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @return the range of matching janaac inspections
	 */
	public java.util.List<JanaacInspection> findBygetJanaac_Status(
		String status, int start, int end);

	/**
	 * Returns an ordered range of all the janaac inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac inspections
	 */
	public java.util.List<JanaacInspection> findBygetJanaac_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the janaac inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac inspections
	 */
	public java.util.List<JanaacInspection> findBygetJanaac_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first janaac inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public JanaacInspection findBygetJanaac_Status_First(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
				orderByComparator)
		throws NoSuchJanaacInspectionException;

	/**
	 * Returns the first janaac inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public JanaacInspection fetchBygetJanaac_Status_First(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
			orderByComparator);

	/**
	 * Returns the last janaac inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public JanaacInspection findBygetJanaac_Status_Last(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
				orderByComparator)
		throws NoSuchJanaacInspectionException;

	/**
	 * Returns the last janaac inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public JanaacInspection fetchBygetJanaac_Status_Last(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
			orderByComparator);

	/**
	 * Returns the janaac inspections before and after the current janaac inspection in the ordered set where status = &#63;.
	 *
	 * @param janaacInspectionId the primary key of the current janaac inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac inspection
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	public JanaacInspection[] findBygetJanaac_Status_PrevAndNext(
			long janaacInspectionId, String status,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
				orderByComparator)
		throws NoSuchJanaacInspectionException;

	/**
	 * Removes all the janaac inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetJanaac_Status(String status);

	/**
	 * Returns the number of janaac inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching janaac inspections
	 */
	public int countBygetJanaac_Status(String status);

	/**
	 * Returns all the janaac inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching janaac inspections
	 */
	public java.util.List<JanaacInspection> findBygetJanaac_CaseIdStatus(
		String status, String caseId);

	/**
	 * Returns a range of all the janaac inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @return the range of matching janaac inspections
	 */
	public java.util.List<JanaacInspection> findBygetJanaac_CaseIdStatus(
		String status, String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the janaac inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac inspections
	 */
	public java.util.List<JanaacInspection> findBygetJanaac_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the janaac inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac inspections
	 */
	public java.util.List<JanaacInspection> findBygetJanaac_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first janaac inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public JanaacInspection findBygetJanaac_CaseIdStatus_First(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
				orderByComparator)
		throws NoSuchJanaacInspectionException;

	/**
	 * Returns the first janaac inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public JanaacInspection fetchBygetJanaac_CaseIdStatus_First(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
			orderByComparator);

	/**
	 * Returns the last janaac inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public JanaacInspection findBygetJanaac_CaseIdStatus_Last(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
				orderByComparator)
		throws NoSuchJanaacInspectionException;

	/**
	 * Returns the last janaac inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public JanaacInspection fetchBygetJanaac_CaseIdStatus_Last(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
			orderByComparator);

	/**
	 * Returns the janaac inspections before and after the current janaac inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param janaacInspectionId the primary key of the current janaac inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac inspection
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	public JanaacInspection[] findBygetJanaac_CaseIdStatus_PrevAndNext(
			long janaacInspectionId, String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
				orderByComparator)
		throws NoSuchJanaacInspectionException;

	/**
	 * Removes all the janaac inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public void removeBygetJanaac_CaseIdStatus(String status, String caseId);

	/**
	 * Returns the number of janaac inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching janaac inspections
	 */
	public int countBygetJanaac_CaseIdStatus(String status, String caseId);

	/**
	 * Returns all the janaac inspections where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac inspections
	 */
	public java.util.List<JanaacInspection> findBygetJanaac_CaseIdApplicationId(
		String status, long janaacApplicationId);

	/**
	 * Returns a range of all the janaac inspections where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @return the range of matching janaac inspections
	 */
	public java.util.List<JanaacInspection> findBygetJanaac_CaseIdApplicationId(
		String status, long janaacApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the janaac inspections where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac inspections
	 */
	public java.util.List<JanaacInspection> findBygetJanaac_CaseIdApplicationId(
		String status, long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the janaac inspections where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac inspections
	 */
	public java.util.List<JanaacInspection> findBygetJanaac_CaseIdApplicationId(
		String status, long janaacApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first janaac inspection in the ordered set where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public JanaacInspection findBygetJanaac_CaseIdApplicationId_First(
			String status, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
				orderByComparator)
		throws NoSuchJanaacInspectionException;

	/**
	 * Returns the first janaac inspection in the ordered set where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public JanaacInspection fetchBygetJanaac_CaseIdApplicationId_First(
		String status, long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
			orderByComparator);

	/**
	 * Returns the last janaac inspection in the ordered set where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public JanaacInspection findBygetJanaac_CaseIdApplicationId_Last(
			String status, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
				orderByComparator)
		throws NoSuchJanaacInspectionException;

	/**
	 * Returns the last janaac inspection in the ordered set where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public JanaacInspection fetchBygetJanaac_CaseIdApplicationId_Last(
		String status, long janaacApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
			orderByComparator);

	/**
	 * Returns the janaac inspections before and after the current janaac inspection in the ordered set where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param janaacInspectionId the primary key of the current janaac inspection
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac inspection
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	public JanaacInspection[] findBygetJanaac_CaseIdApplicationId_PrevAndNext(
			long janaacInspectionId, String status, long janaacApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
				orderByComparator)
		throws NoSuchJanaacInspectionException;

	/**
	 * Removes all the janaac inspections where status = &#63; and janaacApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 */
	public void removeBygetJanaac_CaseIdApplicationId(
		String status, long janaacApplicationId);

	/**
	 * Returns the number of janaac inspections where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching janaac inspections
	 */
	public int countBygetJanaac_CaseIdApplicationId(
		String status, long janaacApplicationId);

	/**
	 * Returns the janaac inspection where status = &#63; and slotBookedByUser = &#63; and janaacApplicationId = &#63; or throws a <code>NoSuchJanaacInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	public JanaacInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long janaacApplicationId)
		throws NoSuchJanaacInspectionException;

	/**
	 * Returns the janaac inspection where status = &#63; and slotBookedByUser = &#63; and janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public JanaacInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long janaacApplicationId);

	/**
	 * Returns the janaac inspection where status = &#63; and slotBookedByUser = &#63; and janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	public JanaacInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long janaacApplicationId,
			boolean useFinderCache);

	/**
	 * Removes the janaac inspection where status = &#63; and slotBookedByUser = &#63; and janaacApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param janaacApplicationId the janaac application ID
	 * @return the janaac inspection that was removed
	 */
	public JanaacInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long janaacApplicationId)
		throws NoSuchJanaacInspectionException;

	/**
	 * Returns the number of janaac inspections where status = &#63; and slotBookedByUser = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching janaac inspections
	 */
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long janaacApplicationId);

	/**
	 * Caches the janaac inspection in the entity cache if it is enabled.
	 *
	 * @param janaacInspection the janaac inspection
	 */
	public void cacheResult(JanaacInspection janaacInspection);

	/**
	 * Caches the janaac inspections in the entity cache if it is enabled.
	 *
	 * @param janaacInspections the janaac inspections
	 */
	public void cacheResult(java.util.List<JanaacInspection> janaacInspections);

	/**
	 * Creates a new janaac inspection with the primary key. Does not add the janaac inspection to the database.
	 *
	 * @param janaacInspectionId the primary key for the new janaac inspection
	 * @return the new janaac inspection
	 */
	public JanaacInspection create(long janaacInspectionId);

	/**
	 * Removes the janaac inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacInspectionId the primary key of the janaac inspection
	 * @return the janaac inspection that was removed
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	public JanaacInspection remove(long janaacInspectionId)
		throws NoSuchJanaacInspectionException;

	public JanaacInspection updateImpl(JanaacInspection janaacInspection);

	/**
	 * Returns the janaac inspection with the primary key or throws a <code>NoSuchJanaacInspectionException</code> if it could not be found.
	 *
	 * @param janaacInspectionId the primary key of the janaac inspection
	 * @return the janaac inspection
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	public JanaacInspection findByPrimaryKey(long janaacInspectionId)
		throws NoSuchJanaacInspectionException;

	/**
	 * Returns the janaac inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacInspectionId the primary key of the janaac inspection
	 * @return the janaac inspection, or <code>null</code> if a janaac inspection with the primary key could not be found
	 */
	public JanaacInspection fetchByPrimaryKey(long janaacInspectionId);

	/**
	 * Returns all the janaac inspections.
	 *
	 * @return the janaac inspections
	 */
	public java.util.List<JanaacInspection> findAll();

	/**
	 * Returns a range of all the janaac inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @return the range of janaac inspections
	 */
	public java.util.List<JanaacInspection> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the janaac inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac inspections
	 */
	public java.util.List<JanaacInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the janaac inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac inspections
	 */
	public java.util.List<JanaacInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the janaac inspections from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of janaac inspections.
	 *
	 * @return the number of janaac inspections
	 */
	public int countAll();

}