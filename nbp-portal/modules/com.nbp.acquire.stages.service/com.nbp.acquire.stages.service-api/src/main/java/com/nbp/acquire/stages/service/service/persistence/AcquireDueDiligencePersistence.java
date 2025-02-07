/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.acquire.stages.service.exception.NoSuchAcquireDueDiligenceException;
import com.nbp.acquire.stages.service.model.AcquireDueDiligence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acquire due diligence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDueDiligenceUtil
 * @generated
 */
@ProviderType
public interface AcquireDueDiligencePersistence
	extends BasePersistence<AcquireDueDiligence> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AcquireDueDiligenceUtil} to access the acquire due diligence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the acquire due diligence where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireDueDiligenceException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire due diligence
	 * @throws NoSuchAcquireDueDiligenceException if a matching acquire due diligence could not be found
	 */
	public AcquireDueDiligence findBygetADD_AAI(long acquireApplicationId)
		throws NoSuchAcquireDueDiligenceException;

	/**
	 * Returns the acquire due diligence where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	public AcquireDueDiligence fetchBygetADD_AAI(long acquireApplicationId);

	/**
	 * Returns the acquire due diligence where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	public AcquireDueDiligence fetchBygetADD_AAI(
		long acquireApplicationId, boolean useFinderCache);

	/**
	 * Removes the acquire due diligence where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire due diligence that was removed
	 */
	public AcquireDueDiligence removeBygetADD_AAI(long acquireApplicationId)
		throws NoSuchAcquireDueDiligenceException;

	/**
	 * Returns the number of acquire due diligences where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire due diligences
	 */
	public int countBygetADD_AAI(long acquireApplicationId);

	/**
	 * Returns the acquire due diligence where caseId = &#63; and nameOfAgency = &#63; or throws a <code>NoSuchAcquireDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param nameOfAgency the name of agency
	 * @return the matching acquire due diligence
	 * @throws NoSuchAcquireDueDiligenceException if a matching acquire due diligence could not be found
	 */
	public AcquireDueDiligence findBygetADD_CaseId_AgencyName(
			String caseId, String nameOfAgency)
		throws NoSuchAcquireDueDiligenceException;

	/**
	 * Returns the acquire due diligence where caseId = &#63; and nameOfAgency = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param nameOfAgency the name of agency
	 * @return the matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	public AcquireDueDiligence fetchBygetADD_CaseId_AgencyName(
		String caseId, String nameOfAgency);

	/**
	 * Returns the acquire due diligence where caseId = &#63; and nameOfAgency = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param nameOfAgency the name of agency
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	public AcquireDueDiligence fetchBygetADD_CaseId_AgencyName(
		String caseId, String nameOfAgency, boolean useFinderCache);

	/**
	 * Removes the acquire due diligence where caseId = &#63; and nameOfAgency = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param nameOfAgency the name of agency
	 * @return the acquire due diligence that was removed
	 */
	public AcquireDueDiligence removeBygetADD_CaseId_AgencyName(
			String caseId, String nameOfAgency)
		throws NoSuchAcquireDueDiligenceException;

	/**
	 * Returns the number of acquire due diligences where caseId = &#63; and nameOfAgency = &#63;.
	 *
	 * @param caseId the case ID
	 * @param nameOfAgency the name of agency
	 * @return the number of matching acquire due diligences
	 */
	public int countBygetADD_CaseId_AgencyName(
		String caseId, String nameOfAgency);

	/**
	 * Returns all the acquire due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire due diligences
	 */
	public java.util.List<AcquireDueDiligence> findBygetADD_CaseId(
		String caseId);

	/**
	 * Returns a range of all the acquire due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire due diligences
	 * @param end the upper bound of the range of acquire due diligences (not inclusive)
	 * @return the range of matching acquire due diligences
	 */
	public java.util.List<AcquireDueDiligence> findBygetADD_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the acquire due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire due diligences
	 * @param end the upper bound of the range of acquire due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire due diligences
	 */
	public java.util.List<AcquireDueDiligence> findBygetADD_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireDueDiligence>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acquire due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire due diligences
	 * @param end the upper bound of the range of acquire due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire due diligences
	 */
	public java.util.List<AcquireDueDiligence> findBygetADD_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireDueDiligence>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acquire due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire due diligence
	 * @throws NoSuchAcquireDueDiligenceException if a matching acquire due diligence could not be found
	 */
	public AcquireDueDiligence findBygetADD_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquireDueDiligence> orderByComparator)
		throws NoSuchAcquireDueDiligenceException;

	/**
	 * Returns the first acquire due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	public AcquireDueDiligence fetchBygetADD_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireDueDiligence>
			orderByComparator);

	/**
	 * Returns the last acquire due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire due diligence
	 * @throws NoSuchAcquireDueDiligenceException if a matching acquire due diligence could not be found
	 */
	public AcquireDueDiligence findBygetADD_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquireDueDiligence> orderByComparator)
		throws NoSuchAcquireDueDiligenceException;

	/**
	 * Returns the last acquire due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	public AcquireDueDiligence fetchBygetADD_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireDueDiligence>
			orderByComparator);

	/**
	 * Returns the acquire due diligences before and after the current acquire due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param sampleId the primary key of the current acquire due diligence
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire due diligence
	 * @throws NoSuchAcquireDueDiligenceException if a acquire due diligence with the primary key could not be found
	 */
	public AcquireDueDiligence[] findBygetADD_CaseId_PrevAndNext(
			long sampleId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquireDueDiligence> orderByComparator)
		throws NoSuchAcquireDueDiligenceException;

	/**
	 * Removes all the acquire due diligences where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetADD_CaseId(String caseId);

	/**
	 * Returns the number of acquire due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire due diligences
	 */
	public int countBygetADD_CaseId(String caseId);

	/**
	 * Returns the acquire due diligence where caseId = &#63; or throws a <code>NoSuchAcquireDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire due diligence
	 * @throws NoSuchAcquireDueDiligenceException if a matching acquire due diligence could not be found
	 */
	public AcquireDueDiligence findBygetADD_CI(String caseId)
		throws NoSuchAcquireDueDiligenceException;

	/**
	 * Returns the acquire due diligence where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	public AcquireDueDiligence fetchBygetADD_CI(String caseId);

	/**
	 * Returns the acquire due diligence where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	public AcquireDueDiligence fetchBygetADD_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the acquire due diligence where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire due diligence that was removed
	 */
	public AcquireDueDiligence removeBygetADD_CI(String caseId)
		throws NoSuchAcquireDueDiligenceException;

	/**
	 * Returns the number of acquire due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire due diligences
	 */
	public int countBygetADD_CI(String caseId);

	/**
	 * Caches the acquire due diligence in the entity cache if it is enabled.
	 *
	 * @param acquireDueDiligence the acquire due diligence
	 */
	public void cacheResult(AcquireDueDiligence acquireDueDiligence);

	/**
	 * Caches the acquire due diligences in the entity cache if it is enabled.
	 *
	 * @param acquireDueDiligences the acquire due diligences
	 */
	public void cacheResult(
		java.util.List<AcquireDueDiligence> acquireDueDiligences);

	/**
	 * Creates a new acquire due diligence with the primary key. Does not add the acquire due diligence to the database.
	 *
	 * @param sampleId the primary key for the new acquire due diligence
	 * @return the new acquire due diligence
	 */
	public AcquireDueDiligence create(long sampleId);

	/**
	 * Removes the acquire due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sampleId the primary key of the acquire due diligence
	 * @return the acquire due diligence that was removed
	 * @throws NoSuchAcquireDueDiligenceException if a acquire due diligence with the primary key could not be found
	 */
	public AcquireDueDiligence remove(long sampleId)
		throws NoSuchAcquireDueDiligenceException;

	public AcquireDueDiligence updateImpl(
		AcquireDueDiligence acquireDueDiligence);

	/**
	 * Returns the acquire due diligence with the primary key or throws a <code>NoSuchAcquireDueDiligenceException</code> if it could not be found.
	 *
	 * @param sampleId the primary key of the acquire due diligence
	 * @return the acquire due diligence
	 * @throws NoSuchAcquireDueDiligenceException if a acquire due diligence with the primary key could not be found
	 */
	public AcquireDueDiligence findByPrimaryKey(long sampleId)
		throws NoSuchAcquireDueDiligenceException;

	/**
	 * Returns the acquire due diligence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sampleId the primary key of the acquire due diligence
	 * @return the acquire due diligence, or <code>null</code> if a acquire due diligence with the primary key could not be found
	 */
	public AcquireDueDiligence fetchByPrimaryKey(long sampleId);

	/**
	 * Returns all the acquire due diligences.
	 *
	 * @return the acquire due diligences
	 */
	public java.util.List<AcquireDueDiligence> findAll();

	/**
	 * Returns a range of all the acquire due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire due diligences
	 * @param end the upper bound of the range of acquire due diligences (not inclusive)
	 * @return the range of acquire due diligences
	 */
	public java.util.List<AcquireDueDiligence> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acquire due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire due diligences
	 * @param end the upper bound of the range of acquire due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire due diligences
	 */
	public java.util.List<AcquireDueDiligence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireDueDiligence>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acquire due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire due diligences
	 * @param end the upper bound of the range of acquire due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire due diligences
	 */
	public java.util.List<AcquireDueDiligence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireDueDiligence>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acquire due diligences from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acquire due diligences.
	 *
	 * @return the number of acquire due diligences
	 */
	public int countAll();

}