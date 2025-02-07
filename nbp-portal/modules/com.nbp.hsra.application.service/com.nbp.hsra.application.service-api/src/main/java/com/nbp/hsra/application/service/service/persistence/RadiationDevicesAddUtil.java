/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.RadiationDevicesAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the radiation devices add service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.RadiationDevicesAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadiationDevicesAddPersistence
 * @generated
 */
public class RadiationDevicesAddUtil {

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
	public static void clearCache(RadiationDevicesAdd radiationDevicesAdd) {
		getPersistence().clearCache(radiationDevicesAdd);
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
	public static Map<Serializable, RadiationDevicesAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<RadiationDevicesAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RadiationDevicesAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RadiationDevicesAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RadiationDevicesAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RadiationDevicesAdd update(
		RadiationDevicesAdd radiationDevicesAdd) {

		return getPersistence().update(radiationDevicesAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RadiationDevicesAdd update(
		RadiationDevicesAdd radiationDevicesAdd,
		ServiceContext serviceContext) {

		return getPersistence().update(radiationDevicesAdd, serviceContext);
	}

	/**
	 * Returns all the radiation devices adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation devices adds
	 */
	public static List<RadiationDevicesAdd> findBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns a range of all the radiation devices adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radiation devices adds
	 * @param end the upper bound of the range of radiation devices adds (not inclusive)
	 * @return the range of matching radiation devices adds
	 */
	public static List<RadiationDevicesAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the radiation devices adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radiation devices adds
	 * @param end the upper bound of the range of radiation devices adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching radiation devices adds
	 */
	public static List<RadiationDevicesAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<RadiationDevicesAdd> orderByComparator) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the radiation devices adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radiation devices adds
	 * @param end the upper bound of the range of radiation devices adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching radiation devices adds
	 */
	public static List<RadiationDevicesAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<RadiationDevicesAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first radiation devices add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching radiation devices add
	 * @throws NoSuchRadiationDevicesAddException if a matching radiation devices add could not be found
	 */
	public static RadiationDevicesAdd findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<RadiationDevicesAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationDevicesAddException {

		return getPersistence().findBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first radiation devices add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching radiation devices add, or <code>null</code> if a matching radiation devices add could not be found
	 */
	public static RadiationDevicesAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<RadiationDevicesAdd> orderByComparator) {

		return getPersistence().fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last radiation devices add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching radiation devices add
	 * @throws NoSuchRadiationDevicesAddException if a matching radiation devices add could not be found
	 */
	public static RadiationDevicesAdd findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<RadiationDevicesAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationDevicesAddException {

		return getPersistence().findBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last radiation devices add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching radiation devices add, or <code>null</code> if a matching radiation devices add could not be found
	 */
	public static RadiationDevicesAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<RadiationDevicesAdd> orderByComparator) {

		return getPersistence().fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the radiation devices adds before and after the current radiation devices add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param radiationDevicesAddId the primary key of the current radiation devices add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next radiation devices add
	 * @throws NoSuchRadiationDevicesAddException if a radiation devices add with the primary key could not be found
	 */
	public static RadiationDevicesAdd[] findBygetHsraById_PrevAndNext(
			long radiationDevicesAddId, long hsraApplicationId,
			OrderByComparator<RadiationDevicesAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationDevicesAddException {

		return getPersistence().findBygetHsraById_PrevAndNext(
			radiationDevicesAddId, hsraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the radiation devices adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public static void removeBygetHsraById(long hsraApplicationId) {
		getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of radiation devices adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radiation devices adds
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the radiation devices add in the entity cache if it is enabled.
	 *
	 * @param radiationDevicesAdd the radiation devices add
	 */
	public static void cacheResult(RadiationDevicesAdd radiationDevicesAdd) {
		getPersistence().cacheResult(radiationDevicesAdd);
	}

	/**
	 * Caches the radiation devices adds in the entity cache if it is enabled.
	 *
	 * @param radiationDevicesAdds the radiation devices adds
	 */
	public static void cacheResult(
		List<RadiationDevicesAdd> radiationDevicesAdds) {

		getPersistence().cacheResult(radiationDevicesAdds);
	}

	/**
	 * Creates a new radiation devices add with the primary key. Does not add the radiation devices add to the database.
	 *
	 * @param radiationDevicesAddId the primary key for the new radiation devices add
	 * @return the new radiation devices add
	 */
	public static RadiationDevicesAdd create(long radiationDevicesAddId) {
		return getPersistence().create(radiationDevicesAddId);
	}

	/**
	 * Removes the radiation devices add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radiationDevicesAddId the primary key of the radiation devices add
	 * @return the radiation devices add that was removed
	 * @throws NoSuchRadiationDevicesAddException if a radiation devices add with the primary key could not be found
	 */
	public static RadiationDevicesAdd remove(long radiationDevicesAddId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationDevicesAddException {

		return getPersistence().remove(radiationDevicesAddId);
	}

	public static RadiationDevicesAdd updateImpl(
		RadiationDevicesAdd radiationDevicesAdd) {

		return getPersistence().updateImpl(radiationDevicesAdd);
	}

	/**
	 * Returns the radiation devices add with the primary key or throws a <code>NoSuchRadiationDevicesAddException</code> if it could not be found.
	 *
	 * @param radiationDevicesAddId the primary key of the radiation devices add
	 * @return the radiation devices add
	 * @throws NoSuchRadiationDevicesAddException if a radiation devices add with the primary key could not be found
	 */
	public static RadiationDevicesAdd findByPrimaryKey(
			long radiationDevicesAddId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationDevicesAddException {

		return getPersistence().findByPrimaryKey(radiationDevicesAddId);
	}

	/**
	 * Returns the radiation devices add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radiationDevicesAddId the primary key of the radiation devices add
	 * @return the radiation devices add, or <code>null</code> if a radiation devices add with the primary key could not be found
	 */
	public static RadiationDevicesAdd fetchByPrimaryKey(
		long radiationDevicesAddId) {

		return getPersistence().fetchByPrimaryKey(radiationDevicesAddId);
	}

	/**
	 * Returns all the radiation devices adds.
	 *
	 * @return the radiation devices adds
	 */
	public static List<RadiationDevicesAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the radiation devices adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation devices adds
	 * @param end the upper bound of the range of radiation devices adds (not inclusive)
	 * @return the range of radiation devices adds
	 */
	public static List<RadiationDevicesAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the radiation devices adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation devices adds
	 * @param end the upper bound of the range of radiation devices adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radiation devices adds
	 */
	public static List<RadiationDevicesAdd> findAll(
		int start, int end,
		OrderByComparator<RadiationDevicesAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the radiation devices adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation devices adds
	 * @param end the upper bound of the range of radiation devices adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radiation devices adds
	 */
	public static List<RadiationDevicesAdd> findAll(
		int start, int end,
		OrderByComparator<RadiationDevicesAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the radiation devices adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of radiation devices adds.
	 *
	 * @return the number of radiation devices adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RadiationDevicesAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		RadiationDevicesAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile RadiationDevicesAddPersistence _persistence;

}