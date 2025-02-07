/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.AlternateRsoAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the alternate rso add service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.AlternateRsoAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AlternateRsoAddPersistence
 * @generated
 */
public class AlternateRsoAddUtil {

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
	public static void clearCache(AlternateRsoAdd alternateRsoAdd) {
		getPersistence().clearCache(alternateRsoAdd);
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
	public static Map<Serializable, AlternateRsoAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AlternateRsoAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AlternateRsoAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AlternateRsoAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AlternateRsoAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AlternateRsoAdd update(AlternateRsoAdd alternateRsoAdd) {
		return getPersistence().update(alternateRsoAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AlternateRsoAdd update(
		AlternateRsoAdd alternateRsoAdd, ServiceContext serviceContext) {

		return getPersistence().update(alternateRsoAdd, serviceContext);
	}

	/**
	 * Returns all the alternate rso adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching alternate rso adds
	 */
	public static List<AlternateRsoAdd> findBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns a range of all the alternate rso adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of alternate rso adds
	 * @param end the upper bound of the range of alternate rso adds (not inclusive)
	 * @return the range of matching alternate rso adds
	 */
	public static List<AlternateRsoAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the alternate rso adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of alternate rso adds
	 * @param end the upper bound of the range of alternate rso adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching alternate rso adds
	 */
	public static List<AlternateRsoAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<AlternateRsoAdd> orderByComparator) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the alternate rso adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of alternate rso adds
	 * @param end the upper bound of the range of alternate rso adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching alternate rso adds
	 */
	public static List<AlternateRsoAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<AlternateRsoAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first alternate rso add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching alternate rso add
	 * @throws NoSuchAlternateRsoAddException if a matching alternate rso add could not be found
	 */
	public static AlternateRsoAdd findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<AlternateRsoAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAlternateRsoAddException {

		return getPersistence().findBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first alternate rso add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching alternate rso add, or <code>null</code> if a matching alternate rso add could not be found
	 */
	public static AlternateRsoAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<AlternateRsoAdd> orderByComparator) {

		return getPersistence().fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last alternate rso add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching alternate rso add
	 * @throws NoSuchAlternateRsoAddException if a matching alternate rso add could not be found
	 */
	public static AlternateRsoAdd findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<AlternateRsoAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAlternateRsoAddException {

		return getPersistence().findBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last alternate rso add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching alternate rso add, or <code>null</code> if a matching alternate rso add could not be found
	 */
	public static AlternateRsoAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<AlternateRsoAdd> orderByComparator) {

		return getPersistence().fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the alternate rso adds before and after the current alternate rso add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param alternateRsoAddId the primary key of the current alternate rso add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next alternate rso add
	 * @throws NoSuchAlternateRsoAddException if a alternate rso add with the primary key could not be found
	 */
	public static AlternateRsoAdd[] findBygetHsraById_PrevAndNext(
			long alternateRsoAddId, long hsraApplicationId,
			OrderByComparator<AlternateRsoAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAlternateRsoAddException {

		return getPersistence().findBygetHsraById_PrevAndNext(
			alternateRsoAddId, hsraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the alternate rso adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public static void removeBygetHsraById(long hsraApplicationId) {
		getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of alternate rso adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching alternate rso adds
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the alternate rso add in the entity cache if it is enabled.
	 *
	 * @param alternateRsoAdd the alternate rso add
	 */
	public static void cacheResult(AlternateRsoAdd alternateRsoAdd) {
		getPersistence().cacheResult(alternateRsoAdd);
	}

	/**
	 * Caches the alternate rso adds in the entity cache if it is enabled.
	 *
	 * @param alternateRsoAdds the alternate rso adds
	 */
	public static void cacheResult(List<AlternateRsoAdd> alternateRsoAdds) {
		getPersistence().cacheResult(alternateRsoAdds);
	}

	/**
	 * Creates a new alternate rso add with the primary key. Does not add the alternate rso add to the database.
	 *
	 * @param alternateRsoAddId the primary key for the new alternate rso add
	 * @return the new alternate rso add
	 */
	public static AlternateRsoAdd create(long alternateRsoAddId) {
		return getPersistence().create(alternateRsoAddId);
	}

	/**
	 * Removes the alternate rso add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param alternateRsoAddId the primary key of the alternate rso add
	 * @return the alternate rso add that was removed
	 * @throws NoSuchAlternateRsoAddException if a alternate rso add with the primary key could not be found
	 */
	public static AlternateRsoAdd remove(long alternateRsoAddId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAlternateRsoAddException {

		return getPersistence().remove(alternateRsoAddId);
	}

	public static AlternateRsoAdd updateImpl(AlternateRsoAdd alternateRsoAdd) {
		return getPersistence().updateImpl(alternateRsoAdd);
	}

	/**
	 * Returns the alternate rso add with the primary key or throws a <code>NoSuchAlternateRsoAddException</code> if it could not be found.
	 *
	 * @param alternateRsoAddId the primary key of the alternate rso add
	 * @return the alternate rso add
	 * @throws NoSuchAlternateRsoAddException if a alternate rso add with the primary key could not be found
	 */
	public static AlternateRsoAdd findByPrimaryKey(long alternateRsoAddId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchAlternateRsoAddException {

		return getPersistence().findByPrimaryKey(alternateRsoAddId);
	}

	/**
	 * Returns the alternate rso add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param alternateRsoAddId the primary key of the alternate rso add
	 * @return the alternate rso add, or <code>null</code> if a alternate rso add with the primary key could not be found
	 */
	public static AlternateRsoAdd fetchByPrimaryKey(long alternateRsoAddId) {
		return getPersistence().fetchByPrimaryKey(alternateRsoAddId);
	}

	/**
	 * Returns all the alternate rso adds.
	 *
	 * @return the alternate rso adds
	 */
	public static List<AlternateRsoAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the alternate rso adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of alternate rso adds
	 * @param end the upper bound of the range of alternate rso adds (not inclusive)
	 * @return the range of alternate rso adds
	 */
	public static List<AlternateRsoAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the alternate rso adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of alternate rso adds
	 * @param end the upper bound of the range of alternate rso adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of alternate rso adds
	 */
	public static List<AlternateRsoAdd> findAll(
		int start, int end,
		OrderByComparator<AlternateRsoAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the alternate rso adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AlternateRsoAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of alternate rso adds
	 * @param end the upper bound of the range of alternate rso adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of alternate rso adds
	 */
	public static List<AlternateRsoAdd> findAll(
		int start, int end,
		OrderByComparator<AlternateRsoAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the alternate rso adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of alternate rso adds.
	 *
	 * @return the number of alternate rso adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AlternateRsoAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(AlternateRsoAddPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile AlternateRsoAddPersistence _persistence;

}