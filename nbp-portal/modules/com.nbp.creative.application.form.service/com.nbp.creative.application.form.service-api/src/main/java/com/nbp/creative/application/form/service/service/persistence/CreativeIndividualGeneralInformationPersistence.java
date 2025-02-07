/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.creative.application.form.service.exception.NoSuchCreativeIndividualGeneralInformationException;
import com.nbp.creative.application.form.service.model.CreativeIndividualGeneralInformation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the creative individual general information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualGeneralInformationUtil
 * @generated
 */
@ProviderType
public interface CreativeIndividualGeneralInformationPersistence
	extends BasePersistence<CreativeIndividualGeneralInformation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CreativeIndividualGeneralInformationUtil} to access the creative individual general information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the creative individual general information where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeIndividualGeneralInformationException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative individual general information
	 * @throws NoSuchCreativeIndividualGeneralInformationException if a matching creative individual general information could not be found
	 */
	public CreativeIndividualGeneralInformation findBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeIndividualGeneralInformationException;

	/**
	 * Returns the creative individual general information where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative individual general information, or <code>null</code> if a matching creative individual general information could not be found
	 */
	public CreativeIndividualGeneralInformation fetchBygetCreativeById(
		long CreativeApplicationId);

	/**
	 * Returns the creative individual general information where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative individual general information, or <code>null</code> if a matching creative individual general information could not be found
	 */
	public CreativeIndividualGeneralInformation fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache);

	/**
	 * Removes the creative individual general information where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative individual general information that was removed
	 */
	public CreativeIndividualGeneralInformation removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeIndividualGeneralInformationException;

	/**
	 * Returns the number of creative individual general informations where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative individual general informations
	 */
	public int countBygetCreativeById(long CreativeApplicationId);

	/**
	 * Caches the creative individual general information in the entity cache if it is enabled.
	 *
	 * @param creativeIndividualGeneralInformation the creative individual general information
	 */
	public void cacheResult(
		CreativeIndividualGeneralInformation
			creativeIndividualGeneralInformation);

	/**
	 * Caches the creative individual general informations in the entity cache if it is enabled.
	 *
	 * @param creativeIndividualGeneralInformations the creative individual general informations
	 */
	public void cacheResult(
		java.util.List<CreativeIndividualGeneralInformation>
			creativeIndividualGeneralInformations);

	/**
	 * Creates a new creative individual general information with the primary key. Does not add the creative individual general information to the database.
	 *
	 * @param creativeIndiGeneralInfoId the primary key for the new creative individual general information
	 * @return the new creative individual general information
	 */
	public CreativeIndividualGeneralInformation create(
		long creativeIndiGeneralInfoId);

	/**
	 * Removes the creative individual general information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeIndiGeneralInfoId the primary key of the creative individual general information
	 * @return the creative individual general information that was removed
	 * @throws NoSuchCreativeIndividualGeneralInformationException if a creative individual general information with the primary key could not be found
	 */
	public CreativeIndividualGeneralInformation remove(
			long creativeIndiGeneralInfoId)
		throws NoSuchCreativeIndividualGeneralInformationException;

	public CreativeIndividualGeneralInformation updateImpl(
		CreativeIndividualGeneralInformation
			creativeIndividualGeneralInformation);

	/**
	 * Returns the creative individual general information with the primary key or throws a <code>NoSuchCreativeIndividualGeneralInformationException</code> if it could not be found.
	 *
	 * @param creativeIndiGeneralInfoId the primary key of the creative individual general information
	 * @return the creative individual general information
	 * @throws NoSuchCreativeIndividualGeneralInformationException if a creative individual general information with the primary key could not be found
	 */
	public CreativeIndividualGeneralInformation findByPrimaryKey(
			long creativeIndiGeneralInfoId)
		throws NoSuchCreativeIndividualGeneralInformationException;

	/**
	 * Returns the creative individual general information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeIndiGeneralInfoId the primary key of the creative individual general information
	 * @return the creative individual general information, or <code>null</code> if a creative individual general information with the primary key could not be found
	 */
	public CreativeIndividualGeneralInformation fetchByPrimaryKey(
		long creativeIndiGeneralInfoId);

	/**
	 * Returns all the creative individual general informations.
	 *
	 * @return the creative individual general informations
	 */
	public java.util.List<CreativeIndividualGeneralInformation> findAll();

	/**
	 * Returns a range of all the creative individual general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual general informations
	 * @param end the upper bound of the range of creative individual general informations (not inclusive)
	 * @return the range of creative individual general informations
	 */
	public java.util.List<CreativeIndividualGeneralInformation> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the creative individual general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual general informations
	 * @param end the upper bound of the range of creative individual general informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative individual general informations
	 */
	public java.util.List<CreativeIndividualGeneralInformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeIndividualGeneralInformation> orderByComparator);

	/**
	 * Returns an ordered range of all the creative individual general informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualGeneralInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual general informations
	 * @param end the upper bound of the range of creative individual general informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative individual general informations
	 */
	public java.util.List<CreativeIndividualGeneralInformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeIndividualGeneralInformation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the creative individual general informations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of creative individual general informations.
	 *
	 * @return the number of creative individual general informations
	 */
	public int countAll();

}