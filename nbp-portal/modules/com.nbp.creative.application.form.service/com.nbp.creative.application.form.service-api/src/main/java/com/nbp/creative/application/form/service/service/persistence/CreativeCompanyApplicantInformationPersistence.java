/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.creative.application.form.service.exception.NoSuchCreativeCompanyApplicantInformationException;
import com.nbp.creative.application.form.service.model.CreativeCompanyApplicantInformation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the creative company applicant information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyApplicantInformationUtil
 * @generated
 */
@ProviderType
public interface CreativeCompanyApplicantInformationPersistence
	extends BasePersistence<CreativeCompanyApplicantInformation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CreativeCompanyApplicantInformationUtil} to access the creative company applicant information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the creative company applicant information where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeCompanyApplicantInformationException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company applicant information
	 * @throws NoSuchCreativeCompanyApplicantInformationException if a matching creative company applicant information could not be found
	 */
	public CreativeCompanyApplicantInformation findBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeCompanyApplicantInformationException;

	/**
	 * Returns the creative company applicant information where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company applicant information, or <code>null</code> if a matching creative company applicant information could not be found
	 */
	public CreativeCompanyApplicantInformation fetchBygetCreativeById(
		long CreativeApplicationId);

	/**
	 * Returns the creative company applicant information where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative company applicant information, or <code>null</code> if a matching creative company applicant information could not be found
	 */
	public CreativeCompanyApplicantInformation fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache);

	/**
	 * Removes the creative company applicant information where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative company applicant information that was removed
	 */
	public CreativeCompanyApplicantInformation removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeCompanyApplicantInformationException;

	/**
	 * Returns the number of creative company applicant informations where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative company applicant informations
	 */
	public int countBygetCreativeById(long CreativeApplicationId);

	/**
	 * Caches the creative company applicant information in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyApplicantInformation the creative company applicant information
	 */
	public void cacheResult(
		CreativeCompanyApplicantInformation
			creativeCompanyApplicantInformation);

	/**
	 * Caches the creative company applicant informations in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyApplicantInformations the creative company applicant informations
	 */
	public void cacheResult(
		java.util.List<CreativeCompanyApplicantInformation>
			creativeCompanyApplicantInformations);

	/**
	 * Creates a new creative company applicant information with the primary key. Does not add the creative company applicant information to the database.
	 *
	 * @param creativeCompanyApplicantInfoId the primary key for the new creative company applicant information
	 * @return the new creative company applicant information
	 */
	public CreativeCompanyApplicantInformation create(
		long creativeCompanyApplicantInfoId);

	/**
	 * Removes the creative company applicant information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeCompanyApplicantInfoId the primary key of the creative company applicant information
	 * @return the creative company applicant information that was removed
	 * @throws NoSuchCreativeCompanyApplicantInformationException if a creative company applicant information with the primary key could not be found
	 */
	public CreativeCompanyApplicantInformation remove(
			long creativeCompanyApplicantInfoId)
		throws NoSuchCreativeCompanyApplicantInformationException;

	public CreativeCompanyApplicantInformation updateImpl(
		CreativeCompanyApplicantInformation
			creativeCompanyApplicantInformation);

	/**
	 * Returns the creative company applicant information with the primary key or throws a <code>NoSuchCreativeCompanyApplicantInformationException</code> if it could not be found.
	 *
	 * @param creativeCompanyApplicantInfoId the primary key of the creative company applicant information
	 * @return the creative company applicant information
	 * @throws NoSuchCreativeCompanyApplicantInformationException if a creative company applicant information with the primary key could not be found
	 */
	public CreativeCompanyApplicantInformation findByPrimaryKey(
			long creativeCompanyApplicantInfoId)
		throws NoSuchCreativeCompanyApplicantInformationException;

	/**
	 * Returns the creative company applicant information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeCompanyApplicantInfoId the primary key of the creative company applicant information
	 * @return the creative company applicant information, or <code>null</code> if a creative company applicant information with the primary key could not be found
	 */
	public CreativeCompanyApplicantInformation fetchByPrimaryKey(
		long creativeCompanyApplicantInfoId);

	/**
	 * Returns all the creative company applicant informations.
	 *
	 * @return the creative company applicant informations
	 */
	public java.util.List<CreativeCompanyApplicantInformation> findAll();

	/**
	 * Returns a range of all the creative company applicant informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyApplicantInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company applicant informations
	 * @param end the upper bound of the range of creative company applicant informations (not inclusive)
	 * @return the range of creative company applicant informations
	 */
	public java.util.List<CreativeCompanyApplicantInformation> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the creative company applicant informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyApplicantInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company applicant informations
	 * @param end the upper bound of the range of creative company applicant informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative company applicant informations
	 */
	public java.util.List<CreativeCompanyApplicantInformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeCompanyApplicantInformation> orderByComparator);

	/**
	 * Returns an ordered range of all the creative company applicant informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyApplicantInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company applicant informations
	 * @param end the upper bound of the range of creative company applicant informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative company applicant informations
	 */
	public java.util.List<CreativeCompanyApplicantInformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeCompanyApplicantInformation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the creative company applicant informations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of creative company applicant informations.
	 *
	 * @return the number of creative company applicant informations
	 */
	public int countAll();

}