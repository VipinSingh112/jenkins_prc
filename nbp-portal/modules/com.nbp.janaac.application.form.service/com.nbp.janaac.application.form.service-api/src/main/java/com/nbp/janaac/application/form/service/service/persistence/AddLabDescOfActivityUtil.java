/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddLabDescOfActivity;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add lab desc of activity service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddLabDescOfActivityPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabDescOfActivityPersistence
 * @generated
 */
public class AddLabDescOfActivityUtil {

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
	public static void clearCache(AddLabDescOfActivity addLabDescOfActivity) {
		getPersistence().clearCache(addLabDescOfActivity);
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
	public static Map<Serializable, AddLabDescOfActivity> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddLabDescOfActivity> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddLabDescOfActivity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddLabDescOfActivity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddLabDescOfActivity> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddLabDescOfActivity update(
		AddLabDescOfActivity addLabDescOfActivity) {

		return getPersistence().update(addLabDescOfActivity);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddLabDescOfActivity update(
		AddLabDescOfActivity addLabDescOfActivity,
		ServiceContext serviceContext) {

		return getPersistence().update(addLabDescOfActivity, serviceContext);
	}

	/**
	 * Returns all the add lab desc of activities where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab desc of activities
	 */
	public static List<AddLabDescOfActivity> findBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add lab desc of activities where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabDescOfActivityModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab desc of activities
	 * @param end the upper bound of the range of add lab desc of activities (not inclusive)
	 * @return the range of matching add lab desc of activities
	 */
	public static List<AddLabDescOfActivity> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add lab desc of activities where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabDescOfActivityModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab desc of activities
	 * @param end the upper bound of the range of add lab desc of activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab desc of activities
	 */
	public static List<AddLabDescOfActivity> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabDescOfActivity> orderByComparator) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add lab desc of activities where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabDescOfActivityModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab desc of activities
	 * @param end the upper bound of the range of add lab desc of activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab desc of activities
	 */
	public static List<AddLabDescOfActivity> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabDescOfActivity> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add lab desc of activity in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab desc of activity
	 * @throws NoSuchAddLabDescOfActivityException if a matching add lab desc of activity could not be found
	 */
	public static AddLabDescOfActivity findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddLabDescOfActivity> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabDescOfActivityException {

		return getPersistence().findBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add lab desc of activity in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab desc of activity, or <code>null</code> if a matching add lab desc of activity could not be found
	 */
	public static AddLabDescOfActivity fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddLabDescOfActivity> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add lab desc of activity in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab desc of activity
	 * @throws NoSuchAddLabDescOfActivityException if a matching add lab desc of activity could not be found
	 */
	public static AddLabDescOfActivity findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddLabDescOfActivity> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabDescOfActivityException {

		return getPersistence().findBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add lab desc of activity in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab desc of activity, or <code>null</code> if a matching add lab desc of activity could not be found
	 */
	public static AddLabDescOfActivity fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddLabDescOfActivity> orderByComparator) {

		return getPersistence().fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add lab desc of activities before and after the current add lab desc of activity in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabDescOfActivityId the primary key of the current add lab desc of activity
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab desc of activity
	 * @throws NoSuchAddLabDescOfActivityException if a add lab desc of activity with the primary key could not be found
	 */
	public static AddLabDescOfActivity[] findBygetJanaacById_PrevAndNext(
			long addLabDescOfActivityId, long janaacApplicationId,
			OrderByComparator<AddLabDescOfActivity> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabDescOfActivityException {

		return getPersistence().findBygetJanaacById_PrevAndNext(
			addLabDescOfActivityId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add lab desc of activities where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaacById(long janaacApplicationId) {
		getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of add lab desc of activities where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab desc of activities
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the add lab desc of activity in the entity cache if it is enabled.
	 *
	 * @param addLabDescOfActivity the add lab desc of activity
	 */
	public static void cacheResult(AddLabDescOfActivity addLabDescOfActivity) {
		getPersistence().cacheResult(addLabDescOfActivity);
	}

	/**
	 * Caches the add lab desc of activities in the entity cache if it is enabled.
	 *
	 * @param addLabDescOfActivities the add lab desc of activities
	 */
	public static void cacheResult(
		List<AddLabDescOfActivity> addLabDescOfActivities) {

		getPersistence().cacheResult(addLabDescOfActivities);
	}

	/**
	 * Creates a new add lab desc of activity with the primary key. Does not add the add lab desc of activity to the database.
	 *
	 * @param addLabDescOfActivityId the primary key for the new add lab desc of activity
	 * @return the new add lab desc of activity
	 */
	public static AddLabDescOfActivity create(long addLabDescOfActivityId) {
		return getPersistence().create(addLabDescOfActivityId);
	}

	/**
	 * Removes the add lab desc of activity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabDescOfActivityId the primary key of the add lab desc of activity
	 * @return the add lab desc of activity that was removed
	 * @throws NoSuchAddLabDescOfActivityException if a add lab desc of activity with the primary key could not be found
	 */
	public static AddLabDescOfActivity remove(long addLabDescOfActivityId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabDescOfActivityException {

		return getPersistence().remove(addLabDescOfActivityId);
	}

	public static AddLabDescOfActivity updateImpl(
		AddLabDescOfActivity addLabDescOfActivity) {

		return getPersistence().updateImpl(addLabDescOfActivity);
	}

	/**
	 * Returns the add lab desc of activity with the primary key or throws a <code>NoSuchAddLabDescOfActivityException</code> if it could not be found.
	 *
	 * @param addLabDescOfActivityId the primary key of the add lab desc of activity
	 * @return the add lab desc of activity
	 * @throws NoSuchAddLabDescOfActivityException if a add lab desc of activity with the primary key could not be found
	 */
	public static AddLabDescOfActivity findByPrimaryKey(
			long addLabDescOfActivityId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddLabDescOfActivityException {

		return getPersistence().findByPrimaryKey(addLabDescOfActivityId);
	}

	/**
	 * Returns the add lab desc of activity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabDescOfActivityId the primary key of the add lab desc of activity
	 * @return the add lab desc of activity, or <code>null</code> if a add lab desc of activity with the primary key could not be found
	 */
	public static AddLabDescOfActivity fetchByPrimaryKey(
		long addLabDescOfActivityId) {

		return getPersistence().fetchByPrimaryKey(addLabDescOfActivityId);
	}

	/**
	 * Returns all the add lab desc of activities.
	 *
	 * @return the add lab desc of activities
	 */
	public static List<AddLabDescOfActivity> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add lab desc of activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabDescOfActivityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab desc of activities
	 * @param end the upper bound of the range of add lab desc of activities (not inclusive)
	 * @return the range of add lab desc of activities
	 */
	public static List<AddLabDescOfActivity> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add lab desc of activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabDescOfActivityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab desc of activities
	 * @param end the upper bound of the range of add lab desc of activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab desc of activities
	 */
	public static List<AddLabDescOfActivity> findAll(
		int start, int end,
		OrderByComparator<AddLabDescOfActivity> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add lab desc of activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabDescOfActivityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab desc of activities
	 * @param end the upper bound of the range of add lab desc of activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab desc of activities
	 */
	public static List<AddLabDescOfActivity> findAll(
		int start, int end,
		OrderByComparator<AddLabDescOfActivity> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add lab desc of activities from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add lab desc of activities.
	 *
	 * @return the number of add lab desc of activities
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddLabDescOfActivityPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddLabDescOfActivityPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddLabDescOfActivityPersistence _persistence;

}