/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.model.AgricultureApiculture;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the agriculture apiculture service. This utility wraps <code>com.agriculture.application.form.service.service.persistence.impl.AgricultureApiculturePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApiculturePersistence
 * @generated
 */
public class AgricultureApicultureUtil {

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
	public static void clearCache(AgricultureApiculture agricultureApiculture) {
		getPersistence().clearCache(agricultureApiculture);
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
	public static Map<Serializable, AgricultureApiculture> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AgricultureApiculture> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AgricultureApiculture> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AgricultureApiculture> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AgricultureApiculture> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AgricultureApiculture update(
		AgricultureApiculture agricultureApiculture) {

		return getPersistence().update(agricultureApiculture);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AgricultureApiculture update(
		AgricultureApiculture agricultureApiculture,
		ServiceContext serviceContext) {

		return getPersistence().update(agricultureApiculture, serviceContext);
	}

	/**
	 * Returns the agriculture apiculture where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureApicultureException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture apiculture
	 * @throws NoSuchAgricultureApicultureException if a matching agriculture apiculture could not be found
	 */
	public static AgricultureApiculture findBygetAgricultureById(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApicultureException {

		return getPersistence().findBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agriculture apiculture where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture apiculture, or <code>null</code> if a matching agriculture apiculture could not be found
	 */
	public static AgricultureApiculture fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return getPersistence().fetchBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agriculture apiculture where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture apiculture, or <code>null</code> if a matching agriculture apiculture could not be found
	 */
	public static AgricultureApiculture fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetAgricultureById(
			agricultureApplicationId, useFinderCache);
	}

	/**
	 * Removes the agriculture apiculture where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture apiculture that was removed
	 */
	public static AgricultureApiculture removeBygetAgricultureById(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApicultureException {

		return getPersistence().removeBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the number of agriculture apicultures where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture apicultures
	 */
	public static int countBygetAgricultureById(long agricultureApplicationId) {
		return getPersistence().countBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns all the agriculture apicultures where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture apicultures
	 */
	public static List<AgricultureApiculture> findBygetAApi_by_AAI(
		long agricultureApplicationId) {

		return getPersistence().findBygetAApi_by_AAI(agricultureApplicationId);
	}

	/**
	 * Returns a range of all the agriculture apicultures where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApicultureModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture apicultures
	 * @param end the upper bound of the range of agriculture apicultures (not inclusive)
	 * @return the range of matching agriculture apicultures
	 */
	public static List<AgricultureApiculture> findBygetAApi_by_AAI(
		long agricultureApplicationId, int start, int end) {

		return getPersistence().findBygetAApi_by_AAI(
			agricultureApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture apicultures where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApicultureModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture apicultures
	 * @param end the upper bound of the range of agriculture apicultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture apicultures
	 */
	public static List<AgricultureApiculture> findBygetAApi_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureApiculture> orderByComparator) {

		return getPersistence().findBygetAApi_by_AAI(
			agricultureApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture apicultures where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApicultureModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture apicultures
	 * @param end the upper bound of the range of agriculture apicultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture apicultures
	 */
	public static List<AgricultureApiculture> findBygetAApi_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureApiculture> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetAApi_by_AAI(
			agricultureApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first agriculture apiculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture apiculture
	 * @throws NoSuchAgricultureApicultureException if a matching agriculture apiculture could not be found
	 */
	public static AgricultureApiculture findBygetAApi_by_AAI_First(
			long agricultureApplicationId,
			OrderByComparator<AgricultureApiculture> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApicultureException {

		return getPersistence().findBygetAApi_by_AAI_First(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the first agriculture apiculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture apiculture, or <code>null</code> if a matching agriculture apiculture could not be found
	 */
	public static AgricultureApiculture fetchBygetAApi_by_AAI_First(
		long agricultureApplicationId,
		OrderByComparator<AgricultureApiculture> orderByComparator) {

		return getPersistence().fetchBygetAApi_by_AAI_First(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agriculture apiculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture apiculture
	 * @throws NoSuchAgricultureApicultureException if a matching agriculture apiculture could not be found
	 */
	public static AgricultureApiculture findBygetAApi_by_AAI_Last(
			long agricultureApplicationId,
			OrderByComparator<AgricultureApiculture> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApicultureException {

		return getPersistence().findBygetAApi_by_AAI_Last(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agriculture apiculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture apiculture, or <code>null</code> if a matching agriculture apiculture could not be found
	 */
	public static AgricultureApiculture fetchBygetAApi_by_AAI_Last(
		long agricultureApplicationId,
		OrderByComparator<AgricultureApiculture> orderByComparator) {

		return getPersistence().fetchBygetAApi_by_AAI_Last(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the agriculture apicultures before and after the current agriculture apiculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApicultureId the primary key of the current agriculture apiculture
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture apiculture
	 * @throws NoSuchAgricultureApicultureException if a agriculture apiculture with the primary key could not be found
	 */
	public static AgricultureApiculture[] findBygetAApi_by_AAI_PrevAndNext(
			long agricultureApicultureId, long agricultureApplicationId,
			OrderByComparator<AgricultureApiculture> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApicultureException {

		return getPersistence().findBygetAApi_by_AAI_PrevAndNext(
			agricultureApicultureId, agricultureApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the agriculture apicultures where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	public static void removeBygetAApi_by_AAI(long agricultureApplicationId) {
		getPersistence().removeBygetAApi_by_AAI(agricultureApplicationId);
	}

	/**
	 * Returns the number of agriculture apicultures where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture apicultures
	 */
	public static int countBygetAApi_by_AAI(long agricultureApplicationId) {
		return getPersistence().countBygetAApi_by_AAI(agricultureApplicationId);
	}

	/**
	 * Caches the agriculture apiculture in the entity cache if it is enabled.
	 *
	 * @param agricultureApiculture the agriculture apiculture
	 */
	public static void cacheResult(
		AgricultureApiculture agricultureApiculture) {

		getPersistence().cacheResult(agricultureApiculture);
	}

	/**
	 * Caches the agriculture apicultures in the entity cache if it is enabled.
	 *
	 * @param agricultureApicultures the agriculture apicultures
	 */
	public static void cacheResult(
		List<AgricultureApiculture> agricultureApicultures) {

		getPersistence().cacheResult(agricultureApicultures);
	}

	/**
	 * Creates a new agriculture apiculture with the primary key. Does not add the agriculture apiculture to the database.
	 *
	 * @param agricultureApicultureId the primary key for the new agriculture apiculture
	 * @return the new agriculture apiculture
	 */
	public static AgricultureApiculture create(long agricultureApicultureId) {
		return getPersistence().create(agricultureApicultureId);
	}

	/**
	 * Removes the agriculture apiculture with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureApicultureId the primary key of the agriculture apiculture
	 * @return the agriculture apiculture that was removed
	 * @throws NoSuchAgricultureApicultureException if a agriculture apiculture with the primary key could not be found
	 */
	public static AgricultureApiculture remove(long agricultureApicultureId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApicultureException {

		return getPersistence().remove(agricultureApicultureId);
	}

	public static AgricultureApiculture updateImpl(
		AgricultureApiculture agricultureApiculture) {

		return getPersistence().updateImpl(agricultureApiculture);
	}

	/**
	 * Returns the agriculture apiculture with the primary key or throws a <code>NoSuchAgricultureApicultureException</code> if it could not be found.
	 *
	 * @param agricultureApicultureId the primary key of the agriculture apiculture
	 * @return the agriculture apiculture
	 * @throws NoSuchAgricultureApicultureException if a agriculture apiculture with the primary key could not be found
	 */
	public static AgricultureApiculture findByPrimaryKey(
			long agricultureApicultureId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApicultureException {

		return getPersistence().findByPrimaryKey(agricultureApicultureId);
	}

	/**
	 * Returns the agriculture apiculture with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureApicultureId the primary key of the agriculture apiculture
	 * @return the agriculture apiculture, or <code>null</code> if a agriculture apiculture with the primary key could not be found
	 */
	public static AgricultureApiculture fetchByPrimaryKey(
		long agricultureApicultureId) {

		return getPersistence().fetchByPrimaryKey(agricultureApicultureId);
	}

	/**
	 * Returns all the agriculture apicultures.
	 *
	 * @return the agriculture apicultures
	 */
	public static List<AgricultureApiculture> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the agriculture apicultures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApicultureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture apicultures
	 * @param end the upper bound of the range of agriculture apicultures (not inclusive)
	 * @return the range of agriculture apicultures
	 */
	public static List<AgricultureApiculture> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture apicultures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApicultureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture apicultures
	 * @param end the upper bound of the range of agriculture apicultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture apicultures
	 */
	public static List<AgricultureApiculture> findAll(
		int start, int end,
		OrderByComparator<AgricultureApiculture> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture apicultures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApicultureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture apicultures
	 * @param end the upper bound of the range of agriculture apicultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture apicultures
	 */
	public static List<AgricultureApiculture> findAll(
		int start, int end,
		OrderByComparator<AgricultureApiculture> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the agriculture apicultures from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of agriculture apicultures.
	 *
	 * @return the number of agriculture apicultures
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AgricultureApiculturePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AgricultureApiculturePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AgricultureApiculturePersistence _persistence;

}