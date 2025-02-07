/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.agriculture.stages.services.exception.NoSuchAgriDeskVerificationException;
import com.nbp.agriculture.stages.services.model.AgriDeskVerification;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the agri desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgriDeskVerificationUtil
 * @generated
 */
@ProviderType
public interface AgriDeskVerificationPersistence
	extends BasePersistence<AgriDeskVerification> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AgriDeskVerificationUtil} to access the agri desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the agri desk verifications where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agri desk verifications
	 */
	public java.util.List<AgriDeskVerification>
		findBygetDeskVerificationAgri_ById(long agricultureApplicationId);

	/**
	 * Returns a range of all the agri desk verifications where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agri desk verifications
	 * @param end the upper bound of the range of agri desk verifications (not inclusive)
	 * @return the range of matching agri desk verifications
	 */
	public java.util.List<AgriDeskVerification>
		findBygetDeskVerificationAgri_ById(
			long agricultureApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the agri desk verifications where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agri desk verifications
	 * @param end the upper bound of the range of agri desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agri desk verifications
	 */
	public java.util.List<AgriDeskVerification>
		findBygetDeskVerificationAgri_ById(
			long agricultureApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgriDeskVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the agri desk verifications where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agri desk verifications
	 * @param end the upper bound of the range of agri desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agri desk verifications
	 */
	public java.util.List<AgriDeskVerification>
		findBygetDeskVerificationAgri_ById(
			long agricultureApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgriDeskVerification> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first agri desk verification in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agri desk verification
	 * @throws NoSuchAgriDeskVerificationException if a matching agri desk verification could not be found
	 */
	public AgriDeskVerification findBygetDeskVerificationAgri_ById_First(
			long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgriDeskVerification> orderByComparator)
		throws NoSuchAgriDeskVerificationException;

	/**
	 * Returns the first agri desk verification in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agri desk verification, or <code>null</code> if a matching agri desk verification could not be found
	 */
	public AgriDeskVerification fetchBygetDeskVerificationAgri_ById_First(
		long agricultureApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgriDeskVerification>
			orderByComparator);

	/**
	 * Returns the last agri desk verification in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agri desk verification
	 * @throws NoSuchAgriDeskVerificationException if a matching agri desk verification could not be found
	 */
	public AgriDeskVerification findBygetDeskVerificationAgri_ById_Last(
			long agricultureApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgriDeskVerification> orderByComparator)
		throws NoSuchAgriDeskVerificationException;

	/**
	 * Returns the last agri desk verification in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agri desk verification, or <code>null</code> if a matching agri desk verification could not be found
	 */
	public AgriDeskVerification fetchBygetDeskVerificationAgri_ById_Last(
		long agricultureApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<AgriDeskVerification>
			orderByComparator);

	/**
	 * Returns the agri desk verifications before and after the current agri desk verification in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agriDeskVerificationId the primary key of the current agri desk verification
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agri desk verification
	 * @throws NoSuchAgriDeskVerificationException if a agri desk verification with the primary key could not be found
	 */
	public AgriDeskVerification[]
			findBygetDeskVerificationAgri_ById_PrevAndNext(
				long agriDeskVerificationId, long agricultureApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<AgriDeskVerification> orderByComparator)
		throws NoSuchAgriDeskVerificationException;

	/**
	 * Removes all the agri desk verifications where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	public void removeBygetDeskVerificationAgri_ById(
		long agricultureApplicationId);

	/**
	 * Returns the number of agri desk verifications where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agri desk verifications
	 */
	public int countBygetDeskVerificationAgri_ById(
		long agricultureApplicationId);

	/**
	 * Caches the agri desk verification in the entity cache if it is enabled.
	 *
	 * @param agriDeskVerification the agri desk verification
	 */
	public void cacheResult(AgriDeskVerification agriDeskVerification);

	/**
	 * Caches the agri desk verifications in the entity cache if it is enabled.
	 *
	 * @param agriDeskVerifications the agri desk verifications
	 */
	public void cacheResult(
		java.util.List<AgriDeskVerification> agriDeskVerifications);

	/**
	 * Creates a new agri desk verification with the primary key. Does not add the agri desk verification to the database.
	 *
	 * @param agriDeskVerificationId the primary key for the new agri desk verification
	 * @return the new agri desk verification
	 */
	public AgriDeskVerification create(long agriDeskVerificationId);

	/**
	 * Removes the agri desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agriDeskVerificationId the primary key of the agri desk verification
	 * @return the agri desk verification that was removed
	 * @throws NoSuchAgriDeskVerificationException if a agri desk verification with the primary key could not be found
	 */
	public AgriDeskVerification remove(long agriDeskVerificationId)
		throws NoSuchAgriDeskVerificationException;

	public AgriDeskVerification updateImpl(
		AgriDeskVerification agriDeskVerification);

	/**
	 * Returns the agri desk verification with the primary key or throws a <code>NoSuchAgriDeskVerificationException</code> if it could not be found.
	 *
	 * @param agriDeskVerificationId the primary key of the agri desk verification
	 * @return the agri desk verification
	 * @throws NoSuchAgriDeskVerificationException if a agri desk verification with the primary key could not be found
	 */
	public AgriDeskVerification findByPrimaryKey(long agriDeskVerificationId)
		throws NoSuchAgriDeskVerificationException;

	/**
	 * Returns the agri desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agriDeskVerificationId the primary key of the agri desk verification
	 * @return the agri desk verification, or <code>null</code> if a agri desk verification with the primary key could not be found
	 */
	public AgriDeskVerification fetchByPrimaryKey(long agriDeskVerificationId);

	/**
	 * Returns all the agri desk verifications.
	 *
	 * @return the agri desk verifications
	 */
	public java.util.List<AgriDeskVerification> findAll();

	/**
	 * Returns a range of all the agri desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agri desk verifications
	 * @param end the upper bound of the range of agri desk verifications (not inclusive)
	 * @return the range of agri desk verifications
	 */
	public java.util.List<AgriDeskVerification> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the agri desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agri desk verifications
	 * @param end the upper bound of the range of agri desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agri desk verifications
	 */
	public java.util.List<AgriDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgriDeskVerification>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agri desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agri desk verifications
	 * @param end the upper bound of the range of agri desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agri desk verifications
	 */
	public java.util.List<AgriDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgriDeskVerification>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the agri desk verifications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of agri desk verifications.
	 *
	 * @return the number of agri desk verifications
	 */
	public int countAll();

}