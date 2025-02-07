/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.mining.lease.application.service.model.MiningProspectingRights;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the mining prospecting rights service. This utility wraps <code>com.nbp.mining.lease.application.service.service.persistence.impl.MiningProspectingRightsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingRightsPersistence
 * @generated
 */
public class MiningProspectingRightsUtil {

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
		MiningProspectingRights miningProspectingRights) {

		getPersistence().clearCache(miningProspectingRights);
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
	public static Map<Serializable, MiningProspectingRights> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiningProspectingRights> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiningProspectingRights> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiningProspectingRights> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiningProspectingRights> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiningProspectingRights update(
		MiningProspectingRights miningProspectingRights) {

		return getPersistence().update(miningProspectingRights);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiningProspectingRights update(
		MiningProspectingRights miningProspectingRights,
		ServiceContext serviceContext) {

		return getPersistence().update(miningProspectingRights, serviceContext);
	}

	/**
	 * Returns the mining prospecting rights where miningLeaseApplicationId = &#63; or throws a <code>NoSuchMiningProspectingRightsException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining prospecting rights
	 * @throws NoSuchMiningProspectingRightsException if a matching mining prospecting rights could not be found
	 */
	public static MiningProspectingRights findBygetMiningById(
			long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningProspectingRightsException {

		return getPersistence().findBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the mining prospecting rights where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining prospecting rights, or <code>null</code> if a matching mining prospecting rights could not be found
	 */
	public static MiningProspectingRights fetchBygetMiningById(
		long miningLeaseApplicationId) {

		return getPersistence().fetchBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the mining prospecting rights where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining prospecting rights, or <code>null</code> if a matching mining prospecting rights could not be found
	 */
	public static MiningProspectingRights fetchBygetMiningById(
		long miningLeaseApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetMiningById(
			miningLeaseApplicationId, useFinderCache);
	}

	/**
	 * Removes the mining prospecting rights where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the mining prospecting rights that was removed
	 */
	public static MiningProspectingRights removeBygetMiningById(
			long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningProspectingRightsException {

		return getPersistence().removeBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the number of mining prospecting rightses where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining prospecting rightses
	 */
	public static int countBygetMiningById(long miningLeaseApplicationId) {
		return getPersistence().countBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Caches the mining prospecting rights in the entity cache if it is enabled.
	 *
	 * @param miningProspectingRights the mining prospecting rights
	 */
	public static void cacheResult(
		MiningProspectingRights miningProspectingRights) {

		getPersistence().cacheResult(miningProspectingRights);
	}

	/**
	 * Caches the mining prospecting rightses in the entity cache if it is enabled.
	 *
	 * @param miningProspectingRightses the mining prospecting rightses
	 */
	public static void cacheResult(
		List<MiningProspectingRights> miningProspectingRightses) {

		getPersistence().cacheResult(miningProspectingRightses);
	}

	/**
	 * Creates a new mining prospecting rights with the primary key. Does not add the mining prospecting rights to the database.
	 *
	 * @param prospectingRightsId the primary key for the new mining prospecting rights
	 * @return the new mining prospecting rights
	 */
	public static MiningProspectingRights create(long prospectingRightsId) {
		return getPersistence().create(prospectingRightsId);
	}

	/**
	 * Removes the mining prospecting rights with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param prospectingRightsId the primary key of the mining prospecting rights
	 * @return the mining prospecting rights that was removed
	 * @throws NoSuchMiningProspectingRightsException if a mining prospecting rights with the primary key could not be found
	 */
	public static MiningProspectingRights remove(long prospectingRightsId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningProspectingRightsException {

		return getPersistence().remove(prospectingRightsId);
	}

	public static MiningProspectingRights updateImpl(
		MiningProspectingRights miningProspectingRights) {

		return getPersistence().updateImpl(miningProspectingRights);
	}

	/**
	 * Returns the mining prospecting rights with the primary key or throws a <code>NoSuchMiningProspectingRightsException</code> if it could not be found.
	 *
	 * @param prospectingRightsId the primary key of the mining prospecting rights
	 * @return the mining prospecting rights
	 * @throws NoSuchMiningProspectingRightsException if a mining prospecting rights with the primary key could not be found
	 */
	public static MiningProspectingRights findByPrimaryKey(
			long prospectingRightsId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningProspectingRightsException {

		return getPersistence().findByPrimaryKey(prospectingRightsId);
	}

	/**
	 * Returns the mining prospecting rights with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param prospectingRightsId the primary key of the mining prospecting rights
	 * @return the mining prospecting rights, or <code>null</code> if a mining prospecting rights with the primary key could not be found
	 */
	public static MiningProspectingRights fetchByPrimaryKey(
		long prospectingRightsId) {

		return getPersistence().fetchByPrimaryKey(prospectingRightsId);
	}

	/**
	 * Returns all the mining prospecting rightses.
	 *
	 * @return the mining prospecting rightses
	 */
	public static List<MiningProspectingRights> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the mining prospecting rightses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingRightsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting rightses
	 * @param end the upper bound of the range of mining prospecting rightses (not inclusive)
	 * @return the range of mining prospecting rightses
	 */
	public static List<MiningProspectingRights> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the mining prospecting rightses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingRightsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting rightses
	 * @param end the upper bound of the range of mining prospecting rightses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining prospecting rightses
	 */
	public static List<MiningProspectingRights> findAll(
		int start, int end,
		OrderByComparator<MiningProspectingRights> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining prospecting rightses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingRightsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting rightses
	 * @param end the upper bound of the range of mining prospecting rightses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining prospecting rightses
	 */
	public static List<MiningProspectingRights> findAll(
		int start, int end,
		OrderByComparator<MiningProspectingRights> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the mining prospecting rightses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of mining prospecting rightses.
	 *
	 * @return the number of mining prospecting rightses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiningProspectingRightsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MiningProspectingRightsPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MiningProspectingRightsPersistence _persistence;

}