/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.healthcare.application.form.service.model.HealthCareApplicantInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the health care applicant info service. This utility wraps <code>com.nbp.healthcare.application.form.service.service.persistence.impl.HealthCareApplicantInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicantInfoPersistence
 * @generated
 */
public class HealthCareApplicantInfoUtil {

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
		HealthCareApplicantInfo healthCareApplicantInfo) {

		getPersistence().clearCache(healthCareApplicantInfo);
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
	public static Map<Serializable, HealthCareApplicantInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HealthCareApplicantInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HealthCareApplicantInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HealthCareApplicantInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HealthCareApplicantInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HealthCareApplicantInfo update(
		HealthCareApplicantInfo healthCareApplicantInfo) {

		return getPersistence().update(healthCareApplicantInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HealthCareApplicantInfo update(
		HealthCareApplicantInfo healthCareApplicantInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(healthCareApplicantInfo, serviceContext);
	}

	/**
	 * Returns the health care applicant info where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareApplicantInfoException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care applicant info
	 * @throws NoSuchHealthCareApplicantInfoException if a matching health care applicant info could not be found
	 */
	public static HealthCareApplicantInfo findBygetHealthCareById(
			long healthCareApplicationId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareApplicantInfoException {

		return getPersistence().findBygetHealthCareById(
			healthCareApplicationId);
	}

	/**
	 * Returns the health care applicant info where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care applicant info, or <code>null</code> if a matching health care applicant info could not be found
	 */
	public static HealthCareApplicantInfo fetchBygetHealthCareById(
		long healthCareApplicationId) {

		return getPersistence().fetchBygetHealthCareById(
			healthCareApplicationId);
	}

	/**
	 * Returns the health care applicant info where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care applicant info, or <code>null</code> if a matching health care applicant info could not be found
	 */
	public static HealthCareApplicantInfo fetchBygetHealthCareById(
		long healthCareApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHealthCareById(
			healthCareApplicationId, useFinderCache);
	}

	/**
	 * Removes the health care applicant info where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care applicant info that was removed
	 */
	public static HealthCareApplicantInfo removeBygetHealthCareById(
			long healthCareApplicationId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareApplicantInfoException {

		return getPersistence().removeBygetHealthCareById(
			healthCareApplicationId);
	}

	/**
	 * Returns the number of health care applicant infos where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care applicant infos
	 */
	public static int countBygetHealthCareById(long healthCareApplicationId) {
		return getPersistence().countBygetHealthCareById(
			healthCareApplicationId);
	}

	/**
	 * Caches the health care applicant info in the entity cache if it is enabled.
	 *
	 * @param healthCareApplicantInfo the health care applicant info
	 */
	public static void cacheResult(
		HealthCareApplicantInfo healthCareApplicantInfo) {

		getPersistence().cacheResult(healthCareApplicantInfo);
	}

	/**
	 * Caches the health care applicant infos in the entity cache if it is enabled.
	 *
	 * @param healthCareApplicantInfos the health care applicant infos
	 */
	public static void cacheResult(
		List<HealthCareApplicantInfo> healthCareApplicantInfos) {

		getPersistence().cacheResult(healthCareApplicantInfos);
	}

	/**
	 * Creates a new health care applicant info with the primary key. Does not add the health care applicant info to the database.
	 *
	 * @param healthCareApplicantInfoId the primary key for the new health care applicant info
	 * @return the new health care applicant info
	 */
	public static HealthCareApplicantInfo create(
		long healthCareApplicantInfoId) {

		return getPersistence().create(healthCareApplicantInfoId);
	}

	/**
	 * Removes the health care applicant info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareApplicantInfoId the primary key of the health care applicant info
	 * @return the health care applicant info that was removed
	 * @throws NoSuchHealthCareApplicantInfoException if a health care applicant info with the primary key could not be found
	 */
	public static HealthCareApplicantInfo remove(long healthCareApplicantInfoId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareApplicantInfoException {

		return getPersistence().remove(healthCareApplicantInfoId);
	}

	public static HealthCareApplicantInfo updateImpl(
		HealthCareApplicantInfo healthCareApplicantInfo) {

		return getPersistence().updateImpl(healthCareApplicantInfo);
	}

	/**
	 * Returns the health care applicant info with the primary key or throws a <code>NoSuchHealthCareApplicantInfoException</code> if it could not be found.
	 *
	 * @param healthCareApplicantInfoId the primary key of the health care applicant info
	 * @return the health care applicant info
	 * @throws NoSuchHealthCareApplicantInfoException if a health care applicant info with the primary key could not be found
	 */
	public static HealthCareApplicantInfo findByPrimaryKey(
			long healthCareApplicantInfoId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareApplicantInfoException {

		return getPersistence().findByPrimaryKey(healthCareApplicantInfoId);
	}

	/**
	 * Returns the health care applicant info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareApplicantInfoId the primary key of the health care applicant info
	 * @return the health care applicant info, or <code>null</code> if a health care applicant info with the primary key could not be found
	 */
	public static HealthCareApplicantInfo fetchByPrimaryKey(
		long healthCareApplicantInfoId) {

		return getPersistence().fetchByPrimaryKey(healthCareApplicantInfoId);
	}

	/**
	 * Returns all the health care applicant infos.
	 *
	 * @return the health care applicant infos
	 */
	public static List<HealthCareApplicantInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the health care applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applicant infos
	 * @param end the upper bound of the range of health care applicant infos (not inclusive)
	 * @return the range of health care applicant infos
	 */
	public static List<HealthCareApplicantInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the health care applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applicant infos
	 * @param end the upper bound of the range of health care applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care applicant infos
	 */
	public static List<HealthCareApplicantInfo> findAll(
		int start, int end,
		OrderByComparator<HealthCareApplicantInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the health care applicant infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicantInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applicant infos
	 * @param end the upper bound of the range of health care applicant infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care applicant infos
	 */
	public static List<HealthCareApplicantInfo> findAll(
		int start, int end,
		OrderByComparator<HealthCareApplicantInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the health care applicant infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of health care applicant infos.
	 *
	 * @return the number of health care applicant infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HealthCareApplicantInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		HealthCareApplicantInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile HealthCareApplicantInfoPersistence _persistence;

}