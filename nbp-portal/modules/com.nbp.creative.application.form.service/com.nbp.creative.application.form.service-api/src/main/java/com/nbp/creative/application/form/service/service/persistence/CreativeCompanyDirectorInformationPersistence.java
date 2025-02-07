/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.creative.application.form.service.exception.NoSuchCreativeCompanyDirectorInformationException;
import com.nbp.creative.application.form.service.model.CreativeCompanyDirectorInformation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the creative company director information service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDirectorInformationUtil
 * @generated
 */
@ProviderType
public interface CreativeCompanyDirectorInformationPersistence
	extends BasePersistence<CreativeCompanyDirectorInformation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CreativeCompanyDirectorInformationUtil} to access the creative company director information persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the creative company director information where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeCompanyDirectorInformationException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company director information
	 * @throws NoSuchCreativeCompanyDirectorInformationException if a matching creative company director information could not be found
	 */
	public CreativeCompanyDirectorInformation findBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeCompanyDirectorInformationException;

	/**
	 * Returns the creative company director information where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company director information, or <code>null</code> if a matching creative company director information could not be found
	 */
	public CreativeCompanyDirectorInformation fetchBygetCreativeById(
		long CreativeApplicationId);

	/**
	 * Returns the creative company director information where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative company director information, or <code>null</code> if a matching creative company director information could not be found
	 */
	public CreativeCompanyDirectorInformation fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache);

	/**
	 * Removes the creative company director information where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative company director information that was removed
	 */
	public CreativeCompanyDirectorInformation removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeCompanyDirectorInformationException;

	/**
	 * Returns the number of creative company director informations where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative company director informations
	 */
	public int countBygetCreativeById(long CreativeApplicationId);

	/**
	 * Caches the creative company director information in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyDirectorInformation the creative company director information
	 */
	public void cacheResult(
		CreativeCompanyDirectorInformation creativeCompanyDirectorInformation);

	/**
	 * Caches the creative company director informations in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyDirectorInformations the creative company director informations
	 */
	public void cacheResult(
		java.util.List<CreativeCompanyDirectorInformation>
			creativeCompanyDirectorInformations);

	/**
	 * Creates a new creative company director information with the primary key. Does not add the creative company director information to the database.
	 *
	 * @param creativeComDirectorInfoId the primary key for the new creative company director information
	 * @return the new creative company director information
	 */
	public CreativeCompanyDirectorInformation create(
		long creativeComDirectorInfoId);

	/**
	 * Removes the creative company director information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeComDirectorInfoId the primary key of the creative company director information
	 * @return the creative company director information that was removed
	 * @throws NoSuchCreativeCompanyDirectorInformationException if a creative company director information with the primary key could not be found
	 */
	public CreativeCompanyDirectorInformation remove(
			long creativeComDirectorInfoId)
		throws NoSuchCreativeCompanyDirectorInformationException;

	public CreativeCompanyDirectorInformation updateImpl(
		CreativeCompanyDirectorInformation creativeCompanyDirectorInformation);

	/**
	 * Returns the creative company director information with the primary key or throws a <code>NoSuchCreativeCompanyDirectorInformationException</code> if it could not be found.
	 *
	 * @param creativeComDirectorInfoId the primary key of the creative company director information
	 * @return the creative company director information
	 * @throws NoSuchCreativeCompanyDirectorInformationException if a creative company director information with the primary key could not be found
	 */
	public CreativeCompanyDirectorInformation findByPrimaryKey(
			long creativeComDirectorInfoId)
		throws NoSuchCreativeCompanyDirectorInformationException;

	/**
	 * Returns the creative company director information with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeComDirectorInfoId the primary key of the creative company director information
	 * @return the creative company director information, or <code>null</code> if a creative company director information with the primary key could not be found
	 */
	public CreativeCompanyDirectorInformation fetchByPrimaryKey(
		long creativeComDirectorInfoId);

	/**
	 * Returns all the creative company director informations.
	 *
	 * @return the creative company director informations
	 */
	public java.util.List<CreativeCompanyDirectorInformation> findAll();

	/**
	 * Returns a range of all the creative company director informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDirectorInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company director informations
	 * @param end the upper bound of the range of creative company director informations (not inclusive)
	 * @return the range of creative company director informations
	 */
	public java.util.List<CreativeCompanyDirectorInformation> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the creative company director informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDirectorInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company director informations
	 * @param end the upper bound of the range of creative company director informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative company director informations
	 */
	public java.util.List<CreativeCompanyDirectorInformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeCompanyDirectorInformation> orderByComparator);

	/**
	 * Returns an ordered range of all the creative company director informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDirectorInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company director informations
	 * @param end the upper bound of the range of creative company director informations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative company director informations
	 */
	public java.util.List<CreativeCompanyDirectorInformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeCompanyDirectorInformation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the creative company director informations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of creative company director informations.
	 *
	 * @return the number of creative company director informations
	 */
	public int countAll();

}