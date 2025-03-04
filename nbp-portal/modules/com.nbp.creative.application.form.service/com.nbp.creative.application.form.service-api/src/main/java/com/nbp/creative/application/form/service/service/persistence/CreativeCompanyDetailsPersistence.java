/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.creative.application.form.service.exception.NoSuchCreativeCompanyDetailsException;
import com.nbp.creative.application.form.service.model.CreativeCompanyDetails;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the creative company details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDetailsUtil
 * @generated
 */
@ProviderType
public interface CreativeCompanyDetailsPersistence
	extends BasePersistence<CreativeCompanyDetails> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CreativeCompanyDetailsUtil} to access the creative company details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the creative company details where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeCompanyDetailsException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company details
	 * @throws NoSuchCreativeCompanyDetailsException if a matching creative company details could not be found
	 */
	public CreativeCompanyDetails findBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeCompanyDetailsException;

	/**
	 * Returns the creative company details where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company details, or <code>null</code> if a matching creative company details could not be found
	 */
	public CreativeCompanyDetails fetchBygetCreativeById(
		long CreativeApplicationId);

	/**
	 * Returns the creative company details where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative company details, or <code>null</code> if a matching creative company details could not be found
	 */
	public CreativeCompanyDetails fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache);

	/**
	 * Removes the creative company details where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative company details that was removed
	 */
	public CreativeCompanyDetails removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeCompanyDetailsException;

	/**
	 * Returns the number of creative company detailses where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative company detailses
	 */
	public int countBygetCreativeById(long CreativeApplicationId);

	/**
	 * Caches the creative company details in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyDetails the creative company details
	 */
	public void cacheResult(CreativeCompanyDetails creativeCompanyDetails);

	/**
	 * Caches the creative company detailses in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyDetailses the creative company detailses
	 */
	public void cacheResult(
		java.util.List<CreativeCompanyDetails> creativeCompanyDetailses);

	/**
	 * Creates a new creative company details with the primary key. Does not add the creative company details to the database.
	 *
	 * @param creativeCompanyDetailsId the primary key for the new creative company details
	 * @return the new creative company details
	 */
	public CreativeCompanyDetails create(long creativeCompanyDetailsId);

	/**
	 * Removes the creative company details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeCompanyDetailsId the primary key of the creative company details
	 * @return the creative company details that was removed
	 * @throws NoSuchCreativeCompanyDetailsException if a creative company details with the primary key could not be found
	 */
	public CreativeCompanyDetails remove(long creativeCompanyDetailsId)
		throws NoSuchCreativeCompanyDetailsException;

	public CreativeCompanyDetails updateImpl(
		CreativeCompanyDetails creativeCompanyDetails);

	/**
	 * Returns the creative company details with the primary key or throws a <code>NoSuchCreativeCompanyDetailsException</code> if it could not be found.
	 *
	 * @param creativeCompanyDetailsId the primary key of the creative company details
	 * @return the creative company details
	 * @throws NoSuchCreativeCompanyDetailsException if a creative company details with the primary key could not be found
	 */
	public CreativeCompanyDetails findByPrimaryKey(
			long creativeCompanyDetailsId)
		throws NoSuchCreativeCompanyDetailsException;

	/**
	 * Returns the creative company details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeCompanyDetailsId the primary key of the creative company details
	 * @return the creative company details, or <code>null</code> if a creative company details with the primary key could not be found
	 */
	public CreativeCompanyDetails fetchByPrimaryKey(
		long creativeCompanyDetailsId);

	/**
	 * Returns all the creative company detailses.
	 *
	 * @return the creative company detailses
	 */
	public java.util.List<CreativeCompanyDetails> findAll();

	/**
	 * Returns a range of all the creative company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company detailses
	 * @param end the upper bound of the range of creative company detailses (not inclusive)
	 * @return the range of creative company detailses
	 */
	public java.util.List<CreativeCompanyDetails> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the creative company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company detailses
	 * @param end the upper bound of the range of creative company detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative company detailses
	 */
	public java.util.List<CreativeCompanyDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeCompanyDetails>
			orderByComparator);

	/**
	 * Returns an ordered range of all the creative company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company detailses
	 * @param end the upper bound of the range of creative company detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative company detailses
	 */
	public java.util.List<CreativeCompanyDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeCompanyDetails>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the creative company detailses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of creative company detailses.
	 *
	 * @return the number of creative company detailses
	 */
	public int countAll();

}