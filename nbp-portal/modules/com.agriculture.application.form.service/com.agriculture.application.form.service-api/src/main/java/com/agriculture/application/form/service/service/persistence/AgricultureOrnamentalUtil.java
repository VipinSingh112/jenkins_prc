/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.model.AgricultureOrnamental;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the agriculture ornamental service. This utility wraps <code>com.agriculture.application.form.service.service.persistence.impl.AgricultureOrnamentalPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureOrnamentalPersistence
 * @generated
 */
public class AgricultureOrnamentalUtil {

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
	public static void clearCache(AgricultureOrnamental agricultureOrnamental) {
		getPersistence().clearCache(agricultureOrnamental);
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
	public static Map<Serializable, AgricultureOrnamental> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AgricultureOrnamental> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AgricultureOrnamental> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AgricultureOrnamental> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AgricultureOrnamental> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AgricultureOrnamental update(
		AgricultureOrnamental agricultureOrnamental) {

		return getPersistence().update(agricultureOrnamental);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AgricultureOrnamental update(
		AgricultureOrnamental agricultureOrnamental,
		ServiceContext serviceContext) {

		return getPersistence().update(agricultureOrnamental, serviceContext);
	}

	/**
	 * Returns the agriculture ornamental where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureOrnamentalException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture ornamental
	 * @throws NoSuchAgricultureOrnamentalException if a matching agriculture ornamental could not be found
	 */
	public static AgricultureOrnamental findBygetAgricultureById(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureOrnamentalException {

		return getPersistence().findBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agriculture ornamental where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture ornamental, or <code>null</code> if a matching agriculture ornamental could not be found
	 */
	public static AgricultureOrnamental fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return getPersistence().fetchBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agriculture ornamental where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture ornamental, or <code>null</code> if a matching agriculture ornamental could not be found
	 */
	public static AgricultureOrnamental fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetAgricultureById(
			agricultureApplicationId, useFinderCache);
	}

	/**
	 * Removes the agriculture ornamental where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture ornamental that was removed
	 */
	public static AgricultureOrnamental removeBygetAgricultureById(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureOrnamentalException {

		return getPersistence().removeBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the number of agriculture ornamentals where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture ornamentals
	 */
	public static int countBygetAgricultureById(long agricultureApplicationId) {
		return getPersistence().countBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns all the agriculture ornamentals where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture ornamentals
	 */
	public static List<AgricultureOrnamental> findBygetAO_by_AAI(
		long agricultureApplicationId) {

		return getPersistence().findBygetAO_by_AAI(agricultureApplicationId);
	}

	/**
	 * Returns a range of all the agriculture ornamentals where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureOrnamentalModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture ornamentals
	 * @param end the upper bound of the range of agriculture ornamentals (not inclusive)
	 * @return the range of matching agriculture ornamentals
	 */
	public static List<AgricultureOrnamental> findBygetAO_by_AAI(
		long agricultureApplicationId, int start, int end) {

		return getPersistence().findBygetAO_by_AAI(
			agricultureApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture ornamentals where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureOrnamentalModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture ornamentals
	 * @param end the upper bound of the range of agriculture ornamentals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture ornamentals
	 */
	public static List<AgricultureOrnamental> findBygetAO_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureOrnamental> orderByComparator) {

		return getPersistence().findBygetAO_by_AAI(
			agricultureApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture ornamentals where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureOrnamentalModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture ornamentals
	 * @param end the upper bound of the range of agriculture ornamentals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture ornamentals
	 */
	public static List<AgricultureOrnamental> findBygetAO_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureOrnamental> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetAO_by_AAI(
			agricultureApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first agriculture ornamental in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture ornamental
	 * @throws NoSuchAgricultureOrnamentalException if a matching agriculture ornamental could not be found
	 */
	public static AgricultureOrnamental findBygetAO_by_AAI_First(
			long agricultureApplicationId,
			OrderByComparator<AgricultureOrnamental> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureOrnamentalException {

		return getPersistence().findBygetAO_by_AAI_First(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the first agriculture ornamental in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture ornamental, or <code>null</code> if a matching agriculture ornamental could not be found
	 */
	public static AgricultureOrnamental fetchBygetAO_by_AAI_First(
		long agricultureApplicationId,
		OrderByComparator<AgricultureOrnamental> orderByComparator) {

		return getPersistence().fetchBygetAO_by_AAI_First(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agriculture ornamental in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture ornamental
	 * @throws NoSuchAgricultureOrnamentalException if a matching agriculture ornamental could not be found
	 */
	public static AgricultureOrnamental findBygetAO_by_AAI_Last(
			long agricultureApplicationId,
			OrderByComparator<AgricultureOrnamental> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureOrnamentalException {

		return getPersistence().findBygetAO_by_AAI_Last(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agriculture ornamental in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture ornamental, or <code>null</code> if a matching agriculture ornamental could not be found
	 */
	public static AgricultureOrnamental fetchBygetAO_by_AAI_Last(
		long agricultureApplicationId,
		OrderByComparator<AgricultureOrnamental> orderByComparator) {

		return getPersistence().fetchBygetAO_by_AAI_Last(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the agriculture ornamentals before and after the current agriculture ornamental in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureOrnamentalId the primary key of the current agriculture ornamental
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture ornamental
	 * @throws NoSuchAgricultureOrnamentalException if a agriculture ornamental with the primary key could not be found
	 */
	public static AgricultureOrnamental[] findBygetAO_by_AAI_PrevAndNext(
			long agricultureOrnamentalId, long agricultureApplicationId,
			OrderByComparator<AgricultureOrnamental> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureOrnamentalException {

		return getPersistence().findBygetAO_by_AAI_PrevAndNext(
			agricultureOrnamentalId, agricultureApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the agriculture ornamentals where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	public static void removeBygetAO_by_AAI(long agricultureApplicationId) {
		getPersistence().removeBygetAO_by_AAI(agricultureApplicationId);
	}

	/**
	 * Returns the number of agriculture ornamentals where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture ornamentals
	 */
	public static int countBygetAO_by_AAI(long agricultureApplicationId) {
		return getPersistence().countBygetAO_by_AAI(agricultureApplicationId);
	}

	/**
	 * Caches the agriculture ornamental in the entity cache if it is enabled.
	 *
	 * @param agricultureOrnamental the agriculture ornamental
	 */
	public static void cacheResult(
		AgricultureOrnamental agricultureOrnamental) {

		getPersistence().cacheResult(agricultureOrnamental);
	}

	/**
	 * Caches the agriculture ornamentals in the entity cache if it is enabled.
	 *
	 * @param agricultureOrnamentals the agriculture ornamentals
	 */
	public static void cacheResult(
		List<AgricultureOrnamental> agricultureOrnamentals) {

		getPersistence().cacheResult(agricultureOrnamentals);
	}

	/**
	 * Creates a new agriculture ornamental with the primary key. Does not add the agriculture ornamental to the database.
	 *
	 * @param agricultureOrnamentalId the primary key for the new agriculture ornamental
	 * @return the new agriculture ornamental
	 */
	public static AgricultureOrnamental create(long agricultureOrnamentalId) {
		return getPersistence().create(agricultureOrnamentalId);
	}

	/**
	 * Removes the agriculture ornamental with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureOrnamentalId the primary key of the agriculture ornamental
	 * @return the agriculture ornamental that was removed
	 * @throws NoSuchAgricultureOrnamentalException if a agriculture ornamental with the primary key could not be found
	 */
	public static AgricultureOrnamental remove(long agricultureOrnamentalId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureOrnamentalException {

		return getPersistence().remove(agricultureOrnamentalId);
	}

	public static AgricultureOrnamental updateImpl(
		AgricultureOrnamental agricultureOrnamental) {

		return getPersistence().updateImpl(agricultureOrnamental);
	}

	/**
	 * Returns the agriculture ornamental with the primary key or throws a <code>NoSuchAgricultureOrnamentalException</code> if it could not be found.
	 *
	 * @param agricultureOrnamentalId the primary key of the agriculture ornamental
	 * @return the agriculture ornamental
	 * @throws NoSuchAgricultureOrnamentalException if a agriculture ornamental with the primary key could not be found
	 */
	public static AgricultureOrnamental findByPrimaryKey(
			long agricultureOrnamentalId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureOrnamentalException {

		return getPersistence().findByPrimaryKey(agricultureOrnamentalId);
	}

	/**
	 * Returns the agriculture ornamental with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureOrnamentalId the primary key of the agriculture ornamental
	 * @return the agriculture ornamental, or <code>null</code> if a agriculture ornamental with the primary key could not be found
	 */
	public static AgricultureOrnamental fetchByPrimaryKey(
		long agricultureOrnamentalId) {

		return getPersistence().fetchByPrimaryKey(agricultureOrnamentalId);
	}

	/**
	 * Returns all the agriculture ornamentals.
	 *
	 * @return the agriculture ornamentals
	 */
	public static List<AgricultureOrnamental> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the agriculture ornamentals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureOrnamentalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture ornamentals
	 * @param end the upper bound of the range of agriculture ornamentals (not inclusive)
	 * @return the range of agriculture ornamentals
	 */
	public static List<AgricultureOrnamental> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture ornamentals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureOrnamentalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture ornamentals
	 * @param end the upper bound of the range of agriculture ornamentals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture ornamentals
	 */
	public static List<AgricultureOrnamental> findAll(
		int start, int end,
		OrderByComparator<AgricultureOrnamental> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture ornamentals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureOrnamentalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture ornamentals
	 * @param end the upper bound of the range of agriculture ornamentals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture ornamentals
	 */
	public static List<AgricultureOrnamental> findAll(
		int start, int end,
		OrderByComparator<AgricultureOrnamental> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the agriculture ornamentals from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of agriculture ornamentals.
	 *
	 * @return the number of agriculture ornamentals
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AgricultureOrnamentalPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AgricultureOrnamentalPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AgricultureOrnamentalPersistence _persistence;

}