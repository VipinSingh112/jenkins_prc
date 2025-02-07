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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAccoAssesmentInfoException;
import com.nbp.tourism.application.form.services.model.TourismNewAccoAssesmentInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism new acco assesment info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoAssesmentInfoUtil
 * @generated
 */
@ProviderType
public interface TourismNewAccoAssesmentInfoPersistence
	extends BasePersistence<TourismNewAccoAssesmentInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismNewAccoAssesmentInfoUtil} to access the tourism new acco assesment info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism new acco assesment info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAccoAssesmentInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new acco assesment info
	 * @throws NoSuchTourismNewAccoAssesmentInfoException if a matching tourism new acco assesment info could not be found
	 */
	public TourismNewAccoAssesmentInfo findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccoAssesmentInfoException;

	/**
	 * Returns the tourism new acco assesment info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new acco assesment info, or <code>null</code> if a matching tourism new acco assesment info could not be found
	 */
	public TourismNewAccoAssesmentInfo fetchBygetTourismById(
		long tourismApplicationId);

	/**
	 * Returns the tourism new acco assesment info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new acco assesment info, or <code>null</code> if a matching tourism new acco assesment info could not be found
	 */
	public TourismNewAccoAssesmentInfo fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism new acco assesment info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new acco assesment info that was removed
	 */
	public TourismNewAccoAssesmentInfo removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccoAssesmentInfoException;

	/**
	 * Returns the number of tourism new acco assesment infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new acco assesment infos
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Caches the tourism new acco assesment info in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccoAssesmentInfo the tourism new acco assesment info
	 */
	public void cacheResult(
		TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo);

	/**
	 * Caches the tourism new acco assesment infos in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccoAssesmentInfos the tourism new acco assesment infos
	 */
	public void cacheResult(
		java.util.List<TourismNewAccoAssesmentInfo>
			tourismNewAccoAssesmentInfos);

	/**
	 * Creates a new tourism new acco assesment info with the primary key. Does not add the tourism new acco assesment info to the database.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key for the new tourism new acco assesment info
	 * @return the new tourism new acco assesment info
	 */
	public TourismNewAccoAssesmentInfo create(
		long TourismNewAccoAssesmentInfoId);

	/**
	 * Removes the tourism new acco assesment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key of the tourism new acco assesment info
	 * @return the tourism new acco assesment info that was removed
	 * @throws NoSuchTourismNewAccoAssesmentInfoException if a tourism new acco assesment info with the primary key could not be found
	 */
	public TourismNewAccoAssesmentInfo remove(
			long TourismNewAccoAssesmentInfoId)
		throws NoSuchTourismNewAccoAssesmentInfoException;

	public TourismNewAccoAssesmentInfo updateImpl(
		TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo);

	/**
	 * Returns the tourism new acco assesment info with the primary key or throws a <code>NoSuchTourismNewAccoAssesmentInfoException</code> if it could not be found.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key of the tourism new acco assesment info
	 * @return the tourism new acco assesment info
	 * @throws NoSuchTourismNewAccoAssesmentInfoException if a tourism new acco assesment info with the primary key could not be found
	 */
	public TourismNewAccoAssesmentInfo findByPrimaryKey(
			long TourismNewAccoAssesmentInfoId)
		throws NoSuchTourismNewAccoAssesmentInfoException;

	/**
	 * Returns the tourism new acco assesment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key of the tourism new acco assesment info
	 * @return the tourism new acco assesment info, or <code>null</code> if a tourism new acco assesment info with the primary key could not be found
	 */
	public TourismNewAccoAssesmentInfo fetchByPrimaryKey(
		long TourismNewAccoAssesmentInfoId);

	/**
	 * Returns all the tourism new acco assesment infos.
	 *
	 * @return the tourism new acco assesment infos
	 */
	public java.util.List<TourismNewAccoAssesmentInfo> findAll();

	/**
	 * Returns a range of all the tourism new acco assesment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoAssesmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco assesment infos
	 * @param end the upper bound of the range of tourism new acco assesment infos (not inclusive)
	 * @return the range of tourism new acco assesment infos
	 */
	public java.util.List<TourismNewAccoAssesmentInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the tourism new acco assesment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoAssesmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco assesment infos
	 * @param end the upper bound of the range of tourism new acco assesment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new acco assesment infos
	 */
	public java.util.List<TourismNewAccoAssesmentInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAccoAssesmentInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the tourism new acco assesment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccoAssesmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new acco assesment infos
	 * @param end the upper bound of the range of tourism new acco assesment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new acco assesment infos
	 */
	public java.util.List<TourismNewAccoAssesmentInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<TourismNewAccoAssesmentInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism new acco assesment infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism new acco assesment infos.
	 *
	 * @return the number of tourism new acco assesment infos
	 */
	public int countAll();

}