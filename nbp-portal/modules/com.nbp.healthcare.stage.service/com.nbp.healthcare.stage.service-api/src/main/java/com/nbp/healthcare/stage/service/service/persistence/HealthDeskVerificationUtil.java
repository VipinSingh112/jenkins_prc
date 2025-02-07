/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.healthcare.stage.service.model.HealthDeskVerification;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the health desk verification service. This utility wraps <code>com.nbp.healthcare.stage.service.service.persistence.impl.HealthDeskVerificationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthDeskVerificationPersistence
 * @generated
 */
public class HealthDeskVerificationUtil {

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
		HealthDeskVerification healthDeskVerification) {

		getPersistence().clearCache(healthDeskVerification);
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
	public static Map<Serializable, HealthDeskVerification> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HealthDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HealthDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HealthDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HealthDeskVerification> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HealthDeskVerification update(
		HealthDeskVerification healthDeskVerification) {

		return getPersistence().update(healthDeskVerification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HealthDeskVerification update(
		HealthDeskVerification healthDeskVerification,
		ServiceContext serviceContext) {

		return getPersistence().update(healthDeskVerification, serviceContext);
	}

	/**
	 * Returns all the health desk verifications where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health desk verifications
	 */
	public static List<HealthDeskVerification>
		findBygetDeskVerificationHealthById(long healthCareApplicationId) {

		return getPersistence().findBygetDeskVerificationHealthById(
			healthCareApplicationId);
	}

	/**
	 * Returns a range of all the health desk verifications where healthCareApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param start the lower bound of the range of health desk verifications
	 * @param end the upper bound of the range of health desk verifications (not inclusive)
	 * @return the range of matching health desk verifications
	 */
	public static List<HealthDeskVerification>
		findBygetDeskVerificationHealthById(
			long healthCareApplicationId, int start, int end) {

		return getPersistence().findBygetDeskVerificationHealthById(
			healthCareApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the health desk verifications where healthCareApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param start the lower bound of the range of health desk verifications
	 * @param end the upper bound of the range of health desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health desk verifications
	 */
	public static List<HealthDeskVerification>
		findBygetDeskVerificationHealthById(
			long healthCareApplicationId, int start, int end,
			OrderByComparator<HealthDeskVerification> orderByComparator) {

		return getPersistence().findBygetDeskVerificationHealthById(
			healthCareApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the health desk verifications where healthCareApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param start the lower bound of the range of health desk verifications
	 * @param end the upper bound of the range of health desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health desk verifications
	 */
	public static List<HealthDeskVerification>
		findBygetDeskVerificationHealthById(
			long healthCareApplicationId, int start, int end,
			OrderByComparator<HealthDeskVerification> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetDeskVerificationHealthById(
			healthCareApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first health desk verification in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health desk verification
	 * @throws NoSuchHealthDeskVerificationException if a matching health desk verification could not be found
	 */
	public static HealthDeskVerification
			findBygetDeskVerificationHealthById_First(
				long healthCareApplicationId,
				OrderByComparator<HealthDeskVerification> orderByComparator)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthDeskVerificationException {

		return getPersistence().findBygetDeskVerificationHealthById_First(
			healthCareApplicationId, orderByComparator);
	}

	/**
	 * Returns the first health desk verification in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health desk verification, or <code>null</code> if a matching health desk verification could not be found
	 */
	public static HealthDeskVerification
		fetchBygetDeskVerificationHealthById_First(
			long healthCareApplicationId,
			OrderByComparator<HealthDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetDeskVerificationHealthById_First(
			healthCareApplicationId, orderByComparator);
	}

	/**
	 * Returns the last health desk verification in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health desk verification
	 * @throws NoSuchHealthDeskVerificationException if a matching health desk verification could not be found
	 */
	public static HealthDeskVerification
			findBygetDeskVerificationHealthById_Last(
				long healthCareApplicationId,
				OrderByComparator<HealthDeskVerification> orderByComparator)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthDeskVerificationException {

		return getPersistence().findBygetDeskVerificationHealthById_Last(
			healthCareApplicationId, orderByComparator);
	}

	/**
	 * Returns the last health desk verification in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health desk verification, or <code>null</code> if a matching health desk verification could not be found
	 */
	public static HealthDeskVerification
		fetchBygetDeskVerificationHealthById_Last(
			long healthCareApplicationId,
			OrderByComparator<HealthDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetDeskVerificationHealthById_Last(
			healthCareApplicationId, orderByComparator);
	}

	/**
	 * Returns the health desk verifications before and after the current health desk verification in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthDeskVerificationId the primary key of the current health desk verification
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health desk verification
	 * @throws NoSuchHealthDeskVerificationException if a health desk verification with the primary key could not be found
	 */
	public static HealthDeskVerification[]
			findBygetDeskVerificationHealthById_PrevAndNext(
				long healthDeskVerificationId, long healthCareApplicationId,
				OrderByComparator<HealthDeskVerification> orderByComparator)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthDeskVerificationException {

		return getPersistence().findBygetDeskVerificationHealthById_PrevAndNext(
			healthDeskVerificationId, healthCareApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the health desk verifications where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 */
	public static void removeBygetDeskVerificationHealthById(
		long healthCareApplicationId) {

		getPersistence().removeBygetDeskVerificationHealthById(
			healthCareApplicationId);
	}

	/**
	 * Returns the number of health desk verifications where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health desk verifications
	 */
	public static int countBygetDeskVerificationHealthById(
		long healthCareApplicationId) {

		return getPersistence().countBygetDeskVerificationHealthById(
			healthCareApplicationId);
	}

	/**
	 * Caches the health desk verification in the entity cache if it is enabled.
	 *
	 * @param healthDeskVerification the health desk verification
	 */
	public static void cacheResult(
		HealthDeskVerification healthDeskVerification) {

		getPersistence().cacheResult(healthDeskVerification);
	}

	/**
	 * Caches the health desk verifications in the entity cache if it is enabled.
	 *
	 * @param healthDeskVerifications the health desk verifications
	 */
	public static void cacheResult(
		List<HealthDeskVerification> healthDeskVerifications) {

		getPersistence().cacheResult(healthDeskVerifications);
	}

	/**
	 * Creates a new health desk verification with the primary key. Does not add the health desk verification to the database.
	 *
	 * @param healthDeskVerificationId the primary key for the new health desk verification
	 * @return the new health desk verification
	 */
	public static HealthDeskVerification create(long healthDeskVerificationId) {
		return getPersistence().create(healthDeskVerificationId);
	}

	/**
	 * Removes the health desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthDeskVerificationId the primary key of the health desk verification
	 * @return the health desk verification that was removed
	 * @throws NoSuchHealthDeskVerificationException if a health desk verification with the primary key could not be found
	 */
	public static HealthDeskVerification remove(long healthDeskVerificationId)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthDeskVerificationException {

		return getPersistence().remove(healthDeskVerificationId);
	}

	public static HealthDeskVerification updateImpl(
		HealthDeskVerification healthDeskVerification) {

		return getPersistence().updateImpl(healthDeskVerification);
	}

	/**
	 * Returns the health desk verification with the primary key or throws a <code>NoSuchHealthDeskVerificationException</code> if it could not be found.
	 *
	 * @param healthDeskVerificationId the primary key of the health desk verification
	 * @return the health desk verification
	 * @throws NoSuchHealthDeskVerificationException if a health desk verification with the primary key could not be found
	 */
	public static HealthDeskVerification findByPrimaryKey(
			long healthDeskVerificationId)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthDeskVerificationException {

		return getPersistence().findByPrimaryKey(healthDeskVerificationId);
	}

	/**
	 * Returns the health desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthDeskVerificationId the primary key of the health desk verification
	 * @return the health desk verification, or <code>null</code> if a health desk verification with the primary key could not be found
	 */
	public static HealthDeskVerification fetchByPrimaryKey(
		long healthDeskVerificationId) {

		return getPersistence().fetchByPrimaryKey(healthDeskVerificationId);
	}

	/**
	 * Returns all the health desk verifications.
	 *
	 * @return the health desk verifications
	 */
	public static List<HealthDeskVerification> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the health desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health desk verifications
	 * @param end the upper bound of the range of health desk verifications (not inclusive)
	 * @return the range of health desk verifications
	 */
	public static List<HealthDeskVerification> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the health desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health desk verifications
	 * @param end the upper bound of the range of health desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health desk verifications
	 */
	public static List<HealthDeskVerification> findAll(
		int start, int end,
		OrderByComparator<HealthDeskVerification> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the health desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health desk verifications
	 * @param end the upper bound of the range of health desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health desk verifications
	 */
	public static List<HealthDeskVerification> findAll(
		int start, int end,
		OrderByComparator<HealthDeskVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the health desk verifications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of health desk verifications.
	 *
	 * @return the number of health desk verifications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HealthDeskVerificationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		HealthDeskVerificationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile HealthDeskVerificationPersistence _persistence;

}