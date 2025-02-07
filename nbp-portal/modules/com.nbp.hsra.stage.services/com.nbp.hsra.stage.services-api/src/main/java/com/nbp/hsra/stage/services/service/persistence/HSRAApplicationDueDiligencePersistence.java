/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.stage.services.exception.NoSuchHSRAApplicationDueDiligenceException;
import com.nbp.hsra.stage.services.model.HSRAApplicationDueDiligence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the hsra application due diligence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HSRAApplicationDueDiligenceUtil
 * @generated
 */
@ProviderType
public interface HSRAApplicationDueDiligencePersistence
	extends BasePersistence<HSRAApplicationDueDiligence> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HSRAApplicationDueDiligenceUtil} to access the hsra application due diligence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the hsra application due diligence where caseId = &#63; or throws a <code>NoSuchHSRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a matching hsra application due diligence could not be found
	 */
	public HSRAApplicationDueDiligence findBygetHSRADD_By_CAI(String caseId)
		throws NoSuchHSRAApplicationDueDiligenceException;

	/**
	 * Returns the hsra application due diligence where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	public HSRAApplicationDueDiligence fetchBygetHSRADD_By_CAI(String caseId);

	/**
	 * Returns the hsra application due diligence where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	public HSRAApplicationDueDiligence fetchBygetHSRADD_By_CAI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the hsra application due diligence where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the hsra application due diligence that was removed
	 */
	public HSRAApplicationDueDiligence removeBygetHSRADD_By_CAI(String caseId)
		throws NoSuchHSRAApplicationDueDiligenceException;

	/**
	 * Returns the number of hsra application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra application due diligences
	 */
	public int countBygetHSRADD_By_CAI(String caseId);

	/**
	 * Returns the hsra application due diligence where hsraApplicationId = &#63; or throws a <code>NoSuchHSRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a matching hsra application due diligence could not be found
	 */
	public HSRAApplicationDueDiligence findBygetHSRADD_CAI(
			long hsraApplicationId)
		throws NoSuchHSRAApplicationDueDiligenceException;

	/**
	 * Returns the hsra application due diligence where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	public HSRAApplicationDueDiligence fetchBygetHSRADD_CAI(
		long hsraApplicationId);

	/**
	 * Returns the hsra application due diligence where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	public HSRAApplicationDueDiligence fetchBygetHSRADD_CAI(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the hsra application due diligence where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the hsra application due diligence that was removed
	 */
	public HSRAApplicationDueDiligence removeBygetHSRADD_CAI(
			long hsraApplicationId)
		throws NoSuchHSRAApplicationDueDiligenceException;

	/**
	 * Returns the number of hsra application due diligences where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra application due diligences
	 */
	public int countBygetHSRADD_CAI(long hsraApplicationId);

	/**
	 * Returns the hsra application due diligence where caseId = &#63; and agencyName = &#63; or throws a <code>NoSuchHSRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a matching hsra application due diligence could not be found
	 */
	public HSRAApplicationDueDiligence findBygetHSRADD_CaseIdAgnecyName(
			String caseId, String agencyName)
		throws NoSuchHSRAApplicationDueDiligenceException;

	/**
	 * Returns the hsra application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	public HSRAApplicationDueDiligence fetchBygetHSRADD_CaseIdAgnecyName(
		String caseId, String agencyName);

	/**
	 * Returns the hsra application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	public HSRAApplicationDueDiligence fetchBygetHSRADD_CaseIdAgnecyName(
		String caseId, String agencyName, boolean useFinderCache);

	/**
	 * Removes the hsra application due diligence where caseId = &#63; and agencyName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the hsra application due diligence that was removed
	 */
	public HSRAApplicationDueDiligence removeBygetHSRADD_CaseIdAgnecyName(
			String caseId, String agencyName)
		throws NoSuchHSRAApplicationDueDiligenceException;

	/**
	 * Returns the number of hsra application due diligences where caseId = &#63; and agencyName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the number of matching hsra application due diligences
	 */
	public int countBygetHSRADD_CaseIdAgnecyName(
		String caseId, String agencyName);

	/**
	 * Returns all the hsra application due diligences where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @return the matching hsra application due diligences
	 */
	public java.util.List<HSRAApplicationDueDiligence>
		findBygetHSRADD_AgnecyName(String agencyName);

	/**
	 * Returns a range of all the hsra application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @return the range of matching hsra application due diligences
	 */
	public java.util.List<HSRAApplicationDueDiligence>
		findBygetHSRADD_AgnecyName(String agencyName, int start, int end);

	/**
	 * Returns an ordered range of all the hsra application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application due diligences
	 */
	public java.util.List<HSRAApplicationDueDiligence>
		findBygetHSRADD_AgnecyName(
			String agencyName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<HSRAApplicationDueDiligence> orderByComparator);

	/**
	 * Returns an ordered range of all the hsra application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application due diligences
	 */
	public java.util.List<HSRAApplicationDueDiligence>
		findBygetHSRADD_AgnecyName(
			String agencyName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<HSRAApplicationDueDiligence> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first hsra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a matching hsra application due diligence could not be found
	 */
	public HSRAApplicationDueDiligence findBygetHSRADD_AgnecyName_First(
			String agencyName,
			com.liferay.portal.kernel.util.OrderByComparator
				<HSRAApplicationDueDiligence> orderByComparator)
		throws NoSuchHSRAApplicationDueDiligenceException;

	/**
	 * Returns the first hsra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	public HSRAApplicationDueDiligence fetchBygetHSRADD_AgnecyName_First(
		String agencyName,
		com.liferay.portal.kernel.util.OrderByComparator
			<HSRAApplicationDueDiligence> orderByComparator);

	/**
	 * Returns the last hsra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a matching hsra application due diligence could not be found
	 */
	public HSRAApplicationDueDiligence findBygetHSRADD_AgnecyName_Last(
			String agencyName,
			com.liferay.portal.kernel.util.OrderByComparator
				<HSRAApplicationDueDiligence> orderByComparator)
		throws NoSuchHSRAApplicationDueDiligenceException;

	/**
	 * Returns the last hsra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	public HSRAApplicationDueDiligence fetchBygetHSRADD_AgnecyName_Last(
		String agencyName,
		com.liferay.portal.kernel.util.OrderByComparator
			<HSRAApplicationDueDiligence> orderByComparator);

	/**
	 * Returns the hsra application due diligences before and after the current hsra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param hsraAppDDId the primary key of the current hsra application due diligence
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a hsra application due diligence with the primary key could not be found
	 */
	public HSRAApplicationDueDiligence[] findBygetHSRADD_AgnecyName_PrevAndNext(
			long hsraAppDDId, String agencyName,
			com.liferay.portal.kernel.util.OrderByComparator
				<HSRAApplicationDueDiligence> orderByComparator)
		throws NoSuchHSRAApplicationDueDiligenceException;

	/**
	 * Removes all the hsra application due diligences where agencyName = &#63; from the database.
	 *
	 * @param agencyName the agency name
	 */
	public void removeBygetHSRADD_AgnecyName(String agencyName);

	/**
	 * Returns the number of hsra application due diligences where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @return the number of matching hsra application due diligences
	 */
	public int countBygetHSRADD_AgnecyName(String agencyName);

	/**
	 * Returns all the hsra application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application due diligences
	 */
	public java.util.List<HSRAApplicationDueDiligence> findBygetPHARMADD_CaseId(
		String caseId);

	/**
	 * Returns a range of all the hsra application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @return the range of matching hsra application due diligences
	 */
	public java.util.List<HSRAApplicationDueDiligence> findBygetPHARMADD_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the hsra application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application due diligences
	 */
	public java.util.List<HSRAApplicationDueDiligence> findBygetPHARMADD_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HSRAApplicationDueDiligence> orderByComparator);

	/**
	 * Returns an ordered range of all the hsra application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application due diligences
	 */
	public java.util.List<HSRAApplicationDueDiligence> findBygetPHARMADD_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HSRAApplicationDueDiligence> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first hsra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a matching hsra application due diligence could not be found
	 */
	public HSRAApplicationDueDiligence findBygetPHARMADD_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HSRAApplicationDueDiligence> orderByComparator)
		throws NoSuchHSRAApplicationDueDiligenceException;

	/**
	 * Returns the first hsra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	public HSRAApplicationDueDiligence fetchBygetPHARMADD_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<HSRAApplicationDueDiligence> orderByComparator);

	/**
	 * Returns the last hsra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a matching hsra application due diligence could not be found
	 */
	public HSRAApplicationDueDiligence findBygetPHARMADD_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HSRAApplicationDueDiligence> orderByComparator)
		throws NoSuchHSRAApplicationDueDiligenceException;

	/**
	 * Returns the last hsra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	public HSRAApplicationDueDiligence fetchBygetPHARMADD_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<HSRAApplicationDueDiligence> orderByComparator);

	/**
	 * Returns the hsra application due diligences before and after the current hsra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param hsraAppDDId the primary key of the current hsra application due diligence
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a hsra application due diligence with the primary key could not be found
	 */
	public HSRAApplicationDueDiligence[] findBygetPHARMADD_CaseId_PrevAndNext(
			long hsraAppDDId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HSRAApplicationDueDiligence> orderByComparator)
		throws NoSuchHSRAApplicationDueDiligenceException;

	/**
	 * Removes all the hsra application due diligences where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetPHARMADD_CaseId(String caseId);

	/**
	 * Returns the number of hsra application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra application due diligences
	 */
	public int countBygetPHARMADD_CaseId(String caseId);

	/**
	 * Caches the hsra application due diligence in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationDueDiligence the hsra application due diligence
	 */
	public void cacheResult(
		HSRAApplicationDueDiligence hsraApplicationDueDiligence);

	/**
	 * Caches the hsra application due diligences in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationDueDiligences the hsra application due diligences
	 */
	public void cacheResult(
		java.util.List<HSRAApplicationDueDiligence>
			hsraApplicationDueDiligences);

	/**
	 * Creates a new hsra application due diligence with the primary key. Does not add the hsra application due diligence to the database.
	 *
	 * @param hsraAppDDId the primary key for the new hsra application due diligence
	 * @return the new hsra application due diligence
	 */
	public HSRAApplicationDueDiligence create(long hsraAppDDId);

	/**
	 * Removes the hsra application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraAppDDId the primary key of the hsra application due diligence
	 * @return the hsra application due diligence that was removed
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a hsra application due diligence with the primary key could not be found
	 */
	public HSRAApplicationDueDiligence remove(long hsraAppDDId)
		throws NoSuchHSRAApplicationDueDiligenceException;

	public HSRAApplicationDueDiligence updateImpl(
		HSRAApplicationDueDiligence hsraApplicationDueDiligence);

	/**
	 * Returns the hsra application due diligence with the primary key or throws a <code>NoSuchHSRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param hsraAppDDId the primary key of the hsra application due diligence
	 * @return the hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a hsra application due diligence with the primary key could not be found
	 */
	public HSRAApplicationDueDiligence findByPrimaryKey(long hsraAppDDId)
		throws NoSuchHSRAApplicationDueDiligenceException;

	/**
	 * Returns the hsra application due diligence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraAppDDId the primary key of the hsra application due diligence
	 * @return the hsra application due diligence, or <code>null</code> if a hsra application due diligence with the primary key could not be found
	 */
	public HSRAApplicationDueDiligence fetchByPrimaryKey(long hsraAppDDId);

	/**
	 * Returns all the hsra application due diligences.
	 *
	 * @return the hsra application due diligences
	 */
	public java.util.List<HSRAApplicationDueDiligence> findAll();

	/**
	 * Returns a range of all the hsra application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @return the range of hsra application due diligences
	 */
	public java.util.List<HSRAApplicationDueDiligence> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the hsra application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra application due diligences
	 */
	public java.util.List<HSRAApplicationDueDiligence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HSRAApplicationDueDiligence> orderByComparator);

	/**
	 * Returns an ordered range of all the hsra application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra application due diligences
	 */
	public java.util.List<HSRAApplicationDueDiligence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HSRAApplicationDueDiligence> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the hsra application due diligences from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of hsra application due diligences.
	 *
	 * @return the number of hsra application due diligences
	 */
	public int countAll();

}