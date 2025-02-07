/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.mining.lease.application.service.model.MiningProspectingLicenseAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the mining prospecting license add service. This utility wraps <code>com.nbp.mining.lease.application.service.service.persistence.impl.MiningProspectingLicenseAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingLicenseAddPersistence
 * @generated
 */
public class MiningProspectingLicenseAddUtil {

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
		MiningProspectingLicenseAdd miningProspectingLicenseAdd) {

		getPersistence().clearCache(miningProspectingLicenseAdd);
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
	public static Map<Serializable, MiningProspectingLicenseAdd>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiningProspectingLicenseAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiningProspectingLicenseAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiningProspectingLicenseAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiningProspectingLicenseAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiningProspectingLicenseAdd update(
		MiningProspectingLicenseAdd miningProspectingLicenseAdd) {

		return getPersistence().update(miningProspectingLicenseAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiningProspectingLicenseAdd update(
		MiningProspectingLicenseAdd miningProspectingLicenseAdd,
		ServiceContext serviceContext) {

		return getPersistence().update(
			miningProspectingLicenseAdd, serviceContext);
	}

	/**
	 * Returns all the mining prospecting license adds where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining prospecting license adds
	 */
	public static List<MiningProspectingLicenseAdd> findBygetMiningById(
		long miningLeaseApplicationId) {

		return getPersistence().findBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns a range of all the mining prospecting license adds where miningLeaseApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseAddModelImpl</code>.
	 * </p>
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param start the lower bound of the range of mining prospecting license adds
	 * @param end the upper bound of the range of mining prospecting license adds (not inclusive)
	 * @return the range of matching mining prospecting license adds
	 */
	public static List<MiningProspectingLicenseAdd> findBygetMiningById(
		long miningLeaseApplicationId, int start, int end) {

		return getPersistence().findBygetMiningById(
			miningLeaseApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the mining prospecting license adds where miningLeaseApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseAddModelImpl</code>.
	 * </p>
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param start the lower bound of the range of mining prospecting license adds
	 * @param end the upper bound of the range of mining prospecting license adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining prospecting license adds
	 */
	public static List<MiningProspectingLicenseAdd> findBygetMiningById(
		long miningLeaseApplicationId, int start, int end,
		OrderByComparator<MiningProspectingLicenseAdd> orderByComparator) {

		return getPersistence().findBygetMiningById(
			miningLeaseApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining prospecting license adds where miningLeaseApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseAddModelImpl</code>.
	 * </p>
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param start the lower bound of the range of mining prospecting license adds
	 * @param end the upper bound of the range of mining prospecting license adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining prospecting license adds
	 */
	public static List<MiningProspectingLicenseAdd> findBygetMiningById(
		long miningLeaseApplicationId, int start, int end,
		OrderByComparator<MiningProspectingLicenseAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMiningById(
			miningLeaseApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first mining prospecting license add in the ordered set where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining prospecting license add
	 * @throws NoSuchMiningProspectingLicenseAddException if a matching mining prospecting license add could not be found
	 */
	public static MiningProspectingLicenseAdd findBygetMiningById_First(
			long miningLeaseApplicationId,
			OrderByComparator<MiningProspectingLicenseAdd> orderByComparator)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningProspectingLicenseAddException {

		return getPersistence().findBygetMiningById_First(
			miningLeaseApplicationId, orderByComparator);
	}

	/**
	 * Returns the first mining prospecting license add in the ordered set where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining prospecting license add, or <code>null</code> if a matching mining prospecting license add could not be found
	 */
	public static MiningProspectingLicenseAdd fetchBygetMiningById_First(
		long miningLeaseApplicationId,
		OrderByComparator<MiningProspectingLicenseAdd> orderByComparator) {

		return getPersistence().fetchBygetMiningById_First(
			miningLeaseApplicationId, orderByComparator);
	}

	/**
	 * Returns the last mining prospecting license add in the ordered set where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining prospecting license add
	 * @throws NoSuchMiningProspectingLicenseAddException if a matching mining prospecting license add could not be found
	 */
	public static MiningProspectingLicenseAdd findBygetMiningById_Last(
			long miningLeaseApplicationId,
			OrderByComparator<MiningProspectingLicenseAdd> orderByComparator)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningProspectingLicenseAddException {

		return getPersistence().findBygetMiningById_Last(
			miningLeaseApplicationId, orderByComparator);
	}

	/**
	 * Returns the last mining prospecting license add in the ordered set where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining prospecting license add, or <code>null</code> if a matching mining prospecting license add could not be found
	 */
	public static MiningProspectingLicenseAdd fetchBygetMiningById_Last(
		long miningLeaseApplicationId,
		OrderByComparator<MiningProspectingLicenseAdd> orderByComparator) {

		return getPersistence().fetchBygetMiningById_Last(
			miningLeaseApplicationId, orderByComparator);
	}

	/**
	 * Returns the mining prospecting license adds before and after the current mining prospecting license add in the ordered set where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningProspectingLicenseAddId the primary key of the current mining prospecting license add
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining prospecting license add
	 * @throws NoSuchMiningProspectingLicenseAddException if a mining prospecting license add with the primary key could not be found
	 */
	public static MiningProspectingLicenseAdd[] findBygetMiningById_PrevAndNext(
			long miningProspectingLicenseAddId, long miningLeaseApplicationId,
			OrderByComparator<MiningProspectingLicenseAdd> orderByComparator)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningProspectingLicenseAddException {

		return getPersistence().findBygetMiningById_PrevAndNext(
			miningProspectingLicenseAddId, miningLeaseApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the mining prospecting license adds where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 */
	public static void removeBygetMiningById(long miningLeaseApplicationId) {
		getPersistence().removeBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the number of mining prospecting license adds where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining prospecting license adds
	 */
	public static int countBygetMiningById(long miningLeaseApplicationId) {
		return getPersistence().countBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Caches the mining prospecting license add in the entity cache if it is enabled.
	 *
	 * @param miningProspectingLicenseAdd the mining prospecting license add
	 */
	public static void cacheResult(
		MiningProspectingLicenseAdd miningProspectingLicenseAdd) {

		getPersistence().cacheResult(miningProspectingLicenseAdd);
	}

	/**
	 * Caches the mining prospecting license adds in the entity cache if it is enabled.
	 *
	 * @param miningProspectingLicenseAdds the mining prospecting license adds
	 */
	public static void cacheResult(
		List<MiningProspectingLicenseAdd> miningProspectingLicenseAdds) {

		getPersistence().cacheResult(miningProspectingLicenseAdds);
	}

	/**
	 * Creates a new mining prospecting license add with the primary key. Does not add the mining prospecting license add to the database.
	 *
	 * @param miningProspectingLicenseAddId the primary key for the new mining prospecting license add
	 * @return the new mining prospecting license add
	 */
	public static MiningProspectingLicenseAdd create(
		long miningProspectingLicenseAddId) {

		return getPersistence().create(miningProspectingLicenseAddId);
	}

	/**
	 * Removes the mining prospecting license add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningProspectingLicenseAddId the primary key of the mining prospecting license add
	 * @return the mining prospecting license add that was removed
	 * @throws NoSuchMiningProspectingLicenseAddException if a mining prospecting license add with the primary key could not be found
	 */
	public static MiningProspectingLicenseAdd remove(
			long miningProspectingLicenseAddId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningProspectingLicenseAddException {

		return getPersistence().remove(miningProspectingLicenseAddId);
	}

	public static MiningProspectingLicenseAdd updateImpl(
		MiningProspectingLicenseAdd miningProspectingLicenseAdd) {

		return getPersistence().updateImpl(miningProspectingLicenseAdd);
	}

	/**
	 * Returns the mining prospecting license add with the primary key or throws a <code>NoSuchMiningProspectingLicenseAddException</code> if it could not be found.
	 *
	 * @param miningProspectingLicenseAddId the primary key of the mining prospecting license add
	 * @return the mining prospecting license add
	 * @throws NoSuchMiningProspectingLicenseAddException if a mining prospecting license add with the primary key could not be found
	 */
	public static MiningProspectingLicenseAdd findByPrimaryKey(
			long miningProspectingLicenseAddId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningProspectingLicenseAddException {

		return getPersistence().findByPrimaryKey(miningProspectingLicenseAddId);
	}

	/**
	 * Returns the mining prospecting license add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningProspectingLicenseAddId the primary key of the mining prospecting license add
	 * @return the mining prospecting license add, or <code>null</code> if a mining prospecting license add with the primary key could not be found
	 */
	public static MiningProspectingLicenseAdd fetchByPrimaryKey(
		long miningProspectingLicenseAddId) {

		return getPersistence().fetchByPrimaryKey(
			miningProspectingLicenseAddId);
	}

	/**
	 * Returns all the mining prospecting license adds.
	 *
	 * @return the mining prospecting license adds
	 */
	public static List<MiningProspectingLicenseAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the mining prospecting license adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting license adds
	 * @param end the upper bound of the range of mining prospecting license adds (not inclusive)
	 * @return the range of mining prospecting license adds
	 */
	public static List<MiningProspectingLicenseAdd> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the mining prospecting license adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting license adds
	 * @param end the upper bound of the range of mining prospecting license adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining prospecting license adds
	 */
	public static List<MiningProspectingLicenseAdd> findAll(
		int start, int end,
		OrderByComparator<MiningProspectingLicenseAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining prospecting license adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting license adds
	 * @param end the upper bound of the range of mining prospecting license adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining prospecting license adds
	 */
	public static List<MiningProspectingLicenseAdd> findAll(
		int start, int end,
		OrderByComparator<MiningProspectingLicenseAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the mining prospecting license adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of mining prospecting license adds.
	 *
	 * @return the number of mining prospecting license adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiningProspectingLicenseAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MiningProspectingLicenseAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MiningProspectingLicenseAddPersistence _persistence;

}