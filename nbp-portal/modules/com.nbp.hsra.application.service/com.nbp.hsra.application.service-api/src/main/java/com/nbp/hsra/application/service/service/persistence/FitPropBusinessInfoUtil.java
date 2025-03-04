/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.FitPropBusinessInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the fit prop business info service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.FitPropBusinessInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FitPropBusinessInfoPersistence
 * @generated
 */
public class FitPropBusinessInfoUtil {

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
	public static void clearCache(FitPropBusinessInfo fitPropBusinessInfo) {
		getPersistence().clearCache(fitPropBusinessInfo);
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
	public static Map<Serializable, FitPropBusinessInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FitPropBusinessInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FitPropBusinessInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FitPropBusinessInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FitPropBusinessInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FitPropBusinessInfo update(
		FitPropBusinessInfo fitPropBusinessInfo) {

		return getPersistence().update(fitPropBusinessInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FitPropBusinessInfo update(
		FitPropBusinessInfo fitPropBusinessInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(fitPropBusinessInfo, serviceContext);
	}

	/**
	 * Returns the fit prop business info where hsraApplicationId = &#63; or throws a <code>NoSuchFitPropBusinessInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching fit prop business info
	 * @throws NoSuchFitPropBusinessInfoException if a matching fit prop business info could not be found
	 */
	public static FitPropBusinessInfo findBygetHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchFitPropBusinessInfoException {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the fit prop business info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching fit prop business info, or <code>null</code> if a matching fit prop business info could not be found
	 */
	public static FitPropBusinessInfo fetchBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().fetchBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the fit prop business info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fit prop business info, or <code>null</code> if a matching fit prop business info could not be found
	 */
	public static FitPropBusinessInfo fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraById(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the fit prop business info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the fit prop business info that was removed
	 */
	public static FitPropBusinessInfo removeBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchFitPropBusinessInfoException {

		return getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of fit prop business infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching fit prop business infos
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the fit prop business info in the entity cache if it is enabled.
	 *
	 * @param fitPropBusinessInfo the fit prop business info
	 */
	public static void cacheResult(FitPropBusinessInfo fitPropBusinessInfo) {
		getPersistence().cacheResult(fitPropBusinessInfo);
	}

	/**
	 * Caches the fit prop business infos in the entity cache if it is enabled.
	 *
	 * @param fitPropBusinessInfos the fit prop business infos
	 */
	public static void cacheResult(
		List<FitPropBusinessInfo> fitPropBusinessInfos) {

		getPersistence().cacheResult(fitPropBusinessInfos);
	}

	/**
	 * Creates a new fit prop business info with the primary key. Does not add the fit prop business info to the database.
	 *
	 * @param fitPropBusinessInfoId the primary key for the new fit prop business info
	 * @return the new fit prop business info
	 */
	public static FitPropBusinessInfo create(long fitPropBusinessInfoId) {
		return getPersistence().create(fitPropBusinessInfoId);
	}

	/**
	 * Removes the fit prop business info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fitPropBusinessInfoId the primary key of the fit prop business info
	 * @return the fit prop business info that was removed
	 * @throws NoSuchFitPropBusinessInfoException if a fit prop business info with the primary key could not be found
	 */
	public static FitPropBusinessInfo remove(long fitPropBusinessInfoId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchFitPropBusinessInfoException {

		return getPersistence().remove(fitPropBusinessInfoId);
	}

	public static FitPropBusinessInfo updateImpl(
		FitPropBusinessInfo fitPropBusinessInfo) {

		return getPersistence().updateImpl(fitPropBusinessInfo);
	}

	/**
	 * Returns the fit prop business info with the primary key or throws a <code>NoSuchFitPropBusinessInfoException</code> if it could not be found.
	 *
	 * @param fitPropBusinessInfoId the primary key of the fit prop business info
	 * @return the fit prop business info
	 * @throws NoSuchFitPropBusinessInfoException if a fit prop business info with the primary key could not be found
	 */
	public static FitPropBusinessInfo findByPrimaryKey(
			long fitPropBusinessInfoId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchFitPropBusinessInfoException {

		return getPersistence().findByPrimaryKey(fitPropBusinessInfoId);
	}

	/**
	 * Returns the fit prop business info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fitPropBusinessInfoId the primary key of the fit prop business info
	 * @return the fit prop business info, or <code>null</code> if a fit prop business info with the primary key could not be found
	 */
	public static FitPropBusinessInfo fetchByPrimaryKey(
		long fitPropBusinessInfoId) {

		return getPersistence().fetchByPrimaryKey(fitPropBusinessInfoId);
	}

	/**
	 * Returns all the fit prop business infos.
	 *
	 * @return the fit prop business infos
	 */
	public static List<FitPropBusinessInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the fit prop business infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropBusinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop business infos
	 * @param end the upper bound of the range of fit prop business infos (not inclusive)
	 * @return the range of fit prop business infos
	 */
	public static List<FitPropBusinessInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the fit prop business infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropBusinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop business infos
	 * @param end the upper bound of the range of fit prop business infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fit prop business infos
	 */
	public static List<FitPropBusinessInfo> findAll(
		int start, int end,
		OrderByComparator<FitPropBusinessInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fit prop business infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropBusinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop business infos
	 * @param end the upper bound of the range of fit prop business infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fit prop business infos
	 */
	public static List<FitPropBusinessInfo> findAll(
		int start, int end,
		OrderByComparator<FitPropBusinessInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the fit prop business infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of fit prop business infos.
	 *
	 * @return the number of fit prop business infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FitPropBusinessInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FitPropBusinessInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FitPropBusinessInfoPersistence _persistence;

}