/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.model.AgricultureAquaculture;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the agriculture aquaculture service. This utility wraps <code>com.agriculture.application.form.service.service.persistence.impl.AgricultureAquaculturePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureAquaculturePersistence
 * @generated
 */
public class AgricultureAquacultureUtil {

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
		AgricultureAquaculture agricultureAquaculture) {

		getPersistence().clearCache(agricultureAquaculture);
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
	public static Map<Serializable, AgricultureAquaculture> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AgricultureAquaculture> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AgricultureAquaculture> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AgricultureAquaculture> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AgricultureAquaculture> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AgricultureAquaculture update(
		AgricultureAquaculture agricultureAquaculture) {

		return getPersistence().update(agricultureAquaculture);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AgricultureAquaculture update(
		AgricultureAquaculture agricultureAquaculture,
		ServiceContext serviceContext) {

		return getPersistence().update(agricultureAquaculture, serviceContext);
	}

	/**
	 * Returns the agriculture aquaculture where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureAquacultureException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture aquaculture
	 * @throws NoSuchAgricultureAquacultureException if a matching agriculture aquaculture could not be found
	 */
	public static AgricultureAquaculture findBygetAgricultureById(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureAquacultureException {

		return getPersistence().findBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agriculture aquaculture where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture aquaculture, or <code>null</code> if a matching agriculture aquaculture could not be found
	 */
	public static AgricultureAquaculture fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return getPersistence().fetchBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agriculture aquaculture where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture aquaculture, or <code>null</code> if a matching agriculture aquaculture could not be found
	 */
	public static AgricultureAquaculture fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetAgricultureById(
			agricultureApplicationId, useFinderCache);
	}

	/**
	 * Removes the agriculture aquaculture where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture aquaculture that was removed
	 */
	public static AgricultureAquaculture removeBygetAgricultureById(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureAquacultureException {

		return getPersistence().removeBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the number of agriculture aquacultures where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture aquacultures
	 */
	public static int countBygetAgricultureById(long agricultureApplicationId) {
		return getPersistence().countBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns all the agriculture aquacultures where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture aquacultures
	 */
	public static List<AgricultureAquaculture> findBygetAAqua_by_AAI(
		long agricultureApplicationId) {

		return getPersistence().findBygetAAqua_by_AAI(agricultureApplicationId);
	}

	/**
	 * Returns a range of all the agriculture aquacultures where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureAquacultureModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture aquacultures
	 * @param end the upper bound of the range of agriculture aquacultures (not inclusive)
	 * @return the range of matching agriculture aquacultures
	 */
	public static List<AgricultureAquaculture> findBygetAAqua_by_AAI(
		long agricultureApplicationId, int start, int end) {

		return getPersistence().findBygetAAqua_by_AAI(
			agricultureApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture aquacultures where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureAquacultureModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture aquacultures
	 * @param end the upper bound of the range of agriculture aquacultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture aquacultures
	 */
	public static List<AgricultureAquaculture> findBygetAAqua_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureAquaculture> orderByComparator) {

		return getPersistence().findBygetAAqua_by_AAI(
			agricultureApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture aquacultures where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureAquacultureModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture aquacultures
	 * @param end the upper bound of the range of agriculture aquacultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture aquacultures
	 */
	public static List<AgricultureAquaculture> findBygetAAqua_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureAquaculture> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetAAqua_by_AAI(
			agricultureApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first agriculture aquaculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture aquaculture
	 * @throws NoSuchAgricultureAquacultureException if a matching agriculture aquaculture could not be found
	 */
	public static AgricultureAquaculture findBygetAAqua_by_AAI_First(
			long agricultureApplicationId,
			OrderByComparator<AgricultureAquaculture> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureAquacultureException {

		return getPersistence().findBygetAAqua_by_AAI_First(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the first agriculture aquaculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture aquaculture, or <code>null</code> if a matching agriculture aquaculture could not be found
	 */
	public static AgricultureAquaculture fetchBygetAAqua_by_AAI_First(
		long agricultureApplicationId,
		OrderByComparator<AgricultureAquaculture> orderByComparator) {

		return getPersistence().fetchBygetAAqua_by_AAI_First(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agriculture aquaculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture aquaculture
	 * @throws NoSuchAgricultureAquacultureException if a matching agriculture aquaculture could not be found
	 */
	public static AgricultureAquaculture findBygetAAqua_by_AAI_Last(
			long agricultureApplicationId,
			OrderByComparator<AgricultureAquaculture> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureAquacultureException {

		return getPersistence().findBygetAAqua_by_AAI_Last(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agriculture aquaculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture aquaculture, or <code>null</code> if a matching agriculture aquaculture could not be found
	 */
	public static AgricultureAquaculture fetchBygetAAqua_by_AAI_Last(
		long agricultureApplicationId,
		OrderByComparator<AgricultureAquaculture> orderByComparator) {

		return getPersistence().fetchBygetAAqua_by_AAI_Last(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the agriculture aquacultures before and after the current agriculture aquaculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureAquacultureId the primary key of the current agriculture aquaculture
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture aquaculture
	 * @throws NoSuchAgricultureAquacultureException if a agriculture aquaculture with the primary key could not be found
	 */
	public static AgricultureAquaculture[] findBygetAAqua_by_AAI_PrevAndNext(
			long agricultureAquacultureId, long agricultureApplicationId,
			OrderByComparator<AgricultureAquaculture> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureAquacultureException {

		return getPersistence().findBygetAAqua_by_AAI_PrevAndNext(
			agricultureAquacultureId, agricultureApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the agriculture aquacultures where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	public static void removeBygetAAqua_by_AAI(long agricultureApplicationId) {
		getPersistence().removeBygetAAqua_by_AAI(agricultureApplicationId);
	}

	/**
	 * Returns the number of agriculture aquacultures where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture aquacultures
	 */
	public static int countBygetAAqua_by_AAI(long agricultureApplicationId) {
		return getPersistence().countBygetAAqua_by_AAI(
			agricultureApplicationId);
	}

	/**
	 * Caches the agriculture aquaculture in the entity cache if it is enabled.
	 *
	 * @param agricultureAquaculture the agriculture aquaculture
	 */
	public static void cacheResult(
		AgricultureAquaculture agricultureAquaculture) {

		getPersistence().cacheResult(agricultureAquaculture);
	}

	/**
	 * Caches the agriculture aquacultures in the entity cache if it is enabled.
	 *
	 * @param agricultureAquacultures the agriculture aquacultures
	 */
	public static void cacheResult(
		List<AgricultureAquaculture> agricultureAquacultures) {

		getPersistence().cacheResult(agricultureAquacultures);
	}

	/**
	 * Creates a new agriculture aquaculture with the primary key. Does not add the agriculture aquaculture to the database.
	 *
	 * @param agricultureAquacultureId the primary key for the new agriculture aquaculture
	 * @return the new agriculture aquaculture
	 */
	public static AgricultureAquaculture create(long agricultureAquacultureId) {
		return getPersistence().create(agricultureAquacultureId);
	}

	/**
	 * Removes the agriculture aquaculture with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureAquacultureId the primary key of the agriculture aquaculture
	 * @return the agriculture aquaculture that was removed
	 * @throws NoSuchAgricultureAquacultureException if a agriculture aquaculture with the primary key could not be found
	 */
	public static AgricultureAquaculture remove(long agricultureAquacultureId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureAquacultureException {

		return getPersistence().remove(agricultureAquacultureId);
	}

	public static AgricultureAquaculture updateImpl(
		AgricultureAquaculture agricultureAquaculture) {

		return getPersistence().updateImpl(agricultureAquaculture);
	}

	/**
	 * Returns the agriculture aquaculture with the primary key or throws a <code>NoSuchAgricultureAquacultureException</code> if it could not be found.
	 *
	 * @param agricultureAquacultureId the primary key of the agriculture aquaculture
	 * @return the agriculture aquaculture
	 * @throws NoSuchAgricultureAquacultureException if a agriculture aquaculture with the primary key could not be found
	 */
	public static AgricultureAquaculture findByPrimaryKey(
			long agricultureAquacultureId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureAquacultureException {

		return getPersistence().findByPrimaryKey(agricultureAquacultureId);
	}

	/**
	 * Returns the agriculture aquaculture with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureAquacultureId the primary key of the agriculture aquaculture
	 * @return the agriculture aquaculture, or <code>null</code> if a agriculture aquaculture with the primary key could not be found
	 */
	public static AgricultureAquaculture fetchByPrimaryKey(
		long agricultureAquacultureId) {

		return getPersistence().fetchByPrimaryKey(agricultureAquacultureId);
	}

	/**
	 * Returns all the agriculture aquacultures.
	 *
	 * @return the agriculture aquacultures
	 */
	public static List<AgricultureAquaculture> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the agriculture aquacultures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureAquacultureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture aquacultures
	 * @param end the upper bound of the range of agriculture aquacultures (not inclusive)
	 * @return the range of agriculture aquacultures
	 */
	public static List<AgricultureAquaculture> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture aquacultures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureAquacultureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture aquacultures
	 * @param end the upper bound of the range of agriculture aquacultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture aquacultures
	 */
	public static List<AgricultureAquaculture> findAll(
		int start, int end,
		OrderByComparator<AgricultureAquaculture> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture aquacultures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureAquacultureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture aquacultures
	 * @param end the upper bound of the range of agriculture aquacultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture aquacultures
	 */
	public static List<AgricultureAquaculture> findAll(
		int start, int end,
		OrderByComparator<AgricultureAquaculture> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the agriculture aquacultures from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of agriculture aquacultures.
	 *
	 * @return the number of agriculture aquacultures
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AgricultureAquaculturePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AgricultureAquaculturePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AgricultureAquaculturePersistence _persistence;

}