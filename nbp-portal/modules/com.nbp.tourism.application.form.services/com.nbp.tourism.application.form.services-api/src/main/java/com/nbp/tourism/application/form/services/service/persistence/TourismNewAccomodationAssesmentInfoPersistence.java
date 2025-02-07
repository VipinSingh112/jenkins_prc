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

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAccomodationAssesmentInfoException;
import com.nbp.tourism.application.form.services.model.TourismNewAccomodationAssesmentInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism new accomodation assesment info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccomodationAssesmentInfoUtil
 * @generated
 */
@ProviderType
public interface TourismNewAccomodationAssesmentInfoPersistence
	extends BasePersistence<TourismNewAccomodationAssesmentInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismNewAccomodationAssesmentInfoUtil} to access the tourism new accomodation assesment info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism new accomodation assesment info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAccomodationAssesmentInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new accomodation assesment info
	 * @throws NoSuchTourismNewAccomodationAssesmentInfoException if a matching tourism new accomodation assesment info could not be found
	 */
	public TourismNewAccomodationAssesmentInfo findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccomodationAssesmentInfoException;

	/**
	 * Returns the tourism new accomodation assesment info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new accomodation assesment info, or <code>null</code> if a matching tourism new accomodation assesment info could not be found
	 */
	public TourismNewAccomodationAssesmentInfo fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism new accomodation assesment info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new accomodation assesment info, or <code>null</code> if a matching tourism new accomodation assesment info could not be found
	 */
	public TourismNewAccomodationAssesmentInfo fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism new accomodation assesment info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new accomodation assesment info that was removed
	 */
	public TourismNewAccomodationAssesmentInfo removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccomodationAssesmentInfoException;

	/**
	 * Returns the number of tourism new accomodation assesment infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new accomodation assesment infos
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism new accomodation assesment info in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccomodationAssesmentInfo the tourism new accomodation assesment info
	 */
	public void cacheResult(
		TourismNewAccomodationAssesmentInfo
			tourismNewAccomodationAssesmentInfo);

	/**
	 * Caches the tourism new accomodation assesment infos in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccomodationAssesmentInfos the tourism new accomodation assesment infos
	 */
	public void cacheResult(
		java.util.List<TourismNewAccomodationAssesmentInfo>
			tourismNewAccomodationAssesmentInfos);

	/**
	 * Creates a new tourism new accomodation assesment info with the primary key. Does not add the tourism new accomodation assesment info to the database.
	 *
	 * @param tourismNewAccomodationAssesId the primary key for the new tourism new accomodation assesment info
	 * @return the new tourism new accomodation assesment info
	 */
	public TourismNewAccomodationAssesmentInfo create(
		long tourismNewAccomodationAssesId);

	/**
	 * Removes the tourism new accomodation assesment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAccomodationAssesId the primary key of the tourism new accomodation assesment info
	 * @return the tourism new accomodation assesment info that was removed
	 * @throws NoSuchTourismNewAccomodationAssesmentInfoException if a tourism new accomodation assesment info with the primary key could not be found
	 */
	public TourismNewAccomodationAssesmentInfo remove(
			long tourismNewAccomodationAssesId)
		throws NoSuchTourismNewAccomodationAssesmentInfoException;

	public TourismNewAccomodationAssesmentInfo updateImpl(
		TourismNewAccomodationAssesmentInfo
			tourismNewAccomodationAssesmentInfo);

	/**
	 * Returns the tourism new accomodation assesment info with the primary key or throws a <code>NoSuchTourismNewAccomodationAssesmentInfoException</code> if it could not be found.
	 *
	 * @param tourismNewAccomodationAssesId the primary key of the tourism new accomodation assesment info
	 * @return the tourism new accomodation assesment info
	 * @throws NoSuchTourismNewAccomodationAssesmentInfoException if a tourism new accomodation assesment info with the primary key could not be found
	 */
	public TourismNewAccomodationAssesmentInfo findByPrimaryKey(
			long tourismNewAccomodationAssesId)
		throws NoSuchTourismNewAccomodationAssesmentInfoException;

	/**
	 * Returns the tourism new accomodation assesment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAccomodationAssesId the primary key of the tourism new accomodation assesment info
	 * @return the tourism new accomodation assesment info, or <code>null</code> if a tourism new accomodation assesment info with the primary key could not be found
	 */
	public TourismNewAccomodationAssesmentInfo fetchByPrimaryKey(
		long tourismNewAccomodationAssesId);

	/**
	 * Returns all the tourism new accomodation assesment infos.
	 *
	 * @return the tourism new accomodation assesment infos
	 */
	public java.util.List<TourismNewAccomodationAssesmentInfo> findAll();

	/**
	 * Returns a range of all the tourism new accomodation assesment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccomodationAssesmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accomodation assesment infos
	 * @param end the upper bound of the range of tourism new accomodation assesment infos (not inclusive)
	 * @return the range of tourism new accomodation assesment infos
	 */
	public java.util.List<TourismNewAccomodationAssesmentInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism new accomodation assesment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccomodationAssesmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accomodation assesment infos
	 * @param end the upper bound of the range of tourism new accomodation assesment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new accomodation assesment infos
	 */
	public java.util.List<TourismNewAccomodationAssesmentInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAccomodationAssesmentInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism new accomodation assesment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccomodationAssesmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accomodation assesment infos
	 * @param end the upper bound of the range of tourism new accomodation assesment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new accomodation assesment infos
	 */
	public java.util.List<TourismNewAccomodationAssesmentInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAccomodationAssesmentInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism new accomodation assesment infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism new accomodation assesment infos.
	 *
	 * @return the number of tourism new accomodation assesment infos
	 */
	public int countAll();

}