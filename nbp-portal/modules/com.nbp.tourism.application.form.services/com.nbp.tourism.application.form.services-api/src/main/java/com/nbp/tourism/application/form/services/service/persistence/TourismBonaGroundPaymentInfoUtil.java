/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismBonaGroundPaymentInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism bona ground payment info service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismBonaGroundPaymentInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundPaymentInfoPersistence
 * @generated
 */
public class TourismBonaGroundPaymentInfoUtil {

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
		TourismBonaGroundPaymentInfo tourismBonaGroundPaymentInfo) {

		getPersistence().clearCache(tourismBonaGroundPaymentInfo);
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
	public static Map<Serializable, TourismBonaGroundPaymentInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismBonaGroundPaymentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismBonaGroundPaymentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismBonaGroundPaymentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismBonaGroundPaymentInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismBonaGroundPaymentInfo update(
		TourismBonaGroundPaymentInfo tourismBonaGroundPaymentInfo) {

		return getPersistence().update(tourismBonaGroundPaymentInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismBonaGroundPaymentInfo update(
		TourismBonaGroundPaymentInfo tourismBonaGroundPaymentInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismBonaGroundPaymentInfo, serviceContext);
	}

	/**
	 * Returns the tourism bona ground payment info where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaGroundPaymentInfoException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground payment info
	 * @throws NoSuchTourismBonaGroundPaymentInfoException if a matching tourism bona ground payment info could not be found
	 */
	public static TourismBonaGroundPaymentInfo findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundPaymentInfoException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona ground payment info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground payment info, or <code>null</code> if a matching tourism bona ground payment info could not be found
	 */
	public static TourismBonaGroundPaymentInfo fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona ground payment info where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona ground payment info, or <code>null</code> if a matching tourism bona ground payment info could not be found
	 */
	public static TourismBonaGroundPaymentInfo fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism bona ground payment info where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona ground payment info that was removed
	 */
	public static TourismBonaGroundPaymentInfo removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundPaymentInfoException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism bona ground payment infos where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona ground payment infos
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism bona ground payment info in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundPaymentInfo the tourism bona ground payment info
	 */
	public static void cacheResult(
		TourismBonaGroundPaymentInfo tourismBonaGroundPaymentInfo) {

		getPersistence().cacheResult(tourismBonaGroundPaymentInfo);
	}

	/**
	 * Caches the tourism bona ground payment infos in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundPaymentInfos the tourism bona ground payment infos
	 */
	public static void cacheResult(
		List<TourismBonaGroundPaymentInfo> tourismBonaGroundPaymentInfos) {

		getPersistence().cacheResult(tourismBonaGroundPaymentInfos);
	}

	/**
	 * Creates a new tourism bona ground payment info with the primary key. Does not add the tourism bona ground payment info to the database.
	 *
	 * @param tourismBonaGroundPayId the primary key for the new tourism bona ground payment info
	 * @return the new tourism bona ground payment info
	 */
	public static TourismBonaGroundPaymentInfo create(
		long tourismBonaGroundPayId) {

		return getPersistence().create(tourismBonaGroundPayId);
	}

	/**
	 * Removes the tourism bona ground payment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaGroundPayId the primary key of the tourism bona ground payment info
	 * @return the tourism bona ground payment info that was removed
	 * @throws NoSuchTourismBonaGroundPaymentInfoException if a tourism bona ground payment info with the primary key could not be found
	 */
	public static TourismBonaGroundPaymentInfo remove(
			long tourismBonaGroundPayId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundPaymentInfoException {

		return getPersistence().remove(tourismBonaGroundPayId);
	}

	public static TourismBonaGroundPaymentInfo updateImpl(
		TourismBonaGroundPaymentInfo tourismBonaGroundPaymentInfo) {

		return getPersistence().updateImpl(tourismBonaGroundPaymentInfo);
	}

	/**
	 * Returns the tourism bona ground payment info with the primary key or throws a <code>NoSuchTourismBonaGroundPaymentInfoException</code> if it could not be found.
	 *
	 * @param tourismBonaGroundPayId the primary key of the tourism bona ground payment info
	 * @return the tourism bona ground payment info
	 * @throws NoSuchTourismBonaGroundPaymentInfoException if a tourism bona ground payment info with the primary key could not be found
	 */
	public static TourismBonaGroundPaymentInfo findByPrimaryKey(
			long tourismBonaGroundPayId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundPaymentInfoException {

		return getPersistence().findByPrimaryKey(tourismBonaGroundPayId);
	}

	/**
	 * Returns the tourism bona ground payment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaGroundPayId the primary key of the tourism bona ground payment info
	 * @return the tourism bona ground payment info, or <code>null</code> if a tourism bona ground payment info with the primary key could not be found
	 */
	public static TourismBonaGroundPaymentInfo fetchByPrimaryKey(
		long tourismBonaGroundPayId) {

		return getPersistence().fetchByPrimaryKey(tourismBonaGroundPayId);
	}

	/**
	 * Returns all the tourism bona ground payment infos.
	 *
	 * @return the tourism bona ground payment infos
	 */
	public static List<TourismBonaGroundPaymentInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism bona ground payment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundPaymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground payment infos
	 * @param end the upper bound of the range of tourism bona ground payment infos (not inclusive)
	 * @return the range of tourism bona ground payment infos
	 */
	public static List<TourismBonaGroundPaymentInfo> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground payment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundPaymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground payment infos
	 * @param end the upper bound of the range of tourism bona ground payment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona ground payment infos
	 */
	public static List<TourismBonaGroundPaymentInfo> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundPaymentInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground payment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundPaymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground payment infos
	 * @param end the upper bound of the range of tourism bona ground payment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona ground payment infos
	 */
	public static List<TourismBonaGroundPaymentInfo> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundPaymentInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism bona ground payment infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism bona ground payment infos.
	 *
	 * @return the number of tourism bona ground payment infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismBonaGroundPaymentInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismBonaGroundPaymentInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismBonaGroundPaymentInfoPersistence
		_persistence;

}