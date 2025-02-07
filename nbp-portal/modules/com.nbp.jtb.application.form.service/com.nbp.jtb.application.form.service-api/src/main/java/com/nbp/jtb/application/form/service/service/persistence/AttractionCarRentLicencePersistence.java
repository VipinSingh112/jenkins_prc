/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionCarRentLicenceException;
import com.nbp.jtb.application.form.service.model.AttractionCarRentLicence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the attraction car rent licence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCarRentLicenceUtil
 * @generated
 */
@ProviderType
public interface AttractionCarRentLicencePersistence
	extends BasePersistence<AttractionCarRentLicence> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttractionCarRentLicenceUtil} to access the attraction car rent licence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the attraction car rent licence where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionCarRentLicenceException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction car rent licence
	 * @throws NoSuchAttractionCarRentLicenceException if a matching attraction car rent licence could not be found
	 */
	public AttractionCarRentLicence findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionCarRentLicenceException;

	/**
	 * Returns the attraction car rent licence where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction car rent licence, or <code>null</code> if a matching attraction car rent licence could not be found
	 */
	public AttractionCarRentLicence fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the attraction car rent licence where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction car rent licence, or <code>null</code> if a matching attraction car rent licence could not be found
	 */
	public AttractionCarRentLicence fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the attraction car rent licence where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction car rent licence that was removed
	 */
	public AttractionCarRentLicence removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionCarRentLicenceException;

	/**
	 * Returns the number of attraction car rent licences where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction car rent licences
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the attraction car rent licence in the entity cache if it is enabled.
	 *
	 * @param attractionCarRentLicence the attraction car rent licence
	 */
	public void cacheResult(AttractionCarRentLicence attractionCarRentLicence);

	/**
	 * Caches the attraction car rent licences in the entity cache if it is enabled.
	 *
	 * @param attractionCarRentLicences the attraction car rent licences
	 */
	public void cacheResult(
		java.util.List<AttractionCarRentLicence> attractionCarRentLicences);

	/**
	 * Creates a new attraction car rent licence with the primary key. Does not add the attraction car rent licence to the database.
	 *
	 * @param attractionCarRentLicenceId the primary key for the new attraction car rent licence
	 * @return the new attraction car rent licence
	 */
	public AttractionCarRentLicence create(long attractionCarRentLicenceId);

	/**
	 * Removes the attraction car rent licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionCarRentLicenceId the primary key of the attraction car rent licence
	 * @return the attraction car rent licence that was removed
	 * @throws NoSuchAttractionCarRentLicenceException if a attraction car rent licence with the primary key could not be found
	 */
	public AttractionCarRentLicence remove(long attractionCarRentLicenceId)
		throws NoSuchAttractionCarRentLicenceException;

	public AttractionCarRentLicence updateImpl(
		AttractionCarRentLicence attractionCarRentLicence);

	/**
	 * Returns the attraction car rent licence with the primary key or throws a <code>NoSuchAttractionCarRentLicenceException</code> if it could not be found.
	 *
	 * @param attractionCarRentLicenceId the primary key of the attraction car rent licence
	 * @return the attraction car rent licence
	 * @throws NoSuchAttractionCarRentLicenceException if a attraction car rent licence with the primary key could not be found
	 */
	public AttractionCarRentLicence findByPrimaryKey(
			long attractionCarRentLicenceId)
		throws NoSuchAttractionCarRentLicenceException;

	/**
	 * Returns the attraction car rent licence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionCarRentLicenceId the primary key of the attraction car rent licence
	 * @return the attraction car rent licence, or <code>null</code> if a attraction car rent licence with the primary key could not be found
	 */
	public AttractionCarRentLicence fetchByPrimaryKey(
		long attractionCarRentLicenceId);

	/**
	 * Returns all the attraction car rent licences.
	 *
	 * @return the attraction car rent licences
	 */
	public java.util.List<AttractionCarRentLicence> findAll();

	/**
	 * Returns a range of all the attraction car rent licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rent licences
	 * @param end the upper bound of the range of attraction car rent licences (not inclusive)
	 * @return the range of attraction car rent licences
	 */
	public java.util.List<AttractionCarRentLicence> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the attraction car rent licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rent licences
	 * @param end the upper bound of the range of attraction car rent licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction car rent licences
	 */
	public java.util.List<AttractionCarRentLicence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionCarRentLicence> orderByComparator);

	/**
	 * Returns an ordered range of all the attraction car rent licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rent licences
	 * @param end the upper bound of the range of attraction car rent licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction car rent licences
	 */
	public java.util.List<AttractionCarRentLicence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionCarRentLicence> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the attraction car rent licences from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of attraction car rent licences.
	 *
	 * @return the number of attraction car rent licences
	 */
	public int countAll();

}