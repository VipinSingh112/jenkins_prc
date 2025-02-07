/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.services.application.form.service.model.OsiServicesAppPayment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi services app payment service. This utility wraps <code>com.nbp.osi.services.application.form.service.service.persistence.impl.OsiServicesAppPaymentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesAppPaymentPersistence
 * @generated
 */
public class OsiServicesAppPaymentUtil {

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
	public static void clearCache(OsiServicesAppPayment osiServicesAppPayment) {
		getPersistence().clearCache(osiServicesAppPayment);
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
	public static Map<Serializable, OsiServicesAppPayment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiServicesAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiServicesAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiServicesAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiServicesAppPayment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiServicesAppPayment update(
		OsiServicesAppPayment osiServicesAppPayment) {

		return getPersistence().update(osiServicesAppPayment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiServicesAppPayment update(
		OsiServicesAppPayment osiServicesAppPayment,
		ServiceContext serviceContext) {

		return getPersistence().update(osiServicesAppPayment, serviceContext);
	}

	/**
	 * Returns the osi services app payment where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesAppPaymentException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services app payment
	 * @throws NoSuchOsiServicesAppPaymentException if a matching osi services app payment could not be found
	 */
	public static OsiServicesAppPayment findBygetOsiServiceAppPaymentById(
			long osiServicesApplicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesAppPaymentException {

		return getPersistence().findBygetOsiServiceAppPaymentById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the osi services app payment where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services app payment, or <code>null</code> if a matching osi services app payment could not be found
	 */
	public static OsiServicesAppPayment fetchBygetOsiServiceAppPaymentById(
		long osiServicesApplicationId) {

		return getPersistence().fetchBygetOsiServiceAppPaymentById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the osi services app payment where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services app payment, or <code>null</code> if a matching osi services app payment could not be found
	 */
	public static OsiServicesAppPayment fetchBygetOsiServiceAppPaymentById(
		long osiServicesApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiServiceAppPaymentById(
			osiServicesApplicationId, useFinderCache);
	}

	/**
	 * Removes the osi services app payment where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services app payment that was removed
	 */
	public static OsiServicesAppPayment removeBygetOsiServiceAppPaymentById(
			long osiServicesApplicationId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesAppPaymentException {

		return getPersistence().removeBygetOsiServiceAppPaymentById(
			osiServicesApplicationId);
	}

	/**
	 * Returns the number of osi services app payments where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services app payments
	 */
	public static int countBygetOsiServiceAppPaymentById(
		long osiServicesApplicationId) {

		return getPersistence().countBygetOsiServiceAppPaymentById(
			osiServicesApplicationId);
	}

	/**
	 * Caches the osi services app payment in the entity cache if it is enabled.
	 *
	 * @param osiServicesAppPayment the osi services app payment
	 */
	public static void cacheResult(
		OsiServicesAppPayment osiServicesAppPayment) {

		getPersistence().cacheResult(osiServicesAppPayment);
	}

	/**
	 * Caches the osi services app payments in the entity cache if it is enabled.
	 *
	 * @param osiServicesAppPayments the osi services app payments
	 */
	public static void cacheResult(
		List<OsiServicesAppPayment> osiServicesAppPayments) {

		getPersistence().cacheResult(osiServicesAppPayments);
	}

	/**
	 * Creates a new osi services app payment with the primary key. Does not add the osi services app payment to the database.
	 *
	 * @param osiServicesAppPaymentId the primary key for the new osi services app payment
	 * @return the new osi services app payment
	 */
	public static OsiServicesAppPayment create(long osiServicesAppPaymentId) {
		return getPersistence().create(osiServicesAppPaymentId);
	}

	/**
	 * Removes the osi services app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiServicesAppPaymentId the primary key of the osi services app payment
	 * @return the osi services app payment that was removed
	 * @throws NoSuchOsiServicesAppPaymentException if a osi services app payment with the primary key could not be found
	 */
	public static OsiServicesAppPayment remove(long osiServicesAppPaymentId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesAppPaymentException {

		return getPersistence().remove(osiServicesAppPaymentId);
	}

	public static OsiServicesAppPayment updateImpl(
		OsiServicesAppPayment osiServicesAppPayment) {

		return getPersistence().updateImpl(osiServicesAppPayment);
	}

	/**
	 * Returns the osi services app payment with the primary key or throws a <code>NoSuchOsiServicesAppPaymentException</code> if it could not be found.
	 *
	 * @param osiServicesAppPaymentId the primary key of the osi services app payment
	 * @return the osi services app payment
	 * @throws NoSuchOsiServicesAppPaymentException if a osi services app payment with the primary key could not be found
	 */
	public static OsiServicesAppPayment findByPrimaryKey(
			long osiServicesAppPaymentId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesAppPaymentException {

		return getPersistence().findByPrimaryKey(osiServicesAppPaymentId);
	}

	/**
	 * Returns the osi services app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiServicesAppPaymentId the primary key of the osi services app payment
	 * @return the osi services app payment, or <code>null</code> if a osi services app payment with the primary key could not be found
	 */
	public static OsiServicesAppPayment fetchByPrimaryKey(
		long osiServicesAppPaymentId) {

		return getPersistence().fetchByPrimaryKey(osiServicesAppPaymentId);
	}

	/**
	 * Returns all the osi services app payments.
	 *
	 * @return the osi services app payments
	 */
	public static List<OsiServicesAppPayment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi services app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services app payments
	 * @param end the upper bound of the range of osi services app payments (not inclusive)
	 * @return the range of osi services app payments
	 */
	public static List<OsiServicesAppPayment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi services app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services app payments
	 * @param end the upper bound of the range of osi services app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services app payments
	 */
	public static List<OsiServicesAppPayment> findAll(
		int start, int end,
		OrderByComparator<OsiServicesAppPayment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services app payments
	 * @param end the upper bound of the range of osi services app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services app payments
	 */
	public static List<OsiServicesAppPayment> findAll(
		int start, int end,
		OrderByComparator<OsiServicesAppPayment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi services app payments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi services app payments.
	 *
	 * @return the number of osi services app payments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiServicesAppPaymentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OsiServicesAppPaymentPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OsiServicesAppPaymentPersistence _persistence;

}