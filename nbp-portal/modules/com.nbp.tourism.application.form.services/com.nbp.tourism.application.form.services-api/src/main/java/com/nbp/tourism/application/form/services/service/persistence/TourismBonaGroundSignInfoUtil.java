/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismBonaGroundSignInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism bona ground sign info service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismBonaGroundSignInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundSignInfoPersistence
 * @generated
 */
public class TourismBonaGroundSignInfoUtil {

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
		TourismBonaGroundSignInfo tourismBonaGroundSignInfo) {

		getPersistence().clearCache(tourismBonaGroundSignInfo);
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
	public static Map<Serializable, TourismBonaGroundSignInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismBonaGroundSignInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismBonaGroundSignInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismBonaGroundSignInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismBonaGroundSignInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismBonaGroundSignInfo update(
		TourismBonaGroundSignInfo tourismBonaGroundSignInfo) {

		return getPersistence().update(tourismBonaGroundSignInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismBonaGroundSignInfo update(
		TourismBonaGroundSignInfo tourismBonaGroundSignInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismBonaGroundSignInfo, serviceContext);
	}

	/**
	 * Returns the tourism bona ground sign info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaGroundSignInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground sign info
	 * @throws NoSuchTourismBonaGroundSignInfoException if a matching tourism bona ground sign info could not be found
	 */
	public static TourismBonaGroundSignInfo findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundSignInfoException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona ground sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground sign info, or <code>null</code> if a matching tourism bona ground sign info could not be found
	 */
	public static TourismBonaGroundSignInfo fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona ground sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona ground sign info, or <code>null</code> if a matching tourism bona ground sign info could not be found
	 */
	public static TourismBonaGroundSignInfo fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism bona ground sign info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona ground sign info that was removed
	 */
	public static TourismBonaGroundSignInfo removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundSignInfoException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism bona ground sign infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona ground sign infos
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism bona ground sign info in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundSignInfo the tourism bona ground sign info
	 */
	public static void cacheResult(
		TourismBonaGroundSignInfo tourismBonaGroundSignInfo) {

		getPersistence().cacheResult(tourismBonaGroundSignInfo);
	}

	/**
	 * Caches the tourism bona ground sign infos in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundSignInfos the tourism bona ground sign infos
	 */
	public static void cacheResult(
		List<TourismBonaGroundSignInfo> tourismBonaGroundSignInfos) {

		getPersistence().cacheResult(tourismBonaGroundSignInfos);
	}

	/**
	 * Creates a new tourism bona ground sign info with the primary key. Does not add the tourism bona ground sign info to the database.
	 *
	 * @param tourismBonaGroundSignInfoId the primary key for the new tourism bona ground sign info
	 * @return the new tourism bona ground sign info
	 */
	public static TourismBonaGroundSignInfo create(
		long tourismBonaGroundSignInfoId) {

		return getPersistence().create(tourismBonaGroundSignInfoId);
	}

	/**
	 * Removes the tourism bona ground sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaGroundSignInfoId the primary key of the tourism bona ground sign info
	 * @return the tourism bona ground sign info that was removed
	 * @throws NoSuchTourismBonaGroundSignInfoException if a tourism bona ground sign info with the primary key could not be found
	 */
	public static TourismBonaGroundSignInfo remove(
			long tourismBonaGroundSignInfoId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundSignInfoException {

		return getPersistence().remove(tourismBonaGroundSignInfoId);
	}

	public static TourismBonaGroundSignInfo updateImpl(
		TourismBonaGroundSignInfo tourismBonaGroundSignInfo) {

		return getPersistence().updateImpl(tourismBonaGroundSignInfo);
	}

	/**
	 * Returns the tourism bona ground sign info with the primary key or throws a <code>NoSuchTourismBonaGroundSignInfoException</code> if it could not be found.
	 *
	 * @param tourismBonaGroundSignInfoId the primary key of the tourism bona ground sign info
	 * @return the tourism bona ground sign info
	 * @throws NoSuchTourismBonaGroundSignInfoException if a tourism bona ground sign info with the primary key could not be found
	 */
	public static TourismBonaGroundSignInfo findByPrimaryKey(
			long tourismBonaGroundSignInfoId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundSignInfoException {

		return getPersistence().findByPrimaryKey(tourismBonaGroundSignInfoId);
	}

	/**
	 * Returns the tourism bona ground sign info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaGroundSignInfoId the primary key of the tourism bona ground sign info
	 * @return the tourism bona ground sign info, or <code>null</code> if a tourism bona ground sign info with the primary key could not be found
	 */
	public static TourismBonaGroundSignInfo fetchByPrimaryKey(
		long tourismBonaGroundSignInfoId) {

		return getPersistence().fetchByPrimaryKey(tourismBonaGroundSignInfoId);
	}

	/**
	 * Returns all the tourism bona ground sign infos.
	 *
	 * @return the tourism bona ground sign infos
	 */
	public static List<TourismBonaGroundSignInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism bona ground sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground sign infos
	 * @param end the upper bound of the range of tourism bona ground sign infos (not inclusive)
	 * @return the range of tourism bona ground sign infos
	 */
	public static List<TourismBonaGroundSignInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground sign infos
	 * @param end the upper bound of the range of tourism bona ground sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona ground sign infos
	 */
	public static List<TourismBonaGroundSignInfo> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundSignInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground sign infos
	 * @param end the upper bound of the range of tourism bona ground sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona ground sign infos
	 */
	public static List<TourismBonaGroundSignInfo> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundSignInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism bona ground sign infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism bona ground sign infos.
	 *
	 * @return the number of tourism bona ground sign infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismBonaGroundSignInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismBonaGroundSignInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismBonaGroundSignInfoPersistence _persistence;

}