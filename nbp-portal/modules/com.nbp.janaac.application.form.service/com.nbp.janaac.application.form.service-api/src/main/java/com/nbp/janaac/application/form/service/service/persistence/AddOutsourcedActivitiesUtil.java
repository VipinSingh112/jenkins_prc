/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AddOutsourcedActivities;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the add outsourced activities service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AddOutsourcedActivitiesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddOutsourcedActivitiesPersistence
 * @generated
 */
public class AddOutsourcedActivitiesUtil {

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
		AddOutsourcedActivities addOutsourcedActivities) {

		getPersistence().clearCache(addOutsourcedActivities);
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
	public static Map<Serializable, AddOutsourcedActivities> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddOutsourcedActivities> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddOutsourcedActivities> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddOutsourcedActivities> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddOutsourcedActivities> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddOutsourcedActivities update(
		AddOutsourcedActivities addOutsourcedActivities) {

		return getPersistence().update(addOutsourcedActivities);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddOutsourcedActivities update(
		AddOutsourcedActivities addOutsourcedActivities,
		ServiceContext serviceContext) {

		return getPersistence().update(addOutsourcedActivities, serviceContext);
	}

	/**
	 * Returns all the add outsourced activitieses where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add outsourced activitieses
	 */
	public static List<AddOutsourcedActivities> findBygetJanaac_OutSrc_Id(
		long janaacApplicationId) {

		return getPersistence().findBygetJanaac_OutSrc_Id(janaacApplicationId);
	}

	/**
	 * Returns a range of all the add outsourced activitieses where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddOutsourcedActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add outsourced activitieses
	 * @param end the upper bound of the range of add outsourced activitieses (not inclusive)
	 * @return the range of matching add outsourced activitieses
	 */
	public static List<AddOutsourcedActivities> findBygetJanaac_OutSrc_Id(
		long janaacApplicationId, int start, int end) {

		return getPersistence().findBygetJanaac_OutSrc_Id(
			janaacApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the add outsourced activitieses where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddOutsourcedActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add outsourced activitieses
	 * @param end the upper bound of the range of add outsourced activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add outsourced activitieses
	 */
	public static List<AddOutsourcedActivities> findBygetJanaac_OutSrc_Id(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddOutsourcedActivities> orderByComparator) {

		return getPersistence().findBygetJanaac_OutSrc_Id(
			janaacApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add outsourced activitieses where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddOutsourcedActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add outsourced activitieses
	 * @param end the upper bound of the range of add outsourced activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add outsourced activitieses
	 */
	public static List<AddOutsourcedActivities> findBygetJanaac_OutSrc_Id(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddOutsourcedActivities> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaac_OutSrc_Id(
			janaacApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first add outsourced activities in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add outsourced activities
	 * @throws NoSuchAddOutsourcedActivitiesException if a matching add outsourced activities could not be found
	 */
	public static AddOutsourcedActivities findBygetJanaac_OutSrc_Id_First(
			long janaacApplicationId,
			OrderByComparator<AddOutsourcedActivities> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddOutsourcedActivitiesException {

		return getPersistence().findBygetJanaac_OutSrc_Id_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the first add outsourced activities in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add outsourced activities, or <code>null</code> if a matching add outsourced activities could not be found
	 */
	public static AddOutsourcedActivities fetchBygetJanaac_OutSrc_Id_First(
		long janaacApplicationId,
		OrderByComparator<AddOutsourcedActivities> orderByComparator) {

		return getPersistence().fetchBygetJanaac_OutSrc_Id_First(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add outsourced activities in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add outsourced activities
	 * @throws NoSuchAddOutsourcedActivitiesException if a matching add outsourced activities could not be found
	 */
	public static AddOutsourcedActivities findBygetJanaac_OutSrc_Id_Last(
			long janaacApplicationId,
			OrderByComparator<AddOutsourcedActivities> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddOutsourcedActivitiesException {

		return getPersistence().findBygetJanaac_OutSrc_Id_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the last add outsourced activities in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add outsourced activities, or <code>null</code> if a matching add outsourced activities could not be found
	 */
	public static AddOutsourcedActivities fetchBygetJanaac_OutSrc_Id_Last(
		long janaacApplicationId,
		OrderByComparator<AddOutsourcedActivities> orderByComparator) {

		return getPersistence().fetchBygetJanaac_OutSrc_Id_Last(
			janaacApplicationId, orderByComparator);
	}

	/**
	 * Returns the add outsourced activitieses before and after the current add outsourced activities in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addOutsourcedActivitiesId the primary key of the current add outsourced activities
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add outsourced activities
	 * @throws NoSuchAddOutsourcedActivitiesException if a add outsourced activities with the primary key could not be found
	 */
	public static AddOutsourcedActivities[]
			findBygetJanaac_OutSrc_Id_PrevAndNext(
				long addOutsourcedActivitiesId, long janaacApplicationId,
				OrderByComparator<AddOutsourcedActivities> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddOutsourcedActivitiesException {

		return getPersistence().findBygetJanaac_OutSrc_Id_PrevAndNext(
			addOutsourcedActivitiesId, janaacApplicationId, orderByComparator);
	}

	/**
	 * Removes all the add outsourced activitieses where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	public static void removeBygetJanaac_OutSrc_Id(long janaacApplicationId) {
		getPersistence().removeBygetJanaac_OutSrc_Id(janaacApplicationId);
	}

	/**
	 * Returns the number of add outsourced activitieses where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add outsourced activitieses
	 */
	public static int countBygetJanaac_OutSrc_Id(long janaacApplicationId) {
		return getPersistence().countBygetJanaac_OutSrc_Id(janaacApplicationId);
	}

	/**
	 * Caches the add outsourced activities in the entity cache if it is enabled.
	 *
	 * @param addOutsourcedActivities the add outsourced activities
	 */
	public static void cacheResult(
		AddOutsourcedActivities addOutsourcedActivities) {

		getPersistence().cacheResult(addOutsourcedActivities);
	}

	/**
	 * Caches the add outsourced activitieses in the entity cache if it is enabled.
	 *
	 * @param addOutsourcedActivitieses the add outsourced activitieses
	 */
	public static void cacheResult(
		List<AddOutsourcedActivities> addOutsourcedActivitieses) {

		getPersistence().cacheResult(addOutsourcedActivitieses);
	}

	/**
	 * Creates a new add outsourced activities with the primary key. Does not add the add outsourced activities to the database.
	 *
	 * @param addOutsourcedActivitiesId the primary key for the new add outsourced activities
	 * @return the new add outsourced activities
	 */
	public static AddOutsourcedActivities create(
		long addOutsourcedActivitiesId) {

		return getPersistence().create(addOutsourcedActivitiesId);
	}

	/**
	 * Removes the add outsourced activities with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addOutsourcedActivitiesId the primary key of the add outsourced activities
	 * @return the add outsourced activities that was removed
	 * @throws NoSuchAddOutsourcedActivitiesException if a add outsourced activities with the primary key could not be found
	 */
	public static AddOutsourcedActivities remove(long addOutsourcedActivitiesId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddOutsourcedActivitiesException {

		return getPersistence().remove(addOutsourcedActivitiesId);
	}

	public static AddOutsourcedActivities updateImpl(
		AddOutsourcedActivities addOutsourcedActivities) {

		return getPersistence().updateImpl(addOutsourcedActivities);
	}

	/**
	 * Returns the add outsourced activities with the primary key or throws a <code>NoSuchAddOutsourcedActivitiesException</code> if it could not be found.
	 *
	 * @param addOutsourcedActivitiesId the primary key of the add outsourced activities
	 * @return the add outsourced activities
	 * @throws NoSuchAddOutsourcedActivitiesException if a add outsourced activities with the primary key could not be found
	 */
	public static AddOutsourcedActivities findByPrimaryKey(
			long addOutsourcedActivitiesId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAddOutsourcedActivitiesException {

		return getPersistence().findByPrimaryKey(addOutsourcedActivitiesId);
	}

	/**
	 * Returns the add outsourced activities with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addOutsourcedActivitiesId the primary key of the add outsourced activities
	 * @return the add outsourced activities, or <code>null</code> if a add outsourced activities with the primary key could not be found
	 */
	public static AddOutsourcedActivities fetchByPrimaryKey(
		long addOutsourcedActivitiesId) {

		return getPersistence().fetchByPrimaryKey(addOutsourcedActivitiesId);
	}

	/**
	 * Returns all the add outsourced activitieses.
	 *
	 * @return the add outsourced activitieses
	 */
	public static List<AddOutsourcedActivities> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the add outsourced activitieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddOutsourcedActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add outsourced activitieses
	 * @param end the upper bound of the range of add outsourced activitieses (not inclusive)
	 * @return the range of add outsourced activitieses
	 */
	public static List<AddOutsourcedActivities> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the add outsourced activitieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddOutsourcedActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add outsourced activitieses
	 * @param end the upper bound of the range of add outsourced activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add outsourced activitieses
	 */
	public static List<AddOutsourcedActivities> findAll(
		int start, int end,
		OrderByComparator<AddOutsourcedActivities> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the add outsourced activitieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddOutsourcedActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add outsourced activitieses
	 * @param end the upper bound of the range of add outsourced activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add outsourced activitieses
	 */
	public static List<AddOutsourcedActivities> findAll(
		int start, int end,
		OrderByComparator<AddOutsourcedActivities> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the add outsourced activitieses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of add outsourced activitieses.
	 *
	 * @return the number of add outsourced activitieses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AddOutsourcedActivitiesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AddOutsourcedActivitiesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AddOutsourcedActivitiesPersistence _persistence;

}