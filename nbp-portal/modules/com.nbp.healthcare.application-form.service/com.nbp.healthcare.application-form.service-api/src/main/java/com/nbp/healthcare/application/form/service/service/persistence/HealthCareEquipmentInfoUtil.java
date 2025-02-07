/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.healthcare.application.form.service.model.HealthCareEquipmentInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the health care equipment info service. This utility wraps <code>com.nbp.healthcare.application.form.service.service.persistence.impl.HealthCareEquipmentInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareEquipmentInfoPersistence
 * @generated
 */
public class HealthCareEquipmentInfoUtil {

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
		HealthCareEquipmentInfo healthCareEquipmentInfo) {

		getPersistence().clearCache(healthCareEquipmentInfo);
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
	public static Map<Serializable, HealthCareEquipmentInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HealthCareEquipmentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HealthCareEquipmentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HealthCareEquipmentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HealthCareEquipmentInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HealthCareEquipmentInfo update(
		HealthCareEquipmentInfo healthCareEquipmentInfo) {

		return getPersistence().update(healthCareEquipmentInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HealthCareEquipmentInfo update(
		HealthCareEquipmentInfo healthCareEquipmentInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(healthCareEquipmentInfo, serviceContext);
	}

	/**
	 * Returns the health care equipment info where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareEquipmentInfoException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care equipment info
	 * @throws NoSuchHealthCareEquipmentInfoException if a matching health care equipment info could not be found
	 */
	public static HealthCareEquipmentInfo findBygetHelthCareById(
			long healthCareApplicationId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareEquipmentInfoException {

		return getPersistence().findBygetHelthCareById(healthCareApplicationId);
	}

	/**
	 * Returns the health care equipment info where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care equipment info, or <code>null</code> if a matching health care equipment info could not be found
	 */
	public static HealthCareEquipmentInfo fetchBygetHelthCareById(
		long healthCareApplicationId) {

		return getPersistence().fetchBygetHelthCareById(
			healthCareApplicationId);
	}

	/**
	 * Returns the health care equipment info where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care equipment info, or <code>null</code> if a matching health care equipment info could not be found
	 */
	public static HealthCareEquipmentInfo fetchBygetHelthCareById(
		long healthCareApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHelthCareById(
			healthCareApplicationId, useFinderCache);
	}

	/**
	 * Removes the health care equipment info where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care equipment info that was removed
	 */
	public static HealthCareEquipmentInfo removeBygetHelthCareById(
			long healthCareApplicationId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareEquipmentInfoException {

		return getPersistence().removeBygetHelthCareById(
			healthCareApplicationId);
	}

	/**
	 * Returns the number of health care equipment infos where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care equipment infos
	 */
	public static int countBygetHelthCareById(long healthCareApplicationId) {
		return getPersistence().countBygetHelthCareById(
			healthCareApplicationId);
	}

	/**
	 * Returns all the health care equipment infos where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care equipment infos
	 */
	public static List<HealthCareEquipmentInfo> findBygetHC_EB_HAI(
		long healthCareApplicationId) {

		return getPersistence().findBygetHC_EB_HAI(healthCareApplicationId);
	}

	/**
	 * Returns a range of all the health care equipment infos where healthCareApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param start the lower bound of the range of health care equipment infos
	 * @param end the upper bound of the range of health care equipment infos (not inclusive)
	 * @return the range of matching health care equipment infos
	 */
	public static List<HealthCareEquipmentInfo> findBygetHC_EB_HAI(
		long healthCareApplicationId, int start, int end) {

		return getPersistence().findBygetHC_EB_HAI(
			healthCareApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the health care equipment infos where healthCareApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param start the lower bound of the range of health care equipment infos
	 * @param end the upper bound of the range of health care equipment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health care equipment infos
	 */
	public static List<HealthCareEquipmentInfo> findBygetHC_EB_HAI(
		long healthCareApplicationId, int start, int end,
		OrderByComparator<HealthCareEquipmentInfo> orderByComparator) {

		return getPersistence().findBygetHC_EB_HAI(
			healthCareApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the health care equipment infos where healthCareApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param start the lower bound of the range of health care equipment infos
	 * @param end the upper bound of the range of health care equipment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health care equipment infos
	 */
	public static List<HealthCareEquipmentInfo> findBygetHC_EB_HAI(
		long healthCareApplicationId, int start, int end,
		OrderByComparator<HealthCareEquipmentInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHC_EB_HAI(
			healthCareApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first health care equipment info in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health care equipment info
	 * @throws NoSuchHealthCareEquipmentInfoException if a matching health care equipment info could not be found
	 */
	public static HealthCareEquipmentInfo findBygetHC_EB_HAI_First(
			long healthCareApplicationId,
			OrderByComparator<HealthCareEquipmentInfo> orderByComparator)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareEquipmentInfoException {

		return getPersistence().findBygetHC_EB_HAI_First(
			healthCareApplicationId, orderByComparator);
	}

	/**
	 * Returns the first health care equipment info in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health care equipment info, or <code>null</code> if a matching health care equipment info could not be found
	 */
	public static HealthCareEquipmentInfo fetchBygetHC_EB_HAI_First(
		long healthCareApplicationId,
		OrderByComparator<HealthCareEquipmentInfo> orderByComparator) {

		return getPersistence().fetchBygetHC_EB_HAI_First(
			healthCareApplicationId, orderByComparator);
	}

	/**
	 * Returns the last health care equipment info in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health care equipment info
	 * @throws NoSuchHealthCareEquipmentInfoException if a matching health care equipment info could not be found
	 */
	public static HealthCareEquipmentInfo findBygetHC_EB_HAI_Last(
			long healthCareApplicationId,
			OrderByComparator<HealthCareEquipmentInfo> orderByComparator)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareEquipmentInfoException {

		return getPersistence().findBygetHC_EB_HAI_Last(
			healthCareApplicationId, orderByComparator);
	}

	/**
	 * Returns the last health care equipment info in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health care equipment info, or <code>null</code> if a matching health care equipment info could not be found
	 */
	public static HealthCareEquipmentInfo fetchBygetHC_EB_HAI_Last(
		long healthCareApplicationId,
		OrderByComparator<HealthCareEquipmentInfo> orderByComparator) {

		return getPersistence().fetchBygetHC_EB_HAI_Last(
			healthCareApplicationId, orderByComparator);
	}

	/**
	 * Returns the health care equipment infos before and after the current health care equipment info in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareEquipmentInfoId the primary key of the current health care equipment info
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health care equipment info
	 * @throws NoSuchHealthCareEquipmentInfoException if a health care equipment info with the primary key could not be found
	 */
	public static HealthCareEquipmentInfo[] findBygetHC_EB_HAI_PrevAndNext(
			long healthCareEquipmentInfoId, long healthCareApplicationId,
			OrderByComparator<HealthCareEquipmentInfo> orderByComparator)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareEquipmentInfoException {

		return getPersistence().findBygetHC_EB_HAI_PrevAndNext(
			healthCareEquipmentInfoId, healthCareApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the health care equipment infos where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 */
	public static void removeBygetHC_EB_HAI(long healthCareApplicationId) {
		getPersistence().removeBygetHC_EB_HAI(healthCareApplicationId);
	}

	/**
	 * Returns the number of health care equipment infos where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care equipment infos
	 */
	public static int countBygetHC_EB_HAI(long healthCareApplicationId) {
		return getPersistence().countBygetHC_EB_HAI(healthCareApplicationId);
	}

	/**
	 * Caches the health care equipment info in the entity cache if it is enabled.
	 *
	 * @param healthCareEquipmentInfo the health care equipment info
	 */
	public static void cacheResult(
		HealthCareEquipmentInfo healthCareEquipmentInfo) {

		getPersistence().cacheResult(healthCareEquipmentInfo);
	}

	/**
	 * Caches the health care equipment infos in the entity cache if it is enabled.
	 *
	 * @param healthCareEquipmentInfos the health care equipment infos
	 */
	public static void cacheResult(
		List<HealthCareEquipmentInfo> healthCareEquipmentInfos) {

		getPersistence().cacheResult(healthCareEquipmentInfos);
	}

	/**
	 * Creates a new health care equipment info with the primary key. Does not add the health care equipment info to the database.
	 *
	 * @param healthCareEquipmentInfoId the primary key for the new health care equipment info
	 * @return the new health care equipment info
	 */
	public static HealthCareEquipmentInfo create(
		long healthCareEquipmentInfoId) {

		return getPersistence().create(healthCareEquipmentInfoId);
	}

	/**
	 * Removes the health care equipment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareEquipmentInfoId the primary key of the health care equipment info
	 * @return the health care equipment info that was removed
	 * @throws NoSuchHealthCareEquipmentInfoException if a health care equipment info with the primary key could not be found
	 */
	public static HealthCareEquipmentInfo remove(long healthCareEquipmentInfoId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareEquipmentInfoException {

		return getPersistence().remove(healthCareEquipmentInfoId);
	}

	public static HealthCareEquipmentInfo updateImpl(
		HealthCareEquipmentInfo healthCareEquipmentInfo) {

		return getPersistence().updateImpl(healthCareEquipmentInfo);
	}

	/**
	 * Returns the health care equipment info with the primary key or throws a <code>NoSuchHealthCareEquipmentInfoException</code> if it could not be found.
	 *
	 * @param healthCareEquipmentInfoId the primary key of the health care equipment info
	 * @return the health care equipment info
	 * @throws NoSuchHealthCareEquipmentInfoException if a health care equipment info with the primary key could not be found
	 */
	public static HealthCareEquipmentInfo findByPrimaryKey(
			long healthCareEquipmentInfoId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareEquipmentInfoException {

		return getPersistence().findByPrimaryKey(healthCareEquipmentInfoId);
	}

	/**
	 * Returns the health care equipment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareEquipmentInfoId the primary key of the health care equipment info
	 * @return the health care equipment info, or <code>null</code> if a health care equipment info with the primary key could not be found
	 */
	public static HealthCareEquipmentInfo fetchByPrimaryKey(
		long healthCareEquipmentInfoId) {

		return getPersistence().fetchByPrimaryKey(healthCareEquipmentInfoId);
	}

	/**
	 * Returns all the health care equipment infos.
	 *
	 * @return the health care equipment infos
	 */
	public static List<HealthCareEquipmentInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the health care equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care equipment infos
	 * @param end the upper bound of the range of health care equipment infos (not inclusive)
	 * @return the range of health care equipment infos
	 */
	public static List<HealthCareEquipmentInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the health care equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care equipment infos
	 * @param end the upper bound of the range of health care equipment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care equipment infos
	 */
	public static List<HealthCareEquipmentInfo> findAll(
		int start, int end,
		OrderByComparator<HealthCareEquipmentInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the health care equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care equipment infos
	 * @param end the upper bound of the range of health care equipment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care equipment infos
	 */
	public static List<HealthCareEquipmentInfo> findAll(
		int start, int end,
		OrderByComparator<HealthCareEquipmentInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the health care equipment infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of health care equipment infos.
	 *
	 * @return the number of health care equipment infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HealthCareEquipmentInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		HealthCareEquipmentInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile HealthCareEquipmentInfoPersistence _persistence;

}