/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.medical.stages.service.exception.NoSuchMedicalFacilitiesInspectionException;
import com.nbp.medical.stages.service.model.MedicalFacilitiesInspection;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the medical facilities inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesInspectionUtil
 * @generated
 */
@ProviderType
public interface MedicalFacilitiesInspectionPersistence
	extends BasePersistence<MedicalFacilitiesInspection> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MedicalFacilitiesInspectionUtil} to access the medical facilities inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the medical facilities inspection where caseId = &#63; or throws a <code>NoSuchMedicalFacilitiesInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection findBygetMedicalInspectionBy_CI(
			String caseId)
		throws NoSuchMedicalFacilitiesInspectionException;

	/**
	 * Returns the medical facilities inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection fetchBygetMedicalInspectionBy_CI(
		String caseId);

	/**
	 * Returns the medical facilities inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection fetchBygetMedicalInspectionBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the medical facilities inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the medical facilities inspection that was removed
	 */
	public MedicalFacilitiesInspection removeBygetMedicalInspectionBy_CI(
			String caseId)
		throws NoSuchMedicalFacilitiesInspectionException;

	/**
	 * Returns the number of medical facilities inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching medical facilities inspections
	 */
	public int countBygetMedicalInspectionBy_CI(String caseId);

	/**
	 * Returns all the medical facilities inspections where medicalApplicationId = &#63;.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @return the matching medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection> findBygetMed_FBAI(
		long medicalApplicationId);

	/**
	 * Returns a range of all the medical facilities inspections where medicalApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @return the range of matching medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection> findBygetMed_FBAI(
		long medicalApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities inspections where medicalApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection> findBygetMed_FBAI(
		long medicalApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesInspection> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities inspections where medicalApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection> findBygetMed_FBAI(
		long medicalApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesInspection> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities inspection in the ordered set where medicalApplicationId = &#63;.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection findBygetMed_FBAI_First(
			long medicalApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException;

	/**
	 * Returns the first medical facilities inspection in the ordered set where medicalApplicationId = &#63;.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection fetchBygetMed_FBAI_First(
		long medicalApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesInspection> orderByComparator);

	/**
	 * Returns the last medical facilities inspection in the ordered set where medicalApplicationId = &#63;.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection findBygetMed_FBAI_Last(
			long medicalApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException;

	/**
	 * Returns the last medical facilities inspection in the ordered set where medicalApplicationId = &#63;.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection fetchBygetMed_FBAI_Last(
		long medicalApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesInspection> orderByComparator);

	/**
	 * Returns the medical facilities inspections before and after the current medical facilities inspection in the ordered set where medicalApplicationId = &#63;.
	 *
	 * @param medicalInspectionId the primary key of the current medical facilities inspection
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	public MedicalFacilitiesInspection[] findBygetMed_FBAI_PrevAndNext(
			long medicalInspectionId, long medicalApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException;

	/**
	 * Removes all the medical facilities inspections where medicalApplicationId = &#63; from the database.
	 *
	 * @param medicalApplicationId the medical application ID
	 */
	public void removeBygetMed_FBAI(long medicalApplicationId);

	/**
	 * Returns the number of medical facilities inspections where medicalApplicationId = &#63;.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @return the number of matching medical facilities inspections
	 */
	public int countBygetMed_FBAI(long medicalApplicationId);

	/**
	 * Returns all the medical facilities inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection> findBygetMed_CaseId(
		String caseId);

	/**
	 * Returns a range of all the medical facilities inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @return the range of matching medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection> findBygetMed_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection> findBygetMed_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesInspection> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection> findBygetMed_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesInspection> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection findBygetMed_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException;

	/**
	 * Returns the first medical facilities inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection fetchBygetMed_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesInspection> orderByComparator);

	/**
	 * Returns the last medical facilities inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection findBygetMed_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException;

	/**
	 * Returns the last medical facilities inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection fetchBygetMed_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesInspection> orderByComparator);

	/**
	 * Returns the medical facilities inspections before and after the current medical facilities inspection in the ordered set where caseId = &#63;.
	 *
	 * @param medicalInspectionId the primary key of the current medical facilities inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	public MedicalFacilitiesInspection[] findBygetMed_CaseId_PrevAndNext(
			long medicalInspectionId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException;

	/**
	 * Removes all the medical facilities inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetMed_CaseId(String caseId);

	/**
	 * Returns the number of medical facilities inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching medical facilities inspections
	 */
	public int countBygetMed_CaseId(String caseId);

	/**
	 * Returns all the medical facilities inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection> findBygetMed_Status(
		String status);

	/**
	 * Returns a range of all the medical facilities inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @return the range of matching medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection> findBygetMed_Status(
		String status, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection> findBygetMed_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesInspection> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection> findBygetMed_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesInspection> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first medical facilities inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection findBygetMed_Status_First(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException;

	/**
	 * Returns the first medical facilities inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection fetchBygetMed_Status_First(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesInspection> orderByComparator);

	/**
	 * Returns the last medical facilities inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection findBygetMed_Status_Last(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException;

	/**
	 * Returns the last medical facilities inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection fetchBygetMed_Status_Last(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesInspection> orderByComparator);

	/**
	 * Returns the medical facilities inspections before and after the current medical facilities inspection in the ordered set where status = &#63;.
	 *
	 * @param medicalInspectionId the primary key of the current medical facilities inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	public MedicalFacilitiesInspection[] findBygetMed_Status_PrevAndNext(
			long medicalInspectionId, String status,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException;

	/**
	 * Removes all the medical facilities inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetMed_Status(String status);

	/**
	 * Returns the number of medical facilities inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching medical facilities inspections
	 */
	public int countBygetMed_Status(String status);

	/**
	 * Returns all the medical facilities inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection>
		findBygetMed_CaseIdStatus(String status, String caseId);

	/**
	 * Returns a range of all the medical facilities inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @return the range of matching medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection>
		findBygetMed_CaseIdStatus(
			String status, String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection>
		findBygetMed_CaseIdStatus(
			String status, String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesInspection> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection>
		findBygetMed_CaseIdStatus(
			String status, String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesInspection> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first medical facilities inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection findBygetMed_CaseIdStatus_First(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException;

	/**
	 * Returns the first medical facilities inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection fetchBygetMed_CaseIdStatus_First(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesInspection> orderByComparator);

	/**
	 * Returns the last medical facilities inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection findBygetMed_CaseIdStatus_Last(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException;

	/**
	 * Returns the last medical facilities inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection fetchBygetMed_CaseIdStatus_Last(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesInspection> orderByComparator);

	/**
	 * Returns the medical facilities inspections before and after the current medical facilities inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param medicalInspectionId the primary key of the current medical facilities inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	public MedicalFacilitiesInspection[] findBygetMed_CaseIdStatus_PrevAndNext(
			long medicalInspectionId, String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException;

	/**
	 * Removes all the medical facilities inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public void removeBygetMed_CaseIdStatus(String status, String caseId);

	/**
	 * Returns the number of medical facilities inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching medical facilities inspections
	 */
	public int countBygetMed_CaseIdStatus(String status, String caseId);

	/**
	 * Returns all the medical facilities inspections where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @return the matching medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection>
		findBygetMed_CaseIdApplicationId(
			String status, long medicalApplicationId);

	/**
	 * Returns a range of all the medical facilities inspections where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @return the range of matching medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection>
		findBygetMed_CaseIdApplicationId(
			String status, long medicalApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities inspections where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection>
		findBygetMed_CaseIdApplicationId(
			String status, long medicalApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesInspection> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities inspections where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection>
		findBygetMed_CaseIdApplicationId(
			String status, long medicalApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesInspection> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first medical facilities inspection in the ordered set where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection findBygetMed_CaseIdApplicationId_First(
			String status, long medicalApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException;

	/**
	 * Returns the first medical facilities inspection in the ordered set where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection fetchBygetMed_CaseIdApplicationId_First(
		String status, long medicalApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesInspection> orderByComparator);

	/**
	 * Returns the last medical facilities inspection in the ordered set where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection findBygetMed_CaseIdApplicationId_Last(
			String status, long medicalApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException;

	/**
	 * Returns the last medical facilities inspection in the ordered set where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection fetchBygetMed_CaseIdApplicationId_Last(
		String status, long medicalApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesInspection> orderByComparator);

	/**
	 * Returns the medical facilities inspections before and after the current medical facilities inspection in the ordered set where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param medicalInspectionId the primary key of the current medical facilities inspection
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	public MedicalFacilitiesInspection[]
			findBygetMed_CaseIdApplicationId_PrevAndNext(
				long medicalInspectionId, String status,
				long medicalApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<MedicalFacilitiesInspection> orderByComparator)
		throws NoSuchMedicalFacilitiesInspectionException;

	/**
	 * Removes all the medical facilities inspections where status = &#63; and medicalApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 */
	public void removeBygetMed_CaseIdApplicationId(
		String status, long medicalApplicationId);

	/**
	 * Returns the number of medical facilities inspections where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @return the number of matching medical facilities inspections
	 */
	public int countBygetMed_CaseIdApplicationId(
		String status, long medicalApplicationId);

	/**
	 * Returns the medical facilities inspection where status = &#63; and slotBookedByUser = &#63; and medicalApplicationId = &#63; or throws a <code>NoSuchMedicalFacilitiesInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param medicalApplicationId the medical application ID
	 * @return the matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long medicalApplicationId)
		throws NoSuchMedicalFacilitiesInspectionException;

	/**
	 * Returns the medical facilities inspection where status = &#63; and slotBookedByUser = &#63; and medicalApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param medicalApplicationId the medical application ID
	 * @return the matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long medicalApplicationId);

	/**
	 * Returns the medical facilities inspection where status = &#63; and slotBookedByUser = &#63; and medicalApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param medicalApplicationId the medical application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public MedicalFacilitiesInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long medicalApplicationId,
			boolean useFinderCache);

	/**
	 * Removes the medical facilities inspection where status = &#63; and slotBookedByUser = &#63; and medicalApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param medicalApplicationId the medical application ID
	 * @return the medical facilities inspection that was removed
	 */
	public MedicalFacilitiesInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long medicalApplicationId)
		throws NoSuchMedicalFacilitiesInspectionException;

	/**
	 * Returns the number of medical facilities inspections where status = &#63; and slotBookedByUser = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param medicalApplicationId the medical application ID
	 * @return the number of matching medical facilities inspections
	 */
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long medicalApplicationId);

	/**
	 * Caches the medical facilities inspection in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesInspection the medical facilities inspection
	 */
	public void cacheResult(
		MedicalFacilitiesInspection medicalFacilitiesInspection);

	/**
	 * Caches the medical facilities inspections in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesInspections the medical facilities inspections
	 */
	public void cacheResult(
		java.util.List<MedicalFacilitiesInspection>
			medicalFacilitiesInspections);

	/**
	 * Creates a new medical facilities inspection with the primary key. Does not add the medical facilities inspection to the database.
	 *
	 * @param medicalInspectionId the primary key for the new medical facilities inspection
	 * @return the new medical facilities inspection
	 */
	public MedicalFacilitiesInspection create(long medicalInspectionId);

	/**
	 * Removes the medical facilities inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalInspectionId the primary key of the medical facilities inspection
	 * @return the medical facilities inspection that was removed
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	public MedicalFacilitiesInspection remove(long medicalInspectionId)
		throws NoSuchMedicalFacilitiesInspectionException;

	public MedicalFacilitiesInspection updateImpl(
		MedicalFacilitiesInspection medicalFacilitiesInspection);

	/**
	 * Returns the medical facilities inspection with the primary key or throws a <code>NoSuchMedicalFacilitiesInspectionException</code> if it could not be found.
	 *
	 * @param medicalInspectionId the primary key of the medical facilities inspection
	 * @return the medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	public MedicalFacilitiesInspection findByPrimaryKey(
			long medicalInspectionId)
		throws NoSuchMedicalFacilitiesInspectionException;

	/**
	 * Returns the medical facilities inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalInspectionId the primary key of the medical facilities inspection
	 * @return the medical facilities inspection, or <code>null</code> if a medical facilities inspection with the primary key could not be found
	 */
	public MedicalFacilitiesInspection fetchByPrimaryKey(
		long medicalInspectionId);

	/**
	 * Returns all the medical facilities inspections.
	 *
	 * @return the medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection> findAll();

	/**
	 * Returns a range of all the medical facilities inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @return the range of medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the medical facilities inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesInspection> orderByComparator);

	/**
	 * Returns an ordered range of all the medical facilities inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities inspections
	 */
	public java.util.List<MedicalFacilitiesInspection> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalFacilitiesInspection> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the medical facilities inspections from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of medical facilities inspections.
	 *
	 * @return the number of medical facilities inspections
	 */
	public int countAll();

}