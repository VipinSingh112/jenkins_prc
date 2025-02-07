/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.medical.facilities.application.form.service.model.MedicalFaciltiesPayment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the medical facilties payment service. This utility wraps <code>com.nbp.medical.facilities.application.form.service.service.persistence.impl.MedicalFaciltiesPaymentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFaciltiesPaymentPersistence
 * @generated
 */
public class MedicalFaciltiesPaymentUtil {

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
		MedicalFaciltiesPayment medicalFaciltiesPayment) {

		getPersistence().clearCache(medicalFaciltiesPayment);
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
	public static Map<Serializable, MedicalFaciltiesPayment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MedicalFaciltiesPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MedicalFaciltiesPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MedicalFaciltiesPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MedicalFaciltiesPayment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MedicalFaciltiesPayment update(
		MedicalFaciltiesPayment medicalFaciltiesPayment) {

		return getPersistence().update(medicalFaciltiesPayment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MedicalFaciltiesPayment update(
		MedicalFaciltiesPayment medicalFaciltiesPayment,
		ServiceContext serviceContext) {

		return getPersistence().update(medicalFaciltiesPayment, serviceContext);
	}

	/**
	 * Returns the medical facilties payment where medicalFacilitiesAppId = &#63; or throws a <code>NoSuchMedicalFaciltiesPaymentException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilties payment
	 * @throws NoSuchMedicalFaciltiesPaymentException if a matching medical facilties payment could not be found
	 */
	public static MedicalFaciltiesPayment findBygetMedicalAppById(
			long medicalFacilitiesAppId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFaciltiesPaymentException {

		return getPersistence().findBygetMedicalAppById(medicalFacilitiesAppId);
	}

	/**
	 * Returns the medical facilties payment where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilties payment, or <code>null</code> if a matching medical facilties payment could not be found
	 */
	public static MedicalFaciltiesPayment fetchBygetMedicalAppById(
		long medicalFacilitiesAppId) {

		return getPersistence().fetchBygetMedicalAppById(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns the medical facilties payment where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilties payment, or <code>null</code> if a matching medical facilties payment could not be found
	 */
	public static MedicalFaciltiesPayment fetchBygetMedicalAppById(
		long medicalFacilitiesAppId, boolean useFinderCache) {

		return getPersistence().fetchBygetMedicalAppById(
			medicalFacilitiesAppId, useFinderCache);
	}

	/**
	 * Removes the medical facilties payment where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the medical facilties payment that was removed
	 */
	public static MedicalFaciltiesPayment removeBygetMedicalAppById(
			long medicalFacilitiesAppId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFaciltiesPaymentException {

		return getPersistence().removeBygetMedicalAppById(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns the number of medical facilties payments where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilties payments
	 */
	public static int countBygetMedicalAppById(long medicalFacilitiesAppId) {
		return getPersistence().countBygetMedicalAppById(
			medicalFacilitiesAppId);
	}

	/**
	 * Caches the medical facilties payment in the entity cache if it is enabled.
	 *
	 * @param medicalFaciltiesPayment the medical facilties payment
	 */
	public static void cacheResult(
		MedicalFaciltiesPayment medicalFaciltiesPayment) {

		getPersistence().cacheResult(medicalFaciltiesPayment);
	}

	/**
	 * Caches the medical facilties payments in the entity cache if it is enabled.
	 *
	 * @param medicalFaciltiesPayments the medical facilties payments
	 */
	public static void cacheResult(
		List<MedicalFaciltiesPayment> medicalFaciltiesPayments) {

		getPersistence().cacheResult(medicalFaciltiesPayments);
	}

	/**
	 * Creates a new medical facilties payment with the primary key. Does not add the medical facilties payment to the database.
	 *
	 * @param medicalFaciltiesPaymentId the primary key for the new medical facilties payment
	 * @return the new medical facilties payment
	 */
	public static MedicalFaciltiesPayment create(
		long medicalFaciltiesPaymentId) {

		return getPersistence().create(medicalFaciltiesPaymentId);
	}

	/**
	 * Removes the medical facilties payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFaciltiesPaymentId the primary key of the medical facilties payment
	 * @return the medical facilties payment that was removed
	 * @throws NoSuchMedicalFaciltiesPaymentException if a medical facilties payment with the primary key could not be found
	 */
	public static MedicalFaciltiesPayment remove(long medicalFaciltiesPaymentId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFaciltiesPaymentException {

		return getPersistence().remove(medicalFaciltiesPaymentId);
	}

	public static MedicalFaciltiesPayment updateImpl(
		MedicalFaciltiesPayment medicalFaciltiesPayment) {

		return getPersistence().updateImpl(medicalFaciltiesPayment);
	}

	/**
	 * Returns the medical facilties payment with the primary key or throws a <code>NoSuchMedicalFaciltiesPaymentException</code> if it could not be found.
	 *
	 * @param medicalFaciltiesPaymentId the primary key of the medical facilties payment
	 * @return the medical facilties payment
	 * @throws NoSuchMedicalFaciltiesPaymentException if a medical facilties payment with the primary key could not be found
	 */
	public static MedicalFaciltiesPayment findByPrimaryKey(
			long medicalFaciltiesPaymentId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFaciltiesPaymentException {

		return getPersistence().findByPrimaryKey(medicalFaciltiesPaymentId);
	}

	/**
	 * Returns the medical facilties payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFaciltiesPaymentId the primary key of the medical facilties payment
	 * @return the medical facilties payment, or <code>null</code> if a medical facilties payment with the primary key could not be found
	 */
	public static MedicalFaciltiesPayment fetchByPrimaryKey(
		long medicalFaciltiesPaymentId) {

		return getPersistence().fetchByPrimaryKey(medicalFaciltiesPaymentId);
	}

	/**
	 * Returns all the medical facilties payments.
	 *
	 * @return the medical facilties payments
	 */
	public static List<MedicalFaciltiesPayment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the medical facilties payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFaciltiesPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilties payments
	 * @param end the upper bound of the range of medical facilties payments (not inclusive)
	 * @return the range of medical facilties payments
	 */
	public static List<MedicalFaciltiesPayment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilties payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFaciltiesPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilties payments
	 * @param end the upper bound of the range of medical facilties payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilties payments
	 */
	public static List<MedicalFaciltiesPayment> findAll(
		int start, int end,
		OrderByComparator<MedicalFaciltiesPayment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilties payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFaciltiesPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilties payments
	 * @param end the upper bound of the range of medical facilties payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilties payments
	 */
	public static List<MedicalFaciltiesPayment> findAll(
		int start, int end,
		OrderByComparator<MedicalFaciltiesPayment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the medical facilties payments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of medical facilties payments.
	 *
	 * @return the number of medical facilties payments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MedicalFaciltiesPaymentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MedicalFaciltiesPaymentPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MedicalFaciltiesPaymentPersistence _persistence;

}