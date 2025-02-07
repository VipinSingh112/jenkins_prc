/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.mining.lease.application.service.model.MiningAppPayment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the mining app payment service. This utility wraps <code>com.nbp.mining.lease.application.service.service.persistence.impl.MiningAppPaymentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningAppPaymentPersistence
 * @generated
 */
public class MiningAppPaymentUtil {

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
	public static void clearCache(MiningAppPayment miningAppPayment) {
		getPersistence().clearCache(miningAppPayment);
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
	public static Map<Serializable, MiningAppPayment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiningAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiningAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiningAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiningAppPayment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiningAppPayment update(MiningAppPayment miningAppPayment) {
		return getPersistence().update(miningAppPayment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiningAppPayment update(
		MiningAppPayment miningAppPayment, ServiceContext serviceContext) {

		return getPersistence().update(miningAppPayment, serviceContext);
	}

	/**
	 * Returns the mining app payment where miningLeaseApplicationId = &#63; or throws a <code>NoSuchMiningAppPaymentException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining app payment
	 * @throws NoSuchMiningAppPaymentException if a matching mining app payment could not be found
	 */
	public static MiningAppPayment findBygetMiningById(
			long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningAppPaymentException {

		return getPersistence().findBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the mining app payment where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining app payment, or <code>null</code> if a matching mining app payment could not be found
	 */
	public static MiningAppPayment fetchBygetMiningById(
		long miningLeaseApplicationId) {

		return getPersistence().fetchBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the mining app payment where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining app payment, or <code>null</code> if a matching mining app payment could not be found
	 */
	public static MiningAppPayment fetchBygetMiningById(
		long miningLeaseApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetMiningById(
			miningLeaseApplicationId, useFinderCache);
	}

	/**
	 * Removes the mining app payment where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the mining app payment that was removed
	 */
	public static MiningAppPayment removeBygetMiningById(
			long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningAppPaymentException {

		return getPersistence().removeBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Returns the number of mining app payments where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining app payments
	 */
	public static int countBygetMiningById(long miningLeaseApplicationId) {
		return getPersistence().countBygetMiningById(miningLeaseApplicationId);
	}

	/**
	 * Caches the mining app payment in the entity cache if it is enabled.
	 *
	 * @param miningAppPayment the mining app payment
	 */
	public static void cacheResult(MiningAppPayment miningAppPayment) {
		getPersistence().cacheResult(miningAppPayment);
	}

	/**
	 * Caches the mining app payments in the entity cache if it is enabled.
	 *
	 * @param miningAppPayments the mining app payments
	 */
	public static void cacheResult(List<MiningAppPayment> miningAppPayments) {
		getPersistence().cacheResult(miningAppPayments);
	}

	/**
	 * Creates a new mining app payment with the primary key. Does not add the mining app payment to the database.
	 *
	 * @param miningAppPaymentId the primary key for the new mining app payment
	 * @return the new mining app payment
	 */
	public static MiningAppPayment create(long miningAppPaymentId) {
		return getPersistence().create(miningAppPaymentId);
	}

	/**
	 * Removes the mining app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningAppPaymentId the primary key of the mining app payment
	 * @return the mining app payment that was removed
	 * @throws NoSuchMiningAppPaymentException if a mining app payment with the primary key could not be found
	 */
	public static MiningAppPayment remove(long miningAppPaymentId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningAppPaymentException {

		return getPersistence().remove(miningAppPaymentId);
	}

	public static MiningAppPayment updateImpl(
		MiningAppPayment miningAppPayment) {

		return getPersistence().updateImpl(miningAppPayment);
	}

	/**
	 * Returns the mining app payment with the primary key or throws a <code>NoSuchMiningAppPaymentException</code> if it could not be found.
	 *
	 * @param miningAppPaymentId the primary key of the mining app payment
	 * @return the mining app payment
	 * @throws NoSuchMiningAppPaymentException if a mining app payment with the primary key could not be found
	 */
	public static MiningAppPayment findByPrimaryKey(long miningAppPaymentId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningAppPaymentException {

		return getPersistence().findByPrimaryKey(miningAppPaymentId);
	}

	/**
	 * Returns the mining app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningAppPaymentId the primary key of the mining app payment
	 * @return the mining app payment, or <code>null</code> if a mining app payment with the primary key could not be found
	 */
	public static MiningAppPayment fetchByPrimaryKey(long miningAppPaymentId) {
		return getPersistence().fetchByPrimaryKey(miningAppPaymentId);
	}

	/**
	 * Returns all the mining app payments.
	 *
	 * @return the mining app payments
	 */
	public static List<MiningAppPayment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the mining app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining app payments
	 * @param end the upper bound of the range of mining app payments (not inclusive)
	 * @return the range of mining app payments
	 */
	public static List<MiningAppPayment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the mining app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining app payments
	 * @param end the upper bound of the range of mining app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining app payments
	 */
	public static List<MiningAppPayment> findAll(
		int start, int end,
		OrderByComparator<MiningAppPayment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining app payments
	 * @param end the upper bound of the range of mining app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining app payments
	 */
	public static List<MiningAppPayment> findAll(
		int start, int end,
		OrderByComparator<MiningAppPayment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the mining app payments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of mining app payments.
	 *
	 * @return the number of mining app payments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiningAppPaymentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(MiningAppPaymentPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile MiningAppPaymentPersistence _persistence;

}