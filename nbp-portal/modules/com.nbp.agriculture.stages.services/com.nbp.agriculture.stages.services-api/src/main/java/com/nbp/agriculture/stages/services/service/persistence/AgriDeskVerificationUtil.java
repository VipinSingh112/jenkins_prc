/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.agriculture.stages.services.model.AgriDeskVerification;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the agri desk verification service. This utility wraps <code>com.nbp.agriculture.stages.services.service.persistence.impl.AgriDeskVerificationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgriDeskVerificationPersistence
 * @generated
 */
public class AgriDeskVerificationUtil {

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
	public static void clearCache(AgriDeskVerification agriDeskVerification) {
		getPersistence().clearCache(agriDeskVerification);
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
	public static Map<Serializable, AgriDeskVerification> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AgriDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AgriDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AgriDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AgriDeskVerification> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AgriDeskVerification update(
		AgriDeskVerification agriDeskVerification) {

		return getPersistence().update(agriDeskVerification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AgriDeskVerification update(
		AgriDeskVerification agriDeskVerification,
		ServiceContext serviceContext) {

		return getPersistence().update(agriDeskVerification, serviceContext);
	}

	/**
	 * Returns all the agri desk verifications where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agri desk verifications
	 */
	public static List<AgriDeskVerification> findBygetDeskVerificationAgri_ById(
		long agricultureApplicationId) {

		return getPersistence().findBygetDeskVerificationAgri_ById(
			agricultureApplicationId);
	}

	/**
	 * Returns a range of all the agri desk verifications where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agri desk verifications
	 * @param end the upper bound of the range of agri desk verifications (not inclusive)
	 * @return the range of matching agri desk verifications
	 */
	public static List<AgriDeskVerification> findBygetDeskVerificationAgri_ById(
		long agricultureApplicationId, int start, int end) {

		return getPersistence().findBygetDeskVerificationAgri_ById(
			agricultureApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the agri desk verifications where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agri desk verifications
	 * @param end the upper bound of the range of agri desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agri desk verifications
	 */
	public static List<AgriDeskVerification> findBygetDeskVerificationAgri_ById(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgriDeskVerification> orderByComparator) {

		return getPersistence().findBygetDeskVerificationAgri_ById(
			agricultureApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agri desk verifications where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agri desk verifications
	 * @param end the upper bound of the range of agri desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agri desk verifications
	 */
	public static List<AgriDeskVerification> findBygetDeskVerificationAgri_ById(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgriDeskVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetDeskVerificationAgri_ById(
			agricultureApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first agri desk verification in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agri desk verification
	 * @throws NoSuchAgriDeskVerificationException if a matching agri desk verification could not be found
	 */
	public static AgriDeskVerification findBygetDeskVerificationAgri_ById_First(
			long agricultureApplicationId,
			OrderByComparator<AgriDeskVerification> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgriDeskVerificationException {

		return getPersistence().findBygetDeskVerificationAgri_ById_First(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the first agri desk verification in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agri desk verification, or <code>null</code> if a matching agri desk verification could not be found
	 */
	public static AgriDeskVerification
		fetchBygetDeskVerificationAgri_ById_First(
			long agricultureApplicationId,
			OrderByComparator<AgriDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetDeskVerificationAgri_ById_First(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agri desk verification in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agri desk verification
	 * @throws NoSuchAgriDeskVerificationException if a matching agri desk verification could not be found
	 */
	public static AgriDeskVerification findBygetDeskVerificationAgri_ById_Last(
			long agricultureApplicationId,
			OrderByComparator<AgriDeskVerification> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgriDeskVerificationException {

		return getPersistence().findBygetDeskVerificationAgri_ById_Last(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agri desk verification in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agri desk verification, or <code>null</code> if a matching agri desk verification could not be found
	 */
	public static AgriDeskVerification fetchBygetDeskVerificationAgri_ById_Last(
		long agricultureApplicationId,
		OrderByComparator<AgriDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetDeskVerificationAgri_ById_Last(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the agri desk verifications before and after the current agri desk verification in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agriDeskVerificationId the primary key of the current agri desk verification
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agri desk verification
	 * @throws NoSuchAgriDeskVerificationException if a agri desk verification with the primary key could not be found
	 */
	public static AgriDeskVerification[]
			findBygetDeskVerificationAgri_ById_PrevAndNext(
				long agriDeskVerificationId, long agricultureApplicationId,
				OrderByComparator<AgriDeskVerification> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgriDeskVerificationException {

		return getPersistence().findBygetDeskVerificationAgri_ById_PrevAndNext(
			agriDeskVerificationId, agricultureApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the agri desk verifications where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	public static void removeBygetDeskVerificationAgri_ById(
		long agricultureApplicationId) {

		getPersistence().removeBygetDeskVerificationAgri_ById(
			agricultureApplicationId);
	}

	/**
	 * Returns the number of agri desk verifications where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agri desk verifications
	 */
	public static int countBygetDeskVerificationAgri_ById(
		long agricultureApplicationId) {

		return getPersistence().countBygetDeskVerificationAgri_ById(
			agricultureApplicationId);
	}

	/**
	 * Caches the agri desk verification in the entity cache if it is enabled.
	 *
	 * @param agriDeskVerification the agri desk verification
	 */
	public static void cacheResult(AgriDeskVerification agriDeskVerification) {
		getPersistence().cacheResult(agriDeskVerification);
	}

	/**
	 * Caches the agri desk verifications in the entity cache if it is enabled.
	 *
	 * @param agriDeskVerifications the agri desk verifications
	 */
	public static void cacheResult(
		List<AgriDeskVerification> agriDeskVerifications) {

		getPersistence().cacheResult(agriDeskVerifications);
	}

	/**
	 * Creates a new agri desk verification with the primary key. Does not add the agri desk verification to the database.
	 *
	 * @param agriDeskVerificationId the primary key for the new agri desk verification
	 * @return the new agri desk verification
	 */
	public static AgriDeskVerification create(long agriDeskVerificationId) {
		return getPersistence().create(agriDeskVerificationId);
	}

	/**
	 * Removes the agri desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agriDeskVerificationId the primary key of the agri desk verification
	 * @return the agri desk verification that was removed
	 * @throws NoSuchAgriDeskVerificationException if a agri desk verification with the primary key could not be found
	 */
	public static AgriDeskVerification remove(long agriDeskVerificationId)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgriDeskVerificationException {

		return getPersistence().remove(agriDeskVerificationId);
	}

	public static AgriDeskVerification updateImpl(
		AgriDeskVerification agriDeskVerification) {

		return getPersistence().updateImpl(agriDeskVerification);
	}

	/**
	 * Returns the agri desk verification with the primary key or throws a <code>NoSuchAgriDeskVerificationException</code> if it could not be found.
	 *
	 * @param agriDeskVerificationId the primary key of the agri desk verification
	 * @return the agri desk verification
	 * @throws NoSuchAgriDeskVerificationException if a agri desk verification with the primary key could not be found
	 */
	public static AgriDeskVerification findByPrimaryKey(
			long agriDeskVerificationId)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgriDeskVerificationException {

		return getPersistence().findByPrimaryKey(agriDeskVerificationId);
	}

	/**
	 * Returns the agri desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agriDeskVerificationId the primary key of the agri desk verification
	 * @return the agri desk verification, or <code>null</code> if a agri desk verification with the primary key could not be found
	 */
	public static AgriDeskVerification fetchByPrimaryKey(
		long agriDeskVerificationId) {

		return getPersistence().fetchByPrimaryKey(agriDeskVerificationId);
	}

	/**
	 * Returns all the agri desk verifications.
	 *
	 * @return the agri desk verifications
	 */
	public static List<AgriDeskVerification> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the agri desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agri desk verifications
	 * @param end the upper bound of the range of agri desk verifications (not inclusive)
	 * @return the range of agri desk verifications
	 */
	public static List<AgriDeskVerification> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the agri desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agri desk verifications
	 * @param end the upper bound of the range of agri desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agri desk verifications
	 */
	public static List<AgriDeskVerification> findAll(
		int start, int end,
		OrderByComparator<AgriDeskVerification> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agri desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agri desk verifications
	 * @param end the upper bound of the range of agri desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agri desk verifications
	 */
	public static List<AgriDeskVerification> findAll(
		int start, int end,
		OrderByComparator<AgriDeskVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the agri desk verifications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of agri desk verifications.
	 *
	 * @return the number of agri desk verifications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AgriDeskVerificationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AgriDeskVerificationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AgriDeskVerificationPersistence _persistence;

}