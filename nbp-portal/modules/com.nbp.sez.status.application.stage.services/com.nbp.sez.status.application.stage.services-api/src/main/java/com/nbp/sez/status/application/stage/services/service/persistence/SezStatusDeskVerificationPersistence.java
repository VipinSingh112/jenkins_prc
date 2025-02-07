/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusDeskVerificationException;
import com.nbp.sez.status.application.stage.services.model.SezStatusDeskVerification;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez status desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusDeskVerificationUtil
 * @generated
 */
@ProviderType
public interface SezStatusDeskVerificationPersistence
	extends BasePersistence<SezStatusDeskVerification> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezStatusDeskVerificationUtil} to access the sez status desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez status desk verifications where sezApplicationId = &#63;.
	 *
	 * @param sezApplicationId the sez application ID
	 * @return the matching sez status desk verifications
	 */
	public java.util.List<SezStatusDeskVerification>
		findBygetDeskVerificationSezById(long sezApplicationId);

	/**
	 * Returns a range of all the sez status desk verifications where sezApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param sezApplicationId the sez application ID
	 * @param start the lower bound of the range of sez status desk verifications
	 * @param end the upper bound of the range of sez status desk verifications (not inclusive)
	 * @return the range of matching sez status desk verifications
	 */
	public java.util.List<SezStatusDeskVerification>
		findBygetDeskVerificationSezById(
			long sezApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the sez status desk verifications where sezApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param sezApplicationId the sez application ID
	 * @param start the lower bound of the range of sez status desk verifications
	 * @param end the upper bound of the range of sez status desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status desk verifications
	 */
	public java.util.List<SezStatusDeskVerification>
		findBygetDeskVerificationSezById(
			long sezApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusDeskVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status desk verifications where sezApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param sezApplicationId the sez application ID
	 * @param start the lower bound of the range of sez status desk verifications
	 * @param end the upper bound of the range of sez status desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status desk verifications
	 */
	public java.util.List<SezStatusDeskVerification>
		findBygetDeskVerificationSezById(
			long sezApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusDeskVerification> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first sez status desk verification in the ordered set where sezApplicationId = &#63;.
	 *
	 * @param sezApplicationId the sez application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status desk verification
	 * @throws NoSuchSezStatusDeskVerificationException if a matching sez status desk verification could not be found
	 */
	public SezStatusDeskVerification findBygetDeskVerificationSezById_First(
			long sezApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusDeskVerification> orderByComparator)
		throws NoSuchSezStatusDeskVerificationException;

	/**
	 * Returns the first sez status desk verification in the ordered set where sezApplicationId = &#63;.
	 *
	 * @param sezApplicationId the sez application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status desk verification, or <code>null</code> if a matching sez status desk verification could not be found
	 */
	public SezStatusDeskVerification fetchBygetDeskVerificationSezById_First(
		long sezApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusDeskVerification> orderByComparator);

	/**
	 * Returns the last sez status desk verification in the ordered set where sezApplicationId = &#63;.
	 *
	 * @param sezApplicationId the sez application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status desk verification
	 * @throws NoSuchSezStatusDeskVerificationException if a matching sez status desk verification could not be found
	 */
	public SezStatusDeskVerification findBygetDeskVerificationSezById_Last(
			long sezApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusDeskVerification> orderByComparator)
		throws NoSuchSezStatusDeskVerificationException;

	/**
	 * Returns the last sez status desk verification in the ordered set where sezApplicationId = &#63;.
	 *
	 * @param sezApplicationId the sez application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status desk verification, or <code>null</code> if a matching sez status desk verification could not be found
	 */
	public SezStatusDeskVerification fetchBygetDeskVerificationSezById_Last(
		long sezApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusDeskVerification> orderByComparator);

	/**
	 * Returns the sez status desk verifications before and after the current sez status desk verification in the ordered set where sezApplicationId = &#63;.
	 *
	 * @param SezDeskVerificationId the primary key of the current sez status desk verification
	 * @param sezApplicationId the sez application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status desk verification
	 * @throws NoSuchSezStatusDeskVerificationException if a sez status desk verification with the primary key could not be found
	 */
	public SezStatusDeskVerification[]
			findBygetDeskVerificationSezById_PrevAndNext(
				long SezDeskVerificationId, long sezApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<SezStatusDeskVerification> orderByComparator)
		throws NoSuchSezStatusDeskVerificationException;

	/**
	 * Removes all the sez status desk verifications where sezApplicationId = &#63; from the database.
	 *
	 * @param sezApplicationId the sez application ID
	 */
	public void removeBygetDeskVerificationSezById(long sezApplicationId);

	/**
	 * Returns the number of sez status desk verifications where sezApplicationId = &#63;.
	 *
	 * @param sezApplicationId the sez application ID
	 * @return the number of matching sez status desk verifications
	 */
	public int countBygetDeskVerificationSezById(long sezApplicationId);

	/**
	 * Caches the sez status desk verification in the entity cache if it is enabled.
	 *
	 * @param sezStatusDeskVerification the sez status desk verification
	 */
	public void cacheResult(
		SezStatusDeskVerification sezStatusDeskVerification);

	/**
	 * Caches the sez status desk verifications in the entity cache if it is enabled.
	 *
	 * @param sezStatusDeskVerifications the sez status desk verifications
	 */
	public void cacheResult(
		java.util.List<SezStatusDeskVerification> sezStatusDeskVerifications);

	/**
	 * Creates a new sez status desk verification with the primary key. Does not add the sez status desk verification to the database.
	 *
	 * @param SezDeskVerificationId the primary key for the new sez status desk verification
	 * @return the new sez status desk verification
	 */
	public SezStatusDeskVerification create(long SezDeskVerificationId);

	/**
	 * Removes the sez status desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SezDeskVerificationId the primary key of the sez status desk verification
	 * @return the sez status desk verification that was removed
	 * @throws NoSuchSezStatusDeskVerificationException if a sez status desk verification with the primary key could not be found
	 */
	public SezStatusDeskVerification remove(long SezDeskVerificationId)
		throws NoSuchSezStatusDeskVerificationException;

	public SezStatusDeskVerification updateImpl(
		SezStatusDeskVerification sezStatusDeskVerification);

	/**
	 * Returns the sez status desk verification with the primary key or throws a <code>NoSuchSezStatusDeskVerificationException</code> if it could not be found.
	 *
	 * @param SezDeskVerificationId the primary key of the sez status desk verification
	 * @return the sez status desk verification
	 * @throws NoSuchSezStatusDeskVerificationException if a sez status desk verification with the primary key could not be found
	 */
	public SezStatusDeskVerification findByPrimaryKey(
			long SezDeskVerificationId)
		throws NoSuchSezStatusDeskVerificationException;

	/**
	 * Returns the sez status desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param SezDeskVerificationId the primary key of the sez status desk verification
	 * @return the sez status desk verification, or <code>null</code> if a sez status desk verification with the primary key could not be found
	 */
	public SezStatusDeskVerification fetchByPrimaryKey(
		long SezDeskVerificationId);

	/**
	 * Returns all the sez status desk verifications.
	 *
	 * @return the sez status desk verifications
	 */
	public java.util.List<SezStatusDeskVerification> findAll();

	/**
	 * Returns a range of all the sez status desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status desk verifications
	 * @param end the upper bound of the range of sez status desk verifications (not inclusive)
	 * @return the range of sez status desk verifications
	 */
	public java.util.List<SezStatusDeskVerification> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez status desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status desk verifications
	 * @param end the upper bound of the range of sez status desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status desk verifications
	 */
	public java.util.List<SezStatusDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusDeskVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status desk verifications
	 * @param end the upper bound of the range of sez status desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status desk verifications
	 */
	public java.util.List<SezStatusDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezStatusDeskVerification> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez status desk verifications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez status desk verifications.
	 *
	 * @return the number of sez status desk verifications
	 */
	public int countAll();

}