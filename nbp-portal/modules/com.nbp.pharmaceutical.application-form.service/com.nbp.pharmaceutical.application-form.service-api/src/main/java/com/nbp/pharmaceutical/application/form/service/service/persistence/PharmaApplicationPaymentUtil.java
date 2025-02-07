/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.pharmaceutical.application.form.service.model.PharmaApplicationPayment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the pharma application payment service. This utility wraps <code>com.nbp.pharmaceutical.application.form.service.service.persistence.impl.PharmaApplicationPaymentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationPaymentPersistence
 * @generated
 */
public class PharmaApplicationPaymentUtil {

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
		PharmaApplicationPayment pharmaApplicationPayment) {

		getPersistence().clearCache(pharmaApplicationPayment);
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
	public static Map<Serializable, PharmaApplicationPayment>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PharmaApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PharmaApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PharmaApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PharmaApplicationPayment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PharmaApplicationPayment update(
		PharmaApplicationPayment pharmaApplicationPayment) {

		return getPersistence().update(pharmaApplicationPayment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PharmaApplicationPayment update(
		PharmaApplicationPayment pharmaApplicationPayment,
		ServiceContext serviceContext) {

		return getPersistence().update(
			pharmaApplicationPayment, serviceContext);
	}

	/**
	 * Returns the pharma application payment where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaApplicationPaymentException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application payment
	 * @throws NoSuchPharmaApplicationPaymentException if a matching pharma application payment could not be found
	 */
	public static PharmaApplicationPayment findBygetPAP_PAI(
			long pharmaApplicationId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationPaymentException {

		return getPersistence().findBygetPAP_PAI(pharmaApplicationId);
	}

	/**
	 * Returns the pharma application payment where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application payment, or <code>null</code> if a matching pharma application payment could not be found
	 */
	public static PharmaApplicationPayment fetchBygetPAP_PAI(
		long pharmaApplicationId) {

		return getPersistence().fetchBygetPAP_PAI(pharmaApplicationId);
	}

	/**
	 * Returns the pharma application payment where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application payment, or <code>null</code> if a matching pharma application payment could not be found
	 */
	public static PharmaApplicationPayment fetchBygetPAP_PAI(
		long pharmaApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetPAP_PAI(
			pharmaApplicationId, useFinderCache);
	}

	/**
	 * Removes the pharma application payment where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma application payment that was removed
	 */
	public static PharmaApplicationPayment removeBygetPAP_PAI(
			long pharmaApplicationId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationPaymentException {

		return getPersistence().removeBygetPAP_PAI(pharmaApplicationId);
	}

	/**
	 * Returns the number of pharma application payments where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma application payments
	 */
	public static int countBygetPAP_PAI(long pharmaApplicationId) {
		return getPersistence().countBygetPAP_PAI(pharmaApplicationId);
	}

	/**
	 * Caches the pharma application payment in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationPayment the pharma application payment
	 */
	public static void cacheResult(
		PharmaApplicationPayment pharmaApplicationPayment) {

		getPersistence().cacheResult(pharmaApplicationPayment);
	}

	/**
	 * Caches the pharma application payments in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationPayments the pharma application payments
	 */
	public static void cacheResult(
		List<PharmaApplicationPayment> pharmaApplicationPayments) {

		getPersistence().cacheResult(pharmaApplicationPayments);
	}

	/**
	 * Creates a new pharma application payment with the primary key. Does not add the pharma application payment to the database.
	 *
	 * @param pharmaApplicationPaymentId the primary key for the new pharma application payment
	 * @return the new pharma application payment
	 */
	public static PharmaApplicationPayment create(
		long pharmaApplicationPaymentId) {

		return getPersistence().create(pharmaApplicationPaymentId);
	}

	/**
	 * Removes the pharma application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaApplicationPaymentId the primary key of the pharma application payment
	 * @return the pharma application payment that was removed
	 * @throws NoSuchPharmaApplicationPaymentException if a pharma application payment with the primary key could not be found
	 */
	public static PharmaApplicationPayment remove(
			long pharmaApplicationPaymentId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationPaymentException {

		return getPersistence().remove(pharmaApplicationPaymentId);
	}

	public static PharmaApplicationPayment updateImpl(
		PharmaApplicationPayment pharmaApplicationPayment) {

		return getPersistence().updateImpl(pharmaApplicationPayment);
	}

	/**
	 * Returns the pharma application payment with the primary key or throws a <code>NoSuchPharmaApplicationPaymentException</code> if it could not be found.
	 *
	 * @param pharmaApplicationPaymentId the primary key of the pharma application payment
	 * @return the pharma application payment
	 * @throws NoSuchPharmaApplicationPaymentException if a pharma application payment with the primary key could not be found
	 */
	public static PharmaApplicationPayment findByPrimaryKey(
			long pharmaApplicationPaymentId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationPaymentException {

		return getPersistence().findByPrimaryKey(pharmaApplicationPaymentId);
	}

	/**
	 * Returns the pharma application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaApplicationPaymentId the primary key of the pharma application payment
	 * @return the pharma application payment, or <code>null</code> if a pharma application payment with the primary key could not be found
	 */
	public static PharmaApplicationPayment fetchByPrimaryKey(
		long pharmaApplicationPaymentId) {

		return getPersistence().fetchByPrimaryKey(pharmaApplicationPaymentId);
	}

	/**
	 * Returns all the pharma application payments.
	 *
	 * @return the pharma application payments
	 */
	public static List<PharmaApplicationPayment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the pharma application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application payments
	 * @param end the upper bound of the range of pharma application payments (not inclusive)
	 * @return the range of pharma application payments
	 */
	public static List<PharmaApplicationPayment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the pharma application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application payments
	 * @param end the upper bound of the range of pharma application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma application payments
	 */
	public static List<PharmaApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<PharmaApplicationPayment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application payments
	 * @param end the upper bound of the range of pharma application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma application payments
	 */
	public static List<PharmaApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<PharmaApplicationPayment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the pharma application payments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of pharma application payments.
	 *
	 * @return the number of pharma application payments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PharmaApplicationPaymentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		PharmaApplicationPaymentPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile PharmaApplicationPaymentPersistence _persistence;

}