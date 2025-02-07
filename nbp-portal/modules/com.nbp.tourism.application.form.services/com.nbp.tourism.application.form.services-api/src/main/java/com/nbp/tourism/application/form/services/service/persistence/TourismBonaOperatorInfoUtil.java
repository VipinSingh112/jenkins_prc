/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismBonaOperatorInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism bona operator info service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismBonaOperatorInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaOperatorInfoPersistence
 * @generated
 */
public class TourismBonaOperatorInfoUtil {

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
		TourismBonaOperatorInfo tourismBonaOperatorInfo) {

		getPersistence().clearCache(tourismBonaOperatorInfo);
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
	public static Map<Serializable, TourismBonaOperatorInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismBonaOperatorInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismBonaOperatorInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismBonaOperatorInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismBonaOperatorInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismBonaOperatorInfo update(
		TourismBonaOperatorInfo tourismBonaOperatorInfo) {

		return getPersistence().update(tourismBonaOperatorInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismBonaOperatorInfo update(
		TourismBonaOperatorInfo tourismBonaOperatorInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(tourismBonaOperatorInfo, serviceContext);
	}

	/**
	 * Returns the tourism bona operator info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaOperatorInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona operator info
	 * @throws NoSuchTourismBonaOperatorInfoException if a matching tourism bona operator info could not be found
	 */
	public static TourismBonaOperatorInfo findBygetTourismById(
			Long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaOperatorInfoException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona operator info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona operator info, or <code>null</code> if a matching tourism bona operator info could not be found
	 */
	public static TourismBonaOperatorInfo fetchBygetTourismById(
		Long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona operator info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona operator info, or <code>null</code> if a matching tourism bona operator info could not be found
	 */
	public static TourismBonaOperatorInfo fetchBygetTourismById(
		Long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism bona operator info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona operator info that was removed
	 */
	public static TourismBonaOperatorInfo removeBygetTourismById(
			Long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaOperatorInfoException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism bona operator infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona operator infos
	 */
	public static int countBygetTourismById(Long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism bona operator info in the entity cache if it is enabled.
	 *
	 * @param tourismBonaOperatorInfo the tourism bona operator info
	 */
	public static void cacheResult(
		TourismBonaOperatorInfo tourismBonaOperatorInfo) {

		getPersistence().cacheResult(tourismBonaOperatorInfo);
	}

	/**
	 * Caches the tourism bona operator infos in the entity cache if it is enabled.
	 *
	 * @param tourismBonaOperatorInfos the tourism bona operator infos
	 */
	public static void cacheResult(
		List<TourismBonaOperatorInfo> tourismBonaOperatorInfos) {

		getPersistence().cacheResult(tourismBonaOperatorInfos);
	}

	/**
	 * Creates a new tourism bona operator info with the primary key. Does not add the tourism bona operator info to the database.
	 *
	 * @param tourismBonaOperatorInfoId the primary key for the new tourism bona operator info
	 * @return the new tourism bona operator info
	 */
	public static TourismBonaOperatorInfo create(
		long tourismBonaOperatorInfoId) {

		return getPersistence().create(tourismBonaOperatorInfoId);
	}

	/**
	 * Removes the tourism bona operator info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaOperatorInfoId the primary key of the tourism bona operator info
	 * @return the tourism bona operator info that was removed
	 * @throws NoSuchTourismBonaOperatorInfoException if a tourism bona operator info with the primary key could not be found
	 */
	public static TourismBonaOperatorInfo remove(long tourismBonaOperatorInfoId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaOperatorInfoException {

		return getPersistence().remove(tourismBonaOperatorInfoId);
	}

	public static TourismBonaOperatorInfo updateImpl(
		TourismBonaOperatorInfo tourismBonaOperatorInfo) {

		return getPersistence().updateImpl(tourismBonaOperatorInfo);
	}

	/**
	 * Returns the tourism bona operator info with the primary key or throws a <code>NoSuchTourismBonaOperatorInfoException</code> if it could not be found.
	 *
	 * @param tourismBonaOperatorInfoId the primary key of the tourism bona operator info
	 * @return the tourism bona operator info
	 * @throws NoSuchTourismBonaOperatorInfoException if a tourism bona operator info with the primary key could not be found
	 */
	public static TourismBonaOperatorInfo findByPrimaryKey(
			long tourismBonaOperatorInfoId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaOperatorInfoException {

		return getPersistence().findByPrimaryKey(tourismBonaOperatorInfoId);
	}

	/**
	 * Returns the tourism bona operator info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaOperatorInfoId the primary key of the tourism bona operator info
	 * @return the tourism bona operator info, or <code>null</code> if a tourism bona operator info with the primary key could not be found
	 */
	public static TourismBonaOperatorInfo fetchByPrimaryKey(
		long tourismBonaOperatorInfoId) {

		return getPersistence().fetchByPrimaryKey(tourismBonaOperatorInfoId);
	}

	/**
	 * Returns all the tourism bona operator infos.
	 *
	 * @return the tourism bona operator infos
	 */
	public static List<TourismBonaOperatorInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism bona operator infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaOperatorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona operator infos
	 * @param end the upper bound of the range of tourism bona operator infos (not inclusive)
	 * @return the range of tourism bona operator infos
	 */
	public static List<TourismBonaOperatorInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism bona operator infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaOperatorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona operator infos
	 * @param end the upper bound of the range of tourism bona operator infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona operator infos
	 */
	public static List<TourismBonaOperatorInfo> findAll(
		int start, int end,
		OrderByComparator<TourismBonaOperatorInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism bona operator infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaOperatorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona operator infos
	 * @param end the upper bound of the range of tourism bona operator infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona operator infos
	 */
	public static List<TourismBonaOperatorInfo> findAll(
		int start, int end,
		OrderByComparator<TourismBonaOperatorInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism bona operator infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism bona operator infos.
	 *
	 * @return the number of tourism bona operator infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismBonaOperatorInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismBonaOperatorInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismBonaOperatorInfoPersistence _persistence;

}