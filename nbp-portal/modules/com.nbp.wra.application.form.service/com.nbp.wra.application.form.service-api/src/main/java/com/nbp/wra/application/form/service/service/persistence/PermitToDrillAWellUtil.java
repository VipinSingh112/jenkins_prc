/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.wra.application.form.service.model.PermitToDrillAWell;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the permit to drill a well service. This utility wraps <code>com.nbp.wra.application.form.service.service.persistence.impl.PermitToDrillAWellPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PermitToDrillAWellPersistence
 * @generated
 */
public class PermitToDrillAWellUtil {

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
	public static void clearCache(PermitToDrillAWell permitToDrillAWell) {
		getPersistence().clearCache(permitToDrillAWell);
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
	public static Map<Serializable, PermitToDrillAWell> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PermitToDrillAWell> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PermitToDrillAWell> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PermitToDrillAWell> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PermitToDrillAWell> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PermitToDrillAWell update(
		PermitToDrillAWell permitToDrillAWell) {

		return getPersistence().update(permitToDrillAWell);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PermitToDrillAWell update(
		PermitToDrillAWell permitToDrillAWell, ServiceContext serviceContext) {

		return getPersistence().update(permitToDrillAWell, serviceContext);
	}

	/**
	 * Returns the permit to drill a well where wraApplicationId = &#63; or throws a <code>NoSuchPermitToDrillAWellException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching permit to drill a well
	 * @throws NoSuchPermitToDrillAWellException if a matching permit to drill a well could not be found
	 */
	public static PermitToDrillAWell findBygetWRA_By_Id(long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchPermitToDrillAWellException {

		return getPersistence().findBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Returns the permit to drill a well where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching permit to drill a well, or <code>null</code> if a matching permit to drill a well could not be found
	 */
	public static PermitToDrillAWell fetchBygetWRA_By_Id(
		long wraApplicationId) {

		return getPersistence().fetchBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Returns the permit to drill a well where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching permit to drill a well, or <code>null</code> if a matching permit to drill a well could not be found
	 */
	public static PermitToDrillAWell fetchBygetWRA_By_Id(
		long wraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetWRA_By_Id(
			wraApplicationId, useFinderCache);
	}

	/**
	 * Removes the permit to drill a well where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the permit to drill a well that was removed
	 */
	public static PermitToDrillAWell removeBygetWRA_By_Id(long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchPermitToDrillAWellException {

		return getPersistence().removeBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Returns the number of permit to drill a wells where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching permit to drill a wells
	 */
	public static int countBygetWRA_By_Id(long wraApplicationId) {
		return getPersistence().countBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Caches the permit to drill a well in the entity cache if it is enabled.
	 *
	 * @param permitToDrillAWell the permit to drill a well
	 */
	public static void cacheResult(PermitToDrillAWell permitToDrillAWell) {
		getPersistence().cacheResult(permitToDrillAWell);
	}

	/**
	 * Caches the permit to drill a wells in the entity cache if it is enabled.
	 *
	 * @param permitToDrillAWells the permit to drill a wells
	 */
	public static void cacheResult(
		List<PermitToDrillAWell> permitToDrillAWells) {

		getPersistence().cacheResult(permitToDrillAWells);
	}

	/**
	 * Creates a new permit to drill a well with the primary key. Does not add the permit to drill a well to the database.
	 *
	 * @param drillAWellApplicationId the primary key for the new permit to drill a well
	 * @return the new permit to drill a well
	 */
	public static PermitToDrillAWell create(long drillAWellApplicationId) {
		return getPersistence().create(drillAWellApplicationId);
	}

	/**
	 * Removes the permit to drill a well with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param drillAWellApplicationId the primary key of the permit to drill a well
	 * @return the permit to drill a well that was removed
	 * @throws NoSuchPermitToDrillAWellException if a permit to drill a well with the primary key could not be found
	 */
	public static PermitToDrillAWell remove(long drillAWellApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchPermitToDrillAWellException {

		return getPersistence().remove(drillAWellApplicationId);
	}

	public static PermitToDrillAWell updateImpl(
		PermitToDrillAWell permitToDrillAWell) {

		return getPersistence().updateImpl(permitToDrillAWell);
	}

	/**
	 * Returns the permit to drill a well with the primary key or throws a <code>NoSuchPermitToDrillAWellException</code> if it could not be found.
	 *
	 * @param drillAWellApplicationId the primary key of the permit to drill a well
	 * @return the permit to drill a well
	 * @throws NoSuchPermitToDrillAWellException if a permit to drill a well with the primary key could not be found
	 */
	public static PermitToDrillAWell findByPrimaryKey(
			long drillAWellApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchPermitToDrillAWellException {

		return getPersistence().findByPrimaryKey(drillAWellApplicationId);
	}

	/**
	 * Returns the permit to drill a well with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param drillAWellApplicationId the primary key of the permit to drill a well
	 * @return the permit to drill a well, or <code>null</code> if a permit to drill a well with the primary key could not be found
	 */
	public static PermitToDrillAWell fetchByPrimaryKey(
		long drillAWellApplicationId) {

		return getPersistence().fetchByPrimaryKey(drillAWellApplicationId);
	}

	/**
	 * Returns all the permit to drill a wells.
	 *
	 * @return the permit to drill a wells
	 */
	public static List<PermitToDrillAWell> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the permit to drill a wells.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PermitToDrillAWellModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of permit to drill a wells
	 * @param end the upper bound of the range of permit to drill a wells (not inclusive)
	 * @return the range of permit to drill a wells
	 */
	public static List<PermitToDrillAWell> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the permit to drill a wells.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PermitToDrillAWellModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of permit to drill a wells
	 * @param end the upper bound of the range of permit to drill a wells (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of permit to drill a wells
	 */
	public static List<PermitToDrillAWell> findAll(
		int start, int end,
		OrderByComparator<PermitToDrillAWell> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the permit to drill a wells.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PermitToDrillAWellModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of permit to drill a wells
	 * @param end the upper bound of the range of permit to drill a wells (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of permit to drill a wells
	 */
	public static List<PermitToDrillAWell> findAll(
		int start, int end,
		OrderByComparator<PermitToDrillAWell> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the permit to drill a wells from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of permit to drill a wells.
	 *
	 * @return the number of permit to drill a wells
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PermitToDrillAWellPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		PermitToDrillAWellPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile PermitToDrillAWellPersistence _persistence;

}