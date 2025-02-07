/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.stages.services.exception.NoSuchOsiInspectionException;
import com.nbp.osi.stages.services.model.OsiInspection;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInspectionUtil
 * @generated
 */
@ProviderType
public interface OsiInspectionPersistence
	extends BasePersistence<OsiInspection> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiInspectionUtil} to access the osi inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi inspection where caseId = &#63; or throws a <code>NoSuchOsiInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public OsiInspection findBygetOsiInspectionBy_CI(String caseId)
		throws NoSuchOsiInspectionException;

	/**
	 * Returns the osi inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public OsiInspection fetchBygetOsiInspectionBy_CI(String caseId);

	/**
	 * Returns the osi inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public OsiInspection fetchBygetOsiInspectionBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the osi inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi inspection that was removed
	 */
	public OsiInspection removeBygetOsiInspectionBy_CI(String caseId)
		throws NoSuchOsiInspectionException;

	/**
	 * Returns the number of osi inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi inspections
	 */
	public int countBygetOsiInspectionBy_CI(String caseId);

	/**
	 * Returns all the osi inspections where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi inspections
	 */
	public java.util.List<OsiInspection> findBygetOSI_OAI(
		long osiApplicationId);

	/**
	 * Returns a range of all the osi inspections where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @return the range of matching osi inspections
	 */
	public java.util.List<OsiInspection> findBygetOSI_OAI(
		long osiApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the osi inspections where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi inspections
	 */
	public java.util.List<OsiInspection> findBygetOSI_OAI(
		long osiApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi inspections where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi inspections
	 */
	public java.util.List<OsiInspection> findBygetOSI_OAI(
		long osiApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi inspection in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public OsiInspection findBygetOSI_OAI_First(
			long osiApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
				orderByComparator)
		throws NoSuchOsiInspectionException;

	/**
	 * Returns the first osi inspection in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public OsiInspection fetchBygetOSI_OAI_First(
		long osiApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
			orderByComparator);

	/**
	 * Returns the last osi inspection in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public OsiInspection findBygetOSI_OAI_Last(
			long osiApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
				orderByComparator)
		throws NoSuchOsiInspectionException;

	/**
	 * Returns the last osi inspection in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public OsiInspection fetchBygetOSI_OAI_Last(
		long osiApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
			orderByComparator);

	/**
	 * Returns the osi inspections before and after the current osi inspection in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiInspectionId the primary key of the current osi inspection
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi inspection
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	public OsiInspection[] findBygetOSI_OAI_PrevAndNext(
			long osiInspectionId, long osiApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
				orderByComparator)
		throws NoSuchOsiInspectionException;

	/**
	 * Removes all the osi inspections where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 */
	public void removeBygetOSI_OAI(long osiApplicationId);

	/**
	 * Returns the number of osi inspections where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching osi inspections
	 */
	public int countBygetOSI_OAI(long osiApplicationId);

	/**
	 * Returns all the osi inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching osi inspections
	 */
	public java.util.List<OsiInspection> findBygetOSI_CaseId(String caseId);

	/**
	 * Returns a range of all the osi inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @return the range of matching osi inspections
	 */
	public java.util.List<OsiInspection> findBygetOSI_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the osi inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi inspections
	 */
	public java.util.List<OsiInspection> findBygetOSI_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi inspections
	 */
	public java.util.List<OsiInspection> findBygetOSI_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public OsiInspection findBygetOSI_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
				orderByComparator)
		throws NoSuchOsiInspectionException;

	/**
	 * Returns the first osi inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public OsiInspection fetchBygetOSI_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
			orderByComparator);

	/**
	 * Returns the last osi inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public OsiInspection findBygetOSI_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
				orderByComparator)
		throws NoSuchOsiInspectionException;

	/**
	 * Returns the last osi inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public OsiInspection fetchBygetOSI_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
			orderByComparator);

	/**
	 * Returns the osi inspections before and after the current osi inspection in the ordered set where caseId = &#63;.
	 *
	 * @param osiInspectionId the primary key of the current osi inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi inspection
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	public OsiInspection[] findBygetOSI_CaseId_PrevAndNext(
			long osiInspectionId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
				orderByComparator)
		throws NoSuchOsiInspectionException;

	/**
	 * Removes all the osi inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetOSI_CaseId(String caseId);

	/**
	 * Returns the number of osi inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi inspections
	 */
	public int countBygetOSI_CaseId(String caseId);

	/**
	 * Returns all the osi inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching osi inspections
	 */
	public java.util.List<OsiInspection> findBygetMI_Status(String status);

	/**
	 * Returns a range of all the osi inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @return the range of matching osi inspections
	 */
	public java.util.List<OsiInspection> findBygetMI_Status(
		String status, int start, int end);

	/**
	 * Returns an ordered range of all the osi inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi inspections
	 */
	public java.util.List<OsiInspection> findBygetMI_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi inspections
	 */
	public java.util.List<OsiInspection> findBygetMI_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public OsiInspection findBygetMI_Status_First(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
				orderByComparator)
		throws NoSuchOsiInspectionException;

	/**
	 * Returns the first osi inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public OsiInspection fetchBygetMI_Status_First(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
			orderByComparator);

	/**
	 * Returns the last osi inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public OsiInspection findBygetMI_Status_Last(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
				orderByComparator)
		throws NoSuchOsiInspectionException;

	/**
	 * Returns the last osi inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public OsiInspection fetchBygetMI_Status_Last(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
			orderByComparator);

	/**
	 * Returns the osi inspections before and after the current osi inspection in the ordered set where status = &#63;.
	 *
	 * @param osiInspectionId the primary key of the current osi inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi inspection
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	public OsiInspection[] findBygetMI_Status_PrevAndNext(
			long osiInspectionId, String status,
			com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
				orderByComparator)
		throws NoSuchOsiInspectionException;

	/**
	 * Removes all the osi inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetMI_Status(String status);

	/**
	 * Returns the number of osi inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching osi inspections
	 */
	public int countBygetMI_Status(String status);

	/**
	 * Returns all the osi inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching osi inspections
	 */
	public java.util.List<OsiInspection> findBygetOSI_CaseIdStatus(
		String status, String caseId);

	/**
	 * Returns a range of all the osi inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @return the range of matching osi inspections
	 */
	public java.util.List<OsiInspection> findBygetOSI_CaseIdStatus(
		String status, String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the osi inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi inspections
	 */
	public java.util.List<OsiInspection> findBygetOSI_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi inspections
	 */
	public java.util.List<OsiInspection> findBygetOSI_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public OsiInspection findBygetOSI_CaseIdStatus_First(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
				orderByComparator)
		throws NoSuchOsiInspectionException;

	/**
	 * Returns the first osi inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public OsiInspection fetchBygetOSI_CaseIdStatus_First(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
			orderByComparator);

	/**
	 * Returns the last osi inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public OsiInspection findBygetOSI_CaseIdStatus_Last(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
				orderByComparator)
		throws NoSuchOsiInspectionException;

	/**
	 * Returns the last osi inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public OsiInspection fetchBygetOSI_CaseIdStatus_Last(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
			orderByComparator);

	/**
	 * Returns the osi inspections before and after the current osi inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param osiInspectionId the primary key of the current osi inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi inspection
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	public OsiInspection[] findBygetOSI_CaseIdStatus_PrevAndNext(
			long osiInspectionId, String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
				orderByComparator)
		throws NoSuchOsiInspectionException;

	/**
	 * Removes all the osi inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public void removeBygetOSI_CaseIdStatus(String status, String caseId);

	/**
	 * Returns the number of osi inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching osi inspections
	 */
	public int countBygetOSI_CaseIdStatus(String status, String caseId);

	/**
	 * Returns all the osi inspections where status = &#63; and osiApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi inspections
	 */
	public java.util.List<OsiInspection> findBygetOSI_CaseIdApplicationId(
		String status, long osiApplicationId);

	/**
	 * Returns a range of all the osi inspections where status = &#63; and osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @return the range of matching osi inspections
	 */
	public java.util.List<OsiInspection> findBygetOSI_CaseIdApplicationId(
		String status, long osiApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the osi inspections where status = &#63; and osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi inspections
	 */
	public java.util.List<OsiInspection> findBygetOSI_CaseIdApplicationId(
		String status, long osiApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi inspections where status = &#63; and osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi inspections
	 */
	public java.util.List<OsiInspection> findBygetOSI_CaseIdApplicationId(
		String status, long osiApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi inspection in the ordered set where status = &#63; and osiApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public OsiInspection findBygetOSI_CaseIdApplicationId_First(
			String status, long osiApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
				orderByComparator)
		throws NoSuchOsiInspectionException;

	/**
	 * Returns the first osi inspection in the ordered set where status = &#63; and osiApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public OsiInspection fetchBygetOSI_CaseIdApplicationId_First(
		String status, long osiApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
			orderByComparator);

	/**
	 * Returns the last osi inspection in the ordered set where status = &#63; and osiApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public OsiInspection findBygetOSI_CaseIdApplicationId_Last(
			String status, long osiApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
				orderByComparator)
		throws NoSuchOsiInspectionException;

	/**
	 * Returns the last osi inspection in the ordered set where status = &#63; and osiApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public OsiInspection fetchBygetOSI_CaseIdApplicationId_Last(
		String status, long osiApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
			orderByComparator);

	/**
	 * Returns the osi inspections before and after the current osi inspection in the ordered set where status = &#63; and osiApplicationId = &#63;.
	 *
	 * @param osiInspectionId the primary key of the current osi inspection
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi inspection
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	public OsiInspection[] findBygetOSI_CaseIdApplicationId_PrevAndNext(
			long osiInspectionId, String status, long osiApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
				orderByComparator)
		throws NoSuchOsiInspectionException;

	/**
	 * Removes all the osi inspections where status = &#63; and osiApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 */
	public void removeBygetOSI_CaseIdApplicationId(
		String status, long osiApplicationId);

	/**
	 * Returns the number of osi inspections where status = &#63; and osiApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching osi inspections
	 */
	public int countBygetOSI_CaseIdApplicationId(
		String status, long osiApplicationId);

	/**
	 * Returns the osi inspection where status = &#63; and slotBookedByUser = &#63; and osiApplicationId = &#63; or throws a <code>NoSuchOsiInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public OsiInspection findBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long osiApplicationId)
		throws NoSuchOsiInspectionException;

	/**
	 * Returns the osi inspection where status = &#63; and slotBookedByUser = &#63; and osiApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public OsiInspection fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long osiApplicationId);

	/**
	 * Returns the osi inspection where status = &#63; and slotBookedByUser = &#63; and osiApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param osiApplicationId the osi application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public OsiInspection fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long osiApplicationId,
		boolean useFinderCache);

	/**
	 * Removes the osi inspection where status = &#63; and slotBookedByUser = &#63; and osiApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param osiApplicationId the osi application ID
	 * @return the osi inspection that was removed
	 */
	public OsiInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long osiApplicationId)
		throws NoSuchOsiInspectionException;

	/**
	 * Returns the number of osi inspections where status = &#63; and slotBookedByUser = &#63; and osiApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching osi inspections
	 */
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long osiApplicationId);

	/**
	 * Caches the osi inspection in the entity cache if it is enabled.
	 *
	 * @param osiInspection the osi inspection
	 */
	public void cacheResult(OsiInspection osiInspection);

	/**
	 * Caches the osi inspections in the entity cache if it is enabled.
	 *
	 * @param osiInspections the osi inspections
	 */
	public void cacheResult(java.util.List<OsiInspection> osiInspections);

	/**
	 * Creates a new osi inspection with the primary key. Does not add the osi inspection to the database.
	 *
	 * @param osiInspectionId the primary key for the new osi inspection
	 * @return the new osi inspection
	 */
	public OsiInspection create(long osiInspectionId);

	/**
	 * Removes the osi inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInspectionId the primary key of the osi inspection
	 * @return the osi inspection that was removed
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	public OsiInspection remove(long osiInspectionId)
		throws NoSuchOsiInspectionException;

	public OsiInspection updateImpl(OsiInspection osiInspection);

	/**
	 * Returns the osi inspection with the primary key or throws a <code>NoSuchOsiInspectionException</code> if it could not be found.
	 *
	 * @param osiInspectionId the primary key of the osi inspection
	 * @return the osi inspection
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	public OsiInspection findByPrimaryKey(long osiInspectionId)
		throws NoSuchOsiInspectionException;

	/**
	 * Returns the osi inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInspectionId the primary key of the osi inspection
	 * @return the osi inspection, or <code>null</code> if a osi inspection with the primary key could not be found
	 */
	public OsiInspection fetchByPrimaryKey(long osiInspectionId);

	/**
	 * Returns all the osi inspections.
	 *
	 * @return the osi inspections
	 */
	public java.util.List<OsiInspection> findAll();

	/**
	 * Returns a range of all the osi inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @return the range of osi inspections
	 */
	public java.util.List<OsiInspection> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the osi inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi inspections
	 */
	public java.util.List<OsiInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi inspections
	 */
	public java.util.List<OsiInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi inspections from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi inspections.
	 *
	 * @return the number of osi inspections
	 */
	public int countAll();

}