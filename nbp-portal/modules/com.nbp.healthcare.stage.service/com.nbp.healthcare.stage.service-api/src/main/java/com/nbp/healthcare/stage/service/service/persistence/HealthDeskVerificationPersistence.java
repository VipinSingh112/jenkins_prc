/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.healthcare.stage.service.exception.NoSuchHealthDeskVerificationException;
import com.nbp.healthcare.stage.service.model.HealthDeskVerification;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the health desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthDeskVerificationUtil
 * @generated
 */
@ProviderType
public interface HealthDeskVerificationPersistence
	extends BasePersistence<HealthDeskVerification> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HealthDeskVerificationUtil} to access the health desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the health desk verifications where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health desk verifications
	 */
	public java.util.List<HealthDeskVerification>
		findBygetDeskVerificationHealthById(long healthCareApplicationId);

	/**
	 * Returns a range of all the health desk verifications where healthCareApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param start the lower bound of the range of health desk verifications
	 * @param end the upper bound of the range of health desk verifications (not inclusive)
	 * @return the range of matching health desk verifications
	 */
	public java.util.List<HealthDeskVerification>
		findBygetDeskVerificationHealthById(
			long healthCareApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the health desk verifications where healthCareApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param start the lower bound of the range of health desk verifications
	 * @param end the upper bound of the range of health desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health desk verifications
	 */
	public java.util.List<HealthDeskVerification>
		findBygetDeskVerificationHealthById(
			long healthCareApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthDeskVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the health desk verifications where healthCareApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param start the lower bound of the range of health desk verifications
	 * @param end the upper bound of the range of health desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health desk verifications
	 */
	public java.util.List<HealthDeskVerification>
		findBygetDeskVerificationHealthById(
			long healthCareApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthDeskVerification> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first health desk verification in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health desk verification
	 * @throws NoSuchHealthDeskVerificationException if a matching health desk verification could not be found
	 */
	public HealthDeskVerification findBygetDeskVerificationHealthById_First(
			long healthCareApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthDeskVerification> orderByComparator)
		throws NoSuchHealthDeskVerificationException;

	/**
	 * Returns the first health desk verification in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health desk verification, or <code>null</code> if a matching health desk verification could not be found
	 */
	public HealthDeskVerification fetchBygetDeskVerificationHealthById_First(
		long healthCareApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<HealthDeskVerification>
			orderByComparator);

	/**
	 * Returns the last health desk verification in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health desk verification
	 * @throws NoSuchHealthDeskVerificationException if a matching health desk verification could not be found
	 */
	public HealthDeskVerification findBygetDeskVerificationHealthById_Last(
			long healthCareApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthDeskVerification> orderByComparator)
		throws NoSuchHealthDeskVerificationException;

	/**
	 * Returns the last health desk verification in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health desk verification, or <code>null</code> if a matching health desk verification could not be found
	 */
	public HealthDeskVerification fetchBygetDeskVerificationHealthById_Last(
		long healthCareApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<HealthDeskVerification>
			orderByComparator);

	/**
	 * Returns the health desk verifications before and after the current health desk verification in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthDeskVerificationId the primary key of the current health desk verification
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health desk verification
	 * @throws NoSuchHealthDeskVerificationException if a health desk verification with the primary key could not be found
	 */
	public HealthDeskVerification[]
			findBygetDeskVerificationHealthById_PrevAndNext(
				long healthDeskVerificationId, long healthCareApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<HealthDeskVerification> orderByComparator)
		throws NoSuchHealthDeskVerificationException;

	/**
	 * Removes all the health desk verifications where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 */
	public void removeBygetDeskVerificationHealthById(
		long healthCareApplicationId);

	/**
	 * Returns the number of health desk verifications where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health desk verifications
	 */
	public int countBygetDeskVerificationHealthById(
		long healthCareApplicationId);

	/**
	 * Caches the health desk verification in the entity cache if it is enabled.
	 *
	 * @param healthDeskVerification the health desk verification
	 */
	public void cacheResult(HealthDeskVerification healthDeskVerification);

	/**
	 * Caches the health desk verifications in the entity cache if it is enabled.
	 *
	 * @param healthDeskVerifications the health desk verifications
	 */
	public void cacheResult(
		java.util.List<HealthDeskVerification> healthDeskVerifications);

	/**
	 * Creates a new health desk verification with the primary key. Does not add the health desk verification to the database.
	 *
	 * @param healthDeskVerificationId the primary key for the new health desk verification
	 * @return the new health desk verification
	 */
	public HealthDeskVerification create(long healthDeskVerificationId);

	/**
	 * Removes the health desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthDeskVerificationId the primary key of the health desk verification
	 * @return the health desk verification that was removed
	 * @throws NoSuchHealthDeskVerificationException if a health desk verification with the primary key could not be found
	 */
	public HealthDeskVerification remove(long healthDeskVerificationId)
		throws NoSuchHealthDeskVerificationException;

	public HealthDeskVerification updateImpl(
		HealthDeskVerification healthDeskVerification);

	/**
	 * Returns the health desk verification with the primary key or throws a <code>NoSuchHealthDeskVerificationException</code> if it could not be found.
	 *
	 * @param healthDeskVerificationId the primary key of the health desk verification
	 * @return the health desk verification
	 * @throws NoSuchHealthDeskVerificationException if a health desk verification with the primary key could not be found
	 */
	public HealthDeskVerification findByPrimaryKey(
			long healthDeskVerificationId)
		throws NoSuchHealthDeskVerificationException;

	/**
	 * Returns the health desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthDeskVerificationId the primary key of the health desk verification
	 * @return the health desk verification, or <code>null</code> if a health desk verification with the primary key could not be found
	 */
	public HealthDeskVerification fetchByPrimaryKey(
		long healthDeskVerificationId);

	/**
	 * Returns all the health desk verifications.
	 *
	 * @return the health desk verifications
	 */
	public java.util.List<HealthDeskVerification> findAll();

	/**
	 * Returns a range of all the health desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health desk verifications
	 * @param end the upper bound of the range of health desk verifications (not inclusive)
	 * @return the range of health desk verifications
	 */
	public java.util.List<HealthDeskVerification> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the health desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health desk verifications
	 * @param end the upper bound of the range of health desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health desk verifications
	 */
	public java.util.List<HealthDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HealthDeskVerification>
			orderByComparator);

	/**
	 * Returns an ordered range of all the health desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health desk verifications
	 * @param end the upper bound of the range of health desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health desk verifications
	 */
	public java.util.List<HealthDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HealthDeskVerification>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the health desk verifications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of health desk verifications.
	 *
	 * @return the number of health desk verifications
	 */
	public int countAll();

}