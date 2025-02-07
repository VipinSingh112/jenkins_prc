/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.mining.lease.application.service.model.MiningRenewalLicence;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the mining renewal licence service. This utility wraps <code>com.nbp.mining.lease.application.service.service.persistence.impl.MiningRenewalLicencePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningRenewalLicencePersistence
 * @generated
 */
public class MiningRenewalLicenceUtil {

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
	public static void clearCache(MiningRenewalLicence miningRenewalLicence) {
		getPersistence().clearCache(miningRenewalLicence);
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
	public static Map<Serializable, MiningRenewalLicence> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiningRenewalLicence> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiningRenewalLicence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiningRenewalLicence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiningRenewalLicence> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiningRenewalLicence update(
		MiningRenewalLicence miningRenewalLicence) {

		return getPersistence().update(miningRenewalLicence);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiningRenewalLicence update(
		MiningRenewalLicence miningRenewalLicence,
		ServiceContext serviceContext) {

		return getPersistence().update(miningRenewalLicence, serviceContext);
	}

	/**
	 * Returns the mining renewal licence where miningLeaseApplicationId = &#63; or throws a <code>NoSuchMiningRenewalLicenceException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining renewal licence
	 * @throws NoSuchMiningRenewalLicenceException if a matching mining renewal licence could not be found
	 */
	public static MiningRenewalLicence findBygetMiningById(
			long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningRenewalLicenceException {

		return getPersistence().findBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the mining renewal licence where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining renewal licence, or <code>null</code> if a matching mining renewal licence could not be found
	 */
	public static MiningRenewalLicence fetchBygetMiningById(
		long miningLeaseApplicationId) {

		return getPersistence().fetchBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the mining renewal licence where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining renewal licence, or <code>null</code> if a matching mining renewal licence could not be found
	 */
	public static MiningRenewalLicence fetchBygetMiningById(
		long miningLeaseApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetMiningById(
			miningLeaseApplicationId, useFinderCache);
	}

	/**
	 * Removes the mining renewal licence where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the mining renewal licence that was removed
	 */
	public static MiningRenewalLicence removeBygetMiningById(
			long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningRenewalLicenceException {

		return getPersistence().removeBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the number of mining renewal licences where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining renewal licences
	 */
	public static int countBygetMiningById(long miningLeaseApplicationId) {
		return getPersistence().countBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Caches the mining renewal licence in the entity cache if it is enabled.
	 *
	 * @param miningRenewalLicence the mining renewal licence
	 */
	public static void cacheResult(MiningRenewalLicence miningRenewalLicence) {
		getPersistence().cacheResult(miningRenewalLicence);
	}

	/**
	 * Caches the mining renewal licences in the entity cache if it is enabled.
	 *
	 * @param miningRenewalLicences the mining renewal licences
	 */
	public static void cacheResult(
		List<MiningRenewalLicence> miningRenewalLicences) {

		getPersistence().cacheResult(miningRenewalLicences);
	}

	/**
	 * Creates a new mining renewal licence with the primary key. Does not add the mining renewal licence to the database.
	 *
	 * @param miningRenewalLicenceId the primary key for the new mining renewal licence
	 * @return the new mining renewal licence
	 */
	public static MiningRenewalLicence create(long miningRenewalLicenceId) {
		return getPersistence().create(miningRenewalLicenceId);
	}

	/**
	 * Removes the mining renewal licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningRenewalLicenceId the primary key of the mining renewal licence
	 * @return the mining renewal licence that was removed
	 * @throws NoSuchMiningRenewalLicenceException if a mining renewal licence with the primary key could not be found
	 */
	public static MiningRenewalLicence remove(long miningRenewalLicenceId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningRenewalLicenceException {

		return getPersistence().remove(miningRenewalLicenceId);
	}

	public static MiningRenewalLicence updateImpl(
		MiningRenewalLicence miningRenewalLicence) {

		return getPersistence().updateImpl(miningRenewalLicence);
	}

	/**
	 * Returns the mining renewal licence with the primary key or throws a <code>NoSuchMiningRenewalLicenceException</code> if it could not be found.
	 *
	 * @param miningRenewalLicenceId the primary key of the mining renewal licence
	 * @return the mining renewal licence
	 * @throws NoSuchMiningRenewalLicenceException if a mining renewal licence with the primary key could not be found
	 */
	public static MiningRenewalLicence findByPrimaryKey(
			long miningRenewalLicenceId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningRenewalLicenceException {

		return getPersistence().findByPrimaryKey(miningRenewalLicenceId);
	}

	/**
	 * Returns the mining renewal licence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningRenewalLicenceId the primary key of the mining renewal licence
	 * @return the mining renewal licence, or <code>null</code> if a mining renewal licence with the primary key could not be found
	 */
	public static MiningRenewalLicence fetchByPrimaryKey(
		long miningRenewalLicenceId) {

		return getPersistence().fetchByPrimaryKey(miningRenewalLicenceId);
	}

	/**
	 * Returns all the mining renewal licences.
	 *
	 * @return the mining renewal licences
	 */
	public static List<MiningRenewalLicence> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the mining renewal licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningRenewalLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining renewal licences
	 * @param end the upper bound of the range of mining renewal licences (not inclusive)
	 * @return the range of mining renewal licences
	 */
	public static List<MiningRenewalLicence> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the mining renewal licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningRenewalLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining renewal licences
	 * @param end the upper bound of the range of mining renewal licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining renewal licences
	 */
	public static List<MiningRenewalLicence> findAll(
		int start, int end,
		OrderByComparator<MiningRenewalLicence> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining renewal licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningRenewalLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining renewal licences
	 * @param end the upper bound of the range of mining renewal licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining renewal licences
	 */
	public static List<MiningRenewalLicence> findAll(
		int start, int end,
		OrderByComparator<MiningRenewalLicence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the mining renewal licences from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of mining renewal licences.
	 *
	 * @return the number of mining renewal licences
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiningRenewalLicencePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MiningRenewalLicencePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MiningRenewalLicencePersistence _persistence;

}