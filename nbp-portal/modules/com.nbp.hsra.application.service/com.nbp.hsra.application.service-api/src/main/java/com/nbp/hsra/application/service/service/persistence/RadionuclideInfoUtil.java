/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.RadionuclideInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the radionuclide info service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.RadionuclideInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadionuclideInfoPersistence
 * @generated
 */
public class RadionuclideInfoUtil {

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
	public static void clearCache(RadionuclideInfo radionuclideInfo) {
		getPersistence().clearCache(radionuclideInfo);
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
	public static Map<Serializable, RadionuclideInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<RadionuclideInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RadionuclideInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RadionuclideInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RadionuclideInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RadionuclideInfo update(RadionuclideInfo radionuclideInfo) {
		return getPersistence().update(radionuclideInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RadionuclideInfo update(
		RadionuclideInfo radionuclideInfo, ServiceContext serviceContext) {

		return getPersistence().update(radionuclideInfo, serviceContext);
	}

	/**
	 * Returns the radionuclide info where hsraApplicationId = &#63; or throws a <code>NoSuchRadionuclideInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radionuclide info
	 * @throws NoSuchRadionuclideInfoException if a matching radionuclide info could not be found
	 */
	public static RadionuclideInfo findBygetHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadionuclideInfoException {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the radionuclide info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radionuclide info, or <code>null</code> if a matching radionuclide info could not be found
	 */
	public static RadionuclideInfo fetchBygetHsraById(long hsraApplicationId) {
		return getPersistence().fetchBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the radionuclide info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching radionuclide info, or <code>null</code> if a matching radionuclide info could not be found
	 */
	public static RadionuclideInfo fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraById(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the radionuclide info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the radionuclide info that was removed
	 */
	public static RadionuclideInfo removeBygetHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadionuclideInfoException {

		return getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of radionuclide infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radionuclide infos
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the radionuclide info in the entity cache if it is enabled.
	 *
	 * @param radionuclideInfo the radionuclide info
	 */
	public static void cacheResult(RadionuclideInfo radionuclideInfo) {
		getPersistence().cacheResult(radionuclideInfo);
	}

	/**
	 * Caches the radionuclide infos in the entity cache if it is enabled.
	 *
	 * @param radionuclideInfos the radionuclide infos
	 */
	public static void cacheResult(List<RadionuclideInfo> radionuclideInfos) {
		getPersistence().cacheResult(radionuclideInfos);
	}

	/**
	 * Creates a new radionuclide info with the primary key. Does not add the radionuclide info to the database.
	 *
	 * @param radionuclideInfoId the primary key for the new radionuclide info
	 * @return the new radionuclide info
	 */
	public static RadionuclideInfo create(long radionuclideInfoId) {
		return getPersistence().create(radionuclideInfoId);
	}

	/**
	 * Removes the radionuclide info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radionuclideInfoId the primary key of the radionuclide info
	 * @return the radionuclide info that was removed
	 * @throws NoSuchRadionuclideInfoException if a radionuclide info with the primary key could not be found
	 */
	public static RadionuclideInfo remove(long radionuclideInfoId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadionuclideInfoException {

		return getPersistence().remove(radionuclideInfoId);
	}

	public static RadionuclideInfo updateImpl(
		RadionuclideInfo radionuclideInfo) {

		return getPersistence().updateImpl(radionuclideInfo);
	}

	/**
	 * Returns the radionuclide info with the primary key or throws a <code>NoSuchRadionuclideInfoException</code> if it could not be found.
	 *
	 * @param radionuclideInfoId the primary key of the radionuclide info
	 * @return the radionuclide info
	 * @throws NoSuchRadionuclideInfoException if a radionuclide info with the primary key could not be found
	 */
	public static RadionuclideInfo findByPrimaryKey(long radionuclideInfoId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadionuclideInfoException {

		return getPersistence().findByPrimaryKey(radionuclideInfoId);
	}

	/**
	 * Returns the radionuclide info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radionuclideInfoId the primary key of the radionuclide info
	 * @return the radionuclide info, or <code>null</code> if a radionuclide info with the primary key could not be found
	 */
	public static RadionuclideInfo fetchByPrimaryKey(long radionuclideInfoId) {
		return getPersistence().fetchByPrimaryKey(radionuclideInfoId);
	}

	/**
	 * Returns all the radionuclide infos.
	 *
	 * @return the radionuclide infos
	 */
	public static List<RadionuclideInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the radionuclide infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radionuclide infos
	 * @param end the upper bound of the range of radionuclide infos (not inclusive)
	 * @return the range of radionuclide infos
	 */
	public static List<RadionuclideInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the radionuclide infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radionuclide infos
	 * @param end the upper bound of the range of radionuclide infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radionuclide infos
	 */
	public static List<RadionuclideInfo> findAll(
		int start, int end,
		OrderByComparator<RadionuclideInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the radionuclide infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radionuclide infos
	 * @param end the upper bound of the range of radionuclide infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radionuclide infos
	 */
	public static List<RadionuclideInfo> findAll(
		int start, int end,
		OrderByComparator<RadionuclideInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the radionuclide infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of radionuclide infos.
	 *
	 * @return the number of radionuclide infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RadionuclideInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(RadionuclideInfoPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile RadionuclideInfoPersistence _persistence;

}