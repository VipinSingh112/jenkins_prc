/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.wra.stage.service.exception.NoSuchWRAApplicationDueDiligenceException;
import com.nbp.wra.stage.service.model.WRAApplicationDueDiligence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the wra application due diligence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WRAApplicationDueDiligenceUtil
 * @generated
 */
@ProviderType
public interface WRAApplicationDueDiligencePersistence
	extends BasePersistence<WRAApplicationDueDiligence> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WRAApplicationDueDiligenceUtil} to access the wra application due diligence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the wra application due diligence where caseId = &#63; or throws a <code>NoSuchWRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a matching wra application due diligence could not be found
	 */
	public WRAApplicationDueDiligence findBygetWRADD_By_CAI(String caseId)
		throws NoSuchWRAApplicationDueDiligenceException;

	/**
	 * Returns the wra application due diligence where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	public WRAApplicationDueDiligence fetchBygetWRADD_By_CAI(String caseId);

	/**
	 * Returns the wra application due diligence where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	public WRAApplicationDueDiligence fetchBygetWRADD_By_CAI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the wra application due diligence where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the wra application due diligence that was removed
	 */
	public WRAApplicationDueDiligence removeBygetWRADD_By_CAI(String caseId)
		throws NoSuchWRAApplicationDueDiligenceException;

	/**
	 * Returns the number of wra application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra application due diligences
	 */
	public int countBygetWRADD_By_CAI(String caseId);

	/**
	 * Returns the wra application due diligence where wraApplicationId = &#63; or throws a <code>NoSuchWRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a matching wra application due diligence could not be found
	 */
	public WRAApplicationDueDiligence findBygetWRAADD_CAI(long wraApplicationId)
		throws NoSuchWRAApplicationDueDiligenceException;

	/**
	 * Returns the wra application due diligence where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	public WRAApplicationDueDiligence fetchBygetWRAADD_CAI(
		long wraApplicationId);

	/**
	 * Returns the wra application due diligence where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	public WRAApplicationDueDiligence fetchBygetWRAADD_CAI(
		long wraApplicationId, boolean useFinderCache);

	/**
	 * Removes the wra application due diligence where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the wra application due diligence that was removed
	 */
	public WRAApplicationDueDiligence removeBygetWRAADD_CAI(
			long wraApplicationId)
		throws NoSuchWRAApplicationDueDiligenceException;

	/**
	 * Returns the number of wra application due diligences where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra application due diligences
	 */
	public int countBygetWRAADD_CAI(long wraApplicationId);

	/**
	 * Returns the wra application due diligence where caseId = &#63; and agencyName = &#63; or throws a <code>NoSuchWRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a matching wra application due diligence could not be found
	 */
	public WRAApplicationDueDiligence findBygetWRAADD_CaseIdAgnecyName(
			String caseId, String agencyName)
		throws NoSuchWRAApplicationDueDiligenceException;

	/**
	 * Returns the wra application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	public WRAApplicationDueDiligence fetchBygetWRAADD_CaseIdAgnecyName(
		String caseId, String agencyName);

	/**
	 * Returns the wra application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	public WRAApplicationDueDiligence fetchBygetWRAADD_CaseIdAgnecyName(
		String caseId, String agencyName, boolean useFinderCache);

	/**
	 * Removes the wra application due diligence where caseId = &#63; and agencyName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the wra application due diligence that was removed
	 */
	public WRAApplicationDueDiligence removeBygetWRAADD_CaseIdAgnecyName(
			String caseId, String agencyName)
		throws NoSuchWRAApplicationDueDiligenceException;

	/**
	 * Returns the number of wra application due diligences where caseId = &#63; and agencyName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the number of matching wra application due diligences
	 */
	public int countBygetWRAADD_CaseIdAgnecyName(
		String caseId, String agencyName);

	/**
	 * Returns all the wra application due diligences where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @return the matching wra application due diligences
	 */
	public java.util.List<WRAApplicationDueDiligence> findBygetWRADD_AgnecyName(
		String agencyName);

	/**
	 * Returns a range of all the wra application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @return the range of matching wra application due diligences
	 */
	public java.util.List<WRAApplicationDueDiligence> findBygetWRADD_AgnecyName(
		String agencyName, int start, int end);

	/**
	 * Returns an ordered range of all the wra application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra application due diligences
	 */
	public java.util.List<WRAApplicationDueDiligence> findBygetWRADD_AgnecyName(
		String agencyName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<WRAApplicationDueDiligence> orderByComparator);

	/**
	 * Returns an ordered range of all the wra application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra application due diligences
	 */
	public java.util.List<WRAApplicationDueDiligence> findBygetWRADD_AgnecyName(
		String agencyName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<WRAApplicationDueDiligence> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first wra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a matching wra application due diligence could not be found
	 */
	public WRAApplicationDueDiligence findBygetWRADD_AgnecyName_First(
			String agencyName,
			com.liferay.portal.kernel.util.OrderByComparator
				<WRAApplicationDueDiligence> orderByComparator)
		throws NoSuchWRAApplicationDueDiligenceException;

	/**
	 * Returns the first wra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	public WRAApplicationDueDiligence fetchBygetWRADD_AgnecyName_First(
		String agencyName,
		com.liferay.portal.kernel.util.OrderByComparator
			<WRAApplicationDueDiligence> orderByComparator);

	/**
	 * Returns the last wra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a matching wra application due diligence could not be found
	 */
	public WRAApplicationDueDiligence findBygetWRADD_AgnecyName_Last(
			String agencyName,
			com.liferay.portal.kernel.util.OrderByComparator
				<WRAApplicationDueDiligence> orderByComparator)
		throws NoSuchWRAApplicationDueDiligenceException;

	/**
	 * Returns the last wra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	public WRAApplicationDueDiligence fetchBygetWRADD_AgnecyName_Last(
		String agencyName,
		com.liferay.portal.kernel.util.OrderByComparator
			<WRAApplicationDueDiligence> orderByComparator);

	/**
	 * Returns the wra application due diligences before and after the current wra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param wRAApplicationDueDiligenceId the primary key of the current wra application due diligence
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a wra application due diligence with the primary key could not be found
	 */
	public WRAApplicationDueDiligence[] findBygetWRADD_AgnecyName_PrevAndNext(
			long wRAApplicationDueDiligenceId, String agencyName,
			com.liferay.portal.kernel.util.OrderByComparator
				<WRAApplicationDueDiligence> orderByComparator)
		throws NoSuchWRAApplicationDueDiligenceException;

	/**
	 * Removes all the wra application due diligences where agencyName = &#63; from the database.
	 *
	 * @param agencyName the agency name
	 */
	public void removeBygetWRADD_AgnecyName(String agencyName);

	/**
	 * Returns the number of wra application due diligences where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @return the number of matching wra application due diligences
	 */
	public int countBygetWRADD_AgnecyName(String agencyName);

	/**
	 * Returns all the wra application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application due diligences
	 */
	public java.util.List<WRAApplicationDueDiligence> findBygetWRADD_CaseId(
		String caseId);

	/**
	 * Returns a range of all the wra application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @return the range of matching wra application due diligences
	 */
	public java.util.List<WRAApplicationDueDiligence> findBygetWRADD_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the wra application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra application due diligences
	 */
	public java.util.List<WRAApplicationDueDiligence> findBygetWRADD_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<WRAApplicationDueDiligence> orderByComparator);

	/**
	 * Returns an ordered range of all the wra application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra application due diligences
	 */
	public java.util.List<WRAApplicationDueDiligence> findBygetWRADD_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<WRAApplicationDueDiligence> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first wra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a matching wra application due diligence could not be found
	 */
	public WRAApplicationDueDiligence findBygetWRADD_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<WRAApplicationDueDiligence> orderByComparator)
		throws NoSuchWRAApplicationDueDiligenceException;

	/**
	 * Returns the first wra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	public WRAApplicationDueDiligence fetchBygetWRADD_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<WRAApplicationDueDiligence> orderByComparator);

	/**
	 * Returns the last wra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a matching wra application due diligence could not be found
	 */
	public WRAApplicationDueDiligence findBygetWRADD_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<WRAApplicationDueDiligence> orderByComparator)
		throws NoSuchWRAApplicationDueDiligenceException;

	/**
	 * Returns the last wra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	public WRAApplicationDueDiligence fetchBygetWRADD_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<WRAApplicationDueDiligence> orderByComparator);

	/**
	 * Returns the wra application due diligences before and after the current wra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param wRAApplicationDueDiligenceId the primary key of the current wra application due diligence
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a wra application due diligence with the primary key could not be found
	 */
	public WRAApplicationDueDiligence[] findBygetWRADD_CaseId_PrevAndNext(
			long wRAApplicationDueDiligenceId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<WRAApplicationDueDiligence> orderByComparator)
		throws NoSuchWRAApplicationDueDiligenceException;

	/**
	 * Removes all the wra application due diligences where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetWRADD_CaseId(String caseId);

	/**
	 * Returns the number of wra application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra application due diligences
	 */
	public int countBygetWRADD_CaseId(String caseId);

	/**
	 * Caches the wra application due diligence in the entity cache if it is enabled.
	 *
	 * @param wraApplicationDueDiligence the wra application due diligence
	 */
	public void cacheResult(
		WRAApplicationDueDiligence wraApplicationDueDiligence);

	/**
	 * Caches the wra application due diligences in the entity cache if it is enabled.
	 *
	 * @param wraApplicationDueDiligences the wra application due diligences
	 */
	public void cacheResult(
		java.util.List<WRAApplicationDueDiligence> wraApplicationDueDiligences);

	/**
	 * Creates a new wra application due diligence with the primary key. Does not add the wra application due diligence to the database.
	 *
	 * @param wRAApplicationDueDiligenceId the primary key for the new wra application due diligence
	 * @return the new wra application due diligence
	 */
	public WRAApplicationDueDiligence create(long wRAApplicationDueDiligenceId);

	/**
	 * Removes the wra application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wRAApplicationDueDiligenceId the primary key of the wra application due diligence
	 * @return the wra application due diligence that was removed
	 * @throws NoSuchWRAApplicationDueDiligenceException if a wra application due diligence with the primary key could not be found
	 */
	public WRAApplicationDueDiligence remove(long wRAApplicationDueDiligenceId)
		throws NoSuchWRAApplicationDueDiligenceException;

	public WRAApplicationDueDiligence updateImpl(
		WRAApplicationDueDiligence wraApplicationDueDiligence);

	/**
	 * Returns the wra application due diligence with the primary key or throws a <code>NoSuchWRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param wRAApplicationDueDiligenceId the primary key of the wra application due diligence
	 * @return the wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a wra application due diligence with the primary key could not be found
	 */
	public WRAApplicationDueDiligence findByPrimaryKey(
			long wRAApplicationDueDiligenceId)
		throws NoSuchWRAApplicationDueDiligenceException;

	/**
	 * Returns the wra application due diligence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wRAApplicationDueDiligenceId the primary key of the wra application due diligence
	 * @return the wra application due diligence, or <code>null</code> if a wra application due diligence with the primary key could not be found
	 */
	public WRAApplicationDueDiligence fetchByPrimaryKey(
		long wRAApplicationDueDiligenceId);

	/**
	 * Returns all the wra application due diligences.
	 *
	 * @return the wra application due diligences
	 */
	public java.util.List<WRAApplicationDueDiligence> findAll();

	/**
	 * Returns a range of all the wra application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @return the range of wra application due diligences
	 */
	public java.util.List<WRAApplicationDueDiligence> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the wra application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra application due diligences
	 */
	public java.util.List<WRAApplicationDueDiligence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<WRAApplicationDueDiligence> orderByComparator);

	/**
	 * Returns an ordered range of all the wra application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra application due diligences
	 */
	public java.util.List<WRAApplicationDueDiligence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<WRAApplicationDueDiligence> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the wra application due diligences from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of wra application due diligences.
	 *
	 * @return the number of wra application due diligences
	 */
	public int countAll();

}