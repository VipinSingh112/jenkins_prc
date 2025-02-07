/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.BrokerRegistrationInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the broker registration info service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.BrokerRegistrationInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BrokerRegistrationInfoPersistence
 * @generated
 */
public class BrokerRegistrationInfoUtil {

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
		BrokerRegistrationInfo brokerRegistrationInfo) {

		getPersistence().clearCache(brokerRegistrationInfo);
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
	public static Map<Serializable, BrokerRegistrationInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<BrokerRegistrationInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BrokerRegistrationInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BrokerRegistrationInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<BrokerRegistrationInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static BrokerRegistrationInfo update(
		BrokerRegistrationInfo brokerRegistrationInfo) {

		return getPersistence().update(brokerRegistrationInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static BrokerRegistrationInfo update(
		BrokerRegistrationInfo brokerRegistrationInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(brokerRegistrationInfo, serviceContext);
	}

	/**
	 * Returns the broker registration info where hsraApplicationId = &#63; or throws a <code>NoSuchBrokerRegistrationInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching broker registration info
	 * @throws NoSuchBrokerRegistrationInfoException if a matching broker registration info could not be found
	 */
	public static BrokerRegistrationInfo findBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchBrokerRegistrationInfoException {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the broker registration info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching broker registration info, or <code>null</code> if a matching broker registration info could not be found
	 */
	public static BrokerRegistrationInfo fetchBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().fetchBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the broker registration info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching broker registration info, or <code>null</code> if a matching broker registration info could not be found
	 */
	public static BrokerRegistrationInfo fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraById(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the broker registration info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the broker registration info that was removed
	 */
	public static BrokerRegistrationInfo removeBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchBrokerRegistrationInfoException {

		return getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of broker registration infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching broker registration infos
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the broker registration info in the entity cache if it is enabled.
	 *
	 * @param brokerRegistrationInfo the broker registration info
	 */
	public static void cacheResult(
		BrokerRegistrationInfo brokerRegistrationInfo) {

		getPersistence().cacheResult(brokerRegistrationInfo);
	}

	/**
	 * Caches the broker registration infos in the entity cache if it is enabled.
	 *
	 * @param brokerRegistrationInfos the broker registration infos
	 */
	public static void cacheResult(
		List<BrokerRegistrationInfo> brokerRegistrationInfos) {

		getPersistence().cacheResult(brokerRegistrationInfos);
	}

	/**
	 * Creates a new broker registration info with the primary key. Does not add the broker registration info to the database.
	 *
	 * @param brokerRegstInfoId the primary key for the new broker registration info
	 * @return the new broker registration info
	 */
	public static BrokerRegistrationInfo create(long brokerRegstInfoId) {
		return getPersistence().create(brokerRegstInfoId);
	}

	/**
	 * Removes the broker registration info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param brokerRegstInfoId the primary key of the broker registration info
	 * @return the broker registration info that was removed
	 * @throws NoSuchBrokerRegistrationInfoException if a broker registration info with the primary key could not be found
	 */
	public static BrokerRegistrationInfo remove(long brokerRegstInfoId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchBrokerRegistrationInfoException {

		return getPersistence().remove(brokerRegstInfoId);
	}

	public static BrokerRegistrationInfo updateImpl(
		BrokerRegistrationInfo brokerRegistrationInfo) {

		return getPersistence().updateImpl(brokerRegistrationInfo);
	}

	/**
	 * Returns the broker registration info with the primary key or throws a <code>NoSuchBrokerRegistrationInfoException</code> if it could not be found.
	 *
	 * @param brokerRegstInfoId the primary key of the broker registration info
	 * @return the broker registration info
	 * @throws NoSuchBrokerRegistrationInfoException if a broker registration info with the primary key could not be found
	 */
	public static BrokerRegistrationInfo findByPrimaryKey(
			long brokerRegstInfoId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchBrokerRegistrationInfoException {

		return getPersistence().findByPrimaryKey(brokerRegstInfoId);
	}

	/**
	 * Returns the broker registration info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param brokerRegstInfoId the primary key of the broker registration info
	 * @return the broker registration info, or <code>null</code> if a broker registration info with the primary key could not be found
	 */
	public static BrokerRegistrationInfo fetchByPrimaryKey(
		long brokerRegstInfoId) {

		return getPersistence().fetchByPrimaryKey(brokerRegstInfoId);
	}

	/**
	 * Returns all the broker registration infos.
	 *
	 * @return the broker registration infos
	 */
	public static List<BrokerRegistrationInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the broker registration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BrokerRegistrationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of broker registration infos
	 * @param end the upper bound of the range of broker registration infos (not inclusive)
	 * @return the range of broker registration infos
	 */
	public static List<BrokerRegistrationInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the broker registration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BrokerRegistrationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of broker registration infos
	 * @param end the upper bound of the range of broker registration infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of broker registration infos
	 */
	public static List<BrokerRegistrationInfo> findAll(
		int start, int end,
		OrderByComparator<BrokerRegistrationInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the broker registration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BrokerRegistrationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of broker registration infos
	 * @param end the upper bound of the range of broker registration infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of broker registration infos
	 */
	public static List<BrokerRegistrationInfo> findAll(
		int start, int end,
		OrderByComparator<BrokerRegistrationInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the broker registration infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of broker registration infos.
	 *
	 * @return the number of broker registration infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BrokerRegistrationInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		BrokerRegistrationInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile BrokerRegistrationInfoPersistence _persistence;

}