/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.QualityEmploymentInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the quality employment info service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.QualityEmploymentInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QualityEmploymentInfoPersistence
 * @generated
 */
public class QualityEmploymentInfoUtil {

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
	public static void clearCache(QualityEmploymentInfo qualityEmploymentInfo) {
		getPersistence().clearCache(qualityEmploymentInfo);
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
	public static Map<Serializable, QualityEmploymentInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QualityEmploymentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QualityEmploymentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QualityEmploymentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<QualityEmploymentInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static QualityEmploymentInfo update(
		QualityEmploymentInfo qualityEmploymentInfo) {

		return getPersistence().update(qualityEmploymentInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static QualityEmploymentInfo update(
		QualityEmploymentInfo qualityEmploymentInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(qualityEmploymentInfo, serviceContext);
	}

	/**
	 * Returns the quality employment info where hsraApplicationId = &#63; or throws a <code>NoSuchQualityEmploymentInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality employment info
	 * @throws NoSuchQualityEmploymentInfoException if a matching quality employment info could not be found
	 */
	public static QualityEmploymentInfo findBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualityEmploymentInfoException {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the quality employment info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching quality employment info, or <code>null</code> if a matching quality employment info could not be found
	 */
	public static QualityEmploymentInfo fetchBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().fetchBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the quality employment info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quality employment info, or <code>null</code> if a matching quality employment info could not be found
	 */
	public static QualityEmploymentInfo fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraById(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the quality employment info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the quality employment info that was removed
	 */
	public static QualityEmploymentInfo removeBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualityEmploymentInfoException {

		return getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of quality employment infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching quality employment infos
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the quality employment info in the entity cache if it is enabled.
	 *
	 * @param qualityEmploymentInfo the quality employment info
	 */
	public static void cacheResult(
		QualityEmploymentInfo qualityEmploymentInfo) {

		getPersistence().cacheResult(qualityEmploymentInfo);
	}

	/**
	 * Caches the quality employment infos in the entity cache if it is enabled.
	 *
	 * @param qualityEmploymentInfos the quality employment infos
	 */
	public static void cacheResult(
		List<QualityEmploymentInfo> qualityEmploymentInfos) {

		getPersistence().cacheResult(qualityEmploymentInfos);
	}

	/**
	 * Creates a new quality employment info with the primary key. Does not add the quality employment info to the database.
	 *
	 * @param qualityEmploymentInfoId the primary key for the new quality employment info
	 * @return the new quality employment info
	 */
	public static QualityEmploymentInfo create(long qualityEmploymentInfoId) {
		return getPersistence().create(qualityEmploymentInfoId);
	}

	/**
	 * Removes the quality employment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param qualityEmploymentInfoId the primary key of the quality employment info
	 * @return the quality employment info that was removed
	 * @throws NoSuchQualityEmploymentInfoException if a quality employment info with the primary key could not be found
	 */
	public static QualityEmploymentInfo remove(long qualityEmploymentInfoId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualityEmploymentInfoException {

		return getPersistence().remove(qualityEmploymentInfoId);
	}

	public static QualityEmploymentInfo updateImpl(
		QualityEmploymentInfo qualityEmploymentInfo) {

		return getPersistence().updateImpl(qualityEmploymentInfo);
	}

	/**
	 * Returns the quality employment info with the primary key or throws a <code>NoSuchQualityEmploymentInfoException</code> if it could not be found.
	 *
	 * @param qualityEmploymentInfoId the primary key of the quality employment info
	 * @return the quality employment info
	 * @throws NoSuchQualityEmploymentInfoException if a quality employment info with the primary key could not be found
	 */
	public static QualityEmploymentInfo findByPrimaryKey(
			long qualityEmploymentInfoId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchQualityEmploymentInfoException {

		return getPersistence().findByPrimaryKey(qualityEmploymentInfoId);
	}

	/**
	 * Returns the quality employment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param qualityEmploymentInfoId the primary key of the quality employment info
	 * @return the quality employment info, or <code>null</code> if a quality employment info with the primary key could not be found
	 */
	public static QualityEmploymentInfo fetchByPrimaryKey(
		long qualityEmploymentInfoId) {

		return getPersistence().fetchByPrimaryKey(qualityEmploymentInfoId);
	}

	/**
	 * Returns all the quality employment infos.
	 *
	 * @return the quality employment infos
	 */
	public static List<QualityEmploymentInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the quality employment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality employment infos
	 * @param end the upper bound of the range of quality employment infos (not inclusive)
	 * @return the range of quality employment infos
	 */
	public static List<QualityEmploymentInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the quality employment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality employment infos
	 * @param end the upper bound of the range of quality employment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quality employment infos
	 */
	public static List<QualityEmploymentInfo> findAll(
		int start, int end,
		OrderByComparator<QualityEmploymentInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quality employment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QualityEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quality employment infos
	 * @param end the upper bound of the range of quality employment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quality employment infos
	 */
	public static List<QualityEmploymentInfo> findAll(
		int start, int end,
		OrderByComparator<QualityEmploymentInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the quality employment infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of quality employment infos.
	 *
	 * @return the number of quality employment infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QualityEmploymentInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		QualityEmploymentInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile QualityEmploymentInfoPersistence _persistence;

}