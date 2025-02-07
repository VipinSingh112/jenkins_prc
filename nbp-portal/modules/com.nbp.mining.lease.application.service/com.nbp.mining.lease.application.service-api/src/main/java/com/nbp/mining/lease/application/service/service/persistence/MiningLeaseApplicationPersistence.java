/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.mining.lease.application.service.exception.NoSuchMiningLeaseApplicationException;
import com.nbp.mining.lease.application.service.model.MiningLeaseApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the mining lease application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningLeaseApplicationUtil
 * @generated
 */
@ProviderType
public interface MiningLeaseApplicationPersistence
	extends BasePersistence<MiningLeaseApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiningLeaseApplicationUtil} to access the mining lease application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the mining lease applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching mining lease applications
	 */
	public java.util.List<MiningLeaseApplication> findBygetMiningByS_U(
		long userId, int status);

	/**
	 * Returns a range of all the mining lease applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @return the range of matching mining lease applications
	 */
	public java.util.List<MiningLeaseApplication> findBygetMiningByS_U(
		long userId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the mining lease applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining lease applications
	 */
	public java.util.List<MiningLeaseApplication> findBygetMiningByS_U(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiningLeaseApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the mining lease applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining lease applications
	 */
	public java.util.List<MiningLeaseApplication> findBygetMiningByS_U(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiningLeaseApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first mining lease application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication findBygetMiningByS_U_First(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Returns the first mining lease application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication fetchBygetMiningByS_U_First(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<MiningLeaseApplication>
			orderByComparator);

	/**
	 * Returns the last mining lease application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication findBygetMiningByS_U_Last(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Returns the last mining lease application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication fetchBygetMiningByS_U_Last(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<MiningLeaseApplication>
			orderByComparator);

	/**
	 * Returns the mining lease applications before and after the current mining lease application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param miningLeaseApplicationId the primary key of the current mining lease application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a mining lease application with the primary key could not be found
	 */
	public MiningLeaseApplication[] findBygetMiningByS_U_PrevAndNext(
			long miningLeaseApplicationId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Removes all the mining lease applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeBygetMiningByS_U(long userId, int status);

	/**
	 * Returns the number of mining lease applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching mining lease applications
	 */
	public int countBygetMiningByS_U(long userId, int status);

	/**
	 * Returns all the mining lease applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching mining lease applications
	 */
	public java.util.List<MiningLeaseApplication> findBygetMiningByStatus(
		int status);

	/**
	 * Returns a range of all the mining lease applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @return the range of matching mining lease applications
	 */
	public java.util.List<MiningLeaseApplication> findBygetMiningByStatus(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the mining lease applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining lease applications
	 */
	public java.util.List<MiningLeaseApplication> findBygetMiningByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiningLeaseApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the mining lease applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining lease applications
	 */
	public java.util.List<MiningLeaseApplication> findBygetMiningByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiningLeaseApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first mining lease application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication findBygetMiningByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Returns the first mining lease application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication fetchBygetMiningByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<MiningLeaseApplication>
			orderByComparator);

	/**
	 * Returns the last mining lease application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication findBygetMiningByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Returns the last mining lease application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication fetchBygetMiningByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<MiningLeaseApplication>
			orderByComparator);

	/**
	 * Returns the mining lease applications before and after the current mining lease application in the ordered set where status = &#63;.
	 *
	 * @param miningLeaseApplicationId the primary key of the current mining lease application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a mining lease application with the primary key could not be found
	 */
	public MiningLeaseApplication[] findBygetMiningByStatus_PrevAndNext(
			long miningLeaseApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Removes all the mining lease applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetMiningByStatus(int status);

	/**
	 * Returns the number of mining lease applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching mining lease applications
	 */
	public int countBygetMiningByStatus(int status);

	/**
	 * Returns the mining lease application where applicationNumber = &#63; or throws a <code>NoSuchMiningLeaseApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication findBygetMiningByAppNum(
			String applicationNumber)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Returns the mining lease application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication fetchBygetMiningByAppNum(
		String applicationNumber);

	/**
	 * Returns the mining lease application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication fetchBygetMiningByAppNum(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the mining lease application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the mining lease application that was removed
	 */
	public MiningLeaseApplication removeBygetMiningByAppNum(
			String applicationNumber)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Returns the number of mining lease applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching mining lease applications
	 */
	public int countBygetMiningByAppNum(String applicationNumber);

	/**
	 * Returns the mining lease application where caseId = &#63; or throws a <code>NoSuchMiningLeaseApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication findBygetMiningByCaseId(String caseId)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Returns the mining lease application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication fetchBygetMiningByCaseId(String caseId);

	/**
	 * Returns the mining lease application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication fetchBygetMiningByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the mining lease application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the mining lease application that was removed
	 */
	public MiningLeaseApplication removeBygetMiningByCaseId(String caseId)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Returns the number of mining lease applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining lease applications
	 */
	public int countBygetMiningByCaseId(String caseId);

	/**
	 * Returns the mining lease application where applicationNumber = &#63; and prospRightsNum = &#63; or throws a <code>NoSuchMiningLeaseApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @param prospRightsNum the prosp rights num
	 * @return the matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication
			findBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
				String applicationNumber, String prospRightsNum)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Returns the mining lease application where applicationNumber = &#63; and prospRightsNum = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param prospRightsNum the prosp rights num
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication
		fetchBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
			String applicationNumber, String prospRightsNum);

	/**
	 * Returns the mining lease application where applicationNumber = &#63; and prospRightsNum = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param prospRightsNum the prosp rights num
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication
		fetchBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
			String applicationNumber, String prospRightsNum,
			boolean useFinderCache);

	/**
	 * Removes the mining lease application where applicationNumber = &#63; and prospRightsNum = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @param prospRightsNum the prosp rights num
	 * @return the mining lease application that was removed
	 */
	public MiningLeaseApplication
			removeBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
				String applicationNumber, String prospRightsNum)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Returns the number of mining lease applications where applicationNumber = &#63; and prospRightsNum = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @param prospRightsNum the prosp rights num
	 * @return the number of matching mining lease applications
	 */
	public int
		countBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
			String applicationNumber, String prospRightsNum);

	/**
	 * Returns all the mining lease applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching mining lease applications
	 */
	public java.util.List<MiningLeaseApplication> findBygetMiningByEntityId(
		String entityId);

	/**
	 * Returns a range of all the mining lease applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @return the range of matching mining lease applications
	 */
	public java.util.List<MiningLeaseApplication> findBygetMiningByEntityId(
		String entityId, int start, int end);

	/**
	 * Returns an ordered range of all the mining lease applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining lease applications
	 */
	public java.util.List<MiningLeaseApplication> findBygetMiningByEntityId(
		String entityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiningLeaseApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the mining lease applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining lease applications
	 */
	public java.util.List<MiningLeaseApplication> findBygetMiningByEntityId(
		String entityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiningLeaseApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first mining lease application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication findBygetMiningByEntityId_First(
			String entityId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Returns the first mining lease application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication fetchBygetMiningByEntityId_First(
		String entityId,
		com.liferay.portal.kernel.util.OrderByComparator<MiningLeaseApplication>
			orderByComparator);

	/**
	 * Returns the last mining lease application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication findBygetMiningByEntityId_Last(
			String entityId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Returns the last mining lease application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication fetchBygetMiningByEntityId_Last(
		String entityId,
		com.liferay.portal.kernel.util.OrderByComparator<MiningLeaseApplication>
			orderByComparator);

	/**
	 * Returns the mining lease applications before and after the current mining lease application in the ordered set where entityId = &#63;.
	 *
	 * @param miningLeaseApplicationId the primary key of the current mining lease application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a mining lease application with the primary key could not be found
	 */
	public MiningLeaseApplication[] findBygetMiningByEntityId_PrevAndNext(
			long miningLeaseApplicationId, String entityId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Removes all the mining lease applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	public void removeBygetMiningByEntityId(String entityId);

	/**
	 * Returns the number of mining lease applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching mining lease applications
	 */
	public int countBygetMiningByEntityId(String entityId);

	/**
	 * Returns all the mining lease applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching mining lease applications
	 */
	public java.util.List<MiningLeaseApplication>
		findBygetMiningByEntityId_Status(String entityId, int status);

	/**
	 * Returns a range of all the mining lease applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @return the range of matching mining lease applications
	 */
	public java.util.List<MiningLeaseApplication>
		findBygetMiningByEntityId_Status(
			String entityId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the mining lease applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining lease applications
	 */
	public java.util.List<MiningLeaseApplication>
		findBygetMiningByEntityId_Status(
			String entityId, int status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningLeaseApplication> orderByComparator);

	/**
	 * Returns an ordered range of all the mining lease applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining lease applications
	 */
	public java.util.List<MiningLeaseApplication>
		findBygetMiningByEntityId_Status(
			String entityId, int status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningLeaseApplication> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first mining lease application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication findBygetMiningByEntityId_Status_First(
			String entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Returns the first mining lease application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication fetchBygetMiningByEntityId_Status_First(
		String entityId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<MiningLeaseApplication>
			orderByComparator);

	/**
	 * Returns the last mining lease application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication findBygetMiningByEntityId_Status_Last(
			String entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Returns the last mining lease application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication fetchBygetMiningByEntityId_Status_Last(
		String entityId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<MiningLeaseApplication>
			orderByComparator);

	/**
	 * Returns the mining lease applications before and after the current mining lease application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param miningLeaseApplicationId the primary key of the current mining lease application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a mining lease application with the primary key could not be found
	 */
	public MiningLeaseApplication[]
			findBygetMiningByEntityId_Status_PrevAndNext(
				long miningLeaseApplicationId, String entityId, int status,
				com.liferay.portal.kernel.util.OrderByComparator
					<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Removes all the mining lease applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	public void removeBygetMiningByEntityId_Status(String entityId, int status);

	/**
	 * Returns the number of mining lease applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching mining lease applications
	 */
	public int countBygetMiningByEntityId_Status(String entityId, int status);

	/**
	 * Returns the mining lease application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchMiningLeaseApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication findBygetMiningByEI_CI(
			String entityId, String caseId)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Returns the mining lease application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication fetchBygetMiningByEI_CI(
		String entityId, String caseId);

	/**
	 * Returns the mining lease application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication fetchBygetMiningByEI_CI(
		String entityId, String caseId, boolean useFinderCache);

	/**
	 * Removes the mining lease application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the mining lease application that was removed
	 */
	public MiningLeaseApplication removeBygetMiningByEI_CI(
			String entityId, String caseId)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Returns the number of mining lease applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching mining lease applications
	 */
	public int countBygetMiningByEI_CI(String entityId, String caseId);

	/**
	 * Returns the mining lease application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchMiningLeaseApplicationException</code> if it could not be found.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication findBygetMiningByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Returns the mining lease application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication fetchBygetMiningByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber);

	/**
	 * Returns the mining lease application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public MiningLeaseApplication fetchBygetMiningByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber,
		boolean useFinderCache);

	/**
	 * Removes the mining lease application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the mining lease application that was removed
	 */
	public MiningLeaseApplication removeBygetMiningByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Returns the number of mining lease applications where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching mining lease applications
	 */
	public int countBygetMiningByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber);

	/**
	 * Caches the mining lease application in the entity cache if it is enabled.
	 *
	 * @param miningLeaseApplication the mining lease application
	 */
	public void cacheResult(MiningLeaseApplication miningLeaseApplication);

	/**
	 * Caches the mining lease applications in the entity cache if it is enabled.
	 *
	 * @param miningLeaseApplications the mining lease applications
	 */
	public void cacheResult(
		java.util.List<MiningLeaseApplication> miningLeaseApplications);

	/**
	 * Creates a new mining lease application with the primary key. Does not add the mining lease application to the database.
	 *
	 * @param miningLeaseApplicationId the primary key for the new mining lease application
	 * @return the new mining lease application
	 */
	public MiningLeaseApplication create(long miningLeaseApplicationId);

	/**
	 * Removes the mining lease application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningLeaseApplicationId the primary key of the mining lease application
	 * @return the mining lease application that was removed
	 * @throws NoSuchMiningLeaseApplicationException if a mining lease application with the primary key could not be found
	 */
	public MiningLeaseApplication remove(long miningLeaseApplicationId)
		throws NoSuchMiningLeaseApplicationException;

	public MiningLeaseApplication updateImpl(
		MiningLeaseApplication miningLeaseApplication);

	/**
	 * Returns the mining lease application with the primary key or throws a <code>NoSuchMiningLeaseApplicationException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the primary key of the mining lease application
	 * @return the mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a mining lease application with the primary key could not be found
	 */
	public MiningLeaseApplication findByPrimaryKey(
			long miningLeaseApplicationId)
		throws NoSuchMiningLeaseApplicationException;

	/**
	 * Returns the mining lease application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the primary key of the mining lease application
	 * @return the mining lease application, or <code>null</code> if a mining lease application with the primary key could not be found
	 */
	public MiningLeaseApplication fetchByPrimaryKey(
		long miningLeaseApplicationId);

	/**
	 * Returns all the mining lease applications.
	 *
	 * @return the mining lease applications
	 */
	public java.util.List<MiningLeaseApplication> findAll();

	/**
	 * Returns a range of all the mining lease applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @return the range of mining lease applications
	 */
	public java.util.List<MiningLeaseApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the mining lease applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining lease applications
	 */
	public java.util.List<MiningLeaseApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiningLeaseApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the mining lease applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining lease applications
	 */
	public java.util.List<MiningLeaseApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiningLeaseApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the mining lease applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of mining lease applications.
	 *
	 * @return the number of mining lease applications
	 */
	public int countAll();

}