/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjAppPayment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj app payment service. This utility wraps <code>com.nbp.ncbj.application.form.service.service.persistence.impl.NcbjAppPaymentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjAppPaymentPersistence
 * @generated
 */
public class NcbjAppPaymentUtil {

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
	public static void clearCache(NcbjAppPayment ncbjAppPayment) {
		getPersistence().clearCache(ncbjAppPayment);
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
	public static Map<Serializable, NcbjAppPayment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjAppPayment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjAppPayment update(NcbjAppPayment ncbjAppPayment) {
		return getPersistence().update(ncbjAppPayment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjAppPayment update(
		NcbjAppPayment ncbjAppPayment, ServiceContext serviceContext) {

		return getPersistence().update(ncbjAppPayment, serviceContext);
	}

	/**
	 * Returns the ncbj app payment where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjAppPaymentException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj app payment
	 * @throws NoSuchNcbjAppPaymentException if a matching ncbj app payment could not be found
	 */
	public static NcbjAppPayment findBygetNcbjAppById(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjAppPaymentException {

		return getPersistence().findBygetNcbjAppById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj app payment where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj app payment, or <code>null</code> if a matching ncbj app payment could not be found
	 */
	public static NcbjAppPayment fetchBygetNcbjAppById(long ncbjApplicationId) {
		return getPersistence().fetchBygetNcbjAppById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj app payment where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj app payment, or <code>null</code> if a matching ncbj app payment could not be found
	 */
	public static NcbjAppPayment fetchBygetNcbjAppById(
		long ncbjApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNcbjAppById(
			ncbjApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncbj app payment where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj app payment that was removed
	 */
	public static NcbjAppPayment removeBygetNcbjAppById(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjAppPaymentException {

		return getPersistence().removeBygetNcbjAppById(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj app payments where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj app payments
	 */
	public static int countBygetNcbjAppById(long ncbjApplicationId) {
		return getPersistence().countBygetNcbjAppById(ncbjApplicationId);
	}

	/**
	 * Caches the ncbj app payment in the entity cache if it is enabled.
	 *
	 * @param ncbjAppPayment the ncbj app payment
	 */
	public static void cacheResult(NcbjAppPayment ncbjAppPayment) {
		getPersistence().cacheResult(ncbjAppPayment);
	}

	/**
	 * Caches the ncbj app payments in the entity cache if it is enabled.
	 *
	 * @param ncbjAppPayments the ncbj app payments
	 */
	public static void cacheResult(List<NcbjAppPayment> ncbjAppPayments) {
		getPersistence().cacheResult(ncbjAppPayments);
	}

	/**
	 * Creates a new ncbj app payment with the primary key. Does not add the ncbj app payment to the database.
	 *
	 * @param ncbjAppPaymentId the primary key for the new ncbj app payment
	 * @return the new ncbj app payment
	 */
	public static NcbjAppPayment create(long ncbjAppPaymentId) {
		return getPersistence().create(ncbjAppPaymentId);
	}

	/**
	 * Removes the ncbj app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjAppPaymentId the primary key of the ncbj app payment
	 * @return the ncbj app payment that was removed
	 * @throws NoSuchNcbjAppPaymentException if a ncbj app payment with the primary key could not be found
	 */
	public static NcbjAppPayment remove(long ncbjAppPaymentId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjAppPaymentException {

		return getPersistence().remove(ncbjAppPaymentId);
	}

	public static NcbjAppPayment updateImpl(NcbjAppPayment ncbjAppPayment) {
		return getPersistence().updateImpl(ncbjAppPayment);
	}

	/**
	 * Returns the ncbj app payment with the primary key or throws a <code>NoSuchNcbjAppPaymentException</code> if it could not be found.
	 *
	 * @param ncbjAppPaymentId the primary key of the ncbj app payment
	 * @return the ncbj app payment
	 * @throws NoSuchNcbjAppPaymentException if a ncbj app payment with the primary key could not be found
	 */
	public static NcbjAppPayment findByPrimaryKey(long ncbjAppPaymentId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjAppPaymentException {

		return getPersistence().findByPrimaryKey(ncbjAppPaymentId);
	}

	/**
	 * Returns the ncbj app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjAppPaymentId the primary key of the ncbj app payment
	 * @return the ncbj app payment, or <code>null</code> if a ncbj app payment with the primary key could not be found
	 */
	public static NcbjAppPayment fetchByPrimaryKey(long ncbjAppPaymentId) {
		return getPersistence().fetchByPrimaryKey(ncbjAppPaymentId);
	}

	/**
	 * Returns all the ncbj app payments.
	 *
	 * @return the ncbj app payments
	 */
	public static List<NcbjAppPayment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj app payments
	 * @param end the upper bound of the range of ncbj app payments (not inclusive)
	 * @return the range of ncbj app payments
	 */
	public static List<NcbjAppPayment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj app payments
	 * @param end the upper bound of the range of ncbj app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj app payments
	 */
	public static List<NcbjAppPayment> findAll(
		int start, int end,
		OrderByComparator<NcbjAppPayment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj app payments
	 * @param end the upper bound of the range of ncbj app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj app payments
	 */
	public static List<NcbjAppPayment> findAll(
		int start, int end, OrderByComparator<NcbjAppPayment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj app payments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj app payments.
	 *
	 * @return the number of ncbj app payments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjAppPaymentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(NcbjAppPaymentPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile NcbjAppPaymentPersistence _persistence;

}