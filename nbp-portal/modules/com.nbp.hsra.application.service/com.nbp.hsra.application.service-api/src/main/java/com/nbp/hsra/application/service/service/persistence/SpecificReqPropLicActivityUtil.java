/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.SpecificReqPropLicActivity;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the specific req prop lic activity service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.SpecificReqPropLicActivityPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SpecificReqPropLicActivityPersistence
 * @generated
 */
public class SpecificReqPropLicActivityUtil {

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
		SpecificReqPropLicActivity specificReqPropLicActivity) {

		getPersistence().clearCache(specificReqPropLicActivity);
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
	public static Map<Serializable, SpecificReqPropLicActivity>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SpecificReqPropLicActivity> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SpecificReqPropLicActivity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SpecificReqPropLicActivity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SpecificReqPropLicActivity> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SpecificReqPropLicActivity update(
		SpecificReqPropLicActivity specificReqPropLicActivity) {

		return getPersistence().update(specificReqPropLicActivity);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SpecificReqPropLicActivity update(
		SpecificReqPropLicActivity specificReqPropLicActivity,
		ServiceContext serviceContext) {

		return getPersistence().update(
			specificReqPropLicActivity, serviceContext);
	}

	/**
	 * Returns the specific req prop lic activity where hsraApplicationId = &#63; or throws a <code>NoSuchSpecificReqPropLicActivityException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching specific req prop lic activity
	 * @throws NoSuchSpecificReqPropLicActivityException if a matching specific req prop lic activity could not be found
	 */
	public static SpecificReqPropLicActivity findBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchSpecificReqPropLicActivityException {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the specific req prop lic activity where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching specific req prop lic activity, or <code>null</code> if a matching specific req prop lic activity could not be found
	 */
	public static SpecificReqPropLicActivity fetchBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().fetchBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the specific req prop lic activity where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching specific req prop lic activity, or <code>null</code> if a matching specific req prop lic activity could not be found
	 */
	public static SpecificReqPropLicActivity fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraById(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the specific req prop lic activity where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the specific req prop lic activity that was removed
	 */
	public static SpecificReqPropLicActivity removeBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchSpecificReqPropLicActivityException {

		return getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of specific req prop lic activities where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching specific req prop lic activities
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the specific req prop lic activity in the entity cache if it is enabled.
	 *
	 * @param specificReqPropLicActivity the specific req prop lic activity
	 */
	public static void cacheResult(
		SpecificReqPropLicActivity specificReqPropLicActivity) {

		getPersistence().cacheResult(specificReqPropLicActivity);
	}

	/**
	 * Caches the specific req prop lic activities in the entity cache if it is enabled.
	 *
	 * @param specificReqPropLicActivities the specific req prop lic activities
	 */
	public static void cacheResult(
		List<SpecificReqPropLicActivity> specificReqPropLicActivities) {

		getPersistence().cacheResult(specificReqPropLicActivities);
	}

	/**
	 * Creates a new specific req prop lic activity with the primary key. Does not add the specific req prop lic activity to the database.
	 *
	 * @param specificReqPropLicActivityId the primary key for the new specific req prop lic activity
	 * @return the new specific req prop lic activity
	 */
	public static SpecificReqPropLicActivity create(
		long specificReqPropLicActivityId) {

		return getPersistence().create(specificReqPropLicActivityId);
	}

	/**
	 * Removes the specific req prop lic activity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param specificReqPropLicActivityId the primary key of the specific req prop lic activity
	 * @return the specific req prop lic activity that was removed
	 * @throws NoSuchSpecificReqPropLicActivityException if a specific req prop lic activity with the primary key could not be found
	 */
	public static SpecificReqPropLicActivity remove(
			long specificReqPropLicActivityId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchSpecificReqPropLicActivityException {

		return getPersistence().remove(specificReqPropLicActivityId);
	}

	public static SpecificReqPropLicActivity updateImpl(
		SpecificReqPropLicActivity specificReqPropLicActivity) {

		return getPersistence().updateImpl(specificReqPropLicActivity);
	}

	/**
	 * Returns the specific req prop lic activity with the primary key or throws a <code>NoSuchSpecificReqPropLicActivityException</code> if it could not be found.
	 *
	 * @param specificReqPropLicActivityId the primary key of the specific req prop lic activity
	 * @return the specific req prop lic activity
	 * @throws NoSuchSpecificReqPropLicActivityException if a specific req prop lic activity with the primary key could not be found
	 */
	public static SpecificReqPropLicActivity findByPrimaryKey(
			long specificReqPropLicActivityId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchSpecificReqPropLicActivityException {

		return getPersistence().findByPrimaryKey(specificReqPropLicActivityId);
	}

	/**
	 * Returns the specific req prop lic activity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param specificReqPropLicActivityId the primary key of the specific req prop lic activity
	 * @return the specific req prop lic activity, or <code>null</code> if a specific req prop lic activity with the primary key could not be found
	 */
	public static SpecificReqPropLicActivity fetchByPrimaryKey(
		long specificReqPropLicActivityId) {

		return getPersistence().fetchByPrimaryKey(specificReqPropLicActivityId);
	}

	/**
	 * Returns all the specific req prop lic activities.
	 *
	 * @return the specific req prop lic activities
	 */
	public static List<SpecificReqPropLicActivity> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the specific req prop lic activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SpecificReqPropLicActivityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of specific req prop lic activities
	 * @param end the upper bound of the range of specific req prop lic activities (not inclusive)
	 * @return the range of specific req prop lic activities
	 */
	public static List<SpecificReqPropLicActivity> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the specific req prop lic activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SpecificReqPropLicActivityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of specific req prop lic activities
	 * @param end the upper bound of the range of specific req prop lic activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of specific req prop lic activities
	 */
	public static List<SpecificReqPropLicActivity> findAll(
		int start, int end,
		OrderByComparator<SpecificReqPropLicActivity> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the specific req prop lic activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SpecificReqPropLicActivityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of specific req prop lic activities
	 * @param end the upper bound of the range of specific req prop lic activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of specific req prop lic activities
	 */
	public static List<SpecificReqPropLicActivity> findAll(
		int start, int end,
		OrderByComparator<SpecificReqPropLicActivity> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the specific req prop lic activities from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of specific req prop lic activities.
	 *
	 * @return the number of specific req prop lic activities
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SpecificReqPropLicActivityPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SpecificReqPropLicActivityPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SpecificReqPropLicActivityPersistence _persistence;

}