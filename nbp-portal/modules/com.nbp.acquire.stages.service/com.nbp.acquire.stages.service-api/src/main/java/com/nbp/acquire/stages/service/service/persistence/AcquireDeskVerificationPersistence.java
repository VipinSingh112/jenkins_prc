/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.acquire.stages.service.exception.NoSuchAcquireDeskVerificationException;
import com.nbp.acquire.stages.service.model.AcquireDeskVerification;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acquire desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDeskVerificationUtil
 * @generated
 */
@ProviderType
public interface AcquireDeskVerificationPersistence
	extends BasePersistence<AcquireDeskVerification> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AcquireDeskVerificationUtil} to access the acquire desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acquire desk verifications where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire desk verifications
	 */
	public java.util.List<AcquireDeskVerification>
		findBygetDeskVerificationAcquireById(long acquireApplicationId);

	/**
	 * Returns a range of all the acquire desk verifications where acquireApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param start the lower bound of the range of acquire desk verifications
	 * @param end the upper bound of the range of acquire desk verifications (not inclusive)
	 * @return the range of matching acquire desk verifications
	 */
	public java.util.List<AcquireDeskVerification>
		findBygetDeskVerificationAcquireById(
			long acquireApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the acquire desk verifications where acquireApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param start the lower bound of the range of acquire desk verifications
	 * @param end the upper bound of the range of acquire desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire desk verifications
	 */
	public java.util.List<AcquireDeskVerification>
		findBygetDeskVerificationAcquireById(
			long acquireApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquireDeskVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the acquire desk verifications where acquireApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param start the lower bound of the range of acquire desk verifications
	 * @param end the upper bound of the range of acquire desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire desk verifications
	 */
	public java.util.List<AcquireDeskVerification>
		findBygetDeskVerificationAcquireById(
			long acquireApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquireDeskVerification> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first acquire desk verification in the ordered set where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire desk verification
	 * @throws NoSuchAcquireDeskVerificationException if a matching acquire desk verification could not be found
	 */
	public AcquireDeskVerification findBygetDeskVerificationAcquireById_First(
			long acquireApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquireDeskVerification> orderByComparator)
		throws NoSuchAcquireDeskVerificationException;

	/**
	 * Returns the first acquire desk verification in the ordered set where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire desk verification, or <code>null</code> if a matching acquire desk verification could not be found
	 */
	public AcquireDeskVerification fetchBygetDeskVerificationAcquireById_First(
		long acquireApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AcquireDeskVerification> orderByComparator);

	/**
	 * Returns the last acquire desk verification in the ordered set where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire desk verification
	 * @throws NoSuchAcquireDeskVerificationException if a matching acquire desk verification could not be found
	 */
	public AcquireDeskVerification findBygetDeskVerificationAcquireById_Last(
			long acquireApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquireDeskVerification> orderByComparator)
		throws NoSuchAcquireDeskVerificationException;

	/**
	 * Returns the last acquire desk verification in the ordered set where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire desk verification, or <code>null</code> if a matching acquire desk verification could not be found
	 */
	public AcquireDeskVerification fetchBygetDeskVerificationAcquireById_Last(
		long acquireApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AcquireDeskVerification> orderByComparator);

	/**
	 * Returns the acquire desk verifications before and after the current acquire desk verification in the ordered set where acquireApplicationId = &#63;.
	 *
	 * @param acquireDeskVerificationId the primary key of the current acquire desk verification
	 * @param acquireApplicationId the acquire application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire desk verification
	 * @throws NoSuchAcquireDeskVerificationException if a acquire desk verification with the primary key could not be found
	 */
	public AcquireDeskVerification[]
			findBygetDeskVerificationAcquireById_PrevAndNext(
				long acquireDeskVerificationId, long acquireApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<AcquireDeskVerification> orderByComparator)
		throws NoSuchAcquireDeskVerificationException;

	/**
	 * Removes all the acquire desk verifications where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 */
	public void removeBygetDeskVerificationAcquireById(
		long acquireApplicationId);

	/**
	 * Returns the number of acquire desk verifications where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire desk verifications
	 */
	public int countBygetDeskVerificationAcquireById(long acquireApplicationId);

	/**
	 * Caches the acquire desk verification in the entity cache if it is enabled.
	 *
	 * @param acquireDeskVerification the acquire desk verification
	 */
	public void cacheResult(AcquireDeskVerification acquireDeskVerification);

	/**
	 * Caches the acquire desk verifications in the entity cache if it is enabled.
	 *
	 * @param acquireDeskVerifications the acquire desk verifications
	 */
	public void cacheResult(
		java.util.List<AcquireDeskVerification> acquireDeskVerifications);

	/**
	 * Creates a new acquire desk verification with the primary key. Does not add the acquire desk verification to the database.
	 *
	 * @param acquireDeskVerificationId the primary key for the new acquire desk verification
	 * @return the new acquire desk verification
	 */
	public AcquireDeskVerification create(long acquireDeskVerificationId);

	/**
	 * Removes the acquire desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireDeskVerificationId the primary key of the acquire desk verification
	 * @return the acquire desk verification that was removed
	 * @throws NoSuchAcquireDeskVerificationException if a acquire desk verification with the primary key could not be found
	 */
	public AcquireDeskVerification remove(long acquireDeskVerificationId)
		throws NoSuchAcquireDeskVerificationException;

	public AcquireDeskVerification updateImpl(
		AcquireDeskVerification acquireDeskVerification);

	/**
	 * Returns the acquire desk verification with the primary key or throws a <code>NoSuchAcquireDeskVerificationException</code> if it could not be found.
	 *
	 * @param acquireDeskVerificationId the primary key of the acquire desk verification
	 * @return the acquire desk verification
	 * @throws NoSuchAcquireDeskVerificationException if a acquire desk verification with the primary key could not be found
	 */
	public AcquireDeskVerification findByPrimaryKey(
			long acquireDeskVerificationId)
		throws NoSuchAcquireDeskVerificationException;

	/**
	 * Returns the acquire desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireDeskVerificationId the primary key of the acquire desk verification
	 * @return the acquire desk verification, or <code>null</code> if a acquire desk verification with the primary key could not be found
	 */
	public AcquireDeskVerification fetchByPrimaryKey(
		long acquireDeskVerificationId);

	/**
	 * Returns all the acquire desk verifications.
	 *
	 * @return the acquire desk verifications
	 */
	public java.util.List<AcquireDeskVerification> findAll();

	/**
	 * Returns a range of all the acquire desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire desk verifications
	 * @param end the upper bound of the range of acquire desk verifications (not inclusive)
	 * @return the range of acquire desk verifications
	 */
	public java.util.List<AcquireDeskVerification> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acquire desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire desk verifications
	 * @param end the upper bound of the range of acquire desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire desk verifications
	 */
	public java.util.List<AcquireDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AcquireDeskVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the acquire desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire desk verifications
	 * @param end the upper bound of the range of acquire desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire desk verifications
	 */
	public java.util.List<AcquireDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AcquireDeskVerification> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acquire desk verifications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acquire desk verifications.
	 *
	 * @return the number of acquire desk verifications
	 */
	public int countAll();

}