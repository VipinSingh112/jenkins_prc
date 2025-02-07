/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.wra.application.form.service.model.RenewLicAbstractAndWater;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the renew lic abstract and water service. This utility wraps <code>com.nbp.wra.application.form.service.service.persistence.impl.RenewLicAbstractAndWaterPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RenewLicAbstractAndWaterPersistence
 * @generated
 */
public class RenewLicAbstractAndWaterUtil {

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
		RenewLicAbstractAndWater renewLicAbstractAndWater) {

		getPersistence().clearCache(renewLicAbstractAndWater);
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
	public static Map<Serializable, RenewLicAbstractAndWater>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<RenewLicAbstractAndWater> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RenewLicAbstractAndWater> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RenewLicAbstractAndWater> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RenewLicAbstractAndWater> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RenewLicAbstractAndWater update(
		RenewLicAbstractAndWater renewLicAbstractAndWater) {

		return getPersistence().update(renewLicAbstractAndWater);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RenewLicAbstractAndWater update(
		RenewLicAbstractAndWater renewLicAbstractAndWater,
		ServiceContext serviceContext) {

		return getPersistence().update(
			renewLicAbstractAndWater, serviceContext);
	}

	/**
	 * Returns the renew lic abstract and water where wraApplicationId = &#63; or throws a <code>NoSuchRenewLicAbstractAndWaterException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching renew lic abstract and water
	 * @throws NoSuchRenewLicAbstractAndWaterException if a matching renew lic abstract and water could not be found
	 */
	public static RenewLicAbstractAndWater findBygetWRA_By_Id(
			long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchRenewLicAbstractAndWaterException {

		return getPersistence().findBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Returns the renew lic abstract and water where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching renew lic abstract and water, or <code>null</code> if a matching renew lic abstract and water could not be found
	 */
	public static RenewLicAbstractAndWater fetchBygetWRA_By_Id(
		long wraApplicationId) {

		return getPersistence().fetchBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Returns the renew lic abstract and water where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching renew lic abstract and water, or <code>null</code> if a matching renew lic abstract and water could not be found
	 */
	public static RenewLicAbstractAndWater fetchBygetWRA_By_Id(
		long wraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetWRA_By_Id(
			wraApplicationId, useFinderCache);
	}

	/**
	 * Removes the renew lic abstract and water where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the renew lic abstract and water that was removed
	 */
	public static RenewLicAbstractAndWater removeBygetWRA_By_Id(
			long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchRenewLicAbstractAndWaterException {

		return getPersistence().removeBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Returns the number of renew lic abstract and waters where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching renew lic abstract and waters
	 */
	public static int countBygetWRA_By_Id(long wraApplicationId) {
		return getPersistence().countBygetWRA_By_Id(wraApplicationId);
	}

	/**
	 * Caches the renew lic abstract and water in the entity cache if it is enabled.
	 *
	 * @param renewLicAbstractAndWater the renew lic abstract and water
	 */
	public static void cacheResult(
		RenewLicAbstractAndWater renewLicAbstractAndWater) {

		getPersistence().cacheResult(renewLicAbstractAndWater);
	}

	/**
	 * Caches the renew lic abstract and waters in the entity cache if it is enabled.
	 *
	 * @param renewLicAbstractAndWaters the renew lic abstract and waters
	 */
	public static void cacheResult(
		List<RenewLicAbstractAndWater> renewLicAbstractAndWaters) {

		getPersistence().cacheResult(renewLicAbstractAndWaters);
	}

	/**
	 * Creates a new renew lic abstract and water with the primary key. Does not add the renew lic abstract and water to the database.
	 *
	 * @param renewLicAbstractAndWaterId the primary key for the new renew lic abstract and water
	 * @return the new renew lic abstract and water
	 */
	public static RenewLicAbstractAndWater create(
		long renewLicAbstractAndWaterId) {

		return getPersistence().create(renewLicAbstractAndWaterId);
	}

	/**
	 * Removes the renew lic abstract and water with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param renewLicAbstractAndWaterId the primary key of the renew lic abstract and water
	 * @return the renew lic abstract and water that was removed
	 * @throws NoSuchRenewLicAbstractAndWaterException if a renew lic abstract and water with the primary key could not be found
	 */
	public static RenewLicAbstractAndWater remove(
			long renewLicAbstractAndWaterId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchRenewLicAbstractAndWaterException {

		return getPersistence().remove(renewLicAbstractAndWaterId);
	}

	public static RenewLicAbstractAndWater updateImpl(
		RenewLicAbstractAndWater renewLicAbstractAndWater) {

		return getPersistence().updateImpl(renewLicAbstractAndWater);
	}

	/**
	 * Returns the renew lic abstract and water with the primary key or throws a <code>NoSuchRenewLicAbstractAndWaterException</code> if it could not be found.
	 *
	 * @param renewLicAbstractAndWaterId the primary key of the renew lic abstract and water
	 * @return the renew lic abstract and water
	 * @throws NoSuchRenewLicAbstractAndWaterException if a renew lic abstract and water with the primary key could not be found
	 */
	public static RenewLicAbstractAndWater findByPrimaryKey(
			long renewLicAbstractAndWaterId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchRenewLicAbstractAndWaterException {

		return getPersistence().findByPrimaryKey(renewLicAbstractAndWaterId);
	}

	/**
	 * Returns the renew lic abstract and water with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param renewLicAbstractAndWaterId the primary key of the renew lic abstract and water
	 * @return the renew lic abstract and water, or <code>null</code> if a renew lic abstract and water with the primary key could not be found
	 */
	public static RenewLicAbstractAndWater fetchByPrimaryKey(
		long renewLicAbstractAndWaterId) {

		return getPersistence().fetchByPrimaryKey(renewLicAbstractAndWaterId);
	}

	/**
	 * Returns all the renew lic abstract and waters.
	 *
	 * @return the renew lic abstract and waters
	 */
	public static List<RenewLicAbstractAndWater> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the renew lic abstract and waters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RenewLicAbstractAndWaterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of renew lic abstract and waters
	 * @param end the upper bound of the range of renew lic abstract and waters (not inclusive)
	 * @return the range of renew lic abstract and waters
	 */
	public static List<RenewLicAbstractAndWater> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the renew lic abstract and waters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RenewLicAbstractAndWaterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of renew lic abstract and waters
	 * @param end the upper bound of the range of renew lic abstract and waters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of renew lic abstract and waters
	 */
	public static List<RenewLicAbstractAndWater> findAll(
		int start, int end,
		OrderByComparator<RenewLicAbstractAndWater> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the renew lic abstract and waters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RenewLicAbstractAndWaterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of renew lic abstract and waters
	 * @param end the upper bound of the range of renew lic abstract and waters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of renew lic abstract and waters
	 */
	public static List<RenewLicAbstractAndWater> findAll(
		int start, int end,
		OrderByComparator<RenewLicAbstractAndWater> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the renew lic abstract and waters from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of renew lic abstract and waters.
	 *
	 * @return the number of renew lic abstract and waters
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RenewLicAbstractAndWaterPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		RenewLicAbstractAndWaterPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile RenewLicAbstractAndWaterPersistence _persistence;

}