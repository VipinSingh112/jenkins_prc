/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeOperatorDetail;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the fire brigade operator detail service. This utility wraps <code>com.nbp.fire.brigade.application.form.service.service.persistence.impl.FireBrigadeOperatorDetailPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeOperatorDetailPersistence
 * @generated
 */
public class FireBrigadeOperatorDetailUtil {

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
		FireBrigadeOperatorDetail fireBrigadeOperatorDetail) {

		getPersistence().clearCache(fireBrigadeOperatorDetail);
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
	public static Map<Serializable, FireBrigadeOperatorDetail>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FireBrigadeOperatorDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FireBrigadeOperatorDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FireBrigadeOperatorDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FireBrigadeOperatorDetail> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FireBrigadeOperatorDetail update(
		FireBrigadeOperatorDetail fireBrigadeOperatorDetail) {

		return getPersistence().update(fireBrigadeOperatorDetail);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FireBrigadeOperatorDetail update(
		FireBrigadeOperatorDetail fireBrigadeOperatorDetail,
		ServiceContext serviceContext) {

		return getPersistence().update(
			fireBrigadeOperatorDetail, serviceContext);
	}

	/**
	 * Returns the fire brigade operator detail where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeOperatorDetailException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade operator detail
	 * @throws NoSuchFireBrigadeOperatorDetailException if a matching fire brigade operator detail could not be found
	 */
	public static FireBrigadeOperatorDetail findBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeOperatorDetailException {

		return getPersistence().findBygetFireBrigadeByAppId(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade operator detail where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade operator detail, or <code>null</code> if a matching fire brigade operator detail could not be found
	 */
	public static FireBrigadeOperatorDetail fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId) {

		return getPersistence().fetchBygetFireBrigadeByAppId(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade operator detail where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade operator detail, or <code>null</code> if a matching fire brigade operator detail could not be found
	 */
	public static FireBrigadeOperatorDetail fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetFireBrigadeByAppId(
			fireBrigadeApplicationId, useFinderCache);
	}

	/**
	 * Removes the fire brigade operator detail where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade operator detail that was removed
	 */
	public static FireBrigadeOperatorDetail removeBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeOperatorDetailException {

		return getPersistence().removeBygetFireBrigadeByAppId(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the number of fire brigade operator details where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade operator details
	 */
	public static int countBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId) {

		return getPersistence().countBygetFireBrigadeByAppId(
			fireBrigadeApplicationId);
	}

	/**
	 * Caches the fire brigade operator detail in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeOperatorDetail the fire brigade operator detail
	 */
	public static void cacheResult(
		FireBrigadeOperatorDetail fireBrigadeOperatorDetail) {

		getPersistence().cacheResult(fireBrigadeOperatorDetail);
	}

	/**
	 * Caches the fire brigade operator details in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeOperatorDetails the fire brigade operator details
	 */
	public static void cacheResult(
		List<FireBrigadeOperatorDetail> fireBrigadeOperatorDetails) {

		getPersistence().cacheResult(fireBrigadeOperatorDetails);
	}

	/**
	 * Creates a new fire brigade operator detail with the primary key. Does not add the fire brigade operator detail to the database.
	 *
	 * @param fireBrigadeOperatorDetailId the primary key for the new fire brigade operator detail
	 * @return the new fire brigade operator detail
	 */
	public static FireBrigadeOperatorDetail create(
		long fireBrigadeOperatorDetailId) {

		return getPersistence().create(fireBrigadeOperatorDetailId);
	}

	/**
	 * Removes the fire brigade operator detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeOperatorDetailId the primary key of the fire brigade operator detail
	 * @return the fire brigade operator detail that was removed
	 * @throws NoSuchFireBrigadeOperatorDetailException if a fire brigade operator detail with the primary key could not be found
	 */
	public static FireBrigadeOperatorDetail remove(
			long fireBrigadeOperatorDetailId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeOperatorDetailException {

		return getPersistence().remove(fireBrigadeOperatorDetailId);
	}

	public static FireBrigadeOperatorDetail updateImpl(
		FireBrigadeOperatorDetail fireBrigadeOperatorDetail) {

		return getPersistence().updateImpl(fireBrigadeOperatorDetail);
	}

	/**
	 * Returns the fire brigade operator detail with the primary key or throws a <code>NoSuchFireBrigadeOperatorDetailException</code> if it could not be found.
	 *
	 * @param fireBrigadeOperatorDetailId the primary key of the fire brigade operator detail
	 * @return the fire brigade operator detail
	 * @throws NoSuchFireBrigadeOperatorDetailException if a fire brigade operator detail with the primary key could not be found
	 */
	public static FireBrigadeOperatorDetail findByPrimaryKey(
			long fireBrigadeOperatorDetailId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeOperatorDetailException {

		return getPersistence().findByPrimaryKey(fireBrigadeOperatorDetailId);
	}

	/**
	 * Returns the fire brigade operator detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeOperatorDetailId the primary key of the fire brigade operator detail
	 * @return the fire brigade operator detail, or <code>null</code> if a fire brigade operator detail with the primary key could not be found
	 */
	public static FireBrigadeOperatorDetail fetchByPrimaryKey(
		long fireBrigadeOperatorDetailId) {

		return getPersistence().fetchByPrimaryKey(fireBrigadeOperatorDetailId);
	}

	/**
	 * Returns all the fire brigade operator details.
	 *
	 * @return the fire brigade operator details
	 */
	public static List<FireBrigadeOperatorDetail> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the fire brigade operator details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeOperatorDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade operator details
	 * @param end the upper bound of the range of fire brigade operator details (not inclusive)
	 * @return the range of fire brigade operator details
	 */
	public static List<FireBrigadeOperatorDetail> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade operator details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeOperatorDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade operator details
	 * @param end the upper bound of the range of fire brigade operator details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade operator details
	 */
	public static List<FireBrigadeOperatorDetail> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeOperatorDetail> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade operator details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeOperatorDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade operator details
	 * @param end the upper bound of the range of fire brigade operator details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade operator details
	 */
	public static List<FireBrigadeOperatorDetail> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeOperatorDetail> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the fire brigade operator details from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of fire brigade operator details.
	 *
	 * @return the number of fire brigade operator details
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FireBrigadeOperatorDetailPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FireBrigadeOperatorDetailPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FireBrigadeOperatorDetailPersistence _persistence;

}