/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.stage.services.exception.NoSuchJtbInspectionException;
import com.nbp.jtb.application.stage.services.model.JtbInspection;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jtb inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbInspectionUtil
 * @generated
 */
@ProviderType
public interface JtbInspectionPersistence
	extends BasePersistence<JtbInspection> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JtbInspectionUtil} to access the jtb inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the jtb inspection where caseId = &#63; or throws a <code>NoSuchJtbInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public JtbInspection findBygetJtbyInspecBy_CI(String caseId)
		throws NoSuchJtbInspectionException;

	/**
	 * Returns the jtb inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public JtbInspection fetchBygetJtbyInspecBy_CI(String caseId);

	/**
	 * Returns the jtb inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public JtbInspection fetchBygetJtbyInspecBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the jtb inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jtb inspection that was removed
	 */
	public JtbInspection removeBygetJtbyInspecBy_CI(String caseId)
		throws NoSuchJtbInspectionException;

	/**
	 * Returns the number of jtb inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb inspections
	 */
	public int countBygetJtbyInspecBy_CI(String caseId);

	/**
	 * Returns all the jtb inspections where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb inspections
	 */
	public java.util.List<JtbInspection> findBygetJtb_FBAI(
		long jtbApplicationId);

	/**
	 * Returns a range of all the jtb inspections where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @return the range of matching jtb inspections
	 */
	public java.util.List<JtbInspection> findBygetJtb_FBAI(
		long jtbApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the jtb inspections where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb inspections
	 */
	public java.util.List<JtbInspection> findBygetJtb_FBAI(
		long jtbApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb inspections where jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb inspections
	 */
	public java.util.List<JtbInspection> findBygetJtb_FBAI(
		long jtbApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb inspection in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public JtbInspection findBygetJtb_FBAI_First(
			long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
				orderByComparator)
		throws NoSuchJtbInspectionException;

	/**
	 * Returns the first jtb inspection in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public JtbInspection fetchBygetJtb_FBAI_First(
		long jtbApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
			orderByComparator);

	/**
	 * Returns the last jtb inspection in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public JtbInspection findBygetJtb_FBAI_Last(
			long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
				orderByComparator)
		throws NoSuchJtbInspectionException;

	/**
	 * Returns the last jtb inspection in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public JtbInspection fetchBygetJtb_FBAI_Last(
		long jtbApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
			orderByComparator);

	/**
	 * Returns the jtb inspections before and after the current jtb inspection in the ordered set where jtbApplicationId = &#63;.
	 *
	 * @param jtbInspectionId the primary key of the current jtb inspection
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb inspection
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	public JtbInspection[] findBygetJtb_FBAI_PrevAndNext(
			long jtbInspectionId, long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
				orderByComparator)
		throws NoSuchJtbInspectionException;

	/**
	 * Removes all the jtb inspections where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 */
	public void removeBygetJtb_FBAI(long jtbApplicationId);

	/**
	 * Returns the number of jtb inspections where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb inspections
	 */
	public int countBygetJtb_FBAI(long jtbApplicationId);

	/**
	 * Returns all the jtb inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb inspections
	 */
	public java.util.List<JtbInspection> findBygetJtb_CaseId(String caseId);

	/**
	 * Returns a range of all the jtb inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @return the range of matching jtb inspections
	 */
	public java.util.List<JtbInspection> findBygetJtb_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the jtb inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb inspections
	 */
	public java.util.List<JtbInspection> findBygetJtb_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb inspections
	 */
	public java.util.List<JtbInspection> findBygetJtb_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public JtbInspection findBygetJtb_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
				orderByComparator)
		throws NoSuchJtbInspectionException;

	/**
	 * Returns the first jtb inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public JtbInspection fetchBygetJtb_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
			orderByComparator);

	/**
	 * Returns the last jtb inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public JtbInspection findBygetJtb_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
				orderByComparator)
		throws NoSuchJtbInspectionException;

	/**
	 * Returns the last jtb inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public JtbInspection fetchBygetJtb_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
			orderByComparator);

	/**
	 * Returns the jtb inspections before and after the current jtb inspection in the ordered set where caseId = &#63;.
	 *
	 * @param jtbInspectionId the primary key of the current jtb inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb inspection
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	public JtbInspection[] findBygetJtb_CaseId_PrevAndNext(
			long jtbInspectionId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
				orderByComparator)
		throws NoSuchJtbInspectionException;

	/**
	 * Removes all the jtb inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetJtb_CaseId(String caseId);

	/**
	 * Returns the number of jtb inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb inspections
	 */
	public int countBygetJtb_CaseId(String caseId);

	/**
	 * Returns all the jtb inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching jtb inspections
	 */
	public java.util.List<JtbInspection> findBygetJtb_Status(String status);

	/**
	 * Returns a range of all the jtb inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @return the range of matching jtb inspections
	 */
	public java.util.List<JtbInspection> findBygetJtb_Status(
		String status, int start, int end);

	/**
	 * Returns an ordered range of all the jtb inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb inspections
	 */
	public java.util.List<JtbInspection> findBygetJtb_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb inspections
	 */
	public java.util.List<JtbInspection> findBygetJtb_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public JtbInspection findBygetJtb_Status_First(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
				orderByComparator)
		throws NoSuchJtbInspectionException;

	/**
	 * Returns the first jtb inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public JtbInspection fetchBygetJtb_Status_First(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
			orderByComparator);

	/**
	 * Returns the last jtb inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public JtbInspection findBygetJtb_Status_Last(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
				orderByComparator)
		throws NoSuchJtbInspectionException;

	/**
	 * Returns the last jtb inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public JtbInspection fetchBygetJtb_Status_Last(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
			orderByComparator);

	/**
	 * Returns the jtb inspections before and after the current jtb inspection in the ordered set where status = &#63;.
	 *
	 * @param jtbInspectionId the primary key of the current jtb inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb inspection
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	public JtbInspection[] findBygetJtb_Status_PrevAndNext(
			long jtbInspectionId, String status,
			com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
				orderByComparator)
		throws NoSuchJtbInspectionException;

	/**
	 * Removes all the jtb inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetJtb_Status(String status);

	/**
	 * Returns the number of jtb inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching jtb inspections
	 */
	public int countBygetJtb_Status(String status);

	/**
	 * Returns all the jtb inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching jtb inspections
	 */
	public java.util.List<JtbInspection> findBygetJtb_CaseIdStatus(
		String status, String caseId);

	/**
	 * Returns a range of all the jtb inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @return the range of matching jtb inspections
	 */
	public java.util.List<JtbInspection> findBygetJtb_CaseIdStatus(
		String status, String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the jtb inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb inspections
	 */
	public java.util.List<JtbInspection> findBygetJtb_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb inspections
	 */
	public java.util.List<JtbInspection> findBygetJtb_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public JtbInspection findBygetJtb_CaseIdStatus_First(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
				orderByComparator)
		throws NoSuchJtbInspectionException;

	/**
	 * Returns the first jtb inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public JtbInspection fetchBygetJtb_CaseIdStatus_First(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
			orderByComparator);

	/**
	 * Returns the last jtb inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public JtbInspection findBygetJtb_CaseIdStatus_Last(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
				orderByComparator)
		throws NoSuchJtbInspectionException;

	/**
	 * Returns the last jtb inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public JtbInspection fetchBygetJtb_CaseIdStatus_Last(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
			orderByComparator);

	/**
	 * Returns the jtb inspections before and after the current jtb inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param jtbInspectionId the primary key of the current jtb inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb inspection
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	public JtbInspection[] findBygetJtb_CaseIdStatus_PrevAndNext(
			long jtbInspectionId, String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
				orderByComparator)
		throws NoSuchJtbInspectionException;

	/**
	 * Removes all the jtb inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public void removeBygetJtb_CaseIdStatus(String status, String caseId);

	/**
	 * Returns the number of jtb inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching jtb inspections
	 */
	public int countBygetJtb_CaseIdStatus(String status, String caseId);

	/**
	 * Returns all the jtb inspections where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb inspections
	 */
	public java.util.List<JtbInspection> findBygetJtb_CIAppId(
		String status, long jtbApplicationId);

	/**
	 * Returns a range of all the jtb inspections where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @return the range of matching jtb inspections
	 */
	public java.util.List<JtbInspection> findBygetJtb_CIAppId(
		String status, long jtbApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the jtb inspections where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb inspections
	 */
	public java.util.List<JtbInspection> findBygetJtb_CIAppId(
		String status, long jtbApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb inspections where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb inspections
	 */
	public java.util.List<JtbInspection> findBygetJtb_CIAppId(
		String status, long jtbApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb inspection in the ordered set where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public JtbInspection findBygetJtb_CIAppId_First(
			String status, long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
				orderByComparator)
		throws NoSuchJtbInspectionException;

	/**
	 * Returns the first jtb inspection in the ordered set where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public JtbInspection fetchBygetJtb_CIAppId_First(
		String status, long jtbApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
			orderByComparator);

	/**
	 * Returns the last jtb inspection in the ordered set where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public JtbInspection findBygetJtb_CIAppId_Last(
			String status, long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
				orderByComparator)
		throws NoSuchJtbInspectionException;

	/**
	 * Returns the last jtb inspection in the ordered set where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public JtbInspection fetchBygetJtb_CIAppId_Last(
		String status, long jtbApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
			orderByComparator);

	/**
	 * Returns the jtb inspections before and after the current jtb inspection in the ordered set where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param jtbInspectionId the primary key of the current jtb inspection
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb inspection
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	public JtbInspection[] findBygetJtb_CIAppId_PrevAndNext(
			long jtbInspectionId, String status, long jtbApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
				orderByComparator)
		throws NoSuchJtbInspectionException;

	/**
	 * Removes all the jtb inspections where status = &#63; and jtbApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 */
	public void removeBygetJtb_CIAppId(String status, long jtbApplicationId);

	/**
	 * Returns the number of jtb inspections where status = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb inspections
	 */
	public int countBygetJtb_CIAppId(String status, long jtbApplicationId);

	/**
	 * Returns the jtb inspection where status = &#63; and slotBookedByUser = &#63; and jtbApplicationId = &#63; or throws a <code>NoSuchJtbInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb inspection
	 * @throws NoSuchJtbInspectionException if a matching jtb inspection could not be found
	 */
	public JtbInspection findBygetJtbByStatus_Slot_AppId(
			String status, long slotBookedByUser, long jtbApplicationId)
		throws NoSuchJtbInspectionException;

	/**
	 * Returns the jtb inspection where status = &#63; and slotBookedByUser = &#63; and jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public JtbInspection fetchBygetJtbByStatus_Slot_AppId(
		String status, long slotBookedByUser, long jtbApplicationId);

	/**
	 * Returns the jtb inspection where status = &#63; and slotBookedByUser = &#63; and jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb inspection, or <code>null</code> if a matching jtb inspection could not be found
	 */
	public JtbInspection fetchBygetJtbByStatus_Slot_AppId(
		String status, long slotBookedByUser, long jtbApplicationId,
		boolean useFinderCache);

	/**
	 * Removes the jtb inspection where status = &#63; and slotBookedByUser = &#63; and jtbApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param jtbApplicationId the jtb application ID
	 * @return the jtb inspection that was removed
	 */
	public JtbInspection removeBygetJtbByStatus_Slot_AppId(
			String status, long slotBookedByUser, long jtbApplicationId)
		throws NoSuchJtbInspectionException;

	/**
	 * Returns the number of jtb inspections where status = &#63; and slotBookedByUser = &#63; and jtbApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb inspections
	 */
	public int countBygetJtbByStatus_Slot_AppId(
		String status, long slotBookedByUser, long jtbApplicationId);

	/**
	 * Caches the jtb inspection in the entity cache if it is enabled.
	 *
	 * @param jtbInspection the jtb inspection
	 */
	public void cacheResult(JtbInspection jtbInspection);

	/**
	 * Caches the jtb inspections in the entity cache if it is enabled.
	 *
	 * @param jtbInspections the jtb inspections
	 */
	public void cacheResult(java.util.List<JtbInspection> jtbInspections);

	/**
	 * Creates a new jtb inspection with the primary key. Does not add the jtb inspection to the database.
	 *
	 * @param jtbInspectionId the primary key for the new jtb inspection
	 * @return the new jtb inspection
	 */
	public JtbInspection create(long jtbInspectionId);

	/**
	 * Removes the jtb inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbInspectionId the primary key of the jtb inspection
	 * @return the jtb inspection that was removed
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	public JtbInspection remove(long jtbInspectionId)
		throws NoSuchJtbInspectionException;

	public JtbInspection updateImpl(JtbInspection jtbInspection);

	/**
	 * Returns the jtb inspection with the primary key or throws a <code>NoSuchJtbInspectionException</code> if it could not be found.
	 *
	 * @param jtbInspectionId the primary key of the jtb inspection
	 * @return the jtb inspection
	 * @throws NoSuchJtbInspectionException if a jtb inspection with the primary key could not be found
	 */
	public JtbInspection findByPrimaryKey(long jtbInspectionId)
		throws NoSuchJtbInspectionException;

	/**
	 * Returns the jtb inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbInspectionId the primary key of the jtb inspection
	 * @return the jtb inspection, or <code>null</code> if a jtb inspection with the primary key could not be found
	 */
	public JtbInspection fetchByPrimaryKey(long jtbInspectionId);

	/**
	 * Returns all the jtb inspections.
	 *
	 * @return the jtb inspections
	 */
	public java.util.List<JtbInspection> findAll();

	/**
	 * Returns a range of all the jtb inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @return the range of jtb inspections
	 */
	public java.util.List<JtbInspection> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jtb inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb inspections
	 */
	public java.util.List<JtbInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb inspections
	 */
	public java.util.List<JtbInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jtb inspections from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jtb inspections.
	 *
	 * @return the number of jtb inspections
	 */
	public int countAll();

}