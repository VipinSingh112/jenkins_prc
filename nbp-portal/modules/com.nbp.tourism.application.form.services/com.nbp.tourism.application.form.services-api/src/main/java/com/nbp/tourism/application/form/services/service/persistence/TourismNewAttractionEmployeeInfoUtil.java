/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismNewAttractionEmployeeInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism new attraction employee info service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismNewAttractionEmployeeInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionEmployeeInfoPersistence
 * @generated
 */
public class TourismNewAttractionEmployeeInfoUtil {

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
		TourismNewAttractionEmployeeInfo tourismNewAttractionEmployeeInfo) {

		getPersistence().clearCache(tourismNewAttractionEmployeeInfo);
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
	public static Map<Serializable, TourismNewAttractionEmployeeInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismNewAttractionEmployeeInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismNewAttractionEmployeeInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismNewAttractionEmployeeInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismNewAttractionEmployeeInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismNewAttractionEmployeeInfo update(
		TourismNewAttractionEmployeeInfo tourismNewAttractionEmployeeInfo) {

		return getPersistence().update(tourismNewAttractionEmployeeInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismNewAttractionEmployeeInfo update(
		TourismNewAttractionEmployeeInfo tourismNewAttractionEmployeeInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismNewAttractionEmployeeInfo, serviceContext);
	}

	/**
	 * Returns the tourism new attraction employee info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAttractionEmployeeInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction employee info
	 * @throws NoSuchTourismNewAttractionEmployeeInfoException if a matching tourism new attraction employee info could not be found
	 */
	public static TourismNewAttractionEmployeeInfo findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAttractionEmployeeInfoException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new attraction employee info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction employee info, or <code>null</code> if a matching tourism new attraction employee info could not be found
	 */
	public static TourismNewAttractionEmployeeInfo fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new attraction employee info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new attraction employee info, or <code>null</code> if a matching tourism new attraction employee info could not be found
	 */
	public static TourismNewAttractionEmployeeInfo fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism new attraction employee info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new attraction employee info that was removed
	 */
	public static TourismNewAttractionEmployeeInfo removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAttractionEmployeeInfoException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism new attraction employee infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new attraction employee infos
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism new attraction employee info in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionEmployeeInfo the tourism new attraction employee info
	 */
	public static void cacheResult(
		TourismNewAttractionEmployeeInfo tourismNewAttractionEmployeeInfo) {

		getPersistence().cacheResult(tourismNewAttractionEmployeeInfo);
	}

	/**
	 * Caches the tourism new attraction employee infos in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionEmployeeInfos the tourism new attraction employee infos
	 */
	public static void cacheResult(
		List<TourismNewAttractionEmployeeInfo>
			tourismNewAttractionEmployeeInfos) {

		getPersistence().cacheResult(tourismNewAttractionEmployeeInfos);
	}

	/**
	 * Creates a new tourism new attraction employee info with the primary key. Does not add the tourism new attraction employee info to the database.
	 *
	 * @param tourismNewAttractionEmploId the primary key for the new tourism new attraction employee info
	 * @return the new tourism new attraction employee info
	 */
	public static TourismNewAttractionEmployeeInfo create(
		long tourismNewAttractionEmploId) {

		return getPersistence().create(tourismNewAttractionEmploId);
	}

	/**
	 * Removes the tourism new attraction employee info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAttractionEmploId the primary key of the tourism new attraction employee info
	 * @return the tourism new attraction employee info that was removed
	 * @throws NoSuchTourismNewAttractionEmployeeInfoException if a tourism new attraction employee info with the primary key could not be found
	 */
	public static TourismNewAttractionEmployeeInfo remove(
			long tourismNewAttractionEmploId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAttractionEmployeeInfoException {

		return getPersistence().remove(tourismNewAttractionEmploId);
	}

	public static TourismNewAttractionEmployeeInfo updateImpl(
		TourismNewAttractionEmployeeInfo tourismNewAttractionEmployeeInfo) {

		return getPersistence().updateImpl(tourismNewAttractionEmployeeInfo);
	}

	/**
	 * Returns the tourism new attraction employee info with the primary key or throws a <code>NoSuchTourismNewAttractionEmployeeInfoException</code> if it could not be found.
	 *
	 * @param tourismNewAttractionEmploId the primary key of the tourism new attraction employee info
	 * @return the tourism new attraction employee info
	 * @throws NoSuchTourismNewAttractionEmployeeInfoException if a tourism new attraction employee info with the primary key could not be found
	 */
	public static TourismNewAttractionEmployeeInfo findByPrimaryKey(
			long tourismNewAttractionEmploId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAttractionEmployeeInfoException {

		return getPersistence().findByPrimaryKey(tourismNewAttractionEmploId);
	}

	/**
	 * Returns the tourism new attraction employee info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAttractionEmploId the primary key of the tourism new attraction employee info
	 * @return the tourism new attraction employee info, or <code>null</code> if a tourism new attraction employee info with the primary key could not be found
	 */
	public static TourismNewAttractionEmployeeInfo fetchByPrimaryKey(
		long tourismNewAttractionEmploId) {

		return getPersistence().fetchByPrimaryKey(tourismNewAttractionEmploId);
	}

	/**
	 * Returns all the tourism new attraction employee infos.
	 *
	 * @return the tourism new attraction employee infos
	 */
	public static List<TourismNewAttractionEmployeeInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism new attraction employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction employee infos
	 * @param end the upper bound of the range of tourism new attraction employee infos (not inclusive)
	 * @return the range of tourism new attraction employee infos
	 */
	public static List<TourismNewAttractionEmployeeInfo> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism new attraction employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction employee infos
	 * @param end the upper bound of the range of tourism new attraction employee infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new attraction employee infos
	 */
	public static List<TourismNewAttractionEmployeeInfo> findAll(
		int start, int end,
		OrderByComparator<TourismNewAttractionEmployeeInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism new attraction employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction employee infos
	 * @param end the upper bound of the range of tourism new attraction employee infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new attraction employee infos
	 */
	public static List<TourismNewAttractionEmployeeInfo> findAll(
		int start, int end,
		OrderByComparator<TourismNewAttractionEmployeeInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism new attraction employee infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism new attraction employee infos.
	 *
	 * @return the number of tourism new attraction employee infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismNewAttractionEmployeeInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismNewAttractionEmployeeInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismNewAttractionEmployeeInfoPersistence
		_persistence;

}