/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.acquire.stages.service.exception.NoSuchAcquireTenderingException;
import com.nbp.acquire.stages.service.model.AcquireTendering;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acquire tendering service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireTenderingUtil
 * @generated
 */
@ProviderType
public interface AcquireTenderingPersistence
	extends BasePersistence<AcquireTendering> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AcquireTenderingUtil} to access the acquire tendering persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the acquire tendering where caseId = &#63; or throws a <code>NoSuchAcquireTenderingException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire tendering
	 * @throws NoSuchAcquireTenderingException if a matching acquire tendering could not be found
	 */
	public AcquireTendering findBygetAcquireTenderingBy_CaseId(String caseId)
		throws NoSuchAcquireTenderingException;

	/**
	 * Returns the acquire tendering where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire tendering, or <code>null</code> if a matching acquire tendering could not be found
	 */
	public AcquireTendering fetchBygetAcquireTenderingBy_CaseId(String caseId);

	/**
	 * Returns the acquire tendering where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire tendering, or <code>null</code> if a matching acquire tendering could not be found
	 */
	public AcquireTendering fetchBygetAcquireTenderingBy_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the acquire tendering where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire tendering that was removed
	 */
	public AcquireTendering removeBygetAcquireTenderingBy_CaseId(String caseId)
		throws NoSuchAcquireTenderingException;

	/**
	 * Returns the number of acquire tenderings where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire tenderings
	 */
	public int countBygetAcquireTenderingBy_CaseId(String caseId);

	/**
	 * Returns all the acquire tenderings where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire tenderings
	 */
	public java.util.List<AcquireTendering> findBygetAcquireTenderingBy_CI(
		String caseId);

	/**
	 * Returns a range of all the acquire tenderings where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireTenderingModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire tenderings
	 * @param end the upper bound of the range of acquire tenderings (not inclusive)
	 * @return the range of matching acquire tenderings
	 */
	public java.util.List<AcquireTendering> findBygetAcquireTenderingBy_CI(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the acquire tenderings where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireTenderingModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire tenderings
	 * @param end the upper bound of the range of acquire tenderings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire tenderings
	 */
	public java.util.List<AcquireTendering> findBygetAcquireTenderingBy_CI(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireTendering>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acquire tenderings where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireTenderingModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire tenderings
	 * @param end the upper bound of the range of acquire tenderings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire tenderings
	 */
	public java.util.List<AcquireTendering> findBygetAcquireTenderingBy_CI(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireTendering>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acquire tendering in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire tendering
	 * @throws NoSuchAcquireTenderingException if a matching acquire tendering could not be found
	 */
	public AcquireTendering findBygetAcquireTenderingBy_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<AcquireTendering>
				orderByComparator)
		throws NoSuchAcquireTenderingException;

	/**
	 * Returns the first acquire tendering in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire tendering, or <code>null</code> if a matching acquire tendering could not be found
	 */
	public AcquireTendering fetchBygetAcquireTenderingBy_CI_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireTendering>
			orderByComparator);

	/**
	 * Returns the last acquire tendering in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire tendering
	 * @throws NoSuchAcquireTenderingException if a matching acquire tendering could not be found
	 */
	public AcquireTendering findBygetAcquireTenderingBy_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<AcquireTendering>
				orderByComparator)
		throws NoSuchAcquireTenderingException;

	/**
	 * Returns the last acquire tendering in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire tendering, or <code>null</code> if a matching acquire tendering could not be found
	 */
	public AcquireTendering fetchBygetAcquireTenderingBy_CI_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireTendering>
			orderByComparator);

	/**
	 * Returns the acquire tenderings before and after the current acquire tendering in the ordered set where caseId = &#63;.
	 *
	 * @param acquireTenderingId the primary key of the current acquire tendering
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire tendering
	 * @throws NoSuchAcquireTenderingException if a acquire tendering with the primary key could not be found
	 */
	public AcquireTendering[] findBygetAcquireTenderingBy_CI_PrevAndNext(
			long acquireTenderingId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator<AcquireTendering>
				orderByComparator)
		throws NoSuchAcquireTenderingException;

	/**
	 * Removes all the acquire tenderings where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetAcquireTenderingBy_CI(String caseId);

	/**
	 * Returns the number of acquire tenderings where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire tenderings
	 */
	public int countBygetAcquireTenderingBy_CI(String caseId);

	/**
	 * Caches the acquire tendering in the entity cache if it is enabled.
	 *
	 * @param acquireTendering the acquire tendering
	 */
	public void cacheResult(AcquireTendering acquireTendering);

	/**
	 * Caches the acquire tenderings in the entity cache if it is enabled.
	 *
	 * @param acquireTenderings the acquire tenderings
	 */
	public void cacheResult(java.util.List<AcquireTendering> acquireTenderings);

	/**
	 * Creates a new acquire tendering with the primary key. Does not add the acquire tendering to the database.
	 *
	 * @param acquireTenderingId the primary key for the new acquire tendering
	 * @return the new acquire tendering
	 */
	public AcquireTendering create(long acquireTenderingId);

	/**
	 * Removes the acquire tendering with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireTenderingId the primary key of the acquire tendering
	 * @return the acquire tendering that was removed
	 * @throws NoSuchAcquireTenderingException if a acquire tendering with the primary key could not be found
	 */
	public AcquireTendering remove(long acquireTenderingId)
		throws NoSuchAcquireTenderingException;

	public AcquireTendering updateImpl(AcquireTendering acquireTendering);

	/**
	 * Returns the acquire tendering with the primary key or throws a <code>NoSuchAcquireTenderingException</code> if it could not be found.
	 *
	 * @param acquireTenderingId the primary key of the acquire tendering
	 * @return the acquire tendering
	 * @throws NoSuchAcquireTenderingException if a acquire tendering with the primary key could not be found
	 */
	public AcquireTendering findByPrimaryKey(long acquireTenderingId)
		throws NoSuchAcquireTenderingException;

	/**
	 * Returns the acquire tendering with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireTenderingId the primary key of the acquire tendering
	 * @return the acquire tendering, or <code>null</code> if a acquire tendering with the primary key could not be found
	 */
	public AcquireTendering fetchByPrimaryKey(long acquireTenderingId);

	/**
	 * Returns all the acquire tenderings.
	 *
	 * @return the acquire tenderings
	 */
	public java.util.List<AcquireTendering> findAll();

	/**
	 * Returns a range of all the acquire tenderings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireTenderingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire tenderings
	 * @param end the upper bound of the range of acquire tenderings (not inclusive)
	 * @return the range of acquire tenderings
	 */
	public java.util.List<AcquireTendering> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acquire tenderings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireTenderingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire tenderings
	 * @param end the upper bound of the range of acquire tenderings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire tenderings
	 */
	public java.util.List<AcquireTendering> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireTendering>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acquire tenderings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireTenderingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire tenderings
	 * @param end the upper bound of the range of acquire tenderings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire tenderings
	 */
	public java.util.List<AcquireTendering> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireTendering>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acquire tenderings from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acquire tenderings.
	 *
	 * @return the number of acquire tenderings
	 */
	public int countAll();

}