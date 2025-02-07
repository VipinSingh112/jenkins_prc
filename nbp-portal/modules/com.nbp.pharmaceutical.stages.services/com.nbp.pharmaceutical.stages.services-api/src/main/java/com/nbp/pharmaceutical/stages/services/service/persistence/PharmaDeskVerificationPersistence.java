/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.pharmaceutical.stages.services.exception.NoSuchPharmaDeskVerificationException;
import com.nbp.pharmaceutical.stages.services.model.PharmaDeskVerification;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the pharma desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaDeskVerificationUtil
 * @generated
 */
@ProviderType
public interface PharmaDeskVerificationPersistence
	extends BasePersistence<PharmaDeskVerification> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PharmaDeskVerificationUtil} to access the pharma desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the pharma desk verifications where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma desk verifications
	 */
	public java.util.List<PharmaDeskVerification>
		findBygetDeskVerificationPharmaById(long pharmaApplicationId);

	/**
	 * Returns a range of all the pharma desk verifications where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma desk verifications
	 * @param end the upper bound of the range of pharma desk verifications (not inclusive)
	 * @return the range of matching pharma desk verifications
	 */
	public java.util.List<PharmaDeskVerification>
		findBygetDeskVerificationPharmaById(
			long pharmaApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the pharma desk verifications where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma desk verifications
	 * @param end the upper bound of the range of pharma desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma desk verifications
	 */
	public java.util.List<PharmaDeskVerification>
		findBygetDeskVerificationPharmaById(
			long pharmaApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaDeskVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the pharma desk verifications where pharmaApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param start the lower bound of the range of pharma desk verifications
	 * @param end the upper bound of the range of pharma desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma desk verifications
	 */
	public java.util.List<PharmaDeskVerification>
		findBygetDeskVerificationPharmaById(
			long pharmaApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaDeskVerification> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first pharma desk verification in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma desk verification
	 * @throws NoSuchPharmaDeskVerificationException if a matching pharma desk verification could not be found
	 */
	public PharmaDeskVerification findBygetDeskVerificationPharmaById_First(
			long pharmaApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaDeskVerification> orderByComparator)
		throws NoSuchPharmaDeskVerificationException;

	/**
	 * Returns the first pharma desk verification in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma desk verification, or <code>null</code> if a matching pharma desk verification could not be found
	 */
	public PharmaDeskVerification fetchBygetDeskVerificationPharmaById_First(
		long pharmaApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaDeskVerification>
			orderByComparator);

	/**
	 * Returns the last pharma desk verification in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma desk verification
	 * @throws NoSuchPharmaDeskVerificationException if a matching pharma desk verification could not be found
	 */
	public PharmaDeskVerification findBygetDeskVerificationPharmaById_Last(
			long pharmaApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaDeskVerification> orderByComparator)
		throws NoSuchPharmaDeskVerificationException;

	/**
	 * Returns the last pharma desk verification in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma desk verification, or <code>null</code> if a matching pharma desk verification could not be found
	 */
	public PharmaDeskVerification fetchBygetDeskVerificationPharmaById_Last(
		long pharmaApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaDeskVerification>
			orderByComparator);

	/**
	 * Returns the pharma desk verifications before and after the current pharma desk verification in the ordered set where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaDeskVerificationId the primary key of the current pharma desk verification
	 * @param pharmaApplicationId the pharma application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma desk verification
	 * @throws NoSuchPharmaDeskVerificationException if a pharma desk verification with the primary key could not be found
	 */
	public PharmaDeskVerification[]
			findBygetDeskVerificationPharmaById_PrevAndNext(
				long pharmaDeskVerificationId, long pharmaApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<PharmaDeskVerification> orderByComparator)
		throws NoSuchPharmaDeskVerificationException;

	/**
	 * Removes all the pharma desk verifications where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 */
	public void removeBygetDeskVerificationPharmaById(long pharmaApplicationId);

	/**
	 * Returns the number of pharma desk verifications where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma desk verifications
	 */
	public int countBygetDeskVerificationPharmaById(long pharmaApplicationId);

	/**
	 * Caches the pharma desk verification in the entity cache if it is enabled.
	 *
	 * @param pharmaDeskVerification the pharma desk verification
	 */
	public void cacheResult(PharmaDeskVerification pharmaDeskVerification);

	/**
	 * Caches the pharma desk verifications in the entity cache if it is enabled.
	 *
	 * @param pharmaDeskVerifications the pharma desk verifications
	 */
	public void cacheResult(
		java.util.List<PharmaDeskVerification> pharmaDeskVerifications);

	/**
	 * Creates a new pharma desk verification with the primary key. Does not add the pharma desk verification to the database.
	 *
	 * @param pharmaDeskVerificationId the primary key for the new pharma desk verification
	 * @return the new pharma desk verification
	 */
	public PharmaDeskVerification create(long pharmaDeskVerificationId);

	/**
	 * Removes the pharma desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaDeskVerificationId the primary key of the pharma desk verification
	 * @return the pharma desk verification that was removed
	 * @throws NoSuchPharmaDeskVerificationException if a pharma desk verification with the primary key could not be found
	 */
	public PharmaDeskVerification remove(long pharmaDeskVerificationId)
		throws NoSuchPharmaDeskVerificationException;

	public PharmaDeskVerification updateImpl(
		PharmaDeskVerification pharmaDeskVerification);

	/**
	 * Returns the pharma desk verification with the primary key or throws a <code>NoSuchPharmaDeskVerificationException</code> if it could not be found.
	 *
	 * @param pharmaDeskVerificationId the primary key of the pharma desk verification
	 * @return the pharma desk verification
	 * @throws NoSuchPharmaDeskVerificationException if a pharma desk verification with the primary key could not be found
	 */
	public PharmaDeskVerification findByPrimaryKey(
			long pharmaDeskVerificationId)
		throws NoSuchPharmaDeskVerificationException;

	/**
	 * Returns the pharma desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaDeskVerificationId the primary key of the pharma desk verification
	 * @return the pharma desk verification, or <code>null</code> if a pharma desk verification with the primary key could not be found
	 */
	public PharmaDeskVerification fetchByPrimaryKey(
		long pharmaDeskVerificationId);

	/**
	 * Returns all the pharma desk verifications.
	 *
	 * @return the pharma desk verifications
	 */
	public java.util.List<PharmaDeskVerification> findAll();

	/**
	 * Returns a range of all the pharma desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma desk verifications
	 * @param end the upper bound of the range of pharma desk verifications (not inclusive)
	 * @return the range of pharma desk verifications
	 */
	public java.util.List<PharmaDeskVerification> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the pharma desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma desk verifications
	 * @param end the upper bound of the range of pharma desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma desk verifications
	 */
	public java.util.List<PharmaDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaDeskVerification>
			orderByComparator);

	/**
	 * Returns an ordered range of all the pharma desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma desk verifications
	 * @param end the upper bound of the range of pharma desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma desk verifications
	 */
	public java.util.List<PharmaDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaDeskVerification>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the pharma desk verifications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of pharma desk verifications.
	 *
	 * @return the number of pharma desk verifications
	 */
	public int countAll();

}