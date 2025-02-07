/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.pharmaceutical.stages.services.exception.NoSuchPharmaApplicationDueDiligenceException;
import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationDueDiligence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the pharma application due diligence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationDueDiligenceUtil
 * @generated
 */
@ProviderType
public interface PharmaApplicationDueDiligencePersistence
	extends BasePersistence<PharmaApplicationDueDiligence> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PharmaApplicationDueDiligenceUtil} to access the pharma application due diligence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the pharma application due diligence where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a matching pharma application due diligence could not be found
	 */
	public PharmaApplicationDueDiligence findBygetPHARMADD_CAI(
			long pharmaApplicationId)
		throws NoSuchPharmaApplicationDueDiligenceException;

	/**
	 * Returns the pharma application due diligence where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	public PharmaApplicationDueDiligence fetchBygetPHARMADD_CAI(
		long pharmaApplicationId);

	/**
	 * Returns the pharma application due diligence where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	public PharmaApplicationDueDiligence fetchBygetPHARMADD_CAI(
		long pharmaApplicationId, boolean useFinderCache);

	/**
	 * Removes the pharma application due diligence where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma application due diligence that was removed
	 */
	public PharmaApplicationDueDiligence removeBygetPHARMADD_CAI(
			long pharmaApplicationId)
		throws NoSuchPharmaApplicationDueDiligenceException;

	/**
	 * Returns the number of pharma application due diligences where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma application due diligences
	 */
	public int countBygetPHARMADD_CAI(long pharmaApplicationId);

	/**
	 * Returns the pharma application due diligence where caseId = &#63; and agencyName = &#63; or throws a <code>NoSuchPharmaApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a matching pharma application due diligence could not be found
	 */
	public PharmaApplicationDueDiligence findBygetPHARMADD_CaseIdAgnecyName(
			String caseId, String agencyName)
		throws NoSuchPharmaApplicationDueDiligenceException;

	/**
	 * Returns the pharma application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	public PharmaApplicationDueDiligence fetchBygetPHARMADD_CaseIdAgnecyName(
		String caseId, String agencyName);

	/**
	 * Returns the pharma application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	public PharmaApplicationDueDiligence fetchBygetPHARMADD_CaseIdAgnecyName(
		String caseId, String agencyName, boolean useFinderCache);

	/**
	 * Removes the pharma application due diligence where caseId = &#63; and agencyName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the pharma application due diligence that was removed
	 */
	public PharmaApplicationDueDiligence removeBygetPHARMADD_CaseIdAgnecyName(
			String caseId, String agencyName)
		throws NoSuchPharmaApplicationDueDiligenceException;

	/**
	 * Returns the number of pharma application due diligences where caseId = &#63; and agencyName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the number of matching pharma application due diligences
	 */
	public int countBygetPHARMADD_CaseIdAgnecyName(
		String caseId, String agencyName);

	/**
	 * Returns all the pharma application due diligences where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @return the matching pharma application due diligences
	 */
	public java.util.List<PharmaApplicationDueDiligence>
		findBygetPHARMADD_AgnecyName(String agencyName);

	/**
	 * Returns a range of all the pharma application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @return the range of matching pharma application due diligences
	 */
	public java.util.List<PharmaApplicationDueDiligence>
		findBygetPHARMADD_AgnecyName(String agencyName, int start, int end);

	/**
	 * Returns an ordered range of all the pharma application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma application due diligences
	 */
	public java.util.List<PharmaApplicationDueDiligence>
		findBygetPHARMADD_AgnecyName(
			String agencyName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationDueDiligence> orderByComparator);

	/**
	 * Returns an ordered range of all the pharma application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma application due diligences
	 */
	public java.util.List<PharmaApplicationDueDiligence>
		findBygetPHARMADD_AgnecyName(
			String agencyName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationDueDiligence> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first pharma application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a matching pharma application due diligence could not be found
	 */
	public PharmaApplicationDueDiligence findBygetPHARMADD_AgnecyName_First(
			String agencyName,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationDueDiligence> orderByComparator)
		throws NoSuchPharmaApplicationDueDiligenceException;

	/**
	 * Returns the first pharma application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	public PharmaApplicationDueDiligence fetchBygetPHARMADD_AgnecyName_First(
		String agencyName,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationDueDiligence> orderByComparator);

	/**
	 * Returns the last pharma application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a matching pharma application due diligence could not be found
	 */
	public PharmaApplicationDueDiligence findBygetPHARMADD_AgnecyName_Last(
			String agencyName,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationDueDiligence> orderByComparator)
		throws NoSuchPharmaApplicationDueDiligenceException;

	/**
	 * Returns the last pharma application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	public PharmaApplicationDueDiligence fetchBygetPHARMADD_AgnecyName_Last(
		String agencyName,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationDueDiligence> orderByComparator);

	/**
	 * Returns the pharma application due diligences before and after the current pharma application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param pharmaAppDDId the primary key of the current pharma application due diligence
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a pharma application due diligence with the primary key could not be found
	 */
	public PharmaApplicationDueDiligence[]
			findBygetPHARMADD_AgnecyName_PrevAndNext(
				long pharmaAppDDId, String agencyName,
				com.liferay.portal.kernel.util.OrderByComparator
					<PharmaApplicationDueDiligence> orderByComparator)
		throws NoSuchPharmaApplicationDueDiligenceException;

	/**
	 * Removes all the pharma application due diligences where agencyName = &#63; from the database.
	 *
	 * @param agencyName the agency name
	 */
	public void removeBygetPHARMADD_AgnecyName(String agencyName);

	/**
	 * Returns the number of pharma application due diligences where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @return the number of matching pharma application due diligences
	 */
	public int countBygetPHARMADD_AgnecyName(String agencyName);

	/**
	 * Returns all the pharma application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma application due diligences
	 */
	public java.util.List<PharmaApplicationDueDiligence>
		findBygetPHARMADD_CaseId(String caseId);

	/**
	 * Returns a range of all the pharma application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @return the range of matching pharma application due diligences
	 */
	public java.util.List<PharmaApplicationDueDiligence>
		findBygetPHARMADD_CaseId(String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the pharma application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma application due diligences
	 */
	public java.util.List<PharmaApplicationDueDiligence>
		findBygetPHARMADD_CaseId(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationDueDiligence> orderByComparator);

	/**
	 * Returns an ordered range of all the pharma application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma application due diligences
	 */
	public java.util.List<PharmaApplicationDueDiligence>
		findBygetPHARMADD_CaseId(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationDueDiligence> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first pharma application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a matching pharma application due diligence could not be found
	 */
	public PharmaApplicationDueDiligence findBygetPHARMADD_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationDueDiligence> orderByComparator)
		throws NoSuchPharmaApplicationDueDiligenceException;

	/**
	 * Returns the first pharma application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	public PharmaApplicationDueDiligence fetchBygetPHARMADD_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationDueDiligence> orderByComparator);

	/**
	 * Returns the last pharma application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a matching pharma application due diligence could not be found
	 */
	public PharmaApplicationDueDiligence findBygetPHARMADD_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationDueDiligence> orderByComparator)
		throws NoSuchPharmaApplicationDueDiligenceException;

	/**
	 * Returns the last pharma application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	public PharmaApplicationDueDiligence fetchBygetPHARMADD_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationDueDiligence> orderByComparator);

	/**
	 * Returns the pharma application due diligences before and after the current pharma application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param pharmaAppDDId the primary key of the current pharma application due diligence
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a pharma application due diligence with the primary key could not be found
	 */
	public PharmaApplicationDueDiligence[] findBygetPHARMADD_CaseId_PrevAndNext(
			long pharmaAppDDId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationDueDiligence> orderByComparator)
		throws NoSuchPharmaApplicationDueDiligenceException;

	/**
	 * Removes all the pharma application due diligences where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetPHARMADD_CaseId(String caseId);

	/**
	 * Returns the number of pharma application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching pharma application due diligences
	 */
	public int countBygetPHARMADD_CaseId(String caseId);

	/**
	 * Caches the pharma application due diligence in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationDueDiligence the pharma application due diligence
	 */
	public void cacheResult(
		PharmaApplicationDueDiligence pharmaApplicationDueDiligence);

	/**
	 * Caches the pharma application due diligences in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationDueDiligences the pharma application due diligences
	 */
	public void cacheResult(
		java.util.List<PharmaApplicationDueDiligence>
			pharmaApplicationDueDiligences);

	/**
	 * Creates a new pharma application due diligence with the primary key. Does not add the pharma application due diligence to the database.
	 *
	 * @param pharmaAppDDId the primary key for the new pharma application due diligence
	 * @return the new pharma application due diligence
	 */
	public PharmaApplicationDueDiligence create(long pharmaAppDDId);

	/**
	 * Removes the pharma application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaAppDDId the primary key of the pharma application due diligence
	 * @return the pharma application due diligence that was removed
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a pharma application due diligence with the primary key could not be found
	 */
	public PharmaApplicationDueDiligence remove(long pharmaAppDDId)
		throws NoSuchPharmaApplicationDueDiligenceException;

	public PharmaApplicationDueDiligence updateImpl(
		PharmaApplicationDueDiligence pharmaApplicationDueDiligence);

	/**
	 * Returns the pharma application due diligence with the primary key or throws a <code>NoSuchPharmaApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param pharmaAppDDId the primary key of the pharma application due diligence
	 * @return the pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a pharma application due diligence with the primary key could not be found
	 */
	public PharmaApplicationDueDiligence findByPrimaryKey(long pharmaAppDDId)
		throws NoSuchPharmaApplicationDueDiligenceException;

	/**
	 * Returns the pharma application due diligence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaAppDDId the primary key of the pharma application due diligence
	 * @return the pharma application due diligence, or <code>null</code> if a pharma application due diligence with the primary key could not be found
	 */
	public PharmaApplicationDueDiligence fetchByPrimaryKey(long pharmaAppDDId);

	/**
	 * Returns all the pharma application due diligences.
	 *
	 * @return the pharma application due diligences
	 */
	public java.util.List<PharmaApplicationDueDiligence> findAll();

	/**
	 * Returns a range of all the pharma application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @return the range of pharma application due diligences
	 */
	public java.util.List<PharmaApplicationDueDiligence> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the pharma application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma application due diligences
	 */
	public java.util.List<PharmaApplicationDueDiligence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationDueDiligence> orderByComparator);

	/**
	 * Returns an ordered range of all the pharma application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma application due diligences
	 */
	public java.util.List<PharmaApplicationDueDiligence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationDueDiligence> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the pharma application due diligences from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of pharma application due diligences.
	 *
	 * @return the number of pharma application due diligences
	 */
	public int countAll();

}