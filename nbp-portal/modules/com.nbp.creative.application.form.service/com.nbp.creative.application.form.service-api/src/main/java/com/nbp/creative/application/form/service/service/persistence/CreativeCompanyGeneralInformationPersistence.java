/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.creative.application.form.service.exception.NoSuchCreativeCompanyGeneralInformationException;
import com.nbp.creative.application.form.service.model.CreativeCompanyGeneralInformation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the creative company general information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyGeneralInformationUtil
 * @generated
 */
@ProviderType
public interface CreativeCompanyGeneralInformationPersistence
	extends BasePersistence<CreativeCompanyGeneralInformation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CreativeCompanyGeneralInformationUtil} to access the creative company general information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the creative company general information where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeCompanyGeneralInformationException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company general information
	 * @throws NoSuchCreativeCompanyGeneralInformationException if a matching creative company general information could not be found
	 */
	public CreativeCompanyGeneralInformation findBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeCompanyGeneralInformationException;

	/**
	 * Returns the creative company general information where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company general information, or <code>null</code> if a matching creative company general information could not be found
	 */
	public CreativeCompanyGeneralInformation fetchBygetCreativeById(
		long CreativeApplicationId);

	/**
	 * Returns the creative company general information where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative company general information, or <code>null</code> if a matching creative company general information could not be found
	 */
	public CreativeCompanyGeneralInformation fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache);

	/**
	 * Removes the creative company general information where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative company general information that was removed
	 */
	public CreativeCompanyGeneralInformation removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeCompanyGeneralInformationException;

	/**
	 * Returns the number of creative company general informations where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative company general informations
	 */
	public int countBygetCreativeById(long CreativeApplicationId);

	/**
	 * Caches the creative company general information in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyGeneralInformation the creative company general information
	 */
	public void cacheResult(
		CreativeCompanyGeneralInformation creativeCompanyGeneralInformation);

	/**
	 * Caches the creative company general informations in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyGeneralInformations the creative company general informations
	 */
	public void cacheResult(
		java.util.List<CreativeCompanyGeneralInformation>
			creativeCompanyGeneralInformations);

	/**
	 * Creates a new creative company general information with the primary key. Does not add the creative company general information to the database.
	 *
	 * @param creativeCompanyGeneralInfoId the primary key for the new creative company general information
	 * @return the new creative company general information
	 */
	public CreativeCompanyGeneralInformation create(
		long creativeCompanyGeneralInfoId);

	/**
	 * Removes the creative company general information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeCompanyGeneralInfoId the primary key of the creative company general information
	 * @return the creative company general information that was removed
	 * @throws NoSuchCreativeCompanyGeneralInformationException if a creative company general information with the primary key could not be found
	 */
	public CreativeCompanyGeneralInformation remove(
			long creativeCompanyGeneralInfoId)
		throws NoSuchCreativeCompanyGeneralInformationException;

	public CreativeCompanyGeneralInformation updateImpl(
		CreativeCompanyGeneralInformation creativeCompanyGeneralInformation);

	/**
	 * Returns the creative company general information with the primary key or throws a <code>NoSuchCreativeCompanyGeneralInformationException</code> if it could not be found.
	 *
	 * @param creativeCompanyGeneralInfoId the primary key of the creative company general information
	 * @return the creative company general information
	 * @throws NoSuchCreativeCompanyGeneralInformationException if a creative company general information with the primary key could not be found
	 */
	public CreativeCompanyGeneralInformation findByPrimaryKey(
			long creativeCompanyGeneralInfoId)
		throws NoSuchCreativeCompanyGeneralInformationException;

	/**
	 * Returns the creative company general information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeCompanyGeneralInfoId the primary key of the creative company general information
	 * @return the creative company general information, or <code>null</code> if a creative company general information with the primary key could not be found
	 */
	public CreativeCompanyGeneralInformation fetchByPrimaryKey(
		long creativeCompanyGeneralInfoId);

	/**
	 * Returns all the creative company general informations.
	 *
	 * @return the creative company general informations
	 */
	public java.util.List<CreativeCompanyGeneralInformation> findAll();

	/**
	 * Returns a range of all the creative company general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company general informations
	 * @param end the upper bound of the range of creative company general informations (not inclusive)
	 * @return the range of creative company general informations
	 */
	public java.util.List<CreativeCompanyGeneralInformation> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the creative company general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company general informations
	 * @param end the upper bound of the range of creative company general informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative company general informations
	 */
	public java.util.List<CreativeCompanyGeneralInformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeCompanyGeneralInformation> orderByComparator);

	/**
	 * Returns an ordered range of all the creative company general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company general informations
	 * @param end the upper bound of the range of creative company general informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative company general informations
	 */
	public java.util.List<CreativeCompanyGeneralInformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeCompanyGeneralInformation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the creative company general informations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of creative company general informations.
	 *
	 * @return the number of creative company general informations
	 */
	public int countAll();

}