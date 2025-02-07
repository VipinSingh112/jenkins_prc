/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.stages.services.exception.NoSuchOsiDeskVerificationException;
import com.nbp.osi.stages.services.model.OsiDeskVerification;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiDeskVerificationUtil
 * @generated
 */
@ProviderType
public interface OsiDeskVerificationPersistence
	extends BasePersistence<OsiDeskVerification> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiDeskVerificationUtil} to access the osi desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the osi desk verifications where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi desk verifications
	 */
	public java.util.List<OsiDeskVerification> findBygetDeskVerificationOsiById(
		long osiApplicationId);

	/**
	 * Returns a range of all the osi desk verifications where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi desk verifications
	 * @param end the upper bound of the range of osi desk verifications (not inclusive)
	 * @return the range of matching osi desk verifications
	 */
	public java.util.List<OsiDeskVerification> findBygetDeskVerificationOsiById(
		long osiApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the osi desk verifications where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi desk verifications
	 * @param end the upper bound of the range of osi desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi desk verifications
	 */
	public java.util.List<OsiDeskVerification> findBygetDeskVerificationOsiById(
		long osiApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiDeskVerification>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi desk verifications where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi desk verifications
	 * @param end the upper bound of the range of osi desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi desk verifications
	 */
	public java.util.List<OsiDeskVerification> findBygetDeskVerificationOsiById(
		long osiApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiDeskVerification>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi desk verification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi desk verification
	 * @throws NoSuchOsiDeskVerificationException if a matching osi desk verification could not be found
	 */
	public OsiDeskVerification findBygetDeskVerificationOsiById_First(
			long osiApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiDeskVerification> orderByComparator)
		throws NoSuchOsiDeskVerificationException;

	/**
	 * Returns the first osi desk verification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi desk verification, or <code>null</code> if a matching osi desk verification could not be found
	 */
	public OsiDeskVerification fetchBygetDeskVerificationOsiById_First(
		long osiApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<OsiDeskVerification>
			orderByComparator);

	/**
	 * Returns the last osi desk verification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi desk verification
	 * @throws NoSuchOsiDeskVerificationException if a matching osi desk verification could not be found
	 */
	public OsiDeskVerification findBygetDeskVerificationOsiById_Last(
			long osiApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiDeskVerification> orderByComparator)
		throws NoSuchOsiDeskVerificationException;

	/**
	 * Returns the last osi desk verification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi desk verification, or <code>null</code> if a matching osi desk verification could not be found
	 */
	public OsiDeskVerification fetchBygetDeskVerificationOsiById_Last(
		long osiApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<OsiDeskVerification>
			orderByComparator);

	/**
	 * Returns the osi desk verifications before and after the current osi desk verification in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiDeskVerificationId the primary key of the current osi desk verification
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi desk verification
	 * @throws NoSuchOsiDeskVerificationException if a osi desk verification with the primary key could not be found
	 */
	public OsiDeskVerification[] findBygetDeskVerificationOsiById_PrevAndNext(
			long osiDeskVerificationId, long osiApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiDeskVerification> orderByComparator)
		throws NoSuchOsiDeskVerificationException;

	/**
	 * Removes all the osi desk verifications where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 */
	public void removeBygetDeskVerificationOsiById(long osiApplicationId);

	/**
	 * Returns the number of osi desk verifications where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching osi desk verifications
	 */
	public int countBygetDeskVerificationOsiById(long osiApplicationId);

	/**
	 * Caches the osi desk verification in the entity cache if it is enabled.
	 *
	 * @param osiDeskVerification the osi desk verification
	 */
	public void cacheResult(OsiDeskVerification osiDeskVerification);

	/**
	 * Caches the osi desk verifications in the entity cache if it is enabled.
	 *
	 * @param osiDeskVerifications the osi desk verifications
	 */
	public void cacheResult(
		java.util.List<OsiDeskVerification> osiDeskVerifications);

	/**
	 * Creates a new osi desk verification with the primary key. Does not add the osi desk verification to the database.
	 *
	 * @param osiDeskVerificationId the primary key for the new osi desk verification
	 * @return the new osi desk verification
	 */
	public OsiDeskVerification create(long osiDeskVerificationId);

	/**
	 * Removes the osi desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiDeskVerificationId the primary key of the osi desk verification
	 * @return the osi desk verification that was removed
	 * @throws NoSuchOsiDeskVerificationException if a osi desk verification with the primary key could not be found
	 */
	public OsiDeskVerification remove(long osiDeskVerificationId)
		throws NoSuchOsiDeskVerificationException;

	public OsiDeskVerification updateImpl(
		OsiDeskVerification osiDeskVerification);

	/**
	 * Returns the osi desk verification with the primary key or throws a <code>NoSuchOsiDeskVerificationException</code> if it could not be found.
	 *
	 * @param osiDeskVerificationId the primary key of the osi desk verification
	 * @return the osi desk verification
	 * @throws NoSuchOsiDeskVerificationException if a osi desk verification with the primary key could not be found
	 */
	public OsiDeskVerification findByPrimaryKey(long osiDeskVerificationId)
		throws NoSuchOsiDeskVerificationException;

	/**
	 * Returns the osi desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiDeskVerificationId the primary key of the osi desk verification
	 * @return the osi desk verification, or <code>null</code> if a osi desk verification with the primary key could not be found
	 */
	public OsiDeskVerification fetchByPrimaryKey(long osiDeskVerificationId);

	/**
	 * Returns all the osi desk verifications.
	 *
	 * @return the osi desk verifications
	 */
	public java.util.List<OsiDeskVerification> findAll();

	/**
	 * Returns a range of all the osi desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi desk verifications
	 * @param end the upper bound of the range of osi desk verifications (not inclusive)
	 * @return the range of osi desk verifications
	 */
	public java.util.List<OsiDeskVerification> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the osi desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi desk verifications
	 * @param end the upper bound of the range of osi desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi desk verifications
	 */
	public java.util.List<OsiDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiDeskVerification>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi desk verifications
	 * @param end the upper bound of the range of osi desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi desk verifications
	 */
	public java.util.List<OsiDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiDeskVerification>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi desk verifications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi desk verifications.
	 *
	 * @return the number of osi desk verifications
	 */
	public int countAll();

}