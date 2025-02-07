/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.model.AgricultureCrop;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the agriculture crop service. This utility wraps <code>com.agriculture.application.form.service.service.persistence.impl.AgricultureCropPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureCropPersistence
 * @generated
 */
public class AgricultureCropUtil {

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
	public static void clearCache(AgricultureCrop agricultureCrop) {
		getPersistence().clearCache(agricultureCrop);
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
	public static Map<Serializable, AgricultureCrop> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AgricultureCrop> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AgricultureCrop> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AgricultureCrop> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AgricultureCrop> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AgricultureCrop update(AgricultureCrop agricultureCrop) {
		return getPersistence().update(agricultureCrop);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AgricultureCrop update(
		AgricultureCrop agricultureCrop, ServiceContext serviceContext) {

		return getPersistence().update(agricultureCrop, serviceContext);
	}

	/**
	 * Returns the agriculture crop where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureCropException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture crop
	 * @throws NoSuchAgricultureCropException if a matching agriculture crop could not be found
	 */
	public static AgricultureCrop findBygetAgricultureById(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureCropException {

		return getPersistence().findBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agriculture crop where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture crop, or <code>null</code> if a matching agriculture crop could not be found
	 */
	public static AgricultureCrop fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return getPersistence().fetchBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agriculture crop where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture crop, or <code>null</code> if a matching agriculture crop could not be found
	 */
	public static AgricultureCrop fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetAgricultureById(
			agricultureApplicationId, useFinderCache);
	}

	/**
	 * Removes the agriculture crop where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture crop that was removed
	 */
	public static AgricultureCrop removeBygetAgricultureById(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureCropException {

		return getPersistence().removeBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the number of agriculture crops where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture crops
	 */
	public static int countBygetAgricultureById(long agricultureApplicationId) {
		return getPersistence().countBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns all the agriculture crops where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture crops
	 */
	public static List<AgricultureCrop> findBygetAC_by_AAI(
		long agricultureApplicationId) {

		return getPersistence().findBygetAC_by_AAI(agricultureApplicationId);
	}

	/**
	 * Returns a range of all the agriculture crops where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureCropModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture crops
	 * @param end the upper bound of the range of agriculture crops (not inclusive)
	 * @return the range of matching agriculture crops
	 */
	public static List<AgricultureCrop> findBygetAC_by_AAI(
		long agricultureApplicationId, int start, int end) {

		return getPersistence().findBygetAC_by_AAI(
			agricultureApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture crops where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureCropModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture crops
	 * @param end the upper bound of the range of agriculture crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture crops
	 */
	public static List<AgricultureCrop> findBygetAC_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureCrop> orderByComparator) {

		return getPersistence().findBygetAC_by_AAI(
			agricultureApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture crops where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureCropModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture crops
	 * @param end the upper bound of the range of agriculture crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture crops
	 */
	public static List<AgricultureCrop> findBygetAC_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureCrop> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetAC_by_AAI(
			agricultureApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first agriculture crop in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture crop
	 * @throws NoSuchAgricultureCropException if a matching agriculture crop could not be found
	 */
	public static AgricultureCrop findBygetAC_by_AAI_First(
			long agricultureApplicationId,
			OrderByComparator<AgricultureCrop> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureCropException {

		return getPersistence().findBygetAC_by_AAI_First(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the first agriculture crop in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture crop, or <code>null</code> if a matching agriculture crop could not be found
	 */
	public static AgricultureCrop fetchBygetAC_by_AAI_First(
		long agricultureApplicationId,
		OrderByComparator<AgricultureCrop> orderByComparator) {

		return getPersistence().fetchBygetAC_by_AAI_First(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agriculture crop in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture crop
	 * @throws NoSuchAgricultureCropException if a matching agriculture crop could not be found
	 */
	public static AgricultureCrop findBygetAC_by_AAI_Last(
			long agricultureApplicationId,
			OrderByComparator<AgricultureCrop> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureCropException {

		return getPersistence().findBygetAC_by_AAI_Last(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agriculture crop in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture crop, or <code>null</code> if a matching agriculture crop could not be found
	 */
	public static AgricultureCrop fetchBygetAC_by_AAI_Last(
		long agricultureApplicationId,
		OrderByComparator<AgricultureCrop> orderByComparator) {

		return getPersistence().fetchBygetAC_by_AAI_Last(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the agriculture crops before and after the current agriculture crop in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureCropId the primary key of the current agriculture crop
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture crop
	 * @throws NoSuchAgricultureCropException if a agriculture crop with the primary key could not be found
	 */
	public static AgricultureCrop[] findBygetAC_by_AAI_PrevAndNext(
			long agricultureCropId, long agricultureApplicationId,
			OrderByComparator<AgricultureCrop> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureCropException {

		return getPersistence().findBygetAC_by_AAI_PrevAndNext(
			agricultureCropId, agricultureApplicationId, orderByComparator);
	}

	/**
	 * Removes all the agriculture crops where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	public static void removeBygetAC_by_AAI(long agricultureApplicationId) {
		getPersistence().removeBygetAC_by_AAI(agricultureApplicationId);
	}

	/**
	 * Returns the number of agriculture crops where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture crops
	 */
	public static int countBygetAC_by_AAI(long agricultureApplicationId) {
		return getPersistence().countBygetAC_by_AAI(agricultureApplicationId);
	}

	/**
	 * Caches the agriculture crop in the entity cache if it is enabled.
	 *
	 * @param agricultureCrop the agriculture crop
	 */
	public static void cacheResult(AgricultureCrop agricultureCrop) {
		getPersistence().cacheResult(agricultureCrop);
	}

	/**
	 * Caches the agriculture crops in the entity cache if it is enabled.
	 *
	 * @param agricultureCrops the agriculture crops
	 */
	public static void cacheResult(List<AgricultureCrop> agricultureCrops) {
		getPersistence().cacheResult(agricultureCrops);
	}

	/**
	 * Creates a new agriculture crop with the primary key. Does not add the agriculture crop to the database.
	 *
	 * @param agricultureCropId the primary key for the new agriculture crop
	 * @return the new agriculture crop
	 */
	public static AgricultureCrop create(long agricultureCropId) {
		return getPersistence().create(agricultureCropId);
	}

	/**
	 * Removes the agriculture crop with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureCropId the primary key of the agriculture crop
	 * @return the agriculture crop that was removed
	 * @throws NoSuchAgricultureCropException if a agriculture crop with the primary key could not be found
	 */
	public static AgricultureCrop remove(long agricultureCropId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureCropException {

		return getPersistence().remove(agricultureCropId);
	}

	public static AgricultureCrop updateImpl(AgricultureCrop agricultureCrop) {
		return getPersistence().updateImpl(agricultureCrop);
	}

	/**
	 * Returns the agriculture crop with the primary key or throws a <code>NoSuchAgricultureCropException</code> if it could not be found.
	 *
	 * @param agricultureCropId the primary key of the agriculture crop
	 * @return the agriculture crop
	 * @throws NoSuchAgricultureCropException if a agriculture crop with the primary key could not be found
	 */
	public static AgricultureCrop findByPrimaryKey(long agricultureCropId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureCropException {

		return getPersistence().findByPrimaryKey(agricultureCropId);
	}

	/**
	 * Returns the agriculture crop with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureCropId the primary key of the agriculture crop
	 * @return the agriculture crop, or <code>null</code> if a agriculture crop with the primary key could not be found
	 */
	public static AgricultureCrop fetchByPrimaryKey(long agricultureCropId) {
		return getPersistence().fetchByPrimaryKey(agricultureCropId);
	}

	/**
	 * Returns all the agriculture crops.
	 *
	 * @return the agriculture crops
	 */
	public static List<AgricultureCrop> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the agriculture crops.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureCropModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture crops
	 * @param end the upper bound of the range of agriculture crops (not inclusive)
	 * @return the range of agriculture crops
	 */
	public static List<AgricultureCrop> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture crops.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureCropModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture crops
	 * @param end the upper bound of the range of agriculture crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture crops
	 */
	public static List<AgricultureCrop> findAll(
		int start, int end,
		OrderByComparator<AgricultureCrop> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture crops.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureCropModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture crops
	 * @param end the upper bound of the range of agriculture crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture crops
	 */
	public static List<AgricultureCrop> findAll(
		int start, int end,
		OrderByComparator<AgricultureCrop> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the agriculture crops from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of agriculture crops.
	 *
	 * @return the number of agriculture crops
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AgricultureCropPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(AgricultureCropPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile AgricultureCropPersistence _persistence;

}