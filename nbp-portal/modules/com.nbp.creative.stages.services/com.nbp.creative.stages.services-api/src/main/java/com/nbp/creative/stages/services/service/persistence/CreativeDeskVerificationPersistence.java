/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.creative.stages.services.exception.NoSuchCreativeDeskVerificationException;
import com.nbp.creative.stages.services.model.CreativeDeskVerification;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the creative desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeDeskVerificationUtil
 * @generated
 */
@ProviderType
public interface CreativeDeskVerificationPersistence
	extends BasePersistence<CreativeDeskVerification> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CreativeDeskVerificationUtil} to access the creative desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the creative desk verifications where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the matching creative desk verifications
	 */
	public java.util.List<CreativeDeskVerification>
		findBygetDeskVerCreativeById(long creativeApplicationId);

	/**
	 * Returns a range of all the creative desk verifications where creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative desk verifications
	 * @param end the upper bound of the range of creative desk verifications (not inclusive)
	 * @return the range of matching creative desk verifications
	 */
	public java.util.List<CreativeDeskVerification>
		findBygetDeskVerCreativeById(
			long creativeApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the creative desk verifications where creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative desk verifications
	 * @param end the upper bound of the range of creative desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative desk verifications
	 */
	public java.util.List<CreativeDeskVerification>
		findBygetDeskVerCreativeById(
			long creativeApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeDeskVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the creative desk verifications where creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative desk verifications
	 * @param end the upper bound of the range of creative desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative desk verifications
	 */
	public java.util.List<CreativeDeskVerification>
		findBygetDeskVerCreativeById(
			long creativeApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeDeskVerification> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first creative desk verification in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative desk verification
	 * @throws NoSuchCreativeDeskVerificationException if a matching creative desk verification could not be found
	 */
	public CreativeDeskVerification findBygetDeskVerCreativeById_First(
			long creativeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeDeskVerification> orderByComparator)
		throws NoSuchCreativeDeskVerificationException;

	/**
	 * Returns the first creative desk verification in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative desk verification, or <code>null</code> if a matching creative desk verification could not be found
	 */
	public CreativeDeskVerification fetchBygetDeskVerCreativeById_First(
		long creativeApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeDeskVerification> orderByComparator);

	/**
	 * Returns the last creative desk verification in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative desk verification
	 * @throws NoSuchCreativeDeskVerificationException if a matching creative desk verification could not be found
	 */
	public CreativeDeskVerification findBygetDeskVerCreativeById_Last(
			long creativeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeDeskVerification> orderByComparator)
		throws NoSuchCreativeDeskVerificationException;

	/**
	 * Returns the last creative desk verification in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative desk verification, or <code>null</code> if a matching creative desk verification could not be found
	 */
	public CreativeDeskVerification fetchBygetDeskVerCreativeById_Last(
		long creativeApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeDeskVerification> orderByComparator);

	/**
	 * Returns the creative desk verifications before and after the current creative desk verification in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeDeskVerificationId the primary key of the current creative desk verification
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative desk verification
	 * @throws NoSuchCreativeDeskVerificationException if a creative desk verification with the primary key could not be found
	 */
	public CreativeDeskVerification[] findBygetDeskVerCreativeById_PrevAndNext(
			long creativeDeskVerificationId, long creativeApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeDeskVerification> orderByComparator)
		throws NoSuchCreativeDeskVerificationException;

	/**
	 * Removes all the creative desk verifications where creativeApplicationId = &#63; from the database.
	 *
	 * @param creativeApplicationId the creative application ID
	 */
	public void removeBygetDeskVerCreativeById(long creativeApplicationId);

	/**
	 * Returns the number of creative desk verifications where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the number of matching creative desk verifications
	 */
	public int countBygetDeskVerCreativeById(long creativeApplicationId);

	/**
	 * Caches the creative desk verification in the entity cache if it is enabled.
	 *
	 * @param creativeDeskVerification the creative desk verification
	 */
	public void cacheResult(CreativeDeskVerification creativeDeskVerification);

	/**
	 * Caches the creative desk verifications in the entity cache if it is enabled.
	 *
	 * @param creativeDeskVerifications the creative desk verifications
	 */
	public void cacheResult(
		java.util.List<CreativeDeskVerification> creativeDeskVerifications);

	/**
	 * Creates a new creative desk verification with the primary key. Does not add the creative desk verification to the database.
	 *
	 * @param creativeDeskVerificationId the primary key for the new creative desk verification
	 * @return the new creative desk verification
	 */
	public CreativeDeskVerification create(long creativeDeskVerificationId);

	/**
	 * Removes the creative desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeDeskVerificationId the primary key of the creative desk verification
	 * @return the creative desk verification that was removed
	 * @throws NoSuchCreativeDeskVerificationException if a creative desk verification with the primary key could not be found
	 */
	public CreativeDeskVerification remove(long creativeDeskVerificationId)
		throws NoSuchCreativeDeskVerificationException;

	public CreativeDeskVerification updateImpl(
		CreativeDeskVerification creativeDeskVerification);

	/**
	 * Returns the creative desk verification with the primary key or throws a <code>NoSuchCreativeDeskVerificationException</code> if it could not be found.
	 *
	 * @param creativeDeskVerificationId the primary key of the creative desk verification
	 * @return the creative desk verification
	 * @throws NoSuchCreativeDeskVerificationException if a creative desk verification with the primary key could not be found
	 */
	public CreativeDeskVerification findByPrimaryKey(
			long creativeDeskVerificationId)
		throws NoSuchCreativeDeskVerificationException;

	/**
	 * Returns the creative desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeDeskVerificationId the primary key of the creative desk verification
	 * @return the creative desk verification, or <code>null</code> if a creative desk verification with the primary key could not be found
	 */
	public CreativeDeskVerification fetchByPrimaryKey(
		long creativeDeskVerificationId);

	/**
	 * Returns all the creative desk verifications.
	 *
	 * @return the creative desk verifications
	 */
	public java.util.List<CreativeDeskVerification> findAll();

	/**
	 * Returns a range of all the creative desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative desk verifications
	 * @param end the upper bound of the range of creative desk verifications (not inclusive)
	 * @return the range of creative desk verifications
	 */
	public java.util.List<CreativeDeskVerification> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the creative desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative desk verifications
	 * @param end the upper bound of the range of creative desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative desk verifications
	 */
	public java.util.List<CreativeDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeDeskVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the creative desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative desk verifications
	 * @param end the upper bound of the range of creative desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative desk verifications
	 */
	public java.util.List<CreativeDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeDeskVerification> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the creative desk verifications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of creative desk verifications.
	 *
	 * @return the number of creative desk verifications
	 */
	public int countAll();

}