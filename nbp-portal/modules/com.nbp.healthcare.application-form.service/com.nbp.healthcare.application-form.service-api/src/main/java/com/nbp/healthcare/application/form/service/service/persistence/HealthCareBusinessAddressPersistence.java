/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.healthcare.application.form.service.exception.NoSuchHealthCareBusinessAddressException;
import com.nbp.healthcare.application.form.service.model.HealthCareBusinessAddress;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the health care business address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareBusinessAddressUtil
 * @generated
 */
@ProviderType
public interface HealthCareBusinessAddressPersistence
	extends BasePersistence<HealthCareBusinessAddress> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HealthCareBusinessAddressUtil} to access the health care business address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the health care business address where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareBusinessAddressException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care business address
	 * @throws NoSuchHealthCareBusinessAddressException if a matching health care business address could not be found
	 */
	public HealthCareBusinessAddress findBygetHealthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareBusinessAddressException;

	/**
	 * Returns the health care business address where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care business address, or <code>null</code> if a matching health care business address could not be found
	 */
	public HealthCareBusinessAddress fetchBygetHealthCareById(
		long healthCareApplicationId);

	/**
	 * Returns the health care business address where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care business address, or <code>null</code> if a matching health care business address could not be found
	 */
	public HealthCareBusinessAddress fetchBygetHealthCareById(
		long healthCareApplicationId, boolean useFinderCache);

	/**
	 * Removes the health care business address where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care business address that was removed
	 */
	public HealthCareBusinessAddress removeBygetHealthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareBusinessAddressException;

	/**
	 * Returns the number of health care business addresses where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care business addresses
	 */
	public int countBygetHealthCareById(long healthCareApplicationId);

	/**
	 * Caches the health care business address in the entity cache if it is enabled.
	 *
	 * @param healthCareBusinessAddress the health care business address
	 */
	public void cacheResult(
		HealthCareBusinessAddress healthCareBusinessAddress);

	/**
	 * Caches the health care business addresses in the entity cache if it is enabled.
	 *
	 * @param healthCareBusinessAddresses the health care business addresses
	 */
	public void cacheResult(
		java.util.List<HealthCareBusinessAddress> healthCareBusinessAddresses);

	/**
	 * Creates a new health care business address with the primary key. Does not add the health care business address to the database.
	 *
	 * @param healthCareBusinessAddressId the primary key for the new health care business address
	 * @return the new health care business address
	 */
	public HealthCareBusinessAddress create(long healthCareBusinessAddressId);

	/**
	 * Removes the health care business address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareBusinessAddressId the primary key of the health care business address
	 * @return the health care business address that was removed
	 * @throws NoSuchHealthCareBusinessAddressException if a health care business address with the primary key could not be found
	 */
	public HealthCareBusinessAddress remove(long healthCareBusinessAddressId)
		throws NoSuchHealthCareBusinessAddressException;

	public HealthCareBusinessAddress updateImpl(
		HealthCareBusinessAddress healthCareBusinessAddress);

	/**
	 * Returns the health care business address with the primary key or throws a <code>NoSuchHealthCareBusinessAddressException</code> if it could not be found.
	 *
	 * @param healthCareBusinessAddressId the primary key of the health care business address
	 * @return the health care business address
	 * @throws NoSuchHealthCareBusinessAddressException if a health care business address with the primary key could not be found
	 */
	public HealthCareBusinessAddress findByPrimaryKey(
			long healthCareBusinessAddressId)
		throws NoSuchHealthCareBusinessAddressException;

	/**
	 * Returns the health care business address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareBusinessAddressId the primary key of the health care business address
	 * @return the health care business address, or <code>null</code> if a health care business address with the primary key could not be found
	 */
	public HealthCareBusinessAddress fetchByPrimaryKey(
		long healthCareBusinessAddressId);

	/**
	 * Returns all the health care business addresses.
	 *
	 * @return the health care business addresses
	 */
	public java.util.List<HealthCareBusinessAddress> findAll();

	/**
	 * Returns a range of all the health care business addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareBusinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care business addresses
	 * @param end the upper bound of the range of health care business addresses (not inclusive)
	 * @return the range of health care business addresses
	 */
	public java.util.List<HealthCareBusinessAddress> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the health care business addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareBusinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care business addresses
	 * @param end the upper bound of the range of health care business addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care business addresses
	 */
	public java.util.List<HealthCareBusinessAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthCareBusinessAddress> orderByComparator);

	/**
	 * Returns an ordered range of all the health care business addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareBusinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care business addresses
	 * @param end the upper bound of the range of health care business addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care business addresses
	 */
	public java.util.List<HealthCareBusinessAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthCareBusinessAddress> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the health care business addresses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of health care business addresses.
	 *
	 * @return the number of health care business addresses
	 */
	public int countAll();

}