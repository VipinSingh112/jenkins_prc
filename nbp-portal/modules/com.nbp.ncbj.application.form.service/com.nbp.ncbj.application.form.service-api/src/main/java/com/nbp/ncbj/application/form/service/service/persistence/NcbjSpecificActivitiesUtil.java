/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjSpecificActivities;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj specific activities service. This utility wraps <code>com.nbp.ncbj.application.form.service.service.persistence.impl.NcbjSpecificActivitiesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSpecificActivitiesPersistence
 * @generated
 */
public class NcbjSpecificActivitiesUtil {

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
		NcbjSpecificActivities ncbjSpecificActivities) {

		getPersistence().clearCache(ncbjSpecificActivities);
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
	public static Map<Serializable, NcbjSpecificActivities> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjSpecificActivities> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjSpecificActivities> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjSpecificActivities> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjSpecificActivities> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjSpecificActivities update(
		NcbjSpecificActivities ncbjSpecificActivities) {

		return getPersistence().update(ncbjSpecificActivities);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjSpecificActivities update(
		NcbjSpecificActivities ncbjSpecificActivities,
		ServiceContext serviceContext) {

		return getPersistence().update(ncbjSpecificActivities, serviceContext);
	}

	/**
	 * Returns all the ncbj specific activitieses where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj specific activitieses
	 */
	public static List<NcbjSpecificActivities> findBygetNcbjAppById(
		long ncbjApplicationId) {

		return getPersistence().findBygetNcbjAppById(ncbjApplicationId);
	}

	/**
	 * Returns a range of all the ncbj specific activitieses where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSpecificActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj specific activitieses
	 * @param end the upper bound of the range of ncbj specific activitieses (not inclusive)
	 * @return the range of matching ncbj specific activitieses
	 */
	public static List<NcbjSpecificActivities> findBygetNcbjAppById(
		long ncbjApplicationId, int start, int end) {

		return getPersistence().findBygetNcbjAppById(
			ncbjApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj specific activitieses where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSpecificActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj specific activitieses
	 * @param end the upper bound of the range of ncbj specific activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj specific activitieses
	 */
	public static List<NcbjSpecificActivities> findBygetNcbjAppById(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjSpecificActivities> orderByComparator) {

		return getPersistence().findBygetNcbjAppById(
			ncbjApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj specific activitieses where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSpecificActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj specific activitieses
	 * @param end the upper bound of the range of ncbj specific activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj specific activitieses
	 */
	public static List<NcbjSpecificActivities> findBygetNcbjAppById(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjSpecificActivities> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNcbjAppById(
			ncbjApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj specific activities in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj specific activities
	 * @throws NoSuchNcbjSpecificActivitiesException if a matching ncbj specific activities could not be found
	 */
	public static NcbjSpecificActivities findBygetNcbjAppById_First(
			long ncbjApplicationId,
			OrderByComparator<NcbjSpecificActivities> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSpecificActivitiesException {

		return getPersistence().findBygetNcbjAppById_First(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the first ncbj specific activities in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj specific activities, or <code>null</code> if a matching ncbj specific activities could not be found
	 */
	public static NcbjSpecificActivities fetchBygetNcbjAppById_First(
		long ncbjApplicationId,
		OrderByComparator<NcbjSpecificActivities> orderByComparator) {

		return getPersistence().fetchBygetNcbjAppById_First(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj specific activities in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj specific activities
	 * @throws NoSuchNcbjSpecificActivitiesException if a matching ncbj specific activities could not be found
	 */
	public static NcbjSpecificActivities findBygetNcbjAppById_Last(
			long ncbjApplicationId,
			OrderByComparator<NcbjSpecificActivities> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSpecificActivitiesException {

		return getPersistence().findBygetNcbjAppById_Last(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj specific activities in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj specific activities, or <code>null</code> if a matching ncbj specific activities could not be found
	 */
	public static NcbjSpecificActivities fetchBygetNcbjAppById_Last(
		long ncbjApplicationId,
		OrderByComparator<NcbjSpecificActivities> orderByComparator) {

		return getPersistence().fetchBygetNcbjAppById_Last(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the ncbj specific activitieses before and after the current ncbj specific activities in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjSpecificActivitiesId the primary key of the current ncbj specific activities
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj specific activities
	 * @throws NoSuchNcbjSpecificActivitiesException if a ncbj specific activities with the primary key could not be found
	 */
	public static NcbjSpecificActivities[] findBygetNcbjAppById_PrevAndNext(
			long ncbjSpecificActivitiesId, long ncbjApplicationId,
			OrderByComparator<NcbjSpecificActivities> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSpecificActivitiesException {

		return getPersistence().findBygetNcbjAppById_PrevAndNext(
			ncbjSpecificActivitiesId, ncbjApplicationId, orderByComparator);
	}

	/**
	 * Removes all the ncbj specific activitieses where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public static void removeBygetNcbjAppById(long ncbjApplicationId) {
		getPersistence().removeBygetNcbjAppById(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj specific activitieses where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj specific activitieses
	 */
	public static int countBygetNcbjAppById(long ncbjApplicationId) {
		return getPersistence().countBygetNcbjAppById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj specific activities where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjSpecificActivitiesException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj specific activities
	 * @throws NoSuchNcbjSpecificActivitiesException if a matching ncbj specific activities could not be found
	 */
	public static NcbjSpecificActivities findBygetApp_byNcbjID(
			long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSpecificActivitiesException {

		return getPersistence().findBygetApp_byNcbjID(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj specific activities where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj specific activities, or <code>null</code> if a matching ncbj specific activities could not be found
	 */
	public static NcbjSpecificActivities fetchBygetApp_byNcbjID(
		long ncbjApplicationId) {

		return getPersistence().fetchBygetApp_byNcbjID(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj specific activities where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj specific activities, or <code>null</code> if a matching ncbj specific activities could not be found
	 */
	public static NcbjSpecificActivities fetchBygetApp_byNcbjID(
		long ncbjApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetApp_byNcbjID(
			ncbjApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncbj specific activities where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj specific activities that was removed
	 */
	public static NcbjSpecificActivities removeBygetApp_byNcbjID(
			long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSpecificActivitiesException {

		return getPersistence().removeBygetApp_byNcbjID(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj specific activitieses where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj specific activitieses
	 */
	public static int countBygetApp_byNcbjID(long ncbjApplicationId) {
		return getPersistence().countBygetApp_byNcbjID(ncbjApplicationId);
	}

	/**
	 * Caches the ncbj specific activities in the entity cache if it is enabled.
	 *
	 * @param ncbjSpecificActivities the ncbj specific activities
	 */
	public static void cacheResult(
		NcbjSpecificActivities ncbjSpecificActivities) {

		getPersistence().cacheResult(ncbjSpecificActivities);
	}

	/**
	 * Caches the ncbj specific activitieses in the entity cache if it is enabled.
	 *
	 * @param ncbjSpecificActivitieses the ncbj specific activitieses
	 */
	public static void cacheResult(
		List<NcbjSpecificActivities> ncbjSpecificActivitieses) {

		getPersistence().cacheResult(ncbjSpecificActivitieses);
	}

	/**
	 * Creates a new ncbj specific activities with the primary key. Does not add the ncbj specific activities to the database.
	 *
	 * @param ncbjSpecificActivitiesId the primary key for the new ncbj specific activities
	 * @return the new ncbj specific activities
	 */
	public static NcbjSpecificActivities create(long ncbjSpecificActivitiesId) {
		return getPersistence().create(ncbjSpecificActivitiesId);
	}

	/**
	 * Removes the ncbj specific activities with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjSpecificActivitiesId the primary key of the ncbj specific activities
	 * @return the ncbj specific activities that was removed
	 * @throws NoSuchNcbjSpecificActivitiesException if a ncbj specific activities with the primary key could not be found
	 */
	public static NcbjSpecificActivities remove(long ncbjSpecificActivitiesId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSpecificActivitiesException {

		return getPersistence().remove(ncbjSpecificActivitiesId);
	}

	public static NcbjSpecificActivities updateImpl(
		NcbjSpecificActivities ncbjSpecificActivities) {

		return getPersistence().updateImpl(ncbjSpecificActivities);
	}

	/**
	 * Returns the ncbj specific activities with the primary key or throws a <code>NoSuchNcbjSpecificActivitiesException</code> if it could not be found.
	 *
	 * @param ncbjSpecificActivitiesId the primary key of the ncbj specific activities
	 * @return the ncbj specific activities
	 * @throws NoSuchNcbjSpecificActivitiesException if a ncbj specific activities with the primary key could not be found
	 */
	public static NcbjSpecificActivities findByPrimaryKey(
			long ncbjSpecificActivitiesId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSpecificActivitiesException {

		return getPersistence().findByPrimaryKey(ncbjSpecificActivitiesId);
	}

	/**
	 * Returns the ncbj specific activities with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjSpecificActivitiesId the primary key of the ncbj specific activities
	 * @return the ncbj specific activities, or <code>null</code> if a ncbj specific activities with the primary key could not be found
	 */
	public static NcbjSpecificActivities fetchByPrimaryKey(
		long ncbjSpecificActivitiesId) {

		return getPersistence().fetchByPrimaryKey(ncbjSpecificActivitiesId);
	}

	/**
	 * Returns all the ncbj specific activitieses.
	 *
	 * @return the ncbj specific activitieses
	 */
	public static List<NcbjSpecificActivities> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj specific activitieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSpecificActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj specific activitieses
	 * @param end the upper bound of the range of ncbj specific activitieses (not inclusive)
	 * @return the range of ncbj specific activitieses
	 */
	public static List<NcbjSpecificActivities> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj specific activitieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSpecificActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj specific activitieses
	 * @param end the upper bound of the range of ncbj specific activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj specific activitieses
	 */
	public static List<NcbjSpecificActivities> findAll(
		int start, int end,
		OrderByComparator<NcbjSpecificActivities> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj specific activitieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSpecificActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj specific activitieses
	 * @param end the upper bound of the range of ncbj specific activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj specific activitieses
	 */
	public static List<NcbjSpecificActivities> findAll(
		int start, int end,
		OrderByComparator<NcbjSpecificActivities> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj specific activitieses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj specific activitieses.
	 *
	 * @return the number of ncbj specific activitieses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjSpecificActivitiesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcbjSpecificActivitiesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcbjSpecificActivitiesPersistence _persistence;

}