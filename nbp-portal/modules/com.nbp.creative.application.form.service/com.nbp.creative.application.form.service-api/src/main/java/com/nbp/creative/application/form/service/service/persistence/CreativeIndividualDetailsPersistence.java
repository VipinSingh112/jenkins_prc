/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.creative.application.form.service.exception.NoSuchCreativeIndividualDetailsException;
import com.nbp.creative.application.form.service.model.CreativeIndividualDetails;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the creative individual details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualDetailsUtil
 * @generated
 */
@ProviderType
public interface CreativeIndividualDetailsPersistence
	extends BasePersistence<CreativeIndividualDetails> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CreativeIndividualDetailsUtil} to access the creative individual details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the creative individual details where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeIndividualDetailsException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative individual details
	 * @throws NoSuchCreativeIndividualDetailsException if a matching creative individual details could not be found
	 */
	public CreativeIndividualDetails findBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeIndividualDetailsException;

	/**
	 * Returns the creative individual details where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative individual details, or <code>null</code> if a matching creative individual details could not be found
	 */
	public CreativeIndividualDetails fetchBygetCreativeById(
		long CreativeApplicationId);

	/**
	 * Returns the creative individual details where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative individual details, or <code>null</code> if a matching creative individual details could not be found
	 */
	public CreativeIndividualDetails fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache);

	/**
	 * Removes the creative individual details where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative individual details that was removed
	 */
	public CreativeIndividualDetails removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeIndividualDetailsException;

	/**
	 * Returns the number of creative individual detailses where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative individual detailses
	 */
	public int countBygetCreativeById(long CreativeApplicationId);

	/**
	 * Caches the creative individual details in the entity cache if it is enabled.
	 *
	 * @param creativeIndividualDetails the creative individual details
	 */
	public void cacheResult(
		CreativeIndividualDetails creativeIndividualDetails);

	/**
	 * Caches the creative individual detailses in the entity cache if it is enabled.
	 *
	 * @param creativeIndividualDetailses the creative individual detailses
	 */
	public void cacheResult(
		java.util.List<CreativeIndividualDetails> creativeIndividualDetailses);

	/**
	 * Creates a new creative individual details with the primary key. Does not add the creative individual details to the database.
	 *
	 * @param creativeIndividualDetailsId the primary key for the new creative individual details
	 * @return the new creative individual details
	 */
	public CreativeIndividualDetails create(long creativeIndividualDetailsId);

	/**
	 * Removes the creative individual details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeIndividualDetailsId the primary key of the creative individual details
	 * @return the creative individual details that was removed
	 * @throws NoSuchCreativeIndividualDetailsException if a creative individual details with the primary key could not be found
	 */
	public CreativeIndividualDetails remove(long creativeIndividualDetailsId)
		throws NoSuchCreativeIndividualDetailsException;

	public CreativeIndividualDetails updateImpl(
		CreativeIndividualDetails creativeIndividualDetails);

	/**
	 * Returns the creative individual details with the primary key or throws a <code>NoSuchCreativeIndividualDetailsException</code> if it could not be found.
	 *
	 * @param creativeIndividualDetailsId the primary key of the creative individual details
	 * @return the creative individual details
	 * @throws NoSuchCreativeIndividualDetailsException if a creative individual details with the primary key could not be found
	 */
	public CreativeIndividualDetails findByPrimaryKey(
			long creativeIndividualDetailsId)
		throws NoSuchCreativeIndividualDetailsException;

	/**
	 * Returns the creative individual details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeIndividualDetailsId the primary key of the creative individual details
	 * @return the creative individual details, or <code>null</code> if a creative individual details with the primary key could not be found
	 */
	public CreativeIndividualDetails fetchByPrimaryKey(
		long creativeIndividualDetailsId);

	/**
	 * Returns all the creative individual detailses.
	 *
	 * @return the creative individual detailses
	 */
	public java.util.List<CreativeIndividualDetails> findAll();

	/**
	 * Returns a range of all the creative individual detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual detailses
	 * @param end the upper bound of the range of creative individual detailses (not inclusive)
	 * @return the range of creative individual detailses
	 */
	public java.util.List<CreativeIndividualDetails> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the creative individual detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual detailses
	 * @param end the upper bound of the range of creative individual detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative individual detailses
	 */
	public java.util.List<CreativeIndividualDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeIndividualDetails> orderByComparator);

	/**
	 * Returns an ordered range of all the creative individual detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual detailses
	 * @param end the upper bound of the range of creative individual detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative individual detailses
	 */
	public java.util.List<CreativeIndividualDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeIndividualDetails> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the creative individual detailses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of creative individual detailses.
	 *
	 * @return the number of creative individual detailses
	 */
	public int countAll();

}