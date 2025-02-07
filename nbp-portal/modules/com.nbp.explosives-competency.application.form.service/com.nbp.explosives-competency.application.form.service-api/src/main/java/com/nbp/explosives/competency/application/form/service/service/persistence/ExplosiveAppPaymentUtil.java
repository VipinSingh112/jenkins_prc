/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.explosives.competency.application.form.service.model.ExplosiveAppPayment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the explosive app payment service. This utility wraps <code>com.nbp.explosives.competency.application.form.service.service.persistence.impl.ExplosiveAppPaymentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveAppPaymentPersistence
 * @generated
 */
public class ExplosiveAppPaymentUtil {

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
	public static void clearCache(ExplosiveAppPayment explosiveAppPayment) {
		getPersistence().clearCache(explosiveAppPayment);
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
	public static Map<Serializable, ExplosiveAppPayment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ExplosiveAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ExplosiveAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ExplosiveAppPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ExplosiveAppPayment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ExplosiveAppPayment update(
		ExplosiveAppPayment explosiveAppPayment) {

		return getPersistence().update(explosiveAppPayment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ExplosiveAppPayment update(
		ExplosiveAppPayment explosiveAppPayment,
		ServiceContext serviceContext) {

		return getPersistence().update(explosiveAppPayment, serviceContext);
	}

	/**
	 * Returns the explosive app payment where explosivesApplicationId = &#63; or throws a <code>NoSuchExplosiveAppPaymentException</code> if it could not be found.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching explosive app payment
	 * @throws NoSuchExplosiveAppPaymentException if a matching explosive app payment could not be found
	 */
	public static ExplosiveAppPayment findBygetExplosiveById(
			long explosivesApplicationId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosiveAppPaymentException {

		return getPersistence().findBygetExplosiveById(explosivesApplicationId);
	}

	/**
	 * Returns the explosive app payment where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching explosive app payment, or <code>null</code> if a matching explosive app payment could not be found
	 */
	public static ExplosiveAppPayment fetchBygetExplosiveById(
		long explosivesApplicationId) {

		return getPersistence().fetchBygetExplosiveById(
			explosivesApplicationId);
	}

	/**
	 * Returns the explosive app payment where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive app payment, or <code>null</code> if a matching explosive app payment could not be found
	 */
	public static ExplosiveAppPayment fetchBygetExplosiveById(
		long explosivesApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetExplosiveById(
			explosivesApplicationId, useFinderCache);
	}

	/**
	 * Removes the explosive app payment where explosivesApplicationId = &#63; from the database.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the explosive app payment that was removed
	 */
	public static ExplosiveAppPayment removeBygetExplosiveById(
			long explosivesApplicationId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosiveAppPaymentException {

		return getPersistence().removeBygetExplosiveById(
			explosivesApplicationId);
	}

	/**
	 * Returns the number of explosive app payments where explosivesApplicationId = &#63;.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the number of matching explosive app payments
	 */
	public static int countBygetExplosiveById(long explosivesApplicationId) {
		return getPersistence().countBygetExplosiveById(
			explosivesApplicationId);
	}

	/**
	 * Caches the explosive app payment in the entity cache if it is enabled.
	 *
	 * @param explosiveAppPayment the explosive app payment
	 */
	public static void cacheResult(ExplosiveAppPayment explosiveAppPayment) {
		getPersistence().cacheResult(explosiveAppPayment);
	}

	/**
	 * Caches the explosive app payments in the entity cache if it is enabled.
	 *
	 * @param explosiveAppPayments the explosive app payments
	 */
	public static void cacheResult(
		List<ExplosiveAppPayment> explosiveAppPayments) {

		getPersistence().cacheResult(explosiveAppPayments);
	}

	/**
	 * Creates a new explosive app payment with the primary key. Does not add the explosive app payment to the database.
	 *
	 * @param explosiveAppPaymentId the primary key for the new explosive app payment
	 * @return the new explosive app payment
	 */
	public static ExplosiveAppPayment create(long explosiveAppPaymentId) {
		return getPersistence().create(explosiveAppPaymentId);
	}

	/**
	 * Removes the explosive app payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param explosiveAppPaymentId the primary key of the explosive app payment
	 * @return the explosive app payment that was removed
	 * @throws NoSuchExplosiveAppPaymentException if a explosive app payment with the primary key could not be found
	 */
	public static ExplosiveAppPayment remove(long explosiveAppPaymentId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosiveAppPaymentException {

		return getPersistence().remove(explosiveAppPaymentId);
	}

	public static ExplosiveAppPayment updateImpl(
		ExplosiveAppPayment explosiveAppPayment) {

		return getPersistence().updateImpl(explosiveAppPayment);
	}

	/**
	 * Returns the explosive app payment with the primary key or throws a <code>NoSuchExplosiveAppPaymentException</code> if it could not be found.
	 *
	 * @param explosiveAppPaymentId the primary key of the explosive app payment
	 * @return the explosive app payment
	 * @throws NoSuchExplosiveAppPaymentException if a explosive app payment with the primary key could not be found
	 */
	public static ExplosiveAppPayment findByPrimaryKey(
			long explosiveAppPaymentId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosiveAppPaymentException {

		return getPersistence().findByPrimaryKey(explosiveAppPaymentId);
	}

	/**
	 * Returns the explosive app payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param explosiveAppPaymentId the primary key of the explosive app payment
	 * @return the explosive app payment, or <code>null</code> if a explosive app payment with the primary key could not be found
	 */
	public static ExplosiveAppPayment fetchByPrimaryKey(
		long explosiveAppPaymentId) {

		return getPersistence().fetchByPrimaryKey(explosiveAppPaymentId);
	}

	/**
	 * Returns all the explosive app payments.
	 *
	 * @return the explosive app payments
	 */
	public static List<ExplosiveAppPayment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the explosive app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive app payments
	 * @param end the upper bound of the range of explosive app payments (not inclusive)
	 * @return the range of explosive app payments
	 */
	public static List<ExplosiveAppPayment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the explosive app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive app payments
	 * @param end the upper bound of the range of explosive app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of explosive app payments
	 */
	public static List<ExplosiveAppPayment> findAll(
		int start, int end,
		OrderByComparator<ExplosiveAppPayment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosive app payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveAppPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive app payments
	 * @param end the upper bound of the range of explosive app payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of explosive app payments
	 */
	public static List<ExplosiveAppPayment> findAll(
		int start, int end,
		OrderByComparator<ExplosiveAppPayment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the explosive app payments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of explosive app payments.
	 *
	 * @return the number of explosive app payments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ExplosiveAppPaymentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		ExplosiveAppPaymentPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile ExplosiveAppPaymentPersistence _persistence;

}