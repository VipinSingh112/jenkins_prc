/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.FitPropPersonalDetailInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the fit prop personal detail info service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.FitPropPersonalDetailInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FitPropPersonalDetailInfoPersistence
 * @generated
 */
public class FitPropPersonalDetailInfoUtil {

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
		FitPropPersonalDetailInfo fitPropPersonalDetailInfo) {

		getPersistence().clearCache(fitPropPersonalDetailInfo);
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
	public static Map<Serializable, FitPropPersonalDetailInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FitPropPersonalDetailInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FitPropPersonalDetailInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FitPropPersonalDetailInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FitPropPersonalDetailInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FitPropPersonalDetailInfo update(
		FitPropPersonalDetailInfo fitPropPersonalDetailInfo) {

		return getPersistence().update(fitPropPersonalDetailInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FitPropPersonalDetailInfo update(
		FitPropPersonalDetailInfo fitPropPersonalDetailInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			fitPropPersonalDetailInfo, serviceContext);
	}

	/**
	 * Returns the fit prop personal detail info where hsraApplicationId = &#63; or throws a <code>NoSuchFitPropPersonalDetailInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching fit prop personal detail info
	 * @throws NoSuchFitPropPersonalDetailInfoException if a matching fit prop personal detail info could not be found
	 */
	public static FitPropPersonalDetailInfo findBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchFitPropPersonalDetailInfoException {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the fit prop personal detail info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching fit prop personal detail info, or <code>null</code> if a matching fit prop personal detail info could not be found
	 */
	public static FitPropPersonalDetailInfo fetchBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().fetchBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the fit prop personal detail info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fit prop personal detail info, or <code>null</code> if a matching fit prop personal detail info could not be found
	 */
	public static FitPropPersonalDetailInfo fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraById(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the fit prop personal detail info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the fit prop personal detail info that was removed
	 */
	public static FitPropPersonalDetailInfo removeBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchFitPropPersonalDetailInfoException {

		return getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of fit prop personal detail infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching fit prop personal detail infos
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the fit prop personal detail info in the entity cache if it is enabled.
	 *
	 * @param fitPropPersonalDetailInfo the fit prop personal detail info
	 */
	public static void cacheResult(
		FitPropPersonalDetailInfo fitPropPersonalDetailInfo) {

		getPersistence().cacheResult(fitPropPersonalDetailInfo);
	}

	/**
	 * Caches the fit prop personal detail infos in the entity cache if it is enabled.
	 *
	 * @param fitPropPersonalDetailInfos the fit prop personal detail infos
	 */
	public static void cacheResult(
		List<FitPropPersonalDetailInfo> fitPropPersonalDetailInfos) {

		getPersistence().cacheResult(fitPropPersonalDetailInfos);
	}

	/**
	 * Creates a new fit prop personal detail info with the primary key. Does not add the fit prop personal detail info to the database.
	 *
	 * @param fitPropPersonalDetailInfoId the primary key for the new fit prop personal detail info
	 * @return the new fit prop personal detail info
	 */
	public static FitPropPersonalDetailInfo create(
		long fitPropPersonalDetailInfoId) {

		return getPersistence().create(fitPropPersonalDetailInfoId);
	}

	/**
	 * Removes the fit prop personal detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fitPropPersonalDetailInfoId the primary key of the fit prop personal detail info
	 * @return the fit prop personal detail info that was removed
	 * @throws NoSuchFitPropPersonalDetailInfoException if a fit prop personal detail info with the primary key could not be found
	 */
	public static FitPropPersonalDetailInfo remove(
			long fitPropPersonalDetailInfoId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchFitPropPersonalDetailInfoException {

		return getPersistence().remove(fitPropPersonalDetailInfoId);
	}

	public static FitPropPersonalDetailInfo updateImpl(
		FitPropPersonalDetailInfo fitPropPersonalDetailInfo) {

		return getPersistence().updateImpl(fitPropPersonalDetailInfo);
	}

	/**
	 * Returns the fit prop personal detail info with the primary key or throws a <code>NoSuchFitPropPersonalDetailInfoException</code> if it could not be found.
	 *
	 * @param fitPropPersonalDetailInfoId the primary key of the fit prop personal detail info
	 * @return the fit prop personal detail info
	 * @throws NoSuchFitPropPersonalDetailInfoException if a fit prop personal detail info with the primary key could not be found
	 */
	public static FitPropPersonalDetailInfo findByPrimaryKey(
			long fitPropPersonalDetailInfoId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchFitPropPersonalDetailInfoException {

		return getPersistence().findByPrimaryKey(fitPropPersonalDetailInfoId);
	}

	/**
	 * Returns the fit prop personal detail info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fitPropPersonalDetailInfoId the primary key of the fit prop personal detail info
	 * @return the fit prop personal detail info, or <code>null</code> if a fit prop personal detail info with the primary key could not be found
	 */
	public static FitPropPersonalDetailInfo fetchByPrimaryKey(
		long fitPropPersonalDetailInfoId) {

		return getPersistence().fetchByPrimaryKey(fitPropPersonalDetailInfoId);
	}

	/**
	 * Returns all the fit prop personal detail infos.
	 *
	 * @return the fit prop personal detail infos
	 */
	public static List<FitPropPersonalDetailInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the fit prop personal detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropPersonalDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop personal detail infos
	 * @param end the upper bound of the range of fit prop personal detail infos (not inclusive)
	 * @return the range of fit prop personal detail infos
	 */
	public static List<FitPropPersonalDetailInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the fit prop personal detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropPersonalDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop personal detail infos
	 * @param end the upper bound of the range of fit prop personal detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fit prop personal detail infos
	 */
	public static List<FitPropPersonalDetailInfo> findAll(
		int start, int end,
		OrderByComparator<FitPropPersonalDetailInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fit prop personal detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropPersonalDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop personal detail infos
	 * @param end the upper bound of the range of fit prop personal detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fit prop personal detail infos
	 */
	public static List<FitPropPersonalDetailInfo> findAll(
		int start, int end,
		OrderByComparator<FitPropPersonalDetailInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the fit prop personal detail infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of fit prop personal detail infos.
	 *
	 * @return the number of fit prop personal detail infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FitPropPersonalDetailInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FitPropPersonalDetailInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FitPropPersonalDetailInfoPersistence _persistence;

}