/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.mining.lease.application.service.model.MiningProspectingLicense;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the mining prospecting license service. This utility wraps <code>com.nbp.mining.lease.application.service.service.persistence.impl.MiningProspectingLicensePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingLicensePersistence
 * @generated
 */
public class MiningProspectingLicenseUtil {

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
		MiningProspectingLicense miningProspectingLicense) {

		getPersistence().clearCache(miningProspectingLicense);
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
	public static Map<Serializable, MiningProspectingLicense>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiningProspectingLicense> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiningProspectingLicense> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiningProspectingLicense> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiningProspectingLicense> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiningProspectingLicense update(
		MiningProspectingLicense miningProspectingLicense) {

		return getPersistence().update(miningProspectingLicense);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiningProspectingLicense update(
		MiningProspectingLicense miningProspectingLicense,
		ServiceContext serviceContext) {

		return getPersistence().update(
			miningProspectingLicense, serviceContext);
	}

	/**
	 * Returns the mining prospecting license where miningLeaseApplicationId = &#63; or throws a <code>NoSuchMiningProspectingLicenseException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining prospecting license
	 * @throws NoSuchMiningProspectingLicenseException if a matching mining prospecting license could not be found
	 */
	public static MiningProspectingLicense findBygetMiningById(
			long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningProspectingLicenseException {

		return getPersistence().findBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the mining prospecting license where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining prospecting license, or <code>null</code> if a matching mining prospecting license could not be found
	 */
	public static MiningProspectingLicense fetchBygetMiningById(
		long miningLeaseApplicationId) {

		return getPersistence().fetchBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the mining prospecting license where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining prospecting license, or <code>null</code> if a matching mining prospecting license could not be found
	 */
	public static MiningProspectingLicense fetchBygetMiningById(
		long miningLeaseApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetMiningById(
			miningLeaseApplicationId, useFinderCache);
	}

	/**
	 * Removes the mining prospecting license where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the mining prospecting license that was removed
	 */
	public static MiningProspectingLicense removeBygetMiningById(
			long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningProspectingLicenseException {

		return getPersistence().removeBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the number of mining prospecting licenses where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining prospecting licenses
	 */
	public static int countBygetMiningById(long miningLeaseApplicationId) {
		return getPersistence().countBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Caches the mining prospecting license in the entity cache if it is enabled.
	 *
	 * @param miningProspectingLicense the mining prospecting license
	 */
	public static void cacheResult(
		MiningProspectingLicense miningProspectingLicense) {

		getPersistence().cacheResult(miningProspectingLicense);
	}

	/**
	 * Caches the mining prospecting licenses in the entity cache if it is enabled.
	 *
	 * @param miningProspectingLicenses the mining prospecting licenses
	 */
	public static void cacheResult(
		List<MiningProspectingLicense> miningProspectingLicenses) {

		getPersistence().cacheResult(miningProspectingLicenses);
	}

	/**
	 * Creates a new mining prospecting license with the primary key. Does not add the mining prospecting license to the database.
	 *
	 * @param miningProspectingLicenseId the primary key for the new mining prospecting license
	 * @return the new mining prospecting license
	 */
	public static MiningProspectingLicense create(
		long miningProspectingLicenseId) {

		return getPersistence().create(miningProspectingLicenseId);
	}

	/**
	 * Removes the mining prospecting license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningProspectingLicenseId the primary key of the mining prospecting license
	 * @return the mining prospecting license that was removed
	 * @throws NoSuchMiningProspectingLicenseException if a mining prospecting license with the primary key could not be found
	 */
	public static MiningProspectingLicense remove(
			long miningProspectingLicenseId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningProspectingLicenseException {

		return getPersistence().remove(miningProspectingLicenseId);
	}

	public static MiningProspectingLicense updateImpl(
		MiningProspectingLicense miningProspectingLicense) {

		return getPersistence().updateImpl(miningProspectingLicense);
	}

	/**
	 * Returns the mining prospecting license with the primary key or throws a <code>NoSuchMiningProspectingLicenseException</code> if it could not be found.
	 *
	 * @param miningProspectingLicenseId the primary key of the mining prospecting license
	 * @return the mining prospecting license
	 * @throws NoSuchMiningProspectingLicenseException if a mining prospecting license with the primary key could not be found
	 */
	public static MiningProspectingLicense findByPrimaryKey(
			long miningProspectingLicenseId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningProspectingLicenseException {

		return getPersistence().findByPrimaryKey(miningProspectingLicenseId);
	}

	/**
	 * Returns the mining prospecting license with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningProspectingLicenseId the primary key of the mining prospecting license
	 * @return the mining prospecting license, or <code>null</code> if a mining prospecting license with the primary key could not be found
	 */
	public static MiningProspectingLicense fetchByPrimaryKey(
		long miningProspectingLicenseId) {

		return getPersistence().fetchByPrimaryKey(miningProspectingLicenseId);
	}

	/**
	 * Returns all the mining prospecting licenses.
	 *
	 * @return the mining prospecting licenses
	 */
	public static List<MiningProspectingLicense> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the mining prospecting licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting licenses
	 * @param end the upper bound of the range of mining prospecting licenses (not inclusive)
	 * @return the range of mining prospecting licenses
	 */
	public static List<MiningProspectingLicense> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the mining prospecting licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting licenses
	 * @param end the upper bound of the range of mining prospecting licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining prospecting licenses
	 */
	public static List<MiningProspectingLicense> findAll(
		int start, int end,
		OrderByComparator<MiningProspectingLicense> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining prospecting licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting licenses
	 * @param end the upper bound of the range of mining prospecting licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining prospecting licenses
	 */
	public static List<MiningProspectingLicense> findAll(
		int start, int end,
		OrderByComparator<MiningProspectingLicense> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the mining prospecting licenses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of mining prospecting licenses.
	 *
	 * @return the number of mining prospecting licenses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiningProspectingLicensePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MiningProspectingLicensePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MiningProspectingLicensePersistence _persistence;

}