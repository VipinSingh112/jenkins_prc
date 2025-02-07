/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.QualityDeclarationInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the quality declaration info service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.QualityDeclarationInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualityDeclarationInfoPersistence
 * @generated
 */
public class QualityDeclarationInfoUtil {

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
		QualityDeclarationInfo qualityDeclarationInfo) {

		getPersistence().clearCache(qualityDeclarationInfo);
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
	public static Map<Serializable, QualityDeclarationInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QualityDeclarationInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QualityDeclarationInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QualityDeclarationInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<QualityDeclarationInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static QualityDeclarationInfo update(
		QualityDeclarationInfo qualityDeclarationInfo) {

		return getPersistence().update(qualityDeclarationInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static QualityDeclarationInfo update(
		QualityDeclarationInfo qualityDeclarationInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(qualityDeclarationInfo, serviceContext);
	}

	/**
	 * Returns the quality declaration info where hsraApplicationId = &#63; or throws a <code>NoSuchQualityDeclarationInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality declaration info
	 * @throws NoSuchQualityDeclarationInfoException if a matching quality declaration info could not be found
	 */
	public static QualityDeclarationInfo findBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualityDeclarationInfoException {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the quality declaration info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality declaration info, or <code>null</code> if a matching quality declaration info could not be found
	 */
	public static QualityDeclarationInfo fetchBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().fetchBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the quality declaration info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quality declaration info, or <code>null</code> if a matching quality declaration info could not be found
	 */
	public static QualityDeclarationInfo fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraById(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the quality declaration info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the quality declaration info that was removed
	 */
	public static QualityDeclarationInfo removeBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualityDeclarationInfoException {

		return getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of quality declaration infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching quality declaration infos
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the quality declaration info in the entity cache if it is enabled.
	 *
	 * @param qualityDeclarationInfo the quality declaration info
	 */
	public static void cacheResult(
		QualityDeclarationInfo qualityDeclarationInfo) {

		getPersistence().cacheResult(qualityDeclarationInfo);
	}

	/**
	 * Caches the quality declaration infos in the entity cache if it is enabled.
	 *
	 * @param qualityDeclarationInfos the quality declaration infos
	 */
	public static void cacheResult(
		List<QualityDeclarationInfo> qualityDeclarationInfos) {

		getPersistence().cacheResult(qualityDeclarationInfos);
	}

	/**
	 * Creates a new quality declaration info with the primary key. Does not add the quality declaration info to the database.
	 *
	 * @param qualityDeclarationInfoId the primary key for the new quality declaration info
	 * @return the new quality declaration info
	 */
	public static QualityDeclarationInfo create(long qualityDeclarationInfoId) {
		return getPersistence().create(qualityDeclarationInfoId);
	}

	/**
	 * Removes the quality declaration info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qualityDeclarationInfoId the primary key of the quality declaration info
	 * @return the quality declaration info that was removed
	 * @throws NoSuchQualityDeclarationInfoException if a quality declaration info with the primary key could not be found
	 */
	public static QualityDeclarationInfo remove(long qualityDeclarationInfoId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualityDeclarationInfoException {

		return getPersistence().remove(qualityDeclarationInfoId);
	}

	public static QualityDeclarationInfo updateImpl(
		QualityDeclarationInfo qualityDeclarationInfo) {

		return getPersistence().updateImpl(qualityDeclarationInfo);
	}

	/**
	 * Returns the quality declaration info with the primary key or throws a <code>NoSuchQualityDeclarationInfoException</code> if it could not be found.
	 *
	 * @param qualityDeclarationInfoId the primary key of the quality declaration info
	 * @return the quality declaration info
	 * @throws NoSuchQualityDeclarationInfoException if a quality declaration info with the primary key could not be found
	 */
	public static QualityDeclarationInfo findByPrimaryKey(
			long qualityDeclarationInfoId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualityDeclarationInfoException {

		return getPersistence().findByPrimaryKey(qualityDeclarationInfoId);
	}

	/**
	 * Returns the quality declaration info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param qualityDeclarationInfoId the primary key of the quality declaration info
	 * @return the quality declaration info, or <code>null</code> if a quality declaration info with the primary key could not be found
	 */
	public static QualityDeclarationInfo fetchByPrimaryKey(
		long qualityDeclarationInfoId) {

		return getPersistence().fetchByPrimaryKey(qualityDeclarationInfoId);
	}

	/**
	 * Returns all the quality declaration infos.
	 *
	 * @return the quality declaration infos
	 */
	public static List<QualityDeclarationInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the quality declaration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityDeclarationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality declaration infos
	 * @param end the upper bound of the range of quality declaration infos (not inclusive)
	 * @return the range of quality declaration infos
	 */
	public static List<QualityDeclarationInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the quality declaration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityDeclarationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality declaration infos
	 * @param end the upper bound of the range of quality declaration infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quality declaration infos
	 */
	public static List<QualityDeclarationInfo> findAll(
		int start, int end,
		OrderByComparator<QualityDeclarationInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quality declaration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityDeclarationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality declaration infos
	 * @param end the upper bound of the range of quality declaration infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quality declaration infos
	 */
	public static List<QualityDeclarationInfo> findAll(
		int start, int end,
		OrderByComparator<QualityDeclarationInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the quality declaration infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of quality declaration infos.
	 *
	 * @return the number of quality declaration infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QualityDeclarationInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		QualityDeclarationInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile QualityDeclarationInfoPersistence _persistence;

}