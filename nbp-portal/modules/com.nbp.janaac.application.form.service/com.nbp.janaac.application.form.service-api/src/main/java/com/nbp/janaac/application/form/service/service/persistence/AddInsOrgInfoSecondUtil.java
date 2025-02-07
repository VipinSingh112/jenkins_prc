/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddInsOrgInfoSecond;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add ins org info second service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddInsOrgInfoSecondPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddInsOrgInfoSecondPersistence
 * @generated
 */
public class AddInsOrgInfoSecondUtil {

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
	public static void clearCache(AddInsOrgInfoSecond addInsOrgInfoSecond) {
		getPersistence().clearCache(addInsOrgInfoSecond);
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
	public static Map<Serializable, AddInsOrgInfoSecond> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddInsOrgInfoSecond> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddInsOrgInfoSecond> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddInsOrgInfoSecond> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddInsOrgInfoSecond> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddInsOrgInfoSecond update(
		AddInsOrgInfoSecond addInsOrgInfoSecond) {

		return getPersistence().update(addInsOrgInfoSecond);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddInsOrgInfoSecond update(
		AddInsOrgInfoSecond addInsOrgInfoSecond,
		ServiceContext serviceContext) {

		return getPersistence().update(addInsOrgInfoSecond, serviceContext);
	}

	/**
	 * Returns all the add ins org info seconds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add ins org info seconds
	 */
	public static List<AddInsOrgInfoSecond> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add ins org info seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info seconds
	 * @param end the upper bound of the range of add ins org info seconds (not inclusive)
	 * @return the range of matching add ins org info seconds
	 */
	public static List<AddInsOrgInfoSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add ins org info seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info seconds
	 * @param end the upper bound of the range of add ins org info seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add ins org info seconds
	 */
	public static List<AddInsOrgInfoSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddInsOrgInfoSecond> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add ins org info seconds where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoSecondModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add ins org info seconds
	 * @param end the upper bound of the range of add ins org info seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add ins org info seconds
	 */
	public static List<AddInsOrgInfoSecond> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddInsOrgInfoSecond> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add ins org info second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins org info second
	 * @throws NoSuchAddInsOrgInfoSecondException if a matching add ins org info second could not be found
	 */
	public static AddInsOrgInfoSecond findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddInsOrgInfoSecond> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddInsOrgInfoSecondException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add ins org info second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add ins org info second, or <code>null</code> if a matching add ins org info second could not be found
	 */
	public static AddInsOrgInfoSecond fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddInsOrgInfoSecond> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add ins org info second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins org info second
	 * @throws NoSuchAddInsOrgInfoSecondException if a matching add ins org info second could not be found
	 */
	public static AddInsOrgInfoSecond findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddInsOrgInfoSecond> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddInsOrgInfoSecondException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add ins org info second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add ins org info second, or <code>null</code> if a matching add ins org info second could not be found
	 */
	public static AddInsOrgInfoSecond fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddInsOrgInfoSecond> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add ins org info seconds before and after the current add ins org info second in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addInsOrgInfoSecondId the primary key of the current add ins org info second
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add ins org info second
	 * @throws NoSuchAddInsOrgInfoSecondException if a add ins org info second with the primary key could not be found
	 */
	public static AddInsOrgInfoSecond[] findBygetJanaacById_PrevAndNext(
			long addInsOrgInfoSecondId, long janaacApplicationId,
			OrderByComparator<AddInsOrgInfoSecond> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddInsOrgInfoSecondException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addInsOrgInfoSecondId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add ins org info seconds where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add ins org info seconds where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add ins org info seconds
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add ins org info second in the entity cache if it is enabled.
	 *
	 * @param addInsOrgInfoSecond the add ins org info second
	 */
	public static void cacheResult(AddInsOrgInfoSecond addInsOrgInfoSecond) {
		getPersistence().cacheResult(addInsOrgInfoSecond);
	}

	/**
	 * Caches the add ins org info seconds in the entity cache if it is enabled.
	 *
	 * @param addInsOrgInfoSeconds the add ins org info seconds
	 */
	public static void cacheResult(
		List<AddInsOrgInfoSecond> addInsOrgInfoSeconds) {

		getPersistence().cacheResult(addInsOrgInfoSeconds);
	}

	/**
	 * Creates a new add ins org info second with the primary key. Does not add the add ins org info second to the database.
	 *
	 * @param addInsOrgInfoSecondId the primary key for the new add ins org info second
	 * @return the new add ins org info second
	 */
	public static AddInsOrgInfoSecond create(long addInsOrgInfoSecondId) {
		return getPersistence().create(addInsOrgInfoSecondId);
	}

	/**
	 * Removes the add ins org info second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addInsOrgInfoSecondId the primary key of the add ins org info second
	 * @return the add ins org info second that was removed
	 * @throws NoSuchAddInsOrgInfoSecondException if a add ins org info second with the primary key could not be found
	 */
	public static AddInsOrgInfoSecond remove(long addInsOrgInfoSecondId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddInsOrgInfoSecondException {

		return getPersistence().remove(addInsOrgInfoSecondId);
	}

	public static AddInsOrgInfoSecond updateImpl(
		AddInsOrgInfoSecond addInsOrgInfoSecond) {

		return getPersistence().updateImpl(addInsOrgInfoSecond);
	}

	/**
	 * Returns the add ins org info second with the primary key or throws a <code>NoSuchAddInsOrgInfoSecondException</code> if it could not be found.
	 *
	 * @param addInsOrgInfoSecondId the primary key of the add ins org info second
	 * @return the add ins org info second
	 * @throws NoSuchAddInsOrgInfoSecondException if a add ins org info second with the primary key could not be found
	 */
	public static AddInsOrgInfoSecond findByPrimaryKey(
			long addInsOrgInfoSecondId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddInsOrgInfoSecondException {

		return getPersistence().findByPrimaryKey(addInsOrgInfoSecondId);
	}

	/**
	 * Returns the add ins org info second with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addInsOrgInfoSecondId the primary key of the add ins org info second
	 * @return the add ins org info second, or <code>null</code> if a add ins org info second with the primary key could not be found
	 */
	public static AddInsOrgInfoSecond fetchByPrimaryKey(
		long addInsOrgInfoSecondId) {

		return getPersistence().fetchByPrimaryKey(addInsOrgInfoSecondId);
	}

	/**
	 * Returns all the add ins org info seconds.
	 *
	 * @return the add ins org info seconds
	 */
	public static List<AddInsOrgInfoSecond> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add ins org info seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info seconds
	 * @param end the upper bound of the range of add ins org info seconds (not inclusive)
	 * @return the range of add ins org info seconds
	 */
	public static List<AddInsOrgInfoSecond> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add ins org info seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info seconds
	 * @param end the upper bound of the range of add ins org info seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add ins org info seconds
	 */
	public static List<AddInsOrgInfoSecond> findAll(
		int start, int end,
		OrderByComparator<AddInsOrgInfoSecond> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add ins org info seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddInsOrgInfoSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins org info seconds
	 * @param end the upper bound of the range of add ins org info seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add ins org info seconds
	 */
	public static List<AddInsOrgInfoSecond> findAll(
		int start, int end,
		OrderByComparator<AddInsOrgInfoSecond> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add ins org info seconds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add ins org info seconds.
	 *
	 * @return the number of add ins org info seconds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddInsOrgInfoSecondPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddInsOrgInfoSecondPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddInsOrgInfoSecondPersistence _persistence;

}