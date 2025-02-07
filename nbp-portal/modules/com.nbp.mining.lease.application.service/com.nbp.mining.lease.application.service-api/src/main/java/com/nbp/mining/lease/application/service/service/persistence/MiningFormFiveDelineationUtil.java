/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.mining.lease.application.service.model.MiningFormFiveDelineation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the mining form five delineation service. This utility wraps <code>com.nbp.mining.lease.application.service.service.persistence.impl.MiningFormFiveDelineationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningFormFiveDelineationPersistence
 * @generated
 */
public class MiningFormFiveDelineationUtil {

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
		MiningFormFiveDelineation miningFormFiveDelineation) {

		getPersistence().clearCache(miningFormFiveDelineation);
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
	public static Map<Serializable, MiningFormFiveDelineation>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiningFormFiveDelineation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiningFormFiveDelineation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiningFormFiveDelineation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiningFormFiveDelineation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiningFormFiveDelineation update(
		MiningFormFiveDelineation miningFormFiveDelineation) {

		return getPersistence().update(miningFormFiveDelineation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiningFormFiveDelineation update(
		MiningFormFiveDelineation miningFormFiveDelineation,
		ServiceContext serviceContext) {

		return getPersistence().update(
			miningFormFiveDelineation, serviceContext);
	}

	/**
	 * Returns the mining form five delineation where miningLeaseApplicationId = &#63; or throws a <code>NoSuchMiningFormFiveDelineationException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining form five delineation
	 * @throws NoSuchMiningFormFiveDelineationException if a matching mining form five delineation could not be found
	 */
	public static MiningFormFiveDelineation findBygetMiningById(
			long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningFormFiveDelineationException {

		return getPersistence().findBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the mining form five delineation where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining form five delineation, or <code>null</code> if a matching mining form five delineation could not be found
	 */
	public static MiningFormFiveDelineation fetchBygetMiningById(
		long miningLeaseApplicationId) {

		return getPersistence().fetchBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the mining form five delineation where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining form five delineation, or <code>null</code> if a matching mining form five delineation could not be found
	 */
	public static MiningFormFiveDelineation fetchBygetMiningById(
		long miningLeaseApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetMiningById(
			miningLeaseApplicationId, useFinderCache);
	}

	/**
	 * Removes the mining form five delineation where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the mining form five delineation that was removed
	 */
	public static MiningFormFiveDelineation removeBygetMiningById(
			long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningFormFiveDelineationException {

		return getPersistence().removeBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the number of mining form five delineations where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining form five delineations
	 */
	public static int countBygetMiningById(long miningLeaseApplicationId) {
		return getPersistence().countBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Caches the mining form five delineation in the entity cache if it is enabled.
	 *
	 * @param miningFormFiveDelineation the mining form five delineation
	 */
	public static void cacheResult(
		MiningFormFiveDelineation miningFormFiveDelineation) {

		getPersistence().cacheResult(miningFormFiveDelineation);
	}

	/**
	 * Caches the mining form five delineations in the entity cache if it is enabled.
	 *
	 * @param miningFormFiveDelineations the mining form five delineations
	 */
	public static void cacheResult(
		List<MiningFormFiveDelineation> miningFormFiveDelineations) {

		getPersistence().cacheResult(miningFormFiveDelineations);
	}

	/**
	 * Creates a new mining form five delineation with the primary key. Does not add the mining form five delineation to the database.
	 *
	 * @param miningFormFiveDelineationId the primary key for the new mining form five delineation
	 * @return the new mining form five delineation
	 */
	public static MiningFormFiveDelineation create(
		long miningFormFiveDelineationId) {

		return getPersistence().create(miningFormFiveDelineationId);
	}

	/**
	 * Removes the mining form five delineation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningFormFiveDelineationId the primary key of the mining form five delineation
	 * @return the mining form five delineation that was removed
	 * @throws NoSuchMiningFormFiveDelineationException if a mining form five delineation with the primary key could not be found
	 */
	public static MiningFormFiveDelineation remove(
			long miningFormFiveDelineationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningFormFiveDelineationException {

		return getPersistence().remove(miningFormFiveDelineationId);
	}

	public static MiningFormFiveDelineation updateImpl(
		MiningFormFiveDelineation miningFormFiveDelineation) {

		return getPersistence().updateImpl(miningFormFiveDelineation);
	}

	/**
	 * Returns the mining form five delineation with the primary key or throws a <code>NoSuchMiningFormFiveDelineationException</code> if it could not be found.
	 *
	 * @param miningFormFiveDelineationId the primary key of the mining form five delineation
	 * @return the mining form five delineation
	 * @throws NoSuchMiningFormFiveDelineationException if a mining form five delineation with the primary key could not be found
	 */
	public static MiningFormFiveDelineation findByPrimaryKey(
			long miningFormFiveDelineationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningFormFiveDelineationException {

		return getPersistence().findByPrimaryKey(miningFormFiveDelineationId);
	}

	/**
	 * Returns the mining form five delineation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningFormFiveDelineationId the primary key of the mining form five delineation
	 * @return the mining form five delineation, or <code>null</code> if a mining form five delineation with the primary key could not be found
	 */
	public static MiningFormFiveDelineation fetchByPrimaryKey(
		long miningFormFiveDelineationId) {

		return getPersistence().fetchByPrimaryKey(miningFormFiveDelineationId);
	}

	/**
	 * Returns all the mining form five delineations.
	 *
	 * @return the mining form five delineations
	 */
	public static List<MiningFormFiveDelineation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the mining form five delineations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningFormFiveDelineationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining form five delineations
	 * @param end the upper bound of the range of mining form five delineations (not inclusive)
	 * @return the range of mining form five delineations
	 */
	public static List<MiningFormFiveDelineation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the mining form five delineations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningFormFiveDelineationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining form five delineations
	 * @param end the upper bound of the range of mining form five delineations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining form five delineations
	 */
	public static List<MiningFormFiveDelineation> findAll(
		int start, int end,
		OrderByComparator<MiningFormFiveDelineation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining form five delineations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningFormFiveDelineationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining form five delineations
	 * @param end the upper bound of the range of mining form five delineations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining form five delineations
	 */
	public static List<MiningFormFiveDelineation> findAll(
		int start, int end,
		OrderByComparator<MiningFormFiveDelineation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the mining form five delineations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of mining form five delineations.
	 *
	 * @return the number of mining form five delineations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiningFormFiveDelineationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MiningFormFiveDelineationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MiningFormFiveDelineationPersistence _persistence;

}