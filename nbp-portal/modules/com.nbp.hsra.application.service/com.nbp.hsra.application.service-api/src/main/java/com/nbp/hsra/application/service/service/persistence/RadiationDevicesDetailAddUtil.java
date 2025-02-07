/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.RadiationDevicesDetailAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the radiation devices detail add service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.RadiationDevicesDetailAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadiationDevicesDetailAddPersistence
 * @generated
 */
public class RadiationDevicesDetailAddUtil {

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
		RadiationDevicesDetailAdd radiationDevicesDetailAdd) {

		getPersistence().clearCache(radiationDevicesDetailAdd);
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
	public static Map<Serializable, RadiationDevicesDetailAdd>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<RadiationDevicesDetailAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RadiationDevicesDetailAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RadiationDevicesDetailAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RadiationDevicesDetailAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RadiationDevicesDetailAdd update(
		RadiationDevicesDetailAdd radiationDevicesDetailAdd) {

		return getPersistence().update(radiationDevicesDetailAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RadiationDevicesDetailAdd update(
		RadiationDevicesDetailAdd radiationDevicesDetailAdd,
		ServiceContext serviceContext) {

		return getPersistence().update(
			radiationDevicesDetailAdd, serviceContext);
	}

	/**
	 * Returns all the radiation devices detail adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation devices detail adds
	 */
	public static List<RadiationDevicesDetailAdd> findBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns a range of all the radiation devices detail adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radiation devices detail adds
	 * @param end the upper bound of the range of radiation devices detail adds (not inclusive)
	 * @return the range of matching radiation devices detail adds
	 */
	public static List<RadiationDevicesDetailAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the radiation devices detail adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radiation devices detail adds
	 * @param end the upper bound of the range of radiation devices detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching radiation devices detail adds
	 */
	public static List<RadiationDevicesDetailAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<RadiationDevicesDetailAdd> orderByComparator) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the radiation devices detail adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radiation devices detail adds
	 * @param end the upper bound of the range of radiation devices detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching radiation devices detail adds
	 */
	public static List<RadiationDevicesDetailAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<RadiationDevicesDetailAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first radiation devices detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching radiation devices detail add
	 * @throws NoSuchRadiationDevicesDetailAddException if a matching radiation devices detail add could not be found
	 */
	public static RadiationDevicesDetailAdd findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<RadiationDevicesDetailAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationDevicesDetailAddException {

		return getPersistence().findBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first radiation devices detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching radiation devices detail add, or <code>null</code> if a matching radiation devices detail add could not be found
	 */
	public static RadiationDevicesDetailAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<RadiationDevicesDetailAdd> orderByComparator) {

		return getPersistence().fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last radiation devices detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching radiation devices detail add
	 * @throws NoSuchRadiationDevicesDetailAddException if a matching radiation devices detail add could not be found
	 */
	public static RadiationDevicesDetailAdd findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<RadiationDevicesDetailAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationDevicesDetailAddException {

		return getPersistence().findBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last radiation devices detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching radiation devices detail add, or <code>null</code> if a matching radiation devices detail add could not be found
	 */
	public static RadiationDevicesDetailAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<RadiationDevicesDetailAdd> orderByComparator) {

		return getPersistence().fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the radiation devices detail adds before and after the current radiation devices detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param radiationDevicesDetailAddId the primary key of the current radiation devices detail add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next radiation devices detail add
	 * @throws NoSuchRadiationDevicesDetailAddException if a radiation devices detail add with the primary key could not be found
	 */
	public static RadiationDevicesDetailAdd[] findBygetHsraById_PrevAndNext(
			long radiationDevicesDetailAddId, long hsraApplicationId,
			OrderByComparator<RadiationDevicesDetailAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationDevicesDetailAddException {

		return getPersistence().findBygetHsraById_PrevAndNext(
			radiationDevicesDetailAddId, hsraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the radiation devices detail adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public static void removeBygetHsraById(long hsraApplicationId) {
		getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of radiation devices detail adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radiation devices detail adds
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the radiation devices detail add in the entity cache if it is enabled.
	 *
	 * @param radiationDevicesDetailAdd the radiation devices detail add
	 */
	public static void cacheResult(
		RadiationDevicesDetailAdd radiationDevicesDetailAdd) {

		getPersistence().cacheResult(radiationDevicesDetailAdd);
	}

	/**
	 * Caches the radiation devices detail adds in the entity cache if it is enabled.
	 *
	 * @param radiationDevicesDetailAdds the radiation devices detail adds
	 */
	public static void cacheResult(
		List<RadiationDevicesDetailAdd> radiationDevicesDetailAdds) {

		getPersistence().cacheResult(radiationDevicesDetailAdds);
	}

	/**
	 * Creates a new radiation devices detail add with the primary key. Does not add the radiation devices detail add to the database.
	 *
	 * @param radiationDevicesDetailAddId the primary key for the new radiation devices detail add
	 * @return the new radiation devices detail add
	 */
	public static RadiationDevicesDetailAdd create(
		long radiationDevicesDetailAddId) {

		return getPersistence().create(radiationDevicesDetailAddId);
	}

	/**
	 * Removes the radiation devices detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radiationDevicesDetailAddId the primary key of the radiation devices detail add
	 * @return the radiation devices detail add that was removed
	 * @throws NoSuchRadiationDevicesDetailAddException if a radiation devices detail add with the primary key could not be found
	 */
	public static RadiationDevicesDetailAdd remove(
			long radiationDevicesDetailAddId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationDevicesDetailAddException {

		return getPersistence().remove(radiationDevicesDetailAddId);
	}

	public static RadiationDevicesDetailAdd updateImpl(
		RadiationDevicesDetailAdd radiationDevicesDetailAdd) {

		return getPersistence().updateImpl(radiationDevicesDetailAdd);
	}

	/**
	 * Returns the radiation devices detail add with the primary key or throws a <code>NoSuchRadiationDevicesDetailAddException</code> if it could not be found.
	 *
	 * @param radiationDevicesDetailAddId the primary key of the radiation devices detail add
	 * @return the radiation devices detail add
	 * @throws NoSuchRadiationDevicesDetailAddException if a radiation devices detail add with the primary key could not be found
	 */
	public static RadiationDevicesDetailAdd findByPrimaryKey(
			long radiationDevicesDetailAddId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationDevicesDetailAddException {

		return getPersistence().findByPrimaryKey(radiationDevicesDetailAddId);
	}

	/**
	 * Returns the radiation devices detail add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radiationDevicesDetailAddId the primary key of the radiation devices detail add
	 * @return the radiation devices detail add, or <code>null</code> if a radiation devices detail add with the primary key could not be found
	 */
	public static RadiationDevicesDetailAdd fetchByPrimaryKey(
		long radiationDevicesDetailAddId) {

		return getPersistence().fetchByPrimaryKey(radiationDevicesDetailAddId);
	}

	/**
	 * Returns all the radiation devices detail adds.
	 *
	 * @return the radiation devices detail adds
	 */
	public static List<RadiationDevicesDetailAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the radiation devices detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation devices detail adds
	 * @param end the upper bound of the range of radiation devices detail adds (not inclusive)
	 * @return the range of radiation devices detail adds
	 */
	public static List<RadiationDevicesDetailAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the radiation devices detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation devices detail adds
	 * @param end the upper bound of the range of radiation devices detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radiation devices detail adds
	 */
	public static List<RadiationDevicesDetailAdd> findAll(
		int start, int end,
		OrderByComparator<RadiationDevicesDetailAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the radiation devices detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation devices detail adds
	 * @param end the upper bound of the range of radiation devices detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radiation devices detail adds
	 */
	public static List<RadiationDevicesDetailAdd> findAll(
		int start, int end,
		OrderByComparator<RadiationDevicesDetailAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the radiation devices detail adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of radiation devices detail adds.
	 *
	 * @return the number of radiation devices detail adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RadiationDevicesDetailAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		RadiationDevicesDetailAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile RadiationDevicesDetailAddPersistence _persistence;

}