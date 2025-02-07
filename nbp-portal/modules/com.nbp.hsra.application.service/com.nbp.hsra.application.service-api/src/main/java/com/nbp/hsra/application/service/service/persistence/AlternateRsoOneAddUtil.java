/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.AlternateRsoOneAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the alternate rso one add service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.AlternateRsoOneAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AlternateRsoOneAddPersistence
 * @generated
 */
public class AlternateRsoOneAddUtil {

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
	public static void clearCache(AlternateRsoOneAdd alternateRsoOneAdd) {
		getPersistence().clearCache(alternateRsoOneAdd);
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
	public static Map<Serializable, AlternateRsoOneAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AlternateRsoOneAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AlternateRsoOneAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AlternateRsoOneAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AlternateRsoOneAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AlternateRsoOneAdd update(
		AlternateRsoOneAdd alternateRsoOneAdd) {

		return getPersistence().update(alternateRsoOneAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AlternateRsoOneAdd update(
		AlternateRsoOneAdd alternateRsoOneAdd, ServiceContext serviceContext) {

		return getPersistence().update(alternateRsoOneAdd, serviceContext);
	}

	/**
	 * Returns all the alternate rso one adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching alternate rso one adds
	 */
	public static List<AlternateRsoOneAdd> findBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns a range of all the alternate rso one adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of alternate rso one adds
	 * @param end the upper bound of the range of alternate rso one adds (not inclusive)
	 * @return the range of matching alternate rso one adds
	 */
	public static List<AlternateRsoOneAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the alternate rso one adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of alternate rso one adds
	 * @param end the upper bound of the range of alternate rso one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching alternate rso one adds
	 */
	public static List<AlternateRsoOneAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<AlternateRsoOneAdd> orderByComparator) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the alternate rso one adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of alternate rso one adds
	 * @param end the upper bound of the range of alternate rso one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching alternate rso one adds
	 */
	public static List<AlternateRsoOneAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<AlternateRsoOneAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first alternate rso one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching alternate rso one add
	 * @throws NoSuchAlternateRsoOneAddException if a matching alternate rso one add could not be found
	 */
	public static AlternateRsoOneAdd findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<AlternateRsoOneAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAlternateRsoOneAddException {

		return getPersistence().findBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first alternate rso one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching alternate rso one add, or <code>null</code> if a matching alternate rso one add could not be found
	 */
	public static AlternateRsoOneAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<AlternateRsoOneAdd> orderByComparator) {

		return getPersistence().fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last alternate rso one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching alternate rso one add
	 * @throws NoSuchAlternateRsoOneAddException if a matching alternate rso one add could not be found
	 */
	public static AlternateRsoOneAdd findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<AlternateRsoOneAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAlternateRsoOneAddException {

		return getPersistence().findBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last alternate rso one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching alternate rso one add, or <code>null</code> if a matching alternate rso one add could not be found
	 */
	public static AlternateRsoOneAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<AlternateRsoOneAdd> orderByComparator) {

		return getPersistence().fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the alternate rso one adds before and after the current alternate rso one add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param alternateRsoOneAddId the primary key of the current alternate rso one add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next alternate rso one add
	 * @throws NoSuchAlternateRsoOneAddException if a alternate rso one add with the primary key could not be found
	 */
	public static AlternateRsoOneAdd[] findBygetHsraById_PrevAndNext(
			long alternateRsoOneAddId, long hsraApplicationId,
			OrderByComparator<AlternateRsoOneAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAlternateRsoOneAddException {

		return getPersistence().findBygetHsraById_PrevAndNext(
			alternateRsoOneAddId, hsraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the alternate rso one adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public static void removeBygetHsraById(long hsraApplicationId) {
		getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of alternate rso one adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching alternate rso one adds
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the alternate rso one add in the entity cache if it is enabled.
	 *
	 * @param alternateRsoOneAdd the alternate rso one add
	 */
	public static void cacheResult(AlternateRsoOneAdd alternateRsoOneAdd) {
		getPersistence().cacheResult(alternateRsoOneAdd);
	}

	/**
	 * Caches the alternate rso one adds in the entity cache if it is enabled.
	 *
	 * @param alternateRsoOneAdds the alternate rso one adds
	 */
	public static void cacheResult(
		List<AlternateRsoOneAdd> alternateRsoOneAdds) {

		getPersistence().cacheResult(alternateRsoOneAdds);
	}

	/**
	 * Creates a new alternate rso one add with the primary key. Does not add the alternate rso one add to the database.
	 *
	 * @param alternateRsoOneAddId the primary key for the new alternate rso one add
	 * @return the new alternate rso one add
	 */
	public static AlternateRsoOneAdd create(long alternateRsoOneAddId) {
		return getPersistence().create(alternateRsoOneAddId);
	}

	/**
	 * Removes the alternate rso one add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param alternateRsoOneAddId the primary key of the alternate rso one add
	 * @return the alternate rso one add that was removed
	 * @throws NoSuchAlternateRsoOneAddException if a alternate rso one add with the primary key could not be found
	 */
	public static AlternateRsoOneAdd remove(long alternateRsoOneAddId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAlternateRsoOneAddException {

		return getPersistence().remove(alternateRsoOneAddId);
	}

	public static AlternateRsoOneAdd updateImpl(
		AlternateRsoOneAdd alternateRsoOneAdd) {

		return getPersistence().updateImpl(alternateRsoOneAdd);
	}

	/**
	 * Returns the alternate rso one add with the primary key or throws a <code>NoSuchAlternateRsoOneAddException</code> if it could not be found.
	 *
	 * @param alternateRsoOneAddId the primary key of the alternate rso one add
	 * @return the alternate rso one add
	 * @throws NoSuchAlternateRsoOneAddException if a alternate rso one add with the primary key could not be found
	 */
	public static AlternateRsoOneAdd findByPrimaryKey(long alternateRsoOneAddId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAlternateRsoOneAddException {

		return getPersistence().findByPrimaryKey(alternateRsoOneAddId);
	}

	/**
	 * Returns the alternate rso one add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param alternateRsoOneAddId the primary key of the alternate rso one add
	 * @return the alternate rso one add, or <code>null</code> if a alternate rso one add with the primary key could not be found
	 */
	public static AlternateRsoOneAdd fetchByPrimaryKey(
		long alternateRsoOneAddId) {

		return getPersistence().fetchByPrimaryKey(alternateRsoOneAddId);
	}

	/**
	 * Returns all the alternate rso one adds.
	 *
	 * @return the alternate rso one adds
	 */
	public static List<AlternateRsoOneAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the alternate rso one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of alternate rso one adds
	 * @param end the upper bound of the range of alternate rso one adds (not inclusive)
	 * @return the range of alternate rso one adds
	 */
	public static List<AlternateRsoOneAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the alternate rso one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of alternate rso one adds
	 * @param end the upper bound of the range of alternate rso one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of alternate rso one adds
	 */
	public static List<AlternateRsoOneAdd> findAll(
		int start, int end,
		OrderByComparator<AlternateRsoOneAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the alternate rso one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of alternate rso one adds
	 * @param end the upper bound of the range of alternate rso one adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of alternate rso one adds
	 */
	public static List<AlternateRsoOneAdd> findAll(
		int start, int end,
		OrderByComparator<AlternateRsoOneAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the alternate rso one adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of alternate rso one adds.
	 *
	 * @return the number of alternate rso one adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AlternateRsoOneAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AlternateRsoOneAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AlternateRsoOneAddPersistence _persistence;

}