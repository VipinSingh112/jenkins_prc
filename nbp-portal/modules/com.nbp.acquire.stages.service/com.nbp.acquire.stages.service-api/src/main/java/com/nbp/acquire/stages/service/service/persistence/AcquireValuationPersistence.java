/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.acquire.stages.service.exception.NoSuchAcquireValuationException;
import com.nbp.acquire.stages.service.model.AcquireValuation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acquire valuation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireValuationUtil
 * @generated
 */
@ProviderType
public interface AcquireValuationPersistence
	extends BasePersistence<AcquireValuation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AcquireValuationUtil} to access the acquire valuation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the acquire valuation where caseId = &#63; or throws a <code>NoSuchAcquireValuationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire valuation
	 * @throws NoSuchAcquireValuationException if a matching acquire valuation could not be found
	 */
	public AcquireValuation findBygetAcquireValuationBy_CaseId(String caseId)
		throws NoSuchAcquireValuationException;

	/**
	 * Returns the acquire valuation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire valuation, or <code>null</code> if a matching acquire valuation could not be found
	 */
	public AcquireValuation fetchBygetAcquireValuationBy_CaseId(String caseId);

	/**
	 * Returns the acquire valuation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire valuation, or <code>null</code> if a matching acquire valuation could not be found
	 */
	public AcquireValuation fetchBygetAcquireValuationBy_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the acquire valuation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire valuation that was removed
	 */
	public AcquireValuation removeBygetAcquireValuationBy_CaseId(String caseId)
		throws NoSuchAcquireValuationException;

	/**
	 * Returns the number of acquire valuations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire valuations
	 */
	public int countBygetAcquireValuationBy_CaseId(String caseId);

	/**
	 * Caches the acquire valuation in the entity cache if it is enabled.
	 *
	 * @param acquireValuation the acquire valuation
	 */
	public void cacheResult(AcquireValuation acquireValuation);

	/**
	 * Caches the acquire valuations in the entity cache if it is enabled.
	 *
	 * @param acquireValuations the acquire valuations
	 */
	public void cacheResult(java.util.List<AcquireValuation> acquireValuations);

	/**
	 * Creates a new acquire valuation with the primary key. Does not add the acquire valuation to the database.
	 *
	 * @param acquireValuationId the primary key for the new acquire valuation
	 * @return the new acquire valuation
	 */
	public AcquireValuation create(long acquireValuationId);

	/**
	 * Removes the acquire valuation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireValuationId the primary key of the acquire valuation
	 * @return the acquire valuation that was removed
	 * @throws NoSuchAcquireValuationException if a acquire valuation with the primary key could not be found
	 */
	public AcquireValuation remove(long acquireValuationId)
		throws NoSuchAcquireValuationException;

	public AcquireValuation updateImpl(AcquireValuation acquireValuation);

	/**
	 * Returns the acquire valuation with the primary key or throws a <code>NoSuchAcquireValuationException</code> if it could not be found.
	 *
	 * @param acquireValuationId the primary key of the acquire valuation
	 * @return the acquire valuation
	 * @throws NoSuchAcquireValuationException if a acquire valuation with the primary key could not be found
	 */
	public AcquireValuation findByPrimaryKey(long acquireValuationId)
		throws NoSuchAcquireValuationException;

	/**
	 * Returns the acquire valuation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireValuationId the primary key of the acquire valuation
	 * @return the acquire valuation, or <code>null</code> if a acquire valuation with the primary key could not be found
	 */
	public AcquireValuation fetchByPrimaryKey(long acquireValuationId);

	/**
	 * Returns all the acquire valuations.
	 *
	 * @return the acquire valuations
	 */
	public java.util.List<AcquireValuation> findAll();

	/**
	 * Returns a range of all the acquire valuations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireValuationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire valuations
	 * @param end the upper bound of the range of acquire valuations (not inclusive)
	 * @return the range of acquire valuations
	 */
	public java.util.List<AcquireValuation> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acquire valuations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireValuationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire valuations
	 * @param end the upper bound of the range of acquire valuations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire valuations
	 */
	public java.util.List<AcquireValuation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireValuation>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acquire valuations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireValuationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire valuations
	 * @param end the upper bound of the range of acquire valuations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire valuations
	 */
	public java.util.List<AcquireValuation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireValuation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acquire valuations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acquire valuations.
	 *
	 * @return the number of acquire valuations
	 */
	public int countAll();

}