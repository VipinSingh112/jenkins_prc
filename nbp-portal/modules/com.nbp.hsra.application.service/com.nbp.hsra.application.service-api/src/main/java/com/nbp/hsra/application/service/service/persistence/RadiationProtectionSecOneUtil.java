/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.RadiationProtectionSecOne;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the radiation protection sec one service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.RadiationProtectionSecOnePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadiationProtectionSecOnePersistence
 * @generated
 */
public class RadiationProtectionSecOneUtil {

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
		RadiationProtectionSecOne radiationProtectionSecOne) {

		getPersistence().clearCache(radiationProtectionSecOne);
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
	public static Map<Serializable, RadiationProtectionSecOne>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<RadiationProtectionSecOne> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RadiationProtectionSecOne> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RadiationProtectionSecOne> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RadiationProtectionSecOne> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RadiationProtectionSecOne update(
		RadiationProtectionSecOne radiationProtectionSecOne) {

		return getPersistence().update(radiationProtectionSecOne);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RadiationProtectionSecOne update(
		RadiationProtectionSecOne radiationProtectionSecOne,
		ServiceContext serviceContext) {

		return getPersistence().update(
			radiationProtectionSecOne, serviceContext);
	}

	/**
	 * Returns the radiation protection sec one where hsraApplicationId = &#63; or throws a <code>NoSuchRadiationProtectionSecOneException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation protection sec one
	 * @throws NoSuchRadiationProtectionSecOneException if a matching radiation protection sec one could not be found
	 */
	public static RadiationProtectionSecOne findBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationProtectionSecOneException {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the radiation protection sec one where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation protection sec one, or <code>null</code> if a matching radiation protection sec one could not be found
	 */
	public static RadiationProtectionSecOne fetchBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().fetchBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the radiation protection sec one where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching radiation protection sec one, or <code>null</code> if a matching radiation protection sec one could not be found
	 */
	public static RadiationProtectionSecOne fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraById(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the radiation protection sec one where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the radiation protection sec one that was removed
	 */
	public static RadiationProtectionSecOne removeBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationProtectionSecOneException {

		return getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of radiation protection sec ones where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radiation protection sec ones
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the radiation protection sec one in the entity cache if it is enabled.
	 *
	 * @param radiationProtectionSecOne the radiation protection sec one
	 */
	public static void cacheResult(
		RadiationProtectionSecOne radiationProtectionSecOne) {

		getPersistence().cacheResult(radiationProtectionSecOne);
	}

	/**
	 * Caches the radiation protection sec ones in the entity cache if it is enabled.
	 *
	 * @param radiationProtectionSecOnes the radiation protection sec ones
	 */
	public static void cacheResult(
		List<RadiationProtectionSecOne> radiationProtectionSecOnes) {

		getPersistence().cacheResult(radiationProtectionSecOnes);
	}

	/**
	 * Creates a new radiation protection sec one with the primary key. Does not add the radiation protection sec one to the database.
	 *
	 * @param radiationProtectSecOneId the primary key for the new radiation protection sec one
	 * @return the new radiation protection sec one
	 */
	public static RadiationProtectionSecOne create(
		long radiationProtectSecOneId) {

		return getPersistence().create(radiationProtectSecOneId);
	}

	/**
	 * Removes the radiation protection sec one with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radiationProtectSecOneId the primary key of the radiation protection sec one
	 * @return the radiation protection sec one that was removed
	 * @throws NoSuchRadiationProtectionSecOneException if a radiation protection sec one with the primary key could not be found
	 */
	public static RadiationProtectionSecOne remove(
			long radiationProtectSecOneId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationProtectionSecOneException {

		return getPersistence().remove(radiationProtectSecOneId);
	}

	public static RadiationProtectionSecOne updateImpl(
		RadiationProtectionSecOne radiationProtectionSecOne) {

		return getPersistence().updateImpl(radiationProtectionSecOne);
	}

	/**
	 * Returns the radiation protection sec one with the primary key or throws a <code>NoSuchRadiationProtectionSecOneException</code> if it could not be found.
	 *
	 * @param radiationProtectSecOneId the primary key of the radiation protection sec one
	 * @return the radiation protection sec one
	 * @throws NoSuchRadiationProtectionSecOneException if a radiation protection sec one with the primary key could not be found
	 */
	public static RadiationProtectionSecOne findByPrimaryKey(
			long radiationProtectSecOneId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationProtectionSecOneException {

		return getPersistence().findByPrimaryKey(radiationProtectSecOneId);
	}

	/**
	 * Returns the radiation protection sec one with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radiationProtectSecOneId the primary key of the radiation protection sec one
	 * @return the radiation protection sec one, or <code>null</code> if a radiation protection sec one with the primary key could not be found
	 */
	public static RadiationProtectionSecOne fetchByPrimaryKey(
		long radiationProtectSecOneId) {

		return getPersistence().fetchByPrimaryKey(radiationProtectSecOneId);
	}

	/**
	 * Returns all the radiation protection sec ones.
	 *
	 * @return the radiation protection sec ones
	 */
	public static List<RadiationProtectionSecOne> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the radiation protection sec ones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationProtectionSecOneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation protection sec ones
	 * @param end the upper bound of the range of radiation protection sec ones (not inclusive)
	 * @return the range of radiation protection sec ones
	 */
	public static List<RadiationProtectionSecOne> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the radiation protection sec ones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationProtectionSecOneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation protection sec ones
	 * @param end the upper bound of the range of radiation protection sec ones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radiation protection sec ones
	 */
	public static List<RadiationProtectionSecOne> findAll(
		int start, int end,
		OrderByComparator<RadiationProtectionSecOne> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the radiation protection sec ones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationProtectionSecOneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation protection sec ones
	 * @param end the upper bound of the range of radiation protection sec ones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radiation protection sec ones
	 */
	public static List<RadiationProtectionSecOne> findAll(
		int start, int end,
		OrderByComparator<RadiationProtectionSecOne> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the radiation protection sec ones from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of radiation protection sec ones.
	 *
	 * @return the number of radiation protection sec ones
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RadiationProtectionSecOnePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		RadiationProtectionSecOnePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile RadiationProtectionSecOnePersistence _persistence;

}