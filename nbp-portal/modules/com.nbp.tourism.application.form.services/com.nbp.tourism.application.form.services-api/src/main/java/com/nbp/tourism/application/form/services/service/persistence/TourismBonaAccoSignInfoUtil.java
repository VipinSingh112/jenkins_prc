/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismBonaAccoSignInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism bona acco sign info service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismBonaAccoSignInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccoSignInfoPersistence
 * @generated
 */
public class TourismBonaAccoSignInfoUtil {

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
		TourismBonaAccoSignInfo tourismBonaAccoSignInfo) {

		getPersistence().clearCache(tourismBonaAccoSignInfo);
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
	public static Map<Serializable, TourismBonaAccoSignInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismBonaAccoSignInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismBonaAccoSignInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismBonaAccoSignInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismBonaAccoSignInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismBonaAccoSignInfo update(
		TourismBonaAccoSignInfo tourismBonaAccoSignInfo) {

		return getPersistence().update(tourismBonaAccoSignInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismBonaAccoSignInfo update(
		TourismBonaAccoSignInfo tourismBonaAccoSignInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(tourismBonaAccoSignInfo, serviceContext);
	}

	/**
	 * Returns the tourism bona acco sign info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAccoSignInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona acco sign info
	 * @throws NoSuchTourismBonaAccoSignInfoException if a matching tourism bona acco sign info could not be found
	 */
	public static TourismBonaAccoSignInfo findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAccoSignInfoException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona acco sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona acco sign info, or <code>null</code> if a matching tourism bona acco sign info could not be found
	 */
	public static TourismBonaAccoSignInfo fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona acco sign info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona acco sign info, or <code>null</code> if a matching tourism bona acco sign info could not be found
	 */
	public static TourismBonaAccoSignInfo fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism bona acco sign info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona acco sign info that was removed
	 */
	public static TourismBonaAccoSignInfo removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAccoSignInfoException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism bona acco sign infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona acco sign infos
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism bona acco sign info in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccoSignInfo the tourism bona acco sign info
	 */
	public static void cacheResult(
		TourismBonaAccoSignInfo tourismBonaAccoSignInfo) {

		getPersistence().cacheResult(tourismBonaAccoSignInfo);
	}

	/**
	 * Caches the tourism bona acco sign infos in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccoSignInfos the tourism bona acco sign infos
	 */
	public static void cacheResult(
		List<TourismBonaAccoSignInfo> tourismBonaAccoSignInfos) {

		getPersistence().cacheResult(tourismBonaAccoSignInfos);
	}

	/**
	 * Creates a new tourism bona acco sign info with the primary key. Does not add the tourism bona acco sign info to the database.
	 *
	 * @param tourismBonaAccoSignId the primary key for the new tourism bona acco sign info
	 * @return the new tourism bona acco sign info
	 */
	public static TourismBonaAccoSignInfo create(long tourismBonaAccoSignId) {
		return getPersistence().create(tourismBonaAccoSignId);
	}

	/**
	 * Removes the tourism bona acco sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaAccoSignId the primary key of the tourism bona acco sign info
	 * @return the tourism bona acco sign info that was removed
	 * @throws NoSuchTourismBonaAccoSignInfoException if a tourism bona acco sign info with the primary key could not be found
	 */
	public static TourismBonaAccoSignInfo remove(long tourismBonaAccoSignId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAccoSignInfoException {

		return getPersistence().remove(tourismBonaAccoSignId);
	}

	public static TourismBonaAccoSignInfo updateImpl(
		TourismBonaAccoSignInfo tourismBonaAccoSignInfo) {

		return getPersistence().updateImpl(tourismBonaAccoSignInfo);
	}

	/**
	 * Returns the tourism bona acco sign info with the primary key or throws a <code>NoSuchTourismBonaAccoSignInfoException</code> if it could not be found.
	 *
	 * @param tourismBonaAccoSignId the primary key of the tourism bona acco sign info
	 * @return the tourism bona acco sign info
	 * @throws NoSuchTourismBonaAccoSignInfoException if a tourism bona acco sign info with the primary key could not be found
	 */
	public static TourismBonaAccoSignInfo findByPrimaryKey(
			long tourismBonaAccoSignId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAccoSignInfoException {

		return getPersistence().findByPrimaryKey(tourismBonaAccoSignId);
	}

	/**
	 * Returns the tourism bona acco sign info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaAccoSignId the primary key of the tourism bona acco sign info
	 * @return the tourism bona acco sign info, or <code>null</code> if a tourism bona acco sign info with the primary key could not be found
	 */
	public static TourismBonaAccoSignInfo fetchByPrimaryKey(
		long tourismBonaAccoSignId) {

		return getPersistence().fetchByPrimaryKey(tourismBonaAccoSignId);
	}

	/**
	 * Returns all the tourism bona acco sign infos.
	 *
	 * @return the tourism bona acco sign infos
	 */
	public static List<TourismBonaAccoSignInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism bona acco sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccoSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco sign infos
	 * @param end the upper bound of the range of tourism bona acco sign infos (not inclusive)
	 * @return the range of tourism bona acco sign infos
	 */
	public static List<TourismBonaAccoSignInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism bona acco sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccoSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco sign infos
	 * @param end the upper bound of the range of tourism bona acco sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona acco sign infos
	 */
	public static List<TourismBonaAccoSignInfo> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAccoSignInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism bona acco sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccoSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona acco sign infos
	 * @param end the upper bound of the range of tourism bona acco sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona acco sign infos
	 */
	public static List<TourismBonaAccoSignInfo> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAccoSignInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism bona acco sign infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism bona acco sign infos.
	 *
	 * @return the number of tourism bona acco sign infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismBonaAccoSignInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismBonaAccoSignInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismBonaAccoSignInfoPersistence _persistence;

}