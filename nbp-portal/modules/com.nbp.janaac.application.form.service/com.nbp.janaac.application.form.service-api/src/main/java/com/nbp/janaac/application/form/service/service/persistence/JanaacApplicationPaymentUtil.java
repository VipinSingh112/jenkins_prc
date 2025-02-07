/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.JanaacApplicationPayment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the janaac application payment service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.JanaacApplicationPaymentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JanaacApplicationPaymentPersistence
 * @generated
 */
public class JanaacApplicationPaymentUtil {

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
		JanaacApplicationPayment janaacApplicationPayment) {

		getPersistence().clearCache(janaacApplicationPayment);
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
	public static Map<Serializable, JanaacApplicationPayment>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JanaacApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JanaacApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JanaacApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JanaacApplicationPayment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JanaacApplicationPayment update(
		JanaacApplicationPayment janaacApplicationPayment) {

		return getPersistence().update(janaacApplicationPayment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JanaacApplicationPayment update(
		JanaacApplicationPayment janaacApplicationPayment,
		ServiceContext serviceContext) {

		return getPersistence().update(
			janaacApplicationPayment, serviceContext);
	}

	/**
	 * Returns the janaac application payment where janaacApplicationId = &#63; or throws a <code>NoSuchJanaacApplicationPaymentException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac application payment
	 * @throws NoSuchJanaacApplicationPaymentException if a matching janaac application payment could not be found
	 */
	public static JanaacApplicationPayment findBygetJanaacById(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationPaymentException {

		return getPersistence().findBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the janaac application payment where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac application payment, or <code>null</code> if a matching janaac application payment could not be found
	 */
	public static JanaacApplicationPayment fetchBygetJanaacById(
		long janaacApplicationId) {

		return getPersistence().fetchBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the janaac application payment where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application payment, or <code>null</code> if a matching janaac application payment could not be found
	 */
	public static JanaacApplicationPayment fetchBygetJanaacById(
		long janaacApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJanaacById(
			janaacApplicationId, useFinderCache);
	}

	/**
	 * Removes the janaac application payment where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the janaac application payment that was removed
	 */
	public static JanaacApplicationPayment removeBygetJanaacById(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationPaymentException {

		return getPersistence().removeBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the number of janaac application payments where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching janaac application payments
	 */
	public static int countBygetJanaacById(long janaacApplicationId) {
		return getPersistence().countBygetJanaacById(janaacApplicationId);
	}

	/**
	 * Caches the janaac application payment in the entity cache if it is enabled.
	 *
	 * @param janaacApplicationPayment the janaac application payment
	 */
	public static void cacheResult(
		JanaacApplicationPayment janaacApplicationPayment) {

		getPersistence().cacheResult(janaacApplicationPayment);
	}

	/**
	 * Caches the janaac application payments in the entity cache if it is enabled.
	 *
	 * @param janaacApplicationPayments the janaac application payments
	 */
	public static void cacheResult(
		List<JanaacApplicationPayment> janaacApplicationPayments) {

		getPersistence().cacheResult(janaacApplicationPayments);
	}

	/**
	 * Creates a new janaac application payment with the primary key. Does not add the janaac application payment to the database.
	 *
	 * @param janaacApplicationPaymentId the primary key for the new janaac application payment
	 * @return the new janaac application payment
	 */
	public static JanaacApplicationPayment create(
		long janaacApplicationPaymentId) {

		return getPersistence().create(janaacApplicationPaymentId);
	}

	/**
	 * Removes the janaac application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacApplicationPaymentId the primary key of the janaac application payment
	 * @return the janaac application payment that was removed
	 * @throws NoSuchJanaacApplicationPaymentException if a janaac application payment with the primary key could not be found
	 */
	public static JanaacApplicationPayment remove(
			long janaacApplicationPaymentId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationPaymentException {

		return getPersistence().remove(janaacApplicationPaymentId);
	}

	public static JanaacApplicationPayment updateImpl(
		JanaacApplicationPayment janaacApplicationPayment) {

		return getPersistence().updateImpl(janaacApplicationPayment);
	}

	/**
	 * Returns the janaac application payment with the primary key or throws a <code>NoSuchJanaacApplicationPaymentException</code> if it could not be found.
	 *
	 * @param janaacApplicationPaymentId the primary key of the janaac application payment
	 * @return the janaac application payment
	 * @throws NoSuchJanaacApplicationPaymentException if a janaac application payment with the primary key could not be found
	 */
	public static JanaacApplicationPayment findByPrimaryKey(
			long janaacApplicationPaymentId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationPaymentException {

		return getPersistence().findByPrimaryKey(janaacApplicationPaymentId);
	}

	/**
	 * Returns the janaac application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacApplicationPaymentId the primary key of the janaac application payment
	 * @return the janaac application payment, or <code>null</code> if a janaac application payment with the primary key could not be found
	 */
	public static JanaacApplicationPayment fetchByPrimaryKey(
		long janaacApplicationPaymentId) {

		return getPersistence().fetchByPrimaryKey(janaacApplicationPaymentId);
	}

	/**
	 * Returns all the janaac application payments.
	 *
	 * @return the janaac application payments
	 */
	public static List<JanaacApplicationPayment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the janaac application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac application payments
	 * @param end the upper bound of the range of janaac application payments (not inclusive)
	 * @return the range of janaac application payments
	 */
	public static List<JanaacApplicationPayment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the janaac application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac application payments
	 * @param end the upper bound of the range of janaac application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac application payments
	 */
	public static List<JanaacApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<JanaacApplicationPayment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the janaac application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac application payments
	 * @param end the upper bound of the range of janaac application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac application payments
	 */
	public static List<JanaacApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<JanaacApplicationPayment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the janaac application payments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of janaac application payments.
	 *
	 * @return the number of janaac application payments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JanaacApplicationPaymentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JanaacApplicationPaymentPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JanaacApplicationPaymentPersistence _persistence;

}