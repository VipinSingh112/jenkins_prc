/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionPlaceOfInterestException;
import com.nbp.jtb.application.form.service.model.AttractionPlaceOfInterest;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the attraction place of interest service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionPlaceOfInterestUtil
 * @generated
 */
@ProviderType
public interface AttractionPlaceOfInterestPersistence
	extends BasePersistence<AttractionPlaceOfInterest> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttractionPlaceOfInterestUtil} to access the attraction place of interest persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the attraction place of interest where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionPlaceOfInterestException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction place of interest
	 * @throws NoSuchAttractionPlaceOfInterestException if a matching attraction place of interest could not be found
	 */
	public AttractionPlaceOfInterest findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionPlaceOfInterestException;

	/**
	 * Returns the attraction place of interest where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction place of interest, or <code>null</code> if a matching attraction place of interest could not be found
	 */
	public AttractionPlaceOfInterest fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the attraction place of interest where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction place of interest, or <code>null</code> if a matching attraction place of interest could not be found
	 */
	public AttractionPlaceOfInterest fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the attraction place of interest where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction place of interest that was removed
	 */
	public AttractionPlaceOfInterest removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionPlaceOfInterestException;

	/**
	 * Returns the number of attraction place of interests where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction place of interests
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the attraction place of interest in the entity cache if it is enabled.
	 *
	 * @param attractionPlaceOfInterest the attraction place of interest
	 */
	public void cacheResult(
		AttractionPlaceOfInterest attractionPlaceOfInterest);

	/**
	 * Caches the attraction place of interests in the entity cache if it is enabled.
	 *
	 * @param attractionPlaceOfInterests the attraction place of interests
	 */
	public void cacheResult(
		java.util.List<AttractionPlaceOfInterest> attractionPlaceOfInterests);

	/**
	 * Creates a new attraction place of interest with the primary key. Does not add the attraction place of interest to the database.
	 *
	 * @param attractionPlaceOfInterestId the primary key for the new attraction place of interest
	 * @return the new attraction place of interest
	 */
	public AttractionPlaceOfInterest create(long attractionPlaceOfInterestId);

	/**
	 * Removes the attraction place of interest with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionPlaceOfInterestId the primary key of the attraction place of interest
	 * @return the attraction place of interest that was removed
	 * @throws NoSuchAttractionPlaceOfInterestException if a attraction place of interest with the primary key could not be found
	 */
	public AttractionPlaceOfInterest remove(long attractionPlaceOfInterestId)
		throws NoSuchAttractionPlaceOfInterestException;

	public AttractionPlaceOfInterest updateImpl(
		AttractionPlaceOfInterest attractionPlaceOfInterest);

	/**
	 * Returns the attraction place of interest with the primary key or throws a <code>NoSuchAttractionPlaceOfInterestException</code> if it could not be found.
	 *
	 * @param attractionPlaceOfInterestId the primary key of the attraction place of interest
	 * @return the attraction place of interest
	 * @throws NoSuchAttractionPlaceOfInterestException if a attraction place of interest with the primary key could not be found
	 */
	public AttractionPlaceOfInterest findByPrimaryKey(
			long attractionPlaceOfInterestId)
		throws NoSuchAttractionPlaceOfInterestException;

	/**
	 * Returns the attraction place of interest with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionPlaceOfInterestId the primary key of the attraction place of interest
	 * @return the attraction place of interest, or <code>null</code> if a attraction place of interest with the primary key could not be found
	 */
	public AttractionPlaceOfInterest fetchByPrimaryKey(
		long attractionPlaceOfInterestId);

	/**
	 * Returns all the attraction place of interests.
	 *
	 * @return the attraction place of interests
	 */
	public java.util.List<AttractionPlaceOfInterest> findAll();

	/**
	 * Returns a range of all the attraction place of interests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionPlaceOfInterestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction place of interests
	 * @param end the upper bound of the range of attraction place of interests (not inclusive)
	 * @return the range of attraction place of interests
	 */
	public java.util.List<AttractionPlaceOfInterest> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the attraction place of interests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionPlaceOfInterestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction place of interests
	 * @param end the upper bound of the range of attraction place of interests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction place of interests
	 */
	public java.util.List<AttractionPlaceOfInterest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionPlaceOfInterest> orderByComparator);

	/**
	 * Returns an ordered range of all the attraction place of interests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionPlaceOfInterestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction place of interests
	 * @param end the upper bound of the range of attraction place of interests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction place of interests
	 */
	public java.util.List<AttractionPlaceOfInterest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionPlaceOfInterest> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the attraction place of interests from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of attraction place of interests.
	 *
	 * @return the number of attraction place of interests
	 */
	public int countAll();

}