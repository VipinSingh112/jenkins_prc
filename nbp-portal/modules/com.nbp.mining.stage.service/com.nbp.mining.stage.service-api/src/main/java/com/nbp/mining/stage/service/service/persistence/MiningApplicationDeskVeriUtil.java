/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.mining.stage.service.model.MiningApplicationDeskVeri;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the mining application desk veri service. This utility wraps <code>com.nbp.mining.stage.service.service.persistence.impl.MiningApplicationDeskVeriPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationDeskVeriPersistence
 * @generated
 */
public class MiningApplicationDeskVeriUtil {

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
		MiningApplicationDeskVeri miningApplicationDeskVeri) {

		getPersistence().clearCache(miningApplicationDeskVeri);
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
	public static Map<Serializable, MiningApplicationDeskVeri>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiningApplicationDeskVeri> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiningApplicationDeskVeri> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiningApplicationDeskVeri> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiningApplicationDeskVeri> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiningApplicationDeskVeri update(
		MiningApplicationDeskVeri miningApplicationDeskVeri) {

		return getPersistence().update(miningApplicationDeskVeri);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiningApplicationDeskVeri update(
		MiningApplicationDeskVeri miningApplicationDeskVeri,
		ServiceContext serviceContext) {

		return getPersistence().update(
			miningApplicationDeskVeri, serviceContext);
	}

	/**
	 * Returns all the mining application desk veris where miningApplicationId = &#63;.
	 *
	 * @param miningApplicationId the mining application ID
	 * @return the matching mining application desk veris
	 */
	public static List<MiningApplicationDeskVeri> findBygetMiningAppDV_ById(
		long miningApplicationId) {

		return getPersistence().findBygetMiningAppDV_ById(miningApplicationId);
	}

	/**
	 * Returns a range of all the mining application desk veris where miningApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param miningApplicationId the mining application ID
	 * @param start the lower bound of the range of mining application desk veris
	 * @param end the upper bound of the range of mining application desk veris (not inclusive)
	 * @return the range of matching mining application desk veris
	 */
	public static List<MiningApplicationDeskVeri> findBygetMiningAppDV_ById(
		long miningApplicationId, int start, int end) {

		return getPersistence().findBygetMiningAppDV_ById(
			miningApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the mining application desk veris where miningApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param miningApplicationId the mining application ID
	 * @param start the lower bound of the range of mining application desk veris
	 * @param end the upper bound of the range of mining application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application desk veris
	 */
	public static List<MiningApplicationDeskVeri> findBygetMiningAppDV_ById(
		long miningApplicationId, int start, int end,
		OrderByComparator<MiningApplicationDeskVeri> orderByComparator) {

		return getPersistence().findBygetMiningAppDV_ById(
			miningApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining application desk veris where miningApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param miningApplicationId the mining application ID
	 * @param start the lower bound of the range of mining application desk veris
	 * @param end the upper bound of the range of mining application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application desk veris
	 */
	public static List<MiningApplicationDeskVeri> findBygetMiningAppDV_ById(
		long miningApplicationId, int start, int end,
		OrderByComparator<MiningApplicationDeskVeri> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMiningAppDV_ById(
			miningApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mining application desk veri in the ordered set where miningApplicationId = &#63;.
	 *
	 * @param miningApplicationId the mining application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application desk veri
	 * @throws NoSuchMiningApplicationDeskVeriException if a matching mining application desk veri could not be found
	 */
	public static MiningApplicationDeskVeri findBygetMiningAppDV_ById_First(
			long miningApplicationId,
			OrderByComparator<MiningApplicationDeskVeri> orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationDeskVeriException {

		return getPersistence().findBygetMiningAppDV_ById_First(
			miningApplicationId, orderByComparator);
	}

	/**
	 * Returns the first mining application desk veri in the ordered set where miningApplicationId = &#63;.
	 *
	 * @param miningApplicationId the mining application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application desk veri, or <code>null</code> if a matching mining application desk veri could not be found
	 */
	public static MiningApplicationDeskVeri fetchBygetMiningAppDV_ById_First(
		long miningApplicationId,
		OrderByComparator<MiningApplicationDeskVeri> orderByComparator) {

		return getPersistence().fetchBygetMiningAppDV_ById_First(
			miningApplicationId, orderByComparator);
	}

	/**
	 * Returns the last mining application desk veri in the ordered set where miningApplicationId = &#63;.
	 *
	 * @param miningApplicationId the mining application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application desk veri
	 * @throws NoSuchMiningApplicationDeskVeriException if a matching mining application desk veri could not be found
	 */
	public static MiningApplicationDeskVeri findBygetMiningAppDV_ById_Last(
			long miningApplicationId,
			OrderByComparator<MiningApplicationDeskVeri> orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationDeskVeriException {

		return getPersistence().findBygetMiningAppDV_ById_Last(
			miningApplicationId, orderByComparator);
	}

	/**
	 * Returns the last mining application desk veri in the ordered set where miningApplicationId = &#63;.
	 *
	 * @param miningApplicationId the mining application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application desk veri, or <code>null</code> if a matching mining application desk veri could not be found
	 */
	public static MiningApplicationDeskVeri fetchBygetMiningAppDV_ById_Last(
		long miningApplicationId,
		OrderByComparator<MiningApplicationDeskVeri> orderByComparator) {

		return getPersistence().fetchBygetMiningAppDV_ById_Last(
			miningApplicationId, orderByComparator);
	}

	/**
	 * Returns the mining application desk veris before and after the current mining application desk veri in the ordered set where miningApplicationId = &#63;.
	 *
	 * @param miningDeskVeriId the primary key of the current mining application desk veri
	 * @param miningApplicationId the mining application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application desk veri
	 * @throws NoSuchMiningApplicationDeskVeriException if a mining application desk veri with the primary key could not be found
	 */
	public static MiningApplicationDeskVeri[]
			findBygetMiningAppDV_ById_PrevAndNext(
				long miningDeskVeriId, long miningApplicationId,
				OrderByComparator<MiningApplicationDeskVeri> orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationDeskVeriException {

		return getPersistence().findBygetMiningAppDV_ById_PrevAndNext(
			miningDeskVeriId, miningApplicationId, orderByComparator);
	}

	/**
	 * Removes all the mining application desk veris where miningApplicationId = &#63; from the database.
	 *
	 * @param miningApplicationId the mining application ID
	 */
	public static void removeBygetMiningAppDV_ById(long miningApplicationId) {
		getPersistence().removeBygetMiningAppDV_ById(miningApplicationId);
	}

	/**
	 * Returns the number of mining application desk veris where miningApplicationId = &#63;.
	 *
	 * @param miningApplicationId the mining application ID
	 * @return the number of matching mining application desk veris
	 */
	public static int countBygetMiningAppDV_ById(long miningApplicationId) {
		return getPersistence().countBygetMiningAppDV_ById(miningApplicationId);
	}

	/**
	 * Caches the mining application desk veri in the entity cache if it is enabled.
	 *
	 * @param miningApplicationDeskVeri the mining application desk veri
	 */
	public static void cacheResult(
		MiningApplicationDeskVeri miningApplicationDeskVeri) {

		getPersistence().cacheResult(miningApplicationDeskVeri);
	}

	/**
	 * Caches the mining application desk veris in the entity cache if it is enabled.
	 *
	 * @param miningApplicationDeskVeris the mining application desk veris
	 */
	public static void cacheResult(
		List<MiningApplicationDeskVeri> miningApplicationDeskVeris) {

		getPersistence().cacheResult(miningApplicationDeskVeris);
	}

	/**
	 * Creates a new mining application desk veri with the primary key. Does not add the mining application desk veri to the database.
	 *
	 * @param miningDeskVeriId the primary key for the new mining application desk veri
	 * @return the new mining application desk veri
	 */
	public static MiningApplicationDeskVeri create(long miningDeskVeriId) {
		return getPersistence().create(miningDeskVeriId);
	}

	/**
	 * Removes the mining application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningDeskVeriId the primary key of the mining application desk veri
	 * @return the mining application desk veri that was removed
	 * @throws NoSuchMiningApplicationDeskVeriException if a mining application desk veri with the primary key could not be found
	 */
	public static MiningApplicationDeskVeri remove(long miningDeskVeriId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationDeskVeriException {

		return getPersistence().remove(miningDeskVeriId);
	}

	public static MiningApplicationDeskVeri updateImpl(
		MiningApplicationDeskVeri miningApplicationDeskVeri) {

		return getPersistence().updateImpl(miningApplicationDeskVeri);
	}

	/**
	 * Returns the mining application desk veri with the primary key or throws a <code>NoSuchMiningApplicationDeskVeriException</code> if it could not be found.
	 *
	 * @param miningDeskVeriId the primary key of the mining application desk veri
	 * @return the mining application desk veri
	 * @throws NoSuchMiningApplicationDeskVeriException if a mining application desk veri with the primary key could not be found
	 */
	public static MiningApplicationDeskVeri findByPrimaryKey(
			long miningDeskVeriId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationDeskVeriException {

		return getPersistence().findByPrimaryKey(miningDeskVeriId);
	}

	/**
	 * Returns the mining application desk veri with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningDeskVeriId the primary key of the mining application desk veri
	 * @return the mining application desk veri, or <code>null</code> if a mining application desk veri with the primary key could not be found
	 */
	public static MiningApplicationDeskVeri fetchByPrimaryKey(
		long miningDeskVeriId) {

		return getPersistence().fetchByPrimaryKey(miningDeskVeriId);
	}

	/**
	 * Returns all the mining application desk veris.
	 *
	 * @return the mining application desk veris
	 */
	public static List<MiningApplicationDeskVeri> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the mining application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application desk veris
	 * @param end the upper bound of the range of mining application desk veris (not inclusive)
	 * @return the range of mining application desk veris
	 */
	public static List<MiningApplicationDeskVeri> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the mining application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application desk veris
	 * @param end the upper bound of the range of mining application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining application desk veris
	 */
	public static List<MiningApplicationDeskVeri> findAll(
		int start, int end,
		OrderByComparator<MiningApplicationDeskVeri> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application desk veris
	 * @param end the upper bound of the range of mining application desk veris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining application desk veris
	 */
	public static List<MiningApplicationDeskVeri> findAll(
		int start, int end,
		OrderByComparator<MiningApplicationDeskVeri> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the mining application desk veris from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of mining application desk veris.
	 *
	 * @return the number of mining application desk veris
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiningApplicationDeskVeriPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MiningApplicationDeskVeriPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MiningApplicationDeskVeriPersistence _persistence;

}