/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismBonaAttractionEmployeeInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism bona attraction employee info service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismBonaAttractionEmployeeInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionEmployeeInfoPersistence
 * @generated
 */
public class TourismBonaAttractionEmployeeInfoUtil {

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
		TourismBonaAttractionEmployeeInfo tourismBonaAttractionEmployeeInfo) {

		getPersistence().clearCache(tourismBonaAttractionEmployeeInfo);
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
	public static Map<Serializable, TourismBonaAttractionEmployeeInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismBonaAttractionEmployeeInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismBonaAttractionEmployeeInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismBonaAttractionEmployeeInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismBonaAttractionEmployeeInfo>
			orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismBonaAttractionEmployeeInfo update(
		TourismBonaAttractionEmployeeInfo tourismBonaAttractionEmployeeInfo) {

		return getPersistence().update(tourismBonaAttractionEmployeeInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismBonaAttractionEmployeeInfo update(
		TourismBonaAttractionEmployeeInfo tourismBonaAttractionEmployeeInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismBonaAttractionEmployeeInfo, serviceContext);
	}

	/**
	 * Returns the tourism bona attraction employee info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAttractionEmployeeInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona attraction employee info
	 * @throws NoSuchTourismBonaAttractionEmployeeInfoException if a matching tourism bona attraction employee info could not be found
	 */
	public static TourismBonaAttractionEmployeeInfo findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAttractionEmployeeInfoException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona attraction employee info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona attraction employee info, or <code>null</code> if a matching tourism bona attraction employee info could not be found
	 */
	public static TourismBonaAttractionEmployeeInfo fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona attraction employee info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona attraction employee info, or <code>null</code> if a matching tourism bona attraction employee info could not be found
	 */
	public static TourismBonaAttractionEmployeeInfo fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism bona attraction employee info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona attraction employee info that was removed
	 */
	public static TourismBonaAttractionEmployeeInfo removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAttractionEmployeeInfoException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism bona attraction employee infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona attraction employee infos
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism bona attraction employee info in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAttractionEmployeeInfo the tourism bona attraction employee info
	 */
	public static void cacheResult(
		TourismBonaAttractionEmployeeInfo tourismBonaAttractionEmployeeInfo) {

		getPersistence().cacheResult(tourismBonaAttractionEmployeeInfo);
	}

	/**
	 * Caches the tourism bona attraction employee infos in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAttractionEmployeeInfos the tourism bona attraction employee infos
	 */
	public static void cacheResult(
		List<TourismBonaAttractionEmployeeInfo>
			tourismBonaAttractionEmployeeInfos) {

		getPersistence().cacheResult(tourismBonaAttractionEmployeeInfos);
	}

	/**
	 * Creates a new tourism bona attraction employee info with the primary key. Does not add the tourism bona attraction employee info to the database.
	 *
	 * @param tourismBonaAttrEmpId the primary key for the new tourism bona attraction employee info
	 * @return the new tourism bona attraction employee info
	 */
	public static TourismBonaAttractionEmployeeInfo create(
		long tourismBonaAttrEmpId) {

		return getPersistence().create(tourismBonaAttrEmpId);
	}

	/**
	 * Removes the tourism bona attraction employee info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaAttrEmpId the primary key of the tourism bona attraction employee info
	 * @return the tourism bona attraction employee info that was removed
	 * @throws NoSuchTourismBonaAttractionEmployeeInfoException if a tourism bona attraction employee info with the primary key could not be found
	 */
	public static TourismBonaAttractionEmployeeInfo remove(
			long tourismBonaAttrEmpId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAttractionEmployeeInfoException {

		return getPersistence().remove(tourismBonaAttrEmpId);
	}

	public static TourismBonaAttractionEmployeeInfo updateImpl(
		TourismBonaAttractionEmployeeInfo tourismBonaAttractionEmployeeInfo) {

		return getPersistence().updateImpl(tourismBonaAttractionEmployeeInfo);
	}

	/**
	 * Returns the tourism bona attraction employee info with the primary key or throws a <code>NoSuchTourismBonaAttractionEmployeeInfoException</code> if it could not be found.
	 *
	 * @param tourismBonaAttrEmpId the primary key of the tourism bona attraction employee info
	 * @return the tourism bona attraction employee info
	 * @throws NoSuchTourismBonaAttractionEmployeeInfoException if a tourism bona attraction employee info with the primary key could not be found
	 */
	public static TourismBonaAttractionEmployeeInfo findByPrimaryKey(
			long tourismBonaAttrEmpId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAttractionEmployeeInfoException {

		return getPersistence().findByPrimaryKey(tourismBonaAttrEmpId);
	}

	/**
	 * Returns the tourism bona attraction employee info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaAttrEmpId the primary key of the tourism bona attraction employee info
	 * @return the tourism bona attraction employee info, or <code>null</code> if a tourism bona attraction employee info with the primary key could not be found
	 */
	public static TourismBonaAttractionEmployeeInfo fetchByPrimaryKey(
		long tourismBonaAttrEmpId) {

		return getPersistence().fetchByPrimaryKey(tourismBonaAttrEmpId);
	}

	/**
	 * Returns all the tourism bona attraction employee infos.
	 *
	 * @return the tourism bona attraction employee infos
	 */
	public static List<TourismBonaAttractionEmployeeInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism bona attraction employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction employee infos
	 * @param end the upper bound of the range of tourism bona attraction employee infos (not inclusive)
	 * @return the range of tourism bona attraction employee infos
	 */
	public static List<TourismBonaAttractionEmployeeInfo> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism bona attraction employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction employee infos
	 * @param end the upper bound of the range of tourism bona attraction employee infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona attraction employee infos
	 */
	public static List<TourismBonaAttractionEmployeeInfo> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAttractionEmployeeInfo>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism bona attraction employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction employee infos
	 * @param end the upper bound of the range of tourism bona attraction employee infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona attraction employee infos
	 */
	public static List<TourismBonaAttractionEmployeeInfo> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAttractionEmployeeInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism bona attraction employee infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism bona attraction employee infos.
	 *
	 * @return the number of tourism bona attraction employee infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismBonaAttractionEmployeeInfoPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		TourismBonaAttractionEmployeeInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismBonaAttractionEmployeeInfoPersistence
		_persistence;

}