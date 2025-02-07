/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.GenEquipmentData;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the gen equipment data service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.GenEquipmentDataPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GenEquipmentDataPersistence
 * @generated
 */
public class GenEquipmentDataUtil {

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
	public static void clearCache(GenEquipmentData genEquipmentData) {
		getPersistence().clearCache(genEquipmentData);
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
	public static Map<Serializable, GenEquipmentData> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<GenEquipmentData> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<GenEquipmentData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<GenEquipmentData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<GenEquipmentData> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static GenEquipmentData update(GenEquipmentData genEquipmentData) {
		return getPersistence().update(genEquipmentData);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static GenEquipmentData update(
		GenEquipmentData genEquipmentData, ServiceContext serviceContext) {

		return getPersistence().update(genEquipmentData, serviceContext);
	}

	/**
	 * Returns all the gen equipment datas where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching gen equipment datas
	 */
	public static List<GenEquipmentData> findBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns a range of all the gen equipment datas where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenEquipmentDataModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of gen equipment datas
	 * @param end the upper bound of the range of gen equipment datas (not inclusive)
	 * @return the range of matching gen equipment datas
	 */
	public static List<GenEquipmentData> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the gen equipment datas where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenEquipmentDataModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of gen equipment datas
	 * @param end the upper bound of the range of gen equipment datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching gen equipment datas
	 */
	public static List<GenEquipmentData> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<GenEquipmentData> orderByComparator) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the gen equipment datas where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenEquipmentDataModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of gen equipment datas
	 * @param end the upper bound of the range of gen equipment datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching gen equipment datas
	 */
	public static List<GenEquipmentData> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<GenEquipmentData> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first gen equipment data in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching gen equipment data
	 * @throws NoSuchGenEquipmentDataException if a matching gen equipment data could not be found
	 */
	public static GenEquipmentData findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<GenEquipmentData> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchGenEquipmentDataException {

		return getPersistence().findBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first gen equipment data in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching gen equipment data, or <code>null</code> if a matching gen equipment data could not be found
	 */
	public static GenEquipmentData fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<GenEquipmentData> orderByComparator) {

		return getPersistence().fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last gen equipment data in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching gen equipment data
	 * @throws NoSuchGenEquipmentDataException if a matching gen equipment data could not be found
	 */
	public static GenEquipmentData findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<GenEquipmentData> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchGenEquipmentDataException {

		return getPersistence().findBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last gen equipment data in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching gen equipment data, or <code>null</code> if a matching gen equipment data could not be found
	 */
	public static GenEquipmentData fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<GenEquipmentData> orderByComparator) {

		return getPersistence().fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the gen equipment datas before and after the current gen equipment data in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param genEquipmentDataId the primary key of the current gen equipment data
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next gen equipment data
	 * @throws NoSuchGenEquipmentDataException if a gen equipment data with the primary key could not be found
	 */
	public static GenEquipmentData[] findBygetHsraById_PrevAndNext(
			long genEquipmentDataId, long hsraApplicationId,
			OrderByComparator<GenEquipmentData> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchGenEquipmentDataException {

		return getPersistence().findBygetHsraById_PrevAndNext(
			genEquipmentDataId, hsraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the gen equipment datas where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public static void removeBygetHsraById(long hsraApplicationId) {
		getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of gen equipment datas where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching gen equipment datas
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the gen equipment data in the entity cache if it is enabled.
	 *
	 * @param genEquipmentData the gen equipment data
	 */
	public static void cacheResult(GenEquipmentData genEquipmentData) {
		getPersistence().cacheResult(genEquipmentData);
	}

	/**
	 * Caches the gen equipment datas in the entity cache if it is enabled.
	 *
	 * @param genEquipmentDatas the gen equipment datas
	 */
	public static void cacheResult(List<GenEquipmentData> genEquipmentDatas) {
		getPersistence().cacheResult(genEquipmentDatas);
	}

	/**
	 * Creates a new gen equipment data with the primary key. Does not add the gen equipment data to the database.
	 *
	 * @param genEquipmentDataId the primary key for the new gen equipment data
	 * @return the new gen equipment data
	 */
	public static GenEquipmentData create(long genEquipmentDataId) {
		return getPersistence().create(genEquipmentDataId);
	}

	/**
	 * Removes the gen equipment data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param genEquipmentDataId the primary key of the gen equipment data
	 * @return the gen equipment data that was removed
	 * @throws NoSuchGenEquipmentDataException if a gen equipment data with the primary key could not be found
	 */
	public static GenEquipmentData remove(long genEquipmentDataId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchGenEquipmentDataException {

		return getPersistence().remove(genEquipmentDataId);
	}

	public static GenEquipmentData updateImpl(
		GenEquipmentData genEquipmentData) {

		return getPersistence().updateImpl(genEquipmentData);
	}

	/**
	 * Returns the gen equipment data with the primary key or throws a <code>NoSuchGenEquipmentDataException</code> if it could not be found.
	 *
	 * @param genEquipmentDataId the primary key of the gen equipment data
	 * @return the gen equipment data
	 * @throws NoSuchGenEquipmentDataException if a gen equipment data with the primary key could not be found
	 */
	public static GenEquipmentData findByPrimaryKey(long genEquipmentDataId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchGenEquipmentDataException {

		return getPersistence().findByPrimaryKey(genEquipmentDataId);
	}

	/**
	 * Returns the gen equipment data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param genEquipmentDataId the primary key of the gen equipment data
	 * @return the gen equipment data, or <code>null</code> if a gen equipment data with the primary key could not be found
	 */
	public static GenEquipmentData fetchByPrimaryKey(long genEquipmentDataId) {
		return getPersistence().fetchByPrimaryKey(genEquipmentDataId);
	}

	/**
	 * Returns all the gen equipment datas.
	 *
	 * @return the gen equipment datas
	 */
	public static List<GenEquipmentData> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the gen equipment datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenEquipmentDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gen equipment datas
	 * @param end the upper bound of the range of gen equipment datas (not inclusive)
	 * @return the range of gen equipment datas
	 */
	public static List<GenEquipmentData> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the gen equipment datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenEquipmentDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gen equipment datas
	 * @param end the upper bound of the range of gen equipment datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of gen equipment datas
	 */
	public static List<GenEquipmentData> findAll(
		int start, int end,
		OrderByComparator<GenEquipmentData> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the gen equipment datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenEquipmentDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gen equipment datas
	 * @param end the upper bound of the range of gen equipment datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of gen equipment datas
	 */
	public static List<GenEquipmentData> findAll(
		int start, int end,
		OrderByComparator<GenEquipmentData> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the gen equipment datas from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of gen equipment datas.
	 *
	 * @return the number of gen equipment datas
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static GenEquipmentDataPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(GenEquipmentDataPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile GenEquipmentDataPersistence _persistence;

}