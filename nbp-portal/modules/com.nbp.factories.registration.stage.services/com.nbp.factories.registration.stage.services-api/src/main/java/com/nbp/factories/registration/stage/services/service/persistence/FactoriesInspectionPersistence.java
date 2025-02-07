/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.factories.registration.stage.services.exception.NoSuchFactoriesInspectionException;
import com.nbp.factories.registration.stage.services.model.FactoriesInspection;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the factories inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesInspectionUtil
 * @generated
 */
@ProviderType
public interface FactoriesInspectionPersistence
	extends BasePersistence<FactoriesInspection> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FactoriesInspectionUtil} to access the factories inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the factories inspection where caseId = &#63; or throws a <code>NoSuchFactoriesInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public FactoriesInspection findBygetFactoryInspectionBy_CI(String caseId)
		throws NoSuchFactoriesInspectionException;

	/**
	 * Returns the factories inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public FactoriesInspection fetchBygetFactoryInspectionBy_CI(String caseId);

	/**
	 * Returns the factories inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public FactoriesInspection fetchBygetFactoryInspectionBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the factories inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the factories inspection that was removed
	 */
	public FactoriesInspection removeBygetFactoryInspectionBy_CI(String caseId)
		throws NoSuchFactoriesInspectionException;

	/**
	 * Returns the number of factories inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories inspections
	 */
	public int countBygetFactoryInspectionBy_CI(String caseId);

	/**
	 * Returns all the factories inspections where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories inspections
	 */
	public java.util.List<FactoriesInspection> findBygetFI_FAI(
		long factoriesApplicationId);

	/**
	 * Returns a range of all the factories inspections where factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @return the range of matching factories inspections
	 */
	public java.util.List<FactoriesInspection> findBygetFI_FAI(
		long factoriesApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the factories inspections where factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories inspections
	 */
	public java.util.List<FactoriesInspection> findBygetFI_FAI(
		long factoriesApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the factories inspections where factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories inspections
	 */
	public java.util.List<FactoriesInspection> findBygetFI_FAI(
		long factoriesApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first factories inspection in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public FactoriesInspection findBygetFI_FAI_First(
			long factoriesApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException;

	/**
	 * Returns the first factories inspection in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public FactoriesInspection fetchBygetFI_FAI_First(
		long factoriesApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesInspection>
			orderByComparator);

	/**
	 * Returns the last factories inspection in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public FactoriesInspection findBygetFI_FAI_Last(
			long factoriesApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException;

	/**
	 * Returns the last factories inspection in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public FactoriesInspection fetchBygetFI_FAI_Last(
		long factoriesApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesInspection>
			orderByComparator);

	/**
	 * Returns the factories inspections before and after the current factories inspection in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesInspectionId the primary key of the current factories inspection
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories inspection
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	public FactoriesInspection[] findBygetFI_FAI_PrevAndNext(
			long factoriesInspectionId, long factoriesApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException;

	/**
	 * Removes all the factories inspections where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 */
	public void removeBygetFI_FAI(long factoriesApplicationId);

	/**
	 * Returns the number of factories inspections where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories inspections
	 */
	public int countBygetFI_FAI(long factoriesApplicationId);

	/**
	 * Returns all the factories inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching factories inspections
	 */
	public java.util.List<FactoriesInspection> findBygetMI_CaseId(
		String caseId);

	/**
	 * Returns a range of all the factories inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @return the range of matching factories inspections
	 */
	public java.util.List<FactoriesInspection> findBygetMI_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the factories inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories inspections
	 */
	public java.util.List<FactoriesInspection> findBygetMI_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the factories inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories inspections
	 */
	public java.util.List<FactoriesInspection> findBygetMI_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first factories inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public FactoriesInspection findBygetMI_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException;

	/**
	 * Returns the first factories inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public FactoriesInspection fetchBygetMI_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesInspection>
			orderByComparator);

	/**
	 * Returns the last factories inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public FactoriesInspection findBygetMI_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException;

	/**
	 * Returns the last factories inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public FactoriesInspection fetchBygetMI_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesInspection>
			orderByComparator);

	/**
	 * Returns the factories inspections before and after the current factories inspection in the ordered set where caseId = &#63;.
	 *
	 * @param factoriesInspectionId the primary key of the current factories inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories inspection
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	public FactoriesInspection[] findBygetMI_CaseId_PrevAndNext(
			long factoriesInspectionId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException;

	/**
	 * Removes all the factories inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetMI_CaseId(String caseId);

	/**
	 * Returns the number of factories inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories inspections
	 */
	public int countBygetMI_CaseId(String caseId);

	/**
	 * Returns all the factories inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching factories inspections
	 */
	public java.util.List<FactoriesInspection> findBygetMI_Status(
		String status);

	/**
	 * Returns a range of all the factories inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @return the range of matching factories inspections
	 */
	public java.util.List<FactoriesInspection> findBygetMI_Status(
		String status, int start, int end);

	/**
	 * Returns an ordered range of all the factories inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories inspections
	 */
	public java.util.List<FactoriesInspection> findBygetMI_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the factories inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories inspections
	 */
	public java.util.List<FactoriesInspection> findBygetMI_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first factories inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public FactoriesInspection findBygetMI_Status_First(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException;

	/**
	 * Returns the first factories inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public FactoriesInspection fetchBygetMI_Status_First(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesInspection>
			orderByComparator);

	/**
	 * Returns the last factories inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public FactoriesInspection findBygetMI_Status_Last(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException;

	/**
	 * Returns the last factories inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public FactoriesInspection fetchBygetMI_Status_Last(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesInspection>
			orderByComparator);

	/**
	 * Returns the factories inspections before and after the current factories inspection in the ordered set where status = &#63;.
	 *
	 * @param factoriesInspectionId the primary key of the current factories inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories inspection
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	public FactoriesInspection[] findBygetMI_Status_PrevAndNext(
			long factoriesInspectionId, String status,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException;

	/**
	 * Removes all the factories inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetMI_Status(String status);

	/**
	 * Returns the number of factories inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching factories inspections
	 */
	public int countBygetMI_Status(String status);

	/**
	 * Returns all the factories inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching factories inspections
	 */
	public java.util.List<FactoriesInspection> findBygetMI_CaseIdStatus(
		String status, String caseId);

	/**
	 * Returns a range of all the factories inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @return the range of matching factories inspections
	 */
	public java.util.List<FactoriesInspection> findBygetMI_CaseIdStatus(
		String status, String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the factories inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories inspections
	 */
	public java.util.List<FactoriesInspection> findBygetMI_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the factories inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories inspections
	 */
	public java.util.List<FactoriesInspection> findBygetMI_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first factories inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public FactoriesInspection findBygetMI_CaseIdStatus_First(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException;

	/**
	 * Returns the first factories inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public FactoriesInspection fetchBygetMI_CaseIdStatus_First(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesInspection>
			orderByComparator);

	/**
	 * Returns the last factories inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public FactoriesInspection findBygetMI_CaseIdStatus_Last(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException;

	/**
	 * Returns the last factories inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public FactoriesInspection fetchBygetMI_CaseIdStatus_Last(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesInspection>
			orderByComparator);

	/**
	 * Returns the factories inspections before and after the current factories inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param factoriesInspectionId the primary key of the current factories inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories inspection
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	public FactoriesInspection[] findBygetMI_CaseIdStatus_PrevAndNext(
			long factoriesInspectionId, String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException;

	/**
	 * Removes all the factories inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public void removeBygetMI_CaseIdStatus(String status, String caseId);

	/**
	 * Returns the number of factories inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching factories inspections
	 */
	public int countBygetMI_CaseIdStatus(String status, String caseId);

	/**
	 * Returns all the factories inspections where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories inspections
	 */
	public java.util.List<FactoriesInspection> findBygetMI_CaseIdApplicationId(
		String status, long factoriesApplicationId);

	/**
	 * Returns a range of all the factories inspections where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @return the range of matching factories inspections
	 */
	public java.util.List<FactoriesInspection> findBygetMI_CaseIdApplicationId(
		String status, long factoriesApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the factories inspections where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories inspections
	 */
	public java.util.List<FactoriesInspection> findBygetMI_CaseIdApplicationId(
		String status, long factoriesApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the factories inspections where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories inspections
	 */
	public java.util.List<FactoriesInspection> findBygetMI_CaseIdApplicationId(
		String status, long factoriesApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first factories inspection in the ordered set where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public FactoriesInspection findBygetMI_CaseIdApplicationId_First(
			String status, long factoriesApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException;

	/**
	 * Returns the first factories inspection in the ordered set where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public FactoriesInspection fetchBygetMI_CaseIdApplicationId_First(
		String status, long factoriesApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesInspection>
			orderByComparator);

	/**
	 * Returns the last factories inspection in the ordered set where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public FactoriesInspection findBygetMI_CaseIdApplicationId_Last(
			String status, long factoriesApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException;

	/**
	 * Returns the last factories inspection in the ordered set where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public FactoriesInspection fetchBygetMI_CaseIdApplicationId_Last(
		String status, long factoriesApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesInspection>
			orderByComparator);

	/**
	 * Returns the factories inspections before and after the current factories inspection in the ordered set where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param factoriesInspectionId the primary key of the current factories inspection
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories inspection
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	public FactoriesInspection[] findBygetMI_CaseIdApplicationId_PrevAndNext(
			long factoriesInspectionId, String status,
			long factoriesApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException;

	/**
	 * Removes all the factories inspections where status = &#63; and factoriesApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 */
	public void removeBygetMI_CaseIdApplicationId(
		String status, long factoriesApplicationId);

	/**
	 * Returns the number of factories inspections where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories inspections
	 */
	public int countBygetMI_CaseIdApplicationId(
		String status, long factoriesApplicationId);

	/**
	 * Returns the factories inspection where status = &#63; and slotBookedByUser = &#63; and factoriesApplicationId = &#63; or throws a <code>NoSuchFactoriesInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public FactoriesInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long factoriesApplicationId)
		throws NoSuchFactoriesInspectionException;

	/**
	 * Returns the factories inspection where status = &#63; and slotBookedByUser = &#63; and factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public FactoriesInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long factoriesApplicationId);

	/**
	 * Returns the factories inspection where status = &#63; and slotBookedByUser = &#63; and factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param factoriesApplicationId the factories application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public FactoriesInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long factoriesApplicationId,
			boolean useFinderCache);

	/**
	 * Removes the factories inspection where status = &#63; and slotBookedByUser = &#63; and factoriesApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param factoriesApplicationId the factories application ID
	 * @return the factories inspection that was removed
	 */
	public FactoriesInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long factoriesApplicationId)
		throws NoSuchFactoriesInspectionException;

	/**
	 * Returns the number of factories inspections where status = &#63; and slotBookedByUser = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories inspections
	 */
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long factoriesApplicationId);

	/**
	 * Caches the factories inspection in the entity cache if it is enabled.
	 *
	 * @param factoriesInspection the factories inspection
	 */
	public void cacheResult(FactoriesInspection factoriesInspection);

	/**
	 * Caches the factories inspections in the entity cache if it is enabled.
	 *
	 * @param factoriesInspections the factories inspections
	 */
	public void cacheResult(
		java.util.List<FactoriesInspection> factoriesInspections);

	/**
	 * Creates a new factories inspection with the primary key. Does not add the factories inspection to the database.
	 *
	 * @param factoriesInspectionId the primary key for the new factories inspection
	 * @return the new factories inspection
	 */
	public FactoriesInspection create(long factoriesInspectionId);

	/**
	 * Removes the factories inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesInspectionId the primary key of the factories inspection
	 * @return the factories inspection that was removed
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	public FactoriesInspection remove(long factoriesInspectionId)
		throws NoSuchFactoriesInspectionException;

	public FactoriesInspection updateImpl(
		FactoriesInspection factoriesInspection);

	/**
	 * Returns the factories inspection with the primary key or throws a <code>NoSuchFactoriesInspectionException</code> if it could not be found.
	 *
	 * @param factoriesInspectionId the primary key of the factories inspection
	 * @return the factories inspection
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	public FactoriesInspection findByPrimaryKey(long factoriesInspectionId)
		throws NoSuchFactoriesInspectionException;

	/**
	 * Returns the factories inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesInspectionId the primary key of the factories inspection
	 * @return the factories inspection, or <code>null</code> if a factories inspection with the primary key could not be found
	 */
	public FactoriesInspection fetchByPrimaryKey(long factoriesInspectionId);

	/**
	 * Returns all the factories inspections.
	 *
	 * @return the factories inspections
	 */
	public java.util.List<FactoriesInspection> findAll();

	/**
	 * Returns a range of all the factories inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @return the range of factories inspections
	 */
	public java.util.List<FactoriesInspection> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the factories inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories inspections
	 */
	public java.util.List<FactoriesInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesInspection>
			orderByComparator);

	/**
	 * Returns an ordered range of all the factories inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories inspections
	 */
	public java.util.List<FactoriesInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FactoriesInspection>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the factories inspections from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of factories inspections.
	 *
	 * @return the number of factories inspections
	 */
	public int countAll();

}