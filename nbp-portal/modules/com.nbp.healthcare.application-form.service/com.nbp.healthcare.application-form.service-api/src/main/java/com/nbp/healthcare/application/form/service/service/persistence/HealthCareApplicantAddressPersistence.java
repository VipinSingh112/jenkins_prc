/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.healthcare.application.form.service.exception.NoSuchHealthCareApplicantAddressException;
import com.nbp.healthcare.application.form.service.model.HealthCareApplicantAddress;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the health care applicant address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicantAddressUtil
 * @generated
 */
@ProviderType
public interface HealthCareApplicantAddressPersistence
	extends BasePersistence<HealthCareApplicantAddress> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HealthCareApplicantAddressUtil} to access the health care applicant address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the health care applicant address where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareApplicantAddressException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care applicant address
	 * @throws NoSuchHealthCareApplicantAddressException if a matching health care applicant address could not be found
	 */
	public HealthCareApplicantAddress findBygetHealthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareApplicantAddressException;

	/**
	 * Returns the health care applicant address where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care applicant address, or <code>null</code> if a matching health care applicant address could not be found
	 */
	public HealthCareApplicantAddress fetchBygetHealthCareById(
		long healthCareApplicationId);

	/**
	 * Returns the health care applicant address where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care applicant address, or <code>null</code> if a matching health care applicant address could not be found
	 */
	public HealthCareApplicantAddress fetchBygetHealthCareById(
		long healthCareApplicationId, boolean useFinderCache);

	/**
	 * Removes the health care applicant address where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care applicant address that was removed
	 */
	public HealthCareApplicantAddress removeBygetHealthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareApplicantAddressException;

	/**
	 * Returns the number of health care applicant addresses where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care applicant addresses
	 */
	public int countBygetHealthCareById(long healthCareApplicationId);

	/**
	 * Caches the health care applicant address in the entity cache if it is enabled.
	 *
	 * @param healthCareApplicantAddress the health care applicant address
	 */
	public void cacheResult(
		HealthCareApplicantAddress healthCareApplicantAddress);

	/**
	 * Caches the health care applicant addresses in the entity cache if it is enabled.
	 *
	 * @param healthCareApplicantAddresses the health care applicant addresses
	 */
	public void cacheResult(
		java.util.List<HealthCareApplicantAddress>
			healthCareApplicantAddresses);

	/**
	 * Creates a new health care applicant address with the primary key. Does not add the health care applicant address to the database.
	 *
	 * @param healthCareApplicantAddressId the primary key for the new health care applicant address
	 * @return the new health care applicant address
	 */
	public HealthCareApplicantAddress create(long healthCareApplicantAddressId);

	/**
	 * Removes the health care applicant address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareApplicantAddressId the primary key of the health care applicant address
	 * @return the health care applicant address that was removed
	 * @throws NoSuchHealthCareApplicantAddressException if a health care applicant address with the primary key could not be found
	 */
	public HealthCareApplicantAddress remove(long healthCareApplicantAddressId)
		throws NoSuchHealthCareApplicantAddressException;

	public HealthCareApplicantAddress updateImpl(
		HealthCareApplicantAddress healthCareApplicantAddress);

	/**
	 * Returns the health care applicant address with the primary key or throws a <code>NoSuchHealthCareApplicantAddressException</code> if it could not be found.
	 *
	 * @param healthCareApplicantAddressId the primary key of the health care applicant address
	 * @return the health care applicant address
	 * @throws NoSuchHealthCareApplicantAddressException if a health care applicant address with the primary key could not be found
	 */
	public HealthCareApplicantAddress findByPrimaryKey(
			long healthCareApplicantAddressId)
		throws NoSuchHealthCareApplicantAddressException;

	/**
	 * Returns the health care applicant address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareApplicantAddressId the primary key of the health care applicant address
	 * @return the health care applicant address, or <code>null</code> if a health care applicant address with the primary key could not be found
	 */
	public HealthCareApplicantAddress fetchByPrimaryKey(
		long healthCareApplicantAddressId);

	/**
	 * Returns all the health care applicant addresses.
	 *
	 * @return the health care applicant addresses
	 */
	public java.util.List<HealthCareApplicantAddress> findAll();

	/**
	 * Returns a range of all the health care applicant addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicantAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applicant addresses
	 * @param end the upper bound of the range of health care applicant addresses (not inclusive)
	 * @return the range of health care applicant addresses
	 */
	public java.util.List<HealthCareApplicantAddress> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the health care applicant addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicantAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applicant addresses
	 * @param end the upper bound of the range of health care applicant addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care applicant addresses
	 */
	public java.util.List<HealthCareApplicantAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthCareApplicantAddress> orderByComparator);

	/**
	 * Returns an ordered range of all the health care applicant addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicantAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applicant addresses
	 * @param end the upper bound of the range of health care applicant addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care applicant addresses
	 */
	public java.util.List<HealthCareApplicantAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthCareApplicantAddress> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the health care applicant addresses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of health care applicant addresses.
	 *
	 * @return the number of health care applicant addresses
	 */
	public int countAll();

}