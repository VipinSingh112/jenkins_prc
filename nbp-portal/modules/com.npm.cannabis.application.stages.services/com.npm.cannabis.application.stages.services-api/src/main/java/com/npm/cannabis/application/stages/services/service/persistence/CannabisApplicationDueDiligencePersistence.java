/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisApplicationDueDiligenceException;
import com.npm.cannabis.application.stages.services.model.CannabisApplicationDueDiligence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis application due diligence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationDueDiligenceUtil
 * @generated
 */
@ProviderType
public interface CannabisApplicationDueDiligencePersistence
	extends BasePersistence<CannabisApplicationDueDiligence> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisApplicationDueDiligenceUtil} to access the cannabis application due diligence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the cannabis application due diligence where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a matching cannabis application due diligence could not be found
	 */
	public CannabisApplicationDueDiligence findBygetCADD_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationDueDiligenceException;

	/**
	 * Returns the cannabis application due diligence where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	public CannabisApplicationDueDiligence fetchBygetCADD_CAI(
		long cannabisApplicationId);

	/**
	 * Returns the cannabis application due diligence where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	public CannabisApplicationDueDiligence fetchBygetCADD_CAI(
		long cannabisApplicationId, boolean useFinderCache);

	/**
	 * Removes the cannabis application due diligence where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis application due diligence that was removed
	 */
	public CannabisApplicationDueDiligence removeBygetCADD_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationDueDiligenceException;

	/**
	 * Returns the number of cannabis application due diligences where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis application due diligences
	 */
	public int countBygetCADD_CAI(long cannabisApplicationId);

	/**
	 * Returns the cannabis application due diligence where caseId = &#63; and agencyName = &#63; or throws a <code>NoSuchCannabisApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a matching cannabis application due diligence could not be found
	 */
	public CannabisApplicationDueDiligence findBygetCADD_CaseIdAgnecyName(
			String caseId, String agencyName)
		throws NoSuchCannabisApplicationDueDiligenceException;

	/**
	 * Returns the cannabis application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	public CannabisApplicationDueDiligence fetchBygetCADD_CaseIdAgnecyName(
		String caseId, String agencyName);

	/**
	 * Returns the cannabis application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	public CannabisApplicationDueDiligence fetchBygetCADD_CaseIdAgnecyName(
		String caseId, String agencyName, boolean useFinderCache);

	/**
	 * Removes the cannabis application due diligence where caseId = &#63; and agencyName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the cannabis application due diligence that was removed
	 */
	public CannabisApplicationDueDiligence removeBygetCADD_CaseIdAgnecyName(
			String caseId, String agencyName)
		throws NoSuchCannabisApplicationDueDiligenceException;

	/**
	 * Returns the number of cannabis application due diligences where caseId = &#63; and agencyName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the number of matching cannabis application due diligences
	 */
	public int countBygetCADD_CaseIdAgnecyName(
		String caseId, String agencyName);

	/**
	 * Returns all the cannabis application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis application due diligences
	 */
	public java.util.List<CannabisApplicationDueDiligence> findBygetCADD_CaseId(
		String caseId);

	/**
	 * Returns a range of all the cannabis application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @return the range of matching cannabis application due diligences
	 */
	public java.util.List<CannabisApplicationDueDiligence> findBygetCADD_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application due diligences
	 */
	public java.util.List<CannabisApplicationDueDiligence> findBygetCADD_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationDueDiligence> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application due diligences
	 */
	public java.util.List<CannabisApplicationDueDiligence> findBygetCADD_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationDueDiligence> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a matching cannabis application due diligence could not be found
	 */
	public CannabisApplicationDueDiligence findBygetCADD_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationDueDiligence> orderByComparator)
		throws NoSuchCannabisApplicationDueDiligenceException;

	/**
	 * Returns the first cannabis application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	public CannabisApplicationDueDiligence fetchBygetCADD_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationDueDiligence> orderByComparator);

	/**
	 * Returns the last cannabis application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a matching cannabis application due diligence could not be found
	 */
	public CannabisApplicationDueDiligence findBygetCADD_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationDueDiligence> orderByComparator)
		throws NoSuchCannabisApplicationDueDiligenceException;

	/**
	 * Returns the last cannabis application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	public CannabisApplicationDueDiligence fetchBygetCADD_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationDueDiligence> orderByComparator);

	/**
	 * Returns the cannabis application due diligences before and after the current cannabis application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisAppDDId the primary key of the current cannabis application due diligence
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a cannabis application due diligence with the primary key could not be found
	 */
	public CannabisApplicationDueDiligence[] findBygetCADD_CaseId_PrevAndNext(
			long cannabisAppDDId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationDueDiligence> orderByComparator)
		throws NoSuchCannabisApplicationDueDiligenceException;

	/**
	 * Removes all the cannabis application due diligences where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetCADD_CaseId(String caseId);

	/**
	 * Returns the number of cannabis application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis application due diligences
	 */
	public int countBygetCADD_CaseId(String caseId);

	/**
	 * Returns all the cannabis application due diligences where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching cannabis application due diligences
	 */
	public java.util.List<CannabisApplicationDueDiligence> findBygetCADD_Status(
		String status);

	/**
	 * Returns a range of all the cannabis application due diligences where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @return the range of matching cannabis application due diligences
	 */
	public java.util.List<CannabisApplicationDueDiligence> findBygetCADD_Status(
		String status, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application due diligences where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application due diligences
	 */
	public java.util.List<CannabisApplicationDueDiligence> findBygetCADD_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationDueDiligence> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application due diligences where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application due diligences
	 */
	public java.util.List<CannabisApplicationDueDiligence> findBygetCADD_Status(
		String status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationDueDiligence> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis application due diligence in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a matching cannabis application due diligence could not be found
	 */
	public CannabisApplicationDueDiligence findBygetCADD_Status_First(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationDueDiligence> orderByComparator)
		throws NoSuchCannabisApplicationDueDiligenceException;

	/**
	 * Returns the first cannabis application due diligence in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	public CannabisApplicationDueDiligence fetchBygetCADD_Status_First(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationDueDiligence> orderByComparator);

	/**
	 * Returns the last cannabis application due diligence in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a matching cannabis application due diligence could not be found
	 */
	public CannabisApplicationDueDiligence findBygetCADD_Status_Last(
			String status,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationDueDiligence> orderByComparator)
		throws NoSuchCannabisApplicationDueDiligenceException;

	/**
	 * Returns the last cannabis application due diligence in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	public CannabisApplicationDueDiligence fetchBygetCADD_Status_Last(
		String status,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationDueDiligence> orderByComparator);

	/**
	 * Returns the cannabis application due diligences before and after the current cannabis application due diligence in the ordered set where status = &#63;.
	 *
	 * @param cannabisAppDDId the primary key of the current cannabis application due diligence
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a cannabis application due diligence with the primary key could not be found
	 */
	public CannabisApplicationDueDiligence[] findBygetCADD_Status_PrevAndNext(
			long cannabisAppDDId, String status,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationDueDiligence> orderByComparator)
		throws NoSuchCannabisApplicationDueDiligenceException;

	/**
	 * Removes all the cannabis application due diligences where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetCADD_Status(String status);

	/**
	 * Returns the number of cannabis application due diligences where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching cannabis application due diligences
	 */
	public int countBygetCADD_Status(String status);

	/**
	 * Caches the cannabis application due diligence in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationDueDiligence the cannabis application due diligence
	 */
	public void cacheResult(
		CannabisApplicationDueDiligence cannabisApplicationDueDiligence);

	/**
	 * Caches the cannabis application due diligences in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationDueDiligences the cannabis application due diligences
	 */
	public void cacheResult(
		java.util.List<CannabisApplicationDueDiligence>
			cannabisApplicationDueDiligences);

	/**
	 * Creates a new cannabis application due diligence with the primary key. Does not add the cannabis application due diligence to the database.
	 *
	 * @param cannabisAppDDId the primary key for the new cannabis application due diligence
	 * @return the new cannabis application due diligence
	 */
	public CannabisApplicationDueDiligence create(long cannabisAppDDId);

	/**
	 * Removes the cannabis application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisAppDDId the primary key of the cannabis application due diligence
	 * @return the cannabis application due diligence that was removed
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a cannabis application due diligence with the primary key could not be found
	 */
	public CannabisApplicationDueDiligence remove(long cannabisAppDDId)
		throws NoSuchCannabisApplicationDueDiligenceException;

	public CannabisApplicationDueDiligence updateImpl(
		CannabisApplicationDueDiligence cannabisApplicationDueDiligence);

	/**
	 * Returns the cannabis application due diligence with the primary key or throws a <code>NoSuchCannabisApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param cannabisAppDDId the primary key of the cannabis application due diligence
	 * @return the cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a cannabis application due diligence with the primary key could not be found
	 */
	public CannabisApplicationDueDiligence findByPrimaryKey(
			long cannabisAppDDId)
		throws NoSuchCannabisApplicationDueDiligenceException;

	/**
	 * Returns the cannabis application due diligence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisAppDDId the primary key of the cannabis application due diligence
	 * @return the cannabis application due diligence, or <code>null</code> if a cannabis application due diligence with the primary key could not be found
	 */
	public CannabisApplicationDueDiligence fetchByPrimaryKey(
		long cannabisAppDDId);

	/**
	 * Returns all the cannabis application due diligences.
	 *
	 * @return the cannabis application due diligences
	 */
	public java.util.List<CannabisApplicationDueDiligence> findAll();

	/**
	 * Returns a range of all the cannabis application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @return the range of cannabis application due diligences
	 */
	public java.util.List<CannabisApplicationDueDiligence> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application due diligences
	 */
	public java.util.List<CannabisApplicationDueDiligence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationDueDiligence> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application due diligences
	 */
	public java.util.List<CannabisApplicationDueDiligence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationDueDiligence> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis application due diligences from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis application due diligences.
	 *
	 * @return the number of cannabis application due diligences
	 */
	public int countAll();

}