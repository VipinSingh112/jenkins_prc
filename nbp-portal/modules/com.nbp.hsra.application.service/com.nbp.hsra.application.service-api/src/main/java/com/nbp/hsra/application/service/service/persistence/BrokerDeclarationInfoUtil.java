/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.BrokerDeclarationInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the broker declaration info service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.BrokerDeclarationInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BrokerDeclarationInfoPersistence
 * @generated
 */
public class BrokerDeclarationInfoUtil {

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
	public static void clearCache(BrokerDeclarationInfo brokerDeclarationInfo) {
		getPersistence().clearCache(brokerDeclarationInfo);
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
	public static Map<Serializable, BrokerDeclarationInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<BrokerDeclarationInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BrokerDeclarationInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BrokerDeclarationInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<BrokerDeclarationInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static BrokerDeclarationInfo update(
		BrokerDeclarationInfo brokerDeclarationInfo) {

		return getPersistence().update(brokerDeclarationInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static BrokerDeclarationInfo update(
		BrokerDeclarationInfo brokerDeclarationInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(brokerDeclarationInfo, serviceContext);
	}

	/**
	 * Returns the broker declaration info where hsraApplicationId = &#63; or throws a <code>NoSuchBrokerDeclarationInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching broker declaration info
	 * @throws NoSuchBrokerDeclarationInfoException if a matching broker declaration info could not be found
	 */
	public static BrokerDeclarationInfo findBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchBrokerDeclarationInfoException {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the broker declaration info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching broker declaration info, or <code>null</code> if a matching broker declaration info could not be found
	 */
	public static BrokerDeclarationInfo fetchBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().fetchBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the broker declaration info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching broker declaration info, or <code>null</code> if a matching broker declaration info could not be found
	 */
	public static BrokerDeclarationInfo fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraById(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the broker declaration info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the broker declaration info that was removed
	 */
	public static BrokerDeclarationInfo removeBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchBrokerDeclarationInfoException {

		return getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of broker declaration infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching broker declaration infos
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the broker declaration info in the entity cache if it is enabled.
	 *
	 * @param brokerDeclarationInfo the broker declaration info
	 */
	public static void cacheResult(
		BrokerDeclarationInfo brokerDeclarationInfo) {

		getPersistence().cacheResult(brokerDeclarationInfo);
	}

	/**
	 * Caches the broker declaration infos in the entity cache if it is enabled.
	 *
	 * @param brokerDeclarationInfos the broker declaration infos
	 */
	public static void cacheResult(
		List<BrokerDeclarationInfo> brokerDeclarationInfos) {

		getPersistence().cacheResult(brokerDeclarationInfos);
	}

	/**
	 * Creates a new broker declaration info with the primary key. Does not add the broker declaration info to the database.
	 *
	 * @param brokerDeclareInfoId the primary key for the new broker declaration info
	 * @return the new broker declaration info
	 */
	public static BrokerDeclarationInfo create(long brokerDeclareInfoId) {
		return getPersistence().create(brokerDeclareInfoId);
	}

	/**
	 * Removes the broker declaration info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param brokerDeclareInfoId the primary key of the broker declaration info
	 * @return the broker declaration info that was removed
	 * @throws NoSuchBrokerDeclarationInfoException if a broker declaration info with the primary key could not be found
	 */
	public static BrokerDeclarationInfo remove(long brokerDeclareInfoId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchBrokerDeclarationInfoException {

		return getPersistence().remove(brokerDeclareInfoId);
	}

	public static BrokerDeclarationInfo updateImpl(
		BrokerDeclarationInfo brokerDeclarationInfo) {

		return getPersistence().updateImpl(brokerDeclarationInfo);
	}

	/**
	 * Returns the broker declaration info with the primary key or throws a <code>NoSuchBrokerDeclarationInfoException</code> if it could not be found.
	 *
	 * @param brokerDeclareInfoId the primary key of the broker declaration info
	 * @return the broker declaration info
	 * @throws NoSuchBrokerDeclarationInfoException if a broker declaration info with the primary key could not be found
	 */
	public static BrokerDeclarationInfo findByPrimaryKey(
			long brokerDeclareInfoId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchBrokerDeclarationInfoException {

		return getPersistence().findByPrimaryKey(brokerDeclareInfoId);
	}

	/**
	 * Returns the broker declaration info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param brokerDeclareInfoId the primary key of the broker declaration info
	 * @return the broker declaration info, or <code>null</code> if a broker declaration info with the primary key could not be found
	 */
	public static BrokerDeclarationInfo fetchByPrimaryKey(
		long brokerDeclareInfoId) {

		return getPersistence().fetchByPrimaryKey(brokerDeclareInfoId);
	}

	/**
	 * Returns all the broker declaration infos.
	 *
	 * @return the broker declaration infos
	 */
	public static List<BrokerDeclarationInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the broker declaration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BrokerDeclarationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of broker declaration infos
	 * @param end the upper bound of the range of broker declaration infos (not inclusive)
	 * @return the range of broker declaration infos
	 */
	public static List<BrokerDeclarationInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the broker declaration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BrokerDeclarationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of broker declaration infos
	 * @param end the upper bound of the range of broker declaration infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of broker declaration infos
	 */
	public static List<BrokerDeclarationInfo> findAll(
		int start, int end,
		OrderByComparator<BrokerDeclarationInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the broker declaration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BrokerDeclarationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of broker declaration infos
	 * @param end the upper bound of the range of broker declaration infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of broker declaration infos
	 */
	public static List<BrokerDeclarationInfo> findAll(
		int start, int end,
		OrderByComparator<BrokerDeclarationInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the broker declaration infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of broker declaration infos.
	 *
	 * @return the number of broker declaration infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BrokerDeclarationInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		BrokerDeclarationInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile BrokerDeclarationInfoPersistence _persistence;

}