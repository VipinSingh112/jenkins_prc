/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.mining.lease.application.service.model.MiningExclusiveLicFormFive;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the mining exclusive lic form five service. This utility wraps <code>com.nbp.mining.lease.application.service.service.persistence.impl.MiningExclusiveLicFormFivePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningExclusiveLicFormFivePersistence
 * @generated
 */
public class MiningExclusiveLicFormFiveUtil {

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
		MiningExclusiveLicFormFive miningExclusiveLicFormFive) {

		getPersistence().clearCache(miningExclusiveLicFormFive);
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
	public static Map<Serializable, MiningExclusiveLicFormFive>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiningExclusiveLicFormFive> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiningExclusiveLicFormFive> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiningExclusiveLicFormFive> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiningExclusiveLicFormFive> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiningExclusiveLicFormFive update(
		MiningExclusiveLicFormFive miningExclusiveLicFormFive) {

		return getPersistence().update(miningExclusiveLicFormFive);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiningExclusiveLicFormFive update(
		MiningExclusiveLicFormFive miningExclusiveLicFormFive,
		ServiceContext serviceContext) {

		return getPersistence().update(
			miningExclusiveLicFormFive, serviceContext);
	}

	/**
	 * Returns the mining exclusive lic form five where miningLeaseApplicationId = &#63; or throws a <code>NoSuchMiningExclusiveLicFormFiveException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining exclusive lic form five
	 * @throws NoSuchMiningExclusiveLicFormFiveException if a matching mining exclusive lic form five could not be found
	 */
	public static MiningExclusiveLicFormFive findBygetMiningById(
			long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningExclusiveLicFormFiveException {

		return getPersistence().findBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the mining exclusive lic form five where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining exclusive lic form five, or <code>null</code> if a matching mining exclusive lic form five could not be found
	 */
	public static MiningExclusiveLicFormFive fetchBygetMiningById(
		long miningLeaseApplicationId) {

		return getPersistence().fetchBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the mining exclusive lic form five where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining exclusive lic form five, or <code>null</code> if a matching mining exclusive lic form five could not be found
	 */
	public static MiningExclusiveLicFormFive fetchBygetMiningById(
		long miningLeaseApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetMiningById(
			miningLeaseApplicationId, useFinderCache);
	}

	/**
	 * Removes the mining exclusive lic form five where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the mining exclusive lic form five that was removed
	 */
	public static MiningExclusiveLicFormFive removeBygetMiningById(
			long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningExclusiveLicFormFiveException {

		return getPersistence().removeBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the number of mining exclusive lic form fives where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining exclusive lic form fives
	 */
	public static int countBygetMiningById(long miningLeaseApplicationId) {
		return getPersistence().countBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Caches the mining exclusive lic form five in the entity cache if it is enabled.
	 *
	 * @param miningExclusiveLicFormFive the mining exclusive lic form five
	 */
	public static void cacheResult(
		MiningExclusiveLicFormFive miningExclusiveLicFormFive) {

		getPersistence().cacheResult(miningExclusiveLicFormFive);
	}

	/**
	 * Caches the mining exclusive lic form fives in the entity cache if it is enabled.
	 *
	 * @param miningExclusiveLicFormFives the mining exclusive lic form fives
	 */
	public static void cacheResult(
		List<MiningExclusiveLicFormFive> miningExclusiveLicFormFives) {

		getPersistence().cacheResult(miningExclusiveLicFormFives);
	}

	/**
	 * Creates a new mining exclusive lic form five with the primary key. Does not add the mining exclusive lic form five to the database.
	 *
	 * @param miningExclusiveLicFormFiveId the primary key for the new mining exclusive lic form five
	 * @return the new mining exclusive lic form five
	 */
	public static MiningExclusiveLicFormFive create(
		long miningExclusiveLicFormFiveId) {

		return getPersistence().create(miningExclusiveLicFormFiveId);
	}

	/**
	 * Removes the mining exclusive lic form five with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningExclusiveLicFormFiveId the primary key of the mining exclusive lic form five
	 * @return the mining exclusive lic form five that was removed
	 * @throws NoSuchMiningExclusiveLicFormFiveException if a mining exclusive lic form five with the primary key could not be found
	 */
	public static MiningExclusiveLicFormFive remove(
			long miningExclusiveLicFormFiveId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningExclusiveLicFormFiveException {

		return getPersistence().remove(miningExclusiveLicFormFiveId);
	}

	public static MiningExclusiveLicFormFive updateImpl(
		MiningExclusiveLicFormFive miningExclusiveLicFormFive) {

		return getPersistence().updateImpl(miningExclusiveLicFormFive);
	}

	/**
	 * Returns the mining exclusive lic form five with the primary key or throws a <code>NoSuchMiningExclusiveLicFormFiveException</code> if it could not be found.
	 *
	 * @param miningExclusiveLicFormFiveId the primary key of the mining exclusive lic form five
	 * @return the mining exclusive lic form five
	 * @throws NoSuchMiningExclusiveLicFormFiveException if a mining exclusive lic form five with the primary key could not be found
	 */
	public static MiningExclusiveLicFormFive findByPrimaryKey(
			long miningExclusiveLicFormFiveId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningExclusiveLicFormFiveException {

		return getPersistence().findByPrimaryKey(miningExclusiveLicFormFiveId);
	}

	/**
	 * Returns the mining exclusive lic form five with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningExclusiveLicFormFiveId the primary key of the mining exclusive lic form five
	 * @return the mining exclusive lic form five, or <code>null</code> if a mining exclusive lic form five with the primary key could not be found
	 */
	public static MiningExclusiveLicFormFive fetchByPrimaryKey(
		long miningExclusiveLicFormFiveId) {

		return getPersistence().fetchByPrimaryKey(miningExclusiveLicFormFiveId);
	}

	/**
	 * Returns all the mining exclusive lic form fives.
	 *
	 * @return the mining exclusive lic form fives
	 */
	public static List<MiningExclusiveLicFormFive> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the mining exclusive lic form fives.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningExclusiveLicFormFiveModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining exclusive lic form fives
	 * @param end the upper bound of the range of mining exclusive lic form fives (not inclusive)
	 * @return the range of mining exclusive lic form fives
	 */
	public static List<MiningExclusiveLicFormFive> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the mining exclusive lic form fives.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningExclusiveLicFormFiveModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining exclusive lic form fives
	 * @param end the upper bound of the range of mining exclusive lic form fives (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining exclusive lic form fives
	 */
	public static List<MiningExclusiveLicFormFive> findAll(
		int start, int end,
		OrderByComparator<MiningExclusiveLicFormFive> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining exclusive lic form fives.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningExclusiveLicFormFiveModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining exclusive lic form fives
	 * @param end the upper bound of the range of mining exclusive lic form fives (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining exclusive lic form fives
	 */
	public static List<MiningExclusiveLicFormFive> findAll(
		int start, int end,
		OrderByComparator<MiningExclusiveLicFormFive> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the mining exclusive lic form fives from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of mining exclusive lic form fives.
	 *
	 * @return the number of mining exclusive lic form fives
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiningExclusiveLicFormFivePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MiningExclusiveLicFormFivePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MiningExclusiveLicFormFivePersistence _persistence;

}