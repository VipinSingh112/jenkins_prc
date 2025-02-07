/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.model.AgricultureLivestock;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the agriculture livestock service. This utility wraps <code>com.agriculture.application.form.service.service.persistence.impl.AgricultureLivestockPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureLivestockPersistence
 * @generated
 */
public class AgricultureLivestockUtil {

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
	public static void clearCache(AgricultureLivestock agricultureLivestock) {
		getPersistence().clearCache(agricultureLivestock);
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
	public static Map<Serializable, AgricultureLivestock> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AgricultureLivestock> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AgricultureLivestock> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AgricultureLivestock> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AgricultureLivestock> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AgricultureLivestock update(
		AgricultureLivestock agricultureLivestock) {

		return getPersistence().update(agricultureLivestock);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AgricultureLivestock update(
		AgricultureLivestock agricultureLivestock,
		ServiceContext serviceContext) {

		return getPersistence().update(agricultureLivestock, serviceContext);
	}

	/**
	 * Returns the agriculture livestock where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureLivestockException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture livestock
	 * @throws NoSuchAgricultureLivestockException if a matching agriculture livestock could not be found
	 */
	public static AgricultureLivestock findBygetAgricultureById(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureLivestockException {

		return getPersistence().findBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agriculture livestock where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture livestock, or <code>null</code> if a matching agriculture livestock could not be found
	 */
	public static AgricultureLivestock fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return getPersistence().fetchBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agriculture livestock where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture livestock, or <code>null</code> if a matching agriculture livestock could not be found
	 */
	public static AgricultureLivestock fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetAgricultureById(
			agricultureApplicationId, useFinderCache);
	}

	/**
	 * Removes the agriculture livestock where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture livestock that was removed
	 */
	public static AgricultureLivestock removeBygetAgricultureById(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureLivestockException {

		return getPersistence().removeBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the number of agriculture livestocks where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture livestocks
	 */
	public static int countBygetAgricultureById(long agricultureApplicationId) {
		return getPersistence().countBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns all the agriculture livestocks where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture livestocks
	 */
	public static List<AgricultureLivestock> findBygetAL_by_AAI(
		long agricultureApplicationId) {

		return getPersistence().findBygetAL_by_AAI(agricultureApplicationId);
	}

	/**
	 * Returns a range of all the agriculture livestocks where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture livestocks
	 * @param end the upper bound of the range of agriculture livestocks (not inclusive)
	 * @return the range of matching agriculture livestocks
	 */
	public static List<AgricultureLivestock> findBygetAL_by_AAI(
		long agricultureApplicationId, int start, int end) {

		return getPersistence().findBygetAL_by_AAI(
			agricultureApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture livestocks where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture livestocks
	 * @param end the upper bound of the range of agriculture livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture livestocks
	 */
	public static List<AgricultureLivestock> findBygetAL_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureLivestock> orderByComparator) {

		return getPersistence().findBygetAL_by_AAI(
			agricultureApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture livestocks where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture livestocks
	 * @param end the upper bound of the range of agriculture livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture livestocks
	 */
	public static List<AgricultureLivestock> findBygetAL_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureLivestock> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetAL_by_AAI(
			agricultureApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first agriculture livestock in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture livestock
	 * @throws NoSuchAgricultureLivestockException if a matching agriculture livestock could not be found
	 */
	public static AgricultureLivestock findBygetAL_by_AAI_First(
			long agricultureApplicationId,
			OrderByComparator<AgricultureLivestock> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureLivestockException {

		return getPersistence().findBygetAL_by_AAI_First(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the first agriculture livestock in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture livestock, or <code>null</code> if a matching agriculture livestock could not be found
	 */
	public static AgricultureLivestock fetchBygetAL_by_AAI_First(
		long agricultureApplicationId,
		OrderByComparator<AgricultureLivestock> orderByComparator) {

		return getPersistence().fetchBygetAL_by_AAI_First(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agriculture livestock in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture livestock
	 * @throws NoSuchAgricultureLivestockException if a matching agriculture livestock could not be found
	 */
	public static AgricultureLivestock findBygetAL_by_AAI_Last(
			long agricultureApplicationId,
			OrderByComparator<AgricultureLivestock> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureLivestockException {

		return getPersistence().findBygetAL_by_AAI_Last(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agriculture livestock in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture livestock, or <code>null</code> if a matching agriculture livestock could not be found
	 */
	public static AgricultureLivestock fetchBygetAL_by_AAI_Last(
		long agricultureApplicationId,
		OrderByComparator<AgricultureLivestock> orderByComparator) {

		return getPersistence().fetchBygetAL_by_AAI_Last(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the agriculture livestocks before and after the current agriculture livestock in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureLivestockId the primary key of the current agriculture livestock
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture livestock
	 * @throws NoSuchAgricultureLivestockException if a agriculture livestock with the primary key could not be found
	 */
	public static AgricultureLivestock[] findBygetAL_by_AAI_PrevAndNext(
			long agricultureLivestockId, long agricultureApplicationId,
			OrderByComparator<AgricultureLivestock> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureLivestockException {

		return getPersistence().findBygetAL_by_AAI_PrevAndNext(
			agricultureLivestockId, agricultureApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the agriculture livestocks where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	public static void removeBygetAL_by_AAI(long agricultureApplicationId) {
		getPersistence().removeBygetAL_by_AAI(agricultureApplicationId);
	}

	/**
	 * Returns the number of agriculture livestocks where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture livestocks
	 */
	public static int countBygetAL_by_AAI(long agricultureApplicationId) {
		return getPersistence().countBygetAL_by_AAI(agricultureApplicationId);
	}

	/**
	 * Caches the agriculture livestock in the entity cache if it is enabled.
	 *
	 * @param agricultureLivestock the agriculture livestock
	 */
	public static void cacheResult(AgricultureLivestock agricultureLivestock) {
		getPersistence().cacheResult(agricultureLivestock);
	}

	/**
	 * Caches the agriculture livestocks in the entity cache if it is enabled.
	 *
	 * @param agricultureLivestocks the agriculture livestocks
	 */
	public static void cacheResult(
		List<AgricultureLivestock> agricultureLivestocks) {

		getPersistence().cacheResult(agricultureLivestocks);
	}

	/**
	 * Creates a new agriculture livestock with the primary key. Does not add the agriculture livestock to the database.
	 *
	 * @param agricultureLivestockId the primary key for the new agriculture livestock
	 * @return the new agriculture livestock
	 */
	public static AgricultureLivestock create(long agricultureLivestockId) {
		return getPersistence().create(agricultureLivestockId);
	}

	/**
	 * Removes the agriculture livestock with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureLivestockId the primary key of the agriculture livestock
	 * @return the agriculture livestock that was removed
	 * @throws NoSuchAgricultureLivestockException if a agriculture livestock with the primary key could not be found
	 */
	public static AgricultureLivestock remove(long agricultureLivestockId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureLivestockException {

		return getPersistence().remove(agricultureLivestockId);
	}

	public static AgricultureLivestock updateImpl(
		AgricultureLivestock agricultureLivestock) {

		return getPersistence().updateImpl(agricultureLivestock);
	}

	/**
	 * Returns the agriculture livestock with the primary key or throws a <code>NoSuchAgricultureLivestockException</code> if it could not be found.
	 *
	 * @param agricultureLivestockId the primary key of the agriculture livestock
	 * @return the agriculture livestock
	 * @throws NoSuchAgricultureLivestockException if a agriculture livestock with the primary key could not be found
	 */
	public static AgricultureLivestock findByPrimaryKey(
			long agricultureLivestockId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureLivestockException {

		return getPersistence().findByPrimaryKey(agricultureLivestockId);
	}

	/**
	 * Returns the agriculture livestock with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureLivestockId the primary key of the agriculture livestock
	 * @return the agriculture livestock, or <code>null</code> if a agriculture livestock with the primary key could not be found
	 */
	public static AgricultureLivestock fetchByPrimaryKey(
		long agricultureLivestockId) {

		return getPersistence().fetchByPrimaryKey(agricultureLivestockId);
	}

	/**
	 * Returns all the agriculture livestocks.
	 *
	 * @return the agriculture livestocks
	 */
	public static List<AgricultureLivestock> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the agriculture livestocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture livestocks
	 * @param end the upper bound of the range of agriculture livestocks (not inclusive)
	 * @return the range of agriculture livestocks
	 */
	public static List<AgricultureLivestock> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture livestocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture livestocks
	 * @param end the upper bound of the range of agriculture livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture livestocks
	 */
	public static List<AgricultureLivestock> findAll(
		int start, int end,
		OrderByComparator<AgricultureLivestock> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture livestocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture livestocks
	 * @param end the upper bound of the range of agriculture livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture livestocks
	 */
	public static List<AgricultureLivestock> findAll(
		int start, int end,
		OrderByComparator<AgricultureLivestock> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the agriculture livestocks from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of agriculture livestocks.
	 *
	 * @return the number of agriculture livestocks
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AgricultureLivestockPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AgricultureLivestockPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AgricultureLivestockPersistence _persistence;

}