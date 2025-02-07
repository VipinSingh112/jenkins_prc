/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisLicensePreCondtionsException;
import com.npm.cannabis.application.stages.services.model.CannabisLicensePreCondtions;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis license pre condtions service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicensePreCondtionsUtil
 * @generated
 */
@ProviderType
public interface CannabisLicensePreCondtionsPersistence
	extends BasePersistence<CannabisLicensePreCondtions> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisLicensePreCondtionsUtil} to access the cannabis license pre condtions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cannabis license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions> findBygetCI_CAI(
		long cannabisApplicationId);

	/**
	 * Returns a range of all the cannabis license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @return the range of matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions> findBygetCI_CAI(
		long cannabisApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions> findBygetCI_CAI(
		long cannabisApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisLicensePreCondtions> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions> findBygetCI_CAI(
		long cannabisApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisLicensePreCondtions> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions findBygetCI_CAI_First(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException;

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions fetchBygetCI_CAI_First(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisLicensePreCondtions> orderByComparator);

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions findBygetCI_CAI_Last(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException;

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions fetchBygetCI_CAI_Last(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisLicensePreCondtions> orderByComparator);

	/**
	 * Returns the cannabis license pre condtionses before and after the current cannabis license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis license pre condtions
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a cannabis license pre condtions with the primary key could not be found
	 */
	public CannabisLicensePreCondtions[] findBygetCI_CAI_PrevAndNext(
			long cannabisPreconditionsId, long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException;

	/**
	 * Removes all the cannabis license pre condtionses where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public void removeBygetCI_CAI(long cannabisApplicationId);

	/**
	 * Returns the number of cannabis license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis license pre condtionses
	 */
	public int countBygetCI_CAI(long cannabisApplicationId);

	/**
	 * Returns all the cannabis license pre condtionses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions> findBygetCI_CaseId(
		String caseId);

	/**
	 * Returns a range of all the cannabis license pre condtionses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @return the range of matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions> findBygetCI_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions> findBygetCI_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisLicensePreCondtions> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions> findBygetCI_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisLicensePreCondtions> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions findBygetCI_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException;

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions fetchBygetCI_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisLicensePreCondtions> orderByComparator);

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions findBygetCI_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException;

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions fetchBygetCI_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisLicensePreCondtions> orderByComparator);

	/**
	 * Returns the cannabis license pre condtionses before and after the current cannabis license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis license pre condtions
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a cannabis license pre condtions with the primary key could not be found
	 */
	public CannabisLicensePreCondtions[] findBygetCI_CaseId_PrevAndNext(
			long cannabisPreconditionsId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException;

	/**
	 * Removes all the cannabis license pre condtionses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetCI_CaseId(String caseId);

	/**
	 * Returns the number of cannabis license pre condtionses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis license pre condtionses
	 */
	public int countBygetCI_CaseId(String caseId);

	/**
	 * Returns all the cannabis license pre condtionses where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions> findBygetCI_Status(
		String status);

	/**
	 * Returns a range of all the cannabis license pre condtionses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @return the range of matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions> findBygetCI_Status(
		String status, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions> findBygetCI_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisLicensePreCondtions> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions> findBygetCI_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisLicensePreCondtions> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions findBygetCI_Status_First(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException;

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions fetchBygetCI_Status_First(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisLicensePreCondtions> orderByComparator);

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions findBygetCI_Status_Last(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException;

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions fetchBygetCI_Status_Last(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisLicensePreCondtions> orderByComparator);

	/**
	 * Returns the cannabis license pre condtionses before and after the current cannabis license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis license pre condtions
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a cannabis license pre condtions with the primary key could not be found
	 */
	public CannabisLicensePreCondtions[] findBygetCI_Status_PrevAndNext(
			long cannabisPreconditionsId, String status,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException;

	/**
	 * Removes all the cannabis license pre condtionses where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetCI_Status(String status);

	/**
	 * Returns the number of cannabis license pre condtionses where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching cannabis license pre condtionses
	 */
	public int countBygetCI_Status(String status);

	/**
	 * Returns all the cannabis license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions> findBygetCI_CaseIdStatus(
		String status, String caseId);

	/**
	 * Returns a range of all the cannabis license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @return the range of matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisLicensePreCondtions> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisLicensePreCondtions> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions findBygetCI_CaseIdStatus_First(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException;

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions fetchBygetCI_CaseIdStatus_First(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisLicensePreCondtions> orderByComparator);

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions findBygetCI_CaseIdStatus_Last(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException;

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions fetchBygetCI_CaseIdStatus_Last(
		String status, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisLicensePreCondtions> orderByComparator);

	/**
	 * Returns the cannabis license pre condtionses before and after the current cannabis license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis license pre condtions
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a cannabis license pre condtions with the primary key could not be found
	 */
	public CannabisLicensePreCondtions[] findBygetCI_CaseIdStatus_PrevAndNext(
			long cannabisPreconditionsId, String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException;

	/**
	 * Removes all the cannabis license pre condtionses where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public void removeBygetCI_CaseIdStatus(String status, String caseId);

	/**
	 * Returns the number of cannabis license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching cannabis license pre condtionses
	 */
	public int countBygetCI_CaseIdStatus(String status, String caseId);

	/**
	 * Returns all the cannabis license pre condtionses where caseId = &#63; and licenseType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param licenseType the license type
	 * @return the matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions>
		findBygetCI_CaseIdLicenseType(String caseId, String licenseType);

	/**
	 * Returns a range of all the cannabis license pre condtionses where caseId = &#63; and licenseType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param licenseType the license type
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @return the range of matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions>
		findBygetCI_CaseIdLicenseType(
			String caseId, String licenseType, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where caseId = &#63; and licenseType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param licenseType the license type
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions>
		findBygetCI_CaseIdLicenseType(
			String caseId, String licenseType, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisLicensePreCondtions> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where caseId = &#63; and licenseType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param licenseType the license type
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions>
		findBygetCI_CaseIdLicenseType(
			String caseId, String licenseType, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisLicensePreCondtions> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where caseId = &#63; and licenseType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param licenseType the license type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions findBygetCI_CaseIdLicenseType_First(
			String caseId, String licenseType,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException;

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where caseId = &#63; and licenseType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param licenseType the license type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions fetchBygetCI_CaseIdLicenseType_First(
		String caseId, String licenseType,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisLicensePreCondtions> orderByComparator);

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where caseId = &#63; and licenseType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param licenseType the license type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions findBygetCI_CaseIdLicenseType_Last(
			String caseId, String licenseType,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException;

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where caseId = &#63; and licenseType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param licenseType the license type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions fetchBygetCI_CaseIdLicenseType_Last(
		String caseId, String licenseType,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisLicensePreCondtions> orderByComparator);

	/**
	 * Returns the cannabis license pre condtionses before and after the current cannabis license pre condtions in the ordered set where caseId = &#63; and licenseType = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis license pre condtions
	 * @param caseId the case ID
	 * @param licenseType the license type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a cannabis license pre condtions with the primary key could not be found
	 */
	public CannabisLicensePreCondtions[]
			findBygetCI_CaseIdLicenseType_PrevAndNext(
				long cannabisPreconditionsId, String caseId, String licenseType,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException;

	/**
	 * Removes all the cannabis license pre condtionses where caseId = &#63; and licenseType = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param licenseType the license type
	 */
	public void removeBygetCI_CaseIdLicenseType(
		String caseId, String licenseType);

	/**
	 * Returns the number of cannabis license pre condtionses where caseId = &#63; and licenseType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param licenseType the license type
	 * @return the number of matching cannabis license pre condtionses
	 */
	public int countBygetCI_CaseIdLicenseType(
		String caseId, String licenseType);

	/**
	 * Returns all the cannabis license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions>
		findBygetCI_CaseIdApplicationId(
			String status, long cannabisApplicationId);

	/**
	 * Returns a range of all the cannabis license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @return the range of matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions>
		findBygetCI_CaseIdApplicationId(
			String status, long cannabisApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions>
		findBygetCI_CaseIdApplicationId(
			String status, long cannabisApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisLicensePreCondtions> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions>
		findBygetCI_CaseIdApplicationId(
			String status, long cannabisApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisLicensePreCondtions> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions findBygetCI_CaseIdApplicationId_First(
			String status, long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException;

	/**
	 * Returns the first cannabis license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions fetchBygetCI_CaseIdApplicationId_First(
		String status, long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisLicensePreCondtions> orderByComparator);

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions findBygetCI_CaseIdApplicationId_Last(
			String status, long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException;

	/**
	 * Returns the last cannabis license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis license pre condtions, or <code>null</code> if a matching cannabis license pre condtions could not be found
	 */
	public CannabisLicensePreCondtions fetchBygetCI_CaseIdApplicationId_Last(
		String status, long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisLicensePreCondtions> orderByComparator);

	/**
	 * Returns the cannabis license pre condtionses before and after the current cannabis license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis license pre condtions
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a cannabis license pre condtions with the primary key could not be found
	 */
	public CannabisLicensePreCondtions[]
			findBygetCI_CaseIdApplicationId_PrevAndNext(
				long cannabisPreconditionsId, String status,
				long cannabisApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisLicensePreCondtionsException;

	/**
	 * Removes all the cannabis license pre condtionses where status = &#63; and cannabisApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public void removeBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId);

	/**
	 * Returns the number of cannabis license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis license pre condtionses
	 */
	public int countBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId);

	/**
	 * Caches the cannabis license pre condtions in the entity cache if it is enabled.
	 *
	 * @param cannabisLicensePreCondtions the cannabis license pre condtions
	 */
	public void cacheResult(
		CannabisLicensePreCondtions cannabisLicensePreCondtions);

	/**
	 * Caches the cannabis license pre condtionses in the entity cache if it is enabled.
	 *
	 * @param cannabisLicensePreCondtionses the cannabis license pre condtionses
	 */
	public void cacheResult(
		java.util.List<CannabisLicensePreCondtions>
			cannabisLicensePreCondtionses);

	/**
	 * Creates a new cannabis license pre condtions with the primary key. Does not add the cannabis license pre condtions to the database.
	 *
	 * @param cannabisPreconditionsId the primary key for the new cannabis license pre condtions
	 * @return the new cannabis license pre condtions
	 */
	public CannabisLicensePreCondtions create(long cannabisPreconditionsId);

	/**
	 * Removes the cannabis license pre condtions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisPreconditionsId the primary key of the cannabis license pre condtions
	 * @return the cannabis license pre condtions that was removed
	 * @throws NoSuchCannabisLicensePreCondtionsException if a cannabis license pre condtions with the primary key could not be found
	 */
	public CannabisLicensePreCondtions remove(long cannabisPreconditionsId)
		throws NoSuchCannabisLicensePreCondtionsException;

	public CannabisLicensePreCondtions updateImpl(
		CannabisLicensePreCondtions cannabisLicensePreCondtions);

	/**
	 * Returns the cannabis license pre condtions with the primary key or throws a <code>NoSuchCannabisLicensePreCondtionsException</code> if it could not be found.
	 *
	 * @param cannabisPreconditionsId the primary key of the cannabis license pre condtions
	 * @return the cannabis license pre condtions
	 * @throws NoSuchCannabisLicensePreCondtionsException if a cannabis license pre condtions with the primary key could not be found
	 */
	public CannabisLicensePreCondtions findByPrimaryKey(
			long cannabisPreconditionsId)
		throws NoSuchCannabisLicensePreCondtionsException;

	/**
	 * Returns the cannabis license pre condtions with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisPreconditionsId the primary key of the cannabis license pre condtions
	 * @return the cannabis license pre condtions, or <code>null</code> if a cannabis license pre condtions with the primary key could not be found
	 */
	public CannabisLicensePreCondtions fetchByPrimaryKey(
		long cannabisPreconditionsId);

	/**
	 * Returns all the cannabis license pre condtionses.
	 *
	 * @return the cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions> findAll();

	/**
	 * Returns a range of all the cannabis license pre condtionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @return the range of cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisLicensePreCondtions> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis license pre condtionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis license pre condtionses
	 */
	public java.util.List<CannabisLicensePreCondtions> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisLicensePreCondtions> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis license pre condtionses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis license pre condtionses.
	 *
	 * @return the number of cannabis license pre condtionses
	 */
	public int countAll();

}