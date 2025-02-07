/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.healthcare.application.form.service.model.HealthCareBussinessInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the health care bussiness info service. This utility wraps <code>com.nbp.healthcare.application.form.service.service.persistence.impl.HealthCareBussinessInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareBussinessInfoPersistence
 * @generated
 */
public class HealthCareBussinessInfoUtil {

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
		HealthCareBussinessInfo healthCareBussinessInfo) {

		getPersistence().clearCache(healthCareBussinessInfo);
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
	public static Map<Serializable, HealthCareBussinessInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HealthCareBussinessInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HealthCareBussinessInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HealthCareBussinessInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HealthCareBussinessInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HealthCareBussinessInfo update(
		HealthCareBussinessInfo healthCareBussinessInfo) {

		return getPersistence().update(healthCareBussinessInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HealthCareBussinessInfo update(
		HealthCareBussinessInfo healthCareBussinessInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(healthCareBussinessInfo, serviceContext);
	}

	/**
	 * Returns the health care bussiness info where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareBussinessInfoException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care bussiness info
	 * @throws NoSuchHealthCareBussinessInfoException if a matching health care bussiness info could not be found
	 */
	public static HealthCareBussinessInfo findBygetHealthCareByid(
			long healthCareApplicationId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareBussinessInfoException {

		return getPersistence().findBygetHealthCareByid(
			healthCareApplicationId);
	}

	/**
	 * Returns the health care bussiness info where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care bussiness info, or <code>null</code> if a matching health care bussiness info could not be found
	 */
	public static HealthCareBussinessInfo fetchBygetHealthCareByid(
		long healthCareApplicationId) {

		return getPersistence().fetchBygetHealthCareByid(
			healthCareApplicationId);
	}

	/**
	 * Returns the health care bussiness info where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care bussiness info, or <code>null</code> if a matching health care bussiness info could not be found
	 */
	public static HealthCareBussinessInfo fetchBygetHealthCareByid(
		long healthCareApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHealthCareByid(
			healthCareApplicationId, useFinderCache);
	}

	/**
	 * Removes the health care bussiness info where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care bussiness info that was removed
	 */
	public static HealthCareBussinessInfo removeBygetHealthCareByid(
			long healthCareApplicationId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareBussinessInfoException {

		return getPersistence().removeBygetHealthCareByid(
			healthCareApplicationId);
	}

	/**
	 * Returns the number of health care bussiness infos where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care bussiness infos
	 */
	public static int countBygetHealthCareByid(long healthCareApplicationId) {
		return getPersistence().countBygetHealthCareByid(
			healthCareApplicationId);
	}

	/**
	 * Caches the health care bussiness info in the entity cache if it is enabled.
	 *
	 * @param healthCareBussinessInfo the health care bussiness info
	 */
	public static void cacheResult(
		HealthCareBussinessInfo healthCareBussinessInfo) {

		getPersistence().cacheResult(healthCareBussinessInfo);
	}

	/**
	 * Caches the health care bussiness infos in the entity cache if it is enabled.
	 *
	 * @param healthCareBussinessInfos the health care bussiness infos
	 */
	public static void cacheResult(
		List<HealthCareBussinessInfo> healthCareBussinessInfos) {

		getPersistence().cacheResult(healthCareBussinessInfos);
	}

	/**
	 * Creates a new health care bussiness info with the primary key. Does not add the health care bussiness info to the database.
	 *
	 * @param healthCareBussinessInfoId the primary key for the new health care bussiness info
	 * @return the new health care bussiness info
	 */
	public static HealthCareBussinessInfo create(
		long healthCareBussinessInfoId) {

		return getPersistence().create(healthCareBussinessInfoId);
	}

	/**
	 * Removes the health care bussiness info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareBussinessInfoId the primary key of the health care bussiness info
	 * @return the health care bussiness info that was removed
	 * @throws NoSuchHealthCareBussinessInfoException if a health care bussiness info with the primary key could not be found
	 */
	public static HealthCareBussinessInfo remove(long healthCareBussinessInfoId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareBussinessInfoException {

		return getPersistence().remove(healthCareBussinessInfoId);
	}

	public static HealthCareBussinessInfo updateImpl(
		HealthCareBussinessInfo healthCareBussinessInfo) {

		return getPersistence().updateImpl(healthCareBussinessInfo);
	}

	/**
	 * Returns the health care bussiness info with the primary key or throws a <code>NoSuchHealthCareBussinessInfoException</code> if it could not be found.
	 *
	 * @param healthCareBussinessInfoId the primary key of the health care bussiness info
	 * @return the health care bussiness info
	 * @throws NoSuchHealthCareBussinessInfoException if a health care bussiness info with the primary key could not be found
	 */
	public static HealthCareBussinessInfo findByPrimaryKey(
			long healthCareBussinessInfoId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareBussinessInfoException {

		return getPersistence().findByPrimaryKey(healthCareBussinessInfoId);
	}

	/**
	 * Returns the health care bussiness info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareBussinessInfoId the primary key of the health care bussiness info
	 * @return the health care bussiness info, or <code>null</code> if a health care bussiness info with the primary key could not be found
	 */
	public static HealthCareBussinessInfo fetchByPrimaryKey(
		long healthCareBussinessInfoId) {

		return getPersistence().fetchByPrimaryKey(healthCareBussinessInfoId);
	}

	/**
	 * Returns all the health care bussiness infos.
	 *
	 * @return the health care bussiness infos
	 */
	public static List<HealthCareBussinessInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the health care bussiness infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareBussinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care bussiness infos
	 * @param end the upper bound of the range of health care bussiness infos (not inclusive)
	 * @return the range of health care bussiness infos
	 */
	public static List<HealthCareBussinessInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the health care bussiness infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareBussinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care bussiness infos
	 * @param end the upper bound of the range of health care bussiness infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care bussiness infos
	 */
	public static List<HealthCareBussinessInfo> findAll(
		int start, int end,
		OrderByComparator<HealthCareBussinessInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the health care bussiness infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareBussinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care bussiness infos
	 * @param end the upper bound of the range of health care bussiness infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care bussiness infos
	 */
	public static List<HealthCareBussinessInfo> findAll(
		int start, int end,
		OrderByComparator<HealthCareBussinessInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the health care bussiness infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of health care bussiness infos.
	 *
	 * @return the number of health care bussiness infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HealthCareBussinessInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		HealthCareBussinessInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile HealthCareBussinessInfoPersistence _persistence;

}