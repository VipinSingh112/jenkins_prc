/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.miic.application.form.services.model.MiicPayment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the miic payment service. This utility wraps <code>com.nbp.miic.application.form.services.service.persistence.impl.MiicPaymentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicPaymentPersistence
 * @generated
 */
public class MiicPaymentUtil {

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
	public static void clearCache(MiicPayment miicPayment) {
		getPersistence().clearCache(miicPayment);
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
	public static Map<Serializable, MiicPayment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiicPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiicPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiicPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiicPayment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiicPayment update(MiicPayment miicPayment) {
		return getPersistence().update(miicPayment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiicPayment update(
		MiicPayment miicPayment, ServiceContext serviceContext) {

		return getPersistence().update(miicPayment, serviceContext);
	}

	/**
	 * Caches the miic payment in the entity cache if it is enabled.
	 *
	 * @param miicPayment the miic payment
	 */
	public static void cacheResult(MiicPayment miicPayment) {
		getPersistence().cacheResult(miicPayment);
	}

	/**
	 * Caches the miic payments in the entity cache if it is enabled.
	 *
	 * @param miicPayments the miic payments
	 */
	public static void cacheResult(List<MiicPayment> miicPayments) {
		getPersistence().cacheResult(miicPayments);
	}

	/**
	 * Creates a new miic payment with the primary key. Does not add the miic payment to the database.
	 *
	 * @param miicPaymentId the primary key for the new miic payment
	 * @return the new miic payment
	 */
	public static MiicPayment create(long miicPaymentId) {
		return getPersistence().create(miicPaymentId);
	}

	/**
	 * Removes the miic payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicPaymentId the primary key of the miic payment
	 * @return the miic payment that was removed
	 * @throws NoSuchMiicPaymentException if a miic payment with the primary key could not be found
	 */
	public static MiicPayment remove(long miicPaymentId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicPaymentException {

		return getPersistence().remove(miicPaymentId);
	}

	public static MiicPayment updateImpl(MiicPayment miicPayment) {
		return getPersistence().updateImpl(miicPayment);
	}

	/**
	 * Returns the miic payment with the primary key or throws a <code>NoSuchMiicPaymentException</code> if it could not be found.
	 *
	 * @param miicPaymentId the primary key of the miic payment
	 * @return the miic payment
	 * @throws NoSuchMiicPaymentException if a miic payment with the primary key could not be found
	 */
	public static MiicPayment findByPrimaryKey(long miicPaymentId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicPaymentException {

		return getPersistence().findByPrimaryKey(miicPaymentId);
	}

	/**
	 * Returns the miic payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicPaymentId the primary key of the miic payment
	 * @return the miic payment, or <code>null</code> if a miic payment with the primary key could not be found
	 */
	public static MiicPayment fetchByPrimaryKey(long miicPaymentId) {
		return getPersistence().fetchByPrimaryKey(miicPaymentId);
	}

	/**
	 * Returns all the miic payments.
	 *
	 * @return the miic payments
	 */
	public static List<MiicPayment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the miic payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic payments
	 * @param end the upper bound of the range of miic payments (not inclusive)
	 * @return the range of miic payments
	 */
	public static List<MiicPayment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the miic payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic payments
	 * @param end the upper bound of the range of miic payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic payments
	 */
	public static List<MiicPayment> findAll(
		int start, int end, OrderByComparator<MiicPayment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the miic payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic payments
	 * @param end the upper bound of the range of miic payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic payments
	 */
	public static List<MiicPayment> findAll(
		int start, int end, OrderByComparator<MiicPayment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the miic payments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of miic payments.
	 *
	 * @return the number of miic payments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiicPaymentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(MiicPaymentPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile MiicPaymentPersistence _persistence;

}