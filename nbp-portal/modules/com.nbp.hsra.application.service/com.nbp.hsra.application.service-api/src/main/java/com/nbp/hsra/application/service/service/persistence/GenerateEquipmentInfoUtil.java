/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.GenerateEquipmentInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the generate equipment info service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.GenerateEquipmentInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GenerateEquipmentInfoPersistence
 * @generated
 */
public class GenerateEquipmentInfoUtil {

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
	public static void clearCache(GenerateEquipmentInfo generateEquipmentInfo) {
		getPersistence().clearCache(generateEquipmentInfo);
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
	public static Map<Serializable, GenerateEquipmentInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<GenerateEquipmentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<GenerateEquipmentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<GenerateEquipmentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<GenerateEquipmentInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static GenerateEquipmentInfo update(
		GenerateEquipmentInfo generateEquipmentInfo) {

		return getPersistence().update(generateEquipmentInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static GenerateEquipmentInfo update(
		GenerateEquipmentInfo generateEquipmentInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(generateEquipmentInfo, serviceContext);
	}

	/**
	 * Returns the generate equipment info where hsraApplicationId = &#63; or throws a <code>NoSuchGenerateEquipmentInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching generate equipment info
	 * @throws NoSuchGenerateEquipmentInfoException if a matching generate equipment info could not be found
	 */
	public static GenerateEquipmentInfo findBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchGenerateEquipmentInfoException {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the generate equipment info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching generate equipment info, or <code>null</code> if a matching generate equipment info could not be found
	 */
	public static GenerateEquipmentInfo fetchBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().fetchBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the generate equipment info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching generate equipment info, or <code>null</code> if a matching generate equipment info could not be found
	 */
	public static GenerateEquipmentInfo fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraById(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the generate equipment info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the generate equipment info that was removed
	 */
	public static GenerateEquipmentInfo removeBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchGenerateEquipmentInfoException {

		return getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of generate equipment infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching generate equipment infos
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the generate equipment info in the entity cache if it is enabled.
	 *
	 * @param generateEquipmentInfo the generate equipment info
	 */
	public static void cacheResult(
		GenerateEquipmentInfo generateEquipmentInfo) {

		getPersistence().cacheResult(generateEquipmentInfo);
	}

	/**
	 * Caches the generate equipment infos in the entity cache if it is enabled.
	 *
	 * @param generateEquipmentInfos the generate equipment infos
	 */
	public static void cacheResult(
		List<GenerateEquipmentInfo> generateEquipmentInfos) {

		getPersistence().cacheResult(generateEquipmentInfos);
	}

	/**
	 * Creates a new generate equipment info with the primary key. Does not add the generate equipment info to the database.
	 *
	 * @param GenerateEquipmentInfoId the primary key for the new generate equipment info
	 * @return the new generate equipment info
	 */
	public static GenerateEquipmentInfo create(long GenerateEquipmentInfoId) {
		return getPersistence().create(GenerateEquipmentInfoId);
	}

	/**
	 * Removes the generate equipment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param GenerateEquipmentInfoId the primary key of the generate equipment info
	 * @return the generate equipment info that was removed
	 * @throws NoSuchGenerateEquipmentInfoException if a generate equipment info with the primary key could not be found
	 */
	public static GenerateEquipmentInfo remove(long GenerateEquipmentInfoId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchGenerateEquipmentInfoException {

		return getPersistence().remove(GenerateEquipmentInfoId);
	}

	public static GenerateEquipmentInfo updateImpl(
		GenerateEquipmentInfo generateEquipmentInfo) {

		return getPersistence().updateImpl(generateEquipmentInfo);
	}

	/**
	 * Returns the generate equipment info with the primary key or throws a <code>NoSuchGenerateEquipmentInfoException</code> if it could not be found.
	 *
	 * @param GenerateEquipmentInfoId the primary key of the generate equipment info
	 * @return the generate equipment info
	 * @throws NoSuchGenerateEquipmentInfoException if a generate equipment info with the primary key could not be found
	 */
	public static GenerateEquipmentInfo findByPrimaryKey(
			long GenerateEquipmentInfoId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchGenerateEquipmentInfoException {

		return getPersistence().findByPrimaryKey(GenerateEquipmentInfoId);
	}

	/**
	 * Returns the generate equipment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param GenerateEquipmentInfoId the primary key of the generate equipment info
	 * @return the generate equipment info, or <code>null</code> if a generate equipment info with the primary key could not be found
	 */
	public static GenerateEquipmentInfo fetchByPrimaryKey(
		long GenerateEquipmentInfoId) {

		return getPersistence().fetchByPrimaryKey(GenerateEquipmentInfoId);
	}

	/**
	 * Returns all the generate equipment infos.
	 *
	 * @return the generate equipment infos
	 */
	public static List<GenerateEquipmentInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the generate equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenerateEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of generate equipment infos
	 * @param end the upper bound of the range of generate equipment infos (not inclusive)
	 * @return the range of generate equipment infos
	 */
	public static List<GenerateEquipmentInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the generate equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenerateEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of generate equipment infos
	 * @param end the upper bound of the range of generate equipment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of generate equipment infos
	 */
	public static List<GenerateEquipmentInfo> findAll(
		int start, int end,
		OrderByComparator<GenerateEquipmentInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the generate equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenerateEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of generate equipment infos
	 * @param end the upper bound of the range of generate equipment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of generate equipment infos
	 */
	public static List<GenerateEquipmentInfo> findAll(
		int start, int end,
		OrderByComparator<GenerateEquipmentInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the generate equipment infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of generate equipment infos.
	 *
	 * @return the number of generate equipment infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static GenerateEquipmentInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		GenerateEquipmentInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile GenerateEquipmentInfoPersistence _persistence;

}