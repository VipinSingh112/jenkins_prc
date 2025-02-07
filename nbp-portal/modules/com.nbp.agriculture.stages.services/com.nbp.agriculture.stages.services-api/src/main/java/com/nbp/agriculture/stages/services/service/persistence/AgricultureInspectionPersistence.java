/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.agriculture.stages.services.exception.NoSuchAgricultureInspectionException;
import com.nbp.agriculture.stages.services.model.AgricultureInspection;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the agriculture inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureInspectionUtil
 * @generated
 */
@ProviderType
public interface AgricultureInspectionPersistence
	extends BasePersistence<AgricultureInspection> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AgricultureInspectionUtil} to access the agriculture inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the agriculture inspection where caseId = &#63; or throws a <code>NoSuchAgricultureInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection findBygetAgricultureInspectionBy_CI(
			String caseId)
		throws NoSuchAgricultureInspectionException;

	/**
	 * Returns the agriculture inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection fetchBygetAgricultureInspectionBy_CI(
		String caseId);

	/**
	 * Returns the agriculture inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection fetchBygetAgricultureInspectionBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the agriculture inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the agriculture inspection that was removed
	 */
	public AgricultureInspection removeBygetAgricultureInspectionBy_CI(
			String caseId)
		throws NoSuchAgricultureInspectionException;

	/**
	 * Returns the number of agriculture inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching agriculture inspections
	 */
	public int countBygetAgricultureInspectionBy_CI(String caseId);

	/**
	 * Returns all the agriculture inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture inspections
	 */
	public java.util.List<AgricultureInspection> findBygetAI_CaseId(
		String caseId);

	/**
	 * Returns a range of all the agriculture inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @return the range of matching agriculture inspections
	 */
	public java.util.List<AgricultureInspection> findBygetAI_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the agriculture inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture inspections
	 */
	public java.util.List<AgricultureInspection> findBygetAI_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture inspections
	 */
	public java.util.List<AgricultureInspection> findBygetAI_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first agriculture inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection findBygetAI_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException;

	/**
	 * Returns the first agriculture inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection fetchBygetAI_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureInspection>
			orderByComparator);

	/**
	 * Returns the last agriculture inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection findBygetAI_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException;

	/**
	 * Returns the last agriculture inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection fetchBygetAI_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureInspection>
			orderByComparator);

	/**
	 * Returns the agriculture inspections before and after the current agriculture inspection in the ordered set where caseId = &#63;.
	 *
	 * @param agricultureInspectionId the primary key of the current agriculture inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	public AgricultureInspection[] findBygetAI_CaseId_PrevAndNext(
			long agricultureInspectionId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException;

	/**
	 * Removes all the agriculture inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetAI_CaseId(String caseId);

	/**
	 * Returns the number of agriculture inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching agriculture inspections
	 */
	public int countBygetAI_CaseId(String caseId);

	/**
	 * Returns all the agriculture inspections where agriApplicationId = &#63;.
	 *
	 * @param agriApplicationId the agri application ID
	 * @return the matching agriculture inspections
	 */
	public java.util.List<AgricultureInspection> findBygetCI_CAI(
		long agriApplicationId);

	/**
	 * Returns a range of all the agriculture inspections where agriApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param agriApplicationId the agri application ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @return the range of matching agriculture inspections
	 */
	public java.util.List<AgricultureInspection> findBygetCI_CAI(
		long agriApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the agriculture inspections where agriApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param agriApplicationId the agri application ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture inspections
	 */
	public java.util.List<AgricultureInspection> findBygetCI_CAI(
		long agriApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture inspections where agriApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param agriApplicationId the agri application ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture inspections
	 */
	public java.util.List<AgricultureInspection> findBygetCI_CAI(
		long agriApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first agriculture inspection in the ordered set where agriApplicationId = &#63;.
	 *
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection findBygetCI_CAI_First(
			long agriApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException;

	/**
	 * Returns the first agriculture inspection in the ordered set where agriApplicationId = &#63;.
	 *
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection fetchBygetCI_CAI_First(
		long agriApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureInspection>
			orderByComparator);

	/**
	 * Returns the last agriculture inspection in the ordered set where agriApplicationId = &#63;.
	 *
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection findBygetCI_CAI_Last(
			long agriApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException;

	/**
	 * Returns the last agriculture inspection in the ordered set where agriApplicationId = &#63;.
	 *
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection fetchBygetCI_CAI_Last(
		long agriApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureInspection>
			orderByComparator);

	/**
	 * Returns the agriculture inspections before and after the current agriculture inspection in the ordered set where agriApplicationId = &#63;.
	 *
	 * @param agricultureInspectionId the primary key of the current agriculture inspection
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	public AgricultureInspection[] findBygetCI_CAI_PrevAndNext(
			long agricultureInspectionId, long agriApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException;

	/**
	 * Removes all the agriculture inspections where agriApplicationId = &#63; from the database.
	 *
	 * @param agriApplicationId the agri application ID
	 */
	public void removeBygetCI_CAI(long agriApplicationId);

	/**
	 * Returns the number of agriculture inspections where agriApplicationId = &#63;.
	 *
	 * @param agriApplicationId the agri application ID
	 * @return the number of matching agriculture inspections
	 */
	public int countBygetCI_CAI(long agriApplicationId);

	/**
	 * Returns all the agriculture inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching agriculture inspections
	 */
	public java.util.List<AgricultureInspection> findBygetAI_Status(
		String status);

	/**
	 * Returns a range of all the agriculture inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @return the range of matching agriculture inspections
	 */
	public java.util.List<AgricultureInspection> findBygetAI_Status(
		String status, int start, int end);

	/**
	 * Returns an ordered range of all the agriculture inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture inspections
	 */
	public java.util.List<AgricultureInspection> findBygetAI_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture inspections
	 */
	public java.util.List<AgricultureInspection> findBygetAI_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first agriculture inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection findBygetAI_Status_First(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException;

	/**
	 * Returns the first agriculture inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection fetchBygetAI_Status_First(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureInspection>
			orderByComparator);

	/**
	 * Returns the last agriculture inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection findBygetAI_Status_Last(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException;

	/**
	 * Returns the last agriculture inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection fetchBygetAI_Status_Last(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureInspection>
			orderByComparator);

	/**
	 * Returns the agriculture inspections before and after the current agriculture inspection in the ordered set where status = &#63;.
	 *
	 * @param agricultureInspectionId the primary key of the current agriculture inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	public AgricultureInspection[] findBygetAI_Status_PrevAndNext(
			long agricultureInspectionId, String status,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException;

	/**
	 * Removes all the agriculture inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetAI_Status(String status);

	/**
	 * Returns the number of agriculture inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching agriculture inspections
	 */
	public int countBygetAI_Status(String status);

	/**
	 * Returns all the agriculture inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching agriculture inspections
	 */
	public java.util.List<AgricultureInspection> findBygetAI_CaseIdStatus(
		String status, String caseId);

	/**
	 * Returns a range of all the agriculture inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @return the range of matching agriculture inspections
	 */
	public java.util.List<AgricultureInspection> findBygetAI_CaseIdStatus(
		String status, String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the agriculture inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture inspections
	 */
	public java.util.List<AgricultureInspection> findBygetAI_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture inspections
	 */
	public java.util.List<AgricultureInspection> findBygetAI_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first agriculture inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection findBygetAI_CaseIdStatus_First(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException;

	/**
	 * Returns the first agriculture inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection fetchBygetAI_CaseIdStatus_First(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureInspection>
			orderByComparator);

	/**
	 * Returns the last agriculture inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection findBygetAI_CaseIdStatus_Last(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException;

	/**
	 * Returns the last agriculture inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection fetchBygetAI_CaseIdStatus_Last(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureInspection>
			orderByComparator);

	/**
	 * Returns the agriculture inspections before and after the current agriculture inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param agricultureInspectionId the primary key of the current agriculture inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	public AgricultureInspection[] findBygetAI_CaseIdStatus_PrevAndNext(
			long agricultureInspectionId, String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException;

	/**
	 * Removes all the agriculture inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public void removeBygetAI_CaseIdStatus(String status, String caseId);

	/**
	 * Returns the number of agriculture inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching agriculture inspections
	 */
	public int countBygetAI_CaseIdStatus(String status, String caseId);

	/**
	 * Returns all the agriculture inspections where status = &#63; and agriApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @return the matching agriculture inspections
	 */
	public java.util.List<AgricultureInspection>
		findBygetAI_CaseIdApplicationId(String status, long agriApplicationId);

	/**
	 * Returns a range of all the agriculture inspections where status = &#63; and agriApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @return the range of matching agriculture inspections
	 */
	public java.util.List<AgricultureInspection>
		findBygetAI_CaseIdApplicationId(
			String status, long agriApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the agriculture inspections where status = &#63; and agriApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture inspections
	 */
	public java.util.List<AgricultureInspection>
		findBygetAI_CaseIdApplicationId(
			String status, long agriApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureInspection> orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture inspections where status = &#63; and agriApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture inspections
	 */
	public java.util.List<AgricultureInspection>
		findBygetAI_CaseIdApplicationId(
			String status, long agriApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureInspection> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first agriculture inspection in the ordered set where status = &#63; and agriApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection findBygetAI_CaseIdApplicationId_First(
			String status, long agriApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException;

	/**
	 * Returns the first agriculture inspection in the ordered set where status = &#63; and agriApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection fetchBygetAI_CaseIdApplicationId_First(
		String status, long agriApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureInspection>
			orderByComparator);

	/**
	 * Returns the last agriculture inspection in the ordered set where status = &#63; and agriApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection findBygetAI_CaseIdApplicationId_Last(
			String status, long agriApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException;

	/**
	 * Returns the last agriculture inspection in the ordered set where status = &#63; and agriApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection fetchBygetAI_CaseIdApplicationId_Last(
		String status, long agriApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureInspection>
			orderByComparator);

	/**
	 * Returns the agriculture inspections before and after the current agriculture inspection in the ordered set where status = &#63; and agriApplicationId = &#63;.
	 *
	 * @param agricultureInspectionId the primary key of the current agriculture inspection
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	public AgricultureInspection[] findBygetAI_CaseIdApplicationId_PrevAndNext(
			long agricultureInspectionId, String status, long agriApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureInspection> orderByComparator)
		throws NoSuchAgricultureInspectionException;

	/**
	 * Removes all the agriculture inspections where status = &#63; and agriApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 */
	public void removeBygetAI_CaseIdApplicationId(
		String status, long agriApplicationId);

	/**
	 * Returns the number of agriculture inspections where status = &#63; and agriApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @return the number of matching agriculture inspections
	 */
	public int countBygetAI_CaseIdApplicationId(
		String status, long agriApplicationId);

	/**
	 * Returns the agriculture inspection where status = &#63; and slotBookedByUser = &#63; and agriApplicationId = &#63; or throws a <code>NoSuchAgricultureInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param agriApplicationId the agri application ID
	 * @return the matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long agriApplicationId)
		throws NoSuchAgricultureInspectionException;

	/**
	 * Returns the agriculture inspection where status = &#63; and slotBookedByUser = &#63; and agriApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param agriApplicationId the agri application ID
	 * @return the matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long agriApplicationId);

	/**
	 * Returns the agriculture inspection where status = &#63; and slotBookedByUser = &#63; and agriApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param agriApplicationId the agri application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public AgricultureInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long agriApplicationId,
			boolean useFinderCache);

	/**
	 * Removes the agriculture inspection where status = &#63; and slotBookedByUser = &#63; and agriApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param agriApplicationId the agri application ID
	 * @return the agriculture inspection that was removed
	 */
	public AgricultureInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long agriApplicationId)
		throws NoSuchAgricultureInspectionException;

	/**
	 * Returns the number of agriculture inspections where status = &#63; and slotBookedByUser = &#63; and agriApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param agriApplicationId the agri application ID
	 * @return the number of matching agriculture inspections
	 */
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long agriApplicationId);

	/**
	 * Caches the agriculture inspection in the entity cache if it is enabled.
	 *
	 * @param agricultureInspection the agriculture inspection
	 */
	public void cacheResult(AgricultureInspection agricultureInspection);

	/**
	 * Caches the agriculture inspections in the entity cache if it is enabled.
	 *
	 * @param agricultureInspections the agriculture inspections
	 */
	public void cacheResult(
		java.util.List<AgricultureInspection> agricultureInspections);

	/**
	 * Creates a new agriculture inspection with the primary key. Does not add the agriculture inspection to the database.
	 *
	 * @param agricultureInspectionId the primary key for the new agriculture inspection
	 * @return the new agriculture inspection
	 */
	public AgricultureInspection create(long agricultureInspectionId);

	/**
	 * Removes the agriculture inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureInspectionId the primary key of the agriculture inspection
	 * @return the agriculture inspection that was removed
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	public AgricultureInspection remove(long agricultureInspectionId)
		throws NoSuchAgricultureInspectionException;

	public AgricultureInspection updateImpl(
		AgricultureInspection agricultureInspection);

	/**
	 * Returns the agriculture inspection with the primary key or throws a <code>NoSuchAgricultureInspectionException</code> if it could not be found.
	 *
	 * @param agricultureInspectionId the primary key of the agriculture inspection
	 * @return the agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	public AgricultureInspection findByPrimaryKey(long agricultureInspectionId)
		throws NoSuchAgricultureInspectionException;

	/**
	 * Returns the agriculture inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureInspectionId the primary key of the agriculture inspection
	 * @return the agriculture inspection, or <code>null</code> if a agriculture inspection with the primary key could not be found
	 */
	public AgricultureInspection fetchByPrimaryKey(
		long agricultureInspectionId);

	/**
	 * Returns all the agriculture inspections.
	 *
	 * @return the agriculture inspections
	 */
	public java.util.List<AgricultureInspection> findAll();

	/**
	 * Returns a range of all the agriculture inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @return the range of agriculture inspections
	 */
	public java.util.List<AgricultureInspection> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the agriculture inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture inspections
	 */
	public java.util.List<AgricultureInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture inspections
	 */
	public java.util.List<AgricultureInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the agriculture inspections from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of agriculture inspections.
	 *
	 * @return the number of agriculture inspections
	 */
	public int countAll();

}