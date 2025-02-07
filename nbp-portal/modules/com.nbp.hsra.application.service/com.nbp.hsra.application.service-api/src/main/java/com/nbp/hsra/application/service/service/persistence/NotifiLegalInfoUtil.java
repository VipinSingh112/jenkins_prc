/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.NotifiLegalInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the notifi legal info service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.NotifiLegalInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NotifiLegalInfoPersistence
 * @generated
 */
public class NotifiLegalInfoUtil {

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
	public static void clearCache(NotifiLegalInfo notifiLegalInfo) {
		getPersistence().clearCache(notifiLegalInfo);
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
	public static Map<Serializable, NotifiLegalInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NotifiLegalInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NotifiLegalInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NotifiLegalInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NotifiLegalInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NotifiLegalInfo update(NotifiLegalInfo notifiLegalInfo) {
		return getPersistence().update(notifiLegalInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NotifiLegalInfo update(
		NotifiLegalInfo notifiLegalInfo, ServiceContext serviceContext) {

		return getPersistence().update(notifiLegalInfo, serviceContext);
	}

	/**
	 * Returns the notifi legal info where hsraApplicationId = &#63; or throws a <code>NoSuchNotifiLegalInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching notifi legal info
	 * @throws NoSuchNotifiLegalInfoException if a matching notifi legal info could not be found
	 */
	public static NotifiLegalInfo findBygetHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchNotifiLegalInfoException {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the notifi legal info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching notifi legal info, or <code>null</code> if a matching notifi legal info could not be found
	 */
	public static NotifiLegalInfo fetchBygetHsraById(long hsraApplicationId) {
		return getPersistence().fetchBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the notifi legal info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching notifi legal info, or <code>null</code> if a matching notifi legal info could not be found
	 */
	public static NotifiLegalInfo fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraById(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the notifi legal info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the notifi legal info that was removed
	 */
	public static NotifiLegalInfo removeBygetHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchNotifiLegalInfoException {

		return getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of notifi legal infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching notifi legal infos
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the notifi legal info in the entity cache if it is enabled.
	 *
	 * @param notifiLegalInfo the notifi legal info
	 */
	public static void cacheResult(NotifiLegalInfo notifiLegalInfo) {
		getPersistence().cacheResult(notifiLegalInfo);
	}

	/**
	 * Caches the notifi legal infos in the entity cache if it is enabled.
	 *
	 * @param notifiLegalInfos the notifi legal infos
	 */
	public static void cacheResult(List<NotifiLegalInfo> notifiLegalInfos) {
		getPersistence().cacheResult(notifiLegalInfos);
	}

	/**
	 * Creates a new notifi legal info with the primary key. Does not add the notifi legal info to the database.
	 *
	 * @param notifiLegalInfoId the primary key for the new notifi legal info
	 * @return the new notifi legal info
	 */
	public static NotifiLegalInfo create(long notifiLegalInfoId) {
		return getPersistence().create(notifiLegalInfoId);
	}

	/**
	 * Removes the notifi legal info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param notifiLegalInfoId the primary key of the notifi legal info
	 * @return the notifi legal info that was removed
	 * @throws NoSuchNotifiLegalInfoException if a notifi legal info with the primary key could not be found
	 */
	public static NotifiLegalInfo remove(long notifiLegalInfoId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchNotifiLegalInfoException {

		return getPersistence().remove(notifiLegalInfoId);
	}

	public static NotifiLegalInfo updateImpl(NotifiLegalInfo notifiLegalInfo) {
		return getPersistence().updateImpl(notifiLegalInfo);
	}

	/**
	 * Returns the notifi legal info with the primary key or throws a <code>NoSuchNotifiLegalInfoException</code> if it could not be found.
	 *
	 * @param notifiLegalInfoId the primary key of the notifi legal info
	 * @return the notifi legal info
	 * @throws NoSuchNotifiLegalInfoException if a notifi legal info with the primary key could not be found
	 */
	public static NotifiLegalInfo findByPrimaryKey(long notifiLegalInfoId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchNotifiLegalInfoException {

		return getPersistence().findByPrimaryKey(notifiLegalInfoId);
	}

	/**
	 * Returns the notifi legal info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param notifiLegalInfoId the primary key of the notifi legal info
	 * @return the notifi legal info, or <code>null</code> if a notifi legal info with the primary key could not be found
	 */
	public static NotifiLegalInfo fetchByPrimaryKey(long notifiLegalInfoId) {
		return getPersistence().fetchByPrimaryKey(notifiLegalInfoId);
	}

	/**
	 * Returns all the notifi legal infos.
	 *
	 * @return the notifi legal infos
	 */
	public static List<NotifiLegalInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the notifi legal infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotifiLegalInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of notifi legal infos
	 * @param end the upper bound of the range of notifi legal infos (not inclusive)
	 * @return the range of notifi legal infos
	 */
	public static List<NotifiLegalInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the notifi legal infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotifiLegalInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of notifi legal infos
	 * @param end the upper bound of the range of notifi legal infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of notifi legal infos
	 */
	public static List<NotifiLegalInfo> findAll(
		int start, int end,
		OrderByComparator<NotifiLegalInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the notifi legal infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotifiLegalInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of notifi legal infos
	 * @param end the upper bound of the range of notifi legal infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of notifi legal infos
	 */
	public static List<NotifiLegalInfo> findAll(
		int start, int end,
		OrderByComparator<NotifiLegalInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the notifi legal infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of notifi legal infos.
	 *
	 * @return the number of notifi legal infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NotifiLegalInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(NotifiLegalInfoPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile NotifiLegalInfoPersistence _persistence;

}