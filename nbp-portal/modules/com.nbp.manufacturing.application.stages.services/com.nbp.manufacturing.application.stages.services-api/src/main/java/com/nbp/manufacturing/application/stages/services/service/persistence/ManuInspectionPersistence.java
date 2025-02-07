/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.manufacturing.application.stages.services.exception.NoSuchManuInspectionException;
import com.nbp.manufacturing.application.stages.services.model.ManuInspection;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the manu inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuInspectionUtil
 * @generated
 */
@ProviderType
public interface ManuInspectionPersistence
	extends BasePersistence<ManuInspection> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ManuInspectionUtil} to access the manu inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the manu inspection where caseId = &#63; or throws a <code>NoSuchManuInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public ManuInspection findBygetManuInspectionBy_CI(String caseId)
		throws NoSuchManuInspectionException;

	/**
	 * Returns the manu inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public ManuInspection fetchBygetManuInspectionBy_CI(String caseId);

	/**
	 * Returns the manu inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public ManuInspection fetchBygetManuInspectionBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the manu inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the manu inspection that was removed
	 */
	public ManuInspection removeBygetManuInspectionBy_CI(String caseId)
		throws NoSuchManuInspectionException;

	/**
	 * Returns the number of manu inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching manu inspections
	 */
	public int countBygetManuInspectionBy_CI(String caseId);

	/**
	 * Returns all the manu inspections where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu inspections
	 */
	public java.util.List<ManuInspection> findBygetMI_MAI(
		long manufacturingApplicationId);

	/**
	 * Returns a range of all the manu inspections where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @return the range of matching manu inspections
	 */
	public java.util.List<ManuInspection> findBygetMI_MAI(
		long manufacturingApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the manu inspections where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu inspections
	 */
	public java.util.List<ManuInspection> findBygetMI_MAI(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the manu inspections where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu inspections
	 */
	public java.util.List<ManuInspection> findBygetMI_MAI(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first manu inspection in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public ManuInspection findBygetMI_MAI_First(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
				orderByComparator)
		throws NoSuchManuInspectionException;

	/**
	 * Returns the first manu inspection in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public ManuInspection fetchBygetMI_MAI_First(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
			orderByComparator);

	/**
	 * Returns the last manu inspection in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public ManuInspection findBygetMI_MAI_Last(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
				orderByComparator)
		throws NoSuchManuInspectionException;

	/**
	 * Returns the last manu inspection in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public ManuInspection fetchBygetMI_MAI_Last(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
			orderByComparator);

	/**
	 * Returns the manu inspections before and after the current manu inspection in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuInspectionId the primary key of the current manu inspection
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu inspection
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	public ManuInspection[] findBygetMI_MAI_PrevAndNext(
			long manuInspectionId, long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
				orderByComparator)
		throws NoSuchManuInspectionException;

	/**
	 * Removes all the manu inspections where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public void removeBygetMI_MAI(long manufacturingApplicationId);

	/**
	 * Returns the number of manu inspections where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu inspections
	 */
	public int countBygetMI_MAI(long manufacturingApplicationId);

	/**
	 * Returns all the manu inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching manu inspections
	 */
	public java.util.List<ManuInspection> findBygetMI_CaseId(String caseId);

	/**
	 * Returns a range of all the manu inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @return the range of matching manu inspections
	 */
	public java.util.List<ManuInspection> findBygetMI_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the manu inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu inspections
	 */
	public java.util.List<ManuInspection> findBygetMI_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the manu inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu inspections
	 */
	public java.util.List<ManuInspection> findBygetMI_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first manu inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public ManuInspection findBygetMI_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
				orderByComparator)
		throws NoSuchManuInspectionException;

	/**
	 * Returns the first manu inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public ManuInspection fetchBygetMI_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
			orderByComparator);

	/**
	 * Returns the last manu inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public ManuInspection findBygetMI_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
				orderByComparator)
		throws NoSuchManuInspectionException;

	/**
	 * Returns the last manu inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public ManuInspection fetchBygetMI_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
			orderByComparator);

	/**
	 * Returns the manu inspections before and after the current manu inspection in the ordered set where caseId = &#63;.
	 *
	 * @param manuInspectionId the primary key of the current manu inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu inspection
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	public ManuInspection[] findBygetMI_CaseId_PrevAndNext(
			long manuInspectionId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
				orderByComparator)
		throws NoSuchManuInspectionException;

	/**
	 * Removes all the manu inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetMI_CaseId(String caseId);

	/**
	 * Returns the number of manu inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching manu inspections
	 */
	public int countBygetMI_CaseId(String caseId);

	/**
	 * Returns all the manu inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching manu inspections
	 */
	public java.util.List<ManuInspection> findBygetMI_Status(String status);

	/**
	 * Returns a range of all the manu inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @return the range of matching manu inspections
	 */
	public java.util.List<ManuInspection> findBygetMI_Status(
		String status, int start, int end);

	/**
	 * Returns an ordered range of all the manu inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu inspections
	 */
	public java.util.List<ManuInspection> findBygetMI_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the manu inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu inspections
	 */
	public java.util.List<ManuInspection> findBygetMI_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first manu inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public ManuInspection findBygetMI_Status_First(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
				orderByComparator)
		throws NoSuchManuInspectionException;

	/**
	 * Returns the first manu inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public ManuInspection fetchBygetMI_Status_First(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
			orderByComparator);

	/**
	 * Returns the last manu inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public ManuInspection findBygetMI_Status_Last(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
				orderByComparator)
		throws NoSuchManuInspectionException;

	/**
	 * Returns the last manu inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public ManuInspection fetchBygetMI_Status_Last(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
			orderByComparator);

	/**
	 * Returns the manu inspections before and after the current manu inspection in the ordered set where status = &#63;.
	 *
	 * @param manuInspectionId the primary key of the current manu inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu inspection
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	public ManuInspection[] findBygetMI_Status_PrevAndNext(
			long manuInspectionId, String status,
			com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
				orderByComparator)
		throws NoSuchManuInspectionException;

	/**
	 * Removes all the manu inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetMI_Status(String status);

	/**
	 * Returns the number of manu inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching manu inspections
	 */
	public int countBygetMI_Status(String status);

	/**
	 * Returns all the manu inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching manu inspections
	 */
	public java.util.List<ManuInspection> findBygetMI_CaseIdStatus(
		String status, String caseId);

	/**
	 * Returns a range of all the manu inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @return the range of matching manu inspections
	 */
	public java.util.List<ManuInspection> findBygetMI_CaseIdStatus(
		String status, String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the manu inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu inspections
	 */
	public java.util.List<ManuInspection> findBygetMI_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the manu inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu inspections
	 */
	public java.util.List<ManuInspection> findBygetMI_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first manu inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public ManuInspection findBygetMI_CaseIdStatus_First(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
				orderByComparator)
		throws NoSuchManuInspectionException;

	/**
	 * Returns the first manu inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public ManuInspection fetchBygetMI_CaseIdStatus_First(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
			orderByComparator);

	/**
	 * Returns the last manu inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public ManuInspection findBygetMI_CaseIdStatus_Last(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
				orderByComparator)
		throws NoSuchManuInspectionException;

	/**
	 * Returns the last manu inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public ManuInspection fetchBygetMI_CaseIdStatus_Last(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
			orderByComparator);

	/**
	 * Returns the manu inspections before and after the current manu inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param manuInspectionId the primary key of the current manu inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu inspection
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	public ManuInspection[] findBygetMI_CaseIdStatus_PrevAndNext(
			long manuInspectionId, String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
				orderByComparator)
		throws NoSuchManuInspectionException;

	/**
	 * Removes all the manu inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public void removeBygetMI_CaseIdStatus(String status, String caseId);

	/**
	 * Returns the number of manu inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching manu inspections
	 */
	public int countBygetMI_CaseIdStatus(String status, String caseId);

	/**
	 * Returns all the manu inspections where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu inspections
	 */
	public java.util.List<ManuInspection> findBygetMI_CaseIdApplicationId(
		String status, long manufacturingApplicationId);

	/**
	 * Returns a range of all the manu inspections where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @return the range of matching manu inspections
	 */
	public java.util.List<ManuInspection> findBygetMI_CaseIdApplicationId(
		String status, long manufacturingApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the manu inspections where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu inspections
	 */
	public java.util.List<ManuInspection> findBygetMI_CaseIdApplicationId(
		String status, long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the manu inspections where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu inspections
	 */
	public java.util.List<ManuInspection> findBygetMI_CaseIdApplicationId(
		String status, long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first manu inspection in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public ManuInspection findBygetMI_CaseIdApplicationId_First(
			String status, long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
				orderByComparator)
		throws NoSuchManuInspectionException;

	/**
	 * Returns the first manu inspection in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public ManuInspection fetchBygetMI_CaseIdApplicationId_First(
		String status, long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
			orderByComparator);

	/**
	 * Returns the last manu inspection in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public ManuInspection findBygetMI_CaseIdApplicationId_Last(
			String status, long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
				orderByComparator)
		throws NoSuchManuInspectionException;

	/**
	 * Returns the last manu inspection in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public ManuInspection fetchBygetMI_CaseIdApplicationId_Last(
		String status, long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
			orderByComparator);

	/**
	 * Returns the manu inspections before and after the current manu inspection in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param manuInspectionId the primary key of the current manu inspection
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu inspection
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	public ManuInspection[] findBygetMI_CaseIdApplicationId_PrevAndNext(
			long manuInspectionId, String status,
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
				orderByComparator)
		throws NoSuchManuInspectionException;

	/**
	 * Removes all the manu inspections where status = &#63; and manufacturingApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public void removeBygetMI_CaseIdApplicationId(
		String status, long manufacturingApplicationId);

	/**
	 * Returns the number of manu inspections where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu inspections
	 */
	public int countBygetMI_CaseIdApplicationId(
		String status, long manufacturingApplicationId);

	/**
	 * Returns the manu inspection where status = &#63; and slotBookedByUser = &#63; and manufacturingApplicationId = &#63; or throws a <code>NoSuchManuInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public ManuInspection findBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser,
			long manufacturingApplicationId)
		throws NoSuchManuInspectionException;

	/**
	 * Returns the manu inspection where status = &#63; and slotBookedByUser = &#63; and manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public ManuInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser,
			long manufacturingApplicationId);

	/**
	 * Returns the manu inspection where status = &#63; and slotBookedByUser = &#63; and manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public ManuInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser,
			long manufacturingApplicationId, boolean useFinderCache);

	/**
	 * Removes the manu inspection where status = &#63; and slotBookedByUser = &#63; and manufacturingApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu inspection that was removed
	 */
	public ManuInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long manufacturingApplicationId)
		throws NoSuchManuInspectionException;

	/**
	 * Returns the number of manu inspections where status = &#63; and slotBookedByUser = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu inspections
	 */
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long manufacturingApplicationId);

	/**
	 * Caches the manu inspection in the entity cache if it is enabled.
	 *
	 * @param manuInspection the manu inspection
	 */
	public void cacheResult(ManuInspection manuInspection);

	/**
	 * Caches the manu inspections in the entity cache if it is enabled.
	 *
	 * @param manuInspections the manu inspections
	 */
	public void cacheResult(java.util.List<ManuInspection> manuInspections);

	/**
	 * Creates a new manu inspection with the primary key. Does not add the manu inspection to the database.
	 *
	 * @param manuInspectionId the primary key for the new manu inspection
	 * @return the new manu inspection
	 */
	public ManuInspection create(long manuInspectionId);

	/**
	 * Removes the manu inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuInspectionId the primary key of the manu inspection
	 * @return the manu inspection that was removed
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	public ManuInspection remove(long manuInspectionId)
		throws NoSuchManuInspectionException;

	public ManuInspection updateImpl(ManuInspection manuInspection);

	/**
	 * Returns the manu inspection with the primary key or throws a <code>NoSuchManuInspectionException</code> if it could not be found.
	 *
	 * @param manuInspectionId the primary key of the manu inspection
	 * @return the manu inspection
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	public ManuInspection findByPrimaryKey(long manuInspectionId)
		throws NoSuchManuInspectionException;

	/**
	 * Returns the manu inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuInspectionId the primary key of the manu inspection
	 * @return the manu inspection, or <code>null</code> if a manu inspection with the primary key could not be found
	 */
	public ManuInspection fetchByPrimaryKey(long manuInspectionId);

	/**
	 * Returns all the manu inspections.
	 *
	 * @return the manu inspections
	 */
	public java.util.List<ManuInspection> findAll();

	/**
	 * Returns a range of all the manu inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @return the range of manu inspections
	 */
	public java.util.List<ManuInspection> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the manu inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu inspections
	 */
	public java.util.List<ManuInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the manu inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu inspections
	 */
	public java.util.List<ManuInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ManuInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the manu inspections from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of manu inspections.
	 *
	 * @return the number of manu inspections
	 */
	public int countAll();

}