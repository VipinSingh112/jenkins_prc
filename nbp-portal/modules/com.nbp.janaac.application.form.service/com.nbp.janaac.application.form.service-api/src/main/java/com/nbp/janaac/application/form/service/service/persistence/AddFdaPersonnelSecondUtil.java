/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddFdaPersonnelSecond;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add fda personnel second service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddFdaPersonnelSecondPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaPersonnelSecondPersistence
 * @generated
 */
public class AddFdaPersonnelSecondUtil {

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
	public static void clearCache(AddFdaPersonnelSecond addFdaPersonnelSecond) {
		getPersistence().clearCache(addFdaPersonnelSecond);
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
	public static Map<Serializable, AddFdaPersonnelSecond> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddFdaPersonnelSecond> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddFdaPersonnelSecond> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddFdaPersonnelSecond> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddFdaPersonnelSecond> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddFdaPersonnelSecond update(
		AddFdaPersonnelSecond addFdaPersonnelSecond) {

		return getPersistence().update(addFdaPersonnelSecond);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddFdaPersonnelSecond update(
		AddFdaPersonnelSecond addFdaPersonnelSecond,
		ServiceContext serviceContext) {

		return getPersistence().update(addFdaPersonnelSecond, serviceContext);
	}

	/**
	 * Returns all the add fda personnel seconds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add fda personnel seconds
	 */
	public static List<AddFdaPersonnelSecond> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add fda personnel seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel seconds
	 * @param end the upper bound of the range of add fda personnel seconds (not inclusive)
	 * @return the range of matching add fda personnel seconds
	 */
	public static List<AddFdaPersonnelSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add fda personnel seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel seconds
	 * @param end the upper bound of the range of add fda personnel seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add fda personnel seconds
	 */
	public static List<AddFdaPersonnelSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddFdaPersonnelSecond> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add fda personnel seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda personnel seconds
	 * @param end the upper bound of the range of add fda personnel seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add fda personnel seconds
	 */
	public static List<AddFdaPersonnelSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddFdaPersonnelSecond> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add fda personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda personnel second
	 * @throws NoSuchAddFdaPersonnelSecondException if a matching add fda personnel second could not be found
	 */
	public static AddFdaPersonnelSecond findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddFdaPersonnelSecond> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddFdaPersonnelSecondException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add fda personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda personnel second, or <code>null</code> if a matching add fda personnel second could not be found
	 */
	public static AddFdaPersonnelSecond fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddFdaPersonnelSecond> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add fda personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda personnel second
	 * @throws NoSuchAddFdaPersonnelSecondException if a matching add fda personnel second could not be found
	 */
	public static AddFdaPersonnelSecond findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddFdaPersonnelSecond> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddFdaPersonnelSecondException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add fda personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda personnel second, or <code>null</code> if a matching add fda personnel second could not be found
	 */
	public static AddFdaPersonnelSecond fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddFdaPersonnelSecond> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add fda personnel seconds before and after the current add fda personnel second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addFdaPersonnelSecondId the primary key of the current add fda personnel second
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add fda personnel second
	 * @throws NoSuchAddFdaPersonnelSecondException if a add fda personnel second with the primary key could not be found
	 */
	public static AddFdaPersonnelSecond[] findBygetJanaacById_PrevAndNext(
			long addFdaPersonnelSecondId, long janaacApplicationId,
			OrderByComparator<AddFdaPersonnelSecond> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddFdaPersonnelSecondException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addFdaPersonnelSecondId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add fda personnel seconds where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add fda personnel seconds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add fda personnel seconds
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add fda personnel second in the entity cache if it is enabled.
	 *
	 * @param addFdaPersonnelSecond the add fda personnel second
	 */
	public static void cacheResult(
		AddFdaPersonnelSecond addFdaPersonnelSecond) {

		getPersistence().cacheResult(addFdaPersonnelSecond);
	}

	/**
	 * Caches the add fda personnel seconds in the entity cache if it is enabled.
	 *
	 * @param addFdaPersonnelSeconds the add fda personnel seconds
	 */
	public static void cacheResult(
		List<AddFdaPersonnelSecond> addFdaPersonnelSeconds) {

		getPersistence().cacheResult(addFdaPersonnelSeconds);
	}

	/**
	 * Creates a new add fda personnel second with the primary key. Does not add the add fda personnel second to the database.
	 *
	 * @param addFdaPersonnelSecondId the primary key for the new add fda personnel second
	 * @return the new add fda personnel second
	 */
	public static AddFdaPersonnelSecond create(long addFdaPersonnelSecondId) {
		return getPersistence().create(addFdaPersonnelSecondId);
	}

	/**
	 * Removes the add fda personnel second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addFdaPersonnelSecondId the primary key of the add fda personnel second
	 * @return the add fda personnel second that was removed
	 * @throws NoSuchAddFdaPersonnelSecondException if a add fda personnel second with the primary key could not be found
	 */
	public static AddFdaPersonnelSecond remove(long addFdaPersonnelSecondId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddFdaPersonnelSecondException {

		return getPersistence().remove(addFdaPersonnelSecondId);
	}

	public static AddFdaPersonnelSecond updateImpl(
		AddFdaPersonnelSecond addFdaPersonnelSecond) {

		return getPersistence().updateImpl(addFdaPersonnelSecond);
	}

	/**
	 * Returns the add fda personnel second with the primary key or throws a <code>NoSuchAddFdaPersonnelSecondException</code> if it could not be found.
	 *
	 * @param addFdaPersonnelSecondId the primary key of the add fda personnel second
	 * @return the add fda personnel second
	 * @throws NoSuchAddFdaPersonnelSecondException if a add fda personnel second with the primary key could not be found
	 */
	public static AddFdaPersonnelSecond findByPrimaryKey(
			long addFdaPersonnelSecondId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddFdaPersonnelSecondException {

		return getPersistence().findByPrimaryKey(addFdaPersonnelSecondId);
	}

	/**
	 * Returns the add fda personnel second with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addFdaPersonnelSecondId the primary key of the add fda personnel second
	 * @return the add fda personnel second, or <code>null</code> if a add fda personnel second with the primary key could not be found
	 */
	public static AddFdaPersonnelSecond fetchByPrimaryKey(
		long addFdaPersonnelSecondId) {

		return getPersistence().fetchByPrimaryKey(addFdaPersonnelSecondId);
	}

	/**
	 * Returns all the add fda personnel seconds.
	 *
	 * @return the add fda personnel seconds
	 */
	public static List<AddFdaPersonnelSecond> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add fda personnel seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel seconds
	 * @param end the upper bound of the range of add fda personnel seconds (not inclusive)
	 * @return the range of add fda personnel seconds
	 */
	public static List<AddFdaPersonnelSecond> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add fda personnel seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel seconds
	 * @param end the upper bound of the range of add fda personnel seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add fda personnel seconds
	 */
	public static List<AddFdaPersonnelSecond> findAll(
		int start, int end,
		OrderByComparator<AddFdaPersonnelSecond> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add fda personnel seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaPersonnelSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda personnel seconds
	 * @param end the upper bound of the range of add fda personnel seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add fda personnel seconds
	 */
	public static List<AddFdaPersonnelSecond> findAll(
		int start, int end,
		OrderByComparator<AddFdaPersonnelSecond> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add fda personnel seconds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add fda personnel seconds.
	 *
	 * @return the number of add fda personnel seconds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddFdaPersonnelSecondPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddFdaPersonnelSecondPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddFdaPersonnelSecondPersistence _persistence;

}