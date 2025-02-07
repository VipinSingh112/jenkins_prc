/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.npm.cannabis.application.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisConditionalLicensePreCondtionsException;
import com.npm.cannabis.application.stages.services.model.CannabisConditionalLicensePreCondtions;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis conditional license pre condtions service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConditionalLicensePreCondtionsUtil
 * @generated
 */
@ProviderType
public interface CannabisConditionalLicensePreCondtionsPersistence
	extends BasePersistence<CannabisConditionalLicensePreCondtions> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisConditionalLicensePreCondtionsUtil} to access the cannabis conditional license pre condtions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cannabis conditional license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CAI(long cannabisApplicationId);

	/**
	 * Returns a range of all the cannabis conditional license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @return the range of matching cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CAI(long cannabisApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CAI(
			long cannabisApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicensePreCondtions> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CAI(
			long cannabisApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicensePreCondtions> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	public CannabisConditionalLicensePreCondtions findBygetCI_CAI_First(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException;

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	public CannabisConditionalLicensePreCondtions fetchBygetCI_CAI_First(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConditionalLicensePreCondtions> orderByComparator);

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	public CannabisConditionalLicensePreCondtions findBygetCI_CAI_Last(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException;

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	public CannabisConditionalLicensePreCondtions fetchBygetCI_CAI_Last(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConditionalLicensePreCondtions> orderByComparator);

	/**
	 * Returns the cannabis conditional license pre condtionses before and after the current cannabis conditional license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis conditional license pre condtions
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	public CannabisConditionalLicensePreCondtions[] findBygetCI_CAI_PrevAndNext(
			long cannabisPreconditionsId, long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException;

	/**
	 * Removes all the cannabis conditional license pre condtionses where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public void removeBygetCI_CAI(long cannabisApplicationId);

	/**
	 * Returns the number of cannabis conditional license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis conditional license pre condtionses
	 */
	public int countBygetCI_CAI(long cannabisApplicationId);

	/**
	 * Returns all the cannabis conditional license pre condtionses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseId(String caseId);

	/**
	 * Returns a range of all the cannabis conditional license pre condtionses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @return the range of matching cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseId(String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseId(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicensePreCondtions> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseId(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicensePreCondtions> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	public CannabisConditionalLicensePreCondtions findBygetCI_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException;

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	public CannabisConditionalLicensePreCondtions fetchBygetCI_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConditionalLicensePreCondtions> orderByComparator);

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	public CannabisConditionalLicensePreCondtions findBygetCI_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException;

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	public CannabisConditionalLicensePreCondtions fetchBygetCI_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConditionalLicensePreCondtions> orderByComparator);

	/**
	 * Returns the cannabis conditional license pre condtionses before and after the current cannabis conditional license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis conditional license pre condtions
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	public CannabisConditionalLicensePreCondtions[]
			findBygetCI_CaseId_PrevAndNext(
				long cannabisPreconditionsId, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisConditionalLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException;

	/**
	 * Removes all the cannabis conditional license pre condtionses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetCI_CaseId(String caseId);

	/**
	 * Returns the number of cannabis conditional license pre condtionses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis conditional license pre condtionses
	 */
	public int countBygetCI_CaseId(String caseId);

	/**
	 * Returns all the cannabis conditional license pre condtionses where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions>
		findBygetCI_Status(String status);

	/**
	 * Returns a range of all the cannabis conditional license pre condtionses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @return the range of matching cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions>
		findBygetCI_Status(String status, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions>
		findBygetCI_Status(
			String status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicensePreCondtions> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions>
		findBygetCI_Status(
			String status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicensePreCondtions> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	public CannabisConditionalLicensePreCondtions findBygetCI_Status_First(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException;

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	public CannabisConditionalLicensePreCondtions fetchBygetCI_Status_First(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConditionalLicensePreCondtions> orderByComparator);

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	public CannabisConditionalLicensePreCondtions findBygetCI_Status_Last(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException;

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	public CannabisConditionalLicensePreCondtions fetchBygetCI_Status_Last(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConditionalLicensePreCondtions> orderByComparator);

	/**
	 * Returns the cannabis conditional license pre condtionses before and after the current cannabis conditional license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis conditional license pre condtions
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	public CannabisConditionalLicensePreCondtions[]
			findBygetCI_Status_PrevAndNext(
				long cannabisPreconditionsId, String status,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisConditionalLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException;

	/**
	 * Removes all the cannabis conditional license pre condtionses where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetCI_Status(String status);

	/**
	 * Returns the number of cannabis conditional license pre condtionses where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching cannabis conditional license pre condtionses
	 */
	public int countBygetCI_Status(String status);

	/**
	 * Returns all the cannabis conditional license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdStatus(String status, String caseId);

	/**
	 * Returns a range of all the cannabis conditional license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @return the range of matching cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdStatus(
			String status, String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdStatus(
			String status, String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicensePreCondtions> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdStatus(
			String status, String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicensePreCondtions> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	public CannabisConditionalLicensePreCondtions
			findBygetCI_CaseIdStatus_First(
				String status, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisConditionalLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException;

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	public CannabisConditionalLicensePreCondtions
		fetchBygetCI_CaseIdStatus_First(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicensePreCondtions> orderByComparator);

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	public CannabisConditionalLicensePreCondtions findBygetCI_CaseIdStatus_Last(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException;

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	public CannabisConditionalLicensePreCondtions
		fetchBygetCI_CaseIdStatus_Last(
			String status, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicensePreCondtions> orderByComparator);

	/**
	 * Returns the cannabis conditional license pre condtionses before and after the current cannabis conditional license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis conditional license pre condtions
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	public CannabisConditionalLicensePreCondtions[]
			findBygetCI_CaseIdStatus_PrevAndNext(
				long cannabisPreconditionsId, String status, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisConditionalLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException;

	/**
	 * Removes all the cannabis conditional license pre condtionses where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public void removeBygetCI_CaseIdStatus(String status, String caseId);

	/**
	 * Returns the number of cannabis conditional license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching cannabis conditional license pre condtionses
	 */
	public int countBygetCI_CaseIdStatus(String status, String caseId);

	/**
	 * Returns all the cannabis conditional license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdApplicationId(
			String status, long cannabisApplicationId);

	/**
	 * Returns a range of all the cannabis conditional license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @return the range of matching cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdApplicationId(
			String status, long cannabisApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdApplicationId(
			String status, long cannabisApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicensePreCondtions> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdApplicationId(
			String status, long cannabisApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicensePreCondtions> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	public CannabisConditionalLicensePreCondtions
			findBygetCI_CaseIdApplicationId_First(
				String status, long cannabisApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisConditionalLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException;

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	public CannabisConditionalLicensePreCondtions
		fetchBygetCI_CaseIdApplicationId_First(
			String status, long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicensePreCondtions> orderByComparator);

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	public CannabisConditionalLicensePreCondtions
			findBygetCI_CaseIdApplicationId_Last(
				String status, long cannabisApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisConditionalLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException;

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	public CannabisConditionalLicensePreCondtions
		fetchBygetCI_CaseIdApplicationId_Last(
			String status, long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisConditionalLicensePreCondtions> orderByComparator);

	/**
	 * Returns the cannabis conditional license pre condtionses before and after the current cannabis conditional license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis conditional license pre condtions
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	public CannabisConditionalLicensePreCondtions[]
			findBygetCI_CaseIdApplicationId_PrevAndNext(
				long cannabisPreconditionsId, String status,
				long cannabisApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisConditionalLicensePreCondtions> orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException;

	/**
	 * Removes all the cannabis conditional license pre condtionses where status = &#63; and cannabisApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public void removeBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId);

	/**
	 * Returns the number of cannabis conditional license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis conditional license pre condtionses
	 */
	public int countBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId);

	/**
	 * Caches the cannabis conditional license pre condtions in the entity cache if it is enabled.
	 *
	 * @param cannabisConditionalLicensePreCondtions the cannabis conditional license pre condtions
	 */
	public void cacheResult(
		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions);

	/**
	 * Caches the cannabis conditional license pre condtionses in the entity cache if it is enabled.
	 *
	 * @param cannabisConditionalLicensePreCondtionses the cannabis conditional license pre condtionses
	 */
	public void cacheResult(
		java.util.List<CannabisConditionalLicensePreCondtions>
			cannabisConditionalLicensePreCondtionses);

	/**
	 * Creates a new cannabis conditional license pre condtions with the primary key. Does not add the cannabis conditional license pre condtions to the database.
	 *
	 * @param cannabisPreconditionsId the primary key for the new cannabis conditional license pre condtions
	 * @return the new cannabis conditional license pre condtions
	 */
	public CannabisConditionalLicensePreCondtions create(
		long cannabisPreconditionsId);

	/**
	 * Removes the cannabis conditional license pre condtions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisPreconditionsId the primary key of the cannabis conditional license pre condtions
	 * @return the cannabis conditional license pre condtions that was removed
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	public CannabisConditionalLicensePreCondtions remove(
			long cannabisPreconditionsId)
		throws NoSuchCannabisConditionalLicensePreCondtionsException;

	public CannabisConditionalLicensePreCondtions updateImpl(
		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions);

	/**
	 * Returns the cannabis conditional license pre condtions with the primary key or throws a <code>NoSuchCannabisConditionalLicensePreCondtionsException</code> if it could not be found.
	 *
	 * @param cannabisPreconditionsId the primary key of the cannabis conditional license pre condtions
	 * @return the cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	public CannabisConditionalLicensePreCondtions findByPrimaryKey(
			long cannabisPreconditionsId)
		throws NoSuchCannabisConditionalLicensePreCondtionsException;

	/**
	 * Returns the cannabis conditional license pre condtions with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisPreconditionsId the primary key of the cannabis conditional license pre condtions
	 * @return the cannabis conditional license pre condtions, or <code>null</code> if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	public CannabisConditionalLicensePreCondtions fetchByPrimaryKey(
		long cannabisPreconditionsId);

	/**
	 * Returns all the cannabis conditional license pre condtionses.
	 *
	 * @return the cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions> findAll();

	/**
	 * Returns a range of all the cannabis conditional license pre condtionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @return the range of cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConditionalLicensePreCondtions> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis conditional license pre condtionses
	 */
	public java.util.List<CannabisConditionalLicensePreCondtions> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisConditionalLicensePreCondtions> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis conditional license pre condtionses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis conditional license pre condtionses.
	 *
	 * @return the number of cannabis conditional license pre condtionses
	 */
	public int countAll();

}