/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.acquire.stages.service.exception.NoSuchAcquireAdvertisingException;
import com.nbp.acquire.stages.service.model.AcquireAdvertising;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acquire advertising service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireAdvertisingUtil
 * @generated
 */
@ProviderType
public interface AcquireAdvertisingPersistence
	extends BasePersistence<AcquireAdvertising> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AcquireAdvertisingUtil} to access the acquire advertising persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the acquire advertising where caseId = &#63; or throws a <code>NoSuchAcquireAdvertisingException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire advertising
	 * @throws NoSuchAcquireAdvertisingException if a matching acquire advertising could not be found
	 */
	public AcquireAdvertising findBygetAcquireAdvertisingBy_CaseId(
			String caseId)
		throws NoSuchAcquireAdvertisingException;

	/**
	 * Returns the acquire advertising where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire advertising, or <code>null</code> if a matching acquire advertising could not be found
	 */
	public AcquireAdvertising fetchBygetAcquireAdvertisingBy_CaseId(
		String caseId);

	/**
	 * Returns the acquire advertising where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire advertising, or <code>null</code> if a matching acquire advertising could not be found
	 */
	public AcquireAdvertising fetchBygetAcquireAdvertisingBy_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the acquire advertising where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire advertising that was removed
	 */
	public AcquireAdvertising removeBygetAcquireAdvertisingBy_CaseId(
			String caseId)
		throws NoSuchAcquireAdvertisingException;

	/**
	 * Returns the number of acquire advertisings where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire advertisings
	 */
	public int countBygetAcquireAdvertisingBy_CaseId(String caseId);

	/**
	 * Caches the acquire advertising in the entity cache if it is enabled.
	 *
	 * @param acquireAdvertising the acquire advertising
	 */
	public void cacheResult(AcquireAdvertising acquireAdvertising);

	/**
	 * Caches the acquire advertisings in the entity cache if it is enabled.
	 *
	 * @param acquireAdvertisings the acquire advertisings
	 */
	public void cacheResult(
		java.util.List<AcquireAdvertising> acquireAdvertisings);

	/**
	 * Creates a new acquire advertising with the primary key. Does not add the acquire advertising to the database.
	 *
	 * @param acquireAdvertisingId the primary key for the new acquire advertising
	 * @return the new acquire advertising
	 */
	public AcquireAdvertising create(long acquireAdvertisingId);

	/**
	 * Removes the acquire advertising with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireAdvertisingId the primary key of the acquire advertising
	 * @return the acquire advertising that was removed
	 * @throws NoSuchAcquireAdvertisingException if a acquire advertising with the primary key could not be found
	 */
	public AcquireAdvertising remove(long acquireAdvertisingId)
		throws NoSuchAcquireAdvertisingException;

	public AcquireAdvertising updateImpl(AcquireAdvertising acquireAdvertising);

	/**
	 * Returns the acquire advertising with the primary key or throws a <code>NoSuchAcquireAdvertisingException</code> if it could not be found.
	 *
	 * @param acquireAdvertisingId the primary key of the acquire advertising
	 * @return the acquire advertising
	 * @throws NoSuchAcquireAdvertisingException if a acquire advertising with the primary key could not be found
	 */
	public AcquireAdvertising findByPrimaryKey(long acquireAdvertisingId)
		throws NoSuchAcquireAdvertisingException;

	/**
	 * Returns the acquire advertising with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireAdvertisingId the primary key of the acquire advertising
	 * @return the acquire advertising, or <code>null</code> if a acquire advertising with the primary key could not be found
	 */
	public AcquireAdvertising fetchByPrimaryKey(long acquireAdvertisingId);

	/**
	 * Returns all the acquire advertisings.
	 *
	 * @return the acquire advertisings
	 */
	public java.util.List<AcquireAdvertising> findAll();

	/**
	 * Returns a range of all the acquire advertisings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireAdvertisingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire advertisings
	 * @param end the upper bound of the range of acquire advertisings (not inclusive)
	 * @return the range of acquire advertisings
	 */
	public java.util.List<AcquireAdvertising> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acquire advertisings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireAdvertisingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire advertisings
	 * @param end the upper bound of the range of acquire advertisings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire advertisings
	 */
	public java.util.List<AcquireAdvertising> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireAdvertising>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acquire advertisings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireAdvertisingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire advertisings
	 * @param end the upper bound of the range of acquire advertisings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire advertisings
	 */
	public java.util.List<AcquireAdvertising> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireAdvertising>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acquire advertisings from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acquire advertisings.
	 *
	 * @return the number of acquire advertisings
	 */
	public int countAll();

}