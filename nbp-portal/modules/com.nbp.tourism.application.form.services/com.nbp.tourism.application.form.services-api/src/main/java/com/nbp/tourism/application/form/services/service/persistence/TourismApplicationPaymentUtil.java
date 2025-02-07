/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismApplicationPayment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism application payment service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismApplicationPaymentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationPaymentPersistence
 * @generated
 */
public class TourismApplicationPaymentUtil {

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
		TourismApplicationPayment tourismApplicationPayment) {

		getPersistence().clearCache(tourismApplicationPayment);
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
	public static Map<Serializable, TourismApplicationPayment>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismApplicationPayment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismApplicationPayment update(
		TourismApplicationPayment tourismApplicationPayment) {

		return getPersistence().update(tourismApplicationPayment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismApplicationPayment update(
		TourismApplicationPayment tourismApplicationPayment,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismApplicationPayment, serviceContext);
	}

	/**
	 * Returns the tourism application payment where tourismApplicationId = &#63; or throws a <code>NoSuchTourismApplicationPaymentException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism application payment
	 * @throws NoSuchTourismApplicationPaymentException if a matching tourism application payment could not be found
	 */
	public static TourismApplicationPayment findBygetTAP_TAI(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationPaymentException {

		return getPersistence().findBygetTAP_TAI(tourismApplicationId);
	}

	/**
	 * Returns the tourism application payment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism application payment, or <code>null</code> if a matching tourism application payment could not be found
	 */
	public static TourismApplicationPayment fetchBygetTAP_TAI(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTAP_TAI(tourismApplicationId);
	}

	/**
	 * Returns the tourism application payment where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application payment, or <code>null</code> if a matching tourism application payment could not be found
	 */
	public static TourismApplicationPayment fetchBygetTAP_TAI(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTAP_TAI(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism application payment where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism application payment that was removed
	 */
	public static TourismApplicationPayment removeBygetTAP_TAI(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationPaymentException {

		return getPersistence().removeBygetTAP_TAI(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism application payments where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism application payments
	 */
	public static int countBygetTAP_TAI(long tourismApplicationId) {
		return getPersistence().countBygetTAP_TAI(tourismApplicationId);
	}

	/**
	 * Caches the tourism application payment in the entity cache if it is enabled.
	 *
	 * @param tourismApplicationPayment the tourism application payment
	 */
	public static void cacheResult(
		TourismApplicationPayment tourismApplicationPayment) {

		getPersistence().cacheResult(tourismApplicationPayment);
	}

	/**
	 * Caches the tourism application payments in the entity cache if it is enabled.
	 *
	 * @param tourismApplicationPayments the tourism application payments
	 */
	public static void cacheResult(
		List<TourismApplicationPayment> tourismApplicationPayments) {

		getPersistence().cacheResult(tourismApplicationPayments);
	}

	/**
	 * Creates a new tourism application payment with the primary key. Does not add the tourism application payment to the database.
	 *
	 * @param TourismApplicationPaymentId the primary key for the new tourism application payment
	 * @return the new tourism application payment
	 */
	public static TourismApplicationPayment create(
		long TourismApplicationPaymentId) {

		return getPersistence().create(TourismApplicationPaymentId);
	}

	/**
	 * Removes the tourism application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param TourismApplicationPaymentId the primary key of the tourism application payment
	 * @return the tourism application payment that was removed
	 * @throws NoSuchTourismApplicationPaymentException if a tourism application payment with the primary key could not be found
	 */
	public static TourismApplicationPayment remove(
			long TourismApplicationPaymentId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationPaymentException {

		return getPersistence().remove(TourismApplicationPaymentId);
	}

	public static TourismApplicationPayment updateImpl(
		TourismApplicationPayment tourismApplicationPayment) {

		return getPersistence().updateImpl(tourismApplicationPayment);
	}

	/**
	 * Returns the tourism application payment with the primary key or throws a <code>NoSuchTourismApplicationPaymentException</code> if it could not be found.
	 *
	 * @param TourismApplicationPaymentId the primary key of the tourism application payment
	 * @return the tourism application payment
	 * @throws NoSuchTourismApplicationPaymentException if a tourism application payment with the primary key could not be found
	 */
	public static TourismApplicationPayment findByPrimaryKey(
			long TourismApplicationPaymentId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationPaymentException {

		return getPersistence().findByPrimaryKey(TourismApplicationPaymentId);
	}

	/**
	 * Returns the tourism application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param TourismApplicationPaymentId the primary key of the tourism application payment
	 * @return the tourism application payment, or <code>null</code> if a tourism application payment with the primary key could not be found
	 */
	public static TourismApplicationPayment fetchByPrimaryKey(
		long TourismApplicationPaymentId) {

		return getPersistence().fetchByPrimaryKey(TourismApplicationPaymentId);
	}

	/**
	 * Returns all the tourism application payments.
	 *
	 * @return the tourism application payments
	 */
	public static List<TourismApplicationPayment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application payments
	 * @param end the upper bound of the range of tourism application payments (not inclusive)
	 * @return the range of tourism application payments
	 */
	public static List<TourismApplicationPayment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application payments
	 * @param end the upper bound of the range of tourism application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism application payments
	 */
	public static List<TourismApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<TourismApplicationPayment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application payments
	 * @param end the upper bound of the range of tourism application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism application payments
	 */
	public static List<TourismApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<TourismApplicationPayment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism application payments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism application payments.
	 *
	 * @return the number of tourism application payments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismApplicationPaymentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismApplicationPaymentPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismApplicationPaymentPersistence _persistence;

}