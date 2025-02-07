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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismNewAccoAssesmentInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism new acco assesment info service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismNewAccoAssesmentInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoAssesmentInfoPersistence
 * @generated
 */
public class TourismNewAccoAssesmentInfoUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo) {

		getPersistence().clearCache(tourismNewAccoAssesmentInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, TourismNewAccoAssesmentInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismNewAccoAssesmentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismNewAccoAssesmentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismNewAccoAssesmentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismNewAccoAssesmentInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismNewAccoAssesmentInfo update(
		TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo) {

		return getPersistence().update(tourismNewAccoAssesmentInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismNewAccoAssesmentInfo update(
		TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismNewAccoAssesmentInfo, serviceContext);
	}

	/**
	 * Returns the tourism new acco assesment info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAccoAssesmentInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new acco assesment info
	 * @throws NoSuchTourismNewAccoAssesmentInfoException if a matching tourism new acco assesment info could not be found
	 */
	public static TourismNewAccoAssesmentInfo findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAccoAssesmentInfoException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new acco assesment info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new acco assesment info, or <code>null</code> if a matching tourism new acco assesment info could not be found
	 */
	public static TourismNewAccoAssesmentInfo fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new acco assesment info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new acco assesment info, or <code>null</code> if a matching tourism new acco assesment info could not be found
	 */
	public static TourismNewAccoAssesmentInfo fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism new acco assesment info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new acco assesment info that was removed
	 */
	public static TourismNewAccoAssesmentInfo removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAccoAssesmentInfoException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism new acco assesment infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new acco assesment infos
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism new acco assesment info in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccoAssesmentInfo the tourism new acco assesment info
	 */
	public static void cacheResult(
		TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo) {

		getPersistence().cacheResult(tourismNewAccoAssesmentInfo);
	}

	/**
	 * Caches the tourism new acco assesment infos in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccoAssesmentInfos the tourism new acco assesment infos
	 */
	public static void cacheResult(
		List<TourismNewAccoAssesmentInfo> tourismNewAccoAssesmentInfos) {

		getPersistence().cacheResult(tourismNewAccoAssesmentInfos);
	}

	/**
	 * Creates a new tourism new acco assesment info with the primary key. Does not add the tourism new acco assesment info to the database.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key for the new tourism new acco assesment info
	 * @return the new tourism new acco assesment info
	 */
	public static TourismNewAccoAssesmentInfo create(
		long TourismNewAccoAssesmentInfoId) {

		return getPersistence().create(TourismNewAccoAssesmentInfoId);
	}

	/**
	 * Removes the tourism new acco assesment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key of the tourism new acco assesment info
	 * @return the tourism new acco assesment info that was removed
	 * @throws NoSuchTourismNewAccoAssesmentInfoException if a tourism new acco assesment info with the primary key could not be found
	 */
	public static TourismNewAccoAssesmentInfo remove(
			long TourismNewAccoAssesmentInfoId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAccoAssesmentInfoException {

		return getPersistence().remove(TourismNewAccoAssesmentInfoId);
	}

	public static TourismNewAccoAssesmentInfo updateImpl(
		TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo) {

		return getPersistence().updateImpl(tourismNewAccoAssesmentInfo);
	}

	/**
	 * Returns the tourism new acco assesment info with the primary key or throws a <code>NoSuchTourismNewAccoAssesmentInfoException</code> if it could not be found.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key of the tourism new acco assesment info
	 * @return the tourism new acco assesment info
	 * @throws NoSuchTourismNewAccoAssesmentInfoException if a tourism new acco assesment info with the primary key could not be found
	 */
	public static TourismNewAccoAssesmentInfo findByPrimaryKey(
			long TourismNewAccoAssesmentInfoId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAccoAssesmentInfoException {

		return getPersistence().findByPrimaryKey(TourismNewAccoAssesmentInfoId);
	}

	/**
	 * Returns the tourism new acco assesment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param TourismNewAccoAssesmentInfoId the primary key of the tourism new acco assesment info
	 * @return the tourism new acco assesment info, or <code>null</code> if a tourism new acco assesment info with the primary key could not be found
	 */
	public static TourismNewAccoAssesmentInfo fetchByPrimaryKey(
		long TourismNewAccoAssesmentInfoId) {

		return getPersistence().fetchByPrimaryKey(
			TourismNewAccoAssesmentInfoId);
	}

	/**
	 * Returns all the tourism new acco assesment infos.
	 *
	 * @return the tourism new acco assesment infos
	 */
	public static List<TourismNewAccoAssesmentInfo> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<TourismNewAccoAssesmentInfo> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

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
	public static List<TourismNewAccoAssesmentInfo> findAll(
		int start, int end,
		OrderByComparator<TourismNewAccoAssesmentInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<TourismNewAccoAssesmentInfo> findAll(
		int start, int end,
		OrderByComparator<TourismNewAccoAssesmentInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism new acco assesment infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism new acco assesment infos.
	 *
	 * @return the number of tourism new acco assesment infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismNewAccoAssesmentInfoPersistence getPersistence() {
		return _persistence;
	}

	private static volatile TourismNewAccoAssesmentInfoPersistence _persistence;

}